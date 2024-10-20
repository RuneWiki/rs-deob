package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("tl")
public class class511 {

    @ObfuscatedName("tl.al")
    public class510 field5048;

    @ObfuscatedName("tl.ak")
    public byte[] field5049;

    @ObfuscatedName("tl.ax")
    public long field5058 = -1L;

    @ObfuscatedName("tl.ao")
    public int field5051;

    @ObfuscatedName("tl.ah")
    public byte[] field5052;

    @ObfuscatedName("tl.ar")
    public long field5053 = -1L;

    @ObfuscatedName("tl.ab")
    public int field5047 = 0;

    @ObfuscatedName("tl.am")
    public long field5055;

    @ObfuscatedName("tl.av")
    public long field5054;

    @ObfuscatedName("tl.ag")
    public long field5056;

    @ObfuscatedName("tl.aa")
    public long field5057;

    public class511(class510 arg0, int arg1, int arg2) throws IOException {
        this.field5048 = arg0;
        this.field5056 = this.field5054 = arg0.method8125();
        this.field5049 = new byte[arg1];
        this.field5052 = new byte[arg2];
        this.field5055 = 0L;
    }

    @ObfuscatedName("tl.ac(I)V")
    public void method8149() throws IOException {
        this.method8156();
        this.field5048.method8123();
    }

    @ObfuscatedName("tl.al(J)V")
    public void method8150(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field5055 = arg0;
    }

    @ObfuscatedName("tl.ak(S)J")
    public long method8151() {
        return this.field5056;
    }

    @ObfuscatedName("tl.ax([BB)V")
    public void method8152(byte[] arg0) throws IOException {
        this.method8167(arg0, 0, arg0.length);
    }

