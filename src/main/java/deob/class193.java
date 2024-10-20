package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("gr")
public class class193 {

    @ObfuscatedName("gr.y")
    public class192 field2899;

    @ObfuscatedName("gr.u")
    public byte[] field2890;

    @ObfuscatedName("gr.k")
    public long field2892 = -1L;

    @ObfuscatedName("gr.v")
    public int field2891;

    @ObfuscatedName("gr.l")
    public byte[] field2898;

    @ObfuscatedName("gr.g")
    public long field2895 = -1L;

    @ObfuscatedName("gr.a")
    public int field2896 = 0;

    @ObfuscatedName("gr.x")
    public long field2897;

    @ObfuscatedName("gr.r")
    public long field2900;

    @ObfuscatedName("gr.w")
    public long field2894;

    @ObfuscatedName("gr.c")
    public long field2893;

    public class193(class192 arg0, int arg1, int arg2) throws IOException {
        this.field2899 = arg0;
        this.field2894 = this.field2900 = arg0.method3382();
        this.field2890 = new byte[arg1];
        this.field2898 = new byte[arg2];
        this.field2897 = 0L;
    }

    @ObfuscatedName("gr.y(I)V")
    public void method3408() throws IOException {
        this.method3411();
        this.field2899.method3381();
    }

    @ObfuscatedName("gr.u(J)V")
    public void method3422(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field2897 = arg0;
    }

    @ObfuscatedName("gr.k(I)J")
    public long method3405() {
        return this.field2894;
    }

    @ObfuscatedName("gr.v([BI)V")
    public void method3406(byte[] arg0) throws IOException {
        this.method3407(arg0, 0, arg0.length);
    }

