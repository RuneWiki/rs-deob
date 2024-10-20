package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

@ObfuscatedName("er")
public class class154 implements Runnable {

    @ObfuscatedName("er.a")
    public Thread field2110;

    @ObfuscatedName("er.w")
    public InputStream field2106;

    @ObfuscatedName("er.e")
    public int field2105;

    @ObfuscatedName("er.k")
    public byte[] field2108;

    @ObfuscatedName("er.u")
    public int field2113 = 0;

    @ObfuscatedName("er.z")
    public int field2112 = 0;

    @ObfuscatedName("er.t")
    public IOException field2111;

    public class154(InputStream arg0, int arg1) {
        this.field2106 = arg0;
        this.field2105 = arg1 + 1;
        this.field2108 = new byte[this.field2105];
        this.field2110 = new Thread(this);
        this.field2110.setDaemon(true);
        this.field2110.start();
    }

    public void run() {
        while (true) {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field2111 != null) {
                        return;
                    }
                    if (this.field2113 == 0) {
                        var2 = this.field2105 - this.field2112 - 1;
                    } else if (this.field2113 <= this.field2112) {
                        var2 = this.field2105 - this.field2112;
                    } else {
                        var2 = this.field2113 - this.field2112 - 1;
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
                var5 = this.field2106.read(this.field2108, this.field2112, var2);
                if (var5 == -1) {
                    throw new EOFException();
                }
            } catch (IOException var14) {
                IOException var6 = var14;
                synchronized (this) {
                    this.field2111 = var6;
                    return;
                }
            }
            synchronized (this) {
                this.field2112 = (this.field2112 + var5) % this.field2105;
            }
        }
    }

    @ObfuscatedName("er.a(II)Z")
    public boolean method2709(int arg0) throws IOException {
        if (arg0 == 0) {
            return true;
        } else if (arg0 > 0 && arg0 < this.field2105) {
            synchronized (this) {
                int var3;
                if (this.field2113 <= this.field2112) {
                    var3 = this.field2112 - this.field2113;
                } else {
                    var3 = this.field2112 + (this.field2105 - this.field2113);
                }
                if (var3 >= arg0) {
                    return true;
                } else if (this.field2111 == null) {
                    this.notifyAll();
                    return false;
                } else {
                    throw new IOException(this.field2111.toString());
                }
            }
        } else {
            throw new IOException();
        }
    }

    @ObfuscatedName("er.w(I)I")
    public int method2719() throws IOException {
        synchronized (this) {
            int var2;
            if (this.field2113 <= this.field2112) {
                var2 = this.field2112 - this.field2113;
            } else {
                var2 = this.field2112 + (this.field2105 - this.field2113);
            }
            if (var2 <= 0 && this.field2111 != null) {
                throw new IOException(this.field2111.toString());
            }
            this.notifyAll();
            return var2;
        }
    }

    @ObfuscatedName("er.e(B)I")
    public int method2703() throws IOException {
        synchronized (this) {
            if (this.field2113 != this.field2112) {
                int var2 = this.field2108[this.field2113] & 0xFF;
                this.field2113 = (this.field2113 + 1) % this.field2105;
                this.notifyAll();
                return var2;
            } else if (this.field2111 == null) {
                return -1;
            } else {
                throw new IOException(this.field2111.toString());
            }
        }
    }

    @ObfuscatedName("er.k([BIIB)I")
    public int method2704(byte[] arg0, int arg1, int arg2) throws IOException {
        if (arg2 < 0 || arg1 < 0 || arg1 + arg2 > arg0.length) {
            throw new IOException();
        }
        synchronized (this) {
            int var5;
            if (this.field2113 <= this.field2112) {
                var5 = this.field2112 - this.field2113;
            } else {
                var5 = this.field2112 + (this.field2105 - this.field2113);
            }
            if (arg2 > var5) {
                arg2 = var5;
            }
            if (arg2 == 0 && this.field2111 != null) {
                throw new IOException(this.field2111.toString());
            }
            if (this.field2113 + arg2 <= this.field2105) {
                System.arraycopy(this.field2108, this.field2113, arg0, arg1, arg2);
            } else {
                int var6 = this.field2105 - this.field2113;
                System.arraycopy(this.field2108, this.field2113, arg0, arg1, var6);
                System.arraycopy(this.field2108, 0, arg0, arg1 + var6, arg2 - var6);
            }
            this.field2113 = (this.field2113 + arg2) % this.field2105;
            this.notifyAll();
            return arg2;
        }
    }

    @ObfuscatedName("er.u(B)V")
    public void method2705() {
        synchronized (this) {
            if (this.field2111 == null) {
                this.field2111 = new IOException("");
            }
            this.notifyAll();
        }
        try {
            this.field2110.join();
        } catch (InterruptedException var4) {
        }
    }
}
