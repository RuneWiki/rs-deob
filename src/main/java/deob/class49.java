package deob;

@ObfuscatedName("bs")
public class class49 extends class50 {

    @ObfuscatedName("bs.am")
    public int field348;

    @ObfuscatedName("bs.ap")
    public int field340;

    @ObfuscatedName("bs.af")
    public int field349;

    @ObfuscatedName("bs.aj")
    public int field342;

    @ObfuscatedName("bs.aq")
    public int field353;

    @ObfuscatedName("bs.ar")
    public int field341;

    @ObfuscatedName("bs.ag")
    public int field345;

    @ObfuscatedName("bs.ao")
    public int field346;

    @ObfuscatedName("bs.ae")
    public int field347;

    @ObfuscatedName("bs.aa")
    public int field350;

    @ObfuscatedName("bs.au")
    public boolean field344;

    @ObfuscatedName("bs.an")
    public int field343;

    @ObfuscatedName("bs.ad")
    public int field351;

    @ObfuscatedName("bs.ax")
    public int field352;

    @ObfuscatedName("bs.aw")
    public int field339;

    @ObfuscatedName("bs.am(II)I")
    public static int method941(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("bs.ap(II)I")
    public static int method889(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("bs.bx()I")
    public int method890() {
        int var1 = this.field353 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field346 == 0) {
            var2 -= this.field348 * var2 / (((class41) this.field356).field269.length << 8);
        } else if (this.field346 >= 0) {
            var2 -= this.field347 * var2 / ((class41) this.field356).field269.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    public class49(class41 arg0, int arg1, int arg2) {
        this.field356 = arg0;
        this.field347 = arg0.field270;
        this.field350 = arg0.field272;
        this.field344 = arg0.field268;
        this.field340 = arg1;
        this.field349 = arg2;
        this.field342 = 8192;
        this.field348 = 0;
        this.method988();
    }

    public class49(class41 arg0, int arg1, int arg2, int arg3) {
        this.field356 = arg0;
        this.field347 = arg0.field270;
        this.field350 = arg0.field272;
        this.field344 = arg0.field268;
        this.field340 = arg1;
        this.field349 = arg2;
        this.field342 = arg3;
        this.field348 = 0;
        this.method988();
    }

    @ObfuscatedName("bs.af(Lbm;II)Lbs;")
    public static class49 method892(class41 arg0, int arg1, int arg2) {
        return arg0.field269 == null || arg0.field269.length == 0 ? null : new class49(arg0, (int) ((long) arg0.field271 * 256L * (long) arg1 / (long) (Statics.field1994 * 100)), arg2 << 6);
    }

    @ObfuscatedName("bs.aj(Lbm;III)Lbs;")
    public static class49 method893(class41 arg0, int arg1, int arg2, int arg3) {
        return arg0.field269 == null || arg0.field269.length == 0 ? null : new class49(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("bs.aq()V")
    public void method988() {
        this.field353 = this.field349;
        this.field341 = method941(this.field349, this.field342);
        this.field345 = method889(this.field349, this.field342);
    }

    @ObfuscatedName("bs.aa(I)V")
    public synchronized void method931(int arg0) {
        this.field346 = arg0;
    }

    @ObfuscatedName("bs.an(I)V")
    public synchronized void method926(int arg0) {
        this.method920(arg0 << 6, this.method899());
    }

    @ObfuscatedName("bs.ad(I)V")
    public synchronized void method997(int arg0) {
        this.method920(arg0, this.method899());
    }

    @ObfuscatedName("bs.ax(II)V")
    public synchronized void method920(int arg0, int arg1) {
        this.field349 = arg0;
        this.field342 = arg1;
        this.field343 = 0;
        this.method988();
    }

    @ObfuscatedName("bs.aw()I")
    public synchronized int method898() {
        return this.field349 == Integer.MIN_VALUE ? 0 : this.field349;
    }

    @ObfuscatedName("bs.az()I")
    public synchronized int method899() {
        return this.field342 < 0 ? -1 : this.field342;
    }

    @ObfuscatedName("bs.av(I)V")
    public synchronized void method927(int arg0) {
        int var2 = ((class41) this.field356).field269.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field348 = arg0;
    }

    @ObfuscatedName("bs.ak(Z)V")
    public synchronized void method896(boolean arg0) {
        this.field340 = (this.field340 >>> 31) + (this.field340 ^ this.field340 >> 31);
        if (arg0) {
            this.field340 = -this.field340;
        }
    }

    @ObfuscatedName("bs.ay()V")
    public void method902() {
        if (this.field343 == 0) {
            return;
        }
        if (this.field349 == Integer.MIN_VALUE) {
            this.field349 = 0;
        }
        this.field343 = 0;
        this.method988();
    }

    @ObfuscatedName("bs.as(II)V")
    public synchronized void method903(int arg0, int arg1) {
        this.method904(arg0, arg1, this.method899());
    }

    @ObfuscatedName("bs.ab(III)V")
    public synchronized void method904(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method920(arg1, arg2);
            return;
        }
        int var4 = method941(arg1, arg2);
        int var5 = method889(arg1, arg2);
        if (this.field341 == var4 && this.field345 == var5) {
            this.field343 = 0;
            return;
        }
        int var6 = arg1 - this.field353;
        if (this.field353 - arg1 > var6) {
            var6 = this.field353 - arg1;
        }
        if (var4 - this.field341 > var6) {
            var6 = var4 - this.field341;
        }
        if (this.field341 - var4 > var6) {
            var6 = this.field341 - var4;
        }
        if (var5 - this.field345 > var6) {
            var6 = var5 - this.field345;
        }
        if (this.field345 - var5 > var6) {
            var6 = this.field345 - var5;
        }
        if (arg0 > var6) {
            arg0 = var6;
        }
        this.field343 = arg0;
        this.field349 = arg1;
        this.field342 = arg2;
        this.field351 = (arg1 - this.field353) / arg0;
        this.field352 = (var4 - this.field341) / arg0;
        this.field339 = (var5 - this.field345) / arg0;
    }

    @ObfuscatedName("bs.ah(I)V")
    public synchronized void method983(int arg0) {
        if (arg0 == 0) {
            this.method997(0);
            this.method7988();
        } else if (this.field341 == 0 && this.field345 == 0) {
            this.field343 = 0;
            this.field349 = 0;
            this.field353 = 0;
            this.method7988();
        } else {
            int var2 = -this.field353;
            if (this.field353 > var2) {
                var2 = this.field353;
            }
            if (-this.field341 > var2) {
                var2 = -this.field341;
            }
            if (this.field341 > var2) {
                var2 = this.field341;
            }
            if (-this.field345 > var2) {
                var2 = -this.field345;
            }
            if (this.field345 > var2) {
                var2 = this.field345;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field343 = arg0;
            this.field349 = Integer.MIN_VALUE;
            this.field351 = -this.field353 / arg0;
            this.field352 = -this.field341 / arg0;
            this.field339 = -this.field345 / arg0;
        }
    }

    @ObfuscatedName("bs.bg(I)V")
    public synchronized void method906(int arg0) {
        if (this.field340 < 0) {
            this.field340 = -arg0;
        } else {
            this.field340 = arg0;
        }
    }

    @ObfuscatedName("bs.bt()I")
    public synchronized int method907() {
        return this.field340 < 0 ? -this.field340 : this.field340;
    }

    @ObfuscatedName("bs.br()Z")
    public boolean method949() {
        return this.field348 < 0 || this.field348 >= ((class41) this.field356).field269.length << 8;
    }

    @ObfuscatedName("bs.ba()Z")
    public boolean method909() {
        return this.field343 != 0;
    }

    @ObfuscatedName("bs.ar()Lbl;")
    public class50 method738() {
        return null;
    }

    @ObfuscatedName("bs.ag()Lbl;")
    public class50 method766() {
        return null;
    }

    @ObfuscatedName("bs.ao()I")
    public int method740() {
        return this.field349 == 0 && this.field343 == 0 ? 0 : 1;
    }

    @ObfuscatedName("bs.ae([III)V")
    public synchronized void method736(int[] arg0, int arg1, int arg2) {
        if (this.field349 == 0 && this.field343 == 0) {
            this.method743(arg2);
            return;
        }
        class41 var4 = (class41) this.field356;
        int var5 = this.field347 << 8;
        int var6 = this.field350 << 8;
        int var7 = var4.field269.length << 8;
        int var8 = var6 - var5;
        if (var8 <= 0) {
            this.field346 = 0;
        }
        int var9 = arg1;
        int var10 = arg1 + arg2;
        if (this.field348 < 0) {
            if (this.field340 <= 0) {
                this.method902();
                this.method7988();
                return;
            }
            this.field348 = 0;
        }
        if (this.field348 >= var7) {
            if (this.field340 >= 0) {
                this.method902();
                this.method7988();
                return;
            }
            this.field348 = var7 - 1;
        }
        if (this.field346 >= 0) {
            if (this.field346 > 0) {
                if (this.field344) {
                    label131: {
                        if (this.field340 < 0) {
                            var9 = this.method992(arg0, arg1, var5, var10, var4.field269[this.field347]);
                            if (this.field348 >= var5) {
                                return;
                            }
                            this.field348 = var5 + var5 - 1 - this.field348;
                            this.field340 = -this.field340;
                            if (--this.field346 == 0) {
                                break label131;
                            }
                        }
                        do {
                            var9 = this.method911(arg0, var9, var6, var10, var4.field269[this.field350 - 1]);
                            if (this.field348 < var6) {
                                return;
                            }
                            this.field348 = var6 + var6 - 1 - this.field348;
                            this.field340 = -this.field340;
                            if (--this.field346 == 0) {
                                break;
                            }
                            var9 = this.method992(arg0, var9, var5, var10, var4.field269[this.field347]);
                            if (this.field348 >= var5) {
                                return;
                            }
                            this.field348 = var5 + var5 - 1 - this.field348;
                            this.field340 = -this.field340;
                        } while (--this.field346 != 0);
                    }
                } else if (this.field340 < 0) {
                    while (true) {
                        var9 = this.method992(arg0, var9, var5, var10, var4.field269[this.field350 - 1]);
                        if (this.field348 >= var5) {
                            return;
                        }
                        int var12 = (var6 - 1 - this.field348) / var8;
                        if (var12 >= this.field346) {
                            this.field348 += this.field346 * var8;
                            this.field346 = 0;
                            break;
                        }
                        this.field348 += var8 * var12;
                        this.field346 -= var12;
                    }
                } else {
                    while (true) {
                        var9 = this.method911(arg0, var9, var6, var10, var4.field269[this.field347]);
                        if (this.field348 < var6) {
                            return;
                        }
                        int var13 = (this.field348 - var5) / var8;
                        if (var13 >= this.field346) {
                            this.field348 -= this.field346 * var8;
                            this.field346 = 0;
                            break;
                        }
                        this.field348 -= var8 * var13;
                        this.field346 -= var13;
                    }
                }
            }
            if (this.field340 < 0) {
                this.method992(arg0, var9, 0, var10, 0);
                if (this.field348 < 0) {
                    this.field348 = -1;
                    this.method902();
                    this.method7988();
                }
            } else {
                this.method911(arg0, var9, var7, var10, 0);
                if (this.field348 >= var7) {
                    this.field348 = var7;
                    this.method902();
                    this.method7988();
                }
            }
        } else if (this.field344) {
            if (this.field340 < 0) {
                var9 = this.method992(arg0, arg1, var5, var10, var4.field269[this.field347]);
                if (this.field348 >= var5) {
                    return;
                }
                this.field348 = var5 + var5 - 1 - this.field348;
                this.field340 = -this.field340;
            }
            while (true) {
                int var11 = this.method911(arg0, var9, var6, var10, var4.field269[this.field350 - 1]);
                if (this.field348 < var6) {
                    return;
                }
                this.field348 = var6 + var6 - 1 - this.field348;
                this.field340 = -this.field340;
                var9 = this.method992(arg0, var11, var5, var10, var4.field269[this.field347]);
                if (this.field348 >= var5) {
                    return;
                }
                this.field348 = var5 + var5 - 1 - this.field348;
                this.field340 = -this.field340;
            }
        } else if (this.field340 < 0) {
            while (true) {
                var9 = this.method992(arg0, var9, var5, var10, var4.field269[this.field350 - 1]);
                if (this.field348 >= var5) {
                    return;
                }
                this.field348 = var6 - 1 - (var6 - 1 - this.field348) % var8;
            }
        } else {
            while (true) {
                var9 = this.method911(arg0, var9, var6, var10, var4.field269[this.field347]);
                if (this.field348 < var6) {
                    return;
                }
                this.field348 = (this.field348 - var5) % var8 + var5;
            }
        }
    }

    @ObfuscatedName("bs.au(I)V")
    public synchronized void method743(int arg0) {
        if (this.field343 > 0) {
            if (arg0 >= this.field343) {
                if (this.field349 == Integer.MIN_VALUE) {
                    this.field349 = 0;
                    this.field345 = 0;
                    this.field341 = 0;
                    this.field353 = 0;
                    this.method7988();
                    arg0 = this.field343;
                }
                this.field343 = 0;
                this.method988();
            } else {
                this.field353 += this.field351 * arg0;
                this.field341 += this.field352 * arg0;
                this.field345 += this.field339 * arg0;
                this.field343 -= arg0;
            }
        }
        class41 var2 = (class41) this.field356;
        int var3 = this.field347 << 8;
        int var4 = this.field350 << 8;
        int var5 = var2.field269.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field346 = 0;
        }
        if (this.field348 < 0) {
            if (this.field340 <= 0) {
                this.method902();
                this.method7988();
                return;
            }
            this.field348 = 0;
        }
        if (this.field348 >= var5) {
            if (this.field340 >= 0) {
                this.method902();
                this.method7988();
                return;
            }
            this.field348 = var5 - 1;
        }
        this.field348 += this.field340 * arg0;
        if (this.field346 >= 0) {
            if (this.field346 > 0) {
                if (this.field344) {
                    label121: {
                        if (this.field340 < 0) {
                            if (this.field348 >= var3) {
                                return;
                            }
                            this.field348 = var3 + var3 - 1 - this.field348;
                            this.field340 = -this.field340;
                            if (--this.field346 == 0) {
                                break label121;
                            }
                        }
                        do {
                            if (this.field348 < var4) {
                                return;
                            }
                            this.field348 = var4 + var4 - 1 - this.field348;
                            this.field340 = -this.field340;
                            if (--this.field346 == 0) {
                                break;
                            }
                            if (this.field348 >= var3) {
                                return;
                            }
                            this.field348 = var3 + var3 - 1 - this.field348;
                            this.field340 = -this.field340;
                        } while (--this.field346 != 0);
                    }
                } else {
                    label153: {
                        if (this.field340 < 0) {
                            if (this.field348 >= var3) {
                                return;
                            }
                            int var7 = (var4 - 1 - this.field348) / var6;
                            if (var7 >= this.field346) {
                                this.field348 += this.field346 * var6;
                                this.field346 = 0;
                                break label153;
                            }
                            this.field348 += var6 * var7;
                            this.field346 -= var7;
                        } else if (this.field348 >= var4) {
                            int var8 = (this.field348 - var3) / var6;
                            if (var8 >= this.field346) {
                                this.field348 -= this.field346 * var6;
                                this.field346 = 0;
                                break label153;
                            }
                            this.field348 -= var6 * var8;
                            this.field346 -= var8;
                        } else {
                            return;
                        }
                        return;
                    }
                }
            }
            if (this.field340 < 0) {
                if (this.field348 < 0) {
                    this.field348 = -1;
                    this.method902();
                    this.method7988();
                }
            } else if (this.field348 >= var5) {
                this.field348 = var5;
                this.method902();
                this.method7988();
            }
        } else if (this.field344) {
            if (this.field340 < 0) {
                if (this.field348 >= var3) {
                    return;
                }
                this.field348 = var3 + var3 - 1 - this.field348;
                this.field340 = -this.field340;
            }
            while (this.field348 >= var4) {
                this.field348 = var4 + var4 - 1 - this.field348;
                this.field340 = -this.field340;
                if (this.field348 >= var3) {
                    return;
                }
                this.field348 = var3 + var3 - 1 - this.field348;
                this.field340 = -this.field340;
            }
        } else if (this.field340 < 0) {
            if (this.field348 >= var3) {
                return;
            }
            this.field348 = var4 - 1 - (var4 - 1 - this.field348) % var6;
        } else if (this.field348 >= var4) {
            this.field348 = (this.field348 - var3) % var6 + var3;
        } else {
            return;
        }
    }

    @ObfuscatedName("bs.bc([IIIII)I")
    public int method911(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field343 > 0) {
                int var6 = this.field343 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field343 += arg1;
                if (this.field340 == 256 && (this.field348 & 0xFF) == 0) {
                    if (Statics.field4794) {
                        arg1 = method944(0, ((class41) this.field356).field269, arg0, this.field348, arg1, this.field341, this.field345, this.field352, this.field339, 0, var6, arg2, this);
                    } else {
                        arg1 = method921(((class41) this.field356).field269, arg0, this.field348, arg1, this.field353, this.field351, 0, var6, arg2, this);
                    }
                } else if (Statics.field4794) {
                    arg1 = method929(0, 0, ((class41) this.field356).field269, arg0, this.field348, arg1, this.field341, this.field345, this.field352, this.field339, 0, var6, arg2, this, this.field340, arg4);
                } else {
                    arg1 = method925(0, 0, ((class41) this.field356).field269, arg0, this.field348, arg1, this.field353, this.field351, 0, var6, arg2, this, this.field340, arg4);
                }
                this.field343 -= arg1;
                if (this.field343 != 0) {
                    return arg1;
                }
                if (!this.method913()) {
                    continue;
                }
                return arg3;
            }
            if (this.field340 == 256 && (this.field348 & 0xFF) == 0) {
                if (Statics.field4794) {
                    return method915(0, ((class41) this.field356).field269, arg0, this.field348, arg1, this.field341, this.field345, 0, arg3, arg2, this);
                }
                return method914(((class41) this.field356).field269, arg0, this.field348, arg1, this.field353, 0, arg3, arg2, this);
            }
            if (Statics.field4794) {
                return method919(0, 0, ((class41) this.field356).field269, arg0, this.field348, arg1, this.field341, this.field345, 0, arg3, arg2, this, this.field340, arg4);
            }
            return method918(0, 0, ((class41) this.field356).field269, arg0, this.field348, arg1, this.field353, 0, arg3, arg2, this, this.field340, arg4);
        }
    }

    @ObfuscatedName("bs.bf([IIIII)I")
    public int method992(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field343 > 0) {
                int var6 = this.field343 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field343 += arg1;
                if (this.field340 == -256 && (this.field348 & 0xFF) == 0) {
                    if (Statics.field4794) {
                        arg1 = method971(0, ((class41) this.field356).field269, arg0, this.field348, arg1, this.field341, this.field345, this.field352, this.field339, 0, var6, arg2, this);
                    } else {
                        arg1 = method900(((class41) this.field356).field269, arg0, this.field348, arg1, this.field353, this.field351, 0, var6, arg2, this);
                    }
                } else if (Statics.field4794) {
                    arg1 = method910(0, 0, ((class41) this.field356).field269, arg0, this.field348, arg1, this.field341, this.field345, this.field352, this.field339, 0, var6, arg2, this, this.field340, arg4);
                } else {
                    arg1 = method891(0, 0, ((class41) this.field356).field269, arg0, this.field348, arg1, this.field353, this.field351, 0, var6, arg2, this, this.field340, arg4);
                }
                this.field343 -= arg1;
                if (this.field343 != 0) {
                    return arg1;
                }
                if (!this.method913()) {
                    continue;
                }
                return arg3;
            }
            if (this.field340 == -256 && (this.field348 & 0xFF) == 0) {
                if (Statics.field4794) {
                    return method917(0, ((class41) this.field356).field269, arg0, this.field348, arg1, this.field341, this.field345, 0, arg3, arg2, this);
                }
                return method916(((class41) this.field356).field269, arg0, this.field348, arg1, this.field353, 0, arg3, arg2, this);
            }
            if (Statics.field4794) {
                return method928(0, 0, ((class41) this.field356).field269, arg0, this.field348, arg1, this.field341, this.field345, 0, arg3, arg2, this, this.field340, arg4);
            }
            return method966(0, 0, ((class41) this.field356).field269, arg0, this.field348, arg1, this.field353, 0, arg3, arg2, this, this.field340, arg4);
        }
    }

