package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("tr")
public class class508 {

    @ObfuscatedName("tr.ah")
    public class507 field5043;

    @ObfuscatedName("tr.ar")
    public byte[] field5049;

    @ObfuscatedName("tr.ao")
    public long field5038 = -1L;

    @ObfuscatedName("tr.ab")
    public int field5042;

    @ObfuscatedName("tr.au")
    public byte[] field5041;

    @ObfuscatedName("tr.aa")
    public long field5044 = -1L;

    @ObfuscatedName("tr.ac")
    public int field5045 = 0;

    @ObfuscatedName("tr.al")
    public long field5046;

    @ObfuscatedName("tr.az")
    public long field5047;

    @ObfuscatedName("tr.ap")
    public long field5048;

    @ObfuscatedName("tr.av")
    public long field5039;

    public class508(class507 arg0, int arg1, int arg2) throws IOException {
        this.field5043 = arg0;
        this.field5048 = this.field5047 = arg0.method8214();
        this.field5049 = new byte[arg1];
        this.field5041 = new byte[arg2];
        this.field5046 = 0L;
    }

    @ObfuscatedName("tr.at(B)V")
    public void method8217() throws IOException {
        this.method8224();
        this.field5043.method8195();
    }

    @ObfuscatedName("tr.ah(J)V")
    public void method8218(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field5046 = arg0;
    }

    @ObfuscatedName("tr.ar(I)J")
    public long method8229() {
        return this.field5048;
    }

    @ObfuscatedName("tr.ao([BB)V")
    public void method8220(byte[] arg0) throws IOException {
        this.method8221(arg0, 0, arg0.length);
    }

