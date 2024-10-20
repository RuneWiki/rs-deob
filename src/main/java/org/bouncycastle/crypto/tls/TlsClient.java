package org.bouncycastle.crypto.tls;

import java.io.IOException;
import java.util.Hashtable;
import java.util.Vector;

public interface TlsClient extends TlsPeer {

    void init(TlsClientContext arg0);

    ProtocolVersion getClientHelloRecordLayerVersion();

    TlsSession getSessionToResume();

    boolean isFallback();

    ProtocolVersion getClientVersion();

    void notifySessionID(byte[] arg0);

    short[] getCompressionMethods();

    void notifyServerVersion(ProtocolVersion arg0) throws IOException;

    void notifySelectedCipherSuite(int arg0);

    void notifySelectedCompressionMethod(short arg0);

    void processServerSupplementalData(Vector arg0) throws IOException;

    TlsKeyExchange getKeyExchange() throws IOException;

    TlsAuthentication getAuthentication() throws IOException;

    Vector getClientSupplementalData() throws IOException;

    void notifyNewSessionTicket(NewSessionTicket arg0) throws IOException;

    int[] getCipherSuites();

    void processServerExtensions(Hashtable arg0) throws IOException;

    Hashtable getClientExtensions() throws IOException;
}
