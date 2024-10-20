package deob;

import java.io.IOException;
import java.io.OutputStream;

@ObfuscatedName("ri")
public class class461 implements Runnable {

    @ObfuscatedName("ri.aq")
    public Thread field4795;

    @ObfuscatedName("ri.aw")
    public OutputStream field4798;

    @ObfuscatedName("ri.al")
    public int field4796;

    @ObfuscatedName("ri.ai")
    public byte[] field4800;

    @ObfuscatedName("ri.ar")
    public int field4797 = 0;

    @ObfuscatedName("ri.as")
    public int field4799 = 0;

    @ObfuscatedName("ri.aa")
    public IOException field4794;

    @ObfuscatedName("ri.az")
    public boolean field4801;

    public class461(OutputStream arg0, int arg1) {
        this.field4798 = arg0;
        this.field4796 = arg1 + 1;
        this.field4800 = new byte[this.field4796];
        this.field4795 = new Thread(this);
        this.field4795.setDaemon(true);
        this.field4795.start();
    }

    @ObfuscatedName("ri.aq(I)Z")
    public boolean method7716() {
        if (!this.field4801) {
            return false;
        }
        try {
            this.field4798.close();
            if (this.field4794 == null) {
                this.field4794 = new IOException("");
            }
        } catch (IOException var2) {
            if (this.field4794 == null) {
                this.field4794 = new IOException(var2);
            }
        }
        return true;
    }

    public void run() {
        do {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field4794 != null) {
                        return;
                    }
                    if (this.field4797 <= this.field4799) {
                        var2 = this.field4799 - this.field4797;
                    } else {
                        var2 = this.field4799 + (this.field4796 - this.field4797);
                    }
                    if (var2 > 0) {
                        break;
                    }
                    try {
                        this.field4798.flush();
                    } catch (IOException var15) {
                        this.field4794 = var15;
                        return;
                    }
                    if (this.method7716()) {
                        return;
                    }
                    try {
                        this.wait();
                    } catch (InterruptedException var16) {
                    }
                }
            }
            try {
                if (this.field4797 + var2 <= this.field4796) {
                    this.field4798.write(this.field4800, this.field4797, var2);
                } else {
                    int var6 = this.field4796 - this.field4797;
                    this.field4798.write(this.field4800, this.field4797, var6);
                    this.field4798.write(this.field4800, 0, var2 - var6);
                }
            } catch (IOException var14) {
                IOException var7 = var14;
                synchronized (this) {
                    this.field4794 = var7;
                    return;
                }
            }
            synchronized (this) {
                this.field4797 = (this.field4797 + var2) % this.field4796;
            }
        } while (!this.method7716());
    }

    @ObfuscatedName("ri.aw([BIII)V")
    public void method7722(byte[] arg0, int arg1, int arg2) throws IOException {
        if (arg2 < 0 || arg1 < 0 || arg1 + arg2 > arg0.length) {
            throw new IOException();
        }
        synchronized (this) {
            if (this.field4794 != null) {
                throw new IOException(this.field4794.toString());
            }
            int var5;
            if (this.field4797 <= this.field4799) {
                var5 = this.field4797 + (this.field4796 - this.field4799) - 1;
            } else {
                var5 = this.field4797 - this.field4799 - 1;
            }
            if (var5 < arg2) {
                throw new IOException("");
            }
            if (this.field4799 + arg2 <= this.field4796) {
                System.arraycopy(arg0, arg1, this.field4800, this.field4799, arg2);
            } else {
                int var6 = this.field4796 - this.field4799;
                System.arraycopy(arg0, arg1, this.field4800, this.field4799, var6);
                System.arraycopy(arg0, arg1 + var6, this.field4800, 0, arg2 - var6);
            }
            this.field4799 = (this.field4799 + arg2) % this.field4796;
            this.notifyAll();
        }
    }

    @ObfuscatedName("ri.al(I)V")
    public void method7719() {
        synchronized (this) {
            this.field4801 = true;
            this.notifyAll();
        }
        try {
            this.field4795.join();
        } catch (InterruptedException var4) {
        }
    }
}
