package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("hg")
public class class232 {

    @ObfuscatedName("hg.e")
    public class231 field3269;

    @ObfuscatedName("hg.l")
    public byte[] field3275;

    @ObfuscatedName("hg.c")
    public long field3267 = -1L;

    @ObfuscatedName("hg.h")
    public int field3268;

    @ObfuscatedName("hg.r")
    public byte[] field3271;

    @ObfuscatedName("hg.a")
    public long field3274 = -1L;

    @ObfuscatedName("hg.b")
    public int field3266 = 0;

    @ObfuscatedName("hg.u")
    public long field3272;

    @ObfuscatedName("hg.o")
    public long field3273;

    @ObfuscatedName("hg.p")
    public long field3265;

    @ObfuscatedName("hg.i")
    public long field3270;

    public class232(class231 arg0, int arg1, int arg2) throws IOException {
        this.field3269 = arg0;
        this.field3265 = this.field3273 = arg0.method3963();
        this.field3275 = new byte[arg1];
        this.field3271 = new byte[arg2];
        this.field3272 = 0L;
    }

    @ObfuscatedName("hg.e(I)V")
    public void method3980() throws IOException {
        this.method3987();
        this.field3269.method3962();
    }

    @ObfuscatedName("hg.l(J)V")
    public void method4001(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field3272 = arg0;
    }

    @ObfuscatedName("hg.c(I)J")
    public long method3986() {
        return this.field3265;
    }

    @ObfuscatedName("hg.h([BI)V")
    public void method3983(byte[] arg0) throws IOException {
        this.method3982(arg0, 0, arg0.length);
    }

