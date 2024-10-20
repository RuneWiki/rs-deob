package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

@ObfuscatedName("rs")
public class class461 implements Runnable {

    @ObfuscatedName("rs.az")
    public Thread field4821;

    @ObfuscatedName("rs.ah")
    public InputStream field4819;

    @ObfuscatedName("rs.af")
    public int field4823;

    @ObfuscatedName("rs.at")
    public byte[] field4818;

    @ObfuscatedName("rs.an")
    public int field4822 = 0;

    @ObfuscatedName("rs.ao")
    public int field4820 = 0;

    @ObfuscatedName("rs.ab")
    public IOException field4824;

    public class461(InputStream arg0, int arg1) {
        this.field4819 = arg0;
        this.field4823 = arg1 + 1;
        this.field4818 = new byte[this.field4823];
        this.field4821 = new Thread(this);
        this.field4821.setDaemon(true);
        this.field4821.start();
    }

    public void run() {
        while (true) {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field4824 != null) {
                        return;
                    }
                    if (this.field4822 == 0) {
                        var2 = this.field4823 - this.field4820 - 1;
                    } else if (this.field4822 <= this.field4820) {
                        var2 = this.field4823 - this.field4820;
                    } else {
                        var2 = this.field4822 - this.field4820 - 1;
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
                var5 = this.field4819.read(this.field4818, this.field4820, var2);
                if (var5 == -1) {
                    throw new EOFException();
                }
            } catch (IOException var14) {
                IOException var6 = var14;
                synchronized (this) {
                    this.field4824 = var6;
                    return;
                }
            }
            synchronized (this) {
                this.field4820 = (this.field4820 + var5) % this.field4823;
            }
        }
    }

    @ObfuscatedName("rs.az(II)Z")
    public boolean method7569(int arg0) throws IOException {
        if (arg0 == 0) {
            return true;
        } else if (arg0 > 0 && arg0 < this.field4823) {
            synchronized (this) {
                int var3;
                if (this.field4822 <= this.field4820) {
                    var3 = this.field4820 - this.field4822;
                } else {
                    var3 = this.field4820 + (this.field4823 - this.field4822);
                }
                if (var3 >= arg0) {
                    return true;
                } else if (this.field4824 == null) {
                    this.notifyAll();
                    return false;
                } else {
                    throw new IOException(this.field4824.toString());
                }
            }
        } else {
            throw new IOException();
        }
    }

    @ObfuscatedName("rs.ah(I)I")
    public int method7570() throws IOException {
        synchronized (this) {
            int var2;
            if (this.field4822 <= this.field4820) {
                var2 = this.field4820 - this.field4822;
            } else {
                var2 = this.field4820 + (this.field4823 - this.field4822);
            }
            if (var2 <= 0 && this.field4824 != null) {
                throw new IOException(this.field4824.toString());
            }
            this.notifyAll();
            return var2;
        }
    }

    @ObfuscatedName("rs.af(I)I")
    public int method7584() throws IOException {
        synchronized (this) {
            if (this.field4822 != this.field4820) {
                int var2 = this.field4818[this.field4822] & 0xFF;
                this.field4822 = (this.field4822 + 1) % this.field4823;
                this.notifyAll();
                return var2;
            } else if (this.field4824 == null) {
                return -1;
            } else {
                throw new IOException(this.field4824.toString());
            }
        }
    }

    @ObfuscatedName("rs.at([BIII)I")
    public int method7580(byte[] arg0, int arg1, int arg2) throws IOException {
        if (arg2 < 0 || arg1 < 0 || arg1 + arg2 > arg0.length) {
            throw new IOException();
        }
        synchronized (this) {
            int var5;
            if (this.field4822 <= this.field4820) {
                var5 = this.field4820 - this.field4822;
            } else {
                var5 = this.field4820 + (this.field4823 - this.field4822);
            }
            if (arg2 > var5) {
                arg2 = var5;
            }
            if (arg2 == 0 && this.field4824 != null) {
                throw new IOException(this.field4824.toString());
            }
            if (this.field4822 + arg2 <= this.field4823) {
                System.arraycopy(this.field4818, this.field4822, arg0, arg1, arg2);
            } else {
                int var6 = this.field4823 - this.field4822;
                System.arraycopy(this.field4818, this.field4822, arg0, arg1, var6);
                System.arraycopy(this.field4818, 0, arg0, arg1 + var6, arg2 - var6);
            }
            this.field4822 = (this.field4822 + arg2) % this.field4823;
            this.notifyAll();
            return arg2;
        }
    }

    @ObfuscatedName("rs.an(B)V")
    public void method7574() {
        synchronized (this) {
            if (this.field4824 == null) {
                this.field4824 = new IOException("");
            }
            this.notifyAll();
        }
        try {
            this.field4821.join();
        } catch (InterruptedException var4) {
        }
    }
}
