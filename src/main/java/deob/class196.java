package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("gg")
public final class class196 {

    @ObfuscatedName("gg.g")
    public RandomAccessFile field2937;

    @ObfuscatedName("gg.i")
    public long field2936;

    @ObfuscatedName("gg.k")
    public long field2938;

    public class196(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field2937 = new RandomAccessFile(arg0, arg1);
        this.field2936 = arg2;
        this.field2938 = 0L;
        int var5 = this.field2937.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field2937.seek(0L);
            this.field2937.write(var5);
        }
        this.field2937.seek(0L);
    }

    @ObfuscatedName("gg.g(J)V")
    public final void method3420(long arg0) throws IOException {
        this.field2937.seek(arg0);
        this.field2938 = arg0;
    }

    @ObfuscatedName("gg.i([BIII)V")
    public final void method3421(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2938 + (long) arg2 > this.field2936) {
            this.field2937.seek(this.field2936 + 1L);
            this.field2937.write(1);
            throw new EOFException();
        } else {
            this.field2937.write(arg0, arg1, arg2);
            this.field2938 += (long) arg2;
        }
    }

    @ObfuscatedName("gg.k(B)V")
    public final void method3424() throws IOException {
        if (this.field2937 != null) {
            this.field2937.close();
            this.field2937 = null;
        }
    }

    @ObfuscatedName("gg.e(I)J")
    public final long method3422() throws IOException {
        return this.field2937.length();
    }

    @ObfuscatedName("gg.w([BIIB)I")
    public final int method3423(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field2937.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field2938 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field2937 != null) {
            System.out.println("");
            this.method3424();
        }
    }
}
