package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("ho")
public class class219 {

    @ObfuscatedName("ho.p")
    public class218 field3129;

    @ObfuscatedName("ho.k")
    public byte[] field3119;

    @ObfuscatedName("ho.e")
    public long field3120 = -1L;

    @ObfuscatedName("ho.f")
    public int field3121;

    @ObfuscatedName("ho.w")
    public byte[] field3128;

    @ObfuscatedName("ho.t")
    public long field3127 = -1L;

    @ObfuscatedName("ho.s")
    public int field3122 = 0;

    @ObfuscatedName("ho.c")
    public long field3125;

    @ObfuscatedName("ho.d")
    public long field3126;

    @ObfuscatedName("ho.v")
    public long field3124;

    @ObfuscatedName("ho.m")
    public long field3123;

    public class219(class218 arg0, int arg1, int arg2) throws IOException {
        this.field3129 = arg0;
        this.field3124 = this.field3126 = arg0.method3721();
        this.field3119 = new byte[arg1];
        this.field3128 = new byte[arg2];
        this.field3125 = 0L;
    }

    @ObfuscatedName("ho.p(I)V")
    public void method3743() throws IOException {
        this.method3740();
        this.field3129.method3720();
    }

    @ObfuscatedName("ho.k(J)V")
    public void method3745(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field3125 = arg0;
    }

    @ObfuscatedName("ho.e(B)J")
    public long method3735() {
        return this.field3124;
    }

    @ObfuscatedName("ho.f([BI)V")
    public void method3736(byte[] arg0) throws IOException {
        this.method3737(arg0, 0, arg0.length);
    }

