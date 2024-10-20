package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("hi")
public class class219 {

    @ObfuscatedName("hi.b")
    public class218 field3123;

    @ObfuscatedName("hi.e")
    public byte[] field3112;

    @ObfuscatedName("hi.a")
    public long field3113 = -1L;

    @ObfuscatedName("hi.k")
    public int field3115;

    @ObfuscatedName("hi.p")
    public byte[] field3117;

    @ObfuscatedName("hi.l")
    public long field3120 = -1L;

    @ObfuscatedName("hi.u")
    public int field3116 = 0;

    @ObfuscatedName("hi.o")
    public long field3114;

    @ObfuscatedName("hi.m")
    public long field3119;

    @ObfuscatedName("hi.q")
    public long field3111;

    @ObfuscatedName("hi.v")
    public long field3121;

    public class219(class218 arg0, int arg1, int arg2) throws IOException {
        this.field3123 = arg0;
        this.field3111 = this.field3119 = arg0.method3630();
        this.field3112 = new byte[arg1];
        this.field3117 = new byte[arg2];
        this.field3114 = 0L;
    }

    @ObfuscatedName("hi.b(B)V")
    public void method3667() throws IOException {
        this.method3653();
        this.field3123.method3632();
    }

    @ObfuscatedName("hi.e(J)V")
    public void method3646(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field3114 = arg0;
    }

    @ObfuscatedName("hi.a(B)J")
    public long method3648() {
        return this.field3111;
    }

    @ObfuscatedName("hi.k([BB)V")
    public void method3649(byte[] arg0) throws IOException {
        this.method3662(arg0, 0, arg0.length);
    }

