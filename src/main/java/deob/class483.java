package deob;

import java.io.IOException;
import java.io.OutputStream;

@ObfuscatedName("sn")
public class class483 implements Runnable {

    @ObfuscatedName("sn.ab")
    public Thread field4980;

    @ObfuscatedName("sn.ay")
    public OutputStream field4985;

    @ObfuscatedName("sn.an")
    public int field4978;

    @ObfuscatedName("sn.au")
    public byte[] field4981;

    @ObfuscatedName("sn.ax")
    public int field4979 = 0;

    @ObfuscatedName("sn.ao")
    public int field4983 = 0;

    @ObfuscatedName("sn.am")
    public IOException field4984;

    @ObfuscatedName("sn.ac")
    public boolean field4982;

    public class483(OutputStream arg0, int arg1) {
        this.field4985 = arg0;
        this.field4978 = arg1 + 1;
        this.field4981 = new byte[this.field4978];
        this.field4980 = new Thread(this);
        this.field4980.setDaemon(true);
        this.field4980.start();
    }

    @ObfuscatedName("sn.ab(I)Z")
    public boolean method8106() {
        if (!this.field4982) {
            return false;
        }
        try {
            this.field4985.close();
            if (this.field4984 == null) {
                this.field4984 = new IOException("");
            }
        } catch (IOException var2) {
            if (this.field4984 == null) {
                this.field4984 = new IOException(var2);
            }
        }
        return true;
    }

    public void run() {
        do {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field4984 != null) {
                        return;
                    }
                    if (this.field4979 <= this.field4983) {
                        var2 = this.field4983 - this.field4979;
                    } else {
                        var2 = this.field4983 + (this.field4978 - this.field4979);
                    }
                    if (var2 > 0) {
                        break;
                    }
                    try {
                        this.field4985.flush();
                    } catch (IOException var15) {
                        this.field4984 = var15;
                        return;
                    }
                    if (this.method8106()) {
                        return;
                    }
                    try {
                        this.wait();
                    } catch (InterruptedException var16) {
                    }
                }
            }
            try {
                if (this.field4979 + var2 <= this.field4978) {
                    this.field4985.write(this.field4981, this.field4979, var2);
                } else {
                    int var6 = this.field4978 - this.field4979;
                    this.field4985.write(this.field4981, this.field4979, var6);
                    this.field4985.write(this.field4981, 0, var2 - var6);
                }
            } catch (IOException var14) {
                IOException var7 = var14;
                synchronized (this) {
                    this.field4984 = var7;
                    return;
                }
            }
            synchronized (this) {
                this.field4979 = (this.field4979 + var2) % this.field4978;
            }
        } while (!this.method8106());
    }

    @ObfuscatedName("sn.ay([BIIS)V")
    public void method8108(byte[] arg0, int arg1, int arg2) throws IOException {
        if (arg2 < 0 || arg1 < 0 || arg1 + arg2 > arg0.length) {
            throw new IOException();
        }
        synchronized (this) {
            if (this.field4984 != null) {
                throw new IOException(this.field4984.toString());
            }
            int var5;
            if (this.field4979 <= this.field4983) {
                var5 = this.field4979 + (this.field4978 - this.field4983) - 1;
            } else {
                var5 = this.field4979 - this.field4983 - 1;
            }
            if (var5 < arg2) {
                throw new IOException("");
            }
            if (this.field4983 + arg2 <= this.field4978) {
                System.arraycopy(arg0, arg1, this.field4981, this.field4983, arg2);
            } else {
                int var6 = this.field4978 - this.field4983;
                System.arraycopy(arg0, arg1, this.field4981, this.field4983, var6);
                System.arraycopy(arg0, arg1 + var6, this.field4981, 0, arg2 - var6);
            }
            this.field4983 = (this.field4983 + arg2) % this.field4978;
            this.notifyAll();
        }
    }

    @ObfuscatedName("sn.an(I)V")
    public void method8111() {
        synchronized (this) {
            this.field4982 = true;
            this.notifyAll();
        }
        try {
            this.field4980.join();
        } catch (InterruptedException var4) {
        }
    }
}
