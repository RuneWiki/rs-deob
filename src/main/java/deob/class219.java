package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("hl")
public class class219 {

    @ObfuscatedName("hl.n")
    public class218 field3115;

    @ObfuscatedName("hl.w")
    public byte[] field3121;

    @ObfuscatedName("hl.i")
    public long field3117 = -1L;

    @ObfuscatedName("hl.e")
    public int field3118;

    @ObfuscatedName("hl.h")
    public byte[] field3119;

    @ObfuscatedName("hl.q")
    public long field3120 = -1L;

    @ObfuscatedName("hl.l")
    public int field3122 = 0;

    @ObfuscatedName("hl.c")
    public long field3116;

    @ObfuscatedName("hl.f")
    public long field3123;

    @ObfuscatedName("hl.s")
    public long field3124;

    @ObfuscatedName("hl.m")
    public long field3125;

    public class219(class218 arg0, int arg1, int arg2) throws IOException {
        this.field3115 = arg0;
        this.field3124 = this.field3123 = arg0.method3690();
        this.field3121 = new byte[arg1];
        this.field3119 = new byte[arg2];
        this.field3116 = 0L;
    }

    @ObfuscatedName("hl.n(I)V")
    public void method3712() throws IOException {
        this.method3736();
        this.field3115.method3689();
    }

    @ObfuscatedName("hl.w(J)V")
    public void method3713(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field3116 = arg0;
    }

    @ObfuscatedName("hl.i(I)J")
    public long method3714() {
        return this.field3124;
    }

    @ObfuscatedName("hl.e([BI)V")
    public void method3715(byte[] arg0) throws IOException {
        this.method3716(arg0, 0, arg0.length);
    }

