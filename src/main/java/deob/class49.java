package deob;

@ObfuscatedName("ap")
public class class49 extends class50 {

    @ObfuscatedName("ap.h")
    public int field366;

    @ObfuscatedName("ap.e")
    public int field367;

    @ObfuscatedName("ap.v")
    public int field380;

    @ObfuscatedName("ap.x")
    public int field368;

    @ObfuscatedName("ap.m")
    public int field370;

    @ObfuscatedName("ap.q")
    public int field369;

    @ObfuscatedName("ap.f")
    public int field372;

    @ObfuscatedName("ap.r")
    public int field373;

    @ObfuscatedName("ap.u")
    public int field374;

    @ObfuscatedName("ap.b")
    public int field371;

    @ObfuscatedName("ap.j")
    public boolean field376;

    @ObfuscatedName("ap.g")
    public int field377;

    @ObfuscatedName("ap.i")
    public int field378;

    @ObfuscatedName("ap.o")
    public int field379;

    @ObfuscatedName("ap.n")
    public int field375;

    @ObfuscatedName("ap.h(II)I")
    public static int method909(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("ap.e(II)I")
    public static int method938(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("ap.af()I")
    public int method904() {
        int var1 = this.field370 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field373 == 0) {
            var2 -= this.field366 * var2 / (((class42) this.field381).field297.length << 8);
        } else if (this.field373 >= 0) {
            var2 -= this.field374 * var2 / ((class42) this.field381).field297.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    public class49(class42 arg0, int arg1, int arg2) {
        this.field381 = arg0;
        this.field374 = arg0.field298;
        this.field371 = arg0.field296;
        this.field376 = arg0.field300;
        this.field367 = arg1;
        this.field380 = arg2;
        this.field368 = 8192;
        this.field366 = 0;
        this.method865();
    }

    public class49(class42 arg0, int arg1, int arg2, int arg3) {
        this.field381 = arg0;
        this.field374 = arg0.field298;
        this.field371 = arg0.field296;
        this.field376 = arg0.field300;
        this.field367 = arg1;
        this.field380 = arg2;
        this.field368 = arg3;
        this.field366 = 0;
        this.method865();
    }

    @ObfuscatedName("ap.v(Laf;II)Lap;")
    public static class49 method864(class42 arg0, int arg1, int arg2) {
        return arg0.field297 == null || arg0.field297.length == 0 ? null : new class49(arg0, (int) ((long) arg0.field299 * 256L * (long) arg1 / (long) (Statics.field326 * 100)), arg2 << 6);
    }

    @ObfuscatedName("ap.x(Laf;III)Lap;")
    public static class49 method973(class42 arg0, int arg1, int arg2, int arg3) {
        return arg0.field297 == null || arg0.field297.length == 0 ? null : new class49(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("ap.m()V")
    public void method865() {
        this.field370 = this.field380;
        this.field369 = method909(this.field380, this.field368);
        this.field372 = method938(this.field380, this.field368);
    }

    @ObfuscatedName("ap.b(I)V")
    public synchronized void method866(int arg0) {
        this.field373 = arg0;
    }

    @ObfuscatedName("ap.g(I)V")
    public synchronized void method867(int arg0) {
        this.method869(arg0 << 6, this.method881());
    }

    @ObfuscatedName("ap.i(I)V")
    public synchronized void method956(int arg0) {
        this.method869(arg0, this.method881());
    }

    @ObfuscatedName("ap.o(II)V")
    public synchronized void method869(int arg0, int arg1) {
        this.field380 = arg0;
        this.field368 = arg1;
        this.field377 = 0;
        this.method865();
    }

    @ObfuscatedName("ap.n()I")
    public synchronized int method912() {
        return this.field380 == Integer.MIN_VALUE ? 0 : this.field380;
    }

    @ObfuscatedName("ap.k()I")
    public synchronized int method881() {
        return this.field368 < 0 ? -1 : this.field368;
    }

    @ObfuscatedName("ap.a(I)V")
    public synchronized void method871(int arg0) {
        int var2 = ((class42) this.field381).field297.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field366 = arg0;
    }

    @ObfuscatedName("ap.s(Z)V")
    public synchronized void method872(boolean arg0) {
        this.field367 = (this.field367 >>> 31) + (this.field367 ^ this.field367 >> 31);
        if (arg0) {
            this.field367 = -this.field367;
        }
    }

    @ObfuscatedName("ap.l()V")
    public void method906() {
        if (this.field377 == 0) {
            return;
        }
        if (this.field380 == Integer.MIN_VALUE) {
            this.field380 = 0;
        }
        this.field377 = 0;
        this.method865();
    }

    @ObfuscatedName("ap.t(II)V")
    public synchronized void method874(int arg0, int arg1) {
        this.method875(arg0, arg1, this.method881());
    }

    @ObfuscatedName("ap.c(III)V")
    public synchronized void method875(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method869(arg1, arg2);
            return;
        }
        int var4 = method909(arg1, arg2);
        int var5 = method938(arg1, arg2);
        if (this.field369 == var4 && this.field372 == var5) {
            this.field377 = 0;
            return;
        }
        int var6 = arg1 - this.field370;
        if (this.field370 - arg1 > var6) {
            var6 = this.field370 - arg1;
        }
        if (var4 - this.field369 > var6) {
            var6 = var4 - this.field369;
        }
        if (this.field369 - var4 > var6) {
            var6 = this.field369 - var4;
        }
        if (var5 - this.field372 > var6) {
            var6 = var5 - this.field372;
        }
        if (this.field372 - var5 > var6) {
            var6 = this.field372 - var5;
        }
        if (arg0 > var6) {
            arg0 = var6;
        }
        this.field377 = arg0;
        this.field380 = arg1;
        this.field368 = arg2;
        this.field378 = (arg1 - this.field370) / arg0;
        this.field379 = (var4 - this.field369) / arg0;
        this.field375 = (var5 - this.field372) / arg0;
    }

    @ObfuscatedName("ap.ay(I)V")
    public synchronized void method876(int arg0) {
        if (arg0 == 0) {
            this.method956(0);
            this.method7230();
        } else if (this.field369 == 0 && this.field372 == 0) {
            this.field377 = 0;
            this.field380 = 0;
            this.field370 = 0;
            this.method7230();
        } else {
            int var2 = -this.field370;
            if (this.field370 > var2) {
                var2 = this.field370;
            }
            if (-this.field369 > var2) {
                var2 = -this.field369;
            }
            if (this.field369 > var2) {
                var2 = this.field369;
            }
            if (-this.field372 > var2) {
                var2 = -this.field372;
            }
            if (this.field372 > var2) {
                var2 = this.field372;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field377 = arg0;
            this.field380 = Integer.MIN_VALUE;
            this.field378 = -this.field370 / arg0;
            this.field379 = -this.field369 / arg0;
            this.field375 = -this.field372 / arg0;
        }
    }

    @ObfuscatedName("ap.an(I)V")
    public synchronized void method877(int arg0) {
        if (this.field367 < 0) {
            this.field367 = -arg0;
        } else {
            this.field367 = arg0;
        }
    }

    @ObfuscatedName("ap.ab()I")
    public synchronized int method878() {
        return this.field367 < 0 ? -this.field367 : this.field367;
    }

    @ObfuscatedName("ap.al()Z")
    public boolean method879() {
        return this.field366 < 0 || this.field366 >= ((class42) this.field381).field297.length << 8;
    }

    @ObfuscatedName("ap.az()Z")
    public boolean method924() {
        return this.field377 != 0;
    }

    @ObfuscatedName("ap.q()Laa;")
    public class50 method737() {
        return null;
    }

    @ObfuscatedName("ap.f()Laa;")
    public class50 method713() {
        return null;
    }

    @ObfuscatedName("ap.r()I")
    public int method709() {
        return this.field380 == 0 && this.field377 == 0 ? 0 : 1;
    }

    @ObfuscatedName("ap.u([III)V")
    public synchronized void method715(int[] arg0, int arg1, int arg2) {
        if (this.field380 == 0 && this.field377 == 0) {
            this.method717(arg2);
            return;
        }
        class42 var4 = (class42) this.field381;
        int var5 = this.field374 << 8;
        int var6 = this.field371 << 8;
        int var7 = var4.field297.length << 8;
        int var8 = var6 - var5;
        if (var8 <= 0) {
            this.field373 = 0;
        }
        int var9 = arg1;
        int var10 = arg1 + arg2;
        if (this.field366 < 0) {
            if (this.field367 <= 0) {
                this.method906();
                this.method7230();
                return;
            }
            this.field366 = 0;
        }
        if (this.field366 >= var7) {
            if (this.field367 >= 0) {
                this.method906();
                this.method7230();
                return;
            }
            this.field366 = var7 - 1;
        }
        if (this.field373 >= 0) {
            if (this.field373 > 0) {
                if (this.field376) {
                    label131: {
                        if (this.field367 < 0) {
                            var9 = this.method885(arg0, arg1, var5, var10, var4.field297[this.field374]);
                            if (this.field366 >= var5) {
                                return;
                            }
                            this.field366 = var5 + var5 - 1 - this.field366;
                            this.field367 = -this.field367;
                            if (--this.field373 == 0) {
                                break label131;
                            }
                        }
                        do {
                            var9 = this.method884(arg0, var9, var6, var10, var4.field297[this.field371 - 1]);
                            if (this.field366 < var6) {
                                return;
                            }
                            this.field366 = var6 + var6 - 1 - this.field366;
                            this.field367 = -this.field367;
                            if (--this.field373 == 0) {
                                break;
                            }
                            var9 = this.method885(arg0, var9, var5, var10, var4.field297[this.field374]);
                            if (this.field366 >= var5) {
                                return;
                            }
                            this.field366 = var5 + var5 - 1 - this.field366;
                            this.field367 = -this.field367;
                        } while (--this.field373 != 0);
                    }
                } else if (this.field367 < 0) {
                    while (true) {
                        var9 = this.method885(arg0, var9, var5, var10, var4.field297[this.field371 - 1]);
                        if (this.field366 >= var5) {
                            return;
                        }
                        int var12 = (var6 - 1 - this.field366) / var8;
                        if (var12 >= this.field373) {
                            this.field366 += this.field373 * var8;
                            this.field373 = 0;
                            break;
                        }
                        this.field366 += var8 * var12;
                        this.field373 -= var12;
                    }
                } else {
                    while (true) {
                        var9 = this.method884(arg0, var9, var6, var10, var4.field297[this.field374]);
                        if (this.field366 < var6) {
                            return;
                        }
                        int var13 = (this.field366 - var5) / var8;
                        if (var13 >= this.field373) {
                            this.field366 -= this.field373 * var8;
                            this.field373 = 0;
                            break;
                        }
                        this.field366 -= var8 * var13;
                        this.field373 -= var13;
                    }
                }
            }
            if (this.field367 < 0) {
                this.method885(arg0, var9, 0, var10, 0);
                if (this.field366 < 0) {
                    this.field366 = -1;
                    this.method906();
                    this.method7230();
                }
            } else {
                this.method884(arg0, var9, var7, var10, 0);
                if (this.field366 >= var7) {
                    this.field366 = var7;
                    this.method906();
                    this.method7230();
                }
            }
        } else if (this.field376) {
            if (this.field367 < 0) {
                var9 = this.method885(arg0, arg1, var5, var10, var4.field297[this.field374]);
                if (this.field366 >= var5) {
                    return;
                }
                this.field366 = var5 + var5 - 1 - this.field366;
                this.field367 = -this.field367;
            }
            while (true) {
                int var11 = this.method884(arg0, var9, var6, var10, var4.field297[this.field371 - 1]);
                if (this.field366 < var6) {
                    return;
                }
                this.field366 = var6 + var6 - 1 - this.field366;
                this.field367 = -this.field367;
                var9 = this.method885(arg0, var11, var5, var10, var4.field297[this.field374]);
                if (this.field366 >= var5) {
                    return;
                }
                this.field366 = var5 + var5 - 1 - this.field366;
                this.field367 = -this.field367;
            }
        } else if (this.field367 < 0) {
            while (true) {
                var9 = this.method885(arg0, var9, var5, var10, var4.field297[this.field371 - 1]);
                if (this.field366 >= var5) {
                    return;
                }
                this.field366 = var6 - 1 - (var6 - 1 - this.field366) % var8;
            }
        } else {
            while (true) {
                var9 = this.method884(arg0, var9, var6, var10, var4.field297[this.field374]);
                if (this.field366 < var6) {
                    return;
                }
                this.field366 = (this.field366 - var5) % var8 + var5;
            }
        }
    }

    @ObfuscatedName("ap.j(I)V")
    public synchronized void method717(int arg0) {
        if (this.field377 > 0) {
            if (arg0 >= this.field377) {
                if (this.field380 == Integer.MIN_VALUE) {
                    this.field380 = 0;
                    this.field372 = 0;
                    this.field369 = 0;
                    this.field370 = 0;
                    this.method7230();
                    arg0 = this.field377;
                }
                this.field377 = 0;
                this.method865();
            } else {
                this.field370 += this.field378 * arg0;
                this.field369 += this.field379 * arg0;
                this.field372 += this.field375 * arg0;
                this.field377 -= arg0;
            }
        }
        class42 var2 = (class42) this.field381;
        int var3 = this.field374 << 8;
        int var4 = this.field371 << 8;
        int var5 = var2.field297.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field373 = 0;
        }
        if (this.field366 < 0) {
            if (this.field367 <= 0) {
                this.method906();
                this.method7230();
                return;
            }
            this.field366 = 0;
        }
        if (this.field366 >= var5) {
            if (this.field367 >= 0) {
                this.method906();
                this.method7230();
                return;
            }
            this.field366 = var5 - 1;
        }
        this.field366 += this.field367 * arg0;
        if (this.field373 >= 0) {
            if (this.field373 > 0) {
                if (this.field376) {
                    label121: {
                        if (this.field367 < 0) {
                            if (this.field366 >= var3) {
                                return;
                            }
                            this.field366 = var3 + var3 - 1 - this.field366;
                            this.field367 = -this.field367;
                            if (--this.field373 == 0) {
                                break label121;
                            }
                        }
                        do {
                            if (this.field366 < var4) {
                                return;
                            }
                            this.field366 = var4 + var4 - 1 - this.field366;
                            this.field367 = -this.field367;
                            if (--this.field373 == 0) {
                                break;
                            }
                            if (this.field366 >= var3) {
                                return;
                            }
                            this.field366 = var3 + var3 - 1 - this.field366;
                            this.field367 = -this.field367;
                        } while (--this.field373 != 0);
                    }
                } else {
                    label153: {
                        if (this.field367 < 0) {
                            if (this.field366 >= var3) {
                                return;
                            }
                            int var7 = (var4 - 1 - this.field366) / var6;
                            if (var7 >= this.field373) {
                                this.field366 += this.field373 * var6;
                                this.field373 = 0;
                                break label153;
                            }
                            this.field366 += var6 * var7;
                            this.field373 -= var7;
                        } else if (this.field366 >= var4) {
                            int var8 = (this.field366 - var3) / var6;
                            if (var8 >= this.field373) {
                                this.field366 -= this.field373 * var6;
                                this.field373 = 0;
                                break label153;
                            }
                            this.field366 -= var6 * var8;
                            this.field373 -= var8;
                        } else {
                            return;
                        }
                        return;
                    }
                }
            }
            if (this.field367 < 0) {
                if (this.field366 < 0) {
                    this.field366 = -1;
                    this.method906();
                    this.method7230();
                }
            } else if (this.field366 >= var5) {
                this.field366 = var5;
                this.method906();
                this.method7230();
            }
        } else if (this.field376) {
            if (this.field367 < 0) {
                if (this.field366 >= var3) {
                    return;
                }
                this.field366 = var3 + var3 - 1 - this.field366;
                this.field367 = -this.field367;
            }
            while (this.field366 >= var4) {
                this.field366 = var4 + var4 - 1 - this.field366;
                this.field367 = -this.field367;
                if (this.field366 >= var3) {
                    return;
                }
                this.field366 = var3 + var3 - 1 - this.field366;
                this.field367 = -this.field367;
            }
        } else if (this.field367 < 0) {
            if (this.field366 >= var3) {
                return;
            }
            this.field366 = var4 - 1 - (var4 - 1 - this.field366) % var6;
        } else if (this.field366 >= var4) {
            this.field366 = (this.field366 - var3) % var6 + var3;
        } else {
            return;
        }
    }

    @ObfuscatedName("ap.ak([IIIII)I")
    public int method884(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field377 > 0) {
                int var6 = this.field377 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field377 += arg1;
                if (this.field367 == 256 && (this.field366 & 0xFF) == 0) {
                    if (Statics.field3355) {
                        arg1 = method920(0, ((class42) this.field381).field297, arg0, this.field366, arg1, this.field369, this.field372, this.field379, this.field375, 0, var6, arg2, this);
                    } else {
                        arg1 = method894(((class42) this.field381).field297, arg0, this.field366, arg1, this.field370, this.field378, 0, var6, arg2, this);
                    }
                } else if (Statics.field3355) {
                    arg1 = method882(0, 0, ((class42) this.field381).field297, arg0, this.field366, arg1, this.field369, this.field372, this.field379, this.field375, 0, var6, arg2, this, this.field367, arg4);
                } else {
                    arg1 = method897(0, 0, ((class42) this.field381).field297, arg0, this.field366, arg1, this.field370, this.field378, 0, var6, arg2, this, this.field367, arg4);
                }
                this.field377 -= arg1;
                if (this.field377 != 0) {
                    return arg1;
                }
                if (!this.method958()) {
                    continue;
                }
                return arg3;
            }
            if (this.field367 == 256 && (this.field366 & 0xFF) == 0) {
                if (Statics.field3355) {
                    return method888(0, ((class42) this.field381).field297, arg0, this.field366, arg1, this.field369, this.field372, 0, arg3, arg2, this);
                }
                return method870(((class42) this.field381).field297, arg0, this.field366, arg1, this.field370, 0, arg3, arg2, this);
            }
            if (Statics.field3355) {
                return method891(0, 0, ((class42) this.field381).field297, arg0, this.field366, arg1, this.field369, this.field372, 0, arg3, arg2, this, this.field367, arg4);
            }
            return method959(0, 0, ((class42) this.field381).field297, arg0, this.field366, arg1, this.field370, 0, arg3, arg2, this, this.field367, arg4);
        }
    }

    @ObfuscatedName("ap.ai([IIIII)I")
    public int method885(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field377 > 0) {
                int var6 = this.field377 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field377 += arg1;
                if (this.field367 == -256 && (this.field366 & 0xFF) == 0) {
                    if (Statics.field3355) {
                        arg1 = method896(0, ((class42) this.field381).field297, arg0, this.field366, arg1, this.field369, this.field372, this.field379, this.field375, 0, var6, arg2, this);
                    } else {
                        arg1 = method895(((class42) this.field381).field297, arg0, this.field366, arg1, this.field370, this.field378, 0, var6, arg2, this);
                    }
                } else if (Statics.field3355) {
                    arg1 = method900(0, 0, ((class42) this.field381).field297, arg0, this.field366, arg1, this.field369, this.field372, this.field379, this.field375, 0, var6, arg2, this, this.field367, arg4);
                } else {
                    arg1 = method899(0, 0, ((class42) this.field381).field297, arg0, this.field366, arg1, this.field370, this.field378, 0, var6, arg2, this, this.field367, arg4);
                }
                this.field377 -= arg1;
                if (this.field377 != 0) {
                    return arg1;
                }
                if (!this.method958()) {
                    continue;
                }
                return arg3;
            }
            if (this.field367 == -256 && (this.field366 & 0xFF) == 0) {
                if (Statics.field3355) {
                    return method889(0, ((class42) this.field381).field297, arg0, this.field366, arg1, this.field369, this.field372, 0, arg3, arg2, this);
                }
                return method951(((class42) this.field381).field297, arg0, this.field366, arg1, this.field370, 0, arg3, arg2, this);
            }
            if (Statics.field3355) {
                return method893(0, 0, ((class42) this.field381).field297, arg0, this.field366, arg1, this.field369, this.field372, 0, arg3, arg2, this, this.field367, arg4);
            }
            return method892(0, 0, ((class42) this.field381).field297, arg0, this.field366, arg1, this.field370, 0, arg3, arg2, this, this.field367, arg4);
        }
    }

