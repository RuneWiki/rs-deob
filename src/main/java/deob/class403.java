package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("of")
public class class403 {

    @ObfuscatedName("of.b")
    public class402 field4418;

    @ObfuscatedName("of.p")
    public byte[] field4419;

    @ObfuscatedName("of.m")
    public long field4420 = -1L;

    @ObfuscatedName("of.t")
    public int field4421;

    @ObfuscatedName("of.s")
    public byte[] field4429;

    @ObfuscatedName("of.j")
    public long field4423 = -1L;

    @ObfuscatedName("of.w")
    public int field4424 = 0;

    @ObfuscatedName("of.n")
    public long field4425;

    @ObfuscatedName("of.r")
    public long field4426;

    @ObfuscatedName("of.o")
    public long field4422;

    @ObfuscatedName("of.v")
    public long field4428;

    public class403(class402 arg0, int arg1, int arg2) throws IOException {
        this.field4418 = arg0;
        this.field4422 = this.field4426 = arg0.method6484();
        this.field4419 = new byte[arg1];
        this.field4429 = new byte[arg2];
        this.field4425 = 0L;
    }

    @ObfuscatedName("of.c(I)V")
    public void method6515() throws IOException {
        this.method6522();
        this.field4418.method6487();
    }

    @ObfuscatedName("of.b(J)V")
    public void method6516(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field4425 = arg0;
    }

    @ObfuscatedName("of.p(I)J")
    public long method6517() {
        return this.field4422;
    }

    @ObfuscatedName("of.m([BI)V")
    public void method6514(byte[] arg0) throws IOException {
        this.method6519(arg0, 0, arg0.length);
    }

