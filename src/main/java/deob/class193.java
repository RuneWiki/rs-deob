package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("gz")
public class class193 {

    @ObfuscatedName("gz.e")
    public class192 field2911;

    @ObfuscatedName("gz.p")
    public byte[] field2910;

    @ObfuscatedName("gz.a")
    public long field2903 = -1L;

    @ObfuscatedName("gz.g")
    public int field2901;

    @ObfuscatedName("gz.u")
    public byte[] field2905;

    @ObfuscatedName("gz.k")
    public long field2906 = -1L;

    @ObfuscatedName("gz.m")
    public int field2902 = 0;

    @ObfuscatedName("gz.t")
    public long field2908;

    @ObfuscatedName("gz.l")
    public long field2907;

    @ObfuscatedName("gz.f")
    public long field2904;

    @ObfuscatedName("gz.c")
    public long field2909;

    public class193(class192 arg0, int arg1, int arg2) throws IOException {
        this.field2911 = arg0;
        this.field2904 = this.field2907 = arg0.method3414();
        this.field2910 = new byte[arg1];
        this.field2905 = new byte[arg2];
        this.field2908 = 0L;
    }

    @ObfuscatedName("gz.e(I)V")
    public void method3459() throws IOException {
        this.method3443();
        this.field2911.method3413();
    }

    @ObfuscatedName("gz.p(J)V")
    public void method3434(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field2908 = arg0;
    }

    @ObfuscatedName("gz.a(B)J")
    public long method3433() {
        return this.field2904;
    }

    @ObfuscatedName("gz.g([BI)V")
    public void method3436(byte[] arg0) throws IOException {
        this.method3440(arg0, 0, arg0.length);
    }

