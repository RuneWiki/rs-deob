package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("pz")
public class class427 {

    @ObfuscatedName("pz.q")
    public class426 field4630;

    @ObfuscatedName("pz.l")
    public byte[] field4631;

    @ObfuscatedName("pz.k")
    public long field4632 = -1L;

    @ObfuscatedName("pz.a")
    public int field4633;

    @ObfuscatedName("pz.m")
    public byte[] field4634;

    @ObfuscatedName("pz.p")
    public long field4635 = -1L;

    @ObfuscatedName("pz.s")
    public int field4641 = 0;

    @ObfuscatedName("pz.r")
    public long field4637;

    @ObfuscatedName("pz.v")
    public long field4642;

    @ObfuscatedName("pz.y")
    public long field4639;

    @ObfuscatedName("pz.c")
    public long field4640;

    public class427(class426 arg0, int arg1, int arg2) throws IOException {
        this.field4630 = arg0;
        this.field4639 = this.field4642 = arg0.method6724();
        this.field4631 = new byte[arg1];
        this.field4634 = new byte[arg2];
        this.field4637 = 0L;
    }

    @ObfuscatedName("pz.o(I)V")
    public void method6745() throws IOException {
        this.method6752();
        this.field4630.method6725();
    }

    @ObfuscatedName("pz.q(J)V")
    public void method6746(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field4637 = arg0;
    }

    @ObfuscatedName("pz.l(S)J")
    public long method6747() {
        return this.field4639;
    }

    @ObfuscatedName("pz.k([BI)V")
    public void method6748(byte[] arg0) throws IOException {
        this.method6753(arg0, 0, arg0.length);
    }

