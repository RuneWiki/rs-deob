package deob;

@ObfuscatedName("bq")
public class class49 extends class50 {

    @ObfuscatedName("bq.ac")
    public int field328;

    @ObfuscatedName("bq.ae")
    public int field322;

    @ObfuscatedName("bq.ag")
    public int field327;

    @ObfuscatedName("bq.am")
    public int field323;

    @ObfuscatedName("bq.ax")
    public int field321;

    @ObfuscatedName("bq.aq")
    public int field325;

    @ObfuscatedName("bq.af")
    public int field326;

    @ObfuscatedName("bq.at")
    public int field332;

    @ObfuscatedName("bq.au")
    public int field324;

    @ObfuscatedName("bq.ar")
    public int field329;

    @ObfuscatedName("bq.al")
    public boolean field330;

    @ObfuscatedName("bq.ad")
    public int field331;

    @ObfuscatedName("bq.ah")
    public int field320;

    @ObfuscatedName("bq.ap")
    public int field333;

    @ObfuscatedName("bq.ab")
    public int field334;

    @ObfuscatedName("bq.ac(II)I")
    public static int method877(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("bq.ae(II)I")
    public static int method872(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("bq.bt()I")
    public int method912() {
        int var1 = this.field321 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field332 == 0) {
            var2 -= this.field328 * var2 / (((class41) this.field337).field248.length << 8);
        } else if (this.field332 >= 0) {
            var2 -= this.field324 * var2 / ((class41) this.field337).field248.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    public class49(class41 arg0, int arg1, int arg2) {
        this.field337 = arg0;
        this.field324 = arg0.field250;
        this.field329 = arg0.field247;
        this.field330 = arg0.field251;
        this.field322 = arg1;
        this.field327 = arg2;
        this.field323 = 8192;
        this.field328 = 0;
        this.method876();
    }

    public class49(class41 arg0, int arg1, int arg2, int arg3) {
        this.field337 = arg0;
        this.field324 = arg0.field250;
        this.field329 = arg0.field247;
        this.field330 = arg0.field251;
        this.field322 = arg1;
        this.field327 = arg2;
        this.field323 = arg3;
        this.field328 = 0;
        this.method876();
    }

    @ObfuscatedName("bq.ag(Lbg;II)Lbq;")
    public static class49 method874(class41 arg0, int arg1, int arg2) {
        return arg0.field248 == null || arg0.field248.length == 0 ? null : new class49(arg0, (int) ((long) arg0.field249 * 256L * (long) arg1 / (long) (Statics.field271 * 100)), arg2 << 6);
    }

    @ObfuscatedName("bq.am(Lbg;III)Lbq;")
    public static class49 method962(class41 arg0, int arg1, int arg2, int arg3) {
        return arg0.field248 == null || arg0.field248.length == 0 ? null : new class49(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("bq.ax()V")
    public void method876() {
        this.field321 = this.field327;
        this.field325 = method877(this.field327, this.field323);
        this.field326 = method872(this.field327, this.field323);
    }

    @ObfuscatedName("bq.ar(I)V")
    public synchronized void method887(int arg0) {
        this.field332 = arg0;
    }

    @ObfuscatedName("bq.ad(I)V")
    public synchronized void method878(int arg0) {
        this.method951(arg0 << 6, this.method997());
    }

    @ObfuscatedName("bq.ah(I)V")
    public synchronized void method879(int arg0) {
        this.method951(arg0, this.method997());
    }

    @ObfuscatedName("bq.ap(II)V")
    public synchronized void method951(int arg0, int arg1) {
        this.field327 = arg0;
        this.field323 = arg1;
        this.field331 = 0;
        this.method876();
    }

    @ObfuscatedName("bq.ab()I")
    public synchronized int method881() {
        return this.field327 == Integer.MIN_VALUE ? 0 : this.field327;
    }

    @ObfuscatedName("bq.az()I")
    public synchronized int method997() {
        return this.field323 < 0 ? -1 : this.field323;
    }

    @ObfuscatedName("bq.aa(I)V")
    public synchronized void method883(int arg0) {
        int var2 = ((class41) this.field337).field248.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field328 = arg0;
    }

    @ObfuscatedName("bq.ai(Z)V")
    public synchronized void method884(boolean arg0) {
        this.field322 = (this.field322 >>> 31) + (this.field322 ^ this.field322 >> 31);
        if (arg0) {
            this.field322 = -this.field322;
        }
    }

    @ObfuscatedName("bq.ao()V")
    public void method885() {
        if (this.field331 == 0) {
            return;
        }
        if (this.field327 == Integer.MIN_VALUE) {
            this.field327 = 0;
        }
        this.field331 = 0;
        this.method876();
    }

    @ObfuscatedName("bq.as(II)V")
    public synchronized void method948(int arg0, int arg1) {
        this.method946(arg0, arg1, this.method997());
    }

    @ObfuscatedName("bq.ay(III)V")
    public synchronized void method946(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method951(arg1, arg2);
            return;
        }
        int var4 = method877(arg1, arg2);
        int var5 = method872(arg1, arg2);
        if (this.field325 == var4 && this.field326 == var5) {
            this.field331 = 0;
            return;
        }
        int var6 = arg1 - this.field321;
        if (this.field321 - arg1 > var6) {
            var6 = this.field321 - arg1;
        }
        if (var4 - this.field325 > var6) {
            var6 = var4 - this.field325;
        }
        if (this.field325 - var4 > var6) {
            var6 = this.field325 - var4;
        }
        if (var5 - this.field326 > var6) {
            var6 = var5 - this.field326;
        }
        if (this.field326 - var5 > var6) {
            var6 = this.field326 - var5;
        }
        if (arg0 > var6) {
            arg0 = var6;
        }
        this.field331 = arg0;
        this.field327 = arg1;
        this.field323 = arg2;
        this.field320 = (arg1 - this.field321) / arg0;
        this.field333 = (var4 - this.field325) / arg0;
        this.field334 = (var5 - this.field326) / arg0;
    }

    @ObfuscatedName("bq.aj(I)V")
    public synchronized void method998(int arg0) {
        if (arg0 == 0) {
            this.method879(0);
            this.method8362();
        } else if (this.field325 == 0 && this.field326 == 0) {
            this.field331 = 0;
            this.field327 = 0;
            this.field321 = 0;
            this.method8362();
        } else {
            int var2 = -this.field321;
            if (this.field321 > var2) {
                var2 = this.field321;
            }
            if (-this.field325 > var2) {
                var2 = -this.field325;
            }
            if (this.field325 > var2) {
                var2 = this.field325;
            }
            if (-this.field326 > var2) {
                var2 = -this.field326;
            }
            if (this.field326 > var2) {
                var2 = this.field326;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field331 = arg0;
            this.field327 = Integer.MIN_VALUE;
            this.field320 = -this.field321 / arg0;
            this.field333 = -this.field325 / arg0;
            this.field334 = -this.field326 / arg0;
        }
    }

    @ObfuscatedName("bq.av(I)V")
    public synchronized void method990(int arg0) {
        if (this.field322 < 0) {
            this.field322 = -arg0;
        } else {
            this.field322 = arg0;
        }
    }

    @ObfuscatedName("bq.aw()I")
    public synchronized int method890() {
        return this.field322 < 0 ? -this.field322 : this.field322;
    }

    @ObfuscatedName("bq.by()Z")
    public boolean method891() {
        return this.field328 < 0 || this.field328 >= ((class41) this.field337).field248.length << 8;
    }

    @ObfuscatedName("bq.bb()Z")
    public boolean method892() {
        return this.field331 != 0;
    }

    @ObfuscatedName("bq.aq()Lbk;")
    public class50 method709() {
        return null;
    }

    @ObfuscatedName("bq.af()Lbk;")
    public class50 method710() {
        return null;
    }

    @ObfuscatedName("bq.at()I")
    public int method711() {
        return this.field327 == 0 && this.field331 == 0 ? 0 : 1;
    }

    @ObfuscatedName("bq.au([III)V")
    public synchronized void method712(int[] arg0, int arg1, int arg2) {
        if (this.field327 == 0 && this.field331 == 0) {
            this.method716(arg2);
            return;
        }
        class41 var4 = (class41) this.field337;
        int var5 = this.field324 << 8;
        int var6 = this.field329 << 8;
        int var7 = var4.field248.length << 8;
        int var8 = var6 - var5;
        if (var8 <= 0) {
            this.field332 = 0;
        }
        int var9 = arg1;
        int var10 = arg1 + arg2;
        if (this.field328 < 0) {
            if (this.field322 <= 0) {
                this.method885();
                this.method8362();
                return;
            }
            this.field328 = 0;
        }
        if (this.field328 >= var7) {
            if (this.field322 >= 0) {
                this.method885();
                this.method8362();
                return;
            }
            this.field328 = var7 - 1;
        }
        if (this.field332 >= 0) {
            if (this.field332 > 0) {
                if (this.field330) {
                    label131: {
                        if (this.field322 < 0) {
                            var9 = this.method894(arg0, arg1, var5, var10, var4.field248[this.field324]);
                            if (this.field328 >= var5) {
                                return;
                            }
                            this.field328 = var5 + var5 - 1 - this.field328;
                            this.field322 = -this.field322;
                            if (--this.field332 == 0) {
                                break label131;
                            }
                        }
                        do {
                            var9 = this.method897(arg0, var9, var6, var10, var4.field248[this.field329 - 1]);
                            if (this.field328 < var6) {
                                return;
                            }
                            this.field328 = var6 + var6 - 1 - this.field328;
                            this.field322 = -this.field322;
                            if (--this.field332 == 0) {
                                break;
                            }
                            var9 = this.method894(arg0, var9, var5, var10, var4.field248[this.field324]);
                            if (this.field328 >= var5) {
                                return;
                            }
                            this.field328 = var5 + var5 - 1 - this.field328;
                            this.field322 = -this.field322;
                        } while (--this.field332 != 0);
                    }
                } else if (this.field322 < 0) {
                    while (true) {
                        var9 = this.method894(arg0, var9, var5, var10, var4.field248[this.field329 - 1]);
                        if (this.field328 >= var5) {
                            return;
                        }
                        int var12 = (var6 - 1 - this.field328) / var8;
                        if (var12 >= this.field332) {
                            this.field328 += this.field332 * var8;
                            this.field332 = 0;
                            break;
                        }
                        this.field328 += var8 * var12;
                        this.field332 -= var12;
                    }
                } else {
                    while (true) {
                        var9 = this.method897(arg0, var9, var6, var10, var4.field248[this.field324]);
                        if (this.field328 < var6) {
                            return;
                        }
                        int var13 = (this.field328 - var5) / var8;
                        if (var13 >= this.field332) {
                            this.field328 -= this.field332 * var8;
                            this.field332 = 0;
                            break;
                        }
                        this.field328 -= var8 * var13;
                        this.field332 -= var13;
                    }
                }
            }
            if (this.field322 < 0) {
                this.method894(arg0, var9, 0, var10, 0);
                if (this.field328 < 0) {
                    this.field328 = -1;
                    this.method885();
                    this.method8362();
                }
            } else {
                this.method897(arg0, var9, var7, var10, 0);
                if (this.field328 >= var7) {
                    this.field328 = var7;
                    this.method885();
                    this.method8362();
                }
            }
        } else if (this.field330) {
            if (this.field322 < 0) {
                var9 = this.method894(arg0, arg1, var5, var10, var4.field248[this.field324]);
                if (this.field328 >= var5) {
                    return;
                }
                this.field328 = var5 + var5 - 1 - this.field328;
                this.field322 = -this.field322;
            }
            while (true) {
                int var11 = this.method897(arg0, var9, var6, var10, var4.field248[this.field329 - 1]);
                if (this.field328 < var6) {
                    return;
                }
                this.field328 = var6 + var6 - 1 - this.field328;
                this.field322 = -this.field322;
                var9 = this.method894(arg0, var11, var5, var10, var4.field248[this.field324]);
                if (this.field328 >= var5) {
                    return;
                }
                this.field328 = var5 + var5 - 1 - this.field328;
                this.field322 = -this.field322;
            }
        } else if (this.field322 < 0) {
            while (true) {
                var9 = this.method894(arg0, var9, var5, var10, var4.field248[this.field329 - 1]);
                if (this.field328 >= var5) {
                    return;
                }
                this.field328 = var6 - 1 - (var6 - 1 - this.field328) % var8;
            }
        } else {
            while (true) {
                var9 = this.method897(arg0, var9, var6, var10, var4.field248[this.field324]);
                if (this.field328 < var6) {
                    return;
                }
                this.field328 = (this.field328 - var5) % var8 + var5;
            }
        }
    }

    @ObfuscatedName("bq.al(I)V")
    public synchronized void method716(int arg0) {
        if (this.field331 > 0) {
            if (arg0 >= this.field331) {
                if (this.field327 == Integer.MIN_VALUE) {
                    this.field327 = 0;
                    this.field326 = 0;
                    this.field325 = 0;
                    this.field321 = 0;
                    this.method8362();
                    arg0 = this.field331;
                }
                this.field331 = 0;
                this.method876();
            } else {
                this.field321 += this.field320 * arg0;
                this.field325 += this.field333 * arg0;
                this.field326 += this.field334 * arg0;
                this.field331 -= arg0;
            }
        }
        class41 var2 = (class41) this.field337;
        int var3 = this.field324 << 8;
        int var4 = this.field329 << 8;
        int var5 = var2.field248.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field332 = 0;
        }
        if (this.field328 < 0) {
            if (this.field322 <= 0) {
                this.method885();
                this.method8362();
                return;
            }
            this.field328 = 0;
        }
        if (this.field328 >= var5) {
            if (this.field322 >= 0) {
                this.method885();
                this.method8362();
                return;
            }
            this.field328 = var5 - 1;
        }
        this.field328 += this.field322 * arg0;
        if (this.field332 >= 0) {
            if (this.field332 > 0) {
                if (this.field330) {
                    label121: {
                        if (this.field322 < 0) {
                            if (this.field328 >= var3) {
                                return;
                            }
                            this.field328 = var3 + var3 - 1 - this.field328;
                            this.field322 = -this.field322;
                            if (--this.field332 == 0) {
                                break label121;
                            }
                        }
                        do {
                            if (this.field328 < var4) {
                                return;
                            }
                            this.field328 = var4 + var4 - 1 - this.field328;
                            this.field322 = -this.field322;
                            if (--this.field332 == 0) {
                                break;
                            }
                            if (this.field328 >= var3) {
                                return;
                            }
                            this.field328 = var3 + var3 - 1 - this.field328;
                            this.field322 = -this.field322;
                        } while (--this.field332 != 0);
                    }
                } else {
                    label153: {
                        if (this.field322 < 0) {
                            if (this.field328 >= var3) {
                                return;
                            }
                            int var7 = (var4 - 1 - this.field328) / var6;
                            if (var7 >= this.field332) {
                                this.field328 += this.field332 * var6;
                                this.field332 = 0;
                                break label153;
                            }
                            this.field328 += var6 * var7;
                            this.field332 -= var7;
                        } else if (this.field328 >= var4) {
                            int var8 = (this.field328 - var3) / var6;
                            if (var8 >= this.field332) {
                                this.field328 -= this.field332 * var6;
                                this.field332 = 0;
                                break label153;
                            }
                            this.field328 -= var6 * var8;
                            this.field332 -= var8;
                        } else {
                            return;
                        }
                        return;
                    }
                }
            }
            if (this.field322 < 0) {
                if (this.field328 < 0) {
                    this.field328 = -1;
                    this.method885();
                    this.method8362();
                }
            } else if (this.field328 >= var5) {
                this.field328 = var5;
                this.method885();
                this.method8362();
            }
        } else if (this.field330) {
            if (this.field322 < 0) {
                if (this.field328 >= var3) {
                    return;
                }
                this.field328 = var3 + var3 - 1 - this.field328;
                this.field322 = -this.field322;
            }
            while (this.field328 >= var4) {
                this.field328 = var4 + var4 - 1 - this.field328;
                this.field322 = -this.field322;
                if (this.field328 >= var3) {
                    return;
                }
                this.field328 = var3 + var3 - 1 - this.field328;
                this.field322 = -this.field322;
            }
        } else if (this.field322 < 0) {
            if (this.field328 >= var3) {
                return;
            }
            this.field328 = var4 - 1 - (var4 - 1 - this.field328) % var6;
        } else if (this.field328 >= var4) {
            this.field328 = (this.field328 - var3) % var6 + var3;
        } else {
            return;
        }
    }

    @ObfuscatedName("bq.bi([IIIII)I")
    public int method897(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field331 > 0) {
                int var6 = this.field331 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field331 += arg1;
                if (this.field322 == 256 && (this.field328 & 0xFF) == 0) {
                    if (Statics.field262) {
                        arg1 = method905(0, ((class41) this.field337).field248, arg0, this.field328, arg1, this.field325, this.field326, this.field333, this.field334, 0, var6, arg2, this);
                    } else {
                        arg1 = method1004(((class41) this.field337).field248, arg0, this.field328, arg1, this.field321, this.field320, 0, var6, arg2, this);
                    }
                } else if (Statics.field262) {
                    arg1 = method889(0, 0, ((class41) this.field337).field248, arg0, this.field328, arg1, this.field325, this.field326, this.field333, this.field334, 0, var6, arg2, this, this.field322, arg4);
                } else {
                    arg1 = method908(0, 0, ((class41) this.field337).field248, arg0, this.field328, arg1, this.field321, this.field320, 0, var6, arg2, this, this.field322, arg4);
                }
                this.field331 -= arg1;
                if (this.field331 != 0) {
                    return arg1;
                }
                if (!this.method895()) {
                    continue;
                }
                return arg3;
            }
            if (this.field322 == 256 && (this.field328 & 0xFF) == 0) {
                if (Statics.field262) {
                    return method914(0, ((class41) this.field337).field248, arg0, this.field328, arg1, this.field325, this.field326, 0, arg3, arg2, this);
                }
                return method896(((class41) this.field337).field248, arg0, this.field328, arg1, this.field321, 0, arg3, arg2, this);
            }
            if (Statics.field262) {
                return method901(0, 0, ((class41) this.field337).field248, arg0, this.field328, arg1, this.field325, this.field326, 0, arg3, arg2, this, this.field322, arg4);
            }
            return method900(0, 0, ((class41) this.field337).field248, arg0, this.field328, arg1, this.field321, 0, arg3, arg2, this, this.field322, arg4);
        }
    }

    @ObfuscatedName("bq.bg([IIIII)I")
    public int method894(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field331 > 0) {
                int var6 = this.field331 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field331 += arg1;
                if (this.field322 == -256 && (this.field328 & 0xFF) == 0) {
                    if (Statics.field262) {
                        arg1 = method907(0, ((class41) this.field337).field248, arg0, this.field328, arg1, this.field325, this.field326, this.field333, this.field334, 0, var6, arg2, this);
                    } else {
                        arg1 = method875(((class41) this.field337).field248, arg0, this.field328, arg1, this.field321, this.field320, 0, var6, arg2, this);
                    }
                } else if (Statics.field262) {
                    arg1 = method911(0, 0, ((class41) this.field337).field248, arg0, this.field328, arg1, this.field325, this.field326, this.field333, this.field334, 0, var6, arg2, this, this.field322, arg4);
                } else {
                    arg1 = method910(0, 0, ((class41) this.field337).field248, arg0, this.field328, arg1, this.field321, this.field320, 0, var6, arg2, this, this.field322, arg4);
                }
                this.field331 -= arg1;
                if (this.field331 != 0) {
                    return arg1;
                }
                if (!this.method895()) {
                    continue;
                }
                return arg3;
            }
            if (this.field322 == -256 && (this.field328 & 0xFF) == 0) {
                if (Statics.field262) {
                    return method899(0, ((class41) this.field337).field248, arg0, this.field328, arg1, this.field325, this.field326, 0, arg3, arg2, this);
                }
                return method961(((class41) this.field337).field248, arg0, this.field328, arg1, this.field321, 0, arg3, arg2, this);
            }
            if (Statics.field262) {
                return method903(0, 0, ((class41) this.field337).field248, arg0, this.field328, arg1, this.field325, this.field326, 0, arg3, arg2, this, this.field322, arg4);
            }
            return method959(0, 0, ((class41) this.field337).field248, arg0, this.field328, arg1, this.field321, 0, arg3, arg2, this, this.field322, arg4);
        }
    }

