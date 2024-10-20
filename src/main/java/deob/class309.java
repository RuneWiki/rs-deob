package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

@ObfuscatedName("kt")
public class class309 implements Runnable {

    @ObfuscatedName("kt.u")
    public Thread field3787;

    @ObfuscatedName("kt.f")
    public InputStream field3789;

    @ObfuscatedName("kt.b")
    public int field3786;

    @ObfuscatedName("kt.g")
    public byte[] field3788;

    @ObfuscatedName("kt.z")
    public int field3791 = 0;

    @ObfuscatedName("kt.p")
    public int field3790 = 0;

    @ObfuscatedName("kt.h")
    public IOException field3785;

    public class309(InputStream arg0, int arg1) {
        this.field3789 = arg0;
        this.field3786 = arg1 + 1;
        this.field3788 = new byte[this.field3786];
        this.field3787 = new Thread(this);
        this.field3787.setDaemon(true);
        this.field3787.start();
    }

    public void run() {
        while (true) {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field3785 != null) {
                        return;
                    }
                    if (this.field3791 == 0) {
                        var2 = this.field3786 - this.field3790 - 1;
                    } else if (this.field3791 <= this.field3790) {
                        var2 = this.field3786 - this.field3790;
                    } else {
                        var2 = this.field3791 - this.field3790 - 1;
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
                var5 = this.field3789.read(this.field3788, this.field3790, var2);
                if (var5 == -1) {
                    throw new EOFException();
                }
            } catch (IOException var14) {
                IOException var6 = var14;
                synchronized (this) {
                    this.field3785 = var6;
                    return;
                }
            }
            synchronized (this) {
                this.field3790 = (this.field3790 + var5) % this.field3786;
            }
        }
    }

    @ObfuscatedName("kt.u(IB)Z")
    public boolean method5470(int arg0) throws IOException {
        if (arg0 == 0) {
            return true;
        } else if (arg0 > 0 && arg0 < this.field3786) {
            synchronized (this) {
                int var3;
                if (this.field3791 <= this.field3790) {
                    var3 = this.field3790 - this.field3791;
                } else {
                    var3 = this.field3790 + (this.field3786 - this.field3791);
                }
                if (var3 >= arg0) {
                    return true;
                } else if (this.field3785 == null) {
                    this.notifyAll();
                    return false;
                } else {
                    throw new IOException(this.field3785.toString());
                }
            }
        } else {
            throw new IOException();
        }
    }

    @ObfuscatedName("kt.f(B)I")
    public int method5472() throws IOException {
        synchronized (this) {
            int var2;
            if (this.field3791 <= this.field3790) {
                var2 = this.field3790 - this.field3791;
            } else {
                var2 = this.field3790 + (this.field3786 - this.field3791);
            }
            if (var2 <= 0 && this.field3785 != null) {
                throw new IOException(this.field3785.toString());
            }
            this.notifyAll();
            return var2;
        }
    }

    @ObfuscatedName("kt.b(I)I")
    public int method5473() throws IOException {
        synchronized (this) {
            if (this.field3791 != this.field3790) {
                int var2 = this.field3788[this.field3791] & 0xFF;
                this.field3791 = (this.field3791 + 1) % this.field3786;
                this.notifyAll();
                return var2;
            } else if (this.field3785 == null) {
                return -1;
            } else {
                throw new IOException(this.field3785.toString());
            }
        }
    }

    @ObfuscatedName("kt.g([BIII)I")
    public int method5474(byte[] arg0, int arg1, int arg2) throws IOException {
        if (arg2 < 0 || arg1 < 0 || arg1 + arg2 > arg0.length) {
            throw new IOException();
        }
        synchronized (this) {
            int var5;
            if (this.field3791 <= this.field3790) {
                var5 = this.field3790 - this.field3791;
            } else {
                var5 = this.field3790 + (this.field3786 - this.field3791);
            }
            if (arg2 > var5) {
                arg2 = var5;
            }
            if (arg2 == 0 && this.field3785 != null) {
                throw new IOException(this.field3785.toString());
            }
            if (this.field3791 + arg2 <= this.field3786) {
                System.arraycopy(this.field3788, this.field3791, arg0, arg1, arg2);
            } else {
                int var6 = this.field3786 - this.field3791;
                System.arraycopy(this.field3788, this.field3791, arg0, arg1, var6);
                System.arraycopy(this.field3788, 0, arg0, arg1 + var6, arg2 - var6);
            }
            this.field3791 = (this.field3791 + arg2) % this.field3786;
            this.notifyAll();
            return arg2;
        }
    }

    @ObfuscatedName("kt.z(B)V")
    public void method5475() {
        synchronized (this) {
            if (this.field3785 == null) {
                this.field3785 = new IOException("");
            }
            this.notifyAll();
        }
        try {
            this.field3787.join();
        } catch (InterruptedException var4) {
        }
    }
}
