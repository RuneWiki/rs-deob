package org.bouncycastle.crypto.tls;

import java.io.IOException;
import java.util.Hashtable;
import java.util.Vector;

public interface TlsClient extends TlsPeer {

    TlsKeyExchange getKeyExchange() throws IOException;

    TlsSession getSessionToResume();

    ProtocolVersion getClientVersion();

    Hashtable getClientExtensions() throws IOException;

    void processServerExtensions(Hashtable arg0) throws IOException;

    int[] getCipherSuites();

    short[] getCompressionMethods();

    void notifySelectedCompressionMethod(short arg0);

    void notifyServerVersion(ProtocolVersion arg0) throws IOException;

    void notifySessionID(byte[] arg0);

    void notifySelectedCipherSuite(int arg0);

    boolean isFallback();

    ProtocolVersion getClientHelloRecordLayerVersion();

    void processServerSupplementalData(Vector arg0) throws IOException;

    void init(TlsClientContext arg0);

    TlsAuthentication getAuthentication() throws IOException;

    Vector getClientSupplementalData() throws IOException;

    void notifyNewSessionTicket(NewSessionTicket arg0) throws IOException;
}
