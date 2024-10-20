package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("hv")
public class class218 {

    @ObfuscatedName("hv.e")
    public class217 field3075;

    @ObfuscatedName("hv.a")
    public byte[] field3067;

    @ObfuscatedName("hv.l")
    public long field3071 = -1L;

    @ObfuscatedName("hv.c")
    public int field3072;

    @ObfuscatedName("hv.u")
    public byte[] field3070;

    @ObfuscatedName("hv.w")
    public long field3066 = -1L;

    @ObfuscatedName("hv.i")
    public int field3068 = 0;

    @ObfuscatedName("hv.r")
    public long field3076;

    @ObfuscatedName("hv.f")
    public long field3074;

    @ObfuscatedName("hv.g")
    public long field3073;

    @ObfuscatedName("hv.o")
    public long field3069;

    public class218(class217 arg0, int arg1, int arg2) throws IOException {
        this.field3075 = arg0;
        this.field3073 = this.field3074 = arg0.method3653();
        this.field3067 = new byte[arg1];
        this.field3070 = new byte[arg2];
        this.field3076 = 0L;
    }

    @ObfuscatedName("hv.e(S)V")
    public void method3662() throws IOException {
        this.method3668();
        this.field3075.method3643();
    }

    @ObfuscatedName("hv.a(J)V")
    public void method3674(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field3076 = arg0;
    }

    @ObfuscatedName("hv.l(B)J")
    public long method3664() {
        return this.field3073;
    }

    @ObfuscatedName("hv.c([BI)V")
    public void method3661(byte[] arg0) throws IOException {
        this.method3666(arg0, 0, arg0.length);
    }

