package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("qx")
public class class447 {

    @ObfuscatedName("qx.f")
    public class446 field4808;

    @ObfuscatedName("qx.c")
    public byte[] field4803;

    @ObfuscatedName("qx.x")
    public long field4804 = -1L;

    @ObfuscatedName("qx.h")
    public int field4805;

    @ObfuscatedName("qx.j")
    public byte[] field4801;

    @ObfuscatedName("qx.y")
    public long field4807 = -1L;

    @ObfuscatedName("qx.d")
    public int field4811 = 0;

    @ObfuscatedName("qx.n")
    public long field4809;

    @ObfuscatedName("qx.r")
    public long field4810;

    @ObfuscatedName("qx.l")
    public long field4806;

    @ObfuscatedName("qx.s")
    public long field4812;

    public class447(class446 arg0, int arg1, int arg2) throws IOException {
        this.field4808 = arg0;
        this.field4806 = this.field4810 = arg0.method7501();
        this.field4803 = new byte[arg1];
        this.field4801 = new byte[arg2];
        this.field4809 = 0L;
    }

    @ObfuscatedName("qx.a(I)V")
    public void method7522() throws IOException {
        this.method7524();
        this.field4808.method7502();
    }

    @ObfuscatedName("qx.f(J)V")
    public void method7518(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field4809 = arg0;
    }

    @ObfuscatedName("qx.c(I)J")
    public long method7519() {
        return this.field4806;
    }

    @ObfuscatedName("qx.x([BB)V")
    public void method7516(byte[] arg0) throws IOException {
        this.method7517(arg0, 0, arg0.length);
    }

