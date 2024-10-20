package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("af")
public class class30 {

    @ObfuscatedName("af.f")
    public class29 field745;

    @ObfuscatedName("af.t")
    public byte[] field746;

    @ObfuscatedName("af.n")
    public long field754 = -1L;

    @ObfuscatedName("af.e")
    public int field755;

    @ObfuscatedName("af.l")
    public byte[] field758;

    @ObfuscatedName("af.d")
    public long field750 = -1L;

    @ObfuscatedName("af.r")
    public int field751 = 0;

    @ObfuscatedName("af.k")
    public long field752;

    @ObfuscatedName("af.u")
    public long field753;

    @ObfuscatedName("af.o")
    public long field749;

    @ObfuscatedName("af.g")
    public long field747;

    public class30(class29 arg0, int arg1, int arg2) throws IOException {
        this.field745 = arg0;
        this.field749 = this.field753 = arg0.method556();
        this.field746 = new byte[arg1];
        this.field758 = new byte[arg2];
        this.field752 = 0L;
    }

    @ObfuscatedName("af.f(B)V")
    public void method576() throws IOException {
        this.method583();
        this.field745.method555();
    }

    @ObfuscatedName("af.t(J)V")
    public void method591(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field752 = arg0;
    }

    @ObfuscatedName("af.n(I)J")
    public long method578() {
        return this.field749;
    }

    @ObfuscatedName("af.e([BI)V")
    public void method590(byte[] arg0) throws IOException {
        this.method580(arg0, 0, arg0.length);
    }

    @ObfuscatedName("af.l([BIIB)V")
    public void method580(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field750 != -1L && this.field752 >= this.field750 && this.field752 + (long) arg2 <= this.field750 + (long) this.field751) {
                System.arraycopy(this.field758, (int) (this.field752 - this.field750), arg0, arg1, arg2);
                this.field752 += (long) arg2;
                return;
            }
            long var4 = this.field752;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field752 >= this.field754 && this.field752 < this.field754 + (long) this.field755) {
                int var8 = (int) ((long) this.field755 - (this.field752 - this.field754));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field746, (int) (this.field752 - this.field754), arg0, arg1, var8);
                this.field752 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field746.length) {
                this.field745.method552(this.field752);
                this.field747 = this.field752;
                while (arg2 > 0) {
                    int var9 = this.field745.method557(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field747 += (long) var9;
                    this.field752 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method577();
                int var10 = arg2;
                if (arg2 > this.field755) {
                    var10 = this.field755;
                }
                System.arraycopy(this.field746, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field752 += (long) var10;
            }
            if (this.field750 != -1L) {
                if (this.field750 > this.field752 && arg2 > 0) {
                    int var11 = (int) (this.field750 - this.field752) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field752++;
                    }
                }
                long var12 = -1L;
                long var14 = -1L;
                if (this.field750 >= var4 && this.field750 < (long) var7 + var4) {
                    var12 = this.field750;
                } else if (var4 >= this.field750 && var4 < this.field750 + (long) this.field751) {
                    var12 = var4;
                }
                if (this.field750 + (long) this.field751 > var4 && this.field750 + (long) this.field751 <= (long) var7 + var4) {
                    var14 = this.field750 + (long) this.field751;
                } else if ((long) var7 + var4 > this.field750 && (long) var7 + var4 <= this.field750 + (long) this.field751) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field758, (int) (var12 - this.field750), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field752) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field752));
                        this.field752 = var14;
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

    @ObfuscatedName("af.d(B)V")
    public void method577() throws IOException {
        this.field755 = 0;
        if (this.field752 != this.field747) {
            this.field745.method552(this.field752);
            this.field747 = this.field752;
        }
        this.field754 = this.field752;
        while (this.field755 < this.field746.length) {
            int var1 = this.field745.method557(this.field746, this.field755, this.field746.length - this.field755);
            if (var1 == -1) {
                break;
            }
            this.field747 += (long) var1;
            this.field755 += var1;
        }
    }

    @ObfuscatedName("af.r([BIIB)V")
    public void method585(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field752 + (long) arg2 > this.field749) {
                this.field749 = this.field752 + (long) arg2;
            }
            if (this.field750 != -1L && (this.field752 < this.field750 || this.field752 > this.field750 + (long) this.field751)) {
                this.method583();
            }
            if (this.field750 != -1L && this.field752 + (long) arg2 > this.field750 + (long) this.field758.length) {
                int var4 = (int) ((long) this.field758.length - (this.field752 - this.field750));
                System.arraycopy(arg0, arg1, this.field758, (int) (this.field752 - this.field750), var4);
                this.field752 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field751 = this.field758.length;
                this.method583();
            }
            if (arg2 > this.field758.length) {
                if (this.field752 != this.field747) {
                    this.field745.method552(this.field752);
                    this.field747 = this.field752;
                }
                this.field745.method554(arg0, arg1, arg2);
                this.field747 += (long) arg2;
                if (this.field747 > this.field753) {
                    this.field753 = this.field747;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field752 >= this.field754 && this.field752 < this.field754 + (long) this.field755) {
                    var5 = this.field752;
                } else if (this.field754 >= this.field752 && this.field754 < this.field752 + (long) arg2) {
                    var5 = this.field754;
                }
                if (this.field752 + (long) arg2 > this.field754 && this.field752 + (long) arg2 <= this.field754 + (long) this.field755) {
                    var7 = this.field752 + (long) arg2;
                } else if (this.field754 + (long) this.field755 > this.field752 && this.field754 + (long) this.field755 <= this.field752 + (long) arg2) {
                    var7 = this.field754 + (long) this.field755;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field752), this.field746, (int) (var5 - this.field754), var9);
                }
                this.field752 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field750 == -1L) {
                    this.field750 = this.field752;
                }
                System.arraycopy(arg0, arg1, this.field758, (int) (this.field752 - this.field750), arg2);
                this.field752 += (long) arg2;
                if (this.field752 - this.field750 > (long) this.field751) {
                    this.field751 = (int) (this.field752 - this.field750);
                }
            }
        } catch (IOException var11) {
            this.field747 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("af.k(B)V")
    public void method583() throws IOException {
        if (this.field750 == -1L) {
            return;
        }
        if (this.field750 != this.field747) {
            this.field745.method552(this.field750);
            this.field747 = this.field750;
        }
        this.field745.method554(this.field758, 0, this.field751);
        this.field747 += (long) (this.field751 * 2047744893) * -1896909355L;
        if (this.field747 > this.field753) {
            this.field753 = this.field747;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field750 >= this.field754 && this.field750 < this.field754 + (long) this.field755) {
            var1 = this.field750;
        } else if (this.field754 >= this.field750 && this.field754 < this.field750 + (long) this.field751) {
            var1 = this.field754;
        }
        if (this.field750 + (long) this.field751 > this.field754 && this.field750 + (long) this.field751 <= this.field754 + (long) this.field755) {
            var3 = this.field750 + (long) this.field751;
        } else if (this.field754 + (long) this.field755 > this.field750 && this.field754 + (long) this.field755 <= this.field750 + (long) this.field751) {
            var3 = this.field754 + (long) this.field755;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field758, (int) (var1 - this.field750), this.field746, (int) (var1 - this.field754), var5);
        }
        this.field750 = -1L;
        this.field751 = 0;
    }
}
