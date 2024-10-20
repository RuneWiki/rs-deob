package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

@ObfuscatedName("qy")
public class class442 implements Runnable {

    @ObfuscatedName("qy.aw")
    public Thread field4688;

    @ObfuscatedName("qy.ay")
    public InputStream field4684;

    @ObfuscatedName("qy.ar")
    public int field4683;

    @ObfuscatedName("qy.am")
    public byte[] field4686;

    @ObfuscatedName("qy.as")
    public int field4687 = 0;

    @ObfuscatedName("qy.aj")
    public int field4689 = 0;

    @ObfuscatedName("qy.ag")
    public IOException field4685;

    public class442(InputStream arg0, int arg1) {
        this.field4684 = arg0;
        this.field4683 = arg1 + 1;
        this.field4686 = new byte[this.field4683];
        this.field4688 = new Thread(this);
        this.field4688.setDaemon(true);
        this.field4688.start();
    }

    public void run() {
        while (true) {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field4685 != null) {
                        return;
                    }
                    if (this.field4687 == 0) {
                        var2 = this.field4683 - this.field4689 - 1;
                    } else if (this.field4687 <= this.field4689) {
                        var2 = this.field4683 - this.field4689;
                    } else {
                        var2 = this.field4687 - this.field4689 - 1;
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
                var5 = this.field4684.read(this.field4686, this.field4689, var2);
                if (var5 == -1) {
                    throw new EOFException();
                }
            } catch (IOException var14) {
                IOException var6 = var14;
                synchronized (this) {
                    this.field4685 = var6;
                    return;
                }
            }
            synchronized (this) {
                this.field4689 = (this.field4689 + var5) % this.field4683;
            }
        }
    }

    @ObfuscatedName("qy.aw(II)Z")
    public boolean method7391(int arg0) throws IOException {
        if (arg0 == 0) {
            return true;
        } else if (arg0 > 0 && arg0 < this.field4683) {
            synchronized (this) {
                int var3;
                if (this.field4687 <= this.field4689) {
                    var3 = this.field4689 - this.field4687;
                } else {
                    var3 = this.field4689 + (this.field4683 - this.field4687);
                }
                if (var3 >= arg0) {
                    return true;
                } else if (this.field4685 == null) {
                    this.notifyAll();
                    return false;
                } else {
                    throw new IOException(this.field4685.toString());
                }
            }
        } else {
            throw new IOException();
        }
    }

    @ObfuscatedName("qy.ay(I)I")
    public int method7380() throws IOException {
        synchronized (this) {
            int var2;
            if (this.field4687 <= this.field4689) {
                var2 = this.field4689 - this.field4687;
            } else {
                var2 = this.field4689 + (this.field4683 - this.field4687);
            }
            if (var2 <= 0 && this.field4685 != null) {
                throw new IOException(this.field4685.toString());
            }
            this.notifyAll();
            return var2;
        }
    }

    @ObfuscatedName("qy.ar(I)I")
    public int method7374() throws IOException {
        synchronized (this) {
            if (this.field4689 != this.field4687) {
                int var2 = this.field4686[this.field4687] & 0xFF;
                this.field4687 = (this.field4687 + 1) % this.field4683;
                this.notifyAll();
                return var2;
            } else if (this.field4685 == null) {
                return -1;
            } else {
                throw new IOException(this.field4685.toString());
            }
        }
    }

    @ObfuscatedName("qy.am([BIII)I")
    public int method7375(byte[] arg0, int arg1, int arg2) throws IOException {
        if (arg2 < 0 || arg1 < 0 || arg1 + arg2 > arg0.length) {
            throw new IOException();
        }
        synchronized (this) {
            int var5;
            if (this.field4687 <= this.field4689) {
                var5 = this.field4689 - this.field4687;
            } else {
                var5 = this.field4689 + (this.field4683 - this.field4687);
            }
            if (arg2 > var5) {
                arg2 = var5;
            }
            if (arg2 == 0 && this.field4685 != null) {
                throw new IOException(this.field4685.toString());
            }
            if (this.field4687 + arg2 <= this.field4683) {
                System.arraycopy(this.field4686, this.field4687, arg0, arg1, arg2);
            } else {
                int var6 = this.field4683 - this.field4687;
                System.arraycopy(this.field4686, this.field4687, arg0, arg1, var6);
                System.arraycopy(this.field4686, 0, arg0, arg1 + var6, arg2 - var6);
            }
            this.field4687 = (this.field4687 + arg2) % this.field4683;
            this.notifyAll();
            return arg2;
        }
    }

    @ObfuscatedName("qy.as(I)V")
    public void method7376() {
        synchronized (this) {
            if (this.field4685 == null) {
                this.field4685 = new IOException("");
            }
            this.notifyAll();
        }
        try {
            this.field4688.join();
        } catch (InterruptedException var4) {
        }
    }
}
