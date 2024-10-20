package deob;

import java.io.IOException;
import java.io.OutputStream;

@ObfuscatedName("nx")
public class class381 implements Runnable {

    @ObfuscatedName("nx.s")
    public Thread field4354;

    @ObfuscatedName("nx.h")
    public OutputStream field4348;

    @ObfuscatedName("nx.w")
    public int field4349;

    @ObfuscatedName("nx.v")
    public byte[] field4350;

    @ObfuscatedName("nx.c")
    public int field4351 = 0;

    @ObfuscatedName("nx.q")
    public int field4352 = 0;

    @ObfuscatedName("nx.i")
    public IOException field4357;

    @ObfuscatedName("nx.k")
    public boolean field4355;

    public class381(OutputStream arg0, int arg1) {
        this.field4348 = arg0;
        this.field4349 = arg1 + 1;
        this.field4350 = new byte[this.field4349];
        this.field4354 = new Thread(this);
        this.field4354.setDaemon(true);
        this.field4354.start();
    }

    @ObfuscatedName("nx.s(B)Z")
    public boolean method6149() {
        if (!this.field4355) {
            return false;
        }
        try {
            this.field4348.close();
            if (this.field4357 == null) {
                this.field4357 = new IOException("");
            }
        } catch (IOException var2) {
            if (this.field4357 == null) {
                this.field4357 = new IOException(var2);
            }
        }
        return true;
    }

    public void run() {
        do {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field4357 != null) {
                        return;
                    }
                    if (this.field4351 <= this.field4352) {
                        var2 = this.field4352 - this.field4351;
                    } else {
                        var2 = this.field4352 + (this.field4349 - this.field4351);
                    }
                    if (var2 > 0) {
                        break;
                    }
                    try {
                        this.field4348.flush();
                    } catch (IOException var15) {
                        this.field4357 = var15;
                        return;
                    }
                    if (this.method6149()) {
                        return;
                    }
                    try {
                        this.wait();
                    } catch (InterruptedException var16) {
                    }
                }
            }
            try {
                if (this.field4351 + var2 <= this.field4349) {
                    this.field4348.write(this.field4350, this.field4351, var2);
                } else {
                    int var6 = this.field4349 - this.field4351;
                    this.field4348.write(this.field4350, this.field4351, var6);
                    this.field4348.write(this.field4350, 0, var2 - var6);
                }
            } catch (IOException var14) {
                IOException var7 = var14;
                synchronized (this) {
                    this.field4357 = var7;
                    return;
                }
            }
            synchronized (this) {
                this.field4351 = (this.field4351 + var2) % this.field4349;
            }
        } while (!this.method6149());
    }

    @ObfuscatedName("nx.h([BIII)V")
    public void method6151(byte[] arg0, int arg1, int arg2) throws IOException {
        if (arg2 < 0 || arg1 < 0 || arg1 + arg2 > arg0.length) {
            throw new IOException();
        }
        synchronized (this) {
            if (this.field4357 != null) {
                throw new IOException(this.field4357.toString());
            }
            int var5;
            if (this.field4351 <= this.field4352) {
                var5 = this.field4351 + (this.field4349 - this.field4352) - 1;
            } else {
                var5 = this.field4351 - this.field4352 - 1;
            }
            if (var5 < arg2) {
                throw new IOException("");
            }
            if (this.field4352 + arg2 <= this.field4349) {
                System.arraycopy(arg0, arg1, this.field4350, this.field4352, arg2);
            } else {
                int var6 = this.field4349 - this.field4352;
                System.arraycopy(arg0, arg1, this.field4350, this.field4352, var6);
                System.arraycopy(arg0, arg1 + var6, this.field4350, 0, arg2 - var6);
            }
            this.field4352 = (this.field4352 + arg2) % this.field4349;
            this.notifyAll();
        }
    }

    @ObfuscatedName("nx.w(B)V")
    public void method6152() {
        synchronized (this) {
            this.field4355 = true;
            this.notifyAll();
        }
        try {
            this.field4354.join();
        } catch (InterruptedException var4) {
        }
    }
}
