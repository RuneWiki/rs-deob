package deob;

@ObfuscatedName("ai")
public class class45 extends class46 {

    @ObfuscatedName("ai.c")
    public int field332;

    @ObfuscatedName("ai.v")
    public int field333;

    @ObfuscatedName("ai.q")
    public int field344;

    @ObfuscatedName("ai.f")
    public int field335;

    @ObfuscatedName("ai.j")
    public int field336;

    @ObfuscatedName("ai.e")
    public int field337;

    @ObfuscatedName("ai.g")
    public int field338;

    @ObfuscatedName("ai.y")
    public int field339;

    @ObfuscatedName("ai.i")
    public int field340;

    @ObfuscatedName("ai.s")
    public int field341;

    @ObfuscatedName("ai.t")
    public boolean field334;

    @ObfuscatedName("ai.z")
    public int field343;

    @ObfuscatedName("ai.r")
    public int field345;

    @ObfuscatedName("ai.u")
    public int field346;

    @ObfuscatedName("ai.k")
    public int field342;

    @ObfuscatedName("ai.c(II)I")
    public static int method802(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("ai.v(II)I")
    public static int method744(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("ai.at()I")
    public int method745() {
        int var1 = this.field336 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field339 == 0) {
            var2 -= this.field332 * var2 / (((class38) this.field348).field259.length << 8);
        } else if (this.field339 >= 0) {
            var2 -= this.field340 * var2 / ((class38) this.field348).field259.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    public class45(class38 arg0, int arg1, int arg2) {
        this.field348 = arg0;
        this.field340 = arg0.field260;
        this.field341 = arg0.field261;
        this.field334 = arg0.field262;
        this.field333 = arg1;
        this.field344 = arg2;
        this.field335 = 8192;
        this.field332 = 0;
        this.method749();
    }

    public class45(class38 arg0, int arg1, int arg2, int arg3) {
        this.field348 = arg0;
        this.field340 = arg0.field260;
        this.field341 = arg0.field261;
        this.field334 = arg0.field262;
        this.field333 = arg1;
        this.field344 = arg2;
        this.field335 = arg3;
        this.field332 = 0;
        this.method749();
    }

    @ObfuscatedName("ai.q(Laf;II)Lai;")
    public static class45 method747(class38 arg0, int arg1, int arg2) {
        return arg0.field259 == null || arg0.field259.length == 0 ? null : new class45(arg0, (int) ((long) arg0.field258 * 256L * (long) arg1 / (long) (Statics.field288 * 100)), arg2 << 6);
    }

    @ObfuscatedName("ai.f(Laf;III)Lai;")
    public static class45 method748(class38 arg0, int arg1, int arg2, int arg3) {
        return arg0.field259 == null || arg0.field259.length == 0 ? null : new class45(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("ai.j()V")
    public void method749() {
        this.field336 = this.field344;
        this.field337 = method802(this.field344, this.field335);
        this.field338 = method744(this.field344, this.field335);
    }

    @ObfuscatedName("ai.i(I)V")
    public synchronized void method785(int arg0) {
        this.field339 = arg0;
    }

    @ObfuscatedName("ai.t(I)V")
    public synchronized void method763(int arg0) {
        this.method764(arg0 << 6, this.method755());
    }

    @ObfuscatedName("ai.z(I)V")
    public synchronized void method752(int arg0) {
        this.method764(arg0, this.method755());
    }

    @ObfuscatedName("ai.r(II)V")
    public synchronized void method764(int arg0, int arg1) {
        this.field344 = arg0;
        this.field335 = arg1;
        this.field343 = 0;
        this.method749();
    }

    @ObfuscatedName("ai.u()I")
    public synchronized int method874() {
        return this.field344 == Integer.MIN_VALUE ? 0 : this.field344;
    }

    @ObfuscatedName("ai.k()I")
    public synchronized int method755() {
        return this.field335 < 0 ? -1 : this.field335;
    }

    @ObfuscatedName("ai.h(I)V")
    public synchronized void method759(int arg0) {
        int var2 = ((class38) this.field348).field259.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field332 = arg0;
    }

    @ObfuscatedName("ai.x(Z)V")
    public synchronized void method757(boolean arg0) {
        this.field333 = (this.field333 >>> 31) + (this.field333 ^ this.field333 >> 31);
        if (arg0) {
            this.field333 = -this.field333;
        }
    }

    @ObfuscatedName("ai.l()V")
    public void method758() {
        if (this.field343 == 0) {
            return;
        }
        if (this.field344 == Integer.MIN_VALUE) {
            this.field344 = 0;
        }
        this.field343 = 0;
        this.method749();
    }

    @ObfuscatedName("ai.a(II)V")
    public synchronized void method848(int arg0, int arg1) {
        this.method760(arg0, arg1, this.method755());
    }

    @ObfuscatedName("ai.p(III)V")
    public synchronized void method760(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method764(arg1, arg2);
            return;
        }
        int var4 = method802(arg1, arg2);
        int var5 = method744(arg1, arg2);
        if (this.field337 == var4 && this.field338 == var5) {
            this.field343 = 0;
            return;
        }
        int var6 = arg1 - this.field336;
        if (this.field336 - arg1 > var6) {
            var6 = this.field336 - arg1;
        }
        if (var4 - this.field337 > var6) {
            var6 = var4 - this.field337;
        }
        if (this.field337 - var4 > var6) {
            var6 = this.field337 - var4;
        }
        if (var5 - this.field338 > var6) {
            var6 = var5 - this.field338;
        }
        if (this.field338 - var5 > var6) {
            var6 = this.field338 - var5;
        }
        if (arg0 > var6) {
            arg0 = var6;
        }
        this.field343 = arg0;
        this.field344 = arg1;
        this.field335 = arg2;
        this.field345 = (arg1 - this.field336) / arg0;
        this.field346 = (var4 - this.field337) / arg0;
        this.field342 = (var5 - this.field338) / arg0;
    }

    @ObfuscatedName("ai.b(I)V")
    public synchronized void method770(int arg0) {
        if (arg0 == 0) {
            this.method752(0);
            this.method6497();
        } else if (this.field337 == 0 && this.field338 == 0) {
            this.field343 = 0;
            this.field344 = 0;
            this.field336 = 0;
            this.method6497();
        } else {
            int var2 = -this.field336;
            if (this.field336 > var2) {
                var2 = this.field336;
            }
            if (-this.field337 > var2) {
                var2 = -this.field337;
            }
            if (this.field337 > var2) {
                var2 = this.field337;
            }
            if (-this.field338 > var2) {
                var2 = -this.field338;
            }
            if (this.field338 > var2) {
                var2 = this.field338;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field343 = arg0;
            this.field344 = Integer.MIN_VALUE;
            this.field345 = -this.field336 / arg0;
            this.field346 = -this.field337 / arg0;
            this.field342 = -this.field338 / arg0;
        }
    }

    @ObfuscatedName("ai.n(I)V")
    public synchronized void method762(int arg0) {
        if (this.field333 < 0) {
            this.field333 = -arg0;
        } else {
            this.field333 = arg0;
        }
    }

    @ObfuscatedName("ai.ae()I")
    public synchronized int method786() {
        return this.field333 < 0 ? -this.field333 : this.field333;
    }

    @ObfuscatedName("ai.aj()Z")
    public boolean method821() {
        return this.field332 < 0 || this.field332 >= ((class38) this.field348).field259.length << 8;
    }

    @ObfuscatedName("ai.ax()Z")
    public boolean method765() {
        return this.field343 != 0;
    }

    @ObfuscatedName("ai.e()Laz;")
    public class46 method581() {
        return null;
    }

    @ObfuscatedName("ai.g()Laz;")
    public class46 method606() {
        return null;
    }

    @ObfuscatedName("ai.w()I")
    public int method583() {
        return this.field344 == 0 && this.field343 == 0 ? 0 : 1;
    }

    @ObfuscatedName("ai.y([III)V")
    public synchronized void method584(int[] arg0, int arg1, int arg2) {
        if (this.field344 == 0 && this.field343 == 0) {
            this.method586(arg2);
            return;
        }
        class38 var4 = (class38) this.field348;
        int var5 = this.field340 << 8;
        int var6 = this.field341 << 8;
        int var7 = var4.field259.length << 8;
        int var8 = var6 - var5;
        if (var8 <= 0) {
            this.field339 = 0;
        }
        int var9 = arg1;
        int var10 = arg1 + arg2;
        if (this.field332 < 0) {
            if (this.field333 <= 0) {
                this.method758();
                this.method6497();
                return;
            }
            this.field332 = 0;
        }
        if (this.field332 >= var7) {
            if (this.field333 >= 0) {
                this.method758();
                this.method6497();
                return;
            }
            this.field332 = var7 - 1;
        }
        if (this.field339 >= 0) {
            if (this.field339 > 0) {
                if (this.field334) {
                    label131: {
                        if (this.field333 < 0) {
                            var9 = this.method767(arg0, arg1, var5, var10, var4.field259[this.field340]);
                            if (this.field332 >= var5) {
                                return;
                            }
                            this.field332 = var5 + var5 - 1 - this.field332;
                            this.field333 = -this.field333;
                            if (--this.field339 == 0) {
                                break label131;
                            }
                        }
                        do {
                            var9 = this.method846(arg0, var9, var6, var10, var4.field259[this.field341 - 1]);
                            if (this.field332 < var6) {
                                return;
                            }
                            this.field332 = var6 + var6 - 1 - this.field332;
                            this.field333 = -this.field333;
                            if (--this.field339 == 0) {
                                break;
                            }
                            var9 = this.method767(arg0, var9, var5, var10, var4.field259[this.field340]);
                            if (this.field332 >= var5) {
                                return;
                            }
                            this.field332 = var5 + var5 - 1 - this.field332;
                            this.field333 = -this.field333;
                        } while (--this.field339 != 0);
                    }
                } else if (this.field333 < 0) {
                    while (true) {
                        var9 = this.method767(arg0, var9, var5, var10, var4.field259[this.field341 - 1]);
                        if (this.field332 >= var5) {
                            return;
                        }
                        int var12 = (var6 - 1 - this.field332) / var8;
                        if (var12 >= this.field339) {
                            this.field332 += this.field339 * var8;
                            this.field339 = 0;
                            break;
                        }
                        this.field332 += var8 * var12;
                        this.field339 -= var12;
                    }
                } else {
                    while (true) {
                        var9 = this.method846(arg0, var9, var6, var10, var4.field259[this.field340]);
                        if (this.field332 < var6) {
                            return;
                        }
                        int var13 = (this.field332 - var5) / var8;
                        if (var13 >= this.field339) {
                            this.field332 -= this.field339 * var8;
                            this.field339 = 0;
                            break;
                        }
                        this.field332 -= var8 * var13;
                        this.field339 -= var13;
                    }
                }
            }
            if (this.field333 < 0) {
                this.method767(arg0, var9, 0, var10, 0);
                if (this.field332 < 0) {
                    this.field332 = -1;
                    this.method758();
                    this.method6497();
                }
            } else {
                this.method846(arg0, var9, var7, var10, 0);
                if (this.field332 >= var7) {
                    this.field332 = var7;
                    this.method758();
                    this.method6497();
                }
            }
        } else if (this.field334) {
            if (this.field333 < 0) {
                var9 = this.method767(arg0, arg1, var5, var10, var4.field259[this.field340]);
                if (this.field332 >= var5) {
                    return;
                }
                this.field332 = var5 + var5 - 1 - this.field332;
                this.field333 = -this.field333;
            }
            while (true) {
                int var11 = this.method846(arg0, var9, var6, var10, var4.field259[this.field341 - 1]);
                if (this.field332 < var6) {
                    return;
                }
                this.field332 = var6 + var6 - 1 - this.field332;
                this.field333 = -this.field333;
                var9 = this.method767(arg0, var11, var5, var10, var4.field259[this.field340]);
                if (this.field332 >= var5) {
                    return;
                }
                this.field332 = var5 + var5 - 1 - this.field332;
                this.field333 = -this.field333;
            }
        } else if (this.field333 < 0) {
            while (true) {
                var9 = this.method767(arg0, var9, var5, var10, var4.field259[this.field341 - 1]);
                if (this.field332 >= var5) {
                    return;
                }
                this.field332 = var6 - 1 - (var6 - 1 - this.field332) % var8;
            }
        } else {
            while (true) {
                var9 = this.method846(arg0, var9, var6, var10, var4.field259[this.field340]);
                if (this.field332 < var6) {
                    return;
                }
                this.field332 = (this.field332 - var5) % var8 + var5;
            }
        }
    }

    @ObfuscatedName("ai.s(I)V")
    public synchronized void method586(int arg0) {
        if (this.field343 > 0) {
            if (arg0 >= this.field343) {
                if (this.field344 == Integer.MIN_VALUE) {
                    this.field344 = 0;
                    this.field338 = 0;
                    this.field337 = 0;
                    this.field336 = 0;
                    this.method6497();
                    arg0 = this.field343;
                }
                this.field343 = 0;
                this.method749();
            } else {
                this.field336 += this.field345 * arg0;
                this.field337 += this.field346 * arg0;
                this.field338 += this.field342 * arg0;
                this.field343 -= arg0;
            }
        }
        class38 var2 = (class38) this.field348;
        int var3 = this.field340 << 8;
        int var4 = this.field341 << 8;
        int var5 = var2.field259.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field339 = 0;
        }
        if (this.field332 < 0) {
            if (this.field333 <= 0) {
                this.method758();
                this.method6497();
                return;
            }
            this.field332 = 0;
        }
        if (this.field332 >= var5) {
            if (this.field333 >= 0) {
                this.method758();
                this.method6497();
                return;
            }
            this.field332 = var5 - 1;
        }
        this.field332 += this.field333 * arg0;
        if (this.field339 >= 0) {
            if (this.field339 > 0) {
                if (this.field334) {
                    label121: {
                        if (this.field333 < 0) {
                            if (this.field332 >= var3) {
                                return;
                            }
                            this.field332 = var3 + var3 - 1 - this.field332;
                            this.field333 = -this.field333;
                            if (--this.field339 == 0) {
                                break label121;
                            }
                        }
                        do {
                            if (this.field332 < var4) {
                                return;
                            }
                            this.field332 = var4 + var4 - 1 - this.field332;
                            this.field333 = -this.field333;
                            if (--this.field339 == 0) {
                                break;
                            }
                            if (this.field332 >= var3) {
                                return;
                            }
                            this.field332 = var3 + var3 - 1 - this.field332;
                            this.field333 = -this.field333;
                        } while (--this.field339 != 0);
                    }
                } else {
                    label153: {
                        if (this.field333 < 0) {
                            if (this.field332 >= var3) {
                                return;
                            }
                            int var7 = (var4 - 1 - this.field332) / var6;
                            if (var7 >= this.field339) {
                                this.field332 += this.field339 * var6;
                                this.field339 = 0;
                                break label153;
                            }
                            this.field332 += var6 * var7;
                            this.field339 -= var7;
                        } else if (this.field332 >= var4) {
                            int var8 = (this.field332 - var3) / var6;
                            if (var8 >= this.field339) {
                                this.field332 -= this.field339 * var6;
                                this.field339 = 0;
                                break label153;
                            }
                            this.field332 -= var6 * var8;
                            this.field339 -= var8;
                        } else {
                            return;
                        }
                        return;
                    }
                }
            }
            if (this.field333 < 0) {
                if (this.field332 < 0) {
                    this.field332 = -1;
                    this.method758();
                    this.method6497();
                }
            } else if (this.field332 >= var5) {
                this.field332 = var5;
                this.method758();
                this.method6497();
            }
        } else if (this.field334) {
            if (this.field333 < 0) {
                if (this.field332 >= var3) {
                    return;
                }
                this.field332 = var3 + var3 - 1 - this.field332;
                this.field333 = -this.field333;
            }
            while (this.field332 >= var4) {
                this.field332 = var4 + var4 - 1 - this.field332;
                this.field333 = -this.field333;
                if (this.field332 >= var3) {
                    return;
                }
                this.field332 = var3 + var3 - 1 - this.field332;
                this.field333 = -this.field333;
            }
        } else if (this.field333 < 0) {
            if (this.field332 >= var3) {
                return;
            }
            this.field332 = var4 - 1 - (var4 - 1 - this.field332) % var6;
        } else if (this.field332 >= var4) {
            this.field332 = (this.field332 - var3) % var6 + var3;
        } else {
            return;
        }
    }

    @ObfuscatedName("ai.ar([IIIII)I")
    public int method846(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field343 > 0) {
                int var6 = this.field343 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field343 += arg1;
                if (this.field333 == 256 && (this.field332 & 0xFF) == 0) {
                    if (Statics.field1414) {
                        arg1 = method777(0, ((class38) this.field348).field259, arg0, this.field332, arg1, this.field337, this.field338, this.field346, this.field342, 0, var6, arg2, this);
                    } else {
                        arg1 = method800(((class38) this.field348).field259, arg0, this.field332, arg1, this.field336, this.field345, 0, var6, arg2, this);
                    }
                } else if (Statics.field1414) {
                    arg1 = method781(0, 0, ((class38) this.field348).field259, arg0, this.field332, arg1, this.field337, this.field338, this.field346, this.field342, 0, var6, arg2, this, this.field333, arg4);
                } else {
                    arg1 = method780(0, 0, ((class38) this.field348).field259, arg0, this.field332, arg1, this.field336, this.field345, 0, var6, arg2, this, this.field333, arg4);
                }
                this.field343 -= arg1;
                if (this.field343 != 0) {
                    return arg1;
                }
                if (!this.method766()) {
                    continue;
                }
                return arg3;
            }
            if (this.field333 == 256 && (this.field332 & 0xFF) == 0) {
                if (Statics.field1414) {
                    return method789(0, ((class38) this.field348).field259, arg0, this.field332, arg1, this.field337, this.field338, 0, arg3, arg2, this);
                }
                return method769(((class38) this.field348).field259, arg0, this.field332, arg1, this.field336, 0, arg3, arg2, this);
            }
            if (Statics.field1414) {
                return method774(0, 0, ((class38) this.field348).field259, arg0, this.field332, arg1, this.field337, this.field338, 0, arg3, arg2, this, this.field333, arg4);
            }
            return method773(0, 0, ((class38) this.field348).field259, arg0, this.field332, arg1, this.field336, 0, arg3, arg2, this, this.field333, arg4);
        }
    }

    @ObfuscatedName("ai.ag([IIIII)I")
    public int method767(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field343 > 0) {
                int var6 = this.field343 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field343 += arg1;
                if (this.field333 == -256 && (this.field332 & 0xFF) == 0) {
                    if (Statics.field1414) {
                        arg1 = method792(0, ((class38) this.field348).field259, arg0, this.field332, arg1, this.field337, this.field338, this.field346, this.field342, 0, var6, arg2, this);
                    } else {
                        arg1 = method778(((class38) this.field348).field259, arg0, this.field332, arg1, this.field336, this.field345, 0, var6, arg2, this);
                    }
                } else if (Statics.field1414) {
                    arg1 = method783(0, 0, ((class38) this.field348).field259, arg0, this.field332, arg1, this.field337, this.field338, this.field346, this.field342, 0, var6, arg2, this, this.field333, arg4);
                } else {
                    arg1 = method787(0, 0, ((class38) this.field348).field259, arg0, this.field332, arg1, this.field336, this.field345, 0, var6, arg2, this, this.field333, arg4);
                }
                this.field343 -= arg1;
                if (this.field343 != 0) {
                    return arg1;
                }
                if (!this.method766()) {
                    continue;
                }
                return arg3;
            }
            if (this.field333 == -256 && (this.field332 & 0xFF) == 0) {
                if (Statics.field1414) {
                    return method863(0, ((class38) this.field348).field259, arg0, this.field332, arg1, this.field337, this.field338, 0, arg3, arg2, this);
                }
                return method877(((class38) this.field348).field259, arg0, this.field332, arg1, this.field336, 0, arg3, arg2, this);
            }
            if (Statics.field1414) {
                return method776(0, 0, ((class38) this.field348).field259, arg0, this.field332, arg1, this.field337, this.field338, 0, arg3, arg2, this, this.field333, arg4);
            }
            return method775(0, 0, ((class38) this.field348).field259, arg0, this.field332, arg1, this.field336, 0, arg3, arg2, this, this.field333, arg4);
        }
    }

