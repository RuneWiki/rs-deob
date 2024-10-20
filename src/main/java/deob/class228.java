package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("hw")
public class class228 {

    @ObfuscatedName("hw.c")
    public class227 field3196;

    @ObfuscatedName("hw.h")
    public byte[] field3195;

    @ObfuscatedName("hw.k")
    public long field3202 = -1L;

    @ObfuscatedName("hw.t")
    public int field3194;

    @ObfuscatedName("hw.g")
    public byte[] field3200;

    @ObfuscatedName("hw.o")
    public long field3199 = -1L;

    @ObfuscatedName("hw.i")
    public int field3197 = 0;

    @ObfuscatedName("hw.w")
    public long field3201;

    @ObfuscatedName("hw.m")
    public long field3198;

    @ObfuscatedName("hw.r")
    public long field3203;

    @ObfuscatedName("hw.y")
    public long field3204;

    public class228(class227 arg0, int arg1, int arg2) throws IOException {
        this.field3196 = arg0;
        this.field3203 = this.field3198 = arg0.method3824();
        this.field3195 = new byte[arg1];
        this.field3200 = new byte[arg2];
        this.field3201 = 0L;
    }

    @ObfuscatedName("hw.c(I)V")
    public void method3841() throws IOException {
        this.method3848();
        this.field3196.method3826();
    }

    @ObfuscatedName("hw.h(J)V")
    public void method3842(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field3201 = arg0;
    }

    @ObfuscatedName("hw.k(B)J")
    public long method3843() {
        return this.field3203;
    }

    @ObfuscatedName("hw.t([BS)V")
    public void method3840(byte[] arg0) throws IOException {
        this.method3865(arg0, 0, arg0.length);
    }

