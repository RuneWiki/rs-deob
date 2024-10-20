package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.SyncFailedException;

@ObfuscatedName("nn")
public final class class384 {

    @ObfuscatedName("nn.n")
    public RandomAccessFile field4212;

    @ObfuscatedName("nn.c")
    public final long field4213;

    @ObfuscatedName("nn.m")
    public long field4214;

    public class384(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() > arg2) {
            arg0.delete();
        }
        this.field4212 = new RandomAccessFile(arg0, arg1);
        this.field4213 = arg2;
        this.field4214 = 0L;
        int var5 = this.field4212.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field4212.seek(0L);
            this.field4212.write(var5);
        }
        this.field4212.seek(0L);
    }

    @ObfuscatedName("nn.n(J)V")
    public final void method6054(long arg0) throws IOException {
        this.field4212.seek(arg0);
        this.field4214 = arg0;
    }

    @ObfuscatedName("nn.c([BIII)V")
    public final void method6055(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field4214 + (long) arg2 > this.field4213) {
            this.field4212.seek(this.field4213);
            this.field4212.write(1);
            throw new EOFException();
        } else {
            this.field4212.write(arg0, arg1, arg2);
            this.field4214 += (long) arg2;
        }
    }

    @ObfuscatedName("nn.m(I)V")
    public final void method6070() throws IOException {
        this.method6060(false);
    }

    @ObfuscatedName("nn.k(ZI)V")
    public final void method6060(boolean arg0) throws IOException {
        if (this.field4212 == null) {
            return;
        }
        if (arg0) {
            try {
                this.field4212.getFD().sync();
            } catch (SyncFailedException var3) {
            }
        }
        this.field4212.close();
        this.field4212 = null;
    }

    @ObfuscatedName("nn.o(B)J")
    public final long method6058() throws IOException {
        return this.field4212.length();
    }

    @ObfuscatedName("nn.g([BIIS)I")
    public final int method6059(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field4212.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field4214 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field4212 != null) {
            System.out.println("");
            this.method6070();
        }
    }
}
