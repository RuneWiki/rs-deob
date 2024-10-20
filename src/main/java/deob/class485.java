package deob;

import java.io.IOException;
import java.io.OutputStream;

@ObfuscatedName("sm")
public class class485 implements Runnable {

    @ObfuscatedName("sm.ac")
    public Thread field5039;

    @ObfuscatedName("sm.ae")
    public OutputStream field5040;

    @ObfuscatedName("sm.ag")
    public int field5036;

    @ObfuscatedName("sm.am")
    public byte[] field5037;

    @ObfuscatedName("sm.ax")
    public int field5038 = 0;

    @ObfuscatedName("sm.aq")
    public int field5041 = 0;

    @ObfuscatedName("sm.af")
    public IOException field5042;

    @ObfuscatedName("sm.at")
    public boolean field5043;

    public class485(OutputStream arg0, int arg1) {
        this.field5040 = arg0;
        this.field5036 = arg1 + 1;
        this.field5037 = new byte[this.field5036];
        this.field5039 = new Thread(this);
        this.field5039.setDaemon(true);
        this.field5039.start();
    }

    @ObfuscatedName("sm.ac(B)Z")
    public boolean method8252() {
        if (!this.field5043) {
            return false;
        }
        try {
            this.field5040.close();
            if (this.field5042 == null) {
                this.field5042 = new IOException("");
            }
        } catch (IOException var2) {
            if (this.field5042 == null) {
                this.field5042 = new IOException(var2);
            }
        }
        return true;
    }

    public void run() {
        do {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field5042 != null) {
                        return;
                    }
                    if (this.field5038 <= this.field5041) {
                        var2 = this.field5041 - this.field5038;
                    } else {
                        var2 = this.field5041 + (this.field5036 - this.field5038);
                    }
                    if (var2 > 0) {
                        break;
                    }
                    try {
                        this.field5040.flush();
                    } catch (IOException var15) {
                        this.field5042 = var15;
                        return;
                    }
                    if (this.method8252()) {
                        return;
                    }
                    try {
                        this.wait();
                    } catch (InterruptedException var16) {
                    }
                }
            }
            try {
                if (this.field5038 + var2 <= this.field5036) {
                    this.field5040.write(this.field5037, this.field5038, var2);
                } else {
                    int var6 = this.field5036 - this.field5038;
                    this.field5040.write(this.field5037, this.field5038, var6);
                    this.field5040.write(this.field5037, 0, var2 - var6);
                }
            } catch (IOException var14) {
                IOException var7 = var14;
                synchronized (this) {
                    this.field5042 = var7;
                    return;
                }
            }
            synchronized (this) {
                this.field5038 = (this.field5038 + var2) % this.field5036;
            }
        } while (!this.method8252());
    }

    @ObfuscatedName("sm.ae([BIII)V")
    public void method8248(byte[] arg0, int arg1, int arg2) throws IOException {
        if (arg2 < 0 || arg1 < 0 || arg1 + arg2 > arg0.length) {
            throw new IOException();
        }
        synchronized (this) {
            if (this.field5042 != null) {
                throw new IOException(this.field5042.toString());
            }
            int var5;
            if (this.field5038 <= this.field5041) {
                var5 = this.field5038 + (this.field5036 - this.field5041) - 1;
            } else {
                var5 = this.field5038 - this.field5041 - 1;
            }
            if (var5 < arg2) {
                throw new IOException("");
            }
            if (this.field5041 + arg2 <= this.field5036) {
                System.arraycopy(arg0, arg1, this.field5037, this.field5041, arg2);
            } else {
                int var6 = this.field5036 - this.field5041;
                System.arraycopy(arg0, arg1, this.field5037, this.field5041, var6);
                System.arraycopy(arg0, arg1 + var6, this.field5037, 0, arg2 - var6);
            }
            this.field5041 = (this.field5041 + arg2) % this.field5036;
            this.notifyAll();
        }
    }

    @ObfuscatedName("sm.ag(I)V")
    public void method8246() {
        synchronized (this) {
            this.field5043 = true;
            this.notifyAll();
        }
        try {
            this.field5039.join();
        } catch (InterruptedException var4) {
        }
    }
}
