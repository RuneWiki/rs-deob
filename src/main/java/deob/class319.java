package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

@ObfuscatedName("li")
public class class319 implements Runnable {

    @ObfuscatedName("li.m")
    public Thread field3817;

    @ObfuscatedName("li.o")
    public InputStream field3812;

    @ObfuscatedName("li.q")
    public int field3813;

    @ObfuscatedName("li.j")
    public byte[] field3814;

    @ObfuscatedName("li.p")
    public int field3811 = 0;

    @ObfuscatedName("li.g")
    public int field3816 = 0;

    @ObfuscatedName("li.n")
    public IOException field3815;

    public class319(InputStream arg0, int arg1) {
        this.field3812 = arg0;
        this.field3813 = arg1 + 1;
        this.field3814 = new byte[this.field3813];
        this.field3817 = new Thread(this);
        this.field3817.setDaemon(true);
        this.field3817.start();
    }

    public void run() {
        while (true) {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field3815 != null) {
                        return;
                    }
                    if (this.field3811 == 0) {
                        var2 = this.field3813 - this.field3816 - 1;
                    } else if (this.field3811 <= this.field3816) {
                        var2 = this.field3813 - this.field3816;
                    } else {
                        var2 = this.field3811 - this.field3816 - 1;
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
                var5 = this.field3812.read(this.field3814, this.field3816, var2);
                if (var5 == -1) {
                    throw new EOFException();
                }
            } catch (IOException var14) {
                IOException var6 = var14;
                synchronized (this) {
                    this.field3815 = var6;
                    return;
                }
            }
            synchronized (this) {
                this.field3816 = (this.field3816 + var5) % this.field3813;
            }
        }
    }

    @ObfuscatedName("li.m(II)Z")
    public boolean method5585(int arg0) throws IOException {
        if (arg0 == 0) {
            return true;
        } else if (arg0 > 0 && arg0 < this.field3813) {
            synchronized (this) {
                int var3;
                if (this.field3811 <= this.field3816) {
                    var3 = this.field3816 - this.field3811;
                } else {
                    var3 = this.field3816 + (this.field3813 - this.field3811);
                }
                if (var3 >= arg0) {
                    return true;
                } else if (this.field3815 == null) {
                    this.notifyAll();
                    return false;
                } else {
                    throw new IOException(this.field3815.toString());
                }
            }
        } else {
            throw new IOException();
        }
    }

    @ObfuscatedName("li.o(B)I")
    public int method5576() throws IOException {
        synchronized (this) {
            int var2;
            if (this.field3811 <= this.field3816) {
                var2 = this.field3816 - this.field3811;
            } else {
                var2 = this.field3816 + (this.field3813 - this.field3811);
            }
            if (var2 <= 0 && this.field3815 != null) {
                throw new IOException(this.field3815.toString());
            }
            this.notifyAll();
            return var2;
        }
    }

    @ObfuscatedName("li.q(I)I")
    public int method5577() throws IOException {
        synchronized (this) {
            if (this.field3816 != this.field3811) {
                int var2 = this.field3814[this.field3811] & 0xFF;
                this.field3811 = (this.field3811 + 1) % this.field3813;
                this.notifyAll();
                return var2;
            } else if (this.field3815 == null) {
                return -1;
            } else {
                throw new IOException(this.field3815.toString());
            }
        }
    }

    @ObfuscatedName("li.j([BIIB)I")
    public int method5575(byte[] arg0, int arg1, int arg2) throws IOException {
        if (arg2 < 0 || arg1 < 0 || arg1 + arg2 > arg0.length) {
            throw new IOException();
        }
        synchronized (this) {
            int var5;
            if (this.field3811 <= this.field3816) {
                var5 = this.field3816 - this.field3811;
            } else {
                var5 = this.field3816 + (this.field3813 - this.field3811);
            }
            if (arg2 > var5) {
                arg2 = var5;
            }
            if (arg2 == 0 && this.field3815 != null) {
                throw new IOException(this.field3815.toString());
            }
            if (this.field3811 + arg2 <= this.field3813) {
                System.arraycopy(this.field3814, this.field3811, arg0, arg1, arg2);
            } else {
                int var6 = this.field3813 - this.field3811;
                System.arraycopy(this.field3814, this.field3811, arg0, arg1, var6);
                System.arraycopy(this.field3814, 0, arg0, arg1 + var6, arg2 - var6);
            }
            this.field3811 = (this.field3811 + arg2) % this.field3813;
            this.notifyAll();
            return arg2;
        }
    }

    @ObfuscatedName("li.p(B)V")
    public void method5579() {
        synchronized (this) {
            if (this.field3815 == null) {
                this.field3815 = new IOException("");
            }
            this.notifyAll();
        }
        try {
            this.field3817.join();
        } catch (InterruptedException var4) {
        }
    }
}
