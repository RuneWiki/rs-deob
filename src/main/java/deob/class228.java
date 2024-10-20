package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("ha")
public class class228 {

    @ObfuscatedName("ha.j")
    public class227 field3221;

    @ObfuscatedName("ha.l")
    public byte[] field3212;

    @ObfuscatedName("ha.a")
    public long field3213 = -1L;

    @ObfuscatedName("ha.i")
    public int field3214;

    @ObfuscatedName("ha.f")
    public byte[] field3211;

    @ObfuscatedName("ha.m")
    public long field3216 = -1L;

    @ObfuscatedName("ha.o")
    public int field3215 = 0;

    @ObfuscatedName("ha.h")
    public long field3217;

    @ObfuscatedName("ha.n")
    public long field3219;

    @ObfuscatedName("ha.k")
    public long field3220;

    @ObfuscatedName("ha.r")
    public long field3218;

    public class228(class227 arg0, int arg1, int arg2) throws IOException {
        this.field3221 = arg0;
        this.field3220 = this.field3219 = arg0.method3816();
        this.field3212 = new byte[arg1];
        this.field3211 = new byte[arg2];
        this.field3217 = 0L;
    }

    @ObfuscatedName("ha.j(S)V")
    public void method3840() throws IOException {
        this.method3852();
        this.field3221.method3818();
    }

    @ObfuscatedName("ha.l(J)V")
    public void method3833(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field3217 = arg0;
    }

    @ObfuscatedName("ha.a(B)J")
    public long method3832() {
        return this.field3220;
    }

    @ObfuscatedName("ha.i([BB)V")
    public void method3857(byte[] arg0) throws IOException {
        this.method3834(arg0, 0, arg0.length);
    }

