package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

@ObfuscatedName("me")
public class class346 implements Runnable {

    @ObfuscatedName("me.i")
    public Thread field3982;

    @ObfuscatedName("me.w")
    public InputStream field3981;

    @ObfuscatedName("me.s")
    public int field3986;

    @ObfuscatedName("me.a")
    public byte[] field3983;

    @ObfuscatedName("me.o")
    public int field3984 = 0;

    @ObfuscatedName("me.g")
    public int field3980 = 0;

    @ObfuscatedName("me.e")
    public IOException field3987;

    public class346(InputStream arg0, int arg1) {
        this.field3981 = arg0;
        this.field3986 = arg1 + 1;
        this.field3983 = new byte[this.field3986];
        this.field3982 = new Thread(this);
        this.field3982.setDaemon(true);
        this.field3982.start();
    }

    public void run() {
        while (true) {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field3987 != null) {
                        return;
                    }
                    if (this.field3984 == 0) {
                        var2 = this.field3986 - this.field3980 - 1;
                    } else if (this.field3984 <= this.field3980) {
                        var2 = this.field3986 - this.field3980;
                    } else {
                        var2 = this.field3984 - this.field3980 - 1;
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
                var5 = this.field3981.read(this.field3983, this.field3980, var2);
                if (var5 == -1) {
                    throw new EOFException();
                }
            } catch (IOException var14) {
                IOException var6 = var14;
                synchronized (this) {
                    this.field3987 = var6;
                    return;
                }
            }
            synchronized (this) {
                this.field3980 = (this.field3980 + var5) % this.field3986;
            }
        }
    }

    @ObfuscatedName("me.i(II)Z")
    public boolean method5604(int arg0) throws IOException {
        if (arg0 == 0) {
            return true;
        } else if (arg0 > 0 && arg0 < this.field3986) {
            synchronized (this) {
                int var3;
                if (this.field3984 <= this.field3980) {
                    var3 = this.field3980 - this.field3984;
                } else {
                    var3 = this.field3980 + (this.field3986 - this.field3984);
                }
                if (var3 >= arg0) {
                    return true;
                } else if (this.field3987 == null) {
                    this.notifyAll();
                    return false;
                } else {
                    throw new IOException(this.field3987.toString());
                }
            }
        } else {
            throw new IOException();
        }
    }

    @ObfuscatedName("me.w(B)I")
    public int method5609() throws IOException {
        synchronized (this) {
            int var2;
            if (this.field3984 <= this.field3980) {
                var2 = this.field3980 - this.field3984;
            } else {
                var2 = this.field3980 + (this.field3986 - this.field3984);
            }
            if (var2 <= 0 && this.field3987 != null) {
                throw new IOException(this.field3987.toString());
            }
            this.notifyAll();
            return var2;
        }
    }

    @ObfuscatedName("me.s(B)I")
    public int method5603() throws IOException {
        synchronized (this) {
            if (this.field3984 != this.field3980) {
                int var2 = this.field3983[this.field3984] & 0xFF;
                this.field3984 = (this.field3984 + 1) % this.field3986;
                this.notifyAll();
                return var2;
            } else if (this.field3987 == null) {
                return -1;
            } else {
                throw new IOException(this.field3987.toString());
            }
        }
    }

    @ObfuscatedName("me.a([BIIS)I")
    public int method5619(byte[] arg0, int arg1, int arg2) throws IOException {
        if (arg2 < 0 || arg1 < 0 || arg1 + arg2 > arg0.length) {
            throw new IOException();
        }
        synchronized (this) {
            int var5;
            if (this.field3984 <= this.field3980) {
                var5 = this.field3980 - this.field3984;
            } else {
                var5 = this.field3980 + (this.field3986 - this.field3984);
            }
            if (arg2 > var5) {
                arg2 = var5;
            }
            if (arg2 == 0 && this.field3987 != null) {
                throw new IOException(this.field3987.toString());
            }
            if (this.field3984 + arg2 <= this.field3986) {
                System.arraycopy(this.field3983, this.field3984, arg0, arg1, arg2);
            } else {
                int var6 = this.field3986 - this.field3984;
                System.arraycopy(this.field3983, this.field3984, arg0, arg1, var6);
                System.arraycopy(this.field3983, 0, arg0, arg1 + var6, arg2 - var6);
            }
            this.field3984 = (this.field3984 + arg2) % this.field3986;
            this.notifyAll();
            return arg2;
        }
    }

    @ObfuscatedName("me.o(I)V")
    public void method5601() {
        synchronized (this) {
            if (this.field3987 == null) {
                this.field3987 = new IOException("");
            }
            this.notifyAll();
        }
        try {
            this.field3982.join();
        } catch (InterruptedException var4) {
        }
    }
}
