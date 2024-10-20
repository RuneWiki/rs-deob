package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

@ObfuscatedName("su")
public class class482 implements Runnable {

    @ObfuscatedName("su.ab")
    public Thread field4970;

    @ObfuscatedName("su.ay")
    public InputStream field4976;

    @ObfuscatedName("su.an")
    public int field4972;

    @ObfuscatedName("su.au")
    public byte[] field4973;

    @ObfuscatedName("su.ax")
    public int field4974 = 0;

    @ObfuscatedName("su.ao")
    public int field4971 = 0;

    @ObfuscatedName("su.am")
    public IOException field4975;

    public class482(InputStream arg0, int arg1) {
        this.field4976 = arg0;
        this.field4972 = arg1 + 1;
        this.field4973 = new byte[this.field4972];
        this.field4970 = new Thread(this);
        this.field4970.setDaemon(true);
        this.field4970.start();
    }

    public void run() {
        while (true) {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field4975 != null) {
                        return;
                    }
                    if (this.field4974 == 0) {
                        var2 = this.field4972 - this.field4971 - 1;
                    } else if (this.field4974 <= this.field4971) {
                        var2 = this.field4972 - this.field4971;
                    } else {
                        var2 = this.field4974 - this.field4971 - 1;
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
                var5 = this.field4976.read(this.field4973, this.field4971, var2);
                if (var5 == -1) {
                    throw new EOFException();
                }
            } catch (IOException var14) {
                IOException var6 = var14;
                synchronized (this) {
                    this.field4975 = var6;
                    return;
                }
            }
            synchronized (this) {
                this.field4971 = (this.field4971 + var5) % this.field4972;
            }
        }
    }

    @ObfuscatedName("su.ab(IB)Z")
    public boolean method8086(int arg0) throws IOException {
        if (arg0 == 0) {
            return true;
        } else if (arg0 > 0 && arg0 < this.field4972) {
            synchronized (this) {
                int var3;
                if (this.field4974 <= this.field4971) {
                    var3 = this.field4971 - this.field4974;
                } else {
                    var3 = this.field4971 + (this.field4972 - this.field4974);
                }
                if (var3 >= arg0) {
                    return true;
                } else if (this.field4975 == null) {
                    this.notifyAll();
                    return false;
                } else {
                    throw new IOException(this.field4975.toString());
                }
            }
        } else {
            throw new IOException();
        }
    }

    @ObfuscatedName("su.ay(I)I")
    public int method8088() throws IOException {
        synchronized (this) {
            int var2;
            if (this.field4974 <= this.field4971) {
                var2 = this.field4971 - this.field4974;
            } else {
                var2 = this.field4971 + (this.field4972 - this.field4974);
            }
            if (var2 <= 0 && this.field4975 != null) {
                throw new IOException(this.field4975.toString());
            }
            this.notifyAll();
            return var2;
        }
    }

    @ObfuscatedName("su.an(B)I")
    public int method8087() throws IOException {
        synchronized (this) {
            if (this.field4974 != this.field4971) {
                int var2 = this.field4973[this.field4974] & 0xFF;
                this.field4974 = (this.field4974 + 1) % this.field4972;
                this.notifyAll();
                return var2;
            } else if (this.field4975 == null) {
                return -1;
            } else {
                throw new IOException(this.field4975.toString());
            }
        }
    }

    @ObfuscatedName("su.au([BIII)I")
    public int method8089(byte[] arg0, int arg1, int arg2) throws IOException {
        if (arg2 < 0 || arg1 < 0 || arg1 + arg2 > arg0.length) {
            throw new IOException();
        }
        synchronized (this) {
            int var5;
            if (this.field4974 <= this.field4971) {
                var5 = this.field4971 - this.field4974;
            } else {
                var5 = this.field4971 + (this.field4972 - this.field4974);
            }
            if (arg2 > var5) {
                arg2 = var5;
            }
            if (arg2 == 0 && this.field4975 != null) {
                throw new IOException(this.field4975.toString());
            }
            if (this.field4974 + arg2 <= this.field4972) {
                System.arraycopy(this.field4973, this.field4974, arg0, arg1, arg2);
            } else {
                int var6 = this.field4972 - this.field4974;
                System.arraycopy(this.field4973, this.field4974, arg0, arg1, var6);
                System.arraycopy(this.field4973, 0, arg0, arg1 + var6, arg2 - var6);
            }
            this.field4974 = (this.field4974 + arg2) % this.field4972;
            this.notifyAll();
            return arg2;
        }
    }

    @ObfuscatedName("su.ax(I)V")
    public void method8091() {
        synchronized (this) {
            if (this.field4975 == null) {
                this.field4975 = new IOException("");
            }
            this.notifyAll();
        }
        try {
            this.field4970.join();
        } catch (InterruptedException var4) {
        }
    }
}
