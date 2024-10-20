package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

@ObfuscatedName("ew")
public class class154 implements Runnable {

    @ObfuscatedName("ew.f")
    public Thread field1979;

    @ObfuscatedName("ew.h")
    public InputStream field1978;

    @ObfuscatedName("ew.e")
    public int field1973;

    @ObfuscatedName("ew.b")
    public byte[] field1974;

    @ObfuscatedName("ew.l")
    public int field1975 = 0;

    @ObfuscatedName("ew.w")
    public int field1976 = 0;

    @ObfuscatedName("ew.d")
    public IOException field1977;

    public class154(InputStream arg0, int arg1) {
        this.field1978 = arg0;
        this.field1973 = arg1 + 1;
        this.field1974 = new byte[this.field1973];
        this.field1979 = new Thread(this);
        this.field1979.setDaemon(true);
        this.field1979.start();
    }

    public void run() {
        while (true) {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field1977 != null) {
                        return;
                    }
                    if (this.field1975 == 0) {
                        var2 = this.field1973 - this.field1976 - 1;
                    } else if (this.field1975 <= this.field1976) {
                        var2 = this.field1973 - this.field1976;
                    } else {
                        var2 = this.field1975 - this.field1976 - 1;
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
                var5 = this.field1978.read(this.field1974, this.field1976, var2);
                if (var5 == -1) {
                    throw new EOFException();
                }
            } catch (IOException var14) {
                IOException var6 = var14;
                synchronized (this) {
                    this.field1977 = var6;
                    return;
                }
            }
            synchronized (this) {
                this.field1976 = (this.field1976 + var5) % this.field1973;
            }
        }
    }

    @ObfuscatedName("ew.f(II)Z")
    public boolean method3022(int arg0) throws IOException {
        if (arg0 == 0) {
            return true;
        } else if (arg0 > 0 && arg0 < this.field1973) {
            synchronized (this) {
                int var3;
                if (this.field1975 <= this.field1976) {
                    var3 = this.field1976 - this.field1975;
                } else {
                    var3 = this.field1976 + (this.field1973 - this.field1975);
                }
                if (var3 >= arg0) {
                    return true;
                } else if (this.field1977 == null) {
                    this.notifyAll();
                    return false;
                } else {
                    throw new IOException(this.field1977.toString());
                }
            }
        } else {
            throw new IOException();
        }
    }

    @ObfuscatedName("ew.h(I)I")
    public int method3023() throws IOException {
        synchronized (this) {
            int var2;
            if (this.field1975 <= this.field1976) {
                var2 = this.field1976 - this.field1975;
            } else {
                var2 = this.field1976 + (this.field1973 - this.field1975);
            }
            if (var2 <= 0 && this.field1977 != null) {
                throw new IOException(this.field1977.toString());
            }
            this.notifyAll();
            return var2;
        }
    }

    @ObfuscatedName("ew.e(S)I")
    public int method3033() throws IOException {
        synchronized (this) {
            if (this.field1976 != this.field1975) {
                int var2 = this.field1974[this.field1975] & 0xFF;
                this.field1975 = (this.field1975 + 1) % this.field1973;
                this.notifyAll();
                return var2;
            } else if (this.field1977 == null) {
                return -1;
            } else {
                throw new IOException(this.field1977.toString());
            }
        }
    }

    @ObfuscatedName("ew.b([BIII)I")
    public int method3025(byte[] arg0, int arg1, int arg2) throws IOException {
        if (arg2 < 0 || arg1 < 0 || arg1 + arg2 > arg0.length) {
            throw new IOException();
        }
        synchronized (this) {
            int var5;
            if (this.field1975 <= this.field1976) {
                var5 = this.field1976 - this.field1975;
            } else {
                var5 = this.field1976 + (this.field1973 - this.field1975);
            }
            if (arg2 > var5) {
                arg2 = var5;
            }
            if (arg2 == 0 && this.field1977 != null) {
                throw new IOException(this.field1977.toString());
            }
            if (this.field1975 + arg2 <= this.field1973) {
                System.arraycopy(this.field1974, this.field1975, arg0, arg1, arg2);
            } else {
                int var6 = this.field1973 - this.field1975;
                System.arraycopy(this.field1974, this.field1975, arg0, arg1, var6);
                System.arraycopy(this.field1974, 0, arg0, arg1 + var6, arg2 - var6);
            }
            this.field1975 = (this.field1975 + arg2) % this.field1973;
            this.notifyAll();
            return arg2;
        }
    }

    @ObfuscatedName("ew.l(B)V")
    public void method3024() {
        synchronized (this) {
            if (this.field1977 == null) {
                this.field1977 = new IOException("");
            }
            this.notifyAll();
        }
        try {
            this.field1979.join();
        } catch (InterruptedException var4) {
        }
    }
}
