package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("bh")
public class class73 {

    @ObfuscatedName("bh.u")
    public class74 field1171;

    @ObfuscatedName("bh.x")
    public byte[] field1170;

    @ObfuscatedName("bh.i")
    public long field1180 = -1L;

    @ObfuscatedName("bh.a")
    public int field1172;

    @ObfuscatedName("bh.f")
    public byte[] field1173;

    @ObfuscatedName("bh.c")
    public long field1174 = -1L;

    @ObfuscatedName("bh.d")
    public int field1175 = 0;

    @ObfuscatedName("bh.l")
    public long field1183;

    @ObfuscatedName("bh.g")
    public long field1177;

    @ObfuscatedName("bh.z")
    public long field1178;

    @ObfuscatedName("bh.t")
    public long field1179;

    public class73(class74 arg0, int arg1, int arg2) throws IOException {
        this.field1171 = arg0;
        this.field1178 = this.field1177 = arg0.method1297();
        this.field1170 = new byte[arg1];
        this.field1173 = new byte[arg2];
        this.field1183 = 0L;
    }

    @ObfuscatedName("bh.u(I)V")
    public void method1264() throws IOException {
        this.method1288();
        this.field1171.method1295();
    }

    @ObfuscatedName("bh.x(J)V")
    public void method1265(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field1183 = arg0;
    }

    @ObfuscatedName("bh.i(I)J")
    public long method1271() {
        return this.field1178;
    }

    @ObfuscatedName("bh.a([BI)V")
    public void method1267(byte[] arg0) throws IOException {
        this.method1268(arg0, 0, arg0.length);
    }

