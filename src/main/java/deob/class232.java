package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("ht")
public class class232 {

    @ObfuscatedName("ht.k")
    public class231 field3278;

    @ObfuscatedName("ht.q")
    public byte[] field3268;

    @ObfuscatedName("ht.f")
    public long field3269 = -1L;

    @ObfuscatedName("ht.c")
    public int field3270;

    @ObfuscatedName("ht.v")
    public byte[] field3271;

    @ObfuscatedName("ht.j")
    public long field3272 = -1L;

    @ObfuscatedName("ht.m")
    public int field3267 = 0;

    @ObfuscatedName("ht.y")
    public long field3274;

    @ObfuscatedName("ht.u")
    public long field3275;

    @ObfuscatedName("ht.h")
    public long field3276;

    @ObfuscatedName("ht.l")
    public long field3277;

    public class232(class231 arg0, int arg1, int arg2) throws IOException {
        this.field3278 = arg0;
        this.field3276 = this.field3275 = arg0.method3892();
        this.field3268 = new byte[arg1];
        this.field3271 = new byte[arg2];
        this.field3274 = 0L;
    }

    @ObfuscatedName("ht.k(B)V")
    public void method3922() throws IOException {
        this.method3916();
        this.field3278.method3891();
    }

    @ObfuscatedName("ht.q(J)V")
    public void method3910(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field3274 = arg0;
    }

    @ObfuscatedName("ht.f(I)J")
    public long method3911() {
        return this.field3276;
    }

    @ObfuscatedName("ht.c([BI)V")
    public void method3912(byte[] arg0) throws IOException {
        this.method3934(arg0, 0, arg0.length);
    }

