package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

@ObfuscatedName("px")
public class class412 implements Runnable {

    @ObfuscatedName("px.aj")
    public Thread field4550;

    @ObfuscatedName("px.al")
    public InputStream field4548;

    @ObfuscatedName("px.ac")
    public int field4549;

    @ObfuscatedName("px.ab")
    public byte[] field4551;

    @ObfuscatedName("px.an")
    public int field4547 = 0;

    @ObfuscatedName("px.ao")
    public int field4552 = 0;

    @ObfuscatedName("px.av")
    public IOException field4553;

    public class412(InputStream arg0, int arg1) {
        this.field4548 = arg0;
        this.field4549 = arg1 + 1;
        this.field4551 = new byte[this.field4549];
        this.field4550 = new Thread(this);
        this.field4550.setDaemon(true);
        this.field4550.start();
    }

    public void run() {
        while (true) {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field4553 != null) {
                        return;
                    }
                    if (this.field4547 == 0) {
                        var2 = this.field4549 - this.field4552 - 1;
                    } else if (this.field4547 <= this.field4552) {
                        var2 = this.field4549 - this.field4552;
                    } else {
                        var2 = this.field4547 - this.field4552 - 1;
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
                var5 = this.field4548.read(this.field4551, this.field4552, var2);
                if (var5 == -1) {
                    throw new EOFException();
                }
            } catch (IOException var14) {
                IOException var6 = var14;
                synchronized (this) {
                    this.field4553 = var6;
                    return;
                }
            }
            synchronized (this) {
                this.field4552 = (this.field4552 + var5) % this.field4549;
            }
        }
    }

    @ObfuscatedName("px.aj(IB)Z")
    public boolean method7062(int arg0) throws IOException {
        if (arg0 == 0) {
            return true;
        } else if (arg0 > 0 && arg0 < this.field4549) {
            synchronized (this) {
                int var3;
                if (this.field4547 <= this.field4552) {
                    var3 = this.field4552 - this.field4547;
                } else {
                    var3 = this.field4552 + (this.field4549 - this.field4547);
                }
                if (var3 >= arg0) {
                    return true;
                } else if (this.field4553 == null) {
                    this.notifyAll();
                    return false;
                } else {
                    throw new IOException(this.field4553.toString());
                }
            }
        } else {
            throw new IOException();
        }
    }

    @ObfuscatedName("px.al(I)I")
    public int method7061() throws IOException {
        synchronized (this) {
            int var2;
            if (this.field4547 <= this.field4552) {
                var2 = this.field4552 - this.field4547;
            } else {
                var2 = this.field4552 + (this.field4549 - this.field4547);
            }
            if (var2 <= 0 && this.field4553 != null) {
                throw new IOException(this.field4553.toString());
            }
            this.notifyAll();
            return var2;
        }
    }

    @ObfuscatedName("px.ac(I)I")
    public int method7063() throws IOException {
        synchronized (this) {
            if (this.field4552 != this.field4547) {
                int var2 = this.field4551[this.field4547] & 0xFF;
                this.field4547 = (this.field4547 + 1) % this.field4549;
                this.notifyAll();
                return var2;
            } else if (this.field4553 == null) {
                return -1;
            } else {
                throw new IOException(this.field4553.toString());
            }
        }
    }

    @ObfuscatedName("px.ab([BIII)I")
    public int method7064(byte[] arg0, int arg1, int arg2) throws IOException {
        if (arg2 < 0 || arg1 < 0 || arg1 + arg2 > arg0.length) {
            throw new IOException();
        }
        synchronized (this) {
            int var5;
            if (this.field4547 <= this.field4552) {
                var5 = this.field4552 - this.field4547;
            } else {
                var5 = this.field4552 + (this.field4549 - this.field4547);
            }
            if (arg2 > var5) {
                arg2 = var5;
            }
            if (arg2 == 0 && this.field4553 != null) {
                throw new IOException(this.field4553.toString());
            }
            if (this.field4547 + arg2 <= this.field4549) {
                System.arraycopy(this.field4551, this.field4547, arg0, arg1, arg2);
            } else {
                int var6 = this.field4549 - this.field4547;
                System.arraycopy(this.field4551, this.field4547, arg0, arg1, var6);
                System.arraycopy(this.field4551, 0, arg0, arg1 + var6, arg2 - var6);
            }
            this.field4547 = (this.field4547 + arg2) % this.field4549;
            this.notifyAll();
            return arg2;
        }
    }

    @ObfuscatedName("px.an(I)V")
    public void method7065() {
        synchronized (this) {
            if (this.field4553 == null) {
                this.field4553 = new IOException("");
            }
            this.notifyAll();
        }
        try {
            this.field4550.join();
        } catch (InterruptedException var4) {
        }
    }
}
