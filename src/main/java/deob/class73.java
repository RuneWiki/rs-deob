package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("be")
public class class73 {

    @ObfuscatedName("be.s")
    public class74 field1180;

    @ObfuscatedName("be.c")
    public byte[] field1176;

    @ObfuscatedName("be.f")
    public long field1177 = -1L;

    @ObfuscatedName("be.h")
    public int field1189;

    @ObfuscatedName("be.a")
    public byte[] field1191;

    @ObfuscatedName("be.g")
    public long field1186 = -1L;

    @ObfuscatedName("be.k")
    public int field1179 = 0;

    @ObfuscatedName("be.u")
    public long field1182;

    @ObfuscatedName("be.b")
    public long field1183;

    @ObfuscatedName("be.x")
    public long field1184;

    @ObfuscatedName("be.r")
    public long field1175;

    public class73(class74 arg0, int arg1, int arg2) throws IOException {
        this.field1180 = arg0;
        this.field1184 = this.field1183 = arg0.method1304();
        this.field1176 = new byte[arg1];
        this.field1191 = new byte[arg2];
        this.field1182 = 0L;
    }

    @ObfuscatedName("be.s(I)V")
    public void method1287() throws IOException {
        this.method1268();
        this.field1180.method1303();
    }

    @ObfuscatedName("be.c(J)V")
    public void method1273(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field1182 = arg0;
    }

    @ObfuscatedName("be.f(I)J")
    public long method1271() {
        return this.field1184;
    }

    @ObfuscatedName("be.g([BI)V")
    public void method1272(byte[] arg0) throws IOException {
        this.method1282(arg0, 0, arg0.length);
    }

