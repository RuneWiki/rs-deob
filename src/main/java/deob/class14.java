package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("j")
public class class14 {

    @ObfuscatedName("j.q")
    public class13 field217;

    @ObfuscatedName("j.l")
    public byte[] field209;

    @ObfuscatedName("j.a")
    public long field212 = -1L;

    @ObfuscatedName("j.o")
    public int field211;

    @ObfuscatedName("j.c")
    public byte[] field208;

    @ObfuscatedName("j.h")
    public long field213 = -1L;

    @ObfuscatedName("j.r")
    public int field214 = 0;

    @ObfuscatedName("j.d")
    public long field215;

    @ObfuscatedName("j.k")
    public long field216;

    @ObfuscatedName("j.u")
    public long field218;

    @ObfuscatedName("j.v")
    public long field210;

    public class14(class13 arg0, int arg1, int arg2) throws IOException {
        this.field217 = arg0;
        this.field218 = this.field216 = arg0.method106();
        this.field209 = new byte[arg1];
        this.field208 = new byte[arg2];
        this.field215 = 0L;
    }

    @ObfuscatedName("j.q(S)V")
    public void method126() throws IOException {
        this.method145();
        this.field217.method105();
    }

    @ObfuscatedName("j.l(J)V")
    public void method127(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field215 = arg0;
    }

    @ObfuscatedName("j.a(I)J")
    public long method128() {
        return this.field218;
    }

    @ObfuscatedName("j.o([BB)V")
    public void method129(byte[] arg0) throws IOException {
        this.method147(arg0, 0, arg0.length);
    }

    @ObfuscatedName("j.c([BIII)V")
    public void method147(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field213 != -1L && this.field215 >= this.field213 && this.field215 + (long) arg2 <= this.field213 + (long) this.field214) {
                System.arraycopy(this.field208, (int) (this.field215 - this.field213), arg0, arg1, arg2);
                this.field215 += (long) arg2;
                return;
            }
            long var4 = this.field215;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field215 >= this.field212 && this.field215 < this.field212 + (long) this.field211) {
                int var8 = (int) ((long) this.field211 - (this.field215 - this.field212));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field209, (int) (this.field215 - this.field212), arg0, arg1, var8);
                this.field215 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field209.length) {
                this.field217.method103(this.field215);
                this.field210 = this.field215;
                while (arg2 > 0) {
                    int var9 = this.field217.method107(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field210 += (long) var9;
                    this.field215 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method131();
                int var10 = arg2;
                if (arg2 > this.field211) {
                    var10 = this.field211;
                }
                System.arraycopy(this.field209, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field215 += (long) var10;
            }
            if (this.field213 != -1L) {
                if (this.field213 > this.field215 && arg2 > 0) {
                    int var11 = (int) (this.field213 - this.field215) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field215++;
                    }
                }
                long var12 = -1L;
                long var14 = -1L;
                if (this.field213 >= var4 && this.field213 < (long) var7 + var4) {
                    var12 = this.field213;
                } else if (var4 >= this.field213 && var4 < this.field213 + (long) this.field214) {
                    var12 = var4;
                }
                if (this.field213 + (long) this.field214 > var4 && this.field213 + (long) this.field214 <= (long) var7 + var4) {
                    var14 = this.field213 + (long) this.field214;
                } else if ((long) var7 + var4 > this.field213 && (long) var7 + var4 <= this.field213 + (long) this.field214) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field208, (int) (var12 - this.field213), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field215) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field215));
                        this.field215 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field210 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("j.h(I)V")
    public void method131() throws IOException {
        this.field211 = 0;
        if (this.field215 != this.field210) {
            this.field217.method103(this.field215);
            this.field210 = this.field215;
        }
        this.field212 = this.field215;
        while (this.field211 < this.field209.length) {
            int var1 = this.field217.method107(this.field209, this.field211, this.field209.length - this.field211);
            if (var1 == -1) {
                break;
            }
            this.field210 += (long) var1;
            this.field211 += var1;
        }
    }

    @ObfuscatedName("j.r([BIIS)V")
    public void method132(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field215 + (long) arg2 > this.field218) {
                this.field218 = this.field215 + (long) arg2;
            }
            if (this.field213 != -1L && (this.field215 < this.field213 || this.field215 > this.field213 + (long) this.field214)) {
                this.method145();
            }
            if (this.field213 != -1L && this.field215 + (long) arg2 > this.field213 + (long) this.field208.length) {
                int var4 = (int) ((long) this.field208.length - (this.field215 - this.field213));
                System.arraycopy(arg0, arg1, this.field208, (int) (this.field215 - this.field213), var4);
                this.field215 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field214 = this.field208.length;
                this.method145();
            }
            if (arg2 > this.field208.length) {
                if (this.field215 != this.field210) {
                    this.field217.method103(this.field215);
                    this.field210 = this.field215;
                }
                this.field217.method102(arg0, arg1, arg2);
                this.field210 += (long) arg2;
                if (this.field210 > this.field216) {
                    this.field216 = this.field210;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field215 >= this.field212 && this.field215 < this.field212 + (long) this.field211) {
                    var5 = this.field215;
                } else if (this.field212 >= this.field215 && this.field212 < this.field215 + (long) arg2) {
                    var5 = this.field212;
                }
                if (this.field215 + (long) arg2 > this.field212 && this.field215 + (long) arg2 <= this.field212 + (long) this.field211) {
                    var7 = this.field215 + (long) arg2;
                } else if (this.field212 + (long) this.field211 > this.field215 && this.field212 + (long) this.field211 <= this.field215 + (long) arg2) {
                    var7 = this.field212 + (long) this.field211;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field215), this.field209, (int) (var5 - this.field212), var9);
                }
                this.field215 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field213 == -1L) {
                    this.field213 = this.field215;
                }
                System.arraycopy(arg0, arg1, this.field208, (int) (this.field215 - this.field213), arg2);
                this.field215 += (long) arg2;
                if (this.field215 - this.field213 > (long) this.field214) {
                    this.field214 = (int) (this.field215 - this.field213);
                }
            }
        } catch (IOException var11) {
            this.field210 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("j.d(I)V")
    public void method145() throws IOException {
        if (this.field213 == -1L) {
            return;
        }
        if (this.field213 != this.field210) {
            this.field217.method103(this.field213);
            this.field210 = this.field213;
        }
        this.field217.method102(this.field208, 0, this.field214);
        this.field210 += (long) (this.field214 * 1524227367) * 792838807L;
        if (this.field210 > this.field216) {
            this.field216 = this.field210;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field213 >= this.field212 && this.field213 < this.field212 + (long) this.field211) {
            var1 = this.field213;
        } else if (this.field212 >= this.field213 && this.field212 < this.field213 + (long) this.field214) {
            var1 = this.field212;
        }
        if (this.field213 + (long) this.field214 > this.field212 && this.field213 + (long) this.field214 <= this.field212 + (long) this.field211) {
            var3 = this.field213 + (long) this.field214;
        } else if (this.field212 + (long) this.field211 > this.field213 && this.field212 + (long) this.field211 <= this.field213 + (long) this.field214) {
            var3 = this.field212 + (long) this.field211;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field208, (int) (var1 - this.field213), this.field209, (int) (var1 - this.field212), var5);
        }
        this.field213 = -1L;
        this.field214 = 0;
    }
}
