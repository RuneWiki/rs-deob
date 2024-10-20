package org.bouncycastle.crypto.tls;

import java.io.IOException;
import java.util.Hashtable;
import java.util.Vector;

public interface TlsClient extends TlsPeer {

    ProtocolVersion getClientHelloRecordLayerVersion();

    Vector getClientSupplementalData() throws IOException;

    ProtocolVersion getClientVersion();

    boolean isFallback();

    int[] getCipherSuites();

    short[] getCompressionMethods();

    Hashtable getClientExtensions() throws IOException;

    void notifySessionID(byte[] arg0);

    void notifySelectedCipherSuite(int arg0);

    void notifyServerVersion(ProtocolVersion arg0) throws IOException;

    void processServerExtensions(Hashtable arg0) throws IOException;

    void init(TlsClientContext arg0);

    TlsKeyExchange getKeyExchange() throws IOException;

    TlsAuthentication getAuthentication() throws IOException;

    void notifySelectedCompressionMethod(short arg0);

    void notifyNewSessionTicket(NewSessionTicket arg0) throws IOException;

    void processServerSupplementalData(Vector arg0) throws IOException;

    TlsSession getSessionToResume();
}
