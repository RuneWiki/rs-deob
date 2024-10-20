package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("hg")
public class class218 {

    @ObfuscatedName("hg.q")
    public class217 field3065;

    @ObfuscatedName("hg.s")
    public byte[] field3062;

    @ObfuscatedName("hg.h")
    public long field3064 = -1L;

    @ObfuscatedName("hg.e")
    public int field3066;

    @ObfuscatedName("hg.n")
    public byte[] field3070;

    @ObfuscatedName("hg.t")
    public long field3067 = -1L;

    @ObfuscatedName("hg.l")
    public int field3068 = 0;

    @ObfuscatedName("hg.m")
    public long field3069;

    @ObfuscatedName("hg.o")
    public long field3072;

    @ObfuscatedName("hg.k")
    public long field3071;

    @ObfuscatedName("hg.p")
    public long field3063;

    public class218(class217 arg0, int arg1, int arg2) throws IOException {
        this.field3065 = arg0;
        this.field3071 = this.field3072 = arg0.method3585();
        this.field3062 = new byte[arg1];
        this.field3070 = new byte[arg2];
        this.field3069 = 0L;
    }

    @ObfuscatedName("hg.q(I)V")
    public void method3620() throws IOException {
        this.method3628();
        this.field3065.method3584();
    }

    @ObfuscatedName("hg.s(J)V")
    public void method3602(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field3069 = arg0;
    }

    @ObfuscatedName("hg.h(B)J")
    public long method3601() {
        return this.field3071;
    }

    @ObfuscatedName("hg.e([BB)V")
    public void method3604(byte[] arg0) throws IOException {
        this.method3605(arg0, 0, arg0.length);
    }

