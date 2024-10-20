package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("ht")
public class class228 {

    @ObfuscatedName("ht.v")
    public class227 field3211;

    @ObfuscatedName("ht.f")
    public byte[] field3221;

    @ObfuscatedName("ht.i")
    public long field3212 = -1L;

    @ObfuscatedName("ht.d")
    public int field3210;

    @ObfuscatedName("ht.o")
    public byte[] field3214;

    @ObfuscatedName("ht.c")
    public long field3215 = -1L;

    @ObfuscatedName("ht.p")
    public int field3216 = 0;

    @ObfuscatedName("ht.j")
    public long field3217;

    @ObfuscatedName("ht.a")
    public long field3218;

    @ObfuscatedName("ht.y")
    public long field3213;

    @ObfuscatedName("ht.h")
    public long field3219;

    public class228(class227 arg0, int arg1, int arg2) throws IOException {
        this.field3211 = arg0;
        this.field3213 = this.field3218 = arg0.method3840();
        this.field3221 = new byte[arg1];
        this.field3214 = new byte[arg2];
        this.field3217 = 0L;
    }

    @ObfuscatedName("ht.v(B)V")
    public void method3856() throws IOException {
        this.method3863();
        this.field3211.method3848();
    }

    @ObfuscatedName("ht.f(J)V")
    public void method3857(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field3217 = arg0;
    }

    @ObfuscatedName("ht.i(I)J")
    public long method3858() {
        return this.field3213;
    }

    @ObfuscatedName("ht.d([BB)V")
    public void method3859(byte[] arg0) throws IOException {
        this.method3860(arg0, 0, arg0.length);
    }

