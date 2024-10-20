package deob;

import java.io.IOException;
import java.io.OutputStream;

@ObfuscatedName("fr")
public class class177 implements Runnable {

    @ObfuscatedName("fr.m")
    public Thread field2095;

    @ObfuscatedName("fr.f")
    public OutputStream field2090;

    @ObfuscatedName("fr.q")
    public int field2091;

    @ObfuscatedName("fr.w")
    public byte[] field2089;

    @ObfuscatedName("fr.o")
    public int field2098 = 0;

    @ObfuscatedName("fr.u")
    public int field2094 = 0;

    @ObfuscatedName("fr.g")
    public IOException field2092;

    @ObfuscatedName("fr.l")
    public boolean field2096;

    public class177(OutputStream arg0, int arg1) {
        this.field2090 = arg0;
        this.field2091 = arg1 + 1;
        this.field2089 = new byte[this.field2091];
        this.field2095 = new Thread(this);
        this.field2095.setDaemon(true);
        this.field2095.start();
    }

    @ObfuscatedName("fr.m(I)Z")
    public boolean method3242() {
        if (!this.field2096) {
            return false;
        }
        try {
            this.field2090.close();
            if (this.field2092 == null) {
                this.field2092 = new IOException("");
            }
        } catch (IOException var2) {
            if (this.field2092 == null) {
                this.field2092 = new IOException(var2);
            }
        }
        return true;
    }

    public void run() {
        do {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field2092 != null) {
                        return;
                    }
                    if (this.field2098 <= this.field2094) {
                        var2 = this.field2094 - this.field2098;
                    } else {
                        var2 = this.field2094 + (this.field2091 - this.field2098);
                    }
                    if (var2 > 0) {
                        break;
                    }
                    try {
                        this.field2090.flush();
                    } catch (IOException var15) {
                        this.field2092 = var15;
                        return;
                    }
                    if (this.method3242()) {
                        return;
                    }
                    try {
                        this.wait();
                    } catch (InterruptedException var16) {
                    }
                }
            }
            try {
                if (this.field2098 + var2 <= this.field2091) {
                    this.field2090.write(this.field2089, this.field2098, var2);
                } else {
                    int var6 = this.field2091 - this.field2098;
                    this.field2090.write(this.field2089, this.field2098, var6);
                    this.field2090.write(this.field2089, 0, var2 - var6);
                }
            } catch (IOException var14) {
                IOException var7 = var14;
                synchronized (this) {
                    this.field2092 = var7;
                    return;
                }
            }
            synchronized (this) {
                this.field2098 = (this.field2098 + var2) % this.field2091;
            }
        } while (!this.method3242());
    }

    @ObfuscatedName("fr.f([BIIB)V")
    public void method3243(byte[] arg0, int arg1, int arg2) throws IOException {
        if (arg2 < 0 || arg1 < 0 || arg1 + arg2 > arg0.length) {
            throw new IOException();
        }
        synchronized (this) {
            if (this.field2092 != null) {
                throw new IOException(this.field2092.toString());
            }
            int var5;
            if (this.field2098 <= this.field2094) {
                var5 = this.field2098 + (this.field2091 - this.field2094) - 1;
            } else {
                var5 = this.field2098 - this.field2094 - 1;
            }
            if (var5 < arg2) {
                throw new IOException("");
            }
            if (this.field2094 + arg2 <= this.field2091) {
                System.arraycopy(arg0, arg1, this.field2089, this.field2094, arg2);
            } else {
                int var6 = this.field2091 - this.field2094;
                System.arraycopy(arg0, arg1, this.field2089, this.field2094, var6);
                System.arraycopy(arg0, arg1 + var6, this.field2089, 0, arg2 - var6);
            }
            this.field2094 = (this.field2094 + arg2) % this.field2091;
            this.notifyAll();
        }
    }

    @ObfuscatedName("fr.q(I)V")
    public void method3244() {
        synchronized (this) {
            this.field2096 = true;
            this.notifyAll();
        }
        try {
            this.field2095.join();
        } catch (InterruptedException var4) {
        }
    }
}
