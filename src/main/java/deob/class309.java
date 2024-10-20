package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

@ObfuscatedName("kx")
public class class309 implements Runnable {

    @ObfuscatedName("kx.f")
    public Thread field3783;

    @ObfuscatedName("kx.i")
    public InputStream field3784;

    @ObfuscatedName("kx.y")
    public int field3788;

    @ObfuscatedName("kx.w")
    public byte[] field3785;

    @ObfuscatedName("kx.p")
    public int field3786 = 0;

    @ObfuscatedName("kx.b")
    public int field3787 = 0;

    @ObfuscatedName("kx.e")
    public IOException field3789;

    public class309(InputStream arg0, int arg1) {
        this.field3784 = arg0;
        this.field3788 = arg1 + 1;
        this.field3785 = new byte[this.field3788];
        this.field3783 = new Thread(this);
        this.field3783.setDaemon(true);
        this.field3783.start();
    }

    public void run() {
        while (true) {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field3789 != null) {
                        return;
                    }
                    if (this.field3786 == 0) {
                        var2 = this.field3788 - this.field3787 - 1;
                    } else if (this.field3786 <= this.field3787) {
                        var2 = this.field3788 - this.field3787;
                    } else {
                        var2 = this.field3786 - this.field3787 - 1;
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
                var5 = this.field3784.read(this.field3785, this.field3787, var2);
                if (var5 == -1) {
                    throw new EOFException();
                }
            } catch (IOException var14) {
                IOException var6 = var14;
                synchronized (this) {
                    this.field3789 = var6;
                    return;
                }
            }
            synchronized (this) {
                this.field3787 = (this.field3787 + var5) % this.field3788;
            }
        }
    }

    @ObfuscatedName("kx.f(II)Z")
    public boolean method5431(int arg0) throws IOException {
        if (arg0 == 0) {
            return true;
        } else if (arg0 > 0 && arg0 < this.field3788) {
            synchronized (this) {
                int var3;
                if (this.field3786 <= this.field3787) {
                    var3 = this.field3787 - this.field3786;
                } else {
                    var3 = this.field3787 + (this.field3788 - this.field3786);
                }
                if (var3 >= arg0) {
                    return true;
                } else if (this.field3789 == null) {
                    this.notifyAll();
                    return false;
                } else {
                    throw new IOException(this.field3789.toString());
                }
            }
        } else {
            throw new IOException();
        }
    }

    @ObfuscatedName("kx.i(S)I")
    public int method5429() throws IOException {
        synchronized (this) {
            int var2;
            if (this.field3786 <= this.field3787) {
                var2 = this.field3787 - this.field3786;
            } else {
                var2 = this.field3787 + (this.field3788 - this.field3786);
            }
            if (var2 <= 0 && this.field3789 != null) {
                throw new IOException(this.field3789.toString());
            }
            this.notifyAll();
            return var2;
        }
    }

    @ObfuscatedName("kx.y(B)I")
    public int method5433() throws IOException {
        synchronized (this) {
            if (this.field3787 != this.field3786) {
                int var2 = this.field3785[this.field3786] & 0xFF;
                this.field3786 = (this.field3786 + 1) % this.field3788;
                this.notifyAll();
                return var2;
            } else if (this.field3789 == null) {
                return -1;
            } else {
                throw new IOException(this.field3789.toString());
            }
        }
    }

    @ObfuscatedName("kx.w([BIII)I")
    public int method5434(byte[] arg0, int arg1, int arg2) throws IOException {
        if (arg2 < 0 || arg1 < 0 || arg1 + arg2 > arg0.length) {
            throw new IOException();
        }
        synchronized (this) {
            int var5;
            if (this.field3786 <= this.field3787) {
                var5 = this.field3787 - this.field3786;
            } else {
                var5 = this.field3787 + (this.field3788 - this.field3786);
            }
            if (arg2 > var5) {
                arg2 = var5;
            }
            if (arg2 == 0 && this.field3789 != null) {
                throw new IOException(this.field3789.toString());
            }
            if (this.field3786 + arg2 <= this.field3788) {
                System.arraycopy(this.field3785, this.field3786, arg0, arg1, arg2);
            } else {
                int var6 = this.field3788 - this.field3786;
                System.arraycopy(this.field3785, this.field3786, arg0, arg1, var6);
                System.arraycopy(this.field3785, 0, arg0, arg1 + var6, arg2 - var6);
            }
            this.field3786 = (this.field3786 + arg2) % this.field3788;
            this.notifyAll();
            return arg2;
        }
    }

    @ObfuscatedName("kx.p(B)V")
    public void method5438() {
        synchronized (this) {
            if (this.field3789 == null) {
                this.field3789 = new IOException("");
            }
            this.notifyAll();
        }
        try {
            this.field3783.join();
        } catch (InterruptedException var4) {
        }
    }
}
