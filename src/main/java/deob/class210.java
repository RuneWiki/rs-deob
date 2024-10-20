package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("hf")
public class class210 {

    @ObfuscatedName("hf.a")
    public class209 field3008;

    @ObfuscatedName("hf.v")
    public byte[] field3007;

    @ObfuscatedName("hf.i")
    public long field3011 = -1L;

    @ObfuscatedName("hf.b")
    public int field3017;

    @ObfuscatedName("hf.l")
    public byte[] field3010;

    @ObfuscatedName("hf.m")
    public long field3009 = -1L;

    @ObfuscatedName("hf.w")
    public int field3012 = 0;

    @ObfuscatedName("hf.e")
    public long field3013;

    @ObfuscatedName("hf.n")
    public long field3014;

    @ObfuscatedName("hf.s")
    public long field3015;

    @ObfuscatedName("hf.k")
    public long field3006;

    public class210(class209 arg0, int arg1, int arg2) throws IOException {
        this.field3008 = arg0;
        this.field3015 = this.field3014 = arg0.method3533();
        this.field3007 = new byte[arg1];
        this.field3010 = new byte[arg2];
        this.field3013 = 0L;
    }

    @ObfuscatedName("hf.a(I)V")
    public void method3568() throws IOException {
        this.method3556();
        this.field3008.method3530();
    }

    @ObfuscatedName("hf.v(J)V")
    public void method3551(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field3013 = arg0;
    }

    @ObfuscatedName("hf.i(I)J")
    public long method3573() {
        return this.field3015;
    }

    @ObfuscatedName("hf.b([BI)V")
    public void method3552(byte[] arg0) throws IOException {
        this.method3553(arg0, 0, arg0.length);
    }

