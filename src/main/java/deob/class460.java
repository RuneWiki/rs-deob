package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

@ObfuscatedName("ro")
public class class460 implements Runnable {

    @ObfuscatedName("ro.aq")
    public Thread field4791;

    @ObfuscatedName("ro.aw")
    public InputStream field4788;

    @ObfuscatedName("ro.al")
    public int field4789;

    @ObfuscatedName("ro.ai")
    public byte[] field4787;

    @ObfuscatedName("ro.ar")
    public int field4790 = 0;

    @ObfuscatedName("ro.as")
    public int field4792 = 0;

    @ObfuscatedName("ro.aa")
    public IOException field4793;

    public class460(InputStream arg0, int arg1) {
        this.field4788 = arg0;
        this.field4789 = arg1 + 1;
        this.field4787 = new byte[this.field4789];
        this.field4791 = new Thread(this);
        this.field4791.setDaemon(true);
        this.field4791.start();
    }

    public void run() {
        while (true) {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field4793 != null) {
                        return;
                    }
                    if (this.field4790 == 0) {
                        var2 = this.field4789 - this.field4792 - 1;
                    } else if (this.field4790 <= this.field4792) {
                        var2 = this.field4789 - this.field4792;
                    } else {
                        var2 = this.field4790 - this.field4792 - 1;
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
                var5 = this.field4788.read(this.field4787, this.field4792, var2);
                if (var5 == -1) {
                    throw new EOFException();
                }
            } catch (IOException var14) {
                IOException var6 = var14;
                synchronized (this) {
                    this.field4793 = var6;
                    return;
                }
            }
            synchronized (this) {
                this.field4792 = (this.field4792 + var5) % this.field4789;
            }
        }
    }

    @ObfuscatedName("ro.aq(II)Z")
    public boolean method7698(int arg0) throws IOException {
        if (arg0 == 0) {
            return true;
        } else if (arg0 > 0 && arg0 < this.field4789) {
            synchronized (this) {
                int var3;
                if (this.field4790 <= this.field4792) {
                    var3 = this.field4792 - this.field4790;
                } else {
                    var3 = this.field4792 + (this.field4789 - this.field4790);
                }
                if (var3 >= arg0) {
                    return true;
                } else if (this.field4793 == null) {
                    this.notifyAll();
                    return false;
                } else {
                    throw new IOException(this.field4793.toString());
                }
            }
        } else {
            throw new IOException();
        }
    }

    @ObfuscatedName("ro.aw(I)I")
    public int method7697() throws IOException {
        synchronized (this) {
            int var2;
            if (this.field4790 <= this.field4792) {
                var2 = this.field4792 - this.field4790;
            } else {
                var2 = this.field4792 + (this.field4789 - this.field4790);
            }
            if (var2 <= 0 && this.field4793 != null) {
                throw new IOException(this.field4793.toString());
            }
            this.notifyAll();
            return var2;
        }
    }

    @ObfuscatedName("ro.al(B)I")
    public int method7705() throws IOException {
        synchronized (this) {
            if (this.field4792 != this.field4790) {
                int var2 = this.field4787[this.field4790] & 0xFF;
                this.field4790 = (this.field4790 + 1) % this.field4789;
                this.notifyAll();
                return var2;
            } else if (this.field4793 == null) {
                return -1;
            } else {
                throw new IOException(this.field4793.toString());
            }
        }
    }

    @ObfuscatedName("ro.ai([BIII)I")
    public int method7699(byte[] arg0, int arg1, int arg2) throws IOException {
        if (arg2 < 0 || arg1 < 0 || arg1 + arg2 > arg0.length) {
            throw new IOException();
        }
        synchronized (this) {
            int var5;
            if (this.field4790 <= this.field4792) {
                var5 = this.field4792 - this.field4790;
            } else {
                var5 = this.field4792 + (this.field4789 - this.field4790);
            }
            if (arg2 > var5) {
                arg2 = var5;
            }
            if (arg2 == 0 && this.field4793 != null) {
                throw new IOException(this.field4793.toString());
            }
            if (this.field4790 + arg2 <= this.field4789) {
                System.arraycopy(this.field4787, this.field4790, arg0, arg1, arg2);
            } else {
                int var6 = this.field4789 - this.field4790;
                System.arraycopy(this.field4787, this.field4790, arg0, arg1, var6);
                System.arraycopy(this.field4787, 0, arg0, arg1 + var6, arg2 - var6);
            }
            this.field4790 = (this.field4790 + arg2) % this.field4789;
            this.notifyAll();
            return arg2;
        }
    }

    @ObfuscatedName("ro.ar(I)V")
    public void method7709() {
        synchronized (this) {
            if (this.field4793 == null) {
                this.field4793 = new IOException("");
            }
            this.notifyAll();
        }
        try {
            this.field4791.join();
        } catch (InterruptedException var4) {
        }
    }
}
