package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("au")
public final class class29 {

    @ObfuscatedName("au.g")
    public RandomAccessFile field745;

    @ObfuscatedName("au.m")
    public long field744;

    @ObfuscatedName("au.v")
    public long field747;

    public class29(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field745 = new RandomAccessFile(arg0, arg1);
        this.field744 = arg2;
        this.field747 = 0L;
        int var5 = this.field745.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field745.seek(0L);
            this.field745.write(var5);
        }
        this.field745.seek(0L);
    }

    @ObfuscatedName("au.g(J)V")
    public final void method564(long arg0) throws IOException {
        this.field745.seek(arg0);
        this.field747 = arg0;
    }

    @ObfuscatedName("au.m([BIII)V")
    public final void method543(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field747 + (long) arg2 > this.field744) {
            this.field745.seek(this.field744 + 1L);
            this.field745.write(1);
            throw new EOFException();
        } else {
            this.field745.write(arg0, arg1, arg2);
            this.field747 += (long) arg2;
        }
    }

    @ObfuscatedName("au.v(B)V")
    public final void method544() throws IOException {
        if (this.field745 != null) {
            this.field745.close();
            this.field745 = null;
        }
    }

    @ObfuscatedName("au.r(B)J")
    public final long method548() throws IOException {
        return this.field745.length();
    }

    @ObfuscatedName("au.n([BIII)I")
    public final int method546(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field745.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field747 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field745 != null) {
            System.out.println("");
            this.method544();
        }
    }
}
