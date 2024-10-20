package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.SyncFailedException;

@ObfuscatedName("nx")
public final class class369 {

    @ObfuscatedName("nx.s")
    public RandomAccessFile field4131;

    @ObfuscatedName("nx.t")
    public final long field4130;

    @ObfuscatedName("nx.v")
    public long field4129;

    public class369(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() > arg2) {
            arg0.delete();
        }
        this.field4131 = new RandomAccessFile(arg0, arg1);
        this.field4130 = arg2;
        this.field4129 = 0L;
        int var5 = this.field4131.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field4131.seek(0L);
            this.field4131.write(var5);
        }
        this.field4131.seek(0L);
    }

    @ObfuscatedName("nx.s(J)V")
    public final void method5784(long arg0) throws IOException {
        this.field4131.seek(arg0);
        this.field4129 = arg0;
    }

    @ObfuscatedName("nx.t([BIII)V")
    public final void method5790(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field4129 + (long) arg2 > this.field4130) {
            this.field4131.seek(this.field4130);
            this.field4131.write(1);
            throw new EOFException();
        } else {
            this.field4131.write(arg0, arg1, arg2);
            this.field4129 += (long) arg2;
        }
    }

    @ObfuscatedName("nx.v(I)V")
    public final void method5786() throws IOException {
        this.method5798(false);
    }

    @ObfuscatedName("nx.j(ZI)V")
    public final void method5798(boolean arg0) throws IOException {
        if (this.field4131 == null) {
            return;
        }
        if (arg0) {
            try {
                this.field4131.getFD().sync();
            } catch (SyncFailedException var3) {
            }
        }
        this.field4131.close();
        this.field4131 = null;
    }

    @ObfuscatedName("nx.l(I)J")
    public final long method5783() throws IOException {
        return this.field4131.length();
    }

    @ObfuscatedName("nx.n([BIIB)I")
    public final int method5789(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field4131.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field4129 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field4131 != null) {
            System.out.println("");
            this.method5786();
        }
    }
}
