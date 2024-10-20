package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("gx")
public class class197 {

    @ObfuscatedName("gx.k")
    public class196 field2945;

    @ObfuscatedName("gx.y")
    public byte[] field2938;

    @ObfuscatedName("gx.s")
    public long field2939 = -1L;

    @ObfuscatedName("gx.g")
    public int field2940;

    @ObfuscatedName("gx.h")
    public byte[] field2944;

    @ObfuscatedName("gx.l")
    public long field2942 = -1L;

    @ObfuscatedName("gx.e")
    public int field2941 = 0;

    @ObfuscatedName("gx.u")
    public long field2948;

    @ObfuscatedName("gx.j")
    public long field2937;

    @ObfuscatedName("gx.c")
    public long field2946;

    @ObfuscatedName("gx.d")
    public long field2947;

    public class197(class196 arg0, int arg1, int arg2) throws IOException {
        this.field2945 = arg0;
        this.field2946 = this.field2937 = arg0.method3500();
        this.field2938 = new byte[arg1];
        this.field2944 = new byte[arg2];
        this.field2948 = 0L;
    }

    @ObfuscatedName("gx.k(I)V")
    public void method3515() throws IOException {
        this.method3538();
        this.field2945.method3497();
    }

    @ObfuscatedName("gx.y(J)V")
    public void method3522(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field2948 = arg0;
    }

    @ObfuscatedName("gx.s(I)J")
    public long method3542() {
        return this.field2946;
    }

    @ObfuscatedName("gx.g([BB)V")
    public void method3518(byte[] arg0) throws IOException {
        this.method3524(arg0, 0, arg0.length);
    }

