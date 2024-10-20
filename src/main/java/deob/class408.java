package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("oa")
public class class408 {

    @ObfuscatedName("oa.l")
    public class407 field4468;

    @ObfuscatedName("oa.s")
    public byte[] field4469;

    @ObfuscatedName("oa.e")
    public long field4478 = -1L;

    @ObfuscatedName("oa.r")
    public int field4476;

    @ObfuscatedName("oa.o")
    public byte[] field4472;

    @ObfuscatedName("oa.i")
    public long field4467 = -1L;

    @ObfuscatedName("oa.w")
    public int field4474 = 0;

    @ObfuscatedName("oa.v")
    public long field4475;

    @ObfuscatedName("oa.a")
    public long field4473;

    @ObfuscatedName("oa.y")
    public long field4477;

    @ObfuscatedName("oa.u")
    public long field4471;

    public class408(class407 arg0, int arg1, int arg2) throws IOException {
        this.field4468 = arg0;
        this.field4477 = this.field4473 = arg0.method6485();
        this.field4469 = new byte[arg1];
        this.field4472 = new byte[arg2];
        this.field4475 = 0L;
    }

    @ObfuscatedName("oa.c(B)V")
    public void method6502() throws IOException {
        this.method6509();
        this.field4468.method6483();
    }

    @ObfuscatedName("oa.l(J)V")
    public void method6501(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field4475 = arg0;
    }

    @ObfuscatedName("oa.s(S)J")
    public long method6504() {
        return this.field4477;
    }

    @ObfuscatedName("oa.e([BB)V")
    public void method6505(byte[] arg0) throws IOException {
        this.method6516(arg0, 0, arg0.length);
    }

