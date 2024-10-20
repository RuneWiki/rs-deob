package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("hi")
public class class210 {

    @ObfuscatedName("hi.p")
    public class209 field3008;

    @ObfuscatedName("hi.y")
    public byte[] field3004;

    @ObfuscatedName("hi.d")
    public long field3003 = -1L;

    @ObfuscatedName("hi.c")
    public int field3006;

    @ObfuscatedName("hi.r")
    public byte[] field3013;

    @ObfuscatedName("hi.f")
    public long field3007 = -1L;

    @ObfuscatedName("hi.z")
    public int field3009 = 0;

    @ObfuscatedName("hi.o")
    public long field3010;

    @ObfuscatedName("hi.k")
    public long field3011;

    @ObfuscatedName("hi.s")
    public long field3012;

    @ObfuscatedName("hi.h")
    public long field3005;

    public class210(class209 arg0, int arg1, int arg2) throws IOException {
        this.field3008 = arg0;
        this.field3012 = this.field3011 = arg0.method3565();
        this.field3004 = new byte[arg1];
        this.field3013 = new byte[arg2];
        this.field3010 = 0L;
    }

    @ObfuscatedName("hi.p(I)V")
    public void method3580() throws IOException {
        this.method3587();
        this.field3008.method3564();
    }

    @ObfuscatedName("hi.y(J)V")
    public void method3581(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field3010 = arg0;
    }

    @ObfuscatedName("hi.d(B)J")
    public long method3599() {
        return this.field3012;
    }

    @ObfuscatedName("hi.c([BI)V")
    public void method3583(byte[] arg0) throws IOException {
        this.method3584(arg0, 0, arg0.length);
    }