    @ObfuscatedName("hg.n([BIII)V")
    public void method3605(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field3067 != -1L && this.field3069 >= this.field3067 && this.field3069 + (long) arg2 <= this.field3067 + (long) this.field3068) {
                System.arraycopy(this.field3070, (int) (this.field3069 - this.field3067), arg0, arg1, arg2);
                this.field3069 += (long) arg2;
                return;
            }
            long var4 = this.field3069;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field3069 >= this.field3064 && this.field3069 < this.field3064 + (long) this.field3066) {
                int var8 = (int) ((long) this.field3066 - (this.field3069 - this.field3064));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field3062, (int) (this.field3069 - this.field3064), arg0, arg1, var8);
                this.field3069 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field3062.length) {
                this.field3065.method3581(this.field3069);
                this.field3063 = this.field3069;
                while (arg2 > 0) {
                    int var9 = this.field3065.method3597(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field3063 += (long) var9;
                    this.field3069 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method3606();
                int var10 = arg2;
                if (arg2 > this.field3066) {
                    var10 = this.field3066;
                }
                System.arraycopy(this.field3062, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field3069 += (long) var10;
            }
            if (this.field3067 != -1L) {
                if (this.field3067 > this.field3069 && arg2 > 0) {
                    int var11 = (int) (this.field3067 - this.field3069) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field3069++;
                    }
                }
                long var12 = -1L;
                long var14 = -1L;
                if (this.field3067 >= var4 && this.field3067 < (long) var7 + var4) {
                    var12 = this.field3067;
                } else if (var4 >= this.field3067 && var4 < this.field3067 + (long) this.field3068) {
                    var12 = var4;
                }
                if (this.field3067 + (long) this.field3068 > var4 && this.field3067 + (long) this.field3068 <= (long) var7 + var4) {
                    var14 = this.field3067 + (long) this.field3068;
                } else if ((long) var7 + var4 > this.field3067 && (long) var7 + var4 <= this.field3067 + (long) this.field3068) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field3070, (int) (var12 - this.field3067), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field3069) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field3069));
                        this.field3069 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field3063 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("hg.t(I)V")
    public void method3606() throws IOException {
        this.field3066 = 0;
        if (this.field3069 != this.field3063) {
            this.field3065.method3581(this.field3069);
            this.field3063 = this.field3069;
        }
        this.field3064 = this.field3069;
        while (this.field3066 < this.field3062.length) {
            int var1 = this.field3065.method3597(this.field3062, this.field3066, this.field3062.length - this.field3066);
            if (var1 == -1) {
                break;
            }
            this.field3063 += (long) var1;
            this.field3066 += var1;
        }
    }

    @ObfuscatedName("hg.l([BIIB)V")
    public void method3608(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field3069 + (long) arg2 > this.field3071) {
                this.field3071 = this.field3069 + (long) arg2;
            }
            if (this.field3067 != -1L && (this.field3069 < this.field3067 || this.field3069 > this.field3067 + (long) this.field3068)) {
                this.method3628();
            }
            if (this.field3067 != -1L && this.field3069 + (long) arg2 > this.field3067 + (long) this.field3070.length) {
                int var4 = (int) ((long) this.field3070.length - (this.field3069 - this.field3067));
                System.arraycopy(arg0, arg1, this.field3070, (int) (this.field3069 - this.field3067), var4);
                this.field3069 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field3068 = this.field3070.length;
                this.method3628();
            }
            if (arg2 > this.field3070.length) {
                if (this.field3069 != this.field3063) {
                    this.field3065.method3581(this.field3069);
                    this.field3063 = this.field3069;
                }
                this.field3065.method3596(arg0, arg1, arg2);
                this.field3063 += (long) arg2;
                if (this.field3063 > this.field3072) {
                    this.field3072 = this.field3063;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field3069 >= this.field3064 && this.field3069 < this.field3064 + (long) this.field3066) {
                    var5 = this.field3069;
                } else if (this.field3064 >= this.field3069 && this.field3064 < this.field3069 + (long) arg2) {
                    var5 = this.field3064;
                }
                if (this.field3069 + (long) arg2 > this.field3064 && this.field3069 + (long) arg2 <= this.field3064 + (long) this.field3066) {
                    var7 = this.field3069 + (long) arg2;
                } else if (this.field3064 + (long) this.field3066 > this.field3069 && this.field3064 + (long) this.field3066 <= this.field3069 + (long) arg2) {
                    var7 = this.field3064 + (long) this.field3066;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field3069), this.field3062, (int) (var5 - this.field3064), var9);
                }
                this.field3069 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field3067 == -1L) {
                    this.field3067 = this.field3069;
                }
                System.arraycopy(arg0, arg1, this.field3070, (int) (this.field3069 - this.field3067), arg2);
                this.field3069 += (long) arg2;
                if (this.field3069 - this.field3067 > (long) this.field3068) {
                    this.field3068 = (int) (this.field3069 - this.field3067);
                }
            }
        } catch (IOException var11) {
            this.field3063 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("hg.m(B)V")
    public void method3628() throws IOException {
        if (this.field3067 == -1L) {
            return;
        }
        if (this.field3067 != this.field3063) {
            this.field3065.method3581(this.field3067);
            this.field3063 = this.field3067;
        }
        this.field3065.method3596(this.field3070, 0, this.field3068);
        this.field3063 += (long) (this.field3068 * 143922195) * 557766171L;
        if (this.field3063 > this.field3072) {
            this.field3072 = this.field3063;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field3067 >= this.field3064 && this.field3067 < this.field3064 + (long) this.field3066) {
            var1 = this.field3067;
        } else if (this.field3064 >= this.field3067 && this.field3064 < this.field3067 + (long) this.field3068) {
            var1 = this.field3064;
        }
        if (this.field3067 + (long) this.field3068 > this.field3064 && this.field3067 + (long) this.field3068 <= this.field3064 + (long) this.field3066) {
            var3 = this.field3067 + (long) this.field3068;
        } else if (this.field3064 + (long) this.field3066 > this.field3067 && this.field3064 + (long) this.field3066 <= this.field3067 + (long) this.field3068) {
            var3 = this.field3064 + (long) this.field3066;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field3070, (int) (var1 - this.field3067), this.field3062, (int) (var1 - this.field3064), var5);
        }
        this.field3067 = -1L;
        this.field3068 = 0;
    }
}
