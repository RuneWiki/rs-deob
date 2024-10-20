package deob;

import java.io.IOException;
import java.io.OutputStream;

@ObfuscatedName("kv")
public class class308 implements Runnable {

    @ObfuscatedName("kv.c")
    public Thread field3770;

    @ObfuscatedName("kv.t")
    public OutputStream field3771;

    @ObfuscatedName("kv.o")
    public int field3768;

    @ObfuscatedName("kv.e")
    public byte[] field3767;

    @ObfuscatedName("kv.i")
    public int field3769 = 0;

    @ObfuscatedName("kv.g")
    public int field3772 = 0;

    @ObfuscatedName("kv.d")
    public IOException field3773;

    @ObfuscatedName("kv.l")
    public boolean field3774;

    public class308(OutputStream arg0, int arg1) {
        this.field3771 = arg0;
        this.field3768 = arg1 + 1;
        this.field3767 = new byte[this.field3768];
        this.field3770 = new Thread(this);
        this.field3770.setDaemon(true);
        this.field3770.start();
    }

    @ObfuscatedName("kv.c(B)Z")
    public boolean method5426() {
        if (!this.field3774) {
            return false;
        }
        try {
            this.field3771.close();
            if (this.field3773 == null) {
                this.field3773 = new IOException("");
            }
        } catch (IOException var2) {
            if (this.field3773 == null) {
                this.field3773 = new IOException(var2);
            }
        }
        return true;
    }

    public void run() {
        do {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field3773 != null) {
                        return;
                    }
                    if (this.field3769 <= this.field3772) {
                        var2 = this.field3772 - this.field3769;
                    } else {
                        var2 = this.field3772 + (this.field3768 - this.field3769);
                    }
                    if (var2 > 0) {
                        break;
                    }
                    try {
                        this.field3771.flush();
                    } catch (IOException var15) {
                        this.field3773 = var15;
                        return;
                    }
                    if (this.method5426()) {
                        return;
                    }
                    try {
                        this.wait();
                    } catch (InterruptedException var16) {
                    }
                }
            }
            try {
                if (this.field3769 + var2 <= this.field3768) {
                    this.field3771.write(this.field3767, this.field3769, var2);
                } else {
                    int var6 = this.field3768 - this.field3769;
                    this.field3771.write(this.field3767, this.field3769, var6);
                    this.field3771.write(this.field3767, 0, var2 - var6);
                }
            } catch (IOException var14) {
                IOException var7 = var14;
                synchronized (this) {
                    this.field3773 = var7;
                    return;
                }
            }
            synchronized (this) {
                this.field3769 = (this.field3769 + var2) % this.field3768;
            }
        } while (!this.method5426());
    }

    @ObfuscatedName("kv.t([BIIB)V")
    public void method5420(byte[] arg0, int arg1, int arg2) throws IOException {
        if (arg2 < 0 || arg1 < 0 || arg1 + arg2 > arg0.length) {
            throw new IOException();
        }
        synchronized (this) {
            if (this.field3773 != null) {
                throw new IOException(this.field3773.toString());
            }
            int var5;
            if (this.field3769 <= this.field3772) {
                var5 = this.field3769 + (this.field3768 - this.field3772) - 1;
            } else {
                var5 = this.field3769 - this.field3772 - 1;
            }
            if (var5 < arg2) {
                throw new IOException("");
            }
            if (this.field3772 + arg2 <= this.field3768) {
                System.arraycopy(arg0, arg1, this.field3767, this.field3772, arg2);
            } else {
                int var6 = this.field3768 - this.field3772;
                System.arraycopy(arg0, arg1, this.field3767, this.field3772, var6);
                System.arraycopy(arg0, arg1 + var6, this.field3767, 0, arg2 - var6);
            }
            this.field3772 = (this.field3772 + arg2) % this.field3768;
            this.notifyAll();
        }
    }

    @ObfuscatedName("kv.o(I)V")
    public void method5421() {
        synchronized (this) {
            this.field3774 = true;
            this.notifyAll();
        }
        try {
            this.field3770.join();
        } catch (InterruptedException var4) {
        }
    }
}
