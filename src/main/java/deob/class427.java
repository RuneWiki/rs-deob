package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("pf")
public class class427 {

    @ObfuscatedName("pf.h")
    public class426 field4629;

    @ObfuscatedName("pf.w")
    public byte[] field4630;

    @ObfuscatedName("pf.v")
    public long field4631 = -1L;

    @ObfuscatedName("pf.c")
    public int field4632;

    @ObfuscatedName("pf.q")
    public byte[] field4633;

    @ObfuscatedName("pf.i")
    public long field4640 = -1L;

    @ObfuscatedName("pf.k")
    public int field4638 = 0;

    @ObfuscatedName("pf.o")
    public long field4636;

    @ObfuscatedName("pf.n")
    public long field4628;

    @ObfuscatedName("pf.d")
    public long field4634;

    @ObfuscatedName("pf.a")
    public long field4639;

    public class427(class426 arg0, int arg1, int arg2) throws IOException {
        this.field4629 = arg0;
        this.field4634 = this.field4628 = arg0.method6713();
        this.field4630 = new byte[arg1];
        this.field4633 = new byte[arg2];
        this.field4636 = 0L;
    }

    @ObfuscatedName("pf.s(B)V")
    public void method6754() throws IOException {
        this.method6738();
        this.field4629.method6716();
    }

    @ObfuscatedName("pf.h(J)V")
    public void method6732(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field4636 = arg0;
    }

    @ObfuscatedName("pf.w(I)J")
    public long method6733() {
        return this.field4634;
    }

    @ObfuscatedName("pf.v([BI)V")
    public void method6736(byte[] arg0) throws IOException {
        this.method6735(arg0, 0, arg0.length);
    }

