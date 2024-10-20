package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("gv")
public final class class195 {

    @ObfuscatedName("gv.e")
    public RandomAccessFile field2925;

    @ObfuscatedName("gv.v")
    public long field2922;

    @ObfuscatedName("gv.i")
    public long field2923;

    public class195(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field2925 = new RandomAccessFile(arg0, arg1);
        this.field2922 = arg2;
        this.field2923 = 0L;
        int var5 = this.field2925.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field2925.seek(0L);
            this.field2925.write(var5);
        }
        this.field2925.seek(0L);
    }

    @ObfuscatedName("gv.e(J)V")
    public final void method3390(long arg0) throws IOException {
        this.field2925.seek(arg0);
        this.field2923 = arg0;
    }

    @ObfuscatedName("gv.v([BIIB)V")
    public final void method3391(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2923 + (long) arg2 > this.field2922) {
            this.field2925.seek(this.field2922 + 1L);
            this.field2925.write(1);
            throw new EOFException();
        } else {
            this.field2925.write(arg0, arg1, arg2);
            this.field2923 += (long) arg2;
        }
    }

    @ObfuscatedName("gv.i(I)V")
    public final void method3389() throws IOException {
        if (this.field2925 != null) {
            this.field2925.close();
            this.field2925 = null;
        }
    }

    @ObfuscatedName("gv.g(B)J")
    public final long method3392() throws IOException {
        return this.field2925.length();
    }

    @ObfuscatedName("gv.x([BIII)I")
    public final int method3393(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field2925.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field2923 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field2925 != null) {
            System.out.println("");
            this.method3389();
        }
    }
}
