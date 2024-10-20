package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("hl")
public class class222 {

    @ObfuscatedName("hl.j")
    public class221 field3142;

    @ObfuscatedName("hl.y")
    public byte[] field3150;

    @ObfuscatedName("hl.z")
    public long field3144 = -1L;

    @ObfuscatedName("hl.l")
    public int field3145;

    @ObfuscatedName("hl.w")
    public byte[] field3143;

    @ObfuscatedName("hl.d")
    public long field3147 = -1L;

    @ObfuscatedName("hl.f")
    public int field3148 = 0;

    @ObfuscatedName("hl.i")
    public long field3146;

    @ObfuscatedName("hl.a")
    public long field3152;

    @ObfuscatedName("hl.o")
    public long field3151;

    @ObfuscatedName("hl.u")
    public long field3149;

    public class222(class221 arg0, int arg1, int arg2) throws IOException {
        this.field3142 = arg0;
        this.field3151 = this.field3152 = arg0.method3762();
        this.field3150 = new byte[arg1];
        this.field3143 = new byte[arg2];
        this.field3146 = 0L;
    }

    @ObfuscatedName("hl.j(B)V")
    public void method3777() throws IOException {
        this.method3792();
        this.field3142.method3767();
    }

    @ObfuscatedName("hl.y(J)V")
    public void method3772(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field3146 = arg0;
    }

    @ObfuscatedName("hl.z(S)J")
    public long method3797() {
        return this.field3151;
    }

    @ObfuscatedName("hl.l([BI)V")
    public void method3774(byte[] arg0) throws IOException {
        this.method3775(arg0, 0, arg0.length);
    }

