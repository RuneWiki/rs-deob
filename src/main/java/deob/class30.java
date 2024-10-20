package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("ad")
public class class30 {

    @ObfuscatedName("ad.l")
    public class29 field753;

    @ObfuscatedName("ad.b")
    public byte[] field749;

    @ObfuscatedName("ad.o")
    public long field750 = -1L;

    @ObfuscatedName("ad.w")
    public int field751;

    @ObfuscatedName("ad.r")
    public byte[] field752;

    @ObfuscatedName("ad.k")
    public long field762 = -1L;

    @ObfuscatedName("ad.z")
    public int field754 = 0;

    @ObfuscatedName("ad.g")
    public long field748;

    @ObfuscatedName("ad.n")
    public long field755;

    @ObfuscatedName("ad.j")
    public long field757;

    @ObfuscatedName("ad.c")
    public long field758;

    public class30(class29 arg0, int arg1, int arg2) throws IOException {
        this.field753 = arg0;
        this.field757 = this.field755 = arg0.method566();
        this.field749 = new byte[arg1];
        this.field752 = new byte[arg2];
        this.field748 = 0L;
    }

    @ObfuscatedName("ad.l(I)V")
    public void method583() throws IOException {
        this.method589();
        this.field753.method578();
    }

    @ObfuscatedName("ad.b(J)V")
    public void method584(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field748 = arg0;
    }

    @ObfuscatedName("ad.o(I)J")
    public long method585() {
        return this.field757;
    }

    @ObfuscatedName("ad.w([BI)V")
    public void method593(byte[] arg0) throws IOException {
        this.method587(arg0, 0, arg0.length);
    }

    @ObfuscatedName("ad.r([BIIB)V")
    public void method587(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field762 != -1L && this.field748 >= this.field762 && this.field748 + (long) arg2 <= this.field762 + (long) this.field754) {
                System.arraycopy(this.field752, (int) (this.field748 - this.field762), arg0, arg1, arg2);
                this.field748 += (long) arg2;
                return;
            }
            long var4 = this.field748;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field748 >= this.field750 && this.field748 < this.field750 + (long) this.field751) {
                int var8 = (int) ((long) this.field751 - (this.field748 - this.field750));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field749, (int) (this.field748 - this.field750), arg0, arg1, var8);
                this.field748 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field749.length) {
                this.field753.method565(this.field748);
                this.field758 = this.field748;
                while (arg2 > 0) {
                    int var9 = this.field753.method571(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field758 += (long) var9;
                    this.field748 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method588();
                int var10 = arg2;
                if (arg2 > this.field751) {
                    var10 = this.field751;
                }
                System.arraycopy(this.field749, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field748 += (long) var10;
            }
            if (this.field762 != -1L) {
                if (this.field762 > this.field748 && arg2 > 0) {
                    int var11 = (int) (this.field762 - this.field748) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field748++;
                    }
                }
                long var12 = -1L;
                long var14 = -1L;
                if (this.field762 >= var4 && this.field762 < (long) var7 + var4) {
                    var12 = this.field762;
                } else if (var4 >= this.field762 && var4 < this.field762 + (long) this.field754) {
                    var12 = var4;
                }
                if (this.field762 + (long) this.field754 > var4 && this.field762 + (long) this.field754 <= (long) var7 + var4) {
                    var14 = this.field762 + (long) this.field754;
                } else if ((long) var7 + var4 > this.field762 && (long) var7 + var4 <= this.field762 + (long) this.field754) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field752, (int) (var12 - this.field762), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field748) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field748));
                        this.field748 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field758 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("ad.k(I)V")
    public void method588() throws IOException {
        this.field751 = 0;
        if (this.field758 != this.field748) {
            this.field753.method565(this.field748);
            this.field758 = this.field748;
        }
        this.field750 = this.field748;
        while (this.field751 < this.field749.length) {
            int var1 = this.field753.method571(this.field749, this.field751, this.field749.length - this.field751);
            if (var1 == -1) {
                break;
            }
            this.field758 += (long) var1;
            this.field751 += var1;
        }
    }

    @ObfuscatedName("ad.z([BIIS)V")
    public void method595(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field748 + (long) arg2 > this.field757) {
                this.field757 = this.field748 + (long) arg2;
            }
            if (this.field762 != -1L && (this.field748 < this.field762 || this.field748 > this.field762 + (long) this.field754)) {
                this.method589();
            }
            if (this.field762 != -1L && this.field748 + (long) arg2 > this.field762 + (long) this.field752.length) {
                int var4 = (int) ((long) this.field752.length - (this.field748 - this.field762));
                System.arraycopy(arg0, arg1, this.field752, (int) (this.field748 - this.field762), var4);
                this.field748 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field754 = this.field752.length;
                this.method589();
            }
            if (arg2 > this.field752.length) {
                if (this.field758 != this.field748) {
                    this.field753.method565(this.field748);
                    this.field758 = this.field748;
                }
                this.field753.method564(arg0, arg1, arg2);
                this.field758 += (long) arg2;
                if (this.field758 > this.field755) {
                    this.field755 = this.field758;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field748 >= this.field750 && this.field748 < this.field750 + (long) this.field751) {
                    var5 = this.field748;
                } else if (this.field750 >= this.field748 && this.field750 < this.field748 + (long) arg2) {
                    var5 = this.field750;
                }
                if (this.field748 + (long) arg2 > this.field750 && this.field748 + (long) arg2 <= this.field750 + (long) this.field751) {
                    var7 = this.field748 + (long) arg2;
                } else if (this.field750 + (long) this.field751 > this.field748 && this.field750 + (long) this.field751 <= this.field748 + (long) arg2) {
                    var7 = this.field750 + (long) this.field751;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field748), this.field749, (int) (var5 - this.field750), var9);
                }
                this.field748 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field762 == -1L) {
                    this.field762 = this.field748;
                }
                System.arraycopy(arg0, arg1, this.field752, (int) (this.field748 - this.field762), arg2);
                this.field748 += (long) arg2;
                if (this.field748 - this.field762 > (long) this.field754) {
                    this.field754 = (int) (this.field748 - this.field762);
                }
            }
        } catch (IOException var11) {
            this.field758 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("ad.g(B)V")
    public void method589() throws IOException {
        if (this.field762 == -1L) {
            return;
        }
        if (this.field762 != this.field758) {
            this.field753.method565(this.field762);
            this.field758 = this.field762;
        }
        this.field753.method564(this.field752, 0, this.field754);
        this.field758 += (long) (this.field754 * -951092535) * 1589362553L;
        if (this.field758 > this.field755) {
            this.field755 = this.field758;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field762 >= this.field750 && this.field762 < this.field750 + (long) this.field751) {
            var1 = this.field762;
        } else if (this.field750 >= this.field762 && this.field750 < this.field762 + (long) this.field754) {
            var1 = this.field750;
        }
        if (this.field762 + (long) this.field754 > this.field750 && this.field762 + (long) this.field754 <= this.field750 + (long) this.field751) {
            var3 = this.field762 + (long) this.field754;
        } else if (this.field750 + (long) this.field751 > this.field762 && this.field750 + (long) this.field751 <= this.field762 + (long) this.field754) {
            var3 = this.field750 + (long) this.field751;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field752, (int) (var1 - this.field762), this.field749, (int) (var1 - this.field750), var5);
        }
        this.field762 = -1L;
        this.field754 = 0;
    }
}
