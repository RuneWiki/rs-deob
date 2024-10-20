package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

@ObfuscatedName("ol")
public class class402 implements Runnable {

    @ObfuscatedName("ol.h")
    public Thread field4560;

    @ObfuscatedName("ol.e")
    public InputStream field4557;

    @ObfuscatedName("ol.v")
    public int field4558;

    @ObfuscatedName("ol.x")
    public byte[] field4559;

    @ObfuscatedName("ol.m")
    public int field4556 = 0;

    @ObfuscatedName("ol.q")
    public int field4562 = 0;

    @ObfuscatedName("ol.f")
    public IOException field4561;

    public class402(InputStream arg0, int arg1) {
        this.field4557 = arg0;
        this.field4558 = arg1 + 1;
        this.field4559 = new byte[this.field4558];
        this.field4560 = new Thread(this);
        this.field4560.setDaemon(true);
        this.field4560.start();
    }

    public void run() {
        while (true) {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field4561 != null) {
                        return;
                    }
                    if (this.field4556 == 0) {
                        var2 = this.field4558 - this.field4562 - 1;
                    } else if (this.field4556 <= this.field4562) {
                        var2 = this.field4558 - this.field4562;
                    } else {
                        var2 = this.field4556 - this.field4562 - 1;
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
                var5 = this.field4557.read(this.field4559, this.field4562, var2);
                if (var5 == -1) {
                    throw new EOFException();
                }
            } catch (IOException var14) {
                IOException var6 = var14;
                synchronized (this) {
                    this.field4561 = var6;
                    return;
                }
            }
            synchronized (this) {
                this.field4562 = (this.field4562 + var5) % this.field4558;
            }
        }
    }

    @ObfuscatedName("ol.h(IB)Z")
    public boolean method6964(int arg0) throws IOException {
        if (arg0 == 0) {
            return true;
        } else if (arg0 > 0 && arg0 < this.field4558) {
            synchronized (this) {
                int var3;
                if (this.field4556 <= this.field4562) {
                    var3 = this.field4562 - this.field4556;
                } else {
                    var3 = this.field4562 + (this.field4558 - this.field4556);
                }
                if (var3 >= arg0) {
                    return true;
                } else if (this.field4561 == null) {
                    this.notifyAll();
                    return false;
                } else {
                    throw new IOException(this.field4561.toString());
                }
            }
        } else {
            throw new IOException();
        }
    }

    @ObfuscatedName("ol.e(B)I")
    public int method6967() throws IOException {
        synchronized (this) {
            int var2;
            if (this.field4556 <= this.field4562) {
                var2 = this.field4562 - this.field4556;
            } else {
                var2 = this.field4562 + (this.field4558 - this.field4556);
            }
            if (var2 <= 0 && this.field4561 != null) {
                throw new IOException(this.field4561.toString());
            }
            this.notifyAll();
            return var2;
        }
    }

    @ObfuscatedName("ol.v(I)I")
    public int method6966() throws IOException {
        synchronized (this) {
            if (this.field4562 != this.field4556) {
                int var2 = this.field4559[this.field4556] & 0xFF;
                this.field4556 = (this.field4556 + 1) % this.field4558;
                this.notifyAll();
                return var2;
            } else if (this.field4561 == null) {
                return -1;
            } else {
                throw new IOException(this.field4561.toString());
            }
        }
    }

    @ObfuscatedName("ol.x([BIII)I")
    public int method6976(byte[] arg0, int arg1, int arg2) throws IOException {
        if (arg2 < 0 || arg1 < 0 || arg1 + arg2 > arg0.length) {
            throw new IOException();
        }
        synchronized (this) {
            int var5;
            if (this.field4556 <= this.field4562) {
                var5 = this.field4562 - this.field4556;
            } else {
                var5 = this.field4562 + (this.field4558 - this.field4556);
            }
            if (arg2 > var5) {
                arg2 = var5;
            }
            if (arg2 == 0 && this.field4561 != null) {
                throw new IOException(this.field4561.toString());
            }
            if (this.field4556 + arg2 <= this.field4558) {
                System.arraycopy(this.field4559, this.field4556, arg0, arg1, arg2);
            } else {
                int var6 = this.field4558 - this.field4556;
                System.arraycopy(this.field4559, this.field4556, arg0, arg1, var6);
                System.arraycopy(this.field4559, 0, arg0, arg1 + var6, arg2 - var6);
            }
            this.field4556 = (this.field4556 + arg2) % this.field4558;
            this.notifyAll();
            return arg2;
        }
    }

    @ObfuscatedName("ol.m(I)V")
    public void method6968() {
        synchronized (this) {
            if (this.field4561 == null) {
                this.field4561 = new IOException("");
            }
            this.notifyAll();
        }
        try {
            this.field4560.join();
        } catch (InterruptedException var4) {
        }
    }
}
