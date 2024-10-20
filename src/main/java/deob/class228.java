package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("he")
public class class228 {

    @ObfuscatedName("he.i")
    public class227 field3202;

    @ObfuscatedName("he.v")
    public byte[] field3198;

    @ObfuscatedName("he.f")
    public long field3208 = -1L;

    @ObfuscatedName("he.h")
    public int field3206;

    @ObfuscatedName("he.a")
    public byte[] field3201;

    @ObfuscatedName("he.s")
    public long field3207 = -1L;

    @ObfuscatedName("he.p")
    public int field3203 = 0;

    @ObfuscatedName("he.r")
    public long field3204;

    @ObfuscatedName("he.k")
    public long field3205;

    @ObfuscatedName("he.d")
    public long field3197;

    @ObfuscatedName("he.n")
    public long field3200;

    public class228(class227 arg0, int arg1, int arg2) throws IOException {
        this.field3202 = arg0;
        this.field3197 = this.field3205 = arg0.method3815();
        this.field3198 = new byte[arg1];
        this.field3201 = new byte[arg2];
        this.field3204 = 0L;
    }

    @ObfuscatedName("he.i(I)V")
    public void method3832() throws IOException {
        this.method3839();
        this.field3202.method3813();
    }

    @ObfuscatedName("he.v(J)V")
    public void method3836(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field3204 = arg0;
    }

    @ObfuscatedName("he.f(I)J")
    public long method3834() {
        return this.field3197;
    }

    @ObfuscatedName("he.h([BI)V")
    public void method3849(byte[] arg0) throws IOException {
        this.method3835(arg0, 0, arg0.length);
    }

