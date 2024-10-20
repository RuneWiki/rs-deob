package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

@ObfuscatedName("fz")
public class class164 implements Runnable {

    @ObfuscatedName("fz.g")
    public Thread field2159;

    @ObfuscatedName("fz.e")
    public InputStream field2160;

    @ObfuscatedName("fz.b")
    public int field2163;

    @ObfuscatedName("fz.z")
    public byte[] field2166;

    @ObfuscatedName("fz.n")
    public int field2167 = 0;

    @ObfuscatedName("fz.l")
    public int field2164 = 0;

    @ObfuscatedName("fz.s")
    public IOException field2165;

    public class164(InputStream arg0, int arg1) {
        this.field2160 = arg0;
        this.field2163 = arg1 + 1;
        this.field2166 = new byte[this.field2163];
        this.field2159 = new Thread(this);
        this.field2159.setDaemon(true);
        this.field2159.start();
    }

    public void run() {
        while (true) {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field2165 != null) {
                        return;
                    }
                    if (this.field2167 == 0) {
                        var2 = this.field2163 - this.field2164 - 1;
                    } else if (this.field2167 <= this.field2164) {
                        var2 = this.field2163 - this.field2164;
                    } else {
                        var2 = this.field2167 - this.field2164 - 1;
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
                var5 = this.field2160.read(this.field2166, this.field2164, var2);
                if (var5 == -1) {
                    throw new EOFException();
                }
            } catch (IOException var14) {
                IOException var6 = var14;
                synchronized (this) {
                    this.field2165 = var6;
                    return;
                }
            }
            synchronized (this) {
                this.field2164 = (this.field2164 + var5) % this.field2163;
            }
        }
    }

    @ObfuscatedName("fz.g(II)Z")
    public boolean method3046(int arg0) throws IOException {
        if (arg0 == 0) {
            return true;
        } else if (arg0 > 0 && arg0 < this.field2163) {
            synchronized (this) {
                int var3;
                if (this.field2167 <= this.field2164) {
                    var3 = this.field2164 - this.field2167;
                } else {
                    var3 = this.field2164 + (this.field2163 - this.field2167);
                }
                if (var3 >= arg0) {
                    return true;
                } else if (this.field2165 == null) {
                    this.notifyAll();
                    return false;
                } else {
                    throw new IOException(this.field2165.toString());
                }
            }
        } else {
            throw new IOException();
        }
    }

    @ObfuscatedName("fz.e(I)I")
    public int method3063() throws IOException {
        synchronized (this) {
            int var2;
            if (this.field2167 <= this.field2164) {
                var2 = this.field2164 - this.field2167;
            } else {
                var2 = this.field2164 + (this.field2163 - this.field2167);
            }
            if (var2 <= 0 && this.field2165 != null) {
                throw new IOException(this.field2165.toString());
            }
            this.notifyAll();
            return var2;
        }
    }

    @ObfuscatedName("fz.b(I)I")
    public int method3048() throws IOException {
        synchronized (this) {
            if (this.field2167 != this.field2164) {
                int var2 = this.field2166[this.field2167] & 0xFF;
                this.field2167 = (this.field2167 + 1) % this.field2163;
                this.notifyAll();
                return var2;
            } else if (this.field2165 == null) {
                return -1;
            } else {
                throw new IOException(this.field2165.toString());
            }
        }
    }

    @ObfuscatedName("fz.z([BIII)I")
    public int method3049(byte[] arg0, int arg1, int arg2) throws IOException {
        if (arg2 < 0 || arg1 < 0 || arg1 + arg2 > arg0.length) {
            throw new IOException();
        }
        synchronized (this) {
            int var5;
            if (this.field2167 <= this.field2164) {
                var5 = this.field2164 - this.field2167;
            } else {
                var5 = this.field2164 + (this.field2163 - this.field2167);
            }
            if (arg2 > var5) {
                arg2 = var5;
            }
            if (arg2 == 0 && this.field2165 != null) {
                throw new IOException(this.field2165.toString());
            }
            if (this.field2167 + arg2 <= this.field2163) {
                System.arraycopy(this.field2166, this.field2167, arg0, arg1, arg2);
            } else {
                int var6 = this.field2163 - this.field2167;
                System.arraycopy(this.field2166, this.field2167, arg0, arg1, var6);
                System.arraycopy(this.field2166, 0, arg0, arg1 + var6, arg2 - var6);
            }
            this.field2167 = (this.field2167 + arg2) % this.field2163;
            this.notifyAll();
            return arg2;
        }
    }

    @ObfuscatedName("fz.n(B)V")
    public void method3057() {
        synchronized (this) {
            if (this.field2165 == null) {
                this.field2165 = new IOException("");
            }
            this.notifyAll();
        }
        try {
            this.field2159.join();
        } catch (InterruptedException var4) {
        }
    }
}
