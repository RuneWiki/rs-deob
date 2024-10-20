package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("au")
public class class29 {

    @ObfuscatedName("au.j")
    public class28 field750;

    @ObfuscatedName("au.y")
    public byte[] field742;

    @ObfuscatedName("au.x")
    public long field743 = -1L;

    @ObfuscatedName("au.z")
    public int field744;

    @ObfuscatedName("au.c")
    public byte[] field751;

    @ObfuscatedName("au.e")
    public long field747 = -1L;

    @ObfuscatedName("au.s")
    public int field745 = 0;

    @ObfuscatedName("au.i")
    public long field748;

    @ObfuscatedName("au.g")
    public long field746;

    @ObfuscatedName("au.q")
    public long field749;

    @ObfuscatedName("au.w")
    public long field752;

    public class29(class28 arg0, int arg1, int arg2) throws IOException {
        this.field750 = arg0;
        this.field749 = this.field746 = arg0.method543();
        this.field742 = new byte[arg1];
        this.field751 = new byte[arg2];
        this.field748 = 0L;
    }

    @ObfuscatedName("au.j(I)V")
    public void method577() throws IOException {
        this.method574();
        this.field750.method559();
    }

    @ObfuscatedName("au.y(J)V")
    public void method583(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field748 = arg0;
    }

    @ObfuscatedName("au.x(I)J")
    public long method592() {
        return this.field749;
    }

    @ObfuscatedName("au.z([BI)V")
    public void method570(byte[] arg0) throws IOException {
        this.method571(arg0, 0, arg0.length);
    }

    @ObfuscatedName("au.c([BIII)V")
    public void method571(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field747 != -1L && this.field748 >= this.field747 && this.field748 + (long) arg2 <= this.field747 + (long) this.field745) {
                System.arraycopy(this.field751, (int) (this.field748 - this.field747), arg0, arg1, arg2);
                this.field748 += (long) arg2;
                return;
            }
            long var4 = this.field748;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field748 >= this.field743 && this.field748 < this.field743 + (long) this.field744) {
                int var8 = (int) ((long) this.field744 - (this.field748 - this.field743));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field742, (int) (this.field748 - this.field743), arg0, arg1, var8);
                this.field748 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field742.length) {
                this.field750.method539(this.field748);
                this.field752 = this.field748;
                while (arg2 > 0) {
                    int var9 = this.field750.method541(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field752 += (long) var9;
                    this.field748 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method590();
                int var10 = arg2;
                if (arg2 > this.field744) {
                    var10 = this.field744;
                }
                System.arraycopy(this.field742, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field748 += (long) var10;
            }
            if (this.field747 != -1L) {
                if (this.field747 > this.field748 && arg2 > 0) {
                    int var11 = (int) (this.field747 - this.field748) + arg1;
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
                if (this.field747 >= var4 && this.field747 < (long) var7 + var4) {
                    var12 = this.field747;
                } else if (var4 >= this.field747 && var4 < this.field747 + (long) this.field745) {
                    var12 = var4;
                }
                if (this.field747 + (long) this.field745 > var4 && this.field747 + (long) this.field745 <= (long) var7 + var4) {
                    var14 = this.field747 + (long) this.field745;
                } else if ((long) var7 + var4 > this.field747 && (long) var7 + var4 <= this.field747 + (long) this.field745) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field751, (int) (var12 - this.field747), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field748) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field748));
                        this.field748 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field752 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("au.e(I)V")
    public void method590() throws IOException {
        this.field744 = 0;
        if (this.field752 != this.field748) {
            this.field750.method539(this.field748);
            this.field752 = this.field748;
        }
        this.field743 = this.field748;
        while (this.field744 < this.field742.length) {
            int var1 = this.field750.method541(this.field742, this.field744, this.field742.length - this.field744);
            if (var1 == -1) {
                break;
            }
            this.field752 += (long) var1;
            this.field744 += var1;
        }
    }

    @ObfuscatedName("au.s([BIII)V")
    public void method573(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field748 + (long) arg2 > this.field749) {
                this.field749 = this.field748 + (long) arg2;
            }
            if (this.field747 != -1L && (this.field748 < this.field747 || this.field748 > this.field747 + (long) this.field745)) {
                this.method574();
            }
            if (this.field747 != -1L && this.field748 + (long) arg2 > this.field747 + (long) this.field751.length) {
                int var4 = (int) ((long) this.field751.length - (this.field748 - this.field747));
                System.arraycopy(arg0, arg1, this.field751, (int) (this.field748 - this.field747), var4);
                this.field748 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field745 = this.field751.length;
                this.method574();
            }
            if (arg2 > this.field751.length) {
                if (this.field752 != this.field748) {
                    this.field750.method539(this.field748);
                    this.field752 = this.field748;
                }
                this.field750.method563(arg0, arg1, arg2);
                this.field752 += (long) arg2;
                if (this.field752 > this.field746) {
                    this.field746 = this.field752;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field748 >= this.field743 && this.field748 < this.field743 + (long) this.field744) {
                    var5 = this.field748;
                } else if (this.field743 >= this.field748 && this.field743 < this.field748 + (long) arg2) {
                    var5 = this.field743;
                }
                if (this.field748 + (long) arg2 > this.field743 && this.field748 + (long) arg2 <= this.field743 + (long) this.field744) {
                    var7 = this.field748 + (long) arg2;
                } else if (this.field743 + (long) this.field744 > this.field748 && this.field743 + (long) this.field744 <= this.field748 + (long) arg2) {
                    var7 = this.field743 + (long) this.field744;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field748), this.field742, (int) (var5 - this.field743), var9);
                }
                this.field748 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field747 == -1L) {
                    this.field747 = this.field748;
                }
                System.arraycopy(arg0, arg1, this.field751, (int) (this.field748 - this.field747), arg2);
                this.field748 += (long) arg2;
                if (this.field748 - this.field747 > (long) this.field745) {
                    this.field745 = (int) (this.field748 - this.field747);
                }
            }
        } catch (IOException var11) {
            this.field752 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("au.i(I)V")
    public void method574() throws IOException {
        if (this.field747 == -1L) {
            return;
        }
        if (this.field752 != this.field747) {
            this.field750.method539(this.field747);
            this.field752 = this.field747;
        }
        this.field750.method563(this.field751, 0, this.field745);
        this.field752 += (long) (this.field745 * 1140992569) * 2145428489L;
        if (this.field752 > this.field746) {
            this.field746 = this.field752;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field747 >= this.field743 && this.field747 < this.field743 + (long) this.field744) {
            var1 = this.field747;
        } else if (this.field743 >= this.field747 && this.field743 < this.field747 + (long) this.field745) {
            var1 = this.field743;
        }
        if (this.field747 + (long) this.field745 > this.field743 && this.field747 + (long) this.field745 <= this.field743 + (long) this.field744) {
            var3 = this.field747 + (long) this.field745;
        } else if (this.field743 + (long) this.field744 > this.field747 && this.field743 + (long) this.field744 <= this.field747 + (long) this.field745) {
            var3 = this.field743 + (long) this.field744;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field751, (int) (var1 - this.field747), this.field742, (int) (var1 - this.field743), var5);
        }
        this.field747 = -1L;
        this.field745 = 0;
    }
}
