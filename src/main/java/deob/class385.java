package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.SyncFailedException;

@ObfuscatedName("nv")
public final class class385 {

    @ObfuscatedName("nv.i")
    public RandomAccessFile field4244;

    @ObfuscatedName("nv.w")
    public final long field4242;

    @ObfuscatedName("nv.s")
    public long field4243;

    public class385(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() > arg2) {
            arg0.delete();
        }
        this.field4244 = new RandomAccessFile(arg0, arg1);
        this.field4242 = arg2;
        this.field4243 = 0L;
        int var5 = this.field4244.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field4244.seek(0L);
            this.field4244.write(var5);
        }
        this.field4244.seek(0L);
    }

    @ObfuscatedName("nv.i(J)V")
    public final void method6060(long arg0) throws IOException {
        this.field4244.seek(arg0);
        this.field4243 = arg0;
    }

    @ObfuscatedName("nv.w([BIIS)V")
    public final void method6061(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field4243 + (long) arg2 > this.field4242) {
            this.field4244.seek(this.field4242);
            this.field4244.write(1);
            throw new EOFException();
        } else {
            this.field4244.write(arg0, arg1, arg2);
            this.field4243 += (long) arg2;
        }
    }

    @ObfuscatedName("nv.s(B)V")
    public final void method6062() throws IOException {
        this.method6063(false);
    }

    @ObfuscatedName("nv.a(ZB)V")
    public final void method6063(boolean arg0) throws IOException {
        if (this.field4244 == null) {
            return;
        }
        if (arg0) {
            try {
                this.field4244.getFD().sync();
            } catch (SyncFailedException var3) {
            }
        }
        this.field4244.close();
        this.field4244 = null;
    }

    @ObfuscatedName("nv.o(I)J")
    public final long method6075() throws IOException {
        return this.field4244.length();
    }

    @ObfuscatedName("nv.g([BIII)I")
    public final int method6065(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field4244.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field4243 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field4244 != null) {
            System.out.println("");
            this.method6062();
        }
    }
}
