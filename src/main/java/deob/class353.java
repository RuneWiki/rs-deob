package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("me")
public class class353 {

    @ObfuscatedName("me.v")
    public class354 field4094;

    @ObfuscatedName("me.d")
    public byte[] field4088;

    @ObfuscatedName("me.c")
    public long field4089 = -1L;

    @ObfuscatedName("me.y")
    public int field4092;

    @ObfuscatedName("me.h")
    public byte[] field4091;

    @ObfuscatedName("me.z")
    public long field4090 = -1L;

    @ObfuscatedName("me.e")
    public int field4093 = 0;

    @ObfuscatedName("me.q")
    public long field4087;

    @ObfuscatedName("me.l")
    public long field4095;

    @ObfuscatedName("me.s")
    public long field4096;

    @ObfuscatedName("me.b")
    public long field4097;

    public class353(class354 arg0, int arg1, int arg2) throws IOException {
        this.field4094 = arg0;
        this.field4096 = this.field4095 = arg0.method6272();
        this.field4088 = new byte[arg1];
        this.field4091 = new byte[arg2];
        this.field4087 = 0L;
    }

    @ObfuscatedName("me.n(B)V")
    public void method6241() throws IOException {
        this.method6247();
        this.field4094.method6267();
    }

    @ObfuscatedName("me.v(J)V")
    public void method6242(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field4087 = arg0;
    }

    @ObfuscatedName("me.d(I)J")
    public long method6259() {
        return this.field4096;
    }

    @ObfuscatedName("me.c([BS)V")
    public void method6243(byte[] arg0) throws IOException {
        this.method6244(arg0, 0, arg0.length);
    }