    @ObfuscatedName("tl.ao([BIIS)V")
    public void method8167(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field5053 != -1L && this.field5055 >= this.field5053 && this.field5055 + (long) arg2 <= this.field5053 + (long) this.field5047) {
                System.arraycopy(this.field5052, (int) (this.field5055 - this.field5053), arg0, arg1, arg2);
                this.field5055 += (long) arg2;
                return;
            }
            long var4 = this.field5055;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field5055 >= this.field5058 && this.field5055 < this.field5058 + (long) this.field5051) {
                int var8 = (int) ((long) this.field5051 - (this.field5055 - this.field5058));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field5049, (int) (this.field5055 - this.field5058), arg0, arg1, var8);
                this.field5055 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field5049.length) {
                this.field5048.method8121(this.field5055);
                this.field5057 = this.field5055;
                while (arg2 > 0) {
                    int var9 = this.field5048.method8147(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field5057 += (long) var9;
                    this.field5055 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method8148();
                int var10 = arg2;
                if (arg2 > this.field5051) {
                    var10 = this.field5051;
                }
                System.arraycopy(this.field5049, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field5055 += (long) var10;
            }
            if (this.field5053 != -1L) {
                if (this.field5053 > this.field5055 && arg2 > 0) {
                    int var11 = (int) (this.field5053 - this.field5055) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field5055++;
                    }
                }
                long var12 = -1L;
                long var14 = -1L;
                if (this.field5053 >= var4 && this.field5053 < (long) var7 + var4) {
                    var12 = this.field5053;
                } else if (var4 >= this.field5053 && var4 < this.field5053 + (long) this.field5047) {
                    var12 = var4;
                }
                if (this.field5053 + (long) this.field5047 > var4 && this.field5053 + (long) this.field5047 <= (long) var7 + var4) {
                    var14 = this.field5053 + (long) this.field5047;
                } else if ((long) var7 + var4 > this.field5053 && (long) var7 + var4 <= this.field5053 + (long) this.field5047) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field5052, (int) (var12 - this.field5053), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field5055) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field5055));
                        this.field5055 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field5057 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("tl.ah(B)V")
    public void method8148() throws IOException {
        this.field5051 = 0;
        if (this.field5057 != this.field5055) {
            this.field5048.method8121(this.field5055);
            this.field5057 = this.field5055;
        }
        this.field5058 = this.field5055;
        while (this.field5051 < this.field5049.length) {
            int var1 = this.field5049.length - this.field5051;
            if (var1 > 200000000) {
                var1 = 200000000;
            }
            int var2 = this.field5048.method8147(this.field5049, this.field5051, var1);
            if (var2 == -1) {
                break;
            }
            this.field5057 += (long) var2;
            this.field5051 += var2;
        }
    }

    @ObfuscatedName("tl.ar([BIIB)V")
    public void method8155(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field5055 + (long) arg2 > this.field5056) {
                this.field5056 = this.field5055 + (long) arg2;
            }
            if (this.field5053 != -1L && (this.field5055 < this.field5053 || this.field5055 > this.field5053 + (long) this.field5047)) {
                this.method8156();
            }
            if (this.field5053 != -1L && this.field5055 + (long) arg2 > this.field5053 + (long) this.field5052.length) {
                int var4 = (int) ((long) this.field5052.length - (this.field5055 - this.field5053));
                System.arraycopy(arg0, arg1, this.field5052, (int) (this.field5055 - this.field5053), var4);
                this.field5055 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field5047 = this.field5052.length;
                this.method8156();
            }
            if (arg2 > this.field5052.length) {
                if (this.field5057 != this.field5055) {
                    this.field5048.method8121(this.field5055);
                    this.field5057 = this.field5055;
                }
                this.field5048.method8122(arg0, arg1, arg2);
                this.field5057 += (long) arg2;
                if (this.field5057 > this.field5054) {
                    this.field5054 = this.field5057;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field5055 >= this.field5058 && this.field5055 < this.field5058 + (long) this.field5051) {
                    var5 = this.field5055;
                } else if (this.field5058 >= this.field5055 && this.field5058 < this.field5055 + (long) arg2) {
                    var5 = this.field5058;
                }
                if (this.field5055 + (long) arg2 > this.field5058 && this.field5055 + (long) arg2 <= this.field5058 + (long) this.field5051) {
                    var7 = this.field5055 + (long) arg2;
                } else if (this.field5058 + (long) this.field5051 > this.field5055 && this.field5058 + (long) this.field5051 <= this.field5055 + (long) arg2) {
                    var7 = this.field5058 + (long) this.field5051;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field5055), this.field5049, (int) (var5 - this.field5058), var9);
                }
                this.field5055 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field5053 == -1L) {
                    this.field5053 = this.field5055;
                }
                System.arraycopy(arg0, arg1, this.field5052, (int) (this.field5055 - this.field5053), arg2);
                this.field5055 += (long) arg2;
                if (this.field5055 - this.field5053 > (long) this.field5047) {
                    this.field5047 = (int) (this.field5055 - this.field5053);
                }
            }
        } catch (IOException var11) {
            this.field5057 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("tl.ab(I)V")
    public void method8156() throws IOException {
        if (this.field5053 == -1L) {
            return;
        }
        if (this.field5057 != this.field5053) {
            this.field5048.method8121(this.field5053);
            this.field5057 = this.field5053;
        }
        this.field5048.method8122(this.field5052, 0, this.field5047);
        this.field5057 += (long) (this.field5047 * -1688455177) * 1851374023L;
        if (this.field5057 > this.field5054) {
            this.field5054 = this.field5057;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field5053 >= this.field5058 && this.field5053 < this.field5058 + (long) this.field5051) {
            var1 = this.field5053;
        } else if (this.field5058 >= this.field5053 && this.field5058 < this.field5053 + (long) this.field5047) {
            var1 = this.field5058;
        }
        if (this.field5053 + (long) this.field5047 > this.field5058 && this.field5053 + (long) this.field5047 <= this.field5058 + (long) this.field5051) {
            var3 = this.field5053 + (long) this.field5047;
        } else if (this.field5058 + (long) this.field5051 > this.field5053 && this.field5058 + (long) this.field5051 <= this.field5053 + (long) this.field5047) {
            var3 = this.field5058 + (long) this.field5051;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field5052, (int) (var1 - this.field5053), this.field5049, (int) (var1 - this.field5058), var5);
        }
        this.field5053 = -1L;
        this.field5047 = 0;
    }
}
