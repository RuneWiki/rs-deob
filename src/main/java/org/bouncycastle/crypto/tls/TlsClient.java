package org.bouncycastle.crypto.tls;

import java.io.IOException;
import java.util.Hashtable;
import java.util.Vector;

public interface TlsClient extends TlsPeer {

    boolean isFallback();

    short[] getCompressionMethods();

    ProtocolVersion getClientHelloRecordLayerVersion();

    ProtocolVersion getClientVersion();

    void notifyServerVersion(ProtocolVersion arg0) throws IOException;

    void processServerExtensions(Hashtable arg0) throws IOException;

    Hashtable getClientExtensions() throws IOException;

    TlsSession getSessionToResume();

    void notifySessionID(byte[] arg0);

    void notifySelectedCipherSuite(int arg0);

    void notifySelectedCompressionMethod(short arg0);

    TlsKeyExchange getKeyExchange() throws IOException;

    void processServerSupplementalData(Vector arg0) throws IOException;

    TlsAuthentication getAuthentication() throws IOException;

    Vector getClientSupplementalData() throws IOException;

    void notifyNewSessionTicket(NewSessionTicket arg0) throws IOException;

    int[] getCipherSuites();

    void init(TlsClientContext arg0);
}
