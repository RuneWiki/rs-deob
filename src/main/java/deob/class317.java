package deob;

import java.io.IOException;
import java.io.OutputStream;

@ObfuscatedName("lu")
public class class317 implements Runnable {

    @ObfuscatedName("lu.m")
    public Thread field3802;

    @ObfuscatedName("lu.o")
    public OutputStream field3798;

    @ObfuscatedName("lu.q")
    public int field3799;

    @ObfuscatedName("lu.j")
    public byte[] field3803;

    @ObfuscatedName("lu.p")
    public int field3801 = 0;

    @ObfuscatedName("lu.g")
    public int field3800 = 0;

    @ObfuscatedName("lu.n")
    public IOException field3797;

    @ObfuscatedName("lu.u")
    public boolean field3804;

    public class317(OutputStream arg0, int arg1) {
        this.field3798 = arg0;
        this.field3799 = arg1 + 1;
        this.field3803 = new byte[this.field3799];
        this.field3802 = new Thread(this);
        this.field3802.setDaemon(true);
        this.field3802.start();
    }

    @ObfuscatedName("lu.m(B)Z")
    public boolean method5549() {
        if (!this.field3804) {
            return false;
        }
        try {
            this.field3798.close();
            if (this.field3797 == null) {
                this.field3797 = new IOException("");
            }
        } catch (IOException var2) {
            if (this.field3797 == null) {
                this.field3797 = new IOException(var2);
            }
        }
        return true;
    }

    public void run() {
        do {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field3797 != null) {
                        return;
                    }
                    if (this.field3801 <= this.field3800) {
                        var2 = this.field3800 - this.field3801;
                    } else {
                        var2 = this.field3800 + (this.field3799 - this.field3801);
                    }
                    if (var2 > 0) {
                        break;
                    }
                    try {
                        this.field3798.flush();
                    } catch (IOException var15) {
                        this.field3797 = var15;
                        return;
                    }
                    if (this.method5549()) {
                        return;
                    }
                    try {
                        this.wait();
                    } catch (InterruptedException var16) {
                    }
                }
            }
            try {
                if (this.field3801 + var2 <= this.field3799) {
                    this.field3798.write(this.field3803, this.field3801, var2);
                } else {
                    int var6 = this.field3799 - this.field3801;
                    this.field3798.write(this.field3803, this.field3801, var6);
                    this.field3798.write(this.field3803, 0, var2 - var6);
                }
            } catch (IOException var14) {
                IOException var7 = var14;
                synchronized (this) {
                    this.field3797 = var7;
                    return;
                }
            }
            synchronized (this) {
                this.field3801 = (this.field3801 + var2) % this.field3799;
            }
        } while (!this.method5549());
    }

    @ObfuscatedName("lu.o([BIII)V")
    public void method5548(byte[] arg0, int arg1, int arg2) throws IOException {
        if (arg2 < 0 || arg1 < 0 || arg1 + arg2 > arg0.length) {
            throw new IOException();
        }
        synchronized (this) {
            if (this.field3797 != null) {
                throw new IOException(this.field3797.toString());
            }
            int var5;
            if (this.field3801 <= this.field3800) {
                var5 = this.field3801 + (this.field3799 - this.field3800) - 1;
            } else {
                var5 = this.field3801 - this.field3800 - 1;
            }
            if (var5 < arg2) {
                throw new IOException("");
            }
            if (this.field3800 + arg2 <= this.field3799) {
                System.arraycopy(arg0, arg1, this.field3803, this.field3800, arg2);
            } else {
                int var6 = this.field3799 - this.field3800;
                System.arraycopy(arg0, arg1, this.field3803, this.field3800, var6);
                System.arraycopy(arg0, arg1 + var6, this.field3803, 0, arg2 - var6);
            }
            this.field3800 = (this.field3800 + arg2) % this.field3799;
            this.notifyAll();
        }
    }

    @ObfuscatedName("lu.q(S)V")
    public void method5546() {
        synchronized (this) {
            this.field3804 = true;
            this.notifyAll();
        }
        try {
            this.field3802.join();
        } catch (InterruptedException var4) {
        }
    }
}
