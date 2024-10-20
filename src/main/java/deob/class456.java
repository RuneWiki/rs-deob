package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.SyncFailedException;

@ObfuscatedName("qr")
public final class class456 {

    @ObfuscatedName("qr.f")
    public RandomAccessFile field4869;

    @ObfuscatedName("qr.w")
    public final long field4868;

    @ObfuscatedName("qr.v")
    public long field4870;

    public class456(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() > arg2) {
            arg0.delete();
        }
        this.field4869 = new RandomAccessFile(arg0, arg1);
        this.field4868 = arg2;
        this.field4870 = 0L;
        int var5 = this.field4869.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field4869.seek(0L);
            this.field4869.write(var5);
        }
        this.field4869.seek(0L);
    }

    @ObfuscatedName("qr.f(J)V")
    public final void method7744(long arg0) throws IOException {
        this.field4869.seek(arg0);
        this.field4870 = arg0;
    }

    @ObfuscatedName("qr.w([BIII)V")
    public final void method7734(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field4870 + (long) arg2 > this.field4868) {
            this.field4869.seek(this.field4868);
            this.field4869.write(1);
            throw new EOFException();
        } else {
            this.field4869.write(arg0, arg1, arg2);
            this.field4870 += (long) arg2;
        }
    }

    @ObfuscatedName("qr.v(I)V")
    public final void method7735() throws IOException {
        this.method7736(false);
    }

    @ObfuscatedName("qr.s(ZB)V")
    public final void method7736(boolean arg0) throws IOException {
        if (this.field4869 == null) {
            return;
        }
        if (arg0) {
            try {
                this.field4869.getFD().sync();
            } catch (SyncFailedException var3) {
            }
        }
        this.field4869.close();
        this.field4869 = null;
    }

    @ObfuscatedName("qr.z(B)J")
    public final long method7739() throws IOException {
        return this.field4869.length();
    }

    @ObfuscatedName("qr.j([BIII)I")
    public final int method7738(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field4869.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field4870 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field4869 != null) {
            System.out.println("");
            this.method7735();
        }
    }
}
