package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

@ObfuscatedName("fs")
public class class164 implements Runnable {

    @ObfuscatedName("fs.d")
    public Thread field2167;

    @ObfuscatedName("fs.z")
    public InputStream field2163;

    @ObfuscatedName("fs.n")
    public int field2166;

    @ObfuscatedName("fs.r")
    public byte[] field2165;

    @ObfuscatedName("fs.e")
    public int field2162 = 0;

    @ObfuscatedName("fs.y")
    public int field2164 = 0;

    @ObfuscatedName("fs.k")
    public IOException field2168;

    public class164(InputStream arg0, int arg1) {
        this.field2163 = arg0;
        this.field2166 = arg1 + 1;
        this.field2165 = new byte[this.field2166];
        this.field2167 = new Thread(this);
        this.field2167.setDaemon(true);
        this.field2167.start();
    }

    public void run() {
        while (true) {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field2168 != null) {
                        return;
                    }
                    if (this.field2162 == 0) {
                        var2 = this.field2166 - this.field2164 - 1;
                    } else if (this.field2162 <= this.field2164) {
                        var2 = this.field2166 - this.field2164;
                    } else {
                        var2 = this.field2162 - this.field2164 - 1;
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
                var5 = this.field2163.read(this.field2165, this.field2164, var2);
                if (var5 == -1) {
                    throw new EOFException();
                }
            } catch (IOException var14) {
                IOException var6 = var14;
                synchronized (this) {
                    this.field2168 = var6;
                    return;
                }
            }
            synchronized (this) {
                this.field2164 = (this.field2164 + var5) % this.field2166;
            }
        }
    }

    @ObfuscatedName("fs.d(II)Z")
    public boolean method2999(int arg0) throws IOException {
        if (arg0 == 0) {
            return true;
        } else if (arg0 > 0 && arg0 < this.field2166) {
            synchronized (this) {
                int var3;
                if (this.field2162 <= this.field2164) {
                    var3 = this.field2164 - this.field2162;
                } else {
                    var3 = this.field2164 + (this.field2166 - this.field2162);
                }
                if (var3 >= arg0) {
                    return true;
                } else if (this.field2168 == null) {
                    this.notifyAll();
                    return false;
                } else {
                    throw new IOException(this.field2168.toString());
                }
            }
        } else {
            throw new IOException();
        }
    }

    @ObfuscatedName("fs.z(B)I")
    public int method3012() throws IOException {
        synchronized (this) {
            int var2;
            if (this.field2162 <= this.field2164) {
                var2 = this.field2164 - this.field2162;
            } else {
                var2 = this.field2164 + (this.field2166 - this.field2162);
            }
            if (var2 <= 0 && this.field2168 != null) {
                throw new IOException(this.field2168.toString());
            }
            this.notifyAll();
            return var2;
        }
    }

    @ObfuscatedName("fs.n(B)I")
    public int method3000() throws IOException {
        synchronized (this) {
            if (this.field2164 != this.field2162) {
                int var2 = this.field2165[this.field2162] & 0xFF;
                this.field2162 = (this.field2162 + 1) % this.field2166;
                this.notifyAll();
                return var2;
            } else if (this.field2168 == null) {
                return -1;
            } else {
                throw new IOException(this.field2168.toString());
            }
        }
    }

    @ObfuscatedName("fs.r([BIII)I")
    public int method3003(byte[] arg0, int arg1, int arg2) throws IOException {
        if (arg2 < 0 || arg1 < 0 || arg1 + arg2 > arg0.length) {
            throw new IOException();
        }
        synchronized (this) {
            int var5;
            if (this.field2162 <= this.field2164) {
                var5 = this.field2164 - this.field2162;
            } else {
                var5 = this.field2164 + (this.field2166 - this.field2162);
            }
            if (arg2 > var5) {
                arg2 = var5;
            }
            if (arg2 == 0 && this.field2168 != null) {
                throw new IOException(this.field2168.toString());
            }
            if (this.field2162 + arg2 <= this.field2166) {
                System.arraycopy(this.field2165, this.field2162, arg0, arg1, arg2);
            } else {
                int var6 = this.field2166 - this.field2162;
                System.arraycopy(this.field2165, this.field2162, arg0, arg1, var6);
                System.arraycopy(this.field2165, 0, arg0, arg1 + var6, arg2 - var6);
            }
            this.field2162 = (this.field2162 + arg2) % this.field2166;
            this.notifyAll();
            return arg2;
        }
    }

    @ObfuscatedName("fs.e(I)V")
    public void method3002() {
        synchronized (this) {
            if (this.field2168 == null) {
                this.field2168 = new IOException("");
            }
            this.notifyAll();
        }
        try {
            this.field2167.join();
        } catch (InterruptedException var4) {
        }
    }
}