    @ObfuscatedName("bh.c([BIIB)V")
    public void method1268(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field1174 != -1L && this.field1183 >= this.field1174 && this.field1183 + (long) arg2 <= this.field1174 + (long) this.field1175) {
                System.arraycopy(this.field1173, (int) (this.field1183 - this.field1174), arg0, arg1, arg2);
                this.field1183 += (long) arg2;
                return;
            }
            long var4 = this.field1183;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field1183 >= this.field1180 && this.field1183 < this.field1180 + (long) this.field1172) {
                int var8 = (int) ((long) this.field1172 - (this.field1183 - this.field1180));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field1170, (int) (this.field1183 - this.field1180), arg0, arg1, var8);
                this.field1183 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field1170.length) {
                this.field1171.method1299(this.field1183);
                this.field1179 = this.field1183;
                while (arg2 > 0) {
                    int var9 = this.field1171.method1298(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field1179 += (long) var9;
                    this.field1183 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method1269();
                int var10 = arg2;
                if (arg2 > this.field1172) {
                    var10 = this.field1172;
                }
                System.arraycopy(this.field1170, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field1183 += (long) var10;
            }
            if (this.field1174 != -1L) {
                if (this.field1174 > this.field1183 && arg2 > 0) {
                    int var11 = (int) (this.field1174 - this.field1183) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field1183++;
                    }
                }
                long var12 = -1L;
                long var14 = -1L;
                if (this.field1174 >= var4 && this.field1174 < (long) var7 + var4) {
                    var12 = this.field1174;
                } else if (var4 >= this.field1174 && var4 < this.field1174 + (long) this.field1175) {
                    var12 = var4;
                }
                if (this.field1174 + (long) this.field1175 > var4 && this.field1174 + (long) this.field1175 <= (long) var7 + var4) {
                    var14 = this.field1174 + (long) this.field1175;
                } else if ((long) var7 + var4 > this.field1174 && (long) var7 + var4 <= this.field1174 + (long) this.field1175) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field1173, (int) (var12 - this.field1174), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field1183) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field1183));
                        this.field1183 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field1179 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("bh.g(B)V")
    public void method1269() throws IOException {
        this.field1172 = 0;
        if (this.field1183 != this.field1179) {
            this.field1171.method1299(this.field1183);
            this.field1179 = this.field1183;
        }
        this.field1180 = this.field1183;
        while (this.field1172 < this.field1170.length) {
            int var1 = this.field1171.method1298(this.field1170, this.field1172, this.field1170.length - this.field1172);
            if (var1 == -1) {
                break;
            }
            this.field1179 += (long) var1;
            this.field1172 += var1;
        }
    }

    @ObfuscatedName("bh.z([BIII)V")
    public void method1290(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field1183 + (long) arg2 > this.field1178) {
                this.field1178 = this.field1183 + (long) arg2;
            }
            if (this.field1174 != -1L && (this.field1183 < this.field1174 || this.field1183 > this.field1174 + (long) this.field1175)) {
                this.method1288();
            }
            if (this.field1174 != -1L && this.field1183 + (long) arg2 > this.field1174 + (long) this.field1173.length) {
                int var4 = (int) ((long) this.field1173.length - (this.field1183 - this.field1174));
                System.arraycopy(arg0, arg1, this.field1173, (int) (this.field1183 - this.field1174), var4);
                this.field1183 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field1175 = this.field1173.length;
                this.method1288();
            }
            if (arg2 > this.field1173.length) {
                if (this.field1183 != this.field1179) {
                    this.field1171.method1299(this.field1183);
                    this.field1179 = this.field1183;
                }
                this.field1171.method1305(arg0, arg1, arg2);
                this.field1179 += (long) arg2;
                if (this.field1179 > this.field1177) {
                    this.field1177 = this.field1179;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field1183 >= this.field1180 && this.field1183 < this.field1180 + (long) this.field1172) {
                    var5 = this.field1183;
                } else if (this.field1180 >= this.field1183 && this.field1180 < this.field1183 + (long) arg2) {
                    var5 = this.field1180;
                }
                if (this.field1183 + (long) arg2 > this.field1180 && this.field1183 + (long) arg2 <= this.field1180 + (long) this.field1172) {
                    var7 = this.field1183 + (long) arg2;
                } else if (this.field1180 + (long) this.field1172 > this.field1183 && this.field1180 + (long) this.field1172 <= this.field1183 + (long) arg2) {
                    var7 = this.field1180 + (long) this.field1172;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field1183), this.field1170, (int) (var5 - this.field1180), var9);
                }
                this.field1183 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field1174 == -1L) {
                    this.field1174 = this.field1183;
                }
                System.arraycopy(arg0, arg1, this.field1173, (int) (this.field1183 - this.field1174), arg2);
                this.field1183 += (long) arg2;
                if (this.field1183 - this.field1174 > (long) this.field1175) {
                    this.field1175 = (int) (this.field1183 - this.field1174);
                }
            }
        } catch (IOException var11) {
            this.field1179 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("bh.t(I)V")
    public void method1288() throws IOException {
        if (this.field1174 == -1L) {
            return;
        }
        if (this.field1179 != this.field1174) {
            this.field1171.method1299(this.field1174);
            this.field1179 = this.field1174;
        }
        this.field1171.method1305(this.field1173, 0, this.field1175);
        this.field1179 += (long) (this.field1175 * 309986917) * -1104528531L;
        if (this.field1179 > this.field1177) {
            this.field1177 = this.field1179;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field1174 >= this.field1180 && this.field1174 < this.field1180 + (long) this.field1172) {
            var1 = this.field1174;
        } else if (this.field1180 >= this.field1174 && this.field1180 < this.field1174 + (long) this.field1175) {
            var1 = this.field1180;
        }
        if (this.field1174 + (long) this.field1175 > this.field1180 && this.field1174 + (long) this.field1175 <= this.field1180 + (long) this.field1172) {
            var3 = this.field1174 + (long) this.field1175;
        } else if (this.field1180 + (long) this.field1172 > this.field1174 && this.field1180 + (long) this.field1172 <= this.field1174 + (long) this.field1175) {
            var3 = this.field1180 + (long) this.field1172;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field1173, (int) (var1 - this.field1174), this.field1170, (int) (var1 - this.field1180), var5);
        }
        this.field1174 = -1L;
        this.field1175 = 0;
    }
}
