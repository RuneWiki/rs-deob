package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

@ObfuscatedName("ez")
public class class154 implements Runnable {

    @ObfuscatedName("ez.p")
    public Thread field2092;

    @ObfuscatedName("ez.i")
    public InputStream field2095;

    @ObfuscatedName("ez.w")
    public int field2093;

    @ObfuscatedName("ez.s")
    public byte[] field2091;

    @ObfuscatedName("ez.j")
    public int field2097 = 0;

    @ObfuscatedName("ez.a")
    public int field2096 = 0;

    @ObfuscatedName("ez.t")
    public IOException field2094;

    public class154(InputStream arg0, int arg1) {
        this.field2095 = arg0;
        this.field2093 = arg1 + 1;
        this.field2091 = new byte[this.field2093];
        this.field2092 = new Thread(this);
        this.field2092.setDaemon(true);
        this.field2092.start();
    }

    public void run() {
        while (true) {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field2094 != null) {
                        return;
                    }
                    if (this.field2097 == 0) {
                        var2 = this.field2093 - this.field2096 - 1;
                    } else if (this.field2097 <= this.field2096) {
                        var2 = this.field2093 - this.field2096;
                    } else {
                        var2 = this.field2097 - this.field2096 - 1;
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
                var5 = this.field2095.read(this.field2091, this.field2096, var2);
                if (var5 == -1) {
                    throw new EOFException();
                }
            } catch (IOException var14) {
                IOException var6 = var14;
                synchronized (this) {
                    this.field2094 = var6;
                    return;
                }
            }
            synchronized (this) {
                this.field2096 = (this.field2096 + var5) % this.field2093;
            }
        }
    }

    @ObfuscatedName("ez.p(II)Z")
    public boolean method2839(int arg0) throws IOException {
        if (arg0 == 0) {
            return true;
        } else if (arg0 > 0 && arg0 < this.field2093) {
            synchronized (this) {
                int var3;
                if (this.field2097 <= this.field2096) {
                    var3 = this.field2096 - this.field2097;
                } else {
                    var3 = this.field2096 + (this.field2093 - this.field2097);
                }
                if (var3 >= arg0) {
                    return true;
                } else if (this.field2094 == null) {
                    this.notifyAll();
                    return false;
                } else {
                    throw new IOException(this.field2094.toString());
                }
            }
        } else {
            throw new IOException();
        }
    }

    @ObfuscatedName("ez.i(I)I")
    public int method2840() throws IOException {
        synchronized (this) {
            int var2;
            if (this.field2097 <= this.field2096) {
                var2 = this.field2096 - this.field2097;
            } else {
                var2 = this.field2096 + (this.field2093 - this.field2097);
            }
            if (var2 <= 0 && this.field2094 != null) {
                throw new IOException(this.field2094.toString());
            }
            this.notifyAll();
            return var2;
        }
    }

    @ObfuscatedName("ez.w(I)I")
    public int method2846() throws IOException {
        synchronized (this) {
            if (this.field2097 != this.field2096) {
                int var2 = this.field2091[this.field2097] & 0xFF;
                this.field2097 = (this.field2097 + 1) % this.field2093;
                this.notifyAll();
                return var2;
            } else if (this.field2094 == null) {
                return -1;
            } else {
                throw new IOException(this.field2094.toString());
            }
        }
    }

    @ObfuscatedName("ez.s([BIIB)I")
    public int method2858(byte[] arg0, int arg1, int arg2) throws IOException {
        if (arg2 < 0 || arg1 < 0 || arg1 + arg2 > arg0.length) {
            throw new IOException();
        }
        synchronized (this) {
            int var5;
            if (this.field2097 <= this.field2096) {
                var5 = this.field2096 - this.field2097;
            } else {
                var5 = this.field2096 + (this.field2093 - this.field2097);
            }
            if (arg2 > var5) {
                arg2 = var5;
            }
            if (arg2 == 0 && this.field2094 != null) {
                throw new IOException(this.field2094.toString());
            }
            if (this.field2097 + arg2 <= this.field2093) {
                System.arraycopy(this.field2091, this.field2097, arg0, arg1, arg2);
            } else {
                int var6 = this.field2093 - this.field2097;
                System.arraycopy(this.field2091, this.field2097, arg0, arg1, var6);
                System.arraycopy(this.field2091, 0, arg0, arg1 + var6, arg2 - var6);
            }
            this.field2097 = (this.field2097 + arg2) % this.field2093;
            this.notifyAll();
            return arg2;
        }
    }

    @ObfuscatedName("ez.j(I)V")
    public void method2843() {
        synchronized (this) {
            if (this.field2094 == null) {
                this.field2094 = new IOException("");
            }
            this.notifyAll();
        }
        try {
            this.field2092.join();
        } catch (InterruptedException var4) {
        }
    }
}
