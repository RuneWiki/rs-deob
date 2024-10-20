package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("nw")
public class class386 {

    @ObfuscatedName("nw.w")
    public class385 field4250;

    @ObfuscatedName("nw.s")
    public byte[] field4247;

    @ObfuscatedName("nw.a")
    public long field4248 = -1L;

    @ObfuscatedName("nw.o")
    public int field4252;

    @ObfuscatedName("nw.g")
    public byte[] field4246;

    @ObfuscatedName("nw.e")
    public long field4249 = -1L;

    @ObfuscatedName("nw.p")
    public int field4251 = 0;

    @ObfuscatedName("nw.j")
    public long field4253;

    @ObfuscatedName("nw.b")
    public long field4254;

    @ObfuscatedName("nw.x")
    public long field4255;

    @ObfuscatedName("nw.y")
    public long field4256;

    public class386(class385 arg0, int arg1, int arg2) throws IOException {
        this.field4250 = arg0;
        this.field4255 = this.field4254 = arg0.method6075();
        this.field4247 = new byte[arg1];
        this.field4246 = new byte[arg2];
        this.field4253 = 0L;
    }

    @ObfuscatedName("nw.i(I)V")
    public void method6079() throws IOException {
        this.method6102();
        this.field4250.method6062();
    }

    @ObfuscatedName("nw.w(J)V")
    public void method6080(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field4253 = arg0;
    }

    @ObfuscatedName("nw.s(I)J")
    public long method6085() {
        return this.field4255;
    }

    @ObfuscatedName("nw.a([BI)V")
    public void method6082(byte[] arg0) throws IOException {
        this.method6083(arg0, 0, arg0.length);
    }

