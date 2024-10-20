package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("au")
public class class30 {

    @ObfuscatedName("au.b")
    public class29 field771;

    @ObfuscatedName("au.c")
    public byte[] field761;

    @ObfuscatedName("au.j")
    public long field758 = -1L;

    @ObfuscatedName("au.i")
    public int field763;

    @ObfuscatedName("au.k")
    public byte[] field762;

    @ObfuscatedName("au.q")
    public long field760 = -1L;

    @ObfuscatedName("au.t")
    public int field772 = 0;

    @ObfuscatedName("au.v")
    public long field765;

    @ObfuscatedName("au.y")
    public long field766;

    @ObfuscatedName("au.w")
    public long field767;

    @ObfuscatedName("au.g")
    public long field768;

    public class30(class29 arg0, int arg1, int arg2) throws IOException {
        this.field771 = arg0;
        this.field767 = this.field766 = arg0.method543();
        this.field761 = new byte[arg1];
        this.field762 = new byte[arg2];
        this.field765 = 0L;
    }

    @ObfuscatedName("au.b(I)V")
    public void method563() throws IOException {
        this.method569();
        this.field771.method541();
    }

    @ObfuscatedName("au.c(J)V")
    public void method564(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field765 = arg0;
    }

    @ObfuscatedName("au.j(I)J")
    public long method562() {
        return this.field767;
    }

    @ObfuscatedName("au.i([BI)V")
    public void method568(byte[] arg0) throws IOException {
        this.method565(arg0, 0, arg0.length);
    }

    @ObfuscatedName("au.k([BIII)V")
    public void method565(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field760 != -1L && this.field765 >= this.field760 && this.field765 + (long) arg2 <= this.field760 + (long) this.field772) {
                System.arraycopy(this.field762, (int) (this.field765 - this.field760), arg0, arg1, arg2);
                this.field765 += (long) arg2;
                return;
            }
            long var4 = this.field765;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field765 >= this.field758 && this.field765 < this.field758 + (long) this.field763) {
                int var8 = (int) ((long) this.field763 - (this.field765 - this.field758));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field761, (int) (this.field765 - this.field758), arg0, arg1, var8);
                this.field765 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field761.length) {
                this.field771.method540(this.field765);
                this.field768 = this.field765;
                while (arg2 > 0) {
                    int var9 = this.field771.method544(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field768 += (long) var9;
                    this.field765 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method566();
                int var10 = arg2;
                if (arg2 > this.field763) {
                    var10 = this.field763;
                }
                System.arraycopy(this.field761, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field765 += (long) var10;
            }
            if (this.field760 != -1L) {
                if (this.field760 > this.field765 && arg2 > 0) {
                    int var11 = (int) (this.field760 - this.field765) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field765++;
                    }
                }
                long var12 = -1L;
                long var14 = -1L;
                if (this.field760 >= var4 && this.field760 < (long) var7 + var4) {
                    var12 = this.field760;
                } else if (var4 >= this.field760 && var4 < this.field760 + (long) this.field772) {
                    var12 = var4;
                }
                if (this.field760 + (long) this.field772 > var4 && this.field760 + (long) this.field772 <= (long) var7 + var4) {
                    var14 = this.field760 + (long) this.field772;
                } else if ((long) var7 + var4 > this.field760 && (long) var7 + var4 <= this.field760 + (long) this.field772) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field762, (int) (var12 - this.field760), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field765) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field765));
                        this.field765 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field768 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("au.q(I)V")
    public void method566() throws IOException {
        this.field763 = 0;
        if (this.field768 != this.field765) {
            this.field771.method540(this.field765);
            this.field768 = this.field765;
        }
        this.field758 = this.field765;
        while (this.field763 < this.field761.length) {
            int var1 = this.field771.method544(this.field761, this.field763, this.field761.length - this.field763);
            if (var1 == -1) {
                break;
            }
            this.field768 += (long) var1;
            this.field763 += var1;
        }
    }

    @ObfuscatedName("au.t([BIII)V")
    public void method576(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field765 + (long) arg2 > this.field767) {
                this.field767 = this.field765 + (long) arg2;
            }
            if (this.field760 != -1L && (this.field765 < this.field760 || this.field765 > this.field760 + (long) this.field772)) {
                this.method569();
            }
            if (this.field760 != -1L && this.field765 + (long) arg2 > this.field760 + (long) this.field762.length) {
                int var4 = (int) ((long) this.field762.length - (this.field765 - this.field760));
                System.arraycopy(arg0, arg1, this.field762, (int) (this.field765 - this.field760), var4);
                this.field765 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field772 = this.field762.length;
                this.method569();
            }
            if (arg2 > this.field762.length) {
                if (this.field768 != this.field765) {
                    this.field771.method540(this.field765);
                    this.field768 = this.field765;
                }
                this.field771.method559(arg0, arg1, arg2);
                this.field768 += (long) arg2;
                if (this.field768 > this.field766) {
                    this.field766 = this.field768;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field765 >= this.field758 && this.field765 < this.field758 + (long) this.field763) {
                    var5 = this.field765;
                } else if (this.field758 >= this.field765 && this.field758 < this.field765 + (long) arg2) {
                    var5 = this.field758;
                }
                if (this.field765 + (long) arg2 > this.field758 && this.field765 + (long) arg2 <= this.field758 + (long) this.field763) {
                    var7 = this.field765 + (long) arg2;
                } else if (this.field758 + (long) this.field763 > this.field765 && this.field758 + (long) this.field763 <= this.field765 + (long) arg2) {
                    var7 = this.field758 + (long) this.field763;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field765), this.field761, (int) (var5 - this.field758), var9);
                }
                this.field765 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field760 == -1L) {
                    this.field760 = this.field765;
                }
                System.arraycopy(arg0, arg1, this.field762, (int) (this.field765 - this.field760), arg2);
                this.field765 += (long) arg2;
                if (this.field765 - this.field760 > (long) this.field772) {
                    this.field772 = (int) (this.field765 - this.field760);
                }
            }
        } catch (IOException var11) {
            this.field768 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("au.v(B)V")
    public void method569() throws IOException {
        if (this.field760 == -1L) {
            return;
        }
        if (this.field768 != this.field760) {
            this.field771.method540(this.field760);
            this.field768 = this.field760;
        }
        this.field771.method559(this.field762, 0, this.field772);
        this.field768 += (long) (this.field772 * 1382203795) * -1759017829L;
        if (this.field768 > this.field766) {
            this.field766 = this.field768;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field760 >= this.field758 && this.field760 < this.field758 + (long) this.field763) {
            var1 = this.field760;
        } else if (this.field758 >= this.field760 && this.field758 < this.field760 + (long) this.field772) {
            var1 = this.field758;
        }
        if (this.field760 + (long) this.field772 > this.field758 && this.field760 + (long) this.field772 <= this.field758 + (long) this.field763) {
            var3 = this.field760 + (long) this.field772;
        } else if (this.field758 + (long) this.field763 > this.field760 && this.field758 + (long) this.field763 <= this.field760 + (long) this.field772) {
            var3 = this.field758 + (long) this.field763;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field762, (int) (var1 - this.field760), this.field761, (int) (var1 - this.field758), var5);
        }
        this.field760 = -1L;
        this.field772 = 0;
    }
}
