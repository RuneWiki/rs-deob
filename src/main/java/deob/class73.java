package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("bg")
public class class73 {

    @ObfuscatedName("bg.d")
    public class74 field1167;

    @ObfuscatedName("bg.c")
    public byte[] field1159;

    @ObfuscatedName("bg.n")
    public long field1161 = -1L;

    @ObfuscatedName("bg.q")
    public int field1169;

    @ObfuscatedName("bg.t")
    public byte[] field1162;

    @ObfuscatedName("bg.p")
    public long field1163 = -1L;

    @ObfuscatedName("bg.u")
    public int field1164 = 0;

    @ObfuscatedName("bg.z")
    public long field1160;

    @ObfuscatedName("bg.l")
    public long field1166;

    @ObfuscatedName("bg.v")
    public long field1158;

    @ObfuscatedName("bg.g")
    public long field1168;

    public class73(class74 arg0, int arg1, int arg2) throws IOException {
        this.field1167 = arg0;
        this.field1158 = this.field1166 = arg0.method1353();
        this.field1159 = new byte[arg1];
        this.field1162 = new byte[arg2];
        this.field1160 = 0L;
    }

    @ObfuscatedName("bg.d(B)V")
    public void method1309() throws IOException {
        this.method1315();
        this.field1167.method1340();
    }

    @ObfuscatedName("bg.c(J)V")
    public void method1310(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field1160 = arg0;
    }

    @ObfuscatedName("bg.n(I)J")
    public long method1311() {
        return this.field1158;
    }

    @ObfuscatedName("bg.q([BI)V")
    public void method1312(byte[] arg0) throws IOException {
        this.method1316(arg0, 0, arg0.length);
    }

