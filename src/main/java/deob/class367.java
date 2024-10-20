package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("nx")
public class class367 {

    @ObfuscatedName("nx.o")
    public class366 field4112;

    @ObfuscatedName("nx.u")
    public byte[] field4107;

    @ObfuscatedName("nx.p")
    public long field4106 = -1L;

    @ObfuscatedName("nx.b")
    public int field4105;

    @ObfuscatedName("nx.e")
    public byte[] field4103;

    @ObfuscatedName("nx.k")
    public long field4109 = -1L;

    @ObfuscatedName("nx.g")
    public int field4110 = 0;

    @ObfuscatedName("nx.h")
    public long field4111;

    @ObfuscatedName("nx.n")
    public long field4108;

    @ObfuscatedName("nx.l")
    public long field4113;

    @ObfuscatedName("nx.m")
    public long field4104;

    public class367(class366 arg0, int arg1, int arg2) throws IOException {
        this.field4112 = arg0;
        this.field4113 = this.field4108 = arg0.method5695();
        this.field4107 = new byte[arg1];
        this.field4103 = new byte[arg2];
        this.field4111 = 0L;
    }

    @ObfuscatedName("nx.f(I)V")
    public void method5725() throws IOException {
        this.method5708();
        this.field4112.method5674();
    }

    @ObfuscatedName("nx.o(J)V")
    public void method5702(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field4111 = arg0;
    }

    @ObfuscatedName("nx.u(B)J")
    public long method5703() {
        return this.field4113;
    }

    @ObfuscatedName("nx.p([BI)V")
    public void method5707(byte[] arg0) throws IOException {
        this.method5705(arg0, 0, arg0.length);
    }

