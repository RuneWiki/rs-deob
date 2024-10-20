package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("he")
public class class228 {

    @ObfuscatedName("he.j")
    public class227 field3208;

    @ObfuscatedName("he.m")
    public byte[] field3203;

    @ObfuscatedName("he.f")
    public long field3206 = -1L;

    @ObfuscatedName("he.l")
    public int field3205;

    @ObfuscatedName("he.u")
    public byte[] field3212;

    @ObfuscatedName("he.a")
    public long field3207 = -1L;

    @ObfuscatedName("he.h")
    public int field3202 = 0;

    @ObfuscatedName("he.i")
    public long field3209;

    @ObfuscatedName("he.t")
    public long field3210;

    @ObfuscatedName("he.k")
    public long field3211;

    @ObfuscatedName("he.s")
    public long field3204;

    public class228(class227 arg0, int arg1, int arg2) throws IOException {
        this.field3208 = arg0;
        this.field3211 = this.field3210 = arg0.method3903();
        this.field3203 = new byte[arg1];
        this.field3212 = new byte[arg2];
        this.field3209 = 0L;
    }

    @ObfuscatedName("he.j(I)V")
    public void method3916() throws IOException {
        this.method3934();
        this.field3208.method3910();
    }

    @ObfuscatedName("he.m(J)V")
    public void method3915(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field3209 = arg0;
    }

    @ObfuscatedName("he.f(I)J")
    public long method3918() {
        return this.field3211;
    }

    @ObfuscatedName("he.l([BB)V")
    public void method3917(byte[] arg0) throws IOException {
        this.method3920(arg0, 0, arg0.length);
    }

