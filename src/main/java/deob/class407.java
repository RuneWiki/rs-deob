package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.SyncFailedException;

@ObfuscatedName("oo")
public final class class407 {

    @ObfuscatedName("oo.c")
    public RandomAccessFile field4466;

    @ObfuscatedName("oo.l")
    public final long field4464;

    @ObfuscatedName("oo.s")
    public long field4465;

    public class407(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() > arg2) {
            arg0.delete();
        }
        this.field4466 = new RandomAccessFile(arg0, arg1);
        this.field4464 = arg2;
        this.field4465 = 0L;
        int var5 = this.field4466.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field4466.seek(0L);
            this.field4466.write(var5);
        }
        this.field4466.seek(0L);
    }

    @ObfuscatedName("oo.c(J)V")
    public final void method6481(long arg0) throws IOException {
        this.field4466.seek(arg0);
        this.field4465 = arg0;
    }

    @ObfuscatedName("oo.l([BIII)V")
    public final void method6480(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field4465 + (long) arg2 > this.field4464) {
            this.field4466.seek(this.field4464);
            this.field4466.write(1);
            throw new EOFException();
        } else {
            this.field4466.write(arg0, arg1, arg2);
            this.field4465 += (long) arg2;
        }
    }

    @ObfuscatedName("oo.s(I)V")
    public final void method6483() throws IOException {
        this.method6484(false);
    }

    @ObfuscatedName("oo.e(ZI)V")
    public final void method6484(boolean arg0) throws IOException {
        if (this.field4466 == null) {
            return;
        }
        if (arg0) {
            try {
                this.field4466.getFD().sync();
            } catch (SyncFailedException var3) {
            }
        }
        this.field4466.close();
        this.field4466 = null;
    }

    @ObfuscatedName("oo.r(B)J")
    public final long method6485() throws IOException {
        return this.field4466.length();
    }

    @ObfuscatedName("oo.o([BIII)I")
    public final int method6486(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field4466.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field4465 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field4466 != null) {
            System.out.println("");
            this.method6483();
        }
    }
}
