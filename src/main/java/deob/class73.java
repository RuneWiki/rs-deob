package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("br")
public class class73 {

    @ObfuscatedName("br.q")
    public class74 field1204;

    @ObfuscatedName("br.d")
    public byte[] field1194;

    @ObfuscatedName("br.h")
    public long field1203 = -1L;

    @ObfuscatedName("br.p")
    public int field1195;

    @ObfuscatedName("br.j")
    public byte[] field1196;

    @ObfuscatedName("br.n")
    public long field1197 = -1L;

    @ObfuscatedName("br.r")
    public int field1193 = 0;

    @ObfuscatedName("br.c")
    public long field1199;

    @ObfuscatedName("br.i")
    public long field1200;

    @ObfuscatedName("br.o")
    public long field1201;

    @ObfuscatedName("br.m")
    public long field1202;

    public class73(class74 arg0, int arg1, int arg2) throws IOException {
        this.field1204 = arg0;
        this.field1201 = this.field1200 = arg0.method1412();
        this.field1194 = new byte[arg1];
        this.field1196 = new byte[arg2];
        this.field1199 = 0L;
    }

    @ObfuscatedName("br.q(S)V")
    public void method1365() throws IOException {
        this.method1382();
        this.field1204.method1410();
    }

    @ObfuscatedName("br.d(J)V")
    public void method1388(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field1199 = arg0;
    }

    @ObfuscatedName("br.h(B)J")
    public long method1387() {
        return this.field1201;
    }

    @ObfuscatedName("br.p([BB)V")
    public void method1381(byte[] arg0) throws IOException {
        this.method1376(arg0, 0, arg0.length);
    }

