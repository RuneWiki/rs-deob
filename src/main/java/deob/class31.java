package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("ah")
public class class31 {

    @ObfuscatedName("ah.i")
    public class30 field769;

    @ObfuscatedName("ah.b")
    public byte[] field756;

    @ObfuscatedName("ah.r")
    public long field767 = -1L;

    @ObfuscatedName("ah.l")
    public int field758;

    @ObfuscatedName("ah.s")
    public byte[] field759;

    @ObfuscatedName("ah.d")
    public long field762 = -1L;

    @ObfuscatedName("ah.e")
    public int field761 = 0;

    @ObfuscatedName("ah.u")
    public long field763;

    @ObfuscatedName("ah.q")
    public long field760;

    @ObfuscatedName("ah.o")
    public long field764;

    @ObfuscatedName("ah.v")
    public long field765;

    public class31(class30 arg0, int arg1, int arg2) throws IOException {
        this.field769 = arg0;
        this.field764 = this.field760 = arg0.method573();
        this.field756 = new byte[arg1];
        this.field759 = new byte[arg2];
        this.field763 = 0L;
    }

    @ObfuscatedName("ah.i(I)V")
    public void method597() throws IOException {
        this.method604();
        this.field769.method572();
    }

    @ObfuscatedName("ah.b(J)V")
    public void method621(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field763 = arg0;
    }

    @ObfuscatedName("ah.r(I)J")
    public long method599() {
        return this.field764;
    }

    @ObfuscatedName("ah.l([BI)V")
    public void method608(byte[] arg0) throws IOException {
        this.method601(arg0, 0, arg0.length);
    }

    @ObfuscatedName("ah.s([BIII)V")
    public void method601(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field762 != -1L && this.field763 >= this.field762 && this.field763 + (long) arg2 <= this.field762 + (long) this.field761) {
                System.arraycopy(this.field759, (int) (this.field763 - this.field762), arg0, arg1, arg2);
                this.field763 += (long) arg2;
                return;
            }
            long var4 = this.field763;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field763 >= this.field767 && this.field763 < this.field767 + (long) this.field758) {
                int var8 = (int) ((long) this.field758 - (this.field763 - this.field767));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field756, (int) (this.field763 - this.field767), arg0, arg1, var8);
                this.field763 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field756.length) {
                this.field769.method570(this.field763);
                this.field765 = this.field763;
                while (arg2 > 0) {
                    int var9 = this.field769.method574(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field765 += (long) var9;
                    this.field763 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method602();
                int var10 = arg2;
                if (arg2 > this.field758) {
                    var10 = this.field758;
                }
                System.arraycopy(this.field756, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field763 += (long) var10;
            }
            if (this.field762 != -1L) {
                if (this.field762 > this.field763 && arg2 > 0) {
                    int var11 = (int) (this.field762 - this.field763) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field763++;
                    }
                }
                long var12 = -1L;
                long var14 = -1L;
                if (this.field762 >= var4 && this.field762 < (long) var7 + var4) {
                    var12 = this.field762;
                } else if (var4 >= this.field762 && var4 < this.field762 + (long) this.field761) {
                    var12 = var4;
                }
                if (this.field762 + (long) this.field761 > var4 && this.field762 + (long) this.field761 <= (long) var7 + var4) {
                    var14 = this.field762 + (long) this.field761;
                } else if ((long) var7 + var4 > this.field762 && (long) var7 + var4 <= this.field762 + (long) this.field761) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field759, (int) (var12 - this.field762), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field763) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field763));
                        this.field763 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field765 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("ah.d(I)V")
    public void method602() throws IOException {
        this.field758 = 0;
        if (this.field765 != this.field763) {
            this.field769.method570(this.field763);
            this.field765 = this.field763;
        }
        this.field767 = this.field763;
        while (this.field758 < this.field756.length) {
            int var1 = this.field769.method574(this.field756, this.field758, this.field756.length - this.field758);
            if (var1 == -1) {
                break;
            }
            this.field765 += (long) var1;
            this.field758 += var1;
        }
    }

    @ObfuscatedName("ah.e([BIII)V")
    public void method603(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field763 + (long) arg2 > this.field764) {
                this.field764 = this.field763 + (long) arg2;
            }
            if (this.field762 != -1L && (this.field763 < this.field762 || this.field763 > this.field762 + (long) this.field761)) {
                this.method604();
            }
            if (this.field762 != -1L && this.field763 + (long) arg2 > this.field762 + (long) this.field759.length) {
                int var4 = (int) ((long) this.field759.length - (this.field763 - this.field762));
                System.arraycopy(arg0, arg1, this.field759, (int) (this.field763 - this.field762), var4);
                this.field763 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field761 = this.field759.length;
                this.method604();
            }
            if (arg2 > this.field759.length) {
                if (this.field765 != this.field763) {
                    this.field769.method570(this.field763);
                    this.field765 = this.field763;
                }
                this.field769.method571(arg0, arg1, arg2);
                this.field765 += (long) arg2;
                if (this.field765 > this.field760) {
                    this.field760 = this.field765;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field763 >= this.field767 && this.field763 < this.field767 + (long) this.field758) {
                    var5 = this.field763;
                } else if (this.field767 >= this.field763 && this.field767 < this.field763 + (long) arg2) {
                    var5 = this.field767;
                }
                if (this.field763 + (long) arg2 > this.field767 && this.field763 + (long) arg2 <= this.field767 + (long) this.field758) {
                    var7 = this.field763 + (long) arg2;
                } else if (this.field767 + (long) this.field758 > this.field763 && this.field767 + (long) this.field758 <= this.field763 + (long) arg2) {
                    var7 = this.field767 + (long) this.field758;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field763), this.field756, (int) (var5 - this.field767), var9);
                }
                this.field763 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field762 == -1L) {
                    this.field762 = this.field763;
                }
                System.arraycopy(arg0, arg1, this.field759, (int) (this.field763 - this.field762), arg2);
                this.field763 += (long) arg2;
                if (this.field763 - this.field762 > (long) this.field761) {
                    this.field761 = (int) (this.field763 - this.field762);
                }
            }
        } catch (IOException var11) {
            this.field765 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("ah.u(I)V")
    public void method604() throws IOException {
        if (this.field762 == -1L) {
            return;
        }
        if (this.field765 != this.field762) {
            this.field769.method570(this.field762);
            this.field765 = this.field762;
        }
        this.field769.method571(this.field759, 0, this.field761);
        this.field765 += (long) (this.field761 * 1875472369) * 13213969L;
        if (this.field765 > this.field760) {
            this.field760 = this.field765;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field762 >= this.field767 && this.field762 < this.field767 + (long) this.field758) {
            var1 = this.field762;
        } else if (this.field767 >= this.field762 && this.field767 < this.field762 + (long) this.field761) {
            var1 = this.field767;
        }
        if (this.field762 + (long) this.field761 > this.field767 && this.field762 + (long) this.field761 <= this.field767 + (long) this.field758) {
            var3 = this.field762 + (long) this.field761;
        } else if (this.field767 + (long) this.field758 > this.field762 && this.field767 + (long) this.field758 <= this.field762 + (long) this.field761) {
            var3 = this.field767 + (long) this.field758;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field759, (int) (var1 - this.field762), this.field756, (int) (var1 - this.field767), var5);
        }
        this.field762 = -1L;
        this.field761 = 0;
    }
}
