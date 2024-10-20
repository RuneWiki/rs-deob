package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("pr")
public class class428 {

    @ObfuscatedName("pr.p")
    public class427 field4668;

    @ObfuscatedName("pr.f")
    public byte[] field4669;

    @ObfuscatedName("pr.n")
    public long field4670 = -1L;

    @ObfuscatedName("pr.k")
    public int field4671;

    @ObfuscatedName("pr.w")
    public byte[] field4672;

    @ObfuscatedName("pr.s")
    public long field4673 = -1L;

    @ObfuscatedName("pr.q")
    public int field4674 = 0;

    @ObfuscatedName("pr.m")
    public long field4675;

    @ObfuscatedName("pr.x")
    public long field4678;

    @ObfuscatedName("pr.j")
    public long field4677;

    @ObfuscatedName("pr.v")
    public long field4667;

    public class428(class427 arg0, int arg1, int arg2) throws IOException {
        this.field4668 = arg0;
        this.field4677 = this.field4678 = arg0.method6976();
        this.field4669 = new byte[arg1];
        this.field4672 = new byte[arg2];
        this.field4675 = 0L;
    }

    @ObfuscatedName("pr.c(I)V")
    public void method6995() throws IOException {
        this.method7002();
        this.field4668.method6991();
    }

    @ObfuscatedName("pr.p(J)V")
    public void method6996(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field4675 = arg0;
    }

    @ObfuscatedName("pr.f(I)J")
    public long method7014() {
        return this.field4677;
    }

    @ObfuscatedName("pr.n([BB)V")
    public void method6998(byte[] arg0) throws IOException {
        this.method6999(arg0, 0, arg0.length);
    }

