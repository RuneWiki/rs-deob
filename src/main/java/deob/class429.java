package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

@ObfuscatedName("qa")
public class class429 implements Runnable {

    @ObfuscatedName("qa.at")
    public Thread field4629;

    @ObfuscatedName("qa.an")
    public InputStream field4635;

    @ObfuscatedName("qa.av")
    public int field4631;

    @ObfuscatedName("qa.as")
    public byte[] field4632;

    @ObfuscatedName("qa.ax")
    public int field4633 = 0;

    @ObfuscatedName("qa.ap")
    public int field4634 = 0;

    @ObfuscatedName("qa.ab")
    public IOException field4630;

    public class429(InputStream arg0, int arg1) {
        this.field4635 = arg0;
        this.field4631 = arg1 + 1;
        this.field4632 = new byte[this.field4631];
        this.field4629 = new Thread(this);
        this.field4629.setDaemon(true);
        this.field4629.start();
    }

    public void run() {
        while (true) {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field4630 != null) {
                        return;
                    }
                    if (this.field4633 == 0) {
                        var2 = this.field4631 - this.field4634 - 1;
                    } else if (this.field4633 <= this.field4634) {
                        var2 = this.field4631 - this.field4634;
                    } else {
                        var2 = this.field4633 - this.field4634 - 1;
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
                var5 = this.field4635.read(this.field4632, this.field4634, var2);
                if (var5 == -1) {
                    throw new EOFException();
                }
            } catch (IOException var14) {
                IOException var6 = var14;
                synchronized (this) {
                    this.field4630 = var6;
                    return;
                }
            }
            synchronized (this) {
                this.field4634 = (this.field4634 + var5) % this.field4631;
            }
        }
    }

    @ObfuscatedName("qa.at(IS)Z")
    public boolean method7281(int arg0) throws IOException {
        if (arg0 == 0) {
            return true;
        } else if (arg0 > 0 && arg0 < this.field4631) {
            synchronized (this) {
                int var3;
                if (this.field4633 <= this.field4634) {
                    var3 = this.field4634 - this.field4633;
                } else {
                    var3 = this.field4634 + (this.field4631 - this.field4633);
                }
                if (var3 >= arg0) {
                    return true;
                } else if (this.field4630 == null) {
                    this.notifyAll();
                    return false;
                } else {
                    throw new IOException(this.field4630.toString());
                }
            }
        } else {
            throw new IOException();
        }
    }

    @ObfuscatedName("qa.an(I)I")
    public int method7286() throws IOException {
        synchronized (this) {
            int var2;
            if (this.field4633 <= this.field4634) {
                var2 = this.field4634 - this.field4633;
            } else {
                var2 = this.field4634 + (this.field4631 - this.field4633);
            }
            if (var2 <= 0 && this.field4630 != null) {
                throw new IOException(this.field4630.toString());
            }
            this.notifyAll();
            return var2;
        }
    }

    @ObfuscatedName("qa.av(I)I")
    public int method7283() throws IOException {
        synchronized (this) {
            if (this.field4634 != this.field4633) {
                int var2 = this.field4632[this.field4633] & 0xFF;
                this.field4633 = (this.field4633 + 1) % this.field4631;
                this.notifyAll();
                return var2;
            } else if (this.field4630 == null) {
                return -1;
            } else {
                throw new IOException(this.field4630.toString());
            }
        }
    }

    @ObfuscatedName("qa.as([BIII)I")
    public int method7284(byte[] arg0, int arg1, int arg2) throws IOException {
        if (arg2 < 0 || arg1 < 0 || arg1 + arg2 > arg0.length) {
            throw new IOException();
        }
        synchronized (this) {
            int var5;
            if (this.field4633 <= this.field4634) {
                var5 = this.field4634 - this.field4633;
            } else {
                var5 = this.field4634 + (this.field4631 - this.field4633);
            }
            if (arg2 > var5) {
                arg2 = var5;
            }
            if (arg2 == 0 && this.field4630 != null) {
                throw new IOException(this.field4630.toString());
            }
            if (this.field4633 + arg2 <= this.field4631) {
                System.arraycopy(this.field4632, this.field4633, arg0, arg1, arg2);
            } else {
                int var6 = this.field4631 - this.field4633;
                System.arraycopy(this.field4632, this.field4633, arg0, arg1, var6);
                System.arraycopy(this.field4632, 0, arg0, arg1 + var6, arg2 - var6);
            }
            this.field4633 = (this.field4633 + arg2) % this.field4631;
            this.notifyAll();
            return arg2;
        }
    }

    @ObfuscatedName("qa.ax(I)V")
    public void method7285() {
        synchronized (this) {
            if (this.field4630 == null) {
                this.field4630 = new IOException("");
            }
            this.notifyAll();
        }
        try {
            this.field4629.join();
        } catch (InterruptedException var4) {
        }
    }
}
