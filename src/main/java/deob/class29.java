package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("ad")
public final class class29 {

    @ObfuscatedName("ad.f")
    public RandomAccessFile field738;

    @ObfuscatedName("ad.t")
    public long field734;

    @ObfuscatedName("ad.n")
    public long field735;

    public class29(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field738 = new RandomAccessFile(arg0, arg1);
        this.field734 = arg2;
        this.field735 = 0L;
        int var5 = this.field738.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field738.seek(0L);
            this.field738.write(var5);
        }
        this.field738.seek(0L);
    }

    @ObfuscatedName("ad.f(J)V")
    public final void method552(long arg0) throws IOException {
        this.field738.seek(arg0);
        this.field735 = arg0;
    }

    @ObfuscatedName("ad.t([BIII)V")
    public final void method554(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field735 + (long) arg2 > this.field734) {
            this.field738.seek(this.field734 + 1L);
            this.field738.write(1);
            throw new EOFException();
        } else {
            this.field738.write(arg0, arg1, arg2);
            this.field735 += (long) arg2;
        }
    }

    @ObfuscatedName("ad.n(I)V")
    public final void method555() throws IOException {
        if (this.field738 != null) {
            this.field738.close();
            this.field738 = null;
        }
    }

    @ObfuscatedName("ad.e(I)J")
    public final long method556() throws IOException {
        return this.field738.length();
    }

    @ObfuscatedName("ad.l([BIII)I")
    public final int method557(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field738.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field735 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field738 != null) {
            System.out.println("");
            this.method555();
        }
    }
}
