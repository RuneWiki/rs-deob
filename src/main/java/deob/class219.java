package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("hy")
public class class219 {

    @ObfuscatedName("hy.t")
    public class218 field3119;

    @ObfuscatedName("hy.b")
    public byte[] field3114;

    @ObfuscatedName("hy.p")
    public long field3115 = -1L;

    @ObfuscatedName("hy.e")
    public int field3124;

    @ObfuscatedName("hy.i")
    public byte[] field3117;

    @ObfuscatedName("hy.o")
    public long field3118 = -1L;

    @ObfuscatedName("hy.f")
    public int field3121 = 0;

    @ObfuscatedName("hy.d")
    public long field3113;

    @ObfuscatedName("hy.j")
    public long field3120;

    @ObfuscatedName("hy.x")
    public long field3122;

    @ObfuscatedName("hy.v")
    public long field3123;

    public class219(class218 arg0, int arg1, int arg2) throws IOException {
        this.field3119 = arg0;
        this.field3122 = this.field3120 = arg0.method3690();
        this.field3114 = new byte[arg1];
        this.field3117 = new byte[arg2];
        this.field3113 = 0L;
    }

    @ObfuscatedName("hy.t(B)V")
    public void method3729() throws IOException {
        this.method3715();
        this.field3119.method3689();
    }

    @ObfuscatedName("hy.b(J)V")
    public void method3735(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field3113 = arg0;
    }

    @ObfuscatedName("hy.p(I)J")
    public long method3710() {
        return this.field3122;
    }

    @ObfuscatedName("hy.e([BI)V")
    public void method3736(byte[] arg0) throws IOException {
        this.method3712(arg0, 0, arg0.length);
    }

