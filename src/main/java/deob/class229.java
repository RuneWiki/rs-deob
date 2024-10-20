package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("hq")
public class class229 {

    @ObfuscatedName("hq.w")
    public class228 field3227;

    @ObfuscatedName("hq.x")
    public byte[] field3232;

    @ObfuscatedName("hq.t")
    public long field3224 = -1L;

    @ObfuscatedName("hq.p")
    public int field3223;

    @ObfuscatedName("hq.e")
    public byte[] field3226;

    @ObfuscatedName("hq.y")
    public long field3222 = -1L;

    @ObfuscatedName("hq.m")
    public int field3228 = 0;

    @ObfuscatedName("hq.c")
    public long field3225;

    @ObfuscatedName("hq.v")
    public long field3230;

    @ObfuscatedName("hq.l")
    public long field3231;

    @ObfuscatedName("hq.z")
    public long field3229;

    public class229(class228 arg0, int arg1, int arg2) throws IOException {
        this.field3227 = arg0;
        this.field3231 = this.field3230 = arg0.method3876();
        this.field3232 = new byte[arg1];
        this.field3226 = new byte[arg2];
        this.field3225 = 0L;
    }

    @ObfuscatedName("hq.w(B)V")
    public void method3895() throws IOException {
        this.method3902();
        this.field3227.method3874();
    }

    @ObfuscatedName("hq.x(J)V")
    public void method3913(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field3225 = arg0;
    }

    @ObfuscatedName("hq.t(I)J")
    public long method3900() {
        return this.field3231;
    }

    @ObfuscatedName("hq.p([BI)V")
    public void method3898(byte[] arg0) throws IOException {
        this.method3899(arg0, 0, arg0.length);
    }

