package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("hg")
public class class232 {

    @ObfuscatedName("hg.l")
    public class231 field3272;

    @ObfuscatedName("hg.g")
    public byte[] field3262;

    @ObfuscatedName("hg.r")
    public long field3264 = -1L;

    @ObfuscatedName("hg.e")
    public int field3265;

    @ObfuscatedName("hg.h")
    public byte[] field3267;

    @ObfuscatedName("hg.s")
    public long field3266 = -1L;

    @ObfuscatedName("hg.k")
    public int field3263 = 0;

    @ObfuscatedName("hg.u")
    public long field3269;

    @ObfuscatedName("hg.n")
    public long field3270;

    @ObfuscatedName("hg.b")
    public long field3271;

    @ObfuscatedName("hg.m")
    public long field3268;

    public class232(class231 arg0, int arg1, int arg2) throws IOException {
        this.field3272 = arg0;
        this.field3271 = this.field3270 = arg0.method4014();
        this.field3262 = new byte[arg1];
        this.field3267 = new byte[arg2];
        this.field3269 = 0L;
    }

    @ObfuscatedName("hg.l(I)V")
    public void method4033() throws IOException {
        this.method4043();
        this.field3272.method4024();
    }

    @ObfuscatedName("hg.g(J)V")
    public void method4034(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field3269 = arg0;
    }

    @ObfuscatedName("hg.r(I)J")
    public long method4044() {
        return this.field3271;
    }

    @ObfuscatedName("hg.e([BB)V")
    public void method4038(byte[] arg0) throws IOException {
        this.method4036(arg0, 0, arg0.length);
    }