    @ObfuscatedName("hy.i([BIII)V")
    public void method3712(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field3118 != -1L && this.field3113 >= this.field3118 && this.field3113 + (long) arg2 <= this.field3118 + (long) this.field3121) {
                System.arraycopy(this.field3117, (int) (this.field3113 - this.field3118), arg0, arg1, arg2);
                this.field3113 += (long) arg2;
                return;
            }
            long var4 = this.field3113;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field3113 >= this.field3115 && this.field3113 < this.field3115 + (long) this.field3124) {
                int var8 = (int) ((long) this.field3124 - (this.field3113 - this.field3115));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field3114, (int) (this.field3113 - this.field3115), arg0, arg1, var8);
                this.field3113 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field3114.length) {
                this.field3119.method3687(this.field3113);
                this.field3123 = this.field3113;
                while (arg2 > 0) {
                    int var9 = this.field3119.method3702(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field3123 += (long) var9;
                    this.field3113 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method3713();
                int var10 = arg2;
                if (arg2 > this.field3124) {
                    var10 = this.field3124;
                }
                System.arraycopy(this.field3114, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field3113 += (long) var10;
            }
            if (this.field3118 != -1L) {
                if (this.field3118 > this.field3113 && arg2 > 0) {
                    int var11 = (int) (this.field3118 - this.field3113) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field3113++;
                    }
                }
                long var12 = -1L;
                long var14 = -1L;
                if (this.field3118 >= var4 && this.field3118 < (long) var7 + var4) {
                    var12 = this.field3118;
                } else if (var4 >= this.field3118 && var4 < this.field3118 + (long) this.field3121) {
                    var12 = var4;
                }
                if (this.field3118 + (long) this.field3121 > var4 && this.field3118 + (long) this.field3121 <= (long) var7 + var4) {
                    var14 = this.field3118 + (long) this.field3121;
                } else if ((long) var7 + var4 > this.field3118 && (long) var7 + var4 <= this.field3118 + (long) this.field3121) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field3117, (int) (var12 - this.field3118), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field3113) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field3113));
                        this.field3113 = var14;
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

    @ObfuscatedName("hy.o(I)V")
    public void method3713() throws IOException {
        this.field3124 = 0;
        if (this.field3123 != this.field3113) {
            this.field3119.method3687(this.field3113);
            this.field3123 = this.field3113;
        }
        this.field3115 = this.field3113;
        while (this.field3124 < this.field3114.length) {
            int var1 = this.field3119.method3702(this.field3114, this.field3124, this.field3114.length - this.field3124);
            if (var1 == -1) {
                break;
            }
            this.field3123 += (long) var1;
            this.field3124 += var1;
        }
    }

    @ObfuscatedName("hy.f([BIII)V")
    public void method3714(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field3113 + (long) arg2 > this.field3122) {
                this.field3122 = this.field3113 + (long) arg2;
            }
            if (this.field3118 != -1L && (this.field3113 < this.field3118 || this.field3113 > this.field3118 + (long) this.field3121)) {
                this.method3715();
            }
            if (this.field3118 != -1L && this.field3113 + (long) arg2 > this.field3118 + (long) this.field3117.length) {
                int var4 = (int) ((long) this.field3117.length - (this.field3113 - this.field3118));
                System.arraycopy(arg0, arg1, this.field3117, (int) (this.field3113 - this.field3118), var4);
                this.field3113 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field3121 = this.field3117.length;
                this.method3715();
            }
            if (arg2 > this.field3117.length) {
                if (this.field3123 != this.field3113) {
                    this.field3119.method3687(this.field3113);
                    this.field3123 = this.field3113;
                }
                this.field3119.method3692(arg0, arg1, arg2);
                this.field3123 += (long) arg2;
                if (this.field3123 > this.field3120) {
                    this.field3120 = this.field3123;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field3113 >= this.field3115 && this.field3113 < this.field3115 + (long) this.field3124) {
                    var5 = this.field3113;
                } else if (this.field3115 >= this.field3113 && this.field3115 < this.field3113 + (long) arg2) {
                    var5 = this.field3115;
                }
                if (this.field3113 + (long) arg2 > this.field3115 && this.field3113 + (long) arg2 <= this.field3115 + (long) this.field3124) {
                    var7 = this.field3113 + (long) arg2;
                } else if (this.field3115 + (long) this.field3124 > this.field3113 && this.field3115 + (long) this.field3124 <= this.field3113 + (long) arg2) {
                    var7 = this.field3115 + (long) this.field3124;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field3113), this.field3114, (int) (var5 - this.field3115), var9);
                }
                this.field3113 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field3118 == -1L) {
                    this.field3118 = this.field3113;
                }
                System.arraycopy(arg0, arg1, this.field3117, (int) (this.field3113 - this.field3118), arg2);
                this.field3113 += (long) arg2;
                if (this.field3113 - this.field3118 > (long) this.field3121) {
                    this.field3121 = (int) (this.field3113 - this.field3118);
                }
            }
        } catch (IOException var11) {
            this.field3123 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("hy.d(I)V")
    public void method3715() throws IOException {
        if (this.field3118 == -1L) {
            return;
        }
        if (this.field3123 != this.field3118) {
            this.field3119.method3687(this.field3118);
            this.field3123 = this.field3118;
        }
        this.field3119.method3692(this.field3117, 0, this.field3121);
        this.field3123 += (long) (this.field3121 * -1830698913) * 1269865375L;
        if (this.field3123 > this.field3120) {
            this.field3120 = this.field3123;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field3118 >= this.field3115 && this.field3118 < this.field3115 + (long) this.field3124) {
            var1 = this.field3118;
        } else if (this.field3115 >= this.field3118 && this.field3115 < this.field3118 + (long) this.field3121) {
            var1 = this.field3115;
        }
        if (this.field3118 + (long) this.field3121 > this.field3115 && this.field3118 + (long) this.field3121 <= this.field3115 + (long) this.field3124) {
            var3 = this.field3118 + (long) this.field3121;
        } else if (this.field3115 + (long) this.field3124 > this.field3118 && this.field3115 + (long) this.field3124 <= this.field3118 + (long) this.field3121) {
            var3 = this.field3115 + (long) this.field3124;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field3117, (int) (var1 - this.field3118), this.field3114, (int) (var1 - this.field3115), var5);
        }
        this.field3118 = -1L;
        this.field3121 = 0;
    }
}
