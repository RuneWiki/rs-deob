package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

@ObfuscatedName("kx")
public class class309 implements Runnable {

    @ObfuscatedName("kx.z")
    public Thread field3789;

    @ObfuscatedName("kx.n")
    public InputStream field3784;

    @ObfuscatedName("kx.v")
    public int field3785;

    @ObfuscatedName("kx.u")
    public byte[] field3786;

    @ObfuscatedName("kx.r")
    public int field3787 = 0;

    @ObfuscatedName("kx.p")
    public int field3788 = 0;

    @ObfuscatedName("kx.q")
    public IOException field3783;

    public class309(InputStream arg0, int arg1) {
        this.field3784 = arg0;
        this.field3785 = arg1 + 1;
        this.field3786 = new byte[this.field3785];
        this.field3789 = new Thread(this);
        this.field3789.setDaemon(true);
        this.field3789.start();
    }

    public void run() {
        while (true) {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field3783 != null) {
                        return;
                    }
                    if (this.field3787 == 0) {
                        var2 = this.field3785 - this.field3788 - 1;
                    } else if (this.field3787 <= this.field3788) {
                        var2 = this.field3785 - this.field3788;
                    } else {
                        var2 = this.field3787 - this.field3788 - 1;
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
                var5 = this.field3784.read(this.field3786, this.field3788, var2);
                if (var5 == -1) {
                    throw new EOFException();
                }
            } catch (IOException var14) {
                IOException var6 = var14;
                synchronized (this) {
                    this.field3783 = var6;
                    return;
                }
            }
            synchronized (this) {
                this.field3788 = (this.field3788 + var5) % this.field3785;
            }
        }
    }

    @ObfuscatedName("kx.z(IB)Z")
    public boolean method5311(int arg0) throws IOException {
        if (arg0 == 0) {
            return true;
        } else if (arg0 > 0 && arg0 < this.field3785) {
            synchronized (this) {
                int var3;
                if (this.field3787 <= this.field3788) {
                    var3 = this.field3788 - this.field3787;
                } else {
                    var3 = this.field3788 + (this.field3785 - this.field3787);
                }
                if (var3 >= arg0) {
                    return true;
                } else if (this.field3783 == null) {
                    this.notifyAll();
                    return false;
                } else {
                    throw new IOException(this.field3783.toString());
                }
            }
        } else {
            throw new IOException();
        }
    }

    @ObfuscatedName("kx.n(B)I")
    public int method5324() throws IOException {
        synchronized (this) {
            int var2;
            if (this.field3787 <= this.field3788) {
                var2 = this.field3788 - this.field3787;
            } else {
                var2 = this.field3788 + (this.field3785 - this.field3787);
            }
            if (var2 <= 0 && this.field3783 != null) {
                throw new IOException(this.field3783.toString());
            }
            this.notifyAll();
            return var2;
        }
    }

    @ObfuscatedName("kx.v(I)I")
    public int method5313() throws IOException {
        synchronized (this) {
            if (this.field3788 != this.field3787) {
                int var2 = this.field3786[this.field3787] & 0xFF;
                this.field3787 = (this.field3787 + 1) % this.field3785;
                this.notifyAll();
                return var2;
            } else if (this.field3783 == null) {
                return -1;
            } else {
                throw new IOException(this.field3783.toString());
            }
        }
    }

    @ObfuscatedName("kx.u([BIII)I")
    public int method5314(byte[] arg0, int arg1, int arg2) throws IOException {
        if (arg2 < 0 || arg1 < 0 || arg1 + arg2 > arg0.length) {
            throw new IOException();
        }
        synchronized (this) {
            int var5;
            if (this.field3787 <= this.field3788) {
                var5 = this.field3788 - this.field3787;
            } else {
                var5 = this.field3788 + (this.field3785 - this.field3787);
            }
            if (arg2 > var5) {
                arg2 = var5;
            }
            if (arg2 == 0 && this.field3783 != null) {
                throw new IOException(this.field3783.toString());
            }
            if (this.field3787 + arg2 <= this.field3785) {
                System.arraycopy(this.field3786, this.field3787, arg0, arg1, arg2);
            } else {
                int var6 = this.field3785 - this.field3787;
                System.arraycopy(this.field3786, this.field3787, arg0, arg1, var6);
                System.arraycopy(this.field3786, 0, arg0, arg1 + var6, arg2 - var6);
            }
            this.field3787 = (this.field3787 + arg2) % this.field3785;
            this.notifyAll();
            return arg2;
        }
    }

    @ObfuscatedName("kx.r(I)V")
    public void method5315() {
        synchronized (this) {
            if (this.field3783 == null) {
                this.field3783 = new IOException("");
            }
            this.notifyAll();
        }
        try {
            this.field3789.join();
        } catch (InterruptedException var4) {
        }
    }
}
