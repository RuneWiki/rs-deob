package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

@ObfuscatedName("ei")
public class class153 implements Runnable {

    @ObfuscatedName("ei.s")
    public Thread field2218;

    @ObfuscatedName("ei.c")
    public InputStream field2217;

    @ObfuscatedName("ei.f")
    public int field2222;

    @ObfuscatedName("ei.m")
    public byte[] field2224;

    @ObfuscatedName("ei.h")
    public int field2219 = 0;

    @ObfuscatedName("ei.t")
    public int field2221 = 0;

    @ObfuscatedName("ei.p")
    public IOException field2220;

    public class153(InputStream arg0, int arg1) {
        this.field2217 = arg0;
        this.field2222 = arg1 + 1;
        this.field2224 = new byte[this.field2222];
        this.field2218 = new Thread(this);
        this.field2218.setDaemon(true);
        this.field2218.start();
    }

    public void run() {
        while (true) {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field2220 != null) {
                        return;
                    }
                    if (this.field2219 == 0) {
                        var2 = this.field2222 - this.field2221 - 1;
                    } else if (this.field2219 <= this.field2221) {
                        var2 = this.field2222 - this.field2221;
                    } else {
                        var2 = this.field2219 - this.field2221 - 1;
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
                var5 = this.field2217.read(this.field2224, this.field2221, var2);
                if (var5 == -1) {
                    throw new EOFException();
                }
            } catch (IOException var14) {
                IOException var6 = var14;
                synchronized (this) {
                    this.field2220 = var6;
                    return;
                }
            }
            synchronized (this) {
                this.field2221 = (this.field2221 + var5) % this.field2222;
            }
        }
    }

    @ObfuscatedName("ei.s(IB)Z")
    public boolean method2736(int arg0) throws IOException {
        if (arg0 <= 0 || arg0 >= this.field2222) {
            throw new IOException();
        }
        synchronized (this) {
            int var3;
            if (this.field2219 <= this.field2221) {
                var3 = this.field2221 - this.field2219;
            } else {
                var3 = this.field2221 + (this.field2222 - this.field2219);
            }
            if (var3 >= arg0) {
                return true;
            } else if (this.field2220 == null) {
                this.notifyAll();
                return false;
            } else {
                throw new IOException(this.field2220.toString());
            }
        }
    }

    @ObfuscatedName("ei.c(I)I")
    public int method2737() throws IOException {
        synchronized (this) {
            int var2;
            if (this.field2219 <= this.field2221) {
                var2 = this.field2221 - this.field2219;
            } else {
                var2 = this.field2221 + (this.field2222 - this.field2219);
            }
            if (this.field2220 != null) {
                throw new IOException(this.field2220.toString());
            }
            this.notifyAll();
            return var2;
        }
    }

    @ObfuscatedName("ei.f(I)I")
    public int method2727() throws IOException {
        synchronized (this) {
            if (this.field2221 != this.field2219) {
                int var2 = this.field2224[this.field2219] & 0xFF;
                this.field2219 = (this.field2219 + 1) % this.field2222;
                this.notifyAll();
                return var2;
            } else if (this.field2220 == null) {
                return -1;
            } else {
                throw new IOException(this.field2220.toString());
            }
        }
    }

    @ObfuscatedName("ei.m([BIII)I")
    public int method2719(byte[] arg0, int arg1, int arg2) throws IOException {
        if (arg2 < 0 || arg1 < 0 || arg1 + arg2 > arg0.length) {
            throw new IOException();
        }
        synchronized (this) {
            int var5;
            if (this.field2219 <= this.field2221) {
                var5 = this.field2221 - this.field2219;
            } else {
                var5 = this.field2221 + (this.field2222 - this.field2219);
            }
            if (arg2 > var5) {
                arg2 = var5;
            }
            if (arg2 == 0 && this.field2220 != null) {
                throw new IOException(this.field2220.toString());
            }
            if (this.field2219 + arg2 <= this.field2222) {
                System.arraycopy(this.field2224, this.field2219, arg0, arg1, arg2);
            } else {
                int var6 = this.field2222 - this.field2219;
                System.arraycopy(this.field2224, this.field2219, arg0, arg1, var6);
                System.arraycopy(this.field2224, 0, arg0, arg1 + var6, arg2 - var6);
            }
            this.field2219 = (this.field2219 + arg2) % this.field2222;
            this.notifyAll();
            return arg2;
        }
    }

    @ObfuscatedName("ei.h(I)V")
    public void method2724() {
        synchronized (this) {
            if (this.field2220 == null) {
                this.field2220 = new IOException("");
            }
            this.notifyAll();
        }
        try {
            this.field2218.join();
        } catch (InterruptedException var4) {
        }
    }
}