    @ObfuscatedName("pr.k([BIIB)V")
    public void method6999(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field4673 != -1L && this.field4675 >= this.field4673 && this.field4675 + (long) arg2 <= this.field4673 + (long) this.field4674) {
                System.arraycopy(this.field4672, (int) (this.field4675 - this.field4673), arg0, arg1, arg2);
                this.field4675 += (long) arg2;
                return;
            }
            long var4 = this.field4675;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field4675 >= this.field4670 && this.field4675 < this.field4670 + (long) this.field4671) {
                int var8 = (int) ((long) this.field4671 - (this.field4675 - this.field4670));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field4669, (int) (this.field4675 - this.field4670), arg0, arg1, var8);
                this.field4675 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field4669.length) {
                this.field4668.method6972(this.field4675);
                this.field4667 = this.field4675;
                while (arg2 > 0) {
                    int var9 = this.field4668.method6977(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field4667 += (long) var9;
                    this.field4675 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method7012();
                int var10 = arg2;
                if (arg2 > this.field4671) {
                    var10 = this.field4671;
                }
                System.arraycopy(this.field4669, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field4675 += (long) var10;
            }
            if (this.field4673 != -1L) {
                if (this.field4673 > this.field4675 && arg2 > 0) {
                    int var11 = (int) (this.field4673 - this.field4675) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field4675++;
                    }
                }
                long var12 = -1L;
                long var14 = -1L;
                if (this.field4673 >= var4 && this.field4673 < (long) var7 + var4) {
                    var12 = this.field4673;
                } else if (var4 >= this.field4673 && var4 < this.field4673 + (long) this.field4674) {
                    var12 = var4;
                }
                if (this.field4673 + (long) this.field4674 > var4 && this.field4673 + (long) this.field4674 <= (long) var7 + var4) {
                    var14 = this.field4673 + (long) this.field4674;
                } else if ((long) var7 + var4 > this.field4673 && (long) var7 + var4 <= this.field4673 + (long) this.field4674) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field4672, (int) (var12 - this.field4673), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field4675) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field4675));
                        this.field4675 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field4667 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("pr.w(I)V")
    public void method7012() throws IOException {
        this.field4671 = 0;
        if (this.field4675 != this.field4667) {
            this.field4668.method6972(this.field4675);
            this.field4667 = this.field4675;
        }
        this.field4670 = this.field4675;
        while (this.field4671 < this.field4669.length) {
            int var1 = this.field4669.length - this.field4671;
            if (var1 > 200000000) {
                var1 = 200000000;
            }
            int var2 = this.field4668.method6977(this.field4669, this.field4671, var1);
            if (var2 == -1) {
                break;
            }
            this.field4667 += (long) var2;
            this.field4671 += var2;
        }
    }

    @ObfuscatedName("pr.s([BIIB)V")
    public void method7001(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field4675 + (long) arg2 > this.field4677) {
                this.field4677 = this.field4675 + (long) arg2;
            }
            if (this.field4673 != -1L && (this.field4675 < this.field4673 || this.field4675 > this.field4673 + (long) this.field4674)) {
                this.method7002();
            }
            if (this.field4673 != -1L && this.field4675 + (long) arg2 > this.field4673 + (long) this.field4672.length) {
                int var4 = (int) ((long) this.field4672.length - (this.field4675 - this.field4673));
                System.arraycopy(arg0, arg1, this.field4672, (int) (this.field4675 - this.field4673), var4);
                this.field4675 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field4674 = this.field4672.length;
                this.method7002();
            }
            if (arg2 > this.field4672.length) {
                if (this.field4675 != this.field4667) {
                    this.field4668.method6972(this.field4675);
                    this.field4667 = this.field4675;
                }
                this.field4668.method6973(arg0, arg1, arg2);
                this.field4667 += (long) arg2;
                if (this.field4667 > this.field4678) {
                    this.field4678 = this.field4667;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field4675 >= this.field4670 && this.field4675 < this.field4670 + (long) this.field4671) {
                    var5 = this.field4675;
                } else if (this.field4670 >= this.field4675 && this.field4670 < this.field4675 + (long) arg2) {
                    var5 = this.field4670;
                }
                if (this.field4675 + (long) arg2 > this.field4670 && this.field4675 + (long) arg2 <= this.field4670 + (long) this.field4671) {
                    var7 = this.field4675 + (long) arg2;
                } else if (this.field4670 + (long) this.field4671 > this.field4675 && this.field4670 + (long) this.field4671 <= this.field4675 + (long) arg2) {
                    var7 = this.field4670 + (long) this.field4671;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field4675), this.field4669, (int) (var5 - this.field4670), var9);
                }
                this.field4675 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field4673 == -1L) {
                    this.field4673 = this.field4675;
                }
                System.arraycopy(arg0, arg1, this.field4672, (int) (this.field4675 - this.field4673), arg2);
                this.field4675 += (long) arg2;
                if (this.field4675 - this.field4673 > (long) this.field4674) {
                    this.field4674 = (int) (this.field4675 - this.field4673);
                }
            }
        } catch (IOException var11) {
            this.field4667 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("pr.q(I)V")
    public void method7002() throws IOException {
        if (this.field4673 == -1L) {
            return;
        }
        if (this.field4673 != this.field4667) {
            this.field4668.method6972(this.field4673);
            this.field4667 = this.field4673;
        }
        this.field4668.method6973(this.field4672, 0, this.field4674);
        this.field4667 += (long) (this.field4674 * 1446154827) * 1232611171L;
        if (this.field4667 > this.field4678) {
            this.field4678 = this.field4667;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field4673 >= this.field4670 && this.field4673 < this.field4670 + (long) this.field4671) {
            var1 = this.field4673;
        } else if (this.field4670 >= this.field4673 && this.field4670 < this.field4673 + (long) this.field4674) {
            var1 = this.field4670;
        }
        if (this.field4673 + (long) this.field4674 > this.field4670 && this.field4673 + (long) this.field4674 <= this.field4670 + (long) this.field4671) {
            var3 = this.field4673 + (long) this.field4674;
        } else if (this.field4670 + (long) this.field4671 > this.field4673 && this.field4670 + (long) this.field4671 <= this.field4673 + (long) this.field4674) {
            var3 = this.field4670 + (long) this.field4671;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field4672, (int) (var1 - this.field4673), this.field4669, (int) (var1 - this.field4670), var5);
        }
        this.field4673 = -1L;
        this.field4674 = 0;
    }
}
