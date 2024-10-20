package deob;

import java.io.IOException;
import java.io.OutputStream;

@ObfuscatedName("kb")
public class class307 implements Runnable {

    @ObfuscatedName("kb.u")
    public Thread field3776;

    @ObfuscatedName("kb.f")
    public OutputStream field3772;

    @ObfuscatedName("kb.b")
    public int field3773;

    @ObfuscatedName("kb.g")
    public byte[] field3774;

    @ObfuscatedName("kb.z")
    public int field3771 = 0;

    @ObfuscatedName("kb.p")
    public int field3775 = 0;

    @ObfuscatedName("kb.h")
    public IOException field3777;

    @ObfuscatedName("kb.y")
    public boolean field3778;

    public class307(OutputStream arg0, int arg1) {
        this.field3772 = arg0;
        this.field3773 = arg1 + 1;
        this.field3774 = new byte[this.field3773];
        this.field3776 = new Thread(this);
        this.field3776.setDaemon(true);
        this.field3776.start();
    }

    @ObfuscatedName("kb.u(I)Z")
    public boolean method5443() {
        if (!this.field3778) {
            return false;
        }
        try {
            this.field3772.close();
            if (this.field3777 == null) {
                this.field3777 = new IOException("");
            }
        } catch (IOException var2) {
            if (this.field3777 == null) {
                this.field3777 = new IOException(var2);
            }
        }
        return true;
    }

    public void run() {
        do {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field3777 != null) {
                        return;
                    }
                    if (this.field3771 <= this.field3775) {
                        var2 = this.field3775 - this.field3771;
                    } else {
                        var2 = this.field3775 + (this.field3773 - this.field3771);
                    }
                    if (var2 > 0) {
                        break;
                    }
                    try {
                        this.field3772.flush();
                    } catch (IOException var15) {
                        this.field3777 = var15;
                        return;
                    }
                    if (this.method5443()) {
                        return;
                    }
                    try {
                        this.wait();
                    } catch (InterruptedException var16) {
                    }
                }
            }
            try {
                if (this.field3771 + var2 <= this.field3773) {
                    this.field3772.write(this.field3774, this.field3771, var2);
                } else {
                    int var6 = this.field3773 - this.field3771;
                    this.field3772.write(this.field3774, this.field3771, var6);
                    this.field3772.write(this.field3774, 0, var2 - var6);
                }
            } catch (IOException var14) {
                IOException var7 = var14;
                synchronized (this) {
                    this.field3777 = var7;
                    return;
                }
            }
            synchronized (this) {
                this.field3771 = (this.field3771 + var2) % this.field3773;
            }
        } while (!this.method5443());
    }

    @ObfuscatedName("kb.f([BIIB)V")
    public void method5445(byte[] arg0, int arg1, int arg2) throws IOException {
        if (arg2 < 0 || arg1 < 0 || arg1 + arg2 > arg0.length) {
            throw new IOException();
        }
        synchronized (this) {
            if (this.field3777 != null) {
                throw new IOException(this.field3777.toString());
            }
            int var5;
            if (this.field3771 <= this.field3775) {
                var5 = this.field3771 + (this.field3773 - this.field3775) - 1;
            } else {
                var5 = this.field3771 - this.field3775 - 1;
            }
            if (var5 < arg2) {
                throw new IOException("");
            }
            if (this.field3775 + arg2 <= this.field3773) {
                System.arraycopy(arg0, arg1, this.field3774, this.field3775, arg2);
            } else {
                int var6 = this.field3773 - this.field3775;
                System.arraycopy(arg0, arg1, this.field3774, this.field3775, var6);
                System.arraycopy(arg0, arg1 + var6, this.field3774, 0, arg2 - var6);
            }
            this.field3775 = (this.field3775 + arg2) % this.field3773;
            this.notifyAll();
        }
    }

    @ObfuscatedName("kb.b(I)V")
    public void method5442() {
        synchronized (this) {
            this.field3778 = true;
            this.notifyAll();
        }
        try {
            this.field3776.join();
        } catch (InterruptedException var4) {
        }
    }
}
