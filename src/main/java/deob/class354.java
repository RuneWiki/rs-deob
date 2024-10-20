package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.SyncFailedException;

@ObfuscatedName("my")
public final class class354 {

    @ObfuscatedName("my.h")
    public RandomAccessFile field4100;

    @ObfuscatedName("my.v")
    public final long field4101;

    @ObfuscatedName("my.x")
    public long field4103;

    public class354(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() > arg2) {
            arg0.delete();
        }
        this.field4100 = new RandomAccessFile(arg0, arg1);
        this.field4101 = arg2;
        this.field4103 = 0L;
        int var5 = this.field4100.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field4100.seek(0L);
            this.field4100.write(var5);
        }
        this.field4100.seek(0L);
    }

    @ObfuscatedName("my.h(J)V")
    public final void method6130(long arg0) throws IOException {
        this.field4100.seek(arg0);
        this.field4103 = arg0;
    }

    @ObfuscatedName("my.v([BIII)V")
    public final void method6131(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field4103 + (long) arg2 > this.field4101) {
            this.field4100.seek(this.field4101);
            this.field4100.write(1);
            throw new EOFException();
        } else {
            this.field4100.write(arg0, arg1, arg2);
            this.field4103 += (long) arg2;
        }
    }

    @ObfuscatedName("my.x(B)V")
    public final void method6135() throws IOException {
        this.method6141(false);
    }

    @ObfuscatedName("my.w(ZI)V")
    public final void method6141(boolean arg0) throws IOException {
        if (this.field4100 == null) {
            return;
        }
        if (arg0) {
            try {
                this.field4100.getFD().sync();
            } catch (SyncFailedException var3) {
            }
        }
        this.field4100.close();
        this.field4100 = null;
    }

    @ObfuscatedName("my.t(I)J")
    public final long method6134() throws IOException {
        return this.field4100.length();
    }

    @ObfuscatedName("my.j([BIII)I")
    public final int method6133(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field4100.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field4103 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field4100 != null) {
            System.out.println("");
            this.method6135();
        }
    }
}
