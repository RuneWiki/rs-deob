package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

@ObfuscatedName("nm")
public class class381 implements Runnable {

    @ObfuscatedName("nm.c")
    public Thread field4382;

    @ObfuscatedName("nm.p")
    public InputStream field4379;

    @ObfuscatedName("nm.f")
    public int field4386;

    @ObfuscatedName("nm.n")
    public byte[] field4383;

    @ObfuscatedName("nm.k")
    public int field4381 = 0;

    @ObfuscatedName("nm.w")
    public int field4384 = 0;

    @ObfuscatedName("nm.s")
    public IOException field4385;

    public class381(InputStream arg0, int arg1) {
        this.field4379 = arg0;
        this.field4386 = arg1 + 1;
        this.field4383 = new byte[this.field4386];
        this.field4382 = new Thread(this);
        this.field4382.setDaemon(true);
        this.field4382.start();
    }

    public void run() {
        while (true) {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field4385 != null) {
                        return;
                    }
                    if (this.field4381 == 0) {
                        var2 = this.field4386 - this.field4384 - 1;
                    } else if (this.field4381 <= this.field4384) {
                        var2 = this.field4386 - this.field4384;
                    } else {
                        var2 = this.field4381 - this.field4384 - 1;
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
                var5 = this.field4379.read(this.field4383, this.field4384, var2);
                if (var5 == -1) {
                    throw new EOFException();
                }
            } catch (IOException var14) {
                IOException var6 = var14;
                synchronized (this) {
                    this.field4385 = var6;
                    return;
                }
            }
            synchronized (this) {
                this.field4384 = (this.field4384 + var5) % this.field4386;
            }
        }
    }

    @ObfuscatedName("nm.c(II)Z")
    public boolean method6372(int arg0) throws IOException {
        if (arg0 == 0) {
            return true;
        } else if (arg0 > 0 && arg0 < this.field4386) {
            synchronized (this) {
                int var3;
                if (this.field4381 <= this.field4384) {
                    var3 = this.field4384 - this.field4381;
                } else {
                    var3 = this.field4384 + (this.field4386 - this.field4381);
                }
                if (var3 >= arg0) {
                    return true;
                } else if (this.field4385 == null) {
                    this.notifyAll();
                    return false;
                } else {
                    throw new IOException(this.field4385.toString());
                }
            }
        } else {
            throw new IOException();
        }
    }

    @ObfuscatedName("nm.p(I)I")
    public int method6364() throws IOException {
        synchronized (this) {
            int var2;
            if (this.field4381 <= this.field4384) {
                var2 = this.field4384 - this.field4381;
            } else {
                var2 = this.field4384 + (this.field4386 - this.field4381);
            }
            if (var2 <= 0 && this.field4385 != null) {
                throw new IOException(this.field4385.toString());
            }
            this.notifyAll();
            return var2;
        }
    }

    @ObfuscatedName("nm.f(I)I")
    public int method6365() throws IOException {
        synchronized (this) {
            if (this.field4384 != this.field4381) {
                int var2 = this.field4383[this.field4381] & 0xFF;
                this.field4381 = (this.field4381 + 1) % this.field4386;
                this.notifyAll();
                return var2;
            } else if (this.field4385 == null) {
                return -1;
            } else {
                throw new IOException(this.field4385.toString());
            }
        }
    }

    @ObfuscatedName("nm.n([BIIB)I")
    public int method6366(byte[] arg0, int arg1, int arg2) throws IOException {
        if (arg2 < 0 || arg1 < 0 || arg1 + arg2 > arg0.length) {
            throw new IOException();
        }
        synchronized (this) {
            int var5;
            if (this.field4381 <= this.field4384) {
                var5 = this.field4384 - this.field4381;
            } else {
                var5 = this.field4384 + (this.field4386 - this.field4381);
            }
            if (arg2 > var5) {
                arg2 = var5;
            }
            if (arg2 == 0 && this.field4385 != null) {
                throw new IOException(this.field4385.toString());
            }
            if (this.field4381 + arg2 <= this.field4386) {
                System.arraycopy(this.field4383, this.field4381, arg0, arg1, arg2);
            } else {
                int var6 = this.field4386 - this.field4381;
                System.arraycopy(this.field4383, this.field4381, arg0, arg1, var6);
                System.arraycopy(this.field4383, 0, arg0, arg1 + var6, arg2 - var6);
            }
            this.field4381 = (this.field4381 + arg2) % this.field4386;
            this.notifyAll();
            return arg2;
        }
    }

    @ObfuscatedName("nm.k(I)V")
    public void method6367() {
        synchronized (this) {
            if (this.field4385 == null) {
                this.field4385 = new IOException("");
            }
            this.notifyAll();
        }
        try {
            this.field4382.join();
        } catch (InterruptedException var4) {
        }
    }
}
