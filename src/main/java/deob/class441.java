package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

@ObfuscatedName("qa")
public class class441 implements Runnable {

    @ObfuscatedName("qa.au")
    public Thread field4682;

    @ObfuscatedName("qa.ae")
    public InputStream field4688;

    @ObfuscatedName("qa.ao")
    public int field4684;

    @ObfuscatedName("qa.at")
    public byte[] field4685;

    @ObfuscatedName("qa.ac")
    public int field4686 = 0;

    @ObfuscatedName("qa.ai")
    public int field4683 = 0;

    @ObfuscatedName("qa.az")
    public IOException field4687;

    public class441(InputStream arg0, int arg1) {
        this.field4688 = arg0;
        this.field4684 = arg1 + 1;
        this.field4685 = new byte[this.field4684];
        this.field4682 = new Thread(this);
        this.field4682.setDaemon(true);
        this.field4682.start();
    }

    public void run() {
        while (true) {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field4687 != null) {
                        return;
                    }
                    if (this.field4686 == 0) {
                        var2 = this.field4684 - this.field4683 - 1;
                    } else if (this.field4686 <= this.field4683) {
                        var2 = this.field4684 - this.field4683;
                    } else {
                        var2 = this.field4686 - this.field4683 - 1;
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
                var5 = this.field4688.read(this.field4685, this.field4683, var2);
                if (var5 == -1) {
                    throw new EOFException();
                }
            } catch (IOException var14) {
                IOException var6 = var14;
                synchronized (this) {
                    this.field4687 = var6;
                    return;
                }
            }
            synchronized (this) {
                this.field4683 = (this.field4683 + var5) % this.field4684;
            }
        }
    }

    @ObfuscatedName("qa.au(IB)Z")
    public boolean method7395(int arg0) throws IOException {
        if (arg0 == 0) {
            return true;
        } else if (arg0 > 0 && arg0 < this.field4684) {
            synchronized (this) {
                int var3;
                if (this.field4686 <= this.field4683) {
                    var3 = this.field4683 - this.field4686;
                } else {
                    var3 = this.field4683 + (this.field4684 - this.field4686);
                }
                if (var3 >= arg0) {
                    return true;
                } else if (this.field4687 == null) {
                    this.notifyAll();
                    return false;
                } else {
                    throw new IOException(this.field4687.toString());
                }
            }
        } else {
            throw new IOException();
        }
    }

    @ObfuscatedName("qa.ae(I)I")
    public int method7413() throws IOException {
        synchronized (this) {
            int var2;
            if (this.field4686 <= this.field4683) {
                var2 = this.field4683 - this.field4686;
            } else {
                var2 = this.field4683 + (this.field4684 - this.field4686);
            }
            if (var2 <= 0 && this.field4687 != null) {
                throw new IOException(this.field4687.toString());
            }
            this.notifyAll();
            return var2;
        }
    }

    @ObfuscatedName("qa.ao(B)I")
    public int method7397() throws IOException {
        synchronized (this) {
            if (this.field4686 != this.field4683) {
                int var2 = this.field4685[this.field4686] & 0xFF;
                this.field4686 = (this.field4686 + 1) % this.field4684;
                this.notifyAll();
                return var2;
            } else if (this.field4687 == null) {
                return -1;
            } else {
                throw new IOException(this.field4687.toString());
            }
        }
    }

    @ObfuscatedName("qa.at([BIII)I")
    public int method7398(byte[] arg0, int arg1, int arg2) throws IOException {
        if (arg2 < 0 || arg1 < 0 || arg1 + arg2 > arg0.length) {
            throw new IOException();
        }
        synchronized (this) {
            int var5;
            if (this.field4686 <= this.field4683) {
                var5 = this.field4683 - this.field4686;
            } else {
                var5 = this.field4683 + (this.field4684 - this.field4686);
            }
            if (arg2 > var5) {
                arg2 = var5;
            }
            if (arg2 == 0 && this.field4687 != null) {
                throw new IOException(this.field4687.toString());
            }
            if (this.field4686 + arg2 <= this.field4684) {
                System.arraycopy(this.field4685, this.field4686, arg0, arg1, arg2);
            } else {
                int var6 = this.field4684 - this.field4686;
                System.arraycopy(this.field4685, this.field4686, arg0, arg1, var6);
                System.arraycopy(this.field4685, 0, arg0, arg1 + var6, arg2 - var6);
            }
            this.field4686 = (this.field4686 + arg2) % this.field4684;
            this.notifyAll();
            return arg2;
        }
    }

    @ObfuscatedName("qa.ac(S)V")
    public void method7399() {
        synchronized (this) {
            if (this.field4687 == null) {
                this.field4687 = new IOException("");
            }
            this.notifyAll();
        }
        try {
            this.field4682.join();
        } catch (InterruptedException var4) {
        }
    }
}
