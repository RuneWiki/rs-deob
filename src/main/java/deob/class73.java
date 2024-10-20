package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("bi")
public class class73 {

    @ObfuscatedName("bi.f")
    public class74 field1213;

    @ObfuscatedName("bi.i")
    public byte[] field1207;

    @ObfuscatedName("bi.u")
    public long field1200 = -1L;

    @ObfuscatedName("bi.h")
    public int field1203;

    @ObfuscatedName("bi.r")
    public byte[] field1204;

    @ObfuscatedName("bi.o")
    public long field1205 = -1L;

    @ObfuscatedName("bi.l")
    public int field1206 = 0;

    @ObfuscatedName("bi.n")
    public long field1214;

    @ObfuscatedName("bi.m")
    public long field1208;

    @ObfuscatedName("bi.w")
    public long field1209;

    @ObfuscatedName("bi.j")
    public long field1210;

    public class73(class74 arg0, int arg1, int arg2) throws IOException {
        this.field1213 = arg0;
        this.field1209 = this.field1208 = arg0.method1362();
        this.field1207 = new byte[arg1];
        this.field1204 = new byte[arg2];
        this.field1214 = 0L;
    }

    @ObfuscatedName("bi.f(B)V")
    public void method1348() throws IOException {
        this.method1332();
        this.field1213.method1361();
    }

    @ObfuscatedName("bi.i(J)V")
    public void method1350(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field1214 = arg0;
    }

    @ObfuscatedName("bi.u(I)J")
    public long method1327() {
        return this.field1209;
    }

    @ObfuscatedName("bi.r([BB)V")
    public void method1328(byte[] arg0) throws IOException {
        this.method1329(arg0, 0, arg0.length);
    }

