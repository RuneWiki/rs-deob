package deob;

import java.io.IOException;
import java.io.OutputStream;

@ObfuscatedName("fs")
public class class166 implements Runnable {

    @ObfuscatedName("fs.v")
    public Thread field2060;

    @ObfuscatedName("fs.s")
    public OutputStream field2065;

    @ObfuscatedName("fs.o")
    public int field2061;

    @ObfuscatedName("fs.k")
    public byte[] field2062;

    @ObfuscatedName("fs.u")
    public int field2063 = 0;

    @ObfuscatedName("fs.i")
    public int field2064 = 0;

    @ObfuscatedName("fs.t")
    public IOException field2066;

    @ObfuscatedName("fs.p")
    public boolean field2067;

    public class166(OutputStream arg0, int arg1) {
        this.field2065 = arg0;
        this.field2061 = arg1 + 1;
        this.field2062 = new byte[this.field2061];
        this.field2060 = new Thread(this);
        this.field2060.setDaemon(true);
        this.field2060.start();
    }

    @ObfuscatedName("fs.v(I)Z")
    public boolean method3092() {
        if (!this.field2067) {
            return false;
        }
        try {
            this.field2065.close();
            if (this.field2066 == null) {
                this.field2066 = new IOException("");
            }
        } catch (IOException var2) {
            if (this.field2066 == null) {
                this.field2066 = new IOException(var2);
            }
        }
        return true;
    }

    public void run() {
        do {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field2066 != null) {
                        return;
                    }
                    if (this.field2063 <= this.field2064) {
                        var2 = this.field2064 - this.field2063;
                    } else {
                        var2 = this.field2064 + (this.field2061 - this.field2063);
                    }
                    if (var2 > 0) {
                        break;
                    }
                    try {
                        this.field2065.flush();
                    } catch (IOException var15) {
                        this.field2066 = var15;
                        return;
                    }
                    if (this.method3092()) {
                        return;
                    }
                    try {
                        this.wait();
                    } catch (InterruptedException var16) {
                    }
                }
            }
            try {
                if (this.field2063 + var2 <= this.field2061) {
                    this.field2065.write(this.field2062, this.field2063, var2);
                } else {
                    int var6 = this.field2061 - this.field2063;
                    this.field2065.write(this.field2062, this.field2063, var6);
                    this.field2065.write(this.field2062, 0, var2 - var6);
                }
            } catch (IOException var14) {
                IOException var7 = var14;
                synchronized (this) {
                    this.field2066 = var7;
                    return;
                }
            }
            synchronized (this) {
                this.field2063 = (this.field2063 + var2) % this.field2061;
            }
        } while (!this.method3092());
    }

    @ObfuscatedName("fs.s([BIII)V")
    public void method3093(byte[] arg0, int arg1, int arg2) throws IOException {
        if (arg2 < 0 || arg1 < 0 || arg1 + arg2 > arg0.length) {
            throw new IOException();
        }
        synchronized (this) {
            if (this.field2066 != null) {
                throw new IOException(this.field2066.toString());
            }
            int var5;
            if (this.field2063 <= this.field2064) {
                var5 = this.field2063 + (this.field2061 - this.field2064) - 1;
            } else {
                var5 = this.field2063 - this.field2064 - 1;
            }
            if (var5 < arg2) {
                throw new IOException("");
            }
            if (this.field2064 + arg2 <= this.field2061) {
                System.arraycopy(arg0, arg1, this.field2062, this.field2064, arg2);
            } else {
                int var6 = this.field2061 - this.field2064;
                System.arraycopy(arg0, arg1, this.field2062, this.field2064, var6);
                System.arraycopy(arg0, arg1 + var6, this.field2062, 0, arg2 - var6);
            }
            this.field2064 = (this.field2064 + arg2) % this.field2061;
            this.notifyAll();
        }
    }

    @ObfuscatedName("fs.o(B)V")
    public void method3094() {
        synchronized (this) {
            this.field2067 = true;
            this.notifyAll();
        }
        try {
            this.field2060.join();
        } catch (InterruptedException var4) {
        }
    }
}
