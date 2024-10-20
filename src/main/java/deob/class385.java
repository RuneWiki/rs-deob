package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.SyncFailedException;

@ObfuscatedName("nj")
public final class class385 {

    @ObfuscatedName("nj.l")
    public RandomAccessFile field4235;

    @ObfuscatedName("nj.q")
    public final long field4236;

    @ObfuscatedName("nj.f")
    public long field4237;

    public class385(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() > arg2) {
            arg0.delete();
        }
        this.field4235 = new RandomAccessFile(arg0, arg1);
        this.field4236 = arg2;
        this.field4237 = 0L;
        int var5 = this.field4235.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field4235.seek(0L);
            this.field4235.write(var5);
        }
        this.field4235.seek(0L);
    }

    @ObfuscatedName("nj.l(J)V")
    public final void method6093(long arg0) throws IOException {
        this.field4235.seek(arg0);
        this.field4237 = arg0;
    }

    @ObfuscatedName("nj.q([BIIS)V")
    public final void method6094(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field4237 + (long) arg2 > this.field4236) {
            this.field4235.seek(this.field4236);
            this.field4235.write(1);
            throw new EOFException();
        } else {
            this.field4235.write(arg0, arg1, arg2);
            this.field4237 += (long) arg2;
        }
    }

    @ObfuscatedName("nj.f(B)V")
    public final void method6092() throws IOException {
        this.method6095(false);
    }

    @ObfuscatedName("nj.j(ZB)V")
    public final void method6095(boolean arg0) throws IOException {
        if (this.field4235 == null) {
            return;
        }
        if (arg0) {
            try {
                this.field4235.getFD().sync();
            } catch (SyncFailedException var3) {
            }
        }
        this.field4235.close();
        this.field4235 = null;
    }

    @ObfuscatedName("nj.m(I)J")
    public final long method6100() throws IOException {
        return this.field4235.length();
    }

    @ObfuscatedName("nj.k([BIII)I")
    public final int method6096(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field4235.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field4237 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field4235 != null) {
            System.out.println("");
            this.method6092();
        }
    }
}
