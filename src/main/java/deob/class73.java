package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("bq")
public class class73 {

    @ObfuscatedName("bq.p")
    public class74 field1185;

    @ObfuscatedName("bq.g")
    public byte[] field1178;

    @ObfuscatedName("bq.x")
    public long field1179 = -1L;

    @ObfuscatedName("bq.q")
    public int field1180;

    @ObfuscatedName("bq.d")
    public byte[] field1177;

    @ObfuscatedName("bq.k")
    public long field1182 = -1L;

    @ObfuscatedName("bq.j")
    public int field1181 = 0;

    @ObfuscatedName("bq.s")
    public long field1184;

    @ObfuscatedName("bq.o")
    public long field1187;

    @ObfuscatedName("bq.a")
    public long field1186;

    @ObfuscatedName("bq.c")
    public long field1189;

    public class73(class74 arg0, int arg1, int arg2) throws IOException {
        this.field1185 = arg0;
        this.field1186 = this.field1187 = arg0.method1320();
        this.field1178 = new byte[arg1];
        this.field1177 = new byte[arg2];
        this.field1184 = 0L;
    }

    @ObfuscatedName("bq.p(I)V")
    public void method1270() throws IOException {
        this.method1276();
        this.field1185.method1305();
    }

    @ObfuscatedName("bq.g(J)V")
    public void method1271(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field1184 = arg0;
    }

    @ObfuscatedName("bq.x(I)J")
    public long method1295() {
        return this.field1186;
    }

    @ObfuscatedName("bq.q([BI)V")
    public void method1272(byte[] arg0) throws IOException {
        this.method1273(arg0, 0, arg0.length);
    }

