package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("gu")
public class class196 {

    @ObfuscatedName("gu.k")
    public class195 field2935;

    @ObfuscatedName("gu.b")
    public byte[] field2928;

    @ObfuscatedName("gu.e")
    public long field2933 = -1L;

    @ObfuscatedName("gu.i")
    public int field2930;

    @ObfuscatedName("gu.t")
    public byte[] field2937;

    @ObfuscatedName("gu.z")
    public long field2932 = -1L;

    @ObfuscatedName("gu.g")
    public int field2927 = 0;

    @ObfuscatedName("gu.c")
    public long field2934;

    @ObfuscatedName("gu.o")
    public long field2931;

    @ObfuscatedName("gu.q")
    public long field2936;

    @ObfuscatedName("gu.w")
    public long field2929;

    public class196(class195 arg0, int arg1, int arg2) throws IOException {
        this.field2935 = arg0;
        this.field2936 = this.field2931 = arg0.method3452();
        this.field2928 = new byte[arg1];
        this.field2937 = new byte[arg2];
        this.field2934 = 0L;
    }

    @ObfuscatedName("gu.k(I)V")
    public void method3471() throws IOException {
        this.method3478();
        this.field2935.method3451();
    }

    @ObfuscatedName("gu.b(J)V")
    public void method3473(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field2934 = arg0;
    }

    @ObfuscatedName("gu.e(B)J")
    public long method3480() {
        return this.field2936;
    }

    @ObfuscatedName("gu.i([BI)V")
    public void method3474(byte[] arg0) throws IOException {
        this.method3475(arg0, 0, arg0.length);
    }

