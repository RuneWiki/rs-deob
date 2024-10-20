package deob;

@ObfuscatedName("al")
public class class30 extends class31 {

    @ObfuscatedName("al.s")
    public int field243;

    @ObfuscatedName("al.t")
    public int field237;

    @ObfuscatedName("al.v")
    public int field238;

    @ObfuscatedName("al.j")
    public int field239;

    @ObfuscatedName("al.l")
    public int field240;

    @ObfuscatedName("al.n")
    public int field248;

    @ObfuscatedName("al.f")
    public int field242;

    @ObfuscatedName("al.o")
    public int field247;

    @ObfuscatedName("al.x")
    public int field241;

    @ObfuscatedName("al.r")
    public int field236;

    @ObfuscatedName("al.p")
    public boolean field246;

    @ObfuscatedName("al.h")
    public int field245;

    @ObfuscatedName("al.k")
    public int field244;

    @ObfuscatedName("al.a")
    public int field249;

    @ObfuscatedName("al.q")
    public int field250;

    @ObfuscatedName("al.s(II)I")
    public static int method622(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("al.t(II)I")
    public static int method597(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("al.ak()I")
    public int method638() {
        int var1 = this.field240 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field247 == 0) {
            var2 -= this.field243 * var2 / (((class23) this.field253).field165.length << 8);
        } else if (this.field247 >= 0) {
            var2 -= this.field241 * var2 / ((class23) this.field253).field165.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    public class30(class23 arg0, int arg1, int arg2) {
        this.field253 = arg0;
        this.field241 = arg0.field166;
        this.field236 = arg0.field167;
        this.field246 = arg0.field168;
        this.field237 = arg1;
        this.field238 = arg2;
        this.field239 = 8192;
        this.field243 = 0;
        this.method530();
    }

    public class30(class23 arg0, int arg1, int arg2, int arg3) {
        this.field253 = arg0;
        this.field241 = arg0.field166;
        this.field236 = arg0.field167;
        this.field246 = arg0.field168;
        this.field237 = arg1;
        this.field238 = arg2;
        this.field239 = arg3;
        this.field243 = 0;
        this.method530();
    }

    @ObfuscatedName("al.v(Lz;II)Lal;")
    public static class30 method573(class23 arg0, int arg1, int arg2) {
        return arg0.field165 == null || arg0.field165.length == 0 ? null : new class30(arg0, (int) ((long) arg0.field164 * 256L * (long) arg1 / (long) (Statics.field3634 * 100)), arg2 << 6);
    }

    @ObfuscatedName("al.j(Lz;III)Lal;")
    public static class30 method529(class23 arg0, int arg1, int arg2, int arg3) {
        return arg0.field165 == null || arg0.field165.length == 0 ? null : new class30(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("al.l()V")
    public void method530() {
        this.field240 = this.field238;
        this.field248 = method622(this.field238, this.field239);
        this.field242 = method597(this.field238, this.field239);
    }

    @ObfuscatedName("al.x(I)V")
    public synchronized void method603(int arg0) {
        this.field247 = arg0;
    }

    @ObfuscatedName("al.p(I)V")
    public synchronized void method532(int arg0) {
        this.method534(arg0 << 6, this.method536());
    }

    @ObfuscatedName("al.h(I)V")
    public synchronized void method533(int arg0) {
        this.method534(arg0, this.method536());
    }

    @ObfuscatedName("al.k(II)V")
    public synchronized void method534(int arg0, int arg1) {
        this.field238 = arg0;
        this.field239 = arg1;
        this.field245 = 0;
        this.method530();
    }

    @ObfuscatedName("al.a()I")
    public synchronized int method535() {
        return this.field238 == Integer.MIN_VALUE ? 0 : this.field238;
    }

    @ObfuscatedName("al.q()I")
    public synchronized int method536() {
        return this.field239 < 0 ? -1 : this.field239;
    }

    @ObfuscatedName("al.u(I)V")
    public synchronized void method537(int arg0) {
        int var2 = ((class23) this.field253).field165.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field243 = arg0;
    }

    @ObfuscatedName("al.e(Z)V")
    public synchronized void method538(boolean arg0) {
        this.field237 = (this.field237 >>> 31) + (this.field237 ^ this.field237 >> 31);
        if (arg0) {
            this.field237 = -this.field237;
        }
    }

    @ObfuscatedName("al.c()V")
    public void method574() {
        if (this.field245 == 0) {
            return;
        }
        if (this.field238 == Integer.MIN_VALUE) {
            this.field238 = 0;
        }
        this.field245 = 0;
        this.method530();
    }

    @ObfuscatedName("al.i(II)V")
    public synchronized void method540(int arg0, int arg1) {
        this.method541(arg0, arg1, this.method536());
    }

    @ObfuscatedName("al.m(III)V")
    public synchronized void method541(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method534(arg1, arg2);
            return;
        }
        int var4 = method622(arg1, arg2);
        int var5 = method597(arg1, arg2);
        if (this.field248 == var4 && this.field242 == var5) {
            this.field245 = 0;
            return;
        }
        int var6 = arg1 - this.field240;
        if (this.field240 - arg1 > var6) {
            var6 = this.field240 - arg1;
        }
        if (var4 - this.field248 > var6) {
            var6 = var4 - this.field248;
        }
        if (this.field248 - var4 > var6) {
            var6 = this.field248 - var4;
        }
        if (var5 - this.field242 > var6) {
            var6 = var5 - this.field242;
        }
        if (this.field242 - var5 > var6) {
            var6 = this.field242 - var5;
        }
        if (arg0 > var6) {
            arg0 = var6;
        }
        this.field245 = arg0;
        this.field238 = arg1;
        this.field239 = arg2;
        this.field244 = (arg1 - this.field240) / arg0;
        this.field249 = (var4 - this.field248) / arg0;
        this.field250 = (var5 - this.field242) / arg0;
    }

    @ObfuscatedName("al.b(I)V")
    public synchronized void method542(int arg0) {
        if (arg0 == 0) {
            this.method533(0);
            this.method5447();
        } else if (this.field248 == 0 && this.field242 == 0) {
            this.field245 = 0;
            this.field238 = 0;
            this.field240 = 0;
            this.method5447();
        } else {
            int var2 = -this.field240;
            if (this.field240 > var2) {
                var2 = this.field240;
            }
            if (-this.field248 > var2) {
                var2 = -this.field248;
            }
            if (this.field248 > var2) {
                var2 = this.field248;
            }
            if (-this.field242 > var2) {
                var2 = -this.field242;
            }
            if (this.field242 > var2) {
                var2 = this.field242;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field245 = arg0;
            this.field238 = Integer.MIN_VALUE;
            this.field244 = -this.field240 / arg0;
            this.field249 = -this.field248 / arg0;
            this.field250 = -this.field242 / arg0;
        }
    }

    @ObfuscatedName("al.z(I)V")
    public synchronized void method543(int arg0) {
        if (this.field237 < 0) {
            this.field237 = -arg0;
        } else {
            this.field237 = arg0;
        }
    }

    @ObfuscatedName("al.d()I")
    public synchronized int method544() {
        return this.field237 < 0 ? -this.field237 : this.field237;
    }

    @ObfuscatedName("al.y()Z")
    public boolean method586() {
        return this.field243 < 0 || this.field243 >= ((class23) this.field253).field165.length << 8;
    }

    @ObfuscatedName("al.av()Z")
    public boolean method546() {
        return this.field245 != 0;
    }

    @ObfuscatedName("al.n()Laq;")
    public class31 method373() {
        return null;
    }

    @ObfuscatedName("al.w()Laq;")
    public class31 method396() {
        return null;
    }

    @ObfuscatedName("al.f()I")
    public int method375() {
        return this.field238 == 0 && this.field245 == 0 ? 0 : 1;
    }

    @ObfuscatedName("al.o([III)V")
    public synchronized void method376(int[] arg0, int arg1, int arg2) {
        if (this.field238 == 0 && this.field245 == 0) {
            this.method378(arg2);
            return;
        }
        class23 var4 = (class23) this.field253;
        int var5 = this.field241 << 8;
        int var6 = this.field236 << 8;
        int var7 = var4.field165.length << 8;
        int var8 = var6 - var5;
        if (var8 <= 0) {
            this.field247 = 0;
        }
        int var9 = arg1;
        int var10 = arg1 + arg2;
        if (this.field243 < 0) {
            if (this.field237 <= 0) {
                this.method574();
                this.method5447();
                return;
            }
            this.field243 = 0;
        }
        if (this.field243 >= var7) {
            if (this.field237 >= 0) {
                this.method574();
                this.method5447();
                return;
            }
            this.field243 = var7 - 1;
        }
        if (this.field247 >= 0) {
            if (this.field247 > 0) {
                if (this.field246) {
                    label131: {
                        if (this.field237 < 0) {
                            var9 = this.method648(arg0, arg1, var5, var10, var4.field165[this.field241]);
                            if (this.field243 >= var5) {
                                return;
                            }
                            this.field243 = var5 + var5 - 1 - this.field243;
                            this.field237 = -this.field237;
                            if (--this.field247 == 0) {
                                break label131;
                            }
                        }
                        do {
                            var9 = this.method657(arg0, var9, var6, var10, var4.field165[this.field236 - 1]);
                            if (this.field243 < var6) {
                                return;
                            }
                            this.field243 = var6 + var6 - 1 - this.field243;
                            this.field237 = -this.field237;
                            if (--this.field247 == 0) {
                                break;
                            }
                            var9 = this.method648(arg0, var9, var5, var10, var4.field165[this.field241]);
                            if (this.field243 >= var5) {
                                return;
                            }
                            this.field243 = var5 + var5 - 1 - this.field243;
                            this.field237 = -this.field237;
                        } while (--this.field247 != 0);
                    }
                } else if (this.field237 < 0) {
                    while (true) {
                        var9 = this.method648(arg0, var9, var5, var10, var4.field165[this.field236 - 1]);
                        if (this.field243 >= var5) {
                            return;
                        }
                        int var12 = (var6 - 1 - this.field243) / var8;
                        if (var12 >= this.field247) {
                            this.field243 += this.field247 * var8;
                            this.field247 = 0;
                            break;
                        }
                        this.field243 += var8 * var12;
                        this.field247 -= var12;
                    }
                } else {
                    while (true) {
                        var9 = this.method657(arg0, var9, var6, var10, var4.field165[this.field241]);
                        if (this.field243 < var6) {
                            return;
                        }
                        int var13 = (this.field243 - var5) / var8;
                        if (var13 >= this.field247) {
                            this.field243 -= this.field247 * var8;
                            this.field247 = 0;
                            break;
                        }
                        this.field243 -= var8 * var13;
                        this.field247 -= var13;
                    }
                }
            }
            if (this.field237 < 0) {
                this.method648(arg0, var9, 0, var10, 0);
                if (this.field243 < 0) {
                    this.field243 = -1;
                    this.method574();
                    this.method5447();
                }
            } else {
                this.method657(arg0, var9, var7, var10, 0);
                if (this.field243 >= var7) {
                    this.field243 = var7;
                    this.method574();
                    this.method5447();
                }
            }
        } else if (this.field246) {
            if (this.field237 < 0) {
                var9 = this.method648(arg0, arg1, var5, var10, var4.field165[this.field241]);
                if (this.field243 >= var5) {
                    return;
                }
                this.field243 = var5 + var5 - 1 - this.field243;
                this.field237 = -this.field237;
            }
            while (true) {
                int var11 = this.method657(arg0, var9, var6, var10, var4.field165[this.field236 - 1]);
                if (this.field243 < var6) {
                    return;
                }
                this.field243 = var6 + var6 - 1 - this.field243;
                this.field237 = -this.field237;
                var9 = this.method648(arg0, var11, var5, var10, var4.field165[this.field241]);
                if (this.field243 >= var5) {
                    return;
                }
                this.field243 = var5 + var5 - 1 - this.field243;
                this.field237 = -this.field237;
            }
        } else if (this.field237 < 0) {
            while (true) {
                var9 = this.method648(arg0, var9, var5, var10, var4.field165[this.field236 - 1]);
                if (this.field243 >= var5) {
                    return;
                }
                this.field243 = var6 - 1 - (var6 - 1 - this.field243) % var8;
            }
        } else {
            while (true) {
                var9 = this.method657(arg0, var9, var6, var10, var4.field165[this.field241]);
                if (this.field243 < var6) {
                    return;
                }
                this.field243 = (this.field243 - var5) % var8 + var5;
            }
        }
    }

    @ObfuscatedName("al.r(I)V")
    public synchronized void method378(int arg0) {
        if (this.field245 > 0) {
            if (arg0 >= this.field245) {
                if (this.field238 == Integer.MIN_VALUE) {
                    this.field238 = 0;
                    this.field242 = 0;
                    this.field248 = 0;
                    this.field240 = 0;
                    this.method5447();
                    arg0 = this.field245;
                }
                this.field245 = 0;
                this.method530();
            } else {
                this.field240 += this.field244 * arg0;
                this.field248 += this.field249 * arg0;
                this.field242 += this.field250 * arg0;
                this.field245 -= arg0;
            }
        }
        class23 var2 = (class23) this.field253;
        int var3 = this.field241 << 8;
        int var4 = this.field236 << 8;
        int var5 = var2.field165.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field247 = 0;
        }
        if (this.field243 < 0) {
            if (this.field237 <= 0) {
                this.method574();
                this.method5447();
                return;
            }
            this.field243 = 0;
        }
        if (this.field243 >= var5) {
            if (this.field237 >= 0) {
                this.method574();
                this.method5447();
                return;
            }
            this.field243 = var5 - 1;
        }
        this.field243 += this.field237 * arg0;
        if (this.field247 >= 0) {
            if (this.field247 > 0) {
                if (this.field246) {
                    label121: {
                        if (this.field237 < 0) {
                            if (this.field243 >= var3) {
                                return;
                            }
                            this.field243 = var3 + var3 - 1 - this.field243;
                            this.field237 = -this.field237;
                            if (--this.field247 == 0) {
                                break label121;
                            }
                        }
                        do {
                            if (this.field243 < var4) {
                                return;
                            }
                            this.field243 = var4 + var4 - 1 - this.field243;
                            this.field237 = -this.field237;
                            if (--this.field247 == 0) {
                                break;
                            }
                            if (this.field243 >= var3) {
                                return;
                            }
                            this.field243 = var3 + var3 - 1 - this.field243;
                            this.field237 = -this.field237;
                        } while (--this.field247 != 0);
                    }
                } else {
                    label153: {
                        if (this.field237 < 0) {
                            if (this.field243 >= var3) {
                                return;
                            }
                            int var7 = (var4 - 1 - this.field243) / var6;
                            if (var7 >= this.field247) {
                                this.field243 += this.field247 * var6;
                                this.field247 = 0;
                                break label153;
                            }
                            this.field243 += var6 * var7;
                            this.field247 -= var7;
                        } else if (this.field243 >= var4) {
                            int var8 = (this.field243 - var3) / var6;
                            if (var8 >= this.field247) {
                                this.field243 -= this.field247 * var6;
                                this.field247 = 0;
                                break label153;
                            }
                            this.field243 -= var6 * var8;
                            this.field247 -= var8;
                        } else {
                            return;
                        }
                        return;
                    }
                }
            }
            if (this.field237 < 0) {
                if (this.field243 < 0) {
                    this.field243 = -1;
                    this.method574();
                    this.method5447();
                }
            } else if (this.field243 >= var5) {
                this.field243 = var5;
                this.method574();
                this.method5447();
            }
        } else if (this.field246) {
            if (this.field237 < 0) {
                if (this.field243 >= var3) {
                    return;
                }
                this.field243 = var3 + var3 - 1 - this.field243;
                this.field237 = -this.field237;
            }
            while (this.field243 >= var4) {
                this.field243 = var4 + var4 - 1 - this.field243;
                this.field237 = -this.field237;
                if (this.field243 >= var3) {
                    return;
                }
                this.field243 = var3 + var3 - 1 - this.field243;
                this.field237 = -this.field237;
            }
        } else if (this.field237 < 0) {
            if (this.field243 >= var3) {
                return;
            }
            this.field243 = var4 - 1 - (var4 - 1 - this.field243) % var6;
        } else if (this.field243 >= var4) {
            this.field243 = (this.field243 - var3) % var6 + var3;
        } else {
            return;
        }
    }

    @ObfuscatedName("al.az([IIIII)I")
    public int method657(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field245 > 0) {
                int var6 = this.field245 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field245 += arg1;
                if (this.field237 == 256 && (this.field243 & 0xFF) == 0) {
                    if (Statics.field199) {
                        arg1 = method560(0, ((class23) this.field253).field165, arg0, this.field243, arg1, this.field248, this.field242, this.field249, this.field250, 0, var6, arg2, this);
                    } else {
                        arg1 = method559(((class23) this.field253).field165, arg0, this.field243, arg1, this.field240, this.field244, 0, var6, arg2, this);
                    }
                } else if (Statics.field199) {
                    arg1 = method564(0, 0, ((class23) this.field253).field165, arg0, this.field243, arg1, this.field248, this.field242, this.field249, this.field250, 0, var6, arg2, this, this.field237, arg4);
                } else {
                    arg1 = method563(0, 0, ((class23) this.field253).field165, arg0, this.field243, arg1, this.field240, this.field244, 0, var6, arg2, this, this.field237, arg4);
                }
                this.field245 -= arg1;
                if (this.field245 != 0) {
                    return arg1;
                }
                if (!this.method550()) {
                    continue;
                }
                return arg3;
            }
            if (this.field237 == 256 && (this.field243 & 0xFF) == 0) {
                if (Statics.field199) {
                    return method552(0, ((class23) this.field253).field165, arg0, this.field243, arg1, this.field248, this.field242, 0, arg3, arg2, this);
                }
                return method551(((class23) this.field253).field165, arg0, this.field243, arg1, this.field240, 0, arg3, arg2, this);
            }
            if (Statics.field199) {
                return method556(0, 0, ((class23) this.field253).field165, arg0, this.field243, arg1, this.field248, this.field242, 0, arg3, arg2, this, this.field237, arg4);
            }
            return method555(0, 0, ((class23) this.field253).field165, arg0, this.field243, arg1, this.field240, 0, arg3, arg2, this, this.field237, arg4);
        }
    }

    @ObfuscatedName("al.aj([IIIII)I")
    public int method648(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field245 > 0) {
                int var6 = this.field245 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field245 += arg1;
                if (this.field237 == -256 && (this.field243 & 0xFF) == 0) {
                    if (Statics.field199) {
                        arg1 = method562(0, ((class23) this.field253).field165, arg0, this.field243, arg1, this.field248, this.field242, this.field249, this.field250, 0, var6, arg2, this);
                    } else {
                        arg1 = method561(((class23) this.field253).field165, arg0, this.field243, arg1, this.field240, this.field244, 0, var6, arg2, this);
                    }
                } else if (Statics.field199) {
                    arg1 = method528(0, 0, ((class23) this.field253).field165, arg0, this.field243, arg1, this.field248, this.field242, this.field249, this.field250, 0, var6, arg2, this, this.field237, arg4);
                } else {
                    arg1 = method565(0, 0, ((class23) this.field253).field165, arg0, this.field243, arg1, this.field240, this.field244, 0, var6, arg2, this, this.field237, arg4);
                }
                this.field245 -= arg1;
                if (this.field245 != 0) {
                    return arg1;
                }
                if (!this.method550()) {
                    continue;
                }
                return arg3;
            }
            if (this.field237 == -256 && (this.field243 & 0xFF) == 0) {
                if (Statics.field199) {
                    return method554(0, ((class23) this.field253).field165, arg0, this.field243, arg1, this.field248, this.field242, 0, arg3, arg2, this);
                }
                return method617(((class23) this.field253).field165, arg0, this.field243, arg1, this.field240, 0, arg3, arg2, this);
            }
            if (Statics.field199) {
                return method558(0, 0, ((class23) this.field253).field165, arg0, this.field243, arg1, this.field248, this.field242, 0, arg3, arg2, this, this.field237, arg4);
            }
            return method557(0, 0, ((class23) this.field253).field165, arg0, this.field243, arg1, this.field240, 0, arg3, arg2, this, this.field237, arg4);
        }
    }

