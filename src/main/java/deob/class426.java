package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("pa")
public class class426 {

    @ObfuscatedName("pa.v")
    public class425 field4633;

    @ObfuscatedName("pa.q")
    public byte[] field4634;

    @ObfuscatedName("pa.f")
    public long field4635 = -1L;

    @ObfuscatedName("pa.j")
    public int field4636;

    @ObfuscatedName("pa.e")
    public byte[] field4637;

    @ObfuscatedName("pa.g")
    public long field4638 = -1L;

    @ObfuscatedName("pa.w")
    public int field4639 = 0;

    @ObfuscatedName("pa.y")
    public long field4641;

    @ObfuscatedName("pa.i")
    public long field4632;

    @ObfuscatedName("pa.s")
    public long field4642;

    @ObfuscatedName("pa.t")
    public long field4643;

    public class426(class425 arg0, int arg1, int arg2) throws IOException {
        this.field4633 = arg0;
        this.field4642 = this.field4632 = arg0.method6808();
        this.field4634 = new byte[arg1];
        this.field4637 = new byte[arg2];
        this.field4641 = 0L;
    }

    @ObfuscatedName("pa.c(I)V")
    public void method6824() throws IOException {
        this.method6832();
        this.field4633.method6806();
    }

    @ObfuscatedName("pa.v(J)V")
    public void method6825(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field4641 = arg0;
    }

    @ObfuscatedName("pa.q(I)J")
    public long method6831() {
        return this.field4642;
    }

    @ObfuscatedName("pa.f([BI)V")
    public void method6827(byte[] arg0) throws IOException {
        this.method6826(arg0, 0, arg0.length);
    }