    @ObfuscatedName("gu.t([BIIB)V")
    public void method3475(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field2932 != -1L && this.field2934 >= this.field2932 && this.field2934 + (long) arg2 <= this.field2932 + (long) this.field2927) {
                System.arraycopy(this.field2937, (int) (this.field2934 - this.field2932), arg0, arg1, arg2);
                this.field2934 += (long) arg2;
                return;
            }
            long var4 = this.field2934;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field2934 >= this.field2933 && this.field2934 < this.field2933 + (long) this.field2930) {
                int var8 = (int) ((long) this.field2930 - (this.field2934 - this.field2933));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field2928, (int) (this.field2934 - this.field2933), arg0, arg1, var8);
                this.field2934 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field2928.length) {
                this.field2935.method3449(this.field2934);
                this.field2929 = this.field2934;
                while (arg2 > 0) {
                    int var9 = this.field2935.method3448(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field2929 += (long) var9;
                    this.field2934 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method3483();
                int var10 = arg2;
                if (arg2 > this.field2930) {
                    var10 = this.field2930;
                }
                System.arraycopy(this.field2928, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field2934 += (long) var10;
            }
            if (this.field2932 != -1L) {
                if (this.field2932 > this.field2934 && arg2 > 0) {
                    int var11 = (int) (this.field2932 - this.field2934) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field2934++;
                    }
                }
                long var12 = -1L;
                long var14 = -1L;
                if (this.field2932 >= var4 && this.field2932 < (long) var7 + var4) {
                    var12 = this.field2932;
                } else if (var4 >= this.field2932 && var4 < this.field2932 + (long) this.field2927) {
                    var12 = var4;
                }
                if (this.field2932 + (long) this.field2927 > var4 && this.field2932 + (long) this.field2927 <= (long) var7 + var4) {
                    var14 = this.field2932 + (long) this.field2927;
                } else if ((long) var7 + var4 > this.field2932 && (long) var7 + var4 <= this.field2932 + (long) this.field2927) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field2937, (int) (var12 - this.field2932), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field2934) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field2934));
                        this.field2934 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field2929 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("gu.z(I)V")
    public void method3483() throws IOException {
        this.field2930 = 0;
        if (this.field2934 != this.field2929) {
            this.field2935.method3449(this.field2934);
            this.field2929 = this.field2934;
        }
        this.field2933 = this.field2934;
        while (this.field2930 < this.field2928.length) {
            int var1 = this.field2935.method3448(this.field2928, this.field2930, this.field2928.length - this.field2930);
            if (var1 == -1) {
                break;
            }
            this.field2929 += (long) var1;
            this.field2930 += var1;
        }
    }

    @ObfuscatedName("gu.g([BIII)V")
    public void method3476(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field2934 + (long) arg2 > this.field2936) {
                this.field2936 = this.field2934 + (long) arg2;
            }
            if (this.field2932 != -1L && (this.field2934 < this.field2932 || this.field2934 > this.field2932 + (long) this.field2927)) {
                this.method3478();
            }
            if (this.field2932 != -1L && this.field2934 + (long) arg2 > this.field2932 + (long) this.field2937.length) {
                int var4 = (int) ((long) this.field2937.length - (this.field2934 - this.field2932));
                System.arraycopy(arg0, arg1, this.field2937, (int) (this.field2934 - this.field2932), var4);
                this.field2934 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field2927 = this.field2937.length;
                this.method3478();
            }
            if (arg2 > this.field2937.length) {
                if (this.field2934 != this.field2929) {
                    this.field2935.method3449(this.field2934);
                    this.field2929 = this.field2934;
                }
                this.field2935.method3466(arg0, arg1, arg2);
                this.field2929 += (long) arg2;
                if (this.field2929 > this.field2931) {
                    this.field2931 = this.field2929;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field2934 >= this.field2933 && this.field2934 < this.field2933 + (long) this.field2930) {
                    var5 = this.field2934;
                } else if (this.field2933 >= this.field2934 && this.field2933 < this.field2934 + (long) arg2) {
                    var5 = this.field2933;
                }
                if (this.field2934 + (long) arg2 > this.field2933 && this.field2934 + (long) arg2 <= this.field2933 + (long) this.field2930) {
                    var7 = this.field2934 + (long) arg2;
                } else if (this.field2933 + (long) this.field2930 > this.field2934 && this.field2933 + (long) this.field2930 <= this.field2934 + (long) arg2) {
                    var7 = this.field2933 + (long) this.field2930;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field2934), this.field2928, (int) (var5 - this.field2933), var9);
                }
                this.field2934 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field2932 == -1L) {
                    this.field2932 = this.field2934;
                }
                System.arraycopy(arg0, arg1, this.field2937, (int) (this.field2934 - this.field2932), arg2);
                this.field2934 += (long) arg2;
                if (this.field2934 - this.field2932 > (long) this.field2927) {
                    this.field2927 = (int) (this.field2934 - this.field2932);
                }
            }
        } catch (IOException var11) {
            this.field2929 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("gu.c(B)V")
    public void method3478() throws IOException {
        if (this.field2932 == -1L) {
            return;
        }
        if (this.field2932 != this.field2929) {
            this.field2935.method3449(this.field2932);
            this.field2929 = this.field2932;
        }
        this.field2935.method3466(this.field2937, 0, this.field2927);
        this.field2929 += (long) (this.field2927 * -280798879) * -1551431007L;
        if (this.field2929 > this.field2931) {
            this.field2931 = this.field2929;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field2932 >= this.field2933 && this.field2932 < this.field2933 + (long) this.field2930) {
            var1 = this.field2932;
        } else if (this.field2933 >= this.field2932 && this.field2933 < this.field2932 + (long) this.field2927) {
            var1 = this.field2933;
        }
        if (this.field2932 + (long) this.field2927 > this.field2933 && this.field2932 + (long) this.field2927 <= this.field2933 + (long) this.field2930) {
            var3 = this.field2932 + (long) this.field2927;
        } else if (this.field2933 + (long) this.field2930 > this.field2932 && this.field2933 + (long) this.field2930 <= this.field2932 + (long) this.field2927) {
            var3 = this.field2933 + (long) this.field2930;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field2937, (int) (var1 - this.field2932), this.field2928, (int) (var1 - this.field2933), var5);
        }
        this.field2932 = -1L;
        this.field2927 = 0;
    }
}
