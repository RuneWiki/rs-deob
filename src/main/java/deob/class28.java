package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("az")
public final class class28 {

    @ObfuscatedName("az.v")
    public RandomAccessFile field733;

    @ObfuscatedName("az.f")
    public long field734;

    @ObfuscatedName("az.n")
    public long field739;

    public class28(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field733 = new RandomAccessFile(arg0, arg1);
        this.field734 = arg2;
        this.field739 = 0L;
        int var5 = this.field733.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field733.seek(0L);
            this.field733.write(var5);
        }
        this.field733.seek(0L);
    }

    @ObfuscatedName("az.v(J)V")
    public final void method555(long arg0) throws IOException {
        this.field733.seek(arg0);
        this.field739 = arg0;
    }

    @ObfuscatedName("az.f([BIII)V")
    public final void method556(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field739 + (long) arg2 > this.field734) {
            this.field733.seek(this.field734 + 1L);
            this.field733.write(1);
            throw new EOFException();
        } else {
            this.field733.write(arg0, arg1, arg2);
            this.field739 += (long) arg2;
        }
    }

    @ObfuscatedName("az.n(I)V")
    public final void method554() throws IOException {
        if (this.field733 != null) {
            this.field733.close();
            this.field733 = null;
        }
    }

    @ObfuscatedName("az.c(I)J")
    public final long method558() throws IOException {
        return this.field733.length();
    }

    @ObfuscatedName("az.r([BIIB)I")
    public final int method570(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field733.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field739 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field733 != null) {
            System.out.println("");
            this.method554();
        }
    }
}
