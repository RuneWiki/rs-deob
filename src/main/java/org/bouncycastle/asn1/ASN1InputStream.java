package org.bouncycastle.asn1;

import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.util.io.Streams;

public class ASN1InputStream extends FilterInputStream implements BERTags {

    public final int limit;

    public final boolean lazyEvaluate;

    public final byte[][] tmpBuffers;

    public void readFully(byte[] arg0) throws IOException {
        if (Streams.readFully(this, arg0) != arg0.length) {
            throw new EOFException("EOF encountered in middle of object");
        }
    }

    public ASN1InputStream(byte[] arg0) {
        this(new ByteArrayInputStream(arg0), arg0.length);
    }

    public ASN1InputStream(byte[] arg0, boolean arg1) {
        this(new ByteArrayInputStream(arg0), arg0.length, arg1);
    }

    public static ASN1Primitive createPrimitiveDERObject(int arg0, DefiniteLengthInputStream arg1, byte[][] arg2) throws IOException {
        switch(arg0) {
            case 1:
                return ASN1Boolean.fromOctetString(getBuffer(arg1, arg2));
            case 2:
                return new ASN1Integer(arg1.toByteArray(), false);
            case 3:
                return ASN1BitString.fromInputStream(arg1.getRemaining(), arg1);
            case 4:
                return new DEROctetString(arg1.toByteArray());
            case 5:
                return DERNull.INSTANCE;
            case 6:
                return ASN1ObjectIdentifier.fromOctetString(getBuffer(arg1, arg2));
            case 7:
            case 8:
            case 9:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 29:
            default:
                throw new IOException("unknown tag " + arg0 + " encountered");
            case 10:
                return ASN1Enumerated.fromOctetString(getBuffer(arg1, arg2));
            case 12:
                return new DERUTF8String(arg1.toByteArray());
            case 18:
                return new DERNumericString(arg1.toByteArray());
            case 19:
                return new DERPrintableString(arg1.toByteArray());
            case 20:
                return new DERT61String(arg1.toByteArray());
            case 21:
                return new DERVideotexString(arg1.toByteArray());
            case 22:
                return new DERIA5String(arg1.toByteArray());
            case 23:
                return new ASN1UTCTime(arg1.toByteArray());
            case 24:
                return new ASN1GeneralizedTime(arg1.toByteArray());
            case 25:
                return new DERGraphicString(arg1.toByteArray());
            case 26:
                return new DERVisibleString(arg1.toByteArray());
            case 27:
                return new DERGeneralString(arg1.toByteArray());
            case 28:
                return new DERUniversalString(arg1.toByteArray());
            case 30:
                return new DERBMPString(getBMPCharBuffer(arg1));
        }
    }

    public ASN1InputStream(InputStream arg0, boolean arg1) {
        this(arg0, StreamUtil.findLimit(arg0), arg1);
    }

    public ASN1Primitive readObject() throws IOException {
        int var1 = this.read();
        if (var1 > 0) {
            int var2 = readTagNumber(this, var1);
            boolean var3 = (var1 & 0x20) != 0;
            int var4 = this.readLength();
            if (var4 >= 0) {
                try {
                    return this.buildObject(var1, var2, var4);
                } catch (IllegalArgumentException var8) {
                    throw new ASN1Exception("corrupted stream detected", var8);
                }
            } else if (var3) {
                IndefiniteLengthInputStream var5 = new IndefiniteLengthInputStream(this, this.limit);
                ASN1StreamParser var6 = new ASN1StreamParser(var5, this.limit);
                if ((var1 & 0x40) != 0) {
                    return (new BERApplicationSpecificParser(var2, var6)).getLoadedObject();
                } else if ((var1 & 0x80) == 0) {
                    switch(var2) {
                        case 4:
                            return (new BEROctetStringParser(var6)).getLoadedObject();
                        case 8:
                            return (new DERExternalParser(var6)).getLoadedObject();
                        case 16:
                            return (new BERSequenceParser(var6)).getLoadedObject();
                        case 17:
                            return (new BERSetParser(var6)).getLoadedObject();
                        default:
                            throw new IOException("unknown BER object encountered");
                    }
                } else {
                    return (new BERTaggedObjectParser(true, var2, var6)).getLoadedObject();
                }
            } else {
                throw new IOException("indefinite-length primitive encoding encountered");
            }
        } else if (var1 == 0) {
            throw new IOException("unexpected end-of-contents marker");
        } else {
            return null;
        }
    }

    public int getLimit() {
        return this.limit;
    }

    public int readLength() throws IOException {
        return readLength(this, this.limit);
    }

    public ASN1EncodableVector buildEncodableVector() throws IOException {
        ASN1EncodableVector var1 = new ASN1EncodableVector();
        ASN1Primitive var2;
        while ((var2 = this.readObject()) != null) {
            var1.add(var2);
        }
        return var1;
    }

