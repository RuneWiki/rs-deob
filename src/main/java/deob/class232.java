package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("hi")
public class class232 {

    @ObfuscatedName("hi.x")
    public class231 field3275;

    @ObfuscatedName("hi.r")
    public byte[] field3273;

    @ObfuscatedName("hi.j")
    public long field3266 = -1L;

    @ObfuscatedName("hi.z")
    public int field3267;

    @ObfuscatedName("hi.i")
    public byte[] field3268;

    @ObfuscatedName("hi.b")
    public long field3269 = -1L;

    @ObfuscatedName("hi.l")
    public int field3274 = 0;

    @ObfuscatedName("hi.m")
    public long field3270;

    @ObfuscatedName("hi.p")
    public long field3272;

    @ObfuscatedName("hi.f")
    public long field3271;

    @ObfuscatedName("hi.d")
    public long field3265;

    public class232(class231 arg0, int arg1, int arg2) throws IOException {
        this.field3275 = arg0;
        this.field3271 = this.field3272 = arg0.method3881();
        this.field3273 = new byte[arg1];
        this.field3268 = new byte[arg2];
        this.field3270 = 0L;
    }

    @ObfuscatedName("hi.x(I)V")
    public void method3902() throws IOException {
        this.method3911();
        this.field3275.method3880();
    }

    @ObfuscatedName("hi.r(J)V")
    public void method3903(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field3270 = arg0;
    }

    @ObfuscatedName("hi.j(I)J")
    public long method3904() {
        return this.field3271;
    }

    @ObfuscatedName("hi.z([BB)V")
    public void method3905(byte[] arg0) throws IOException {
        this.method3917(arg0, 0, arg0.length);
    }

