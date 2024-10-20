package deob;

import java.io.IOException;
import java.io.OutputStream;

@ObfuscatedName("fp")
public class class166 implements Runnable {

    @ObfuscatedName("fp.n")
    public Thread field2219;

    @ObfuscatedName("fp.v")
    public OutputStream field2213;

    @ObfuscatedName("fp.y")
    public int field2214;

    @ObfuscatedName("fp.r")
    public byte[] field2217;

    @ObfuscatedName("fp.h")
    public int field2216 = 0;

    @ObfuscatedName("fp.d")
    public int field2218 = 0;

    @ObfuscatedName("fp.s")
    public IOException field2212;

    @ObfuscatedName("fp.b")
    public boolean field2220;

    public class166(OutputStream arg0, int arg1) {
        this.field2213 = arg0;
        this.field2214 = arg1 + 1;
        this.field2217 = new byte[this.field2214];
        this.field2219 = new Thread(this);
        this.field2219.setDaemon(true);
        this.field2219.start();
    }

    @ObfuscatedName("fp.n(I)Z")
    public boolean method2884() {
        if (!this.field2220) {
            return false;
        }
        try {
            this.field2213.close();
            if (this.field2212 == null) {
                this.field2212 = new IOException("");
            }
        } catch (IOException var2) {
            if (this.field2212 == null) {
                this.field2212 = new IOException(var2);
            }
        }
        return true;
    }

    public void run() {
        do {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field2212 != null) {
                        return;
                    }
                    if (this.field2216 <= this.field2218) {
                        var2 = this.field2218 - this.field2216;
                    } else {
                        var2 = this.field2218 + (this.field2214 - this.field2216);
                    }
                    if (var2 > 0) {
                        break;
                    }
                    try {
                        this.field2213.flush();
                    } catch (IOException var15) {
                        this.field2212 = var15;
                        return;
                    }
                    if (this.method2884()) {
                        return;
                    }
                    try {
                        this.wait();
                    } catch (InterruptedException var16) {
                    }
                }
            }
            try {
                if (this.field2216 + var2 <= this.field2214) {
                    this.field2213.write(this.field2217, this.field2216, var2);
                } else {
                    int var6 = this.field2214 - this.field2216;
                    this.field2213.write(this.field2217, this.field2216, var6);
                    this.field2213.write(this.field2217, 0, var2 - var6);
                }
            } catch (IOException var14) {
                IOException var7 = var14;
                synchronized (this) {
                    this.field2212 = var7;
                    return;
                }
            }
            synchronized (this) {
                this.field2216 = (this.field2216 + var2) % this.field2214;
            }
        } while (!this.method2884());
    }

    @ObfuscatedName("fp.v([BIIB)V")
    public void method2873(byte[] arg0, int arg1, int arg2) throws IOException {
        if (arg2 < 0 || arg1 < 0 || arg1 + arg2 > arg0.length) {
            throw new IOException();
        }
        synchronized (this) {
            if (this.field2212 != null) {
                throw new IOException(this.field2212.toString());
            }
            int var5;
            if (this.field2216 <= this.field2218) {
                var5 = this.field2216 + (this.field2214 - this.field2218) - 1;
            } else {
                var5 = this.field2216 - this.field2218 - 1;
            }
            if (var5 < arg2) {
                throw new IOException("");
            }
            if (this.field2218 + arg2 <= this.field2214) {
                System.arraycopy(arg0, arg1, this.field2217, this.field2218, arg2);
            } else {
                int var6 = this.field2214 - this.field2218;
                System.arraycopy(arg0, arg1, this.field2217, this.field2218, var6);
                System.arraycopy(arg0, arg1 + var6, this.field2217, 0, arg2 - var6);
            }
            this.field2218 = (this.field2218 + arg2) % this.field2214;
            this.notifyAll();
        }
    }

    @ObfuscatedName("fp.y(B)V")
    public void method2874() {
        synchronized (this) {
            this.field2220 = true;
            this.notifyAll();
        }
        try {
            this.field2219.join();
        } catch (InterruptedException var4) {
        }
    }
}
