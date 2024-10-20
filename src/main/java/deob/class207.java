package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("gi")
public final class class207 {

    @ObfuscatedName("gi.e")
    public RandomAccessFile field2977;

    @ObfuscatedName("gi.v")
    public long field2978;

    @ObfuscatedName("gi.k")
    public long field2979;

    public class207(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field2977 = new RandomAccessFile(arg0, arg1);
        this.field2978 = arg2;
        this.field2979 = 0L;
        int var5 = this.field2977.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field2977.seek(0L);
            this.field2977.write(var5);
        }
        this.field2977.seek(0L);
    }

    @ObfuscatedName("gi.e(J)V")
    public final void method3513(long arg0) throws IOException {
        this.field2977.seek(arg0);
        this.field2979 = arg0;
    }

    @ObfuscatedName("gi.v([BIIB)V")
    public final void method3530(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2979 + (long) arg2 > this.field2978) {
            this.field2977.seek(this.field2978 + 1L);
            this.field2977.write(1);
            throw new EOFException();
        } else {
            this.field2977.write(arg0, arg1, arg2);
            this.field2979 += (long) arg2;
        }
    }

    @ObfuscatedName("gi.k(I)V")
    public final void method3515() throws IOException {
        if (this.field2977 != null) {
            this.field2977.close();
            this.field2977 = null;
        }
    }

    @ObfuscatedName("gi.g(I)J")
    public final long method3516() throws IOException {
        return this.field2977.length();
    }

    @ObfuscatedName("gi.q([BIIS)I")
    public final int method3517(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field2977.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field2979 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field2977 != null) {
            System.out.println("");
            this.method3515();
        }
    }
}
