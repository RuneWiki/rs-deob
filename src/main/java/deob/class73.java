package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("bc")
public class class73 {

    @ObfuscatedName("bc.i")
    public class74 field1182;

    @ObfuscatedName("bc.e")
    public byte[] field1184;

    @ObfuscatedName("bc.f")
    public long field1183 = -1L;

    @ObfuscatedName("bc.k")
    public int field1186;

    @ObfuscatedName("bc.g")
    public byte[] field1185;

    @ObfuscatedName("bc.n")
    public long field1181 = -1L;

    @ObfuscatedName("bc.a")
    public int field1187 = 0;

    @ObfuscatedName("bc.q")
    public long field1188;

    @ObfuscatedName("bc.w")
    public long field1189;

    @ObfuscatedName("bc.v")
    public long field1190;

    @ObfuscatedName("bc.h")
    public long field1191;

    public class73(class74 arg0, int arg1, int arg2) throws IOException {
        this.field1182 = arg0;
        this.field1190 = this.field1189 = arg0.method1312();
        this.field1184 = new byte[arg1];
        this.field1185 = new byte[arg2];
        this.field1188 = 0L;
    }

    @ObfuscatedName("bc.i(I)V")
    public void method1279() throws IOException {
        this.method1286();
        this.field1182.method1311();
    }

    @ObfuscatedName("bc.e(J)V")
    public void method1278(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field1188 = arg0;
    }

    @ObfuscatedName("bc.f(I)J")
    public long method1281() {
        return this.field1190;
    }

    @ObfuscatedName("bc.k([BI)V")
    public void method1282(byte[] arg0) throws IOException {
        this.method1283(arg0, 0, arg0.length);
    }

