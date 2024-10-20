package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("hj")
public class class219 {

    @ObfuscatedName("hj.o")
    public class218 field3115;

    @ObfuscatedName("hj.l")
    public byte[] field3118;

    @ObfuscatedName("hj.g")
    public long field3113 = -1L;

    @ObfuscatedName("hj.u")
    public int field3114;

    @ObfuscatedName("hj.q")
    public byte[] field3112;

    @ObfuscatedName("hj.r")
    public long field3116 = -1L;

    @ObfuscatedName("hj.v")
    public int field3111 = 0;

    @ObfuscatedName("hj.y")
    public long field3117;

    @ObfuscatedName("hj.k")
    public long field3119;

    @ObfuscatedName("hj.c")
    public long field3120;

    @ObfuscatedName("hj.j")
    public long field3121;

    public class219(class218 arg0, int arg1, int arg2) throws IOException {
        this.field3115 = arg0;
        this.field3120 = this.field3119 = arg0.method3742();
        this.field3118 = new byte[arg1];
        this.field3112 = new byte[arg2];
        this.field3117 = 0L;
    }

    @ObfuscatedName("hj.o(I)V")
    public void method3777() throws IOException {
        this.method3770();
        this.field3115.method3741();
    }

    @ObfuscatedName("hj.l(J)V")
    public void method3764(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field3117 = arg0;
    }

    @ObfuscatedName("hj.g(B)J")
    public long method3765() {
        return this.field3120;
    }

    @ObfuscatedName("hj.u([BI)V")
    public void method3763(byte[] arg0) throws IOException {
        this.method3788(arg0, 0, arg0.length);
    }

