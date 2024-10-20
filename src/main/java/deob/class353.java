package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.SyncFailedException;

@ObfuscatedName("my")
public final class class353 {

    @ObfuscatedName("my.m")
    public RandomAccessFile field4089;

    @ObfuscatedName("my.o")
    public final long field4088;

    @ObfuscatedName("my.q")
    public long field4087;

    public class353(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() > arg2) {
            arg0.delete();
        }
        this.field4089 = new RandomAccessFile(arg0, arg1);
        this.field4088 = arg2;
        this.field4087 = 0L;
        int var5 = this.field4089.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field4089.seek(0L);
            this.field4089.write(var5);
        }
        this.field4089.seek(0L);
    }

    @ObfuscatedName("my.m(J)V")
    public final void method6235(long arg0) throws IOException {
        this.field4089.seek(arg0);
        this.field4087 = arg0;
    }

    @ObfuscatedName("my.o([BIII)V")
    public final void method6223(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field4087 + (long) arg2 > this.field4088) {
            this.field4089.seek(this.field4088);
            this.field4089.write(1);
            throw new EOFException();
        } else {
            this.field4089.write(arg0, arg1, arg2);
            this.field4087 += (long) arg2;
        }
    }

    @ObfuscatedName("my.q(I)V")
    public final void method6232() throws IOException {
        this.method6226(false);
    }

    @ObfuscatedName("my.j(ZB)V")
    public final void method6226(boolean arg0) throws IOException {
        if (this.field4089 == null) {
            return;
        }
        if (arg0) {
            try {
                this.field4089.getFD().sync();
            } catch (SyncFailedException var3) {
            }
        }
        this.field4089.close();
        this.field4089 = null;
    }

    @ObfuscatedName("my.p(I)J")
    public final long method6227() throws IOException {
        return this.field4089.length();
    }

    @ObfuscatedName("my.g([BIII)I")
    public final int method6228(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field4089.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field4087 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field4089 != null) {
            System.out.println("");
            this.method6232();
        }
    }
}
