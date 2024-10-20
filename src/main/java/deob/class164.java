package deob;

import java.io.IOException;
import java.io.OutputStream;

@ObfuscatedName("fi")
public class class164 implements Runnable {

    @ObfuscatedName("fi.w")
    public Thread field2033;

    @ObfuscatedName("fi.m")
    public OutputStream field2032;

    @ObfuscatedName("fi.q")
    public int field2036;

    @ObfuscatedName("fi.b")
    public byte[] field2034;

    @ObfuscatedName("fi.f")
    public int field2040 = 0;

    @ObfuscatedName("fi.n")
    public int field2031 = 0;

    @ObfuscatedName("fi.h")
    public IOException field2035;

    @ObfuscatedName("fi.x")
    public boolean field2038;

    public class164(OutputStream arg0, int arg1) {
        this.field2032 = arg0;
        this.field2036 = arg1 + 1;
        this.field2034 = new byte[this.field2036];
        this.field2033 = new Thread(this);
        this.field2033.setDaemon(true);
        this.field2033.start();
    }

    @ObfuscatedName("fi.w(I)Z")
    public boolean method3096() {
        if (!this.field2038) {
            return false;
        }
        try {
            this.field2032.close();
            if (this.field2035 == null) {
                this.field2035 = new IOException("");
            }
        } catch (IOException var2) {
            if (this.field2035 == null) {
                this.field2035 = new IOException(var2);
            }
        }
        return true;
    }

    public void run() {
        do {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field2035 != null) {
                        return;
                    }
                    if (this.field2040 <= this.field2031) {
                        var2 = this.field2031 - this.field2040;
                    } else {
                        var2 = this.field2031 + (this.field2036 - this.field2040);
                    }
                    if (var2 > 0) {
                        break;
                    }
                    try {
                        this.field2032.flush();
                    } catch (IOException var15) {
                        this.field2035 = var15;
                        return;
                    }
                    if (this.method3096()) {
                        return;
                    }
                    try {
                        this.wait();
                    } catch (InterruptedException var16) {
                    }
                }
            }
            try {
                if (this.field2040 + var2 <= this.field2036) {
                    this.field2032.write(this.field2034, this.field2040, var2);
                } else {
                    int var6 = this.field2036 - this.field2040;
                    this.field2032.write(this.field2034, this.field2040, var6);
                    this.field2032.write(this.field2034, 0, var2 - var6);
                }
            } catch (IOException var14) {
                IOException var7 = var14;
                synchronized (this) {
                    this.field2035 = var7;
                    return;
                }
            }
            synchronized (this) {
                this.field2040 = (this.field2040 + var2) % this.field2036;
            }
        } while (!this.method3096());
    }

    @ObfuscatedName("fi.m([BIII)V")
    public void method3101(byte[] arg0, int arg1, int arg2) throws IOException {
        if (arg2 < 0 || arg1 < 0 || arg1 + arg2 > arg0.length) {
            throw new IOException();
        }
        synchronized (this) {
            if (this.field2035 != null) {
                throw new IOException(this.field2035.toString());
            }
            int var5;
            if (this.field2040 <= this.field2031) {
                var5 = this.field2040 + (this.field2036 - this.field2031) - 1;
            } else {
                var5 = this.field2040 - this.field2031 - 1;
            }
            if (var5 < arg2) {
                throw new IOException("");
            }
            if (this.field2031 + arg2 <= this.field2036) {
                System.arraycopy(arg0, arg1, this.field2034, this.field2031, arg2);
            } else {
                int var6 = this.field2036 - this.field2031;
                System.arraycopy(arg0, arg1, this.field2034, this.field2031, var6);
                System.arraycopy(arg0, arg1 + var6, this.field2034, 0, arg2 - var6);
            }
            this.field2031 = (this.field2031 + arg2) % this.field2036;
            this.notifyAll();
        }
    }

    @ObfuscatedName("fi.q(B)V")
    public void method3099() {
        synchronized (this) {
            this.field2038 = true;
            this.notifyAll();
        }
        try {
            this.field2033.join();
        } catch (InterruptedException var4) {
        }
    }
}