    @ObfuscatedName("ht.o([BIII)V")
    public void method3860(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field3215 != -1L && this.field3217 >= this.field3215 && this.field3217 + (long) arg2 <= this.field3215 + (long) this.field3216) {
                System.arraycopy(this.field3214, (int) (this.field3217 - this.field3215), arg0, arg1, arg2);
                this.field3217 += (long) arg2;
                return;
            }
            long var4 = this.field3217;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field3217 >= this.field3212 && this.field3217 < this.field3212 + (long) this.field3210) {
                int var8 = (int) ((long) this.field3210 - (this.field3217 - this.field3212));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field3221, (int) (this.field3217 - this.field3212), arg0, arg1, var8);
                this.field3217 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field3221.length) {
                this.field3211.method3849(this.field3217);
                this.field3219 = this.field3217;
                while (arg2 > 0) {
                    int var9 = this.field3211.method3841(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field3219 += (long) var9;
                    this.field3217 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method3861();
                int var10 = arg2;
                if (arg2 > this.field3210) {
                    var10 = this.field3210;
                }
                System.arraycopy(this.field3221, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field3217 += (long) var10;
            }
            if (this.field3215 != -1L) {
                if (this.field3215 > this.field3217 && arg2 > 0) {
                    int var11 = (int) (this.field3215 - this.field3217) + arg1;
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
                if (this.field3215 >= var4 && this.field3215 < (long) var7 + var4) {
                    var12 = this.field3215;
                } else if (var4 >= this.field3215 && var4 < this.field3215 + (long) this.field3216) {
                    var12 = var4;
                }
                if (this.field3215 + (long) this.field3216 > var4 && this.field3215 + (long) this.field3216 <= (long) var7 + var4) {
                    var14 = this.field3215 + (long) this.field3216;
                } else if ((long) var7 + var4 > this.field3215 && (long) var7 + var4 <= this.field3215 + (long) this.field3216) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field3214, (int) (var12 - this.field3215), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field3217) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field3217));
                        this.field3217 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field3219 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("ht.c(I)V")
    public void method3861() throws IOException {
        this.field3210 = 0;
        if (this.field3219 != this.field3217) {
            this.field3211.method3849(this.field3217);
            this.field3219 = this.field3217;
        }
        this.field3212 = this.field3217;
        while (this.field3210 < this.field3221.length) {
            int var1 = this.field3211.method3841(this.field3221, this.field3210, this.field3221.length - this.field3210);
            if (var1 == -1) {
                break;
            }
            this.field3219 += (long) var1;
            this.field3210 += var1;
        }
    }

    @ObfuscatedName("ht.p([BIII)V")
    public void method3864(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field3217 + (long) arg2 > this.field3213) {
                this.field3213 = this.field3217 + (long) arg2;
            }
            if (this.field3215 != -1L && (this.field3217 < this.field3215 || this.field3217 > this.field3215 + (long) this.field3216)) {
                this.method3863();
            }
            if (this.field3215 != -1L && this.field3217 + (long) arg2 > this.field3215 + (long) this.field3214.length) {
                int var4 = (int) ((long) this.field3214.length - (this.field3217 - this.field3215));
                System.arraycopy(arg0, arg1, this.field3214, (int) (this.field3217 - this.field3215), var4);
                this.field3217 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field3216 = this.field3214.length;
                this.method3863();
            }
            if (arg2 > this.field3214.length) {
                if (this.field3219 != this.field3217) {
                    this.field3211.method3849(this.field3217);
                    this.field3219 = this.field3217;
                }
                this.field3211.method3839(arg0, arg1, arg2);
                this.field3219 += (long) arg2;
                if (this.field3219 > this.field3218) {
                    this.field3218 = this.field3219;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field3217 >= this.field3212 && this.field3217 < this.field3212 + (long) this.field3210) {
                    var5 = this.field3217;
                } else if (this.field3212 >= this.field3217 && this.field3212 < this.field3217 + (long) arg2) {
                    var5 = this.field3212;
                }
                if (this.field3217 + (long) arg2 > this.field3212 && this.field3217 + (long) arg2 <= this.field3212 + (long) this.field3210) {
                    var7 = this.field3217 + (long) arg2;
                } else if (this.field3212 + (long) this.field3210 > this.field3217 && this.field3212 + (long) this.field3210 <= this.field3217 + (long) arg2) {
                    var7 = this.field3212 + (long) this.field3210;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field3217), this.field3221, (int) (var5 - this.field3212), var9);
                }
                this.field3217 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field3215 == -1L) {
                    this.field3215 = this.field3217;
                }
                System.arraycopy(arg0, arg1, this.field3214, (int) (this.field3217 - this.field3215), arg2);
                this.field3217 += (long) arg2;
                if (this.field3217 - this.field3215 > (long) this.field3216) {
                    this.field3216 = (int) (this.field3217 - this.field3215);
                }
            }
        } catch (IOException var11) {
            this.field3219 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("ht.j(I)V")
    public void method3863() throws IOException {
        if (this.field3215 == -1L) {
            return;
        }
        if (this.field3219 != this.field3215) {
            this.field3211.method3849(this.field3215);
            this.field3219 = this.field3215;
        }
        this.field3211.method3839(this.field3214, 0, this.field3216);
        this.field3219 += (long) (this.field3216 * 827558625) * -349226719L;
        if (this.field3219 > this.field3218) {
            this.field3218 = this.field3219;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field3215 >= this.field3212 && this.field3215 < this.field3212 + (long) this.field3210) {
            var1 = this.field3215;
        } else if (this.field3212 >= this.field3215 && this.field3212 < this.field3215 + (long) this.field3216) {
            var1 = this.field3212;
        }
        if (this.field3215 + (long) this.field3216 > this.field3212 && this.field3215 + (long) this.field3216 <= this.field3212 + (long) this.field3210) {
            var3 = this.field3215 + (long) this.field3216;
        } else if (this.field3212 + (long) this.field3210 > this.field3215 && this.field3212 + (long) this.field3210 <= this.field3215 + (long) this.field3216) {
            var3 = this.field3212 + (long) this.field3210;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field3214, (int) (var1 - this.field3215), this.field3221, (int) (var1 - this.field3212), var5);
        }
        this.field3215 = -1L;
        this.field3216 = 0;
    }
}
