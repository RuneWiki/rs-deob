package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("ak")
public final class class29 {

    @ObfuscatedName("ak.c")
    public RandomAccessFile field768;

    @ObfuscatedName("ak.q")
    public long field761;

    @ObfuscatedName("ak.y")
    public long field762;

    public class29(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field768 = new RandomAccessFile(arg0, arg1);
        this.field761 = arg2;
        this.field762 = 0L;
        int var5 = this.field768.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field768.seek(0L);
            this.field768.write(var5);
        }
        this.field768.seek(0L);
    }

    @ObfuscatedName("ak.c(J)V")
    public final void method526(long arg0) throws IOException {
        this.field768.seek(arg0);
        this.field762 = arg0;
    }

    @ObfuscatedName("ak.q([BIIB)V")
    public final void method527(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field762 + (long) arg2 > this.field761) {
            this.field768.seek(this.field761 + 1L);
            this.field768.write(1);
            throw new EOFException();
        } else {
            this.field768.write(arg0, arg1, arg2);
            this.field762 += (long) arg2;
        }
    }

    @ObfuscatedName("ak.y(I)V")
    public final void method528() throws IOException {
        if (this.field768 != null) {
            this.field768.close();
            this.field768 = null;
        }
    }

    @ObfuscatedName("ak.v(B)J")
    public final long method529() throws IOException {
        return this.field768.length();
    }

    @ObfuscatedName("ak.g([BIII)I")
    public final int method551(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field768.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field762 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field768 != null) {
            System.out.println("");
            this.method528();
        }
    }
}