    @ObfuscatedName("bq.d([BIII)V")
    public void method1273(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field1182 != -1L && this.field1184 >= this.field1182 && this.field1184 + (long) arg2 <= this.field1182 + (long) this.field1181) {
                System.arraycopy(this.field1177, (int) (this.field1184 - this.field1182), arg0, arg1, arg2);
                this.field1184 += (long) arg2;
                return;
            }
            long var4 = this.field1184;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field1184 >= this.field1179 && this.field1184 < this.field1179 + (long) this.field1180) {
                int var8 = (int) ((long) this.field1180 - (this.field1184 - this.field1179));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field1178, (int) (this.field1184 - this.field1179), arg0, arg1, var8);
                this.field1184 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field1178.length) {
                this.field1185.method1306(this.field1184);
                this.field1189 = this.field1184;
                while (arg2 > 0) {
                    int var9 = this.field1185.method1307(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field1189 += (long) var9;
                    this.field1184 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method1274();
                int var10 = arg2;
                if (arg2 > this.field1180) {
                    var10 = this.field1180;
                }
                System.arraycopy(this.field1178, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field1184 += (long) var10;
            }
            if (this.field1182 != -1L) {
                if (this.field1182 > this.field1184 && arg2 > 0) {
                    int var11 = (int) (this.field1182 - this.field1184) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field1184++;
                    }
                }
                long var12 = -1L;
                long var14 = -1L;
                if (this.field1182 >= var4 && this.field1182 < (long) var7 + var4) {
                    var12 = this.field1182;
                } else if (var4 >= this.field1182 && var4 < this.field1182 + (long) this.field1181) {
                    var12 = var4;
                }
                if (this.field1182 + (long) this.field1181 > var4 && this.field1182 + (long) this.field1181 <= (long) var7 + var4) {
                    var14 = this.field1182 + (long) this.field1181;
                } else if ((long) var7 + var4 > this.field1182 && (long) var7 + var4 <= this.field1182 + (long) this.field1181) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field1177, (int) (var12 - this.field1182), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field1184) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field1184));
                        this.field1184 = var14;
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

    @ObfuscatedName("bq.k(I)V")
    public void method1274() throws IOException {
        this.field1180 = 0;
        if (this.field1189 != this.field1184) {
            this.field1185.method1306(this.field1184);
            this.field1189 = this.field1184;
        }
        this.field1179 = this.field1184;
        while (this.field1180 < this.field1178.length) {
            int var1 = this.field1185.method1307(this.field1178, this.field1180, this.field1178.length - this.field1180);
            if (var1 == -1) {
                break;
            }
            this.field1189 += (long) var1;
            this.field1180 += var1;
        }
    }

    @ObfuscatedName("bq.j([BIII)V")
    public void method1275(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field1184 + (long) arg2 > this.field1186) {
                this.field1186 = this.field1184 + (long) arg2;
            }
            if (this.field1182 != -1L && (this.field1184 < this.field1182 || this.field1184 > this.field1182 + (long) this.field1181)) {
                this.method1276();
            }
            if (this.field1182 != -1L && this.field1184 + (long) arg2 > this.field1182 + (long) this.field1177.length) {
                int var4 = (int) ((long) this.field1177.length - (this.field1184 - this.field1182));
                System.arraycopy(arg0, arg1, this.field1177, (int) (this.field1184 - this.field1182), var4);
                this.field1184 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field1181 = this.field1177.length;
                this.method1276();
            }
            if (arg2 > this.field1177.length) {
                if (this.field1189 != this.field1184) {
                    this.field1185.method1306(this.field1184);
                    this.field1189 = this.field1184;
                }
                this.field1185.method1304(arg0, arg1, arg2);
                this.field1189 += (long) arg2;
                if (this.field1189 > this.field1187) {
                    this.field1187 = this.field1189;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field1184 >= this.field1179 && this.field1184 < this.field1179 + (long) this.field1180) {
                    var5 = this.field1184;
                } else if (this.field1179 >= this.field1184 && this.field1179 < this.field1184 + (long) arg2) {
                    var5 = this.field1179;
                }
                if (this.field1184 + (long) arg2 > this.field1179 && this.field1184 + (long) arg2 <= this.field1179 + (long) this.field1180) {
                    var7 = this.field1184 + (long) arg2;
                } else if (this.field1179 + (long) this.field1180 > this.field1184 && this.field1179 + (long) this.field1180 <= this.field1184 + (long) arg2) {
                    var7 = this.field1179 + (long) this.field1180;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field1184), this.field1178, (int) (var5 - this.field1179), var9);
                }
                this.field1184 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field1182 == -1L) {
                    this.field1182 = this.field1184;
                }
                System.arraycopy(arg0, arg1, this.field1177, (int) (this.field1184 - this.field1182), arg2);
                this.field1184 += (long) arg2;
                if (this.field1184 - this.field1182 > (long) this.field1181) {
                    this.field1181 = (int) (this.field1184 - this.field1182);
                }
            }
        } catch (IOException var11) {
            this.field1189 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("bq.s(B)V")
    public void method1276() throws IOException {
        if (this.field1182 == -1L) {
            return;
        }
        if (this.field1189 != this.field1182) {
            this.field1185.method1306(this.field1182);
            this.field1189 = this.field1182;
        }
        this.field1185.method1304(this.field1177, 0, this.field1181);
        this.field1189 += (long) (this.field1181 * 1455579223) * 1088719719L;
        if (this.field1189 > this.field1187) {
            this.field1187 = this.field1189;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field1182 >= this.field1179 && this.field1182 < this.field1179 + (long) this.field1180) {
            var1 = this.field1182;
        } else if (this.field1179 >= this.field1182 && this.field1179 < this.field1182 + (long) this.field1181) {
            var1 = this.field1179;
        }
        if (this.field1182 + (long) this.field1181 > this.field1179 && this.field1182 + (long) this.field1181 <= this.field1179 + (long) this.field1180) {
            var3 = this.field1182 + (long) this.field1181;
        } else if (this.field1179 + (long) this.field1180 > this.field1182 && this.field1179 + (long) this.field1180 <= this.field1182 + (long) this.field1181) {
            var3 = this.field1179 + (long) this.field1180;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field1177, (int) (var1 - this.field1182), this.field1178, (int) (var1 - this.field1179), var5);
        }
        this.field1182 = -1L;
        this.field1181 = 0;
    }
}
