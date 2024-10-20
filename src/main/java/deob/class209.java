package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("hd")
public final class class209 {

    @ObfuscatedName("hd.a")
    public RandomAccessFile field3005;

    @ObfuscatedName("hd.v")
    public long field3004;

    @ObfuscatedName("hd.i")
    public long field3003;

    public class209(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field3005 = new RandomAccessFile(arg0, arg1);
        this.field3004 = arg2;
        this.field3003 = 0L;
        int var5 = this.field3005.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field3005.seek(0L);
            this.field3005.write(var5);
        }
        this.field3005.seek(0L);
    }

    @ObfuscatedName("hd.a(J)V")
    public final void method3537(long arg0) throws IOException {
        this.field3005.seek(arg0);
        this.field3003 = arg0;
    }

    @ObfuscatedName("hd.v([BIII)V")
    public final void method3531(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field3003 + (long) arg2 > this.field3004) {
            this.field3005.seek(this.field3004 + 1L);
            this.field3005.write(1);
            throw new EOFException();
        } else {
            this.field3005.write(arg0, arg1, arg2);
            this.field3003 += (long) arg2;
        }
    }

    @ObfuscatedName("hd.i(B)V")
    public final void method3530() throws IOException {
        if (this.field3005 != null) {
            this.field3005.close();
            this.field3005 = null;
        }
    }

    @ObfuscatedName("hd.b(I)J")
    public final long method3533() throws IOException {
        return this.field3005.length();
    }

    @ObfuscatedName("hd.l([BIIB)I")
    public final int method3534(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field3005.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field3003 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field3005 != null) {
            System.out.println("");
            this.method3530();
        }
    }
}
