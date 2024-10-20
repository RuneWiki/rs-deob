package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("gr")
public class class196 {

    @ObfuscatedName("gr.k")
    public class195 field2937;

    @ObfuscatedName("gr.r")
    public byte[] field2934;

    @ObfuscatedName("gr.y")
    public long field2935 = -1L;

    @ObfuscatedName("gr.w")
    public int field2938;

    @ObfuscatedName("gr.m")
    public byte[] field2936;

    @ObfuscatedName("gr.j")
    public long field2939 = -1L;

    @ObfuscatedName("gr.g")
    public int field2933 = 0;

    @ObfuscatedName("gr.p")
    public long field2940;

    @ObfuscatedName("gr.o")
    public long field2941;

    @ObfuscatedName("gr.b")
    public long field2942;

    @ObfuscatedName("gr.x")
    public long field2943;

    public class196(class195 arg0, int arg1, int arg2) throws IOException {
        this.field2937 = arg0;
        this.field2942 = this.field2941 = arg0.method3415();
        this.field2934 = new byte[arg1];
        this.field2936 = new byte[arg2];
        this.field2940 = 0L;
    }

    @ObfuscatedName("gr.k(I)V")
    public void method3433() throws IOException {
        this.method3436();
        this.field2937.method3422();
    }

    @ObfuscatedName("gr.r(J)V")
    public void method3430(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field2940 = arg0;
    }

    @ObfuscatedName("gr.y(B)J")
    public long method3431() {
        return this.field2942;
    }

    @ObfuscatedName("gr.w([BI)V")
    public void method3432(byte[] arg0) throws IOException {
        this.method3450(arg0, 0, arg0.length);
    }

