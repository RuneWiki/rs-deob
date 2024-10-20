package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("nh")
public class class370 {

    @ObfuscatedName("nh.t")
    public class369 field4134;

    @ObfuscatedName("nh.v")
    public byte[] field4135;

    @ObfuscatedName("nh.j")
    public long field4133 = -1L;

    @ObfuscatedName("nh.l")
    public int field4141;

    @ObfuscatedName("nh.n")
    public byte[] field4138;

    @ObfuscatedName("nh.w")
    public long field4139 = -1L;

    @ObfuscatedName("nh.f")
    public int field4140 = 0;

    @ObfuscatedName("nh.o")
    public long field4142;

    @ObfuscatedName("nh.x")
    public long field4144;

    @ObfuscatedName("nh.r")
    public long field4143;

    @ObfuscatedName("nh.p")
    public long field4137;

    public class370(class369 arg0, int arg1, int arg2) throws IOException {
        this.field4134 = arg0;
        this.field4143 = this.field4144 = arg0.method5783();
        this.field4135 = new byte[arg1];
        this.field4138 = new byte[arg2];
        this.field4142 = 0L;
    }

    @ObfuscatedName("nh.s(I)V")
    public void method5825() throws IOException {
        this.method5810();
        this.field4134.method5786();
    }

    @ObfuscatedName("nh.t(J)V")
    public void method5805(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field4142 = arg0;
    }

    @ObfuscatedName("nh.v(S)J")
    public long method5823() {
        return this.field4143;
    }

    @ObfuscatedName("nh.j([BI)V")
    public void method5807(byte[] arg0) throws IOException {
        this.method5821(arg0, 0, arg0.length);
    }

