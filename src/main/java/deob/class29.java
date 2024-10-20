package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("ac")
public final class class29 {

    @ObfuscatedName("ac.i")
    public RandomAccessFile field765;

    @ObfuscatedName("ac.v")
    public long field761;

    @ObfuscatedName("ac.m")
    public long field762;

    public class29(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field765 = new RandomAccessFile(arg0, arg1);
        this.field761 = arg2;
        this.field762 = 0L;
        int var5 = this.field765.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field765.seek(0L);
            this.field765.write(var5);
        }
        this.field765.seek(0L);
    }

    @ObfuscatedName("ac.i(J)V")
    public final void method578(long arg0) throws IOException {
        this.field765.seek(arg0);
        this.field762 = arg0;
    }

    @ObfuscatedName("ac.v([BIIS)V")
    public final void method579(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field762 + (long) arg2 > this.field761) {
            this.field765.seek(this.field761 + 1L);
            this.field765.write(1);
            throw new EOFException();
        } else {
            this.field765.write(arg0, arg1, arg2);
            this.field762 += (long) arg2;
        }
    }

    @ObfuscatedName("ac.m(B)V")
    public final void method572() throws IOException {
        if (this.field765 != null) {
            this.field765.close();
            this.field765 = null;
        }
    }

    @ObfuscatedName("ac.j(I)J")
    public final long method573() throws IOException {
        return this.field765.length();
    }

    @ObfuscatedName("ac.o([BIII)I")
    public final int method571(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field765.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field762 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field765 != null) {
            System.out.println("");
            this.method572();
        }
    }
}
