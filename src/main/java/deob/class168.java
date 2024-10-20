package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("aw")
public final class class168 {

    @ObfuscatedName("aw.b")
    public RandomAccessFile field2499;

    @ObfuscatedName("aw.k")
    public long field2496;

    @ObfuscatedName("aw.h")
    public long field2497;

    @ObfuscatedName("aw.t([BIII)I")
    public final int method2910(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field2499.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field2496 += (long) var4;
        }
        return var4;
    }

    @ObfuscatedName("aw.h([BIII)V")
    public final void method2912(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2496 + (long) arg2 > this.field2497) {
            this.field2499.seek(this.field2497 + 1L);
            this.field2499.write(1);
            throw new EOFException();
        } else {
            this.field2499.write(arg0, arg1, arg2);
            this.field2496 += (long) arg2;
        }
    }

    @ObfuscatedName("aw.k(B)V")
    public final void method2913() throws IOException {
        if (this.field2499 != null) {
            this.field2499.close();
            this.field2499 = null;
        }
    }

    public void finalize() throws Throwable {
        if (this.field2499 != null) {
            System.out.println("");
            this.method2913();
        }
    }

    @ObfuscatedName("aw.b(J)V")
    public final void method2921(long arg0) throws IOException {
        this.field2499.seek(arg0);
        this.field2496 = arg0;
    }

    @ObfuscatedName("aw.w(S)J")
    public final long method2928() throws IOException {
        return this.field2499.length();
    }

    public class168(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field2499 = new RandomAccessFile(arg0, arg1);
        this.field2497 = arg2;
        this.field2496 = 0L;
        int var5 = this.field2499.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field2499.seek(0L);
            this.field2499.write(var5);
        }
        this.field2499.seek(0L);
    }
}
