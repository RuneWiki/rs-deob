package deob;

import java.io.IOException;
import java.io.OutputStream;

@ObfuscatedName("sr")
public class class481 implements Runnable {

    @ObfuscatedName("sr.ak")
    public Thread field4978;

    @ObfuscatedName("sr.al")
    public OutputStream field4976;

    @ObfuscatedName("sr.aj")
    public int field4973;

    @ObfuscatedName("sr.az")
    public byte[] field4971;

    @ObfuscatedName("sr.af")
    public int field4975 = 0;

    @ObfuscatedName("sr.aa")
    public int field4972 = 0;

    @ObfuscatedName("sr.at")
    public IOException field4977;

    @ObfuscatedName("sr.ab")
    public boolean field4974;

    public class481(OutputStream arg0, int arg1) {
        this.field4976 = arg0;
        this.field4973 = arg1 + 1;
        this.field4971 = new byte[this.field4973];
        this.field4978 = new Thread(this);
        this.field4978.setDaemon(true);
        this.field4978.start();
    }

    @ObfuscatedName("sr.ak(B)Z")
    public boolean method8065() {
        if (!this.field4974) {
            return false;
        }
        try {
            this.field4976.close();
            if (this.field4977 == null) {
                this.field4977 = new IOException("");
            }
        } catch (IOException var2) {
            if (this.field4977 == null) {
                this.field4977 = new IOException(var2);
            }
        }
        return true;
    }

    public void run() {
        do {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field4977 != null) {
                        return;
                    }
                    if (this.field4975 <= this.field4972) {
                        var2 = this.field4972 - this.field4975;
                    } else {
                        var2 = this.field4972 + (this.field4973 - this.field4975);
                    }
                    if (var2 > 0) {
                        break;
                    }
                    try {
                        this.field4976.flush();
                    } catch (IOException var15) {
                        this.field4977 = var15;
                        return;
                    }
                    if (this.method8065()) {
                        return;
                    }
                    try {
                        this.wait();
                    } catch (InterruptedException var16) {
                    }
                }
            }
            try {
                if (this.field4975 + var2 <= this.field4973) {
                    this.field4976.write(this.field4971, this.field4975, var2);
                } else {
                    int var6 = this.field4973 - this.field4975;
                    this.field4976.write(this.field4971, this.field4975, var6);
                    this.field4976.write(this.field4971, 0, var2 - var6);
                }
            } catch (IOException var14) {
                IOException var7 = var14;
                synchronized (this) {
                    this.field4977 = var7;
                    return;
                }
            }
            synchronized (this) {
                this.field4975 = (this.field4975 + var2) % this.field4973;
            }
        } while (!this.method8065());
    }

    @ObfuscatedName("sr.al([BIII)V")
    public void method8066(byte[] arg0, int arg1, int arg2) throws IOException {
        if (arg2 < 0 || arg1 < 0 || arg1 + arg2 > arg0.length) {
            throw new IOException();
        }
        synchronized (this) {
            if (this.field4977 != null) {
                throw new IOException(this.field4977.toString());
            }
            int var5;
            if (this.field4975 <= this.field4972) {
                var5 = this.field4975 + (this.field4973 - this.field4972) - 1;
            } else {
                var5 = this.field4975 - this.field4972 - 1;
            }
            if (var5 < arg2) {
                throw new IOException("");
            }
            if (this.field4972 + arg2 <= this.field4973) {
                System.arraycopy(arg0, arg1, this.field4971, this.field4972, arg2);
            } else {
                int var6 = this.field4973 - this.field4972;
                System.arraycopy(arg0, arg1, this.field4971, this.field4972, var6);
                System.arraycopy(arg0, arg1 + var6, this.field4971, 0, arg2 - var6);
            }
            this.field4972 = (this.field4972 + arg2) % this.field4973;
            this.notifyAll();
        }
    }

    @ObfuscatedName("sr.aj(I)V")
    public void method8077() {
        synchronized (this) {
            this.field4974 = true;
            this.notifyAll();
        }
        try {
            this.field4978.join();
        } catch (InterruptedException var4) {
        }
    }
}