    @ObfuscatedName("ap.ax()Z")
    public boolean method958() {
        int var1 = this.field380;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method909(var1, this.field368);
            var2 = method938(var1, this.field368);
        }
        if (this.field370 != var1 || this.field369 != var3 || this.field372 != var2) {
            if (this.field370 < var1) {
                this.field378 = 1;
                this.field377 = var1 - this.field370;
            } else if (this.field370 > var1) {
                this.field378 = -1;
                this.field377 = this.field370 - var1;
            } else {
                this.field378 = 0;
            }
            if (this.field369 < var3) {
                this.field379 = 1;
                if (this.field377 == 0 || this.field377 > var3 - this.field369) {
                    this.field377 = var3 - this.field369;
                }
            } else if (this.field369 > var3) {
                this.field379 = -1;
                if (this.field377 == 0 || this.field377 > this.field369 - var3) {
                    this.field377 = this.field369 - var3;
                }
            } else {
                this.field379 = 0;
            }
            if (this.field372 < var2) {
                this.field375 = 1;
                if (this.field377 == 0 || this.field377 > var2 - this.field372) {
                    this.field377 = var2 - this.field372;
                }
            } else if (this.field372 > var2) {
                this.field375 = -1;
                if (this.field377 == 0 || this.field377 > this.field372 - var2) {
                    this.field377 = this.field372 - var2;
                }
            } else {
                this.field375 = 0;
            }
            return false;
        } else if (this.field380 == Integer.MIN_VALUE) {
            this.field380 = 0;
            this.field372 = 0;
            this.field369 = 0;
            this.field370 = 0;
            this.method7230();
            return true;
        } else {
            this.method865();
            return false;
        }
    }

    @ObfuscatedName("ap.ah([B[IIIIIIILap;)I")
    public static int method870(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class49 arg8) {
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
        arg8.field366 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("ap.aw(I[B[IIIIIIIILap;)I")
    public static int method888(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class49 arg10) {
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
        arg10.field366 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("ap.aj([B[IIIIIIILap;)I")
    public static int method951(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class49 arg8) {
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
        arg8.field366 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("ap.aq(I[B[IIIIIIIILap;)I")
    public static int method889(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class49 arg10) {
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
        arg10.field366 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("ap.ap(II[B[IIIIIIILap;II)I")
    public static int method959(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class49 arg10, int arg11, int arg12) {
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
        arg10.field366 = arg4;
        return arg5;
    }

    @ObfuscatedName("ap.aa(II[B[IIIIIIIILap;II)I")
    public static int method891(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class49 arg11, int arg12, int arg13) {
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
        arg11.field366 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("ap.ae(II[B[IIIIIIILap;II)I")
    public static int method892(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class49 arg10, int arg11, int arg12) {
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
        arg10.field366 = arg4;
        return arg5;
    }

    @ObfuscatedName("ap.ac(II[B[IIIIIIIILap;II)I")
    public static int method893(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class49 arg11, int arg12, int arg13) {
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
        arg11.field366 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("ap.bh([B[IIIIIIIILap;)I")
    public static int method894(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class49 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field369 += (var14 - arg3) * arg9.field379;
        arg9.field372 += (var14 - arg3) * arg9.field375;
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
        arg9.field370 = var12 >> 2;
        arg9.field366 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("ap.by(I[B[IIIIIIIIIILap;)I")
    public static int method920(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class49 arg12) {
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
        arg12.field370 += (var19 - arg4) * arg12.field378;
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
        arg12.field369 = var15 >> 2;
        arg12.field372 = var16 >> 2;
        arg12.field366 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("ap.bw([B[IIIIIIIILap;)I")
    public static int method895(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class49 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field369 += (var14 - arg3) * arg9.field379;
        arg9.field372 += (var14 - arg3) * arg9.field375;
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
        arg9.field370 = var12 >> 2;
        arg9.field366 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("ap.bp(I[B[IIIIIIIIIILap;)I")
    public static int method896(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class49 arg12) {
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
        arg12.field370 += (var19 - arg4) * arg12.field378;
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
        arg12.field369 = var15 >> 2;
        arg12.field372 = var16 >> 2;
        arg12.field366 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("ap.bc(II[B[IIIIIIIILap;II)I")
    public static int method897(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class49 arg11, int arg12, int arg13) {
        arg11.field369 -= arg11.field379 * arg5;
        arg11.field372 -= arg11.field375 * arg5;
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
        arg11.field369 += arg11.field379 * arg5;
        arg11.field372 += arg11.field375 * arg5;
        arg11.field370 = arg6;
        arg11.field366 = arg4;
        return arg5;
    }

    @ObfuscatedName("ap.bl(II[B[IIIIIIIIIILap;II)I")
    public static int method882(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class49 arg13, int arg14, int arg15) {
        arg13.field370 -= arg13.field378 * arg5;
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
        arg13.field370 += arg13.field378 * var27;
        arg13.field369 = arg6;
        arg13.field372 = arg7;
        arg13.field366 = arg4;
        return var27;
    }

    @ObfuscatedName("ap.bv(II[B[IIIIIIIILap;II)I")
    public static int method899(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class49 arg11, int arg12, int arg13) {
        arg11.field369 -= arg11.field379 * arg5;
        arg11.field372 -= arg11.field375 * arg5;
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
        arg11.field369 += arg11.field379 * arg5;
        arg11.field372 += arg11.field375 * arg5;
        arg11.field370 = arg6;
        arg11.field366 = arg4;
        return arg5;
    }

    @ObfuscatedName("ap.bx(II[B[IIIIIIIIIILap;II)I")
    public static int method900(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class49 arg13, int arg14, int arg15) {
        arg13.field370 -= arg13.field378 * arg5;
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
        arg13.field370 += arg13.field378 * var26;
        arg13.field369 = arg6;
        arg13.field372 = arg7;
        arg13.field366 = arg4;
        return var26;
    }
}
