package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.SyncFailedException;

@ObfuscatedName("ma")
public final class class344 {

    @ObfuscatedName("ma.q")
    public RandomAccessFile field4083;

    @ObfuscatedName("ma.w")
    public final long field4084;

    @ObfuscatedName("ma.e")
    public long field4082;

    public class344(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() > arg2) {
            arg0.delete();
        }
        this.field4083 = new RandomAccessFile(arg0, arg1);
        this.field4084 = arg2;
        this.field4082 = 0L;
        int var5 = this.field4083.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field4083.seek(0L);
            this.field4083.write(var5);
        }
        this.field4083.seek(0L);
    }

    @ObfuscatedName("ma.q(J)V")
    public final void method6067(long arg0) throws IOException {
        this.field4083.seek(arg0);
        this.field4082 = arg0;
    }

    @ObfuscatedName("ma.w([BIII)V")
    public final void method6077(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field4082 + (long) arg2 > this.field4084) {
            this.field4083.seek(this.field4084);
            this.field4083.write(1);
            throw new EOFException();
        } else {
            this.field4083.write(arg0, arg1, arg2);
            this.field4082 += (long) arg2;
        }
    }

    @ObfuscatedName("ma.e(I)V")
    public final void method6066() throws IOException {
        this.method6071(false);
    }

    @ObfuscatedName("ma.p(ZI)V")
    public final void method6071(boolean arg0) throws IOException {
        if (this.field4083 == null) {
            return;
        }
        if (arg0) {
            try {
                this.field4083.getFD().sync();
            } catch (SyncFailedException var3) {
            }
        }
        this.field4083.close();
        this.field4083 = null;
    }

    @ObfuscatedName("ma.k(I)J")
    public final long method6068() throws IOException {
        return this.field4083.length();
    }

    @ObfuscatedName("ma.l([BIII)I")
    public final int method6070(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field4083.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field4082 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field4083 != null) {
            System.out.println("");
            this.method6066();
        }
    }
}
