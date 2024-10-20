package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("af")
public class class30 {

    @ObfuscatedName("af.c")
    public class29 field780;

    @ObfuscatedName("af.q")
    public byte[] field778;

    @ObfuscatedName("af.y")
    public long field772 = -1L;

    @ObfuscatedName("af.v")
    public int field773;

    @ObfuscatedName("af.g")
    public byte[] field774;

    @ObfuscatedName("af.x")
    public long field775 = -1L;

    @ObfuscatedName("af.u")
    public int field776 = 0;

    @ObfuscatedName("af.l")
    public long field785;

    @ObfuscatedName("af.a")
    public long field777;

    @ObfuscatedName("af.h")
    public long field771;

    @ObfuscatedName("af.t")
    public long field784;

    public class30(class29 arg0, int arg1, int arg2) throws IOException {
        this.field780 = arg0;
        this.field771 = this.field777 = arg0.method529();
        this.field778 = new byte[arg1];
        this.field774 = new byte[arg2];
        this.field785 = 0L;
    }

    @ObfuscatedName("af.c(I)V")
    public void method572() throws IOException {
        this.method560();
        this.field780.method528();
    }

    @ObfuscatedName("af.q(J)V")
    public void method554(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field785 = arg0;
    }

    @ObfuscatedName("af.y(I)J")
    public long method571() {
        return this.field771;
    }

    @ObfuscatedName("af.v([BI)V")
    public void method556(byte[] arg0) throws IOException {
        this.method568(arg0, 0, arg0.length);
    }

    @ObfuscatedName("af.g([BIII)V")
    public void method568(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field775 != -1L && this.field785 >= this.field775 && this.field785 + (long) arg2 <= this.field775 + (long) this.field776) {
                System.arraycopy(this.field774, (int) (this.field785 - this.field775), arg0, arg1, arg2);
                this.field785 += (long) arg2;
                return;
            }
            long var4 = this.field785;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field785 >= this.field772 && this.field785 < this.field772 + (long) this.field773) {
                int var8 = (int) ((long) this.field773 - (this.field785 - this.field772));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field778, (int) (this.field785 - this.field772), arg0, arg1, var8);
                this.field785 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field778.length) {
                this.field780.method526(this.field785);
                this.field784 = this.field785;
                while (arg2 > 0) {
                    int var9 = this.field780.method551(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field784 += (long) var9;
                    this.field785 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method558();
                int var10 = arg2;
                if (arg2 > this.field773) {
                    var10 = this.field773;
                }
                System.arraycopy(this.field778, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field785 += (long) var10;
            }
            if (this.field775 != -1L) {
                if (this.field775 > this.field785 && arg2 > 0) {
                    int var11 = (int) (this.field775 - this.field785) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field785++;
                    }
                }
                long var12 = -1L;
                long var14 = -1L;
                if (this.field775 >= var4 && this.field775 < (long) var7 + var4) {
                    var12 = this.field775;
                } else if (var4 >= this.field775 && var4 < this.field775 + (long) this.field776) {
                    var12 = var4;
                }
                if (this.field775 + (long) this.field776 > var4 && this.field775 + (long) this.field776 <= (long) var7 + var4) {
                    var14 = this.field775 + (long) this.field776;
                } else if ((long) var7 + var4 > this.field775 && (long) var7 + var4 <= this.field775 + (long) this.field776) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field774, (int) (var12 - this.field775), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field785) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field785));
                        this.field785 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field784 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("af.x(I)V")
    public void method558() throws IOException {
        this.field773 = 0;
        if (this.field785 != this.field784) {
            this.field780.method526(this.field785);
            this.field784 = this.field785;
        }
        this.field772 = this.field785;
        while (this.field773 < this.field778.length) {
            int var1 = this.field780.method551(this.field778, this.field773, this.field778.length - this.field773);
            if (var1 == -1) {
                break;
            }
            this.field784 += (long) var1;
            this.field773 += var1;
        }
    }

    @ObfuscatedName("af.u([BIIB)V")
    public void method559(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field785 + (long) arg2 > this.field771) {
                this.field771 = this.field785 + (long) arg2;
            }
            if (this.field775 != -1L && (this.field785 < this.field775 || this.field785 > this.field775 + (long) this.field776)) {
                this.method560();
            }
            if (this.field775 != -1L && this.field785 + (long) arg2 > this.field775 + (long) this.field774.length) {
                int var4 = (int) ((long) this.field774.length - (this.field785 - this.field775));
                System.arraycopy(arg0, arg1, this.field774, (int) (this.field785 - this.field775), var4);
                this.field785 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field776 = this.field774.length;
                this.method560();
            }
            if (arg2 > this.field774.length) {
                if (this.field785 != this.field784) {
                    this.field780.method526(this.field785);
                    this.field784 = this.field785;
                }
                this.field780.method527(arg0, arg1, arg2);
                this.field784 += (long) arg2;
                if (this.field784 > this.field777) {
                    this.field777 = this.field784;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field785 >= this.field772 && this.field785 < this.field772 + (long) this.field773) {
                    var5 = this.field785;
                } else if (this.field772 >= this.field785 && this.field772 < this.field785 + (long) arg2) {
                    var5 = this.field772;
                }
                if (this.field785 + (long) arg2 > this.field772 && this.field785 + (long) arg2 <= this.field772 + (long) this.field773) {
                    var7 = this.field785 + (long) arg2;
                } else if (this.field772 + (long) this.field773 > this.field785 && this.field772 + (long) this.field773 <= this.field785 + (long) arg2) {
                    var7 = this.field772 + (long) this.field773;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field785), this.field778, (int) (var5 - this.field772), var9);
                }
                this.field785 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field775 == -1L) {
                    this.field775 = this.field785;
                }
                System.arraycopy(arg0, arg1, this.field774, (int) (this.field785 - this.field775), arg2);
                this.field785 += (long) arg2;
                if (this.field785 - this.field775 > (long) this.field776) {
                    this.field776 = (int) (this.field785 - this.field775);
                }
            }
        } catch (IOException var11) {
            this.field784 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("af.l(I)V")
    public void method560() throws IOException {
        if (this.field775 == -1L) {
            return;
        }
        if (this.field784 != this.field775) {
            this.field780.method526(this.field775);
            this.field784 = this.field775;
        }
        this.field780.method527(this.field774, 0, this.field776);
        this.field784 += (long) (this.field776 * 653729475) * 2069365227L;
        if (this.field784 > this.field777) {
            this.field777 = this.field784;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field775 >= this.field772 && this.field775 < this.field772 + (long) this.field773) {
            var1 = this.field775;
        } else if (this.field772 >= this.field775 && this.field772 < this.field775 + (long) this.field776) {
            var1 = this.field772;
        }
        if (this.field775 + (long) this.field776 > this.field772 && this.field775 + (long) this.field776 <= this.field772 + (long) this.field773) {
            var3 = this.field775 + (long) this.field776;
        } else if (this.field772 + (long) this.field773 > this.field775 && this.field772 + (long) this.field773 <= this.field775 + (long) this.field776) {
            var3 = this.field772 + (long) this.field773;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field774, (int) (var1 - this.field775), this.field778, (int) (var1 - this.field772), var5);
        }
        this.field775 = -1L;
        this.field776 = 0;
    }
}
