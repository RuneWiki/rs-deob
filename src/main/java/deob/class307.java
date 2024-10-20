package deob;

import java.io.IOException;
import java.io.OutputStream;

@ObfuscatedName("ki")
public class class307 implements Runnable {

    @ObfuscatedName("ki.s")
    public Thread field3772;

    @ObfuscatedName("ki.j")
    public OutputStream field3769;

    @ObfuscatedName("ki.i")
    public int field3768;

    @ObfuscatedName("ki.k")
    public byte[] field3771;

    @ObfuscatedName("ki.u")
    public int field3774 = 0;

    @ObfuscatedName("ki.n")
    public int field3773 = 0;

    @ObfuscatedName("ki.t")
    public IOException field3770;

    @ObfuscatedName("ki.q")
    public boolean field3775;

    public class307(OutputStream arg0, int arg1) {
        this.field3769 = arg0;
        this.field3768 = arg1 + 1;
        this.field3771 = new byte[this.field3768];
        this.field3772 = new Thread(this);
        this.field3772.setDaemon(true);
        this.field3772.start();
    }

    @ObfuscatedName("ki.s(B)Z")
    public boolean method5337() {
        if (!this.field3775) {
            return false;
        }
        try {
            this.field3769.close();
            if (this.field3770 == null) {
                this.field3770 = new IOException("");
            }
        } catch (IOException var2) {
            if (this.field3770 == null) {
                this.field3770 = new IOException(var2);
            }
        }
        return true;
    }

    public void run() {
        do {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field3770 != null) {
                        return;
                    }
                    if (this.field3774 <= this.field3773) {
                        var2 = this.field3773 - this.field3774;
                    } else {
                        var2 = this.field3773 + (this.field3768 - this.field3774);
                    }
                    if (var2 > 0) {
                        break;
                    }
                    try {
                        this.field3769.flush();
                    } catch (IOException var15) {
                        this.field3770 = var15;
                        return;
                    }
                    if (this.method5337()) {
                        return;
                    }
                    try {
                        this.wait();
                    } catch (InterruptedException var16) {
                    }
                }
            }
            try {
                if (this.field3774 + var2 <= this.field3768) {
                    this.field3769.write(this.field3771, this.field3774, var2);
                } else {
                    int var6 = this.field3768 - this.field3774;
                    this.field3769.write(this.field3771, this.field3774, var6);
                    this.field3769.write(this.field3771, 0, var2 - var6);
                }
            } catch (IOException var14) {
                IOException var7 = var14;
                synchronized (this) {
                    this.field3770 = var7;
                    return;
                }
            }
            synchronized (this) {
                this.field3774 = (this.field3774 + var2) % this.field3768;
            }
        } while (!this.method5337());
    }

    @ObfuscatedName("ki.j([BIIB)V")
    public void method5339(byte[] arg0, int arg1, int arg2) throws IOException {
        if (arg2 < 0 || arg1 < 0 || arg1 + arg2 > arg0.length) {
            throw new IOException();
        }
        synchronized (this) {
            if (this.field3770 != null) {
                throw new IOException(this.field3770.toString());
            }
            int var5;
            if (this.field3774 <= this.field3773) {
                var5 = this.field3774 + (this.field3768 - this.field3773) - 1;
            } else {
                var5 = this.field3774 - this.field3773 - 1;
            }
            if (var5 < arg2) {
                throw new IOException("");
            }
            if (this.field3773 + arg2 <= this.field3768) {
                System.arraycopy(arg0, arg1, this.field3771, this.field3773, arg2);
            } else {
                int var6 = this.field3768 - this.field3773;
                System.arraycopy(arg0, arg1, this.field3771, this.field3773, var6);
                System.arraycopy(arg0, arg1 + var6, this.field3771, 0, arg2 - var6);
            }
            this.field3773 = (this.field3773 + arg2) % this.field3768;
            this.notifyAll();
        }
    }

    @ObfuscatedName("ki.i(B)V")
    public void method5336() {
        synchronized (this) {
            this.field3775 = true;
            this.notifyAll();
        }
        try {
            this.field3772.join();
        } catch (InterruptedException var4) {
        }
    }
}
