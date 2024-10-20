package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("ae")
public final class class29 {

    @ObfuscatedName("ae.p")
    public RandomAccessFile field751;

    @ObfuscatedName("ae.i")
    public long field750;

    @ObfuscatedName("ae.o")
    public long field753;

    public class29(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field751 = new RandomAccessFile(arg0, arg1);
        this.field750 = arg2;
        this.field753 = 0L;
        int var5 = this.field751.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field751.seek(0L);
            this.field751.write(var5);
        }
        this.field751.seek(0L);
    }

    @ObfuscatedName("ae.p(J)V")
    public final void method587(long arg0) throws IOException {
        this.field751.seek(arg0);
        this.field753 = arg0;
    }

    @ObfuscatedName("ae.i([BIII)V")
    public final void method579(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field753 + (long) arg2 > this.field750) {
            this.field751.seek(this.field750 + 1L);
            this.field751.write(1);
            throw new EOFException();
        } else {
            this.field751.write(arg0, arg1, arg2);
            this.field753 += (long) arg2;
        }
    }

    @ObfuscatedName("ae.o(I)V")
    public final void method594() throws IOException {
        if (this.field751 != null) {
            this.field751.close();
            this.field751 = null;
        }
    }

    @ObfuscatedName("ae.n(I)J")
    public final long method581() throws IOException {
        return this.field751.length();
    }

    @ObfuscatedName("ae.l([BIIB)I")
    public final int method582(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field751.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field753 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field751 != null) {
            System.out.println("");
            this.method594();
        }
    }
}
