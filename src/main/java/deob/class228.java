package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("hv")
public class class228 {

    @ObfuscatedName("hv.o")
    public class227 field3208;

    @ObfuscatedName("hv.f")
    public byte[] field3202;

    @ObfuscatedName("hv.i")
    public long field3203 = -1L;

    @ObfuscatedName("hv.h")
    public int field3204;

    @ObfuscatedName("hv.q")
    public byte[] field3205;

    @ObfuscatedName("hv.u")
    public long field3207 = -1L;

    @ObfuscatedName("hv.m")
    public int field3206 = 0;

    @ObfuscatedName("hv.y")
    public long field3209;

    @ObfuscatedName("hv.p")
    public long field3201;

    @ObfuscatedName("hv.t")
    public long field3210;

    @ObfuscatedName("hv.g")
    public long field3211;

    public class228(class227 arg0, int arg1, int arg2) throws IOException {
        this.field3208 = arg0;
        this.field3210 = this.field3201 = arg0.method3810();
        this.field3202 = new byte[arg1];
        this.field3205 = new byte[arg2];
        this.field3209 = 0L;
    }

    @ObfuscatedName("hv.o(I)V")
    public void method3828() throws IOException {
        this.method3837();
        this.field3208.method3809();
    }

    @ObfuscatedName("hv.f(J)V")
    public void method3847(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field3209 = arg0;
    }

    @ObfuscatedName("hv.i(B)J")
    public long method3830() {
        return this.field3210;
    }

    @ObfuscatedName("hv.h([BI)V")
    public void method3831(byte[] arg0) throws IOException {
        this.method3832(arg0, 0, arg0.length);
    }

