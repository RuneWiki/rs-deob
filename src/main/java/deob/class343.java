package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.SyncFailedException;

@ObfuscatedName("mm")
public final class class343 {

    @ObfuscatedName("mm.s")
    public RandomAccessFile field4059;

    @ObfuscatedName("mm.j")
    public final long field4060;

    @ObfuscatedName("mm.i")
    public long field4061;

    public class343(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() > arg2) {
            arg0.delete();
        }
        this.field4059 = new RandomAccessFile(arg0, arg1);
        this.field4060 = arg2;
        this.field4061 = 0L;
        int var5 = this.field4059.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field4059.seek(0L);
            this.field4059.write(var5);
        }
        this.field4059.seek(0L);
    }

    @ObfuscatedName("mm.s(J)V")
    public final void method6047(long arg0) throws IOException {
        this.field4059.seek(arg0);
        this.field4061 = arg0;
    }

    @ObfuscatedName("mm.j([BIII)V")
    public final void method6043(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field4061 + (long) arg2 > this.field4060) {
            this.field4059.seek(this.field4060);
            this.field4059.write(1);
            throw new EOFException();
        } else {
            this.field4059.write(arg0, arg1, arg2);
            this.field4061 += (long) arg2;
        }
    }

    @ObfuscatedName("mm.i(B)V")
    public final void method6036() throws IOException {
        this.method6039(false);
    }

    @ObfuscatedName("mm.k(ZI)V")
    public final void method6039(boolean arg0) throws IOException {
        if (this.field4059 == null) {
            return;
        }
        if (arg0) {
            try {
                this.field4059.getFD().sync();
            } catch (SyncFailedException var3) {
            }
        }
        this.field4059.close();
        this.field4059 = null;
    }

    @ObfuscatedName("mm.u(I)J")
    public final long method6034() throws IOException {
        return this.field4059.length();
    }

    @ObfuscatedName("mm.n([BIII)I")
    public final int method6038(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field4059.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field4061 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field4059 != null) {
            System.out.println("");
            this.method6036();
        }
    }
}