    @ObfuscatedName("hg.h([BIII)V")
    public void method4036(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field3266 != -1L && this.field3269 >= this.field3266 && this.field3269 + (long) arg2 <= this.field3266 + (long) this.field3263) {
                System.arraycopy(this.field3267, (int) (this.field3269 - this.field3266), arg0, arg1, arg2);
                this.field3269 += (long) arg2;
                return;
            }
            long var4 = this.field3269;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field3269 >= this.field3264 && this.field3269 < this.field3264 + (long) this.field3265) {
                int var8 = (int) ((long) this.field3265 - (this.field3269 - this.field3264));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field3262, (int) (this.field3269 - this.field3264), arg0, arg1, var8);
                this.field3269 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field3262.length) {
                this.field3272.method4012(this.field3269);
                this.field3268 = this.field3269;
                while (arg2 > 0) {
                    int var9 = this.field3272.method4015(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field3268 += (long) var9;
                    this.field3269 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method4051();
                int var10 = arg2;
                if (arg2 > this.field3265) {
                    var10 = this.field3265;
                }
                System.arraycopy(this.field3262, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field3269 += (long) var10;
            }
            if (this.field3266 != -1L) {
                if (this.field3266 > this.field3269 && arg2 > 0) {
                    int var11 = (int) (this.field3266 - this.field3269) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field3269++;
                    }
                }
                long var12 = -1L;
                long var14 = -1L;
                if (this.field3266 >= var4 && this.field3266 < (long) var7 + var4) {
                    var12 = this.field3266;
                } else if (var4 >= this.field3266 && var4 < this.field3266 + (long) this.field3263) {
                    var12 = var4;
                }
                if (this.field3266 + (long) this.field3263 > var4 && this.field3266 + (long) this.field3263 <= (long) var7 + var4) {
                    var14 = this.field3266 + (long) this.field3263;
                } else if ((long) var7 + var4 > this.field3266 && (long) var7 + var4 <= this.field3266 + (long) this.field3263) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field3267, (int) (var12 - this.field3266), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field3269) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field3269));
                        this.field3269 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field3268 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("hg.s(I)V")
    public void method4051() throws IOException {
        this.field3265 = 0;
        if (this.field3269 != this.field3268) {
            this.field3272.method4012(this.field3269);
            this.field3268 = this.field3269;
        }
        this.field3264 = this.field3269;
        while (this.field3265 < this.field3262.length) {
            int var1 = this.field3272.method4015(this.field3262, this.field3265, this.field3262.length - this.field3265);
            if (var1 == -1) {
                break;
            }
            this.field3268 += (long) var1;
            this.field3265 += var1;
        }
    }

    @ObfuscatedName("hg.k([BIII)V")
    public void method4039(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field3269 + (long) arg2 > this.field3271) {
                this.field3271 = this.field3269 + (long) arg2;
            }
            if (this.field3266 != -1L && (this.field3269 < this.field3266 || this.field3269 > this.field3266 + (long) this.field3263)) {
                this.method4043();
            }
            if (this.field3266 != -1L && this.field3269 + (long) arg2 > this.field3266 + (long) this.field3267.length) {
                int var4 = (int) ((long) this.field3267.length - (this.field3269 - this.field3266));
                System.arraycopy(arg0, arg1, this.field3267, (int) (this.field3269 - this.field3266), var4);
                this.field3269 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field3263 = this.field3267.length;
                this.method4043();
            }
            if (arg2 > this.field3267.length) {
                if (this.field3269 != this.field3268) {
                    this.field3272.method4012(this.field3269);
                    this.field3268 = this.field3269;
                }
                this.field3272.method4016(arg0, arg1, arg2);
                this.field3268 += (long) arg2;
                if (this.field3268 > this.field3270) {
                    this.field3270 = this.field3268;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field3269 >= this.field3264 && this.field3269 < this.field3264 + (long) this.field3265) {
                    var5 = this.field3269;
                } else if (this.field3264 >= this.field3269 && this.field3264 < this.field3269 + (long) arg2) {
                    var5 = this.field3264;
                }
                if (this.field3269 + (long) arg2 > this.field3264 && this.field3269 + (long) arg2 <= this.field3264 + (long) this.field3265) {
                    var7 = this.field3269 + (long) arg2;
                } else if (this.field3264 + (long) this.field3265 > this.field3269 && this.field3264 + (long) this.field3265 <= this.field3269 + (long) arg2) {
                    var7 = this.field3264 + (long) this.field3265;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field3269), this.field3262, (int) (var5 - this.field3264), var9);
                }
                this.field3269 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field3266 == -1L) {
                    this.field3266 = this.field3269;
                }
                System.arraycopy(arg0, arg1, this.field3267, (int) (this.field3269 - this.field3266), arg2);
                this.field3269 += (long) arg2;
                if (this.field3269 - this.field3266 > (long) this.field3263) {
                    this.field3263 = (int) (this.field3269 - this.field3266);
                }
            }
        } catch (IOException var11) {
            this.field3268 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("hg.u(I)V")
    public void method4043() throws IOException {
        if (this.field3266 == -1L) {
            return;
        }
        if (this.field3268 != this.field3266) {
            this.field3272.method4012(this.field3266);
            this.field3268 = this.field3266;
        }
        this.field3272.method4016(this.field3267, 0, this.field3263);
        this.field3268 += (long) (this.field3263 * 636148671) * -466152385L;
        if (this.field3268 > this.field3270) {
            this.field3270 = this.field3268;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field3266 >= this.field3264 && this.field3266 < this.field3264 + (long) this.field3265) {
            var1 = this.field3266;
        } else if (this.field3264 >= this.field3266 && this.field3264 < this.field3266 + (long) this.field3263) {
            var1 = this.field3264;
        }
        if (this.field3266 + (long) this.field3263 > this.field3264 && this.field3266 + (long) this.field3263 <= this.field3264 + (long) this.field3265) {
            var3 = this.field3266 + (long) this.field3263;
        } else if (this.field3264 + (long) this.field3265 > this.field3266 && this.field3264 + (long) this.field3265 <= this.field3266 + (long) this.field3263) {
            var3 = this.field3264 + (long) this.field3265;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field3267, (int) (var1 - this.field3266), this.field3262, (int) (var1 - this.field3264), var5);
        }
        this.field3266 = -1L;
        this.field3263 = 0;
    }
}
