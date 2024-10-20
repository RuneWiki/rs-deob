package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("tw")
public class class516 {

    @ObfuscatedName("tw.ah")
    public class515 field5133;

    @ObfuscatedName("tw.af")
    public byte[] field5134;

    @ObfuscatedName("tw.at")
    public long field5135 = -1L;

    @ObfuscatedName("tw.an")
    public int field5144;

    @ObfuscatedName("tw.ao")
    public byte[] field5137;

    @ObfuscatedName("tw.ab")
    public long field5138 = -1L;

    @ObfuscatedName("tw.aw")
    public int field5132 = 0;

    @ObfuscatedName("tw.ad")
    public long field5145;

    @ObfuscatedName("tw.al")
    public long field5143;

    @ObfuscatedName("tw.as")
    public long field5142;

    @ObfuscatedName("tw.ag")
    public long field5140;

    public class516(class515 arg0, int arg1, int arg2) throws IOException {
        this.field5133 = arg0;
        this.field5142 = this.field5143 = arg0.method8243();
        this.field5134 = new byte[arg1];
        this.field5137 = new byte[arg2];
        this.field5145 = 0L;
    }

    @ObfuscatedName("tw.az(I)V")
    public void method8261() throws IOException {
        this.method8264();
        this.field5133.method8247();
    }

    @ObfuscatedName("tw.ah(J)V")
    public void method8282(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field5145 = arg0;
    }

    @ObfuscatedName("tw.af(B)J")
    public long method8268() {
        return this.field5142;
    }

    @ObfuscatedName("tw.at([BI)V")
    public void method8260(byte[] arg0) throws IOException {
        this.method8275(arg0, 0, arg0.length);
    }

