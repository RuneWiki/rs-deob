package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("gc")
public final class class185 {

    @ObfuscatedName("gc.z")
    public RandomAccessFile field2873;

    @ObfuscatedName("gc.n")
    public long field2874;

    @ObfuscatedName("gc.u")
    public long field2875;

    public class185(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field2873 = new RandomAccessFile(arg0, arg1);
        this.field2874 = arg2;
        this.field2875 = 0L;
        int var5 = this.field2873.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field2873.seek(0L);
            this.field2873.write(var5);
        }
        this.field2873.seek(0L);
    }

    @ObfuscatedName("gc.z(J)V")
    public final void method3399(long arg0) throws IOException {
        this.field2873.seek(arg0);
        this.field2875 = arg0;
    }

    @ObfuscatedName("gc.n([BIII)V")
    public final void method3396(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2875 + (long) arg2 > this.field2874) {
            this.field2873.seek(this.field2874 + 1L);
            this.field2873.write(1);
            throw new EOFException();
        } else {
            this.field2873.write(arg0, arg1, arg2);
            this.field2875 += (long) arg2;
        }
    }

    @ObfuscatedName("gc.u(B)V")
    public final void method3397() throws IOException {
        if (this.field2873 != null) {
            this.field2873.close();
            this.field2873 = null;
        }
    }

    @ObfuscatedName("gc.t(I)J")
    public final long method3398() throws IOException {
        return this.field2873.length();
    }

    @ObfuscatedName("gc.e([BIIB)I")
    public final int method3401(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field2873.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field2875 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field2873 != null) {
            System.out.println("");
            this.method3397();
        }
    }
}
