package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

@ObfuscatedName("kh")
public class class309 implements Runnable {

    @ObfuscatedName("kh.s")
    public Thread field3788;

    @ObfuscatedName("kh.j")
    public InputStream field3782;

    @ObfuscatedName("kh.i")
    public int field3784;

    @ObfuscatedName("kh.k")
    public byte[] field3783;

    @ObfuscatedName("kh.u")
    public int field3781 = 0;

    @ObfuscatedName("kh.n")
    public int field3786 = 0;

    @ObfuscatedName("kh.t")
    public IOException field3787;

    public class309(InputStream arg0, int arg1) {
        this.field3782 = arg0;
        this.field3784 = arg1 + 1;
        this.field3783 = new byte[this.field3784];
        this.field3788 = new Thread(this);
        this.field3788.setDaemon(true);
        this.field3788.start();
    }

    public void run() {
        while (true) {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field3787 != null) {
                        return;
                    }
                    if (this.field3781 == 0) {
                        var2 = this.field3784 - this.field3786 - 1;
                    } else if (this.field3781 <= this.field3786) {
                        var2 = this.field3784 - this.field3786;
                    } else {
                        var2 = this.field3781 - this.field3786 - 1;
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
                var5 = this.field3782.read(this.field3783, this.field3786, var2);
                if (var5 == -1) {
                    throw new EOFException();
                }
            } catch (IOException var14) {
                IOException var6 = var14;
                synchronized (this) {
                    this.field3787 = var6;
                    return;
                }
            }
            synchronized (this) {
                this.field3786 = (this.field3786 + var5) % this.field3784;
            }
        }
    }

    @ObfuscatedName("kh.s(II)Z")
    public boolean method5363(int arg0) throws IOException {
        if (arg0 == 0) {
            return true;
        } else if (arg0 > 0 && arg0 < this.field3784) {
            synchronized (this) {
                int var3;
                if (this.field3781 <= this.field3786) {
                    var3 = this.field3786 - this.field3781;
                } else {
                    var3 = this.field3786 + (this.field3784 - this.field3781);
                }
                if (var3 >= arg0) {
                    return true;
                } else if (this.field3787 == null) {
                    this.notifyAll();
                    return false;
                } else {
                    throw new IOException(this.field3787.toString());
                }
            }
        } else {
            throw new IOException();
        }
    }

    @ObfuscatedName("kh.j(B)I")
    public int method5370() throws IOException {
        synchronized (this) {
            int var2;
            if (this.field3781 <= this.field3786) {
                var2 = this.field3786 - this.field3781;
            } else {
                var2 = this.field3786 + (this.field3784 - this.field3781);
            }
            if (var2 <= 0 && this.field3787 != null) {
                throw new IOException(this.field3787.toString());
            }
            this.notifyAll();
            return var2;
        }
    }

    @ObfuscatedName("kh.i(I)I")
    public int method5365() throws IOException {
        synchronized (this) {
            if (this.field3786 != this.field3781) {
                int var2 = this.field3783[this.field3781] & 0xFF;
                this.field3781 = (this.field3781 + 1) % this.field3784;
                this.notifyAll();
                return var2;
            } else if (this.field3787 == null) {
                return -1;
            } else {
                throw new IOException(this.field3787.toString());
            }
        }
    }

    @ObfuscatedName("kh.k([BIIS)I")
    public int method5366(byte[] arg0, int arg1, int arg2) throws IOException {
        if (arg2 < 0 || arg1 < 0 || arg1 + arg2 > arg0.length) {
            throw new IOException();
        }
        synchronized (this) {
            int var5;
            if (this.field3781 <= this.field3786) {
                var5 = this.field3786 - this.field3781;
            } else {
                var5 = this.field3786 + (this.field3784 - this.field3781);
            }
            if (arg2 > var5) {
                arg2 = var5;
            }
            if (arg2 == 0 && this.field3787 != null) {
                throw new IOException(this.field3787.toString());
            }
            if (this.field3781 + arg2 <= this.field3784) {
                System.arraycopy(this.field3783, this.field3781, arg0, arg1, arg2);
            } else {
                int var6 = this.field3784 - this.field3781;
                System.arraycopy(this.field3783, this.field3781, arg0, arg1, var6);
                System.arraycopy(this.field3783, 0, arg0, arg1 + var6, arg2 - var6);
            }
            this.field3781 = (this.field3781 + arg2) % this.field3784;
            this.notifyAll();
            return arg2;
        }
    }

    @ObfuscatedName("kh.u(S)V")
    public void method5376() {
        synchronized (this) {
            if (this.field3787 == null) {
                this.field3787 = new IOException("");
            }
            this.notifyAll();
        }
        try {
            this.field3788.join();
        } catch (InterruptedException var4) {
        }
    }
}