    @ObfuscatedName("pz.a([BIII)V")
    public void method6753(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field4635 != -1L && this.field4637 >= this.field4635 && this.field4637 + (long) arg2 <= this.field4635 + (long) this.field4641) {
                System.arraycopy(this.field4634, (int) (this.field4637 - this.field4635), arg0, arg1, arg2);
                this.field4637 += (long) arg2;
                return;
            }
            long var4 = this.field4637;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field4637 >= this.field4632 && this.field4637 < this.field4632 + (long) this.field4633) {
                int var8 = (int) ((long) this.field4633 - (this.field4637 - this.field4632));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field4631, (int) (this.field4637 - this.field4632), arg0, arg1, var8);
                this.field4637 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field4631.length) {
                this.field4630.method6726(this.field4637);
                this.field4640 = this.field4637;
                while (arg2 > 0) {
                    int var9 = this.field4630.method6731(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field4640 += (long) var9;
                    this.field4637 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method6758();
                int var10 = arg2;
                if (arg2 > this.field4633) {
                    var10 = this.field4633;
                }
                System.arraycopy(this.field4631, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field4637 += (long) var10;
            }
            if (this.field4635 != -1L) {
                if (this.field4635 > this.field4637 && arg2 > 0) {
                    int var11 = (int) (this.field4635 - this.field4637) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field4637++;
                    }
                }
                long var12 = -1L;
                long var14 = -1L;
                if (this.field4635 >= var4 && this.field4635 < (long) var7 + var4) {
                    var12 = this.field4635;
                } else if (var4 >= this.field4635 && var4 < this.field4635 + (long) this.field4641) {
                    var12 = var4;
                }
                if (this.field4635 + (long) this.field4641 > var4 && this.field4635 + (long) this.field4641 <= (long) var7 + var4) {
                    var14 = this.field4635 + (long) this.field4641;
                } else if ((long) var7 + var4 > this.field4635 && (long) var7 + var4 <= this.field4635 + (long) this.field4641) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field4634, (int) (var12 - this.field4635), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field4637) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field4637));
                        this.field4637 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field4640 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("pz.m(I)V")
    public void method6758() throws IOException {
        this.field4633 = 0;
        if (this.field4640 != this.field4637) {
            this.field4630.method6726(this.field4637);
            this.field4640 = this.field4637;
        }
        this.field4632 = this.field4637;
        while (this.field4633 < this.field4631.length) {
            int var1 = this.field4631.length - this.field4633;
            if (var1 > 200000000) {
                var1 = 200000000;
            }
            int var2 = this.field4630.method6731(this.field4631, this.field4633, var1);
            if (var2 == -1) {
                break;
            }
            this.field4640 += (long) var2;
            this.field4633 += var2;
        }
    }

    @ObfuscatedName("pz.p([BIII)V")
    public void method6751(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field4637 + (long) arg2 > this.field4639) {
                this.field4639 = this.field4637 + (long) arg2;
            }
            if (this.field4635 != -1L && (this.field4637 < this.field4635 || this.field4637 > this.field4635 + (long) this.field4641)) {
                this.method6752();
            }
            if (this.field4635 != -1L && this.field4637 + (long) arg2 > this.field4635 + (long) this.field4634.length) {
                int var4 = (int) ((long) this.field4634.length - (this.field4637 - this.field4635));
                System.arraycopy(arg0, arg1, this.field4634, (int) (this.field4637 - this.field4635), var4);
                this.field4637 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field4641 = this.field4634.length;
                this.method6752();
            }
            if (arg2 > this.field4634.length) {
                if (this.field4640 != this.field4637) {
                    this.field4630.method6726(this.field4637);
                    this.field4640 = this.field4637;
                }
                this.field4630.method6735(arg0, arg1, arg2);
                this.field4640 += (long) arg2;
                if (this.field4640 > this.field4642) {
                    this.field4642 = this.field4640;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field4637 >= this.field4632 && this.field4637 < this.field4632 + (long) this.field4633) {
                    var5 = this.field4637;
                } else if (this.field4632 >= this.field4637 && this.field4632 < this.field4637 + (long) arg2) {
                    var5 = this.field4632;
                }
                if (this.field4637 + (long) arg2 > this.field4632 && this.field4637 + (long) arg2 <= this.field4632 + (long) this.field4633) {
                    var7 = this.field4637 + (long) arg2;
                } else if (this.field4632 + (long) this.field4633 > this.field4637 && this.field4632 + (long) this.field4633 <= this.field4637 + (long) arg2) {
                    var7 = this.field4632 + (long) this.field4633;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field4637), this.field4631, (int) (var5 - this.field4632), var9);
                }
                this.field4637 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field4635 == -1L) {
                    this.field4635 = this.field4637;
                }
                System.arraycopy(arg0, arg1, this.field4634, (int) (this.field4637 - this.field4635), arg2);
                this.field4637 += (long) arg2;
                if (this.field4637 - this.field4635 > (long) this.field4641) {
                    this.field4641 = (int) (this.field4637 - this.field4635);
                }
            }
        } catch (IOException var11) {
            this.field4640 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("pz.s(I)V")
    public void method6752() throws IOException {
        if (this.field4635 == -1L) {
            return;
        }
        if (this.field4640 != this.field4635) {
            this.field4630.method6726(this.field4635);
            this.field4640 = this.field4635;
        }
        this.field4630.method6735(this.field4634, 0, this.field4641);
        this.field4640 += (long) (this.field4641 * -1017418207) * -701786655L;
        if (this.field4640 > this.field4642) {
            this.field4642 = this.field4640;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field4635 >= this.field4632 && this.field4635 < this.field4632 + (long) this.field4633) {
            var1 = this.field4635;
        } else if (this.field4632 >= this.field4635 && this.field4632 < this.field4635 + (long) this.field4641) {
            var1 = this.field4632;
        }
        if (this.field4635 + (long) this.field4641 > this.field4632 && this.field4635 + (long) this.field4641 <= this.field4632 + (long) this.field4633) {
            var3 = this.field4635 + (long) this.field4641;
        } else if (this.field4632 + (long) this.field4633 > this.field4635 && this.field4632 + (long) this.field4633 <= this.field4635 + (long) this.field4641) {
            var3 = this.field4632 + (long) this.field4633;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field4634, (int) (var1 - this.field4635), this.field4631, (int) (var1 - this.field4632), var5);
        }
        this.field4635 = -1L;
        this.field4641 = 0;
    }
}
