package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("ap")
public class class30 {

    @ObfuscatedName("ap.i")
    public class29 field772;

    @ObfuscatedName("ap.p")
    public byte[] field768;

    @ObfuscatedName("ap.a")
    public long field769 = -1L;

    @ObfuscatedName("ap.l")
    public int field770;

    @ObfuscatedName("ap.q")
    public byte[] field781;

    @ObfuscatedName("ap.b")
    public long field767 = -1L;

    @ObfuscatedName("ap.u")
    public int field773 = 0;

    @ObfuscatedName("ap.d")
    public long field777;

    @ObfuscatedName("ap.m")
    public long field778;

    @ObfuscatedName("ap.v")
    public long field776;

    @ObfuscatedName("ap.j")
    public long field771;

    public class30(class29 arg0, int arg1, int arg2) throws IOException {
        this.field772 = arg0;
        this.field776 = this.field778 = arg0.method552();
        this.field768 = new byte[arg1];
        this.field781 = new byte[arg2];
        this.field777 = 0L;
    }

    @ObfuscatedName("ap.i(I)V")
    public void method568() throws IOException {
        this.method574();
        this.field772.method548();
    }

    @ObfuscatedName("ap.p(J)V")
    public void method569(long arg0) throws IOException {
        if (arg0 < 0L) {
            throw new IOException("");
        }
        this.field777 = arg0;
    }

    @ObfuscatedName("ap.a(I)J")
    public long method570() {
        return this.field776;
    }

    @ObfuscatedName("ap.l([BI)V")
    public void method583(byte[] arg0) throws IOException {
        this.method572(arg0, 0, arg0.length);
    }

