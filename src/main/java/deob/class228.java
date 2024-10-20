package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("hm")
public class class228 {

    @ObfuscatedName("hm.n")
    public class227 field3192;

    @ObfuscatedName("hm.d")
    public byte[] field3191;

    @ObfuscatedName("hm.s")
    public long field3198 = -1L;

    @ObfuscatedName("hm.q")
    public int field3194;

    @ObfuscatedName("hm.j")
    public byte[] field3193;

    @ObfuscatedName("hm.k")
    public long field3195 = -1L;

    @ObfuscatedName("hm.i")
    public int field3197 = 0;

    @ObfuscatedName("hm.m")
    public long field3196;

    @ObfuscatedName("hm.p")
    public long field3199;

    @ObfuscatedName("hm.h")
    public long field3200;

    @ObfuscatedName("hm.e")
    public long field3201;

    public class228(class227 arg0, int arg1, int arg2) throws IOException {
        this.field3192 = arg0;
        this.field3200 = this.field3199 = arg0.method3833();
        this.field3191 = new byte[arg1];
        this.field3193 = new byte[arg2];
        this.field3196 = 0L;
    }

    @ObfuscatedName("hm.n(I)V")
    public void method3847() throws IOException {
        this.method3853();
        this.field3192.method3832();
    }

    @ObfuscatedName("hm.d(J)V")
    public void method3854(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field3196 = arg0;
    }

    @ObfuscatedName("hm.s(I)J")
    public long method3849() {
        return this.field3200;
    }

    @ObfuscatedName("hm.q([BB)V")
    public void method3850(byte[] arg0) throws IOException {
        this.method3851(arg0, 0, arg0.length);
    }