    @ObfuscatedName("of.t([BIIB)V")
    public void method6519(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field4423 != -1L && this.field4425 >= this.field4423 && this.field4425 + (long) arg2 <= this.field4423 + (long) this.field4424) {
                System.arraycopy(this.field4429, (int) (this.field4425 - this.field4423), arg0, arg1, arg2);
                this.field4425 += (long) arg2;
                return;
            }
            long var4 = this.field4425;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field4425 >= this.field4420 && this.field4425 < this.field4420 + (long) this.field4421) {
                int var8 = (int) ((long) this.field4421 - (this.field4425 - this.field4420));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field4419, (int) (this.field4425 - this.field4420), arg0, arg1, var8);
                this.field4425 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field4419.length) {
                this.field4418.method6485(this.field4425);
                this.field4428 = this.field4425;
                while (arg2 > 0) {
                    int var9 = this.field4418.method6490(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field4428 += (long) var9;
                    this.field4425 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method6520();
                int var10 = arg2;
                if (arg2 > this.field4421) {
                    var10 = this.field4421;
                }
                System.arraycopy(this.field4419, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field4425 += (long) var10;
            }
            if (this.field4423 != -1L) {
                if (this.field4423 > this.field4425 && arg2 > 0) {
                    int var11 = (int) (this.field4423 - this.field4425) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field4425++;
                    }
                }
                long var12 = -1L;
                long var14 = -1L;
                if (this.field4423 >= var4 && this.field4423 < (long) var7 + var4) {
                    var12 = this.field4423;
                } else if (var4 >= this.field4423 && var4 < this.field4423 + (long) this.field4424) {
                    var12 = var4;
                }
                if (this.field4423 + (long) this.field4424 > var4 && this.field4423 + (long) this.field4424 <= (long) var7 + var4) {
                    var14 = this.field4423 + (long) this.field4424;
                } else if ((long) var7 + var4 > this.field4423 && (long) var7 + var4 <= this.field4423 + (long) this.field4424) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field4429, (int) (var12 - this.field4423), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field4425) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field4425));
                        this.field4425 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field4428 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("of.s(I)V")
    public void method6520() throws IOException {
        this.field4421 = 0;
        if (this.field4428 != this.field4425) {
            this.field4418.method6485(this.field4425);
            this.field4428 = this.field4425;
        }
        this.field4420 = this.field4425;
        while (this.field4421 < this.field4419.length) {
            int var1 = this.field4419.length - this.field4421;
            if (var1 > 200000000) {
                var1 = 200000000;
            }
            int var2 = this.field4418.method6490(this.field4419, this.field4421, var1);
            if (var2 == -1) {
                break;
            }
            this.field4428 += (long) var2;
            this.field4421 += var2;
        }
    }

    @ObfuscatedName("of.j([BIII)V")
    public void method6525(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field4425 + (long) arg2 > this.field4422) {
                this.field4422 = this.field4425 + (long) arg2;
            }
            if (this.field4423 != -1L && (this.field4425 < this.field4423 || this.field4425 > this.field4423 + (long) this.field4424)) {
                this.method6522();
            }
            if (this.field4423 != -1L && this.field4425 + (long) arg2 > this.field4423 + (long) this.field4429.length) {
                int var4 = (int) ((long) this.field4429.length - (this.field4425 - this.field4423));
                System.arraycopy(arg0, arg1, this.field4429, (int) (this.field4425 - this.field4423), var4);
                this.field4425 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field4424 = this.field4429.length;
                this.method6522();
            }
            if (arg2 > this.field4429.length) {
                if (this.field4428 != this.field4425) {
                    this.field4418.method6485(this.field4425);
                    this.field4428 = this.field4425;
                }
                this.field4418.method6486(arg0, arg1, arg2);
                this.field4428 += (long) arg2;
                if (this.field4428 > this.field4426) {
                    this.field4426 = this.field4428;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field4425 >= this.field4420 && this.field4425 < this.field4420 + (long) this.field4421) {
                    var5 = this.field4425;
                } else if (this.field4420 >= this.field4425 && this.field4420 < this.field4425 + (long) arg2) {
                    var5 = this.field4420;
                }
                if (this.field4425 + (long) arg2 > this.field4420 && this.field4425 + (long) arg2 <= this.field4420 + (long) this.field4421) {
                    var7 = this.field4425 + (long) arg2;
                } else if (this.field4420 + (long) this.field4421 > this.field4425 && this.field4420 + (long) this.field4421 <= this.field4425 + (long) arg2) {
                    var7 = this.field4420 + (long) this.field4421;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field4425), this.field4419, (int) (var5 - this.field4420), var9);
                }
                this.field4425 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field4423 == -1L) {
                    this.field4423 = this.field4425;
                }
                System.arraycopy(arg0, arg1, this.field4429, (int) (this.field4425 - this.field4423), arg2);
                this.field4425 += (long) arg2;
                if (this.field4425 - this.field4423 > (long) this.field4424) {
                    this.field4424 = (int) (this.field4425 - this.field4423);
                }
            }
        } catch (IOException var11) {
            this.field4428 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("of.w(I)V")
    public void method6522() throws IOException {
        if (this.field4423 == -1L) {
            return;
        }
        if (this.field4428 != this.field4423) {
            this.field4418.method6485(this.field4423);
            this.field4428 = this.field4423;
        }
        this.field4418.method6486(this.field4429, 0, this.field4424);
        this.field4428 += (long) (this.field4424 * -2044845393) * -909872049L;
        if (this.field4428 > this.field4426) {
            this.field4426 = this.field4428;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field4423 >= this.field4420 && this.field4423 < this.field4420 + (long) this.field4421) {
            var1 = this.field4423;
        } else if (this.field4420 >= this.field4423 && this.field4420 < this.field4423 + (long) this.field4424) {
            var1 = this.field4420;
        }
        if (this.field4423 + (long) this.field4424 > this.field4420 && this.field4423 + (long) this.field4424 <= this.field4420 + (long) this.field4421) {
            var3 = this.field4423 + (long) this.field4424;
        } else if (this.field4420 + (long) this.field4421 > this.field4423 && this.field4420 + (long) this.field4421 <= this.field4423 + (long) this.field4424) {
            var3 = this.field4420 + (long) this.field4421;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field4429, (int) (var1 - this.field4423), this.field4419, (int) (var1 - this.field4420), var5);
        }
        this.field4423 = -1L;
        this.field4424 = 0;
    }
}
