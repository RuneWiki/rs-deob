package deob;

@ObfuscatedName("bn")
public class class48 extends class49 {

    @ObfuscatedName("bn.aj")
    public int field337;

    @ObfuscatedName("bn.al")
    public int field345;

    @ObfuscatedName("bn.ac")
    public int field336;

    @ObfuscatedName("bn.ab")
    public int field334;

    @ObfuscatedName("bn.an")
    public int field335;

    @ObfuscatedName("bn.ao")
    public int field339;

    @ObfuscatedName("bn.av")
    public int field340;

    @ObfuscatedName("bn.aq")
    public int field344;

    @ObfuscatedName("bn.ap")
    public int field342;

    @ObfuscatedName("bn.ar")
    public int field343;

    @ObfuscatedName("bn.ak")
    public boolean field338;

    @ObfuscatedName("bn.ax")
    public int field348;

    @ObfuscatedName("bn.as")
    public int field346;

    @ObfuscatedName("bn.ay")
    public int field347;

    @ObfuscatedName("bn.am")
    public int field341;

    @ObfuscatedName("bn.aj(II)I")
    public static int method914(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("bn.al(II)I")
    public static int method830(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("bn.by()I")
    public int method831() {
        int var1 = this.field335 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field344 == 0) {
            var2 -= this.field337 * var2 / (((class41) this.field349).field268.length << 8);
        } else if (this.field344 >= 0) {
            var2 -= this.field342 * var2 / ((class41) this.field349).field268.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    public class48(class41 arg0, int arg1, int arg2) {
        this.field349 = arg0;
        this.field342 = arg0.field269;
        this.field343 = arg0.field267;
        this.field338 = arg0.field270;
        this.field345 = arg1;
        this.field336 = arg2;
        this.field334 = 8192;
        this.field337 = 0;
        this.method835();
    }

    public class48(class41 arg0, int arg1, int arg2, int arg3) {
        this.field349 = arg0;
        this.field342 = arg0.field269;
        this.field343 = arg0.field267;
        this.field338 = arg0.field270;
        this.field345 = arg1;
        this.field336 = arg2;
        this.field334 = arg3;
        this.field337 = 0;
        this.method835();
    }

    @ObfuscatedName("bn.ac(Lbe;II)Lbn;")
    public static class48 method833(class41 arg0, int arg1, int arg2) {
        return arg0.field268 == null || arg0.field268.length == 0 ? null : new class48(arg0, (int) ((long) arg0.field271 * 256L * (long) arg1 / (long) (Statics.field293 * 100)), arg2 << 6);
    }

    @ObfuscatedName("bn.ab(Lbe;III)Lbn;")
    public static class48 method834(class41 arg0, int arg1, int arg2, int arg3) {
        return arg0.field268 == null || arg0.field268.length == 0 ? null : new class48(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("bn.an()V")
    public void method835() {
        this.field335 = this.field336;
        this.field339 = method914(this.field336, this.field334);
        this.field340 = method830(this.field336, this.field334);
    }

    @ObfuscatedName("bn.ar(I)V")
    public synchronized void method949(int arg0) {
        this.field344 = arg0;
    }

    @ObfuscatedName("bn.ax(I)V")
    public synchronized void method950(int arg0) {
        this.method839(arg0 << 6, this.method882());
    }

    @ObfuscatedName("bn.as(I)V")
    public synchronized void method874(int arg0) {
        this.method839(arg0, this.method882());
    }

    @ObfuscatedName("bn.ay(II)V")
    public synchronized void method839(int arg0, int arg1) {
        this.field336 = arg0;
        this.field334 = arg1;
        this.field348 = 0;
        this.method835();
    }

    @ObfuscatedName("bn.am()I")
    public synchronized int method840() {
        return this.field336 == Integer.MIN_VALUE ? 0 : this.field336;
    }

    @ObfuscatedName("bn.az()I")
    public synchronized int method882() {
        return this.field334 < 0 ? -1 : this.field334;
    }

    @ObfuscatedName("bn.ae(I)V")
    public synchronized void method915(int arg0) {
        int var2 = ((class41) this.field349).field268.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field337 = arg0;
    }

    @ObfuscatedName("bn.au(Z)V")
    public synchronized void method843(boolean arg0) {
        this.field345 = (this.field345 >>> 31) + (this.field345 ^ this.field345 >> 31);
        if (arg0) {
            this.field345 = -this.field345;
        }
    }

    @ObfuscatedName("bn.ag()V")
    public void method931() {
        if (this.field348 == 0) {
            return;
        }
        if (this.field336 == Integer.MIN_VALUE) {
            this.field336 = 0;
        }
        this.field348 = 0;
        this.method835();
    }

    @ObfuscatedName("bn.at(II)V")
    public synchronized void method845(int arg0, int arg1) {
        this.method846(arg0, arg1, this.method882());
    }

    @ObfuscatedName("bn.af(III)V")
    public synchronized void method846(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method839(arg1, arg2);
            return;
        }
        int var4 = method914(arg1, arg2);
        int var5 = method830(arg1, arg2);
        if (this.field339 == var4 && this.field340 == var5) {
            this.field348 = 0;
            return;
        }
        int var6 = arg1 - this.field335;
        if (this.field335 - arg1 > var6) {
            var6 = this.field335 - arg1;
        }
        if (var4 - this.field339 > var6) {
            var6 = var4 - this.field339;
        }
        if (this.field339 - var4 > var6) {
            var6 = this.field339 - var4;
        }
        if (var5 - this.field340 > var6) {
            var6 = var5 - this.field340;
        }
        if (this.field340 - var5 > var6) {
            var6 = this.field340 - var5;
        }
        if (arg0 > var6) {
            arg0 = var6;
        }
        this.field348 = arg0;
        this.field336 = arg1;
        this.field334 = arg2;
        this.field346 = (arg1 - this.field335) / arg0;
        this.field347 = (var4 - this.field339) / arg0;
        this.field341 = (var5 - this.field340) / arg0;
    }

    @ObfuscatedName("bn.ai(I)V")
    public synchronized void method847(int arg0) {
        if (arg0 == 0) {
            this.method874(0);
            this.method7335();
        } else if (this.field339 == 0 && this.field340 == 0) {
            this.field348 = 0;
            this.field336 = 0;
            this.field335 = 0;
            this.method7335();
        } else {
            int var2 = -this.field335;
            if (this.field335 > var2) {
                var2 = this.field335;
            }
            if (-this.field339 > var2) {
                var2 = -this.field339;
            }
            if (this.field339 > var2) {
                var2 = this.field339;
            }
            if (-this.field340 > var2) {
                var2 = -this.field340;
            }
            if (this.field340 > var2) {
                var2 = this.field340;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field348 = arg0;
            this.field336 = Integer.MIN_VALUE;
            this.field346 = -this.field335 / arg0;
            this.field347 = -this.field339 / arg0;
            this.field341 = -this.field340 / arg0;
        }
    }

    @ObfuscatedName("bn.aw(I)V")
    public synchronized void method848(int arg0) {
        if (this.field345 < 0) {
            this.field345 = -arg0;
        } else {
            this.field345 = arg0;
        }
    }

    @ObfuscatedName("bn.aa()I")
    public synchronized int method849() {
        return this.field345 < 0 ? -this.field345 : this.field345;
    }

    @ObfuscatedName("bn.ah()Z")
    public boolean method878() {
        return this.field337 < 0 || this.field337 >= ((class41) this.field349).field268.length << 8;
    }

    @ObfuscatedName("bn.bz()Z")
    public boolean method969() {
        return this.field348 != 0;
    }

    @ObfuscatedName("bn.ao()Lbj;")
    public class49 method681() {
        return null;
    }

    @ObfuscatedName("bn.av()Lbj;")
    public class49 method688() {
        return null;
    }

    @ObfuscatedName("bn.aq()I")
    public int method683() {
        return this.field336 == 0 && this.field348 == 0 ? 0 : 1;
    }

    @ObfuscatedName("bn.ap([III)V")
    public synchronized void method705(int[] arg0, int arg1, int arg2) {
        if (this.field336 == 0 && this.field348 == 0) {
            this.method686(arg2);
            return;
        }
        class41 var4 = (class41) this.field349;
        int var5 = this.field342 << 8;
        int var6 = this.field343 << 8;
        int var7 = var4.field268.length << 8;
        int var8 = var6 - var5;
        if (var8 <= 0) {
            this.field344 = 0;
        }
        int var9 = arg1;
        int var10 = arg1 + arg2;
        if (this.field337 < 0) {
            if (this.field345 <= 0) {
                this.method931();
                this.method7335();
                return;
            }
            this.field337 = 0;
        }
        if (this.field337 >= var7) {
            if (this.field345 >= 0) {
                this.method931();
                this.method7335();
                return;
            }
            this.field337 = var7 - 1;
        }
        if (this.field344 >= 0) {
            if (this.field344 > 0) {
                if (this.field338) {
                    label131: {
                        if (this.field345 < 0) {
                            var9 = this.method851(arg0, arg1, var5, var10, var4.field268[this.field342]);
                            if (this.field337 >= var5) {
                                return;
                            }
                            this.field337 = var5 + var5 - 1 - this.field337;
                            this.field345 = -this.field345;
                            if (--this.field344 == 0) {
                                break label131;
                            }
                        }
                        do {
                            var9 = this.method857(arg0, var9, var6, var10, var4.field268[this.field343 - 1]);
                            if (this.field337 < var6) {
                                return;
                            }
                            this.field337 = var6 + var6 - 1 - this.field337;
                            this.field345 = -this.field345;
                            if (--this.field344 == 0) {
                                break;
                            }
                            var9 = this.method851(arg0, var9, var5, var10, var4.field268[this.field342]);
                            if (this.field337 >= var5) {
                                return;
                            }
                            this.field337 = var5 + var5 - 1 - this.field337;
                            this.field345 = -this.field345;
                        } while (--this.field344 != 0);
                    }
                } else if (this.field345 < 0) {
                    while (true) {
                        var9 = this.method851(arg0, var9, var5, var10, var4.field268[this.field343 - 1]);
                        if (this.field337 >= var5) {
                            return;
                        }
                        int var12 = (var6 - 1 - this.field337) / var8;
                        if (var12 >= this.field344) {
                            this.field337 += this.field344 * var8;
                            this.field344 = 0;
                            break;
                        }
                        this.field337 += var8 * var12;
                        this.field344 -= var12;
                    }
                } else {
                    while (true) {
                        var9 = this.method857(arg0, var9, var6, var10, var4.field268[this.field342]);
                        if (this.field337 < var6) {
                            return;
                        }
                        int var13 = (this.field337 - var5) / var8;
                        if (var13 >= this.field344) {
                            this.field337 -= this.field344 * var8;
                            this.field344 = 0;
                            break;
                        }
                        this.field337 -= var8 * var13;
                        this.field344 -= var13;
                    }
                }
            }
            if (this.field345 < 0) {
                this.method851(arg0, var9, 0, var10, 0);
                if (this.field337 < 0) {
                    this.field337 = -1;
                    this.method931();
                    this.method7335();
                }
            } else {
                this.method857(arg0, var9, var7, var10, 0);
                if (this.field337 >= var7) {
                    this.field337 = var7;
                    this.method931();
                    this.method7335();
                }
            }
        } else if (this.field338) {
            if (this.field345 < 0) {
                var9 = this.method851(arg0, arg1, var5, var10, var4.field268[this.field342]);
                if (this.field337 >= var5) {
                    return;
                }
                this.field337 = var5 + var5 - 1 - this.field337;
                this.field345 = -this.field345;
            }
            while (true) {
                int var11 = this.method857(arg0, var9, var6, var10, var4.field268[this.field343 - 1]);
                if (this.field337 < var6) {
                    return;
                }
                this.field337 = var6 + var6 - 1 - this.field337;
                this.field345 = -this.field345;
                var9 = this.method851(arg0, var11, var5, var10, var4.field268[this.field342]);
                if (this.field337 >= var5) {
                    return;
                }
                this.field337 = var5 + var5 - 1 - this.field337;
                this.field345 = -this.field345;
            }
        } else if (this.field345 < 0) {
            while (true) {
                var9 = this.method851(arg0, var9, var5, var10, var4.field268[this.field343 - 1]);
                if (this.field337 >= var5) {
                    return;
                }
                this.field337 = var6 - 1 - (var6 - 1 - this.field337) % var8;
            }
        } else {
            while (true) {
                var9 = this.method857(arg0, var9, var6, var10, var4.field268[this.field342]);
                if (this.field337 < var6) {
                    return;
                }
                this.field337 = (this.field337 - var5) % var8 + var5;
            }
        }
    }

    @ObfuscatedName("bn.ak(I)V")
    public synchronized void method686(int arg0) {
        if (this.field348 > 0) {
            if (arg0 >= this.field348) {
                if (this.field336 == Integer.MIN_VALUE) {
                    this.field336 = 0;
                    this.field340 = 0;
                    this.field339 = 0;
                    this.field335 = 0;
                    this.method7335();
                    arg0 = this.field348;
                }
                this.field348 = 0;
                this.method835();
            } else {
                this.field335 += this.field346 * arg0;
                this.field339 += this.field347 * arg0;
                this.field340 += this.field341 * arg0;
                this.field348 -= arg0;
            }
        }
        class41 var2 = (class41) this.field349;
        int var3 = this.field342 << 8;
        int var4 = this.field343 << 8;
        int var5 = var2.field268.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field344 = 0;
        }
        if (this.field337 < 0) {
            if (this.field345 <= 0) {
                this.method931();
                this.method7335();
                return;
            }
            this.field337 = 0;
        }
        if (this.field337 >= var5) {
            if (this.field345 >= 0) {
                this.method931();
                this.method7335();
                return;
            }
            this.field337 = var5 - 1;
        }
        this.field337 += this.field345 * arg0;
        if (this.field344 >= 0) {
            if (this.field344 > 0) {
                if (this.field338) {
                    label121: {
                        if (this.field345 < 0) {
                            if (this.field337 >= var3) {
                                return;
                            }
                            this.field337 = var3 + var3 - 1 - this.field337;
                            this.field345 = -this.field345;
                            if (--this.field344 == 0) {
                                break label121;
                            }
                        }
                        do {
                            if (this.field337 < var4) {
                                return;
                            }
                            this.field337 = var4 + var4 - 1 - this.field337;
                            this.field345 = -this.field345;
                            if (--this.field344 == 0) {
                                break;
                            }
                            if (this.field337 >= var3) {
                                return;
                            }
                            this.field337 = var3 + var3 - 1 - this.field337;
                            this.field345 = -this.field345;
                        } while (--this.field344 != 0);
                    }
                } else {
                    label153: {
                        if (this.field345 < 0) {
                            if (this.field337 >= var3) {
                                return;
                            }
                            int var7 = (var4 - 1 - this.field337) / var6;
                            if (var7 >= this.field344) {
                                this.field337 += this.field344 * var6;
                                this.field344 = 0;
                                break label153;
                            }
                            this.field337 += var6 * var7;
                            this.field344 -= var7;
                        } else if (this.field337 >= var4) {
                            int var8 = (this.field337 - var3) / var6;
                            if (var8 >= this.field344) {
                                this.field337 -= this.field344 * var6;
                                this.field344 = 0;
                                break label153;
                            }
                            this.field337 -= var6 * var8;
                            this.field344 -= var8;
                        } else {
                            return;
                        }
                        return;
                    }
                }
            }
            if (this.field345 < 0) {
                if (this.field337 < 0) {
                    this.field337 = -1;
                    this.method931();
                    this.method7335();
                }
            } else if (this.field337 >= var5) {
                this.field337 = var5;
                this.method931();
                this.method7335();
            }
        } else if (this.field338) {
            if (this.field345 < 0) {
                if (this.field337 >= var3) {
                    return;
                }
                this.field337 = var3 + var3 - 1 - this.field337;
                this.field345 = -this.field345;
            }
            while (this.field337 >= var4) {
                this.field337 = var4 + var4 - 1 - this.field337;
                this.field345 = -this.field345;
                if (this.field337 >= var3) {
                    return;
                }
                this.field337 = var3 + var3 - 1 - this.field337;
                this.field345 = -this.field345;
            }
        } else if (this.field345 < 0) {
            if (this.field337 >= var3) {
                return;
            }
            this.field337 = var4 - 1 - (var4 - 1 - this.field337) % var6;
        } else if (this.field337 >= var4) {
            this.field337 = (this.field337 - var3) % var6 + var3;
        } else {
            return;
        }
    }

    @ObfuscatedName("bn.bq([IIIII)I")
    public int method857(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field348 > 0) {
                int var6 = this.field348 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field348 += arg1;
                if (this.field345 == 256 && (this.field337 & 0xFF) == 0) {
                    if (Statics.field992) {
                        arg1 = method862(0, ((class41) this.field349).field268, arg0, this.field337, arg1, this.field339, this.field340, this.field347, this.field341, 0, var6, arg2, this);
                    } else {
                        arg1 = method861(((class41) this.field349).field268, arg0, this.field337, arg1, this.field335, this.field346, 0, var6, arg2, this);
                    }
                } else if (Statics.field992) {
                    arg1 = method866(0, 0, ((class41) this.field349).field268, arg0, this.field337, arg1, this.field339, this.field340, this.field347, this.field341, 0, var6, arg2, this, this.field345, arg4);
                } else {
                    arg1 = method865(0, 0, ((class41) this.field349).field268, arg0, this.field337, arg1, this.field335, this.field346, 0, var6, arg2, this, this.field345, arg4);
                }
                this.field348 -= arg1;
                if (this.field348 != 0) {
                    return arg1;
                }
                if (!this.method852()) {
                    continue;
                }
                return arg3;
            }
            if (this.field345 == 256 && (this.field337 & 0xFF) == 0) {
                if (Statics.field992) {
                    return method897(0, ((class41) this.field349).field268, arg0, this.field337, arg1, this.field339, this.field340, 0, arg3, arg2, this);
                }
                return method853(((class41) this.field349).field268, arg0, this.field337, arg1, this.field335, 0, arg3, arg2, this);
            }
            if (Statics.field992) {
                return method938(0, 0, ((class41) this.field349).field268, arg0, this.field337, arg1, this.field339, this.field340, 0, arg3, arg2, this, this.field345, arg4);
            }
            return method832(0, 0, ((class41) this.field349).field268, arg0, this.field337, arg1, this.field335, 0, arg3, arg2, this, this.field345, arg4);
        }
    }

    @ObfuscatedName("bn.bc([IIIII)I")
    public int method851(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field348 > 0) {
                int var6 = this.field348 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field348 += arg1;
                if (this.field345 == -256 && (this.field337 & 0xFF) == 0) {
                    if (Statics.field992) {
                        arg1 = method864(0, ((class41) this.field349).field268, arg0, this.field337, arg1, this.field339, this.field340, this.field347, this.field341, 0, var6, arg2, this);
                    } else {
                        arg1 = method863(((class41) this.field349).field268, arg0, this.field337, arg1, this.field335, this.field346, 0, var6, arg2, this);
                    }
                } else if (Statics.field992) {
                    arg1 = method868(0, 0, ((class41) this.field349).field268, arg0, this.field337, arg1, this.field339, this.field340, this.field347, this.field341, 0, var6, arg2, this, this.field345, arg4);
                } else {
                    arg1 = method844(0, 0, ((class41) this.field349).field268, arg0, this.field337, arg1, this.field335, this.field346, 0, var6, arg2, this, this.field345, arg4);
                }
                this.field348 -= arg1;
                if (this.field348 != 0) {
                    return arg1;
                }
                if (!this.method852()) {
                    continue;
                }
                return arg3;
            }
            if (this.field345 == -256 && (this.field337 & 0xFF) == 0) {
                if (Statics.field992) {
                    return method921(0, ((class41) this.field349).field268, arg0, this.field337, arg1, this.field339, this.field340, 0, arg3, arg2, this);
                }
                return method943(((class41) this.field349).field268, arg0, this.field337, arg1, this.field335, 0, arg3, arg2, this);
            }
            if (Statics.field992) {
                return method860(0, 0, ((class41) this.field349).field268, arg0, this.field337, arg1, this.field339, this.field340, 0, arg3, arg2, this, this.field345, arg4);
            }
            return method859(0, 0, ((class41) this.field349).field268, arg0, this.field337, arg1, this.field335, 0, arg3, arg2, this, this.field345, arg4);
        }
    }

