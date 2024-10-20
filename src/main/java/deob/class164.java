package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

@ObfuscatedName("fl")
public class class164 implements Runnable {

    @ObfuscatedName("fl.t")
    public Thread field2149;

    @ObfuscatedName("fl.q")
    public InputStream field2146;

    @ObfuscatedName("fl.i")
    public int field2145;

    @ObfuscatedName("fl.a")
    public byte[] field2148;

    @ObfuscatedName("fl.l")
    public int field2150 = 0;

    @ObfuscatedName("fl.b")
    public int field2151 = 0;

    @ObfuscatedName("fl.e")
    public IOException field2147;

    public class164(InputStream arg0, int arg1) {
        this.field2146 = arg0;
        this.field2145 = arg1 + 1;
        this.field2148 = new byte[this.field2145];
        this.field2149 = new Thread(this);
        this.field2149.setDaemon(true);
        this.field2149.start();
    }

    public void run() {
        while (true) {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field2147 != null) {
                        return;
                    }
                    if (this.field2150 == 0) {
                        var2 = this.field2145 - this.field2151 - 1;
                    } else if (this.field2150 <= this.field2151) {
                        var2 = this.field2145 - this.field2151;
                    } else {
                        var2 = this.field2150 - this.field2151 - 1;
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
                var5 = this.field2146.read(this.field2148, this.field2151, var2);
                if (var5 == -1) {
                    throw new EOFException();
                }
            } catch (IOException var14) {
                IOException var6 = var14;
                synchronized (this) {
                    this.field2147 = var6;
                    return;
                }
            }
            synchronized (this) {
                this.field2151 = (this.field2151 + var5) % this.field2145;
            }
        }
    }

    @ObfuscatedName("fl.t(II)Z")
    public boolean method2942(int arg0) throws IOException {
        if (arg0 == 0) {
            return true;
        } else if (arg0 > 0 && arg0 < this.field2145) {
            synchronized (this) {
                int var3;
                if (this.field2150 <= this.field2151) {
                    var3 = this.field2151 - this.field2150;
                } else {
                    var3 = this.field2151 + (this.field2145 - this.field2150);
                }
                if (var3 >= arg0) {
                    return true;
                } else if (this.field2147 == null) {
                    this.notifyAll();
                    return false;
                } else {
                    throw new IOException(this.field2147.toString());
                }
            }
        } else {
            throw new IOException();
        }
    }

    @ObfuscatedName("fl.q(I)I")
    public int method2943() throws IOException {
        synchronized (this) {
            int var2;
            if (this.field2150 <= this.field2151) {
                var2 = this.field2151 - this.field2150;
            } else {
                var2 = this.field2151 + (this.field2145 - this.field2150);
            }
            if (var2 <= 0 && this.field2147 != null) {
                throw new IOException(this.field2147.toString());
            }
            this.notifyAll();
            return var2;
        }
    }

    @ObfuscatedName("fl.i(B)I")
    public int method2944() throws IOException {
        synchronized (this) {
            if (this.field2151 != this.field2150) {
                int var2 = this.field2148[this.field2150] & 0xFF;
                this.field2150 = (this.field2150 + 1) % this.field2145;
                this.notifyAll();
                return var2;
            } else if (this.field2147 == null) {
                return -1;
            } else {
                throw new IOException(this.field2147.toString());
            }
        }
    }

    @ObfuscatedName("fl.a([BIIB)I")
    public int method2945(byte[] arg0, int arg1, int arg2) throws IOException {
        if (arg2 < 0 || arg1 < 0 || arg1 + arg2 > arg0.length) {
            throw new IOException();
        }
        synchronized (this) {
            int var5;
            if (this.field2150 <= this.field2151) {
                var5 = this.field2151 - this.field2150;
            } else {
                var5 = this.field2151 + (this.field2145 - this.field2150);
            }
            if (arg2 > var5) {
                arg2 = var5;
            }
            if (arg2 == 0 && this.field2147 != null) {
                throw new IOException(this.field2147.toString());
            }
            if (this.field2150 + arg2 <= this.field2145) {
                System.arraycopy(this.field2148, this.field2150, arg0, arg1, arg2);
            } else {
                int var6 = this.field2145 - this.field2150;
                System.arraycopy(this.field2148, this.field2150, arg0, arg1, var6);
                System.arraycopy(this.field2148, 0, arg0, arg1 + var6, arg2 - var6);
            }
            this.field2150 = (this.field2150 + arg2) % this.field2145;
            this.notifyAll();
            return arg2;
        }
    }

    @ObfuscatedName("fl.l(I)V")
    public void method2950() {
        synchronized (this) {
            if (this.field2147 == null) {
                this.field2147 = new IOException("");
            }
            this.notifyAll();
        }
        try {
            this.field2149.join();
        } catch (InterruptedException var4) {
        }
    }
}
