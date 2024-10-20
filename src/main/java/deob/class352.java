package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("mn")
public class class352 {

    @ObfuscatedName("mn.o")
    public class353 field4083;

    @ObfuscatedName("mn.q")
    public byte[] field4075;

    @ObfuscatedName("mn.j")
    public long field4078 = -1L;

    @ObfuscatedName("mn.p")
    public int field4079;

    @ObfuscatedName("mn.g")
    public byte[] field4080;

    @ObfuscatedName("mn.n")
    public long field4086 = -1L;

    @ObfuscatedName("mn.u")
    public int field4082 = 0;

    @ObfuscatedName("mn.a")
    public long field4085;

    @ObfuscatedName("mn.z")
    public long field4084;

    @ObfuscatedName("mn.w")
    public long field4081;

    @ObfuscatedName("mn.y")
    public long field4076;

    public class352(class353 arg0, int arg1, int arg2) throws IOException {
        this.field4083 = arg0;
        this.field4081 = this.field4084 = arg0.method6227();
        this.field4075 = new byte[arg1];
        this.field4080 = new byte[arg2];
        this.field4085 = 0L;
    }

    @ObfuscatedName("mn.m(I)V")
    public void method6197() throws IOException {
        this.method6213();
        this.field4083.method6232();
    }

    @ObfuscatedName("mn.o(J)V")
    public void method6200(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field4085 = arg0;
    }

    @ObfuscatedName("mn.q(I)J")
    public long method6196() {
        return this.field4081;
    }

    @ObfuscatedName("mn.j([BI)V")
    public void method6199(byte[] arg0) throws IOException {
        this.method6222(arg0, 0, arg0.length);
    }

