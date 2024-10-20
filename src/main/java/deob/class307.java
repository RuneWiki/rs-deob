package deob;

import java.io.IOException;
import java.io.OutputStream;

@ObfuscatedName("kb")
public class class307 implements Runnable {

    @ObfuscatedName("kb.f")
    public Thread field3770;

    @ObfuscatedName("kb.i")
    public OutputStream field3769;

    @ObfuscatedName("kb.y")
    public int field3775;

    @ObfuscatedName("kb.w")
    public byte[] field3771;

    @ObfuscatedName("kb.p")
    public int field3772 = 0;

    @ObfuscatedName("kb.b")
    public int field3773 = 0;

    @ObfuscatedName("kb.e")
    public IOException field3774;

    @ObfuscatedName("kb.x")
    public boolean field3776;

    public class307(OutputStream arg0, int arg1) {
        this.field3769 = arg0;
        this.field3775 = arg1 + 1;
        this.field3771 = new byte[this.field3775];
        this.field3770 = new Thread(this);
        this.field3770.setDaemon(true);
        this.field3770.start();
    }

    @ObfuscatedName("kb.f(I)Z")
    public boolean method5405() {
        if (!this.field3776) {
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
                        var2 = this.field3773 + (this.field3775 - this.field3772);
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
                    if (this.method5405()) {
                        return;
                    }
                    try {
                        this.wait();
                    } catch (InterruptedException var16) {
                    }
                }
            }
            try {
                if (this.field3772 + var2 <= this.field3775) {
                    this.field3769.write(this.field3771, this.field3772, var2);
                } else {
                    int var6 = this.field3775 - this.field3772;
                    this.field3769.write(this.field3771, this.field3772, var6);
                    this.field3769.write(this.field3771, 0, var2 - var6);
                }
            } catch (IOException var14) {
                IOException var7 = var14;
                synchronized (this) {
                    this.field3774 = var7;
                    return;
                }
            }
            synchronized (this) {
                this.field3772 = (this.field3772 + var2) % this.field3775;
            }
        } while (!this.method5405());
    }

    @ObfuscatedName("kb.i([BIII)V")
    public void method5406(byte[] arg0, int arg1, int arg2) throws IOException {
        if (arg2 < 0 || arg1 < 0 || arg1 + arg2 > arg0.length) {
            throw new IOException();
        }
        synchronized (this) {
            if (this.field3774 != null) {
                throw new IOException(this.field3774.toString());
            }
            int var5;
            if (this.field3772 <= this.field3773) {
                var5 = this.field3772 + (this.field3775 - this.field3773) - 1;
            } else {
                var5 = this.field3772 - this.field3773 - 1;
            }
            if (var5 < arg2) {
                throw new IOException("");
            }
            if (this.field3773 + arg2 <= this.field3775) {
                System.arraycopy(arg0, arg1, this.field3771, this.field3773, arg2);
            } else {
                int var6 = this.field3775 - this.field3773;
                System.arraycopy(arg0, arg1, this.field3771, this.field3773, var6);
                System.arraycopy(arg0, arg1 + var6, this.field3771, 0, arg2 - var6);
            }
            this.field3773 = (this.field3773 + arg2) % this.field3775;
            this.notifyAll();
        }
    }

    @ObfuscatedName("kb.y(I)V")
    public void method5411() {
        synchronized (this) {
            this.field3776 = true;
            this.notifyAll();
        }
        try {
            this.field3770.join();
        } catch (InterruptedException var4) {
        }
    }
}
