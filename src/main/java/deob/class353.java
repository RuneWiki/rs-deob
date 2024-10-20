package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("mz")
public class class353 {

    @ObfuscatedName("mz.v")
    public class354 field4088;

    @ObfuscatedName("mz.x")
    public byte[] field4087;

    @ObfuscatedName("mz.w")
    public long field4090 = -1L;

    @ObfuscatedName("mz.t")
    public int field4091;

    @ObfuscatedName("mz.j")
    public byte[] field4092;

    @ObfuscatedName("mz.n")
    public long field4093 = -1L;

    @ObfuscatedName("mz.p")
    public int field4097 = 0;

    @ObfuscatedName("mz.l")
    public long field4096;

    @ObfuscatedName("mz.z")
    public long field4094;

    @ObfuscatedName("mz.u")
    public long field4098;

    @ObfuscatedName("mz.e")
    public long field4089;

    public class353(class354 arg0, int arg1, int arg2) throws IOException {
        this.field4088 = arg0;
        this.field4098 = this.field4094 = arg0.method6134();
        this.field4087 = new byte[arg1];
        this.field4092 = new byte[arg2];
        this.field4096 = 0L;
    }

    @ObfuscatedName("mz.h(I)V")
    public void method6118() throws IOException {
        this.method6108();
        this.field4088.method6135();
    }

    @ObfuscatedName("mz.v(J)V")
    public void method6127(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field4096 = arg0;
    }

    @ObfuscatedName("mz.x(I)J")
    public long method6103() {
        return this.field4098;
    }

    @ObfuscatedName("mz.w([BB)V")
    public void method6104(byte[] arg0) throws IOException {
        this.method6105(arg0, 0, arg0.length);
    }

