package deob;

@ObfuscatedName("bx")
public class class49 extends class50 {

    @ObfuscatedName("bx.ac")
    public int field351;

    @ObfuscatedName("bx.al")
    public int field352;

    @ObfuscatedName("bx.ak")
    public int field362;

    @ObfuscatedName("bx.ax")
    public int field354;

    @ObfuscatedName("bx.ao")
    public int field355;

    @ObfuscatedName("bx.ah")
    public int field356;

    @ObfuscatedName("bx.ar")
    public int field357;

    @ObfuscatedName("bx.ab")
    public int field358;

    @ObfuscatedName("bx.am")
    public int field359;

    @ObfuscatedName("bx.av")
    public int field353;

    @ObfuscatedName("bx.ag")
    public boolean field361;

    @ObfuscatedName("bx.aa")
    public int field360;

    @ObfuscatedName("bx.ap")
    public int field363;

    @ObfuscatedName("bx.ay")
    public int field364;

    @ObfuscatedName("bx.as")
    public int field365;

    @ObfuscatedName("bx.ac(II)I")
    public static int method963(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("bx.al(II)I")
    public static int method969(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("bx.bs()I")
    public int method845() {
        int var1 = this.field355 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field358 == 0) {
            var2 -= this.field351 * var2 / (((class41) this.field368).field279.length << 8);
        } else if (this.field358 >= 0) {
            var2 -= this.field359 * var2 / ((class41) this.field368).field279.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    public class49(class41 arg0, int arg1, int arg2) {
        this.field368 = arg0;
        this.field359 = arg0.field277;
        this.field353 = arg0.field276;
        this.field361 = arg0.field280;
        this.field352 = arg1;
        this.field362 = arg2;
        this.field354 = 8192;
        this.field351 = 0;
        this.method848();
    }

    public class49(class41 arg0, int arg1, int arg2, int arg3) {
        this.field368 = arg0;
        this.field359 = arg0.field277;
        this.field353 = arg0.field276;
        this.field361 = arg0.field280;
        this.field352 = arg1;
        this.field362 = arg2;
        this.field354 = arg3;
        this.field351 = 0;
        this.method848();
    }

    @ObfuscatedName("bx.ak(Lbs;II)Lbx;")
    public static class49 method879(class41 arg0, int arg1, int arg2) {
        return arg0.field279 == null || arg0.field279.length == 0 ? null : new class49(arg0, (int) ((long) arg0.field278 * 256L * (long) arg1 / (long) (Statics.field307 * 100)), arg2 << 6);
    }

    @ObfuscatedName("bx.ax(Lbs;III)Lbx;")
    public static class49 method896(class41 arg0, int arg1, int arg2, int arg3) {
        return arg0.field279 == null || arg0.field279.length == 0 ? null : new class49(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("bx.ao()V")
    public void method848() {
        this.field355 = this.field362;
        this.field356 = method963(this.field362, this.field354);
        this.field357 = method969(this.field362, this.field354);
    }

    @ObfuscatedName("bx.av(I)V")
    public synchronized void method867(int arg0) {
        this.field358 = arg0;
    }

    @ObfuscatedName("bx.aa(I)V")
    public synchronized void method850(int arg0) {
        this.method964(arg0 << 6, this.method882());
    }

    @ObfuscatedName("bx.ap(I)V")
    public synchronized void method851(int arg0) {
        this.method964(arg0, this.method882());
    }

    @ObfuscatedName("bx.ay(II)V")
    public synchronized void method964(int arg0, int arg1) {
        this.field362 = arg0;
        this.field354 = arg1;
        this.field360 = 0;
        this.method848();
    }

    @ObfuscatedName("bx.as()I")
    public synchronized int method853() {
        return this.field362 == Integer.MIN_VALUE ? 0 : this.field362;
    }

    @ObfuscatedName("bx.aj()I")
    public synchronized int method882() {
        return this.field354 < 0 ? -1 : this.field354;
    }

    @ObfuscatedName("bx.an(I)V")
    public synchronized void method855(int arg0) {
        int var2 = ((class41) this.field368).field279.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field351 = arg0;
    }

    @ObfuscatedName("bx.au(Z)V")
    public synchronized void method856(boolean arg0) {
        this.field352 = (this.field352 >>> 31) + (this.field352 ^ this.field352 >> 31);
        if (arg0) {
            this.field352 = -this.field352;
        }
    }

    @ObfuscatedName("bx.ai()V")
    public void method868() {
        if (this.field360 == 0) {
            return;
        }
        if (this.field362 == Integer.MIN_VALUE) {
            this.field362 = 0;
        }
        this.field360 = 0;
        this.method848();
    }

    @ObfuscatedName("bx.ae(II)V")
    public synchronized void method858(int arg0, int arg1) {
        this.method859(arg0, arg1, this.method882());
    }

    @ObfuscatedName("bx.aw(III)V")
    public synchronized void method859(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method964(arg1, arg2);
            return;
        }
        int var4 = method963(arg1, arg2);
        int var5 = method969(arg1, arg2);
        if (this.field356 == var4 && this.field357 == var5) {
            this.field360 = 0;
            return;
        }
        int var6 = arg1 - this.field355;
        if (this.field355 - arg1 > var6) {
            var6 = this.field355 - arg1;
        }
        if (var4 - this.field356 > var6) {
            var6 = var4 - this.field356;
        }
        if (this.field356 - var4 > var6) {
            var6 = this.field356 - var4;
        }
        if (var5 - this.field357 > var6) {
            var6 = var5 - this.field357;
        }
        if (this.field357 - var5 > var6) {
            var6 = this.field357 - var5;
        }
        if (arg0 > var6) {
            arg0 = var6;
        }
        this.field360 = arg0;
        this.field362 = arg1;
        this.field354 = arg2;
        this.field363 = (arg1 - this.field355) / arg0;
        this.field364 = (var4 - this.field356) / arg0;
        this.field365 = (var5 - this.field357) / arg0;
    }

    @ObfuscatedName("bx.aq(I)V")
    public synchronized void method860(int arg0) {
        if (arg0 == 0) {
            this.method851(0);
            this.method7776();
        } else if (this.field356 == 0 && this.field357 == 0) {
            this.field360 = 0;
            this.field362 = 0;
            this.field355 = 0;
            this.method7776();
        } else {
            int var2 = -this.field355;
            if (this.field355 > var2) {
                var2 = this.field355;
            }
            if (-this.field356 > var2) {
                var2 = -this.field356;
            }
            if (this.field356 > var2) {
                var2 = this.field356;
            }
            if (-this.field357 > var2) {
                var2 = -this.field357;
            }
            if (this.field357 > var2) {
                var2 = this.field357;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field360 = arg0;
            this.field362 = Integer.MIN_VALUE;
            this.field363 = -this.field355 / arg0;
            this.field364 = -this.field356 / arg0;
            this.field365 = -this.field357 / arg0;
        }
    }

    @ObfuscatedName("bx.bb(I)V")
    public synchronized void method861(int arg0) {
        if (this.field352 < 0) {
            this.field352 = -arg0;
        } else {
            this.field352 = arg0;
        }
    }

    @ObfuscatedName("bx.bo()I")
    public synchronized int method862() {
        return this.field352 < 0 ? -this.field352 : this.field352;
    }

    @ObfuscatedName("bx.bp()Z")
    public boolean method863() {
        return this.field351 < 0 || this.field351 >= ((class41) this.field368).field279.length << 8;
    }

    @ObfuscatedName("bx.bm()Z")
    public boolean method870() {
        return this.field360 != 0;
    }

    @ObfuscatedName("bx.ah()Lbi;")
    public class50 method696() {
        return null;
    }

    @ObfuscatedName("bx.ar()Lbi;")
    public class50 method729() {
        return null;
    }

    @ObfuscatedName("bx.ab()I")
    public int method698() {
        return this.field362 == 0 && this.field360 == 0 ? 0 : 1;
    }

    @ObfuscatedName("bx.am([III)V")
    public synchronized void method699(int[] arg0, int arg1, int arg2) {
        if (this.field362 == 0 && this.field360 == 0) {
            this.method691(arg2);
            return;
        }
        class41 var4 = (class41) this.field368;
        int var5 = this.field359 << 8;
        int var6 = this.field353 << 8;
        int var7 = var4.field279.length << 8;
        int var8 = var6 - var5;
        if (var8 <= 0) {
            this.field358 = 0;
        }
        int var9 = arg1;
        int var10 = arg1 + arg2;
        if (this.field351 < 0) {
            if (this.field352 <= 0) {
                this.method868();
                this.method7776();
                return;
            }
            this.field351 = 0;
        }
        if (this.field351 >= var7) {
            if (this.field352 >= 0) {
                this.method868();
                this.method7776();
                return;
            }
            this.field351 = var7 - 1;
        }
        if (this.field358 >= 0) {
            if (this.field358 > 0) {
                if (this.field361) {
                    label131: {
                        if (this.field352 < 0) {
                            var9 = this.method975(arg0, arg1, var5, var10, var4.field279[this.field359]);
                            if (this.field351 >= var5) {
                                return;
                            }
                            this.field351 = var5 + var5 - 1 - this.field351;
                            this.field352 = -this.field352;
                            if (--this.field358 == 0) {
                                break label131;
                            }
                        }
                        do {
                            var9 = this.method934(arg0, var9, var6, var10, var4.field279[this.field353 - 1]);
                            if (this.field351 < var6) {
                                return;
                            }
                            this.field351 = var6 + var6 - 1 - this.field351;
                            this.field352 = -this.field352;
                            if (--this.field358 == 0) {
                                break;
                            }
                            var9 = this.method975(arg0, var9, var5, var10, var4.field279[this.field359]);
                            if (this.field351 >= var5) {
                                return;
                            }
                            this.field351 = var5 + var5 - 1 - this.field351;
                            this.field352 = -this.field352;
                        } while (--this.field358 != 0);
                    }
                } else if (this.field352 < 0) {
                    while (true) {
                        var9 = this.method975(arg0, var9, var5, var10, var4.field279[this.field353 - 1]);
                        if (this.field351 >= var5) {
                            return;
                        }
                        int var12 = (var6 - 1 - this.field351) / var8;
                        if (var12 >= this.field358) {
                            this.field351 += this.field358 * var8;
                            this.field358 = 0;
                            break;
                        }
                        this.field351 += var8 * var12;
                        this.field358 -= var12;
                    }
                } else {
                    while (true) {
                        var9 = this.method934(arg0, var9, var6, var10, var4.field279[this.field359]);
                        if (this.field351 < var6) {
                            return;
                        }
                        int var13 = (this.field351 - var5) / var8;
                        if (var13 >= this.field358) {
                            this.field351 -= this.field358 * var8;
                            this.field358 = 0;
                            break;
                        }
                        this.field351 -= var8 * var13;
                        this.field358 -= var13;
                    }
                }
            }
            if (this.field352 < 0) {
                this.method975(arg0, var9, 0, var10, 0);
                if (this.field351 < 0) {
                    this.field351 = -1;
                    this.method868();
                    this.method7776();
                }
            } else {
                this.method934(arg0, var9, var7, var10, 0);
                if (this.field351 >= var7) {
                    this.field351 = var7;
                    this.method868();
                    this.method7776();
                }
            }
        } else if (this.field361) {
            if (this.field352 < 0) {
                var9 = this.method975(arg0, arg1, var5, var10, var4.field279[this.field359]);
                if (this.field351 >= var5) {
                    return;
                }
                this.field351 = var5 + var5 - 1 - this.field351;
                this.field352 = -this.field352;
            }
            while (true) {
                int var11 = this.method934(arg0, var9, var6, var10, var4.field279[this.field353 - 1]);
                if (this.field351 < var6) {
                    return;
                }
                this.field351 = var6 + var6 - 1 - this.field351;
                this.field352 = -this.field352;
                var9 = this.method975(arg0, var11, var5, var10, var4.field279[this.field359]);
                if (this.field351 >= var5) {
                    return;
                }
                this.field351 = var5 + var5 - 1 - this.field351;
                this.field352 = -this.field352;
            }
        } else if (this.field352 < 0) {
            while (true) {
                var9 = this.method975(arg0, var9, var5, var10, var4.field279[this.field353 - 1]);
                if (this.field351 >= var5) {
                    return;
                }
                this.field351 = var6 - 1 - (var6 - 1 - this.field351) % var8;
            }
        } else {
            while (true) {
                var9 = this.method934(arg0, var9, var6, var10, var4.field279[this.field359]);
                if (this.field351 < var6) {
                    return;
                }
                this.field351 = (this.field351 - var5) % var8 + var5;
            }
        }
    }

    @ObfuscatedName("bx.ag(I)V")
    public synchronized void method691(int arg0) {
        if (this.field360 > 0) {
            if (arg0 >= this.field360) {
                if (this.field362 == Integer.MIN_VALUE) {
                    this.field362 = 0;
                    this.field357 = 0;
                    this.field356 = 0;
                    this.field355 = 0;
                    this.method7776();
                    arg0 = this.field360;
                }
                this.field360 = 0;
                this.method848();
            } else {
                this.field355 += this.field363 * arg0;
                this.field356 += this.field364 * arg0;
                this.field357 += this.field365 * arg0;
                this.field360 -= arg0;
            }
        }
        class41 var2 = (class41) this.field368;
        int var3 = this.field359 << 8;
        int var4 = this.field353 << 8;
        int var5 = var2.field279.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field358 = 0;
        }
        if (this.field351 < 0) {
            if (this.field352 <= 0) {
                this.method868();
                this.method7776();
                return;
            }
            this.field351 = 0;
        }
        if (this.field351 >= var5) {
            if (this.field352 >= 0) {
                this.method868();
                this.method7776();
                return;
            }
            this.field351 = var5 - 1;
        }
        this.field351 += this.field352 * arg0;
        if (this.field358 >= 0) {
            if (this.field358 > 0) {
                if (this.field361) {
                    label121: {
                        if (this.field352 < 0) {
                            if (this.field351 >= var3) {
                                return;
                            }
                            this.field351 = var3 + var3 - 1 - this.field351;
                            this.field352 = -this.field352;
                            if (--this.field358 == 0) {
                                break label121;
                            }
                        }
                        do {
                            if (this.field351 < var4) {
                                return;
                            }
                            this.field351 = var4 + var4 - 1 - this.field351;
                            this.field352 = -this.field352;
                            if (--this.field358 == 0) {
                                break;
                            }
                            if (this.field351 >= var3) {
                                return;
                            }
                            this.field351 = var3 + var3 - 1 - this.field351;
                            this.field352 = -this.field352;
                        } while (--this.field358 != 0);
                    }
                } else {
                    label153: {
                        if (this.field352 < 0) {
                            if (this.field351 >= var3) {
                                return;
                            }
                            int var7 = (var4 - 1 - this.field351) / var6;
                            if (var7 >= this.field358) {
                                this.field351 += this.field358 * var6;
                                this.field358 = 0;
                                break label153;
                            }
                            this.field351 += var6 * var7;
                            this.field358 -= var7;
                        } else if (this.field351 >= var4) {
                            int var8 = (this.field351 - var3) / var6;
                            if (var8 >= this.field358) {
                                this.field351 -= this.field358 * var6;
                                this.field358 = 0;
                                break label153;
                            }
                            this.field351 -= var6 * var8;
                            this.field358 -= var8;
                        } else {
                            return;
                        }
                        return;
                    }
                }
            }
            if (this.field352 < 0) {
                if (this.field351 < 0) {
                    this.field351 = -1;
                    this.method868();
                    this.method7776();
                }
            } else if (this.field351 >= var5) {
                this.field351 = var5;
                this.method868();
                this.method7776();
            }
        } else if (this.field361) {
            if (this.field352 < 0) {
                if (this.field351 >= var3) {
                    return;
                }
                this.field351 = var3 + var3 - 1 - this.field351;
                this.field352 = -this.field352;
            }
            while (this.field351 >= var4) {
                this.field351 = var4 + var4 - 1 - this.field351;
                this.field352 = -this.field352;
                if (this.field351 >= var3) {
                    return;
                }
                this.field351 = var3 + var3 - 1 - this.field351;
                this.field352 = -this.field352;
            }
        } else if (this.field352 < 0) {
            if (this.field351 >= var3) {
                return;
            }
            this.field351 = var4 - 1 - (var4 - 1 - this.field351) % var6;
        } else if (this.field351 >= var4) {
            this.field351 = (this.field351 - var3) % var6 + var3;
        } else {
            return;
        }
    }

    @ObfuscatedName("bx.br([IIIII)I")
    public int method934(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field360 > 0) {
                int var6 = this.field360 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field360 += arg1;
                if (this.field352 == 256 && (this.field351 & 0xFF) == 0) {
                    if (Statics.field3131) {
                        arg1 = method877(0, ((class41) this.field368).field279, arg0, this.field351, arg1, this.field356, this.field357, this.field364, this.field365, 0, var6, arg2, this);
                    } else {
                        arg1 = method895(((class41) this.field368).field279, arg0, this.field351, arg1, this.field355, this.field363, 0, var6, arg2, this);
                    }
                } else if (Statics.field3131) {
                    arg1 = method945(0, 0, ((class41) this.field368).field279, arg0, this.field351, arg1, this.field356, this.field357, this.field364, this.field365, 0, var6, arg2, this, this.field352, arg4);
                } else {
                    arg1 = method887(0, 0, ((class41) this.field368).field279, arg0, this.field351, arg1, this.field355, this.field363, 0, var6, arg2, this, this.field352, arg4);
                }
                this.field360 -= arg1;
                if (this.field360 != 0) {
                    return arg1;
                }
                if (!this.method852()) {
                    continue;
                }
                return arg3;
            }
            if (this.field352 == 256 && (this.field351 & 0xFF) == 0) {
                if (Statics.field3131) {
                    return method986(0, ((class41) this.field368).field279, arg0, this.field351, arg1, this.field356, this.field357, 0, arg3, arg2, this);
                }
                return method869(((class41) this.field368).field279, arg0, this.field351, arg1, this.field355, 0, arg3, arg2, this);
            }
            if (Statics.field3131) {
                return method905(0, 0, ((class41) this.field368).field279, arg0, this.field351, arg1, this.field356, this.field357, 0, arg3, arg2, this, this.field352, arg4);
            }
            return method873(0, 0, ((class41) this.field368).field279, arg0, this.field351, arg1, this.field355, 0, arg3, arg2, this, this.field352, arg4);
        }
    }

    @ObfuscatedName("bx.bc([IIIII)I")
    public int method975(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field360 > 0) {
                int var6 = this.field360 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field360 += arg1;
                if (this.field352 == -256 && (this.field351 & 0xFF) == 0) {
                    if (Statics.field3131) {
                        arg1 = method878(0, ((class41) this.field368).field279, arg0, this.field351, arg1, this.field356, this.field357, this.field364, this.field365, 0, var6, arg2, this);
                    } else {
                        arg1 = method883(((class41) this.field368).field279, arg0, this.field351, arg1, this.field355, this.field363, 0, var6, arg2, this);
                    }
                } else if (Statics.field3131) {
                    arg1 = method843(0, 0, ((class41) this.field368).field279, arg0, this.field351, arg1, this.field356, this.field357, this.field364, this.field365, 0, var6, arg2, this, this.field352, arg4);
                } else {
                    arg1 = method935(0, 0, ((class41) this.field368).field279, arg0, this.field351, arg1, this.field355, this.field363, 0, var6, arg2, this, this.field352, arg4);
                }
                this.field360 -= arg1;
                if (this.field360 != 0) {
                    return arg1;
                }
                if (!this.method852()) {
                    continue;
                }
                return arg3;
            }
            if (this.field352 == -256 && (this.field351 & 0xFF) == 0) {
                if (Statics.field3131) {
                    return method910(0, ((class41) this.field368).field279, arg0, this.field351, arg1, this.field356, this.field357, 0, arg3, arg2, this);
                }
                return method871(((class41) this.field368).field279, arg0, this.field351, arg1, this.field355, 0, arg3, arg2, this);
            }
            if (Statics.field3131) {
                return method875(0, 0, ((class41) this.field368).field279, arg0, this.field351, arg1, this.field356, this.field357, 0, arg3, arg2, this, this.field352, arg4);
            }
            return method874(0, 0, ((class41) this.field368).field279, arg0, this.field351, arg1, this.field355, 0, arg3, arg2, this, this.field352, arg4);
        }
    }