    @ObfuscatedName("tr.ab([BIII)V")
    public void method8221(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field5044 != -1L && this.field5046 >= this.field5044 && this.field5046 + (long) arg2 <= this.field5044 + (long) this.field5045) {
                System.arraycopy(this.field5041, (int) (this.field5046 - this.field5044), arg0, arg1, arg2);
                this.field5046 += (long) arg2;
                return;
            }
            long var4 = this.field5046;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field5046 >= this.field5038 && this.field5046 < this.field5038 + (long) this.field5042) {
                int var8 = (int) ((long) this.field5042 - (this.field5046 - this.field5038));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field5049, (int) (this.field5046 - this.field5038), arg0, arg1, var8);
                this.field5046 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field5049.length) {
                this.field5043.method8193(this.field5046);
                this.field5039 = this.field5046;
                while (arg2 > 0) {
                    int var9 = this.field5043.method8198(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field5039 += (long) var9;
                    this.field5046 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method8222();
                int var10 = arg2;
                if (arg2 > this.field5042) {
                    var10 = this.field5042;
                }
                System.arraycopy(this.field5049, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field5046 += (long) var10;
            }
            if (this.field5044 != -1L) {
                if (this.field5044 > this.field5046 && arg2 > 0) {
                    int var11 = (int) (this.field5044 - this.field5046) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field5046++;
                    }
                }
                long var12 = -1L;
                long var14 = -1L;
                if (this.field5044 >= var4 && this.field5044 < (long) var7 + var4) {
                    var12 = this.field5044;
                } else if (var4 >= this.field5044 && var4 < this.field5044 + (long) this.field5045) {
                    var12 = var4;
                }
                if (this.field5044 + (long) this.field5045 > var4 && this.field5044 + (long) this.field5045 <= (long) var7 + var4) {
                    var14 = this.field5044 + (long) this.field5045;
                } else if ((long) var7 + var4 > this.field5044 && (long) var7 + var4 <= this.field5044 + (long) this.field5045) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field5041, (int) (var12 - this.field5044), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field5046) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field5046));
                        this.field5046 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field5039 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("tr.au(B)V")
    public void method8222() throws IOException {
        this.field5042 = 0;
        if (this.field5046 != this.field5039) {
            this.field5043.method8193(this.field5046);
            this.field5039 = this.field5046;
        }
        this.field5038 = this.field5046;
        while (this.field5042 < this.field5049.length) {
            int var1 = this.field5049.length - this.field5042;
            if (var1 > 200000000) {
                var1 = 200000000;
            }
            int var2 = this.field5043.method8198(this.field5049, this.field5042, var1);
            if (var2 == -1) {
                break;
            }
            this.field5039 += (long) var2;
            this.field5042 += var2;
        }
    }

    @ObfuscatedName("tr.aa([BIII)V")
    public void method8223(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field5046 + (long) arg2 > this.field5048) {
                this.field5048 = this.field5046 + (long) arg2;
            }
            if (this.field5044 != -1L && (this.field5046 < this.field5044 || this.field5046 > this.field5044 + (long) this.field5045)) {
                this.method8224();
            }
            if (this.field5044 != -1L && this.field5046 + (long) arg2 > this.field5044 + (long) this.field5041.length) {
                int var4 = (int) ((long) this.field5041.length - (this.field5046 - this.field5044));
                System.arraycopy(arg0, arg1, this.field5041, (int) (this.field5046 - this.field5044), var4);
                this.field5046 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field5045 = this.field5041.length;
                this.method8224();
            }
            if (arg2 > this.field5041.length) {
                if (this.field5046 != this.field5039) {
                    this.field5043.method8193(this.field5046);
                    this.field5039 = this.field5046;
                }
                this.field5043.method8203(arg0, arg1, arg2);
                this.field5039 += (long) arg2;
                if (this.field5039 > this.field5047) {
                    this.field5047 = this.field5039;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field5046 >= this.field5038 && this.field5046 < this.field5038 + (long) this.field5042) {
                    var5 = this.field5046;
                } else if (this.field5038 >= this.field5046 && this.field5038 < this.field5046 + (long) arg2) {
                    var5 = this.field5038;
                }
                if (this.field5046 + (long) arg2 > this.field5038 && this.field5046 + (long) arg2 <= this.field5038 + (long) this.field5042) {
                    var7 = this.field5046 + (long) arg2;
                } else if (this.field5038 + (long) this.field5042 > this.field5046 && this.field5038 + (long) this.field5042 <= this.field5046 + (long) arg2) {
                    var7 = this.field5038 + (long) this.field5042;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field5046), this.field5049, (int) (var5 - this.field5038), var9);
                }
                this.field5046 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field5044 == -1L) {
                    this.field5044 = this.field5046;
                }
                System.arraycopy(arg0, arg1, this.field5041, (int) (this.field5046 - this.field5044), arg2);
                this.field5046 += (long) arg2;
                if (this.field5046 - this.field5044 > (long) this.field5045) {
                    this.field5045 = (int) (this.field5046 - this.field5044);
                }
            }
        } catch (IOException var11) {
            this.field5039 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("tr.ac(I)V")
    public void method8224() throws IOException {
        if (this.field5044 == -1L) {
            return;
        }
        if (this.field5044 != this.field5039) {
            this.field5043.method8193(this.field5044);
            this.field5039 = this.field5044;
        }
        this.field5043.method8203(this.field5041, 0, this.field5045);
        this.field5039 += (long) (this.field5045 * 1474508791) * -1929201209L;
        if (this.field5039 > this.field5047) {
            this.field5047 = this.field5039;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field5044 >= this.field5038 && this.field5044 < this.field5038 + (long) this.field5042) {
            var1 = this.field5044;
        } else if (this.field5038 >= this.field5044 && this.field5038 < this.field5044 + (long) this.field5045) {
            var1 = this.field5038;
        }
        if (this.field5044 + (long) this.field5045 > this.field5038 && this.field5044 + (long) this.field5045 <= this.field5038 + (long) this.field5042) {
            var3 = this.field5044 + (long) this.field5045;
        } else if (this.field5038 + (long) this.field5042 > this.field5044 && this.field5038 + (long) this.field5042 <= this.field5044 + (long) this.field5045) {
            var3 = this.field5038 + (long) this.field5042;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field5041, (int) (var1 - this.field5044), this.field5049, (int) (var1 - this.field5038), var5);
        }
        this.field5044 = -1L;
        this.field5045 = 0;
    }
}
