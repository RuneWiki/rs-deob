package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("gi")
public class class208 {

    @ObfuscatedName("gi.f")
    public class207 field2984;

    @ObfuscatedName("gi.k")
    public byte[] field2982;

    @ObfuscatedName("gi.y")
    public long field2985 = -1L;

    @ObfuscatedName("gi.e")
    public int field2981;

    @ObfuscatedName("gi.r")
    public byte[] field2989;

    @ObfuscatedName("gi.a")
    public long field2986 = -1L;

    @ObfuscatedName("gi.n")
    public int field2987 = 0;

    @ObfuscatedName("gi.x")
    public long field2983;

    @ObfuscatedName("gi.g")
    public long field2988;

    @ObfuscatedName("gi.o")
    public long field2990;

    @ObfuscatedName("gi.p")
    public long field2991;

    public class208(class207 arg0, int arg1, int arg2) throws IOException {
        this.field2984 = arg0;
        this.field2990 = this.field2988 = arg0.method3556();
        this.field2982 = new byte[arg1];
        this.field2989 = new byte[arg2];
        this.field2983 = 0L;
    }

    @ObfuscatedName("gi.f(I)V")
    public void method3583() throws IOException {
        this.method3579();
        this.field2984.method3562();
    }

    @ObfuscatedName("gi.k(J)V")
    public void method3576(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field2983 = arg0;
    }

    @ObfuscatedName("gi.y(I)J")
    public long method3577() {
        return this.field2990;
    }

    @ObfuscatedName("gi.e([BI)V")
    public void method3578(byte[] arg0) throws IOException {
        this.method3587(arg0, 0, arg0.length);
    }

