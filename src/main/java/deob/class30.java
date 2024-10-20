package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("ad")
public class class30 {

    @ObfuscatedName("ad.j")
    public class29 field766;

    @ObfuscatedName("ad.f")
    public byte[] field755;

    @ObfuscatedName("ad.o")
    public long field754 = -1L;

    @ObfuscatedName("ad.h")
    public int field763;

    @ObfuscatedName("ad.u")
    public byte[] field758;

    @ObfuscatedName("ad.a")
    public long field759 = -1L;

    @ObfuscatedName("ad.q")
    public int field756 = 0;

    @ObfuscatedName("ad.t")
    public long field761;

    @ObfuscatedName("ad.n")
    public long field762;

    @ObfuscatedName("ad.i")
    public long field765;

    @ObfuscatedName("ad.c")
    public long field764;

    public class30(class29 arg0, int arg1, int arg2) throws IOException {
        this.field766 = arg0;
        this.field765 = this.field762 = arg0.method588();
        this.field755 = new byte[arg1];
        this.field758 = new byte[arg2];
        this.field761 = 0L;
    }

    @ObfuscatedName("ad.j(B)V")
    public void method591() throws IOException {
        this.method598();
        this.field766.method589();
    }

    @ObfuscatedName("ad.f(J)V")
    public void method592(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field761 = arg0;
    }

    @ObfuscatedName("ad.o(I)J")
    public long method614() {
        return this.field765;
    }

    @ObfuscatedName("ad.h([BB)V")
    public void method619(byte[] arg0) throws IOException {
        this.method595(arg0, 0, arg0.length);
    }

    @ObfuscatedName("ad.u([BIII)V")
    public void method595(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field759 != -1L && this.field761 >= this.field759 && this.field761 + (long) arg2 <= this.field759 + (long) this.field756) {
                System.arraycopy(this.field758, (int) (this.field761 - this.field759), arg0, arg1, arg2);
                this.field761 += (long) arg2;
                return;
            }
            long var4 = this.field761;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field761 >= this.field754 && this.field761 < this.field754 + (long) this.field763) {
                int var8 = (int) ((long) this.field763 - (this.field761 - this.field754));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field755, (int) (this.field761 - this.field754), arg0, arg1, var8);
                this.field761 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field755.length) {
                this.field766.method569(this.field761);
                this.field764 = this.field761;
                while (arg2 > 0) {
                    int var9 = this.field766.method573(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field764 += (long) var9;
                    this.field761 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method596();
                int var10 = arg2;
                if (arg2 > this.field763) {
                    var10 = this.field763;
                }
                System.arraycopy(this.field755, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field761 += (long) var10;
            }
            if (this.field759 != -1L) {
                if (this.field759 > this.field761 && arg2 > 0) {
                    int var11 = (int) (this.field759 - this.field761) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field761++;
                    }
                }
                long var12 = -1L;
                long var14 = -1L;
                if (this.field759 >= var4 && this.field759 < (long) var7 + var4) {
                    var12 = this.field759;
                } else if (var4 >= this.field759 && var4 < this.field759 + (long) this.field756) {
                    var12 = var4;
                }
                if (this.field759 + (long) this.field756 > var4 && this.field759 + (long) this.field756 <= (long) var7 + var4) {
                    var14 = this.field759 + (long) this.field756;
                } else if ((long) var7 + var4 > this.field759 && (long) var7 + var4 <= this.field759 + (long) this.field756) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field758, (int) (var12 - this.field759), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field761) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field761));
                        this.field761 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field764 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("ad.a(S)V")
    public void method596() throws IOException {
        this.field763 = 0;
        if (this.field764 != this.field761) {
            this.field766.method569(this.field761);
            this.field764 = this.field761;
        }
        this.field754 = this.field761;
        while (this.field763 < this.field755.length) {
            int var1 = this.field766.method573(this.field755, this.field763, this.field755.length - this.field763);
            if (var1 == -1) {
                break;
            }
            this.field764 += (long) var1;
            this.field763 += var1;
        }
    }

    @ObfuscatedName("ad.q([BIII)V")
    public void method597(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field761 + (long) arg2 > this.field765) {
                this.field765 = this.field761 + (long) arg2;
            }
            if (this.field759 != -1L && (this.field761 < this.field759 || this.field761 > this.field759 + (long) this.field756)) {
                this.method598();
            }
            if (this.field759 != -1L && this.field761 + (long) arg2 > this.field759 + (long) this.field758.length) {
                int var4 = (int) ((long) this.field758.length - (this.field761 - this.field759));
                System.arraycopy(arg0, arg1, this.field758, (int) (this.field761 - this.field759), var4);
                this.field761 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field756 = this.field758.length;
                this.method598();
            }
            if (arg2 > this.field758.length) {
                if (this.field764 != this.field761) {
                    this.field766.method569(this.field761);
                    this.field764 = this.field761;
                }
                this.field766.method570(arg0, arg1, arg2);
                this.field764 += (long) arg2;
                if (this.field764 > this.field762) {
                    this.field762 = this.field764;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field761 >= this.field754 && this.field761 < this.field754 + (long) this.field763) {
                    var5 = this.field761;
                } else if (this.field754 >= this.field761 && this.field754 < this.field761 + (long) arg2) {
                    var5 = this.field754;
                }
                if (this.field761 + (long) arg2 > this.field754 && this.field761 + (long) arg2 <= this.field754 + (long) this.field763) {
                    var7 = this.field761 + (long) arg2;
                } else if (this.field754 + (long) this.field763 > this.field761 && this.field754 + (long) this.field763 <= this.field761 + (long) arg2) {
                    var7 = this.field754 + (long) this.field763;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field761), this.field755, (int) (var5 - this.field754), var9);
                }
                this.field761 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field759 == -1L) {
                    this.field759 = this.field761;
                }
                System.arraycopy(arg0, arg1, this.field758, (int) (this.field761 - this.field759), arg2);
                this.field761 += (long) arg2;
                if (this.field761 - this.field759 > (long) this.field756) {
                    this.field756 = (int) (this.field761 - this.field759);
                }
            }
        } catch (IOException var11) {
            this.field764 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("ad.t(S)V")
    public void method598() throws IOException {
        if (this.field759 == -1L) {
            return;
        }
        if (this.field764 != this.field759) {
            this.field766.method569(this.field759);
            this.field764 = this.field759;
        }
        this.field766.method570(this.field758, 0, this.field756);
        this.field764 += (long) (this.field756 * 986024521) * -630159367L;
        if (this.field764 > this.field762) {
            this.field762 = this.field764;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field759 >= this.field754 && this.field759 < this.field754 + (long) this.field763) {
            var1 = this.field759;
        } else if (this.field754 >= this.field759 && this.field754 < this.field759 + (long) this.field756) {
            var1 = this.field754;
        }
        if (this.field759 + (long) this.field756 > this.field754 && this.field759 + (long) this.field756 <= this.field754 + (long) this.field763) {
            var3 = this.field759 + (long) this.field756;
        } else if (this.field754 + (long) this.field763 > this.field759 && this.field754 + (long) this.field763 <= this.field759 + (long) this.field756) {
            var3 = this.field754 + (long) this.field763;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field758, (int) (var1 - this.field759), this.field755, (int) (var1 - this.field754), var5);
        }
        this.field759 = -1L;
        this.field756 = 0;
    }
}
