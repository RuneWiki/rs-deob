package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("hn")
public final class class227 {

    @ObfuscatedName("hn.f")
    public RandomAccessFile field3201;

    @ObfuscatedName("hn.s")
    public long field3199;

    @ObfuscatedName("hn.q")
    public long field3200;

    public class227(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field3201 = new RandomAccessFile(arg0, arg1);
        this.field3199 = arg2;
        this.field3200 = 0L;
        int var5 = this.field3201.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field3201.seek(0L);
            this.field3201.write(var5);
        }
        this.field3201.seek(0L);
    }

    @ObfuscatedName("hn.f(J)V")
    public final void method3845(long arg0) throws IOException {
        this.field3201.seek(arg0);
        this.field3200 = arg0;
    }

    @ObfuscatedName("hn.s([BIII)V")
    public final void method3846(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field3200 + (long) arg2 > this.field3199) {
            this.field3201.seek(this.field3199 + 1L);
            this.field3201.write(1);
            throw new EOFException();
        } else {
            this.field3201.write(arg0, arg1, arg2);
            this.field3200 += (long) arg2;
        }
    }

    @ObfuscatedName("hn.q(I)V")
    public final void method3859() throws IOException {
        if (this.field3201 != null) {
            this.field3201.close();
            this.field3201 = null;
        }
    }

    @ObfuscatedName("hn.g(B)J")
    public final long method3858() throws IOException {
        return this.field3201.length();
    }

    @ObfuscatedName("hn.m([BIIB)I")
    public final int method3857(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field3201.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field3200 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field3201 != null) {
            System.out.println("");
            this.method3859();
        }
    }
}
