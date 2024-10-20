package deob;

import java.io.IOException;
import java.io.OutputStream;

@ObfuscatedName("mb")
public class class359 implements Runnable {

    @ObfuscatedName("mb.c")
    public Thread field4149;

    @ObfuscatedName("mb.b")
    public OutputStream field4145;

    @ObfuscatedName("mb.p")
    public int field4150;

    @ObfuscatedName("mb.m")
    public byte[] field4147;

    @ObfuscatedName("mb.t")
    public int field4146 = 0;

    @ObfuscatedName("mb.s")
    public int field4148 = 0;

    @ObfuscatedName("mb.j")
    public IOException field4144;

    @ObfuscatedName("mb.w")
    public boolean field4151;

    public class359(OutputStream arg0, int arg1) {
        this.field4145 = arg0;
        this.field4150 = arg1 + 1;
        this.field4147 = new byte[this.field4150];
        this.field4149 = new Thread(this);
        this.field4149.setDaemon(true);
        this.field4149.start();
    }

    @ObfuscatedName("mb.c(I)Z")
    public boolean method5896() {
        if (!this.field4151) {
            return false;
        }
        try {
            this.field4145.close();
            if (this.field4144 == null) {
                this.field4144 = new IOException("");
            }
        } catch (IOException var2) {
            if (this.field4144 == null) {
                this.field4144 = new IOException(var2);
            }
        }
        return true;
    }

    public void run() {
        do {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field4144 != null) {
                        return;
                    }
                    if (this.field4146 <= this.field4148) {
                        var2 = this.field4148 - this.field4146;
                    } else {
                        var2 = this.field4148 + (this.field4150 - this.field4146);
                    }
                    if (var2 > 0) {
                        break;
                    }
                    try {
                        this.field4145.flush();
                    } catch (IOException var15) {
                        this.field4144 = var15;
                        return;
                    }
                    if (this.method5896()) {
                        return;
                    }
                    try {
                        this.wait();
                    } catch (InterruptedException var16) {
                    }
                }
            }
            try {
                if (this.field4146 + var2 <= this.field4150) {
                    this.field4145.write(this.field4147, this.field4146, var2);
                } else {
                    int var6 = this.field4150 - this.field4146;
                    this.field4145.write(this.field4147, this.field4146, var6);
                    this.field4145.write(this.field4147, 0, var2 - var6);
                }
            } catch (IOException var14) {
                IOException var7 = var14;
                synchronized (this) {
                    this.field4144 = var7;
                    return;
                }
            }
            synchronized (this) {
                this.field4146 = (this.field4146 + var2) % this.field4150;
            }
        } while (!this.method5896());
    }

    @ObfuscatedName("mb.b([BIII)V")
    public void method5898(byte[] arg0, int arg1, int arg2) throws IOException {
        if (arg2 < 0 || arg1 < 0 || arg1 + arg2 > arg0.length) {
            throw new IOException();
        }
        synchronized (this) {
            if (this.field4144 != null) {
                throw new IOException(this.field4144.toString());
            }
            int var5;
            if (this.field4146 <= this.field4148) {
                var5 = this.field4146 + (this.field4150 - this.field4148) - 1;
            } else {
                var5 = this.field4146 - this.field4148 - 1;
            }
            if (var5 < arg2) {
                throw new IOException("");
            }
            if (this.field4148 + arg2 <= this.field4150) {
                System.arraycopy(arg0, arg1, this.field4147, this.field4148, arg2);
            } else {
                int var6 = this.field4150 - this.field4148;
                System.arraycopy(arg0, arg1, this.field4147, this.field4148, var6);
                System.arraycopy(arg0, arg1 + var6, this.field4147, 0, arg2 - var6);
            }
            this.field4148 = (this.field4148 + arg2) % this.field4150;
            this.notifyAll();
        }
    }

    @ObfuscatedName("mb.p(I)V")
    public void method5895() {
        synchronized (this) {
            this.field4151 = true;
            this.notifyAll();
        }
        try {
            this.field4149.join();
        } catch (InterruptedException var4) {
        }
    }
}
