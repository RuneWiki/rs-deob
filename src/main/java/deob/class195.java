package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("gb")
public final class class195 {

    @ObfuscatedName("gb.k")
    public RandomAccessFile field2924;

    @ObfuscatedName("gb.b")
    public long field2922;

    @ObfuscatedName("gb.e")
    public long field2923;

    public class195(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field2924 = new RandomAccessFile(arg0, arg1);
        this.field2922 = arg2;
        this.field2923 = 0L;
        int var5 = this.field2924.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field2924.seek(0L);
            this.field2924.write(var5);
        }
        this.field2924.seek(0L);
    }

    @ObfuscatedName("gb.k(J)V")
    public final void method3449(long arg0) throws IOException {
        this.field2924.seek(arg0);
        this.field2923 = arg0;
    }

    @ObfuscatedName("gb.b([BIIB)V")
    public final void method3466(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2923 + (long) arg2 > this.field2922) {
            this.field2924.seek(this.field2922 + 1L);
            this.field2924.write(1);
            throw new EOFException();
        } else {
            this.field2924.write(arg0, arg1, arg2);
            this.field2923 += (long) arg2;
        }
    }

    @ObfuscatedName("gb.e(I)V")
    public final void method3451() throws IOException {
        if (this.field2924 != null) {
            this.field2924.close();
            this.field2924 = null;
        }
    }

    @ObfuscatedName("gb.i(I)J")
    public final long method3452() throws IOException {
        return this.field2924.length();
    }

    @ObfuscatedName("gb.t([BIII)I")
    public final int method3448(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field2924.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field2923 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field2924 != null) {
            System.out.println("");
            this.method3451();
        }
    }
}
