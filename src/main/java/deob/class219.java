package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("hf")
public class class219 {

    @ObfuscatedName("hf.n")
    public class218 field3113;

    @ObfuscatedName("hf.d")
    public byte[] field3121;

    @ObfuscatedName("hf.z")
    public long field3120 = -1L;

    @ObfuscatedName("hf.y")
    public int field3114;

    @ObfuscatedName("hf.e")
    public byte[] field3115;

    @ObfuscatedName("hf.g")
    public long field3116 = -1L;

    @ObfuscatedName("hf.f")
    public int field3117 = 0;

    @ObfuscatedName("hf.m")
    public long field3118;

    @ObfuscatedName("hf.a")
    public long field3119;

    @ObfuscatedName("hf.h")
    public long field3112;

    @ObfuscatedName("hf.l")
    public long field3111;

    public class219(class218 arg0, int arg1, int arg2) throws IOException {
        this.field3113 = arg0;
        this.field3112 = this.field3119 = arg0.method3741();
        this.field3121 = new byte[arg1];
        this.field3115 = new byte[arg2];
        this.field3118 = 0L;
    }

    @ObfuscatedName("hf.n(B)V")
    public void method3757() throws IOException {
        this.method3764();
        this.field3113.method3740();
    }

    @ObfuscatedName("hf.d(J)V")
    public void method3758(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field3118 = arg0;
    }

    @ObfuscatedName("hf.z(B)J")
    public long method3759() {
        return this.field3112;
    }

    @ObfuscatedName("hf.y([BS)V")
    public void method3760(byte[] arg0) throws IOException {
        this.method3771(arg0, 0, arg0.length);
    }

