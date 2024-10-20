package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("hd")
public final class class218 {

    @ObfuscatedName("hd.t")
    public RandomAccessFile field3112;

    @ObfuscatedName("hd.b")
    public long field3110;

    @ObfuscatedName("hd.p")
    public long field3111;

    public class218(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field3112 = new RandomAccessFile(arg0, arg1);
        this.field3110 = arg2;
        this.field3111 = 0L;
        int var5 = this.field3112.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field3112.seek(0L);
            this.field3112.write(var5);
        }
        this.field3112.seek(0L);
    }

    @ObfuscatedName("hd.t(J)V")
    public final void method3687(long arg0) throws IOException {
        this.field3112.seek(arg0);
        this.field3111 = arg0;
    }

    @ObfuscatedName("hd.b([BIII)V")
    public final void method3692(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field3111 + (long) arg2 > this.field3110) {
            this.field3112.seek(this.field3110 + 1L);
            this.field3112.write(1);
            throw new EOFException();
        } else {
            this.field3112.write(arg0, arg1, arg2);
            this.field3111 += (long) arg2;
        }
    }

    @ObfuscatedName("hd.p(I)V")
    public final void method3689() throws IOException {
        if (this.field3112 != null) {
            this.field3112.close();
            this.field3112 = null;
        }
    }

    @ObfuscatedName("hd.e(S)J")
    public final long method3690() throws IOException {
        return this.field3112.length();
    }

    @ObfuscatedName("hd.i([BIII)I")
    public final int method3702(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field3112.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field3111 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field3112 != null) {
            System.out.println("");
            this.method3689();
        }
    }
}
