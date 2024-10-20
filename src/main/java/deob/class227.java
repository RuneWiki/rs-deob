package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("hz")
public final class class227 {

    @ObfuscatedName("hz.n")
    public RandomAccessFile field3188;

    @ObfuscatedName("hz.d")
    public long field3187;

    @ObfuscatedName("hz.s")
    public long field3189;

    public class227(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field3188 = new RandomAccessFile(arg0, arg1);
        this.field3187 = arg2;
        this.field3189 = 0L;
        int var5 = this.field3188.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field3188.seek(0L);
            this.field3188.write(var5);
        }
        this.field3188.seek(0L);
    }

    @ObfuscatedName("hz.n(J)V")
    public final void method3836(long arg0) throws IOException {
        this.field3188.seek(arg0);
        this.field3189 = arg0;
    }

    @ObfuscatedName("hz.d([BIII)V")
    public final void method3831(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field3189 + (long) arg2 > this.field3187) {
            this.field3188.seek(this.field3187 + 1L);
            this.field3188.write(1);
            throw new EOFException();
        } else {
            this.field3188.write(arg0, arg1, arg2);
            this.field3189 += (long) arg2;
        }
    }

    @ObfuscatedName("hz.s(I)V")
    public final void method3832() throws IOException {
        if (this.field3188 != null) {
            this.field3188.close();
            this.field3188 = null;
        }
    }

    @ObfuscatedName("hz.q(I)J")
    public final long method3833() throws IOException {
        return this.field3188.length();
    }

    @ObfuscatedName("hz.j([BIII)I")
    public final int method3835(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field3188.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field3189 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field3188 != null) {
            System.out.println("");
            this.method3832();
        }
    }
}
