package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

@ObfuscatedName("mw")
public class class345 implements Runnable {

    @ObfuscatedName("mw.n")
    public Thread field3974;

    @ObfuscatedName("mw.c")
    public InputStream field3975;

    @ObfuscatedName("mw.m")
    public int field3976;

    @ObfuscatedName("mw.k")
    public byte[] field3977;

    @ObfuscatedName("mw.o")
    public int field3978 = 0;

    @ObfuscatedName("mw.g")
    public int field3979 = 0;

    @ObfuscatedName("mw.z")
    public IOException field3980;

    public class345(InputStream arg0, int arg1) {
        this.field3975 = arg0;
        this.field3976 = arg1 + 1;
        this.field3977 = new byte[this.field3976];
        this.field3974 = new Thread(this);
        this.field3974.setDaemon(true);
        this.field3974.start();
    }

    public void run() {
        while (true) {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field3980 != null) {
                        return;
                    }
                    if (this.field3978 == 0) {
                        var2 = this.field3976 - this.field3979 - 1;
                    } else if (this.field3978 <= this.field3979) {
                        var2 = this.field3976 - this.field3979;
                    } else {
                        var2 = this.field3978 - this.field3979 - 1;
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
                var5 = this.field3975.read(this.field3977, this.field3979, var2);
                if (var5 == -1) {
                    throw new EOFException();
                }
            } catch (IOException var14) {
                IOException var6 = var14;
                synchronized (this) {
                    this.field3980 = var6;
                    return;
                }
            }
            synchronized (this) {
                this.field3979 = (this.field3979 + var5) % this.field3976;
            }
        }
    }

    @ObfuscatedName("mw.n(II)Z")
    public boolean method5601(int arg0) throws IOException {
        if (arg0 == 0) {
            return true;
        } else if (arg0 > 0 && arg0 < this.field3976) {
            synchronized (this) {
                int var3;
                if (this.field3978 <= this.field3979) {
                    var3 = this.field3979 - this.field3978;
                } else {
                    var3 = this.field3979 + (this.field3976 - this.field3978);
                }
                if (var3 >= arg0) {
                    return true;
                } else if (this.field3980 == null) {
                    this.notifyAll();
                    return false;
                } else {
                    throw new IOException(this.field3980.toString());
                }
            }
        } else {
            throw new IOException();
        }
    }

    @ObfuscatedName("mw.c(I)I")
    public int method5583() throws IOException {
        synchronized (this) {
            int var2;
            if (this.field3978 <= this.field3979) {
                var2 = this.field3979 - this.field3978;
            } else {
                var2 = this.field3979 + (this.field3976 - this.field3978);
            }
            if (var2 <= 0 && this.field3980 != null) {
                throw new IOException(this.field3980.toString());
            }
            this.notifyAll();
            return var2;
        }
    }

    @ObfuscatedName("mw.m(I)I")
    public int method5584() throws IOException {
        synchronized (this) {
            if (this.field3979 != this.field3978) {
                int var2 = this.field3977[this.field3978] & 0xFF;
                this.field3978 = (this.field3978 + 1) % this.field3976;
                this.notifyAll();
                return var2;
            } else if (this.field3980 == null) {
                return -1;
            } else {
                throw new IOException(this.field3980.toString());
            }
        }
    }

    @ObfuscatedName("mw.k([BIII)I")
    public int method5585(byte[] arg0, int arg1, int arg2) throws IOException {
        if (arg2 < 0 || arg1 < 0 || arg1 + arg2 > arg0.length) {
            throw new IOException();
        }
        synchronized (this) {
            int var5;
            if (this.field3978 <= this.field3979) {
                var5 = this.field3979 - this.field3978;
            } else {
                var5 = this.field3979 + (this.field3976 - this.field3978);
            }
            if (arg2 > var5) {
                arg2 = var5;
            }
            if (arg2 == 0 && this.field3980 != null) {
                throw new IOException(this.field3980.toString());
            }
            if (this.field3978 + arg2 <= this.field3976) {
                System.arraycopy(this.field3977, this.field3978, arg0, arg1, arg2);
            } else {
                int var6 = this.field3976 - this.field3978;
                System.arraycopy(this.field3977, this.field3978, arg0, arg1, var6);
                System.arraycopy(this.field3977, 0, arg0, arg1 + var6, arg2 - var6);
            }
            this.field3978 = (this.field3978 + arg2) % this.field3976;
            this.notifyAll();
            return arg2;
        }
    }

    @ObfuscatedName("mw.o(B)V")
    public void method5586() {
        synchronized (this) {
            if (this.field3980 == null) {
                this.field3980 = new IOException("");
            }
            this.notifyAll();
        }
        try {
            this.field3974.join();
        } catch (InterruptedException var4) {
        }
    }
}
