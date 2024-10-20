package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

@ObfuscatedName("og")
public class class399 implements Runnable {

    @ObfuscatedName("og.a")
    public Thread field4509;

    @ObfuscatedName("og.f")
    public InputStream field4510;

    @ObfuscatedName("og.c")
    public int field4511;

    @ObfuscatedName("og.x")
    public byte[] field4512;

    @ObfuscatedName("og.h")
    public int field4514 = 0;

    @ObfuscatedName("og.j")
    public int field4513 = 0;

    @ObfuscatedName("og.y")
    public IOException field4515;

    public class399(InputStream arg0, int arg1) {
        this.field4510 = arg0;
        this.field4511 = arg1 + 1;
        this.field4512 = new byte[this.field4511];
        this.field4509 = new Thread(this);
        this.field4509.setDaemon(true);
        this.field4509.start();
    }

    public void run() {
        while (true) {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field4515 != null) {
                        return;
                    }
                    if (this.field4514 == 0) {
                        var2 = this.field4511 - this.field4513 - 1;
                    } else if (this.field4514 <= this.field4513) {
                        var2 = this.field4511 - this.field4513;
                    } else {
                        var2 = this.field4514 - this.field4513 - 1;
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
                var5 = this.field4510.read(this.field4512, this.field4513, var2);
                if (var5 == -1) {
                    throw new EOFException();
                }
            } catch (IOException var14) {
                IOException var6 = var14;
                synchronized (this) {
                    this.field4515 = var6;
                    return;
                }
            }
            synchronized (this) {
                this.field4513 = (this.field4513 + var5) % this.field4511;
            }
        }
    }

    @ObfuscatedName("og.a(IS)Z")
    public boolean method6873(int arg0) throws IOException {
        if (arg0 == 0) {
            return true;
        } else if (arg0 > 0 && arg0 < this.field4511) {
            synchronized (this) {
                int var3;
                if (this.field4514 <= this.field4513) {
                    var3 = this.field4513 - this.field4514;
                } else {
                    var3 = this.field4513 + (this.field4511 - this.field4514);
                }
                if (var3 >= arg0) {
                    return true;
                } else if (this.field4515 == null) {
                    this.notifyAll();
                    return false;
                } else {
                    throw new IOException(this.field4515.toString());
                }
            }
        } else {
            throw new IOException();
        }
    }

    @ObfuscatedName("og.f(I)I")
    public int method6874() throws IOException {
        synchronized (this) {
            int var2;
            if (this.field4514 <= this.field4513) {
                var2 = this.field4513 - this.field4514;
            } else {
                var2 = this.field4513 + (this.field4511 - this.field4514);
            }
            if (var2 <= 0 && this.field4515 != null) {
                throw new IOException(this.field4515.toString());
            }
            this.notifyAll();
            return var2;
        }
    }

    @ObfuscatedName("og.c(I)I")
    public int method6890() throws IOException {
        synchronized (this) {
            if (this.field4514 != this.field4513) {
                int var2 = this.field4512[this.field4514] & 0xFF;
                this.field4514 = (this.field4514 + 1) % this.field4511;
                this.notifyAll();
                return var2;
            } else if (this.field4515 == null) {
                return -1;
            } else {
                throw new IOException(this.field4515.toString());
            }
        }
    }

    @ObfuscatedName("og.x([BIIB)I")
    public int method6876(byte[] arg0, int arg1, int arg2) throws IOException {
        if (arg2 < 0 || arg1 < 0 || arg1 + arg2 > arg0.length) {
            throw new IOException();
        }
        synchronized (this) {
            int var5;
            if (this.field4514 <= this.field4513) {
                var5 = this.field4513 - this.field4514;
            } else {
                var5 = this.field4513 + (this.field4511 - this.field4514);
            }
            if (arg2 > var5) {
                arg2 = var5;
            }
            if (arg2 == 0 && this.field4515 != null) {
                throw new IOException(this.field4515.toString());
            }
            if (this.field4514 + arg2 <= this.field4511) {
                System.arraycopy(this.field4512, this.field4514, arg0, arg1, arg2);
            } else {
                int var6 = this.field4511 - this.field4514;
                System.arraycopy(this.field4512, this.field4514, arg0, arg1, var6);
                System.arraycopy(this.field4512, 0, arg0, arg1 + var6, arg2 - var6);
            }
            this.field4514 = (this.field4514 + arg2) % this.field4511;
            this.notifyAll();
            return arg2;
        }
    }

    @ObfuscatedName("og.h(I)V")
    public void method6877() {
        synchronized (this) {
            if (this.field4515 == null) {
                this.field4515 = new IOException("");
            }
            this.notifyAll();
        }
        try {
            this.field4509.join();
        } catch (InterruptedException var4) {
        }
    }
}
