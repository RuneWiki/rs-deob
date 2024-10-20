package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("au")
public final class class29 {

    @ObfuscatedName("au.j")
    public RandomAccessFile field749;

    @ObfuscatedName("au.r")
    public long field745;

    @ObfuscatedName("au.v")
    public long field744;

    public class29(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field749 = new RandomAccessFile(arg0, arg1);
        this.field745 = arg2;
        this.field744 = 0L;
        int var5 = this.field749.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field749.seek(0L);
            this.field749.write(var5);
        }
        this.field749.seek(0L);
    }

    @ObfuscatedName("au.j(J)V")
    public final void method551(long arg0) throws IOException {
        this.field749.seek(arg0);
        this.field744 = arg0;
    }

    @ObfuscatedName("au.r([BIII)V")
    public final void method567(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field744 + (long) arg2 > this.field745) {
            this.field749.seek(this.field745 + 1L);
            this.field749.write(1);
            throw new EOFException();
        } else {
            this.field749.write(arg0, arg1, arg2);
            this.field744 += (long) arg2;
        }
    }

    @ObfuscatedName("au.v(I)V")
    public final void method554() throws IOException {
        if (this.field749 != null) {
            this.field749.close();
            this.field749 = null;
        }
    }

    @ObfuscatedName("au.p(B)J")
    public final long method553() throws IOException {
        return this.field749.length();
    }

    @ObfuscatedName("au.e([BIII)I")
    public final int method560(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field749.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field744 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field749 != null) {
            System.out.println("");
            this.method554();
        }
    }
}
