package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

@ObfuscatedName("sz")
public class class481 implements Runnable {

    @ObfuscatedName("sz.aq")
    public Thread field4993;

    @ObfuscatedName("sz.ad")
    public InputStream field4991;

    @ObfuscatedName("sz.ag")
    public int field4997;

    @ObfuscatedName("sz.ak")
    public byte[] field4992;

    @ObfuscatedName("sz.ap")
    public int field4994 = 0;

    @ObfuscatedName("sz.an")
    public int field4995 = 0;

    @ObfuscatedName("sz.aj")
    public IOException field4996;

    public class481(InputStream arg0, int arg1) {
        this.field4991 = arg0;
        this.field4997 = arg1 + 1;
        this.field4992 = new byte[this.field4997];
        this.field4993 = new Thread(this);
        this.field4993.setDaemon(true);
        this.field4993.start();
    }

    public void run() {
        while (true) {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field4996 != null) {
                        return;
                    }
                    if (this.field4994 == 0) {
                        var2 = this.field4997 - this.field4995 - 1;
                    } else if (this.field4994 <= this.field4995) {
                        var2 = this.field4997 - this.field4995;
                    } else {
                        var2 = this.field4994 - this.field4995 - 1;
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
                var5 = this.field4991.read(this.field4992, this.field4995, var2);
                if (var5 == -1) {
                    throw new EOFException();
                }
            } catch (IOException var14) {
                IOException var6 = var14;
                synchronized (this) {
                    this.field4996 = var6;
                    return;
                }
            }
            synchronized (this) {
                this.field4995 = (this.field4995 + var5) % this.field4997;
            }
        }
    }

    @ObfuscatedName("sz.aq(II)Z")
    public boolean method7983(int arg0) throws IOException {
        if (arg0 == 0) {
            return true;
        } else if (arg0 > 0 && arg0 < this.field4997) {
            synchronized (this) {
                int var3;
                if (this.field4994 <= this.field4995) {
                    var3 = this.field4995 - this.field4994;
                } else {
                    var3 = this.field4995 + (this.field4997 - this.field4994);
                }
                if (var3 >= arg0) {
                    return true;
                } else if (this.field4996 == null) {
                    this.notifyAll();
                    return false;
                } else {
                    throw new IOException(this.field4996.toString());
                }
            }
        } else {
            throw new IOException();
        }
    }

    @ObfuscatedName("sz.ad(B)I")
    public int method7984() throws IOException {
        synchronized (this) {
            int var2;
            if (this.field4994 <= this.field4995) {
                var2 = this.field4995 - this.field4994;
            } else {
                var2 = this.field4995 + (this.field4997 - this.field4994);
            }
            if (var2 <= 0 && this.field4996 != null) {
                throw new IOException(this.field4996.toString());
            }
            this.notifyAll();
            return var2;
        }
    }

    @ObfuscatedName("sz.ag(I)I")
    public int method8000() throws IOException {
        synchronized (this) {
            if (this.field4995 != this.field4994) {
                int var2 = this.field4992[this.field4994] & 0xFF;
                this.field4994 = (this.field4994 + 1) % this.field4997;
                this.notifyAll();
                return var2;
            } else if (this.field4996 == null) {
                return -1;
            } else {
                throw new IOException(this.field4996.toString());
            }
        }
    }

    @ObfuscatedName("sz.ak([BIII)I")
    public int method8003(byte[] arg0, int arg1, int arg2) throws IOException {
        if (arg2 < 0 || arg1 < 0 || arg1 + arg2 > arg0.length) {
            throw new IOException();
        }
        synchronized (this) {
            int var5;
            if (this.field4994 <= this.field4995) {
                var5 = this.field4995 - this.field4994;
            } else {
                var5 = this.field4995 + (this.field4997 - this.field4994);
            }
            if (arg2 > var5) {
                arg2 = var5;
            }
            if (arg2 == 0 && this.field4996 != null) {
                throw new IOException(this.field4996.toString());
            }
            if (this.field4994 + arg2 <= this.field4997) {
                System.arraycopy(this.field4992, this.field4994, arg0, arg1, arg2);
            } else {
                int var6 = this.field4997 - this.field4994;
                System.arraycopy(this.field4992, this.field4994, arg0, arg1, var6);
                System.arraycopy(this.field4992, 0, arg0, arg1 + var6, arg2 - var6);
            }
            this.field4994 = (this.field4994 + arg2) % this.field4997;
            this.notifyAll();
            return arg2;
        }
    }

    @ObfuscatedName("sz.ap(I)V")
    public void method8004() {
        synchronized (this) {
            if (this.field4996 == null) {
                this.field4996 = new IOException("");
            }
            this.notifyAll();
        }
        try {
            this.field4993.join();
        } catch (InterruptedException var4) {
        }
    }
}
