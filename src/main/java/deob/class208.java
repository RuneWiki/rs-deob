package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("gx")
public class class208 {

    @ObfuscatedName("gx.c")
    public class207 field2993;

    @ObfuscatedName("gx.j")
    public byte[] field2986;

    @ObfuscatedName("gx.y")
    public long field2987 = -1L;

    @ObfuscatedName("gx.r")
    public int field2988;

    @ObfuscatedName("gx.f")
    public byte[] field2989;

    @ObfuscatedName("gx.l")
    public long field2991 = -1L;

    @ObfuscatedName("gx.b")
    public int field2985 = 0;

    @ObfuscatedName("gx.k")
    public long field2992;

    @ObfuscatedName("gx.g")
    public long field2990;

    @ObfuscatedName("gx.v")
    public long field2994;

    @ObfuscatedName("gx.i")
    public long field2995;

    public class208(class207 arg0, int arg1, int arg2) throws IOException {
        this.field2993 = arg0;
        this.field2994 = this.field2990 = arg0.method3530();
        this.field2986 = new byte[arg1];
        this.field2989 = new byte[arg2];
        this.field2992 = 0L;
    }

    @ObfuscatedName("gx.c(B)V")
    public void method3572() throws IOException {
        this.method3558();
        this.field2993.method3529();
    }

    @ObfuscatedName("gx.j(J)V")
    public void method3549(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field2992 = arg0;
    }

    @ObfuscatedName("gx.y(B)J")
    public long method3550() {
        return this.field2994;
    }

    @ObfuscatedName("gx.r([BB)V")
    public void method3551(byte[] arg0) throws IOException {
        this.method3552(arg0, 0, arg0.length);
    }

