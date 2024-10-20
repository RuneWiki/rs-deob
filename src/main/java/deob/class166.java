package deob;

import java.io.IOException;
import java.io.OutputStream;

@ObfuscatedName("fe")
public class class166 implements Runnable {

    @ObfuscatedName("fe.g")
    public Thread field2081;

    @ObfuscatedName("fe.r")
    public OutputStream field2078;

    @ObfuscatedName("fe.e")
    public int field2080;

    @ObfuscatedName("fe.q")
    public byte[] field2082;

    @ObfuscatedName("fe.c")
    public int field2086 = 0;

    @ObfuscatedName("fe.l")
    public int field2083 = 0;

    @ObfuscatedName("fe.b")
    public IOException field2084;

    @ObfuscatedName("fe.w")
    public boolean field2085;

    public class166(OutputStream arg0, int arg1) {
        this.field2078 = arg0;
        this.field2080 = arg1 + 1;
        this.field2082 = new byte[this.field2080];
        this.field2081 = new Thread(this);
        this.field2081.setDaemon(true);
        this.field2081.start();
    }

    @ObfuscatedName("fe.g(I)Z")
    public boolean method3298() {
        if (!this.field2085) {
            return false;
        }
        try {
            this.field2078.close();
            if (this.field2084 == null) {
                this.field2084 = new IOException("");
            }
        } catch (IOException var2) {
            if (this.field2084 == null) {
                this.field2084 = new IOException(var2);
            }
        }
        return true;
    }

    public void run() {
        do {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field2084 != null) {
                        return;
                    }
                    if (this.field2086 <= this.field2083) {
                        var2 = this.field2083 - this.field2086;
                    } else {
                        var2 = this.field2083 + (this.field2080 - this.field2086);
                    }
                    if (var2 > 0) {
                        break;
                    }
                    try {
                        this.field2078.flush();
                    } catch (IOException var15) {
                        this.field2084 = var15;
                        return;
                    }
                    if (this.method3298()) {
                        return;
                    }
                    try {
                        this.wait();
                    } catch (InterruptedException var16) {
                    }
                }
            }
            try {
                if (this.field2086 + var2 <= this.field2080) {
                    this.field2078.write(this.field2082, this.field2086, var2);
                } else {
                    int var6 = this.field2080 - this.field2086;
                    this.field2078.write(this.field2082, this.field2086, var6);
                    this.field2078.write(this.field2082, 0, var2 - var6);
                }
            } catch (IOException var14) {
                IOException var7 = var14;
                synchronized (this) {
                    this.field2084 = var7;
                    return;
                }
            }
            synchronized (this) {
                this.field2086 = (this.field2086 + var2) % this.field2080;
            }
        } while (!this.method3298());
    }

    @ObfuscatedName("fe.r([BIII)V")
    public void method3300(byte[] arg0, int arg1, int arg2) throws IOException {
        if (arg2 < 0 || arg1 < 0 || arg1 + arg2 > arg0.length) {
            throw new IOException();
        }
        synchronized (this) {
            if (this.field2084 != null) {
                throw new IOException(this.field2084.toString());
            }
            int var5;
            if (this.field2086 <= this.field2083) {
                var5 = this.field2086 + (this.field2080 - this.field2083) - 1;
            } else {
                var5 = this.field2086 - this.field2083 - 1;
            }
            if (var5 < arg2) {
                throw new IOException("");
            }
            if (this.field2083 + arg2 <= this.field2080) {
                System.arraycopy(arg0, arg1, this.field2082, this.field2083, arg2);
            } else {
                int var6 = this.field2080 - this.field2083;
                System.arraycopy(arg0, arg1, this.field2082, this.field2083, var6);
                System.arraycopy(arg0, arg1 + var6, this.field2082, 0, arg2 - var6);
            }
            this.field2083 = (this.field2083 + arg2) % this.field2080;
            this.notifyAll();
        }
    }

    @ObfuscatedName("fe.e(I)V")
    public void method3301() {
        synchronized (this) {
            this.field2085 = true;
            this.notifyAll();
        }
        try {
            this.field2081.join();
        } catch (InterruptedException var4) {
        }
    }
}
