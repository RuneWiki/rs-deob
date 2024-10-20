package org.bouncycastle.crypto.tls;

import java.io.IOException;
import java.util.Hashtable;
import java.util.Vector;

public interface TlsClient extends TlsPeer {

    TlsSession getSessionToResume();

    ProtocolVersion getClientHelloRecordLayerVersion();

    ProtocolVersion getClientVersion();

    boolean isFallback();

    void processServerSupplementalData(Vector arg0) throws IOException;

    short[] getCompressionMethods();

    Hashtable getClientExtensions() throws IOException;

    void notifyServerVersion(ProtocolVersion arg0) throws IOException;

    void notifySelectedCipherSuite(int arg0);

    void notifySelectedCompressionMethod(short arg0);

    void notifySessionID(byte[] arg0);

    void processServerExtensions(Hashtable arg0) throws IOException;

    TlsKeyExchange getKeyExchange() throws IOException;

    void init(TlsClientContext arg0);

    Vector getClientSupplementalData() throws IOException;

    void notifyNewSessionTicket(NewSessionTicket arg0) throws IOException;

    TlsAuthentication getAuthentication() throws IOException;

    int[] getCipherSuites();
}
