package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

@ObfuscatedName("lm")
public class class319 implements Runnable {

    @ObfuscatedName("lm.x")
    public Thread field3795;

    @ObfuscatedName("lm.m")
    public InputStream field3801;

    @ObfuscatedName("lm.k")
    public int field3793;

    @ObfuscatedName("lm.d")
    public byte[] field3796;

    @ObfuscatedName("lm.w")
    public int field3797 = 0;

    @ObfuscatedName("lm.v")
    public int field3798 = 0;

    @ObfuscatedName("lm.q")
    public IOException field3799;

    public class319(InputStream arg0, int arg1) {
        this.field3801 = arg0;
        this.field3793 = arg1 + 1;
        this.field3796 = new byte[this.field3793];
        this.field3795 = new Thread(this);
        this.field3795.setDaemon(true);
        this.field3795.start();
    }

    public void run() {
        while (true) {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field3799 != null) {
                        return;
                    }
                    if (this.field3797 == 0) {
                        var2 = this.field3793 - this.field3798 - 1;
                    } else if (this.field3797 <= this.field3798) {
                        var2 = this.field3793 - this.field3798;
                    } else {
                        var2 = this.field3797 - this.field3798 - 1;
                    }
                    if (var2 > 0) {
                        break;
                    }
                    try {
                        this.wait();
                    } catch (InterruptedException var13) {
                    }
                }
            }
            int var5;
            try {
                var5 = this.field3801.read(this.field3796, this.field3798, var2);
                if (var5 == -1) {
                    throw new EOFException();
                }
            } catch (IOException var14) {
                IOException var6 = var14;
                synchronized (this) {
                    this.field3799 = var6;
                    return;
                }
            }
            synchronized (this) {
                this.field3798 = (this.field3798 + var5) % this.field3793;
            }
        }
    }

    @ObfuscatedName("lm.x(IB)Z")
    public boolean method5462(int arg0) throws IOException {
        if (arg0 == 0) {
            return true;
        } else if (arg0 > 0 && arg0 < this.field3793) {
            synchronized (this) {
                int var3;
                if (this.field3797 <= this.field3798) {
                    var3 = this.field3798 - this.field3797;
                } else {
                    var3 = this.field3798 + (this.field3793 - this.field3797);
                }
                if (var3 >= arg0) {
                    return true;
                } else if (this.field3799 == null) {
                    this.notifyAll();
                    return false;
                } else {
                    throw new IOException(this.field3799.toString());
                }
            }
        } else {
            throw new IOException();
        }
    }

    @ObfuscatedName("lm.m(B)I")
    public int method5463() throws IOException {
        synchronized (this) {
            int var2;
            if (this.field3797 <= this.field3798) {
                var2 = this.field3798 - this.field3797;
            } else {
                var2 = this.field3798 + (this.field3793 - this.field3797);
            }
            if (var2 <= 0 && this.field3799 != null) {
                throw new IOException(this.field3799.toString());
            }
            this.notifyAll();
            return var2;
        }
    }

    @ObfuscatedName("lm.k(B)I")
    public int method5464() throws IOException {
        synchronized (this) {
            if (this.field3798 != this.field3797) {
                int var2 = this.field3796[this.field3797] & 0xFF;
                this.field3797 = (this.field3797 + 1) % this.field3793;
                this.notifyAll();
                return var2;
            } else if (this.field3799 == null) {
                return -1;
            } else {
                throw new IOException(this.field3799.toString());
            }
        }
    }

    @ObfuscatedName("lm.d([BIII)I")
    public int method5466(byte[] arg0, int arg1, int arg2) throws IOException {
        if (arg2 < 0 || arg1 < 0 || arg1 + arg2 > arg0.length) {
            throw new IOException();
        }
        synchronized (this) {
            int var5;
            if (this.field3797 <= this.field3798) {
                var5 = this.field3798 - this.field3797;
            } else {
                var5 = this.field3798 + (this.field3793 - this.field3797);
            }
            if (arg2 > var5) {
                arg2 = var5;
            }
            if (arg2 == 0 && this.field3799 != null) {
                throw new IOException(this.field3799.toString());
            }
            if (this.field3797 + arg2 <= this.field3793) {
                System.arraycopy(this.field3796, this.field3797, arg0, arg1, arg2);
            } else {
                int var6 = this.field3793 - this.field3797;
                System.arraycopy(this.field3796, this.field3797, arg0, arg1, var6);
                System.arraycopy(this.field3796, 0, arg0, arg1 + var6, arg2 - var6);
            }
            this.field3797 = (this.field3797 + arg2) % this.field3793;
            this.notifyAll();
            return arg2;
        }
    }

    @ObfuscatedName("lm.w(I)V")
    public void method5473() {
        synchronized (this) {
            if (this.field3799 == null) {
                this.field3799 = new IOException("");
            }
            this.notifyAll();
        }
        try {
            this.field3795.join();
        } catch (InterruptedException var4) {
        }
    }
}
