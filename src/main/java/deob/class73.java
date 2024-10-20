package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("bq")
public class class73 {

    @ObfuscatedName("bq.n")
    public class74 field1172;

    @ObfuscatedName("bq.d")
    public byte[] field1170;

    @ObfuscatedName("bq.m")
    public long field1171 = -1L;

    @ObfuscatedName("bq.h")
    public int field1181;

    @ObfuscatedName("bq.w")
    public byte[] field1173;

    @ObfuscatedName("bq.r")
    public long field1174 = -1L;

    @ObfuscatedName("bq.c")
    public int field1175 = 0;

    @ObfuscatedName("bq.p")
    public long field1183;

    @ObfuscatedName("bq.g")
    public long field1182;

    @ObfuscatedName("bq.z")
    public long field1169;

    @ObfuscatedName("bq.q")
    public long field1179;

    public class73(class74 arg0, int arg1, int arg2) throws IOException {
        this.field1172 = arg0;
        this.field1169 = this.field1182 = arg0.method1349();
        this.field1170 = new byte[arg1];
        this.field1173 = new byte[arg2];
        this.field1183 = 0L;
    }

    @ObfuscatedName("bq.n(I)V")
    public void method1337() throws IOException {
        this.method1334();
        this.field1172.method1352();
    }

    @ObfuscatedName("bq.d(J)V")
    public void method1335(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field1183 = arg0;
    }

    @ObfuscatedName("bq.m(B)J")
    public long method1317() {
        return this.field1169;
    }

    @ObfuscatedName("bq.h([BI)V")
    public void method1318(byte[] arg0) throws IOException {
        this.method1319(arg0, 0, arg0.length);
    }

    @ObfuscatedName("bq.w([BIII)V")
    public void method1319(byte[] arg0, int arg1, int arg2) throws IOException {
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
            if (this.field1183 >= this.field1171 && this.field1183 < this.field1171 + (long) this.field1181) {
                int var8 = (int) ((long) this.field1181 - (this.field1183 - this.field1171));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field1170, (int) (this.field1183 - this.field1171), arg0, arg1, var8);
                this.field1183 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field1170.length) {
                this.field1172.method1369(this.field1183);
                this.field1179 = this.field1183;
                while (arg2 > 0) {
                    int var9 = this.field1172.method1354(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field1179 += (long) var9;
                    this.field1183 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method1320();
                int var10 = arg2;
                if (arg2 > this.field1181) {
                    var10 = this.field1181;
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

    @ObfuscatedName("bq.r(B)V")
    public void method1320() throws IOException {
        this.field1181 = 0;
        if (this.field1183 != this.field1179) {
            this.field1172.method1369(this.field1183);
            this.field1179 = this.field1183;
        }
        this.field1171 = this.field1183;
        while (this.field1181 < this.field1170.length) {
            int var1 = this.field1172.method1354(this.field1170, this.field1181, this.field1170.length - this.field1181);
            if (var1 == -1) {
                break;
            }
            this.field1179 += (long) var1;
            this.field1181 += var1;
        }
    }

    @ObfuscatedName("bq.c([BIII)V")
    public void method1329(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field1183 + (long) arg2 > this.field1169) {
                this.field1169 = this.field1183 + (long) arg2;
            }
            if (this.field1174 != -1L && (this.field1183 < this.field1174 || this.field1183 > this.field1174 + (long) this.field1175)) {
                this.method1334();
            }
            if (this.field1174 != -1L && this.field1183 + (long) arg2 > this.field1174 + (long) this.field1173.length) {
                int var4 = (int) ((long) this.field1173.length - (this.field1183 - this.field1174));
                System.arraycopy(arg0, arg1, this.field1173, (int) (this.field1183 - this.field1174), var4);
                this.field1183 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field1175 = this.field1173.length;
                this.method1334();
            }
            if (arg2 > this.field1173.length) {
                if (this.field1183 != this.field1179) {
                    this.field1172.method1369(this.field1183);
                    this.field1179 = this.field1183;
                }
                this.field1172.method1351(arg0, arg1, arg2);
                this.field1179 += (long) arg2;
                if (this.field1179 > this.field1182) {
                    this.field1182 = this.field1179;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field1183 >= this.field1171 && this.field1183 < this.field1171 + (long) this.field1181) {
                    var5 = this.field1183;
                } else if (this.field1171 >= this.field1183 && this.field1171 < this.field1183 + (long) arg2) {
                    var5 = this.field1171;
                }
                if (this.field1183 + (long) arg2 > this.field1171 && this.field1183 + (long) arg2 <= this.field1171 + (long) this.field1181) {
                    var7 = this.field1183 + (long) arg2;
                } else if (this.field1171 + (long) this.field1181 > this.field1183 && this.field1171 + (long) this.field1181 <= this.field1183 + (long) arg2) {
                    var7 = this.field1171 + (long) this.field1181;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field1183), this.field1170, (int) (var5 - this.field1171), var9);
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

    @ObfuscatedName("bq.z(I)V")
    public void method1334() throws IOException {
        if (this.field1174 == -1L) {
            return;
        }
        if (this.field1179 != this.field1174) {
            this.field1172.method1369(this.field1174);
            this.field1179 = this.field1174;
        }
        this.field1172.method1351(this.field1173, 0, this.field1175);
        this.field1179 += (long) (this.field1175 * 1732988475) * 969693939L;
        if (this.field1179 > this.field1182) {
            this.field1182 = this.field1179;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field1174 >= this.field1171 && this.field1174 < this.field1171 + (long) this.field1181) {
            var1 = this.field1174;
        } else if (this.field1171 >= this.field1174 && this.field1171 < this.field1174 + (long) this.field1175) {
            var1 = this.field1171;
        }
        if (this.field1174 + (long) this.field1175 > this.field1171 && this.field1174 + (long) this.field1175 <= this.field1171 + (long) this.field1181) {
            var3 = this.field1174 + (long) this.field1175;
        } else if (this.field1171 + (long) this.field1181 > this.field1174 && this.field1171 + (long) this.field1181 <= this.field1174 + (long) this.field1175) {
            var3 = this.field1171 + (long) this.field1181;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field1173, (int) (var1 - this.field1174), this.field1170, (int) (var1 - this.field1171), var5);
        }
        this.field1174 = -1L;
        this.field1175 = 0;
    }
}
