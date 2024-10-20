package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("ho")
public final class class227 {

    @ObfuscatedName("ho.i")
    public RandomAccessFile field3193;

    @ObfuscatedName("ho.v")
    public long field3192;

    @ObfuscatedName("ho.f")
    public long field3194;

    public class227(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field3193 = new RandomAccessFile(arg0, arg1);
        this.field3192 = arg2;
        this.field3194 = 0L;
        int var5 = this.field3193.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field3193.seek(0L);
            this.field3193.write(var5);
        }
        this.field3193.seek(0L);
    }

    @ObfuscatedName("ho.i(J)V")
    public final void method3814(long arg0) throws IOException {
        this.field3193.seek(arg0);
        this.field3194 = arg0;
    }

    @ObfuscatedName("ho.v([BIII)V")
    public final void method3824(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field3194 + (long) arg2 > this.field3192) {
            this.field3193.seek(this.field3192 + 1L);
            this.field3193.write(1);
            throw new EOFException();
        } else {
            this.field3193.write(arg0, arg1, arg2);
            this.field3194 += (long) arg2;
        }
    }

    @ObfuscatedName("ho.f(I)V")
    public final void method3813() throws IOException {
        if (this.field3193 != null) {
            this.field3193.close();
            this.field3193 = null;
        }
    }

    @ObfuscatedName("ho.h(I)J")
    public final long method3815() throws IOException {
        return this.field3193.length();
    }

    @ObfuscatedName("ho.a([BIIB)I")
    public final int method3816(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field3193.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field3194 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field3193 != null) {
            System.out.println("");
            this.method3813();
        }
    }
}
