package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

@ObfuscatedName("nx")
public class class379 implements Runnable {

    @ObfuscatedName("nx.v")
    public Thread field4286;

    @ObfuscatedName("nx.c")
    public InputStream field4284;

    @ObfuscatedName("nx.i")
    public int field4283;

    @ObfuscatedName("nx.f")
    public byte[] field4285;

    @ObfuscatedName("nx.b")
    public int field4289 = 0;

    @ObfuscatedName("nx.n")
    public int field4288 = 0;

    @ObfuscatedName("nx.s")
    public IOException field4287;

    public class379(InputStream arg0, int arg1) {
        this.field4284 = arg0;
        this.field4283 = arg1 + 1;
        this.field4285 = new byte[this.field4283];
        this.field4286 = new Thread(this);
        this.field4286.setDaemon(true);
        this.field4286.start();
    }

    public void run() {
        while (true) {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field4287 != null) {
                        return;
                    }
                    if (this.field4289 == 0) {
                        var2 = this.field4283 - this.field4288 - 1;
                    } else if (this.field4289 <= this.field4288) {
                        var2 = this.field4283 - this.field4288;
                    } else {
                        var2 = this.field4289 - this.field4288 - 1;
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
                var5 = this.field4284.read(this.field4285, this.field4288, var2);
                if (var5 == -1) {
                    throw new EOFException();
                }
            } catch (IOException var14) {
                IOException var6 = var14;
                synchronized (this) {
                    this.field4287 = var6;
                    return;
                }
            }
            synchronized (this) {
                this.field4288 = (this.field4288 + var5) % this.field4283;
            }
        }
    }

    @ObfuscatedName("nx.v(IB)Z")
    public boolean method6227(int arg0) throws IOException {
        if (arg0 == 0) {
            return true;
        } else if (arg0 > 0 && arg0 < this.field4283) {
            synchronized (this) {
                int var3;
                if (this.field4289 <= this.field4288) {
                    var3 = this.field4288 - this.field4289;
                } else {
                    var3 = this.field4288 + (this.field4283 - this.field4289);
                }
                if (var3 >= arg0) {
                    return true;
                } else if (this.field4287 == null) {
                    this.notifyAll();
                    return false;
                } else {
                    throw new IOException(this.field4287.toString());
                }
            }
        } else {
            throw new IOException();
        }
    }

    @ObfuscatedName("nx.c(I)I")
    public int method6242() throws IOException {
        synchronized (this) {
            int var2;
            if (this.field4289 <= this.field4288) {
                var2 = this.field4288 - this.field4289;
            } else {
                var2 = this.field4288 + (this.field4283 - this.field4289);
            }
            if (var2 <= 0 && this.field4287 != null) {
                throw new IOException(this.field4287.toString());
            }
            this.notifyAll();
            return var2;
        }
    }

    @ObfuscatedName("nx.i(I)I")
    public int method6229() throws IOException {
        synchronized (this) {
            if (this.field4289 != this.field4288) {
                int var2 = this.field4285[this.field4289] & 0xFF;
                this.field4289 = (this.field4289 + 1) % this.field4283;
                this.notifyAll();
                return var2;
            } else if (this.field4287 == null) {
                return -1;
            } else {
                throw new IOException(this.field4287.toString());
            }
        }
    }

    @ObfuscatedName("nx.f([BIII)I")
    public int method6230(byte[] arg0, int arg1, int arg2) throws IOException {
        if (arg2 < 0 || arg1 < 0 || arg1 + arg2 > arg0.length) {
            throw new IOException();
        }
        synchronized (this) {
            int var5;
            if (this.field4289 <= this.field4288) {
                var5 = this.field4288 - this.field4289;
            } else {
                var5 = this.field4288 + (this.field4283 - this.field4289);
            }
            if (arg2 > var5) {
                arg2 = var5;
            }
            if (arg2 == 0 && this.field4287 != null) {
                throw new IOException(this.field4287.toString());
            }
            if (this.field4289 + arg2 <= this.field4283) {
                System.arraycopy(this.field4285, this.field4289, arg0, arg1, arg2);
            } else {
                int var6 = this.field4283 - this.field4289;
                System.arraycopy(this.field4285, this.field4289, arg0, arg1, var6);
                System.arraycopy(this.field4285, 0, arg0, arg1 + var6, arg2 - var6);
            }
            this.field4289 = (this.field4289 + arg2) % this.field4283;
            this.notifyAll();
            return arg2;
        }
    }

    @ObfuscatedName("nx.b(I)V")
    public void method6231() {
        synchronized (this) {
            if (this.field4287 == null) {
                this.field4287 = new IOException("");
            }
            this.notifyAll();
        }
        try {
            this.field4286.join();
        } catch (InterruptedException var4) {
        }
    }
}
