package deob;

import java.io.IOException;
import java.io.OutputStream;

@ObfuscatedName("fp")
public class class175 implements Runnable {

    @ObfuscatedName("fp.b")
    public Thread field2218;

    @ObfuscatedName("fp.q")
    public OutputStream field2220;

    @ObfuscatedName("fp.o")
    public int field2217;

    @ObfuscatedName("fp.p")
    public byte[] field2219;

    @ObfuscatedName("fp.a")
    public int field2221 = 0;

    @ObfuscatedName("fp.h")
    public int field2222 = 0;

    @ObfuscatedName("fp.l")
    public IOException field2223;

    @ObfuscatedName("fp.y")
    public boolean field2224;

    public class175(OutputStream arg0, int arg1) {
        this.field2220 = arg0;
        this.field2217 = arg1 + 1;
        this.field2219 = new byte[this.field2217];
        this.field2218 = new Thread(this);
        this.field2218.setDaemon(true);
        this.field2218.start();
    }

    @ObfuscatedName("fp.b(S)Z")
    public boolean method3065() {
        if (!this.field2224) {
            return false;
        }
        try {
            this.field2220.close();
            if (this.field2223 == null) {
                this.field2223 = new IOException("");
            }
        } catch (IOException var2) {
            if (this.field2223 == null) {
                this.field2223 = new IOException(var2);
            }
        }
        return true;
    }

    public void run() {
        do {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field2223 != null) {
                        return;
                    }
                    if (this.field2221 <= this.field2222) {
                        var2 = this.field2222 - this.field2221;
                    } else {
                        var2 = this.field2222 + (this.field2217 - this.field2221);
                    }
                    if (var2 > 0) {
                        break;
                    }
                    try {
                        this.field2220.flush();
                    } catch (IOException var15) {
                        this.field2223 = var15;
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
                if (this.field2221 + var2 <= this.field2217) {
                    this.field2220.write(this.field2219, this.field2221, var2);
                } else {
                    int var6 = this.field2217 - this.field2221;
                    this.field2220.write(this.field2219, this.field2221, var6);
                    this.field2220.write(this.field2219, 0, var2 - var6);
                }
            } catch (IOException var14) {
                IOException var7 = var14;
                synchronized (this) {
                    this.field2223 = var7;
                    return;
                }
            }
            synchronized (this) {
                this.field2221 = (this.field2221 + var2) % this.field2217;
            }
        } while (!this.method3065());
    }

    @ObfuscatedName("fp.q([BIII)V")
    public void method3067(byte[] arg0, int arg1, int arg2) throws IOException {
        if (arg2 < 0 || arg1 < 0 || arg1 + arg2 > arg0.length) {
            throw new IOException();
        }
        synchronized (this) {
            if (this.field2223 != null) {
                throw new IOException(this.field2223.toString());
            }
            int var5;
            if (this.field2221 <= this.field2222) {
                var5 = this.field2221 + (this.field2217 - this.field2222) - 1;
            } else {
                var5 = this.field2221 - this.field2222 - 1;
            }
            if (var5 < arg2) {
                throw new IOException("");
            }
            if (this.field2222 + arg2 <= this.field2217) {
                System.arraycopy(arg0, arg1, this.field2219, this.field2222, arg2);
            } else {
                int var6 = this.field2217 - this.field2222;
                System.arraycopy(arg0, arg1, this.field2219, this.field2222, var6);
                System.arraycopy(arg0, arg1 + var6, this.field2219, 0, arg2 - var6);
            }
            this.field2222 = (this.field2222 + arg2) % this.field2217;
            this.notifyAll();
        }
    }

    @ObfuscatedName("fp.o(S)V")
    public void method3068() {
        synchronized (this) {
            this.field2224 = true;
            this.notifyAll();
        }
        try {
            this.field2218.join();
        } catch (InterruptedException var4) {
        }
    }
}
