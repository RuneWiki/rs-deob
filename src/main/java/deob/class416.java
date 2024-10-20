package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

@ObfuscatedName("pn")
public class class416 implements Runnable {

    @ObfuscatedName("pn.af")
    public Thread field4612;

    @ObfuscatedName("pn.an")
    public InputStream field4613;

    @ObfuscatedName("pn.aw")
    public int field4616;

    @ObfuscatedName("pn.ac")
    public byte[] field4614;

    @ObfuscatedName("pn.au")
    public int field4615 = 0;

    @ObfuscatedName("pn.ab")
    public int field4617 = 0;

    @ObfuscatedName("pn.aq")
    public IOException field4611;

    public class416(InputStream arg0, int arg1) {
        this.field4613 = arg0;
        this.field4616 = arg1 + 1;
        this.field4614 = new byte[this.field4616];
        this.field4612 = new Thread(this);
        this.field4612.setDaemon(true);
        this.field4612.start();
    }

    public void run() {
        while (true) {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field4611 != null) {
                        return;
                    }
                    if (this.field4615 == 0) {
                        var2 = this.field4616 - this.field4617 - 1;
                    } else if (this.field4615 <= this.field4617) {
                        var2 = this.field4616 - this.field4617;
                    } else {
                        var2 = this.field4615 - this.field4617 - 1;
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
                var5 = this.field4613.read(this.field4614, this.field4617, var2);
                if (var5 == -1) {
                    throw new EOFException();
                }
            } catch (IOException var14) {
                IOException var6 = var14;
                synchronized (this) {
                    this.field4611 = var6;
                    return;
                }
            }
            synchronized (this) {
                this.field4617 = (this.field4617 + var5) % this.field4616;
            }
        }
    }

    @ObfuscatedName("pn.af(II)Z")
    public boolean method7314(int arg0) throws IOException {
        if (arg0 == 0) {
            return true;
        } else if (arg0 > 0 && arg0 < this.field4616) {
            synchronized (this) {
                int var3;
                if (this.field4615 <= this.field4617) {
                    var3 = this.field4617 - this.field4615;
                } else {
                    var3 = this.field4617 + (this.field4616 - this.field4615);
                }
                if (var3 >= arg0) {
                    return true;
                } else if (this.field4611 == null) {
                    this.notifyAll();
                    return false;
                } else {
                    throw new IOException(this.field4611.toString());
                }
            }
        } else {
            throw new IOException();
        }
    }

    @ObfuscatedName("pn.an(B)I")
    public int method7313() throws IOException {
        synchronized (this) {
            int var2;
            if (this.field4615 <= this.field4617) {
                var2 = this.field4617 - this.field4615;
            } else {
                var2 = this.field4617 + (this.field4616 - this.field4615);
            }
            if (var2 <= 0 && this.field4611 != null) {
                throw new IOException(this.field4611.toString());
            }
            this.notifyAll();
            return var2;
        }
    }

    @ObfuscatedName("pn.aw(S)I")
    public int method7311() throws IOException {
        synchronized (this) {
            if (this.field4617 != this.field4615) {
                int var2 = this.field4614[this.field4615] & 0xFF;
                this.field4615 = (this.field4615 + 1) % this.field4616;
                this.notifyAll();
                return var2;
            } else if (this.field4611 == null) {
                return -1;
            } else {
                throw new IOException(this.field4611.toString());
            }
        }
    }

    @ObfuscatedName("pn.ac([BIII)I")
    public int method7315(byte[] arg0, int arg1, int arg2) throws IOException {
        if (arg2 < 0 || arg1 < 0 || arg1 + arg2 > arg0.length) {
            throw new IOException();
        }
        synchronized (this) {
            int var5;
            if (this.field4615 <= this.field4617) {
                var5 = this.field4617 - this.field4615;
            } else {
                var5 = this.field4617 + (this.field4616 - this.field4615);
            }
            if (arg2 > var5) {
                arg2 = var5;
            }
            if (arg2 == 0 && this.field4611 != null) {
                throw new IOException(this.field4611.toString());
            }
            if (this.field4615 + arg2 <= this.field4616) {
                System.arraycopy(this.field4614, this.field4615, arg0, arg1, arg2);
            } else {
                int var6 = this.field4616 - this.field4615;
                System.arraycopy(this.field4614, this.field4615, arg0, arg1, var6);
                System.arraycopy(this.field4614, 0, arg0, arg1 + var6, arg2 - var6);
            }
            this.field4615 = (this.field4615 + arg2) % this.field4616;
            this.notifyAll();
            return arg2;
        }
    }

    @ObfuscatedName("pn.au(I)V")
    public void method7327() {
        synchronized (this) {
            if (this.field4611 == null) {
                this.field4611 = new IOException("");
            }
            this.notifyAll();
        }
        try {
            this.field4612.join();
        } catch (InterruptedException var4) {
        }
    }
}
