package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("hy")
public final class class228 {

    @ObfuscatedName("hy.b")
    public RandomAccessFile field3215;

    @ObfuscatedName("hy.g")
    public long field3217;

    @ObfuscatedName("hy.j")
    public long field3214;

    public class228(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field3215 = new RandomAccessFile(arg0, arg1);
        this.field3217 = arg2;
        this.field3214 = 0L;
        int var5 = this.field3215.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field3215.seek(0L);
            this.field3215.write(var5);
        }
        this.field3215.seek(0L);
    }

    @ObfuscatedName("hy.b(J)V")
    public final void method3838(long arg0) throws IOException {
        this.field3215.seek(arg0);
        this.field3214 = arg0;
    }

    @ObfuscatedName("hy.g([BIII)V")
    public final void method3851(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field3214 + (long) arg2 > this.field3217) {
            this.field3215.seek(this.field3217 + 1L);
            this.field3215.write(1);
            throw new EOFException();
        } else {
            this.field3215.write(arg0, arg1, arg2);
            this.field3214 += (long) arg2;
        }
    }

    @ObfuscatedName("hy.j(I)V")
    public final void method3840() throws IOException {
        if (this.field3215 != null) {
            this.field3215.close();
            this.field3215 = null;
        }
    }

    @ObfuscatedName("hy.d(I)J")
    public final long method3837() throws IOException {
        return this.field3215.length();
    }

    @ObfuscatedName("hy.x([BIIB)I")
    public final int method3842(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field3215.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field3214 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field3215 != null) {
            System.out.println("");
            this.method3840();
        }
    }
}
