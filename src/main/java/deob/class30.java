package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("at")
public final class class30 {

    @ObfuscatedName("at.i")
    public RandomAccessFile field752;

    @ObfuscatedName("at.b")
    public long field754;

    @ObfuscatedName("at.r")
    public long field750;

    public class30(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field752 = new RandomAccessFile(arg0, arg1);
        this.field754 = arg2;
        this.field750 = 0L;
        int var5 = this.field752.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field752.seek(0L);
            this.field752.write(var5);
        }
        this.field752.seek(0L);
    }

    @ObfuscatedName("at.i(J)V")
    public final void method570(long arg0) throws IOException {
        this.field752.seek(arg0);
        this.field750 = arg0;
    }

    @ObfuscatedName("at.b([BIIB)V")
    public final void method571(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field750 + (long) arg2 > this.field754) {
            this.field752.seek(this.field754 + 1L);
            this.field752.write(1);
            throw new EOFException();
        } else {
            this.field752.write(arg0, arg1, arg2);
            this.field750 += (long) arg2;
        }
    }

    @ObfuscatedName("at.r(I)V")
    public final void method572() throws IOException {
        if (this.field752 != null) {
            this.field752.close();
            this.field752 = null;
        }
    }

    @ObfuscatedName("at.l(I)J")
    public final long method573() throws IOException {
        return this.field752.length();
    }

    @ObfuscatedName("at.s([BIII)I")
    public final int method574(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field752.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field750 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field752 != null) {
            System.out.println("");
            this.method572();
        }
    }
}
