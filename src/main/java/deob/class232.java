package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("ho")
public class class232 {

    @ObfuscatedName("ho.s")
    public class231 field3276;

    @ObfuscatedName("ho.z")
    public byte[] field3268;

    @ObfuscatedName("ho.t")
    public long field3269 = -1L;

    @ObfuscatedName("ho.y")
    public int field3267;

    @ObfuscatedName("ho.p")
    public byte[] field3275;

    @ObfuscatedName("ho.g")
    public long field3272 = -1L;

    @ObfuscatedName("ho.m")
    public int field3273 = 0;

    @ObfuscatedName("ho.f")
    public long field3270;

    @ObfuscatedName("ho.k")
    public long field3271;

    @ObfuscatedName("ho.h")
    public long field3274;

    @ObfuscatedName("ho.r")
    public long field3277;

    public class232(class231 arg0, int arg1, int arg2) throws IOException {
        this.field3276 = arg0;
        this.field3274 = this.field3271 = arg0.method3900();
        this.field3268 = new byte[arg1];
        this.field3275 = new byte[arg2];
        this.field3270 = 0L;
    }

    @ObfuscatedName("ho.s(B)V")
    public void method3911() throws IOException {
        this.method3910();
        this.field3276.method3898();
    }

    @ObfuscatedName("ho.z(J)V")
    public void method3912(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field3270 = arg0;
    }

    @ObfuscatedName("ho.t(I)J")
    public long method3913() {
        return this.field3274;
    }

    @ObfuscatedName("ho.y([BI)V")
    public void method3914(byte[] arg0) throws IOException {
        this.method3915(arg0, 0, arg0.length);
    }

