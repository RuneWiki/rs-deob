package org.bouncycastle.util.encoders;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import org.bouncycastle.util.Strings;

public class Hex {

    public static final Encoder encoder = new HexEncoder();

    public static byte[] decode(byte[] arg0) {
        ByteArrayOutputStream var1 = new ByteArrayOutputStream();
        try {
            encoder.decode(arg0, 0, arg0.length, var1);
        } catch (Exception var3) {
            throw new DecoderException("exception decoding Hex data: " + var3.getMessage(), var3);
        }
        return var1.toByteArray();
    }

    public static String toHexString(byte[] arg0, int arg1, int arg2) {
        byte[] var3 = encode(arg0, arg1, arg2);
        return Strings.fromByteArray(var3);
    }

    public static byte[] encode(byte[] arg0) {
        return encode(arg0, 0, arg0.length);
    }

    public static int encode(byte[] arg0, OutputStream arg1) throws IOException {
        return encoder.encode(arg0, 0, arg0.length, arg1);
    }

    public static String toHexString(byte[] arg0) {
        return toHexString(arg0, 0, arg0.length);
    }

    public static int encode(byte[] arg0, int arg1, int arg2, OutputStream arg3) throws IOException {
        return encoder.encode(arg0, arg1, arg2, arg3);
    }

    public static byte[] decode(String arg0) {
        ByteArrayOutputStream var1 = new ByteArrayOutputStream();
        try {
            encoder.decode(arg0, var1);
        } catch (Exception var3) {
            throw new DecoderException("exception decoding Hex string: " + var3.getMessage(), var3);
        }
        return var1.toByteArray();
    }

    public static int decode(String arg0, OutputStream arg1) throws IOException {
        return encoder.decode(arg0, arg1);
    }

    public static byte[] encode(byte[] arg0, int arg1, int arg2) {
        ByteArrayOutputStream var3 = new ByteArrayOutputStream();
        try {
            encoder.encode(arg0, arg1, arg2, var3);
        } catch (Exception var5) {
            throw new EncoderException("exception encoding Hex string: " + var5.getMessage(), var5);
        }
        return var3.toByteArray();
    }
}