    @ObfuscatedName("hi.p([BIII)V")
    public void method3662(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field3120 != -1L && this.field3114 >= this.field3120 && this.field3114 + (long) arg2 <= this.field3120 + (long) this.field3116) {
                System.arraycopy(this.field3117, (int) (this.field3114 - this.field3120), arg0, arg1, arg2);
                this.field3114 += (long) arg2;
                return;
            }
            long var4 = this.field3114;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field3114 >= this.field3113 && this.field3114 < this.field3113 + (long) this.field3115) {
                int var8 = (int) ((long) this.field3115 - (this.field3114 - this.field3113));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field3112, (int) (this.field3114 - this.field3113), arg0, arg1, var8);
                this.field3114 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field3112.length) {
                this.field3123.method3627(this.field3114);
                this.field3121 = this.field3114;
                while (arg2 > 0) {
                    int var9 = this.field3123.method3631(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field3121 += (long) var9;
                    this.field3114 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method3651();
                int var10 = arg2;
                if (arg2 > this.field3115) {
                    var10 = this.field3115;
                }
                System.arraycopy(this.field3112, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field3114 += (long) var10;
            }
            if (this.field3120 != -1L) {
                if (this.field3120 > this.field3114 && arg2 > 0) {
                    int var11 = (int) (this.field3120 - this.field3114) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field3114++;
                    }
                }
                long var12 = -1L;
                long var14 = -1L;
                if (this.field3120 >= var4 && this.field3120 < (long) var7 + var4) {
                    var12 = this.field3120;
                } else if (var4 >= this.field3120 && var4 < this.field3120 + (long) this.field3116) {
                    var12 = var4;
                }
                if (this.field3120 + (long) this.field3116 > var4 && this.field3120 + (long) this.field3116 <= (long) var7 + var4) {
                    var14 = this.field3120 + (long) this.field3116;
                } else if ((long) var7 + var4 > this.field3120 && (long) var7 + var4 <= this.field3120 + (long) this.field3116) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field3117, (int) (var12 - this.field3120), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field3114) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field3114));
                        this.field3114 = var14;
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

    @ObfuscatedName("hi.l(B)V")
    public void method3651() throws IOException {
        this.field3115 = 0;
        if (this.field3121 != this.field3114) {
            this.field3123.method3627(this.field3114);
            this.field3121 = this.field3114;
        }
        this.field3113 = this.field3114;
        while (this.field3115 < this.field3112.length) {
            int var1 = this.field3123.method3631(this.field3112, this.field3115, this.field3112.length - this.field3115);
            if (var1 == -1) {
                break;
            }
            this.field3121 += (long) var1;
            this.field3115 += var1;
        }
    }

    @ObfuscatedName("hi.u([BIIB)V")
    public void method3652(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field3114 + (long) arg2 > this.field3111) {
                this.field3111 = this.field3114 + (long) arg2;
            }
            if (this.field3120 != -1L && (this.field3114 < this.field3120 || this.field3114 > this.field3120 + (long) this.field3116)) {
                this.method3653();
            }
            if (this.field3120 != -1L && this.field3114 + (long) arg2 > this.field3120 + (long) this.field3117.length) {
                int var4 = (int) ((long) this.field3117.length - (this.field3114 - this.field3120));
                System.arraycopy(arg0, arg1, this.field3117, (int) (this.field3114 - this.field3120), var4);
                this.field3114 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field3116 = this.field3117.length;
                this.method3653();
            }
            if (arg2 > this.field3117.length) {
                if (this.field3121 != this.field3114) {
                    this.field3123.method3627(this.field3114);
                    this.field3121 = this.field3114;
                }
                this.field3123.method3626(arg0, arg1, arg2);
                this.field3121 += (long) arg2;
                if (this.field3121 > this.field3119) {
                    this.field3119 = this.field3121;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field3114 >= this.field3113 && this.field3114 < this.field3113 + (long) this.field3115) {
                    var5 = this.field3114;
                } else if (this.field3113 >= this.field3114 && this.field3113 < this.field3114 + (long) arg2) {
                    var5 = this.field3113;
                }
                if (this.field3114 + (long) arg2 > this.field3113 && this.field3114 + (long) arg2 <= this.field3113 + (long) this.field3115) {
                    var7 = this.field3114 + (long) arg2;
                } else if (this.field3113 + (long) this.field3115 > this.field3114 && this.field3113 + (long) this.field3115 <= this.field3114 + (long) arg2) {
                    var7 = this.field3113 + (long) this.field3115;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field3114), this.field3112, (int) (var5 - this.field3113), var9);
                }
                this.field3114 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field3120 == -1L) {
                    this.field3120 = this.field3114;
                }
                System.arraycopy(arg0, arg1, this.field3117, (int) (this.field3114 - this.field3120), arg2);
                this.field3114 += (long) arg2;
                if (this.field3114 - this.field3120 > (long) this.field3116) {
                    this.field3116 = (int) (this.field3114 - this.field3120);
                }
            }
        } catch (IOException var11) {
            this.field3121 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("hi.o(I)V")
    public void method3653() throws IOException {
        if (this.field3120 == -1L) {
            return;
        }
        if (this.field3121 != this.field3120) {
            this.field3123.method3627(this.field3120);
            this.field3121 = this.field3120;
        }
        this.field3123.method3626(this.field3117, 0, this.field3116);
        this.field3121 += (long) (this.field3116 * 2074116507) * -632030061L;
        if (this.field3121 > this.field3119) {
            this.field3119 = this.field3121;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field3120 >= this.field3113 && this.field3120 < this.field3113 + (long) this.field3115) {
            var1 = this.field3120;
        } else if (this.field3113 >= this.field3120 && this.field3113 < this.field3120 + (long) this.field3116) {
            var1 = this.field3113;
        }
        if (this.field3120 + (long) this.field3116 > this.field3113 && this.field3120 + (long) this.field3116 <= this.field3113 + (long) this.field3115) {
            var3 = this.field3120 + (long) this.field3116;
        } else if (this.field3113 + (long) this.field3115 > this.field3120 && this.field3113 + (long) this.field3115 <= this.field3120 + (long) this.field3116) {
            var3 = this.field3113 + (long) this.field3115;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field3117, (int) (var1 - this.field3120), this.field3112, (int) (var1 - this.field3113), var5);
        }
        this.field3120 = -1L;
        this.field3116 = 0;
    }
}
