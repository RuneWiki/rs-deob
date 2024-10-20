package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("pb")
public class class425 {

    @ObfuscatedName("pb.c")
    public class424 field4580;

    @ObfuscatedName("pb.i")
    public byte[] field4570;

    @ObfuscatedName("pb.f")
    public long field4572 = -1L;

    @ObfuscatedName("pb.b")
    public int field4573;

    @ObfuscatedName("pb.n")
    public byte[] field4574;

    @ObfuscatedName("pb.s")
    public long field4575 = -1L;

    @ObfuscatedName("pb.l")
    public int field4576 = 0;

    @ObfuscatedName("pb.q")
    public long field4577;

    @ObfuscatedName("pb.o")
    public long field4569;

    @ObfuscatedName("pb.r")
    public long field4571;

    @ObfuscatedName("pb.p")
    public long field4578;

    public class425(class424 arg0, int arg1, int arg2) throws IOException {
        this.field4580 = arg0;
        this.field4571 = this.field4569 = arg0.method6813();
        this.field4570 = new byte[arg1];
        this.field4574 = new byte[arg2];
        this.field4577 = 0L;
    }

    @ObfuscatedName("pb.v(B)V")
    public void method6848() throws IOException {
        this.method6834();
        this.field4580.method6814();
    }

    @ObfuscatedName("pb.c(J)V")
    public void method6829(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field4577 = arg0;
    }

    @ObfuscatedName("pb.i(I)J")
    public long method6830() {
        return this.field4571;
    }

    @ObfuscatedName("pb.f([BI)V")
    public void method6831(byte[] arg0) throws IOException {
        this.method6851(arg0, 0, arg0.length);
    }

