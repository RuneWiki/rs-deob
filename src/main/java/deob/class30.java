package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("aa")
public class class30 {

    @ObfuscatedName("aa.t")
    public class29 field784;

    @ObfuscatedName("aa.l")
    public byte[] field778;

    @ObfuscatedName("aa.c")
    public long field789 = -1L;

    @ObfuscatedName("aa.d")
    public int field780;

    @ObfuscatedName("aa.b")
    public byte[] field781;

    @ObfuscatedName("aa.i")
    public long field782 = -1L;

    @ObfuscatedName("aa.p")
    public int field783 = 0;

    @ObfuscatedName("aa.y")
    public long field777;

    @ObfuscatedName("aa.u")
    public long field785;

    @ObfuscatedName("aa.z")
    public long field786;

    @ObfuscatedName("aa.j")
    public long field779;

    public class30(class29 arg0, int arg1, int arg2) throws IOException {
        this.field784 = arg0;
        this.field786 = this.field785 = arg0.method568();
        this.field778 = new byte[arg1];
        this.field781 = new byte[arg2];
        this.field777 = 0L;
    }

    @ObfuscatedName("aa.t(B)V")
    public void method610() throws IOException {
        this.method597();
        this.field784.method567();
    }

    @ObfuscatedName("aa.l(J)V")
    public void method591(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field777 = arg0;
    }

    @ObfuscatedName("aa.c(I)J")
    public long method623() {
        return this.field786;
    }

    @ObfuscatedName("aa.d([BI)V")
    public void method593(byte[] arg0) throws IOException {
        this.method594(arg0, 0, arg0.length);
    }

    @ObfuscatedName("aa.b([BIIB)V")
    public void method594(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field782 != -1L && this.field777 >= this.field782 && this.field777 + (long) arg2 <= this.field782 + (long) this.field783) {
                System.arraycopy(this.field781, (int) (this.field777 - this.field782), arg0, arg1, arg2);
                this.field777 += (long) arg2;
                return;
            }
            long var4 = this.field777;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field777 >= this.field789 && this.field777 < this.field789 + (long) this.field780) {
                int var8 = (int) ((long) this.field780 - (this.field777 - this.field789));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field778, (int) (this.field777 - this.field789), arg0, arg1, var8);
                this.field777 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field778.length) {
                this.field784.method566(this.field777);
                this.field779 = this.field777;
                while (arg2 > 0) {
                    int var9 = this.field784.method569(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field779 += (long) var9;
                    this.field777 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method595();
                int var10 = arg2;
                if (arg2 > this.field780) {
                    var10 = this.field780;
                }
                System.arraycopy(this.field778, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field777 += (long) var10;
            }
            if (this.field782 != -1L) {
                if (this.field782 > this.field777 && arg2 > 0) {
                    int var11 = (int) (this.field782 - this.field777) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field777++;
                    }
                }
                long var12 = -1L;
                long var14 = -1L;
                if (this.field782 >= var4 && this.field782 < (long) var7 + var4) {
                    var12 = this.field782;
                } else if (var4 >= this.field782 && var4 < this.field782 + (long) this.field783) {
                    var12 = var4;
                }
                if (this.field782 + (long) this.field783 > var4 && this.field782 + (long) this.field783 <= (long) var7 + var4) {
                    var14 = this.field782 + (long) this.field783;
                } else if ((long) var7 + var4 > this.field782 && (long) var7 + var4 <= this.field782 + (long) this.field783) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field781, (int) (var12 - this.field782), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field777) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field777));
                        this.field777 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field779 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("aa.i(B)V")
    public void method595() throws IOException {
        this.field780 = 0;
        if (this.field779 != this.field777) {
            this.field784.method566(this.field777);
            this.field779 = this.field777;
        }
        this.field789 = this.field777;
        while (this.field780 < this.field778.length) {
            int var1 = this.field784.method569(this.field778, this.field780, this.field778.length - this.field780);
            if (var1 == -1) {
                break;
            }
            this.field779 += (long) var1;
            this.field780 += var1;
        }
    }

    @ObfuscatedName("aa.p([BIII)V")
    public void method596(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field777 + (long) arg2 > this.field786) {
                this.field786 = this.field777 + (long) arg2;
            }
            if (this.field782 != -1L && (this.field777 < this.field782 || this.field777 > this.field782 + (long) this.field783)) {
                this.method597();
            }
            if (this.field782 != -1L && this.field777 + (long) arg2 > this.field782 + (long) this.field781.length) {
                int var4 = (int) ((long) this.field781.length - (this.field777 - this.field782));
                System.arraycopy(arg0, arg1, this.field781, (int) (this.field777 - this.field782), var4);
                this.field777 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field783 = this.field781.length;
                this.method597();
            }
            if (arg2 > this.field781.length) {
                if (this.field779 != this.field777) {
                    this.field784.method566(this.field777);
                    this.field779 = this.field777;
                }
                this.field784.method570(arg0, arg1, arg2);
                this.field779 += (long) arg2;
                if (this.field779 > this.field785) {
                    this.field785 = this.field779;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field777 >= this.field789 && this.field777 < this.field789 + (long) this.field780) {
                    var5 = this.field777;
                } else if (this.field789 >= this.field777 && this.field789 < this.field777 + (long) arg2) {
                    var5 = this.field789;
                }
                if (this.field777 + (long) arg2 > this.field789 && this.field777 + (long) arg2 <= this.field789 + (long) this.field780) {
                    var7 = this.field777 + (long) arg2;
                } else if (this.field789 + (long) this.field780 > this.field777 && this.field789 + (long) this.field780 <= this.field777 + (long) arg2) {
                    var7 = this.field789 + (long) this.field780;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field777), this.field778, (int) (var5 - this.field789), var9);
                }
                this.field777 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field782 == -1L) {
                    this.field782 = this.field777;
                }
                System.arraycopy(arg0, arg1, this.field781, (int) (this.field777 - this.field782), arg2);
                this.field777 += (long) arg2;
                if (this.field777 - this.field782 > (long) this.field783) {
                    this.field783 = (int) (this.field777 - this.field782);
                }
            }
        } catch (IOException var11) {
            this.field779 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("aa.y(B)V")
    public void method597() throws IOException {
        if (this.field782 == -1L) {
            return;
        }
        if (this.field782 != this.field779) {
            this.field784.method566(this.field782);
            this.field779 = this.field782;
        }
        this.field784.method570(this.field781, 0, this.field783);
        this.field779 += (long) (this.field783 * -1644972037) * -271926477L;
        if (this.field779 > this.field785) {
            this.field785 = this.field779;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field782 >= this.field789 && this.field782 < this.field789 + (long) this.field780) {
            var1 = this.field782;
        } else if (this.field789 >= this.field782 && this.field789 < this.field782 + (long) this.field783) {
            var1 = this.field789;
        }
        if (this.field782 + (long) this.field783 > this.field789 && this.field782 + (long) this.field783 <= this.field789 + (long) this.field780) {
            var3 = this.field782 + (long) this.field783;
        } else if (this.field789 + (long) this.field780 > this.field782 && this.field789 + (long) this.field780 <= this.field782 + (long) this.field783) {
            var3 = this.field789 + (long) this.field780;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field781, (int) (var1 - this.field782), this.field778, (int) (var1 - this.field789), var5);
        }
        this.field782 = -1L;
        this.field783 = 0;
    }
}
