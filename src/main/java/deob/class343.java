package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.SyncFailedException;

@ObfuscatedName("md")
public final class class343 {

    @ObfuscatedName("md.u")
    public RandomAccessFile field4062;

    @ObfuscatedName("md.f")
    public final long field4060;

    @ObfuscatedName("md.b")
    public long field4061;

    public class343(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() > arg2) {
            arg0.delete();
        }
        this.field4062 = new RandomAccessFile(arg0, arg1);
        this.field4060 = arg2;
        this.field4061 = 0L;
        int var5 = this.field4062.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field4062.seek(0L);
            this.field4062.write(var5);
        }
        this.field4062.seek(0L);
    }

    @ObfuscatedName("md.u(J)V")
    public final void method6114(long arg0) throws IOException {
        this.field4062.seek(arg0);
        this.field4061 = arg0;
    }

    @ObfuscatedName("md.f([BIII)V")
    public final void method6115(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field4061 + (long) arg2 > this.field4060) {
            this.field4062.seek(this.field4060);
            this.field4062.write(1);
            throw new EOFException();
        } else {
            this.field4062.write(arg0, arg1, arg2);
            this.field4061 += (long) arg2;
        }
    }

    @ObfuscatedName("md.b(B)V")
    public final void method6116() throws IOException {
        this.method6128(false);
    }

    @ObfuscatedName("md.g(ZI)V")
    public final void method6128(boolean arg0) throws IOException {
        if (this.field4062 == null) {
            return;
        }
        if (arg0) {
            try {
                this.field4062.getFD().sync();
            } catch (SyncFailedException var3) {
            }
        }
        this.field4062.close();
        this.field4062 = null;
    }

    @ObfuscatedName("md.z(I)J")
    public final long method6118() throws IOException {
        return this.field4062.length();
    }

    @ObfuscatedName("md.p([BIII)I")
    public final int method6119(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field4062.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field4061 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field4062 != null) {
            System.out.println("");
            this.method6116();
        }
    }
}
