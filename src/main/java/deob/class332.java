package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

@ObfuscatedName("lv")
public class class332 implements Runnable {

    @ObfuscatedName("lv.s")
    public Thread field3883;

    @ObfuscatedName("lv.t")
    public InputStream field3880;

    @ObfuscatedName("lv.v")
    public int field3882;

    @ObfuscatedName("lv.j")
    public byte[] field3881;

    @ObfuscatedName("lv.l")
    public int field3884 = 0;

    @ObfuscatedName("lv.n")
    public int field3885 = 0;

    @ObfuscatedName("lv.w")
    public IOException field3886;

    public class332(InputStream arg0, int arg1) {
        this.field3880 = arg0;
        this.field3882 = arg1 + 1;
        this.field3881 = new byte[this.field3882];
        this.field3883 = new Thread(this);
        this.field3883.setDaemon(true);
        this.field3883.start();
    }

    public void run() {
        while (true) {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field3886 != null) {
                        return;
                    }
                    if (this.field3884 == 0) {
                        var2 = this.field3882 - this.field3885 - 1;
                    } else if (this.field3884 <= this.field3885) {
                        var2 = this.field3882 - this.field3885;
                    } else {
                        var2 = this.field3884 - this.field3885 - 1;
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
                var5 = this.field3880.read(this.field3881, this.field3885, var2);
                if (var5 == -1) {
                    throw new EOFException();
                }
            } catch (IOException var14) {
                IOException var6 = var14;
                synchronized (this) {
                    this.field3886 = var6;
                    return;
                }
            }
            synchronized (this) {
                this.field3885 = (this.field3885 + var5) % this.field3882;
            }
        }
    }

    @ObfuscatedName("lv.s(II)Z")
    public boolean method5312(int arg0) throws IOException {
        if (arg0 == 0) {
            return true;
        } else if (arg0 > 0 && arg0 < this.field3882) {
            synchronized (this) {
                int var3;
                if (this.field3884 <= this.field3885) {
                    var3 = this.field3885 - this.field3884;
                } else {
                    var3 = this.field3885 + (this.field3882 - this.field3884);
                }
                if (var3 >= arg0) {
                    return true;
                } else if (this.field3886 == null) {
                    this.notifyAll();
                    return false;
                } else {
                    throw new IOException(this.field3886.toString());
                }
            }
        } else {
            throw new IOException();
        }
    }

    @ObfuscatedName("lv.t(I)I")
    public int method5332() throws IOException {
        synchronized (this) {
            int var2;
            if (this.field3884 <= this.field3885) {
                var2 = this.field3885 - this.field3884;
            } else {
                var2 = this.field3885 + (this.field3882 - this.field3884);
            }
            if (var2 <= 0 && this.field3886 != null) {
                throw new IOException(this.field3886.toString());
            }
            this.notifyAll();
            return var2;
        }
    }

    @ObfuscatedName("lv.v(I)I")
    public int method5310() throws IOException {
        synchronized (this) {
            if (this.field3885 != this.field3884) {
                int var2 = this.field3881[this.field3884] & 0xFF;
                this.field3884 = (this.field3884 + 1) % this.field3882;
                this.notifyAll();
                return var2;
            } else if (this.field3886 == null) {
                return -1;
            } else {
                throw new IOException(this.field3886.toString());
            }
        }
    }

    @ObfuscatedName("lv.j([BIII)I")
    public int method5314(byte[] arg0, int arg1, int arg2) throws IOException {
        if (arg2 < 0 || arg1 < 0 || arg1 + arg2 > arg0.length) {
            throw new IOException();
        }
        synchronized (this) {
            int var5;
            if (this.field3884 <= this.field3885) {
                var5 = this.field3885 - this.field3884;
            } else {
                var5 = this.field3885 + (this.field3882 - this.field3884);
            }
            if (arg2 > var5) {
                arg2 = var5;
            }
            if (arg2 == 0 && this.field3886 != null) {
                throw new IOException(this.field3886.toString());
            }
            if (this.field3884 + arg2 <= this.field3882) {
                System.arraycopy(this.field3881, this.field3884, arg0, arg1, arg2);
            } else {
                int var6 = this.field3882 - this.field3884;
                System.arraycopy(this.field3881, this.field3884, arg0, arg1, var6);
                System.arraycopy(this.field3881, 0, arg0, arg1 + var6, arg2 - var6);
            }
            this.field3884 = (this.field3884 + arg2) % this.field3882;
            this.notifyAll();
            return arg2;
        }
    }

    @ObfuscatedName("lv.l(I)V")
    public void method5317() {
        synchronized (this) {
            if (this.field3886 == null) {
                this.field3886 = new IOException("");
            }
            this.notifyAll();
        }
        try {
            this.field3883.join();
        } catch (InterruptedException var4) {
        }
    }
}
