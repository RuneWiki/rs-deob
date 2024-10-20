package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("as")
public class class30 {

    @ObfuscatedName("as.a")
    public class29 field747;

    @ObfuscatedName("as.r")
    public byte[] field755;

    @ObfuscatedName("as.u")
    public long field741 = -1L;

    @ObfuscatedName("as.t")
    public int field742;

    @ObfuscatedName("as.k")
    public byte[] field752;

    @ObfuscatedName("as.x")
    public long field744 = -1L;

    @ObfuscatedName("as.v")
    public int field745 = 0;

    @ObfuscatedName("as.g")
    public long field746;

    @ObfuscatedName("as.n")
    public long field748;

    @ObfuscatedName("as.q")
    public long field740;

    @ObfuscatedName("as.i")
    public long field749;

    public class30(class29 arg0, int arg1, int arg2) throws IOException {
        this.field747 = arg0;
        this.field740 = this.field748 = arg0.method527();
        this.field755 = new byte[arg1];
        this.field752 = new byte[arg2];
        this.field746 = 0L;
    }

    @ObfuscatedName("as.a(B)V")
    public void method531() throws IOException {
        this.method537();
        this.field747.method514();
    }

    @ObfuscatedName("as.r(J)V")
    public void method548(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field746 = arg0;
    }

    @ObfuscatedName("as.u(B)J")
    public long method533() {
        return this.field740;
    }

    @ObfuscatedName("as.t([BI)V")
    public void method534(byte[] arg0) throws IOException {
        this.method535(arg0, 0, arg0.length);
    }

    @ObfuscatedName("as.k([BIIB)V")
    public void method535(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field744 != -1L && this.field746 >= this.field744 && this.field746 + (long) arg2 <= this.field744 + (long) this.field745) {
                System.arraycopy(this.field752, (int) (this.field746 - this.field744), arg0, arg1, arg2);
                this.field746 += (long) arg2;
                return;
            }
            long var4 = this.field746;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field746 >= this.field741 && this.field746 < this.field741 + (long) this.field742) {
                int var8 = (int) ((long) this.field742 - (this.field746 - this.field741));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field755, (int) (this.field746 - this.field741), arg0, arg1, var8);
                this.field746 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field755.length) {
                this.field747.method516(this.field746);
                this.field749 = this.field746;
                while (arg2 > 0) {
                    int var9 = this.field747.method512(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field749 += (long) var9;
                    this.field746 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method540();
                int var10 = arg2;
                if (arg2 > this.field742) {
                    var10 = this.field742;
                }
                System.arraycopy(this.field755, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field746 += (long) var10;
            }
            if (this.field744 != -1L) {
                if (this.field744 > this.field746 && arg2 > 0) {
                    int var11 = (int) (this.field744 - this.field746) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field746++;
                    }
                }
                long var12 = -1L;
                long var14 = -1L;
                if (this.field744 >= var4 && this.field744 < (long) var7 + var4) {
                    var12 = this.field744;
                } else if (var4 >= this.field744 && var4 < this.field744 + (long) this.field745) {
                    var12 = var4;
                }
                if (this.field744 + (long) this.field745 > var4 && this.field744 + (long) this.field745 <= (long) var7 + var4) {
                    var14 = this.field744 + (long) this.field745;
                } else if ((long) var7 + var4 > this.field744 && (long) var7 + var4 <= this.field744 + (long) this.field745) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field752, (int) (var12 - this.field744), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field746) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field746));
                        this.field746 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field749 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("as.x(I)V")
    public void method540() throws IOException {
        this.field742 = 0;
        if (this.field749 != this.field746) {
            this.field747.method516(this.field746);
            this.field749 = this.field746;
        }
        this.field741 = this.field746;
        while (this.field742 < this.field755.length) {
            int var1 = this.field747.method512(this.field755, this.field742, this.field755.length - this.field742);
            if (var1 == -1) {
                break;
            }
            this.field749 += (long) var1;
            this.field742 += var1;
        }
    }

    @ObfuscatedName("as.v([BIII)V")
    public void method536(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field746 + (long) arg2 > this.field740) {
                this.field740 = this.field746 + (long) arg2;
            }
            if (this.field744 != -1L && (this.field746 < this.field744 || this.field746 > this.field744 + (long) this.field745)) {
                this.method537();
            }
            if (this.field744 != -1L && this.field746 + (long) arg2 > this.field744 + (long) this.field752.length) {
                int var4 = (int) ((long) this.field752.length - (this.field746 - this.field744));
                System.arraycopy(arg0, arg1, this.field752, (int) (this.field746 - this.field744), var4);
                this.field746 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field745 = this.field752.length;
                this.method537();
            }
            if (arg2 > this.field752.length) {
                if (this.field749 != this.field746) {
                    this.field747.method516(this.field746);
                    this.field749 = this.field746;
                }
                this.field747.method509(arg0, arg1, arg2);
                this.field749 += (long) arg2;
                if (this.field749 > this.field748) {
                    this.field748 = this.field749;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field746 >= this.field741 && this.field746 < this.field741 + (long) this.field742) {
                    var5 = this.field746;
                } else if (this.field741 >= this.field746 && this.field741 < this.field746 + (long) arg2) {
                    var5 = this.field741;
                }
                if (this.field746 + (long) arg2 > this.field741 && this.field746 + (long) arg2 <= this.field741 + (long) this.field742) {
                    var7 = this.field746 + (long) arg2;
                } else if (this.field741 + (long) this.field742 > this.field746 && this.field741 + (long) this.field742 <= this.field746 + (long) arg2) {
                    var7 = this.field741 + (long) this.field742;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field746), this.field755, (int) (var5 - this.field741), var9);
                }
                this.field746 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field744 == -1L) {
                    this.field744 = this.field746;
                }
                System.arraycopy(arg0, arg1, this.field752, (int) (this.field746 - this.field744), arg2);
                this.field746 += (long) arg2;
                if (this.field746 - this.field744 > (long) this.field745) {
                    this.field745 = (int) (this.field746 - this.field744);
                }
            }
        } catch (IOException var11) {
            this.field749 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("as.g(I)V")
    public void method537() throws IOException {
        if (this.field744 == -1L) {
            return;
        }
        if (this.field749 != this.field744) {
            this.field747.method516(this.field744);
            this.field749 = this.field744;
        }
        this.field747.method509(this.field752, 0, this.field745);
        this.field749 += (long) (this.field745 * 2143151961) * -640814871L;
        if (this.field749 > this.field748) {
            this.field748 = this.field749;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field744 >= this.field741 && this.field744 < this.field741 + (long) this.field742) {
            var1 = this.field744;
        } else if (this.field741 >= this.field744 && this.field741 < this.field744 + (long) this.field745) {
            var1 = this.field741;
        }
        if (this.field744 + (long) this.field745 > this.field741 && this.field744 + (long) this.field745 <= this.field741 + (long) this.field742) {
            var3 = this.field744 + (long) this.field745;
        } else if (this.field741 + (long) this.field742 > this.field744 && this.field741 + (long) this.field742 <= this.field744 + (long) this.field745) {
            var3 = this.field741 + (long) this.field742;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field752, (int) (var1 - this.field744), this.field755, (int) (var1 - this.field741), var5);
        }
        this.field744 = -1L;
        this.field745 = 0;
    }
}
