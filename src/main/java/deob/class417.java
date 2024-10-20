package deob;

import java.io.IOException;
import java.io.OutputStream;

@ObfuscatedName("qe")
public class class417 implements Runnable {

    @ObfuscatedName("qe.af")
    public Thread field4625;

    @ObfuscatedName("qe.an")
    public OutputStream field4619;

    @ObfuscatedName("qe.aw")
    public int field4621;

    @ObfuscatedName("qe.ac")
    public byte[] field4622;

    @ObfuscatedName("qe.au")
    public int field4627 = 0;

    @ObfuscatedName("qe.ab")
    public int field4624 = 0;

    @ObfuscatedName("qe.aq")
    public IOException field4620;

    @ObfuscatedName("qe.al")
    public boolean field4626;

    public class417(OutputStream arg0, int arg1) {
        this.field4619 = arg0;
        this.field4621 = arg1 + 1;
        this.field4622 = new byte[this.field4621];
        this.field4625 = new Thread(this);
        this.field4625.setDaemon(true);
        this.field4625.start();
    }

    @ObfuscatedName("qe.af(B)Z")
    public boolean method7336() {
        if (!this.field4626) {
            return false;
        }
        try {
            this.field4619.close();
            if (this.field4620 == null) {
                this.field4620 = new IOException("");
            }
        } catch (IOException var2) {
            if (this.field4620 == null) {
                this.field4620 = new IOException(var2);
            }
        }
        return true;
    }

    public void run() {
        do {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field4620 != null) {
                        return;
                    }
                    if (this.field4627 <= this.field4624) {
                        var2 = this.field4624 - this.field4627;
                    } else {
                        var2 = this.field4624 + (this.field4621 - this.field4627);
                    }
                    if (var2 > 0) {
                        break;
                    }
                    try {
                        this.field4619.flush();
                    } catch (IOException var15) {
                        this.field4620 = var15;
                        return;
                    }
                    if (this.method7336()) {
                        return;
                    }
                    try {
                        this.wait();
                    } catch (InterruptedException var16) {
                    }
                }
            }
            try {
                if (this.field4627 + var2 <= this.field4621) {
                    this.field4619.write(this.field4622, this.field4627, var2);
                } else {
                    int var6 = this.field4621 - this.field4627;
                    this.field4619.write(this.field4622, this.field4627, var6);
                    this.field4619.write(this.field4622, 0, var2 - var6);
                }
            } catch (IOException var14) {
                IOException var7 = var14;
                synchronized (this) {
                    this.field4620 = var7;
                    return;
                }
            }
            synchronized (this) {
                this.field4627 = (this.field4627 + var2) % this.field4621;
            }
        } while (!this.method7336());
    }

    @ObfuscatedName("qe.an([BIIB)V")
    public void method7345(byte[] arg0, int arg1, int arg2) throws IOException {
        if (arg2 < 0 || arg1 < 0 || arg1 + arg2 > arg0.length) {
            throw new IOException();
        }
        synchronized (this) {
            if (this.field4620 != null) {
                throw new IOException(this.field4620.toString());
            }
            int var5;
            if (this.field4627 <= this.field4624) {
                var5 = this.field4627 + (this.field4621 - this.field4624) - 1;
            } else {
                var5 = this.field4627 - this.field4624 - 1;
            }
            if (var5 < arg2) {
                throw new IOException("");
            }
            if (this.field4624 + arg2 <= this.field4621) {
                System.arraycopy(arg0, arg1, this.field4622, this.field4624, arg2);
            } else {
                int var6 = this.field4621 - this.field4624;
                System.arraycopy(arg0, arg1, this.field4622, this.field4624, var6);
                System.arraycopy(arg0, arg1 + var6, this.field4622, 0, arg2 - var6);
            }
            this.field4624 = (this.field4624 + arg2) % this.field4621;
            this.notifyAll();
        }
    }

    @ObfuscatedName("qe.aw(I)V")
    public void method7337() {
        synchronized (this) {
            this.field4626 = true;
            this.notifyAll();
        }
        try {
            this.field4625.join();
        } catch (InterruptedException var4) {
        }
    }
}
