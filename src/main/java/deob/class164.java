package deob;

import java.io.IOException;
import java.io.OutputStream;

@ObfuscatedName("fw")
public class class164 implements Runnable {

    @ObfuscatedName("fw.s")
    public Thread field2294;

    @ObfuscatedName("fw.c")
    public OutputStream field2301;

    @ObfuscatedName("fw.f")
    public int field2296;

    @ObfuscatedName("fw.m")
    public byte[] field2297;

    @ObfuscatedName("fw.h")
    public int field2298 = 0;

    @ObfuscatedName("fw.t")
    public int field2299 = 0;

    @ObfuscatedName("fw.p")
    public IOException field2295;

    @ObfuscatedName("fw.d")
    public boolean field2300;

    public class164(OutputStream arg0, int arg1) {
        this.field2301 = arg0;
        this.field2296 = arg1 + 1;
        this.field2297 = new byte[this.field2296];
        this.field2294 = new Thread(this);
        this.field2294.setDaemon(true);
        this.field2294.start();
    }

    @ObfuscatedName("fw.s(I)Z")
    public boolean method2845() {
        if (!this.field2300) {
            return false;
        }
        try {
            this.field2301.close();
            if (this.field2295 == null) {
                this.field2295 = new IOException("");
            }
        } catch (IOException var2) {
            if (this.field2295 == null) {
                this.field2295 = new IOException(var2);
            }
        }
        return true;
    }

    public void run() {
        do {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field2295 != null) {
                        return;
                    }
                    if (this.field2298 <= this.field2299) {
                        var2 = this.field2299 - this.field2298;
                    } else {
                        var2 = this.field2299 + (this.field2296 - this.field2298);
                    }
                    if (var2 > 0) {
                        break;
                    }
                    try {
                        this.field2301.flush();
                    } catch (IOException var15) {
                        this.field2295 = var15;
                        return;
                    }
                    if (this.method2845()) {
                        return;
                    }
                    try {
                        this.wait();
                    } catch (InterruptedException var16) {
                    }
                }
            }
            try {
                if (this.field2298 + var2 <= this.field2296) {
                    this.field2301.write(this.field2297, this.field2298, var2);
                } else {
                    int var6 = this.field2296 - this.field2298;
                    this.field2301.write(this.field2297, this.field2298, var6);
                    this.field2301.write(this.field2297, 0, var2 - var6);
                }
            } catch (IOException var14) {
                IOException var7 = var14;
                synchronized (this) {
                    this.field2295 = var7;
                    return;
                }
            }
            synchronized (this) {
                this.field2298 = (this.field2298 + var2) % this.field2296;
            }
        } while (!this.method2845());
    }

    @ObfuscatedName("fw.c([BIIB)V")
    public void method2834(byte[] arg0, int arg1, int arg2) throws IOException {
        if (arg2 < 0 || arg1 < 0 || arg1 + arg2 > arg0.length) {
            throw new IOException();
        }
        synchronized (this) {
            if (this.field2295 != null) {
                throw new IOException(this.field2295.toString());
            }
            int var5;
            if (this.field2298 <= this.field2299) {
                var5 = this.field2298 + (this.field2296 - this.field2299) - 1;
            } else {
                var5 = this.field2298 - this.field2299 - 1;
            }
            if (var5 < arg2) {
                throw new IOException("");
            }
            if (this.field2299 + arg2 <= this.field2296) {
                System.arraycopy(arg0, arg1, this.field2297, this.field2299, arg2);
            } else {
                int var6 = this.field2296 - this.field2299;
                System.arraycopy(arg0, arg1, this.field2297, this.field2299, var6);
                System.arraycopy(arg0, arg1 + var6, this.field2297, 0, arg2 - var6);
            }
            this.field2299 = (this.field2299 + arg2) % this.field2296;
            this.notifyAll();
        }
    }

    @ObfuscatedName("fw.f(I)V")
    public void method2846() {
        synchronized (this) {
            this.field2300 = true;
            this.notifyAll();
        }
        try {
            this.field2294.join();
        } catch (InterruptedException var4) {
        }
    }
}
