package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("mb")
public class class342 {

    @ObfuscatedName("mb.f")
    public class343 field4056;

    @ObfuscatedName("mb.b")
    public byte[] field4054;

    @ObfuscatedName("mb.g")
    public long field4050 = -1L;

    @ObfuscatedName("mb.z")
    public int field4051;

    @ObfuscatedName("mb.p")
    public byte[] field4052;

    @ObfuscatedName("mb.h")
    public long field4049 = -1L;

    @ObfuscatedName("mb.y")
    public int field4053 = 0;

    @ObfuscatedName("mb.w")
    public long field4055;

    @ObfuscatedName("mb.i")
    public long field4058;

    @ObfuscatedName("mb.k")
    public long field4057;

    @ObfuscatedName("mb.x")
    public long field4048;

    public class342(class343 arg0, int arg1, int arg2) throws IOException {
        this.field4056 = arg0;
        this.field4057 = this.field4058 = arg0.method6118();
        this.field4054 = new byte[arg1];
        this.field4052 = new byte[arg2];
        this.field4055 = 0L;
    }

    @ObfuscatedName("mb.u(I)V")
    public void method6084() throws IOException {
        this.method6090();
        this.field4056.method6116();
    }

    @ObfuscatedName("mb.f(J)V")
    public void method6094(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field4055 = arg0;
    }

    @ObfuscatedName("mb.b(B)J")
    public long method6095() {
        return this.field4057;
    }

    @ObfuscatedName("mb.g([BI)V")
    public void method6086(byte[] arg0) throws IOException {
        this.method6087(arg0, 0, arg0.length);
    }

