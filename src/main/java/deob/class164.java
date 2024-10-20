package deob;

import java.io.IOException;
import java.io.OutputStream;

@ObfuscatedName("fc")
public class class164 implements Runnable {

    @ObfuscatedName("fc.z")
    public Thread field2009;

    @ObfuscatedName("fc.w")
    public OutputStream field2007;

    @ObfuscatedName("fc.s")
    public int field2016;

    @ObfuscatedName("fc.l")
    public byte[] field2013;

    @ObfuscatedName("fc.u")
    public int field2011 = 0;

    @ObfuscatedName("fc.q")
    public int field2006 = 0;

    @ObfuscatedName("fc.k")
    public IOException field2012;

    @ObfuscatedName("fc.i")
    public boolean field2010;

    public class164(OutputStream arg0, int arg1) {
        this.field2007 = arg0;
        this.field2016 = arg1 + 1;
        this.field2013 = new byte[this.field2016];
        this.field2009 = new Thread(this);
        this.field2009.setDaemon(true);
        this.field2009.start();
    }

    @ObfuscatedName("fc.z(I)Z")
    public boolean method3096() {
        if (!this.field2010) {
            return false;
        }
        try {
            this.field2007.close();
            if (this.field2012 == null) {
                this.field2012 = new IOException("");
            }
        } catch (IOException var2) {
            if (this.field2012 == null) {
                this.field2012 = new IOException(var2);
            }
        }
        return true;
    }

    public void run() {
        do {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field2012 != null) {
                        return;
                    }
                    if (this.field2011 <= this.field2006) {
                        var2 = this.field2006 - this.field2011;
                    } else {
                        var2 = this.field2006 + (this.field2016 - this.field2011);
                    }
                    if (var2 > 0) {
                        break;
                    }
                    try {
                        this.field2007.flush();
                    } catch (IOException var15) {
                        this.field2012 = var15;
                        return;
                    }
                    if (this.method3096()) {
                        return;
                    }
                    try {
                        this.wait();
                    } catch (InterruptedException var16) {
                    }
                }
            }
            try {
                if (this.field2011 + var2 <= this.field2016) {
                    this.field2007.write(this.field2013, this.field2011, var2);
                } else {
                    int var6 = this.field2016 - this.field2011;
                    this.field2007.write(this.field2013, this.field2011, var6);
                    this.field2007.write(this.field2013, 0, var2 - var6);
                }
            } catch (IOException var14) {
                IOException var7 = var14;
                synchronized (this) {
                    this.field2012 = var7;
                    return;
                }
            }
            synchronized (this) {
                this.field2011 = (this.field2011 + var2) % this.field2016;
            }
        } while (!this.method3096());
    }

    @ObfuscatedName("fc.w([BIII)V")
    public void method3089(byte[] arg0, int arg1, int arg2) throws IOException {
        if (arg2 < 0 || arg1 < 0 || arg1 + arg2 > arg0.length) {
            throw new IOException();
        }
        synchronized (this) {
            if (this.field2012 != null) {
                throw new IOException(this.field2012.toString());
            }
            int var5;
            if (this.field2011 <= this.field2006) {
                var5 = this.field2011 + (this.field2016 - this.field2006) - 1;
            } else {
                var5 = this.field2011 - this.field2006 - 1;
            }
            if (var5 < arg2) {
                throw new IOException("");
            }
            if (this.field2006 + arg2 <= this.field2016) {
                System.arraycopy(arg0, arg1, this.field2013, this.field2006, arg2);
            } else {
                int var6 = this.field2016 - this.field2006;
                System.arraycopy(arg0, arg1, this.field2013, this.field2006, var6);
                System.arraycopy(arg0, arg1 + var6, this.field2013, 0, arg2 - var6);
            }
            this.field2006 = (this.field2006 + arg2) % this.field2016;
            this.notifyAll();
        }
    }

    @ObfuscatedName("fc.s(I)V")
    public void method3090() {
        synchronized (this) {
            this.field2010 = true;
            this.notifyAll();
        }
        try {
            this.field2009.join();
        } catch (InterruptedException var4) {
        }
    }
}