    @ObfuscatedName("nh.l([BIII)V")
    public void method5821(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field4139 != -1L && this.field4142 >= this.field4139 && this.field4142 + (long) arg2 <= this.field4139 + (long) this.field4140) {
                System.arraycopy(this.field4138, (int) (this.field4142 - this.field4139), arg0, arg1, arg2);
                this.field4142 += (long) arg2;
                return;
            }
            long var4 = this.field4142;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field4142 >= this.field4133 && this.field4142 < this.field4133 + (long) this.field4141) {
                int var8 = (int) ((long) this.field4141 - (this.field4142 - this.field4133));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field4135, (int) (this.field4142 - this.field4133), arg0, arg1, var8);
                this.field4142 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field4135.length) {
                this.field4134.method5784(this.field4142);
                this.field4137 = this.field4142;
                while (arg2 > 0) {
                    int var9 = this.field4134.method5789(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field4137 += (long) var9;
                    this.field4142 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method5809();
                int var10 = arg2;
                if (arg2 > this.field4141) {
                    var10 = this.field4141;
                }
                System.arraycopy(this.field4135, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field4142 += (long) var10;
            }
            if (this.field4139 != -1L) {
                if (this.field4139 > this.field4142 && arg2 > 0) {
                    int var11 = (int) (this.field4139 - this.field4142) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field4142++;
                    }
                }
                long var12 = -1L;
                long var14 = -1L;
                if (this.field4139 >= var4 && this.field4139 < (long) var7 + var4) {
                    var12 = this.field4139;
                } else if (var4 >= this.field4139 && var4 < this.field4139 + (long) this.field4140) {
                    var12 = var4;
                }
                if (this.field4139 + (long) this.field4140 > var4 && this.field4139 + (long) this.field4140 <= (long) var7 + var4) {
                    var14 = this.field4139 + (long) this.field4140;
                } else if ((long) var7 + var4 > this.field4139 && (long) var7 + var4 <= this.field4139 + (long) this.field4140) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field4138, (int) (var12 - this.field4139), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field4142) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field4142));
                        this.field4142 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field4137 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("nh.n(I)V")
    public void method5809() throws IOException {
        this.field4141 = 0;
        if (this.field4142 != this.field4137) {
            this.field4134.method5784(this.field4142);
            this.field4137 = this.field4142;
        }
        this.field4133 = this.field4142;
        while (this.field4141 < this.field4135.length) {
            int var1 = this.field4135.length - this.field4141;
            if (var1 > 200000000) {
                var1 = 200000000;
            }
            int var2 = this.field4134.method5789(this.field4135, this.field4141, var1);
            if (var2 == -1) {
                break;
            }
            this.field4137 += (long) var2;
            this.field4141 += var2;
        }
    }

    @ObfuscatedName("nh.w([BIIB)V")
    public void method5811(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field4142 + (long) arg2 > this.field4143) {
                this.field4143 = this.field4142 + (long) arg2;
            }
            if (this.field4139 != -1L && (this.field4142 < this.field4139 || this.field4142 > this.field4139 + (long) this.field4140)) {
                this.method5810();
            }
            if (this.field4139 != -1L && this.field4142 + (long) arg2 > this.field4139 + (long) this.field4138.length) {
                int var4 = (int) ((long) this.field4138.length - (this.field4142 - this.field4139));
                System.arraycopy(arg0, arg1, this.field4138, (int) (this.field4142 - this.field4139), var4);
                this.field4142 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field4140 = this.field4138.length;
                this.method5810();
            }
            if (arg2 > this.field4138.length) {
                if (this.field4142 != this.field4137) {
                    this.field4134.method5784(this.field4142);
                    this.field4137 = this.field4142;
                }
                this.field4134.method5790(arg0, arg1, arg2);
                this.field4137 += (long) arg2;
                if (this.field4137 > this.field4144) {
                    this.field4144 = this.field4137;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field4142 >= this.field4133 && this.field4142 < this.field4133 + (long) this.field4141) {
                    var5 = this.field4142;
                } else if (this.field4133 >= this.field4142 && this.field4133 < this.field4142 + (long) arg2) {
                    var5 = this.field4133;
                }
                if (this.field4142 + (long) arg2 > this.field4133 && this.field4142 + (long) arg2 <= this.field4133 + (long) this.field4141) {
                    var7 = this.field4142 + (long) arg2;
                } else if (this.field4133 + (long) this.field4141 > this.field4142 && this.field4133 + (long) this.field4141 <= this.field4142 + (long) arg2) {
                    var7 = this.field4133 + (long) this.field4141;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field4142), this.field4135, (int) (var5 - this.field4133), var9);
                }
                this.field4142 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field4139 == -1L) {
                    this.field4139 = this.field4142;
                }
                System.arraycopy(arg0, arg1, this.field4138, (int) (this.field4142 - this.field4139), arg2);
                this.field4142 += (long) arg2;
                if (this.field4142 - this.field4139 > (long) this.field4140) {
                    this.field4140 = (int) (this.field4142 - this.field4139);
                }
            }
        } catch (IOException var11) {
            this.field4137 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("nh.f(I)V")
    public void method5810() throws IOException {
        if (this.field4139 == -1L) {
            return;
        }
        if (this.field4139 != this.field4137) {
            this.field4134.method5784(this.field4139);
            this.field4137 = this.field4139;
        }
        this.field4134.method5790(this.field4138, 0, this.field4140);
        this.field4137 += (long) (this.field4140 * 1289049729) * -490411647L;
        if (this.field4137 > this.field4144) {
            this.field4144 = this.field4137;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field4139 >= this.field4133 && this.field4139 < this.field4133 + (long) this.field4141) {
            var1 = this.field4139;
        } else if (this.field4133 >= this.field4139 && this.field4133 < this.field4139 + (long) this.field4140) {
            var1 = this.field4133;
        }
        if (this.field4139 + (long) this.field4140 > this.field4133 && this.field4139 + (long) this.field4140 <= this.field4133 + (long) this.field4141) {
            var3 = this.field4139 + (long) this.field4140;
        } else if (this.field4133 + (long) this.field4141 > this.field4139 && this.field4133 + (long) this.field4141 <= this.field4139 + (long) this.field4140) {
            var3 = this.field4133 + (long) this.field4141;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field4138, (int) (var1 - this.field4139), this.field4135, (int) (var1 - this.field4133), var5);
        }
        this.field4139 = -1L;
        this.field4140 = 0;
    }
}
