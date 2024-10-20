package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("hr")
public class class210 {

    @ObfuscatedName("hr.b")
    public class209 field3009;

    @ObfuscatedName("hr.e")
    public byte[] field3001;

    @ObfuscatedName("hr.i")
    public long field3000 = -1L;

    @ObfuscatedName("hr.k")
    public int field3002;

    @ObfuscatedName("hr.h")
    public byte[] field3004;

    @ObfuscatedName("hr.p")
    public long field3005 = -1L;

    @ObfuscatedName("hr.n")
    public int field3003 = 0;

    @ObfuscatedName("hr.o")
    public long field3007;

    @ObfuscatedName("hr.g")
    public long field3008;

    @ObfuscatedName("hr.z")
    public long field3010;

    @ObfuscatedName("hr.t")
    public long field3006;

    public class210(class209 arg0, int arg1, int arg2) throws IOException {
        this.field3009 = arg0;
        this.field3010 = this.field3008 = arg0.method3581();
        this.field3001 = new byte[arg1];
        this.field3004 = new byte[arg2];
        this.field3007 = 0L;
    }

    @ObfuscatedName("hr.b(S)V")
    public void method3593() throws IOException {
        this.method3605();
        this.field3009.method3587();
    }

    @ObfuscatedName("hr.e(J)V")
    public void method3595(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field3007 = arg0;
    }

    @ObfuscatedName("hr.i(S)J")
    public long method3596() {
        return this.field3010;
    }

    @ObfuscatedName("hr.k([BI)V")
    public void method3597(byte[] arg0) throws IOException {
        this.method3598(arg0, 0, arg0.length);
    }