    @ObfuscatedName("hj.q([BIII)V")
    public void method3788(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field3116 != -1L && this.field3117 >= this.field3116 && this.field3117 + (long) arg2 <= this.field3116 + (long) this.field3111) {
                System.arraycopy(this.field3112, (int) (this.field3117 - this.field3116), arg0, arg1, arg2);
                this.field3117 += (long) arg2;
                return;
            }
            long var4 = this.field3117;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field3117 >= this.field3113 && this.field3117 < this.field3113 + (long) this.field3114) {
                int var8 = (int) ((long) this.field3114 - (this.field3117 - this.field3113));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field3118, (int) (this.field3117 - this.field3113), arg0, arg1, var8);
                this.field3117 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field3118.length) {
                this.field3115.method3739(this.field3117);
                this.field3121 = this.field3117;
                while (arg2 > 0) {
                    int var9 = this.field3115.method3758(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field3121 += (long) var9;
                    this.field3117 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method3781();
                int var10 = arg2;
                if (arg2 > this.field3114) {
                    var10 = this.field3114;
                }
                System.arraycopy(this.field3118, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field3117 += (long) var10;
            }
            if (this.field3116 != -1L) {
                if (this.field3116 > this.field3117 && arg2 > 0) {
                    int var11 = (int) (this.field3116 - this.field3117) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field3117++;
                    }
                }
                long var12 = -1L;
                long var14 = -1L;
                if (this.field3116 >= var4 && this.field3116 < (long) var7 + var4) {
                    var12 = this.field3116;
                } else if (var4 >= this.field3116 && var4 < this.field3116 + (long) this.field3111) {
                    var12 = var4;
                }
                if (this.field3116 + (long) this.field3111 > var4 && this.field3116 + (long) this.field3111 <= (long) var7 + var4) {
                    var14 = this.field3116 + (long) this.field3111;
                } else if ((long) var7 + var4 > this.field3116 && (long) var7 + var4 <= this.field3116 + (long) this.field3111) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field3112, (int) (var12 - this.field3116), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field3117) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field3117));
                        this.field3117 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field3121 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("hj.r(I)V")
    public void method3781() throws IOException {
        this.field3114 = 0;
        if (this.field3121 != this.field3117) {
            this.field3115.method3739(this.field3117);
            this.field3121 = this.field3117;
        }
        this.field3113 = this.field3117;
        while (this.field3114 < this.field3118.length) {
            int var1 = this.field3115.method3758(this.field3118, this.field3114, this.field3118.length - this.field3114);
            if (var1 == -1) {
                break;
            }
            this.field3121 += (long) var1;
            this.field3114 += var1;
        }
    }

    @ObfuscatedName("hj.v([BIII)V")
    public void method3769(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field3117 + (long) arg2 > this.field3120) {
                this.field3120 = this.field3117 + (long) arg2;
            }
            if (this.field3116 != -1L && (this.field3117 < this.field3116 || this.field3117 > this.field3116 + (long) this.field3111)) {
                this.method3770();
            }
            if (this.field3116 != -1L && this.field3117 + (long) arg2 > this.field3116 + (long) this.field3112.length) {
                int var4 = (int) ((long) this.field3112.length - (this.field3117 - this.field3116));
                System.arraycopy(arg0, arg1, this.field3112, (int) (this.field3117 - this.field3116), var4);
                this.field3117 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field3111 = this.field3112.length;
                this.method3770();
            }
            if (arg2 > this.field3112.length) {
                if (this.field3121 != this.field3117) {
                    this.field3115.method3739(this.field3117);
                    this.field3121 = this.field3117;
                }
                this.field3115.method3740(arg0, arg1, arg2);
                this.field3121 += (long) arg2;
                if (this.field3121 > this.field3119) {
                    this.field3119 = this.field3121;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field3117 >= this.field3113 && this.field3117 < this.field3113 + (long) this.field3114) {
                    var5 = this.field3117;
                } else if (this.field3113 >= this.field3117 && this.field3113 < this.field3117 + (long) arg2) {
                    var5 = this.field3113;
                }
                if (this.field3117 + (long) arg2 > this.field3113 && this.field3117 + (long) arg2 <= this.field3113 + (long) this.field3114) {
                    var7 = this.field3117 + (long) arg2;
                } else if (this.field3113 + (long) this.field3114 > this.field3117 && this.field3113 + (long) this.field3114 <= this.field3117 + (long) arg2) {
                    var7 = this.field3113 + (long) this.field3114;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field3117), this.field3118, (int) (var5 - this.field3113), var9);
                }
                this.field3117 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field3116 == -1L) {
                    this.field3116 = this.field3117;
                }
                System.arraycopy(arg0, arg1, this.field3112, (int) (this.field3117 - this.field3116), arg2);
                this.field3117 += (long) arg2;
                if (this.field3117 - this.field3116 > (long) this.field3111) {
                    this.field3111 = (int) (this.field3117 - this.field3116);
                }
            }
        } catch (IOException var11) {
            this.field3121 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("hj.y(B)V")
    public void method3770() throws IOException {
        if (this.field3116 == -1L) {
            return;
        }
        if (this.field3121 != this.field3116) {
            this.field3115.method3739(this.field3116);
            this.field3121 = this.field3116;
        }
        this.field3115.method3740(this.field3112, 0, this.field3111);
        this.field3121 += (long) (this.field3111 * 1732396139) * 1841186883L;
        if (this.field3121 > this.field3119) {
            this.field3119 = this.field3121;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field3116 >= this.field3113 && this.field3116 < this.field3113 + (long) this.field3114) {
            var1 = this.field3116;
        } else if (this.field3113 >= this.field3116 && this.field3113 < this.field3116 + (long) this.field3111) {
            var1 = this.field3113;
        }
        if (this.field3116 + (long) this.field3111 > this.field3113 && this.field3116 + (long) this.field3111 <= this.field3113 + (long) this.field3114) {
            var3 = this.field3116 + (long) this.field3111;
        } else if (this.field3113 + (long) this.field3114 > this.field3116 && this.field3113 + (long) this.field3114 <= this.field3116 + (long) this.field3111) {
            var3 = this.field3113 + (long) this.field3114;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field3112, (int) (var1 - this.field3116), this.field3118, (int) (var1 - this.field3113), var5);
        }
        this.field3116 = -1L;
        this.field3111 = 0;
    }
}
