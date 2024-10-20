package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("gz")
public class class208 {

    @ObfuscatedName("gz.e")
    public class207 field2985;

    @ObfuscatedName("gz.v")
    public byte[] field2986;

    @ObfuscatedName("gz.k")
    public long field2983 = -1L;

    @ObfuscatedName("gz.g")
    public int field2984;

    @ObfuscatedName("gz.q")
    public byte[] field2981;

    @ObfuscatedName("gz.l")
    public long field2982 = -1L;

    @ObfuscatedName("gz.a")
    public int field2987 = 0;

    @ObfuscatedName("gz.b")
    public long field2990;

    @ObfuscatedName("gz.z")
    public long field2989;

    @ObfuscatedName("gz.w")
    public long field2988;

    @ObfuscatedName("gz.j")
    public long field2991;

    public class208(class207 arg0, int arg1, int arg2) throws IOException {
        this.field2985 = arg0;
        this.field2988 = this.field2989 = arg0.method3516();
        this.field2986 = new byte[arg1];
        this.field2981 = new byte[arg2];
        this.field2990 = 0L;
    }

    @ObfuscatedName("gz.e(I)V")
    public void method3534() throws IOException {
        this.method3553();
        this.field2985.method3515();
    }

    @ObfuscatedName("gz.v(J)V")
    public void method3535(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field2990 = arg0;
    }

    @ObfuscatedName("gz.k(S)J")
    public long method3536() {
        return this.field2988;
    }

    @ObfuscatedName("gz.g([BB)V")
    public void method3537(byte[] arg0) throws IOException {
        this.method3533(arg0, 0, arg0.length);
    }