    @ObfuscatedName("gr.l([BIII)V")
    public void method3407(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field2895 != -1L && this.field2897 >= this.field2895 && this.field2897 + (long) arg2 <= this.field2895 + (long) this.field2896) {
                System.arraycopy(this.field2898, (int) (this.field2897 - this.field2895), arg0, arg1, arg2);
                this.field2897 += (long) arg2;
                return;
            }
            long var4 = this.field2897;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field2897 >= this.field2892 && this.field2897 < this.field2892 + (long) this.field2891) {
                int var8 = (int) ((long) this.field2891 - (this.field2897 - this.field2892));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field2890, (int) (this.field2897 - this.field2892), arg0, arg1, var8);
                this.field2897 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field2890.length) {
                this.field2899.method3380(this.field2897);
                this.field2893 = this.field2897;
                while (arg2 > 0) {
                    int var9 = this.field2899.method3383(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field2893 += (long) var9;
                    this.field2897 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method3421();
                int var10 = arg2;
                if (arg2 > this.field2891) {
                    var10 = this.field2891;
                }
                System.arraycopy(this.field2890, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field2897 += (long) var10;
            }
            if (this.field2895 != -1L) {
                if (this.field2895 > this.field2897 && arg2 > 0) {
                    int var11 = (int) (this.field2895 - this.field2897) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field2897++;
                    }
                }
                long var12 = -1L;
                long var14 = -1L;
                if (this.field2895 >= var4 && this.field2895 < (long) var7 + var4) {
                    var12 = this.field2895;
                } else if (var4 >= this.field2895 && var4 < this.field2895 + (long) this.field2896) {
                    var12 = var4;
                }
                if (this.field2895 + (long) this.field2896 > var4 && this.field2895 + (long) this.field2896 <= (long) var7 + var4) {
                    var14 = this.field2895 + (long) this.field2896;
                } else if ((long) var7 + var4 > this.field2895 && (long) var7 + var4 <= this.field2895 + (long) this.field2896) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field2898, (int) (var12 - this.field2895), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field2897) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field2897));
                        this.field2897 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field2893 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("gr.g(B)V")
    public void method3421() throws IOException {
        this.field2891 = 0;
        if (this.field2897 != this.field2893) {
            this.field2899.method3380(this.field2897);
            this.field2893 = this.field2897;
        }
        this.field2892 = this.field2897;
        while (this.field2891 < this.field2890.length) {
            int var1 = this.field2899.method3383(this.field2890, this.field2891, this.field2890.length - this.field2891);
            if (var1 == -1) {
                break;
            }
            this.field2893 += (long) var1;
            this.field2891 += var1;
        }
    }

    @ObfuscatedName("gr.a([BIIB)V")
    public void method3409(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field2897 + (long) arg2 > this.field2894) {
                this.field2894 = this.field2897 + (long) arg2;
            }
            if (this.field2895 != -1L && (this.field2897 < this.field2895 || this.field2897 > this.field2895 + (long) this.field2896)) {
                this.method3411();
            }
            if (this.field2895 != -1L && this.field2897 + (long) arg2 > this.field2895 + (long) this.field2898.length) {
                int var4 = (int) ((long) this.field2898.length - (this.field2897 - this.field2895));
                System.arraycopy(arg0, arg1, this.field2898, (int) (this.field2897 - this.field2895), var4);
                this.field2897 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field2896 = this.field2898.length;
                this.method3411();
            }
            if (arg2 > this.field2898.length) {
                if (this.field2897 != this.field2893) {
                    this.field2899.method3380(this.field2897);
                    this.field2893 = this.field2897;
                }
                this.field2899.method3386(arg0, arg1, arg2);
                this.field2893 += (long) arg2;
                if (this.field2893 > this.field2900) {
                    this.field2900 = this.field2893;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field2897 >= this.field2892 && this.field2897 < this.field2892 + (long) this.field2891) {
                    var5 = this.field2897;
                } else if (this.field2892 >= this.field2897 && this.field2892 < this.field2897 + (long) arg2) {
                    var5 = this.field2892;
                }
                if (this.field2897 + (long) arg2 > this.field2892 && this.field2897 + (long) arg2 <= this.field2892 + (long) this.field2891) {
                    var7 = this.field2897 + (long) arg2;
                } else if (this.field2892 + (long) this.field2891 > this.field2897 && this.field2892 + (long) this.field2891 <= this.field2897 + (long) arg2) {
                    var7 = this.field2892 + (long) this.field2891;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field2897), this.field2890, (int) (var5 - this.field2892), var9);
                }
                this.field2897 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field2895 == -1L) {
                    this.field2895 = this.field2897;
                }
                System.arraycopy(arg0, arg1, this.field2898, (int) (this.field2897 - this.field2895), arg2);
                this.field2897 += (long) arg2;
                if (this.field2897 - this.field2895 > (long) this.field2896) {
                    this.field2896 = (int) (this.field2897 - this.field2895);
                }
            }
        } catch (IOException var11) {
            this.field2893 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("gr.x(I)V")
    public void method3411() throws IOException {
        if (this.field2895 == -1L) {
            return;
        }
        if (this.field2895 != this.field2893) {
            this.field2899.method3380(this.field2895);
            this.field2893 = this.field2895;
        }
        this.field2899.method3386(this.field2898, 0, this.field2896);
        this.field2893 += (long) (this.field2896 * -20997775) * 415762321L;
        if (this.field2893 > this.field2900) {
            this.field2900 = this.field2893;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field2895 >= this.field2892 && this.field2895 < this.field2892 + (long) this.field2891) {
            var1 = this.field2895;
        } else if (this.field2892 >= this.field2895 && this.field2892 < this.field2895 + (long) this.field2896) {
            var1 = this.field2892;
        }
        if (this.field2895 + (long) this.field2896 > this.field2892 && this.field2895 + (long) this.field2896 <= this.field2892 + (long) this.field2891) {
            var3 = this.field2895 + (long) this.field2896;
        } else if (this.field2892 + (long) this.field2891 > this.field2895 && this.field2892 + (long) this.field2891 <= this.field2895 + (long) this.field2896) {
            var3 = this.field2892 + (long) this.field2891;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field2898, (int) (var1 - this.field2895), this.field2890, (int) (var1 - this.field2892), var5);
        }
        this.field2895 = -1L;
        this.field2896 = 0;
    }
}