    @ObfuscatedName("hg.r([BIII)V")
    public void method3982(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field3274 != -1L && this.field3272 >= this.field3274 && this.field3272 + (long) arg2 <= this.field3274 + (long) this.field3266) {
                System.arraycopy(this.field3271, (int) (this.field3272 - this.field3274), arg0, arg1, arg2);
                this.field3272 += (long) arg2;
                return;
            }
            long var4 = this.field3272;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field3272 >= this.field3267 && this.field3272 < this.field3267 + (long) this.field3268) {
                int var8 = (int) ((long) this.field3268 - (this.field3272 - this.field3267));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field3275, (int) (this.field3272 - this.field3267), arg0, arg1, var8);
                this.field3272 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field3275.length) {
                this.field3269.method3960(this.field3272);
                this.field3270 = this.field3272;
                while (arg2 > 0) {
                    int var9 = this.field3269.method3964(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field3270 += (long) var9;
                    this.field3272 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method3985();
                int var10 = arg2;
                if (arg2 > this.field3268) {
                    var10 = this.field3268;
                }
                System.arraycopy(this.field3275, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field3272 += (long) var10;
            }
            if (this.field3274 != -1L) {
                if (this.field3274 > this.field3272 && arg2 > 0) {
                    int var11 = (int) (this.field3274 - this.field3272) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field3272++;
                    }
                }
                long var12 = -1L;
                long var14 = -1L;
                if (this.field3274 >= var4 && this.field3274 < (long) var7 + var4) {
                    var12 = this.field3274;
                } else if (var4 >= this.field3274 && var4 < this.field3274 + (long) this.field3266) {
                    var12 = var4;
                }
                if (this.field3274 + (long) this.field3266 > var4 && this.field3274 + (long) this.field3266 <= (long) var7 + var4) {
                    var14 = this.field3274 + (long) this.field3266;
                } else if ((long) var7 + var4 > this.field3274 && (long) var7 + var4 <= this.field3274 + (long) this.field3266) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field3271, (int) (var12 - this.field3274), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field3272) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field3272));
                        this.field3272 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field3270 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("hg.a(I)V")
    public void method3985() throws IOException {
        this.field3268 = 0;
        if (this.field3272 != this.field3270) {
            this.field3269.method3960(this.field3272);
            this.field3270 = this.field3272;
        }
        this.field3267 = this.field3272;
        while (this.field3268 < this.field3275.length) {
            int var1 = this.field3269.method3964(this.field3275, this.field3268, this.field3275.length - this.field3268);
            if (var1 == -1) {
                break;
            }
            this.field3270 += (long) var1;
            this.field3268 += var1;
        }
    }

    @ObfuscatedName("hg.b([BIII)V")
    public void method4004(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field3272 + (long) arg2 > this.field3265) {
                this.field3265 = this.field3272 + (long) arg2;
            }
            if (this.field3274 != -1L && (this.field3272 < this.field3274 || this.field3272 > this.field3274 + (long) this.field3266)) {
                this.method3987();
            }
            if (this.field3274 != -1L && this.field3272 + (long) arg2 > this.field3274 + (long) this.field3271.length) {
                int var4 = (int) ((long) this.field3271.length - (this.field3272 - this.field3274));
                System.arraycopy(arg0, arg1, this.field3271, (int) (this.field3272 - this.field3274), var4);
                this.field3272 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field3266 = this.field3271.length;
                this.method3987();
            }
            if (arg2 > this.field3271.length) {
                if (this.field3272 != this.field3270) {
                    this.field3269.method3960(this.field3272);
                    this.field3270 = this.field3272;
                }
                this.field3269.method3961(arg0, arg1, arg2);
                this.field3270 += (long) arg2;
                if (this.field3270 > this.field3273) {
                    this.field3273 = this.field3270;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field3272 >= this.field3267 && this.field3272 < this.field3267 + (long) this.field3268) {
                    var5 = this.field3272;
                } else if (this.field3267 >= this.field3272 && this.field3267 < this.field3272 + (long) arg2) {
                    var5 = this.field3267;
                }
                if (this.field3272 + (long) arg2 > this.field3267 && this.field3272 + (long) arg2 <= this.field3267 + (long) this.field3268) {
                    var7 = this.field3272 + (long) arg2;
                } else if (this.field3267 + (long) this.field3268 > this.field3272 && this.field3267 + (long) this.field3268 <= this.field3272 + (long) arg2) {
                    var7 = this.field3267 + (long) this.field3268;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field3272), this.field3275, (int) (var5 - this.field3267), var9);
                }
                this.field3272 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field3274 == -1L) {
                    this.field3274 = this.field3272;
                }
                System.arraycopy(arg0, arg1, this.field3271, (int) (this.field3272 - this.field3274), arg2);
                this.field3272 += (long) arg2;
                if (this.field3272 - this.field3274 > (long) this.field3266) {
                    this.field3266 = (int) (this.field3272 - this.field3274);
                }
            }
        } catch (IOException var11) {
            this.field3270 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("hg.u(I)V")
    public void method3987() throws IOException {
        if (this.field3274 == -1L) {
            return;
        }
        if (this.field3274 != this.field3270) {
            this.field3269.method3960(this.field3274);
            this.field3270 = this.field3274;
        }
        this.field3269.method3961(this.field3271, 0, this.field3266);
        this.field3270 += (long) (this.field3266 * 1325388509) * 371365237L;
        if (this.field3270 > this.field3273) {
            this.field3273 = this.field3270;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field3274 >= this.field3267 && this.field3274 < this.field3267 + (long) this.field3268) {
            var1 = this.field3274;
        } else if (this.field3267 >= this.field3274 && this.field3267 < this.field3274 + (long) this.field3266) {
            var1 = this.field3267;
        }
        if (this.field3274 + (long) this.field3266 > this.field3267 && this.field3274 + (long) this.field3266 <= this.field3267 + (long) this.field3268) {
            var3 = this.field3274 + (long) this.field3266;
        } else if (this.field3267 + (long) this.field3268 > this.field3274 && this.field3267 + (long) this.field3268 <= this.field3274 + (long) this.field3266) {
            var3 = this.field3267 + (long) this.field3268;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field3271, (int) (var1 - this.field3274), this.field3275, (int) (var1 - this.field3267), var5);
        }
        this.field3274 = -1L;
        this.field3266 = 0;
    }
}
