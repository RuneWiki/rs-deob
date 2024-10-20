package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("gp")
public class class208 {

    @ObfuscatedName("gp.l")
    public class207 field2991;

    @ObfuscatedName("gp.y")
    public byte[] field2985;

    @ObfuscatedName("gp.g")
    public long field2986 = -1L;

    @ObfuscatedName("gp.j")
    public int field2993;

    @ObfuscatedName("gp.w")
    public byte[] field2988;

    @ObfuscatedName("gp.c")
    public long field2989 = -1L;

    @ObfuscatedName("gp.x")
    public int field2984 = 0;

    @ObfuscatedName("gp.f")
    public long field2994;

    @ObfuscatedName("gp.t")
    public long field2992;

    @ObfuscatedName("gp.n")
    public long field2987;

    @ObfuscatedName("gp.p")
    public long field2990;

    public class208(class207 arg0, int arg1, int arg2) throws IOException {
        this.field2991 = arg0;
        this.field2987 = this.field2992 = arg0.method3586();
        this.field2985 = new byte[arg1];
        this.field2988 = new byte[arg2];
        this.field2994 = 0L;
    }

    @ObfuscatedName("gp.l(I)V")
    public void method3627() throws IOException {
        this.method3615();
        this.field2991.method3588();
    }

    @ObfuscatedName("gp.y(J)V")
    public void method3610(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field2994 = arg0;
    }

    @ObfuscatedName("gp.g(B)J")
    public long method3609() {
        return this.field2987;
    }

    @ObfuscatedName("gp.j([BI)V")
    public void method3608(byte[] arg0) throws IOException {
        this.method3612(arg0, 0, arg0.length);
    }

