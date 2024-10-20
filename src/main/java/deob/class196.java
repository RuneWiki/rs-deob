package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("ga")
public class class196 {

    @ObfuscatedName("ga.t")
    public class195 field2932;

    @ObfuscatedName("ga.o")
    public byte[] field2926;

    @ObfuscatedName("ga.i")
    public long field2933 = -1L;

    @ObfuscatedName("ga.p")
    public int field2928;

    @ObfuscatedName("ga.c")
    public byte[] field2929;

    @ObfuscatedName("ga.y")
    public long field2930 = -1L;

    @ObfuscatedName("ga.g")
    public int field2931 = 0;

    @ObfuscatedName("ga.l")
    public long field2925;

    @ObfuscatedName("ga.h")
    public long field2927;

    @ObfuscatedName("ga.n")
    public long field2934;

    @ObfuscatedName("ga.w")
    public long field2935;

    public class196(class195 arg0, int arg1, int arg2) throws IOException {
        this.field2932 = arg0;
        this.field2934 = this.field2927 = arg0.method3384();
        this.field2926 = new byte[arg1];
        this.field2929 = new byte[arg2];
        this.field2925 = 0L;
    }

    @ObfuscatedName("ga.t(I)V")
    public void method3399() throws IOException {
        this.method3398();
        this.field2932.method3383();
    }

    @ObfuscatedName("ga.o(J)V")
    public void method3400(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field2925 = arg0;
    }

    @ObfuscatedName("ga.i(I)J")
    public long method3401() {
        return this.field2934;
    }

    @ObfuscatedName("ga.p([BI)V")
    public void method3413(byte[] arg0) throws IOException {
        this.method3422(arg0, 0, arg0.length);
    }

