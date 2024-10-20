package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("te")
public class class512 {

    @ObfuscatedName("te.ap")
    public class511 field5082;

    @ObfuscatedName("te.af")
    public byte[] field5083;

    @ObfuscatedName("te.aj")
    public long field5090 = -1L;

    @ObfuscatedName("te.aq")
    public int field5085;

    @ObfuscatedName("te.ar")
    public byte[] field5086;

    @ObfuscatedName("te.ag")
    public long field5087 = -1L;

    @ObfuscatedName("te.ao")
    public int field5081 = 0;

    @ObfuscatedName("te.ae")
    public long field5089;

    @ObfuscatedName("te.aa")
    public long field5084;

    @ObfuscatedName("te.au")
    public long field5091;

    @ObfuscatedName("te.an")
    public long field5092;

    public class512(class511 arg0, int arg1, int arg2) throws IOException {
        this.field5082 = arg0;
        this.field5091 = this.field5084 = arg0.method8350();
        this.field5083 = new byte[arg1];
        this.field5086 = new byte[arg2];
        this.field5089 = 0L;
    }

    @ObfuscatedName("te.am(I)V")
    public void method8391() throws IOException {
        this.method8375();
        this.field5082.method8352();
    }

    @ObfuscatedName("te.ap(J)V")
    public void method8376(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field5089 = arg0;
    }

    @ObfuscatedName("te.af(B)J")
    public long method8377() {
        return this.field5091;
    }

    @ObfuscatedName("te.aj([BB)V")
    public void method8378(byte[] arg0) throws IOException {
        this.method8379(arg0, 0, arg0.length);
    }

