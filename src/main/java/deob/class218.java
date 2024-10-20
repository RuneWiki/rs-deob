package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("ht")
public final class class218 {

    @ObfuscatedName("ht.b")
    public RandomAccessFile field3110;

    @ObfuscatedName("ht.e")
    public long field3107;

    @ObfuscatedName("ht.a")
    public long field3109;

    public class218(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field3110 = new RandomAccessFile(arg0, arg1);
        this.field3107 = arg2;
        this.field3109 = 0L;
        int var5 = this.field3110.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field3110.seek(0L);
            this.field3110.write(var5);
        }
        this.field3110.seek(0L);
    }

    @ObfuscatedName("ht.b(J)V")
    public final void method3627(long arg0) throws IOException {
        this.field3110.seek(arg0);
        this.field3109 = arg0;
    }

    @ObfuscatedName("ht.e([BIII)V")
    public final void method3626(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field3109 + (long) arg2 > this.field3107) {
            this.field3110.seek(this.field3107 + 1L);
            this.field3110.write(1);
            throw new EOFException();
        } else {
            this.field3110.write(arg0, arg1, arg2);
            this.field3109 += (long) arg2;
        }
    }

    @ObfuscatedName("ht.a(I)V")
    public final void method3632() throws IOException {
        if (this.field3110 != null) {
            this.field3110.close();
            this.field3110 = null;
        }
    }

    @ObfuscatedName("ht.k(I)J")
    public final long method3630() throws IOException {
        return this.field3110.length();
    }

    @ObfuscatedName("ht.p([BIII)I")
    public final int method3631(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field3110.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field3109 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field3110 != null) {
            System.out.println("");
            this.method3632();
        }
    }
}
