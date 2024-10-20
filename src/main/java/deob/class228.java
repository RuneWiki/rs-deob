package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("hz")
public class class228 {

    @ObfuscatedName("hz.a")
    public class227 field3219;

    @ObfuscatedName("hz.r")
    public byte[] field3210;

    @ObfuscatedName("hz.f")
    public long field3211 = -1L;

    @ObfuscatedName("hz.s")
    public int field3212;

    @ObfuscatedName("hz.y")
    public byte[] field3213;

    @ObfuscatedName("hz.e")
    public long field3214 = -1L;

    @ObfuscatedName("hz.g")
    public int field3215 = 0;

    @ObfuscatedName("hz.m")
    public long field3216;

    @ObfuscatedName("hz.j")
    public long field3209;

    @ObfuscatedName("hz.n")
    public long field3217;

    @ObfuscatedName("hz.l")
    public long field3218;

    public class228(class227 arg0, int arg1, int arg2) throws IOException {
        this.field3219 = arg0;
        this.field3217 = this.field3209 = arg0.method3864();
        this.field3210 = new byte[arg1];
        this.field3213 = new byte[arg2];
        this.field3216 = 0L;
    }

    @ObfuscatedName("hz.a(B)V")
    public void method3880() throws IOException {
        this.method3887();
        this.field3219.method3876();
    }

    @ObfuscatedName("hz.r(J)V")
    public void method3881(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field3216 = arg0;
    }

    @ObfuscatedName("hz.f(I)J")
    public long method3882() {
        return this.field3217;
    }

    @ObfuscatedName("hz.s([BI)V")
    public void method3883(byte[] arg0) throws IOException {
        this.method3879(arg0, 0, arg0.length);
    }

