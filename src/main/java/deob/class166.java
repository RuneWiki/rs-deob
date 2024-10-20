package deob;

import java.io.IOException;
import java.io.OutputStream;

@ObfuscatedName("fg")
public class class166 implements Runnable {

    @ObfuscatedName("fg.s")
    public Thread field2196;

    @ObfuscatedName("fg.g")
    public OutputStream field2195;

    @ObfuscatedName("fg.m")
    public int field2197;

    @ObfuscatedName("fg.h")
    public byte[] field2199;

    @ObfuscatedName("fg.i")
    public int field2202 = 0;

    @ObfuscatedName("fg.w")
    public int field2200 = 0;

    @ObfuscatedName("fg.t")
    public IOException field2201;

    @ObfuscatedName("fg.d")
    public boolean field2198;

    public class166(OutputStream arg0, int arg1) {
        this.field2195 = arg0;
        this.field2197 = arg1 + 1;
        this.field2199 = new byte[this.field2197];
        this.field2196 = new Thread(this);
        this.field2196.setDaemon(true);
        this.field2196.start();
    }

    @ObfuscatedName("fg.s(I)Z")
    public boolean method3073() {
        if (!this.field2198) {
            return false;
        }
        try {
            this.field2195.close();
            if (this.field2201 == null) {
                this.field2201 = new IOException("");
            }
        } catch (IOException var2) {
            if (this.field2201 == null) {
                this.field2201 = new IOException(var2);
            }
        }
        return true;
    }

    public void run() {
        do {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field2201 != null) {
                        return;
                    }
                    if (this.field2202 <= this.field2200) {
                        var2 = this.field2200 - this.field2202;
                    } else {
                        var2 = this.field2200 + (this.field2197 - this.field2202);
                    }
                    if (var2 > 0) {
                        break;
                    }
                    try {
                        this.field2195.flush();
                    } catch (IOException var15) {
                        this.field2201 = var15;
                        return;
                    }
                    if (this.method3073()) {
                        return;
                    }
                    try {
                        this.wait();
                    } catch (InterruptedException var16) {
                    }
                }
            }
            try {
                if (this.field2202 + var2 <= this.field2197) {
                    this.field2195.write(this.field2199, this.field2202, var2);
                } else {
                    int var6 = this.field2197 - this.field2202;
                    this.field2195.write(this.field2199, this.field2202, var6);
                    this.field2195.write(this.field2199, 0, var2 - var6);
                }
            } catch (IOException var14) {
                IOException var7 = var14;
                synchronized (this) {
                    this.field2201 = var7;
                    return;
                }
            }
            synchronized (this) {
                this.field2202 = (this.field2202 + var2) % this.field2197;
            }
        } while (!this.method3073());
    }

    @ObfuscatedName("fg.g([BIII)V")
    public void method3074(byte[] arg0, int arg1, int arg2) throws IOException {
        if (arg2 < 0 || arg1 < 0 || arg1 + arg2 > arg0.length) {
            throw new IOException();
        }
        synchronized (this) {
            if (this.field2201 != null) {
                throw new IOException(this.field2201.toString());
            }
            int var5;
            if (this.field2202 <= this.field2200) {
                var5 = this.field2202 + (this.field2197 - this.field2200) - 1;
            } else {
                var5 = this.field2202 - this.field2200 - 1;
            }
            if (var5 < arg2) {
                throw new IOException("");
            }
            if (this.field2200 + arg2 <= this.field2197) {
                System.arraycopy(arg0, arg1, this.field2199, this.field2200, arg2);
            } else {
                int var6 = this.field2197 - this.field2200;
                System.arraycopy(arg0, arg1, this.field2199, this.field2200, var6);
                System.arraycopy(arg0, arg1 + var6, this.field2199, 0, arg2 - var6);
            }
            this.field2200 = (this.field2200 + arg2) % this.field2197;
            this.notifyAll();
        }
    }

    @ObfuscatedName("fg.m(B)V")
    public void method3082() {
        synchronized (this) {
            this.field2198 = true;
            this.notifyAll();
        }
        try {
            this.field2196.join();
        } catch (InterruptedException var4) {
        }
    }
}
