package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("hc")
public class class229 {

    @ObfuscatedName("hc.t")
    public class228 field3224;

    @ObfuscatedName("hc.i")
    public byte[] field3222;

    @ObfuscatedName("hc.g")
    public long field3223 = -1L;

    @ObfuscatedName("hc.h")
    public int field3227;

    @ObfuscatedName("hc.z")
    public byte[] field3225;

    @ObfuscatedName("hc.r")
    public long field3226 = -1L;

    @ObfuscatedName("hc.f")
    public int field3221 = 0;

    @ObfuscatedName("hc.s")
    public long field3228;

    @ObfuscatedName("hc.d")
    public long field3229;

    @ObfuscatedName("hc.l")
    public long field3230;

    @ObfuscatedName("hc.y")
    public long field3231;

    public class229(class228 arg0, int arg1, int arg2) throws IOException {
        this.field3224 = arg0;
        this.field3230 = this.field3229 = arg0.method3804();
        this.field3222 = new byte[arg1];
        this.field3225 = new byte[arg2];
        this.field3228 = 0L;
    }

    @ObfuscatedName("hc.t(I)V")
    public void method3824() throws IOException {
        this.method3828();
        this.field3224.method3803();
    }

    @ObfuscatedName("hc.i(J)V")
    public void method3825(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field3228 = arg0;
    }

    @ObfuscatedName("hc.g(B)J")
    public long method3826() {
        return this.field3230;
    }

    @ObfuscatedName("hc.h([BI)V")
    public void method3827(byte[] arg0) throws IOException {
        this.method3833(arg0, 0, arg0.length);
    }

