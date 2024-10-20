package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.SyncFailedException;

@ObfuscatedName("np")
public final class class368 {

    @ObfuscatedName("np.f")
    public RandomAccessFile field4100;

    @ObfuscatedName("np.e")
    public final long field4097;

    @ObfuscatedName("np.v")
    public long field4096;

    public class368(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() > arg2) {
            arg0.delete();
        }
        this.field4100 = new RandomAccessFile(arg0, arg1);
        this.field4097 = arg2;
        this.field4096 = 0L;
        int var5 = this.field4100.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field4100.seek(0L);
            this.field4100.write(var5);
        }
        this.field4100.seek(0L);
    }

    @ObfuscatedName("np.f(J)V")
    public final void method5743(long arg0) throws IOException {
        this.field4100.seek(arg0);
        this.field4096 = arg0;
    }

    @ObfuscatedName("np.e([BIII)V")
    public final void method5728(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field4096 + (long) arg2 > this.field4097) {
            this.field4100.seek(this.field4097);
            this.field4100.write(1);
            throw new EOFException();
        } else {
            this.field4100.write(arg0, arg1, arg2);
            this.field4096 += (long) arg2;
        }
    }

    @ObfuscatedName("np.v(I)V")
    public final void method5729() throws IOException {
        this.method5727(false);
    }

    @ObfuscatedName("np.y(ZB)V")
    public final void method5727(boolean arg0) throws IOException {
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

    @ObfuscatedName("np.j(I)J")
    public final long method5731() throws IOException {
        return this.field4100.length();
    }

    @ObfuscatedName("np.o([BIII)I")
    public final int method5732(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field4100.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field4096 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field4100 != null) {
            System.out.println("");
            this.method5729();
        }
    }
}
