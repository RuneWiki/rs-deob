package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("ht")
public class class229 {

    @ObfuscatedName("ht.e")
    public class228 field3219;

    @ObfuscatedName("ht.w")
    public byte[] field3220;

    @ObfuscatedName("ht.f")
    public long field3221 = -1L;

    @ObfuscatedName("ht.s")
    public int field3225;

    @ObfuscatedName("ht.p")
    public byte[] field3230;

    @ObfuscatedName("ht.h")
    public long field3224 = -1L;

    @ObfuscatedName("ht.g")
    public int field3227 = 0;

    @ObfuscatedName("ht.a")
    public long field3226;

    @ObfuscatedName("ht.r")
    public long field3223;

    @ObfuscatedName("ht.k")
    public long field3228;

    @ObfuscatedName("ht.m")
    public long field3229;

    public class229(class228 arg0, int arg1, int arg2) throws IOException {
        this.field3219 = arg0;
        this.field3228 = this.field3223 = arg0.method3828();
        this.field3220 = new byte[arg1];
        this.field3230 = new byte[arg2];
        this.field3226 = 0L;
    }

    @ObfuscatedName("ht.e(I)V")
    public void method3870() throws IOException {
        this.method3862();
        this.field3219.method3827();
    }

    @ObfuscatedName("ht.w(J)V")
    public void method3848(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field3226 = arg0;
    }

    @ObfuscatedName("ht.f(I)J")
    public long method3849() {
        return this.field3228;
    }

    @ObfuscatedName("ht.s([BI)V")
    public void method3854(byte[] arg0) throws IOException {
        this.method3851(arg0, 0, arg0.length);
    }