    @ObfuscatedName("hc.z([BIII)V")
    public void method3833(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field3226 != -1L && this.field3228 >= this.field3226 && this.field3228 + (long) arg2 <= this.field3226 + (long) this.field3221) {
                System.arraycopy(this.field3225, (int) (this.field3228 - this.field3226), arg0, arg1, arg2);
                this.field3228 += (long) arg2;
                return;
            }
            long var4 = this.field3228;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field3228 >= this.field3223 && this.field3228 < this.field3223 + (long) this.field3227) {
                int var8 = (int) ((long) this.field3227 - (this.field3228 - this.field3223));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field3222, (int) (this.field3228 - this.field3223), arg0, arg1, var8);
                this.field3228 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field3222.length) {
                this.field3224.method3801(this.field3228);
                this.field3231 = this.field3228;
                while (arg2 > 0) {
                    int var9 = this.field3224.method3815(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field3231 += (long) var9;
                    this.field3228 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method3829();
                int var10 = arg2;
                if (arg2 > this.field3227) {
                    var10 = this.field3227;
                }
                System.arraycopy(this.field3222, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field3228 += (long) var10;
            }
            if (this.field3226 != -1L) {
                if (this.field3226 > this.field3228 && arg2 > 0) {
                    int var11 = (int) (this.field3226 - this.field3228) + arg1;
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
                if (this.field3226 >= var4 && this.field3226 < (long) var7 + var4) {
                    var12 = this.field3226;
                } else if (var4 >= this.field3226 && var4 < this.field3226 + (long) this.field3221) {
                    var12 = var4;
                }
                if (this.field3226 + (long) this.field3221 > var4 && this.field3226 + (long) this.field3221 <= (long) var7 + var4) {
                    var14 = this.field3226 + (long) this.field3221;
                } else if ((long) var7 + var4 > this.field3226 && (long) var7 + var4 <= this.field3226 + (long) this.field3221) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field3225, (int) (var12 - this.field3226), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field3228) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field3228));
                        this.field3228 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field3231 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("hc.r(I)V")
    public void method3829() throws IOException {
        this.field3227 = 0;
        if (this.field3231 != this.field3228) {
            this.field3224.method3801(this.field3228);
            this.field3231 = this.field3228;
        }
        this.field3223 = this.field3228;
        while (this.field3227 < this.field3222.length) {
            int var1 = this.field3224.method3815(this.field3222, this.field3227, this.field3222.length - this.field3227);
            if (var1 == -1) {
                break;
            }
            this.field3231 += (long) var1;
            this.field3227 += var1;
        }
    }

    @ObfuscatedName("hc.f([BIIS)V")
    public void method3842(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field3228 + (long) arg2 > this.field3230) {
                this.field3230 = this.field3228 + (long) arg2;
            }
            if (this.field3226 != -1L && (this.field3228 < this.field3226 || this.field3228 > this.field3226 + (long) this.field3221)) {
                this.method3828();
            }
            if (this.field3226 != -1L && this.field3228 + (long) arg2 > this.field3226 + (long) this.field3225.length) {
                int var4 = (int) ((long) this.field3225.length - (this.field3228 - this.field3226));
                System.arraycopy(arg0, arg1, this.field3225, (int) (this.field3228 - this.field3226), var4);
                this.field3228 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field3221 = this.field3225.length;
                this.method3828();
            }
            if (arg2 > this.field3225.length) {
                if (this.field3231 != this.field3228) {
                    this.field3224.method3801(this.field3228);
                    this.field3231 = this.field3228;
                }
                this.field3224.method3802(arg0, arg1, arg2);
                this.field3231 += (long) arg2;
                if (this.field3231 > this.field3229) {
                    this.field3229 = this.field3231;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field3228 >= this.field3223 && this.field3228 < this.field3223 + (long) this.field3227) {
                    var5 = this.field3228;
                } else if (this.field3223 >= this.field3228 && this.field3223 < this.field3228 + (long) arg2) {
                    var5 = this.field3223;
                }
                if (this.field3228 + (long) arg2 > this.field3223 && this.field3228 + (long) arg2 <= this.field3223 + (long) this.field3227) {
                    var7 = this.field3228 + (long) arg2;
                } else if (this.field3223 + (long) this.field3227 > this.field3228 && this.field3223 + (long) this.field3227 <= this.field3228 + (long) arg2) {
                    var7 = this.field3223 + (long) this.field3227;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field3228), this.field3222, (int) (var5 - this.field3223), var9);
                }
                this.field3228 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field3226 == -1L) {
                    this.field3226 = this.field3228;
                }
                System.arraycopy(arg0, arg1, this.field3225, (int) (this.field3228 - this.field3226), arg2);
                this.field3228 += (long) arg2;
                if (this.field3228 - this.field3226 > (long) this.field3221) {
                    this.field3221 = (int) (this.field3228 - this.field3226);
                }
            }
        } catch (IOException var11) {
            this.field3231 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("hc.s(I)V")
    public void method3828() throws IOException {
        if (this.field3226 == -1L) {
            return;
        }
        if (this.field3231 != this.field3226) {
            this.field3224.method3801(this.field3226);
            this.field3231 = this.field3226;
        }
        this.field3224.method3802(this.field3225, 0, this.field3221);
        this.field3231 += (long) (this.field3221 * -940476033) * 503596671L;
        if (this.field3231 > this.field3229) {
            this.field3229 = this.field3231;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field3226 >= this.field3223 && this.field3226 < this.field3223 + (long) this.field3227) {
            var1 = this.field3226;
        } else if (this.field3223 >= this.field3226 && this.field3223 < this.field3226 + (long) this.field3221) {
            var1 = this.field3223;
        }
        if (this.field3226 + (long) this.field3221 > this.field3223 && this.field3226 + (long) this.field3221 <= this.field3223 + (long) this.field3227) {
            var3 = this.field3226 + (long) this.field3221;
        } else if (this.field3223 + (long) this.field3227 > this.field3226 && this.field3223 + (long) this.field3227 <= this.field3226 + (long) this.field3221) {
            var3 = this.field3223 + (long) this.field3227;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field3225, (int) (var1 - this.field3226), this.field3222, (int) (var1 - this.field3223), var5);
        }
        this.field3226 = -1L;
        this.field3221 = 0;
    }
}
