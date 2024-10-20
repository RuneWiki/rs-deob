package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("hk")
public class class228 {

    @ObfuscatedName("hk.f")
    public class227 field3213;

    @ObfuscatedName("hk.s")
    public byte[] field3203;

    @ObfuscatedName("hk.q")
    public long field3211 = -1L;

    @ObfuscatedName("hk.g")
    public int field3204;

    @ObfuscatedName("hk.m")
    public byte[] field3208;

    @ObfuscatedName("hk.t")
    public long field3207 = -1L;

    @ObfuscatedName("hk.j")
    public int field3202 = 0;

    @ObfuscatedName("hk.n")
    public long field3209;

    @ObfuscatedName("hk.l")
    public long field3210;

    @ObfuscatedName("hk.i")
    public long field3205;

    @ObfuscatedName("hk.w")
    public long field3212;

    public class228(class227 arg0, int arg1, int arg2) throws IOException {
        this.field3213 = arg0;
        this.field3205 = this.field3210 = arg0.method3858();
        this.field3203 = new byte[arg1];
        this.field3208 = new byte[arg2];
        this.field3209 = 0L;
    }

    @ObfuscatedName("hk.f(B)V")
    public void method3881() throws IOException {
        this.method3875();
        this.field3213.method3859();
    }

    @ObfuscatedName("hk.s(J)V")
    public void method3868(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field3209 = arg0;
    }

    @ObfuscatedName("hk.q(I)J")
    public long method3869() {
        return this.field3205;
    }

    @ObfuscatedName("hk.g([BI)V")
    public void method3870(byte[] arg0) throws IOException {
        this.method3871(arg0, 0, arg0.length);
    }

    @ObfuscatedName("hk.m([BIIB)V")
    public void method3871(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field3207 != -1L && this.field3209 >= this.field3207 && this.field3209 + (long) arg2 <= this.field3207 + (long) this.field3202) {
                System.arraycopy(this.field3208, (int) (this.field3209 - this.field3207), arg0, arg1, arg2);
                this.field3209 += (long) arg2;
                return;
            }
            long var4 = this.field3209;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field3209 >= this.field3211 && this.field3209 < this.field3211 + (long) this.field3204) {
                int var8 = (int) ((long) this.field3204 - (this.field3209 - this.field3211));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field3203, (int) (this.field3209 - this.field3211), arg0, arg1, var8);
                this.field3209 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field3203.length) {
                this.field3213.method3845(this.field3209);
                this.field3212 = this.field3209;
                while (arg2 > 0) {
                    int var9 = this.field3213.method3857(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field3212 += (long) var9;
                    this.field3209 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method3872();
                int var10 = arg2;
                if (arg2 > this.field3204) {
                    var10 = this.field3204;
                }
                System.arraycopy(this.field3203, 0, arg0, arg1, var10);
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
                } else if (var4 >= this.field3207 && var4 < this.field3207 + (long) this.field3202) {
                    var12 = var4;
                }
                if (this.field3207 + (long) this.field3202 > var4 && this.field3207 + (long) this.field3202 <= (long) var7 + var4) {
                    var14 = this.field3207 + (long) this.field3202;
                } else if ((long) var7 + var4 > this.field3207 && (long) var7 + var4 <= this.field3207 + (long) this.field3202) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field3208, (int) (var12 - this.field3207), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field3209) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field3209));
                        this.field3209 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field3212 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("hk.t(I)V")
    public void method3872() throws IOException {
        this.field3204 = 0;
        if (this.field3212 != this.field3209) {
            this.field3213.method3845(this.field3209);
            this.field3212 = this.field3209;
        }
        this.field3211 = this.field3209;
        while (this.field3204 < this.field3203.length) {
            int var1 = this.field3213.method3857(this.field3203, this.field3204, this.field3203.length - this.field3204);
            if (var1 == -1) {
                break;
            }
            this.field3212 += (long) var1;
            this.field3204 += var1;
        }
    }

    @ObfuscatedName("hk.j([BIII)V")
    public void method3867(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field3209 + (long) arg2 > this.field3205) {
                this.field3205 = this.field3209 + (long) arg2;
            }
            if (this.field3207 != -1L && (this.field3209 < this.field3207 || this.field3209 > this.field3207 + (long) this.field3202)) {
                this.method3875();
            }
            if (this.field3207 != -1L && this.field3209 + (long) arg2 > this.field3207 + (long) this.field3208.length) {
                int var4 = (int) ((long) this.field3208.length - (this.field3209 - this.field3207));
                System.arraycopy(arg0, arg1, this.field3208, (int) (this.field3209 - this.field3207), var4);
                this.field3209 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field3202 = this.field3208.length;
                this.method3875();
            }
            if (arg2 > this.field3208.length) {
                if (this.field3212 != this.field3209) {
                    this.field3213.method3845(this.field3209);
                    this.field3212 = this.field3209;
                }
                this.field3213.method3846(arg0, arg1, arg2);
                this.field3212 += (long) arg2;
                if (this.field3212 > this.field3210) {
                    this.field3210 = this.field3212;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field3209 >= this.field3211 && this.field3209 < this.field3211 + (long) this.field3204) {
                    var5 = this.field3209;
                } else if (this.field3211 >= this.field3209 && this.field3211 < this.field3209 + (long) arg2) {
                    var5 = this.field3211;
                }
                if (this.field3209 + (long) arg2 > this.field3211 && this.field3209 + (long) arg2 <= this.field3211 + (long) this.field3204) {
                    var7 = this.field3209 + (long) arg2;
                } else if (this.field3211 + (long) this.field3204 > this.field3209 && this.field3211 + (long) this.field3204 <= this.field3209 + (long) arg2) {
                    var7 = this.field3211 + (long) this.field3204;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field3209), this.field3203, (int) (var5 - this.field3211), var9);
                }
                this.field3209 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field3207 == -1L) {
                    this.field3207 = this.field3209;
                }
                System.arraycopy(arg0, arg1, this.field3208, (int) (this.field3209 - this.field3207), arg2);
                this.field3209 += (long) arg2;
                if (this.field3209 - this.field3207 > (long) this.field3202) {
                    this.field3202 = (int) (this.field3209 - this.field3207);
                }
            }
        } catch (IOException var11) {
            this.field3212 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("hk.n(B)V")
    public void method3875() throws IOException {
        if (this.field3207 == -1L) {
            return;
        }
        if (this.field3212 != this.field3207) {
            this.field3213.method3845(this.field3207);
            this.field3212 = this.field3207;
        }
        this.field3213.method3846(this.field3208, 0, this.field3202);
        this.field3212 += (long) (this.field3202 * 130500809) * 2031047033L;
        if (this.field3212 > this.field3210) {
            this.field3210 = this.field3212;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field3207 >= this.field3211 && this.field3207 < this.field3211 + (long) this.field3204) {
            var1 = this.field3207;
        } else if (this.field3211 >= this.field3207 && this.field3211 < this.field3207 + (long) this.field3202) {
            var1 = this.field3211;
        }
        if (this.field3207 + (long) this.field3202 > this.field3211 && this.field3207 + (long) this.field3202 <= this.field3211 + (long) this.field3204) {
            var3 = this.field3207 + (long) this.field3202;
        } else if (this.field3211 + (long) this.field3204 > this.field3207 && this.field3211 + (long) this.field3204 <= this.field3207 + (long) this.field3202) {
            var3 = this.field3211 + (long) this.field3204;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field3208, (int) (var1 - this.field3207), this.field3203, (int) (var1 - this.field3211), var5);
        }
        this.field3207 = -1L;
        this.field3202 = 0;
    }
}