    @ObfuscatedName("hf.e([BIII)V")
    public void method3771(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field3116 != -1L && this.field3118 >= this.field3116 && this.field3118 + (long) arg2 <= this.field3116 + (long) this.field3117) {
                System.arraycopy(this.field3115, (int) (this.field3118 - this.field3116), arg0, arg1, arg2);
                this.field3118 += (long) arg2;
                return;
            }
            long var4 = this.field3118;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field3118 >= this.field3120 && this.field3118 < this.field3120 + (long) this.field3114) {
                int var8 = (int) ((long) this.field3114 - (this.field3118 - this.field3120));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field3121, (int) (this.field3118 - this.field3120), arg0, arg1, var8);
                this.field3118 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field3121.length) {
                this.field3113.method3737(this.field3118);
                this.field3111 = this.field3118;
                while (arg2 > 0) {
                    int var9 = this.field3113.method3755(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field3111 += (long) var9;
                    this.field3118 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method3762();
                int var10 = arg2;
                if (arg2 > this.field3114) {
                    var10 = this.field3114;
                }
                System.arraycopy(this.field3121, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field3118 += (long) var10;
            }
            if (this.field3116 != -1L) {
                if (this.field3116 > this.field3118 && arg2 > 0) {
                    int var11 = (int) (this.field3116 - this.field3118) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field3118++;
                    }
                }
                long var12 = -1L;
                long var14 = -1L;
                if (this.field3116 >= var4 && this.field3116 < (long) var7 + var4) {
                    var12 = this.field3116;
                } else if (var4 >= this.field3116 && var4 < this.field3116 + (long) this.field3117) {
                    var12 = var4;
                }
                if (this.field3116 + (long) this.field3117 > var4 && this.field3116 + (long) this.field3117 <= (long) var7 + var4) {
                    var14 = this.field3116 + (long) this.field3117;
                } else if ((long) var7 + var4 > this.field3116 && (long) var7 + var4 <= this.field3116 + (long) this.field3117) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field3115, (int) (var12 - this.field3116), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field3118) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field3118));
                        this.field3118 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field3111 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("hf.g(S)V")
    public void method3762() throws IOException {
        this.field3114 = 0;
        if (this.field3118 != this.field3111) {
            this.field3113.method3737(this.field3118);
            this.field3111 = this.field3118;
        }
        this.field3120 = this.field3118;
        while (this.field3114 < this.field3121.length) {
            int var1 = this.field3113.method3755(this.field3121, this.field3114, this.field3121.length - this.field3114);
            if (var1 == -1) {
                break;
            }
            this.field3111 += (long) var1;
            this.field3114 += var1;
        }
    }

    @ObfuscatedName("hf.f([BIIB)V")
    public void method3769(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field3118 + (long) arg2 > this.field3112) {
                this.field3112 = this.field3118 + (long) arg2;
            }
            if (this.field3116 != -1L && (this.field3118 < this.field3116 || this.field3118 > this.field3116 + (long) this.field3117)) {
                this.method3764();
            }
            if (this.field3116 != -1L && this.field3118 + (long) arg2 > this.field3116 + (long) this.field3115.length) {
                int var4 = (int) ((long) this.field3115.length - (this.field3118 - this.field3116));
                System.arraycopy(arg0, arg1, this.field3115, (int) (this.field3118 - this.field3116), var4);
                this.field3118 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field3117 = this.field3115.length;
                this.method3764();
            }
            if (arg2 > this.field3115.length) {
                if (this.field3118 != this.field3111) {
                    this.field3113.method3737(this.field3118);
                    this.field3111 = this.field3118;
                }
                this.field3113.method3739(arg0, arg1, arg2);
                this.field3111 += (long) arg2;
                if (this.field3111 > this.field3119) {
                    this.field3119 = this.field3111;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field3118 >= this.field3120 && this.field3118 < this.field3120 + (long) this.field3114) {
                    var5 = this.field3118;
                } else if (this.field3120 >= this.field3118 && this.field3120 < this.field3118 + (long) arg2) {
                    var5 = this.field3120;
                }
                if (this.field3118 + (long) arg2 > this.field3120 && this.field3118 + (long) arg2 <= this.field3120 + (long) this.field3114) {
                    var7 = this.field3118 + (long) arg2;
                } else if (this.field3120 + (long) this.field3114 > this.field3118 && this.field3120 + (long) this.field3114 <= this.field3118 + (long) arg2) {
                    var7 = this.field3120 + (long) this.field3114;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field3118), this.field3121, (int) (var5 - this.field3120), var9);
                }
                this.field3118 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field3116 == -1L) {
                    this.field3116 = this.field3118;
                }
                System.arraycopy(arg0, arg1, this.field3115, (int) (this.field3118 - this.field3116), arg2);
                this.field3118 += (long) arg2;
                if (this.field3118 - this.field3116 > (long) this.field3117) {
                    this.field3117 = (int) (this.field3118 - this.field3116);
                }
            }
        } catch (IOException var11) {
            this.field3111 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("hf.m(I)V")
    public void method3764() throws IOException {
        if (this.field3116 == -1L) {
            return;
        }
        if (this.field3116 != this.field3111) {
            this.field3113.method3737(this.field3116);
            this.field3111 = this.field3116;
        }
        this.field3113.method3739(this.field3115, 0, this.field3117);
        this.field3111 += (long) (this.field3117 * -1520399837) * 879850891L;
        if (this.field3111 > this.field3119) {
            this.field3119 = this.field3111;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field3116 >= this.field3120 && this.field3116 < this.field3120 + (long) this.field3114) {
            var1 = this.field3116;
        } else if (this.field3120 >= this.field3116 && this.field3120 < this.field3116 + (long) this.field3117) {
            var1 = this.field3120;
        }
        if (this.field3116 + (long) this.field3117 > this.field3120 && this.field3116 + (long) this.field3117 <= this.field3120 + (long) this.field3114) {
            var3 = this.field3116 + (long) this.field3117;
        } else if (this.field3120 + (long) this.field3114 > this.field3116 && this.field3120 + (long) this.field3114 <= this.field3116 + (long) this.field3117) {
            var3 = this.field3120 + (long) this.field3114;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field3115, (int) (var1 - this.field3116), this.field3121, (int) (var1 - this.field3120), var5);
        }
        this.field3116 = -1L;
        this.field3117 = 0;
    }
}
