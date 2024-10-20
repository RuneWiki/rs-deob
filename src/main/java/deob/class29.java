package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("ao")
public class class29 {

    @ObfuscatedName("ao.c")
    public class28 field754;

    @ObfuscatedName("ao.j")
    public byte[] field747;

    @ObfuscatedName("ao.f")
    public long field753 = -1L;

    @ObfuscatedName("ao.y")
    public int field746;

    @ObfuscatedName("ao.x")
    public byte[] field750;

    @ObfuscatedName("ao.e")
    public long field751 = -1L;

    @ObfuscatedName("ao.m")
    public int field752 = 0;

    @ObfuscatedName("ao.s")
    public long field749;

    @ObfuscatedName("ao.p")
    public long field757;

    @ObfuscatedName("ao.w")
    public long field755;

    @ObfuscatedName("ao.r")
    public long field748;

    public class29(class28 arg0, int arg1, int arg2) throws IOException {
        this.field754 = arg0;
        this.field755 = this.field757 = arg0.method512();
        this.field747 = new byte[arg1];
        this.field750 = new byte[arg2];
        this.field749 = 0L;
    }

    @ObfuscatedName("ao.c(B)V")
    public void method530() throws IOException {
        this.method537();
        this.field754.method510();
    }

    @ObfuscatedName("ao.j(J)V")
    public void method531(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field749 = arg0;
    }

    @ObfuscatedName("ao.f(I)J")
    public long method546() {
        return this.field755;
    }

    @ObfuscatedName("ao.y([BI)V")
    public void method533(byte[] arg0) throws IOException {
        this.method534(arg0, 0, arg0.length);
    }

    @ObfuscatedName("ao.x([BIIB)V")
    public void method534(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field751 != -1L && this.field749 >= this.field751 && this.field749 + (long) arg2 <= this.field751 + (long) this.field752) {
                System.arraycopy(this.field750, (int) (this.field749 - this.field751), arg0, arg1, arg2);
                this.field749 += (long) arg2;
                return;
            }
            long var4 = this.field749;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field749 >= this.field753 && this.field749 < this.field753 + (long) this.field746) {
                int var8 = (int) ((long) this.field746 - (this.field749 - this.field753));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field747, (int) (this.field749 - this.field753), arg0, arg1, var8);
                this.field749 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field747.length) {
                this.field754.method509(this.field749);
                this.field748 = this.field749;
                while (arg2 > 0) {
                    int var9 = this.field754.method517(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field748 += (long) var9;
                    this.field749 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method545();
                int var10 = arg2;
                if (arg2 > this.field746) {
                    var10 = this.field746;
                }
                System.arraycopy(this.field747, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field749 += (long) var10;
            }
            if (this.field751 != -1L) {
                if (this.field751 > this.field749 && arg2 > 0) {
                    int var11 = (int) (this.field751 - this.field749) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field749++;
                    }
                }
                long var12 = -1L;
                long var14 = -1L;
                if (this.field751 >= var4 && this.field751 < (long) var7 + var4) {
                    var12 = this.field751;
                } else if (var4 >= this.field751 && var4 < this.field751 + (long) this.field752) {
                    var12 = var4;
                }
                if (this.field751 + (long) this.field752 > var4 && this.field751 + (long) this.field752 <= (long) var7 + var4) {
                    var14 = this.field751 + (long) this.field752;
                } else if ((long) var7 + var4 > this.field751 && (long) var7 + var4 <= this.field751 + (long) this.field752) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field750, (int) (var12 - this.field751), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field749) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field749));
                        this.field749 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field748 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("ao.e(I)V")
    public void method545() throws IOException {
        this.field746 = 0;
        if (this.field749 != this.field748) {
            this.field754.method509(this.field749);
            this.field748 = this.field749;
        }
        this.field753 = this.field749;
        while (this.field746 < this.field747.length) {
            int var1 = this.field754.method517(this.field747, this.field746, this.field747.length - this.field746);
            if (var1 == -1) {
                break;
            }
            this.field748 += (long) var1;
            this.field746 += var1;
        }
    }

    @ObfuscatedName("ao.m([BIII)V")
    public void method539(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field749 + (long) arg2 > this.field755) {
                this.field755 = this.field749 + (long) arg2;
            }
            if (this.field751 != -1L && (this.field749 < this.field751 || this.field749 > this.field751 + (long) this.field752)) {
                this.method537();
            }
            if (this.field751 != -1L && this.field749 + (long) arg2 > this.field751 + (long) this.field750.length) {
                int var4 = (int) ((long) this.field750.length - (this.field749 - this.field751));
                System.arraycopy(arg0, arg1, this.field750, (int) (this.field749 - this.field751), var4);
                this.field749 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field752 = this.field750.length;
                this.method537();
            }
            if (arg2 > this.field750.length) {
                if (this.field749 != this.field748) {
                    this.field754.method509(this.field749);
                    this.field748 = this.field749;
                }
                this.field754.method511(arg0, arg1, arg2);
                this.field748 += (long) arg2;
                if (this.field748 > this.field757) {
                    this.field757 = this.field748;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field749 >= this.field753 && this.field749 < this.field753 + (long) this.field746) {
                    var5 = this.field749;
                } else if (this.field753 >= this.field749 && this.field753 < this.field749 + (long) arg2) {
                    var5 = this.field753;
                }
                if (this.field749 + (long) arg2 > this.field753 && this.field749 + (long) arg2 <= this.field753 + (long) this.field746) {
                    var7 = this.field749 + (long) arg2;
                } else if (this.field753 + (long) this.field746 > this.field749 && this.field753 + (long) this.field746 <= this.field749 + (long) arg2) {
                    var7 = this.field753 + (long) this.field746;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field749), this.field747, (int) (var5 - this.field753), var9);
                }
                this.field749 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field751 == -1L) {
                    this.field751 = this.field749;
                }
                System.arraycopy(arg0, arg1, this.field750, (int) (this.field749 - this.field751), arg2);
                this.field749 += (long) arg2;
                if (this.field749 - this.field751 > (long) this.field752) {
                    this.field752 = (int) (this.field749 - this.field751);
                }
            }
        } catch (IOException var11) {
            this.field748 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("ao.s(I)V")
    public void method537() throws IOException {
        if (this.field751 == -1L) {
            return;
        }
        if (this.field751 != this.field748) {
            this.field754.method509(this.field751);
            this.field748 = this.field751;
        }
        this.field754.method511(this.field750, 0, this.field752);
        this.field748 += (long) (this.field752 * 1348368121) * -1417254071L;
        if (this.field748 > this.field757) {
            this.field757 = this.field748;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field751 >= this.field753 && this.field751 < this.field753 + (long) this.field746) {
            var1 = this.field751;
        } else if (this.field753 >= this.field751 && this.field753 < this.field751 + (long) this.field752) {
            var1 = this.field753;
        }
        if (this.field751 + (long) this.field752 > this.field753 && this.field751 + (long) this.field752 <= this.field753 + (long) this.field746) {
            var3 = this.field751 + (long) this.field752;
        } else if (this.field753 + (long) this.field746 > this.field751 && this.field753 + (long) this.field746 <= this.field751 + (long) this.field752) {
            var3 = this.field753 + (long) this.field746;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field750, (int) (var1 - this.field751), this.field747, (int) (var1 - this.field753), var5);
        }
        this.field751 = -1L;
        this.field752 = 0;
    }
}
