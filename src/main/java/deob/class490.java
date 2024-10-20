package deob;

import java.io.IOException;
import java.io.OutputStream;

@ObfuscatedName("sn")
public class class490 implements Runnable {

    @ObfuscatedName("sn.ap")
    public Thread field5075;

    @ObfuscatedName("sn.aw")
    public OutputStream field5070;

    @ObfuscatedName("sn.ak")
    public int field5069;

    @ObfuscatedName("sn.aj")
    public byte[] field5074;

    @ObfuscatedName("sn.ai")
    public int field5073 = 0;

    @ObfuscatedName("sn.ay")
    public int field5072 = 0;

    @ObfuscatedName("sn.as")
    public IOException field5071;

    @ObfuscatedName("sn.ae")
    public boolean field5076;

    public class490(OutputStream arg0, int arg1) {
        this.field5070 = arg0;
        this.field5069 = arg1 + 1;
        this.field5074 = new byte[this.field5069];
        this.field5075 = new Thread(this);
        this.field5075.setDaemon(true);
        this.field5075.start();
    }

    @ObfuscatedName("sn.ap(B)Z")
    public boolean method8539() {
        if (!this.field5076) {
            return false;
        }
        try {
            this.field5070.close();
            if (this.field5071 == null) {
                this.field5071 = new IOException("");
            }
        } catch (IOException var2) {
            if (this.field5071 == null) {
                this.field5071 = new IOException(var2);
            }
        }
        return true;
    }

    public void run() {
        do {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field5071 != null) {
                        return;
                    }
                    if (this.field5073 <= this.field5072) {
                        var2 = this.field5072 - this.field5073;
                    } else {
                        var2 = this.field5072 + (this.field5069 - this.field5073);
                    }
                    if (var2 > 0) {
                        break;
                    }
                    try {
                        this.field5070.flush();
                    } catch (IOException var15) {
                        this.field5071 = var15;
                        return;
                    }
                    if (this.method8539()) {
                        return;
                    }
                    try {
                        this.wait();
                    } catch (InterruptedException var16) {
                    }
                }
            }
            try {
                if (this.field5073 + var2 <= this.field5069) {
                    this.field5070.write(this.field5074, this.field5073, var2);
                } else {
                    int var6 = this.field5069 - this.field5073;
                    this.field5070.write(this.field5074, this.field5073, var6);
                    this.field5070.write(this.field5074, 0, var2 - var6);
                }
            } catch (IOException var14) {
                IOException var7 = var14;
                synchronized (this) {
                    this.field5071 = var7;
                    return;
                }
            }
            synchronized (this) {
                this.field5073 = (this.field5073 + var2) % this.field5069;
            }
        } while (!this.method8539());
    }

    @ObfuscatedName("sn.aw([BIII)V")
    public void method8534(byte[] arg0, int arg1, int arg2) throws IOException {
        if (arg2 < 0 || arg1 < 0 || arg1 + arg2 > arg0.length) {
            throw new IOException();
        }
        synchronized (this) {
            if (this.field5071 != null) {
                throw new IOException(this.field5071.toString());
            }
            int var5;
            if (this.field5073 <= this.field5072) {
                var5 = this.field5073 + (this.field5069 - this.field5072) - 1;
            } else {
                var5 = this.field5073 - this.field5072 - 1;
            }
            if (var5 < arg2) {
                throw new IOException("");
            }
            if (this.field5072 + arg2 <= this.field5069) {
                System.arraycopy(arg0, arg1, this.field5074, this.field5072, arg2);
            } else {
                int var6 = this.field5069 - this.field5072;
                System.arraycopy(arg0, arg1, this.field5074, this.field5072, var6);
                System.arraycopy(arg0, arg1 + var6, this.field5074, 0, arg2 - var6);
            }
            this.field5072 = (this.field5072 + arg2) % this.field5069;
            this.notifyAll();
        }
    }

    @ObfuscatedName("sn.ak(I)V")
    public void method8536() {
        synchronized (this) {
            this.field5076 = true;
            this.notifyAll();
        }
        try {
            this.field5075.join();
        } catch (InterruptedException var4) {
        }
    }
}
