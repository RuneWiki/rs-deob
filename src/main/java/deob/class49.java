package deob;

@ObfuscatedName("bu")
public class class49 extends class50 {

    @ObfuscatedName("bu.at")
    public int field346;

    @ObfuscatedName("bu.an")
    public int field339;

    @ObfuscatedName("bu.av")
    public int field340;

    @ObfuscatedName("bu.as")
    public int field341;

    @ObfuscatedName("bu.ax")
    public int field342;

    @ObfuscatedName("bu.ap")
    public int field343;

    @ObfuscatedName("bu.ab")
    public int field344;

    @ObfuscatedName("bu.ak")
    public int field338;

    @ObfuscatedName("bu.ae")
    public int field345;

    @ObfuscatedName("bu.af")
    public int field347;

    @ObfuscatedName("bu.ao")
    public boolean field348;

    @ObfuscatedName("bu.aa")
    public int field351;

    @ObfuscatedName("bu.aj")
    public int field350;

    @ObfuscatedName("bu.ad")
    public int field349;

    @ObfuscatedName("bu.ac")
    public int field352;

    @ObfuscatedName("bu.at(II)I")
    public static int method891(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("bu.an(II)I")
    public static int method823(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("bu.bz()I")
    public int method888() {
        int var1 = this.field342 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field338 == 0) {
            var2 -= this.field346 * var2 / (((class41) this.field355).field265.length << 8);
        } else if (this.field338 >= 0) {
            var2 -= this.field345 * var2 / ((class41) this.field355).field265.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    public class49(class41 arg0, int arg1, int arg2) {
        this.field355 = arg0;
        this.field345 = arg0.field264;
        this.field347 = arg0.field267;
        this.field348 = arg0.field268;
        this.field339 = arg1;
        this.field340 = arg2;
        this.field341 = 8192;
        this.field346 = 0;
        this.method827();
    }

    public class49(class41 arg0, int arg1, int arg2, int arg3) {
        this.field355 = arg0;
        this.field345 = arg0.field264;
        this.field347 = arg0.field267;
        this.field348 = arg0.field268;
        this.field339 = arg1;
        this.field340 = arg2;
        this.field341 = arg3;
        this.field346 = 0;
        this.method827();
    }

    @ObfuscatedName("bu.av(Lbp;II)Lbu;")
    public static class49 method858(class41 arg0, int arg1, int arg2) {
        return arg0.field265 == null || arg0.field265.length == 0 ? null : new class49(arg0, (int) ((long) arg0.field266 * 256L * (long) arg1 / (long) (Statics.field292 * 100)), arg2 << 6);
    }

    @ObfuscatedName("bu.as(Lbp;III)Lbu;")
    public static class49 method908(class41 arg0, int arg1, int arg2, int arg3) {
        return arg0.field265 == null || arg0.field265.length == 0 ? null : new class49(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("bu.ax()V")
    public void method827() {
        this.field342 = this.field340;
        this.field343 = method891(this.field340, this.field341);
        this.field344 = method823(this.field340, this.field341);
    }

    @ObfuscatedName("bu.af(I)V")
    public synchronized void method868(int arg0) {
        this.field338 = arg0;
    }

    @ObfuscatedName("bu.aa(I)V")
    public synchronized void method829(int arg0) {
        this.method847(arg0 << 6, this.method833());
    }

    @ObfuscatedName("bu.aj(I)V")
    public synchronized void method901(int arg0) {
        this.method847(arg0, this.method833());
    }

    @ObfuscatedName("bu.ad(II)V")
    public synchronized void method847(int arg0, int arg1) {
        this.field340 = arg0;
        this.field341 = arg1;
        this.field351 = 0;
        this.method827();
    }

    @ObfuscatedName("bu.ac()I")
    public synchronized int method832() {
        return this.field340 == Integer.MIN_VALUE ? 0 : this.field340;
    }

    @ObfuscatedName("bu.ag()I")
    public synchronized int method833() {
        return this.field341 < 0 ? -1 : this.field341;
    }

    @ObfuscatedName("bu.ar(I)V")
    public synchronized void method834(int arg0) {
        int var2 = ((class41) this.field355).field265.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field346 = arg0;
    }

    @ObfuscatedName("bu.ah(Z)V")
    public synchronized void method835(boolean arg0) {
        this.field339 = (this.field339 >>> 31) + (this.field339 ^ this.field339 >> 31);
        if (arg0) {
            this.field339 = -this.field339;
        }
    }

    @ObfuscatedName("bu.az()V")
    public void method867() {
        if (this.field351 == 0) {
            return;
        }
        if (this.field340 == Integer.MIN_VALUE) {
            this.field340 = 0;
        }
        this.field351 = 0;
        this.method827();
    }

    @ObfuscatedName("bu.au(II)V")
    public synchronized void method872(int arg0, int arg1) {
        this.method838(arg0, arg1, this.method833());
    }

    @ObfuscatedName("bu.ai(III)V")
    public synchronized void method838(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method847(arg1, arg2);
            return;
        }
        int var4 = method891(arg1, arg2);
        int var5 = method823(arg1, arg2);
        if (this.field343 == var4 && this.field344 == var5) {
            this.field351 = 0;
            return;
        }
        int var6 = arg1 - this.field342;
        if (this.field342 - arg1 > var6) {
            var6 = this.field342 - arg1;
        }
        if (var4 - this.field343 > var6) {
            var6 = var4 - this.field343;
        }
        if (this.field343 - var4 > var6) {
            var6 = this.field343 - var4;
        }
        if (var5 - this.field344 > var6) {
            var6 = var5 - this.field344;
        }
        if (this.field344 - var5 > var6) {
            var6 = this.field344 - var5;
        }
        if (arg0 > var6) {
            arg0 = var6;
        }
        this.field351 = arg0;
        this.field340 = arg1;
        this.field341 = arg2;
        this.field350 = (arg1 - this.field342) / arg0;
        this.field349 = (var4 - this.field343) / arg0;
        this.field352 = (var5 - this.field344) / arg0;
    }

    @ObfuscatedName("bu.aq(I)V")
    public synchronized void method839(int arg0) {
        if (arg0 == 0) {
            this.method901(0);
            this.method7560();
        } else if (this.field343 == 0 && this.field344 == 0) {
            this.field351 = 0;
            this.field340 = 0;
            this.field342 = 0;
            this.method7560();
        } else {
            int var2 = -this.field342;
            if (this.field342 > var2) {
                var2 = this.field342;
            }
            if (-this.field343 > var2) {
                var2 = -this.field343;
            }
            if (this.field343 > var2) {
                var2 = this.field343;
            }
            if (-this.field344 > var2) {
                var2 = -this.field344;
            }
            if (this.field344 > var2) {
                var2 = this.field344;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field351 = arg0;
            this.field340 = Integer.MIN_VALUE;
            this.field350 = -this.field342 / arg0;
            this.field349 = -this.field343 / arg0;
            this.field352 = -this.field344 / arg0;
        }
    }

    @ObfuscatedName("bu.aw(I)V")
    public synchronized void method840(int arg0) {
        if (this.field339 < 0) {
            this.field339 = -arg0;
        } else {
            this.field339 = arg0;
        }
    }

    @ObfuscatedName("bu.ay()I")
    public synchronized int method841() {
        return this.field339 < 0 ? -this.field339 : this.field339;
    }

    @ObfuscatedName("bu.al()Z")
    public boolean method910() {
        return this.field346 < 0 || this.field346 >= ((class41) this.field355).field265.length << 8;
    }

    @ObfuscatedName("bu.am()Z")
    public boolean method903() {
        return this.field351 != 0;
    }

    @ObfuscatedName("bu.ap()Lby;")
    public class50 method701() {
        return null;
    }

    @ObfuscatedName("bu.ab()Lby;")
    public class50 method702() {
        return null;
    }

    @ObfuscatedName("bu.ak()I")
    public int method672() {
        return this.field340 == 0 && this.field351 == 0 ? 0 : 1;
    }

    @ObfuscatedName("bu.ae([III)V")
    public synchronized void method677(int[] arg0, int arg1, int arg2) {
        if (this.field340 == 0 && this.field351 == 0) {
            this.method674(arg2);
            return;
        }
        class41 var4 = (class41) this.field355;
        int var5 = this.field345 << 8;
        int var6 = this.field347 << 8;
        int var7 = var4.field265.length << 8;
        int var8 = var6 - var5;
        if (var8 <= 0) {
            this.field338 = 0;
        }
        int var9 = arg1;
        int var10 = arg1 + arg2;
        if (this.field346 < 0) {
            if (this.field339 <= 0) {
                this.method867();
                this.method7560();
                return;
            }
            this.field346 = 0;
        }
        if (this.field346 >= var7) {
            if (this.field339 >= 0) {
                this.method867();
                this.method7560();
                return;
            }
            this.field346 = var7 - 1;
        }
        if (this.field338 >= 0) {
            if (this.field338 > 0) {
                if (this.field348) {
                    label131: {
                        if (this.field339 < 0) {
                            var9 = this.method846(arg0, arg1, var5, var10, var4.field265[this.field345]);
                            if (this.field346 >= var5) {
                                return;
                            }
                            this.field346 = var5 + var5 - 1 - this.field346;
                            this.field339 = -this.field339;
                            if (--this.field338 == 0) {
                                break label131;
                            }
                        }
                        do {
                            var9 = this.method845(arg0, var9, var6, var10, var4.field265[this.field347 - 1]);
                            if (this.field346 < var6) {
                                return;
                            }
                            this.field346 = var6 + var6 - 1 - this.field346;
                            this.field339 = -this.field339;
                            if (--this.field338 == 0) {
                                break;
                            }
                            var9 = this.method846(arg0, var9, var5, var10, var4.field265[this.field345]);
                            if (this.field346 >= var5) {
                                return;
                            }
                            this.field346 = var5 + var5 - 1 - this.field346;
                            this.field339 = -this.field339;
                        } while (--this.field338 != 0);
                    }
                } else if (this.field339 < 0) {
                    while (true) {
                        var9 = this.method846(arg0, var9, var5, var10, var4.field265[this.field347 - 1]);
                        if (this.field346 >= var5) {
                            return;
                        }
                        int var12 = (var6 - 1 - this.field346) / var8;
                        if (var12 >= this.field338) {
                            this.field346 += this.field338 * var8;
                            this.field338 = 0;
                            break;
                        }
                        this.field346 += var8 * var12;
                        this.field338 -= var12;
                    }
                } else {
                    while (true) {
                        var9 = this.method845(arg0, var9, var6, var10, var4.field265[this.field345]);
                        if (this.field346 < var6) {
                            return;
                        }
                        int var13 = (this.field346 - var5) / var8;
                        if (var13 >= this.field338) {
                            this.field346 -= this.field338 * var8;
                            this.field338 = 0;
                            break;
                        }
                        this.field346 -= var8 * var13;
                        this.field338 -= var13;
                    }
                }
            }
            if (this.field339 < 0) {
                this.method846(arg0, var9, 0, var10, 0);
                if (this.field346 < 0) {
                    this.field346 = -1;
                    this.method867();
                    this.method7560();
                }
            } else {
                this.method845(arg0, var9, var7, var10, 0);
                if (this.field346 >= var7) {
                    this.field346 = var7;
                    this.method867();
                    this.method7560();
                }
            }
        } else if (this.field348) {
            if (this.field339 < 0) {
                var9 = this.method846(arg0, arg1, var5, var10, var4.field265[this.field345]);
                if (this.field346 >= var5) {
                    return;
                }
                this.field346 = var5 + var5 - 1 - this.field346;
                this.field339 = -this.field339;
            }
            while (true) {
                int var11 = this.method845(arg0, var9, var6, var10, var4.field265[this.field347 - 1]);
                if (this.field346 < var6) {
                    return;
                }
                this.field346 = var6 + var6 - 1 - this.field346;
                this.field339 = -this.field339;
                var9 = this.method846(arg0, var11, var5, var10, var4.field265[this.field345]);
                if (this.field346 >= var5) {
                    return;
                }
                this.field346 = var5 + var5 - 1 - this.field346;
                this.field339 = -this.field339;
            }
        } else if (this.field339 < 0) {
            while (true) {
                var9 = this.method846(arg0, var9, var5, var10, var4.field265[this.field347 - 1]);
                if (this.field346 >= var5) {
                    return;
                }
                this.field346 = var6 - 1 - (var6 - 1 - this.field346) % var8;
            }
        } else {
            while (true) {
                var9 = this.method845(arg0, var9, var6, var10, var4.field265[this.field345]);
                if (this.field346 < var6) {
                    return;
                }
                this.field346 = (this.field346 - var5) % var8 + var5;
            }
        }
    }

    @ObfuscatedName("bu.ao(I)V")
    public synchronized void method674(int arg0) {
        if (this.field351 > 0) {
            if (arg0 >= this.field351) {
                if (this.field340 == Integer.MIN_VALUE) {
                    this.field340 = 0;
                    this.field344 = 0;
                    this.field343 = 0;
                    this.field342 = 0;
                    this.method7560();
                    arg0 = this.field351;
                }
                this.field351 = 0;
                this.method827();
            } else {
                this.field342 += this.field350 * arg0;
                this.field343 += this.field349 * arg0;
                this.field344 += this.field352 * arg0;
                this.field351 -= arg0;
            }
        }
        class41 var2 = (class41) this.field355;
        int var3 = this.field345 << 8;
        int var4 = this.field347 << 8;
        int var5 = var2.field265.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field338 = 0;
        }
        if (this.field346 < 0) {
            if (this.field339 <= 0) {
                this.method867();
                this.method7560();
                return;
            }
            this.field346 = 0;
        }
        if (this.field346 >= var5) {
            if (this.field339 >= 0) {
                this.method867();
                this.method7560();
                return;
            }
            this.field346 = var5 - 1;
        }
        this.field346 += this.field339 * arg0;
        if (this.field338 >= 0) {
            if (this.field338 > 0) {
                if (this.field348) {
                    label121: {
                        if (this.field339 < 0) {
                            if (this.field346 >= var3) {
                                return;
                            }
                            this.field346 = var3 + var3 - 1 - this.field346;
                            this.field339 = -this.field339;
                            if (--this.field338 == 0) {
                                break label121;
                            }
                        }
                        do {
                            if (this.field346 < var4) {
                                return;
                            }
                            this.field346 = var4 + var4 - 1 - this.field346;
                            this.field339 = -this.field339;
                            if (--this.field338 == 0) {
                                break;
                            }
                            if (this.field346 >= var3) {
                                return;
                            }
                            this.field346 = var3 + var3 - 1 - this.field346;
                            this.field339 = -this.field339;
                        } while (--this.field338 != 0);
                    }
                } else {
                    label153: {
                        if (this.field339 < 0) {
                            if (this.field346 >= var3) {
                                return;
                            }
                            int var7 = (var4 - 1 - this.field346) / var6;
                            if (var7 >= this.field338) {
                                this.field346 += this.field338 * var6;
                                this.field338 = 0;
                                break label153;
                            }
                            this.field346 += var6 * var7;
                            this.field338 -= var7;
                        } else if (this.field346 >= var4) {
                            int var8 = (this.field346 - var3) / var6;
                            if (var8 >= this.field338) {
                                this.field346 -= this.field338 * var6;
                                this.field338 = 0;
                                break label153;
                            }
                            this.field346 -= var6 * var8;
                            this.field338 -= var8;
                        } else {
                            return;
                        }
                        return;
                    }
                }
            }
            if (this.field339 < 0) {
                if (this.field346 < 0) {
                    this.field346 = -1;
                    this.method867();
                    this.method7560();
                }
            } else if (this.field346 >= var5) {
                this.field346 = var5;
                this.method867();
                this.method7560();
            }
        } else if (this.field348) {
            if (this.field339 < 0) {
                if (this.field346 >= var3) {
                    return;
                }
                this.field346 = var3 + var3 - 1 - this.field346;
                this.field339 = -this.field339;
            }
            while (this.field346 >= var4) {
                this.field346 = var4 + var4 - 1 - this.field346;
                this.field339 = -this.field339;
                if (this.field346 >= var3) {
                    return;
                }
                this.field346 = var3 + var3 - 1 - this.field346;
                this.field339 = -this.field339;
            }
        } else if (this.field339 < 0) {
            if (this.field346 >= var3) {
                return;
            }
            this.field346 = var4 - 1 - (var4 - 1 - this.field346) % var6;
        } else if (this.field346 >= var4) {
            this.field346 = (this.field346 - var3) % var6 + var3;
        } else {
            return;
        }
    }

    @ObfuscatedName("bu.bp([IIIII)I")
    public int method845(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field351 > 0) {
                int var6 = this.field351 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field351 += arg1;
                if (this.field339 == 256 && (this.field346 & 0xFF) == 0) {
                    if (Statics.field3873) {
                        arg1 = method884(0, ((class41) this.field355).field265, arg0, this.field346, arg1, this.field343, this.field344, this.field349, this.field352, 0, var6, arg2, this);
                    } else {
                        arg1 = method856(((class41) this.field355).field265, arg0, this.field346, arg1, this.field342, this.field350, 0, var6, arg2, this);
                    }
                } else if (Statics.field3873) {
                    arg1 = method844(0, 0, ((class41) this.field355).field265, arg0, this.field346, arg1, this.field343, this.field344, this.field349, this.field352, 0, var6, arg2, this, this.field339, arg4);
                } else {
                    arg1 = method860(0, 0, ((class41) this.field355).field265, arg0, this.field346, arg1, this.field342, this.field350, 0, var6, arg2, this, this.field339, arg4);
                }
                this.field351 -= arg1;
                if (this.field351 != 0) {
                    return arg1;
                }
                if (!this.method935()) {
                    continue;
                }
                return arg3;
            }
            if (this.field339 == 256 && (this.field346 & 0xFF) == 0) {
                if (Statics.field3873) {
                    return method849(0, ((class41) this.field355).field265, arg0, this.field346, arg1, this.field343, this.field344, 0, arg3, arg2, this);
                }
                return method875(((class41) this.field355).field265, arg0, this.field346, arg1, this.field342, 0, arg3, arg2, this);
            }
            if (Statics.field3873) {
                return method853(0, 0, ((class41) this.field355).field265, arg0, this.field346, arg1, this.field343, this.field344, 0, arg3, arg2, this, this.field339, arg4);
            }
            return method852(0, 0, ((class41) this.field355).field265, arg0, this.field346, arg1, this.field342, 0, arg3, arg2, this, this.field339, arg4);
        }
    }

    @ObfuscatedName("bu.bw([IIIII)I")
    public int method846(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field351 > 0) {
                int var6 = this.field351 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field351 += arg1;
                if (this.field339 == -256 && (this.field346 & 0xFF) == 0) {
                    if (Statics.field3873) {
                        arg1 = method859(0, ((class41) this.field355).field265, arg0, this.field346, arg1, this.field343, this.field344, this.field349, this.field352, 0, var6, arg2, this);
                    } else {
                        arg1 = method914(((class41) this.field355).field265, arg0, this.field346, arg1, this.field342, this.field350, 0, var6, arg2, this);
                    }
                } else if (Statics.field3873) {
                    arg1 = method863(0, 0, ((class41) this.field355).field265, arg0, this.field346, arg1, this.field343, this.field344, this.field349, this.field352, 0, var6, arg2, this, this.field339, arg4);
                } else {
                    arg1 = method862(0, 0, ((class41) this.field355).field265, arg0, this.field346, arg1, this.field342, this.field350, 0, var6, arg2, this, this.field339, arg4);
                }
                this.field351 -= arg1;
                if (this.field351 != 0) {
                    return arg1;
                }
                if (!this.method935()) {
                    continue;
                }
                return arg3;
            }
            if (this.field339 == -256 && (this.field346 & 0xFF) == 0) {
                if (Statics.field3873) {
                    return method851(0, ((class41) this.field355).field265, arg0, this.field346, arg1, this.field343, this.field344, 0, arg3, arg2, this);
                }
                return method850(((class41) this.field355).field265, arg0, this.field346, arg1, this.field342, 0, arg3, arg2, this);
            }
            if (Statics.field3873) {
                return method855(0, 0, ((class41) this.field355).field265, arg0, this.field346, arg1, this.field343, this.field344, 0, arg3, arg2, this, this.field339, arg4);
            }
            return method854(0, 0, ((class41) this.field355).field265, arg0, this.field346, arg1, this.field342, 0, arg3, arg2, this, this.field339, arg4);
        }
    }

