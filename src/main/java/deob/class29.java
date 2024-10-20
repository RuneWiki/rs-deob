package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("ap")
public final class class29 {

    @ObfuscatedName("ap.d")
    public RandomAccessFile field740;

    @ObfuscatedName("ap.g")
    public long field737;

    @ObfuscatedName("ap.a")
    public long field738;

    public class29(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field740 = new RandomAccessFile(arg0, arg1);
        this.field737 = arg2;
        this.field738 = 0L;
        int var5 = this.field740.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field740.seek(0L);
            this.field740.write(var5);
        }
        this.field740.seek(0L);
    }

    @ObfuscatedName("ap.d(J)V")
    public final void method530(long arg0) throws IOException {
        this.field740.seek(arg0);
        this.field738 = arg0;
    }

    @ObfuscatedName("ap.g([BIII)V")
    public final void method549(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field738 + (long) arg2 > this.field737) {
            this.field740.seek(this.field737 + 1L);
            this.field740.write(1);
            throw new EOFException();
        } else {
            this.field740.write(arg0, arg1, arg2);
            this.field738 += (long) arg2;
        }
    }

    @ObfuscatedName("ap.a(I)V")
    public final void method532() throws IOException {
        if (this.field740 != null) {
            this.field740.close();
            this.field740 = null;
        }
    }

    @ObfuscatedName("ap.t(S)J")
    public final long method535() throws IOException {
        return this.field740.length();
    }

    @ObfuscatedName("ap.f([BIII)I")
    public final int method534(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field740.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field738 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field740 != null) {
            System.out.println("");
            this.method532();
        }
    }
}