    @ObfuscatedName("hv.u([BIII)V")
    public void method3666(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field3066 != -1L && this.field3076 >= this.field3066 && this.field3076 + (long) arg2 <= this.field3066 + (long) this.field3068) {
                System.arraycopy(this.field3070, (int) (this.field3076 - this.field3066), arg0, arg1, arg2);
                this.field3076 += (long) arg2;
                return;
            }
            long var4 = this.field3076;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field3076 >= this.field3071 && this.field3076 < this.field3071 + (long) this.field3072) {
                int var8 = (int) ((long) this.field3072 - (this.field3076 - this.field3071));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field3067, (int) (this.field3076 - this.field3071), arg0, arg1, var8);
                this.field3076 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field3067.length) {
                this.field3075.method3641(this.field3076);
                this.field3069 = this.field3076;
                while (arg2 > 0) {
                    int var9 = this.field3075.method3656(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field3069 += (long) var9;
                    this.field3076 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method3667();
                int var10 = arg2;
                if (arg2 > this.field3072) {
                    var10 = this.field3072;
                }
                System.arraycopy(this.field3067, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field3076 += (long) var10;
            }
            if (this.field3066 != -1L) {
                if (this.field3066 > this.field3076 && arg2 > 0) {
                    int var11 = (int) (this.field3066 - this.field3076) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field3076++;
                    }
                }
                long var12 = -1L;
                long var14 = -1L;
                if (this.field3066 >= var4 && this.field3066 < (long) var7 + var4) {
                    var12 = this.field3066;
                } else if (var4 >= this.field3066 && var4 < this.field3066 + (long) this.field3068) {
                    var12 = var4;
                }
                if (this.field3066 + (long) this.field3068 > var4 && this.field3066 + (long) this.field3068 <= (long) var7 + var4) {
                    var14 = this.field3066 + (long) this.field3068;
                } else if ((long) var7 + var4 > this.field3066 && (long) var7 + var4 <= this.field3066 + (long) this.field3068) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field3070, (int) (var12 - this.field3066), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field3076) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field3076));
                        this.field3076 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field3069 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("hv.w(I)V")
    public void method3667() throws IOException {
        this.field3072 = 0;
        if (this.field3076 != this.field3069) {
            this.field3075.method3641(this.field3076);
            this.field3069 = this.field3076;
        }
        this.field3071 = this.field3076;
        while (this.field3072 < this.field3067.length) {
            int var1 = this.field3075.method3656(this.field3067, this.field3072, this.field3067.length - this.field3072);
            if (var1 == -1) {
                break;
            }
            this.field3069 += (long) var1;
            this.field3072 += var1;
        }
    }

    @ObfuscatedName("hv.i([BIII)V")
    public void method3681(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field3076 + (long) arg2 > this.field3073) {
                this.field3073 = this.field3076 + (long) arg2;
            }
            if (this.field3066 != -1L && (this.field3076 < this.field3066 || this.field3076 > this.field3066 + (long) this.field3068)) {
                this.method3668();
            }
            if (this.field3066 != -1L && this.field3076 + (long) arg2 > this.field3066 + (long) this.field3070.length) {
                int var4 = (int) ((long) this.field3070.length - (this.field3076 - this.field3066));
                System.arraycopy(arg0, arg1, this.field3070, (int) (this.field3076 - this.field3066), var4);
                this.field3076 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field3068 = this.field3070.length;
                this.method3668();
            }
            if (arg2 > this.field3070.length) {
                if (this.field3076 != this.field3069) {
                    this.field3075.method3641(this.field3076);
                    this.field3069 = this.field3076;
                }
                this.field3075.method3642(arg0, arg1, arg2);
                this.field3069 += (long) arg2;
                if (this.field3069 > this.field3074) {
                    this.field3074 = this.field3069;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field3076 >= this.field3071 && this.field3076 < this.field3071 + (long) this.field3072) {
                    var5 = this.field3076;
                } else if (this.field3071 >= this.field3076 && this.field3071 < this.field3076 + (long) arg2) {
                    var5 = this.field3071;
                }
                if (this.field3076 + (long) arg2 > this.field3071 && this.field3076 + (long) arg2 <= this.field3071 + (long) this.field3072) {
                    var7 = this.field3076 + (long) arg2;
                } else if (this.field3071 + (long) this.field3072 > this.field3076 && this.field3071 + (long) this.field3072 <= this.field3076 + (long) arg2) {
                    var7 = this.field3071 + (long) this.field3072;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field3076), this.field3067, (int) (var5 - this.field3071), var9);
                }
                this.field3076 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field3066 == -1L) {
                    this.field3066 = this.field3076;
                }
                System.arraycopy(arg0, arg1, this.field3070, (int) (this.field3076 - this.field3066), arg2);
                this.field3076 += (long) arg2;
                if (this.field3076 - this.field3066 > (long) this.field3068) {
                    this.field3068 = (int) (this.field3076 - this.field3066);
                }
            }
        } catch (IOException var11) {
            this.field3069 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("hv.r(I)V")
    public void method3668() throws IOException {
        if (this.field3066 == -1L) {
            return;
        }
        if (this.field3069 != this.field3066) {
            this.field3075.method3641(this.field3066);
            this.field3069 = this.field3066;
        }
        this.field3075.method3642(this.field3070, 0, this.field3068);
        this.field3069 += (long) (this.field3068 * 1764676603) * 1471364915L;
        if (this.field3069 > this.field3074) {
            this.field3074 = this.field3069;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field3066 >= this.field3071 && this.field3066 < this.field3071 + (long) this.field3072) {
            var1 = this.field3066;
        } else if (this.field3071 >= this.field3066 && this.field3071 < this.field3066 + (long) this.field3068) {
            var1 = this.field3071;
        }
        if (this.field3066 + (long) this.field3068 > this.field3071 && this.field3066 + (long) this.field3068 <= this.field3071 + (long) this.field3072) {
            var3 = this.field3066 + (long) this.field3068;
        } else if (this.field3071 + (long) this.field3072 > this.field3066 && this.field3071 + (long) this.field3072 <= this.field3066 + (long) this.field3068) {
            var3 = this.field3071 + (long) this.field3072;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field3070, (int) (var1 - this.field3066), this.field3067, (int) (var1 - this.field3071), var5);
        }
        this.field3066 = -1L;
        this.field3068 = 0;
    }
}
