package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("ar")
public class class29 {

    @ObfuscatedName("ar.z")
    public class28 field761;

    @ObfuscatedName("ar.h")
    public byte[] field762;

    @ObfuscatedName("ar.c")
    public long field763 = -1L;

    @ObfuscatedName("ar.p")
    public int field764;

    @ObfuscatedName("ar.i")
    public byte[] field765;

    @ObfuscatedName("ar.v")
    public long field766 = -1L;

    @ObfuscatedName("ar.l")
    public int field767 = 0;

    @ObfuscatedName("ar.m")
    public long field768;

    @ObfuscatedName("ar.g")
    public long field775;

    @ObfuscatedName("ar.t")
    public long field770;

    @ObfuscatedName("ar.o")
    public long field772;

    public class29(class28 arg0, int arg1, int arg2) throws IOException {
        this.field761 = arg0;
        this.field770 = this.field775 = arg0.method568();
        this.field762 = new byte[arg1];
        this.field765 = new byte[arg2];
        this.field768 = 0L;
    }

    @ObfuscatedName("ar.z(B)V")
    public void method590() throws IOException {
        this.method592();
        this.field761.method569();
    }

    @ObfuscatedName("ar.h(J)V")
    public void method586(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field768 = arg0;
    }

    @ObfuscatedName("ar.c(B)J")
    public long method587() {
        return this.field770;
    }

    @ObfuscatedName("ar.p([BB)V")
    public void method598(byte[] arg0) throws IOException {
        this.method585(arg0, 0, arg0.length);
    }

    @ObfuscatedName("ar.i([BIII)V")
    public void method585(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field766 != -1L && this.field768 >= this.field766 && this.field768 + (long) arg2 <= this.field766 + (long) this.field767) {
                System.arraycopy(this.field765, (int) (this.field768 - this.field766), arg0, arg1, arg2);
                this.field768 += (long) arg2;
                return;
            }
            long var4 = this.field768;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field768 >= this.field763 && this.field768 < this.field763 + (long) this.field764) {
                int var8 = (int) ((long) this.field764 - (this.field768 - this.field763));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field762, (int) (this.field768 - this.field763), arg0, arg1, var8);
                this.field768 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field762.length) {
                this.field761.method565(this.field768);
                this.field772 = this.field768;
                while (arg2 > 0) {
                    int var9 = this.field761.method573(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field772 += (long) var9;
                    this.field768 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method602();
                int var10 = arg2;
                if (arg2 > this.field764) {
                    var10 = this.field764;
                }
                System.arraycopy(this.field762, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field768 += (long) var10;
            }
            if (this.field766 != -1L) {
                if (this.field766 > this.field768 && arg2 > 0) {
                    int var11 = (int) (this.field766 - this.field768) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field768++;
                    }
                }
                long var12 = -1L;
                long var14 = -1L;
                if (this.field766 >= var4 && this.field766 < (long) var7 + var4) {
                    var12 = this.field766;
                } else if (var4 >= this.field766 && var4 < this.field766 + (long) this.field767) {
                    var12 = var4;
                }
                if (this.field766 + (long) this.field767 > var4 && this.field766 + (long) this.field767 <= (long) var7 + var4) {
                    var14 = this.field766 + (long) this.field767;
                } else if ((long) var7 + var4 > this.field766 && (long) var7 + var4 <= this.field766 + (long) this.field767) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field765, (int) (var12 - this.field766), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field768) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field768));
                        this.field768 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field772 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("ar.v(I)V")
    public void method602() throws IOException {
        this.field764 = 0;
        if (this.field772 != this.field768) {
            this.field761.method565(this.field768);
            this.field772 = this.field768;
        }
        this.field763 = this.field768;
        while (this.field764 < this.field762.length) {
            int var1 = this.field761.method573(this.field762, this.field764, this.field762.length - this.field764);
            if (var1 == -1) {
                break;
            }
            this.field772 += (long) var1;
            this.field764 += var1;
        }
    }

    @ObfuscatedName("ar.l([BIIB)V")
    public void method591(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field768 + (long) arg2 > this.field770) {
                this.field770 = this.field768 + (long) arg2;
            }
            if (this.field766 != -1L && (this.field768 < this.field766 || this.field768 > this.field766 + (long) this.field767)) {
                this.method592();
            }
            if (this.field766 != -1L && this.field768 + (long) arg2 > this.field766 + (long) this.field765.length) {
                int var4 = (int) ((long) this.field765.length - (this.field768 - this.field766));
                System.arraycopy(arg0, arg1, this.field765, (int) (this.field768 - this.field766), var4);
                this.field768 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field767 = this.field765.length;
                this.method592();
            }
            if (arg2 > this.field765.length) {
                if (this.field772 != this.field768) {
                    this.field761.method565(this.field768);
                    this.field772 = this.field768;
                }
                this.field761.method583(arg0, arg1, arg2);
                this.field772 += (long) arg2;
                if (this.field772 > this.field775) {
                    this.field775 = this.field772;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field768 >= this.field763 && this.field768 < this.field763 + (long) this.field764) {
                    var5 = this.field768;
                } else if (this.field763 >= this.field768 && this.field763 < this.field768 + (long) arg2) {
                    var5 = this.field763;
                }
                if (this.field768 + (long) arg2 > this.field763 && this.field768 + (long) arg2 <= this.field763 + (long) this.field764) {
                    var7 = this.field768 + (long) arg2;
                } else if (this.field763 + (long) this.field764 > this.field768 && this.field763 + (long) this.field764 <= this.field768 + (long) arg2) {
                    var7 = this.field763 + (long) this.field764;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field768), this.field762, (int) (var5 - this.field763), var9);
                }
                this.field768 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field766 == -1L) {
                    this.field766 = this.field768;
                }
                System.arraycopy(arg0, arg1, this.field765, (int) (this.field768 - this.field766), arg2);
                this.field768 += (long) arg2;
                if (this.field768 - this.field766 > (long) this.field767) {
                    this.field767 = (int) (this.field768 - this.field766);
                }
            }
        } catch (IOException var11) {
            this.field772 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("ar.m(B)V")
    public void method592() throws IOException {
        if (this.field766 == -1L) {
            return;
        }
        if (this.field772 != this.field766) {
            this.field761.method565(this.field766);
            this.field772 = this.field766;
        }
        this.field761.method583(this.field765, 0, this.field767);
        this.field772 += (long) (this.field767 * 1933446343) * -2123565833L;
        if (this.field772 > this.field775) {
            this.field775 = this.field772;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field766 >= this.field763 && this.field766 < this.field763 + (long) this.field764) {
            var1 = this.field766;
        } else if (this.field763 >= this.field766 && this.field763 < this.field766 + (long) this.field767) {
            var1 = this.field763;
        }
        if (this.field766 + (long) this.field767 > this.field763 && this.field766 + (long) this.field767 <= this.field763 + (long) this.field764) {
            var3 = this.field766 + (long) this.field767;
        } else if (this.field763 + (long) this.field764 > this.field766 && this.field763 + (long) this.field764 <= this.field766 + (long) this.field767) {
            var3 = this.field763 + (long) this.field764;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field765, (int) (var1 - this.field766), this.field762, (int) (var1 - this.field763), var5);
        }
        this.field766 = -1L;
        this.field767 = 0;
    }
}
