package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("bp")
public class class73 {

    @ObfuscatedName("bp.b")
    public class74 field1163;

    @ObfuscatedName("bp.l")
    public byte[] field1173;

    @ObfuscatedName("bp.i")
    public long field1162 = -1L;

    @ObfuscatedName("bp.t")
    public int field1167;

    @ObfuscatedName("bp.k")
    public byte[] field1164;

    @ObfuscatedName("bp.h")
    public long field1165 = -1L;

    @ObfuscatedName("bp.n")
    public int field1166 = 0;

    @ObfuscatedName("bp.f")
    public long field1171;

    @ObfuscatedName("bp.a")
    public long field1168;

    @ObfuscatedName("bp.r")
    public long field1160;

    @ObfuscatedName("bp.x")
    public long field1170;

    public class73(class74 arg0, int arg1, int arg2) throws IOException {
        this.field1163 = arg0;
        this.field1160 = this.field1168 = arg0.method1393();
        this.field1173 = new byte[arg1];
        this.field1164 = new byte[arg2];
        this.field1171 = 0L;
    }

    @ObfuscatedName("bp.b(I)V")
    public void method1358() throws IOException {
        this.method1365();
        this.field1163.method1394();
    }

    @ObfuscatedName("bp.l(J)V")
    public void method1359(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field1171 = arg0;
    }

    @ObfuscatedName("bp.i(I)J")
    public long method1386() {
        return this.field1160;
    }

    @ObfuscatedName("bp.t([BI)V")
    public void method1361(byte[] arg0) throws IOException {
        this.method1362(arg0, 0, arg0.length);
    }

