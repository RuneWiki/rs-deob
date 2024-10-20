package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("ha")
public class class219 {

    @ObfuscatedName("ha.y")
    public class218 field3123;

    @ObfuscatedName("ha.k")
    public byte[] field3119;

    @ObfuscatedName("ha.g")
    public long field3120 = -1L;

    @ObfuscatedName("ha.n")
    public int field3128;

    @ObfuscatedName("ha.t")
    public byte[] field3122;

    @ObfuscatedName("ha.e")
    public long field3121 = -1L;

    @ObfuscatedName("ha.q")
    public int field3118 = 0;

    @ObfuscatedName("ha.z")
    public long field3125;

    @ObfuscatedName("ha.v")
    public long field3126;

    @ObfuscatedName("ha.b")
    public long field3127;

    @ObfuscatedName("ha.f")
    public long field3124;

    public class219(class218 arg0, int arg1, int arg2) throws IOException {
        this.field3123 = arg0;
        this.field3127 = this.field3126 = arg0.method3703();
        this.field3119 = new byte[arg1];
        this.field3122 = new byte[arg2];
        this.field3125 = 0L;
    }

    @ObfuscatedName("ha.y(I)V")
    public void method3723() throws IOException {
        this.method3726();
        this.field3123.method3705();
    }

    @ObfuscatedName("ha.k(J)V")
    public void method3721(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field3125 = arg0;
    }

    @ObfuscatedName("ha.g(I)J")
    public long method3728() {
        return this.field3127;
    }

    @ObfuscatedName("ha.n([BI)V")
    public void method3722(byte[] arg0) throws IOException {
        this.method3719(arg0, 0, arg0.length);
    }

