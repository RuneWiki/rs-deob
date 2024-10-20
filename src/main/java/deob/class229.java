package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("hn")
public class class229 {

    @ObfuscatedName("hn.a")
    public class228 field3228;

    @ObfuscatedName("hn.w")
    public byte[] field3223;

    @ObfuscatedName("hn.d")
    public long field3224 = -1L;

    @ObfuscatedName("hn.c")
    public int field3225;

    @ObfuscatedName("hn.y")
    public byte[] field3226;

    @ObfuscatedName("hn.k")
    public long field3227 = -1L;

    @ObfuscatedName("hn.r")
    public int field3222 = 0;

    @ObfuscatedName("hn.p")
    public long field3232;

    @ObfuscatedName("hn.q")
    public long field3230;

    @ObfuscatedName("hn.m")
    public long field3231;

    @ObfuscatedName("hn.e")
    public long field3229;

    public class229(class228 arg0, int arg1, int arg2) throws IOException {
        this.field3228 = arg0;
        this.field3231 = this.field3230 = arg0.method3935();
        this.field3223 = new byte[arg1];
        this.field3226 = new byte[arg2];
        this.field3232 = 0L;
    }

    @ObfuscatedName("hn.a(I)V")
    public void method3957() throws IOException {
        this.method3960();
        this.field3228.method3934();
    }

    @ObfuscatedName("hn.w(J)V")
    public void method3954(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field3232 = arg0;
    }

    @ObfuscatedName("hn.d(I)J")
    public long method3958() {
        return this.field3231;
    }

    @ObfuscatedName("hn.c([BB)V")
    public void method3956(byte[] arg0) throws IOException {
        this.method3976(arg0, 0, arg0.length);
    }