    @ObfuscatedName("ap.q([BIII)V")
    public void method572(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field767 != -1L && this.field777 >= this.field767 && this.field777 + (long) arg2 <= this.field767 + (long) this.field773) {
                System.arraycopy(this.field781, (int) (this.field777 - this.field767), arg0, arg1, arg2);
                this.field777 += (long) arg2;
                return;
            }
            long var4 = this.field777;
            int var6 = arg1;
            int var7 = arg2;
            if (this.field777 >= this.field769 && this.field777 < this.field769 + (long) this.field770) {
                int var8 = (int) ((long) this.field770 - (this.field777 - this.field769));
                if (var8 > arg2) {
                    var8 = arg2;
                }
                System.arraycopy(this.field768, (int) (this.field777 - this.field769), arg0, arg1, var8);
                this.field777 += (long) var8;
                arg1 += var8;
                arg2 -= var8;
            }
            if (arg2 > this.field768.length) {
                this.field772.method549(this.field777);
                this.field771 = this.field777;
                while (arg2 > 0) {
                    int var9 = this.field772.method553(arg0, arg1, arg2);
                    if (var9 == -1) {
                        break;
                    }
                    this.field771 += (long) var9;
                    this.field777 += (long) var9;
                    arg1 += var9;
                    arg2 -= var9;
                }
            } else if (arg2 > 0) {
                this.method585();
                int var10 = arg2;
                if (arg2 > this.field770) {
                    var10 = this.field770;
                }
                System.arraycopy(this.field768, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field777 += (long) var10;
            }
            if (this.field767 != -1L) {
                if (this.field767 > this.field777 && arg2 > 0) {
                    int var11 = (int) (this.field767 - this.field777) + arg1;
                    if (var11 > arg1 + arg2) {
                        var11 = arg1 + arg2;
                    }
                    while (arg1 < var11) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field777++;
                    }
                }
                long var12 = -1L;
                long var14 = -1L;
                if (this.field767 >= var4 && this.field767 < (long) var7 + var4) {
                    var12 = this.field767;
                } else if (var4 >= this.field767 && var4 < this.field767 + (long) this.field773) {
                    var12 = var4;
                }
                if (this.field767 + (long) this.field773 > var4 && this.field767 + (long) this.field773 <= (long) var7 + var4) {
                    var14 = this.field767 + (long) this.field773;
                } else if ((long) var7 + var4 > this.field767 && (long) var7 + var4 <= this.field767 + (long) this.field773) {
                    var14 = (long) var7 + var4;
                }
                if (var12 > -1L && var14 > var12) {
                    int var16 = (int) (var14 - var12);
                    System.arraycopy(this.field781, (int) (var12 - this.field767), arg0, (int) (var12 - var4) + var6, var16);
                    if (var14 > this.field777) {
                        arg2 = (int) ((long) arg2 - (var14 - this.field777));
                        this.field777 = var14;
                    }
                }
            }
        } catch (IOException var18) {
            this.field771 = -1L;
            throw var18;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @ObfuscatedName("ap.b(B)V")
    public void method585() throws IOException {
        this.field770 = 0;
        if (this.field777 != this.field771) {
            this.field772.method549(this.field777);
            this.field771 = this.field777;
        }
        this.field769 = this.field777;
        while (this.field770 < this.field768.length) {
            int var1 = this.field772.method553(this.field768, this.field770, this.field768.length - this.field770);
            if (var1 == -1) {
                break;
            }
            this.field771 += (long) var1;
            this.field770 += var1;
        }
    }

    @ObfuscatedName("ap.u([BIII)V")
    public void method578(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            if (this.field777 + (long) arg2 > this.field776) {
                this.field776 = this.field777 + (long) arg2;
            }
            if (this.field767 != -1L && (this.field777 < this.field767 || this.field777 > this.field767 + (long) this.field773)) {
                this.method574();
            }
            if (this.field767 != -1L && this.field777 + (long) arg2 > this.field767 + (long) this.field781.length) {
                int var4 = (int) ((long) this.field781.length - (this.field777 - this.field767));
                System.arraycopy(arg0, arg1, this.field781, (int) (this.field777 - this.field767), var4);
                this.field777 += (long) var4;
                arg1 += var4;
                arg2 -= var4;
                this.field773 = this.field781.length;
                this.method574();
            }
            if (arg2 > this.field781.length) {
                if (this.field777 != this.field771) {
                    this.field772.method549(this.field777);
                    this.field771 = this.field777;
                }
                this.field772.method550(arg0, arg1, arg2);
                this.field771 += (long) arg2;
                if (this.field771 > this.field778) {
                    this.field778 = this.field771;
                }
                long var5 = -1L;
                long var7 = -1L;
                if (this.field777 >= this.field769 && this.field777 < this.field769 + (long) this.field770) {
                    var5 = this.field777;
                } else if (this.field769 >= this.field777 && this.field769 < this.field777 + (long) arg2) {
                    var5 = this.field769;
                }
                if (this.field777 + (long) arg2 > this.field769 && this.field777 + (long) arg2 <= this.field769 + (long) this.field770) {
                    var7 = this.field777 + (long) arg2;
                } else if (this.field769 + (long) this.field770 > this.field777 && this.field769 + (long) this.field770 <= this.field777 + (long) arg2) {
                    var7 = this.field769 + (long) this.field770;
                }
                if (var5 > -1L && var7 > var5) {
                    int var9 = (int) (var7 - var5);
                    System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field777), this.field768, (int) (var5 - this.field769), var9);
                }
                this.field777 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field767 == -1L) {
                    this.field767 = this.field777;
                }
                System.arraycopy(arg0, arg1, this.field781, (int) (this.field777 - this.field767), arg2);
                this.field777 += (long) arg2;
                if (this.field777 - this.field767 > (long) this.field773) {
                    this.field773 = (int) (this.field777 - this.field767);
                }
            }
        } catch (IOException var11) {
            this.field771 = -1L;
            throw var11;
        }
    }

    @ObfuscatedName("ap.d(B)V")
    public void method574() throws IOException {
        if (this.field767 == -1L) {
            return;
        }
        if (this.field771 != this.field767) {
            this.field772.method549(this.field767);
            this.field771 = this.field767;
        }
        this.field772.method550(this.field781, 0, this.field773);
        this.field771 += (long) (this.field773 * 140826585) * -481544087L;
        if (this.field771 > this.field778) {
            this.field778 = this.field771;
        }
        long var1 = -1L;
        long var3 = -1L;
        if (this.field767 >= this.field769 && this.field767 < this.field769 + (long) this.field770) {
            var1 = this.field767;
        } else if (this.field769 >= this.field767 && this.field769 < this.field767 + (long) this.field773) {
            var1 = this.field769;
        }
        if (this.field767 + (long) this.field773 > this.field769 && this.field767 + (long) this.field773 <= this.field769 + (long) this.field770) {
            var3 = this.field767 + (long) this.field773;
        } else if (this.field769 + (long) this.field770 > this.field767 && this.field769 + (long) this.field770 <= this.field767 + (long) this.field773) {
            var3 = this.field769 + (long) this.field770;
        }
        if (var1 > -1L && var3 > var1) {
            int var5 = (int) (var3 - var1);
            System.arraycopy(this.field781, (int) (var1 - this.field767), this.field768, (int) (var1 - this.field769), var5);
        }
        this.field767 = -1L;
        this.field773 = 0;
    }
}
