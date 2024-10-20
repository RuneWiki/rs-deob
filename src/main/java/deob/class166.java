package deob;

import java.io.IOException;
import java.io.OutputStream;

@ObfuscatedName("fb")
public class class166 implements Runnable {

    @ObfuscatedName("fb.p")
    public Thread field2164;

    @ObfuscatedName("fb.i")
    public OutputStream field2165;

    @ObfuscatedName("fb.w")
    public int field2170;

    @ObfuscatedName("fb.s")
    public byte[] field2166;

    @ObfuscatedName("fb.j")
    public int field2167 = 0;

    @ObfuscatedName("fb.a")
    public int field2163 = 0;

    @ObfuscatedName("fb.t")
    public IOException field2169;

    @ObfuscatedName("fb.r")
    public boolean field2168;

    public class166(OutputStream arg0, int arg1) {
        this.field2165 = arg0;
        this.field2170 = arg1 + 1;
        this.field2166 = new byte[this.field2170];
        this.field2164 = new Thread(this);
        this.field2164.setDaemon(true);
        this.field2164.start();
    }

    @ObfuscatedName("fb.p(I)Z")
    public boolean method2958() {
        if (!this.field2168) {
            return false;
        }
        try {
            this.field2165.close();
            if (this.field2169 == null) {
                this.field2169 = new IOException("");
            }
        } catch (IOException var2) {
            if (this.field2169 == null) {
                this.field2169 = new IOException(var2);
            }
        }
        return true;
    }

    public void run() {
        do {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field2169 != null) {
                        return;
                    }
                    if (this.field2167 <= this.field2163) {
                        var2 = this.field2163 - this.field2167;
                    } else {
                        var2 = this.field2163 + (this.field2170 - this.field2167);
                    }
                    if (var2 > 0) {
                        break;
                    }
                    try {
                        this.field2165.flush();
                    } catch (IOException var15) {
                        this.field2169 = var15;
                        return;
                    }
                    if (this.method2958()) {
                        return;
                    }
                    try {
                        this.wait();
                    } catch (InterruptedException var16) {
                    }
                }
            }
            try {
                if (this.field2167 + var2 <= this.field2170) {
                    this.field2165.write(this.field2166, this.field2167, var2);
                } else {
                    int var6 = this.field2170 - this.field2167;
                    this.field2165.write(this.field2166, this.field2167, var6);
                    this.field2165.write(this.field2166, 0, var2 - var6);
                }
            } catch (IOException var14) {
                IOException var7 = var14;
                synchronized (this) {
                    this.field2169 = var7;
                    return;
                }
            }
            synchronized (this) {
                this.field2167 = (this.field2167 + var2) % this.field2170;
            }
        } while (!this.method2958());
    }

    @ObfuscatedName("fb.i([BIII)V")
    public void method2959(byte[] arg0, int arg1, int arg2) throws IOException {
        if (arg2 < 0 || arg1 < 0 || arg1 + arg2 > arg0.length) {
            throw new IOException();
        }
        synchronized (this) {
            if (this.field2169 != null) {
                throw new IOException(this.field2169.toString());
            }
            int var5;
            if (this.field2167 <= this.field2163) {
                var5 = this.field2167 + (this.field2170 - this.field2163) - 1;
            } else {
                var5 = this.field2167 - this.field2163 - 1;
            }
            if (var5 < arg2) {
                throw new IOException("");
            }
            if (this.field2163 + arg2 <= this.field2170) {
                System.arraycopy(arg0, arg1, this.field2166, this.field2163, arg2);
            } else {
                int var6 = this.field2170 - this.field2163;
                System.arraycopy(arg0, arg1, this.field2166, this.field2163, var6);
                System.arraycopy(arg0, arg1 + var6, this.field2166, 0, arg2 - var6);
            }
            this.field2163 = (this.field2163 + arg2) % this.field2170;
            this.notifyAll();
        }
    }

    @ObfuscatedName("fb.w(I)V")
    public void method2963() {
        synchronized (this) {
            this.field2168 = true;
            this.notifyAll();
        }
        try {
            this.field2164.join();
        } catch (InterruptedException var4) {
        }
    }
}
