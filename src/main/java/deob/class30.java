package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("ap")
public final class class30 {

    @ObfuscatedName("ap.e")
    public RandomAccessFile field772;

    @ObfuscatedName("ap.i")
    public long field777;

    @ObfuscatedName("ap.k")
    public long field773;

    public class30(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field772 = new RandomAccessFile(arg0, arg1);
        this.field777 = arg2;
        this.field773 = 0L;
        int var5 = this.field772.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field772.seek(0L);
            this.field772.write(var5);
        }
        this.field772.seek(0L);
    }

    @ObfuscatedName("ap.e(J)V")
    public final void method610(long arg0) throws IOException {
        this.field772.seek(arg0);
        this.field773 = arg0;
    }

    @ObfuscatedName("ap.i([BIII)V")
    public final void method597(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field773 + (long) arg2 > this.field777) {
            this.field772.seek(this.field777 + 1L);
            this.field772.write(1);
            throw new EOFException();
        } else {
            this.field772.write(arg0, arg1, arg2);
            this.field773 += (long) arg2;
        }
    }

    @ObfuscatedName("ap.k(I)V")
    public final void method598() throws IOException {
        if (this.field772 != null) {
            this.field772.close();
            this.field772 = null;
        }
    }

    @ObfuscatedName("ap.q(I)J")
    public final long method601() throws IOException {
        return this.field772.length();
    }

    @ObfuscatedName("ap.j([BIIB)I")
    public final int method612(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field772.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field773 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field772 != null) {
            System.out.println("");
            this.method598();
        }
    }
}
