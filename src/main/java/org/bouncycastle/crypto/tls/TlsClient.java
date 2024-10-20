package org.bouncycastle.crypto.tls;

import java.io.IOException;
import java.util.Hashtable;
import java.util.Vector;

public interface TlsClient extends TlsPeer {

    void notifyNewSessionTicket(NewSessionTicket arg0) throws IOException;

    ProtocolVersion getClientHelloRecordLayerVersion();

    ProtocolVersion getClientVersion();

    int[] getCipherSuites();

    short[] getCompressionMethods();

    void notifySelectedCipherSuite(int arg0);

    void notifyServerVersion(ProtocolVersion arg0) throws IOException;

    boolean isFallback();

    void init(TlsClientContext arg0);

    void notifySelectedCompressionMethod(short arg0);

    void processServerExtensions(Hashtable arg0) throws IOException;

    void processServerSupplementalData(Vector arg0) throws IOException;

    TlsKeyExchange getKeyExchange() throws IOException;

    TlsAuthentication getAuthentication() throws IOException;

    Vector getClientSupplementalData() throws IOException;

    Hashtable getClientExtensions() throws IOException;

    TlsSession getSessionToResume();

    void notifySessionID(byte[] arg0);
}