    @ObfuscatedName("hr.h([BIII)V")
    public void method3598(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field3005 != -1L && this.field3007 >= this.field3005 && this.field3007 + (long) arg2 <= this.field3005 + (long) this.field3003) {
                System.arraycopy(this.field3004, (int) (this.field3007 - this.field3005), arg0, arg1, arg2);
                this.field3007 += (long) arg2;
                return;
            }
            long var4 = this.field3007;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field3007 >= this.field3000 && this.field3007 < this.field3000 + (long) this.field3002) {
                int var8 = (int) ((long) this.field3002 - (this.field3007 - this.field3000));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field3001, (int) (this.field3007 - this.field3000), arg0, arg1, var8);
                this.field3007 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field3001.length) {
                this.field3009.method3574(this.field3007);
                this.field3006 = this.field3007;
                while (arg2 > 0) {
                    int var9 = this.field3009.method3578(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field3006 += (long) var9;
                    this.field3007 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method3599();
                int var10 = arg2;
                if (arg2 > this.field3002) {
                    var10 = this.field3002;
                }
                System.arraycopy(this.field3001, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field3007 += (long) var10;
            }
            if (this.field3005 != -1L) {
                if (this.field3005 > this.field3007 && arg2 > 0) {
                    int var11 = (int) (this.field3005 - this.field3007) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field3007++;
                    }
                }
                long var12 = -1L;
                long var14 = -1L;
                if (this.field3005 >= var4 && this.field3005 < (long) var7 + var4) {
                    var12 = this.field3005;
                } else if (var4 >= this.field3005 && var4 < this.field3005 + (long) this.field3003) {
                    var12 = var4;
                }
                if (this.field3005 + (long) this.field3003 > var4 && this.field3005 + (long) this.field3003 <= (long) var7 + var4) {
                    var14 = this.field3005 + (long) this.field3003;
                } else if ((long) var7 + var4 > this.field3005 && (long) var7 + var4 <= this.field3005 + (long) this.field3003) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field3004, (int) (var12 - this.field3005), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field3007) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field3007));
                        this.field3007 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field3006 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("hr.p(B)V")
    public void method3599() throws IOException {
        this.field3002 = 0;
        if (this.field3007 != this.field3006) {
            this.field3009.method3574(this.field3007);
            this.field3006 = this.field3007;
        }
        this.field3000 = this.field3007;
        while (this.field3002 < this.field3001.length) {
            int var1 = this.field3009.method3578(this.field3001, this.field3002, this.field3001.length - this.field3002);
            if (var1 == -1) {
                break;
            }
            this.field3006 += (long) var1;
            this.field3002 += var1;
        }
    }

    @ObfuscatedName("hr.n([BIII)V")
    public void method3600(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field3007 + (long) arg2 > this.field3010) {
                this.field3010 = this.field3007 + (long) arg2;
            }
            if (this.field3005 != -1L && (this.field3007 < this.field3005 || this.field3007 > this.field3005 + (long) this.field3003)) {
                this.method3605();
            }
            if (this.field3005 != -1L && this.field3007 + (long) arg2 > this.field3005 + (long) this.field3004.length) {
                int var4 = (int) ((long) this.field3004.length - (this.field3007 - this.field3005));
                System.arraycopy(arg0, arg1, this.field3004, (int) (this.field3007 - this.field3005), var4);
                this.field3007 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field3003 = this.field3004.length;
                this.method3605();
            }
            if (arg2 > this.field3004.length) {
                if (this.field3007 != this.field3006) {
                    this.field3009.method3574(this.field3007);
                    this.field3006 = this.field3007;
                }
                this.field3009.method3575(arg0, arg1, arg2);
                this.field3006 += (long) arg2;
                if (this.field3006 > this.field3008) {
                    this.field3008 = this.field3006;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field3007 >= this.field3000 && this.field3007 < this.field3000 + (long) this.field3002) {
                    var5 = this.field3007;
                } else if (this.field3000 >= this.field3007 && this.field3000 < this.field3007 + (long) arg2) {
                    var5 = this.field3000;
                }
                if (this.field3007 + (long) arg2 > this.field3000 && this.field3007 + (long) arg2 <= this.field3000 + (long) this.field3002) {
                    var7 = this.field3007 + (long) arg2;
                } else if (this.field3000 + (long) this.field3002 > this.field3007 && this.field3000 + (long) this.field3002 <= this.field3007 + (long) arg2) {
                    var7 = this.field3000 + (long) this.field3002;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field3007), this.field3001, (int) (var5 - this.field3000), var9);
                }
                this.field3007 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field3005 == -1L) {
                    this.field3005 = this.field3007;
                }
                System.arraycopy(arg0, arg1, this.field3004, (int) (this.field3007 - this.field3005), arg2);
                this.field3007 += (long) arg2;
                if (this.field3007 - this.field3005 > (long) this.field3003) {
                    this.field3003 = (int) (this.field3007 - this.field3005);
                }
            }
        } catch (IOException var11) {
            this.field3006 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("hr.o(I)V")
    public void method3605() throws IOException {
        if (this.field3005 == -1L) {
            return;
        }
        if (this.field3006 != this.field3005) {
            this.field3009.method3574(this.field3005);
            this.field3006 = this.field3005;
        }
        this.field3009.method3575(this.field3004, 0, this.field3003);
        this.field3006 += (long) (this.field3003 * 2102094311) * 1808374231L;
        if (this.field3006 > this.field3008) {
            this.field3008 = this.field3006;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field3005 >= this.field3000 && this.field3005 < this.field3000 + (long) this.field3002) {
            var1 = this.field3005;
        } else if (this.field3000 >= this.field3005 && this.field3000 < this.field3005 + (long) this.field3003) {
            var1 = this.field3000;
        }
        if (this.field3005 + (long) this.field3003 > this.field3000 && this.field3005 + (long) this.field3003 <= this.field3000 + (long) this.field3002) {
            var3 = this.field3005 + (long) this.field3003;
        } else if (this.field3000 + (long) this.field3002 > this.field3005 && this.field3000 + (long) this.field3002 <= this.field3005 + (long) this.field3003) {
            var3 = this.field3000 + (long) this.field3002;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field3004, (int) (var1 - this.field3005), this.field3001, (int) (var1 - this.field3000), var5);
        }
        this.field3005 = -1L;
        this.field3003 = 0;
    }
}
