package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("mm")
public class class342 {

    @ObfuscatedName("mm.n")
    public class343 field4049;

    @ObfuscatedName("mm.v")
    public byte[] field4059;

    @ObfuscatedName("mm.u")
    public long field4050 = -1L;

    @ObfuscatedName("mm.r")
    public int field4058;

    @ObfuscatedName("mm.p")
    public byte[] field4053;

    @ObfuscatedName("mm.q")
    public long field4054 = -1L;

    @ObfuscatedName("mm.m")
    public int field4051 = 0;

    @ObfuscatedName("mm.y")
    public long field4056;

    @ObfuscatedName("mm.i")
    public long field4057;

    @ObfuscatedName("mm.c")
    public long field4055;

    @ObfuscatedName("mm.b")
    public long field4048;

    public class342(class343 arg0, int arg1, int arg2) throws IOException {
        this.field4049 = arg0;
        this.field4055 = this.field4057 = arg0.method5982();
        this.field4059 = new byte[arg1];
        this.field4053 = new byte[arg2];
        this.field4056 = 0L;
    }

    @ObfuscatedName("mm.z(B)V")
    public void method5954() throws IOException {
        this.method5961();
        this.field4049.method5997();
    }

    @ObfuscatedName("mm.n(J)V")
    public void method5953(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field4056 = arg0;
    }

    @ObfuscatedName("mm.v(S)J")
    public long method5956() {
        return this.field4055;
    }

    @ObfuscatedName("mm.u([BI)V")
    public void method5962(byte[] arg0) throws IOException {
        this.method5969(arg0, 0, arg0.length);
    }