    @ObfuscatedName("tw.an([BIII)V")
    public void method8275(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field5138 != -1L && this.field5145 >= this.field5138 && this.field5145 + (long) arg2 <= this.field5138 + (long) this.field5132) {
                System.arraycopy(this.field5137, (int) (this.field5145 - this.field5138), arg0, arg1, arg2);
                this.field5145 += (long) arg2;
                return;
            }
            long var4 = this.field5145;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field5145 >= this.field5135 && this.field5145 < this.field5135 + (long) this.field5144) {
                int var8 = (int) ((long) this.field5144 - (this.field5145 - this.field5135));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field5134, (int) (this.field5145 - this.field5135), arg0, arg1, var8);
                this.field5145 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field5134.length) {
                this.field5133.method8233(this.field5145);
                this.field5140 = this.field5145;
                while (arg2 > 0) {
                    int var9 = this.field5133.method8238(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field5140 += (long) var9;
                    this.field5145 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method8259();
                int var10 = arg2;
                if (arg2 > this.field5144) {
                    var10 = this.field5144;
                }
                System.arraycopy(this.field5134, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field5145 += (long) var10;
            }
            if (this.field5138 != -1L) {
                if (this.field5138 > this.field5145 && arg2 > 0) {
                    int var11 = (int) (this.field5138 - this.field5145) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field5145++;
                    }
                }
                long var12 = -1L;
                long var14 = -1L;
                if (this.field5138 >= var4 && this.field5138 < (long) var7 + var4) {
                    var12 = this.field5138;
                } else if (var4 >= this.field5138 && var4 < this.field5138 + (long) this.field5132) {
                    var12 = var4;
                }
                if (this.field5138 + (long) this.field5132 > var4 && this.field5138 + (long) this.field5132 <= (long) var7 + var4) {
                    var14 = this.field5138 + (long) this.field5132;
                } else if ((long) var7 + var4 > this.field5138 && (long) var7 + var4 <= this.field5138 + (long) this.field5132) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field5137, (int) (var12 - this.field5138), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field5145) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field5145));
                        this.field5145 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field5140 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("tw.ao(I)V")
    public void method8259() throws IOException {
        this.field5144 = 0;
        if (this.field5145 != this.field5140) {
            this.field5133.method8233(this.field5145);
            this.field5140 = this.field5145;
        }
        this.field5135 = this.field5145;
        while (this.field5144 < this.field5134.length) {
            int var1 = this.field5134.length - this.field5144;
            if (var1 > 200000000) {
                var1 = 200000000;
            }
            int var2 = this.field5133.method8238(this.field5134, this.field5144, var1);
            if (var2 == -1) {
                break;
            }
            this.field5140 += (long) var2;
            this.field5144 += var2;
        }
    }

    @ObfuscatedName("tw.ab([BIIB)V")
    public void method8266(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field5145 + (long) arg2 > this.field5142) {
                this.field5142 = this.field5145 + (long) arg2;
            }
            if (this.field5138 != -1L && (this.field5145 < this.field5138 || this.field5145 > this.field5138 + (long) this.field5132)) {
                this.method8264();
            }
            if (this.field5138 != -1L && this.field5145 + (long) arg2 > this.field5138 + (long) this.field5137.length) {
                int var4 = (int) ((long) this.field5137.length - (this.field5145 - this.field5138));
                System.arraycopy(arg0, arg1, this.field5137, (int) (this.field5145 - this.field5138), var4);
                this.field5145 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field5132 = this.field5137.length;
                this.method8264();
            }
            if (arg2 > this.field5137.length) {
                if (this.field5145 != this.field5140) {
                    this.field5133.method8233(this.field5145);
                    this.field5140 = this.field5145;
                }
                this.field5133.method8234(arg0, arg1, arg2);
                this.field5140 += (long) arg2;
                if (this.field5140 > this.field5143) {
                    this.field5143 = this.field5140;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field5145 >= this.field5135 && this.field5145 < this.field5135 + (long) this.field5144) {
                    var5 = this.field5145;
                } else if (this.field5135 >= this.field5145 && this.field5135 < this.field5145 + (long) arg2) {
                    var5 = this.field5135;
                }
                if (this.field5145 + (long) arg2 > this.field5135 && this.field5145 + (long) arg2 <= this.field5135 + (long) this.field5144) {
                    var7 = this.field5145 + (long) arg2;
                } else if (this.field5135 + (long) this.field5144 > this.field5145 && this.field5135 + (long) this.field5144 <= this.field5145 + (long) arg2) {
                    var7 = this.field5135 + (long) this.field5144;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field5145), this.field5134, (int) (var5 - this.field5135), var9);
                }
                this.field5145 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field5138 == -1L) {
                    this.field5138 = this.field5145;
                }
                System.arraycopy(arg0, arg1, this.field5137, (int) (this.field5145 - this.field5138), arg2);
                this.field5145 += (long) arg2;
                if (this.field5145 - this.field5138 > (long) this.field5132) {
                    this.field5132 = (int) (this.field5145 - this.field5138);
                }
            }
        } catch (IOException var11) {
            this.field5140 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("tw.aw(I)V")
    public void method8264() throws IOException {
        if (this.field5138 == -1L) {
            return;
        }
        if (this.field5140 != this.field5138) {
            this.field5133.method8233(this.field5138);
            this.field5140 = this.field5138;
        }
        this.field5133.method8234(this.field5137, 0, this.field5132);
        this.field5140 += (long) (this.field5132 * -1308767795) * -6534395L;
        if (this.field5140 > this.field5143) {
            this.field5143 = this.field5140;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field5138 >= this.field5135 && this.field5138 < this.field5135 + (long) this.field5144) {
            var1 = this.field5138;
        } else if (this.field5135 >= this.field5138 && this.field5135 < this.field5138 + (long) this.field5132) {
            var1 = this.field5135;
        }
        if (this.field5138 + (long) this.field5132 > this.field5135 && this.field5138 + (long) this.field5132 <= this.field5135 + (long) this.field5144) {
            var3 = this.field5138 + (long) this.field5132;
        } else if (this.field5135 + (long) this.field5144 > this.field5138 && this.field5135 + (long) this.field5144 <= this.field5138 + (long) this.field5132) {
            var3 = this.field5135 + (long) this.field5144;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field5137, (int) (var1 - this.field5138), this.field5134, (int) (var1 - this.field5135), var5);
        }
        this.field5138 = -1L;
        this.field5132 = 0;
    }
}
