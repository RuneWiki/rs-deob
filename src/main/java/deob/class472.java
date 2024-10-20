package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("sj")
public class class472 {

    @ObfuscatedName("sj.an")
    public class471 field4927;

    @ObfuscatedName("sj.aw")
    public byte[] field4926;

    @ObfuscatedName("sj.ac")
    public long field4931 = -1L;

    @ObfuscatedName("sj.au")
    public int field4925;

    @ObfuscatedName("sj.ab")
    public byte[] field4929;

    @ObfuscatedName("sj.aq")
    public long field4928 = -1L;

    @ObfuscatedName("sj.al")
    public int field4930 = 0;

    @ObfuscatedName("sj.at")
    public long field4932;

    @ObfuscatedName("sj.aa")
    public long field4933;

    @ObfuscatedName("sj.ay")
    public long field4934;

    @ObfuscatedName("sj.ao")
    public long field4935;

    public class472(class471 arg0, int arg1, int arg2) throws IOException {
        this.field4927 = arg0;
        this.field4934 = this.field4933 = arg0.method8010();
        this.field4926 = new byte[arg1];
        this.field4929 = new byte[arg2];
        this.field4932 = 0L;
    }

    @ObfuscatedName("sj.af(I)V")
    public void method8026() throws IOException {
        this.method8029();
        this.field4927.method8005();
    }

    @ObfuscatedName("sj.an(J)V")
    public void method8027(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field4932 = arg0;
    }

    @ObfuscatedName("sj.aw(S)J")
    public long method8038() {
        return this.field4934;
    }

    @ObfuscatedName("sj.ac([BI)V")
    public void method8031(byte[] arg0) throws IOException {
        this.method8030(arg0, 0, arg0.length);
    }

