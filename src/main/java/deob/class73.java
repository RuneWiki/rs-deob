package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("bt")
public class class73 {

    @ObfuscatedName("bt.k")
    public class74 field1178;

    @ObfuscatedName("bt.y")
    public byte[] field1179;

    @ObfuscatedName("bt.o")
    public long field1180 = -1L;

    @ObfuscatedName("bt.r")
    public int field1182;

    @ObfuscatedName("bt.w")
    public byte[] field1187;

    @ObfuscatedName("bt.j")
    public long field1183 = -1L;

    @ObfuscatedName("bt.q")
    public int field1184 = 0;

    @ObfuscatedName("bt.d")
    public long field1185;

    @ObfuscatedName("bt.n")
    public long field1186;

    @ObfuscatedName("bt.c")
    public long field1181;

    @ObfuscatedName("bt.s")
    public long field1188;

    public class73(class74 arg0, int arg1, int arg2) throws IOException {
        this.field1178 = arg0;
        this.field1181 = this.field1186 = arg0.method1334();
        this.field1179 = new byte[arg1];
        this.field1187 = new byte[arg2];
        this.field1185 = 0L;
    }

    @ObfuscatedName("bt.k(S)V")
    public void method1302() throws IOException {
        this.method1309();
        this.field1178.method1333();
    }

    @ObfuscatedName("bt.y(J)V")
    public void method1318(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field1185 = arg0;
    }

    @ObfuscatedName("bt.o(I)J")
    public long method1326() {
        return this.field1181;
    }

    @ObfuscatedName("bt.r([BI)V")
    public void method1305(byte[] arg0) throws IOException {
        this.method1327(arg0, 0, arg0.length);
    }

