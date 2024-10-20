package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("gs")
public class class197 {

    @ObfuscatedName("gs.g")
    public class196 field2941;

    @ObfuscatedName("gs.s")
    public byte[] field2946;

    @ObfuscatedName("gs.h")
    public long field2940 = -1L;

    @ObfuscatedName("gs.m")
    public int field2943;

    @ObfuscatedName("gs.u")
    public byte[] field2944;

    @ObfuscatedName("gs.j")
    public long field2942 = -1L;

    @ObfuscatedName("gs.b")
    public int field2947 = 0;

    @ObfuscatedName("gs.v")
    public long field2945;

    @ObfuscatedName("gs.y")
    public long field2948;

    @ObfuscatedName("gs.w")
    public long field2949;

    @ObfuscatedName("gs.x")
    public long field2950;

    public class197(class196 arg0, int arg1, int arg2) throws IOException {
        this.field2941 = arg0;
        this.field2949 = this.field2948 = arg0.method3423();
        this.field2946 = new byte[arg1];
        this.field2944 = new byte[arg2];
        this.field2945 = 0L;
    }

    @ObfuscatedName("gs.g(B)V")
    public void method3441() throws IOException {
        this.method3448();
        this.field2941.method3422();
    }

    @ObfuscatedName("gs.s(J)V")
    public void method3450(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field2945 = arg0;
    }

    @ObfuscatedName("gs.h(B)J")
    public long method3443() {
        return this.field2949;
    }

    @ObfuscatedName("gs.m([BI)V")
    public void method3444(byte[] arg0) throws IOException {
        this.method3445(arg0, 0, arg0.length);
    }

