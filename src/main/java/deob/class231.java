package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("hz")
public final class class231 {

    @ObfuscatedName("hz.x")
    public RandomAccessFile field3261;

    @ObfuscatedName("hz.r")
    public long field3263;

    @ObfuscatedName("hz.j")
    public long field3262;

    public class231(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field3261 = new RandomAccessFile(arg0, arg1);
        this.field3263 = arg2;
        this.field3262 = 0L;
        int var5 = this.field3261.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field3261.seek(0L);
            this.field3261.write(var5);
        }
        this.field3261.seek(0L);
    }

    @ObfuscatedName("hz.x(J)V")
    public final void method3878(long arg0) throws IOException {
        this.field3261.seek(arg0);
        this.field3262 = arg0;
    }

    @ObfuscatedName("hz.r([BIIB)V")
    public final void method3879(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field3262 + (long) arg2 > this.field3263) {
            this.field3261.seek(this.field3263 + 1L);
            this.field3261.write(1);
            throw new EOFException();
        } else {
            this.field3261.write(arg0, arg1, arg2);
            this.field3262 += (long) arg2;
        }
    }

    @ObfuscatedName("hz.j(I)V")
    public final void method3880() throws IOException {
        if (this.field3261 != null) {
            this.field3261.close();
            this.field3261 = null;
        }
    }

    @ObfuscatedName("hz.z(I)J")
    public final long method3881() throws IOException {
        return this.field3261.length();
    }

    @ObfuscatedName("hz.i([BIII)I")
    public final int method3898(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field3261.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field3262 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field3261 != null) {
            System.out.println("");
            this.method3880();
        }
    }
}