    @ObfuscatedName("hf.l([BIII)V")
    public void method3553(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field3009 != -1L && this.field3013 >= this.field3009 && this.field3013 + (long) arg2 <= this.field3009 + (long) this.field3012) {
                System.arraycopy(this.field3010, (int) (this.field3013 - this.field3009), arg0, arg1, arg2);
                this.field3013 += (long) arg2;
                return;
            }
            long var4 = this.field3013;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field3013 >= this.field3011 && this.field3013 < this.field3011 + (long) this.field3017) {
                int var8 = (int) ((long) this.field3017 - (this.field3013 - this.field3011));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field3007, (int) (this.field3013 - this.field3011), arg0, arg1, var8);
                this.field3013 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field3007.length) {
                this.field3008.method3537(this.field3013);
                this.field3006 = this.field3013;
                while (arg2 > 0) {
                    int var9 = this.field3008.method3534(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field3006 += (long) var9;
                    this.field3013 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method3566();
                int var10 = arg2;
                if (arg2 > this.field3017) {
                    var10 = this.field3017;
                }
                System.arraycopy(this.field3007, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field3013 += (long) var10;
            }
            if (this.field3009 != -1L) {
                if (this.field3009 > this.field3013 && arg2 > 0) {
                    int var11 = (int) (this.field3009 - this.field3013) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field3013++;
                    }
                }
                long var12 = -1L;
                long var14 = -1L;
                if (this.field3009 >= var4 && this.field3009 < (long) var7 + var4) {
                    var12 = this.field3009;
                } else if (var4 >= this.field3009 && var4 < this.field3009 + (long) this.field3012) {
                    var12 = var4;
                }
                if (this.field3009 + (long) this.field3012 > var4 && this.field3009 + (long) this.field3012 <= (long) var7 + var4) {
                    var14 = this.field3009 + (long) this.field3012;
                } else if ((long) var7 + var4 > this.field3009 && (long) var7 + var4 <= this.field3009 + (long) this.field3012) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field3010, (int) (var12 - this.field3009), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field3013) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field3013));
                        this.field3013 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field3006 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("hf.m(I)V")
    public void method3566() throws IOException {
        this.field3017 = 0;
        if (this.field3013 != this.field3006) {
            this.field3008.method3537(this.field3013);
            this.field3006 = this.field3013;
        }
        this.field3011 = this.field3013;
        while (this.field3017 < this.field3007.length) {
            int var1 = this.field3008.method3534(this.field3007, this.field3017, this.field3007.length - this.field3017);
            if (var1 == -1) {
                break;
            }
            this.field3006 += (long) var1;
            this.field3017 += var1;
        }
    }

    @ObfuscatedName("hf.w([BIII)V")
    public void method3558(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field3013 + (long) arg2 > this.field3015) {
                this.field3015 = this.field3013 + (long) arg2;
            }
            if (this.field3009 != -1L && (this.field3013 < this.field3009 || this.field3013 > this.field3009 + (long) this.field3012)) {
                this.method3556();
            }
            if (this.field3009 != -1L && this.field3013 + (long) arg2 > this.field3009 + (long) this.field3010.length) {
                int var4 = (int) ((long) this.field3010.length - (this.field3013 - this.field3009));
                System.arraycopy(arg0, arg1, this.field3010, (int) (this.field3013 - this.field3009), var4);
                this.field3013 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field3012 = this.field3010.length;
                this.method3556();
            }
            if (arg2 > this.field3010.length) {
                if (this.field3013 != this.field3006) {
                    this.field3008.method3537(this.field3013);
                    this.field3006 = this.field3013;
                }
                this.field3008.method3531(arg0, arg1, arg2);
                this.field3006 += (long) arg2;
                if (this.field3006 > this.field3014) {
                    this.field3014 = this.field3006;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field3013 >= this.field3011 && this.field3013 < this.field3011 + (long) this.field3017) {
                    var5 = this.field3013;
                } else if (this.field3011 >= this.field3013 && this.field3011 < this.field3013 + (long) arg2) {
                    var5 = this.field3011;
                }
                if (this.field3013 + (long) arg2 > this.field3011 && this.field3013 + (long) arg2 <= this.field3011 + (long) this.field3017) {
                    var7 = this.field3013 + (long) arg2;
                } else if (this.field3011 + (long) this.field3017 > this.field3013 && this.field3011 + (long) this.field3017 <= this.field3013 + (long) arg2) {
                    var7 = this.field3011 + (long) this.field3017;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field3013), this.field3007, (int) (var5 - this.field3011), var9);
                }
                this.field3013 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field3009 == -1L) {
                    this.field3009 = this.field3013;
                }
                System.arraycopy(arg0, arg1, this.field3010, (int) (this.field3013 - this.field3009), arg2);
                this.field3013 += (long) arg2;
                if (this.field3013 - this.field3009 > (long) this.field3012) {
                    this.field3012 = (int) (this.field3013 - this.field3009);
                }
            }
        } catch (IOException var11) {
            this.field3006 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("hf.e(B)V")
    public void method3556() throws IOException {
        if (this.field3009 == -1L) {
            return;
        }
        if (this.field3009 != this.field3006) {
            this.field3008.method3537(this.field3009);
            this.field3006 = this.field3009;
        }
        this.field3008.method3531(this.field3010, 0, this.field3012);
        this.field3006 += (long) (this.field3012 * -1046125767) * 1929157385L;
        if (this.field3006 > this.field3014) {
            this.field3014 = this.field3006;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field3009 >= this.field3011 && this.field3009 < this.field3011 + (long) this.field3017) {
            var1 = this.field3009;
        } else if (this.field3011 >= this.field3009 && this.field3011 < this.field3009 + (long) this.field3012) {
            var1 = this.field3011;
        }
        if (this.field3009 + (long) this.field3012 > this.field3011 && this.field3009 + (long) this.field3012 <= this.field3011 + (long) this.field3017) {
            var3 = this.field3009 + (long) this.field3012;
        } else if (this.field3011 + (long) this.field3017 > this.field3009 && this.field3011 + (long) this.field3017 <= this.field3009 + (long) this.field3012) {
            var3 = this.field3011 + (long) this.field3017;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field3010, (int) (var1 - this.field3009), this.field3007, (int) (var1 - this.field3011), var5);
        }
        this.field3009 = -1L;
        this.field3012 = 0;
    }
}