    @ObfuscatedName("hm.j([BIII)V")
    public void method3851(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field3195 != -1L && this.field3196 >= this.field3195 && this.field3196 + (long) arg2 <= this.field3195 + (long) this.field3197) {
                System.arraycopy(this.field3193, (int) (this.field3196 - this.field3195), arg0, arg1, arg2);
                this.field3196 += (long) arg2;
                return;
            }
            long var4 = this.field3196;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field3196 >= this.field3198 && this.field3196 < this.field3198 + (long) this.field3194) {
                int var8 = (int) ((long) this.field3194 - (this.field3196 - this.field3198));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field3191, (int) (this.field3196 - this.field3198), arg0, arg1, var8);
                this.field3196 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field3191.length) {
                this.field3192.method3836(this.field3196);
                this.field3201 = this.field3196;
                while (arg2 > 0) {
                    int var9 = this.field3192.method3835(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field3201 += (long) var9;
                    this.field3196 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method3848();
                int var10 = arg2;
                if (arg2 > this.field3194) {
                    var10 = this.field3194;
                }
                System.arraycopy(this.field3191, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field3196 += (long) var10;
            }
            if (this.field3195 != -1L) {
                if (this.field3195 > this.field3196 && arg2 > 0) {
                    int var11 = (int) (this.field3195 - this.field3196) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field3196++;
                    }
                }
                long var12 = -1L;
                long var14 = -1L;
                if (this.field3195 >= var4 && this.field3195 < (long) var7 + var4) {
                    var12 = this.field3195;
                } else if (var4 >= this.field3195 && var4 < this.field3195 + (long) this.field3197) {
                    var12 = var4;
                }
                if (this.field3195 + (long) this.field3197 > var4 && this.field3195 + (long) this.field3197 <= (long) var7 + var4) {
                    var14 = this.field3195 + (long) this.field3197;
                } else if ((long) var7 + var4 > this.field3195 && (long) var7 + var4 <= this.field3195 + (long) this.field3197) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field3193, (int) (var12 - this.field3195), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field3196) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field3196));
                        this.field3196 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field3201 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("hm.k(I)V")
    public void method3848() throws IOException {
        this.field3194 = 0;
        if (this.field3201 != this.field3196) {
            this.field3192.method3836(this.field3196);
            this.field3201 = this.field3196;
        }
        this.field3198 = this.field3196;
        while (this.field3194 < this.field3191.length) {
            int var1 = this.field3192.method3835(this.field3191, this.field3194, this.field3191.length - this.field3194);
            if (var1 == -1) {
                break;
            }
            this.field3201 += (long) var1;
            this.field3194 += var1;
        }
    }

    @ObfuscatedName("hm.i([BIIB)V")
    public void method3846(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field3196 + (long) arg2 > this.field3200) {
                this.field3200 = this.field3196 + (long) arg2;
            }
            if (this.field3195 != -1L && (this.field3196 < this.field3195 || this.field3196 > this.field3195 + (long) this.field3197)) {
                this.method3853();
            }
            if (this.field3195 != -1L && this.field3196 + (long) arg2 > this.field3195 + (long) this.field3193.length) {
                int var4 = (int) ((long) this.field3193.length - (this.field3196 - this.field3195));
                System.arraycopy(arg0, arg1, this.field3193, (int) (this.field3196 - this.field3195), var4);
                this.field3196 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field3197 = this.field3193.length;
                this.method3853();
            }
            if (arg2 > this.field3193.length) {
                if (this.field3201 != this.field3196) {
                    this.field3192.method3836(this.field3196);
                    this.field3201 = this.field3196;
                }
                this.field3192.method3831(arg0, arg1, arg2);
                this.field3201 += (long) arg2;
                if (this.field3201 > this.field3199) {
                    this.field3199 = this.field3201;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field3196 >= this.field3198 && this.field3196 < this.field3198 + (long) this.field3194) {
                    var5 = this.field3196;
                } else if (this.field3198 >= this.field3196 && this.field3198 < this.field3196 + (long) arg2) {
                    var5 = this.field3198;
                }
                if (this.field3196 + (long) arg2 > this.field3198 && this.field3196 + (long) arg2 <= this.field3198 + (long) this.field3194) {
                    var7 = this.field3196 + (long) arg2;
                } else if (this.field3198 + (long) this.field3194 > this.field3196 && this.field3198 + (long) this.field3194 <= this.field3196 + (long) arg2) {
                    var7 = this.field3198 + (long) this.field3194;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field3196), this.field3191, (int) (var5 - this.field3198), var9);
                }
                this.field3196 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field3195 == -1L) {
                    this.field3195 = this.field3196;
                }
                System.arraycopy(arg0, arg1, this.field3193, (int) (this.field3196 - this.field3195), arg2);
                this.field3196 += (long) arg2;
                if (this.field3196 - this.field3195 > (long) this.field3197) {
                    this.field3197 = (int) (this.field3196 - this.field3195);
                }
            }
        } catch (IOException var11) {
            this.field3201 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("hm.m(I)V")
    public void method3853() throws IOException {
        if (this.field3195 == -1L) {
            return;
        }
        if (this.field3201 != this.field3195) {
            this.field3192.method3836(this.field3195);
            this.field3201 = this.field3195;
        }
        this.field3192.method3831(this.field3193, 0, this.field3197);
        this.field3201 += (long) (this.field3197 * -1660243737) * 380330711L;
        if (this.field3201 > this.field3199) {
            this.field3199 = this.field3201;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field3195 >= this.field3198 && this.field3195 < this.field3198 + (long) this.field3194) {
            var1 = this.field3195;
        } else if (this.field3198 >= this.field3195 && this.field3198 < this.field3195 + (long) this.field3197) {
            var1 = this.field3198;
        }
        if (this.field3195 + (long) this.field3197 > this.field3198 && this.field3195 + (long) this.field3197 <= this.field3198 + (long) this.field3194) {
            var3 = this.field3195 + (long) this.field3197;
        } else if (this.field3198 + (long) this.field3194 > this.field3195 && this.field3198 + (long) this.field3194 <= this.field3195 + (long) this.field3197) {
            var3 = this.field3198 + (long) this.field3194;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field3193, (int) (var1 - this.field3195), this.field3191, (int) (var1 - this.field3198), var5);
        }
        this.field3195 = -1L;
        this.field3197 = 0;
    }
}
