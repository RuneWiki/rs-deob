package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("mw")
public class class342 {

    @ObfuscatedName("mw.j")
    public class343 field4053;

    @ObfuscatedName("mw.i")
    public byte[] field4049;

    @ObfuscatedName("mw.k")
    public long field4050 = -1L;

    @ObfuscatedName("mw.u")
    public int field4051;

    @ObfuscatedName("mw.n")
    public byte[] field4052;

    @ObfuscatedName("mw.t")
    public long field4055 = -1L;

    @ObfuscatedName("mw.q")
    public int field4054 = 0;

    @ObfuscatedName("mw.x")
    public long field4058;

    @ObfuscatedName("mw.d")
    public long field4056;

    @ObfuscatedName("mw.f")
    public long field4057;

    @ObfuscatedName("mw.c")
    public long field4048;

    public class342(class343 arg0, int arg1, int arg2) throws IOException {
        this.field4053 = arg0;
        this.field4057 = this.field4056 = arg0.method6034();
        this.field4049 = new byte[arg1];
        this.field4052 = new byte[arg2];
        this.field4058 = 0L;
    }

    @ObfuscatedName("mw.s(I)V")
    public void method6008() throws IOException {
        this.method6011();
        this.field4053.method6036();
    }

    @ObfuscatedName("mw.j(J)V")
    public void method6005(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field4058 = arg0;
    }

    @ObfuscatedName("mw.i(B)J")
    public long method6006() {
        return this.field4057;
    }

    @ObfuscatedName("mw.k([BI)V")
    public void method6015(byte[] arg0) throws IOException {
        this.method6013(arg0, 0, arg0.length);
    }