    @ObfuscatedName("bi.o([BIII)V")
    public void method1329(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field1205 != -1L && this.field1214 >= this.field1205 && this.field1214 + (long) arg2 <= this.field1205 + (long) this.field1206) {
                System.arraycopy(this.field1204, (int) (this.field1214 - this.field1205), arg0, arg1, arg2);
                this.field1214 += (long) arg2;
                return;
            }
            long var4 = this.field1214;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field1214 >= this.field1200 && this.field1214 < this.field1200 + (long) this.field1203) {
                int var8 = (int) ((long) this.field1203 - (this.field1214 - this.field1200));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field1207, (int) (this.field1214 - this.field1200), arg0, arg1, var8);
                this.field1214 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field1207.length) {
                this.field1213.method1366(this.field1214);
                this.field1210 = this.field1214;
                while (arg2 > 0) {
                    int var9 = this.field1213.method1363(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field1210 += (long) var9;
                    this.field1214 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method1330();
                int var10 = arg2;
                if (arg2 > this.field1203) {
                    var10 = this.field1203;
                }
                System.arraycopy(this.field1207, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field1214 += (long) var10;
            }
            if (this.field1205 != -1L) {
                if (this.field1205 > this.field1214 && arg2 > 0) {
                    int var11 = (int) (this.field1205 - this.field1214) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field1214++;
                    }
                }
                long var12 = -1L;
                long var14 = -1L;
                if (this.field1205 >= var4 && this.field1205 < (long) var7 + var4) {
                    var12 = this.field1205;
                } else if (var4 >= this.field1205 && var4 < this.field1205 + (long) this.field1206) {
                    var12 = var4;
                }
                if (this.field1205 + (long) this.field1206 > var4 && this.field1205 + (long) this.field1206 <= (long) var7 + var4) {
                    var14 = this.field1205 + (long) this.field1206;
                } else if ((long) var7 + var4 > this.field1205 && (long) var7 + var4 <= this.field1205 + (long) this.field1206) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field1204, (int) (var12 - this.field1205), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field1214) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field1214));
                        this.field1214 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field1210 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("bi.l(I)V")
    public void method1330() throws IOException {
        this.field1203 = 0;
        if (this.field1214 != this.field1210) {
            this.field1213.method1366(this.field1214);
            this.field1210 = this.field1214;
        }
        this.field1200 = this.field1214;
        while (this.field1203 < this.field1207.length) {
            int var1 = this.field1213.method1363(this.field1207, this.field1203, this.field1207.length - this.field1203);
            if (var1 == -1) {
                break;
            }
            this.field1210 += (long) var1;
            this.field1203 += var1;
        }
    }

    @ObfuscatedName("bi.n([BIII)V")
    public void method1356(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field1214 + (long) arg2 > this.field1209) {
                this.field1209 = this.field1214 + (long) arg2;
            }
            if (this.field1205 != -1L && (this.field1214 < this.field1205 || this.field1214 > this.field1205 + (long) this.field1206)) {
                this.method1332();
            }
            if (this.field1205 != -1L && this.field1214 + (long) arg2 > this.field1205 + (long) this.field1204.length) {
                int var4 = (int) ((long) this.field1204.length - (this.field1214 - this.field1205));
                System.arraycopy(arg0, arg1, this.field1204, (int) (this.field1214 - this.field1205), var4);
                this.field1214 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field1206 = this.field1204.length;
                this.method1332();
            }
            if (arg2 > this.field1204.length) {
                if (this.field1214 != this.field1210) {
                    this.field1213.method1366(this.field1214);
                    this.field1210 = this.field1214;
                }
                this.field1213.method1360(arg0, arg1, arg2);
                this.field1210 += (long) arg2;
                if (this.field1210 > this.field1208) {
                    this.field1208 = this.field1210;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field1214 >= this.field1200 && this.field1214 < this.field1200 + (long) this.field1203) {
                    var5 = this.field1214;
                } else if (this.field1200 >= this.field1214 && this.field1200 < this.field1214 + (long) arg2) {
                    var5 = this.field1200;
                }
                if (this.field1214 + (long) arg2 > this.field1200 && this.field1214 + (long) arg2 <= this.field1200 + (long) this.field1203) {
                    var7 = this.field1214 + (long) arg2;
                } else if (this.field1200 + (long) this.field1203 > this.field1214 && this.field1200 + (long) this.field1203 <= this.field1214 + (long) arg2) {
                    var7 = this.field1200 + (long) this.field1203;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field1214), this.field1207, (int) (var5 - this.field1200), var9);
                }
                this.field1214 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field1205 == -1L) {
                    this.field1205 = this.field1214;
                }
                System.arraycopy(arg0, arg1, this.field1204, (int) (this.field1214 - this.field1205), arg2);
                this.field1214 += (long) arg2;
                if (this.field1214 - this.field1205 > (long) this.field1206) {
                    this.field1206 = (int) (this.field1214 - this.field1205);
                }
            }
        } catch (IOException var11) {
            this.field1210 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("bi.m(I)V")
    public void method1332() throws IOException {
        if (this.field1205 == -1L) {
            return;
        }
        if (this.field1210 != this.field1205) {
            this.field1213.method1366(this.field1205);
            this.field1210 = this.field1205;
        }
        this.field1213.method1360(this.field1204, 0, this.field1206);
        this.field1210 += (long) (this.field1206 * 1695638973) * 1273298325L;
        if (this.field1210 > this.field1208) {
            this.field1208 = this.field1210;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field1205 >= this.field1200 && this.field1205 < this.field1200 + (long) this.field1203) {
            var1 = this.field1205;
        } else if (this.field1200 >= this.field1205 && this.field1200 < this.field1205 + (long) this.field1206) {
            var1 = this.field1200;
        }
        if (this.field1205 + (long) this.field1206 > this.field1200 && this.field1205 + (long) this.field1206 <= this.field1200 + (long) this.field1203) {
            var3 = this.field1205 + (long) this.field1206;
        } else if (this.field1200 + (long) this.field1203 > this.field1205 && this.field1200 + (long) this.field1203 <= this.field1205 + (long) this.field1206) {
            var3 = this.field1200 + (long) this.field1203;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field1204, (int) (var1 - this.field1205), this.field1207, (int) (var1 - this.field1200), var5);
        }
        this.field1205 = -1L;
        this.field1206 = 0;
    }
}
