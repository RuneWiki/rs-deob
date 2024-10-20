package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("bj")
public class class73 {

    @ObfuscatedName("bj.b")
    public class74 field1198;

    @ObfuscatedName("bj.e")
    public byte[] field1188;

    @ObfuscatedName("bj.c")
    public long field1189 = -1L;

    @ObfuscatedName("bj.l")
    public int field1190;

    @ObfuscatedName("bj.y")
    public byte[] field1191;

    @ObfuscatedName("bj.j")
    public long field1192 = -1L;

    @ObfuscatedName("bj.g")
    public int field1193 = 0;

    @ObfuscatedName("bj.s")
    public long field1194;

    @ObfuscatedName("bj.r")
    public long field1195;

    @ObfuscatedName("bj.t")
    public long field1196;

    @ObfuscatedName("bj.k")
    public long field1197;

    public class73(class74 arg0, int arg1, int arg2) throws IOException {
        this.field1198 = arg0;
        this.field1196 = this.field1195 = arg0.method1362();
        this.field1188 = new byte[arg1];
        this.field1191 = new byte[arg2];
        this.field1194 = 0L;
    }

    @ObfuscatedName("bj.b(I)V")
    public void method1325() throws IOException {
        this.method1333();
        this.field1198.method1356();
    }

    @ObfuscatedName("bj.e(J)V")
    public void method1351(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field1194 = arg0;
    }

    @ObfuscatedName("bj.c(B)J")
    public long method1335() {
        return this.field1196;
    }

    @ObfuscatedName("bj.l([BI)V")
    public void method1329(byte[] arg0) throws IOException {
        this.method1330(arg0, 0, arg0.length);
    }

