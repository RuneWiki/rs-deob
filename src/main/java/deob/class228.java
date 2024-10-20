package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("hi")
public class class228 {

    @ObfuscatedName("hi.g")
    public class227 field3207;

    @ObfuscatedName("hi.b")
    public byte[] field3204;

    @ObfuscatedName("hi.w")
    public long field3205 = -1L;

    @ObfuscatedName("hi.d")
    public int field3206;

    @ObfuscatedName("hi.z")
    public byte[] field3203;

    @ObfuscatedName("hi.l")
    public long field3209 = -1L;

    @ObfuscatedName("hi.m")
    public int field3214 = 0;

    @ObfuscatedName("hi.p")
    public long field3210;

    @ObfuscatedName("hi.u")
    public long field3211;

    @ObfuscatedName("hi.c")
    public long field3212;

    @ObfuscatedName("hi.v")
    public long field3208;

    public class228(class227 arg0, int arg1, int arg2) throws IOException {
        this.field3207 = arg0;
        this.field3212 = this.field3211 = arg0.method3908();
        this.field3204 = new byte[arg1];
        this.field3203 = new byte[arg2];
        this.field3210 = 0L;
    }

    @ObfuscatedName("hi.g(B)V")
    public void method3920() throws IOException {
        this.method3927();
        this.field3207.method3900();
    }

    @ObfuscatedName("hi.b(J)V")
    public void method3936(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field3210 = arg0;
    }

    @ObfuscatedName("hi.w(I)J")
    public long method3928() {
        return this.field3212;
    }

    @ObfuscatedName("hi.d([BI)V")
    public void method3923(byte[] arg0) throws IOException {
        this.method3921(arg0, 0, arg0.length);
    }

