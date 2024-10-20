package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("me")
public class class343 {

    @ObfuscatedName("me.t")
    public class344 field4052;

    @ObfuscatedName("me.o")
    public byte[] field4053;

    @ObfuscatedName("me.e")
    public long field4061 = -1L;

    @ObfuscatedName("me.i")
    public int field4062;

    @ObfuscatedName("me.g")
    public byte[] field4056;

    @ObfuscatedName("me.d")
    public long field4057 = -1L;

    @ObfuscatedName("me.l")
    public int field4063 = 0;

    @ObfuscatedName("me.j")
    public long field4059;

    @ObfuscatedName("me.m")
    public long field4060;

    @ObfuscatedName("me.p")
    public long field4058;

    @ObfuscatedName("me.h")
    public long field4051;

    public class343(class344 arg0, int arg1, int arg2) throws IOException {
        this.field4052 = arg0;
        this.field4058 = this.field4060 = arg0.method6131();
        this.field4053 = new byte[arg1];
        this.field4056 = new byte[arg2];
        this.field4059 = 0L;
    }

    @ObfuscatedName("me.c(I)V")
    public void method6102() throws IOException {
        this.method6115();
        this.field4052.method6129();
    }

    @ObfuscatedName("me.t(J)V")
    public void method6114(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field4059 = arg0;
    }

    @ObfuscatedName("me.o(B)J")
    public long method6103() {
        return this.field4058;
    }

    @ObfuscatedName("me.e([BI)V")
    public void method6101(byte[] arg0) throws IOException {
        this.method6105(arg0, 0, arg0.length);
    }

