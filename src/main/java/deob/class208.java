package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("gb")
public class class208 {

    @ObfuscatedName("gb.x")
    public class207 field2991;

    @ObfuscatedName("gb.v")
    public byte[] field2979;

    @ObfuscatedName("gb.m")
    public long field2986 = -1L;

    @ObfuscatedName("gb.e")
    public int field2982;

    @ObfuscatedName("gb.h")
    public byte[] field2983;

    @ObfuscatedName("gb.p")
    public long field2984 = -1L;

    @ObfuscatedName("gb.j")
    public int field2980 = 0;

    @ObfuscatedName("gb.i")
    public long field2985;

    @ObfuscatedName("gb.u")
    public long field2987;

    @ObfuscatedName("gb.l")
    public long field2988;

    @ObfuscatedName("gb.k")
    public long field2989;

    public class208(class207 arg0, int arg1, int arg2) throws IOException {
        this.field2991 = arg0;
        this.field2988 = this.field2987 = arg0.method3561();
        this.field2979 = new byte[arg1];
        this.field2983 = new byte[arg2];
        this.field2985 = 0L;
    }

    @ObfuscatedName("gb.x(I)V")
    public void method3600() throws IOException {
        this.method3587();
        this.field2991.method3560();
    }

    @ObfuscatedName("gb.v(J)V")
    public void method3576(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field2985 = arg0;
    }

    @ObfuscatedName("gb.m(S)J")
    public long method3577() {
        return this.field2988;
    }

    @ObfuscatedName("gb.e([BI)V")
    public void method3578(byte[] arg0) throws IOException {
        this.method3575(arg0, 0, arg0.length);
    }