    @ObfuscatedName("gr.m([BIII)V")
    public void method3450(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field2939 != -1L && this.field2940 >= this.field2939 && this.field2940 + (long) arg2 <= this.field2939 + (long) this.field2933) {
                System.arraycopy(this.field2936, (int) (this.field2940 - this.field2939), arg0, arg1, arg2);
                this.field2940 += (long) arg2;
                return;
            }
            long var4 = this.field2940;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field2940 >= this.field2935 && this.field2940 < this.field2935 + (long) this.field2938) {
                int var8 = (int) ((long) this.field2938 - (this.field2940 - this.field2935));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field2934, (int) (this.field2940 - this.field2935), arg0, arg1, var8);
                this.field2940 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field2934.length) {
                this.field2937.method3408(this.field2940);
                this.field2943 = this.field2940;
                while (arg2 > 0) {
                    int var9 = this.field2937.method3412(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field2943 += (long) var9;
                    this.field2940 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method3434();
                int var10 = arg2;
                if (arg2 > this.field2938) {
                    var10 = this.field2938;
                }
                System.arraycopy(this.field2934, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field2940 += (long) var10;
            }
            if (this.field2939 != -1L) {
                if (this.field2939 > this.field2940 && arg2 > 0) {
                    int var11 = (int) (this.field2939 - this.field2940) + arg1;
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
                if (this.field2939 >= var4 && this.field2939 < (long) var7 + var4) {
                    var12 = this.field2939;
                } else if (var4 >= this.field2939 && var4 < this.field2939 + (long) this.field2933) {
                    var12 = var4;
                }
                if (this.field2939 + (long) this.field2933 > var4 && this.field2939 + (long) this.field2933 <= (long) var7 + var4) {
                    var14 = this.field2939 + (long) this.field2933;
                } else if ((long) var7 + var4 > this.field2939 && (long) var7 + var4 <= this.field2939 + (long) this.field2933) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field2936, (int) (var12 - this.field2939), arg0, (int) (var12 - var4) + var6, var16);
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

    @ObfuscatedName("gr.j(I)V")
    public void method3434() throws IOException {
        this.field2938 = 0;
        if (this.field2943 != this.field2940) {
            this.field2937.method3408(this.field2940);
            this.field2943 = this.field2940;
        }
        this.field2935 = this.field2940;
        while (this.field2938 < this.field2934.length) {
            int var1 = this.field2937.method3412(this.field2934, this.field2938, this.field2934.length - this.field2938);
            if (var1 == -1) {
                break;
            }
            this.field2943 += (long) var1;
            this.field2938 += var1;
        }
    }

    @ObfuscatedName("gr.g([BIII)V")
    public void method3429(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field2940 + (long) arg2 > this.field2942) {
                this.field2942 = this.field2940 + (long) arg2;
            }
            if (this.field2939 != -1L && (this.field2940 < this.field2939 || this.field2940 > this.field2939 + (long) this.field2933)) {
                this.method3436();
            }
            if (this.field2939 != -1L && this.field2940 + (long) arg2 > this.field2939 + (long) this.field2936.length) {
                int var4 = (int) ((long) this.field2936.length - (this.field2940 - this.field2939));
                System.arraycopy(arg0, arg1, this.field2936, (int) (this.field2940 - this.field2939), var4);
                this.field2940 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field2933 = this.field2936.length;
                this.method3436();
            }
            if (arg2 > this.field2936.length) {
                if (this.field2943 != this.field2940) {
                    this.field2937.method3408(this.field2940);
                    this.field2943 = this.field2940;
                }
                this.field2937.method3409(arg0, arg1, arg2);
                this.field2943 += (long) arg2;
                if (this.field2943 > this.field2941) {
                    this.field2941 = this.field2943;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field2940 >= this.field2935 && this.field2940 < this.field2935 + (long) this.field2938) {
                    var5 = this.field2940;
                } else if (this.field2935 >= this.field2940 && this.field2935 < this.field2940 + (long) arg2) {
                    var5 = this.field2935;
                }
                if (this.field2940 + (long) arg2 > this.field2935 && this.field2940 + (long) arg2 <= this.field2935 + (long) this.field2938) {
                    var7 = this.field2940 + (long) arg2;
                } else if (this.field2935 + (long) this.field2938 > this.field2940 && this.field2935 + (long) this.field2938 <= this.field2940 + (long) arg2) {
                    var7 = this.field2935 + (long) this.field2938;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field2940), this.field2934, (int) (var5 - this.field2935), var9);
                }
                this.field2940 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field2939 == -1L) {
                    this.field2939 = this.field2940;
                }
                System.arraycopy(arg0, arg1, this.field2936, (int) (this.field2940 - this.field2939), arg2);
                this.field2940 += (long) arg2;
                if (this.field2940 - this.field2939 > (long) this.field2933) {
                    this.field2933 = (int) (this.field2940 - this.field2939);
                }
            }
        } catch (IOException var11) {
            this.field2943 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("gr.p(I)V")
    public void method3436() throws IOException {
        if (this.field2939 == -1L) {
            return;
        }
        if (this.field2943 != this.field2939) {
            this.field2937.method3408(this.field2939);
            this.field2943 = this.field2939;
        }
        this.field2937.method3409(this.field2936, 0, this.field2933);
        this.field2943 += (long) (this.field2933 * -577160843) * -1818161443L;
        if (this.field2943 > this.field2941) {
            this.field2941 = this.field2943;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field2939 >= this.field2935 && this.field2939 < this.field2935 + (long) this.field2938) {
            var1 = this.field2939;
        } else if (this.field2935 >= this.field2939 && this.field2935 < this.field2939 + (long) this.field2933) {
            var1 = this.field2935;
        }
        if (this.field2939 + (long) this.field2933 > this.field2935 && this.field2939 + (long) this.field2933 <= this.field2935 + (long) this.field2938) {
            var3 = this.field2939 + (long) this.field2933;
        } else if (this.field2935 + (long) this.field2938 > this.field2939 && this.field2935 + (long) this.field2938 <= this.field2939 + (long) this.field2933) {
            var3 = this.field2935 + (long) this.field2938;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field2936, (int) (var1 - this.field2939), this.field2934, (int) (var1 - this.field2935), var5);
        }
        this.field2939 = -1L;
        this.field2933 = 0;
    }
}
