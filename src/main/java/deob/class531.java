package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("ua")
public class class531 {

    @ObfuscatedName("ua.ae")
    public class530 field5307;

    @ObfuscatedName("ua.ag")
    public byte[] field5308;

    @ObfuscatedName("ua.am")
    public long field5309 = -1L;

    @ObfuscatedName("ua.ax")
    public int field5310;

    @ObfuscatedName("ua.aq")
    public byte[] field5306;

    @ObfuscatedName("ua.af")
    public long field5312 = -1L;

    @ObfuscatedName("ua.at")
    public int field5313 = 0;

    @ObfuscatedName("ua.au")
    public long field5314;

    @ObfuscatedName("ua.ar")
    public long field5315;

    @ObfuscatedName("ua.al")
    public long field5316;

    @ObfuscatedName("ua.ad")
    public long field5317;

    public class531(class530 arg0, int arg1, int arg2) throws IOException {
        this.field5307 = arg0;
        this.field5316 = this.field5315 = arg0.method8727();
        this.field5308 = new byte[arg1];
        this.field5306 = new byte[arg2];
        this.field5314 = 0L;
    }

    @ObfuscatedName("ua.ac(B)V")
    public void method8770() throws IOException {
        this.method8753();
        this.field5307.method8725();
    }

    @ObfuscatedName("ua.ae(J)V")
    public void method8749(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field5314 = arg0;
    }

    @ObfuscatedName("ua.ag(I)J")
    public long method8748() {
        return this.field5316;
    }

    @ObfuscatedName("ua.am([BI)V")
    public void method8777(byte[] arg0) throws IOException {
        this.method8750(arg0, 0, arg0.length);
    }

