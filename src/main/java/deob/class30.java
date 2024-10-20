package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("af")
public class class30 {

    @ObfuscatedName("af.p")
    public class29 field770;

    @ObfuscatedName("af.i")
    public byte[] field761;

    @ObfuscatedName("af.o")
    public long field764 = -1L;

    @ObfuscatedName("af.n")
    public int field763;

    @ObfuscatedName("af.l")
    public byte[] field766;

    @ObfuscatedName("af.v")
    public long field765 = -1L;

    @ObfuscatedName("af.g")
    public int field760 = 0;

    @ObfuscatedName("af.x")
    public long field767;

    @ObfuscatedName("af.c")
    public long field768;

    @ObfuscatedName("af.f")
    public long field769;

    @ObfuscatedName("af.r")
    public long field762;

    public class30(class29 arg0, int arg1, int arg2) throws IOException {
        this.field770 = arg0;
        this.field769 = this.field768 = arg0.method581();
        this.field761 = new byte[arg1];
        this.field766 = new byte[arg2];
        this.field767 = 0L;
    }

    @ObfuscatedName("af.p(I)V")
    public void method598() throws IOException {
        this.method605();
        this.field770.method594();
    }

    @ObfuscatedName("af.i(J)V")
    public void method599(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field767 = arg0;
    }

    @ObfuscatedName("af.o(I)J")
    public long method597() {
        return this.field769;
    }

    @ObfuscatedName("af.n([BI)V")
    public void method601(byte[] arg0) throws IOException {
        this.method602(arg0, 0, arg0.length);
    }

    @ObfuscatedName("af.l([BIII)V")
    public void method602(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field765 != -1L && this.field767 >= this.field765 && this.field767 + (long) arg2 <= this.field765 + (long) this.field760) {
                System.arraycopy(this.field766, (int) (this.field767 - this.field765), arg0, arg1, arg2);
                this.field767 += (long) arg2;
                return;
            }
            long var4 = this.field767;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field767 >= this.field764 && this.field767 < this.field764 + (long) this.field763) {
                int var8 = (int) ((long) this.field763 - (this.field767 - this.field764));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field761, (int) (this.field767 - this.field764), arg0, arg1, var8);
                this.field767 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field761.length) {
                this.field770.method587(this.field767);
                this.field762 = this.field767;
                while (arg2 > 0) {
                    int var9 = this.field770.method582(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field762 += (long) var9;
                    this.field767 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method603();
                int var10 = arg2;
                if (arg2 > this.field763) {
                    var10 = this.field763;
                }
                System.arraycopy(this.field761, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field767 += (long) var10;
            }
            if (this.field765 != -1L) {
                if (this.field765 > this.field767 && arg2 > 0) {
                    int var11 = (int) (this.field765 - this.field767) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field767++;
                    }
                }
                long var12 = -1L;
                long var14 = -1L;
                if (this.field765 >= var4 && this.field765 < (long) var7 + var4) {
                    var12 = this.field765;
                } else if (var4 >= this.field765 && var4 < this.field765 + (long) this.field760) {
                    var12 = var4;
                }
                if (this.field765 + (long) this.field760 > var4 && this.field765 + (long) this.field760 <= (long) var7 + var4) {
                    var14 = this.field765 + (long) this.field760;
                } else if ((long) var7 + var4 > this.field765 && (long) var7 + var4 <= this.field765 + (long) this.field760) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field766, (int) (var12 - this.field765), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field767) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field767));
                        this.field767 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field762 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("af.v(B)V")
    public void method603() throws IOException {
        this.field763 = 0;
        if (this.field767 != this.field762) {
            this.field770.method587(this.field767);
            this.field762 = this.field767;
        }
        this.field764 = this.field767;
        while (this.field763 < this.field761.length) {
            int var1 = this.field770.method582(this.field761, this.field763, this.field761.length - this.field763);
            if (var1 == -1) {
                break;
            }
            this.field762 += (long) var1;
            this.field763 += var1;
        }
    }

    @ObfuscatedName("af.g([BIIB)V")
    public void method604(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field767 + (long) arg2 > this.field769) {
                this.field769 = this.field767 + (long) arg2;
            }
            if (this.field765 != -1L && (this.field767 < this.field765 || this.field767 > this.field765 + (long) this.field760)) {
                this.method605();
            }
            if (this.field765 != -1L && this.field767 + (long) arg2 > this.field765 + (long) this.field766.length) {
                int var4 = (int) ((long) this.field766.length - (this.field767 - this.field765));
                System.arraycopy(arg0, arg1, this.field766, (int) (this.field767 - this.field765), var4);
                this.field767 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field760 = this.field766.length;
                this.method605();
            }
            if (arg2 > this.field766.length) {
                if (this.field767 != this.field762) {
                    this.field770.method587(this.field767);
                    this.field762 = this.field767;
                }
                this.field770.method579(arg0, arg1, arg2);
                this.field762 += (long) arg2;
                if (this.field762 > this.field768) {
                    this.field768 = this.field762;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field767 >= this.field764 && this.field767 < this.field764 + (long) this.field763) {
                    var5 = this.field767;
                } else if (this.field764 >= this.field767 && this.field764 < this.field767 + (long) arg2) {
                    var5 = this.field764;
                }
                if (this.field767 + (long) arg2 > this.field764 && this.field767 + (long) arg2 <= this.field764 + (long) this.field763) {
                    var7 = this.field767 + (long) arg2;
                } else if (this.field764 + (long) this.field763 > this.field767 && this.field764 + (long) this.field763 <= this.field767 + (long) arg2) {
                    var7 = this.field764 + (long) this.field763;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field767), this.field761, (int) (var5 - this.field764), var9);
                }
                this.field767 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field765 == -1L) {
                    this.field765 = this.field767;
                }
                System.arraycopy(arg0, arg1, this.field766, (int) (this.field767 - this.field765), arg2);
                this.field767 += (long) arg2;
                if (this.field767 - this.field765 > (long) this.field760) {
                    this.field760 = (int) (this.field767 - this.field765);
                }
            }
        } catch (IOException var11) {
            this.field762 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("af.x(I)V")
    public void method605() throws IOException {
        if (this.field765 == -1L) {
            return;
        }
        if (this.field765 != this.field762) {
            this.field770.method587(this.field765);
            this.field762 = this.field765;
        }
        this.field770.method579(this.field766, 0, this.field760);
        this.field762 += (long) (this.field760 * 1901923003) * -1896043917L;
        if (this.field762 > this.field768) {
            this.field768 = this.field762;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field765 >= this.field764 && this.field765 < this.field764 + (long) this.field763) {
            var1 = this.field765;
        } else if (this.field764 >= this.field765 && this.field764 < this.field765 + (long) this.field760) {
            var1 = this.field764;
        }
        if (this.field765 + (long) this.field760 > this.field764 && this.field765 + (long) this.field760 <= this.field764 + (long) this.field763) {
            var3 = this.field765 + (long) this.field760;
        } else if (this.field764 + (long) this.field763 > this.field765 && this.field764 + (long) this.field763 <= this.field765 + (long) this.field760) {
            var3 = this.field764 + (long) this.field763;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field766, (int) (var1 - this.field765), this.field761, (int) (var1 - this.field764), var5);
        }
        this.field765 = -1L;
        this.field760 = 0;
    }
}
