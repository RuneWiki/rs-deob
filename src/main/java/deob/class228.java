package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("ha")
public final class class228 {

    @ObfuscatedName("ha.s")
    public RandomAccessFile field3217;

    @ObfuscatedName("ha.j")
    public long field3218;

    @ObfuscatedName("ha.p")
    public long field3216;

    public class228(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field3217 = new RandomAccessFile(arg0, arg1);
        this.field3218 = arg2;
        this.field3216 = 0L;
        int var5 = this.field3217.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field3217.seek(0L);
            this.field3217.write(var5);
        }
        this.field3217.seek(0L);
    }

    @ObfuscatedName("ha.s(J)V")
    public final void method3837(long arg0) throws IOException {
        this.field3217.seek(arg0);
        this.field3216 = arg0;
    }

    @ObfuscatedName("ha.j([BIII)V")
    public final void method3838(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field3216 + (long) arg2 > this.field3218) {
            this.field3217.seek(this.field3218 + 1L);
            this.field3217.write(1);
            throw new EOFException();
        } else {
            this.field3217.write(arg0, arg1, arg2);
            this.field3216 += (long) arg2;
        }
    }

    @ObfuscatedName("ha.p(I)V")
    public final void method3853() throws IOException {
        if (this.field3217 != null) {
            this.field3217.close();
            this.field3217 = null;
        }
    }

    @ObfuscatedName("ha.x(B)J")
    public final long method3840() throws IOException {
        return this.field3217.length();
    }

    @ObfuscatedName("ha.d([BIII)I")
    public final int method3851(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field3217.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field3216 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field3217 != null) {
            System.out.println("");
            this.method3853();
        }
    }
}
