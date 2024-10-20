package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.SyncFailedException;

@ObfuscatedName("pk")
public final class class427 {

    @ObfuscatedName("pk.c")
    public RandomAccessFile field4665;

    @ObfuscatedName("pk.p")
    public final long field4664;

    @ObfuscatedName("pk.f")
    public long field4666;

    public class427(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() > arg2) {
            arg0.delete();
        }
        this.field4665 = new RandomAccessFile(arg0, arg1);
        this.field4664 = arg2;
        this.field4666 = 0L;
        int var5 = this.field4665.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field4665.seek(0L);
            this.field4665.write(var5);
        }
        this.field4665.seek(0L);
    }

    @ObfuscatedName("pk.c(J)V")
    public final void method6972(long arg0) throws IOException {
        this.field4665.seek(arg0);
        this.field4666 = arg0;
    }

    @ObfuscatedName("pk.p([BIII)V")
    public final void method6973(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field4666 + (long) arg2 > this.field4664) {
            this.field4665.seek(this.field4664);
            this.field4665.write(1);
            throw new EOFException();
        } else {
            this.field4665.write(arg0, arg1, arg2);
            this.field4666 += (long) arg2;
        }
    }

    @ObfuscatedName("pk.f(I)V")
    public final void method6991() throws IOException {
        this.method6975(false);
    }

    @ObfuscatedName("pk.n(ZI)V")
    public final void method6975(boolean arg0) throws IOException {
        if (this.field4665 == null) {
            return;
        }
        if (arg0) {
            try {
                this.field4665.getFD().sync();
            } catch (SyncFailedException var3) {
            }
        }
        this.field4665.close();
        this.field4665 = null;
    }

    @ObfuscatedName("pk.k(I)J")
    public final long method6976() throws IOException {
        return this.field4665.length();
    }

    @ObfuscatedName("pk.w([BIIB)I")
    public final int method6977(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field4665.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field4666 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field4665 != null) {
            System.out.println("");
            this.method6991();
        }
    }
}