    @ObfuscatedName("bs.bp()Z")
    public boolean method913() {
        int var1 = this.field349;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method941(var1, this.field342);
            var2 = method889(var1, this.field342);
        }
        if (this.field353 != var1 || this.field341 != var3 || this.field345 != var2) {
            if (this.field353 < var1) {
                this.field351 = 1;
                this.field343 = var1 - this.field353;
            } else if (this.field353 > var1) {
                this.field351 = -1;
                this.field343 = this.field353 - var1;
            } else {
                this.field351 = 0;
            }
            if (this.field341 < var3) {
                this.field352 = 1;
                if (this.field343 == 0 || this.field343 > var3 - this.field341) {
                    this.field343 = var3 - this.field341;
                }
            } else if (this.field341 > var3) {
                this.field352 = -1;
                if (this.field343 == 0 || this.field343 > this.field341 - var3) {
                    this.field343 = this.field341 - var3;
                }
            } else {
                this.field352 = 0;
            }
            if (this.field345 < var2) {
                this.field339 = 1;
                if (this.field343 == 0 || this.field343 > var2 - this.field345) {
                    this.field343 = var2 - this.field345;
                }
            } else if (this.field345 > var2) {
                this.field339 = -1;
                if (this.field343 == 0 || this.field343 > this.field345 - var2) {
                    this.field343 = this.field345 - var2;
                }
            } else {
                this.field339 = 0;
            }
            return false;
        } else if (this.field349 == Integer.MIN_VALUE) {
            this.field349 = 0;
            this.field345 = 0;
            this.field341 = 0;
            this.field353 = 0;
            this.method7988();
            return true;
        } else {
            this.method988();
            return false;
        }
    }

    @ObfuscatedName("bs.bv([B[IIIIIIILbs;)I")
    public static int method914(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class49 arg8) {
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
        arg8.field348 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("bs.bm(I[B[IIIIIIIILbs;)I")
    public static int method915(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class49 arg10) {
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
        arg10.field348 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("bs.bq([B[IIIIIIILbs;)I")
    public static int method916(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class49 arg8) {
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
        arg8.field348 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("bs.bb(I[B[IIIIIIIILbs;)I")
    public static int method917(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class49 arg10) {
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
        arg10.field348 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("bs.bh(II[B[IIIIIIILbs;II)I")
    public static int method918(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class49 arg10, int arg11, int arg12) {
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
        arg10.field348 = arg4;
        return arg5;
    }

    @ObfuscatedName("bs.bw(II[B[IIIIIIIILbs;II)I")
    public static int method919(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class49 arg11, int arg12, int arg13) {
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
        arg11.field348 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("bs.bi(II[B[IIIIIIILbs;II)I")
    public static int method966(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class49 arg10, int arg11, int arg12) {
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
        arg10.field348 = arg4;
        return arg5;
    }

    @ObfuscatedName("bs.bu(II[B[IIIIIIIILbs;II)I")
    public static int method928(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class49 arg11, int arg12, int arg13) {
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
        arg11.field348 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("bs.be([B[IIIIIIIILbs;)I")
    public static int method921(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class49 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field341 += (var14 - arg3) * arg9.field352;
        arg9.field345 += (var14 - arg3) * arg9.field339;
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
        arg9.field353 = var12 >> 2;
        arg9.field348 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("bs.bs(I[B[IIIIIIIIIILbs;)I")
    public static int method944(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class49 arg12) {
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
        arg12.field353 += (var19 - arg4) * arg12.field351;
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
        arg12.field341 = var15 >> 2;
        arg12.field345 = var16 >> 2;
        arg12.field348 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("bs.bl([B[IIIIIIIILbs;)I")
    public static int method900(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class49 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field341 += (var14 - arg3) * arg9.field352;
        arg9.field345 += (var14 - arg3) * arg9.field339;
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
        arg9.field353 = var12 >> 2;
        arg9.field348 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("bs.bz(I[B[IIIIIIIIIILbs;)I")
    public static int method971(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class49 arg12) {
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
        arg12.field353 += (var19 - arg4) * arg12.field351;
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
        arg12.field341 = var15 >> 2;
        arg12.field345 = var16 >> 2;
        arg12.field348 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("bs.bo(II[B[IIIIIIIILbs;II)I")
    public static int method925(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class49 arg11, int arg12, int arg13) {
        arg11.field341 -= arg11.field352 * arg5;
        arg11.field345 -= arg11.field339 * arg5;
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
        arg11.field341 += arg11.field352 * arg5;
        arg11.field345 += arg11.field339 * arg5;
        arg11.field353 = arg6;
        arg11.field348 = arg4;
        return arg5;
    }

    @ObfuscatedName("bs.cg(II[B[IIIIIIIIIILbs;II)I")
    public static int method929(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class49 arg13, int arg14, int arg15) {
        arg13.field353 -= arg13.field351 * arg5;
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
        arg13.field353 += arg13.field351 * var27;
        arg13.field341 = arg6;
        arg13.field345 = arg7;
        arg13.field348 = arg4;
        return var27;
    }

    @ObfuscatedName("bs.cb(II[B[IIIIIIIILbs;II)I")
    public static int method891(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class49 arg11, int arg12, int arg13) {
        arg11.field341 -= arg11.field352 * arg5;
        arg11.field345 -= arg11.field339 * arg5;
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
        arg11.field341 += arg11.field352 * arg5;
        arg11.field345 += arg11.field339 * arg5;
        arg11.field353 = arg6;
        arg11.field348 = arg4;
        return arg5;
    }

    @ObfuscatedName("bs.ci(II[B[IIIIIIIIIILbs;II)I")
    public static int method910(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class49 arg13, int arg14, int arg15) {
        arg13.field353 -= arg13.field351 * arg5;
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
        arg13.field353 += arg13.field351 * var26;
        arg13.field341 = arg6;
        arg13.field345 = arg7;
        arg13.field348 = arg4;
        return var26;
    }
}
