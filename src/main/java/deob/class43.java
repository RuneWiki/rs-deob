package deob;

@ObfuscatedName("au")
public class class43 extends class44 {

    @ObfuscatedName("au.v")
    public int field330;

    @ObfuscatedName("au.c")
    public int field329;

    @ObfuscatedName("au.i")
    public int field336;

    @ObfuscatedName("au.f")
    public int field331;

    @ObfuscatedName("au.b")
    public int field332;

    @ObfuscatedName("au.n")
    public int field337;

    @ObfuscatedName("au.s")
    public int field334;

    @ObfuscatedName("au.l")
    public int field335;

    @ObfuscatedName("au.q")
    public int field333;

    @ObfuscatedName("au.o")
    public int field342;

    @ObfuscatedName("au.r")
    public boolean field338;

    @ObfuscatedName("au.p")
    public int field339;

    @ObfuscatedName("au.k")
    public int field340;

    @ObfuscatedName("au.d")
    public int field341;

    @ObfuscatedName("au.m")
    public int field328;

    @ObfuscatedName("au.v(II)I")
    public static int method915(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("au.c(II)I")
    public static int method801(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("au.ag()I")
    public int method763() {
        int var1 = this.field332 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field335 == 0) {
            var2 -= this.field330 * var2 / (((class36) this.field345).field256.length << 8);
        } else if (this.field335 >= 0) {
            var2 -= this.field333 * var2 / ((class36) this.field345).field256.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    public class43(class36 arg0, int arg1, int arg2) {
        this.field345 = arg0;
        this.field333 = arg0.field254;
        this.field342 = arg0.field252;
        this.field338 = arg0.field255;
        this.field329 = arg1;
        this.field336 = arg2;
        this.field331 = 8192;
        this.field330 = 0;
        this.method785();
    }

    public class43(class36 arg0, int arg1, int arg2, int arg3) {
        this.field345 = arg0;
        this.field333 = arg0.field254;
        this.field342 = arg0.field252;
        this.field338 = arg0.field255;
        this.field329 = arg1;
        this.field336 = arg2;
        this.field331 = arg3;
        this.field330 = 0;
        this.method785();
    }

    @ObfuscatedName("au.i(Lat;II)Lau;")
    public static class43 method855(class36 arg0, int arg1, int arg2) {
        return arg0.field256 == null || arg0.field256.length == 0 ? null : new class43(arg0, (int) ((long) arg0.field253 * 256L * (long) arg1 / (long) (Statics.field269 * 100)), arg2 << 6);
    }

    @ObfuscatedName("au.f(Lat;III)Lau;")
    public static class43 method765(class36 arg0, int arg1, int arg2, int arg3) {
        return arg0.field256 == null || arg0.field256.length == 0 ? null : new class43(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("au.b()V")
    public void method785() {
        this.field332 = this.field336;
        this.field337 = method915(this.field336, this.field331);
        this.field334 = method801(this.field336, this.field331);
    }

    @ObfuscatedName("au.o(I)V")
    public synchronized void method848(int arg0) {
        this.field335 = arg0;
    }

    @ObfuscatedName("au.p(I)V")
    public synchronized void method889(int arg0) {
        this.method881(arg0 << 6, this.method771());
    }

    @ObfuscatedName("au.w(I)V")
    public synchronized void method902(int arg0) {
        this.method881(arg0, this.method771());
    }

    @ObfuscatedName("au.k(II)V")
    public synchronized void method881(int arg0, int arg1) {
        this.field336 = arg0;
        this.field331 = arg1;
        this.field339 = 0;
        this.method785();
    }

    @ObfuscatedName("au.d()I")
    public synchronized int method770() {
        return this.field336 == Integer.MIN_VALUE ? 0 : this.field336;
    }

    @ObfuscatedName("au.m()I")
    public synchronized int method771() {
        return this.field331 < 0 ? -1 : this.field331;
    }

    @ObfuscatedName("au.u(I)V")
    public synchronized void method772(int arg0) {
        int var2 = ((class36) this.field345).field256.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field330 = arg0;
    }

    @ObfuscatedName("au.t(Z)V")
    public synchronized void method773(boolean arg0) {
        this.field329 = (this.field329 >>> 31) + (this.field329 ^ this.field329 >> 31);
        if (arg0) {
            this.field329 = -this.field329;
        }
    }

    @ObfuscatedName("au.g()V")
    public void method774() {
        if (this.field339 == 0) {
            return;
        }
        if (this.field336 == Integer.MIN_VALUE) {
            this.field336 = 0;
        }
        this.field339 = 0;
        this.method785();
    }

    @ObfuscatedName("au.x(II)V")
    public synchronized void method775(int arg0, int arg1) {
        this.method840(arg0, arg1, this.method771());
    }

    @ObfuscatedName("au.a(III)V")
    public synchronized void method840(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method881(arg1, arg2);
            return;
        }
        int var4 = method915(arg1, arg2);
        int var5 = method801(arg1, arg2);
        if (this.field337 == var4 && this.field334 == var5) {
            this.field339 = 0;
            return;
        }
        int var6 = arg1 - this.field332;
        if (this.field332 - arg1 > var6) {
            var6 = this.field332 - arg1;
        }
        if (var4 - this.field337 > var6) {
            var6 = var4 - this.field337;
        }
        if (this.field337 - var4 > var6) {
            var6 = this.field337 - var4;
        }
        if (var5 - this.field334 > var6) {
            var6 = var5 - this.field334;
        }
        if (this.field334 - var5 > var6) {
            var6 = this.field334 - var5;
        }
        if (arg0 > var6) {
            arg0 = var6;
        }
        this.field339 = arg0;
        this.field336 = arg1;
        this.field331 = arg2;
        this.field340 = (arg1 - this.field332) / arg0;
        this.field341 = (var4 - this.field337) / arg0;
        this.field328 = (var5 - this.field334) / arg0;
    }

    @ObfuscatedName("au.y(I)V")
    public synchronized void method842(int arg0) {
        if (arg0 == 0) {
            this.method902(0);
            this.method6503();
        } else if (this.field337 == 0 && this.field334 == 0) {
            this.field339 = 0;
            this.field336 = 0;
            this.field332 = 0;
            this.method6503();
        } else {
            int var2 = -this.field332;
            if (this.field332 > var2) {
                var2 = this.field332;
            }
            if (-this.field337 > var2) {
                var2 = -this.field337;
            }
            if (this.field337 > var2) {
                var2 = this.field337;
            }
            if (-this.field334 > var2) {
                var2 = -this.field334;
            }
            if (this.field334 > var2) {
                var2 = this.field334;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field339 = arg0;
            this.field336 = Integer.MIN_VALUE;
            this.field340 = -this.field332 / arg0;
            this.field341 = -this.field337 / arg0;
            this.field328 = -this.field334 / arg0;
        }
    }

    @ObfuscatedName("au.j(I)V")
    public synchronized void method856(int arg0) {
        if (this.field329 < 0) {
            this.field329 = -arg0;
        } else {
            this.field329 = arg0;
        }
    }

    @ObfuscatedName("au.aj()I")
    public synchronized int method827() {
        return this.field329 < 0 ? -this.field329 : this.field329;
    }

    @ObfuscatedName("au.al()Z")
    public boolean method799() {
        return this.field330 < 0 || this.field330 >= ((class36) this.field345).field256.length << 8;
    }

    @ObfuscatedName("au.at()Z")
    public boolean method780() {
        return this.field339 != 0;
    }

    @ObfuscatedName("au.n()Laf;")
    public class44 method615() {
        return null;
    }

    @ObfuscatedName("au.s()Laf;")
    public class44 method616() {
        return null;
    }

    @ObfuscatedName("au.l()I")
    public int method617() {
        return this.field336 == 0 && this.field339 == 0 ? 0 : 1;
    }

    @ObfuscatedName("au.q([III)V")
    public synchronized void method618(int[] arg0, int arg1, int arg2) {
        if (this.field336 == 0 && this.field339 == 0) {
            this.method620(arg2);
            return;
        }
        class36 var4 = (class36) this.field345;
        int var5 = this.field333 << 8;
        int var6 = this.field342 << 8;
        int var7 = var4.field256.length << 8;
        int var8 = var6 - var5;
        if (var8 <= 0) {
            this.field335 = 0;
        }
        int var9 = arg1;
        int var10 = arg1 + arg2;
        if (this.field330 < 0) {
            if (this.field329 <= 0) {
                this.method774();
                this.method6503();
                return;
            }
            this.field330 = 0;
        }
        if (this.field330 >= var7) {
            if (this.field329 >= 0) {
                this.method774();
                this.method6503();
                return;
            }
            this.field330 = var7 - 1;
        }
        if (this.field335 >= 0) {
            if (this.field335 > 0) {
                if (this.field338) {
                    label131: {
                        if (this.field329 < 0) {
                            var9 = this.method907(arg0, arg1, var5, var10, var4.field256[this.field333]);
                            if (this.field330 >= var5) {
                                return;
                            }
                            this.field330 = var5 + var5 - 1 - this.field330;
                            this.field329 = -this.field329;
                            if (--this.field335 == 0) {
                                break label131;
                            }
                        }
                        do {
                            var9 = this.method783(arg0, var9, var6, var10, var4.field256[this.field342 - 1]);
                            if (this.field330 < var6) {
                                return;
                            }
                            this.field330 = var6 + var6 - 1 - this.field330;
                            this.field329 = -this.field329;
                            if (--this.field335 == 0) {
                                break;
                            }
                            var9 = this.method907(arg0, var9, var5, var10, var4.field256[this.field333]);
                            if (this.field330 >= var5) {
                                return;
                            }
                            this.field330 = var5 + var5 - 1 - this.field330;
                            this.field329 = -this.field329;
                        } while (--this.field335 != 0);
                    }
                } else if (this.field329 < 0) {
                    while (true) {
                        var9 = this.method907(arg0, var9, var5, var10, var4.field256[this.field342 - 1]);
                        if (this.field330 >= var5) {
                            return;
                        }
                        int var12 = (var6 - 1 - this.field330) / var8;
                        if (var12 >= this.field335) {
                            this.field330 += this.field335 * var8;
                            this.field335 = 0;
                            break;
                        }
                        this.field330 += var8 * var12;
                        this.field335 -= var12;
                    }
                } else {
                    while (true) {
                        var9 = this.method783(arg0, var9, var6, var10, var4.field256[this.field333]);
                        if (this.field330 < var6) {
                            return;
                        }
                        int var13 = (this.field330 - var5) / var8;
                        if (var13 >= this.field335) {
                            this.field330 -= this.field335 * var8;
                            this.field335 = 0;
                            break;
                        }
                        this.field330 -= var8 * var13;
                        this.field335 -= var13;
                    }
                }
            }
            if (this.field329 < 0) {
                this.method907(arg0, var9, 0, var10, 0);
                if (this.field330 < 0) {
                    this.field330 = -1;
                    this.method774();
                    this.method6503();
                }
            } else {
                this.method783(arg0, var9, var7, var10, 0);
                if (this.field330 >= var7) {
                    this.field330 = var7;
                    this.method774();
                    this.method6503();
                }
            }
        } else if (this.field338) {
            if (this.field329 < 0) {
                var9 = this.method907(arg0, arg1, var5, var10, var4.field256[this.field333]);
                if (this.field330 >= var5) {
                    return;
                }
                this.field330 = var5 + var5 - 1 - this.field330;
                this.field329 = -this.field329;
            }
            while (true) {
                int var11 = this.method783(arg0, var9, var6, var10, var4.field256[this.field342 - 1]);
                if (this.field330 < var6) {
                    return;
                }
                this.field330 = var6 + var6 - 1 - this.field330;
                this.field329 = -this.field329;
                var9 = this.method907(arg0, var11, var5, var10, var4.field256[this.field333]);
                if (this.field330 >= var5) {
                    return;
                }
                this.field330 = var5 + var5 - 1 - this.field330;
                this.field329 = -this.field329;
            }
        } else if (this.field329 < 0) {
            while (true) {
                var9 = this.method907(arg0, var9, var5, var10, var4.field256[this.field342 - 1]);
                if (this.field330 >= var5) {
                    return;
                }
                this.field330 = var6 - 1 - (var6 - 1 - this.field330) % var8;
            }
        } else {
            while (true) {
                var9 = this.method783(arg0, var9, var6, var10, var4.field256[this.field333]);
                if (this.field330 < var6) {
                    return;
                }
                this.field330 = (this.field330 - var5) % var8 + var5;
            }
        }
    }

    @ObfuscatedName("au.r(I)V")
    public synchronized void method620(int arg0) {
        if (this.field339 > 0) {
            if (arg0 >= this.field339) {
                if (this.field336 == Integer.MIN_VALUE) {
                    this.field336 = 0;
                    this.field334 = 0;
                    this.field337 = 0;
                    this.field332 = 0;
                    this.method6503();
                    arg0 = this.field339;
                }
                this.field339 = 0;
                this.method785();
            } else {
                this.field332 += this.field340 * arg0;
                this.field337 += this.field341 * arg0;
                this.field334 += this.field328 * arg0;
                this.field339 -= arg0;
            }
        }
        class36 var2 = (class36) this.field345;
        int var3 = this.field333 << 8;
        int var4 = this.field342 << 8;
        int var5 = var2.field256.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field335 = 0;
        }
        if (this.field330 < 0) {
            if (this.field329 <= 0) {
                this.method774();
                this.method6503();
                return;
            }
            this.field330 = 0;
        }
        if (this.field330 >= var5) {
            if (this.field329 >= 0) {
                this.method774();
                this.method6503();
                return;
            }
            this.field330 = var5 - 1;
        }
        this.field330 += this.field329 * arg0;
        if (this.field335 >= 0) {
            if (this.field335 > 0) {
                if (this.field338) {
                    label121: {
                        if (this.field329 < 0) {
                            if (this.field330 >= var3) {
                                return;
                            }
                            this.field330 = var3 + var3 - 1 - this.field330;
                            this.field329 = -this.field329;
                            if (--this.field335 == 0) {
                                break label121;
                            }
                        }
                        do {
                            if (this.field330 < var4) {
                                return;
                            }
                            this.field330 = var4 + var4 - 1 - this.field330;
                            this.field329 = -this.field329;
                            if (--this.field335 == 0) {
                                break;
                            }
                            if (this.field330 >= var3) {
                                return;
                            }
                            this.field330 = var3 + var3 - 1 - this.field330;
                            this.field329 = -this.field329;
                        } while (--this.field335 != 0);
                    }
                } else {
                    label153: {
                        if (this.field329 < 0) {
                            if (this.field330 >= var3) {
                                return;
                            }
                            int var7 = (var4 - 1 - this.field330) / var6;
                            if (var7 >= this.field335) {
                                this.field330 += this.field335 * var6;
                                this.field335 = 0;
                                break label153;
                            }
                            this.field330 += var6 * var7;
                            this.field335 -= var7;
                        } else if (this.field330 >= var4) {
                            int var8 = (this.field330 - var3) / var6;
                            if (var8 >= this.field335) {
                                this.field330 -= this.field335 * var6;
                                this.field335 = 0;
                                break label153;
                            }
                            this.field330 -= var6 * var8;
                            this.field335 -= var8;
                        } else {
                            return;
                        }
                        return;
                    }
                }
            }
            if (this.field329 < 0) {
                if (this.field330 < 0) {
                    this.field330 = -1;
                    this.method774();
                    this.method6503();
                }
            } else if (this.field330 >= var5) {
                this.field330 = var5;
                this.method774();
                this.method6503();
            }
        } else if (this.field338) {
            if (this.field329 < 0) {
                if (this.field330 >= var3) {
                    return;
                }
                this.field330 = var3 + var3 - 1 - this.field330;
                this.field329 = -this.field329;
            }
            while (this.field330 >= var4) {
                this.field330 = var4 + var4 - 1 - this.field330;
                this.field329 = -this.field329;
                if (this.field330 >= var3) {
                    return;
                }
                this.field330 = var3 + var3 - 1 - this.field330;
                this.field329 = -this.field329;
            }
        } else if (this.field329 < 0) {
            if (this.field330 >= var3) {
                return;
            }
            this.field330 = var4 - 1 - (var4 - 1 - this.field330) % var6;
        } else if (this.field330 >= var4) {
            this.field330 = (this.field330 - var3) % var6 + var3;
        } else {
            return;
        }
    }

    @ObfuscatedName("au.an([IIIII)I")
    public int method783(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field339 > 0) {
                int var6 = this.field339 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field339 += arg1;
                if (this.field329 == 256 && (this.field330 & 0xFF) == 0) {
                    if (Statics.field271) {
                        arg1 = method795(0, ((class36) this.field345).field256, arg0, this.field330, arg1, this.field337, this.field334, this.field341, this.field328, 0, var6, arg2, this);
                    } else {
                        arg1 = method835(((class36) this.field345).field256, arg0, this.field330, arg1, this.field332, this.field340, 0, var6, arg2, this);
                    }
                } else if (Statics.field271) {
                    arg1 = method911(0, 0, ((class36) this.field345).field256, arg0, this.field330, arg1, this.field337, this.field334, this.field341, this.field328, 0, var6, arg2, this, this.field329, arg4);
                } else {
                    arg1 = method800(0, 0, ((class36) this.field345).field256, arg0, this.field330, arg1, this.field332, this.field340, 0, var6, arg2, this, this.field329, arg4);
                }
                this.field339 -= arg1;
                if (this.field339 != 0) {
                    return arg1;
                }
                if (!this.method916()) {
                    continue;
                }
                return arg3;
            }
            if (this.field329 == 256 && (this.field330 & 0xFF) == 0) {
                if (Statics.field271) {
                    return method787(0, ((class36) this.field345).field256, arg0, this.field330, arg1, this.field337, this.field334, 0, arg3, arg2, this);
                }
                return method786(((class36) this.field345).field256, arg0, this.field330, arg1, this.field332, 0, arg3, arg2, this);
            }
            if (Statics.field271) {
                return method791(0, 0, ((class36) this.field345).field256, arg0, this.field330, arg1, this.field337, this.field334, 0, arg3, arg2, this, this.field329, arg4);
            }
            return method849(0, 0, ((class36) this.field345).field256, arg0, this.field330, arg1, this.field332, 0, arg3, arg2, this, this.field329, arg4);
        }
    }

    @ObfuscatedName("au.ay([IIIII)I")
    public int method907(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field339 > 0) {
                int var6 = this.field339 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field339 += arg1;
                if (this.field329 == -256 && (this.field330 & 0xFF) == 0) {
                    if (Statics.field271) {
                        arg1 = method797(0, ((class36) this.field345).field256, arg0, this.field330, arg1, this.field337, this.field334, this.field341, this.field328, 0, var6, arg2, this);
                    } else {
                        arg1 = method796(((class36) this.field345).field256, arg0, this.field330, arg1, this.field332, this.field340, 0, var6, arg2, this);
                    }
                } else if (Statics.field271) {
                    arg1 = method819(0, 0, ((class36) this.field345).field256, arg0, this.field330, arg1, this.field337, this.field334, this.field341, this.field328, 0, var6, arg2, this, this.field329, arg4);
                } else {
                    arg1 = method879(0, 0, ((class36) this.field345).field256, arg0, this.field330, arg1, this.field332, this.field340, 0, var6, arg2, this, this.field329, arg4);
                }
                this.field339 -= arg1;
                if (this.field339 != 0) {
                    return arg1;
                }
                if (!this.method916()) {
                    continue;
                }
                return arg3;
            }
            if (this.field329 == -256 && (this.field330 & 0xFF) == 0) {
                if (Statics.field271) {
                    return method789(0, ((class36) this.field345).field256, arg0, this.field330, arg1, this.field337, this.field334, 0, arg3, arg2, this);
                }
                return method788(((class36) this.field345).field256, arg0, this.field330, arg1, this.field332, 0, arg3, arg2, this);
            }
            if (Statics.field271) {
                return method793(0, 0, ((class36) this.field345).field256, arg0, this.field330, arg1, this.field337, this.field334, 0, arg3, arg2, this, this.field329, arg4);
            }
            return method792(0, 0, ((class36) this.field345).field256, arg0, this.field330, arg1, this.field332, 0, arg3, arg2, this, this.field329, arg4);
        }
    }

