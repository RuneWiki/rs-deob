package org.bouncycastle.crypto.tls;

import java.io.IOException;
import java.util.Hashtable;
import java.util.Vector;

public interface TlsClient extends TlsPeer {

    TlsKeyExchange getKeyExchange() throws IOException;

    TlsSession getSessionToResume();

    void processServerExtensions(Hashtable arg0) throws IOException;

    TlsAuthentication getAuthentication() throws IOException;

    boolean isFallback();

    void init(TlsClientContext arg0);

    Hashtable getClientExtensions() throws IOException;

    void notifyServerVersion(ProtocolVersion arg0) throws IOException;

    void notifySelectedCipherSuite(int arg0);

    void notifySelectedCompressionMethod(short arg0);

    void notifySessionID(byte[] arg0);

    void processServerSupplementalData(Vector arg0) throws IOException;

    short[] getCompressionMethods();

    ProtocolVersion getClientVersion();

    Vector getClientSupplementalData() throws IOException;

    void notifyNewSessionTicket(NewSessionTicket arg0) throws IOException;

    ProtocolVersion getClientHelloRecordLayerVersion();

    int[] getCipherSuites();
}
