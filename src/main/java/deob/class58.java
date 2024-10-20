package deob;

@ObfuscatedName("bv")
public class class58 extends class59 {

    @ObfuscatedName("bv.v")
    public int field481;

    @ObfuscatedName("bv.n")
    public int field480;

    @ObfuscatedName("bv.f")
    public int field482;

    @ObfuscatedName("bv.y")
    public int field479;

    @ObfuscatedName("bv.p")
    public int field489;

    @ObfuscatedName("bv.j")
    public int field484;

    @ObfuscatedName("bv.r")
    public int field485;

    @ObfuscatedName("bv.b")
    public int field486;

    @ObfuscatedName("bv.d")
    public int field487;

    @ObfuscatedName("bv.s")
    public int field488;

    @ObfuscatedName("bv.u")
    public boolean field483;

    @ObfuscatedName("bv.l")
    public int field490;

    @ObfuscatedName("bv.o")
    public int field491;

    @ObfuscatedName("bv.c")
    public int field492;

    @ObfuscatedName("bv.e")
    public int field493;

    @ObfuscatedName("bv.v(II)I")
    public static int method757(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("bv.n(II)I")
    public static int method811(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("bv.ah()I")
    public int method754() {
        int var1 = this.field489 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field486 == 0) {
            var2 -= this.field481 * var2 / (((class51) this.field494).field403.length << 8);
        } else if (this.field486 >= 0) {
            var2 -= this.field487 * var2 / ((class51) this.field494).field403.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    public class58(class51 arg0, int arg1, int arg2) {
        this.field494 = arg0;
        this.field487 = arg0.field401;
        this.field488 = arg0.field402;
        this.field483 = arg0.field400;
        this.field480 = arg1;
        this.field482 = arg2;
        this.field479 = 8192;
        this.field481 = 0;
        this.method721();
    }

    public class58(class51 arg0, int arg1, int arg2, int arg3) {
        this.field494 = arg0;
        this.field487 = arg0.field401;
        this.field488 = arg0.field402;
        this.field483 = arg0.field400;
        this.field480 = arg1;
        this.field482 = arg2;
        this.field479 = arg3;
        this.field481 = 0;
        this.method721();
    }

    @ObfuscatedName("bv.f(Lau;II)Lbv;")
    public static class58 method719(class51 arg0, int arg1, int arg2) {
        return arg0.field403 == null || arg0.field403.length == 0 ? null : new class58(arg0, (int) ((long) arg0.field399 * 256L * (long) arg1 / (long) (Statics.field429 * 100)), arg2 << 6);
    }

    @ObfuscatedName("bv.y(Lau;III)Lbv;")
    public static class58 method720(class51 arg0, int arg1, int arg2, int arg3) {
        return arg0.field403 == null || arg0.field403.length == 0 ? null : new class58(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("bv.p()V")
    public void method721() {
        this.field489 = this.field482;
        this.field484 = method757(this.field482, this.field479);
        this.field485 = method811(this.field482, this.field479);
    }

    @ObfuscatedName("bv.s(I)V")
    public synchronized void method722(int arg0) {
        this.field486 = arg0;
    }

    @ObfuscatedName("bv.l(I)V")
    public synchronized void method723(int arg0) {
        this.method725(arg0 << 6, this.method833());
    }

    @ObfuscatedName("bv.o(I)V")
    public synchronized void method724(int arg0) {
        this.method725(arg0, this.method833());
    }

    @ObfuscatedName("bv.c(II)V")
    public synchronized void method725(int arg0, int arg1) {
        this.field482 = arg0;
        this.field479 = arg1;
        this.field490 = 0;
        this.method721();
    }

    @ObfuscatedName("bv.e()I")
    public synchronized int method776() {
        return this.field482 == Integer.MIN_VALUE ? 0 : this.field482;
    }

    @ObfuscatedName("bv.g()I")
    public synchronized int method833() {
        return this.field479 < 0 ? -1 : this.field479;
    }

    @ObfuscatedName("bv.a(I)V")
    public synchronized void method762(int arg0) {
        int var2 = ((class51) this.field494).field403.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field481 = arg0;
    }

    @ObfuscatedName("bv.k(Z)V")
    public synchronized void method756(boolean arg0) {
        this.field480 = (this.field480 >>> 31) + (this.field480 ^ this.field480 >> 31);
        if (arg0) {
            this.field480 = -this.field480;
        }
    }

    @ObfuscatedName("bv.m()V")
    public void method729() {
        if (this.field490 == 0) {
            return;
        }
        if (this.field482 == Integer.MIN_VALUE) {
            this.field482 = 0;
        }
        this.field490 = 0;
        this.method721();
    }

    @ObfuscatedName("bv.x(II)V")
    public synchronized void method730(int arg0, int arg1) {
        this.method844(arg0, arg1, this.method833());
    }

    @ObfuscatedName("bv.z(III)V")
    public synchronized void method844(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method725(arg1, arg2);
            return;
        }
        int var4 = method757(arg1, arg2);
        int var5 = method811(arg1, arg2);
        if (this.field484 == var4 && this.field485 == var5) {
            this.field490 = 0;
            return;
        }
        int var6 = arg1 - this.field489;
        if (this.field489 - arg1 > var6) {
            var6 = this.field489 - arg1;
        }
        if (var4 - this.field484 > var6) {
            var6 = var4 - this.field484;
        }
        if (this.field484 - var4 > var6) {
            var6 = this.field484 - var4;
        }
        if (var5 - this.field485 > var6) {
            var6 = var5 - this.field485;
        }
        if (this.field485 - var5 > var6) {
            var6 = this.field485 - var5;
        }
        if (arg0 > var6) {
            arg0 = var6;
        }
        this.field490 = arg0;
        this.field482 = arg1;
        this.field479 = arg2;
        this.field491 = (arg1 - this.field489) / arg0;
        this.field492 = (var4 - this.field484) / arg0;
        this.field493 = (var5 - this.field485) / arg0;
    }

    @ObfuscatedName("bv.w(I)V")
    public synchronized void method731(int arg0) {
        if (arg0 == 0) {
            this.method724(0);
            this.method5496();
        } else if (this.field484 == 0 && this.field485 == 0) {
            this.field490 = 0;
            this.field482 = 0;
            this.field489 = 0;
            this.method5496();
        } else {
            int var2 = -this.field489;
            if (this.field489 > var2) {
                var2 = this.field489;
            }
            if (-this.field484 > var2) {
                var2 = -this.field484;
            }
            if (this.field484 > var2) {
                var2 = this.field484;
            }
            if (-this.field485 > var2) {
                var2 = -this.field485;
            }
            if (this.field485 > var2) {
                var2 = this.field485;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field490 = arg0;
            this.field482 = Integer.MIN_VALUE;
            this.field491 = -this.field489 / arg0;
            this.field492 = -this.field484 / arg0;
            this.field493 = -this.field485 / arg0;
        }
    }

    @ObfuscatedName("bv.t(I)V")
    public synchronized void method821(int arg0) {
        if (this.field480 < 0) {
            this.field480 = -arg0;
        } else {
            this.field480 = arg0;
        }
    }

    @ObfuscatedName("bv.h()I")
    public synchronized int method733() {
        return this.field480 < 0 ? -this.field480 : this.field480;
    }

    @ObfuscatedName("bv.ag()Z")
    public boolean method726() {
        return this.field481 < 0 || this.field481 >= ((class51) this.field494).field403.length << 8;
    }

    @ObfuscatedName("bv.ax()Z")
    public boolean method735() {
        return this.field490 != 0;
    }

    @ObfuscatedName("bv.j()Lbm;")
    public class59 method553() {
        return null;
    }

    @ObfuscatedName("bv.r()Lbm;")
    public class59 method556() {
        return null;
    }

    @ObfuscatedName("bv.b()I")
    public int method557() {
        return this.field482 == 0 && this.field490 == 0 ? 0 : 1;
    }

    @ObfuscatedName("bv.d([III)V")
    public synchronized void method586(int[] arg0, int arg1, int arg2) {
        if (this.field482 == 0 && this.field490 == 0) {
            this.method558(arg2);
            return;
        }
        class51 var4 = (class51) this.field494;
        int var5 = this.field487 << 8;
        int var6 = this.field488 << 8;
        int var7 = var4.field403.length << 8;
        int var8 = var6 - var5;
        if (var8 <= 0) {
            this.field486 = 0;
        }
        int var9 = arg1;
        int var10 = arg1 + arg2;
        if (this.field481 < 0) {
            if (this.field480 <= 0) {
                this.method729();
                this.method5496();
                return;
            }
            this.field481 = 0;
        }
        if (this.field481 >= var7) {
            if (this.field480 >= 0) {
                this.method729();
                this.method5496();
                return;
            }
            this.field481 = var7 - 1;
        }
        if (this.field486 >= 0) {
            if (this.field486 > 0) {
                if (this.field483) {
                    label131: {
                        if (this.field480 < 0) {
                            var9 = this.method737(arg0, arg1, var5, var10, var4.field403[this.field487]);
                            if (this.field481 >= var5) {
                                return;
                            }
                            this.field481 = var5 + var5 - 1 - this.field481;
                            this.field480 = -this.field480;
                            if (--this.field486 == 0) {
                                break label131;
                            }
                        }
                        do {
                            var9 = this.method736(arg0, var9, var6, var10, var4.field403[this.field488 - 1]);
                            if (this.field481 < var6) {
                                return;
                            }
                            this.field481 = var6 + var6 - 1 - this.field481;
                            this.field480 = -this.field480;
                            if (--this.field486 == 0) {
                                break;
                            }
                            var9 = this.method737(arg0, var9, var5, var10, var4.field403[this.field487]);
                            if (this.field481 >= var5) {
                                return;
                            }
                            this.field481 = var5 + var5 - 1 - this.field481;
                            this.field480 = -this.field480;
                        } while (--this.field486 != 0);
                    }
                } else if (this.field480 < 0) {
                    while (true) {
                        var9 = this.method737(arg0, var9, var5, var10, var4.field403[this.field488 - 1]);
                        if (this.field481 >= var5) {
                            return;
                        }
                        int var12 = (var6 - 1 - this.field481) / var8;
                        if (var12 >= this.field486) {
                            this.field481 += this.field486 * var8;
                            this.field486 = 0;
                            break;
                        }
                        this.field481 += var8 * var12;
                        this.field486 -= var12;
                    }
                } else {
                    while (true) {
                        var9 = this.method736(arg0, var9, var6, var10, var4.field403[this.field487]);
                        if (this.field481 < var6) {
                            return;
                        }
                        int var13 = (this.field481 - var5) / var8;
                        if (var13 >= this.field486) {
                            this.field481 -= this.field486 * var8;
                            this.field486 = 0;
                            break;
                        }
                        this.field481 -= var8 * var13;
                        this.field486 -= var13;
                    }
                }
            }
            if (this.field480 < 0) {
                this.method737(arg0, var9, 0, var10, 0);
                if (this.field481 < 0) {
                    this.field481 = -1;
                    this.method729();
                    this.method5496();
                }
            } else {
                this.method736(arg0, var9, var7, var10, 0);
                if (this.field481 >= var7) {
                    this.field481 = var7;
                    this.method729();
                    this.method5496();
                }
            }
        } else if (this.field483) {
            if (this.field480 < 0) {
                var9 = this.method737(arg0, arg1, var5, var10, var4.field403[this.field487]);
                if (this.field481 >= var5) {
                    return;
                }
                this.field481 = var5 + var5 - 1 - this.field481;
                this.field480 = -this.field480;
            }
            while (true) {
                int var11 = this.method736(arg0, var9, var6, var10, var4.field403[this.field488 - 1]);
                if (this.field481 < var6) {
                    return;
                }
                this.field481 = var6 + var6 - 1 - this.field481;
                this.field480 = -this.field480;
                var9 = this.method737(arg0, var11, var5, var10, var4.field403[this.field487]);
                if (this.field481 >= var5) {
                    return;
                }
                this.field481 = var5 + var5 - 1 - this.field481;
                this.field480 = -this.field480;
            }
        } else if (this.field480 < 0) {
            while (true) {
                var9 = this.method737(arg0, var9, var5, var10, var4.field403[this.field488 - 1]);
                if (this.field481 >= var5) {
                    return;
                }
                this.field481 = var6 - 1 - (var6 - 1 - this.field481) % var8;
            }
        } else {
            while (true) {
                var9 = this.method736(arg0, var9, var6, var10, var4.field403[this.field487]);
                if (this.field481 < var6) {
                    return;
                }
                this.field481 = (this.field481 - var5) % var8 + var5;
            }
        }
    }

    @ObfuscatedName("bv.u(I)V")
    public synchronized void method558(int arg0) {
        if (this.field490 > 0) {
            if (arg0 >= this.field490) {
                if (this.field482 == Integer.MIN_VALUE) {
                    this.field482 = 0;
                    this.field485 = 0;
                    this.field484 = 0;
                    this.field489 = 0;
                    this.method5496();
                    arg0 = this.field490;
                }
                this.field490 = 0;
                this.method721();
            } else {
                this.field489 += this.field491 * arg0;
                this.field484 += this.field492 * arg0;
                this.field485 += this.field493 * arg0;
                this.field490 -= arg0;
            }
        }
        class51 var2 = (class51) this.field494;
        int var3 = this.field487 << 8;
        int var4 = this.field488 << 8;
        int var5 = var2.field403.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field486 = 0;
        }
        if (this.field481 < 0) {
            if (this.field480 <= 0) {
                this.method729();
                this.method5496();
                return;
            }
            this.field481 = 0;
        }
        if (this.field481 >= var5) {
            if (this.field480 >= 0) {
                this.method729();
                this.method5496();
                return;
            }
            this.field481 = var5 - 1;
        }
        this.field481 += this.field480 * arg0;
        if (this.field486 >= 0) {
            if (this.field486 > 0) {
                if (this.field483) {
                    label121: {
                        if (this.field480 < 0) {
                            if (this.field481 >= var3) {
                                return;
                            }
                            this.field481 = var3 + var3 - 1 - this.field481;
                            this.field480 = -this.field480;
                            if (--this.field486 == 0) {
                                break label121;
                            }
                        }
                        do {
                            if (this.field481 < var4) {
                                return;
                            }
                            this.field481 = var4 + var4 - 1 - this.field481;
                            this.field480 = -this.field480;
                            if (--this.field486 == 0) {
                                break;
                            }
                            if (this.field481 >= var3) {
                                return;
                            }
                            this.field481 = var3 + var3 - 1 - this.field481;
                            this.field480 = -this.field480;
                        } while (--this.field486 != 0);
                    }
                } else {
                    label153: {
                        if (this.field480 < 0) {
                            if (this.field481 >= var3) {
                                return;
                            }
                            int var7 = (var4 - 1 - this.field481) / var6;
                            if (var7 >= this.field486) {
                                this.field481 += this.field486 * var6;
                                this.field486 = 0;
                                break label153;
                            }
                            this.field481 += var6 * var7;
                            this.field486 -= var7;
                        } else if (this.field481 >= var4) {
                            int var8 = (this.field481 - var3) / var6;
                            if (var8 >= this.field486) {
                                this.field481 -= this.field486 * var6;
                                this.field486 = 0;
                                break label153;
                            }
                            this.field481 -= var6 * var8;
                            this.field486 -= var8;
                        } else {
                            return;
                        }
                        return;
                    }
                }
            }
            if (this.field480 < 0) {
                if (this.field481 < 0) {
                    this.field481 = -1;
                    this.method729();
                    this.method5496();
                }
            } else if (this.field481 >= var5) {
                this.field481 = var5;
                this.method729();
                this.method5496();
            }
        } else if (this.field483) {
            if (this.field480 < 0) {
                if (this.field481 >= var3) {
                    return;
                }
                this.field481 = var3 + var3 - 1 - this.field481;
                this.field480 = -this.field480;
            }
            while (this.field481 >= var4) {
                this.field481 = var4 + var4 - 1 - this.field481;
                this.field480 = -this.field480;
                if (this.field481 >= var3) {
                    return;
                }
                this.field481 = var3 + var3 - 1 - this.field481;
                this.field480 = -this.field480;
            }
        } else if (this.field480 < 0) {
            if (this.field481 >= var3) {
                return;
            }
            this.field481 = var4 - 1 - (var4 - 1 - this.field481) % var6;
        } else if (this.field481 >= var4) {
            this.field481 = (this.field481 - var3) % var6 + var3;
        } else {
            return;
        }
    }

    @ObfuscatedName("bv.as([IIIII)I")
    public int method736(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field490 > 0) {
                int var6 = this.field490 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field490 += arg1;
                if (this.field480 == 256 && (this.field481 & 0xFF) == 0) {
                    if (Statics.field417) {
                        arg1 = method748(0, ((class51) this.field494).field403, arg0, this.field481, arg1, this.field484, this.field485, this.field492, this.field493, 0, var6, arg2, this);
                    } else {
                        arg1 = method747(((class51) this.field494).field403, arg0, this.field481, arg1, this.field489, this.field491, 0, var6, arg2, this);
                    }
                } else if (Statics.field417) {
                    arg1 = method824(0, 0, ((class51) this.field494).field403, arg0, this.field481, arg1, this.field484, this.field485, this.field492, this.field493, 0, var6, arg2, this, this.field480, arg4);
                } else {
                    arg1 = method828(0, 0, ((class51) this.field494).field403, arg0, this.field481, arg1, this.field489, this.field491, 0, var6, arg2, this, this.field480, arg4);
                }
                this.field490 -= arg1;
                if (this.field490 != 0) {
                    return arg1;
                }
                if (!this.method738()) {
                    continue;
                }
                return arg3;
            }
            if (this.field480 == 256 && (this.field481 & 0xFF) == 0) {
                if (Statics.field417) {
                    return method740(0, ((class51) this.field494).field403, arg0, this.field481, arg1, this.field484, this.field485, 0, arg3, arg2, this);
                }
                return method739(((class51) this.field494).field403, arg0, this.field481, arg1, this.field489, 0, arg3, arg2, this);
            }
            if (Statics.field417) {
                return method744(0, 0, ((class51) this.field494).field403, arg0, this.field481, arg1, this.field484, this.field485, 0, arg3, arg2, this, this.field480, arg4);
            }
            return method743(0, 0, ((class51) this.field494).field403, arg0, this.field481, arg1, this.field489, 0, arg3, arg2, this, this.field480, arg4);
        }
    }

    @ObfuscatedName("bv.av([IIIII)I")
    public int method737(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field490 > 0) {
                int var6 = this.field490 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field490 += arg1;
                if (this.field480 == -256 && (this.field481 & 0xFF) == 0) {
                    if (Statics.field417) {
                        arg1 = method750(0, ((class51) this.field494).field403, arg0, this.field481, arg1, this.field484, this.field485, this.field492, this.field493, 0, var6, arg2, this);
                    } else {
                        arg1 = method749(((class51) this.field494).field403, arg0, this.field481, arg1, this.field489, this.field491, 0, var6, arg2, this);
                    }
                } else if (Statics.field417) {
                    arg1 = method779(0, 0, ((class51) this.field494).field403, arg0, this.field481, arg1, this.field484, this.field485, this.field492, this.field493, 0, var6, arg2, this, this.field480, arg4);
                } else {
                    arg1 = method732(0, 0, ((class51) this.field494).field403, arg0, this.field481, arg1, this.field489, this.field491, 0, var6, arg2, this, this.field480, arg4);
                }
                this.field490 -= arg1;
                if (this.field490 != 0) {
                    return arg1;
                }
                if (!this.method738()) {
                    continue;
                }
                return arg3;
            }
            if (this.field480 == -256 && (this.field481 & 0xFF) == 0) {
                if (Statics.field417) {
                    return method742(0, ((class51) this.field494).field403, arg0, this.field481, arg1, this.field484, this.field485, 0, arg3, arg2, this);
                }
                return method741(((class51) this.field494).field403, arg0, this.field481, arg1, this.field489, 0, arg3, arg2, this);
            }
            if (Statics.field417) {
                return method746(0, 0, ((class51) this.field494).field403, arg0, this.field481, arg1, this.field484, this.field485, 0, arg3, arg2, this, this.field480, arg4);
            }
            return method718(0, 0, ((class51) this.field494).field403, arg0, this.field481, arg1, this.field489, 0, arg3, arg2, this, this.field480, arg4);
        }
    }

