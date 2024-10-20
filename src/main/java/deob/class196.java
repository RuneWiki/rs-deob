package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("gm")
public final class class196 {

    @ObfuscatedName("gm.p")
    public RandomAccessFile field2937;

    @ObfuscatedName("gm.g")
    public long field2933;

    @ObfuscatedName("gm.x")
    public long field2936;

    public class196(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field2937 = new RandomAccessFile(arg0, arg1);
        this.field2933 = arg2;
        this.field2936 = 0L;
        int var5 = this.field2937.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field2937.seek(0L);
            this.field2937.write(var5);
        }
        this.field2937.seek(0L);
    }

    @ObfuscatedName("gm.p(J)V")
    public final void method3508(long arg0) throws IOException {
        this.field2937.seek(arg0);
        this.field2936 = arg0;
    }

    @ObfuscatedName("gm.g([BIII)V")
    public final void method3491(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2936 + (long) arg2 > this.field2933) {
            this.field2937.seek(this.field2933 + 1L);
            this.field2937.write(1);
            throw new EOFException();
        } else {
            this.field2937.write(arg0, arg1, arg2);
            this.field2936 += (long) arg2;
        }
    }

    @ObfuscatedName("gm.x(I)V")
    public final void method3492() throws IOException {
        if (this.field2937 != null) {
            this.field2937.close();
            this.field2937 = null;
        }
    }

    @ObfuscatedName("gm.c(I)J")
    public final long method3493() throws IOException {
        return this.field2937.length();
    }

    @ObfuscatedName("gm.n([BIII)I")
    public final int method3507(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field2937.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field2936 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field2937 != null) {
            System.out.println("");
            this.method3492();
        }
    }
}