    @ObfuscatedName("hi.i([BIII)V")
    public void method3917(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field3269 != -1L && this.field3270 >= this.field3269 && this.field3270 + (long) arg2 <= this.field3269 + (long) this.field3274) {
                System.arraycopy(this.field3268, (int) (this.field3270 - this.field3269), arg0, arg1, arg2);
                this.field3270 += (long) arg2;
                return;
            }
            long var4 = this.field3270;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field3270 >= this.field3266 && this.field3270 < this.field3266 + (long) this.field3267) {
                int var8 = (int) ((long) this.field3267 - (this.field3270 - this.field3266));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field3273, (int) (this.field3270 - this.field3266), arg0, arg1, var8);
                this.field3270 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field3273.length) {
                this.field3275.method3878(this.field3270);
                this.field3265 = this.field3270;
                while (arg2 > 0) {
                    int var9 = this.field3275.method3898(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field3265 += (long) var9;
                    this.field3270 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method3907();
                int var10 = arg2;
                if (arg2 > this.field3267) {
                    var10 = this.field3267;
                }
                System.arraycopy(this.field3273, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field3270 += (long) var10;
            }
            if (this.field3269 != -1L) {
                if (this.field3269 > this.field3270 && arg2 > 0) {
                    int var11 = (int) (this.field3269 - this.field3270) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field3270++;
                    }
                }
                long var12 = -1L;
                long var14 = -1L;
                if (this.field3269 >= var4 && this.field3269 < (long) var7 + var4) {
                    var12 = this.field3269;
                } else if (var4 >= this.field3269 && var4 < this.field3269 + (long) this.field3274) {
                    var12 = var4;
                }
                if (this.field3269 + (long) this.field3274 > var4 && this.field3269 + (long) this.field3274 <= (long) var7 + var4) {
                    var14 = this.field3269 + (long) this.field3274;
                } else if ((long) var7 + var4 > this.field3269 && (long) var7 + var4 <= this.field3269 + (long) this.field3274) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field3268, (int) (var12 - this.field3269), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field3270) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field3270));
                        this.field3270 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field3265 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("hi.b(I)V")
    public void method3907() throws IOException {
        this.field3267 = 0;
        if (this.field3270 != this.field3265) {
            this.field3275.method3878(this.field3270);
            this.field3265 = this.field3270;
        }
        this.field3266 = this.field3270;
        while (this.field3267 < this.field3273.length) {
            int var1 = this.field3275.method3898(this.field3273, this.field3267, this.field3273.length - this.field3267);
            if (var1 == -1) {
                break;
            }
            this.field3265 += (long) var1;
            this.field3267 += var1;
        }
    }

    @ObfuscatedName("hi.l([BIIB)V")
    public void method3901(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field3270 + (long) arg2 > this.field3271) {
                this.field3271 = this.field3270 + (long) arg2;
            }
            if (this.field3269 != -1L && (this.field3270 < this.field3269 || this.field3270 > this.field3269 + (long) this.field3274)) {
                this.method3911();
            }
            if (this.field3269 != -1L && this.field3270 + (long) arg2 > this.field3269 + (long) this.field3268.length) {
                int var4 = (int) ((long) this.field3268.length - (this.field3270 - this.field3269));
                System.arraycopy(arg0, arg1, this.field3268, (int) (this.field3270 - this.field3269), var4);
                this.field3270 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field3274 = this.field3268.length;
                this.method3911();
            }
            if (arg2 > this.field3268.length) {
                if (this.field3270 != this.field3265) {
                    this.field3275.method3878(this.field3270);
                    this.field3265 = this.field3270;
                }
                this.field3275.method3879(arg0, arg1, arg2);
                this.field3265 += (long) arg2;
                if (this.field3265 > this.field3272) {
                    this.field3272 = this.field3265;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field3270 >= this.field3266 && this.field3270 < this.field3266 + (long) this.field3267) {
                    var5 = this.field3270;
                } else if (this.field3266 >= this.field3270 && this.field3266 < this.field3270 + (long) arg2) {
                    var5 = this.field3266;
                }
                if (this.field3270 + (long) arg2 > this.field3266 && this.field3270 + (long) arg2 <= this.field3266 + (long) this.field3267) {
                    var7 = this.field3270 + (long) arg2;
                } else if (this.field3266 + (long) this.field3267 > this.field3270 && this.field3266 + (long) this.field3267 <= this.field3270 + (long) arg2) {
                    var7 = this.field3266 + (long) this.field3267;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field3270), this.field3273, (int) (var5 - this.field3266), var9);
                }
                this.field3270 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field3269 == -1L) {
                    this.field3269 = this.field3270;
                }
                System.arraycopy(arg0, arg1, this.field3268, (int) (this.field3270 - this.field3269), arg2);
                this.field3270 += (long) arg2;
                if (this.field3270 - this.field3269 > (long) this.field3274) {
                    this.field3274 = (int) (this.field3270 - this.field3269);
                }
            }
        } catch (IOException var11) {
            this.field3265 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("hi.m(B)V")
    public void method3911() throws IOException {
        if (this.field3269 == -1L) {
            return;
        }
        if (this.field3269 != this.field3265) {
            this.field3275.method3878(this.field3269);
            this.field3265 = this.field3269;
        }
        this.field3275.method3879(this.field3268, 0, this.field3274);
        this.field3265 += (long) (this.field3274 * 112295525) * 2047476589L;
        if (this.field3265 > this.field3272) {
            this.field3272 = this.field3265;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field3269 >= this.field3266 && this.field3269 < this.field3266 + (long) this.field3267) {
            var1 = this.field3269;
        } else if (this.field3266 >= this.field3269 && this.field3266 < this.field3269 + (long) this.field3274) {
            var1 = this.field3266;
        }
        if (this.field3269 + (long) this.field3274 > this.field3266 && this.field3269 + (long) this.field3274 <= this.field3266 + (long) this.field3267) {
            var3 = this.field3269 + (long) this.field3274;
        } else if (this.field3266 + (long) this.field3267 > this.field3269 && this.field3266 + (long) this.field3267 <= this.field3269 + (long) this.field3274) {
            var3 = this.field3266 + (long) this.field3267;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field3268, (int) (var1 - this.field3269), this.field3273, (int) (var1 - this.field3266), var5);
        }
        this.field3269 = -1L;
        this.field3274 = 0;
    }
}