    @ObfuscatedName("hw.g([BIII)V")
    public void method3865(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field3199 != -1L && this.field3201 >= this.field3199 && this.field3201 + (long) arg2 <= this.field3199 + (long) this.field3197) {
                System.arraycopy(this.field3200, (int) (this.field3201 - this.field3199), arg0, arg1, arg2);
                this.field3201 += (long) arg2;
                return;
            }
            long var4 = this.field3201;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field3201 >= this.field3202 && this.field3201 < this.field3202 + (long) this.field3194) {
                int var8 = (int) ((long) this.field3194 - (this.field3201 - this.field3202));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field3195, (int) (this.field3201 - this.field3202), arg0, arg1, var8);
                this.field3201 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field3195.length) {
                this.field3196.method3823(this.field3201);
                this.field3204 = this.field3201;
                while (arg2 > 0) {
                    int var9 = this.field3196.method3827(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field3204 += (long) var9;
                    this.field3201 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method3853();
                int var10 = arg2;
                if (arg2 > this.field3194) {
                    var10 = this.field3194;
                }
                System.arraycopy(this.field3195, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field3201 += (long) var10;
            }
            if (this.field3199 != -1L) {
                if (this.field3199 > this.field3201 && arg2 > 0) {
                    int var11 = (int) (this.field3199 - this.field3201) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field3201++;
                    }
                }
                long var12 = -1L;
                long var14 = -1L;
                if (this.field3199 >= var4 && this.field3199 < (long) var7 + var4) {
                    var12 = this.field3199;
                } else if (var4 >= this.field3199 && var4 < this.field3199 + (long) this.field3197) {
                    var12 = var4;
                }
                if (this.field3199 + (long) this.field3197 > var4 && this.field3199 + (long) this.field3197 <= (long) var7 + var4) {
                    var14 = this.field3199 + (long) this.field3197;
                } else if ((long) var7 + var4 > this.field3199 && (long) var7 + var4 <= this.field3199 + (long) this.field3197) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field3200, (int) (var12 - this.field3199), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field3201) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field3201));
                        this.field3201 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field3204 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("hw.o(I)V")
    public void method3853() throws IOException {
        this.field3194 = 0;
        if (this.field3204 != this.field3201) {
            this.field3196.method3823(this.field3201);
            this.field3204 = this.field3201;
        }
        this.field3202 = this.field3201;
        while (this.field3194 < this.field3195.length) {
            int var1 = this.field3196.method3827(this.field3195, this.field3194, this.field3195.length - this.field3194);
            if (var1 == -1) {
                break;
            }
            this.field3204 += (long) var1;
            this.field3194 += var1;
        }
    }

    @ObfuscatedName("hw.i([BIII)V")
    public void method3847(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field3201 + (long) arg2 > this.field3203) {
                this.field3203 = this.field3201 + (long) arg2;
            }
            if (this.field3199 != -1L && (this.field3201 < this.field3199 || this.field3201 > this.field3199 + (long) this.field3197)) {
                this.method3848();
            }
            if (this.field3199 != -1L && this.field3201 + (long) arg2 > this.field3199 + (long) this.field3200.length) {
                int var4 = (int) ((long) this.field3200.length - (this.field3201 - this.field3199));
                System.arraycopy(arg0, arg1, this.field3200, (int) (this.field3201 - this.field3199), var4);
                this.field3201 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field3197 = this.field3200.length;
                this.method3848();
            }
            if (arg2 > this.field3200.length) {
                if (this.field3204 != this.field3201) {
                    this.field3196.method3823(this.field3201);
                    this.field3204 = this.field3201;
                }
                this.field3196.method3832(arg0, arg1, arg2);
                this.field3204 += (long) arg2;
                if (this.field3204 > this.field3198) {
                    this.field3198 = this.field3204;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field3201 >= this.field3202 && this.field3201 < this.field3202 + (long) this.field3194) {
                    var5 = this.field3201;
                } else if (this.field3202 >= this.field3201 && this.field3202 < this.field3201 + (long) arg2) {
                    var5 = this.field3202;
                }
                if (this.field3201 + (long) arg2 > this.field3202 && this.field3201 + (long) arg2 <= this.field3202 + (long) this.field3194) {
                    var7 = this.field3201 + (long) arg2;
                } else if (this.field3202 + (long) this.field3194 > this.field3201 && this.field3202 + (long) this.field3194 <= this.field3201 + (long) arg2) {
                    var7 = this.field3202 + (long) this.field3194;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field3201), this.field3195, (int) (var5 - this.field3202), var9);
                }
                this.field3201 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field3199 == -1L) {
                    this.field3199 = this.field3201;
                }
                System.arraycopy(arg0, arg1, this.field3200, (int) (this.field3201 - this.field3199), arg2);
                this.field3201 += (long) arg2;
                if (this.field3201 - this.field3199 > (long) this.field3197) {
                    this.field3197 = (int) (this.field3201 - this.field3199);
                }
            }
        } catch (IOException var11) {
            this.field3204 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("hw.w(I)V")
    public void method3848() throws IOException {
        if (this.field3199 == -1L) {
            return;
        }
        if (this.field3204 != this.field3199) {
            this.field3196.method3823(this.field3199);
            this.field3204 = this.field3199;
        }
        this.field3196.method3832(this.field3200, 0, this.field3197);
        this.field3204 += (long) (this.field3197 * -1607811919) * 1816267857L;
        if (this.field3204 > this.field3198) {
            this.field3198 = this.field3204;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field3199 >= this.field3202 && this.field3199 < this.field3202 + (long) this.field3194) {
            var1 = this.field3199;
        } else if (this.field3202 >= this.field3199 && this.field3202 < this.field3199 + (long) this.field3197) {
            var1 = this.field3202;
        }
        if (this.field3199 + (long) this.field3197 > this.field3202 && this.field3199 + (long) this.field3197 <= this.field3202 + (long) this.field3194) {
            var3 = this.field3199 + (long) this.field3197;
        } else if (this.field3202 + (long) this.field3194 > this.field3199 && this.field3202 + (long) this.field3194 <= this.field3199 + (long) this.field3197) {
            var3 = this.field3202 + (long) this.field3194;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field3200, (int) (var1 - this.field3199), this.field3195, (int) (var1 - this.field3202), var5);
        }
        this.field3199 = -1L;
        this.field3197 = 0;
    }
}
