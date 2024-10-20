package deob;

@ObfuscatedName("ai")
public class class44 extends class47 {

    @ObfuscatedName("ai.c")
    public int field1034;

    @ObfuscatedName("ai.j")
    public int field1033;

    @ObfuscatedName("ai.f")
    public int field1045;

    @ObfuscatedName("ai.y")
    public int field1035;

    @ObfuscatedName("ai.x")
    public int field1032;

    @ObfuscatedName("ai.e")
    public int field1036;

    @ObfuscatedName("ai.m")
    public int field1038;

    @ObfuscatedName("ai.s")
    public int field1039;

    @ObfuscatedName("ai.p")
    public int field1040;

    @ObfuscatedName("ai.r")
    public int field1041;

    @ObfuscatedName("ai.n")
    public boolean field1042;

    @ObfuscatedName("ai.b")
    public int field1043;

    @ObfuscatedName("ai.z")
    public int field1044;

    @ObfuscatedName("ai.h")
    public int field1037;

    @ObfuscatedName("ai.q")
    public int field1046;

    @ObfuscatedName("ai.c(II)I")
    public static int method960(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("ai.j(II)I")
    public static int method939(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("ai.f()I")
    public int method1044() {
        int var1 = this.field1032 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field1039 == 0) {
            var2 -= this.field1034 * var2 / (((class62) this.field1054).field1214.length << 8);
        } else if (this.field1039 >= 0) {
            var2 -= this.field1040 * var2 / ((class62) this.field1054).field1214.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    public class44(class62 arg0, int arg1, int arg2) {
        this.field1054 = arg0;
        this.field1040 = arg0.field1213;
        this.field1041 = arg0.field1216;
        this.field1042 = arg0.field1217;
        this.field1033 = arg1;
        this.field1045 = arg2;
        this.field1035 = 8192;
        this.field1034 = 0;
        this.method909();
    }

    public class44(class62 arg0, int arg1, int arg2, int arg3) {
        this.field1054 = arg0;
        this.field1040 = arg0.field1213;
        this.field1041 = arg0.field1216;
        this.field1042 = arg0.field1217;
        this.field1033 = arg1;
        this.field1045 = arg2;
        this.field1035 = arg3;
        this.field1034 = 0;
        this.method909();
    }

    @ObfuscatedName("ai.y(Lbm;II)Lai;")
    public static class44 method907(class62 arg0, int arg1, int arg2) {
        return arg0.field1214 == null || arg0.field1214.length == 0 ? null : new class44(arg0, (int) ((long) arg0.field1215 * 256L * (long) arg1 / (long) (Statics.field1090 * 100)), arg2 << 6);
    }

    @ObfuscatedName("ai.x(Lbm;III)Lai;")
    public static class44 method908(class62 arg0, int arg1, int arg2, int arg3) {
        return arg0.field1214 == null || arg0.field1214.length == 0 ? null : new class44(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("ai.e()V")
    public void method909() {
        this.field1032 = this.field1045;
        this.field1036 = method960(this.field1045, this.field1035);
        this.field1038 = method939(this.field1045, this.field1035);
    }

    @ObfuscatedName("ai.m(I)V")
    public synchronized void method910(int arg0) {
        this.field1039 = arg0;
    }

    @ObfuscatedName("ai.s(I)V")
    public synchronized void method984(int arg0) {
        this.method913(arg0 << 6, this.method915());
    }

    @ObfuscatedName("ai.p(I)V")
    public synchronized void method979(int arg0) {
        this.method913(arg0, this.method915());
    }

    @ObfuscatedName("ai.w(II)V")
    public synchronized void method913(int arg0, int arg1) {
        this.field1045 = arg0;
        this.field1035 = arg1;
        this.field1043 = 0;
        this.method909();
    }

    @ObfuscatedName("ai.r()I")
    public synchronized int method990() {
        return this.field1045 == Integer.MIN_VALUE ? 0 : this.field1045;
    }

    @ObfuscatedName("ai.n()I")
    public synchronized int method915() {
        return this.field1035 < 0 ? -1 : this.field1035;
    }

    @ObfuscatedName("ai.b(I)V")
    public synchronized void method916(int arg0) {
        int var2 = ((class62) this.field1054).field1214.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field1034 = arg0;
    }

    @ObfuscatedName("ai.z(Z)V")
    public synchronized void method917(boolean arg0) {
        this.field1033 = (this.field1033 >>> 31) + (this.field1033 ^ this.field1033 >> 31);
        if (arg0) {
            this.field1033 = -this.field1033;
        }
    }

    @ObfuscatedName("ai.h()V")
    public void method1003() {
        if (this.field1043 == 0) {
            return;
        }
        if (this.field1045 == Integer.MIN_VALUE) {
            this.field1045 = 0;
        }
        this.field1043 = 0;
        this.method909();
    }

    @ObfuscatedName("ai.q(II)V")
    public synchronized void method1010(int arg0, int arg1) {
        this.method920(arg0, arg1, this.method915());
    }

    @ObfuscatedName("ai.l(III)V")
    public synchronized void method920(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method913(arg1, arg2);
            return;
        }
        int var4 = method960(arg1, arg2);
        int var5 = method939(arg1, arg2);
        if (this.field1036 == var4 && this.field1038 == var5) {
            this.field1043 = 0;
            return;
        }
        int var6 = arg1 - this.field1032;
        if (this.field1032 - arg1 > var6) {
            var6 = this.field1032 - arg1;
        }
        if (var4 - this.field1036 > var6) {
            var6 = var4 - this.field1036;
        }
        if (this.field1036 - var4 > var6) {
            var6 = this.field1036 - var4;
        }
        if (var5 - this.field1038 > var6) {
            var6 = var5 - this.field1038;
        }
        if (this.field1038 - var5 > var6) {
            var6 = this.field1038 - var5;
        }
        if (arg0 > var6) {
            arg0 = var6;
        }
        this.field1043 = arg0;
        this.field1045 = arg1;
        this.field1035 = arg2;
        this.field1044 = (arg1 - this.field1032) / arg0;
        this.field1037 = (var4 - this.field1036) / arg0;
        this.field1046 = (var5 - this.field1038) / arg0;
    }

    @ObfuscatedName("ai.t(I)V")
    public synchronized void method966(int arg0) {
        if (arg0 == 0) {
            this.method979(0);
            this.method3182();
        } else if (this.field1036 == 0 && this.field1038 == 0) {
            this.field1043 = 0;
            this.field1045 = 0;
            this.field1032 = 0;
            this.method3182();
        } else {
            int var2 = -this.field1032;
            if (this.field1032 > var2) {
                var2 = this.field1032;
            }
            if (-this.field1036 > var2) {
                var2 = -this.field1036;
            }
            if (this.field1036 > var2) {
                var2 = this.field1036;
            }
            if (-this.field1038 > var2) {
                var2 = -this.field1038;
            }
            if (this.field1038 > var2) {
                var2 = this.field1038;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field1043 = arg0;
            this.field1045 = Integer.MIN_VALUE;
            this.field1044 = -this.field1032 / arg0;
            this.field1037 = -this.field1036 / arg0;
            this.field1046 = -this.field1038 / arg0;
        }
    }

    @ObfuscatedName("ai.g(I)V")
    public synchronized void method922(int arg0) {
        if (this.field1033 < 0) {
            this.field1033 = -arg0;
        } else {
            this.field1033 = arg0;
        }
    }

    @ObfuscatedName("ai.a()I")
    public synchronized int method923() {
        return this.field1033 < 0 ? -this.field1033 : this.field1033;
    }

    @ObfuscatedName("ai.v()Z")
    public boolean method924() {
        return this.field1034 < 0 || this.field1034 >= ((class62) this.field1054).field1214.length << 8;
    }

    @ObfuscatedName("ai.i()Z")
    public boolean method944() {
        return this.field1043 != 0;
    }

    @ObfuscatedName("ai.k()Lau;")
    public class47 method926() {
        return null;
    }

    @ObfuscatedName("ai.o()Lau;")
    public class47 method927() {
        return null;
    }

    @ObfuscatedName("ai.d()I")
    public int method928() {
        return this.field1045 == 0 && this.field1043 == 0 ? 0 : 1;
    }

    @ObfuscatedName("ai.u([III)V")
    public synchronized void method929(int[] arg0, int arg1, int arg2) {
        if (this.field1045 == 0 && this.field1043 == 0) {
            this.method1014(arg2);
            return;
        }
        class62 var4 = (class62) this.field1054;
        int var5 = this.field1040 << 8;
        int var6 = this.field1041 << 8;
        int var7 = var4.field1214.length << 8;
        int var8 = var6 - var5;
        if (var8 <= 0) {
            this.field1039 = 0;
        }
        int var9 = arg1;
        int var10 = arg1 + arg2;
        if (this.field1034 < 0) {
            if (this.field1033 <= 0) {
                this.method1003();
                this.method3182();
                return;
            }
            this.field1034 = 0;
        }
        if (this.field1034 >= var7) {
            if (this.field1033 >= 0) {
                this.method1003();
                this.method3182();
                return;
            }
            this.field1034 = var7 - 1;
        }
        if (this.field1039 >= 0) {
            if (this.field1039 > 0) {
                if (this.field1042) {
                    label131: {
                        if (this.field1033 < 0) {
                            var9 = this.method968(arg0, arg1, var5, var10, var4.field1214[this.field1040]);
                            if (this.field1034 >= var5) {
                                return;
                            }
                            this.field1034 = var5 + var5 - 1 - this.field1034;
                            this.field1033 = -this.field1033;
                            if (--this.field1039 == 0) {
                                break label131;
                            }
                        }
                        do {
                            var9 = this.method931(arg0, var9, var6, var10, var4.field1214[this.field1041 - 1]);
                            if (this.field1034 < var6) {
                                return;
                            }
                            this.field1034 = var6 + var6 - 1 - this.field1034;
                            this.field1033 = -this.field1033;
                            if (--this.field1039 == 0) {
                                break;
                            }
                            var9 = this.method968(arg0, var9, var5, var10, var4.field1214[this.field1040]);
                            if (this.field1034 >= var5) {
                                return;
                            }
                            this.field1034 = var5 + var5 - 1 - this.field1034;
                            this.field1033 = -this.field1033;
                        } while (--this.field1039 != 0);
                    }
                } else if (this.field1033 < 0) {
                    while (true) {
                        var9 = this.method968(arg0, var9, var5, var10, var4.field1214[this.field1041 - 1]);
                        if (this.field1034 >= var5) {
                            return;
                        }
                        int var12 = (var6 - 1 - this.field1034) / var8;
                        if (var12 >= this.field1039) {
                            this.field1034 += this.field1039 * var8;
                            this.field1039 = 0;
                            break;
                        }
                        this.field1034 += var8 * var12;
                        this.field1039 -= var12;
                    }
                } else {
                    while (true) {
                        var9 = this.method931(arg0, var9, var6, var10, var4.field1214[this.field1040]);
                        if (this.field1034 < var6) {
                            return;
                        }
                        int var13 = (this.field1034 - var5) / var8;
                        if (var13 >= this.field1039) {
                            this.field1034 -= this.field1039 * var8;
                            this.field1039 = 0;
                            break;
                        }
                        this.field1034 -= var8 * var13;
                        this.field1039 -= var13;
                    }
                }
            }
            if (this.field1033 < 0) {
                this.method968(arg0, var9, 0, var10, 0);
                if (this.field1034 < 0) {
                    this.field1034 = -1;
                    this.method1003();
                    this.method3182();
                }
            } else {
                this.method931(arg0, var9, var7, var10, 0);
                if (this.field1034 >= var7) {
                    this.field1034 = var7;
                    this.method1003();
                    this.method3182();
                }
            }
        } else if (this.field1042) {
            if (this.field1033 < 0) {
                var9 = this.method968(arg0, arg1, var5, var10, var4.field1214[this.field1040]);
                if (this.field1034 >= var5) {
                    return;
                }
                this.field1034 = var5 + var5 - 1 - this.field1034;
                this.field1033 = -this.field1033;
            }
            while (true) {
                int var11 = this.method931(arg0, var9, var6, var10, var4.field1214[this.field1041 - 1]);
                if (this.field1034 < var6) {
                    return;
                }
                this.field1034 = var6 + var6 - 1 - this.field1034;
                this.field1033 = -this.field1033;
                var9 = this.method968(arg0, var11, var5, var10, var4.field1214[this.field1040]);
                if (this.field1034 >= var5) {
                    return;
                }
                this.field1034 = var5 + var5 - 1 - this.field1034;
                this.field1033 = -this.field1033;
            }
        } else if (this.field1033 < 0) {
            while (true) {
                var9 = this.method968(arg0, var9, var5, var10, var4.field1214[this.field1041 - 1]);
                if (this.field1034 >= var5) {
                    return;
                }
                this.field1034 = var6 - 1 - (var6 - 1 - this.field1034) % var8;
            }
        } else {
            while (true) {
                var9 = this.method931(arg0, var9, var6, var10, var4.field1214[this.field1040]);
                if (this.field1034 < var6) {
                    return;
                }
                this.field1034 = (this.field1034 - var5) % var8 + var5;
            }
        }
    }

    @ObfuscatedName("ai.ap(I)V")
    public synchronized void method1014(int arg0) {
        if (this.field1043 > 0) {
            if (arg0 >= this.field1043) {
                if (this.field1045 == Integer.MIN_VALUE) {
                    this.field1045 = 0;
                    this.field1038 = 0;
                    this.field1036 = 0;
                    this.field1032 = 0;
                    this.method3182();
                    arg0 = this.field1043;
                }
                this.field1043 = 0;
                this.method909();
            } else {
                this.field1032 += this.field1044 * arg0;
                this.field1036 += this.field1037 * arg0;
                this.field1038 += this.field1046 * arg0;
                this.field1043 -= arg0;
            }
        }
        class62 var2 = (class62) this.field1054;
        int var3 = this.field1040 << 8;
        int var4 = this.field1041 << 8;
        int var5 = var2.field1214.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field1039 = 0;
        }
        if (this.field1034 < 0) {
            if (this.field1033 <= 0) {
                this.method1003();
                this.method3182();
                return;
            }
            this.field1034 = 0;
        }
        if (this.field1034 >= var5) {
            if (this.field1033 >= 0) {
                this.method1003();
                this.method3182();
                return;
            }
            this.field1034 = var5 - 1;
        }
        this.field1034 += this.field1033 * arg0;
        if (this.field1039 >= 0) {
            if (this.field1039 > 0) {
                if (this.field1042) {
                    label121: {
                        if (this.field1033 < 0) {
                            if (this.field1034 >= var3) {
                                return;
                            }
                            this.field1034 = var3 + var3 - 1 - this.field1034;
                            this.field1033 = -this.field1033;
                            if (--this.field1039 == 0) {
                                break label121;
                            }
                        }
                        do {
                            if (this.field1034 < var4) {
                                return;
                            }
                            this.field1034 = var4 + var4 - 1 - this.field1034;
                            this.field1033 = -this.field1033;
                            if (--this.field1039 == 0) {
                                break;
                            }
                            if (this.field1034 >= var3) {
                                return;
                            }
                            this.field1034 = var3 + var3 - 1 - this.field1034;
                            this.field1033 = -this.field1033;
                        } while (--this.field1039 != 0);
                    }
                } else {
                    label153: {
                        if (this.field1033 < 0) {
                            if (this.field1034 >= var3) {
                                return;
                            }
                            int var7 = (var4 - 1 - this.field1034) / var6;
                            if (var7 >= this.field1039) {
                                this.field1034 += this.field1039 * var6;
                                this.field1039 = 0;
                                break label153;
                            }
                            this.field1034 += var6 * var7;
                            this.field1039 -= var7;
                        } else if (this.field1034 >= var4) {
                            int var8 = (this.field1034 - var3) / var6;
                            if (var8 >= this.field1039) {
                                this.field1034 -= this.field1039 * var6;
                                this.field1039 = 0;
                                break label153;
                            }
                            this.field1034 -= var6 * var8;
                            this.field1039 -= var8;
                        } else {
                            return;
                        }
                        return;
                    }
                }
            }
            if (this.field1033 < 0) {
                if (this.field1034 < 0) {
                    this.field1034 = -1;
                    this.method1003();
                    this.method3182();
                }
            } else if (this.field1034 >= var5) {
                this.field1034 = var5;
                this.method1003();
                this.method3182();
            }
        } else if (this.field1042) {
            if (this.field1033 < 0) {
                if (this.field1034 >= var3) {
                    return;
                }
                this.field1034 = var3 + var3 - 1 - this.field1034;
                this.field1033 = -this.field1033;
            }
            while (this.field1034 >= var4) {
                this.field1034 = var4 + var4 - 1 - this.field1034;
                this.field1033 = -this.field1033;
                if (this.field1034 >= var3) {
                    return;
                }
                this.field1034 = var3 + var3 - 1 - this.field1034;
                this.field1033 = -this.field1033;
            }
        } else if (this.field1033 < 0) {
            if (this.field1034 >= var3) {
                return;
            }
            this.field1034 = var4 - 1 - (var4 - 1 - this.field1034) % var6;
        } else if (this.field1034 >= var4) {
            this.field1034 = (this.field1034 - var3) % var6 + var3;
        } else {
            return;
        }
    }

    @ObfuscatedName("ai.ad([IIIII)I")
    public int method931(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1043 > 0) {
                int var6 = this.field1043 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1043 += arg1;
                if (this.field1033 == 256 && (this.field1034 & 0xFF) == 0) {
                    if (Statics.field1077) {
                        arg1 = method1000(0, ((class62) this.field1054).field1214, arg0, this.field1034, arg1, this.field1036, this.field1038, this.field1037, this.field1046, 0, var6, arg2, this);
                    } else {
                        arg1 = method942(((class62) this.field1054).field1214, arg0, this.field1034, arg1, this.field1032, this.field1044, 0, var6, arg2, this);
                    }
                } else if (Statics.field1077) {
                    arg1 = method947(0, 0, ((class62) this.field1054).field1214, arg0, this.field1034, arg1, this.field1036, this.field1038, this.field1037, this.field1046, 0, var6, arg2, this, this.field1033, arg4);
                } else {
                    arg1 = method946(0, 0, ((class62) this.field1054).field1214, arg0, this.field1034, arg1, this.field1032, this.field1044, 0, var6, arg2, this, this.field1033, arg4);
                }
                this.field1043 -= arg1;
                if (this.field1043 != 0) {
                    return arg1;
                }
                if (!this.method992()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1033 == 256 && (this.field1034 & 0xFF) == 0) {
                if (Statics.field1077) {
                    return method918(0, ((class62) this.field1054).field1214, arg0, this.field1034, arg1, this.field1036, this.field1038, 0, arg3, arg2, this);
                }
                return method904(((class62) this.field1054).field1214, arg0, this.field1034, arg1, this.field1032, 0, arg3, arg2, this);
            }
            if (Statics.field1077) {
                return method930(0, 0, ((class62) this.field1054).field1214, arg0, this.field1034, arg1, this.field1036, this.field1038, 0, arg3, arg2, this, this.field1033, arg4);
            }
            return method938(0, 0, ((class62) this.field1054).field1214, arg0, this.field1034, arg1, this.field1032, 0, arg3, arg2, this, this.field1033, arg4);
        }
    }

    @ObfuscatedName("ai.ao([IIIII)I")
    public int method968(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1043 > 0) {
                int var6 = this.field1043 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1043 += arg1;
                if (this.field1033 == -256 && (this.field1034 & 0xFF) == 0) {
                    if (Statics.field1077) {
                        arg1 = method1038(0, ((class62) this.field1054).field1214, arg0, this.field1034, arg1, this.field1036, this.field1038, this.field1037, this.field1046, 0, var6, arg2, this);
                    } else {
                        arg1 = method1018(((class62) this.field1054).field1214, arg0, this.field1034, arg1, this.field1032, this.field1044, 0, var6, arg2, this);
                    }
                } else if (Statics.field1077) {
                    arg1 = method949(0, 0, ((class62) this.field1054).field1214, arg0, this.field1034, arg1, this.field1036, this.field1038, this.field1037, this.field1046, 0, var6, arg2, this, this.field1033, arg4);
                } else {
                    arg1 = method912(0, 0, ((class62) this.field1054).field1214, arg0, this.field1034, arg1, this.field1032, this.field1044, 0, var6, arg2, this, this.field1033, arg4);
                }
                this.field1043 -= arg1;
                if (this.field1043 != 0) {
                    return arg1;
                }
                if (!this.method992()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1033 == -256 && (this.field1034 & 0xFF) == 0) {
                if (Statics.field1077) {
                    return method937(0, ((class62) this.field1054).field1214, arg0, this.field1034, arg1, this.field1036, this.field1038, 0, arg3, arg2, this);
                }
                return method936(((class62) this.field1054).field1214, arg0, this.field1034, arg1, this.field1032, 0, arg3, arg2, this);
            }
            if (Statics.field1077) {
                return method1009(0, 0, ((class62) this.field1054).field1214, arg0, this.field1034, arg1, this.field1036, this.field1038, 0, arg3, arg2, this, this.field1033, arg4);
            }
            return method940(0, 0, ((class62) this.field1054).field1214, arg0, this.field1034, arg1, this.field1032, 0, arg3, arg2, this, this.field1033, arg4);
        }
    }

    @ObfuscatedName("ai.av()Z")
    public boolean method992() {
        int var1 = this.field1045;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method960(var1, this.field1035);
            var2 = method939(var1, this.field1035);
        }
        if (this.field1032 != var1 || this.field1036 != var3 || this.field1038 != var2) {
            if (this.field1032 < var1) {
                this.field1044 = 1;
                this.field1043 = var1 - this.field1032;
            } else if (this.field1032 > var1) {
                this.field1044 = -1;
                this.field1043 = this.field1032 - var1;
            } else {
                this.field1044 = 0;
            }
            if (this.field1036 < var3) {
                this.field1037 = 1;
                if (this.field1043 == 0 || this.field1043 > var3 - this.field1036) {
                    this.field1043 = var3 - this.field1036;
                }
            } else if (this.field1036 > var3) {
                this.field1037 = -1;
                if (this.field1043 == 0 || this.field1043 > this.field1036 - var3) {
                    this.field1043 = this.field1036 - var3;
                }
            } else {
                this.field1037 = 0;
            }
            if (this.field1038 < var2) {
                this.field1046 = 1;
                if (this.field1043 == 0 || this.field1043 > var2 - this.field1038) {
                    this.field1043 = var2 - this.field1038;
                }
            } else if (this.field1038 > var2) {
                this.field1046 = -1;
                if (this.field1043 == 0 || this.field1043 > this.field1038 - var2) {
                    this.field1043 = this.field1038 - var2;
                }
            } else {
                this.field1046 = 0;
            }
            return false;
        } else if (this.field1045 == Integer.MIN_VALUE) {
            this.field1045 = 0;
            this.field1038 = 0;
            this.field1036 = 0;
            this.field1032 = 0;
            this.method3182();
            return true;
        } else {
            this.method909();
            return false;
        }
    }

    @ObfuscatedName("ai.af([B[IIIIIIILai;)I")
    public static int method904(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class44 arg8) {
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
        arg8.field1034 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("ai.ae(I[B[IIIIIIIILai;)I")
    public static int method918(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class44 arg10) {
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
        arg10.field1034 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("ai.ax([B[IIIIIIILai;)I")
    public static int method936(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class44 arg8) {
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
        arg8.field1034 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("ai.aw(I[B[IIIIIIIILai;)I")
    public static int method937(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class44 arg10) {
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
        arg10.field1034 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("ai.an(II[B[IIIIIIILai;II)I")
    public static int method938(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class44 arg10, int arg11, int arg12) {
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
        arg10.field1034 = arg4;
        return arg5;
    }

    @ObfuscatedName("ai.az(II[B[IIIIIIIILai;II)I")
    public static int method930(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class44 arg11, int arg12, int arg13) {
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
        arg11.field1034 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("ai.as(II[B[IIIIIIILai;II)I")
    public static int method940(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class44 arg10, int arg11, int arg12) {
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
        arg10.field1034 = arg4;
        return arg5;
    }

    @ObfuscatedName("ai.ag(II[B[IIIIIIIILai;II)I")
    public static int method1009(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class44 arg11, int arg12, int arg13) {
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
        arg11.field1034 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("ai.am([B[IIIIIIIILai;)I")
    public static int method942(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class44 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field1036 += (var14 - arg3) * arg9.field1037;
        arg9.field1038 += (var14 - arg3) * arg9.field1046;
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
        arg9.field1032 = var12 >> 2;
        arg9.field1034 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("ai.ah(I[B[IIIIIIIIIILai;)I")
    public static int method1000(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class44 arg12) {
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
        arg12.field1032 += (var19 - arg4) * arg12.field1044;
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
        arg12.field1036 = var15 >> 2;
        arg12.field1038 = var16 >> 2;
        arg12.field1034 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("ai.aj([B[IIIIIIIILai;)I")
    public static int method1018(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class44 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field1036 += (var14 - arg3) * arg9.field1037;
        arg9.field1038 += (var14 - arg3) * arg9.field1046;
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
        arg9.field1032 = var12 >> 2;
        arg9.field1034 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("ai.ab(I[B[IIIIIIIIIILai;)I")
    public static int method1038(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class44 arg12) {
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
        arg12.field1032 += (var19 - arg4) * arg12.field1044;
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
        arg12.field1036 = var15 >> 2;
        arg12.field1038 = var16 >> 2;
        arg12.field1034 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("ai.at(II[B[IIIIIIIILai;II)I")
    public static int method946(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class44 arg11, int arg12, int arg13) {
        arg11.field1036 -= arg11.field1037 * arg5;
        arg11.field1038 -= arg11.field1046 * arg5;
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
        arg11.field1036 += arg11.field1037 * arg5;
        arg11.field1038 += arg11.field1046 * arg5;
        arg11.field1032 = arg6;
        arg11.field1034 = arg4;
        return arg5;
    }

    @ObfuscatedName("ai.ai(II[B[IIIIIIIIIILai;II)I")
    public static int method947(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class44 arg13, int arg14, int arg15) {
        arg13.field1032 -= arg13.field1044 * arg5;
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
        arg13.field1032 += arg13.field1044 * var27;
        arg13.field1036 = arg6;
        arg13.field1038 = arg7;
        arg13.field1034 = arg4;
        return var27;
    }

    @ObfuscatedName("ai.aa(II[B[IIIIIIIILai;II)I")
    public static int method912(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class44 arg11, int arg12, int arg13) {
        arg11.field1036 -= arg11.field1037 * arg5;
        arg11.field1038 -= arg11.field1046 * arg5;
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
        arg11.field1036 += arg11.field1037 * arg5;
        arg11.field1038 += arg11.field1046 * arg5;
        arg11.field1032 = arg6;
        arg11.field1034 = arg4;
        return arg5;
    }

    @ObfuscatedName("ai.ar(II[B[IIIIIIIIIILai;II)I")
    public static int method949(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class44 arg13, int arg14, int arg15) {
        arg13.field1032 -= arg13.field1044 * arg5;
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
        arg13.field1032 += arg13.field1044 * var26;
        arg13.field1036 = arg6;
        arg13.field1038 = arg7;
        arg13.field1034 = arg4;
        return var26;
    }
}
