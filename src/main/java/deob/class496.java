package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("td")
public class class496 {

    @ObfuscatedName("td.ae")
    public class495 field5017;

    @ObfuscatedName("td.ao")
    public byte[] field5009;

    @ObfuscatedName("td.at")
    public long field5007 = -1L;

    @ObfuscatedName("td.ac")
    public int field5011;

    @ObfuscatedName("td.ai")
    public byte[] field5012;

    @ObfuscatedName("td.az")
    public long field5013 = -1L;

    @ObfuscatedName("td.ap")
    public int field5008 = 0;

    @ObfuscatedName("td.aa")
    public long field5015;

    @ObfuscatedName("td.af")
    public long field5016;

    @ObfuscatedName("td.ad")
    public long field5010;

    @ObfuscatedName("td.aq")
    public long field5018;

    public class496(class495 arg0, int arg1, int arg2) throws IOException {
        this.field5017 = arg0;
        this.field5010 = this.field5016 = arg0.method8080();
        this.field5009 = new byte[arg1];
        this.field5012 = new byte[arg2];
        this.field5015 = 0L;
    }

    @ObfuscatedName("td.au(B)V")
    public void method8104() throws IOException {
        this.method8111();
        this.field5017.method8094();
    }

    @ObfuscatedName("td.ae(J)V")
    public void method8105(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field5015 = arg0;
    }

    @ObfuscatedName("td.ao(B)J")
    public long method8116() {
        return this.field5010;
    }

    @ObfuscatedName("td.at([BI)V")
    public void method8106(byte[] arg0) throws IOException {
        this.method8108(arg0, 0, arg0.length);
    }