    @ObfuscatedName("bj.y([BIIB)V")
    public void method1330(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field1192 != -1L && this.field1194 >= this.field1192 && this.field1194 + (long) arg2 <= this.field1192 + (long) this.field1193) {
                System.arraycopy(this.field1191, (int) (this.field1194 - this.field1192), arg0, arg1, arg2);
                this.field1194 += (long) arg2;
                return;
            }
            long var4 = this.field1194;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field1194 >= this.field1189 && this.field1194 < this.field1189 + (long) this.field1190) {
                int var8 = (int) ((long) this.field1190 - (this.field1194 - this.field1189));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field1188, (int) (this.field1194 - this.field1189), arg0, arg1, var8);
                this.field1194 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field1188.length) {
                this.field1198.method1354(this.field1194);
                this.field1197 = this.field1194;
                while (arg2 > 0) {
                    int var9 = this.field1198.method1375(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field1197 += (long) var9;
                    this.field1194 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method1331();
                int var10 = arg2;
                if (arg2 > this.field1190) {
                    var10 = this.field1190;
                }
                System.arraycopy(this.field1188, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field1194 += (long) var10;
            }
            if (this.field1192 != -1L) {
                if (this.field1192 > this.field1194 && arg2 > 0) {
                    int var11 = (int) (this.field1192 - this.field1194) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field1194++;
                    }
                }
                long var12 = -1L;
                long var14 = -1L;
                if (this.field1192 >= var4 && this.field1192 < (long) var7 + var4) {
                    var12 = this.field1192;
                } else if (var4 >= this.field1192 && var4 < this.field1192 + (long) this.field1193) {
                    var12 = var4;
                }
                if (this.field1192 + (long) this.field1193 > var4 && this.field1192 + (long) this.field1193 <= (long) var7 + var4) {
                    var14 = this.field1192 + (long) this.field1193;
                } else if ((long) var7 + var4 > this.field1192 && (long) var7 + var4 <= this.field1192 + (long) this.field1193) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field1191, (int) (var12 - this.field1192), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field1194) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field1194));
                        this.field1194 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field1197 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("bj.j(B)V")
    public void method1331() throws IOException {
        this.field1190 = 0;
        if (this.field1197 != this.field1194) {
            this.field1198.method1354(this.field1194);
            this.field1197 = this.field1194;
        }
        this.field1189 = this.field1194;
        while (this.field1190 < this.field1188.length) {
            int var1 = this.field1198.method1375(this.field1188, this.field1190, this.field1188.length - this.field1190);
            if (var1 == -1) {
                break;
            }
            this.field1197 += (long) var1;
            this.field1190 += var1;
        }
    }

    @ObfuscatedName("bj.t([BIII)V")
    public void method1345(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field1194 + (long) arg2 > this.field1196) {
                this.field1196 = this.field1194 + (long) arg2;
            }
            if (this.field1192 != -1L && (this.field1194 < this.field1192 || this.field1194 > this.field1192 + (long) this.field1193)) {
                this.method1333();
            }
            if (this.field1192 != -1L && this.field1194 + (long) arg2 > this.field1192 + (long) this.field1191.length) {
                int var4 = (int) ((long) this.field1191.length - (this.field1194 - this.field1192));
                System.arraycopy(arg0, arg1, this.field1191, (int) (this.field1194 - this.field1192), var4);
                this.field1194 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field1193 = this.field1191.length;
                this.method1333();
            }
            if (arg2 > this.field1191.length) {
                if (this.field1197 != this.field1194) {
                    this.field1198.method1354(this.field1194);
                    this.field1197 = this.field1194;
                }
                this.field1198.method1368(arg0, arg1, arg2);
                this.field1197 += (long) arg2;
                if (this.field1197 > this.field1195) {
                    this.field1195 = this.field1197;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field1194 >= this.field1189 && this.field1194 < this.field1189 + (long) this.field1190) {
                    var5 = this.field1194;
                } else if (this.field1189 >= this.field1194 && this.field1189 < this.field1194 + (long) arg2) {
                    var5 = this.field1189;
                }
                if (this.field1194 + (long) arg2 > this.field1189 && this.field1194 + (long) arg2 <= this.field1189 + (long) this.field1190) {
                    var7 = this.field1194 + (long) arg2;
                } else if (this.field1189 + (long) this.field1190 > this.field1194 && this.field1189 + (long) this.field1190 <= this.field1194 + (long) arg2) {
                    var7 = this.field1189 + (long) this.field1190;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field1194), this.field1188, (int) (var5 - this.field1189), var9);
                }
                this.field1194 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field1192 == -1L) {
                    this.field1192 = this.field1194;
                }
                System.arraycopy(arg0, arg1, this.field1191, (int) (this.field1194 - this.field1192), arg2);
                this.field1194 += (long) arg2;
                if (this.field1194 - this.field1192 > (long) this.field1193) {
                    this.field1193 = (int) (this.field1194 - this.field1192);
                }
            }
        } catch (IOException var11) {
            this.field1197 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("bj.k(I)V")
    public void method1333() throws IOException {
        if (this.field1192 == -1L) {
            return;
        }
        if (this.field1197 != this.field1192) {
            this.field1198.method1354(this.field1192);
            this.field1197 = this.field1192;
        }
        this.field1198.method1368(this.field1191, 0, this.field1193);
        this.field1197 += (long) (this.field1193 * -1666128263) * 1648141257L;
        if (this.field1197 > this.field1195) {
            this.field1195 = this.field1197;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field1192 >= this.field1189 && this.field1192 < this.field1189 + (long) this.field1190) {
            var1 = this.field1192;
        } else if (this.field1189 >= this.field1192 && this.field1189 < this.field1192 + (long) this.field1193) {
            var1 = this.field1189;
        }
        if (this.field1192 + (long) this.field1193 > this.field1189 && this.field1192 + (long) this.field1193 <= this.field1189 + (long) this.field1190) {
            var3 = this.field1192 + (long) this.field1193;
        } else if (this.field1189 + (long) this.field1190 > this.field1192 && this.field1189 + (long) this.field1190 <= this.field1192 + (long) this.field1193) {
            var3 = this.field1189 + (long) this.field1190;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field1191, (int) (var1 - this.field1192), this.field1188, (int) (var1 - this.field1189), var5);
        }
        this.field1192 = -1L;
        this.field1193 = 0;
    }
}
