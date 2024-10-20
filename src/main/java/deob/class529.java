package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("uv")
public class class529 {

    @ObfuscatedName("uv.ay")
    public class528 field5270;

    @ObfuscatedName("uv.an")
    public byte[] field5271;

    @ObfuscatedName("uv.au")
    public long field5279 = -1L;

    @ObfuscatedName("uv.ax")
    public int field5272;

    @ObfuscatedName("uv.ao")
    public byte[] field5280;

    @ObfuscatedName("uv.am")
    public long field5275 = -1L;

    @ObfuscatedName("uv.ac")
    public int field5276 = 0;

    @ObfuscatedName("uv.ae")
    public long field5277;

    @ObfuscatedName("uv.ad")
    public long field5278;

    @ObfuscatedName("uv.aq")
    public long field5269;

    @ObfuscatedName("uv.al")
    public long field5273;

    public class529(class528 arg0, int arg1, int arg2) throws IOException {
        this.field5270 = arg0;
        this.field5269 = this.field5278 = arg0.method8578();
        this.field5271 = new byte[arg1];
        this.field5280 = new byte[arg2];
        this.field5277 = 0L;
    }

    @ObfuscatedName("uv.ab(I)V")
    public void method8596() throws IOException {
        this.method8603();
        this.field5270.method8576();
    }

    @ObfuscatedName("uv.ay(J)V")
    public void method8597(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field5277 = arg0;
    }

    @ObfuscatedName("uv.an(I)J")
    public long method8598() {
        return this.field5269;
    }

    @ObfuscatedName("uv.au([BB)V")
    public void method8599(byte[] arg0) throws IOException {
        this.method8608(arg0, 0, arg0.length);
    }

