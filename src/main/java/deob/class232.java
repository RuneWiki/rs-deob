package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("hp")
public class class232 {

    @ObfuscatedName("hp.i")
    public class231 field3272;

    @ObfuscatedName("hp.h")
    public byte[] field3270;

    @ObfuscatedName("hp.e")
    public long field3280 = -1L;

    @ObfuscatedName("hp.g")
    public int field3275;

    @ObfuscatedName("hp.n")
    public byte[] field3273;

    @ObfuscatedName("hp.u")
    public long field3278 = -1L;

    @ObfuscatedName("hp.d")
    public int field3274 = 0;

    @ObfuscatedName("hp.l")
    public long field3276;

    @ObfuscatedName("hp.m")
    public long field3277;

    @ObfuscatedName("hp.j")
    public long field3271;

    @ObfuscatedName("hp.y")
    public long field3279;

    public class232(class231 arg0, int arg1, int arg2) throws IOException {
        this.field3272 = arg0;
        this.field3271 = this.field3277 = arg0.method3908();
        this.field3270 = new byte[arg1];
        this.field3273 = new byte[arg2];
        this.field3276 = 0L;
    }

    @ObfuscatedName("hp.i(I)V")
    public void method3921() throws IOException {
        this.method3928();
        this.field3272.method3904();
    }

    @ObfuscatedName("hp.h(J)V")
    public void method3922(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field3276 = arg0;
    }

    @ObfuscatedName("hp.e(S)J")
    public long method3933() {
        return this.field3271;
    }

    @ObfuscatedName("hp.g([BI)V")
    public void method3924(byte[] arg0) throws IOException {
        this.method3925(arg0, 0, arg0.length);
    }

