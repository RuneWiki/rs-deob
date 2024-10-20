package org.bouncycastle.crypto.tls;

import java.io.IOException;
import java.util.Hashtable;
import java.util.Vector;

public interface TlsClient extends TlsPeer {

    void notifyNewSessionTicket(NewSessionTicket arg0) throws IOException;

    void notifySessionID(byte[] arg0);

    ProtocolVersion getClientVersion();

    Vector getClientSupplementalData() throws IOException;

    int[] getCipherSuites();

    short[] getCompressionMethods();

    Hashtable getClientExtensions() throws IOException;

    void notifyServerVersion(ProtocolVersion arg0) throws IOException;

    TlsSession getSessionToResume();

    ProtocolVersion getClientHelloRecordLayerVersion();

    void notifySelectedCompressionMethod(short arg0);

    void processServerExtensions(Hashtable arg0) throws IOException;

    void processServerSupplementalData(Vector arg0) throws IOException;

    TlsKeyExchange getKeyExchange() throws IOException;

    TlsAuthentication getAuthentication() throws IOException;

    void notifySelectedCipherSuite(int arg0);

    boolean isFallback();

    void init(TlsClientContext arg0);
}
