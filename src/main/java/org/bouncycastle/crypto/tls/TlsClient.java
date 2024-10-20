package org.bouncycastle.crypto.tls;

import java.io.IOException;
import java.util.Hashtable;
import java.util.Vector;

public interface TlsClient extends TlsPeer {

    void processServerExtensions(Hashtable arg0) throws IOException;

    void init(TlsClientContext arg0);

    ProtocolVersion getClientHelloRecordLayerVersion();

    ProtocolVersion getClientVersion();

    void processServerSupplementalData(Vector arg0) throws IOException;

    void notifySessionID(byte[] arg0);

    TlsSession getSessionToResume();

    Hashtable getClientExtensions() throws IOException;

    void notifyServerVersion(ProtocolVersion arg0) throws IOException;

    short[] getCompressionMethods();

    void notifySelectedCipherSuite(int arg0);

    void notifySelectedCompressionMethod(short arg0);

    int[] getCipherSuites();

    boolean isFallback();

    TlsKeyExchange getKeyExchange() throws IOException;

    TlsAuthentication getAuthentication() throws IOException;

    Vector getClientSupplementalData() throws IOException;

    void notifyNewSessionTicket(NewSessionTicket arg0) throws IOException;
}
