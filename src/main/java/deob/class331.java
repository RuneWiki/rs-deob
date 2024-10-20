package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

@ObfuscatedName("lw")
public class class331 implements Runnable {

    @ObfuscatedName("lw.v")
    public Thread field3867;

    @ObfuscatedName("lw.n")
    public InputStream field3866;

    @ObfuscatedName("lw.f")
    public int field3868;

    @ObfuscatedName("lw.y")
    public byte[] field3872;

    @ObfuscatedName("lw.p")
    public int field3870 = 0;

    @ObfuscatedName("lw.j")
    public int field3871 = 0;

    @ObfuscatedName("lw.r")
    public IOException field3869;

    public class331(InputStream arg0, int arg1) {
        this.field3866 = arg0;
        this.field3868 = arg1 + 1;
        this.field3872 = new byte[this.field3868];
        this.field3867 = new Thread(this);
        this.field3867.setDaemon(true);
        this.field3867.start();
    }

    public void run() {
        while (true) {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field3869 != null) {
                        return;
                    }
                    if (this.field3870 == 0) {
                        var2 = this.field3868 - this.field3871 - 1;
                    } else if (this.field3870 <= this.field3871) {
                        var2 = this.field3868 - this.field3871;
                    } else {
                        var2 = this.field3870 - this.field3871 - 1;
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
                var5 = this.field3866.read(this.field3872, this.field3871, var2);
                if (var5 == -1) {
                    throw new EOFException();
                }
            } catch (IOException var14) {
                IOException var6 = var14;
                synchronized (this) {
                    this.field3869 = var6;
                    return;
                }
            }
            synchronized (this) {
                this.field3871 = (this.field3871 + var5) % this.field3868;
            }
        }
    }

    @ObfuscatedName("lw.v(IB)Z")
    public boolean method5371(int arg0) throws IOException {
        if (arg0 == 0) {
            return true;
        } else if (arg0 > 0 && arg0 < this.field3868) {
            synchronized (this) {
                int var3;
                if (this.field3870 <= this.field3871) {
                    var3 = this.field3871 - this.field3870;
                } else {
                    var3 = this.field3871 + (this.field3868 - this.field3870);
                }
                if (var3 >= arg0) {
                    return true;
                } else if (this.field3869 == null) {
                    this.notifyAll();
                    return false;
                } else {
                    throw new IOException(this.field3869.toString());
                }
            }
        } else {
            throw new IOException();
        }
    }

    @ObfuscatedName("lw.n(I)I")
    public int method5372() throws IOException {
        synchronized (this) {
            int var2;
            if (this.field3870 <= this.field3871) {
                var2 = this.field3871 - this.field3870;
            } else {
                var2 = this.field3871 + (this.field3868 - this.field3870);
            }
            if (var2 <= 0 && this.field3869 != null) {
                throw new IOException(this.field3869.toString());
            }
            this.notifyAll();
            return var2;
        }
    }

    @ObfuscatedName("lw.f(I)I")
    public int method5375() throws IOException {
        synchronized (this) {
            if (this.field3871 != this.field3870) {
                int var2 = this.field3872[this.field3870] & 0xFF;
                this.field3870 = (this.field3870 + 1) % this.field3868;
                this.notifyAll();
                return var2;
            } else if (this.field3869 == null) {
                return -1;
            } else {
                throw new IOException(this.field3869.toString());
            }
        }
    }

    @ObfuscatedName("lw.y([BIII)I")
    public int method5373(byte[] arg0, int arg1, int arg2) throws IOException {
        if (arg2 < 0 || arg1 < 0 || arg1 + arg2 > arg0.length) {
            throw new IOException();
        }
        synchronized (this) {
            int var5;
            if (this.field3870 <= this.field3871) {
                var5 = this.field3871 - this.field3870;
            } else {
                var5 = this.field3871 + (this.field3868 - this.field3870);
            }
            if (arg2 > var5) {
                arg2 = var5;
            }
            if (arg2 == 0 && this.field3869 != null) {
                throw new IOException(this.field3869.toString());
            }
            if (this.field3870 + arg2 <= this.field3868) {
                System.arraycopy(this.field3872, this.field3870, arg0, arg1, arg2);
            } else {
                int var6 = this.field3868 - this.field3870;
                System.arraycopy(this.field3872, this.field3870, arg0, arg1, var6);
                System.arraycopy(this.field3872, 0, arg0, arg1 + var6, arg2 - var6);
            }
            this.field3870 = (this.field3870 + arg2) % this.field3868;
            this.notifyAll();
            return arg2;
        }
    }

    @ObfuscatedName("lw.p(I)V")
    public void method5369() {
        synchronized (this) {
            if (this.field3869 == null) {
                this.field3869 = new IOException("");
            }
            this.notifyAll();
        }
        try {
            this.field3867.join();
        } catch (InterruptedException var4) {
        }
    }
}
