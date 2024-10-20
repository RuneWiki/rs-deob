package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("hx")
public class class228 {

    @ObfuscatedName("hx.o")
    public class227 field3202;

    @ObfuscatedName("hx.e")
    public byte[] field3203;

    @ObfuscatedName("hx.u")
    public long field3211 = -1L;

    @ObfuscatedName("hx.b")
    public int field3205;

    @ObfuscatedName("hx.p")
    public byte[] field3204;

    @ObfuscatedName("hx.s")
    public long field3207 = -1L;

    @ObfuscatedName("hx.y")
    public int field3208 = 0;

    @ObfuscatedName("hx.t")
    public long field3209;

    @ObfuscatedName("hx.w")
    public long field3210;

    @ObfuscatedName("hx.h")
    public long field3206;

    @ObfuscatedName("hx.d")
    public long field3212;

    public class228(class227 arg0, int arg1, int arg2) throws IOException {
        this.field3202 = arg0;
        this.field3206 = this.field3210 = arg0.method3867();
        this.field3203 = new byte[arg1];
        this.field3204 = new byte[arg2];
        this.field3209 = 0L;
    }

    @ObfuscatedName("hx.o(I)V")
    public void method3886() throws IOException {
        this.method3893();
        this.field3202.method3866();
    }

    @ObfuscatedName("hx.e(J)V")
    public void method3887(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field3209 = arg0;
    }

    @ObfuscatedName("hx.u(I)J")
    public long method3888() {
        return this.field3206;
    }

    @ObfuscatedName("hx.b([BI)V")
    public void method3908(byte[] arg0) throws IOException {
        this.method3889(arg0, 0, arg0.length);
    }

    @ObfuscatedName("hx.p([BIII)V")
    public void method3889(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field3207 != -1L && this.field3209 >= this.field3207 && this.field3209 + (long) arg2 <= this.field3207 + (long) this.field3208) {
                System.arraycopy(this.field3204, (int) (this.field3209 - this.field3207), arg0, arg1, arg2);
                this.field3209 += (long) arg2;
                return;
            }
            long var4 = this.field3209;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field3209 >= this.field3211 && this.field3209 < this.field3211 + (long) this.field3205) {
                int var8 = (int) ((long) this.field3205 - (this.field3209 - this.field3211));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field3203, (int) (this.field3209 - this.field3211), arg0, arg1, var8);
                this.field3209 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field3203.length) {
                this.field3202.method3882(this.field3209);
                this.field3212 = this.field3209;
                while (arg2 > 0) {
                    int var9 = this.field3202.method3864(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field3212 += (long) var9;
                    this.field3209 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method3890();
                int var10 = arg2;
                if (arg2 > this.field3205) {
                    var10 = this.field3205;
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
                } else if (var4 >= this.field3207 && var4 < this.field3207 + (long) this.field3208) {
                    var12 = var4;
                }
                if (this.field3207 + (long) this.field3208 > var4 && this.field3207 + (long) this.field3208 <= (long) var7 + var4) {
                    var14 = this.field3207 + (long) this.field3208;
                } else if ((long) var7 + var4 > this.field3207 && (long) var7 + var4 <= this.field3207 + (long) this.field3208) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field3204, (int) (var12 - this.field3207), arg0, (int) (var12 - var4) + var6, var16);
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

    @ObfuscatedName("hx.s(I)V")
    public void method3890() throws IOException {
        this.field3205 = 0;
        if (this.field3212 != this.field3209) {
            this.field3202.method3882(this.field3209);
            this.field3212 = this.field3209;
        }
        this.field3211 = this.field3209;
        while (this.field3205 < this.field3203.length) {
            int var1 = this.field3202.method3864(this.field3203, this.field3205, this.field3203.length - this.field3205);
            if (var1 == -1) {
                break;
            }
            this.field3212 += (long) var1;
            this.field3205 += var1;
        }
    }

    @ObfuscatedName("hx.y([BIIB)V")
    public void method3891(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field3209 + (long) arg2 > this.field3206) {
                this.field3206 = this.field3209 + (long) arg2;
            }
            if (this.field3207 != -1L && (this.field3209 < this.field3207 || this.field3209 > this.field3207 + (long) this.field3208)) {
                this.method3893();
            }
            if (this.field3207 != -1L && this.field3209 + (long) arg2 > this.field3207 + (long) this.field3204.length) {
                int var4 = (int) ((long) this.field3204.length - (this.field3209 - this.field3207));
                System.arraycopy(arg0, arg1, this.field3204, (int) (this.field3209 - this.field3207), var4);
                this.field3209 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field3208 = this.field3204.length;
                this.method3893();
            }
            if (arg2 > this.field3204.length) {
                if (this.field3212 != this.field3209) {
                    this.field3202.method3882(this.field3209);
                    this.field3212 = this.field3209;
                }
                this.field3202.method3865(arg0, arg1, arg2);
                this.field3212 += (long) arg2;
                if (this.field3212 > this.field3210) {
                    this.field3210 = this.field3212;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field3209 >= this.field3211 && this.field3209 < this.field3211 + (long) this.field3205) {
                    var5 = this.field3209;
                } else if (this.field3211 >= this.field3209 && this.field3211 < this.field3209 + (long) arg2) {
                    var5 = this.field3211;
                }
                if (this.field3209 + (long) arg2 > this.field3211 && this.field3209 + (long) arg2 <= this.field3211 + (long) this.field3205) {
                    var7 = this.field3209 + (long) arg2;
                } else if (this.field3211 + (long) this.field3205 > this.field3209 && this.field3211 + (long) this.field3205 <= this.field3209 + (long) arg2) {
                    var7 = this.field3211 + (long) this.field3205;
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
                System.arraycopy(arg0, arg1, this.field3204, (int) (this.field3209 - this.field3207), arg2);
                this.field3209 += (long) arg2;
                if (this.field3209 - this.field3207 > (long) this.field3208) {
                    this.field3208 = (int) (this.field3209 - this.field3207);
                }
            }
        } catch (IOException var11) {
            this.field3212 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("hx.t(I)V")
    public void method3893() throws IOException {
        if (this.field3207 == -1L) {
            return;
        }
        if (this.field3212 != this.field3207) {
            this.field3202.method3882(this.field3207);
            this.field3212 = this.field3207;
        }
        this.field3202.method3865(this.field3204, 0, this.field3208);
        this.field3212 += (long) (this.field3208 * 1906185119) * -34715553L;
        if (this.field3212 > this.field3210) {
            this.field3210 = this.field3212;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field3207 >= this.field3211 && this.field3207 < this.field3211 + (long) this.field3205) {
            var1 = this.field3207;
        } else if (this.field3211 >= this.field3207 && this.field3211 < this.field3207 + (long) this.field3208) {
            var1 = this.field3211;
        }
        if (this.field3207 + (long) this.field3208 > this.field3211 && this.field3207 + (long) this.field3208 <= this.field3211 + (long) this.field3205) {
            var3 = this.field3207 + (long) this.field3208;
        } else if (this.field3211 + (long) this.field3205 > this.field3207 && this.field3211 + (long) this.field3205 <= this.field3207 + (long) this.field3208) {
            var3 = this.field3211 + (long) this.field3205;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field3204, (int) (var1 - this.field3207), this.field3203, (int) (var1 - this.field3211), var5);
        }
        this.field3207 = -1L;
        this.field3208 = 0;
    }
}
