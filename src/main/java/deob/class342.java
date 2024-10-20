package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("mz")
public class class342 {

    @ObfuscatedName("mz.t")
    public class343 field4057;

    @ObfuscatedName("mz.n")
    public byte[] field4050;

    @ObfuscatedName("mz.q")
    public long field4049 = -1L;

    @ObfuscatedName("mz.v")
    public int field4048;

    @ObfuscatedName("mz.l")
    public byte[] field4051;

    @ObfuscatedName("mz.c")
    public long field4054 = -1L;

    @ObfuscatedName("mz.o")
    public int field4055 = 0;

    @ObfuscatedName("mz.i")
    public long field4056;

    @ObfuscatedName("mz.d")
    public long field4052;

    @ObfuscatedName("mz.m")
    public long field4058;

    @ObfuscatedName("mz.p")
    public long field4059;

    public class342(class343 arg0, int arg1, int arg2) throws IOException {
        this.field4057 = arg0;
        this.field4058 = this.field4052 = arg0.method6172();
        this.field4050 = new byte[arg1];
        this.field4051 = new byte[arg2];
        this.field4056 = 0L;
    }

    @ObfuscatedName("mz.a(B)V")
    public void method6127() throws IOException {
        this.method6134();
        this.field4057.method6156();
    }

    @ObfuscatedName("mz.t(J)V")
    public void method6147(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field4056 = arg0;
    }

    @ObfuscatedName("mz.n(B)J")
    public long method6145() {
        return this.field4058;
    }

    @ObfuscatedName("mz.q([BS)V")
    public void method6152(byte[] arg0) throws IOException {
        this.method6148(arg0, 0, arg0.length);
    }

    @ObfuscatedName("mz.v([BIII)V")
    public void method6148(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field4054 != -1L && this.field4056 >= this.field4054 && this.field4056 + (long) arg2 <= this.field4054 + (long) this.field4055) {
                System.arraycopy(this.field4051, (int) (this.field4056 - this.field4054), arg0, arg1, arg2);
                this.field4056 += (long) arg2;
                return;
            }
            long var4 = this.field4056;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field4056 >= this.field4049 && this.field4056 < this.field4049 + (long) this.field4048) {
                int var8 = (int) ((long) this.field4048 - (this.field4056 - this.field4049));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field4050, (int) (this.field4056 - this.field4049), arg0, arg1, var8);
                this.field4056 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field4050.length) {
                this.field4057.method6154(this.field4056);
                this.field4059 = this.field4056;
                while (arg2 > 0) {
                    int var9 = this.field4057.method6159(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field4059 += (long) var9;
                    this.field4056 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method6132();
                int var10 = arg2;
                if (arg2 > this.field4048) {
                    var10 = this.field4048;
                }
                System.arraycopy(this.field4050, 0, arg0, arg1, var10);
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
                    System.arraycopy(this.field4051, (int) (var12 - this.field4054), arg0, (int) (var12 - var4) + var6, var16);
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

    @ObfuscatedName("mz.l(B)V")
    public void method6132() throws IOException {
        this.field4048 = 0;
        if (this.field4059 != this.field4056) {
            this.field4057.method6154(this.field4056);
            this.field4059 = this.field4056;
        }
        this.field4049 = this.field4056;
        while (this.field4048 < this.field4050.length) {
            int var1 = this.field4050.length - this.field4048;
            if (var1 > 200000000) {
                var1 = 200000000;
            }
            int var2 = this.field4057.method6159(this.field4050, this.field4048, var1);
            if (var2 == -1) {
                break;
            }
            this.field4059 += (long) var2;
            this.field4048 += var2;
        }
    }

    @ObfuscatedName("mz.c([BIII)V")
    public void method6133(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field4056 + (long) arg2 > this.field4058) {
                this.field4058 = this.field4056 + (long) arg2;
            }
            if (this.field4054 != -1L && (this.field4056 < this.field4054 || this.field4056 > this.field4054 + (long) this.field4055)) {
                this.method6134();
            }
            if (this.field4054 != -1L && this.field4056 + (long) arg2 > this.field4054 + (long) this.field4051.length) {
                int var4 = (int) ((long) this.field4051.length - (this.field4056 - this.field4054));
                System.arraycopy(arg0, arg1, this.field4051, (int) (this.field4056 - this.field4054), var4);
                this.field4056 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field4055 = this.field4051.length;
                this.method6134();
            }
            if (arg2 > this.field4051.length) {
                if (this.field4059 != this.field4056) {
                    this.field4057.method6154(this.field4056);
                    this.field4059 = this.field4056;
                }
                this.field4057.method6158(arg0, arg1, arg2);
                this.field4059 += (long) arg2;
                if (this.field4059 > this.field4052) {
                    this.field4052 = this.field4059;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field4056 >= this.field4049 && this.field4056 < this.field4049 + (long) this.field4048) {
                    var5 = this.field4056;
                } else if (this.field4049 >= this.field4056 && this.field4049 < this.field4056 + (long) arg2) {
                    var5 = this.field4049;
                }
                if (this.field4056 + (long) arg2 > this.field4049 && this.field4056 + (long) arg2 <= this.field4049 + (long) this.field4048) {
                    var7 = this.field4056 + (long) arg2;
                } else if (this.field4049 + (long) this.field4048 > this.field4056 && this.field4049 + (long) this.field4048 <= this.field4056 + (long) arg2) {
                    var7 = this.field4049 + (long) this.field4048;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field4056), this.field4050, (int) (var5 - this.field4049), var9);
                }
                this.field4056 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field4054 == -1L) {
                    this.field4054 = this.field4056;
                }
                System.arraycopy(arg0, arg1, this.field4051, (int) (this.field4056 - this.field4054), arg2);
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

    @ObfuscatedName("mz.o(B)V")
    public void method6134() throws IOException {
        if (this.field4054 == -1L) {
            return;
        }
        if (this.field4059 != this.field4054) {
            this.field4057.method6154(this.field4054);
            this.field4059 = this.field4054;
        }
        this.field4057.method6158(this.field4051, 0, this.field4055);
        this.field4059 += (long) (this.field4055 * 1929925799) * 2068321047L;
        if (this.field4059 > this.field4052) {
            this.field4052 = this.field4059;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field4054 >= this.field4049 && this.field4054 < this.field4049 + (long) this.field4048) {
            var1 = this.field4054;
        } else if (this.field4049 >= this.field4054 && this.field4049 < this.field4054 + (long) this.field4055) {
            var1 = this.field4049;
        }
        if (this.field4054 + (long) this.field4055 > this.field4049 && this.field4054 + (long) this.field4055 <= this.field4049 + (long) this.field4048) {
            var3 = this.field4054 + (long) this.field4055;
        } else if (this.field4049 + (long) this.field4048 > this.field4054 && this.field4049 + (long) this.field4048 <= this.field4054 + (long) this.field4055) {
            var3 = this.field4049 + (long) this.field4048;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field4051, (int) (var1 - this.field4054), this.field4050, (int) (var1 - this.field4049), var5);
        }
        this.field4054 = -1L;
        this.field4055 = 0;
    }
}
