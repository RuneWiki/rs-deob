package org.bouncycastle.crypto.tls;

import java.io.IOException;
import java.util.Hashtable;
import java.util.Vector;

public interface TlsClient extends TlsPeer {

    TlsSession getSessionToResume();

    ProtocolVersion getClientHelloRecordLayerVersion();

    ProtocolVersion getClientVersion();

    Hashtable getClientExtensions() throws IOException;

    void notifySelectedCipherSuite(int arg0);

    short[] getCompressionMethods();

    void processServerExtensions(Hashtable arg0) throws IOException;

    void notifyServerVersion(ProtocolVersion arg0) throws IOException;

    void notifySessionID(byte[] arg0);

    boolean isFallback();

    void processServerSupplementalData(Vector arg0) throws IOException;

    int[] getCipherSuites();

    TlsAuthentication getAuthentication() throws IOException;

    TlsKeyExchange getKeyExchange() throws IOException;

    Vector getClientSupplementalData() throws IOException;

    void notifyNewSessionTicket(NewSessionTicket arg0) throws IOException;

    void notifySelectedCompressionMethod(short arg0);

    void init(TlsClientContext arg0);
}
