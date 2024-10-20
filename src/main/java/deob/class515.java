package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.SyncFailedException;

@ObfuscatedName("tz")
public final class class515 {

    @ObfuscatedName("tz.az")
    public RandomAccessFile field5127;

    @ObfuscatedName("tz.ah")
    public final long field5128;

    @ObfuscatedName("tz.af")
    public long field5129;

    public class515(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() > arg2) {
            arg0.delete();
        }
        this.field5127 = new RandomAccessFile(arg0, arg1);
        this.field5128 = arg2;
        this.field5129 = 0L;
        int var5 = this.field5127.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field5127.seek(0L);
            this.field5127.write(var5);
        }
        this.field5127.seek(0L);
    }

    @ObfuscatedName("tz.az(J)V")
    public final void method8233(long arg0) throws IOException {
        this.field5127.seek(arg0);
        this.field5129 = arg0;
    }

    @ObfuscatedName("tz.ah([BIII)V")
    public final void method8234(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field5129 + (long) arg2 > this.field5128) {
            this.field5127.seek(this.field5128);
            this.field5127.write(1);
            throw new EOFException();
        } else {
            this.field5127.write(arg0, arg1, arg2);
            this.field5129 += (long) arg2;
        }
    }

    @ObfuscatedName("tz.af(I)V")
    public final void method8247() throws IOException {
        this.method8236(false);
    }

    @ObfuscatedName("tz.at(ZI)V")
    public final void method8236(boolean arg0) throws IOException {
        if (this.field5127 == null) {
            return;
        }
        if (arg0) {
            try {
                this.field5127.getFD().sync();
            } catch (SyncFailedException var3) {
            }
        }
        this.field5127.close();
        this.field5127 = null;
    }

    @ObfuscatedName("tz.an(I)J")
    public final long method8243() throws IOException {
        return this.field5127.length();
    }

    @ObfuscatedName("tz.ao([BIIB)I")
    public final int method8238(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field5127.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field5129 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field5127 != null) {
            System.out.println("");
            this.method8247();
        }
    }
}
