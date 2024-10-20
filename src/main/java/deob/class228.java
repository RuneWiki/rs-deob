package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("hu")
public class class228 {

    @ObfuscatedName("hu.l")
    public class227 field3214;

    @ObfuscatedName("hu.e")
    public byte[] field3211;

    @ObfuscatedName("hu.q")
    public long field3208 = -1L;

    @ObfuscatedName("hu.o")
    public int field3207;

    @ObfuscatedName("hu.g")
    public byte[] field3204;

    @ObfuscatedName("hu.m")
    public long field3209 = -1L;

    @ObfuscatedName("hu.b")
    public int field3210 = 0;

    @ObfuscatedName("hu.p")
    public long field3205;

    @ObfuscatedName("hu.t")
    public long field3212;

    @ObfuscatedName("hu.w")
    public long field3213;

    @ObfuscatedName("hu.x")
    public long field3206;

    public class228(class227 arg0, int arg1, int arg2) throws IOException {
        this.field3214 = arg0;
        this.field3213 = this.field3212 = arg0.method3816();
        this.field3211 = new byte[arg1];
        this.field3204 = new byte[arg2];
        this.field3205 = 0L;
    }

    @ObfuscatedName("hu.l(I)V")
    public void method3835() throws IOException {
        this.method3861();
        this.field3214.method3817();
    }

    @ObfuscatedName("hu.e(J)V")
    public void method3836(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field3205 = arg0;
    }

    @ObfuscatedName("hu.q(I)J")
    public long method3834() {
        return this.field3213;
    }

    @ObfuscatedName("hu.o([BI)V")
    public void method3838(byte[] arg0) throws IOException {
        this.method3839(arg0, 0, arg0.length);
    }

