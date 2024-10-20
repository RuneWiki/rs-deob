package deob;

import java.io.IOException;
import java.io.OutputStream;

@ObfuscatedName("kv")
public class class307 implements Runnable {

    @ObfuscatedName("kv.z")
    public Thread field3771;

    @ObfuscatedName("kv.n")
    public OutputStream field3769;

    @ObfuscatedName("kv.v")
    public int field3770;

    @ObfuscatedName("kv.u")
    public byte[] field3768;

    @ObfuscatedName("kv.r")
    public int field3772 = 0;

    @ObfuscatedName("kv.p")
    public int field3773 = 0;

    @ObfuscatedName("kv.q")
    public IOException field3774;

    @ObfuscatedName("kv.m")
    public boolean field3775;

    public class307(OutputStream arg0, int arg1) {
        this.field3769 = arg0;
        this.field3770 = arg1 + 1;
        this.field3768 = new byte[this.field3770];
        this.field3771 = new Thread(this);
        this.field3771.setDaemon(true);
        this.field3771.start();
    }

    @ObfuscatedName("kv.z(B)Z")
    public boolean method5277() {
        if (!this.field3775) {
            return false;
        }
        try {
            this.field3769.close();
            if (this.field3774 == null) {
                this.field3774 = new IOException("");
            }
        } catch (IOException var2) {
            if (this.field3774 == null) {
                this.field3774 = new IOException(var2);
            }
        }
        return true;
    }

    public void run() {
        do {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field3774 != null) {
                        return;
                    }
                    if (this.field3772 <= this.field3773) {
                        var2 = this.field3773 - this.field3772;
                    } else {
                        var2 = this.field3773 + (this.field3770 - this.field3772);
                    }
                    if (var2 > 0) {
                        break;
                    }
                    try {
                        this.field3769.flush();
                    } catch (IOException var15) {
                        this.field3774 = var15;
                        return;
                    }
                    if (this.method5277()) {
                        return;
                    }
                    try {
                        this.wait();
                    } catch (InterruptedException var16) {
                    }
                }
            }
            try {
                if (this.field3772 + var2 <= this.field3770) {
                    this.field3769.write(this.field3768, this.field3772, var2);
                } else {
                    int var6 = this.field3770 - this.field3772;
                    this.field3769.write(this.field3768, this.field3772, var6);
                    this.field3769.write(this.field3768, 0, var2 - var6);
                }
            } catch (IOException var14) {
                IOException var7 = var14;
                synchronized (this) {
                    this.field3774 = var7;
                    return;
                }
            }
            synchronized (this) {
                this.field3772 = (this.field3772 + var2) % this.field3770;
            }
        } while (!this.method5277());
    }

    @ObfuscatedName("kv.n([BIIB)V")
    public void method5291(byte[] arg0, int arg1, int arg2) throws IOException {
        if (arg2 < 0 || arg1 < 0 || arg1 + arg2 > arg0.length) {
            throw new IOException();
        }
        synchronized (this) {
            if (this.field3774 != null) {
                throw new IOException(this.field3774.toString());
            }
            int var5;
            if (this.field3772 <= this.field3773) {
                var5 = this.field3772 + (this.field3770 - this.field3773) - 1;
            } else {
                var5 = this.field3772 - this.field3773 - 1;
            }
            if (var5 < arg2) {
                throw new IOException("");
            }
            if (this.field3773 + arg2 <= this.field3770) {
                System.arraycopy(arg0, arg1, this.field3768, this.field3773, arg2);
            } else {
                int var6 = this.field3770 - this.field3773;
                System.arraycopy(arg0, arg1, this.field3768, this.field3773, var6);
                System.arraycopy(arg0, arg1 + var6, this.field3768, 0, arg2 - var6);
            }
            this.field3773 = (this.field3773 + arg2) % this.field3770;
            this.notifyAll();
        }
    }

    @ObfuscatedName("kv.v(I)V")
    public void method5285() {
        synchronized (this) {
            this.field3775 = true;
            this.notifyAll();
        }
        try {
            this.field3771.join();
        } catch (InterruptedException var4) {
        }
    }
}
