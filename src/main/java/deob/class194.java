package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("gi")
public class class194 {

    @ObfuscatedName("gi.z")
    public class193 field2921;

    @ObfuscatedName("gi.j")
    public byte[] field2920;

    @ObfuscatedName("gi.a")
    public long field2922 = -1L;

    @ObfuscatedName("gi.y")
    public int field2923;

    @ObfuscatedName("gi.i")
    public byte[] field2924;

    @ObfuscatedName("gi.b")
    public long field2925 = -1L;

    @ObfuscatedName("gi.s")
    public int field2926 = 0;

    @ObfuscatedName("gi.q")
    public long field2929;

    @ObfuscatedName("gi.p")
    public long field2928;

    @ObfuscatedName("gi.h")
    public long field2932;

    @ObfuscatedName("gi.r")
    public long field2930;

    public class194(class193 arg0, int arg1, int arg2) throws IOException {
        this.field2921 = arg0;
        this.field2932 = this.field2928 = arg0.method3454();
        this.field2920 = new byte[arg1];
        this.field2924 = new byte[arg2];
        this.field2929 = 0L;
    }

    @ObfuscatedName("gi.z(I)V")
    public void method3468() throws IOException {
        this.method3467();
        this.field2921.method3437();
    }

    @ObfuscatedName("gi.j(J)V")
    public void method3457(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field2929 = arg0;
    }

    @ObfuscatedName("gi.a(I)J")
    public long method3458() {
        return this.field2932;
    }

    @ObfuscatedName("gi.y([BS)V")
    public void method3474(byte[] arg0) throws IOException {
        this.method3459(arg0, 0, arg0.length);
    }

