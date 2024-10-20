package org.bouncycastle.crypto.tls;

import java.io.IOException;
import java.util.Hashtable;
import java.util.Vector;

public interface TlsClient extends TlsPeer {

    Vector getClientSupplementalData() throws IOException;

    void init(TlsClientContext arg0);

    boolean isFallback();

    int[] getCipherSuites();

    short[] getCompressionMethods();

    ProtocolVersion getClientVersion();

    void notifyServerVersion(ProtocolVersion arg0) throws IOException;

    void notifySessionID(byte[] arg0);

    void notifySelectedCipherSuite(int arg0);

    ProtocolVersion getClientHelloRecordLayerVersion();

    void processServerExtensions(Hashtable arg0) throws IOException;

    void processServerSupplementalData(Vector arg0) throws IOException;

    TlsKeyExchange getKeyExchange() throws IOException;

    TlsAuthentication getAuthentication() throws IOException;

    TlsSession getSessionToResume();

    void notifyNewSessionTicket(NewSessionTicket arg0) throws IOException;

    Hashtable getClientExtensions() throws IOException;

    void notifySelectedCompressionMethod(short arg0);
}
