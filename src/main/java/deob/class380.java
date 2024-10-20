package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

@ObfuscatedName("nj")
public class class380 implements Runnable {

    @ObfuscatedName("nj.s")
    public Thread field4345;

    @ObfuscatedName("nj.h")
    public InputStream field4337;

    @ObfuscatedName("nj.w")
    public int field4339;

    @ObfuscatedName("nj.v")
    public byte[] field4340;

    @ObfuscatedName("nj.c")
    public int field4341 = 0;

    @ObfuscatedName("nj.q")
    public int field4342 = 0;

    @ObfuscatedName("nj.i")
    public IOException field4343;

    public class380(InputStream arg0, int arg1) {
        this.field4337 = arg0;
        this.field4339 = arg1 + 1;
        this.field4340 = new byte[this.field4339];
        this.field4345 = new Thread(this);
        this.field4345.setDaemon(true);
        this.field4345.start();
    }

    public void run() {
        while (true) {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field4343 != null) {
                        return;
                    }
                    if (this.field4341 == 0) {
                        var2 = this.field4339 - this.field4342 - 1;
                    } else if (this.field4341 <= this.field4342) {
                        var2 = this.field4339 - this.field4342;
                    } else {
                        var2 = this.field4341 - this.field4342 - 1;
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
                var5 = this.field4337.read(this.field4340, this.field4342, var2);
                if (var5 == -1) {
                    throw new EOFException();
                }
            } catch (IOException var14) {
                IOException var6 = var14;
                synchronized (this) {
                    this.field4343 = var6;
                    return;
                }
            }
            synchronized (this) {
                this.field4342 = (this.field4342 + var5) % this.field4339;
            }
        }
    }

    @ObfuscatedName("nj.s(II)Z")
    public boolean method6132(int arg0) throws IOException {
        if (arg0 == 0) {
            return true;
        } else if (arg0 > 0 && arg0 < this.field4339) {
            synchronized (this) {
                int var3;
                if (this.field4341 <= this.field4342) {
                    var3 = this.field4342 - this.field4341;
                } else {
                    var3 = this.field4342 + (this.field4339 - this.field4341);
                }
                if (var3 >= arg0) {
                    return true;
                } else if (this.field4343 == null) {
                    this.notifyAll();
                    return false;
                } else {
                    throw new IOException(this.field4343.toString());
                }
            }
        } else {
            throw new IOException();
        }
    }

    @ObfuscatedName("nj.h(I)I")
    public int method6133() throws IOException {
        synchronized (this) {
            int var2;
            if (this.field4341 <= this.field4342) {
                var2 = this.field4342 - this.field4341;
            } else {
                var2 = this.field4342 + (this.field4339 - this.field4341);
            }
            if (var2 <= 0 && this.field4343 != null) {
                throw new IOException(this.field4343.toString());
            }
            this.notifyAll();
            return var2;
        }
    }

    @ObfuscatedName("nj.w(B)I")
    public int method6134() throws IOException {
        synchronized (this) {
            if (this.field4342 != this.field4341) {
                int var2 = this.field4340[this.field4341] & 0xFF;
                this.field4341 = (this.field4341 + 1) % this.field4339;
                this.notifyAll();
                return var2;
            } else if (this.field4343 == null) {
                return -1;
            } else {
                throw new IOException(this.field4343.toString());
            }
        }
    }

    @ObfuscatedName("nj.v([BIII)I")
    public int method6141(byte[] arg0, int arg1, int arg2) throws IOException {
        if (arg2 < 0 || arg1 < 0 || arg1 + arg2 > arg0.length) {
            throw new IOException();
        }
        synchronized (this) {
            int var5;
            if (this.field4341 <= this.field4342) {
                var5 = this.field4342 - this.field4341;
            } else {
                var5 = this.field4342 + (this.field4339 - this.field4341);
            }
            if (arg2 > var5) {
                arg2 = var5;
            }
            if (arg2 == 0 && this.field4343 != null) {
                throw new IOException(this.field4343.toString());
            }
            if (this.field4341 + arg2 <= this.field4339) {
                System.arraycopy(this.field4340, this.field4341, arg0, arg1, arg2);
            } else {
                int var6 = this.field4339 - this.field4341;
                System.arraycopy(this.field4340, this.field4341, arg0, arg1, var6);
                System.arraycopy(this.field4340, 0, arg0, arg1 + var6, arg2 - var6);
            }
            this.field4341 = (this.field4341 + arg2) % this.field4339;
            this.notifyAll();
            return arg2;
        }
    }

    @ObfuscatedName("nj.c(S)V")
    public void method6136() {
        synchronized (this) {
            if (this.field4343 == null) {
                this.field4343 = new IOException("");
            }
            this.notifyAll();
        }
        try {
            this.field4345.join();
        } catch (InterruptedException var4) {
        }
    }
}
