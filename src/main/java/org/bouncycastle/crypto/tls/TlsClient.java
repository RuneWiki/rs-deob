package org.bouncycastle.crypto.tls;

import java.io.IOException;
import java.util.Hashtable;
import java.util.Vector;

public interface TlsClient extends TlsPeer {

    ProtocolVersion getClientHelloRecordLayerVersion();

    void notifySessionID(byte[] arg0);

    Vector getClientSupplementalData() throws IOException;

    boolean isFallback();

    TlsSession getSessionToResume();

    short[] getCompressionMethods();

    Hashtable getClientExtensions() throws IOException;

    void notifyServerVersion(ProtocolVersion arg0) throws IOException;

    void init(TlsClientContext arg0);

    void notifySelectedCompressionMethod(short arg0);

    void processServerExtensions(Hashtable arg0) throws IOException;

    void processServerSupplementalData(Vector arg0) throws IOException;

    TlsKeyExchange getKeyExchange() throws IOException;

    TlsAuthentication getAuthentication() throws IOException;

    ProtocolVersion getClientVersion();

    void notifyNewSessionTicket(NewSessionTicket arg0) throws IOException;

    int[] getCipherSuites();

    void notifySelectedCipherSuite(int arg0);
}