    @ObfuscatedName("bq.br()Z")
    public boolean method895() {
        int var1 = this.field327;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method877(var1, this.field323);
            var2 = method872(var1, this.field323);
        }
        if (this.field321 != var1 || this.field325 != var3 || this.field326 != var2) {
            if (this.field321 < var1) {
                this.field320 = 1;
                this.field331 = var1 - this.field321;
            } else if (this.field321 > var1) {
                this.field320 = -1;
                this.field331 = this.field321 - var1;
            } else {
                this.field320 = 0;
            }
            if (this.field325 < var3) {
                this.field333 = 1;
                if (this.field331 == 0 || this.field331 > var3 - this.field325) {
                    this.field331 = var3 - this.field325;
                }
            } else if (this.field325 > var3) {
                this.field333 = -1;
                if (this.field331 == 0 || this.field331 > this.field325 - var3) {
                    this.field331 = this.field325 - var3;
                }
            } else {
                this.field333 = 0;
            }
            if (this.field326 < var2) {
                this.field334 = 1;
                if (this.field331 == 0 || this.field331 > var2 - this.field326) {
                    this.field331 = var2 - this.field326;
                }
            } else if (this.field326 > var2) {
                this.field334 = -1;
                if (this.field331 == 0 || this.field331 > this.field326 - var2) {
                    this.field331 = this.field326 - var2;
                }
            } else {
                this.field334 = 0;
            }
            return false;
        } else if (this.field327 == Integer.MIN_VALUE) {
            this.field327 = 0;
            this.field326 = 0;
            this.field325 = 0;
            this.field321 = 0;
            this.method8362();
            return true;
        } else {
            this.method876();
            return false;
        }
    }

    @ObfuscatedName("bq.bo([B[IIIIIIILbq;)I")
    public static int method896(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class49 arg8) {
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
        arg8.field328 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("bq.bv(I[B[IIIIIIIILbq;)I")
    public static int method914(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class49 arg10) {
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
        arg10.field328 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("bq.bq([B[IIIIIIILbq;)I")
    public static int method961(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class49 arg8) {
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
        arg8.field328 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("bq.bk(I[B[IIIIIIIILbq;)I")
    public static int method899(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class49 arg10) {
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
        arg10.field328 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("bq.be(II[B[IIIIIIILbq;II)I")
    public static int method900(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class49 arg10, int arg11, int arg12) {
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
        arg10.field328 = arg4;
        return arg5;
    }

    @ObfuscatedName("bq.bc(II[B[IIIIIIIILbq;II)I")
    public static int method901(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class49 arg11, int arg12, int arg13) {
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
        arg11.field328 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("bq.cn(II[B[IIIIIIILbq;II)I")
    public static int method959(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class49 arg10, int arg11, int arg12) {
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
        arg10.field328 = arg4;
        return arg5;
    }

    @ObfuscatedName("bq.ch(II[B[IIIIIIIILbq;II)I")
    public static int method903(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class49 arg11, int arg12, int arg13) {
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
        arg11.field328 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("bq.cf([B[IIIIIIIILbq;)I")
    public static int method1004(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class49 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field325 += (var14 - arg3) * arg9.field333;
        arg9.field326 += (var14 - arg3) * arg9.field334;
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
        arg9.field321 = var12 >> 2;
        arg9.field328 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("bq.cu(I[B[IIIIIIIIIILbq;)I")
    public static int method905(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class49 arg12) {
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
        arg12.field321 += (var19 - arg4) * arg12.field320;
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
        arg12.field325 = var15 >> 2;
        arg12.field326 = var16 >> 2;
        arg12.field328 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("bq.cm([B[IIIIIIIILbq;)I")
    public static int method875(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class49 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field325 += (var14 - arg3) * arg9.field333;
        arg9.field326 += (var14 - arg3) * arg9.field334;
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
        arg9.field321 = var12 >> 2;
        arg9.field328 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("bq.cj(I[B[IIIIIIIIIILbq;)I")
    public static int method907(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class49 arg12) {
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
        arg12.field321 += (var19 - arg4) * arg12.field320;
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
        arg12.field325 = var15 >> 2;
        arg12.field326 = var16 >> 2;
        arg12.field328 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("bq.cx(II[B[IIIIIIIILbq;II)I")
    public static int method908(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class49 arg11, int arg12, int arg13) {
        arg11.field325 -= arg11.field333 * arg5;
        arg11.field326 -= arg11.field334 * arg5;
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
        arg11.field325 += arg11.field333 * arg5;
        arg11.field326 += arg11.field334 * arg5;
        arg11.field321 = arg6;
        arg11.field328 = arg4;
        return arg5;
    }

    @ObfuscatedName("bq.ci(II[B[IIIIIIIIIILbq;II)I")
    public static int method889(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class49 arg13, int arg14, int arg15) {
        arg13.field321 -= arg13.field320 * arg5;
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
        arg13.field321 += arg13.field320 * var27;
        arg13.field325 = arg6;
        arg13.field326 = arg7;
        arg13.field328 = arg4;
        return var27;
    }

    @ObfuscatedName("bq.cy(II[B[IIIIIIIILbq;II)I")
    public static int method910(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class49 arg11, int arg12, int arg13) {
        arg11.field325 -= arg11.field333 * arg5;
        arg11.field326 -= arg11.field334 * arg5;
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
        arg11.field325 += arg11.field333 * arg5;
        arg11.field326 += arg11.field334 * arg5;
        arg11.field321 = arg6;
        arg11.field328 = arg4;
        return arg5;
    }

    @ObfuscatedName("bq.co(II[B[IIIIIIIIIILbq;II)I")
    public static int method911(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class49 arg13, int arg14, int arg15) {
        arg13.field321 -= arg13.field320 * arg5;
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
        arg13.field321 += arg13.field320 * var26;
        arg13.field325 = arg6;
        arg13.field326 = arg7;
        arg13.field328 = arg4;
        return var26;
    }
}
