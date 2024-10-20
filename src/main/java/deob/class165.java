package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

@ObfuscatedName("fh")
public class class165 implements Runnable {

    @ObfuscatedName("fh.m")
    public Thread field2010;

    @ObfuscatedName("fh.f")
    public InputStream field2009;

    @ObfuscatedName("fh.q")
    public int field2005;

    @ObfuscatedName("fh.w")
    public byte[] field2006;

    @ObfuscatedName("fh.o")
    public int field2007 = 0;

    @ObfuscatedName("fh.u")
    public int field2008 = 0;

    @ObfuscatedName("fh.g")
    public IOException field2003;

    public class165(InputStream arg0, int arg1) {
        this.field2009 = arg0;
        this.field2005 = arg1 + 1;
        this.field2006 = new byte[this.field2005];
        this.field2010 = new Thread(this);
        this.field2010.setDaemon(true);
        this.field2010.start();
    }

    public void run() {
        while (true) {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field2003 != null) {
                        return;
                    }
                    if (this.field2007 == 0) {
                        var2 = this.field2005 - this.field2008 - 1;
                    } else if (this.field2007 <= this.field2008) {
                        var2 = this.field2005 - this.field2008;
                    } else {
                        var2 = this.field2007 - this.field2008 - 1;
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
                var5 = this.field2009.read(this.field2006, this.field2008, var2);
                if (var5 == -1) {
                    throw new EOFException();
                }
            } catch (IOException var14) {
                IOException var6 = var14;
                synchronized (this) {
                    this.field2003 = var6;
                    return;
                }
            }
            synchronized (this) {
                this.field2008 = (this.field2008 + var5) % this.field2005;
            }
        }
    }

    @ObfuscatedName("fh.m(II)Z")
    public boolean method3117(int arg0) throws IOException {
        if (arg0 == 0) {
            return true;
        } else if (arg0 > 0 && arg0 < this.field2005) {
            synchronized (this) {
                int var3;
                if (this.field2007 <= this.field2008) {
                    var3 = this.field2008 - this.field2007;
                } else {
                    var3 = this.field2008 + (this.field2005 - this.field2007);
                }
                if (var3 >= arg0) {
                    return true;
                } else if (this.field2003 == null) {
                    this.notifyAll();
                    return false;
                } else {
                    throw new IOException(this.field2003.toString());
                }
            }
        } else {
            throw new IOException();
        }
    }

    @ObfuscatedName("fh.f(I)I")
    public int method3122() throws IOException {
        synchronized (this) {
            int var2;
            if (this.field2007 <= this.field2008) {
                var2 = this.field2008 - this.field2007;
            } else {
                var2 = this.field2008 + (this.field2005 - this.field2007);
            }
            if (var2 <= 0 && this.field2003 != null) {
                throw new IOException(this.field2003.toString());
            }
            this.notifyAll();
            return var2;
        }
    }

    @ObfuscatedName("fh.q(I)I")
    public int method3119() throws IOException {
        synchronized (this) {
            if (this.field2008 != this.field2007) {
                int var2 = this.field2006[this.field2007] & 0xFF;
                this.field2007 = (this.field2007 + 1) % this.field2005;
                this.notifyAll();
                return var2;
            } else if (this.field2003 == null) {
                return -1;
            } else {
                throw new IOException(this.field2003.toString());
            }
        }
    }

    @ObfuscatedName("fh.w([BIIB)I")
    public int method3127(byte[] arg0, int arg1, int arg2) throws IOException {
        if (arg2 < 0 || arg1 < 0 || arg1 + arg2 > arg0.length) {
            throw new IOException();
        }
        synchronized (this) {
            int var5;
            if (this.field2007 <= this.field2008) {
                var5 = this.field2008 - this.field2007;
            } else {
                var5 = this.field2008 + (this.field2005 - this.field2007);
            }
            if (arg2 > var5) {
                arg2 = var5;
            }
            if (arg2 == 0 && this.field2003 != null) {
                throw new IOException(this.field2003.toString());
            }
            if (this.field2007 + arg2 <= this.field2005) {
                System.arraycopy(this.field2006, this.field2007, arg0, arg1, arg2);
            } else {
                int var6 = this.field2005 - this.field2007;
                System.arraycopy(this.field2006, this.field2007, arg0, arg1, var6);
                System.arraycopy(this.field2006, 0, arg0, arg1 + var6, arg2 - var6);
            }
            this.field2007 = (this.field2007 + arg2) % this.field2005;
            this.notifyAll();
            return arg2;
        }
    }

    @ObfuscatedName("fh.o(I)V")
    public void method3121() {
        synchronized (this) {
            if (this.field2003 == null) {
                this.field2003 = new IOException("");
            }
            this.notifyAll();
        }
        try {
            this.field2010.join();
        } catch (InterruptedException var4) {
        }
    }
}
