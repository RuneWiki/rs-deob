package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("rq")
public class class461 {

    @ObfuscatedName("rq.al")
    public class460 field4840;

    @ObfuscatedName("rq.ac")
    public byte[] field4838;

    @ObfuscatedName("rq.ab")
    public long field4839 = -1L;

    @ObfuscatedName("rq.an")
    public int field4847;

    @ObfuscatedName("rq.ao")
    public byte[] field4841;

    @ObfuscatedName("rq.av")
    public long field4842 = -1L;

    @ObfuscatedName("rq.aq")
    public int field4843 = 0;

    @ObfuscatedName("rq.ap")
    public long field4844;

    @ObfuscatedName("rq.ar")
    public long field4837;

    @ObfuscatedName("rq.ak")
    public long field4845;

    @ObfuscatedName("rq.ax")
    public long field4846;

    public class461(class460 arg0, int arg1, int arg2) throws IOException {
        this.field4840 = arg0;
        this.field4845 = this.field4837 = arg0.method7658();
        this.field4838 = new byte[arg1];
        this.field4841 = new byte[arg2];
        this.field4844 = 0L;
    }

    @ObfuscatedName("rq.aj(I)V")
    public void method7683() throws IOException {
        this.method7708();
        this.field4840.method7678();
    }

    @ObfuscatedName("rq.al(J)V")
    public void method7684(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field4844 = arg0;
    }

    @ObfuscatedName("rq.ac(B)J")
    public long method7694() {
        return this.field4845;
    }

    @ObfuscatedName("rq.ab([BB)V")
    public void method7686(byte[] arg0) throws IOException {
        this.method7687(arg0, 0, arg0.length);
    }

