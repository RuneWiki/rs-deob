package org.bouncycastle.crypto.tls;

import java.io.IOException;
import java.util.Hashtable;
import java.util.Vector;

public interface TlsClient extends TlsPeer {

    void processServerExtensions(Hashtable arg0) throws IOException;

    ProtocolVersion getClientHelloRecordLayerVersion();

    ProtocolVersion getClientVersion();

    TlsAuthentication getAuthentication() throws IOException;

    int[] getCipherSuites();

    short[] getCompressionMethods();

    boolean isFallback();

    void notifyServerVersion(ProtocolVersion arg0) throws IOException;

    void notifySessionID(byte[] arg0);

    void notifySelectedCipherSuite(int arg0);

    Hashtable getClientExtensions() throws IOException;

    void init(TlsClientContext arg0);

    void processServerSupplementalData(Vector arg0) throws IOException;

    TlsKeyExchange getKeyExchange() throws IOException;

    TlsSession getSessionToResume();

    void notifySelectedCompressionMethod(short arg0);

    void notifyNewSessionTicket(NewSessionTicket arg0) throws IOException;

    Vector getClientSupplementalData() throws IOException;
}