    @ObfuscatedName("oa.r([BIII)V")
    public void method6516(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field4467 != -1L && this.field4475 >= this.field4467 && this.field4475 + (long) arg2 <= this.field4467 + (long) this.field4474) {
                System.arraycopy(this.field4472, (int) (this.field4475 - this.field4467), arg0, arg1, arg2);
                this.field4475 += (long) arg2;
                return;
            }
            long var4 = this.field4475;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field4475 >= this.field4478 && this.field4475 < this.field4478 + (long) this.field4476) {
                int var8 = (int) ((long) this.field4476 - (this.field4475 - this.field4478));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field4469, (int) (this.field4475 - this.field4478), arg0, arg1, var8);
                this.field4475 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field4469.length) {
                this.field4468.method6481(this.field4475);
                this.field4471 = this.field4475;
                while (arg2 > 0) {
                    int var9 = this.field4468.method6486(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field4471 += (long) var9;
                    this.field4475 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method6507();
                int var10 = arg2;
                if (arg2 > this.field4476) {
                    var10 = this.field4476;
                }
                System.arraycopy(this.field4469, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field4475 += (long) var10;
            }
            if (this.field4467 != -1L) {
                if (this.field4467 > this.field4475 && arg2 > 0) {
                    int var11 = (int) (this.field4467 - this.field4475) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field4475++;
                    }
                }
                long var12 = -1L;
                long var14 = -1L;
                if (this.field4467 >= var4 && this.field4467 < (long) var7 + var4) {
                    var12 = this.field4467;
                } else if (var4 >= this.field4467 && var4 < this.field4467 + (long) this.field4474) {
                    var12 = var4;
                }
                if (this.field4467 + (long) this.field4474 > var4 && this.field4467 + (long) this.field4474 <= (long) var7 + var4) {
                    var14 = this.field4467 + (long) this.field4474;
                } else if ((long) var7 + var4 > this.field4467 && (long) var7 + var4 <= this.field4467 + (long) this.field4474) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field4472, (int) (var12 - this.field4467), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field4475) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field4475));
                        this.field4475 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field4471 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("oa.o(I)V")
    public void method6507() throws IOException {
        this.field4476 = 0;
        if (this.field4475 != this.field4471) {
            this.field4468.method6481(this.field4475);
            this.field4471 = this.field4475;
        }
        this.field4478 = this.field4475;
        while (this.field4476 < this.field4469.length) {
            int var1 = this.field4469.length - this.field4476;
            if (var1 > 200000000) {
                var1 = 200000000;
            }
            int var2 = this.field4468.method6486(this.field4469, this.field4476, var1);
            if (var2 == -1) {
                break;
            }
            this.field4471 += (long) var2;
            this.field4476 += var2;
        }
    }

    @ObfuscatedName("oa.i([BIIB)V")
    public void method6508(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field4475 + (long) arg2 > this.field4477) {
                this.field4477 = this.field4475 + (long) arg2;
            }
            if (this.field4467 != -1L && (this.field4475 < this.field4467 || this.field4475 > this.field4467 + (long) this.field4474)) {
                this.method6509();
            }
            if (this.field4467 != -1L && this.field4475 + (long) arg2 > this.field4467 + (long) this.field4472.length) {
                int var4 = (int) ((long) this.field4472.length - (this.field4475 - this.field4467));
                System.arraycopy(arg0, arg1, this.field4472, (int) (this.field4475 - this.field4467), var4);
                this.field4475 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field4474 = this.field4472.length;
                this.method6509();
            }
            if (arg2 > this.field4472.length) {
                if (this.field4475 != this.field4471) {
                    this.field4468.method6481(this.field4475);
                    this.field4471 = this.field4475;
                }
                this.field4468.method6480(arg0, arg1, arg2);
                this.field4471 += (long) arg2;
                if (this.field4471 > this.field4473) {
                    this.field4473 = this.field4471;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field4475 >= this.field4478 && this.field4475 < this.field4478 + (long) this.field4476) {
                    var5 = this.field4475;
                } else if (this.field4478 >= this.field4475 && this.field4478 < this.field4475 + (long) arg2) {
                    var5 = this.field4478;
                }
                if (this.field4475 + (long) arg2 > this.field4478 && this.field4475 + (long) arg2 <= this.field4478 + (long) this.field4476) {
                    var7 = this.field4475 + (long) arg2;
                } else if (this.field4478 + (long) this.field4476 > this.field4475 && this.field4478 + (long) this.field4476 <= this.field4475 + (long) arg2) {
                    var7 = this.field4478 + (long) this.field4476;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field4475), this.field4469, (int) (var5 - this.field4478), var9);
                }
                this.field4475 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field4467 == -1L) {
                    this.field4467 = this.field4475;
                }
                System.arraycopy(arg0, arg1, this.field4472, (int) (this.field4475 - this.field4467), arg2);
                this.field4475 += (long) arg2;
                if (this.field4475 - this.field4467 > (long) this.field4474) {
                    this.field4474 = (int) (this.field4475 - this.field4467);
                }
            }
        } catch (IOException var11) {
            this.field4471 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("oa.w(I)V")
    public void method6509() throws IOException {
        if (this.field4467 == -1L) {
            return;
        }
        if (this.field4471 != this.field4467) {
            this.field4468.method6481(this.field4467);
            this.field4471 = this.field4467;
        }
        this.field4468.method6480(this.field4472, 0, this.field4474);
        this.field4471 += (long) (this.field4474 * -1371525439) * 1279091009L;
        if (this.field4471 > this.field4473) {
            this.field4473 = this.field4471;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field4467 >= this.field4478 && this.field4467 < this.field4478 + (long) this.field4476) {
            var1 = this.field4467;
        } else if (this.field4478 >= this.field4467 && this.field4478 < this.field4467 + (long) this.field4474) {
            var1 = this.field4478;
        }
        if (this.field4467 + (long) this.field4474 > this.field4478 && this.field4467 + (long) this.field4474 <= this.field4478 + (long) this.field4476) {
            var3 = this.field4467 + (long) this.field4474;
        } else if (this.field4478 + (long) this.field4476 > this.field4467 && this.field4478 + (long) this.field4476 <= this.field4467 + (long) this.field4474) {
            var3 = this.field4478 + (long) this.field4476;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field4472, (int) (var1 - this.field4467), this.field4469, (int) (var1 - this.field4478), var5);
        }
        this.field4467 = -1L;
        this.field4474 = 0;
    }
}
