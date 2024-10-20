package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("ho")
public class class228 {

    @ObfuscatedName("ho.d")
    public class227 field3213;

    @ObfuscatedName("ho.p")
    public byte[] field3204;

    @ObfuscatedName("ho.v")
    public long field3205 = -1L;

    @ObfuscatedName("ho.l")
    public int field3207;

    @ObfuscatedName("ho.y")
    public byte[] field3208;

    @ObfuscatedName("ho.w")
    public long field3211 = -1L;

    @ObfuscatedName("ho.u")
    public int field3203 = 0;

    @ObfuscatedName("ho.a")
    public long field3210;

    @ObfuscatedName("ho.e")
    public long field3209;

    @ObfuscatedName("ho.b")
    public long field3212;

    @ObfuscatedName("ho.o")
    public long field3206;

    public class228(class227 arg0, int arg1, int arg2) throws IOException {
        this.field3213 = arg0;
        this.field3212 = this.field3209 = arg0.method3912();
        this.field3204 = new byte[arg1];
        this.field3208 = new byte[arg2];
        this.field3210 = 0L;
    }

    @ObfuscatedName("ho.d(S)V")
    public void method3934() throws IOException {
        this.method3943();
        this.field3213.method3927();
    }

    @ObfuscatedName("ho.p(J)V")
    public void method3942(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field3210 = arg0;
    }

    @ObfuscatedName("ho.v(I)J")
    public long method3949() {
        return this.field3212;
    }

    @ObfuscatedName("ho.l([BI)V")
    public void method3936(byte[] arg0) throws IOException {
        this.method3933(arg0, 0, arg0.length);
    }

