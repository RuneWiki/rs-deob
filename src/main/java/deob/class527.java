package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("uh")
public class class527 {

    @ObfuscatedName("uh.al")
    public class526 field5250;

    @ObfuscatedName("uh.aj")
    public byte[] field5243;

    @ObfuscatedName("uh.az")
    public long field5244 = -1L;

    @ObfuscatedName("uh.af")
    public int field5245;

    @ObfuscatedName("uh.aa")
    public byte[] field5241;

    @ObfuscatedName("uh.at")
    public long field5247 = -1L;

    @ObfuscatedName("uh.ab")
    public int field5242 = 0;

    @ObfuscatedName("uh.ac")
    public long field5246;

    @ObfuscatedName("uh.ao")
    public long field5249;

    @ObfuscatedName("uh.ah")
    public long field5251;

    @ObfuscatedName("uh.av")
    public long field5252;

    public class527(class526 arg0, int arg1, int arg2) throws IOException {
        this.field5250 = arg0;
        this.field5251 = this.field5249 = arg0.method8568();
        this.field5243 = new byte[arg1];
        this.field5241 = new byte[arg2];
        this.field5246 = 0L;
    }

    @ObfuscatedName("uh.ak(I)V")
    public void method8586() throws IOException {
        this.method8618();
        this.field5250.method8566();
    }

    @ObfuscatedName("uh.al(J)V")
    public void method8615(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field5246 = arg0;
    }

    @ObfuscatedName("uh.aj(I)J")
    public long method8593() {
        return this.field5251;
    }

    @ObfuscatedName("uh.az([BB)V")
    public void method8589(byte[] arg0) throws IOException {
        this.method8590(arg0, 0, arg0.length);
    }

