package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("mw")
public class class342 {

    @ObfuscatedName("mw.x")
    public class343 field4049;

    @ObfuscatedName("mw.t")
    public byte[] field4052;

    @ObfuscatedName("mw.g")
    public long field4051 = -1L;

    @ObfuscatedName("mw.l")
    public int field4053;

    @ObfuscatedName("mw.u")
    public byte[] field4048;

    @ObfuscatedName("mw.j")
    public long field4054 = -1L;

    @ObfuscatedName("mw.v")
    public int field4055 = 0;

    @ObfuscatedName("mw.d")
    public long field4056;

    @ObfuscatedName("mw.z")
    public long field4057;

    @ObfuscatedName("mw.n")
    public long field4058;

    @ObfuscatedName("mw.h")
    public long field4059;

    public class342(class343 arg0, int arg1, int arg2) throws IOException {
        this.field4049 = arg0;
        this.field4058 = this.field4057 = arg0.method6096();
        this.field4052 = new byte[arg1];
        this.field4048 = new byte[arg2];
        this.field4056 = 0L;
    }

    @ObfuscatedName("mw.c(I)V")
    public void method6078() throws IOException {
        this.method6076();
        this.field4049.method6094();
    }

    @ObfuscatedName("mw.x(J)V")
    public void method6071(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field4056 = arg0;
    }

    @ObfuscatedName("mw.t(I)J")
    public long method6072() {
        return this.field4058;
    }

    @ObfuscatedName("mw.g([BI)V")
    public void method6073(byte[] arg0) throws IOException {
        this.method6074(arg0, 0, arg0.length);
    }

