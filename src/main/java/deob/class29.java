package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("ak")
public class class29 {

    @ObfuscatedName("ak.v")
    public class28 field753;

    @ObfuscatedName("ak.f")
    public byte[] field748;

    @ObfuscatedName("ak.n")
    public long field745 = -1L;

    @ObfuscatedName("ak.c")
    public int field744;

    @ObfuscatedName("ak.r")
    public byte[] field747;

    @ObfuscatedName("ak.k")
    public long field746 = -1L;

    @ObfuscatedName("ak.e")
    public int field743 = 0;

    @ObfuscatedName("ak.q")
    public long field750;

    @ObfuscatedName("ak.u")
    public long field751;

    @ObfuscatedName("ak.s")
    public long field752;

    @ObfuscatedName("ak.l")
    public long field749;

    public class29(class28 arg0, int arg1, int arg2) throws IOException {
        this.field753 = arg0;
        this.field752 = this.field751 = arg0.method558();
        this.field748 = new byte[arg1];
        this.field747 = new byte[arg2];
        this.field750 = 0L;
    }

    @ObfuscatedName("ak.v(I)V")
    public void method577() throws IOException {
        this.method576();
        this.field753.method554();
    }

    @ObfuscatedName("ak.f(J)V")
    public void method578(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field750 = arg0;
    }

    @ObfuscatedName("ak.n(I)J")
    public long method579() {
        return this.field752;
    }

    @ObfuscatedName("ak.c([BI)V")
    public void method590(byte[] arg0) throws IOException {
        this.method580(arg0, 0, arg0.length);
    }

    @ObfuscatedName("ak.r([BIIB)V")
    public void method580(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field746 != -1L && this.field750 >= this.field746 && this.field750 + (long) arg2 <= this.field746 + (long) this.field743) {
                System.arraycopy(this.field747, (int) (this.field750 - this.field746), arg0, arg1, arg2);
                this.field750 += (long) arg2;
                return;
            }
            long var4 = this.field750;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field750 >= this.field745 && this.field750 < this.field745 + (long) this.field744) {
                int var8 = (int) ((long) this.field744 - (this.field750 - this.field745));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field748, (int) (this.field750 - this.field745), arg0, arg1, var8);
                this.field750 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field748.length) {
                this.field753.method555(this.field750);
                this.field749 = this.field750;
                while (arg2 > 0) {
                    int var9 = this.field753.method570(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field749 += (long) var9;
                    this.field750 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method598();
                int var10 = arg2;
                if (arg2 > this.field744) {
                    var10 = this.field744;
                }
                System.arraycopy(this.field748, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field750 += (long) var10;
            }
            if (this.field746 != -1L) {
                if (this.field746 > this.field750 && arg2 > 0) {
                    int var11 = (int) (this.field746 - this.field750) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field750++;
                    }
                }
                long var12 = -1L;
                long var14 = -1L;
                if (this.field746 >= var4 && this.field746 < (long) var7 + var4) {
                    var12 = this.field746;
                } else if (var4 >= this.field746 && var4 < this.field746 + (long) this.field743) {
                    var12 = var4;
                }
                if (this.field746 + (long) this.field743 > var4 && this.field746 + (long) this.field743 <= (long) var7 + var4) {
                    var14 = this.field746 + (long) this.field743;
                } else if ((long) var7 + var4 > this.field746 && (long) var7 + var4 <= this.field746 + (long) this.field743) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field747, (int) (var12 - this.field746), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field750) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field750));
                        this.field750 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field749 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("ak.k(I)V")
    public void method598() throws IOException {
        this.field744 = 0;
        if (this.field750 != this.field749) {
            this.field753.method555(this.field750);
            this.field749 = this.field750;
        }
        this.field745 = this.field750;
        while (this.field744 < this.field748.length) {
            int var1 = this.field753.method570(this.field748, this.field744, this.field748.length - this.field744);
            if (var1 == -1) {
                break;
            }
            this.field749 += (long) var1;
            this.field744 += var1;
        }
    }

    @ObfuscatedName("ak.e([BIII)V")
    public void method582(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field750 + (long) arg2 > this.field752) {
                this.field752 = this.field750 + (long) arg2;
            }
            if (this.field746 != -1L && (this.field750 < this.field746 || this.field750 > this.field746 + (long) this.field743)) {
                this.method576();
            }
            if (this.field746 != -1L && this.field750 + (long) arg2 > this.field746 + (long) this.field747.length) {
                int var4 = (int) ((long) this.field747.length - (this.field750 - this.field746));
                System.arraycopy(arg0, arg1, this.field747, (int) (this.field750 - this.field746), var4);
                this.field750 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field743 = this.field747.length;
                this.method576();
            }
            if (arg2 > this.field747.length) {
                if (this.field750 != this.field749) {
                    this.field753.method555(this.field750);
                    this.field749 = this.field750;
                }
                this.field753.method556(arg0, arg1, arg2);
                this.field749 += (long) arg2;
                if (this.field749 > this.field751) {
                    this.field751 = this.field749;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field750 >= this.field745 && this.field750 < this.field745 + (long) this.field744) {
                    var5 = this.field750;
                } else if (this.field745 >= this.field750 && this.field745 < this.field750 + (long) arg2) {
                    var5 = this.field745;
                }
                if (this.field750 + (long) arg2 > this.field745 && this.field750 + (long) arg2 <= this.field745 + (long) this.field744) {
                    var7 = this.field750 + (long) arg2;
                } else if (this.field745 + (long) this.field744 > this.field750 && this.field745 + (long) this.field744 <= this.field750 + (long) arg2) {
                    var7 = this.field745 + (long) this.field744;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field750), this.field748, (int) (var5 - this.field745), var9);
                }
                this.field750 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field746 == -1L) {
                    this.field746 = this.field750;
                }
                System.arraycopy(arg0, arg1, this.field747, (int) (this.field750 - this.field746), arg2);
                this.field750 += (long) arg2;
                if (this.field750 - this.field746 > (long) this.field743) {
                    this.field743 = (int) (this.field750 - this.field746);
                }
            }
        } catch (IOException var11) {
            this.field749 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("ak.q(S)V")
    public void method576() throws IOException {
        if (this.field746 == -1L) {
            return;
        }
        if (this.field749 != this.field746) {
            this.field753.method555(this.field746);
            this.field749 = this.field746;
        }
        this.field753.method556(this.field747, 0, this.field743);
        this.field749 += (long) (this.field743 * -1726394651) * -625688851L;
        if (this.field749 > this.field751) {
            this.field751 = this.field749;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field746 >= this.field745 && this.field746 < this.field745 + (long) this.field744) {
            var1 = this.field746;
        } else if (this.field745 >= this.field746 && this.field745 < this.field746 + (long) this.field743) {
            var1 = this.field745;
        }
        if (this.field746 + (long) this.field743 > this.field745 && this.field746 + (long) this.field743 <= this.field745 + (long) this.field744) {
            var3 = this.field746 + (long) this.field743;
        } else if (this.field745 + (long) this.field744 > this.field746 && this.field745 + (long) this.field744 <= this.field746 + (long) this.field743) {
            var3 = this.field745 + (long) this.field744;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field747, (int) (var1 - this.field746), this.field748, (int) (var1 - this.field745), var5);
        }
        this.field746 = -1L;
        this.field743 = 0;
    }
}
