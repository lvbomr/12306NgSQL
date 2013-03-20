package net.connection;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.Selector;

/**
 * �������Ӳ����ӿ�
 * @author lvbo
 *
 */
public interface NIOConnection {

	/**
	 * ע�������¼�
	 * @param selector
	 * @throws IOException
	 */
    void register(Selector selector) throws IOException;

    /**
     * ��ȡ����
     * @throws IOException
     */
    void read() throws IOException;

    /**
     * ��������
     * @param data
     */
    void handle(byte[] data);

    /**
     * д��һ�黺������
     * @param buffer
     */
    void write(ByteBuffer buffer);

    /**
     * ���ڴ��������еķ�ʽд����
     * @throws IOException
     */
    void writeByQueue() throws IOException;

    /**
     * ���ڼ����¼��ķ�ʽд����
     * @throws IOException
     */
    void writeByEvent() throws IOException;

    /**
     * ��������
     * @param errCode
     * @param t
     */
    void error(int errCode, Throwable t);

    /**
     * �ر�����
     * @return
     */
    boolean close();
}