    @ObfuscatedName("hl.h([BIII)V")
    public void method3716(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field3120 != -1L && this.field3116 >= this.field3120 && this.field3116 + (long) arg2 <= this.field3120 + (long) this.field3122) {
                System.arraycopy(this.field3119, (int) (this.field3116 - this.field3120), arg0, arg1, arg2);
                this.field3116 += (long) arg2;
                return;
            }
            long var4 = this.field3116;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field3116 >= this.field3117 && this.field3116 < this.field3117 + (long) this.field3118) {
                int var8 = (int) ((long) this.field3118 - (this.field3116 - this.field3117));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field3121, (int) (this.field3116 - this.field3117), arg0, arg1, var8);
                this.field3116 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field3121.length) {
                this.field3115.method3687(this.field3116);
                this.field3125 = this.field3116;
                while (arg2 > 0) {
                    int var9 = this.field3115.method3691(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field3125 += (long) var9;
                    this.field3116 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method3717();
                int var10 = arg2;
                if (arg2 > this.field3118) {
                    var10 = this.field3118;
                }
                System.arraycopy(this.field3121, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field3116 += (long) var10;
            }
            if (this.field3120 != -1L) {
                if (this.field3120 > this.field3116 && arg2 > 0) {
                    int var11 = (int) (this.field3120 - this.field3116) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field3116++;
                    }
                }
                long var12 = -1L;
                long var14 = -1L;
                if (this.field3120 >= var4 && this.field3120 < (long) var7 + var4) {
                    var12 = this.field3120;
                } else if (var4 >= this.field3120 && var4 < this.field3120 + (long) this.field3122) {
                    var12 = var4;
                }
                if (this.field3120 + (long) this.field3122 > var4 && this.field3120 + (long) this.field3122 <= (long) var7 + var4) {
                    var14 = this.field3120 + (long) this.field3122;
                } else if ((long) var7 + var4 > this.field3120 && (long) var7 + var4 <= this.field3120 + (long) this.field3122) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field3119, (int) (var12 - this.field3120), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field3116) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field3116));
                        this.field3116 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field3125 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("hl.q(I)V")
    public void method3717() throws IOException {
        this.field3118 = 0;
        if (this.field3125 != this.field3116) {
            this.field3115.method3687(this.field3116);
            this.field3125 = this.field3116;
        }
        this.field3117 = this.field3116;
        while (this.field3118 < this.field3121.length) {
            int var1 = this.field3115.method3691(this.field3121, this.field3118, this.field3121.length - this.field3118);
            if (var1 == -1) {
                break;
            }
            this.field3125 += (long) var1;
            this.field3118 += var1;
        }
    }

    @ObfuscatedName("hl.l([BIII)V")
    public void method3718(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field3116 + (long) arg2 > this.field3124) {
                this.field3124 = this.field3116 + (long) arg2;
            }
            if (this.field3120 != -1L && (this.field3116 < this.field3120 || this.field3116 > this.field3120 + (long) this.field3122)) {
                this.method3736();
            }
            if (this.field3120 != -1L && this.field3116 + (long) arg2 > this.field3120 + (long) this.field3119.length) {
                int var4 = (int) ((long) this.field3119.length - (this.field3116 - this.field3120));
                System.arraycopy(arg0, arg1, this.field3119, (int) (this.field3116 - this.field3120), var4);
                this.field3116 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field3122 = this.field3119.length;
                this.method3736();
            }
            if (arg2 > this.field3119.length) {
                if (this.field3125 != this.field3116) {
                    this.field3115.method3687(this.field3116);
                    this.field3125 = this.field3116;
                }
                this.field3115.method3688(arg0, arg1, arg2);
                this.field3125 += (long) arg2;
                if (this.field3125 > this.field3123) {
                    this.field3123 = this.field3125;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field3116 >= this.field3117 && this.field3116 < this.field3117 + (long) this.field3118) {
                    var5 = this.field3116;
                } else if (this.field3117 >= this.field3116 && this.field3117 < this.field3116 + (long) arg2) {
                    var5 = this.field3117;
                }
                if (this.field3116 + (long) arg2 > this.field3117 && this.field3116 + (long) arg2 <= this.field3117 + (long) this.field3118) {
                    var7 = this.field3116 + (long) arg2;
                } else if (this.field3117 + (long) this.field3118 > this.field3116 && this.field3117 + (long) this.field3118 <= this.field3116 + (long) arg2) {
                    var7 = this.field3117 + (long) this.field3118;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field3116), this.field3121, (int) (var5 - this.field3117), var9);
                }
                this.field3116 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field3120 == -1L) {
                    this.field3120 = this.field3116;
                }
                System.arraycopy(arg0, arg1, this.field3119, (int) (this.field3116 - this.field3120), arg2);
                this.field3116 += (long) arg2;
                if (this.field3116 - this.field3120 > (long) this.field3122) {
                    this.field3122 = (int) (this.field3116 - this.field3120);
                }
            }
        } catch (IOException var11) {
            this.field3125 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("hl.c(I)V")
    public void method3736() throws IOException {
        if (this.field3120 == -1L) {
            return;
        }
        if (this.field3125 != this.field3120) {
            this.field3115.method3687(this.field3120);
            this.field3125 = this.field3120;
        }
        this.field3115.method3688(this.field3119, 0, this.field3122);
        this.field3125 += (long) (this.field3122 * -252804239) * 1121967505L;
        if (this.field3125 > this.field3123) {
            this.field3123 = this.field3125;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field3120 >= this.field3117 && this.field3120 < this.field3117 + (long) this.field3118) {
            var1 = this.field3120;
        } else if (this.field3117 >= this.field3120 && this.field3117 < this.field3120 + (long) this.field3122) {
            var1 = this.field3117;
        }
        if (this.field3120 + (long) this.field3122 > this.field3117 && this.field3120 + (long) this.field3122 <= this.field3117 + (long) this.field3118) {
            var3 = this.field3120 + (long) this.field3122;
        } else if (this.field3117 + (long) this.field3118 > this.field3120 && this.field3117 + (long) this.field3118 <= this.field3120 + (long) this.field3122) {
            var3 = this.field3117 + (long) this.field3118;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field3119, (int) (var1 - this.field3120), this.field3121, (int) (var1 - this.field3117), var5);
        }
        this.field3120 = -1L;
        this.field3122 = 0;
    }
}
