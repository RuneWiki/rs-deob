package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("nf")
public class class368 {

    @ObfuscatedName("nf.n")
    public class367 field4110;

    @ObfuscatedName("nf.f")
    public byte[] field4105;

    @ObfuscatedName("nf.y")
    public long field4106 = -1L;

    @ObfuscatedName("nf.p")
    public int field4107;

    @ObfuscatedName("nf.j")
    public byte[] field4114;

    @ObfuscatedName("nf.r")
    public long field4109 = -1L;

    @ObfuscatedName("nf.b")
    public int field4104 = 0;

    @ObfuscatedName("nf.d")
    public long field4111;

    @ObfuscatedName("nf.s")
    public long field4112;

    @ObfuscatedName("nf.u")
    public long field4108;

    @ObfuscatedName("nf.l")
    public long field4113;

    public class368(class367 arg0, int arg1, int arg2) throws IOException {
        this.field4110 = arg0;
        this.field4108 = this.field4112 = arg0.method5809();
        this.field4105 = new byte[arg1];
        this.field4114 = new byte[arg2];
        this.field4111 = 0L;
    }

    @ObfuscatedName("nf.v(B)V")
    public void method5824() throws IOException {
        this.method5831();
        this.field4110.method5823();
    }

    @ObfuscatedName("nf.n(J)V")
    public void method5825(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field4111 = arg0;
    }

    @ObfuscatedName("nf.f(B)J")
    public long method5826() {
        return this.field4108;
    }

    @ObfuscatedName("nf.y([BB)V")
    public void method5827(byte[] arg0) throws IOException {
        this.method5829(arg0, 0, arg0.length);
    }

