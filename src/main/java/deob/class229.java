package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("ht")
public class class229 {

    @ObfuscatedName("ht.f")
    public class228 field3228;

    @ObfuscatedName("ht.u")
    public byte[] field3230;

    @ObfuscatedName("ht.x")
    public long field3222 = -1L;

    @ObfuscatedName("ht.b")
    public int field3223;

    @ObfuscatedName("ht.l")
    public byte[] field3220;

    @ObfuscatedName("ht.d")
    public long field3224 = -1L;

    @ObfuscatedName("ht.n")
    public int field3226 = 0;

    @ObfuscatedName("ht.m")
    public long field3227;

    @ObfuscatedName("ht.g")
    public long field3221;

    @ObfuscatedName("ht.s")
    public long field3229;

    @ObfuscatedName("ht.r")
    public long field3225;

    public class229(class228 arg0, int arg1, int arg2) throws IOException {
        this.field3228 = arg0;
        this.field3229 = this.field3221 = arg0.method3875();
        this.field3230 = new byte[arg1];
        this.field3220 = new byte[arg2];
        this.field3227 = 0L;
    }

    @ObfuscatedName("ht.f(I)V")
    public void method3904() throws IOException {
        this.method3898();
        this.field3228.method3874();
    }

    @ObfuscatedName("ht.u(J)V")
    public void method3892(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field3227 = arg0;
    }

    @ObfuscatedName("ht.x(I)J")
    public long method3907() {
        return this.field3229;
    }

    @ObfuscatedName("ht.b([BI)V")
    public void method3894(byte[] arg0) throws IOException {
        this.method3895(arg0, 0, arg0.length);
    }

