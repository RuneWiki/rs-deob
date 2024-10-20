package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("gy")
public class class186 {

    @ObfuscatedName("gy.m")
    public class185 field2881;

    @ObfuscatedName("gy.k")
    public byte[] field2876;

    @ObfuscatedName("gy.y")
    public long field2877 = -1L;

    @ObfuscatedName("gy.g")
    public int field2878;

    @ObfuscatedName("gy.r")
    public byte[] field2879;

    @ObfuscatedName("gy.i")
    public long field2880 = -1L;

    @ObfuscatedName("gy.f")
    public int field2875 = 0;

    @ObfuscatedName("gy.a")
    public long field2882;

    @ObfuscatedName("gy.w")
    public long field2883;

    @ObfuscatedName("gy.u")
    public long field2884;

    @ObfuscatedName("gy.d")
    public long field2888;

    public class186(class185 arg0, int arg1, int arg2) throws IOException {
        this.field2881 = arg0;
        this.field2884 = this.field2883 = arg0.method3355();
        this.field2876 = new byte[arg1];
        this.field2879 = new byte[arg2];
        this.field2882 = 0L;
    }

    @ObfuscatedName("gy.m(I)V")
    public void method3371() throws IOException {
        this.method3388();
        this.field2881.method3351();
    }

    @ObfuscatedName("gy.k(J)V")
    public void method3372(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field2882 = arg0;
    }

    @ObfuscatedName("gy.y(I)J")
    public long method3373() {
        return this.field2884;
    }

    @ObfuscatedName("gy.g([BI)V")
    public void method3374(byte[] arg0) throws IOException {
        this.method3375(arg0, 0, arg0.length);
    }

