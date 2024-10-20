package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

@ObfuscatedName("ee")
public class class153 implements Runnable {

    @ObfuscatedName("ee.w")
    public Thread field2223;

    @ObfuscatedName("ee.o")
    public InputStream field2224;

    @ObfuscatedName("ee.x")
    public int field2228;

    @ObfuscatedName("ee.k")
    public byte[] field2226;

    @ObfuscatedName("ee.f")
    public int field2225 = 0;

    @ObfuscatedName("ee.i")
    public int field2227 = 0;

    @ObfuscatedName("ee.j")
    public IOException field2229;

    public class153(InputStream arg0, int arg1) {
        this.field2224 = arg0;
        this.field2228 = arg1 + 1;
        this.field2226 = new byte[this.field2228];
        this.field2223 = new Thread(this);
        this.field2223.setDaemon(true);
        this.field2223.start();
    }

    public void run() {
        while (true) {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field2229 != null) {
                        return;
                    }
                    if (this.field2225 == 0) {
                        var2 = this.field2228 - this.field2227 - 1;
                    } else if (this.field2225 <= this.field2227) {
                        var2 = this.field2228 - this.field2227;
                    } else {
                        var2 = this.field2225 - this.field2227 - 1;
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
                var5 = this.field2224.read(this.field2226, this.field2227, var2);
                if (var5 == -1) {
                    throw new EOFException();
                }
            } catch (IOException var14) {
                IOException var6 = var14;
                synchronized (this) {
                    this.field2229 = var6;
                    return;
                }
            }
            synchronized (this) {
                this.field2227 = (this.field2227 + var5) % this.field2228;
            }
        }
    }

    @ObfuscatedName("ee.w(II)Z")
    public boolean method2655(int arg0) throws IOException {
        if (arg0 <= 0 || arg0 >= this.field2228) {
            throw new IOException();
        }
        synchronized (this) {
            int var3;
            if (this.field2225 <= this.field2227) {
                var3 = this.field2227 - this.field2225;
            } else {
                var3 = this.field2227 + (this.field2228 - this.field2225);
            }
            if (var3 >= arg0) {
                return true;
            } else if (this.field2229 == null) {
                this.notifyAll();
                return false;
            } else {
                throw new IOException(this.field2229.toString());
            }
        }
    }

    @ObfuscatedName("ee.o(I)I")
    public int method2641() throws IOException {
        synchronized (this) {
            int var2;
            if (this.field2225 <= this.field2227) {
                var2 = this.field2227 - this.field2225;
            } else {
                var2 = this.field2227 + (this.field2228 - this.field2225);
            }
            if (var2 <= 0 && this.field2229 != null) {
                throw new IOException(this.field2229.toString());
            }
            this.notifyAll();
            return var2;
        }
    }

    @ObfuscatedName("ee.x(B)I")
    public int method2642() throws IOException {
        synchronized (this) {
            if (this.field2227 != this.field2225) {
                int var2 = this.field2226[this.field2225] & 0xFF;
                this.field2225 = (this.field2225 + 1) % this.field2228;
                this.notifyAll();
                return var2;
            } else if (this.field2229 == null) {
                return -1;
            } else {
                throw new IOException(this.field2229.toString());
            }
        }
    }

    @ObfuscatedName("ee.k([BIII)I")
    public int method2643(byte[] arg0, int arg1, int arg2) throws IOException {
        if (arg2 < 0 || arg1 < 0 || arg1 + arg2 > arg0.length) {
            throw new IOException();
        }
        synchronized (this) {
            int var5;
            if (this.field2225 <= this.field2227) {
                var5 = this.field2227 - this.field2225;
            } else {
                var5 = this.field2227 + (this.field2228 - this.field2225);
            }
            if (arg2 > var5) {
                arg2 = var5;
            }
            if (arg2 == 0 && this.field2229 != null) {
                throw new IOException(this.field2229.toString());
            }
            if (this.field2225 + arg2 <= this.field2228) {
                System.arraycopy(this.field2226, this.field2225, arg0, arg1, arg2);
            } else {
                int var6 = this.field2228 - this.field2225;
                System.arraycopy(this.field2226, this.field2225, arg0, arg1, var6);
                System.arraycopy(this.field2226, 0, arg0, arg1 + var6, arg2 - var6);
            }
            this.field2225 = (this.field2225 + arg2) % this.field2228;
            this.notifyAll();
            return arg2;
        }
    }

    @ObfuscatedName("ee.f(I)V")
    public void method2644() {
        synchronized (this) {
            if (this.field2229 == null) {
                this.field2229 = new IOException("");
            }
            this.notifyAll();
        }
        try {
            this.field2223.join();
        } catch (InterruptedException var4) {
        }
    }
}
