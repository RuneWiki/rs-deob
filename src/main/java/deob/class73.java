package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("by")
public class class73 {

    @ObfuscatedName("by.o")
    public class74 field1182;

    @ObfuscatedName("by.m")
    public byte[] field1180;

    @ObfuscatedName("by.b")
    public long field1192 = -1L;

    @ObfuscatedName("by.g")
    public int field1186;

    @ObfuscatedName("by.h")
    public byte[] field1181;

    @ObfuscatedName("by.v")
    public long field1184 = -1L;

    @ObfuscatedName("by.l")
    public int field1185 = 0;

    @ObfuscatedName("by.c")
    public long field1183;

    @ObfuscatedName("by.u")
    public long field1187;

    @ObfuscatedName("by.k")
    public long field1179;

    @ObfuscatedName("by.z")
    public long field1189;

    public class73(class74 arg0, int arg1, int arg2) throws IOException {
        this.field1182 = arg0;
        this.field1179 = this.field1187 = arg0.method1313();
        this.field1180 = new byte[arg1];
        this.field1181 = new byte[arg2];
        this.field1183 = 0L;
    }

    @ObfuscatedName("by.o(I)V")
    public void method1291() throws IOException {
        this.method1283();
        this.field1182.method1324();
    }

    @ObfuscatedName("by.m(J)V")
    public void method1277(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field1183 = arg0;
    }

    @ObfuscatedName("by.b(I)J")
    public long method1278() {
        return this.field1179;
    }

    @ObfuscatedName("by.g([BI)V")
    public void method1305(byte[] arg0) throws IOException {
        this.method1280(arg0, 0, arg0.length);
    }

