package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("nq")
public class class386 {

    @ObfuscatedName("nq.q")
    public class385 field4241;

    @ObfuscatedName("nq.f")
    public byte[] field4245;

    @ObfuscatedName("nq.j")
    public long field4246 = -1L;

    @ObfuscatedName("nq.m")
    public int field4244;

    @ObfuscatedName("nq.k")
    public byte[] field4248;

    @ObfuscatedName("nq.t")
    public long field4242 = -1L;

    @ObfuscatedName("nq.a")
    public int field4247 = 0;

    @ObfuscatedName("nq.e")
    public long field4240;

    @ObfuscatedName("nq.i")
    public long field4249;

    @ObfuscatedName("nq.y")
    public long field4250;

    @ObfuscatedName("nq.w")
    public long field4251;

    public class386(class385 arg0, int arg1, int arg2) throws IOException {
        this.field4241 = arg0;
        this.field4250 = this.field4249 = arg0.method6100();
        this.field4245 = new byte[arg1];
        this.field4248 = new byte[arg2];
        this.field4240 = 0L;
    }

    @ObfuscatedName("nq.l(I)V")
    public void method6114() throws IOException {
        this.method6121();
        this.field4241.method6092();
    }

    @ObfuscatedName("nq.q(J)V")
    public void method6115(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field4240 = arg0;
    }

    @ObfuscatedName("nq.f(I)J")
    public long method6116() {
        return this.field4250;
    }

    @ObfuscatedName("nq.j([BI)V")
    public void method6117(byte[] arg0) throws IOException {
        this.method6143(arg0, 0, arg0.length);
    }

