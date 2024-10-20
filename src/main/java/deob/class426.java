package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.SyncFailedException;

@ObfuscatedName("pu")
public final class class426 {

    @ObfuscatedName("pu.o")
    public RandomAccessFile field4626;

    @ObfuscatedName("pu.q")
    public final long field4627;

    @ObfuscatedName("pu.l")
    public long field4625;

    public class426(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() > arg2) {
            arg0.delete();
        }
        this.field4626 = new RandomAccessFile(arg0, arg1);
        this.field4627 = arg2;
        this.field4625 = 0L;
        int var5 = this.field4626.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field4626.seek(0L);
            this.field4626.write(var5);
        }
        this.field4626.seek(0L);
    }

    @ObfuscatedName("pu.o(J)V")
    public final void method6726(long arg0) throws IOException {
        this.field4626.seek(arg0);
        this.field4625 = arg0;
    }

    @ObfuscatedName("pu.q([BIII)V")
    public final void method6735(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field4625 + (long) arg2 > this.field4627) {
            this.field4626.seek(this.field4627);
            this.field4626.write(1);
            throw new EOFException();
        } else {
            this.field4626.write(arg0, arg1, arg2);
            this.field4625 += (long) arg2;
        }
    }

    @ObfuscatedName("pu.l(B)V")
    public final void method6725() throws IOException {
        this.method6723(false);
    }

    @ObfuscatedName("pu.k(ZB)V")
    public final void method6723(boolean arg0) throws IOException {
        if (this.field4626 == null) {
            return;
        }
        if (arg0) {
            try {
                this.field4626.getFD().sync();
            } catch (SyncFailedException var3) {
            }
        }
        this.field4626.close();
        this.field4626 = null;
    }

    @ObfuscatedName("pu.a(I)J")
    public final long method6724() throws IOException {
        return this.field4626.length();
    }

    @ObfuscatedName("pu.m([BIIB)I")
    public final int method6731(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field4626.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field4625 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field4626 != null) {
            System.out.println("");
            this.method6725();
        }
    }
}
