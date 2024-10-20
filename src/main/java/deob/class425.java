package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.SyncFailedException;

@ObfuscatedName("pn")
public final class class425 {

    @ObfuscatedName("pn.c")
    public RandomAccessFile field4631;

    @ObfuscatedName("pn.v")
    public final long field4628;

    @ObfuscatedName("pn.q")
    public long field4629;

    public class425(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() > arg2) {
            arg0.delete();
        }
        this.field4631 = new RandomAccessFile(arg0, arg1);
        this.field4628 = arg2;
        this.field4629 = 0L;
        int var5 = this.field4631.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field4631.seek(0L);
            this.field4631.write(var5);
        }
        this.field4631.seek(0L);
    }

    @ObfuscatedName("pn.c(J)V")
    public final void method6822(long arg0) throws IOException {
        this.field4631.seek(arg0);
        this.field4629 = arg0;
    }

    @ObfuscatedName("pn.v([BIII)V")
    public final void method6812(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field4629 + (long) arg2 > this.field4628) {
            this.field4631.seek(this.field4628);
            this.field4631.write(1);
            throw new EOFException();
        } else {
            this.field4631.write(arg0, arg1, arg2);
            this.field4629 += (long) arg2;
        }
    }

    @ObfuscatedName("pn.q(I)V")
    public final void method6806() throws IOException {
        this.method6807(false);
    }

    @ObfuscatedName("pn.f(ZI)V")
    public final void method6807(boolean arg0) throws IOException {
        if (this.field4631 == null) {
            return;
        }
        if (arg0) {
            try {
                this.field4631.getFD().sync();
            } catch (SyncFailedException var3) {
            }
        }
        this.field4631.close();
        this.field4631 = null;
    }

    @ObfuscatedName("pn.j(I)J")
    public final long method6808() throws IOException {
        return this.field4631.length();
    }

    @ObfuscatedName("pn.e([BIII)I")
    public final int method6809(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field4631.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field4629 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field4631 != null) {
            System.out.println("");
            this.method6806();
        }
    }
}
