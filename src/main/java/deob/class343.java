package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("mn")
public class class343 {

    @ObfuscatedName("mn.w")
    public class344 field4071;

    @ObfuscatedName("mn.e")
    public byte[] field4072;

    @ObfuscatedName("mn.p")
    public long field4070 = -1L;

    @ObfuscatedName("mn.k")
    public int field4074;

    @ObfuscatedName("mn.l")
    public byte[] field4076;

    @ObfuscatedName("mn.b")
    public long field4078 = -1L;

    @ObfuscatedName("mn.i")
    public int field4077 = 0;

    @ObfuscatedName("mn.c")
    public long field4073;

    @ObfuscatedName("mn.f")
    public long field4075;

    @ObfuscatedName("mn.m")
    public long field4080;

    @ObfuscatedName("mn.u")
    public long field4081;

    public class343(class344 arg0, int arg1, int arg2) throws IOException {
        this.field4071 = arg0;
        this.field4080 = this.field4075 = arg0.method6068();
        this.field4072 = new byte[arg1];
        this.field4076 = new byte[arg2];
        this.field4073 = 0L;
    }

    @ObfuscatedName("mn.q(B)V")
    public void method6056() throws IOException {
        this.method6039();
        this.field4071.method6066();
    }

    @ObfuscatedName("mn.w(J)V")
    public void method6037(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field4073 = arg0;
    }

    @ObfuscatedName("mn.e(S)J")
    public long method6036() {
        return this.field4080;
    }

    @ObfuscatedName("mn.p([BI)V")
    public void method6063(byte[] arg0) throws IOException {
        this.method6038(arg0, 0, arg0.length);
    }