    @ObfuscatedName("bv.ac()Z")
    public boolean method738() {
        int var1 = this.field482;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method757(var1, this.field479);
            var2 = method811(var1, this.field479);
        }
        if (this.field489 != var1 || this.field484 != var3 || this.field485 != var2) {
            if (this.field489 < var1) {
                this.field491 = 1;
                this.field490 = var1 - this.field489;
            } else if (this.field489 > var1) {
                this.field491 = -1;
                this.field490 = this.field489 - var1;
            } else {
                this.field491 = 0;
            }
            if (this.field484 < var3) {
                this.field492 = 1;
                if (this.field490 == 0 || this.field490 > var3 - this.field484) {
                    this.field490 = var3 - this.field484;
                }
            } else if (this.field484 > var3) {
                this.field492 = -1;
                if (this.field490 == 0 || this.field490 > this.field484 - var3) {
                    this.field490 = this.field484 - var3;
                }
            } else {
                this.field492 = 0;
            }
            if (this.field485 < var2) {
                this.field493 = 1;
                if (this.field490 == 0 || this.field490 > var2 - this.field485) {
                    this.field490 = var2 - this.field485;
                }
            } else if (this.field485 > var2) {
                this.field493 = -1;
                if (this.field490 == 0 || this.field490 > this.field485 - var2) {
                    this.field490 = this.field485 - var2;
                }
            } else {
                this.field493 = 0;
            }
            return false;
        } else if (this.field482 == Integer.MIN_VALUE) {
            this.field482 = 0;
            this.field485 = 0;
            this.field484 = 0;
            this.field489 = 0;
            this.method5496();
            return true;
        } else {
            this.method721();
            return false;
        }
    }

    @ObfuscatedName("bv.at([B[IIIIIIILbv;)I")
    public static int method739(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class58 arg8) {
        int var9 = arg2 >> 8;
        int var10 = arg7 >> 8;
        int var11 = arg4 << 2;
        int var12;
        if ((var12 = arg3 + var10 - var9) > arg6) {
            var12 = arg6;
        }
        var12 -= 3;
        int var10001;
        while (arg3 < var12) {
            var10001 = arg3++;
            arg1[var10001] += arg0[var9++] * var11;
            int var13 = arg3++;
            arg1[var13] += arg0[var9++] * var11;
            int var14 = arg3++;
            arg1[var14] += arg0[var9++] * var11;
            int var15 = arg3++;
            arg1[var15] += arg0[var9++] * var11;
        }
        var12 += 3;
        while (arg3 < var12) {
            var10001 = arg3++;
            arg1[var10001] += arg0[var9++] * var11;
        }
        arg8.field481 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("bv.ao(I[B[IIIIIIIILbv;)I")
    public static int method740(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class58 arg10) {
        int var11 = arg3 >> 8;
        int var12 = arg9 >> 8;
        int var13 = arg5 << 2;
        int var14 = arg6 << 2;
        int var15;
        if ((var15 = arg4 + var12 - var11) > arg8) {
            var15 = arg8;
        }
        int var16 = arg4 << 1;
        int var17 = var15 << 1;
        int var23 = var17 - 6;
        while (var16 < var23) {
            byte var18 = arg1[var11++];
            int var24 = var16++;
            arg2[var24] += var13 * var18;
            int var25 = var16++;
            arg2[var25] += var14 * var18;
            byte var19 = arg1[var11++];
            int var27 = var16++;
            arg2[var27] += var13 * var19;
            int var28 = var16++;
            arg2[var28] += var14 * var19;
            byte var20 = arg1[var11++];
            int var30 = var16++;
            arg2[var30] += var13 * var20;
            int var31 = var16++;
            arg2[var31] += var14 * var20;
            byte var21 = arg1[var11++];
            int var33 = var16++;
            arg2[var33] += var13 * var21;
            int var34 = var16++;
            arg2[var34] += var14 * var21;
        }
        var17 = var23 + 6;
        while (var16 < var17) {
            byte var22 = arg1[var11++];
            int var10001 = var16++;
            arg2[var10001] += var13 * var22;
            int var35 = var16++;
            arg2[var35] += var14 * var22;
        }
        arg10.field481 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("bv.aq([B[IIIIIIILbv;)I")
    public static int method741(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class58 arg8) {
        int var9 = arg2 >> 8;
        int var10 = arg7 >> 8;
        int var11 = arg4 << 2;
        int var12;
        if ((var12 = arg3 + var9 - (var10 - 1)) > arg6) {
            var12 = arg6;
        }
        var12 -= 3;
        int var10001;
        while (arg3 < var12) {
            var10001 = arg3++;
            arg1[var10001] += arg0[var9--] * var11;
            int var13 = arg3++;
            arg1[var13] += arg0[var9--] * var11;
            int var14 = arg3++;
            arg1[var14] += arg0[var9--] * var11;
            int var15 = arg3++;
            arg1[var15] += arg0[var9--] * var11;
        }
        var12 += 3;
        while (arg3 < var12) {
            var10001 = arg3++;
            arg1[var10001] += arg0[var9--] * var11;
        }
        arg8.field481 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("bv.aw(I[B[IIIIIIIILbv;)I")
    public static int method742(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class58 arg10) {
        int var11 = arg3 >> 8;
        int var12 = arg9 >> 8;
        int var13 = arg5 << 2;
        int var14 = arg6 << 2;
        int var15;
        if ((var15 = arg4 + var11 - (var12 - 1)) > arg8) {
            var15 = arg8;
        }
        int var16 = arg4 << 1;
        int var17 = var15 << 1;
        int var23 = var17 - 6;
        while (var16 < var23) {
            byte var18 = arg1[var11--];
            int var24 = var16++;
            arg2[var24] += var13 * var18;
            int var25 = var16++;
            arg2[var25] += var14 * var18;
            byte var19 = arg1[var11--];
            int var27 = var16++;
            arg2[var27] += var13 * var19;
            int var28 = var16++;
            arg2[var28] += var14 * var19;
            byte var20 = arg1[var11--];
            int var30 = var16++;
            arg2[var30] += var13 * var20;
            int var31 = var16++;
            arg2[var31] += var14 * var20;
            byte var21 = arg1[var11--];
            int var33 = var16++;
            arg2[var33] += var13 * var21;
            int var34 = var16++;
            arg2[var34] += var14 * var21;
        }
        var17 = var23 + 6;
        while (var16 < var17) {
            byte var22 = arg1[var11--];
            int var10001 = var16++;
            arg2[var10001] += var13 * var22;
            int var35 = var16++;
            arg2[var35] += var14 * var22;
        }
        arg10.field481 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("bv.af(II[B[IIIIIIILbv;II)I")
    public static int method743(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class58 arg10, int arg11, int arg12) {
        int var13;
        if (arg11 == 0 || (var13 = (arg9 - arg4 + arg11 - 257) / arg11 + arg5) > arg8) {
            var13 = arg8;
        }
        int var10001;
        while (arg5 < var13) {
            int var14 = arg4 >> 8;
            byte var15 = arg2[var14];
            var10001 = arg5++;
            arg3[var10001] += ((var15 << 8) + (arg4 & 0xFF) * (arg2[var14 + 1] - var15)) * arg6 >> 6;
            arg4 += arg11;
        }
        int var16;
        if (arg11 == 0 || (var16 = (arg9 - arg4 + arg11 - 1) / arg11 + arg5) > arg8) {
            var16 = arg8;
        }
        int var17 = arg12;
        while (arg5 < var16) {
            byte var18 = arg2[arg4 >> 8];
            var10001 = arg5++;
            arg3[var10001] += ((var18 << 8) + (arg4 & 0xFF) * (var17 - var18)) * arg6 >> 6;
            arg4 += arg11;
        }
        arg10.field481 = arg4;
        return arg5;
    }

    @ObfuscatedName("bv.ak(II[B[IIIIIIIILbv;II)I")
    public static int method744(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class58 arg11, int arg12, int arg13) {
        int var14;
        if (arg12 == 0 || (var14 = (arg10 - arg4 + arg12 - 257) / arg12 + arg5) > arg9) {
            var14 = arg9;
        }
        int var15 = arg5 << 1;
        int var16 = var14 << 1;
        int var10001;
        while (var15 < var16) {
            int var17 = arg4 >> 8;
            byte var18 = arg2[var17];
            int var19 = (var18 << 8) + (arg4 & 0xFF) * (arg2[var17 + 1] - var18);
            var10001 = var15++;
            arg3[var10001] += arg6 * var19 >> 6;
            int var25 = var15++;
            arg3[var25] += arg7 * var19 >> 6;
            arg4 += arg12;
        }
        int var20;
        if (arg12 == 0 || (var20 = (var15 >> 1) + (arg10 - arg4 + arg12 - 1) / arg12) > arg9) {
            var20 = arg9;
        }
        int var21 = var20 << 1;
        int var22 = arg13;
        while (var15 < var21) {
            byte var23 = arg2[arg4 >> 8];
            int var24 = (var23 << 8) + (arg4 & 0xFF) * (var22 - var23);
            var10001 = var15++;
            arg3[var10001] += arg6 * var24 >> 6;
            var10001 = var15++;
            arg3[var10001] += arg7 * var24 >> 6;
            arg4 += arg12;
        }
        arg11.field481 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("bv.ay(II[B[IIIIIIILbv;II)I")
    public static int method718(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class58 arg10, int arg11, int arg12) {
        int var13;
        if (arg11 == 0 || (var13 = (arg9 + 256 - arg4 + arg11) / arg11 + arg5) > arg8) {
            var13 = arg8;
        }
        int var10001;
        while (arg5 < var13) {
            int var14 = arg4 >> 8;
            byte var15 = arg2[var14 - 1];
            var10001 = arg5++;
            arg3[var10001] += ((var15 << 8) + (arg4 & 0xFF) * (arg2[var14] - var15)) * arg6 >> 6;
            arg4 += arg11;
        }
        int var16;
        if (arg11 == 0 || (var16 = (arg9 - arg4 + arg11) / arg11 + arg5) > arg8) {
            var16 = arg8;
        }
        int var17 = arg12;
        int var18 = arg11;
        while (arg5 < var16) {
            var10001 = arg5++;
            arg3[var10001] += ((var17 << 8) + (arg4 & 0xFF) * (arg2[arg4 >> 8] - var17)) * arg6 >> 6;
            arg4 += var18;
        }
        arg10.field481 = arg4;
        return arg5;
    }

    @ObfuscatedName("bv.aa(II[B[IIIIIIIILbv;II)I")
    public static int method746(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class58 arg11, int arg12, int arg13) {
        int var14;
        if (arg12 == 0 || (var14 = (arg10 + 256 - arg4 + arg12) / arg12 + arg5) > arg9) {
            var14 = arg9;
        }
        int var15 = arg5 << 1;
        int var16 = var14 << 1;
        int var10001;
        while (var15 < var16) {
            int var17 = arg4 >> 8;
            byte var18 = arg2[var17 - 1];
            int var19 = (var18 << 8) + (arg4 & 0xFF) * (arg2[var17] - var18);
            var10001 = var15++;
            arg3[var10001] += arg6 * var19 >> 6;
            int var24 = var15++;
            arg3[var24] += arg7 * var19 >> 6;
            arg4 += arg12;
        }
        int var20;
        if (arg12 == 0 || (var20 = (var15 >> 1) + (arg10 - arg4 + arg12) / arg12) > arg9) {
            var20 = arg9;
        }
        int var21 = var20 << 1;
        int var22 = arg13;
        while (var15 < var21) {
            int var23 = (var22 << 8) + (arg4 & 0xFF) * (arg2[arg4 >> 8] - var22);
            var10001 = var15++;
            arg3[var10001] += arg6 * var23 >> 6;
            var10001 = var15++;
            arg3[var10001] += arg7 * var23 >> 6;
            arg4 += arg12;
        }
        arg11.field481 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("bv.au([B[IIIIIIIILbv;)I")
    public static int method747(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class58 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field484 += (var14 - arg3) * arg9.field492;
        arg9.field485 += (var14 - arg3) * arg9.field493;
        var14 -= 3;
        int var10001;
        while (arg3 < var14) {
            var10001 = arg3++;
            arg1[var10001] += arg0[var10++] * var12;
            int var15 = var12 + var13;
            int var18 = arg3++;
            arg1[var18] += arg0[var10++] * var15;
            int var16 = var13 + var15;
            int var19 = arg3++;
            arg1[var19] += arg0[var10++] * var16;
            int var17 = var13 + var16;
            int var20 = arg3++;
            arg1[var20] += arg0[var10++] * var17;
            var12 = var13 + var17;
        }
        var14 += 3;
        while (arg3 < var14) {
            var10001 = arg3++;
            arg1[var10001] += arg0[var10++] * var12;
            var12 += var13;
        }
        arg9.field489 = var12 >> 2;
        arg9.field481 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("bv.an(I[B[IIIIIIIIIILbv;)I")
    public static int method748(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class58 arg12) {
        int var13 = arg3 >> 8;
        int var14 = arg11 >> 8;
        int var15 = arg5 << 2;
        int var16 = arg6 << 2;
        int var17 = arg7 << 2;
        int var18 = arg8 << 2;
        int var19;
        if ((var19 = arg4 + var14 - var13) > arg10) {
            var19 = arg10;
        }
        arg12.field489 += (var19 - arg4) * arg12.field491;
        int var20 = arg4 << 1;
        int var21 = var19 << 1;
        int var44 = var21 - 6;
        while (var20 < var44) {
            byte var22 = arg1[var13++];
            int var33 = var20++;
            arg2[var33] += var15 * var22;
            int var23 = var15 + var17;
            int var34 = var20++;
            arg2[var34] += var16 * var22;
            int var24 = var16 + var18;
            byte var25 = arg1[var13++];
            int var36 = var20++;
            arg2[var36] += var23 * var25;
            int var26 = var17 + var23;
            int var37 = var20++;
            arg2[var37] += var24 * var25;
            int var27 = var18 + var24;
            byte var28 = arg1[var13++];
            int var39 = var20++;
            arg2[var39] += var26 * var28;
            int var29 = var17 + var26;
            int var40 = var20++;
            arg2[var40] += var27 * var28;
            int var30 = var18 + var27;
            byte var31 = arg1[var13++];
            int var42 = var20++;
            arg2[var42] += var29 * var31;
            var15 = var17 + var29;
            int var43 = var20++;
            arg2[var43] += var30 * var31;
            var16 = var18 + var30;
        }
        var21 = var44 + 6;
        while (var20 < var21) {
            byte var32 = arg1[var13++];
            int var10001 = var20++;
            arg2[var10001] += var15 * var32;
            var15 += var17;
            int var45 = var20++;
            arg2[var45] += var16 * var32;
            var16 += var18;
        }
        arg12.field484 = var15 >> 2;
        arg12.field485 = var16 >> 2;
        arg12.field481 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("bv.bd([B[IIIIIIIILbv;)I")
    public static int method749(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class58 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field484 += (var14 - arg3) * arg9.field492;
        arg9.field485 += (var14 - arg3) * arg9.field493;
        var14 -= 3;
        int var10001;
        while (arg3 < var14) {
            var10001 = arg3++;
            arg1[var10001] += arg0[var10--] * var12;
            int var15 = var12 + var13;
            int var18 = arg3++;
            arg1[var18] += arg0[var10--] * var15;
            int var16 = var13 + var15;
            int var19 = arg3++;
            arg1[var19] += arg0[var10--] * var16;
            int var17 = var13 + var16;
            int var20 = arg3++;
            arg1[var20] += arg0[var10--] * var17;
            var12 = var13 + var17;
        }
        var14 += 3;
        while (arg3 < var14) {
            var10001 = arg3++;
            arg1[var10001] += arg0[var10--] * var12;
            var12 += var13;
        }
        arg9.field489 = var12 >> 2;
        arg9.field481 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("bv.bt(I[B[IIIIIIIIIILbv;)I")
    public static int method750(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class58 arg12) {
        int var13 = arg3 >> 8;
        int var14 = arg11 >> 8;
        int var15 = arg5 << 2;
        int var16 = arg6 << 2;
        int var17 = arg7 << 2;
        int var18 = arg8 << 2;
        int var19;
        if ((var19 = arg4 + var13 - (var14 - 1)) > arg10) {
            var19 = arg10;
        }
        arg12.field489 += (var19 - arg4) * arg12.field491;
        int var20 = arg4 << 1;
        int var21 = var19 << 1;
        int var44 = var21 - 6;
        while (var20 < var44) {
            byte var22 = arg1[var13--];
            int var33 = var20++;
            arg2[var33] += var15 * var22;
            int var23 = var15 + var17;
            int var34 = var20++;
            arg2[var34] += var16 * var22;
            int var24 = var16 + var18;
            byte var25 = arg1[var13--];
            int var36 = var20++;
            arg2[var36] += var23 * var25;
            int var26 = var17 + var23;
            int var37 = var20++;
            arg2[var37] += var24 * var25;
            int var27 = var18 + var24;
            byte var28 = arg1[var13--];
            int var39 = var20++;
            arg2[var39] += var26 * var28;
            int var29 = var17 + var26;
            int var40 = var20++;
            arg2[var40] += var27 * var28;
            int var30 = var18 + var27;
            byte var31 = arg1[var13--];
            int var42 = var20++;
            arg2[var42] += var29 * var31;
            var15 = var17 + var29;
            int var43 = var20++;
            arg2[var43] += var30 * var31;
            var16 = var18 + var30;
        }
        var21 = var44 + 6;
        while (var20 < var21) {
            byte var32 = arg1[var13--];
            int var10001 = var20++;
            arg2[var10001] += var15 * var32;
            var15 += var17;
            int var45 = var20++;
            arg2[var45] += var16 * var32;
            var16 += var18;
        }
        arg12.field484 = var15 >> 2;
        arg12.field485 = var16 >> 2;
        arg12.field481 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("bv.bq(II[B[IIIIIIIILbv;II)I")
    public static int method828(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class58 arg11, int arg12, int arg13) {
        arg11.field484 -= arg11.field492 * arg5;
        arg11.field485 -= arg11.field493 * arg5;
        int var14;
        if (arg12 == 0 || (var14 = (arg10 - arg4 + arg12 - 257) / arg12 + arg5) > arg9) {
            var14 = arg9;
        }
        int var10001;
        while (arg5 < var14) {
            int var15 = arg4 >> 8;
            byte var16 = arg2[var15];
            var10001 = arg5++;
            arg3[var10001] += ((var16 << 8) + (arg4 & 0xFF) * (arg2[var15 + 1] - var16)) * arg6 >> 6;
            arg6 += arg7;
            arg4 += arg12;
        }
        int var17;
        if (arg12 == 0 || (var17 = (arg10 - arg4 + arg12 - 1) / arg12 + arg5) > arg9) {
            var17 = arg9;
        }
        int var18 = arg13;
        while (arg5 < var17) {
            byte var19 = arg2[arg4 >> 8];
            var10001 = arg5++;
            arg3[var10001] += ((var19 << 8) + (arg4 & 0xFF) * (var18 - var19)) * arg6 >> 6;
            arg6 += arg7;
            arg4 += arg12;
        }
        arg11.field484 += arg11.field492 * arg5;
        arg11.field485 += arg11.field493 * arg5;
        arg11.field489 = arg6;
        arg11.field481 = arg4;
        return arg5;
    }

    @ObfuscatedName("bv.bu(II[B[IIIIIIIIIILbv;II)I")
    public static int method824(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class58 arg13, int arg14, int arg15) {
        arg13.field489 -= arg13.field491 * arg5;
        int var16;
        if (arg14 == 0 || (var16 = (arg12 - arg4 + arg14 - 257) / arg14 + arg5) > arg11) {
            var16 = arg11;
        }
        int var17 = arg5 << 1;
        int var18 = var16 << 1;
        int var10001;
        while (var17 < var18) {
            int var19 = arg4 >> 8;
            byte var20 = arg2[var19];
            int var21 = (var20 << 8) + (arg4 & 0xFF) * (arg2[var19 + 1] - var20);
            var10001 = var17++;
            arg3[var10001] += arg6 * var21 >> 6;
            arg6 += arg8;
            int var28 = var17++;
            arg3[var28] += arg7 * var21 >> 6;
            arg7 += arg9;
            arg4 += arg14;
        }
        int var22;
        if (arg14 == 0 || (var22 = (var17 >> 1) + (arg12 - arg4 + arg14 - 1) / arg14) > arg11) {
            var22 = arg11;
        }
        int var23 = var22 << 1;
        int var24 = arg15;
        while (var17 < var23) {
            byte var25 = arg2[arg4 >> 8];
            int var26 = (var25 << 8) + (arg4 & 0xFF) * (var24 - var25);
            var10001 = var17++;
            arg3[var10001] += arg6 * var26 >> 6;
            arg6 += arg8;
            var10001 = var17++;
            arg3[var10001] += arg7 * var26 >> 6;
            arg7 += arg9;
            arg4 += arg14;
        }
        int var27 = var17 >> 1;
        arg13.field489 += arg13.field491 * var27;
        arg13.field484 = arg6;
        arg13.field485 = arg7;
        arg13.field481 = arg4;
        return var27;
    }

    @ObfuscatedName("bv.bl(II[B[IIIIIIIILbv;II)I")
    public static int method732(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class58 arg11, int arg12, int arg13) {
        arg11.field484 -= arg11.field492 * arg5;
        arg11.field485 -= arg11.field493 * arg5;
        int var14;
        if (arg12 == 0 || (var14 = (arg10 + 256 - arg4 + arg12) / arg12 + arg5) > arg9) {
            var14 = arg9;
        }
        int var10001;
        while (arg5 < var14) {
            int var15 = arg4 >> 8;
            byte var16 = arg2[var15 - 1];
            var10001 = arg5++;
            arg3[var10001] += ((var16 << 8) + (arg4 & 0xFF) * (arg2[var15] - var16)) * arg6 >> 6;
            arg6 += arg7;
            arg4 += arg12;
        }
        int var17;
        if (arg12 == 0 || (var17 = (arg10 - arg4 + arg12) / arg12 + arg5) > arg9) {
            var17 = arg9;
        }
        int var18 = arg13;
        int var19 = arg12;
        while (arg5 < var17) {
            var10001 = arg5++;
            arg3[var10001] += ((var18 << 8) + (arg4 & 0xFF) * (arg2[arg4 >> 8] - var18)) * arg6 >> 6;
            arg6 += arg7;
            arg4 += var19;
        }
        arg11.field484 += arg11.field492 * arg5;
        arg11.field485 += arg11.field493 * arg5;
        arg11.field489 = arg6;
        arg11.field481 = arg4;
        return arg5;
    }

    @ObfuscatedName("bv.bv(II[B[IIIIIIIIIILbv;II)I")
    public static int method779(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class58 arg13, int arg14, int arg15) {
        arg13.field489 -= arg13.field491 * arg5;
        int var16;
        if (arg14 == 0 || (var16 = (arg12 + 256 - arg4 + arg14) / arg14 + arg5) > arg11) {
            var16 = arg11;
        }
        int var17 = arg5 << 1;
        int var18 = var16 << 1;
        int var10001;
        while (var17 < var18) {
            int var19 = arg4 >> 8;
            byte var20 = arg2[var19 - 1];
            int var21 = (var20 << 8) + (arg4 & 0xFF) * (arg2[var19] - var20);
            var10001 = var17++;
            arg3[var10001] += arg6 * var21 >> 6;
            arg6 += arg8;
            int var27 = var17++;
            arg3[var27] += arg7 * var21 >> 6;
            arg7 += arg9;
            arg4 += arg14;
        }
        int var22;
        if (arg14 == 0 || (var22 = (var17 >> 1) + (arg12 - arg4 + arg14) / arg14) > arg11) {
            var22 = arg11;
        }
        int var23 = var22 << 1;
        int var24 = arg15;
        while (var17 < var23) {
            int var25 = (var24 << 8) + (arg4 & 0xFF) * (arg2[arg4 >> 8] - var24);
            var10001 = var17++;
            arg3[var10001] += arg6 * var25 >> 6;
            arg6 += arg8;
            var10001 = var17++;
            arg3[var10001] += arg7 * var25 >> 6;
            arg7 += arg9;
            arg4 += arg14;
        }
        int var26 = var17 >> 1;
        arg13.field489 += arg13.field491 * var26;
        arg13.field484 = arg6;
        arg13.field485 = arg7;
        arg13.field481 = arg4;
        return var26;
    }
}