    @ObfuscatedName("he.u([BIII)V")
    public void method3920(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field3207 != -1L && this.field3209 >= this.field3207 && this.field3209 + (long) arg2 <= this.field3207 + (long) this.field3202) {
                System.arraycopy(this.field3212, (int) (this.field3209 - this.field3207), arg0, arg1, arg2);
                this.field3209 += (long) arg2;
                return;
            }
            long var4 = this.field3209;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field3209 >= this.field3206 && this.field3209 < this.field3206 + (long) this.field3205) {
                int var8 = (int) ((long) this.field3205 - (this.field3209 - this.field3206));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field3203, (int) (this.field3209 - this.field3206), arg0, arg1, var8);
                this.field3209 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field3203.length) {
                this.field3208.method3900(this.field3209);
                this.field3204 = this.field3209;
                while (arg2 > 0) {
                    int var9 = this.field3208.method3904(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field3204 += (long) var9;
                    this.field3209 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method3921();
                int var10 = arg2;
                if (arg2 > this.field3205) {
                    var10 = this.field3205;
                }
                System.arraycopy(this.field3203, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field3209 += (long) var10;
            }
            if (this.field3207 != -1L) {
                if (this.field3207 > this.field3209 && arg2 > 0) {
                    int var11 = (int) (this.field3207 - this.field3209) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field3209++;
                    }
                }
                long var12 = -1L;
                long var14 = -1L;
                if (this.field3207 >= var4 && this.field3207 < (long) var7 + var4) {
                    var12 = this.field3207;
                } else if (var4 >= this.field3207 && var4 < this.field3207 + (long) this.field3202) {
                    var12 = var4;
                }
                if (this.field3207 + (long) this.field3202 > var4 && this.field3207 + (long) this.field3202 <= (long) var7 + var4) {
                    var14 = this.field3207 + (long) this.field3202;
                } else if ((long) var7 + var4 > this.field3207 && (long) var7 + var4 <= this.field3207 + (long) this.field3202) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field3212, (int) (var12 - this.field3207), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field3209) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field3209));
                        this.field3209 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field3204 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("he.a(I)V")
    public void method3921() throws IOException {
        this.field3205 = 0;
        if (this.field3209 != this.field3204) {
            this.field3208.method3900(this.field3209);
            this.field3204 = this.field3209;
        }
        this.field3206 = this.field3209;
        while (this.field3205 < this.field3203.length) {
            int var1 = this.field3208.method3904(this.field3203, this.field3205, this.field3203.length - this.field3205);
            if (var1 == -1) {
                break;
            }
            this.field3204 += (long) var1;
            this.field3205 += var1;
        }
    }

    @ObfuscatedName("he.h([BIIS)V")
    public void method3922(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field3209 + (long) arg2 > this.field3211) {
                this.field3211 = this.field3209 + (long) arg2;
            }
            if (this.field3207 != -1L && (this.field3209 < this.field3207 || this.field3209 > this.field3207 + (long) this.field3202)) {
                this.method3934();
            }
            if (this.field3207 != -1L && this.field3209 + (long) arg2 > this.field3207 + (long) this.field3212.length) {
                int var4 = (int) ((long) this.field3212.length - (this.field3209 - this.field3207));
                System.arraycopy(arg0, arg1, this.field3212, (int) (this.field3209 - this.field3207), var4);
                this.field3209 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field3202 = this.field3212.length;
                this.method3934();
            }
            if (arg2 > this.field3212.length) {
                if (this.field3209 != this.field3204) {
                    this.field3208.method3900(this.field3209);
                    this.field3204 = this.field3209;
                }
                this.field3208.method3912(arg0, arg1, arg2);
                this.field3204 += (long) arg2;
                if (this.field3204 > this.field3210) {
                    this.field3210 = this.field3204;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field3209 >= this.field3206 && this.field3209 < this.field3206 + (long) this.field3205) {
                    var5 = this.field3209;
                } else if (this.field3206 >= this.field3209 && this.field3206 < this.field3209 + (long) arg2) {
                    var5 = this.field3206;
                }
                if (this.field3209 + (long) arg2 > this.field3206 && this.field3209 + (long) arg2 <= this.field3206 + (long) this.field3205) {
                    var7 = this.field3209 + (long) arg2;
                } else if (this.field3206 + (long) this.field3205 > this.field3209 && this.field3206 + (long) this.field3205 <= this.field3209 + (long) arg2) {
                    var7 = this.field3206 + (long) this.field3205;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field3209), this.field3203, (int) (var5 - this.field3206), var9);
                }
                this.field3209 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field3207 == -1L) {
                    this.field3207 = this.field3209;
                }
                System.arraycopy(arg0, arg1, this.field3212, (int) (this.field3209 - this.field3207), arg2);
                this.field3209 += (long) arg2;
                if (this.field3209 - this.field3207 > (long) this.field3202) {
                    this.field3202 = (int) (this.field3209 - this.field3207);
                }
            }
        } catch (IOException var11) {
            this.field3204 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("he.i(I)V")
    public void method3934() throws IOException {
        if (this.field3207 == -1L) {
            return;
        }
        if (this.field3207 != this.field3204) {
            this.field3208.method3900(this.field3207);
            this.field3204 = this.field3207;
        }
        this.field3208.method3912(this.field3212, 0, this.field3202);
        this.field3204 += (long) (this.field3202 * -1285544593) * 1668340111L;
        if (this.field3204 > this.field3210) {
            this.field3210 = this.field3204;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field3207 >= this.field3206 && this.field3207 < this.field3206 + (long) this.field3205) {
            var1 = this.field3207;
        } else if (this.field3206 >= this.field3207 && this.field3206 < this.field3207 + (long) this.field3202) {
            var1 = this.field3206;
        }
        if (this.field3207 + (long) this.field3202 > this.field3206 && this.field3207 + (long) this.field3202 <= this.field3206 + (long) this.field3205) {
            var3 = this.field3207 + (long) this.field3202;
        } else if (this.field3206 + (long) this.field3205 > this.field3207 && this.field3206 + (long) this.field3205 <= this.field3207 + (long) this.field3202) {
            var3 = this.field3206 + (long) this.field3205;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field3212, (int) (var1 - this.field3207), this.field3203, (int) (var1 - this.field3206), var5);
        }
        this.field3207 = -1L;
        this.field3202 = 0;
    }
}
