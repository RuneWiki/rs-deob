package deob;

import java.io.IOException;
import java.io.OutputStream;

@ObfuscatedName("fr")
public class class171 implements Runnable {

    @ObfuscatedName("fr.n")
    public Thread field2095;

    @ObfuscatedName("fr.h")
    public OutputStream field2092;

    @ObfuscatedName("fr.l")
    public int field2093;

    @ObfuscatedName("fr.g")
    public byte[] field2094;

    @ObfuscatedName("fr.b")
    public int field2096 = 0;

    @ObfuscatedName("fr.a")
    public int field2091 = 0;

    @ObfuscatedName("fr.c")
    public IOException field2097;

    @ObfuscatedName("fr.z")
    public boolean field2098;

    public class171(OutputStream arg0, int arg1) {
        this.field2092 = arg0;
        this.field2093 = arg1 + 1;
        this.field2094 = new byte[this.field2093];
        this.field2095 = new Thread(this);
        this.field2095.setDaemon(true);
        this.field2095.start();
    }

    @ObfuscatedName("fr.n(I)Z")
    public boolean method3324() {
        if (!this.field2098) {
            return false;
        }
        try {
            this.field2092.close();
            if (this.field2097 == null) {
                this.field2097 = new IOException("");
            }
        } catch (IOException var2) {
            if (this.field2097 == null) {
                this.field2097 = new IOException(var2);
            }
        }
        return true;
    }

    public void run() {
        do {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field2097 != null) {
                        return;
                    }
                    if (this.field2096 <= this.field2091) {
                        var2 = this.field2091 - this.field2096;
                    } else {
                        var2 = this.field2091 + (this.field2093 - this.field2096);
                    }
                    if (var2 > 0) {
                        break;
                    }
                    try {
                        this.field2092.flush();
                    } catch (IOException var15) {
                        this.field2097 = var15;
                        return;
                    }
                    if (this.method3324()) {
                        return;
                    }
                    try {
                        this.wait();
                    } catch (InterruptedException var16) {
                    }
                }
            }
            try {
                if (this.field2096 + var2 <= this.field2093) {
                    this.field2092.write(this.field2094, this.field2096, var2);
                } else {
                    int var6 = this.field2093 - this.field2096;
                    this.field2092.write(this.field2094, this.field2096, var6);
                    this.field2092.write(this.field2094, 0, var2 - var6);
                }
            } catch (IOException var14) {
                IOException var7 = var14;
                synchronized (this) {
                    this.field2097 = var7;
                    return;
                }
            }
            synchronized (this) {
                this.field2096 = (this.field2096 + var2) % this.field2093;
            }
        } while (!this.method3324());
    }

    @ObfuscatedName("fr.h([BIII)V")
    public void method3329(byte[] arg0, int arg1, int arg2) throws IOException {
        if (arg2 < 0 || arg1 < 0 || arg1 + arg2 > arg0.length) {
            throw new IOException();
        }
        synchronized (this) {
            if (this.field2097 != null) {
                throw new IOException(this.field2097.toString());
            }
            int var5;
            if (this.field2096 <= this.field2091) {
                var5 = this.field2096 + (this.field2093 - this.field2091) - 1;
            } else {
                var5 = this.field2096 - this.field2091 - 1;
            }
            if (var5 < arg2) {
                throw new IOException("");
            }
            if (this.field2091 + arg2 <= this.field2093) {
                System.arraycopy(arg0, arg1, this.field2094, this.field2091, arg2);
            } else {
                int var6 = this.field2093 - this.field2091;
                System.arraycopy(arg0, arg1, this.field2094, this.field2091, var6);
                System.arraycopy(arg0, arg1 + var6, this.field2094, 0, arg2 - var6);
            }
            this.field2091 = (this.field2091 + arg2) % this.field2093;
            this.notifyAll();
        }
    }

    @ObfuscatedName("fr.l(B)V")
    public void method3337() {
        synchronized (this) {
            this.field2098 = true;
            this.notifyAll();
        }
        try {
            this.field2095.join();
        } catch (InterruptedException var4) {
        }
    }
}
