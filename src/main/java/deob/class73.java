package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("bo")
public class class73 {

    @ObfuscatedName("bo.x")
    public class74 field1193;

    @ObfuscatedName("bo.n")
    public byte[] field1207;

    @ObfuscatedName("bo.g")
    public long field1197 = -1L;

    @ObfuscatedName("bo.v")
    public int field1196;

    @ObfuscatedName("bo.y")
    public byte[] field1201;

    @ObfuscatedName("bo.p")
    public long field1205 = -1L;

    @ObfuscatedName("bo.j")
    public int field1198 = 0;

    @ObfuscatedName("bo.m")
    public long field1199;

    @ObfuscatedName("bo.a")
    public long field1200;

    @ObfuscatedName("bo.i")
    public long field1195;

    @ObfuscatedName("bo.s")
    public long field1202;

    public class73(class74 arg0, int arg1, int arg2) throws IOException {
        this.field1193 = arg0;
        this.field1195 = this.field1200 = arg0.method1411();
        this.field1207 = new byte[arg1];
        this.field1201 = new byte[arg2];
        this.field1199 = 0L;
    }

    @ObfuscatedName("bo.x(S)V")
    public void method1385() throws IOException {
        this.method1387();
        this.field1193.method1410();
    }

    @ObfuscatedName("bo.n(J)V")
    public void method1386(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field1199 = arg0;
    }

    @ObfuscatedName("bo.g(B)J")
    public long method1400() {
        return this.field1195;
    }

    @ObfuscatedName("bo.v([BI)V")
    public void method1388(byte[] arg0) throws IOException {
        this.method1384(arg0, 0, arg0.length);
    }

