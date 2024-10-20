package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("mz")
public class class352 {

    @ObfuscatedName("mz.k")
    public class353 field4075;

    @ObfuscatedName("mz.s")
    public byte[] field4077;

    @ObfuscatedName("mz.t")
    public long field4076 = -1L;

    @ObfuscatedName("mz.i")
    public int field4079;

    @ObfuscatedName("mz.o")
    public byte[] field4080;

    @ObfuscatedName("mz.x")
    public long field4081 = -1L;

    @ObfuscatedName("mz.w")
    public int field4084 = 0;

    @ObfuscatedName("mz.g")
    public long field4083;

    @ObfuscatedName("mz.m")
    public long field4086;

    @ObfuscatedName("mz.n")
    public long field4085;

    @ObfuscatedName("mz.d")
    public long field4078;

    public class352(class353 arg0, int arg1, int arg2) throws IOException {
        this.field4075 = arg0;
        this.field4085 = this.field4086 = arg0.method6206();
        this.field4077 = new byte[arg1];
        this.field4080 = new byte[arg2];
        this.field4083 = 0L;
    }

    @ObfuscatedName("mz.z(B)V")
    public void method6163() throws IOException {
        this.method6170();
        this.field4075.method6189();
    }

    @ObfuscatedName("mz.k(J)V")
    public void method6164(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field4083 = arg0;
    }

    @ObfuscatedName("mz.s(I)J")
    public long method6165() {
        return this.field4085;
    }

    @ObfuscatedName("mz.t([BI)V")
    public void method6166(byte[] arg0) throws IOException {
        this.method6167(arg0, 0, arg0.length);
    }

    @ObfuscatedName("mz.i([BIII)V")
    public void method6167(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field4081 != -1L && this.field4083 >= this.field4081 && this.field4083 + (long) arg2 <= this.field4081 + (long) this.field4084) {
                System.arraycopy(this.field4080, (int) (this.field4083 - this.field4081), arg0, arg1, arg2);
                this.field4083 += (long) arg2;
                return;
            }
            long var4 = this.field4083;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field4083 >= this.field4076 && this.field4083 < this.field4076 + (long) this.field4079) {
                int var8 = (int) ((long) this.field4079 - (this.field4083 - this.field4076));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field4077, (int) (this.field4083 - this.field4076), arg0, arg1, var8);
                this.field4083 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field4077.length) {
                this.field4075.method6190(this.field4083);
                this.field4078 = this.field4083;
                while (arg2 > 0) {
                    int var9 = this.field4075.method6194(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field4078 += (long) var9;
                    this.field4083 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method6183();
                int var10 = arg2;
                if (arg2 > this.field4079) {
                    var10 = this.field4079;
                }
                System.arraycopy(this.field4077, 0, arg0, arg1, var10);
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
                } else if (var4 >= this.field4081 && var4 < this.field4081 + (long) this.field4084) {
                    var12 = var4;
                }
                if (this.field4081 + (long) this.field4084 > var4 && this.field4081 + (long) this.field4084 <= (long) var7 + var4) {
                    var14 = this.field4081 + (long) this.field4084;
                } else if ((long) var7 + var4 > this.field4081 && (long) var7 + var4 <= this.field4081 + (long) this.field4084) {
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
            this.field4078 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("mz.o(I)V")
    public void method6183() throws IOException {
        this.field4079 = 0;
        if (this.field4083 != this.field4078) {
            this.field4075.method6190(this.field4083);
            this.field4078 = this.field4083;
        }
        this.field4076 = this.field4083;
        while (this.field4079 < this.field4077.length) {
            int var1 = this.field4077.length - this.field4079;
            if (var1 > 200000000) {
                var1 = 200000000;
            }
            int var2 = this.field4075.method6194(this.field4077, this.field4079, var1);
            if (var2 == -1) {
                break;
            }
            this.field4078 += (long) var2;
            this.field4079 += var2;
        }
    }

    @ObfuscatedName("mz.x([BIII)V")
    public void method6169(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field4083 + (long) arg2 > this.field4085) {
                this.field4085 = this.field4083 + (long) arg2;
            }
            if (this.field4081 != -1L && (this.field4083 < this.field4081 || this.field4083 > this.field4081 + (long) this.field4084)) {
                this.method6170();
            }
            if (this.field4081 != -1L && this.field4083 + (long) arg2 > this.field4081 + (long) this.field4080.length) {
                int var4 = (int) ((long) this.field4080.length - (this.field4083 - this.field4081));
                System.arraycopy(arg0, arg1, this.field4080, (int) (this.field4083 - this.field4081), var4);
                this.field4083 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field4084 = this.field4080.length;
                this.method6170();
            }
            if (arg2 > this.field4080.length) {
                if (this.field4083 != this.field4078) {
                    this.field4075.method6190(this.field4083);
                    this.field4078 = this.field4083;
                }
                this.field4075.method6191(arg0, arg1, arg2);
                this.field4078 += (long) arg2;
                if (this.field4078 > this.field4086) {
                    this.field4086 = this.field4078;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field4083 >= this.field4076 && this.field4083 < this.field4076 + (long) this.field4079) {
                    var5 = this.field4083;
                } else if (this.field4076 >= this.field4083 && this.field4076 < this.field4083 + (long) arg2) {
                    var5 = this.field4076;
                }
                if (this.field4083 + (long) arg2 > this.field4076 && this.field4083 + (long) arg2 <= this.field4076 + (long) this.field4079) {
                    var7 = this.field4083 + (long) arg2;
                } else if (this.field4076 + (long) this.field4079 > this.field4083 && this.field4076 + (long) this.field4079 <= this.field4083 + (long) arg2) {
                    var7 = this.field4076 + (long) this.field4079;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field4083), this.field4077, (int) (var5 - this.field4076), var9);
                }
                this.field4083 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field4081 == -1L) {
                    this.field4081 = this.field4083;
                }
                System.arraycopy(arg0, arg1, this.field4080, (int) (this.field4083 - this.field4081), arg2);
                this.field4083 += (long) arg2;
                if (this.field4083 - this.field4081 > (long) this.field4084) {
                    this.field4084 = (int) (this.field4083 - this.field4081);
                }
            }
        } catch (IOException var11) {
            this.field4078 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("mz.w(I)V")
    public void method6170() throws IOException {
        if (this.field4081 == -1L) {
            return;
        }
        if (this.field4081 != this.field4078) {
            this.field4075.method6190(this.field4081);
            this.field4078 = this.field4081;
        }
        this.field4075.method6191(this.field4080, 0, this.field4084);
        this.field4078 += (long) (this.field4084 * -374231965) * -44681909L;
        if (this.field4078 > this.field4086) {
            this.field4086 = this.field4078;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field4081 >= this.field4076 && this.field4081 < this.field4076 + (long) this.field4079) {
            var1 = this.field4081;
        } else if (this.field4076 >= this.field4081 && this.field4076 < this.field4081 + (long) this.field4084) {
            var1 = this.field4076;
        }
        if (this.field4081 + (long) this.field4084 > this.field4076 && this.field4081 + (long) this.field4084 <= this.field4076 + (long) this.field4079) {
            var3 = this.field4081 + (long) this.field4084;
        } else if (this.field4076 + (long) this.field4079 > this.field4081 && this.field4076 + (long) this.field4079 <= this.field4081 + (long) this.field4084) {
            var3 = this.field4076 + (long) this.field4079;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field4080, (int) (var1 - this.field4081), this.field4077, (int) (var1 - this.field4076), var5);
        }
        this.field4081 = -1L;
        this.field4084 = 0;
    }
}
