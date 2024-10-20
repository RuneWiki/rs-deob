package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.SyncFailedException;

@ObfuscatedName("mb")
public final class class353 {

    @ObfuscatedName("mb.x")
    public RandomAccessFile field4088;

    @ObfuscatedName("mb.m")
    public final long field4087;

    @ObfuscatedName("mb.k")
    public long field4089;

    public class353(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() > arg2) {
            arg0.delete();
        }
        this.field4088 = new RandomAccessFile(arg0, arg1);
        this.field4087 = arg2;
        this.field4089 = 0L;
        int var5 = this.field4088.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field4088.seek(0L);
            this.field4088.write(var5);
        }
        this.field4088.seek(0L);
    }

    @ObfuscatedName("mb.x(J)V")
    public final void method6191(long arg0) throws IOException {
        this.field4088.seek(arg0);
        this.field4089 = arg0;
    }

    @ObfuscatedName("mb.m([BIIB)V")
    public final void method6197(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field4089 + (long) arg2 > this.field4087) {
            this.field4088.seek(this.field4087);
            this.field4088.write(1);
            throw new EOFException();
        } else {
            this.field4088.write(arg0, arg1, arg2);
            this.field4089 += (long) arg2;
        }
    }

    @ObfuscatedName("mb.k(B)V")
    public final void method6192() throws IOException {
        this.method6195(false);
    }

    @ObfuscatedName("mb.d(ZI)V")
    public final void method6195(boolean arg0) throws IOException {
        if (this.field4088 == null) {
            return;
        }
        if (arg0) {
            try {
                this.field4088.getFD().sync();
            } catch (SyncFailedException var3) {
            }
        }
        this.field4088.close();
        this.field4088 = null;
    }

    @ObfuscatedName("mb.w(B)J")
    public final long method6194() throws IOException {
        return this.field4088.length();
    }

    @ObfuscatedName("mb.v([BIII)I")
    public final int method6206(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field4088.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field4089 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field4088 != null) {
            System.out.println("");
            this.method6192();
        }
    }
}
