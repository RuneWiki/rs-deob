package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("hd")
public class class229 {

    @ObfuscatedName("hd.j")
    public class228 field3232;

    @ObfuscatedName("hd.h")
    public byte[] field3223;

    @ObfuscatedName("hd.m")
    public long field3224 = -1L;

    @ObfuscatedName("hd.z")
    public int field3225;

    @ObfuscatedName("hd.x")
    public byte[] field3226;

    @ObfuscatedName("hd.e")
    public long field3222 = -1L;

    @ObfuscatedName("hd.i")
    public int field3228 = 0;

    @ObfuscatedName("hd.c")
    public long field3229;

    @ObfuscatedName("hd.n")
    public long field3230;

    @ObfuscatedName("hd.l")
    public long field3231;

    @ObfuscatedName("hd.u")
    public long field3227;

    public class229(class228 arg0, int arg1, int arg2) throws IOException {
        this.field3232 = arg0;
        this.field3231 = this.field3230 = arg0.method3840();
        this.field3223 = new byte[arg1];
        this.field3226 = new byte[arg2];
        this.field3229 = 0L;
    }

    @ObfuscatedName("hd.j(B)V")
    public void method3866() throws IOException {
        this.method3855();
        this.field3232.method3836();
    }

    @ObfuscatedName("hd.h(J)V")
    public void method3880(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field3229 = arg0;
    }

    @ObfuscatedName("hd.m(B)J")
    public long method3856() {
        return this.field3231;
    }

    @ObfuscatedName("hd.z([BI)V")
    public void method3857(byte[] arg0) throws IOException {
        this.method3871(arg0, 0, arg0.length);
    }

    @ObfuscatedName("hd.x([BIII)V")
    public void method3871(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field3222 != -1L && this.field3229 >= this.field3222 && this.field3229 + (long) arg2 <= this.field3222 + (long) this.field3228) {
                System.arraycopy(this.field3226, (int) (this.field3229 - this.field3222), arg0, arg1, arg2);
                this.field3229 += (long) arg2;
                return;
            }
            long var4 = this.field3229;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field3229 >= this.field3224 && this.field3229 < this.field3224 + (long) this.field3225) {
                int var8 = (int) ((long) this.field3225 - (this.field3229 - this.field3224));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field3223, (int) (this.field3229 - this.field3224), arg0, arg1, var8);
                this.field3229 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field3223.length) {
                this.field3232.method3837(this.field3229);
                this.field3227 = this.field3229;
                while (arg2 > 0) {
                    int var9 = this.field3232.method3841(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field3227 += (long) var9;
                    this.field3229 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method3865();
                int var10 = arg2;
                if (arg2 > this.field3225) {
                    var10 = this.field3225;
                }
                System.arraycopy(this.field3223, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field3229 += (long) var10;
            }
            if (this.field3222 != -1L) {
                if (this.field3222 > this.field3229 && arg2 > 0) {
                    int var11 = (int) (this.field3222 - this.field3229) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field3229++;
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
                    if (var14 > this.field3229) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field3229));
                        this.field3229 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field3227 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("hd.e(I)V")
    public void method3865() throws IOException {
        this.field3225 = 0;
        if (this.field3229 != this.field3227) {
            this.field3232.method3837(this.field3229);
            this.field3227 = this.field3229;
        }
        this.field3224 = this.field3229;
        while (this.field3225 < this.field3223.length) {
            int var1 = this.field3232.method3841(this.field3223, this.field3225, this.field3223.length - this.field3225);
            if (var1 == -1) {
                break;
            }
            this.field3227 += (long) var1;
            this.field3225 += var1;
        }
    }

    @ObfuscatedName("hd.i([BIII)V")
    public void method3860(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field3229 + (long) arg2 > this.field3231) {
                this.field3231 = this.field3229 + (long) arg2;
            }
            if (this.field3222 != -1L && (this.field3229 < this.field3222 || this.field3229 > this.field3222 + (long) this.field3228)) {
                this.method3855();
            }
            if (this.field3222 != -1L && this.field3229 + (long) arg2 > this.field3222 + (long) this.field3226.length) {
                int var4 = (int) ((long) this.field3226.length - (this.field3229 - this.field3222));
                System.arraycopy(arg0, arg1, this.field3226, (int) (this.field3229 - this.field3222), var4);
                this.field3229 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field3228 = this.field3226.length;
                this.method3855();
            }
            if (arg2 > this.field3226.length) {
                if (this.field3229 != this.field3227) {
                    this.field3232.method3837(this.field3229);
                    this.field3227 = this.field3229;
                }
                this.field3232.method3845(arg0, arg1, arg2);
                this.field3227 += (long) arg2;
                if (this.field3227 > this.field3230) {
                    this.field3230 = this.field3227;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field3229 >= this.field3224 && this.field3229 < this.field3224 + (long) this.field3225) {
                    var5 = this.field3229;
                } else if (this.field3224 >= this.field3229 && this.field3224 < this.field3229 + (long) arg2) {
                    var5 = this.field3224;
                }
                if (this.field3229 + (long) arg2 > this.field3224 && this.field3229 + (long) arg2 <= this.field3224 + (long) this.field3225) {
                    var7 = this.field3229 + (long) arg2;
                } else if (this.field3224 + (long) this.field3225 > this.field3229 && this.field3224 + (long) this.field3225 <= this.field3229 + (long) arg2) {
                    var7 = this.field3224 + (long) this.field3225;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field3229), this.field3223, (int) (var5 - this.field3224), var9);
                }
                this.field3229 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field3222 == -1L) {
                    this.field3222 = this.field3229;
                }
                System.arraycopy(arg0, arg1, this.field3226, (int) (this.field3229 - this.field3222), arg2);
                this.field3229 += (long) arg2;
                if (this.field3229 - this.field3222 > (long) this.field3228) {
                    this.field3228 = (int) (this.field3229 - this.field3222);
                }
            }
        } catch (IOException var11) {
            this.field3227 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("hd.c(I)V")
    public void method3855() throws IOException {
        if (this.field3222 == -1L) {
            return;
        }
        if (this.field3227 != this.field3222) {
            this.field3232.method3837(this.field3222);
            this.field3227 = this.field3222;
        }
        this.field3232.method3845(this.field3226, 0, this.field3228);
        this.field3227 += (long) (this.field3228 * 1703044095) * -1553097729L;
        if (this.field3227 > this.field3230) {
            this.field3230 = this.field3227;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field3222 >= this.field3224 && this.field3222 < this.field3224 + (long) this.field3225) {
            var1 = this.field3222;
        } else if (this.field3224 >= this.field3222 && this.field3224 < this.field3222 + (long) this.field3228) {
            var1 = this.field3224;
        }
        if (this.field3222 + (long) this.field3228 > this.field3224 && this.field3222 + (long) this.field3228 <= this.field3224 + (long) this.field3225) {
            var3 = this.field3222 + (long) this.field3228;
        } else if (this.field3224 + (long) this.field3225 > this.field3222 && this.field3224 + (long) this.field3225 <= this.field3222 + (long) this.field3228) {
            var3 = this.field3224 + (long) this.field3225;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field3226, (int) (var1 - this.field3222), this.field3223, (int) (var1 - this.field3224), var5);
        }
        this.field3222 = -1L;
        this.field3228 = 0;
    }
}