    @ObfuscatedName("gi.r([BIII)V")
    public void method3587(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field2986 != -1L && this.field2983 >= this.field2986 && this.field2983 + (long) arg2 <= this.field2986 + (long) this.field2987) {
                System.arraycopy(this.field2989, (int) (this.field2983 - this.field2986), arg0, arg1, arg2);
                this.field2983 += (long) arg2;
                return;
            }
            long var4 = this.field2983;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field2983 >= this.field2985 && this.field2983 < this.field2985 + (long) this.field2981) {
                int var8 = (int) ((long) this.field2981 - (this.field2983 - this.field2985));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field2982, (int) (this.field2983 - this.field2985), arg0, arg1, var8);
                this.field2983 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field2982.length) {
                this.field2984.method3565(this.field2983);
                this.field2991 = this.field2983;
                while (arg2 > 0) {
                    int var9 = this.field2984.method3553(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field2991 += (long) var9;
                    this.field2983 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method3580();
                int var10 = arg2;
                if (arg2 > this.field2981) {
                    var10 = this.field2981;
                }
                System.arraycopy(this.field2982, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field2983 += (long) var10;
            }
            if (this.field2986 != -1L) {
                if (this.field2986 > this.field2983 && arg2 > 0) {
                    int var11 = (int) (this.field2986 - this.field2983) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field2983++;
                    }
                }
                long var12 = -1L;
                long var14 = -1L;
                if (this.field2986 >= var4 && this.field2986 < (long) var7 + var4) {
                    var12 = this.field2986;
                } else if (var4 >= this.field2986 && var4 < this.field2986 + (long) this.field2987) {
                    var12 = var4;
                }
                if (this.field2986 + (long) this.field2987 > var4 && this.field2986 + (long) this.field2987 <= (long) var7 + var4) {
                    var14 = this.field2986 + (long) this.field2987;
                } else if ((long) var7 + var4 > this.field2986 && (long) var7 + var4 <= this.field2986 + (long) this.field2987) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field2989, (int) (var12 - this.field2986), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field2983) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field2983));
                        this.field2983 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field2991 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("gi.a(B)V")
    public void method3580() throws IOException {
        this.field2981 = 0;
        if (this.field2991 != this.field2983) {
            this.field2984.method3565(this.field2983);
            this.field2991 = this.field2983;
        }
        this.field2985 = this.field2983;
        while (this.field2981 < this.field2982.length) {
            int var1 = this.field2984.method3553(this.field2982, this.field2981, this.field2982.length - this.field2981);
            if (var1 == -1) {
                break;
            }
            this.field2991 += (long) var1;
            this.field2981 += var1;
        }
    }

    @ObfuscatedName("gi.n([BIIB)V")
    public void method3581(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field2983 + (long) arg2 > this.field2990) {
                this.field2990 = this.field2983 + (long) arg2;
            }
            if (this.field2986 != -1L && (this.field2983 < this.field2986 || this.field2983 > this.field2986 + (long) this.field2987)) {
                this.method3579();
            }
            if (this.field2986 != -1L && this.field2983 + (long) arg2 > this.field2986 + (long) this.field2989.length) {
                int var4 = (int) ((long) this.field2989.length - (this.field2983 - this.field2986));
                System.arraycopy(arg0, arg1, this.field2989, (int) (this.field2983 - this.field2986), var4);
                this.field2983 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field2987 = this.field2989.length;
                this.method3579();
            }
            if (arg2 > this.field2989.length) {
                if (this.field2991 != this.field2983) {
                    this.field2984.method3565(this.field2983);
                    this.field2991 = this.field2983;
                }
                this.field2984.method3555(arg0, arg1, arg2);
                this.field2991 += (long) arg2;
                if (this.field2991 > this.field2988) {
                    this.field2988 = this.field2991;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field2983 >= this.field2985 && this.field2983 < this.field2985 + (long) this.field2981) {
                    var5 = this.field2983;
                } else if (this.field2985 >= this.field2983 && this.field2985 < this.field2983 + (long) arg2) {
                    var5 = this.field2985;
                }
                if (this.field2983 + (long) arg2 > this.field2985 && this.field2983 + (long) arg2 <= this.field2985 + (long) this.field2981) {
                    var7 = this.field2983 + (long) arg2;
                } else if (this.field2985 + (long) this.field2981 > this.field2983 && this.field2985 + (long) this.field2981 <= this.field2983 + (long) arg2) {
                    var7 = this.field2985 + (long) this.field2981;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field2983), this.field2982, (int) (var5 - this.field2985), var9);
                }
                this.field2983 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field2986 == -1L) {
                    this.field2986 = this.field2983;
                }
                System.arraycopy(arg0, arg1, this.field2989, (int) (this.field2983 - this.field2986), arg2);
                this.field2983 += (long) arg2;
                if (this.field2983 - this.field2986 > (long) this.field2987) {
                    this.field2987 = (int) (this.field2983 - this.field2986);
                }
            }
        } catch (IOException var11) {
            this.field2991 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("gi.x(I)V")
    public void method3579() throws IOException {
        if (this.field2986 == -1L) {
            return;
        }
        if (this.field2991 != this.field2986) {
            this.field2984.method3565(this.field2986);
            this.field2991 = this.field2986;
        }
        this.field2984.method3555(this.field2989, 0, this.field2987);
        this.field2991 += (long) (this.field2987 * 1660641567) * -1519461665L;
        if (this.field2991 > this.field2988) {
            this.field2988 = this.field2991;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field2986 >= this.field2985 && this.field2986 < this.field2985 + (long) this.field2981) {
            var1 = this.field2986;
        } else if (this.field2985 >= this.field2986 && this.field2985 < this.field2986 + (long) this.field2987) {
            var1 = this.field2985;
        }
        if (this.field2986 + (long) this.field2987 > this.field2985 && this.field2986 + (long) this.field2987 <= this.field2985 + (long) this.field2981) {
            var3 = this.field2986 + (long) this.field2987;
        } else if (this.field2985 + (long) this.field2981 > this.field2986 && this.field2985 + (long) this.field2981 <= this.field2986 + (long) this.field2987) {
            var3 = this.field2985 + (long) this.field2981;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field2989, (int) (var1 - this.field2986), this.field2982, (int) (var1 - this.field2985), var5);
        }
        this.field2986 = -1L;
        this.field2987 = 0;
    }
}
