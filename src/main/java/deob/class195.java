package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("gw")
public final class class195 {

    @ObfuscatedName("gw.t")
    public RandomAccessFile field2925;

    @ObfuscatedName("gw.s")
    public long field2921;

    @ObfuscatedName("gw.f")
    public long field2923;

    public class195(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field2925 = new RandomAccessFile(arg0, arg1);
        this.field2921 = arg2;
        this.field2923 = 0L;
        int var5 = this.field2925.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field2925.seek(0L);
            this.field2925.write(var5);
        }
        this.field2925.seek(0L);
    }

    @ObfuscatedName("gw.t(J)V")
    public final void method3437(long arg0) throws IOException {
        this.field2925.seek(arg0);
        this.field2923 = arg0;
    }

    @ObfuscatedName("gw.s([BIIS)V")
    public final void method3456(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2923 + (long) arg2 > this.field2921) {
            this.field2925.seek(this.field2921 + 1L);
            this.field2925.write(1);
            throw new EOFException();
        } else {
            this.field2925.write(arg0, arg1, arg2);
            this.field2923 += (long) arg2;
        }
    }

    @ObfuscatedName("gw.f(B)V")
    public final void method3435() throws IOException {
        if (this.field2925 != null) {
            this.field2925.close();
            this.field2925 = null;
        }
    }

    @ObfuscatedName("gw.e(B)J")
    public final long method3436() throws IOException {
        return this.field2925.length();
    }

    @ObfuscatedName("gw.d([BIII)I")
    public final int method3451(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field2925.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field2923 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field2925 != null) {
            System.out.println("");
            this.method3435();
        }
    }
}
