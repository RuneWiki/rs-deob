package deob;

@ObfuscatedName("bn")
public class class49 extends class50 {

    @ObfuscatedName("bn.au")
    public int field366;

    @ObfuscatedName("bn.ae")
    public int field357;

    @ObfuscatedName("bn.ao")
    public int field358;

    @ObfuscatedName("bn.at")
    public int field359;

    @ObfuscatedName("bn.ac")
    public int field360;

    @ObfuscatedName("bn.ai")
    public int field368;

    @ObfuscatedName("bn.az")
    public int field362;

    @ObfuscatedName("bn.ap")
    public int field363;

    @ObfuscatedName("bn.aa")
    public int field364;

    @ObfuscatedName("bn.af")
    public int field365;

    @ObfuscatedName("bn.ad")
    public boolean field369;

    @ObfuscatedName("bn.aq")
    public int field367;

    @ObfuscatedName("bn.al")
    public int field356;

    @ObfuscatedName("bn.an")
    public int field361;

    @ObfuscatedName("bn.ar")
    public int field370;

    @ObfuscatedName("bn.au(II)I")
    public static int method912(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("bn.ae(II)I")
    public static int method876(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("bn.br()I")
    public int method877() {
        int var1 = this.field360 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field363 == 0) {
            var2 -= this.field366 * var2 / (((class41) this.field374).field281.length << 8);
        } else if (this.field363 >= 0) {
            var2 -= this.field364 * var2 / ((class41) this.field374).field281.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    public class49(class41 arg0, int arg1, int arg2) {
        this.field374 = arg0;
        this.field364 = arg0.field282;
        this.field365 = arg0.field280;
        this.field369 = arg0.field284;
        this.field357 = arg1;
        this.field358 = arg2;
        this.field359 = 8192;
        this.field366 = 0;
        this.method968();
    }

    public class49(class41 arg0, int arg1, int arg2, int arg3) {
        this.field374 = arg0;
        this.field364 = arg0.field282;
        this.field365 = arg0.field280;
        this.field369 = arg0.field284;
        this.field357 = arg1;
        this.field358 = arg2;
        this.field359 = arg3;
        this.field366 = 0;
        this.method968();
    }

    @ObfuscatedName("bn.ao(Lbu;II)Lbn;")
    public static class49 method952(class41 arg0, int arg1, int arg2) {
        return arg0.field281 == null || arg0.field281.length == 0 ? null : new class49(arg0, (int) ((long) arg0.field283 * 256L * (long) arg1 / (long) (Statics.field294 * 100)), arg2 << 6);
    }

    @ObfuscatedName("bn.at(Lbu;III)Lbn;")
    public static class49 method879(class41 arg0, int arg1, int arg2, int arg3) {
        return arg0.field281 == null || arg0.field281.length == 0 ? null : new class49(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("bn.ac()V")
    public void method968() {
        this.field360 = this.field358;
        this.field368 = method912(this.field358, this.field359);
        this.field362 = method876(this.field358, this.field359);
    }

    @ObfuscatedName("bn.af(I)V")
    public synchronized void method880(int arg0) {
        this.field363 = arg0;
    }

    @ObfuscatedName("bn.aq(I)V")
    public synchronized void method881(int arg0) {
        this.method883(arg0 << 6, this.method885());
    }

    @ObfuscatedName("bn.al(I)V")
    public synchronized void method999(int arg0) {
        this.method883(arg0, this.method885());
    }

    @ObfuscatedName("bn.an(II)V")
    public synchronized void method883(int arg0, int arg1) {
        this.field358 = arg0;
        this.field359 = arg1;
        this.field367 = 0;
        this.method968();
    }

    @ObfuscatedName("bn.ar()I")
    public synchronized int method884() {
        return this.field358 == Integer.MIN_VALUE ? 0 : this.field358;
    }

    @ObfuscatedName("bn.ab()I")
    public synchronized int method885() {
        return this.field359 < 0 ? -1 : this.field359;
    }

    @ObfuscatedName("bn.ag(I)V")
    public synchronized void method886(int arg0) {
        int var2 = ((class41) this.field374).field281.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field366 = arg0;
    }

    @ObfuscatedName("bn.am(Z)V")
    public synchronized void method933(boolean arg0) {
        this.field357 = (this.field357 >>> 31) + (this.field357 ^ this.field357 >> 31);
        if (arg0) {
            this.field357 = -this.field357;
        }
    }

    @ObfuscatedName("bn.ax()V")
    public void method913() {
        if (this.field367 == 0) {
            return;
        }
        if (this.field358 == Integer.MIN_VALUE) {
            this.field358 = 0;
        }
        this.field367 = 0;
        this.method968();
    }

    @ObfuscatedName("bn.ah(II)V")
    public synchronized void method917(int arg0, int arg1) {
        this.method896(arg0, arg1, this.method885());
    }

    @ObfuscatedName("bn.as(III)V")
    public synchronized void method896(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method883(arg1, arg2);
            return;
        }
        int var4 = method912(arg1, arg2);
        int var5 = method876(arg1, arg2);
        if (this.field368 == var4 && this.field362 == var5) {
            this.field367 = 0;
            return;
        }
        int var6 = arg1 - this.field360;
        if (this.field360 - arg1 > var6) {
            var6 = this.field360 - arg1;
        }
        if (var4 - this.field368 > var6) {
            var6 = var4 - this.field368;
        }
        if (this.field368 - var4 > var6) {
            var6 = this.field368 - var4;
        }
        if (var5 - this.field362 > var6) {
            var6 = var5 - this.field362;
        }
        if (this.field362 - var5 > var6) {
            var6 = this.field362 - var5;
        }
        if (arg0 > var6) {
            arg0 = var6;
        }
        this.field367 = arg0;
        this.field358 = arg1;
        this.field359 = arg2;
        this.field356 = (arg1 - this.field360) / arg0;
        this.field361 = (var4 - this.field368) / arg0;
        this.field370 = (var5 - this.field362) / arg0;
    }

    @ObfuscatedName("bn.ay(I)V")
    public synchronized void method891(int arg0) {
        if (arg0 == 0) {
            this.method999(0);
            this.method7700();
        } else if (this.field368 == 0 && this.field362 == 0) {
            this.field367 = 0;
            this.field358 = 0;
            this.field360 = 0;
            this.method7700();
        } else {
            int var2 = -this.field360;
            if (this.field360 > var2) {
                var2 = this.field360;
            }
            if (-this.field368 > var2) {
                var2 = -this.field368;
            }
            if (this.field368 > var2) {
                var2 = this.field368;
            }
            if (-this.field362 > var2) {
                var2 = -this.field362;
            }
            if (this.field362 > var2) {
                var2 = this.field362;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field367 = arg0;
            this.field358 = Integer.MIN_VALUE;
            this.field356 = -this.field360 / arg0;
            this.field361 = -this.field368 / arg0;
            this.field370 = -this.field362 / arg0;
        }
    }

    @ObfuscatedName("bn.aj(I)V")
    public synchronized void method892(int arg0) {
        if (this.field357 < 0) {
            this.field357 = -arg0;
        } else {
            this.field357 = arg0;
        }
    }

    @ObfuscatedName("bn.av()I")
    public synchronized int method893() {
        return this.field357 < 0 ? -this.field357 : this.field357;
    }

    @ObfuscatedName("bn.aw()Z")
    public boolean method894() {
        return this.field366 < 0 || this.field366 >= ((class41) this.field374).field281.length << 8;
    }

    @ObfuscatedName("bn.ak()Z")
    public boolean method895() {
        return this.field367 != 0;
    }

    @ObfuscatedName("bn.ai()Lbw;")
    public class50 method720() {
        return null;
    }

    @ObfuscatedName("bn.az()Lbw;")
    public class50 method712() {
        return null;
    }

    @ObfuscatedName("bn.ap()I")
    public int method713() {
        return this.field358 == 0 && this.field367 == 0 ? 0 : 1;
    }

    @ObfuscatedName("bn.aa([III)V")
    public synchronized void method714(int[] arg0, int arg1, int arg2) {
        if (this.field358 == 0 && this.field367 == 0) {
            this.method716(arg2);
            return;
        }
        class41 var4 = (class41) this.field374;
        int var5 = this.field364 << 8;
        int var6 = this.field365 << 8;
        int var7 = var4.field281.length << 8;
        int var8 = var6 - var5;
        if (var8 <= 0) {
            this.field363 = 0;
        }
        int var9 = arg1;
        int var10 = arg1 + arg2;
        if (this.field366 < 0) {
            if (this.field357 <= 0) {
                this.method913();
                this.method7700();
                return;
            }
            this.field366 = 0;
        }
        if (this.field366 >= var7) {
            if (this.field357 >= 0) {
                this.method913();
                this.method7700();
                return;
            }
            this.field366 = var7 - 1;
        }
        if (this.field363 >= 0) {
            if (this.field363 > 0) {
                if (this.field369) {
                    label131: {
                        if (this.field357 < 0) {
                            var9 = this.method897(arg0, arg1, var5, var10, var4.field281[this.field364]);
                            if (this.field366 >= var5) {
                                return;
                            }
                            this.field366 = var5 + var5 - 1 - this.field366;
                            this.field357 = -this.field357;
                            if (--this.field363 == 0) {
                                break label131;
                            }
                        }
                        do {
                            var9 = this.method915(arg0, var9, var6, var10, var4.field281[this.field365 - 1]);
                            if (this.field366 < var6) {
                                return;
                            }
                            this.field366 = var6 + var6 - 1 - this.field366;
                            this.field357 = -this.field357;
                            if (--this.field363 == 0) {
                                break;
                            }
                            var9 = this.method897(arg0, var9, var5, var10, var4.field281[this.field364]);
                            if (this.field366 >= var5) {
                                return;
                            }
                            this.field366 = var5 + var5 - 1 - this.field366;
                            this.field357 = -this.field357;
                        } while (--this.field363 != 0);
                    }
                } else if (this.field357 < 0) {
                    while (true) {
                        var9 = this.method897(arg0, var9, var5, var10, var4.field281[this.field365 - 1]);
                        if (this.field366 >= var5) {
                            return;
                        }
                        int var12 = (var6 - 1 - this.field366) / var8;
                        if (var12 >= this.field363) {
                            this.field366 += this.field363 * var8;
                            this.field363 = 0;
                            break;
                        }
                        this.field366 += var8 * var12;
                        this.field363 -= var12;
                    }
                } else {
                    while (true) {
                        var9 = this.method915(arg0, var9, var6, var10, var4.field281[this.field364]);
                        if (this.field366 < var6) {
                            return;
                        }
                        int var13 = (this.field366 - var5) / var8;
                        if (var13 >= this.field363) {
                            this.field366 -= this.field363 * var8;
                            this.field363 = 0;
                            break;
                        }
                        this.field366 -= var8 * var13;
                        this.field363 -= var13;
                    }
                }
            }
            if (this.field357 < 0) {
                this.method897(arg0, var9, 0, var10, 0);
                if (this.field366 < 0) {
                    this.field366 = -1;
                    this.method913();
                    this.method7700();
                }
            } else {
                this.method915(arg0, var9, var7, var10, 0);
                if (this.field366 >= var7) {
                    this.field366 = var7;
                    this.method913();
                    this.method7700();
                }
            }
        } else if (this.field369) {
            if (this.field357 < 0) {
                var9 = this.method897(arg0, arg1, var5, var10, var4.field281[this.field364]);
                if (this.field366 >= var5) {
                    return;
                }
                this.field366 = var5 + var5 - 1 - this.field366;
                this.field357 = -this.field357;
            }
            while (true) {
                int var11 = this.method915(arg0, var9, var6, var10, var4.field281[this.field365 - 1]);
                if (this.field366 < var6) {
                    return;
                }
                this.field366 = var6 + var6 - 1 - this.field366;
                this.field357 = -this.field357;
                var9 = this.method897(arg0, var11, var5, var10, var4.field281[this.field364]);
                if (this.field366 >= var5) {
                    return;
                }
                this.field366 = var5 + var5 - 1 - this.field366;
                this.field357 = -this.field357;
            }
        } else if (this.field357 < 0) {
            while (true) {
                var9 = this.method897(arg0, var9, var5, var10, var4.field281[this.field365 - 1]);
                if (this.field366 >= var5) {
                    return;
                }
                this.field366 = var6 - 1 - (var6 - 1 - this.field366) % var8;
            }
        } else {
            while (true) {
                var9 = this.method915(arg0, var9, var6, var10, var4.field281[this.field364]);
                if (this.field366 < var6) {
                    return;
                }
                this.field366 = (this.field366 - var5) % var8 + var5;
            }
        }
    }

    @ObfuscatedName("bn.ad(I)V")
    public synchronized void method716(int arg0) {
        if (this.field367 > 0) {
            if (arg0 >= this.field367) {
                if (this.field358 == Integer.MIN_VALUE) {
                    this.field358 = 0;
                    this.field362 = 0;
                    this.field368 = 0;
                    this.field360 = 0;
                    this.method7700();
                    arg0 = this.field367;
                }
                this.field367 = 0;
                this.method968();
            } else {
                this.field360 += this.field356 * arg0;
                this.field368 += this.field361 * arg0;
                this.field362 += this.field370 * arg0;
                this.field367 -= arg0;
            }
        }
        class41 var2 = (class41) this.field374;
        int var3 = this.field364 << 8;
        int var4 = this.field365 << 8;
        int var5 = var2.field281.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field363 = 0;
        }
        if (this.field366 < 0) {
            if (this.field357 <= 0) {
                this.method913();
                this.method7700();
                return;
            }
            this.field366 = 0;
        }
        if (this.field366 >= var5) {
            if (this.field357 >= 0) {
                this.method913();
                this.method7700();
                return;
            }
            this.field366 = var5 - 1;
        }
        this.field366 += this.field357 * arg0;
        if (this.field363 >= 0) {
            if (this.field363 > 0) {
                if (this.field369) {
                    label121: {
                        if (this.field357 < 0) {
                            if (this.field366 >= var3) {
                                return;
                            }
                            this.field366 = var3 + var3 - 1 - this.field366;
                            this.field357 = -this.field357;
                            if (--this.field363 == 0) {
                                break label121;
                            }
                        }
                        do {
                            if (this.field366 < var4) {
                                return;
                            }
                            this.field366 = var4 + var4 - 1 - this.field366;
                            this.field357 = -this.field357;
                            if (--this.field363 == 0) {
                                break;
                            }
                            if (this.field366 >= var3) {
                                return;
                            }
                            this.field366 = var3 + var3 - 1 - this.field366;
                            this.field357 = -this.field357;
                        } while (--this.field363 != 0);
                    }
                } else {
                    label153: {
                        if (this.field357 < 0) {
                            if (this.field366 >= var3) {
                                return;
                            }
                            int var7 = (var4 - 1 - this.field366) / var6;
                            if (var7 >= this.field363) {
                                this.field366 += this.field363 * var6;
                                this.field363 = 0;
                                break label153;
                            }
                            this.field366 += var6 * var7;
                            this.field363 -= var7;
                        } else if (this.field366 >= var4) {
                            int var8 = (this.field366 - var3) / var6;
                            if (var8 >= this.field363) {
                                this.field366 -= this.field363 * var6;
                                this.field363 = 0;
                                break label153;
                            }
                            this.field366 -= var6 * var8;
                            this.field363 -= var8;
                        } else {
                            return;
                        }
                        return;
                    }
                }
            }
            if (this.field357 < 0) {
                if (this.field366 < 0) {
                    this.field366 = -1;
                    this.method913();
                    this.method7700();
                }
            } else if (this.field366 >= var5) {
                this.field366 = var5;
                this.method913();
                this.method7700();
            }
        } else if (this.field369) {
            if (this.field357 < 0) {
                if (this.field366 >= var3) {
                    return;
                }
                this.field366 = var3 + var3 - 1 - this.field366;
                this.field357 = -this.field357;
            }
            while (this.field366 >= var4) {
                this.field366 = var4 + var4 - 1 - this.field366;
                this.field357 = -this.field357;
                if (this.field366 >= var3) {
                    return;
                }
                this.field366 = var3 + var3 - 1 - this.field366;
                this.field357 = -this.field357;
            }
        } else if (this.field357 < 0) {
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

    @ObfuscatedName("bn.bh([IIIII)I")
    public int method915(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field367 > 0) {
                int var6 = this.field367 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field367 += arg1;
                if (this.field357 == 256 && (this.field366 & 0xFF) == 0) {
                    if (Statics.field309) {
                        arg1 = method906(0, ((class41) this.field374).field281, arg0, this.field366, arg1, this.field368, this.field362, this.field361, this.field370, 0, var6, arg2, this);
                    } else {
                        arg1 = method905(((class41) this.field374).field281, arg0, this.field366, arg1, this.field360, this.field356, 0, var6, arg2, this);
                    }
                } else if (Statics.field309) {
                    arg1 = method910(0, 0, ((class41) this.field374).field281, arg0, this.field366, arg1, this.field368, this.field362, this.field361, this.field370, 0, var6, arg2, this, this.field357, arg4);
                } else {
                    arg1 = method909(0, 0, ((class41) this.field374).field281, arg0, this.field366, arg1, this.field360, this.field356, 0, var6, arg2, this, this.field357, arg4);
                }
                this.field367 -= arg1;
                if (this.field367 != 0) {
                    return arg1;
                }
                if (!this.method962()) {
                    continue;
                }
                return arg3;
            }
            if (this.field357 == 256 && (this.field366 & 0xFF) == 0) {
                if (Statics.field309) {
                    return method900(0, ((class41) this.field374).field281, arg0, this.field366, arg1, this.field368, this.field362, 0, arg3, arg2, this);
                }
                return method878(((class41) this.field374).field281, arg0, this.field366, arg1, this.field360, 0, arg3, arg2, this);
            }
            if (Statics.field309) {
                return method903(0, 0, ((class41) this.field374).field281, arg0, this.field366, arg1, this.field368, this.field362, 0, arg3, arg2, this, this.field357, arg4);
            }
            return method902(0, 0, ((class41) this.field374).field281, arg0, this.field366, arg1, this.field360, 0, arg3, arg2, this, this.field357, arg4);
        }
    }

    @ObfuscatedName("bn.bm([IIIII)I")
    public int method897(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field367 > 0) {
                int var6 = this.field367 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field367 += arg1;
                if (this.field357 == -256 && (this.field366 & 0xFF) == 0) {
                    if (Statics.field309) {
                        arg1 = method908(0, ((class41) this.field374).field281, arg0, this.field366, arg1, this.field368, this.field362, this.field361, this.field370, 0, var6, arg2, this);
                    } else {
                        arg1 = method907(((class41) this.field374).field281, arg0, this.field366, arg1, this.field360, this.field356, 0, var6, arg2, this);
                    }
                } else if (Statics.field309) {
                    arg1 = method956(0, 0, ((class41) this.field374).field281, arg0, this.field366, arg1, this.field368, this.field362, this.field361, this.field370, 0, var6, arg2, this, this.field357, arg4);
                } else {
                    arg1 = method969(0, 0, ((class41) this.field374).field281, arg0, this.field366, arg1, this.field360, this.field356, 0, var6, arg2, this, this.field357, arg4);
                }
                this.field367 -= arg1;
                if (this.field367 != 0) {
                    return arg1;
                }
                if (!this.method962()) {
                    continue;
                }
                return arg3;
            }
            if (this.field357 == -256 && (this.field366 & 0xFF) == 0) {
                if (Statics.field309) {
                    return method985(0, ((class41) this.field374).field281, arg0, this.field366, arg1, this.field368, this.field362, 0, arg3, arg2, this);
                }
                return method901(((class41) this.field374).field281, arg0, this.field366, arg1, this.field360, 0, arg3, arg2, this);
            }
            if (Statics.field309) {
                return method904(0, 0, ((class41) this.field374).field281, arg0, this.field366, arg1, this.field368, this.field362, 0, arg3, arg2, this, this.field357, arg4);
            }
            return method889(0, 0, ((class41) this.field374).field281, arg0, this.field366, arg1, this.field360, 0, arg3, arg2, this, this.field357, arg4);
        }
    }

    @ObfuscatedName("bn.bf()Z")
    public boolean method962() {
        int var1 = this.field358;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method912(var1, this.field359);
            var2 = method876(var1, this.field359);
        }
        if (this.field360 != var1 || this.field368 != var3 || this.field362 != var2) {
            if (this.field360 < var1) {
                this.field356 = 1;
                this.field367 = var1 - this.field360;
            } else if (this.field360 > var1) {
                this.field356 = -1;
                this.field367 = this.field360 - var1;
            } else {
                this.field356 = 0;
            }
            if (this.field368 < var3) {
                this.field361 = 1;
                if (this.field367 == 0 || this.field367 > var3 - this.field368) {
                    this.field367 = var3 - this.field368;
                }
            } else if (this.field368 > var3) {
                this.field361 = -1;
                if (this.field367 == 0 || this.field367 > this.field368 - var3) {
                    this.field367 = this.field368 - var3;
                }
            } else {
                this.field361 = 0;
            }
            if (this.field362 < var2) {
                this.field370 = 1;
                if (this.field367 == 0 || this.field367 > var2 - this.field362) {
                    this.field367 = var2 - this.field362;
                }
            } else if (this.field362 > var2) {
                this.field370 = -1;
                if (this.field367 == 0 || this.field367 > this.field362 - var2) {
                    this.field367 = this.field362 - var2;
                }
            } else {
                this.field370 = 0;
            }
            return false;
        } else if (this.field358 == Integer.MIN_VALUE) {
            this.field358 = 0;
            this.field362 = 0;
            this.field368 = 0;
            this.field360 = 0;
            this.method7700();
            return true;
        } else {
            this.method968();
            return false;
        }
    }

    @ObfuscatedName("bn.bq([B[IIIIIIILbn;)I")
    public static int method878(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class49 arg8) {
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

    @ObfuscatedName("bn.ba(I[B[IIIIIIIILbn;)I")
    public static int method900(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class49 arg10) {
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

    @ObfuscatedName("bn.bl([B[IIIIIIILbn;)I")
    public static int method901(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class49 arg8) {
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

    @ObfuscatedName("bn.be(I[B[IIIIIIIILbn;)I")
    public static int method985(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class49 arg10) {
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

    @ObfuscatedName("bn.bi(II[B[IIIIIIILbn;II)I")
    public static int method902(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class49 arg10, int arg11, int arg12) {
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

    @ObfuscatedName("bn.bz(II[B[IIIIIIIILbn;II)I")
    public static int method903(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class49 arg11, int arg12, int arg13) {
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

    @ObfuscatedName("bn.bx(II[B[IIIIIIILbn;II)I")
    public static int method889(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class49 arg10, int arg11, int arg12) {
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

    @ObfuscatedName("bn.bn(II[B[IIIIIIIILbn;II)I")
    public static int method904(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class49 arg11, int arg12, int arg13) {
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

    @ObfuscatedName("bn.bw([B[IIIIIIIILbn;)I")
    public static int method905(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class49 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field368 += (var14 - arg3) * arg9.field361;
        arg9.field362 += (var14 - arg3) * arg9.field370;
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
        arg9.field360 = var12 >> 2;
        arg9.field366 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("bn.bc(I[B[IIIIIIIIIILbn;)I")
    public static int method906(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class49 arg12) {
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
        arg12.field360 += (var19 - arg4) * arg12.field356;
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
        arg12.field368 = var15 >> 2;
        arg12.field362 = var16 >> 2;
        arg12.field366 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("bn.bg([B[IIIIIIIILbn;)I")
    public static int method907(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class49 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field368 += (var14 - arg3) * arg9.field361;
        arg9.field362 += (var14 - arg3) * arg9.field370;
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
        arg9.field360 = var12 >> 2;
        arg9.field366 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("bn.cw(I[B[IIIIIIIIIILbn;)I")
    public static int method908(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class49 arg12) {
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
        arg12.field360 += (var19 - arg4) * arg12.field356;
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
        arg12.field368 = var15 >> 2;
        arg12.field362 = var16 >> 2;
        arg12.field366 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("bn.cf(II[B[IIIIIIIILbn;II)I")
    public static int method909(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class49 arg11, int arg12, int arg13) {
        arg11.field368 -= arg11.field361 * arg5;
        arg11.field362 -= arg11.field370 * arg5;
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
        arg11.field368 += arg11.field361 * arg5;
        arg11.field362 += arg11.field370 * arg5;
        arg11.field360 = arg6;
        arg11.field366 = arg4;
        return arg5;
    }

    @ObfuscatedName("bn.cm(II[B[IIIIIIIIIILbn;II)I")
    public static int method910(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class49 arg13, int arg14, int arg15) {
        arg13.field360 -= arg13.field356 * arg5;
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
        arg13.field360 += arg13.field356 * var27;
        arg13.field368 = arg6;
        arg13.field362 = arg7;
        arg13.field366 = arg4;
        return var27;
    }

    @ObfuscatedName("bn.cn(II[B[IIIIIIIILbn;II)I")
    public static int method969(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class49 arg11, int arg12, int arg13) {
        arg11.field368 -= arg11.field361 * arg5;
        arg11.field362 -= arg11.field370 * arg5;
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
        arg11.field368 += arg11.field361 * arg5;
        arg11.field362 += arg11.field370 * arg5;
        arg11.field360 = arg6;
        arg11.field366 = arg4;
        return arg5;
    }

    @ObfuscatedName("bn.cs(II[B[IIIIIIIIIILbn;II)I")
    public static int method956(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class49 arg13, int arg14, int arg15) {
        arg13.field360 -= arg13.field356 * arg5;
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
        arg13.field360 += arg13.field356 * var26;
        arg13.field368 = arg6;
        arg13.field362 = arg7;
        arg13.field366 = arg4;
        return var26;
    }
}
