package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("mz")
public class class353 {

    @ObfuscatedName("mz.b")
    public class354 field4085;

    @ObfuscatedName("mz.l")
    public byte[] field4086;

    @ObfuscatedName("mz.m")
    public long field4088 = -1L;

    @ObfuscatedName("mz.z")
    public int field4087;

    @ObfuscatedName("mz.q")
    public byte[] field4090;

    @ObfuscatedName("mz.k")
    public long field4094 = -1L;

    @ObfuscatedName("mz.c")
    public int field4092 = 0;

    @ObfuscatedName("mz.u")
    public long field4091;

    @ObfuscatedName("mz.t")
    public long field4093;

    @ObfuscatedName("mz.e")
    public long field4095;

    @ObfuscatedName("mz.o")
    public long field4096;

    public class353(class354 arg0, int arg1, int arg2) throws IOException {
        this.field4085 = arg0;
        this.field4095 = this.field4093 = arg0.method6195();
        this.field4086 = new byte[arg1];
        this.field4090 = new byte[arg2];
        this.field4091 = 0L;
    }

    @ObfuscatedName("mz.f(B)V")
    public void method6154() throws IOException {
        this.method6169();
        this.field4085.method6181();
    }

    @ObfuscatedName("mz.b(J)V")
    public void method6155(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field4091 = arg0;
    }

    @ObfuscatedName("mz.l(I)J")
    public long method6162() {
        return this.field4095;
    }

    @ObfuscatedName("mz.m([BB)V")
    public void method6157(byte[] arg0) throws IOException {
        this.method6158(arg0, 0, arg0.length);
    }

