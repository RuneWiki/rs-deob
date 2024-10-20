package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

@ObfuscatedName("fr")
public class class163 implements Runnable {

    @ObfuscatedName("fr.b")
    public Thread field2135;

    @ObfuscatedName("fr.q")
    public InputStream field2136;

    @ObfuscatedName("fr.o")
    public int field2138;

    @ObfuscatedName("fr.p")
    public byte[] field2140;

    @ObfuscatedName("fr.a")
    public int field2137 = 0;

    @ObfuscatedName("fr.h")
    public int field2139 = 0;

    @ObfuscatedName("fr.l")
    public IOException field2141;

    public class163(InputStream arg0, int arg1) {
        this.field2136 = arg0;
        this.field2138 = arg1 + 1;
        this.field2140 = new byte[this.field2138];
        this.field2135 = new Thread(this);
        this.field2135.setDaemon(true);
        this.field2135.start();
    }

    public void run() {
        while (true) {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field2141 != null) {
                        return;
                    }
                    if (this.field2137 == 0) {
                        var2 = this.field2138 - this.field2139 - 1;
                    } else if (this.field2137 <= this.field2139) {
                        var2 = this.field2138 - this.field2139;
                    } else {
                        var2 = this.field2137 - this.field2139 - 1;
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
                var5 = this.field2136.read(this.field2140, this.field2139, var2);
                if (var5 == -1) {
                    throw new EOFException();
                }
            } catch (IOException var14) {
                IOException var6 = var14;
                synchronized (this) {
                    this.field2141 = var6;
                    return;
                }
            }
            synchronized (this) {
                this.field2139 = (this.field2139 + var5) % this.field2138;
            }
        }
    }

    @ObfuscatedName("fr.b(IB)Z")
    public boolean method2947(int arg0) throws IOException {
        if (arg0 == 0) {
            return true;
        } else if (arg0 > 0 && arg0 < this.field2138) {
            synchronized (this) {
                int var3;
                if (this.field2137 <= this.field2139) {
                    var3 = this.field2139 - this.field2137;
                } else {
                    var3 = this.field2139 + (this.field2138 - this.field2137);
                }
                if (var3 >= arg0) {
                    return true;
                } else if (this.field2141 == null) {
                    this.notifyAll();
                    return false;
                } else {
                    throw new IOException(this.field2141.toString());
                }
            }
        } else {
            throw new IOException();
        }
    }

    @ObfuscatedName("fr.q(I)I")
    public int method2948() throws IOException {
        synchronized (this) {
            int var2;
            if (this.field2137 <= this.field2139) {
                var2 = this.field2139 - this.field2137;
            } else {
                var2 = this.field2139 + (this.field2138 - this.field2137);
            }
            if (var2 <= 0 && this.field2141 != null) {
                throw new IOException(this.field2141.toString());
            }
            this.notifyAll();
            return var2;
        }
    }

    @ObfuscatedName("fr.o(I)I")
    public int method2972() throws IOException {
        synchronized (this) {
            if (this.field2139 != this.field2137) {
                int var2 = this.field2140[this.field2137] & 0xFF;
                this.field2137 = (this.field2137 + 1) % this.field2138;
                this.notifyAll();
                return var2;
            } else if (this.field2141 == null) {
                return -1;
            } else {
                throw new IOException(this.field2141.toString());
            }
        }
    }

    @ObfuscatedName("fr.p([BIII)I")
    public int method2949(byte[] arg0, int arg1, int arg2) throws IOException {
        if (arg2 < 0 || arg1 < 0 || arg1 + arg2 > arg0.length) {
            throw new IOException();
        }
        synchronized (this) {
            int var5;
            if (this.field2137 <= this.field2139) {
                var5 = this.field2139 - this.field2137;
            } else {
                var5 = this.field2139 + (this.field2138 - this.field2137);
            }
            if (arg2 > var5) {
                arg2 = var5;
            }
            if (arg2 == 0 && this.field2141 != null) {
                throw new IOException(this.field2141.toString());
            }
            if (this.field2137 + arg2 <= this.field2138) {
                System.arraycopy(this.field2140, this.field2137, arg0, arg1, arg2);
            } else {
                int var6 = this.field2138 - this.field2137;
                System.arraycopy(this.field2140, this.field2137, arg0, arg1, var6);
                System.arraycopy(this.field2140, 0, arg0, arg1 + var6, arg2 - var6);
            }
            this.field2137 = (this.field2137 + arg2) % this.field2138;
            this.notifyAll();
            return arg2;
        }
    }

    @ObfuscatedName("fr.a(I)V")
    public void method2950() {
        synchronized (this) {
            if (this.field2141 == null) {
                this.field2141 = new IOException("");
            }
            this.notifyAll();
        }
        try {
            this.field2135.join();
        } catch (InterruptedException var4) {
        }
    }
}
