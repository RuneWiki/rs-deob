package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("nm")
public class class385 {

    @ObfuscatedName("nm.c")
    public class384 field4225;

    @ObfuscatedName("nm.m")
    public byte[] field4217;

    @ObfuscatedName("nm.k")
    public long field4218 = -1L;

    @ObfuscatedName("nm.o")
    public int field4220;

    @ObfuscatedName("nm.g")
    public byte[] field4215;

    @ObfuscatedName("nm.z")
    public long field4221 = -1L;

    @ObfuscatedName("nm.a")
    public int field4222 = 0;

    @ObfuscatedName("nm.u")
    public long field4216;

    @ObfuscatedName("nm.e")
    public long field4224;

    @ObfuscatedName("nm.l")
    public long field4219;

    @ObfuscatedName("nm.y")
    public long field4226;

    public class385(class384 arg0, int arg1, int arg2) throws IOException {
        this.field4225 = arg0;
        this.field4219 = this.field4224 = arg0.method6058();
        this.field4217 = new byte[arg1];
        this.field4215 = new byte[arg2];
        this.field4216 = 0L;
    }

    @ObfuscatedName("nm.n(I)V")
    public void method6075() throws IOException {
        this.method6082();
        this.field4225.method6070();
    }

    @ObfuscatedName("nm.c(J)V")
    public void method6076(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field4216 = arg0;
    }

    @ObfuscatedName("nm.m(I)J")
    public long method6077() {
        return this.field4219;
    }

    @ObfuscatedName("nm.k([BB)V")
    public void method6094(byte[] arg0) throws IOException {
        this.method6079(arg0, 0, arg0.length);
    }

