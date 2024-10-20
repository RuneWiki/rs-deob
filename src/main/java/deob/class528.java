package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("uf")
public class class528 {

    @ObfuscatedName("uf.ad")
    public class527 field5267;

    @ObfuscatedName("uf.ag")
    public byte[] field5268;

    @ObfuscatedName("uf.ak")
    public long field5275 = -1L;

    @ObfuscatedName("uf.ap")
    public int field5270;

    @ObfuscatedName("uf.an")
    public byte[] field5271;

    @ObfuscatedName("uf.aj")
    public long field5272 = -1L;

    @ObfuscatedName("uf.av")
    public int field5273 = 0;

    @ObfuscatedName("uf.ab")
    public long field5274;

    @ObfuscatedName("uf.ai")
    public long field5266;

    @ObfuscatedName("uf.ae")
    public long field5277;

    @ObfuscatedName("uf.au")
    public long field5269;

    public class528(class527 arg0, int arg1, int arg2) throws IOException {
        this.field5267 = arg0;
        this.field5277 = this.field5266 = arg0.method8508();
        this.field5268 = new byte[arg1];
        this.field5271 = new byte[arg2];
        this.field5274 = 0L;
    }

    @ObfuscatedName("uf.aq(I)V")
    public void method8528() throws IOException {
        this.method8535();
        this.field5267.method8506();
    }

    @ObfuscatedName("uf.ad(J)V")
    public void method8529(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field5274 = arg0;
    }

    @ObfuscatedName("uf.ag(I)J")
    public long method8543() {
        return this.field5277;
    }

    @ObfuscatedName("uf.ak([BB)V")
    public void method8545(byte[] arg0) throws IOException {
        this.method8532(arg0, 0, arg0.length);
    }

