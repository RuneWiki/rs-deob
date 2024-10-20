package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

@ObfuscatedName("ec")
public class class154 implements Runnable {

    @ObfuscatedName("ec.n")
    public Thread field2134;

    @ObfuscatedName("ec.v")
    public InputStream field2126;

    @ObfuscatedName("ec.y")
    public int field2128;

    @ObfuscatedName("ec.r")
    public byte[] field2127;

    @ObfuscatedName("ec.h")
    public int field2133 = 0;

    @ObfuscatedName("ec.d")
    public int field2131 = 0;

    @ObfuscatedName("ec.s")
    public IOException field2132;

    public class154(InputStream arg0, int arg1) {
        this.field2126 = arg0;
        this.field2128 = arg1 + 1;
        this.field2127 = new byte[this.field2128];
        this.field2134 = new Thread(this);
        this.field2134.setDaemon(true);
        this.field2134.start();
    }

    public void run() {
        while (true) {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field2132 != null) {
                        return;
                    }
                    if (this.field2133 == 0) {
                        var2 = this.field2128 - this.field2131 - 1;
                    } else if (this.field2133 <= this.field2131) {
                        var2 = this.field2128 - this.field2131;
                    } else {
                        var2 = this.field2133 - this.field2131 - 1;
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
                var5 = this.field2126.read(this.field2127, this.field2131, var2);
                if (var5 == -1) {
                    throw new EOFException();
                }
            } catch (IOException var14) {
                IOException var6 = var14;
                synchronized (this) {
                    this.field2132 = var6;
                    return;
                }
            }
            synchronized (this) {
                this.field2131 = (this.field2131 + var5) % this.field2128;
            }
        }
    }

    @ObfuscatedName("ec.n(II)Z")
    public boolean method2753(int arg0) throws IOException {
        if (arg0 == 0) {
            return true;
        } else if (arg0 > 0 && arg0 < this.field2128) {
            synchronized (this) {
                int var3;
                if (this.field2133 <= this.field2131) {
                    var3 = this.field2131 - this.field2133;
                } else {
                    var3 = this.field2131 + (this.field2128 - this.field2133);
                }
                if (var3 >= arg0) {
                    return true;
                } else if (this.field2132 == null) {
                    this.notifyAll();
                    return false;
                } else {
                    throw new IOException(this.field2132.toString());
                }
            }
        } else {
            throw new IOException();
        }
    }

    @ObfuscatedName("ec.v(I)I")
    public int method2767() throws IOException {
        synchronized (this) {
            int var2;
            if (this.field2133 <= this.field2131) {
                var2 = this.field2131 - this.field2133;
            } else {
                var2 = this.field2131 + (this.field2128 - this.field2133);
            }
            if (var2 <= 0 && this.field2132 != null) {
                throw new IOException(this.field2132.toString());
            }
            this.notifyAll();
            return var2;
        }
    }

    @ObfuscatedName("ec.y(I)I")
    public int method2754() throws IOException {
        synchronized (this) {
            if (this.field2133 != this.field2131) {
                int var2 = this.field2127[this.field2133] & 0xFF;
                this.field2133 = (this.field2133 + 1) % this.field2128;
                this.notifyAll();
                return var2;
            } else if (this.field2132 == null) {
                return -1;
            } else {
                throw new IOException(this.field2132.toString());
            }
        }
    }

    @ObfuscatedName("ec.r([BIIB)I")
    public int method2755(byte[] arg0, int arg1, int arg2) throws IOException {
        if (arg2 < 0 || arg1 < 0 || arg1 + arg2 > arg0.length) {
            throw new IOException();
        }
        synchronized (this) {
            int var5;
            if (this.field2133 <= this.field2131) {
                var5 = this.field2131 - this.field2133;
            } else {
                var5 = this.field2131 + (this.field2128 - this.field2133);
            }
            if (arg2 > var5) {
                arg2 = var5;
            }
            if (arg2 == 0 && this.field2132 != null) {
                throw new IOException(this.field2132.toString());
            }
            if (this.field2133 + arg2 <= this.field2128) {
                System.arraycopy(this.field2127, this.field2133, arg0, arg1, arg2);
            } else {
                int var6 = this.field2128 - this.field2133;
                System.arraycopy(this.field2127, this.field2133, arg0, arg1, var6);
                System.arraycopy(this.field2127, 0, arg0, arg1 + var6, arg2 - var6);
            }
            this.field2133 = (this.field2133 + arg2) % this.field2128;
            this.notifyAll();
            return arg2;
        }
    }

    @ObfuscatedName("ec.h(B)V")
    public void method2756() {
        synchronized (this) {
            if (this.field2132 == null) {
                this.field2132 = new IOException("");
            }
            this.notifyAll();
        }
        try {
            this.field2134.join();
        } catch (InterruptedException var4) {
        }
    }
}
