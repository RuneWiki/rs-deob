package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.SyncFailedException;

@ObfuscatedName("nm")
public final class class367 {

    @ObfuscatedName("nm.v")
    public RandomAccessFile field4102;

    @ObfuscatedName("nm.n")
    public final long field4101;

    @ObfuscatedName("nm.f")
    public long field4100;

    public class367(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() > arg2) {
            arg0.delete();
        }
        this.field4102 = new RandomAccessFile(arg0, arg1);
        this.field4101 = arg2;
        this.field4100 = 0L;
        int var5 = this.field4102.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field4102.seek(0L);
            this.field4102.write(var5);
        }
        this.field4102.seek(0L);
    }

    @ObfuscatedName("nm.v(J)V")
    public final void method5812(long arg0) throws IOException {
        this.field4102.seek(arg0);
        this.field4100 = arg0;
    }

    @ObfuscatedName("nm.n([BIIB)V")
    public final void method5806(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field4100 + (long) arg2 > this.field4101) {
            this.field4102.seek(this.field4101);
            this.field4102.write(1);
            throw new EOFException();
        } else {
            this.field4102.write(arg0, arg1, arg2);
            this.field4100 += (long) arg2;
        }
    }

    @ObfuscatedName("nm.f(I)V")
    public final void method5823() throws IOException {
        this.method5808(false);
    }

    @ObfuscatedName("nm.y(ZI)V")
    public final void method5808(boolean arg0) throws IOException {
        if (this.field4102 == null) {
            return;
        }
        if (arg0) {
            try {
                this.field4102.getFD().sync();
            } catch (SyncFailedException var3) {
            }
        }
        this.field4102.close();
        this.field4102 = null;
    }

    @ObfuscatedName("nm.p(I)J")
    public final long method5809() throws IOException {
        return this.field4102.length();
    }

    @ObfuscatedName("nm.j([BIIB)I")
    public final int method5810(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field4102.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field4100 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field4102 != null) {
            System.out.println("");
            this.method5823();
        }
    }
}
