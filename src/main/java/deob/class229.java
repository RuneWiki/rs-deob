package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("hw")
public class class229 {

    @ObfuscatedName("hw.s")
    public class228 field3226;

    @ObfuscatedName("hw.j")
    public byte[] field3220;

    @ObfuscatedName("hw.p")
    public long field3221 = -1L;

    @ObfuscatedName("hw.x")
    public int field3222;

    @ObfuscatedName("hw.d")
    public byte[] field3223;

    @ObfuscatedName("hw.u")
    public long field3224 = -1L;

    @ObfuscatedName("hw.o")
    public int field3225 = 0;

    @ObfuscatedName("hw.b")
    public long field3228;

    @ObfuscatedName("hw.k")
    public long field3230;

    @ObfuscatedName("hw.c")
    public long field3219;

    @ObfuscatedName("hw.l")
    public long field3229;

    public class229(class228 arg0, int arg1, int arg2) throws IOException {
        this.field3226 = arg0;
        this.field3219 = this.field3230 = arg0.method3840();
        this.field3220 = new byte[arg1];
        this.field3223 = new byte[arg2];
        this.field3228 = 0L;
    }

    @ObfuscatedName("hw.s(B)V")
    public void method3859() throws IOException {
        this.method3865();
        this.field3226.method3853();
    }

    @ObfuscatedName("hw.j(J)V")
    public void method3873(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field3228 = arg0;
    }

    @ObfuscatedName("hw.p(I)J")
    public long method3858() {
        return this.field3219;
    }

    @ObfuscatedName("hw.x([BI)V")
    public void method3862(byte[] arg0) throws IOException {
        this.method3863(arg0, 0, arg0.length);
    }