    @ObfuscatedName("nq.m([BIII)V")
    public void method6143(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field4242 != -1L && this.field4240 >= this.field4242 && this.field4240 + (long) arg2 <= this.field4242 + (long) this.field4247) {
                System.arraycopy(this.field4248, (int) (this.field4240 - this.field4242), arg0, arg1, arg2);
                this.field4240 += (long) arg2;
                return;
            }
            long var4 = this.field4240;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field4240 >= this.field4246 && this.field4240 < this.field4246 + (long) this.field4244) {
                int var8 = (int) ((long) this.field4244 - (this.field4240 - this.field4246));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field4245, (int) (this.field4240 - this.field4246), arg0, arg1, var8);
                this.field4240 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field4245.length) {
                this.field4241.method6093(this.field4240);
                this.field4251 = this.field4240;
                while (arg2 > 0) {
                    int var9 = this.field4241.method6096(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field4251 += (long) var9;
                    this.field4240 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method6119();
                int var10 = arg2;
                if (arg2 > this.field4244) {
                    var10 = this.field4244;
                }
                System.arraycopy(this.field4245, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field4240 += (long) var10;
            }
            if (this.field4242 != -1L) {
                if (this.field4242 > this.field4240 && arg2 > 0) {
                    int var11 = (int) (this.field4242 - this.field4240) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field4240++;
                    }
                }
                long var12 = -1L;
                long var14 = -1L;
                if (this.field4242 >= var4 && this.field4242 < (long) var7 + var4) {
                    var12 = this.field4242;
                } else if (var4 >= this.field4242 && var4 < this.field4242 + (long) this.field4247) {
                    var12 = var4;
                }
                if (this.field4242 + (long) this.field4247 > var4 && this.field4242 + (long) this.field4247 <= (long) var7 + var4) {
                    var14 = this.field4242 + (long) this.field4247;
                } else if ((long) var7 + var4 > this.field4242 && (long) var7 + var4 <= this.field4242 + (long) this.field4247) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field4248, (int) (var12 - this.field4242), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field4240) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field4240));
                        this.field4240 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field4251 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("nq.k(B)V")
    public void method6119() throws IOException {
        this.field4244 = 0;
        if (this.field4251 != this.field4240) {
            this.field4241.method6093(this.field4240);
            this.field4251 = this.field4240;
        }
        this.field4246 = this.field4240;
        while (this.field4244 < this.field4245.length) {
            int var1 = this.field4245.length - this.field4244;
            if (var1 > 200000000) {
                var1 = 200000000;
            }
            int var2 = this.field4241.method6096(this.field4245, this.field4244, var1);
            if (var2 == -1) {
                break;
            }
            this.field4251 += (long) var2;
            this.field4244 += var2;
        }
    }

    @ObfuscatedName("nq.t([BIIB)V")
    public void method6124(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field4240 + (long) arg2 > this.field4250) {
                this.field4250 = this.field4240 + (long) arg2;
            }
            if (this.field4242 != -1L && (this.field4240 < this.field4242 || this.field4240 > this.field4242 + (long) this.field4247)) {
                this.method6121();
            }
            if (this.field4242 != -1L && this.field4240 + (long) arg2 > this.field4242 + (long) this.field4248.length) {
                int var4 = (int) ((long) this.field4248.length - (this.field4240 - this.field4242));
                System.arraycopy(arg0, arg1, this.field4248, (int) (this.field4240 - this.field4242), var4);
                this.field4240 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field4247 = this.field4248.length;
                this.method6121();
            }
            if (arg2 > this.field4248.length) {
                if (this.field4251 != this.field4240) {
                    this.field4241.method6093(this.field4240);
                    this.field4251 = this.field4240;
                }
                this.field4241.method6094(arg0, arg1, arg2);
                this.field4251 += (long) arg2;
                if (this.field4251 > this.field4249) {
                    this.field4249 = this.field4251;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field4240 >= this.field4246 && this.field4240 < this.field4246 + (long) this.field4244) {
                    var5 = this.field4240;
                } else if (this.field4246 >= this.field4240 && this.field4246 < this.field4240 + (long) arg2) {
                    var5 = this.field4246;
                }
                if (this.field4240 + (long) arg2 > this.field4246 && this.field4240 + (long) arg2 <= this.field4246 + (long) this.field4244) {
                    var7 = this.field4240 + (long) arg2;
                } else if (this.field4246 + (long) this.field4244 > this.field4240 && this.field4246 + (long) this.field4244 <= this.field4240 + (long) arg2) {
                    var7 = this.field4246 + (long) this.field4244;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field4240), this.field4245, (int) (var5 - this.field4246), var9);
                }
                this.field4240 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field4242 == -1L) {
                    this.field4242 = this.field4240;
                }
                System.arraycopy(arg0, arg1, this.field4248, (int) (this.field4240 - this.field4242), arg2);
                this.field4240 += (long) arg2;
                if (this.field4240 - this.field4242 > (long) this.field4247) {
                    this.field4247 = (int) (this.field4240 - this.field4242);
                }
            }
        } catch (IOException var11) {
            this.field4251 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("nq.a(B)V")
    public void method6121() throws IOException {
        if (this.field4242 == -1L) {
            return;
        }
        if (this.field4251 != this.field4242) {
            this.field4241.method6093(this.field4242);
            this.field4251 = this.field4242;
        }
        this.field4241.method6094(this.field4248, 0, this.field4247);
        this.field4251 += (long) (this.field4247 * -1515436749) * -134660613L;
        if (this.field4251 > this.field4249) {
            this.field4249 = this.field4251;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field4242 >= this.field4246 && this.field4242 < this.field4246 + (long) this.field4244) {
            var1 = this.field4242;
        } else if (this.field4246 >= this.field4242 && this.field4246 < this.field4242 + (long) this.field4247) {
            var1 = this.field4246;
        }
        if (this.field4242 + (long) this.field4247 > this.field4246 && this.field4242 + (long) this.field4247 <= this.field4246 + (long) this.field4244) {
            var3 = this.field4242 + (long) this.field4247;
        } else if (this.field4246 + (long) this.field4244 > this.field4242 && this.field4246 + (long) this.field4244 <= this.field4242 + (long) this.field4247) {
            var3 = this.field4246 + (long) this.field4244;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field4248, (int) (var1 - this.field4242), this.field4245, (int) (var1 - this.field4246), var5);
        }
        this.field4242 = -1L;
        this.field4247 = 0;
    }
}