    @ObfuscatedName("mn.k([BIII)V")
    public void method6038(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field4078 != -1L && this.field4073 >= this.field4078 && this.field4073 + (long) arg2 <= this.field4078 + (long) this.field4077) {
                System.arraycopy(this.field4076, (int) (this.field4073 - this.field4078), arg0, arg1, arg2);
                this.field4073 += (long) arg2;
                return;
            }
            long var4 = this.field4073;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field4073 >= this.field4070 && this.field4073 < this.field4070 + (long) this.field4074) {
                int var8 = (int) ((long) this.field4074 - (this.field4073 - this.field4070));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field4072, (int) (this.field4073 - this.field4070), arg0, arg1, var8);
                this.field4073 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field4072.length) {
                this.field4071.method6067(this.field4073);
                this.field4081 = this.field4073;
                while (arg2 > 0) {
                    int var9 = this.field4071.method6070(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field4081 += (long) var9;
                    this.field4073 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method6034();
                int var10 = arg2;
                if (arg2 > this.field4074) {
                    var10 = this.field4074;
                }
                System.arraycopy(this.field4072, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field4073 += (long) var10;
            }
            if (this.field4078 != -1L) {
                if (this.field4078 > this.field4073 && arg2 > 0) {
                    int var11 = (int) (this.field4078 - this.field4073) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field4073++;
                    }
                }
                long var12 = -1L;
                long var14 = -1L;
                if (this.field4078 >= var4 && this.field4078 < (long) var7 + var4) {
                    var12 = this.field4078;
                } else if (var4 >= this.field4078 && var4 < this.field4078 + (long) this.field4077) {
                    var12 = var4;
                }
                if (this.field4078 + (long) this.field4077 > var4 && this.field4078 + (long) this.field4077 <= (long) var7 + var4) {
                    var14 = this.field4078 + (long) this.field4077;
                } else if ((long) var7 + var4 > this.field4078 && (long) var7 + var4 <= this.field4078 + (long) this.field4077) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field4076, (int) (var12 - this.field4078), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field4073) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field4073));
                        this.field4073 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field4081 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("mn.l(I)V")
    public void method6034() throws IOException {
        this.field4074 = 0;
        if (this.field4081 != this.field4073) {
            this.field4071.method6067(this.field4073);
            this.field4081 = this.field4073;
        }
        this.field4070 = this.field4073;
        while (this.field4074 < this.field4072.length) {
            int var1 = this.field4072.length - this.field4074;
            if (var1 > 200000000) {
                var1 = 200000000;
            }
            int var2 = this.field4071.method6070(this.field4072, this.field4074, var1);
            if (var2 == -1) {
                break;
            }
            this.field4081 += (long) var2;
            this.field4074 += var2;
        }
    }

    @ObfuscatedName("mn.b([BIII)V")
    public void method6040(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field4073 + (long) arg2 > this.field4080) {
                this.field4080 = this.field4073 + (long) arg2;
            }
            if (this.field4078 != -1L && (this.field4073 < this.field4078 || this.field4073 > this.field4078 + (long) this.field4077)) {
                this.method6039();
            }
            if (this.field4078 != -1L && this.field4073 + (long) arg2 > this.field4078 + (long) this.field4076.length) {
                int var4 = (int) ((long) this.field4076.length - (this.field4073 - this.field4078));
                System.arraycopy(arg0, arg1, this.field4076, (int) (this.field4073 - this.field4078), var4);
                this.field4073 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field4077 = this.field4076.length;
                this.method6039();
            }
            if (arg2 > this.field4076.length) {
                if (this.field4081 != this.field4073) {
                    this.field4071.method6067(this.field4073);
                    this.field4081 = this.field4073;
                }
                this.field4071.method6077(arg0, arg1, arg2);
                this.field4081 += (long) arg2;
                if (this.field4081 > this.field4075) {
                    this.field4075 = this.field4081;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field4073 >= this.field4070 && this.field4073 < this.field4070 + (long) this.field4074) {
                    var5 = this.field4073;
                } else if (this.field4070 >= this.field4073 && this.field4070 < this.field4073 + (long) arg2) {
                    var5 = this.field4070;
                }
                if (this.field4073 + (long) arg2 > this.field4070 && this.field4073 + (long) arg2 <= this.field4070 + (long) this.field4074) {
                    var7 = this.field4073 + (long) arg2;
                } else if (this.field4070 + (long) this.field4074 > this.field4073 && this.field4070 + (long) this.field4074 <= this.field4073 + (long) arg2) {
                    var7 = this.field4070 + (long) this.field4074;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field4073), this.field4072, (int) (var5 - this.field4070), var9);
                }
                this.field4073 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field4078 == -1L) {
                    this.field4078 = this.field4073;
                }
                System.arraycopy(arg0, arg1, this.field4076, (int) (this.field4073 - this.field4078), arg2);
                this.field4073 += (long) arg2;
                if (this.field4073 - this.field4078 > (long) this.field4077) {
                    this.field4077 = (int) (this.field4073 - this.field4078);
                }
            }
        } catch (IOException var11) {
            this.field4081 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("mn.i(I)V")
    public void method6039() throws IOException {
        if (this.field4078 == -1L) {
            return;
        }
        if (this.field4081 != this.field4078) {
            this.field4071.method6067(this.field4078);
            this.field4081 = this.field4078;
        }
        this.field4071.method6077(this.field4076, 0, this.field4077);
        this.field4081 += (long) (this.field4077 * -1383888405) * -299149629L;
        if (this.field4081 > this.field4075) {
            this.field4075 = this.field4081;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field4078 >= this.field4070 && this.field4078 < this.field4070 + (long) this.field4074) {
            var1 = this.field4078;
        } else if (this.field4070 >= this.field4078 && this.field4070 < this.field4078 + (long) this.field4077) {
            var1 = this.field4070;
        }
        if (this.field4078 + (long) this.field4077 > this.field4070 && this.field4078 + (long) this.field4077 <= this.field4070 + (long) this.field4074) {
            var3 = this.field4078 + (long) this.field4077;
        } else if (this.field4070 + (long) this.field4074 > this.field4078 && this.field4070 + (long) this.field4074 <= this.field4078 + (long) this.field4077) {
            var3 = this.field4070 + (long) this.field4074;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field4076, (int) (var1 - this.field4078), this.field4072, (int) (var1 - this.field4070), var5);
        }
        this.field4078 = -1L;
        this.field4077 = 0;
    }
}
