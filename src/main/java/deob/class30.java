package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("as")
public class class30 {

    @ObfuscatedName("as.i")
    public class29 field766;

    @ObfuscatedName("as.v")
    public byte[] field767;

    @ObfuscatedName("as.m")
    public long field768 = -1L;

    @ObfuscatedName("as.j")
    public int field769;

    @ObfuscatedName("as.o")
    public byte[] field779;

    @ObfuscatedName("as.l")
    public long field771 = -1L;

    @ObfuscatedName("as.g")
    public int field772 = 0;

    @ObfuscatedName("as.w")
    public long field773;

    @ObfuscatedName("as.c")
    public long field774;

    @ObfuscatedName("as.z")
    public long field770;

    @ObfuscatedName("as.f")
    public long field776;

    public class30(class29 arg0, int arg1, int arg2) throws IOException {
        this.field766 = arg0;
        this.field770 = this.field774 = arg0.method573();
        this.field767 = new byte[arg1];
        this.field779 = new byte[arg2];
        this.field773 = 0L;
    }

    @ObfuscatedName("as.i(S)V")
    public void method592() throws IOException {
        this.method599();
        this.field766.method572();
    }

    @ObfuscatedName("as.v(J)V")
    public void method594(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field773 = arg0;
    }

    @ObfuscatedName("as.m(I)J")
    public long method601() {
        return this.field770;
    }

    @ObfuscatedName("as.j([BB)V")
    public void method595(byte[] arg0) throws IOException {
        this.method596(arg0, 0, arg0.length);
    }

    @ObfuscatedName("as.o([BIII)V")
    public void method596(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field771 != -1L && this.field773 >= this.field771 && this.field773 + (long) arg2 <= this.field771 + (long) this.field772) {
                System.arraycopy(this.field779, (int) (this.field773 - this.field771), arg0, arg1, arg2);
                this.field773 += (long) arg2;
                return;
            }
            long var4 = this.field773;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field773 >= this.field768 && this.field773 < this.field768 + (long) this.field769) {
                int var8 = (int) ((long) this.field769 - (this.field773 - this.field768));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field767, (int) (this.field773 - this.field768), arg0, arg1, var8);
                this.field773 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field767.length) {
                this.field766.method578(this.field773);
                this.field776 = this.field773;
                while (arg2 > 0) {
                    int var9 = this.field766.method571(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field776 += (long) var9;
                    this.field773 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method597();
                int var10 = arg2;
                if (arg2 > this.field769) {
                    var10 = this.field769;
                }
                System.arraycopy(this.field767, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field773 += (long) var10;
            }
            if (this.field771 != -1L) {
                if (this.field771 > this.field773 && arg2 > 0) {
                    int var11 = (int) (this.field771 - this.field773) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field773++;
                    }
                }
                long var12 = -1L;
                long var14 = -1L;
                if (this.field771 >= var4 && this.field771 < (long) var7 + var4) {
                    var12 = this.field771;
                } else if (var4 >= this.field771 && var4 < this.field771 + (long) this.field772) {
                    var12 = var4;
                }
                if (this.field771 + (long) this.field772 > var4 && this.field771 + (long) this.field772 <= (long) var7 + var4) {
                    var14 = this.field771 + (long) this.field772;
                } else if ((long) var7 + var4 > this.field771 && (long) var7 + var4 <= this.field771 + (long) this.field772) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field779, (int) (var12 - this.field771), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field773) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field773));
                        this.field773 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field776 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("as.l(B)V")
    public void method597() throws IOException {
        this.field769 = 0;
        if (this.field776 != this.field773) {
            this.field766.method578(this.field773);
            this.field776 = this.field773;
        }
        this.field768 = this.field773;
        while (this.field769 < this.field767.length) {
            int var1 = this.field766.method571(this.field767, this.field769, this.field767.length - this.field769);
            if (var1 == -1) {
                break;
            }
            this.field776 += (long) var1;
            this.field769 += var1;
        }
    }

    @ObfuscatedName("as.g([BIIB)V")
    public void method593(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field773 + (long) arg2 > this.field770) {
                this.field770 = this.field773 + (long) arg2;
            }
            if (this.field771 != -1L && (this.field773 < this.field771 || this.field773 > this.field771 + (long) this.field772)) {
                this.method599();
            }
            if (this.field771 != -1L && this.field773 + (long) arg2 > this.field771 + (long) this.field779.length) {
                int var4 = (int) ((long) this.field779.length - (this.field773 - this.field771));
                System.arraycopy(arg0, arg1, this.field779, (int) (this.field773 - this.field771), var4);
                this.field773 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field772 = this.field779.length;
                this.method599();
            }
            if (arg2 > this.field779.length) {
                if (this.field776 != this.field773) {
                    this.field766.method578(this.field773);
                    this.field776 = this.field773;
                }
                this.field766.method579(arg0, arg1, arg2);
                this.field776 += (long) arg2;
                if (this.field776 > this.field774) {
                    this.field774 = this.field776;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field773 >= this.field768 && this.field773 < this.field768 + (long) this.field769) {
                    var5 = this.field773;
                } else if (this.field768 >= this.field773 && this.field768 < this.field773 + (long) arg2) {
                    var5 = this.field768;
                }
                if (this.field773 + (long) arg2 > this.field768 && this.field773 + (long) arg2 <= this.field768 + (long) this.field769) {
                    var7 = this.field773 + (long) arg2;
                } else if (this.field768 + (long) this.field769 > this.field773 && this.field768 + (long) this.field769 <= this.field773 + (long) arg2) {
                    var7 = this.field768 + (long) this.field769;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field773), this.field767, (int) (var5 - this.field768), var9);
                }
                this.field773 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field771 == -1L) {
                    this.field771 = this.field773;
                }
                System.arraycopy(arg0, arg1, this.field779, (int) (this.field773 - this.field771), arg2);
                this.field773 += (long) arg2;
                if (this.field773 - this.field771 > (long) this.field772) {
                    this.field772 = (int) (this.field773 - this.field771);
                }
            }
        } catch (IOException var11) {
            this.field776 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("as.w(I)V")
    public void method599() throws IOException {
        if (this.field771 == -1L) {
            return;
        }
        if (this.field776 != this.field771) {
            this.field766.method578(this.field771);
            this.field776 = this.field771;
        }
        this.field766.method579(this.field779, 0, this.field772);
        this.field776 += (long) (this.field772 * 1227766979) * 1711887339L;
        if (this.field776 > this.field774) {
            this.field774 = this.field776;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field771 >= this.field768 && this.field771 < this.field768 + (long) this.field769) {
            var1 = this.field771;
        } else if (this.field768 >= this.field771 && this.field768 < this.field771 + (long) this.field772) {
            var1 = this.field768;
        }
        if (this.field771 + (long) this.field772 > this.field768 && this.field771 + (long) this.field772 <= this.field768 + (long) this.field769) {
            var3 = this.field771 + (long) this.field772;
        } else if (this.field768 + (long) this.field769 > this.field771 && this.field768 + (long) this.field769 <= this.field771 + (long) this.field772) {
            var3 = this.field768 + (long) this.field769;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field779, (int) (var1 - this.field771), this.field767, (int) (var1 - this.field768), var5);
        }
        this.field771 = -1L;
        this.field772 = 0;
    }
}
