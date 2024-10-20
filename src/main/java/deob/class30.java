package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("ah")
public class class30 {

    @ObfuscatedName("ah.i")
    public class29 field770;

    @ObfuscatedName("ah.w")
    public byte[] field769;

    @ObfuscatedName("ah.f")
    public long field773 = -1L;

    @ObfuscatedName("ah.e")
    public int field771;

    @ObfuscatedName("ah.t")
    public byte[] field772;

    @ObfuscatedName("ah.d")
    public long field777 = -1L;

    @ObfuscatedName("ah.p")
    public int field774 = 0;

    @ObfuscatedName("ah.k")
    public long field775;

    @ObfuscatedName("ah.r")
    public long field776;

    @ObfuscatedName("ah.l")
    public long field768;

    @ObfuscatedName("ah.a")
    public long field778;

    public class30(class29 arg0, int arg1, int arg2) throws IOException {
        this.field770 = arg0;
        this.field768 = this.field776 = arg0.method555();
        this.field769 = new byte[arg1];
        this.field772 = new byte[arg2];
        this.field775 = 0L;
    }

    @ObfuscatedName("ah.i(B)V")
    public void method577() throws IOException {
        this.method591();
        this.field770.method563();
    }

    @ObfuscatedName("ah.w(J)V")
    public void method578(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field775 = arg0;
    }

    @ObfuscatedName("ah.f(I)J")
    public long method579() {
        return this.field768;
    }

    @ObfuscatedName("ah.e([BB)V")
    public void method584(byte[] arg0) throws IOException {
        this.method581(arg0, 0, arg0.length);
    }

    @ObfuscatedName("ah.t([BIII)V")
    public void method581(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field777 != -1L && this.field775 >= this.field777 && this.field775 + (long) arg2 <= this.field777 + (long) this.field774) {
                System.arraycopy(this.field772, (int) (this.field775 - this.field777), arg0, arg1, arg2);
                this.field775 += (long) arg2;
                return;
            }
            long var4 = this.field775;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field775 >= this.field773 && this.field775 < this.field773 + (long) this.field771) {
                int var8 = (int) ((long) this.field771 - (this.field775 - this.field773));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field769, (int) (this.field775 - this.field773), arg0, arg1, var8);
                this.field775 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field769.length) {
                this.field770.method552(this.field775);
                this.field778 = this.field775;
                while (arg2 > 0) {
                    int var9 = this.field770.method561(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field778 += (long) var9;
                    this.field775 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method582();
                int var10 = arg2;
                if (arg2 > this.field771) {
                    var10 = this.field771;
                }
                System.arraycopy(this.field769, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field775 += (long) var10;
            }
            if (this.field777 != -1L) {
                if (this.field777 > this.field775 && arg2 > 0) {
                    int var11 = (int) (this.field777 - this.field775) + arg1;
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
                if (this.field777 >= var4 && this.field777 < (long) var7 + var4) {
                    var12 = this.field777;
                } else if (var4 >= this.field777 && var4 < this.field777 + (long) this.field774) {
                    var12 = var4;
                }
                if (this.field777 + (long) this.field774 > var4 && this.field777 + (long) this.field774 <= (long) var7 + var4) {
                    var14 = this.field777 + (long) this.field774;
                } else if ((long) var7 + var4 > this.field777 && (long) var7 + var4 <= this.field777 + (long) this.field774) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field772, (int) (var12 - this.field777), arg0, (int) (var12 - var4) + var6, var16);
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

    @ObfuscatedName("ah.d(I)V")
    public void method582() throws IOException {
        this.field771 = 0;
        if (this.field778 != this.field775) {
            this.field770.method552(this.field775);
            this.field778 = this.field775;
        }
        this.field773 = this.field775;
        while (this.field771 < this.field769.length) {
            int var1 = this.field770.method561(this.field769, this.field771, this.field769.length - this.field771);
            if (var1 == -1) {
                break;
            }
            this.field778 += (long) var1;
            this.field771 += var1;
        }
    }

    @ObfuscatedName("ah.p([BIII)V")
    public void method583(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field775 + (long) arg2 > this.field768) {
                this.field768 = this.field775 + (long) arg2;
            }
            if (this.field777 != -1L && (this.field775 < this.field777 || this.field775 > this.field777 + (long) this.field774)) {
                this.method591();
            }
            if (this.field777 != -1L && this.field775 + (long) arg2 > this.field777 + (long) this.field772.length) {
                int var4 = (int) ((long) this.field772.length - (this.field775 - this.field777));
                System.arraycopy(arg0, arg1, this.field772, (int) (this.field775 - this.field777), var4);
                this.field775 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field774 = this.field772.length;
                this.method591();
            }
            if (arg2 > this.field772.length) {
                if (this.field778 != this.field775) {
                    this.field770.method552(this.field775);
                    this.field778 = this.field775;
                }
                this.field770.method551(arg0, arg1, arg2);
                this.field778 += (long) arg2;
                if (this.field778 > this.field776) {
                    this.field776 = this.field778;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field775 >= this.field773 && this.field775 < this.field773 + (long) this.field771) {
                    var5 = this.field775;
                } else if (this.field773 >= this.field775 && this.field773 < this.field775 + (long) arg2) {
                    var5 = this.field773;
                }
                if (this.field775 + (long) arg2 > this.field773 && this.field775 + (long) arg2 <= this.field773 + (long) this.field771) {
                    var7 = this.field775 + (long) arg2;
                } else if (this.field773 + (long) this.field771 > this.field775 && this.field773 + (long) this.field771 <= this.field775 + (long) arg2) {
                    var7 = this.field773 + (long) this.field771;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field775), this.field769, (int) (var5 - this.field773), var9);
                }
                this.field775 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field777 == -1L) {
                    this.field777 = this.field775;
                }
                System.arraycopy(arg0, arg1, this.field772, (int) (this.field775 - this.field777), arg2);
                this.field775 += (long) arg2;
                if (this.field775 - this.field777 > (long) this.field774) {
                    this.field774 = (int) (this.field775 - this.field777);
                }
            }
        } catch (IOException var11) {
            this.field778 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("ah.k(I)V")
    public void method591() throws IOException {
        if (this.field777 == -1L) {
            return;
        }
        if (this.field778 != this.field777) {
            this.field770.method552(this.field777);
            this.field778 = this.field777;
        }
        this.field770.method551(this.field772, 0, this.field774);
        this.field778 += (long) (this.field774 * -1037486587) * -1191237939L;
        if (this.field778 > this.field776) {
            this.field776 = this.field778;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field777 >= this.field773 && this.field777 < this.field773 + (long) this.field771) {
            var1 = this.field777;
        } else if (this.field773 >= this.field777 && this.field773 < this.field777 + (long) this.field774) {
            var1 = this.field773;
        }
        if (this.field777 + (long) this.field774 > this.field773 && this.field777 + (long) this.field774 <= this.field773 + (long) this.field771) {
            var3 = this.field777 + (long) this.field774;
        } else if (this.field773 + (long) this.field771 > this.field777 && this.field773 + (long) this.field771 <= this.field777 + (long) this.field774) {
            var3 = this.field773 + (long) this.field771;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field772, (int) (var1 - this.field777), this.field769, (int) (var1 - this.field773), var5);
        }
        this.field777 = -1L;
        this.field774 = 0;
    }
}
