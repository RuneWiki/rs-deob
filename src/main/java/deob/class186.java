package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("gv")
public class class186 {

    @ObfuscatedName("gv.z")
    public class185 field2887;

    @ObfuscatedName("gv.n")
    public byte[] field2880;

    @ObfuscatedName("gv.u")
    public long field2878 = -1L;

    @ObfuscatedName("gv.t")
    public int field2879;

    @ObfuscatedName("gv.e")
    public byte[] field2876;

    @ObfuscatedName("gv.a")
    public long field2881 = -1L;

    @ObfuscatedName("gv.l")
    public int field2884 = 0;

    @ObfuscatedName("gv.v")
    public long field2883;

    @ObfuscatedName("gv.j")
    public long field2877;

    @ObfuscatedName("gv.k")
    public long field2885;

    @ObfuscatedName("gv.g")
    public long field2886;

    public class186(class185 arg0, int arg1, int arg2) throws IOException {
        this.field2887 = arg0;
        this.field2885 = this.field2877 = arg0.method3398();
        this.field2880 = new byte[arg1];
        this.field2876 = new byte[arg2];
        this.field2883 = 0L;
    }

    @ObfuscatedName("gv.z(I)V")
    public void method3416() throws IOException {
        this.method3423();
        this.field2887.method3397();
    }

    @ObfuscatedName("gv.n(J)V")
    public void method3428(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field2883 = arg0;
    }

    @ObfuscatedName("gv.u(B)J")
    public long method3415() {
        return this.field2885;
    }

    @ObfuscatedName("gv.t([BI)V")
    public void method3419(byte[] arg0) throws IOException {
        this.method3417(arg0, 0, arg0.length);
    }

