package deob;

import java.io.IOException;
import java.io.OutputStream;

@ObfuscatedName("nb")
public class class382 implements Runnable {

    @ObfuscatedName("nb.c")
    public Thread field4395;

    @ObfuscatedName("nb.p")
    public OutputStream field4389;

    @ObfuscatedName("nb.f")
    public int field4396;

    @ObfuscatedName("nb.n")
    public byte[] field4394;

    @ObfuscatedName("nb.k")
    public int field4393 = 0;

    @ObfuscatedName("nb.w")
    public int field4390 = 0;

    @ObfuscatedName("nb.s")
    public IOException field4391;

    @ObfuscatedName("nb.q")
    public boolean field4392;

    public class382(OutputStream arg0, int arg1) {
        this.field4389 = arg0;
        this.field4396 = arg1 + 1;
        this.field4394 = new byte[this.field4396];
        this.field4395 = new Thread(this);
        this.field4395.setDaemon(true);
        this.field4395.start();
    }

    @ObfuscatedName("nb.c(I)Z")
    public boolean method6383() {
        if (!this.field4392) {
            return false;
        }
        try {
            this.field4389.close();
            if (this.field4391 == null) {
                this.field4391 = new IOException("");
            }
        } catch (IOException var2) {
            if (this.field4391 == null) {
                this.field4391 = new IOException(var2);
            }
        }
        return true;
    }

    public void run() {
        do {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field4391 != null) {
                        return;
                    }
                    if (this.field4393 <= this.field4390) {
                        var2 = this.field4390 - this.field4393;
                    } else {
                        var2 = this.field4390 + (this.field4396 - this.field4393);
                    }
                    if (var2 > 0) {
                        break;
                    }
                    try {
                        this.field4389.flush();
                    } catch (IOException var15) {
                        this.field4391 = var15;
                        return;
                    }
                    if (this.method6383()) {
                        return;
                    }
                    try {
                        this.wait();
                    } catch (InterruptedException var16) {
                    }
                }
            }
            try {
                if (this.field4393 + var2 <= this.field4396) {
                    this.field4389.write(this.field4394, this.field4393, var2);
                } else {
                    int var6 = this.field4396 - this.field4393;
                    this.field4389.write(this.field4394, this.field4393, var6);
                    this.field4389.write(this.field4394, 0, var2 - var6);
                }
            } catch (IOException var14) {
                IOException var7 = var14;
                synchronized (this) {
                    this.field4391 = var7;
                    return;
                }
            }
            synchronized (this) {
                this.field4393 = (this.field4393 + var2) % this.field4396;
            }
        } while (!this.method6383());
    }

    @ObfuscatedName("nb.p([BIIB)V")
    public void method6384(byte[] arg0, int arg1, int arg2) throws IOException {
        if (arg2 < 0 || arg1 < 0 || arg1 + arg2 > arg0.length) {
            throw new IOException();
        }
        synchronized (this) {
            if (this.field4391 != null) {
                throw new IOException(this.field4391.toString());
            }
            int var5;
            if (this.field4393 <= this.field4390) {
                var5 = this.field4393 + (this.field4396 - this.field4390) - 1;
            } else {
                var5 = this.field4393 - this.field4390 - 1;
            }
            if (var5 < arg2) {
                throw new IOException("");
            }
            if (this.field4390 + arg2 <= this.field4396) {
                System.arraycopy(arg0, arg1, this.field4394, this.field4390, arg2);
            } else {
                int var6 = this.field4396 - this.field4390;
                System.arraycopy(arg0, arg1, this.field4394, this.field4390, var6);
                System.arraycopy(arg0, arg1 + var6, this.field4394, 0, arg2 - var6);
            }
            this.field4390 = (this.field4390 + arg2) % this.field4396;
            this.notifyAll();
        }
    }

    @ObfuscatedName("nb.f(I)V")
    public void method6388() {
        synchronized (this) {
            this.field4392 = true;
            this.notifyAll();
        }
        try {
            this.field4395.join();
        } catch (InterruptedException var4) {
        }
    }
}
