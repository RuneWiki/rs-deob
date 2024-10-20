package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.SyncFailedException;

@ObfuscatedName("ni")
public final class class366 {

    @ObfuscatedName("ni.f")
    public RandomAccessFile field4100;

    @ObfuscatedName("ni.o")
    public final long field4101;

    @ObfuscatedName("ni.u")
    public long field4102;

    public class366(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() > arg2) {
            arg0.delete();
        }
        this.field4100 = new RandomAccessFile(arg0, arg1);
        this.field4101 = arg2;
        this.field4102 = 0L;
        int var5 = this.field4100.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field4100.seek(0L);
            this.field4100.write(var5);
        }
        this.field4100.seek(0L);
    }

    @ObfuscatedName("ni.f(J)V")
    public final void method5672(long arg0) throws IOException {
        this.field4100.seek(arg0);
        this.field4102 = arg0;
    }

    @ObfuscatedName("ni.o([BIII)V")
    public final void method5673(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field4102 + (long) arg2 > this.field4101) {
            this.field4100.seek(this.field4101);
            this.field4100.write(1);
            throw new EOFException();
        } else {
            this.field4100.write(arg0, arg1, arg2);
            this.field4102 += (long) arg2;
        }
    }

    @ObfuscatedName("ni.u(I)V")
    public final void method5674() throws IOException {
        this.method5675(false);
    }

    @ObfuscatedName("ni.p(ZI)V")
    public final void method5675(boolean arg0) throws IOException {
        if (this.field4100 == null) {
            return;
        }
        if (arg0) {
            try {
                this.field4100.getFD().sync();
            } catch (SyncFailedException var3) {
            }
        }
        this.field4100.close();
        this.field4100 = null;
    }

    @ObfuscatedName("ni.b(I)J")
    public final long method5695() throws IOException {
        return this.field4100.length();
    }

    @ObfuscatedName("ni.e([BIIB)I")
    public final int method5671(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field4100.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field4102 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field4100 != null) {
            System.out.println("");
            this.method5674();
        }
    }
}