    @ObfuscatedName("rq.an([BIIB)V")
    public void method7687(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field4842 != -1L && this.field4844 >= this.field4842 && this.field4844 + (long) arg2 <= this.field4842 + (long) this.field4843) {
                System.arraycopy(this.field4841, (int) (this.field4844 - this.field4842), arg0, arg1, arg2);
                this.field4844 += (long) arg2;
                return;
            }
            long var4 = this.field4844;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field4844 >= this.field4839 && this.field4844 < this.field4839 + (long) this.field4847) {
                int var8 = (int) ((long) this.field4847 - (this.field4844 - this.field4839));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field4838, (int) (this.field4844 - this.field4839), arg0, arg1, var8);
                this.field4844 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field4838.length) {
                this.field4840.method7665(this.field4844);
                this.field4846 = this.field4844;
                while (arg2 > 0) {
                    int var9 = this.field4840.method7660(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field4846 += (long) var9;
                    this.field4844 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method7688();
                int var10 = arg2;
                if (arg2 > this.field4847) {
                    var10 = this.field4847;
                }
                System.arraycopy(this.field4838, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field4844 += (long) var10;
            }
            if (this.field4842 != -1L) {
                if (this.field4842 > this.field4844 && arg2 > 0) {
                    int var11 = (int) (this.field4842 - this.field4844) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field4844++;
                    }
                }
                long var12 = -1L;
                long var14 = -1L;
                if (this.field4842 >= var4 && this.field4842 < (long) var7 + var4) {
                    var12 = this.field4842;
                } else if (var4 >= this.field4842 && var4 < this.field4842 + (long) this.field4843) {
                    var12 = var4;
                }
                if (this.field4842 + (long) this.field4843 > var4 && this.field4842 + (long) this.field4843 <= (long) var7 + var4) {
                    var14 = this.field4842 + (long) this.field4843;
                } else if ((long) var7 + var4 > this.field4842 && (long) var7 + var4 <= this.field4842 + (long) this.field4843) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field4841, (int) (var12 - this.field4842), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field4844) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field4844));
                        this.field4844 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field4846 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("rq.ao(B)V")
    public void method7688() throws IOException {
        this.field4847 = 0;
        if (this.field4846 != this.field4844) {
            this.field4840.method7665(this.field4844);
            this.field4846 = this.field4844;
        }
        this.field4839 = this.field4844;
        while (this.field4847 < this.field4838.length) {
            int var1 = this.field4838.length - this.field4847;
            if (var1 > 200000000) {
                var1 = 200000000;
            }
            int var2 = this.field4840.method7660(this.field4838, this.field4847, var1);
            if (var2 == -1) {
                break;
            }
            this.field4846 += (long) var2;
            this.field4847 += var2;
        }
    }

    @ObfuscatedName("rq.av([BIIS)V")
    public void method7689(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field4844 + (long) arg2 > this.field4845) {
                this.field4845 = this.field4844 + (long) arg2;
            }
            if (this.field4842 != -1L && (this.field4844 < this.field4842 || this.field4844 > this.field4842 + (long) this.field4843)) {
                this.method7708();
            }
            if (this.field4842 != -1L && this.field4844 + (long) arg2 > this.field4842 + (long) this.field4841.length) {
                int var4 = (int) ((long) this.field4841.length - (this.field4844 - this.field4842));
                System.arraycopy(arg0, arg1, this.field4841, (int) (this.field4844 - this.field4842), var4);
                this.field4844 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field4843 = this.field4841.length;
                this.method7708();
            }
            if (arg2 > this.field4841.length) {
                if (this.field4846 != this.field4844) {
                    this.field4840.method7665(this.field4844);
                    this.field4846 = this.field4844;
                }
                this.field4840.method7662(arg0, arg1, arg2);
                this.field4846 += (long) arg2;
                if (this.field4846 > this.field4837) {
                    this.field4837 = this.field4846;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field4844 >= this.field4839 && this.field4844 < this.field4839 + (long) this.field4847) {
                    var5 = this.field4844;
                } else if (this.field4839 >= this.field4844 && this.field4839 < this.field4844 + (long) arg2) {
                    var5 = this.field4839;
                }
                if (this.field4844 + (long) arg2 > this.field4839 && this.field4844 + (long) arg2 <= this.field4839 + (long) this.field4847) {
                    var7 = this.field4844 + (long) arg2;
                } else if (this.field4839 + (long) this.field4847 > this.field4844 && this.field4839 + (long) this.field4847 <= this.field4844 + (long) arg2) {
                    var7 = this.field4839 + (long) this.field4847;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field4844), this.field4838, (int) (var5 - this.field4839), var9);
                }
                this.field4844 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field4842 == -1L) {
                    this.field4842 = this.field4844;
                }
                System.arraycopy(arg0, arg1, this.field4841, (int) (this.field4844 - this.field4842), arg2);
                this.field4844 += (long) arg2;
                if (this.field4844 - this.field4842 > (long) this.field4843) {
                    this.field4843 = (int) (this.field4844 - this.field4842);
                }
            }
        } catch (IOException var11) {
            this.field4846 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("rq.aq(B)V")
    public void method7708() throws IOException {
        if (this.field4842 == -1L) {
            return;
        }
        if (this.field4846 != this.field4842) {
            this.field4840.method7665(this.field4842);
            this.field4846 = this.field4842;
        }
        this.field4840.method7662(this.field4841, 0, this.field4843);
        this.field4846 += (long) (this.field4843 * -1976896775) * 76361545L;
        if (this.field4846 > this.field4837) {
            this.field4837 = this.field4846;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field4842 >= this.field4839 && this.field4842 < this.field4839 + (long) this.field4847) {
            var1 = this.field4842;
        } else if (this.field4839 >= this.field4842 && this.field4839 < this.field4842 + (long) this.field4843) {
            var1 = this.field4839;
        }
        if (this.field4842 + (long) this.field4843 > this.field4839 && this.field4842 + (long) this.field4843 <= this.field4839 + (long) this.field4847) {
            var3 = this.field4842 + (long) this.field4843;
        } else if (this.field4839 + (long) this.field4847 > this.field4842 && this.field4839 + (long) this.field4847 <= this.field4842 + (long) this.field4843) {
            var3 = this.field4839 + (long) this.field4847;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field4841, (int) (var1 - this.field4842), this.field4838, (int) (var1 - this.field4839), var5);
        }
        this.field4842 = -1L;
        this.field4843 = 0;
    }
}
