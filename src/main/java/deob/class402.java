package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.SyncFailedException;

@ObfuscatedName("oa")
public final class class402 {

    @ObfuscatedName("oa.c")
    public RandomAccessFile field4416;

    @ObfuscatedName("oa.b")
    public final long field4415;

    @ObfuscatedName("oa.p")
    public long field4414;

    public class402(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() > arg2) {
            arg0.delete();
        }
        this.field4416 = new RandomAccessFile(arg0, arg1);
        this.field4415 = arg2;
        this.field4414 = 0L;
        int var5 = this.field4416.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field4416.seek(0L);
            this.field4416.write(var5);
        }
        this.field4416.seek(0L);
    }

    @ObfuscatedName("oa.c(J)V")
    public final void method6485(long arg0) throws IOException {
        this.field4416.seek(arg0);
        this.field4414 = arg0;
    }

    @ObfuscatedName("oa.b([BIIS)V")
    public final void method6486(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field4414 + (long) arg2 > this.field4415) {
            this.field4416.seek(this.field4415);
            this.field4416.write(1);
            throw new EOFException();
        } else {
            this.field4416.write(arg0, arg1, arg2);
            this.field4414 += (long) arg2;
        }
    }

    @ObfuscatedName("oa.p(I)V")
    public final void method6487() throws IOException {
        this.method6488(false);
    }

    @ObfuscatedName("oa.m(ZI)V")
    public final void method6488(boolean arg0) throws IOException {
        if (this.field4416 == null) {
            return;
        }
        if (arg0) {
            try {
                this.field4416.getFD().sync();
            } catch (SyncFailedException var3) {
            }
        }
        this.field4416.close();
        this.field4416 = null;
    }

    @ObfuscatedName("oa.t(B)J")
    public final long method6484() throws IOException {
        return this.field4416.length();
    }

    @ObfuscatedName("oa.s([BIIB)I")
    public final int method6490(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field4416.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field4414 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field4416 != null) {
            System.out.println("");
            this.method6487();
        }
    }
}