    @ObfuscatedName("gz.u([BIIB)V")
    public void method3440(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field2906 != -1L && this.field2908 >= this.field2906 && this.field2908 + (long) arg2 <= this.field2906 + (long) this.field2902) {
                System.arraycopy(this.field2905, (int) (this.field2908 - this.field2906), arg0, arg1, arg2);
                this.field2908 += (long) arg2;
                return;
            }
            long var4 = this.field2908;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field2908 >= this.field2903 && this.field2908 < this.field2903 + (long) this.field2901) {
                int var8 = (int) ((long) this.field2901 - (this.field2908 - this.field2903));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field2910, (int) (this.field2908 - this.field2903), arg0, arg1, var8);
                this.field2908 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field2910.length) {
                this.field2911.method3411(this.field2908);
                this.field2909 = this.field2908;
                while (arg2 > 0) {
                    int var9 = this.field2911.method3416(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field2909 += (long) var9;
                    this.field2908 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method3438();
                int var10 = arg2;
                if (arg2 > this.field2901) {
                    var10 = this.field2901;
                }
                System.arraycopy(this.field2910, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field2908 += (long) var10;
            }
            if (this.field2906 != -1L) {
                if (this.field2906 > this.field2908 && arg2 > 0) {
                    int var11 = (int) (this.field2906 - this.field2908) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field2908++;
                    }
                }
                long var12 = -1L;
                long var14 = -1L;
                if (this.field2906 >= var4 && this.field2906 < (long) var7 + var4) {
                    var12 = this.field2906;
                } else if (var4 >= this.field2906 && var4 < this.field2906 + (long) this.field2902) {
                    var12 = var4;
                }
                if (this.field2906 + (long) this.field2902 > var4 && this.field2906 + (long) this.field2902 <= (long) var7 + var4) {
                    var14 = this.field2906 + (long) this.field2902;
                } else if ((long) var7 + var4 > this.field2906 && (long) var7 + var4 <= this.field2906 + (long) this.field2902) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field2905, (int) (var12 - this.field2906), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field2908) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field2908));
                        this.field2908 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field2909 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("gz.k(I)V")
    public void method3438() throws IOException {
        this.field2901 = 0;
        if (this.field2909 != this.field2908) {
            this.field2911.method3411(this.field2908);
            this.field2909 = this.field2908;
        }
        this.field2903 = this.field2908;
        while (this.field2901 < this.field2910.length) {
            int var1 = this.field2911.method3416(this.field2910, this.field2901, this.field2910.length - this.field2901);
            if (var1 == -1) {
                break;
            }
            this.field2909 += (long) var1;
            this.field2901 += var1;
        }
    }

    @ObfuscatedName("gz.m([BIIB)V")
    public void method3457(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field2908 + (long) arg2 > this.field2904) {
                this.field2904 = this.field2908 + (long) arg2;
            }
            if (this.field2906 != -1L && (this.field2908 < this.field2906 || this.field2908 > this.field2906 + (long) this.field2902)) {
                this.method3443();
            }
            if (this.field2906 != -1L && this.field2908 + (long) arg2 > this.field2906 + (long) this.field2905.length) {
                int var4 = (int) ((long) this.field2905.length - (this.field2908 - this.field2906));
                System.arraycopy(arg0, arg1, this.field2905, (int) (this.field2908 - this.field2906), var4);
                this.field2908 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field2902 = this.field2905.length;
                this.method3443();
            }
            if (arg2 > this.field2905.length) {
                if (this.field2909 != this.field2908) {
                    this.field2911.method3411(this.field2908);
                    this.field2909 = this.field2908;
                }
                this.field2911.method3412(arg0, arg1, arg2);
                this.field2909 += (long) arg2;
                if (this.field2909 > this.field2907) {
                    this.field2907 = this.field2909;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field2908 >= this.field2903 && this.field2908 < this.field2903 + (long) this.field2901) {
                    var5 = this.field2908;
                } else if (this.field2903 >= this.field2908 && this.field2903 < this.field2908 + (long) arg2) {
                    var5 = this.field2903;
                }
                if (this.field2908 + (long) arg2 > this.field2903 && this.field2908 + (long) arg2 <= this.field2903 + (long) this.field2901) {
                    var7 = this.field2908 + (long) arg2;
                } else if (this.field2903 + (long) this.field2901 > this.field2908 && this.field2903 + (long) this.field2901 <= this.field2908 + (long) arg2) {
                    var7 = this.field2903 + (long) this.field2901;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field2908), this.field2910, (int) (var5 - this.field2903), var9);
                }
                this.field2908 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field2906 == -1L) {
                    this.field2906 = this.field2908;
                }
                System.arraycopy(arg0, arg1, this.field2905, (int) (this.field2908 - this.field2906), arg2);
                this.field2908 += (long) arg2;
                if (this.field2908 - this.field2906 > (long) this.field2902) {
                    this.field2902 = (int) (this.field2908 - this.field2906);
                }
            }
        } catch (IOException var11) {
            this.field2909 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("gz.t(I)V")
    public void method3443() throws IOException {
        if (this.field2906 == -1L) {
            return;
        }
        if (this.field2909 != this.field2906) {
            this.field2911.method3411(this.field2906);
            this.field2909 = this.field2906;
        }
        this.field2911.method3412(this.field2905, 0, this.field2902);
        this.field2909 += (long) (this.field2902 * -1898486217) * -2113720441L;
        if (this.field2909 > this.field2907) {
            this.field2907 = this.field2909;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field2906 >= this.field2903 && this.field2906 < this.field2903 + (long) this.field2901) {
            var1 = this.field2906;
        } else if (this.field2903 >= this.field2906 && this.field2903 < this.field2906 + (long) this.field2902) {
            var1 = this.field2903;
        }
        if (this.field2906 + (long) this.field2902 > this.field2903 && this.field2906 + (long) this.field2902 <= this.field2903 + (long) this.field2901) {
            var3 = this.field2906 + (long) this.field2902;
        } else if (this.field2903 + (long) this.field2901 > this.field2906 && this.field2903 + (long) this.field2901 <= this.field2906 + (long) this.field2902) {
            var3 = this.field2903 + (long) this.field2901;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field2905, (int) (var1 - this.field2906), this.field2910, (int) (var1 - this.field2903), var5);
        }
        this.field2906 = -1L;
        this.field2902 = 0;
    }
}
