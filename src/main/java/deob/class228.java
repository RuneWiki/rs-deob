package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("hs")
public final class class228 {

    @ObfuscatedName("hs.a")
    public RandomAccessFile field3220;

    @ObfuscatedName("hs.w")
    public long field3217;

    @ObfuscatedName("hs.d")
    public long field3216;

    public class228(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field3220 = new RandomAccessFile(arg0, arg1);
        this.field3217 = arg2;
        this.field3216 = 0L;
        int var5 = this.field3220.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field3220.seek(0L);
            this.field3220.write(var5);
        }
        this.field3220.seek(0L);
    }

    @ObfuscatedName("hs.a(J)V")
    public final void method3951(long arg0) throws IOException {
        this.field3220.seek(arg0);
        this.field3216 = arg0;
    }

    @ObfuscatedName("hs.w([BIII)V")
    public final void method3933(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field3216 + (long) arg2 > this.field3217) {
            this.field3220.seek(this.field3217 + 1L);
            this.field3220.write(1);
            throw new EOFException();
        } else {
            this.field3220.write(arg0, arg1, arg2);
            this.field3216 += (long) arg2;
        }
    }

    @ObfuscatedName("hs.d(B)V")
    public final void method3934() throws IOException {
        if (this.field3220 != null) {
            this.field3220.close();
            this.field3220 = null;
        }
    }

    @ObfuscatedName("hs.c(B)J")
    public final long method3935() throws IOException {
        return this.field3220.length();
    }

    @ObfuscatedName("hs.y([BIII)I")
    public final int method3937(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field3220.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field3216 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field3220 != null) {
            System.out.println("");
            this.method3934();
        }
    }
}
