package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

@ObfuscatedName("kl")
public class class309 implements Runnable {

    @ObfuscatedName("kl.c")
    public Thread field3782;

    @ObfuscatedName("kl.x")
    public InputStream field3780;

    @ObfuscatedName("kl.t")
    public int field3786;

    @ObfuscatedName("kl.g")
    public byte[] field3779;

    @ObfuscatedName("kl.l")
    public int field3781 = 0;

    @ObfuscatedName("kl.u")
    public int field3783 = 0;

    @ObfuscatedName("kl.j")
    public IOException field3784;

    public class309(InputStream arg0, int arg1) {
        this.field3780 = arg0;
        this.field3786 = arg1 + 1;
        this.field3779 = new byte[this.field3786];
        this.field3782 = new Thread(this);
        this.field3782.setDaemon(true);
        this.field3782.start();
    }

    public void run() {
        while (true) {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field3784 != null) {
                        return;
                    }
                    if (this.field3781 == 0) {
                        var2 = this.field3786 - this.field3783 - 1;
                    } else if (this.field3781 <= this.field3783) {
                        var2 = this.field3786 - this.field3783;
                    } else {
                        var2 = this.field3781 - this.field3783 - 1;
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
                var5 = this.field3780.read(this.field3779, this.field3783, var2);
                if (var5 == -1) {
                    throw new EOFException();
                }
            } catch (IOException var14) {
                IOException var6 = var14;
                synchronized (this) {
                    this.field3784 = var6;
                    return;
                }
            }
            synchronized (this) {
                this.field3783 = (this.field3783 + var5) % this.field3786;
            }
        }
    }

    @ObfuscatedName("kl.c(IB)Z")
    public boolean method5443(int arg0) throws IOException {
        if (arg0 == 0) {
            return true;
        } else if (arg0 > 0 && arg0 < this.field3786) {
            synchronized (this) {
                int var3;
                if (this.field3781 <= this.field3783) {
                    var3 = this.field3783 - this.field3781;
                } else {
                    var3 = this.field3783 + (this.field3786 - this.field3781);
                }
                if (var3 >= arg0) {
                    return true;
                } else if (this.field3784 == null) {
                    this.notifyAll();
                    return false;
                } else {
                    throw new IOException(this.field3784.toString());
                }
            }
        } else {
            throw new IOException();
        }
    }

    @ObfuscatedName("kl.x(I)I")
    public int method5444() throws IOException {
        synchronized (this) {
            int var2;
            if (this.field3781 <= this.field3783) {
                var2 = this.field3783 - this.field3781;
            } else {
                var2 = this.field3783 + (this.field3786 - this.field3781);
            }
            if (var2 <= 0 && this.field3784 != null) {
                throw new IOException(this.field3784.toString());
            }
            this.notifyAll();
            return var2;
        }
    }

    @ObfuscatedName("kl.t(I)I")
    public int method5447() throws IOException {
        synchronized (this) {
            if (this.field3783 != this.field3781) {
                int var2 = this.field3779[this.field3781] & 0xFF;
                this.field3781 = (this.field3781 + 1) % this.field3786;
                this.notifyAll();
                return var2;
            } else if (this.field3784 == null) {
                return -1;
            } else {
                throw new IOException(this.field3784.toString());
            }
        }
    }

    @ObfuscatedName("kl.g([BIII)I")
    public int method5446(byte[] arg0, int arg1, int arg2) throws IOException {
        if (arg2 < 0 || arg1 < 0 || arg1 + arg2 > arg0.length) {
            throw new IOException();
        }
        synchronized (this) {
            int var5;
            if (this.field3781 <= this.field3783) {
                var5 = this.field3783 - this.field3781;
            } else {
                var5 = this.field3783 + (this.field3786 - this.field3781);
            }
            if (arg2 > var5) {
                arg2 = var5;
            }
            if (arg2 == 0 && this.field3784 != null) {
                throw new IOException(this.field3784.toString());
            }
            if (this.field3781 + arg2 <= this.field3786) {
                System.arraycopy(this.field3779, this.field3781, arg0, arg1, arg2);
            } else {
                int var6 = this.field3786 - this.field3781;
                System.arraycopy(this.field3779, this.field3781, arg0, arg1, var6);
                System.arraycopy(this.field3779, 0, arg0, arg1 + var6, arg2 - var6);
            }
            this.field3781 = (this.field3781 + arg2) % this.field3786;
            this.notifyAll();
            return arg2;
        }
    }

    @ObfuscatedName("kl.l(I)V")
    public void method5457() {
        synchronized (this) {
            if (this.field3784 == null) {
                this.field3784 = new IOException("");
            }
            this.notifyAll();
        }
        try {
            this.field3782.join();
        } catch (InterruptedException var4) {
        }
    }
}
