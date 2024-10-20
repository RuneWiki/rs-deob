package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("gs")
public class class197 {

    @ObfuscatedName("gs.p")
    public class196 field2938;

    @ObfuscatedName("gs.g")
    public byte[] field2939;

    @ObfuscatedName("gs.x")
    public long field2940 = -1L;

    @ObfuscatedName("gs.c")
    public int field2946;

    @ObfuscatedName("gs.n")
    public byte[] field2942;

    @ObfuscatedName("gs.s")
    public long field2945 = -1L;

    @ObfuscatedName("gs.r")
    public int field2944 = 0;

    @ObfuscatedName("gs.w")
    public long field2941;

    @ObfuscatedName("gs.u")
    public long field2948;

    @ObfuscatedName("gs.d")
    public long field2947;

    @ObfuscatedName("gs.h")
    public long field2943;

    public class197(class196 arg0, int arg1, int arg2) throws IOException {
        this.field2938 = arg0;
        this.field2947 = this.field2948 = arg0.method3493();
        this.field2939 = new byte[arg1];
        this.field2942 = new byte[arg2];
        this.field2941 = 0L;
    }

    @ObfuscatedName("gs.p(I)V")
    public void method3512() throws IOException {
        this.method3516();
        this.field2938.method3492();
    }

    @ObfuscatedName("gs.g(J)V")
    public void method3513(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field2941 = arg0;
    }

    @ObfuscatedName("gs.x(S)J")
    public long method3514() {
        return this.field2947;
    }

    @ObfuscatedName("gs.c([BI)V")
    public void method3515(byte[] arg0) throws IOException {
        this.method3511(arg0, 0, arg0.length);
    }