    @ObfuscatedName("hn.y([BIII)V")
    public void method3976(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field3227 != -1L && this.field3232 >= this.field3227 && this.field3232 + (long) arg2 <= this.field3227 + (long) this.field3222) {
                System.arraycopy(this.field3226, (int) (this.field3232 - this.field3227), arg0, arg1, arg2);
                this.field3232 += (long) arg2;
                return;
            }
            long var4 = this.field3232;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field3232 >= this.field3224 && this.field3232 < this.field3224 + (long) this.field3225) {
                int var8 = (int) ((long) this.field3225 - (this.field3232 - this.field3224));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field3223, (int) (this.field3232 - this.field3224), arg0, arg1, var8);
                this.field3232 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field3223.length) {
                this.field3228.method3951(this.field3232);
                this.field3229 = this.field3232;
                while (arg2 > 0) {
                    int var9 = this.field3228.method3937(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field3229 += (long) var9;
                    this.field3232 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method3953();
                int var10 = arg2;
                if (arg2 > this.field3225) {
                    var10 = this.field3225;
                }
                System.arraycopy(this.field3223, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field3232 += (long) var10;
            }
            if (this.field3227 != -1L) {
                if (this.field3227 > this.field3232 && arg2 > 0) {
                    int var11 = (int) (this.field3227 - this.field3232) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field3232++;
                    }
                }
                long var12 = -1L;
                long var14 = -1L;
                if (this.field3227 >= var4 && this.field3227 < (long) var7 + var4) {
                    var12 = this.field3227;
                } else if (var4 >= this.field3227 && var4 < this.field3227 + (long) this.field3222) {
                    var12 = var4;
                }
                if (this.field3227 + (long) this.field3222 > var4 && this.field3227 + (long) this.field3222 <= (long) var7 + var4) {
                    var14 = this.field3227 + (long) this.field3222;
                } else if ((long) var7 + var4 > this.field3227 && (long) var7 + var4 <= this.field3227 + (long) this.field3222) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field3226, (int) (var12 - this.field3227), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field3232) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field3232));
                        this.field3232 = var14;
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

    @ObfuscatedName("hn.k(B)V")
    public void method3953() throws IOException {
        this.field3225 = 0;
        if (this.field3232 != this.field3229) {
            this.field3228.method3951(this.field3232);
            this.field3229 = this.field3232;
        }
        this.field3224 = this.field3232;
        while (this.field3225 < this.field3223.length) {
            int var1 = this.field3228.method3937(this.field3223, this.field3225, this.field3223.length - this.field3225);
            if (var1 == -1) {
                break;
            }
            this.field3229 += (long) var1;
            this.field3225 += var1;
        }
    }

    @ObfuscatedName("hn.r([BIIB)V")
    public void method3959(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field3232 + (long) arg2 > this.field3231) {
                this.field3231 = this.field3232 + (long) arg2;
            }
            if (this.field3227 != -1L && (this.field3232 < this.field3227 || this.field3232 > this.field3227 + (long) this.field3222)) {
                this.method3960();
            }
            if (this.field3227 != -1L && this.field3232 + (long) arg2 > this.field3227 + (long) this.field3226.length) {
                int var4 = (int) ((long) this.field3226.length - (this.field3232 - this.field3227));
                System.arraycopy(arg0, arg1, this.field3226, (int) (this.field3232 - this.field3227), var4);
                this.field3232 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field3222 = this.field3226.length;
                this.method3960();
            }
            if (arg2 > this.field3226.length) {
                if (this.field3232 != this.field3229) {
                    this.field3228.method3951(this.field3232);
                    this.field3229 = this.field3232;
                }
                this.field3228.method3933(arg0, arg1, arg2);
                this.field3229 += (long) arg2;
                if (this.field3229 > this.field3230) {
                    this.field3230 = this.field3229;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field3232 >= this.field3224 && this.field3232 < this.field3224 + (long) this.field3225) {
                    var5 = this.field3232;
                } else if (this.field3224 >= this.field3232 && this.field3224 < this.field3232 + (long) arg2) {
                    var5 = this.field3224;
                }
                if (this.field3232 + (long) arg2 > this.field3224 && this.field3232 + (long) arg2 <= this.field3224 + (long) this.field3225) {
                    var7 = this.field3232 + (long) arg2;
                } else if (this.field3224 + (long) this.field3225 > this.field3232 && this.field3224 + (long) this.field3225 <= this.field3232 + (long) arg2) {
                    var7 = this.field3224 + (long) this.field3225;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field3232), this.field3223, (int) (var5 - this.field3224), var9);
                }
                this.field3232 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field3227 == -1L) {
                    this.field3227 = this.field3232;
                }
                System.arraycopy(arg0, arg1, this.field3226, (int) (this.field3232 - this.field3227), arg2);
                this.field3232 += (long) arg2;
                if (this.field3232 - this.field3227 > (long) this.field3222) {
                    this.field3222 = (int) (this.field3232 - this.field3227);
                }
            }
        } catch (IOException var11) {
            this.field3229 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("hn.p(B)V")
    public void method3960() throws IOException {
        if (this.field3227 == -1L) {
            return;
        }
        if (this.field3229 != this.field3227) {
            this.field3228.method3951(this.field3227);
            this.field3229 = this.field3227;
        }
        this.field3228.method3933(this.field3226, 0, this.field3222);
        this.field3229 += (long) (this.field3222 * -1109849307) * 1873287341L;
        if (this.field3229 > this.field3230) {
            this.field3230 = this.field3229;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field3227 >= this.field3224 && this.field3227 < this.field3224 + (long) this.field3225) {
            var1 = this.field3227;
        } else if (this.field3224 >= this.field3227 && this.field3224 < this.field3227 + (long) this.field3222) {
            var1 = this.field3224;
        }
        if (this.field3227 + (long) this.field3222 > this.field3224 && this.field3227 + (long) this.field3222 <= this.field3224 + (long) this.field3225) {
            var3 = this.field3227 + (long) this.field3222;
        } else if (this.field3224 + (long) this.field3225 > this.field3227 && this.field3224 + (long) this.field3225 <= this.field3227 + (long) this.field3222) {
            var3 = this.field3224 + (long) this.field3225;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field3226, (int) (var1 - this.field3227), this.field3223, (int) (var1 - this.field3224), var5);
        }
        this.field3227 = -1L;
        this.field3222 = 0;
    }
}
