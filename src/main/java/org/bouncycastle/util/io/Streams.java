package org.bouncycastle.util.io;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public final class Streams {

    public static int BUFFER_SIZE = 4096;

    public static void writeBufTo(ByteArrayOutputStream arg0, OutputStream arg1) throws IOException {
        arg0.writeTo(arg1);
    }

    public static void drain(InputStream arg0) throws IOException {
        byte[] var1 = new byte[BUFFER_SIZE];
        while (arg0.read(var1, 0, var1.length) >= 0) {
        }
    }

    public static byte[] readAll(InputStream arg0) throws IOException {
        ByteArrayOutputStream var1 = new ByteArrayOutputStream();
        pipeAll(arg0, var1);
        return var1.toByteArray();
    }

    public static int readFully(InputStream arg0, byte[] arg1) throws IOException {
        return readFully(arg0, arg1, 0, arg1.length);
    }

    public static byte[] readAllLimited(InputStream arg0, int arg1) throws IOException {
        ByteArrayOutputStream var2 = new ByteArrayOutputStream();
        pipeAllLimited(arg0, (long) arg1, var2);
        return var2.toByteArray();
    }

    public static void pipeAll(InputStream arg0, OutputStream arg1) throws IOException {
        byte[] var2 = new byte[BUFFER_SIZE];
        int var3;
        while ((var3 = arg0.read(var2, 0, var2.length)) >= 0) {
            arg1.write(var2, 0, var3);
        }
    }

    public static long pipeAllLimited(InputStream arg0, long arg1, OutputStream arg2) throws IOException {
        long var4 = 0L;
        byte[] var6 = new byte[BUFFER_SIZE];
        int var7;
        while ((var7 = arg0.read(var6, 0, var6.length)) >= 0) {
            if (arg1 - var4 < (long) var7) {
                throw new StreamOverflowException("Data Overflow");
            }
            var4 += (long) var7;
            arg2.write(var6, 0, var7);
        }
        return var4;
    }

    public static int readFully(InputStream arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        int var4;
        int var5;
        for (var4 = 0; var4 < arg3; var4 += var5) {
            var5 = arg0.read(arg1, arg2 + var4, arg3 - var4);
            if (var5 < 0) {
                break;
            }
        }
        return var4;
    }
}
