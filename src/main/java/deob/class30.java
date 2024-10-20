package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("as")
public class class30 {

    @ObfuscatedName("as.a")
    public class29 field774;

    @ObfuscatedName("as.x")
    public byte[] field769;

    @ObfuscatedName("as.e")
    public long field770 = -1L;

    @ObfuscatedName("as.r")
    public int field771;

    @ObfuscatedName("as.p")
    public byte[] field777;

    @ObfuscatedName("as.n")
    public long field773 = -1L;

    @ObfuscatedName("as.o")
    public int field768 = 0;

    @ObfuscatedName("as.l")
    public long field775;

    @ObfuscatedName("as.t")
    public long field772;

    @ObfuscatedName("as.q")
    public long field776;

    @ObfuscatedName("as.c")
    public long field778;

    public class30(class29 arg0, int arg1, int arg2) throws IOException {
        this.field774 = arg0;
        this.field776 = this.field772 = arg0.method553();
        this.field769 = new byte[arg1];
        this.field777 = new byte[arg2];
        this.field775 = 0L;
    }

    @ObfuscatedName("as.a(B)V")
    public void method586() throws IOException {
        this.method583();
        this.field774.method552();
    }

    @ObfuscatedName("as.x(J)V")
    public void method588(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field775 = arg0;
    }

    @ObfuscatedName("as.e(I)J")
    public long method578() {
        return this.field776;
    }

    @ObfuscatedName("as.r([BI)V")
    public void method579(byte[] arg0) throws IOException {
        this.method596(arg0, 0, arg0.length);
    }

    @ObfuscatedName("as.p([BIII)V")
    public void method596(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field773 != -1L && this.field775 >= this.field773 && this.field775 + (long) arg2 <= this.field773 + (long) this.field768) {
                System.arraycopy(this.field777, (int) (this.field775 - this.field773), arg0, arg1, arg2);
                this.field775 += (long) arg2;
                return;
            }
            long var4 = this.field775;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field775 >= this.field770 && this.field775 < this.field770 + (long) this.field771) {
                int var8 = (int) ((long) this.field771 - (this.field775 - this.field770));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field769, (int) (this.field775 - this.field770), arg0, arg1, var8);
                this.field775 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field769.length) {
                this.field774.method558(this.field775);
                this.field778 = this.field775;
                while (arg2 > 0) {
                    int var9 = this.field774.method549(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field778 += (long) var9;
                    this.field775 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method580();
                int var10 = arg2;
                if (arg2 > this.field771) {
                    var10 = this.field771;
                }
                System.arraycopy(this.field769, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field775 += (long) var10;
            }
            if (this.field773 != -1L) {
                if (this.field773 > this.field775 && arg2 > 0) {
                    int var11 = (int) (this.field773 - this.field775) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field775++;
                    }
                }
                long var12 = -1L;
                long var14 = -1L;
                if (this.field773 >= var4 && this.field773 < (long) var7 + var4) {
                    var12 = this.field773;
                } else if (var4 >= this.field773 && var4 < this.field773 + (long) this.field768) {
                    var12 = var4;
                }
                if (this.field773 + (long) this.field768 > var4 && this.field773 + (long) this.field768 <= (long) var7 + var4) {
                    var14 = this.field773 + (long) this.field768;
                } else if ((long) var7 + var4 > this.field773 && (long) var7 + var4 <= this.field773 + (long) this.field768) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field777, (int) (var12 - this.field773), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field775) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field775));
                        this.field775 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field778 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("as.n(I)V")
    public void method580() throws IOException {
        this.field771 = 0;
        if (this.field778 != this.field775) {
            this.field774.method558(this.field775);
            this.field778 = this.field775;
        }
        this.field770 = this.field775;
        while (this.field771 < this.field769.length) {
            int var1 = this.field774.method549(this.field769, this.field771, this.field769.length - this.field771);
            if (var1 == -1) {
                break;
            }
            this.field778 += (long) var1;
            this.field771 += var1;
        }
    }

    @ObfuscatedName("as.o([BIII)V")
    public void method582(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field775 + (long) arg2 > this.field776) {
                this.field776 = this.field775 + (long) arg2;
            }
            if (this.field773 != -1L && (this.field775 < this.field773 || this.field775 > this.field773 + (long) this.field768)) {
                this.method583();
            }
            if (this.field773 != -1L && this.field775 + (long) arg2 > this.field773 + (long) this.field777.length) {
                int var4 = (int) ((long) this.field777.length - (this.field775 - this.field773));
                System.arraycopy(arg0, arg1, this.field777, (int) (this.field775 - this.field773), var4);
                this.field775 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field768 = this.field777.length;
                this.method583();
            }
            if (arg2 > this.field777.length) {
                if (this.field778 != this.field775) {
                    this.field774.method558(this.field775);
                    this.field778 = this.field775;
                }
                this.field774.method550(arg0, arg1, arg2);
                this.field778 += (long) arg2;
                if (this.field778 > this.field772) {
                    this.field772 = this.field778;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field775 >= this.field770 && this.field775 < this.field770 + (long) this.field771) {
                    var5 = this.field775;
                } else if (this.field770 >= this.field775 && this.field770 < this.field775 + (long) arg2) {
                    var5 = this.field770;
                }
                if (this.field775 + (long) arg2 > this.field770 && this.field775 + (long) arg2 <= this.field770 + (long) this.field771) {
                    var7 = this.field775 + (long) arg2;
                } else if (this.field770 + (long) this.field771 > this.field775 && this.field770 + (long) this.field771 <= this.field775 + (long) arg2) {
                    var7 = this.field770 + (long) this.field771;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field775), this.field769, (int) (var5 - this.field770), var9);
                }
                this.field775 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field773 == -1L) {
                    this.field773 = this.field775;
                }
                System.arraycopy(arg0, arg1, this.field777, (int) (this.field775 - this.field773), arg2);
                this.field775 += (long) arg2;
                if (this.field775 - this.field773 > (long) this.field768) {
                    this.field768 = (int) (this.field775 - this.field773);
                }
            }
        } catch (IOException var11) {
            this.field778 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("as.l(B)V")
    public void method583() throws IOException {
        if (this.field773 == -1L) {
            return;
        }
        if (this.field778 != this.field773) {
            this.field774.method558(this.field773);
            this.field778 = this.field773;
        }
        this.field774.method550(this.field777, 0, this.field768);
        this.field778 += (long) (this.field768 * 885700593) * -855156463L;
        if (this.field778 > this.field772) {
            this.field772 = this.field778;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field773 >= this.field770 && this.field773 < this.field770 + (long) this.field771) {
            var1 = this.field773;
        } else if (this.field770 >= this.field773 && this.field770 < this.field773 + (long) this.field768) {
            var1 = this.field770;
        }
        if (this.field773 + (long) this.field768 > this.field770 && this.field773 + (long) this.field768 <= this.field770 + (long) this.field771) {
            var3 = this.field773 + (long) this.field768;
        } else if (this.field770 + (long) this.field771 > this.field773 && this.field770 + (long) this.field771 <= this.field773 + (long) this.field768) {
            var3 = this.field770 + (long) this.field771;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field777, (int) (var1 - this.field773), this.field769, (int) (var1 - this.field770), var5);
        }
        this.field773 = -1L;
        this.field768 = 0;
    }
}
