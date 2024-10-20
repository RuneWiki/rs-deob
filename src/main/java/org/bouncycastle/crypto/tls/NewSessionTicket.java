package org.bouncycastle.crypto.tls;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class NewSessionTicket {

    public long ticketLifetimeHint;

    public byte[] ticket;

    public long getTicketLifetimeHint() {
        return this.ticketLifetimeHint;
    }

    public void encode(OutputStream arg0) throws IOException {
        TlsUtils.writeUint32(this.ticketLifetimeHint, arg0);
        TlsUtils.writeOpaque16(this.ticket, arg0);
    }

    public byte[] getTicket() {
        return this.ticket;
    }

    public NewSessionTicket(long arg0, byte[] arg1) {
        this.ticketLifetimeHint = arg0;
        this.ticket = arg1;
    }

    public static NewSessionTicket parse(InputStream arg0) throws IOException {
        long var1 = TlsUtils.readUint32(arg0);
        byte[] var3 = TlsUtils.readOpaque16(arg0);
        return new NewSessionTicket(var1, var3);
    }
}
