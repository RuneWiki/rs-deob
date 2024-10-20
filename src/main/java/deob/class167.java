package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("ax")
public final class class167 {

    @ObfuscatedName("ax.b")
    public long field2550;

    @ObfuscatedName("ax.c")
    public long field2544;

    @ObfuscatedName("ax.v")
    public RandomAccessFile field2552;

    @ObfuscatedName("ax.c([BIIS)V")
    public final void method3011(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2550 + (long) arg2 > this.field2544) {
            this.field2552.seek(this.field2544 + 1L);
            this.field2552.write(1);
            throw new EOFException();
        } else {
            this.field2552.write(arg0, arg1, arg2);
            this.field2550 += (long) arg2;
        }
    }

    @ObfuscatedName("ax.v(J)V")
    public final void method3012(long arg0) throws IOException {
        this.field2552.seek(arg0);
        this.field2550 = arg0;
    }

    @ObfuscatedName("ax.b(B)V")
    public final void method3014() throws IOException {
        if (this.field2552 != null) {
            this.field2552.close();
            this.field2552 = null;
        }
    }

    @ObfuscatedName("ax.i(I)J")
    public final long method3015() throws IOException {
        return this.field2552.length();
    }

    @ObfuscatedName("ax.m([BIIB)I")
    public final int method3016(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field2552.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field2550 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field2552 != null) {
            System.out.println("");
            this.method3014();
        }
    }

    public class167(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field2552 = new RandomAccessFile(arg0, arg1);
        this.field2544 = arg2;
        this.field2550 = 0L;
        int var5 = this.field2552.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field2552.seek(0L);
            this.field2552.write(var5);
        }
        this.field2552.seek(0L);
    }
}