    @ObfuscatedName("gi.i([BIII)V")
    public void method3459(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field2925 != -1L && this.field2929 >= this.field2925 && this.field2929 + (long) arg2 <= this.field2925 + (long) this.field2926) {
                System.arraycopy(this.field2924, (int) (this.field2929 - this.field2925), arg0, arg1, arg2);
                this.field2929 += (long) arg2;
                return;
            }
            long var4 = this.field2929;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field2929 >= this.field2922 && this.field2929 < this.field2922 + (long) this.field2923) {
                int var8 = (int) ((long) this.field2923 - (this.field2929 - this.field2922));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field2920, (int) (this.field2929 - this.field2922), arg0, arg1, var8);
                this.field2929 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field2920.length) {
                this.field2921.method3443(this.field2929);
                this.field2930 = this.field2929;
                while (arg2 > 0) {
                    int var9 = this.field2921.method3444(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field2930 += (long) var9;
                    this.field2929 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method3461();
                int var10 = arg2;
                if (arg2 > this.field2923) {
                    var10 = this.field2923;
                }
                System.arraycopy(this.field2920, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field2929 += (long) var10;
            }
            if (this.field2925 != -1L) {
                if (this.field2925 > this.field2929 && arg2 > 0) {
                    int var11 = (int) (this.field2925 - this.field2929) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field2929++;
                    }
                }
                long var12 = -1L;
                long var14 = -1L;
                if (this.field2925 >= var4 && this.field2925 < (long) var7 + var4) {
                    var12 = this.field2925;
                } else if (var4 >= this.field2925 && var4 < this.field2925 + (long) this.field2926) {
                    var12 = var4;
                }
                if (this.field2925 + (long) this.field2926 > var4 && this.field2925 + (long) this.field2926 <= (long) var7 + var4) {
                    var14 = this.field2925 + (long) this.field2926;
                } else if ((long) var7 + var4 > this.field2925 && (long) var7 + var4 <= this.field2925 + (long) this.field2926) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field2924, (int) (var12 - this.field2925), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field2929) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field2929));
                        this.field2929 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field2930 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("gi.b(I)V")
    public void method3461() throws IOException {
        this.field2923 = 0;
        if (this.field2930 != this.field2929) {
            this.field2921.method3443(this.field2929);
            this.field2930 = this.field2929;
        }
        this.field2922 = this.field2929;
        while (this.field2923 < this.field2920.length) {
            int var1 = this.field2921.method3444(this.field2920, this.field2923, this.field2920.length - this.field2923);
            if (var1 == -1) {
                break;
            }
            this.field2930 += (long) var1;
            this.field2923 += var1;
        }
    }

    @ObfuscatedName("gi.s([BIIB)V")
    public void method3462(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field2929 + (long) arg2 > this.field2932) {
                this.field2932 = this.field2929 + (long) arg2;
            }
            if (this.field2925 != -1L && (this.field2929 < this.field2925 || this.field2929 > this.field2925 + (long) this.field2926)) {
                this.method3467();
            }
            if (this.field2925 != -1L && this.field2929 + (long) arg2 > this.field2925 + (long) this.field2924.length) {
                int var4 = (int) ((long) this.field2924.length - (this.field2929 - this.field2925));
                System.arraycopy(arg0, arg1, this.field2924, (int) (this.field2929 - this.field2925), var4);
                this.field2929 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field2926 = this.field2924.length;
                this.method3467();
            }
            if (arg2 > this.field2924.length) {
                if (this.field2930 != this.field2929) {
                    this.field2921.method3443(this.field2929);
                    this.field2930 = this.field2929;
                }
                this.field2921.method3436(arg0, arg1, arg2);
                this.field2930 += (long) arg2;
                if (this.field2930 > this.field2928) {
                    this.field2928 = this.field2930;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field2929 >= this.field2922 && this.field2929 < this.field2922 + (long) this.field2923) {
                    var5 = this.field2929;
                } else if (this.field2922 >= this.field2929 && this.field2922 < this.field2929 + (long) arg2) {
                    var5 = this.field2922;
                }
                if (this.field2929 + (long) arg2 > this.field2922 && this.field2929 + (long) arg2 <= this.field2922 + (long) this.field2923) {
                    var7 = this.field2929 + (long) arg2;
                } else if (this.field2922 + (long) this.field2923 > this.field2929 && this.field2922 + (long) this.field2923 <= this.field2929 + (long) arg2) {
                    var7 = this.field2922 + (long) this.field2923;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field2929), this.field2920, (int) (var5 - this.field2922), var9);
                }
                this.field2929 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field2925 == -1L) {
                    this.field2925 = this.field2929;
                }
                System.arraycopy(arg0, arg1, this.field2924, (int) (this.field2929 - this.field2925), arg2);
                this.field2929 += (long) arg2;
                if (this.field2929 - this.field2925 > (long) this.field2926) {
                    this.field2926 = (int) (this.field2929 - this.field2925);
                }
            }
        } catch (IOException var11) {
            this.field2930 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("gi.q(I)V")
    public void method3467() throws IOException {
        if (this.field2925 == -1L) {
            return;
        }
        if (this.field2930 != this.field2925) {
            this.field2921.method3443(this.field2925);
            this.field2930 = this.field2925;
        }
        this.field2921.method3436(this.field2924, 0, this.field2926);
        this.field2930 += (long) (this.field2926 * -962423571) * -691869467L;
        if (this.field2930 > this.field2928) {
            this.field2928 = this.field2930;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field2925 >= this.field2922 && this.field2925 < this.field2922 + (long) this.field2923) {
            var1 = this.field2925;
        } else if (this.field2922 >= this.field2925 && this.field2922 < this.field2925 + (long) this.field2926) {
            var1 = this.field2922;
        }
        if (this.field2925 + (long) this.field2926 > this.field2922 && this.field2925 + (long) this.field2926 <= this.field2922 + (long) this.field2923) {
            var3 = this.field2925 + (long) this.field2926;
        } else if (this.field2922 + (long) this.field2923 > this.field2925 && this.field2922 + (long) this.field2923 <= this.field2925 + (long) this.field2926) {
            var3 = this.field2922 + (long) this.field2923;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field2924, (int) (var1 - this.field2925), this.field2920, (int) (var1 - this.field2922), var5);
        }
        this.field2925 = -1L;
        this.field2926 = 0;
    }
}
