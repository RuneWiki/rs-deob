package org.bouncycastle.crypto.tls;

import java.io.IOException;
import java.util.Hashtable;
import java.util.Vector;

public interface TlsClient extends TlsPeer {

	Vector getClientSupplementalData() throws IOException;

	void notifySelectedCompressionMethod(short arg0);

	ProtocolVersion getClientHelloRecordLayerVersion();

	ProtocolVersion getClientVersion();

	boolean isFallback();

	int[] getCipherSuites();

	short[] getCompressionMethods();

	void notifyServerVersion(ProtocolVersion arg0) throws IOException;

	void notifySessionID(byte[] arg0);

	void init(TlsClientContext arg0);

	Hashtable getClientExtensions() throws IOException;

	void notifySelectedCipherSuite(int arg0);

	void processServerSupplementalData(Vector arg0) throws IOException;

	TlsKeyExchange getKeyExchange() throws IOException;

	TlsAuthentication getAuthentication() throws IOException;

	void notifyNewSessionTicket(NewSessionTicket arg0) throws IOException;

	void processServerExtensions(Hashtable arg0) throws IOException;

	TlsSession getSessionToResume();
}
