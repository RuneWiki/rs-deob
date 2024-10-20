package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("ho")
public class class232 {

    @ObfuscatedName("ho.m")
    public class231 field3271;

    @ObfuscatedName("ho.w")
    public byte[] field3267;

    @ObfuscatedName("ho.e")
    public long field3268 = -1L;

    @ObfuscatedName("ho.o")
    public int field3269;

    @ObfuscatedName("ho.g")
    public byte[] field3270;

    @ObfuscatedName("ho.l")
    public long field3272 = -1L;

    @ObfuscatedName("ho.j")
    public int field3266 = 0;

    @ObfuscatedName("ho.r")
    public long field3273;

    @ObfuscatedName("ho.x")
    public long field3274;

    @ObfuscatedName("ho.k")
    public long field3275;

    @ObfuscatedName("ho.v")
    public long field3276;

    public class232(class231 arg0, int arg1, int arg2) throws IOException {
        this.field3271 = arg0;
        this.field3275 = this.field3274 = arg0.method3945();
        this.field3267 = new byte[arg1];
        this.field3270 = new byte[arg2];
        this.field3273 = 0L;
    }

    @ObfuscatedName("ho.m(I)V")
    public void method3957() throws IOException {
        this.method3964();
        this.field3271.method3954();
    }

    @ObfuscatedName("ho.w(J)V")
    public void method3958(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field3273 = arg0;
    }

    @ObfuscatedName("ho.e(I)J")
    public long method3959() {
        return this.field3275;
    }

    @ObfuscatedName("ho.o([BI)V")
    public void method3971(byte[] arg0) throws IOException {
        this.method3969(arg0, 0, arg0.length);
    }

