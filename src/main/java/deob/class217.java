package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("hq")
public final class class217 {

    @ObfuscatedName("hq.e")
    public RandomAccessFile field3064;

    @ObfuscatedName("hq.a")
    public long field3063;

    @ObfuscatedName("hq.l")
    public long field3065;

    public class217(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field3064 = new RandomAccessFile(arg0, arg1);
        this.field3063 = arg2;
        this.field3065 = 0L;
        int var5 = this.field3064.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field3064.seek(0L);
            this.field3064.write(var5);
        }
        this.field3064.seek(0L);
    }

    @ObfuscatedName("hq.e(J)V")
    public final void method3641(long arg0) throws IOException {
        this.field3064.seek(arg0);
        this.field3065 = arg0;
    }

    @ObfuscatedName("hq.a([BIIB)V")
    public final void method3642(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field3065 + (long) arg2 > this.field3063) {
            this.field3064.seek(this.field3063 + 1L);
            this.field3064.write(1);
            throw new EOFException();
        } else {
            this.field3064.write(arg0, arg1, arg2);
            this.field3065 += (long) arg2;
        }
    }

    @ObfuscatedName("hq.l(I)V")
    public final void method3643() throws IOException {
        if (this.field3064 != null) {
            this.field3064.close();
            this.field3064 = null;
        }
    }

    @ObfuscatedName("hq.c(B)J")
    public final long method3653() throws IOException {
        return this.field3064.length();
    }

    @ObfuscatedName("hq.u([BIII)I")
    public final int method3656(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field3064.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field3065 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field3064 != null) {
            System.out.println("");
            this.method3643();
        }
    }
}