    @ObfuscatedName("gs.u([BIII)V")
    public void method3445(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field2942 != -1L && this.field2945 >= this.field2942 && this.field2945 + (long) arg2 <= this.field2942 + (long) this.field2947) {
                System.arraycopy(this.field2944, (int) (this.field2945 - this.field2942), arg0, arg1, arg2);
                this.field2945 += (long) arg2;
                return;
            }
            long var4 = this.field2945;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field2945 >= this.field2940 && this.field2945 < this.field2940 + (long) this.field2943) {
                int var8 = (int) ((long) this.field2943 - (this.field2945 - this.field2940));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field2946, (int) (this.field2945 - this.field2940), arg0, arg1, var8);
                this.field2945 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field2946.length) {
                this.field2941.method3420(this.field2945);
                this.field2950 = this.field2945;
                while (arg2 > 0) {
                    int var9 = this.field2941.method3424(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field2950 += (long) var9;
                    this.field2945 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method3442();
                int var10 = arg2;
                if (arg2 > this.field2943) {
                    var10 = this.field2943;
                }
                System.arraycopy(this.field2946, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field2945 += (long) var10;
            }
            if (this.field2942 != -1L) {
                if (this.field2942 > this.field2945 && arg2 > 0) {
                    int var11 = (int) (this.field2942 - this.field2945) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field2945++;
                    }
                }
                long var12 = -1L;
                long var14 = -1L;
                if (this.field2942 >= var4 && this.field2942 < (long) var7 + var4) {
                    var12 = this.field2942;
                } else if (var4 >= this.field2942 && var4 < this.field2942 + (long) this.field2947) {
                    var12 = var4;
                }
                if (this.field2942 + (long) this.field2947 > var4 && this.field2942 + (long) this.field2947 <= (long) var7 + var4) {
                    var14 = this.field2942 + (long) this.field2947;
                } else if ((long) var7 + var4 > this.field2942 && (long) var7 + var4 <= this.field2942 + (long) this.field2947) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field2944, (int) (var12 - this.field2942), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field2945) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field2945));
                        this.field2945 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field2950 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("gs.j(B)V")
    public void method3442() throws IOException {
        this.field2943 = 0;
        if (this.field2950 != this.field2945) {
            this.field2941.method3420(this.field2945);
            this.field2950 = this.field2945;
        }
        this.field2940 = this.field2945;
        while (this.field2943 < this.field2946.length) {
            int var1 = this.field2941.method3424(this.field2946, this.field2943, this.field2946.length - this.field2943);
            if (var1 == -1) {
                break;
            }
            this.field2950 += (long) var1;
            this.field2943 += var1;
        }
    }

    @ObfuscatedName("gs.b([BIII)V")
    public void method3463(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field2945 + (long) arg2 > this.field2949) {
                this.field2949 = this.field2945 + (long) arg2;
            }
            if (this.field2942 != -1L && (this.field2945 < this.field2942 || this.field2945 > this.field2942 + (long) this.field2947)) {
                this.method3448();
            }
            if (this.field2942 != -1L && this.field2945 + (long) arg2 > this.field2942 + (long) this.field2944.length) {
                int var4 = (int) ((long) this.field2944.length - (this.field2945 - this.field2942));
                System.arraycopy(arg0, arg1, this.field2944, (int) (this.field2945 - this.field2942), var4);
                this.field2945 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field2947 = this.field2944.length;
                this.method3448();
            }
            if (arg2 > this.field2944.length) {
                if (this.field2950 != this.field2945) {
                    this.field2941.method3420(this.field2945);
                    this.field2950 = this.field2945;
                }
                this.field2941.method3426(arg0, arg1, arg2);
                this.field2950 += (long) arg2;
                if (this.field2950 > this.field2948) {
                    this.field2948 = this.field2950;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field2945 >= this.field2940 && this.field2945 < this.field2940 + (long) this.field2943) {
                    var5 = this.field2945;
                } else if (this.field2940 >= this.field2945 && this.field2940 < this.field2945 + (long) arg2) {
                    var5 = this.field2940;
                }
                if (this.field2945 + (long) arg2 > this.field2940 && this.field2945 + (long) arg2 <= this.field2940 + (long) this.field2943) {
                    var7 = this.field2945 + (long) arg2;
                } else if (this.field2940 + (long) this.field2943 > this.field2945 && this.field2940 + (long) this.field2943 <= this.field2945 + (long) arg2) {
                    var7 = this.field2940 + (long) this.field2943;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field2945), this.field2946, (int) (var5 - this.field2940), var9);
                }
                this.field2945 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field2942 == -1L) {
                    this.field2942 = this.field2945;
                }
                System.arraycopy(arg0, arg1, this.field2944, (int) (this.field2945 - this.field2942), arg2);
                this.field2945 += (long) arg2;
                if (this.field2945 - this.field2942 > (long) this.field2947) {
                    this.field2947 = (int) (this.field2945 - this.field2942);
                }
            }
        } catch (IOException var11) {
            this.field2950 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("gs.v(I)V")
    public void method3448() throws IOException {
        if (this.field2942 == -1L) {
            return;
        }
        if (this.field2950 != this.field2942) {
            this.field2941.method3420(this.field2942);
            this.field2950 = this.field2942;
        }
        this.field2941.method3426(this.field2944, 0, this.field2947);
        this.field2950 += (long) (this.field2947 * -850036915) * -914581115L;
        if (this.field2950 > this.field2948) {
            this.field2948 = this.field2950;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field2942 >= this.field2940 && this.field2942 < this.field2940 + (long) this.field2943) {
            var1 = this.field2942;
        } else if (this.field2940 >= this.field2942 && this.field2940 < this.field2942 + (long) this.field2947) {
            var1 = this.field2940;
        }
        if (this.field2942 + (long) this.field2947 > this.field2940 && this.field2942 + (long) this.field2947 <= this.field2940 + (long) this.field2943) {
            var3 = this.field2942 + (long) this.field2947;
        } else if (this.field2940 + (long) this.field2943 > this.field2942 && this.field2940 + (long) this.field2943 <= this.field2942 + (long) this.field2947) {
            var3 = this.field2940 + (long) this.field2943;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field2944, (int) (var1 - this.field2942), this.field2946, (int) (var1 - this.field2940), var5);
        }
        this.field2942 = -1L;
        this.field2947 = 0;
    }
}
