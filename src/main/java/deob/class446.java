package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.SyncFailedException;

@ObfuscatedName("qv")
public final class class446 {

    @ObfuscatedName("qv.a")
    public RandomAccessFile field4797;

    @ObfuscatedName("qv.f")
    public final long field4798;

    @ObfuscatedName("qv.c")
    public long field4799;

    public class446(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() > arg2) {
            arg0.delete();
        }
        this.field4797 = new RandomAccessFile(arg0, arg1);
        this.field4798 = arg2;
        this.field4799 = 0L;
        int var5 = this.field4797.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field4797.seek(0L);
            this.field4797.write(var5);
        }
        this.field4797.seek(0L);
    }

    @ObfuscatedName("qv.a(J)V")
    public final void method7507(long arg0) throws IOException {
        this.field4797.seek(arg0);
        this.field4799 = arg0;
    }

    @ObfuscatedName("qv.f([BIII)V")
    public final void method7498(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field4799 + (long) arg2 > this.field4798) {
            this.field4797.seek(this.field4798);
            this.field4797.write(1);
            throw new EOFException();
        } else {
            this.field4797.write(arg0, arg1, arg2);
            this.field4799 += (long) arg2;
        }
    }

    @ObfuscatedName("qv.c(I)V")
    public final void method7502() throws IOException {
        this.method7500(false);
    }

    @ObfuscatedName("qv.x(ZI)V")
    public final void method7500(boolean arg0) throws IOException {
        if (this.field4797 == null) {
            return;
        }
        if (arg0) {
            try {
                this.field4797.getFD().sync();
            } catch (SyncFailedException var3) {
            }
        }
        this.field4797.close();
        this.field4797 = null;
    }

    @ObfuscatedName("qv.h(I)J")
    public final long method7501() throws IOException {
        return this.field4797.length();
    }

    @ObfuscatedName("qv.j([BIII)I")
    public final int method7497(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field4797.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field4799 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field4797 != null) {
            System.out.println("");
            this.method7502();
        }
    }
}
