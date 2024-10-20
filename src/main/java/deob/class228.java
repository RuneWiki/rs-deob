package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("hn")
public class class228 {

    @ObfuscatedName("hn.z")
    public class227 field3209;

    @ObfuscatedName("hn.q")
    public byte[] field3210;

    @ObfuscatedName("hn.k")
    public long field3205 = -1L;

    @ObfuscatedName("hn.f")
    public int field3206;

    @ObfuscatedName("hn.d")
    public byte[] field3207;

    @ObfuscatedName("hn.l")
    public long field3208 = -1L;

    @ObfuscatedName("hn.r")
    public int field3204 = 0;

    @ObfuscatedName("hn.g")
    public long field3203;

    @ObfuscatedName("hn.h")
    public long field3211;

    @ObfuscatedName("hn.n")
    public long field3212;

    @ObfuscatedName("hn.j")
    public long field3213;

    public class228(class227 arg0, int arg1, int arg2) throws IOException {
        this.field3209 = arg0;
        this.field3212 = this.field3211 = arg0.method3770();
        this.field3210 = new byte[arg1];
        this.field3207 = new byte[arg2];
        this.field3203 = 0L;
    }

    @ObfuscatedName("hn.z(I)V")
    public void method3784() throws IOException {
        this.method3791();
        this.field3209.method3769();
    }

    @ObfuscatedName("hn.q(J)V")
    public void method3811(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field3203 = arg0;
    }

    @ObfuscatedName("hn.k(I)J")
    public long method3797() {
        return this.field3212;
    }

    @ObfuscatedName("hn.f([BS)V")
    public void method3787(byte[] arg0) throws IOException {
        this.method3808(arg0, 0, arg0.length);
    }

