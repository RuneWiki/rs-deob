package deob;

import java.io.IOException;
import java.io.OutputStream;

@ObfuscatedName("rs")
public class class457 implements Runnable {

    @ObfuscatedName("rs.ac")
    public Thread field4735;

    @ObfuscatedName("rs.al")
    public OutputStream field4739;

    @ObfuscatedName("rs.ak")
    public int field4737;

    @ObfuscatedName("rs.ax")
    public byte[] field4734;

    @ObfuscatedName("rs.ao")
    public int field4736 = 0;

    @ObfuscatedName("rs.ah")
    public int field4738 = 0;

    @ObfuscatedName("rs.ar")
    public IOException field4740;

    @ObfuscatedName("rs.ab")
    public boolean field4741;

    public class457(OutputStream arg0, int arg1) {
        this.field4739 = arg0;
        this.field4737 = arg1 + 1;
        this.field4734 = new byte[this.field4737];
        this.field4735 = new Thread(this);
        this.field4735.setDaemon(true);
        this.field4735.start();
    }

    @ObfuscatedName("rs.ac(I)Z")
    public boolean method7480() {
        if (!this.field4741) {
            return false;
        }
        try {
            this.field4739.close();
            if (this.field4740 == null) {
                this.field4740 = new IOException("");
            }
        } catch (IOException var2) {
            if (this.field4740 == null) {
                this.field4740 = new IOException(var2);
            }
        }
        return true;
    }

    public void run() {
        do {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field4740 != null) {
                        return;
                    }
                    if (this.field4736 <= this.field4738) {
                        var2 = this.field4738 - this.field4736;
                    } else {
                        var2 = this.field4738 + (this.field4737 - this.field4736);
                    }
                    if (var2 > 0) {
                        break;
                    }
                    try {
                        this.field4739.flush();
                    } catch (IOException var15) {
                        this.field4740 = var15;
                        return;
                    }
                    if (this.method7480()) {
                        return;
                    }
                    try {
                        this.wait();
                    } catch (InterruptedException var16) {
                    }
                }
            }
            try {
                if (this.field4736 + var2 <= this.field4737) {
                    this.field4739.write(this.field4734, this.field4736, var2);
                } else {
                    int var6 = this.field4737 - this.field4736;
                    this.field4739.write(this.field4734, this.field4736, var6);
                    this.field4739.write(this.field4734, 0, var2 - var6);
                }
            } catch (IOException var14) {
                IOException var7 = var14;
                synchronized (this) {
                    this.field4740 = var7;
                    return;
                }
            }
            synchronized (this) {
                this.field4736 = (this.field4736 + var2) % this.field4737;
            }
        } while (!this.method7480());
    }

    @ObfuscatedName("rs.al([BIII)V")
    public void method7481(byte[] arg0, int arg1, int arg2) throws IOException {
        if (arg2 < 0 || arg1 < 0 || arg1 + arg2 > arg0.length) {
            throw new IOException();
        }
        synchronized (this) {
            if (this.field4740 != null) {
                throw new IOException(this.field4740.toString());
            }
            int var5;
            if (this.field4736 <= this.field4738) {
                var5 = this.field4736 + (this.field4737 - this.field4738) - 1;
            } else {
                var5 = this.field4736 - this.field4738 - 1;
            }
            if (var5 < arg2) {
                throw new IOException("");
            }
            if (this.field4738 + arg2 <= this.field4737) {
                System.arraycopy(arg0, arg1, this.field4734, this.field4738, arg2);
            } else {
                int var6 = this.field4737 - this.field4738;
                System.arraycopy(arg0, arg1, this.field4734, this.field4738, var6);
                System.arraycopy(arg0, arg1 + var6, this.field4734, 0, arg2 - var6);
            }
            this.field4738 = (this.field4738 + arg2) % this.field4737;
            this.notifyAll();
        }
    }

    @ObfuscatedName("rs.ak(I)V")
    public void method7479() {
        synchronized (this) {
            this.field4741 = true;
            this.notifyAll();
        }
        try {
            this.field4735.join();
        } catch (InterruptedException var4) {
        }
    }
}
