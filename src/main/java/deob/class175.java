package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("ao")
public class class175 {

    @ObfuscatedName("ao.g")
    public long field2688;

    @ObfuscatedName("ao.d")
    public long field2699;

    @ObfuscatedName("ao.b")
    public long field2681 = -1L;

    @ObfuscatedName("ao.c")
    public byte[] field2680;

    @ObfuscatedName("ao.m")
    public byte[] field2683;

    @ObfuscatedName("ao.j")
    public long field2695;

    @ObfuscatedName("ao.i")
    public int field2679;

    @ObfuscatedName("ao.v")
    public class167 field2689;

    @ObfuscatedName("ao.z")
    public long field2684 = -1L;

    @ObfuscatedName("ao.y")
    public long field2686;

    @ObfuscatedName("ao.x")
    public int field2685 = 0;

    @ObfuscatedName("ao.i([BI)V")
    public void method3174(byte[] arg0) throws IOException {
        this.method3191(arg0, 0, arg0.length);
    }

    @ObfuscatedName("ao.d(B)V")
    public void method3175() throws IOException {
        if (this.field2684 == -1L) {
            return;
        }
        if (this.field2686 != this.field2684) {
            this.field2689.method3012(this.field2684);
            this.field2686 = this.field2684;
        }
        this.field2689.method3011(this.field2683, 0, this.field2685);
        this.field2686 += (long) (this.field2685 * -1854142383) * -737525583L;
        if (this.field2686 > this.field2695) {
            this.field2695 = this.field2686;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field2684 >= this.field2681 && this.field2684 < this.field2681 + (long) this.field2679) {
            var1 = this.field2684;
        } else if (this.field2681 >= this.field2684 && this.field2681 < this.field2684 + (long) this.field2685) {
            var1 = this.field2681;
        }
        if (this.field2684 + (long) this.field2685 > this.field2681 && this.field2684 + (long) this.field2685 <= this.field2681 + (long) this.field2679) {
            var3 = this.field2684 + (long) this.field2685;
        } else if (this.field2681 + (long) this.field2679 > this.field2684 && this.field2681 + (long) this.field2679 <= this.field2684 + (long) this.field2685) {
            var3 = this.field2681 + (long) this.field2679;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field2683, (int) (var1 - this.field2684), this.field2680, (int) (var1 - this.field2681), var5);
        }
        this.field2684 = -1L;
        this.field2685 = 0;
    }

    @ObfuscatedName("ao.b(I)J")
    public long method3177() {
        return this.field2688;
    }

    @ObfuscatedName("ao.z(I)V")
    public void method3178() throws IOException {
        this.field2679 = 0;
        if (this.field2699 != this.field2686) {
            this.field2689.method3012(this.field2699);
            this.field2686 = this.field2699;
        }
        this.field2681 = this.field2699;
        while (this.field2679 < this.field2680.length) {
            int var1 = this.field2689.method3016(this.field2680, this.field2679, this.field2680.length - this.field2679);
            if (var1 == -1) {
                break;
            }
            this.field2686 += (long) var1;
            this.field2679 += var1;
        }
    }

    @ObfuscatedName("ao.x([BIII)V")
    public void method3184(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field2699 + (long) arg2 > this.field2688) {
                this.field2688 = this.field2699 + (long) arg2;
            }
            if (this.field2684 != -1L && (this.field2699 < this.field2684 || this.field2699 > this.field2684 + (long) this.field2685)) {
                this.method3175();
            }
            if (this.field2684 != -1L && this.field2699 + (long) arg2 > this.field2684 + (long) this.field2683.length) {
                int var4 = (int) ((long) this.field2683.length - (this.field2699 - this.field2684));
                System.arraycopy(arg0, arg1, this.field2683, (int) (this.field2699 - this.field2684), var4);
                this.field2699 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field2685 = this.field2683.length;
                this.method3175();
            }
            if (arg2 > this.field2683.length) {
                if (this.field2699 != this.field2686) {
                    this.field2689.method3012(this.field2699);
                    this.field2686 = this.field2699;
                }
                this.field2689.method3011(arg0, arg1, arg2);
                this.field2686 += (long) arg2;
                if (this.field2686 > this.field2695) {
                    this.field2695 = this.field2686;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field2699 >= this.field2681 && this.field2699 < this.field2681 + (long) this.field2679) {
                    var5 = this.field2699;
                } else if (this.field2681 >= this.field2699 && this.field2681 < this.field2699 + (long) arg2) {
                    var5 = this.field2681;
                }
                if (this.field2699 + (long) arg2 > this.field2681 && this.field2699 + (long) arg2 <= this.field2681 + (long) this.field2679) {
                    var7 = this.field2699 + (long) arg2;
                } else if (this.field2681 + (long) this.field2679 > this.field2699 && this.field2681 + (long) this.field2679 <= this.field2699 + (long) arg2) {
                    var7 = this.field2681 + (long) this.field2679;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field2699), this.field2680, (int) (var5 - this.field2681), var9);
                }
                this.field2699 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field2684 == -1L) {
                    this.field2684 = this.field2699;
                }
                System.arraycopy(arg0, arg1, this.field2683, (int) (this.field2699 - this.field2684), arg2);
                this.field2699 += (long) arg2;
                if (this.field2699 - this.field2684 > (long) this.field2685) {
                    this.field2685 = (int) (this.field2699 - this.field2684);
                }
            }
        } catch (IOException var11) {
            this.field2686 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("ao.c(J)V")
    public void method3187(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field2699 = arg0;
    }

    public class175(class167 arg0, int arg1, int arg2) throws IOException {
        this.field2689 = arg0;
        this.field2688 = this.field2695 = arg0.method3015();
        this.field2680 = new byte[arg1];
        this.field2683 = new byte[arg2];
        this.field2699 = 0L;
    }

    @ObfuscatedName("ao.m([BIII)V")
    public void method3191(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field2684 != -1L && this.field2699 >= this.field2684 && this.field2699 + (long) arg2 <= this.field2684 + (long) this.field2685) {
                System.arraycopy(this.field2683, (int) (this.field2699 - this.field2684), arg0, arg1, arg2);
                this.field2699 += (long) arg2;
                return;
            }
            long var4 = this.field2699;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field2699 >= this.field2681 && this.field2699 < this.field2681 + (long) this.field2679) {
                int var8 = (int) ((long) this.field2679 - (this.field2699 - this.field2681));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field2680, (int) (this.field2699 - this.field2681), arg0, arg1, var8);
                this.field2699 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field2680.length) {
                this.field2689.method3012(this.field2699);
                this.field2686 = this.field2699;
                while (arg2 > 0) {
                    int var9 = this.field2689.method3016(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field2686 += (long) var9;
                    this.field2699 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method3178();
                int var10 = arg2;
                if (arg2 > this.field2679) {
                    var10 = this.field2679;
                }
                System.arraycopy(this.field2680, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field2699 += (long) var10;
            }
            if (this.field2684 != -1L) {
                if (this.field2684 > this.field2699 && arg2 > 0) {
                    int var11 = (int) (this.field2684 - this.field2699) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field2699++;
                    }
                }
                long var12 = -1L;
                long var14 = -1L;
                if (this.field2684 >= var4 && this.field2684 < (long) var7 + var4) {
                    var12 = this.field2684;
                } else if (var4 >= this.field2684 && var4 < this.field2684 + (long) this.field2685) {
                    var12 = var4;
                }
                if (this.field2684 + (long) this.field2685 > var4 && this.field2684 + (long) this.field2685 <= (long) var7 + var4) {
                    var14 = this.field2684 + (long) this.field2685;
                } else if ((long) var7 + var4 > this.field2684 && (long) var7 + var4 <= this.field2684 + (long) this.field2685) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field2683, (int) (var12 - this.field2684), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field2699) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field2699));
                        this.field2699 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field2686 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("ao.v(B)V")
    public void method3193() throws IOException {
        this.method3175();
        this.field2689.method3014();
    }
}
