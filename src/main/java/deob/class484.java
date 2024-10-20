package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

@ObfuscatedName("sg")
public class class484 implements Runnable {

    @ObfuscatedName("sg.ac")
    public Thread field5029;

    @ObfuscatedName("sg.ae")
    public InputStream field5030;

    @ObfuscatedName("sg.ag")
    public int field5033;

    @ObfuscatedName("sg.am")
    public byte[] field5032;

    @ObfuscatedName("sg.ax")
    public int field5031 = 0;

    @ObfuscatedName("sg.aq")
    public int field5034 = 0;

    @ObfuscatedName("sg.af")
    public IOException field5035;

    public class484(InputStream arg0, int arg1) {
        this.field5030 = arg0;
        this.field5033 = arg1 + 1;
        this.field5032 = new byte[this.field5033];
        this.field5029 = new Thread(this);
        this.field5029.setDaemon(true);
        this.field5029.start();
    }

    public void run() {
        while (true) {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field5035 != null) {
                        return;
                    }
                    if (this.field5031 == 0) {
                        var2 = this.field5033 - this.field5034 - 1;
                    } else if (this.field5031 <= this.field5034) {
                        var2 = this.field5033 - this.field5034;
                    } else {
                        var2 = this.field5031 - this.field5034 - 1;
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
                var5 = this.field5030.read(this.field5032, this.field5034, var2);
                if (var5 == -1) {
                    throw new EOFException();
                }
            } catch (IOException var14) {
                IOException var6 = var14;
                synchronized (this) {
                    this.field5035 = var6;
                    return;
                }
            }
            synchronized (this) {
                this.field5034 = (this.field5034 + var5) % this.field5033;
            }
        }
    }

    @ObfuscatedName("sg.ac(II)Z")
    public boolean method8233(int arg0) throws IOException {
        if (arg0 == 0) {
            return true;
        } else if (arg0 > 0 && arg0 < this.field5033) {
            synchronized (this) {
                int var3;
                if (this.field5031 <= this.field5034) {
                    var3 = this.field5034 - this.field5031;
                } else {
                    var3 = this.field5034 + (this.field5033 - this.field5031);
                }
                if (var3 >= arg0) {
                    return true;
                } else if (this.field5035 == null) {
                    this.notifyAll();
                    return false;
                } else {
                    throw new IOException(this.field5035.toString());
                }
            }
        } else {
            throw new IOException();
        }
    }

    @ObfuscatedName("sg.ae(I)I")
    public int method8226() throws IOException {
        synchronized (this) {
            int var2;
            if (this.field5031 <= this.field5034) {
                var2 = this.field5034 - this.field5031;
            } else {
                var2 = this.field5034 + (this.field5033 - this.field5031);
            }
            if (var2 <= 0 && this.field5035 != null) {
                throw new IOException(this.field5035.toString());
            }
            this.notifyAll();
            return var2;
        }
    }

    @ObfuscatedName("sg.ag(I)I")
    public int method8227() throws IOException {
        synchronized (this) {
            if (this.field5034 != this.field5031) {
                int var2 = this.field5032[this.field5031] & 0xFF;
                this.field5031 = (this.field5031 + 1) % this.field5033;
                this.notifyAll();
                return var2;
            } else if (this.field5035 == null) {
                return -1;
            } else {
                throw new IOException(this.field5035.toString());
            }
        }
    }

    @ObfuscatedName("sg.am([BIII)I")
    public int method8228(byte[] arg0, int arg1, int arg2) throws IOException {
        if (arg2 < 0 || arg1 < 0 || arg1 + arg2 > arg0.length) {
            throw new IOException();
        }
        synchronized (this) {
            int var5;
            if (this.field5031 <= this.field5034) {
                var5 = this.field5034 - this.field5031;
            } else {
                var5 = this.field5034 + (this.field5033 - this.field5031);
            }
            if (arg2 > var5) {
                arg2 = var5;
            }
            if (arg2 == 0 && this.field5035 != null) {
                throw new IOException(this.field5035.toString());
            }
            if (this.field5031 + arg2 <= this.field5033) {
                System.arraycopy(this.field5032, this.field5031, arg0, arg1, arg2);
            } else {
                int var6 = this.field5033 - this.field5031;
                System.arraycopy(this.field5032, this.field5031, arg0, arg1, var6);
                System.arraycopy(this.field5032, 0, arg0, arg1 + var6, arg2 - var6);
            }
            this.field5031 = (this.field5031 + arg2) % this.field5033;
            this.notifyAll();
            return arg2;
        }
    }

    @ObfuscatedName("sg.ax(I)V")
    public void method8229() {
        synchronized (this) {
            if (this.field5035 == null) {
                this.field5035 = new IOException("");
            }
            this.notifyAll();
        }
        try {
            this.field5029.join();
        } catch (InterruptedException var4) {
        }
    }
}
