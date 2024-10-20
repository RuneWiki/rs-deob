package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("na")
public class class369 {

    @ObfuscatedName("na.e")
    public class368 field4103;

    @ObfuscatedName("na.v")
    public byte[] field4104;

    @ObfuscatedName("na.y")
    public long field4113 = -1L;

    @ObfuscatedName("na.j")
    public int field4102;

    @ObfuscatedName("na.o")
    public byte[] field4106;

    @ObfuscatedName("na.m")
    public long field4108 = -1L;

    @ObfuscatedName("na.r")
    public int field4109 = 0;

    @ObfuscatedName("na.h")
    public long field4107;

    @ObfuscatedName("na.d")
    public long field4111;

    @ObfuscatedName("na.z")
    public long field4112;

    @ObfuscatedName("na.b")
    public long field4105;

    public class369(class368 arg0, int arg1, int arg2) throws IOException {
        this.field4103 = arg0;
        this.field4112 = this.field4111 = arg0.method5731();
        this.field4104 = new byte[arg1];
        this.field4106 = new byte[arg2];
        this.field4107 = 0L;
    }

    @ObfuscatedName("na.f(I)V")
    public void method5747() throws IOException {
        this.method5754();
        this.field4103.method5729();
    }

    @ObfuscatedName("na.e(J)V")
    public void method5758(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field4107 = arg0;
    }

    @ObfuscatedName("na.v(I)J")
    public long method5749() {
        return this.field4112;
    }

    @ObfuscatedName("na.y([BB)V")
    public void method5750(byte[] arg0) throws IOException {
        this.method5752(arg0, 0, arg0.length);
    }