    @ObfuscatedName("hi.z([BIII)V")
    public void method3921(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field3209 != -1L && this.field3210 >= this.field3209 && this.field3210 + (long) arg2 <= this.field3209 + (long) this.field3214) {
                System.arraycopy(this.field3203, (int) (this.field3210 - this.field3209), arg0, arg1, arg2);
                this.field3210 += (long) arg2;
                return;
            }
            long var4 = this.field3210;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field3210 >= this.field3205 && this.field3210 < this.field3205 + (long) this.field3206) {
                int var8 = (int) ((long) this.field3206 - (this.field3210 - this.field3205));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field3204, (int) (this.field3210 - this.field3205), arg0, arg1, var8);
                this.field3210 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field3204.length) {
                this.field3207.method3899(this.field3210);
                this.field3208 = this.field3210;
                while (arg2 > 0) {
                    int var9 = this.field3207.method3902(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field3208 += (long) var9;
                    this.field3210 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method3925();
                int var10 = arg2;
                if (arg2 > this.field3206) {
                    var10 = this.field3206;
                }
                System.arraycopy(this.field3204, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field3210 += (long) var10;
            }
            if (this.field3209 != -1L) {
                if (this.field3209 > this.field3210 && arg2 > 0) {
                    int var11 = (int) (this.field3209 - this.field3210) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field3210++;
                    }
                }
                long var12 = -1L;
                long var14 = -1L;
                if (this.field3209 >= var4 && this.field3209 < (long) var7 + var4) {
                    var12 = this.field3209;
                } else if (var4 >= this.field3209 && var4 < this.field3209 + (long) this.field3214) {
                    var12 = var4;
                }
                if (this.field3209 + (long) this.field3214 > var4 && this.field3209 + (long) this.field3214 <= (long) var7 + var4) {
                    var14 = this.field3209 + (long) this.field3214;
                } else if ((long) var7 + var4 > this.field3209 && (long) var7 + var4 <= this.field3209 + (long) this.field3214) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field3203, (int) (var12 - this.field3209), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field3210) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field3210));
                        this.field3210 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field3208 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("hi.l(B)V")
    public void method3925() throws IOException {
        this.field3206 = 0;
        if (this.field3210 != this.field3208) {
            this.field3207.method3899(this.field3210);
            this.field3208 = this.field3210;
        }
        this.field3205 = this.field3210;
        while (this.field3206 < this.field3204.length) {
            int var1 = this.field3207.method3902(this.field3204, this.field3206, this.field3204.length - this.field3206);
            if (var1 == -1) {
                break;
            }
            this.field3208 += (long) var1;
            this.field3206 += var1;
        }
    }

    @ObfuscatedName("hi.m([BIIB)V")
    public void method3926(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field3210 + (long) arg2 > this.field3212) {
                this.field3212 = this.field3210 + (long) arg2;
            }
            if (this.field3209 != -1L && (this.field3210 < this.field3209 || this.field3210 > this.field3209 + (long) this.field3214)) {
                this.method3927();
            }
            if (this.field3209 != -1L && this.field3210 + (long) arg2 > this.field3209 + (long) this.field3203.length) {
                int var4 = (int) ((long) this.field3203.length - (this.field3210 - this.field3209));
                System.arraycopy(arg0, arg1, this.field3203, (int) (this.field3210 - this.field3209), var4);
                this.field3210 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field3214 = this.field3203.length;
                this.method3927();
            }
            if (arg2 > this.field3203.length) {
                if (this.field3210 != this.field3208) {
                    this.field3207.method3899(this.field3210);
                    this.field3208 = this.field3210;
                }
                this.field3207.method3918(arg0, arg1, arg2);
                this.field3208 += (long) arg2;
                if (this.field3208 > this.field3211) {
                    this.field3211 = this.field3208;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field3210 >= this.field3205 && this.field3210 < this.field3205 + (long) this.field3206) {
                    var5 = this.field3210;
                } else if (this.field3205 >= this.field3210 && this.field3205 < this.field3210 + (long) arg2) {
                    var5 = this.field3205;
                }
                if (this.field3210 + (long) arg2 > this.field3205 && this.field3210 + (long) arg2 <= this.field3205 + (long) this.field3206) {
                    var7 = this.field3210 + (long) arg2;
                } else if (this.field3205 + (long) this.field3206 > this.field3210 && this.field3205 + (long) this.field3206 <= this.field3210 + (long) arg2) {
                    var7 = this.field3205 + (long) this.field3206;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field3210), this.field3204, (int) (var5 - this.field3205), var9);
                }
                this.field3210 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field3209 == -1L) {
                    this.field3209 = this.field3210;
                }
                System.arraycopy(arg0, arg1, this.field3203, (int) (this.field3210 - this.field3209), arg2);
                this.field3210 += (long) arg2;
                if (this.field3210 - this.field3209 > (long) this.field3214) {
                    this.field3214 = (int) (this.field3210 - this.field3209);
                }
            }
        } catch (IOException var11) {
            this.field3208 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("hi.p(I)V")
    public void method3927() throws IOException {
        if (this.field3209 == -1L) {
            return;
        }
        if (this.field3209 != this.field3208) {
            this.field3207.method3899(this.field3209);
            this.field3208 = this.field3209;
        }
        this.field3207.method3918(this.field3203, 0, this.field3214);
        this.field3208 += (long) (this.field3214 * -80203785) * -423411257L;
        if (this.field3208 > this.field3211) {
            this.field3211 = this.field3208;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field3209 >= this.field3205 && this.field3209 < this.field3205 + (long) this.field3206) {
            var1 = this.field3209;
        } else if (this.field3205 >= this.field3209 && this.field3205 < this.field3209 + (long) this.field3214) {
            var1 = this.field3205;
        }
        if (this.field3209 + (long) this.field3214 > this.field3205 && this.field3209 + (long) this.field3214 <= this.field3205 + (long) this.field3206) {
            var3 = this.field3209 + (long) this.field3214;
        } else if (this.field3205 + (long) this.field3206 > this.field3209 && this.field3205 + (long) this.field3206 <= this.field3209 + (long) this.field3214) {
            var3 = this.field3205 + (long) this.field3206;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field3203, (int) (var1 - this.field3209), this.field3204, (int) (var1 - this.field3205), var5);
        }
        this.field3209 = -1L;
        this.field3214 = 0;
    }
}
