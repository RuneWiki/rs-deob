package deob;

import java.io.IOException;
import java.io.OutputStream;

@ObfuscatedName("fz")
public class class176 implements Runnable {

    @ObfuscatedName("fz.d")
    public Thread field2251;

    @ObfuscatedName("fz.z")
    public OutputStream field2248;

    @ObfuscatedName("fz.n")
    public int field2249;

    @ObfuscatedName("fz.r")
    public byte[] field2250;

    @ObfuscatedName("fz.e")
    public int field2253 = 0;

    @ObfuscatedName("fz.y")
    public int field2252 = 0;

    @ObfuscatedName("fz.k")
    public IOException field2247;

    @ObfuscatedName("fz.s")
    public boolean field2254;

    public class176(OutputStream arg0, int arg1) {
        this.field2248 = arg0;
        this.field2249 = arg1 + 1;
        this.field2250 = new byte[this.field2249];
        this.field2251 = new Thread(this);
        this.field2251.setDaemon(true);
        this.field2251.start();
    }

    @ObfuscatedName("fz.d(I)Z")
    public boolean method3102() {
        if (!this.field2254) {
            return false;
        }
        try {
            this.field2248.close();
            if (this.field2247 == null) {
                this.field2247 = new IOException("");
            }
        } catch (IOException var2) {
            if (this.field2247 == null) {
                this.field2247 = new IOException(var2);
            }
        }
        return true;
    }

    public void run() {
        do {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field2247 != null) {
                        return;
                    }
                    if (this.field2253 <= this.field2252) {
                        var2 = this.field2252 - this.field2253;
                    } else {
                        var2 = this.field2252 + (this.field2249 - this.field2253);
                    }
                    if (var2 > 0) {
                        break;
                    }
                    try {
                        this.field2248.flush();
                    } catch (IOException var15) {
                        this.field2247 = var15;
                        return;
                    }
                    if (this.method3102()) {
                        return;
                    }
                    try {
                        this.wait();
                    } catch (InterruptedException var16) {
                    }
                }
            }
            try {
                if (this.field2253 + var2 <= this.field2249) {
                    this.field2248.write(this.field2250, this.field2253, var2);
                } else {
                    int var6 = this.field2249 - this.field2253;
                    this.field2248.write(this.field2250, this.field2253, var6);
                    this.field2248.write(this.field2250, 0, var2 - var6);
                }
            } catch (IOException var14) {
                IOException var7 = var14;
                synchronized (this) {
                    this.field2247 = var7;
                    return;
                }
            }
            synchronized (this) {
                this.field2253 = (this.field2253 + var2) % this.field2249;
            }
        } while (!this.method3102());
    }

    @ObfuscatedName("fz.z([BIII)V")
    public void method3108(byte[] arg0, int arg1, int arg2) throws IOException {
        if (arg2 < 0 || arg1 < 0 || arg1 + arg2 > arg0.length) {
            throw new IOException();
        }
        synchronized (this) {
            if (this.field2247 != null) {
                throw new IOException(this.field2247.toString());
            }
            int var5;
            if (this.field2253 <= this.field2252) {
                var5 = this.field2253 + (this.field2249 - this.field2252) - 1;
            } else {
                var5 = this.field2253 - this.field2252 - 1;
            }
            if (var5 < arg2) {
                throw new IOException("");
            }
            if (this.field2252 + arg2 <= this.field2249) {
                System.arraycopy(arg0, arg1, this.field2250, this.field2252, arg2);
            } else {
                int var6 = this.field2249 - this.field2252;
                System.arraycopy(arg0, arg1, this.field2250, this.field2252, var6);
                System.arraycopy(arg0, arg1 + var6, this.field2250, 0, arg2 - var6);
            }
            this.field2252 = (this.field2252 + arg2) % this.field2249;
            this.notifyAll();
        }
    }

    @ObfuscatedName("fz.n(S)V")
    public void method3104() {
        synchronized (this) {
            this.field2254 = true;
            this.notifyAll();
        }
        try {
            this.field2251.join();
        } catch (InterruptedException var4) {
        }
    }
}