    @ObfuscatedName("hp.n([BIIB)V")
    public void method3925(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field3278 != -1L && this.field3276 >= this.field3278 && this.field3276 + (long) arg2 <= this.field3278 + (long) this.field3274) {
                System.arraycopy(this.field3273, (int) (this.field3276 - this.field3278), arg0, arg1, arg2);
                this.field3276 += (long) arg2;
                return;
            }
            long var4 = this.field3276;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field3276 >= this.field3280 && this.field3276 < this.field3280 + (long) this.field3275) {
                int var8 = (int) ((long) this.field3275 - (this.field3276 - this.field3280));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field3270, (int) (this.field3276 - this.field3280), arg0, arg1, var8);
                this.field3276 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field3270.length) {
                this.field3272.method3902(this.field3276);
                this.field3279 = this.field3276;
                while (arg2 > 0) {
                    int var9 = this.field3272.method3905(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field3279 += (long) var9;
                    this.field3276 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method3926();
                int var10 = arg2;
                if (arg2 > this.field3275) {
                    var10 = this.field3275;
                }
                System.arraycopy(this.field3270, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field3276 += (long) var10;
            }
            if (this.field3278 != -1L) {
                if (this.field3278 > this.field3276 && arg2 > 0) {
                    int var11 = (int) (this.field3278 - this.field3276) + arg1;
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
                if (this.field3278 >= var4 && this.field3278 < (long) var7 + var4) {
                    var12 = this.field3278;
                } else if (var4 >= this.field3278 && var4 < this.field3278 + (long) this.field3274) {
                    var12 = var4;
                }
                if (this.field3278 + (long) this.field3274 > var4 && this.field3278 + (long) this.field3274 <= (long) var7 + var4) {
                    var14 = this.field3278 + (long) this.field3274;
                } else if ((long) var7 + var4 > this.field3278 && (long) var7 + var4 <= this.field3278 + (long) this.field3274) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field3273, (int) (var12 - this.field3278), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field3276) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field3276));
                        this.field3276 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field3279 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("hp.u(B)V")
    public void method3926() throws IOException {
        this.field3275 = 0;
        if (this.field3279 != this.field3276) {
            this.field3272.method3902(this.field3276);
            this.field3279 = this.field3276;
        }
        this.field3280 = this.field3276;
        while (this.field3275 < this.field3270.length) {
            int var1 = this.field3272.method3905(this.field3270, this.field3275, this.field3270.length - this.field3275);
            if (var1 == -1) {
                break;
            }
            this.field3279 += (long) var1;
            this.field3275 += var1;
        }
    }

    @ObfuscatedName("hp.d([BIII)V")
    public void method3927(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field3276 + (long) arg2 > this.field3271) {
                this.field3271 = this.field3276 + (long) arg2;
            }
            if (this.field3278 != -1L && (this.field3276 < this.field3278 || this.field3276 > this.field3278 + (long) this.field3274)) {
                this.method3928();
            }
            if (this.field3278 != -1L && this.field3276 + (long) arg2 > this.field3278 + (long) this.field3273.length) {
                int var4 = (int) ((long) this.field3273.length - (this.field3276 - this.field3278));
                System.arraycopy(arg0, arg1, this.field3273, (int) (this.field3276 - this.field3278), var4);
                this.field3276 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field3274 = this.field3273.length;
                this.method3928();
            }
            if (arg2 > this.field3273.length) {
                if (this.field3279 != this.field3276) {
                    this.field3272.method3902(this.field3276);
                    this.field3279 = this.field3276;
                }
                this.field3272.method3901(arg0, arg1, arg2);
                this.field3279 += (long) arg2;
                if (this.field3279 > this.field3277) {
                    this.field3277 = this.field3279;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field3276 >= this.field3280 && this.field3276 < this.field3280 + (long) this.field3275) {
                    var5 = this.field3276;
                } else if (this.field3280 >= this.field3276 && this.field3280 < this.field3276 + (long) arg2) {
                    var5 = this.field3280;
                }
                if (this.field3276 + (long) arg2 > this.field3280 && this.field3276 + (long) arg2 <= this.field3280 + (long) this.field3275) {
                    var7 = this.field3276 + (long) arg2;
                } else if (this.field3280 + (long) this.field3275 > this.field3276 && this.field3280 + (long) this.field3275 <= this.field3276 + (long) arg2) {
                    var7 = this.field3280 + (long) this.field3275;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field3276), this.field3270, (int) (var5 - this.field3280), var9);
                }
                this.field3276 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field3278 == -1L) {
                    this.field3278 = this.field3276;
                }
                System.arraycopy(arg0, arg1, this.field3273, (int) (this.field3276 - this.field3278), arg2);
                this.field3276 += (long) arg2;
                if (this.field3276 - this.field3278 > (long) this.field3274) {
                    this.field3274 = (int) (this.field3276 - this.field3278);
                }
            }
        } catch (IOException var11) {
            this.field3279 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("hp.l(B)V")
    public void method3928() throws IOException {
        if (this.field3278 == -1L) {
            return;
        }
        if (this.field3279 != this.field3278) {
            this.field3272.method3902(this.field3278);
            this.field3279 = this.field3278;
        }
        this.field3272.method3901(this.field3273, 0, this.field3274);
        this.field3279 += (long) (this.field3274 * 66923117) * 1660776293L;
        if (this.field3279 > this.field3277) {
            this.field3277 = this.field3279;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field3278 >= this.field3280 && this.field3278 < this.field3280 + (long) this.field3275) {
            var1 = this.field3278;
        } else if (this.field3280 >= this.field3278 && this.field3280 < this.field3278 + (long) this.field3274) {
            var1 = this.field3280;
        }
        if (this.field3278 + (long) this.field3274 > this.field3280 && this.field3278 + (long) this.field3274 <= this.field3280 + (long) this.field3275) {
            var3 = this.field3278 + (long) this.field3274;
        } else if (this.field3280 + (long) this.field3275 > this.field3278 && this.field3280 + (long) this.field3275 <= this.field3278 + (long) this.field3274) {
            var3 = this.field3280 + (long) this.field3275;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field3273, (int) (var1 - this.field3278), this.field3270, (int) (var1 - this.field3280), var5);
        }
        this.field3278 = -1L;
        this.field3274 = 0;
    }
}
