package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

@ObfuscatedName("ej")
public class class152 implements Runnable {

    @ObfuscatedName("ej.z")
    public Thread field1931;

    @ObfuscatedName("ej.w")
    public InputStream field1938;

    @ObfuscatedName("ej.s")
    public int field1935;

    @ObfuscatedName("ej.l")
    public byte[] field1933;

    @ObfuscatedName("ej.u")
    public int field1932 = 0;

    @ObfuscatedName("ej.q")
    public int field1930 = 0;

    @ObfuscatedName("ej.k")
    public IOException field1936;

    public class152(InputStream arg0, int arg1) {
        this.field1938 = arg0;
        this.field1935 = arg1 + 1;
        this.field1933 = new byte[this.field1935];
        this.field1931 = new Thread(this);
        this.field1931.setDaemon(true);
        this.field1931.start();
    }

    public void run() {
        while (true) {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field1936 != null) {
                        return;
                    }
                    if (this.field1932 == 0) {
                        var2 = this.field1935 - this.field1930 - 1;
                    } else if (this.field1932 <= this.field1930) {
                        var2 = this.field1935 - this.field1930;
                    } else {
                        var2 = this.field1932 - this.field1930 - 1;
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
                var5 = this.field1938.read(this.field1933, this.field1930, var2);
                if (var5 == -1) {
                    throw new EOFException();
                }
            } catch (IOException var14) {
                IOException var6 = var14;
                synchronized (this) {
                    this.field1936 = var6;
                    return;
                }
            }
            synchronized (this) {
                this.field1930 = (this.field1930 + var5) % this.field1935;
            }
        }
    }

    @ObfuscatedName("ej.z(II)Z")
    public boolean method2978(int arg0) throws IOException {
        if (arg0 == 0) {
            return true;
        } else if (arg0 > 0 && arg0 < this.field1935) {
            synchronized (this) {
                int var3;
                if (this.field1932 <= this.field1930) {
                    var3 = this.field1930 - this.field1932;
                } else {
                    var3 = this.field1930 + (this.field1935 - this.field1932);
                }
                if (var3 >= arg0) {
                    return true;
                } else if (this.field1936 == null) {
                    this.notifyAll();
                    return false;
                } else {
                    throw new IOException(this.field1936.toString());
                }
            }
        } else {
            throw new IOException();
        }
    }

    @ObfuscatedName("ej.w(I)I")
    public int method2976() throws IOException {
        synchronized (this) {
            int var2;
            if (this.field1932 <= this.field1930) {
                var2 = this.field1930 - this.field1932;
            } else {
                var2 = this.field1930 + (this.field1935 - this.field1932);
            }
            if (var2 <= 0 && this.field1936 != null) {
                throw new IOException(this.field1936.toString());
            }
            this.notifyAll();
            return var2;
        }
    }

    @ObfuscatedName("ej.s(I)I")
    public int method2977() throws IOException {
        synchronized (this) {
            if (this.field1932 != this.field1930) {
                int var2 = this.field1933[this.field1932] & 0xFF;
                this.field1932 = (this.field1932 + 1) % this.field1935;
                this.notifyAll();
                return var2;
            } else if (this.field1936 == null) {
                return -1;
            } else {
                throw new IOException(this.field1936.toString());
            }
        }
    }

    @ObfuscatedName("ej.l([BIII)I")
    public int method2983(byte[] arg0, int arg1, int arg2) throws IOException {
        if (arg2 < 0 || arg1 < 0 || arg1 + arg2 > arg0.length) {
            throw new IOException();
        }
        synchronized (this) {
            int var5;
            if (this.field1932 <= this.field1930) {
                var5 = this.field1930 - this.field1932;
            } else {
                var5 = this.field1930 + (this.field1935 - this.field1932);
            }
            if (arg2 > var5) {
                arg2 = var5;
            }
            if (arg2 == 0 && this.field1936 != null) {
                throw new IOException(this.field1936.toString());
            }
            if (this.field1932 + arg2 <= this.field1935) {
                System.arraycopy(this.field1933, this.field1932, arg0, arg1, arg2);
            } else {
                int var6 = this.field1935 - this.field1932;
                System.arraycopy(this.field1933, this.field1932, arg0, arg1, var6);
                System.arraycopy(this.field1933, 0, arg0, arg1 + var6, arg2 - var6);
            }
            this.field1932 = (this.field1932 + arg2) % this.field1935;
            this.notifyAll();
            return arg2;
        }
    }

    @ObfuscatedName("ej.u(B)V")
    public void method2974() {
        synchronized (this) {
            if (this.field1936 == null) {
                this.field1936 = new IOException("");
            }
            this.notifyAll();
        }
        try {
            this.field1931.join();
        } catch (InterruptedException var4) {
        }
    }
}