    @ObfuscatedName("ht.v([BIIB)V")
    public void method3934(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field3272 != -1L && this.field3274 >= this.field3272 && this.field3274 + (long) arg2 <= this.field3272 + (long) this.field3267) {
                System.arraycopy(this.field3271, (int) (this.field3274 - this.field3272), arg0, arg1, arg2);
                this.field3274 += (long) arg2;
                return;
            }
            long var4 = this.field3274;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field3274 >= this.field3269 && this.field3274 < this.field3269 + (long) this.field3270) {
                int var8 = (int) ((long) this.field3270 - (this.field3274 - this.field3269));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field3268, (int) (this.field3274 - this.field3269), arg0, arg1, var8);
                this.field3274 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field3268.length) {
                this.field3278.method3889(this.field3274);
                this.field3277 = this.field3274;
                while (arg2 > 0) {
                    int var9 = this.field3278.method3888(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field3277 += (long) var9;
                    this.field3274 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method3914();
                int var10 = arg2;
                if (arg2 > this.field3270) {
                    var10 = this.field3270;
                }
                System.arraycopy(this.field3268, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field3274 += (long) var10;
            }
            if (this.field3272 != -1L) {
                if (this.field3272 > this.field3274 && arg2 > 0) {
                    int var11 = (int) (this.field3272 - this.field3274) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field3274++;
                    }
                }
                long var12 = -1L;
                long var14 = -1L;
                if (this.field3272 >= var4 && this.field3272 < (long) var7 + var4) {
                    var12 = this.field3272;
                } else if (var4 >= this.field3272 && var4 < this.field3272 + (long) this.field3267) {
                    var12 = var4;
                }
                if (this.field3272 + (long) this.field3267 > var4 && this.field3272 + (long) this.field3267 <= (long) var7 + var4) {
                    var14 = this.field3272 + (long) this.field3267;
                } else if ((long) var7 + var4 > this.field3272 && (long) var7 + var4 <= this.field3272 + (long) this.field3267) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field3271, (int) (var12 - this.field3272), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field3274) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field3274));
                        this.field3274 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field3277 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("ht.j(I)V")
    public void method3914() throws IOException {
        this.field3270 = 0;
        if (this.field3277 != this.field3274) {
            this.field3278.method3889(this.field3274);
            this.field3277 = this.field3274;
        }
        this.field3269 = this.field3274;
        while (this.field3270 < this.field3268.length) {
            int var1 = this.field3278.method3888(this.field3268, this.field3270, this.field3268.length - this.field3270);
            if (var1 == -1) {
                break;
            }
            this.field3277 += (long) var1;
            this.field3270 += var1;
        }
    }

    @ObfuscatedName("ht.m([BIII)V")
    public void method3921(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field3274 + (long) arg2 > this.field3276) {
                this.field3276 = this.field3274 + (long) arg2;
            }
            if (this.field3272 != -1L && (this.field3274 < this.field3272 || this.field3274 > this.field3272 + (long) this.field3267)) {
                this.method3916();
            }
            if (this.field3272 != -1L && this.field3274 + (long) arg2 > this.field3272 + (long) this.field3271.length) {
                int var4 = (int) ((long) this.field3271.length - (this.field3274 - this.field3272));
                System.arraycopy(arg0, arg1, this.field3271, (int) (this.field3274 - this.field3272), var4);
                this.field3274 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field3267 = this.field3271.length;
                this.method3916();
            }
            if (arg2 > this.field3271.length) {
                if (this.field3277 != this.field3274) {
                    this.field3278.method3889(this.field3274);
                    this.field3277 = this.field3274;
                }
                this.field3278.method3890(arg0, arg1, arg2);
                this.field3277 += (long) arg2;
                if (this.field3277 > this.field3275) {
                    this.field3275 = this.field3277;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field3274 >= this.field3269 && this.field3274 < this.field3269 + (long) this.field3270) {
                    var5 = this.field3274;
                } else if (this.field3269 >= this.field3274 && this.field3269 < this.field3274 + (long) arg2) {
                    var5 = this.field3269;
                }
                if (this.field3274 + (long) arg2 > this.field3269 && this.field3274 + (long) arg2 <= this.field3269 + (long) this.field3270) {
                    var7 = this.field3274 + (long) arg2;
                } else if (this.field3269 + (long) this.field3270 > this.field3274 && this.field3269 + (long) this.field3270 <= this.field3274 + (long) arg2) {
                    var7 = this.field3269 + (long) this.field3270;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field3274), this.field3268, (int) (var5 - this.field3269), var9);
                }
                this.field3274 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field3272 == -1L) {
                    this.field3272 = this.field3274;
                }
                System.arraycopy(arg0, arg1, this.field3271, (int) (this.field3274 - this.field3272), arg2);
                this.field3274 += (long) arg2;
                if (this.field3274 - this.field3272 > (long) this.field3267) {
                    this.field3267 = (int) (this.field3274 - this.field3272);
                }
            }
        } catch (IOException var11) {
            this.field3277 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("ht.y(I)V")
    public void method3916() throws IOException {
        if (this.field3272 == -1L) {
            return;
        }
        if (this.field3277 != this.field3272) {
            this.field3278.method3889(this.field3272);
            this.field3277 = this.field3272;
        }
        this.field3278.method3890(this.field3271, 0, this.field3267);
        this.field3277 += (long) (this.field3267 * -794642917) * 1606235155L;
        if (this.field3277 > this.field3275) {
            this.field3275 = this.field3277;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field3272 >= this.field3269 && this.field3272 < this.field3269 + (long) this.field3270) {
            var1 = this.field3272;
        } else if (this.field3269 >= this.field3272 && this.field3269 < this.field3272 + (long) this.field3267) {
            var1 = this.field3269;
        }
        if (this.field3272 + (long) this.field3267 > this.field3269 && this.field3272 + (long) this.field3267 <= this.field3269 + (long) this.field3270) {
            var3 = this.field3272 + (long) this.field3267;
        } else if (this.field3269 + (long) this.field3270 > this.field3272 && this.field3269 + (long) this.field3270 <= this.field3272 + (long) this.field3267) {
            var3 = this.field3269 + (long) this.field3270;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field3271, (int) (var1 - this.field3272), this.field3268, (int) (var1 - this.field3269), var5);
        }
        this.field3272 = -1L;
        this.field3267 = 0;
    }
}