    @ObfuscatedName("hv.q([BIII)V")
    public void method3832(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field3207 != -1L && this.field3209 >= this.field3207 && this.field3209 + (long) arg2 <= this.field3207 + (long) this.field3206) {
                System.arraycopy(this.field3205, (int) (this.field3209 - this.field3207), arg0, arg1, arg2);
                this.field3209 += (long) arg2;
                return;
            }
            long var4 = this.field3209;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field3209 >= this.field3203 && this.field3209 < this.field3203 + (long) this.field3204) {
                int var8 = (int) ((long) this.field3204 - (this.field3209 - this.field3203));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field3202, (int) (this.field3209 - this.field3203), arg0, arg1, var8);
                this.field3209 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field3202.length) {
                this.field3208.method3817(this.field3209);
                this.field3211 = this.field3209;
                while (arg2 > 0) {
                    int var9 = this.field3208.method3811(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field3211 += (long) var9;
                    this.field3209 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method3835();
                int var10 = arg2;
                if (arg2 > this.field3204) {
                    var10 = this.field3204;
                }
                System.arraycopy(this.field3202, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field3209 += (long) var10;
            }
            if (this.field3207 != -1L) {
                if (this.field3207 > this.field3209 && arg2 > 0) {
                    int var11 = (int) (this.field3207 - this.field3209) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field3209++;
                    }
                }
                long var12 = -1L;
                long var14 = -1L;
                if (this.field3207 >= var4 && this.field3207 < (long) var7 + var4) {
                    var12 = this.field3207;
                } else if (var4 >= this.field3207 && var4 < this.field3207 + (long) this.field3206) {
                    var12 = var4;
                }
                if (this.field3207 + (long) this.field3206 > var4 && this.field3207 + (long) this.field3206 <= (long) var7 + var4) {
                    var14 = this.field3207 + (long) this.field3206;
                } else if ((long) var7 + var4 > this.field3207 && (long) var7 + var4 <= this.field3207 + (long) this.field3206) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field3205, (int) (var12 - this.field3207), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field3209) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field3209));
                        this.field3209 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field3211 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("hv.u(I)V")
    public void method3835() throws IOException {
        this.field3204 = 0;
        if (this.field3211 != this.field3209) {
            this.field3208.method3817(this.field3209);
            this.field3211 = this.field3209;
        }
        this.field3203 = this.field3209;
        while (this.field3204 < this.field3202.length) {
            int var1 = this.field3208.method3811(this.field3202, this.field3204, this.field3202.length - this.field3204);
            if (var1 == -1) {
                break;
            }
            this.field3211 += (long) var1;
            this.field3204 += var1;
        }
    }

    @ObfuscatedName("hv.m([BIII)V")
    public void method3834(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field3209 + (long) arg2 > this.field3210) {
                this.field3210 = this.field3209 + (long) arg2;
            }
            if (this.field3207 != -1L && (this.field3209 < this.field3207 || this.field3209 > this.field3207 + (long) this.field3206)) {
                this.method3837();
            }
            if (this.field3207 != -1L && this.field3209 + (long) arg2 > this.field3207 + (long) this.field3205.length) {
                int var4 = (int) ((long) this.field3205.length - (this.field3209 - this.field3207));
                System.arraycopy(arg0, arg1, this.field3205, (int) (this.field3209 - this.field3207), var4);
                this.field3209 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field3206 = this.field3205.length;
                this.method3837();
            }
            if (arg2 > this.field3205.length) {
                if (this.field3211 != this.field3209) {
                    this.field3208.method3817(this.field3209);
                    this.field3211 = this.field3209;
                }
                this.field3208.method3808(arg0, arg1, arg2);
                this.field3211 += (long) arg2;
                if (this.field3211 > this.field3201) {
                    this.field3201 = this.field3211;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field3209 >= this.field3203 && this.field3209 < this.field3203 + (long) this.field3204) {
                    var5 = this.field3209;
                } else if (this.field3203 >= this.field3209 && this.field3203 < this.field3209 + (long) arg2) {
                    var5 = this.field3203;
                }
                if (this.field3209 + (long) arg2 > this.field3203 && this.field3209 + (long) arg2 <= this.field3203 + (long) this.field3204) {
                    var7 = this.field3209 + (long) arg2;
                } else if (this.field3203 + (long) this.field3204 > this.field3209 && this.field3203 + (long) this.field3204 <= this.field3209 + (long) arg2) {
                    var7 = this.field3203 + (long) this.field3204;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field3209), this.field3202, (int) (var5 - this.field3203), var9);
                }
                this.field3209 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field3207 == -1L) {
                    this.field3207 = this.field3209;
                }
                System.arraycopy(arg0, arg1, this.field3205, (int) (this.field3209 - this.field3207), arg2);
                this.field3209 += (long) arg2;
                if (this.field3209 - this.field3207 > (long) this.field3206) {
                    this.field3206 = (int) (this.field3209 - this.field3207);
                }
            }
        } catch (IOException var11) {
            this.field3211 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("hv.y(I)V")
    public void method3837() throws IOException {
        if (this.field3207 == -1L) {
            return;
        }
        if (this.field3211 != this.field3207) {
            this.field3208.method3817(this.field3207);
            this.field3211 = this.field3207;
        }
        this.field3208.method3808(this.field3205, 0, this.field3206);
        this.field3211 += (long) (this.field3206 * -986162019) * -1645672011L;
        if (this.field3211 > this.field3201) {
            this.field3201 = this.field3211;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field3207 >= this.field3203 && this.field3207 < this.field3203 + (long) this.field3204) {
            var1 = this.field3207;
        } else if (this.field3203 >= this.field3207 && this.field3203 < this.field3207 + (long) this.field3206) {
            var1 = this.field3203;
        }
        if (this.field3207 + (long) this.field3206 > this.field3203 && this.field3207 + (long) this.field3206 <= this.field3203 + (long) this.field3204) {
            var3 = this.field3207 + (long) this.field3206;
        } else if (this.field3203 + (long) this.field3204 > this.field3207 && this.field3203 + (long) this.field3204 <= this.field3207 + (long) this.field3206) {
            var3 = this.field3203 + (long) this.field3204;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field3205, (int) (var1 - this.field3207), this.field3202, (int) (var1 - this.field3203), var5);
        }
        this.field3207 = -1L;
        this.field3206 = 0;
    }
}