    @ObfuscatedName("bx.bu()Z")
    public boolean method852() {
        int var1 = this.field362;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method963(var1, this.field354);
            var2 = method969(var1, this.field354);
        }
        if (this.field355 != var1 || this.field356 != var3 || this.field357 != var2) {
            if (this.field355 < var1) {
                this.field363 = 1;
                this.field360 = var1 - this.field355;
            } else if (this.field355 > var1) {
                this.field363 = -1;
                this.field360 = this.field355 - var1;
            } else {
                this.field363 = 0;
            }
            if (this.field356 < var3) {
                this.field364 = 1;
                if (this.field360 == 0 || this.field360 > var3 - this.field356) {
                    this.field360 = var3 - this.field356;
                }
            } else if (this.field356 > var3) {
                this.field364 = -1;
                if (this.field360 == 0 || this.field360 > this.field356 - var3) {
                    this.field360 = this.field356 - var3;
                }
            } else {
                this.field364 = 0;
            }
            if (this.field357 < var2) {
                this.field365 = 1;
                if (this.field360 == 0 || this.field360 > var2 - this.field357) {
                    this.field360 = var2 - this.field357;
                }
            } else if (this.field357 > var2) {
                this.field365 = -1;
                if (this.field360 == 0 || this.field360 > this.field357 - var2) {
                    this.field360 = this.field357 - var2;
                }
            } else {
                this.field365 = 0;
            }
            return false;
        } else if (this.field362 == Integer.MIN_VALUE) {
            this.field362 = 0;
            this.field357 = 0;
            this.field356 = 0;
            this.field355 = 0;
            this.method7776();
            return true;
        } else {
            this.method848();
            return false;
        }
    }

    @ObfuscatedName("bx.bf([B[IIIIIIILbx;)I")
    public static int method869(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class49 arg8) {
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
        arg8.field351 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("bx.bh(I[B[IIIIIIIILbx;)I")
    public static int method986(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class49 arg10) {
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
        arg10.field351 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("bx.bl([B[IIIIIIILbx;)I")
    public static int method871(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class49 arg8) {
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
        arg8.field351 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("bx.bg(I[B[IIIIIIIILbx;)I")
    public static int method910(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class49 arg10) {
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
        arg10.field351 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("bx.bj(II[B[IIIIIIILbx;II)I")
    public static int method873(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class49 arg10, int arg11, int arg12) {
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
        arg10.field351 = arg4;
        return arg5;
    }

    @ObfuscatedName("bx.bx(II[B[IIIIIIIILbx;II)I")
    public static int method905(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class49 arg11, int arg12, int arg13) {
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
        arg11.field351 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("bx.bi(II[B[IIIIIIILbx;II)I")
    public static int method874(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class49 arg10, int arg11, int arg12) {
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
        arg10.field351 = arg4;
        return arg5;
    }

    @ObfuscatedName("bx.bq(II[B[IIIIIIIILbx;II)I")
    public static int method875(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class49 arg11, int arg12, int arg13) {
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
        arg11.field351 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("bx.bw([B[IIIIIIIILbx;)I")
    public static int method895(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class49 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field356 += (var14 - arg3) * arg9.field364;
        arg9.field357 += (var14 - arg3) * arg9.field365;
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
        arg9.field355 = var12 >> 2;
        arg9.field351 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("bx.ce(I[B[IIIIIIIIIILbx;)I")
    public static int method877(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class49 arg12) {
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
        arg12.field355 += (var19 - arg4) * arg12.field363;
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
        arg12.field356 = var15 >> 2;
        arg12.field357 = var16 >> 2;
        arg12.field351 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("bx.cu([B[IIIIIIIILbx;)I")
    public static int method883(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class49 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field356 += (var14 - arg3) * arg9.field364;
        arg9.field357 += (var14 - arg3) * arg9.field365;
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
        arg9.field355 = var12 >> 2;
        arg9.field351 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("bx.cw(I[B[IIIIIIIIIILbx;)I")
    public static int method878(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class49 arg12) {
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
        arg12.field355 += (var19 - arg4) * arg12.field363;
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
        arg12.field356 = var15 >> 2;
        arg12.field357 = var16 >> 2;
        arg12.field351 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("bx.co(II[B[IIIIIIIILbx;II)I")
    public static int method887(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class49 arg11, int arg12, int arg13) {
        arg11.field356 -= arg11.field364 * arg5;
        arg11.field357 -= arg11.field365 * arg5;
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
        arg11.field356 += arg11.field364 * arg5;
        arg11.field357 += arg11.field365 * arg5;
        arg11.field355 = arg6;
        arg11.field351 = arg4;
        return arg5;
    }

    @ObfuscatedName("bx.cc(II[B[IIIIIIIIIILbx;II)I")
    public static int method945(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class49 arg13, int arg14, int arg15) {
        arg13.field355 -= arg13.field363 * arg5;
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
        arg13.field355 += arg13.field363 * var27;
        arg13.field356 = arg6;
        arg13.field357 = arg7;
        arg13.field351 = arg4;
        return var27;
    }

    @ObfuscatedName("bx.cg(II[B[IIIIIIIILbx;II)I")
    public static int method935(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class49 arg11, int arg12, int arg13) {
        arg11.field356 -= arg11.field364 * arg5;
        arg11.field357 -= arg11.field365 * arg5;
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
        arg11.field356 += arg11.field364 * arg5;
        arg11.field357 += arg11.field365 * arg5;
        arg11.field355 = arg6;
        arg11.field351 = arg4;
        return arg5;
    }

    @ObfuscatedName("bx.cq(II[B[IIIIIIIIIILbx;II)I")
    public static int method843(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class49 arg13, int arg14, int arg15) {
        arg13.field355 -= arg13.field363 * arg5;
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
        arg13.field355 += arg13.field363 * var26;
        arg13.field356 = arg6;
        arg13.field357 = arg7;
        arg13.field351 = arg4;
        return var26;
    }
}
