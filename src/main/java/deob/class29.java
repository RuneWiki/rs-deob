package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("aj")
public final class class29 {

    @ObfuscatedName("aj.y")
    public RandomAccessFile field738;

    @ObfuscatedName("aj.m")
    public long field736;

    @ObfuscatedName("aj.d")
    public long field748;

    public class29(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field738 = new RandomAccessFile(arg0, arg1);
        this.field736 = arg2;
        this.field748 = 0L;
        int var5 = this.field738.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field738.seek(0L);
            this.field738.write(var5);
        }
        this.field738.seek(0L);
    }

    @ObfuscatedName("aj.y(J)V")
    public final void method542(long arg0) throws IOException {
        this.field738.seek(arg0);
        this.field748 = arg0;
    }

    @ObfuscatedName("aj.m([BIIB)V")
    public final void method556(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field748 + (long) arg2 > this.field736) {
            this.field738.seek(this.field736 + 1L);
            this.field738.write(1);
            throw new EOFException();
        } else {
            this.field738.write(arg0, arg1, arg2);
            this.field748 += (long) arg2;
        }
    }

    @ObfuscatedName("aj.d(B)V")
    public final void method548() throws IOException {
        if (this.field738 != null) {
            this.field738.close();
            this.field738 = null;
        }
    }

    @ObfuscatedName("aj.k(I)J")
    public final long method545() throws IOException {
        return this.field738.length();
    }

    @ObfuscatedName("aj.n([BIII)I")
    public final int method546(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field738.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field748 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field738 != null) {
            System.out.println("");
            this.method548();
        }
    }
}