    @ObfuscatedName("sj.au([BIII)V")
    public void method8030(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field4928 != -1L && this.field4932 >= this.field4928 && this.field4932 + (long) arg2 <= this.field4928 + (long) this.field4930) {
                System.arraycopy(this.field4929, (int) (this.field4932 - this.field4928), arg0, arg1, arg2);
                this.field4932 += (long) arg2;
                return;
            }
            long var4 = this.field4932;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field4932 >= this.field4931 && this.field4932 < this.field4931 + (long) this.field4925) {
                int var8 = (int) ((long) this.field4925 - (this.field4932 - this.field4931));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field4926, (int) (this.field4932 - this.field4931), arg0, arg1, var8);
                this.field4932 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field4926.length) {
                this.field4927.method8006(this.field4932);
                this.field4935 = this.field4932;
                while (arg2 > 0) {
                    int var9 = this.field4927.method8011(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field4935 += (long) var9;
                    this.field4932 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method8035();
                int var10 = arg2;
                if (arg2 > this.field4925) {
                    var10 = this.field4925;
                }
                System.arraycopy(this.field4926, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field4932 += (long) var10;
            }
            if (this.field4928 != -1L) {
                if (this.field4928 > this.field4932 && arg2 > 0) {
                    int var11 = (int) (this.field4928 - this.field4932) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field4932++;
                    }
                }
                long var12 = -1L;
                long var14 = -1L;
                if (this.field4928 >= var4 && this.field4928 < (long) var7 + var4) {
                    var12 = this.field4928;
                } else if (var4 >= this.field4928 && var4 < this.field4928 + (long) this.field4930) {
                    var12 = var4;
                }
                if (this.field4928 + (long) this.field4930 > var4 && this.field4928 + (long) this.field4930 <= (long) var7 + var4) {
                    var14 = this.field4928 + (long) this.field4930;
                } else if ((long) var7 + var4 > this.field4928 && (long) var7 + var4 <= this.field4928 + (long) this.field4930) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field4929, (int) (var12 - this.field4928), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field4932) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field4932));
                        this.field4932 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field4935 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("sj.ab(B)V")
    public void method8035() throws IOException {
        this.field4925 = 0;
        if (this.field4935 != this.field4932) {
            this.field4927.method8006(this.field4932);
            this.field4935 = this.field4932;
        }
        this.field4931 = this.field4932;
        while (this.field4925 < this.field4926.length) {
            int var1 = this.field4926.length - this.field4925;
            if (var1 > 200000000) {
                var1 = 200000000;
            }
            int var2 = this.field4927.method8011(this.field4926, this.field4925, var1);
            if (var2 == -1) {
                break;
            }
            this.field4935 += (long) var2;
            this.field4925 += var2;
        }
    }

    @ObfuscatedName("sj.aq([BIIB)V")
    public void method8033(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field4932 + (long) arg2 > this.field4934) {
                this.field4934 = this.field4932 + (long) arg2;
            }
            if (this.field4928 != -1L && (this.field4932 < this.field4928 || this.field4932 > this.field4928 + (long) this.field4930)) {
                this.method8029();
            }
            if (this.field4928 != -1L && this.field4932 + (long) arg2 > this.field4928 + (long) this.field4929.length) {
                int var4 = (int) ((long) this.field4929.length - (this.field4932 - this.field4928));
                System.arraycopy(arg0, arg1, this.field4929, (int) (this.field4932 - this.field4928), var4);
                this.field4932 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field4930 = this.field4929.length;
                this.method8029();
            }
            if (arg2 > this.field4929.length) {
                if (this.field4935 != this.field4932) {
                    this.field4927.method8006(this.field4932);
                    this.field4935 = this.field4932;
                }
                this.field4927.method8023(arg0, arg1, arg2);
                this.field4935 += (long) arg2;
                if (this.field4935 > this.field4933) {
                    this.field4933 = this.field4935;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field4932 >= this.field4931 && this.field4932 < this.field4931 + (long) this.field4925) {
                    var5 = this.field4932;
                } else if (this.field4931 >= this.field4932 && this.field4931 < this.field4932 + (long) arg2) {
                    var5 = this.field4931;
                }
                if (this.field4932 + (long) arg2 > this.field4931 && this.field4932 + (long) arg2 <= this.field4931 + (long) this.field4925) {
                    var7 = this.field4932 + (long) arg2;
                } else if (this.field4931 + (long) this.field4925 > this.field4932 && this.field4931 + (long) this.field4925 <= this.field4932 + (long) arg2) {
                    var7 = this.field4931 + (long) this.field4925;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field4932), this.field4926, (int) (var5 - this.field4931), var9);
                }
                this.field4932 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field4928 == -1L) {
                    this.field4928 = this.field4932;
                }
                System.arraycopy(arg0, arg1, this.field4929, (int) (this.field4932 - this.field4928), arg2);
                this.field4932 += (long) arg2;
                if (this.field4932 - this.field4928 > (long) this.field4930) {
                    this.field4930 = (int) (this.field4932 - this.field4928);
                }
            }
        } catch (IOException var11) {
            this.field4935 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("sj.al(I)V")
    public void method8029() throws IOException {
        if (this.field4928 == -1L) {
            return;
        }
        if (this.field4935 != this.field4928) {
            this.field4927.method8006(this.field4928);
            this.field4935 = this.field4928;
        }
        this.field4927.method8023(this.field4929, 0, this.field4930);
        this.field4935 += (long) (this.field4930 * -1669068099) * -654786411L;
        if (this.field4935 > this.field4933) {
            this.field4933 = this.field4935;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field4928 >= this.field4931 && this.field4928 < this.field4931 + (long) this.field4925) {
            var1 = this.field4928;
        } else if (this.field4931 >= this.field4928 && this.field4931 < this.field4928 + (long) this.field4930) {
            var1 = this.field4931;
        }
        if (this.field4928 + (long) this.field4930 > this.field4931 && this.field4928 + (long) this.field4930 <= this.field4931 + (long) this.field4925) {
            var3 = this.field4928 + (long) this.field4930;
        } else if (this.field4931 + (long) this.field4925 > this.field4928 && this.field4931 + (long) this.field4925 <= this.field4928 + (long) this.field4930) {
            var3 = this.field4931 + (long) this.field4925;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field4929, (int) (var1 - this.field4928), this.field4926, (int) (var1 - this.field4931), var5);
        }
        this.field4928 = -1L;
        this.field4930 = 0;
    }
}