    @ObfuscatedName("bp.k([BIII)V")
    public void method1362(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field1165 != -1L && this.field1171 >= this.field1165 && this.field1171 + (long) arg2 <= this.field1165 + (long) this.field1166) {
                System.arraycopy(this.field1164, (int) (this.field1171 - this.field1165), arg0, arg1, arg2);
                this.field1171 += (long) arg2;
                return;
            }
            long var4 = this.field1171;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field1171 >= this.field1162 && this.field1171 < this.field1162 + (long) this.field1167) {
                int var8 = (int) ((long) this.field1167 - (this.field1171 - this.field1162));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field1173, (int) (this.field1171 - this.field1162), arg0, arg1, var8);
                this.field1171 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field1173.length) {
                this.field1163.method1390(this.field1171);
                this.field1170 = this.field1171;
                while (arg2 > 0) {
                    int var9 = this.field1163.method1392(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field1170 += (long) var9;
                    this.field1171 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method1363();
                int var10 = arg2;
                if (arg2 > this.field1167) {
                    var10 = this.field1167;
                }
                System.arraycopy(this.field1173, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field1171 += (long) var10;
            }
            if (this.field1165 != -1L) {
                if (this.field1165 > this.field1171 && arg2 > 0) {
                    int var11 = (int) (this.field1165 - this.field1171) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field1171++;
                    }
                }
                long var12 = -1L;
                long var14 = -1L;
                if (this.field1165 >= var4 && this.field1165 < (long) var7 + var4) {
                    var12 = this.field1165;
                } else if (var4 >= this.field1165 && var4 < this.field1165 + (long) this.field1166) {
                    var12 = var4;
                }
                if (this.field1165 + (long) this.field1166 > var4 && this.field1165 + (long) this.field1166 <= (long) var7 + var4) {
                    var14 = this.field1165 + (long) this.field1166;
                } else if ((long) var7 + var4 > this.field1165 && (long) var7 + var4 <= this.field1165 + (long) this.field1166) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field1164, (int) (var12 - this.field1165), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field1171) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field1171));
                        this.field1171 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field1170 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("bp.x(B)V")
    public void method1363() throws IOException {
        this.field1167 = 0;
        if (this.field1171 != this.field1170) {
            this.field1163.method1390(this.field1171);
            this.field1170 = this.field1171;
        }
        this.field1162 = this.field1171;
        while (this.field1167 < this.field1173.length) {
            int var1 = this.field1163.method1392(this.field1173, this.field1167, this.field1173.length - this.field1167);
            if (var1 == -1) {
                break;
            }
            this.field1170 += (long) var1;
            this.field1167 += var1;
        }
    }

    @ObfuscatedName("bp.z([BIIB)V")
    public void method1384(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field1171 + (long) arg2 > this.field1160) {
                this.field1160 = this.field1171 + (long) arg2;
            }
            if (this.field1165 != -1L && (this.field1171 < this.field1165 || this.field1171 > this.field1165 + (long) this.field1166)) {
                this.method1365();
            }
            if (this.field1165 != -1L && this.field1171 + (long) arg2 > this.field1165 + (long) this.field1164.length) {
                int var4 = (int) ((long) this.field1164.length - (this.field1171 - this.field1165));
                System.arraycopy(arg0, arg1, this.field1164, (int) (this.field1171 - this.field1165), var4);
                this.field1171 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field1166 = this.field1164.length;
                this.method1365();
            }
            if (arg2 > this.field1164.length) {
                if (this.field1171 != this.field1170) {
                    this.field1163.method1390(this.field1171);
                    this.field1170 = this.field1171;
                }
                this.field1163.method1391(arg0, arg1, arg2);
                this.field1170 += (long) arg2;
                if (this.field1170 > this.field1168) {
                    this.field1168 = this.field1170;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field1171 >= this.field1162 && this.field1171 < this.field1162 + (long) this.field1167) {
                    var5 = this.field1171;
                } else if (this.field1162 >= this.field1171 && this.field1162 < this.field1171 + (long) arg2) {
                    var5 = this.field1162;
                }
                if (this.field1171 + (long) arg2 > this.field1162 && this.field1171 + (long) arg2 <= this.field1162 + (long) this.field1167) {
                    var7 = this.field1171 + (long) arg2;
                } else if (this.field1162 + (long) this.field1167 > this.field1171 && this.field1162 + (long) this.field1167 <= this.field1171 + (long) arg2) {
                    var7 = this.field1162 + (long) this.field1167;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field1171), this.field1173, (int) (var5 - this.field1162), var9);
                }
                this.field1171 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field1165 == -1L) {
                    this.field1165 = this.field1171;
                }
                System.arraycopy(arg0, arg1, this.field1164, (int) (this.field1171 - this.field1165), arg2);
                this.field1171 += (long) arg2;
                if (this.field1171 - this.field1165 > (long) this.field1166) {
                    this.field1166 = (int) (this.field1171 - this.field1165);
                }
            }
        } catch (IOException var11) {
            this.field1170 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("bp.p(I)V")
    public void method1365() throws IOException {
        if (this.field1165 == -1L) {
            return;
        }
        if (this.field1170 != this.field1165) {
            this.field1163.method1390(this.field1165);
            this.field1170 = this.field1165;
        }
        this.field1163.method1391(this.field1164, 0, this.field1166);
        this.field1170 += (long) (this.field1166 * 1153705801) * -1651148039L;
        if (this.field1170 > this.field1168) {
            this.field1168 = this.field1170;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field1165 >= this.field1162 && this.field1165 < this.field1162 + (long) this.field1167) {
            var1 = this.field1165;
        } else if (this.field1162 >= this.field1165 && this.field1162 < this.field1165 + (long) this.field1166) {
            var1 = this.field1162;
        }
        if (this.field1165 + (long) this.field1166 > this.field1162 && this.field1165 + (long) this.field1166 <= this.field1162 + (long) this.field1167) {
            var3 = this.field1165 + (long) this.field1166;
        } else if (this.field1162 + (long) this.field1167 > this.field1165 && this.field1162 + (long) this.field1167 <= this.field1165 + (long) this.field1166) {
            var3 = this.field1162 + (long) this.field1167;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field1164, (int) (var1 - this.field1165), this.field1173, (int) (var1 - this.field1162), var5);
        }
        this.field1165 = -1L;
        this.field1166 = 0;
    }
}
