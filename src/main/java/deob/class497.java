package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("ts")
public class class497 {

    @ObfuscatedName("ts.ay")
    public class496 field5011;

    @ObfuscatedName("ts.ar")
    public byte[] field5006;

    @ObfuscatedName("ts.am")
    public long field5010 = -1L;

    @ObfuscatedName("ts.as")
    public int field5008;

    @ObfuscatedName("ts.aj")
    public byte[] field5009;

    @ObfuscatedName("ts.ag")
    public long field5007 = -1L;

    @ObfuscatedName("ts.az")
    public int field5005 = 0;

    @ObfuscatedName("ts.av")
    public long field5012;

    @ObfuscatedName("ts.ap")
    public long field5013;

    @ObfuscatedName("ts.aq")
    public long field5014;

    @ObfuscatedName("ts.at")
    public long field5015;

    public class497(class496 arg0, int arg1, int arg2) throws IOException {
        this.field5011 = arg0;
        this.field5014 = this.field5013 = arg0.method8022();
        this.field5006 = new byte[arg1];
        this.field5009 = new byte[arg2];
        this.field5012 = 0L;
    }

    @ObfuscatedName("ts.aw(B)V")
    public void method8039() throws IOException {
        this.method8046();
        this.field5011.method8020();
    }

    @ObfuscatedName("ts.ay(J)V")
    public void method8047(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field5012 = arg0;
    }

    @ObfuscatedName("ts.ar(B)J")
    public long method8041() {
        return this.field5014;
    }

    @ObfuscatedName("ts.am([BI)V")
    public void method8055(byte[] arg0) throws IOException {
        this.method8042(arg0, 0, arg0.length);
    }