    @ObfuscatedName("ho.g([BIIB)V")
    public void method3969(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field3272 != -1L && this.field3273 >= this.field3272 && this.field3273 + (long) arg2 <= this.field3272 + (long) this.field3266) {
                System.arraycopy(this.field3270, (int) (this.field3273 - this.field3272), arg0, arg1, arg2);
                this.field3273 += (long) arg2;
                return;
            }
            long var4 = this.field3273;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field3273 >= this.field3268 && this.field3273 < this.field3268 + (long) this.field3269) {
                int var8 = (int) ((long) this.field3269 - (this.field3273 - this.field3268));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field3267, (int) (this.field3273 - this.field3268), arg0, arg1, var8);
                this.field3273 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field3267.length) {
                this.field3271.method3937(this.field3273);
                this.field3276 = this.field3273;
                while (arg2 > 0) {
                    int var9 = this.field3271.method3941(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field3276 += (long) var9;
                    this.field3273 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method3962();
                int var10 = arg2;
                if (arg2 > this.field3269) {
                    var10 = this.field3269;
                }
                System.arraycopy(this.field3267, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field3273 += (long) var10;
            }
            if (this.field3272 != -1L) {
                if (this.field3272 > this.field3273 && arg2 > 0) {
                    int var11 = (int) (this.field3272 - this.field3273) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field3273++;
                    }
                }
                long var12 = -1L;
                long var14 = -1L;
                if (this.field3272 >= var4 && this.field3272 < (long) var7 + var4) {
                    var12 = this.field3272;
                } else if (var4 >= this.field3272 && var4 < this.field3272 + (long) this.field3266) {
                    var12 = var4;
                }
                if (this.field3272 + (long) this.field3266 > var4 && this.field3272 + (long) this.field3266 <= (long) var7 + var4) {
                    var14 = this.field3272 + (long) this.field3266;
                } else if ((long) var7 + var4 > this.field3272 && (long) var7 + var4 <= this.field3272 + (long) this.field3266) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field3270, (int) (var12 - this.field3272), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field3273) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field3273));
                        this.field3273 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field3276 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("ho.l(I)V")
    public void method3962() throws IOException {
        this.field3269 = 0;
        if (this.field3276 != this.field3273) {
            this.field3271.method3937(this.field3273);
            this.field3276 = this.field3273;
        }
        this.field3268 = this.field3273;
        while (this.field3269 < this.field3267.length) {
            int var1 = this.field3271.method3941(this.field3267, this.field3269, this.field3267.length - this.field3269);
            if (var1 == -1) {
                break;
            }
            this.field3276 += (long) var1;
            this.field3269 += var1;
        }
    }

    @ObfuscatedName("ho.j([BIIB)V")
    public void method3972(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field3273 + (long) arg2 > this.field3275) {
                this.field3275 = this.field3273 + (long) arg2;
            }
            if (this.field3272 != -1L && (this.field3273 < this.field3272 || this.field3273 > this.field3272 + (long) this.field3266)) {
                this.method3964();
            }
            if (this.field3272 != -1L && this.field3273 + (long) arg2 > this.field3272 + (long) this.field3270.length) {
                int var4 = (int) ((long) this.field3270.length - (this.field3273 - this.field3272));
                System.arraycopy(arg0, arg1, this.field3270, (int) (this.field3273 - this.field3272), var4);
                this.field3273 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field3266 = this.field3270.length;
                this.method3964();
            }
            if (arg2 > this.field3270.length) {
                if (this.field3276 != this.field3273) {
                    this.field3271.method3937(this.field3273);
                    this.field3276 = this.field3273;
                }
                this.field3271.method3938(arg0, arg1, arg2);
                this.field3276 += (long) arg2;
                if (this.field3276 > this.field3274) {
                    this.field3274 = this.field3276;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field3273 >= this.field3268 && this.field3273 < this.field3268 + (long) this.field3269) {
                    var5 = this.field3273;
                } else if (this.field3268 >= this.field3273 && this.field3268 < this.field3273 + (long) arg2) {
                    var5 = this.field3268;
                }
                if (this.field3273 + (long) arg2 > this.field3268 && this.field3273 + (long) arg2 <= this.field3268 + (long) this.field3269) {
                    var7 = this.field3273 + (long) arg2;
                } else if (this.field3268 + (long) this.field3269 > this.field3273 && this.field3268 + (long) this.field3269 <= this.field3273 + (long) arg2) {
                    var7 = this.field3268 + (long) this.field3269;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field3273), this.field3267, (int) (var5 - this.field3268), var9);
                }
                this.field3273 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field3272 == -1L) {
                    this.field3272 = this.field3273;
                }
                System.arraycopy(arg0, arg1, this.field3270, (int) (this.field3273 - this.field3272), arg2);
                this.field3273 += (long) arg2;
                if (this.field3273 - this.field3272 > (long) this.field3266) {
                    this.field3266 = (int) (this.field3273 - this.field3272);
                }
            }
        } catch (IOException var11) {
            this.field3276 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("ho.r(I)V")
    public void method3964() throws IOException {
        if (this.field3272 == -1L) {
            return;
        }
        if (this.field3276 != this.field3272) {
            this.field3271.method3937(this.field3272);
            this.field3276 = this.field3272;
        }
        this.field3271.method3938(this.field3270, 0, this.field3266);
        this.field3276 += (long) (this.field3266 * -1318493453) * -30833093L;
        if (this.field3276 > this.field3274) {
            this.field3274 = this.field3276;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field3272 >= this.field3268 && this.field3272 < this.field3268 + (long) this.field3269) {
            var1 = this.field3272;
        } else if (this.field3268 >= this.field3272 && this.field3268 < this.field3272 + (long) this.field3266) {
            var1 = this.field3268;
        }
        if (this.field3272 + (long) this.field3266 > this.field3268 && this.field3272 + (long) this.field3266 <= this.field3268 + (long) this.field3269) {
            var3 = this.field3272 + (long) this.field3266;
        } else if (this.field3268 + (long) this.field3269 > this.field3272 && this.field3268 + (long) this.field3269 <= this.field3272 + (long) this.field3266) {
            var3 = this.field3268 + (long) this.field3269;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field3270, (int) (var1 - this.field3272), this.field3267, (int) (var1 - this.field3268), var5);
        }
        this.field3272 = -1L;
        this.field3266 = 0;
    }
}