    @ObfuscatedName("gx.h([BIII)V")
    public void method3524(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field2942 != -1L && this.field2948 >= this.field2942 && this.field2948 + (long) arg2 <= this.field2942 + (long) this.field2941) {
                System.arraycopy(this.field2944, (int) (this.field2948 - this.field2942), arg0, arg1, arg2);
                this.field2948 += (long) arg2;
                return;
            }
            long var4 = this.field2948;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field2948 >= this.field2939 && this.field2948 < this.field2939 + (long) this.field2940) {
                int var8 = (int) ((long) this.field2940 - (this.field2948 - this.field2939));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field2938, (int) (this.field2948 - this.field2939), arg0, arg1, var8);
                this.field2948 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field2938.length) {
                this.field2945.method3495(this.field2948);
                this.field2947 = this.field2948;
                while (arg2 > 0) {
                    int var9 = this.field2945.method3494(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field2947 += (long) var9;
                    this.field2948 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method3517();
                int var10 = arg2;
                if (arg2 > this.field2940) {
                    var10 = this.field2940;
                }
                System.arraycopy(this.field2938, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field2948 += (long) var10;
            }
            if (this.field2942 != -1L) {
                if (this.field2942 > this.field2948 && arg2 > 0) {
                    int var11 = (int) (this.field2942 - this.field2948) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field2948++;
                    }
                }
                long var12 = -1L;
                long var14 = -1L;
                if (this.field2942 >= var4 && this.field2942 < (long) var7 + var4) {
                    var12 = this.field2942;
                } else if (var4 >= this.field2942 && var4 < this.field2942 + (long) this.field2941) {
                    var12 = var4;
                }
                if (this.field2942 + (long) this.field2941 > var4 && this.field2942 + (long) this.field2941 <= (long) var7 + var4) {
                    var14 = this.field2942 + (long) this.field2941;
                } else if ((long) var7 + var4 > this.field2942 && (long) var7 + var4 <= this.field2942 + (long) this.field2941) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field2944, (int) (var12 - this.field2942), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field2948) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field2948));
                        this.field2948 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field2947 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("gx.l(B)V")
    public void method3517() throws IOException {
        this.field2940 = 0;
        if (this.field2948 != this.field2947) {
            this.field2945.method3495(this.field2948);
            this.field2947 = this.field2948;
        }
        this.field2939 = this.field2948;
        while (this.field2940 < this.field2938.length) {
            int var1 = this.field2945.method3494(this.field2938, this.field2940, this.field2938.length - this.field2940);
            if (var1 == -1) {
                break;
            }
            this.field2947 += (long) var1;
            this.field2940 += var1;
        }
    }

    @ObfuscatedName("gx.e([BIIS)V")
    public void method3521(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field2948 + (long) arg2 > this.field2946) {
                this.field2946 = this.field2948 + (long) arg2;
            }
            if (this.field2942 != -1L && (this.field2948 < this.field2942 || this.field2948 > this.field2942 + (long) this.field2941)) {
                this.method3538();
            }
            if (this.field2942 != -1L && this.field2948 + (long) arg2 > this.field2942 + (long) this.field2944.length) {
                int var4 = (int) ((long) this.field2944.length - (this.field2948 - this.field2942));
                System.arraycopy(arg0, arg1, this.field2944, (int) (this.field2948 - this.field2942), var4);
                this.field2948 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field2941 = this.field2944.length;
                this.method3538();
            }
            if (arg2 > this.field2944.length) {
                if (this.field2948 != this.field2947) {
                    this.field2945.method3495(this.field2948);
                    this.field2947 = this.field2948;
                }
                this.field2945.method3496(arg0, arg1, arg2);
                this.field2947 += (long) arg2;
                if (this.field2947 > this.field2937) {
                    this.field2937 = this.field2947;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field2948 >= this.field2939 && this.field2948 < this.field2939 + (long) this.field2940) {
                    var5 = this.field2948;
                } else if (this.field2939 >= this.field2948 && this.field2939 < this.field2948 + (long) arg2) {
                    var5 = this.field2939;
                }
                if (this.field2948 + (long) arg2 > this.field2939 && this.field2948 + (long) arg2 <= this.field2939 + (long) this.field2940) {
                    var7 = this.field2948 + (long) arg2;
                } else if (this.field2939 + (long) this.field2940 > this.field2948 && this.field2939 + (long) this.field2940 <= this.field2948 + (long) arg2) {
                    var7 = this.field2939 + (long) this.field2940;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field2948), this.field2938, (int) (var5 - this.field2939), var9);
                }
                this.field2948 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field2942 == -1L) {
                    this.field2942 = this.field2948;
                }
                System.arraycopy(arg0, arg1, this.field2944, (int) (this.field2948 - this.field2942), arg2);
                this.field2948 += (long) arg2;
                if (this.field2948 - this.field2942 > (long) this.field2941) {
                    this.field2941 = (int) (this.field2948 - this.field2942);
                }
            }
        } catch (IOException var11) {
            this.field2947 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("gx.u(I)V")
    public void method3538() throws IOException {
        if (this.field2942 == -1L) {
            return;
        }
        if (this.field2947 != this.field2942) {
            this.field2945.method3495(this.field2942);
            this.field2947 = this.field2942;
        }
        this.field2945.method3496(this.field2944, 0, this.field2941);
        this.field2947 += (long) (this.field2941 * 911770927) * 2030232015L;
        if (this.field2947 > this.field2937) {
            this.field2937 = this.field2947;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field2942 >= this.field2939 && this.field2942 < this.field2939 + (long) this.field2940) {
            var1 = this.field2942;
        } else if (this.field2939 >= this.field2942 && this.field2939 < this.field2942 + (long) this.field2941) {
            var1 = this.field2939;
        }
        if (this.field2942 + (long) this.field2941 > this.field2939 && this.field2942 + (long) this.field2941 <= this.field2939 + (long) this.field2940) {
            var3 = this.field2942 + (long) this.field2941;
        } else if (this.field2939 + (long) this.field2940 > this.field2942 && this.field2939 + (long) this.field2940 <= this.field2942 + (long) this.field2941) {
            var3 = this.field2939 + (long) this.field2940;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field2944, (int) (var1 - this.field2942), this.field2938, (int) (var1 - this.field2939), var5);
        }
        this.field2942 = -1L;
        this.field2941 = 0;
    }
}
