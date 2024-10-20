package deob;

@ObfuscatedName("bb")
public class class49 extends class50 {

    @ObfuscatedName("bb.at")
    public int field328;

    @ObfuscatedName("bb.ah")
    public int field323;

    @ObfuscatedName("bb.ar")
    public int field324;

    @ObfuscatedName("bb.ao")
    public int field325;

    @ObfuscatedName("bb.ab")
    public int field326;

    @ObfuscatedName("bb.au")
    public int field327;

    @ObfuscatedName("bb.aa")
    public int field322;

    @ObfuscatedName("bb.ac")
    public int field329;

    @ObfuscatedName("bb.al")
    public int field335;

    @ObfuscatedName("bb.az")
    public int field331;

    @ObfuscatedName("bb.ap")
    public boolean field332;

    @ObfuscatedName("bb.av")
    public int field333;

    @ObfuscatedName("bb.ax")
    public int field330;

    @ObfuscatedName("bb.as")
    public int field334;

    @ObfuscatedName("bb.ay")
    public int field336;

    @ObfuscatedName("bb.at(II)I")
    public static int method969(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("bb.ah(II)I")
    public static int method914(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("bb.bx()I")
    public int method989() {
        int var1 = this.field326 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field329 == 0) {
            var2 -= this.field328 * var2 / (((class41) this.field339).field252.length << 8);
        } else if (this.field329 >= 0) {
            var2 -= this.field335 * var2 / ((class41) this.field339).field252.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    public class49(class41 arg0, int arg1, int arg2) {
        this.field339 = arg0;
        this.field335 = arg0.field253;
        this.field331 = arg0.field254;
        this.field332 = arg0.field251;
        this.field323 = arg1;
        this.field324 = arg2;
        this.field325 = 8192;
        this.field328 = 0;
        this.method872();
    }

    public class49(class41 arg0, int arg1, int arg2, int arg3) {
        this.field339 = arg0;
        this.field335 = arg0.field253;
        this.field331 = arg0.field254;
        this.field332 = arg0.field251;
        this.field323 = arg1;
        this.field324 = arg2;
        this.field325 = arg3;
        this.field328 = 0;
        this.method872();
    }

    @ObfuscatedName("bb.ar(Lbt;II)Lbb;")
    public static class49 method907(class41 arg0, int arg1, int arg2) {
        return arg0.field252 == null || arg0.field252.length == 0 ? null : new class49(arg0, (int) ((long) arg0.field255 * 256L * (long) arg1 / (long) (Statics.field276 * 100)), arg2 << 6);
    }

    @ObfuscatedName("bb.ao(Lbt;III)Lbb;")
    public static class49 method871(class41 arg0, int arg1, int arg2, int arg3) {
        return arg0.field252 == null || arg0.field252.length == 0 ? null : new class49(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("bb.ab()V")
    public void method872() {
        this.field326 = this.field324;
        this.field327 = method969(this.field324, this.field325);
        this.field322 = method914(this.field324, this.field325);
    }

    @ObfuscatedName("bb.az(I)V")
    public synchronized void method925(int arg0) {
        this.field329 = arg0;
    }

    @ObfuscatedName("bb.av(I)V")
    public synchronized void method951(int arg0) {
        this.method875(arg0 << 6, this.method940());
    }

    @ObfuscatedName("bb.ax(I)V")
    public synchronized void method961(int arg0) {
        this.method875(arg0, this.method940());
    }

    @ObfuscatedName("bb.as(II)V")
    public synchronized void method875(int arg0, int arg1) {
        this.field324 = arg0;
        this.field325 = arg1;
        this.field333 = 0;
        this.method872();
    }

    @ObfuscatedName("bb.ay()I")
    public synchronized int method946() {
        return this.field324 == Integer.MIN_VALUE ? 0 : this.field324;
    }

    @ObfuscatedName("bb.ak()I")
    public synchronized int method940() {
        return this.field325 < 0 ? -1 : this.field325;
    }

    @ObfuscatedName("bb.aj(I)V")
    public synchronized void method878(int arg0) {
        int var2 = ((class41) this.field339).field252.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field328 = arg0;
    }

    @ObfuscatedName("bb.am(Z)V")
    public synchronized void method870(boolean arg0) {
        this.field323 = (this.field323 >>> 31) + (this.field323 ^ this.field323 >> 31);
        if (arg0) {
            this.field323 = -this.field323;
        }
    }

    @ObfuscatedName("bb.aq()V")
    public void method880() {
        if (this.field333 == 0) {
            return;
        }
        if (this.field324 == Integer.MIN_VALUE) {
            this.field324 = 0;
        }
        this.field333 = 0;
        this.method872();
    }

    @ObfuscatedName("bb.ai(II)V")
    public synchronized void method881(int arg0, int arg1) {
        this.method882(arg0, arg1, this.method940());
    }

    @ObfuscatedName("bb.aw(III)V")
    public synchronized void method882(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method875(arg1, arg2);
            return;
        }
        int var4 = method969(arg1, arg2);
        int var5 = method914(arg1, arg2);
        if (this.field327 == var4 && this.field322 == var5) {
            this.field333 = 0;
            return;
        }
        int var6 = arg1 - this.field326;
        if (this.field326 - arg1 > var6) {
            var6 = this.field326 - arg1;
        }
        if (var4 - this.field327 > var6) {
            var6 = var4 - this.field327;
        }
        if (this.field327 - var4 > var6) {
            var6 = this.field327 - var4;
        }
        if (var5 - this.field322 > var6) {
            var6 = var5 - this.field322;
        }
        if (this.field322 - var5 > var6) {
            var6 = this.field322 - var5;
        }
        if (arg0 > var6) {
            arg0 = var6;
        }
        this.field333 = arg0;
        this.field324 = arg1;
        this.field325 = arg2;
        this.field330 = (arg1 - this.field326) / arg0;
        this.field334 = (var4 - this.field327) / arg0;
        this.field336 = (var5 - this.field322) / arg0;
    }

    @ObfuscatedName("bb.ae(I)V")
    public synchronized void method883(int arg0) {
        if (arg0 == 0) {
            this.method961(0);
            this.method7828();
        } else if (this.field327 == 0 && this.field322 == 0) {
            this.field333 = 0;
            this.field324 = 0;
            this.field326 = 0;
            this.method7828();
        } else {
            int var2 = -this.field326;
            if (this.field326 > var2) {
                var2 = this.field326;
            }
            if (-this.field327 > var2) {
                var2 = -this.field327;
            }
            if (this.field327 > var2) {
                var2 = this.field327;
            }
            if (-this.field322 > var2) {
                var2 = -this.field322;
            }
            if (this.field322 > var2) {
                var2 = this.field322;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field333 = arg0;
            this.field324 = Integer.MIN_VALUE;
            this.field330 = -this.field326 / arg0;
            this.field334 = -this.field327 / arg0;
            this.field336 = -this.field322 / arg0;
        }
    }

    @ObfuscatedName("bb.an(I)V")
    public synchronized void method879(int arg0) {
        if (this.field323 < 0) {
            this.field323 = -arg0;
        } else {
            this.field323 = arg0;
        }
    }

    @ObfuscatedName("bb.ag()I")
    public synchronized int method885() {
        return this.field323 < 0 ? -this.field323 : this.field323;
    }

    @ObfuscatedName("bb.ad()Z")
    public boolean method959() {
        return this.field328 < 0 || this.field328 >= ((class41) this.field339).field252.length << 8;
    }

    @ObfuscatedName("bb.af()Z")
    public boolean method887() {
        return this.field333 != 0;
    }

    @ObfuscatedName("bb.au()Lbk;")
    public class50 method714() {
        return null;
    }

    @ObfuscatedName("bb.aa()Lbk;")
    public class50 method713() {
        return null;
    }

    @ObfuscatedName("bb.ac()I")
    public int method750() {
        return this.field324 == 0 && this.field333 == 0 ? 0 : 1;
    }

    @ObfuscatedName("bb.al([III)V")
    public synchronized void method706(int[] arg0, int arg1, int arg2) {
        if (this.field324 == 0 && this.field333 == 0) {
            this.method729(arg2);
            return;
        }
        class41 var4 = (class41) this.field339;
        int var5 = this.field335 << 8;
        int var6 = this.field331 << 8;
        int var7 = var4.field252.length << 8;
        int var8 = var6 - var5;
        if (var8 <= 0) {
            this.field329 = 0;
        }
        int var9 = arg1;
        int var10 = arg1 + arg2;
        if (this.field328 < 0) {
            if (this.field323 <= 0) {
                this.method880();
                this.method7828();
                return;
            }
            this.field328 = 0;
        }
        if (this.field328 >= var7) {
            if (this.field323 >= 0) {
                this.method880();
                this.method7828();
                return;
            }
            this.field328 = var7 - 1;
        }
        if (this.field329 >= 0) {
            if (this.field329 > 0) {
                if (this.field332) {
                    label131: {
                        if (this.field323 < 0) {
                            var9 = this.method891(arg0, arg1, var5, var10, var4.field252[this.field335]);
                            if (this.field328 >= var5) {
                                return;
                            }
                            this.field328 = var5 + var5 - 1 - this.field328;
                            this.field323 = -this.field323;
                            if (--this.field329 == 0) {
                                break label131;
                            }
                        }
                        do {
                            var9 = this.method890(arg0, var9, var6, var10, var4.field252[this.field331 - 1]);
                            if (this.field328 < var6) {
                                return;
                            }
                            this.field328 = var6 + var6 - 1 - this.field328;
                            this.field323 = -this.field323;
                            if (--this.field329 == 0) {
                                break;
                            }
                            var9 = this.method891(arg0, var9, var5, var10, var4.field252[this.field335]);
                            if (this.field328 >= var5) {
                                return;
                            }
                            this.field328 = var5 + var5 - 1 - this.field328;
                            this.field323 = -this.field323;
                        } while (--this.field329 != 0);
                    }
                } else if (this.field323 < 0) {
                    while (true) {
                        var9 = this.method891(arg0, var9, var5, var10, var4.field252[this.field331 - 1]);
                        if (this.field328 >= var5) {
                            return;
                        }
                        int var12 = (var6 - 1 - this.field328) / var8;
                        if (var12 >= this.field329) {
                            this.field328 += this.field329 * var8;
                            this.field329 = 0;
                            break;
                        }
                        this.field328 += var8 * var12;
                        this.field329 -= var12;
                    }
                } else {
                    while (true) {
                        var9 = this.method890(arg0, var9, var6, var10, var4.field252[this.field335]);
                        if (this.field328 < var6) {
                            return;
                        }
                        int var13 = (this.field328 - var5) / var8;
                        if (var13 >= this.field329) {
                            this.field328 -= this.field329 * var8;
                            this.field329 = 0;
                            break;
                        }
                        this.field328 -= var8 * var13;
                        this.field329 -= var13;
                    }
                }
            }
            if (this.field323 < 0) {
                this.method891(arg0, var9, 0, var10, 0);
                if (this.field328 < 0) {
                    this.field328 = -1;
                    this.method880();
                    this.method7828();
                }
            } else {
                this.method890(arg0, var9, var7, var10, 0);
                if (this.field328 >= var7) {
                    this.field328 = var7;
                    this.method880();
                    this.method7828();
                }
            }
        } else if (this.field332) {
            if (this.field323 < 0) {
                var9 = this.method891(arg0, arg1, var5, var10, var4.field252[this.field335]);
                if (this.field328 >= var5) {
                    return;
                }
                this.field328 = var5 + var5 - 1 - this.field328;
                this.field323 = -this.field323;
            }
            while (true) {
                int var11 = this.method890(arg0, var9, var6, var10, var4.field252[this.field331 - 1]);
                if (this.field328 < var6) {
                    return;
                }
                this.field328 = var6 + var6 - 1 - this.field328;
                this.field323 = -this.field323;
                var9 = this.method891(arg0, var11, var5, var10, var4.field252[this.field335]);
                if (this.field328 >= var5) {
                    return;
                }
                this.field328 = var5 + var5 - 1 - this.field328;
                this.field323 = -this.field323;
            }
        } else if (this.field323 < 0) {
            while (true) {
                var9 = this.method891(arg0, var9, var5, var10, var4.field252[this.field331 - 1]);
                if (this.field328 >= var5) {
                    return;
                }
                this.field328 = var6 - 1 - (var6 - 1 - this.field328) % var8;
            }
        } else {
            while (true) {
                var9 = this.method890(arg0, var9, var6, var10, var4.field252[this.field335]);
                if (this.field328 < var6) {
                    return;
                }
                this.field328 = (this.field328 - var5) % var8 + var5;
            }
        }
    }

    @ObfuscatedName("bb.ap(I)V")
    public synchronized void method729(int arg0) {
        if (this.field333 > 0) {
            if (arg0 >= this.field333) {
                if (this.field324 == Integer.MIN_VALUE) {
                    this.field324 = 0;
                    this.field322 = 0;
                    this.field327 = 0;
                    this.field326 = 0;
                    this.method7828();
                    arg0 = this.field333;
                }
                this.field333 = 0;
                this.method872();
            } else {
                this.field326 += this.field330 * arg0;
                this.field327 += this.field334 * arg0;
                this.field322 += this.field336 * arg0;
                this.field333 -= arg0;
            }
        }
        class41 var2 = (class41) this.field339;
        int var3 = this.field335 << 8;
        int var4 = this.field331 << 8;
        int var5 = var2.field252.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field329 = 0;
        }
        if (this.field328 < 0) {
            if (this.field323 <= 0) {
                this.method880();
                this.method7828();
                return;
            }
            this.field328 = 0;
        }
        if (this.field328 >= var5) {
            if (this.field323 >= 0) {
                this.method880();
                this.method7828();
                return;
            }
            this.field328 = var5 - 1;
        }
        this.field328 += this.field323 * arg0;
        if (this.field329 >= 0) {
            if (this.field329 > 0) {
                if (this.field332) {
                    label121: {
                        if (this.field323 < 0) {
                            if (this.field328 >= var3) {
                                return;
                            }
                            this.field328 = var3 + var3 - 1 - this.field328;
                            this.field323 = -this.field323;
                            if (--this.field329 == 0) {
                                break label121;
                            }
                        }
                        do {
                            if (this.field328 < var4) {
                                return;
                            }
                            this.field328 = var4 + var4 - 1 - this.field328;
                            this.field323 = -this.field323;
                            if (--this.field329 == 0) {
                                break;
                            }
                            if (this.field328 >= var3) {
                                return;
                            }
                            this.field328 = var3 + var3 - 1 - this.field328;
                            this.field323 = -this.field323;
                        } while (--this.field329 != 0);
                    }
                } else {
                    label153: {
                        if (this.field323 < 0) {
                            if (this.field328 >= var3) {
                                return;
                            }
                            int var7 = (var4 - 1 - this.field328) / var6;
                            if (var7 >= this.field329) {
                                this.field328 += this.field329 * var6;
                                this.field329 = 0;
                                break label153;
                            }
                            this.field328 += var6 * var7;
                            this.field329 -= var7;
                        } else if (this.field328 >= var4) {
                            int var8 = (this.field328 - var3) / var6;
                            if (var8 >= this.field329) {
                                this.field328 -= this.field329 * var6;
                                this.field329 = 0;
                                break label153;
                            }
                            this.field328 -= var6 * var8;
                            this.field329 -= var8;
                        } else {
                            return;
                        }
                        return;
                    }
                }
            }
            if (this.field323 < 0) {
                if (this.field328 < 0) {
                    this.field328 = -1;
                    this.method880();
                    this.method7828();
                }
            } else if (this.field328 >= var5) {
                this.field328 = var5;
                this.method880();
                this.method7828();
            }
        } else if (this.field332) {
            if (this.field323 < 0) {
                if (this.field328 >= var3) {
                    return;
                }
                this.field328 = var3 + var3 - 1 - this.field328;
                this.field323 = -this.field323;
            }
            while (this.field328 >= var4) {
                this.field328 = var4 + var4 - 1 - this.field328;
                this.field323 = -this.field323;
                if (this.field328 >= var3) {
                    return;
                }
                this.field328 = var3 + var3 - 1 - this.field328;
                this.field323 = -this.field323;
            }
        } else if (this.field323 < 0) {
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

    @ObfuscatedName("bb.bn([IIIII)I")
    public int method890(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field333 > 0) {
                int var6 = this.field333 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field333 += arg1;
                if (this.field323 == 256 && (this.field328 & 0xFF) == 0) {
                    if (Statics.field2581) {
                        arg1 = method901(0, ((class41) this.field339).field252, arg0, this.field328, arg1, this.field327, this.field322, this.field334, this.field336, 0, var6, arg2, this);
                    } else {
                        arg1 = method905(((class41) this.field339).field252, arg0, this.field328, arg1, this.field326, this.field330, 0, var6, arg2, this);
                    }
                } else if (Statics.field2581) {
                    arg1 = method904(0, 0, ((class41) this.field339).field252, arg0, this.field328, arg1, this.field327, this.field322, this.field334, this.field336, 0, var6, arg2, this, this.field323, arg4);
                } else {
                    arg1 = method942(0, 0, ((class41) this.field339).field252, arg0, this.field328, arg1, this.field326, this.field330, 0, var6, arg2, this, this.field323, arg4);
                }
                this.field333 -= arg1;
                if (this.field333 != 0) {
                    return arg1;
                }
                if (!this.method892()) {
                    continue;
                }
                return arg3;
            }
            if (this.field323 == 256 && (this.field328 & 0xFF) == 0) {
                if (Statics.field2581) {
                    return method894(0, ((class41) this.field339).field252, arg0, this.field328, arg1, this.field327, this.field322, 0, arg3, arg2, this);
                }
                return method893(((class41) this.field339).field252, arg0, this.field328, arg1, this.field326, 0, arg3, arg2, this);
            }
            if (Statics.field2581) {
                return method898(0, 0, ((class41) this.field339).field252, arg0, this.field328, arg1, this.field327, this.field322, 0, arg3, arg2, this, this.field323, arg4);
            }
            return method884(0, 0, ((class41) this.field339).field252, arg0, this.field328, arg1, this.field326, 0, arg3, arg2, this, this.field323, arg4);
        }
    }

    @ObfuscatedName("bb.bo([IIIII)I")
    public int method891(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field333 > 0) {
                int var6 = this.field333 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field333 += arg1;
                if (this.field323 == -256 && (this.field328 & 0xFF) == 0) {
                    if (Statics.field2581) {
                        arg1 = method965(0, ((class41) this.field339).field252, arg0, this.field328, arg1, this.field327, this.field322, this.field334, this.field336, 0, var6, arg2, this);
                    } else {
                        arg1 = method902(((class41) this.field339).field252, arg0, this.field328, arg1, this.field326, this.field330, 0, var6, arg2, this);
                    }
                } else if (Statics.field2581) {
                    arg1 = method906(0, 0, ((class41) this.field339).field252, arg0, this.field328, arg1, this.field327, this.field322, this.field334, this.field336, 0, var6, arg2, this, this.field323, arg4);
                } else {
                    arg1 = method911(0, 0, ((class41) this.field339).field252, arg0, this.field328, arg1, this.field326, this.field330, 0, var6, arg2, this, this.field323, arg4);
                }
                this.field333 -= arg1;
                if (this.field333 != 0) {
                    return arg1;
                }
                if (!this.method892()) {
                    continue;
                }
                return arg3;
            }
            if (this.field323 == -256 && (this.field328 & 0xFF) == 0) {
                if (Statics.field2581) {
                    return method908(0, ((class41) this.field339).field252, arg0, this.field328, arg1, this.field327, this.field322, 0, arg3, arg2, this);
                }
                return method895(((class41) this.field339).field252, arg0, this.field328, arg1, this.field326, 0, arg3, arg2, this);
            }
            if (Statics.field2581) {
                return method937(0, 0, ((class41) this.field339).field252, arg0, this.field328, arg1, this.field327, this.field322, 0, arg3, arg2, this, this.field323, arg4);
            }
            return method899(0, 0, ((class41) this.field339).field252, arg0, this.field328, arg1, this.field326, 0, arg3, arg2, this, this.field323, arg4);
        }
    }

    @ObfuscatedName("bb.bz()Z")
    public boolean method892() {
        int var1 = this.field324;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method969(var1, this.field325);
            var2 = method914(var1, this.field325);
        }
        if (this.field326 != var1 || this.field327 != var3 || this.field322 != var2) {
            if (this.field326 < var1) {
                this.field330 = 1;
                this.field333 = var1 - this.field326;
            } else if (this.field326 > var1) {
                this.field330 = -1;
                this.field333 = this.field326 - var1;
            } else {
                this.field330 = 0;
            }
            if (this.field327 < var3) {
                this.field334 = 1;
                if (this.field333 == 0 || this.field333 > var3 - this.field327) {
                    this.field333 = var3 - this.field327;
                }
            } else if (this.field327 > var3) {
                this.field334 = -1;
                if (this.field333 == 0 || this.field333 > this.field327 - var3) {
                    this.field333 = this.field327 - var3;
                }
            } else {
                this.field334 = 0;
            }
            if (this.field322 < var2) {
                this.field336 = 1;
                if (this.field333 == 0 || this.field333 > var2 - this.field322) {
                    this.field333 = var2 - this.field322;
                }
            } else if (this.field322 > var2) {
                this.field336 = -1;
                if (this.field333 == 0 || this.field333 > this.field322 - var2) {
                    this.field333 = this.field322 - var2;
                }
            } else {
                this.field336 = 0;
            }
            return false;
        } else if (this.field324 == Integer.MIN_VALUE) {
            this.field324 = 0;
            this.field322 = 0;
            this.field327 = 0;
            this.field326 = 0;
            this.method7828();
            return true;
        } else {
            this.method872();
            return false;
        }
    }

    @ObfuscatedName("bb.bc([B[IIIIIIILbb;)I")
    public static int method893(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class49 arg8) {
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

    @ObfuscatedName("bb.bs(I[B[IIIIIIIILbb;)I")
    public static int method894(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class49 arg10) {
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

    @ObfuscatedName("bb.bb([B[IIIIIIILbb;)I")
    public static int method895(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class49 arg8) {
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

    @ObfuscatedName("bb.bk(I[B[IIIIIIIILbb;)I")
    public static int method908(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class49 arg10) {
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

    @ObfuscatedName("bb.br(II[B[IIIIIIILbb;II)I")
    public static int method884(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class49 arg10, int arg11, int arg12) {
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

    @ObfuscatedName("bb.bq(II[B[IIIIIIIILbb;II)I")
    public static int method898(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class49 arg11, int arg12, int arg13) {
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

    @ObfuscatedName("bb.cf(II[B[IIIIIIILbb;II)I")
    public static int method899(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class49 arg10, int arg11, int arg12) {
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

    @ObfuscatedName("bb.cg(II[B[IIIIIIIILbb;II)I")
    public static int method937(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class49 arg11, int arg12, int arg13) {
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

    @ObfuscatedName("bb.cv([B[IIIIIIIILbb;)I")
    public static int method905(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class49 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field327 += (var14 - arg3) * arg9.field334;
        arg9.field322 += (var14 - arg3) * arg9.field336;
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
        arg9.field326 = var12 >> 2;
        arg9.field328 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("bb.cx(I[B[IIIIIIIIIILbb;)I")
    public static int method901(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class49 arg12) {
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
        arg12.field326 += (var19 - arg4) * arg12.field330;
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
        arg12.field327 = var15 >> 2;
        arg12.field322 = var16 >> 2;
        arg12.field328 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("bb.cp([B[IIIIIIIILbb;)I")
    public static int method902(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class49 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field327 += (var14 - arg3) * arg9.field334;
        arg9.field322 += (var14 - arg3) * arg9.field336;
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
        arg9.field326 = var12 >> 2;
        arg9.field328 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("bb.ce(I[B[IIIIIIIIIILbb;)I")
    public static int method965(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class49 arg12) {
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
        arg12.field326 += (var19 - arg4) * arg12.field330;
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
        arg12.field327 = var15 >> 2;
        arg12.field322 = var16 >> 2;
        arg12.field328 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("bb.ci(II[B[IIIIIIIILbb;II)I")
    public static int method942(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class49 arg11, int arg12, int arg13) {
        arg11.field327 -= arg11.field334 * arg5;
        arg11.field322 -= arg11.field336 * arg5;
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
        arg11.field327 += arg11.field334 * arg5;
        arg11.field322 += arg11.field336 * arg5;
        arg11.field326 = arg6;
        arg11.field328 = arg4;
        return arg5;
    }

    @ObfuscatedName("bb.ct(II[B[IIIIIIIIIILbb;II)I")
    public static int method904(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class49 arg13, int arg14, int arg15) {
        arg13.field326 -= arg13.field330 * arg5;
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
        arg13.field326 += arg13.field330 * var27;
        arg13.field327 = arg6;
        arg13.field322 = arg7;
        arg13.field328 = arg4;
        return var27;
    }

    @ObfuscatedName("bb.cw(II[B[IIIIIIIILbb;II)I")
    public static int method911(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class49 arg11, int arg12, int arg13) {
        arg11.field327 -= arg11.field334 * arg5;
        arg11.field322 -= arg11.field336 * arg5;
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
        arg11.field327 += arg11.field334 * arg5;
        arg11.field322 += arg11.field336 * arg5;
        arg11.field326 = arg6;
        arg11.field328 = arg4;
        return arg5;
    }

    @ObfuscatedName("bb.cq(II[B[IIIIIIIIIILbb;II)I")
    public static int method906(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class49 arg13, int arg14, int arg15) {
        arg13.field326 -= arg13.field330 * arg5;
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
        arg13.field326 += arg13.field330 * var26;
        arg13.field327 = arg6;
        arg13.field322 = arg7;
        arg13.field328 = arg4;
        return var26;
    }
}
