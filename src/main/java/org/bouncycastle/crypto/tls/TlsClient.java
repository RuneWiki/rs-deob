package org.bouncycastle.crypto.tls;

import java.io.IOException;
import java.util.Hashtable;
import java.util.Vector;

public interface TlsClient extends TlsPeer {

    void processServerExtensions(Hashtable arg0) throws IOException;

    Hashtable getClientExtensions() throws IOException;

    ProtocolVersion getClientHelloRecordLayerVersion();

    TlsSession getSessionToResume();

    boolean isFallback();

    void init(TlsClientContext arg0);

    short[] getCompressionMethods();

    void notifyNewSessionTicket(NewSessionTicket arg0) throws IOException;

    void notifyServerVersion(ProtocolVersion arg0) throws IOException;

    void notifySessionID(byte[] arg0);

    void notifySelectedCipherSuite(int arg0);

    void notifySelectedCompressionMethod(short arg0);

    void processServerSupplementalData(Vector arg0) throws IOException;

    TlsKeyExchange getKeyExchange() throws IOException;

    TlsAuthentication getAuthentication() throws IOException;

    int[] getCipherSuites();

    Vector getClientSupplementalData() throws IOException;

    ProtocolVersion getClientVersion();
}
