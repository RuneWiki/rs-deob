package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("hu")
public class class210 {

    @ObfuscatedName("hu.v")
    public class209 field3006;

    @ObfuscatedName("hu.t")
    public byte[] field3007;

    @ObfuscatedName("hu.f")
    public long field3008 = -1L;

    @ObfuscatedName("hu.j")
    public int field3009;

    @ObfuscatedName("hu.l")
    public byte[] field3010;

    @ObfuscatedName("hu.g")
    public long field3015 = -1L;

    @ObfuscatedName("hu.k")
    public int field3014 = 0;

    @ObfuscatedName("hu.p")
    public long field3013;

    @ObfuscatedName("hu.y")
    public long field3017;

    @ObfuscatedName("hu.m")
    public long field3012;

    @ObfuscatedName("hu.o")
    public long field3011;

    public class210(class209 arg0, int arg1, int arg2) throws IOException {
        this.field3006 = arg0;
        this.field3012 = this.field3017 = arg0.method3587();
        this.field3007 = new byte[arg1];
        this.field3010 = new byte[arg2];
        this.field3013 = 0L;
    }

    @ObfuscatedName("hu.v(B)V")
    public void method3597() throws IOException {
        this.method3603();
        this.field3006.method3579();
    }

    @ObfuscatedName("hu.t(J)V")
    public void method3598(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field3013 = arg0;
    }

    @ObfuscatedName("hu.f(S)J")
    public long method3599() {
        return this.field3012;
    }

    @ObfuscatedName("hu.j([BI)V")
    public void method3612(byte[] arg0) throws IOException {
        this.method3600(arg0, 0, arg0.length);
    }

