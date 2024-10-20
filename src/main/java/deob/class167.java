package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("ax")
public class class167 {

    @ObfuscatedName("ax.f")
    public long field2552;

    @ObfuscatedName("ax.g")
    public long field2561;

    @ObfuscatedName("ax.e")
    public long field2560;

    @ObfuscatedName("ax.n")
    public int field2558 = 0;

    @ObfuscatedName("ax.o")
    public long field2554 = -1L;

    @ObfuscatedName("ax.j")
    public class170 field2563;

    @ObfuscatedName("ax.h")
    public byte[] field2556;

    @ObfuscatedName("ax.t")
    public int field2555;

    @ObfuscatedName("ax.r")
    public long field2557 = -1L;

    @ObfuscatedName("ax.p")
    public byte[] field2564;

    @ObfuscatedName("ax.x")
    public long field2562;

    @ObfuscatedName("ax.r(I)V")
    public void method3212() throws IOException {
        this.field2555 = 0;
        if (this.field2562 != this.field2561) {
            this.field2563.method3261(this.field2561);
            this.field2562 = this.field2561;
        }
        this.field2554 = this.field2561;
        while (this.field2555 < this.field2564.length) {
            int var1 = this.field2563.method3265(this.field2564, this.field2555, this.field2564.length - this.field2555);
            if (var1 == -1) {
                break;
            }
            this.field2562 += (long) var1;
            this.field2555 += var1;
        }
    }

    @ObfuscatedName("ax.j(I)V")
    public void method3213() throws IOException {
        this.method3220();
        this.field2563.method3278();
    }

    @ObfuscatedName("ax.o(I)J")
    public long method3215() {
        return this.field2552;
    }

