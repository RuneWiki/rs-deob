package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("tm")
public class class515 {

    @ObfuscatedName("tm.aw")
    public class514 field5101;

    @ObfuscatedName("tm.al")
    public byte[] field5104;

    @ObfuscatedName("tm.ai")
    public long field5103 = -1L;

    @ObfuscatedName("tm.ar")
    public int field5105;

    @ObfuscatedName("tm.as")
    public byte[] field5106;

    @ObfuscatedName("tm.aa")
    public long field5107 = -1L;

    @ObfuscatedName("tm.az")
    public int field5109 = 0;

    @ObfuscatedName("tm.ao")
    public long field5102;

    @ObfuscatedName("tm.au")
    public long field5110;

    @ObfuscatedName("tm.ak")
    public long field5111;

    @ObfuscatedName("tm.ah")
    public long field5112;

    public class515(class514 arg0, int arg1, int arg2) throws IOException {
        this.field5101 = arg0;
        this.field5111 = this.field5110 = arg0.method8362();
        this.field5104 = new byte[arg1];
        this.field5106 = new byte[arg2];
        this.field5102 = 0L;
    }

    @ObfuscatedName("tm.aq(I)V")
    public void method8384() throws IOException {
        this.method8391();
        this.field5101.method8360();
    }

    @ObfuscatedName("tm.aw(J)V")
    public void method8385(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field5102 = arg0;
    }

    @ObfuscatedName("tm.al(I)J")
    public long method8386() {
        return this.field5111;
    }

    @ObfuscatedName("tm.ai([BI)V")
    public void method8394(byte[] arg0) throws IOException {
        this.method8408(arg0, 0, arg0.length);
    }

