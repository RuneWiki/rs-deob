package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("gd")
public final class class192 {

    @ObfuscatedName("gd.e")
    public RandomAccessFile field2897;

    @ObfuscatedName("gd.p")
    public long field2898;

    @ObfuscatedName("gd.a")
    public long field2899;

    public class192(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field2897 = new RandomAccessFile(arg0, arg1);
        this.field2898 = arg2;
        this.field2899 = 0L;
        int var5 = this.field2897.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field2897.seek(0L);
            this.field2897.write(var5);
        }
        this.field2897.seek(0L);
    }

    @ObfuscatedName("gd.e(J)V")
    public final void method3411(long arg0) throws IOException {
        this.field2897.seek(arg0);
        this.field2899 = arg0;
    }

    @ObfuscatedName("gd.p([BIII)V")
    public final void method3412(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2899 + (long) arg2 > this.field2898) {
            this.field2897.seek(this.field2898 + 1L);
            this.field2897.write(1);
            throw new EOFException();
        } else {
            this.field2897.write(arg0, arg1, arg2);
            this.field2899 += (long) arg2;
        }
    }

    @ObfuscatedName("gd.a(I)V")
    public final void method3413() throws IOException {
        if (this.field2897 != null) {
            this.field2897.close();
            this.field2897 = null;
        }
    }

    @ObfuscatedName("gd.g(B)J")
    public final long method3414() throws IOException {
        return this.field2897.length();
    }

    @ObfuscatedName("gd.u([BIII)I")
    public final int method3416(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field2897.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field2899 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field2897 != null) {
            System.out.println("");
            this.method3413();
        }
    }
}
