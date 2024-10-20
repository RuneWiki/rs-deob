package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("gh")
public final class class207 {

    @ObfuscatedName("gh.l")
    public RandomAccessFile field2980;

    @ObfuscatedName("gh.y")
    public long field2978;

    @ObfuscatedName("gh.g")
    public long field2983;

    public class207(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field2980 = new RandomAccessFile(arg0, arg1);
        this.field2978 = arg2;
        this.field2983 = 0L;
        int var5 = this.field2980.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field2980.seek(0L);
            this.field2980.write(var5);
        }
        this.field2980.seek(0L);
    }

    @ObfuscatedName("gh.l(J)V")
    public final void method3584(long arg0) throws IOException {
        this.field2980.seek(arg0);
        this.field2983 = arg0;
    }

    @ObfuscatedName("gh.y([BIII)V")
    public final void method3606(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2983 + (long) arg2 > this.field2978) {
            this.field2980.seek(this.field2978 + 1L);
            this.field2980.write(1);
            throw new EOFException();
        } else {
            this.field2980.write(arg0, arg1, arg2);
            this.field2983 += (long) arg2;
        }
    }

    @ObfuscatedName("gh.g(I)V")
    public final void method3588() throws IOException {
        if (this.field2980 != null) {
            this.field2980.close();
            this.field2980 = null;
        }
    }

    @ObfuscatedName("gh.j(I)J")
    public final long method3586() throws IOException {
        return this.field2980.length();
    }

    @ObfuscatedName("gh.w([BIII)I")
    public final int method3605(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field2980.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field2983 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field2980 != null) {
            System.out.println("");
            this.method3588();
        }
    }
}