    @ObfuscatedName("hu.l([BIII)V")
    public void method3600(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field3015 != -1L && this.field3013 >= this.field3015 && this.field3013 + (long) arg2 <= this.field3015 + (long) this.field3014) {
                System.arraycopy(this.field3010, (int) (this.field3013 - this.field3015), arg0, arg1, arg2);
                this.field3013 += (long) arg2;
                return;
            }
            long var4 = this.field3013;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field3013 >= this.field3008 && this.field3013 < this.field3008 + (long) this.field3009) {
                int var8 = (int) ((long) this.field3009 - (this.field3013 - this.field3008));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field3007, (int) (this.field3013 - this.field3008), arg0, arg1, var8);
                this.field3013 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field3007.length) {
                this.field3006.method3580(this.field3013);
                this.field3011 = this.field3013;
                while (arg2 > 0) {
                    int var9 = this.field3006.method3583(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field3011 += (long) var9;
                    this.field3013 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method3601();
                int var10 = arg2;
                if (arg2 > this.field3009) {
                    var10 = this.field3009;
                }
                System.arraycopy(this.field3007, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field3013 += (long) var10;
            }
            if (this.field3015 != -1L) {
                if (this.field3015 > this.field3013 && arg2 > 0) {
                    int var11 = (int) (this.field3015 - this.field3013) + arg1;
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
                if (this.field3015 >= var4 && this.field3015 < (long) var7 + var4) {
                    var12 = this.field3015;
                } else if (var4 >= this.field3015 && var4 < this.field3015 + (long) this.field3014) {
                    var12 = var4;
                }
                if (this.field3015 + (long) this.field3014 > var4 && this.field3015 + (long) this.field3014 <= (long) var7 + var4) {
                    var14 = this.field3015 + (long) this.field3014;
                } else if ((long) var7 + var4 > this.field3015 && (long) var7 + var4 <= this.field3015 + (long) this.field3014) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field3010, (int) (var12 - this.field3015), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field3013) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field3013));
                        this.field3013 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field3011 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("hu.g(I)V")
    public void method3601() throws IOException {
        this.field3009 = 0;
        if (this.field3013 != this.field3011) {
            this.field3006.method3580(this.field3013);
            this.field3011 = this.field3013;
        }
        this.field3008 = this.field3013;
        while (this.field3009 < this.field3007.length) {
            int var1 = this.field3006.method3583(this.field3007, this.field3009, this.field3007.length - this.field3009);
            if (var1 == -1) {
                break;
            }
            this.field3011 += (long) var1;
            this.field3009 += var1;
        }
    }

    @ObfuscatedName("hu.k([BIII)V")
    public void method3602(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field3013 + (long) arg2 > this.field3012) {
                this.field3012 = this.field3013 + (long) arg2;
            }
            if (this.field3015 != -1L && (this.field3013 < this.field3015 || this.field3013 > this.field3015 + (long) this.field3014)) {
                this.method3603();
            }
            if (this.field3015 != -1L && this.field3013 + (long) arg2 > this.field3015 + (long) this.field3010.length) {
                int var4 = (int) ((long) this.field3010.length - (this.field3013 - this.field3015));
                System.arraycopy(arg0, arg1, this.field3010, (int) (this.field3013 - this.field3015), var4);
                this.field3013 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field3014 = this.field3010.length;
                this.method3603();
            }
            if (arg2 > this.field3010.length) {
                if (this.field3013 != this.field3011) {
                    this.field3006.method3580(this.field3013);
                    this.field3011 = this.field3013;
                }
                this.field3006.method3591(arg0, arg1, arg2);
                this.field3011 += (long) arg2;
                if (this.field3011 > this.field3017) {
                    this.field3017 = this.field3011;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field3013 >= this.field3008 && this.field3013 < this.field3008 + (long) this.field3009) {
                    var5 = this.field3013;
                } else if (this.field3008 >= this.field3013 && this.field3008 < this.field3013 + (long) arg2) {
                    var5 = this.field3008;
                }
                if (this.field3013 + (long) arg2 > this.field3008 && this.field3013 + (long) arg2 <= this.field3008 + (long) this.field3009) {
                    var7 = this.field3013 + (long) arg2;
                } else if (this.field3008 + (long) this.field3009 > this.field3013 && this.field3008 + (long) this.field3009 <= this.field3013 + (long) arg2) {
                    var7 = this.field3008 + (long) this.field3009;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field3013), this.field3007, (int) (var5 - this.field3008), var9);
                }
                this.field3013 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field3015 == -1L) {
                    this.field3015 = this.field3013;
                }
                System.arraycopy(arg0, arg1, this.field3010, (int) (this.field3013 - this.field3015), arg2);
                this.field3013 += (long) arg2;
                if (this.field3013 - this.field3015 > (long) this.field3014) {
                    this.field3014 = (int) (this.field3013 - this.field3015);
                }
            }
        } catch (IOException var11) {
            this.field3011 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("hu.p(B)V")
    public void method3603() throws IOException {
        if (this.field3015 == -1L) {
            return;
        }
        if (this.field3015 != this.field3011) {
            this.field3006.method3580(this.field3015);
            this.field3011 = this.field3015;
        }
        this.field3006.method3591(this.field3010, 0, this.field3014);
        this.field3011 += (long) (this.field3014 * 1017544171) * 986104515L;
        if (this.field3011 > this.field3017) {
            this.field3017 = this.field3011;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field3015 >= this.field3008 && this.field3015 < this.field3008 + (long) this.field3009) {
            var1 = this.field3015;
        } else if (this.field3008 >= this.field3015 && this.field3008 < this.field3015 + (long) this.field3014) {
            var1 = this.field3008;
        }
        if (this.field3015 + (long) this.field3014 > this.field3008 && this.field3015 + (long) this.field3014 <= this.field3008 + (long) this.field3009) {
            var3 = this.field3015 + (long) this.field3014;
        } else if (this.field3008 + (long) this.field3009 > this.field3015 && this.field3008 + (long) this.field3009 <= this.field3015 + (long) this.field3014) {
            var3 = this.field3008 + (long) this.field3009;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field3010, (int) (var1 - this.field3015), this.field3007, (int) (var1 - this.field3008), var5);
        }
        this.field3015 = -1L;
        this.field3014 = 0;
    }
}