    @ObfuscatedName("td.ac([BIII)V")
    public void method8108(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field5013 != -1L && this.field5015 >= this.field5013 && this.field5015 + (long) arg2 <= this.field5013 + (long) this.field5008) {
                System.arraycopy(this.field5012, (int) (this.field5015 - this.field5013), arg0, arg1, arg2);
                this.field5015 += (long) arg2;
                return;
            }
            long var4 = this.field5015;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field5015 >= this.field5007 && this.field5015 < this.field5007 + (long) this.field5011) {
                int var8 = (int) ((long) this.field5011 - (this.field5015 - this.field5007));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field5009, (int) (this.field5015 - this.field5007), arg0, arg1, var8);
                this.field5015 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field5009.length) {
                this.field5017.method8076(this.field5015);
                this.field5018 = this.field5015;
                while (arg2 > 0) {
                    int var9 = this.field5017.method8081(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field5018 += (long) var9;
                    this.field5015 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method8109();
                int var10 = arg2;
                if (arg2 > this.field5011) {
                    var10 = this.field5011;
                }
                System.arraycopy(this.field5009, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field5015 += (long) var10;
            }
            if (this.field5013 != -1L) {
                if (this.field5013 > this.field5015 && arg2 > 0) {
                    int var11 = (int) (this.field5013 - this.field5015) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field5015++;
                    }
                }
                long var12 = -1L;
                long var14 = -1L;
                if (this.field5013 >= var4 && this.field5013 < (long) var7 + var4) {
                    var12 = this.field5013;
                } else if (var4 >= this.field5013 && var4 < this.field5013 + (long) this.field5008) {
                    var12 = var4;
                }
                if (this.field5013 + (long) this.field5008 > var4 && this.field5013 + (long) this.field5008 <= (long) var7 + var4) {
                    var14 = this.field5013 + (long) this.field5008;
                } else if ((long) var7 + var4 > this.field5013 && (long) var7 + var4 <= this.field5013 + (long) this.field5008) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field5012, (int) (var12 - this.field5013), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field5015) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field5015));
                        this.field5015 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field5018 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("td.ai(I)V")
    public void method8109() throws IOException {
        this.field5011 = 0;
        if (this.field5018 != this.field5015) {
            this.field5017.method8076(this.field5015);
            this.field5018 = this.field5015;
        }
        this.field5007 = this.field5015;
        while (this.field5011 < this.field5009.length) {
            int var1 = this.field5009.length - this.field5011;
            if (var1 > 200000000) {
                var1 = 200000000;
            }
            int var2 = this.field5017.method8081(this.field5009, this.field5011, var1);
            if (var2 == -1) {
                break;
            }
            this.field5018 += (long) var2;
            this.field5011 += var2;
        }
    }

    @ObfuscatedName("td.az([BIII)V")
    public void method8110(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field5015 + (long) arg2 > this.field5010) {
                this.field5010 = this.field5015 + (long) arg2;
            }
            if (this.field5013 != -1L && (this.field5015 < this.field5013 || this.field5015 > this.field5013 + (long) this.field5008)) {
                this.method8111();
            }
            if (this.field5013 != -1L && this.field5015 + (long) arg2 > this.field5013 + (long) this.field5012.length) {
                int var4 = (int) ((long) this.field5012.length - (this.field5015 - this.field5013));
                System.arraycopy(arg0, arg1, this.field5012, (int) (this.field5015 - this.field5013), var4);
                this.field5015 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field5008 = this.field5012.length;
                this.method8111();
            }
            if (arg2 > this.field5012.length) {
                if (this.field5018 != this.field5015) {
                    this.field5017.method8076(this.field5015);
                    this.field5018 = this.field5015;
                }
                this.field5017.method8077(arg0, arg1, arg2);
                this.field5018 += (long) arg2;
                if (this.field5018 > this.field5016) {
                    this.field5016 = this.field5018;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field5015 >= this.field5007 && this.field5015 < this.field5007 + (long) this.field5011) {
                    var5 = this.field5015;
                } else if (this.field5007 >= this.field5015 && this.field5007 < this.field5015 + (long) arg2) {
                    var5 = this.field5007;
                }
                if (this.field5015 + (long) arg2 > this.field5007 && this.field5015 + (long) arg2 <= this.field5007 + (long) this.field5011) {
                    var7 = this.field5015 + (long) arg2;
                } else if (this.field5007 + (long) this.field5011 > this.field5015 && this.field5007 + (long) this.field5011 <= this.field5015 + (long) arg2) {
                    var7 = this.field5007 + (long) this.field5011;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field5015), this.field5009, (int) (var5 - this.field5007), var9);
                }
                this.field5015 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field5013 == -1L) {
                    this.field5013 = this.field5015;
                }
                System.arraycopy(arg0, arg1, this.field5012, (int) (this.field5015 - this.field5013), arg2);
                this.field5015 += (long) arg2;
                if (this.field5015 - this.field5013 > (long) this.field5008) {
                    this.field5008 = (int) (this.field5015 - this.field5013);
                }
            }
        } catch (IOException var11) {
            this.field5018 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("td.ap(I)V")
    public void method8111() throws IOException {
        if (this.field5013 == -1L) {
            return;
        }
        if (this.field5018 != this.field5013) {
            this.field5017.method8076(this.field5013);
            this.field5018 = this.field5013;
        }
        this.field5017.method8077(this.field5012, 0, this.field5008);
        this.field5018 += (long) (this.field5008 * 406271721) * 545194329L;
        if (this.field5018 > this.field5016) {
            this.field5016 = this.field5018;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field5013 >= this.field5007 && this.field5013 < this.field5007 + (long) this.field5011) {
            var1 = this.field5013;
        } else if (this.field5007 >= this.field5013 && this.field5007 < this.field5013 + (long) this.field5008) {
            var1 = this.field5007;
        }
        if (this.field5013 + (long) this.field5008 > this.field5007 && this.field5013 + (long) this.field5008 <= this.field5007 + (long) this.field5011) {
            var3 = this.field5013 + (long) this.field5008;
        } else if (this.field5007 + (long) this.field5011 > this.field5013 && this.field5007 + (long) this.field5011 <= this.field5013 + (long) this.field5008) {
            var3 = this.field5007 + (long) this.field5011;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field5012, (int) (var1 - this.field5013), this.field5009, (int) (var1 - this.field5007), var5);
        }
        this.field5013 = -1L;
        this.field5008 = 0;
    }
}
