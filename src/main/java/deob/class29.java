package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("aj")
public class class29 {

    @ObfuscatedName("aj.p")
    public class28 field773;

    @ObfuscatedName("aj.j")
    public byte[] field761;

    @ObfuscatedName("aj.w")
    public long field765 = -1L;

    @ObfuscatedName("aj.h")
    public int field763;

    @ObfuscatedName("aj.v")
    public byte[] field764;

    @ObfuscatedName("aj.k")
    public long field760 = -1L;

    @ObfuscatedName("aj.g")
    public int field762 = 0;

    @ObfuscatedName("aj.n")
    public long field766;

    @ObfuscatedName("aj.c")
    public long field768;

    @ObfuscatedName("aj.o")
    public long field769;

    @ObfuscatedName("aj.u")
    public long field770;

    public class29(class28 arg0, int arg1, int arg2) throws IOException {
        this.field773 = arg0;
        this.field769 = this.field768 = arg0.method521();
        this.field761 = new byte[arg1];
        this.field764 = new byte[arg2];
        this.field766 = 0L;
    }

    @ObfuscatedName("aj.p(B)V")
    public void method536() throws IOException {
        this.method527();
        this.field773.method509();
    }

    @ObfuscatedName("aj.j(J)V")
    public void method532(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field766 = arg0;
    }

    @ObfuscatedName("aj.w(B)J")
    public long method529() {
        return this.field769;
    }

    @ObfuscatedName("aj.h([BI)V")
    public void method530(byte[] arg0) throws IOException {
        this.method531(arg0, 0, arg0.length);
    }

    @ObfuscatedName("aj.v([BIII)V")
    public void method531(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field760 != -1L && this.field766 >= this.field760 && this.field766 + (long) arg2 <= this.field760 + (long) this.field762) {
                System.arraycopy(this.field764, (int) (this.field766 - this.field760), arg0, arg1, arg2);
                this.field766 += (long) arg2;
                return;
            }
            long var4 = this.field766;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field766 >= this.field765 && this.field766 < this.field765 + (long) this.field763) {
                int var8 = (int) ((long) this.field763 - (this.field766 - this.field765));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field761, (int) (this.field766 - this.field765), arg0, arg1, var8);
                this.field766 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field761.length) {
                this.field773.method526(this.field766);
                this.field770 = this.field766;
                while (arg2 > 0) {
                    int var9 = this.field773.method510(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field770 += (long) var9;
                    this.field766 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method541();
                int var10 = arg2;
                if (arg2 > this.field763) {
                    var10 = this.field763;
                }
                System.arraycopy(this.field761, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field766 += (long) var10;
            }
            if (this.field760 != -1L) {
                if (this.field760 > this.field766 && arg2 > 0) {
                    int var11 = (int) (this.field760 - this.field766) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field766++;
                    }
                }
                long var12 = -1L;
                long var14 = -1L;
                if (this.field760 >= var4 && this.field760 < (long) var7 + var4) {
                    var12 = this.field760;
                } else if (var4 >= this.field760 && var4 < this.field760 + (long) this.field762) {
                    var12 = var4;
                }
                if (this.field760 + (long) this.field762 > var4 && this.field760 + (long) this.field762 <= (long) var7 + var4) {
                    var14 = this.field760 + (long) this.field762;
                } else if ((long) var7 + var4 > this.field760 && (long) var7 + var4 <= this.field760 + (long) this.field762) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field764, (int) (var12 - this.field760), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field766) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field766));
                        this.field766 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field770 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("aj.k(B)V")
    public void method541() throws IOException {
        this.field763 = 0;
        if (this.field770 != this.field766) {
            this.field773.method526(this.field766);
            this.field770 = this.field766;
        }
        this.field765 = this.field766;
        while (this.field763 < this.field761.length) {
            int var1 = this.field773.method510(this.field761, this.field763, this.field761.length - this.field763);
            if (var1 == -1) {
                break;
            }
            this.field770 += (long) var1;
            this.field763 += var1;
        }
    }

    @ObfuscatedName("aj.g([BIIB)V")
    public void method533(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field766 + (long) arg2 > this.field769) {
                this.field769 = this.field766 + (long) arg2;
            }
            if (this.field760 != -1L && (this.field766 < this.field760 || this.field766 > this.field760 + (long) this.field762)) {
                this.method527();
            }
            if (this.field760 != -1L && this.field766 + (long) arg2 > this.field760 + (long) this.field764.length) {
                int var4 = (int) ((long) this.field764.length - (this.field766 - this.field760));
                System.arraycopy(arg0, arg1, this.field764, (int) (this.field766 - this.field760), var4);
                this.field766 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field762 = this.field764.length;
                this.method527();
            }
            if (arg2 > this.field764.length) {
                if (this.field770 != this.field766) {
                    this.field773.method526(this.field766);
                    this.field770 = this.field766;
                }
                this.field773.method508(arg0, arg1, arg2);
                this.field770 += (long) arg2;
                if (this.field770 > this.field768) {
                    this.field768 = this.field770;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field766 >= this.field765 && this.field766 < this.field765 + (long) this.field763) {
                    var5 = this.field766;
                } else if (this.field765 >= this.field766 && this.field765 < this.field766 + (long) arg2) {
                    var5 = this.field765;
                }
                if (this.field766 + (long) arg2 > this.field765 && this.field766 + (long) arg2 <= this.field765 + (long) this.field763) {
                    var7 = this.field766 + (long) arg2;
                } else if (this.field765 + (long) this.field763 > this.field766 && this.field765 + (long) this.field763 <= this.field766 + (long) arg2) {
                    var7 = this.field765 + (long) this.field763;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field766), this.field761, (int) (var5 - this.field765), var9);
                }
                this.field766 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field760 == -1L) {
                    this.field760 = this.field766;
                }
                System.arraycopy(arg0, arg1, this.field764, (int) (this.field766 - this.field760), arg2);
                this.field766 += (long) arg2;
                if (this.field766 - this.field760 > (long) this.field762) {
                    this.field762 = (int) (this.field766 - this.field760);
                }
            }
        } catch (IOException var11) {
            this.field770 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("aj.n(B)V")
    public void method527() throws IOException {
        if (this.field760 == -1L) {
            return;
        }
        if (this.field770 != this.field760) {
            this.field773.method526(this.field760);
            this.field770 = this.field760;
        }
        this.field773.method508(this.field764, 0, this.field762);
        this.field770 += (long) (this.field762 * -338273869) * 1487928699L;
        if (this.field770 > this.field768) {
            this.field768 = this.field770;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field760 >= this.field765 && this.field760 < this.field765 + (long) this.field763) {
            var1 = this.field760;
        } else if (this.field765 >= this.field760 && this.field765 < this.field760 + (long) this.field762) {
            var1 = this.field765;
        }
        if (this.field760 + (long) this.field762 > this.field765 && this.field760 + (long) this.field762 <= this.field765 + (long) this.field763) {
            var3 = this.field760 + (long) this.field762;
        } else if (this.field765 + (long) this.field763 > this.field760 && this.field765 + (long) this.field763 <= this.field760 + (long) this.field762) {
            var3 = this.field765 + (long) this.field763;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field764, (int) (var1 - this.field760), this.field761, (int) (var1 - this.field765), var5);
        }
        this.field760 = -1L;
        this.field762 = 0;
    }
}