    @ObfuscatedName("gs.n([BIII)V")
    public void method3511(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field2945 != -1L && this.field2941 >= this.field2945 && this.field2941 + (long) arg2 <= this.field2945 + (long) this.field2944) {
                System.arraycopy(this.field2942, (int) (this.field2941 - this.field2945), arg0, arg1, arg2);
                this.field2941 += (long) arg2;
                return;
            }
            long var4 = this.field2941;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field2941 >= this.field2940 && this.field2941 < this.field2940 + (long) this.field2946) {
                int var8 = (int) ((long) this.field2946 - (this.field2941 - this.field2940));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field2939, (int) (this.field2941 - this.field2940), arg0, arg1, var8);
                this.field2941 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field2939.length) {
                this.field2938.method3508(this.field2941);
                this.field2943 = this.field2941;
                while (arg2 > 0) {
                    int var9 = this.field2938.method3507(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field2943 += (long) var9;
                    this.field2941 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method3517();
                int var10 = arg2;
                if (arg2 > this.field2946) {
                    var10 = this.field2946;
                }
                System.arraycopy(this.field2939, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field2941 += (long) var10;
            }
            if (this.field2945 != -1L) {
                if (this.field2945 > this.field2941 && arg2 > 0) {
                    int var11 = (int) (this.field2945 - this.field2941) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field2941++;
                    }
                }
                long var12 = -1L;
                long var14 = -1L;
                if (this.field2945 >= var4 && this.field2945 < (long) var7 + var4) {
                    var12 = this.field2945;
                } else if (var4 >= this.field2945 && var4 < this.field2945 + (long) this.field2944) {
                    var12 = var4;
                }
                if (this.field2945 + (long) this.field2944 > var4 && this.field2945 + (long) this.field2944 <= (long) var7 + var4) {
                    var14 = this.field2945 + (long) this.field2944;
                } else if ((long) var7 + var4 > this.field2945 && (long) var7 + var4 <= this.field2945 + (long) this.field2944) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field2942, (int) (var12 - this.field2945), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field2941) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field2941));
                        this.field2941 = var14;
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

    @ObfuscatedName("gs.s(B)V")
    public void method3517() throws IOException {
        this.field2946 = 0;
        if (this.field2943 != this.field2941) {
            this.field2938.method3508(this.field2941);
            this.field2943 = this.field2941;
        }
        this.field2940 = this.field2941;
        while (this.field2946 < this.field2939.length) {
            int var1 = this.field2938.method3507(this.field2939, this.field2946, this.field2939.length - this.field2946);
            if (var1 == -1) {
                break;
            }
            this.field2943 += (long) var1;
            this.field2946 += var1;
        }
    }

    @ObfuscatedName("gs.r([BIII)V")
    public void method3532(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field2941 + (long) arg2 > this.field2947) {
                this.field2947 = this.field2941 + (long) arg2;
            }
            if (this.field2945 != -1L && (this.field2941 < this.field2945 || this.field2941 > this.field2945 + (long) this.field2944)) {
                this.method3516();
            }
            if (this.field2945 != -1L && this.field2941 + (long) arg2 > this.field2945 + (long) this.field2942.length) {
                int var4 = (int) ((long) this.field2942.length - (this.field2941 - this.field2945));
                System.arraycopy(arg0, arg1, this.field2942, (int) (this.field2941 - this.field2945), var4);
                this.field2941 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field2944 = this.field2942.length;
                this.method3516();
            }
            if (arg2 > this.field2942.length) {
                if (this.field2943 != this.field2941) {
                    this.field2938.method3508(this.field2941);
                    this.field2943 = this.field2941;
                }
                this.field2938.method3491(arg0, arg1, arg2);
                this.field2943 += (long) arg2;
                if (this.field2943 > this.field2948) {
                    this.field2948 = this.field2943;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field2941 >= this.field2940 && this.field2941 < this.field2940 + (long) this.field2946) {
                    var5 = this.field2941;
                } else if (this.field2940 >= this.field2941 && this.field2940 < this.field2941 + (long) arg2) {
                    var5 = this.field2940;
                }
                if (this.field2941 + (long) arg2 > this.field2940 && this.field2941 + (long) arg2 <= this.field2940 + (long) this.field2946) {
                    var7 = this.field2941 + (long) arg2;
                } else if (this.field2940 + (long) this.field2946 > this.field2941 && this.field2940 + (long) this.field2946 <= this.field2941 + (long) arg2) {
                    var7 = this.field2940 + (long) this.field2946;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field2941), this.field2939, (int) (var5 - this.field2940), var9);
                }
                this.field2941 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field2945 == -1L) {
                    this.field2945 = this.field2941;
                }
                System.arraycopy(arg0, arg1, this.field2942, (int) (this.field2941 - this.field2945), arg2);
                this.field2941 += (long) arg2;
                if (this.field2941 - this.field2945 > (long) this.field2944) {
                    this.field2944 = (int) (this.field2941 - this.field2945);
                }
            }
        } catch (IOException var11) {
            this.field2943 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("gs.w(I)V")
    public void method3516() throws IOException {
        if (this.field2945 == -1L) {
            return;
        }
        if (this.field2945 != this.field2943) {
            this.field2938.method3508(this.field2945);
            this.field2943 = this.field2945;
        }
        this.field2938.method3491(this.field2942, 0, this.field2944);
        this.field2943 += (long) (this.field2944 * -1544420859) * 933657293L;
        if (this.field2943 > this.field2948) {
            this.field2948 = this.field2943;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field2945 >= this.field2940 && this.field2945 < this.field2940 + (long) this.field2946) {
            var1 = this.field2945;
        } else if (this.field2940 >= this.field2945 && this.field2940 < this.field2945 + (long) this.field2944) {
            var1 = this.field2940;
        }
        if (this.field2945 + (long) this.field2944 > this.field2940 && this.field2945 + (long) this.field2944 <= this.field2940 + (long) this.field2946) {
            var3 = this.field2945 + (long) this.field2944;
        } else if (this.field2940 + (long) this.field2946 > this.field2945 && this.field2940 + (long) this.field2946 <= this.field2945 + (long) this.field2944) {
            var3 = this.field2940 + (long) this.field2946;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field2942, (int) (var1 - this.field2945), this.field2939, (int) (var1 - this.field2940), var5);
        }
        this.field2945 = -1L;
        this.field2944 = 0;
    }
}
