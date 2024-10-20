package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

@ObfuscatedName("kk")
public class class310 implements Runnable {

    @ObfuscatedName("kk.c")
    public Thread field3781;

    @ObfuscatedName("kk.t")
    public InputStream field3783;

    @ObfuscatedName("kk.o")
    public int field3785;

    @ObfuscatedName("kk.e")
    public byte[] field3784;

    @ObfuscatedName("kk.i")
    public int field3782 = 0;

    @ObfuscatedName("kk.g")
    public int field3786 = 0;

    @ObfuscatedName("kk.d")
    public IOException field3787;

    public class310(InputStream arg0, int arg1) {
        this.field3783 = arg0;
        this.field3785 = arg1 + 1;
        this.field3784 = new byte[this.field3785];
        this.field3781 = new Thread(this);
        this.field3781.setDaemon(true);
        this.field3781.start();
    }

    public void run() {
        while (true) {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field3787 != null) {
                        return;
                    }
                    if (this.field3782 == 0) {
                        var2 = this.field3785 - this.field3786 - 1;
                    } else if (this.field3782 <= this.field3786) {
                        var2 = this.field3785 - this.field3786;
                    } else {
                        var2 = this.field3782 - this.field3786 - 1;
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
                var5 = this.field3783.read(this.field3784, this.field3786, var2);
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
                this.field3786 = (this.field3786 + var5) % this.field3785;
            }
        }
    }

    @ObfuscatedName("kk.c(IB)Z")
    public boolean method5457(int arg0) throws IOException {
        if (arg0 == 0) {
            return true;
        } else if (arg0 > 0 && arg0 < this.field3785) {
            synchronized (this) {
                int var3;
                if (this.field3782 <= this.field3786) {
                    var3 = this.field3786 - this.field3782;
                } else {
                    var3 = this.field3786 + (this.field3785 - this.field3782);
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

    @ObfuscatedName("kk.t(I)I")
    public int method5449() throws IOException {
        synchronized (this) {
            int var2;
            if (this.field3782 <= this.field3786) {
                var2 = this.field3786 - this.field3782;
            } else {
                var2 = this.field3786 + (this.field3785 - this.field3782);
            }
            if (var2 <= 0 && this.field3787 != null) {
                throw new IOException(this.field3787.toString());
            }
            this.notifyAll();
            return var2;
        }
    }

    @ObfuscatedName("kk.o(B)I")
    public int method5454() throws IOException {
        synchronized (this) {
            if (this.field3786 != this.field3782) {
                int var2 = this.field3784[this.field3782] & 0xFF;
                this.field3782 = (this.field3782 + 1) % this.field3785;
                this.notifyAll();
                return var2;
            } else if (this.field3787 == null) {
                return -1;
            } else {
                throw new IOException(this.field3787.toString());
            }
        }
    }

    @ObfuscatedName("kk.e([BIII)I")
    public int method5461(byte[] arg0, int arg1, int arg2) throws IOException {
        if (arg2 < 0 || arg1 < 0 || arg1 + arg2 > arg0.length) {
            throw new IOException();
        }
        synchronized (this) {
            int var5;
            if (this.field3782 <= this.field3786) {
                var5 = this.field3786 - this.field3782;
            } else {
                var5 = this.field3786 + (this.field3785 - this.field3782);
            }
            if (arg2 > var5) {
                arg2 = var5;
            }
            if (arg2 == 0 && this.field3787 != null) {
                throw new IOException(this.field3787.toString());
            }
            if (this.field3782 + arg2 <= this.field3785) {
                System.arraycopy(this.field3784, this.field3782, arg0, arg1, arg2);
            } else {
                int var6 = this.field3785 - this.field3782;
                System.arraycopy(this.field3784, this.field3782, arg0, arg1, var6);
                System.arraycopy(this.field3784, 0, arg0, arg1 + var6, arg2 - var6);
            }
            this.field3782 = (this.field3782 + arg2) % this.field3785;
            this.notifyAll();
            return arg2;
        }
    }

    @ObfuscatedName("kk.i(I)V")
    public void method5458() {
        synchronized (this) {
            if (this.field3787 == null) {
                this.field3787 = new IOException("");
            }
            this.notifyAll();
        }
        try {
            this.field3781.join();
        } catch (InterruptedException var4) {
        }
    }
}
