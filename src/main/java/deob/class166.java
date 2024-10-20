package deob;

import java.io.IOException;
import java.io.OutputStream;

@ObfuscatedName("fb")
public class class166 implements Runnable {

    @ObfuscatedName("fb.y")
    public Thread field2050;

    @ObfuscatedName("fb.c")
    public OutputStream field2054;

    @ObfuscatedName("fb.n")
    public int field2055;

    @ObfuscatedName("fb.u")
    public byte[] field2052;

    @ObfuscatedName("fb.i")
    public int field2053 = 0;

    @ObfuscatedName("fb.r")
    public int field2049 = 0;

    @ObfuscatedName("fb.j")
    public IOException field2051;

    @ObfuscatedName("fb.p")
    public boolean field2056;

    public class166(OutputStream arg0, int arg1) {
        this.field2054 = arg0;
        this.field2055 = arg1 + 1;
        this.field2052 = new byte[this.field2055];
        this.field2050 = new Thread(this);
        this.field2050.setDaemon(true);
        this.field2050.start();
    }

    @ObfuscatedName("fb.y(I)Z")
    public boolean method3102() {
        if (!this.field2056) {
            return false;
        }
        try {
            this.field2054.close();
            if (this.field2051 == null) {
                this.field2051 = new IOException("");
            }
        } catch (IOException var2) {
            if (this.field2051 == null) {
                this.field2051 = new IOException(var2);
            }
        }
        return true;
    }

    public void run() {
        do {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field2051 != null) {
                        return;
                    }
                    if (this.field2053 <= this.field2049) {
                        var2 = this.field2049 - this.field2053;
                    } else {
                        var2 = this.field2049 + (this.field2055 - this.field2053);
                    }
                    if (var2 > 0) {
                        break;
                    }
                    try {
                        this.field2054.flush();
                    } catch (IOException var15) {
                        this.field2051 = var15;
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
                if (this.field2053 + var2 <= this.field2055) {
                    this.field2054.write(this.field2052, this.field2053, var2);
                } else {
                    int var6 = this.field2055 - this.field2053;
                    this.field2054.write(this.field2052, this.field2053, var6);
                    this.field2054.write(this.field2052, 0, var2 - var6);
                }
            } catch (IOException var14) {
                IOException var7 = var14;
                synchronized (this) {
                    this.field2051 = var7;
                    return;
                }
            }
            synchronized (this) {
                this.field2053 = (this.field2053 + var2) % this.field2055;
            }
        } while (!this.method3102());
    }

    @ObfuscatedName("fb.c([BIII)V")
    public void method3114(byte[] arg0, int arg1, int arg2) throws IOException {
        if (arg2 < 0 || arg1 < 0 || arg1 + arg2 > arg0.length) {
            throw new IOException();
        }
        synchronized (this) {
            if (this.field2051 != null) {
                throw new IOException(this.field2051.toString());
            }
            int var5;
            if (this.field2053 <= this.field2049) {
                var5 = this.field2053 + (this.field2055 - this.field2049) - 1;
            } else {
                var5 = this.field2053 - this.field2049 - 1;
            }
            if (var5 < arg2) {
                throw new IOException("");
            }
            if (this.field2049 + arg2 <= this.field2055) {
                System.arraycopy(arg0, arg1, this.field2052, this.field2049, arg2);
            } else {
                int var6 = this.field2055 - this.field2049;
                System.arraycopy(arg0, arg1, this.field2052, this.field2049, var6);
                System.arraycopy(arg0, arg1 + var6, this.field2052, 0, arg2 - var6);
            }
            this.field2049 = (this.field2049 + arg2) % this.field2055;
            this.notifyAll();
        }
    }

    @ObfuscatedName("fb.n(B)V")
    public void method3105() {
        synchronized (this) {
            this.field2056 = true;
            this.notifyAll();
        }
        try {
            this.field2050.join();
        } catch (InterruptedException var4) {
        }
    }
}