    @ObfuscatedName("gv.e([BIII)V")
    public void method3417(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field2881 != -1L && this.field2883 >= this.field2881 && this.field2883 + (long) arg2 <= this.field2881 + (long) this.field2884) {
                System.arraycopy(this.field2876, (int) (this.field2883 - this.field2881), arg0, arg1, arg2);
                this.field2883 += (long) arg2;
                return;
            }
            long var4 = this.field2883;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field2883 >= this.field2878 && this.field2883 < this.field2878 + (long) this.field2879) {
                int var8 = (int) ((long) this.field2879 - (this.field2883 - this.field2878));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field2880, (int) (this.field2883 - this.field2878), arg0, arg1, var8);
                this.field2883 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field2880.length) {
                this.field2887.method3399(this.field2883);
                this.field2886 = this.field2883;
                while (arg2 > 0) {
                    int var9 = this.field2887.method3401(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field2886 += (long) var9;
                    this.field2883 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method3420();
                int var10 = arg2;
                if (arg2 > this.field2879) {
                    var10 = this.field2879;
                }
                System.arraycopy(this.field2880, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field2883 += (long) var10;
            }
            if (this.field2881 != -1L) {
                if (this.field2881 > this.field2883 && arg2 > 0) {
                    int var11 = (int) (this.field2881 - this.field2883) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field2883++;
                    }
                }
                long var12 = -1L;
                long var14 = -1L;
                if (this.field2881 >= var4 && this.field2881 < (long) var7 + var4) {
                    var12 = this.field2881;
                } else if (var4 >= this.field2881 && var4 < this.field2881 + (long) this.field2884) {
                    var12 = var4;
                }
                if (this.field2881 + (long) this.field2884 > var4 && this.field2881 + (long) this.field2884 <= (long) var7 + var4) {
                    var14 = this.field2881 + (long) this.field2884;
                } else if ((long) var7 + var4 > this.field2881 && (long) var7 + var4 <= this.field2881 + (long) this.field2884) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field2876, (int) (var12 - this.field2881), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field2883) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field2883));
                        this.field2883 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field2886 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("gv.a(B)V")
    public void method3420() throws IOException {
        this.field2879 = 0;
        if (this.field2886 != this.field2883) {
            this.field2887.method3399(this.field2883);
            this.field2886 = this.field2883;
        }
        this.field2878 = this.field2883;
        while (this.field2879 < this.field2880.length) {
            int var1 = this.field2887.method3401(this.field2880, this.field2879, this.field2880.length - this.field2879);
            if (var1 == -1) {
                break;
            }
            this.field2886 += (long) var1;
            this.field2879 += var1;
        }
    }

    @ObfuscatedName("gv.l([BIII)V")
    public void method3435(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field2883 + (long) arg2 > this.field2885) {
                this.field2885 = this.field2883 + (long) arg2;
            }
            if (this.field2881 != -1L && (this.field2883 < this.field2881 || this.field2883 > this.field2881 + (long) this.field2884)) {
                this.method3423();
            }
            if (this.field2881 != -1L && this.field2883 + (long) arg2 > this.field2881 + (long) this.field2876.length) {
                int var4 = (int) ((long) this.field2876.length - (this.field2883 - this.field2881));
                System.arraycopy(arg0, arg1, this.field2876, (int) (this.field2883 - this.field2881), var4);
                this.field2883 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field2884 = this.field2876.length;
                this.method3423();
            }
            if (arg2 > this.field2876.length) {
                if (this.field2886 != this.field2883) {
                    this.field2887.method3399(this.field2883);
                    this.field2886 = this.field2883;
                }
                this.field2887.method3396(arg0, arg1, arg2);
                this.field2886 += (long) arg2;
                if (this.field2886 > this.field2877) {
                    this.field2877 = this.field2886;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field2883 >= this.field2878 && this.field2883 < this.field2878 + (long) this.field2879) {
                    var5 = this.field2883;
                } else if (this.field2878 >= this.field2883 && this.field2878 < this.field2883 + (long) arg2) {
                    var5 = this.field2878;
                }
                if (this.field2883 + (long) arg2 > this.field2878 && this.field2883 + (long) arg2 <= this.field2878 + (long) this.field2879) {
                    var7 = this.field2883 + (long) arg2;
                } else if (this.field2878 + (long) this.field2879 > this.field2883 && this.field2878 + (long) this.field2879 <= this.field2883 + (long) arg2) {
                    var7 = this.field2878 + (long) this.field2879;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field2883), this.field2880, (int) (var5 - this.field2878), var9);
                }
                this.field2883 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field2881 == -1L) {
                    this.field2881 = this.field2883;
                }
                System.arraycopy(arg0, arg1, this.field2876, (int) (this.field2883 - this.field2881), arg2);
                this.field2883 += (long) arg2;
                if (this.field2883 - this.field2881 > (long) this.field2884) {
                    this.field2884 = (int) (this.field2883 - this.field2881);
                }
            }
        } catch (IOException var11) {
            this.field2886 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("gv.v(I)V")
    public void method3423() throws IOException {
        if (this.field2881 == -1L) {
            return;
        }
        if (this.field2886 != this.field2881) {
            this.field2887.method3399(this.field2881);
            this.field2886 = this.field2881;
        }
        this.field2887.method3396(this.field2876, 0, this.field2884);
        this.field2886 += (long) (this.field2884 * 109217329) * 886117073L;
        if (this.field2886 > this.field2877) {
            this.field2877 = this.field2886;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field2881 >= this.field2878 && this.field2881 < this.field2878 + (long) this.field2879) {
            var1 = this.field2881;
        } else if (this.field2878 >= this.field2881 && this.field2878 < this.field2881 + (long) this.field2884) {
            var1 = this.field2878;
        }
        if (this.field2881 + (long) this.field2884 > this.field2878 && this.field2881 + (long) this.field2884 <= this.field2878 + (long) this.field2879) {
            var3 = this.field2881 + (long) this.field2884;
        } else if (this.field2878 + (long) this.field2879 > this.field2881 && this.field2878 + (long) this.field2879 <= this.field2881 + (long) this.field2884) {
            var3 = this.field2878 + (long) this.field2879;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field2876, (int) (var1 - this.field2881), this.field2880, (int) (var1 - this.field2878), var5);
        }
        this.field2881 = -1L;
        this.field2884 = 0;
    }
}
