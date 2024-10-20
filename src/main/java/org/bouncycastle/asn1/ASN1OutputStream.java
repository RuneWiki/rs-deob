package org.bouncycastle.asn1;

import java.io.IOException;
import java.io.OutputStream;

public class ASN1OutputStream {

    public OutputStream os;

    public void writeImplicitObject(ASN1Primitive arg0) throws IOException {
        if (arg0 == null) {
            throw new IOException("null object detected");
        }
        arg0.encode(new ASN1OutputStream.ImplicitOutStream(this.os));
    }

    public void writeLength(int arg0) throws IOException {
        if (arg0 <= 127) {
            this.write((byte) arg0);
            return;
        }
        int var2 = 1;
        int var3 = arg0;
        while ((var3 >>>= 0x8) != 0) {
            var2++;
        }
        this.write((byte) (var2 | 0x80));
        for (int var4 = (var2 - 1) * 8; var4 >= 0; var4 -= 8) {
            this.write((byte) (arg0 >> var4));
        }
    }

    public ASN1OutputStream(OutputStream arg0) {
        this.os = arg0;
    }

    public void write(int arg0) throws IOException {
        this.os.write(arg0);
    }

    public void write(byte[] arg0, int arg1, int arg2) throws IOException {
        this.os.write(arg0, arg1, arg2);
    }

    public void writeEncoded(int arg0, byte[] arg1) throws IOException {
        this.write(arg0);
        this.writeLength(arg1.length);
        this.write(arg1);
    }

    public void writeTag(int arg0, int arg1) throws IOException {
        if (arg1 < 31) {
            this.write(arg0 | arg1);
            return;
        }
        this.write(arg0 | 0x1F);
        if (arg1 < 128) {
            this.write(arg1);
            return;
        }
        byte[] var3 = new byte[5];
        int var4 = var3.length;
        var4--;
        var3[var4] = (byte) (arg1 & 0x7F);
        do {
            arg1 >>= 0x7;
            var4--;
            var3[var4] = (byte) (arg1 & 0x7F | 0x80);
        } while (arg1 > 127);
        this.write(var3, var4, var3.length - var4);
    }

    public void writeEncoded(int arg0, int arg1, byte[] arg2) throws IOException {
        this.writeTag(arg0, arg1);
        this.writeLength(arg2.length);
        this.write(arg2);
    }

    public void writeNull() throws IOException {
        this.os.write(5);
        this.os.write(0);
    }

    public void writeObject(ASN1Encodable arg0) throws IOException {
        if (arg0 == null) {
            throw new IOException("null object detected");
        }
        arg0.toASN1Primitive().encode(this);
    }

    public ASN1OutputStream getDLSubStream() {
        return new DLOutputStream(this.os);
    }

    public void close() throws IOException {
        this.os.close();
    }

    public void flush() throws IOException {
        this.os.flush();
    }

    public void write(byte[] arg0) throws IOException {
        this.os.write(arg0);
    }

    public ASN1OutputStream getDERSubStream() {
        return new DEROutputStream(this.os);
    }

    class ImplicitOutStream extends ASN1OutputStream {

        public boolean first = true;

        public ImplicitOutStream(OutputStream arg1) {
            super(arg1);
        }

        public void write(int arg0) throws IOException {
            if (this.first) {
                this.first = false;
            } else {
                super.write(arg0);
            }
        }
    }
}