    @ObfuscatedName("al.at()Z")
    public boolean method550() {
        int var1 = this.field238;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method622(var1, this.field239);
            var2 = method597(var1, this.field239);
        }
        if (this.field240 != var1 || this.field248 != var3 || this.field242 != var2) {
            if (this.field240 < var1) {
                this.field244 = 1;
                this.field245 = var1 - this.field240;
            } else if (this.field240 > var1) {
                this.field244 = -1;
                this.field245 = this.field240 - var1;
            } else {
                this.field244 = 0;
            }
            if (this.field248 < var3) {
                this.field249 = 1;
                if (this.field245 == 0 || this.field245 > var3 - this.field248) {
                    this.field245 = var3 - this.field248;
                }
            } else if (this.field248 > var3) {
                this.field249 = -1;
                if (this.field245 == 0 || this.field245 > this.field248 - var3) {
                    this.field245 = this.field248 - var3;
                }
            } else {
                this.field249 = 0;
            }
            if (this.field242 < var2) {
                this.field250 = 1;
                if (this.field245 == 0 || this.field245 > var2 - this.field242) {
                    this.field245 = var2 - this.field242;
                }
            } else if (this.field242 > var2) {
                this.field250 = -1;
                if (this.field245 == 0 || this.field245 > this.field242 - var2) {
                    this.field245 = this.field242 - var2;
                }
            } else {
                this.field250 = 0;
            }
            return false;
        } else if (this.field238 == Integer.MIN_VALUE) {
            this.field238 = 0;
            this.field242 = 0;
            this.field248 = 0;
            this.field240 = 0;
            this.method5447();
            return true;
        } else {
            this.method530();
            return false;
        }
    }

    @ObfuscatedName("al.af([B[IIIIIIILal;)I")
    public static int method551(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class30 arg8) {
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
        arg8.field243 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("al.ar(I[B[IIIIIIIILal;)I")
    public static int method552(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class30 arg10) {
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
        arg10.field243 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("al.ay([B[IIIIIIILal;)I")
    public static int method617(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class30 arg8) {
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
        arg8.field243 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("al.ap(I[B[IIIIIIIILal;)I")
    public static int method554(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class30 arg10) {
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
        arg10.field243 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("al.ah(II[B[IIIIIIILal;II)I")
    public static int method555(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class30 arg10, int arg11, int arg12) {
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
        arg10.field243 = arg4;
        return arg5;
    }

    @ObfuscatedName("al.ag(II[B[IIIIIIIILal;II)I")
    public static int method556(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class30 arg11, int arg12, int arg13) {
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
        arg11.field243 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("al.ai(II[B[IIIIIIILal;II)I")
    public static int method557(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class30 arg10, int arg11, int arg12) {
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
        arg10.field243 = arg4;
        return arg5;
    }

    @ObfuscatedName("al.ad(II[B[IIIIIIIILal;II)I")
    public static int method558(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class30 arg11, int arg12, int arg13) {
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
        arg11.field243 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("al.ac([B[IIIIIIIILal;)I")
    public static int method559(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class30 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field248 += (var14 - arg3) * arg9.field249;
        arg9.field242 += (var14 - arg3) * arg9.field250;
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
        arg9.field240 = var12 >> 2;
        arg9.field243 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("al.aw(I[B[IIIIIIIIIILal;)I")
    public static int method560(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class30 arg12) {
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
        arg12.field240 += (var19 - arg4) * arg12.field244;
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
        arg12.field248 = var15 >> 2;
        arg12.field242 = var16 >> 2;
        arg12.field243 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("al.bt([B[IIIIIIIILal;)I")
    public static int method561(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class30 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field248 += (var14 - arg3) * arg9.field249;
        arg9.field242 += (var14 - arg3) * arg9.field250;
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
        arg9.field240 = var12 >> 2;
        arg9.field243 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("al.bk(I[B[IIIIIIIIIILal;)I")
    public static int method562(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class30 arg12) {
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
        arg12.field240 += (var19 - arg4) * arg12.field244;
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
        arg12.field248 = var15 >> 2;
        arg12.field242 = var16 >> 2;
        arg12.field243 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("al.br(II[B[IIIIIIIILal;II)I")
    public static int method563(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class30 arg11, int arg12, int arg13) {
        arg11.field248 -= arg11.field249 * arg5;
        arg11.field242 -= arg11.field250 * arg5;
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
        arg11.field248 += arg11.field249 * arg5;
        arg11.field242 += arg11.field250 * arg5;
        arg11.field240 = arg6;
        arg11.field243 = arg4;
        return arg5;
    }

    @ObfuscatedName("al.by(II[B[IIIIIIIIIILal;II)I")
    public static int method564(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class30 arg13, int arg14, int arg15) {
        arg13.field240 -= arg13.field244 * arg5;
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
        arg13.field240 += arg13.field244 * var27;
        arg13.field248 = arg6;
        arg13.field242 = arg7;
        arg13.field243 = arg4;
        return var27;
    }

    @ObfuscatedName("al.bv(II[B[IIIIIIIILal;II)I")
    public static int method565(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class30 arg11, int arg12, int arg13) {
        arg11.field248 -= arg11.field249 * arg5;
        arg11.field242 -= arg11.field250 * arg5;
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
        arg11.field248 += arg11.field249 * arg5;
        arg11.field242 += arg11.field250 * arg5;
        arg11.field240 = arg6;
        arg11.field243 = arg4;
        return arg5;
    }

    @ObfuscatedName("al.bf(II[B[IIIIIIIIIILal;II)I")
    public static int method528(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class30 arg13, int arg14, int arg15) {
        arg13.field240 -= arg13.field244 * arg5;
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
        arg13.field240 += arg13.field244 * var26;
        arg13.field248 = arg6;
        arg13.field242 = arg7;
        arg13.field243 = arg4;
        return var26;
    }
}
