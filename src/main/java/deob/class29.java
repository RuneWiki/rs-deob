package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("af")
public class class29 {

    @ObfuscatedName("af.u")
    public class28 field749;

    @ObfuscatedName("af.k")
    public byte[] field762;

    @ObfuscatedName("af.x")
    public long field751 = -1L;

    @ObfuscatedName("af.m")
    public int field752;

    @ObfuscatedName("af.n")
    public byte[] field750;

    @ObfuscatedName("af.q")
    public long field754 = -1L;

    @ObfuscatedName("af.a")
    public int field755 = 0;

    @ObfuscatedName("af.g")
    public long field756;

    @ObfuscatedName("af.j")
    public long field757;

    @ObfuscatedName("af.l")
    public long field763;

    @ObfuscatedName("af.w")
    public long field759;

    public class29(class28 arg0, int arg1, int arg2) throws IOException {
        this.field749 = arg0;
        this.field763 = this.field757 = arg0.method531();
        this.field762 = new byte[arg1];
        this.field750 = new byte[arg2];
        this.field756 = 0L;
    }

    @ObfuscatedName("af.u(B)V")
    public void method562() throws IOException {
        this.method559();
        this.field749.method549();
    }

    @ObfuscatedName("af.k(J)V")
    public void method575(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field756 = arg0;
    }

    @ObfuscatedName("af.x(I)J")
    public long method552() {
        return this.field763;
    }

    @ObfuscatedName("af.m([BI)V")
    public void method554(byte[] arg0) throws IOException {
        this.method555(arg0, 0, arg0.length);
    }

    @ObfuscatedName("af.n([BIII)V")
    public void method555(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field754 != -1L && this.field756 >= this.field754 && this.field756 + (long) arg2 <= this.field754 + (long) this.field755) {
                System.arraycopy(this.field750, (int) (this.field756 - this.field754), arg0, arg1, arg2);
                this.field756 += (long) arg2;
                return;
            }
            long var4 = this.field756;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field756 >= this.field751 && this.field756 < this.field751 + (long) this.field752) {
                int var8 = (int) ((long) this.field752 - (this.field756 - this.field751));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field762, (int) (this.field756 - this.field751), arg0, arg1, var8);
                this.field756 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field762.length) {
                this.field749.method528(this.field756);
                this.field759 = this.field756;
                while (arg2 > 0) {
                    int var9 = this.field749.method532(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field759 += (long) var9;
                    this.field756 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method553();
                int var10 = arg2;
                if (arg2 > this.field752) {
                    var10 = this.field752;
                }
                System.arraycopy(this.field762, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field756 += (long) var10;
            }
            if (this.field754 != -1L) {
                if (this.field754 > this.field756 && arg2 > 0) {
                    int var11 = (int) (this.field754 - this.field756) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field756++;
                    }
                }
                long var12 = -1L;
                long var14 = -1L;
                if (this.field754 >= var4 && this.field754 < (long) var7 + var4) {
                    var12 = this.field754;
                } else if (var4 >= this.field754 && var4 < this.field754 + (long) this.field755) {
                    var12 = var4;
                }
                if (this.field754 + (long) this.field755 > var4 && this.field754 + (long) this.field755 <= (long) var7 + var4) {
                    var14 = this.field754 + (long) this.field755;
                } else if ((long) var7 + var4 > this.field754 && (long) var7 + var4 <= this.field754 + (long) this.field755) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field750, (int) (var12 - this.field754), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field756) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field756));
                        this.field756 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field759 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("af.q(I)V")
    public void method553() throws IOException {
        this.field752 = 0;
        if (this.field759 != this.field756) {
            this.field749.method528(this.field756);
            this.field759 = this.field756;
        }
        this.field751 = this.field756;
        while (this.field752 < this.field762.length) {
            int var1 = this.field749.method532(this.field762, this.field752, this.field762.length - this.field752);
            if (var1 == -1) {
                break;
            }
            this.field759 += (long) var1;
            this.field752 += var1;
        }
    }

    @ObfuscatedName("af.a([BIIB)V")
    public void method557(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field756 + (long) arg2 > this.field763) {
                this.field763 = this.field756 + (long) arg2;
            }
            if (this.field754 != -1L && (this.field756 < this.field754 || this.field756 > this.field754 + (long) this.field755)) {
                this.method559();
            }
            if (this.field754 != -1L && this.field756 + (long) arg2 > this.field754 + (long) this.field750.length) {
                int var4 = (int) ((long) this.field750.length - (this.field756 - this.field754));
                System.arraycopy(arg0, arg1, this.field750, (int) (this.field756 - this.field754), var4);
                this.field756 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field755 = this.field750.length;
                this.method559();
            }
            if (arg2 > this.field750.length) {
                if (this.field759 != this.field756) {
                    this.field749.method528(this.field756);
                    this.field759 = this.field756;
                }
                this.field749.method529(arg0, arg1, arg2);
                this.field759 += (long) arg2;
                if (this.field759 > this.field757) {
                    this.field757 = this.field759;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field756 >= this.field751 && this.field756 < this.field751 + (long) this.field752) {
                    var5 = this.field756;
                } else if (this.field751 >= this.field756 && this.field751 < this.field756 + (long) arg2) {
                    var5 = this.field751;
                }
                if (this.field756 + (long) arg2 > this.field751 && this.field756 + (long) arg2 <= this.field751 + (long) this.field752) {
                    var7 = this.field756 + (long) arg2;
                } else if (this.field751 + (long) this.field752 > this.field756 && this.field751 + (long) this.field752 <= this.field756 + (long) arg2) {
                    var7 = this.field751 + (long) this.field752;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field756), this.field762, (int) (var5 - this.field751), var9);
                }
                this.field756 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field754 == -1L) {
                    this.field754 = this.field756;
                }
                System.arraycopy(arg0, arg1, this.field750, (int) (this.field756 - this.field754), arg2);
                this.field756 += (long) arg2;
                if (this.field756 - this.field754 > (long) this.field755) {
                    this.field755 = (int) (this.field756 - this.field754);
                }
            }
        } catch (IOException var11) {
            this.field759 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("af.g(I)V")
    public void method559() throws IOException {
        if (this.field754 == -1L) {
            return;
        }
        if (this.field759 != this.field754) {
            this.field749.method528(this.field754);
            this.field759 = this.field754;
        }
        this.field749.method529(this.field750, 0, this.field755);
        this.field759 += (long) (this.field755 * 1044120861) * -1862212299L;
        if (this.field759 > this.field757) {
            this.field757 = this.field759;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field754 >= this.field751 && this.field754 < this.field751 + (long) this.field752) {
            var1 = this.field754;
        } else if (this.field751 >= this.field754 && this.field751 < this.field754 + (long) this.field755) {
            var1 = this.field751;
        }
        if (this.field754 + (long) this.field755 > this.field751 && this.field754 + (long) this.field755 <= this.field751 + (long) this.field752) {
            var3 = this.field754 + (long) this.field755;
        } else if (this.field751 + (long) this.field752 > this.field754 && this.field751 + (long) this.field752 <= this.field754 + (long) this.field755) {
            var3 = this.field751 + (long) this.field752;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field750, (int) (var1 - this.field754), this.field762, (int) (var1 - this.field751), var5);
        }
        this.field754 = -1L;
        this.field755 = 0;
    }
}