    @ObfuscatedName("br.j([BIIB)V")
    public void method1376(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field1197 != -1L && this.field1199 >= this.field1197 && this.field1199 + (long) arg2 <= this.field1197 + (long) this.field1193) {
                System.arraycopy(this.field1196, (int) (this.field1199 - this.field1197), arg0, arg1, arg2);
                this.field1199 += (long) arg2;
                return;
            }
            long var4 = this.field1199;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field1199 >= this.field1203 && this.field1199 < this.field1203 + (long) this.field1195) {
                int var8 = (int) ((long) this.field1195 - (this.field1199 - this.field1203));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field1194, (int) (this.field1199 - this.field1203), arg0, arg1, var8);
                this.field1199 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field1194.length) {
                this.field1204.method1403(this.field1199);
                this.field1202 = this.field1199;
                while (arg2 > 0) {
                    int var9 = this.field1204.method1407(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field1202 += (long) var9;
                    this.field1199 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method1370();
                int var10 = arg2;
                if (arg2 > this.field1195) {
                    var10 = this.field1195;
                }
                System.arraycopy(this.field1194, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field1199 += (long) var10;
            }
            if (this.field1197 != -1L) {
                if (this.field1197 > this.field1199 && arg2 > 0) {
                    int var11 = (int) (this.field1197 - this.field1199) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field1199++;
                    }
                }
                long var12 = -1L;
                long var14 = -1L;
                if (this.field1197 >= var4 && this.field1197 < (long) var7 + var4) {
                    var12 = this.field1197;
                } else if (var4 >= this.field1197 && var4 < this.field1197 + (long) this.field1193) {
                    var12 = var4;
                }
                if (this.field1197 + (long) this.field1193 > var4 && this.field1197 + (long) this.field1193 <= (long) var7 + var4) {
                    var14 = this.field1197 + (long) this.field1193;
                } else if ((long) var7 + var4 > this.field1197 && (long) var7 + var4 <= this.field1197 + (long) this.field1193) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field1196, (int) (var12 - this.field1197), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field1199) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field1199));
                        this.field1199 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field1202 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("br.n(I)V")
    public void method1370() throws IOException {
        this.field1195 = 0;
        if (this.field1202 != this.field1199) {
            this.field1204.method1403(this.field1199);
            this.field1202 = this.field1199;
        }
        this.field1203 = this.field1199;
        while (this.field1195 < this.field1194.length) {
            int var1 = this.field1204.method1407(this.field1194, this.field1195, this.field1194.length - this.field1195);
            if (var1 == -1) {
                break;
            }
            this.field1202 += (long) var1;
            this.field1195 += var1;
        }
    }

    @ObfuscatedName("br.c([BIIB)V")
    public void method1371(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field1199 + (long) arg2 > this.field1201) {
                this.field1201 = this.field1199 + (long) arg2;
            }
            if (this.field1197 != -1L && (this.field1199 < this.field1197 || this.field1199 > this.field1197 + (long) this.field1193)) {
                this.method1382();
            }
            if (this.field1197 != -1L && this.field1199 + (long) arg2 > this.field1197 + (long) this.field1196.length) {
                int var4 = (int) ((long) this.field1196.length - (this.field1199 - this.field1197));
                System.arraycopy(arg0, arg1, this.field1196, (int) (this.field1199 - this.field1197), var4);
                this.field1199 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field1193 = this.field1196.length;
                this.method1382();
            }
            if (arg2 > this.field1196.length) {
                if (this.field1202 != this.field1199) {
                    this.field1204.method1403(this.field1199);
                    this.field1202 = this.field1199;
                }
                this.field1204.method1404(arg0, arg1, arg2);
                this.field1202 += (long) arg2;
                if (this.field1202 > this.field1200) {
                    this.field1200 = this.field1202;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field1199 >= this.field1203 && this.field1199 < this.field1203 + (long) this.field1195) {
                    var5 = this.field1199;
                } else if (this.field1203 >= this.field1199 && this.field1203 < this.field1199 + (long) arg2) {
                    var5 = this.field1203;
                }
                if (this.field1199 + (long) arg2 > this.field1203 && this.field1199 + (long) arg2 <= this.field1203 + (long) this.field1195) {
                    var7 = this.field1199 + (long) arg2;
                } else if (this.field1203 + (long) this.field1195 > this.field1199 && this.field1203 + (long) this.field1195 <= this.field1199 + (long) arg2) {
                    var7 = this.field1203 + (long) this.field1195;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field1199), this.field1194, (int) (var5 - this.field1203), var9);
                }
                this.field1199 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field1197 == -1L) {
                    this.field1197 = this.field1199;
                }
                System.arraycopy(arg0, arg1, this.field1196, (int) (this.field1199 - this.field1197), arg2);
                this.field1199 += (long) arg2;
                if (this.field1199 - this.field1197 > (long) this.field1193) {
                    this.field1193 = (int) (this.field1199 - this.field1197);
                }
            }
        } catch (IOException var11) {
            this.field1202 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("br.o(S)V")
    public void method1382() throws IOException {
        if (this.field1197 == -1L) {
            return;
        }
        if (this.field1202 != this.field1197) {
            this.field1204.method1403(this.field1197);
            this.field1202 = this.field1197;
        }
        this.field1204.method1404(this.field1196, 0, this.field1193);
        this.field1202 += (long) (this.field1193 * 2026342883) * -1732770869L;
        if (this.field1202 > this.field1200) {
            this.field1200 = this.field1202;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field1197 >= this.field1203 && this.field1197 < this.field1203 + (long) this.field1195) {
            var1 = this.field1197;
        } else if (this.field1203 >= this.field1197 && this.field1203 < this.field1197 + (long) this.field1193) {
            var1 = this.field1203;
        }
        if (this.field1197 + (long) this.field1193 > this.field1203 && this.field1197 + (long) this.field1193 <= this.field1203 + (long) this.field1195) {
            var3 = this.field1197 + (long) this.field1193;
        } else if (this.field1203 + (long) this.field1195 > this.field1197 && this.field1203 + (long) this.field1195 <= this.field1197 + (long) this.field1193) {
            var3 = this.field1203 + (long) this.field1195;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field1196, (int) (var1 - this.field1197), this.field1194, (int) (var1 - this.field1203), var5);
        }
        this.field1197 = -1L;
        this.field1193 = 0;
    }
}
