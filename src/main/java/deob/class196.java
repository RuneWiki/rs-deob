package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("gg")
public class class196 {

    @ObfuscatedName("gg.e")
    public class195 field2936;

    @ObfuscatedName("gg.v")
    public byte[] field2937;

    @ObfuscatedName("gg.i")
    public long field2929 = -1L;

    @ObfuscatedName("gg.g")
    public int field2930;

    @ObfuscatedName("gg.x")
    public byte[] field2931;

    @ObfuscatedName("gg.b")
    public long field2932 = -1L;

    @ObfuscatedName("gg.q")
    public int field2933 = 0;

    @ObfuscatedName("gg.l")
    public long field2927;

    @ObfuscatedName("gg.m")
    public long field2935;

    @ObfuscatedName("gg.u")
    public long field2928;

    @ObfuscatedName("gg.s")
    public long field2934;

    public class196(class195 arg0, int arg1, int arg2) throws IOException {
        this.field2936 = arg0;
        this.field2928 = this.field2935 = arg0.method3392();
        this.field2937 = new byte[arg1];
        this.field2931 = new byte[arg2];
        this.field2927 = 0L;
    }

    @ObfuscatedName("gg.e(I)V")
    public void method3411() throws IOException {
        this.method3427();
        this.field2936.method3389();
    }

    @ObfuscatedName("gg.v(J)V")
    public void method3426(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field2927 = arg0;
    }

    @ObfuscatedName("gg.i(B)J")
    public long method3413() {
        return this.field2928;
    }

    @ObfuscatedName("gg.g([BI)V")
    public void method3418(byte[] arg0) throws IOException {
        this.method3414(arg0, 0, arg0.length);
    }

