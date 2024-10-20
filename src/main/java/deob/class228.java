package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("hl")
public class class228 {

    @ObfuscatedName("hl.n")
    public class227 field3215;

    @ObfuscatedName("hl.q")
    public byte[] field3205;

    @ObfuscatedName("hl.c")
    public long field3206 = -1L;

    @ObfuscatedName("hl.l")
    public int field3207;

    @ObfuscatedName("hl.r")
    public byte[] field3208;

    @ObfuscatedName("hl.u")
    public long field3209 = -1L;

    @ObfuscatedName("hl.j")
    public int field3211 = 0;

    @ObfuscatedName("hl.w")
    public long field3214;

    @ObfuscatedName("hl.y")
    public long field3212;

    @ObfuscatedName("hl.o")
    public long field3213;

    @ObfuscatedName("hl.h")
    public long field3204;

    public class228(class227 arg0, int arg1, int arg2) throws IOException {
        this.field3215 = arg0;
        this.field3213 = this.field3212 = arg0.method3853();
        this.field3205 = new byte[arg1];
        this.field3208 = new byte[arg2];
        this.field3214 = 0L;
    }

    @ObfuscatedName("hl.n(I)V")
    public void method3880() throws IOException {
        this.method3877();
        this.field3215.method3852();
    }

    @ObfuscatedName("hl.q(J)V")
    public void method3870(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field3214 = arg0;
    }

    @ObfuscatedName("hl.c(I)J")
    public long method3878() {
        return this.field3213;
    }

    @ObfuscatedName("hl.l([BI)V")
    public void method3874(byte[] arg0) throws IOException {
        this.method3879(arg0, 0, arg0.length);
    }

