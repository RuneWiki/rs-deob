package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("hh")
public class class229 {

    @ObfuscatedName("hh.b")
    public class228 field3225;

    @ObfuscatedName("hh.g")
    public byte[] field3221;

    @ObfuscatedName("hh.j")
    public long field3219 = -1L;

    @ObfuscatedName("hh.d")
    public int field3222;

    @ObfuscatedName("hh.x")
    public byte[] field3218;

    @ObfuscatedName("hh.y")
    public long field3223 = -1L;

    @ObfuscatedName("hh.r")
    public int field3220 = 0;

    @ObfuscatedName("hh.c")
    public long field3227;

    @ObfuscatedName("hh.l")
    public long field3226;

    @ObfuscatedName("hh.u")
    public long field3224;

    @ObfuscatedName("hh.p")
    public long field3228;

    public class229(class228 arg0, int arg1, int arg2) throws IOException {
        this.field3225 = arg0;
        this.field3224 = this.field3226 = arg0.method3837();
        this.field3221 = new byte[arg1];
        this.field3218 = new byte[arg2];
        this.field3227 = 0L;
    }

    @ObfuscatedName("hh.b(I)V")
    public void method3855() throws IOException {
        this.method3854();
        this.field3225.method3840();
    }

    @ObfuscatedName("hh.g(J)V")
    public void method3870(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field3227 = arg0;
    }

    @ObfuscatedName("hh.j(S)J")
    public long method3856() {
        return this.field3224;
    }

    @ObfuscatedName("hh.d([BI)V")
    public void method3858(byte[] arg0) throws IOException {
        this.method3859(arg0, 0, arg0.length);
    }

