package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("gx")
public class class196 {

    @ObfuscatedName("gx.g")
    public class195 field2933;

    @ObfuscatedName("gx.v")
    public byte[] field2938;

    @ObfuscatedName("gx.z")
    public long field2934 = -1L;

    @ObfuscatedName("gx.h")
    public int field2945;

    @ObfuscatedName("gx.k")
    public byte[] field2937;

    @ObfuscatedName("gx.l")
    public long field2935 = -1L;

    @ObfuscatedName("gx.e")
    public int field2939 = 0;

    @ObfuscatedName("gx.j")
    public long field2940;

    @ObfuscatedName("gx.n")
    public long field2941;

    @ObfuscatedName("gx.f")
    public long field2942;

    @ObfuscatedName("gx.a")
    public long field2943;

    public class196(class195 arg0, int arg1, int arg2) throws IOException {
        this.field2933 = arg0;
        this.field2942 = this.field2941 = arg0.method3431();
        this.field2938 = new byte[arg1];
        this.field2937 = new byte[arg2];
        this.field2940 = 0L;
    }

    @ObfuscatedName("gx.g(B)V")
    public void method3467() throws IOException {
        this.method3460();
        this.field2933.method3430();
    }

    @ObfuscatedName("gx.v(J)V")
    public void method3450(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field2940 = arg0;
    }

    @ObfuscatedName("gx.z(I)J")
    public long method3442() {
        return this.field2942;
    }

    @ObfuscatedName("gx.h([BI)V")
    public void method3451(byte[] arg0) throws IOException {
        this.method3444(arg0, 0, arg0.length);
    }

