package deob;

import java.io.IOException;
import java.io.OutputStream;

@ObfuscatedName("nc")
public class class380 implements Runnable {

    @ObfuscatedName("nc.c")
    public Thread field4351;

    @ObfuscatedName("nc.v")
    public OutputStream field4350;

    @ObfuscatedName("nc.q")
    public int field4355;

    @ObfuscatedName("nc.f")
    public byte[] field4352;

    @ObfuscatedName("nc.j")
    public int field4349 = 0;

    @ObfuscatedName("nc.e")
    public int field4354 = 0;

    @ObfuscatedName("nc.g")
    public IOException field4353;

    @ObfuscatedName("nc.w")
    public boolean field4356;

    public class380(OutputStream arg0, int arg1) {
        this.field4350 = arg0;
        this.field4355 = arg1 + 1;
        this.field4352 = new byte[this.field4355];
        this.field4351 = new Thread(this);
        this.field4351.setDaemon(true);
        this.field4351.start();
    }

    @ObfuscatedName("nc.c(I)Z")
    public boolean method6246() {
        if (!this.field4356) {
            return false;
        }
        try {
            this.field4350.close();
            if (this.field4353 == null) {
                this.field4353 = new IOException("");
            }
        } catch (IOException var2) {
            if (this.field4353 == null) {
                this.field4353 = new IOException(var2);
            }
        }
        return true;
    }

    public void run() {
        do {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field4353 != null) {
                        return;
                    }
                    if (this.field4349 <= this.field4354) {
                        var2 = this.field4354 - this.field4349;
                    } else {
                        var2 = this.field4354 + (this.field4355 - this.field4349);
                    }
                    if (var2 > 0) {
                        break;
                    }
                    try {
                        this.field4350.flush();
                    } catch (IOException var15) {
                        this.field4353 = var15;
                        return;
                    }
                    if (this.method6246()) {
                        return;
                    }
                    try {
                        this.wait();
                    } catch (InterruptedException var16) {
                    }
                }
            }
            try {
                if (this.field4349 + var2 <= this.field4355) {
                    this.field4350.write(this.field4352, this.field4349, var2);
                } else {
                    int var6 = this.field4355 - this.field4349;
                    this.field4350.write(this.field4352, this.field4349, var6);
                    this.field4350.write(this.field4352, 0, var2 - var6);
                }
            } catch (IOException var14) {
                IOException var7 = var14;
                synchronized (this) {
                    this.field4353 = var7;
                    return;
                }
            }
            synchronized (this) {
                this.field4349 = (this.field4349 + var2) % this.field4355;
            }
        } while (!this.method6246());
    }

    @ObfuscatedName("nc.v([BIII)V")
    public void method6241(byte[] arg0, int arg1, int arg2) throws IOException {
        if (arg2 < 0 || arg1 < 0 || arg1 + arg2 > arg0.length) {
            throw new IOException();
        }
        synchronized (this) {
            if (this.field4353 != null) {
                throw new IOException(this.field4353.toString());
            }
            int var5;
            if (this.field4349 <= this.field4354) {
                var5 = this.field4349 + (this.field4355 - this.field4354) - 1;
            } else {
                var5 = this.field4349 - this.field4354 - 1;
            }
            if (var5 < arg2) {
                throw new IOException("");
            }
            if (this.field4354 + arg2 <= this.field4355) {
                System.arraycopy(arg0, arg1, this.field4352, this.field4354, arg2);
            } else {
                int var6 = this.field4355 - this.field4354;
                System.arraycopy(arg0, arg1, this.field4352, this.field4354, var6);
                System.arraycopy(arg0, arg1 + var6, this.field4352, 0, arg2 - var6);
            }
            this.field4354 = (this.field4354 + arg2) % this.field4355;
            this.notifyAll();
        }
    }

    @ObfuscatedName("nc.q(S)V")
    public void method6243() {
        synchronized (this) {
            this.field4356 = true;
            this.notifyAll();
        }
        try {
            this.field4351.join();
        } catch (InterruptedException var4) {
        }
    }
}
