package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

@ObfuscatedName("ra")
public class class453 implements Runnable {

    @ObfuscatedName("ra.at")
    public Thread field4719;

    @ObfuscatedName("ra.ah")
    public InputStream field4714;

    @ObfuscatedName("ra.ar")
    public int field4715;

    @ObfuscatedName("ra.ao")
    public byte[] field4716;

    @ObfuscatedName("ra.ab")
    public int field4713 = 0;

    @ObfuscatedName("ra.au")
    public int field4718 = 0;

    @ObfuscatedName("ra.aa")
    public IOException field4717;

    public class453(InputStream arg0, int arg1) {
        this.field4714 = arg0;
        this.field4715 = arg1 + 1;
        this.field4716 = new byte[this.field4715];
        this.field4719 = new Thread(this);
        this.field4719.setDaemon(true);
        this.field4719.start();
    }

    public void run() {
        while (true) {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field4717 != null) {
                        return;
                    }
                    if (this.field4713 == 0) {
                        var2 = this.field4715 - this.field4718 - 1;
                    } else if (this.field4713 <= this.field4718) {
                        var2 = this.field4715 - this.field4718;
                    } else {
                        var2 = this.field4713 - this.field4718 - 1;
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
                var5 = this.field4714.read(this.field4716, this.field4718, var2);
                if (var5 == -1) {
                    throw new EOFException();
                }
            } catch (IOException var14) {
                IOException var6 = var14;
                synchronized (this) {
                    this.field4717 = var6;
                    return;
                }
            }
            synchronized (this) {
                this.field4718 = (this.field4718 + var5) % this.field4715;
            }
        }
    }

    @ObfuscatedName("ra.at(II)Z")
    public boolean method7551(int arg0) throws IOException {
        if (arg0 == 0) {
            return true;
        } else if (arg0 > 0 && arg0 < this.field4715) {
            synchronized (this) {
                int var3;
                if (this.field4713 <= this.field4718) {
                    var3 = this.field4718 - this.field4713;
                } else {
                    var3 = this.field4718 + (this.field4715 - this.field4713);
                }
                if (var3 >= arg0) {
                    return true;
                } else if (this.field4717 == null) {
                    this.notifyAll();
                    return false;
                } else {
                    throw new IOException(this.field4717.toString());
                }
            }
        } else {
            throw new IOException();
        }
    }

    @ObfuscatedName("ra.ah(I)I")
    public int method7550() throws IOException {
        synchronized (this) {
            int var2;
            if (this.field4713 <= this.field4718) {
                var2 = this.field4718 - this.field4713;
            } else {
                var2 = this.field4718 + (this.field4715 - this.field4713);
            }
            if (var2 <= 0 && this.field4717 != null) {
                throw new IOException(this.field4717.toString());
            }
            this.notifyAll();
            return var2;
        }
    }

    @ObfuscatedName("ra.ar(I)I")
    public int method7553() throws IOException {
        synchronized (this) {
            if (this.field4718 != this.field4713) {
                int var2 = this.field4716[this.field4713] & 0xFF;
                this.field4713 = (this.field4713 + 1) % this.field4715;
                this.notifyAll();
                return var2;
            } else if (this.field4717 == null) {
                return -1;
            } else {
                throw new IOException(this.field4717.toString());
            }
        }
    }

    @ObfuscatedName("ra.ao([BIIB)I")
    public int method7554(byte[] arg0, int arg1, int arg2) throws IOException {
        if (arg2 < 0 || arg1 < 0 || arg1 + arg2 > arg0.length) {
            throw new IOException();
        }
        synchronized (this) {
            int var5;
            if (this.field4713 <= this.field4718) {
                var5 = this.field4718 - this.field4713;
            } else {
                var5 = this.field4718 + (this.field4715 - this.field4713);
            }
            if (arg2 > var5) {
                arg2 = var5;
            }
            if (arg2 == 0 && this.field4717 != null) {
                throw new IOException(this.field4717.toString());
            }
            if (this.field4713 + arg2 <= this.field4715) {
                System.arraycopy(this.field4716, this.field4713, arg0, arg1, arg2);
            } else {
                int var6 = this.field4715 - this.field4713;
                System.arraycopy(this.field4716, this.field4713, arg0, arg1, var6);
                System.arraycopy(this.field4716, 0, arg0, arg1 + var6, arg2 - var6);
            }
            this.field4713 = (this.field4713 + arg2) % this.field4715;
            this.notifyAll();
            return arg2;
        }
    }

    @ObfuscatedName("ra.ab(I)V")
    public void method7555() {
        synchronized (this) {
            if (this.field4717 == null) {
                this.field4717 = new IOException("");
            }
            this.notifyAll();
        }
        try {
            this.field4719.join();
        } catch (InterruptedException var4) {
        }
    }
}
