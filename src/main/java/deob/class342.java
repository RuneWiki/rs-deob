package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("my")
public class class342 {

    @ObfuscatedName("my.i")
    public class343 field4049;

    @ObfuscatedName("my.y")
    public byte[] field4058;

    @ObfuscatedName("my.w")
    public long field4051 = -1L;

    @ObfuscatedName("my.p")
    public int field4055;

    @ObfuscatedName("my.b")
    public byte[] field4053;

    @ObfuscatedName("my.e")
    public long field4054 = -1L;

    @ObfuscatedName("my.x")
    public int field4057 = 0;

    @ObfuscatedName("my.a")
    public long field4056;

    @ObfuscatedName("my.d")
    public long field4052;

    @ObfuscatedName("my.c")
    public long field4048;

    @ObfuscatedName("my.o")
    public long field4059;

    public class342(class343 arg0, int arg1, int arg2) throws IOException {
        this.field4049 = arg0;
        this.field4048 = this.field4052 = arg0.method6098();
        this.field4058 = new byte[arg1];
        this.field4053 = new byte[arg2];
        this.field4056 = 0L;
    }

    @ObfuscatedName("my.f(I)V")
    public void method6083() throws IOException {
        this.method6069();
        this.field4049.method6105();
    }

    @ObfuscatedName("my.i(J)V")
    public void method6091(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field4056 = arg0;
    }

    @ObfuscatedName("my.y(B)J")
    public long method6072() {
        return this.field4048;
    }

    @ObfuscatedName("my.w([BB)V")
    public void method6073(byte[] arg0) throws IOException {
        this.method6074(arg0, 0, arg0.length);
    }

    @ObfuscatedName("my.p([BIIB)V")
    public void method6074(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field4054 != -1L && this.field4056 >= this.field4054 && this.field4056 + (long) arg2 <= this.field4054 + (long) this.field4057) {
                System.arraycopy(this.field4053, (int) (this.field4056 - this.field4054), arg0, arg1, arg2);
                this.field4056 += (long) arg2;
                return;
            }
            long var4 = this.field4056;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field4056 >= this.field4051 && this.field4056 < this.field4051 + (long) this.field4055) {
                int var8 = (int) ((long) this.field4055 - (this.field4056 - this.field4051));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field4058, (int) (this.field4056 - this.field4051), arg0, arg1, var8);
                this.field4056 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field4058.length) {
                this.field4049.method6094(this.field4056);
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
                this.method6075();
                int var10 = arg2;
                if (arg2 > this.field4055) {
                    var10 = this.field4055;
                }
                System.arraycopy(this.field4058, 0, arg0, arg1, var10);
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
                } else if (var4 >= this.field4054 && var4 < this.field4054 + (long) this.field4057) {
                    var12 = var4;
                }
                if (this.field4054 + (long) this.field4057 > var4 && this.field4054 + (long) this.field4057 <= (long) var7 + var4) {
                    var14 = this.field4054 + (long) this.field4057;
                } else if ((long) var7 + var4 > this.field4054 && (long) var7 + var4 <= this.field4054 + (long) this.field4057) {
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
            this.field4059 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("my.b(I)V")
    public void method6075() throws IOException {
        this.field4055 = 0;
        if (this.field4059 != this.field4056) {
            this.field4049.method6094(this.field4056);
            this.field4059 = this.field4056;
        }
        this.field4051 = this.field4056;
        while (this.field4055 < this.field4058.length) {
            int var1 = this.field4058.length - this.field4055;
            if (var1 > 200000000) {
                var1 = 200000000;
            }
            int var2 = this.field4049.method6097(this.field4058, this.field4055, var1);
            if (var2 == -1) {
                break;
            }
            this.field4059 += (long) var2;
            this.field4055 += var2;
        }
    }

    @ObfuscatedName("my.e([BIII)V")
    public void method6076(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field4056 + (long) arg2 > this.field4048) {
                this.field4048 = this.field4056 + (long) arg2;
            }
            if (this.field4054 != -1L && (this.field4056 < this.field4054 || this.field4056 > this.field4054 + (long) this.field4057)) {
                this.method6069();
            }
            if (this.field4054 != -1L && this.field4056 + (long) arg2 > this.field4054 + (long) this.field4053.length) {
                int var4 = (int) ((long) this.field4053.length - (this.field4056 - this.field4054));
                System.arraycopy(arg0, arg1, this.field4053, (int) (this.field4056 - this.field4054), var4);
                this.field4056 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field4057 = this.field4053.length;
                this.method6069();
            }
            if (arg2 > this.field4053.length) {
                if (this.field4059 != this.field4056) {
                    this.field4049.method6094(this.field4056);
                    this.field4059 = this.field4056;
                }
                this.field4049.method6095(arg0, arg1, arg2);
                this.field4059 += (long) arg2;
                if (this.field4059 > this.field4052) {
                    this.field4052 = this.field4059;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field4056 >= this.field4051 && this.field4056 < this.field4051 + (long) this.field4055) {
                    var5 = this.field4056;
                } else if (this.field4051 >= this.field4056 && this.field4051 < this.field4056 + (long) arg2) {
                    var5 = this.field4051;
                }
                if (this.field4056 + (long) arg2 > this.field4051 && this.field4056 + (long) arg2 <= this.field4051 + (long) this.field4055) {
                    var7 = this.field4056 + (long) arg2;
                } else if (this.field4051 + (long) this.field4055 > this.field4056 && this.field4051 + (long) this.field4055 <= this.field4056 + (long) arg2) {
                    var7 = this.field4051 + (long) this.field4055;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field4056), this.field4058, (int) (var5 - this.field4051), var9);
                }
                this.field4056 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field4054 == -1L) {
                    this.field4054 = this.field4056;
                }
                System.arraycopy(arg0, arg1, this.field4053, (int) (this.field4056 - this.field4054), arg2);
                this.field4056 += (long) arg2;
                if (this.field4056 - this.field4054 > (long) this.field4057) {
                    this.field4057 = (int) (this.field4056 - this.field4054);
                }
            }
        } catch (IOException var11) {
            this.field4059 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("my.x(B)V")
    public void method6069() throws IOException {
        if (this.field4054 == -1L) {
            return;
        }
        if (this.field4059 != this.field4054) {
            this.field4049.method6094(this.field4054);
            this.field4059 = this.field4054;
        }
        this.field4049.method6095(this.field4053, 0, this.field4057);
        this.field4059 += (long) (this.field4057 * -466302747) * 1565373677L;
        if (this.field4059 > this.field4052) {
            this.field4052 = this.field4059;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field4054 >= this.field4051 && this.field4054 < this.field4051 + (long) this.field4055) {
            var1 = this.field4054;
        } else if (this.field4051 >= this.field4054 && this.field4051 < this.field4054 + (long) this.field4057) {
            var1 = this.field4051;
        }
        if (this.field4054 + (long) this.field4057 > this.field4051 && this.field4054 + (long) this.field4057 <= this.field4051 + (long) this.field4055) {
            var3 = this.field4054 + (long) this.field4057;
        } else if (this.field4051 + (long) this.field4055 > this.field4054 && this.field4051 + (long) this.field4055 <= this.field4054 + (long) this.field4057) {
            var3 = this.field4051 + (long) this.field4055;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field4053, (int) (var1 - this.field4054), this.field4058, (int) (var1 - this.field4051), var5);
        }
        this.field4054 = -1L;
        this.field4057 = 0;
    }
}
