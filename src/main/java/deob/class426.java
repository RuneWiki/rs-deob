package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.SyncFailedException;

@ObfuscatedName("pn")
public final class class426 {

    @ObfuscatedName("pn.s")
    public RandomAccessFile field4625;

    @ObfuscatedName("pn.h")
    public final long field4624;

    @ObfuscatedName("pn.w")
    public long field4626;

    public class426(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() > arg2) {
            arg0.delete();
        }
        this.field4625 = new RandomAccessFile(arg0, arg1);
        this.field4624 = arg2;
        this.field4626 = 0L;
        int var5 = this.field4625.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field4625.seek(0L);
            this.field4625.write(var5);
        }
        this.field4625.seek(0L);
    }

    @ObfuscatedName("pn.s(J)V")
    public final void method6714(long arg0) throws IOException {
        this.field4625.seek(arg0);
        this.field4626 = arg0;
    }

    @ObfuscatedName("pn.h([BIIB)V")
    public final void method6715(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field4626 + (long) arg2 > this.field4624) {
            this.field4625.seek(this.field4624);
            this.field4625.write(1);
            throw new EOFException();
        } else {
            this.field4625.write(arg0, arg1, arg2);
            this.field4626 += (long) arg2;
        }
    }

    @ObfuscatedName("pn.w(S)V")
    public final void method6716() throws IOException {
        this.method6717(false);
    }

    @ObfuscatedName("pn.v(ZI)V")
    public final void method6717(boolean arg0) throws IOException {
        if (this.field4625 == null) {
            return;
        }
        if (arg0) {
            try {
                this.field4625.getFD().sync();
            } catch (SyncFailedException var3) {
            }
        }
        this.field4625.close();
        this.field4625 = null;
    }

    @ObfuscatedName("pn.c(I)J")
    public final long method6713() throws IOException {
        return this.field4625.length();
    }

    @ObfuscatedName("pn.q([BIII)I")
    public final int method6719(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field4625.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field4626 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field4625 != null) {
            System.out.println("");
            this.method6716();
        }
    }
}