    @ObfuscatedName("ts.as([BIII)V")
    public void method8042(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field5007 != -1L && this.field5012 >= this.field5007 && this.field5012 + (long) arg2 <= this.field5007 + (long) this.field5005) {
                System.arraycopy(this.field5009, (int) (this.field5012 - this.field5007), arg0, arg1, arg2);
                this.field5012 += (long) arg2;
                return;
            }
            long var4 = this.field5012;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field5012 >= this.field5010 && this.field5012 < this.field5010 + (long) this.field5008) {
                int var8 = (int) ((long) this.field5008 - (this.field5012 - this.field5010));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field5006, (int) (this.field5012 - this.field5010), arg0, arg1, var8);
                this.field5012 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field5006.length) {
                this.field5011.method8017(this.field5012);
                this.field5015 = this.field5012;
                while (arg2 > 0) {
                    int var9 = this.field5011.method8024(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field5015 += (long) var9;
                    this.field5012 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method8044();
                int var10 = arg2;
                if (arg2 > this.field5008) {
                    var10 = this.field5008;
                }
                System.arraycopy(this.field5006, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field5012 += (long) var10;
            }
            if (this.field5007 != -1L) {
                if (this.field5007 > this.field5012 && arg2 > 0) {
                    int var11 = (int) (this.field5007 - this.field5012) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field5012++;
                    }
                }
                long var12 = -1L;
                long var14 = -1L;
                if (this.field5007 >= var4 && this.field5007 < (long) var7 + var4) {
                    var12 = this.field5007;
                } else if (var4 >= this.field5007 && var4 < this.field5007 + (long) this.field5005) {
                    var12 = var4;
                }
                if (this.field5007 + (long) this.field5005 > var4 && this.field5007 + (long) this.field5005 <= (long) var7 + var4) {
                    var14 = this.field5007 + (long) this.field5005;
                } else if ((long) var7 + var4 > this.field5007 && (long) var7 + var4 <= this.field5007 + (long) this.field5005) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field5009, (int) (var12 - this.field5007), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field5012) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field5012));
                        this.field5012 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field5015 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("ts.aj(I)V")
    public void method8044() throws IOException {
        this.field5008 = 0;
        if (this.field5015 != this.field5012) {
            this.field5011.method8017(this.field5012);
            this.field5015 = this.field5012;
        }
        this.field5010 = this.field5012;
        while (this.field5008 < this.field5006.length) {
            int var1 = this.field5006.length - this.field5008;
            if (var1 > 200000000) {
                var1 = 200000000;
            }
            int var2 = this.field5011.method8024(this.field5006, this.field5008, var1);
            if (var2 == -1) {
                break;
            }
            this.field5015 += (long) var2;
            this.field5008 += var2;
        }
    }

    @ObfuscatedName("ts.ag([BIIB)V")
    public void method8061(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field5012 + (long) arg2 > this.field5014) {
                this.field5014 = this.field5012 + (long) arg2;
            }
            if (this.field5007 != -1L && (this.field5012 < this.field5007 || this.field5012 > this.field5007 + (long) this.field5005)) {
                this.method8046();
            }
            if (this.field5007 != -1L && this.field5012 + (long) arg2 > this.field5007 + (long) this.field5009.length) {
                int var4 = (int) ((long) this.field5009.length - (this.field5012 - this.field5007));
                System.arraycopy(arg0, arg1, this.field5009, (int) (this.field5012 - this.field5007), var4);
                this.field5012 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field5005 = this.field5009.length;
                this.method8046();
            }
            if (arg2 > this.field5009.length) {
                if (this.field5015 != this.field5012) {
                    this.field5011.method8017(this.field5012);
                    this.field5015 = this.field5012;
                }
                this.field5011.method8019(arg0, arg1, arg2);
                this.field5015 += (long) arg2;
                if (this.field5015 > this.field5013) {
                    this.field5013 = this.field5015;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field5012 >= this.field5010 && this.field5012 < this.field5010 + (long) this.field5008) {
                    var5 = this.field5012;
                } else if (this.field5010 >= this.field5012 && this.field5010 < this.field5012 + (long) arg2) {
                    var5 = this.field5010;
                }
                if (this.field5012 + (long) arg2 > this.field5010 && this.field5012 + (long) arg2 <= this.field5010 + (long) this.field5008) {
                    var7 = this.field5012 + (long) arg2;
                } else if (this.field5010 + (long) this.field5008 > this.field5012 && this.field5010 + (long) this.field5008 <= this.field5012 + (long) arg2) {
                    var7 = this.field5010 + (long) this.field5008;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field5012), this.field5006, (int) (var5 - this.field5010), var9);
                }
                this.field5012 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field5007 == -1L) {
                    this.field5007 = this.field5012;
                }
                System.arraycopy(arg0, arg1, this.field5009, (int) (this.field5012 - this.field5007), arg2);
                this.field5012 += (long) arg2;
                if (this.field5012 - this.field5007 > (long) this.field5005) {
                    this.field5005 = (int) (this.field5012 - this.field5007);
                }
            }
        } catch (IOException var11) {
            this.field5015 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("ts.az(I)V")
    public void method8046() throws IOException {
        if (this.field5007 == -1L) {
            return;
        }
        if (this.field5015 != this.field5007) {
            this.field5011.method8017(this.field5007);
            this.field5015 = this.field5007;
        }
        this.field5011.method8019(this.field5009, 0, this.field5005);
        this.field5015 += (long) (this.field5005 * -276305949) * 283940299L;
        if (this.field5015 > this.field5013) {
            this.field5013 = this.field5015;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field5007 >= this.field5010 && this.field5007 < this.field5010 + (long) this.field5008) {
            var1 = this.field5007;
        } else if (this.field5010 >= this.field5007 && this.field5010 < this.field5007 + (long) this.field5005) {
            var1 = this.field5010;
        }
        if (this.field5007 + (long) this.field5005 > this.field5010 && this.field5007 + (long) this.field5005 <= this.field5010 + (long) this.field5008) {
            var3 = this.field5007 + (long) this.field5005;
        } else if (this.field5010 + (long) this.field5008 > this.field5007 && this.field5010 + (long) this.field5008 <= this.field5007 + (long) this.field5005) {
            var3 = this.field5010 + (long) this.field5008;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field5009, (int) (var1 - this.field5007), this.field5006, (int) (var1 - this.field5010), var5);
        }
        this.field5007 = -1L;
        this.field5005 = 0;
    }
}
