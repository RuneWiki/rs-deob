package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

@ObfuscatedName("fu")
public class class159 implements Runnable {

    @ObfuscatedName("fu.n")
    public Thread field2015;

    @ObfuscatedName("fu.h")
    public InputStream field2014;

    @ObfuscatedName("fu.l")
    public int field2006;

    @ObfuscatedName("fu.g")
    public byte[] field2004;

    @ObfuscatedName("fu.b")
    public int field2008 = 0;

    @ObfuscatedName("fu.a")
    public int field2009 = 0;

    @ObfuscatedName("fu.c")
    public IOException field2010;

    public class159(InputStream arg0, int arg1) {
        this.field2014 = arg0;
        this.field2006 = arg1 + 1;
        this.field2004 = new byte[this.field2006];
        this.field2015 = new Thread(this);
        this.field2015.setDaemon(true);
        this.field2015.start();
    }

    public void run() {
        while (true) {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field2010 != null) {
                        return;
                    }
                    if (this.field2008 == 0) {
                        var2 = this.field2006 - this.field2009 - 1;
                    } else if (this.field2008 <= this.field2009) {
                        var2 = this.field2006 - this.field2009;
                    } else {
                        var2 = this.field2008 - this.field2009 - 1;
                    }
                    if (var2 > 0) {
                        break;
                    }
                    try {
                        this.wait();
                    } catch (InterruptedException var13) {
                    }
                }
            }
            int var5;
            try {
                var5 = this.field2014.read(this.field2004, this.field2009, var2);
                if (var5 == -1) {
                    throw new EOFException();
                }
            } catch (IOException var14) {
                IOException var6 = var14;
                synchronized (this) {
                    this.field2010 = var6;
                    return;
                }
            }
            synchronized (this) {
                this.field2009 = (this.field2009 + var5) % this.field2006;
            }
        }
    }

    @ObfuscatedName("fu.n(IS)Z")
    public boolean method3218(int arg0) throws IOException {
        if (arg0 == 0) {
            return true;
        } else if (arg0 > 0 && arg0 < this.field2006) {
            synchronized (this) {
                int var3;
                if (this.field2008 <= this.field2009) {
                    var3 = this.field2009 - this.field2008;
                } else {
                    var3 = this.field2009 + (this.field2006 - this.field2008);
                }
                if (var3 >= arg0) {
                    return true;
                } else if (this.field2010 == null) {
                    this.notifyAll();
                    return false;
                } else {
                    throw new IOException(this.field2010.toString());
                }
            }
        } else {
            throw new IOException();
        }
    }

    @ObfuscatedName("fu.h(I)I")
    public int method3221() throws IOException {
        synchronized (this) {
            int var2;
            if (this.field2008 <= this.field2009) {
                var2 = this.field2009 - this.field2008;
            } else {
                var2 = this.field2009 + (this.field2006 - this.field2008);
            }
            if (var2 <= 0 && this.field2010 != null) {
                throw new IOException(this.field2010.toString());
            }
            this.notifyAll();
            return var2;
        }
    }

    @ObfuscatedName("fu.l(B)I")
    public int method3230() throws IOException {
        synchronized (this) {
            if (this.field2009 != this.field2008) {
                int var2 = this.field2004[this.field2008] & 0xFF;
                this.field2008 = (this.field2008 + 1) % this.field2006;
                this.notifyAll();
                return var2;
            } else if (this.field2010 == null) {
                return -1;
            } else {
                throw new IOException(this.field2010.toString());
            }
        }
    }

    @ObfuscatedName("fu.g([BIII)I")
    public int method3225(byte[] arg0, int arg1, int arg2) throws IOException {
        if (arg2 < 0 || arg1 < 0 || arg1 + arg2 > arg0.length) {
            throw new IOException();
        }
        synchronized (this) {
            int var5;
            if (this.field2008 <= this.field2009) {
                var5 = this.field2009 - this.field2008;
            } else {
                var5 = this.field2009 + (this.field2006 - this.field2008);
            }
            if (arg2 > var5) {
                arg2 = var5;
            }
            if (arg2 == 0 && this.field2010 != null) {
                throw new IOException(this.field2010.toString());
            }
            if (this.field2008 + arg2 <= this.field2006) {
                System.arraycopy(this.field2004, this.field2008, arg0, arg1, arg2);
            } else {
                int var6 = this.field2006 - this.field2008;
                System.arraycopy(this.field2004, this.field2008, arg0, arg1, var6);
                System.arraycopy(this.field2004, 0, arg0, arg1 + var6, arg2 - var6);
            }
            this.field2008 = (this.field2008 + arg2) % this.field2006;
            this.notifyAll();
            return arg2;
        }
    }

    @ObfuscatedName("fu.b(I)V")
    public void method3223() {
        synchronized (this) {
            if (this.field2010 == null) {
                this.field2010 = new IOException("");
            }
            this.notifyAll();
        }
        try {
            this.field2015.join();
        } catch (InterruptedException var4) {
        }
    }
}
