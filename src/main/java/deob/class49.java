package deob;

@ObfuscatedName("bz")
public class class49 extends class50 {

    @ObfuscatedName("bz.aq")
    public int field322;

    @ObfuscatedName("bz.ad")
    public int field317;

    @ObfuscatedName("bz.ag")
    public int field318;

    @ObfuscatedName("bz.ak")
    public int field319;

    @ObfuscatedName("bz.ap")
    public int field320;

    @ObfuscatedName("bz.an")
    public int field321;

    @ObfuscatedName("bz.aj")
    public int field326;

    @ObfuscatedName("bz.av")
    public int field330;

    @ObfuscatedName("bz.ab")
    public int field324;

    @ObfuscatedName("bz.ai")
    public int field323;

    @ObfuscatedName("bz.ae")
    public boolean field316;

    @ObfuscatedName("bz.au")
    public int field327;

    @ObfuscatedName("bz.ah")
    public int field328;

    @ObfuscatedName("bz.az")
    public int field325;

    @ObfuscatedName("bz.ax")
    public int field329;

    @ObfuscatedName("bz.aq(II)I")
    public static int method894(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("bz.ad(II)I")
    public static int method967(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("bz.bv()I")
    public int method876() {
        int var1 = this.field320 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field330 == 0) {
            var2 -= this.field322 * var2 / (((class41) this.field334).field248.length << 8);
        } else if (this.field330 >= 0) {
            var2 -= this.field324 * var2 / ((class41) this.field334).field248.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    public class49(class41 arg0, int arg1, int arg2) {
        this.field334 = arg0;
        this.field324 = arg0.field250;
        this.field323 = arg0.field249;
        this.field316 = arg0.field252;
        this.field317 = arg1;
        this.field318 = arg2;
        this.field319 = 8192;
        this.field322 = 0;
        this.method879();
    }

    public class49(class41 arg0, int arg1, int arg2, int arg3) {
        this.field334 = arg0;
        this.field324 = arg0.field250;
        this.field323 = arg0.field249;
        this.field316 = arg0.field252;
        this.field317 = arg1;
        this.field318 = arg2;
        this.field319 = arg3;
        this.field322 = 0;
        this.method879();
    }

    @ObfuscatedName("bz.ag(Lbl;II)Lbz;")
    public static class49 method933(class41 arg0, int arg1, int arg2) {
        return arg0.field248 == null || arg0.field248.length == 0 ? null : new class49(arg0, (int) ((long) arg0.field251 * 256L * (long) arg1 / (long) (Statics.field264 * 100)), arg2 << 6);
    }

    @ObfuscatedName("bz.ak(Lbl;III)Lbz;")
    public static class49 method878(class41 arg0, int arg1, int arg2, int arg3) {
        return arg0.field248 == null || arg0.field248.length == 0 ? null : new class49(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("bz.ap()V")
    public void method879() {
        this.field320 = this.field318;
        this.field321 = method894(this.field318, this.field319);
        this.field326 = method967(this.field318, this.field319);
    }

    @ObfuscatedName("bz.ai(I)V")
    public synchronized void method963(int arg0) {
        this.field330 = arg0;
    }

    @ObfuscatedName("bz.au(I)V")
    public synchronized void method881(int arg0) {
        this.method960(arg0 << 6, this.method962());
    }

    @ObfuscatedName("bz.ah(I)V")
    public synchronized void method882(int arg0) {
        this.method960(arg0, this.method962());
    }

    @ObfuscatedName("bz.az(II)V")
    public synchronized void method960(int arg0, int arg1) {
        this.field318 = arg0;
        this.field319 = arg1;
        this.field327 = 0;
        this.method879();
    }

    @ObfuscatedName("bz.ax()I")
    public synchronized int method883() {
        return this.field318 == Integer.MIN_VALUE ? 0 : this.field318;
    }

    @ObfuscatedName("bz.ac()I")
    public synchronized int method962() {
        return this.field319 < 0 ? -1 : this.field319;
    }

    @ObfuscatedName("bz.al(I)V")
    public synchronized void method959(int arg0) {
        int var2 = ((class41) this.field334).field248.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field322 = arg0;
    }

    @ObfuscatedName("bz.ay(Z)V")
    public synchronized void method936(boolean arg0) {
        this.field317 = (this.field317 >>> 31) + (this.field317 ^ this.field317 >> 31);
        if (arg0) {
            this.field317 = -this.field317;
        }
    }

    @ObfuscatedName("bz.ao()V")
    public void method887() {
        if (this.field327 == 0) {
            return;
        }
        if (this.field318 == Integer.MIN_VALUE) {
            this.field318 = 0;
        }
        this.field327 = 0;
        this.method879();
    }

    @ObfuscatedName("bz.aa(II)V")
    public synchronized void method888(int arg0, int arg1) {
        this.method889(arg0, arg1, this.method962());
    }

    @ObfuscatedName("bz.as(III)V")
    public synchronized void method889(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method960(arg1, arg2);
            return;
        }
        int var4 = method894(arg1, arg2);
        int var5 = method967(arg1, arg2);
        if (this.field321 == var4 && this.field326 == var5) {
            this.field327 = 0;
            return;
        }
        int var6 = arg1 - this.field320;
        if (this.field320 - arg1 > var6) {
            var6 = this.field320 - arg1;
        }
        if (var4 - this.field321 > var6) {
            var6 = var4 - this.field321;
        }
        if (this.field321 - var4 > var6) {
            var6 = this.field321 - var4;
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
        this.field327 = arg0;
        this.field318 = arg1;
        this.field319 = arg2;
        this.field328 = (arg1 - this.field320) / arg0;
        this.field325 = (var4 - this.field321) / arg0;
        this.field329 = (var5 - this.field326) / arg0;
    }

    @ObfuscatedName("bz.aw(I)V")
    public synchronized void method890(int arg0) {
        if (arg0 == 0) {
            this.method882(0);
            this.method8130();
        } else if (this.field321 == 0 && this.field326 == 0) {
            this.field327 = 0;
            this.field318 = 0;
            this.field320 = 0;
            this.method8130();
        } else {
            int var2 = -this.field320;
            if (this.field320 > var2) {
                var2 = this.field320;
            }
            if (-this.field321 > var2) {
                var2 = -this.field321;
            }
            if (this.field321 > var2) {
                var2 = this.field321;
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
            this.field327 = arg0;
            this.field318 = Integer.MIN_VALUE;
            this.field328 = -this.field320 / arg0;
            this.field325 = -this.field321 / arg0;
            this.field329 = -this.field326 / arg0;
        }
    }

    @ObfuscatedName("bz.at(I)V")
    public synchronized void method891(int arg0) {
        if (this.field317 < 0) {
            this.field317 = -arg0;
        } else {
            this.field317 = arg0;
        }
    }

    @ObfuscatedName("bz.af()I")
    public synchronized int method892() {
        return this.field317 < 0 ? -this.field317 : this.field317;
    }

    @ObfuscatedName("bz.bx()Z")
    public boolean method893() {
        return this.field322 < 0 || this.field322 >= ((class41) this.field334).field248.length << 8;
    }

    @ObfuscatedName("bz.bu()Z")
    public boolean method885() {
        return this.field327 != 0;
    }

    @ObfuscatedName("bz.an()Lbk;")
    public class50 method750() {
        return null;
    }

    @ObfuscatedName("bz.aj()Lbk;")
    public class50 method738() {
        return null;
    }

    @ObfuscatedName("bz.av()I")
    public int method724() {
        return this.field318 == 0 && this.field327 == 0 ? 0 : 1;
    }

    @ObfuscatedName("bz.ab([III)V")
    public synchronized void method718(int[] arg0, int arg1, int arg2) {
        if (this.field318 == 0 && this.field327 == 0) {
            this.method721(arg2);
            return;
        }
        class41 var4 = (class41) this.field334;
        int var5 = this.field324 << 8;
        int var6 = this.field323 << 8;
        int var7 = var4.field248.length << 8;
        int var8 = var6 - var5;
        if (var8 <= 0) {
            this.field330 = 0;
        }
        int var9 = arg1;
        int var10 = arg1 + arg2;
        if (this.field322 < 0) {
            if (this.field317 <= 0) {
                this.method887();
                this.method8130();
                return;
            }
            this.field322 = 0;
        }
        if (this.field322 >= var7) {
            if (this.field317 >= 0) {
                this.method887();
                this.method8130();
                return;
            }
            this.field322 = var7 - 1;
        }
        if (this.field330 >= 0) {
            if (this.field330 > 0) {
                if (this.field316) {
                    label131: {
                        if (this.field317 < 0) {
                            var9 = this.method908(arg0, arg1, var5, var10, var4.field248[this.field324]);
                            if (this.field322 >= var5) {
                                return;
                            }
                            this.field322 = var5 + var5 - 1 - this.field322;
                            this.field317 = -this.field317;
                            if (--this.field330 == 0) {
                                break label131;
                            }
                        }
                        do {
                            var9 = this.method918(arg0, var9, var6, var10, var4.field248[this.field323 - 1]);
                            if (this.field322 < var6) {
                                return;
                            }
                            this.field322 = var6 + var6 - 1 - this.field322;
                            this.field317 = -this.field317;
                            if (--this.field330 == 0) {
                                break;
                            }
                            var9 = this.method908(arg0, var9, var5, var10, var4.field248[this.field324]);
                            if (this.field322 >= var5) {
                                return;
                            }
                            this.field322 = var5 + var5 - 1 - this.field322;
                            this.field317 = -this.field317;
                        } while (--this.field330 != 0);
                    }
                } else if (this.field317 < 0) {
                    while (true) {
                        var9 = this.method908(arg0, var9, var5, var10, var4.field248[this.field323 - 1]);
                        if (this.field322 >= var5) {
                            return;
                        }
                        int var12 = (var6 - 1 - this.field322) / var8;
                        if (var12 >= this.field330) {
                            this.field322 += this.field330 * var8;
                            this.field330 = 0;
                            break;
                        }
                        this.field322 += var8 * var12;
                        this.field330 -= var12;
                    }
                } else {
                    while (true) {
                        var9 = this.method918(arg0, var9, var6, var10, var4.field248[this.field324]);
                        if (this.field322 < var6) {
                            return;
                        }
                        int var13 = (this.field322 - var5) / var8;
                        if (var13 >= this.field330) {
                            this.field322 -= this.field330 * var8;
                            this.field330 = 0;
                            break;
                        }
                        this.field322 -= var8 * var13;
                        this.field330 -= var13;
                    }
                }
            }
            if (this.field317 < 0) {
                this.method908(arg0, var9, 0, var10, 0);
                if (this.field322 < 0) {
                    this.field322 = -1;
                    this.method887();
                    this.method8130();
                }
            } else {
                this.method918(arg0, var9, var7, var10, 0);
                if (this.field322 >= var7) {
                    this.field322 = var7;
                    this.method887();
                    this.method8130();
                }
            }
        } else if (this.field316) {
            if (this.field317 < 0) {
                var9 = this.method908(arg0, arg1, var5, var10, var4.field248[this.field324]);
                if (this.field322 >= var5) {
                    return;
                }
                this.field322 = var5 + var5 - 1 - this.field322;
                this.field317 = -this.field317;
            }
            while (true) {
                int var11 = this.method918(arg0, var9, var6, var10, var4.field248[this.field323 - 1]);
                if (this.field322 < var6) {
                    return;
                }
                this.field322 = var6 + var6 - 1 - this.field322;
                this.field317 = -this.field317;
                var9 = this.method908(arg0, var11, var5, var10, var4.field248[this.field324]);
                if (this.field322 >= var5) {
                    return;
                }
                this.field322 = var5 + var5 - 1 - this.field322;
                this.field317 = -this.field317;
            }
        } else if (this.field317 < 0) {
            while (true) {
                var9 = this.method908(arg0, var9, var5, var10, var4.field248[this.field323 - 1]);
                if (this.field322 >= var5) {
                    return;
                }
                this.field322 = var6 - 1 - (var6 - 1 - this.field322) % var8;
            }
        } else {
            while (true) {
                var9 = this.method918(arg0, var9, var6, var10, var4.field248[this.field324]);
                if (this.field322 < var6) {
                    return;
                }
                this.field322 = (this.field322 - var5) % var8 + var5;
            }
        }
    }

    @ObfuscatedName("bz.ae(I)V")
    public synchronized void method721(int arg0) {
        if (this.field327 > 0) {
            if (arg0 >= this.field327) {
                if (this.field318 == Integer.MIN_VALUE) {
                    this.field318 = 0;
                    this.field326 = 0;
                    this.field321 = 0;
                    this.field320 = 0;
                    this.method8130();
                    arg0 = this.field327;
                }
                this.field327 = 0;
                this.method879();
            } else {
                this.field320 += this.field328 * arg0;
                this.field321 += this.field325 * arg0;
                this.field326 += this.field329 * arg0;
                this.field327 -= arg0;
            }
        }
        class41 var2 = (class41) this.field334;
        int var3 = this.field324 << 8;
        int var4 = this.field323 << 8;
        int var5 = var2.field248.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field330 = 0;
        }
        if (this.field322 < 0) {
            if (this.field317 <= 0) {
                this.method887();
                this.method8130();
                return;
            }
            this.field322 = 0;
        }
        if (this.field322 >= var5) {
            if (this.field317 >= 0) {
                this.method887();
                this.method8130();
                return;
            }
            this.field322 = var5 - 1;
        }
        this.field322 += this.field317 * arg0;
        if (this.field330 >= 0) {
            if (this.field330 > 0) {
                if (this.field316) {
                    label121: {
                        if (this.field317 < 0) {
                            if (this.field322 >= var3) {
                                return;
                            }
                            this.field322 = var3 + var3 - 1 - this.field322;
                            this.field317 = -this.field317;
                            if (--this.field330 == 0) {
                                break label121;
                            }
                        }
                        do {
                            if (this.field322 < var4) {
                                return;
                            }
                            this.field322 = var4 + var4 - 1 - this.field322;
                            this.field317 = -this.field317;
                            if (--this.field330 == 0) {
                                break;
                            }
                            if (this.field322 >= var3) {
                                return;
                            }
                            this.field322 = var3 + var3 - 1 - this.field322;
                            this.field317 = -this.field317;
                        } while (--this.field330 != 0);
                    }
                } else {
                    label153: {
                        if (this.field317 < 0) {
                            if (this.field322 >= var3) {
                                return;
                            }
                            int var7 = (var4 - 1 - this.field322) / var6;
                            if (var7 >= this.field330) {
                                this.field322 += this.field330 * var6;
                                this.field330 = 0;
                                break label153;
                            }
                            this.field322 += var6 * var7;
                            this.field330 -= var7;
                        } else if (this.field322 >= var4) {
                            int var8 = (this.field322 - var3) / var6;
                            if (var8 >= this.field330) {
                                this.field322 -= this.field330 * var6;
                                this.field330 = 0;
                                break label153;
                            }
                            this.field322 -= var6 * var8;
                            this.field330 -= var8;
                        } else {
                            return;
                        }
                        return;
                    }
                }
            }
            if (this.field317 < 0) {
                if (this.field322 < 0) {
                    this.field322 = -1;
                    this.method887();
                    this.method8130();
                }
            } else if (this.field322 >= var5) {
                this.field322 = var5;
                this.method887();
                this.method8130();
            }
        } else if (this.field316) {
            if (this.field317 < 0) {
                if (this.field322 >= var3) {
                    return;
                }
                this.field322 = var3 + var3 - 1 - this.field322;
                this.field317 = -this.field317;
            }
            while (this.field322 >= var4) {
                this.field322 = var4 + var4 - 1 - this.field322;
                this.field317 = -this.field317;
                if (this.field322 >= var3) {
                    return;
                }
                this.field322 = var3 + var3 - 1 - this.field322;
                this.field317 = -this.field317;
            }
        } else if (this.field317 < 0) {
            if (this.field322 >= var3) {
                return;
            }
            this.field322 = var4 - 1 - (var4 - 1 - this.field322) % var6;
        } else if (this.field322 >= var4) {
            this.field322 = (this.field322 - var3) % var6 + var3;
        } else {
            return;
        }
    }

    @ObfuscatedName("bz.by([IIIII)I")
    public int method918(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field327 > 0) {
                int var6 = this.field327 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field327 += arg1;
                if (this.field317 == 256 && (this.field322 & 0xFF) == 0) {
                    if (Statics.field1001) {
                        arg1 = method907(0, ((class41) this.field334).field248, arg0, this.field322, arg1, this.field321, this.field326, this.field325, this.field329, 0, var6, arg2, this);
                    } else {
                        arg1 = method906(((class41) this.field334).field248, arg0, this.field322, arg1, this.field320, this.field328, 0, var6, arg2, this);
                    }
                } else if (Statics.field1001) {
                    arg1 = method911(0, 0, ((class41) this.field334).field248, arg0, this.field322, arg1, this.field321, this.field326, this.field325, this.field329, 0, var6, arg2, this, this.field317, arg4);
                } else {
                    arg1 = method910(0, 0, ((class41) this.field334).field248, arg0, this.field322, arg1, this.field320, this.field328, 0, var6, arg2, this, this.field317, arg4);
                }
                this.field327 -= arg1;
                if (this.field327 != 0) {
                    return arg1;
                }
                if (!this.method897()) {
                    continue;
                }
                return arg3;
            }
            if (this.field317 == 256 && (this.field322 & 0xFF) == 0) {
                if (Statics.field1001) {
                    return method899(0, ((class41) this.field334).field248, arg0, this.field322, arg1, this.field321, this.field326, 0, arg3, arg2, this);
                }
                return method935(((class41) this.field334).field248, arg0, this.field322, arg1, this.field320, 0, arg3, arg2, this);
            }
            if (Statics.field1001) {
                return method928(0, 0, ((class41) this.field334).field248, arg0, this.field322, arg1, this.field321, this.field326, 0, arg3, arg2, this, this.field317, arg4);
            }
            return method902(0, 0, ((class41) this.field334).field248, arg0, this.field322, arg1, this.field320, 0, arg3, arg2, this, this.field317, arg4);
        }
    }

    @ObfuscatedName("bz.bc([IIIII)I")
    public int method908(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field327 > 0) {
                int var6 = this.field327 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field327 += arg1;
                if (this.field317 == -256 && (this.field322 & 0xFF) == 0) {
                    if (Statics.field1001) {
                        arg1 = method909(0, ((class41) this.field334).field248, arg0, this.field322, arg1, this.field321, this.field326, this.field325, this.field329, 0, var6, arg2, this);
                    } else {
                        arg1 = method934(((class41) this.field334).field248, arg0, this.field322, arg1, this.field320, this.field328, 0, var6, arg2, this);
                    }
                } else if (Statics.field1001) {
                    arg1 = method913(0, 0, ((class41) this.field334).field248, arg0, this.field322, arg1, this.field321, this.field326, this.field325, this.field329, 0, var6, arg2, this, this.field317, arg4);
                } else {
                    arg1 = method912(0, 0, ((class41) this.field334).field248, arg0, this.field322, arg1, this.field320, this.field328, 0, var6, arg2, this, this.field317, arg4);
                }
                this.field327 -= arg1;
                if (this.field327 != 0) {
                    return arg1;
                }
                if (!this.method897()) {
                    continue;
                }
                return arg3;
            }
            if (this.field317 == -256 && (this.field322 & 0xFF) == 0) {
                if (Statics.field1001) {
                    return method914(0, ((class41) this.field334).field248, arg0, this.field322, arg1, this.field321, this.field326, 0, arg3, arg2, this);
                }
                return method900(((class41) this.field334).field248, arg0, this.field322, arg1, this.field320, 0, arg3, arg2, this);
            }
            if (Statics.field1001) {
                return method915(0, 0, ((class41) this.field334).field248, arg0, this.field322, arg1, this.field321, this.field326, 0, arg3, arg2, this, this.field317, arg4);
            }
            return method904(0, 0, ((class41) this.field334).field248, arg0, this.field322, arg1, this.field320, 0, arg3, arg2, this, this.field317, arg4);
        }
    }

    @ObfuscatedName("bz.bb()Z")
    public boolean method897() {
        int var1 = this.field318;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method894(var1, this.field319);
            var2 = method967(var1, this.field319);
        }
        if (this.field320 != var1 || this.field321 != var3 || this.field326 != var2) {
            if (this.field320 < var1) {
                this.field328 = 1;
                this.field327 = var1 - this.field320;
            } else if (this.field320 > var1) {
                this.field328 = -1;
                this.field327 = this.field320 - var1;
            } else {
                this.field328 = 0;
            }
            if (this.field321 < var3) {
                this.field325 = 1;
                if (this.field327 == 0 || this.field327 > var3 - this.field321) {
                    this.field327 = var3 - this.field321;
                }
            } else if (this.field321 > var3) {
                this.field325 = -1;
                if (this.field327 == 0 || this.field327 > this.field321 - var3) {
                    this.field327 = this.field321 - var3;
                }
            } else {
                this.field325 = 0;
            }
            if (this.field326 < var2) {
                this.field329 = 1;
                if (this.field327 == 0 || this.field327 > var2 - this.field326) {
                    this.field327 = var2 - this.field326;
                }
            } else if (this.field326 > var2) {
                this.field329 = -1;
                if (this.field327 == 0 || this.field327 > this.field326 - var2) {
                    this.field327 = this.field326 - var2;
                }
            } else {
                this.field329 = 0;
            }
            return false;
        } else if (this.field318 == Integer.MIN_VALUE) {
            this.field318 = 0;
            this.field326 = 0;
            this.field321 = 0;
            this.field320 = 0;
            this.method8130();
            return true;
        } else {
            this.method879();
            return false;
        }
    }

