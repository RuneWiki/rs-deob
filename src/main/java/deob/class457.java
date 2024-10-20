package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("qp")
public class class457 {

    @ObfuscatedName("qp.w")
    public class456 field4871;

    @ObfuscatedName("qp.v")
    public byte[] field4879;

    @ObfuscatedName("qp.s")
    public long field4872 = -1L;

    @ObfuscatedName("qp.z")
    public int field4875;

    @ObfuscatedName("qp.j")
    public byte[] field4876;

    @ObfuscatedName("qp.i")
    public long field4877 = -1L;

    @ObfuscatedName("qp.n")
    public int field4878 = 0;

    @ObfuscatedName("qp.l")
    public long field4874;

    @ObfuscatedName("qp.k")
    public long field4880;

    @ObfuscatedName("qp.c")
    public long field4881;

    @ObfuscatedName("qp.r")
    public long field4882;

    public class457(class456 arg0, int arg1, int arg2) throws IOException {
        this.field4871 = arg0;
        this.field4881 = this.field4880 = arg0.method7739();
        this.field4879 = new byte[arg1];
        this.field4876 = new byte[arg2];
        this.field4874 = 0L;
    }

    @ObfuscatedName("qp.f(I)V")
    public void method7764() throws IOException {
        this.method7771();
        this.field4871.method7735();
    }

    @ObfuscatedName("qp.w(J)V")
    public void method7765(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field4874 = arg0;
    }

    @ObfuscatedName("qp.v(I)J")
    public long method7766() {
        return this.field4881;
    }

    @ObfuscatedName("qp.s([BS)V")
    public void method7767(byte[] arg0) throws IOException {
        this.method7768(arg0, 0, arg0.length);
    }