    @ObfuscatedName("nm.o([BIIB)V")
    public void method6079(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field4221 != -1L && this.field4216 >= this.field4221 && this.field4216 + (long) arg2 <= this.field4221 + (long) this.field4222) {
                System.arraycopy(this.field4215, (int) (this.field4216 - this.field4221), arg0, arg1, arg2);
                this.field4216 += (long) arg2;
                return;
            }
            long var4 = this.field4216;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field4216 >= this.field4218 && this.field4216 < this.field4218 + (long) this.field4220) {
                int var8 = (int) ((long) this.field4220 - (this.field4216 - this.field4218));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field4217, (int) (this.field4216 - this.field4218), arg0, arg1, var8);
                this.field4216 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field4217.length) {
                this.field4225.method6054(this.field4216);
                this.field4226 = this.field4216;
                while (arg2 > 0) {
                    int var9 = this.field4225.method6059(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field4226 += (long) var9;
                    this.field4216 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method6080();
                int var10 = arg2;
                if (arg2 > this.field4220) {
                    var10 = this.field4220;
                }
                System.arraycopy(this.field4217, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field4216 += (long) var10;
            }
            if (this.field4221 != -1L) {
                if (this.field4221 > this.field4216 && arg2 > 0) {
                    int var11 = (int) (this.field4221 - this.field4216) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field4216++;
                    }
                }
                long var12 = -1L;
                long var14 = -1L;
                if (this.field4221 >= var4 && this.field4221 < (long) var7 + var4) {
                    var12 = this.field4221;
                } else if (var4 >= this.field4221 && var4 < this.field4221 + (long) this.field4222) {
                    var12 = var4;
                }
                if (this.field4221 + (long) this.field4222 > var4 && this.field4221 + (long) this.field4222 <= (long) var7 + var4) {
                    var14 = this.field4221 + (long) this.field4222;
                } else if ((long) var7 + var4 > this.field4221 && (long) var7 + var4 <= this.field4221 + (long) this.field4222) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field4215, (int) (var12 - this.field4221), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field4216) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field4216));
                        this.field4216 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field4226 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("nm.g(I)V")
    public void method6080() throws IOException {
        this.field4220 = 0;
        if (this.field4226 != this.field4216) {
            this.field4225.method6054(this.field4216);
            this.field4226 = this.field4216;
        }
        this.field4218 = this.field4216;
        while (this.field4220 < this.field4217.length) {
            int var1 = this.field4217.length - this.field4220;
            if (var1 > 200000000) {
                var1 = 200000000;
            }
            int var2 = this.field4225.method6059(this.field4217, this.field4220, var1);
            if (var2 == -1) {
                break;
            }
            this.field4226 += (long) var2;
            this.field4220 += var2;
        }
    }

    @ObfuscatedName("nm.z([BIII)V")
    public void method6081(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field4216 + (long) arg2 > this.field4219) {
                this.field4219 = this.field4216 + (long) arg2;
            }
            if (this.field4221 != -1L && (this.field4216 < this.field4221 || this.field4216 > this.field4221 + (long) this.field4222)) {
                this.method6082();
            }
            if (this.field4221 != -1L && this.field4216 + (long) arg2 > this.field4221 + (long) this.field4215.length) {
                int var4 = (int) ((long) this.field4215.length - (this.field4216 - this.field4221));
                System.arraycopy(arg0, arg1, this.field4215, (int) (this.field4216 - this.field4221), var4);
                this.field4216 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field4222 = this.field4215.length;
                this.method6082();
            }
            if (arg2 > this.field4215.length) {
                if (this.field4226 != this.field4216) {
                    this.field4225.method6054(this.field4216);
                    this.field4226 = this.field4216;
                }
                this.field4225.method6055(arg0, arg1, arg2);
                this.field4226 += (long) arg2;
                if (this.field4226 > this.field4224) {
                    this.field4224 = this.field4226;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field4216 >= this.field4218 && this.field4216 < this.field4218 + (long) this.field4220) {
                    var5 = this.field4216;
                } else if (this.field4218 >= this.field4216 && this.field4218 < this.field4216 + (long) arg2) {
                    var5 = this.field4218;
                }
                if (this.field4216 + (long) arg2 > this.field4218 && this.field4216 + (long) arg2 <= this.field4218 + (long) this.field4220) {
                    var7 = this.field4216 + (long) arg2;
                } else if (this.field4218 + (long) this.field4220 > this.field4216 && this.field4218 + (long) this.field4220 <= this.field4216 + (long) arg2) {
                    var7 = this.field4218 + (long) this.field4220;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field4216), this.field4217, (int) (var5 - this.field4218), var9);
                }
                this.field4216 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field4221 == -1L) {
                    this.field4221 = this.field4216;
                }
                System.arraycopy(arg0, arg1, this.field4215, (int) (this.field4216 - this.field4221), arg2);
                this.field4216 += (long) arg2;
                if (this.field4216 - this.field4221 > (long) this.field4222) {
                    this.field4222 = (int) (this.field4216 - this.field4221);
                }
            }
        } catch (IOException var11) {
            this.field4226 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("nm.a(I)V")
    public void method6082() throws IOException {
        if (this.field4221 == -1L) {
            return;
        }
        if (this.field4226 != this.field4221) {
            this.field4225.method6054(this.field4221);
            this.field4226 = this.field4221;
        }
        this.field4225.method6055(this.field4215, 0, this.field4222);
        this.field4226 += (long) (this.field4222 * 586414067) * 823949627L;
        if (this.field4226 > this.field4224) {
            this.field4224 = this.field4226;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field4221 >= this.field4218 && this.field4221 < this.field4218 + (long) this.field4220) {
            var1 = this.field4221;
        } else if (this.field4218 >= this.field4221 && this.field4218 < this.field4221 + (long) this.field4222) {
            var1 = this.field4218;
        }
        if (this.field4221 + (long) this.field4222 > this.field4218 && this.field4221 + (long) this.field4222 <= this.field4218 + (long) this.field4220) {
            var3 = this.field4221 + (long) this.field4222;
        } else if (this.field4218 + (long) this.field4220 > this.field4221 && this.field4218 + (long) this.field4220 <= this.field4221 + (long) this.field4222) {
            var3 = this.field4218 + (long) this.field4220;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field4215, (int) (var1 - this.field4221), this.field4217, (int) (var1 - this.field4218), var5);
        }
        this.field4221 = -1L;
        this.field4222 = 0;
    }
}
