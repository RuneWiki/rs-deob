package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

@ObfuscatedName("lz")
public class class320 implements Runnable {

    @ObfuscatedName("lz.f")
    public Thread field3823;

    @ObfuscatedName("lz.b")
    public InputStream field3819;

    @ObfuscatedName("lz.l")
    public int field3820;

    @ObfuscatedName("lz.m")
    public byte[] field3818;

    @ObfuscatedName("lz.z")
    public int field3822 = 0;

    @ObfuscatedName("lz.q")
    public int field3821 = 0;

    @ObfuscatedName("lz.k")
    public IOException field3824;

    public class320(InputStream arg0, int arg1) {
        this.field3819 = arg0;
        this.field3820 = arg1 + 1;
        this.field3818 = new byte[this.field3820];
        this.field3823 = new Thread(this);
        this.field3823.setDaemon(true);
        this.field3823.start();
    }

    public void run() {
        while (true) {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field3824 != null) {
                        return;
                    }
                    if (this.field3822 == 0) {
                        var2 = this.field3820 - this.field3821 - 1;
                    } else if (this.field3822 <= this.field3821) {
                        var2 = this.field3820 - this.field3821;
                    } else {
                        var2 = this.field3822 - this.field3821 - 1;
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
                var5 = this.field3819.read(this.field3818, this.field3821, var2);
                if (var5 == -1) {
                    throw new EOFException();
                }
            } catch (IOException var14) {
                IOException var6 = var14;
                synchronized (this) {
                    this.field3824 = var6;
                    return;
                }
            }
            synchronized (this) {
                this.field3821 = (this.field3821 + var5) % this.field3820;
            }
        }
    }

    @ObfuscatedName("lz.f(IB)Z")
    public boolean method5514(int arg0) throws IOException {
        if (arg0 == 0) {
            return true;
        } else if (arg0 > 0 && arg0 < this.field3820) {
            synchronized (this) {
                int var3;
                if (this.field3822 <= this.field3821) {
                    var3 = this.field3821 - this.field3822;
                } else {
                    var3 = this.field3821 + (this.field3820 - this.field3822);
                }
                if (var3 >= arg0) {
                    return true;
                } else if (this.field3824 == null) {
                    this.notifyAll();
                    return false;
                } else {
                    throw new IOException(this.field3824.toString());
                }
            }
        } else {
            throw new IOException();
        }
    }

    @ObfuscatedName("lz.b(B)I")
    public int method5518() throws IOException {
        synchronized (this) {
            int var2;
            if (this.field3822 <= this.field3821) {
                var2 = this.field3821 - this.field3822;
            } else {
                var2 = this.field3821 + (this.field3820 - this.field3822);
            }
            if (var2 <= 0 && this.field3824 != null) {
                throw new IOException(this.field3824.toString());
            }
            this.notifyAll();
            return var2;
        }
    }

    @ObfuscatedName("lz.l(I)I")
    public int method5513() throws IOException {
        synchronized (this) {
            if (this.field3822 != this.field3821) {
                int var2 = this.field3818[this.field3822] & 0xFF;
                this.field3822 = (this.field3822 + 1) % this.field3820;
                this.notifyAll();
                return var2;
            } else if (this.field3824 == null) {
                return -1;
            } else {
                throw new IOException(this.field3824.toString());
            }
        }
    }

    @ObfuscatedName("lz.m([BIII)I")
    public int method5516(byte[] arg0, int arg1, int arg2) throws IOException {
        if (arg2 < 0 || arg1 < 0 || arg1 + arg2 > arg0.length) {
            throw new IOException();
        }
        synchronized (this) {
            int var5;
            if (this.field3822 <= this.field3821) {
                var5 = this.field3821 - this.field3822;
            } else {
                var5 = this.field3821 + (this.field3820 - this.field3822);
            }
            if (arg2 > var5) {
                arg2 = var5;
            }
            if (arg2 == 0 && this.field3824 != null) {
                throw new IOException(this.field3824.toString());
            }
            if (this.field3822 + arg2 <= this.field3820) {
                System.arraycopy(this.field3818, this.field3822, arg0, arg1, arg2);
            } else {
                int var6 = this.field3820 - this.field3822;
                System.arraycopy(this.field3818, this.field3822, arg0, arg1, var6);
                System.arraycopy(this.field3818, 0, arg0, arg1 + var6, arg2 - var6);
            }
            this.field3822 = (this.field3822 + arg2) % this.field3820;
            this.notifyAll();
            return arg2;
        }
    }

    @ObfuscatedName("lz.z(I)V")
    public void method5517() {
        synchronized (this) {
            if (this.field3824 == null) {
                this.field3824 = new IOException("");
            }
            this.notifyAll();
        }
        try {
            this.field3823.join();
        } catch (InterruptedException var4) {
        }
    }
}
