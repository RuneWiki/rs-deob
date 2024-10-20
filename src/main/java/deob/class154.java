package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

@ObfuscatedName("ep")
public class class154 implements Runnable {

    @ObfuscatedName("ep.g")
    public Thread field1989;

    @ObfuscatedName("ep.r")
    public InputStream field1987;

    @ObfuscatedName("ep.e")
    public int field1991;

    @ObfuscatedName("ep.q")
    public byte[] field1990;

    @ObfuscatedName("ep.c")
    public int field1988 = 0;

    @ObfuscatedName("ep.l")
    public int field1992 = 0;

    @ObfuscatedName("ep.b")
    public IOException field1993;

    public class154(InputStream arg0, int arg1) {
        this.field1987 = arg0;
        this.field1991 = arg1 + 1;
        this.field1990 = new byte[this.field1991];
        this.field1989 = new Thread(this);
        this.field1989.setDaemon(true);
        this.field1989.start();
    }

    public void run() {
        while (true) {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field1993 != null) {
                        return;
                    }
                    if (this.field1988 == 0) {
                        var2 = this.field1991 - this.field1992 - 1;
                    } else if (this.field1988 <= this.field1992) {
                        var2 = this.field1991 - this.field1992;
                    } else {
                        var2 = this.field1988 - this.field1992 - 1;
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
                var5 = this.field1987.read(this.field1990, this.field1992, var2);
                if (var5 == -1) {
                    throw new EOFException();
                }
            } catch (IOException var14) {
                IOException var6 = var14;
                synchronized (this) {
                    this.field1993 = var6;
                    return;
                }
            }
            synchronized (this) {
                this.field1992 = (this.field1992 + var5) % this.field1991;
            }
        }
    }

    @ObfuscatedName("ep.g(II)Z")
    public boolean method3160(int arg0) throws IOException {
        if (arg0 == 0) {
            return true;
        } else if (arg0 > 0 && arg0 < this.field1991) {
            synchronized (this) {
                int var3;
                if (this.field1988 <= this.field1992) {
                    var3 = this.field1992 - this.field1988;
                } else {
                    var3 = this.field1992 + (this.field1991 - this.field1988);
                }
                if (var3 >= arg0) {
                    return true;
                } else if (this.field1993 == null) {
                    this.notifyAll();
                    return false;
                } else {
                    throw new IOException(this.field1993.toString());
                }
            }
        } else {
            throw new IOException();
        }
    }

    @ObfuscatedName("ep.r(I)I")
    public int method3158() throws IOException {
        synchronized (this) {
            int var2;
            if (this.field1988 <= this.field1992) {
                var2 = this.field1992 - this.field1988;
            } else {
                var2 = this.field1992 + (this.field1991 - this.field1988);
            }
            if (var2 <= 0 && this.field1993 != null) {
                throw new IOException(this.field1993.toString());
            }
            this.notifyAll();
            return var2;
        }
    }

    @ObfuscatedName("ep.e(I)I")
    public int method3159() throws IOException {
        synchronized (this) {
            if (this.field1992 != this.field1988) {
                int var2 = this.field1990[this.field1988] & 0xFF;
                this.field1988 = (this.field1988 + 1) % this.field1991;
                this.notifyAll();
                return var2;
            } else if (this.field1993 == null) {
                return -1;
            } else {
                throw new IOException(this.field1993.toString());
            }
        }
    }

    @ObfuscatedName("ep.q([BIII)I")
    public int method3168(byte[] arg0, int arg1, int arg2) throws IOException {
        if (arg2 < 0 || arg1 < 0 || arg1 + arg2 > arg0.length) {
            throw new IOException();
        }
        synchronized (this) {
            int var5;
            if (this.field1988 <= this.field1992) {
                var5 = this.field1992 - this.field1988;
            } else {
                var5 = this.field1992 + (this.field1991 - this.field1988);
            }
            if (arg2 > var5) {
                arg2 = var5;
            }
            if (arg2 == 0 && this.field1993 != null) {
                throw new IOException(this.field1993.toString());
            }
            if (this.field1988 + arg2 <= this.field1991) {
                System.arraycopy(this.field1990, this.field1988, arg0, arg1, arg2);
            } else {
                int var6 = this.field1991 - this.field1988;
                System.arraycopy(this.field1990, this.field1988, arg0, arg1, var6);
                System.arraycopy(this.field1990, 0, arg0, arg1 + var6, arg2 - var6);
            }
            this.field1988 = (this.field1988 + arg2) % this.field1991;
            this.notifyAll();
            return arg2;
        }
    }

    @ObfuscatedName("ep.c(I)V")
    public void method3166() {
        synchronized (this) {
            if (this.field1993 == null) {
                this.field1993 = new IOException("");
            }
            this.notifyAll();
        }
        try {
            this.field1989.join();
        } catch (InterruptedException var4) {
        }
    }
}