    @ObfuscatedName("pa.j([BIII)V")
    public void method6826(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field4638 != -1L && this.field4641 >= this.field4638 && this.field4641 + (long) arg2 <= this.field4638 + (long) this.field4639) {
                System.arraycopy(this.field4637, (int) (this.field4641 - this.field4638), arg0, arg1, arg2);
                this.field4641 += (long) arg2;
                return;
            }
            long var4 = this.field4641;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field4641 >= this.field4635 && this.field4641 < this.field4635 + (long) this.field4636) {
                int var8 = (int) ((long) this.field4636 - (this.field4641 - this.field4635));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field4634, (int) (this.field4641 - this.field4635), arg0, arg1, var8);
                this.field4641 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field4634.length) {
                this.field4633.method6822(this.field4641);
                this.field4643 = this.field4641;
                while (arg2 > 0) {
                    int var9 = this.field4633.method6809(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field4643 += (long) var9;
                    this.field4641 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method6829();
                int var10 = arg2;
                if (arg2 > this.field4636) {
                    var10 = this.field4636;
                }
                System.arraycopy(this.field4634, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field4641 += (long) var10;
            }
            if (this.field4638 != -1L) {
                if (this.field4638 > this.field4641 && arg2 > 0) {
                    int var11 = (int) (this.field4638 - this.field4641) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field4641++;
                    }
                }
                long var12 = -1L;
                long var14 = -1L;
                if (this.field4638 >= var4 && this.field4638 < (long) var7 + var4) {
                    var12 = this.field4638;
                } else if (var4 >= this.field4638 && var4 < this.field4638 + (long) this.field4639) {
                    var12 = var4;
                }
                if (this.field4638 + (long) this.field4639 > var4 && this.field4638 + (long) this.field4639 <= (long) var7 + var4) {
                    var14 = this.field4638 + (long) this.field4639;
                } else if ((long) var7 + var4 > this.field4638 && (long) var7 + var4 <= this.field4638 + (long) this.field4639) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field4637, (int) (var12 - this.field4638), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field4641) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field4641));
                        this.field4641 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field4643 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("pa.e(B)V")
    public void method6829() throws IOException {
        this.field4636 = 0;
        if (this.field4643 != this.field4641) {
            this.field4633.method6822(this.field4641);
            this.field4643 = this.field4641;
        }
        this.field4635 = this.field4641;
        while (this.field4636 < this.field4634.length) {
            int var1 = this.field4634.length - this.field4636;
            if (var1 > 200000000) {
                var1 = 200000000;
            }
            int var2 = this.field4633.method6809(this.field4634, this.field4636, var1);
            if (var2 == -1) {
                break;
            }
            this.field4643 += (long) var2;
            this.field4636 += var2;
        }
    }

    @ObfuscatedName("pa.g([BIIB)V")
    public void method6830(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field4641 + (long) arg2 > this.field4642) {
                this.field4642 = this.field4641 + (long) arg2;
            }
            if (this.field4638 != -1L && (this.field4641 < this.field4638 || this.field4641 > this.field4638 + (long) this.field4639)) {
                this.method6832();
            }
            if (this.field4638 != -1L && this.field4641 + (long) arg2 > this.field4638 + (long) this.field4637.length) {
                int var4 = (int) ((long) this.field4637.length - (this.field4641 - this.field4638));
                System.arraycopy(arg0, arg1, this.field4637, (int) (this.field4641 - this.field4638), var4);
                this.field4641 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field4639 = this.field4637.length;
                this.method6832();
            }
            if (arg2 > this.field4637.length) {
                if (this.field4643 != this.field4641) {
                    this.field4633.method6822(this.field4641);
                    this.field4643 = this.field4641;
                }
                this.field4633.method6812(arg0, arg1, arg2);
                this.field4643 += (long) arg2;
                if (this.field4643 > this.field4632) {
                    this.field4632 = this.field4643;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field4641 >= this.field4635 && this.field4641 < this.field4635 + (long) this.field4636) {
                    var5 = this.field4641;
                } else if (this.field4635 >= this.field4641 && this.field4635 < this.field4641 + (long) arg2) {
                    var5 = this.field4635;
                }
                if (this.field4641 + (long) arg2 > this.field4635 && this.field4641 + (long) arg2 <= this.field4635 + (long) this.field4636) {
                    var7 = this.field4641 + (long) arg2;
                } else if (this.field4635 + (long) this.field4636 > this.field4641 && this.field4635 + (long) this.field4636 <= this.field4641 + (long) arg2) {
                    var7 = this.field4635 + (long) this.field4636;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field4641), this.field4634, (int) (var5 - this.field4635), var9);
                }
                this.field4641 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field4638 == -1L) {
                    this.field4638 = this.field4641;
                }
                System.arraycopy(arg0, arg1, this.field4637, (int) (this.field4641 - this.field4638), arg2);
                this.field4641 += (long) arg2;
                if (this.field4641 - this.field4638 > (long) this.field4639) {
                    this.field4639 = (int) (this.field4641 - this.field4638);
                }
            }
        } catch (IOException var11) {
            this.field4643 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("pa.w(B)V")
    public void method6832() throws IOException {
        if (this.field4638 == -1L) {
            return;
        }
        if (this.field4643 != this.field4638) {
            this.field4633.method6822(this.field4638);
            this.field4643 = this.field4638;
        }
        this.field4633.method6812(this.field4637, 0, this.field4639);
        this.field4643 += (long) (this.field4639 * 422533855) * -564469473L;
        if (this.field4643 > this.field4632) {
            this.field4632 = this.field4643;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field4638 >= this.field4635 && this.field4638 < this.field4635 + (long) this.field4636) {
            var1 = this.field4638;
        } else if (this.field4635 >= this.field4638 && this.field4635 < this.field4638 + (long) this.field4639) {
            var1 = this.field4635;
        }
        if (this.field4638 + (long) this.field4639 > this.field4635 && this.field4638 + (long) this.field4639 <= this.field4635 + (long) this.field4636) {
            var3 = this.field4638 + (long) this.field4639;
        } else if (this.field4635 + (long) this.field4636 > this.field4638 && this.field4635 + (long) this.field4636 <= this.field4638 + (long) this.field4639) {
            var3 = this.field4635 + (long) this.field4636;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field4637, (int) (var1 - this.field4638), this.field4634, (int) (var1 - this.field4635), var5);
        }
        this.field4638 = -1L;
        this.field4639 = 0;
    }
}
