package deob;

import java.io.IOException;
import java.io.OutputStream;

@ObfuscatedName("fw")
public class class176 implements Runnable {

    @ObfuscatedName("fw.c")
    public Thread field2257;

    @ObfuscatedName("fw.i")
    public OutputStream field2251;

    @ObfuscatedName("fw.o")
    public int field2253;

    @ObfuscatedName("fw.j")
    public byte[] field2254;

    @ObfuscatedName("fw.k")
    public int field2252 = 0;

    @ObfuscatedName("fw.x")
    public int field2256 = 0;

    @ObfuscatedName("fw.z")
    public IOException field2255;

    @ObfuscatedName("fw.p")
    public boolean field2258;

    public class176(OutputStream arg0, int arg1) {
        this.field2251 = arg0;
        this.field2253 = arg1 + 1;
        this.field2254 = new byte[this.field2253];
        this.field2257 = new Thread(this);
        this.field2257.setDaemon(true);
        this.field2257.start();
    }

    @ObfuscatedName("fw.c(I)Z")
    public boolean method3065() {
        if (!this.field2258) {
            return false;
        }
        try {
            this.field2251.close();
            if (this.field2255 == null) {
                this.field2255 = new IOException("");
            }
        } catch (IOException var2) {
            if (this.field2255 == null) {
                this.field2255 = new IOException(var2);
            }
        }
        return true;
    }

    public void run() {
        do {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field2255 != null) {
                        return;
                    }
                    if (this.field2252 <= this.field2256) {
                        var2 = this.field2256 - this.field2252;
                    } else {
                        var2 = this.field2256 + (this.field2253 - this.field2252);
                    }
                    if (var2 > 0) {
                        break;
                    }
                    try {
                        this.field2251.flush();
                    } catch (IOException var15) {
                        this.field2255 = var15;
                        return;
                    }
                    if (this.method3065()) {
                        return;
                    }
                    try {
                        this.wait();
                    } catch (InterruptedException var16) {
                    }
                }
            }
            try {
                if (this.field2252 + var2 <= this.field2253) {
                    this.field2251.write(this.field2254, this.field2252, var2);
                } else {
                    int var6 = this.field2253 - this.field2252;
                    this.field2251.write(this.field2254, this.field2252, var6);
                    this.field2251.write(this.field2254, 0, var2 - var6);
                }
            } catch (IOException var14) {
                IOException var7 = var14;
                synchronized (this) {
                    this.field2255 = var7;
                    return;
                }
            }
            synchronized (this) {
                this.field2252 = (this.field2252 + var2) % this.field2253;
            }
        } while (!this.method3065());
    }

    @ObfuscatedName("fw.i([BIII)V")
    public void method3066(byte[] arg0, int arg1, int arg2) throws IOException {
        if (arg2 < 0 || arg1 < 0 || arg1 + arg2 > arg0.length) {
            throw new IOException();
        }
        synchronized (this) {
            if (this.field2255 != null) {
                throw new IOException(this.field2255.toString());
            }
            int var5;
            if (this.field2252 <= this.field2256) {
                var5 = this.field2252 + (this.field2253 - this.field2256) - 1;
            } else {
                var5 = this.field2252 - this.field2256 - 1;
            }
            if (var5 < arg2) {
                throw new IOException("");
            }
            if (this.field2256 + arg2 <= this.field2253) {
                System.arraycopy(arg0, arg1, this.field2254, this.field2256, arg2);
            } else {
                int var6 = this.field2253 - this.field2256;
                System.arraycopy(arg0, arg1, this.field2254, this.field2256, var6);
                System.arraycopy(arg0, arg1 + var6, this.field2254, 0, arg2 - var6);
            }
            this.field2256 = (this.field2256 + arg2) % this.field2253;
            this.notifyAll();
        }
    }

    @ObfuscatedName("fw.o(I)V")
    public void method3064() {
        synchronized (this) {
            this.field2258 = true;
            this.notifyAll();
        }
        try {
            this.field2257.join();
        } catch (InterruptedException var4) {
        }
    }
}