    @ObfuscatedName("ha.f([BIII)V")
    public void method3834(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field3216 != -1L && this.field3217 >= this.field3216 && this.field3217 + (long) arg2 <= this.field3216 + (long) this.field3215) {
                System.arraycopy(this.field3211, (int) (this.field3217 - this.field3216), arg0, arg1, arg2);
                this.field3217 += (long) arg2;
                return;
            }
            long var4 = this.field3217;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field3217 >= this.field3213 && this.field3217 < this.field3213 + (long) this.field3214) {
                int var8 = (int) ((long) this.field3214 - (this.field3217 - this.field3213));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field3212, (int) (this.field3217 - this.field3213), arg0, arg1, var8);
                this.field3217 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field3212.length) {
                this.field3221.method3809(this.field3217);
                this.field3218 = this.field3217;
                while (arg2 > 0) {
                    int var9 = this.field3221.method3817(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field3218 += (long) var9;
                    this.field3217 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method3835();
                int var10 = arg2;
                if (arg2 > this.field3214) {
                    var10 = this.field3214;
                }
                System.arraycopy(this.field3212, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field3217 += (long) var10;
            }
            if (this.field3216 != -1L) {
                if (this.field3216 > this.field3217 && arg2 > 0) {
                    int var11 = (int) (this.field3216 - this.field3217) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field3217++;
                    }
                }
                long var12 = -1L;
                long var14 = -1L;
                if (this.field3216 >= var4 && this.field3216 < (long) var7 + var4) {
                    var12 = this.field3216;
                } else if (var4 >= this.field3216 && var4 < this.field3216 + (long) this.field3215) {
                    var12 = var4;
                }
                if (this.field3216 + (long) this.field3215 > var4 && this.field3216 + (long) this.field3215 <= (long) var7 + var4) {
                    var14 = this.field3216 + (long) this.field3215;
                } else if ((long) var7 + var4 > this.field3216 && (long) var7 + var4 <= this.field3216 + (long) this.field3215) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field3211, (int) (var12 - this.field3216), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field3217) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field3217));
                        this.field3217 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field3218 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("ha.m(B)V")
    public void method3835() throws IOException {
        this.field3214 = 0;
        if (this.field3218 != this.field3217) {
            this.field3221.method3809(this.field3217);
            this.field3218 = this.field3217;
        }
        this.field3213 = this.field3217;
        while (this.field3214 < this.field3212.length) {
            int var1 = this.field3221.method3817(this.field3212, this.field3214, this.field3212.length - this.field3214);
            if (var1 == -1) {
                break;
            }
            this.field3218 += (long) var1;
            this.field3214 += var1;
        }
    }

    @ObfuscatedName("ha.o([BIII)V")
    public void method3836(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field3217 + (long) arg2 > this.field3220) {
                this.field3220 = this.field3217 + (long) arg2;
            }
            if (this.field3216 != -1L && (this.field3217 < this.field3216 || this.field3217 > this.field3216 + (long) this.field3215)) {
                this.method3852();
            }
            if (this.field3216 != -1L && this.field3217 + (long) arg2 > this.field3216 + (long) this.field3211.length) {
                int var4 = (int) ((long) this.field3211.length - (this.field3217 - this.field3216));
                System.arraycopy(arg0, arg1, this.field3211, (int) (this.field3217 - this.field3216), var4);
                this.field3217 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field3215 = this.field3211.length;
                this.method3852();
            }
            if (arg2 > this.field3211.length) {
                if (this.field3218 != this.field3217) {
                    this.field3221.method3809(this.field3217);
                    this.field3218 = this.field3217;
                }
                this.field3221.method3810(arg0, arg1, arg2);
                this.field3218 += (long) arg2;
                if (this.field3218 > this.field3219) {
                    this.field3219 = this.field3218;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field3217 >= this.field3213 && this.field3217 < this.field3213 + (long) this.field3214) {
                    var5 = this.field3217;
                } else if (this.field3213 >= this.field3217 && this.field3213 < this.field3217 + (long) arg2) {
                    var5 = this.field3213;
                }
                if (this.field3217 + (long) arg2 > this.field3213 && this.field3217 + (long) arg2 <= this.field3213 + (long) this.field3214) {
                    var7 = this.field3217 + (long) arg2;
                } else if (this.field3213 + (long) this.field3214 > this.field3217 && this.field3213 + (long) this.field3214 <= this.field3217 + (long) arg2) {
                    var7 = this.field3213 + (long) this.field3214;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field3217), this.field3212, (int) (var5 - this.field3213), var9);
                }
                this.field3217 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field3216 == -1L) {
                    this.field3216 = this.field3217;
                }
                System.arraycopy(arg0, arg1, this.field3211, (int) (this.field3217 - this.field3216), arg2);
                this.field3217 += (long) arg2;
                if (this.field3217 - this.field3216 > (long) this.field3215) {
                    this.field3215 = (int) (this.field3217 - this.field3216);
                }
            }
        } catch (IOException var11) {
            this.field3218 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("ha.h(I)V")
    public void method3852() throws IOException {
        if (this.field3216 == -1L) {
            return;
        }
        if (this.field3218 != this.field3216) {
            this.field3221.method3809(this.field3216);
            this.field3218 = this.field3216;
        }
        this.field3221.method3810(this.field3211, 0, this.field3215);
        this.field3218 += (long) (this.field3215 * -2104093309) * 1027711275L;
        if (this.field3218 > this.field3219) {
            this.field3219 = this.field3218;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field3216 >= this.field3213 && this.field3216 < this.field3213 + (long) this.field3214) {
            var1 = this.field3216;
        } else if (this.field3213 >= this.field3216 && this.field3213 < this.field3216 + (long) this.field3215) {
            var1 = this.field3213;
        }
        if (this.field3216 + (long) this.field3215 > this.field3213 && this.field3216 + (long) this.field3215 <= this.field3213 + (long) this.field3214) {
            var3 = this.field3216 + (long) this.field3215;
        } else if (this.field3213 + (long) this.field3214 > this.field3216 && this.field3213 + (long) this.field3214 <= this.field3216 + (long) this.field3215) {
            var3 = this.field3213 + (long) this.field3214;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field3211, (int) (var1 - this.field3216), this.field3212, (int) (var1 - this.field3213), var5);
        }
        this.field3216 = -1L;
        this.field3215 = 0;
    }
}
