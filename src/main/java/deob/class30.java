package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("az")
public class class30 {

    @ObfuscatedName("az.p")
    public class29 field755;

    @ObfuscatedName("az.e")
    public byte[] field748;

    @ObfuscatedName("az.a")
    public long field763 = -1L;

    @ObfuscatedName("az.h")
    public int field750;

    @ObfuscatedName("az.y")
    public byte[] field751;

    @ObfuscatedName("az.j")
    public long field752 = -1L;

    @ObfuscatedName("az.l")
    public int field753 = 0;

    @ObfuscatedName("az.f")
    public long field749;

    @ObfuscatedName("az.n")
    public long field760;

    @ObfuscatedName("az.k")
    public long field754;

    @ObfuscatedName("az.q")
    public long field747;

    public class30(class29 arg0, int arg1, int arg2) throws IOException {
        this.field755 = arg0;
        this.field754 = this.field760 = arg0.method583();
        this.field748 = new byte[arg1];
        this.field751 = new byte[arg2];
        this.field749 = 0L;
    }

    @ObfuscatedName("az.p(I)V")
    public void method586() throws IOException {
        this.method593();
        this.field755.method559();
    }

    @ObfuscatedName("az.e(J)V")
    public void method587(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field749 = arg0;
    }

    @ObfuscatedName("az.a(I)J")
    public long method588() {
        return this.field754;
    }

    @ObfuscatedName("az.h([BI)V")
    public void method585(byte[] arg0) throws IOException {
        this.method590(arg0, 0, arg0.length);
    }

    @ObfuscatedName("az.y([BIII)V")
    public void method590(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field752 != -1L && this.field749 >= this.field752 && this.field749 + (long) arg2 <= this.field752 + (long) this.field753) {
                System.arraycopy(this.field751, (int) (this.field749 - this.field752), arg0, arg1, arg2);
                this.field749 += (long) arg2;
                return;
            }
            long var4 = this.field749;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field749 >= this.field763 && this.field749 < this.field763 + (long) this.field750) {
                int var8 = (int) ((long) this.field750 - (this.field749 - this.field763));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field748, (int) (this.field749 - this.field763), arg0, arg1, var8);
                this.field749 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field748.length) {
                this.field755.method560(this.field749);
                this.field747 = this.field749;
                while (arg2 > 0) {
                    int var9 = this.field755.method578(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field747 += (long) var9;
                    this.field749 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method610();
                int var10 = arg2;
                if (arg2 > this.field750) {
                    var10 = this.field750;
                }
                System.arraycopy(this.field748, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field749 += (long) var10;
            }
            if (this.field752 != -1L) {
                if (this.field752 > this.field749 && arg2 > 0) {
                    int var11 = (int) (this.field752 - this.field749) + arg1;
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
                if (this.field752 >= var4 && this.field752 < (long) var7 + var4) {
                    var12 = this.field752;
                } else if (var4 >= this.field752 && var4 < this.field752 + (long) this.field753) {
                    var12 = var4;
                }
                if (this.field752 + (long) this.field753 > var4 && this.field752 + (long) this.field753 <= (long) var7 + var4) {
                    var14 = this.field752 + (long) this.field753;
                } else if ((long) var7 + var4 > this.field752 && (long) var7 + var4 <= this.field752 + (long) this.field753) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field751, (int) (var12 - this.field752), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field749) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field749));
                        this.field749 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field747 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("az.j(I)V")
    public void method610() throws IOException {
        this.field750 = 0;
        if (this.field749 != this.field747) {
            this.field755.method560(this.field749);
            this.field747 = this.field749;
        }
        this.field763 = this.field749;
        while (this.field750 < this.field748.length) {
            int var1 = this.field755.method578(this.field748, this.field750, this.field748.length - this.field750);
            if (var1 == -1) {
                break;
            }
            this.field747 += (long) var1;
            this.field750 += var1;
        }
    }

    @ObfuscatedName("az.l([BIIB)V")
    public void method592(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field749 + (long) arg2 > this.field754) {
                this.field754 = this.field749 + (long) arg2;
            }
            if (this.field752 != -1L && (this.field749 < this.field752 || this.field749 > this.field752 + (long) this.field753)) {
                this.method593();
            }
            if (this.field752 != -1L && this.field749 + (long) arg2 > this.field752 + (long) this.field751.length) {
                int var4 = (int) ((long) this.field751.length - (this.field749 - this.field752));
                System.arraycopy(arg0, arg1, this.field751, (int) (this.field749 - this.field752), var4);
                this.field749 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field753 = this.field751.length;
                this.method593();
            }
            if (arg2 > this.field751.length) {
                if (this.field749 != this.field747) {
                    this.field755.method560(this.field749);
                    this.field747 = this.field749;
                }
                this.field755.method561(arg0, arg1, arg2);
                this.field747 += (long) arg2;
                if (this.field747 > this.field760) {
                    this.field760 = this.field747;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field749 >= this.field763 && this.field749 < this.field763 + (long) this.field750) {
                    var5 = this.field749;
                } else if (this.field763 >= this.field749 && this.field763 < this.field749 + (long) arg2) {
                    var5 = this.field763;
                }
                if (this.field749 + (long) arg2 > this.field763 && this.field749 + (long) arg2 <= this.field763 + (long) this.field750) {
                    var7 = this.field749 + (long) arg2;
                } else if (this.field763 + (long) this.field750 > this.field749 && this.field763 + (long) this.field750 <= this.field749 + (long) arg2) {
                    var7 = this.field763 + (long) this.field750;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field749), this.field748, (int) (var5 - this.field763), var9);
                }
                this.field749 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field752 == -1L) {
                    this.field752 = this.field749;
                }
                System.arraycopy(arg0, arg1, this.field751, (int) (this.field749 - this.field752), arg2);
                this.field749 += (long) arg2;
                if (this.field749 - this.field752 > (long) this.field753) {
                    this.field753 = (int) (this.field749 - this.field752);
                }
            }
        } catch (IOException var11) {
            this.field747 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("az.f(B)V")
    public void method593() throws IOException {
        if (this.field752 == -1L) {
            return;
        }
        if (this.field752 != this.field747) {
            this.field755.method560(this.field752);
            this.field747 = this.field752;
        }
        this.field755.method561(this.field751, 0, this.field753);
        this.field747 += (long) (this.field753 * 1151163243) * -432867005L;
        if (this.field747 > this.field760) {
            this.field760 = this.field747;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field752 >= this.field763 && this.field752 < this.field763 + (long) this.field750) {
            var1 = this.field752;
        } else if (this.field763 >= this.field752 && this.field763 < this.field752 + (long) this.field753) {
            var1 = this.field763;
        }
        if (this.field752 + (long) this.field753 > this.field763 && this.field752 + (long) this.field753 <= this.field763 + (long) this.field750) {
            var3 = this.field752 + (long) this.field753;
        } else if (this.field763 + (long) this.field750 > this.field752 && this.field763 + (long) this.field750 <= this.field752 + (long) this.field753) {
            var3 = this.field763 + (long) this.field750;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field751, (int) (var1 - this.field752), this.field748, (int) (var1 - this.field763), var5);
        }
        this.field752 = -1L;
        this.field753 = 0;
    }
}
