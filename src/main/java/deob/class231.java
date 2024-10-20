package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("hl")
public final class class231 {

    @ObfuscatedName("hl.f")
    public RandomAccessFile field3268;

    @ObfuscatedName("hl.e")
    public long field3264;

    @ObfuscatedName("hl.n")
    public long field3266;

    public class231(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field3268 = new RandomAccessFile(arg0, arg1);
        this.field3264 = arg2;
        this.field3266 = 0L;
        int var5 = this.field3268.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field3268.seek(0L);
            this.field3268.write(var5);
        }
        this.field3268.seek(0L);
    }

    @ObfuscatedName("hl.f(J)V")
    public final void method3940(long arg0) throws IOException {
        this.field3268.seek(arg0);
        this.field3266 = arg0;
    }

    @ObfuscatedName("hl.e([BIII)V")
    public final void method3941(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field3266 + (long) arg2 > this.field3264) {
            this.field3268.seek(this.field3264 + 1L);
            this.field3268.write(1);
            throw new EOFException();
        } else {
            this.field3268.write(arg0, arg1, arg2);
            this.field3266 += (long) arg2;
        }
    }

    @ObfuscatedName("hl.n(I)V")
    public final void method3942() throws IOException {
        if (this.field3268 != null) {
            this.field3268.close();
            this.field3268 = null;
        }
    }

    @ObfuscatedName("hl.t(I)J")
    public final long method3957() throws IOException {
        return this.field3268.length();
    }

    @ObfuscatedName("hl.v([BIII)I")
    public final int method3944(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field3268.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field3266 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field3268 != null) {
            System.out.println("");
            this.method3942();
        }
    }
}