    @ObfuscatedName("mb.z([BIII)V")
    public void method6087(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field4049 != -1L && this.field4055 >= this.field4049 && this.field4055 + (long) arg2 <= this.field4049 + (long) this.field4053) {
                System.arraycopy(this.field4052, (int) (this.field4055 - this.field4049), arg0, arg1, arg2);
                this.field4055 += (long) arg2;
                return;
            }
            long var4 = this.field4055;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field4055 >= this.field4050 && this.field4055 < this.field4050 + (long) this.field4051) {
                int var8 = (int) ((long) this.field4051 - (this.field4055 - this.field4050));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field4054, (int) (this.field4055 - this.field4050), arg0, arg1, var8);
                this.field4055 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field4054.length) {
                this.field4056.method6114(this.field4055);
                this.field4048 = this.field4055;
                while (arg2 > 0) {
                    int var9 = this.field4056.method6119(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field4048 += (long) var9;
                    this.field4055 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method6088();
                int var10 = arg2;
                if (arg2 > this.field4051) {
                    var10 = this.field4051;
                }
                System.arraycopy(this.field4054, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field4055 += (long) var10;
            }
            if (this.field4049 != -1L) {
                if (this.field4049 > this.field4055 && arg2 > 0) {
                    int var11 = (int) (this.field4049 - this.field4055) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field4055++;
                    }
                }
                long var12 = -1L;
                long var14 = -1L;
                if (this.field4049 >= var4 && this.field4049 < (long) var7 + var4) {
                    var12 = this.field4049;
                } else if (var4 >= this.field4049 && var4 < this.field4049 + (long) this.field4053) {
                    var12 = var4;
                }
                if (this.field4049 + (long) this.field4053 > var4 && this.field4049 + (long) this.field4053 <= (long) var7 + var4) {
                    var14 = this.field4049 + (long) this.field4053;
                } else if ((long) var7 + var4 > this.field4049 && (long) var7 + var4 <= this.field4049 + (long) this.field4053) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field4052, (int) (var12 - this.field4049), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field4055) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field4055));
                        this.field4055 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field4048 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("mb.p(I)V")
    public void method6088() throws IOException {
        this.field4051 = 0;
        if (this.field4055 != this.field4048) {
            this.field4056.method6114(this.field4055);
            this.field4048 = this.field4055;
        }
        this.field4050 = this.field4055;
        while (this.field4051 < this.field4054.length) {
            int var1 = this.field4054.length - this.field4051;
            if (var1 > 200000000) {
                var1 = 200000000;
            }
            int var2 = this.field4056.method6119(this.field4054, this.field4051, var1);
            if (var2 == -1) {
                break;
            }
            this.field4048 += (long) var2;
            this.field4051 += var2;
        }
    }

    @ObfuscatedName("mb.h([BIIS)V")
    public void method6089(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field4055 + (long) arg2 > this.field4057) {
                this.field4057 = this.field4055 + (long) arg2;
            }
            if (this.field4049 != -1L && (this.field4055 < this.field4049 || this.field4055 > this.field4049 + (long) this.field4053)) {
                this.method6090();
            }
            if (this.field4049 != -1L && this.field4055 + (long) arg2 > this.field4049 + (long) this.field4052.length) {
                int var4 = (int) ((long) this.field4052.length - (this.field4055 - this.field4049));
                System.arraycopy(arg0, arg1, this.field4052, (int) (this.field4055 - this.field4049), var4);
                this.field4055 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field4053 = this.field4052.length;
                this.method6090();
            }
            if (arg2 > this.field4052.length) {
                if (this.field4055 != this.field4048) {
                    this.field4056.method6114(this.field4055);
                    this.field4048 = this.field4055;
                }
                this.field4056.method6115(arg0, arg1, arg2);
                this.field4048 += (long) arg2;
                if (this.field4048 > this.field4058) {
                    this.field4058 = this.field4048;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field4055 >= this.field4050 && this.field4055 < this.field4050 + (long) this.field4051) {
                    var5 = this.field4055;
                } else if (this.field4050 >= this.field4055 && this.field4050 < this.field4055 + (long) arg2) {
                    var5 = this.field4050;
                }
                if (this.field4055 + (long) arg2 > this.field4050 && this.field4055 + (long) arg2 <= this.field4050 + (long) this.field4051) {
                    var7 = this.field4055 + (long) arg2;
                } else if (this.field4050 + (long) this.field4051 > this.field4055 && this.field4050 + (long) this.field4051 <= this.field4055 + (long) arg2) {
                    var7 = this.field4050 + (long) this.field4051;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field4055), this.field4054, (int) (var5 - this.field4050), var9);
                }
                this.field4055 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field4049 == -1L) {
                    this.field4049 = this.field4055;
                }
                System.arraycopy(arg0, arg1, this.field4052, (int) (this.field4055 - this.field4049), arg2);
                this.field4055 += (long) arg2;
                if (this.field4055 - this.field4049 > (long) this.field4053) {
                    this.field4053 = (int) (this.field4055 - this.field4049);
                }
            }
        } catch (IOException var11) {
            this.field4048 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("mb.y(B)V")
    public void method6090() throws IOException {
        if (this.field4049 == -1L) {
            return;
        }
        if (this.field4049 != this.field4048) {
            this.field4056.method6114(this.field4049);
            this.field4048 = this.field4049;
        }
        this.field4056.method6115(this.field4052, 0, this.field4053);
        this.field4048 += (long) (this.field4053 * -520660853) * -585871581L;
        if (this.field4048 > this.field4058) {
            this.field4058 = this.field4048;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field4049 >= this.field4050 && this.field4049 < this.field4050 + (long) this.field4051) {
            var1 = this.field4049;
        } else if (this.field4050 >= this.field4049 && this.field4050 < this.field4049 + (long) this.field4053) {
            var1 = this.field4050;
        }
        if (this.field4049 + (long) this.field4053 > this.field4050 && this.field4049 + (long) this.field4053 <= this.field4050 + (long) this.field4051) {
            var3 = this.field4049 + (long) this.field4053;
        } else if (this.field4050 + (long) this.field4051 > this.field4049 && this.field4050 + (long) this.field4051 <= this.field4049 + (long) this.field4053) {
            var3 = this.field4050 + (long) this.field4051;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field4052, (int) (var1 - this.field4049), this.field4054, (int) (var1 - this.field4050), var5);
        }
        this.field4049 = -1L;
        this.field4053 = 0;
    }
}
