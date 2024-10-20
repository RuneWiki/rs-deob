package deob;

@ObfuscatedName("at")
public class class45 extends class48 {

    @ObfuscatedName("at.a")
    public int field1035;

    @ObfuscatedName("at.r")
    public int field1036;

    @ObfuscatedName("at.u")
    public int field1034;

    @ObfuscatedName("at.t")
    public int field1041;

    @ObfuscatedName("at.k")
    public int field1038;

    @ObfuscatedName("at.x")
    public int field1039;

    @ObfuscatedName("at.v")
    public int field1040;

    @ObfuscatedName("at.g")
    public int field1043;

    @ObfuscatedName("at.n")
    public int field1048;

    @ObfuscatedName("at.q")
    public int field1042;

    @ObfuscatedName("at.i")
    public boolean field1044;

    @ObfuscatedName("at.p")
    public int field1045;

    @ObfuscatedName("at.e")
    public int field1046;

    @ObfuscatedName("at.o")
    public int field1047;

    @ObfuscatedName("at.j")
    public int field1037;

    @ObfuscatedName("at.a(II)I")
    public static int method926(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("at.r(II)I")
    public static int method886(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("at.u()I")
    public int method887() {
        int var1 = this.field1038 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field1043 == 0) {
            var2 -= this.field1035 * var2 / (((class63) this.field1055).field1219.length << 8);
        } else if (this.field1043 >= 0) {
            var2 -= this.field1048 * var2 / ((class63) this.field1055).field1219.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    public class45(class63 arg0, int arg1, int arg2) {
        this.field1055 = arg0;
        this.field1048 = arg0.field1220;
        this.field1042 = arg0.field1221;
        this.field1044 = arg0.field1218;
        this.field1036 = arg1;
        this.field1034 = arg2;
        this.field1041 = 8192;
        this.field1035 = 0;
        this.method891();
    }

    public class45(class63 arg0, int arg1, int arg2, int arg3) {
        this.field1055 = arg0;
        this.field1048 = arg0.field1220;
        this.field1042 = arg0.field1221;
        this.field1044 = arg0.field1218;
        this.field1036 = arg1;
        this.field1034 = arg2;
        this.field1041 = arg3;
        this.field1035 = 0;
        this.method891();
    }

    @ObfuscatedName("at.t(Lbq;II)Lat;")
    public static class45 method889(class63 arg0, int arg1, int arg2) {
        return arg0.field1219 == null || arg0.field1219.length == 0 ? null : new class45(arg0, (int) ((long) arg0.field1222 * 256L * (long) arg1 / (long) (Statics.field1080 * 100)), arg2 << 6);
    }

    @ObfuscatedName("at.k(Lbq;III)Lat;")
    public static class45 method890(class63 arg0, int arg1, int arg2, int arg3) {
        return arg0.field1219 == null || arg0.field1219.length == 0 ? null : new class45(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("at.x()V")
    public void method891() {
        this.field1038 = this.field1034;
        this.field1039 = method926(this.field1034, this.field1041);
        this.field1040 = method886(this.field1034, this.field1041);
    }

    @ObfuscatedName("at.v(I)V")
    public synchronized void method892(int arg0) {
        this.field1043 = arg0;
    }

    @ObfuscatedName("at.g(I)V")
    public synchronized void method893(int arg0) {
        this.method970(arg0 << 6, this.method948());
    }

    @ObfuscatedName("at.n(I)V")
    public synchronized void method894(int arg0) {
        this.method970(arg0, this.method948());
    }

    @ObfuscatedName("at.q(II)V")
    public synchronized void method970(int arg0, int arg1) {
        this.field1034 = arg0;
        this.field1041 = arg1;
        this.field1045 = 0;
        this.method891();
    }

    @ObfuscatedName("at.i()I")
    public synchronized int method902() {
        return this.field1034 == Integer.MIN_VALUE ? 0 : this.field1034;
    }

    @ObfuscatedName("at.p()I")
    public synchronized int method948() {
        return this.field1041 < 0 ? -1 : this.field1041;
    }

    @ObfuscatedName("at.e(I)V")
    public synchronized void method898(int arg0) {
        int var2 = ((class63) this.field1055).field1219.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field1035 = arg0;
    }

    @ObfuscatedName("at.o(Z)V")
    public synchronized void method980(boolean arg0) {
        this.field1036 = (this.field1036 >>> 31) + (this.field1036 ^ this.field1036 >> 31);
        if (arg0) {
            this.field1036 = -this.field1036;
        }
    }

    @ObfuscatedName("at.j()V")
    public void method900() {
        if (this.field1045 == 0) {
            return;
        }
        if (this.field1034 == Integer.MIN_VALUE) {
            this.field1034 = 0;
        }
        this.field1045 = 0;
        this.method891();
    }

    @ObfuscatedName("at.s(II)V")
    public synchronized void method996(int arg0, int arg1) {
        this.method989(arg0, arg1, this.method948());
    }

    @ObfuscatedName("at.b(III)V")
    public synchronized void method989(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method970(arg1, arg2);
            return;
        }
        int var4 = method926(arg1, arg2);
        int var5 = method886(arg1, arg2);
        if (this.field1039 == var4 && this.field1040 == var5) {
            this.field1045 = 0;
            return;
        }
        int var6 = arg1 - this.field1038;
        if (this.field1038 - arg1 > var6) {
            var6 = this.field1038 - arg1;
        }
        if (var4 - this.field1039 > var6) {
            var6 = var4 - this.field1039;
        }
        if (this.field1039 - var4 > var6) {
            var6 = this.field1039 - var4;
        }
        if (var5 - this.field1040 > var6) {
            var6 = var5 - this.field1040;
        }
        if (this.field1040 - var5 > var6) {
            var6 = this.field1040 - var5;
        }
        if (arg0 > var6) {
            arg0 = var6;
        }
        this.field1045 = arg0;
        this.field1034 = arg1;
        this.field1041 = arg2;
        this.field1046 = (arg1 - this.field1038) / arg0;
        this.field1047 = (var4 - this.field1039) / arg0;
        this.field1037 = (var5 - this.field1040) / arg0;
    }

    @ObfuscatedName("at.c(I)V")
    public synchronized void method903(int arg0) {
        if (arg0 == 0) {
            this.method894(0);
            this.method3311();
        } else if (this.field1039 == 0 && this.field1040 == 0) {
            this.field1045 = 0;
            this.field1034 = 0;
            this.field1038 = 0;
            this.method3311();
        } else {
            int var2 = -this.field1038;
            if (this.field1038 > var2) {
                var2 = this.field1038;
            }
            if (-this.field1039 > var2) {
                var2 = -this.field1039;
            }
            if (this.field1039 > var2) {
                var2 = this.field1039;
            }
            if (-this.field1040 > var2) {
                var2 = -this.field1040;
            }
            if (this.field1040 > var2) {
                var2 = this.field1040;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field1045 = arg0;
            this.field1034 = Integer.MIN_VALUE;
            this.field1046 = -this.field1038 / arg0;
            this.field1047 = -this.field1039 / arg0;
            this.field1037 = -this.field1040 / arg0;
        }
    }

    @ObfuscatedName("at.m(I)V")
    public synchronized void method927(int arg0) {
        if (this.field1036 < 0) {
            this.field1036 = -arg0;
        } else {
            this.field1036 = arg0;
        }
    }

    @ObfuscatedName("at.z()I")
    public synchronized int method1021() {
        return this.field1036 < 0 ? -this.field1036 : this.field1036;
    }

    @ObfuscatedName("at.h()Z")
    public boolean method901() {
        return this.field1035 < 0 || this.field1035 >= ((class63) this.field1055).field1219.length << 8;
    }

    @ObfuscatedName("at.f()Z")
    public boolean method907() {
        return this.field1045 != 0;
    }

    @ObfuscatedName("at.w()Lam;")
    public class48 method908() {
        return null;
    }

    @ObfuscatedName("at.l()Lam;")
    public class48 method1015() {
        return null;
    }

    @ObfuscatedName("at.d()I")
    public int method945() {
        return this.field1034 == 0 && this.field1045 == 0 ? 0 : 1;
    }

    @ObfuscatedName("at.y([III)V")
    public synchronized void method955(int[] arg0, int arg1, int arg2) {
        if (this.field1034 == 0 && this.field1045 == 0) {
            this.method912(arg2);
            return;
        }
        class63 var4 = (class63) this.field1055;
        int var5 = this.field1048 << 8;
        int var6 = this.field1042 << 8;
        int var7 = var4.field1219.length << 8;
        int var8 = var6 - var5;
        if (var8 <= 0) {
            this.field1043 = 0;
        }
        int var9 = arg1;
        int var10 = arg1 + arg2;
        if (this.field1035 < 0) {
            if (this.field1036 <= 0) {
                this.method900();
                this.method3311();
                return;
            }
            this.field1035 = 0;
        }
        if (this.field1035 >= var7) {
            if (this.field1036 >= 0) {
                this.method900();
                this.method3311();
                return;
            }
            this.field1035 = var7 - 1;
        }
        if (this.field1043 >= 0) {
            if (this.field1043 > 0) {
                if (this.field1044) {
                    label131: {
                        if (this.field1036 < 0) {
                            var9 = this.method913(arg0, arg1, var5, var10, var4.field1219[this.field1048]);
                            if (this.field1035 >= var5) {
                                return;
                            }
                            this.field1035 = var5 + var5 - 1 - this.field1035;
                            this.field1036 = -this.field1036;
                            if (--this.field1043 == 0) {
                                break label131;
                            }
                        }
                        do {
                            var9 = this.method924(arg0, var9, var6, var10, var4.field1219[this.field1042 - 1]);
                            if (this.field1035 < var6) {
                                return;
                            }
                            this.field1035 = var6 + var6 - 1 - this.field1035;
                            this.field1036 = -this.field1036;
                            if (--this.field1043 == 0) {
                                break;
                            }
                            var9 = this.method913(arg0, var9, var5, var10, var4.field1219[this.field1048]);
                            if (this.field1035 >= var5) {
                                return;
                            }
                            this.field1035 = var5 + var5 - 1 - this.field1035;
                            this.field1036 = -this.field1036;
                        } while (--this.field1043 != 0);
                    }
                } else if (this.field1036 < 0) {
                    while (true) {
                        var9 = this.method913(arg0, var9, var5, var10, var4.field1219[this.field1042 - 1]);
                        if (this.field1035 >= var5) {
                            return;
                        }
                        int var12 = (var6 - 1 - this.field1035) / var8;
                        if (var12 >= this.field1043) {
                            this.field1035 += this.field1043 * var8;
                            this.field1043 = 0;
                            break;
                        }
                        this.field1035 += var8 * var12;
                        this.field1043 -= var12;
                    }
                } else {
                    while (true) {
                        var9 = this.method924(arg0, var9, var6, var10, var4.field1219[this.field1048]);
                        if (this.field1035 < var6) {
                            return;
                        }
                        int var13 = (this.field1035 - var5) / var8;
                        if (var13 >= this.field1043) {
                            this.field1035 -= this.field1043 * var8;
                            this.field1043 = 0;
                            break;
                        }
                        this.field1035 -= var8 * var13;
                        this.field1043 -= var13;
                    }
                }
            }
            if (this.field1036 < 0) {
                this.method913(arg0, var9, 0, var10, 0);
                if (this.field1035 < 0) {
                    this.field1035 = -1;
                    this.method900();
                    this.method3311();
                }
            } else {
                this.method924(arg0, var9, var7, var10, 0);
                if (this.field1035 >= var7) {
                    this.field1035 = var7;
                    this.method900();
                    this.method3311();
                }
            }
        } else if (this.field1044) {
            if (this.field1036 < 0) {
                var9 = this.method913(arg0, arg1, var5, var10, var4.field1219[this.field1048]);
                if (this.field1035 >= var5) {
                    return;
                }
                this.field1035 = var5 + var5 - 1 - this.field1035;
                this.field1036 = -this.field1036;
            }
            while (true) {
                int var11 = this.method924(arg0, var9, var6, var10, var4.field1219[this.field1042 - 1]);
                if (this.field1035 < var6) {
                    return;
                }
                this.field1035 = var6 + var6 - 1 - this.field1035;
                this.field1036 = -this.field1036;
                var9 = this.method913(arg0, var11, var5, var10, var4.field1219[this.field1048]);
                if (this.field1035 >= var5) {
                    return;
                }
                this.field1035 = var5 + var5 - 1 - this.field1035;
                this.field1036 = -this.field1036;
            }
        } else if (this.field1036 < 0) {
            while (true) {
                var9 = this.method913(arg0, var9, var5, var10, var4.field1219[this.field1042 - 1]);
                if (this.field1035 >= var5) {
                    return;
                }
                this.field1035 = var6 - 1 - (var6 - 1 - this.field1035) % var8;
            }
        } else {
            while (true) {
                var9 = this.method924(arg0, var9, var6, var10, var4.field1219[this.field1048]);
                if (this.field1035 < var6) {
                    return;
                }
                this.field1035 = (this.field1035 - var5) % var8 + var5;
            }
        }
    }

    @ObfuscatedName("at.ah(I)V")
    public synchronized void method912(int arg0) {
        if (this.field1045 > 0) {
            if (arg0 >= this.field1045) {
                if (this.field1034 == Integer.MIN_VALUE) {
                    this.field1034 = 0;
                    this.field1040 = 0;
                    this.field1039 = 0;
                    this.field1038 = 0;
                    this.method3311();
                    arg0 = this.field1045;
                }
                this.field1045 = 0;
                this.method891();
            } else {
                this.field1038 += this.field1046 * arg0;
                this.field1039 += this.field1047 * arg0;
                this.field1040 += this.field1037 * arg0;
                this.field1045 -= arg0;
            }
        }
        class63 var2 = (class63) this.field1055;
        int var3 = this.field1048 << 8;
        int var4 = this.field1042 << 8;
        int var5 = var2.field1219.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field1043 = 0;
        }
        if (this.field1035 < 0) {
            if (this.field1036 <= 0) {
                this.method900();
                this.method3311();
                return;
            }
            this.field1035 = 0;
        }
        if (this.field1035 >= var5) {
            if (this.field1036 >= 0) {
                this.method900();
                this.method3311();
                return;
            }
            this.field1035 = var5 - 1;
        }
        this.field1035 += this.field1036 * arg0;
        if (this.field1043 >= 0) {
            if (this.field1043 > 0) {
                if (this.field1044) {
                    label121: {
                        if (this.field1036 < 0) {
                            if (this.field1035 >= var3) {
                                return;
                            }
                            this.field1035 = var3 + var3 - 1 - this.field1035;
                            this.field1036 = -this.field1036;
                            if (--this.field1043 == 0) {
                                break label121;
                            }
                        }
                        do {
                            if (this.field1035 < var4) {
                                return;
                            }
                            this.field1035 = var4 + var4 - 1 - this.field1035;
                            this.field1036 = -this.field1036;
                            if (--this.field1043 == 0) {
                                break;
                            }
                            if (this.field1035 >= var3) {
                                return;
                            }
                            this.field1035 = var3 + var3 - 1 - this.field1035;
                            this.field1036 = -this.field1036;
                        } while (--this.field1043 != 0);
                    }
                } else {
                    label153: {
                        if (this.field1036 < 0) {
                            if (this.field1035 >= var3) {
                                return;
                            }
                            int var7 = (var4 - 1 - this.field1035) / var6;
                            if (var7 >= this.field1043) {
                                this.field1035 += this.field1043 * var6;
                                this.field1043 = 0;
                                break label153;
                            }
                            this.field1035 += var6 * var7;
                            this.field1043 -= var7;
                        } else if (this.field1035 >= var4) {
                            int var8 = (this.field1035 - var3) / var6;
                            if (var8 >= this.field1043) {
                                this.field1035 -= this.field1043 * var6;
                                this.field1043 = 0;
                                break label153;
                            }
                            this.field1035 -= var6 * var8;
                            this.field1043 -= var8;
                        } else {
                            return;
                        }
                        return;
                    }
                }
            }
            if (this.field1036 < 0) {
                if (this.field1035 < 0) {
                    this.field1035 = -1;
                    this.method900();
                    this.method3311();
                }
            } else if (this.field1035 >= var5) {
                this.field1035 = var5;
                this.method900();
                this.method3311();
            }
        } else if (this.field1044) {
            if (this.field1036 < 0) {
                if (this.field1035 >= var3) {
                    return;
                }
                this.field1035 = var3 + var3 - 1 - this.field1035;
                this.field1036 = -this.field1036;
            }
            while (this.field1035 >= var4) {
                this.field1035 = var4 + var4 - 1 - this.field1035;
                this.field1036 = -this.field1036;
                if (this.field1035 >= var3) {
                    return;
                }
                this.field1035 = var3 + var3 - 1 - this.field1035;
                this.field1036 = -this.field1036;
            }
        } else if (this.field1036 < 0) {
            if (this.field1035 >= var3) {
                return;
            }
            this.field1035 = var4 - 1 - (var4 - 1 - this.field1035) % var6;
        } else if (this.field1035 >= var4) {
            this.field1035 = (this.field1035 - var3) % var6 + var3;
        } else {
            return;
        }
    }

    @ObfuscatedName("at.ad([IIIII)I")
    public int method924(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1045 > 0) {
                int var6 = this.field1045 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1045 += arg1;
                if (this.field1036 == 256 && (this.field1035 & 0xFF) == 0) {
                    if (Statics.field2456) {
                        arg1 = method1010(0, ((class63) this.field1055).field1219, arg0, this.field1035, arg1, this.field1039, this.field1040, this.field1047, this.field1037, 0, var6, arg2, this);
                    } else {
                        arg1 = method923(((class63) this.field1055).field1219, arg0, this.field1035, arg1, this.field1038, this.field1046, 0, var6, arg2, this);
                    }
                } else if (Statics.field2456) {
                    arg1 = method1005(0, 0, ((class63) this.field1055).field1219, arg0, this.field1035, arg1, this.field1039, this.field1040, this.field1047, this.field1037, 0, var6, arg2, this, this.field1036, arg4);
                } else {
                    arg1 = method899(0, 0, ((class63) this.field1055).field1219, arg0, this.field1035, arg1, this.field1038, this.field1046, 0, var6, arg2, this, this.field1036, arg4);
                }
                this.field1045 -= arg1;
                if (this.field1045 != 0) {
                    return arg1;
                }
                if (!this.method914()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1036 == 256 && (this.field1035 & 0xFF) == 0) {
                if (Statics.field2456) {
                    return method916(0, ((class63) this.field1055).field1219, arg0, this.field1035, arg1, this.field1039, this.field1040, 0, arg3, arg2, this);
                }
                return method915(((class63) this.field1055).field1219, arg0, this.field1035, arg1, this.field1038, 0, arg3, arg2, this);
            }
            if (Statics.field2456) {
                return method920(0, 0, ((class63) this.field1055).field1219, arg0, this.field1035, arg1, this.field1039, this.field1040, 0, arg3, arg2, this, this.field1036, arg4);
            }
            return method919(0, 0, ((class63) this.field1055).field1219, arg0, this.field1035, arg1, this.field1038, 0, arg3, arg2, this, this.field1036, arg4);
        }
    }

    @ObfuscatedName("at.au([IIIII)I")
    public int method913(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1045 > 0) {
                int var6 = this.field1045 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1045 += arg1;
                if (this.field1036 == -256 && (this.field1035 & 0xFF) == 0) {
                    if (Statics.field2456) {
                        arg1 = method1025(0, ((class63) this.field1055).field1219, arg0, this.field1035, arg1, this.field1039, this.field1040, this.field1047, this.field1037, 0, var6, arg2, this);
                    } else {
                        arg1 = method925(((class63) this.field1055).field1219, arg0, this.field1035, arg1, this.field1038, this.field1046, 0, var6, arg2, this);
                    }
                } else if (Statics.field2456) {
                    arg1 = method930(0, 0, ((class63) this.field1055).field1219, arg0, this.field1035, arg1, this.field1039, this.field1040, this.field1047, this.field1037, 0, var6, arg2, this, this.field1036, arg4);
                } else {
                    arg1 = method910(0, 0, ((class63) this.field1055).field1219, arg0, this.field1035, arg1, this.field1038, this.field1046, 0, var6, arg2, this, this.field1036, arg4);
                }
                this.field1045 -= arg1;
                if (this.field1045 != 0) {
                    return arg1;
                }
                if (!this.method914()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1036 == -256 && (this.field1035 & 0xFF) == 0) {
                if (Statics.field2456) {
                    return method918(0, ((class63) this.field1055).field1219, arg0, this.field1035, arg1, this.field1039, this.field1040, 0, arg3, arg2, this);
                }
                return method917(((class63) this.field1055).field1219, arg0, this.field1035, arg1, this.field1038, 0, arg3, arg2, this);
            }
            if (Statics.field2456) {
                return method922(0, 0, ((class63) this.field1055).field1219, arg0, this.field1035, arg1, this.field1039, this.field1040, 0, arg3, arg2, this, this.field1036, arg4);
            }
            return method950(0, 0, ((class63) this.field1055).field1219, arg0, this.field1035, arg1, this.field1038, 0, arg3, arg2, this, this.field1036, arg4);
        }
    }

    @ObfuscatedName("at.as()Z")
    public boolean method914() {
        int var1 = this.field1034;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method926(var1, this.field1041);
            var2 = method886(var1, this.field1041);
        }
        if (this.field1038 != var1 || this.field1039 != var3 || this.field1040 != var2) {
            if (this.field1038 < var1) {
                this.field1046 = 1;
                this.field1045 = var1 - this.field1038;
            } else if (this.field1038 > var1) {
                this.field1046 = -1;
                this.field1045 = this.field1038 - var1;
            } else {
                this.field1046 = 0;
            }
            if (this.field1039 < var3) {
                this.field1047 = 1;
                if (this.field1045 == 0 || this.field1045 > var3 - this.field1039) {
                    this.field1045 = var3 - this.field1039;
                }
            } else if (this.field1039 > var3) {
                this.field1047 = -1;
                if (this.field1045 == 0 || this.field1045 > this.field1039 - var3) {
                    this.field1045 = this.field1039 - var3;
                }
            } else {
                this.field1047 = 0;
            }
            if (this.field1040 < var2) {
                this.field1037 = 1;
                if (this.field1045 == 0 || this.field1045 > var2 - this.field1040) {
                    this.field1045 = var2 - this.field1040;
                }
            } else if (this.field1040 > var2) {
                this.field1037 = -1;
                if (this.field1045 == 0 || this.field1045 > this.field1040 - var2) {
                    this.field1045 = this.field1040 - var2;
                }
            } else {
                this.field1037 = 0;
            }
            return false;
        } else if (this.field1034 == Integer.MIN_VALUE) {
            this.field1034 = 0;
            this.field1040 = 0;
            this.field1039 = 0;
            this.field1038 = 0;
            this.method3311();
            return true;
        } else {
            this.method891();
            return false;
        }
    }

    @ObfuscatedName("at.ag([B[IIIIIIILat;)I")
    public static int method915(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class45 arg8) {
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
        arg8.field1035 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("at.ab(I[B[IIIIIIIILat;)I")
    public static int method916(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class45 arg10) {
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
        arg10.field1035 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("at.aq([B[IIIIIIILat;)I")
    public static int method917(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class45 arg8) {
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
        arg8.field1035 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("at.af(I[B[IIIIIIIILat;)I")
    public static int method918(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class45 arg10) {
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
        arg10.field1035 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("at.ay(II[B[IIIIIIILat;II)I")
    public static int method919(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class45 arg10, int arg11, int arg12) {
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
        arg10.field1035 = arg4;
        return arg5;
    }

    @ObfuscatedName("at.ax(II[B[IIIIIIIILat;II)I")
    public static int method920(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class45 arg11, int arg12, int arg13) {
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
        arg11.field1035 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("at.aa(II[B[IIIIIIILat;II)I")
    public static int method950(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class45 arg10, int arg11, int arg12) {
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
        arg10.field1035 = arg4;
        return arg5;
    }

    @ObfuscatedName("at.ak(II[B[IIIIIIIILat;II)I")
    public static int method922(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class45 arg11, int arg12, int arg13) {
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
        arg11.field1035 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("at.ac([B[IIIIIIIILat;)I")
    public static int method923(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class45 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field1039 += (var14 - arg3) * arg9.field1047;
        arg9.field1040 += (var14 - arg3) * arg9.field1037;
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
        arg9.field1038 = var12 >> 2;
        arg9.field1035 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("at.aj(I[B[IIIIIIIIIILat;)I")
    public static int method1010(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class45 arg12) {
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
        arg12.field1038 += (var19 - arg4) * arg12.field1046;
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
        arg12.field1039 = var15 >> 2;
        arg12.field1040 = var16 >> 2;
        arg12.field1035 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("at.av([B[IIIIIIIILat;)I")
    public static int method925(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class45 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field1039 += (var14 - arg3) * arg9.field1047;
        arg9.field1040 += (var14 - arg3) * arg9.field1037;
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
        arg9.field1038 = var12 >> 2;
        arg9.field1035 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("at.al(I[B[IIIIIIIIIILat;)I")
    public static int method1025(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class45 arg12) {
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
        arg12.field1038 += (var19 - arg4) * arg12.field1046;
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
        arg12.field1039 = var15 >> 2;
        arg12.field1040 = var16 >> 2;
        arg12.field1035 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("at.an(II[B[IIIIIIIILat;II)I")
    public static int method899(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class45 arg11, int arg12, int arg13) {
        arg11.field1039 -= arg11.field1047 * arg5;
        arg11.field1040 -= arg11.field1037 * arg5;
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
        arg11.field1039 += arg11.field1047 * arg5;
        arg11.field1040 += arg11.field1037 * arg5;
        arg11.field1038 = arg6;
        arg11.field1035 = arg4;
        return arg5;
    }

    @ObfuscatedName("at.ap(II[B[IIIIIIIIIILat;II)I")
    public static int method1005(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class45 arg13, int arg14, int arg15) {
        arg13.field1038 -= arg13.field1046 * arg5;
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
        arg13.field1038 += arg13.field1046 * var27;
        arg13.field1039 = arg6;
        arg13.field1040 = arg7;
        arg13.field1035 = arg4;
        return var27;
    }

    @ObfuscatedName("at.at(II[B[IIIIIIIILat;II)I")
    public static int method910(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class45 arg11, int arg12, int arg13) {
        arg11.field1039 -= arg11.field1047 * arg5;
        arg11.field1040 -= arg11.field1037 * arg5;
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
        arg11.field1039 += arg11.field1047 * arg5;
        arg11.field1040 += arg11.field1037 * arg5;
        arg11.field1038 = arg6;
        arg11.field1035 = arg4;
        return arg5;
    }

    @ObfuscatedName("at.ae(II[B[IIIIIIIIIILat;II)I")
    public static int method930(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class45 arg13, int arg14, int arg15) {
        arg13.field1038 -= arg13.field1046 * arg5;
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
        arg13.field1038 += arg13.field1046 * var26;
        arg13.field1039 = arg6;
        arg13.field1040 = arg7;
        arg13.field1035 = arg4;
        return var26;
    }
}
