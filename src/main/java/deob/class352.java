package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("ms")
public class class352 {

    @ObfuscatedName("ms.m")
    public class353 field4076;

    @ObfuscatedName("ms.k")
    public byte[] field4086;

    @ObfuscatedName("ms.d")
    public long field4075 = -1L;

    @ObfuscatedName("ms.w")
    public int field4082;

    @ObfuscatedName("ms.v")
    public byte[] field4080;

    @ObfuscatedName("ms.q")
    public long field4081 = -1L;

    @ObfuscatedName("ms.z")
    public int field4085 = 0;

    @ObfuscatedName("ms.t")
    public long field4083;

    @ObfuscatedName("ms.e")
    public long field4084;

    @ObfuscatedName("ms.s")
    public long field4078;

    @ObfuscatedName("ms.p")
    public long field4077;

    public class352(class353 arg0, int arg1, int arg2) throws IOException {
        this.field4076 = arg0;
        this.field4078 = this.field4084 = arg0.method6194();
        this.field4086 = new byte[arg1];
        this.field4080 = new byte[arg2];
        this.field4083 = 0L;
    }

    @ObfuscatedName("ms.x(I)V")
    public void method6162() throws IOException {
        this.method6170();
        this.field4076.method6192();
    }

    @ObfuscatedName("ms.m(J)V")
    public void method6156(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field4083 = arg0;
    }

    @ObfuscatedName("ms.k(B)J")
    public long method6157() {
        return this.field4078;
    }

    @ObfuscatedName("ms.d([BI)V")
    public void method6158(byte[] arg0) throws IOException {
        this.method6154(arg0, 0, arg0.length);
    }

