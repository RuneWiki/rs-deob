package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

@ObfuscatedName("es")
public class class154 implements Runnable {

    @ObfuscatedName("es.c")
    public Thread field1985;

    @ObfuscatedName("es.q")
    public InputStream field1984;

    @ObfuscatedName("es.m")
    public int field1986;

    @ObfuscatedName("es.j")
    public byte[] field1987;

    @ObfuscatedName("es.g")
    public int field1988 = 0;

    @ObfuscatedName("es.i")
    public int field1989 = 0;

    @ObfuscatedName("es.h")
    public IOException field1990;

    public class154(InputStream arg0, int arg1) {
        this.field1984 = arg0;
        this.field1986 = arg1 + 1;
        this.field1987 = new byte[this.field1986];
        this.field1985 = new Thread(this);
        this.field1985.setDaemon(true);
        this.field1985.start();
    }

    public void run() {
        while (true) {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field1990 != null) {
                        return;
                    }
                    if (this.field1988 == 0) {
                        var2 = this.field1986 - this.field1989 - 1;
                    } else if (this.field1988 <= this.field1989) {
                        var2 = this.field1986 - this.field1989;
                    } else {
                        var2 = this.field1988 - this.field1989 - 1;
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
                var5 = this.field1984.read(this.field1987, this.field1989, var2);
                if (var5 == -1) {
                    throw new EOFException();
                }
            } catch (IOException var14) {
                IOException var6 = var14;
                synchronized (this) {
                    this.field1990 = var6;
                    return;
                }
            }
            synchronized (this) {
                this.field1989 = (this.field1989 + var5) % this.field1986;
            }
        }
    }

    @ObfuscatedName("es.c(IB)Z")
    public boolean method2961(int arg0) throws IOException {
        if (arg0 == 0) {
            return true;
        } else if (arg0 > 0 && arg0 < this.field1986) {
            synchronized (this) {
                int var3;
                if (this.field1988 <= this.field1989) {
                    var3 = this.field1989 - this.field1988;
                } else {
                    var3 = this.field1989 + (this.field1986 - this.field1988);
                }
                if (var3 >= arg0) {
                    return true;
                } else if (this.field1990 == null) {
                    this.notifyAll();
                    return false;
                } else {
                    throw new IOException(this.field1990.toString());
                }
            }
        } else {
            throw new IOException();
        }
    }

    @ObfuscatedName("es.q(B)I")
    public int method2962() throws IOException {
        synchronized (this) {
            int var2;
            if (this.field1988 <= this.field1989) {
                var2 = this.field1989 - this.field1988;
            } else {
                var2 = this.field1989 + (this.field1986 - this.field1988);
            }
            if (var2 <= 0 && this.field1990 != null) {
                throw new IOException(this.field1990.toString());
            }
            this.notifyAll();
            return var2;
        }
    }

    @ObfuscatedName("es.m(B)I")
    public int method2963() throws IOException {
        synchronized (this) {
            if (this.field1989 != this.field1988) {
                int var2 = this.field1987[this.field1988] & 0xFF;
                this.field1988 = (this.field1988 + 1) % this.field1986;
                this.notifyAll();
                return var2;
            } else if (this.field1990 == null) {
                return -1;
            } else {
                throw new IOException(this.field1990.toString());
            }
        }
    }

    @ObfuscatedName("es.j([BIII)I")
    public int method2964(byte[] arg0, int arg1, int arg2) throws IOException {
        if (arg2 < 0 || arg1 < 0 || arg1 + arg2 > arg0.length) {
            throw new IOException();
        }
        synchronized (this) {
            int var5;
            if (this.field1988 <= this.field1989) {
                var5 = this.field1989 - this.field1988;
            } else {
                var5 = this.field1989 + (this.field1986 - this.field1988);
            }
            if (arg2 > var5) {
                arg2 = var5;
            }
            if (arg2 == 0 && this.field1990 != null) {
                throw new IOException(this.field1990.toString());
            }
            if (this.field1988 + arg2 <= this.field1986) {
                System.arraycopy(this.field1987, this.field1988, arg0, arg1, arg2);
            } else {
                int var6 = this.field1986 - this.field1988;
                System.arraycopy(this.field1987, this.field1988, arg0, arg1, var6);
                System.arraycopy(this.field1987, 0, arg0, arg1 + var6, arg2 - var6);
            }
            this.field1988 = (this.field1988 + arg2) % this.field1986;
            this.notifyAll();
            return arg2;
        }
    }

    @ObfuscatedName("es.g(B)V")
    public void method2965() {
        synchronized (this) {
            if (this.field1990 == null) {
                this.field1990 = new IOException("");
            }
            this.notifyAll();
        }
        try {
            this.field1985.join();
        } catch (InterruptedException var4) {
        }
    }
}