    @ObfuscatedName("nx.b([BIII)V")
    public void method5705(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field4109 != -1L && this.field4111 >= this.field4109 && this.field4111 + (long) arg2 <= this.field4109 + (long) this.field4110) {
                System.arraycopy(this.field4103, (int) (this.field4111 - this.field4109), arg0, arg1, arg2);
                this.field4111 += (long) arg2;
                return;
            }
            long var4 = this.field4111;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field4111 >= this.field4106 && this.field4111 < this.field4106 + (long) this.field4105) {
                int var8 = (int) ((long) this.field4105 - (this.field4111 - this.field4106));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field4107, (int) (this.field4111 - this.field4106), arg0, arg1, var8);
                this.field4111 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field4107.length) {
                this.field4112.method5672(this.field4111);
                this.field4104 = this.field4111;
                while (arg2 > 0) {
                    int var9 = this.field4112.method5671(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field4104 += (long) var9;
                    this.field4111 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method5706();
                int var10 = arg2;
                if (arg2 > this.field4105) {
                    var10 = this.field4105;
                }
                System.arraycopy(this.field4107, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field4111 += (long) var10;
            }
            if (this.field4109 != -1L) {
                if (this.field4109 > this.field4111 && arg2 > 0) {
                    int var11 = (int) (this.field4109 - this.field4111) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field4111++;
                    }
                }
                long var12 = -1L;
                long var14 = -1L;
                if (this.field4109 >= var4 && this.field4109 < (long) var7 + var4) {
                    var12 = this.field4109;
                } else if (var4 >= this.field4109 && var4 < this.field4109 + (long) this.field4110) {
                    var12 = var4;
                }
                if (this.field4109 + (long) this.field4110 > var4 && this.field4109 + (long) this.field4110 <= (long) var7 + var4) {
                    var14 = this.field4109 + (long) this.field4110;
                } else if ((long) var7 + var4 > this.field4109 && (long) var7 + var4 <= this.field4109 + (long) this.field4110) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field4103, (int) (var12 - this.field4109), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field4111) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field4111));
                        this.field4111 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field4104 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("nx.e(I)V")
    public void method5706() throws IOException {
        this.field4105 = 0;
        if (this.field4111 != this.field4104) {
            this.field4112.method5672(this.field4111);
            this.field4104 = this.field4111;
        }
        this.field4106 = this.field4111;
        while (this.field4105 < this.field4107.length) {
            int var1 = this.field4107.length - this.field4105;
            if (var1 > 200000000) {
                var1 = 200000000;
            }
            int var2 = this.field4112.method5671(this.field4107, this.field4105, var1);
            if (var2 == -1) {
                break;
            }
            this.field4104 += (long) var2;
            this.field4105 += var2;
        }
    }

    @ObfuscatedName("nx.k([BIII)V")
    public void method5721(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field4111 + (long) arg2 > this.field4113) {
                this.field4113 = this.field4111 + (long) arg2;
            }
            if (this.field4109 != -1L && (this.field4111 < this.field4109 || this.field4111 > this.field4109 + (long) this.field4110)) {
                this.method5708();
            }
            if (this.field4109 != -1L && this.field4111 + (long) arg2 > this.field4109 + (long) this.field4103.length) {
                int var4 = (int) ((long) this.field4103.length - (this.field4111 - this.field4109));
                System.arraycopy(arg0, arg1, this.field4103, (int) (this.field4111 - this.field4109), var4);
                this.field4111 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field4110 = this.field4103.length;
                this.method5708();
            }
            if (arg2 > this.field4103.length) {
                if (this.field4111 != this.field4104) {
                    this.field4112.method5672(this.field4111);
                    this.field4104 = this.field4111;
                }
                this.field4112.method5673(arg0, arg1, arg2);
                this.field4104 += (long) arg2;
                if (this.field4104 > this.field4108) {
                    this.field4108 = this.field4104;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field4111 >= this.field4106 && this.field4111 < this.field4106 + (long) this.field4105) {
                    var5 = this.field4111;
                } else if (this.field4106 >= this.field4111 && this.field4106 < this.field4111 + (long) arg2) {
                    var5 = this.field4106;
                }
                if (this.field4111 + (long) arg2 > this.field4106 && this.field4111 + (long) arg2 <= this.field4106 + (long) this.field4105) {
                    var7 = this.field4111 + (long) arg2;
                } else if (this.field4106 + (long) this.field4105 > this.field4111 && this.field4106 + (long) this.field4105 <= this.field4111 + (long) arg2) {
                    var7 = this.field4106 + (long) this.field4105;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field4111), this.field4107, (int) (var5 - this.field4106), var9);
                }
                this.field4111 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field4109 == -1L) {
                    this.field4109 = this.field4111;
                }
                System.arraycopy(arg0, arg1, this.field4103, (int) (this.field4111 - this.field4109), arg2);
                this.field4111 += (long) arg2;
                if (this.field4111 - this.field4109 > (long) this.field4110) {
                    this.field4110 = (int) (this.field4111 - this.field4109);
                }
            }
        } catch (IOException var11) {
            this.field4104 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("nx.g(B)V")
    public void method5708() throws IOException {
        if (this.field4109 == -1L) {
            return;
        }
        if (this.field4109 != this.field4104) {
            this.field4112.method5672(this.field4109);
            this.field4104 = this.field4109;
        }
        this.field4112.method5673(this.field4103, 0, this.field4110);
        this.field4104 += (long) (this.field4110 * 96245985) * -523064543L;
        if (this.field4104 > this.field4108) {
            this.field4108 = this.field4104;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field4109 >= this.field4106 && this.field4109 < this.field4106 + (long) this.field4105) {
            var1 = this.field4109;
        } else if (this.field4106 >= this.field4109 && this.field4106 < this.field4109 + (long) this.field4110) {
            var1 = this.field4106;
        }
        if (this.field4109 + (long) this.field4110 > this.field4106 && this.field4109 + (long) this.field4110 <= this.field4106 + (long) this.field4105) {
            var3 = this.field4109 + (long) this.field4110;
        } else if (this.field4106 + (long) this.field4105 > this.field4109 && this.field4106 + (long) this.field4105 <= this.field4109 + (long) this.field4110) {
            var3 = this.field4106 + (long) this.field4105;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field4103, (int) (var1 - this.field4109), this.field4107, (int) (var1 - this.field4106), var5);
        }
        this.field4109 = -1L;
        this.field4110 = 0;
    }
}