    @ObfuscatedName("au.ah()Z")
    public boolean method916() {
        int var1 = this.field336;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method915(var1, this.field331);
            var2 = method801(var1, this.field331);
        }
        if (this.field332 != var1 || this.field337 != var3 || this.field334 != var2) {
            if (this.field332 < var1) {
                this.field340 = 1;
                this.field339 = var1 - this.field332;
            } else if (this.field332 > var1) {
                this.field340 = -1;
                this.field339 = this.field332 - var1;
            } else {
                this.field340 = 0;
            }
            if (this.field337 < var3) {
                this.field341 = 1;
                if (this.field339 == 0 || this.field339 > var3 - this.field337) {
                    this.field339 = var3 - this.field337;
                }
            } else if (this.field337 > var3) {
                this.field341 = -1;
                if (this.field339 == 0 || this.field339 > this.field337 - var3) {
                    this.field339 = this.field337 - var3;
                }
            } else {
                this.field341 = 0;
            }
            if (this.field334 < var2) {
                this.field328 = 1;
                if (this.field339 == 0 || this.field339 > var2 - this.field334) {
                    this.field339 = var2 - this.field334;
                }
            } else if (this.field334 > var2) {
                this.field328 = -1;
                if (this.field339 == 0 || this.field339 > this.field334 - var2) {
                    this.field339 = this.field334 - var2;
                }
            } else {
                this.field328 = 0;
            }
            return false;
        } else if (this.field336 == Integer.MIN_VALUE) {
            this.field336 = 0;
            this.field334 = 0;
            this.field337 = 0;
            this.field332 = 0;
            this.method6503();
            return true;
        } else {
            this.method785();
            return false;
        }
    }

    @ObfuscatedName("au.ac([B[IIIIIIILau;)I")
    public static int method786(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class43 arg8) {
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
        arg8.field330 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("au.ab(I[B[IIIIIIIILau;)I")
    public static int method787(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class43 arg10) {
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
        arg10.field330 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("au.au([B[IIIIIIILau;)I")
    public static int method788(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class43 arg8) {
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
        arg8.field330 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("au.af(I[B[IIIIIIIILau;)I")
    public static int method789(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class43 arg10) {
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
        arg10.field330 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("au.ad(II[B[IIIIIIILau;II)I")
    public static int method849(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class43 arg10, int arg11, int arg12) {
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
        arg10.field330 = arg4;
        return arg5;
    }

    @ObfuscatedName("au.ai(II[B[IIIIIIIILau;II)I")
    public static int method791(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class43 arg11, int arg12, int arg13) {
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
        arg11.field330 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("au.ax(II[B[IIIIIIILau;II)I")
    public static int method792(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class43 arg10, int arg11, int arg12) {
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
        arg10.field330 = arg4;
        return arg5;
    }

    @ObfuscatedName("au.ar(II[B[IIIIIIIILau;II)I")
    public static int method793(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class43 arg11, int arg12, int arg13) {
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
        arg11.field330 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("au.ap([B[IIIIIIIILau;)I")
    public static int method835(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class43 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field337 += (var14 - arg3) * arg9.field341;
        arg9.field334 += (var14 - arg3) * arg9.field328;
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
        arg9.field332 = var12 >> 2;
        arg9.field330 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("au.az(I[B[IIIIIIIIIILau;)I")
    public static int method795(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class43 arg12) {
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
        arg12.field332 += (var19 - arg4) * arg12.field340;
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
        arg12.field337 = var15 >> 2;
        arg12.field334 = var16 >> 2;
        arg12.field330 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("au.as([B[IIIIIIIILau;)I")
    public static int method796(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class43 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field337 += (var14 - arg3) * arg9.field341;
        arg9.field334 += (var14 - arg3) * arg9.field328;
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
        arg9.field332 = var12 >> 2;
        arg9.field330 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("au.aa(I[B[IIIIIIIIIILau;)I")
    public static int method797(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class43 arg12) {
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
        arg12.field332 += (var19 - arg4) * arg12.field340;
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
        arg12.field337 = var15 >> 2;
        arg12.field334 = var16 >> 2;
        arg12.field330 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("au.bj(II[B[IIIIIIIILau;II)I")
    public static int method800(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class43 arg11, int arg12, int arg13) {
        arg11.field337 -= arg11.field341 * arg5;
        arg11.field334 -= arg11.field328 * arg5;
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
        arg11.field337 += arg11.field341 * arg5;
        arg11.field334 += arg11.field328 * arg5;
        arg11.field332 = arg6;
        arg11.field330 = arg4;
        return arg5;
    }

    @ObfuscatedName("au.bm(II[B[IIIIIIIIIILau;II)I")
    public static int method911(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class43 arg13, int arg14, int arg15) {
        arg13.field332 -= arg13.field340 * arg5;
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
        arg13.field332 += arg13.field340 * var27;
        arg13.field337 = arg6;
        arg13.field334 = arg7;
        arg13.field330 = arg4;
        return var27;
    }

    @ObfuscatedName("au.br(II[B[IIIIIIIILau;II)I")
    public static int method879(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class43 arg11, int arg12, int arg13) {
        arg11.field337 -= arg11.field341 * arg5;
        arg11.field334 -= arg11.field328 * arg5;
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
        arg11.field337 += arg11.field341 * arg5;
        arg11.field334 += arg11.field328 * arg5;
        arg11.field332 = arg6;
        arg11.field330 = arg4;
        return arg5;
    }

    @ObfuscatedName("au.bo(II[B[IIIIIIIIIILau;II)I")
    public static int method819(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class43 arg13, int arg14, int arg15) {
        arg13.field332 -= arg13.field340 * arg5;
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
        arg13.field332 += arg13.field340 * var26;
        arg13.field337 = arg6;
        arg13.field334 = arg7;
        arg13.field330 = arg4;
        return var26;
    }
}
