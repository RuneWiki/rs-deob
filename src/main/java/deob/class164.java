package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

@ObfuscatedName("fj")
public class class164 implements Runnable {

    @ObfuscatedName("fj.o")
    public Thread field2187;

    @ObfuscatedName("fj.k")
    public InputStream field2188;

    @ObfuscatedName("fj.t")
    public int field2189;

    @ObfuscatedName("fj.d")
    public byte[] field2190;

    @ObfuscatedName("fj.h")
    public int field2193 = 0;

    @ObfuscatedName("fj.m")
    public int field2192 = 0;

    @ObfuscatedName("fj.z")
    public IOException field2191;

    public class164(InputStream arg0, int arg1) {
        this.field2188 = arg0;
        this.field2189 = arg1 + 1;
        this.field2190 = new byte[this.field2189];
        this.field2187 = new Thread(this);
        this.field2187.setDaemon(true);
        this.field2187.start();
    }

    public void run() {
        while (true) {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field2191 != null) {
                        return;
                    }
                    if (this.field2193 == 0) {
                        var2 = this.field2189 - this.field2192 - 1;
                    } else if (this.field2193 <= this.field2192) {
                        var2 = this.field2189 - this.field2192;
                    } else {
                        var2 = this.field2193 - this.field2192 - 1;
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
                var5 = this.field2188.read(this.field2190, this.field2192, var2);
                if (var5 == -1) {
                    throw new EOFException();
                }
            } catch (IOException var14) {
                IOException var6 = var14;
                synchronized (this) {
                    this.field2191 = var6;
                    return;
                }
            }
            synchronized (this) {
                this.field2192 = (this.field2192 + var5) % this.field2189;
            }
        }
    }

    @ObfuscatedName("fj.o(II)Z")
    public boolean method2945(int arg0) throws IOException {
        if (arg0 == 0) {
            return true;
        } else if (arg0 > 0 && arg0 < this.field2189) {
            synchronized (this) {
                int var3;
                if (this.field2193 <= this.field2192) {
                    var3 = this.field2192 - this.field2193;
                } else {
                    var3 = this.field2192 + (this.field2189 - this.field2193);
                }
                if (var3 >= arg0) {
                    return true;
                } else if (this.field2191 == null) {
                    this.notifyAll();
                    return false;
                } else {
                    throw new IOException(this.field2191.toString());
                }
            }
        } else {
            throw new IOException();
        }
    }

    @ObfuscatedName("fj.k(I)I")
    public int method2941() throws IOException {
        synchronized (this) {
            int var2;
            if (this.field2193 <= this.field2192) {
                var2 = this.field2192 - this.field2193;
            } else {
                var2 = this.field2192 + (this.field2189 - this.field2193);
            }
            if (var2 <= 0 && this.field2191 != null) {
                throw new IOException(this.field2191.toString());
            }
            this.notifyAll();
            return var2;
        }
    }

    @ObfuscatedName("fj.t(I)I")
    public int method2948() throws IOException {
        synchronized (this) {
            if (this.field2193 != this.field2192) {
                int var2 = this.field2190[this.field2193] & 0xFF;
                this.field2193 = (this.field2193 + 1) % this.field2189;
                this.notifyAll();
                return var2;
            } else if (this.field2191 == null) {
                return -1;
            } else {
                throw new IOException(this.field2191.toString());
            }
        }
    }

    @ObfuscatedName("fj.d([BIII)I")
    public int method2943(byte[] arg0, int arg1, int arg2) throws IOException {
        if (arg2 < 0 || arg1 < 0 || arg1 + arg2 > arg0.length) {
            throw new IOException();
        }
        synchronized (this) {
            int var5;
            if (this.field2193 <= this.field2192) {
                var5 = this.field2192 - this.field2193;
            } else {
                var5 = this.field2192 + (this.field2189 - this.field2193);
            }
            if (arg2 > var5) {
                arg2 = var5;
            }
            if (arg2 == 0 && this.field2191 != null) {
                throw new IOException(this.field2191.toString());
            }
            if (this.field2193 + arg2 <= this.field2189) {
                System.arraycopy(this.field2190, this.field2193, arg0, arg1, arg2);
            } else {
                int var6 = this.field2189 - this.field2193;
                System.arraycopy(this.field2190, this.field2193, arg0, arg1, var6);
                System.arraycopy(this.field2190, 0, arg0, arg1 + var6, arg2 - var6);
            }
            this.field2193 = (this.field2193 + arg2) % this.field2189;
            this.notifyAll();
            return arg2;
        }
    }

    @ObfuscatedName("fj.h(I)V")
    public void method2949() {
        synchronized (this) {
            if (this.field2191 == null) {
                this.field2191 = new IOException("");
            }
            this.notifyAll();
        }
        try {
            this.field2187.join();
        } catch (InterruptedException var4) {
        }
    }
}