    @ObfuscatedName("be.k([BIII)V")
    public void method1282(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field1186 != -1L && this.field1182 >= this.field1186 && this.field1182 + (long) arg2 <= this.field1186 + (long) this.field1179) {
                System.arraycopy(this.field1191, (int) (this.field1182 - this.field1186), arg0, arg1, arg2);
                this.field1182 += (long) arg2;
                return;
            }
            long var4 = this.field1182;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field1182 >= this.field1177 && this.field1182 < this.field1177 + (long) this.field1189) {
                int var8 = (int) ((long) this.field1189 - (this.field1182 - this.field1177));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field1176, (int) (this.field1182 - this.field1177), arg0, arg1, var8);
                this.field1182 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field1176.length) {
                this.field1180.method1302(this.field1182);
                this.field1175 = this.field1182;
                while (arg2 > 0) {
                    int var9 = this.field1180.method1305(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field1175 += (long) var9;
                    this.field1182 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method1274();
                int var10 = arg2;
                if (arg2 > this.field1189) {
                    var10 = this.field1189;
                }
                System.arraycopy(this.field1176, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field1182 += (long) var10;
            }
            if (this.field1186 != -1L) {
                if (this.field1186 > this.field1182 && arg2 > 0) {
                    int var11 = (int) (this.field1186 - this.field1182) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field1182++;
                    }
                }
                long var12 = -1L;
                long var14 = -1L;
                if (this.field1186 >= var4 && this.field1186 < (long) var7 + var4) {
                    var12 = this.field1186;
                } else if (var4 >= this.field1186 && var4 < this.field1186 + (long) this.field1179) {
                    var12 = var4;
                }
                if (this.field1186 + (long) this.field1179 > var4 && this.field1186 + (long) this.field1179 <= (long) var7 + var4) {
                    var14 = this.field1186 + (long) this.field1179;
                } else if ((long) var7 + var4 > this.field1186 && (long) var7 + var4 <= this.field1186 + (long) this.field1179) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field1191, (int) (var12 - this.field1186), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field1182) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field1182));
                        this.field1182 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field1175 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("be.u(I)V")
    public void method1274() throws IOException {
        this.field1189 = 0;
        if (this.field1182 != this.field1175) {
            this.field1180.method1302(this.field1182);
            this.field1175 = this.field1182;
        }
        this.field1177 = this.field1182;
        while (this.field1189 < this.field1176.length) {
            int var1 = this.field1180.method1305(this.field1176, this.field1189, this.field1176.length - this.field1189);
            if (var1 == -1) {
                break;
            }
            this.field1175 += (long) var1;
            this.field1189 += var1;
        }
    }

    @ObfuscatedName("be.b([BIIB)V")
    public void method1275(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field1182 + (long) arg2 > this.field1184) {
                this.field1184 = this.field1182 + (long) arg2;
            }
            if (this.field1186 != -1L && (this.field1182 < this.field1186 || this.field1182 > this.field1186 + (long) this.field1179)) {
                this.method1268();
            }
            if (this.field1186 != -1L && this.field1182 + (long) arg2 > this.field1186 + (long) this.field1191.length) {
                int var4 = (int) ((long) this.field1191.length - (this.field1182 - this.field1186));
                System.arraycopy(arg0, arg1, this.field1191, (int) (this.field1182 - this.field1186), var4);
                this.field1182 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field1179 = this.field1191.length;
                this.method1268();
            }
            if (arg2 > this.field1191.length) {
                if (this.field1182 != this.field1175) {
                    this.field1180.method1302(this.field1182);
                    this.field1175 = this.field1182;
                }
                this.field1180.method1321(arg0, arg1, arg2);
                this.field1175 += (long) arg2;
                if (this.field1175 > this.field1183) {
                    this.field1183 = this.field1175;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field1182 >= this.field1177 && this.field1182 < this.field1177 + (long) this.field1189) {
                    var5 = this.field1182;
                } else if (this.field1177 >= this.field1182 && this.field1177 < this.field1182 + (long) arg2) {
                    var5 = this.field1177;
                }
                if (this.field1182 + (long) arg2 > this.field1177 && this.field1182 + (long) arg2 <= this.field1177 + (long) this.field1189) {
                    var7 = this.field1182 + (long) arg2;
                } else if (this.field1177 + (long) this.field1189 > this.field1182 && this.field1177 + (long) this.field1189 <= this.field1182 + (long) arg2) {
                    var7 = this.field1177 + (long) this.field1189;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field1182), this.field1176, (int) (var5 - this.field1177), var9);
                }
                this.field1182 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field1186 == -1L) {
                    this.field1186 = this.field1182;
                }
                System.arraycopy(arg0, arg1, this.field1191, (int) (this.field1182 - this.field1186), arg2);
                this.field1182 += (long) arg2;
                if (this.field1182 - this.field1186 > (long) this.field1179) {
                    this.field1179 = (int) (this.field1182 - this.field1186);
                }
            }
        } catch (IOException var11) {
            this.field1175 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("be.x(B)V")
    public void method1268() throws IOException {
        if (this.field1186 == -1L) {
            return;
        }
        if (this.field1186 != this.field1175) {
            this.field1180.method1302(this.field1186);
            this.field1175 = this.field1186;
        }
        this.field1180.method1321(this.field1191, 0, this.field1179);
        this.field1175 += (long) (this.field1179 * -1482357361) * -569476753L;
        if (this.field1175 > this.field1183) {
            this.field1183 = this.field1175;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field1186 >= this.field1177 && this.field1186 < this.field1177 + (long) this.field1189) {
            var1 = this.field1186;
        } else if (this.field1177 >= this.field1186 && this.field1177 < this.field1186 + (long) this.field1179) {
            var1 = this.field1177;
        }
        if (this.field1186 + (long) this.field1179 > this.field1177 && this.field1186 + (long) this.field1179 <= this.field1177 + (long) this.field1189) {
            var3 = this.field1186 + (long) this.field1179;
        } else if (this.field1177 + (long) this.field1189 > this.field1186 && this.field1177 + (long) this.field1189 <= this.field1186 + (long) this.field1179) {
            var3 = this.field1177 + (long) this.field1189;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field1191, (int) (var1 - this.field1186), this.field1176, (int) (var1 - this.field1177), var5);
        }
        this.field1186 = -1L;
        this.field1179 = 0;
    }
}
