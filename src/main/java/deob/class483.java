package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.SyncFailedException;

@ObfuscatedName("su")
public final class class483 {

    @ObfuscatedName("su.at")
    public RandomAccessFile field4942;

    @ObfuscatedName("su.an")
    public final long field4943;

    @ObfuscatedName("su.av")
    public long field4944;

    public class483(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() > arg2) {
            arg0.delete();
        }
        this.field4942 = new RandomAccessFile(arg0, arg1);
        this.field4943 = arg2;
        this.field4944 = 0L;
        int var5 = this.field4942.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field4942.seek(0L);
            this.field4942.write(var5);
        }
        this.field4942.seek(0L);
    }

    @ObfuscatedName("su.at(J)V")
    public final void method7915(long arg0) throws IOException {
        this.field4942.seek(arg0);
        this.field4944 = arg0;
    }

    @ObfuscatedName("su.an([BIIB)V")
    public final void method7916(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field4944 + (long) arg2 > this.field4943) {
            this.field4942.seek(this.field4943);
            this.field4942.write(1);
            throw new EOFException();
        } else {
            this.field4942.write(arg0, arg1, arg2);
            this.field4944 += (long) arg2;
        }
    }

    @ObfuscatedName("su.av(I)V")
    public final void method7922() throws IOException {
        this.method7918(false);
    }

    @ObfuscatedName("su.as(ZI)V")
    public final void method7918(boolean arg0) throws IOException {
        if (this.field4942 == null) {
            return;
        }
        if (arg0) {
            try {
                this.field4942.getFD().sync();
            } catch (SyncFailedException var3) {
            }
        }
        this.field4942.close();
        this.field4942 = null;
    }

    @ObfuscatedName("su.ax(I)J")
    public final long method7919() throws IOException {
        return this.field4942.length();
    }

    @ObfuscatedName("su.ap([BIII)I")
    public final int method7920(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field4942.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field4944 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field4942 != null) {
            System.out.println("");
            this.method7922();
        }
    }
}
