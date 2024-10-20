package deob;

@ObfuscatedName("bf")
public class class49 extends class50 {

    @ObfuscatedName("bf.ap")
    public int field315;

    @ObfuscatedName("bf.aw")
    public int field312;

    @ObfuscatedName("bf.ak")
    public int field313;

    @ObfuscatedName("bf.aj")
    public int field324;

    @ObfuscatedName("bf.ai")
    public int field323;

    @ObfuscatedName("bf.ay")
    public int field316;

    @ObfuscatedName("bf.as")
    public int field317;

    @ObfuscatedName("bf.ae")
    public int field321;

    @ObfuscatedName("bf.am")
    public int field319;

    @ObfuscatedName("bf.at")
    public int field314;

    @ObfuscatedName("bf.au")
    public boolean field320;

    @ObfuscatedName("bf.an")
    public int field311;

    @ObfuscatedName("bf.ao")
    public int field318;

    @ObfuscatedName("bf.af")
    public int field322;

    @ObfuscatedName("bf.ar")
    public int field325;

    @ObfuscatedName("bf.ap(II)I")
    public static int method988(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("bf.aw(II)I")
    public static int method874(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("bf.bt()I")
    public int method876() {
        int var1 = this.field323 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field321 == 0) {
            var2 -= this.field315 * var2 / (((class41) this.field326).field242.length << 8);
        } else if (this.field321 >= 0) {
            var2 -= this.field319 * var2 / ((class41) this.field326).field242.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    public class49(class41 arg0, int arg1, int arg2) {
        this.field326 = arg0;
        this.field319 = arg0.field245;
        this.field314 = arg0.field243;
        this.field320 = arg0.field241;
        this.field312 = arg1;
        this.field313 = arg2;
        this.field324 = 8192;
        this.field315 = 0;
        this.method878();
    }

    public class49(class41 arg0, int arg1, int arg2, int arg3) {
        this.field326 = arg0;
        this.field319 = arg0.field245;
        this.field314 = arg0.field243;
        this.field320 = arg0.field241;
        this.field312 = arg1;
        this.field313 = arg2;
        this.field324 = arg3;
        this.field315 = 0;
        this.method878();
    }

    @ObfuscatedName("bf.ak(Lbt;II)Lbf;")
    public static class49 method957(class41 arg0, int arg1, int arg2) {
        return arg0.field242 == null || arg0.field242.length == 0 ? null : new class49(arg0, (int) ((long) arg0.field244 * 256L * (long) arg1 / (long) (Statics.field1060 * 100)), arg2 << 6);
    }

    @ObfuscatedName("bf.aj(Lbt;III)Lbf;")
    public static class49 method877(class41 arg0, int arg1, int arg2, int arg3) {
        return arg0.field242 == null || arg0.field242.length == 0 ? null : new class49(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("bf.ai()V")
    public void method878() {
        this.field323 = this.field313;
        this.field316 = method988(this.field313, this.field324);
        this.field317 = method874(this.field313, this.field324);
    }

    @ObfuscatedName("bf.at(I)V")
    public synchronized void method879(int arg0) {
        this.field321 = arg0;
    }

    @ObfuscatedName("bf.an(I)V")
    public synchronized void method880(int arg0) {
        this.method882(arg0 << 6, this.method884());
    }

    @ObfuscatedName("bf.ao(I)V")
    public synchronized void method881(int arg0) {
        this.method882(arg0, this.method884());
    }

    @ObfuscatedName("bf.af(II)V")
    public synchronized void method882(int arg0, int arg1) {
        this.field313 = arg0;
        this.field324 = arg1;
        this.field311 = 0;
        this.method878();
    }

    @ObfuscatedName("bf.ar()I")
    public synchronized int method990() {
        return this.field313 == Integer.MIN_VALUE ? 0 : this.field313;
    }

    @ObfuscatedName("bf.ab()I")
    public synchronized int method884() {
        return this.field324 < 0 ? -1 : this.field324;
    }

    @ObfuscatedName("bf.az(I)V")
    public synchronized void method891(int arg0) {
        int var2 = ((class41) this.field326).field242.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field315 = arg0;
    }

    @ObfuscatedName("bf.ag(Z)V")
    public synchronized void method1011(boolean arg0) {
        this.field312 = (this.field312 >>> 31) + (this.field312 ^ this.field312 >> 31);
        if (arg0) {
            this.field312 = -this.field312;
        }
    }

    @ObfuscatedName("bf.ad()V")
    public void method887() {
        if (this.field311 == 0) {
            return;
        }
        if (this.field313 == Integer.MIN_VALUE) {
            this.field313 = 0;
        }
        this.field311 = 0;
        this.method878();
    }

    @ObfuscatedName("bf.ac(II)V")
    public synchronized void method888(int arg0, int arg1) {
        this.method889(arg0, arg1, this.method884());
    }

    @ObfuscatedName("bf.av(III)V")
    public synchronized void method889(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method882(arg1, arg2);
            return;
        }
        int var4 = method988(arg1, arg2);
        int var5 = method874(arg1, arg2);
        if (this.field316 == var4 && this.field317 == var5) {
            this.field311 = 0;
            return;
        }
        int var6 = arg1 - this.field323;
        if (this.field323 - arg1 > var6) {
            var6 = this.field323 - arg1;
        }
        if (var4 - this.field316 > var6) {
            var6 = var4 - this.field316;
        }
        if (this.field316 - var4 > var6) {
            var6 = this.field316 - var4;
        }
        if (var5 - this.field317 > var6) {
            var6 = var5 - this.field317;
        }
        if (this.field317 - var5 > var6) {
            var6 = this.field317 - var5;
        }
        if (arg0 > var6) {
            arg0 = var6;
        }
        this.field311 = arg0;
        this.field313 = arg1;
        this.field324 = arg2;
        this.field318 = (arg1 - this.field323) / arg0;
        this.field322 = (var4 - this.field316) / arg0;
        this.field325 = (var5 - this.field317) / arg0;
    }

    @ObfuscatedName("bf.ax(I)V")
    public synchronized void method1002(int arg0) {
        if (arg0 == 0) {
            this.method881(0);
            this.method8667();
        } else if (this.field316 == 0 && this.field317 == 0) {
            this.field311 = 0;
            this.field313 = 0;
            this.field323 = 0;
            this.method8667();
        } else {
            int var2 = -this.field323;
            if (this.field323 > var2) {
                var2 = this.field323;
            }
            if (-this.field316 > var2) {
                var2 = -this.field316;
            }
            if (this.field316 > var2) {
                var2 = this.field316;
            }
            if (-this.field317 > var2) {
                var2 = -this.field317;
            }
            if (this.field317 > var2) {
                var2 = this.field317;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field311 = arg0;
            this.field313 = Integer.MIN_VALUE;
            this.field318 = -this.field323 / arg0;
            this.field322 = -this.field316 / arg0;
            this.field325 = -this.field317 / arg0;
        }
    }

    @ObfuscatedName("bf.aq(I)V")
    public synchronized void method984(int arg0) {
        if (this.field312 < 0) {
            this.field312 = -arg0;
        } else {
            this.field312 = arg0;
        }
    }

    @ObfuscatedName("bf.al()I")
    public synchronized int method963() {
        return this.field312 < 0 ? -this.field312 : this.field312;
    }

    @ObfuscatedName("bf.bb()Z")
    public boolean method893() {
        return this.field315 < 0 || this.field315 >= ((class41) this.field326).field242.length << 8;
    }

    @ObfuscatedName("bf.bq()Z")
    public boolean method894() {
        return this.field311 != 0;
    }

    @ObfuscatedName("bf.ay()Lbg;")
    public class50 method703() {
        return null;
    }

    @ObfuscatedName("bf.as()Lbg;")
    public class50 method722() {
        return null;
    }

    @ObfuscatedName("bf.ae()I")
    public int method705() {
        return this.field313 == 0 && this.field311 == 0 ? 0 : 1;
    }

    @ObfuscatedName("bf.am([III)V")
    public synchronized void method706(int[] arg0, int arg1, int arg2) {
        if (this.field313 == 0 && this.field311 == 0) {
            this.method708(arg2);
            return;
        }
        class41 var4 = (class41) this.field326;
        int var5 = this.field319 << 8;
        int var6 = this.field314 << 8;
        int var7 = var4.field242.length << 8;
        int var8 = var6 - var5;
        if (var8 <= 0) {
            this.field321 = 0;
        }
        int var9 = arg1;
        int var10 = arg1 + arg2;
        if (this.field315 < 0) {
            if (this.field312 <= 0) {
                this.method887();
                this.method8667();
                return;
            }
            this.field315 = 0;
        }
        if (this.field315 >= var7) {
            if (this.field312 >= 0) {
                this.method887();
                this.method8667();
                return;
            }
            this.field315 = var7 - 1;
        }
        if (this.field321 >= 0) {
            if (this.field321 > 0) {
                if (this.field320) {
                    label131: {
                        if (this.field312 < 0) {
                            var9 = this.method992(arg0, arg1, var5, var10, var4.field242[this.field319]);
                            if (this.field315 >= var5) {
                                return;
                            }
                            this.field315 = var5 + var5 - 1 - this.field315;
                            this.field312 = -this.field312;
                            if (--this.field321 == 0) {
                                break label131;
                            }
                        }
                        do {
                            var9 = this.method900(arg0, var9, var6, var10, var4.field242[this.field314 - 1]);
                            if (this.field315 < var6) {
                                return;
                            }
                            this.field315 = var6 + var6 - 1 - this.field315;
                            this.field312 = -this.field312;
                            if (--this.field321 == 0) {
                                break;
                            }
                            var9 = this.method992(arg0, var9, var5, var10, var4.field242[this.field319]);
                            if (this.field315 >= var5) {
                                return;
                            }
                            this.field315 = var5 + var5 - 1 - this.field315;
                            this.field312 = -this.field312;
                        } while (--this.field321 != 0);
                    }
                } else if (this.field312 < 0) {
                    while (true) {
                        var9 = this.method992(arg0, var9, var5, var10, var4.field242[this.field314 - 1]);
                        if (this.field315 >= var5) {
                            return;
                        }
                        int var12 = (var6 - 1 - this.field315) / var8;
                        if (var12 >= this.field321) {
                            this.field315 += this.field321 * var8;
                            this.field321 = 0;
                            break;
                        }
                        this.field315 += var8 * var12;
                        this.field321 -= var12;
                    }
                } else {
                    while (true) {
                        var9 = this.method900(arg0, var9, var6, var10, var4.field242[this.field319]);
                        if (this.field315 < var6) {
                            return;
                        }
                        int var13 = (this.field315 - var5) / var8;
                        if (var13 >= this.field321) {
                            this.field315 -= this.field321 * var8;
                            this.field321 = 0;
                            break;
                        }
                        this.field315 -= var8 * var13;
                        this.field321 -= var13;
                    }
                }
            }
            if (this.field312 < 0) {
                this.method992(arg0, var9, 0, var10, 0);
                if (this.field315 < 0) {
                    this.field315 = -1;
                    this.method887();
                    this.method8667();
                }
            } else {
                this.method900(arg0, var9, var7, var10, 0);
                if (this.field315 >= var7) {
                    this.field315 = var7;
                    this.method887();
                    this.method8667();
                }
            }
        } else if (this.field320) {
            if (this.field312 < 0) {
                var9 = this.method992(arg0, arg1, var5, var10, var4.field242[this.field319]);
                if (this.field315 >= var5) {
                    return;
                }
                this.field315 = var5 + var5 - 1 - this.field315;
                this.field312 = -this.field312;
            }
            while (true) {
                int var11 = this.method900(arg0, var9, var6, var10, var4.field242[this.field314 - 1]);
                if (this.field315 < var6) {
                    return;
                }
                this.field315 = var6 + var6 - 1 - this.field315;
                this.field312 = -this.field312;
                var9 = this.method992(arg0, var11, var5, var10, var4.field242[this.field319]);
                if (this.field315 >= var5) {
                    return;
                }
                this.field315 = var5 + var5 - 1 - this.field315;
                this.field312 = -this.field312;
            }
        } else if (this.field312 < 0) {
            while (true) {
                var9 = this.method992(arg0, var9, var5, var10, var4.field242[this.field314 - 1]);
                if (this.field315 >= var5) {
                    return;
                }
                this.field315 = var6 - 1 - (var6 - 1 - this.field315) % var8;
            }
        } else {
            while (true) {
                var9 = this.method900(arg0, var9, var6, var10, var4.field242[this.field319]);
                if (this.field315 < var6) {
                    return;
                }
                this.field315 = (this.field315 - var5) % var8 + var5;
            }
        }
    }

    @ObfuscatedName("bf.au(I)V")
    public synchronized void method708(int arg0) {
        if (this.field311 > 0) {
            if (arg0 >= this.field311) {
                if (this.field313 == Integer.MIN_VALUE) {
                    this.field313 = 0;
                    this.field317 = 0;
                    this.field316 = 0;
                    this.field323 = 0;
                    this.method8667();
                    arg0 = this.field311;
                }
                this.field311 = 0;
                this.method878();
            } else {
                this.field323 += this.field318 * arg0;
                this.field316 += this.field322 * arg0;
                this.field317 += this.field325 * arg0;
                this.field311 -= arg0;
            }
        }
        class41 var2 = (class41) this.field326;
        int var3 = this.field319 << 8;
        int var4 = this.field314 << 8;
        int var5 = var2.field242.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field321 = 0;
        }
        if (this.field315 < 0) {
            if (this.field312 <= 0) {
                this.method887();
                this.method8667();
                return;
            }
            this.field315 = 0;
        }
        if (this.field315 >= var5) {
            if (this.field312 >= 0) {
                this.method887();
                this.method8667();
                return;
            }
            this.field315 = var5 - 1;
        }
        this.field315 += this.field312 * arg0;
        if (this.field321 >= 0) {
            if (this.field321 > 0) {
                if (this.field320) {
                    label121: {
                        if (this.field312 < 0) {
                            if (this.field315 >= var3) {
                                return;
                            }
                            this.field315 = var3 + var3 - 1 - this.field315;
                            this.field312 = -this.field312;
                            if (--this.field321 == 0) {
                                break label121;
                            }
                        }
                        do {
                            if (this.field315 < var4) {
                                return;
                            }
                            this.field315 = var4 + var4 - 1 - this.field315;
                            this.field312 = -this.field312;
                            if (--this.field321 == 0) {
                                break;
                            }
                            if (this.field315 >= var3) {
                                return;
                            }
                            this.field315 = var3 + var3 - 1 - this.field315;
                            this.field312 = -this.field312;
                        } while (--this.field321 != 0);
                    }
                } else {
                    label153: {
                        if (this.field312 < 0) {
                            if (this.field315 >= var3) {
                                return;
                            }
                            int var7 = (var4 - 1 - this.field315) / var6;
                            if (var7 >= this.field321) {
                                this.field315 += this.field321 * var6;
                                this.field321 = 0;
                                break label153;
                            }
                            this.field315 += var6 * var7;
                            this.field321 -= var7;
                        } else if (this.field315 >= var4) {
                            int var8 = (this.field315 - var3) / var6;
                            if (var8 >= this.field321) {
                                this.field315 -= this.field321 * var6;
                                this.field321 = 0;
                                break label153;
                            }
                            this.field315 -= var6 * var8;
                            this.field321 -= var8;
                        } else {
                            return;
                        }
                        return;
                    }
                }
            }
            if (this.field312 < 0) {
                if (this.field315 < 0) {
                    this.field315 = -1;
                    this.method887();
                    this.method8667();
                }
            } else if (this.field315 >= var5) {
                this.field315 = var5;
                this.method887();
                this.method8667();
            }
        } else if (this.field320) {
            if (this.field312 < 0) {
                if (this.field315 >= var3) {
                    return;
                }
                this.field315 = var3 + var3 - 1 - this.field315;
                this.field312 = -this.field312;
            }
            while (this.field315 >= var4) {
                this.field315 = var4 + var4 - 1 - this.field315;
                this.field312 = -this.field312;
                if (this.field315 >= var3) {
                    return;
                }
                this.field315 = var3 + var3 - 1 - this.field315;
                this.field312 = -this.field312;
            }
        } else if (this.field312 < 0) {
            if (this.field315 >= var3) {
                return;
            }
            this.field315 = var4 - 1 - (var4 - 1 - this.field315) % var6;
        } else if (this.field315 >= var4) {
            this.field315 = (this.field315 - var3) % var6 + var3;
        } else {
            return;
        }
    }

    @ObfuscatedName("bf.bp([IIIII)I")
    public int method900(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field311 > 0) {
                int var6 = this.field311 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field311 += arg1;
                if (this.field312 == 256 && (this.field315 & 0xFF) == 0) {
                    if (Statics.field5411) {
                        arg1 = method962(0, ((class41) this.field326).field242, arg0, this.field315, arg1, this.field316, this.field317, this.field322, this.field325, 0, var6, arg2, this);
                    } else {
                        arg1 = method905(((class41) this.field326).field242, arg0, this.field315, arg1, this.field323, this.field318, 0, var6, arg2, this);
                    }
                } else if (Statics.field5411) {
                    arg1 = method991(0, 0, ((class41) this.field326).field242, arg0, this.field315, arg1, this.field316, this.field317, this.field322, this.field325, 0, var6, arg2, this, this.field312, arg4);
                } else {
                    arg1 = method908(0, 0, ((class41) this.field326).field242, arg0, this.field315, arg1, this.field323, this.field318, 0, var6, arg2, this, this.field312, arg4);
                }
                this.field311 -= arg1;
                if (this.field311 != 0) {
                    return arg1;
                }
                if (!this.method897()) {
                    continue;
                }
                return arg3;
            }
            if (this.field312 == 256 && (this.field315 & 0xFF) == 0) {
                if (Statics.field5411) {
                    return method896(0, ((class41) this.field326).field242, arg0, this.field315, arg1, this.field316, this.field317, 0, arg3, arg2, this);
                }
                return method898(((class41) this.field326).field242, arg0, this.field315, arg1, this.field323, 0, arg3, arg2, this);
            }
            if (Statics.field5411) {
                return method902(0, 0, ((class41) this.field326).field242, arg0, this.field315, arg1, this.field316, this.field317, 0, arg3, arg2, this, this.field312, arg4);
            }
            return method933(0, 0, ((class41) this.field326).field242, arg0, this.field315, arg1, this.field323, 0, arg3, arg2, this, this.field312, arg4);
        }
    }

    @ObfuscatedName("bf.by([IIIII)I")
    public int method992(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field311 > 0) {
                int var6 = this.field311 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field311 += arg1;
                if (this.field312 == -256 && (this.field315 & 0xFF) == 0) {
                    if (Statics.field5411) {
                        arg1 = method907(0, ((class41) this.field326).field242, arg0, this.field315, arg1, this.field316, this.field317, this.field322, this.field325, 0, var6, arg2, this);
                    } else {
                        arg1 = method906(((class41) this.field326).field242, arg0, this.field315, arg1, this.field323, this.field318, 0, var6, arg2, this);
                    }
                } else if (Statics.field5411) {
                    arg1 = method911(0, 0, ((class41) this.field326).field242, arg0, this.field315, arg1, this.field316, this.field317, this.field322, this.field325, 0, var6, arg2, this, this.field312, arg4);
                } else {
                    arg1 = method910(0, 0, ((class41) this.field326).field242, arg0, this.field315, arg1, this.field323, this.field318, 0, var6, arg2, this, this.field312, arg4);
                }
                this.field311 -= arg1;
                if (this.field311 != 0) {
                    return arg1;
                }
                if (!this.method897()) {
                    continue;
                }
                return arg3;
            }
            if (this.field312 == -256 && (this.field315 & 0xFF) == 0) {
                if (Statics.field5411) {
                    return method901(0, ((class41) this.field326).field242, arg0, this.field315, arg1, this.field316, this.field317, 0, arg3, arg2, this);
                }
                return method1004(((class41) this.field326).field242, arg0, this.field315, arg1, this.field323, 0, arg3, arg2, this);
            }
            if (Statics.field5411) {
                return method915(0, 0, ((class41) this.field326).field242, arg0, this.field315, arg1, this.field316, this.field317, 0, arg3, arg2, this, this.field312, arg4);
            }
            return method903(0, 0, ((class41) this.field326).field242, arg0, this.field315, arg1, this.field323, 0, arg3, arg2, this, this.field312, arg4);
        }
    }

