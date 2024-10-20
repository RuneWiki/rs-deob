package deob;

import java.io.IOException;
import java.io.OutputStream;

@ObfuscatedName("rh")
public class class443 implements Runnable {

    @ObfuscatedName("rh.aw")
    public Thread field4695;

    @ObfuscatedName("rh.ay")
    public OutputStream field4692;

    @ObfuscatedName("rh.ar")
    public int field4693;

    @ObfuscatedName("rh.am")
    public byte[] field4694;

    @ObfuscatedName("rh.as")
    public int field4691 = 0;

    @ObfuscatedName("rh.aj")
    public int field4696 = 0;

    @ObfuscatedName("rh.ag")
    public IOException field4697;

    @ObfuscatedName("rh.az")
    public boolean field4698;

    public class443(OutputStream arg0, int arg1) {
        this.field4692 = arg0;
        this.field4693 = arg1 + 1;
        this.field4694 = new byte[this.field4693];
        this.field4695 = new Thread(this);
        this.field4695.setDaemon(true);
        this.field4695.start();
    }

    @ObfuscatedName("rh.aw(I)Z")
    public boolean method7403() {
        if (!this.field4698) {
            return false;
        }
        try {
            this.field4692.close();
            if (this.field4697 == null) {
                this.field4697 = new IOException("");
            }
        } catch (IOException var2) {
            if (this.field4697 == null) {
                this.field4697 = new IOException(var2);
            }
        }
        return true;
    }

    public void run() {
        do {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field4697 != null) {
                        return;
                    }
                    if (this.field4691 <= this.field4696) {
                        var2 = this.field4696 - this.field4691;
                    } else {
                        var2 = this.field4696 + (this.field4693 - this.field4691);
                    }
                    if (var2 > 0) {
                        break;
                    }
                    try {
                        this.field4692.flush();
                    } catch (IOException var15) {
                        this.field4697 = var15;
                        return;
                    }
                    if (this.method7403()) {
                        return;
                    }
                    try {
                        this.wait();
                    } catch (InterruptedException var16) {
                    }
                }
            }
            try {
                if (this.field4691 + var2 <= this.field4693) {
                    this.field4692.write(this.field4694, this.field4691, var2);
                } else {
                    int var6 = this.field4693 - this.field4691;
                    this.field4692.write(this.field4694, this.field4691, var6);
                    this.field4692.write(this.field4694, 0, var2 - var6);
                }
            } catch (IOException var14) {
                IOException var7 = var14;
                synchronized (this) {
                    this.field4697 = var7;
                    return;
                }
            }
            synchronized (this) {
                this.field4691 = (this.field4691 + var2) % this.field4693;
            }
        } while (!this.method7403());
    }

    @ObfuscatedName("rh.ay([BIII)V")
    public void method7395(byte[] arg0, int arg1, int arg2) throws IOException {
        if (arg2 < 0 || arg1 < 0 || arg1 + arg2 > arg0.length) {
            throw new IOException();
        }
        synchronized (this) {
            if (this.field4697 != null) {
                throw new IOException(this.field4697.toString());
            }
            int var5;
            if (this.field4691 <= this.field4696) {
                var5 = this.field4691 + (this.field4693 - this.field4696) - 1;
            } else {
                var5 = this.field4691 - this.field4696 - 1;
            }
            if (var5 < arg2) {
                throw new IOException("");
            }
            if (this.field4696 + arg2 <= this.field4693) {
                System.arraycopy(arg0, arg1, this.field4694, this.field4696, arg2);
            } else {
                int var6 = this.field4693 - this.field4696;
                System.arraycopy(arg0, arg1, this.field4694, this.field4696, var6);
                System.arraycopy(arg0, arg1 + var6, this.field4694, 0, arg2 - var6);
            }
            this.field4696 = (this.field4696 + arg2) % this.field4693;
            this.notifyAll();
        }
    }

    @ObfuscatedName("rh.ar(I)V")
    public void method7396() {
        synchronized (this) {
            this.field4698 = true;
            this.notifyAll();
        }
        try {
            this.field4695.join();
        } catch (InterruptedException var4) {
        }
    }
}