    @ObfuscatedName("me.y([BIII)V")
    public void method6244(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field4090 != -1L && this.field4087 >= this.field4090 && this.field4087 + (long) arg2 <= this.field4090 + (long) this.field4093) {
                System.arraycopy(this.field4091, (int) (this.field4087 - this.field4090), arg0, arg1, arg2);
                this.field4087 += (long) arg2;
                return;
            }
            long var4 = this.field4087;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field4087 >= this.field4089 && this.field4087 < this.field4089 + (long) this.field4092) {
                int var8 = (int) ((long) this.field4092 - (this.field4087 - this.field4089));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field4088, (int) (this.field4087 - this.field4089), arg0, arg1, var8);
                this.field4087 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field4088.length) {
                this.field4094.method6280(this.field4087);
                this.field4097 = this.field4087;
                while (arg2 > 0) {
                    int var9 = this.field4094.method6269(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field4097 += (long) var9;
                    this.field4087 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method6249();
                int var10 = arg2;
                if (arg2 > this.field4092) {
                    var10 = this.field4092;
                }
                System.arraycopy(this.field4088, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field4087 += (long) var10;
            }
            if (this.field4090 != -1L) {
                if (this.field4090 > this.field4087 && arg2 > 0) {
                    int var11 = (int) (this.field4090 - this.field4087) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field4087++;
                    }
                }
                long var12 = -1L;
                long var14 = -1L;
                if (this.field4090 >= var4 && this.field4090 < (long) var7 + var4) {
                    var12 = this.field4090;
                } else if (var4 >= this.field4090 && var4 < this.field4090 + (long) this.field4093) {
                    var12 = var4;
                }
                if (this.field4090 + (long) this.field4093 > var4 && this.field4090 + (long) this.field4093 <= (long) var7 + var4) {
                    var14 = this.field4090 + (long) this.field4093;
                } else if ((long) var7 + var4 > this.field4090 && (long) var7 + var4 <= this.field4090 + (long) this.field4093) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field4091, (int) (var12 - this.field4090), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field4087) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field4087));
                        this.field4087 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field4097 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("me.h(I)V")
    public void method6249() throws IOException {
        this.field4092 = 0;
        if (this.field4097 != this.field4087) {
            this.field4094.method6280(this.field4087);
            this.field4097 = this.field4087;
        }
        this.field4089 = this.field4087;
        while (this.field4092 < this.field4088.length) {
            int var1 = this.field4088.length - this.field4092;
            if (var1 > 200000000) {
                var1 = 200000000;
            }
            int var2 = this.field4094.method6269(this.field4088, this.field4092, var1);
            if (var2 == -1) {
                break;
            }
            this.field4097 += (long) var2;
            this.field4092 += var2;
        }
    }

    @ObfuscatedName("me.z([BIII)V")
    public void method6246(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field4087 + (long) arg2 > this.field4096) {
                this.field4096 = this.field4087 + (long) arg2;
            }
            if (this.field4090 != -1L && (this.field4087 < this.field4090 || this.field4087 > this.field4090 + (long) this.field4093)) {
                this.method6247();
            }
            if (this.field4090 != -1L && this.field4087 + (long) arg2 > this.field4090 + (long) this.field4091.length) {
                int var4 = (int) ((long) this.field4091.length - (this.field4087 - this.field4090));
                System.arraycopy(arg0, arg1, this.field4091, (int) (this.field4087 - this.field4090), var4);
                this.field4087 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field4093 = this.field4091.length;
                this.method6247();
            }
            if (arg2 > this.field4091.length) {
                if (this.field4097 != this.field4087) {
                    this.field4094.method6280(this.field4087);
                    this.field4097 = this.field4087;
                }
                this.field4094.method6266(arg0, arg1, arg2);
                this.field4097 += (long) arg2;
                if (this.field4097 > this.field4095) {
                    this.field4095 = this.field4097;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field4087 >= this.field4089 && this.field4087 < this.field4089 + (long) this.field4092) {
                    var5 = this.field4087;
                } else if (this.field4089 >= this.field4087 && this.field4089 < this.field4087 + (long) arg2) {
                    var5 = this.field4089;
                }
                if (this.field4087 + (long) arg2 > this.field4089 && this.field4087 + (long) arg2 <= this.field4089 + (long) this.field4092) {
                    var7 = this.field4087 + (long) arg2;
                } else if (this.field4089 + (long) this.field4092 > this.field4087 && this.field4089 + (long) this.field4092 <= this.field4087 + (long) arg2) {
                    var7 = this.field4089 + (long) this.field4092;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field4087), this.field4088, (int) (var5 - this.field4089), var9);
                }
                this.field4087 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field4090 == -1L) {
                    this.field4090 = this.field4087;
                }
                System.arraycopy(arg0, arg1, this.field4091, (int) (this.field4087 - this.field4090), arg2);
                this.field4087 += (long) arg2;
                if (this.field4087 - this.field4090 > (long) this.field4093) {
                    this.field4093 = (int) (this.field4087 - this.field4090);
                }
            }
        } catch (IOException var11) {
            this.field4097 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("me.e(B)V")
    public void method6247() throws IOException {
        if (this.field4090 == -1L) {
            return;
        }
        if (this.field4097 != this.field4090) {
            this.field4094.method6280(this.field4090);
            this.field4097 = this.field4090;
        }
        this.field4094.method6266(this.field4091, 0, this.field4093);
        this.field4097 += (long) (this.field4093 * -1570188397) * 1100235419L;
        if (this.field4097 > this.field4095) {
            this.field4095 = this.field4097;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field4090 >= this.field4089 && this.field4090 < this.field4089 + (long) this.field4092) {
            var1 = this.field4090;
        } else if (this.field4089 >= this.field4090 && this.field4089 < this.field4090 + (long) this.field4093) {
            var1 = this.field4089;
        }
        if (this.field4090 + (long) this.field4093 > this.field4089 && this.field4090 + (long) this.field4093 <= this.field4089 + (long) this.field4092) {
            var3 = this.field4090 + (long) this.field4093;
        } else if (this.field4089 + (long) this.field4092 > this.field4090 && this.field4089 + (long) this.field4092 <= this.field4090 + (long) this.field4093) {
            var3 = this.field4089 + (long) this.field4092;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field4091, (int) (var1 - this.field4090), this.field4088, (int) (var1 - this.field4089), var5);
        }
        this.field4090 = -1L;
        this.field4093 = 0;
    }
}
