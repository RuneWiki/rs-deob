package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("uj")
public class class538 {

    @ObfuscatedName("uj.aw")
    public class537 field5357;

    @ObfuscatedName("uj.ak")
    public byte[] field5358;

    @ObfuscatedName("uj.aj")
    public long field5359 = -1L;

    @ObfuscatedName("uj.ai")
    public int field5356;

    @ObfuscatedName("uj.ay")
    public byte[] field5360;

    @ObfuscatedName("uj.as")
    public long field5362 = -1L;

    @ObfuscatedName("uj.ae")
    public int field5363 = 0;

    @ObfuscatedName("uj.am")
    public long field5364;

    @ObfuscatedName("uj.at")
    public long field5361;

    @ObfuscatedName("uj.au")
    public long field5366;

    @ObfuscatedName("uj.an")
    public long field5367;

    public class538(class537 arg0, int arg1, int arg2) throws IOException {
        this.field5357 = arg0;
        this.field5366 = this.field5361 = arg0.method9031();
        this.field5358 = new byte[arg1];
        this.field5360 = new byte[arg2];
        this.field5364 = 0L;
    }

    @ObfuscatedName("uj.ap(B)V")
    public void method9074() throws IOException {
        this.method9055();
        this.field5357.method9027();
    }

    @ObfuscatedName("uj.aw(J)V")
    public void method9062(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field5364 = arg0;
    }

    @ObfuscatedName("uj.ak(B)J")
    public long method9050() {
        return this.field5366;
    }

    @ObfuscatedName("uj.aj([BI)V")
    public void method9051(byte[] arg0) throws IOException {
        this.method9049(arg0, 0, arg0.length);
    }

