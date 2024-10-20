package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

@ObfuscatedName("se")
public class class480 implements Runnable {

    @ObfuscatedName("se.ak")
    public Thread field4965;

    @ObfuscatedName("se.al")
    public InputStream field4964;

    @ObfuscatedName("se.aj")
    public int field4963;

    @ObfuscatedName("se.az")
    public byte[] field4966;

    @ObfuscatedName("se.af")
    public int field4967 = 0;

    @ObfuscatedName("se.aa")
    public int field4968 = 0;

    @ObfuscatedName("se.at")
    public IOException field4969;

    public class480(InputStream arg0, int arg1) {
        this.field4964 = arg0;
        this.field4963 = arg1 + 1;
        this.field4966 = new byte[this.field4963];
        this.field4965 = new Thread(this);
        this.field4965.setDaemon(true);
        this.field4965.start();
    }

    public void run() {
        while (true) {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field4969 != null) {
                        return;
                    }
                    if (this.field4967 == 0) {
                        var2 = this.field4963 - this.field4968 - 1;
                    } else if (this.field4967 <= this.field4968) {
                        var2 = this.field4963 - this.field4968;
                    } else {
                        var2 = this.field4967 - this.field4968 - 1;
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
                var5 = this.field4964.read(this.field4966, this.field4968, var2);
                if (var5 == -1) {
                    throw new EOFException();
                }
            } catch (IOException var14) {
                IOException var6 = var14;
                synchronized (this) {
                    this.field4969 = var6;
                    return;
                }
            }
            synchronized (this) {
                this.field4968 = (this.field4968 + var5) % this.field4963;
            }
        }
    }

    @ObfuscatedName("se.ak(II)Z")
    public boolean method8059(int arg0) throws IOException {
        if (arg0 == 0) {
            return true;
        } else if (arg0 > 0 && arg0 < this.field4963) {
            synchronized (this) {
                int var3;
                if (this.field4967 <= this.field4968) {
                    var3 = this.field4968 - this.field4967;
                } else {
                    var3 = this.field4968 + (this.field4963 - this.field4967);
                }
                if (var3 >= arg0) {
                    return true;
                } else if (this.field4969 == null) {
                    this.notifyAll();
                    return false;
                } else {
                    throw new IOException(this.field4969.toString());
                }
            }
        } else {
            throw new IOException();
        }
    }

    @ObfuscatedName("se.al(I)I")
    public int method8046() throws IOException {
        synchronized (this) {
            int var2;
            if (this.field4967 <= this.field4968) {
                var2 = this.field4968 - this.field4967;
            } else {
                var2 = this.field4968 + (this.field4963 - this.field4967);
            }
            if (var2 <= 0 && this.field4969 != null) {
                throw new IOException(this.field4969.toString());
            }
            this.notifyAll();
            return var2;
        }
    }

    @ObfuscatedName("se.aj(I)I")
    public int method8045() throws IOException {
        synchronized (this) {
            if (this.field4968 != this.field4967) {
                int var2 = this.field4966[this.field4967] & 0xFF;
                this.field4967 = (this.field4967 + 1) % this.field4963;
                this.notifyAll();
                return var2;
            } else if (this.field4969 == null) {
                return -1;
            } else {
                throw new IOException(this.field4969.toString());
            }
        }
    }

    @ObfuscatedName("se.az([BIII)I")
    public int method8048(byte[] arg0, int arg1, int arg2) throws IOException {
        if (arg2 < 0 || arg1 < 0 || arg1 + arg2 > arg0.length) {
            throw new IOException();
        }
        synchronized (this) {
            int var5;
            if (this.field4967 <= this.field4968) {
                var5 = this.field4968 - this.field4967;
            } else {
                var5 = this.field4968 + (this.field4963 - this.field4967);
            }
            if (arg2 > var5) {
                arg2 = var5;
            }
            if (arg2 == 0 && this.field4969 != null) {
                throw new IOException(this.field4969.toString());
            }
            if (this.field4967 + arg2 <= this.field4963) {
                System.arraycopy(this.field4966, this.field4967, arg0, arg1, arg2);
            } else {
                int var6 = this.field4963 - this.field4967;
                System.arraycopy(this.field4966, this.field4967, arg0, arg1, var6);
                System.arraycopy(this.field4966, 0, arg0, arg1 + var6, arg2 - var6);
            }
            this.field4967 = (this.field4967 + arg2) % this.field4963;
            this.notifyAll();
            return arg2;
        }
    }

    @ObfuscatedName("se.af(I)V")
    public void method8049() {
        synchronized (this) {
            if (this.field4969 == null) {
                this.field4969 = new IOException("");
            }
            this.notifyAll();
        }
        try {
            this.field4965.join();
        } catch (InterruptedException var4) {
        }
    }
}
