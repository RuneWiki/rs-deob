package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("gl")
public final class class207 {

    @ObfuscatedName("gl.x")
    public RandomAccessFile field2978;

    @ObfuscatedName("gl.v")
    public long field2974;

    @ObfuscatedName("gl.m")
    public long field2976;

    public class207(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field2978 = new RandomAccessFile(arg0, arg1);
        this.field2974 = arg2;
        this.field2976 = 0L;
        int var5 = this.field2978.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field2978.seek(0L);
            this.field2978.write(var5);
        }
        this.field2978.seek(0L);
    }

    @ObfuscatedName("gl.x(J)V")
    public final void method3557(long arg0) throws IOException {
        this.field2978.seek(arg0);
        this.field2976 = arg0;
    }

    @ObfuscatedName("gl.v([BIII)V")
    public final void method3559(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2976 + (long) arg2 > this.field2974) {
            this.field2978.seek(this.field2974 + 1L);
            this.field2978.write(1);
            throw new EOFException();
        } else {
            this.field2978.write(arg0, arg1, arg2);
            this.field2976 += (long) arg2;
        }
    }

    @ObfuscatedName("gl.m(I)V")
    public final void method3560() throws IOException {
        if (this.field2978 != null) {
            this.field2978.close();
            this.field2978 = null;
        }
    }

    @ObfuscatedName("gl.e(I)J")
    public final long method3561() throws IOException {
        return this.field2978.length();
    }

    @ObfuscatedName("gl.h([BIII)I")
    public final int method3562(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field2978.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field2976 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field2978 != null) {
            System.out.println("");
            this.method3560();
        }
    }
}