    @ObfuscatedName("he.a([BIII)V")
    public void method3835(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field3207 != -1L && this.field3204 >= this.field3207 && this.field3204 + (long) arg2 <= this.field3207 + (long) this.field3203) {
                System.arraycopy(this.field3201, (int) (this.field3204 - this.field3207), arg0, arg1, arg2);
                this.field3204 += (long) arg2;
                return;
            }
            long var4 = this.field3204;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field3204 >= this.field3208 && this.field3204 < this.field3208 + (long) this.field3206) {
                int var8 = (int) ((long) this.field3206 - (this.field3204 - this.field3208));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field3198, (int) (this.field3204 - this.field3208), arg0, arg1, var8);
                this.field3204 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field3198.length) {
                this.field3202.method3814(this.field3204);
                this.field3200 = this.field3204;
                while (arg2 > 0) {
                    int var9 = this.field3202.method3816(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field3200 += (long) var9;
                    this.field3204 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method3837();
                int var10 = arg2;
                if (arg2 > this.field3206) {
                    var10 = this.field3206;
                }
                System.arraycopy(this.field3198, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field3204 += (long) var10;
            }
            if (this.field3207 != -1L) {
                if (this.field3207 > this.field3204 && arg2 > 0) {
                    int var11 = (int) (this.field3207 - this.field3204) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field3204++;
                    }
                }
                long var12 = -1L;
                long var14 = -1L;
                if (this.field3207 >= var4 && this.field3207 < (long) var7 + var4) {
                    var12 = this.field3207;
                } else if (var4 >= this.field3207 && var4 < this.field3207 + (long) this.field3203) {
                    var12 = var4;
                }
                if (this.field3207 + (long) this.field3203 > var4 && this.field3207 + (long) this.field3203 <= (long) var7 + var4) {
                    var14 = this.field3207 + (long) this.field3203;
                } else if ((long) var7 + var4 > this.field3207 && (long) var7 + var4 <= this.field3207 + (long) this.field3203) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field3201, (int) (var12 - this.field3207), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field3204) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field3204));
                        this.field3204 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field3200 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("he.s(I)V")
    public void method3837() throws IOException {
        this.field3206 = 0;
        if (this.field3204 != this.field3200) {
            this.field3202.method3814(this.field3204);
            this.field3200 = this.field3204;
        }
        this.field3208 = this.field3204;
        while (this.field3206 < this.field3198.length) {
            int var1 = this.field3202.method3816(this.field3198, this.field3206, this.field3198.length - this.field3206);
            if (var1 == -1) {
                break;
            }
            this.field3200 += (long) var1;
            this.field3206 += var1;
        }
    }

    @ObfuscatedName("he.p([BIII)V")
    public void method3845(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field3204 + (long) arg2 > this.field3197) {
                this.field3197 = this.field3204 + (long) arg2;
            }
            if (this.field3207 != -1L && (this.field3204 < this.field3207 || this.field3204 > this.field3207 + (long) this.field3203)) {
                this.method3839();
            }
            if (this.field3207 != -1L && this.field3204 + (long) arg2 > this.field3207 + (long) this.field3201.length) {
                int var4 = (int) ((long) this.field3201.length - (this.field3204 - this.field3207));
                System.arraycopy(arg0, arg1, this.field3201, (int) (this.field3204 - this.field3207), var4);
                this.field3204 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field3203 = this.field3201.length;
                this.method3839();
            }
            if (arg2 > this.field3201.length) {
                if (this.field3204 != this.field3200) {
                    this.field3202.method3814(this.field3204);
                    this.field3200 = this.field3204;
                }
                this.field3202.method3824(arg0, arg1, arg2);
                this.field3200 += (long) arg2;
                if (this.field3200 > this.field3205) {
                    this.field3205 = this.field3200;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field3204 >= this.field3208 && this.field3204 < this.field3208 + (long) this.field3206) {
                    var5 = this.field3204;
                } else if (this.field3208 >= this.field3204 && this.field3208 < this.field3204 + (long) arg2) {
                    var5 = this.field3208;
                }
                if (this.field3204 + (long) arg2 > this.field3208 && this.field3204 + (long) arg2 <= this.field3208 + (long) this.field3206) {
                    var7 = this.field3204 + (long) arg2;
                } else if (this.field3208 + (long) this.field3206 > this.field3204 && this.field3208 + (long) this.field3206 <= this.field3204 + (long) arg2) {
                    var7 = this.field3208 + (long) this.field3206;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field3204), this.field3198, (int) (var5 - this.field3208), var9);
                }
                this.field3204 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field3207 == -1L) {
                    this.field3207 = this.field3204;
                }
                System.arraycopy(arg0, arg1, this.field3201, (int) (this.field3204 - this.field3207), arg2);
                this.field3204 += (long) arg2;
                if (this.field3204 - this.field3207 > (long) this.field3203) {
                    this.field3203 = (int) (this.field3204 - this.field3207);
                }
            }
        } catch (IOException var11) {
            this.field3200 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("he.r(B)V")
    public void method3839() throws IOException {
        if (this.field3207 == -1L) {
            return;
        }
        if (this.field3207 != this.field3200) {
            this.field3202.method3814(this.field3207);
            this.field3200 = this.field3207;
        }
        this.field3202.method3824(this.field3201, 0, this.field3203);
        this.field3200 += (long) (this.field3203 * -1628896087) * -1385832551L;
        if (this.field3200 > this.field3205) {
            this.field3205 = this.field3200;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field3207 >= this.field3208 && this.field3207 < this.field3208 + (long) this.field3206) {
            var1 = this.field3207;
        } else if (this.field3208 >= this.field3207 && this.field3208 < this.field3207 + (long) this.field3203) {
            var1 = this.field3208;
        }
        if (this.field3207 + (long) this.field3203 > this.field3208 && this.field3207 + (long) this.field3203 <= this.field3208 + (long) this.field3206) {
            var3 = this.field3207 + (long) this.field3203;
        } else if (this.field3208 + (long) this.field3206 > this.field3207 && this.field3208 + (long) this.field3206 <= this.field3207 + (long) this.field3203) {
            var3 = this.field3208 + (long) this.field3206;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field3201, (int) (var1 - this.field3207), this.field3198, (int) (var1 - this.field3208), var5);
        }
        this.field3207 = -1L;
        this.field3203 = 0;
    }
}
