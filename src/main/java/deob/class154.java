package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

@ObfuscatedName("et")
public class class154 implements Runnable {

    @ObfuscatedName("et.s")
    public Thread field2111;

    @ObfuscatedName("et.g")
    public InputStream field2105;

    @ObfuscatedName("et.m")
    public int field2106;

    @ObfuscatedName("et.h")
    public byte[] field2107;

    @ObfuscatedName("et.i")
    public int field2109 = 0;

    @ObfuscatedName("et.w")
    public int field2112 = 0;

    @ObfuscatedName("et.t")
    public IOException field2110;

    public class154(InputStream arg0, int arg1) {
        this.field2105 = arg0;
        this.field2106 = arg1 + 1;
        this.field2107 = new byte[this.field2106];
        this.field2111 = new Thread(this);
        this.field2111.setDaemon(true);
        this.field2111.start();
    }

    public void run() {
        while (true) {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field2110 != null) {
                        return;
                    }
                    if (this.field2109 == 0) {
                        var2 = this.field2106 - this.field2112 - 1;
                    } else if (this.field2109 <= this.field2112) {
                        var2 = this.field2106 - this.field2112;
                    } else {
                        var2 = this.field2109 - this.field2112 - 1;
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
                var5 = this.field2105.read(this.field2107, this.field2112, var2);
                if (var5 == -1) {
                    throw new EOFException();
                }
            } catch (IOException var14) {
                IOException var6 = var14;
                synchronized (this) {
                    this.field2110 = var6;
                    return;
                }
            }
            synchronized (this) {
                this.field2112 = (this.field2112 + var5) % this.field2106;
            }
        }
    }

    @ObfuscatedName("et.s(II)Z")
    public boolean method2963(int arg0) throws IOException {
        if (arg0 == 0) {
            return true;
        } else if (arg0 > 0 && arg0 < this.field2106) {
            synchronized (this) {
                int var3;
                if (this.field2109 <= this.field2112) {
                    var3 = this.field2112 - this.field2109;
                } else {
                    var3 = this.field2112 + (this.field2106 - this.field2109);
                }
                if (var3 >= arg0) {
                    return true;
                } else if (this.field2110 == null) {
                    this.notifyAll();
                    return false;
                } else {
                    throw new IOException(this.field2110.toString());
                }
            }
        } else {
            throw new IOException();
        }
    }

    @ObfuscatedName("et.g(B)I")
    public int method2964() throws IOException {
        synchronized (this) {
            int var2;
            if (this.field2109 <= this.field2112) {
                var2 = this.field2112 - this.field2109;
            } else {
                var2 = this.field2112 + (this.field2106 - this.field2109);
            }
            if (var2 <= 0 && this.field2110 != null) {
                throw new IOException(this.field2110.toString());
            }
            this.notifyAll();
            return var2;
        }
    }

    @ObfuscatedName("et.m(I)I")
    public int method2965() throws IOException {
        synchronized (this) {
            if (this.field2112 != this.field2109) {
                int var2 = this.field2107[this.field2109] & 0xFF;
                this.field2109 = (this.field2109 + 1) % this.field2106;
                this.notifyAll();
                return var2;
            } else if (this.field2110 == null) {
                return -1;
            } else {
                throw new IOException(this.field2110.toString());
            }
        }
    }

    @ObfuscatedName("et.h([BIIB)I")
    public int method2980(byte[] arg0, int arg1, int arg2) throws IOException {
        if (arg2 < 0 || arg1 < 0 || arg1 + arg2 > arg0.length) {
            throw new IOException();
        }
        synchronized (this) {
            int var5;
            if (this.field2109 <= this.field2112) {
                var5 = this.field2112 - this.field2109;
            } else {
                var5 = this.field2112 + (this.field2106 - this.field2109);
            }
            if (arg2 > var5) {
                arg2 = var5;
            }
            if (arg2 == 0 && this.field2110 != null) {
                throw new IOException(this.field2110.toString());
            }
            if (this.field2109 + arg2 <= this.field2106) {
                System.arraycopy(this.field2107, this.field2109, arg0, arg1, arg2);
            } else {
                int var6 = this.field2106 - this.field2109;
                System.arraycopy(this.field2107, this.field2109, arg0, arg1, var6);
                System.arraycopy(this.field2107, 0, arg0, arg1 + var6, arg2 - var6);
            }
            this.field2109 = (this.field2109 + arg2) % this.field2106;
            this.notifyAll();
            return arg2;
        }
    }

    @ObfuscatedName("et.i(I)V")
    public void method2973() {
        synchronized (this) {
            if (this.field2110 == null) {
                this.field2110 = new IOException("");
            }
            this.notifyAll();
        }
        try {
            this.field2111.join();
        } catch (InterruptedException var4) {
        }
    }
}
