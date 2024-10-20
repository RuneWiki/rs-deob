package deob;

import java.io.IOException;
import java.io.OutputStream;

@ObfuscatedName("fp")
public class class166 implements Runnable {

    @ObfuscatedName("fp.f")
    public Thread field2060;

    @ObfuscatedName("fp.h")
    public OutputStream field2053;

    @ObfuscatedName("fp.e")
    public int field2055;

    @ObfuscatedName("fp.b")
    public byte[] field2059;

    @ObfuscatedName("fp.l")
    public int field2056 = 0;

    @ObfuscatedName("fp.w")
    public int field2057 = 0;

    @ObfuscatedName("fp.d")
    public IOException field2052;

    @ObfuscatedName("fp.n")
    public boolean field2054;

    public class166(OutputStream arg0, int arg1) {
        this.field2053 = arg0;
        this.field2055 = arg1 + 1;
        this.field2059 = new byte[this.field2055];
        this.field2060 = new Thread(this);
        this.field2060.setDaemon(true);
        this.field2060.start();
    }

    @ObfuscatedName("fp.f(I)Z")
    public boolean method3159() {
        if (!this.field2054) {
            return false;
        }
        try {
            this.field2053.close();
            if (this.field2052 == null) {
                this.field2052 = new IOException("");
            }
        } catch (IOException var2) {
            if (this.field2052 == null) {
                this.field2052 = new IOException(var2);
            }
        }
        return true;
    }

    public void run() {
        do {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field2052 != null) {
                        return;
                    }
                    if (this.field2056 <= this.field2057) {
                        var2 = this.field2057 - this.field2056;
                    } else {
                        var2 = this.field2057 + (this.field2055 - this.field2056);
                    }
                    if (var2 > 0) {
                        break;
                    }
                    try {
                        this.field2053.flush();
                    } catch (IOException var15) {
                        this.field2052 = var15;
                        return;
                    }
                    if (this.method3159()) {
                        return;
                    }
                    try {
                        this.wait();
                    } catch (InterruptedException var16) {
                    }
                }
            }
            try {
                if (this.field2056 + var2 <= this.field2055) {
                    this.field2053.write(this.field2059, this.field2056, var2);
                } else {
                    int var6 = this.field2055 - this.field2056;
                    this.field2053.write(this.field2059, this.field2056, var6);
                    this.field2053.write(this.field2059, 0, var2 - var6);
                }
            } catch (IOException var14) {
                IOException var7 = var14;
                synchronized (this) {
                    this.field2052 = var7;
                    return;
                }
            }
            synchronized (this) {
                this.field2056 = (this.field2056 + var2) % this.field2055;
            }
        } while (!this.method3159());
    }

    @ObfuscatedName("fp.h([BIII)V")
    public void method3149(byte[] arg0, int arg1, int arg2) throws IOException {
        if (arg2 < 0 || arg1 < 0 || arg1 + arg2 > arg0.length) {
            throw new IOException();
        }
        synchronized (this) {
            if (this.field2052 != null) {
                throw new IOException(this.field2052.toString());
            }
            int var5;
            if (this.field2056 <= this.field2057) {
                var5 = this.field2056 + (this.field2055 - this.field2057) - 1;
            } else {
                var5 = this.field2056 - this.field2057 - 1;
            }
            if (var5 < arg2) {
                throw new IOException("");
            }
            if (this.field2057 + arg2 <= this.field2055) {
                System.arraycopy(arg0, arg1, this.field2059, this.field2057, arg2);
            } else {
                int var6 = this.field2055 - this.field2057;
                System.arraycopy(arg0, arg1, this.field2059, this.field2057, var6);
                System.arraycopy(arg0, arg1 + var6, this.field2059, 0, arg2 - var6);
            }
            this.field2057 = (this.field2057 + arg2) % this.field2055;
            this.notifyAll();
        }
    }

    @ObfuscatedName("fp.e(I)V")
    public void method3148() {
        synchronized (this) {
            this.field2054 = true;
            this.notifyAll();
        }
        try {
            this.field2060.join();
        } catch (InterruptedException var4) {
        }
    }
}
