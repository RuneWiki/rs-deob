package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("hz")
public final class class228 {

    @ObfuscatedName("hz.f")
    public RandomAccessFile field3219;

    @ObfuscatedName("hz.u")
    public long field3218;

    @ObfuscatedName("hz.x")
    public long field3217;

    public class228(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field3219 = new RandomAccessFile(arg0, arg1);
        this.field3218 = arg2;
        this.field3217 = 0L;
        int var5 = this.field3219.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field3219.seek(0L);
            this.field3219.write(var5);
        }
        this.field3219.seek(0L);
    }

    @ObfuscatedName("hz.f(J)V")
    public final void method3872(long arg0) throws IOException {
        this.field3219.seek(arg0);
        this.field3217 = arg0;
    }

    @ObfuscatedName("hz.u([BIII)V")
    public final void method3883(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field3217 + (long) arg2 > this.field3218) {
            this.field3219.seek(this.field3218 + 1L);
            this.field3219.write(1);
            throw new EOFException();
        } else {
            this.field3219.write(arg0, arg1, arg2);
            this.field3217 += (long) arg2;
        }
    }

    @ObfuscatedName("hz.x(B)V")
    public final void method3874() throws IOException {
        if (this.field3219 != null) {
            this.field3219.close();
            this.field3219 = null;
        }
    }

    @ObfuscatedName("hz.b(I)J")
    public final long method3875() throws IOException {
        return this.field3219.length();
    }

    @ObfuscatedName("hz.l([BIII)I")
    public final int method3871(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field3219.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field3217 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field3219 != null) {
            System.out.println("");
            this.method3874();
        }
    }
}
