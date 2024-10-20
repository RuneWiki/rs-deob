package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

@ObfuscatedName("ks")
public class class310 implements Runnable {

    @ObfuscatedName("ks.q")
    public Thread field3814;

    @ObfuscatedName("ks.w")
    public InputStream field3809;

    @ObfuscatedName("ks.e")
    public int field3815;

    @ObfuscatedName("ks.p")
    public byte[] field3811;

    @ObfuscatedName("ks.k")
    public int field3812 = 0;

    @ObfuscatedName("ks.l")
    public int field3813 = 0;

    @ObfuscatedName("ks.b")
    public IOException field3810;

    public class310(InputStream arg0, int arg1) {
        this.field3809 = arg0;
        this.field3815 = arg1 + 1;
        this.field3811 = new byte[this.field3815];
        this.field3814 = new Thread(this);
        this.field3814.setDaemon(true);
        this.field3814.start();
    }

    public void run() {
        while (true) {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field3810 != null) {
                        return;
                    }
                    if (this.field3812 == 0) {
                        var2 = this.field3815 - this.field3813 - 1;
                    } else if (this.field3812 <= this.field3813) {
                        var2 = this.field3815 - this.field3813;
                    } else {
                        var2 = this.field3812 - this.field3813 - 1;
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
                var5 = this.field3809.read(this.field3811, this.field3813, var2);
                if (var5 == -1) {
                    throw new EOFException();
                }
            } catch (IOException var14) {
                IOException var6 = var14;
                synchronized (this) {
                    this.field3810 = var6;
                    return;
                }
            }
            synchronized (this) {
                this.field3813 = (this.field3813 + var5) % this.field3815;
            }
        }
    }

    @ObfuscatedName("ks.q(II)Z")
    public boolean method5403(int arg0) throws IOException {
        if (arg0 == 0) {
            return true;
        } else if (arg0 > 0 && arg0 < this.field3815) {
            synchronized (this) {
                int var3;
                if (this.field3812 <= this.field3813) {
                    var3 = this.field3813 - this.field3812;
                } else {
                    var3 = this.field3813 + (this.field3815 - this.field3812);
                }
                if (var3 >= arg0) {
                    return true;
                } else if (this.field3810 == null) {
                    this.notifyAll();
                    return false;
                } else {
                    throw new IOException(this.field3810.toString());
                }
            }
        } else {
            throw new IOException();
        }
    }

    @ObfuscatedName("ks.w(I)I")
    public int method5406() throws IOException {
        synchronized (this) {
            int var2;
            if (this.field3812 <= this.field3813) {
                var2 = this.field3813 - this.field3812;
            } else {
                var2 = this.field3813 + (this.field3815 - this.field3812);
            }
            if (var2 <= 0 && this.field3810 != null) {
                throw new IOException(this.field3810.toString());
            }
            this.notifyAll();
            return var2;
        }
    }

    @ObfuscatedName("ks.e(I)I")
    public int method5405() throws IOException {
        synchronized (this) {
            if (this.field3813 != this.field3812) {
                int var2 = this.field3811[this.field3812] & 0xFF;
                this.field3812 = (this.field3812 + 1) % this.field3815;
                this.notifyAll();
                return var2;
            } else if (this.field3810 == null) {
                return -1;
            } else {
                throw new IOException(this.field3810.toString());
            }
        }
    }

    @ObfuscatedName("ks.p([BIIS)I")
    public int method5408(byte[] arg0, int arg1, int arg2) throws IOException {
        if (arg2 < 0 || arg1 < 0 || arg1 + arg2 > arg0.length) {
            throw new IOException();
        }
        synchronized (this) {
            int var5;
            if (this.field3812 <= this.field3813) {
                var5 = this.field3813 - this.field3812;
            } else {
                var5 = this.field3813 + (this.field3815 - this.field3812);
            }
            if (arg2 > var5) {
                arg2 = var5;
            }
            if (arg2 == 0 && this.field3810 != null) {
                throw new IOException(this.field3810.toString());
            }
            if (this.field3812 + arg2 <= this.field3815) {
                System.arraycopy(this.field3811, this.field3812, arg0, arg1, arg2);
            } else {
                int var6 = this.field3815 - this.field3812;
                System.arraycopy(this.field3811, this.field3812, arg0, arg1, var6);
                System.arraycopy(this.field3811, 0, arg0, arg1 + var6, arg2 - var6);
            }
            this.field3812 = (this.field3812 + arg2) % this.field3815;
            this.notifyAll();
            return arg2;
        }
    }

    @ObfuscatedName("ks.k(I)V")
    public void method5419() {
        synchronized (this) {
            if (this.field3810 == null) {
                this.field3810 = new IOException("");
            }
            this.notifyAll();
        }
        try {
            this.field3814.join();
        } catch (InterruptedException var4) {
        }
    }
}
