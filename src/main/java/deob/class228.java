package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("hx")
public class class228 {

    @ObfuscatedName("hx.h")
    public class227 field3206;

    @ObfuscatedName("hx.q")
    public byte[] field3198;

    @ObfuscatedName("hx.v")
    public long field3199 = -1L;

    @ObfuscatedName("hx.n")
    public int field3207;

    @ObfuscatedName("hx.f")
    public byte[] field3201;

    @ObfuscatedName("hx.g")
    public long field3202 = -1L;

    @ObfuscatedName("hx.o")
    public int field3203 = 0;

    @ObfuscatedName("hx.s")
    public long field3200;

    @ObfuscatedName("hx.k")
    public long field3205;

    @ObfuscatedName("hx.b")
    public long field3197;

    @ObfuscatedName("hx.c")
    public long field3204;

    public class228(class227 arg0, int arg1, int arg2) throws IOException {
        this.field3206 = arg0;
        this.field3197 = this.field3205 = arg0.method3910();
        this.field3198 = new byte[arg1];
        this.field3201 = new byte[arg2];
        this.field3200 = 0L;
    }

    @ObfuscatedName("hx.h(B)V")
    public void method3930() throws IOException {
        this.method3936();
        this.field3206.method3909();
    }

    @ObfuscatedName("hx.q(J)V")
    public void method3954(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field3200 = arg0;
    }

    @ObfuscatedName("hx.v(I)J")
    public long method3931() {
        return this.field3197;
    }

    @ObfuscatedName("hx.n([BB)V")
    public void method3932(byte[] arg0) throws IOException {
        this.method3929(arg0, 0, arg0.length);
    }

    @ObfuscatedName("hx.f([BIII)V")
    public void method3929(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field3202 != -1L && this.field3200 >= this.field3202 && this.field3200 + (long) arg2 <= this.field3202 + (long) this.field3203) {
                System.arraycopy(this.field3201, (int) (this.field3200 - this.field3202), arg0, arg1, arg2);
                this.field3200 += (long) arg2;
                return;
            }
            long var4 = this.field3200;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field3200 >= this.field3199 && this.field3200 < this.field3199 + (long) this.field3207) {
                int var8 = (int) ((long) this.field3207 - (this.field3200 - this.field3199));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field3198, (int) (this.field3200 - this.field3199), arg0, arg1, var8);
                this.field3200 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field3198.length) {
                this.field3206.method3907(this.field3200);
                this.field3204 = this.field3200;
                while (arg2 > 0) {
                    int var9 = this.field3206.method3915(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field3204 += (long) var9;
                    this.field3200 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method3934();
                int var10 = arg2;
                if (arg2 > this.field3207) {
                    var10 = this.field3207;
                }
                System.arraycopy(this.field3198, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field3200 += (long) var10;
            }
            if (this.field3202 != -1L) {
                if (this.field3202 > this.field3200 && arg2 > 0) {
                    int var11 = (int) (this.field3202 - this.field3200) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field3200++;
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
                    if (var14 > this.field3200) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field3200));
                        this.field3200 = var14;
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

    @ObfuscatedName("hx.g(I)V")
    public void method3934() throws IOException {
        this.field3207 = 0;
        if (this.field3204 != this.field3200) {
            this.field3206.method3907(this.field3200);
            this.field3204 = this.field3200;
        }
        this.field3199 = this.field3200;
        while (this.field3207 < this.field3198.length) {
            int var1 = this.field3206.method3915(this.field3198, this.field3207, this.field3198.length - this.field3207);
            if (var1 == -1) {
                break;
            }
            this.field3204 += (long) var1;
            this.field3207 += var1;
        }
    }

    @ObfuscatedName("hx.o([BIII)V")
    public void method3940(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field3200 + (long) arg2 > this.field3197) {
                this.field3197 = this.field3200 + (long) arg2;
            }
            if (this.field3202 != -1L && (this.field3200 < this.field3202 || this.field3200 > this.field3202 + (long) this.field3203)) {
                this.method3936();
            }
            if (this.field3202 != -1L && this.field3200 + (long) arg2 > this.field3202 + (long) this.field3201.length) {
                int var4 = (int) ((long) this.field3201.length - (this.field3200 - this.field3202));
                System.arraycopy(arg0, arg1, this.field3201, (int) (this.field3200 - this.field3202), var4);
                this.field3200 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field3203 = this.field3201.length;
                this.method3936();
            }
            if (arg2 > this.field3201.length) {
                if (this.field3204 != this.field3200) {
                    this.field3206.method3907(this.field3200);
                    this.field3204 = this.field3200;
                }
                this.field3206.method3917(arg0, arg1, arg2);
                this.field3204 += (long) arg2;
                if (this.field3204 > this.field3205) {
                    this.field3205 = this.field3204;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field3200 >= this.field3199 && this.field3200 < this.field3199 + (long) this.field3207) {
                    var5 = this.field3200;
                } else if (this.field3199 >= this.field3200 && this.field3199 < this.field3200 + (long) arg2) {
                    var5 = this.field3199;
                }
                if (this.field3200 + (long) arg2 > this.field3199 && this.field3200 + (long) arg2 <= this.field3199 + (long) this.field3207) {
                    var7 = this.field3200 + (long) arg2;
                } else if (this.field3199 + (long) this.field3207 > this.field3200 && this.field3199 + (long) this.field3207 <= this.field3200 + (long) arg2) {
                    var7 = this.field3199 + (long) this.field3207;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field3200), this.field3198, (int) (var5 - this.field3199), var9);
                }
                this.field3200 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field3202 == -1L) {
                    this.field3202 = this.field3200;
                }
                System.arraycopy(arg0, arg1, this.field3201, (int) (this.field3200 - this.field3202), arg2);
                this.field3200 += (long) arg2;
                if (this.field3200 - this.field3202 > (long) this.field3203) {
                    this.field3203 = (int) (this.field3200 - this.field3202);
                }
            }
        } catch (IOException var11) {
            this.field3204 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("hx.s(I)V")
    public void method3936() throws IOException {
        if (this.field3202 == -1L) {
            return;
        }
        if (this.field3204 != this.field3202) {
            this.field3206.method3907(this.field3202);
            this.field3204 = this.field3202;
        }
        this.field3206.method3917(this.field3201, 0, this.field3203);
        this.field3204 += (long) (this.field3203 * 723209225) * 1790181945L;
        if (this.field3204 > this.field3205) {
            this.field3205 = this.field3204;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field3202 >= this.field3199 && this.field3202 < this.field3199 + (long) this.field3207) {
            var1 = this.field3202;
        } else if (this.field3199 >= this.field3202 && this.field3199 < this.field3202 + (long) this.field3203) {
            var1 = this.field3199;
        }
        if (this.field3202 + (long) this.field3203 > this.field3199 && this.field3202 + (long) this.field3203 <= this.field3199 + (long) this.field3207) {
            var3 = this.field3202 + (long) this.field3203;
        } else if (this.field3199 + (long) this.field3207 > this.field3202 && this.field3199 + (long) this.field3207 <= this.field3202 + (long) this.field3203) {
            var3 = this.field3199 + (long) this.field3207;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field3201, (int) (var1 - this.field3202), this.field3198, (int) (var1 - this.field3199), var5);
        }
        this.field3202 = -1L;
        this.field3203 = 0;
    }
}
