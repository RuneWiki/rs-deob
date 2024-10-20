package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

@ObfuscatedName("ed")
public class class154 implements Runnable {

    @ObfuscatedName("ed.y")
    public Thread field1974;

    @ObfuscatedName("ed.c")
    public InputStream field1970;

    @ObfuscatedName("ed.n")
    public int field1969;

    @ObfuscatedName("ed.u")
    public byte[] field1971;

    @ObfuscatedName("ed.i")
    public int field1973 = 0;

    @ObfuscatedName("ed.r")
    public int field1976 = 0;

    @ObfuscatedName("ed.j")
    public IOException field1975;

    public class154(InputStream arg0, int arg1) {
        this.field1970 = arg0;
        this.field1969 = arg1 + 1;
        this.field1971 = new byte[this.field1969];
        this.field1974 = new Thread(this);
        this.field1974.setDaemon(true);
        this.field1974.start();
    }

    public void run() {
        while (true) {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field1975 != null) {
                        return;
                    }
                    if (this.field1973 == 0) {
                        var2 = this.field1969 - this.field1976 - 1;
                    } else if (this.field1973 <= this.field1976) {
                        var2 = this.field1969 - this.field1976;
                    } else {
                        var2 = this.field1973 - this.field1976 - 1;
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
                var5 = this.field1970.read(this.field1971, this.field1976, var2);
                if (var5 == -1) {
                    throw new EOFException();
                }
            } catch (IOException var14) {
                IOException var6 = var14;
                synchronized (this) {
                    this.field1975 = var6;
                    return;
                }
            }
            synchronized (this) {
                this.field1976 = (this.field1976 + var5) % this.field1969;
            }
        }
    }

    @ObfuscatedName("ed.y(II)Z")
    public boolean method2962(int arg0) throws IOException {
        if (arg0 == 0) {
            return true;
        } else if (arg0 > 0 && arg0 < this.field1969) {
            synchronized (this) {
                int var3;
                if (this.field1973 <= this.field1976) {
                    var3 = this.field1976 - this.field1973;
                } else {
                    var3 = this.field1976 + (this.field1969 - this.field1973);
                }
                if (var3 >= arg0) {
                    return true;
                } else if (this.field1975 == null) {
                    this.notifyAll();
                    return false;
                } else {
                    throw new IOException(this.field1975.toString());
                }
            }
        } else {
            throw new IOException();
        }
    }

    @ObfuscatedName("ed.c(I)I")
    public int method2963() throws IOException {
        synchronized (this) {
            int var2;
            if (this.field1973 <= this.field1976) {
                var2 = this.field1976 - this.field1973;
            } else {
                var2 = this.field1976 + (this.field1969 - this.field1973);
            }
            if (var2 <= 0 && this.field1975 != null) {
                throw new IOException(this.field1975.toString());
            }
            this.notifyAll();
            return var2;
        }
    }

    @ObfuscatedName("ed.n(I)I")
    public int method2964() throws IOException {
        synchronized (this) {
            if (this.field1976 != this.field1973) {
                int var2 = this.field1971[this.field1973] & 0xFF;
                this.field1973 = (this.field1973 + 1) % this.field1969;
                this.notifyAll();
                return var2;
            } else if (this.field1975 == null) {
                return -1;
            } else {
                throw new IOException(this.field1975.toString());
            }
        }
    }

    @ObfuscatedName("ed.u([BIII)I")
    public int method2965(byte[] arg0, int arg1, int arg2) throws IOException {
        if (arg2 < 0 || arg1 < 0 || arg1 + arg2 > arg0.length) {
            throw new IOException();
        }
        synchronized (this) {
            int var5;
            if (this.field1973 <= this.field1976) {
                var5 = this.field1976 - this.field1973;
            } else {
                var5 = this.field1976 + (this.field1969 - this.field1973);
            }
            if (arg2 > var5) {
                arg2 = var5;
            }
            if (arg2 == 0 && this.field1975 != null) {
                throw new IOException(this.field1975.toString());
            }
            if (this.field1973 + arg2 <= this.field1969) {
                System.arraycopy(this.field1971, this.field1973, arg0, arg1, arg2);
            } else {
                int var6 = this.field1969 - this.field1973;
                System.arraycopy(this.field1971, this.field1973, arg0, arg1, var6);
                System.arraycopy(this.field1971, 0, arg0, arg1 + var6, arg2 - var6);
            }
            this.field1973 = (this.field1973 + arg2) % this.field1969;
            this.notifyAll();
            return arg2;
        }
    }

    @ObfuscatedName("ed.i(B)V")
    public void method2977() {
        synchronized (this) {
            if (this.field1975 == null) {
                this.field1975 = new IOException("");
            }
            this.notifyAll();
        }
        try {
            this.field1974.join();
        } catch (InterruptedException var4) {
        }
    }
}
