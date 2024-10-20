package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("af")
public class class30 {

    @ObfuscatedName("af.q")
    public class29 field760;

    @ObfuscatedName("af.c")
    public byte[] field757;

    @ObfuscatedName("af.p")
    public long field756 = -1L;

    @ObfuscatedName("af.z")
    public int field759;

    @ObfuscatedName("af.m")
    public byte[] field769;

    @ObfuscatedName("af.k")
    public long field761 = -1L;

    @ObfuscatedName("af.v")
    public int field762 = 0;

    @ObfuscatedName("af.y")
    public long field763;

    @ObfuscatedName("af.d")
    public long field764;

    @ObfuscatedName("af.l")
    public long field765;

    @ObfuscatedName("af.h")
    public long field766;

    public class30(class29 arg0, int arg1, int arg2) throws IOException {
        this.field760 = arg0;
        this.field765 = this.field764 = arg0.method540();
        this.field757 = new byte[arg1];
        this.field769 = new byte[arg2];
        this.field763 = 0L;
    }

    @ObfuscatedName("af.q(B)V")
    public void method593() throws IOException {
        this.method573();
        this.field760.method539();
    }

    @ObfuscatedName("af.c(J)V")
    public void method600(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field763 = arg0;
    }

    @ObfuscatedName("af.p(B)J")
    public long method568() {
        return this.field765;
    }

    @ObfuscatedName("af.z([BB)V")
    public void method566(byte[] arg0) throws IOException {
        this.method570(arg0, 0, arg0.length);
    }

    @ObfuscatedName("af.m([BIII)V")
    public void method570(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field761 != -1L && this.field763 >= this.field761 && this.field763 + (long) arg2 <= this.field761 + (long) this.field762) {
                System.arraycopy(this.field769, (int) (this.field763 - this.field761), arg0, arg1, arg2);
                this.field763 += (long) arg2;
                return;
            }
            long var4 = this.field763;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field763 >= this.field756 && this.field763 < this.field756 + (long) this.field759) {
                int var8 = (int) ((long) this.field759 - (this.field763 - this.field756));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field757, (int) (this.field763 - this.field756), arg0, arg1, var8);
                this.field763 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field757.length) {
                this.field760.method559(this.field763);
                this.field766 = this.field763;
                while (arg2 > 0) {
                    int var9 = this.field760.method538(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field766 += (long) var9;
                    this.field763 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method574();
                int var10 = arg2;
                if (arg2 > this.field759) {
                    var10 = this.field759;
                }
                System.arraycopy(this.field757, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field763 += (long) var10;
            }
            if (this.field761 != -1L) {
                if (this.field761 > this.field763 && arg2 > 0) {
                    int var11 = (int) (this.field761 - this.field763) + arg1;
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
                if (this.field761 >= var4 && this.field761 < (long) var7 + var4) {
                    var12 = this.field761;
                } else if (var4 >= this.field761 && var4 < this.field761 + (long) this.field762) {
                    var12 = var4;
                }
                if (this.field761 + (long) this.field762 > var4 && this.field761 + (long) this.field762 <= (long) var7 + var4) {
                    var14 = this.field761 + (long) this.field762;
                } else if ((long) var7 + var4 > this.field761 && (long) var7 + var4 <= this.field761 + (long) this.field762) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field769, (int) (var12 - this.field761), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field763) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field763));
                        this.field763 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field766 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("af.k(B)V")
    public void method574() throws IOException {
        this.field759 = 0;
        if (this.field766 != this.field763) {
            this.field760.method559(this.field763);
            this.field766 = this.field763;
        }
        this.field756 = this.field763;
        while (this.field759 < this.field757.length) {
            int var1 = this.field760.method538(this.field757, this.field759, this.field757.length - this.field759);
            if (var1 == -1) {
                break;
            }
            this.field766 += (long) var1;
            this.field759 += var1;
        }
    }

    @ObfuscatedName("af.v([BIII)V")
    public void method588(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field763 + (long) arg2 > this.field765) {
                this.field765 = this.field763 + (long) arg2;
            }
            if (this.field761 != -1L && (this.field763 < this.field761 || this.field763 > this.field761 + (long) this.field762)) {
                this.method573();
            }
            if (this.field761 != -1L && this.field763 + (long) arg2 > this.field761 + (long) this.field769.length) {
                int var4 = (int) ((long) this.field769.length - (this.field763 - this.field761));
                System.arraycopy(arg0, arg1, this.field769, (int) (this.field763 - this.field761), var4);
                this.field763 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field762 = this.field769.length;
                this.method573();
            }
            if (arg2 > this.field769.length) {
                if (this.field766 != this.field763) {
                    this.field760.method559(this.field763);
                    this.field766 = this.field763;
                }
                this.field760.method550(arg0, arg1, arg2);
                this.field766 += (long) arg2;
                if (this.field766 > this.field764) {
                    this.field764 = this.field766;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field763 >= this.field756 && this.field763 < this.field756 + (long) this.field759) {
                    var5 = this.field763;
                } else if (this.field756 >= this.field763 && this.field756 < this.field763 + (long) arg2) {
                    var5 = this.field756;
                }
                if (this.field763 + (long) arg2 > this.field756 && this.field763 + (long) arg2 <= this.field756 + (long) this.field759) {
                    var7 = this.field763 + (long) arg2;
                } else if (this.field756 + (long) this.field759 > this.field763 && this.field756 + (long) this.field759 <= this.field763 + (long) arg2) {
                    var7 = this.field756 + (long) this.field759;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field763), this.field757, (int) (var5 - this.field756), var9);
                }
                this.field763 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field761 == -1L) {
                    this.field761 = this.field763;
                }
                System.arraycopy(arg0, arg1, this.field769, (int) (this.field763 - this.field761), arg2);
                this.field763 += (long) arg2;
                if (this.field763 - this.field761 > (long) this.field762) {
                    this.field762 = (int) (this.field763 - this.field761);
                }
            }
        } catch (IOException var11) {
            this.field766 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("af.y(B)V")
    public void method573() throws IOException {
        if (this.field761 == -1L) {
            return;
        }
        if (this.field766 != this.field761) {
            this.field760.method559(this.field761);
            this.field766 = this.field761;
        }
        this.field760.method550(this.field769, 0, this.field762);
        this.field766 += (long) (this.field762 * -1069382893) * 925613851L;
        if (this.field766 > this.field764) {
            this.field764 = this.field766;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field761 >= this.field756 && this.field761 < this.field756 + (long) this.field759) {
            var1 = this.field761;
        } else if (this.field756 >= this.field761 && this.field756 < this.field761 + (long) this.field762) {
            var1 = this.field756;
        }
        if (this.field761 + (long) this.field762 > this.field756 && this.field761 + (long) this.field762 <= this.field756 + (long) this.field759) {
            var3 = this.field761 + (long) this.field762;
        } else if (this.field756 + (long) this.field759 > this.field761 && this.field756 + (long) this.field759 <= this.field761 + (long) this.field762) {
            var3 = this.field756 + (long) this.field759;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field769, (int) (var1 - this.field761), this.field757, (int) (var1 - this.field756), var5);
        }
        this.field761 = -1L;
        this.field762 = 0;
    }
}
