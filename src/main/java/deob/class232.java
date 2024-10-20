package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("hp")
public class class232 {

    @ObfuscatedName("hp.f")
    public class231 field3278;

    @ObfuscatedName("hp.e")
    public byte[] field3275;

    @ObfuscatedName("hp.n")
    public long field3279 = -1L;

    @ObfuscatedName("hp.t")
    public int field3272;

    @ObfuscatedName("hp.v")
    public byte[] field3273;

    @ObfuscatedName("hp.b")
    public long field3274 = -1L;

    @ObfuscatedName("hp.m")
    public int field3269 = 0;

    @ObfuscatedName("hp.k")
    public long field3276;

    @ObfuscatedName("hp.c")
    public long field3277;

    @ObfuscatedName("hp.w")
    public long field3270;

    @ObfuscatedName("hp.l")
    public long field3271;

    public class232(class231 arg0, int arg1, int arg2) throws IOException {
        this.field3278 = arg0;
        this.field3270 = this.field3277 = arg0.method3957();
        this.field3275 = new byte[arg1];
        this.field3273 = new byte[arg2];
        this.field3276 = 0L;
    }

    @ObfuscatedName("hp.f(B)V")
    public void method3962() throws IOException {
        this.method3968();
        this.field3278.method3942();
    }

    @ObfuscatedName("hp.e(J)V")
    public void method3963(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field3276 = arg0;
    }

    @ObfuscatedName("hp.n(B)J")
    public long method3964() {
        return this.field3270;
    }

    @ObfuscatedName("hp.t([BI)V")
    public void method3980(byte[] arg0) throws IOException {
        this.method3966(arg0, 0, arg0.length);
    }