    @ObfuscatedName("qp.z([BIII)V")
    public void method7768(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field4877 != -1L && this.field4874 >= this.field4877 && this.field4874 + (long) arg2 <= this.field4877 + (long) this.field4878) {
                System.arraycopy(this.field4876, (int) (this.field4874 - this.field4877), arg0, arg1, arg2);
                this.field4874 += (long) arg2;
                return;
            }
            long var4 = this.field4874;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field4874 >= this.field4872 && this.field4874 < this.field4872 + (long) this.field4875) {
                int var8 = (int) ((long) this.field4875 - (this.field4874 - this.field4872));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field4879, (int) (this.field4874 - this.field4872), arg0, arg1, var8);
                this.field4874 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field4879.length) {
                this.field4871.method7744(this.field4874);
                this.field4882 = this.field4874;
                while (arg2 > 0) {
                    int var9 = this.field4871.method7738(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field4882 += (long) var9;
                    this.field4874 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method7769();
                int var10 = arg2;
                if (arg2 > this.field4875) {
                    var10 = this.field4875;
                }
                System.arraycopy(this.field4879, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field4874 += (long) var10;
            }
            if (this.field4877 != -1L) {
                if (this.field4877 > this.field4874 && arg2 > 0) {
                    int var11 = (int) (this.field4877 - this.field4874) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field4874++;
                    }
                }
                long var12 = -1L;
                long var14 = -1L;
                if (this.field4877 >= var4 && this.field4877 < (long) var7 + var4) {
                    var12 = this.field4877;
                } else if (var4 >= this.field4877 && var4 < this.field4877 + (long) this.field4878) {
                    var12 = var4;
                }
                if (this.field4877 + (long) this.field4878 > var4 && this.field4877 + (long) this.field4878 <= (long) var7 + var4) {
                    var14 = this.field4877 + (long) this.field4878;
                } else if ((long) var7 + var4 > this.field4877 && (long) var7 + var4 <= this.field4877 + (long) this.field4878) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field4876, (int) (var12 - this.field4877), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field4874) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field4874));
                        this.field4874 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field4882 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("qp.j(S)V")
    public void method7769() throws IOException {
        this.field4875 = 0;
        if (this.field4882 != this.field4874) {
            this.field4871.method7744(this.field4874);
            this.field4882 = this.field4874;
        }
        this.field4872 = this.field4874;
        while (this.field4875 < this.field4879.length) {
            int var1 = this.field4879.length - this.field4875;
            if (var1 > 200000000) {
                var1 = 200000000;
            }
            int var2 = this.field4871.method7738(this.field4879, this.field4875, var1);
            if (var2 == -1) {
                break;
            }
            this.field4882 += (long) var2;
            this.field4875 += var2;
        }
    }

    @ObfuscatedName("qp.i([BIII)V")
    public void method7770(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field4874 + (long) arg2 > this.field4881) {
                this.field4881 = this.field4874 + (long) arg2;
            }
            if (this.field4877 != -1L && (this.field4874 < this.field4877 || this.field4874 > this.field4877 + (long) this.field4878)) {
                this.method7771();
            }
            if (this.field4877 != -1L && this.field4874 + (long) arg2 > this.field4877 + (long) this.field4876.length) {
                int var4 = (int) ((long) this.field4876.length - (this.field4874 - this.field4877));
                System.arraycopy(arg0, arg1, this.field4876, (int) (this.field4874 - this.field4877), var4);
                this.field4874 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field4878 = this.field4876.length;
                this.method7771();
            }
            if (arg2 > this.field4876.length) {
                if (this.field4882 != this.field4874) {
                    this.field4871.method7744(this.field4874);
                    this.field4882 = this.field4874;
                }
                this.field4871.method7734(arg0, arg1, arg2);
                this.field4882 += (long) arg2;
                if (this.field4882 > this.field4880) {
                    this.field4880 = this.field4882;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field4874 >= this.field4872 && this.field4874 < this.field4872 + (long) this.field4875) {
                    var5 = this.field4874;
                } else if (this.field4872 >= this.field4874 && this.field4872 < this.field4874 + (long) arg2) {
                    var5 = this.field4872;
                }
                if (this.field4874 + (long) arg2 > this.field4872 && this.field4874 + (long) arg2 <= this.field4872 + (long) this.field4875) {
                    var7 = this.field4874 + (long) arg2;
                } else if (this.field4872 + (long) this.field4875 > this.field4874 && this.field4872 + (long) this.field4875 <= this.field4874 + (long) arg2) {
                    var7 = this.field4872 + (long) this.field4875;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field4874), this.field4879, (int) (var5 - this.field4872), var9);
                }
                this.field4874 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field4877 == -1L) {
                    this.field4877 = this.field4874;
                }
                System.arraycopy(arg0, arg1, this.field4876, (int) (this.field4874 - this.field4877), arg2);
                this.field4874 += (long) arg2;
                if (this.field4874 - this.field4877 > (long) this.field4878) {
                    this.field4878 = (int) (this.field4874 - this.field4877);
                }
            }
        } catch (IOException var11) {
            this.field4882 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("qp.n(I)V")
    public void method7771() throws IOException {
        if (this.field4877 == -1L) {
            return;
        }
        if (this.field4882 != this.field4877) {
            this.field4871.method7744(this.field4877);
            this.field4882 = this.field4877;
        }
        this.field4871.method7734(this.field4876, 0, this.field4878);
        this.field4882 += (long) (this.field4878 * 1674953927) * -690242313L;
        if (this.field4882 > this.field4880) {
            this.field4880 = this.field4882;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field4877 >= this.field4872 && this.field4877 < this.field4872 + (long) this.field4875) {
            var1 = this.field4877;
        } else if (this.field4872 >= this.field4877 && this.field4872 < this.field4877 + (long) this.field4878) {
            var1 = this.field4872;
        }
        if (this.field4877 + (long) this.field4878 > this.field4872 && this.field4877 + (long) this.field4878 <= this.field4872 + (long) this.field4875) {
            var3 = this.field4877 + (long) this.field4878;
        } else if (this.field4872 + (long) this.field4875 > this.field4877 && this.field4872 + (long) this.field4875 <= this.field4877 + (long) this.field4878) {
            var3 = this.field4872 + (long) this.field4875;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field4876, (int) (var1 - this.field4877), this.field4879, (int) (var1 - this.field4872), var5);
        }
        this.field4877 = -1L;
        this.field4878 = 0;
    }
}
