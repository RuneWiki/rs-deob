package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

@ObfuscatedName("np")
public class class380 implements Runnable {

    @ObfuscatedName("np.o")
    public Thread field4351;

    @ObfuscatedName("np.q")
    public InputStream field4346;

    @ObfuscatedName("np.l")
    public int field4347;

    @ObfuscatedName("np.k")
    public byte[] field4348;

    @ObfuscatedName("np.a")
    public int field4349 = 0;

    @ObfuscatedName("np.m")
    public int field4354 = 0;

    @ObfuscatedName("np.p")
    public IOException field4352;

    public class380(InputStream arg0, int arg1) {
        this.field4346 = arg0;
        this.field4347 = arg1 + 1;
        this.field4348 = new byte[this.field4347];
        this.field4351 = new Thread(this);
        this.field4351.setDaemon(true);
        this.field4351.start();
    }

    public void run() {
        while (true) {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field4352 != null) {
                        return;
                    }
                    if (this.field4349 == 0) {
                        var2 = this.field4347 - this.field4354 - 1;
                    } else if (this.field4349 <= this.field4354) {
                        var2 = this.field4347 - this.field4354;
                    } else {
                        var2 = this.field4349 - this.field4354 - 1;
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
                var5 = this.field4346.read(this.field4348, this.field4354, var2);
                if (var5 == -1) {
                    throw new EOFException();
                }
            } catch (IOException var14) {
                IOException var6 = var14;
                synchronized (this) {
                    this.field4352 = var6;
                    return;
                }
            }
            synchronized (this) {
                this.field4354 = (this.field4354 + var5) % this.field4347;
            }
        }
    }

    @ObfuscatedName("np.o(II)Z")
    public boolean method6107(int arg0) throws IOException {
        if (arg0 == 0) {
            return true;
        } else if (arg0 > 0 && arg0 < this.field4347) {
            synchronized (this) {
                int var3;
                if (this.field4349 <= this.field4354) {
                    var3 = this.field4354 - this.field4349;
                } else {
                    var3 = this.field4354 + (this.field4347 - this.field4349);
                }
                if (var3 >= arg0) {
                    return true;
                } else if (this.field4352 == null) {
                    this.notifyAll();
                    return false;
                } else {
                    throw new IOException(this.field4352.toString());
                }
            }
        } else {
            throw new IOException();
        }
    }

    @ObfuscatedName("np.q(I)I")
    public int method6108() throws IOException {
        synchronized (this) {
            int var2;
            if (this.field4349 <= this.field4354) {
                var2 = this.field4354 - this.field4349;
            } else {
                var2 = this.field4354 + (this.field4347 - this.field4349);
            }
            if (var2 <= 0 && this.field4352 != null) {
                throw new IOException(this.field4352.toString());
            }
            this.notifyAll();
            return var2;
        }
    }

    @ObfuscatedName("np.l(B)I")
    public int method6109() throws IOException {
        synchronized (this) {
            if (this.field4354 != this.field4349) {
                int var2 = this.field4348[this.field4349] & 0xFF;
                this.field4349 = (this.field4349 + 1) % this.field4347;
                this.notifyAll();
                return var2;
            } else if (this.field4352 == null) {
                return -1;
            } else {
                throw new IOException(this.field4352.toString());
            }
        }
    }

    @ObfuscatedName("np.k([BIII)I")
    public int method6106(byte[] arg0, int arg1, int arg2) throws IOException {
        if (arg2 < 0 || arg1 < 0 || arg1 + arg2 > arg0.length) {
            throw new IOException();
        }
        synchronized (this) {
            int var5;
            if (this.field4349 <= this.field4354) {
                var5 = this.field4354 - this.field4349;
            } else {
                var5 = this.field4354 + (this.field4347 - this.field4349);
            }
            if (arg2 > var5) {
                arg2 = var5;
            }
            if (arg2 == 0 && this.field4352 != null) {
                throw new IOException(this.field4352.toString());
            }
            if (this.field4349 + arg2 <= this.field4347) {
                System.arraycopy(this.field4348, this.field4349, arg0, arg1, arg2);
            } else {
                int var6 = this.field4347 - this.field4349;
                System.arraycopy(this.field4348, this.field4349, arg0, arg1, var6);
                System.arraycopy(this.field4348, 0, arg0, arg1 + var6, arg2 - var6);
            }
            this.field4349 = (this.field4349 + arg2) % this.field4347;
            this.notifyAll();
            return arg2;
        }
    }

    @ObfuscatedName("np.a(I)V")
    public void method6111() {
        synchronized (this) {
            if (this.field4352 == null) {
                this.field4352 = new IOException("");
            }
            this.notifyAll();
        }
        try {
            this.field4351.join();
        } catch (InterruptedException var4) {
        }
    }
}