    @ObfuscatedName("hi.r([BIII)V")
    public void method3584(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field3007 != -1L && this.field3010 >= this.field3007 && this.field3010 + (long) arg2 <= this.field3007 + (long) this.field3009) {
                System.arraycopy(this.field3013, (int) (this.field3010 - this.field3007), arg0, arg1, arg2);
                this.field3010 += (long) arg2;
                return;
            }
            long var4 = this.field3010;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field3010 >= this.field3003 && this.field3010 < this.field3003 + (long) this.field3006) {
                int var8 = (int) ((long) this.field3006 - (this.field3010 - this.field3003));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field3004, (int) (this.field3010 - this.field3003), arg0, arg1, var8);
                this.field3010 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field3004.length) {
                this.field3008.method3562(this.field3010);
                this.field3005 = this.field3010;
                while (arg2 > 0) {
                    int var9 = this.field3008.method3570(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field3005 += (long) var9;
                    this.field3010 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method3585();
                int var10 = arg2;
                if (arg2 > this.field3006) {
                    var10 = this.field3006;
                }
                System.arraycopy(this.field3004, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field3010 += (long) var10;
            }
            if (this.field3007 != -1L) {
                if (this.field3007 > this.field3010 && arg2 > 0) {
                    int var11 = (int) (this.field3007 - this.field3010) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field3010++;
                    }
                }
                long var12 = -1L;
                long var14 = -1L;
                if (this.field3007 >= var4 && this.field3007 < (long) var7 + var4) {
                    var12 = this.field3007;
                } else if (var4 >= this.field3007 && var4 < this.field3007 + (long) this.field3009) {
                    var12 = var4;
                }
                if (this.field3007 + (long) this.field3009 > var4 && this.field3007 + (long) this.field3009 <= (long) var7 + var4) {
                    var14 = this.field3007 + (long) this.field3009;
                } else if ((long) var7 + var4 > this.field3007 && (long) var7 + var4 <= this.field3007 + (long) this.field3009) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field3013, (int) (var12 - this.field3007), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field3010) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field3010));
                        this.field3010 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field3005 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("hi.f(B)V")
    public void method3585() throws IOException {
        this.field3006 = 0;
        if (this.field3010 != this.field3005) {
            this.field3008.method3562(this.field3010);
            this.field3005 = this.field3010;
        }
        this.field3003 = this.field3010;
        while (this.field3006 < this.field3004.length) {
            int var1 = this.field3008.method3570(this.field3004, this.field3006, this.field3004.length - this.field3006);
            if (var1 == -1) {
                break;
            }
            this.field3005 += (long) var1;
            this.field3006 += var1;
        }
    }

    @ObfuscatedName("hi.z([BIIB)V")
    public void method3586(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field3010 + (long) arg2 > this.field3012) {
                this.field3012 = this.field3010 + (long) arg2;
            }
            if (this.field3007 != -1L && (this.field3010 < this.field3007 || this.field3010 > this.field3007 + (long) this.field3009)) {
                this.method3587();
            }
            if (this.field3007 != -1L && this.field3010 + (long) arg2 > this.field3007 + (long) this.field3013.length) {
                int var4 = (int) ((long) this.field3013.length - (this.field3010 - this.field3007));
                System.arraycopy(arg0, arg1, this.field3013, (int) (this.field3010 - this.field3007), var4);
                this.field3010 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field3009 = this.field3013.length;
                this.method3587();
            }
            if (arg2 > this.field3013.length) {
                if (this.field3010 != this.field3005) {
                    this.field3008.method3562(this.field3010);
                    this.field3005 = this.field3010;
                }
                this.field3008.method3563(arg0, arg1, arg2);
                this.field3005 += (long) arg2;
                if (this.field3005 > this.field3011) {
                    this.field3011 = this.field3005;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field3010 >= this.field3003 && this.field3010 < this.field3003 + (long) this.field3006) {
                    var5 = this.field3010;
                } else if (this.field3003 >= this.field3010 && this.field3003 < this.field3010 + (long) arg2) {
                    var5 = this.field3003;
                }
                if (this.field3010 + (long) arg2 > this.field3003 && this.field3010 + (long) arg2 <= this.field3003 + (long) this.field3006) {
                    var7 = this.field3010 + (long) arg2;
                } else if (this.field3003 + (long) this.field3006 > this.field3010 && this.field3003 + (long) this.field3006 <= this.field3010 + (long) arg2) {
                    var7 = this.field3003 + (long) this.field3006;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field3010), this.field3004, (int) (var5 - this.field3003), var9);
                }
                this.field3010 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field3007 == -1L) {
                    this.field3007 = this.field3010;
                }
                System.arraycopy(arg0, arg1, this.field3013, (int) (this.field3010 - this.field3007), arg2);
                this.field3010 += (long) arg2;
                if (this.field3010 - this.field3007 > (long) this.field3009) {
                    this.field3009 = (int) (this.field3010 - this.field3007);
                }
            }
        } catch (IOException var11) {
            this.field3005 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("hi.o(I)V")
    public void method3587() throws IOException {
        if (this.field3007 == -1L) {
            return;
        }
        if (this.field3007 != this.field3005) {
            this.field3008.method3562(this.field3007);
            this.field3005 = this.field3007;
        }
        this.field3008.method3563(this.field3013, 0, this.field3009);
        this.field3005 += (long) (this.field3009 * 475786223) * -757292273L;
        if (this.field3005 > this.field3011) {
            this.field3011 = this.field3005;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field3007 >= this.field3003 && this.field3007 < this.field3003 + (long) this.field3006) {
            var1 = this.field3007;
        } else if (this.field3003 >= this.field3007 && this.field3003 < this.field3007 + (long) this.field3009) {
            var1 = this.field3003;
        }
        if (this.field3007 + (long) this.field3009 > this.field3003 && this.field3007 + (long) this.field3009 <= this.field3003 + (long) this.field3006) {
            var3 = this.field3007 + (long) this.field3009;
        } else if (this.field3003 + (long) this.field3006 > this.field3007 && this.field3003 + (long) this.field3006 <= this.field3007 + (long) this.field3009) {
            var3 = this.field3003 + (long) this.field3006;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field3013, (int) (var1 - this.field3007), this.field3004, (int) (var1 - this.field3003), var5);
        }
        this.field3007 = -1L;
        this.field3009 = 0;
    }
}