    @ObfuscatedName("mz.z([BIII)V")
    public void method6158(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field4094 != -1L && this.field4091 >= this.field4094 && this.field4091 + (long) arg2 <= this.field4094 + (long) this.field4092) {
                System.arraycopy(this.field4090, (int) (this.field4091 - this.field4094), arg0, arg1, arg2);
                this.field4091 += (long) arg2;
                return;
            }
            long var4 = this.field4091;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field4091 >= this.field4088 && this.field4091 < this.field4088 + (long) this.field4087) {
                int var8 = (int) ((long) this.field4087 - (this.field4091 - this.field4088));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field4086, (int) (this.field4091 - this.field4088), arg0, arg1, var8);
                this.field4091 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field4086.length) {
                this.field4085.method6179(this.field4091);
                this.field4096 = this.field4091;
                while (arg2 > 0) {
                    int var9 = this.field4085.method6190(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field4096 += (long) var9;
                    this.field4091 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method6159();
                int var10 = arg2;
                if (arg2 > this.field4087) {
                    var10 = this.field4087;
                }
                System.arraycopy(this.field4086, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field4091 += (long) var10;
            }
            if (this.field4094 != -1L) {
                if (this.field4094 > this.field4091 && arg2 > 0) {
                    int var11 = (int) (this.field4094 - this.field4091) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field4091++;
                    }
                }
                long var12 = -1L;
                long var14 = -1L;
                if (this.field4094 >= var4 && this.field4094 < (long) var7 + var4) {
                    var12 = this.field4094;
                } else if (var4 >= this.field4094 && var4 < this.field4094 + (long) this.field4092) {
                    var12 = var4;
                }
                if (this.field4094 + (long) this.field4092 > var4 && this.field4094 + (long) this.field4092 <= (long) var7 + var4) {
                    var14 = this.field4094 + (long) this.field4092;
                } else if ((long) var7 + var4 > this.field4094 && (long) var7 + var4 <= this.field4094 + (long) this.field4092) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field4090, (int) (var12 - this.field4094), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field4091) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field4091));
                        this.field4091 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field4096 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("mz.q(I)V")
    public void method6159() throws IOException {
        this.field4087 = 0;
        if (this.field4096 != this.field4091) {
            this.field4085.method6179(this.field4091);
            this.field4096 = this.field4091;
        }
        this.field4088 = this.field4091;
        while (this.field4087 < this.field4086.length) {
            int var1 = this.field4086.length - this.field4087;
            if (var1 > 200000000) {
                var1 = 200000000;
            }
            int var2 = this.field4085.method6190(this.field4086, this.field4087, var1);
            if (var2 == -1) {
                break;
            }
            this.field4096 += (long) var2;
            this.field4087 += var2;
        }
    }

    @ObfuscatedName("mz.k([BIII)V")
    public void method6160(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field4091 + (long) arg2 > this.field4095) {
                this.field4095 = this.field4091 + (long) arg2;
            }
            if (this.field4094 != -1L && (this.field4091 < this.field4094 || this.field4091 > this.field4094 + (long) this.field4092)) {
                this.method6169();
            }
            if (this.field4094 != -1L && this.field4091 + (long) arg2 > this.field4094 + (long) this.field4090.length) {
                int var4 = (int) ((long) this.field4090.length - (this.field4091 - this.field4094));
                System.arraycopy(arg0, arg1, this.field4090, (int) (this.field4091 - this.field4094), var4);
                this.field4091 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field4092 = this.field4090.length;
                this.method6169();
            }
            if (arg2 > this.field4090.length) {
                if (this.field4096 != this.field4091) {
                    this.field4085.method6179(this.field4091);
                    this.field4096 = this.field4091;
                }
                this.field4085.method6199(arg0, arg1, arg2);
                this.field4096 += (long) arg2;
                if (this.field4096 > this.field4093) {
                    this.field4093 = this.field4096;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field4091 >= this.field4088 && this.field4091 < this.field4088 + (long) this.field4087) {
                    var5 = this.field4091;
                } else if (this.field4088 >= this.field4091 && this.field4088 < this.field4091 + (long) arg2) {
                    var5 = this.field4088;
                }
                if (this.field4091 + (long) arg2 > this.field4088 && this.field4091 + (long) arg2 <= this.field4088 + (long) this.field4087) {
                    var7 = this.field4091 + (long) arg2;
                } else if (this.field4088 + (long) this.field4087 > this.field4091 && this.field4088 + (long) this.field4087 <= this.field4091 + (long) arg2) {
                    var7 = this.field4088 + (long) this.field4087;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field4091), this.field4086, (int) (var5 - this.field4088), var9);
                }
                this.field4091 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field4094 == -1L) {
                    this.field4094 = this.field4091;
                }
                System.arraycopy(arg0, arg1, this.field4090, (int) (this.field4091 - this.field4094), arg2);
                this.field4091 += (long) arg2;
                if (this.field4091 - this.field4094 > (long) this.field4092) {
                    this.field4092 = (int) (this.field4091 - this.field4094);
                }
            }
        } catch (IOException var11) {
            this.field4096 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("mz.c(I)V")
    public void method6169() throws IOException {
        if (this.field4094 == -1L) {
            return;
        }
        if (this.field4096 != this.field4094) {
            this.field4085.method6179(this.field4094);
            this.field4096 = this.field4094;
        }
        this.field4085.method6199(this.field4090, 0, this.field4092);
        this.field4096 += (long) (this.field4092 * 1738419687) * 1024497111L;
        if (this.field4096 > this.field4093) {
            this.field4093 = this.field4096;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field4094 >= this.field4088 && this.field4094 < this.field4088 + (long) this.field4087) {
            var1 = this.field4094;
        } else if (this.field4088 >= this.field4094 && this.field4088 < this.field4094 + (long) this.field4092) {
            var1 = this.field4088;
        }
        if (this.field4094 + (long) this.field4092 > this.field4088 && this.field4094 + (long) this.field4092 <= this.field4088 + (long) this.field4087) {
            var3 = this.field4094 + (long) this.field4092;
        } else if (this.field4088 + (long) this.field4087 > this.field4094 && this.field4088 + (long) this.field4087 <= this.field4094 + (long) this.field4092) {
            var3 = this.field4088 + (long) this.field4087;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field4090, (int) (var1 - this.field4094), this.field4086, (int) (var1 - this.field4088), var5);
        }
        this.field4094 = -1L;
        this.field4092 = 0;
    }
}
