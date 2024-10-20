package org.bouncycastle.crypto.tls;

import java.io.IOException;
import java.util.Hashtable;
import java.util.Vector;

public interface TlsClient extends TlsPeer {

    void notifyNewSessionTicket(NewSessionTicket arg0) throws IOException;

    int[] getCipherSuites();

    ProtocolVersion getClientHelloRecordLayerVersion();

    ProtocolVersion getClientVersion();

    boolean isFallback();

    short[] getCompressionMethods();

    Hashtable getClientExtensions() throws IOException;

    void notifyServerVersion(ProtocolVersion arg0) throws IOException;

    TlsSession getSessionToResume();

    void notifySelectedCompressionMethod(short arg0);

    void processServerExtensions(Hashtable arg0) throws IOException;

    void processServerSupplementalData(Vector arg0) throws IOException;

    TlsKeyExchange getKeyExchange() throws IOException;

    Vector getClientSupplementalData() throws IOException;

    void notifySessionID(byte[] arg0);

    TlsAuthentication getAuthentication() throws IOException;

    void notifySelectedCipherSuite(int arg0);

    void init(TlsClientContext arg0);
}