    @ObfuscatedName("gz.q([BIII)V")
    public void method3533(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field2982 != -1L && this.field2990 >= this.field2982 && this.field2990 + (long) arg2 <= this.field2982 + (long) this.field2987) {
                System.arraycopy(this.field2981, (int) (this.field2990 - this.field2982), arg0, arg1, arg2);
                this.field2990 += (long) arg2;
                return;
            }
            long var4 = this.field2990;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field2990 >= this.field2983 && this.field2990 < this.field2983 + (long) this.field2984) {
                int var8 = (int) ((long) this.field2984 - (this.field2990 - this.field2983));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field2986, (int) (this.field2990 - this.field2983), arg0, arg1, var8);
                this.field2990 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field2986.length) {
                this.field2985.method3513(this.field2990);
                this.field2991 = this.field2990;
                while (arg2 > 0) {
                    int var9 = this.field2985.method3517(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field2991 += (long) var9;
                    this.field2990 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method3539();
                int var10 = arg2;
                if (arg2 > this.field2984) {
                    var10 = this.field2984;
                }
                System.arraycopy(this.field2986, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field2990 += (long) var10;
            }
            if (this.field2982 != -1L) {
                if (this.field2982 > this.field2990 && arg2 > 0) {
                    int var11 = (int) (this.field2982 - this.field2990) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field2990++;
                    }
                }
                long var12 = -1L;
                long var14 = -1L;
                if (this.field2982 >= var4 && this.field2982 < (long) var7 + var4) {
                    var12 = this.field2982;
                } else if (var4 >= this.field2982 && var4 < this.field2982 + (long) this.field2987) {
                    var12 = var4;
                }
                if (this.field2982 + (long) this.field2987 > var4 && this.field2982 + (long) this.field2987 <= (long) var7 + var4) {
                    var14 = this.field2982 + (long) this.field2987;
                } else if ((long) var7 + var4 > this.field2982 && (long) var7 + var4 <= this.field2982 + (long) this.field2987) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field2981, (int) (var12 - this.field2982), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field2990) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field2990));
                        this.field2990 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field2991 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("gz.l(I)V")
    public void method3539() throws IOException {
        this.field2984 = 0;
        if (this.field2991 != this.field2990) {
            this.field2985.method3513(this.field2990);
            this.field2991 = this.field2990;
        }
        this.field2983 = this.field2990;
        while (this.field2984 < this.field2986.length) {
            int var1 = this.field2985.method3517(this.field2986, this.field2984, this.field2986.length - this.field2984);
            if (var1 == -1) {
                break;
            }
            this.field2991 += (long) var1;
            this.field2984 += var1;
        }
    }

    @ObfuscatedName("gz.a([BIII)V")
    public void method3545(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field2990 + (long) arg2 > this.field2988) {
                this.field2988 = this.field2990 + (long) arg2;
            }
            if (this.field2982 != -1L && (this.field2990 < this.field2982 || this.field2990 > this.field2982 + (long) this.field2987)) {
                this.method3553();
            }
            if (this.field2982 != -1L && this.field2990 + (long) arg2 > this.field2982 + (long) this.field2981.length) {
                int var4 = (int) ((long) this.field2981.length - (this.field2990 - this.field2982));
                System.arraycopy(arg0, arg1, this.field2981, (int) (this.field2990 - this.field2982), var4);
                this.field2990 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field2987 = this.field2981.length;
                this.method3553();
            }
            if (arg2 > this.field2981.length) {
                if (this.field2991 != this.field2990) {
                    this.field2985.method3513(this.field2990);
                    this.field2991 = this.field2990;
                }
                this.field2985.method3530(arg0, arg1, arg2);
                this.field2991 += (long) arg2;
                if (this.field2991 > this.field2989) {
                    this.field2989 = this.field2991;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field2990 >= this.field2983 && this.field2990 < this.field2983 + (long) this.field2984) {
                    var5 = this.field2990;
                } else if (this.field2983 >= this.field2990 && this.field2983 < this.field2990 + (long) arg2) {
                    var5 = this.field2983;
                }
                if (this.field2990 + (long) arg2 > this.field2983 && this.field2990 + (long) arg2 <= this.field2983 + (long) this.field2984) {
                    var7 = this.field2990 + (long) arg2;
                } else if (this.field2983 + (long) this.field2984 > this.field2990 && this.field2983 + (long) this.field2984 <= this.field2990 + (long) arg2) {
                    var7 = this.field2983 + (long) this.field2984;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field2990), this.field2986, (int) (var5 - this.field2983), var9);
                }
                this.field2990 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field2982 == -1L) {
                    this.field2982 = this.field2990;
                }
                System.arraycopy(arg0, arg1, this.field2981, (int) (this.field2990 - this.field2982), arg2);
                this.field2990 += (long) arg2;
                if (this.field2990 - this.field2982 > (long) this.field2987) {
                    this.field2987 = (int) (this.field2990 - this.field2982);
                }
            }
        } catch (IOException var11) {
            this.field2991 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("gz.b(I)V")
    public void method3553() throws IOException {
        if (this.field2982 == -1L) {
            return;
        }
        if (this.field2991 != this.field2982) {
            this.field2985.method3513(this.field2982);
            this.field2991 = this.field2982;
        }
        this.field2985.method3530(this.field2981, 0, this.field2987);
        this.field2991 += (long) (this.field2987 * 1913619207) * 1674082999L;
        if (this.field2991 > this.field2989) {
            this.field2989 = this.field2991;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field2982 >= this.field2983 && this.field2982 < this.field2983 + (long) this.field2984) {
            var1 = this.field2982;
        } else if (this.field2983 >= this.field2982 && this.field2983 < this.field2982 + (long) this.field2987) {
            var1 = this.field2983;
        }
        if (this.field2982 + (long) this.field2987 > this.field2983 && this.field2982 + (long) this.field2987 <= this.field2983 + (long) this.field2984) {
            var3 = this.field2982 + (long) this.field2987;
        } else if (this.field2983 + (long) this.field2984 > this.field2982 && this.field2983 + (long) this.field2984 <= this.field2982 + (long) this.field2987) {
            var3 = this.field2983 + (long) this.field2984;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field2981, (int) (var1 - this.field2982), this.field2986, (int) (var1 - this.field2983), var5);
        }
        this.field2982 = -1L;
        this.field2987 = 0;
    }
}