    @ObfuscatedName("uh.af([BIII)V")
    public void method8590(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field5247 != -1L && this.field5246 >= this.field5247 && this.field5246 + (long) arg2 <= this.field5247 + (long) this.field5242) {
                System.arraycopy(this.field5241, (int) (this.field5246 - this.field5247), arg0, arg1, arg2);
                this.field5246 += (long) arg2;
                return;
            }
            long var4 = this.field5246;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field5246 >= this.field5244 && this.field5246 < this.field5244 + (long) this.field5245) {
                int var8 = (int) ((long) this.field5245 - (this.field5246 - this.field5244));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field5243, (int) (this.field5246 - this.field5244), arg0, arg1, var8);
                this.field5246 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field5243.length) {
                this.field5250.method8561(this.field5246);
                this.field5252 = this.field5246;
                while (arg2 > 0) {
                    int var9 = this.field5250.method8576(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field5252 += (long) var9;
                    this.field5246 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method8591();
                int var10 = arg2;
                if (arg2 > this.field5245) {
                    var10 = this.field5245;
                }
                System.arraycopy(this.field5243, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field5246 += (long) var10;
            }
            if (this.field5247 != -1L) {
                if (this.field5247 > this.field5246 && arg2 > 0) {
                    int var11 = (int) (this.field5247 - this.field5246) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field5246++;
                    }
                }
                long var12 = -1L;
                long var14 = -1L;
                if (this.field5247 >= var4 && this.field5247 < (long) var7 + var4) {
                    var12 = this.field5247;
                } else if (var4 >= this.field5247 && var4 < this.field5247 + (long) this.field5242) {
                    var12 = var4;
                }
                if (this.field5247 + (long) this.field5242 > var4 && this.field5247 + (long) this.field5242 <= (long) var7 + var4) {
                    var14 = this.field5247 + (long) this.field5242;
                } else if ((long) var7 + var4 > this.field5247 && (long) var7 + var4 <= this.field5247 + (long) this.field5242) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field5241, (int) (var12 - this.field5247), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field5246) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field5246));
                        this.field5246 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field5252 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("uh.aa(I)V")
    public void method8591() throws IOException {
        this.field5245 = 0;
        if (this.field5252 != this.field5246) {
            this.field5250.method8561(this.field5246);
            this.field5252 = this.field5246;
        }
        this.field5244 = this.field5246;
        while (this.field5245 < this.field5243.length) {
            int var1 = this.field5243.length - this.field5245;
            if (var1 > 200000000) {
                var1 = 200000000;
            }
            int var2 = this.field5250.method8576(this.field5243, this.field5245, var1);
            if (var2 == -1) {
                break;
            }
            this.field5252 += (long) var2;
            this.field5245 += var2;
        }
    }

    @ObfuscatedName("uh.at([BIIB)V")
    public void method8588(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field5246 + (long) arg2 > this.field5251) {
                this.field5251 = this.field5246 + (long) arg2;
            }
            if (this.field5247 != -1L && (this.field5246 < this.field5247 || this.field5246 > this.field5247 + (long) this.field5242)) {
                this.method8618();
            }
            if (this.field5247 != -1L && this.field5246 + (long) arg2 > this.field5247 + (long) this.field5241.length) {
                int var4 = (int) ((long) this.field5241.length - (this.field5246 - this.field5247));
                System.arraycopy(arg0, arg1, this.field5241, (int) (this.field5246 - this.field5247), var4);
                this.field5246 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field5242 = this.field5241.length;
                this.method8618();
            }
            if (arg2 > this.field5241.length) {
                if (this.field5252 != this.field5246) {
                    this.field5250.method8561(this.field5246);
                    this.field5252 = this.field5246;
                }
                this.field5250.method8562(arg0, arg1, arg2);
                this.field5252 += (long) arg2;
                if (this.field5252 > this.field5249) {
                    this.field5249 = this.field5252;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field5246 >= this.field5244 && this.field5246 < this.field5244 + (long) this.field5245) {
                    var5 = this.field5246;
                } else if (this.field5244 >= this.field5246 && this.field5244 < this.field5246 + (long) arg2) {
                    var5 = this.field5244;
                }
                if (this.field5246 + (long) arg2 > this.field5244 && this.field5246 + (long) arg2 <= this.field5244 + (long) this.field5245) {
                    var7 = this.field5246 + (long) arg2;
                } else if (this.field5244 + (long) this.field5245 > this.field5246 && this.field5244 + (long) this.field5245 <= this.field5246 + (long) arg2) {
                    var7 = this.field5244 + (long) this.field5245;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field5246), this.field5243, (int) (var5 - this.field5244), var9);
                }
                this.field5246 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field5247 == -1L) {
                    this.field5247 = this.field5246;
                }
                System.arraycopy(arg0, arg1, this.field5241, (int) (this.field5246 - this.field5247), arg2);
                this.field5246 += (long) arg2;
                if (this.field5246 - this.field5247 > (long) this.field5242) {
                    this.field5242 = (int) (this.field5246 - this.field5247);
                }
            }
        } catch (IOException var11) {
            this.field5252 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("uh.ab(B)V")
    public void method8618() throws IOException {
        if (this.field5247 == -1L) {
            return;
        }
        if (this.field5252 != this.field5247) {
            this.field5250.method8561(this.field5247);
            this.field5252 = this.field5247;
        }
        this.field5250.method8562(this.field5241, 0, this.field5242);
        this.field5252 += (long) (this.field5242 * 853095299) * 1253438251L;
        if (this.field5252 > this.field5249) {
            this.field5249 = this.field5252;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field5247 >= this.field5244 && this.field5247 < this.field5244 + (long) this.field5245) {
            var1 = this.field5247;
        } else if (this.field5244 >= this.field5247 && this.field5244 < this.field5247 + (long) this.field5242) {
            var1 = this.field5244;
        }
        if (this.field5247 + (long) this.field5242 > this.field5244 && this.field5247 + (long) this.field5242 <= this.field5244 + (long) this.field5245) {
            var3 = this.field5247 + (long) this.field5242;
        } else if (this.field5244 + (long) this.field5245 > this.field5247 && this.field5244 + (long) this.field5245 <= this.field5247 + (long) this.field5242) {
            var3 = this.field5244 + (long) this.field5245;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field5241, (int) (var1 - this.field5247), this.field5243, (int) (var1 - this.field5244), var5);
        }
        this.field5247 = -1L;
        this.field5242 = 0;
    }
}