    @ObfuscatedName("mw.u([BIII)V")
    public void method6013(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field4055 != -1L && this.field4058 >= this.field4055 && this.field4058 + (long) arg2 <= this.field4055 + (long) this.field4054) {
                System.arraycopy(this.field4052, (int) (this.field4058 - this.field4055), arg0, arg1, arg2);
                this.field4058 += (long) arg2;
                return;
            }
            long var4 = this.field4058;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field4058 >= this.field4050 && this.field4058 < this.field4050 + (long) this.field4051) {
                int var8 = (int) ((long) this.field4051 - (this.field4058 - this.field4050));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field4049, (int) (this.field4058 - this.field4050), arg0, arg1, var8);
                this.field4058 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field4049.length) {
                this.field4053.method6047(this.field4058);
                this.field4048 = this.field4058;
                while (arg2 > 0) {
                    int var9 = this.field4053.method6038(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field4048 += (long) var9;
                    this.field4058 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method6009();
                int var10 = arg2;
                if (arg2 > this.field4051) {
                    var10 = this.field4051;
                }
                System.arraycopy(this.field4049, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field4058 += (long) var10;
            }
            if (this.field4055 != -1L) {
                if (this.field4055 > this.field4058 && arg2 > 0) {
                    int var11 = (int) (this.field4055 - this.field4058) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field4058++;
                    }
                }
                long var12 = -1L;
                long var14 = -1L;
                if (this.field4055 >= var4 && this.field4055 < (long) var7 + var4) {
                    var12 = this.field4055;
                } else if (var4 >= this.field4055 && var4 < this.field4055 + (long) this.field4054) {
                    var12 = var4;
                }
                if (this.field4055 + (long) this.field4054 > var4 && this.field4055 + (long) this.field4054 <= (long) var7 + var4) {
                    var14 = this.field4055 + (long) this.field4054;
                } else if ((long) var7 + var4 > this.field4055 && (long) var7 + var4 <= this.field4055 + (long) this.field4054) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field4052, (int) (var12 - this.field4055), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field4058) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field4058));
                        this.field4058 = var14;
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

    @ObfuscatedName("mw.n(I)V")
    public void method6009() throws IOException {
        this.field4051 = 0;
        if (this.field4058 != this.field4048) {
            this.field4053.method6047(this.field4058);
            this.field4048 = this.field4058;
        }
        this.field4050 = this.field4058;
        while (this.field4051 < this.field4049.length) {
            int var1 = this.field4049.length - this.field4051;
            if (var1 > 200000000) {
                var1 = 200000000;
            }
            int var2 = this.field4053.method6038(this.field4049, this.field4051, var1);
            if (var2 == -1) {
                break;
            }
            this.field4048 += (long) var2;
            this.field4051 += var2;
        }
    }

    @ObfuscatedName("mw.t([BIII)V")
    public void method6010(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field4058 + (long) arg2 > this.field4057) {
                this.field4057 = this.field4058 + (long) arg2;
            }
            if (this.field4055 != -1L && (this.field4058 < this.field4055 || this.field4058 > this.field4055 + (long) this.field4054)) {
                this.method6011();
            }
            if (this.field4055 != -1L && this.field4058 + (long) arg2 > this.field4055 + (long) this.field4052.length) {
                int var4 = (int) ((long) this.field4052.length - (this.field4058 - this.field4055));
                System.arraycopy(arg0, arg1, this.field4052, (int) (this.field4058 - this.field4055), var4);
                this.field4058 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field4054 = this.field4052.length;
                this.method6011();
            }
            if (arg2 > this.field4052.length) {
                if (this.field4058 != this.field4048) {
                    this.field4053.method6047(this.field4058);
                    this.field4048 = this.field4058;
                }
                this.field4053.method6043(arg0, arg1, arg2);
                this.field4048 += (long) arg2;
                if (this.field4048 > this.field4056) {
                    this.field4056 = this.field4048;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field4058 >= this.field4050 && this.field4058 < this.field4050 + (long) this.field4051) {
                    var5 = this.field4058;
                } else if (this.field4050 >= this.field4058 && this.field4050 < this.field4058 + (long) arg2) {
                    var5 = this.field4050;
                }
                if (this.field4058 + (long) arg2 > this.field4050 && this.field4058 + (long) arg2 <= this.field4050 + (long) this.field4051) {
                    var7 = this.field4058 + (long) arg2;
                } else if (this.field4050 + (long) this.field4051 > this.field4058 && this.field4050 + (long) this.field4051 <= this.field4058 + (long) arg2) {
                    var7 = this.field4050 + (long) this.field4051;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field4058), this.field4049, (int) (var5 - this.field4050), var9);
                }
                this.field4058 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field4055 == -1L) {
                    this.field4055 = this.field4058;
                }
                System.arraycopy(arg0, arg1, this.field4052, (int) (this.field4058 - this.field4055), arg2);
                this.field4058 += (long) arg2;
                if (this.field4058 - this.field4055 > (long) this.field4054) {
                    this.field4054 = (int) (this.field4058 - this.field4055);
                }
            }
        } catch (IOException var11) {
            this.field4048 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("mw.q(I)V")
    public void method6011() throws IOException {
        if (this.field4055 == -1L) {
            return;
        }
        if (this.field4055 != this.field4048) {
            this.field4053.method6047(this.field4055);
            this.field4048 = this.field4055;
        }
        this.field4053.method6043(this.field4052, 0, this.field4054);
        this.field4048 += (long) (this.field4054 * 1940047011) * -1286336757L;
        if (this.field4048 > this.field4056) {
            this.field4056 = this.field4048;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field4055 >= this.field4050 && this.field4055 < this.field4050 + (long) this.field4051) {
            var1 = this.field4055;
        } else if (this.field4050 >= this.field4055 && this.field4050 < this.field4055 + (long) this.field4054) {
            var1 = this.field4050;
        }
        if (this.field4055 + (long) this.field4054 > this.field4050 && this.field4055 + (long) this.field4054 <= this.field4050 + (long) this.field4051) {
            var3 = this.field4055 + (long) this.field4054;
        } else if (this.field4050 + (long) this.field4051 > this.field4055 && this.field4050 + (long) this.field4051 <= this.field4055 + (long) this.field4054) {
            var3 = this.field4050 + (long) this.field4051;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field4052, (int) (var1 - this.field4055), this.field4049, (int) (var1 - this.field4050), var5);
        }
        this.field4055 = -1L;
        this.field4054 = 0;
    }
}
