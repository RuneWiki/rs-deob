package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.SyncFailedException;

@ObfuscatedName("ph")
public final class class424 {

    @ObfuscatedName("ph.v")
    public RandomAccessFile field4565;

    @ObfuscatedName("ph.c")
    public final long field4567;

    @ObfuscatedName("ph.i")
    public long field4566;

    public class424(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() > arg2) {
            arg0.delete();
        }
        this.field4565 = new RandomAccessFile(arg0, arg1);
        this.field4567 = arg2;
        this.field4566 = 0L;
        int var5 = this.field4565.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field4565.seek(0L);
            this.field4565.write(var5);
        }
        this.field4565.seek(0L);
    }

    @ObfuscatedName("ph.v(J)V")
    public final void method6806(long arg0) throws IOException {
        this.field4565.seek(arg0);
        this.field4566 = arg0;
    }

    @ObfuscatedName("ph.c([BIII)V")
    public final void method6822(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field4566 + (long) arg2 > this.field4567) {
            this.field4565.seek(this.field4567);
            this.field4565.write(1);
            throw new EOFException();
        } else {
            this.field4565.write(arg0, arg1, arg2);
            this.field4566 += (long) arg2;
        }
    }

    @ObfuscatedName("ph.i(I)V")
    public final void method6814() throws IOException {
        this.method6808(false);
    }

    @ObfuscatedName("ph.f(ZI)V")
    public final void method6808(boolean arg0) throws IOException {
        if (this.field4565 == null) {
            return;
        }
        if (arg0) {
            try {
                this.field4565.getFD().sync();
            } catch (SyncFailedException var3) {
            }
        }
        this.field4565.close();
        this.field4565 = null;
    }

    @ObfuscatedName("ph.b(I)J")
    public final long method6813() throws IOException {
        return this.field4565.length();
    }

    @ObfuscatedName("ph.n([BIIB)I")
    public final int method6810(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field4565.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field4566 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field4565 != null) {
            System.out.println("");
            this.method6814();
        }
    }
}
