package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("ha")
public class class228 {

    @ObfuscatedName("ha.k")
    public class227 field3215;

    @ObfuscatedName("ha.h")
    public byte[] field3205;

    @ObfuscatedName("ha.o")
    public long field3207 = -1L;

    @ObfuscatedName("ha.z")
    public int field3213;

    @ObfuscatedName("ha.c")
    public byte[] field3208;

    @ObfuscatedName("ha.d")
    public long field3209 = -1L;

    @ObfuscatedName("ha.l")
    public int field3210 = 0;

    @ObfuscatedName("ha.b")
    public long field3204;

    @ObfuscatedName("ha.j")
    public long field3212;

    @ObfuscatedName("ha.f")
    public long field3211;

    @ObfuscatedName("ha.i")
    public long field3214;

    public class228(class227 arg0, int arg1, int arg2) throws IOException {
        this.field3215 = arg0;
        this.field3211 = this.field3212 = arg0.method3872();
        this.field3205 = new byte[arg1];
        this.field3208 = new byte[arg2];
        this.field3204 = 0L;
    }

    @ObfuscatedName("ha.k(B)V")
    public void method3885() throws IOException {
        this.method3887();
        this.field3215.method3865();
    }

    @ObfuscatedName("ha.h(J)V")
    public void method3881(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field3204 = arg0;
    }

    @ObfuscatedName("ha.o(S)J")
    public long method3882() {
        return this.field3211;
    }

    @ObfuscatedName("ha.z([BS)V")
    public void method3904(byte[] arg0) throws IOException {
        this.method3884(arg0, 0, arg0.length);
    }