    @ObfuscatedName("ua.ax([BIIB)V")
    public void method8750(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field5312 != -1L && this.field5314 >= this.field5312 && this.field5314 + (long) arg2 <= this.field5312 + (long) this.field5313) {
                System.arraycopy(this.field5306, (int) (this.field5314 - this.field5312), arg0, arg1, arg2);
                this.field5314 += (long) arg2;
                return;
            }
            long var4 = this.field5314;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field5314 >= this.field5309 && this.field5314 < this.field5309 + (long) this.field5310) {
                int var8 = (int) ((long) this.field5310 - (this.field5314 - this.field5309));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field5308, (int) (this.field5314 - this.field5309), arg0, arg1, var8);
                this.field5314 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field5308.length) {
                this.field5307.method8723(this.field5314);
                this.field5317 = this.field5314;
                while (arg2 > 0) {
                    int var9 = this.field5307.method8728(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field5317 += (long) var9;
                    this.field5314 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method8751();
                int var10 = arg2;
                if (arg2 > this.field5310) {
                    var10 = this.field5310;
                }
                System.arraycopy(this.field5308, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field5314 += (long) var10;
            }
            if (this.field5312 != -1L) {
                if (this.field5312 > this.field5314 && arg2 > 0) {
                    int var11 = (int) (this.field5312 - this.field5314) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field5314++;
                    }
                }
                long var12 = -1L;
                long var14 = -1L;
                if (this.field5312 >= var4 && this.field5312 < (long) var7 + var4) {
                    var12 = this.field5312;
                } else if (var4 >= this.field5312 && var4 < this.field5312 + (long) this.field5313) {
                    var12 = var4;
                }
                if (this.field5312 + (long) this.field5313 > var4 && this.field5312 + (long) this.field5313 <= (long) var7 + var4) {
                    var14 = this.field5312 + (long) this.field5313;
                } else if ((long) var7 + var4 > this.field5312 && (long) var7 + var4 <= this.field5312 + (long) this.field5313) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field5306, (int) (var12 - this.field5312), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field5314) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field5314));
                        this.field5314 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field5317 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("ua.aq(I)V")
    public void method8751() throws IOException {
        this.field5310 = 0;
        if (this.field5317 != this.field5314) {
            this.field5307.method8723(this.field5314);
            this.field5317 = this.field5314;
        }
        this.field5309 = this.field5314;
        while (this.field5310 < this.field5308.length) {
            int var1 = this.field5308.length - this.field5310;
            if (var1 > 200000000) {
                var1 = 200000000;
            }
            int var2 = this.field5307.method8728(this.field5308, this.field5310, var1);
            if (var2 == -1) {
                break;
            }
            this.field5317 += (long) var2;
            this.field5310 += var2;
        }
    }

    @ObfuscatedName("ua.af([BIIB)V")
    public void method8766(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field5314 + (long) arg2 > this.field5316) {
                this.field5316 = this.field5314 + (long) arg2;
            }
            if (this.field5312 != -1L && (this.field5314 < this.field5312 || this.field5314 > this.field5312 + (long) this.field5313)) {
                this.method8753();
            }
            if (this.field5312 != -1L && this.field5314 + (long) arg2 > this.field5312 + (long) this.field5306.length) {
                int var4 = (int) ((long) this.field5306.length - (this.field5314 - this.field5312));
                System.arraycopy(arg0, arg1, this.field5306, (int) (this.field5314 - this.field5312), var4);
                this.field5314 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field5313 = this.field5306.length;
                this.method8753();
            }
            if (arg2 > this.field5306.length) {
                if (this.field5317 != this.field5314) {
                    this.field5307.method8723(this.field5314);
                    this.field5317 = this.field5314;
                }
                this.field5307.method8732(arg0, arg1, arg2);
                this.field5317 += (long) arg2;
                if (this.field5317 > this.field5315) {
                    this.field5315 = this.field5317;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field5314 >= this.field5309 && this.field5314 < this.field5309 + (long) this.field5310) {
                    var5 = this.field5314;
                } else if (this.field5309 >= this.field5314 && this.field5309 < this.field5314 + (long) arg2) {
                    var5 = this.field5309;
                }
                if (this.field5314 + (long) arg2 > this.field5309 && this.field5314 + (long) arg2 <= this.field5309 + (long) this.field5310) {
                    var7 = this.field5314 + (long) arg2;
                } else if (this.field5309 + (long) this.field5310 > this.field5314 && this.field5309 + (long) this.field5310 <= this.field5314 + (long) arg2) {
                    var7 = this.field5309 + (long) this.field5310;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field5314), this.field5308, (int) (var5 - this.field5309), var9);
                }
                this.field5314 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field5312 == -1L) {
                    this.field5312 = this.field5314;
                }
                System.arraycopy(arg0, arg1, this.field5306, (int) (this.field5314 - this.field5312), arg2);
                this.field5314 += (long) arg2;
                if (this.field5314 - this.field5312 > (long) this.field5313) {
                    this.field5313 = (int) (this.field5314 - this.field5312);
                }
            }
        } catch (IOException var11) {
            this.field5317 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("ua.at(I)V")
    public void method8753() throws IOException {
        if (this.field5312 == -1L) {
            return;
        }
        if (this.field5317 != this.field5312) {
            this.field5307.method8723(this.field5312);
            this.field5317 = this.field5312;
        }
        this.field5307.method8732(this.field5306, 0, this.field5313);
        this.field5317 += (long) (this.field5313 * -329780871) * 962373833L;
        if (this.field5317 > this.field5315) {
            this.field5315 = this.field5317;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field5312 >= this.field5309 && this.field5312 < this.field5309 + (long) this.field5310) {
            var1 = this.field5312;
        } else if (this.field5309 >= this.field5312 && this.field5309 < this.field5312 + (long) this.field5313) {
            var1 = this.field5309;
        }
        if (this.field5312 + (long) this.field5313 > this.field5309 && this.field5312 + (long) this.field5313 <= this.field5309 + (long) this.field5310) {
            var3 = this.field5312 + (long) this.field5313;
        } else if (this.field5309 + (long) this.field5310 > this.field5312 && this.field5309 + (long) this.field5310 <= this.field5312 + (long) this.field5313) {
            var3 = this.field5309 + (long) this.field5310;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field5306, (int) (var1 - this.field5312), this.field5308, (int) (var1 - this.field5309), var5);
        }
        this.field5312 = -1L;
        this.field5313 = 0;
    }
}
