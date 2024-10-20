package deob;

import java.io.IOException;
import java.io.OutputStream;

@ObfuscatedName("fa")
public class class176 implements Runnable {

    @ObfuscatedName("fa.g")
    public Thread field2237;

    @ObfuscatedName("fa.e")
    public OutputStream field2245;

    @ObfuscatedName("fa.b")
    public int field2238;

    @ObfuscatedName("fa.z")
    public byte[] field2240;

    @ObfuscatedName("fa.n")
    public int field2241 = 0;

    @ObfuscatedName("fa.l")
    public int field2242 = 0;

    @ObfuscatedName("fa.s")
    public IOException field2243;

    @ObfuscatedName("fa.y")
    public boolean field2239;

    public class176(OutputStream arg0, int arg1) {
        this.field2245 = arg0;
        this.field2238 = arg1 + 1;
        this.field2240 = new byte[this.field2238];
        this.field2237 = new Thread(this);
        this.field2237.setDaemon(true);
        this.field2237.start();
    }

    @ObfuscatedName("fa.g(I)Z")
    public boolean method3157() {
        if (!this.field2239) {
            return false;
        }
        try {
            this.field2245.close();
            if (this.field2243 == null) {
                this.field2243 = new IOException("");
            }
        } catch (IOException var2) {
            if (this.field2243 == null) {
                this.field2243 = new IOException(var2);
            }
        }
        return true;
    }

    public void run() {
        do {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field2243 != null) {
                        return;
                    }
                    if (this.field2241 <= this.field2242) {
                        var2 = this.field2242 - this.field2241;
                    } else {
                        var2 = this.field2242 + (this.field2238 - this.field2241);
                    }
                    if (var2 > 0) {
                        break;
                    }
                    try {
                        this.field2245.flush();
                    } catch (IOException var15) {
                        this.field2243 = var15;
                        return;
                    }
                    if (this.method3157()) {
                        return;
                    }
                    try {
                        this.wait();
                    } catch (InterruptedException var16) {
                    }
                }
            }
            try {
                if (this.field2241 + var2 <= this.field2238) {
                    this.field2245.write(this.field2240, this.field2241, var2);
                } else {
                    int var6 = this.field2238 - this.field2241;
                    this.field2245.write(this.field2240, this.field2241, var6);
                    this.field2245.write(this.field2240, 0, var2 - var6);
                }
            } catch (IOException var14) {
                IOException var7 = var14;
                synchronized (this) {
                    this.field2243 = var7;
                    return;
                }
            }
            synchronized (this) {
                this.field2241 = (this.field2241 + var2) % this.field2238;
            }
        } while (!this.method3157());
    }

    @ObfuscatedName("fa.e([BIII)V")
    public void method3165(byte[] arg0, int arg1, int arg2) throws IOException {
        if (arg2 < 0 || arg1 < 0 || arg1 + arg2 > arg0.length) {
            throw new IOException();
        }
        synchronized (this) {
            if (this.field2243 != null) {
                throw new IOException(this.field2243.toString());
            }
            int var5;
            if (this.field2241 <= this.field2242) {
                var5 = this.field2241 + (this.field2238 - this.field2242) - 1;
            } else {
                var5 = this.field2241 - this.field2242 - 1;
            }
            if (var5 < arg2) {
                throw new IOException("");
            }
            if (this.field2242 + arg2 <= this.field2238) {
                System.arraycopy(arg0, arg1, this.field2240, this.field2242, arg2);
            } else {
                int var6 = this.field2238 - this.field2242;
                System.arraycopy(arg0, arg1, this.field2240, this.field2242, var6);
                System.arraycopy(arg0, arg1 + var6, this.field2240, 0, arg2 - var6);
            }
            this.field2242 = (this.field2242 + arg2) % this.field2238;
            this.notifyAll();
        }
    }

    @ObfuscatedName("fa.b(I)V")
    public void method3159() {
        synchronized (this) {
            this.field2239 = true;
            this.notifyAll();
        }
        try {
            this.field2237.join();
        } catch (InterruptedException var4) {
        }
    }
}
