package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("gh")
public final class class196 {

    @ObfuscatedName("gh.k")
    public RandomAccessFile field2936;

    @ObfuscatedName("gh.y")
    public long field2935;

    @ObfuscatedName("gh.s")
    public long field2934;

    public class196(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field2936 = new RandomAccessFile(arg0, arg1);
        this.field2935 = arg2;
        this.field2934 = 0L;
        int var5 = this.field2936.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field2936.seek(0L);
            this.field2936.write(var5);
        }
        this.field2936.seek(0L);
    }

    @ObfuscatedName("gh.k(J)V")
    public final void method3495(long arg0) throws IOException {
        this.field2936.seek(arg0);
        this.field2934 = arg0;
    }

    @ObfuscatedName("gh.y([BIII)V")
    public final void method3496(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2934 + (long) arg2 > this.field2935) {
            this.field2936.seek(this.field2935 + 1L);
            this.field2936.write(1);
            throw new EOFException();
        } else {
            this.field2936.write(arg0, arg1, arg2);
            this.field2934 += (long) arg2;
        }
    }

    @ObfuscatedName("gh.s(I)V")
    public final void method3497() throws IOException {
        if (this.field2936 != null) {
            this.field2936.close();
            this.field2936 = null;
        }
    }

    @ObfuscatedName("gh.g(I)J")
    public final long method3500() throws IOException {
        return this.field2936.length();
    }

    @ObfuscatedName("gh.h([BIII)I")
    public final int method3494(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field2936.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field2934 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field2936 != null) {
            System.out.println("");
            this.method3497();
        }
    }
}