    @ObfuscatedName("pf.c([BIII)V")
    public void method6735(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field4640 != -1L && this.field4636 >= this.field4640 && this.field4636 + (long) arg2 <= this.field4640 + (long) this.field4638) {
                System.arraycopy(this.field4633, (int) (this.field4636 - this.field4640), arg0, arg1, arg2);
                this.field4636 += (long) arg2;
                return;
            }
            long var4 = this.field4636;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field4636 >= this.field4631 && this.field4636 < this.field4631 + (long) this.field4632) {
                int var8 = (int) ((long) this.field4632 - (this.field4636 - this.field4631));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field4630, (int) (this.field4636 - this.field4631), arg0, arg1, var8);
                this.field4636 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field4630.length) {
                this.field4629.method6714(this.field4636);
                this.field4639 = this.field4636;
                while (arg2 > 0) {
                    int var9 = this.field4629.method6719(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field4639 += (long) var9;
                    this.field4636 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method6744();
                int var10 = arg2;
                if (arg2 > this.field4632) {
                    var10 = this.field4632;
                }
                System.arraycopy(this.field4630, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field4636 += (long) var10;
            }
            if (this.field4640 != -1L) {
                if (this.field4640 > this.field4636 && arg2 > 0) {
                    int var11 = (int) (this.field4640 - this.field4636) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field4636++;
                    }
                }
                long var12 = -1L;
                long var14 = -1L;
                if (this.field4640 >= var4 && this.field4640 < (long) var7 + var4) {
                    var12 = this.field4640;
                } else if (var4 >= this.field4640 && var4 < this.field4640 + (long) this.field4638) {
                    var12 = var4;
                }
                if (this.field4640 + (long) this.field4638 > var4 && this.field4640 + (long) this.field4638 <= (long) var7 + var4) {
                    var14 = this.field4640 + (long) this.field4638;
                } else if ((long) var7 + var4 > this.field4640 && (long) var7 + var4 <= this.field4640 + (long) this.field4638) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field4633, (int) (var12 - this.field4640), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field4636) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field4636));
                        this.field4636 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field4639 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("pf.q(I)V")
    public void method6744() throws IOException {
        this.field4632 = 0;
        if (this.field4639 != this.field4636) {
            this.field4629.method6714(this.field4636);
            this.field4639 = this.field4636;
        }
        this.field4631 = this.field4636;
        while (this.field4632 < this.field4630.length) {
            int var1 = this.field4630.length - this.field4632;
            if (var1 > 200000000) {
                var1 = 200000000;
            }
            int var2 = this.field4629.method6719(this.field4630, this.field4632, var1);
            if (var2 == -1) {
                break;
            }
            this.field4639 += (long) var2;
            this.field4632 += var2;
        }
    }

    @ObfuscatedName("pf.i([BIIB)V")
    public void method6737(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field4636 + (long) arg2 > this.field4634) {
                this.field4634 = this.field4636 + (long) arg2;
            }
            if (this.field4640 != -1L && (this.field4636 < this.field4640 || this.field4636 > this.field4640 + (long) this.field4638)) {
                this.method6738();
            }
            if (this.field4640 != -1L && this.field4636 + (long) arg2 > this.field4640 + (long) this.field4633.length) {
                int var4 = (int) ((long) this.field4633.length - (this.field4636 - this.field4640));
                System.arraycopy(arg0, arg1, this.field4633, (int) (this.field4636 - this.field4640), var4);
                this.field4636 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field4638 = this.field4633.length;
                this.method6738();
            }
            if (arg2 > this.field4633.length) {
                if (this.field4639 != this.field4636) {
                    this.field4629.method6714(this.field4636);
                    this.field4639 = this.field4636;
                }
                this.field4629.method6715(arg0, arg1, arg2);
                this.field4639 += (long) arg2;
                if (this.field4639 > this.field4628) {
                    this.field4628 = this.field4639;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field4636 >= this.field4631 && this.field4636 < this.field4631 + (long) this.field4632) {
                    var5 = this.field4636;
                } else if (this.field4631 >= this.field4636 && this.field4631 < this.field4636 + (long) arg2) {
                    var5 = this.field4631;
                }
                if (this.field4636 + (long) arg2 > this.field4631 && this.field4636 + (long) arg2 <= this.field4631 + (long) this.field4632) {
                    var7 = this.field4636 + (long) arg2;
                } else if (this.field4631 + (long) this.field4632 > this.field4636 && this.field4631 + (long) this.field4632 <= this.field4636 + (long) arg2) {
                    var7 = this.field4631 + (long) this.field4632;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field4636), this.field4630, (int) (var5 - this.field4631), var9);
                }
                this.field4636 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field4640 == -1L) {
                    this.field4640 = this.field4636;
                }
                System.arraycopy(arg0, arg1, this.field4633, (int) (this.field4636 - this.field4640), arg2);
                this.field4636 += (long) arg2;
                if (this.field4636 - this.field4640 > (long) this.field4638) {
                    this.field4638 = (int) (this.field4636 - this.field4640);
                }
            }
        } catch (IOException var11) {
            this.field4639 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("pf.k(I)V")
    public void method6738() throws IOException {
        if (this.field4640 == -1L) {
            return;
        }
        if (this.field4640 != this.field4639) {
            this.field4629.method6714(this.field4640);
            this.field4639 = this.field4640;
        }
        this.field4629.method6715(this.field4633, 0, this.field4638);
        this.field4639 += (long) (this.field4638 * 591258949) * 631956877L;
        if (this.field4639 > this.field4628) {
            this.field4628 = this.field4639;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field4640 >= this.field4631 && this.field4640 < this.field4631 + (long) this.field4632) {
            var1 = this.field4640;
        } else if (this.field4631 >= this.field4640 && this.field4631 < this.field4640 + (long) this.field4638) {
            var1 = this.field4631;
        }
        if (this.field4640 + (long) this.field4638 > this.field4631 && this.field4640 + (long) this.field4638 <= this.field4631 + (long) this.field4632) {
            var3 = this.field4640 + (long) this.field4638;
        } else if (this.field4631 + (long) this.field4632 > this.field4640 && this.field4631 + (long) this.field4632 <= this.field4640 + (long) this.field4638) {
            var3 = this.field4631 + (long) this.field4632;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field4633, (int) (var1 - this.field4640), this.field4630, (int) (var1 - this.field4631), var5);
        }
        this.field4640 = -1L;
        this.field4638 = 0;
    }
}
