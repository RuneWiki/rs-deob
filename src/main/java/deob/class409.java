package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

@ObfuscatedName("ox")
public class class409 implements Runnable {

    @ObfuscatedName("ox.f")
    public Thread field4592;

    @ObfuscatedName("ox.w")
    public InputStream field4587;

    @ObfuscatedName("ox.v")
    public int field4588;

    @ObfuscatedName("ox.s")
    public byte[] field4586;

    @ObfuscatedName("ox.z")
    public int field4590 = 0;

    @ObfuscatedName("ox.j")
    public int field4591 = 0;

    @ObfuscatedName("ox.i")
    public IOException field4595;

    public class409(InputStream arg0, int arg1) {
        this.field4587 = arg0;
        this.field4588 = arg1 + 1;
        this.field4586 = new byte[this.field4588];
        this.field4592 = new Thread(this);
        this.field4592.setDaemon(true);
        this.field4592.start();
    }

    public void run() {
        while (true) {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field4595 != null) {
                        return;
                    }
                    if (this.field4590 == 0) {
                        var2 = this.field4588 - this.field4591 - 1;
                    } else if (this.field4590 <= this.field4591) {
                        var2 = this.field4588 - this.field4591;
                    } else {
                        var2 = this.field4590 - this.field4591 - 1;
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
                var5 = this.field4587.read(this.field4586, this.field4591, var2);
                if (var5 == -1) {
                    throw new EOFException();
                }
            } catch (IOException var14) {
                IOException var6 = var14;
                synchronized (this) {
                    this.field4595 = var6;
                    return;
                }
            }
            synchronized (this) {
                this.field4591 = (this.field4591 + var5) % this.field4588;
            }
        }
    }

    @ObfuscatedName("ox.f(II)Z")
    public boolean method7170(int arg0) throws IOException {
        if (arg0 == 0) {
            return true;
        } else if (arg0 > 0 && arg0 < this.field4588) {
            synchronized (this) {
                int var3;
                if (this.field4590 <= this.field4591) {
                    var3 = this.field4591 - this.field4590;
                } else {
                    var3 = this.field4591 + (this.field4588 - this.field4590);
                }
                if (var3 >= arg0) {
                    return true;
                } else if (this.field4595 == null) {
                    this.notifyAll();
                    return false;
                } else {
                    throw new IOException(this.field4595.toString());
                }
            }
        } else {
            throw new IOException();
        }
    }

    @ObfuscatedName("ox.w(I)I")
    public int method7169() throws IOException {
        synchronized (this) {
            int var2;
            if (this.field4590 <= this.field4591) {
                var2 = this.field4591 - this.field4590;
            } else {
                var2 = this.field4591 + (this.field4588 - this.field4590);
            }
            if (var2 <= 0 && this.field4595 != null) {
                throw new IOException(this.field4595.toString());
            }
            this.notifyAll();
            return var2;
        }
    }

    @ObfuscatedName("ox.v(B)I")
    public int method7172() throws IOException {
        synchronized (this) {
            if (this.field4591 != this.field4590) {
                int var2 = this.field4586[this.field4590] & 0xFF;
                this.field4590 = (this.field4590 + 1) % this.field4588;
                this.notifyAll();
                return var2;
            } else if (this.field4595 == null) {
                return -1;
            } else {
                throw new IOException(this.field4595.toString());
            }
        }
    }

    @ObfuscatedName("ox.s([BIII)I")
    public int method7173(byte[] arg0, int arg1, int arg2) throws IOException {
        if (arg2 < 0 || arg1 < 0 || arg1 + arg2 > arg0.length) {
            throw new IOException();
        }
        synchronized (this) {
            int var5;
            if (this.field4590 <= this.field4591) {
                var5 = this.field4591 - this.field4590;
            } else {
                var5 = this.field4591 + (this.field4588 - this.field4590);
            }
            if (arg2 > var5) {
                arg2 = var5;
            }
            if (arg2 == 0 && this.field4595 != null) {
                throw new IOException(this.field4595.toString());
            }
            if (this.field4590 + arg2 <= this.field4588) {
                System.arraycopy(this.field4586, this.field4590, arg0, arg1, arg2);
            } else {
                int var6 = this.field4588 - this.field4590;
                System.arraycopy(this.field4586, this.field4590, arg0, arg1, var6);
                System.arraycopy(this.field4586, 0, arg0, arg1 + var6, arg2 - var6);
            }
            this.field4590 = (this.field4590 + arg2) % this.field4588;
            this.notifyAll();
            return arg2;
        }
    }

    @ObfuscatedName("ox.z(S)V")
    public void method7174() {
        synchronized (this) {
            if (this.field4595 == null) {
                this.field4595 = new IOException("");
            }
            this.notifyAll();
        }
        try {
            this.field4592.join();
        } catch (InterruptedException var4) {
        }
    }
}
