package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

@ObfuscatedName("sm")
public class class489 implements Runnable {

    @ObfuscatedName("sm.ap")
    public Thread field5067;

    @ObfuscatedName("sm.aw")
    public InputStream field5063;

    @ObfuscatedName("sm.ak")
    public int field5064;

    @ObfuscatedName("sm.aj")
    public byte[] field5065;

    @ObfuscatedName("sm.ai")
    public int field5066 = 0;

    @ObfuscatedName("sm.ay")
    public int field5062 = 0;

    @ObfuscatedName("sm.as")
    public IOException field5068;

    public class489(InputStream arg0, int arg1) {
        this.field5063 = arg0;
        this.field5064 = arg1 + 1;
        this.field5065 = new byte[this.field5064];
        this.field5067 = new Thread(this);
        this.field5067.setDaemon(true);
        this.field5067.start();
    }

    public void run() {
        while (true) {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field5068 != null) {
                        return;
                    }
                    if (this.field5066 == 0) {
                        var2 = this.field5064 - this.field5062 - 1;
                    } else if (this.field5066 <= this.field5062) {
                        var2 = this.field5064 - this.field5062;
                    } else {
                        var2 = this.field5066 - this.field5062 - 1;
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
                var5 = this.field5063.read(this.field5065, this.field5062, var2);
                if (var5 == -1) {
                    throw new EOFException();
                }
            } catch (IOException var14) {
                IOException var6 = var14;
                synchronized (this) {
                    this.field5068 = var6;
                    return;
                }
            }
            synchronized (this) {
                this.field5062 = (this.field5062 + var5) % this.field5064;
            }
        }
    }

    @ObfuscatedName("sm.ap(II)Z")
    public boolean method8519(int arg0) throws IOException {
        if (arg0 == 0) {
            return true;
        } else if (arg0 > 0 && arg0 < this.field5064) {
            synchronized (this) {
                int var3;
                if (this.field5066 <= this.field5062) {
                    var3 = this.field5062 - this.field5066;
                } else {
                    var3 = this.field5062 + (this.field5064 - this.field5066);
                }
                if (var3 >= arg0) {
                    return true;
                } else if (this.field5068 == null) {
                    this.notifyAll();
                    return false;
                } else {
                    throw new IOException(this.field5068.toString());
                }
            }
        } else {
            throw new IOException();
        }
    }

    @ObfuscatedName("sm.aw(I)I")
    public int method8520() throws IOException {
        synchronized (this) {
            int var2;
            if (this.field5066 <= this.field5062) {
                var2 = this.field5062 - this.field5066;
            } else {
                var2 = this.field5062 + (this.field5064 - this.field5066);
            }
            if (var2 <= 0 && this.field5068 != null) {
                throw new IOException(this.field5068.toString());
            }
            this.notifyAll();
            return var2;
        }
    }

    @ObfuscatedName("sm.ak(I)I")
    public int method8521() throws IOException {
        synchronized (this) {
            if (this.field5066 != this.field5062) {
                int var2 = this.field5065[this.field5066] & 0xFF;
                this.field5066 = (this.field5066 + 1) % this.field5064;
                this.notifyAll();
                return var2;
            } else if (this.field5068 == null) {
                return -1;
            } else {
                throw new IOException(this.field5068.toString());
            }
        }
    }

    @ObfuscatedName("sm.aj([BIII)I")
    public int method8522(byte[] arg0, int arg1, int arg2) throws IOException {
        if (arg2 < 0 || arg1 < 0 || arg1 + arg2 > arg0.length) {
            throw new IOException();
        }
        synchronized (this) {
            int var5;
            if (this.field5066 <= this.field5062) {
                var5 = this.field5062 - this.field5066;
            } else {
                var5 = this.field5062 + (this.field5064 - this.field5066);
            }
            if (arg2 > var5) {
                arg2 = var5;
            }
            if (arg2 == 0 && this.field5068 != null) {
                throw new IOException(this.field5068.toString());
            }
            if (this.field5066 + arg2 <= this.field5064) {
                System.arraycopy(this.field5065, this.field5066, arg0, arg1, arg2);
            } else {
                int var6 = this.field5064 - this.field5066;
                System.arraycopy(this.field5065, this.field5066, arg0, arg1, var6);
                System.arraycopy(this.field5065, 0, arg0, arg1 + var6, arg2 - var6);
            }
            this.field5066 = (this.field5066 + arg2) % this.field5064;
            this.notifyAll();
            return arg2;
        }
    }

    @ObfuscatedName("sm.ai(B)V")
    public void method8523() {
        synchronized (this) {
            if (this.field5068 == null) {
                this.field5068 = new IOException("");
            }
            this.notifyAll();
        }
        try {
            this.field5067.join();
        } catch (InterruptedException var4) {
        }
    }
}