    @ObfuscatedName("mn.p([BIIB)V")
    public void method6222(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field4086 != -1L && this.field4085 >= this.field4086 && this.field4085 + (long) arg2 <= this.field4086 + (long) this.field4082) {
                System.arraycopy(this.field4080, (int) (this.field4085 - this.field4086), arg0, arg1, arg2);
                this.field4085 += (long) arg2;
                return;
            }
            long var4 = this.field4085;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field4085 >= this.field4078 && this.field4085 < this.field4078 + (long) this.field4079) {
                int var8 = (int) ((long) this.field4079 - (this.field4085 - this.field4078));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field4075, (int) (this.field4085 - this.field4078), arg0, arg1, var8);
                this.field4085 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field4075.length) {
                this.field4083.method6235(this.field4085);
                this.field4076 = this.field4085;
                while (arg2 > 0) {
                    int var9 = this.field4083.method6228(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field4076 += (long) var9;
                    this.field4085 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method6193();
                int var10 = arg2;
                if (arg2 > this.field4079) {
                    var10 = this.field4079;
                }
                System.arraycopy(this.field4075, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field4085 += (long) var10;
            }
            if (this.field4086 != -1L) {
                if (this.field4086 > this.field4085 && arg2 > 0) {
                    int var11 = (int) (this.field4086 - this.field4085) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field4085++;
                    }
                }
                long var12 = -1L;
                long var14 = -1L;
                if (this.field4086 >= var4 && this.field4086 < (long) var7 + var4) {
                    var12 = this.field4086;
                } else if (var4 >= this.field4086 && var4 < this.field4086 + (long) this.field4082) {
                    var12 = var4;
                }
                if (this.field4086 + (long) this.field4082 > var4 && this.field4086 + (long) this.field4082 <= (long) var7 + var4) {
                    var14 = this.field4086 + (long) this.field4082;
                } else if ((long) var7 + var4 > this.field4086 && (long) var7 + var4 <= this.field4086 + (long) this.field4082) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field4080, (int) (var12 - this.field4086), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field4085) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field4085));
                        this.field4085 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field4076 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("mn.g(I)V")
    public void method6193() throws IOException {
        this.field4079 = 0;
        if (this.field4085 != this.field4076) {
            this.field4083.method6235(this.field4085);
            this.field4076 = this.field4085;
        }
        this.field4078 = this.field4085;
        while (this.field4079 < this.field4075.length) {
            int var1 = this.field4075.length - this.field4079;
            if (var1 > 200000000) {
                var1 = 200000000;
            }
            int var2 = this.field4083.method6228(this.field4075, this.field4079, var1);
            if (var2 == -1) {
                break;
            }
            this.field4076 += (long) var2;
            this.field4079 += var2;
        }
    }

    @ObfuscatedName("mn.n([BIII)V")
    public void method6198(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field4085 + (long) arg2 > this.field4081) {
                this.field4081 = this.field4085 + (long) arg2;
            }
            if (this.field4086 != -1L && (this.field4085 < this.field4086 || this.field4085 > this.field4086 + (long) this.field4082)) {
                this.method6213();
            }
            if (this.field4086 != -1L && this.field4085 + (long) arg2 > this.field4086 + (long) this.field4080.length) {
                int var4 = (int) ((long) this.field4080.length - (this.field4085 - this.field4086));
                System.arraycopy(arg0, arg1, this.field4080, (int) (this.field4085 - this.field4086), var4);
                this.field4085 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field4082 = this.field4080.length;
                this.method6213();
            }
            if (arg2 > this.field4080.length) {
                if (this.field4085 != this.field4076) {
                    this.field4083.method6235(this.field4085);
                    this.field4076 = this.field4085;
                }
                this.field4083.method6223(arg0, arg1, arg2);
                this.field4076 += (long) arg2;
                if (this.field4076 > this.field4084) {
                    this.field4084 = this.field4076;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field4085 >= this.field4078 && this.field4085 < this.field4078 + (long) this.field4079) {
                    var5 = this.field4085;
                } else if (this.field4078 >= this.field4085 && this.field4078 < this.field4085 + (long) arg2) {
                    var5 = this.field4078;
                }
                if (this.field4085 + (long) arg2 > this.field4078 && this.field4085 + (long) arg2 <= this.field4078 + (long) this.field4079) {
                    var7 = this.field4085 + (long) arg2;
                } else if (this.field4078 + (long) this.field4079 > this.field4085 && this.field4078 + (long) this.field4079 <= this.field4085 + (long) arg2) {
                    var7 = this.field4078 + (long) this.field4079;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field4085), this.field4075, (int) (var5 - this.field4078), var9);
                }
                this.field4085 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field4086 == -1L) {
                    this.field4086 = this.field4085;
                }
                System.arraycopy(arg0, arg1, this.field4080, (int) (this.field4085 - this.field4086), arg2);
                this.field4085 += (long) arg2;
                if (this.field4085 - this.field4086 > (long) this.field4082) {
                    this.field4082 = (int) (this.field4085 - this.field4086);
                }
            }
        } catch (IOException var11) {
            this.field4076 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("mn.u(I)V")
    public void method6213() throws IOException {
        if (this.field4086 == -1L) {
            return;
        }
        if (this.field4086 != this.field4076) {
            this.field4083.method6235(this.field4086);
            this.field4076 = this.field4086;
        }
        this.field4083.method6223(this.field4080, 0, this.field4082);
        this.field4076 += (long) (this.field4082 * -1625503623) * 457646537L;
        if (this.field4076 > this.field4084) {
            this.field4084 = this.field4076;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field4086 >= this.field4078 && this.field4086 < this.field4078 + (long) this.field4079) {
            var1 = this.field4086;
        } else if (this.field4078 >= this.field4086 && this.field4078 < this.field4086 + (long) this.field4082) {
            var1 = this.field4078;
        }
        if (this.field4086 + (long) this.field4082 > this.field4078 && this.field4086 + (long) this.field4082 <= this.field4078 + (long) this.field4079) {
            var3 = this.field4086 + (long) this.field4082;
        } else if (this.field4078 + (long) this.field4079 > this.field4086 && this.field4078 + (long) this.field4079 <= this.field4086 + (long) this.field4082) {
            var3 = this.field4078 + (long) this.field4079;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field4080, (int) (var1 - this.field4086), this.field4075, (int) (var1 - this.field4078), var5);
        }
        this.field4086 = -1L;
        this.field4082 = 0;
    }
}
