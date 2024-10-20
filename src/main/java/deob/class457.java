package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

@ObfuscatedName("rt")
public class class457 implements Runnable {

    @ObfuscatedName("rt.am")
    public Thread field4758;

    @ObfuscatedName("rt.ap")
    public InputStream field4753;

    @ObfuscatedName("rt.af")
    public int field4760;

    @ObfuscatedName("rt.aj")
    public byte[] field4755;

    @ObfuscatedName("rt.aq")
    public int field4757 = 0;

    @ObfuscatedName("rt.ar")
    public int field4756 = 0;

    @ObfuscatedName("rt.ag")
    public IOException field4759;

    public class457(InputStream arg0, int arg1) {
        this.field4753 = arg0;
        this.field4760 = arg1 + 1;
        this.field4755 = new byte[this.field4760];
        this.field4758 = new Thread(this);
        this.field4758.setDaemon(true);
        this.field4758.start();
    }

    public void run() {
        while (true) {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field4759 != null) {
                        return;
                    }
                    if (this.field4757 == 0) {
                        var2 = this.field4760 - this.field4756 - 1;
                    } else if (this.field4757 <= this.field4756) {
                        var2 = this.field4760 - this.field4756;
                    } else {
                        var2 = this.field4757 - this.field4756 - 1;
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
                var5 = this.field4753.read(this.field4755, this.field4756, var2);
                if (var5 == -1) {
                    throw new EOFException();
                }
            } catch (IOException var14) {
                IOException var6 = var14;
                synchronized (this) {
                    this.field4759 = var6;
                    return;
                }
            }
            synchronized (this) {
                this.field4756 = (this.field4756 + var5) % this.field4760;
            }
        }
    }

    @ObfuscatedName("rt.am(II)Z")
    public boolean method7696(int arg0) throws IOException {
        if (arg0 == 0) {
            return true;
        } else if (arg0 > 0 && arg0 < this.field4760) {
            synchronized (this) {
                int var3;
                if (this.field4757 <= this.field4756) {
                    var3 = this.field4756 - this.field4757;
                } else {
                    var3 = this.field4756 + (this.field4760 - this.field4757);
                }
                if (var3 >= arg0) {
                    return true;
                } else if (this.field4759 == null) {
                    this.notifyAll();
                    return false;
                } else {
                    throw new IOException(this.field4759.toString());
                }
            }
        } else {
            throw new IOException();
        }
    }

    @ObfuscatedName("rt.ap(B)I")
    public int method7686() throws IOException {
        synchronized (this) {
            int var2;
            if (this.field4757 <= this.field4756) {
                var2 = this.field4756 - this.field4757;
            } else {
                var2 = this.field4756 + (this.field4760 - this.field4757);
            }
            if (var2 <= 0 && this.field4759 != null) {
                throw new IOException(this.field4759.toString());
            }
            this.notifyAll();
            return var2;
        }
    }

    @ObfuscatedName("rt.af(I)I")
    public int method7687() throws IOException {
        synchronized (this) {
            if (this.field4757 != this.field4756) {
                int var2 = this.field4755[this.field4757] & 0xFF;
                this.field4757 = (this.field4757 + 1) % this.field4760;
                this.notifyAll();
                return var2;
            } else if (this.field4759 == null) {
                return -1;
            } else {
                throw new IOException(this.field4759.toString());
            }
        }
    }

    @ObfuscatedName("rt.aj([BIIB)I")
    public int method7690(byte[] arg0, int arg1, int arg2) throws IOException {
        if (arg2 < 0 || arg1 < 0 || arg1 + arg2 > arg0.length) {
            throw new IOException();
        }
        synchronized (this) {
            int var5;
            if (this.field4757 <= this.field4756) {
                var5 = this.field4756 - this.field4757;
            } else {
                var5 = this.field4756 + (this.field4760 - this.field4757);
            }
            if (arg2 > var5) {
                arg2 = var5;
            }
            if (arg2 == 0 && this.field4759 != null) {
                throw new IOException(this.field4759.toString());
            }
            if (this.field4757 + arg2 <= this.field4760) {
                System.arraycopy(this.field4755, this.field4757, arg0, arg1, arg2);
            } else {
                int var6 = this.field4760 - this.field4757;
                System.arraycopy(this.field4755, this.field4757, arg0, arg1, var6);
                System.arraycopy(this.field4755, 0, arg0, arg1 + var6, arg2 - var6);
            }
            this.field4757 = (this.field4757 + arg2) % this.field4760;
            this.notifyAll();
            return arg2;
        }
    }

    @ObfuscatedName("rt.aq(B)V")
    public void method7689() {
        synchronized (this) {
            if (this.field4759 == null) {
                this.field4759 = new IOException("");
            }
            this.notifyAll();
        }
        try {
            this.field4758.join();
        } catch (InterruptedException var4) {
        }
    }
}