    @ObfuscatedName("na.j([BIII)V")
    public void method5752(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field4108 != -1L && this.field4107 >= this.field4108 && this.field4107 + (long) arg2 <= this.field4108 + (long) this.field4109) {
                System.arraycopy(this.field4106, (int) (this.field4107 - this.field4108), arg0, arg1, arg2);
                this.field4107 += (long) arg2;
                return;
            }
            long var4 = this.field4107;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field4107 >= this.field4113 && this.field4107 < this.field4113 + (long) this.field4102) {
                int var8 = (int) ((long) this.field4102 - (this.field4107 - this.field4113));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field4104, (int) (this.field4107 - this.field4113), arg0, arg1, var8);
                this.field4107 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field4104.length) {
                this.field4103.method5743(this.field4107);
                this.field4105 = this.field4107;
                while (arg2 > 0) {
                    int var9 = this.field4103.method5732(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field4105 += (long) var9;
                    this.field4107 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method5768();
                int var10 = arg2;
                if (arg2 > this.field4102) {
                    var10 = this.field4102;
                }
                System.arraycopy(this.field4104, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field4107 += (long) var10;
            }
            if (this.field4108 != -1L) {
                if (this.field4108 > this.field4107 && arg2 > 0) {
                    int var11 = (int) (this.field4108 - this.field4107) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field4107++;
                    }
                }
                long var12 = -1L;
                long var14 = -1L;
                if (this.field4108 >= var4 && this.field4108 < (long) var7 + var4) {
                    var12 = this.field4108;
                } else if (var4 >= this.field4108 && var4 < this.field4108 + (long) this.field4109) {
                    var12 = var4;
                }
                if (this.field4108 + (long) this.field4109 > var4 && this.field4108 + (long) this.field4109 <= (long) var7 + var4) {
                    var14 = this.field4108 + (long) this.field4109;
                } else if ((long) var7 + var4 > this.field4108 && (long) var7 + var4 <= this.field4108 + (long) this.field4109) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field4106, (int) (var12 - this.field4108), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field4107) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field4107));
                        this.field4107 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field4105 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("na.o(I)V")
    public void method5768() throws IOException {
        this.field4102 = 0;
        if (this.field4107 != this.field4105) {
            this.field4103.method5743(this.field4107);
            this.field4105 = this.field4107;
        }
        this.field4113 = this.field4107;
        while (this.field4102 < this.field4104.length) {
            int var1 = this.field4104.length - this.field4102;
            if (var1 > 200000000) {
                var1 = 200000000;
            }
            int var2 = this.field4103.method5732(this.field4104, this.field4102, var1);
            if (var2 == -1) {
                break;
            }
            this.field4105 += (long) var2;
            this.field4102 += var2;
        }
    }

    @ObfuscatedName("na.m([BIII)V")
    public void method5751(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field4107 + (long) arg2 > this.field4112) {
                this.field4112 = this.field4107 + (long) arg2;
            }
            if (this.field4108 != -1L && (this.field4107 < this.field4108 || this.field4107 > this.field4108 + (long) this.field4109)) {
                this.method5754();
            }
            if (this.field4108 != -1L && this.field4107 + (long) arg2 > this.field4108 + (long) this.field4106.length) {
                int var4 = (int) ((long) this.field4106.length - (this.field4107 - this.field4108));
                System.arraycopy(arg0, arg1, this.field4106, (int) (this.field4107 - this.field4108), var4);
                this.field4107 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field4109 = this.field4106.length;
                this.method5754();
            }
            if (arg2 > this.field4106.length) {
                if (this.field4107 != this.field4105) {
                    this.field4103.method5743(this.field4107);
                    this.field4105 = this.field4107;
                }
                this.field4103.method5728(arg0, arg1, arg2);
                this.field4105 += (long) arg2;
                if (this.field4105 > this.field4111) {
                    this.field4111 = this.field4105;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field4107 >= this.field4113 && this.field4107 < this.field4113 + (long) this.field4102) {
                    var5 = this.field4107;
                } else if (this.field4113 >= this.field4107 && this.field4113 < this.field4107 + (long) arg2) {
                    var5 = this.field4113;
                }
                if (this.field4107 + (long) arg2 > this.field4113 && this.field4107 + (long) arg2 <= this.field4113 + (long) this.field4102) {
                    var7 = this.field4107 + (long) arg2;
                } else if (this.field4113 + (long) this.field4102 > this.field4107 && this.field4113 + (long) this.field4102 <= this.field4107 + (long) arg2) {
                    var7 = this.field4113 + (long) this.field4102;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field4107), this.field4104, (int) (var5 - this.field4113), var9);
                }
                this.field4107 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field4108 == -1L) {
                    this.field4108 = this.field4107;
                }
                System.arraycopy(arg0, arg1, this.field4106, (int) (this.field4107 - this.field4108), arg2);
                this.field4107 += (long) arg2;
                if (this.field4107 - this.field4108 > (long) this.field4109) {
                    this.field4109 = (int) (this.field4107 - this.field4108);
                }
            }
        } catch (IOException var11) {
            this.field4105 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("na.r(I)V")
    public void method5754() throws IOException {
        if (this.field4108 == -1L) {
            return;
        }
        if (this.field4108 != this.field4105) {
            this.field4103.method5743(this.field4108);
            this.field4105 = this.field4108;
        }
        this.field4103.method5728(this.field4106, 0, this.field4109);
        this.field4105 += (long) (this.field4109 * 1767289693) * -1991100171L;
        if (this.field4105 > this.field4111) {
            this.field4111 = this.field4105;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field4108 >= this.field4113 && this.field4108 < this.field4113 + (long) this.field4102) {
            var1 = this.field4108;
        } else if (this.field4113 >= this.field4108 && this.field4113 < this.field4108 + (long) this.field4109) {
            var1 = this.field4113;
        }
        if (this.field4108 + (long) this.field4109 > this.field4113 && this.field4108 + (long) this.field4109 <= this.field4113 + (long) this.field4102) {
            var3 = this.field4108 + (long) this.field4109;
        } else if (this.field4113 + (long) this.field4102 > this.field4108 && this.field4113 + (long) this.field4102 <= this.field4108 + (long) this.field4109) {
            var3 = this.field4113 + (long) this.field4102;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field4106, (int) (var1 - this.field4108), this.field4104, (int) (var1 - this.field4113), var5);
        }
        this.field4108 = -1L;
        this.field4109 = 0;
    }
}
