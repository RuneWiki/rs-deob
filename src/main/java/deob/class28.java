package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("ad")
public final class class28 {

    @ObfuscatedName("ad.c")
    public RandomAccessFile field737;

    @ObfuscatedName("ad.j")
    public long field744;

    @ObfuscatedName("ad.f")
    public long field740;

    public class28(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field737 = new RandomAccessFile(arg0, arg1);
        this.field744 = arg2;
        this.field740 = 0L;
        int var5 = this.field737.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field737.seek(0L);
            this.field737.write(var5);
        }
        this.field737.seek(0L);
    }

    @ObfuscatedName("ad.c(J)V")
    public final void method509(long arg0) throws IOException {
        this.field737.seek(arg0);
        this.field740 = arg0;
    }

    @ObfuscatedName("ad.j([BIII)V")
    public final void method511(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field740 + (long) arg2 > this.field744) {
            this.field737.seek(this.field744 + 1L);
            this.field737.write(1);
            throw new EOFException();
        } else {
            this.field737.write(arg0, arg1, arg2);
            this.field740 += (long) arg2;
        }
    }

    @ObfuscatedName("ad.f(B)V")
    public final void method510() throws IOException {
        if (this.field737 != null) {
            this.field737.close();
            this.field737 = null;
        }
    }

    @ObfuscatedName("ad.y(I)J")
    public final long method512() throws IOException {
        return this.field737.length();
    }

    @ObfuscatedName("ad.x([BIII)I")
    public final int method517(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field737.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field740 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field737 != null) {
            System.out.println("");
            this.method510();
        }
    }
}