    @ObfuscatedName("bz.bn([B[IIIIIIILbz;)I")
    public static int method935(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class49 arg8) {
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
        arg8.field322 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("bz.bh(I[B[IIIIIIIILbz;)I")
    public static int method899(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class49 arg10) {
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
        arg10.field322 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("bz.bq([B[IIIIIIILbz;)I")
    public static int method900(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class49 arg8) {
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
        arg8.field322 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("bz.bd(I[B[IIIIIIIILbz;)I")
    public static int method914(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class49 arg10) {
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
        arg10.field322 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("bz.bz(II[B[IIIIIIILbz;II)I")
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
        arg10.field322 = arg4;
        return arg5;
    }

    @ObfuscatedName("bz.bk(II[B[IIIIIIIILbz;II)I")
    public static int method928(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class49 arg11, int arg12, int arg13) {
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
        arg11.field322 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("bz.br(II[B[IIIIIIILbz;II)I")
    public static int method904(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class49 arg10, int arg11, int arg12) {
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
        arg10.field322 = arg4;
        return arg5;
    }

    @ObfuscatedName("bz.bf(II[B[IIIIIIIILbz;II)I")
    public static int method915(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class49 arg11, int arg12, int arg13) {
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
        arg11.field322 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("bz.cf([B[IIIIIIIILbz;)I")
    public static int method906(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class49 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field321 += (var14 - arg3) * arg9.field325;
        arg9.field326 += (var14 - arg3) * arg9.field329;
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
        arg9.field320 = var12 >> 2;
        arg9.field322 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("bz.cv(I[B[IIIIIIIIIILbz;)I")
    public static int method907(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class49 arg12) {
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
        arg12.field320 += (var19 - arg4) * arg12.field328;
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
        arg12.field321 = var15 >> 2;
        arg12.field326 = var16 >> 2;
        arg12.field322 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("bz.cl([B[IIIIIIIILbz;)I")
    public static int method934(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class49 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field321 += (var14 - arg3) * arg9.field325;
        arg9.field326 += (var14 - arg3) * arg9.field329;
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
        arg9.field320 = var12 >> 2;
        arg9.field322 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("bz.cm(I[B[IIIIIIIIIILbz;)I")
    public static int method909(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class49 arg12) {
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
        arg12.field320 += (var19 - arg4) * arg12.field328;
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
        arg12.field321 = var15 >> 2;
        arg12.field326 = var16 >> 2;
        arg12.field322 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("bz.cg(II[B[IIIIIIIILbz;II)I")
    public static int method910(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class49 arg11, int arg12, int arg13) {
        arg11.field321 -= arg11.field325 * arg5;
        arg11.field326 -= arg11.field329 * arg5;
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
        arg11.field321 += arg11.field325 * arg5;
        arg11.field326 += arg11.field329 * arg5;
        arg11.field320 = arg6;
        arg11.field322 = arg4;
        return arg5;
    }

    @ObfuscatedName("bz.cu(II[B[IIIIIIIIIILbz;II)I")
    public static int method911(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class49 arg13, int arg14, int arg15) {
        arg13.field320 -= arg13.field328 * arg5;
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
        arg13.field320 += arg13.field328 * var27;
        arg13.field321 = arg6;
        arg13.field326 = arg7;
        arg13.field322 = arg4;
        return var27;
    }

    @ObfuscatedName("bz.cn(II[B[IIIIIIIILbz;II)I")
    public static int method912(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class49 arg11, int arg12, int arg13) {
        arg11.field321 -= arg11.field325 * arg5;
        arg11.field326 -= arg11.field329 * arg5;
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
        arg11.field321 += arg11.field325 * arg5;
        arg11.field326 += arg11.field329 * arg5;
        arg11.field320 = arg6;
        arg11.field322 = arg4;
        return arg5;
    }

    @ObfuscatedName("bz.ce(II[B[IIIIIIIIIILbz;II)I")
    public static int method913(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class49 arg13, int arg14, int arg15) {
        arg13.field320 -= arg13.field328 * arg5;
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
        arg13.field320 += arg13.field328 * var26;
        arg13.field321 = arg6;
        arg13.field326 = arg7;
        arg13.field322 = arg4;
        return var26;
    }
}
