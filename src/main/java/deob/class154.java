package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

@ObfuscatedName("en")
public class class154 implements Runnable {

    @ObfuscatedName("en.f")
    public Thread field1988;

    @ObfuscatedName("en.l")
    public InputStream field1991;

    @ObfuscatedName("en.w")
    public int field1986;

    @ObfuscatedName("en.s")
    public byte[] field1989;

    @ObfuscatedName("en.e")
    public int field1990 = 0;

    @ObfuscatedName("en.a")
    public int field1987 = 0;

    @ObfuscatedName("en.c")
    public IOException field1992;

    public class154(InputStream arg0, int arg1) {
        this.field1991 = arg0;
        this.field1986 = arg1 + 1;
        this.field1989 = new byte[this.field1986];
        this.field1988 = new Thread(this);
        this.field1988.setDaemon(true);
        this.field1988.start();
    }

    public void run() {
        while (true) {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field1992 != null) {
                        return;
                    }
                    if (this.field1990 == 0) {
                        var2 = this.field1986 - this.field1987 - 1;
                    } else if (this.field1990 <= this.field1987) {
                        var2 = this.field1986 - this.field1987;
                    } else {
                        var2 = this.field1990 - this.field1987 - 1;
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
                var5 = this.field1991.read(this.field1989, this.field1987, var2);
                if (var5 == -1) {
                    throw new EOFException();
                }
            } catch (IOException var14) {
                IOException var6 = var14;
                synchronized (this) {
                    this.field1992 = var6;
                    return;
                }
            }
            synchronized (this) {
                this.field1987 = (this.field1987 + var5) % this.field1986;
            }
        }
    }

    @ObfuscatedName("en.f(IB)Z")
    public boolean method3046(int arg0) throws IOException {
        if (arg0 == 0) {
            return true;
        } else if (arg0 > 0 && arg0 < this.field1986) {
            synchronized (this) {
                int var3;
                if (this.field1990 <= this.field1987) {
                    var3 = this.field1987 - this.field1990;
                } else {
                    var3 = this.field1987 + (this.field1986 - this.field1990);
                }
                if (var3 >= arg0) {
                    return true;
                } else if (this.field1992 == null) {
                    this.notifyAll();
                    return false;
                } else {
                    throw new IOException(this.field1992.toString());
                }
            }
        } else {
            throw new IOException();
        }
    }

    @ObfuscatedName("en.l(I)I")
    public int method3064() throws IOException {
        synchronized (this) {
            int var2;
            if (this.field1990 <= this.field1987) {
                var2 = this.field1987 - this.field1990;
            } else {
                var2 = this.field1987 + (this.field1986 - this.field1990);
            }
            if (var2 <= 0 && this.field1992 != null) {
                throw new IOException(this.field1992.toString());
            }
            this.notifyAll();
            return var2;
        }
    }

    @ObfuscatedName("en.w(I)I")
    public int method3044() throws IOException {
        synchronized (this) {
            if (this.field1990 != this.field1987) {
                int var2 = this.field1989[this.field1990] & 0xFF;
                this.field1990 = (this.field1990 + 1) % this.field1986;
                this.notifyAll();
                return var2;
            } else if (this.field1992 == null) {
                return -1;
            } else {
                throw new IOException(this.field1992.toString());
            }
        }
    }

    @ObfuscatedName("en.s([BIIB)I")
    public int method3045(byte[] arg0, int arg1, int arg2) throws IOException {
        if (arg2 < 0 || arg1 < 0 || arg1 + arg2 > arg0.length) {
            throw new IOException();
        }
        synchronized (this) {
            int var5;
            if (this.field1990 <= this.field1987) {
                var5 = this.field1987 - this.field1990;
            } else {
                var5 = this.field1987 + (this.field1986 - this.field1990);
            }
            if (arg2 > var5) {
                arg2 = var5;
            }
            if (arg2 == 0 && this.field1992 != null) {
                throw new IOException(this.field1992.toString());
            }
            if (this.field1990 + arg2 <= this.field1986) {
                System.arraycopy(this.field1989, this.field1990, arg0, arg1, arg2);
            } else {
                int var6 = this.field1986 - this.field1990;
                System.arraycopy(this.field1989, this.field1990, arg0, arg1, var6);
                System.arraycopy(this.field1989, 0, arg0, arg1 + var6, arg2 - var6);
            }
            this.field1990 = (this.field1990 + arg2) % this.field1986;
            this.notifyAll();
            return arg2;
        }
    }

    @ObfuscatedName("en.e(B)V")
    public void method3054() {
        synchronized (this) {
            if (this.field1992 == null) {
                this.field1992 = new IOException("");
            }
            this.notifyAll();
        }
        try {
            this.field1988.join();
        } catch (InterruptedException var4) {
        }
    }
}