    @ObfuscatedName("by.l([BIII)V")
    public void method1280(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field1184 != -1L && this.field1183 >= this.field1184 && this.field1183 + (long) arg2 <= this.field1184 + (long) this.field1185) {
                System.arraycopy(this.field1181, (int) (this.field1183 - this.field1184), arg0, arg1, arg2);
                this.field1183 += (long) arg2;
                return;
            }
            long var4 = this.field1183;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field1183 >= this.field1192 && this.field1183 < this.field1192 + (long) this.field1186) {
                int var8 = (int) ((long) this.field1186 - (this.field1183 - this.field1192));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field1180, (int) (this.field1183 - this.field1192), arg0, arg1, var8);
                this.field1183 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field1180.length) {
                this.field1182.method1312(this.field1183);
                this.field1189 = this.field1183;
                while (arg2 > 0) {
                    int var9 = this.field1182.method1315(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field1189 += (long) var9;
                    this.field1183 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method1292();
                int var10 = arg2;
                if (arg2 > this.field1186) {
                    var10 = this.field1186;
                }
                System.arraycopy(this.field1180, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field1183 += (long) var10;
            }
            if (this.field1184 != -1L) {
                if (this.field1184 > this.field1183 && arg2 > 0) {
                    int var11 = (int) (this.field1184 - this.field1183) + arg1;
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
                if (this.field1184 >= var4 && this.field1184 < (long) var7 + var4) {
                    var12 = this.field1184;
                } else if (var4 >= this.field1184 && var4 < this.field1184 + (long) this.field1185) {
                    var12 = var4;
                }
                if (this.field1184 + (long) this.field1185 > var4 && this.field1184 + (long) this.field1185 <= (long) var7 + var4) {
                    var14 = this.field1184 + (long) this.field1185;
                } else if ((long) var7 + var4 > this.field1184 && (long) var7 + var4 <= this.field1184 + (long) this.field1185) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field1181, (int) (var12 - this.field1184), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field1183) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field1183));
                        this.field1183 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field1189 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("by.c(B)V")
    public void method1292() throws IOException {
        this.field1186 = 0;
        if (this.field1189 != this.field1183) {
            this.field1182.method1312(this.field1183);
            this.field1189 = this.field1183;
        }
        this.field1192 = this.field1183;
        while (this.field1186 < this.field1180.length) {
            int var1 = this.field1182.method1315(this.field1180, this.field1186, this.field1180.length - this.field1186);
            if (var1 == -1) {
                break;
            }
            this.field1189 += (long) var1;
            this.field1186 += var1;
        }
    }

    @ObfuscatedName("by.u([BIII)V")
    public void method1282(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field1183 + (long) arg2 > this.field1179) {
                this.field1179 = this.field1183 + (long) arg2;
            }
            if (this.field1184 != -1L && (this.field1183 < this.field1184 || this.field1183 > this.field1184 + (long) this.field1185)) {
                this.method1283();
            }
            if (this.field1184 != -1L && this.field1183 + (long) arg2 > this.field1184 + (long) this.field1181.length) {
                int var4 = (int) ((long) this.field1181.length - (this.field1183 - this.field1184));
                System.arraycopy(arg0, arg1, this.field1181, (int) (this.field1183 - this.field1184), var4);
                this.field1183 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field1185 = this.field1181.length;
                this.method1283();
            }
            if (arg2 > this.field1181.length) {
                if (this.field1189 != this.field1183) {
                    this.field1182.method1312(this.field1183);
                    this.field1189 = this.field1183;
                }
                this.field1182.method1311(arg0, arg1, arg2);
                this.field1189 += (long) arg2;
                if (this.field1189 > this.field1187) {
                    this.field1187 = this.field1189;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field1183 >= this.field1192 && this.field1183 < this.field1192 + (long) this.field1186) {
                    var5 = this.field1183;
                } else if (this.field1192 >= this.field1183 && this.field1192 < this.field1183 + (long) arg2) {
                    var5 = this.field1192;
                }
                if (this.field1183 + (long) arg2 > this.field1192 && this.field1183 + (long) arg2 <= this.field1192 + (long) this.field1186) {
                    var7 = this.field1183 + (long) arg2;
                } else if (this.field1192 + (long) this.field1186 > this.field1183 && this.field1192 + (long) this.field1186 <= this.field1183 + (long) arg2) {
                    var7 = this.field1192 + (long) this.field1186;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field1183), this.field1180, (int) (var5 - this.field1192), var9);
                }
                this.field1183 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field1184 == -1L) {
                    this.field1184 = this.field1183;
                }
                System.arraycopy(arg0, arg1, this.field1181, (int) (this.field1183 - this.field1184), arg2);
                this.field1183 += (long) arg2;
                if (this.field1183 - this.field1184 > (long) this.field1185) {
                    this.field1185 = (int) (this.field1183 - this.field1184);
                }
            }
        } catch (IOException var11) {
            this.field1189 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("by.k(B)V")
    public void method1283() throws IOException {
        if (this.field1184 == -1L) {
            return;
        }
        if (this.field1189 != this.field1184) {
            this.field1182.method1312(this.field1184);
            this.field1189 = this.field1184;
        }
        this.field1182.method1311(this.field1181, 0, this.field1185);
        this.field1189 += (long) (this.field1185 * 557803493) * -349536787L;
        if (this.field1189 > this.field1187) {
            this.field1187 = this.field1189;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field1184 >= this.field1192 && this.field1184 < this.field1192 + (long) this.field1186) {
            var1 = this.field1184;
        } else if (this.field1192 >= this.field1184 && this.field1192 < this.field1184 + (long) this.field1185) {
            var1 = this.field1192;
        }
        if (this.field1184 + (long) this.field1185 > this.field1192 && this.field1184 + (long) this.field1185 <= this.field1192 + (long) this.field1186) {
            var3 = this.field1184 + (long) this.field1185;
        } else if (this.field1192 + (long) this.field1186 > this.field1184 && this.field1192 + (long) this.field1186 <= this.field1184 + (long) this.field1185) {
            var3 = this.field1192 + (long) this.field1186;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field1181, (int) (var1 - this.field1184), this.field1180, (int) (var1 - this.field1192), var5);
        }
        this.field1184 = -1L;
        this.field1185 = 0;
    }
}
