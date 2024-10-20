package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.SyncFailedException;

@ObfuscatedName("mk")
public final class class343 {

    @ObfuscatedName("mk.f")
    public RandomAccessFile field4060;

    @ObfuscatedName("mk.i")
    public final long field4061;

    @ObfuscatedName("mk.y")
    public long field4062;

    public class343(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() > arg2) {
            arg0.delete();
        }
        this.field4060 = new RandomAccessFile(arg0, arg1);
        this.field4061 = arg2;
        this.field4062 = 0L;
        int var5 = this.field4060.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field4060.seek(0L);
            this.field4060.write(var5);
        }
        this.field4060.seek(0L);
    }

    @ObfuscatedName("mk.f(J)V")
    public final void method6094(long arg0) throws IOException {
        this.field4060.seek(arg0);
        this.field4062 = arg0;
    }

    @ObfuscatedName("mk.i([BIIB)V")
    public final void method6095(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field4062 + (long) arg2 > this.field4061) {
            this.field4060.seek(this.field4061);
            this.field4060.write(1);
            throw new EOFException();
        } else {
            this.field4060.write(arg0, arg1, arg2);
            this.field4062 += (long) arg2;
        }
    }

    @ObfuscatedName("mk.y(I)V")
    public final void method6105() throws IOException {
        this.method6096(false);
    }

    @ObfuscatedName("mk.w(ZS)V")
    public final void method6096(boolean arg0) throws IOException {
        if (this.field4060 == null) {
            return;
        }
        if (arg0) {
            try {
                this.field4060.getFD().sync();
            } catch (SyncFailedException var3) {
            }
        }
        this.field4060.close();
        this.field4060 = null;
    }

    @ObfuscatedName("mk.p(I)J")
    public final long method6098() throws IOException {
        return this.field4060.length();
    }

    @ObfuscatedName("mk.b([BIII)I")
    public final int method6097(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field4060.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field4062 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field4060 != null) {
            System.out.println("");
            this.method6105();
        }
    }
}
