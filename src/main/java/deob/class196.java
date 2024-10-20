package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("gh")
public class class196 {

    @ObfuscatedName("gh.e")
    public class195 field2934;

    @ObfuscatedName("gh.o")
    public byte[] field2933;

    @ObfuscatedName("gh.y")
    public long field2935 = -1L;

    @ObfuscatedName("gh.b")
    public int field2936;

    @ObfuscatedName("gh.w")
    public byte[] field2938;

    @ObfuscatedName("gh.r")
    public long field2937 = -1L;

    @ObfuscatedName("gh.l")
    public int field2932 = 0;

    @ObfuscatedName("gh.s")
    public long field2939;

    @ObfuscatedName("gh.f")
    public long field2940;

    @ObfuscatedName("gh.x")
    public long field2941;

    @ObfuscatedName("gh.h")
    public long field2942;

    public class196(class195 arg0, int arg1, int arg2) throws IOException {
        this.field2934 = arg0;
        this.field2941 = this.field2940 = arg0.method3337();
        this.field2933 = new byte[arg1];
        this.field2938 = new byte[arg2];
        this.field2939 = 0L;
    }

    @ObfuscatedName("gh.e(I)V")
    public void method3352() throws IOException {
        this.method3359();
        this.field2934.method3332();
    }

    @ObfuscatedName("gh.o(J)V")
    public void method3353(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field2939 = arg0;
    }

    @ObfuscatedName("gh.y(I)J")
    public long method3354() {
        return this.field2941;
    }

    @ObfuscatedName("gh.b([BI)V")
    public void method3367(byte[] arg0) throws IOException {
        this.method3356(arg0, 0, arg0.length);
    }