    @ObfuscatedName("bf.br()Z")
    public boolean method897() {
        int var1 = this.field313;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method988(var1, this.field324);
            var2 = method874(var1, this.field324);
        }
        if (this.field323 != var1 || this.field316 != var3 || this.field317 != var2) {
            if (this.field323 < var1) {
                this.field318 = 1;
                this.field311 = var1 - this.field323;
            } else if (this.field323 > var1) {
                this.field318 = -1;
                this.field311 = this.field323 - var1;
            } else {
                this.field318 = 0;
            }
            if (this.field316 < var3) {
                this.field322 = 1;
                if (this.field311 == 0 || this.field311 > var3 - this.field316) {
                    this.field311 = var3 - this.field316;
                }
            } else if (this.field316 > var3) {
                this.field322 = -1;
                if (this.field311 == 0 || this.field311 > this.field316 - var3) {
                    this.field311 = this.field316 - var3;
                }
            } else {
                this.field322 = 0;
            }
            if (this.field317 < var2) {
                this.field325 = 1;
                if (this.field311 == 0 || this.field311 > var2 - this.field317) {
                    this.field311 = var2 - this.field317;
                }
            } else if (this.field317 > var2) {
                this.field325 = -1;
                if (this.field311 == 0 || this.field311 > this.field317 - var2) {
                    this.field311 = this.field317 - var2;
                }
            } else {
                this.field325 = 0;
            }
            return false;
        } else if (this.field313 == Integer.MIN_VALUE) {
            this.field313 = 0;
            this.field317 = 0;
            this.field316 = 0;
            this.field323 = 0;
            this.method8667();
            return true;
        } else {
            this.method878();
            return false;
        }
    }

    @ObfuscatedName("bf.bn([B[IIIIIIILbf;)I")
    public static int method898(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class49 arg8) {
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
        arg8.field315 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("bf.bu(I[B[IIIIIIIILbf;)I")
    public static int method896(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class49 arg10) {
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
        arg10.field315 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("bf.bs([B[IIIIIIILbf;)I")
    public static int method1004(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class49 arg8) {
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
        arg8.field315 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("bf.bm(I[B[IIIIIIIILbf;)I")
    public static int method901(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class49 arg10) {
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
        arg10.field315 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("bf.bo(II[B[IIIIIIILbf;II)I")
    public static int method933(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class49 arg10, int arg11, int arg12) {
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
        arg10.field315 = arg4;
        return arg5;
    }

    @ObfuscatedName("bf.bd(II[B[IIIIIIIILbf;II)I")
    public static int method902(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class49 arg11, int arg12, int arg13) {
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
        arg11.field315 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("bf.ba(II[B[IIIIIIILbf;II)I")
    public static int method903(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class49 arg10, int arg11, int arg12) {
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
        arg10.field315 = arg4;
        return arg5;
    }

    @ObfuscatedName("bf.bw(II[B[IIIIIIIILbf;II)I")
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
        arg11.field315 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("bf.bi([B[IIIIIIIILbf;)I")
    public static int method905(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class49 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field316 += (var14 - arg3) * arg9.field322;
        arg9.field317 += (var14 - arg3) * arg9.field325;
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
        arg9.field323 = var12 >> 2;
        arg9.field315 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("bf.bf(I[B[IIIIIIIIIILbf;)I")
    public static int method962(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class49 arg12) {
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
        arg12.field323 += (var19 - arg4) * arg12.field318;
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
        arg12.field316 = var15 >> 2;
        arg12.field317 = var16 >> 2;
        arg12.field315 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("bf.bg([B[IIIIIIIILbf;)I")
    public static int method906(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class49 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field316 += (var14 - arg3) * arg9.field322;
        arg9.field317 += (var14 - arg3) * arg9.field325;
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
        arg9.field323 = var12 >> 2;
        arg9.field315 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("bf.bl(I[B[IIIIIIIIIILbf;)I")
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
        arg12.field323 += (var19 - arg4) * arg12.field318;
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
        arg12.field316 = var15 >> 2;
        arg12.field317 = var16 >> 2;
        arg12.field315 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("bf.be(II[B[IIIIIIIILbf;II)I")
    public static int method908(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class49 arg11, int arg12, int arg13) {
        arg11.field316 -= arg11.field322 * arg5;
        arg11.field317 -= arg11.field325 * arg5;
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
        arg11.field316 += arg11.field322 * arg5;
        arg11.field317 += arg11.field325 * arg5;
        arg11.field323 = arg6;
        arg11.field315 = arg4;
        return arg5;
    }

    @ObfuscatedName("bf.cq(II[B[IIIIIIIIIILbf;II)I")
    public static int method991(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class49 arg13, int arg14, int arg15) {
        arg13.field323 -= arg13.field318 * arg5;
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
        arg13.field323 += arg13.field318 * var27;
        arg13.field316 = arg6;
        arg13.field317 = arg7;
        arg13.field315 = arg4;
        return var27;
    }

    @ObfuscatedName("bf.cb(II[B[IIIIIIIILbf;II)I")
    public static int method910(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class49 arg11, int arg12, int arg13) {
        arg11.field316 -= arg11.field322 * arg5;
        arg11.field317 -= arg11.field325 * arg5;
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
        arg11.field316 += arg11.field322 * arg5;
        arg11.field317 += arg11.field325 * arg5;
        arg11.field323 = arg6;
        arg11.field315 = arg4;
        return arg5;
    }

    @ObfuscatedName("bf.cd(II[B[IIIIIIIIIILbf;II)I")
    public static int method911(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class49 arg13, int arg14, int arg15) {
        arg13.field323 -= arg13.field318 * arg5;
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
        arg13.field323 += arg13.field318 * var26;
        arg13.field316 = arg6;
        arg13.field317 = arg7;
        arg13.field315 = arg4;
        return var26;
    }
}
