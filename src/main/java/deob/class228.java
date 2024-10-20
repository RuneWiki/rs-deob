package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("he")
public class class228 {

    @ObfuscatedName("he.m")
    public class227 field3201;

    @ObfuscatedName("he.l")
    public byte[] field3196;

    @ObfuscatedName("he.y")
    public long field3195 = -1L;

    @ObfuscatedName("he.u")
    public int field3193;

    @ObfuscatedName("he.k")
    public byte[] field3197;

    @ObfuscatedName("he.j")
    public long field3198 = -1L;

    @ObfuscatedName("he.i")
    public int field3199 = 0;

    @ObfuscatedName("he.x")
    public long field3194;

    @ObfuscatedName("he.g")
    public long field3204;

    @ObfuscatedName("he.e")
    public long field3202;

    @ObfuscatedName("he.p")
    public long field3203;

    public class228(class227 arg0, int arg1, int arg2) throws IOException {
        this.field3201 = arg0;
        this.field3202 = this.field3204 = arg0.method3932();
        this.field3196 = new byte[arg1];
        this.field3197 = new byte[arg2];
        this.field3194 = 0L;
    }

    @ObfuscatedName("he.m(I)V")
    public void method3937() throws IOException {
        this.method3959();
        this.field3201.method3921();
    }

    @ObfuscatedName("he.l(J)V")
    public void method3938(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field3194 = arg0;
    }

    @ObfuscatedName("he.y(I)J")
    public long method3953() {
        return this.field3202;
    }

    @ObfuscatedName("he.u([BB)V")
    public void method3939(byte[] arg0) throws IOException {
        this.method3940(arg0, 0, arg0.length);
    }

