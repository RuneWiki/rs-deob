package deob;

import java.io.IOException;
import java.io.OutputStream;

@ObfuscatedName("qn")
public class class430 implements Runnable {

    @ObfuscatedName("qn.at")
    public Thread field4641;

    @ObfuscatedName("qn.an")
    public OutputStream field4639;

    @ObfuscatedName("qn.av")
    public int field4640;

    @ObfuscatedName("qn.as")
    public byte[] field4638;

    @ObfuscatedName("qn.ax")
    public int field4642 = 0;

    @ObfuscatedName("qn.ap")
    public int field4643 = 0;

    @ObfuscatedName("qn.ab")
    public IOException field4644;

    @ObfuscatedName("qn.ak")
    public boolean field4645;

    public class430(OutputStream arg0, int arg1) {
        this.field4639 = arg0;
        this.field4640 = arg1 + 1;
        this.field4638 = new byte[this.field4640];
        this.field4641 = new Thread(this);
        this.field4641.setDaemon(true);
        this.field4641.start();
    }

    @ObfuscatedName("qn.at(I)Z")
    public boolean method7301() {
        if (!this.field4645) {
            return false;
        }
        try {
            this.field4639.close();
            if (this.field4644 == null) {
                this.field4644 = new IOException("");
            }
        } catch (IOException var2) {
            if (this.field4644 == null) {
                this.field4644 = new IOException(var2);
            }
        }
        return true;
    }

    public void run() {
        do {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field4644 != null) {
                        return;
                    }
                    if (this.field4642 <= this.field4643) {
                        var2 = this.field4643 - this.field4642;
                    } else {
                        var2 = this.field4643 + (this.field4640 - this.field4642);
                    }
                    if (var2 > 0) {
                        break;
                    }
                    try {
                        this.field4639.flush();
                    } catch (IOException var15) {
                        this.field4644 = var15;
                        return;
                    }
                    if (this.method7301()) {
                        return;
                    }
                    try {
                        this.wait();
                    } catch (InterruptedException var16) {
                    }
                }
            }
            try {
                if (this.field4642 + var2 <= this.field4640) {
                    this.field4639.write(this.field4638, this.field4642, var2);
                } else {
                    int var6 = this.field4640 - this.field4642;
                    this.field4639.write(this.field4638, this.field4642, var6);
                    this.field4639.write(this.field4638, 0, var2 - var6);
                }
            } catch (IOException var14) {
                IOException var7 = var14;
                synchronized (this) {
                    this.field4644 = var7;
                    return;
                }
            }
            synchronized (this) {
                this.field4642 = (this.field4642 + var2) % this.field4640;
            }
        } while (!this.method7301());
    }

    @ObfuscatedName("qn.an([BIII)V")
    public void method7303(byte[] arg0, int arg1, int arg2) throws IOException {
        if (arg2 < 0 || arg1 < 0 || arg1 + arg2 > arg0.length) {
            throw new IOException();
        }
        synchronized (this) {
            if (this.field4644 != null) {
                throw new IOException(this.field4644.toString());
            }
            int var5;
            if (this.field4642 <= this.field4643) {
                var5 = this.field4642 + (this.field4640 - this.field4643) - 1;
            } else {
                var5 = this.field4642 - this.field4643 - 1;
            }
            if (var5 < arg2) {
                throw new IOException("");
            }
            if (this.field4643 + arg2 <= this.field4640) {
                System.arraycopy(arg0, arg1, this.field4638, this.field4643, arg2);
            } else {
                int var6 = this.field4640 - this.field4643;
                System.arraycopy(arg0, arg1, this.field4638, this.field4643, var6);
                System.arraycopy(arg0, arg1 + var6, this.field4638, 0, arg2 - var6);
            }
            this.field4643 = (this.field4643 + arg2) % this.field4640;
            this.notifyAll();
        }
    }

    @ObfuscatedName("qn.av(S)V")
    public void method7304() {
        synchronized (this) {
            this.field4645 = true;
            this.notifyAll();
        }
        try {
            this.field4641.join();
        } catch (InterruptedException var4) {
        }
    }
}
