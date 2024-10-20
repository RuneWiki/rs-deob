package org.bouncycastle.crypto.tls;

import java.io.IOException;
import java.util.Hashtable;
import java.util.Vector;

public interface TlsClient extends TlsPeer {

    Hashtable getClientExtensions() throws IOException;

    TlsSession getSessionToResume();

    int[] getCipherSuites();

    ProtocolVersion getClientVersion();

    boolean isFallback();

    Vector getClientSupplementalData() throws IOException;

    short[] getCompressionMethods();

    void init(TlsClientContext arg0);

    void notifySessionID(byte[] arg0);

    void notifySelectedCipherSuite(int arg0);

    void notifySelectedCompressionMethod(short arg0);

    void processServerExtensions(Hashtable arg0) throws IOException;

    void processServerSupplementalData(Vector arg0) throws IOException;

    TlsKeyExchange getKeyExchange() throws IOException;

    ProtocolVersion getClientHelloRecordLayerVersion();

    void notifyServerVersion(ProtocolVersion arg0) throws IOException;

    TlsAuthentication getAuthentication() throws IOException;

    void notifyNewSessionTicket(NewSessionTicket arg0) throws IOException;
}
