package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("bn")
public class class73 {

    @ObfuscatedName("bn.x")
    public class74 field1192;

    @ObfuscatedName("bn.j")
    public byte[] field1184;

    @ObfuscatedName("bn.c")
    public long field1185 = -1L;

    @ObfuscatedName("bn.d")
    public int field1186;

    @ObfuscatedName("bn.w")
    public byte[] field1187;

    @ObfuscatedName("bn.h")
    public long field1188 = -1L;

    @ObfuscatedName("bn.u")
    public int field1191 = 0;

    @ObfuscatedName("bn.k")
    public long field1190;

    @ObfuscatedName("bn.g")
    public long field1196;

    @ObfuscatedName("bn.y")
    public long field1189;

    @ObfuscatedName("bn.e")
    public long field1193;

    public class73(class74 arg0, int arg1, int arg2) throws IOException {
        this.field1192 = arg0;
        this.field1189 = this.field1196 = arg0.method1395();
        this.field1184 = new byte[arg1];
        this.field1187 = new byte[arg2];
        this.field1190 = 0L;
    }

    @ObfuscatedName("bn.x(I)V")
    public void method1359() throws IOException {
        this.method1372();
        this.field1192.method1394();
    }

    @ObfuscatedName("bn.j(J)V")
    public void method1361(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field1190 = arg0;
    }

    @ObfuscatedName("bn.c(I)J")
    public long method1373() {
        return this.field1189;
    }

    @ObfuscatedName("bn.d([BI)V")
    public void method1363(byte[] arg0) throws IOException {
        this.method1389(arg0, 0, arg0.length);
    }

