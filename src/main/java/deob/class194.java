package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("gr")
public class class194 {

    @ObfuscatedName("gr.j")
    public class193 field2926;

    @ObfuscatedName("gr.z")
    public byte[] field2925;

    @ObfuscatedName("gr.y")
    public long field2930 = -1L;

    @ObfuscatedName("gr.h")
    public int field2923;

    @ObfuscatedName("gr.r")
    public byte[] field2927;

    @ObfuscatedName("gr.e")
    public long field2924 = -1L;

    @ObfuscatedName("gr.k")
    public int field2929 = 0;

    @ObfuscatedName("gr.b")
    public long field2928;

    @ObfuscatedName("gr.n")
    public long field2931;

    @ObfuscatedName("gr.a")
    public long field2932;

    @ObfuscatedName("gr.q")
    public long field2933;

    public class194(class193 arg0, int arg1, int arg2) throws IOException {
        this.field2926 = arg0;
        this.field2932 = this.field2931 = arg0.method3439();
        this.field2925 = new byte[arg1];
        this.field2927 = new byte[arg2];
        this.field2928 = 0L;
    }

    @ObfuscatedName("gr.j(I)V")
    public void method3453() throws IOException {
        this.method3460();
        this.field2926.method3434();
    }

    @ObfuscatedName("gr.z(J)V")
    public void method3454(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field2928 = arg0;
    }

    @ObfuscatedName("gr.y(B)J")
    public long method3455() {
        return this.field2932;
    }

    @ObfuscatedName("gr.h([BB)V")
    public void method3456(byte[] arg0) throws IOException {
        this.method3468(arg0, 0, arg0.length);
    }

