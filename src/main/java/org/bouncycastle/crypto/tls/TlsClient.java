package org.bouncycastle.crypto.tls;

import java.io.IOException;
import java.util.Hashtable;
import java.util.Vector;

public interface TlsClient extends TlsPeer {

    boolean isFallback();

    TlsSession getSessionToResume();

    ProtocolVersion getClientHelloRecordLayerVersion();

    ProtocolVersion getClientVersion();

    void notifySelectedCipherSuite(int arg0);

    int[] getCipherSuites();

    Hashtable getClientExtensions() throws IOException;

    void notifyNewSessionTicket(NewSessionTicket arg0) throws IOException;

    void notifyServerVersion(ProtocolVersion arg0) throws IOException;

    void notifySessionID(byte[] arg0);

    void notifySelectedCompressionMethod(short arg0);

    void processServerExtensions(Hashtable arg0) throws IOException;

    void processServerSupplementalData(Vector arg0) throws IOException;

    TlsKeyExchange getKeyExchange() throws IOException;

    TlsAuthentication getAuthentication() throws IOException;

    Vector getClientSupplementalData() throws IOException;

    short[] getCompressionMethods();

    void init(TlsClientContext arg0);
}