    @ObfuscatedName("ms.w([BIII)V")
    public void method6154(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field4081 != -1L && this.field4083 >= this.field4081 && this.field4083 + (long) arg2 <= this.field4081 + (long) this.field4085) {
                System.arraycopy(this.field4080, (int) (this.field4083 - this.field4081), arg0, arg1, arg2);
                this.field4083 += (long) arg2;
                return;
            }
            long var4 = this.field4083;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field4083 >= this.field4075 && this.field4083 < this.field4075 + (long) this.field4082) {
                int var8 = (int) ((long) this.field4082 - (this.field4083 - this.field4075));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field4086, (int) (this.field4083 - this.field4075), arg0, arg1, var8);
                this.field4083 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field4086.length) {
                this.field4076.method6191(this.field4083);
                this.field4077 = this.field4083;
                while (arg2 > 0) {
                    int var9 = this.field4076.method6206(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field4077 += (long) var9;
                    this.field4083 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method6159();
                int var10 = arg2;
                if (arg2 > this.field4082) {
                    var10 = this.field4082;
                }
                System.arraycopy(this.field4086, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field4083 += (long) var10;
            }
            if (this.field4081 != -1L) {
                if (this.field4081 > this.field4083 && arg2 > 0) {
                    int var11 = (int) (this.field4081 - this.field4083) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field4083++;
                    }
                }
                long var12 = -1L;
                long var14 = -1L;
                if (this.field4081 >= var4 && this.field4081 < (long) var7 + var4) {
                    var12 = this.field4081;
                } else if (var4 >= this.field4081 && var4 < this.field4081 + (long) this.field4085) {
                    var12 = var4;
                }
                if (this.field4081 + (long) this.field4085 > var4 && this.field4081 + (long) this.field4085 <= (long) var7 + var4) {
                    var14 = this.field4081 + (long) this.field4085;
                } else if ((long) var7 + var4 > this.field4081 && (long) var7 + var4 <= this.field4081 + (long) this.field4085) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field4080, (int) (var12 - this.field4081), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field4083) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field4083));
                        this.field4083 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field4077 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("ms.v(I)V")
    public void method6159() throws IOException {
        this.field4082 = 0;
        if (this.field4083 != this.field4077) {
            this.field4076.method6191(this.field4083);
            this.field4077 = this.field4083;
        }
        this.field4075 = this.field4083;
        while (this.field4082 < this.field4086.length) {
            int var1 = this.field4086.length - this.field4082;
            if (var1 > 200000000) {
                var1 = 200000000;
            }
            int var2 = this.field4076.method6206(this.field4086, this.field4082, var1);
            if (var2 == -1) {
                break;
            }
            this.field4077 += (long) var2;
            this.field4082 += var2;
        }
    }

    @ObfuscatedName("ms.q([BIIB)V")
    public void method6177(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field4083 + (long) arg2 > this.field4078) {
                this.field4078 = this.field4083 + (long) arg2;
            }
            if (this.field4081 != -1L && (this.field4083 < this.field4081 || this.field4083 > this.field4081 + (long) this.field4085)) {
                this.method6170();
            }
            if (this.field4081 != -1L && this.field4083 + (long) arg2 > this.field4081 + (long) this.field4080.length) {
                int var4 = (int) ((long) this.field4080.length - (this.field4083 - this.field4081));
                System.arraycopy(arg0, arg1, this.field4080, (int) (this.field4083 - this.field4081), var4);
                this.field4083 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field4085 = this.field4080.length;
                this.method6170();
            }
            if (arg2 > this.field4080.length) {
                if (this.field4083 != this.field4077) {
                    this.field4076.method6191(this.field4083);
                    this.field4077 = this.field4083;
                }
                this.field4076.method6197(arg0, arg1, arg2);
                this.field4077 += (long) arg2;
                if (this.field4077 > this.field4084) {
                    this.field4084 = this.field4077;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field4083 >= this.field4075 && this.field4083 < this.field4075 + (long) this.field4082) {
                    var5 = this.field4083;
                } else if (this.field4075 >= this.field4083 && this.field4075 < this.field4083 + (long) arg2) {
                    var5 = this.field4075;
                }
                if (this.field4083 + (long) arg2 > this.field4075 && this.field4083 + (long) arg2 <= this.field4075 + (long) this.field4082) {
                    var7 = this.field4083 + (long) arg2;
                } else if (this.field4075 + (long) this.field4082 > this.field4083 && this.field4075 + (long) this.field4082 <= this.field4083 + (long) arg2) {
                    var7 = this.field4075 + (long) this.field4082;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field4083), this.field4086, (int) (var5 - this.field4075), var9);
                }
                this.field4083 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field4081 == -1L) {
                    this.field4081 = this.field4083;
                }
                System.arraycopy(arg0, arg1, this.field4080, (int) (this.field4083 - this.field4081), arg2);
                this.field4083 += (long) arg2;
                if (this.field4083 - this.field4081 > (long) this.field4085) {
                    this.field4085 = (int) (this.field4083 - this.field4081);
                }
            }
        } catch (IOException var11) {
            this.field4077 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("ms.z(I)V")
    public void method6170() throws IOException {
        if (this.field4081 == -1L) {
            return;
        }
        if (this.field4081 != this.field4077) {
            this.field4076.method6191(this.field4081);
            this.field4077 = this.field4081;
        }
        this.field4076.method6197(this.field4080, 0, this.field4085);
        this.field4077 += (long) (this.field4085 * 352301747) * 730352763L;
        if (this.field4077 > this.field4084) {
            this.field4084 = this.field4077;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field4081 >= this.field4075 && this.field4081 < this.field4075 + (long) this.field4082) {
            var1 = this.field4081;
        } else if (this.field4075 >= this.field4081 && this.field4075 < this.field4081 + (long) this.field4085) {
            var1 = this.field4075;
        }
        if (this.field4081 + (long) this.field4085 > this.field4075 && this.field4081 + (long) this.field4085 <= this.field4075 + (long) this.field4082) {
            var3 = this.field4081 + (long) this.field4085;
        } else if (this.field4075 + (long) this.field4082 > this.field4081 && this.field4075 + (long) this.field4082 <= this.field4081 + (long) this.field4085) {
            var3 = this.field4075 + (long) this.field4082;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field4080, (int) (var1 - this.field4081), this.field4086, (int) (var1 - this.field4075), var5);
        }
        this.field4081 = -1L;
        this.field4085 = 0;
    }
}