    @ObfuscatedName("gx.f([BIII)V")
    public void method3552(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field2991 != -1L && this.field2992 >= this.field2991 && this.field2992 + (long) arg2 <= this.field2991 + (long) this.field2985) {
                System.arraycopy(this.field2989, (int) (this.field2992 - this.field2991), arg0, arg1, arg2);
                this.field2992 += (long) arg2;
                return;
            }
            long var4 = this.field2992;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field2992 >= this.field2987 && this.field2992 < this.field2987 + (long) this.field2988) {
                int var8 = (int) ((long) this.field2988 - (this.field2992 - this.field2987));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field2986, (int) (this.field2992 - this.field2987), arg0, arg1, var8);
                this.field2992 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field2986.length) {
                this.field2993.method3527(this.field2992);
                this.field2995 = this.field2992;
                while (arg2 > 0) {
                    int var9 = this.field2993.method3538(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field2995 += (long) var9;
                    this.field2992 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method3553();
                int var10 = arg2;
                if (arg2 > this.field2988) {
                    var10 = this.field2988;
                }
                System.arraycopy(this.field2986, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field2992 += (long) var10;
            }
            if (this.field2991 != -1L) {
                if (this.field2991 > this.field2992 && arg2 > 0) {
                    int var11 = (int) (this.field2991 - this.field2992) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field2992++;
                    }
                }
                long var12 = -1L;
                long var14 = -1L;
                if (this.field2991 >= var4 && this.field2991 < (long) var7 + var4) {
                    var12 = this.field2991;
                } else if (var4 >= this.field2991 && var4 < this.field2991 + (long) this.field2985) {
                    var12 = var4;
                }
                if (this.field2991 + (long) this.field2985 > var4 && this.field2991 + (long) this.field2985 <= (long) var7 + var4) {
                    var14 = this.field2991 + (long) this.field2985;
                } else if ((long) var7 + var4 > this.field2991 && (long) var7 + var4 <= this.field2991 + (long) this.field2985) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field2989, (int) (var12 - this.field2991), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field2992) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field2992));
                        this.field2992 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field2995 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("gx.l(B)V")
    public void method3553() throws IOException {
        this.field2988 = 0;
        if (this.field2995 != this.field2992) {
            this.field2993.method3527(this.field2992);
            this.field2995 = this.field2992;
        }
        this.field2987 = this.field2992;
        while (this.field2988 < this.field2986.length) {
            int var1 = this.field2993.method3538(this.field2986, this.field2988, this.field2986.length - this.field2988);
            if (var1 == -1) {
                break;
            }
            this.field2995 += (long) var1;
            this.field2988 += var1;
        }
    }

    @ObfuscatedName("gx.b([BIII)V")
    public void method3554(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field2992 + (long) arg2 > this.field2994) {
                this.field2994 = this.field2992 + (long) arg2;
            }
            if (this.field2991 != -1L && (this.field2992 < this.field2991 || this.field2992 > this.field2991 + (long) this.field2985)) {
                this.method3558();
            }
            if (this.field2991 != -1L && this.field2992 + (long) arg2 > this.field2991 + (long) this.field2989.length) {
                int var4 = (int) ((long) this.field2989.length - (this.field2992 - this.field2991));
                System.arraycopy(arg0, arg1, this.field2989, (int) (this.field2992 - this.field2991), var4);
                this.field2992 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field2985 = this.field2989.length;
                this.method3558();
            }
            if (arg2 > this.field2989.length) {
                if (this.field2995 != this.field2992) {
                    this.field2993.method3527(this.field2992);
                    this.field2995 = this.field2992;
                }
                this.field2993.method3528(arg0, arg1, arg2);
                this.field2995 += (long) arg2;
                if (this.field2995 > this.field2990) {
                    this.field2990 = this.field2995;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field2992 >= this.field2987 && this.field2992 < this.field2987 + (long) this.field2988) {
                    var5 = this.field2992;
                } else if (this.field2987 >= this.field2992 && this.field2987 < this.field2992 + (long) arg2) {
                    var5 = this.field2987;
                }
                if (this.field2992 + (long) arg2 > this.field2987 && this.field2992 + (long) arg2 <= this.field2987 + (long) this.field2988) {
                    var7 = this.field2992 + (long) arg2;
                } else if (this.field2987 + (long) this.field2988 > this.field2992 && this.field2987 + (long) this.field2988 <= this.field2992 + (long) arg2) {
                    var7 = this.field2987 + (long) this.field2988;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field2992), this.field2986, (int) (var5 - this.field2987), var9);
                }
                this.field2992 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field2991 == -1L) {
                    this.field2991 = this.field2992;
                }
                System.arraycopy(arg0, arg1, this.field2989, (int) (this.field2992 - this.field2991), arg2);
                this.field2992 += (long) arg2;
                if (this.field2992 - this.field2991 > (long) this.field2985) {
                    this.field2985 = (int) (this.field2992 - this.field2991);
                }
            }
        } catch (IOException var11) {
            this.field2995 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("gx.k(B)V")
    public void method3558() throws IOException {
        if (this.field2991 == -1L) {
            return;
        }
        if (this.field2995 != this.field2991) {
            this.field2993.method3527(this.field2991);
            this.field2995 = this.field2991;
        }
        this.field2993.method3528(this.field2989, 0, this.field2985);
        this.field2995 += (long) (this.field2985 * -585253175) * 334805881L;
        if (this.field2995 > this.field2990) {
            this.field2990 = this.field2995;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field2991 >= this.field2987 && this.field2991 < this.field2987 + (long) this.field2988) {
            var1 = this.field2991;
        } else if (this.field2987 >= this.field2991 && this.field2987 < this.field2991 + (long) this.field2985) {
            var1 = this.field2987;
        }
        if (this.field2991 + (long) this.field2985 > this.field2987 && this.field2991 + (long) this.field2985 <= this.field2987 + (long) this.field2988) {
            var3 = this.field2991 + (long) this.field2985;
        } else if (this.field2987 + (long) this.field2988 > this.field2991 && this.field2987 + (long) this.field2988 <= this.field2991 + (long) this.field2985) {
            var3 = this.field2987 + (long) this.field2988;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field2989, (int) (var1 - this.field2991), this.field2986, (int) (var1 - this.field2987), var5);
        }
        this.field2991 = -1L;
        this.field2985 = 0;
    }
}
