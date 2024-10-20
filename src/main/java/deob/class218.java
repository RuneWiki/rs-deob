package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("hp")
public final class class218 {

    @ObfuscatedName("hp.n")
    public RandomAccessFile field3113;

    @ObfuscatedName("hp.w")
    public long field3112;

    @ObfuscatedName("hp.i")
    public long field3114;

    public class218(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field3113 = new RandomAccessFile(arg0, arg1);
        this.field3112 = arg2;
        this.field3114 = 0L;
        int var5 = this.field3113.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field3113.seek(0L);
            this.field3113.write(var5);
        }
        this.field3113.seek(0L);
    }

    @ObfuscatedName("hp.n(J)V")
    public final void method3687(long arg0) throws IOException {
        this.field3113.seek(arg0);
        this.field3114 = arg0;
    }

    @ObfuscatedName("hp.w([BIIB)V")
    public final void method3688(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field3114 + (long) arg2 > this.field3112) {
            this.field3113.seek(this.field3112 + 1L);
            this.field3113.write(1);
            throw new EOFException();
        } else {
            this.field3113.write(arg0, arg1, arg2);
            this.field3114 += (long) arg2;
        }
    }

    @ObfuscatedName("hp.i(I)V")
    public final void method3689() throws IOException {
        if (this.field3113 != null) {
            this.field3113.close();
            this.field3113 = null;
        }
    }

    @ObfuscatedName("hp.e(I)J")
    public final long method3690() throws IOException {
        return this.field3113.length();
    }

    @ObfuscatedName("hp.h([BIII)I")
    public final int method3691(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field3113.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field3114 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field3113 != null) {
            System.out.println("");
            this.method3689();
        }
    }
}
