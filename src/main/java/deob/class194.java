package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("gu")
public class class194 {

    @ObfuscatedName("gu.b")
    public class193 field2929;

    @ObfuscatedName("gu.u")
    public byte[] field2927;

    @ObfuscatedName("gu.x")
    public long field2923 = -1L;

    @ObfuscatedName("gu.j")
    public int field2924;

    @ObfuscatedName("gu.o")
    public byte[] field2922;

    @ObfuscatedName("gu.n")
    public long field2926 = -1L;

    @ObfuscatedName("gu.y")
    public int field2930 = 0;

    @ObfuscatedName("gu.f")
    public long field2925;

    @ObfuscatedName("gu.p")
    public long field2928;

    @ObfuscatedName("gu.l")
    public long field2921;

    @ObfuscatedName("gu.k")
    public long field2931;

    public class194(class193 arg0, int arg1, int arg2) throws IOException {
        this.field2929 = arg0;
        this.field2921 = this.field2928 = arg0.method3394();
        this.field2927 = new byte[arg1];
        this.field2922 = new byte[arg2];
        this.field2925 = 0L;
    }

    @ObfuscatedName("gu.b(B)V")
    public void method3413() throws IOException {
        this.method3418();
        this.field2929.method3399();
    }

    @ObfuscatedName("gu.u(J)V")
    public void method3414(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field2925 = arg0;
    }

    @ObfuscatedName("gu.x(I)J")
    public long method3415() {
        return this.field2921;
    }

    @ObfuscatedName("gu.j([BB)V")
    public void method3416(byte[] arg0) throws IOException {
        this.method3417(arg0, 0, arg0.length);
    }