    @ObfuscatedName("nw.o([BIII)V")
    public void method6083(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field4249 != -1L && this.field4253 >= this.field4249 && this.field4253 + (long) arg2 <= this.field4249 + (long) this.field4251) {
                System.arraycopy(this.field4246, (int) (this.field4253 - this.field4249), arg0, arg1, arg2);
                this.field4253 += (long) arg2;
                return;
            }
            long var4 = this.field4253;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field4253 >= this.field4248 && this.field4253 < this.field4248 + (long) this.field4252) {
                int var8 = (int) ((long) this.field4252 - (this.field4253 - this.field4248));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field4247, (int) (this.field4253 - this.field4248), arg0, arg1, var8);
                this.field4253 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field4247.length) {
                this.field4250.method6060(this.field4253);
                this.field4256 = this.field4253;
                while (arg2 > 0) {
                    int var9 = this.field4250.method6065(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field4256 += (long) var9;
                    this.field4253 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method6094();
                int var10 = arg2;
                if (arg2 > this.field4252) {
                    var10 = this.field4252;
                }
                System.arraycopy(this.field4247, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field4253 += (long) var10;
            }
            if (this.field4249 != -1L) {
                if (this.field4249 > this.field4253 && arg2 > 0) {
                    int var11 = (int) (this.field4249 - this.field4253) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field4253++;
                    }
                }
                long var12 = -1L;
                long var14 = -1L;
                if (this.field4249 >= var4 && this.field4249 < (long) var7 + var4) {
                    var12 = this.field4249;
                } else if (var4 >= this.field4249 && var4 < this.field4249 + (long) this.field4251) {
                    var12 = var4;
                }
                if (this.field4249 + (long) this.field4251 > var4 && this.field4249 + (long) this.field4251 <= (long) var7 + var4) {
                    var14 = this.field4249 + (long) this.field4251;
                } else if ((long) var7 + var4 > this.field4249 && (long) var7 + var4 <= this.field4249 + (long) this.field4251) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field4246, (int) (var12 - this.field4249), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field4253) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field4253));
                        this.field4253 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field4256 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("nw.g(S)V")
    public void method6094() throws IOException {
        this.field4252 = 0;
        if (this.field4256 != this.field4253) {
            this.field4250.method6060(this.field4253);
            this.field4256 = this.field4253;
        }
        this.field4248 = this.field4253;
        while (this.field4252 < this.field4247.length) {
            int var1 = this.field4247.length - this.field4252;
            if (var1 > 200000000) {
                var1 = 200000000;
            }
            int var2 = this.field4250.method6065(this.field4247, this.field4252, var1);
            if (var2 == -1) {
                break;
            }
            this.field4256 += (long) var2;
            this.field4252 += var2;
        }
    }

    @ObfuscatedName("nw.e([BIIB)V")
    public void method6089(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field4253 + (long) arg2 > this.field4255) {
                this.field4255 = this.field4253 + (long) arg2;
            }
            if (this.field4249 != -1L && (this.field4253 < this.field4249 || this.field4253 > this.field4249 + (long) this.field4251)) {
                this.method6102();
            }
            if (this.field4249 != -1L && this.field4253 + (long) arg2 > this.field4249 + (long) this.field4246.length) {
                int var4 = (int) ((long) this.field4246.length - (this.field4253 - this.field4249));
                System.arraycopy(arg0, arg1, this.field4246, (int) (this.field4253 - this.field4249), var4);
                this.field4253 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field4251 = this.field4246.length;
                this.method6102();
            }
            if (arg2 > this.field4246.length) {
                if (this.field4256 != this.field4253) {
                    this.field4250.method6060(this.field4253);
                    this.field4256 = this.field4253;
                }
                this.field4250.method6061(arg0, arg1, arg2);
                this.field4256 += (long) arg2;
                if (this.field4256 > this.field4254) {
                    this.field4254 = this.field4256;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field4253 >= this.field4248 && this.field4253 < this.field4248 + (long) this.field4252) {
                    var5 = this.field4253;
                } else if (this.field4248 >= this.field4253 && this.field4248 < this.field4253 + (long) arg2) {
                    var5 = this.field4248;
                }
                if (this.field4253 + (long) arg2 > this.field4248 && this.field4253 + (long) arg2 <= this.field4248 + (long) this.field4252) {
                    var7 = this.field4253 + (long) arg2;
                } else if (this.field4248 + (long) this.field4252 > this.field4253 && this.field4248 + (long) this.field4252 <= this.field4253 + (long) arg2) {
                    var7 = this.field4248 + (long) this.field4252;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field4253), this.field4247, (int) (var5 - this.field4248), var9);
                }
                this.field4253 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field4249 == -1L) {
                    this.field4249 = this.field4253;
                }
                System.arraycopy(arg0, arg1, this.field4246, (int) (this.field4253 - this.field4249), arg2);
                this.field4253 += (long) arg2;
                if (this.field4253 - this.field4249 > (long) this.field4251) {
                    this.field4251 = (int) (this.field4253 - this.field4249);
                }
            }
        } catch (IOException var11) {
            this.field4256 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("nw.p(I)V")
    public void method6102() throws IOException {
        if (this.field4249 == -1L) {
            return;
        }
        if (this.field4256 != this.field4249) {
            this.field4250.method6060(this.field4249);
            this.field4256 = this.field4249;
        }
        this.field4250.method6061(this.field4246, 0, this.field4251);
        this.field4256 += (long) (this.field4251 * 832461801) * -583652263L;
        if (this.field4256 > this.field4254) {
            this.field4254 = this.field4256;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field4249 >= this.field4248 && this.field4249 < this.field4248 + (long) this.field4252) {
            var1 = this.field4249;
        } else if (this.field4248 >= this.field4249 && this.field4248 < this.field4249 + (long) this.field4251) {
            var1 = this.field4248;
        }
        if (this.field4249 + (long) this.field4251 > this.field4248 && this.field4249 + (long) this.field4251 <= this.field4248 + (long) this.field4252) {
            var3 = this.field4249 + (long) this.field4251;
        } else if (this.field4248 + (long) this.field4252 > this.field4249 && this.field4248 + (long) this.field4252 <= this.field4249 + (long) this.field4251) {
            var3 = this.field4248 + (long) this.field4252;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field4246, (int) (var1 - this.field4249), this.field4247, (int) (var1 - this.field4248), var5);
        }
        this.field4249 = -1L;
        this.field4251 = 0;
    }
}
