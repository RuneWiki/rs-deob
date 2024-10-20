package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("gs")
public class class196 {

    @ObfuscatedName("gs.t")
    public class195 field2932;

    @ObfuscatedName("gs.s")
    public byte[] field2927;

    @ObfuscatedName("gs.f")
    public long field2928 = -1L;

    @ObfuscatedName("gs.e")
    public int field2933;

    @ObfuscatedName("gs.d")
    public byte[] field2930;

    @ObfuscatedName("gs.n")
    public long field2931 = -1L;

    @ObfuscatedName("gs.v")
    public int field2935 = 0;

    @ObfuscatedName("gs.z")
    public long field2929;

    @ObfuscatedName("gs.j")
    public long field2934;

    @ObfuscatedName("gs.u")
    public long field2926;

    @ObfuscatedName("gs.g")
    public long field2936;

    public class196(class195 arg0, int arg1, int arg2) throws IOException {
        this.field2932 = arg0;
        this.field2926 = this.field2934 = arg0.method3436();
        this.field2927 = new byte[arg1];
        this.field2930 = new byte[arg2];
        this.field2929 = 0L;
    }

    @ObfuscatedName("gs.t(B)V")
    public void method3468() throws IOException {
        this.method3464();
        this.field2932.method3435();
    }

    @ObfuscatedName("gs.s(J)V")
    public void method3459(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field2929 = arg0;
    }

    @ObfuscatedName("gs.f(B)J")
    public long method3466() {
        return this.field2926;
    }

    @ObfuscatedName("gs.e([BI)V")
    public void method3461(byte[] arg0) throws IOException {
        this.method3474(arg0, 0, arg0.length);
    }

