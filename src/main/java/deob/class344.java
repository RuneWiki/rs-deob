package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.SyncFailedException;

@ObfuscatedName("mx")
public final class class344 {

    @ObfuscatedName("mx.c")
    public RandomAccessFile field4065;

    @ObfuscatedName("mx.t")
    public final long field4064;

    @ObfuscatedName("mx.o")
    public long field4066;

    public class344(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() > arg2) {
            arg0.delete();
        }
        this.field4065 = new RandomAccessFile(arg0, arg1);
        this.field4064 = arg2;
        this.field4066 = 0L;
        int var5 = this.field4065.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field4065.seek(0L);
            this.field4065.write(var5);
        }
        this.field4065.seek(0L);
    }

    @ObfuscatedName("mx.c(J)V")
    public final void method6127(long arg0) throws IOException {
        this.field4065.seek(arg0);
        this.field4066 = arg0;
    }

    @ObfuscatedName("mx.t([BIII)V")
    public final void method6128(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field4066 + (long) arg2 > this.field4064) {
            this.field4065.seek(this.field4064);
            this.field4065.write(1);
            throw new EOFException();
        } else {
            this.field4065.write(arg0, arg1, arg2);
            this.field4066 += (long) arg2;
        }
    }

    @ObfuscatedName("mx.o(I)V")
    public final void method6129() throws IOException {
        this.method6137(false);
    }

    @ObfuscatedName("mx.e(ZI)V")
    public final void method6137(boolean arg0) throws IOException {
        if (this.field4065 == null) {
            return;
        }
        if (arg0) {
            try {
                this.field4065.getFD().sync();
            } catch (SyncFailedException var3) {
            }
        }
        this.field4065.close();
        this.field4065 = null;
    }

    @ObfuscatedName("mx.i(I)J")
    public final long method6131() throws IOException {
        return this.field4065.length();
    }

    @ObfuscatedName("mx.g([BIII)I")
    public final int method6132(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field4065.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field4066 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field4065 != null) {
            System.out.println("");
            this.method6129();
        }
    }
}
