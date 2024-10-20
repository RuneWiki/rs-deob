package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("au")
public final class class170 {

    @ObfuscatedName("au.o")
    public long field2579;

    @ObfuscatedName("au.j")
    public RandomAccessFile field2584;

    @ObfuscatedName("au.p")
    public long field2578;

    @ObfuscatedName("au.t(I)J")
    public final long method3260() throws IOException {
        return this.field2584.length();
    }

    @ObfuscatedName("au.j(J)V")
    public final void method3261(long arg0) throws IOException {
        this.field2584.seek(arg0);
        this.field2579 = arg0;
    }

    @ObfuscatedName("au.p([BIII)V")
    public final void method3262(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2579 + (long) arg2 > this.field2578) {
            this.field2584.seek(this.field2578 + 1L);
            this.field2584.write(1);
            throw new EOFException();
        } else {
            this.field2584.write(arg0, arg1, arg2);
            this.field2579 += (long) arg2;
        }
    }

    @ObfuscatedName("au.h([BIII)I")
    public final int method3265(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field2584.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field2579 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field2584 != null) {
            System.out.println("");
            this.method3278();
        }
    }

    public class170(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field2584 = new RandomAccessFile(arg0, arg1);
        this.field2578 = arg2;
        this.field2579 = 0L;
        int var5 = this.field2584.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field2584.seek(0L);
            this.field2584.write(var5);
        }
        this.field2584.seek(0L);
    }

    @ObfuscatedName("au.o(S)V")
    public final void method3278() throws IOException {
        if (this.field2584 != null) {
            this.field2584.close();
            this.field2584 = null;
        }
    }
}