    @ObfuscatedName("me.i([BIIB)V")
    public void method6105(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field4057 != -1L && this.field4059 >= this.field4057 && this.field4059 + (long) arg2 <= this.field4057 + (long) this.field4063) {
                System.arraycopy(this.field4056, (int) (this.field4059 - this.field4057), arg0, arg1, arg2);
                this.field4059 += (long) arg2;
                return;
            }
            long var4 = this.field4059;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field4059 >= this.field4061 && this.field4059 < this.field4061 + (long) this.field4062) {
                int var8 = (int) ((long) this.field4062 - (this.field4059 - this.field4061));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field4053, (int) (this.field4059 - this.field4061), arg0, arg1, var8);
                this.field4059 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field4053.length) {
                this.field4052.method6127(this.field4059);
                this.field4051 = this.field4059;
                while (arg2 > 0) {
                    int var9 = this.field4052.method6132(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field4051 += (long) var9;
                    this.field4059 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method6108();
                int var10 = arg2;
                if (arg2 > this.field4062) {
                    var10 = this.field4062;
                }
                System.arraycopy(this.field4053, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field4059 += (long) var10;
            }
            if (this.field4057 != -1L) {
                if (this.field4057 > this.field4059 && arg2 > 0) {
                    int var11 = (int) (this.field4057 - this.field4059) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field4059++;
                    }
                }
                long var12 = -1L;
                long var14 = -1L;
                if (this.field4057 >= var4 && this.field4057 < (long) var7 + var4) {
                    var12 = this.field4057;
                } else if (var4 >= this.field4057 && var4 < this.field4057 + (long) this.field4063) {
                    var12 = var4;
                }
                if (this.field4057 + (long) this.field4063 > var4 && this.field4057 + (long) this.field4063 <= (long) var7 + var4) {
                    var14 = this.field4057 + (long) this.field4063;
                } else if ((long) var7 + var4 > this.field4057 && (long) var7 + var4 <= this.field4057 + (long) this.field4063) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field4056, (int) (var12 - this.field4057), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field4059) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field4059));
                        this.field4059 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field4051 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("me.g(I)V")
    public void method6108() throws IOException {
        this.field4062 = 0;
        if (this.field4059 != this.field4051) {
            this.field4052.method6127(this.field4059);
            this.field4051 = this.field4059;
        }
        this.field4061 = this.field4059;
        while (this.field4062 < this.field4053.length) {
            int var1 = this.field4053.length - this.field4062;
            if (var1 > 200000000) {
                var1 = 200000000;
            }
            int var2 = this.field4052.method6132(this.field4053, this.field4062, var1);
            if (var2 == -1) {
                break;
            }
            this.field4051 += (long) var2;
            this.field4062 += var2;
        }
    }

    @ObfuscatedName("me.d([BIII)V")
    public void method6100(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field4059 + (long) arg2 > this.field4058) {
                this.field4058 = this.field4059 + (long) arg2;
            }
            if (this.field4057 != -1L && (this.field4059 < this.field4057 || this.field4059 > this.field4057 + (long) this.field4063)) {
                this.method6115();
            }
            if (this.field4057 != -1L && this.field4059 + (long) arg2 > this.field4057 + (long) this.field4056.length) {
                int var4 = (int) ((long) this.field4056.length - (this.field4059 - this.field4057));
                System.arraycopy(arg0, arg1, this.field4056, (int) (this.field4059 - this.field4057), var4);
                this.field4059 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field4063 = this.field4056.length;
                this.method6115();
            }
            if (arg2 > this.field4056.length) {
                if (this.field4059 != this.field4051) {
                    this.field4052.method6127(this.field4059);
                    this.field4051 = this.field4059;
                }
                this.field4052.method6128(arg0, arg1, arg2);
                this.field4051 += (long) arg2;
                if (this.field4051 > this.field4060) {
                    this.field4060 = this.field4051;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field4059 >= this.field4061 && this.field4059 < this.field4061 + (long) this.field4062) {
                    var5 = this.field4059;
                } else if (this.field4061 >= this.field4059 && this.field4061 < this.field4059 + (long) arg2) {
                    var5 = this.field4061;
                }
                if (this.field4059 + (long) arg2 > this.field4061 && this.field4059 + (long) arg2 <= this.field4061 + (long) this.field4062) {
                    var7 = this.field4059 + (long) arg2;
                } else if (this.field4061 + (long) this.field4062 > this.field4059 && this.field4061 + (long) this.field4062 <= this.field4059 + (long) arg2) {
                    var7 = this.field4061 + (long) this.field4062;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field4059), this.field4053, (int) (var5 - this.field4061), var9);
                }
                this.field4059 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field4057 == -1L) {
                    this.field4057 = this.field4059;
                }
                System.arraycopy(arg0, arg1, this.field4056, (int) (this.field4059 - this.field4057), arg2);
                this.field4059 += (long) arg2;
                if (this.field4059 - this.field4057 > (long) this.field4063) {
                    this.field4063 = (int) (this.field4059 - this.field4057);
                }
            }
        } catch (IOException var11) {
            this.field4051 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("me.l(B)V")
    public void method6115() throws IOException {
        if (this.field4057 == -1L) {
            return;
        }
        if (this.field4057 != this.field4051) {
            this.field4052.method6127(this.field4057);
            this.field4051 = this.field4057;
        }
        this.field4052.method6128(this.field4056, 0, this.field4063);
        this.field4051 += (long) (this.field4063 * -2104387715) * -477832747L;
        if (this.field4051 > this.field4060) {
            this.field4060 = this.field4051;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field4057 >= this.field4061 && this.field4057 < this.field4061 + (long) this.field4062) {
            var1 = this.field4057;
        } else if (this.field4061 >= this.field4057 && this.field4061 < this.field4057 + (long) this.field4063) {
            var1 = this.field4061;
        }
        if (this.field4057 + (long) this.field4063 > this.field4061 && this.field4057 + (long) this.field4063 <= this.field4061 + (long) this.field4062) {
            var3 = this.field4057 + (long) this.field4063;
        } else if (this.field4061 + (long) this.field4062 > this.field4057 && this.field4061 + (long) this.field4062 <= this.field4057 + (long) this.field4063) {
            var3 = this.field4061 + (long) this.field4062;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field4056, (int) (var1 - this.field4057), this.field4053, (int) (var1 - this.field4061), var5);
        }
        this.field4057 = -1L;
        this.field4063 = 0;
    }
}