    @ObfuscatedName("gu.o([BIII)V")
    public void method3417(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field2926 != -1L && this.field2925 >= this.field2926 && this.field2925 + (long) arg2 <= this.field2926 + (long) this.field2930) {
                System.arraycopy(this.field2922, (int) (this.field2925 - this.field2926), arg0, arg1, arg2);
                this.field2925 += (long) arg2;
                return;
            }
            long var4 = this.field2925;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field2925 >= this.field2923 && this.field2925 < this.field2923 + (long) this.field2924) {
                int var8 = (int) ((long) this.field2924 - (this.field2925 - this.field2923));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field2927, (int) (this.field2925 - this.field2923), arg0, arg1, var8);
                this.field2925 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field2927.length) {
                this.field2929.method3410(this.field2925);
                this.field2931 = this.field2925;
                while (arg2 > 0) {
                    int var9 = this.field2929.method3395(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field2931 += (long) var9;
                    this.field2925 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method3420();
                int var10 = arg2;
                if (arg2 > this.field2924) {
                    var10 = this.field2924;
                }
                System.arraycopy(this.field2927, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field2925 += (long) var10;
            }
            if (this.field2926 != -1L) {
                if (this.field2926 > this.field2925 && arg2 > 0) {
                    int var11 = (int) (this.field2926 - this.field2925) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field2925++;
                    }
                }
                long var12 = -1L;
                long var14 = -1L;
                if (this.field2926 >= var4 && this.field2926 < (long) var7 + var4) {
                    var12 = this.field2926;
                } else if (var4 >= this.field2926 && var4 < this.field2926 + (long) this.field2930) {
                    var12 = var4;
                }
                if (this.field2926 + (long) this.field2930 > var4 && this.field2926 + (long) this.field2930 <= (long) var7 + var4) {
                    var14 = this.field2926 + (long) this.field2930;
                } else if ((long) var7 + var4 > this.field2926 && (long) var7 + var4 <= this.field2926 + (long) this.field2930) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field2922, (int) (var12 - this.field2926), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field2925) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field2925));
                        this.field2925 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field2931 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("gu.n(I)V")
    public void method3420() throws IOException {
        this.field2924 = 0;
        if (this.field2931 != this.field2925) {
            this.field2929.method3410(this.field2925);
            this.field2931 = this.field2925;
        }
        this.field2923 = this.field2925;
        while (this.field2924 < this.field2927.length) {
            int var1 = this.field2929.method3395(this.field2927, this.field2924, this.field2927.length - this.field2924);
            if (var1 == -1) {
                break;
            }
            this.field2931 += (long) var1;
            this.field2924 += var1;
        }
    }

    @ObfuscatedName("gu.y([BIII)V")
    public void method3419(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field2925 + (long) arg2 > this.field2921) {
                this.field2921 = this.field2925 + (long) arg2;
            }
            if (this.field2926 != -1L && (this.field2925 < this.field2926 || this.field2925 > this.field2926 + (long) this.field2930)) {
                this.method3418();
            }
            if (this.field2926 != -1L && this.field2925 + (long) arg2 > this.field2926 + (long) this.field2922.length) {
                int var4 = (int) ((long) this.field2922.length - (this.field2925 - this.field2926));
                System.arraycopy(arg0, arg1, this.field2922, (int) (this.field2925 - this.field2926), var4);
                this.field2925 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field2930 = this.field2922.length;
                this.method3418();
            }
            if (arg2 > this.field2922.length) {
                if (this.field2931 != this.field2925) {
                    this.field2929.method3410(this.field2925);
                    this.field2931 = this.field2925;
                }
                this.field2929.method3392(arg0, arg1, arg2);
                this.field2931 += (long) arg2;
                if (this.field2931 > this.field2928) {
                    this.field2928 = this.field2931;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field2925 >= this.field2923 && this.field2925 < this.field2923 + (long) this.field2924) {
                    var5 = this.field2925;
                } else if (this.field2923 >= this.field2925 && this.field2923 < this.field2925 + (long) arg2) {
                    var5 = this.field2923;
                }
                if (this.field2925 + (long) arg2 > this.field2923 && this.field2925 + (long) arg2 <= this.field2923 + (long) this.field2924) {
                    var7 = this.field2925 + (long) arg2;
                } else if (this.field2923 + (long) this.field2924 > this.field2925 && this.field2923 + (long) this.field2924 <= this.field2925 + (long) arg2) {
                    var7 = this.field2923 + (long) this.field2924;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field2925), this.field2927, (int) (var5 - this.field2923), var9);
                }
                this.field2925 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field2926 == -1L) {
                    this.field2926 = this.field2925;
                }
                System.arraycopy(arg0, arg1, this.field2922, (int) (this.field2925 - this.field2926), arg2);
                this.field2925 += (long) arg2;
                if (this.field2925 - this.field2926 > (long) this.field2930) {
                    this.field2930 = (int) (this.field2925 - this.field2926);
                }
            }
        } catch (IOException var11) {
            this.field2931 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("gu.f(S)V")
    public void method3418() throws IOException {
        if (this.field2926 == -1L) {
            return;
        }
        if (this.field2931 != this.field2926) {
            this.field2929.method3410(this.field2926);
            this.field2931 = this.field2926;
        }
        this.field2929.method3392(this.field2922, 0, this.field2930);
        this.field2931 += (long) (this.field2930 * -521979533) * 1574474683L;
        if (this.field2931 > this.field2928) {
            this.field2928 = this.field2931;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field2926 >= this.field2923 && this.field2926 < this.field2923 + (long) this.field2924) {
            var1 = this.field2926;
        } else if (this.field2923 >= this.field2926 && this.field2923 < this.field2926 + (long) this.field2930) {
            var1 = this.field2923;
        }
        if (this.field2926 + (long) this.field2930 > this.field2923 && this.field2926 + (long) this.field2930 <= this.field2923 + (long) this.field2924) {
            var3 = this.field2926 + (long) this.field2930;
        } else if (this.field2923 + (long) this.field2924 > this.field2926 && this.field2923 + (long) this.field2924 <= this.field2926 + (long) this.field2930) {
            var3 = this.field2923 + (long) this.field2924;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field2922, (int) (var1 - this.field2926), this.field2927, (int) (var1 - this.field2923), var5);
        }
        this.field2926 = -1L;
        this.field2930 = 0;
    }
}
