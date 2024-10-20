package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("ah")
public class class30 {

    @ObfuscatedName("ah.d")
    public class29 field750;

    @ObfuscatedName("ah.g")
    public byte[] field743;

    @ObfuscatedName("ah.a")
    public long field744 = -1L;

    @ObfuscatedName("ah.t")
    public int field758;

    @ObfuscatedName("ah.f")
    public byte[] field746;

    @ObfuscatedName("ah.c")
    public long field747 = -1L;

    @ObfuscatedName("ah.p")
    public int field753 = 0;

    @ObfuscatedName("ah.s")
    public long field745;

    @ObfuscatedName("ah.k")
    public long field749;

    @ObfuscatedName("ah.m")
    public long field742;

    @ObfuscatedName("ah.y")
    public long field752;

    public class30(class29 arg0, int arg1, int arg2) throws IOException {
        this.field750 = arg0;
        this.field742 = this.field749 = arg0.method535();
        this.field743 = new byte[arg1];
        this.field746 = new byte[arg2];
        this.field745 = 0L;
    }

    @ObfuscatedName("ah.d(B)V")
    public void method554() throws IOException {
        this.method565();
        this.field750.method532();
    }

    @ObfuscatedName("ah.g(J)V")
    public void method555(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field745 = arg0;
    }

    @ObfuscatedName("ah.a(I)J")
    public long method556() {
        return this.field742;
    }

    @ObfuscatedName("ah.t([BI)V")
    public void method557(byte[] arg0) throws IOException {
        this.method562(arg0, 0, arg0.length);
    }

    @ObfuscatedName("ah.f([BIIB)V")
    public void method562(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field747 != -1L && this.field745 >= this.field747 && this.field745 + (long) arg2 <= this.field747 + (long) this.field753) {
                System.arraycopy(this.field746, (int) (this.field745 - this.field747), arg0, arg1, arg2);
                this.field745 += (long) arg2;
                return;
            }
            long var4 = this.field745;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field745 >= this.field744 && this.field745 < this.field744 + (long) this.field758) {
                int var8 = (int) ((long) this.field758 - (this.field745 - this.field744));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field743, (int) (this.field745 - this.field744), arg0, arg1, var8);
                this.field745 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field743.length) {
                this.field750.method530(this.field745);
                this.field752 = this.field745;
                while (arg2 > 0) {
                    int var9 = this.field750.method534(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field752 += (long) var9;
                    this.field745 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method559();
                int var10 = arg2;
                if (arg2 > this.field758) {
                    var10 = this.field758;
                }
                System.arraycopy(this.field743, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field745 += (long) var10;
            }
            if (this.field747 != -1L) {
                if (this.field747 > this.field745 && arg2 > 0) {
                    int var11 = (int) (this.field747 - this.field745) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field745++;
                    }
                }
                long var12 = -1L;
                long var14 = -1L;
                if (this.field747 >= var4 && this.field747 < (long) var7 + var4) {
                    var12 = this.field747;
                } else if (var4 >= this.field747 && var4 < this.field747 + (long) this.field753) {
                    var12 = var4;
                }
                if (this.field747 + (long) this.field753 > var4 && this.field747 + (long) this.field753 <= (long) var7 + var4) {
                    var14 = this.field747 + (long) this.field753;
                } else if ((long) var7 + var4 > this.field747 && (long) var7 + var4 <= this.field747 + (long) this.field753) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field746, (int) (var12 - this.field747), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field745) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field745));
                        this.field745 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field752 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("ah.c(S)V")
    public void method559() throws IOException {
        this.field758 = 0;
        if (this.field752 != this.field745) {
            this.field750.method530(this.field745);
            this.field752 = this.field745;
        }
        this.field744 = this.field745;
        while (this.field758 < this.field743.length) {
            int var1 = this.field750.method534(this.field743, this.field758, this.field743.length - this.field758);
            if (var1 == -1) {
                break;
            }
            this.field752 += (long) var1;
            this.field758 += var1;
        }
    }

    @ObfuscatedName("ah.p([BIIB)V")
    public void method560(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field745 + (long) arg2 > this.field742) {
                this.field742 = this.field745 + (long) arg2;
            }
            if (this.field747 != -1L && (this.field745 < this.field747 || this.field745 > this.field747 + (long) this.field753)) {
                this.method565();
            }
            if (this.field747 != -1L && this.field745 + (long) arg2 > this.field747 + (long) this.field746.length) {
                int var4 = (int) ((long) this.field746.length - (this.field745 - this.field747));
                System.arraycopy(arg0, arg1, this.field746, (int) (this.field745 - this.field747), var4);
                this.field745 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field753 = this.field746.length;
                this.method565();
            }
            if (arg2 > this.field746.length) {
                if (this.field752 != this.field745) {
                    this.field750.method530(this.field745);
                    this.field752 = this.field745;
                }
                this.field750.method549(arg0, arg1, arg2);
                this.field752 += (long) arg2;
                if (this.field752 > this.field749) {
                    this.field749 = this.field752;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field745 >= this.field744 && this.field745 < this.field744 + (long) this.field758) {
                    var5 = this.field745;
                } else if (this.field744 >= this.field745 && this.field744 < this.field745 + (long) arg2) {
                    var5 = this.field744;
                }
                if (this.field745 + (long) arg2 > this.field744 && this.field745 + (long) arg2 <= this.field744 + (long) this.field758) {
                    var7 = this.field745 + (long) arg2;
                } else if (this.field744 + (long) this.field758 > this.field745 && this.field744 + (long) this.field758 <= this.field745 + (long) arg2) {
                    var7 = this.field744 + (long) this.field758;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field745), this.field743, (int) (var5 - this.field744), var9);
                }
                this.field745 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field747 == -1L) {
                    this.field747 = this.field745;
                }
                System.arraycopy(arg0, arg1, this.field746, (int) (this.field745 - this.field747), arg2);
                this.field745 += (long) arg2;
                if (this.field745 - this.field747 > (long) this.field753) {
                    this.field753 = (int) (this.field745 - this.field747);
                }
            }
        } catch (IOException var11) {
            this.field752 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("ah.s(B)V")
    public void method565() throws IOException {
        if (this.field747 == -1L) {
            return;
        }
        if (this.field752 != this.field747) {
            this.field750.method530(this.field747);
            this.field752 = this.field747;
        }
        this.field750.method549(this.field746, 0, this.field753);
        this.field752 += (long) (this.field753 * 658464359) * 1481170263L;
        if (this.field752 > this.field749) {
            this.field749 = this.field752;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field747 >= this.field744 && this.field747 < this.field744 + (long) this.field758) {
            var1 = this.field747;
        } else if (this.field744 >= this.field747 && this.field744 < this.field747 + (long) this.field753) {
            var1 = this.field744;
        }
        if (this.field747 + (long) this.field753 > this.field744 && this.field747 + (long) this.field753 <= this.field744 + (long) this.field758) {
            var3 = this.field747 + (long) this.field753;
        } else if (this.field744 + (long) this.field758 > this.field747 && this.field744 + (long) this.field758 <= this.field747 + (long) this.field753) {
            var3 = this.field744 + (long) this.field758;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field746, (int) (var1 - this.field747), this.field743, (int) (var1 - this.field744), var5);
        }
        this.field747 = -1L;
        this.field753 = 0;
    }
}
