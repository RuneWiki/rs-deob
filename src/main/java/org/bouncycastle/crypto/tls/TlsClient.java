package org.bouncycastle.crypto.tls;

import java.io.IOException;
import java.util.Hashtable;
import java.util.Vector;

public interface TlsClient extends TlsPeer {

    Vector getClientSupplementalData() throws IOException;

    TlsSession getSessionToResume();

    void notifyServerVersion(ProtocolVersion arg0) throws IOException;

    ProtocolVersion getClientVersion();

    boolean isFallback();

    ProtocolVersion getClientHelloRecordLayerVersion();

    short[] getCompressionMethods();

    Hashtable getClientExtensions() throws IOException;

    void processServerExtensions(Hashtable arg0) throws IOException;

    int[] getCipherSuites();

    void notifySelectedCipherSuite(int arg0);

    void notifySessionID(byte[] arg0);

    void init(TlsClientContext arg0);

    void processServerSupplementalData(Vector arg0) throws IOException;

    TlsKeyExchange getKeyExchange() throws IOException;

    TlsAuthentication getAuthentication() throws IOException;

    void notifyNewSessionTicket(NewSessionTicket arg0) throws IOException;

    void notifySelectedCompressionMethod(short arg0);
}