    @ObfuscatedName("hu.g([BIII)V")
    public void method3839(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field3209 != -1L && this.field3205 >= this.field3209 && this.field3205 + (long) arg2 <= this.field3209 + (long) this.field3210) {
                System.arraycopy(this.field3204, (int) (this.field3205 - this.field3209), arg0, arg1, arg2);
                this.field3205 += (long) arg2;
                return;
            }
            long var4 = this.field3205;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field3205 >= this.field3208 && this.field3205 < this.field3208 + (long) this.field3207) {
                int var8 = (int) ((long) this.field3207 - (this.field3205 - this.field3208));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field3211, (int) (this.field3205 - this.field3208), arg0, arg1, var8);
                this.field3205 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field3211.length) {
                this.field3214.method3813(this.field3205);
                this.field3206 = this.field3205;
                while (arg2 > 0) {
                    int var9 = this.field3214.method3812(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field3206 += (long) var9;
                    this.field3205 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method3840();
                int var10 = arg2;
                if (arg2 > this.field3207) {
                    var10 = this.field3207;
                }
                System.arraycopy(this.field3211, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field3205 += (long) var10;
            }
            if (this.field3209 != -1L) {
                if (this.field3209 > this.field3205 && arg2 > 0) {
                    int var11 = (int) (this.field3209 - this.field3205) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field3205++;
                    }
                }
                long var12 = -1L;
                long var14 = -1L;
                if (this.field3209 >= var4 && this.field3209 < (long) var7 + var4) {
                    var12 = this.field3209;
                } else if (var4 >= this.field3209 && var4 < this.field3209 + (long) this.field3210) {
                    var12 = var4;
                }
                if (this.field3209 + (long) this.field3210 > var4 && this.field3209 + (long) this.field3210 <= (long) var7 + var4) {
                    var14 = this.field3209 + (long) this.field3210;
                } else if ((long) var7 + var4 > this.field3209 && (long) var7 + var4 <= this.field3209 + (long) this.field3210) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field3204, (int) (var12 - this.field3209), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field3205) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field3205));
                        this.field3205 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field3206 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("hu.m(I)V")
    public void method3840() throws IOException {
        this.field3207 = 0;
        if (this.field3206 != this.field3205) {
            this.field3214.method3813(this.field3205);
            this.field3206 = this.field3205;
        }
        this.field3208 = this.field3205;
        while (this.field3207 < this.field3211.length) {
            int var1 = this.field3214.method3812(this.field3211, this.field3207, this.field3211.length - this.field3207);
            if (var1 == -1) {
                break;
            }
            this.field3206 += (long) var1;
            this.field3207 += var1;
        }
    }

    @ObfuscatedName("hu.b([BIII)V")
    public void method3841(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field3205 + (long) arg2 > this.field3213) {
                this.field3213 = this.field3205 + (long) arg2;
            }
            if (this.field3209 != -1L && (this.field3205 < this.field3209 || this.field3205 > this.field3209 + (long) this.field3210)) {
                this.method3861();
            }
            if (this.field3209 != -1L && this.field3205 + (long) arg2 > this.field3209 + (long) this.field3204.length) {
                int var4 = (int) ((long) this.field3204.length - (this.field3205 - this.field3209));
                System.arraycopy(arg0, arg1, this.field3204, (int) (this.field3205 - this.field3209), var4);
                this.field3205 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field3210 = this.field3204.length;
                this.method3861();
            }
            if (arg2 > this.field3204.length) {
                if (this.field3206 != this.field3205) {
                    this.field3214.method3813(this.field3205);
                    this.field3206 = this.field3205;
                }
                this.field3214.method3829(arg0, arg1, arg2);
                this.field3206 += (long) arg2;
                if (this.field3206 > this.field3212) {
                    this.field3212 = this.field3206;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field3205 >= this.field3208 && this.field3205 < this.field3208 + (long) this.field3207) {
                    var5 = this.field3205;
                } else if (this.field3208 >= this.field3205 && this.field3208 < this.field3205 + (long) arg2) {
                    var5 = this.field3208;
                }
                if (this.field3205 + (long) arg2 > this.field3208 && this.field3205 + (long) arg2 <= this.field3208 + (long) this.field3207) {
                    var7 = this.field3205 + (long) arg2;
                } else if (this.field3208 + (long) this.field3207 > this.field3205 && this.field3208 + (long) this.field3207 <= this.field3205 + (long) arg2) {
                    var7 = this.field3208 + (long) this.field3207;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field3205), this.field3211, (int) (var5 - this.field3208), var9);
                }
                this.field3205 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field3209 == -1L) {
                    this.field3209 = this.field3205;
                }
                System.arraycopy(arg0, arg1, this.field3204, (int) (this.field3205 - this.field3209), arg2);
                this.field3205 += (long) arg2;
                if (this.field3205 - this.field3209 > (long) this.field3210) {
                    this.field3210 = (int) (this.field3205 - this.field3209);
                }
            }
        } catch (IOException var11) {
            this.field3206 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("hu.p(I)V")
    public void method3861() throws IOException {
        if (this.field3209 == -1L) {
            return;
        }
        if (this.field3209 != this.field3206) {
            this.field3214.method3813(this.field3209);
            this.field3206 = this.field3209;
        }
        this.field3214.method3829(this.field3204, 0, this.field3210);
        this.field3206 += (long) (this.field3210 * -2045577031) * 1077120393L;
        if (this.field3206 > this.field3212) {
            this.field3212 = this.field3206;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field3209 >= this.field3208 && this.field3209 < this.field3208 + (long) this.field3207) {
            var1 = this.field3209;
        } else if (this.field3208 >= this.field3209 && this.field3208 < this.field3209 + (long) this.field3210) {
            var1 = this.field3208;
        }
        if (this.field3209 + (long) this.field3210 > this.field3208 && this.field3209 + (long) this.field3210 <= this.field3208 + (long) this.field3207) {
            var3 = this.field3209 + (long) this.field3210;
        } else if (this.field3208 + (long) this.field3207 > this.field3209 && this.field3208 + (long) this.field3207 <= this.field3209 + (long) this.field3210) {
            var3 = this.field3208 + (long) this.field3207;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field3204, (int) (var1 - this.field3209), this.field3211, (int) (var1 - this.field3208), var5);
        }
        this.field3209 = -1L;
        this.field3210 = 0;
    }
}