    @ObfuscatedName("tm.ar([BIII)V")
    public void method8408(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field5107 != -1L && this.field5102 >= this.field5107 && this.field5102 + (long) arg2 <= this.field5107 + (long) this.field5109) {
                System.arraycopy(this.field5106, (int) (this.field5102 - this.field5107), arg0, arg1, arg2);
                this.field5102 += (long) arg2;
                return;
            }
            long var4 = this.field5102;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field5102 >= this.field5103 && this.field5102 < this.field5103 + (long) this.field5105) {
                int var8 = (int) ((long) this.field5105 - (this.field5102 - this.field5103));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field5104, (int) (this.field5102 - this.field5103), arg0, arg1, var8);
                this.field5102 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field5104.length) {
                this.field5101.method8358(this.field5102);
                this.field5112 = this.field5102;
                while (arg2 > 0) {
                    int var9 = this.field5101.method8363(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field5112 += (long) var9;
                    this.field5102 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method8389();
                int var10 = arg2;
                if (arg2 > this.field5105) {
                    var10 = this.field5105;
                }
                System.arraycopy(this.field5104, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field5102 += (long) var10;
            }
            if (this.field5107 != -1L) {
                if (this.field5107 > this.field5102 && arg2 > 0) {
                    int var11 = (int) (this.field5107 - this.field5102) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field5102++;
                    }
                }
                long var12 = -1L;
                long var14 = -1L;
                if (this.field5107 >= var4 && this.field5107 < (long) var7 + var4) {
                    var12 = this.field5107;
                } else if (var4 >= this.field5107 && var4 < this.field5107 + (long) this.field5109) {
                    var12 = var4;
                }
                if (this.field5107 + (long) this.field5109 > var4 && this.field5107 + (long) this.field5109 <= (long) var7 + var4) {
                    var14 = this.field5107 + (long) this.field5109;
                } else if ((long) var7 + var4 > this.field5107 && (long) var7 + var4 <= this.field5107 + (long) this.field5109) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field5106, (int) (var12 - this.field5107), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field5102) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field5102));
                        this.field5102 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field5112 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("tm.as(I)V")
    public void method8389() throws IOException {
        this.field5105 = 0;
        if (this.field5112 != this.field5102) {
            this.field5101.method8358(this.field5102);
            this.field5112 = this.field5102;
        }
        this.field5103 = this.field5102;
        while (this.field5105 < this.field5104.length) {
            int var1 = this.field5104.length - this.field5105;
            if (var1 > 200000000) {
                var1 = 200000000;
            }
            int var2 = this.field5101.method8363(this.field5104, this.field5105, var1);
            if (var2 == -1) {
                break;
            }
            this.field5112 += (long) var2;
            this.field5105 += var2;
        }
    }

    @ObfuscatedName("tm.aa([BIII)V")
    public void method8407(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field5102 + (long) arg2 > this.field5111) {
                this.field5111 = this.field5102 + (long) arg2;
            }
            if (this.field5107 != -1L && (this.field5102 < this.field5107 || this.field5102 > this.field5107 + (long) this.field5109)) {
                this.method8391();
            }
            if (this.field5107 != -1L && this.field5102 + (long) arg2 > this.field5107 + (long) this.field5106.length) {
                int var4 = (int) ((long) this.field5106.length - (this.field5102 - this.field5107));
                System.arraycopy(arg0, arg1, this.field5106, (int) (this.field5102 - this.field5107), var4);
                this.field5102 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field5109 = this.field5106.length;
                this.method8391();
            }
            if (arg2 > this.field5106.length) {
                if (this.field5112 != this.field5102) {
                    this.field5101.method8358(this.field5102);
                    this.field5112 = this.field5102;
                }
                this.field5101.method8359(arg0, arg1, arg2);
                this.field5112 += (long) arg2;
                if (this.field5112 > this.field5110) {
                    this.field5110 = this.field5112;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field5102 >= this.field5103 && this.field5102 < this.field5103 + (long) this.field5105) {
                    var5 = this.field5102;
                } else if (this.field5103 >= this.field5102 && this.field5103 < this.field5102 + (long) arg2) {
                    var5 = this.field5103;
                }
                if (this.field5102 + (long) arg2 > this.field5103 && this.field5102 + (long) arg2 <= this.field5103 + (long) this.field5105) {
                    var7 = this.field5102 + (long) arg2;
                } else if (this.field5103 + (long) this.field5105 > this.field5102 && this.field5103 + (long) this.field5105 <= this.field5102 + (long) arg2) {
                    var7 = this.field5103 + (long) this.field5105;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field5102), this.field5104, (int) (var5 - this.field5103), var9);
                }
                this.field5102 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field5107 == -1L) {
                    this.field5107 = this.field5102;
                }
                System.arraycopy(arg0, arg1, this.field5106, (int) (this.field5102 - this.field5107), arg2);
                this.field5102 += (long) arg2;
                if (this.field5102 - this.field5107 > (long) this.field5109) {
                    this.field5109 = (int) (this.field5102 - this.field5107);
                }
            }
        } catch (IOException var11) {
            this.field5112 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("tm.az(I)V")
    public void method8391() throws IOException {
        if (this.field5107 == -1L) {
            return;
        }
        if (this.field5112 != this.field5107) {
            this.field5101.method8358(this.field5107);
            this.field5112 = this.field5107;
        }
        this.field5101.method8359(this.field5106, 0, this.field5109);
        this.field5112 += (long) (this.field5109 * 397066783) * -772261409L;
        if (this.field5112 > this.field5110) {
            this.field5110 = this.field5112;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field5107 >= this.field5103 && this.field5107 < this.field5103 + (long) this.field5105) {
            var1 = this.field5107;
        } else if (this.field5103 >= this.field5107 && this.field5103 < this.field5107 + (long) this.field5109) {
            var1 = this.field5103;
        }
        if (this.field5107 + (long) this.field5109 > this.field5103 && this.field5107 + (long) this.field5109 <= this.field5103 + (long) this.field5105) {
            var3 = this.field5107 + (long) this.field5109;
        } else if (this.field5103 + (long) this.field5105 > this.field5107 && this.field5103 + (long) this.field5105 <= this.field5107 + (long) this.field5109) {
            var3 = this.field5103 + (long) this.field5105;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field5106, (int) (var1 - this.field5107), this.field5104, (int) (var1 - this.field5103), var5);
        }
        this.field5107 = -1L;
        this.field5109 = 0;
    }
}
