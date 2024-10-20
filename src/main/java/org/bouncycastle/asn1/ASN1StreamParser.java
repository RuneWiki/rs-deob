package org.bouncycastle.asn1;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ASN1StreamParser {

    public final InputStream _in;

    public final int _limit;

    public final byte[][] tmpBuffers;

    public ASN1StreamParser(InputStream arg0) {
        this(arg0, StreamUtil.findLimit(arg0));
    }

    public ASN1EncodableVector readVector() throws IOException {
        ASN1EncodableVector var1 = new ASN1EncodableVector();
        ASN1Encodable var2;
        while ((var2 = this.readObject()) != null) {
            if (var2 instanceof InMemoryRepresentable) {
                var1.add(((InMemoryRepresentable) var2).getLoadedObject());
            } else {
                var1.add(var2.toASN1Primitive());
            }
        }
        return var1;
    }

    public ASN1StreamParser(byte[] arg0) {
        this(new ByteArrayInputStream(arg0), arg0.length);
    }

    public ASN1Encodable readIndef(int arg0) throws IOException {
        switch(arg0) {
            case 4:
                return new BEROctetStringParser(this);
            case 8:
                return new DERExternalParser(this);
            case 16:
                return new BERSequenceParser(this);
            case 17:
                return new BERSetParser(this);
            default:
                throw new ASN1Exception("unknown BER object encountered: 0x" + Integer.toHexString(arg0));
        }
    }

    public ASN1Encodable readImplicit(boolean arg0, int arg1) throws IOException {
        if (!this._in instanceof IndefiniteLengthInputStream) {
            if (arg0) {
                switch(arg1) {
                    case 4:
                        return new BEROctetStringParser(this);
                    case 16:
                        return new DERSequenceParser(this);
                    case 17:
                        return new DERSetParser(this);
                }
            } else {
                switch(arg1) {
                    case 4:
                        return new DEROctetStringParser((DefiniteLengthInputStream) this._in);
                    case 16:
                        throw new ASN1Exception("sets must use constructed encoding (see X.690 8.11.1/8.12.1)");
                    case 17:
                        throw new ASN1Exception("sequences must use constructed encoding (see X.690 8.9.1/8.10.1)");
                }
            }
            throw new ASN1Exception("implicit tagging not implemented");
        } else if (arg0) {
            return this.readIndef(arg1);
        } else {
            throw new IOException("indefinite-length primitive encoding encountered");
        }
    }

    public ASN1StreamParser(InputStream arg0, int arg1) {
        this._in = arg0;
        this._limit = arg1;
        this.tmpBuffers = new byte[11][];
    }

    public ASN1Encodable readObject() throws IOException {
        int var1 = this._in.read();
        if (var1 == -1) {
            return null;
        }
        this.set00Check(false);
        int var2 = ASN1InputStream.readTagNumber(this._in, var1);
        boolean var3 = (var1 & 0x20) != 0;
        int var4 = ASN1InputStream.readLength(this._in, this._limit);
        if (var4 >= 0) {
            DefiniteLengthInputStream var7 = new DefiniteLengthInputStream(this._in, var4);
            if ((var1 & 0x40) != 0) {
                return new DERApplicationSpecific(var3, var2, var7.toByteArray());
            } else if ((var1 & 0x80) != 0) {
                return new BERTaggedObjectParser(var3, var2, new ASN1StreamParser(var7));
            } else if (var3) {
                switch(var2) {
                    case 4:
                        return new BEROctetStringParser(new ASN1StreamParser(var7));
                    case 8:
                        return new DERExternalParser(new ASN1StreamParser(var7));
                    case 16:
                        return new DERSequenceParser(new ASN1StreamParser(var7));
                    case 17:
                        return new DERSetParser(new ASN1StreamParser(var7));
                    default:
                        throw new IOException("unknown tag " + var2 + " encountered");
                }
            } else {
                switch(var2) {
                    case 4:
                        return new DEROctetStringParser(var7);
                    default:
                        try {
                            return ASN1InputStream.createPrimitiveDERObject(var2, var7, this.tmpBuffers);
                        } catch (IllegalArgumentException var9) {
                            throw new ASN1Exception("corrupted stream detected", var9);
                        }
                }
            }
        } else if (var3) {
            IndefiniteLengthInputStream var5 = new IndefiniteLengthInputStream(this._in, this._limit);
            ASN1StreamParser var6 = new ASN1StreamParser(var5, this._limit);
            if ((var1 & 0x40) == 0) {
                return (var1 & 0x80) == 0 ? var6.readIndef(var2) : new BERTaggedObjectParser(true, var2, var6);
            } else {
                return new BERApplicationSpecificParser(var2, var6);
            }
        } else {
            throw new IOException("indefinite-length primitive encoding encountered");
        }
    }

    public ASN1Primitive readTaggedObject(boolean arg0, int arg1) throws IOException {
        if (!arg0) {
            DefiniteLengthInputStream var3 = (DefiniteLengthInputStream) this._in;
            return new DERTaggedObject(false, arg1, new DEROctetString(var3.toByteArray()));
        }
        ASN1EncodableVector var4 = this.readVector();
        if (this._in instanceof IndefiniteLengthInputStream) {
            return var4.size() == 1 ? new BERTaggedObject(true, arg1, var4.get(0)) : new BERTaggedObject(false, arg1, BERFactory.createSequence(var4));
        } else if (var4.size() == 1) {
            return new DERTaggedObject(true, arg1, var4.get(0));
        } else {
            return new DERTaggedObject(false, arg1, DERFactory.createSequence(var4));
        }
    }

    public void set00Check(boolean arg0) {
        if (this._in instanceof IndefiniteLengthInputStream) {
            ((IndefiniteLengthInputStream) this._in).setEofOn00(arg0);
        }
    }
}
