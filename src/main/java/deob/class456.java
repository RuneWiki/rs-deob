package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

@ObfuscatedName("rj")
public class class456 implements Runnable {

    @ObfuscatedName("rj.ac")
    public Thread field4732;

    @ObfuscatedName("rj.al")
    public InputStream field4728;

    @ObfuscatedName("rj.ak")
    public int field4730;

    @ObfuscatedName("rj.ax")
    public byte[] field4729;

    @ObfuscatedName("rj.ao")
    public int field4727 = 0;

    @ObfuscatedName("rj.ah")
    public int field4731 = 0;

    @ObfuscatedName("rj.ar")
    public IOException field4726;

    public class456(InputStream arg0, int arg1) {
        this.field4728 = arg0;
        this.field4730 = arg1 + 1;
        this.field4729 = new byte[this.field4730];
        this.field4732 = new Thread(this);
        this.field4732.setDaemon(true);
        this.field4732.start();
    }

    public void run() {
        while (true) {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field4726 != null) {
                        return;
                    }
                    if (this.field4727 == 0) {
                        var2 = this.field4730 - this.field4731 - 1;
                    } else if (this.field4727 <= this.field4731) {
                        var2 = this.field4730 - this.field4731;
                    } else {
                        var2 = this.field4727 - this.field4731 - 1;
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
                var5 = this.field4728.read(this.field4729, this.field4731, var2);
                if (var5 == -1) {
                    throw new EOFException();
                }
            } catch (IOException var14) {
                IOException var6 = var14;
                synchronized (this) {
                    this.field4726 = var6;
                    return;
                }
            }
            synchronized (this) {
                this.field4731 = (this.field4731 + var5) % this.field4730;
            }
        }
    }

    @ObfuscatedName("rj.ac(IB)Z")
    public boolean method7460(int arg0) throws IOException {
        if (arg0 == 0) {
            return true;
        } else if (arg0 > 0 && arg0 < this.field4730) {
            synchronized (this) {
                int var3;
                if (this.field4727 <= this.field4731) {
                    var3 = this.field4731 - this.field4727;
                } else {
                    var3 = this.field4731 + (this.field4730 - this.field4727);
                }
                if (var3 >= arg0) {
                    return true;
                } else if (this.field4726 == null) {
                    this.notifyAll();
                    return false;
                } else {
                    throw new IOException(this.field4726.toString());
                }
            }
        } else {
            throw new IOException();
        }
    }

    @ObfuscatedName("rj.al(I)I")
    public int method7475() throws IOException {
        synchronized (this) {
            int var2;
            if (this.field4727 <= this.field4731) {
                var2 = this.field4731 - this.field4727;
            } else {
                var2 = this.field4731 + (this.field4730 - this.field4727);
            }
            if (var2 <= 0 && this.field4726 != null) {
                throw new IOException(this.field4726.toString());
            }
            this.notifyAll();
            return var2;
        }
    }

    @ObfuscatedName("rj.ak(I)I")
    public int method7476() throws IOException {
        synchronized (this) {
            if (this.field4731 != this.field4727) {
                int var2 = this.field4729[this.field4727] & 0xFF;
                this.field4727 = (this.field4727 + 1) % this.field4730;
                this.notifyAll();
                return var2;
            } else if (this.field4726 == null) {
                return -1;
            } else {
                throw new IOException(this.field4726.toString());
            }
        }
    }

    @ObfuscatedName("rj.ax([BIII)I")
    public int method7469(byte[] arg0, int arg1, int arg2) throws IOException {
        if (arg2 < 0 || arg1 < 0 || arg1 + arg2 > arg0.length) {
            throw new IOException();
        }
        synchronized (this) {
            int var5;
            if (this.field4727 <= this.field4731) {
                var5 = this.field4731 - this.field4727;
            } else {
                var5 = this.field4731 + (this.field4730 - this.field4727);
            }
            if (arg2 > var5) {
                arg2 = var5;
            }
            if (arg2 == 0 && this.field4726 != null) {
                throw new IOException(this.field4726.toString());
            }
            if (this.field4727 + arg2 <= this.field4730) {
                System.arraycopy(this.field4729, this.field4727, arg0, arg1, arg2);
            } else {
                int var6 = this.field4730 - this.field4727;
                System.arraycopy(this.field4729, this.field4727, arg0, arg1, var6);
                System.arraycopy(this.field4729, 0, arg0, arg1 + var6, arg2 - var6);
            }
            this.field4727 = (this.field4727 + arg2) % this.field4730;
            this.notifyAll();
            return arg2;
        }
    }

    @ObfuscatedName("rj.ao(I)V")
    public void method7464() {
        synchronized (this) {
            if (this.field4726 == null) {
                this.field4726 = new IOException("");
            }
            this.notifyAll();
        }
        try {
            this.field4732.join();
        } catch (InterruptedException var4) {
        }
    }
}