    @ObfuscatedName("hn.d([BIIB)V")
    public void method3808(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field3208 != -1L && this.field3203 >= this.field3208 && this.field3203 + (long) arg2 <= this.field3208 + (long) this.field3204) {
                System.arraycopy(this.field3207, (int) (this.field3203 - this.field3208), arg0, arg1, arg2);
                this.field3203 += (long) arg2;
                return;
            }
            long var4 = this.field3203;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field3203 >= this.field3205 && this.field3203 < this.field3205 + (long) this.field3206) {
                int var8 = (int) ((long) this.field3206 - (this.field3203 - this.field3205));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field3210, (int) (this.field3203 - this.field3205), arg0, arg1, var8);
                this.field3203 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field3210.length) {
                this.field3209.method3766(this.field3203);
                this.field3213 = this.field3203;
                while (arg2 > 0) {
                    int var9 = this.field3209.method3771(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field3213 += (long) var9;
                    this.field3203 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method3789();
                int var10 = arg2;
                if (arg2 > this.field3206) {
                    var10 = this.field3206;
                }
                System.arraycopy(this.field3210, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field3203 += (long) var10;
            }
            if (this.field3208 != -1L) {
                if (this.field3208 > this.field3203 && arg2 > 0) {
                    int var11 = (int) (this.field3208 - this.field3203) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field3203++;
                    }
                }
                long var12 = -1L;
                long var14 = -1L;
                if (this.field3208 >= var4 && this.field3208 < (long) var7 + var4) {
                    var12 = this.field3208;
                } else if (var4 >= this.field3208 && var4 < this.field3208 + (long) this.field3204) {
                    var12 = var4;
                }
                if (this.field3208 + (long) this.field3204 > var4 && this.field3208 + (long) this.field3204 <= (long) var7 + var4) {
                    var14 = this.field3208 + (long) this.field3204;
                } else if ((long) var7 + var4 > this.field3208 && (long) var7 + var4 <= this.field3208 + (long) this.field3204) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field3207, (int) (var12 - this.field3208), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field3203) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field3203));
                        this.field3203 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field3213 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("hn.l(I)V")
    public void method3789() throws IOException {
        this.field3206 = 0;
        if (this.field3213 != this.field3203) {
            this.field3209.method3766(this.field3203);
            this.field3213 = this.field3203;
        }
        this.field3205 = this.field3203;
        while (this.field3206 < this.field3210.length) {
            int var1 = this.field3209.method3771(this.field3210, this.field3206, this.field3210.length - this.field3206);
            if (var1 == -1) {
                break;
            }
            this.field3213 += (long) var1;
            this.field3206 += var1;
        }
    }

    @ObfuscatedName("hn.r([BIII)V")
    public void method3790(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field3203 + (long) arg2 > this.field3212) {
                this.field3212 = this.field3203 + (long) arg2;
            }
            if (this.field3208 != -1L && (this.field3203 < this.field3208 || this.field3203 > this.field3208 + (long) this.field3204)) {
                this.method3791();
            }
            if (this.field3208 != -1L && this.field3203 + (long) arg2 > this.field3208 + (long) this.field3207.length) {
                int var4 = (int) ((long) this.field3207.length - (this.field3203 - this.field3208));
                System.arraycopy(arg0, arg1, this.field3207, (int) (this.field3203 - this.field3208), var4);
                this.field3203 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field3204 = this.field3207.length;
                this.method3791();
            }
            if (arg2 > this.field3207.length) {
                if (this.field3213 != this.field3203) {
                    this.field3209.method3766(this.field3203);
                    this.field3213 = this.field3203;
                }
                this.field3209.method3767(arg0, arg1, arg2);
                this.field3213 += (long) arg2;
                if (this.field3213 > this.field3211) {
                    this.field3211 = this.field3213;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field3203 >= this.field3205 && this.field3203 < this.field3205 + (long) this.field3206) {
                    var5 = this.field3203;
                } else if (this.field3205 >= this.field3203 && this.field3205 < this.field3203 + (long) arg2) {
                    var5 = this.field3205;
                }
                if (this.field3203 + (long) arg2 > this.field3205 && this.field3203 + (long) arg2 <= this.field3205 + (long) this.field3206) {
                    var7 = this.field3203 + (long) arg2;
                } else if (this.field3205 + (long) this.field3206 > this.field3203 && this.field3205 + (long) this.field3206 <= this.field3203 + (long) arg2) {
                    var7 = this.field3205 + (long) this.field3206;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field3203), this.field3210, (int) (var5 - this.field3205), var9);
                }
                this.field3203 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field3208 == -1L) {
                    this.field3208 = this.field3203;
                }
                System.arraycopy(arg0, arg1, this.field3207, (int) (this.field3203 - this.field3208), arg2);
                this.field3203 += (long) arg2;
                if (this.field3203 - this.field3208 > (long) this.field3204) {
                    this.field3204 = (int) (this.field3203 - this.field3208);
                }
            }
        } catch (IOException var11) {
            this.field3213 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("hn.g(I)V")
    public void method3791() throws IOException {
        if (this.field3208 == -1L) {
            return;
        }
        if (this.field3213 != this.field3208) {
            this.field3209.method3766(this.field3208);
            this.field3213 = this.field3208;
        }
        this.field3209.method3767(this.field3207, 0, this.field3204);
        this.field3213 += (long) (this.field3204 * -2016730281) * 611088487L;
        if (this.field3213 > this.field3211) {
            this.field3211 = this.field3213;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field3208 >= this.field3205 && this.field3208 < this.field3205 + (long) this.field3206) {
            var1 = this.field3208;
        } else if (this.field3205 >= this.field3208 && this.field3205 < this.field3208 + (long) this.field3204) {
            var1 = this.field3205;
        }
        if (this.field3208 + (long) this.field3204 > this.field3205 && this.field3208 + (long) this.field3204 <= this.field3205 + (long) this.field3206) {
            var3 = this.field3208 + (long) this.field3204;
        } else if (this.field3205 + (long) this.field3206 > this.field3208 && this.field3205 + (long) this.field3206 <= this.field3208 + (long) this.field3204) {
            var3 = this.field3205 + (long) this.field3206;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field3207, (int) (var1 - this.field3208), this.field3210, (int) (var1 - this.field3205), var5);
        }
        this.field3208 = -1L;
        this.field3204 = 0;
    }
}
