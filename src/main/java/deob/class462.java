package deob;

import java.io.IOException;
import java.io.OutputStream;

@ObfuscatedName("rm")
public class class462 implements Runnable {

    @ObfuscatedName("rm.az")
    public Thread field4826;

    @ObfuscatedName("rm.ah")
    public OutputStream field4833;

    @ObfuscatedName("rm.af")
    public int field4828;

    @ObfuscatedName("rm.at")
    public byte[] field4829;

    @ObfuscatedName("rm.an")
    public int field4831 = 0;

    @ObfuscatedName("rm.ao")
    public int field4827 = 0;

    @ObfuscatedName("rm.ab")
    public IOException field4832;

    @ObfuscatedName("rm.aw")
    public boolean field4830;

    public class462(OutputStream arg0, int arg1) {
        this.field4833 = arg0;
        this.field4828 = arg1 + 1;
        this.field4829 = new byte[this.field4828];
        this.field4826 = new Thread(this);
        this.field4826.setDaemon(true);
        this.field4826.start();
    }

    @ObfuscatedName("rm.az(B)Z")
    public boolean method7589() {
        if (!this.field4830) {
            return false;
        }
        try {
            this.field4833.close();
            if (this.field4832 == null) {
                this.field4832 = new IOException("");
            }
        } catch (IOException var2) {
            if (this.field4832 == null) {
                this.field4832 = new IOException(var2);
            }
        }
        return true;
    }

    public void run() {
        do {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field4832 != null) {
                        return;
                    }
                    if (this.field4831 <= this.field4827) {
                        var2 = this.field4827 - this.field4831;
                    } else {
                        var2 = this.field4827 + (this.field4828 - this.field4831);
                    }
                    if (var2 > 0) {
                        break;
                    }
                    try {
                        this.field4833.flush();
                    } catch (IOException var15) {
                        this.field4832 = var15;
                        return;
                    }
                    if (this.method7589()) {
                        return;
                    }
                    try {
                        this.wait();
                    } catch (InterruptedException var16) {
                    }
                }
            }
            try {
                if (this.field4831 + var2 <= this.field4828) {
                    this.field4833.write(this.field4829, this.field4831, var2);
                } else {
                    int var6 = this.field4828 - this.field4831;
                    this.field4833.write(this.field4829, this.field4831, var6);
                    this.field4833.write(this.field4829, 0, var2 - var6);
                }
            } catch (IOException var14) {
                IOException var7 = var14;
                synchronized (this) {
                    this.field4832 = var7;
                    return;
                }
            }
            synchronized (this) {
                this.field4831 = (this.field4831 + var2) % this.field4828;
            }
        } while (!this.method7589());
    }

    @ObfuscatedName("rm.ah([BIIB)V")
    public void method7590(byte[] arg0, int arg1, int arg2) throws IOException {
        if (arg2 < 0 || arg1 < 0 || arg1 + arg2 > arg0.length) {
            throw new IOException();
        }
        synchronized (this) {
            if (this.field4832 != null) {
                throw new IOException(this.field4832.toString());
            }
            int var5;
            if (this.field4831 <= this.field4827) {
                var5 = this.field4831 + (this.field4828 - this.field4827) - 1;
            } else {
                var5 = this.field4831 - this.field4827 - 1;
            }
            if (var5 < arg2) {
                throw new IOException("");
            }
            if (this.field4827 + arg2 <= this.field4828) {
                System.arraycopy(arg0, arg1, this.field4829, this.field4827, arg2);
            } else {
                int var6 = this.field4828 - this.field4827;
                System.arraycopy(arg0, arg1, this.field4829, this.field4827, var6);
                System.arraycopy(arg0, arg1 + var6, this.field4829, 0, arg2 - var6);
            }
            this.field4827 = (this.field4827 + arg2) % this.field4828;
            this.notifyAll();
        }
    }

    @ObfuscatedName("rm.af(I)V")
    public void method7591() {
        synchronized (this) {
            this.field4830 = true;
            this.notifyAll();
        }
        try {
            this.field4826.join();
        } catch (InterruptedException var4) {
        }
    }
}