    @ObfuscatedName("ho.p([BIII)V")
    public void method3915(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field3272 != -1L && this.field3270 >= this.field3272 && this.field3270 + (long) arg2 <= this.field3272 + (long) this.field3273) {
                System.arraycopy(this.field3275, (int) (this.field3270 - this.field3272), arg0, arg1, arg2);
                this.field3270 += (long) arg2;
                return;
            }
            long var4 = this.field3270;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field3270 >= this.field3269 && this.field3270 < this.field3269 + (long) this.field3267) {
                int var8 = (int) ((long) this.field3267 - (this.field3270 - this.field3269));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field3268, (int) (this.field3270 - this.field3269), arg0, arg1, var8);
                this.field3270 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field3268.length) {
                this.field3276.method3896(this.field3270);
                this.field3277 = this.field3270;
                while (arg2 > 0) {
                    int var9 = this.field3276.method3897(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field3277 += (long) var9;
                    this.field3270 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method3916();
                int var10 = arg2;
                if (arg2 > this.field3267) {
                    var10 = this.field3267;
                }
                System.arraycopy(this.field3268, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field3270 += (long) var10;
            }
            if (this.field3272 != -1L) {
                if (this.field3272 > this.field3270 && arg2 > 0) {
                    int var11 = (int) (this.field3272 - this.field3270) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field3270++;
                    }
                }
                long var12 = -1L;
                long var14 = -1L;
                if (this.field3272 >= var4 && this.field3272 < (long) var7 + var4) {
                    var12 = this.field3272;
                } else if (var4 >= this.field3272 && var4 < this.field3272 + (long) this.field3273) {
                    var12 = var4;
                }
                if (this.field3272 + (long) this.field3273 > var4 && this.field3272 + (long) this.field3273 <= (long) var7 + var4) {
                    var14 = this.field3272 + (long) this.field3273;
                } else if ((long) var7 + var4 > this.field3272 && (long) var7 + var4 <= this.field3272 + (long) this.field3273) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field3275, (int) (var12 - this.field3272), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field3270) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field3270));
                        this.field3270 = var14;
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

    @ObfuscatedName("ho.g(I)V")
    public void method3916() throws IOException {
        this.field3267 = 0;
        if (this.field3277 != this.field3270) {
            this.field3276.method3896(this.field3270);
            this.field3277 = this.field3270;
        }
        this.field3269 = this.field3270;
        while (this.field3267 < this.field3268.length) {
            int var1 = this.field3276.method3897(this.field3268, this.field3267, this.field3268.length - this.field3267);
            if (var1 == -1) {
                break;
            }
            this.field3277 += (long) var1;
            this.field3267 += var1;
        }
    }

    @ObfuscatedName("ho.m([BIIB)V")
    public void method3917(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field3270 + (long) arg2 > this.field3274) {
                this.field3274 = this.field3270 + (long) arg2;
            }
            if (this.field3272 != -1L && (this.field3270 < this.field3272 || this.field3270 > this.field3272 + (long) this.field3273)) {
                this.method3910();
            }
            if (this.field3272 != -1L && this.field3270 + (long) arg2 > this.field3272 + (long) this.field3275.length) {
                int var4 = (int) ((long) this.field3275.length - (this.field3270 - this.field3272));
                System.arraycopy(arg0, arg1, this.field3275, (int) (this.field3270 - this.field3272), var4);
                this.field3270 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field3273 = this.field3275.length;
                this.method3910();
            }
            if (arg2 > this.field3275.length) {
                if (this.field3277 != this.field3270) {
                    this.field3276.method3896(this.field3270);
                    this.field3277 = this.field3270;
                }
                this.field3276.method3894(arg0, arg1, arg2);
                this.field3277 += (long) arg2;
                if (this.field3277 > this.field3271) {
                    this.field3271 = this.field3277;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field3270 >= this.field3269 && this.field3270 < this.field3269 + (long) this.field3267) {
                    var5 = this.field3270;
                } else if (this.field3269 >= this.field3270 && this.field3269 < this.field3270 + (long) arg2) {
                    var5 = this.field3269;
                }
                if (this.field3270 + (long) arg2 > this.field3269 && this.field3270 + (long) arg2 <= this.field3269 + (long) this.field3267) {
                    var7 = this.field3270 + (long) arg2;
                } else if (this.field3269 + (long) this.field3267 > this.field3270 && this.field3269 + (long) this.field3267 <= this.field3270 + (long) arg2) {
                    var7 = this.field3269 + (long) this.field3267;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field3270), this.field3268, (int) (var5 - this.field3269), var9);
                }
                this.field3270 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field3272 == -1L) {
                    this.field3272 = this.field3270;
                }
                System.arraycopy(arg0, arg1, this.field3275, (int) (this.field3270 - this.field3272), arg2);
                this.field3270 += (long) arg2;
                if (this.field3270 - this.field3272 > (long) this.field3273) {
                    this.field3273 = (int) (this.field3270 - this.field3272);
                }
            }
        } catch (IOException var11) {
            this.field3277 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("ho.f(I)V")
    public void method3910() throws IOException {
        if (this.field3272 == -1L) {
            return;
        }
        if (this.field3277 != this.field3272) {
            this.field3276.method3896(this.field3272);
            this.field3277 = this.field3272;
        }
        this.field3276.method3894(this.field3275, 0, this.field3273);
        this.field3277 += (long) (this.field3273 * -239235773) * -279943317L;
        if (this.field3277 > this.field3271) {
            this.field3271 = this.field3277;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field3272 >= this.field3269 && this.field3272 < this.field3269 + (long) this.field3267) {
            var1 = this.field3272;
        } else if (this.field3269 >= this.field3272 && this.field3269 < this.field3272 + (long) this.field3273) {
            var1 = this.field3269;
        }
        if (this.field3272 + (long) this.field3273 > this.field3269 && this.field3272 + (long) this.field3273 <= this.field3269 + (long) this.field3267) {
            var3 = this.field3272 + (long) this.field3273;
        } else if (this.field3269 + (long) this.field3267 > this.field3272 && this.field3269 + (long) this.field3267 <= this.field3272 + (long) this.field3273) {
            var3 = this.field3269 + (long) this.field3267;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field3275, (int) (var1 - this.field3272), this.field3268, (int) (var1 - this.field3269), var5);
        }
        this.field3272 = -1L;
        this.field3273 = 0;
    }
}