    @ObfuscatedName("hh.x([BIII)V")
    public void method3859(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field3223 != -1L && this.field3227 >= this.field3223 && this.field3227 + (long) arg2 <= this.field3223 + (long) this.field3220) {
                System.arraycopy(this.field3218, (int) (this.field3227 - this.field3223), arg0, arg1, arg2);
                this.field3227 += (long) arg2;
                return;
            }
            long var4 = this.field3227;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field3227 >= this.field3219 && this.field3227 < this.field3219 + (long) this.field3222) {
                int var8 = (int) ((long) this.field3222 - (this.field3227 - this.field3219));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field3221, (int) (this.field3227 - this.field3219), arg0, arg1, var8);
                this.field3227 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field3221.length) {
                this.field3225.method3838(this.field3227);
                this.field3228 = this.field3227;
                while (arg2 > 0) {
                    int var9 = this.field3225.method3842(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field3228 += (long) var9;
                    this.field3227 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method3862();
                int var10 = arg2;
                if (arg2 > this.field3222) {
                    var10 = this.field3222;
                }
                System.arraycopy(this.field3221, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field3227 += (long) var10;
            }
            if (this.field3223 != -1L) {
                if (this.field3223 > this.field3227 && arg2 > 0) {
                    int var11 = (int) (this.field3223 - this.field3227) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field3227++;
                    }
                }
                long var12 = -1L;
                long var14 = -1L;
                if (this.field3223 >= var4 && this.field3223 < (long) var7 + var4) {
                    var12 = this.field3223;
                } else if (var4 >= this.field3223 && var4 < this.field3223 + (long) this.field3220) {
                    var12 = var4;
                }
                if (this.field3223 + (long) this.field3220 > var4 && this.field3223 + (long) this.field3220 <= (long) var7 + var4) {
                    var14 = this.field3223 + (long) this.field3220;
                } else if ((long) var7 + var4 > this.field3223 && (long) var7 + var4 <= this.field3223 + (long) this.field3220) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field3218, (int) (var12 - this.field3223), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field3227) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field3227));
                        this.field3227 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field3228 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("hh.y(I)V")
    public void method3862() throws IOException {
        this.field3222 = 0;
        if (this.field3228 != this.field3227) {
            this.field3225.method3838(this.field3227);
            this.field3228 = this.field3227;
        }
        this.field3219 = this.field3227;
        while (this.field3222 < this.field3221.length) {
            int var1 = this.field3225.method3842(this.field3221, this.field3222, this.field3221.length - this.field3222);
            if (var1 == -1) {
                break;
            }
            this.field3228 += (long) var1;
            this.field3222 += var1;
        }
    }

    @ObfuscatedName("hh.r([BIII)V")
    public void method3861(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field3227 + (long) arg2 > this.field3224) {
                this.field3224 = this.field3227 + (long) arg2;
            }
            if (this.field3223 != -1L && (this.field3227 < this.field3223 || this.field3227 > this.field3223 + (long) this.field3220)) {
                this.method3854();
            }
            if (this.field3223 != -1L && this.field3227 + (long) arg2 > this.field3223 + (long) this.field3218.length) {
                int var4 = (int) ((long) this.field3218.length - (this.field3227 - this.field3223));
                System.arraycopy(arg0, arg1, this.field3218, (int) (this.field3227 - this.field3223), var4);
                this.field3227 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field3220 = this.field3218.length;
                this.method3854();
            }
            if (arg2 > this.field3218.length) {
                if (this.field3228 != this.field3227) {
                    this.field3225.method3838(this.field3227);
                    this.field3228 = this.field3227;
                }
                this.field3225.method3851(arg0, arg1, arg2);
                this.field3228 += (long) arg2;
                if (this.field3228 > this.field3226) {
                    this.field3226 = this.field3228;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field3227 >= this.field3219 && this.field3227 < this.field3219 + (long) this.field3222) {
                    var5 = this.field3227;
                } else if (this.field3219 >= this.field3227 && this.field3219 < this.field3227 + (long) arg2) {
                    var5 = this.field3219;
                }
                if (this.field3227 + (long) arg2 > this.field3219 && this.field3227 + (long) arg2 <= this.field3219 + (long) this.field3222) {
                    var7 = this.field3227 + (long) arg2;
                } else if (this.field3219 + (long) this.field3222 > this.field3227 && this.field3219 + (long) this.field3222 <= this.field3227 + (long) arg2) {
                    var7 = this.field3219 + (long) this.field3222;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field3227), this.field3221, (int) (var5 - this.field3219), var9);
                }
                this.field3227 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field3223 == -1L) {
                    this.field3223 = this.field3227;
                }
                System.arraycopy(arg0, arg1, this.field3218, (int) (this.field3227 - this.field3223), arg2);
                this.field3227 += (long) arg2;
                if (this.field3227 - this.field3223 > (long) this.field3220) {
                    this.field3220 = (int) (this.field3227 - this.field3223);
                }
            }
        } catch (IOException var11) {
            this.field3228 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("hh.c(S)V")
    public void method3854() throws IOException {
        if (this.field3223 == -1L) {
            return;
        }
        if (this.field3228 != this.field3223) {
            this.field3225.method3838(this.field3223);
            this.field3228 = this.field3223;
        }
        this.field3225.method3851(this.field3218, 0, this.field3220);
        this.field3228 += (long) (this.field3220 * 611138327) * -97669977L;
        if (this.field3228 > this.field3226) {
            this.field3226 = this.field3228;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field3223 >= this.field3219 && this.field3223 < this.field3219 + (long) this.field3222) {
            var1 = this.field3223;
        } else if (this.field3219 >= this.field3223 && this.field3219 < this.field3223 + (long) this.field3220) {
            var1 = this.field3219;
        }
        if (this.field3223 + (long) this.field3220 > this.field3219 && this.field3223 + (long) this.field3220 <= this.field3219 + (long) this.field3222) {
            var3 = this.field3223 + (long) this.field3220;
        } else if (this.field3219 + (long) this.field3222 > this.field3223 && this.field3219 + (long) this.field3222 <= this.field3223 + (long) this.field3220) {
            var3 = this.field3219 + (long) this.field3222;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field3218, (int) (var1 - this.field3223), this.field3221, (int) (var1 - this.field3219), var5);
        }
        this.field3223 = -1L;
        this.field3220 = 0;
    }
}
