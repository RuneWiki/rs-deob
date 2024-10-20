package deob;

import java.io.IOException;
import java.io.OutputStream;

@ObfuscatedName("no")
public class class381 implements Runnable {

    @ObfuscatedName("no.o")
    public Thread field4362;

    @ObfuscatedName("no.q")
    public OutputStream field4356;

    @ObfuscatedName("no.l")
    public int field4357;

    @ObfuscatedName("no.k")
    public byte[] field4358;

    @ObfuscatedName("no.a")
    public int field4360 = 0;

    @ObfuscatedName("no.m")
    public int field4355 = 0;

    @ObfuscatedName("no.p")
    public IOException field4361;

    @ObfuscatedName("no.s")
    public boolean field4359;

    public class381(OutputStream arg0, int arg1) {
        this.field4356 = arg0;
        this.field4357 = arg1 + 1;
        this.field4358 = new byte[this.field4357];
        this.field4362 = new Thread(this);
        this.field4362.setDaemon(true);
        this.field4362.start();
    }

    @ObfuscatedName("no.o(I)Z")
    public boolean method6140() {
        if (!this.field4359) {
            return false;
        }
        try {
            this.field4356.close();
            if (this.field4361 == null) {
                this.field4361 = new IOException("");
            }
        } catch (IOException var2) {
            if (this.field4361 == null) {
                this.field4361 = new IOException(var2);
            }
        }
        return true;
    }

    public void run() {
        do {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field4361 != null) {
                        return;
                    }
                    if (this.field4360 <= this.field4355) {
                        var2 = this.field4355 - this.field4360;
                    } else {
                        var2 = this.field4355 + (this.field4357 - this.field4360);
                    }
                    if (var2 > 0) {
                        break;
                    }
                    try {
                        this.field4356.flush();
                    } catch (IOException var15) {
                        this.field4361 = var15;
                        return;
                    }
                    if (this.method6140()) {
                        return;
                    }
                    try {
                        this.wait();
                    } catch (InterruptedException var16) {
                    }
                }
            }
            try {
                if (this.field4360 + var2 <= this.field4357) {
                    this.field4356.write(this.field4358, this.field4360, var2);
                } else {
                    int var6 = this.field4357 - this.field4360;
                    this.field4356.write(this.field4358, this.field4360, var6);
                    this.field4356.write(this.field4358, 0, var2 - var6);
                }
            } catch (IOException var14) {
                IOException var7 = var14;
                synchronized (this) {
                    this.field4361 = var7;
                    return;
                }
            }
            synchronized (this) {
                this.field4360 = (this.field4360 + var2) % this.field4357;
            }
        } while (!this.method6140());
    }

    @ObfuscatedName("no.q([BIII)V")
    public void method6141(byte[] arg0, int arg1, int arg2) throws IOException {
        if (arg2 < 0 || arg1 < 0 || arg1 + arg2 > arg0.length) {
            throw new IOException();
        }
        synchronized (this) {
            if (this.field4361 != null) {
                throw new IOException(this.field4361.toString());
            }
            int var5;
            if (this.field4360 <= this.field4355) {
                var5 = this.field4360 + (this.field4357 - this.field4355) - 1;
            } else {
                var5 = this.field4360 - this.field4355 - 1;
            }
            if (var5 < arg2) {
                throw new IOException("");
            }
            if (this.field4355 + arg2 <= this.field4357) {
                System.arraycopy(arg0, arg1, this.field4358, this.field4355, arg2);
            } else {
                int var6 = this.field4357 - this.field4355;
                System.arraycopy(arg0, arg1, this.field4358, this.field4355, var6);
                System.arraycopy(arg0, arg1 + var6, this.field4358, 0, arg2 - var6);
            }
            this.field4355 = (this.field4355 + arg2) % this.field4357;
            this.notifyAll();
        }
    }

    @ObfuscatedName("no.l(I)V")
    public void method6133() {
        synchronized (this) {
            this.field4359 = true;
            this.notifyAll();
        }
        try {
            this.field4362.join();
        } catch (InterruptedException var4) {
        }
    }
}
