package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("hs")
public class class219 {

    @ObfuscatedName("hs.n")
    public class218 field3123;

    @ObfuscatedName("hs.g")
    public byte[] field3122;

    @ObfuscatedName("hs.a")
    public long field3118 = -1L;

    @ObfuscatedName("hs.m")
    public int field3117;

    @ObfuscatedName("hs.s")
    public byte[] field3120;

    @ObfuscatedName("hs.j")
    public long field3121 = -1L;

    @ObfuscatedName("hs.f")
    public int field3125 = 0;

    @ObfuscatedName("hs.b")
    public long field3124;

    @ObfuscatedName("hs.t")
    public long field3119;

    @ObfuscatedName("hs.i")
    public long field3116;

    @ObfuscatedName("hs.c")
    public long field3126;

    public class219(class218 arg0, int arg1, int arg2) throws IOException {
        this.field3123 = arg0;
        this.field3116 = this.field3119 = arg0.method3755();
        this.field3122 = new byte[arg1];
        this.field3120 = new byte[arg2];
        this.field3124 = 0L;
    }

    @ObfuscatedName("hs.n(I)V")
    public void method3770() throws IOException {
        this.method3777();
        this.field3123.method3754();
    }

    @ObfuscatedName("hs.g(J)V")
    public void method3771(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field3124 = arg0;
    }

    @ObfuscatedName("hs.a(S)J")
    public long method3780() {
        return this.field3116;
    }

    @ObfuscatedName("hs.m([BI)V")
    public void method3773(byte[] arg0) throws IOException {
        this.method3769(arg0, 0, arg0.length);
    }