    @ObfuscatedName("ht.p([BIII)V")
    public void method3851(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field3224 != -1L && this.field3226 >= this.field3224 && this.field3226 + (long) arg2 <= this.field3224 + (long) this.field3227) {
                System.arraycopy(this.field3230, (int) (this.field3226 - this.field3224), arg0, arg1, arg2);
                this.field3226 += (long) arg2;
                return;
            }
            long var4 = this.field3226;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field3226 >= this.field3221 && this.field3226 < this.field3221 + (long) this.field3225) {
                int var8 = (int) ((long) this.field3225 - (this.field3226 - this.field3221));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field3220, (int) (this.field3226 - this.field3221), arg0, arg1, var8);
                this.field3226 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field3220.length) {
                this.field3219.method3842(this.field3226);
                this.field3229 = this.field3226;
                while (arg2 > 0) {
                    int var9 = this.field3219.method3834(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field3229 += (long) var9;
                    this.field3226 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method3852();
                int var10 = arg2;
                if (arg2 > this.field3225) {
                    var10 = this.field3225;
                }
                System.arraycopy(this.field3220, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field3226 += (long) var10;
            }
            if (this.field3224 != -1L) {
                if (this.field3224 > this.field3226 && arg2 > 0) {
                    int var11 = (int) (this.field3224 - this.field3226) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field3226++;
                    }
                }
                long var12 = -1L;
                long var14 = -1L;
                if (this.field3224 >= var4 && this.field3224 < (long) var7 + var4) {
                    var12 = this.field3224;
                } else if (var4 >= this.field3224 && var4 < this.field3224 + (long) this.field3227) {
                    var12 = var4;
                }
                if (this.field3224 + (long) this.field3227 > var4 && this.field3224 + (long) this.field3227 <= (long) var7 + var4) {
                    var14 = this.field3224 + (long) this.field3227;
                } else if ((long) var7 + var4 > this.field3224 && (long) var7 + var4 <= this.field3224 + (long) this.field3227) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field3230, (int) (var12 - this.field3224), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field3226) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field3226));
                        this.field3226 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field3229 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("ht.h(I)V")
    public void method3852() throws IOException {
        this.field3225 = 0;
        if (this.field3229 != this.field3226) {
            this.field3219.method3842(this.field3226);
            this.field3229 = this.field3226;
        }
        this.field3221 = this.field3226;
        while (this.field3225 < this.field3220.length) {
            int var1 = this.field3219.method3834(this.field3220, this.field3225, this.field3220.length - this.field3225);
            if (var1 == -1) {
                break;
            }
            this.field3229 += (long) var1;
            this.field3225 += var1;
        }
    }

    @ObfuscatedName("ht.g([BIIB)V")
    public void method3850(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field3226 + (long) arg2 > this.field3228) {
                this.field3228 = this.field3226 + (long) arg2;
            }
            if (this.field3224 != -1L && (this.field3226 < this.field3224 || this.field3226 > this.field3224 + (long) this.field3227)) {
                this.method3862();
            }
            if (this.field3224 != -1L && this.field3226 + (long) arg2 > this.field3224 + (long) this.field3230.length) {
                int var4 = (int) ((long) this.field3230.length - (this.field3226 - this.field3224));
                System.arraycopy(arg0, arg1, this.field3230, (int) (this.field3226 - this.field3224), var4);
                this.field3226 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field3227 = this.field3230.length;
                this.method3862();
            }
            if (arg2 > this.field3230.length) {
                if (this.field3229 != this.field3226) {
                    this.field3219.method3842(this.field3226);
                    this.field3229 = this.field3226;
                }
                this.field3219.method3826(arg0, arg1, arg2);
                this.field3229 += (long) arg2;
                if (this.field3229 > this.field3223) {
                    this.field3223 = this.field3229;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field3226 >= this.field3221 && this.field3226 < this.field3221 + (long) this.field3225) {
                    var5 = this.field3226;
                } else if (this.field3221 >= this.field3226 && this.field3221 < this.field3226 + (long) arg2) {
                    var5 = this.field3221;
                }
                if (this.field3226 + (long) arg2 > this.field3221 && this.field3226 + (long) arg2 <= this.field3221 + (long) this.field3225) {
                    var7 = this.field3226 + (long) arg2;
                } else if (this.field3221 + (long) this.field3225 > this.field3226 && this.field3221 + (long) this.field3225 <= this.field3226 + (long) arg2) {
                    var7 = this.field3221 + (long) this.field3225;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field3226), this.field3220, (int) (var5 - this.field3221), var9);
                }
                this.field3226 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field3224 == -1L) {
                    this.field3224 = this.field3226;
                }
                System.arraycopy(arg0, arg1, this.field3230, (int) (this.field3226 - this.field3224), arg2);
                this.field3226 += (long) arg2;
                if (this.field3226 - this.field3224 > (long) this.field3227) {
                    this.field3227 = (int) (this.field3226 - this.field3224);
                }
            }
        } catch (IOException var11) {
            this.field3229 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("ht.a(I)V")
    public void method3862() throws IOException {
        if (this.field3224 == -1L) {
            return;
        }
        if (this.field3229 != this.field3224) {
            this.field3219.method3842(this.field3224);
            this.field3229 = this.field3224;
        }
        this.field3219.method3826(this.field3230, 0, this.field3227);
        this.field3229 += (long) (this.field3227 * 1453202701) * -707069499L;
        if (this.field3229 > this.field3223) {
            this.field3223 = this.field3229;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field3224 >= this.field3221 && this.field3224 < this.field3221 + (long) this.field3225) {
            var1 = this.field3224;
        } else if (this.field3221 >= this.field3224 && this.field3221 < this.field3224 + (long) this.field3227) {
            var1 = this.field3221;
        }
        if (this.field3224 + (long) this.field3227 > this.field3221 && this.field3224 + (long) this.field3227 <= this.field3221 + (long) this.field3225) {
            var3 = this.field3224 + (long) this.field3227;
        } else if (this.field3221 + (long) this.field3225 > this.field3224 && this.field3221 + (long) this.field3225 <= this.field3224 + (long) this.field3227) {
            var3 = this.field3221 + (long) this.field3225;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field3230, (int) (var1 - this.field3224), this.field3220, (int) (var1 - this.field3221), var5);
        }
        this.field3224 = -1L;
        this.field3227 = 0;
    }
}
