package deob;

@ObfuscatedName("bz")
public class class49 extends class50 {

    @ObfuscatedName("bz.ak")
    public int field345;

    @ObfuscatedName("bz.al")
    public int field341;

    @ObfuscatedName("bz.aj")
    public int field346;

    @ObfuscatedName("bz.az")
    public int field354;

    @ObfuscatedName("bz.af")
    public int field344;

    @ObfuscatedName("bz.aa")
    public int field340;

    @ObfuscatedName("bz.at")
    public int field343;

    @ObfuscatedName("bz.ab")
    public int field347;

    @ObfuscatedName("bz.ac")
    public int field348;

    @ObfuscatedName("bz.ao")
    public int field349;

    @ObfuscatedName("bz.ah")
    public boolean field350;

    @ObfuscatedName("bz.av")
    public int field351;

    @ObfuscatedName("bz.aq")
    public int field352;

    @ObfuscatedName("bz.ap")
    public int field342;

    @ObfuscatedName("bz.ae")
    public int field353;

    @ObfuscatedName("bz.ak(II)I")
    public static int method882(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("bz.al(II)I")
    public static int method859(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("bz.bp()I")
    public int method860() {
        int var1 = this.field344 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field347 == 0) {
            var2 -= this.field345 * var2 / (((class41) this.field357).field269.length << 8);
        } else if (this.field347 >= 0) {
            var2 -= this.field348 * var2 / ((class41) this.field357).field269.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    public class49(class41 arg0, int arg1, int arg2) {
        this.field357 = arg0;
        this.field348 = arg0.field266;
        this.field349 = arg0.field268;
        this.field350 = arg0.field270;
        this.field341 = arg1;
        this.field346 = arg2;
        this.field354 = 8192;
        this.field345 = 0;
        this.method865();
    }

    public class49(class41 arg0, int arg1, int arg2, int arg3) {
        this.field357 = arg0;
        this.field348 = arg0.field266;
        this.field349 = arg0.field268;
        this.field350 = arg0.field270;
        this.field341 = arg1;
        this.field346 = arg2;
        this.field354 = arg3;
        this.field345 = 0;
        this.method865();
    }

    @ObfuscatedName("bz.aj(Lbr;II)Lbz;")
    public static class49 method863(class41 arg0, int arg1, int arg2) {
        return arg0.field269 == null || arg0.field269.length == 0 ? null : new class49(arg0, (int) ((long) arg0.field267 * 256L * (long) arg1 / (long) (Statics.field1509 * 100)), arg2 << 6);
    }

    @ObfuscatedName("bz.az(Lbr;III)Lbz;")
    public static class49 method864(class41 arg0, int arg1, int arg2, int arg3) {
        return arg0.field269 == null || arg0.field269.length == 0 ? null : new class49(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("bz.af()V")
    public void method865() {
        this.field344 = this.field346;
        this.field340 = method882(this.field346, this.field354);
        this.field343 = method859(this.field346, this.field354);
    }

    @ObfuscatedName("bz.ao(I)V")
    public synchronized void method866(int arg0) {
        this.field347 = arg0;
    }

    @ObfuscatedName("bz.av(I)V")
    public synchronized void method867(int arg0) {
        this.method976(arg0 << 6, this.method861());
    }

    @ObfuscatedName("bz.aq(I)V")
    public synchronized void method868(int arg0) {
        this.method976(arg0, this.method861());
    }

    @ObfuscatedName("bz.ap(II)V")
    public synchronized void method976(int arg0, int arg1) {
        this.field346 = arg0;
        this.field354 = arg1;
        this.field351 = 0;
        this.method865();
    }

    @ObfuscatedName("bz.ae()I")
    public synchronized int method926() {
        return this.field346 == Integer.MIN_VALUE ? 0 : this.field346;
    }

    @ObfuscatedName("bz.ax()I")
    public synchronized int method861() {
        return this.field354 < 0 ? -1 : this.field354;
    }

    @ObfuscatedName("bz.ay(I)V")
    public synchronized void method872(int arg0) {
        int var2 = ((class41) this.field357).field269.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field345 = arg0;
    }

    @ObfuscatedName("bz.au(Z)V")
    public synchronized void method873(boolean arg0) {
        this.field341 = (this.field341 >>> 31) + (this.field341 ^ this.field341 >> 31);
        if (arg0) {
            this.field341 = -this.field341;
        }
    }

    @ObfuscatedName("bz.as()V")
    public void method874() {
        if (this.field351 == 0) {
            return;
        }
        if (this.field346 == Integer.MIN_VALUE) {
            this.field346 = 0;
        }
        this.field351 = 0;
        this.method865();
    }

    @ObfuscatedName("bz.aw(II)V")
    public synchronized void method875(int arg0, int arg1) {
        this.method876(arg0, arg1, this.method861());
    }

    @ObfuscatedName("bz.ad(III)V")
    public synchronized void method876(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method976(arg1, arg2);
            return;
        }
        int var4 = method882(arg1, arg2);
        int var5 = method859(arg1, arg2);
        if (this.field340 == var4 && this.field343 == var5) {
            this.field351 = 0;
            return;
        }
        int var6 = arg1 - this.field344;
        if (this.field344 - arg1 > var6) {
            var6 = this.field344 - arg1;
        }
        if (var4 - this.field340 > var6) {
            var6 = var4 - this.field340;
        }
        if (this.field340 - var4 > var6) {
            var6 = this.field340 - var4;
        }
        if (var5 - this.field343 > var6) {
            var6 = var5 - this.field343;
        }
        if (this.field343 - var5 > var6) {
            var6 = this.field343 - var5;
        }
        if (arg0 > var6) {
            arg0 = var6;
        }
        this.field351 = arg0;
        this.field346 = arg1;
        this.field354 = arg2;
        this.field352 = (arg1 - this.field344) / arg0;
        this.field342 = (var4 - this.field340) / arg0;
        this.field353 = (var5 - this.field343) / arg0;
    }

    @ObfuscatedName("bz.bn(I)V")
    public synchronized void method877(int arg0) {
        if (arg0 == 0) {
            this.method868(0);
            this.method8189();
        } else if (this.field340 == 0 && this.field343 == 0) {
            this.field351 = 0;
            this.field346 = 0;
            this.field344 = 0;
            this.method8189();
        } else {
            int var2 = -this.field344;
            if (this.field344 > var2) {
                var2 = this.field344;
            }
            if (-this.field340 > var2) {
                var2 = -this.field340;
            }
            if (this.field340 > var2) {
                var2 = this.field340;
            }
            if (-this.field343 > var2) {
                var2 = -this.field343;
            }
            if (this.field343 > var2) {
                var2 = this.field343;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field351 = arg0;
            this.field346 = Integer.MIN_VALUE;
            this.field352 = -this.field344 / arg0;
            this.field342 = -this.field340 / arg0;
            this.field353 = -this.field343 / arg0;
        }
    }

    @ObfuscatedName("bz.bw(I)V")
    public synchronized void method878(int arg0) {
        if (this.field341 < 0) {
            this.field341 = -arg0;
        } else {
            this.field341 = arg0;
        }
    }

    @ObfuscatedName("bz.bu()I")
    public synchronized int method879() {
        return this.field341 < 0 ? -this.field341 : this.field341;
    }

    @ObfuscatedName("bz.bh()Z")
    public boolean method885() {
        return this.field345 < 0 || this.field345 >= ((class41) this.field357).field269.length << 8;
    }

    @ObfuscatedName("bz.bk()Z")
    public boolean method881() {
        return this.field351 != 0;
    }

    @ObfuscatedName("bz.aa()Lba;")
    public class50 method704() {
        return null;
    }

    @ObfuscatedName("bz.at()Lba;")
    public class50 method705() {
        return null;
    }

    @ObfuscatedName("bz.ab()I")
    public int method706() {
        return this.field346 == 0 && this.field351 == 0 ? 0 : 1;
    }

    @ObfuscatedName("bz.ac([III)V")
    public synchronized void method707(int[] arg0, int arg1, int arg2) {
        if (this.field346 == 0 && this.field351 == 0) {
            this.method713(arg2);
            return;
        }
        class41 var4 = (class41) this.field357;
        int var5 = this.field348 << 8;
        int var6 = this.field349 << 8;
        int var7 = var4.field269.length << 8;
        int var8 = var6 - var5;
        if (var8 <= 0) {
            this.field347 = 0;
        }
        int var9 = arg1;
        int var10 = arg1 + arg2;
        if (this.field345 < 0) {
            if (this.field341 <= 0) {
                this.method874();
                this.method8189();
                return;
            }
            this.field345 = 0;
        }
        if (this.field345 >= var7) {
            if (this.field341 >= 0) {
                this.method874();
                this.method8189();
                return;
            }
            this.field345 = var7 - 1;
        }
        if (this.field347 >= 0) {
            if (this.field347 > 0) {
                if (this.field350) {
                    label131: {
                        if (this.field341 < 0) {
                            var9 = this.method929(arg0, arg1, var5, var10, var4.field269[this.field348]);
                            if (this.field345 >= var5) {
                                return;
                            }
                            this.field345 = var5 + var5 - 1 - this.field345;
                            this.field341 = -this.field341;
                            if (--this.field347 == 0) {
                                break label131;
                            }
                        }
                        do {
                            var9 = this.method884(arg0, var9, var6, var10, var4.field269[this.field349 - 1]);
                            if (this.field345 < var6) {
                                return;
                            }
                            this.field345 = var6 + var6 - 1 - this.field345;
                            this.field341 = -this.field341;
                            if (--this.field347 == 0) {
                                break;
                            }
                            var9 = this.method929(arg0, var9, var5, var10, var4.field269[this.field348]);
                            if (this.field345 >= var5) {
                                return;
                            }
                            this.field345 = var5 + var5 - 1 - this.field345;
                            this.field341 = -this.field341;
                        } while (--this.field347 != 0);
                    }
                } else if (this.field341 < 0) {
                    while (true) {
                        var9 = this.method929(arg0, var9, var5, var10, var4.field269[this.field349 - 1]);
                        if (this.field345 >= var5) {
                            return;
                        }
                        int var12 = (var6 - 1 - this.field345) / var8;
                        if (var12 >= this.field347) {
                            this.field345 += this.field347 * var8;
                            this.field347 = 0;
                            break;
                        }
                        this.field345 += var8 * var12;
                        this.field347 -= var12;
                    }
                } else {
                    while (true) {
                        var9 = this.method884(arg0, var9, var6, var10, var4.field269[this.field348]);
                        if (this.field345 < var6) {
                            return;
                        }
                        int var13 = (this.field345 - var5) / var8;
                        if (var13 >= this.field347) {
                            this.field345 -= this.field347 * var8;
                            this.field347 = 0;
                            break;
                        }
                        this.field345 -= var8 * var13;
                        this.field347 -= var13;
                    }
                }
            }
            if (this.field341 < 0) {
                this.method929(arg0, var9, 0, var10, 0);
                if (this.field345 < 0) {
                    this.field345 = -1;
                    this.method874();
                    this.method8189();
                }
            } else {
                this.method884(arg0, var9, var7, var10, 0);
                if (this.field345 >= var7) {
                    this.field345 = var7;
                    this.method874();
                    this.method8189();
                }
            }
        } else if (this.field350) {
            if (this.field341 < 0) {
                var9 = this.method929(arg0, arg1, var5, var10, var4.field269[this.field348]);
                if (this.field345 >= var5) {
                    return;
                }
                this.field345 = var5 + var5 - 1 - this.field345;
                this.field341 = -this.field341;
            }
            while (true) {
                int var11 = this.method884(arg0, var9, var6, var10, var4.field269[this.field349 - 1]);
                if (this.field345 < var6) {
                    return;
                }
                this.field345 = var6 + var6 - 1 - this.field345;
                this.field341 = -this.field341;
                var9 = this.method929(arg0, var11, var5, var10, var4.field269[this.field348]);
                if (this.field345 >= var5) {
                    return;
                }
                this.field345 = var5 + var5 - 1 - this.field345;
                this.field341 = -this.field341;
            }
        } else if (this.field341 < 0) {
            while (true) {
                var9 = this.method929(arg0, var9, var5, var10, var4.field269[this.field349 - 1]);
                if (this.field345 >= var5) {
                    return;
                }
                this.field345 = var6 - 1 - (var6 - 1 - this.field345) % var8;
            }
        } else {
            while (true) {
                var9 = this.method884(arg0, var9, var6, var10, var4.field269[this.field348]);
                if (this.field345 < var6) {
                    return;
                }
                this.field345 = (this.field345 - var5) % var8 + var5;
            }
        }
    }

    @ObfuscatedName("bz.ah(I)V")
    public synchronized void method713(int arg0) {
        if (this.field351 > 0) {
            if (arg0 >= this.field351) {
                if (this.field346 == Integer.MIN_VALUE) {
                    this.field346 = 0;
                    this.field343 = 0;
                    this.field340 = 0;
                    this.field344 = 0;
                    this.method8189();
                    arg0 = this.field351;
                }
                this.field351 = 0;
                this.method865();
            } else {
                this.field344 += this.field352 * arg0;
                this.field340 += this.field342 * arg0;
                this.field343 += this.field353 * arg0;
                this.field351 -= arg0;
            }
        }
        class41 var2 = (class41) this.field357;
        int var3 = this.field348 << 8;
        int var4 = this.field349 << 8;
        int var5 = var2.field269.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field347 = 0;
        }
        if (this.field345 < 0) {
            if (this.field341 <= 0) {
                this.method874();
                this.method8189();
                return;
            }
            this.field345 = 0;
        }
        if (this.field345 >= var5) {
            if (this.field341 >= 0) {
                this.method874();
                this.method8189();
                return;
            }
            this.field345 = var5 - 1;
        }
        this.field345 += this.field341 * arg0;
        if (this.field347 >= 0) {
            if (this.field347 > 0) {
                if (this.field350) {
                    label121: {
                        if (this.field341 < 0) {
                            if (this.field345 >= var3) {
                                return;
                            }
                            this.field345 = var3 + var3 - 1 - this.field345;
                            this.field341 = -this.field341;
                            if (--this.field347 == 0) {
                                break label121;
                            }
                        }
                        do {
                            if (this.field345 < var4) {
                                return;
                            }
                            this.field345 = var4 + var4 - 1 - this.field345;
                            this.field341 = -this.field341;
                            if (--this.field347 == 0) {
                                break;
                            }
                            if (this.field345 >= var3) {
                                return;
                            }
                            this.field345 = var3 + var3 - 1 - this.field345;
                            this.field341 = -this.field341;
                        } while (--this.field347 != 0);
                    }
                } else {
                    label153: {
                        if (this.field341 < 0) {
                            if (this.field345 >= var3) {
                                return;
                            }
                            int var7 = (var4 - 1 - this.field345) / var6;
                            if (var7 >= this.field347) {
                                this.field345 += this.field347 * var6;
                                this.field347 = 0;
                                break label153;
                            }
                            this.field345 += var6 * var7;
                            this.field347 -= var7;
                        } else if (this.field345 >= var4) {
                            int var8 = (this.field345 - var3) / var6;
                            if (var8 >= this.field347) {
                                this.field345 -= this.field347 * var6;
                                this.field347 = 0;
                                break label153;
                            }
                            this.field345 -= var6 * var8;
                            this.field347 -= var8;
                        } else {
                            return;
                        }
                        return;
                    }
                }
            }
            if (this.field341 < 0) {
                if (this.field345 < 0) {
                    this.field345 = -1;
                    this.method874();
                    this.method8189();
                }
            } else if (this.field345 >= var5) {
                this.field345 = var5;
                this.method874();
                this.method8189();
            }
        } else if (this.field350) {
            if (this.field341 < 0) {
                if (this.field345 >= var3) {
                    return;
                }
                this.field345 = var3 + var3 - 1 - this.field345;
                this.field341 = -this.field341;
            }
            while (this.field345 >= var4) {
                this.field345 = var4 + var4 - 1 - this.field345;
                this.field341 = -this.field341;
                if (this.field345 >= var3) {
                    return;
                }
                this.field345 = var3 + var3 - 1 - this.field345;
                this.field341 = -this.field341;
            }
        } else if (this.field341 < 0) {
            if (this.field345 >= var3) {
                return;
            }
            this.field345 = var4 - 1 - (var4 - 1 - this.field345) % var6;
        } else if (this.field345 >= var4) {
            this.field345 = (this.field345 - var3) % var6 + var3;
        } else {
            return;
        }
    }

    @ObfuscatedName("bz.br([IIIII)I")
    public int method884(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field351 > 0) {
                int var6 = this.field351 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field351 += arg1;
                if (this.field341 == 256 && (this.field345 & 0xFF) == 0) {
                    if (Statics.field1894) {
                        arg1 = method947(0, ((class41) this.field357).field269, arg0, this.field345, arg1, this.field340, this.field343, this.field342, this.field353, 0, var6, arg2, this);
                    } else {
                        arg1 = method893(((class41) this.field357).field269, arg0, this.field345, arg1, this.field344, this.field352, 0, var6, arg2, this);
                    }
                } else if (Statics.field1894) {
                    arg1 = method897(0, 0, ((class41) this.field357).field269, arg0, this.field345, arg1, this.field340, this.field343, this.field342, this.field353, 0, var6, arg2, this, this.field341, arg4);
                } else {
                    arg1 = method896(0, 0, ((class41) this.field357).field269, arg0, this.field345, arg1, this.field344, this.field352, 0, var6, arg2, this, this.field341, arg4);
                }
                this.field351 -= arg1;
                if (this.field351 != 0) {
                    return arg1;
                }
                if (!this.method886()) {
                    continue;
                }
                return arg3;
            }
            if (this.field341 == 256 && (this.field345 & 0xFF) == 0) {
                if (Statics.field1894) {
                    return method888(0, ((class41) this.field357).field269, arg0, this.field345, arg1, this.field340, this.field343, 0, arg3, arg2, this);
                }
                return method902(((class41) this.field357).field269, arg0, this.field345, arg1, this.field344, 0, arg3, arg2, this);
            }
            if (Statics.field1894) {
                return method913(0, 0, ((class41) this.field357).field269, arg0, this.field345, arg1, this.field340, this.field343, 0, arg3, arg2, this, this.field341, arg4);
            }
            return method891(0, 0, ((class41) this.field357).field269, arg0, this.field345, arg1, this.field344, 0, arg3, arg2, this, this.field341, arg4);
        }
    }

    @ObfuscatedName("bz.bx([IIIII)I")
    public int method929(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field351 > 0) {
                int var6 = this.field351 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field351 += arg1;
                if (this.field341 == -256 && (this.field345 & 0xFF) == 0) {
                    if (Statics.field1894) {
                        arg1 = method895(0, ((class41) this.field357).field269, arg0, this.field345, arg1, this.field340, this.field343, this.field342, this.field353, 0, var6, arg2, this);
                    } else {
                        arg1 = method894(((class41) this.field357).field269, arg0, this.field345, arg1, this.field344, this.field352, 0, var6, arg2, this);
                    }
                } else if (Statics.field1894) {
                    arg1 = method899(0, 0, ((class41) this.field357).field269, arg0, this.field345, arg1, this.field340, this.field343, this.field342, this.field353, 0, var6, arg2, this, this.field341, arg4);
                } else {
                    arg1 = method898(0, 0, ((class41) this.field357).field269, arg0, this.field345, arg1, this.field344, this.field352, 0, var6, arg2, this, this.field341, arg4);
                }
                this.field351 -= arg1;
                if (this.field351 != 0) {
                    return arg1;
                }
                if (!this.method886()) {
                    continue;
                }
                return arg3;
            }
            if (this.field341 == -256 && (this.field345 & 0xFF) == 0) {
                if (Statics.field1894) {
                    return method890(0, ((class41) this.field357).field269, arg0, this.field345, arg1, this.field340, this.field343, 0, arg3, arg2, this);
                }
                return method889(((class41) this.field357).field269, arg0, this.field345, arg1, this.field344, 0, arg3, arg2, this);
            }
            if (Statics.field1894) {
                return method892(0, 0, ((class41) this.field357).field269, arg0, this.field345, arg1, this.field340, this.field343, 0, arg3, arg2, this, this.field341, arg4);
            }
            return method946(0, 0, ((class41) this.field357).field269, arg0, this.field345, arg1, this.field344, 0, arg3, arg2, this, this.field341, arg4);
        }
    }

