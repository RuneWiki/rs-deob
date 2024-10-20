package deob;

import java.io.IOException;
import java.io.OutputStream;

@ObfuscatedName("fp")
public class class166 implements Runnable {

    @ObfuscatedName("fp.c")
    public Thread field2059;

    @ObfuscatedName("fp.q")
    public OutputStream field2058;

    @ObfuscatedName("fp.m")
    public int field2063;

    @ObfuscatedName("fp.j")
    public byte[] field2060;

    @ObfuscatedName("fp.g")
    public int field2061 = 0;

    @ObfuscatedName("fp.i")
    public int field2057 = 0;

    @ObfuscatedName("fp.h")
    public IOException field2064;

    @ObfuscatedName("fp.l")
    public boolean field2062;

    public class166(OutputStream arg0, int arg1) {
        this.field2058 = arg0;
        this.field2063 = arg1 + 1;
        this.field2060 = new byte[this.field2063];
        this.field2059 = new Thread(this);
        this.field2059.setDaemon(true);
        this.field2059.start();
    }

    @ObfuscatedName("fp.c(I)Z")
    public boolean method3076() {
        if (!this.field2062) {
            return false;
        }
        try {
            this.field2058.close();
            if (this.field2064 == null) {
                this.field2064 = new IOException("");
            }
        } catch (IOException var2) {
            if (this.field2064 == null) {
                this.field2064 = new IOException(var2);
            }
        }
        return true;
    }

    public void run() {
        do {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field2064 != null) {
                        return;
                    }
                    if (this.field2061 <= this.field2057) {
                        var2 = this.field2057 - this.field2061;
                    } else {
                        var2 = this.field2057 + (this.field2063 - this.field2061);
                    }
                    if (var2 > 0) {
                        break;
                    }
                    try {
                        this.field2058.flush();
                    } catch (IOException var15) {
                        this.field2064 = var15;
                        return;
                    }
                    if (this.method3076()) {
                        return;
                    }
                    try {
                        this.wait();
                    } catch (InterruptedException var16) {
                    }
                }
            }
            try {
                if (this.field2061 + var2 <= this.field2063) {
                    this.field2058.write(this.field2060, this.field2061, var2);
                } else {
                    int var6 = this.field2063 - this.field2061;
                    this.field2058.write(this.field2060, this.field2061, var6);
                    this.field2058.write(this.field2060, 0, var2 - var6);
                }
            } catch (IOException var14) {
                IOException var7 = var14;
                synchronized (this) {
                    this.field2064 = var7;
                    return;
                }
            }
            synchronized (this) {
                this.field2061 = (this.field2061 + var2) % this.field2063;
            }
        } while (!this.method3076());
    }

    @ObfuscatedName("fp.q([BIII)V")
    public void method3077(byte[] arg0, int arg1, int arg2) throws IOException {
        if (arg2 < 0 || arg1 < 0 || arg1 + arg2 > arg0.length) {
            throw new IOException();
        }
        synchronized (this) {
            if (this.field2064 != null) {
                throw new IOException(this.field2064.toString());
            }
            int var5;
            if (this.field2061 <= this.field2057) {
                var5 = this.field2061 + (this.field2063 - this.field2057) - 1;
            } else {
                var5 = this.field2061 - this.field2057 - 1;
            }
            if (var5 < arg2) {
                throw new IOException("");
            }
            if (this.field2057 + arg2 <= this.field2063) {
                System.arraycopy(arg0, arg1, this.field2060, this.field2057, arg2);
            } else {
                int var6 = this.field2063 - this.field2057;
                System.arraycopy(arg0, arg1, this.field2060, this.field2057, var6);
                System.arraycopy(arg0, arg1 + var6, this.field2060, 0, arg2 - var6);
            }
            this.field2057 = (this.field2057 + arg2) % this.field2063;
            this.notifyAll();
        }
    }

    @ObfuscatedName("fp.m(I)V")
    public void method3078() {
        synchronized (this) {
            this.field2062 = true;
            this.notifyAll();
        }
        try {
            this.field2059.join();
        } catch (InterruptedException var4) {
        }
    }
}
