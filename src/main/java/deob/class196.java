package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("gv")
public final class class196 {

    @ObfuscatedName("gv.n")
    public RandomAccessFile field2943;

    @ObfuscatedName("gv.x")
    public long field2937;

    @ObfuscatedName("gv.k")
    public long field2938;

    public class196(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field2943 = new RandomAccessFile(arg0, arg1);
        this.field2937 = arg2;
        this.field2938 = 0L;
        int var5 = this.field2943.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field2943.seek(0L);
            this.field2943.write(var5);
        }
        this.field2943.seek(0L);
    }

    @ObfuscatedName("gv.n(J)V")
    public final void method3381(long arg0) throws IOException {
        this.field2943.seek(arg0);
        this.field2938 = arg0;
    }

    @ObfuscatedName("gv.x([BIII)V")
    public final void method3382(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2938 + (long) arg2 > this.field2937) {
            this.field2943.seek(this.field2937 + 1L);
            this.field2943.write(1);
            throw new EOFException();
        } else {
            this.field2943.write(arg0, arg1, arg2);
            this.field2938 += (long) arg2;
        }
    }

    @ObfuscatedName("gv.k(B)V")
    public final void method3385() throws IOException {
        if (this.field2943 != null) {
            this.field2943.close();
            this.field2943 = null;
        }
    }

    @ObfuscatedName("gv.i(B)J")
    public final long method3384() throws IOException {
        return this.field2943.length();
    }

    @ObfuscatedName("gv.d([BIII)I")
    public final int method3398(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field2943.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field2938 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field2943 != null) {
            System.out.println("");
            this.method3385();
        }
    }
}
