package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("as")
public final class class29 {

    @ObfuscatedName("as.x")
    public RandomAccessFile field724;

    @ObfuscatedName("as.p")
    public long field721;

    @ObfuscatedName("as.k")
    public long field722;

    public class29(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field724 = new RandomAccessFile(arg0, arg1);
        this.field721 = arg2;
        this.field722 = 0L;
        int var5 = this.field724.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field724.seek(0L);
            this.field724.write(var5);
        }
        this.field724.seek(0L);
    }

    @ObfuscatedName("as.x(J)V")
    public final void method539(long arg0) throws IOException {
        this.field724.seek(arg0);
        this.field722 = arg0;
    }

    @ObfuscatedName("as.p([BIIB)V")
    public final void method525(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field722 + (long) arg2 > this.field721) {
            this.field724.seek(this.field721 + 1L);
            this.field724.write(1);
            throw new EOFException();
        } else {
            this.field724.write(arg0, arg1, arg2);
            this.field722 += (long) arg2;
        }
    }

    @ObfuscatedName("as.k(B)V")
    public final void method526() throws IOException {
        if (this.field724 != null) {
            this.field724.close();
            this.field724 = null;
        }
    }

    @ObfuscatedName("as.a(I)J")
    public final long method527() throws IOException {
        return this.field724.length();
    }

    @ObfuscatedName("as.q([BIII)I")
    public final int method524(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field724.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field722 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field724 != null) {
            System.out.println("");
            this.method526();
        }
    }
}