    @ObfuscatedName("uf.ap([BIII)V")
    public void method8532(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field5272 != -1L && this.field5274 >= this.field5272 && this.field5274 + (long) arg2 <= this.field5272 + (long) this.field5273) {
                System.arraycopy(this.field5271, (int) (this.field5274 - this.field5272), arg0, arg1, arg2);
                this.field5274 += (long) arg2;
                return;
            }
            long var4 = this.field5274;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field5274 >= this.field5275 && this.field5274 < this.field5275 + (long) this.field5270) {
                int var8 = (int) ((long) this.field5270 - (this.field5274 - this.field5275));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field5268, (int) (this.field5274 - this.field5275), arg0, arg1, var8);
                this.field5274 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field5268.length) {
                this.field5267.method8504(this.field5274);
                this.field5269 = this.field5274;
                while (arg2 > 0) {
                    int var9 = this.field5267.method8524(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field5269 += (long) var9;
                    this.field5274 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method8533();
                int var10 = arg2;
                if (arg2 > this.field5270) {
                    var10 = this.field5270;
                }
                System.arraycopy(this.field5268, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field5274 += (long) var10;
            }
            if (this.field5272 != -1L) {
                if (this.field5272 > this.field5274 && arg2 > 0) {
                    int var11 = (int) (this.field5272 - this.field5274) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field5274++;
                    }
                }
                long var12 = -1L;
                long var14 = -1L;
                if (this.field5272 >= var4 && this.field5272 < (long) var7 + var4) {
                    var12 = this.field5272;
                } else if (var4 >= this.field5272 && var4 < this.field5272 + (long) this.field5273) {
                    var12 = var4;
                }
                if (this.field5272 + (long) this.field5273 > var4 && this.field5272 + (long) this.field5273 <= (long) var7 + var4) {
                    var14 = this.field5272 + (long) this.field5273;
                } else if ((long) var7 + var4 > this.field5272 && (long) var7 + var4 <= this.field5272 + (long) this.field5273) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field5271, (int) (var12 - this.field5272), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field5274) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field5274));
                        this.field5274 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field5269 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("uf.an(I)V")
    public void method8533() throws IOException {
        this.field5270 = 0;
        if (this.field5274 != this.field5269) {
            this.field5267.method8504(this.field5274);
            this.field5269 = this.field5274;
        }
        this.field5275 = this.field5274;
        while (this.field5270 < this.field5268.length) {
            int var1 = this.field5268.length - this.field5270;
            if (var1 > 200000000) {
                var1 = 200000000;
            }
            int var2 = this.field5267.method8524(this.field5268, this.field5270, var1);
            if (var2 == -1) {
                break;
            }
            this.field5269 += (long) var2;
            this.field5270 += var2;
        }
    }

    @ObfuscatedName("uf.aj([BIII)V")
    public void method8552(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field5274 + (long) arg2 > this.field5277) {
                this.field5277 = this.field5274 + (long) arg2;
            }
            if (this.field5272 != -1L && (this.field5274 < this.field5272 || this.field5274 > this.field5272 + (long) this.field5273)) {
                this.method8535();
            }
            if (this.field5272 != -1L && this.field5274 + (long) arg2 > this.field5272 + (long) this.field5271.length) {
                int var4 = (int) ((long) this.field5271.length - (this.field5274 - this.field5272));
                System.arraycopy(arg0, arg1, this.field5271, (int) (this.field5274 - this.field5272), var4);
                this.field5274 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field5273 = this.field5271.length;
                this.method8535();
            }
            if (arg2 > this.field5271.length) {
                if (this.field5274 != this.field5269) {
                    this.field5267.method8504(this.field5274);
                    this.field5269 = this.field5274;
                }
                this.field5267.method8511(arg0, arg1, arg2);
                this.field5269 += (long) arg2;
                if (this.field5269 > this.field5266) {
                    this.field5266 = this.field5269;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field5274 >= this.field5275 && this.field5274 < this.field5275 + (long) this.field5270) {
                    var5 = this.field5274;
                } else if (this.field5275 >= this.field5274 && this.field5275 < this.field5274 + (long) arg2) {
                    var5 = this.field5275;
                }
                if (this.field5274 + (long) arg2 > this.field5275 && this.field5274 + (long) arg2 <= this.field5275 + (long) this.field5270) {
                    var7 = this.field5274 + (long) arg2;
                } else if (this.field5275 + (long) this.field5270 > this.field5274 && this.field5275 + (long) this.field5270 <= this.field5274 + (long) arg2) {
                    var7 = this.field5275 + (long) this.field5270;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field5274), this.field5268, (int) (var5 - this.field5275), var9);
                }
                this.field5274 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field5272 == -1L) {
                    this.field5272 = this.field5274;
                }
                System.arraycopy(arg0, arg1, this.field5271, (int) (this.field5274 - this.field5272), arg2);
                this.field5274 += (long) arg2;
                if (this.field5274 - this.field5272 > (long) this.field5273) {
                    this.field5273 = (int) (this.field5274 - this.field5272);
                }
            }
        } catch (IOException var11) {
            this.field5269 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("uf.av(B)V")
    public void method8535() throws IOException {
        if (this.field5272 == -1L) {
            return;
        }
        if (this.field5272 != this.field5269) {
            this.field5267.method8504(this.field5272);
            this.field5269 = this.field5272;
        }
        this.field5267.method8511(this.field5271, 0, this.field5273);
        this.field5269 += (long) (this.field5273 * 2011049699) * 2105706187L;
        if (this.field5269 > this.field5266) {
            this.field5266 = this.field5269;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field5272 >= this.field5275 && this.field5272 < this.field5275 + (long) this.field5270) {
            var1 = this.field5272;
        } else if (this.field5275 >= this.field5272 && this.field5275 < this.field5272 + (long) this.field5273) {
            var1 = this.field5275;
        }
        if (this.field5272 + (long) this.field5273 > this.field5275 && this.field5272 + (long) this.field5273 <= this.field5275 + (long) this.field5270) {
            var3 = this.field5272 + (long) this.field5273;
        } else if (this.field5275 + (long) this.field5270 > this.field5272 && this.field5275 + (long) this.field5270 <= this.field5272 + (long) this.field5273) {
            var3 = this.field5275 + (long) this.field5270;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field5271, (int) (var1 - this.field5272), this.field5268, (int) (var1 - this.field5275), var5);
        }
        this.field5272 = -1L;
        this.field5273 = 0;
    }
}
