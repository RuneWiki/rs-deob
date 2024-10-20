package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("hu")
public final class class217 {

    @ObfuscatedName("hu.q")
    public RandomAccessFile field3061;

    @ObfuscatedName("hu.s")
    public long field3060;

    @ObfuscatedName("hu.h")
    public long field3059;

    public class217(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field3061 = new RandomAccessFile(arg0, arg1);
        this.field3060 = arg2;
        this.field3059 = 0L;
        int var5 = this.field3061.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field3061.seek(0L);
            this.field3061.write(var5);
        }
        this.field3061.seek(0L);
    }

    @ObfuscatedName("hu.q(J)V")
    public final void method3581(long arg0) throws IOException {
        this.field3061.seek(arg0);
        this.field3059 = arg0;
    }

    @ObfuscatedName("hu.s([BIIB)V")
    public final void method3596(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field3059 + (long) arg2 > this.field3060) {
            this.field3061.seek(this.field3060 + 1L);
            this.field3061.write(1);
            throw new EOFException();
        } else {
            this.field3061.write(arg0, arg1, arg2);
            this.field3059 += (long) arg2;
        }
    }

    @ObfuscatedName("hu.h(B)V")
    public final void method3584() throws IOException {
        if (this.field3061 != null) {
            this.field3061.close();
            this.field3061 = null;
        }
    }

    @ObfuscatedName("hu.e(I)J")
    public final long method3585() throws IOException {
        return this.field3061.length();
    }

    @ObfuscatedName("hu.n([BIIB)I")
    public final int method3597(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field3061.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field3059 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field3061 != null) {
            System.out.println("");
            this.method3584();
        }
    }
}