    @ObfuscatedName("gx.k([BIII)V")
    public void method3444(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field2935 != -1L && this.field2940 >= this.field2935 && this.field2940 + (long) arg2 <= this.field2935 + (long) this.field2939) {
                System.arraycopy(this.field2937, (int) (this.field2940 - this.field2935), arg0, arg1, arg2);
                this.field2940 += (long) arg2;
                return;
            }
            long var4 = this.field2940;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field2940 >= this.field2934 && this.field2940 < this.field2934 + (long) this.field2945) {
                int var8 = (int) ((long) this.field2945 - (this.field2940 - this.field2934));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field2938, (int) (this.field2940 - this.field2934), arg0, arg1, var8);
                this.field2940 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field2938.length) {
                this.field2933.method3428(this.field2940);
                this.field2943 = this.field2940;
                while (arg2 > 0) {
                    int var9 = this.field2933.method3434(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field2943 += (long) var9;
                    this.field2940 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method3445();
                int var10 = arg2;
                if (arg2 > this.field2945) {
                    var10 = this.field2945;
                }
                System.arraycopy(this.field2938, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field2940 += (long) var10;
            }
            if (this.field2935 != -1L) {
                if (this.field2935 > this.field2940 && arg2 > 0) {
                    int var11 = (int) (this.field2935 - this.field2940) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field2940++;
                    }
                }
                long var12 = -1L;
                long var14 = -1L;
                if (this.field2935 >= var4 && this.field2935 < (long) var7 + var4) {
                    var12 = this.field2935;
                } else if (var4 >= this.field2935 && var4 < this.field2935 + (long) this.field2939) {
                    var12 = var4;
                }
                if (this.field2935 + (long) this.field2939 > var4 && this.field2935 + (long) this.field2939 <= (long) var7 + var4) {
                    var14 = this.field2935 + (long) this.field2939;
                } else if ((long) var7 + var4 > this.field2935 && (long) var7 + var4 <= this.field2935 + (long) this.field2939) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field2937, (int) (var12 - this.field2935), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field2940) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field2940));
                        this.field2940 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field2943 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("gx.l(I)V")
    public void method3445() throws IOException {
        this.field2945 = 0;
        if (this.field2943 != this.field2940) {
            this.field2933.method3428(this.field2940);
            this.field2943 = this.field2940;
        }
        this.field2934 = this.field2940;
        while (this.field2945 < this.field2938.length) {
            int var1 = this.field2933.method3434(this.field2938, this.field2945, this.field2938.length - this.field2945);
            if (var1 == -1) {
                break;
            }
            this.field2943 += (long) var1;
            this.field2945 += var1;
        }
    }

    @ObfuscatedName("gx.e([BIII)V")
    public void method3446(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field2940 + (long) arg2 > this.field2942) {
                this.field2942 = this.field2940 + (long) arg2;
            }
            if (this.field2935 != -1L && (this.field2940 < this.field2935 || this.field2940 > this.field2935 + (long) this.field2939)) {
                this.method3460();
            }
            if (this.field2935 != -1L && this.field2940 + (long) arg2 > this.field2935 + (long) this.field2937.length) {
                int var4 = (int) ((long) this.field2937.length - (this.field2940 - this.field2935));
                System.arraycopy(arg0, arg1, this.field2937, (int) (this.field2940 - this.field2935), var4);
                this.field2940 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field2939 = this.field2937.length;
                this.method3460();
            }
            if (arg2 > this.field2937.length) {
                if (this.field2943 != this.field2940) {
                    this.field2933.method3428(this.field2940);
                    this.field2943 = this.field2940;
                }
                this.field2933.method3437(arg0, arg1, arg2);
                this.field2943 += (long) arg2;
                if (this.field2943 > this.field2941) {
                    this.field2941 = this.field2943;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field2940 >= this.field2934 && this.field2940 < this.field2934 + (long) this.field2945) {
                    var5 = this.field2940;
                } else if (this.field2934 >= this.field2940 && this.field2934 < this.field2940 + (long) arg2) {
                    var5 = this.field2934;
                }
                if (this.field2940 + (long) arg2 > this.field2934 && this.field2940 + (long) arg2 <= this.field2934 + (long) this.field2945) {
                    var7 = this.field2940 + (long) arg2;
                } else if (this.field2934 + (long) this.field2945 > this.field2940 && this.field2934 + (long) this.field2945 <= this.field2940 + (long) arg2) {
                    var7 = this.field2934 + (long) this.field2945;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field2940), this.field2938, (int) (var5 - this.field2934), var9);
                }
                this.field2940 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field2935 == -1L) {
                    this.field2935 = this.field2940;
                }
                System.arraycopy(arg0, arg1, this.field2937, (int) (this.field2940 - this.field2935), arg2);
                this.field2940 += (long) arg2;
                if (this.field2940 - this.field2935 > (long) this.field2939) {
                    this.field2939 = (int) (this.field2940 - this.field2935);
                }
            }
        } catch (IOException var11) {
            this.field2943 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("gx.j(I)V")
    public void method3460() throws IOException {
        if (this.field2935 == -1L) {
            return;
        }
        if (this.field2943 != this.field2935) {
            this.field2933.method3428(this.field2935);
            this.field2943 = this.field2935;
        }
        this.field2933.method3437(this.field2937, 0, this.field2939);
        this.field2943 += (long) (this.field2939 * 1330451627) * 659965443L;
        if (this.field2943 > this.field2941) {
            this.field2941 = this.field2943;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field2935 >= this.field2934 && this.field2935 < this.field2934 + (long) this.field2945) {
            var1 = this.field2935;
        } else if (this.field2934 >= this.field2935 && this.field2934 < this.field2935 + (long) this.field2939) {
            var1 = this.field2934;
        }
        if (this.field2935 + (long) this.field2939 > this.field2934 && this.field2935 + (long) this.field2939 <= this.field2934 + (long) this.field2945) {
            var3 = this.field2935 + (long) this.field2939;
        } else if (this.field2934 + (long) this.field2945 > this.field2935 && this.field2934 + (long) this.field2945 <= this.field2935 + (long) this.field2939) {
            var3 = this.field2934 + (long) this.field2945;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field2937, (int) (var1 - this.field2935), this.field2938, (int) (var1 - this.field2934), var5);
        }
        this.field2935 = -1L;
        this.field2939 = 0;
    }
}
