package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("gw")
public class class197 {

    @ObfuscatedName("gw.g")
    public class196 field2946;

    @ObfuscatedName("gw.i")
    public byte[] field2949;

    @ObfuscatedName("gw.k")
    public long field2941 = -1L;

    @ObfuscatedName("gw.e")
    public int field2943;

    @ObfuscatedName("gw.w")
    public byte[] field2944;

    @ObfuscatedName("gw.m")
    public long field2945 = -1L;

    @ObfuscatedName("gw.u")
    public int field2942 = 0;

    @ObfuscatedName("gw.j")
    public long field2947;

    @ObfuscatedName("gw.o")
    public long field2948;

    @ObfuscatedName("gw.h")
    public long field2940;

    @ObfuscatedName("gw.b")
    public long field2950;

    public class197(class196 arg0, int arg1, int arg2) throws IOException {
        this.field2946 = arg0;
        this.field2940 = this.field2948 = arg0.method3422();
        this.field2949 = new byte[arg1];
        this.field2944 = new byte[arg2];
        this.field2947 = 0L;
    }

    @ObfuscatedName("gw.g(I)V")
    public void method3460() throws IOException {
        this.method3445();
        this.field2946.method3424();
    }

    @ObfuscatedName("gw.i(J)V")
    public void method3453(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field2947 = arg0;
    }

    @ObfuscatedName("gw.k(I)J")
    public long method3439() {
        return this.field2940;
    }

    @ObfuscatedName("gw.e([BI)V")
    public void method3441(byte[] arg0) throws IOException {
        this.method3442(arg0, 0, arg0.length);
    }

