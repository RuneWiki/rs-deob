package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("ao")
public class class30 {

    @ObfuscatedName("ao.b")
    public class29 field762;

    @ObfuscatedName("ao.e")
    public byte[] field748;

    @ObfuscatedName("ao.g")
    public long field749 = -1L;

    @ObfuscatedName("ao.o")
    public int field750;

    @ObfuscatedName("ao.a")
    public byte[] field751;

    @ObfuscatedName("ao.h")
    public long field752 = -1L;

    @ObfuscatedName("ao.j")
    public int field753 = 0;

    @ObfuscatedName("ao.f")
    public long field758;

    @ObfuscatedName("ao.q")
    public long field754;

    @ObfuscatedName("ao.l")
    public long field756;

    @ObfuscatedName("ao.d")
    public long field755;

    public class30(class29 arg0, int arg1, int arg2) throws IOException {
        this.field762 = arg0;
        this.field756 = this.field754 = arg0.method564();
        this.field748 = new byte[arg1];
        this.field751 = new byte[arg2];
        this.field758 = 0L;
    }

    @ObfuscatedName("ao.b(I)V")
    public void method567() throws IOException {
        this.method574();
        this.field762.method548();
    }

    @ObfuscatedName("ao.e(J)V")
    public void method568(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field758 = arg0;
    }

    @ObfuscatedName("ao.g(I)J")
    public long method569() {
        return this.field756;
    }

    @ObfuscatedName("ao.o([BI)V")
    public void method570(byte[] arg0) throws IOException {
        this.method571(arg0, 0, arg0.length);
    }

    @ObfuscatedName("ao.a([BIII)V")
    public void method571(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field752 != -1L && this.field758 >= this.field752 && this.field758 + (long) arg2 <= this.field752 + (long) this.field753) {
                System.arraycopy(this.field751, (int) (this.field758 - this.field752), arg0, arg1, arg2);
                this.field758 += (long) arg2;
                return;
            }
            long var4 = this.field758;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field758 >= this.field749 && this.field758 < this.field749 + (long) this.field750) {
                int var8 = (int) ((long) this.field750 - (this.field758 - this.field749));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field748, (int) (this.field758 - this.field749), arg0, arg1, var8);
                this.field758 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field748.length) {
                this.field762.method559(this.field758);
                this.field755 = this.field758;
                while (arg2 > 0) {
                    int var9 = this.field762.method550(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field755 += (long) var9;
                    this.field758 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method585();
                int var10 = arg2;
                if (arg2 > this.field750) {
                    var10 = this.field750;
                }
                System.arraycopy(this.field748, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field758 += (long) var10;
            }
            if (this.field752 != -1L) {
                if (this.field752 > this.field758 && arg2 > 0) {
                    int var11 = (int) (this.field752 - this.field758) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field758++;
                    }
                }
                long var12 = -1L;
                long var14 = -1L;
                if (this.field752 >= var4 && this.field752 < (long) var7 + var4) {
                    var12 = this.field752;
                } else if (var4 >= this.field752 && var4 < this.field752 + (long) this.field753) {
                    var12 = var4;
                }
                if (this.field752 + (long) this.field753 > var4 && this.field752 + (long) this.field753 <= (long) var7 + var4) {
                    var14 = this.field752 + (long) this.field753;
                } else if ((long) var7 + var4 > this.field752 && (long) var7 + var4 <= this.field752 + (long) this.field753) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field751, (int) (var12 - this.field752), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field758) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field758));
                        this.field758 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field755 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("ao.h(I)V")
    public void method585() throws IOException {
        this.field750 = 0;
        if (this.field758 != this.field755) {
            this.field762.method559(this.field758);
            this.field755 = this.field758;
        }
        this.field749 = this.field758;
        while (this.field750 < this.field748.length) {
            int var1 = this.field762.method550(this.field748, this.field750, this.field748.length - this.field750);
            if (var1 == -1) {
                break;
            }
            this.field755 += (long) var1;
            this.field750 += var1;
        }
    }

    @ObfuscatedName("ao.j([BIIB)V")
    public void method573(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field758 + (long) arg2 > this.field756) {
                this.field756 = this.field758 + (long) arg2;
            }
            if (this.field752 != -1L && (this.field758 < this.field752 || this.field758 > this.field752 + (long) this.field753)) {
                this.method574();
            }
            if (this.field752 != -1L && this.field758 + (long) arg2 > this.field752 + (long) this.field751.length) {
                int var4 = (int) ((long) this.field751.length - (this.field758 - this.field752));
                System.arraycopy(arg0, arg1, this.field751, (int) (this.field758 - this.field752), var4);
                this.field758 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field753 = this.field751.length;
                this.method574();
            }
            if (arg2 > this.field751.length) {
                if (this.field758 != this.field755) {
                    this.field762.method559(this.field758);
                    this.field755 = this.field758;
                }
                this.field762.method545(arg0, arg1, arg2);
                this.field755 += (long) arg2;
                if (this.field755 > this.field754) {
                    this.field754 = this.field755;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field758 >= this.field749 && this.field758 < this.field749 + (long) this.field750) {
                    var5 = this.field758;
                } else if (this.field749 >= this.field758 && this.field749 < this.field758 + (long) arg2) {
                    var5 = this.field749;
                }
                if (this.field758 + (long) arg2 > this.field749 && this.field758 + (long) arg2 <= this.field749 + (long) this.field750) {
                    var7 = this.field758 + (long) arg2;
                } else if (this.field749 + (long) this.field750 > this.field758 && this.field749 + (long) this.field750 <= this.field758 + (long) arg2) {
                    var7 = this.field749 + (long) this.field750;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field758), this.field748, (int) (var5 - this.field749), var9);
                }
                this.field758 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field752 == -1L) {
                    this.field752 = this.field758;
                }
                System.arraycopy(arg0, arg1, this.field751, (int) (this.field758 - this.field752), arg2);
                this.field758 += (long) arg2;
                if (this.field758 - this.field752 > (long) this.field753) {
                    this.field753 = (int) (this.field758 - this.field752);
                }
            }
        } catch (IOException var11) {
            this.field755 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("ao.f(I)V")
    public void method574() throws IOException {
        if (this.field752 == -1L) {
            return;
        }
        if (this.field755 != this.field752) {
            this.field762.method559(this.field752);
            this.field755 = this.field752;
        }
        this.field762.method545(this.field751, 0, this.field753);
        this.field755 += (long) (this.field753 * 19159839) * 1152868575L;
        if (this.field755 > this.field754) {
            this.field754 = this.field755;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field752 >= this.field749 && this.field752 < this.field749 + (long) this.field750) {
            var1 = this.field752;
        } else if (this.field749 >= this.field752 && this.field749 < this.field752 + (long) this.field753) {
            var1 = this.field749;
        }
        if (this.field752 + (long) this.field753 > this.field749 && this.field752 + (long) this.field753 <= this.field749 + (long) this.field750) {
            var3 = this.field752 + (long) this.field753;
        } else if (this.field749 + (long) this.field750 > this.field752 && this.field749 + (long) this.field750 <= this.field752 + (long) this.field753) {
            var3 = this.field749 + (long) this.field750;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field751, (int) (var1 - this.field752), this.field748, (int) (var1 - this.field749), var5);
        }
        this.field752 = -1L;
        this.field753 = 0;
    }
}