    @ObfuscatedName("bt.w([BIII)V")
    public void method1327(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field1183 != -1L && this.field1185 >= this.field1183 && this.field1185 + (long) arg2 <= this.field1183 + (long) this.field1184) {
                System.arraycopy(this.field1187, (int) (this.field1185 - this.field1183), arg0, arg1, arg2);
                this.field1185 += (long) arg2;
                return;
            }
            long var4 = this.field1185;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field1185 >= this.field1180 && this.field1185 < this.field1180 + (long) this.field1182) {
                int var8 = (int) ((long) this.field1182 - (this.field1185 - this.field1180));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field1179, (int) (this.field1185 - this.field1180), arg0, arg1, var8);
                this.field1185 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field1179.length) {
                this.field1178.method1331(this.field1185);
                this.field1188 = this.field1185;
                while (arg2 > 0) {
                    int var9 = this.field1178.method1335(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field1188 += (long) var9;
                    this.field1185 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method1306();
                int var10 = arg2;
                if (arg2 > this.field1182) {
                    var10 = this.field1182;
                }
                System.arraycopy(this.field1179, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field1185 += (long) var10;
            }
            if (this.field1183 != -1L) {
                if (this.field1183 > this.field1185 && arg2 > 0) {
                    int var11 = (int) (this.field1183 - this.field1185) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field1185++;
                    }
                }
                long var12 = -1L;
                long var14 = -1L;
                if (this.field1183 >= var4 && this.field1183 < (long) var7 + var4) {
                    var12 = this.field1183;
                } else if (var4 >= this.field1183 && var4 < this.field1183 + (long) this.field1184) {
                    var12 = var4;
                }
                if (this.field1183 + (long) this.field1184 > var4 && this.field1183 + (long) this.field1184 <= (long) var7 + var4) {
                    var14 = this.field1183 + (long) this.field1184;
                } else if ((long) var7 + var4 > this.field1183 && (long) var7 + var4 <= this.field1183 + (long) this.field1184) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field1187, (int) (var12 - this.field1183), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field1185) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field1185));
                        this.field1185 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field1188 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("bt.j(B)V")
    public void method1306() throws IOException {
        this.field1182 = 0;
        if (this.field1188 != this.field1185) {
            this.field1178.method1331(this.field1185);
            this.field1188 = this.field1185;
        }
        this.field1180 = this.field1185;
        while (this.field1182 < this.field1179.length) {
            int var1 = this.field1178.method1335(this.field1179, this.field1182, this.field1179.length - this.field1182);
            if (var1 == -1) {
                break;
            }
            this.field1188 += (long) var1;
            this.field1182 += var1;
        }
    }

    @ObfuscatedName("bt.c([BIII)V")
    public void method1308(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field1185 + (long) arg2 > this.field1181) {
                this.field1181 = this.field1185 + (long) arg2;
            }
            if (this.field1183 != -1L && (this.field1185 < this.field1183 || this.field1185 > this.field1183 + (long) this.field1184)) {
                this.method1309();
            }
            if (this.field1183 != -1L && this.field1185 + (long) arg2 > this.field1183 + (long) this.field1187.length) {
                int var4 = (int) ((long) this.field1187.length - (this.field1185 - this.field1183));
                System.arraycopy(arg0, arg1, this.field1187, (int) (this.field1185 - this.field1183), var4);
                this.field1185 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field1184 = this.field1187.length;
                this.method1309();
            }
            if (arg2 > this.field1187.length) {
                if (this.field1188 != this.field1185) {
                    this.field1178.method1331(this.field1185);
                    this.field1188 = this.field1185;
                }
                this.field1178.method1332(arg0, arg1, arg2);
                this.field1188 += (long) arg2;
                if (this.field1188 > this.field1186) {
                    this.field1186 = this.field1188;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field1185 >= this.field1180 && this.field1185 < this.field1180 + (long) this.field1182) {
                    var5 = this.field1185;
                } else if (this.field1180 >= this.field1185 && this.field1180 < this.field1185 + (long) arg2) {
                    var5 = this.field1180;
                }
                if (this.field1185 + (long) arg2 > this.field1180 && this.field1185 + (long) arg2 <= this.field1180 + (long) this.field1182) {
                    var7 = this.field1185 + (long) arg2;
                } else if (this.field1180 + (long) this.field1182 > this.field1185 && this.field1180 + (long) this.field1182 <= this.field1185 + (long) arg2) {
                    var7 = this.field1180 + (long) this.field1182;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field1185), this.field1179, (int) (var5 - this.field1180), var9);
                }
                this.field1185 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field1183 == -1L) {
                    this.field1183 = this.field1185;
                }
                System.arraycopy(arg0, arg1, this.field1187, (int) (this.field1185 - this.field1183), arg2);
                this.field1185 += (long) arg2;
                if (this.field1185 - this.field1183 > (long) this.field1184) {
                    this.field1184 = (int) (this.field1185 - this.field1183);
                }
            }
        } catch (IOException var11) {
            this.field1188 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("bt.g(B)V")
    public void method1309() throws IOException {
        if (this.field1183 == -1L) {
            return;
        }
        if (this.field1188 != this.field1183) {
            this.field1178.method1331(this.field1183);
            this.field1188 = this.field1183;
        }
        this.field1178.method1332(this.field1187, 0, this.field1184);
        this.field1188 += (long) (this.field1184 * -399919279) * 1359344049L;
        if (this.field1188 > this.field1186) {
            this.field1186 = this.field1188;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field1183 >= this.field1180 && this.field1183 < this.field1180 + (long) this.field1182) {
            var1 = this.field1183;
        } else if (this.field1180 >= this.field1183 && this.field1180 < this.field1183 + (long) this.field1184) {
            var1 = this.field1180;
        }
        if (this.field1183 + (long) this.field1184 > this.field1180 && this.field1183 + (long) this.field1184 <= this.field1180 + (long) this.field1182) {
            var3 = this.field1183 + (long) this.field1184;
        } else if (this.field1180 + (long) this.field1182 > this.field1183 && this.field1180 + (long) this.field1182 <= this.field1183 + (long) this.field1184) {
            var3 = this.field1180 + (long) this.field1182;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field1187, (int) (var1 - this.field1183), this.field1179, (int) (var1 - this.field1180), var5);
        }
        this.field1183 = -1L;
        this.field1184 = 0;
    }
}