    @ObfuscatedName("gw.w([BIII)V")
    public void method3442(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field2945 != -1L && this.field2947 >= this.field2945 && this.field2947 + (long) arg2 <= this.field2945 + (long) this.field2942) {
                System.arraycopy(this.field2944, (int) (this.field2947 - this.field2945), arg0, arg1, arg2);
                this.field2947 += (long) arg2;
                return;
            }
            long var4 = this.field2947;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field2947 >= this.field2941 && this.field2947 < this.field2941 + (long) this.field2943) {
                int var8 = (int) ((long) this.field2943 - (this.field2947 - this.field2941));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field2949, (int) (this.field2947 - this.field2941), arg0, arg1, var8);
                this.field2947 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field2949.length) {
                this.field2946.method3420(this.field2947);
                this.field2950 = this.field2947;
                while (arg2 > 0) {
                    int var9 = this.field2946.method3423(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field2950 += (long) var9;
                    this.field2947 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method3463();
                int var10 = arg2;
                if (arg2 > this.field2943) {
                    var10 = this.field2943;
                }
                System.arraycopy(this.field2949, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field2947 += (long) var10;
            }
            if (this.field2945 != -1L) {
                if (this.field2945 > this.field2947 && arg2 > 0) {
                    int var11 = (int) (this.field2945 - this.field2947) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field2947++;
                    }
                }
                long var12 = -1L;
                long var14 = -1L;
                if (this.field2945 >= var4 && this.field2945 < (long) var7 + var4) {
                    var12 = this.field2945;
                } else if (var4 >= this.field2945 && var4 < this.field2945 + (long) this.field2942) {
                    var12 = var4;
                }
                if (this.field2945 + (long) this.field2942 > var4 && this.field2945 + (long) this.field2942 <= (long) var7 + var4) {
                    var14 = this.field2945 + (long) this.field2942;
                } else if ((long) var7 + var4 > this.field2945 && (long) var7 + var4 <= this.field2945 + (long) this.field2942) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field2944, (int) (var12 - this.field2945), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field2947) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field2947));
                        this.field2947 = var14;
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

    @ObfuscatedName("gw.m(B)V")
    public void method3463() throws IOException {
        this.field2943 = 0;
        if (this.field2950 != this.field2947) {
            this.field2946.method3420(this.field2947);
            this.field2950 = this.field2947;
        }
        this.field2941 = this.field2947;
        while (this.field2943 < this.field2949.length) {
            int var1 = this.field2946.method3423(this.field2949, this.field2943, this.field2949.length - this.field2943);
            if (var1 == -1) {
                break;
            }
            this.field2950 += (long) var1;
            this.field2943 += var1;
        }
    }

    @ObfuscatedName("gw.u([BIII)V")
    public void method3440(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field2947 + (long) arg2 > this.field2940) {
                this.field2940 = this.field2947 + (long) arg2;
            }
            if (this.field2945 != -1L && (this.field2947 < this.field2945 || this.field2947 > this.field2945 + (long) this.field2942)) {
                this.method3445();
            }
            if (this.field2945 != -1L && this.field2947 + (long) arg2 > this.field2945 + (long) this.field2944.length) {
                int var4 = (int) ((long) this.field2944.length - (this.field2947 - this.field2945));
                System.arraycopy(arg0, arg1, this.field2944, (int) (this.field2947 - this.field2945), var4);
                this.field2947 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field2942 = this.field2944.length;
                this.method3445();
            }
            if (arg2 > this.field2944.length) {
                if (this.field2950 != this.field2947) {
                    this.field2946.method3420(this.field2947);
                    this.field2950 = this.field2947;
                }
                this.field2946.method3421(arg0, arg1, arg2);
                this.field2950 += (long) arg2;
                if (this.field2950 > this.field2948) {
                    this.field2948 = this.field2950;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field2947 >= this.field2941 && this.field2947 < this.field2941 + (long) this.field2943) {
                    var5 = this.field2947;
                } else if (this.field2941 >= this.field2947 && this.field2941 < this.field2947 + (long) arg2) {
                    var5 = this.field2941;
                }
                if (this.field2947 + (long) arg2 > this.field2941 && this.field2947 + (long) arg2 <= this.field2941 + (long) this.field2943) {
                    var7 = this.field2947 + (long) arg2;
                } else if (this.field2941 + (long) this.field2943 > this.field2947 && this.field2941 + (long) this.field2943 <= this.field2947 + (long) arg2) {
                    var7 = this.field2941 + (long) this.field2943;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field2947), this.field2949, (int) (var5 - this.field2941), var9);
                }
                this.field2947 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field2945 == -1L) {
                    this.field2945 = this.field2947;
                }
                System.arraycopy(arg0, arg1, this.field2944, (int) (this.field2947 - this.field2945), arg2);
                this.field2947 += (long) arg2;
                if (this.field2947 - this.field2945 > (long) this.field2942) {
                    this.field2942 = (int) (this.field2947 - this.field2945);
                }
            }
        } catch (IOException var11) {
            this.field2950 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("gw.j(I)V")
    public void method3445() throws IOException {
        if (this.field2945 == -1L) {
            return;
        }
        if (this.field2950 != this.field2945) {
            this.field2946.method3420(this.field2945);
            this.field2950 = this.field2945;
        }
        this.field2946.method3421(this.field2944, 0, this.field2942);
        this.field2950 += (long) (this.field2942 * 1948757343) * -101454177L;
        if (this.field2950 > this.field2948) {
            this.field2948 = this.field2950;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field2945 >= this.field2941 && this.field2945 < this.field2941 + (long) this.field2943) {
            var1 = this.field2945;
        } else if (this.field2941 >= this.field2945 && this.field2941 < this.field2945 + (long) this.field2942) {
            var1 = this.field2941;
        }
        if (this.field2945 + (long) this.field2942 > this.field2941 && this.field2945 + (long) this.field2942 <= this.field2941 + (long) this.field2943) {
            var3 = this.field2945 + (long) this.field2942;
        } else if (this.field2941 + (long) this.field2943 > this.field2945 && this.field2941 + (long) this.field2943 <= this.field2945 + (long) this.field2942) {
            var3 = this.field2941 + (long) this.field2943;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field2944, (int) (var1 - this.field2945), this.field2949, (int) (var1 - this.field2941), var5);
        }
        this.field2945 = -1L;
        this.field2942 = 0;
    }
}
