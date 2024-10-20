package org.bouncycastle.asn1;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Vector;

public class BEROctetString extends ASN1OctetString {

    public ASN1OctetString[] octs;

    public static final int MAX_LENGTH = 1000;

    public boolean isConstructed() {
        return true;
    }

    public byte[] getOctets() {
        return this.string;
    }

    public BEROctetString(ASN1OctetString[] arg0) {
        super(toBytes(arg0));
        this.octs = arg0;
    }

    public BEROctetString(byte[] arg0) {
        super(arg0);
    }

    public Enumeration getObjects() {
        return this.octs == null ? this.generateOcts().elements() : new Enumeration() {

            public int counter = 0;

            public boolean hasMoreElements() {
                return this.counter < BEROctetString.this.octs.length;
            }

            public Object nextElement() {
                return BEROctetString.this.octs[this.counter++];
            }
        };
    }

    public Vector generateOcts() {
        Vector var1 = new Vector();
        for (int var2 = 0; var2 < this.string.length; var2 += 1000) {
            int var3;
            if (var2 + 1000 > this.string.length) {
                var3 = this.string.length;
            } else {
                var3 = var2 + 1000;
            }
            byte[] var4 = new byte[var3 - var2];
            System.arraycopy(this.string, var2, var4, 0, var4.length);
            var1.addElement(new DEROctetString(var4));
        }
        return var1;
    }

    public static byte[] toBytes(ASN1OctetString[] arg0) {
        ByteArrayOutputStream var1 = new ByteArrayOutputStream();
        for (int var2 = 0; var2 != arg0.length; var2++) {
            try {
                DEROctetString var3 = (DEROctetString) arg0[var2];
                var1.write(var3.getOctets());
            } catch (ClassCastException var6) {
                throw new IllegalArgumentException(arg0[var2].getClass().getName() + " found in input should only contain DEROctetString");
            } catch (IOException var7) {
                throw new IllegalArgumentException("exception converting octets " + var7.toString());
            }
        }
        return var1.toByteArray();
    }

    public int encodedLength() throws IOException {
        int var1 = 0;
        Enumeration var2 = this.getObjects();
        while (var2.hasMoreElements()) {
            var1 += ((ASN1Encodable) var2.nextElement()).toASN1Primitive().encodedLength();
        }
        return var1 + 2 + 2;
    }

    public void encode(ASN1OutputStream arg0) throws IOException {
        arg0.write(36);
        arg0.write(128);
        Enumeration var2 = this.getObjects();
        while (var2.hasMoreElements()) {
            arg0.writeObject((ASN1Encodable) var2.nextElement());
        }
        arg0.write(0);
        arg0.write(0);
    }

    public static BEROctetString fromSequence(ASN1Sequence arg0) {
        ASN1OctetString[] var1 = new ASN1OctetString[arg0.size()];
        Enumeration var2 = arg0.getObjects();
        int var3 = 0;
        while (var2.hasMoreElements()) {
            var1[var3++] = (ASN1OctetString) var2.nextElement();
        }
        return new BEROctetString(var1);
    }
}
