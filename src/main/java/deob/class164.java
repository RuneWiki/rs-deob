package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

@ObfuscatedName("fs")
public class class164 implements Runnable {

    @ObfuscatedName("fs.c")
    public Thread field2172;

    @ObfuscatedName("fs.i")
    public InputStream field2170;

    @ObfuscatedName("fs.o")
    public int field2171;

    @ObfuscatedName("fs.j")
    public byte[] field2174;

    @ObfuscatedName("fs.k")
    public int field2173 = 0;

    @ObfuscatedName("fs.x")
    public int field2169 = 0;

    @ObfuscatedName("fs.z")
    public IOException field2175;

    public class164(InputStream arg0, int arg1) {
        this.field2170 = arg0;
        this.field2171 = arg1 + 1;
        this.field2174 = new byte[this.field2171];
        this.field2172 = new Thread(this);
        this.field2172.setDaemon(true);
        this.field2172.start();
    }

    public void run() {
        while (true) {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field2175 != null) {
                        return;
                    }
                    if (this.field2173 == 0) {
                        var2 = this.field2171 - this.field2169 - 1;
                    } else if (this.field2173 <= this.field2169) {
                        var2 = this.field2171 - this.field2169;
                    } else {
                        var2 = this.field2173 - this.field2169 - 1;
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
                var5 = this.field2170.read(this.field2174, this.field2169, var2);
                if (var5 == -1) {
                    throw new EOFException();
                }
            } catch (IOException var14) {
                IOException var6 = var14;
                synchronized (this) {
                    this.field2175 = var6;
                    return;
                }
            }
            synchronized (this) {
                this.field2169 = (this.field2169 + var5) % this.field2171;
            }
        }
    }

    @ObfuscatedName("fs.c(IS)Z")
    public boolean method2966(int arg0) throws IOException {
        if (arg0 == 0) {
            return true;
        } else if (arg0 > 0 && arg0 < this.field2171) {
            synchronized (this) {
                int var3;
                if (this.field2173 <= this.field2169) {
                    var3 = this.field2169 - this.field2173;
                } else {
                    var3 = this.field2169 + (this.field2171 - this.field2173);
                }
                if (var3 >= arg0) {
                    return true;
                } else if (this.field2175 == null) {
                    this.notifyAll();
                    return false;
                } else {
                    throw new IOException(this.field2175.toString());
                }
            }
        } else {
            throw new IOException();
        }
    }

    @ObfuscatedName("fs.i(I)I")
    public int method2967() throws IOException {
        synchronized (this) {
            int var2;
            if (this.field2173 <= this.field2169) {
                var2 = this.field2169 - this.field2173;
            } else {
                var2 = this.field2169 + (this.field2171 - this.field2173);
            }
            if (var2 <= 0 && this.field2175 != null) {
                throw new IOException(this.field2175.toString());
            }
            this.notifyAll();
            return var2;
        }
    }

    @ObfuscatedName("fs.o(I)I")
    public int method2970() throws IOException {
        synchronized (this) {
            if (this.field2173 != this.field2169) {
                int var2 = this.field2174[this.field2173] & 0xFF;
                this.field2173 = (this.field2173 + 1) % this.field2171;
                this.notifyAll();
                return var2;
            } else if (this.field2175 == null) {
                return -1;
            } else {
                throw new IOException(this.field2175.toString());
            }
        }
    }

    @ObfuscatedName("fs.j([BIII)I")
    public int method2969(byte[] arg0, int arg1, int arg2) throws IOException {
        if (arg2 < 0 || arg1 < 0 || arg1 + arg2 > arg0.length) {
            throw new IOException();
        }
        synchronized (this) {
            int var5;
            if (this.field2173 <= this.field2169) {
                var5 = this.field2169 - this.field2173;
            } else {
                var5 = this.field2169 + (this.field2171 - this.field2173);
            }
            if (arg2 > var5) {
                arg2 = var5;
            }
            if (arg2 == 0 && this.field2175 != null) {
                throw new IOException(this.field2175.toString());
            }
            if (this.field2173 + arg2 <= this.field2171) {
                System.arraycopy(this.field2174, this.field2173, arg0, arg1, arg2);
            } else {
                int var6 = this.field2171 - this.field2173;
                System.arraycopy(this.field2174, this.field2173, arg0, arg1, var6);
                System.arraycopy(this.field2174, 0, arg0, arg1 + var6, arg2 - var6);
            }
            this.field2173 = (this.field2173 + arg2) % this.field2171;
            this.notifyAll();
            return arg2;
        }
    }

    @ObfuscatedName("fs.k(I)V")
    public void method2981() {
        synchronized (this) {
            if (this.field2175 == null) {
                this.field2175 = new IOException("");
            }
            this.notifyAll();
        }
        try {
            this.field2172.join();
        } catch (InterruptedException var4) {
        }
    }
}
