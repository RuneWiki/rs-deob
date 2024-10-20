package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

@ObfuscatedName("lx")
public class class319 implements Runnable {

    @ObfuscatedName("lx.z")
    public Thread field3819;

    @ObfuscatedName("lx.k")
    public InputStream field3816;

    @ObfuscatedName("lx.s")
    public int field3817;

    @ObfuscatedName("lx.t")
    public byte[] field3818;

    @ObfuscatedName("lx.i")
    public int field3815 = 0;

    @ObfuscatedName("lx.o")
    public int field3820 = 0;

    @ObfuscatedName("lx.x")
    public IOException field3821;

    public class319(InputStream arg0, int arg1) {
        this.field3816 = arg0;
        this.field3817 = arg1 + 1;
        this.field3818 = new byte[this.field3817];
        this.field3819 = new Thread(this);
        this.field3819.setDaemon(true);
        this.field3819.start();
    }

    public void run() {
        while (true) {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field3821 != null) {
                        return;
                    }
                    if (this.field3815 == 0) {
                        var2 = this.field3817 - this.field3820 - 1;
                    } else if (this.field3815 <= this.field3820) {
                        var2 = this.field3817 - this.field3820;
                    } else {
                        var2 = this.field3815 - this.field3820 - 1;
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
                var5 = this.field3816.read(this.field3818, this.field3820, var2);
                if (var5 == -1) {
                    throw new EOFException();
                }
            } catch (IOException var14) {
                IOException var6 = var14;
                synchronized (this) {
                    this.field3821 = var6;
                    return;
                }
            }
            synchronized (this) {
                this.field3820 = (this.field3820 + var5) % this.field3817;
            }
        }
    }

    @ObfuscatedName("lx.z(II)Z")
    public boolean method5537(int arg0) throws IOException {
        if (arg0 == 0) {
            return true;
        } else if (arg0 > 0 && arg0 < this.field3817) {
            synchronized (this) {
                int var3;
                if (this.field3815 <= this.field3820) {
                    var3 = this.field3820 - this.field3815;
                } else {
                    var3 = this.field3820 + (this.field3817 - this.field3815);
                }
                if (var3 >= arg0) {
                    return true;
                } else if (this.field3821 == null) {
                    this.notifyAll();
                    return false;
                } else {
                    throw new IOException(this.field3821.toString());
                }
            }
        } else {
            throw new IOException();
        }
    }

    @ObfuscatedName("lx.k(I)I")
    public int method5536() throws IOException {
        synchronized (this) {
            int var2;
            if (this.field3815 <= this.field3820) {
                var2 = this.field3820 - this.field3815;
            } else {
                var2 = this.field3820 + (this.field3817 - this.field3815);
            }
            if (var2 <= 0 && this.field3821 != null) {
                throw new IOException(this.field3821.toString());
            }
            this.notifyAll();
            return var2;
        }
    }

    @ObfuscatedName("lx.s(I)I")
    public int method5534() throws IOException {
        synchronized (this) {
            if (this.field3820 != this.field3815) {
                int var2 = this.field3818[this.field3815] & 0xFF;
                this.field3815 = (this.field3815 + 1) % this.field3817;
                this.notifyAll();
                return var2;
            } else if (this.field3821 == null) {
                return -1;
            } else {
                throw new IOException(this.field3821.toString());
            }
        }
    }

    @ObfuscatedName("lx.t([BIII)I")
    public int method5538(byte[] arg0, int arg1, int arg2) throws IOException {
        if (arg2 < 0 || arg1 < 0 || arg1 + arg2 > arg0.length) {
            throw new IOException();
        }
        synchronized (this) {
            int var5;
            if (this.field3815 <= this.field3820) {
                var5 = this.field3820 - this.field3815;
            } else {
                var5 = this.field3820 + (this.field3817 - this.field3815);
            }
            if (arg2 > var5) {
                arg2 = var5;
            }
            if (arg2 == 0 && this.field3821 != null) {
                throw new IOException(this.field3821.toString());
            }
            if (this.field3815 + arg2 <= this.field3817) {
                System.arraycopy(this.field3818, this.field3815, arg0, arg1, arg2);
            } else {
                int var6 = this.field3817 - this.field3815;
                System.arraycopy(this.field3818, this.field3815, arg0, arg1, var6);
                System.arraycopy(this.field3818, 0, arg0, arg1 + var6, arg2 - var6);
            }
            this.field3815 = (this.field3815 + arg2) % this.field3817;
            this.notifyAll();
            return arg2;
        }
    }

    @ObfuscatedName("lx.i(I)V")
    public void method5539() {
        synchronized (this) {
            if (this.field3821 == null) {
                this.field3821 = new IOException("");
            }
            this.notifyAll();
        }
        try {
            this.field3819.join();
        } catch (InterruptedException var4) {
        }
    }
}
