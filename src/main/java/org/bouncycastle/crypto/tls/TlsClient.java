package org.bouncycastle.crypto.tls;

import java.io.IOException;
import java.util.Hashtable;
import java.util.Vector;

public interface TlsClient extends TlsPeer {

    void notifySessionID(byte[] arg0);

    void notifySelectedCompressionMethod(short arg0);

    boolean isFallback();

    int[] getCipherSuites();

    short[] getCompressionMethods();

    Hashtable getClientExtensions() throws IOException;

    void notifyServerVersion(ProtocolVersion arg0) throws IOException;

    void notifyNewSessionTicket(NewSessionTicket arg0) throws IOException;

    void notifySelectedCipherSuite(int arg0);

    void processServerExtensions(Hashtable arg0) throws IOException;

    ProtocolVersion getClientHelloRecordLayerVersion();

    TlsKeyExchange getKeyExchange() throws IOException;

    TlsAuthentication getAuthentication() throws IOException;

    Vector getClientSupplementalData() throws IOException;

    TlsSession getSessionToResume();

    ProtocolVersion getClientVersion();

    void processServerSupplementalData(Vector arg0) throws IOException;

    void init(TlsClientContext arg0);
}
