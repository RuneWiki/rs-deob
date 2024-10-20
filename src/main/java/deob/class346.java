package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

@ObfuscatedName("mf")
public class class346 implements Runnable {

    @ObfuscatedName("mf.l")
    public Thread field3993;

    @ObfuscatedName("mf.q")
    public InputStream field3989;

    @ObfuscatedName("mf.f")
    public int field3987;

    @ObfuscatedName("mf.j")
    public byte[] field3990;

    @ObfuscatedName("mf.m")
    public int field3991 = 0;

    @ObfuscatedName("mf.k")
    public int field3992 = 0;

    @ObfuscatedName("mf.t")
    public IOException field3988;

    public class346(InputStream arg0, int arg1) {
        this.field3989 = arg0;
        this.field3987 = arg1 + 1;
        this.field3990 = new byte[this.field3987];
        this.field3993 = new Thread(this);
        this.field3993.setDaemon(true);
        this.field3993.start();
    }

    public void run() {
        while (true) {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field3988 != null) {
                        return;
                    }
                    if (this.field3991 == 0) {
                        var2 = this.field3987 - this.field3992 - 1;
                    } else if (this.field3991 <= this.field3992) {
                        var2 = this.field3987 - this.field3992;
                    } else {
                        var2 = this.field3991 - this.field3992 - 1;
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
                var5 = this.field3989.read(this.field3990, this.field3992, var2);
                if (var5 == -1) {
                    throw new EOFException();
                }
            } catch (IOException var14) {
                IOException var6 = var14;
                synchronized (this) {
                    this.field3988 = var6;
                    return;
                }
            }
            synchronized (this) {
                this.field3992 = (this.field3992 + var5) % this.field3987;
            }
        }
    }

    @ObfuscatedName("mf.l(IB)Z")
    public boolean method5628(int arg0) throws IOException {
        if (arg0 == 0) {
            return true;
        } else if (arg0 > 0 && arg0 < this.field3987) {
            synchronized (this) {
                int var3;
                if (this.field3991 <= this.field3992) {
                    var3 = this.field3992 - this.field3991;
                } else {
                    var3 = this.field3992 + (this.field3987 - this.field3991);
                }
                if (var3 >= arg0) {
                    return true;
                } else if (this.field3988 == null) {
                    this.notifyAll();
                    return false;
                } else {
                    throw new IOException(this.field3988.toString());
                }
            }
        } else {
            throw new IOException();
        }
    }

    @ObfuscatedName("mf.q(I)I")
    public int method5624() throws IOException {
        synchronized (this) {
            int var2;
            if (this.field3991 <= this.field3992) {
                var2 = this.field3992 - this.field3991;
            } else {
                var2 = this.field3992 + (this.field3987 - this.field3991);
            }
            if (var2 <= 0 && this.field3988 != null) {
                throw new IOException(this.field3988.toString());
            }
            this.notifyAll();
            return var2;
        }
    }

    @ObfuscatedName("mf.f(I)I")
    public int method5625() throws IOException {
        synchronized (this) {
            if (this.field3992 != this.field3991) {
                int var2 = this.field3990[this.field3991] & 0xFF;
                this.field3991 = (this.field3991 + 1) % this.field3987;
                this.notifyAll();
                return var2;
            } else if (this.field3988 == null) {
                return -1;
            } else {
                throw new IOException(this.field3988.toString());
            }
        }
    }

    @ObfuscatedName("mf.j([BIII)I")
    public int method5626(byte[] arg0, int arg1, int arg2) throws IOException {
        if (arg2 < 0 || arg1 < 0 || arg1 + arg2 > arg0.length) {
            throw new IOException();
        }
        synchronized (this) {
            int var5;
            if (this.field3991 <= this.field3992) {
                var5 = this.field3992 - this.field3991;
            } else {
                var5 = this.field3992 + (this.field3987 - this.field3991);
            }
            if (arg2 > var5) {
                arg2 = var5;
            }
            if (arg2 == 0 && this.field3988 != null) {
                throw new IOException(this.field3988.toString());
            }
            if (this.field3991 + arg2 <= this.field3987) {
                System.arraycopy(this.field3990, this.field3991, arg0, arg1, arg2);
            } else {
                int var6 = this.field3987 - this.field3991;
                System.arraycopy(this.field3990, this.field3991, arg0, arg1, var6);
                System.arraycopy(this.field3990, 0, arg0, arg1 + var6, arg2 - var6);
            }
            this.field3991 = (this.field3991 + arg2) % this.field3987;
            this.notifyAll();
            return arg2;
        }
    }

    @ObfuscatedName("mf.m(B)V")
    public void method5627() {
        synchronized (this) {
            if (this.field3988 == null) {
                this.field3988 = new IOException("");
            }
            this.notifyAll();
        }
        try {
            this.field3993.join();
        } catch (InterruptedException var4) {
        }
    }
}
