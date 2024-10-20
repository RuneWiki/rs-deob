package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

@ObfuscatedName("mr")
public class class358 implements Runnable {

    @ObfuscatedName("mr.c")
    public Thread field4134;

    @ObfuscatedName("mr.b")
    public InputStream field4135;

    @ObfuscatedName("mr.p")
    public int field4136;

    @ObfuscatedName("mr.m")
    public byte[] field4143;

    @ObfuscatedName("mr.t")
    public int field4138 = 0;

    @ObfuscatedName("mr.s")
    public int field4139 = 0;

    @ObfuscatedName("mr.j")
    public IOException field4140;

    public class358(InputStream arg0, int arg1) {
        this.field4135 = arg0;
        this.field4136 = arg1 + 1;
        this.field4143 = new byte[this.field4136];
        this.field4134 = new Thread(this);
        this.field4134.setDaemon(true);
        this.field4134.start();
    }

    public void run() {
        while (true) {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field4140 != null) {
                        return;
                    }
                    if (this.field4138 == 0) {
                        var2 = this.field4136 - this.field4139 - 1;
                    } else if (this.field4138 <= this.field4139) {
                        var2 = this.field4136 - this.field4139;
                    } else {
                        var2 = this.field4138 - this.field4139 - 1;
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
                var5 = this.field4135.read(this.field4143, this.field4139, var2);
                if (var5 == -1) {
                    throw new EOFException();
                }
            } catch (IOException var14) {
                IOException var6 = var14;
                synchronized (this) {
                    this.field4140 = var6;
                    return;
                }
            }
            synchronized (this) {
                this.field4139 = (this.field4139 + var5) % this.field4136;
            }
        }
    }

    @ObfuscatedName("mr.c(II)Z")
    public boolean method5874(int arg0) throws IOException {
        if (arg0 == 0) {
            return true;
        } else if (arg0 > 0 && arg0 < this.field4136) {
            synchronized (this) {
                int var3;
                if (this.field4138 <= this.field4139) {
                    var3 = this.field4139 - this.field4138;
                } else {
                    var3 = this.field4139 + (this.field4136 - this.field4138);
                }
                if (var3 >= arg0) {
                    return true;
                } else if (this.field4140 == null) {
                    this.notifyAll();
                    return false;
                } else {
                    throw new IOException(this.field4140.toString());
                }
            }
        } else {
            throw new IOException();
        }
    }

    @ObfuscatedName("mr.b(I)I")
    public int method5875() throws IOException {
        synchronized (this) {
            int var2;
            if (this.field4138 <= this.field4139) {
                var2 = this.field4139 - this.field4138;
            } else {
                var2 = this.field4139 + (this.field4136 - this.field4138);
            }
            if (var2 <= 0 && this.field4140 != null) {
                throw new IOException(this.field4140.toString());
            }
            this.notifyAll();
            return var2;
        }
    }

    @ObfuscatedName("mr.p(B)I")
    public int method5876() throws IOException {
        synchronized (this) {
            if (this.field4139 != this.field4138) {
                int var2 = this.field4143[this.field4138] & 0xFF;
                this.field4138 = (this.field4138 + 1) % this.field4136;
                this.notifyAll();
                return var2;
            } else if (this.field4140 == null) {
                return -1;
            } else {
                throw new IOException(this.field4140.toString());
            }
        }
    }

    @ObfuscatedName("mr.m([BIIB)I")
    public int method5877(byte[] arg0, int arg1, int arg2) throws IOException {
        if (arg2 < 0 || arg1 < 0 || arg1 + arg2 > arg0.length) {
            throw new IOException();
        }
        synchronized (this) {
            int var5;
            if (this.field4138 <= this.field4139) {
                var5 = this.field4139 - this.field4138;
            } else {
                var5 = this.field4139 + (this.field4136 - this.field4138);
            }
            if (arg2 > var5) {
                arg2 = var5;
            }
            if (arg2 == 0 && this.field4140 != null) {
                throw new IOException(this.field4140.toString());
            }
            if (this.field4138 + arg2 <= this.field4136) {
                System.arraycopy(this.field4143, this.field4138, arg0, arg1, arg2);
            } else {
                int var6 = this.field4136 - this.field4138;
                System.arraycopy(this.field4143, this.field4138, arg0, arg1, var6);
                System.arraycopy(this.field4143, 0, arg0, arg1 + var6, arg2 - var6);
            }
            this.field4138 = (this.field4138 + arg2) % this.field4136;
            this.notifyAll();
            return arg2;
        }
    }

    @ObfuscatedName("mr.t(I)V")
    public void method5878() {
        synchronized (this) {
            if (this.field4140 == null) {
                this.field4140 = new IOException("");
            }
            this.notifyAll();
        }
        try {
            this.field4134.join();
        } catch (InterruptedException var4) {
        }
    }
}
