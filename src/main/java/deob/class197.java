package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("gc")
public class class197 {

    @ObfuscatedName("gc.g")
    public class196 field2941;

    @ObfuscatedName("gc.s")
    public byte[] field2949;

    @ObfuscatedName("gc.v")
    public long field2942 = -1L;

    @ObfuscatedName("gc.o")
    public int field2940;

    @ObfuscatedName("gc.k")
    public byte[] field2944;

    @ObfuscatedName("gc.m")
    public long field2945 = -1L;

    @ObfuscatedName("gc.i")
    public int field2946 = 0;

    @ObfuscatedName("gc.t")
    public long field2947;

    @ObfuscatedName("gc.l")
    public long field2943;

    @ObfuscatedName("gc.p")
    public long field2948;

    @ObfuscatedName("gc.r")
    public long field2950;

    public class197(class196 arg0, int arg1, int arg2) throws IOException {
        this.field2941 = arg0;
        this.field2948 = this.field2943 = arg0.method3403();
        this.field2949 = new byte[arg1];
        this.field2944 = new byte[arg2];
        this.field2947 = 0L;
    }

    @ObfuscatedName("gc.g(I)V")
    public void method3445() throws IOException {
        this.method3443();
        this.field2941.method3406();
    }

    @ObfuscatedName("gc.s(J)V")
    public void method3437(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field2947 = arg0;
    }

    @ObfuscatedName("gc.v(B)J")
    public long method3427() {
        return this.field2948;
    }

    @ObfuscatedName("gc.o([BB)V")
    public void method3423(byte[] arg0) throws IOException {
        this.method3424(arg0, 0, arg0.length);
    }

    @ObfuscatedName("gc.k([BIIB)V")
    public void method3424(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field2945 != -1L && this.field2947 >= this.field2945 && this.field2947 + (long) arg2 <= this.field2945 + (long) this.field2946) {
                System.arraycopy(this.field2944, (int) (this.field2947 - this.field2945), arg0, arg1, arg2);
                this.field2947 += (long) arg2;
                return;
            }
            long var4 = this.field2947;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field2947 >= this.field2942 && this.field2947 < this.field2942 + (long) this.field2940) {
                int var8 = (int) ((long) this.field2940 - (this.field2947 - this.field2942));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field2949, (int) (this.field2947 - this.field2942), arg0, arg1, var8);
                this.field2947 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field2949.length) {
                this.field2941.method3402(this.field2947);
                this.field2950 = this.field2947;
                while (arg2 > 0) {
                    int var9 = this.field2941.method3399(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field2950 += (long) var9;
                    this.field2947 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method3425();
                int var10 = arg2;
                if (arg2 > this.field2940) {
                    var10 = this.field2940;
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
                } else if (var4 >= this.field2945 && var4 < this.field2945 + (long) this.field2946) {
                    var12 = var4;
                }
                if (this.field2945 + (long) this.field2946 > var4 && this.field2945 + (long) this.field2946 <= (long) var7 + var4) {
                    var14 = this.field2945 + (long) this.field2946;
                } else if ((long) var7 + var4 > this.field2945 && (long) var7 + var4 <= this.field2945 + (long) this.field2946) {
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

    @ObfuscatedName("gc.m(I)V")
    public void method3425() throws IOException {
        this.field2940 = 0;
        if (this.field2950 != this.field2947) {
            this.field2941.method3402(this.field2947);
            this.field2950 = this.field2947;
        }
        this.field2942 = this.field2947;
        while (this.field2940 < this.field2949.length) {
            int var1 = this.field2941.method3399(this.field2949, this.field2940, this.field2949.length - this.field2940);
            if (var1 == -1) {
                break;
            }
            this.field2950 += (long) var1;
            this.field2940 += var1;
        }
    }

    @ObfuscatedName("gc.i([BIII)V")
    public void method3440(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field2947 + (long) arg2 > this.field2948) {
                this.field2948 = this.field2947 + (long) arg2;
            }
            if (this.field2945 != -1L && (this.field2947 < this.field2945 || this.field2947 > this.field2945 + (long) this.field2946)) {
                this.method3443();
            }
            if (this.field2945 != -1L && this.field2947 + (long) arg2 > this.field2945 + (long) this.field2944.length) {
                int var4 = (int) ((long) this.field2944.length - (this.field2947 - this.field2945));
                System.arraycopy(arg0, arg1, this.field2944, (int) (this.field2947 - this.field2945), var4);
                this.field2947 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field2946 = this.field2944.length;
                this.method3443();
            }
            if (arg2 > this.field2944.length) {
                if (this.field2950 != this.field2947) {
                    this.field2941.method3402(this.field2947);
                    this.field2950 = this.field2947;
                }
                this.field2941.method3401(arg0, arg1, arg2);
                this.field2950 += (long) arg2;
                if (this.field2950 > this.field2943) {
                    this.field2943 = this.field2950;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field2947 >= this.field2942 && this.field2947 < this.field2942 + (long) this.field2940) {
                    var5 = this.field2947;
                } else if (this.field2942 >= this.field2947 && this.field2942 < this.field2947 + (long) arg2) {
                    var5 = this.field2942;
                }
                if (this.field2947 + (long) arg2 > this.field2942 && this.field2947 + (long) arg2 <= this.field2942 + (long) this.field2940) {
                    var7 = this.field2947 + (long) arg2;
                } else if (this.field2942 + (long) this.field2940 > this.field2947 && this.field2942 + (long) this.field2940 <= this.field2947 + (long) arg2) {
                    var7 = this.field2942 + (long) this.field2940;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field2947), this.field2949, (int) (var5 - this.field2942), var9);
                }
                this.field2947 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field2945 == -1L) {
                    this.field2945 = this.field2947;
                }
                System.arraycopy(arg0, arg1, this.field2944, (int) (this.field2947 - this.field2945), arg2);
                this.field2947 += (long) arg2;
                if (this.field2947 - this.field2945 > (long) this.field2946) {
                    this.field2946 = (int) (this.field2947 - this.field2945);
                }
            }
        } catch (IOException var11) {
            this.field2950 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("gc.t(I)V")
    public void method3443() throws IOException {
        if (this.field2945 == -1L) {
            return;
        }
        if (this.field2950 != this.field2945) {
            this.field2941.method3402(this.field2945);
            this.field2950 = this.field2945;
        }
        this.field2941.method3401(this.field2944, 0, this.field2946);
        this.field2950 += (long) (this.field2946 * -1555990637) * 878526107L;
        if (this.field2950 > this.field2943) {
            this.field2943 = this.field2950;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field2945 >= this.field2942 && this.field2945 < this.field2942 + (long) this.field2940) {
            var1 = this.field2945;
        } else if (this.field2942 >= this.field2945 && this.field2942 < this.field2945 + (long) this.field2946) {
            var1 = this.field2942;
        }
        if (this.field2945 + (long) this.field2946 > this.field2942 && this.field2945 + (long) this.field2946 <= this.field2942 + (long) this.field2940) {
            var3 = this.field2945 + (long) this.field2946;
        } else if (this.field2942 + (long) this.field2940 > this.field2945 && this.field2942 + (long) this.field2940 <= this.field2945 + (long) this.field2946) {
            var3 = this.field2942 + (long) this.field2940;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field2944, (int) (var1 - this.field2945), this.field2949, (int) (var1 - this.field2942), var5);
        }
        this.field2945 = -1L;
        this.field2946 = 0;
    }
}
