package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("hf")
public final class class231 {

    @ObfuscatedName("hf.k")
    public RandomAccessFile field3265;

    @ObfuscatedName("hf.q")
    public long field3264;

    @ObfuscatedName("hf.f")
    public long field3266;

    public class231(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field3265 = new RandomAccessFile(arg0, arg1);
        this.field3264 = arg2;
        this.field3266 = 0L;
        int var5 = this.field3265.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field3265.seek(0L);
            this.field3265.write(var5);
        }
        this.field3265.seek(0L);
    }

    @ObfuscatedName("hf.k(J)V")
    public final void method3889(long arg0) throws IOException {
        this.field3265.seek(arg0);
        this.field3266 = arg0;
    }

    @ObfuscatedName("hf.q([BIII)V")
    public final void method3890(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field3266 + (long) arg2 > this.field3264) {
            this.field3265.seek(this.field3264 + 1L);
            this.field3265.write(1);
            throw new EOFException();
        } else {
            this.field3265.write(arg0, arg1, arg2);
            this.field3266 += (long) arg2;
        }
    }

    @ObfuscatedName("hf.f(I)V")
    public final void method3891() throws IOException {
        if (this.field3265 != null) {
            this.field3265.close();
            this.field3265 = null;
        }
    }

    @ObfuscatedName("hf.c(I)J")
    public final long method3892() throws IOException {
        return this.field3265.length();
    }

    @ObfuscatedName("hf.v([BIII)I")
    public final int method3888(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field3265.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field3266 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field3265 != null) {
            System.out.println("");
            this.method3891();
        }
    }
}