    @ObfuscatedName("gb.h([BIII)V")
    public void method3575(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field2984 != -1L && this.field2985 >= this.field2984 && this.field2985 + (long) arg2 <= this.field2984 + (long) this.field2980) {
                System.arraycopy(this.field2983, (int) (this.field2985 - this.field2984), arg0, arg1, arg2);
                this.field2985 += (long) arg2;
                return;
            }
            long var4 = this.field2985;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field2985 >= this.field2986 && this.field2985 < this.field2986 + (long) this.field2982) {
                int var8 = (int) ((long) this.field2982 - (this.field2985 - this.field2986));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field2979, (int) (this.field2985 - this.field2986), arg0, arg1, var8);
                this.field2985 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field2979.length) {
                this.field2991.method3557(this.field2985);
                this.field2989 = this.field2985;
                while (arg2 > 0) {
                    int var9 = this.field2991.method3562(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field2989 += (long) var9;
                    this.field2985 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method3584();
                int var10 = arg2;
                if (arg2 > this.field2982) {
                    var10 = this.field2982;
                }
                System.arraycopy(this.field2979, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field2985 += (long) var10;
            }
            if (this.field2984 != -1L) {
                if (this.field2984 > this.field2985 && arg2 > 0) {
                    int var11 = (int) (this.field2984 - this.field2985) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field2985++;
                    }
                }
                long var12 = -1L;
                long var14 = -1L;
                if (this.field2984 >= var4 && this.field2984 < (long) var7 + var4) {
                    var12 = this.field2984;
                } else if (var4 >= this.field2984 && var4 < this.field2984 + (long) this.field2980) {
                    var12 = var4;
                }
                if (this.field2984 + (long) this.field2980 > var4 && this.field2984 + (long) this.field2980 <= (long) var7 + var4) {
                    var14 = this.field2984 + (long) this.field2980;
                } else if ((long) var7 + var4 > this.field2984 && (long) var7 + var4 <= this.field2984 + (long) this.field2980) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field2983, (int) (var12 - this.field2984), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field2985) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field2985));
                        this.field2985 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field2989 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("gb.p(B)V")
    public void method3584() throws IOException {
        this.field2982 = 0;
        if (this.field2989 != this.field2985) {
            this.field2991.method3557(this.field2985);
            this.field2989 = this.field2985;
        }
        this.field2986 = this.field2985;
        while (this.field2982 < this.field2979.length) {
            int var1 = this.field2991.method3562(this.field2979, this.field2982, this.field2979.length - this.field2982);
            if (var1 == -1) {
                break;
            }
            this.field2989 += (long) var1;
            this.field2982 += var1;
        }
    }

    @ObfuscatedName("gb.j([BIIB)V")
    public void method3581(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field2985 + (long) arg2 > this.field2988) {
                this.field2988 = this.field2985 + (long) arg2;
            }
            if (this.field2984 != -1L && (this.field2985 < this.field2984 || this.field2985 > this.field2984 + (long) this.field2980)) {
                this.method3587();
            }
            if (this.field2984 != -1L && this.field2985 + (long) arg2 > this.field2984 + (long) this.field2983.length) {
                int var4 = (int) ((long) this.field2983.length - (this.field2985 - this.field2984));
                System.arraycopy(arg0, arg1, this.field2983, (int) (this.field2985 - this.field2984), var4);
                this.field2985 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field2980 = this.field2983.length;
                this.method3587();
            }
            if (arg2 > this.field2983.length) {
                if (this.field2989 != this.field2985) {
                    this.field2991.method3557(this.field2985);
                    this.field2989 = this.field2985;
                }
                this.field2991.method3559(arg0, arg1, arg2);
                this.field2989 += (long) arg2;
                if (this.field2989 > this.field2987) {
                    this.field2987 = this.field2989;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field2985 >= this.field2986 && this.field2985 < this.field2986 + (long) this.field2982) {
                    var5 = this.field2985;
                } else if (this.field2986 >= this.field2985 && this.field2986 < this.field2985 + (long) arg2) {
                    var5 = this.field2986;
                }
                if (this.field2985 + (long) arg2 > this.field2986 && this.field2985 + (long) arg2 <= this.field2986 + (long) this.field2982) {
                    var7 = this.field2985 + (long) arg2;
                } else if (this.field2986 + (long) this.field2982 > this.field2985 && this.field2986 + (long) this.field2982 <= this.field2985 + (long) arg2) {
                    var7 = this.field2986 + (long) this.field2982;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field2985), this.field2979, (int) (var5 - this.field2986), var9);
                }
                this.field2985 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field2984 == -1L) {
                    this.field2984 = this.field2985;
                }
                System.arraycopy(arg0, arg1, this.field2983, (int) (this.field2985 - this.field2984), arg2);
                this.field2985 += (long) arg2;
                if (this.field2985 - this.field2984 > (long) this.field2980) {
                    this.field2980 = (int) (this.field2985 - this.field2984);
                }
            }
        } catch (IOException var11) {
            this.field2989 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("gb.i(S)V")
    public void method3587() throws IOException {
        if (this.field2984 == -1L) {
            return;
        }
        if (this.field2989 != this.field2984) {
            this.field2991.method3557(this.field2984);
            this.field2989 = this.field2984;
        }
        this.field2991.method3559(this.field2983, 0, this.field2980);
        this.field2989 += (long) (this.field2980 * -1243778951) * 1264974281L;
        if (this.field2989 > this.field2987) {
            this.field2987 = this.field2989;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field2984 >= this.field2986 && this.field2984 < this.field2986 + (long) this.field2982) {
            var1 = this.field2984;
        } else if (this.field2986 >= this.field2984 && this.field2986 < this.field2984 + (long) this.field2980) {
            var1 = this.field2986;
        }
        if (this.field2984 + (long) this.field2980 > this.field2986 && this.field2984 + (long) this.field2980 <= this.field2986 + (long) this.field2982) {
            var3 = this.field2984 + (long) this.field2980;
        } else if (this.field2986 + (long) this.field2982 > this.field2984 && this.field2986 + (long) this.field2982 <= this.field2984 + (long) this.field2980) {
            var3 = this.field2986 + (long) this.field2982;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field2983, (int) (var1 - this.field2984), this.field2979, (int) (var1 - this.field2986), var5);
        }
        this.field2984 = -1L;
        this.field2980 = 0;
    }
}
