package deob;

import java.io.IOException;
import java.io.OutputStream;

@ObfuscatedName("fv")
public class class164 implements Runnable {

    @ObfuscatedName("fv.w")
    public Thread field2304;

    @ObfuscatedName("fv.o")
    public OutputStream field2298;

    @ObfuscatedName("fv.x")
    public int field2300;

    @ObfuscatedName("fv.k")
    public byte[] field2299;

    @ObfuscatedName("fv.f")
    public int field2302 = 0;

    @ObfuscatedName("fv.i")
    public int field2301 = 0;

    @ObfuscatedName("fv.j")
    public IOException field2303;

    @ObfuscatedName("fv.m")
    public boolean field2305;

    public class164(OutputStream arg0, int arg1) {
        this.field2298 = arg0;
        this.field2300 = arg1 + 1;
        this.field2299 = new byte[this.field2300];
        this.field2304 = new Thread(this);
        this.field2304.setDaemon(true);
        this.field2304.start();
    }

    @ObfuscatedName("fv.w(B)Z")
    public boolean method2751() {
        if (!this.field2305) {
            return false;
        }
        try {
            this.field2298.close();
            if (this.field2303 == null) {
                this.field2303 = new IOException("");
            }
        } catch (IOException var2) {
            if (this.field2303 == null) {
                this.field2303 = new IOException(var2);
            }
        }
        return true;
    }

    public void run() {
        do {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field2303 != null) {
                        return;
                    }
                    if (this.field2302 <= this.field2301) {
                        var2 = this.field2301 - this.field2302;
                    } else {
                        var2 = this.field2301 + (this.field2300 - this.field2302);
                    }
                    if (var2 > 0) {
                        break;
                    }
                    try {
                        this.field2298.flush();
                    } catch (IOException var15) {
                        this.field2303 = var15;
                        return;
                    }
                    if (this.method2751()) {
                        return;
                    }
                    try {
                        this.wait();
                    } catch (InterruptedException var16) {
                    }
                }
            }
            try {
                if (this.field2302 + var2 <= this.field2300) {
                    this.field2298.write(this.field2299, this.field2302, var2);
                } else {
                    int var6 = this.field2300 - this.field2302;
                    this.field2298.write(this.field2299, this.field2302, var6);
                    this.field2298.write(this.field2299, 0, var2 - var6);
                }
            } catch (IOException var14) {
                IOException var7 = var14;
                synchronized (this) {
                    this.field2303 = var7;
                    return;
                }
            }
            synchronized (this) {
                this.field2302 = (this.field2302 + var2) % this.field2300;
            }
        } while (!this.method2751());
    }

    @ObfuscatedName("fv.o([BIII)V")
    public void method2747(byte[] arg0, int arg1, int arg2) throws IOException {
        if (arg2 < 0 || arg1 < 0 || arg1 + arg2 > arg0.length) {
            throw new IOException();
        }
        synchronized (this) {
            if (this.field2303 != null) {
                throw new IOException(this.field2303.toString());
            }
            int var5;
            if (this.field2302 <= this.field2301) {
                var5 = this.field2302 + (this.field2300 - this.field2301) - 1;
            } else {
                var5 = this.field2302 - this.field2301 - 1;
            }
            if (var5 < arg2) {
                throw new IOException("");
            }
            if (this.field2301 + arg2 <= this.field2300) {
                System.arraycopy(arg0, arg1, this.field2299, this.field2301, arg2);
            } else {
                int var6 = this.field2300 - this.field2301;
                System.arraycopy(arg0, arg1, this.field2299, this.field2301, var6);
                System.arraycopy(arg0, arg1 + var6, this.field2299, 0, arg2 - var6);
            }
            this.field2301 = (this.field2301 + arg2) % this.field2300;
            this.notifyAll();
        }
    }

    @ObfuscatedName("fv.x(I)V")
    public void method2746() {
        synchronized (this) {
            this.field2305 = true;
            this.notifyAll();
        }
        try {
            this.field2304.join();
        } catch (InterruptedException var4) {
        }
    }
}