    @ObfuscatedName("gs.d([BIIS)V")
    public void method3474(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field2931 != -1L && this.field2929 >= this.field2931 && this.field2929 + (long) arg2 <= this.field2931 + (long) this.field2935) {
                System.arraycopy(this.field2930, (int) (this.field2929 - this.field2931), arg0, arg1, arg2);
                this.field2929 += (long) arg2;
                return;
            }
            long var4 = this.field2929;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field2929 >= this.field2928 && this.field2929 < this.field2928 + (long) this.field2933) {
                int var8 = (int) ((long) this.field2933 - (this.field2929 - this.field2928));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field2927, (int) (this.field2929 - this.field2928), arg0, arg1, var8);
                this.field2929 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field2927.length) {
                this.field2932.method3437(this.field2929);
                this.field2936 = this.field2929;
                while (arg2 > 0) {
                    int var9 = this.field2932.method3451(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field2936 += (long) var9;
                    this.field2929 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method3457();
                int var10 = arg2;
                if (arg2 > this.field2933) {
                    var10 = this.field2933;
                }
                System.arraycopy(this.field2927, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field2929 += (long) var10;
            }
            if (this.field2931 != -1L) {
                if (this.field2931 > this.field2929 && arg2 > 0) {
                    int var11 = (int) (this.field2931 - this.field2929) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field2929++;
                    }
                }
                long var12 = -1L;
                long var14 = -1L;
                if (this.field2931 >= var4 && this.field2931 < (long) var7 + var4) {
                    var12 = this.field2931;
                } else if (var4 >= this.field2931 && var4 < this.field2931 + (long) this.field2935) {
                    var12 = var4;
                }
                if (this.field2931 + (long) this.field2935 > var4 && this.field2931 + (long) this.field2935 <= (long) var7 + var4) {
                    var14 = this.field2931 + (long) this.field2935;
                } else if ((long) var7 + var4 > this.field2931 && (long) var7 + var4 <= this.field2931 + (long) this.field2935) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field2930, (int) (var12 - this.field2931), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field2929) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field2929));
                        this.field2929 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field2936 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("gs.n(I)V")
    public void method3457() throws IOException {
        this.field2933 = 0;
        if (this.field2936 != this.field2929) {
            this.field2932.method3437(this.field2929);
            this.field2936 = this.field2929;
        }
        this.field2928 = this.field2929;
        while (this.field2933 < this.field2927.length) {
            int var1 = this.field2932.method3451(this.field2927, this.field2933, this.field2927.length - this.field2933);
            if (var1 == -1) {
                break;
            }
            this.field2936 += (long) var1;
            this.field2933 += var1;
        }
    }

    @ObfuscatedName("gs.v([BIIB)V")
    public void method3463(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field2929 + (long) arg2 > this.field2926) {
                this.field2926 = this.field2929 + (long) arg2;
            }
            if (this.field2931 != -1L && (this.field2929 < this.field2931 || this.field2929 > this.field2931 + (long) this.field2935)) {
                this.method3464();
            }
            if (this.field2931 != -1L && this.field2929 + (long) arg2 > this.field2931 + (long) this.field2930.length) {
                int var4 = (int) ((long) this.field2930.length - (this.field2929 - this.field2931));
                System.arraycopy(arg0, arg1, this.field2930, (int) (this.field2929 - this.field2931), var4);
                this.field2929 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field2935 = this.field2930.length;
                this.method3464();
            }
            if (arg2 > this.field2930.length) {
                if (this.field2936 != this.field2929) {
                    this.field2932.method3437(this.field2929);
                    this.field2936 = this.field2929;
                }
                this.field2932.method3456(arg0, arg1, arg2);
                this.field2936 += (long) arg2;
                if (this.field2936 > this.field2934) {
                    this.field2934 = this.field2936;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field2929 >= this.field2928 && this.field2929 < this.field2928 + (long) this.field2933) {
                    var5 = this.field2929;
                } else if (this.field2928 >= this.field2929 && this.field2928 < this.field2929 + (long) arg2) {
                    var5 = this.field2928;
                }
                if (this.field2929 + (long) arg2 > this.field2928 && this.field2929 + (long) arg2 <= this.field2928 + (long) this.field2933) {
                    var7 = this.field2929 + (long) arg2;
                } else if (this.field2928 + (long) this.field2933 > this.field2929 && this.field2928 + (long) this.field2933 <= this.field2929 + (long) arg2) {
                    var7 = this.field2928 + (long) this.field2933;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field2929), this.field2927, (int) (var5 - this.field2928), var9);
                }
                this.field2929 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field2931 == -1L) {
                    this.field2931 = this.field2929;
                }
                System.arraycopy(arg0, arg1, this.field2930, (int) (this.field2929 - this.field2931), arg2);
                this.field2929 += (long) arg2;
                if (this.field2929 - this.field2931 > (long) this.field2935) {
                    this.field2935 = (int) (this.field2929 - this.field2931);
                }
            }
        } catch (IOException var11) {
            this.field2936 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("gs.z(I)V")
    public void method3464() throws IOException {
        if (this.field2931 == -1L) {
            return;
        }
        if (this.field2936 != this.field2931) {
            this.field2932.method3437(this.field2931);
            this.field2936 = this.field2931;
        }
        this.field2932.method3456(this.field2930, 0, this.field2935);
        this.field2936 += (long) (this.field2935 * -1057785899) * 1850214781L;
        if (this.field2936 > this.field2934) {
            this.field2934 = this.field2936;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field2931 >= this.field2928 && this.field2931 < this.field2928 + (long) this.field2933) {
            var1 = this.field2931;
        } else if (this.field2928 >= this.field2931 && this.field2928 < this.field2931 + (long) this.field2935) {
            var1 = this.field2928;
        }
        if (this.field2931 + (long) this.field2935 > this.field2928 && this.field2931 + (long) this.field2935 <= this.field2928 + (long) this.field2933) {
            var3 = this.field2931 + (long) this.field2935;
        } else if (this.field2928 + (long) this.field2933 > this.field2931 && this.field2928 + (long) this.field2933 <= this.field2931 + (long) this.field2935) {
            var3 = this.field2928 + (long) this.field2933;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field2930, (int) (var1 - this.field2931), this.field2927, (int) (var1 - this.field2928), var5);
        }
        this.field2931 = -1L;
        this.field2935 = 0;
    }
}
