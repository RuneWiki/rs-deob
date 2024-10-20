package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

@ObfuscatedName("nw")
public class class379 implements Runnable {

    @ObfuscatedName("nw.c")
    public Thread field4339;

    @ObfuscatedName("nw.v")
    public InputStream field4340;

    @ObfuscatedName("nw.q")
    public int field4341;

    @ObfuscatedName("nw.f")
    public byte[] field4346;

    @ObfuscatedName("nw.j")
    public int field4342 = 0;

    @ObfuscatedName("nw.e")
    public int field4344 = 0;

    @ObfuscatedName("nw.g")
    public IOException field4345;

    public class379(InputStream arg0, int arg1) {
        this.field4340 = arg0;
        this.field4341 = arg1 + 1;
        this.field4346 = new byte[this.field4341];
        this.field4339 = new Thread(this);
        this.field4339.setDaemon(true);
        this.field4339.start();
    }

    public void run() {
        while (true) {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field4345 != null) {
                        return;
                    }
                    if (this.field4342 == 0) {
                        var2 = this.field4341 - this.field4344 - 1;
                    } else if (this.field4342 <= this.field4344) {
                        var2 = this.field4341 - this.field4344;
                    } else {
                        var2 = this.field4342 - this.field4344 - 1;
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
                var5 = this.field4340.read(this.field4346, this.field4344, var2);
                if (var5 == -1) {
                    throw new EOFException();
                }
            } catch (IOException var14) {
                IOException var6 = var14;
                synchronized (this) {
                    this.field4345 = var6;
                    return;
                }
            }
            synchronized (this) {
                this.field4344 = (this.field4344 + var5) % this.field4341;
            }
        }
    }

    @ObfuscatedName("nw.c(II)Z")
    public boolean method6234(int arg0) throws IOException {
        if (arg0 == 0) {
            return true;
        } else if (arg0 > 0 && arg0 < this.field4341) {
            synchronized (this) {
                int var3;
                if (this.field4342 <= this.field4344) {
                    var3 = this.field4344 - this.field4342;
                } else {
                    var3 = this.field4344 + (this.field4341 - this.field4342);
                }
                if (var3 >= arg0) {
                    return true;
                } else if (this.field4345 == null) {
                    this.notifyAll();
                    return false;
                } else {
                    throw new IOException(this.field4345.toString());
                }
            }
        } else {
            throw new IOException();
        }
    }

    @ObfuscatedName("nw.v(B)I")
    public int method6227() throws IOException {
        synchronized (this) {
            int var2;
            if (this.field4342 <= this.field4344) {
                var2 = this.field4344 - this.field4342;
            } else {
                var2 = this.field4344 + (this.field4341 - this.field4342);
            }
            if (var2 <= 0 && this.field4345 != null) {
                throw new IOException(this.field4345.toString());
            }
            this.notifyAll();
            return var2;
        }
    }

    @ObfuscatedName("nw.q(I)I")
    public int method6228() throws IOException {
        synchronized (this) {
            if (this.field4344 != this.field4342) {
                int var2 = this.field4346[this.field4342] & 0xFF;
                this.field4342 = (this.field4342 + 1) % this.field4341;
                this.notifyAll();
                return var2;
            } else if (this.field4345 == null) {
                return -1;
            } else {
                throw new IOException(this.field4345.toString());
            }
        }
    }

    @ObfuscatedName("nw.f([BIIB)I")
    public int method6229(byte[] arg0, int arg1, int arg2) throws IOException {
        if (arg2 < 0 || arg1 < 0 || arg1 + arg2 > arg0.length) {
            throw new IOException();
        }
        synchronized (this) {
            int var5;
            if (this.field4342 <= this.field4344) {
                var5 = this.field4344 - this.field4342;
            } else {
                var5 = this.field4344 + (this.field4341 - this.field4342);
            }
            if (arg2 > var5) {
                arg2 = var5;
            }
            if (arg2 == 0 && this.field4345 != null) {
                throw new IOException(this.field4345.toString());
            }
            if (this.field4342 + arg2 <= this.field4341) {
                System.arraycopy(this.field4346, this.field4342, arg0, arg1, arg2);
            } else {
                int var6 = this.field4341 - this.field4342;
                System.arraycopy(this.field4346, this.field4342, arg0, arg1, var6);
                System.arraycopy(this.field4346, 0, arg0, arg1 + var6, arg2 - var6);
            }
            this.field4342 = (this.field4342 + arg2) % this.field4341;
            this.notifyAll();
            return arg2;
        }
    }

    @ObfuscatedName("nw.j(B)V")
    public void method6230() {
        synchronized (this) {
            if (this.field4345 == null) {
                this.field4345 = new IOException("");
            }
            this.notifyAll();
        }
        try {
            this.field4339.join();
        } catch (InterruptedException var4) {
        }
    }
}
