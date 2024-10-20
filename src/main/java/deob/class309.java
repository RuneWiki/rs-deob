package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

@ObfuscatedName("kl")
public class class309 implements Runnable {

    @ObfuscatedName("kl.a")
    public Thread field3774;

    @ObfuscatedName("kl.t")
    public InputStream field3773;

    @ObfuscatedName("kl.n")
    public int field3772;

    @ObfuscatedName("kl.q")
    public byte[] field3775;

    @ObfuscatedName("kl.v")
    public int field3776 = 0;

    @ObfuscatedName("kl.l")
    public int field3777 = 0;

    @ObfuscatedName("kl.c")
    public IOException field3778;

    public class309(InputStream arg0, int arg1) {
        this.field3773 = arg0;
        this.field3772 = arg1 + 1;
        this.field3775 = new byte[this.field3772];
        this.field3774 = new Thread(this);
        this.field3774.setDaemon(true);
        this.field3774.start();
    }

    public void run() {
        while (true) {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field3778 != null) {
                        return;
                    }
                    if (this.field3776 == 0) {
                        var2 = this.field3772 - this.field3777 - 1;
                    } else if (this.field3776 <= this.field3777) {
                        var2 = this.field3772 - this.field3777;
                    } else {
                        var2 = this.field3776 - this.field3777 - 1;
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
                var5 = this.field3773.read(this.field3775, this.field3777, var2);
                if (var5 == -1) {
                    throw new EOFException();
                }
            } catch (IOException var14) {
                IOException var6 = var14;
                synchronized (this) {
                    this.field3778 = var6;
                    return;
                }
            }
            synchronized (this) {
                this.field3777 = (this.field3777 + var5) % this.field3772;
            }
        }
    }

    @ObfuscatedName("kl.a(II)Z")
    public boolean method5467(int arg0) throws IOException {
        if (arg0 == 0) {
            return true;
        } else if (arg0 > 0 && arg0 < this.field3772) {
            synchronized (this) {
                int var3;
                if (this.field3776 <= this.field3777) {
                    var3 = this.field3777 - this.field3776;
                } else {
                    var3 = this.field3777 + (this.field3772 - this.field3776);
                }
                if (var3 >= arg0) {
                    return true;
                } else if (this.field3778 == null) {
                    this.notifyAll();
                    return false;
                } else {
                    throw new IOException(this.field3778.toString());
                }
            }
        } else {
            throw new IOException();
        }
    }

    @ObfuscatedName("kl.t(S)I")
    public int method5448() throws IOException {
        synchronized (this) {
            int var2;
            if (this.field3776 <= this.field3777) {
                var2 = this.field3777 - this.field3776;
            } else {
                var2 = this.field3777 + (this.field3772 - this.field3776);
            }
            if (var2 <= 0 && this.field3778 != null) {
                throw new IOException(this.field3778.toString());
            }
            this.notifyAll();
            return var2;
        }
    }

    @ObfuscatedName("kl.n(I)I")
    public int method5449() throws IOException {
        synchronized (this) {
            if (this.field3777 != this.field3776) {
                int var2 = this.field3775[this.field3776] & 0xFF;
                this.field3776 = (this.field3776 + 1) % this.field3772;
                this.notifyAll();
                return var2;
            } else if (this.field3778 == null) {
                return -1;
            } else {
                throw new IOException(this.field3778.toString());
            }
        }
    }

    @ObfuscatedName("kl.q([BIII)I")
    public int method5450(byte[] arg0, int arg1, int arg2) throws IOException {
        if (arg2 < 0 || arg1 < 0 || arg1 + arg2 > arg0.length) {
            throw new IOException();
        }
        synchronized (this) {
            int var5;
            if (this.field3776 <= this.field3777) {
                var5 = this.field3777 - this.field3776;
            } else {
                var5 = this.field3777 + (this.field3772 - this.field3776);
            }
            if (arg2 > var5) {
                arg2 = var5;
            }
            if (arg2 == 0 && this.field3778 != null) {
                throw new IOException(this.field3778.toString());
            }
            if (this.field3776 + arg2 <= this.field3772) {
                System.arraycopy(this.field3775, this.field3776, arg0, arg1, arg2);
            } else {
                int var6 = this.field3772 - this.field3776;
                System.arraycopy(this.field3775, this.field3776, arg0, arg1, var6);
                System.arraycopy(this.field3775, 0, arg0, arg1 + var6, arg2 - var6);
            }
            this.field3776 = (this.field3776 + arg2) % this.field3772;
            this.notifyAll();
            return arg2;
        }
    }

    @ObfuscatedName("kl.v(I)V")
    public void method5451() {
        synchronized (this) {
            if (this.field3778 == null) {
                this.field3778 = new IOException("");
            }
            this.notifyAll();
        }
        try {
            this.field3774.join();
        } catch (InterruptedException var4) {
        }
    }
}
