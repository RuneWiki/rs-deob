package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("hc")
public class class232 {

    @ObfuscatedName("hc.a")
    public class231 field3275;

    @ObfuscatedName("hc.d")
    public byte[] field3267;

    @ObfuscatedName("hc.v")
    public long field3269 = -1L;

    @ObfuscatedName("hc.r")
    public int field3271;

    @ObfuscatedName("hc.z")
    public byte[] field3270;

    @ObfuscatedName("hc.t")
    public long field3268 = -1L;

    @ObfuscatedName("hc.n")
    public int field3272 = 0;

    @ObfuscatedName("hc.i")
    public long field3273;

    @ObfuscatedName("hc.g")
    public long field3274;

    @ObfuscatedName("hc.m")
    public long field3266;

    @ObfuscatedName("hc.k")
    public long field3276;

    public class232(class231 arg0, int arg1, int arg2) throws IOException {
        this.field3275 = arg0;
        this.field3266 = this.field3274 = arg0.method3937();
        this.field3267 = new byte[arg1];
        this.field3270 = new byte[arg2];
        this.field3273 = 0L;
    }

    @ObfuscatedName("hc.a(I)V")
    public void method3956() throws IOException {
        this.method3962();
        this.field3275.method3954();
    }

    @ObfuscatedName("hc.d(J)V")
    public void method3966(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field3273 = arg0;
    }

    @ObfuscatedName("hc.v(B)J")
    public long method3958() {
        return this.field3266;
    }

    @ObfuscatedName("hc.r([BB)V")
    public void method3957(byte[] arg0) throws IOException {
        this.method3960(arg0, 0, arg0.length);
    }