    public ASN1Primitive buildObject(int arg0, int arg1, int arg2) throws IOException {
        boolean var4 = (arg0 & 0x20) != 0;
        DefiniteLengthInputStream var5 = new DefiniteLengthInputStream(this, arg2);
        if ((arg0 & 0x40) != 0) {
            return new DERApplicationSpecific(var4, arg1, var5.toByteArray());
        } else if ((arg0 & 0x80) != 0) {
            return (new ASN1StreamParser(var5)).readTaggedObject(var4, arg1);
        } else if (var4) {
            switch(arg1) {
                case 4:
                    ASN1EncodableVector var6 = this.buildDEREncodableVector(var5);
                    ASN1OctetString[] var7 = new ASN1OctetString[var6.size()];
                    for (int var8 = 0; var8 != var7.length; var8++) {
                        var7[var8] = (ASN1OctetString) var6.get(var8);
                    }
                    return new BEROctetString(var7);
                case 8:
                    return new DERExternal(this.buildDEREncodableVector(var5));
                case 16:
                    if (this.lazyEvaluate) {
                        return new LazyEncodedSequence(var5.toByteArray());
                    }
                    return DERFactory.createSequence(this.buildDEREncodableVector(var5));
                case 17:
                    return DERFactory.createSet(this.buildDEREncodableVector(var5));
                default:
                    throw new IOException("unknown tag " + arg1 + " encountered");
            }
        } else {
            return createPrimitiveDERObject(arg1, var5, this.tmpBuffers);
        }
    }

    public ASN1InputStream(InputStream arg0, int arg1, boolean arg2) {
        super(arg0);
        this.limit = arg1;
        this.lazyEvaluate = arg2;
        this.tmpBuffers = new byte[11][];
    }

    public ASN1InputStream(InputStream arg0) {
        this(arg0, StreamUtil.findLimit(arg0));
    }

    public ASN1EncodableVector buildDEREncodableVector(DefiniteLengthInputStream arg0) throws IOException {
        return (new ASN1InputStream(arg0)).buildEncodableVector();
    }

    public static int readTagNumber(InputStream arg0, int arg1) throws IOException {
        int var2 = arg1 & 0x1F;
        if (var2 == 31) {
            int var3 = 0;
            int var4 = arg0.read();
            if ((var4 & 0x7F) == 0) {
                throw new IOException("corrupted stream - invalid high tag number found");
            }
            while (var4 >= 0 && (var4 & 0x80) != 0) {
                int var5 = var3 | var4 & 0x7F;
                var3 = var5 << 7;
                var4 = arg0.read();
            }
            if (var4 < 0) {
                throw new EOFException("EOF found inside tag value.");
            }
            var2 = var3 | var4 & 0x7F;
        }
        return var2;
    }

    public ASN1InputStream(InputStream arg0, int arg1) {
        this(arg0, arg1, false);
    }

    public static byte[] getBuffer(DefiniteLengthInputStream arg0, byte[][] arg1) throws IOException {
        int var2 = arg0.getRemaining();
        if (arg0.getRemaining() >= arg1.length) {
            return arg0.toByteArray();
        }
        byte[] var3 = arg1[var2];
        if (var3 == null) {
            var3 = arg1[var2] = new byte[var2];
        }
        Streams.readFully(arg0, var3);
        return var3;
    }

    public static char[] getBMPCharBuffer(DefiniteLengthInputStream arg0) throws IOException {
        int var1 = arg0.getRemaining() / 2;
        char[] var2 = new char[var1];
        int var3 = 0;
        while (var3 < var1) {
            int var4 = arg0.read();
            if (var4 < 0) {
                break;
            }
            int var5 = arg0.read();
            if (var5 < 0) {
                break;
            }
            var2[var3++] = (char) (var4 << 8 | var5 & 0xFF);
        }
        return var2;
    }

    public static int readLength(InputStream arg0, int arg1) throws IOException {
        int var2 = arg0.read();
        if (var2 < 0) {
            throw new EOFException("EOF found when length expected");
        } else if (var2 == 128) {
            return -1;
        } else {
            if (var2 > 127) {
                int var3 = var2 & 0x7F;
                if (var3 > 4) {
                    throw new IOException("DER length more than 4 bytes: " + var3);
                }
                var2 = 0;
                for (int var4 = 0; var4 < var3; var4++) {
                    int var5 = arg0.read();
                    if (var5 < 0) {
                        throw new EOFException("EOF found reading length");
                    }
                    var2 = (var2 << 8) + var5;
                }
                if (var2 < 0) {
                    throw new IOException("corrupted stream - negative length found");
                }
                if (var2 >= arg1) {
                    throw new IOException("corrupted stream - out of bounds length found");
                }
            }
            return var2;
        }
    }
}
