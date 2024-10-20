package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("hl")
public class class228 {

    @ObfuscatedName("hl.h")
    public class227 field3200;

    @ObfuscatedName("hl.m")
    public byte[] field3194;

    @ObfuscatedName("hl.i")
    public long field3195 = -1L;

    @ObfuscatedName("hl.q")
    public int field3196;

    @ObfuscatedName("hl.p")
    public byte[] field3197;

    @ObfuscatedName("hl.c")
    public long field3198 = -1L;

    @ObfuscatedName("hl.f")
    public int field3199 = 0;

    @ObfuscatedName("hl.y")
    public long field3204;

    @ObfuscatedName("hl.w")
    public long field3201;

    @ObfuscatedName("hl.l")
    public long field3202;

    @ObfuscatedName("hl.v")
    public long field3203;

    public class228(class227 arg0, int arg1, int arg2) throws IOException {
        this.field3200 = arg0;
        this.field3202 = this.field3201 = arg0.method3819();
        this.field3194 = new byte[arg1];
        this.field3197 = new byte[arg2];
        this.field3204 = 0L;
    }

    @ObfuscatedName("hl.h(I)V")
    public void method3842() throws IOException {
        this.method3849();
        this.field3200.method3822();
    }

    @ObfuscatedName("hl.m(J)V")
    public void method3839(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field3204 = arg0;
    }

    @ObfuscatedName("hl.i(S)J")
    public long method3837() {
        return this.field3202;
    }

    @ObfuscatedName("hl.q([BI)V")
    public void method3838(byte[] arg0) throws IOException {
        this.method3861(arg0, 0, arg0.length);
    }

