package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("gf")
public class class196 {

    @ObfuscatedName("gf.i")
    public class195 field2936;

    @ObfuscatedName("gf.c")
    public byte[] field2941;

    @ObfuscatedName("gf.h")
    public long field2934 = -1L;

    @ObfuscatedName("gf.v")
    public int field2933;

    @ObfuscatedName("gf.q")
    public byte[] field2937;

    @ObfuscatedName("gf.s")
    public long field2938 = -1L;

    @ObfuscatedName("gf.g")
    public int field2939 = 0;

    @ObfuscatedName("gf.u")
    public long field2940;

    @ObfuscatedName("gf.d")
    public long field2935;

    @ObfuscatedName("gf.y")
    public long field2942;

    @ObfuscatedName("gf.e")
    public long field2943;

    public class196(class195 arg0, int arg1, int arg2) throws IOException {
        this.field2936 = arg0;
        this.field2942 = this.field2935 = arg0.method3459();
        this.field2941 = new byte[arg1];
        this.field2937 = new byte[arg2];
        this.field2940 = 0L;
    }

    @ObfuscatedName("gf.i(I)V")
    public void method3476() throws IOException {
        this.method3478();
        this.field2936.method3448();
    }

    @ObfuscatedName("gf.c(J)V")
    public void method3472(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field2940 = arg0;
    }

    @ObfuscatedName("gf.h(I)J")
    public long method3473() {
        return this.field2942;
    }

    @ObfuscatedName("gf.v([BI)V")
    public void method3474(byte[] arg0) throws IOException {
        this.method3475(arg0, 0, arg0.length);
    }

