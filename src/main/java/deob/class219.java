package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("hx")
public class class219 {

    @ObfuscatedName("hx.n")
    public class218 field3125;

    @ObfuscatedName("hx.o")
    public byte[] field3116;

    @ObfuscatedName("hx.a")
    public long field3117 = -1L;

    @ObfuscatedName("hx.w")
    public int field3118;

    @ObfuscatedName("hx.m")
    public byte[] field3115;

    @ObfuscatedName("hx.h")
    public long field3120 = -1L;

    @ObfuscatedName("hx.i")
    public int field3121 = 0;

    @ObfuscatedName("hx.r")
    public long field3122;

    @ObfuscatedName("hx.l")
    public long field3123;

    @ObfuscatedName("hx.f")
    public long field3124;

    @ObfuscatedName("hx.e")
    public long field3119;

    public class219(class218 arg0, int arg1, int arg2) throws IOException {
        this.field3125 = arg0;
        this.field3124 = this.field3123 = arg0.method3725();
        this.field3116 = new byte[arg1];
        this.field3115 = new byte[arg2];
        this.field3122 = 0L;
    }

    @ObfuscatedName("hx.n(I)V")
    public void method3741() throws IOException {
        this.method3740();
        this.field3125.method3724();
    }

    @ObfuscatedName("hx.o(J)V")
    public void method3742(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field3122 = arg0;
    }

    @ObfuscatedName("hx.a(I)J")
    public long method3754() {
        return this.field3124;
    }

    @ObfuscatedName("hx.w([BI)V")
    public void method3761(byte[] arg0) throws IOException {
        this.method3764(arg0, 0, arg0.length);
    }