    @ObfuscatedName("mw.l([BIIS)V")
    public void method6074(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field4054 != -1L && this.field4056 >= this.field4054 && this.field4056 + (long) arg2 <= this.field4054 + (long) this.field4055) {
                System.arraycopy(this.field4048, (int) (this.field4056 - this.field4054), arg0, arg1, arg2);
                this.field4056 += (long) arg2;
                return;
            }
            long var4 = this.field4056;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field4056 >= this.field4051 && this.field4056 < this.field4051 + (long) this.field4053) {
                int var8 = (int) ((long) this.field4053 - (this.field4056 - this.field4051));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field4052, (int) (this.field4056 - this.field4051), arg0, arg1, var8);
                this.field4056 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field4052.length) {
                this.field4049.method6106(this.field4056);
                this.field4059 = this.field4056;
                while (arg2 > 0) {
                    int var9 = this.field4049.method6097(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field4059 += (long) var9;
                    this.field4056 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method6070();
                int var10 = arg2;
                if (arg2 > this.field4053) {
                    var10 = this.field4053;
                }
                System.arraycopy(this.field4052, 0, arg0, arg1, var10);
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
                } else if (var4 >= this.field4054 && var4 < this.field4054 + (long) this.field4055) {
                    var12 = var4;
                }
                if (this.field4054 + (long) this.field4055 > var4 && this.field4054 + (long) this.field4055 <= (long) var7 + var4) {
                    var14 = this.field4054 + (long) this.field4055;
                } else if ((long) var7 + var4 > this.field4054 && (long) var7 + var4 <= this.field4054 + (long) this.field4055) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field4048, (int) (var12 - this.field4054), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field4056) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field4056));
                        this.field4056 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field4059 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("mw.u(I)V")
    public void method6070() throws IOException {
        this.field4053 = 0;
        if (this.field4059 != this.field4056) {
            this.field4049.method6106(this.field4056);
            this.field4059 = this.field4056;
        }
        this.field4051 = this.field4056;
        while (this.field4053 < this.field4052.length) {
            int var1 = this.field4052.length - this.field4053;
            if (var1 > 200000000) {
                var1 = 200000000;
            }
            int var2 = this.field4049.method6097(this.field4052, this.field4053, var1);
            if (var2 == -1) {
                break;
            }
            this.field4059 += (long) var2;
            this.field4053 += var2;
        }
    }

    @ObfuscatedName("mw.j([BIII)V")
    public void method6069(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field4056 + (long) arg2 > this.field4058) {
                this.field4058 = this.field4056 + (long) arg2;
            }
            if (this.field4054 != -1L && (this.field4056 < this.field4054 || this.field4056 > this.field4054 + (long) this.field4055)) {
                this.method6076();
            }
            if (this.field4054 != -1L && this.field4056 + (long) arg2 > this.field4054 + (long) this.field4048.length) {
                int var4 = (int) ((long) this.field4048.length - (this.field4056 - this.field4054));
                System.arraycopy(arg0, arg1, this.field4048, (int) (this.field4056 - this.field4054), var4);
                this.field4056 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field4055 = this.field4048.length;
                this.method6076();
            }
            if (arg2 > this.field4048.length) {
                if (this.field4059 != this.field4056) {
                    this.field4049.method6106(this.field4056);
                    this.field4059 = this.field4056;
                }
                this.field4049.method6102(arg0, arg1, arg2);
                this.field4059 += (long) arg2;
                if (this.field4059 > this.field4057) {
                    this.field4057 = this.field4059;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field4056 >= this.field4051 && this.field4056 < this.field4051 + (long) this.field4053) {
                    var5 = this.field4056;
                } else if (this.field4051 >= this.field4056 && this.field4051 < this.field4056 + (long) arg2) {
                    var5 = this.field4051;
                }
                if (this.field4056 + (long) arg2 > this.field4051 && this.field4056 + (long) arg2 <= this.field4051 + (long) this.field4053) {
                    var7 = this.field4056 + (long) arg2;
                } else if (this.field4051 + (long) this.field4053 > this.field4056 && this.field4051 + (long) this.field4053 <= this.field4056 + (long) arg2) {
                    var7 = this.field4051 + (long) this.field4053;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field4056), this.field4052, (int) (var5 - this.field4051), var9);
                }
                this.field4056 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field4054 == -1L) {
                    this.field4054 = this.field4056;
                }
                System.arraycopy(arg0, arg1, this.field4048, (int) (this.field4056 - this.field4054), arg2);
                this.field4056 += (long) arg2;
                if (this.field4056 - this.field4054 > (long) this.field4055) {
                    this.field4055 = (int) (this.field4056 - this.field4054);
                }
            }
        } catch (IOException var11) {
            this.field4059 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("mw.v(I)V")
    public void method6076() throws IOException {
        if (this.field4054 == -1L) {
            return;
        }
        if (this.field4059 != this.field4054) {
            this.field4049.method6106(this.field4054);
            this.field4059 = this.field4054;
        }
        this.field4049.method6102(this.field4048, 0, this.field4055);
        this.field4059 += (long) (this.field4055 * -1633237175) * 1970592505L;
        if (this.field4059 > this.field4057) {
            this.field4057 = this.field4059;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field4054 >= this.field4051 && this.field4054 < this.field4051 + (long) this.field4053) {
            var1 = this.field4054;
        } else if (this.field4051 >= this.field4054 && this.field4051 < this.field4054 + (long) this.field4055) {
            var1 = this.field4051;
        }
        if (this.field4054 + (long) this.field4055 > this.field4051 && this.field4054 + (long) this.field4055 <= this.field4051 + (long) this.field4053) {
            var3 = this.field4054 + (long) this.field4055;
        } else if (this.field4051 + (long) this.field4053 > this.field4054 && this.field4051 + (long) this.field4053 <= this.field4054 + (long) this.field4055) {
            var3 = this.field4051 + (long) this.field4053;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field4048, (int) (var1 - this.field4054), this.field4052, (int) (var1 - this.field4051), var5);
        }
        this.field4054 = -1L;
        this.field4055 = 0;
    }
}
