package deob;

@ObfuscatedName("bl")
public class class48 extends class49 {

    @ObfuscatedName("bl.af")
    public int field350;

    @ObfuscatedName("bl.an")
    public int field349;

    @ObfuscatedName("bl.aw")
    public int field356;

    @ObfuscatedName("bl.ac")
    public int field351;

    @ObfuscatedName("bl.au")
    public int field352;

    @ObfuscatedName("bl.ab")
    public int field353;

    @ObfuscatedName("bl.aq")
    public int field354;

    @ObfuscatedName("bl.al")
    public int field361;

    @ObfuscatedName("bl.at")
    public int field360;

    @ObfuscatedName("bl.aa")
    public int field357;

    @ObfuscatedName("bl.ay")
    public boolean field358;

    @ObfuscatedName("bl.ao")
    public int field359;

    @ObfuscatedName("bl.ax")
    public int field355;

    @ObfuscatedName("bl.ai")
    public int field348;

    @ObfuscatedName("bl.ag")
    public int field362;

    @ObfuscatedName("bl.af(II)I")
    public static int method950(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("bl.an(II)I")
    public static int method873(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("bl.ba()I")
    public int method875() {
        int var1 = this.field352 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field361 == 0) {
            var2 -= this.field350 * var2 / (((class41) this.field365).field280.length << 8);
        } else if (this.field361 >= 0) {
            var2 -= this.field360 * var2 / ((class41) this.field365).field280.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    public class48(class41 arg0, int arg1, int arg2) {
        this.field365 = arg0;
        this.field360 = arg0.field284;
        this.field357 = arg0.field283;
        this.field358 = arg0.field281;
        this.field349 = arg1;
        this.field356 = arg2;
        this.field351 = 8192;
        this.field350 = 0;
        this.method878();
    }

    public class48(class41 arg0, int arg1, int arg2, int arg3) {
        this.field365 = arg0;
        this.field360 = arg0.field284;
        this.field357 = arg0.field283;
        this.field358 = arg0.field281;
        this.field349 = arg1;
        this.field356 = arg2;
        this.field351 = arg3;
        this.field350 = 0;
        this.method878();
    }

    @ObfuscatedName("bl.aw(Lbr;II)Lbl;")
    public static class48 method876(class41 arg0, int arg1, int arg2) {
        return arg0.field280 == null || arg0.field280.length == 0 ? null : new class48(arg0, (int) ((long) arg0.field282 * 256L * (long) arg1 / (long) (Statics.field307 * 100)), arg2 << 6);
    }

    @ObfuscatedName("bl.ac(Lbr;III)Lbl;")
    public static class48 method937(class41 arg0, int arg1, int arg2, int arg3) {
        return arg0.field280 == null || arg0.field280.length == 0 ? null : new class48(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("bl.au()V")
    public void method878() {
        this.field352 = this.field356;
        this.field353 = method950(this.field356, this.field351);
        this.field354 = method873(this.field356, this.field351);
    }

    @ObfuscatedName("bl.aa(I)V")
    public synchronized void method879(int arg0) {
        this.field361 = arg0;
    }

    @ObfuscatedName("bl.ao(I)V")
    public synchronized void method938(int arg0) {
        this.method882(arg0 << 6, this.method910());
    }

    @ObfuscatedName("bl.ax(I)V")
    public synchronized void method881(int arg0) {
        this.method882(arg0, this.method910());
    }

    @ObfuscatedName("bl.ai(II)V")
    public synchronized void method882(int arg0, int arg1) {
        this.field356 = arg0;
        this.field351 = arg1;
        this.field359 = 0;
        this.method878();
    }

    @ObfuscatedName("bl.ag()I")
    public synchronized int method883() {
        return this.field356 == Integer.MIN_VALUE ? 0 : this.field356;
    }

    @ObfuscatedName("bl.ah()I")
    public synchronized int method910() {
        return this.field351 < 0 ? -1 : this.field351;
    }

    @ObfuscatedName("bl.av(I)V")
    public synchronized void method884(int arg0) {
        int var2 = ((class41) this.field365).field280.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field350 = arg0;
    }

    @ObfuscatedName("bl.ar(Z)V")
    public synchronized void method885(boolean arg0) {
        this.field349 = (this.field349 >>> 31) + (this.field349 ^ this.field349 >> 31);
        if (arg0) {
            this.field349 = -this.field349;
        }
    }

    @ObfuscatedName("bl.am()V")
    public void method886() {
        if (this.field359 == 0) {
            return;
        }
        if (this.field356 == Integer.MIN_VALUE) {
            this.field356 = 0;
        }
        this.field359 = 0;
        this.method878();
    }

    @ObfuscatedName("bl.as(II)V")
    public synchronized void method971(int arg0, int arg1) {
        this.method888(arg0, arg1, this.method910());
    }

    @ObfuscatedName("bl.aj(III)V")
    public synchronized void method888(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method882(arg1, arg2);
            return;
        }
        int var4 = method950(arg1, arg2);
        int var5 = method873(arg1, arg2);
        if (this.field353 == var4 && this.field354 == var5) {
            this.field359 = 0;
            return;
        }
        int var6 = arg1 - this.field352;
        if (this.field352 - arg1 > var6) {
            var6 = this.field352 - arg1;
        }
        if (var4 - this.field353 > var6) {
            var6 = var4 - this.field353;
        }
        if (this.field353 - var4 > var6) {
            var6 = this.field353 - var4;
        }
        if (var5 - this.field354 > var6) {
            var6 = var5 - this.field354;
        }
        if (this.field354 - var5 > var6) {
            var6 = this.field354 - var5;
        }
        if (arg0 > var6) {
            arg0 = var6;
        }
        this.field359 = arg0;
        this.field356 = arg1;
        this.field351 = arg2;
        this.field355 = (arg1 - this.field352) / arg0;
        this.field348 = (var4 - this.field353) / arg0;
        this.field362 = (var5 - this.field354) / arg0;
    }

    @ObfuscatedName("bl.ak(I)V")
    public synchronized void method889(int arg0) {
        if (arg0 == 0) {
            this.method881(0);
            this.method7651();
        } else if (this.field353 == 0 && this.field354 == 0) {
            this.field359 = 0;
            this.field356 = 0;
            this.field352 = 0;
            this.method7651();
        } else {
            int var2 = -this.field352;
            if (this.field352 > var2) {
                var2 = this.field352;
            }
            if (-this.field353 > var2) {
                var2 = -this.field353;
            }
            if (this.field353 > var2) {
                var2 = this.field353;
            }
            if (-this.field354 > var2) {
                var2 = -this.field354;
            }
            if (this.field354 > var2) {
                var2 = this.field354;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field359 = arg0;
            this.field356 = Integer.MIN_VALUE;
            this.field355 = -this.field352 / arg0;
            this.field348 = -this.field353 / arg0;
            this.field362 = -this.field354 / arg0;
        }
    }

    @ObfuscatedName("bl.az(I)V")
    public synchronized void method890(int arg0) {
        if (this.field349 < 0) {
            this.field349 = -arg0;
        } else {
            this.field349 = arg0;
        }
    }

    @ObfuscatedName("bl.ad()I")
    public synchronized int method891() {
        return this.field349 < 0 ? -this.field349 : this.field349;
    }

    @ObfuscatedName("bl.ae()Z")
    public boolean method946() {
        return this.field350 < 0 || this.field350 >= ((class41) this.field365).field280.length << 8;
    }

    @ObfuscatedName("bl.ap()Z")
    public boolean method977() {
        return this.field359 != 0;
    }

    @ObfuscatedName("bl.ab()Lbp;")
    public class49 method726() {
        return null;
    }

    @ObfuscatedName("bl.aq()Lbp;")
    public class49 method727() {
        return null;
    }

    @ObfuscatedName("bl.al()I")
    public int method728() {
        return this.field356 == 0 && this.field359 == 0 ? 0 : 1;
    }

    @ObfuscatedName("bl.at([III)V")
    public synchronized void method729(int[] arg0, int arg1, int arg2) {
        if (this.field356 == 0 && this.field359 == 0) {
            this.method755(arg2);
            return;
        }
        class41 var4 = (class41) this.field365;
        int var5 = this.field360 << 8;
        int var6 = this.field357 << 8;
        int var7 = var4.field280.length << 8;
        int var8 = var6 - var5;
        if (var8 <= 0) {
            this.field361 = 0;
        }
        int var9 = arg1;
        int var10 = arg1 + arg2;
        if (this.field350 < 0) {
            if (this.field349 <= 0) {
                this.method886();
                this.method7651();
                return;
            }
            this.field350 = 0;
        }
        if (this.field350 >= var7) {
            if (this.field349 >= 0) {
                this.method886();
                this.method7651();
                return;
            }
            this.field350 = var7 - 1;
        }
        if (this.field361 >= 0) {
            if (this.field361 > 0) {
                if (this.field358) {
                    label131: {
                        if (this.field349 < 0) {
                            var9 = this.method897(arg0, arg1, var5, var10, var4.field280[this.field360]);
                            if (this.field350 >= var5) {
                                return;
                            }
                            this.field350 = var5 + var5 - 1 - this.field350;
                            this.field349 = -this.field349;
                            if (--this.field361 == 0) {
                                break label131;
                            }
                        }
                        do {
                            var9 = this.method896(arg0, var9, var6, var10, var4.field280[this.field357 - 1]);
                            if (this.field350 < var6) {
                                return;
                            }
                            this.field350 = var6 + var6 - 1 - this.field350;
                            this.field349 = -this.field349;
                            if (--this.field361 == 0) {
                                break;
                            }
                            var9 = this.method897(arg0, var9, var5, var10, var4.field280[this.field360]);
                            if (this.field350 >= var5) {
                                return;
                            }
                            this.field350 = var5 + var5 - 1 - this.field350;
                            this.field349 = -this.field349;
                        } while (--this.field361 != 0);
                    }
                } else if (this.field349 < 0) {
                    while (true) {
                        var9 = this.method897(arg0, var9, var5, var10, var4.field280[this.field357 - 1]);
                        if (this.field350 >= var5) {
                            return;
                        }
                        int var12 = (var6 - 1 - this.field350) / var8;
                        if (var12 >= this.field361) {
                            this.field350 += this.field361 * var8;
                            this.field361 = 0;
                            break;
                        }
                        this.field350 += var8 * var12;
                        this.field361 -= var12;
                    }
                } else {
                    while (true) {
                        var9 = this.method896(arg0, var9, var6, var10, var4.field280[this.field360]);
                        if (this.field350 < var6) {
                            return;
                        }
                        int var13 = (this.field350 - var5) / var8;
                        if (var13 >= this.field361) {
                            this.field350 -= this.field361 * var8;
                            this.field361 = 0;
                            break;
                        }
                        this.field350 -= var8 * var13;
                        this.field361 -= var13;
                    }
                }
            }
            if (this.field349 < 0) {
                this.method897(arg0, var9, 0, var10, 0);
                if (this.field350 < 0) {
                    this.field350 = -1;
                    this.method886();
                    this.method7651();
                }
            } else {
                this.method896(arg0, var9, var7, var10, 0);
                if (this.field350 >= var7) {
                    this.field350 = var7;
                    this.method886();
                    this.method7651();
                }
            }
        } else if (this.field358) {
            if (this.field349 < 0) {
                var9 = this.method897(arg0, arg1, var5, var10, var4.field280[this.field360]);
                if (this.field350 >= var5) {
                    return;
                }
                this.field350 = var5 + var5 - 1 - this.field350;
                this.field349 = -this.field349;
            }
            while (true) {
                int var11 = this.method896(arg0, var9, var6, var10, var4.field280[this.field357 - 1]);
                if (this.field350 < var6) {
                    return;
                }
                this.field350 = var6 + var6 - 1 - this.field350;
                this.field349 = -this.field349;
                var9 = this.method897(arg0, var11, var5, var10, var4.field280[this.field360]);
                if (this.field350 >= var5) {
                    return;
                }
                this.field350 = var5 + var5 - 1 - this.field350;
                this.field349 = -this.field349;
            }
        } else if (this.field349 < 0) {
            while (true) {
                var9 = this.method897(arg0, var9, var5, var10, var4.field280[this.field357 - 1]);
                if (this.field350 >= var5) {
                    return;
                }
                this.field350 = var6 - 1 - (var6 - 1 - this.field350) % var8;
            }
        } else {
            while (true) {
                var9 = this.method896(arg0, var9, var6, var10, var4.field280[this.field360]);
                if (this.field350 < var6) {
                    return;
                }
                this.field350 = (this.field350 - var5) % var8 + var5;
            }
        }
    }

    @ObfuscatedName("bl.ay(I)V")
    public synchronized void method755(int arg0) {
        if (this.field359 > 0) {
            if (arg0 >= this.field359) {
                if (this.field356 == Integer.MIN_VALUE) {
                    this.field356 = 0;
                    this.field354 = 0;
                    this.field353 = 0;
                    this.field352 = 0;
                    this.method7651();
                    arg0 = this.field359;
                }
                this.field359 = 0;
                this.method878();
            } else {
                this.field352 += this.field355 * arg0;
                this.field353 += this.field348 * arg0;
                this.field354 += this.field362 * arg0;
                this.field359 -= arg0;
            }
        }
        class41 var2 = (class41) this.field365;
        int var3 = this.field360 << 8;
        int var4 = this.field357 << 8;
        int var5 = var2.field280.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field361 = 0;
        }
        if (this.field350 < 0) {
            if (this.field349 <= 0) {
                this.method886();
                this.method7651();
                return;
            }
            this.field350 = 0;
        }
        if (this.field350 >= var5) {
            if (this.field349 >= 0) {
                this.method886();
                this.method7651();
                return;
            }
            this.field350 = var5 - 1;
        }
        this.field350 += this.field349 * arg0;
        if (this.field361 >= 0) {
            if (this.field361 > 0) {
                if (this.field358) {
                    label121: {
                        if (this.field349 < 0) {
                            if (this.field350 >= var3) {
                                return;
                            }
                            this.field350 = var3 + var3 - 1 - this.field350;
                            this.field349 = -this.field349;
                            if (--this.field361 == 0) {
                                break label121;
                            }
                        }
                        do {
                            if (this.field350 < var4) {
                                return;
                            }
                            this.field350 = var4 + var4 - 1 - this.field350;
                            this.field349 = -this.field349;
                            if (--this.field361 == 0) {
                                break;
                            }
                            if (this.field350 >= var3) {
                                return;
                            }
                            this.field350 = var3 + var3 - 1 - this.field350;
                            this.field349 = -this.field349;
                        } while (--this.field361 != 0);
                    }
                } else {
                    label153: {
                        if (this.field349 < 0) {
                            if (this.field350 >= var3) {
                                return;
                            }
                            int var7 = (var4 - 1 - this.field350) / var6;
                            if (var7 >= this.field361) {
                                this.field350 += this.field361 * var6;
                                this.field361 = 0;
                                break label153;
                            }
                            this.field350 += var6 * var7;
                            this.field361 -= var7;
                        } else if (this.field350 >= var4) {
                            int var8 = (this.field350 - var3) / var6;
                            if (var8 >= this.field361) {
                                this.field350 -= this.field361 * var6;
                                this.field361 = 0;
                                break label153;
                            }
                            this.field350 -= var6 * var8;
                            this.field361 -= var8;
                        } else {
                            return;
                        }
                        return;
                    }
                }
            }
            if (this.field349 < 0) {
                if (this.field350 < 0) {
                    this.field350 = -1;
                    this.method886();
                    this.method7651();
                }
            } else if (this.field350 >= var5) {
                this.field350 = var5;
                this.method886();
                this.method7651();
            }
        } else if (this.field358) {
            if (this.field349 < 0) {
                if (this.field350 >= var3) {
                    return;
                }
                this.field350 = var3 + var3 - 1 - this.field350;
                this.field349 = -this.field349;
            }
            while (this.field350 >= var4) {
                this.field350 = var4 + var4 - 1 - this.field350;
                this.field349 = -this.field349;
                if (this.field350 >= var3) {
                    return;
                }
                this.field350 = var3 + var3 - 1 - this.field350;
                this.field349 = -this.field349;
            }
        } else if (this.field349 < 0) {
            if (this.field350 >= var3) {
                return;
            }
            this.field350 = var4 - 1 - (var4 - 1 - this.field350) % var6;
        } else if (this.field350 >= var4) {
            this.field350 = (this.field350 - var3) % var6 + var3;
        } else {
            return;
        }
    }

    @ObfuscatedName("bl.by([IIIII)I")
    public int method896(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field359 > 0) {
                int var6 = this.field359 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field359 += arg1;
                if (this.field349 == 256 && (this.field350 & 0xFF) == 0) {
                    if (Statics.field314) {
                        arg1 = method924(0, ((class41) this.field365).field280, arg0, this.field350, arg1, this.field353, this.field354, this.field348, this.field362, 0, var6, arg2, this);
                    } else {
                        arg1 = method917(((class41) this.field365).field280, arg0, this.field350, arg1, this.field352, this.field355, 0, var6, arg2, this);
                    }
                } else if (Statics.field314) {
                    arg1 = method987(0, 0, ((class41) this.field365).field280, arg0, this.field350, arg1, this.field353, this.field354, this.field348, this.field362, 0, var6, arg2, this, this.field349, arg4);
                } else {
                    arg1 = method887(0, 0, ((class41) this.field365).field280, arg0, this.field350, arg1, this.field352, this.field355, 0, var6, arg2, this, this.field349, arg4);
                }
                this.field359 -= arg1;
                if (this.field359 != 0) {
                    return arg1;
                }
                if (!this.method898()) {
                    continue;
                }
                return arg3;
            }
            if (this.field349 == 256 && (this.field350 & 0xFF) == 0) {
                if (Statics.field314) {
                    return method900(0, ((class41) this.field365).field280, arg0, this.field350, arg1, this.field353, this.field354, 0, arg3, arg2, this);
                }
                return method899(((class41) this.field365).field280, arg0, this.field350, arg1, this.field352, 0, arg3, arg2, this);
            }
            if (Statics.field314) {
                return method904(0, 0, ((class41) this.field365).field280, arg0, this.field350, arg1, this.field353, this.field354, 0, arg3, arg2, this, this.field349, arg4);
            }
            return method903(0, 0, ((class41) this.field365).field280, arg0, this.field350, arg1, this.field352, 0, arg3, arg2, this, this.field349, arg4);
        }
    }

    @ObfuscatedName("bl.bn([IIIII)I")
    public int method897(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field359 > 0) {
                int var6 = this.field359 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field359 += arg1;
                if (this.field349 == -256 && (this.field350 & 0xFF) == 0) {
                    if (Statics.field314) {
                        arg1 = method931(0, ((class41) this.field365).field280, arg0, this.field350, arg1, this.field353, this.field354, this.field348, this.field362, 0, var6, arg2, this);
                    } else {
                        arg1 = method908(((class41) this.field365).field280, arg0, this.field350, arg1, this.field352, this.field355, 0, var6, arg2, this);
                    }
                } else if (Statics.field314) {
                    arg1 = method912(0, 0, ((class41) this.field365).field280, arg0, this.field350, arg1, this.field353, this.field354, this.field348, this.field362, 0, var6, arg2, this, this.field349, arg4);
                } else {
                    arg1 = method911(0, 0, ((class41) this.field365).field280, arg0, this.field350, arg1, this.field352, this.field355, 0, var6, arg2, this, this.field349, arg4);
                }
                this.field359 -= arg1;
                if (this.field359 != 0) {
                    return arg1;
                }
                if (!this.method898()) {
                    continue;
                }
                return arg3;
            }
            if (this.field349 == -256 && (this.field350 & 0xFF) == 0) {
                if (Statics.field314) {
                    return method914(0, ((class41) this.field365).field280, arg0, this.field350, arg1, this.field353, this.field354, 0, arg3, arg2, this);
                }
                return method901(((class41) this.field365).field280, arg0, this.field350, arg1, this.field352, 0, arg3, arg2, this);
            }
            if (Statics.field314) {
                return method906(0, 0, ((class41) this.field365).field280, arg0, this.field350, arg1, this.field353, this.field354, 0, arg3, arg2, this, this.field349, arg4);
            }
            return method905(0, 0, ((class41) this.field365).field280, arg0, this.field350, arg1, this.field352, 0, arg3, arg2, this, this.field349, arg4);
        }
    }