    @ObfuscatedName("gr.r([BIII)V")
    public void method3468(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field2924 != -1L && this.field2928 >= this.field2924 && this.field2928 + (long) arg2 <= this.field2924 + (long) this.field2929) {
                System.arraycopy(this.field2927, (int) (this.field2928 - this.field2924), arg0, arg1, arg2);
                this.field2928 += (long) arg2;
                return;
            }
            long var4 = this.field2928;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field2928 >= this.field2930 && this.field2928 < this.field2930 + (long) this.field2923) {
                int var8 = (int) ((long) this.field2923 - (this.field2928 - this.field2930));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field2925, (int) (this.field2928 - this.field2930), arg0, arg1, var8);
                this.field2928 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field2925.length) {
                this.field2926.method3432(this.field2928);
                this.field2933 = this.field2928;
                while (arg2 > 0) {
                    int var9 = this.field2926.method3435(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field2933 += (long) var9;
                    this.field2928 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method3473();
                int var10 = arg2;
                if (arg2 > this.field2923) {
                    var10 = this.field2923;
                }
                System.arraycopy(this.field2925, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field2928 += (long) var10;
            }
            if (this.field2924 != -1L) {
                if (this.field2924 > this.field2928 && arg2 > 0) {
                    int var11 = (int) (this.field2924 - this.field2928) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field2928++;
                    }
                }
                long var12 = -1L;
                long var14 = -1L;
                if (this.field2924 >= var4 && this.field2924 < (long) var7 + var4) {
                    var12 = this.field2924;
                } else if (var4 >= this.field2924 && var4 < this.field2924 + (long) this.field2929) {
                    var12 = var4;
                }
                if (this.field2924 + (long) this.field2929 > var4 && this.field2924 + (long) this.field2929 <= (long) var7 + var4) {
                    var14 = this.field2924 + (long) this.field2929;
                } else if ((long) var7 + var4 > this.field2924 && (long) var7 + var4 <= this.field2924 + (long) this.field2929) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field2927, (int) (var12 - this.field2924), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field2928) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field2928));
                        this.field2928 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field2933 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("gr.e(S)V")
    public void method3473() throws IOException {
        this.field2923 = 0;
        if (this.field2933 != this.field2928) {
            this.field2926.method3432(this.field2928);
            this.field2933 = this.field2928;
        }
        this.field2930 = this.field2928;
        while (this.field2923 < this.field2925.length) {
            int var1 = this.field2926.method3435(this.field2925, this.field2923, this.field2925.length - this.field2923);
            if (var1 == -1) {
                break;
            }
            this.field2933 += (long) var1;
            this.field2923 += var1;
        }
    }

    @ObfuscatedName("gr.k([BIIB)V")
    public void method3459(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field2928 + (long) arg2 > this.field2932) {
                this.field2932 = this.field2928 + (long) arg2;
            }
            if (this.field2924 != -1L && (this.field2928 < this.field2924 || this.field2928 > this.field2924 + (long) this.field2929)) {
                this.method3460();
            }
            if (this.field2924 != -1L && this.field2928 + (long) arg2 > this.field2924 + (long) this.field2927.length) {
                int var4 = (int) ((long) this.field2927.length - (this.field2928 - this.field2924));
                System.arraycopy(arg0, arg1, this.field2927, (int) (this.field2928 - this.field2924), var4);
                this.field2928 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field2929 = this.field2927.length;
                this.method3460();
            }
            if (arg2 > this.field2927.length) {
                if (this.field2933 != this.field2928) {
                    this.field2926.method3432(this.field2928);
                    this.field2933 = this.field2928;
                }
                this.field2926.method3433(arg0, arg1, arg2);
                this.field2933 += (long) arg2;
                if (this.field2933 > this.field2931) {
                    this.field2931 = this.field2933;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field2928 >= this.field2930 && this.field2928 < this.field2930 + (long) this.field2923) {
                    var5 = this.field2928;
                } else if (this.field2930 >= this.field2928 && this.field2930 < this.field2928 + (long) arg2) {
                    var5 = this.field2930;
                }
                if (this.field2928 + (long) arg2 > this.field2930 && this.field2928 + (long) arg2 <= this.field2930 + (long) this.field2923) {
                    var7 = this.field2928 + (long) arg2;
                } else if (this.field2930 + (long) this.field2923 > this.field2928 && this.field2930 + (long) this.field2923 <= this.field2928 + (long) arg2) {
                    var7 = this.field2930 + (long) this.field2923;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field2928), this.field2925, (int) (var5 - this.field2930), var9);
                }
                this.field2928 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field2924 == -1L) {
                    this.field2924 = this.field2928;
                }
                System.arraycopy(arg0, arg1, this.field2927, (int) (this.field2928 - this.field2924), arg2);
                this.field2928 += (long) arg2;
                if (this.field2928 - this.field2924 > (long) this.field2929) {
                    this.field2929 = (int) (this.field2928 - this.field2924);
                }
            }
        } catch (IOException var11) {
            this.field2933 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("gr.b(B)V")
    public void method3460() throws IOException {
        if (this.field2924 == -1L) {
            return;
        }
        if (this.field2933 != this.field2924) {
            this.field2926.method3432(this.field2924);
            this.field2933 = this.field2924;
        }
        this.field2926.method3433(this.field2927, 0, this.field2929);
        this.field2933 += (long) (this.field2929 * -99551405) * -979344165L;
        if (this.field2933 > this.field2931) {
            this.field2931 = this.field2933;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field2924 >= this.field2930 && this.field2924 < this.field2930 + (long) this.field2923) {
            var1 = this.field2924;
        } else if (this.field2930 >= this.field2924 && this.field2930 < this.field2924 + (long) this.field2929) {
            var1 = this.field2930;
        }
        if (this.field2924 + (long) this.field2929 > this.field2930 && this.field2924 + (long) this.field2929 <= this.field2930 + (long) this.field2923) {
            var3 = this.field2924 + (long) this.field2929;
        } else if (this.field2930 + (long) this.field2923 > this.field2924 && this.field2930 + (long) this.field2923 <= this.field2924 + (long) this.field2929) {
            var3 = this.field2930 + (long) this.field2923;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field2927, (int) (var1 - this.field2924), this.field2925, (int) (var1 - this.field2930), var5);
        }
        this.field2924 = -1L;
        this.field2929 = 0;
    }
}
