package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

@ObfuscatedName("lx")
public class class332 implements Runnable {

    @ObfuscatedName("lx.f")
    public Thread field3863;

    @ObfuscatedName("lx.e")
    public InputStream field3866;

    @ObfuscatedName("lx.v")
    public int field3864;

    @ObfuscatedName("lx.y")
    public byte[] field3865;

    @ObfuscatedName("lx.j")
    public int field3862 = 0;

    @ObfuscatedName("lx.o")
    public int field3867 = 0;

    @ObfuscatedName("lx.m")
    public IOException field3868;

    public class332(InputStream arg0, int arg1) {
        this.field3866 = arg0;
        this.field3864 = arg1 + 1;
        this.field3865 = new byte[this.field3864];
        this.field3863 = new Thread(this);
        this.field3863.setDaemon(true);
        this.field3863.start();
    }

    public void run() {
        while (true) {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field3868 != null) {
                        return;
                    }
                    if (this.field3862 == 0) {
                        var2 = this.field3864 - this.field3867 - 1;
                    } else if (this.field3862 <= this.field3867) {
                        var2 = this.field3864 - this.field3867;
                    } else {
                        var2 = this.field3862 - this.field3867 - 1;
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
                var5 = this.field3866.read(this.field3865, this.field3867, var2);
                if (var5 == -1) {
                    throw new EOFException();
                }
            } catch (IOException var14) {
                IOException var6 = var14;
                synchronized (this) {
                    this.field3868 = var6;
                    return;
                }
            }
            synchronized (this) {
                this.field3867 = (this.field3867 + var5) % this.field3864;
            }
        }
    }

    @ObfuscatedName("lx.f(II)Z")
    public boolean method5289(int arg0) throws IOException {
        if (arg0 == 0) {
            return true;
        } else if (arg0 > 0 && arg0 < this.field3864) {
            synchronized (this) {
                int var3;
                if (this.field3862 <= this.field3867) {
                    var3 = this.field3867 - this.field3862;
                } else {
                    var3 = this.field3867 + (this.field3864 - this.field3862);
                }
                if (var3 >= arg0) {
                    return true;
                } else if (this.field3868 == null) {
                    this.notifyAll();
                    return false;
                } else {
                    throw new IOException(this.field3868.toString());
                }
            }
        } else {
            throw new IOException();
        }
    }

    @ObfuscatedName("lx.e(I)I")
    public int method5290() throws IOException {
        synchronized (this) {
            int var2;
            if (this.field3862 <= this.field3867) {
                var2 = this.field3867 - this.field3862;
            } else {
                var2 = this.field3867 + (this.field3864 - this.field3862);
            }
            if (var2 <= 0 && this.field3868 != null) {
                throw new IOException(this.field3868.toString());
            }
            this.notifyAll();
            return var2;
        }
    }

    @ObfuscatedName("lx.v(B)I")
    public int method5291() throws IOException {
        synchronized (this) {
            if (this.field3867 != this.field3862) {
                int var2 = this.field3865[this.field3862] & 0xFF;
                this.field3862 = (this.field3862 + 1) % this.field3864;
                this.notifyAll();
                return var2;
            } else if (this.field3868 == null) {
                return -1;
            } else {
                throw new IOException(this.field3868.toString());
            }
        }
    }

    @ObfuscatedName("lx.y([BIII)I")
    public int method5302(byte[] arg0, int arg1, int arg2) throws IOException {
        if (arg2 < 0 || arg1 < 0 || arg1 + arg2 > arg0.length) {
            throw new IOException();
        }
        synchronized (this) {
            int var5;
            if (this.field3862 <= this.field3867) {
                var5 = this.field3867 - this.field3862;
            } else {
                var5 = this.field3867 + (this.field3864 - this.field3862);
            }
            if (arg2 > var5) {
                arg2 = var5;
            }
            if (arg2 == 0 && this.field3868 != null) {
                throw new IOException(this.field3868.toString());
            }
            if (this.field3862 + arg2 <= this.field3864) {
                System.arraycopy(this.field3865, this.field3862, arg0, arg1, arg2);
            } else {
                int var6 = this.field3864 - this.field3862;
                System.arraycopy(this.field3865, this.field3862, arg0, arg1, var6);
                System.arraycopy(this.field3865, 0, arg0, arg1 + var6, arg2 - var6);
            }
            this.field3862 = (this.field3862 + arg2) % this.field3864;
            this.notifyAll();
            return arg2;
        }
    }

    @ObfuscatedName("lx.j(B)V")
    public void method5306() {
        synchronized (this) {
            if (this.field3868 == null) {
                this.field3868 = new IOException("");
            }
            this.notifyAll();
        }
        try {
            this.field3863.join();
        } catch (InterruptedException var4) {
        }
    }
}
