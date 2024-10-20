package org.bouncycastle.crypto.tls;

import java.io.IOException;
import java.util.Hashtable;
import java.util.Vector;

public interface TlsClient extends TlsPeer {

    TlsKeyExchange getKeyExchange() throws IOException;

    void init(TlsClientContext arg0);

    void notifySelectedCompressionMethod(short arg0);

    boolean isFallback();

    TlsSession getSessionToResume();

    Vector getClientSupplementalData() throws IOException;

    Hashtable getClientExtensions() throws IOException;

    void notifyServerVersion(ProtocolVersion arg0) throws IOException;

    void notifySessionID(byte[] arg0);

    void notifySelectedCipherSuite(int arg0);

    void processServerExtensions(Hashtable arg0) throws IOException;

    void processServerSupplementalData(Vector arg0) throws IOException;

    TlsAuthentication getAuthentication() throws IOException;

    ProtocolVersion getClientHelloRecordLayerVersion();

    void notifyNewSessionTicket(NewSessionTicket arg0) throws IOException;

    int[] getCipherSuites();

    short[] getCompressionMethods();

    ProtocolVersion getClientVersion();
}
