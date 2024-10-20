package deob;

import java.io.IOException;
import java.io.OutputStream;

@ObfuscatedName("fr")
public class class166 implements Runnable {

    @ObfuscatedName("fr.a")
    public Thread field2192;

    @ObfuscatedName("fr.w")
    public OutputStream field2184;

    @ObfuscatedName("fr.e")
    public int field2193;

    @ObfuscatedName("fr.k")
    public byte[] field2186;

    @ObfuscatedName("fr.u")
    public int field2188 = 0;

    @ObfuscatedName("fr.z")
    public int field2185 = 0;

    @ObfuscatedName("fr.t")
    public IOException field2183;

    @ObfuscatedName("fr.f")
    public boolean field2190;

    public class166(OutputStream arg0, int arg1) {
        this.field2184 = arg0;
        this.field2193 = arg1 + 1;
        this.field2186 = new byte[this.field2193];
        this.field2192 = new Thread(this);
        this.field2192.setDaemon(true);
        this.field2192.start();
    }

    @ObfuscatedName("fr.a(I)Z")
    public boolean method2822() {
        if (!this.field2190) {
            return false;
        }
        try {
            this.field2184.close();
            if (this.field2183 == null) {
                this.field2183 = new IOException("");
            }
        } catch (IOException var2) {
            if (this.field2183 == null) {
                this.field2183 = new IOException(var2);
            }
        }
        return true;
    }

    public void run() {
        do {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field2183 != null) {
                        return;
                    }
                    if (this.field2188 <= this.field2185) {
                        var2 = this.field2185 - this.field2188;
                    } else {
                        var2 = this.field2185 + (this.field2193 - this.field2188);
                    }
                    if (var2 > 0) {
                        break;
                    }
                    try {
                        this.field2184.flush();
                    } catch (IOException var15) {
                        this.field2183 = var15;
                        return;
                    }
                    if (this.method2822()) {
                        return;
                    }
                    try {
                        this.wait();
                    } catch (InterruptedException var16) {
                    }
                }
            }
            try {
                if (this.field2188 + var2 <= this.field2193) {
                    this.field2184.write(this.field2186, this.field2188, var2);
                } else {
                    int var6 = this.field2193 - this.field2188;
                    this.field2184.write(this.field2186, this.field2188, var6);
                    this.field2184.write(this.field2186, 0, var2 - var6);
                }
            } catch (IOException var14) {
                IOException var7 = var14;
                synchronized (this) {
                    this.field2183 = var7;
                    return;
                }
            }
            synchronized (this) {
                this.field2188 = (this.field2188 + var2) % this.field2193;
            }
        } while (!this.method2822());
    }

    @ObfuscatedName("fr.w([BIII)V")
    public void method2824(byte[] arg0, int arg1, int arg2) throws IOException {
        if (arg2 < 0 || arg1 < 0 || arg1 + arg2 > arg0.length) {
            throw new IOException();
        }
        synchronized (this) {
            if (this.field2183 != null) {
                throw new IOException(this.field2183.toString());
            }
            int var5;
            if (this.field2188 <= this.field2185) {
                var5 = this.field2188 + (this.field2193 - this.field2185) - 1;
            } else {
                var5 = this.field2188 - this.field2185 - 1;
            }
            if (var5 < arg2) {
                throw new IOException("");
            }
            if (this.field2185 + arg2 <= this.field2193) {
                System.arraycopy(arg0, arg1, this.field2186, this.field2185, arg2);
            } else {
                int var6 = this.field2193 - this.field2185;
                System.arraycopy(arg0, arg1, this.field2186, this.field2185, var6);
                System.arraycopy(arg0, arg1 + var6, this.field2186, 0, arg2 - var6);
            }
            this.field2185 = (this.field2185 + arg2) % this.field2193;
            this.notifyAll();
        }
    }

    @ObfuscatedName("fr.e(B)V")
    public void method2829() {
        synchronized (this) {
            this.field2190 = true;
            this.notifyAll();
        }
        try {
            this.field2192.join();
        } catch (InterruptedException var4) {
        }
    }
}
