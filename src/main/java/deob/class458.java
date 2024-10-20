package deob;

import java.io.IOException;
import java.io.OutputStream;

@ObfuscatedName("rf")
public class class458 implements Runnable {

    @ObfuscatedName("rf.am")
    public Thread field4762;

    @ObfuscatedName("rf.ap")
    public OutputStream field4768;

    @ObfuscatedName("rf.af")
    public int field4766;

    @ObfuscatedName("rf.aj")
    public byte[] field4764;

    @ObfuscatedName("rf.aq")
    public int field4763 = 0;

    @ObfuscatedName("rf.ar")
    public int field4761 = 0;

    @ObfuscatedName("rf.ag")
    public IOException field4767;

    @ObfuscatedName("rf.ao")
    public boolean field4765;

    public class458(OutputStream arg0, int arg1) {
        this.field4768 = arg0;
        this.field4766 = arg1 + 1;
        this.field4764 = new byte[this.field4766];
        this.field4762 = new Thread(this);
        this.field4762.setDaemon(true);
        this.field4762.start();
    }

    @ObfuscatedName("rf.am(I)Z")
    public boolean method7717() {
        if (!this.field4765) {
            return false;
        }
        try {
            this.field4768.close();
            if (this.field4767 == null) {
                this.field4767 = new IOException("");
            }
        } catch (IOException var2) {
            if (this.field4767 == null) {
                this.field4767 = new IOException(var2);
            }
        }
        return true;
    }

    public void run() {
        do {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field4767 != null) {
                        return;
                    }
                    if (this.field4763 <= this.field4761) {
                        var2 = this.field4761 - this.field4763;
                    } else {
                        var2 = this.field4761 + (this.field4766 - this.field4763);
                    }
                    if (var2 > 0) {
                        break;
                    }
                    try {
                        this.field4768.flush();
                    } catch (IOException var15) {
                        this.field4767 = var15;
                        return;
                    }
                    if (this.method7717()) {
                        return;
                    }
                    try {
                        this.wait();
                    } catch (InterruptedException var16) {
                    }
                }
            }
            try {
                if (this.field4763 + var2 <= this.field4766) {
                    this.field4768.write(this.field4764, this.field4763, var2);
                } else {
                    int var6 = this.field4766 - this.field4763;
                    this.field4768.write(this.field4764, this.field4763, var6);
                    this.field4768.write(this.field4764, 0, var2 - var6);
                }
            } catch (IOException var14) {
                IOException var7 = var14;
                synchronized (this) {
                    this.field4767 = var7;
                    return;
                }
            }
            synchronized (this) {
                this.field4763 = (this.field4763 + var2) % this.field4766;
            }
        } while (!this.method7717());
    }

    @ObfuscatedName("rf.ap([BIIB)V")
    public void method7705(byte[] arg0, int arg1, int arg2) throws IOException {
        if (arg2 < 0 || arg1 < 0 || arg1 + arg2 > arg0.length) {
            throw new IOException();
        }
        synchronized (this) {
            if (this.field4767 != null) {
                throw new IOException(this.field4767.toString());
            }
            int var5;
            if (this.field4763 <= this.field4761) {
                var5 = this.field4763 + (this.field4766 - this.field4761) - 1;
            } else {
                var5 = this.field4763 - this.field4761 - 1;
            }
            if (var5 < arg2) {
                throw new IOException("");
            }
            if (this.field4761 + arg2 <= this.field4766) {
                System.arraycopy(arg0, arg1, this.field4764, this.field4761, arg2);
            } else {
                int var6 = this.field4766 - this.field4761;
                System.arraycopy(arg0, arg1, this.field4764, this.field4761, var6);
                System.arraycopy(arg0, arg1 + var6, this.field4764, 0, arg2 - var6);
            }
            this.field4761 = (this.field4761 + arg2) % this.field4766;
            this.notifyAll();
        }
    }

    @ObfuscatedName("rf.af(B)V")
    public void method7708() {
        synchronized (this) {
            this.field4765 = true;
            this.notifyAll();
        }
        try {
            this.field4762.join();
        } catch (InterruptedException var4) {
        }
    }
}