    @ObfuscatedName("bn.bu()Z")
    public boolean method852() {
        int var1 = this.field336;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method914(var1, this.field334);
            var2 = method830(var1, this.field334);
        }
        if (this.field335 != var1 || this.field339 != var3 || this.field340 != var2) {
            if (this.field335 < var1) {
                this.field346 = 1;
                this.field348 = var1 - this.field335;
            } else if (this.field335 > var1) {
                this.field346 = -1;
                this.field348 = this.field335 - var1;
            } else {
                this.field346 = 0;
            }
            if (this.field339 < var3) {
                this.field347 = 1;
                if (this.field348 == 0 || this.field348 > var3 - this.field339) {
                    this.field348 = var3 - this.field339;
                }
            } else if (this.field339 > var3) {
                this.field347 = -1;
                if (this.field348 == 0 || this.field348 > this.field339 - var3) {
                    this.field348 = this.field339 - var3;
                }
            } else {
                this.field347 = 0;
            }
            if (this.field340 < var2) {
                this.field341 = 1;
                if (this.field348 == 0 || this.field348 > var2 - this.field340) {
                    this.field348 = var2 - this.field340;
                }
            } else if (this.field340 > var2) {
                this.field341 = -1;
                if (this.field348 == 0 || this.field348 > this.field340 - var2) {
                    this.field348 = this.field340 - var2;
                }
            } else {
                this.field341 = 0;
            }
            return false;
        } else if (this.field336 == Integer.MIN_VALUE) {
            this.field336 = 0;
            this.field340 = 0;
            this.field339 = 0;
            this.field335 = 0;
            this.method7335();
            return true;
        } else {
            this.method835();
            return false;
        }
    }

    @ObfuscatedName("bn.bd([B[IIIIIIILbn;)I")
    public static int method853(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class48 arg8) {
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
        arg8.field337 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("bn.bp(I[B[IIIIIIIILbn;)I")
    public static int method897(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class48 arg10) {
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
        arg10.field337 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("bn.bb([B[IIIIIIILbn;)I")
    public static int method943(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class48 arg8) {
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
        arg8.field337 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("bn.bx(I[B[IIIIIIIILbn;)I")
    public static int method921(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class48 arg10) {
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
        arg10.field337 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("bn.bn(II[B[IIIIIIILbn;II)I")
    public static int method832(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class48 arg10, int arg11, int arg12) {
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
        arg10.field337 = arg4;
        return arg5;
    }

    @ObfuscatedName("bn.bj(II[B[IIIIIIIILbn;II)I")
    public static int method938(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class48 arg11, int arg12, int arg13) {
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
        arg11.field337 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("bn.bf(II[B[IIIIIIILbn;II)I")
    public static int method859(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class48 arg10, int arg11, int arg12) {
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
        arg10.field337 = arg4;
        return arg5;
    }

    @ObfuscatedName("bn.bw(II[B[IIIIIIIILbn;II)I")
    public static int method860(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class48 arg11, int arg12, int arg13) {
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
        arg11.field337 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("bn.bi([B[IIIIIIIILbn;)I")
    public static int method861(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class48 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field339 += (var14 - arg3) * arg9.field347;
        arg9.field340 += (var14 - arg3) * arg9.field341;
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
        arg9.field335 = var12 >> 2;
        arg9.field337 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("bn.cl(I[B[IIIIIIIIIILbn;)I")
    public static int method862(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class48 arg12) {
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
        arg12.field335 += (var19 - arg4) * arg12.field346;
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
        arg12.field339 = var15 >> 2;
        arg12.field340 = var16 >> 2;
        arg12.field337 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("bn.ca([B[IIIIIIIILbn;)I")
    public static int method863(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class48 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field339 += (var14 - arg3) * arg9.field347;
        arg9.field340 += (var14 - arg3) * arg9.field341;
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
        arg9.field335 = var12 >> 2;
        arg9.field337 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("bn.cb(I[B[IIIIIIIIIILbn;)I")
    public static int method864(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class48 arg12) {
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
        arg12.field335 += (var19 - arg4) * arg12.field346;
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
        arg12.field339 = var15 >> 2;
        arg12.field340 = var16 >> 2;
        arg12.field337 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("bn.co(II[B[IIIIIIIILbn;II)I")
    public static int method865(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class48 arg11, int arg12, int arg13) {
        arg11.field339 -= arg11.field347 * arg5;
        arg11.field340 -= arg11.field341 * arg5;
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
        arg11.field339 += arg11.field347 * arg5;
        arg11.field340 += arg11.field341 * arg5;
        arg11.field335 = arg6;
        arg11.field337 = arg4;
        return arg5;
    }

    @ObfuscatedName("bn.cj(II[B[IIIIIIIIIILbn;II)I")
    public static int method866(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class48 arg13, int arg14, int arg15) {
        arg13.field335 -= arg13.field346 * arg5;
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
        arg13.field335 += arg13.field346 * var27;
        arg13.field339 = arg6;
        arg13.field340 = arg7;
        arg13.field337 = arg4;
        return var27;
    }

    @ObfuscatedName("bn.cn(II[B[IIIIIIIILbn;II)I")
    public static int method844(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class48 arg11, int arg12, int arg13) {
        arg11.field339 -= arg11.field347 * arg5;
        arg11.field340 -= arg11.field341 * arg5;
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
        arg11.field339 += arg11.field347 * arg5;
        arg11.field340 += arg11.field341 * arg5;
        arg11.field335 = arg6;
        arg11.field337 = arg4;
        return arg5;
    }

    @ObfuscatedName("bn.ce(II[B[IIIIIIIIIILbn;II)I")
    public static int method868(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class48 arg13, int arg14, int arg15) {
        arg13.field335 -= arg13.field346 * arg5;
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
        arg13.field335 += arg13.field346 * var26;
        arg13.field339 = arg6;
        arg13.field340 = arg7;
        arg13.field337 = arg4;
        return var26;
    }
}
