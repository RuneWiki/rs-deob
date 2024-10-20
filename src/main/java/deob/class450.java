package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("qa")
public class class450 {

    @ObfuscatedName("qa.e")
    public class449 field4851;

    @ObfuscatedName("qa.v")
    public byte[] field4857;

    @ObfuscatedName("qa.x")
    public long field4853 = -1L;

    @ObfuscatedName("qa.m")
    public int field4852;

    @ObfuscatedName("qa.q")
    public byte[] field4855;

    @ObfuscatedName("qa.f")
    public long field4850 = -1L;

    @ObfuscatedName("qa.r")
    public int field4856 = 0;

    @ObfuscatedName("qa.u")
    public long field4858;

    @ObfuscatedName("qa.b")
    public long field4859;

    @ObfuscatedName("qa.j")
    public long field4860;

    @ObfuscatedName("qa.g")
    public long field4861;

    public class450(class449 arg0, int arg1, int arg2) throws IOException {
        this.field4851 = arg0;
        this.field4860 = this.field4859 = arg0.method7572();
        this.field4857 = new byte[arg1];
        this.field4855 = new byte[arg2];
        this.field4858 = 0L;
    }

    @ObfuscatedName("qa.h(I)V")
    public void method7597() throws IOException {
        this.method7586();
        this.field4851.method7563();
    }

    @ObfuscatedName("qa.e(J)V")
    public void method7598(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field4858 = arg0;
    }

    @ObfuscatedName("qa.v(B)J")
    public long method7581() {
        return this.field4860;
    }

    @ObfuscatedName("qa.x([BB)V")
    public void method7582(byte[] arg0) throws IOException {
        this.method7579(arg0, 0, arg0.length);
    }