    @ObfuscatedName("hl.r([BIII)V")
    public void method3879(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field3209 != -1L && this.field3214 >= this.field3209 && this.field3214 + (long) arg2 <= this.field3209 + (long) this.field3211) {
                System.arraycopy(this.field3208, (int) (this.field3214 - this.field3209), arg0, arg1, arg2);
                this.field3214 += (long) arg2;
                return;
            }
            long var4 = this.field3214;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field3214 >= this.field3206 && this.field3214 < this.field3206 + (long) this.field3207) {
                int var8 = (int) ((long) this.field3207 - (this.field3214 - this.field3206));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field3205, (int) (this.field3214 - this.field3206), arg0, arg1, var8);
                this.field3214 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field3205.length) {
                this.field3215.method3851(this.field3214);
                this.field3204 = this.field3214;
                while (arg2 > 0) {
                    int var9 = this.field3215.method3854(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field3204 += (long) var9;
                    this.field3214 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method3871();
                int var10 = arg2;
                if (arg2 > this.field3207) {
                    var10 = this.field3207;
                }
                System.arraycopy(this.field3205, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field3214 += (long) var10;
            }
            if (this.field3209 != -1L) {
                if (this.field3209 > this.field3214 && arg2 > 0) {
                    int var11 = (int) (this.field3209 - this.field3214) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field3214++;
                    }
                }
                long var12 = -1L;
                long var14 = -1L;
                if (this.field3209 >= var4 && this.field3209 < (long) var7 + var4) {
                    var12 = this.field3209;
                } else if (var4 >= this.field3209 && var4 < this.field3209 + (long) this.field3211) {
                    var12 = var4;
                }
                if (this.field3209 + (long) this.field3211 > var4 && this.field3209 + (long) this.field3211 <= (long) var7 + var4) {
                    var14 = this.field3209 + (long) this.field3211;
                } else if ((long) var7 + var4 > this.field3209 && (long) var7 + var4 <= this.field3209 + (long) this.field3211) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field3208, (int) (var12 - this.field3209), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field3214) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field3214));
                        this.field3214 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field3204 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("hl.u(B)V")
    public void method3871() throws IOException {
        this.field3207 = 0;
        if (this.field3214 != this.field3204) {
            this.field3215.method3851(this.field3214);
            this.field3204 = this.field3214;
        }
        this.field3206 = this.field3214;
        while (this.field3207 < this.field3205.length) {
            int var1 = this.field3215.method3854(this.field3205, this.field3207, this.field3205.length - this.field3207);
            if (var1 == -1) {
                break;
            }
            this.field3204 += (long) var1;
            this.field3207 += var1;
        }
    }

    @ObfuscatedName("hl.j([BIIB)V")
    public void method3875(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field3214 + (long) arg2 > this.field3213) {
                this.field3213 = this.field3214 + (long) arg2;
            }
            if (this.field3209 != -1L && (this.field3214 < this.field3209 || this.field3214 > this.field3209 + (long) this.field3211)) {
                this.method3877();
            }
            if (this.field3209 != -1L && this.field3214 + (long) arg2 > this.field3209 + (long) this.field3208.length) {
                int var4 = (int) ((long) this.field3208.length - (this.field3214 - this.field3209));
                System.arraycopy(arg0, arg1, this.field3208, (int) (this.field3214 - this.field3209), var4);
                this.field3214 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field3211 = this.field3208.length;
                this.method3877();
            }
            if (arg2 > this.field3208.length) {
                if (this.field3214 != this.field3204) {
                    this.field3215.method3851(this.field3214);
                    this.field3204 = this.field3214;
                }
                this.field3215.method3856(arg0, arg1, arg2);
                this.field3204 += (long) arg2;
                if (this.field3204 > this.field3212) {
                    this.field3212 = this.field3204;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field3214 >= this.field3206 && this.field3214 < this.field3206 + (long) this.field3207) {
                    var5 = this.field3214;
                } else if (this.field3206 >= this.field3214 && this.field3206 < this.field3214 + (long) arg2) {
                    var5 = this.field3206;
                }
                if (this.field3214 + (long) arg2 > this.field3206 && this.field3214 + (long) arg2 <= this.field3206 + (long) this.field3207) {
                    var7 = this.field3214 + (long) arg2;
                } else if (this.field3206 + (long) this.field3207 > this.field3214 && this.field3206 + (long) this.field3207 <= this.field3214 + (long) arg2) {
                    var7 = this.field3206 + (long) this.field3207;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field3214), this.field3205, (int) (var5 - this.field3206), var9);
                }
                this.field3214 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field3209 == -1L) {
                    this.field3209 = this.field3214;
                }
                System.arraycopy(arg0, arg1, this.field3208, (int) (this.field3214 - this.field3209), arg2);
                this.field3214 += (long) arg2;
                if (this.field3214 - this.field3209 > (long) this.field3211) {
                    this.field3211 = (int) (this.field3214 - this.field3209);
                }
            }
        } catch (IOException var11) {
            this.field3204 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("hl.w(B)V")
    public void method3877() throws IOException {
        if (this.field3209 == -1L) {
            return;
        }
        if (this.field3209 != this.field3204) {
            this.field3215.method3851(this.field3209);
            this.field3204 = this.field3209;
        }
        this.field3215.method3856(this.field3208, 0, this.field3211);
        this.field3204 += (long) (this.field3211 * 42475243) * -301819453L;
        if (this.field3204 > this.field3212) {
            this.field3212 = this.field3204;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field3209 >= this.field3206 && this.field3209 < this.field3206 + (long) this.field3207) {
            var1 = this.field3209;
        } else if (this.field3206 >= this.field3209 && this.field3206 < this.field3209 + (long) this.field3211) {
            var1 = this.field3206;
        }
        if (this.field3209 + (long) this.field3211 > this.field3206 && this.field3209 + (long) this.field3211 <= this.field3206 + (long) this.field3207) {
            var3 = this.field3209 + (long) this.field3211;
        } else if (this.field3206 + (long) this.field3207 > this.field3209 && this.field3206 + (long) this.field3207 <= this.field3209 + (long) this.field3211) {
            var3 = this.field3206 + (long) this.field3207;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field3208, (int) (var1 - this.field3209), this.field3205, (int) (var1 - this.field3206), var5);
        }
        this.field3209 = -1L;
        this.field3211 = 0;
    }
}