    @ObfuscatedName("gf.q([BIII)V")
    public void method3475(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field2938 != -1L && this.field2940 >= this.field2938 && this.field2940 + (long) arg2 <= this.field2938 + (long) this.field2939) {
                System.arraycopy(this.field2937, (int) (this.field2940 - this.field2938), arg0, arg1, arg2);
                this.field2940 += (long) arg2;
                return;
            }
            long var4 = this.field2940;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field2940 >= this.field2934 && this.field2940 < this.field2934 + (long) this.field2933) {
                int var8 = (int) ((long) this.field2933 - (this.field2940 - this.field2934));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field2941, (int) (this.field2940 - this.field2934), arg0, arg1, var8);
                this.field2940 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field2941.length) {
                this.field2936.method3446(this.field2940);
                this.field2943 = this.field2940;
                while (arg2 > 0) {
                    int var9 = this.field2936.method3450(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field2943 += (long) var9;
                    this.field2940 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method3491();
                int var10 = arg2;
                if (arg2 > this.field2933) {
                    var10 = this.field2933;
                }
                System.arraycopy(this.field2941, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field2940 += (long) var10;
            }
            if (this.field2938 != -1L) {
                if (this.field2938 > this.field2940 && arg2 > 0) {
                    int var11 = (int) (this.field2938 - this.field2940) + arg1;
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
                if (this.field2938 >= var4 && this.field2938 < (long) var7 + var4) {
                    var12 = this.field2938;
                } else if (var4 >= this.field2938 && var4 < this.field2938 + (long) this.field2939) {
                    var12 = var4;
                }
                if (this.field2938 + (long) this.field2939 > var4 && this.field2938 + (long) this.field2939 <= (long) var7 + var4) {
                    var14 = this.field2938 + (long) this.field2939;
                } else if ((long) var7 + var4 > this.field2938 && (long) var7 + var4 <= this.field2938 + (long) this.field2939) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field2937, (int) (var12 - this.field2938), arg0, (int) (var12 - var4) + var6, var16);
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

    @ObfuscatedName("gf.s(I)V")
    public void method3491() throws IOException {
        this.field2933 = 0;
        if (this.field2943 != this.field2940) {
            this.field2936.method3446(this.field2940);
            this.field2943 = this.field2940;
        }
        this.field2934 = this.field2940;
        while (this.field2933 < this.field2941.length) {
            int var1 = this.field2936.method3450(this.field2941, this.field2933, this.field2941.length - this.field2933);
            if (var1 == -1) {
                break;
            }
            this.field2943 += (long) var1;
            this.field2933 += var1;
        }
    }

    @ObfuscatedName("gf.g([BIII)V")
    public void method3477(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field2940 + (long) arg2 > this.field2942) {
                this.field2942 = this.field2940 + (long) arg2;
            }
            if (this.field2938 != -1L && (this.field2940 < this.field2938 || this.field2940 > this.field2938 + (long) this.field2939)) {
                this.method3478();
            }
            if (this.field2938 != -1L && this.field2940 + (long) arg2 > this.field2938 + (long) this.field2937.length) {
                int var4 = (int) ((long) this.field2937.length - (this.field2940 - this.field2938));
                System.arraycopy(arg0, arg1, this.field2937, (int) (this.field2940 - this.field2938), var4);
                this.field2940 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field2939 = this.field2937.length;
                this.method3478();
            }
            if (arg2 > this.field2937.length) {
                if (this.field2943 != this.field2940) {
                    this.field2936.method3446(this.field2940);
                    this.field2943 = this.field2940;
                }
                this.field2936.method3447(arg0, arg1, arg2);
                this.field2943 += (long) arg2;
                if (this.field2943 > this.field2935) {
                    this.field2935 = this.field2943;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field2940 >= this.field2934 && this.field2940 < this.field2934 + (long) this.field2933) {
                    var5 = this.field2940;
                } else if (this.field2934 >= this.field2940 && this.field2934 < this.field2940 + (long) arg2) {
                    var5 = this.field2934;
                }
                if (this.field2940 + (long) arg2 > this.field2934 && this.field2940 + (long) arg2 <= this.field2934 + (long) this.field2933) {
                    var7 = this.field2940 + (long) arg2;
                } else if (this.field2934 + (long) this.field2933 > this.field2940 && this.field2934 + (long) this.field2933 <= this.field2940 + (long) arg2) {
                    var7 = this.field2934 + (long) this.field2933;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field2940), this.field2941, (int) (var5 - this.field2934), var9);
                }
                this.field2940 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field2938 == -1L) {
                    this.field2938 = this.field2940;
                }
                System.arraycopy(arg0, arg1, this.field2937, (int) (this.field2940 - this.field2938), arg2);
                this.field2940 += (long) arg2;
                if (this.field2940 - this.field2938 > (long) this.field2939) {
                    this.field2939 = (int) (this.field2940 - this.field2938);
                }
            }
        } catch (IOException var11) {
            this.field2943 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("gf.u(I)V")
    public void method3478() throws IOException {
        if (this.field2938 == -1L) {
            return;
        }
        if (this.field2943 != this.field2938) {
            this.field2936.method3446(this.field2938);
            this.field2943 = this.field2938;
        }
        this.field2936.method3447(this.field2937, 0, this.field2939);
        this.field2943 += (long) (this.field2939 * 1389681031) * -195978185L;
        if (this.field2943 > this.field2935) {
            this.field2935 = this.field2943;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field2938 >= this.field2934 && this.field2938 < this.field2934 + (long) this.field2933) {
            var1 = this.field2938;
        } else if (this.field2934 >= this.field2938 && this.field2934 < this.field2938 + (long) this.field2939) {
            var1 = this.field2934;
        }
        if (this.field2938 + (long) this.field2939 > this.field2934 && this.field2938 + (long) this.field2939 <= this.field2934 + (long) this.field2933) {
            var3 = this.field2938 + (long) this.field2939;
        } else if (this.field2934 + (long) this.field2933 > this.field2938 && this.field2934 + (long) this.field2933 <= this.field2938 + (long) this.field2939) {
            var3 = this.field2934 + (long) this.field2933;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field2937, (int) (var1 - this.field2938), this.field2941, (int) (var1 - this.field2934), var5);
        }
        this.field2938 = -1L;
        this.field2939 = 0;
    }
}