    @ObfuscatedName("ho.w([BIII)V")
    public void method3737(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field3127 != -1L && this.field3125 >= this.field3127 && this.field3125 + (long) arg2 <= this.field3127 + (long) this.field3122) {
                System.arraycopy(this.field3128, (int) (this.field3125 - this.field3127), arg0, arg1, arg2);
                this.field3125 += (long) arg2;
                return;
            }
            long var4 = this.field3125;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field3125 >= this.field3120 && this.field3125 < this.field3120 + (long) this.field3121) {
                int var8 = (int) ((long) this.field3121 - (this.field3125 - this.field3120));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field3119, (int) (this.field3125 - this.field3120), arg0, arg1, var8);
                this.field3125 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field3119.length) {
                this.field3129.method3724(this.field3125);
                this.field3123 = this.field3125;
                while (arg2 > 0) {
                    int var9 = this.field3129.method3731(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field3123 += (long) var9;
                    this.field3125 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method3747();
                int var10 = arg2;
                if (arg2 > this.field3121) {
                    var10 = this.field3121;
                }
                System.arraycopy(this.field3119, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field3125 += (long) var10;
            }
            if (this.field3127 != -1L) {
                if (this.field3127 > this.field3125 && arg2 > 0) {
                    int var11 = (int) (this.field3127 - this.field3125) + arg1;
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
                if (this.field3127 >= var4 && this.field3127 < (long) var7 + var4) {
                    var12 = this.field3127;
                } else if (var4 >= this.field3127 && var4 < this.field3127 + (long) this.field3122) {
                    var12 = var4;
                }
                if (this.field3127 + (long) this.field3122 > var4 && this.field3127 + (long) this.field3122 <= (long) var7 + var4) {
                    var14 = this.field3127 + (long) this.field3122;
                } else if ((long) var7 + var4 > this.field3127 && (long) var7 + var4 <= this.field3127 + (long) this.field3122) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field3128, (int) (var12 - this.field3127), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field3125) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field3125));
                        this.field3125 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field3123 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("ho.t(I)V")
    public void method3747() throws IOException {
        this.field3121 = 0;
        if (this.field3125 != this.field3123) {
            this.field3129.method3724(this.field3125);
            this.field3123 = this.field3125;
        }
        this.field3120 = this.field3125;
        while (this.field3121 < this.field3119.length) {
            int var1 = this.field3129.method3731(this.field3119, this.field3121, this.field3119.length - this.field3121);
            if (var1 == -1) {
                break;
            }
            this.field3123 += (long) var1;
            this.field3121 += var1;
        }
    }

    @ObfuscatedName("ho.s([BIIB)V")
    public void method3734(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field3125 + (long) arg2 > this.field3124) {
                this.field3124 = this.field3125 + (long) arg2;
            }
            if (this.field3127 != -1L && (this.field3125 < this.field3127 || this.field3125 > this.field3127 + (long) this.field3122)) {
                this.method3740();
            }
            if (this.field3127 != -1L && this.field3125 + (long) arg2 > this.field3127 + (long) this.field3128.length) {
                int var4 = (int) ((long) this.field3128.length - (this.field3125 - this.field3127));
                System.arraycopy(arg0, arg1, this.field3128, (int) (this.field3125 - this.field3127), var4);
                this.field3125 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field3122 = this.field3128.length;
                this.method3740();
            }
            if (arg2 > this.field3128.length) {
                if (this.field3125 != this.field3123) {
                    this.field3129.method3724(this.field3125);
                    this.field3123 = this.field3125;
                }
                this.field3129.method3719(arg0, arg1, arg2);
                this.field3123 += (long) arg2;
                if (this.field3123 > this.field3126) {
                    this.field3126 = this.field3123;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field3125 >= this.field3120 && this.field3125 < this.field3120 + (long) this.field3121) {
                    var5 = this.field3125;
                } else if (this.field3120 >= this.field3125 && this.field3120 < this.field3125 + (long) arg2) {
                    var5 = this.field3120;
                }
                if (this.field3125 + (long) arg2 > this.field3120 && this.field3125 + (long) arg2 <= this.field3120 + (long) this.field3121) {
                    var7 = this.field3125 + (long) arg2;
                } else if (this.field3120 + (long) this.field3121 > this.field3125 && this.field3120 + (long) this.field3121 <= this.field3125 + (long) arg2) {
                    var7 = this.field3120 + (long) this.field3121;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field3125), this.field3119, (int) (var5 - this.field3120), var9);
                }
                this.field3125 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field3127 == -1L) {
                    this.field3127 = this.field3125;
                }
                System.arraycopy(arg0, arg1, this.field3128, (int) (this.field3125 - this.field3127), arg2);
                this.field3125 += (long) arg2;
                if (this.field3125 - this.field3127 > (long) this.field3122) {
                    this.field3122 = (int) (this.field3125 - this.field3127);
                }
            }
        } catch (IOException var11) {
            this.field3123 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("ho.c(B)V")
    public void method3740() throws IOException {
        if (this.field3127 == -1L) {
            return;
        }
        if (this.field3127 != this.field3123) {
            this.field3129.method3724(this.field3127);
            this.field3123 = this.field3127;
        }
        this.field3129.method3719(this.field3128, 0, this.field3122);
        this.field3123 += (long) (this.field3122 * 716522271) * 450656479L;
        if (this.field3123 > this.field3126) {
            this.field3126 = this.field3123;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field3127 >= this.field3120 && this.field3127 < this.field3120 + (long) this.field3121) {
            var1 = this.field3127;
        } else if (this.field3120 >= this.field3127 && this.field3120 < this.field3127 + (long) this.field3122) {
            var1 = this.field3120;
        }
        if (this.field3127 + (long) this.field3122 > this.field3120 && this.field3127 + (long) this.field3122 <= this.field3120 + (long) this.field3121) {
            var3 = this.field3127 + (long) this.field3122;
        } else if (this.field3120 + (long) this.field3121 > this.field3127 && this.field3120 + (long) this.field3121 <= this.field3127 + (long) this.field3122) {
            var3 = this.field3120 + (long) this.field3121;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field3128, (int) (var1 - this.field3127), this.field3119, (int) (var1 - this.field3120), var5);
        }
        this.field3127 = -1L;
        this.field3122 = 0;
    }
}
