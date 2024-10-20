package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("sq")
public class class484 {

    @ObfuscatedName("sq.an")
    public class483 field4946;

    @ObfuscatedName("sq.av")
    public byte[] field4947;

    @ObfuscatedName("sq.as")
    public long field4950 = -1L;

    @ObfuscatedName("sq.ax")
    public int field4948;

    @ObfuscatedName("sq.ap")
    public byte[] field4945;

    @ObfuscatedName("sq.ab")
    public long field4949 = -1L;

    @ObfuscatedName("sq.ak")
    public int field4952 = 0;

    @ObfuscatedName("sq.ae")
    public long field4953;

    @ObfuscatedName("sq.af")
    public long field4954;

    @ObfuscatedName("sq.ao")
    public long field4955;

    @ObfuscatedName("sq.aa")
    public long field4951;

    public class484(class483 arg0, int arg1, int arg2) throws IOException {
        this.field4946 = arg0;
        this.field4955 = this.field4954 = arg0.method7919();
        this.field4947 = new byte[arg1];
        this.field4945 = new byte[arg2];
        this.field4953 = 0L;
    }

    @ObfuscatedName("sq.at(B)V")
    public void method7934() throws IOException {
        this.method7940();
        this.field4946.method7922();
    }

    @ObfuscatedName("sq.an(J)V")
    public void method7936(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field4953 = arg0;
    }

    @ObfuscatedName("sq.av(I)J")
    public long method7937() {
        return this.field4955;
    }

    @ObfuscatedName("sq.as([BI)V")
    public void method7938(byte[] arg0) throws IOException {
        this.method7939(arg0, 0, arg0.length);
    }

