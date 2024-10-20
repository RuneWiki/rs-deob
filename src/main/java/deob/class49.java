package deob;

@ObfuscatedName("bs")
public class class49 extends class50 {

    @ObfuscatedName("bs.ab")
    public int field325;

    @ObfuscatedName("bs.ay")
    public int field319;

    @ObfuscatedName("bs.an")
    public int field328;

    @ObfuscatedName("bs.au")
    public int field317;

    @ObfuscatedName("bs.ax")
    public int field318;

    @ObfuscatedName("bs.ao")
    public int field314;

    @ObfuscatedName("bs.am")
    public int field320;

    @ObfuscatedName("bs.ac")
    public int field321;

    @ObfuscatedName("bs.ae")
    public int field322;

    @ObfuscatedName("bs.ad")
    public int field326;

    @ObfuscatedName("bs.aq")
    public boolean field324;

    @ObfuscatedName("bs.al")
    public int field323;

    @ObfuscatedName("bs.aj")
    public int field315;

    @ObfuscatedName("bs.as")
    public int field327;

    @ObfuscatedName("bs.aw")
    public int field316;

    @ObfuscatedName("bs.ab(II)I")
    public static int method826(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("bs.ay(II)I")
    public static int method851(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("bs.bv()I")
    public int method827() {
        int var1 = this.field318 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field321 == 0) {
            var2 -= this.field325 * var2 / (((class41) this.field329).field243.length << 8);
        } else if (this.field321 >= 0) {
            var2 -= this.field322 * var2 / ((class41) this.field329).field243.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    public class49(class41 arg0, int arg1, int arg2) {
        this.field329 = arg0;
        this.field322 = arg0.field244;
        this.field326 = arg0.field245;
        this.field324 = arg0.field242;
        this.field319 = arg1;
        this.field328 = arg2;
        this.field317 = 8192;
        this.field325 = 0;
        this.method868();
    }

    public class49(class41 arg0, int arg1, int arg2, int arg3) {
        this.field329 = arg0;
        this.field322 = arg0.field244;
        this.field326 = arg0.field245;
        this.field324 = arg0.field242;
        this.field319 = arg1;
        this.field328 = arg2;
        this.field317 = arg3;
        this.field325 = 0;
        this.method868();
    }

    @ObfuscatedName("bs.an(Lbq;II)Lbs;")
    public static class49 method829(class41 arg0, int arg1, int arg2) {
        return arg0.field243 == null || arg0.field243.length == 0 ? null : new class49(arg0, (int) ((long) arg0.field246 * 256L * (long) arg1 / (long) (Statics.field5137 * 100)), arg2 << 6);
    }

    @ObfuscatedName("bs.au(Lbq;III)Lbs;")
    public static class49 method830(class41 arg0, int arg1, int arg2, int arg3) {
        return arg0.field243 == null || arg0.field243.length == 0 ? null : new class49(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("bs.ax()V")
    public void method868() {
        this.field318 = this.field328;
        this.field314 = method826(this.field328, this.field317);
        this.field320 = method851(this.field328, this.field317);
    }

    @ObfuscatedName("bs.ad(I)V")
    public synchronized void method832(int arg0) {
        this.field321 = arg0;
    }

    @ObfuscatedName("bs.al(I)V")
    public synchronized void method833(int arg0) {
        this.method835(arg0 << 6, this.method837());
    }

    @ObfuscatedName("bs.aj(I)V")
    public synchronized void method834(int arg0) {
        this.method835(arg0, this.method837());
    }

    @ObfuscatedName("bs.as(II)V")
    public synchronized void method835(int arg0, int arg1) {
        this.field328 = arg0;
        this.field317 = arg1;
        this.field323 = 0;
        this.method868();
    }

    @ObfuscatedName("bs.aw()I")
    public synchronized int method831() {
        return this.field328 == Integer.MIN_VALUE ? 0 : this.field328;
    }

    @ObfuscatedName("bs.af()I")
    public synchronized int method837() {
        return this.field317 < 0 ? -1 : this.field317;
    }

    @ObfuscatedName("bs.aa(I)V")
    public synchronized void method931(int arg0) {
        int var2 = ((class41) this.field329).field243.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field325 = arg0;
    }

    @ObfuscatedName("bs.ah(Z)V")
    public synchronized void method922(boolean arg0) {
        this.field319 = (this.field319 >>> 31) + (this.field319 ^ this.field319 >> 31);
        if (arg0) {
            this.field319 = -this.field319;
        }
    }

    @ObfuscatedName("bs.ag()V")
    public void method892() {
        if (this.field323 == 0) {
            return;
        }
        if (this.field328 == Integer.MIN_VALUE) {
            this.field328 = 0;
        }
        this.field323 = 0;
        this.method868();
    }

    @ObfuscatedName("bs.av(II)V")
    public synchronized void method878(int arg0, int arg1) {
        this.method842(arg0, arg1, this.method837());
    }

    @ObfuscatedName("bs.ar(III)V")
    public synchronized void method842(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method835(arg1, arg2);
            return;
        }
        int var4 = method826(arg1, arg2);
        int var5 = method851(arg1, arg2);
        if (this.field314 == var4 && this.field320 == var5) {
            this.field323 = 0;
            return;
        }
        int var6 = arg1 - this.field318;
        if (this.field318 - arg1 > var6) {
            var6 = this.field318 - arg1;
        }
        if (var4 - this.field314 > var6) {
            var6 = var4 - this.field314;
        }
        if (this.field314 - var4 > var6) {
            var6 = this.field314 - var4;
        }
        if (var5 - this.field320 > var6) {
            var6 = var5 - this.field320;
        }
        if (this.field320 - var5 > var6) {
            var6 = this.field320 - var5;
        }
        if (arg0 > var6) {
            arg0 = var6;
        }
        this.field323 = arg0;
        this.field328 = arg1;
        this.field317 = arg2;
        this.field315 = (arg1 - this.field318) / arg0;
        this.field327 = (var4 - this.field314) / arg0;
        this.field316 = (var5 - this.field320) / arg0;
    }

    @ObfuscatedName("bs.ap(I)V")
    public synchronized void method962(int arg0) {
        if (arg0 == 0) {
            this.method834(0);
            this.method8218();
        } else if (this.field314 == 0 && this.field320 == 0) {
            this.field323 = 0;
            this.field328 = 0;
            this.field318 = 0;
            this.method8218();
        } else {
            int var2 = -this.field318;
            if (this.field318 > var2) {
                var2 = this.field318;
            }
            if (-this.field314 > var2) {
                var2 = -this.field314;
            }
            if (this.field314 > var2) {
                var2 = this.field314;
            }
            if (-this.field320 > var2) {
                var2 = -this.field320;
            }
            if (this.field320 > var2) {
                var2 = this.field320;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field323 = arg0;
            this.field328 = Integer.MIN_VALUE;
            this.field315 = -this.field318 / arg0;
            this.field327 = -this.field314 / arg0;
            this.field316 = -this.field320 / arg0;
        }
    }

    @ObfuscatedName("bs.ak(I)V")
    public synchronized void method844(int arg0) {
        if (this.field319 < 0) {
            this.field319 = -arg0;
        } else {
            this.field319 = arg0;
        }
    }

    @ObfuscatedName("bs.ai()I")
    public synchronized int method840() {
        return this.field319 < 0 ? -this.field319 : this.field319;
    }

    @ObfuscatedName("bs.bz()Z")
    public boolean method845() {
        return this.field325 < 0 || this.field325 >= ((class41) this.field329).field243.length << 8;
    }

    @ObfuscatedName("bs.bj()Z")
    public boolean method846() {
        return this.field323 != 0;
    }

    @ObfuscatedName("bs.ao()Lbb;")
    public class50 method705() {
        return null;
    }

    @ObfuscatedName("bs.am()Lbb;")
    public class50 method687() {
        return null;
    }

    @ObfuscatedName("bs.ac()I")
    public int method682() {
        return this.field328 == 0 && this.field323 == 0 ? 0 : 1;
    }

    @ObfuscatedName("bs.ae([III)V")
    public synchronized void method683(int[] arg0, int arg1, int arg2) {
        if (this.field328 == 0 && this.field323 == 0) {
            this.method693(arg2);
            return;
        }
        class41 var4 = (class41) this.field329;
        int var5 = this.field322 << 8;
        int var6 = this.field326 << 8;
        int var7 = var4.field243.length << 8;
        int var8 = var6 - var5;
        if (var8 <= 0) {
            this.field321 = 0;
        }
        int var9 = arg1;
        int var10 = arg1 + arg2;
        if (this.field325 < 0) {
            if (this.field319 <= 0) {
                this.method892();
                this.method8218();
                return;
            }
            this.field325 = 0;
        }
        if (this.field325 >= var7) {
            if (this.field319 >= 0) {
                this.method892();
                this.method8218();
                return;
            }
            this.field325 = var7 - 1;
        }
        if (this.field321 >= 0) {
            if (this.field321 > 0) {
                if (this.field324) {
                    label131: {
                        if (this.field319 < 0) {
                            var9 = this.method850(arg0, arg1, var5, var10, var4.field243[this.field322]);
                            if (this.field325 >= var5) {
                                return;
                            }
                            this.field325 = var5 + var5 - 1 - this.field325;
                            this.field319 = -this.field319;
                            if (--this.field321 == 0) {
                                break label131;
                            }
                        }
                        do {
                            var9 = this.method849(arg0, var9, var6, var10, var4.field243[this.field326 - 1]);
                            if (this.field325 < var6) {
                                return;
                            }
                            this.field325 = var6 + var6 - 1 - this.field325;
                            this.field319 = -this.field319;
                            if (--this.field321 == 0) {
                                break;
                            }
                            var9 = this.method850(arg0, var9, var5, var10, var4.field243[this.field322]);
                            if (this.field325 >= var5) {
                                return;
                            }
                            this.field325 = var5 + var5 - 1 - this.field325;
                            this.field319 = -this.field319;
                        } while (--this.field321 != 0);
                    }
                } else if (this.field319 < 0) {
                    while (true) {
                        var9 = this.method850(arg0, var9, var5, var10, var4.field243[this.field326 - 1]);
                        if (this.field325 >= var5) {
                            return;
                        }
                        int var12 = (var6 - 1 - this.field325) / var8;
                        if (var12 >= this.field321) {
                            this.field325 += this.field321 * var8;
                            this.field321 = 0;
                            break;
                        }
                        this.field325 += var8 * var12;
                        this.field321 -= var12;
                    }
                } else {
                    while (true) {
                        var9 = this.method849(arg0, var9, var6, var10, var4.field243[this.field322]);
                        if (this.field325 < var6) {
                            return;
                        }
                        int var13 = (this.field325 - var5) / var8;
                        if (var13 >= this.field321) {
                            this.field325 -= this.field321 * var8;
                            this.field321 = 0;
                            break;
                        }
                        this.field325 -= var8 * var13;
                        this.field321 -= var13;
                    }
                }
            }
            if (this.field319 < 0) {
                this.method850(arg0, var9, 0, var10, 0);
                if (this.field325 < 0) {
                    this.field325 = -1;
                    this.method892();
                    this.method8218();
                }
            } else {
                this.method849(arg0, var9, var7, var10, 0);
                if (this.field325 >= var7) {
                    this.field325 = var7;
                    this.method892();
                    this.method8218();
                }
            }
        } else if (this.field324) {
            if (this.field319 < 0) {
                var9 = this.method850(arg0, arg1, var5, var10, var4.field243[this.field322]);
                if (this.field325 >= var5) {
                    return;
                }
                this.field325 = var5 + var5 - 1 - this.field325;
                this.field319 = -this.field319;
            }
            while (true) {
                int var11 = this.method849(arg0, var9, var6, var10, var4.field243[this.field326 - 1]);
                if (this.field325 < var6) {
                    return;
                }
                this.field325 = var6 + var6 - 1 - this.field325;
                this.field319 = -this.field319;
                var9 = this.method850(arg0, var11, var5, var10, var4.field243[this.field322]);
                if (this.field325 >= var5) {
                    return;
                }
                this.field325 = var5 + var5 - 1 - this.field325;
                this.field319 = -this.field319;
            }
        } else if (this.field319 < 0) {
            while (true) {
                var9 = this.method850(arg0, var9, var5, var10, var4.field243[this.field326 - 1]);
                if (this.field325 >= var5) {
                    return;
                }
                this.field325 = var6 - 1 - (var6 - 1 - this.field325) % var8;
            }
        } else {
            while (true) {
                var9 = this.method849(arg0, var9, var6, var10, var4.field243[this.field322]);
                if (this.field325 < var6) {
                    return;
                }
                this.field325 = (this.field325 - var5) % var8 + var5;
            }
        }
    }

    @ObfuscatedName("bs.aq(I)V")
    public synchronized void method693(int arg0) {
        if (this.field323 > 0) {
            if (arg0 >= this.field323) {
                if (this.field328 == Integer.MIN_VALUE) {
                    this.field328 = 0;
                    this.field320 = 0;
                    this.field314 = 0;
                    this.field318 = 0;
                    this.method8218();
                    arg0 = this.field323;
                }
                this.field323 = 0;
                this.method868();
            } else {
                this.field318 += this.field315 * arg0;
                this.field314 += this.field327 * arg0;
                this.field320 += this.field316 * arg0;
                this.field323 -= arg0;
            }
        }
        class41 var2 = (class41) this.field329;
        int var3 = this.field322 << 8;
        int var4 = this.field326 << 8;
        int var5 = var2.field243.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field321 = 0;
        }
        if (this.field325 < 0) {
            if (this.field319 <= 0) {
                this.method892();
                this.method8218();
                return;
            }
            this.field325 = 0;
        }
        if (this.field325 >= var5) {
            if (this.field319 >= 0) {
                this.method892();
                this.method8218();
                return;
            }
            this.field325 = var5 - 1;
        }
        this.field325 += this.field319 * arg0;
        if (this.field321 >= 0) {
            if (this.field321 > 0) {
                if (this.field324) {
                    label121: {
                        if (this.field319 < 0) {
                            if (this.field325 >= var3) {
                                return;
                            }
                            this.field325 = var3 + var3 - 1 - this.field325;
                            this.field319 = -this.field319;
                            if (--this.field321 == 0) {
                                break label121;
                            }
                        }
                        do {
                            if (this.field325 < var4) {
                                return;
                            }
                            this.field325 = var4 + var4 - 1 - this.field325;
                            this.field319 = -this.field319;
                            if (--this.field321 == 0) {
                                break;
                            }
                            if (this.field325 >= var3) {
                                return;
                            }
                            this.field325 = var3 + var3 - 1 - this.field325;
                            this.field319 = -this.field319;
                        } while (--this.field321 != 0);
                    }
                } else {
                    label153: {
                        if (this.field319 < 0) {
                            if (this.field325 >= var3) {
                                return;
                            }
                            int var7 = (var4 - 1 - this.field325) / var6;
                            if (var7 >= this.field321) {
                                this.field325 += this.field321 * var6;
                                this.field321 = 0;
                                break label153;
                            }
                            this.field325 += var6 * var7;
                            this.field321 -= var7;
                        } else if (this.field325 >= var4) {
                            int var8 = (this.field325 - var3) / var6;
                            if (var8 >= this.field321) {
                                this.field325 -= this.field321 * var6;
                                this.field321 = 0;
                                break label153;
                            }
                            this.field325 -= var6 * var8;
                            this.field321 -= var8;
                        } else {
                            return;
                        }
                        return;
                    }
                }
            }
            if (this.field319 < 0) {
                if (this.field325 < 0) {
                    this.field325 = -1;
                    this.method892();
                    this.method8218();
                }
            } else if (this.field325 >= var5) {
                this.field325 = var5;
                this.method892();
                this.method8218();
            }
        } else if (this.field324) {
            if (this.field319 < 0) {
                if (this.field325 >= var3) {
                    return;
                }
                this.field325 = var3 + var3 - 1 - this.field325;
                this.field319 = -this.field319;
            }
            while (this.field325 >= var4) {
                this.field325 = var4 + var4 - 1 - this.field325;
                this.field319 = -this.field319;
                if (this.field325 >= var3) {
                    return;
                }
                this.field325 = var3 + var3 - 1 - this.field325;
                this.field319 = -this.field319;
            }
        } else if (this.field319 < 0) {
            if (this.field325 >= var3) {
                return;
            }
            this.field325 = var4 - 1 - (var4 - 1 - this.field325) % var6;
        } else if (this.field325 >= var4) {
            this.field325 = (this.field325 - var3) % var6 + var3;
        } else {
            return;
        }
    }

    @ObfuscatedName("bs.bc([IIIII)I")
    public int method849(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field323 > 0) {
                int var6 = this.field323 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field323 += arg1;
                if (this.field319 == 256 && (this.field325 & 0xFF) == 0) {
                    if (Statics.field5023) {
                        arg1 = method843(0, ((class41) this.field329).field243, arg0, this.field325, arg1, this.field314, this.field320, this.field327, this.field316, 0, var6, arg2, this);
                    } else {
                        arg1 = method860(((class41) this.field329).field243, arg0, this.field325, arg1, this.field318, this.field315, 0, var6, arg2, this);
                    }
                } else if (Statics.field5023) {
                    arg1 = method883(0, 0, ((class41) this.field329).field243, arg0, this.field325, arg1, this.field314, this.field320, this.field327, this.field316, 0, var6, arg2, this, this.field319, arg4);
                } else {
                    arg1 = method940(0, 0, ((class41) this.field329).field243, arg0, this.field325, arg1, this.field318, this.field315, 0, var6, arg2, this, this.field319, arg4);
                }
                this.field323 -= arg1;
                if (this.field323 != 0) {
                    return arg1;
                }
                if (!this.method920()) {
                    continue;
                }
                return arg3;
            }
            if (this.field319 == 256 && (this.field325 & 0xFF) == 0) {
                if (Statics.field5023) {
                    return method853(0, ((class41) this.field329).field243, arg0, this.field325, arg1, this.field314, this.field320, 0, arg3, arg2, this);
                }
                return method865(((class41) this.field329).field243, arg0, this.field325, arg1, this.field318, 0, arg3, arg2, this);
            }
            if (Statics.field5023) {
                return method836(0, 0, ((class41) this.field329).field243, arg0, this.field325, arg1, this.field314, this.field320, 0, arg3, arg2, this, this.field319, arg4);
            }
            return method856(0, 0, ((class41) this.field329).field243, arg0, this.field325, arg1, this.field318, 0, arg3, arg2, this, this.field319, arg4);
        }
    }

    @ObfuscatedName("bs.bm([IIIII)I")
    public int method850(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field323 > 0) {
                int var6 = this.field323 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field323 += arg1;
                if (this.field319 == -256 && (this.field325 & 0xFF) == 0) {
                    if (Statics.field5023) {
                        arg1 = method950(0, ((class41) this.field329).field243, arg0, this.field325, arg1, this.field314, this.field320, this.field327, this.field316, 0, var6, arg2, this);
                    } else {
                        arg1 = method869(((class41) this.field329).field243, arg0, this.field325, arg1, this.field318, this.field315, 0, var6, arg2, this);
                    }
                } else if (Statics.field5023) {
                    arg1 = method921(0, 0, ((class41) this.field329).field243, arg0, this.field325, arg1, this.field314, this.field320, this.field327, this.field316, 0, var6, arg2, this, this.field319, arg4);
                } else {
                    arg1 = method841(0, 0, ((class41) this.field329).field243, arg0, this.field325, arg1, this.field318, this.field315, 0, var6, arg2, this, this.field319, arg4);
                }
                this.field323 -= arg1;
                if (this.field323 != 0) {
                    return arg1;
                }
                if (!this.method920()) {
                    continue;
                }
                return arg3;
            }
            if (this.field319 == -256 && (this.field325 & 0xFF) == 0) {
                if (Statics.field5023) {
                    return method885(0, ((class41) this.field329).field243, arg0, this.field325, arg1, this.field314, this.field320, 0, arg3, arg2, this);
                }
                return method854(((class41) this.field329).field243, arg0, this.field325, arg1, this.field318, 0, arg3, arg2, this);
            }
            if (Statics.field5023) {
                return method859(0, 0, ((class41) this.field329).field243, arg0, this.field325, arg1, this.field314, this.field320, 0, arg3, arg2, this, this.field319, arg4);
            }
            return method828(0, 0, ((class41) this.field329).field243, arg0, this.field325, arg1, this.field318, 0, arg3, arg2, this, this.field319, arg4);
        }
    }

