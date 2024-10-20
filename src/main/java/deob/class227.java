package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("hn")
public final class class227 {

    @ObfuscatedName("hn.a")
    public RandomAccessFile field3207;

    @ObfuscatedName("hn.r")
    public long field3206;

    @ObfuscatedName("hn.f")
    public long field3208;

    public class227(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field3207 = new RandomAccessFile(arg0, arg1);
        this.field3206 = arg2;
        this.field3208 = 0L;
        int var5 = this.field3207.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field3207.seek(0L);
            this.field3207.write(var5);
        }
        this.field3207.seek(0L);
    }

    @ObfuscatedName("hn.a(J)V")
    public final void method3861(long arg0) throws IOException {
        this.field3207.seek(arg0);
        this.field3208 = arg0;
    }

    @ObfuscatedName("hn.r([BIII)V")
    public final void method3862(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field3208 + (long) arg2 > this.field3206) {
            this.field3207.seek(this.field3206 + 1L);
            this.field3207.write(1);
            throw new EOFException();
        } else {
            this.field3207.write(arg0, arg1, arg2);
            this.field3208 += (long) arg2;
        }
    }

    @ObfuscatedName("hn.f(I)V")
    public final void method3876() throws IOException {
        if (this.field3207 != null) {
            this.field3207.close();
            this.field3207 = null;
        }
    }

    @ObfuscatedName("hn.s(B)J")
    public final long method3864() throws IOException {
        return this.field3207.length();
    }

    @ObfuscatedName("hn.y([BIIB)I")
    public final int method3865(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field3207.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field3208 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field3207 != null) {
            System.out.println("");
            this.method3876();
        }
    }
}