    @ObfuscatedName("bn.w([BIII)V")
    public void method1389(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field1188 != -1L && this.field1190 >= this.field1188 && this.field1190 + (long) arg2 <= this.field1188 + (long) this.field1191) {
                System.arraycopy(this.field1187, (int) (this.field1190 - this.field1188), arg0, arg1, arg2);
                this.field1190 += (long) arg2;
                return;
            }
            long var4 = this.field1190;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field1190 >= this.field1185 && this.field1190 < this.field1185 + (long) this.field1186) {
                int var8 = (int) ((long) this.field1186 - (this.field1190 - this.field1185));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field1184, (int) (this.field1190 - this.field1185), arg0, arg1, var8);
                this.field1190 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field1184.length) {
                this.field1192.method1392(this.field1190);
                this.field1193 = this.field1190;
                while (arg2 > 0) {
                    int var9 = this.field1192.method1391(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field1193 += (long) var9;
                    this.field1190 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method1364();
                int var10 = arg2;
                if (arg2 > this.field1186) {
                    var10 = this.field1186;
                }
                System.arraycopy(this.field1184, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field1190 += (long) var10;
            }
            if (this.field1188 != -1L) {
                if (this.field1188 > this.field1190 && arg2 > 0) {
                    int var11 = (int) (this.field1188 - this.field1190) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field1190++;
                    }
                }
                long var12 = -1L;
                long var14 = -1L;
                if (this.field1188 >= var4 && this.field1188 < (long) var7 + var4) {
                    var12 = this.field1188;
                } else if (var4 >= this.field1188 && var4 < this.field1188 + (long) this.field1191) {
                    var12 = var4;
                }
                if (this.field1188 + (long) this.field1191 > var4 && this.field1188 + (long) this.field1191 <= (long) var7 + var4) {
                    var14 = this.field1188 + (long) this.field1191;
                } else if ((long) var7 + var4 > this.field1188 && (long) var7 + var4 <= this.field1188 + (long) this.field1191) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field1187, (int) (var12 - this.field1188), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field1190) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field1190));
                        this.field1190 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field1193 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("bn.u(B)V")
    public void method1364() throws IOException {
        this.field1186 = 0;
        if (this.field1193 != this.field1190) {
            this.field1192.method1392(this.field1190);
            this.field1193 = this.field1190;
        }
        this.field1185 = this.field1190;
        while (this.field1186 < this.field1184.length) {
            int var1 = this.field1192.method1391(this.field1184, this.field1186, this.field1184.length - this.field1186);
            if (var1 == -1) {
                break;
            }
            this.field1193 += (long) var1;
            this.field1186 += var1;
        }
    }

    @ObfuscatedName("bn.y([BIII)V")
    public void method1365(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field1190 + (long) arg2 > this.field1189) {
                this.field1189 = this.field1190 + (long) arg2;
            }
            if (this.field1188 != -1L && (this.field1190 < this.field1188 || this.field1190 > this.field1188 + (long) this.field1191)) {
                this.method1372();
            }
            if (this.field1188 != -1L && this.field1190 + (long) arg2 > this.field1188 + (long) this.field1187.length) {
                int var4 = (int) ((long) this.field1187.length - (this.field1190 - this.field1188));
                System.arraycopy(arg0, arg1, this.field1187, (int) (this.field1190 - this.field1188), var4);
                this.field1190 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field1191 = this.field1187.length;
                this.method1372();
            }
            if (arg2 > this.field1187.length) {
                if (this.field1193 != this.field1190) {
                    this.field1192.method1392(this.field1190);
                    this.field1193 = this.field1190;
                }
                this.field1192.method1396(arg0, arg1, arg2);
                this.field1193 += (long) arg2;
                if (this.field1193 > this.field1196) {
                    this.field1196 = this.field1193;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field1190 >= this.field1185 && this.field1190 < this.field1185 + (long) this.field1186) {
                    var5 = this.field1190;
                } else if (this.field1185 >= this.field1190 && this.field1185 < this.field1190 + (long) arg2) {
                    var5 = this.field1185;
                }
                if (this.field1190 + (long) arg2 > this.field1185 && this.field1190 + (long) arg2 <= this.field1185 + (long) this.field1186) {
                    var7 = this.field1190 + (long) arg2;
                } else if (this.field1185 + (long) this.field1186 > this.field1190 && this.field1185 + (long) this.field1186 <= this.field1190 + (long) arg2) {
                    var7 = this.field1185 + (long) this.field1186;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field1190), this.field1184, (int) (var5 - this.field1185), var9);
                }
                this.field1190 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field1188 == -1L) {
                    this.field1188 = this.field1190;
                }
                System.arraycopy(arg0, arg1, this.field1187, (int) (this.field1190 - this.field1188), arg2);
                this.field1190 += (long) arg2;
                if (this.field1190 - this.field1188 > (long) this.field1191) {
                    this.field1191 = (int) (this.field1190 - this.field1188);
                }
            }
        } catch (IOException var11) {
            this.field1193 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("bn.e(I)V")
    public void method1372() throws IOException {
        if (this.field1188 == -1L) {
            return;
        }
        if (this.field1193 != this.field1188) {
            this.field1192.method1392(this.field1188);
            this.field1193 = this.field1188;
        }
        this.field1192.method1396(this.field1187, 0, this.field1191);
        this.field1193 += (long) (this.field1191 * -1114964357) * 2038116531L;
        if (this.field1193 > this.field1196) {
            this.field1196 = this.field1193;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field1188 >= this.field1185 && this.field1188 < this.field1185 + (long) this.field1186) {
            var1 = this.field1188;
        } else if (this.field1185 >= this.field1188 && this.field1185 < this.field1188 + (long) this.field1191) {
            var1 = this.field1185;
        }
        if (this.field1188 + (long) this.field1191 > this.field1185 && this.field1188 + (long) this.field1191 <= this.field1185 + (long) this.field1186) {
            var3 = this.field1188 + (long) this.field1191;
        } else if (this.field1185 + (long) this.field1186 > this.field1188 && this.field1185 + (long) this.field1186 <= this.field1188 + (long) this.field1191) {
            var3 = this.field1185 + (long) this.field1186;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field1187, (int) (var1 - this.field1188), this.field1184, (int) (var1 - this.field1185), var5);
        }
        this.field1188 = -1L;
        this.field1191 = 0;
    }
}
