package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("gw")
public class class197 {

    @ObfuscatedName("gw.n")
    public class196 field2949;

    @ObfuscatedName("gw.x")
    public byte[] field2954;

    @ObfuscatedName("gw.k")
    public long field2946 = -1L;

    @ObfuscatedName("gw.i")
    public int field2947;

    @ObfuscatedName("gw.d")
    public byte[] field2944;

    @ObfuscatedName("gw.q")
    public long field2953 = -1L;

    @ObfuscatedName("gw.m")
    public int field2950 = 0;

    @ObfuscatedName("gw.a")
    public long field2951;

    @ObfuscatedName("gw.w")
    public long field2952;

    @ObfuscatedName("gw.e")
    public long field2948;

    @ObfuscatedName("gw.o")
    public long field2945;

    public class197(class196 arg0, int arg1, int arg2) throws IOException {
        this.field2949 = arg0;
        this.field2948 = this.field2952 = arg0.method3384();
        this.field2954 = new byte[arg1];
        this.field2944 = new byte[arg2];
        this.field2951 = 0L;
    }

    @ObfuscatedName("gw.n(B)V")
    public void method3402() throws IOException {
        this.method3409();
        this.field2949.method3385();
    }

    @ObfuscatedName("gw.x(J)V")
    public void method3403(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field2951 = arg0;
    }

    @ObfuscatedName("gw.k(I)J")
    public long method3404() {
        return this.field2948;
    }

    @ObfuscatedName("gw.i([BB)V")
    public void method3405(byte[] arg0) throws IOException {
        this.method3406(arg0, 0, arg0.length);
    }

