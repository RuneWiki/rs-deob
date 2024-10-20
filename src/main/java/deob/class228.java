package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("hi")
public class class228 {

    @ObfuscatedName("hi.i")
    public class227 field3197;

    @ObfuscatedName("hi.v")
    public byte[] field3198;

    @ObfuscatedName("hi.r")
    public long field3199 = -1L;

    @ObfuscatedName("hi.n")
    public int field3200;

    @ObfuscatedName("hi.x")
    public byte[] field3201;

    @ObfuscatedName("hi.q")
    public long field3202 = -1L;

    @ObfuscatedName("hi.h")
    public int field3203 = 0;

    @ObfuscatedName("hi.d")
    public long field3204;

    @ObfuscatedName("hi.c")
    public long field3205;

    @ObfuscatedName("hi.y")
    public long field3206;

    @ObfuscatedName("hi.m")
    public long field3207;

    public class228(class227 arg0, int arg1, int arg2) throws IOException {
        this.field3197 = arg0;
        this.field3206 = this.field3205 = arg0.method3815();
        this.field3198 = new byte[arg1];
        this.field3201 = new byte[arg2];
        this.field3204 = 0L;
    }

    @ObfuscatedName("hi.i(I)V")
    public void method3832() throws IOException {
        this.method3852();
        this.field3197.method3819();
    }

    @ObfuscatedName("hi.v(J)V")
    public void method3841(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field3204 = arg0;
    }

    @ObfuscatedName("hi.r(I)J")
    public long method3834() {
        return this.field3206;
    }

    @ObfuscatedName("hi.n([BI)V")
    public void method3835(byte[] arg0) throws IOException {
        this.method3836(arg0, 0, arg0.length);
    }