    @ObfuscatedName("ht.l([BIII)V")
    public void method3895(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field3224 != -1L && this.field3227 >= this.field3224 && this.field3227 + (long) arg2 <= this.field3224 + (long) this.field3226) {
                System.arraycopy(this.field3220, (int) (this.field3227 - this.field3224), arg0, arg1, arg2);
                this.field3227 += (long) arg2;
                return;
            }
            long var4 = this.field3227;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field3227 >= this.field3222 && this.field3227 < this.field3222 + (long) this.field3223) {
                int var8 = (int) ((long) this.field3223 - (this.field3227 - this.field3222));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field3230, (int) (this.field3227 - this.field3222), arg0, arg1, var8);
                this.field3227 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field3230.length) {
                this.field3228.method3872(this.field3227);
                this.field3225 = this.field3227;
                while (arg2 > 0) {
                    int var9 = this.field3228.method3871(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field3225 += (long) var9;
                    this.field3227 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method3890();
                int var10 = arg2;
                if (arg2 > this.field3223) {
                    var10 = this.field3223;
                }
                System.arraycopy(this.field3230, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field3227 += (long) var10;
            }
            if (this.field3224 != -1L) {
                if (this.field3224 > this.field3227 && arg2 > 0) {
                    int var11 = (int) (this.field3224 - this.field3227) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field3227++;
                    }
                }
                long var12 = -1L;
                long var14 = -1L;
                if (this.field3224 >= var4 && this.field3224 < (long) var7 + var4) {
                    var12 = this.field3224;
                } else if (var4 >= this.field3224 && var4 < this.field3224 + (long) this.field3226) {
                    var12 = var4;
                }
                if (this.field3224 + (long) this.field3226 > var4 && this.field3224 + (long) this.field3226 <= (long) var7 + var4) {
                    var14 = this.field3224 + (long) this.field3226;
                } else if ((long) var7 + var4 > this.field3224 && (long) var7 + var4 <= this.field3224 + (long) this.field3226) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field3220, (int) (var12 - this.field3224), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field3227) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field3227));
                        this.field3227 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field3225 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("ht.d(I)V")
    public void method3890() throws IOException {
        this.field3223 = 0;
        if (this.field3227 != this.field3225) {
            this.field3228.method3872(this.field3227);
            this.field3225 = this.field3227;
        }
        this.field3222 = this.field3227;
        while (this.field3223 < this.field3230.length) {
            int var1 = this.field3228.method3871(this.field3230, this.field3223, this.field3230.length - this.field3223);
            if (var1 == -1) {
                break;
            }
            this.field3225 += (long) var1;
            this.field3223 += var1;
        }
    }

    @ObfuscatedName("ht.n([BIIB)V")
    public void method3914(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field3227 + (long) arg2 > this.field3229) {
                this.field3229 = this.field3227 + (long) arg2;
            }
            if (this.field3224 != -1L && (this.field3227 < this.field3224 || this.field3227 > this.field3224 + (long) this.field3226)) {
                this.method3898();
            }
            if (this.field3224 != -1L && this.field3227 + (long) arg2 > this.field3224 + (long) this.field3220.length) {
                int var4 = (int) ((long) this.field3220.length - (this.field3227 - this.field3224));
                System.arraycopy(arg0, arg1, this.field3220, (int) (this.field3227 - this.field3224), var4);
                this.field3227 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field3226 = this.field3220.length;
                this.method3898();
            }
            if (arg2 > this.field3220.length) {
                if (this.field3227 != this.field3225) {
                    this.field3228.method3872(this.field3227);
                    this.field3225 = this.field3227;
                }
                this.field3228.method3883(arg0, arg1, arg2);
                this.field3225 += (long) arg2;
                if (this.field3225 > this.field3221) {
                    this.field3221 = this.field3225;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field3227 >= this.field3222 && this.field3227 < this.field3222 + (long) this.field3223) {
                    var5 = this.field3227;
                } else if (this.field3222 >= this.field3227 && this.field3222 < this.field3227 + (long) arg2) {
                    var5 = this.field3222;
                }
                if (this.field3227 + (long) arg2 > this.field3222 && this.field3227 + (long) arg2 <= this.field3222 + (long) this.field3223) {
                    var7 = this.field3227 + (long) arg2;
                } else if (this.field3222 + (long) this.field3223 > this.field3227 && this.field3222 + (long) this.field3223 <= this.field3227 + (long) arg2) {
                    var7 = this.field3222 + (long) this.field3223;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field3227), this.field3230, (int) (var5 - this.field3222), var9);
                }
                this.field3227 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field3224 == -1L) {
                    this.field3224 = this.field3227;
                }
                System.arraycopy(arg0, arg1, this.field3220, (int) (this.field3227 - this.field3224), arg2);
                this.field3227 += (long) arg2;
                if (this.field3227 - this.field3224 > (long) this.field3226) {
                    this.field3226 = (int) (this.field3227 - this.field3224);
                }
            }
        } catch (IOException var11) {
            this.field3225 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("ht.m(B)V")
    public void method3898() throws IOException {
        if (this.field3224 == -1L) {
            return;
        }
        if (this.field3225 != this.field3224) {
            this.field3228.method3872(this.field3224);
            this.field3225 = this.field3224;
        }
        this.field3228.method3883(this.field3220, 0, this.field3226);
        this.field3225 += (long) (this.field3226 * 406496453) * 1643985421L;
        if (this.field3225 > this.field3221) {
            this.field3221 = this.field3225;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field3224 >= this.field3222 && this.field3224 < this.field3222 + (long) this.field3223) {
            var1 = this.field3224;
        } else if (this.field3222 >= this.field3224 && this.field3222 < this.field3224 + (long) this.field3226) {
            var1 = this.field3222;
        }
        if (this.field3224 + (long) this.field3226 > this.field3222 && this.field3224 + (long) this.field3226 <= this.field3222 + (long) this.field3223) {
            var3 = this.field3224 + (long) this.field3226;
        } else if (this.field3222 + (long) this.field3223 > this.field3224 && this.field3222 + (long) this.field3223 <= this.field3224 + (long) this.field3226) {
            var3 = this.field3222 + (long) this.field3223;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field3220, (int) (var1 - this.field3224), this.field3230, (int) (var1 - this.field3222), var5);
        }
        this.field3224 = -1L;
        this.field3226 = 0;
    }
}