    @ObfuscatedName("nf.p([BIII)V")
    public void method5829(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field4109 != -1L && this.field4111 >= this.field4109 && this.field4111 + (long) arg2 <= this.field4109 + (long) this.field4104) {
                System.arraycopy(this.field4114, (int) (this.field4111 - this.field4109), arg0, arg1, arg2);
                this.field4111 += (long) arg2;
                return;
            }
            long var4 = this.field4111;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field4111 >= this.field4106 && this.field4111 < this.field4106 + (long) this.field4107) {
                int var8 = (int) ((long) this.field4107 - (this.field4111 - this.field4106));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field4105, (int) (this.field4111 - this.field4106), arg0, arg1, var8);
                this.field4111 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field4105.length) {
                this.field4110.method5812(this.field4111);
                this.field4113 = this.field4111;
                while (arg2 > 0) {
                    int var9 = this.field4110.method5810(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field4113 += (long) var9;
                    this.field4111 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method5834();
                int var10 = arg2;
                if (arg2 > this.field4107) {
                    var10 = this.field4107;
                }
                System.arraycopy(this.field4105, 0, arg0, arg1, var10);
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
                } else if (var4 >= this.field4109 && var4 < this.field4109 + (long) this.field4104) {
                    var12 = var4;
                }
                if (this.field4109 + (long) this.field4104 > var4 && this.field4109 + (long) this.field4104 <= (long) var7 + var4) {
                    var14 = this.field4109 + (long) this.field4104;
                } else if ((long) var7 + var4 > this.field4109 && (long) var7 + var4 <= this.field4109 + (long) this.field4104) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field4114, (int) (var12 - this.field4109), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field4111) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field4111));
                        this.field4111 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field4113 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("nf.j(B)V")
    public void method5834() throws IOException {
        this.field4107 = 0;
        if (this.field4113 != this.field4111) {
            this.field4110.method5812(this.field4111);
            this.field4113 = this.field4111;
        }
        this.field4106 = this.field4111;
        while (this.field4107 < this.field4105.length) {
            int var1 = this.field4105.length - this.field4107;
            if (var1 > 200000000) {
                var1 = 200000000;
            }
            int var2 = this.field4110.method5810(this.field4105, this.field4107, var1);
            if (var2 == -1) {
                break;
            }
            this.field4113 += (long) var2;
            this.field4107 += var2;
        }
    }

    @ObfuscatedName("nf.r([BIII)V")
    public void method5830(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field4111 + (long) arg2 > this.field4108) {
                this.field4108 = this.field4111 + (long) arg2;
            }
            if (this.field4109 != -1L && (this.field4111 < this.field4109 || this.field4111 > this.field4109 + (long) this.field4104)) {
                this.method5831();
            }
            if (this.field4109 != -1L && this.field4111 + (long) arg2 > this.field4109 + (long) this.field4114.length) {
                int var4 = (int) ((long) this.field4114.length - (this.field4111 - this.field4109));
                System.arraycopy(arg0, arg1, this.field4114, (int) (this.field4111 - this.field4109), var4);
                this.field4111 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field4104 = this.field4114.length;
                this.method5831();
            }
            if (arg2 > this.field4114.length) {
                if (this.field4113 != this.field4111) {
                    this.field4110.method5812(this.field4111);
                    this.field4113 = this.field4111;
                }
                this.field4110.method5806(arg0, arg1, arg2);
                this.field4113 += (long) arg2;
                if (this.field4113 > this.field4112) {
                    this.field4112 = this.field4113;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field4111 >= this.field4106 && this.field4111 < this.field4106 + (long) this.field4107) {
                    var5 = this.field4111;
                } else if (this.field4106 >= this.field4111 && this.field4106 < this.field4111 + (long) arg2) {
                    var5 = this.field4106;
                }
                if (this.field4111 + (long) arg2 > this.field4106 && this.field4111 + (long) arg2 <= this.field4106 + (long) this.field4107) {
                    var7 = this.field4111 + (long) arg2;
                } else if (this.field4106 + (long) this.field4107 > this.field4111 && this.field4106 + (long) this.field4107 <= this.field4111 + (long) arg2) {
                    var7 = this.field4106 + (long) this.field4107;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field4111), this.field4105, (int) (var5 - this.field4106), var9);
                }
                this.field4111 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field4109 == -1L) {
                    this.field4109 = this.field4111;
                }
                System.arraycopy(arg0, arg1, this.field4114, (int) (this.field4111 - this.field4109), arg2);
                this.field4111 += (long) arg2;
                if (this.field4111 - this.field4109 > (long) this.field4104) {
                    this.field4104 = (int) (this.field4111 - this.field4109);
                }
            }
        } catch (IOException var11) {
            this.field4113 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("nf.b(I)V")
    public void method5831() throws IOException {
        if (this.field4109 == -1L) {
            return;
        }
        if (this.field4113 != this.field4109) {
            this.field4110.method5812(this.field4109);
            this.field4113 = this.field4109;
        }
        this.field4110.method5806(this.field4114, 0, this.field4104);
        this.field4113 += (long) (this.field4104 * 282954243) * -97062741L;
        if (this.field4113 > this.field4112) {
            this.field4112 = this.field4113;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field4109 >= this.field4106 && this.field4109 < this.field4106 + (long) this.field4107) {
            var1 = this.field4109;
        } else if (this.field4106 >= this.field4109 && this.field4106 < this.field4109 + (long) this.field4104) {
            var1 = this.field4106;
        }
        if (this.field4109 + (long) this.field4104 > this.field4106 && this.field4109 + (long) this.field4104 <= this.field4106 + (long) this.field4107) {
            var3 = this.field4109 + (long) this.field4104;
        } else if (this.field4106 + (long) this.field4107 > this.field4109 && this.field4106 + (long) this.field4107 <= this.field4109 + (long) this.field4104) {
            var3 = this.field4106 + (long) this.field4107;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field4114, (int) (var1 - this.field4109), this.field4105, (int) (var1 - this.field4106), var5);
        }
        this.field4109 = -1L;
        this.field4104 = 0;
    }
}