    @ObfuscatedName("bz.bd()Z")
    public boolean method886() {
        int var1 = this.field346;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method882(var1, this.field354);
            var2 = method859(var1, this.field354);
        }
        if (this.field344 != var1 || this.field340 != var3 || this.field343 != var2) {
            if (this.field344 < var1) {
                this.field352 = 1;
                this.field351 = var1 - this.field344;
            } else if (this.field344 > var1) {
                this.field352 = -1;
                this.field351 = this.field344 - var1;
            } else {
                this.field352 = 0;
            }
            if (this.field340 < var3) {
                this.field342 = 1;
                if (this.field351 == 0 || this.field351 > var3 - this.field340) {
                    this.field351 = var3 - this.field340;
                }
            } else if (this.field340 > var3) {
                this.field342 = -1;
                if (this.field351 == 0 || this.field351 > this.field340 - var3) {
                    this.field351 = this.field340 - var3;
                }
            } else {
                this.field342 = 0;
            }
            if (this.field343 < var2) {
                this.field353 = 1;
                if (this.field351 == 0 || this.field351 > var2 - this.field343) {
                    this.field351 = var2 - this.field343;
                }
            } else if (this.field343 > var2) {
                this.field353 = -1;
                if (this.field351 == 0 || this.field351 > this.field343 - var2) {
                    this.field351 = this.field343 - var2;
                }
            } else {
                this.field353 = 0;
            }
            return false;
        } else if (this.field346 == Integer.MIN_VALUE) {
            this.field346 = 0;
            this.field343 = 0;
            this.field340 = 0;
            this.field344 = 0;
            this.method8189();
            return true;
        } else {
            this.method865();
            return false;
        }
    }

    @ObfuscatedName("bz.bv([B[IIIIIIILbz;)I")
    public static int method902(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class49 arg8) {
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
        arg8.field345 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("bz.bm(I[B[IIIIIIIILbz;)I")
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
        arg10.field345 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("bz.bq([B[IIIIIIILbz;)I")
    public static int method889(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class49 arg8) {
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
        arg8.field345 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("bz.bj(I[B[IIIIIIIILbz;)I")
    public static int method890(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class49 arg10) {
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
        arg10.field345 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("bz.bc(II[B[IIIIIIILbz;II)I")
    public static int method891(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class49 arg10, int arg11, int arg12) {
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
        arg10.field345 = arg4;
        return arg5;
    }

    @ObfuscatedName("bz.bz(II[B[IIIIIIIILbz;II)I")
    public static int method913(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class49 arg11, int arg12, int arg13) {
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
        arg11.field345 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("bz.ba(II[B[IIIIIIILbz;II)I")
    public static int method946(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class49 arg10, int arg11, int arg12) {
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
        arg10.field345 = arg4;
        return arg5;
    }

    @ObfuscatedName("bz.bb(II[B[IIIIIIIILbz;II)I")
    public static int method892(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class49 arg11, int arg12, int arg13) {
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
        arg11.field345 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("bz.by([B[IIIIIIIILbz;)I")
    public static int method893(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class49 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field340 += (var14 - arg3) * arg9.field342;
        arg9.field343 += (var14 - arg3) * arg9.field353;
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
        arg9.field344 = var12 >> 2;
        arg9.field345 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("bz.cw(I[B[IIIIIIIIIILbz;)I")
    public static int method947(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class49 arg12) {
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
        arg12.field344 += (var19 - arg4) * arg12.field352;
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
        arg12.field340 = var15 >> 2;
        arg12.field343 = var16 >> 2;
        arg12.field345 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("bz.ck([B[IIIIIIIILbz;)I")
    public static int method894(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class49 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field340 += (var14 - arg3) * arg9.field342;
        arg9.field343 += (var14 - arg3) * arg9.field353;
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
        arg9.field344 = var12 >> 2;
        arg9.field345 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("bz.cn(I[B[IIIIIIIIIILbz;)I")
    public static int method895(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class49 arg12) {
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
        arg12.field344 += (var19 - arg4) * arg12.field352;
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
        arg12.field340 = var15 >> 2;
        arg12.field343 = var16 >> 2;
        arg12.field345 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("bz.ch(II[B[IIIIIIIILbz;II)I")
    public static int method896(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class49 arg11, int arg12, int arg13) {
        arg11.field340 -= arg11.field342 * arg5;
        arg11.field343 -= arg11.field353 * arg5;
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
        arg11.field340 += arg11.field342 * arg5;
        arg11.field343 += arg11.field353 * arg5;
        arg11.field344 = arg6;
        arg11.field345 = arg4;
        return arg5;
    }

    @ObfuscatedName("bz.cp(II[B[IIIIIIIIIILbz;II)I")
    public static int method897(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class49 arg13, int arg14, int arg15) {
        arg13.field344 -= arg13.field352 * arg5;
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
        arg13.field344 += arg13.field352 * var27;
        arg13.field340 = arg6;
        arg13.field343 = arg7;
        arg13.field345 = arg4;
        return var27;
    }

    @ObfuscatedName("bz.cd(II[B[IIIIIIIILbz;II)I")
    public static int method898(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class49 arg11, int arg12, int arg13) {
        arg11.field340 -= arg11.field342 * arg5;
        arg11.field343 -= arg11.field353 * arg5;
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
        arg11.field340 += arg11.field342 * arg5;
        arg11.field343 += arg11.field353 * arg5;
        arg11.field344 = arg6;
        arg11.field345 = arg4;
        return arg5;
    }

    @ObfuscatedName("bz.cs(II[B[IIIIIIIIIILbz;II)I")
    public static int method899(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class49 arg13, int arg14, int arg15) {
        arg13.field344 -= arg13.field352 * arg5;
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
        arg13.field344 += arg13.field352 * var26;
        arg13.field340 = arg6;
        arg13.field343 = arg7;
        arg13.field345 = arg4;
        return var26;
    }
}
