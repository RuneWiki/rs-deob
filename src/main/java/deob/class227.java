package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("hk")
public final class class227 {

    @ObfuscatedName("hk.i")
    public RandomAccessFile field3194;

    @ObfuscatedName("hk.v")
    public long field3195;

    @ObfuscatedName("hk.r")
    public long field3196;

    public class227(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field3194 = new RandomAccessFile(arg0, arg1);
        this.field3195 = arg2;
        this.field3196 = 0L;
        int var5 = this.field3194.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field3194.seek(0L);
            this.field3194.write(var5);
        }
        this.field3194.seek(0L);
    }

    @ObfuscatedName("hk.i(J)V")
    public final void method3812(long arg0) throws IOException {
        this.field3194.seek(arg0);
        this.field3196 = arg0;
    }

    @ObfuscatedName("hk.v([BIIB)V")
    public final void method3813(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field3196 + (long) arg2 > this.field3195) {
            this.field3194.seek(this.field3195 + 1L);
            this.field3194.write(1);
            throw new EOFException();
        } else {
            this.field3194.write(arg0, arg1, arg2);
            this.field3196 += (long) arg2;
        }
    }

    @ObfuscatedName("hk.r(I)V")
    public final void method3819() throws IOException {
        if (this.field3194 != null) {
            this.field3194.close();
            this.field3194 = null;
        }
    }

    @ObfuscatedName("hk.n(I)J")
    public final long method3815() throws IOException {
        return this.field3194.length();
    }

    @ObfuscatedName("hk.x([BIII)I")
    public final int method3816(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field3194.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field3196 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field3194 != null) {
            System.out.println("");
            this.method3819();
        }
    }
}
