package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

@ObfuscatedName("ll")
public class class320 implements Runnable {

    @ObfuscatedName("ll.n")
    public Thread field3825;

    @ObfuscatedName("ll.v")
    public InputStream field3823;

    @ObfuscatedName("ll.d")
    public int field3826;

    @ObfuscatedName("ll.c")
    public byte[] field3824;

    @ObfuscatedName("ll.y")
    public int field3827 = 0;

    @ObfuscatedName("ll.h")
    public int field3828 = 0;

    @ObfuscatedName("ll.z")
    public IOException field3829;

    public class320(InputStream arg0, int arg1) {
        this.field3823 = arg0;
        this.field3826 = arg1 + 1;
        this.field3824 = new byte[this.field3826];
        this.field3825 = new Thread(this);
        this.field3825.setDaemon(true);
        this.field3825.start();
    }

    public void run() {
        while (true) {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field3829 != null) {
                        return;
                    }
                    if (this.field3827 == 0) {
                        var2 = this.field3826 - this.field3828 - 1;
                    } else if (this.field3827 <= this.field3828) {
                        var2 = this.field3826 - this.field3828;
                    } else {
                        var2 = this.field3827 - this.field3828 - 1;
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
                var5 = this.field3823.read(this.field3824, this.field3828, var2);
                if (var5 == -1) {
                    throw new EOFException();
                }
            } catch (IOException var14) {
                IOException var6 = var14;
                synchronized (this) {
                    this.field3829 = var6;
                    return;
                }
            }
            synchronized (this) {
                this.field3828 = (this.field3828 + var5) % this.field3826;
            }
        }
    }

    @ObfuscatedName("ll.n(II)Z")
    public boolean method5600(int arg0) throws IOException {
        if (arg0 == 0) {
            return true;
        } else if (arg0 > 0 && arg0 < this.field3826) {
            synchronized (this) {
                int var3;
                if (this.field3827 <= this.field3828) {
                    var3 = this.field3828 - this.field3827;
                } else {
                    var3 = this.field3828 + (this.field3826 - this.field3827);
                }
                if (var3 >= arg0) {
                    return true;
                } else if (this.field3829 == null) {
                    this.notifyAll();
                    return false;
                } else {
                    throw new IOException(this.field3829.toString());
                }
            }
        } else {
            throw new IOException();
        }
    }

    @ObfuscatedName("ll.v(S)I")
    public int method5601() throws IOException {
        synchronized (this) {
            int var2;
            if (this.field3827 <= this.field3828) {
                var2 = this.field3828 - this.field3827;
            } else {
                var2 = this.field3828 + (this.field3826 - this.field3827);
            }
            if (var2 <= 0 && this.field3829 != null) {
                throw new IOException(this.field3829.toString());
            }
            this.notifyAll();
            return var2;
        }
    }

    @ObfuscatedName("ll.d(I)I")
    public int method5602() throws IOException {
        synchronized (this) {
            if (this.field3828 != this.field3827) {
                int var2 = this.field3824[this.field3827] & 0xFF;
                this.field3827 = (this.field3827 + 1) % this.field3826;
                this.notifyAll();
                return var2;
            } else if (this.field3829 == null) {
                return -1;
            } else {
                throw new IOException(this.field3829.toString());
            }
        }
    }

    @ObfuscatedName("ll.c([BIII)I")
    public int method5603(byte[] arg0, int arg1, int arg2) throws IOException {
        if (arg2 < 0 || arg1 < 0 || arg1 + arg2 > arg0.length) {
            throw new IOException();
        }
        synchronized (this) {
            int var5;
            if (this.field3827 <= this.field3828) {
                var5 = this.field3828 - this.field3827;
            } else {
                var5 = this.field3828 + (this.field3826 - this.field3827);
            }
            if (arg2 > var5) {
                arg2 = var5;
            }
            if (arg2 == 0 && this.field3829 != null) {
                throw new IOException(this.field3829.toString());
            }
            if (this.field3827 + arg2 <= this.field3826) {
                System.arraycopy(this.field3824, this.field3827, arg0, arg1, arg2);
            } else {
                int var6 = this.field3826 - this.field3827;
                System.arraycopy(this.field3824, this.field3827, arg0, arg1, var6);
                System.arraycopy(this.field3824, 0, arg0, arg1 + var6, arg2 - var6);
            }
            this.field3827 = (this.field3827 + arg2) % this.field3826;
            this.notifyAll();
            return arg2;
        }
    }

    @ObfuscatedName("ll.y(I)V")
    public void method5604() {
        synchronized (this) {
            if (this.field3829 == null) {
                this.field3829 = new IOException("");
            }
            this.notifyAll();
        }
        try {
            this.field3825.join();
        } catch (InterruptedException var4) {
        }
    }
}
