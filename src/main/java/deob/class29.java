package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("ad")
public class class29 {

    @ObfuscatedName("ad.g")
    public class28 field753;

    @ObfuscatedName("ad.e")
    public byte[] field746;

    @ObfuscatedName("ad.n")
    public long field754 = -1L;

    @ObfuscatedName("ad.j")
    public int field748;

    @ObfuscatedName("ad.i")
    public byte[] field745;

    @ObfuscatedName("ad.o")
    public long field750 = -1L;

    @ObfuscatedName("ad.l")
    public int field751 = 0;

    @ObfuscatedName("ad.p")
    public long field752;

    @ObfuscatedName("ad.t")
    public long field758;

    @ObfuscatedName("ad.w")
    public long field755;

    @ObfuscatedName("ad.r")
    public long field749;

    public class29(class28 arg0, int arg1, int arg2) throws IOException {
        this.field753 = arg0;
        this.field755 = this.field758 = arg0.method558();
        this.field746 = new byte[arg1];
        this.field745 = new byte[arg2];
        this.field752 = 0L;
    }

    @ObfuscatedName("ad.g(I)V")
    public void method588() throws IOException {
        this.method583();
        this.field753.method555();
    }

    @ObfuscatedName("ad.e(J)V")
    public void method576(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field752 = arg0;
    }

    @ObfuscatedName("ad.n(I)J")
    public long method599() {
        return this.field755;
    }

    @ObfuscatedName("ad.j([BB)V")
    public void method578(byte[] arg0) throws IOException {
        this.method577(arg0, 0, arg0.length);
    }

    @ObfuscatedName("ad.i([BIII)V")
    public void method577(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field750 != -1L && this.field752 >= this.field750 && this.field752 + (long) arg2 <= this.field750 + (long) this.field751) {
                System.arraycopy(this.field745, (int) (this.field752 - this.field750), arg0, arg1, arg2);
                this.field752 += (long) arg2;
                return;
            }
            long var4 = this.field752;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field752 >= this.field754 && this.field752 < this.field754 + (long) this.field748) {
                int var8 = (int) ((long) this.field748 - (this.field752 - this.field754));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field746, (int) (this.field752 - this.field754), arg0, arg1, var8);
                this.field752 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field746.length) {
                this.field753.method562(this.field752);
                this.field749 = this.field752;
                while (arg2 > 0) {
                    int var9 = this.field753.method556(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field749 += (long) var9;
                    this.field752 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method581();
                int var10 = arg2;
                if (arg2 > this.field748) {
                    var10 = this.field748;
                }
                System.arraycopy(this.field746, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field752 += (long) var10;
            }
            if (this.field750 != -1L) {
                if (this.field750 > this.field752 && arg2 > 0) {
                    int var11 = (int) (this.field750 - this.field752) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field752++;
                    }
                }
                long var12 = -1L;
                long var14 = -1L;
                if (this.field750 >= var4 && this.field750 < (long) var7 + var4) {
                    var12 = this.field750;
                } else if (var4 >= this.field750 && var4 < this.field750 + (long) this.field751) {
                    var12 = var4;
                }
                if (this.field750 + (long) this.field751 > var4 && this.field750 + (long) this.field751 <= (long) var7 + var4) {
                    var14 = this.field750 + (long) this.field751;
                } else if ((long) var7 + var4 > this.field750 && (long) var7 + var4 <= this.field750 + (long) this.field751) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field745, (int) (var12 - this.field750), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field752) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field752));
                        this.field752 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field749 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("ad.o(I)V")
    public void method581() throws IOException {
        this.field748 = 0;
        if (this.field752 != this.field749) {
            this.field753.method562(this.field752);
            this.field749 = this.field752;
        }
        this.field754 = this.field752;
        while (this.field748 < this.field746.length) {
            int var1 = this.field753.method556(this.field746, this.field748, this.field746.length - this.field748);
            if (var1 == -1) {
                break;
            }
            this.field749 += (long) var1;
            this.field748 += var1;
        }
    }

    @ObfuscatedName("ad.l([BIIB)V")
    public void method580(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field752 + (long) arg2 > this.field755) {
                this.field755 = this.field752 + (long) arg2;
            }
            if (this.field750 != -1L && (this.field752 < this.field750 || this.field752 > this.field750 + (long) this.field751)) {
                this.method583();
            }
            if (this.field750 != -1L && this.field752 + (long) arg2 > this.field750 + (long) this.field745.length) {
                int var4 = (int) ((long) this.field745.length - (this.field752 - this.field750));
                System.arraycopy(arg0, arg1, this.field745, (int) (this.field752 - this.field750), var4);
                this.field752 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field751 = this.field745.length;
                this.method583();
            }
            if (arg2 > this.field745.length) {
                if (this.field752 != this.field749) {
                    this.field753.method562(this.field752);
                    this.field749 = this.field752;
                }
                this.field753.method560(arg0, arg1, arg2);
                this.field749 += (long) arg2;
                if (this.field749 > this.field758) {
                    this.field758 = this.field749;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field752 >= this.field754 && this.field752 < this.field754 + (long) this.field748) {
                    var5 = this.field752;
                } else if (this.field754 >= this.field752 && this.field754 < this.field752 + (long) arg2) {
                    var5 = this.field754;
                }
                if (this.field752 + (long) arg2 > this.field754 && this.field752 + (long) arg2 <= this.field754 + (long) this.field748) {
                    var7 = this.field752 + (long) arg2;
                } else if (this.field754 + (long) this.field748 > this.field752 && this.field754 + (long) this.field748 <= this.field752 + (long) arg2) {
                    var7 = this.field754 + (long) this.field748;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field752), this.field746, (int) (var5 - this.field754), var9);
                }
                this.field752 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field750 == -1L) {
                    this.field750 = this.field752;
                }
                System.arraycopy(arg0, arg1, this.field745, (int) (this.field752 - this.field750), arg2);
                this.field752 += (long) arg2;
                if (this.field752 - this.field750 > (long) this.field751) {
                    this.field751 = (int) (this.field752 - this.field750);
                }
            }
        } catch (IOException var11) {
            this.field749 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("ad.p(I)V")
    public void method583() throws IOException {
        if (this.field750 == -1L) {
            return;
        }
        if (this.field750 != this.field749) {
            this.field753.method562(this.field750);
            this.field749 = this.field750;
        }
        this.field753.method560(this.field745, 0, this.field751);
        this.field749 += (long) (this.field751 * 1210648833) * -1054345471L;
        if (this.field749 > this.field758) {
            this.field758 = this.field749;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field750 >= this.field754 && this.field750 < this.field754 + (long) this.field748) {
            var1 = this.field750;
        } else if (this.field754 >= this.field750 && this.field754 < this.field750 + (long) this.field751) {
            var1 = this.field754;
        }
        if (this.field750 + (long) this.field751 > this.field754 && this.field750 + (long) this.field751 <= this.field754 + (long) this.field748) {
            var3 = this.field750 + (long) this.field751;
        } else if (this.field754 + (long) this.field748 > this.field750 && this.field754 + (long) this.field748 <= this.field750 + (long) this.field751) {
            var3 = this.field754 + (long) this.field748;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field745, (int) (var1 - this.field750), this.field746, (int) (var1 - this.field754), var5);
        }
        this.field750 = -1L;
        this.field751 = 0;
    }
}
