package deob;

import java.io.IOException;
import java.io.OutputStream;

@ObfuscatedName("fe")
public class class166 implements Runnable {

    @ObfuscatedName("fe.f")
    public Thread field2083;

    @ObfuscatedName("fe.l")
    public OutputStream field2084;

    @ObfuscatedName("fe.w")
    public int field2080;

    @ObfuscatedName("fe.s")
    public byte[] field2082;

    @ObfuscatedName("fe.e")
    public int field2086 = 0;

    @ObfuscatedName("fe.a")
    public int field2089 = 0;

    @ObfuscatedName("fe.c")
    public IOException field2085;

    @ObfuscatedName("fe.p")
    public boolean field2081;

    public class166(OutputStream arg0, int arg1) {
        this.field2084 = arg0;
        this.field2080 = arg1 + 1;
        this.field2082 = new byte[this.field2080];
        this.field2083 = new Thread(this);
        this.field2083.setDaemon(true);
        this.field2083.start();
    }

    @ObfuscatedName("fe.f(B)Z")
    public boolean method3175() {
        if (!this.field2081) {
            return false;
        }
        try {
            this.field2084.close();
            if (this.field2085 == null) {
                this.field2085 = new IOException("");
            }
        } catch (IOException var2) {
            if (this.field2085 == null) {
                this.field2085 = new IOException(var2);
            }
        }
        return true;
    }

    public void run() {
        do {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field2085 != null) {
                        return;
                    }
                    if (this.field2086 <= this.field2089) {
                        var2 = this.field2089 - this.field2086;
                    } else {
                        var2 = this.field2089 + (this.field2080 - this.field2086);
                    }
                    if (var2 > 0) {
                        break;
                    }
                    try {
                        this.field2084.flush();
                    } catch (IOException var15) {
                        this.field2085 = var15;
                        return;
                    }
                    if (this.method3175()) {
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
                    this.field2084.write(this.field2082, this.field2086, var2);
                } else {
                    int var6 = this.field2080 - this.field2086;
                    this.field2084.write(this.field2082, this.field2086, var6);
                    this.field2084.write(this.field2082, 0, var2 - var6);
                }
            } catch (IOException var14) {
                IOException var7 = var14;
                synchronized (this) {
                    this.field2085 = var7;
                    return;
                }
            }
            synchronized (this) {
                this.field2086 = (this.field2086 + var2) % this.field2080;
            }
        } while (!this.method3175());
    }

    @ObfuscatedName("fe.l([BIIB)V")
    public void method3191(byte[] arg0, int arg1, int arg2) throws IOException {
        if (arg2 < 0 || arg1 < 0 || arg1 + arg2 > arg0.length) {
            throw new IOException();
        }
        synchronized (this) {
            if (this.field2085 != null) {
                throw new IOException(this.field2085.toString());
            }
            int var5;
            if (this.field2086 <= this.field2089) {
                var5 = this.field2086 + (this.field2080 - this.field2089) - 1;
            } else {
                var5 = this.field2086 - this.field2089 - 1;
            }
            if (var5 < arg2) {
                throw new IOException("");
            }
            if (this.field2089 + arg2 <= this.field2080) {
                System.arraycopy(arg0, arg1, this.field2082, this.field2089, arg2);
            } else {
                int var6 = this.field2080 - this.field2089;
                System.arraycopy(arg0, arg1, this.field2082, this.field2089, var6);
                System.arraycopy(arg0, arg1 + var6, this.field2082, 0, arg2 - var6);
            }
            this.field2089 = (this.field2089 + arg2) % this.field2080;
            this.notifyAll();
        }
    }

    @ObfuscatedName("fe.w(I)V")
    public void method3178() {
        synchronized (this) {
            this.field2081 = true;
            this.notifyAll();
        }
        try {
            this.field2083.join();
        } catch (InterruptedException var4) {
        }
    }
}