    @ObfuscatedName("hw.d([BIIB)V")
    public void method3863(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field3224 != -1L && this.field3228 >= this.field3224 && this.field3228 + (long) arg2 <= this.field3224 + (long) this.field3225) {
                System.arraycopy(this.field3223, (int) (this.field3228 - this.field3224), arg0, arg1, arg2);
                this.field3228 += (long) arg2;
                return;
            }
            long var4 = this.field3228;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field3228 >= this.field3221 && this.field3228 < this.field3221 + (long) this.field3222) {
                int var8 = (int) ((long) this.field3222 - (this.field3228 - this.field3221));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field3220, (int) (this.field3228 - this.field3221), arg0, arg1, var8);
                this.field3228 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field3220.length) {
                this.field3226.method3837(this.field3228);
                this.field3229 = this.field3228;
                while (arg2 > 0) {
                    int var9 = this.field3226.method3851(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field3229 += (long) var9;
                    this.field3228 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method3864();
                int var10 = arg2;
                if (arg2 > this.field3222) {
                    var10 = this.field3222;
                }
                System.arraycopy(this.field3220, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field3228 += (long) var10;
            }
            if (this.field3224 != -1L) {
                if (this.field3224 > this.field3228 && arg2 > 0) {
                    int var11 = (int) (this.field3224 - this.field3228) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field3228++;
                    }
                }
                long var12 = -1L;
                long var14 = -1L;
                if (this.field3224 >= var4 && this.field3224 < (long) var7 + var4) {
                    var12 = this.field3224;
                } else if (var4 >= this.field3224 && var4 < this.field3224 + (long) this.field3225) {
                    var12 = var4;
                }
                if (this.field3224 + (long) this.field3225 > var4 && this.field3224 + (long) this.field3225 <= (long) var7 + var4) {
                    var14 = this.field3224 + (long) this.field3225;
                } else if ((long) var7 + var4 > this.field3224 && (long) var7 + var4 <= this.field3224 + (long) this.field3225) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field3223, (int) (var12 - this.field3224), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field3228) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field3228));
                        this.field3228 = var14;
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

    @ObfuscatedName("hw.u(B)V")
    public void method3864() throws IOException {
        this.field3222 = 0;
        if (this.field3229 != this.field3228) {
            this.field3226.method3837(this.field3228);
            this.field3229 = this.field3228;
        }
        this.field3221 = this.field3228;
        while (this.field3222 < this.field3220.length) {
            int var1 = this.field3226.method3851(this.field3220, this.field3222, this.field3220.length - this.field3222);
            if (var1 == -1) {
                break;
            }
            this.field3229 += (long) var1;
            this.field3222 += var1;
        }
    }

    @ObfuscatedName("hw.o([BIIB)V")
    public void method3860(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field3228 + (long) arg2 > this.field3219) {
                this.field3219 = this.field3228 + (long) arg2;
            }
            if (this.field3224 != -1L && (this.field3228 < this.field3224 || this.field3228 > this.field3224 + (long) this.field3225)) {
                this.method3865();
            }
            if (this.field3224 != -1L && this.field3228 + (long) arg2 > this.field3224 + (long) this.field3223.length) {
                int var4 = (int) ((long) this.field3223.length - (this.field3228 - this.field3224));
                System.arraycopy(arg0, arg1, this.field3223, (int) (this.field3228 - this.field3224), var4);
                this.field3228 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field3225 = this.field3223.length;
                this.method3865();
            }
            if (arg2 > this.field3223.length) {
                if (this.field3229 != this.field3228) {
                    this.field3226.method3837(this.field3228);
                    this.field3229 = this.field3228;
                }
                this.field3226.method3838(arg0, arg1, arg2);
                this.field3229 += (long) arg2;
                if (this.field3229 > this.field3230) {
                    this.field3230 = this.field3229;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field3228 >= this.field3221 && this.field3228 < this.field3221 + (long) this.field3222) {
                    var5 = this.field3228;
                } else if (this.field3221 >= this.field3228 && this.field3221 < this.field3228 + (long) arg2) {
                    var5 = this.field3221;
                }
                if (this.field3228 + (long) arg2 > this.field3221 && this.field3228 + (long) arg2 <= this.field3221 + (long) this.field3222) {
                    var7 = this.field3228 + (long) arg2;
                } else if (this.field3221 + (long) this.field3222 > this.field3228 && this.field3221 + (long) this.field3222 <= this.field3228 + (long) arg2) {
                    var7 = this.field3221 + (long) this.field3222;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field3228), this.field3220, (int) (var5 - this.field3221), var9);
                }
                this.field3228 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field3224 == -1L) {
                    this.field3224 = this.field3228;
                }
                System.arraycopy(arg0, arg1, this.field3223, (int) (this.field3228 - this.field3224), arg2);
                this.field3228 += (long) arg2;
                if (this.field3228 - this.field3224 > (long) this.field3225) {
                    this.field3225 = (int) (this.field3228 - this.field3224);
                }
            }
        } catch (IOException var11) {
            this.field3229 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("hw.b(I)V")
    public void method3865() throws IOException {
        if (this.field3224 == -1L) {
            return;
        }
        if (this.field3229 != this.field3224) {
            this.field3226.method3837(this.field3224);
            this.field3229 = this.field3224;
        }
        this.field3226.method3838(this.field3223, 0, this.field3225);
        this.field3229 += (long) (this.field3225 * -115202281) * -832864089L;
        if (this.field3229 > this.field3230) {
            this.field3230 = this.field3229;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field3224 >= this.field3221 && this.field3224 < this.field3221 + (long) this.field3222) {
            var1 = this.field3224;
        } else if (this.field3221 >= this.field3224 && this.field3221 < this.field3224 + (long) this.field3225) {
            var1 = this.field3221;
        }
        if (this.field3224 + (long) this.field3225 > this.field3221 && this.field3224 + (long) this.field3225 <= this.field3221 + (long) this.field3222) {
            var3 = this.field3224 + (long) this.field3225;
        } else if (this.field3221 + (long) this.field3222 > this.field3224 && this.field3221 + (long) this.field3222 <= this.field3224 + (long) this.field3225) {
            var3 = this.field3221 + (long) this.field3222;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field3223, (int) (var1 - this.field3224), this.field3220, (int) (var1 - this.field3221), var5);
        }
        this.field3224 = -1L;
        this.field3225 = 0;
    }
}
