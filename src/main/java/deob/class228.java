package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("hy")
public final class class228 {

    @ObfuscatedName("hy.e")
    public RandomAccessFile field3217;

    @ObfuscatedName("hy.w")
    public long field3216;

    @ObfuscatedName("hy.f")
    public long field3218;

    public class228(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field3217 = new RandomAccessFile(arg0, arg1);
        this.field3216 = arg2;
        this.field3218 = 0L;
        int var5 = this.field3217.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field3217.seek(0L);
            this.field3217.write(var5);
        }
        this.field3217.seek(0L);
    }

    @ObfuscatedName("hy.e(J)V")
    public final void method3842(long arg0) throws IOException {
        this.field3217.seek(arg0);
        this.field3218 = arg0;
    }

    @ObfuscatedName("hy.w([BIII)V")
    public final void method3826(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field3218 + (long) arg2 > this.field3216) {
            this.field3217.seek(this.field3216 + 1L);
            this.field3217.write(1);
            throw new EOFException();
        } else {
            this.field3217.write(arg0, arg1, arg2);
            this.field3218 += (long) arg2;
        }
    }

    @ObfuscatedName("hy.f(I)V")
    public final void method3827() throws IOException {
        if (this.field3217 != null) {
            this.field3217.close();
            this.field3217 = null;
        }
    }

    @ObfuscatedName("hy.s(I)J")
    public final long method3828() throws IOException {
        return this.field3217.length();
    }

    @ObfuscatedName("hy.p([BIIB)I")
    public final int method3834(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field3217.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field3218 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field3217 != null) {
            System.out.println("");
            this.method3827();
        }
    }
}