    @ObfuscatedName("ho.y([BIII)V")
    public void method3933(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field3211 != -1L && this.field3210 >= this.field3211 && this.field3210 + (long) arg2 <= this.field3211 + (long) this.field3203) {
                System.arraycopy(this.field3208, (int) (this.field3210 - this.field3211), arg0, arg1, arg2);
                this.field3210 += (long) arg2;
                return;
            }
            long var4 = this.field3210;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field3210 >= this.field3205 && this.field3210 < this.field3205 + (long) this.field3207) {
                int var8 = (int) ((long) this.field3207 - (this.field3210 - this.field3205));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field3204, (int) (this.field3210 - this.field3205), arg0, arg1, var8);
                this.field3210 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field3204.length) {
                this.field3213.method3909(this.field3210);
                this.field3206 = this.field3210;
                while (arg2 > 0) {
                    int var9 = this.field3213.method3910(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field3206 += (long) var9;
                    this.field3210 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method3938();
                int var10 = arg2;
                if (arg2 > this.field3207) {
                    var10 = this.field3207;
                }
                System.arraycopy(this.field3204, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field3210 += (long) var10;
            }
            if (this.field3211 != -1L) {
                if (this.field3211 > this.field3210 && arg2 > 0) {
                    int var11 = (int) (this.field3211 - this.field3210) + arg1;
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
                if (this.field3211 >= var4 && this.field3211 < (long) var7 + var4) {
                    var12 = this.field3211;
                } else if (var4 >= this.field3211 && var4 < this.field3211 + (long) this.field3203) {
                    var12 = var4;
                }
                if (this.field3211 + (long) this.field3203 > var4 && this.field3211 + (long) this.field3203 <= (long) var7 + var4) {
                    var14 = this.field3211 + (long) this.field3203;
                } else if ((long) var7 + var4 > this.field3211 && (long) var7 + var4 <= this.field3211 + (long) this.field3203) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field3208, (int) (var12 - this.field3211), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field3210) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field3210));
                        this.field3210 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field3206 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("ho.w(B)V")
    public void method3938() throws IOException {
        this.field3207 = 0;
        if (this.field3210 != this.field3206) {
            this.field3213.method3909(this.field3210);
            this.field3206 = this.field3210;
        }
        this.field3205 = this.field3210;
        while (this.field3207 < this.field3204.length) {
            int var1 = this.field3213.method3910(this.field3204, this.field3207, this.field3204.length - this.field3207);
            if (var1 == -1) {
                break;
            }
            this.field3206 += (long) var1;
            this.field3207 += var1;
        }
    }

    @ObfuscatedName("ho.u([BIII)V")
    public void method3935(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field3210 + (long) arg2 > this.field3212) {
                this.field3212 = this.field3210 + (long) arg2;
            }
            if (this.field3211 != -1L && (this.field3210 < this.field3211 || this.field3210 > this.field3211 + (long) this.field3203)) {
                this.method3943();
            }
            if (this.field3211 != -1L && this.field3210 + (long) arg2 > this.field3211 + (long) this.field3208.length) {
                int var4 = (int) ((long) this.field3208.length - (this.field3210 - this.field3211));
                System.arraycopy(arg0, arg1, this.field3208, (int) (this.field3210 - this.field3211), var4);
                this.field3210 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field3203 = this.field3208.length;
                this.method3943();
            }
            if (arg2 > this.field3208.length) {
                if (this.field3210 != this.field3206) {
                    this.field3213.method3909(this.field3210);
                    this.field3206 = this.field3210;
                }
                this.field3213.method3931(arg0, arg1, arg2);
                this.field3206 += (long) arg2;
                if (this.field3206 > this.field3209) {
                    this.field3209 = this.field3206;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field3210 >= this.field3205 && this.field3210 < this.field3205 + (long) this.field3207) {
                    var5 = this.field3210;
                } else if (this.field3205 >= this.field3210 && this.field3205 < this.field3210 + (long) arg2) {
                    var5 = this.field3205;
                }
                if (this.field3210 + (long) arg2 > this.field3205 && this.field3210 + (long) arg2 <= this.field3205 + (long) this.field3207) {
                    var7 = this.field3210 + (long) arg2;
                } else if (this.field3205 + (long) this.field3207 > this.field3210 && this.field3205 + (long) this.field3207 <= this.field3210 + (long) arg2) {
                    var7 = this.field3205 + (long) this.field3207;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field3210), this.field3204, (int) (var5 - this.field3205), var9);
                }
                this.field3210 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field3211 == -1L) {
                    this.field3211 = this.field3210;
                }
                System.arraycopy(arg0, arg1, this.field3208, (int) (this.field3210 - this.field3211), arg2);
                this.field3210 += (long) arg2;
                if (this.field3210 - this.field3211 > (long) this.field3203) {
                    this.field3203 = (int) (this.field3210 - this.field3211);
                }
            }
        } catch (IOException var11) {
            this.field3206 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("ho.a(I)V")
    public void method3943() throws IOException {
        if (this.field3211 == -1L) {
            return;
        }
        if (this.field3211 != this.field3206) {
            this.field3213.method3909(this.field3211);
            this.field3206 = this.field3211;
        }
        this.field3213.method3931(this.field3208, 0, this.field3203);
        this.field3206 += (long) (this.field3203 * -1159298035) * 183200453L;
        if (this.field3206 > this.field3209) {
            this.field3209 = this.field3206;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field3211 >= this.field3205 && this.field3211 < this.field3205 + (long) this.field3207) {
            var1 = this.field3211;
        } else if (this.field3205 >= this.field3211 && this.field3205 < this.field3211 + (long) this.field3203) {
            var1 = this.field3205;
        }
        if (this.field3211 + (long) this.field3203 > this.field3205 && this.field3211 + (long) this.field3203 <= this.field3205 + (long) this.field3207) {
            var3 = this.field3211 + (long) this.field3203;
        } else if (this.field3205 + (long) this.field3207 > this.field3211 && this.field3205 + (long) this.field3207 <= this.field3211 + (long) this.field3203) {
            var3 = this.field3205 + (long) this.field3207;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field3208, (int) (var1 - this.field3211), this.field3204, (int) (var1 - this.field3205), var5);
        }
        this.field3211 = -1L;
        this.field3203 = 0;
    }
}