    @ObfuscatedName("gh.w([BIII)V")
    public void method3356(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field2937 != -1L && this.field2939 >= this.field2937 && this.field2939 + (long) arg2 <= this.field2937 + (long) this.field2932) {
                System.arraycopy(this.field2938, (int) (this.field2939 - this.field2937), arg0, arg1, arg2);
                this.field2939 += (long) arg2;
                return;
            }
            long var4 = this.field2939;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field2939 >= this.field2935 && this.field2939 < this.field2935 + (long) this.field2936) {
                int var8 = (int) ((long) this.field2936 - (this.field2939 - this.field2935));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field2933, (int) (this.field2939 - this.field2935), arg0, arg1, var8);
                this.field2939 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field2933.length) {
                this.field2934.method3331(this.field2939);
                this.field2942 = this.field2939;
                while (arg2 > 0) {
                    int var9 = this.field2934.method3334(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field2942 += (long) var9;
                    this.field2939 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method3357();
                int var10 = arg2;
                if (arg2 > this.field2936) {
                    var10 = this.field2936;
                }
                System.arraycopy(this.field2933, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field2939 += (long) var10;
            }
            if (this.field2937 != -1L) {
                if (this.field2937 > this.field2939 && arg2 > 0) {
                    int var11 = (int) (this.field2937 - this.field2939) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field2939++;
                    }
                }
                long var12 = -1L;
                long var14 = -1L;
                if (this.field2937 >= var4 && this.field2937 < (long) var7 + var4) {
                    var12 = this.field2937;
                } else if (var4 >= this.field2937 && var4 < this.field2937 + (long) this.field2932) {
                    var12 = var4;
                }
                if (this.field2937 + (long) this.field2932 > var4 && this.field2937 + (long) this.field2932 <= (long) var7 + var4) {
                    var14 = this.field2937 + (long) this.field2932;
                } else if ((long) var7 + var4 > this.field2937 && (long) var7 + var4 <= this.field2937 + (long) this.field2932) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field2938, (int) (var12 - this.field2937), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field2939) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field2939));
                        this.field2939 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field2942 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("gh.r(I)V")
    public void method3357() throws IOException {
        this.field2936 = 0;
        if (this.field2942 != this.field2939) {
            this.field2934.method3331(this.field2939);
            this.field2942 = this.field2939;
        }
        this.field2935 = this.field2939;
        while (this.field2936 < this.field2933.length) {
            int var1 = this.field2934.method3334(this.field2933, this.field2936, this.field2933.length - this.field2936);
            if (var1 == -1) {
                break;
            }
            this.field2942 += (long) var1;
            this.field2936 += var1;
        }
    }

    @ObfuscatedName("gh.l([BIII)V")
    public void method3358(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field2939 + (long) arg2 > this.field2941) {
                this.field2941 = this.field2939 + (long) arg2;
            }
            if (this.field2937 != -1L && (this.field2939 < this.field2937 || this.field2939 > this.field2937 + (long) this.field2932)) {
                this.method3359();
            }
            if (this.field2937 != -1L && this.field2939 + (long) arg2 > this.field2937 + (long) this.field2938.length) {
                int var4 = (int) ((long) this.field2938.length - (this.field2939 - this.field2937));
                System.arraycopy(arg0, arg1, this.field2938, (int) (this.field2939 - this.field2937), var4);
                this.field2939 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field2932 = this.field2938.length;
                this.method3359();
            }
            if (arg2 > this.field2938.length) {
                if (this.field2942 != this.field2939) {
                    this.field2934.method3331(this.field2939);
                    this.field2942 = this.field2939;
                }
                this.field2934.method3341(arg0, arg1, arg2);
                this.field2942 += (long) arg2;
                if (this.field2942 > this.field2940) {
                    this.field2940 = this.field2942;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field2939 >= this.field2935 && this.field2939 < this.field2935 + (long) this.field2936) {
                    var5 = this.field2939;
                } else if (this.field2935 >= this.field2939 && this.field2935 < this.field2939 + (long) arg2) {
                    var5 = this.field2935;
                }
                if (this.field2939 + (long) arg2 > this.field2935 && this.field2939 + (long) arg2 <= this.field2935 + (long) this.field2936) {
                    var7 = this.field2939 + (long) arg2;
                } else if (this.field2935 + (long) this.field2936 > this.field2939 && this.field2935 + (long) this.field2936 <= this.field2939 + (long) arg2) {
                    var7 = this.field2935 + (long) this.field2936;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field2939), this.field2933, (int) (var5 - this.field2935), var9);
                }
                this.field2939 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field2937 == -1L) {
                    this.field2937 = this.field2939;
                }
                System.arraycopy(arg0, arg1, this.field2938, (int) (this.field2939 - this.field2937), arg2);
                this.field2939 += (long) arg2;
                if (this.field2939 - this.field2937 > (long) this.field2932) {
                    this.field2932 = (int) (this.field2939 - this.field2937);
                }
            }
        } catch (IOException var11) {
            this.field2942 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("gh.s(I)V")
    public void method3359() throws IOException {
        if (this.field2937 == -1L) {
            return;
        }
        if (this.field2942 != this.field2937) {
            this.field2934.method3331(this.field2937);
            this.field2942 = this.field2937;
        }
        this.field2934.method3341(this.field2938, 0, this.field2932);
        this.field2942 += (long) (this.field2932 * -21127305) * 1292560967L;
        if (this.field2942 > this.field2940) {
            this.field2940 = this.field2942;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field2937 >= this.field2935 && this.field2937 < this.field2935 + (long) this.field2936) {
            var1 = this.field2937;
        } else if (this.field2935 >= this.field2937 && this.field2935 < this.field2937 + (long) this.field2932) {
            var1 = this.field2935;
        }
        if (this.field2937 + (long) this.field2932 > this.field2935 && this.field2937 + (long) this.field2932 <= this.field2935 + (long) this.field2936) {
            var3 = this.field2937 + (long) this.field2932;
        } else if (this.field2935 + (long) this.field2936 > this.field2937 && this.field2935 + (long) this.field2936 <= this.field2937 + (long) this.field2932) {
            var3 = this.field2935 + (long) this.field2936;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field2938, (int) (var1 - this.field2937), this.field2933, (int) (var1 - this.field2935), var5);
        }
        this.field2937 = -1L;
        this.field2932 = 0;
    }
}
