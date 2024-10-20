package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("ak")
public class class31 {

    @ObfuscatedName("ak.e")
    public class30 field781;

    @ObfuscatedName("ak.i")
    public byte[] field780;

    @ObfuscatedName("ak.k")
    public long field779 = -1L;

    @ObfuscatedName("ak.q")
    public int field782;

    @ObfuscatedName("ak.j")
    public byte[] field783;

    @ObfuscatedName("ak.z")
    public long field784 = -1L;

    @ObfuscatedName("ak.m")
    public int field790 = 0;

    @ObfuscatedName("ak.w")
    public long field786;

    @ObfuscatedName("ak.a")
    public long field787;

    @ObfuscatedName("ak.d")
    public long field788;

    @ObfuscatedName("ak.u")
    public long field785;

    public class31(class30 arg0, int arg1, int arg2) throws IOException {
        this.field781 = arg0;
        this.field788 = this.field787 = arg0.method601();
        this.field780 = new byte[arg1];
        this.field783 = new byte[arg2];
        this.field786 = 0L;
    }

    @ObfuscatedName("ak.e(I)V")
    public void method615() throws IOException {
        this.method619();
        this.field781.method598();
    }

    @ObfuscatedName("ak.i(J)V")
    public void method642(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field786 = arg0;
    }

    @ObfuscatedName("ak.k(I)J")
    public long method636() {
        return this.field788;
    }

    @ObfuscatedName("ak.q([BI)V")
    public void method618(byte[] arg0) throws IOException {
        this.method643(arg0, 0, arg0.length);
    }

    @ObfuscatedName("ak.j([BIIB)V")
    public void method643(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field784 != -1L && this.field786 >= this.field784 && this.field786 + (long) arg2 <= this.field784 + (long) this.field790) {
                System.arraycopy(this.field783, (int) (this.field786 - this.field784), arg0, arg1, arg2);
                this.field786 += (long) arg2;
                return;
            }
            long var4 = this.field786;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field786 >= this.field779 && this.field786 < this.field779 + (long) this.field782) {
                int var8 = (int) ((long) this.field782 - (this.field786 - this.field779));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field780, (int) (this.field786 - this.field779), arg0, arg1, var8);
                this.field786 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field780.length) {
                this.field781.method610(this.field786);
                this.field785 = this.field786;
                while (arg2 > 0) {
                    int var9 = this.field781.method612(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field785 += (long) var9;
                    this.field786 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method616();
                int var10 = arg2;
                if (arg2 > this.field782) {
                    var10 = this.field782;
                }
                System.arraycopy(this.field780, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field786 += (long) var10;
            }
            if (this.field784 != -1L) {
                if (this.field784 > this.field786 && arg2 > 0) {
                    int var11 = (int) (this.field784 - this.field786) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field786++;
                    }
                }
                long var12 = -1L;
                long var14 = -1L;
                if (this.field784 >= var4 && this.field784 < (long) var7 + var4) {
                    var12 = this.field784;
                } else if (var4 >= this.field784 && var4 < this.field784 + (long) this.field790) {
                    var12 = var4;
                }
                if (this.field784 + (long) this.field790 > var4 && this.field784 + (long) this.field790 <= (long) var7 + var4) {
                    var14 = this.field784 + (long) this.field790;
                } else if ((long) var7 + var4 > this.field784 && (long) var7 + var4 <= this.field784 + (long) this.field790) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field783, (int) (var12 - this.field784), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field786) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field786));
                        this.field786 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field785 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("ak.z(I)V")
    public void method616() throws IOException {
        this.field782 = 0;
        if (this.field786 != this.field785) {
            this.field781.method610(this.field786);
            this.field785 = this.field786;
        }
        this.field779 = this.field786;
        while (this.field782 < this.field780.length) {
            int var1 = this.field781.method612(this.field780, this.field782, this.field780.length - this.field782);
            if (var1 == -1) {
                break;
            }
            this.field785 += (long) var1;
            this.field782 += var1;
        }
    }

    @ObfuscatedName("ak.m([BIII)V")
    public void method614(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field786 + (long) arg2 > this.field788) {
                this.field788 = this.field786 + (long) arg2;
            }
            if (this.field784 != -1L && (this.field786 < this.field784 || this.field786 > this.field784 + (long) this.field790)) {
                this.method619();
            }
            if (this.field784 != -1L && this.field786 + (long) arg2 > this.field784 + (long) this.field783.length) {
                int var4 = (int) ((long) this.field783.length - (this.field786 - this.field784));
                System.arraycopy(arg0, arg1, this.field783, (int) (this.field786 - this.field784), var4);
                this.field786 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field790 = this.field783.length;
                this.method619();
            }
            if (arg2 > this.field783.length) {
                if (this.field786 != this.field785) {
                    this.field781.method610(this.field786);
                    this.field785 = this.field786;
                }
                this.field781.method597(arg0, arg1, arg2);
                this.field785 += (long) arg2;
                if (this.field785 > this.field787) {
                    this.field787 = this.field785;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field786 >= this.field779 && this.field786 < this.field779 + (long) this.field782) {
                    var5 = this.field786;
                } else if (this.field779 >= this.field786 && this.field779 < this.field786 + (long) arg2) {
                    var5 = this.field779;
                }
                if (this.field786 + (long) arg2 > this.field779 && this.field786 + (long) arg2 <= this.field779 + (long) this.field782) {
                    var7 = this.field786 + (long) arg2;
                } else if (this.field779 + (long) this.field782 > this.field786 && this.field779 + (long) this.field782 <= this.field786 + (long) arg2) {
                    var7 = this.field779 + (long) this.field782;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field786), this.field780, (int) (var5 - this.field779), var9);
                }
                this.field786 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field784 == -1L) {
                    this.field784 = this.field786;
                }
                System.arraycopy(arg0, arg1, this.field783, (int) (this.field786 - this.field784), arg2);
                this.field786 += (long) arg2;
                if (this.field786 - this.field784 > (long) this.field790) {
                    this.field790 = (int) (this.field786 - this.field784);
                }
            }
        } catch (IOException var11) {
            this.field785 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("ak.w(I)V")
    public void method619() throws IOException {
        if (this.field784 == -1L) {
            return;
        }
        if (this.field785 != this.field784) {
            this.field781.method610(this.field784);
            this.field785 = this.field784;
        }
        this.field781.method597(this.field783, 0, this.field790);
        this.field785 += (long) (this.field790 * -1440220421) * 801833011L;
        if (this.field785 > this.field787) {
            this.field787 = this.field785;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field784 >= this.field779 && this.field784 < this.field779 + (long) this.field782) {
            var1 = this.field784;
        } else if (this.field779 >= this.field784 && this.field779 < this.field784 + (long) this.field790) {
            var1 = this.field779;
        }
        if (this.field784 + (long) this.field790 > this.field779 && this.field784 + (long) this.field790 <= this.field779 + (long) this.field782) {
            var3 = this.field784 + (long) this.field790;
        } else if (this.field779 + (long) this.field782 > this.field784 && this.field779 + (long) this.field782 <= this.field784 + (long) this.field790) {
            var3 = this.field779 + (long) this.field782;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field783, (int) (var1 - this.field784), this.field780, (int) (var1 - this.field779), var5);
        }
        this.field784 = -1L;
        this.field790 = 0;
    }
}
