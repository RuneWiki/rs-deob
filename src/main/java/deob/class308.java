package deob;

import java.io.IOException;
import java.io.OutputStream;

@ObfuscatedName("kp")
public class class308 implements Runnable {

    @ObfuscatedName("kp.q")
    public Thread field3796;

    @ObfuscatedName("kp.w")
    public OutputStream field3795;

    @ObfuscatedName("kp.e")
    public int field3799;

    @ObfuscatedName("kp.p")
    public byte[] field3801;

    @ObfuscatedName("kp.k")
    public int field3798 = 0;

    @ObfuscatedName("kp.l")
    public int field3794 = 0;

    @ObfuscatedName("kp.b")
    public IOException field3800;

    @ObfuscatedName("kp.i")
    public boolean field3797;

    public class308(OutputStream arg0, int arg1) {
        this.field3795 = arg0;
        this.field3799 = arg1 + 1;
        this.field3801 = new byte[this.field3799];
        this.field3796 = new Thread(this);
        this.field3796.setDaemon(true);
        this.field3796.start();
    }

    @ObfuscatedName("kp.q(B)Z")
    public boolean method5389() {
        if (!this.field3797) {
            return false;
        }
        try {
            this.field3795.close();
            if (this.field3800 == null) {
                this.field3800 = new IOException("");
            }
        } catch (IOException var2) {
            if (this.field3800 == null) {
                this.field3800 = new IOException(var2);
            }
        }
        return true;
    }

    public void run() {
        do {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field3800 != null) {
                        return;
                    }
                    if (this.field3798 <= this.field3794) {
                        var2 = this.field3794 - this.field3798;
                    } else {
                        var2 = this.field3794 + (this.field3799 - this.field3798);
                    }
                    if (var2 > 0) {
                        break;
                    }
                    try {
                        this.field3795.flush();
                    } catch (IOException var15) {
                        this.field3800 = var15;
                        return;
                    }
                    if (this.method5389()) {
                        return;
                    }
                    try {
                        this.wait();
                    } catch (InterruptedException var16) {
                    }
                }
            }
            try {
                if (this.field3798 + var2 <= this.field3799) {
                    this.field3795.write(this.field3801, this.field3798, var2);
                } else {
                    int var6 = this.field3799 - this.field3798;
                    this.field3795.write(this.field3801, this.field3798, var6);
                    this.field3795.write(this.field3801, 0, var2 - var6);
                }
            } catch (IOException var14) {
                IOException var7 = var14;
                synchronized (this) {
                    this.field3800 = var7;
                    return;
                }
            }
            synchronized (this) {
                this.field3798 = (this.field3798 + var2) % this.field3799;
            }
        } while (!this.method5389());
    }

    @ObfuscatedName("kp.w([BIIB)V")
    public void method5386(byte[] arg0, int arg1, int arg2) throws IOException {
        if (arg2 < 0 || arg1 < 0 || arg1 + arg2 > arg0.length) {
            throw new IOException();
        }
        synchronized (this) {
            if (this.field3800 != null) {
                throw new IOException(this.field3800.toString());
            }
            int var5;
            if (this.field3798 <= this.field3794) {
                var5 = this.field3798 + (this.field3799 - this.field3794) - 1;
            } else {
                var5 = this.field3798 - this.field3794 - 1;
            }
            if (var5 < arg2) {
                throw new IOException("");
            }
            if (this.field3794 + arg2 <= this.field3799) {
                System.arraycopy(arg0, arg1, this.field3801, this.field3794, arg2);
            } else {
                int var6 = this.field3799 - this.field3794;
                System.arraycopy(arg0, arg1, this.field3801, this.field3794, var6);
                System.arraycopy(arg0, arg1 + var6, this.field3801, 0, arg2 - var6);
            }
            this.field3794 = (this.field3794 + arg2) % this.field3799;
            this.notifyAll();
        }
    }

    @ObfuscatedName("kp.e(I)V")
    public void method5382() {
        synchronized (this) {
            this.field3797 = true;
            this.notifyAll();
        }
        try {
            this.field3796.join();
        } catch (InterruptedException var4) {
        }
    }
}