    @ObfuscatedName("hl.w([BIIB)V")
    public void method3775(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field3147 != -1L && this.field3146 >= this.field3147 && this.field3146 + (long) arg2 <= this.field3147 + (long) this.field3148) {
                System.arraycopy(this.field3143, (int) (this.field3146 - this.field3147), arg0, arg1, arg2);
                this.field3146 += (long) arg2;
                return;
            }
            long var4 = this.field3146;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field3146 >= this.field3144 && this.field3146 < this.field3144 + (long) this.field3145) {
                int var8 = (int) ((long) this.field3145 - (this.field3146 - this.field3144));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field3150, (int) (this.field3146 - this.field3144), arg0, arg1, var8);
                this.field3146 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field3150.length) {
                this.field3142.method3750(this.field3146);
                this.field3149 = this.field3146;
                while (arg2 > 0) {
                    int var9 = this.field3142.method3755(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field3149 += (long) var9;
                    this.field3146 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method3776();
                int var10 = arg2;
                if (arg2 > this.field3145) {
                    var10 = this.field3145;
                }
                System.arraycopy(this.field3150, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field3146 += (long) var10;
            }
            if (this.field3147 != -1L) {
                if (this.field3147 > this.field3146 && arg2 > 0) {
                    int var11 = (int) (this.field3147 - this.field3146) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field3146++;
                    }
                }
                long var12 = -1L;
                long var14 = -1L;
                if (this.field3147 >= var4 && this.field3147 < (long) var7 + var4) {
                    var12 = this.field3147;
                } else if (var4 >= this.field3147 && var4 < this.field3147 + (long) this.field3148) {
                    var12 = var4;
                }
                if (this.field3147 + (long) this.field3148 > var4 && this.field3147 + (long) this.field3148 <= (long) var7 + var4) {
                    var14 = this.field3147 + (long) this.field3148;
                } else if ((long) var7 + var4 > this.field3147 && (long) var7 + var4 <= this.field3147 + (long) this.field3148) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field3143, (int) (var12 - this.field3147), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field3146) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field3146));
                        this.field3146 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field3149 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("hl.d(I)V")
    public void method3776() throws IOException {
        this.field3145 = 0;
        if (this.field3149 != this.field3146) {
            this.field3142.method3750(this.field3146);
            this.field3149 = this.field3146;
        }
        this.field3144 = this.field3146;
        while (this.field3145 < this.field3150.length) {
            int var1 = this.field3142.method3755(this.field3150, this.field3145, this.field3150.length - this.field3145);
            if (var1 == -1) {
                break;
            }
            this.field3149 += (long) var1;
            this.field3145 += var1;
        }
    }

    @ObfuscatedName("hl.f([BIII)V")
    public void method3773(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field3146 + (long) arg2 > this.field3151) {
                this.field3151 = this.field3146 + (long) arg2;
            }
            if (this.field3147 != -1L && (this.field3146 < this.field3147 || this.field3146 > this.field3147 + (long) this.field3148)) {
                this.method3792();
            }
            if (this.field3147 != -1L && this.field3146 + (long) arg2 > this.field3147 + (long) this.field3143.length) {
                int var4 = (int) ((long) this.field3143.length - (this.field3146 - this.field3147));
                System.arraycopy(arg0, arg1, this.field3143, (int) (this.field3146 - this.field3147), var4);
                this.field3146 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field3148 = this.field3143.length;
                this.method3792();
            }
            if (arg2 > this.field3143.length) {
                if (this.field3149 != this.field3146) {
                    this.field3142.method3750(this.field3146);
                    this.field3149 = this.field3146;
                }
                this.field3142.method3752(arg0, arg1, arg2);
                this.field3149 += (long) arg2;
                if (this.field3149 > this.field3152) {
                    this.field3152 = this.field3149;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field3146 >= this.field3144 && this.field3146 < this.field3144 + (long) this.field3145) {
                    var5 = this.field3146;
                } else if (this.field3144 >= this.field3146 && this.field3144 < this.field3146 + (long) arg2) {
                    var5 = this.field3144;
                }
                if (this.field3146 + (long) arg2 > this.field3144 && this.field3146 + (long) arg2 <= this.field3144 + (long) this.field3145) {
                    var7 = this.field3146 + (long) arg2;
                } else if (this.field3144 + (long) this.field3145 > this.field3146 && this.field3144 + (long) this.field3145 <= this.field3146 + (long) arg2) {
                    var7 = this.field3144 + (long) this.field3145;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field3146), this.field3150, (int) (var5 - this.field3144), var9);
                }
                this.field3146 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field3147 == -1L) {
                    this.field3147 = this.field3146;
                }
                System.arraycopy(arg0, arg1, this.field3143, (int) (this.field3146 - this.field3147), arg2);
                this.field3146 += (long) arg2;
                if (this.field3146 - this.field3147 > (long) this.field3148) {
                    this.field3148 = (int) (this.field3146 - this.field3147);
                }
            }
        } catch (IOException var11) {
            this.field3149 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("hl.i(I)V")
    public void method3792() throws IOException {
        if (this.field3147 == -1L) {
            return;
        }
        if (this.field3149 != this.field3147) {
            this.field3142.method3750(this.field3147);
            this.field3149 = this.field3147;
        }
        this.field3142.method3752(this.field3143, 0, this.field3148);
        this.field3149 += (long) (this.field3148 * 1880209329) * -1795411631L;
        if (this.field3149 > this.field3152) {
            this.field3152 = this.field3149;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field3147 >= this.field3144 && this.field3147 < this.field3144 + (long) this.field3145) {
            var1 = this.field3147;
        } else if (this.field3144 >= this.field3147 && this.field3144 < this.field3147 + (long) this.field3148) {
            var1 = this.field3144;
        }
        if (this.field3147 + (long) this.field3148 > this.field3144 && this.field3147 + (long) this.field3148 <= this.field3144 + (long) this.field3145) {
            var3 = this.field3147 + (long) this.field3148;
        } else if (this.field3144 + (long) this.field3145 > this.field3147 && this.field3144 + (long) this.field3145 <= this.field3147 + (long) this.field3148) {
            var3 = this.field3144 + (long) this.field3145;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field3143, (int) (var1 - this.field3147), this.field3150, (int) (var1 - this.field3144), var5);
        }
        this.field3147 = -1L;
        this.field3148 = 0;
    }
}
