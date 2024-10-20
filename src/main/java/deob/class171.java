package deob;

import java.io.IOException;
import java.io.OutputStream;

@ObfuscatedName("fx")
public class class171 implements Runnable {

    @ObfuscatedName("fx.a")
    public Thread field2096;

    @ObfuscatedName("fx.s")
    public OutputStream field2093;

    @ObfuscatedName("fx.g")
    public int field2098;

    @ObfuscatedName("fx.x")
    public byte[] field2092;

    @ObfuscatedName("fx.h")
    public int field2094 = 0;

    @ObfuscatedName("fx.f")
    public int field2097 = 0;

    @ObfuscatedName("fx.p")
    public IOException field2095;

    @ObfuscatedName("fx.m")
    public boolean field2099;

    public class171(OutputStream arg0, int arg1) {
        this.field2093 = arg0;
        this.field2098 = arg1 + 1;
        this.field2092 = new byte[this.field2098];
        this.field2096 = new Thread(this);
        this.field2096.setDaemon(true);
        this.field2096.start();
    }

    @ObfuscatedName("fx.a(B)Z")
    public boolean method3315() {
        if (!this.field2099) {
            return false;
        }
        try {
            this.field2093.close();
            if (this.field2095 == null) {
                this.field2095 = new IOException("");
            }
        } catch (IOException var2) {
            if (this.field2095 == null) {
                this.field2095 = new IOException(var2);
            }
        }
        return true;
    }

    public void run() {
        do {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field2095 != null) {
                        return;
                    }
                    if (this.field2094 <= this.field2097) {
                        var2 = this.field2097 - this.field2094;
                    } else {
                        var2 = this.field2097 + (this.field2098 - this.field2094);
                    }
                    if (var2 > 0) {
                        break;
                    }
                    try {
                        this.field2093.flush();
                    } catch (IOException var15) {
                        this.field2095 = var15;
                        return;
                    }
                    if (this.method3315()) {
                        return;
                    }
                    try {
                        this.wait();
                    } catch (InterruptedException var16) {
                    }
                }
            }
            try {
                if (this.field2094 + var2 <= this.field2098) {
                    this.field2093.write(this.field2092, this.field2094, var2);
                } else {
                    int var6 = this.field2098 - this.field2094;
                    this.field2093.write(this.field2092, this.field2094, var6);
                    this.field2093.write(this.field2092, 0, var2 - var6);
                }
            } catch (IOException var14) {
                IOException var7 = var14;
                synchronized (this) {
                    this.field2095 = var7;
                    return;
                }
            }
            synchronized (this) {
                this.field2094 = (this.field2094 + var2) % this.field2098;
            }
        } while (!this.method3315());
    }

    @ObfuscatedName("fx.s([BIIB)V")
    public void method3305(byte[] arg0, int arg1, int arg2) throws IOException {
        if (arg2 < 0 || arg1 < 0 || arg1 + arg2 > arg0.length) {
            throw new IOException();
        }
        synchronized (this) {
            if (this.field2095 != null) {
                throw new IOException(this.field2095.toString());
            }
            int var5;
            if (this.field2094 <= this.field2097) {
                var5 = this.field2094 + (this.field2098 - this.field2097) - 1;
            } else {
                var5 = this.field2094 - this.field2097 - 1;
            }
            if (var5 < arg2) {
                throw new IOException("");
            }
            if (this.field2097 + arg2 <= this.field2098) {
                System.arraycopy(arg0, arg1, this.field2092, this.field2097, arg2);
            } else {
                int var6 = this.field2098 - this.field2097;
                System.arraycopy(arg0, arg1, this.field2092, this.field2097, var6);
                System.arraycopy(arg0, arg1 + var6, this.field2092, 0, arg2 - var6);
            }
            this.field2097 = (this.field2097 + arg2) % this.field2098;
            this.notifyAll();
        }
    }

    @ObfuscatedName("fx.g(I)V")
    public void method3306() {
        synchronized (this) {
            this.field2099 = true;
            this.notifyAll();
        }
        try {
            this.field2096.join();
        } catch (InterruptedException var4) {
        }
    }
}