    @ObfuscatedName("hs.s([BIII)V")
    public void method3769(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field3121 != -1L && this.field3124 >= this.field3121 && this.field3124 + (long) arg2 <= this.field3121 + (long) this.field3125) {
                System.arraycopy(this.field3120, (int) (this.field3124 - this.field3121), arg0, arg1, arg2);
                this.field3124 += (long) arg2;
                return;
            }
            long var4 = this.field3124;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field3124 >= this.field3118 && this.field3124 < this.field3118 + (long) this.field3117) {
                int var8 = (int) ((long) this.field3117 - (this.field3124 - this.field3118));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field3122, (int) (this.field3124 - this.field3118), arg0, arg1, var8);
                this.field3124 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field3122.length) {
                this.field3123.method3756(this.field3124);
                this.field3126 = this.field3124;
                while (arg2 > 0) {
                    int var9 = this.field3123.method3751(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field3126 += (long) var9;
                    this.field3124 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method3783();
                int var10 = arg2;
                if (arg2 > this.field3117) {
                    var10 = this.field3117;
                }
                System.arraycopy(this.field3122, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field3124 += (long) var10;
            }
            if (this.field3121 != -1L) {
                if (this.field3121 > this.field3124 && arg2 > 0) {
                    int var11 = (int) (this.field3121 - this.field3124) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field3124++;
                    }
                }
                long var12 = -1L;
                long var14 = -1L;
                if (this.field3121 >= var4 && this.field3121 < (long) var7 + var4) {
                    var12 = this.field3121;
                } else if (var4 >= this.field3121 && var4 < this.field3121 + (long) this.field3125) {
                    var12 = var4;
                }
                if (this.field3121 + (long) this.field3125 > var4 && this.field3121 + (long) this.field3125 <= (long) var7 + var4) {
                    var14 = this.field3121 + (long) this.field3125;
                } else if ((long) var7 + var4 > this.field3121 && (long) var7 + var4 <= this.field3121 + (long) this.field3125) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field3120, (int) (var12 - this.field3121), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field3124) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field3124));
                        this.field3124 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field3126 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("hs.j(I)V")
    public void method3783() throws IOException {
        this.field3117 = 0;
        if (this.field3126 != this.field3124) {
            this.field3123.method3756(this.field3124);
            this.field3126 = this.field3124;
        }
        this.field3118 = this.field3124;
        while (this.field3117 < this.field3122.length) {
            int var1 = this.field3123.method3751(this.field3122, this.field3117, this.field3122.length - this.field3117);
            if (var1 == -1) {
                break;
            }
            this.field3126 += (long) var1;
            this.field3117 += var1;
        }
    }

    @ObfuscatedName("hs.f([BIII)V")
    public void method3776(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field3124 + (long) arg2 > this.field3116) {
                this.field3116 = this.field3124 + (long) arg2;
            }
            if (this.field3121 != -1L && (this.field3124 < this.field3121 || this.field3124 > this.field3121 + (long) this.field3125)) {
                this.method3777();
            }
            if (this.field3121 != -1L && this.field3124 + (long) arg2 > this.field3121 + (long) this.field3120.length) {
                int var4 = (int) ((long) this.field3120.length - (this.field3124 - this.field3121));
                System.arraycopy(arg0, arg1, this.field3120, (int) (this.field3124 - this.field3121), var4);
                this.field3124 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field3125 = this.field3120.length;
                this.method3777();
            }
            if (arg2 > this.field3120.length) {
                if (this.field3126 != this.field3124) {
                    this.field3123.method3756(this.field3124);
                    this.field3126 = this.field3124;
                }
                this.field3123.method3768(arg0, arg1, arg2);
                this.field3126 += (long) arg2;
                if (this.field3126 > this.field3119) {
                    this.field3119 = this.field3126;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field3124 >= this.field3118 && this.field3124 < this.field3118 + (long) this.field3117) {
                    var5 = this.field3124;
                } else if (this.field3118 >= this.field3124 && this.field3118 < this.field3124 + (long) arg2) {
                    var5 = this.field3118;
                }
                if (this.field3124 + (long) arg2 > this.field3118 && this.field3124 + (long) arg2 <= this.field3118 + (long) this.field3117) {
                    var7 = this.field3124 + (long) arg2;
                } else if (this.field3118 + (long) this.field3117 > this.field3124 && this.field3118 + (long) this.field3117 <= this.field3124 + (long) arg2) {
                    var7 = this.field3118 + (long) this.field3117;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field3124), this.field3122, (int) (var5 - this.field3118), var9);
                }
                this.field3124 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field3121 == -1L) {
                    this.field3121 = this.field3124;
                }
                System.arraycopy(arg0, arg1, this.field3120, (int) (this.field3124 - this.field3121), arg2);
                this.field3124 += (long) arg2;
                if (this.field3124 - this.field3121 > (long) this.field3125) {
                    this.field3125 = (int) (this.field3124 - this.field3121);
                }
            }
        } catch (IOException var11) {
            this.field3126 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("hs.b(I)V")
    public void method3777() throws IOException {
        if (this.field3121 == -1L) {
            return;
        }
        if (this.field3126 != this.field3121) {
            this.field3123.method3756(this.field3121);
            this.field3126 = this.field3121;
        }
        this.field3123.method3768(this.field3120, 0, this.field3125);
        this.field3126 += (long) (this.field3125 * 312782635) * -2093443197L;
        if (this.field3126 > this.field3119) {
            this.field3119 = this.field3126;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field3121 >= this.field3118 && this.field3121 < this.field3118 + (long) this.field3117) {
            var1 = this.field3121;
        } else if (this.field3118 >= this.field3121 && this.field3118 < this.field3121 + (long) this.field3125) {
            var1 = this.field3118;
        }
        if (this.field3121 + (long) this.field3125 > this.field3118 && this.field3121 + (long) this.field3125 <= this.field3118 + (long) this.field3117) {
            var3 = this.field3121 + (long) this.field3125;
        } else if (this.field3118 + (long) this.field3117 > this.field3121 && this.field3118 + (long) this.field3117 <= this.field3121 + (long) this.field3125) {
            var3 = this.field3118 + (long) this.field3117;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field3120, (int) (var1 - this.field3121), this.field3122, (int) (var1 - this.field3118), var5);
        }
        this.field3121 = -1L;
        this.field3125 = 0;
    }
}