    @ObfuscatedName("ga.c([BIIB)V")
    public void method3422(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field2930 != -1L && this.field2925 >= this.field2930 && this.field2925 + (long) arg2 <= this.field2930 + (long) this.field2931) {
                System.arraycopy(this.field2929, (int) (this.field2925 - this.field2930), arg0, arg1, arg2);
                this.field2925 += (long) arg2;
                return;
            }
            long var4 = this.field2925;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field2925 >= this.field2933 && this.field2925 < this.field2933 + (long) this.field2928) {
                int var8 = (int) ((long) this.field2928 - (this.field2925 - this.field2933));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field2926, (int) (this.field2925 - this.field2933), arg0, arg1, var8);
                this.field2925 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field2926.length) {
                this.field2932.method3380(this.field2925);
                this.field2935 = this.field2925;
                while (arg2 > 0) {
                    int var9 = this.field2932.method3388(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field2935 += (long) var9;
                    this.field2925 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method3404();
                int var10 = arg2;
                if (arg2 > this.field2928) {
                    var10 = this.field2928;
                }
                System.arraycopy(this.field2926, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field2925 += (long) var10;
            }
            if (this.field2930 != -1L) {
                if (this.field2930 > this.field2925 && arg2 > 0) {
                    int var11 = (int) (this.field2930 - this.field2925) + arg1;
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
                if (this.field2930 >= var4 && this.field2930 < (long) var7 + var4) {
                    var12 = this.field2930;
                } else if (var4 >= this.field2930 && var4 < this.field2930 + (long) this.field2931) {
                    var12 = var4;
                }
                if (this.field2930 + (long) this.field2931 > var4 && this.field2930 + (long) this.field2931 <= (long) var7 + var4) {
                    var14 = this.field2930 + (long) this.field2931;
                } else if ((long) var7 + var4 > this.field2930 && (long) var7 + var4 <= this.field2930 + (long) this.field2931) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field2929, (int) (var12 - this.field2930), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field2925) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field2925));
                        this.field2925 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field2935 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("ga.y(I)V")
    public void method3404() throws IOException {
        this.field2928 = 0;
        if (this.field2935 != this.field2925) {
            this.field2932.method3380(this.field2925);
            this.field2935 = this.field2925;
        }
        this.field2933 = this.field2925;
        while (this.field2928 < this.field2926.length) {
            int var1 = this.field2932.method3388(this.field2926, this.field2928, this.field2926.length - this.field2928);
            if (var1 == -1) {
                break;
            }
            this.field2935 += (long) var1;
            this.field2928 += var1;
        }
    }

    @ObfuscatedName("ga.g([BIII)V")
    public void method3407(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field2925 + (long) arg2 > this.field2934) {
                this.field2934 = this.field2925 + (long) arg2;
            }
            if (this.field2930 != -1L && (this.field2925 < this.field2930 || this.field2925 > this.field2930 + (long) this.field2931)) {
                this.method3398();
            }
            if (this.field2930 != -1L && this.field2925 + (long) arg2 > this.field2930 + (long) this.field2929.length) {
                int var4 = (int) ((long) this.field2929.length - (this.field2925 - this.field2930));
                System.arraycopy(arg0, arg1, this.field2929, (int) (this.field2925 - this.field2930), var4);
                this.field2925 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field2931 = this.field2929.length;
                this.method3398();
            }
            if (arg2 > this.field2929.length) {
                if (this.field2935 != this.field2925) {
                    this.field2932.method3380(this.field2925);
                    this.field2935 = this.field2925;
                }
                this.field2932.method3382(arg0, arg1, arg2);
                this.field2935 += (long) arg2;
                if (this.field2935 > this.field2927) {
                    this.field2927 = this.field2935;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field2925 >= this.field2933 && this.field2925 < this.field2933 + (long) this.field2928) {
                    var5 = this.field2925;
                } else if (this.field2933 >= this.field2925 && this.field2933 < this.field2925 + (long) arg2) {
                    var5 = this.field2933;
                }
                if (this.field2925 + (long) arg2 > this.field2933 && this.field2925 + (long) arg2 <= this.field2933 + (long) this.field2928) {
                    var7 = this.field2925 + (long) arg2;
                } else if (this.field2933 + (long) this.field2928 > this.field2925 && this.field2933 + (long) this.field2928 <= this.field2925 + (long) arg2) {
                    var7 = this.field2933 + (long) this.field2928;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field2925), this.field2926, (int) (var5 - this.field2933), var9);
                }
                this.field2925 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field2930 == -1L) {
                    this.field2930 = this.field2925;
                }
                System.arraycopy(arg0, arg1, this.field2929, (int) (this.field2925 - this.field2930), arg2);
                this.field2925 += (long) arg2;
                if (this.field2925 - this.field2930 > (long) this.field2931) {
                    this.field2931 = (int) (this.field2925 - this.field2930);
                }
            }
        } catch (IOException var11) {
            this.field2935 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("ga.l(I)V")
    public void method3398() throws IOException {
        if (this.field2930 == -1L) {
            return;
        }
        if (this.field2935 != this.field2930) {
            this.field2932.method3380(this.field2930);
            this.field2935 = this.field2930;
        }
        this.field2932.method3382(this.field2929, 0, this.field2931);
        this.field2935 += (long) (this.field2931 * 1298154503) * -598480457L;
        if (this.field2935 > this.field2927) {
            this.field2927 = this.field2935;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field2930 >= this.field2933 && this.field2930 < this.field2933 + (long) this.field2928) {
            var1 = this.field2930;
        } else if (this.field2933 >= this.field2930 && this.field2933 < this.field2930 + (long) this.field2931) {
            var1 = this.field2933;
        }
        if (this.field2930 + (long) this.field2931 > this.field2933 && this.field2930 + (long) this.field2931 <= this.field2933 + (long) this.field2928) {
            var3 = this.field2930 + (long) this.field2931;
        } else if (this.field2933 + (long) this.field2928 > this.field2930 && this.field2933 + (long) this.field2928 <= this.field2930 + (long) this.field2931) {
            var3 = this.field2933 + (long) this.field2928;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field2929, (int) (var1 - this.field2930), this.field2926, (int) (var1 - this.field2933), var5);
        }
        this.field2930 = -1L;
        this.field2931 = 0;
    }
}