    @ObfuscatedName("mm.r([BIIB)V")
    public void method5969(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field4054 != -1L && this.field4056 >= this.field4054 && this.field4056 + (long) arg2 <= this.field4054 + (long) this.field4051) {
                System.arraycopy(this.field4053, (int) (this.field4056 - this.field4054), arg0, arg1, arg2);
                this.field4056 += (long) arg2;
                return;
            }
            long var4 = this.field4056;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field4056 >= this.field4050 && this.field4056 < this.field4050 + (long) this.field4058) {
                int var8 = (int) ((long) this.field4058 - (this.field4056 - this.field4050));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field4059, (int) (this.field4056 - this.field4050), arg0, arg1, var8);
                this.field4056 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field4059.length) {
                this.field4049.method5979(this.field4056);
                this.field4048 = this.field4056;
                while (arg2 > 0) {
                    int var9 = this.field4049.method5983(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field4048 += (long) var9;
                    this.field4056 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method5959();
                int var10 = arg2;
                if (arg2 > this.field4058) {
                    var10 = this.field4058;
                }
                System.arraycopy(this.field4059, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field4056 += (long) var10;
            }
            if (this.field4054 != -1L) {
                if (this.field4054 > this.field4056 && arg2 > 0) {
                    int var11 = (int) (this.field4054 - this.field4056) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field4056++;
                    }
                }
                long var12 = -1L;
                long var14 = -1L;
                if (this.field4054 >= var4 && this.field4054 < (long) var7 + var4) {
                    var12 = this.field4054;
                } else if (var4 >= this.field4054 && var4 < this.field4054 + (long) this.field4051) {
                    var12 = var4;
                }
                if (this.field4054 + (long) this.field4051 > var4 && this.field4054 + (long) this.field4051 <= (long) var7 + var4) {
                    var14 = this.field4054 + (long) this.field4051;
                } else if ((long) var7 + var4 > this.field4054 && (long) var7 + var4 <= this.field4054 + (long) this.field4051) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field4053, (int) (var12 - this.field4054), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field4056) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field4056));
                        this.field4056 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field4048 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("mm.p(B)V")
    public void method5959() throws IOException {
        this.field4058 = 0;
        if (this.field4056 != this.field4048) {
            this.field4049.method5979(this.field4056);
            this.field4048 = this.field4056;
        }
        this.field4050 = this.field4056;
        while (this.field4058 < this.field4059.length) {
            int var1 = this.field4059.length - this.field4058;
            if (var1 > 200000000) {
                var1 = 200000000;
            }
            int var2 = this.field4049.method5983(this.field4059, this.field4058, var1);
            if (var2 == -1) {
                break;
            }
            this.field4048 += (long) var2;
            this.field4058 += var2;
        }
    }

    @ObfuscatedName("mm.q([BIII)V")
    public void method5960(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field4056 + (long) arg2 > this.field4055) {
                this.field4055 = this.field4056 + (long) arg2;
            }
            if (this.field4054 != -1L && (this.field4056 < this.field4054 || this.field4056 > this.field4054 + (long) this.field4051)) {
                this.method5961();
            }
            if (this.field4054 != -1L && this.field4056 + (long) arg2 > this.field4054 + (long) this.field4053.length) {
                int var4 = (int) ((long) this.field4053.length - (this.field4056 - this.field4054));
                System.arraycopy(arg0, arg1, this.field4053, (int) (this.field4056 - this.field4054), var4);
                this.field4056 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field4051 = this.field4053.length;
                this.method5961();
            }
            if (arg2 > this.field4053.length) {
                if (this.field4056 != this.field4048) {
                    this.field4049.method5979(this.field4056);
                    this.field4048 = this.field4056;
                }
                this.field4049.method5993(arg0, arg1, arg2);
                this.field4048 += (long) arg2;
                if (this.field4048 > this.field4057) {
                    this.field4057 = this.field4048;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field4056 >= this.field4050 && this.field4056 < this.field4050 + (long) this.field4058) {
                    var5 = this.field4056;
                } else if (this.field4050 >= this.field4056 && this.field4050 < this.field4056 + (long) arg2) {
                    var5 = this.field4050;
                }
                if (this.field4056 + (long) arg2 > this.field4050 && this.field4056 + (long) arg2 <= this.field4050 + (long) this.field4058) {
                    var7 = this.field4056 + (long) arg2;
                } else if (this.field4050 + (long) this.field4058 > this.field4056 && this.field4050 + (long) this.field4058 <= this.field4056 + (long) arg2) {
                    var7 = this.field4050 + (long) this.field4058;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field4056), this.field4059, (int) (var5 - this.field4050), var9);
                }
                this.field4056 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field4054 == -1L) {
                    this.field4054 = this.field4056;
                }
                System.arraycopy(arg0, arg1, this.field4053, (int) (this.field4056 - this.field4054), arg2);
                this.field4056 += (long) arg2;
                if (this.field4056 - this.field4054 > (long) this.field4051) {
                    this.field4051 = (int) (this.field4056 - this.field4054);
                }
            }
        } catch (IOException var11) {
            this.field4048 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("mm.m(I)V")
    public void method5961() throws IOException {
        if (this.field4054 == -1L) {
            return;
        }
        if (this.field4054 != this.field4048) {
            this.field4049.method5979(this.field4054);
            this.field4048 = this.field4054;
        }
        this.field4049.method5993(this.field4053, 0, this.field4051);
        this.field4048 += (long) (this.field4051 * -1599618673) * 1704738159L;
        if (this.field4048 > this.field4057) {
            this.field4057 = this.field4048;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field4054 >= this.field4050 && this.field4054 < this.field4050 + (long) this.field4058) {
            var1 = this.field4054;
        } else if (this.field4050 >= this.field4054 && this.field4050 < this.field4054 + (long) this.field4051) {
            var1 = this.field4050;
        }
        if (this.field4054 + (long) this.field4051 > this.field4050 && this.field4054 + (long) this.field4051 <= this.field4050 + (long) this.field4058) {
            var3 = this.field4054 + (long) this.field4051;
        } else if (this.field4050 + (long) this.field4058 > this.field4054 && this.field4050 + (long) this.field4058 <= this.field4054 + (long) this.field4051) {
            var3 = this.field4050 + (long) this.field4058;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field4053, (int) (var1 - this.field4054), this.field4059, (int) (var1 - this.field4050), var5);
        }
        this.field4054 = -1L;
        this.field4051 = 0;
    }
}