    @ObfuscatedName("qa.m([BIII)V")
    public void method7579(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field4850 != -1L && this.field4858 >= this.field4850 && this.field4858 + (long) arg2 <= this.field4850 + (long) this.field4856) {
                System.arraycopy(this.field4855, (int) (this.field4858 - this.field4850), arg0, arg1, arg2);
                this.field4858 += (long) arg2;
                return;
            }
            long var4 = this.field4858;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field4858 >= this.field4853 && this.field4858 < this.field4853 + (long) this.field4852) {
                int var8 = (int) ((long) this.field4852 - (this.field4858 - this.field4853));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field4857, (int) (this.field4858 - this.field4853), arg0, arg1, var8);
                this.field4858 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field4857.length) {
                this.field4851.method7561(this.field4858);
                this.field4861 = this.field4858;
                while (arg2 > 0) {
                    int var9 = this.field4851.method7566(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field4861 += (long) var9;
                    this.field4858 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method7584();
                int var10 = arg2;
                if (arg2 > this.field4852) {
                    var10 = this.field4852;
                }
                System.arraycopy(this.field4857, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field4858 += (long) var10;
            }
            if (this.field4850 != -1L) {
                if (this.field4850 > this.field4858 && arg2 > 0) {
                    int var11 = (int) (this.field4850 - this.field4858) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field4858++;
                    }
                }
                long var12 = -1L;
                long var14 = -1L;
                if (this.field4850 >= var4 && this.field4850 < (long) var7 + var4) {
                    var12 = this.field4850;
                } else if (var4 >= this.field4850 && var4 < this.field4850 + (long) this.field4856) {
                    var12 = var4;
                }
                if (this.field4850 + (long) this.field4856 > var4 && this.field4850 + (long) this.field4856 <= (long) var7 + var4) {
                    var14 = this.field4850 + (long) this.field4856;
                } else if ((long) var7 + var4 > this.field4850 && (long) var7 + var4 <= this.field4850 + (long) this.field4856) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field4855, (int) (var12 - this.field4850), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field4858) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field4858));
                        this.field4858 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field4861 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("qa.q(I)V")
    public void method7584() throws IOException {
        this.field4852 = 0;
        if (this.field4861 != this.field4858) {
            this.field4851.method7561(this.field4858);
            this.field4861 = this.field4858;
        }
        this.field4853 = this.field4858;
        while (this.field4852 < this.field4857.length) {
            int var1 = this.field4857.length - this.field4852;
            if (var1 > 200000000) {
                var1 = 200000000;
            }
            int var2 = this.field4851.method7566(this.field4857, this.field4852, var1);
            if (var2 == -1) {
                break;
            }
            this.field4861 += (long) var2;
            this.field4852 += var2;
        }
    }

    @ObfuscatedName("qa.f([BIII)V")
    public void method7596(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field4858 + (long) arg2 > this.field4860) {
                this.field4860 = this.field4858 + (long) arg2;
            }
            if (this.field4850 != -1L && (this.field4858 < this.field4850 || this.field4858 > this.field4850 + (long) this.field4856)) {
                this.method7586();
            }
            if (this.field4850 != -1L && this.field4858 + (long) arg2 > this.field4850 + (long) this.field4855.length) {
                int var4 = (int) ((long) this.field4855.length - (this.field4858 - this.field4850));
                System.arraycopy(arg0, arg1, this.field4855, (int) (this.field4858 - this.field4850), var4);
                this.field4858 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field4856 = this.field4855.length;
                this.method7586();
            }
            if (arg2 > this.field4855.length) {
                if (this.field4861 != this.field4858) {
                    this.field4851.method7561(this.field4858);
                    this.field4861 = this.field4858;
                }
                this.field4851.method7562(arg0, arg1, arg2);
                this.field4861 += (long) arg2;
                if (this.field4861 > this.field4859) {
                    this.field4859 = this.field4861;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field4858 >= this.field4853 && this.field4858 < this.field4853 + (long) this.field4852) {
                    var5 = this.field4858;
                } else if (this.field4853 >= this.field4858 && this.field4853 < this.field4858 + (long) arg2) {
                    var5 = this.field4853;
                }
                if (this.field4858 + (long) arg2 > this.field4853 && this.field4858 + (long) arg2 <= this.field4853 + (long) this.field4852) {
                    var7 = this.field4858 + (long) arg2;
                } else if (this.field4853 + (long) this.field4852 > this.field4858 && this.field4853 + (long) this.field4852 <= this.field4858 + (long) arg2) {
                    var7 = this.field4853 + (long) this.field4852;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field4858), this.field4857, (int) (var5 - this.field4853), var9);
                }
                this.field4858 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field4850 == -1L) {
                    this.field4850 = this.field4858;
                }
                System.arraycopy(arg0, arg1, this.field4855, (int) (this.field4858 - this.field4850), arg2);
                this.field4858 += (long) arg2;
                if (this.field4858 - this.field4850 > (long) this.field4856) {
                    this.field4856 = (int) (this.field4858 - this.field4850);
                }
            }
        } catch (IOException var11) {
            this.field4861 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("qa.r(I)V")
    public void method7586() throws IOException {
        if (this.field4850 == -1L) {
            return;
        }
        if (this.field4861 != this.field4850) {
            this.field4851.method7561(this.field4850);
            this.field4861 = this.field4850;
        }
        this.field4851.method7562(this.field4855, 0, this.field4856);
        this.field4861 += (long) (this.field4856 * -950746563) * 867329301L;
        if (this.field4861 > this.field4859) {
            this.field4859 = this.field4861;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field4850 >= this.field4853 && this.field4850 < this.field4853 + (long) this.field4852) {
            var1 = this.field4850;
        } else if (this.field4853 >= this.field4850 && this.field4853 < this.field4850 + (long) this.field4856) {
            var1 = this.field4853;
        }
        if (this.field4850 + (long) this.field4856 > this.field4853 && this.field4850 + (long) this.field4856 <= this.field4853 + (long) this.field4852) {
            var3 = this.field4850 + (long) this.field4856;
        } else if (this.field4853 + (long) this.field4852 > this.field4850 && this.field4853 + (long) this.field4852 <= this.field4850 + (long) this.field4856) {
            var3 = this.field4853 + (long) this.field4852;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field4855, (int) (var1 - this.field4850), this.field4857, (int) (var1 - this.field4853), var5);
        }
        this.field4850 = -1L;
        this.field4856 = 0;
    }
}