    @ObfuscatedName("mz.t([BIII)V")
    public void method6105(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field4093 != -1L && this.field4096 >= this.field4093 && this.field4096 + (long) arg2 <= this.field4093 + (long) this.field4097) {
                System.arraycopy(this.field4092, (int) (this.field4096 - this.field4093), arg0, arg1, arg2);
                this.field4096 += (long) arg2;
                return;
            }
            long var4 = this.field4096;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field4096 >= this.field4090 && this.field4096 < this.field4090 + (long) this.field4091) {
                int var8 = (int) ((long) this.field4091 - (this.field4096 - this.field4090));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field4087, (int) (this.field4096 - this.field4090), arg0, arg1, var8);
                this.field4096 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field4087.length) {
                this.field4088.method6130(this.field4096);
                this.field4089 = this.field4096;
                while (arg2 > 0) {
                    int var9 = this.field4088.method6133(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field4089 += (long) var9;
                    this.field4096 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method6106();
                int var10 = arg2;
                if (arg2 > this.field4091) {
                    var10 = this.field4091;
                }
                System.arraycopy(this.field4087, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field4096 += (long) var10;
            }
            if (this.field4093 != -1L) {
                if (this.field4093 > this.field4096 && arg2 > 0) {
                    int var11 = (int) (this.field4093 - this.field4096) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field4096++;
                    }
                }
                long var12 = -1L;
                long var14 = -1L;
                if (this.field4093 >= var4 && this.field4093 < (long) var7 + var4) {
                    var12 = this.field4093;
                } else if (var4 >= this.field4093 && var4 < this.field4093 + (long) this.field4097) {
                    var12 = var4;
                }
                if (this.field4093 + (long) this.field4097 > var4 && this.field4093 + (long) this.field4097 <= (long) var7 + var4) {
                    var14 = this.field4093 + (long) this.field4097;
                } else if ((long) var7 + var4 > this.field4093 && (long) var7 + var4 <= this.field4093 + (long) this.field4097) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field4092, (int) (var12 - this.field4093), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field4096) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field4096));
                        this.field4096 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field4089 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("mz.j(I)V")
    public void method6106() throws IOException {
        this.field4091 = 0;
        if (this.field4096 != this.field4089) {
            this.field4088.method6130(this.field4096);
            this.field4089 = this.field4096;
        }
        this.field4090 = this.field4096;
        while (this.field4091 < this.field4087.length) {
            int var1 = this.field4087.length - this.field4091;
            if (var1 > 200000000) {
                var1 = 200000000;
            }
            int var2 = this.field4088.method6133(this.field4087, this.field4091, var1);
            if (var2 == -1) {
                break;
            }
            this.field4089 += (long) var2;
            this.field4091 += var2;
        }
    }

    @ObfuscatedName("mz.n([BIIB)V")
    public void method6107(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field4096 + (long) arg2 > this.field4098) {
                this.field4098 = this.field4096 + (long) arg2;
            }
            if (this.field4093 != -1L && (this.field4096 < this.field4093 || this.field4096 > this.field4093 + (long) this.field4097)) {
                this.method6108();
            }
            if (this.field4093 != -1L && this.field4096 + (long) arg2 > this.field4093 + (long) this.field4092.length) {
                int var4 = (int) ((long) this.field4092.length - (this.field4096 - this.field4093));
                System.arraycopy(arg0, arg1, this.field4092, (int) (this.field4096 - this.field4093), var4);
                this.field4096 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field4097 = this.field4092.length;
                this.method6108();
            }
            if (arg2 > this.field4092.length) {
                if (this.field4096 != this.field4089) {
                    this.field4088.method6130(this.field4096);
                    this.field4089 = this.field4096;
                }
                this.field4088.method6131(arg0, arg1, arg2);
                this.field4089 += (long) arg2;
                if (this.field4089 > this.field4094) {
                    this.field4094 = this.field4089;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field4096 >= this.field4090 && this.field4096 < this.field4090 + (long) this.field4091) {
                    var5 = this.field4096;
                } else if (this.field4090 >= this.field4096 && this.field4090 < this.field4096 + (long) arg2) {
                    var5 = this.field4090;
                }
                if (this.field4096 + (long) arg2 > this.field4090 && this.field4096 + (long) arg2 <= this.field4090 + (long) this.field4091) {
                    var7 = this.field4096 + (long) arg2;
                } else if (this.field4090 + (long) this.field4091 > this.field4096 && this.field4090 + (long) this.field4091 <= this.field4096 + (long) arg2) {
                    var7 = this.field4090 + (long) this.field4091;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field4096), this.field4087, (int) (var5 - this.field4090), var9);
                }
                this.field4096 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field4093 == -1L) {
                    this.field4093 = this.field4096;
                }
                System.arraycopy(arg0, arg1, this.field4092, (int) (this.field4096 - this.field4093), arg2);
                this.field4096 += (long) arg2;
                if (this.field4096 - this.field4093 > (long) this.field4097) {
                    this.field4097 = (int) (this.field4096 - this.field4093);
                }
            }
        } catch (IOException var11) {
            this.field4089 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("mz.p(I)V")
    public void method6108() throws IOException {
        if (this.field4093 == -1L) {
            return;
        }
        if (this.field4093 != this.field4089) {
            this.field4088.method6130(this.field4093);
            this.field4089 = this.field4093;
        }
        this.field4088.method6131(this.field4092, 0, this.field4097);
        this.field4089 += (long) (this.field4097 * 1893510405) * 958797773L;
        if (this.field4089 > this.field4094) {
            this.field4094 = this.field4089;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field4093 >= this.field4090 && this.field4093 < this.field4090 + (long) this.field4091) {
            var1 = this.field4093;
        } else if (this.field4090 >= this.field4093 && this.field4090 < this.field4093 + (long) this.field4097) {
            var1 = this.field4090;
        }
        if (this.field4093 + (long) this.field4097 > this.field4090 && this.field4093 + (long) this.field4097 <= this.field4090 + (long) this.field4091) {
            var3 = this.field4093 + (long) this.field4097;
        } else if (this.field4090 + (long) this.field4091 > this.field4093 && this.field4090 + (long) this.field4091 <= this.field4093 + (long) this.field4097) {
            var3 = this.field4090 + (long) this.field4091;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field4092, (int) (var1 - this.field4093), this.field4087, (int) (var1 - this.field4090), var5);
        }
        this.field4093 = -1L;
        this.field4097 = 0;
    }
}
