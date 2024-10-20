package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("gq")
public final class class207 {

    @ObfuscatedName("gq.c")
    public RandomAccessFile field2982;

    @ObfuscatedName("gq.j")
    public long field2983;

    @ObfuscatedName("gq.y")
    public long field2984;

    public class207(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field2982 = new RandomAccessFile(arg0, arg1);
        this.field2983 = arg2;
        this.field2984 = 0L;
        int var5 = this.field2982.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field2982.seek(0L);
            this.field2982.write(var5);
        }
        this.field2982.seek(0L);
    }

    @ObfuscatedName("gq.c(J)V")
    public final void method3527(long arg0) throws IOException {
        this.field2982.seek(arg0);
        this.field2984 = arg0;
    }

    @ObfuscatedName("gq.j([BIIB)V")
    public final void method3528(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2984 + (long) arg2 > this.field2983) {
            this.field2982.seek(this.field2983 + 1L);
            this.field2982.write(1);
            throw new EOFException();
        } else {
            this.field2982.write(arg0, arg1, arg2);
            this.field2984 += (long) arg2;
        }
    }

    @ObfuscatedName("gq.y(I)V")
    public final void method3529() throws IOException {
        if (this.field2982 != null) {
            this.field2982.close();
            this.field2982 = null;
        }
    }

    @ObfuscatedName("gq.r(I)J")
    public final long method3530() throws IOException {
        return this.field2982.length();
    }

    @ObfuscatedName("gq.f([BIIS)I")
    public final int method3538(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field2982.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field2984 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field2982 != null) {
            System.out.println("");
            this.method3529();
        }
    }
}