    @ObfuscatedName("hz.y([BIIB)V")
    public void method3879(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field3214 != -1L && this.field3216 >= this.field3214 && this.field3216 + (long) arg2 <= this.field3214 + (long) this.field3215) {
                System.arraycopy(this.field3213, (int) (this.field3216 - this.field3214), arg0, arg1, arg2);
                this.field3216 += (long) arg2;
                return;
            }
            long var4 = this.field3216;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field3216 >= this.field3211 && this.field3216 < this.field3211 + (long) this.field3212) {
                int var8 = (int) ((long) this.field3212 - (this.field3216 - this.field3211));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field3210, (int) (this.field3216 - this.field3211), arg0, arg1, var8);
                this.field3216 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field3210.length) {
                this.field3219.method3861(this.field3216);
                this.field3218 = this.field3216;
                while (arg2 > 0) {
                    int var9 = this.field3219.method3865(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field3218 += (long) var9;
                    this.field3216 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method3885();
                int var10 = arg2;
                if (arg2 > this.field3212) {
                    var10 = this.field3212;
                }
                System.arraycopy(this.field3210, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field3216 += (long) var10;
            }
            if (this.field3214 != -1L) {
                if (this.field3214 > this.field3216 && arg2 > 0) {
                    int var11 = (int) (this.field3214 - this.field3216) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field3216++;
                    }
                }
                long var12 = -1L;
                long var14 = -1L;
                if (this.field3214 >= var4 && this.field3214 < (long) var7 + var4) {
                    var12 = this.field3214;
                } else if (var4 >= this.field3214 && var4 < this.field3214 + (long) this.field3215) {
                    var12 = var4;
                }
                if (this.field3214 + (long) this.field3215 > var4 && this.field3214 + (long) this.field3215 <= (long) var7 + var4) {
                    var14 = this.field3214 + (long) this.field3215;
                } else if ((long) var7 + var4 > this.field3214 && (long) var7 + var4 <= this.field3214 + (long) this.field3215) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field3213, (int) (var12 - this.field3214), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field3216) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field3216));
                        this.field3216 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field3218 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("hz.e(I)V")
    public void method3885() throws IOException {
        this.field3212 = 0;
        if (this.field3218 != this.field3216) {
            this.field3219.method3861(this.field3216);
            this.field3218 = this.field3216;
        }
        this.field3211 = this.field3216;
        while (this.field3212 < this.field3210.length) {
            int var1 = this.field3219.method3865(this.field3210, this.field3212, this.field3210.length - this.field3212);
            if (var1 == -1) {
                break;
            }
            this.field3218 += (long) var1;
            this.field3212 += var1;
        }
    }

    @ObfuscatedName("hz.g([BIII)V")
    public void method3903(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field3216 + (long) arg2 > this.field3217) {
                this.field3217 = this.field3216 + (long) arg2;
            }
            if (this.field3214 != -1L && (this.field3216 < this.field3214 || this.field3216 > this.field3214 + (long) this.field3215)) {
                this.method3887();
            }
            if (this.field3214 != -1L && this.field3216 + (long) arg2 > this.field3214 + (long) this.field3213.length) {
                int var4 = (int) ((long) this.field3213.length - (this.field3216 - this.field3214));
                System.arraycopy(arg0, arg1, this.field3213, (int) (this.field3216 - this.field3214), var4);
                this.field3216 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field3215 = this.field3213.length;
                this.method3887();
            }
            if (arg2 > this.field3213.length) {
                if (this.field3218 != this.field3216) {
                    this.field3219.method3861(this.field3216);
                    this.field3218 = this.field3216;
                }
                this.field3219.method3862(arg0, arg1, arg2);
                this.field3218 += (long) arg2;
                if (this.field3218 > this.field3209) {
                    this.field3209 = this.field3218;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field3216 >= this.field3211 && this.field3216 < this.field3211 + (long) this.field3212) {
                    var5 = this.field3216;
                } else if (this.field3211 >= this.field3216 && this.field3211 < this.field3216 + (long) arg2) {
                    var5 = this.field3211;
                }
                if (this.field3216 + (long) arg2 > this.field3211 && this.field3216 + (long) arg2 <= this.field3211 + (long) this.field3212) {
                    var7 = this.field3216 + (long) arg2;
                } else if (this.field3211 + (long) this.field3212 > this.field3216 && this.field3211 + (long) this.field3212 <= this.field3216 + (long) arg2) {
                    var7 = this.field3211 + (long) this.field3212;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field3216), this.field3210, (int) (var5 - this.field3211), var9);
                }
                this.field3216 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field3214 == -1L) {
                    this.field3214 = this.field3216;
                }
                System.arraycopy(arg0, arg1, this.field3213, (int) (this.field3216 - this.field3214), arg2);
                this.field3216 += (long) arg2;
                if (this.field3216 - this.field3214 > (long) this.field3215) {
                    this.field3215 = (int) (this.field3216 - this.field3214);
                }
            }
        } catch (IOException var11) {
            this.field3218 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("hz.m(I)V")
    public void method3887() throws IOException {
        if (this.field3214 == -1L) {
            return;
        }
        if (this.field3218 != this.field3214) {
            this.field3219.method3861(this.field3214);
            this.field3218 = this.field3214;
        }
        this.field3219.method3862(this.field3213, 0, this.field3215);
        this.field3218 += (long) (this.field3215 * 1809674405) * -946538707L;
        if (this.field3218 > this.field3209) {
            this.field3209 = this.field3218;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field3214 >= this.field3211 && this.field3214 < this.field3211 + (long) this.field3212) {
            var1 = this.field3214;
        } else if (this.field3211 >= this.field3214 && this.field3211 < this.field3214 + (long) this.field3215) {
            var1 = this.field3211;
        }
        if (this.field3214 + (long) this.field3215 > this.field3211 && this.field3214 + (long) this.field3215 <= this.field3211 + (long) this.field3212) {
            var3 = this.field3214 + (long) this.field3215;
        } else if (this.field3211 + (long) this.field3212 > this.field3214 && this.field3211 + (long) this.field3212 <= this.field3214 + (long) this.field3215) {
            var3 = this.field3211 + (long) this.field3212;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field3213, (int) (var1 - this.field3214), this.field3210, (int) (var1 - this.field3211), var5);
        }
        this.field3214 = -1L;
        this.field3215 = 0;
    }
}
