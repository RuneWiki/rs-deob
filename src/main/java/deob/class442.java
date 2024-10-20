package deob;

import java.io.IOException;
import java.io.OutputStream;

@ObfuscatedName("qh")
public class class442 implements Runnable {

    @ObfuscatedName("qh.au")
    public Thread field4696;

    @ObfuscatedName("qh.ae")
    public OutputStream field4690;

    @ObfuscatedName("qh.ao")
    public int field4689;

    @ObfuscatedName("qh.at")
    public byte[] field4692;

    @ObfuscatedName("qh.ac")
    public int field4693 = 0;

    @ObfuscatedName("qh.ai")
    public int field4694 = 0;

    @ObfuscatedName("qh.az")
    public IOException field4695;

    @ObfuscatedName("qh.ap")
    public boolean field4691;

    public class442(OutputStream arg0, int arg1) {
        this.field4690 = arg0;
        this.field4689 = arg1 + 1;
        this.field4692 = new byte[this.field4689];
        this.field4696 = new Thread(this);
        this.field4696.setDaemon(true);
        this.field4696.start();
    }

    @ObfuscatedName("qh.au(S)Z")
    public boolean method7422() {
        if (!this.field4691) {
            return false;
        }
        try {
            this.field4690.close();
            if (this.field4695 == null) {
                this.field4695 = new IOException("");
            }
        } catch (IOException var2) {
            if (this.field4695 == null) {
                this.field4695 = new IOException(var2);
            }
        }
        return true;
    }

    public void run() {
        do {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field4695 != null) {
                        return;
                    }
                    if (this.field4693 <= this.field4694) {
                        var2 = this.field4694 - this.field4693;
                    } else {
                        var2 = this.field4694 + (this.field4689 - this.field4693);
                    }
                    if (var2 > 0) {
                        break;
                    }
                    try {
                        this.field4690.flush();
                    } catch (IOException var15) {
                        this.field4695 = var15;
                        return;
                    }
                    if (this.method7422()) {
                        return;
                    }
                    try {
                        this.wait();
                    } catch (InterruptedException var16) {
                    }
                }
            }
            try {
                if (this.field4693 + var2 <= this.field4689) {
                    this.field4690.write(this.field4692, this.field4693, var2);
                } else {
                    int var6 = this.field4689 - this.field4693;
                    this.field4690.write(this.field4692, this.field4693, var6);
                    this.field4690.write(this.field4692, 0, var2 - var6);
                }
            } catch (IOException var14) {
                IOException var7 = var14;
                synchronized (this) {
                    this.field4695 = var7;
                    return;
                }
            }
            synchronized (this) {
                this.field4693 = (this.field4693 + var2) % this.field4689;
            }
        } while (!this.method7422());
    }

    @ObfuscatedName("qh.ae([BIIB)V")
    public void method7421(byte[] arg0, int arg1, int arg2) throws IOException {
        if (arg2 < 0 || arg1 < 0 || arg1 + arg2 > arg0.length) {
            throw new IOException();
        }
        synchronized (this) {
            if (this.field4695 != null) {
                throw new IOException(this.field4695.toString());
            }
            int var5;
            if (this.field4693 <= this.field4694) {
                var5 = this.field4693 + (this.field4689 - this.field4694) - 1;
            } else {
                var5 = this.field4693 - this.field4694 - 1;
            }
            if (var5 < arg2) {
                throw new IOException("");
            }
            if (this.field4694 + arg2 <= this.field4689) {
                System.arraycopy(arg0, arg1, this.field4692, this.field4694, arg2);
            } else {
                int var6 = this.field4689 - this.field4694;
                System.arraycopy(arg0, arg1, this.field4692, this.field4694, var6);
                System.arraycopy(arg0, arg1 + var6, this.field4692, 0, arg2 - var6);
            }
            this.field4694 = (this.field4694 + arg2) % this.field4689;
            this.notifyAll();
        }
    }

    @ObfuscatedName("qh.ao(I)V")
    public void method7420() {
        synchronized (this) {
            this.field4691 = true;
            this.notifyAll();
        }
        try {
            this.field4696.join();
        } catch (InterruptedException var4) {
        }
    }
}
