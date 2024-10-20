package deob;

import java.io.IOException;
import java.io.OutputStream;

@ObfuscatedName("sa")
public class class482 implements Runnable {

    @ObfuscatedName("sa.aq")
    public Thread field5004;

    @ObfuscatedName("sa.ad")
    public OutputStream field4999;

    @ObfuscatedName("sa.ag")
    public int field4998;

    @ObfuscatedName("sa.ak")
    public byte[] field5001;

    @ObfuscatedName("sa.ap")
    public int field5002 = 0;

    @ObfuscatedName("sa.an")
    public int field5003 = 0;

    @ObfuscatedName("sa.aj")
    public IOException field5000;

    @ObfuscatedName("sa.av")
    public boolean field5005;

    public class482(OutputStream arg0, int arg1) {
        this.field4999 = arg0;
        this.field4998 = arg1 + 1;
        this.field5001 = new byte[this.field4998];
        this.field5004 = new Thread(this);
        this.field5004.setDaemon(true);
        this.field5004.start();
    }

    @ObfuscatedName("sa.aq(I)Z")
    public boolean method8006() {
        if (!this.field5005) {
            return false;
        }
        try {
            this.field4999.close();
            if (this.field5000 == null) {
                this.field5000 = new IOException("");
            }
        } catch (IOException var2) {
            if (this.field5000 == null) {
                this.field5000 = new IOException(var2);
            }
        }
        return true;
    }

    public void run() {
        do {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field5000 != null) {
                        return;
                    }
                    if (this.field5002 <= this.field5003) {
                        var2 = this.field5003 - this.field5002;
                    } else {
                        var2 = this.field5003 + (this.field4998 - this.field5002);
                    }
                    if (var2 > 0) {
                        break;
                    }
                    try {
                        this.field4999.flush();
                    } catch (IOException var15) {
                        this.field5000 = var15;
                        return;
                    }
                    if (this.method8006()) {
                        return;
                    }
                    try {
                        this.wait();
                    } catch (InterruptedException var16) {
                    }
                }
            }
            try {
                if (this.field5002 + var2 <= this.field4998) {
                    this.field4999.write(this.field5001, this.field5002, var2);
                } else {
                    int var6 = this.field4998 - this.field5002;
                    this.field4999.write(this.field5001, this.field5002, var6);
                    this.field4999.write(this.field5001, 0, var2 - var6);
                }
            } catch (IOException var14) {
                IOException var7 = var14;
                synchronized (this) {
                    this.field5000 = var7;
                    return;
                }
            }
            synchronized (this) {
                this.field5002 = (this.field5002 + var2) % this.field4998;
            }
        } while (!this.method8006());
    }

    @ObfuscatedName("sa.ad([BIII)V")
    public void method8007(byte[] arg0, int arg1, int arg2) throws IOException {
        if (arg2 < 0 || arg1 < 0 || arg1 + arg2 > arg0.length) {
            throw new IOException();
        }
        synchronized (this) {
            if (this.field5000 != null) {
                throw new IOException(this.field5000.toString());
            }
            int var5;
            if (this.field5002 <= this.field5003) {
                var5 = this.field5002 + (this.field4998 - this.field5003) - 1;
            } else {
                var5 = this.field5002 - this.field5003 - 1;
            }
            if (var5 < arg2) {
                throw new IOException("");
            }
            if (this.field5003 + arg2 <= this.field4998) {
                System.arraycopy(arg0, arg1, this.field5001, this.field5003, arg2);
            } else {
                int var6 = this.field4998 - this.field5003;
                System.arraycopy(arg0, arg1, this.field5001, this.field5003, var6);
                System.arraycopy(arg0, arg1 + var6, this.field5001, 0, arg2 - var6);
            }
            this.field5003 = (this.field5003 + arg2) % this.field4998;
            this.notifyAll();
        }
    }

    @ObfuscatedName("sa.ag(I)V")
    public void method8008() {
        synchronized (this) {
            this.field5005 = true;
            this.notifyAll();
        }
        try {
            this.field5004.join();
        } catch (InterruptedException var4) {
        }
    }
}
