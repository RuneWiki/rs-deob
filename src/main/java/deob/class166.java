package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("aq")
public class class166 {

    @ObfuscatedName("aq.f")
    public long field2471;

    @ObfuscatedName("aq.d")
    public long field2470 = -1L;

    @ObfuscatedName("aq.b")
    public class168 field2478;

    @ObfuscatedName("aq.l")
    public int field2467 = 0;

    @ObfuscatedName("aq.j")
    public long field2480;

    @ObfuscatedName("aq.k")
    public long field2465 = -1L;

    @ObfuscatedName("aq.h")
    public byte[] field2466;

    @ObfuscatedName("aq.w")
    public int field2468;

    @ObfuscatedName("aq.t")
    public byte[] field2469;

    @ObfuscatedName("aq.s")
    public long field2473;

    @ObfuscatedName("aq.x")
    public long field2475;

    @ObfuscatedName("aq.b(I)V")
    public void method2876() throws IOException {
        this.method2881();
        this.field2478.method2913();
    }

    @ObfuscatedName("aq.h(J)V")
    public void method2877(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field2471 = arg0;
    }

    @ObfuscatedName("aq.k(I)J")
    public long method2878() {
        return this.field2480;
    }

    @ObfuscatedName("aq.t([BIIB)V")
    public void method2880(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field2470 != -1L && this.field2471 >= this.field2470 && this.field2471 + (long) arg2 <= this.field2470 + (long) this.field2467) {
                System.arraycopy(this.field2469, (int) (this.field2471 - this.field2470), arg0, arg1, arg2);
                this.field2471 += (long) arg2;
                return;
            }
            long var4 = this.field2471;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field2471 >= this.field2465 && this.field2471 < this.field2465 + (long) this.field2468) {
                int var8 = (int) ((long) this.field2468 - (this.field2471 - this.field2465));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field2466, (int) (this.field2471 - this.field2465), arg0, arg1, var8);
                this.field2471 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field2466.length) {
                this.field2478.method2921(this.field2471);
                this.field2475 = this.field2471;
                while (arg2 > 0) {
                    int var9 = this.field2478.method2910(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field2475 += (long) var9;
                    this.field2471 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method2882();
                int var10 = arg2;
                if (arg2 > this.field2468) {
                    var10 = this.field2468;
                }
                System.arraycopy(this.field2466, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field2471 += (long) var10;
            }
            if (this.field2470 != -1L) {
                if (this.field2470 > this.field2471 && arg2 > 0) {
                    int var11 = (int) (this.field2470 - this.field2471) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field2471++;
                    }
                }
                long var12 = -1L;
                long var14 = -1L;
                if (this.field2470 >= var4 && this.field2470 < (long) var7 + var4) {
                    var12 = this.field2470;
                } else if (var4 >= this.field2470 && var4 < this.field2470 + (long) this.field2467) {
                    var12 = var4;
                }
                if (this.field2470 + (long) this.field2467 > var4 && this.field2470 + (long) this.field2467 <= (long) var7 + var4) {
                    var14 = this.field2470 + (long) this.field2467;
                } else if ((long) var7 + var4 > this.field2470 && (long) var7 + var4 <= this.field2470 + (long) this.field2467) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field2469, (int) (var12 - this.field2470), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field2471) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field2471));
                        this.field2471 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field2475 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("aq.f(I)V")
    public void method2881() throws IOException {
        if (this.field2470 == -1L) {
            return;
        }
        if (this.field2475 != this.field2470) {
            this.field2478.method2921(this.field2470);
            this.field2475 = this.field2470;
        }
        this.field2478.method2912(this.field2469, 0, this.field2467);
        this.field2475 += (long) (this.field2467 * 880004445) * 826339061L;
        if (this.field2475 > this.field2473) {
            this.field2473 = this.field2475;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field2470 >= this.field2465 && this.field2470 < this.field2465 + (long) this.field2468) {
            var1 = this.field2470;
        } else if (this.field2465 >= this.field2470 && this.field2465 < this.field2470 + (long) this.field2467) {
            var1 = this.field2465;
        }
        if (this.field2470 + (long) this.field2467 > this.field2465 && this.field2470 + (long) this.field2467 <= this.field2465 + (long) this.field2468) {
            var3 = this.field2470 + (long) this.field2467;
        } else if (this.field2465 + (long) this.field2468 > this.field2470 && this.field2465 + (long) this.field2468 <= this.field2470 + (long) this.field2467) {
            var3 = this.field2465 + (long) this.field2468;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field2469, (int) (var1 - this.field2470), this.field2466, (int) (var1 - this.field2465), var5);
        }
        this.field2470 = -1L;
        this.field2467 = 0;
    }

    @ObfuscatedName("aq.d(I)V")
    public void method2882() throws IOException {
        this.field2468 = 0;
        if (this.field2475 != this.field2471) {
            this.field2478.method2921(this.field2471);
            this.field2475 = this.field2471;
        }
        this.field2465 = this.field2471;
        while (this.field2468 < this.field2466.length) {
            int var1 = this.field2478.method2910(this.field2466, this.field2468, this.field2466.length - this.field2468);
            if (var1 == -1) {
                break;
            }
            this.field2475 += (long) var1;
            this.field2468 += var1;
        }
    }

    @ObfuscatedName("aq.l([BIIB)V")
    public void method2883(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field2471 + (long) arg2 > this.field2480) {
                this.field2480 = this.field2471 + (long) arg2;
            }
            if (this.field2470 != -1L && (this.field2471 < this.field2470 || this.field2471 > this.field2470 + (long) this.field2467)) {
                this.method2881();
            }
            if (this.field2470 != -1L && this.field2471 + (long) arg2 > this.field2470 + (long) this.field2469.length) {
                int var4 = (int) ((long) this.field2469.length - (this.field2471 - this.field2470));
                System.arraycopy(arg0, arg1, this.field2469, (int) (this.field2471 - this.field2470), var4);
                this.field2471 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field2467 = this.field2469.length;
                this.method2881();
            }
            if (arg2 > this.field2469.length) {
                if (this.field2475 != this.field2471) {
                    this.field2478.method2921(this.field2471);
                    this.field2475 = this.field2471;
                }
                this.field2478.method2912(arg0, arg1, arg2);
                this.field2475 += (long) arg2;
                if (this.field2475 > this.field2473) {
                    this.field2473 = this.field2475;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field2471 >= this.field2465 && this.field2471 < this.field2465 + (long) this.field2468) {
                    var5 = this.field2471;
                } else if (this.field2465 >= this.field2471 && this.field2465 < this.field2471 + (long) arg2) {
                    var5 = this.field2465;
                }
                if (this.field2471 + (long) arg2 > this.field2465 && this.field2471 + (long) arg2 <= this.field2465 + (long) this.field2468) {
                    var7 = this.field2471 + (long) arg2;
                } else if (this.field2465 + (long) this.field2468 > this.field2471 && this.field2465 + (long) this.field2468 <= this.field2471 + (long) arg2) {
                    var7 = this.field2465 + (long) this.field2468;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field2471), this.field2466, (int) (var5 - this.field2465), var9);
                }
                this.field2471 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field2470 == -1L) {
                    this.field2470 = this.field2471;
                }
                System.arraycopy(arg0, arg1, this.field2469, (int) (this.field2471 - this.field2470), arg2);
                this.field2471 += (long) arg2;
                if (this.field2471 - this.field2470 > (long) this.field2467) {
                    this.field2467 = (int) (this.field2471 - this.field2470);
                }
            }
        } catch (IOException var11) {
            this.field2475 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("aq.w([BI)V")
    public void method2891(byte[] arg0) throws IOException {
        this.method2880(arg0, 0, arg0.length);
    }

    public class166(class168 arg0, int arg1, int arg2) throws IOException {
        this.field2478 = arg0;
        this.field2480 = this.field2473 = arg0.method2928();
        this.field2466 = new byte[arg1];
        this.field2469 = new byte[arg2];
        this.field2471 = 0L;
    }
}