    @ObfuscatedName("qx.h([BIII)V")
    public void method7517(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field4807 != -1L && this.field4809 >= this.field4807 && this.field4809 + (long) arg2 <= this.field4807 + (long) this.field4811) {
                System.arraycopy(this.field4801, (int) (this.field4809 - this.field4807), arg0, arg1, arg2);
                this.field4809 += (long) arg2;
                return;
            }
            long var4 = this.field4809;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field4809 >= this.field4804 && this.field4809 < this.field4804 + (long) this.field4805) {
                int var8 = (int) ((long) this.field4805 - (this.field4809 - this.field4804));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field4803, (int) (this.field4809 - this.field4804), arg0, arg1, var8);
                this.field4809 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field4803.length) {
                this.field4808.method7507(this.field4809);
                this.field4812 = this.field4809;
                while (arg2 > 0) {
                    int var9 = this.field4808.method7497(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field4812 += (long) var9;
                    this.field4809 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method7535();
                int var10 = arg2;
                if (arg2 > this.field4805) {
                    var10 = this.field4805;
                }
                System.arraycopy(this.field4803, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field4809 += (long) var10;
            }
            if (this.field4807 != -1L) {
                if (this.field4807 > this.field4809 && arg2 > 0) {
                    int var11 = (int) (this.field4807 - this.field4809) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field4809++;
                    }
                }
                long var12 = -1L;
                long var14 = -1L;
                if (this.field4807 >= var4 && this.field4807 < (long) var7 + var4) {
                    var12 = this.field4807;
                } else if (var4 >= this.field4807 && var4 < this.field4807 + (long) this.field4811) {
                    var12 = var4;
                }
                if (this.field4807 + (long) this.field4811 > var4 && this.field4807 + (long) this.field4811 <= (long) var7 + var4) {
                    var14 = this.field4807 + (long) this.field4811;
                } else if ((long) var7 + var4 > this.field4807 && (long) var7 + var4 <= this.field4807 + (long) this.field4811) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field4801, (int) (var12 - this.field4807), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field4809) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field4809));
                        this.field4809 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field4812 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("qx.j(I)V")
    public void method7535() throws IOException {
        this.field4805 = 0;
        if (this.field4812 != this.field4809) {
            this.field4808.method7507(this.field4809);
            this.field4812 = this.field4809;
        }
        this.field4804 = this.field4809;
        while (this.field4805 < this.field4803.length) {
            int var1 = this.field4803.length - this.field4805;
            if (var1 > 200000000) {
                var1 = 200000000;
            }
            int var2 = this.field4808.method7497(this.field4803, this.field4805, var1);
            if (var2 == -1) {
                break;
            }
            this.field4812 += (long) var2;
            this.field4805 += var2;
        }
    }

    @ObfuscatedName("qx.y([BIII)V")
    public void method7523(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field4809 + (long) arg2 > this.field4806) {
                this.field4806 = this.field4809 + (long) arg2;
            }
            if (this.field4807 != -1L && (this.field4809 < this.field4807 || this.field4809 > this.field4807 + (long) this.field4811)) {
                this.method7524();
            }
            if (this.field4807 != -1L && this.field4809 + (long) arg2 > this.field4807 + (long) this.field4801.length) {
                int var4 = (int) ((long) this.field4801.length - (this.field4809 - this.field4807));
                System.arraycopy(arg0, arg1, this.field4801, (int) (this.field4809 - this.field4807), var4);
                this.field4809 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field4811 = this.field4801.length;
                this.method7524();
            }
            if (arg2 > this.field4801.length) {
                if (this.field4812 != this.field4809) {
                    this.field4808.method7507(this.field4809);
                    this.field4812 = this.field4809;
                }
                this.field4808.method7498(arg0, arg1, arg2);
                this.field4812 += (long) arg2;
                if (this.field4812 > this.field4810) {
                    this.field4810 = this.field4812;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field4809 >= this.field4804 && this.field4809 < this.field4804 + (long) this.field4805) {
                    var5 = this.field4809;
                } else if (this.field4804 >= this.field4809 && this.field4804 < this.field4809 + (long) arg2) {
                    var5 = this.field4804;
                }
                if (this.field4809 + (long) arg2 > this.field4804 && this.field4809 + (long) arg2 <= this.field4804 + (long) this.field4805) {
                    var7 = this.field4809 + (long) arg2;
                } else if (this.field4804 + (long) this.field4805 > this.field4809 && this.field4804 + (long) this.field4805 <= this.field4809 + (long) arg2) {
                    var7 = this.field4804 + (long) this.field4805;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field4809), this.field4803, (int) (var5 - this.field4804), var9);
                }
                this.field4809 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field4807 == -1L) {
                    this.field4807 = this.field4809;
                }
                System.arraycopy(arg0, arg1, this.field4801, (int) (this.field4809 - this.field4807), arg2);
                this.field4809 += (long) arg2;
                if (this.field4809 - this.field4807 > (long) this.field4811) {
                    this.field4811 = (int) (this.field4809 - this.field4807);
                }
            }
        } catch (IOException var11) {
            this.field4812 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("qx.d(B)V")
    public void method7524() throws IOException {
        if (this.field4807 == -1L) {
            return;
        }
        if (this.field4812 != this.field4807) {
            this.field4808.method7507(this.field4807);
            this.field4812 = this.field4807;
        }
        this.field4808.method7498(this.field4801, 0, this.field4811);
        this.field4812 += (long) (this.field4811 * -1321221861) * -128732909L;
        if (this.field4812 > this.field4810) {
            this.field4810 = this.field4812;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field4807 >= this.field4804 && this.field4807 < this.field4804 + (long) this.field4805) {
            var1 = this.field4807;
        } else if (this.field4804 >= this.field4807 && this.field4804 < this.field4807 + (long) this.field4811) {
            var1 = this.field4804;
        }
        if (this.field4807 + (long) this.field4811 > this.field4804 && this.field4807 + (long) this.field4811 <= this.field4804 + (long) this.field4805) {
            var3 = this.field4807 + (long) this.field4811;
        } else if (this.field4804 + (long) this.field4805 > this.field4807 && this.field4804 + (long) this.field4805 <= this.field4807 + (long) this.field4811) {
            var3 = this.field4804 + (long) this.field4805;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field4801, (int) (var1 - this.field4807), this.field4803, (int) (var1 - this.field4804), var5);
        }
        this.field4807 = -1L;
        this.field4811 = 0;
    }
}