    @ObfuscatedName("bl.bs()Z")
    public boolean method898() {
        int var1 = this.field356;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method950(var1, this.field351);
            var2 = method873(var1, this.field351);
        }
        if (this.field352 != var1 || this.field353 != var3 || this.field354 != var2) {
            if (this.field352 < var1) {
                this.field355 = 1;
                this.field359 = var1 - this.field352;
            } else if (this.field352 > var1) {
                this.field355 = -1;
                this.field359 = this.field352 - var1;
            } else {
                this.field355 = 0;
            }
            if (this.field353 < var3) {
                this.field348 = 1;
                if (this.field359 == 0 || this.field359 > var3 - this.field353) {
                    this.field359 = var3 - this.field353;
                }
            } else if (this.field353 > var3) {
                this.field348 = -1;
                if (this.field359 == 0 || this.field359 > this.field353 - var3) {
                    this.field359 = this.field353 - var3;
                }
            } else {
                this.field348 = 0;
            }
            if (this.field354 < var2) {
                this.field362 = 1;
                if (this.field359 == 0 || this.field359 > var2 - this.field354) {
                    this.field359 = var2 - this.field354;
                }
            } else if (this.field354 > var2) {
                this.field362 = -1;
                if (this.field359 == 0 || this.field359 > this.field354 - var2) {
                    this.field359 = this.field354 - var2;
                }
            } else {
                this.field362 = 0;
            }
            return false;
        } else if (this.field356 == Integer.MIN_VALUE) {
            this.field356 = 0;
            this.field354 = 0;
            this.field353 = 0;
            this.field352 = 0;
            this.method7651();
            return true;
        } else {
            this.method878();
            return false;
        }
    }

    @ObfuscatedName("bl.br([B[IIIIIIILbl;)I")
    public static int method899(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class48 arg8) {
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
        arg8.field350 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("bl.bq(I[B[IIIIIIIILbl;)I")
    public static int method900(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class48 arg10) {
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
        arg10.field350 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("bl.bv([B[IIIIIIILbl;)I")
    public static int method901(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class48 arg8) {
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
        arg8.field350 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("bl.bl(I[B[IIIIIIIILbl;)I")
    public static int method914(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class48 arg10) {
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
        arg10.field350 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("bl.bp(II[B[IIIIIIILbl;II)I")
    public static int method903(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class48 arg10, int arg11, int arg12) {
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
        arg10.field350 = arg4;
        return arg5;
    }

    @ObfuscatedName("bl.bc(II[B[IIIIIIIILbl;II)I")
    public static int method904(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class48 arg11, int arg12, int arg13) {
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
        arg11.field350 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("bl.bh(II[B[IIIIIIILbl;II)I")
    public static int method905(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class48 arg10, int arg11, int arg12) {
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
        arg10.field350 = arg4;
        return arg5;
    }

    @ObfuscatedName("bl.bw(II[B[IIIIIIIILbl;II)I")
    public static int method906(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class48 arg11, int arg12, int arg13) {
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
        arg11.field350 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("bl.ce([B[IIIIIIIILbl;)I")
    public static int method917(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class48 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field353 += (var14 - arg3) * arg9.field348;
        arg9.field354 += (var14 - arg3) * arg9.field362;
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
        arg9.field352 = var12 >> 2;
        arg9.field350 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("bl.ci(I[B[IIIIIIIIIILbl;)I")
    public static int method924(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class48 arg12) {
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
        arg12.field352 += (var19 - arg4) * arg12.field355;
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
        arg12.field353 = var15 >> 2;
        arg12.field354 = var16 >> 2;
        arg12.field350 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("bl.cs([B[IIIIIIIILbl;)I")
    public static int method908(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class48 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field353 += (var14 - arg3) * arg9.field348;
        arg9.field354 += (var14 - arg3) * arg9.field362;
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
        arg9.field352 = var12 >> 2;
        arg9.field350 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("bl.cc(I[B[IIIIIIIIIILbl;)I")
    public static int method931(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class48 arg12) {
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
        arg12.field352 += (var19 - arg4) * arg12.field355;
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
        arg12.field353 = var15 >> 2;
        arg12.field354 = var16 >> 2;
        arg12.field350 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("bl.cn(II[B[IIIIIIIILbl;II)I")
    public static int method887(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class48 arg11, int arg12, int arg13) {
        arg11.field353 -= arg11.field348 * arg5;
        arg11.field354 -= arg11.field362 * arg5;
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
        arg11.field353 += arg11.field348 * arg5;
        arg11.field354 += arg11.field362 * arg5;
        arg11.field352 = arg6;
        arg11.field350 = arg4;
        return arg5;
    }

    @ObfuscatedName("bl.ca(II[B[IIIIIIIIIILbl;II)I")
    public static int method987(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class48 arg13, int arg14, int arg15) {
        arg13.field352 -= arg13.field355 * arg5;
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
        arg13.field352 += arg13.field355 * var27;
        arg13.field353 = arg6;
        arg13.field354 = arg7;
        arg13.field350 = arg4;
        return var27;
    }

    @ObfuscatedName("bl.cu(II[B[IIIIIIIILbl;II)I")
    public static int method911(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class48 arg11, int arg12, int arg13) {
        arg11.field353 -= arg11.field348 * arg5;
        arg11.field354 -= arg11.field362 * arg5;
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
        arg11.field353 += arg11.field348 * arg5;
        arg11.field354 += arg11.field362 * arg5;
        arg11.field352 = arg6;
        arg11.field350 = arg4;
        return arg5;
    }

    @ObfuscatedName("bl.ck(II[B[IIIIIIIIIILbl;II)I")
    public static int method912(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class48 arg13, int arg14, int arg15) {
        arg13.field352 -= arg13.field355 * arg5;
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
        arg13.field352 += arg13.field355 * var26;
        arg13.field353 = arg6;
        arg13.field354 = arg7;
        arg13.field350 = arg4;
        return var26;
    }
}