    @ObfuscatedName("ha.t([BIII)V")
    public void method3719(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field3121 != -1L && this.field3125 >= this.field3121 && this.field3125 + (long) arg2 <= this.field3121 + (long) this.field3118) {
                System.arraycopy(this.field3122, (int) (this.field3125 - this.field3121), arg0, arg1, arg2);
                this.field3125 += (long) arg2;
                return;
            }
            long var4 = this.field3125;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field3125 >= this.field3120 && this.field3125 < this.field3120 + (long) this.field3128) {
                int var8 = (int) ((long) this.field3128 - (this.field3125 - this.field3120));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field3119, (int) (this.field3125 - this.field3120), arg0, arg1, var8);
                this.field3125 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field3119.length) {
                this.field3123.method3700(this.field3125);
                this.field3124 = this.field3125;
                while (arg2 > 0) {
                    int var9 = this.field3123.method3704(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field3124 += (long) var9;
                    this.field3125 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method3730();
                int var10 = arg2;
                if (arg2 > this.field3128) {
                    var10 = this.field3128;
                }
                System.arraycopy(this.field3119, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field3125 += (long) var10;
            }
            if (this.field3121 != -1L) {
                if (this.field3121 > this.field3125 && arg2 > 0) {
                    int var11 = (int) (this.field3121 - this.field3125) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field3125++;
                    }
                }
                long var12 = -1L;
                long var14 = -1L;
                if (this.field3121 >= var4 && this.field3121 < (long) var7 + var4) {
                    var12 = this.field3121;
                } else if (var4 >= this.field3121 && var4 < this.field3121 + (long) this.field3118) {
                    var12 = var4;
                }
                if (this.field3121 + (long) this.field3118 > var4 && this.field3121 + (long) this.field3118 <= (long) var7 + var4) {
                    var14 = this.field3121 + (long) this.field3118;
                } else if ((long) var7 + var4 > this.field3121 && (long) var7 + var4 <= this.field3121 + (long) this.field3118) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field3122, (int) (var12 - this.field3121), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field3125) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field3125));
                        this.field3125 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field3124 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("ha.e(I)V")
    public void method3730() throws IOException {
        this.field3128 = 0;
        if (this.field3125 != this.field3124) {
            this.field3123.method3700(this.field3125);
            this.field3124 = this.field3125;
        }
        this.field3120 = this.field3125;
        while (this.field3128 < this.field3119.length) {
            int var1 = this.field3123.method3704(this.field3119, this.field3128, this.field3119.length - this.field3128);
            if (var1 == -1) {
                break;
            }
            this.field3124 += (long) var1;
            this.field3128 += var1;
        }
    }

    @ObfuscatedName("ha.q([BIII)V")
    public void method3725(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field3125 + (long) arg2 > this.field3127) {
                this.field3127 = this.field3125 + (long) arg2;
            }
            if (this.field3121 != -1L && (this.field3125 < this.field3121 || this.field3125 > this.field3121 + (long) this.field3118)) {
                this.method3726();
            }
            if (this.field3121 != -1L && this.field3125 + (long) arg2 > this.field3121 + (long) this.field3122.length) {
                int var4 = (int) ((long) this.field3122.length - (this.field3125 - this.field3121));
                System.arraycopy(arg0, arg1, this.field3122, (int) (this.field3125 - this.field3121), var4);
                this.field3125 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field3118 = this.field3122.length;
                this.method3726();
            }
            if (arg2 > this.field3122.length) {
                if (this.field3125 != this.field3124) {
                    this.field3123.method3700(this.field3125);
                    this.field3124 = this.field3125;
                }
                this.field3123.method3701(arg0, arg1, arg2);
                this.field3124 += (long) arg2;
                if (this.field3124 > this.field3126) {
                    this.field3126 = this.field3124;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field3125 >= this.field3120 && this.field3125 < this.field3120 + (long) this.field3128) {
                    var5 = this.field3125;
                } else if (this.field3120 >= this.field3125 && this.field3120 < this.field3125 + (long) arg2) {
                    var5 = this.field3120;
                }
                if (this.field3125 + (long) arg2 > this.field3120 && this.field3125 + (long) arg2 <= this.field3120 + (long) this.field3128) {
                    var7 = this.field3125 + (long) arg2;
                } else if (this.field3120 + (long) this.field3128 > this.field3125 && this.field3120 + (long) this.field3128 <= this.field3125 + (long) arg2) {
                    var7 = this.field3120 + (long) this.field3128;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field3125), this.field3119, (int) (var5 - this.field3120), var9);
                }
                this.field3125 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field3121 == -1L) {
                    this.field3121 = this.field3125;
                }
                System.arraycopy(arg0, arg1, this.field3122, (int) (this.field3125 - this.field3121), arg2);
                this.field3125 += (long) arg2;
                if (this.field3125 - this.field3121 > (long) this.field3118) {
                    this.field3118 = (int) (this.field3125 - this.field3121);
                }
            }
        } catch (IOException var11) {
            this.field3124 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("ha.z(B)V")
    public void method3726() throws IOException {
        if (this.field3121 == -1L) {
            return;
        }
        if (this.field3124 != this.field3121) {
            this.field3123.method3700(this.field3121);
            this.field3124 = this.field3121;
        }
        this.field3123.method3701(this.field3122, 0, this.field3118);
        this.field3124 += (long) (this.field3118 * -2125063987) * -1696099323L;
        if (this.field3124 > this.field3126) {
            this.field3126 = this.field3124;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field3121 >= this.field3120 && this.field3121 < this.field3120 + (long) this.field3128) {
            var1 = this.field3121;
        } else if (this.field3120 >= this.field3121 && this.field3120 < this.field3121 + (long) this.field3118) {
            var1 = this.field3120;
        }
        if (this.field3121 + (long) this.field3118 > this.field3120 && this.field3121 + (long) this.field3118 <= this.field3120 + (long) this.field3128) {
            var3 = this.field3121 + (long) this.field3118;
        } else if (this.field3120 + (long) this.field3128 > this.field3121 && this.field3120 + (long) this.field3128 <= this.field3121 + (long) this.field3118) {
            var3 = this.field3120 + (long) this.field3128;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field3122, (int) (var1 - this.field3121), this.field3119, (int) (var1 - this.field3120), var5);
        }
        this.field3121 = -1L;
        this.field3118 = 0;
    }
}
