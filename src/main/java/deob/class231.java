package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("hi")
public final class class231 {

    @ObfuscatedName("hi.i")
    public RandomAccessFile field3267;

    @ObfuscatedName("hi.h")
    public long field3266;

    @ObfuscatedName("hi.e")
    public long field3268;

    public class231(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field3267 = new RandomAccessFile(arg0, arg1);
        this.field3266 = arg2;
        this.field3268 = 0L;
        int var5 = this.field3267.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field3267.seek(0L);
            this.field3267.write(var5);
        }
        this.field3267.seek(0L);
    }

    @ObfuscatedName("hi.i(J)V")
    public final void method3902(long arg0) throws IOException {
        this.field3267.seek(arg0);
        this.field3268 = arg0;
    }

    @ObfuscatedName("hi.h([BIII)V")
    public final void method3901(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field3268 + (long) arg2 > this.field3266) {
            this.field3267.seek(this.field3266 + 1L);
            this.field3267.write(1);
            throw new EOFException();
        } else {
            this.field3267.write(arg0, arg1, arg2);
            this.field3268 += (long) arg2;
        }
    }

    @ObfuscatedName("hi.e(I)V")
    public final void method3904() throws IOException {
        if (this.field3267 != null) {
            this.field3267.close();
            this.field3267 = null;
        }
    }

    @ObfuscatedName("hi.g(I)J")
    public final long method3908() throws IOException {
        return this.field3267.length();
    }

    @ObfuscatedName("hi.n([BIII)I")
    public final int method3905(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field3267.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field3268 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field3267 != null) {
            System.out.println("");
            this.method3904();
        }
    }
}
