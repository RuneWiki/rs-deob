package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("hg")
public final class class209 {

    @ObfuscatedName("hg.b")
    public RandomAccessFile field2996;

    @ObfuscatedName("hg.e")
    public long field2995;

    @ObfuscatedName("hg.i")
    public long field2997;

    public class209(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field2996 = new RandomAccessFile(arg0, arg1);
        this.field2995 = arg2;
        this.field2997 = 0L;
        int var5 = this.field2996.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field2996.seek(0L);
            this.field2996.write(var5);
        }
        this.field2996.seek(0L);
    }

    @ObfuscatedName("hg.b(J)V")
    public final void method3574(long arg0) throws IOException {
        this.field2996.seek(arg0);
        this.field2997 = arg0;
    }

    @ObfuscatedName("hg.e([BIIB)V")
    public final void method3575(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2997 + (long) arg2 > this.field2995) {
            this.field2996.seek(this.field2995 + 1L);
            this.field2996.write(1);
            throw new EOFException();
        } else {
            this.field2996.write(arg0, arg1, arg2);
            this.field2997 += (long) arg2;
        }
    }

    @ObfuscatedName("hg.i(I)V")
    public final void method3587() throws IOException {
        if (this.field2996 != null) {
            this.field2996.close();
            this.field2996 = null;
        }
    }

    @ObfuscatedName("hg.k(B)J")
    public final long method3581() throws IOException {
        return this.field2996.length();
    }

    @ObfuscatedName("hg.h([BIII)I")
    public final int method3578(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field2996.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field2997 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field2996 != null) {
            System.out.println("");
            this.method3587();
        }
    }
}