    @ObfuscatedName("gg.x([BIII)V")
    public void method3414(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field2932 != -1L && this.field2927 >= this.field2932 && this.field2927 + (long) arg2 <= this.field2932 + (long) this.field2933) {
                System.arraycopy(this.field2931, (int) (this.field2927 - this.field2932), arg0, arg1, arg2);
                this.field2927 += (long) arg2;
                return;
            }
            long var4 = this.field2927;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field2927 >= this.field2929 && this.field2927 < this.field2929 + (long) this.field2930) {
                int var8 = (int) ((long) this.field2930 - (this.field2927 - this.field2929));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field2937, (int) (this.field2927 - this.field2929), arg0, arg1, var8);
                this.field2927 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field2937.length) {
                this.field2936.method3390(this.field2927);
                this.field2934 = this.field2927;
                while (arg2 > 0) {
                    int var9 = this.field2936.method3393(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field2934 += (long) var9;
                    this.field2927 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method3416();
                int var10 = arg2;
                if (arg2 > this.field2930) {
                    var10 = this.field2930;
                }
                System.arraycopy(this.field2937, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field2927 += (long) var10;
            }
            if (this.field2932 != -1L) {
                if (this.field2932 > this.field2927 && arg2 > 0) {
                    int var11 = (int) (this.field2932 - this.field2927) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field2927++;
                    }
                }
                long var12 = -1L;
                long var14 = -1L;
                if (this.field2932 >= var4 && this.field2932 < (long) var7 + var4) {
                    var12 = this.field2932;
                } else if (var4 >= this.field2932 && var4 < this.field2932 + (long) this.field2933) {
                    var12 = var4;
                }
                if (this.field2932 + (long) this.field2933 > var4 && this.field2932 + (long) this.field2933 <= (long) var7 + var4) {
                    var14 = this.field2932 + (long) this.field2933;
                } else if ((long) var7 + var4 > this.field2932 && (long) var7 + var4 <= this.field2932 + (long) this.field2933) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field2931, (int) (var12 - this.field2932), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field2927) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field2927));
                        this.field2927 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field2934 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("gg.b(I)V")
    public void method3416() throws IOException {
        this.field2930 = 0;
        if (this.field2934 != this.field2927) {
            this.field2936.method3390(this.field2927);
            this.field2934 = this.field2927;
        }
        this.field2929 = this.field2927;
        while (this.field2930 < this.field2937.length) {
            int var1 = this.field2936.method3393(this.field2937, this.field2930, this.field2937.length - this.field2930);
            if (var1 == -1) {
                break;
            }
            this.field2934 += (long) var1;
            this.field2930 += var1;
        }
    }

    @ObfuscatedName("gg.q([BIII)V")
    public void method3417(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field2927 + (long) arg2 > this.field2928) {
                this.field2928 = this.field2927 + (long) arg2;
            }
            if (this.field2932 != -1L && (this.field2927 < this.field2932 || this.field2927 > this.field2932 + (long) this.field2933)) {
                this.method3427();
            }
            if (this.field2932 != -1L && this.field2927 + (long) arg2 > this.field2932 + (long) this.field2931.length) {
                int var4 = (int) ((long) this.field2931.length - (this.field2927 - this.field2932));
                System.arraycopy(arg0, arg1, this.field2931, (int) (this.field2927 - this.field2932), var4);
                this.field2927 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field2933 = this.field2931.length;
                this.method3427();
            }
            if (arg2 > this.field2931.length) {
                if (this.field2934 != this.field2927) {
                    this.field2936.method3390(this.field2927);
                    this.field2934 = this.field2927;
                }
                this.field2936.method3391(arg0, arg1, arg2);
                this.field2934 += (long) arg2;
                if (this.field2934 > this.field2935) {
                    this.field2935 = this.field2934;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field2927 >= this.field2929 && this.field2927 < this.field2929 + (long) this.field2930) {
                    var5 = this.field2927;
                } else if (this.field2929 >= this.field2927 && this.field2929 < this.field2927 + (long) arg2) {
                    var5 = this.field2929;
                }
                if (this.field2927 + (long) arg2 > this.field2929 && this.field2927 + (long) arg2 <= this.field2929 + (long) this.field2930) {
                    var7 = this.field2927 + (long) arg2;
                } else if (this.field2929 + (long) this.field2930 > this.field2927 && this.field2929 + (long) this.field2930 <= this.field2927 + (long) arg2) {
                    var7 = this.field2929 + (long) this.field2930;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field2927), this.field2937, (int) (var5 - this.field2929), var9);
                }
                this.field2927 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field2932 == -1L) {
                    this.field2932 = this.field2927;
                }
                System.arraycopy(arg0, arg1, this.field2931, (int) (this.field2927 - this.field2932), arg2);
                this.field2927 += (long) arg2;
                if (this.field2927 - this.field2932 > (long) this.field2933) {
                    this.field2933 = (int) (this.field2927 - this.field2932);
                }
            }
        } catch (IOException var11) {
            this.field2934 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("gg.l(I)V")
    public void method3427() throws IOException {
        if (this.field2932 == -1L) {
            return;
        }
        if (this.field2934 != this.field2932) {
            this.field2936.method3390(this.field2932);
            this.field2934 = this.field2932;
        }
        this.field2936.method3391(this.field2931, 0, this.field2933);
        this.field2934 += (long) (this.field2933 * 924429335) * -174437465L;
        if (this.field2934 > this.field2935) {
            this.field2935 = this.field2934;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field2932 >= this.field2929 && this.field2932 < this.field2929 + (long) this.field2930) {
            var1 = this.field2932;
        } else if (this.field2929 >= this.field2932 && this.field2929 < this.field2932 + (long) this.field2933) {
            var1 = this.field2929;
        }
        if (this.field2932 + (long) this.field2933 > this.field2929 && this.field2932 + (long) this.field2933 <= this.field2929 + (long) this.field2930) {
            var3 = this.field2932 + (long) this.field2933;
        } else if (this.field2929 + (long) this.field2930 > this.field2932 && this.field2929 + (long) this.field2930 <= this.field2932 + (long) this.field2933) {
            var3 = this.field2929 + (long) this.field2930;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field2931, (int) (var1 - this.field2932), this.field2937, (int) (var1 - this.field2929), var5);
        }
        this.field2932 = -1L;
        this.field2933 = 0;
    }
}
