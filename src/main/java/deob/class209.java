package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("hs")
public final class class209 {

    @ObfuscatedName("hs.v")
    public RandomAccessFile field3004;

    @ObfuscatedName("hs.t")
    public long field3003;

    @ObfuscatedName("hs.f")
    public long field3002;

    public class209(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field3004 = new RandomAccessFile(arg0, arg1);
        this.field3003 = arg2;
        this.field3002 = 0L;
        int var5 = this.field3004.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field3004.seek(0L);
            this.field3004.write(var5);
        }
        this.field3004.seek(0L);
    }

    @ObfuscatedName("hs.v(J)V")
    public final void method3580(long arg0) throws IOException {
        this.field3004.seek(arg0);
        this.field3002 = arg0;
    }

    @ObfuscatedName("hs.t([BIII)V")
    public final void method3591(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field3002 + (long) arg2 > this.field3003) {
            this.field3004.seek(this.field3003 + 1L);
            this.field3004.write(1);
            throw new EOFException();
        } else {
            this.field3004.write(arg0, arg1, arg2);
            this.field3002 += (long) arg2;
        }
    }

    @ObfuscatedName("hs.f(I)V")
    public final void method3579() throws IOException {
        if (this.field3004 != null) {
            this.field3004.close();
            this.field3004 = null;
        }
    }

    @ObfuscatedName("hs.j(B)J")
    public final long method3587() throws IOException {
        return this.field3004.length();
    }

    @ObfuscatedName("hs.l([BIII)I")
    public final int method3583(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field3004.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field3002 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field3004 != null) {
            System.out.println("");
            this.method3579();
        }
    }
}
