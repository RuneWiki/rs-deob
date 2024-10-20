package deob;

import java.io.IOException;
import java.io.OutputStream;

@ObfuscatedName("le")
public class class333 implements Runnable {

    @ObfuscatedName("le.s")
    public Thread field3889;

    @ObfuscatedName("le.t")
    public OutputStream field3891;

    @ObfuscatedName("le.v")
    public int field3895;

    @ObfuscatedName("le.j")
    public byte[] field3896;

    @ObfuscatedName("le.l")
    public int field3887 = 0;

    @ObfuscatedName("le.n")
    public int field3892 = 0;

    @ObfuscatedName("le.w")
    public IOException field3893;

    @ObfuscatedName("le.f")
    public boolean field3894;

    public class333(OutputStream arg0, int arg1) {
        this.field3891 = arg0;
        this.field3895 = arg1 + 1;
        this.field3896 = new byte[this.field3895];
        this.field3889 = new Thread(this);
        this.field3889.setDaemon(true);
        this.field3889.start();
    }

    @ObfuscatedName("le.s(I)Z")
    public boolean method5343() {
        if (!this.field3894) {
            return false;
        }
        try {
            this.field3891.close();
            if (this.field3893 == null) {
                this.field3893 = new IOException("");
            }
        } catch (IOException var2) {
            if (this.field3893 == null) {
                this.field3893 = new IOException(var2);
            }
        }
        return true;
    }

    public void run() {
        do {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field3893 != null) {
                        return;
                    }
                    if (this.field3887 <= this.field3892) {
                        var2 = this.field3892 - this.field3887;
                    } else {
                        var2 = this.field3892 + (this.field3895 - this.field3887);
                    }
                    if (var2 > 0) {
                        break;
                    }
                    try {
                        this.field3891.flush();
                    } catch (IOException var15) {
                        this.field3893 = var15;
                        return;
                    }
                    if (this.method5343()) {
                        return;
                    }
                    try {
                        this.wait();
                    } catch (InterruptedException var16) {
                    }
                }
            }
            try {
                if (this.field3887 + var2 <= this.field3895) {
                    this.field3891.write(this.field3896, this.field3887, var2);
                } else {
                    int var6 = this.field3895 - this.field3887;
                    this.field3891.write(this.field3896, this.field3887, var6);
                    this.field3891.write(this.field3896, 0, var2 - var6);
                }
            } catch (IOException var14) {
                IOException var7 = var14;
                synchronized (this) {
                    this.field3893 = var7;
                    return;
                }
            }
            synchronized (this) {
                this.field3887 = (this.field3887 + var2) % this.field3895;
            }
        } while (!this.method5343());
    }

    @ObfuscatedName("le.t([BIIB)V")
    public void method5351(byte[] arg0, int arg1, int arg2) throws IOException {
        if (arg2 < 0 || arg1 < 0 || arg1 + arg2 > arg0.length) {
            throw new IOException();
        }
        synchronized (this) {
            if (this.field3893 != null) {
                throw new IOException(this.field3893.toString());
            }
            int var5;
            if (this.field3887 <= this.field3892) {
                var5 = this.field3887 + (this.field3895 - this.field3892) - 1;
            } else {
                var5 = this.field3887 - this.field3892 - 1;
            }
            if (var5 < arg2) {
                throw new IOException("");
            }
            if (this.field3892 + arg2 <= this.field3895) {
                System.arraycopy(arg0, arg1, this.field3896, this.field3892, arg2);
            } else {
                int var6 = this.field3895 - this.field3892;
                System.arraycopy(arg0, arg1, this.field3896, this.field3892, var6);
                System.arraycopy(arg0, arg1 + var6, this.field3896, 0, arg2 - var6);
            }
            this.field3892 = (this.field3892 + arg2) % this.field3895;
            this.notifyAll();
        }
    }

    @ObfuscatedName("le.v(I)V")
    public void method5338() {
        synchronized (this) {
            this.field3894 = true;
            this.notifyAll();
        }
        try {
            this.field3889.join();
        } catch (InterruptedException var4) {
        }
    }
}
