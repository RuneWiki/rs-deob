package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("hy")
public final class class228 {

    @ObfuscatedName("hy.w")
    public RandomAccessFile field3218;

    @ObfuscatedName("hy.x")
    public long field3220;

    @ObfuscatedName("hy.t")
    public long field3219;

    public class228(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field3218 = new RandomAccessFile(arg0, arg1);
        this.field3220 = arg2;
        this.field3219 = 0L;
        int var5 = this.field3218.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field3218.seek(0L);
            this.field3218.write(var5);
        }
        this.field3218.seek(0L);
    }

    @ObfuscatedName("hy.w(J)V")
    public final void method3891(long arg0) throws IOException {
        this.field3218.seek(arg0);
        this.field3219 = arg0;
    }

    @ObfuscatedName("hy.x([BIII)V")
    public final void method3887(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field3219 + (long) arg2 > this.field3220) {
            this.field3218.seek(this.field3220 + 1L);
            this.field3218.write(1);
            throw new EOFException();
        } else {
            this.field3218.write(arg0, arg1, arg2);
            this.field3219 += (long) arg2;
        }
    }

    @ObfuscatedName("hy.t(I)V")
    public final void method3874() throws IOException {
        if (this.field3218 != null) {
            this.field3218.close();
            this.field3218 = null;
        }
    }

    @ObfuscatedName("hy.p(B)J")
    public final long method3876() throws IOException {
        return this.field3218.length();
    }

    @ObfuscatedName("hy.e([BIII)I")
    public final int method3875(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field3218.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field3219 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field3218 != null) {
            System.out.println("");
            this.method3874();
        }
    }
}
