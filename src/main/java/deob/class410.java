package deob;

import java.io.IOException;
import java.io.OutputStream;

@ObfuscatedName("os")
public class class410 implements Runnable {

    @ObfuscatedName("os.f")
    public Thread field4599;

    @ObfuscatedName("os.w")
    public OutputStream field4597;

    @ObfuscatedName("os.v")
    public int field4603;

    @ObfuscatedName("os.s")
    public byte[] field4600;

    @ObfuscatedName("os.z")
    public int field4596 = 0;

    @ObfuscatedName("os.j")
    public int field4601 = 0;

    @ObfuscatedName("os.i")
    public IOException field4602;

    @ObfuscatedName("os.n")
    public boolean field4598;

    public class410(OutputStream arg0, int arg1) {
        this.field4597 = arg0;
        this.field4603 = arg1 + 1;
        this.field4600 = new byte[this.field4603];
        this.field4599 = new Thread(this);
        this.field4599.setDaemon(true);
        this.field4599.start();
    }

    @ObfuscatedName("os.f(B)Z")
    public boolean method7190() {
        if (!this.field4598) {
            return false;
        }
        try {
            this.field4597.close();
            if (this.field4602 == null) {
                this.field4602 = new IOException("");
            }
        } catch (IOException var2) {
            if (this.field4602 == null) {
                this.field4602 = new IOException(var2);
            }
        }
        return true;
    }

    public void run() {
        do {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field4602 != null) {
                        return;
                    }
                    if (this.field4596 <= this.field4601) {
                        var2 = this.field4601 - this.field4596;
                    } else {
                        var2 = this.field4601 + (this.field4603 - this.field4596);
                    }
                    if (var2 > 0) {
                        break;
                    }
                    try {
                        this.field4597.flush();
                    } catch (IOException var15) {
                        this.field4602 = var15;
                        return;
                    }
                    if (this.method7190()) {
                        return;
                    }
                    try {
                        this.wait();
                    } catch (InterruptedException var16) {
                    }
                }
            }
            try {
                if (this.field4596 + var2 <= this.field4603) {
                    this.field4597.write(this.field4600, this.field4596, var2);
                } else {
                    int var6 = this.field4603 - this.field4596;
                    this.field4597.write(this.field4600, this.field4596, var6);
                    this.field4597.write(this.field4600, 0, var2 - var6);
                }
            } catch (IOException var14) {
                IOException var7 = var14;
                synchronized (this) {
                    this.field4602 = var7;
                    return;
                }
            }
            synchronized (this) {
                this.field4596 = (this.field4596 + var2) % this.field4603;
            }
        } while (!this.method7190());
    }

    @ObfuscatedName("os.w([BIIB)V")
    public void method7191(byte[] arg0, int arg1, int arg2) throws IOException {
        if (arg2 < 0 || arg1 < 0 || arg1 + arg2 > arg0.length) {
            throw new IOException();
        }
        synchronized (this) {
            if (this.field4602 != null) {
                throw new IOException(this.field4602.toString());
            }
            int var5;
            if (this.field4596 <= this.field4601) {
                var5 = this.field4596 + (this.field4603 - this.field4601) - 1;
            } else {
                var5 = this.field4596 - this.field4601 - 1;
            }
            if (var5 < arg2) {
                throw new IOException("");
            }
            if (this.field4601 + arg2 <= this.field4603) {
                System.arraycopy(arg0, arg1, this.field4600, this.field4601, arg2);
            } else {
                int var6 = this.field4603 - this.field4601;
                System.arraycopy(arg0, arg1, this.field4600, this.field4601, var6);
                System.arraycopy(arg0, arg1 + var6, this.field4600, 0, arg2 - var6);
            }
            this.field4601 = (this.field4601 + arg2) % this.field4603;
            this.notifyAll();
        }
    }

    @ObfuscatedName("os.v(I)V")
    public void method7189() {
        synchronized (this) {
            this.field4598 = true;
            this.notifyAll();
        }
        try {
            this.field4599.join();
        } catch (InterruptedException var4) {
        }
    }
}
