package deob;

import java.io.IOException;
import java.io.OutputStream;

@ObfuscatedName("fj")
public class class176 implements Runnable {

    @ObfuscatedName("fj.t")
    public Thread field2224;

    @ObfuscatedName("fj.q")
    public OutputStream field2223;

    @ObfuscatedName("fj.i")
    public int field2226;

    @ObfuscatedName("fj.a")
    public byte[] field2225;

    @ObfuscatedName("fj.l")
    public int field2227 = 0;

    @ObfuscatedName("fj.b")
    public int field2222 = 0;

    @ObfuscatedName("fj.e")
    public IOException field2228;

    @ObfuscatedName("fj.x")
    public boolean field2229;

    public class176(OutputStream arg0, int arg1) {
        this.field2223 = arg0;
        this.field2226 = arg1 + 1;
        this.field2225 = new byte[this.field2226];
        this.field2224 = new Thread(this);
        this.field2224.setDaemon(true);
        this.field2224.start();
    }

    @ObfuscatedName("fj.t(B)Z")
    public boolean method3082() {
        if (!this.field2229) {
            return false;
        }
        try {
            this.field2223.close();
            if (this.field2228 == null) {
                this.field2228 = new IOException("");
            }
        } catch (IOException var2) {
            if (this.field2228 == null) {
                this.field2228 = new IOException(var2);
            }
        }
        return true;
    }

    public void run() {
        do {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field2228 != null) {
                        return;
                    }
                    if (this.field2227 <= this.field2222) {
                        var2 = this.field2222 - this.field2227;
                    } else {
                        var2 = this.field2222 + (this.field2226 - this.field2227);
                    }
                    if (var2 > 0) {
                        break;
                    }
                    try {
                        this.field2223.flush();
                    } catch (IOException var15) {
                        this.field2228 = var15;
                        return;
                    }
                    if (this.method3082()) {
                        return;
                    }
                    try {
                        this.wait();
                    } catch (InterruptedException var16) {
                    }
                }
            }
            try {
                if (this.field2227 + var2 <= this.field2226) {
                    this.field2223.write(this.field2225, this.field2227, var2);
                } else {
                    int var6 = this.field2226 - this.field2227;
                    this.field2223.write(this.field2225, this.field2227, var6);
                    this.field2223.write(this.field2225, 0, var2 - var6);
                }
            } catch (IOException var14) {
                IOException var7 = var14;
                synchronized (this) {
                    this.field2228 = var7;
                    return;
                }
            }
            synchronized (this) {
                this.field2227 = (this.field2227 + var2) % this.field2226;
            }
        } while (!this.method3082());
    }

    @ObfuscatedName("fj.q([BIII)V")
    public void method3076(byte[] arg0, int arg1, int arg2) throws IOException {
        if (arg2 < 0 || arg1 < 0 || arg1 + arg2 > arg0.length) {
            throw new IOException();
        }
        synchronized (this) {
            if (this.field2228 != null) {
                throw new IOException(this.field2228.toString());
            }
            int var5;
            if (this.field2227 <= this.field2222) {
                var5 = this.field2227 + (this.field2226 - this.field2222) - 1;
            } else {
                var5 = this.field2227 - this.field2222 - 1;
            }
            if (var5 < arg2) {
                throw new IOException("");
            }
            if (this.field2222 + arg2 <= this.field2226) {
                System.arraycopy(arg0, arg1, this.field2225, this.field2222, arg2);
            } else {
                int var6 = this.field2226 - this.field2222;
                System.arraycopy(arg0, arg1, this.field2225, this.field2222, var6);
                System.arraycopy(arg0, arg1 + var6, this.field2225, 0, arg2 - var6);
            }
            this.field2222 = (this.field2222 + arg2) % this.field2226;
            this.notifyAll();
        }
    }

    @ObfuscatedName("fj.i(B)V")
    public void method3074() {
        synchronized (this) {
            this.field2229 = true;
            this.notifyAll();
        }
        try {
            this.field2224.join();
        } catch (InterruptedException var4) {
        }
    }
}