    @ObfuscatedName("hq.e([BIII)V")
    public void method3899(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field3222 != -1L && this.field3225 >= this.field3222 && this.field3225 + (long) arg2 <= this.field3222 + (long) this.field3228) {
                System.arraycopy(this.field3226, (int) (this.field3225 - this.field3222), arg0, arg1, arg2);
                this.field3225 += (long) arg2;
                return;
            }
            long var4 = this.field3225;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field3225 >= this.field3224 && this.field3225 < this.field3224 + (long) this.field3223) {
                int var8 = (int) ((long) this.field3223 - (this.field3225 - this.field3224));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field3232, (int) (this.field3225 - this.field3224), arg0, arg1, var8);
                this.field3225 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field3232.length) {
                this.field3227.method3891(this.field3225);
                this.field3229 = this.field3225;
                while (arg2 > 0) {
                    int var9 = this.field3227.method3875(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field3229 += (long) var9;
                    this.field3225 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method3896();
                int var10 = arg2;
                if (arg2 > this.field3223) {
                    var10 = this.field3223;
                }
                System.arraycopy(this.field3232, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field3225 += (long) var10;
            }
            if (this.field3222 != -1L) {
                if (this.field3222 > this.field3225 && arg2 > 0) {
                    int var11 = (int) (this.field3222 - this.field3225) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field3225++;
                    }
                }
                long var12 = -1L;
                long var14 = -1L;
                if (this.field3222 >= var4 && this.field3222 < (long) var7 + var4) {
                    var12 = this.field3222;
                } else if (var4 >= this.field3222 && var4 < this.field3222 + (long) this.field3228) {
                    var12 = var4;
                }
                if (this.field3222 + (long) this.field3228 > var4 && this.field3222 + (long) this.field3228 <= (long) var7 + var4) {
                    var14 = this.field3222 + (long) this.field3228;
                } else if ((long) var7 + var4 > this.field3222 && (long) var7 + var4 <= this.field3222 + (long) this.field3228) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field3226, (int) (var12 - this.field3222), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field3225) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field3225));
                        this.field3225 = var14;
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

    @ObfuscatedName("hq.y(B)V")
    public void method3896() throws IOException {
        this.field3223 = 0;
        if (this.field3229 != this.field3225) {
            this.field3227.method3891(this.field3225);
            this.field3229 = this.field3225;
        }
        this.field3224 = this.field3225;
        while (this.field3223 < this.field3232.length) {
            int var1 = this.field3227.method3875(this.field3232, this.field3223, this.field3232.length - this.field3223);
            if (var1 == -1) {
                break;
            }
            this.field3229 += (long) var1;
            this.field3223 += var1;
        }
    }

    @ObfuscatedName("hq.m([BIIB)V")
    public void method3901(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field3225 + (long) arg2 > this.field3231) {
                this.field3231 = this.field3225 + (long) arg2;
            }
            if (this.field3222 != -1L && (this.field3225 < this.field3222 || this.field3225 > this.field3222 + (long) this.field3228)) {
                this.method3902();
            }
            if (this.field3222 != -1L && this.field3225 + (long) arg2 > this.field3222 + (long) this.field3226.length) {
                int var4 = (int) ((long) this.field3226.length - (this.field3225 - this.field3222));
                System.arraycopy(arg0, arg1, this.field3226, (int) (this.field3225 - this.field3222), var4);
                this.field3225 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field3228 = this.field3226.length;
                this.method3902();
            }
            if (arg2 > this.field3226.length) {
                if (this.field3229 != this.field3225) {
                    this.field3227.method3891(this.field3225);
                    this.field3229 = this.field3225;
                }
                this.field3227.method3887(arg0, arg1, arg2);
                this.field3229 += (long) arg2;
                if (this.field3229 > this.field3230) {
                    this.field3230 = this.field3229;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field3225 >= this.field3224 && this.field3225 < this.field3224 + (long) this.field3223) {
                    var5 = this.field3225;
                } else if (this.field3224 >= this.field3225 && this.field3224 < this.field3225 + (long) arg2) {
                    var5 = this.field3224;
                }
                if (this.field3225 + (long) arg2 > this.field3224 && this.field3225 + (long) arg2 <= this.field3224 + (long) this.field3223) {
                    var7 = this.field3225 + (long) arg2;
                } else if (this.field3224 + (long) this.field3223 > this.field3225 && this.field3224 + (long) this.field3223 <= this.field3225 + (long) arg2) {
                    var7 = this.field3224 + (long) this.field3223;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field3225), this.field3232, (int) (var5 - this.field3224), var9);
                }
                this.field3225 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field3222 == -1L) {
                    this.field3222 = this.field3225;
                }
                System.arraycopy(arg0, arg1, this.field3226, (int) (this.field3225 - this.field3222), arg2);
                this.field3225 += (long) arg2;
                if (this.field3225 - this.field3222 > (long) this.field3228) {
                    this.field3228 = (int) (this.field3225 - this.field3222);
                }
            }
        } catch (IOException var11) {
            this.field3229 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("hq.c(B)V")
    public void method3902() throws IOException {
        if (this.field3222 == -1L) {
            return;
        }
        if (this.field3229 != this.field3222) {
            this.field3227.method3891(this.field3222);
            this.field3229 = this.field3222;
        }
        this.field3227.method3887(this.field3226, 0, this.field3228);
        this.field3229 += (long) (this.field3228 * -279911039) * 1343052417L;
        if (this.field3229 > this.field3230) {
            this.field3230 = this.field3229;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field3222 >= this.field3224 && this.field3222 < this.field3224 + (long) this.field3223) {
            var1 = this.field3222;
        } else if (this.field3224 >= this.field3222 && this.field3224 < this.field3222 + (long) this.field3228) {
            var1 = this.field3224;
        }
        if (this.field3222 + (long) this.field3228 > this.field3224 && this.field3222 + (long) this.field3228 <= this.field3224 + (long) this.field3223) {
            var3 = this.field3222 + (long) this.field3228;
        } else if (this.field3224 + (long) this.field3223 > this.field3222 && this.field3224 + (long) this.field3223 <= this.field3222 + (long) this.field3228) {
            var3 = this.field3224 + (long) this.field3223;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field3226, (int) (var1 - this.field3222), this.field3232, (int) (var1 - this.field3224), var5);
        }
        this.field3222 = -1L;
        this.field3228 = 0;
    }
}