    @ObfuscatedName("bs.bu()Z")
    public boolean method920() {
        int var1 = this.field328;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method826(var1, this.field317);
            var2 = method851(var1, this.field317);
        }
        if (this.field318 != var1 || this.field314 != var3 || this.field320 != var2) {
            if (this.field318 < var1) {
                this.field315 = 1;
                this.field323 = var1 - this.field318;
            } else if (this.field318 > var1) {
                this.field315 = -1;
                this.field323 = this.field318 - var1;
            } else {
                this.field315 = 0;
            }
            if (this.field314 < var3) {
                this.field327 = 1;
                if (this.field323 == 0 || this.field323 > var3 - this.field314) {
                    this.field323 = var3 - this.field314;
                }
            } else if (this.field314 > var3) {
                this.field327 = -1;
                if (this.field323 == 0 || this.field323 > this.field314 - var3) {
                    this.field323 = this.field314 - var3;
                }
            } else {
                this.field327 = 0;
            }
            if (this.field320 < var2) {
                this.field316 = 1;
                if (this.field323 == 0 || this.field323 > var2 - this.field320) {
                    this.field323 = var2 - this.field320;
                }
            } else if (this.field320 > var2) {
                this.field316 = -1;
                if (this.field323 == 0 || this.field323 > this.field320 - var2) {
                    this.field323 = this.field320 - var2;
                }
            } else {
                this.field316 = 0;
            }
            return false;
        } else if (this.field328 == Integer.MIN_VALUE) {
            this.field328 = 0;
            this.field320 = 0;
            this.field314 = 0;
            this.field318 = 0;
            this.method8218();
            return true;
        } else {
            this.method868();
            return false;
        }
    }

    @ObfuscatedName("bs.bp([B[IIIIIIILbs;)I")
    public static int method865(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class49 arg8) {
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
        arg8.field325 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("bs.br(I[B[IIIIIIIILbs;)I")
    public static int method853(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class49 arg10) {
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
        arg10.field325 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("bs.bf([B[IIIIIIILbs;)I")
    public static int method854(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class49 arg8) {
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
        arg8.field325 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("bs.bq(I[B[IIIIIIIILbs;)I")
    public static int method885(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class49 arg10) {
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
        arg10.field325 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("bs.bt(II[B[IIIIIIILbs;II)I")
    public static int method856(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class49 arg10, int arg11, int arg12) {
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
        arg10.field325 = arg4;
        return arg5;
    }

    @ObfuscatedName("bs.bi(II[B[IIIIIIIILbs;II)I")
    public static int method836(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class49 arg11, int arg12, int arg13) {
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
        arg11.field325 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("bs.be(II[B[IIIIIIILbs;II)I")
    public static int method828(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class49 arg10, int arg11, int arg12) {
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
        arg10.field325 = arg4;
        return arg5;
    }

    @ObfuscatedName("bs.ba(II[B[IIIIIIIILbs;II)I")
    public static int method859(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class49 arg11, int arg12, int arg13) {
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
        arg11.field325 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("bs.bn([B[IIIIIIIILbs;)I")
    public static int method860(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class49 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field314 += (var14 - arg3) * arg9.field327;
        arg9.field320 += (var14 - arg3) * arg9.field316;
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
        arg9.field318 = var12 >> 2;
        arg9.field325 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("bs.bw(I[B[IIIIIIIIIILbs;)I")
    public static int method843(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class49 arg12) {
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
        arg12.field318 += (var19 - arg4) * arg12.field315;
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
        arg12.field314 = var15 >> 2;
        arg12.field320 = var16 >> 2;
        arg12.field325 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("bs.bk([B[IIIIIIIILbs;)I")
    public static int method869(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class49 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field314 += (var14 - arg3) * arg9.field327;
        arg9.field320 += (var14 - arg3) * arg9.field316;
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
        arg9.field318 = var12 >> 2;
        arg9.field325 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("bs.bs(I[B[IIIIIIIIIILbs;)I")
    public static int method950(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class49 arg12) {
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
        arg12.field318 += (var19 - arg4) * arg12.field315;
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
        arg12.field314 = var15 >> 2;
        arg12.field320 = var16 >> 2;
        arg12.field325 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("bs.bb(II[B[IIIIIIIILbs;II)I")
    public static int method940(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class49 arg11, int arg12, int arg13) {
        arg11.field314 -= arg11.field327 * arg5;
        arg11.field320 -= arg11.field316 * arg5;
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
        arg11.field314 += arg11.field327 * arg5;
        arg11.field320 += arg11.field316 * arg5;
        arg11.field318 = arg6;
        arg11.field325 = arg4;
        return arg5;
    }

    @ObfuscatedName("bs.by(II[B[IIIIIIIIIILbs;II)I")
    public static int method883(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class49 arg13, int arg14, int arg15) {
        arg13.field318 -= arg13.field315 * arg5;
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
        arg13.field318 += arg13.field315 * var27;
        arg13.field314 = arg6;
        arg13.field320 = arg7;
        arg13.field325 = arg4;
        return var27;
    }

    @ObfuscatedName("bs.bl(II[B[IIIIIIIILbs;II)I")
    public static int method841(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class49 arg11, int arg12, int arg13) {
        arg11.field314 -= arg11.field327 * arg5;
        arg11.field320 -= arg11.field316 * arg5;
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
        arg11.field314 += arg11.field327 * arg5;
        arg11.field320 += arg11.field316 * arg5;
        arg11.field318 = arg6;
        arg11.field325 = arg4;
        return arg5;
    }

    @ObfuscatedName("bs.cx(II[B[IIIIIIIIIILbs;II)I")
    public static int method921(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class49 arg13, int arg14, int arg15) {
        arg13.field318 -= arg13.field315 * arg5;
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
        arg13.field318 += arg13.field315 * var26;
        arg13.field314 = arg6;
        arg13.field320 = arg7;
        arg13.field325 = arg4;
        return var26;
    }
}
