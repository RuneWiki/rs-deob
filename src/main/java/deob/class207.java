package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("gh")
public final class class207 {

    @ObfuscatedName("gh.f")
    public RandomAccessFile field2980;

    @ObfuscatedName("gh.k")
    public long field2977;

    @ObfuscatedName("gh.y")
    public long field2979;

    public class207(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field2980 = new RandomAccessFile(arg0, arg1);
        this.field2977 = arg2;
        this.field2979 = 0L;
        int var5 = this.field2980.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field2980.seek(0L);
            this.field2980.write(var5);
        }
        this.field2980.seek(0L);
    }

    @ObfuscatedName("gh.f(J)V")
    public final void method3565(long arg0) throws IOException {
        this.field2980.seek(arg0);
        this.field2979 = arg0;
    }

    @ObfuscatedName("gh.k([BIII)V")
    public final void method3555(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2979 + (long) arg2 > this.field2977) {
            this.field2980.seek(this.field2977 + 1L);
            this.field2980.write(1);
            throw new EOFException();
        } else {
            this.field2980.write(arg0, arg1, arg2);
            this.field2979 += (long) arg2;
        }
    }

    @ObfuscatedName("gh.y(I)V")
    public final void method3562() throws IOException {
        if (this.field2980 != null) {
            this.field2980.close();
            this.field2980 = null;
        }
    }

    @ObfuscatedName("gh.e(I)J")
    public final long method3556() throws IOException {
        return this.field2980.length();
    }

    @ObfuscatedName("gh.r([BIIB)I")
    public final int method3553(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field2980.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field2979 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field2980 != null) {
            System.out.println("");
            this.method3562();
        }
    }
}