    @ObfuscatedName("te.aq([BIII)V")
    public void method8379(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field5087 != -1L && this.field5089 >= this.field5087 && this.field5089 + (long) arg2 <= this.field5087 + (long) this.field5081) {
                System.arraycopy(this.field5086, (int) (this.field5089 - this.field5087), arg0, arg1, arg2);
                this.field5089 += (long) arg2;
                return;
            }
            long var4 = this.field5089;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field5089 >= this.field5090 && this.field5089 < this.field5090 + (long) this.field5085) {
                int var8 = (int) ((long) this.field5085 - (this.field5089 - this.field5090));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field5083, (int) (this.field5089 - this.field5090), arg0, arg1, var8);
                this.field5089 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field5083.length) {
                this.field5082.method8372(this.field5089);
                this.field5092 = this.field5089;
                while (arg2 > 0) {
                    int var9 = this.field5082.method8351(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field5092 += (long) var9;
                    this.field5089 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method8380();
                int var10 = arg2;
                if (arg2 > this.field5085) {
                    var10 = this.field5085;
                }
                System.arraycopy(this.field5083, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field5089 += (long) var10;
            }
            if (this.field5087 != -1L) {
                if (this.field5087 > this.field5089 && arg2 > 0) {
                    int var11 = (int) (this.field5087 - this.field5089) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field5089++;
                    }
                }
                long var12 = -1L;
                long var14 = -1L;
                if (this.field5087 >= var4 && this.field5087 < (long) var7 + var4) {
                    var12 = this.field5087;
                } else if (var4 >= this.field5087 && var4 < this.field5087 + (long) this.field5081) {
                    var12 = var4;
                }
                if (this.field5087 + (long) this.field5081 > var4 && this.field5087 + (long) this.field5081 <= (long) var7 + var4) {
                    var14 = this.field5087 + (long) this.field5081;
                } else if ((long) var7 + var4 > this.field5087 && (long) var7 + var4 <= this.field5087 + (long) this.field5081) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field5086, (int) (var12 - this.field5087), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field5089) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field5089));
                        this.field5089 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field5092 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("te.ar(I)V")
    public void method8380() throws IOException {
        this.field5085 = 0;
        if (this.field5092 != this.field5089) {
            this.field5082.method8372(this.field5089);
            this.field5092 = this.field5089;
        }
        this.field5090 = this.field5089;
        while (this.field5085 < this.field5083.length) {
            int var1 = this.field5083.length - this.field5085;
            if (var1 > 200000000) {
                var1 = 200000000;
            }
            int var2 = this.field5082.method8351(this.field5083, this.field5085, var1);
            if (var2 == -1) {
                break;
            }
            this.field5092 += (long) var2;
            this.field5085 += var2;
        }
    }

    @ObfuscatedName("te.ag([BIIB)V")
    public void method8381(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field5089 + (long) arg2 > this.field5091) {
                this.field5091 = this.field5089 + (long) arg2;
            }
            if (this.field5087 != -1L && (this.field5089 < this.field5087 || this.field5089 > this.field5087 + (long) this.field5081)) {
                this.method8375();
            }
            if (this.field5087 != -1L && this.field5089 + (long) arg2 > this.field5087 + (long) this.field5086.length) {
                int var4 = (int) ((long) this.field5086.length - (this.field5089 - this.field5087));
                System.arraycopy(arg0, arg1, this.field5086, (int) (this.field5089 - this.field5087), var4);
                this.field5089 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field5081 = this.field5086.length;
                this.method8375();
            }
            if (arg2 > this.field5086.length) {
                if (this.field5092 != this.field5089) {
                    this.field5082.method8372(this.field5089);
                    this.field5092 = this.field5089;
                }
                this.field5082.method8348(arg0, arg1, arg2);
                this.field5092 += (long) arg2;
                if (this.field5092 > this.field5084) {
                    this.field5084 = this.field5092;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field5089 >= this.field5090 && this.field5089 < this.field5090 + (long) this.field5085) {
                    var5 = this.field5089;
                } else if (this.field5090 >= this.field5089 && this.field5090 < this.field5089 + (long) arg2) {
                    var5 = this.field5090;
                }
                if (this.field5089 + (long) arg2 > this.field5090 && this.field5089 + (long) arg2 <= this.field5090 + (long) this.field5085) {
                    var7 = this.field5089 + (long) arg2;
                } else if (this.field5090 + (long) this.field5085 > this.field5089 && this.field5090 + (long) this.field5085 <= this.field5089 + (long) arg2) {
                    var7 = this.field5090 + (long) this.field5085;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field5089), this.field5083, (int) (var5 - this.field5090), var9);
                }
                this.field5089 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field5087 == -1L) {
                    this.field5087 = this.field5089;
                }
                System.arraycopy(arg0, arg1, this.field5086, (int) (this.field5089 - this.field5087), arg2);
                this.field5089 += (long) arg2;
                if (this.field5089 - this.field5087 > (long) this.field5081) {
                    this.field5081 = (int) (this.field5089 - this.field5087);
                }
            }
        } catch (IOException var11) {
            this.field5092 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("te.ao(B)V")
    public void method8375() throws IOException {
        if (this.field5087 == -1L) {
            return;
        }
        if (this.field5092 != this.field5087) {
            this.field5082.method8372(this.field5087);
            this.field5092 = this.field5087;
        }
        this.field5082.method8348(this.field5086, 0, this.field5081);
        this.field5092 += (long) (this.field5081 * -1208132891) * 958911213L;
        if (this.field5092 > this.field5084) {
            this.field5084 = this.field5092;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field5087 >= this.field5090 && this.field5087 < this.field5090 + (long) this.field5085) {
            var1 = this.field5087;
        } else if (this.field5090 >= this.field5087 && this.field5090 < this.field5087 + (long) this.field5081) {
            var1 = this.field5090;
        }
        if (this.field5087 + (long) this.field5081 > this.field5090 && this.field5087 + (long) this.field5081 <= this.field5090 + (long) this.field5085) {
            var3 = this.field5087 + (long) this.field5081;
        } else if (this.field5090 + (long) this.field5085 > this.field5087 && this.field5090 + (long) this.field5085 <= this.field5087 + (long) this.field5081) {
            var3 = this.field5090 + (long) this.field5085;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field5086, (int) (var1 - this.field5087), this.field5083, (int) (var1 - this.field5090), var5);
        }
        this.field5087 = -1L;
        this.field5081 = 0;
    }
}
