package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("gk")
public final class class195 {

    @ObfuscatedName("gk.e")
    public RandomAccessFile field2931;

    @ObfuscatedName("gk.o")
    public long field2930;

    @ObfuscatedName("gk.y")
    public long field2929;

    public class195(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field2931 = new RandomAccessFile(arg0, arg1);
        this.field2930 = arg2;
        this.field2929 = 0L;
        int var5 = this.field2931.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field2931.seek(0L);
            this.field2931.write(var5);
        }
        this.field2931.seek(0L);
    }

    @ObfuscatedName("gk.e(J)V")
    public final void method3331(long arg0) throws IOException {
        this.field2931.seek(arg0);
        this.field2929 = arg0;
    }

    @ObfuscatedName("gk.o([BIIB)V")
    public final void method3341(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2929 + (long) arg2 > this.field2930) {
            this.field2931.seek(this.field2930 + 1L);
            this.field2931.write(1);
            throw new EOFException();
        } else {
            this.field2931.write(arg0, arg1, arg2);
            this.field2929 += (long) arg2;
        }
    }

    @ObfuscatedName("gk.y(I)V")
    public final void method3332() throws IOException {
        if (this.field2931 != null) {
            this.field2931.close();
            this.field2931 = null;
        }
    }

    @ObfuscatedName("gk.b(I)J")
    public final long method3337() throws IOException {
        return this.field2931.length();
    }

    @ObfuscatedName("gk.w([BIIB)I")
    public final int method3334(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field2931.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field2929 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field2931 != null) {
            System.out.println("");
            this.method3332();
        }
    }
}
