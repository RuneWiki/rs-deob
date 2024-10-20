package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("au")
public final class class29 {

    @ObfuscatedName("au.a")
    public RandomAccessFile field737;

    @ObfuscatedName("au.r")
    public long field729;

    @ObfuscatedName("au.u")
    public long field730;

    public class29(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field737 = new RandomAccessFile(arg0, arg1);
        this.field729 = arg2;
        this.field730 = 0L;
        int var5 = this.field737.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field737.seek(0L);
            this.field737.write(var5);
        }
        this.field737.seek(0L);
    }

    @ObfuscatedName("au.a(J)V")
    public final void method516(long arg0) throws IOException {
        this.field737.seek(arg0);
        this.field730 = arg0;
    }

    @ObfuscatedName("au.r([BIII)V")
    public final void method509(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field730 + (long) arg2 > this.field729) {
            this.field737.seek(this.field729 + 1L);
            this.field737.write(1);
            throw new EOFException();
        } else {
            this.field737.write(arg0, arg1, arg2);
            this.field730 += (long) arg2;
        }
    }

    @ObfuscatedName("au.u(I)V")
    public final void method514() throws IOException {
        if (this.field737 != null) {
            this.field737.close();
            this.field737 = null;
        }
    }

    @ObfuscatedName("au.t(I)J")
    public final long method527() throws IOException {
        return this.field737.length();
    }

    @ObfuscatedName("au.k([BIII)I")
    public final int method512(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field737.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field730 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field737 != null) {
            System.out.println("");
            this.method514();
        }
    }
}