    @ObfuscatedName("ai.aq()Z")
    public boolean method766() {
        int var1 = this.field344;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method802(var1, this.field335);
            var2 = method744(var1, this.field335);
        }
        if (this.field336 != var1 || this.field337 != var3 || this.field338 != var2) {
            if (this.field336 < var1) {
                this.field345 = 1;
                this.field343 = var1 - this.field336;
            } else if (this.field336 > var1) {
                this.field345 = -1;
                this.field343 = this.field336 - var1;
            } else {
                this.field345 = 0;
            }
            if (this.field337 < var3) {
                this.field346 = 1;
                if (this.field343 == 0 || this.field343 > var3 - this.field337) {
                    this.field343 = var3 - this.field337;
                }
            } else if (this.field337 > var3) {
                this.field346 = -1;
                if (this.field343 == 0 || this.field343 > this.field337 - var3) {
                    this.field343 = this.field337 - var3;
                }
            } else {
                this.field346 = 0;
            }
            if (this.field338 < var2) {
                this.field342 = 1;
                if (this.field343 == 0 || this.field343 > var2 - this.field338) {
                    this.field343 = var2 - this.field338;
                }
            } else if (this.field338 > var2) {
                this.field342 = -1;
                if (this.field343 == 0 || this.field343 > this.field338 - var2) {
                    this.field343 = this.field338 - var2;
                }
            } else {
                this.field342 = 0;
            }
            return false;
        } else if (this.field344 == Integer.MIN_VALUE) {
            this.field344 = 0;
            this.field338 = 0;
            this.field337 = 0;
            this.field336 = 0;
            this.method6497();
            return true;
        } else {
            this.method749();
            return false;
        }
    }

    @ObfuscatedName("ai.ah([B[IIIIIIILai;)I")
    public static int method769(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class45 arg8) {
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
        arg8.field332 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("ai.ai(I[B[IIIIIIIILai;)I")
    public static int method789(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class45 arg10) {
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
        arg10.field332 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("ai.az([B[IIIIIIILai;)I")
    public static int method877(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class45 arg8) {
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
        arg8.field332 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("ai.av(I[B[IIIIIIIILai;)I")
    public static int method863(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class45 arg10) {
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
        arg10.field332 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("ai.aw(II[B[IIIIIIILai;II)I")
    public static int method773(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class45 arg10, int arg11, int arg12) {
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
        arg10.field332 = arg4;
        return arg5;
    }

    @ObfuscatedName("ai.au(II[B[IIIIIIIILai;II)I")
    public static int method774(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class45 arg11, int arg12, int arg13) {
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
        arg11.field332 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("ai.ay(II[B[IIIIIIILai;II)I")
    public static int method775(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class45 arg10, int arg11, int arg12) {
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
        arg10.field332 = arg4;
        return arg5;
    }

    @ObfuscatedName("ai.as(II[B[IIIIIIIILai;II)I")
    public static int method776(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class45 arg11, int arg12, int arg13) {
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
        arg11.field332 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("ai.be([B[IIIIIIIILai;)I")
    public static int method800(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class45 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field337 += (var14 - arg3) * arg9.field346;
        arg9.field338 += (var14 - arg3) * arg9.field342;
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
        arg9.field336 = var12 >> 2;
        arg9.field332 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("ai.bz(I[B[IIIIIIIIIILai;)I")
    public static int method777(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class45 arg12) {
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
        arg12.field336 += (var19 - arg4) * arg12.field345;
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
        arg12.field338 = var16 >> 2;
        arg12.field332 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("ai.bp([B[IIIIIIIILai;)I")
    public static int method778(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class45 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field337 += (var14 - arg3) * arg9.field346;
        arg9.field338 += (var14 - arg3) * arg9.field342;
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
        arg9.field336 = var12 >> 2;
        arg9.field332 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("ai.bf(I[B[IIIIIIIIIILai;)I")
    public static int method792(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class45 arg12) {
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
        arg12.field336 += (var19 - arg4) * arg12.field345;
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
        arg12.field338 = var16 >> 2;
        arg12.field332 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("ai.bg(II[B[IIIIIIIILai;II)I")
    public static int method780(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class45 arg11, int arg12, int arg13) {
        arg11.field337 -= arg11.field346 * arg5;
        arg11.field338 -= arg11.field342 * arg5;
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
        arg11.field337 += arg11.field346 * arg5;
        arg11.field338 += arg11.field342 * arg5;
        arg11.field336 = arg6;
        arg11.field332 = arg4;
        return arg5;
    }

    @ObfuscatedName("ai.br(II[B[IIIIIIIIIILai;II)I")
    public static int method781(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class45 arg13, int arg14, int arg15) {
        arg13.field336 -= arg13.field345 * arg5;
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
        arg13.field336 += arg13.field345 * var27;
        arg13.field337 = arg6;
        arg13.field338 = arg7;
        arg13.field332 = arg4;
        return var27;
    }

    @ObfuscatedName("ai.bn(II[B[IIIIIIIILai;II)I")
    public static int method787(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class45 arg11, int arg12, int arg13) {
        arg11.field337 -= arg11.field346 * arg5;
        arg11.field338 -= arg11.field342 * arg5;
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
        arg11.field337 += arg11.field346 * arg5;
        arg11.field338 += arg11.field342 * arg5;
        arg11.field336 = arg6;
        arg11.field332 = arg4;
        return arg5;
    }

    @ObfuscatedName("ai.bq(II[B[IIIIIIIIIILai;II)I")
    public static int method783(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class45 arg13, int arg14, int arg15) {
        arg13.field336 -= arg13.field345 * arg5;
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
        arg13.field336 += arg13.field345 * var26;
        arg13.field337 = arg6;
        arg13.field338 = arg7;
        arg13.field332 = arg4;
        return var26;
    }
}