    @ObfuscatedName("bg.t([BIII)V")
    public void method1316(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field1163 != -1L && this.field1160 >= this.field1163 && this.field1160 + (long) arg2 <= this.field1163 + (long) this.field1164) {
                System.arraycopy(this.field1162, (int) (this.field1160 - this.field1163), arg0, arg1, arg2);
                this.field1160 += (long) arg2;
                return;
            }
            long var4 = this.field1160;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field1160 >= this.field1161 && this.field1160 < this.field1161 + (long) this.field1169) {
                int var8 = (int) ((long) this.field1169 - (this.field1160 - this.field1161));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field1159, (int) (this.field1160 - this.field1161), arg0, arg1, var8);
                this.field1160 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field1159.length) {
                this.field1167.method1338(this.field1160);
                this.field1168 = this.field1160;
                while (arg2 > 0) {
                    int var9 = this.field1167.method1342(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field1168 += (long) var9;
                    this.field1160 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method1314();
                int var10 = arg2;
                if (arg2 > this.field1169) {
                    var10 = this.field1169;
                }
                System.arraycopy(this.field1159, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field1160 += (long) var10;
            }
            if (this.field1163 != -1L) {
                if (this.field1163 > this.field1160 && arg2 > 0) {
                    int var11 = (int) (this.field1163 - this.field1160) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field1160++;
                    }
                }
                long var12 = -1L;
                long var14 = -1L;
                if (this.field1163 >= var4 && this.field1163 < (long) var7 + var4) {
                    var12 = this.field1163;
                } else if (var4 >= this.field1163 && var4 < this.field1163 + (long) this.field1164) {
                    var12 = var4;
                }
                if (this.field1163 + (long) this.field1164 > var4 && this.field1163 + (long) this.field1164 <= (long) var7 + var4) {
                    var14 = this.field1163 + (long) this.field1164;
                } else if ((long) var7 + var4 > this.field1163 && (long) var7 + var4 <= this.field1163 + (long) this.field1164) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field1162, (int) (var12 - this.field1163), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field1160) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field1160));
                        this.field1160 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field1168 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("bg.p(I)V")
    public void method1314() throws IOException {
        this.field1169 = 0;
        if (this.field1168 != this.field1160) {
            this.field1167.method1338(this.field1160);
            this.field1168 = this.field1160;
        }
        this.field1161 = this.field1160;
        while (this.field1169 < this.field1159.length) {
            int var1 = this.field1167.method1342(this.field1159, this.field1169, this.field1159.length - this.field1169);
            if (var1 == -1) {
                break;
            }
            this.field1168 += (long) var1;
            this.field1169 += var1;
        }
    }

    @ObfuscatedName("bg.u([BIIB)V")
    public void method1330(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field1160 + (long) arg2 > this.field1158) {
                this.field1158 = this.field1160 + (long) arg2;
            }
            if (this.field1163 != -1L && (this.field1160 < this.field1163 || this.field1160 > this.field1163 + (long) this.field1164)) {
                this.method1315();
            }
            if (this.field1163 != -1L && this.field1160 + (long) arg2 > this.field1163 + (long) this.field1162.length) {
                int var4 = (int) ((long) this.field1162.length - (this.field1160 - this.field1163));
                System.arraycopy(arg0, arg1, this.field1162, (int) (this.field1160 - this.field1163), var4);
                this.field1160 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field1164 = this.field1162.length;
                this.method1315();
            }
            if (arg2 > this.field1162.length) {
                if (this.field1168 != this.field1160) {
                    this.field1167.method1338(this.field1160);
                    this.field1168 = this.field1160;
                }
                this.field1167.method1339(arg0, arg1, arg2);
                this.field1168 += (long) arg2;
                if (this.field1168 > this.field1166) {
                    this.field1166 = this.field1168;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field1160 >= this.field1161 && this.field1160 < this.field1161 + (long) this.field1169) {
                    var5 = this.field1160;
                } else if (this.field1161 >= this.field1160 && this.field1161 < this.field1160 + (long) arg2) {
                    var5 = this.field1161;
                }
                if (this.field1160 + (long) arg2 > this.field1161 && this.field1160 + (long) arg2 <= this.field1161 + (long) this.field1169) {
                    var7 = this.field1160 + (long) arg2;
                } else if (this.field1161 + (long) this.field1169 > this.field1160 && this.field1161 + (long) this.field1169 <= this.field1160 + (long) arg2) {
                    var7 = this.field1161 + (long) this.field1169;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field1160), this.field1159, (int) (var5 - this.field1161), var9);
                }
                this.field1160 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field1163 == -1L) {
                    this.field1163 = this.field1160;
                }
                System.arraycopy(arg0, arg1, this.field1162, (int) (this.field1160 - this.field1163), arg2);
                this.field1160 += (long) arg2;
                if (this.field1160 - this.field1163 > (long) this.field1164) {
                    this.field1164 = (int) (this.field1160 - this.field1163);
                }
            }
        } catch (IOException var11) {
            this.field1168 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("bg.w(I)V")
    public void method1315() throws IOException {
        if (this.field1163 == -1L) {
            return;
        }
        if (this.field1168 != this.field1163) {
            this.field1167.method1338(this.field1163);
            this.field1168 = this.field1163;
        }
        this.field1167.method1339(this.field1162, 0, this.field1164);
        this.field1168 += (long) (this.field1164 * -1464270929) * 1607317327L;
        if (this.field1168 > this.field1166) {
            this.field1166 = this.field1168;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field1163 >= this.field1161 && this.field1163 < this.field1161 + (long) this.field1169) {
            var1 = this.field1163;
        } else if (this.field1161 >= this.field1163 && this.field1161 < this.field1163 + (long) this.field1164) {
            var1 = this.field1161;
        }
        if (this.field1163 + (long) this.field1164 > this.field1161 && this.field1163 + (long) this.field1164 <= this.field1161 + (long) this.field1169) {
            var3 = this.field1163 + (long) this.field1164;
        } else if (this.field1161 + (long) this.field1169 > this.field1163 && this.field1161 + (long) this.field1169 <= this.field1163 + (long) this.field1164) {
            var3 = this.field1161 + (long) this.field1169;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field1162, (int) (var1 - this.field1163), this.field1159, (int) (var1 - this.field1161), var5);
        }
        this.field1163 = -1L;
        this.field1164 = 0;
    }
}