    @ObfuscatedName("he.k([BIII)V")
    public void method3940(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field3198 != -1L && this.field3194 >= this.field3198 && this.field3194 + (long) arg2 <= this.field3198 + (long) this.field3199) {
                System.arraycopy(this.field3197, (int) (this.field3194 - this.field3198), arg0, arg1, arg2);
                this.field3194 += (long) arg2;
                return;
            }
            long var4 = this.field3194;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field3194 >= this.field3195 && this.field3194 < this.field3195 + (long) this.field3193) {
                int var8 = (int) ((long) this.field3193 - (this.field3194 - this.field3195));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field3196, (int) (this.field3194 - this.field3195), arg0, arg1, var8);
                this.field3194 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field3196.length) {
                this.field3201.method3919(this.field3194);
                this.field3203 = this.field3194;
                while (arg2 > 0) {
                    int var9 = this.field3201.method3922(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field3203 += (long) var9;
                    this.field3194 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method3952();
                int var10 = arg2;
                if (arg2 > this.field3193) {
                    var10 = this.field3193;
                }
                System.arraycopy(this.field3196, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field3194 += (long) var10;
            }
            if (this.field3198 != -1L) {
                if (this.field3198 > this.field3194 && arg2 > 0) {
                    int var11 = (int) (this.field3198 - this.field3194) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field3194++;
                    }
                }
                long var12 = -1L;
                long var14 = -1L;
                if (this.field3198 >= var4 && this.field3198 < (long) var7 + var4) {
                    var12 = this.field3198;
                } else if (var4 >= this.field3198 && var4 < this.field3198 + (long) this.field3199) {
                    var12 = var4;
                }
                if (this.field3198 + (long) this.field3199 > var4 && this.field3198 + (long) this.field3199 <= (long) var7 + var4) {
                    var14 = this.field3198 + (long) this.field3199;
                } else if ((long) var7 + var4 > this.field3198 && (long) var7 + var4 <= this.field3198 + (long) this.field3199) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field3197, (int) (var12 - this.field3198), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field3194) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field3194));
                        this.field3194 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field3203 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("he.j(B)V")
    public void method3952() throws IOException {
        this.field3193 = 0;
        if (this.field3203 != this.field3194) {
            this.field3201.method3919(this.field3194);
            this.field3203 = this.field3194;
        }
        this.field3195 = this.field3194;
        while (this.field3193 < this.field3196.length) {
            int var1 = this.field3201.method3922(this.field3196, this.field3193, this.field3196.length - this.field3193);
            if (var1 == -1) {
                break;
            }
            this.field3203 += (long) var1;
            this.field3193 += var1;
        }
    }

    @ObfuscatedName("he.i([BIII)V")
    public void method3942(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field3194 + (long) arg2 > this.field3202) {
                this.field3202 = this.field3194 + (long) arg2;
            }
            if (this.field3198 != -1L && (this.field3194 < this.field3198 || this.field3194 > this.field3198 + (long) this.field3199)) {
                this.method3959();
            }
            if (this.field3198 != -1L && this.field3194 + (long) arg2 > this.field3198 + (long) this.field3197.length) {
                int var4 = (int) ((long) this.field3197.length - (this.field3194 - this.field3198));
                System.arraycopy(arg0, arg1, this.field3197, (int) (this.field3194 - this.field3198), var4);
                this.field3194 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field3199 = this.field3197.length;
                this.method3959();
            }
            if (arg2 > this.field3197.length) {
                if (this.field3203 != this.field3194) {
                    this.field3201.method3919(this.field3194);
                    this.field3203 = this.field3194;
                }
                this.field3201.method3920(arg0, arg1, arg2);
                this.field3203 += (long) arg2;
                if (this.field3203 > this.field3204) {
                    this.field3204 = this.field3203;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field3194 >= this.field3195 && this.field3194 < this.field3195 + (long) this.field3193) {
                    var5 = this.field3194;
                } else if (this.field3195 >= this.field3194 && this.field3195 < this.field3194 + (long) arg2) {
                    var5 = this.field3195;
                }
                if (this.field3194 + (long) arg2 > this.field3195 && this.field3194 + (long) arg2 <= this.field3195 + (long) this.field3193) {
                    var7 = this.field3194 + (long) arg2;
                } else if (this.field3195 + (long) this.field3193 > this.field3194 && this.field3195 + (long) this.field3193 <= this.field3194 + (long) arg2) {
                    var7 = this.field3195 + (long) this.field3193;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field3194), this.field3196, (int) (var5 - this.field3195), var9);
                }
                this.field3194 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field3198 == -1L) {
                    this.field3198 = this.field3194;
                }
                System.arraycopy(arg0, arg1, this.field3197, (int) (this.field3194 - this.field3198), arg2);
                this.field3194 += (long) arg2;
                if (this.field3194 - this.field3198 > (long) this.field3199) {
                    this.field3199 = (int) (this.field3194 - this.field3198);
                }
            }
        } catch (IOException var11) {
            this.field3203 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("he.x(B)V")
    public void method3959() throws IOException {
        if (this.field3198 == -1L) {
            return;
        }
        if (this.field3203 != this.field3198) {
            this.field3201.method3919(this.field3198);
            this.field3203 = this.field3198;
        }
        this.field3201.method3920(this.field3197, 0, this.field3199);
        this.field3203 += (long) (this.field3199 * -1061086135) * 923637241L;
        if (this.field3203 > this.field3204) {
            this.field3204 = this.field3203;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field3198 >= this.field3195 && this.field3198 < this.field3195 + (long) this.field3193) {
            var1 = this.field3198;
        } else if (this.field3195 >= this.field3198 && this.field3195 < this.field3198 + (long) this.field3199) {
            var1 = this.field3195;
        }
        if (this.field3198 + (long) this.field3199 > this.field3195 && this.field3198 + (long) this.field3199 <= this.field3195 + (long) this.field3193) {
            var3 = this.field3198 + (long) this.field3199;
        } else if (this.field3195 + (long) this.field3193 > this.field3198 && this.field3195 + (long) this.field3193 <= this.field3198 + (long) this.field3199) {
            var3 = this.field3195 + (long) this.field3193;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field3197, (int) (var1 - this.field3198), this.field3196, (int) (var1 - this.field3195), var5);
        }
        this.field3198 = -1L;
        this.field3199 = 0;
    }
}