    @ObfuscatedName("uv.ax([BIIB)V")
    public void method8608(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field5275 != -1L && this.field5277 >= this.field5275 && this.field5277 + (long) arg2 <= this.field5275 + (long) this.field5276) {
                System.arraycopy(this.field5280, (int) (this.field5277 - this.field5275), arg0, arg1, arg2);
                this.field5277 += (long) arg2;
                return;
            }
            long var4 = this.field5277;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field5277 >= this.field5279 && this.field5277 < this.field5279 + (long) this.field5272) {
                int var8 = (int) ((long) this.field5272 - (this.field5277 - this.field5279));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field5271, (int) (this.field5277 - this.field5279), arg0, arg1, var8);
                this.field5277 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field5271.length) {
                this.field5270.method8579(this.field5277);
                this.field5273 = this.field5277;
                while (arg2 > 0) {
                    int var9 = this.field5270.method8594(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field5273 += (long) var9;
                    this.field5277 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method8613();
                int var10 = arg2;
                if (arg2 > this.field5272) {
                    var10 = this.field5272;
                }
                System.arraycopy(this.field5271, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field5277 += (long) var10;
            }
            if (this.field5275 != -1L) {
                if (this.field5275 > this.field5277 && arg2 > 0) {
                    int var11 = (int) (this.field5275 - this.field5277) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field5277++;
                    }
                }
                long var12 = -1L;
                long var14 = -1L;
                if (this.field5275 >= var4 && this.field5275 < (long) var7 + var4) {
                    var12 = this.field5275;
                } else if (var4 >= this.field5275 && var4 < this.field5275 + (long) this.field5276) {
                    var12 = var4;
                }
                if (this.field5275 + (long) this.field5276 > var4 && this.field5275 + (long) this.field5276 <= (long) var7 + var4) {
                    var14 = this.field5275 + (long) this.field5276;
                } else if ((long) var7 + var4 > this.field5275 && (long) var7 + var4 <= this.field5275 + (long) this.field5276) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field5280, (int) (var12 - this.field5275), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field5277) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field5277));
                        this.field5277 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field5273 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("uv.ao(I)V")
    public void method8613() throws IOException {
        this.field5272 = 0;
        if (this.field5277 != this.field5273) {
            this.field5270.method8579(this.field5277);
            this.field5273 = this.field5277;
        }
        this.field5279 = this.field5277;
        while (this.field5272 < this.field5271.length) {
            int var1 = this.field5271.length - this.field5272;
            if (var1 > 200000000) {
                var1 = 200000000;
            }
            int var2 = this.field5270.method8594(this.field5271, this.field5272, var1);
            if (var2 == -1) {
                break;
            }
            this.field5273 += (long) var2;
            this.field5272 += var2;
        }
    }

    @ObfuscatedName("uv.am([BIII)V")
    public void method8611(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field5277 + (long) arg2 > this.field5269) {
                this.field5269 = this.field5277 + (long) arg2;
            }
            if (this.field5275 != -1L && (this.field5277 < this.field5275 || this.field5277 > this.field5275 + (long) this.field5276)) {
                this.method8603();
            }
            if (this.field5275 != -1L && this.field5277 + (long) arg2 > this.field5275 + (long) this.field5280.length) {
                int var4 = (int) ((long) this.field5280.length - (this.field5277 - this.field5275));
                System.arraycopy(arg0, arg1, this.field5280, (int) (this.field5277 - this.field5275), var4);
                this.field5277 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field5276 = this.field5280.length;
                this.method8603();
            }
            if (arg2 > this.field5280.length) {
                if (this.field5277 != this.field5273) {
                    this.field5270.method8579(this.field5277);
                    this.field5273 = this.field5277;
                }
                this.field5270.method8588(arg0, arg1, arg2);
                this.field5273 += (long) arg2;
                if (this.field5273 > this.field5278) {
                    this.field5278 = this.field5273;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field5277 >= this.field5279 && this.field5277 < this.field5279 + (long) this.field5272) {
                    var5 = this.field5277;
                } else if (this.field5279 >= this.field5277 && this.field5279 < this.field5277 + (long) arg2) {
                    var5 = this.field5279;
                }
                if (this.field5277 + (long) arg2 > this.field5279 && this.field5277 + (long) arg2 <= this.field5279 + (long) this.field5272) {
                    var7 = this.field5277 + (long) arg2;
                } else if (this.field5279 + (long) this.field5272 > this.field5277 && this.field5279 + (long) this.field5272 <= this.field5277 + (long) arg2) {
                    var7 = this.field5279 + (long) this.field5272;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field5277), this.field5271, (int) (var5 - this.field5279), var9);
                }
                this.field5277 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field5275 == -1L) {
                    this.field5275 = this.field5277;
                }
                System.arraycopy(arg0, arg1, this.field5280, (int) (this.field5277 - this.field5275), arg2);
                this.field5277 += (long) arg2;
                if (this.field5277 - this.field5275 > (long) this.field5276) {
                    this.field5276 = (int) (this.field5277 - this.field5275);
                }
            }
        } catch (IOException var11) {
            this.field5273 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("uv.ac(B)V")
    public void method8603() throws IOException {
        if (this.field5275 == -1L) {
            return;
        }
        if (this.field5275 != this.field5273) {
            this.field5270.method8579(this.field5275);
            this.field5273 = this.field5275;
        }
        this.field5270.method8588(this.field5280, 0, this.field5276);
        this.field5273 += (long) (this.field5276 * 1362427055) * -1369974193L;
        if (this.field5273 > this.field5278) {
            this.field5278 = this.field5273;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field5275 >= this.field5279 && this.field5275 < this.field5279 + (long) this.field5272) {
            var1 = this.field5275;
        } else if (this.field5279 >= this.field5275 && this.field5279 < this.field5275 + (long) this.field5276) {
            var1 = this.field5279;
        }
        if (this.field5275 + (long) this.field5276 > this.field5279 && this.field5275 + (long) this.field5276 <= this.field5279 + (long) this.field5272) {
            var3 = this.field5275 + (long) this.field5276;
        } else if (this.field5279 + (long) this.field5272 > this.field5275 && this.field5279 + (long) this.field5272 <= this.field5275 + (long) this.field5276) {
            var3 = this.field5279 + (long) this.field5272;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field5280, (int) (var1 - this.field5275), this.field5271, (int) (var1 - this.field5279), var5);
        }
        this.field5275 = -1L;
        this.field5276 = 0;
    }
}
