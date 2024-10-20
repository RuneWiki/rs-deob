package deob;

import java.io.IOException;
import java.io.OutputStream;

@ObfuscatedName("rs")
public class class454 implements Runnable {

    @ObfuscatedName("rs.at")
    public Thread field4724;

    @ObfuscatedName("rs.ah")
    public OutputStream field4722;

    @ObfuscatedName("rs.ar")
    public int field4723;

    @ObfuscatedName("rs.ao")
    public byte[] field4727;

    @ObfuscatedName("rs.ab")
    public int field4725 = 0;

    @ObfuscatedName("rs.au")
    public int field4721 = 0;

    @ObfuscatedName("rs.aa")
    public IOException field4726;

    @ObfuscatedName("rs.ac")
    public boolean field4728;

    public class454(OutputStream arg0, int arg1) {
        this.field4722 = arg0;
        this.field4723 = arg1 + 1;
        this.field4727 = new byte[this.field4723];
        this.field4724 = new Thread(this);
        this.field4724.setDaemon(true);
        this.field4724.start();
    }

    @ObfuscatedName("rs.at(I)Z")
    public boolean method7569() {
        if (!this.field4728) {
            return false;
        }
        try {
            this.field4722.close();
            if (this.field4726 == null) {
                this.field4726 = new IOException("");
            }
        } catch (IOException var2) {
            if (this.field4726 == null) {
                this.field4726 = new IOException(var2);
            }
        }
        return true;
    }

    public void run() {
        do {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field4726 != null) {
                        return;
                    }
                    if (this.field4725 <= this.field4721) {
                        var2 = this.field4721 - this.field4725;
                    } else {
                        var2 = this.field4721 + (this.field4723 - this.field4725);
                    }
                    if (var2 > 0) {
                        break;
                    }
                    try {
                        this.field4722.flush();
                    } catch (IOException var15) {
                        this.field4726 = var15;
                        return;
                    }
                    if (this.method7569()) {
                        return;
                    }
                    try {
                        this.wait();
                    } catch (InterruptedException var16) {
                    }
                }
            }
            try {
                if (this.field4725 + var2 <= this.field4723) {
                    this.field4722.write(this.field4727, this.field4725, var2);
                } else {
                    int var6 = this.field4723 - this.field4725;
                    this.field4722.write(this.field4727, this.field4725, var6);
                    this.field4722.write(this.field4727, 0, var2 - var6);
                }
            } catch (IOException var14) {
                IOException var7 = var14;
                synchronized (this) {
                    this.field4726 = var7;
                    return;
                }
            }
            synchronized (this) {
                this.field4725 = (this.field4725 + var2) % this.field4723;
            }
        } while (!this.method7569());
    }

    @ObfuscatedName("rs.ah([BIIB)V")
    public void method7571(byte[] arg0, int arg1, int arg2) throws IOException {
        if (arg2 < 0 || arg1 < 0 || arg1 + arg2 > arg0.length) {
            throw new IOException();
        }
        synchronized (this) {
            if (this.field4726 != null) {
                throw new IOException(this.field4726.toString());
            }
            int var5;
            if (this.field4725 <= this.field4721) {
                var5 = this.field4725 + (this.field4723 - this.field4721) - 1;
            } else {
                var5 = this.field4725 - this.field4721 - 1;
            }
            if (var5 < arg2) {
                throw new IOException("");
            }
            if (this.field4721 + arg2 <= this.field4723) {
                System.arraycopy(arg0, arg1, this.field4727, this.field4721, arg2);
            } else {
                int var6 = this.field4723 - this.field4721;
                System.arraycopy(arg0, arg1, this.field4727, this.field4721, var6);
                System.arraycopy(arg0, arg1 + var6, this.field4727, 0, arg2 - var6);
            }
            this.field4721 = (this.field4721 + arg2) % this.field4723;
            this.notifyAll();
        }
    }

    @ObfuscatedName("rs.ar(I)V")
    public void method7581() {
        synchronized (this) {
            this.field4728 = true;
            this.notifyAll();
        }
        try {
            this.field4724.join();
        } catch (InterruptedException var4) {
        }
    }
}