    @ObfuscatedName("bu.bk()Z")
    public boolean method935() {
        int var1 = this.field340;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method891(var1, this.field341);
            var2 = method823(var1, this.field341);
        }
        if (this.field342 != var1 || this.field343 != var3 || this.field344 != var2) {
            if (this.field342 < var1) {
                this.field350 = 1;
                this.field351 = var1 - this.field342;
            } else if (this.field342 > var1) {
                this.field350 = -1;
                this.field351 = this.field342 - var1;
            } else {
                this.field350 = 0;
            }
            if (this.field343 < var3) {
                this.field349 = 1;
                if (this.field351 == 0 || this.field351 > var3 - this.field343) {
                    this.field351 = var3 - this.field343;
                }
            } else if (this.field343 > var3) {
                this.field349 = -1;
                if (this.field351 == 0 || this.field351 > this.field343 - var3) {
                    this.field351 = this.field343 - var3;
                }
            } else {
                this.field349 = 0;
            }
            if (this.field344 < var2) {
                this.field352 = 1;
                if (this.field351 == 0 || this.field351 > var2 - this.field344) {
                    this.field351 = var2 - this.field344;
                }
            } else if (this.field344 > var2) {
                this.field352 = -1;
                if (this.field351 == 0 || this.field351 > this.field344 - var2) {
                    this.field351 = this.field344 - var2;
                }
            } else {
                this.field352 = 0;
            }
            return false;
        } else if (this.field340 == Integer.MIN_VALUE) {
            this.field340 = 0;
            this.field344 = 0;
            this.field343 = 0;
            this.field342 = 0;
            this.method7560();
            return true;
        } else {
            this.method827();
            return false;
        }
    }

    @ObfuscatedName("bu.bv([B[IIIIIIILbu;)I")
    public static int method875(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class49 arg8) {
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
        arg8.field346 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("bu.bm(I[B[IIIIIIIILbu;)I")
    public static int method849(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class49 arg10) {
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
        arg10.field346 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("bu.br([B[IIIIIIILbu;)I")
    public static int method850(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class49 arg8) {
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
        arg8.field346 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("bu.bu(I[B[IIIIIIIILbu;)I")
    public static int method851(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class49 arg10) {
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
        arg10.field346 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("bu.by(II[B[IIIIIIILbu;II)I")
    public static int method852(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class49 arg10, int arg11, int arg12) {
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
        arg10.field346 = arg4;
        return arg5;
    }

    @ObfuscatedName("bu.bt(II[B[IIIIIIIILbu;II)I")
    public static int method853(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class49 arg11, int arg12, int arg13) {
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
        arg11.field346 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("bu.bl(II[B[IIIIIIILbu;II)I")
    public static int method854(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class49 arg10, int arg11, int arg12) {
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
        arg10.field346 = arg4;
        return arg5;
    }

    @ObfuscatedName("bu.cs(II[B[IIIIIIIILbu;II)I")
    public static int method855(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class49 arg11, int arg12, int arg13) {
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
        arg11.field346 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("bu.cu([B[IIIIIIIILbu;)I")
    public static int method856(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class49 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field343 += (var14 - arg3) * arg9.field349;
        arg9.field344 += (var14 - arg3) * arg9.field352;
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
        arg9.field342 = var12 >> 2;
        arg9.field346 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("bu.ca(I[B[IIIIIIIIIILbu;)I")
    public static int method884(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class49 arg12) {
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
        arg12.field342 += (var19 - arg4) * arg12.field350;
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
        arg12.field343 = var15 >> 2;
        arg12.field344 = var16 >> 2;
        arg12.field346 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("bu.cf([B[IIIIIIIILbu;)I")
    public static int method914(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class49 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field343 += (var14 - arg3) * arg9.field349;
        arg9.field344 += (var14 - arg3) * arg9.field352;
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
        arg9.field342 = var12 >> 2;
        arg9.field346 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("bu.cw(I[B[IIIIIIIIIILbu;)I")
    public static int method859(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class49 arg12) {
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
        arg12.field342 += (var19 - arg4) * arg12.field350;
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
        arg12.field343 = var15 >> 2;
        arg12.field344 = var16 >> 2;
        arg12.field346 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("bu.ch(II[B[IIIIIIIILbu;II)I")
    public static int method860(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class49 arg11, int arg12, int arg13) {
        arg11.field343 -= arg11.field349 * arg5;
        arg11.field344 -= arg11.field352 * arg5;
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
        arg11.field343 += arg11.field349 * arg5;
        arg11.field344 += arg11.field352 * arg5;
        arg11.field342 = arg6;
        arg11.field346 = arg4;
        return arg5;
    }

    @ObfuscatedName("bu.cp(II[B[IIIIIIIIIILbu;II)I")
    public static int method844(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class49 arg13, int arg14, int arg15) {
        arg13.field342 -= arg13.field350 * arg5;
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
        arg13.field342 += arg13.field350 * var27;
        arg13.field343 = arg6;
        arg13.field344 = arg7;
        arg13.field346 = arg4;
        return var27;
    }

    @ObfuscatedName("bu.cy(II[B[IIIIIIIILbu;II)I")
    public static int method862(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class49 arg11, int arg12, int arg13) {
        arg11.field343 -= arg11.field349 * arg5;
        arg11.field344 -= arg11.field352 * arg5;
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
        arg11.field343 += arg11.field349 * arg5;
        arg11.field344 += arg11.field352 * arg5;
        arg11.field342 = arg6;
        arg11.field346 = arg4;
        return arg5;
    }

    @ObfuscatedName("bu.cd(II[B[IIIIIIIIIILbu;II)I")
    public static int method863(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class49 arg13, int arg14, int arg15) {
        arg13.field342 -= arg13.field350 * arg5;
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
        arg13.field342 += arg13.field350 * var26;
        arg13.field343 = arg6;
        arg13.field344 = arg7;
        arg13.field346 = arg4;
        return var26;
    }
}
