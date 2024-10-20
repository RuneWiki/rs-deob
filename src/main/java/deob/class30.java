package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("ab")
public class class30 {

    @ObfuscatedName("ab.j")
    public class29 field754;

    @ObfuscatedName("ab.r")
    public byte[] field766;

    @ObfuscatedName("ab.v")
    public long field755 = -1L;

    @ObfuscatedName("ab.p")
    public int field756;

    @ObfuscatedName("ab.e")
    public byte[] field757;

    @ObfuscatedName("ab.d")
    public long field758 = -1L;

    @ObfuscatedName("ab.y")
    public int field759 = 0;

    @ObfuscatedName("ab.x")
    public long field762;

    @ObfuscatedName("ab.t")
    public long field753;

    @ObfuscatedName("ab.i")
    public long field761;

    @ObfuscatedName("ab.z")
    public long field763;

    public class30(class29 arg0, int arg1, int arg2) throws IOException {
        this.field754 = arg0;
        this.field761 = this.field753 = arg0.method553();
        this.field766 = new byte[arg1];
        this.field757 = new byte[arg2];
        this.field762 = 0L;
    }

    @ObfuscatedName("ab.j(I)V")
    public void method586() throws IOException {
        this.method577();
        this.field754.method554();
    }

    @ObfuscatedName("ab.r(J)V")
    public void method571(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field762 = arg0;
    }

    @ObfuscatedName("ab.v(B)J")
    public long method572() {
        return this.field761;
    }

    @ObfuscatedName("ab.p([BI)V")
    public void method573(byte[] arg0) throws IOException {
        this.method570(arg0, 0, arg0.length);
    }

    @ObfuscatedName("ab.e([BIII)V")
    public void method570(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field758 != -1L && this.field762 >= this.field758 && this.field762 + (long) arg2 <= this.field758 + (long) this.field759) {
                System.arraycopy(this.field757, (int) (this.field762 - this.field758), arg0, arg1, arg2);
                this.field762 += (long) arg2;
                return;
            }
            long var4 = this.field762;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field762 >= this.field755 && this.field762 < this.field755 + (long) this.field756) {
                int var8 = (int) ((long) this.field756 - (this.field762 - this.field755));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field766, (int) (this.field762 - this.field755), arg0, arg1, var8);
                this.field762 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field766.length) {
                this.field754.method551(this.field762);
                this.field763 = this.field762;
                while (arg2 > 0) {
                    int var9 = this.field754.method560(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field763 += (long) var9;
                    this.field762 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method600();
                int var10 = arg2;
                if (arg2 > this.field756) {
                    var10 = this.field756;
                }
                System.arraycopy(this.field766, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field762 += (long) var10;
            }
            if (this.field758 != -1L) {
                if (this.field758 > this.field762 && arg2 > 0) {
                    int var11 = (int) (this.field758 - this.field762) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field762++;
                    }
                }
                long var12 = -1L;
                long var14 = -1L;
                if (this.field758 >= var4 && this.field758 < (long) var7 + var4) {
                    var12 = this.field758;
                } else if (var4 >= this.field758 && var4 < this.field758 + (long) this.field759) {
                    var12 = var4;
                }
                if (this.field758 + (long) this.field759 > var4 && this.field758 + (long) this.field759 <= (long) var7 + var4) {
                    var14 = this.field758 + (long) this.field759;
                } else if ((long) var7 + var4 > this.field758 && (long) var7 + var4 <= this.field758 + (long) this.field759) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field757, (int) (var12 - this.field758), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field762) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field762));
                        this.field762 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field763 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("ab.d(B)V")
    public void method600() throws IOException {
        this.field756 = 0;
        if (this.field763 != this.field762) {
            this.field754.method551(this.field762);
            this.field763 = this.field762;
        }
        this.field755 = this.field762;
        while (this.field756 < this.field766.length) {
            int var1 = this.field754.method560(this.field766, this.field756, this.field766.length - this.field756);
            if (var1 == -1) {
                break;
            }
            this.field763 += (long) var1;
            this.field756 += var1;
        }
    }

    @ObfuscatedName("ab.y([BIII)V")
    public void method597(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field762 + (long) arg2 > this.field761) {
                this.field761 = this.field762 + (long) arg2;
            }
            if (this.field758 != -1L && (this.field762 < this.field758 || this.field762 > this.field758 + (long) this.field759)) {
                this.method577();
            }
            if (this.field758 != -1L && this.field762 + (long) arg2 > this.field758 + (long) this.field757.length) {
                int var4 = (int) ((long) this.field757.length - (this.field762 - this.field758));
                System.arraycopy(arg0, arg1, this.field757, (int) (this.field762 - this.field758), var4);
                this.field762 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field759 = this.field757.length;
                this.method577();
            }
            if (arg2 > this.field757.length) {
                if (this.field763 != this.field762) {
                    this.field754.method551(this.field762);
                    this.field763 = this.field762;
                }
                this.field754.method567(arg0, arg1, arg2);
                this.field763 += (long) arg2;
                if (this.field763 > this.field753) {
                    this.field753 = this.field763;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field762 >= this.field755 && this.field762 < this.field755 + (long) this.field756) {
                    var5 = this.field762;
                } else if (this.field755 >= this.field762 && this.field755 < this.field762 + (long) arg2) {
                    var5 = this.field755;
                }
                if (this.field762 + (long) arg2 > this.field755 && this.field762 + (long) arg2 <= this.field755 + (long) this.field756) {
                    var7 = this.field762 + (long) arg2;
                } else if (this.field755 + (long) this.field756 > this.field762 && this.field755 + (long) this.field756 <= this.field762 + (long) arg2) {
                    var7 = this.field755 + (long) this.field756;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field762), this.field766, (int) (var5 - this.field755), var9);
                }
                this.field762 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field758 == -1L) {
                    this.field758 = this.field762;
                }
                System.arraycopy(arg0, arg1, this.field757, (int) (this.field762 - this.field758), arg2);
                this.field762 += (long) arg2;
                if (this.field762 - this.field758 > (long) this.field759) {
                    this.field759 = (int) (this.field762 - this.field758);
                }
            }
        } catch (IOException var11) {
            this.field763 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("ab.x(I)V")
    public void method577() throws IOException {
        if (this.field758 == -1L) {
            return;
        }
        if (this.field763 != this.field758) {
            this.field754.method551(this.field758);
            this.field763 = this.field758;
        }
        this.field754.method567(this.field757, 0, this.field759);
        this.field763 += (long) (this.field759 * -1051338891) * 2108752093L;
        if (this.field763 > this.field753) {
            this.field753 = this.field763;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field758 >= this.field755 && this.field758 < this.field755 + (long) this.field756) {
            var1 = this.field758;
        } else if (this.field755 >= this.field758 && this.field755 < this.field758 + (long) this.field759) {
            var1 = this.field755;
        }
        if (this.field758 + (long) this.field759 > this.field755 && this.field758 + (long) this.field759 <= this.field755 + (long) this.field756) {
            var3 = this.field758 + (long) this.field759;
        } else if (this.field755 + (long) this.field756 > this.field758 && this.field755 + (long) this.field756 <= this.field758 + (long) this.field759) {
            var3 = this.field755 + (long) this.field756;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field757, (int) (var1 - this.field758), this.field766, (int) (var1 - this.field755), var5);
        }
        this.field758 = -1L;
        this.field759 = 0;
    }
}
