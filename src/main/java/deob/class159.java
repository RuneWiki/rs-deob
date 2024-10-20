package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

@ObfuscatedName("fj")
public class class159 implements Runnable {

    @ObfuscatedName("fj.a")
    public Thread field2018;

    @ObfuscatedName("fj.s")
    public InputStream field2011;

    @ObfuscatedName("fj.g")
    public int field2012;

    @ObfuscatedName("fj.x")
    public byte[] field2013;

    @ObfuscatedName("fj.h")
    public int field2014 = 0;

    @ObfuscatedName("fj.f")
    public int field2015 = 0;

    @ObfuscatedName("fj.p")
    public IOException field2010;

    public class159(InputStream arg0, int arg1) {
        this.field2011 = arg0;
        this.field2012 = arg1 + 1;
        this.field2013 = new byte[this.field2012];
        this.field2018 = new Thread(this);
        this.field2018.setDaemon(true);
        this.field2018.start();
    }

    public void run() {
        while (true) {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field2010 != null) {
                        return;
                    }
                    if (this.field2014 == 0) {
                        var2 = this.field2012 - this.field2015 - 1;
                    } else if (this.field2014 <= this.field2015) {
                        var2 = this.field2012 - this.field2015;
                    } else {
                        var2 = this.field2014 - this.field2015 - 1;
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
                var5 = this.field2011.read(this.field2013, this.field2015, var2);
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
                this.field2015 = (this.field2015 + var5) % this.field2012;
            }
        }
    }

    @ObfuscatedName("fj.a(II)Z")
    public boolean method3191(int arg0) throws IOException {
        if (arg0 == 0) {
            return true;
        } else if (arg0 > 0 && arg0 < this.field2012) {
            synchronized (this) {
                int var3;
                if (this.field2014 <= this.field2015) {
                    var3 = this.field2015 - this.field2014;
                } else {
                    var3 = this.field2015 + (this.field2012 - this.field2014);
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

    @ObfuscatedName("fj.s(B)I")
    public int method3190() throws IOException {
        synchronized (this) {
            int var2;
            if (this.field2014 <= this.field2015) {
                var2 = this.field2015 - this.field2014;
            } else {
                var2 = this.field2015 + (this.field2012 - this.field2014);
            }
            if (var2 <= 0 && this.field2010 != null) {
                throw new IOException(this.field2010.toString());
            }
            this.notifyAll();
            return var2;
        }
    }

    @ObfuscatedName("fj.g(B)I")
    public int method3192() throws IOException {
        synchronized (this) {
            if (this.field2015 != this.field2014) {
                int var2 = this.field2013[this.field2014] & 0xFF;
                this.field2014 = (this.field2014 + 1) % this.field2012;
                this.notifyAll();
                return var2;
            } else if (this.field2010 == null) {
                return -1;
            } else {
                throw new IOException(this.field2010.toString());
            }
        }
    }

    @ObfuscatedName("fj.x([BIII)I")
    public int method3201(byte[] arg0, int arg1, int arg2) throws IOException {
        if (arg2 < 0 || arg1 < 0 || arg1 + arg2 > arg0.length) {
            throw new IOException();
        }
        synchronized (this) {
            int var5;
            if (this.field2014 <= this.field2015) {
                var5 = this.field2015 - this.field2014;
            } else {
                var5 = this.field2015 + (this.field2012 - this.field2014);
            }
            if (arg2 > var5) {
                arg2 = var5;
            }
            if (arg2 == 0 && this.field2010 != null) {
                throw new IOException(this.field2010.toString());
            }
            if (this.field2014 + arg2 <= this.field2012) {
                System.arraycopy(this.field2013, this.field2014, arg0, arg1, arg2);
            } else {
                int var6 = this.field2012 - this.field2014;
                System.arraycopy(this.field2013, this.field2014, arg0, arg1, var6);
                System.arraycopy(this.field2013, 0, arg0, arg1 + var6, arg2 - var6);
            }
            this.field2014 = (this.field2014 + arg2) % this.field2012;
            this.notifyAll();
            return arg2;
        }
    }

    @ObfuscatedName("fj.h(B)V")
    public void method3194() {
        synchronized (this) {
            if (this.field2010 == null) {
                this.field2010 = new IOException("");
            }
            this.notifyAll();
        }
        try {
            this.field2018.join();
        } catch (InterruptedException var4) {
        }
    }
}
