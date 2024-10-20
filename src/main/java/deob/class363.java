package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

@ObfuscatedName("mv")
public class class363 implements Runnable {

    @ObfuscatedName("mv.c")
    public Thread field4186;

    @ObfuscatedName("mv.l")
    public InputStream field4187;

    @ObfuscatedName("mv.s")
    public int field4188;

    @ObfuscatedName("mv.e")
    public byte[] field4189;

    @ObfuscatedName("mv.r")
    public int field4191 = 0;

    @ObfuscatedName("mv.o")
    public int field4192 = 0;

    @ObfuscatedName("mv.i")
    public IOException field4190;

    public class363(InputStream arg0, int arg1) {
        this.field4187 = arg0;
        this.field4188 = arg1 + 1;
        this.field4189 = new byte[this.field4188];
        this.field4186 = new Thread(this);
        this.field4186.setDaemon(true);
        this.field4186.start();
    }

    public void run() {
        while (true) {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field4190 != null) {
                        return;
                    }
                    if (this.field4191 == 0) {
                        var2 = this.field4188 - this.field4192 - 1;
                    } else if (this.field4191 <= this.field4192) {
                        var2 = this.field4188 - this.field4192;
                    } else {
                        var2 = this.field4191 - this.field4192 - 1;
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
                var5 = this.field4187.read(this.field4189, this.field4192, var2);
                if (var5 == -1) {
                    throw new EOFException();
                }
            } catch (IOException var14) {
                IOException var6 = var14;
                synchronized (this) {
                    this.field4190 = var6;
                    return;
                }
            }
            synchronized (this) {
                this.field4192 = (this.field4192 + var5) % this.field4188;
            }
        }
    }

    @ObfuscatedName("mv.c(IB)Z")
    public boolean method5889(int arg0) throws IOException {
        if (arg0 == 0) {
            return true;
        } else if (arg0 > 0 && arg0 < this.field4188) {
            synchronized (this) {
                int var3;
                if (this.field4191 <= this.field4192) {
                    var3 = this.field4192 - this.field4191;
                } else {
                    var3 = this.field4192 + (this.field4188 - this.field4191);
                }
                if (var3 >= arg0) {
                    return true;
                } else if (this.field4190 == null) {
                    this.notifyAll();
                    return false;
                } else {
                    throw new IOException(this.field4190.toString());
                }
            }
        } else {
            throw new IOException();
        }
    }

    @ObfuscatedName("mv.l(B)I")
    public int method5883() throws IOException {
        synchronized (this) {
            int var2;
            if (this.field4191 <= this.field4192) {
                var2 = this.field4192 - this.field4191;
            } else {
                var2 = this.field4192 + (this.field4188 - this.field4191);
            }
            if (var2 <= 0 && this.field4190 != null) {
                throw new IOException(this.field4190.toString());
            }
            this.notifyAll();
            return var2;
        }
    }

    @ObfuscatedName("mv.s(I)I")
    public int method5884() throws IOException {
        synchronized (this) {
            if (this.field4192 != this.field4191) {
                int var2 = this.field4189[this.field4191] & 0xFF;
                this.field4191 = (this.field4191 + 1) % this.field4188;
                this.notifyAll();
                return var2;
            } else if (this.field4190 == null) {
                return -1;
            } else {
                throw new IOException(this.field4190.toString());
            }
        }
    }

    @ObfuscatedName("mv.e([BIIS)I")
    public int method5895(byte[] arg0, int arg1, int arg2) throws IOException {
        if (arg2 < 0 || arg1 < 0 || arg1 + arg2 > arg0.length) {
            throw new IOException();
        }
        synchronized (this) {
            int var5;
            if (this.field4191 <= this.field4192) {
                var5 = this.field4192 - this.field4191;
            } else {
                var5 = this.field4192 + (this.field4188 - this.field4191);
            }
            if (arg2 > var5) {
                arg2 = var5;
            }
            if (arg2 == 0 && this.field4190 != null) {
                throw new IOException(this.field4190.toString());
            }
            if (this.field4191 + arg2 <= this.field4188) {
                System.arraycopy(this.field4189, this.field4191, arg0, arg1, arg2);
            } else {
                int var6 = this.field4188 - this.field4191;
                System.arraycopy(this.field4189, this.field4191, arg0, arg1, var6);
                System.arraycopy(this.field4189, 0, arg0, arg1 + var6, arg2 - var6);
            }
            this.field4191 = (this.field4191 + arg2) % this.field4188;
            this.notifyAll();
            return arg2;
        }
    }

    @ObfuscatedName("mv.r(B)V")
    public void method5886() {
        synchronized (this) {
            if (this.field4190 == null) {
                this.field4190 = new IOException("");
            }
            this.notifyAll();
        }
        try {
            this.field4186.join();
        } catch (InterruptedException var4) {
        }
    }
}