    @ObfuscatedName("gy.r([BIII)V")
    public void method3375(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field2880 != -1L && this.field2882 >= this.field2880 && this.field2882 + (long) arg2 <= this.field2880 + (long) this.field2875) {
                System.arraycopy(this.field2879, (int) (this.field2882 - this.field2880), arg0, arg1, arg2);
                this.field2882 += (long) arg2;
                return;
            }
            long var4 = this.field2882;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field2882 >= this.field2877 && this.field2882 < this.field2877 + (long) this.field2878) {
                int var8 = (int) ((long) this.field2878 - (this.field2882 - this.field2877));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field2876, (int) (this.field2882 - this.field2877), arg0, arg1, var8);
                this.field2882 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field2876.length) {
                this.field2881.method3349(this.field2882);
                this.field2888 = this.field2882;
                while (arg2 > 0) {
                    int var9 = this.field2881.method3353(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field2888 += (long) var9;
                    this.field2882 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method3395();
                int var10 = arg2;
                if (arg2 > this.field2878) {
                    var10 = this.field2878;
                }
                System.arraycopy(this.field2876, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field2882 += (long) var10;
            }
            if (this.field2880 != -1L) {
                if (this.field2880 > this.field2882 && arg2 > 0) {
                    int var11 = (int) (this.field2880 - this.field2882) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field2882++;
                    }
                }
                long var12 = -1L;
                long var14 = -1L;
                if (this.field2880 >= var4 && this.field2880 < (long) var7 + var4) {
                    var12 = this.field2880;
                } else if (var4 >= this.field2880 && var4 < this.field2880 + (long) this.field2875) {
                    var12 = var4;
                }
                if (this.field2880 + (long) this.field2875 > var4 && this.field2880 + (long) this.field2875 <= (long) var7 + var4) {
                    var14 = this.field2880 + (long) this.field2875;
                } else if ((long) var7 + var4 > this.field2880 && (long) var7 + var4 <= this.field2880 + (long) this.field2875) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field2879, (int) (var12 - this.field2880), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field2882) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field2882));
                        this.field2882 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field2888 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("gy.i(I)V")
    public void method3395() throws IOException {
        this.field2878 = 0;
        if (this.field2888 != this.field2882) {
            this.field2881.method3349(this.field2882);
            this.field2888 = this.field2882;
        }
        this.field2877 = this.field2882;
        while (this.field2878 < this.field2876.length) {
            int var1 = this.field2881.method3353(this.field2876, this.field2878, this.field2876.length - this.field2878);
            if (var1 == -1) {
                break;
            }
            this.field2888 += (long) var1;
            this.field2878 += var1;
        }
    }

    @ObfuscatedName("gy.f([BIII)V")
    public void method3377(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field2882 + (long) arg2 > this.field2884) {
                this.field2884 = this.field2882 + (long) arg2;
            }
            if (this.field2880 != -1L && (this.field2882 < this.field2880 || this.field2882 > this.field2880 + (long) this.field2875)) {
                this.method3388();
            }
            if (this.field2880 != -1L && this.field2882 + (long) arg2 > this.field2880 + (long) this.field2879.length) {
                int var4 = (int) ((long) this.field2879.length - (this.field2882 - this.field2880));
                System.arraycopy(arg0, arg1, this.field2879, (int) (this.field2882 - this.field2880), var4);
                this.field2882 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field2875 = this.field2879.length;
                this.method3388();
            }
            if (arg2 > this.field2879.length) {
                if (this.field2888 != this.field2882) {
                    this.field2881.method3349(this.field2882);
                    this.field2888 = this.field2882;
                }
                this.field2881.method3350(arg0, arg1, arg2);
                this.field2888 += (long) arg2;
                if (this.field2888 > this.field2883) {
                    this.field2883 = this.field2888;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field2882 >= this.field2877 && this.field2882 < this.field2877 + (long) this.field2878) {
                    var5 = this.field2882;
                } else if (this.field2877 >= this.field2882 && this.field2877 < this.field2882 + (long) arg2) {
                    var5 = this.field2877;
                }
                if (this.field2882 + (long) arg2 > this.field2877 && this.field2882 + (long) arg2 <= this.field2877 + (long) this.field2878) {
                    var7 = this.field2882 + (long) arg2;
                } else if (this.field2877 + (long) this.field2878 > this.field2882 && this.field2877 + (long) this.field2878 <= this.field2882 + (long) arg2) {
                    var7 = this.field2877 + (long) this.field2878;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field2882), this.field2876, (int) (var5 - this.field2877), var9);
                }
                this.field2882 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field2880 == -1L) {
                    this.field2880 = this.field2882;
                }
                System.arraycopy(arg0, arg1, this.field2879, (int) (this.field2882 - this.field2880), arg2);
                this.field2882 += (long) arg2;
                if (this.field2882 - this.field2880 > (long) this.field2875) {
                    this.field2875 = (int) (this.field2882 - this.field2880);
                }
            }
        } catch (IOException var11) {
            this.field2888 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("gy.a(B)V")
    public void method3388() throws IOException {
        if (this.field2880 == -1L) {
            return;
        }
        if (this.field2888 != this.field2880) {
            this.field2881.method3349(this.field2880);
            this.field2888 = this.field2880;
        }
        this.field2881.method3350(this.field2879, 0, this.field2875);
        this.field2888 += (long) (this.field2875 * -1493345005) * 1551693083L;
        if (this.field2888 > this.field2883) {
            this.field2883 = this.field2888;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field2880 >= this.field2877 && this.field2880 < this.field2877 + (long) this.field2878) {
            var1 = this.field2880;
        } else if (this.field2877 >= this.field2880 && this.field2877 < this.field2880 + (long) this.field2875) {
            var1 = this.field2877;
        }
        if (this.field2880 + (long) this.field2875 > this.field2877 && this.field2880 + (long) this.field2875 <= this.field2877 + (long) this.field2878) {
            var3 = this.field2880 + (long) this.field2875;
        } else if (this.field2877 + (long) this.field2878 > this.field2880 && this.field2877 + (long) this.field2878 <= this.field2880 + (long) this.field2875) {
            var3 = this.field2877 + (long) this.field2878;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field2879, (int) (var1 - this.field2880), this.field2876, (int) (var1 - this.field2877), var5);
        }
        this.field2880 = -1L;
        this.field2875 = 0;
    }
}
