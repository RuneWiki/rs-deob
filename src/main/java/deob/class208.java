package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("gt")
public class class208 {

    @ObfuscatedName("gt.g")
    public class207 field2994;

    @ObfuscatedName("gt.j")
    public byte[] field2985;

    @ObfuscatedName("gt.z")
    public long field2986 = -1L;

    @ObfuscatedName("gt.b")
    public int field2987;

    @ObfuscatedName("gt.k")
    public byte[] field2988;

    @ObfuscatedName("gt.c")
    public long field2989 = -1L;

    @ObfuscatedName("gt.w")
    public int field2984 = 0;

    @ObfuscatedName("gt.l")
    public long field2991;

    @ObfuscatedName("gt.n")
    public long field2992;

    @ObfuscatedName("gt.d")
    public long field2993;

    @ObfuscatedName("gt.h")
    public long field2990;

    public class208(class207 arg0, int arg1, int arg2) throws IOException {
        this.field2994 = arg0;
        this.field2993 = this.field2992 = arg0.method3437();
        this.field2985 = new byte[arg1];
        this.field2988 = new byte[arg2];
        this.field2991 = 0L;
    }

    @ObfuscatedName("gt.g(I)V")
    public void method3459() throws IOException {
        this.method3464();
        this.field2994.method3449();
    }

    @ObfuscatedName("gt.j(J)V")
    public void method3473(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field2991 = arg0;
    }

    @ObfuscatedName("gt.z(B)J")
    public long method3460() {
        return this.field2993;
    }

    @ObfuscatedName("gt.b([BI)V")
    public void method3461(byte[] arg0) throws IOException {
        this.method3475(arg0, 0, arg0.length);
    }

    @ObfuscatedName("gt.k([BIIB)V")
    public void method3475(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field2989 != -1L && this.field2991 >= this.field2989 && this.field2991 + (long) arg2 <= this.field2989 + (long) this.field2984) {
                System.arraycopy(this.field2988, (int) (this.field2991 - this.field2989), arg0, arg1, arg2);
                this.field2991 += (long) arg2;
                return;
            }
            long var4 = this.field2991;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field2991 >= this.field2986 && this.field2991 < this.field2986 + (long) this.field2987) {
                int var8 = (int) ((long) this.field2987 - (this.field2991 - this.field2986));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field2985, (int) (this.field2991 - this.field2986), arg0, arg1, var8);
                this.field2991 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field2985.length) {
                this.field2994.method3435(this.field2991);
                this.field2990 = this.field2991;
                while (arg2 > 0) {
                    int var9 = this.field2994.method3450(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field2990 += (long) var9;
                    this.field2991 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method3462();
                int var10 = arg2;
                if (arg2 > this.field2987) {
                    var10 = this.field2987;
                }
                System.arraycopy(this.field2985, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field2991 += (long) var10;
            }
            if (this.field2989 != -1L) {
                if (this.field2989 > this.field2991 && arg2 > 0) {
                    int var11 = (int) (this.field2989 - this.field2991) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field2991++;
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
                    if (var14 > this.field2991) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field2991));
                        this.field2991 = var14;
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

    @ObfuscatedName("gt.c(I)V")
    public void method3462() throws IOException {
        this.field2987 = 0;
        if (this.field2991 != this.field2990) {
            this.field2994.method3435(this.field2991);
            this.field2990 = this.field2991;
        }
        this.field2986 = this.field2991;
        while (this.field2987 < this.field2985.length) {
            int var1 = this.field2994.method3450(this.field2985, this.field2987, this.field2985.length - this.field2987);
            if (var1 == -1) {
                break;
            }
            this.field2990 += (long) var1;
            this.field2987 += var1;
        }
    }

    @ObfuscatedName("gt.w([BIIB)V")
    public void method3463(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field2991 + (long) arg2 > this.field2993) {
                this.field2993 = this.field2991 + (long) arg2;
            }
            if (this.field2989 != -1L && (this.field2991 < this.field2989 || this.field2991 > this.field2989 + (long) this.field2984)) {
                this.method3464();
            }
            if (this.field2989 != -1L && this.field2991 + (long) arg2 > this.field2989 + (long) this.field2988.length) {
                int var4 = (int) ((long) this.field2988.length - (this.field2991 - this.field2989));
                System.arraycopy(arg0, arg1, this.field2988, (int) (this.field2991 - this.field2989), var4);
                this.field2991 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field2984 = this.field2988.length;
                this.method3464();
            }
            if (arg2 > this.field2988.length) {
                if (this.field2991 != this.field2990) {
                    this.field2994.method3435(this.field2991);
                    this.field2990 = this.field2991;
                }
                this.field2994.method3436(arg0, arg1, arg2);
                this.field2990 += (long) arg2;
                if (this.field2990 > this.field2992) {
                    this.field2992 = this.field2990;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field2991 >= this.field2986 && this.field2991 < this.field2986 + (long) this.field2987) {
                    var5 = this.field2991;
                } else if (this.field2986 >= this.field2991 && this.field2986 < this.field2991 + (long) arg2) {
                    var5 = this.field2986;
                }
                if (this.field2991 + (long) arg2 > this.field2986 && this.field2991 + (long) arg2 <= this.field2986 + (long) this.field2987) {
                    var7 = this.field2991 + (long) arg2;
                } else if (this.field2986 + (long) this.field2987 > this.field2991 && this.field2986 + (long) this.field2987 <= this.field2991 + (long) arg2) {
                    var7 = this.field2986 + (long) this.field2987;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field2991), this.field2985, (int) (var5 - this.field2986), var9);
                }
                this.field2991 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field2989 == -1L) {
                    this.field2989 = this.field2991;
                }
                System.arraycopy(arg0, arg1, this.field2988, (int) (this.field2991 - this.field2989), arg2);
                this.field2991 += (long) arg2;
                if (this.field2991 - this.field2989 > (long) this.field2984) {
                    this.field2984 = (int) (this.field2991 - this.field2989);
                }
            }
        } catch (IOException var11) {
            this.field2990 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("gt.l(B)V")
    public void method3464() throws IOException {
        if (this.field2989 == -1L) {
            return;
        }
        if (this.field2990 != this.field2989) {
            this.field2994.method3435(this.field2989);
            this.field2990 = this.field2989;
        }
        this.field2994.method3436(this.field2988, 0, this.field2984);
        this.field2990 += (long) (this.field2984 * -1154991479) * 912743353L;
        if (this.field2990 > this.field2992) {
            this.field2992 = this.field2990;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field2989 >= this.field2986 && this.field2989 < this.field2986 + (long) this.field2987) {
            var1 = this.field2989;
        } else if (this.field2986 >= this.field2989 && this.field2986 < this.field2989 + (long) this.field2984) {
            var1 = this.field2986;
        }
        if (this.field2989 + (long) this.field2984 > this.field2986 && this.field2989 + (long) this.field2984 <= this.field2986 + (long) this.field2987) {
            var3 = this.field2989 + (long) this.field2984;
        } else if (this.field2986 + (long) this.field2987 > this.field2989 && this.field2986 + (long) this.field2987 <= this.field2989 + (long) this.field2984) {
            var3 = this.field2986 + (long) this.field2987;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field2988, (int) (var1 - this.field2989), this.field2985, (int) (var1 - this.field2986), var5);
        }
        this.field2989 = -1L;
        this.field2984 = 0;
    }
}