    @ObfuscatedName("sq.ax([BIII)V")
    public void method7939(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field4949 != -1L && this.field4953 >= this.field4949 && this.field4953 + (long) arg2 <= this.field4949 + (long) this.field4952) {
                System.arraycopy(this.field4945, (int) (this.field4953 - this.field4949), arg0, arg1, arg2);
                this.field4953 += (long) arg2;
                return;
            }
            long var4 = this.field4953;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field4953 >= this.field4950 && this.field4953 < this.field4950 + (long) this.field4948) {
                int var8 = (int) ((long) this.field4948 - (this.field4953 - this.field4950));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field4947, (int) (this.field4953 - this.field4950), arg0, arg1, var8);
                this.field4953 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field4947.length) {
                this.field4946.method7915(this.field4953);
                this.field4951 = this.field4953;
                while (arg2 > 0) {
                    int var9 = this.field4946.method7920(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field4951 += (long) var9;
                    this.field4953 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method7941();
                int var10 = arg2;
                if (arg2 > this.field4948) {
                    var10 = this.field4948;
                }
                System.arraycopy(this.field4947, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field4953 += (long) var10;
            }
            if (this.field4949 != -1L) {
                if (this.field4949 > this.field4953 && arg2 > 0) {
                    int var11 = (int) (this.field4949 - this.field4953) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field4953++;
                    }
                }
                long var12 = -1L;
                long var14 = -1L;
                if (this.field4949 >= var4 && this.field4949 < (long) var7 + var4) {
                    var12 = this.field4949;
                } else if (var4 >= this.field4949 && var4 < this.field4949 + (long) this.field4952) {
                    var12 = var4;
                }
                if (this.field4949 + (long) this.field4952 > var4 && this.field4949 + (long) this.field4952 <= (long) var7 + var4) {
                    var14 = this.field4949 + (long) this.field4952;
                } else if ((long) var7 + var4 > this.field4949 && (long) var7 + var4 <= this.field4949 + (long) this.field4952) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field4945, (int) (var12 - this.field4949), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field4953) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field4953));
                        this.field4953 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field4951 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("sq.ap(B)V")
    public void method7941() throws IOException {
        this.field4948 = 0;
        if (this.field4953 != this.field4951) {
            this.field4946.method7915(this.field4953);
            this.field4951 = this.field4953;
        }
        this.field4950 = this.field4953;
        while (this.field4948 < this.field4947.length) {
            int var1 = this.field4947.length - this.field4948;
            if (var1 > 200000000) {
                var1 = 200000000;
            }
            int var2 = this.field4946.method7920(this.field4947, this.field4948, var1);
            if (var2 == -1) {
                break;
            }
            this.field4951 += (long) var2;
            this.field4948 += var2;
        }
    }

    @ObfuscatedName("sq.ab([BIII)V")
    public void method7935(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field4953 + (long) arg2 > this.field4955) {
                this.field4955 = this.field4953 + (long) arg2;
            }
            if (this.field4949 != -1L && (this.field4953 < this.field4949 || this.field4953 > this.field4949 + (long) this.field4952)) {
                this.method7940();
            }
            if (this.field4949 != -1L && this.field4953 + (long) arg2 > this.field4949 + (long) this.field4945.length) {
                int var4 = (int) ((long) this.field4945.length - (this.field4953 - this.field4949));
                System.arraycopy(arg0, arg1, this.field4945, (int) (this.field4953 - this.field4949), var4);
                this.field4953 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field4952 = this.field4945.length;
                this.method7940();
            }
            if (arg2 > this.field4945.length) {
                if (this.field4953 != this.field4951) {
                    this.field4946.method7915(this.field4953);
                    this.field4951 = this.field4953;
                }
                this.field4946.method7916(arg0, arg1, arg2);
                this.field4951 += (long) arg2;
                if (this.field4951 > this.field4954) {
                    this.field4954 = this.field4951;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field4953 >= this.field4950 && this.field4953 < this.field4950 + (long) this.field4948) {
                    var5 = this.field4953;
                } else if (this.field4950 >= this.field4953 && this.field4950 < this.field4953 + (long) arg2) {
                    var5 = this.field4950;
                }
                if (this.field4953 + (long) arg2 > this.field4950 && this.field4953 + (long) arg2 <= this.field4950 + (long) this.field4948) {
                    var7 = this.field4953 + (long) arg2;
                } else if (this.field4950 + (long) this.field4948 > this.field4953 && this.field4950 + (long) this.field4948 <= this.field4953 + (long) arg2) {
                    var7 = this.field4950 + (long) this.field4948;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field4953), this.field4947, (int) (var5 - this.field4950), var9);
                }
                this.field4953 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field4949 == -1L) {
                    this.field4949 = this.field4953;
                }
                System.arraycopy(arg0, arg1, this.field4945, (int) (this.field4953 - this.field4949), arg2);
                this.field4953 += (long) arg2;
                if (this.field4953 - this.field4949 > (long) this.field4952) {
                    this.field4952 = (int) (this.field4953 - this.field4949);
                }
            }
        } catch (IOException var11) {
            this.field4951 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("sq.ak(I)V")
    public void method7940() throws IOException {
        if (this.field4949 == -1L) {
            return;
        }
        if (this.field4951 != this.field4949) {
            this.field4946.method7915(this.field4949);
            this.field4951 = this.field4949;
        }
        this.field4946.method7916(this.field4945, 0, this.field4952);
        this.field4951 += (long) (this.field4952 * 100301053) * 953115733L;
        if (this.field4951 > this.field4954) {
            this.field4954 = this.field4951;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field4949 >= this.field4950 && this.field4949 < this.field4950 + (long) this.field4948) {
            var1 = this.field4949;
        } else if (this.field4950 >= this.field4949 && this.field4950 < this.field4949 + (long) this.field4952) {
            var1 = this.field4950;
        }
        if (this.field4949 + (long) this.field4952 > this.field4950 && this.field4949 + (long) this.field4952 <= this.field4950 + (long) this.field4948) {
            var3 = this.field4949 + (long) this.field4952;
        } else if (this.field4950 + (long) this.field4948 > this.field4949 && this.field4950 + (long) this.field4948 <= this.field4949 + (long) this.field4952) {
            var3 = this.field4950 + (long) this.field4948;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field4945, (int) (var1 - this.field4949), this.field4947, (int) (var1 - this.field4950), var5);
        }
        this.field4949 = -1L;
        this.field4952 = 0;
    }
}
