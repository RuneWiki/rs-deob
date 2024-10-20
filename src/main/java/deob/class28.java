package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("ay")
public final class class28 {

    @ObfuscatedName("ay.z")
    public RandomAccessFile field747;

    @ObfuscatedName("ay.h")
    public long field752;

    @ObfuscatedName("ay.c")
    public long field749;

    public class28(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field747 = new RandomAccessFile(arg0, arg1);
        this.field752 = arg2;
        this.field749 = 0L;
        int var5 = this.field747.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field747.seek(0L);
            this.field747.write(var5);
        }
        this.field747.seek(0L);
    }

    @ObfuscatedName("ay.z(J)V")
    public final void method565(long arg0) throws IOException {
        this.field747.seek(arg0);
        this.field749 = arg0;
    }

    @ObfuscatedName("ay.h([BIII)V")
    public final void method583(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field749 + (long) arg2 > this.field752) {
            this.field747.seek(this.field752 + 1L);
            this.field747.write(1);
            throw new EOFException();
        } else {
            this.field747.write(arg0, arg1, arg2);
            this.field749 += (long) arg2;
        }
    }

    @ObfuscatedName("ay.c(B)V")
    public final void method569() throws IOException {
        if (this.field747 != null) {
            this.field747.close();
            this.field747 = null;
        }
    }

    @ObfuscatedName("ay.p(B)J")
    public final long method568() throws IOException {
        return this.field747.length();
    }

    @ObfuscatedName("ay.i([BIII)I")
    public final int method573(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field747.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field749 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field747 != null) {
            System.out.println("");
            this.method569();
        }
    }
}
