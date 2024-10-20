package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("u")
public class class14 {

    @ObfuscatedName("u.t")
    public class13 field209;

    @ObfuscatedName("u.n")
    public byte[] field206;

    @ObfuscatedName("u.q")
    public long field207 = -1L;

    @ObfuscatedName("u.h")
    public int field208;

    @ObfuscatedName("u.k")
    public byte[] field212;

    @ObfuscatedName("u.r")
    public long field210 = -1L;

    @ObfuscatedName("u.l")
    public int field214 = 0;

    @ObfuscatedName("u.i")
    public long field205;

    @ObfuscatedName("u.e")
    public long field213;

    @ObfuscatedName("u.a")
    public long field211;

    @ObfuscatedName("u.g")
    public long field215;

    public class14(class13 arg0, int arg1, int arg2) throws IOException {
        this.field209 = arg0;
        this.field211 = this.field213 = arg0.method121();
        this.field206 = new byte[arg1];
        this.field212 = new byte[arg2];
        this.field205 = 0L;
    }

    @ObfuscatedName("u.t(I)V")
    public void method151() throws IOException {
        this.method145();
        this.field209.method117();
    }

    @ObfuscatedName("u.n(J)V")
    public void method139(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field205 = arg0;
    }

    @ObfuscatedName("u.q(B)J")
    public long method138() {
        return this.field211;
    }

    @ObfuscatedName("u.h([BI)V")
    public void method146(byte[] arg0) throws IOException {
        this.method142(arg0, 0, arg0.length);
    }

    @ObfuscatedName("u.k([BIII)V")
    public void method142(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field210 != -1L && this.field205 >= this.field210 && this.field205 + (long) arg2 <= this.field210 + (long) this.field214) {
                System.arraycopy(this.field212, (int) (this.field205 - this.field210), arg0, arg1, arg2);
                this.field205 += (long) arg2;
                return;
            }
            long var4 = this.field205;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field205 >= this.field207 && this.field205 < this.field207 + (long) this.field208) {
                int var8 = (int) ((long) this.field208 - (this.field205 - this.field207));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field206, (int) (this.field205 - this.field207), arg0, arg1, var8);
                this.field205 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field206.length) {
                this.field209.method115(this.field205);
                this.field215 = this.field205;
                while (arg2 > 0) {
                    int var9 = this.field209.method118(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field215 += (long) var9;
                    this.field205 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method143();
                int var10 = arg2;
                if (arg2 > this.field208) {
                    var10 = this.field208;
                }
                System.arraycopy(this.field206, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field205 += (long) var10;
            }
            if (this.field210 != -1L) {
                if (this.field210 > this.field205 && arg2 > 0) {
                    int var11 = (int) (this.field210 - this.field205) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field205++;
                    }
                }
                long var12 = -1L;
                long var14 = -1L;
                if (this.field210 >= var4 && this.field210 < (long) var7 + var4) {
                    var12 = this.field210;
                } else if (var4 >= this.field210 && var4 < this.field210 + (long) this.field214) {
                    var12 = var4;
                }
                if (this.field210 + (long) this.field214 > var4 && this.field210 + (long) this.field214 <= (long) var7 + var4) {
                    var14 = this.field210 + (long) this.field214;
                } else if ((long) var7 + var4 > this.field210 && (long) var7 + var4 <= this.field210 + (long) this.field214) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field212, (int) (var12 - this.field210), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field205) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field205));
                        this.field205 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field215 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("u.r(I)V")
    public void method143() throws IOException {
        this.field208 = 0;
        if (this.field215 != this.field205) {
            this.field209.method115(this.field205);
            this.field215 = this.field205;
        }
        this.field207 = this.field205;
        while (this.field208 < this.field206.length) {
            int var1 = this.field209.method118(this.field206, this.field208, this.field206.length - this.field208);
            if (var1 == -1) {
                break;
            }
            this.field215 += (long) var1;
            this.field208 += var1;
        }
    }

    @ObfuscatedName("u.l([BIII)V")
    public void method144(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field205 + (long) arg2 > this.field211) {
                this.field211 = this.field205 + (long) arg2;
            }
            if (this.field210 != -1L && (this.field205 < this.field210 || this.field205 > this.field210 + (long) this.field214)) {
                this.method145();
            }
            if (this.field210 != -1L && this.field205 + (long) arg2 > this.field210 + (long) this.field212.length) {
                int var4 = (int) ((long) this.field212.length - (this.field205 - this.field210));
                System.arraycopy(arg0, arg1, this.field212, (int) (this.field205 - this.field210), var4);
                this.field205 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field214 = this.field212.length;
                this.method145();
            }
            if (arg2 > this.field212.length) {
                if (this.field215 != this.field205) {
                    this.field209.method115(this.field205);
                    this.field215 = this.field205;
                }
                this.field209.method125(arg0, arg1, arg2);
                this.field215 += (long) arg2;
                if (this.field215 > this.field213) {
                    this.field213 = this.field215;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field205 >= this.field207 && this.field205 < this.field207 + (long) this.field208) {
                    var5 = this.field205;
                } else if (this.field207 >= this.field205 && this.field207 < this.field205 + (long) arg2) {
                    var5 = this.field207;
                }
                if (this.field205 + (long) arg2 > this.field207 && this.field205 + (long) arg2 <= this.field207 + (long) this.field208) {
                    var7 = this.field205 + (long) arg2;
                } else if (this.field207 + (long) this.field208 > this.field205 && this.field207 + (long) this.field208 <= this.field205 + (long) arg2) {
                    var7 = this.field207 + (long) this.field208;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field205), this.field206, (int) (var5 - this.field207), var9);
                }
                this.field205 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field210 == -1L) {
                    this.field210 = this.field205;
                }
                System.arraycopy(arg0, arg1, this.field212, (int) (this.field205 - this.field210), arg2);
                this.field205 += (long) arg2;
                if (this.field205 - this.field210 > (long) this.field214) {
                    this.field214 = (int) (this.field205 - this.field210);
                }
            }
        } catch (IOException var11) {
            this.field215 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("u.i(B)V")
    public void method145() throws IOException {
        if (this.field210 == -1L) {
            return;
        }
        if (this.field215 != this.field210) {
            this.field209.method115(this.field210);
            this.field215 = this.field210;
        }
        this.field209.method125(this.field212, 0, this.field214);
        this.field215 += (long) (this.field214 * -548820941) * 1824101115L;
        if (this.field215 > this.field213) {
            this.field213 = this.field215;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field210 >= this.field207 && this.field210 < this.field207 + (long) this.field208) {
            var1 = this.field210;
        } else if (this.field207 >= this.field210 && this.field207 < this.field210 + (long) this.field214) {
            var1 = this.field207;
        }
        if (this.field210 + (long) this.field214 > this.field207 && this.field210 + (long) this.field214 <= this.field207 + (long) this.field208) {
            var3 = this.field210 + (long) this.field214;
        } else if (this.field207 + (long) this.field208 > this.field210 && this.field207 + (long) this.field208 <= this.field210 + (long) this.field214) {
            var3 = this.field207 + (long) this.field208;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field212, (int) (var1 - this.field210), this.field206, (int) (var1 - this.field207), var5);
        }
        this.field210 = -1L;
        this.field214 = 0;
    }
}
