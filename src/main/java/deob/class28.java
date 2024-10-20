package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("aa")
public final class class28 {

    @ObfuscatedName("aa.u")
    public RandomAccessFile field745;

    @ObfuscatedName("aa.k")
    public long field740;

    @ObfuscatedName("aa.x")
    public long field739;

    public class28(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field745 = new RandomAccessFile(arg0, arg1);
        this.field740 = arg2;
        this.field739 = 0L;
        int var5 = this.field745.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field745.seek(0L);
            this.field745.write(var5);
        }
        this.field745.seek(0L);
    }

    @ObfuscatedName("aa.u(J)V")
    public final void method528(long arg0) throws IOException {
        this.field745.seek(arg0);
        this.field739 = arg0;
    }

    @ObfuscatedName("aa.k([BIII)V")
    public final void method529(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field739 + (long) arg2 > this.field740) {
            this.field745.seek(this.field740 + 1L);
            this.field745.write(1);
            throw new EOFException();
        } else {
            this.field745.write(arg0, arg1, arg2);
            this.field739 += (long) arg2;
        }
    }

    @ObfuscatedName("aa.x(B)V")
    public final void method549() throws IOException {
        if (this.field745 != null) {
            this.field745.close();
            this.field745 = null;
        }
    }

    @ObfuscatedName("aa.m(I)J")
    public final long method531() throws IOException {
        return this.field745.length();
    }

    @ObfuscatedName("aa.n([BIII)I")
    public final int method532(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field745.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field739 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field745 != null) {
            System.out.println("");
            this.method549();
        }
    }
}