    @ObfuscatedName("uj.ai([BIII)V")
    public void method9049(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field5362 != -1L && this.field5364 >= this.field5362 && this.field5364 + (long) arg2 <= this.field5362 + (long) this.field5363) {
                System.arraycopy(this.field5360, (int) (this.field5364 - this.field5362), arg0, arg1, arg2);
                this.field5364 += (long) arg2;
                return;
            }
            long var4 = this.field5364;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field5364 >= this.field5359 && this.field5364 < this.field5359 + (long) this.field5356) {
                int var8 = (int) ((long) this.field5356 - (this.field5364 - this.field5359));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field5358, (int) (this.field5364 - this.field5359), arg0, arg1, var8);
                this.field5364 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field5358.length) {
                this.field5357.method9028(this.field5364);
                this.field5367 = this.field5364;
                while (arg2 > 0) {
                    int var9 = this.field5357.method9032(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field5367 += (long) var9;
                    this.field5364 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method9053();
                int var10 = arg2;
                if (arg2 > this.field5356) {
                    var10 = this.field5356;
                }
                System.arraycopy(this.field5358, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field5364 += (long) var10;
            }
            if (this.field5362 != -1L) {
                if (this.field5362 > this.field5364 && arg2 > 0) {
                    int var11 = (int) (this.field5362 - this.field5364) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field5364++;
                    }
                }
                long var12 = -1L;
                long var14 = -1L;
                if (this.field5362 >= var4 && this.field5362 < (long) var7 + var4) {
                    var12 = this.field5362;
                } else if (var4 >= this.field5362 && var4 < this.field5362 + (long) this.field5363) {
                    var12 = var4;
                }
                if (this.field5362 + (long) this.field5363 > var4 && this.field5362 + (long) this.field5363 <= (long) var7 + var4) {
                    var14 = this.field5362 + (long) this.field5363;
                } else if ((long) var7 + var4 > this.field5362 && (long) var7 + var4 <= this.field5362 + (long) this.field5363) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field5360, (int) (var12 - this.field5362), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field5364) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field5364));
                        this.field5364 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field5367 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("uj.ay(I)V")
    public void method9053() throws IOException {
        this.field5356 = 0;
        if (this.field5367 != this.field5364) {
            this.field5357.method9028(this.field5364);
            this.field5367 = this.field5364;
        }
        this.field5359 = this.field5364;
        while (this.field5356 < this.field5358.length) {
            int var1 = this.field5358.length - this.field5356;
            if (var1 > 200000000) {
                var1 = 200000000;
            }
            int var2 = this.field5357.method9032(this.field5358, this.field5356, var1);
            if (var2 == -1) {
                break;
            }
            this.field5367 += (long) var2;
            this.field5356 += var2;
        }
    }

    @ObfuscatedName("uj.as([BIII)V")
    public void method9054(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field5364 + (long) arg2 > this.field5366) {
                this.field5366 = this.field5364 + (long) arg2;
            }
            if (this.field5362 != -1L && (this.field5364 < this.field5362 || this.field5364 > this.field5362 + (long) this.field5363)) {
                this.method9055();
            }
            if (this.field5362 != -1L && this.field5364 + (long) arg2 > this.field5362 + (long) this.field5360.length) {
                int var4 = (int) ((long) this.field5360.length - (this.field5364 - this.field5362));
                System.arraycopy(arg0, arg1, this.field5360, (int) (this.field5364 - this.field5362), var4);
                this.field5364 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field5363 = this.field5360.length;
                this.method9055();
            }
            if (arg2 > this.field5360.length) {
                if (this.field5367 != this.field5364) {
                    this.field5357.method9028(this.field5364);
                    this.field5367 = this.field5364;
                }
                this.field5357.method9029(arg0, arg1, arg2);
                this.field5367 += (long) arg2;
                if (this.field5367 > this.field5361) {
                    this.field5361 = this.field5367;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field5364 >= this.field5359 && this.field5364 < this.field5359 + (long) this.field5356) {
                    var5 = this.field5364;
                } else if (this.field5359 >= this.field5364 && this.field5359 < this.field5364 + (long) arg2) {
                    var5 = this.field5359;
                }
                if (this.field5364 + (long) arg2 > this.field5359 && this.field5364 + (long) arg2 <= this.field5359 + (long) this.field5356) {
                    var7 = this.field5364 + (long) arg2;
                } else if (this.field5359 + (long) this.field5356 > this.field5364 && this.field5359 + (long) this.field5356 <= this.field5364 + (long) arg2) {
                    var7 = this.field5359 + (long) this.field5356;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field5364), this.field5358, (int) (var5 - this.field5359), var9);
                }
                this.field5364 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field5362 == -1L) {
                    this.field5362 = this.field5364;
                }
                System.arraycopy(arg0, arg1, this.field5360, (int) (this.field5364 - this.field5362), arg2);
                this.field5364 += (long) arg2;
                if (this.field5364 - this.field5362 > (long) this.field5363) {
                    this.field5363 = (int) (this.field5364 - this.field5362);
                }
            }
        } catch (IOException var11) {
            this.field5367 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("uj.ae(I)V")
    public void method9055() throws IOException {
        if (this.field5362 == -1L) {
            return;
        }
        if (this.field5367 != this.field5362) {
            this.field5357.method9028(this.field5362);
            this.field5367 = this.field5362;
        }
        this.field5357.method9029(this.field5360, 0, this.field5363);
        this.field5367 += (long) (this.field5363 * -1697975043) * -1320957867L;
        if (this.field5367 > this.field5361) {
            this.field5361 = this.field5367;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field5362 >= this.field5359 && this.field5362 < this.field5359 + (long) this.field5356) {
            var1 = this.field5362;
        } else if (this.field5359 >= this.field5362 && this.field5359 < this.field5362 + (long) this.field5363) {
            var1 = this.field5359;
        }
        if (this.field5362 + (long) this.field5363 > this.field5359 && this.field5362 + (long) this.field5363 <= this.field5359 + (long) this.field5356) {
            var3 = this.field5362 + (long) this.field5363;
        } else if (this.field5359 + (long) this.field5356 > this.field5362 && this.field5359 + (long) this.field5356 <= this.field5362 + (long) this.field5363) {
            var3 = this.field5359 + (long) this.field5356;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field5360, (int) (var1 - this.field5362), this.field5358, (int) (var1 - this.field5359), var5);
        }
        this.field5362 = -1L;
        this.field5363 = 0;
    }
}