    @ObfuscatedName("hp.v([BIII)V")
    public void method3966(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field3274 != -1L && this.field3276 >= this.field3274 && this.field3276 + (long) arg2 <= this.field3274 + (long) this.field3269) {
                System.arraycopy(this.field3273, (int) (this.field3276 - this.field3274), arg0, arg1, arg2);
                this.field3276 += (long) arg2;
                return;
            }
            long var4 = this.field3276;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field3276 >= this.field3279 && this.field3276 < this.field3279 + (long) this.field3272) {
                int var8 = (int) ((long) this.field3272 - (this.field3276 - this.field3279));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field3275, (int) (this.field3276 - this.field3279), arg0, arg1, var8);
                this.field3276 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field3275.length) {
                this.field3278.method3940(this.field3276);
                this.field3271 = this.field3276;
                while (arg2 > 0) {
                    int var9 = this.field3278.method3944(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field3271 += (long) var9;
                    this.field3276 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method3965();
                int var10 = arg2;
                if (arg2 > this.field3272) {
                    var10 = this.field3272;
                }
                System.arraycopy(this.field3275, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field3276 += (long) var10;
            }
            if (this.field3274 != -1L) {
                if (this.field3274 > this.field3276 && arg2 > 0) {
                    int var11 = (int) (this.field3274 - this.field3276) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field3276++;
                    }
                }
                long var12 = -1L;
                long var14 = -1L;
                if (this.field3274 >= var4 && this.field3274 < (long) var7 + var4) {
                    var12 = this.field3274;
                } else if (var4 >= this.field3274 && var4 < this.field3274 + (long) this.field3269) {
                    var12 = var4;
                }
                if (this.field3274 + (long) this.field3269 > var4 && this.field3274 + (long) this.field3269 <= (long) var7 + var4) {
                    var14 = this.field3274 + (long) this.field3269;
                } else if ((long) var7 + var4 > this.field3274 && (long) var7 + var4 <= this.field3274 + (long) this.field3269) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field3273, (int) (var12 - this.field3274), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field3276) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field3276));
                        this.field3276 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field3271 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("hp.b(I)V")
    public void method3965() throws IOException {
        this.field3272 = 0;
        if (this.field3276 != this.field3271) {
            this.field3278.method3940(this.field3276);
            this.field3271 = this.field3276;
        }
        this.field3279 = this.field3276;
        while (this.field3272 < this.field3275.length) {
            int var1 = this.field3278.method3944(this.field3275, this.field3272, this.field3275.length - this.field3272);
            if (var1 == -1) {
                break;
            }
            this.field3271 += (long) var1;
            this.field3272 += var1;
        }
    }

    @ObfuscatedName("hp.m([BIII)V")
    public void method3973(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field3276 + (long) arg2 > this.field3270) {
                this.field3270 = this.field3276 + (long) arg2;
            }
            if (this.field3274 != -1L && (this.field3276 < this.field3274 || this.field3276 > this.field3274 + (long) this.field3269)) {
                this.method3968();
            }
            if (this.field3274 != -1L && this.field3276 + (long) arg2 > this.field3274 + (long) this.field3273.length) {
                int var4 = (int) ((long) this.field3273.length - (this.field3276 - this.field3274));
                System.arraycopy(arg0, arg1, this.field3273, (int) (this.field3276 - this.field3274), var4);
                this.field3276 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field3269 = this.field3273.length;
                this.method3968();
            }
            if (arg2 > this.field3273.length) {
                if (this.field3276 != this.field3271) {
                    this.field3278.method3940(this.field3276);
                    this.field3271 = this.field3276;
                }
                this.field3278.method3941(arg0, arg1, arg2);
                this.field3271 += (long) arg2;
                if (this.field3271 > this.field3277) {
                    this.field3277 = this.field3271;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field3276 >= this.field3279 && this.field3276 < this.field3279 + (long) this.field3272) {
                    var5 = this.field3276;
                } else if (this.field3279 >= this.field3276 && this.field3279 < this.field3276 + (long) arg2) {
                    var5 = this.field3279;
                }
                if (this.field3276 + (long) arg2 > this.field3279 && this.field3276 + (long) arg2 <= this.field3279 + (long) this.field3272) {
                    var7 = this.field3276 + (long) arg2;
                } else if (this.field3279 + (long) this.field3272 > this.field3276 && this.field3279 + (long) this.field3272 <= this.field3276 + (long) arg2) {
                    var7 = this.field3279 + (long) this.field3272;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field3276), this.field3275, (int) (var5 - this.field3279), var9);
                }
                this.field3276 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field3274 == -1L) {
                    this.field3274 = this.field3276;
                }
                System.arraycopy(arg0, arg1, this.field3273, (int) (this.field3276 - this.field3274), arg2);
                this.field3276 += (long) arg2;
                if (this.field3276 - this.field3274 > (long) this.field3269) {
                    this.field3269 = (int) (this.field3276 - this.field3274);
                }
            }
        } catch (IOException var11) {
            this.field3271 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("hp.k(I)V")
    public void method3968() throws IOException {
        if (this.field3274 == -1L) {
            return;
        }
        if (this.field3274 != this.field3271) {
            this.field3278.method3940(this.field3274);
            this.field3271 = this.field3274;
        }
        this.field3278.method3941(this.field3273, 0, this.field3269);
        this.field3271 += (long) (this.field3269 * -2065220199) * -2832727L;
        if (this.field3271 > this.field3277) {
            this.field3277 = this.field3271;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field3274 >= this.field3279 && this.field3274 < this.field3279 + (long) this.field3272) {
            var1 = this.field3274;
        } else if (this.field3279 >= this.field3274 && this.field3279 < this.field3274 + (long) this.field3269) {
            var1 = this.field3279;
        }
        if (this.field3274 + (long) this.field3269 > this.field3279 && this.field3274 + (long) this.field3269 <= this.field3279 + (long) this.field3272) {
            var3 = this.field3274 + (long) this.field3269;
        } else if (this.field3279 + (long) this.field3272 > this.field3274 && this.field3279 + (long) this.field3272 <= this.field3274 + (long) this.field3269) {
            var3 = this.field3279 + (long) this.field3272;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field3273, (int) (var1 - this.field3274), this.field3275, (int) (var1 - this.field3279), var5);
        }
        this.field3274 = -1L;
        this.field3269 = 0;
    }
}
