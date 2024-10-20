package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("an")
public final class class29 {

    @ObfuscatedName("an.l")
    public RandomAccessFile field741;

    @ObfuscatedName("an.b")
    public long field740;

    @ObfuscatedName("an.o")
    public long field742;

    public class29(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field741 = new RandomAccessFile(arg0, arg1);
        this.field740 = arg2;
        this.field742 = 0L;
        int var5 = this.field741.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field741.seek(0L);
            this.field741.write(var5);
        }
        this.field741.seek(0L);
    }

    @ObfuscatedName("an.l(J)V")
    public final void method565(long arg0) throws IOException {
        this.field741.seek(arg0);
        this.field742 = arg0;
    }

    @ObfuscatedName("an.b([BIII)V")
    public final void method564(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field742 + (long) arg2 > this.field740) {
            this.field741.seek(this.field740 + 1L);
            this.field741.write(1);
            throw new EOFException();
        } else {
            this.field741.write(arg0, arg1, arg2);
            this.field742 += (long) arg2;
        }
    }

    @ObfuscatedName("an.o(B)V")
    public final void method578() throws IOException {
        if (this.field741 != null) {
            this.field741.close();
            this.field741 = null;
        }
    }

    @ObfuscatedName("an.w(I)J")
    public final long method566() throws IOException {
        return this.field741.length();
    }

    @ObfuscatedName("an.r([BIIB)I")
    public final int method571(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field741.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field742 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field741 != null) {
            System.out.println("");
            this.method578();
        }
    }
}