    @ObfuscatedName("pb.b([BIIB)V")
    public void method6851(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field4575 != -1L && this.field4577 >= this.field4575 && this.field4577 + (long) arg2 <= this.field4575 + (long) this.field4576) {
                System.arraycopy(this.field4574, (int) (this.field4577 - this.field4575), arg0, arg1, arg2);
                this.field4577 += (long) arg2;
                return;
            }
            long var4 = this.field4577;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field4577 >= this.field4572 && this.field4577 < this.field4572 + (long) this.field4573) {
                int var8 = (int) ((long) this.field4573 - (this.field4577 - this.field4572));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field4570, (int) (this.field4577 - this.field4572), arg0, arg1, var8);
                this.field4577 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field4570.length) {
                this.field4580.method6806(this.field4577);
                this.field4578 = this.field4577;
                while (arg2 > 0) {
                    int var9 = this.field4580.method6810(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field4578 += (long) var9;
                    this.field4577 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method6833();
                int var10 = arg2;
                if (arg2 > this.field4573) {
                    var10 = this.field4573;
                }
                System.arraycopy(this.field4570, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field4577 += (long) var10;
            }
            if (this.field4575 != -1L) {
                if (this.field4575 > this.field4577 && arg2 > 0) {
                    int var11 = (int) (this.field4575 - this.field4577) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field4577++;
                    }
                }
                long var12 = -1L;
                long var14 = -1L;
                if (this.field4575 >= var4 && this.field4575 < (long) var7 + var4) {
                    var12 = this.field4575;
                } else if (var4 >= this.field4575 && var4 < this.field4575 + (long) this.field4576) {
                    var12 = var4;
                }
                if (this.field4575 + (long) this.field4576 > var4 && this.field4575 + (long) this.field4576 <= (long) var7 + var4) {
                    var14 = this.field4575 + (long) this.field4576;
                } else if ((long) var7 + var4 > this.field4575 && (long) var7 + var4 <= this.field4575 + (long) this.field4576) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field4574, (int) (var12 - this.field4575), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field4577) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field4577));
                        this.field4577 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field4578 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("pb.n(B)V")
    public void method6833() throws IOException {
        this.field4573 = 0;
        if (this.field4578 != this.field4577) {
            this.field4580.method6806(this.field4577);
            this.field4578 = this.field4577;
        }
        this.field4572 = this.field4577;
        while (this.field4573 < this.field4570.length) {
            int var1 = this.field4570.length - this.field4573;
            if (var1 > 200000000) {
                var1 = 200000000;
            }
            int var2 = this.field4580.method6810(this.field4570, this.field4573, var1);
            if (var2 == -1) {
                break;
            }
            this.field4578 += (long) var2;
            this.field4573 += var2;
        }
    }

    @ObfuscatedName("pb.s([BIII)V")
    public void method6842(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field4577 + (long) arg2 > this.field4571) {
                this.field4571 = this.field4577 + (long) arg2;
            }
            if (this.field4575 != -1L && (this.field4577 < this.field4575 || this.field4577 > this.field4575 + (long) this.field4576)) {
                this.method6834();
            }
            if (this.field4575 != -1L && this.field4577 + (long) arg2 > this.field4575 + (long) this.field4574.length) {
                int var4 = (int) ((long) this.field4574.length - (this.field4577 - this.field4575));
                System.arraycopy(arg0, arg1, this.field4574, (int) (this.field4577 - this.field4575), var4);
                this.field4577 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field4576 = this.field4574.length;
                this.method6834();
            }
            if (arg2 > this.field4574.length) {
                if (this.field4578 != this.field4577) {
                    this.field4580.method6806(this.field4577);
                    this.field4578 = this.field4577;
                }
                this.field4580.method6822(arg0, arg1, arg2);
                this.field4578 += (long) arg2;
                if (this.field4578 > this.field4569) {
                    this.field4569 = this.field4578;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field4577 >= this.field4572 && this.field4577 < this.field4572 + (long) this.field4573) {
                    var5 = this.field4577;
                } else if (this.field4572 >= this.field4577 && this.field4572 < this.field4577 + (long) arg2) {
                    var5 = this.field4572;
                }
                if (this.field4577 + (long) arg2 > this.field4572 && this.field4577 + (long) arg2 <= this.field4572 + (long) this.field4573) {
                    var7 = this.field4577 + (long) arg2;
                } else if (this.field4572 + (long) this.field4573 > this.field4577 && this.field4572 + (long) this.field4573 <= this.field4577 + (long) arg2) {
                    var7 = this.field4572 + (long) this.field4573;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field4577), this.field4570, (int) (var5 - this.field4572), var9);
                }
                this.field4577 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field4575 == -1L) {
                    this.field4575 = this.field4577;
                }
                System.arraycopy(arg0, arg1, this.field4574, (int) (this.field4577 - this.field4575), arg2);
                this.field4577 += (long) arg2;
                if (this.field4577 - this.field4575 > (long) this.field4576) {
                    this.field4576 = (int) (this.field4577 - this.field4575);
                }
            }
        } catch (IOException var11) {
            this.field4578 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("pb.l(I)V")
    public void method6834() throws IOException {
        if (this.field4575 == -1L) {
            return;
        }
        if (this.field4578 != this.field4575) {
            this.field4580.method6806(this.field4575);
            this.field4578 = this.field4575;
        }
        this.field4580.method6822(this.field4574, 0, this.field4576);
        this.field4578 += (long) (this.field4576 * -1838737555) * -694187419L;
        if (this.field4578 > this.field4569) {
            this.field4569 = this.field4578;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field4575 >= this.field4572 && this.field4575 < this.field4572 + (long) this.field4573) {
            var1 = this.field4575;
        } else if (this.field4572 >= this.field4575 && this.field4572 < this.field4575 + (long) this.field4576) {
            var1 = this.field4572;
        }
        if (this.field4575 + (long) this.field4576 > this.field4572 && this.field4575 + (long) this.field4576 <= this.field4572 + (long) this.field4573) {
            var3 = this.field4575 + (long) this.field4576;
        } else if (this.field4572 + (long) this.field4573 > this.field4575 && this.field4572 + (long) this.field4573 <= this.field4575 + (long) this.field4576) {
            var3 = this.field4572 + (long) this.field4573;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field4574, (int) (var1 - this.field4575), this.field4570, (int) (var1 - this.field4572), var5);
        }
        this.field4575 = -1L;
        this.field4576 = 0;
    }
}