    @ObfuscatedName("bc.a([BIII)V")
    public void method1283(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field1181 != -1L && this.field1188 >= this.field1181 && this.field1188 + (long) arg2 <= this.field1181 + (long) this.field1187) {
                System.arraycopy(this.field1185, (int) (this.field1188 - this.field1181), arg0, arg1, arg2);
                this.field1188 += (long) arg2;
                return;
            }
            long var4 = this.field1188;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field1188 >= this.field1183 && this.field1188 < this.field1183 + (long) this.field1186) {
                int var8 = (int) ((long) this.field1186 - (this.field1188 - this.field1183));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field1184, (int) (this.field1188 - this.field1183), arg0, arg1, var8);
                this.field1188 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field1184.length) {
                this.field1182.method1313(this.field1188);
                this.field1191 = this.field1188;
                while (arg2 > 0) {
                    int var9 = this.field1182.method1314(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field1191 += (long) var9;
                    this.field1188 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method1284();
                int var10 = arg2;
                if (arg2 > this.field1186) {
                    var10 = this.field1186;
                }
                System.arraycopy(this.field1184, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field1188 += (long) var10;
            }
            if (this.field1181 != -1L) {
                if (this.field1181 > this.field1188 && arg2 > 0) {
                    int var11 = (int) (this.field1181 - this.field1188) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field1188++;
                    }
                }
                long var12 = -1L;
                long var14 = -1L;
                if (this.field1181 >= var4 && this.field1181 < (long) var7 + var4) {
                    var12 = this.field1181;
                } else if (var4 >= this.field1181 && var4 < this.field1181 + (long) this.field1187) {
                    var12 = var4;
                }
                if (this.field1181 + (long) this.field1187 > var4 && this.field1181 + (long) this.field1187 <= (long) var7 + var4) {
                    var14 = this.field1181 + (long) this.field1187;
                } else if ((long) var7 + var4 > this.field1181 && (long) var7 + var4 <= this.field1181 + (long) this.field1187) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field1185, (int) (var12 - this.field1181), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field1188) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field1188));
                        this.field1188 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field1191 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("bc.q(I)V")
    public void method1284() throws IOException {
        this.field1186 = 0;
        if (this.field1191 != this.field1188) {
            this.field1182.method1313(this.field1188);
            this.field1191 = this.field1188;
        }
        this.field1183 = this.field1188;
        while (this.field1186 < this.field1184.length) {
            int var1 = this.field1182.method1314(this.field1184, this.field1186, this.field1184.length - this.field1186);
            if (var1 == -1) {
                break;
            }
            this.field1191 += (long) var1;
            this.field1186 += var1;
        }
    }

    @ObfuscatedName("bc.w([BIII)V")
    public void method1288(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field1188 + (long) arg2 > this.field1190) {
                this.field1190 = this.field1188 + (long) arg2;
            }
            if (this.field1181 != -1L && (this.field1188 < this.field1181 || this.field1188 > this.field1181 + (long) this.field1187)) {
                this.method1286();
            }
            if (this.field1181 != -1L && this.field1188 + (long) arg2 > this.field1181 + (long) this.field1185.length) {
                int var4 = (int) ((long) this.field1185.length - (this.field1188 - this.field1181));
                System.arraycopy(arg0, arg1, this.field1185, (int) (this.field1188 - this.field1181), var4);
                this.field1188 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field1187 = this.field1185.length;
                this.method1286();
            }
            if (arg2 > this.field1185.length) {
                if (this.field1191 != this.field1188) {
                    this.field1182.method1313(this.field1188);
                    this.field1191 = this.field1188;
                }
                this.field1182.method1310(arg0, arg1, arg2);
                this.field1191 += (long) arg2;
                if (this.field1191 > this.field1189) {
                    this.field1189 = this.field1191;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field1188 >= this.field1183 && this.field1188 < this.field1183 + (long) this.field1186) {
                    var5 = this.field1188;
                } else if (this.field1183 >= this.field1188 && this.field1183 < this.field1188 + (long) arg2) {
                    var5 = this.field1183;
                }
                if (this.field1188 + (long) arg2 > this.field1183 && this.field1188 + (long) arg2 <= this.field1183 + (long) this.field1186) {
                    var7 = this.field1188 + (long) arg2;
                } else if (this.field1183 + (long) this.field1186 > this.field1188 && this.field1183 + (long) this.field1186 <= this.field1188 + (long) arg2) {
                    var7 = this.field1183 + (long) this.field1186;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field1188), this.field1184, (int) (var5 - this.field1183), var9);
                }
                this.field1188 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field1181 == -1L) {
                    this.field1181 = this.field1188;
                }
                System.arraycopy(arg0, arg1, this.field1185, (int) (this.field1188 - this.field1181), arg2);
                this.field1188 += (long) arg2;
                if (this.field1188 - this.field1181 > (long) this.field1187) {
                    this.field1187 = (int) (this.field1188 - this.field1181);
                }
            }
        } catch (IOException var11) {
            this.field1191 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("bc.v(I)V")
    public void method1286() throws IOException {
        if (this.field1181 == -1L) {
            return;
        }
        if (this.field1191 != this.field1181) {
            this.field1182.method1313(this.field1181);
            this.field1191 = this.field1181;
        }
        this.field1182.method1310(this.field1185, 0, this.field1187);
        this.field1191 += (long) (this.field1187 * 555152117) * 1399761245L;
        if (this.field1191 > this.field1189) {
            this.field1189 = this.field1191;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field1181 >= this.field1183 && this.field1181 < this.field1183 + (long) this.field1186) {
            var1 = this.field1181;
        } else if (this.field1183 >= this.field1181 && this.field1183 < this.field1181 + (long) this.field1187) {
            var1 = this.field1183;
        }
        if (this.field1181 + (long) this.field1187 > this.field1183 && this.field1181 + (long) this.field1187 <= this.field1183 + (long) this.field1186) {
            var3 = this.field1181 + (long) this.field1187;
        } else if (this.field1183 + (long) this.field1186 > this.field1181 && this.field1183 + (long) this.field1186 <= this.field1181 + (long) this.field1187) {
            var3 = this.field1183 + (long) this.field1186;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field1185, (int) (var1 - this.field1181), this.field1184, (int) (var1 - this.field1183), var5);
        }
        this.field1181 = -1L;
        this.field1187 = 0;
    }
}