    @ObfuscatedName("hx.m([BIII)V")
    public void method3764(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field3120 != -1L && this.field3122 >= this.field3120 && this.field3122 + (long) arg2 <= this.field3120 + (long) this.field3121) {
                System.arraycopy(this.field3115, (int) (this.field3122 - this.field3120), arg0, arg1, arg2);
                this.field3122 += (long) arg2;
                return;
            }
            long var4 = this.field3122;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field3122 >= this.field3117 && this.field3122 < this.field3117 + (long) this.field3118) {
                int var8 = (int) ((long) this.field3118 - (this.field3122 - this.field3117));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field3116, (int) (this.field3122 - this.field3117), arg0, arg1, var8);
                this.field3122 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field3116.length) {
                this.field3125.method3722(this.field3122);
                this.field3119 = this.field3122;
                while (arg2 > 0) {
                    int var9 = this.field3125.method3726(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field3119 += (long) var9;
                    this.field3122 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method3745();
                int var10 = arg2;
                if (arg2 > this.field3118) {
                    var10 = this.field3118;
                }
                System.arraycopy(this.field3116, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field3122 += (long) var10;
            }
            if (this.field3120 != -1L) {
                if (this.field3120 > this.field3122 && arg2 > 0) {
                    int var11 = (int) (this.field3120 - this.field3122) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field3122++;
                    }
                }
                long var12 = -1L;
                long var14 = -1L;
                if (this.field3120 >= var4 && this.field3120 < (long) var7 + var4) {
                    var12 = this.field3120;
                } else if (var4 >= this.field3120 && var4 < this.field3120 + (long) this.field3121) {
                    var12 = var4;
                }
                if (this.field3120 + (long) this.field3121 > var4 && this.field3120 + (long) this.field3121 <= (long) var7 + var4) {
                    var14 = this.field3120 + (long) this.field3121;
                } else if ((long) var7 + var4 > this.field3120 && (long) var7 + var4 <= this.field3120 + (long) this.field3121) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field3115, (int) (var12 - this.field3120), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field3122) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field3122));
                        this.field3122 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field3119 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("hx.h(I)V")
    public void method3745() throws IOException {
        this.field3118 = 0;
        if (this.field3122 != this.field3119) {
            this.field3125.method3722(this.field3122);
            this.field3119 = this.field3122;
        }
        this.field3117 = this.field3122;
        while (this.field3118 < this.field3116.length) {
            int var1 = this.field3125.method3726(this.field3116, this.field3118, this.field3116.length - this.field3118);
            if (var1 == -1) {
                break;
            }
            this.field3119 += (long) var1;
            this.field3118 += var1;
        }
    }

    @ObfuscatedName("hx.i([BIII)V")
    public void method3766(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field3122 + (long) arg2 > this.field3124) {
                this.field3124 = this.field3122 + (long) arg2;
            }
            if (this.field3120 != -1L && (this.field3122 < this.field3120 || this.field3122 > this.field3120 + (long) this.field3121)) {
                this.method3740();
            }
            if (this.field3120 != -1L && this.field3122 + (long) arg2 > this.field3120 + (long) this.field3115.length) {
                int var4 = (int) ((long) this.field3115.length - (this.field3122 - this.field3120));
                System.arraycopy(arg0, arg1, this.field3115, (int) (this.field3122 - this.field3120), var4);
                this.field3122 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field3121 = this.field3115.length;
                this.method3740();
            }
            if (arg2 > this.field3115.length) {
                if (this.field3122 != this.field3119) {
                    this.field3125.method3722(this.field3122);
                    this.field3119 = this.field3122;
                }
                this.field3125.method3733(arg0, arg1, arg2);
                this.field3119 += (long) arg2;
                if (this.field3119 > this.field3123) {
                    this.field3123 = this.field3119;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field3122 >= this.field3117 && this.field3122 < this.field3117 + (long) this.field3118) {
                    var5 = this.field3122;
                } else if (this.field3117 >= this.field3122 && this.field3117 < this.field3122 + (long) arg2) {
                    var5 = this.field3117;
                }
                if (this.field3122 + (long) arg2 > this.field3117 && this.field3122 + (long) arg2 <= this.field3117 + (long) this.field3118) {
                    var7 = this.field3122 + (long) arg2;
                } else if (this.field3117 + (long) this.field3118 > this.field3122 && this.field3117 + (long) this.field3118 <= this.field3122 + (long) arg2) {
                    var7 = this.field3117 + (long) this.field3118;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field3122), this.field3116, (int) (var5 - this.field3117), var9);
                }
                this.field3122 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field3120 == -1L) {
                    this.field3120 = this.field3122;
                }
                System.arraycopy(arg0, arg1, this.field3115, (int) (this.field3122 - this.field3120), arg2);
                this.field3122 += (long) arg2;
                if (this.field3122 - this.field3120 > (long) this.field3121) {
                    this.field3121 = (int) (this.field3122 - this.field3120);
                }
            }
        } catch (IOException var11) {
            this.field3119 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("hx.r(B)V")
    public void method3740() throws IOException {
        if (this.field3120 == -1L) {
            return;
        }
        if (this.field3120 != this.field3119) {
            this.field3125.method3722(this.field3120);
            this.field3119 = this.field3120;
        }
        this.field3125.method3733(this.field3115, 0, this.field3121);
        this.field3119 += (long) (this.field3121 * 674900947) * 1081893979L;
        if (this.field3119 > this.field3123) {
            this.field3123 = this.field3119;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field3120 >= this.field3117 && this.field3120 < this.field3117 + (long) this.field3118) {
            var1 = this.field3120;
        } else if (this.field3117 >= this.field3120 && this.field3117 < this.field3120 + (long) this.field3121) {
            var1 = this.field3117;
        }
        if (this.field3120 + (long) this.field3121 > this.field3117 && this.field3120 + (long) this.field3121 <= this.field3117 + (long) this.field3118) {
            var3 = this.field3120 + (long) this.field3121;
        } else if (this.field3117 + (long) this.field3118 > this.field3120 && this.field3117 + (long) this.field3118 <= this.field3120 + (long) this.field3121) {
            var3 = this.field3117 + (long) this.field3118;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field3115, (int) (var1 - this.field3120), this.field3116, (int) (var1 - this.field3117), var5);
        }
        this.field3120 = -1L;
        this.field3121 = 0;
    }
}
