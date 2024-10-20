package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("aw")
public class class30 {

    @ObfuscatedName("aw.g")
    public class29 field772;

    @ObfuscatedName("aw.h")
    public byte[] field779;

    @ObfuscatedName("aw.s")
    public long field764 = -1L;

    @ObfuscatedName("aw.o")
    public int field765;

    @ObfuscatedName("aw.p")
    public byte[] field763;

    @ObfuscatedName("aw.x")
    public long field767 = -1L;

    @ObfuscatedName("aw.k")
    public int field768 = 0;

    @ObfuscatedName("aw.r")
    public long field769;

    @ObfuscatedName("aw.z")
    public long field766;

    @ObfuscatedName("aw.n")
    public long field771;

    @ObfuscatedName("aw.j")
    public long field775;

    public class30(class29 arg0, int arg1, int arg2) throws IOException {
        this.field772 = arg0;
        this.field771 = this.field766 = arg0.method558();
        this.field779 = new byte[arg1];
        this.field763 = new byte[arg2];
        this.field769 = 0L;
    }

    @ObfuscatedName("aw.g(B)V")
    public void method578() throws IOException {
        this.method584();
        this.field772.method574();
    }

    @ObfuscatedName("aw.h(J)V")
    public void method579(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field769 = arg0;
    }

    @ObfuscatedName("aw.s(I)J")
    public long method602() {
        return this.field771;
    }

    @ObfuscatedName("aw.o([BI)V")
    public void method580(byte[] arg0) throws IOException {
        this.method586(arg0, 0, arg0.length);
    }

    @ObfuscatedName("aw.p([BIII)V")
    public void method586(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field767 != -1L && this.field769 >= this.field767 && this.field769 + (long) arg2 <= this.field767 + (long) this.field768) {
                System.arraycopy(this.field763, (int) (this.field769 - this.field767), arg0, arg1, arg2);
                this.field769 += (long) arg2;
                return;
            }
            long var4 = this.field769;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field769 >= this.field764 && this.field769 < this.field764 + (long) this.field765) {
                int var8 = (int) ((long) this.field765 - (this.field769 - this.field764));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field779, (int) (this.field769 - this.field764), arg0, arg1, var8);
                this.field769 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field779.length) {
                this.field772.method551(this.field769);
                this.field775 = this.field769;
                while (arg2 > 0) {
                    int var9 = this.field772.method555(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field775 += (long) var9;
                    this.field769 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method582();
                int var10 = arg2;
                if (arg2 > this.field765) {
                    var10 = this.field765;
                }
                System.arraycopy(this.field779, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field769 += (long) var10;
            }
            if (this.field767 != -1L) {
                if (this.field767 > this.field769 && arg2 > 0) {
                    int var11 = (int) (this.field767 - this.field769) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field769++;
                    }
                }
                long var12 = -1L;
                long var14 = -1L;
                if (this.field767 >= var4 && this.field767 < (long) var7 + var4) {
                    var12 = this.field767;
                } else if (var4 >= this.field767 && var4 < this.field767 + (long) this.field768) {
                    var12 = var4;
                }
                if (this.field767 + (long) this.field768 > var4 && this.field767 + (long) this.field768 <= (long) var7 + var4) {
                    var14 = this.field767 + (long) this.field768;
                } else if ((long) var7 + var4 > this.field767 && (long) var7 + var4 <= this.field767 + (long) this.field768) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field763, (int) (var12 - this.field767), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field769) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field769));
                        this.field769 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field775 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("aw.x(S)V")
    public void method582() throws IOException {
        this.field765 = 0;
        if (this.field775 != this.field769) {
            this.field772.method551(this.field769);
            this.field775 = this.field769;
        }
        this.field764 = this.field769;
        while (this.field765 < this.field779.length) {
            int var1 = this.field772.method555(this.field779, this.field765, this.field779.length - this.field765);
            if (var1 == -1) {
                break;
            }
            this.field775 += (long) var1;
            this.field765 += var1;
        }
    }

    @ObfuscatedName("aw.k([BIII)V")
    public void method583(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field769 + (long) arg2 > this.field771) {
                this.field771 = this.field769 + (long) arg2;
            }
            if (this.field767 != -1L && (this.field769 < this.field767 || this.field769 > this.field767 + (long) this.field768)) {
                this.method584();
            }
            if (this.field767 != -1L && this.field769 + (long) arg2 > this.field767 + (long) this.field763.length) {
                int var4 = (int) ((long) this.field763.length - (this.field769 - this.field767));
                System.arraycopy(arg0, arg1, this.field763, (int) (this.field769 - this.field767), var4);
                this.field769 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field768 = this.field763.length;
                this.method584();
            }
            if (arg2 > this.field763.length) {
                if (this.field775 != this.field769) {
                    this.field772.method551(this.field769);
                    this.field775 = this.field769;
                }
                this.field772.method552(arg0, arg1, arg2);
                this.field775 += (long) arg2;
                if (this.field775 > this.field766) {
                    this.field766 = this.field775;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field769 >= this.field764 && this.field769 < this.field764 + (long) this.field765) {
                    var5 = this.field769;
                } else if (this.field764 >= this.field769 && this.field764 < this.field769 + (long) arg2) {
                    var5 = this.field764;
                }
                if (this.field769 + (long) arg2 > this.field764 && this.field769 + (long) arg2 <= this.field764 + (long) this.field765) {
                    var7 = this.field769 + (long) arg2;
                } else if (this.field764 + (long) this.field765 > this.field769 && this.field764 + (long) this.field765 <= this.field769 + (long) arg2) {
                    var7 = this.field764 + (long) this.field765;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field769), this.field779, (int) (var5 - this.field764), var9);
                }
                this.field769 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field767 == -1L) {
                    this.field767 = this.field769;
                }
                System.arraycopy(arg0, arg1, this.field763, (int) (this.field769 - this.field767), arg2);
                this.field769 += (long) arg2;
                if (this.field769 - this.field767 > (long) this.field768) {
                    this.field768 = (int) (this.field769 - this.field767);
                }
            }
        } catch (IOException var11) {
            this.field775 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("aw.r(I)V")
    public void method584() throws IOException {
        if (this.field767 == -1L) {
            return;
        }
        if (this.field775 != this.field767) {
            this.field772.method551(this.field767);
            this.field775 = this.field767;
        }
        this.field772.method552(this.field763, 0, this.field768);
        this.field775 += (long) (this.field768 * -305917219) * -1516219019L;
        if (this.field775 > this.field766) {
            this.field766 = this.field775;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field767 >= this.field764 && this.field767 < this.field764 + (long) this.field765) {
            var1 = this.field767;
        } else if (this.field764 >= this.field767 && this.field764 < this.field767 + (long) this.field768) {
            var1 = this.field764;
        }
        if (this.field767 + (long) this.field768 > this.field764 && this.field767 + (long) this.field768 <= this.field764 + (long) this.field765) {
            var3 = this.field767 + (long) this.field768;
        } else if (this.field764 + (long) this.field765 > this.field767 && this.field764 + (long) this.field765 <= this.field767 + (long) this.field768) {
            var3 = this.field764 + (long) this.field765;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field763, (int) (var1 - this.field767), this.field779, (int) (var1 - this.field764), var5);
        }
        this.field767 = -1L;
        this.field768 = 0;
    }
}