    @ObfuscatedName("ha.c([BIII)V")
    public void method3884(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field3209 != -1L && this.field3204 >= this.field3209 && this.field3204 + (long) arg2 <= this.field3209 + (long) this.field3210) {
                System.arraycopy(this.field3208, (int) (this.field3204 - this.field3209), arg0, arg1, arg2);
                this.field3204 += (long) arg2;
                return;
            }
            long var4 = this.field3204;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field3204 >= this.field3207 && this.field3204 < this.field3207 + (long) this.field3213) {
                int var8 = (int) ((long) this.field3213 - (this.field3204 - this.field3207));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field3205, (int) (this.field3204 - this.field3207), arg0, arg1, var8);
                this.field3204 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field3205.length) {
                this.field3215.method3863(this.field3204);
                this.field3214 = this.field3204;
                while (arg2 > 0) {
                    int var9 = this.field3215.method3868(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field3214 += (long) var9;
                    this.field3204 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method3895();
                int var10 = arg2;
                if (arg2 > this.field3213) {
                    var10 = this.field3213;
                }
                System.arraycopy(this.field3205, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field3204 += (long) var10;
            }
            if (this.field3209 != -1L) {
                if (this.field3209 > this.field3204 && arg2 > 0) {
                    int var11 = (int) (this.field3209 - this.field3204) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field3204++;
                    }
                }
                long var12 = -1L;
                long var14 = -1L;
                if (this.field3209 >= var4 && this.field3209 < (long) var7 + var4) {
                    var12 = this.field3209;
                } else if (var4 >= this.field3209 && var4 < this.field3209 + (long) this.field3210) {
                    var12 = var4;
                }
                if (this.field3209 + (long) this.field3210 > var4 && this.field3209 + (long) this.field3210 <= (long) var7 + var4) {
                    var14 = this.field3209 + (long) this.field3210;
                } else if ((long) var7 + var4 > this.field3209 && (long) var7 + var4 <= this.field3209 + (long) this.field3210) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field3208, (int) (var12 - this.field3209), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field3204) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field3204));
                        this.field3204 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field3214 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("ha.d(I)V")
    public void method3895() throws IOException {
        this.field3213 = 0;
        if (this.field3214 != this.field3204) {
            this.field3215.method3863(this.field3204);
            this.field3214 = this.field3204;
        }
        this.field3207 = this.field3204;
        while (this.field3213 < this.field3205.length) {
            int var1 = this.field3215.method3868(this.field3205, this.field3213, this.field3205.length - this.field3213);
            if (var1 == -1) {
                break;
            }
            this.field3214 += (long) var1;
            this.field3213 += var1;
        }
    }

    @ObfuscatedName("ha.l([BIII)V")
    public void method3886(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field3204 + (long) arg2 > this.field3211) {
                this.field3211 = this.field3204 + (long) arg2;
            }
            if (this.field3209 != -1L && (this.field3204 < this.field3209 || this.field3204 > this.field3209 + (long) this.field3210)) {
                this.method3887();
            }
            if (this.field3209 != -1L && this.field3204 + (long) arg2 > this.field3209 + (long) this.field3208.length) {
                int var4 = (int) ((long) this.field3208.length - (this.field3204 - this.field3209));
                System.arraycopy(arg0, arg1, this.field3208, (int) (this.field3204 - this.field3209), var4);
                this.field3204 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field3210 = this.field3208.length;
                this.method3887();
            }
            if (arg2 > this.field3208.length) {
                if (this.field3214 != this.field3204) {
                    this.field3215.method3863(this.field3204);
                    this.field3214 = this.field3204;
                }
                this.field3215.method3864(arg0, arg1, arg2);
                this.field3214 += (long) arg2;
                if (this.field3214 > this.field3212) {
                    this.field3212 = this.field3214;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field3204 >= this.field3207 && this.field3204 < this.field3207 + (long) this.field3213) {
                    var5 = this.field3204;
                } else if (this.field3207 >= this.field3204 && this.field3207 < this.field3204 + (long) arg2) {
                    var5 = this.field3207;
                }
                if (this.field3204 + (long) arg2 > this.field3207 && this.field3204 + (long) arg2 <= this.field3207 + (long) this.field3213) {
                    var7 = this.field3204 + (long) arg2;
                } else if (this.field3207 + (long) this.field3213 > this.field3204 && this.field3207 + (long) this.field3213 <= this.field3204 + (long) arg2) {
                    var7 = this.field3207 + (long) this.field3213;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field3204), this.field3205, (int) (var5 - this.field3207), var9);
                }
                this.field3204 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field3209 == -1L) {
                    this.field3209 = this.field3204;
                }
                System.arraycopy(arg0, arg1, this.field3208, (int) (this.field3204 - this.field3209), arg2);
                this.field3204 += (long) arg2;
                if (this.field3204 - this.field3209 > (long) this.field3210) {
                    this.field3210 = (int) (this.field3204 - this.field3209);
                }
            }
        } catch (IOException var11) {
            this.field3214 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("ha.b(B)V")
    public void method3887() throws IOException {
        if (this.field3209 == -1L) {
            return;
        }
        if (this.field3214 != this.field3209) {
            this.field3215.method3863(this.field3209);
            this.field3214 = this.field3209;
        }
        this.field3215.method3864(this.field3208, 0, this.field3210);
        this.field3214 += (long) (this.field3210 * 2088434309) * -1809846707L;
        if (this.field3214 > this.field3212) {
            this.field3212 = this.field3214;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field3209 >= this.field3207 && this.field3209 < this.field3207 + (long) this.field3213) {
            var1 = this.field3209;
        } else if (this.field3207 >= this.field3209 && this.field3207 < this.field3209 + (long) this.field3210) {
            var1 = this.field3207;
        }
        if (this.field3209 + (long) this.field3210 > this.field3207 && this.field3209 + (long) this.field3210 <= this.field3207 + (long) this.field3213) {
            var3 = this.field3209 + (long) this.field3210;
        } else if (this.field3207 + (long) this.field3213 > this.field3209 && this.field3207 + (long) this.field3213 <= this.field3209 + (long) this.field3210) {
            var3 = this.field3207 + (long) this.field3213;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field3208, (int) (var1 - this.field3209), this.field3205, (int) (var1 - this.field3207), var5);
        }
        this.field3209 = -1L;
        this.field3210 = 0;
    }
}
