package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("ae")
public class class30 {

    @ObfuscatedName("ae.g")
    public class29 field753;

    @ObfuscatedName("ae.m")
    public byte[] field754;

    @ObfuscatedName("ae.v")
    public long field755 = -1L;

    @ObfuscatedName("ae.r")
    public int field756;

    @ObfuscatedName("ae.n")
    public byte[] field759;

    @ObfuscatedName("ae.i")
    public long field757 = -1L;

    @ObfuscatedName("ae.s")
    public int field764 = 0;

    @ObfuscatedName("ae.w")
    public long field760;

    @ObfuscatedName("ae.d")
    public long field761;

    @ObfuscatedName("ae.t")
    public long field762;

    @ObfuscatedName("ae.f")
    public long field763;

    public class30(class29 arg0, int arg1, int arg2) throws IOException {
        this.field753 = arg0;
        this.field762 = this.field761 = arg0.method548();
        this.field754 = new byte[arg1];
        this.field759 = new byte[arg2];
        this.field760 = 0L;
    }

    @ObfuscatedName("ae.g(B)V")
    public void method581() throws IOException {
        this.method589();
        this.field753.method544();
    }

    @ObfuscatedName("ae.m(J)V")
    public void method568(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field760 = arg0;
    }

    @ObfuscatedName("ae.v(I)J")
    public long method566() {
        return this.field762;
    }

    @ObfuscatedName("ae.r([BI)V")
    public void method570(byte[] arg0) throws IOException {
        this.method571(arg0, 0, arg0.length);
    }

    @ObfuscatedName("ae.n([BIII)V")
    public void method571(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field757 != -1L && this.field760 >= this.field757 && this.field760 + (long) arg2 <= this.field757 + (long) this.field764) {
                System.arraycopy(this.field759, (int) (this.field760 - this.field757), arg0, arg1, arg2);
                this.field760 += (long) arg2;
                return;
            }
            long var4 = this.field760;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field760 >= this.field755 && this.field760 < this.field755 + (long) this.field756) {
                int var8 = (int) ((long) this.field756 - (this.field760 - this.field755));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field754, (int) (this.field760 - this.field755), arg0, arg1, var8);
                this.field760 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field754.length) {
                this.field753.method564(this.field760);
                this.field763 = this.field760;
                while (arg2 > 0) {
                    int var9 = this.field753.method546(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field763 += (long) var9;
                    this.field760 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method572();
                int var10 = arg2;
                if (arg2 > this.field756) {
                    var10 = this.field756;
                }
                System.arraycopy(this.field754, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field760 += (long) var10;
            }
            if (this.field757 != -1L) {
                if (this.field757 > this.field760 && arg2 > 0) {
                    int var11 = (int) (this.field757 - this.field760) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field760++;
                    }
                }
                long var12 = -1L;
                long var14 = -1L;
                if (this.field757 >= var4 && this.field757 < (long) var7 + var4) {
                    var12 = this.field757;
                } else if (var4 >= this.field757 && var4 < this.field757 + (long) this.field764) {
                    var12 = var4;
                }
                if (this.field757 + (long) this.field764 > var4 && this.field757 + (long) this.field764 <= (long) var7 + var4) {
                    var14 = this.field757 + (long) this.field764;
                } else if ((long) var7 + var4 > this.field757 && (long) var7 + var4 <= this.field757 + (long) this.field764) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field759, (int) (var12 - this.field757), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field760) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field760));
                        this.field760 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field763 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("ae.i(I)V")
    public void method572() throws IOException {
        this.field756 = 0;
        if (this.field763 != this.field760) {
            this.field753.method564(this.field760);
            this.field763 = this.field760;
        }
        this.field755 = this.field760;
        while (this.field756 < this.field754.length) {
            int var1 = this.field753.method546(this.field754, this.field756, this.field754.length - this.field756);
            if (var1 == -1) {
                break;
            }
            this.field763 += (long) var1;
            this.field756 += var1;
        }
    }

    @ObfuscatedName("ae.s([BIII)V")
    public void method574(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field760 + (long) arg2 > this.field762) {
                this.field762 = this.field760 + (long) arg2;
            }
            if (this.field757 != -1L && (this.field760 < this.field757 || this.field760 > this.field757 + (long) this.field764)) {
                this.method589();
            }
            if (this.field757 != -1L && this.field760 + (long) arg2 > this.field757 + (long) this.field759.length) {
                int var4 = (int) ((long) this.field759.length - (this.field760 - this.field757));
                System.arraycopy(arg0, arg1, this.field759, (int) (this.field760 - this.field757), var4);
                this.field760 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field764 = this.field759.length;
                this.method589();
            }
            if (arg2 > this.field759.length) {
                if (this.field763 != this.field760) {
                    this.field753.method564(this.field760);
                    this.field763 = this.field760;
                }
                this.field753.method543(arg0, arg1, arg2);
                this.field763 += (long) arg2;
                if (this.field763 > this.field761) {
                    this.field761 = this.field763;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field760 >= this.field755 && this.field760 < this.field755 + (long) this.field756) {
                    var5 = this.field760;
                } else if (this.field755 >= this.field760 && this.field755 < this.field760 + (long) arg2) {
                    var5 = this.field755;
                }
                if (this.field760 + (long) arg2 > this.field755 && this.field760 + (long) arg2 <= this.field755 + (long) this.field756) {
                    var7 = this.field760 + (long) arg2;
                } else if (this.field755 + (long) this.field756 > this.field760 && this.field755 + (long) this.field756 <= this.field760 + (long) arg2) {
                    var7 = this.field755 + (long) this.field756;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field760), this.field754, (int) (var5 - this.field755), var9);
                }
                this.field760 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field757 == -1L) {
                    this.field757 = this.field760;
                }
                System.arraycopy(arg0, arg1, this.field759, (int) (this.field760 - this.field757), arg2);
                this.field760 += (long) arg2;
                if (this.field760 - this.field757 > (long) this.field764) {
                    this.field764 = (int) (this.field760 - this.field757);
                }
            }
        } catch (IOException var11) {
            this.field763 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("ae.w(I)V")
    public void method589() throws IOException {
        if (this.field757 == -1L) {
            return;
        }
        if (this.field763 != this.field757) {
            this.field753.method564(this.field757);
            this.field763 = this.field757;
        }
        this.field753.method543(this.field759, 0, this.field764);
        this.field763 += (long) (this.field764 * -295573637) * 1921376179L;
        if (this.field763 > this.field761) {
            this.field761 = this.field763;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field757 >= this.field755 && this.field757 < this.field755 + (long) this.field756) {
            var1 = this.field757;
        } else if (this.field755 >= this.field757 && this.field755 < this.field757 + (long) this.field764) {
            var1 = this.field755;
        }
        if (this.field757 + (long) this.field764 > this.field755 && this.field757 + (long) this.field764 <= this.field755 + (long) this.field756) {
            var3 = this.field757 + (long) this.field764;
        } else if (this.field755 + (long) this.field756 > this.field757 && this.field755 + (long) this.field756 <= this.field757 + (long) this.field764) {
            var3 = this.field755 + (long) this.field756;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field759, (int) (var1 - this.field757), this.field754, (int) (var1 - this.field755), var5);
        }
        this.field757 = -1L;
        this.field764 = 0;
    }
}