    @ObfuscatedName("ax.h([BIIB)V")
    public void method3217(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field2557 != -1L && this.field2561 >= this.field2557 && this.field2561 + (long) arg2 <= this.field2557 + (long) this.field2558) {
                System.arraycopy(this.field2556, (int) (this.field2561 - this.field2557), arg0, arg1, arg2);
                this.field2561 += (long) arg2;
                return;
            }
            long var4 = this.field2561;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field2561 >= this.field2554 && this.field2561 < this.field2554 + (long) this.field2555) {
                int var8 = (int) ((long) this.field2555 - (this.field2561 - this.field2554));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field2564, (int) (this.field2561 - this.field2554), arg0, arg1, var8);
                this.field2561 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field2564.length) {
                this.field2563.method3261(this.field2561);
                this.field2562 = this.field2561;
                while (arg2 > 0) {
                    int var9 = this.field2563.method3265(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field2562 += (long) var9;
                    this.field2561 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method3212();
                int var10 = arg2;
                if (arg2 > this.field2555) {
                    var10 = this.field2555;
                }
                System.arraycopy(this.field2564, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field2561 += (long) var10;
            }
            if (this.field2557 != -1L) {
                if (this.field2557 > this.field2561 && arg2 > 0) {
                    int var11 = (int) (this.field2557 - this.field2561) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field2561++;
                    }
                }
                long var12 = -1L;
                long var14 = -1L;
                if (this.field2557 >= var4 && this.field2557 < (long) var7 + var4) {
                    var12 = this.field2557;
                } else if (var4 >= this.field2557 && var4 < this.field2557 + (long) this.field2558) {
                    var12 = var4;
                }
                if (this.field2557 + (long) this.field2558 > var4 && this.field2557 + (long) this.field2558 <= (long) var7 + var4) {
                    var14 = this.field2557 + (long) this.field2558;
                } else if ((long) var7 + var4 > this.field2557 && (long) var7 + var4 <= this.field2557 + (long) this.field2558) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field2556, (int) (var12 - this.field2557), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field2561) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field2561));
                        this.field2561 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field2562 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("ax.n([BIII)V")
    public void method3219(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field2561 + (long) arg2 > this.field2552) {
                this.field2552 = this.field2561 + (long) arg2;
            }
            if (this.field2557 != -1L && (this.field2561 < this.field2557 || this.field2561 > this.field2557 + (long) this.field2558)) {
                this.method3220();
            }
            if (this.field2557 != -1L && this.field2561 + (long) arg2 > this.field2557 + (long) this.field2556.length) {
                int var4 = (int) ((long) this.field2556.length - (this.field2561 - this.field2557));
                System.arraycopy(arg0, arg1, this.field2556, (int) (this.field2561 - this.field2557), var4);
                this.field2561 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field2558 = this.field2556.length;
                this.method3220();
            }
            if (arg2 > this.field2556.length) {
                if (this.field2562 != this.field2561) {
                    this.field2563.method3261(this.field2561);
                    this.field2562 = this.field2561;
                }
                this.field2563.method3262(arg0, arg1, arg2);
                this.field2562 += (long) arg2;
                if (this.field2562 > this.field2560) {
                    this.field2560 = this.field2562;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field2561 >= this.field2554 && this.field2561 < this.field2554 + (long) this.field2555) {
                    var5 = this.field2561;
                } else if (this.field2554 >= this.field2561 && this.field2554 < this.field2561 + (long) arg2) {
                    var5 = this.field2554;
                }
                if (this.field2561 + (long) arg2 > this.field2554 && this.field2561 + (long) arg2 <= this.field2554 + (long) this.field2555) {
                    var7 = this.field2561 + (long) arg2;
                } else if (this.field2554 + (long) this.field2555 > this.field2561 && this.field2554 + (long) this.field2555 <= this.field2561 + (long) arg2) {
                    var7 = this.field2554 + (long) this.field2555;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field2561), this.field2564, (int) (var5 - this.field2554), var9);
                }
                this.field2561 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field2557 == -1L) {
                    this.field2557 = this.field2561;
                }
                System.arraycopy(arg0, arg1, this.field2556, (int) (this.field2561 - this.field2557), arg2);
                this.field2561 += (long) arg2;
                if (this.field2561 - this.field2557 > (long) this.field2558) {
                    this.field2558 = (int) (this.field2561 - this.field2557);
                }
            }
        } catch (IOException var11) {
            this.field2562 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("ax.g(I)V")
    public void method3220() throws IOException {
        if (this.field2557 == -1L) {
            return;
        }
        if (this.field2562 != this.field2557) {
            this.field2563.method3261(this.field2557);
            this.field2562 = this.field2557;
        }
        this.field2563.method3262(this.field2556, 0, this.field2558);
        this.field2562 += (long) (this.field2558 * 2021261091) * 2069309579L;
        if (this.field2562 > this.field2560) {
            this.field2560 = this.field2562;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field2557 >= this.field2554 && this.field2557 < this.field2554 + (long) this.field2555) {
            var1 = this.field2557;
        } else if (this.field2554 >= this.field2557 && this.field2554 < this.field2557 + (long) this.field2558) {
            var1 = this.field2554;
        }
        if (this.field2557 + (long) this.field2558 > this.field2554 && this.field2557 + (long) this.field2558 <= this.field2554 + (long) this.field2555) {
            var3 = this.field2557 + (long) this.field2558;
        } else if (this.field2554 + (long) this.field2555 > this.field2557 && this.field2554 + (long) this.field2555 <= this.field2557 + (long) this.field2558) {
            var3 = this.field2554 + (long) this.field2555;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field2556, (int) (var1 - this.field2557), this.field2564, (int) (var1 - this.field2554), var5);
        }
        this.field2557 = -1L;
        this.field2558 = 0;
    }

    @ObfuscatedName("ax.p(J)V")
    public void method3222(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field2561 = arg0;
    }

    @ObfuscatedName("ax.t([BI)V")
    public void method3229(byte[] arg0) throws IOException {
        this.method3217(arg0, 0, arg0.length);
    }

    public class167(class170 arg0, int arg1, int arg2) throws IOException {
        this.field2563 = arg0;
        this.field2552 = this.field2560 = arg0.method3260();
        this.field2564 = new byte[arg1];
        this.field2556 = new byte[arg2];
        this.field2561 = 0L;
    }
}
