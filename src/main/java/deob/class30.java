package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("al")
public class class30 {

    @ObfuscatedName("al.x")
    public class29 field732;

    @ObfuscatedName("al.p")
    public byte[] field726;

    @ObfuscatedName("al.k")
    public long field727 = -1L;

    @ObfuscatedName("al.a")
    public int field740;

    @ObfuscatedName("al.q")
    public byte[] field729;

    @ObfuscatedName("al.j")
    public long field728 = -1L;

    @ObfuscatedName("al.v")
    public int field731 = 0;

    @ObfuscatedName("al.w")
    public long field725;

    @ObfuscatedName("al.l")
    public long field733;

    @ObfuscatedName("al.s")
    public long field734;

    @ObfuscatedName("al.n")
    public long field735;

    public class30(class29 arg0, int arg1, int arg2) throws IOException {
        this.field732 = arg0;
        this.field734 = this.field733 = arg0.method527();
        this.field726 = new byte[arg1];
        this.field729 = new byte[arg2];
        this.field725 = 0L;
    }

    @ObfuscatedName("al.x(I)V")
    public void method552() throws IOException {
        this.method559();
        this.field732.method526();
    }

    @ObfuscatedName("al.p(J)V")
    public void method553(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field725 = arg0;
    }

    @ObfuscatedName("al.k(B)J")
    public long method554() {
        return this.field734;
    }

    @ObfuscatedName("al.a([BB)V")
    public void method555(byte[] arg0) throws IOException {
        this.method567(arg0, 0, arg0.length);
    }

    @ObfuscatedName("al.q([BIII)V")
    public void method567(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field728 != -1L && this.field725 >= this.field728 && this.field725 + (long) arg2 <= this.field728 + (long) this.field731) {
                System.arraycopy(this.field729, (int) (this.field725 - this.field728), arg0, arg1, arg2);
                this.field725 += (long) arg2;
                return;
            }
            long var4 = this.field725;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field725 >= this.field727 && this.field725 < this.field727 + (long) this.field740) {
                int var8 = (int) ((long) this.field740 - (this.field725 - this.field727));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field726, (int) (this.field725 - this.field727), arg0, arg1, var8);
                this.field725 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field726.length) {
                this.field732.method539(this.field725);
                this.field735 = this.field725;
                while (arg2 > 0) {
                    int var9 = this.field732.method524(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field735 += (long) var9;
                    this.field725 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method565();
                int var10 = arg2;
                if (arg2 > this.field740) {
                    var10 = this.field740;
                }
                System.arraycopy(this.field726, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field725 += (long) var10;
            }
            if (this.field728 != -1L) {
                if (this.field728 > this.field725 && arg2 > 0) {
                    int var11 = (int) (this.field728 - this.field725) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field725++;
                    }
                }
                long var12 = -1L;
                long var14 = -1L;
                if (this.field728 >= var4 && this.field728 < (long) var7 + var4) {
                    var12 = this.field728;
                } else if (var4 >= this.field728 && var4 < this.field728 + (long) this.field731) {
                    var12 = var4;
                }
                if (this.field728 + (long) this.field731 > var4 && this.field728 + (long) this.field731 <= (long) var7 + var4) {
                    var14 = this.field728 + (long) this.field731;
                } else if ((long) var7 + var4 > this.field728 && (long) var7 + var4 <= this.field728 + (long) this.field731) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field729, (int) (var12 - this.field728), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field725) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field725));
                        this.field725 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field735 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("al.j(I)V")
    public void method565() throws IOException {
        this.field740 = 0;
        if (this.field735 != this.field725) {
            this.field732.method539(this.field725);
            this.field735 = this.field725;
        }
        this.field727 = this.field725;
        while (this.field740 < this.field726.length) {
            int var1 = this.field732.method524(this.field726, this.field740, this.field726.length - this.field740);
            if (var1 == -1) {
                break;
            }
            this.field735 += (long) var1;
            this.field740 += var1;
        }
    }

    @ObfuscatedName("al.v([BIIB)V")
    public void method558(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field725 + (long) arg2 > this.field734) {
                this.field734 = this.field725 + (long) arg2;
            }
            if (this.field728 != -1L && (this.field725 < this.field728 || this.field725 > this.field728 + (long) this.field731)) {
                this.method559();
            }
            if (this.field728 != -1L && this.field725 + (long) arg2 > this.field728 + (long) this.field729.length) {
                int var4 = (int) ((long) this.field729.length - (this.field725 - this.field728));
                System.arraycopy(arg0, arg1, this.field729, (int) (this.field725 - this.field728), var4);
                this.field725 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field731 = this.field729.length;
                this.method559();
            }
            if (arg2 > this.field729.length) {
                if (this.field735 != this.field725) {
                    this.field732.method539(this.field725);
                    this.field735 = this.field725;
                }
                this.field732.method525(arg0, arg1, arg2);
                this.field735 += (long) arg2;
                if (this.field735 > this.field733) {
                    this.field733 = this.field735;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field725 >= this.field727 && this.field725 < this.field727 + (long) this.field740) {
                    var5 = this.field725;
                } else if (this.field727 >= this.field725 && this.field727 < this.field725 + (long) arg2) {
                    var5 = this.field727;
                }
                if (this.field725 + (long) arg2 > this.field727 && this.field725 + (long) arg2 <= this.field727 + (long) this.field740) {
                    var7 = this.field725 + (long) arg2;
                } else if (this.field727 + (long) this.field740 > this.field725 && this.field727 + (long) this.field740 <= this.field725 + (long) arg2) {
                    var7 = this.field727 + (long) this.field740;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field725), this.field726, (int) (var5 - this.field727), var9);
                }
                this.field725 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field728 == -1L) {
                    this.field728 = this.field725;
                }
                System.arraycopy(arg0, arg1, this.field729, (int) (this.field725 - this.field728), arg2);
                this.field725 += (long) arg2;
                if (this.field725 - this.field728 > (long) this.field731) {
                    this.field731 = (int) (this.field725 - this.field728);
                }
            }
        } catch (IOException var11) {
            this.field735 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("al.w(I)V")
    public void method559() throws IOException {
        if (this.field728 == -1L) {
            return;
        }
        if (this.field735 != this.field728) {
            this.field732.method539(this.field728);
            this.field735 = this.field728;
        }
        this.field732.method525(this.field729, 0, this.field731);
        this.field735 += (long) (this.field731 * 833025613) * -1438436731L;
        if (this.field735 > this.field733) {
            this.field733 = this.field735;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field728 >= this.field727 && this.field728 < this.field727 + (long) this.field740) {
            var1 = this.field728;
        } else if (this.field727 >= this.field728 && this.field727 < this.field728 + (long) this.field731) {
            var1 = this.field727;
        }
        if (this.field728 + (long) this.field731 > this.field727 && this.field728 + (long) this.field731 <= this.field727 + (long) this.field740) {
            var3 = this.field728 + (long) this.field731;
        } else if (this.field727 + (long) this.field740 > this.field728 && this.field727 + (long) this.field740 <= this.field728 + (long) this.field731) {
            var3 = this.field727 + (long) this.field740;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field729, (int) (var1 - this.field728), this.field726, (int) (var1 - this.field727), var5);
        }
        this.field728 = -1L;
        this.field731 = 0;
    }
}