    @ObfuscatedName("hc.z([BIIB)V")
    public void method3960(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field3268 != -1L && this.field3273 >= this.field3268 && this.field3273 + (long) arg2 <= this.field3268 + (long) this.field3272) {
                System.arraycopy(this.field3270, (int) (this.field3273 - this.field3268), arg0, arg1, arg2);
                this.field3273 += (long) arg2;
                return;
            }
            long var4 = this.field3273;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field3273 >= this.field3269 && this.field3273 < this.field3269 + (long) this.field3271) {
                int var8 = (int) ((long) this.field3271 - (this.field3273 - this.field3269));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field3267, (int) (this.field3273 - this.field3269), arg0, arg1, var8);
                this.field3273 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field3267.length) {
                this.field3275.method3931(this.field3273);
                this.field3276 = this.field3273;
                while (arg2 > 0) {
                    int var9 = this.field3275.method3935(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field3276 += (long) var9;
                    this.field3273 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method3961();
                int var10 = arg2;
                if (arg2 > this.field3271) {
                    var10 = this.field3271;
                }
                System.arraycopy(this.field3267, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field3273 += (long) var10;
            }
            if (this.field3268 != -1L) {
                if (this.field3268 > this.field3273 && arg2 > 0) {
                    int var11 = (int) (this.field3268 - this.field3273) + arg1;
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
                if (this.field3268 >= var4 && this.field3268 < (long) var7 + var4) {
                    var12 = this.field3268;
                } else if (var4 >= this.field3268 && var4 < this.field3268 + (long) this.field3272) {
                    var12 = var4;
                }
                if (this.field3268 + (long) this.field3272 > var4 && this.field3268 + (long) this.field3272 <= (long) var7 + var4) {
                    var14 = this.field3268 + (long) this.field3272;
                } else if ((long) var7 + var4 > this.field3268 && (long) var7 + var4 <= this.field3268 + (long) this.field3272) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field3270, (int) (var12 - this.field3268), arg0, (int) (var12 - var4) + var6, var16);
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

    @ObfuscatedName("hc.t(B)V")
    public void method3961() throws IOException {
        this.field3271 = 0;
        if (this.field3276 != this.field3273) {
            this.field3275.method3931(this.field3273);
            this.field3276 = this.field3273;
        }
        this.field3269 = this.field3273;
        while (this.field3271 < this.field3267.length) {
            int var1 = this.field3275.method3935(this.field3267, this.field3271, this.field3267.length - this.field3271);
            if (var1 == -1) {
                break;
            }
            this.field3276 += (long) var1;
            this.field3271 += var1;
        }
    }

    @ObfuscatedName("hc.n([BIII)V")
    public void method3971(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field3273 + (long) arg2 > this.field3266) {
                this.field3266 = this.field3273 + (long) arg2;
            }
            if (this.field3268 != -1L && (this.field3273 < this.field3268 || this.field3273 > this.field3268 + (long) this.field3272)) {
                this.method3962();
            }
            if (this.field3268 != -1L && this.field3273 + (long) arg2 > this.field3268 + (long) this.field3270.length) {
                int var4 = (int) ((long) this.field3270.length - (this.field3273 - this.field3268));
                System.arraycopy(arg0, arg1, this.field3270, (int) (this.field3273 - this.field3268), var4);
                this.field3273 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field3272 = this.field3270.length;
                this.method3962();
            }
            if (arg2 > this.field3270.length) {
                if (this.field3276 != this.field3273) {
                    this.field3275.method3931(this.field3273);
                    this.field3276 = this.field3273;
                }
                this.field3275.method3932(arg0, arg1, arg2);
                this.field3276 += (long) arg2;
                if (this.field3276 > this.field3274) {
                    this.field3274 = this.field3276;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field3273 >= this.field3269 && this.field3273 < this.field3269 + (long) this.field3271) {
                    var5 = this.field3273;
                } else if (this.field3269 >= this.field3273 && this.field3269 < this.field3273 + (long) arg2) {
                    var5 = this.field3269;
                }
                if (this.field3273 + (long) arg2 > this.field3269 && this.field3273 + (long) arg2 <= this.field3269 + (long) this.field3271) {
                    var7 = this.field3273 + (long) arg2;
                } else if (this.field3269 + (long) this.field3271 > this.field3273 && this.field3269 + (long) this.field3271 <= this.field3273 + (long) arg2) {
                    var7 = this.field3269 + (long) this.field3271;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field3273), this.field3267, (int) (var5 - this.field3269), var9);
                }
                this.field3273 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field3268 == -1L) {
                    this.field3268 = this.field3273;
                }
                System.arraycopy(arg0, arg1, this.field3270, (int) (this.field3273 - this.field3268), arg2);
                this.field3273 += (long) arg2;
                if (this.field3273 - this.field3268 > (long) this.field3272) {
                    this.field3272 = (int) (this.field3273 - this.field3268);
                }
            }
        } catch (IOException var11) {
            this.field3276 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("hc.i(I)V")
    public void method3962() throws IOException {
        if (this.field3268 == -1L) {
            return;
        }
        if (this.field3276 != this.field3268) {
            this.field3275.method3931(this.field3268);
            this.field3276 = this.field3268;
        }
        this.field3275.method3932(this.field3270, 0, this.field3272);
        this.field3276 += (long) (this.field3272 * -966409997) * 690182203L;
        if (this.field3276 > this.field3274) {
            this.field3274 = this.field3276;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field3268 >= this.field3269 && this.field3268 < this.field3269 + (long) this.field3271) {
            var1 = this.field3268;
        } else if (this.field3269 >= this.field3268 && this.field3269 < this.field3268 + (long) this.field3272) {
            var1 = this.field3269;
        }
        if (this.field3268 + (long) this.field3272 > this.field3269 && this.field3268 + (long) this.field3272 <= this.field3269 + (long) this.field3271) {
            var3 = this.field3268 + (long) this.field3272;
        } else if (this.field3269 + (long) this.field3271 > this.field3268 && this.field3269 + (long) this.field3271 <= this.field3268 + (long) this.field3272) {
            var3 = this.field3269 + (long) this.field3271;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field3270, (int) (var1 - this.field3268), this.field3267, (int) (var1 - this.field3269), var5);
        }
        this.field3268 = -1L;
        this.field3272 = 0;
    }
}