    @ObfuscatedName("gp.w([BIII)V")
    public void method3612(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field2989 != -1L && this.field2994 >= this.field2989 && this.field2994 + (long) arg2 <= this.field2989 + (long) this.field2984) {
                System.arraycopy(this.field2988, (int) (this.field2994 - this.field2989), arg0, arg1, arg2);
                this.field2994 += (long) arg2;
                return;
            }
            long var4 = this.field2994;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field2994 >= this.field2986 && this.field2994 < this.field2986 + (long) this.field2993) {
                int var8 = (int) ((long) this.field2993 - (this.field2994 - this.field2986));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field2985, (int) (this.field2994 - this.field2986), arg0, arg1, var8);
                this.field2994 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field2985.length) {
                this.field2991.method3584(this.field2994);
                this.field2990 = this.field2994;
                while (arg2 > 0) {
                    int var9 = this.field2991.method3605(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field2990 += (long) var9;
                    this.field2994 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method3613();
                int var10 = arg2;
                if (arg2 > this.field2993) {
                    var10 = this.field2993;
                }
                System.arraycopy(this.field2985, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field2994 += (long) var10;
            }
            if (this.field2989 != -1L) {
                if (this.field2989 > this.field2994 && arg2 > 0) {
                    int var11 = (int) (this.field2989 - this.field2994) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field2994++;
                    }
                }
                long var12 = -1L;
                long var14 = -1L;
                if (this.field2989 >= var4 && this.field2989 < (long) var7 + var4) {
                    var12 = this.field2989;
                } else if (var4 >= this.field2989 && var4 < this.field2989 + (long) this.field2984) {
                    var12 = var4;
                }
                if (this.field2989 + (long) this.field2984 > var4 && this.field2989 + (long) this.field2984 <= (long) var7 + var4) {
                    var14 = this.field2989 + (long) this.field2984;
                } else if ((long) var7 + var4 > this.field2989 && (long) var7 + var4 <= this.field2989 + (long) this.field2984) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field2988, (int) (var12 - this.field2989), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field2994) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field2994));
                        this.field2994 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field2990 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("gp.c(B)V")
    public void method3613() throws IOException {
        this.field2993 = 0;
        if (this.field2994 != this.field2990) {
            this.field2991.method3584(this.field2994);
            this.field2990 = this.field2994;
        }
        this.field2986 = this.field2994;
        while (this.field2993 < this.field2985.length) {
            int var1 = this.field2991.method3605(this.field2985, this.field2993, this.field2985.length - this.field2993);
            if (var1 == -1) {
                break;
            }
            this.field2990 += (long) var1;
            this.field2993 += var1;
        }
    }

    @ObfuscatedName("gp.x([BIII)V")
    public void method3614(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field2994 + (long) arg2 > this.field2987) {
                this.field2987 = this.field2994 + (long) arg2;
            }
            if (this.field2989 != -1L && (this.field2994 < this.field2989 || this.field2994 > this.field2989 + (long) this.field2984)) {
                this.method3615();
            }
            if (this.field2989 != -1L && this.field2994 + (long) arg2 > this.field2989 + (long) this.field2988.length) {
                int var4 = (int) ((long) this.field2988.length - (this.field2994 - this.field2989));
                System.arraycopy(arg0, arg1, this.field2988, (int) (this.field2994 - this.field2989), var4);
                this.field2994 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field2984 = this.field2988.length;
                this.method3615();
            }
            if (arg2 > this.field2988.length) {
                if (this.field2994 != this.field2990) {
                    this.field2991.method3584(this.field2994);
                    this.field2990 = this.field2994;
                }
                this.field2991.method3606(arg0, arg1, arg2);
                this.field2990 += (long) arg2;
                if (this.field2990 > this.field2992) {
                    this.field2992 = this.field2990;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field2994 >= this.field2986 && this.field2994 < this.field2986 + (long) this.field2993) {
                    var5 = this.field2994;
                } else if (this.field2986 >= this.field2994 && this.field2986 < this.field2994 + (long) arg2) {
                    var5 = this.field2986;
                }
                if (this.field2994 + (long) arg2 > this.field2986 && this.field2994 + (long) arg2 <= this.field2986 + (long) this.field2993) {
                    var7 = this.field2994 + (long) arg2;
                } else if (this.field2986 + (long) this.field2993 > this.field2994 && this.field2986 + (long) this.field2993 <= this.field2994 + (long) arg2) {
                    var7 = this.field2986 + (long) this.field2993;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field2994), this.field2985, (int) (var5 - this.field2986), var9);
                }
                this.field2994 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field2989 == -1L) {
                    this.field2989 = this.field2994;
                }
                System.arraycopy(arg0, arg1, this.field2988, (int) (this.field2994 - this.field2989), arg2);
                this.field2994 += (long) arg2;
                if (this.field2994 - this.field2989 > (long) this.field2984) {
                    this.field2984 = (int) (this.field2994 - this.field2989);
                }
            }
        } catch (IOException var11) {
            this.field2990 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("gp.f(I)V")
    public void method3615() throws IOException {
        if (this.field2989 == -1L) {
            return;
        }
        if (this.field2990 != this.field2989) {
            this.field2991.method3584(this.field2989);
            this.field2990 = this.field2989;
        }
        this.field2991.method3606(this.field2988, 0, this.field2984);
        this.field2990 += (long) (this.field2984 * -21500793) * -263907017L;
        if (this.field2990 > this.field2992) {
            this.field2992 = this.field2990;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field2989 >= this.field2986 && this.field2989 < this.field2986 + (long) this.field2993) {
            var1 = this.field2989;
        } else if (this.field2986 >= this.field2989 && this.field2986 < this.field2989 + (long) this.field2984) {
            var1 = this.field2986;
        }
        if (this.field2989 + (long) this.field2984 > this.field2986 && this.field2989 + (long) this.field2984 <= this.field2986 + (long) this.field2993) {
            var3 = this.field2989 + (long) this.field2984;
        } else if (this.field2986 + (long) this.field2993 > this.field2989 && this.field2986 + (long) this.field2993 <= this.field2989 + (long) this.field2984) {
            var3 = this.field2986 + (long) this.field2993;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field2988, (int) (var1 - this.field2989), this.field2985, (int) (var1 - this.field2986), var5);
        }
        this.field2989 = -1L;
        this.field2984 = 0;
    }
}
