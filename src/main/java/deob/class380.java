package deob;

import java.io.IOException;
import java.io.OutputStream;

@ObfuscatedName("nd")
public class class380 implements Runnable {

    @ObfuscatedName("nd.v")
    public Thread field4295;

    @ObfuscatedName("nd.c")
    public OutputStream field4293;

    @ObfuscatedName("nd.i")
    public int field4294;

    @ObfuscatedName("nd.f")
    public byte[] field4301;

    @ObfuscatedName("nd.b")
    public int field4298 = 0;

    @ObfuscatedName("nd.n")
    public int field4297 = 0;

    @ObfuscatedName("nd.s")
    public IOException field4292;

    @ObfuscatedName("nd.l")
    public boolean field4299;

    public class380(OutputStream arg0, int arg1) {
        this.field4293 = arg0;
        this.field4294 = arg1 + 1;
        this.field4301 = new byte[this.field4294];
        this.field4295 = new Thread(this);
        this.field4295.setDaemon(true);
        this.field4295.start();
    }

    @ObfuscatedName("nd.v(I)Z")
    public boolean method6248() {
        if (!this.field4299) {
            return false;
        }
        try {
            this.field4293.close();
            if (this.field4292 == null) {
                this.field4292 = new IOException("");
            }
        } catch (IOException var2) {
            if (this.field4292 == null) {
                this.field4292 = new IOException(var2);
            }
        }
        return true;
    }

    public void run() {
        do {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field4292 != null) {
                        return;
                    }
                    if (this.field4298 <= this.field4297) {
                        var2 = this.field4297 - this.field4298;
                    } else {
                        var2 = this.field4297 + (this.field4294 - this.field4298);
                    }
                    if (var2 > 0) {
                        break;
                    }
                    try {
                        this.field4293.flush();
                    } catch (IOException var15) {
                        this.field4292 = var15;
                        return;
                    }
                    if (this.method6248()) {
                        return;
                    }
                    try {
                        this.wait();
                    } catch (InterruptedException var16) {
                    }
                }
            }
            try {
                if (this.field4298 + var2 <= this.field4294) {
                    this.field4293.write(this.field4301, this.field4298, var2);
                } else {
                    int var6 = this.field4294 - this.field4298;
                    this.field4293.write(this.field4301, this.field4298, var6);
                    this.field4293.write(this.field4301, 0, var2 - var6);
                }
            } catch (IOException var14) {
                IOException var7 = var14;
                synchronized (this) {
                    this.field4292 = var7;
                    return;
                }
            }
            synchronized (this) {
                this.field4298 = (this.field4298 + var2) % this.field4294;
            }
        } while (!this.method6248());
    }

    @ObfuscatedName("nd.c([BIII)V")
    public void method6249(byte[] arg0, int arg1, int arg2) throws IOException {
        if (arg2 < 0 || arg1 < 0 || arg1 + arg2 > arg0.length) {
            throw new IOException();
        }
        synchronized (this) {
            if (this.field4292 != null) {
                throw new IOException(this.field4292.toString());
            }
            int var5;
            if (this.field4298 <= this.field4297) {
                var5 = this.field4298 + (this.field4294 - this.field4297) - 1;
            } else {
                var5 = this.field4298 - this.field4297 - 1;
            }
            if (var5 < arg2) {
                throw new IOException("");
            }
            if (this.field4297 + arg2 <= this.field4294) {
                System.arraycopy(arg0, arg1, this.field4301, this.field4297, arg2);
            } else {
                int var6 = this.field4294 - this.field4297;
                System.arraycopy(arg0, arg1, this.field4301, this.field4297, var6);
                System.arraycopy(arg0, arg1 + var6, this.field4301, 0, arg2 - var6);
            }
            this.field4297 = (this.field4297 + arg2) % this.field4294;
            this.notifyAll();
        }
    }

    @ObfuscatedName("nd.i(I)V")
    public void method6251() {
        synchronized (this) {
            this.field4299 = true;
            this.notifyAll();
        }
        try {
            this.field4295.join();
        } catch (InterruptedException var4) {
        }
    }
}
