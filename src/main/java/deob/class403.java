package deob;

import java.io.IOException;
import java.io.OutputStream;

@ObfuscatedName("ox")
public class class403 implements Runnable {

    @ObfuscatedName("ox.h")
    public Thread field4565;

    @ObfuscatedName("ox.e")
    public OutputStream field4566;

    @ObfuscatedName("ox.v")
    public int field4569;

    @ObfuscatedName("ox.x")
    public byte[] field4568;

    @ObfuscatedName("ox.m")
    public int field4570 = 0;

    @ObfuscatedName("ox.q")
    public int field4567 = 0;

    @ObfuscatedName("ox.f")
    public IOException field4571;

    @ObfuscatedName("ox.r")
    public boolean field4572;

    public class403(OutputStream arg0, int arg1) {
        this.field4566 = arg0;
        this.field4569 = arg1 + 1;
        this.field4568 = new byte[this.field4569];
        this.field4565 = new Thread(this);
        this.field4565.setDaemon(true);
        this.field4565.start();
    }

    @ObfuscatedName("ox.h(I)Z")
    public boolean method6983() {
        if (!this.field4572) {
            return false;
        }
        try {
            this.field4566.close();
            if (this.field4571 == null) {
                this.field4571 = new IOException("");
            }
        } catch (IOException var2) {
            if (this.field4571 == null) {
                this.field4571 = new IOException(var2);
            }
        }
        return true;
    }

    public void run() {
        do {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field4571 != null) {
                        return;
                    }
                    if (this.field4570 <= this.field4567) {
                        var2 = this.field4567 - this.field4570;
                    } else {
                        var2 = this.field4567 + (this.field4569 - this.field4570);
                    }
                    if (var2 > 0) {
                        break;
                    }
                    try {
                        this.field4566.flush();
                    } catch (IOException var15) {
                        this.field4571 = var15;
                        return;
                    }
                    if (this.method6983()) {
                        return;
                    }
                    try {
                        this.wait();
                    } catch (InterruptedException var16) {
                    }
                }
            }
            try {
                if (this.field4570 + var2 <= this.field4569) {
                    this.field4566.write(this.field4568, this.field4570, var2);
                } else {
                    int var6 = this.field4569 - this.field4570;
                    this.field4566.write(this.field4568, this.field4570, var6);
                    this.field4566.write(this.field4568, 0, var2 - var6);
                }
            } catch (IOException var14) {
                IOException var7 = var14;
                synchronized (this) {
                    this.field4571 = var7;
                    return;
                }
            }
            synchronized (this) {
                this.field4570 = (this.field4570 + var2) % this.field4569;
            }
        } while (!this.method6983());
    }

    @ObfuscatedName("ox.e([BIII)V")
    public void method6994(byte[] arg0, int arg1, int arg2) throws IOException {
        if (arg2 < 0 || arg1 < 0 || arg1 + arg2 > arg0.length) {
            throw new IOException();
        }
        synchronized (this) {
            if (this.field4571 != null) {
                throw new IOException(this.field4571.toString());
            }
            int var5;
            if (this.field4570 <= this.field4567) {
                var5 = this.field4570 + (this.field4569 - this.field4567) - 1;
            } else {
                var5 = this.field4570 - this.field4567 - 1;
            }
            if (var5 < arg2) {
                throw new IOException("");
            }
            if (this.field4567 + arg2 <= this.field4569) {
                System.arraycopy(arg0, arg1, this.field4568, this.field4567, arg2);
            } else {
                int var6 = this.field4569 - this.field4567;
                System.arraycopy(arg0, arg1, this.field4568, this.field4567, var6);
                System.arraycopy(arg0, arg1 + var6, this.field4568, 0, arg2 - var6);
            }
            this.field4567 = (this.field4567 + arg2) % this.field4569;
            this.notifyAll();
        }
    }

    @ObfuscatedName("ox.v(B)V")
    public void method6985() {
        synchronized (this) {
            this.field4572 = true;
            this.notifyAll();
        }
        try {
            this.field4565.join();
        } catch (InterruptedException var4) {
        }
    }
}
