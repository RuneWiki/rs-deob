package org.bouncycastle.crypto.tls;

import java.io.IOException;
import java.util.Hashtable;
import java.util.Vector;

public interface TlsClient extends TlsPeer {

    void processServerExtensions(Hashtable arg0) throws IOException;

    ProtocolVersion getClientHelloRecordLayerVersion();

    ProtocolVersion getClientVersion();

    Hashtable getClientExtensions() throws IOException;

    boolean isFallback();

    void init(TlsClientContext arg0);

    void notifyServerVersion(ProtocolVersion arg0) throws IOException;

    void notifySessionID(byte[] arg0);

    void notifySelectedCipherSuite(int arg0);

    void notifySelectedCompressionMethod(short arg0);

    TlsSession getSessionToResume();

    void processServerSupplementalData(Vector arg0) throws IOException;

    TlsKeyExchange getKeyExchange() throws IOException;

    short[] getCompressionMethods();

    Vector getClientSupplementalData() throws IOException;

    void notifyNewSessionTicket(NewSessionTicket arg0) throws IOException;

    TlsAuthentication getAuthentication() throws IOException;

    int[] getCipherSuites();
}