    @ObfuscatedName("hl.p([BIII)V")
    public void method3861(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field3198 != -1L && this.field3204 >= this.field3198 && this.field3204 + (long) arg2 <= this.field3198 + (long) this.field3199) {
                System.arraycopy(this.field3197, (int) (this.field3204 - this.field3198), arg0, arg1, arg2);
                this.field3204 += (long) arg2;
                return;
            }
            long var4 = this.field3204;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field3204 >= this.field3195 && this.field3204 < this.field3195 + (long) this.field3196) {
                int var8 = (int) ((long) this.field3196 - (this.field3204 - this.field3195));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field3194, (int) (this.field3204 - this.field3195), arg0, arg1, var8);
                this.field3204 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field3194.length) {
                this.field3200.method3829(this.field3204);
                this.field3203 = this.field3204;
                while (arg2 > 0) {
                    int var9 = this.field3200.method3820(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field3203 += (long) var9;
                    this.field3204 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method3836();
                int var10 = arg2;
                if (arg2 > this.field3196) {
                    var10 = this.field3196;
                }
                System.arraycopy(this.field3194, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field3204 += (long) var10;
            }
            if (this.field3198 != -1L) {
                if (this.field3198 > this.field3204 && arg2 > 0) {
                    int var11 = (int) (this.field3198 - this.field3204) + arg1;
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
                if (this.field3198 >= var4 && this.field3198 < (long) var7 + var4) {
                    var12 = this.field3198;
                } else if (var4 >= this.field3198 && var4 < this.field3198 + (long) this.field3199) {
                    var12 = var4;
                }
                if (this.field3198 + (long) this.field3199 > var4 && this.field3198 + (long) this.field3199 <= (long) var7 + var4) {
                    var14 = this.field3198 + (long) this.field3199;
                } else if ((long) var7 + var4 > this.field3198 && (long) var7 + var4 <= this.field3198 + (long) this.field3199) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field3197, (int) (var12 - this.field3198), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field3204) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field3204));
                        this.field3204 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field3203 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("hl.c(B)V")
    public void method3836() throws IOException {
        this.field3196 = 0;
        if (this.field3204 != this.field3203) {
            this.field3200.method3829(this.field3204);
            this.field3203 = this.field3204;
        }
        this.field3195 = this.field3204;
        while (this.field3196 < this.field3194.length) {
            int var1 = this.field3200.method3820(this.field3194, this.field3196, this.field3194.length - this.field3196);
            if (var1 == -1) {
                break;
            }
            this.field3203 += (long) var1;
            this.field3196 += var1;
        }
    }

    @ObfuscatedName("hl.f([BIII)V")
    public void method3841(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field3204 + (long) arg2 > this.field3202) {
                this.field3202 = this.field3204 + (long) arg2;
            }
            if (this.field3198 != -1L && (this.field3204 < this.field3198 || this.field3204 > this.field3198 + (long) this.field3199)) {
                this.method3849();
            }
            if (this.field3198 != -1L && this.field3204 + (long) arg2 > this.field3198 + (long) this.field3197.length) {
                int var4 = (int) ((long) this.field3197.length - (this.field3204 - this.field3198));
                System.arraycopy(arg0, arg1, this.field3197, (int) (this.field3204 - this.field3198), var4);
                this.field3204 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field3199 = this.field3197.length;
                this.method3849();
            }
            if (arg2 > this.field3197.length) {
                if (this.field3204 != this.field3203) {
                    this.field3200.method3829(this.field3204);
                    this.field3203 = this.field3204;
                }
                this.field3200.method3817(arg0, arg1, arg2);
                this.field3203 += (long) arg2;
                if (this.field3203 > this.field3201) {
                    this.field3201 = this.field3203;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field3204 >= this.field3195 && this.field3204 < this.field3195 + (long) this.field3196) {
                    var5 = this.field3204;
                } else if (this.field3195 >= this.field3204 && this.field3195 < this.field3204 + (long) arg2) {
                    var5 = this.field3195;
                }
                if (this.field3204 + (long) arg2 > this.field3195 && this.field3204 + (long) arg2 <= this.field3195 + (long) this.field3196) {
                    var7 = this.field3204 + (long) arg2;
                } else if (this.field3195 + (long) this.field3196 > this.field3204 && this.field3195 + (long) this.field3196 <= this.field3204 + (long) arg2) {
                    var7 = this.field3195 + (long) this.field3196;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field3204), this.field3194, (int) (var5 - this.field3195), var9);
                }
                this.field3204 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field3198 == -1L) {
                    this.field3198 = this.field3204;
                }
                System.arraycopy(arg0, arg1, this.field3197, (int) (this.field3204 - this.field3198), arg2);
                this.field3204 += (long) arg2;
                if (this.field3204 - this.field3198 > (long) this.field3199) {
                    this.field3199 = (int) (this.field3204 - this.field3198);
                }
            }
        } catch (IOException var11) {
            this.field3203 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("hl.y(I)V")
    public void method3849() throws IOException {
        if (this.field3198 == -1L) {
            return;
        }
        if (this.field3203 != this.field3198) {
            this.field3200.method3829(this.field3198);
            this.field3203 = this.field3198;
        }
        this.field3200.method3817(this.field3197, 0, this.field3199);
        this.field3203 += (long) (this.field3199 * 1789830169) * 964458537L;
        if (this.field3203 > this.field3201) {
            this.field3201 = this.field3203;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field3198 >= this.field3195 && this.field3198 < this.field3195 + (long) this.field3196) {
            var1 = this.field3198;
        } else if (this.field3195 >= this.field3198 && this.field3195 < this.field3198 + (long) this.field3199) {
            var1 = this.field3195;
        }
        if (this.field3198 + (long) this.field3199 > this.field3195 && this.field3198 + (long) this.field3199 <= this.field3195 + (long) this.field3196) {
            var3 = this.field3198 + (long) this.field3199;
        } else if (this.field3195 + (long) this.field3196 > this.field3198 && this.field3195 + (long) this.field3196 <= this.field3198 + (long) this.field3199) {
            var3 = this.field3195 + (long) this.field3196;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field3197, (int) (var1 - this.field3198), this.field3194, (int) (var1 - this.field3195), var5);
        }
        this.field3198 = -1L;
        this.field3199 = 0;
    }
}
