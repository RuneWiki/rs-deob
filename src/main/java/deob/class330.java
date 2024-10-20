package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

@ObfuscatedName("lm")
public class class330 implements Runnable {

    @ObfuscatedName("lm.f")
    public Thread field3867;

    @ObfuscatedName("lm.o")
    public InputStream field3868;

    @ObfuscatedName("lm.u")
    public int field3869;

    @ObfuscatedName("lm.p")
    public byte[] field3870;

    @ObfuscatedName("lm.b")
    public int field3872 = 0;

    @ObfuscatedName("lm.e")
    public int field3874 = 0;

    @ObfuscatedName("lm.k")
    public IOException field3873;

    public class330(InputStream arg0, int arg1) {
        this.field3868 = arg0;
        this.field3869 = arg1 + 1;
        this.field3870 = new byte[this.field3869];
        this.field3867 = new Thread(this);
        this.field3867.setDaemon(true);
        this.field3867.start();
    }

    public void run() {
        while (true) {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field3873 != null) {
                        return;
                    }
                    if (this.field3872 == 0) {
                        var2 = this.field3869 - this.field3874 - 1;
                    } else if (this.field3872 <= this.field3874) {
                        var2 = this.field3869 - this.field3874;
                    } else {
                        var2 = this.field3872 - this.field3874 - 1;
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
                var5 = this.field3868.read(this.field3870, this.field3874, var2);
                if (var5 == -1) {
                    throw new EOFException();
                }
            } catch (IOException var14) {
                IOException var6 = var14;
                synchronized (this) {
                    this.field3873 = var6;
                    return;
                }
            }
            synchronized (this) {
                this.field3874 = (this.field3874 + var5) % this.field3869;
            }
        }
    }

    @ObfuscatedName("lm.f(IB)Z")
    public boolean method5230(int arg0) throws IOException {
        if (arg0 == 0) {
            return true;
        } else if (arg0 > 0 && arg0 < this.field3869) {
            synchronized (this) {
                int var3;
                if (this.field3872 <= this.field3874) {
                    var3 = this.field3874 - this.field3872;
                } else {
                    var3 = this.field3874 + (this.field3869 - this.field3872);
                }
                if (var3 >= arg0) {
                    return true;
                } else if (this.field3873 == null) {
                    this.notifyAll();
                    return false;
                } else {
                    throw new IOException(this.field3873.toString());
                }
            }
        } else {
            throw new IOException();
        }
    }

    @ObfuscatedName("lm.o(B)I")
    public int method5231() throws IOException {
        synchronized (this) {
            int var2;
            if (this.field3872 <= this.field3874) {
                var2 = this.field3874 - this.field3872;
            } else {
                var2 = this.field3874 + (this.field3869 - this.field3872);
            }
            if (var2 <= 0 && this.field3873 != null) {
                throw new IOException(this.field3873.toString());
            }
            this.notifyAll();
            return var2;
        }
    }

    @ObfuscatedName("lm.u(I)I")
    public int method5232() throws IOException {
        synchronized (this) {
            if (this.field3874 != this.field3872) {
                int var2 = this.field3870[this.field3872] & 0xFF;
                this.field3872 = (this.field3872 + 1) % this.field3869;
                this.notifyAll();
                return var2;
            } else if (this.field3873 == null) {
                return -1;
            } else {
                throw new IOException(this.field3873.toString());
            }
        }
    }

    @ObfuscatedName("lm.p([BIIB)I")
    public int method5233(byte[] arg0, int arg1, int arg2) throws IOException {
        if (arg2 < 0 || arg1 < 0 || arg1 + arg2 > arg0.length) {
            throw new IOException();
        }
        synchronized (this) {
            int var5;
            if (this.field3872 <= this.field3874) {
                var5 = this.field3874 - this.field3872;
            } else {
                var5 = this.field3874 + (this.field3869 - this.field3872);
            }
            if (arg2 > var5) {
                arg2 = var5;
            }
            if (arg2 == 0 && this.field3873 != null) {
                throw new IOException(this.field3873.toString());
            }
            if (this.field3872 + arg2 <= this.field3869) {
                System.arraycopy(this.field3870, this.field3872, arg0, arg1, arg2);
            } else {
                int var6 = this.field3869 - this.field3872;
                System.arraycopy(this.field3870, this.field3872, arg0, arg1, var6);
                System.arraycopy(this.field3870, 0, arg0, arg1 + var6, arg2 - var6);
            }
            this.field3872 = (this.field3872 + arg2) % this.field3869;
            this.notifyAll();
            return arg2;
        }
    }

    @ObfuscatedName("lm.b(B)V")
    public void method5234() {
        synchronized (this) {
            if (this.field3873 == null) {
                this.field3873 = new IOException("");
            }
            this.notifyAll();
        }
        try {
            this.field3867.join();
        } catch (InterruptedException var4) {
        }
    }
}
