package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.SyncFailedException;

@ObfuscatedName("re")
public final class class460 {

    @ObfuscatedName("re.aj")
    public RandomAccessFile field4835;

    @ObfuscatedName("re.al")
    public final long field4834;

    @ObfuscatedName("re.ac")
    public long field4836;

    public class460(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() > arg2) {
            arg0.delete();
        }
        this.field4835 = new RandomAccessFile(arg0, arg1);
        this.field4834 = arg2;
        this.field4836 = 0L;
        int var5 = this.field4835.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field4835.seek(0L);
            this.field4835.write(var5);
        }
        this.field4835.seek(0L);
    }

    @ObfuscatedName("re.aj(J)V")
    public final void method7665(long arg0) throws IOException {
        this.field4835.seek(arg0);
        this.field4836 = arg0;
    }

    @ObfuscatedName("re.al([BIII)V")
    public final void method7662(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field4836 + (long) arg2 > this.field4834) {
            this.field4835.seek(this.field4834);
            this.field4835.write(1);
            throw new EOFException();
        } else {
            this.field4835.write(arg0, arg1, arg2);
            this.field4836 += (long) arg2;
        }
    }

    @ObfuscatedName("re.ac(I)V")
    public final void method7678() throws IOException {
        this.method7659(false);
    }

    @ObfuscatedName("re.ab(ZI)V")
    public final void method7659(boolean arg0) throws IOException {
        if (this.field4835 == null) {
            return;
        }
        if (arg0) {
            try {
                this.field4835.getFD().sync();
            } catch (SyncFailedException var3) {
            }
        }
        this.field4835.close();
        this.field4835 = null;
    }

    @ObfuscatedName("re.an(B)J")
    public final long method7658() throws IOException {
        return this.field4835.length();
    }

    @ObfuscatedName("re.ao([BIIB)I")
    public final int method7660(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field4835.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field4836 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field4835 != null) {
            System.out.println("");
            this.method7678();
        }
    }
}