    @ObfuscatedName("gw.d([BIIB)V")
    public void method3406(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field2953 != -1L && this.field2951 >= this.field2953 && this.field2951 + (long) arg2 <= this.field2953 + (long) this.field2950) {
                System.arraycopy(this.field2944, (int) (this.field2951 - this.field2953), arg0, arg1, arg2);
                this.field2951 += (long) arg2;
                return;
            }
            long var4 = this.field2951;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field2951 >= this.field2946 && this.field2951 < this.field2946 + (long) this.field2947) {
                int var8 = (int) ((long) this.field2947 - (this.field2951 - this.field2946));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field2954, (int) (this.field2951 - this.field2946), arg0, arg1, var8);
                this.field2951 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field2954.length) {
                this.field2949.method3381(this.field2951);
                this.field2945 = this.field2951;
                while (arg2 > 0) {
                    int var9 = this.field2949.method3398(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field2945 += (long) var9;
                    this.field2951 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method3423();
                int var10 = arg2;
                if (arg2 > this.field2947) {
                    var10 = this.field2947;
                }
                System.arraycopy(this.field2954, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field2951 += (long) var10;
            }
            if (this.field2953 != -1L) {
                if (this.field2953 > this.field2951 && arg2 > 0) {
                    int var11 = (int) (this.field2953 - this.field2951) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field2951++;
                    }
                }
                long var12 = -1L;
                long var14 = -1L;
                if (this.field2953 >= var4 && this.field2953 < (long) var7 + var4) {
                    var12 = this.field2953;
                } else if (var4 >= this.field2953 && var4 < this.field2953 + (long) this.field2950) {
                    var12 = var4;
                }
                if (this.field2953 + (long) this.field2950 > var4 && this.field2953 + (long) this.field2950 <= (long) var7 + var4) {
                    var14 = this.field2953 + (long) this.field2950;
                } else if ((long) var7 + var4 > this.field2953 && (long) var7 + var4 <= this.field2953 + (long) this.field2950) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field2944, (int) (var12 - this.field2953), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field2951) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field2951));
                        this.field2951 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field2945 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("gw.q(I)V")
    public void method3423() throws IOException {
        this.field2947 = 0;
        if (this.field2951 != this.field2945) {
            this.field2949.method3381(this.field2951);
            this.field2945 = this.field2951;
        }
        this.field2946 = this.field2951;
        while (this.field2947 < this.field2954.length) {
            int var1 = this.field2949.method3398(this.field2954, this.field2947, this.field2954.length - this.field2947);
            if (var1 == -1) {
                break;
            }
            this.field2945 += (long) var1;
            this.field2947 += var1;
        }
    }

    @ObfuscatedName("gw.m([BIII)V")
    public void method3408(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field2951 + (long) arg2 > this.field2948) {
                this.field2948 = this.field2951 + (long) arg2;
            }
            if (this.field2953 != -1L && (this.field2951 < this.field2953 || this.field2951 > this.field2953 + (long) this.field2950)) {
                this.method3409();
            }
            if (this.field2953 != -1L && this.field2951 + (long) arg2 > this.field2953 + (long) this.field2944.length) {
                int var4 = (int) ((long) this.field2944.length - (this.field2951 - this.field2953));
                System.arraycopy(arg0, arg1, this.field2944, (int) (this.field2951 - this.field2953), var4);
                this.field2951 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field2950 = this.field2944.length;
                this.method3409();
            }
            if (arg2 > this.field2944.length) {
                if (this.field2951 != this.field2945) {
                    this.field2949.method3381(this.field2951);
                    this.field2945 = this.field2951;
                }
                this.field2949.method3382(arg0, arg1, arg2);
                this.field2945 += (long) arg2;
                if (this.field2945 > this.field2952) {
                    this.field2952 = this.field2945;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field2951 >= this.field2946 && this.field2951 < this.field2946 + (long) this.field2947) {
                    var5 = this.field2951;
                } else if (this.field2946 >= this.field2951 && this.field2946 < this.field2951 + (long) arg2) {
                    var5 = this.field2946;
                }
                if (this.field2951 + (long) arg2 > this.field2946 && this.field2951 + (long) arg2 <= this.field2946 + (long) this.field2947) {
                    var7 = this.field2951 + (long) arg2;
                } else if (this.field2946 + (long) this.field2947 > this.field2951 && this.field2946 + (long) this.field2947 <= this.field2951 + (long) arg2) {
                    var7 = this.field2946 + (long) this.field2947;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field2951), this.field2954, (int) (var5 - this.field2946), var9);
                }
                this.field2951 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field2953 == -1L) {
                    this.field2953 = this.field2951;
                }
                System.arraycopy(arg0, arg1, this.field2944, (int) (this.field2951 - this.field2953), arg2);
                this.field2951 += (long) arg2;
                if (this.field2951 - this.field2953 > (long) this.field2950) {
                    this.field2950 = (int) (this.field2951 - this.field2953);
                }
            }
        } catch (IOException var11) {
            this.field2945 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("gw.a(I)V")
    public void method3409() throws IOException {
        if (this.field2953 == -1L) {
            return;
        }
        if (this.field2953 != this.field2945) {
            this.field2949.method3381(this.field2953);
            this.field2945 = this.field2953;
        }
        this.field2949.method3382(this.field2944, 0, this.field2950);
        this.field2945 += (long) (this.field2950 * 2112257503) * -818053601L;
        if (this.field2945 > this.field2952) {
            this.field2952 = this.field2945;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field2953 >= this.field2946 && this.field2953 < this.field2946 + (long) this.field2947) {
            var1 = this.field2953;
        } else if (this.field2946 >= this.field2953 && this.field2946 < this.field2953 + (long) this.field2950) {
            var1 = this.field2946;
        }
        if (this.field2953 + (long) this.field2950 > this.field2946 && this.field2953 + (long) this.field2950 <= this.field2946 + (long) this.field2947) {
            var3 = this.field2953 + (long) this.field2950;
        } else if (this.field2946 + (long) this.field2947 > this.field2953 && this.field2946 + (long) this.field2947 <= this.field2953 + (long) this.field2950) {
            var3 = this.field2946 + (long) this.field2947;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field2944, (int) (var1 - this.field2953), this.field2954, (int) (var1 - this.field2946), var5);
        }
        this.field2953 = -1L;
        this.field2950 = 0;
    }
}
