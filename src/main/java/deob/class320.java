package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

@ObfuscatedName("lg")
public class class320 implements Runnable {

    @ObfuscatedName("lg.h")
    public Thread field3831;

    @ObfuscatedName("lg.v")
    public InputStream field3827;

    @ObfuscatedName("lg.x")
    public int field3828;

    @ObfuscatedName("lg.w")
    public byte[] field3829;

    @ObfuscatedName("lg.t")
    public int field3830 = 0;

    @ObfuscatedName("lg.j")
    public int field3826 = 0;

    @ObfuscatedName("lg.n")
    public IOException field3832;

    public class320(InputStream arg0, int arg1) {
        this.field3827 = arg0;
        this.field3828 = arg1 + 1;
        this.field3829 = new byte[this.field3828];
        this.field3831 = new Thread(this);
        this.field3831.setDaemon(true);
        this.field3831.start();
    }

    public void run() {
        while (true) {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field3832 != null) {
                        return;
                    }
                    if (this.field3830 == 0) {
                        var2 = this.field3828 - this.field3826 - 1;
                    } else if (this.field3830 <= this.field3826) {
                        var2 = this.field3828 - this.field3826;
                    } else {
                        var2 = this.field3830 - this.field3826 - 1;
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
                var5 = this.field3827.read(this.field3829, this.field3826, var2);
                if (var5 == -1) {
                    throw new EOFException();
                }
            } catch (IOException var14) {
                IOException var6 = var14;
                synchronized (this) {
                    this.field3832 = var6;
                    return;
                }
            }
            synchronized (this) {
                this.field3826 = (this.field3826 + var5) % this.field3828;
            }
        }
    }

    @ObfuscatedName("lg.h(II)Z")
    public boolean method5448(int arg0) throws IOException {
        if (arg0 == 0) {
            return true;
        } else if (arg0 > 0 && arg0 < this.field3828) {
            synchronized (this) {
                int var3;
                if (this.field3830 <= this.field3826) {
                    var3 = this.field3826 - this.field3830;
                } else {
                    var3 = this.field3826 + (this.field3828 - this.field3830);
                }
                if (var3 >= arg0) {
                    return true;
                } else if (this.field3832 == null) {
                    this.notifyAll();
                    return false;
                } else {
                    throw new IOException(this.field3832.toString());
                }
            }
        } else {
            throw new IOException();
        }
    }

    @ObfuscatedName("lg.v(I)I")
    public int method5449() throws IOException {
        synchronized (this) {
            int var2;
            if (this.field3830 <= this.field3826) {
                var2 = this.field3826 - this.field3830;
            } else {
                var2 = this.field3826 + (this.field3828 - this.field3830);
            }
            if (var2 <= 0 && this.field3832 != null) {
                throw new IOException(this.field3832.toString());
            }
            this.notifyAll();
            return var2;
        }
    }

    @ObfuscatedName("lg.x(I)I")
    public int method5459() throws IOException {
        synchronized (this) {
            if (this.field3830 != this.field3826) {
                int var2 = this.field3829[this.field3830] & 0xFF;
                this.field3830 = (this.field3830 + 1) % this.field3828;
                this.notifyAll();
                return var2;
            } else if (this.field3832 == null) {
                return -1;
            } else {
                throw new IOException(this.field3832.toString());
            }
        }
    }

    @ObfuscatedName("lg.w([BIIB)I")
    public int method5451(byte[] arg0, int arg1, int arg2) throws IOException {
        if (arg2 < 0 || arg1 < 0 || arg1 + arg2 > arg0.length) {
            throw new IOException();
        }
        synchronized (this) {
            int var5;
            if (this.field3830 <= this.field3826) {
                var5 = this.field3826 - this.field3830;
            } else {
                var5 = this.field3826 + (this.field3828 - this.field3830);
            }
            if (arg2 > var5) {
                arg2 = var5;
            }
            if (arg2 == 0 && this.field3832 != null) {
                throw new IOException(this.field3832.toString());
            }
            if (this.field3830 + arg2 <= this.field3828) {
                System.arraycopy(this.field3829, this.field3830, arg0, arg1, arg2);
            } else {
                int var6 = this.field3828 - this.field3830;
                System.arraycopy(this.field3829, this.field3830, arg0, arg1, var6);
                System.arraycopy(this.field3829, 0, arg0, arg1 + var6, arg2 - var6);
            }
            this.field3830 = (this.field3830 + arg2) % this.field3828;
            this.notifyAll();
            return arg2;
        }
    }

    @ObfuscatedName("lg.t(S)V")
    public void method5457() {
        synchronized (this) {
            if (this.field3832 == null) {
                this.field3832 = new IOException("");
            }
            this.notifyAll();
        }
        try {
            this.field3831.join();
        } catch (InterruptedException var4) {
        }
    }
}