    @ObfuscatedName("bo.y([BIIB)V")
    public void method1384(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field1205 != -1L && this.field1199 >= this.field1205 && this.field1199 + (long) arg2 <= this.field1205 + (long) this.field1198) {
                System.arraycopy(this.field1201, (int) (this.field1199 - this.field1205), arg0, arg1, arg2);
                this.field1199 += (long) arg2;
                return;
            }
            long var4 = this.field1199;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field1199 >= this.field1197 && this.field1199 < this.field1197 + (long) this.field1196) {
                int var8 = (int) ((long) this.field1196 - (this.field1199 - this.field1197));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field1207, (int) (this.field1199 - this.field1197), arg0, arg1, var8);
                this.field1199 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field1207.length) {
                this.field1193.method1408(this.field1199);
                this.field1202 = this.field1199;
                while (arg2 > 0) {
                    int var9 = this.field1193.method1412(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field1202 += (long) var9;
                    this.field1199 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method1395();
                int var10 = arg2;
                if (arg2 > this.field1196) {
                    var10 = this.field1196;
                }
                System.arraycopy(this.field1207, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field1199 += (long) var10;
            }
            if (this.field1205 != -1L) {
                if (this.field1205 > this.field1199 && arg2 > 0) {
                    int var11 = (int) (this.field1205 - this.field1199) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field1199++;
                    }
                }
                long var12 = -1L;
                long var14 = -1L;
                if (this.field1205 >= var4 && this.field1205 < (long) var7 + var4) {
                    var12 = this.field1205;
                } else if (var4 >= this.field1205 && var4 < this.field1205 + (long) this.field1198) {
                    var12 = var4;
                }
                if (this.field1205 + (long) this.field1198 > var4 && this.field1205 + (long) this.field1198 <= (long) var7 + var4) {
                    var14 = this.field1205 + (long) this.field1198;
                } else if ((long) var7 + var4 > this.field1205 && (long) var7 + var4 <= this.field1205 + (long) this.field1198) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field1201, (int) (var12 - this.field1205), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field1199) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field1199));
                        this.field1199 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field1202 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("bo.p(I)V")
    public void method1395() throws IOException {
        this.field1196 = 0;
        if (this.field1202 != this.field1199) {
            this.field1193.method1408(this.field1199);
            this.field1202 = this.field1199;
        }
        this.field1197 = this.field1199;
        while (this.field1196 < this.field1207.length) {
            int var1 = this.field1193.method1412(this.field1207, this.field1196, this.field1207.length - this.field1196);
            if (var1 == -1) {
                break;
            }
            this.field1202 += (long) var1;
            this.field1196 += var1;
        }
    }

    @ObfuscatedName("bo.j([BIII)V")
    public void method1403(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field1199 + (long) arg2 > this.field1195) {
                this.field1195 = this.field1199 + (long) arg2;
            }
            if (this.field1205 != -1L && (this.field1199 < this.field1205 || this.field1199 > this.field1205 + (long) this.field1198)) {
                this.method1387();
            }
            if (this.field1205 != -1L && this.field1199 + (long) arg2 > this.field1205 + (long) this.field1201.length) {
                int var4 = (int) ((long) this.field1201.length - (this.field1199 - this.field1205));
                System.arraycopy(arg0, arg1, this.field1201, (int) (this.field1199 - this.field1205), var4);
                this.field1199 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field1198 = this.field1201.length;
                this.method1387();
            }
            if (arg2 > this.field1201.length) {
                if (this.field1202 != this.field1199) {
                    this.field1193.method1408(this.field1199);
                    this.field1202 = this.field1199;
                }
                this.field1193.method1417(arg0, arg1, arg2);
                this.field1202 += (long) arg2;
                if (this.field1202 > this.field1200) {
                    this.field1200 = this.field1202;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field1199 >= this.field1197 && this.field1199 < this.field1197 + (long) this.field1196) {
                    var5 = this.field1199;
                } else if (this.field1197 >= this.field1199 && this.field1197 < this.field1199 + (long) arg2) {
                    var5 = this.field1197;
                }
                if (this.field1199 + (long) arg2 > this.field1197 && this.field1199 + (long) arg2 <= this.field1197 + (long) this.field1196) {
                    var7 = this.field1199 + (long) arg2;
                } else if (this.field1197 + (long) this.field1196 > this.field1199 && this.field1197 + (long) this.field1196 <= this.field1199 + (long) arg2) {
                    var7 = this.field1197 + (long) this.field1196;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field1199), this.field1207, (int) (var5 - this.field1197), var9);
                }
                this.field1199 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field1205 == -1L) {
                    this.field1205 = this.field1199;
                }
                System.arraycopy(arg0, arg1, this.field1201, (int) (this.field1199 - this.field1205), arg2);
                this.field1199 += (long) arg2;
                if (this.field1199 - this.field1205 > (long) this.field1198) {
                    this.field1198 = (int) (this.field1199 - this.field1205);
                }
            }
        } catch (IOException var11) {
            this.field1202 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("bo.s(B)V")
    public void method1387() throws IOException {
        if (this.field1205 == -1L) {
            return;
        }
        if (this.field1205 != this.field1202) {
            this.field1193.method1408(this.field1205);
            this.field1202 = this.field1205;
        }
        this.field1193.method1417(this.field1201, 0, this.field1198);
        this.field1202 += (long) (this.field1198 * -560144901) * 1417127219L;
        if (this.field1202 > this.field1200) {
            this.field1200 = this.field1202;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field1205 >= this.field1197 && this.field1205 < this.field1197 + (long) this.field1196) {
            var1 = this.field1205;
        } else if (this.field1197 >= this.field1205 && this.field1197 < this.field1205 + (long) this.field1198) {
            var1 = this.field1197;
        }
        if (this.field1205 + (long) this.field1198 > this.field1197 && this.field1205 + (long) this.field1198 <= this.field1197 + (long) this.field1196) {
            var3 = this.field1205 + (long) this.field1198;
        } else if (this.field1197 + (long) this.field1196 > this.field1205 && this.field1197 + (long) this.field1196 <= this.field1205 + (long) this.field1198) {
            var3 = this.field1197 + (long) this.field1196;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field1201, (int) (var1 - this.field1205), this.field1207, (int) (var1 - this.field1197), var5);
        }
        this.field1205 = -1L;
        this.field1198 = 0;
    }
}
