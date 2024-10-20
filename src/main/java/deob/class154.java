package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

@ObfuscatedName("ej")
public class class154 implements Runnable {

    @ObfuscatedName("ej.v")
    public Thread field1977;

    @ObfuscatedName("ej.s")
    public InputStream field1974;

    @ObfuscatedName("ej.o")
    public int field1975;

    @ObfuscatedName("ej.k")
    public byte[] field1976;

    @ObfuscatedName("ej.u")
    public int field1973 = 0;

    @ObfuscatedName("ej.i")
    public int field1979 = 0;

    @ObfuscatedName("ej.t")
    public IOException field1980;

    public class154(InputStream arg0, int arg1) {
        this.field1974 = arg0;
        this.field1975 = arg1 + 1;
        this.field1976 = new byte[this.field1975];
        this.field1977 = new Thread(this);
        this.field1977.setDaemon(true);
        this.field1977.start();
    }

    public void run() {
        while (true) {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field1980 != null) {
                        return;
                    }
                    if (this.field1973 == 0) {
                        var2 = this.field1975 - this.field1979 - 1;
                    } else if (this.field1973 <= this.field1979) {
                        var2 = this.field1975 - this.field1979;
                    } else {
                        var2 = this.field1973 - this.field1979 - 1;
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
                var5 = this.field1974.read(this.field1976, this.field1979, var2);
                if (var5 == -1) {
                    throw new EOFException();
                }
            } catch (IOException var14) {
                IOException var6 = var14;
                synchronized (this) {
                    this.field1980 = var6;
                    return;
                }
            }
            synchronized (this) {
                this.field1979 = (this.field1979 + var5) % this.field1975;
            }
        }
    }

    @ObfuscatedName("ej.v(IB)Z")
    public boolean method2972(int arg0) throws IOException {
        if (arg0 == 0) {
            return true;
        } else if (arg0 > 0 && arg0 < this.field1975) {
            synchronized (this) {
                int var3;
                if (this.field1973 <= this.field1979) {
                    var3 = this.field1979 - this.field1973;
                } else {
                    var3 = this.field1979 + (this.field1975 - this.field1973);
                }
                if (var3 >= arg0) {
                    return true;
                } else if (this.field1980 == null) {
                    this.notifyAll();
                    return false;
                } else {
                    throw new IOException(this.field1980.toString());
                }
            }
        } else {
            throw new IOException();
        }
    }

    @ObfuscatedName("ej.s(B)I")
    public int method2973() throws IOException {
        synchronized (this) {
            int var2;
            if (this.field1973 <= this.field1979) {
                var2 = this.field1979 - this.field1973;
            } else {
                var2 = this.field1979 + (this.field1975 - this.field1973);
            }
            if (var2 <= 0 && this.field1980 != null) {
                throw new IOException(this.field1980.toString());
            }
            this.notifyAll();
            return var2;
        }
    }

    @ObfuscatedName("ej.o(I)I")
    public int method2986() throws IOException {
        synchronized (this) {
            if (this.field1979 != this.field1973) {
                int var2 = this.field1976[this.field1973] & 0xFF;
                this.field1973 = (this.field1973 + 1) % this.field1975;
                this.notifyAll();
                return var2;
            } else if (this.field1980 == null) {
                return -1;
            } else {
                throw new IOException(this.field1980.toString());
            }
        }
    }

    @ObfuscatedName("ej.k([BIIB)I")
    public int method2978(byte[] arg0, int arg1, int arg2) throws IOException {
        if (arg2 < 0 || arg1 < 0 || arg1 + arg2 > arg0.length) {
            throw new IOException();
        }
        synchronized (this) {
            int var5;
            if (this.field1973 <= this.field1979) {
                var5 = this.field1979 - this.field1973;
            } else {
                var5 = this.field1979 + (this.field1975 - this.field1973);
            }
            if (arg2 > var5) {
                arg2 = var5;
            }
            if (arg2 == 0 && this.field1980 != null) {
                throw new IOException(this.field1980.toString());
            }
            if (this.field1973 + arg2 <= this.field1975) {
                System.arraycopy(this.field1976, this.field1973, arg0, arg1, arg2);
            } else {
                int var6 = this.field1975 - this.field1973;
                System.arraycopy(this.field1976, this.field1973, arg0, arg1, var6);
                System.arraycopy(this.field1976, 0, arg0, arg1 + var6, arg2 - var6);
            }
            this.field1973 = (this.field1973 + arg2) % this.field1975;
            this.notifyAll();
            return arg2;
        }
    }

    @ObfuscatedName("ej.u(I)V")
    public void method2975() {
        synchronized (this) {
            if (this.field1980 == null) {
                this.field1980 = new IOException("");
            }
            this.notifyAll();
        }
        try {
            this.field1977.join();
        } catch (InterruptedException var4) {
        }
    }
}