    @ObfuscatedName("hi.x([BIII)V")
    public void method3836(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field3202 != -1L && this.field3204 >= this.field3202 && this.field3204 + (long) arg2 <= this.field3202 + (long) this.field3203) {
                System.arraycopy(this.field3201, (int) (this.field3204 - this.field3202), arg0, arg1, arg2);
                this.field3204 += (long) arg2;
                return;
            }
            long var4 = this.field3204;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field3204 >= this.field3199 && this.field3204 < this.field3199 + (long) this.field3200) {
                int var8 = (int) ((long) this.field3200 - (this.field3204 - this.field3199));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field3198, (int) (this.field3204 - this.field3199), arg0, arg1, var8);
                this.field3204 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field3198.length) {
                this.field3197.method3812(this.field3204);
                this.field3207 = this.field3204;
                while (arg2 > 0) {
                    int var9 = this.field3197.method3816(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field3207 += (long) var9;
                    this.field3204 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method3837();
                int var10 = arg2;
                if (arg2 > this.field3200) {
                    var10 = this.field3200;
                }
                System.arraycopy(this.field3198, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field3204 += (long) var10;
            }
            if (this.field3202 != -1L) {
                if (this.field3202 > this.field3204 && arg2 > 0) {
                    int var11 = (int) (this.field3202 - this.field3204) + arg1;
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
                if (this.field3202 >= var4 && this.field3202 < (long) var7 + var4) {
                    var12 = this.field3202;
                } else if (var4 >= this.field3202 && var4 < this.field3202 + (long) this.field3203) {
                    var12 = var4;
                }
                if (this.field3202 + (long) this.field3203 > var4 && this.field3202 + (long) this.field3203 <= (long) var7 + var4) {
                    var14 = this.field3202 + (long) this.field3203;
                } else if ((long) var7 + var4 > this.field3202 && (long) var7 + var4 <= this.field3202 + (long) this.field3203) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field3201, (int) (var12 - this.field3202), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field3204) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field3204));
                        this.field3204 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field3207 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("hi.q(I)V")
    public void method3837() throws IOException {
        this.field3200 = 0;
        if (this.field3207 != this.field3204) {
            this.field3197.method3812(this.field3204);
            this.field3207 = this.field3204;
        }
        this.field3199 = this.field3204;
        while (this.field3200 < this.field3198.length) {
            int var1 = this.field3197.method3816(this.field3198, this.field3200, this.field3198.length - this.field3200);
            if (var1 == -1) {
                break;
            }
            this.field3207 += (long) var1;
            this.field3200 += var1;
        }
    }

    @ObfuscatedName("hi.h([BIII)V")
    public void method3847(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field3204 + (long) arg2 > this.field3206) {
                this.field3206 = this.field3204 + (long) arg2;
            }
            if (this.field3202 != -1L && (this.field3204 < this.field3202 || this.field3204 > this.field3202 + (long) this.field3203)) {
                this.method3852();
            }
            if (this.field3202 != -1L && this.field3204 + (long) arg2 > this.field3202 + (long) this.field3201.length) {
                int var4 = (int) ((long) this.field3201.length - (this.field3204 - this.field3202));
                System.arraycopy(arg0, arg1, this.field3201, (int) (this.field3204 - this.field3202), var4);
                this.field3204 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field3203 = this.field3201.length;
                this.method3852();
            }
            if (arg2 > this.field3201.length) {
                if (this.field3207 != this.field3204) {
                    this.field3197.method3812(this.field3204);
                    this.field3207 = this.field3204;
                }
                this.field3197.method3813(arg0, arg1, arg2);
                this.field3207 += (long) arg2;
                if (this.field3207 > this.field3205) {
                    this.field3205 = this.field3207;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field3204 >= this.field3199 && this.field3204 < this.field3199 + (long) this.field3200) {
                    var5 = this.field3204;
                } else if (this.field3199 >= this.field3204 && this.field3199 < this.field3204 + (long) arg2) {
                    var5 = this.field3199;
                }
                if (this.field3204 + (long) arg2 > this.field3199 && this.field3204 + (long) arg2 <= this.field3199 + (long) this.field3200) {
                    var7 = this.field3204 + (long) arg2;
                } else if (this.field3199 + (long) this.field3200 > this.field3204 && this.field3199 + (long) this.field3200 <= this.field3204 + (long) arg2) {
                    var7 = this.field3199 + (long) this.field3200;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field3204), this.field3198, (int) (var5 - this.field3199), var9);
                }
                this.field3204 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field3202 == -1L) {
                    this.field3202 = this.field3204;
                }
                System.arraycopy(arg0, arg1, this.field3201, (int) (this.field3204 - this.field3202), arg2);
                this.field3204 += (long) arg2;
                if (this.field3204 - this.field3202 > (long) this.field3203) {
                    this.field3203 = (int) (this.field3204 - this.field3202);
                }
            }
        } catch (IOException var11) {
            this.field3207 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("hi.d(I)V")
    public void method3852() throws IOException {
        if (this.field3202 == -1L) {
            return;
        }
        if (this.field3207 != this.field3202) {
            this.field3197.method3812(this.field3202);
            this.field3207 = this.field3202;
        }
        this.field3197.method3813(this.field3201, 0, this.field3203);
        this.field3207 += (long) (this.field3203 * 1564524515) * -434995765L;
        if (this.field3207 > this.field3205) {
            this.field3205 = this.field3207;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field3202 >= this.field3199 && this.field3202 < this.field3199 + (long) this.field3200) {
            var1 = this.field3202;
        } else if (this.field3199 >= this.field3202 && this.field3199 < this.field3202 + (long) this.field3203) {
            var1 = this.field3199;
        }
        if (this.field3202 + (long) this.field3203 > this.field3199 && this.field3202 + (long) this.field3203 <= this.field3199 + (long) this.field3200) {
            var3 = this.field3202 + (long) this.field3203;
        } else if (this.field3199 + (long) this.field3200 > this.field3202 && this.field3199 + (long) this.field3200 <= this.field3202 + (long) this.field3203) {
            var3 = this.field3199 + (long) this.field3200;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field3201, (int) (var1 - this.field3202), this.field3198, (int) (var1 - this.field3199), var5);
        }
        this.field3202 = -1L;
        this.field3203 = 0;
    }
}
