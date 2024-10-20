package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

@ObfuscatedName("ee")
public class class152 implements Runnable {

    @ObfuscatedName("ee.w")
    public Thread field1951;

    @ObfuscatedName("ee.m")
    public InputStream field1957;

    @ObfuscatedName("ee.q")
    public int field1952;

    @ObfuscatedName("ee.b")
    public byte[] field1953;

    @ObfuscatedName("ee.f")
    public int field1954 = 0;

    @ObfuscatedName("ee.n")
    public int field1950 = 0;

    @ObfuscatedName("ee.h")
    public IOException field1956;

    public class152(InputStream arg0, int arg1) {
        this.field1957 = arg0;
        this.field1952 = arg1 + 1;
        this.field1953 = new byte[this.field1952];
        this.field1951 = new Thread(this);
        this.field1951.setDaemon(true);
        this.field1951.start();
    }

    public void run() {
        while (true) {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field1956 != null) {
                        return;
                    }
                    if (this.field1954 == 0) {
                        var2 = this.field1952 - this.field1950 - 1;
                    } else if (this.field1954 <= this.field1950) {
                        var2 = this.field1952 - this.field1950;
                    } else {
                        var2 = this.field1954 - this.field1950 - 1;
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
                var5 = this.field1957.read(this.field1953, this.field1950, var2);
                if (var5 == -1) {
                    throw new EOFException();
                }
            } catch (IOException var14) {
                IOException var6 = var14;
                synchronized (this) {
                    this.field1956 = var6;
                    return;
                }
            }
            synchronized (this) {
                this.field1950 = (this.field1950 + var5) % this.field1952;
            }
        }
    }

    @ObfuscatedName("ee.w(IB)Z")
    public boolean method2981(int arg0) throws IOException {
        if (arg0 == 0) {
            return true;
        } else if (arg0 > 0 && arg0 < this.field1952) {
            synchronized (this) {
                int var3;
                if (this.field1954 <= this.field1950) {
                    var3 = this.field1950 - this.field1954;
                } else {
                    var3 = this.field1950 + (this.field1952 - this.field1954);
                }
                if (var3 >= arg0) {
                    return true;
                } else if (this.field1956 == null) {
                    this.notifyAll();
                    return false;
                } else {
                    throw new IOException(this.field1956.toString());
                }
            }
        } else {
            throw new IOException();
        }
    }

    @ObfuscatedName("ee.m(B)I")
    public int method2986() throws IOException {
        synchronized (this) {
            int var2;
            if (this.field1954 <= this.field1950) {
                var2 = this.field1950 - this.field1954;
            } else {
                var2 = this.field1950 + (this.field1952 - this.field1954);
            }
            if (var2 <= 0 && this.field1956 != null) {
                throw new IOException(this.field1956.toString());
            }
            this.notifyAll();
            return var2;
        }
    }

    @ObfuscatedName("ee.q(I)I")
    public int method2982() throws IOException {
        synchronized (this) {
            if (this.field1954 != this.field1950) {
                int var2 = this.field1953[this.field1954] & 0xFF;
                this.field1954 = (this.field1954 + 1) % this.field1952;
                this.notifyAll();
                return var2;
            } else if (this.field1956 == null) {
                return -1;
            } else {
                throw new IOException(this.field1956.toString());
            }
        }
    }

    @ObfuscatedName("ee.x([BIII)I")
    public int method2983(byte[] arg0, int arg1, int arg2) throws IOException {
        if (arg2 < 0 || arg1 < 0 || arg1 + arg2 > arg0.length) {
            throw new IOException();
        }
        synchronized (this) {
            int var5;
            if (this.field1954 <= this.field1950) {
                var5 = this.field1950 - this.field1954;
            } else {
                var5 = this.field1950 + (this.field1952 - this.field1954);
            }
            if (arg2 > var5) {
                arg2 = var5;
            }
            if (arg2 == 0 && this.field1956 != null) {
                throw new IOException(this.field1956.toString());
            }
            if (this.field1954 + arg2 <= this.field1952) {
                System.arraycopy(this.field1953, this.field1954, arg0, arg1, arg2);
            } else {
                int var6 = this.field1952 - this.field1954;
                System.arraycopy(this.field1953, this.field1954, arg0, arg1, var6);
                System.arraycopy(this.field1953, 0, arg0, arg1 + var6, arg2 - var6);
            }
            this.field1954 = (this.field1954 + arg2) % this.field1952;
            this.notifyAll();
            return arg2;
        }
    }

    @ObfuscatedName("ee.j(B)V")
    public void method2984() {
        synchronized (this) {
            if (this.field1956 == null) {
                this.field1956 = new IOException("");
            }
            this.notifyAll();
        }
        try {
            this.field1951.join();
        } catch (InterruptedException var4) {
        }
    }
}
