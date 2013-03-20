package net;

import java.io.IOException;
import java.util.TimerTask;

/**
 * �����
 * @author lvbo
 *
 */
public class Server {

	private static final Server INSTANCE = new Server();
	
	private NIOProcessor[] processors;
    private NIOConnector connector;
    private NIOAcceptor server;
	
	public static final Server getInstance() {
        return INSTANCE;
    }
	
	private Server() {}
	
	/**
	 * ����һЩԤ��������
	 * @param dateFormat
	 */
	public void beforeStart(String dateFormat) {}
	
	/**
	 * ��������
	 * @throws IOException
	 */
	public void startup() throws IOException {}

	public NIOProcessor[] getProcessors() {
		return processors;
	}

	public void setProcessors(NIOProcessor[] processors) {
		this.processors = processors;
	}

	public NIOConnector getConnector() {
		return connector;
	}

	public void setConnector(NIOConnector connector) {
		this.connector = connector;
	}

	public NIOAcceptor getServer() {
		return server;
	}

	public void setServer(NIOAcceptor server) {
		this.server = server;
	}
	
	/**
	 * ���ݽڵ㶨ʱ���ӿ��г�ʱ�������
	 * @return
	 */
	private TimerTask dataNodeIdleCheck() {}
	
	/**
	 * ��ʱ�������
	 * @return
	 */
	private TimerTask dataNodeHeartbeat() {}
	
	
}
