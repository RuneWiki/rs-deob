package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("at")
public class class30 {

    @ObfuscatedName("at.p")
    public class29 field754;

    @ObfuscatedName("at.l")
    public byte[] field742;

    @ObfuscatedName("at.d")
    public long field753 = -1L;

    @ObfuscatedName("at.x")
    public int field744;

    @ObfuscatedName("at.o")
    public byte[] field750;

    @ObfuscatedName("at.a")
    public long field746 = -1L;

    @ObfuscatedName("at.w")
    public int field747 = 0;

    @ObfuscatedName("at.i")
    public long field748;

    @ObfuscatedName("at.y")
    public long field749;

    @ObfuscatedName("at.m")
    public long field745;

    @ObfuscatedName("at.u")
    public long field751;

    public class30(class29 arg0, int arg1, int arg2) throws IOException {
        this.field754 = arg0;
        this.field745 = this.field749 = arg0.method553();
        this.field742 = new byte[arg1];
        this.field750 = new byte[arg2];
        this.field748 = 0L;
    }

    @ObfuscatedName("at.p(I)V")
    public void method573() throws IOException {
        this.method572();
        this.field754.method556();
    }

    @ObfuscatedName("at.l(J)V")
    public void method580(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field748 = arg0;
    }

    @ObfuscatedName("at.d(I)J")
    public long method575() {
        return this.field745;
    }

    @ObfuscatedName("at.x([BB)V")
    public void method576(byte[] arg0) throws IOException {
        this.method577(arg0, 0, arg0.length);
    }

    @ObfuscatedName("at.o([BIII)V")
    public void method577(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field746 != -1L && this.field748 >= this.field746 && this.field748 + (long) arg2 <= this.field746 + (long) this.field747) {
                System.arraycopy(this.field750, (int) (this.field748 - this.field746), arg0, arg1, arg2);
                this.field748 += (long) arg2;
                return;
            }
            long var4 = this.field748;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field748 >= this.field753 && this.field748 < this.field753 + (long) this.field744) {
                int var8 = (int) ((long) this.field744 - (this.field748 - this.field753));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field742, (int) (this.field748 - this.field753), arg0, arg1, var8);
                this.field748 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field742.length) {
                this.field754.method550(this.field748);
                this.field751 = this.field748;
                while (arg2 > 0) {
                    int var9 = this.field754.method554(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field751 += (long) var9;
                    this.field748 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method578();
                int var10 = arg2;
                if (arg2 > this.field744) {
                    var10 = this.field744;
                }
                System.arraycopy(this.field742, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field748 += (long) var10;
            }
            if (this.field746 != -1L) {
                if (this.field746 > this.field748 && arg2 > 0) {
                    int var11 = (int) (this.field746 - this.field748) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field748++;
                    }
                }
                long var12 = -1L;
                long var14 = -1L;
                if (this.field746 >= var4 && this.field746 < (long) var7 + var4) {
                    var12 = this.field746;
                } else if (var4 >= this.field746 && var4 < this.field746 + (long) this.field747) {
                    var12 = var4;
                }
                if (this.field746 + (long) this.field747 > var4 && this.field746 + (long) this.field747 <= (long) var7 + var4) {
                    var14 = this.field746 + (long) this.field747;
                } else if ((long) var7 + var4 > this.field746 && (long) var7 + var4 <= this.field746 + (long) this.field747) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field750, (int) (var12 - this.field746), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field748) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field748));
                        this.field748 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field751 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("at.a(I)V")
    public void method578() throws IOException {
        this.field744 = 0;
        if (this.field751 != this.field748) {
            this.field754.method550(this.field748);
            this.field751 = this.field748;
        }
        this.field753 = this.field748;
        while (this.field744 < this.field742.length) {
            int var1 = this.field754.method554(this.field742, this.field744, this.field742.length - this.field744);
            if (var1 == -1) {
                break;
            }
            this.field751 += (long) var1;
            this.field744 += var1;
        }
    }

    @ObfuscatedName("at.w([BIIB)V")
    public void method579(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field748 + (long) arg2 > this.field745) {
                this.field745 = this.field748 + (long) arg2;
            }
            if (this.field746 != -1L && (this.field748 < this.field746 || this.field748 > this.field746 + (long) this.field747)) {
                this.method572();
            }
            if (this.field746 != -1L && this.field748 + (long) arg2 > this.field746 + (long) this.field750.length) {
                int var4 = (int) ((long) this.field750.length - (this.field748 - this.field746));
                System.arraycopy(arg0, arg1, this.field750, (int) (this.field748 - this.field746), var4);
                this.field748 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field747 = this.field750.length;
                this.method572();
            }
            if (arg2 > this.field750.length) {
                if (this.field751 != this.field748) {
                    this.field754.method550(this.field748);
                    this.field751 = this.field748;
                }
                this.field754.method551(arg0, arg1, arg2);
                this.field751 += (long) arg2;
                if (this.field751 > this.field749) {
                    this.field749 = this.field751;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field748 >= this.field753 && this.field748 < this.field753 + (long) this.field744) {
                    var5 = this.field748;
                } else if (this.field753 >= this.field748 && this.field753 < this.field748 + (long) arg2) {
                    var5 = this.field753;
                }
                if (this.field748 + (long) arg2 > this.field753 && this.field748 + (long) arg2 <= this.field753 + (long) this.field744) {
                    var7 = this.field748 + (long) arg2;
                } else if (this.field753 + (long) this.field744 > this.field748 && this.field753 + (long) this.field744 <= this.field748 + (long) arg2) {
                    var7 = this.field753 + (long) this.field744;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field748), this.field742, (int) (var5 - this.field753), var9);
                }
                this.field748 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field746 == -1L) {
                    this.field746 = this.field748;
                }
                System.arraycopy(arg0, arg1, this.field750, (int) (this.field748 - this.field746), arg2);
                this.field748 += (long) arg2;
                if (this.field748 - this.field746 > (long) this.field747) {
                    this.field747 = (int) (this.field748 - this.field746);
                }
            }
        } catch (IOException var11) {
            this.field751 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("at.i(I)V")
    public void method572() throws IOException {
        if (this.field746 == -1L) {
            return;
        }
        if (this.field751 != this.field746) {
            this.field754.method550(this.field746);
            this.field751 = this.field746;
        }
        this.field754.method551(this.field750, 0, this.field747);
        this.field751 += (long) (this.field747 * -101613151) * -273243551L;
        if (this.field751 > this.field749) {
            this.field749 = this.field751;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field746 >= this.field753 && this.field746 < this.field753 + (long) this.field744) {
            var1 = this.field746;
        } else if (this.field753 >= this.field746 && this.field753 < this.field746 + (long) this.field747) {
            var1 = this.field753;
        }
        if (this.field746 + (long) this.field747 > this.field753 && this.field746 + (long) this.field747 <= this.field753 + (long) this.field744) {
            var3 = this.field746 + (long) this.field747;
        } else if (this.field753 + (long) this.field744 > this.field746 && this.field753 + (long) this.field744 <= this.field746 + (long) this.field747) {
            var3 = this.field753 + (long) this.field744;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field750, (int) (var1 - this.field746), this.field742, (int) (var1 - this.field753), var5);
        }
        this.field746 = -1L;
        this.field747 = 0;
    }
}
