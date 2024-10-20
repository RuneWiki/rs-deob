package org.bouncycastle.crypto.tls;

import java.io.IOException;
import java.util.Hashtable;
import java.util.Vector;

public interface TlsClient extends TlsPeer {

    TlsSession getSessionToResume();

    ProtocolVersion getClientHelloRecordLayerVersion();

    ProtocolVersion getClientVersion();

    boolean isFallback();

    int[] getCipherSuites();

    short[] getCompressionMethods();

    Hashtable getClientExtensions() throws IOException;

    void notifyNewSessionTicket(NewSessionTicket arg0) throws IOException;

    void notifySessionID(byte[] arg0);

    void notifySelectedCipherSuite(int arg0);

    void processServerExtensions(Hashtable arg0) throws IOException;

    TlsKeyExchange getKeyExchange() throws IOException;

    void processServerSupplementalData(Vector arg0) throws IOException;

    Vector getClientSupplementalData() throws IOException;

    void notifySelectedCompressionMethod(short arg0);

    void init(TlsClientContext arg0);

    TlsAuthentication getAuthentication() throws IOException;

    void notifyServerVersion(ProtocolVersion arg0) throws IOException;
}
