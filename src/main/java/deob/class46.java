package deob;

@ObfuscatedName("ay")
public class class46 extends class49 {

    @ObfuscatedName("ay.e")
    public int field1073;

    @ObfuscatedName("ay.i")
    public int field1065;

    @ObfuscatedName("ay.k")
    public int field1072;

    @ObfuscatedName("ay.q")
    public int field1068;

    @ObfuscatedName("ay.j")
    public int field1069;

    @ObfuscatedName("ay.z")
    public int field1070;

    @ObfuscatedName("ay.m")
    public int field1071;

    @ObfuscatedName("ay.a")
    public int field1079;

    @ObfuscatedName("ay.d")
    public int field1067;

    @ObfuscatedName("ay.u")
    public int field1074;

    @ObfuscatedName("ay.p")
    public boolean field1075;

    @ObfuscatedName("ay.t")
    public int field1076;

    @ObfuscatedName("ay.g")
    public int field1077;

    @ObfuscatedName("ay.o")
    public int field1066;

    @ObfuscatedName("ay.x")
    public int field1078;

    @ObfuscatedName("ay.e(II)I")
    public static int method1112(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("ay.i(II)I")
    public static int method1062(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("ay.k()I")
    public int method990() {
        int var1 = this.field1069 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field1079 == 0) {
            var2 -= this.field1073 * var2 / (((class64) this.field1087).field1256.length << 8);
        } else if (this.field1079 >= 0) {
            var2 -= this.field1067 * var2 / ((class64) this.field1087).field1256.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    public class46(class64 arg0, int arg1, int arg2) {
        this.field1087 = arg0;
        this.field1067 = arg0.field1254;
        this.field1074 = arg0.field1255;
        this.field1075 = arg0.field1252;
        this.field1065 = arg1;
        this.field1072 = arg2;
        this.field1068 = 8192;
        this.field1073 = 0;
        this.method995();
    }

    public class46(class64 arg0, int arg1, int arg2, int arg3) {
        this.field1087 = arg0;
        this.field1067 = arg0.field1254;
        this.field1074 = arg0.field1255;
        this.field1075 = arg0.field1252;
        this.field1065 = arg1;
        this.field1072 = arg2;
        this.field1068 = arg3;
        this.field1073 = 0;
        this.method995();
    }

    @ObfuscatedName("ay.q(Lbs;II)Lay;")
    public static class46 method1000(class64 arg0, int arg1, int arg2) {
        return arg0.field1256 == null || arg0.field1256.length == 0 ? null : new class46(arg0, (int) ((long) arg0.field1253 * 256L * (long) arg1 / (long) (Statics.field1126 * 100)), arg2 << 6);
    }

    @ObfuscatedName("ay.j(Lbs;III)Lay;")
    public static class46 method1141(class64 arg0, int arg1, int arg2, int arg3) {
        return arg0.field1256 == null || arg0.field1256.length == 0 ? null : new class46(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("ay.z()V")
    public void method995() {
        this.field1069 = this.field1072;
        this.field1070 = method1112(this.field1072, this.field1068);
        this.field1071 = method1062(this.field1072, this.field1068);
    }

    @ObfuscatedName("ay.m(I)V")
    public synchronized void method996(int arg0) {
        this.field1079 = arg0;
    }

    @ObfuscatedName("ay.w(I)V")
    public synchronized void method997(int arg0) {
        this.method999(arg0 << 6, this.method1121());
    }

    @ObfuscatedName("ay.a(I)V")
    public synchronized void method1076(int arg0) {
        this.method999(arg0, this.method1121());
    }

    @ObfuscatedName("ay.d(II)V")
    public synchronized void method999(int arg0, int arg1) {
        this.field1072 = arg0;
        this.field1068 = arg1;
        this.field1076 = 0;
        this.method995();
    }

    @ObfuscatedName("ay.u()I")
    public synchronized int method1106() {
        return this.field1072 == Integer.MIN_VALUE ? 0 : this.field1072;
    }

    @ObfuscatedName("ay.p()I")
    public synchronized int method1121() {
        return this.field1068 < 0 ? -1 : this.field1068;
    }

    @ObfuscatedName("ay.t(I)V")
    public synchronized void method1113(int arg0) {
        int var2 = ((class64) this.field1087).field1256.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field1073 = arg0;
    }

    @ObfuscatedName("ay.g(Z)V")
    public synchronized void method1003(boolean arg0) {
        this.field1065 = (this.field1065 >>> 31) + (this.field1065 ^ this.field1065 >> 31);
        if (arg0) {
            this.field1065 = -this.field1065;
        }
    }

    @ObfuscatedName("ay.o()V")
    public void method1045() {
        if (this.field1076 == 0) {
            return;
        }
        if (this.field1072 == Integer.MIN_VALUE) {
            this.field1072 = 0;
        }
        this.field1076 = 0;
        this.method995();
    }

    @ObfuscatedName("ay.x(II)V")
    public synchronized void method1004(int arg0, int arg1) {
        this.method1005(arg0, arg1, this.method1121());
    }

    @ObfuscatedName("ay.c(III)V")
    public synchronized void method1005(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method999(arg1, arg2);
            return;
        }
        int var4 = method1112(arg1, arg2);
        int var5 = method1062(arg1, arg2);
        if (this.field1070 == var4 && this.field1071 == var5) {
            this.field1076 = 0;
            return;
        }
        int var6 = arg1 - this.field1069;
        if (this.field1069 - arg1 > var6) {
            var6 = this.field1069 - arg1;
        }
        if (var4 - this.field1070 > var6) {
            var6 = var4 - this.field1070;
        }
        if (this.field1070 - var4 > var6) {
            var6 = this.field1070 - var4;
        }
        if (var5 - this.field1071 > var6) {
            var6 = var5 - this.field1071;
        }
        if (this.field1071 - var5 > var6) {
            var6 = this.field1071 - var5;
        }
        if (arg0 > var6) {
            arg0 = var6;
        }
        this.field1076 = arg0;
        this.field1072 = arg1;
        this.field1068 = arg2;
        this.field1077 = (arg1 - this.field1069) / arg0;
        this.field1066 = (var4 - this.field1070) / arg0;
        this.field1078 = (var5 - this.field1071) / arg0;
    }

    @ObfuscatedName("ay.b(I)V")
    public synchronized void method1015(int arg0) {
        if (arg0 == 0) {
            this.method1076(0);
            this.method3366();
        } else if (this.field1070 == 0 && this.field1071 == 0) {
            this.field1076 = 0;
            this.field1072 = 0;
            this.field1069 = 0;
            this.method3366();
        } else {
            int var2 = -this.field1069;
            if (this.field1069 > var2) {
                var2 = this.field1069;
            }
            if (-this.field1070 > var2) {
                var2 = -this.field1070;
            }
            if (this.field1070 > var2) {
                var2 = this.field1070;
            }
            if (-this.field1071 > var2) {
                var2 = -this.field1071;
            }
            if (this.field1071 > var2) {
                var2 = this.field1071;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field1076 = arg0;
            this.field1072 = Integer.MIN_VALUE;
            this.field1077 = -this.field1069 / arg0;
            this.field1066 = -this.field1070 / arg0;
            this.field1078 = -this.field1071 / arg0;
        }
    }

    @ObfuscatedName("ay.f(I)V")
    public synchronized void method1007(int arg0) {
        if (this.field1065 < 0) {
            this.field1065 = -arg0;
        } else {
            this.field1065 = arg0;
        }
    }

    @ObfuscatedName("ay.s()I")
    public synchronized int method1008() {
        return this.field1065 < 0 ? -this.field1065 : this.field1065;
    }

    @ObfuscatedName("ay.y()Z")
    public boolean method1009() {
        return this.field1073 < 0 || this.field1073 >= ((class64) this.field1087).field1256.length << 8;
    }

    @ObfuscatedName("ay.r()Z")
    public boolean method1010() {
        return this.field1076 != 0;
    }

    @ObfuscatedName("ay.l()Lac;")
    public class49 method1100() {
        return null;
    }

    @ObfuscatedName("ay.n()Lac;")
    public class49 method1012() {
        return null;
    }

    @ObfuscatedName("ay.h()I")
    public int method1006() {
        return this.field1072 == 0 && this.field1076 == 0 ? 0 : 1;
    }

    @ObfuscatedName("ay.v([III)V")
    public synchronized void method1014(int[] arg0, int arg1, int arg2) {
        if (this.field1072 == 0 && this.field1076 == 0) {
            this.method1055(arg2);
            return;
        }
        class64 var4 = (class64) this.field1087;
        int var5 = this.field1067 << 8;
        int var6 = this.field1074 << 8;
        int var7 = var4.field1256.length << 8;
        int var8 = var6 - var5;
        if (var8 <= 0) {
            this.field1079 = 0;
        }
        int var9 = arg1;
        int var10 = arg1 + arg2;
        if (this.field1073 < 0) {
            if (this.field1065 <= 0) {
                this.method1045();
                this.method3366();
                return;
            }
            this.field1073 = 0;
        }
        if (this.field1073 >= var7) {
            if (this.field1065 >= 0) {
                this.method1045();
                this.method3366();
                return;
            }
            this.field1073 = var7 - 1;
        }
        if (this.field1079 >= 0) {
            if (this.field1079 > 0) {
                if (this.field1075) {
                    label131: {
                        if (this.field1065 < 0) {
                            var9 = this.method1017(arg0, arg1, var5, var10, var4.field1256[this.field1067]);
                            if (this.field1073 >= var5) {
                                return;
                            }
                            this.field1073 = var5 + var5 - 1 - this.field1073;
                            this.field1065 = -this.field1065;
                            if (--this.field1079 == 0) {
                                break label131;
                            }
                        }
                        do {
                            var9 = this.method1016(arg0, var9, var6, var10, var4.field1256[this.field1074 - 1]);
                            if (this.field1073 < var6) {
                                return;
                            }
                            this.field1073 = var6 + var6 - 1 - this.field1073;
                            this.field1065 = -this.field1065;
                            if (--this.field1079 == 0) {
                                break;
                            }
                            var9 = this.method1017(arg0, var9, var5, var10, var4.field1256[this.field1067]);
                            if (this.field1073 >= var5) {
                                return;
                            }
                            this.field1073 = var5 + var5 - 1 - this.field1073;
                            this.field1065 = -this.field1065;
                        } while (--this.field1079 != 0);
                    }
                } else if (this.field1065 < 0) {
                    while (true) {
                        var9 = this.method1017(arg0, var9, var5, var10, var4.field1256[this.field1074 - 1]);
                        if (this.field1073 >= var5) {
                            return;
                        }
                        int var12 = (var6 - 1 - this.field1073) / var8;
                        if (var12 >= this.field1079) {
                            this.field1073 += this.field1079 * var8;
                            this.field1079 = 0;
                            break;
                        }
                        this.field1073 += var8 * var12;
                        this.field1079 -= var12;
                    }
                } else {
                    while (true) {
                        var9 = this.method1016(arg0, var9, var6, var10, var4.field1256[this.field1067]);
                        if (this.field1073 < var6) {
                            return;
                        }
                        int var13 = (this.field1073 - var5) / var8;
                        if (var13 >= this.field1079) {
                            this.field1073 -= this.field1079 * var8;
                            this.field1079 = 0;
                            break;
                        }
                        this.field1073 -= var8 * var13;
                        this.field1079 -= var13;
                    }
                }
            }
            if (this.field1065 < 0) {
                this.method1017(arg0, var9, 0, var10, 0);
                if (this.field1073 < 0) {
                    this.field1073 = -1;
                    this.method1045();
                    this.method3366();
                }
            } else {
                this.method1016(arg0, var9, var7, var10, 0);
                if (this.field1073 >= var7) {
                    this.field1073 = var7;
                    this.method1045();
                    this.method3366();
                }
            }
        } else if (this.field1075) {
            if (this.field1065 < 0) {
                var9 = this.method1017(arg0, arg1, var5, var10, var4.field1256[this.field1067]);
                if (this.field1073 >= var5) {
                    return;
                }
                this.field1073 = var5 + var5 - 1 - this.field1073;
                this.field1065 = -this.field1065;
            }
            while (true) {
                int var11 = this.method1016(arg0, var9, var6, var10, var4.field1256[this.field1074 - 1]);
                if (this.field1073 < var6) {
                    return;
                }
                this.field1073 = var6 + var6 - 1 - this.field1073;
                this.field1065 = -this.field1065;
                var9 = this.method1017(arg0, var11, var5, var10, var4.field1256[this.field1067]);
                if (this.field1073 >= var5) {
                    return;
                }
                this.field1073 = var5 + var5 - 1 - this.field1073;
                this.field1065 = -this.field1065;
            }
        } else if (this.field1065 < 0) {
            while (true) {
                var9 = this.method1017(arg0, var9, var5, var10, var4.field1256[this.field1074 - 1]);
                if (this.field1073 >= var5) {
                    return;
                }
                this.field1073 = var6 - 1 - (var6 - 1 - this.field1073) % var8;
            }
        } else {
            while (true) {
                var9 = this.method1016(arg0, var9, var6, var10, var4.field1256[this.field1067]);
                if (this.field1073 < var6) {
                    return;
                }
                this.field1073 = (this.field1073 - var5) % var8 + var5;
            }
        }
    }

    @ObfuscatedName("ay.ax(I)V")
    public synchronized void method1055(int arg0) {
        if (this.field1076 > 0) {
            if (arg0 >= this.field1076) {
                if (this.field1072 == Integer.MIN_VALUE) {
                    this.field1072 = 0;
                    this.field1071 = 0;
                    this.field1070 = 0;
                    this.field1069 = 0;
                    this.method3366();
                    arg0 = this.field1076;
                }
                this.field1076 = 0;
                this.method995();
            } else {
                this.field1069 += this.field1077 * arg0;
                this.field1070 += this.field1066 * arg0;
                this.field1071 += this.field1078 * arg0;
                this.field1076 -= arg0;
            }
        }
        class64 var2 = (class64) this.field1087;
        int var3 = this.field1067 << 8;
        int var4 = this.field1074 << 8;
        int var5 = var2.field1256.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field1079 = 0;
        }
        if (this.field1073 < 0) {
            if (this.field1065 <= 0) {
                this.method1045();
                this.method3366();
                return;
            }
            this.field1073 = 0;
        }
        if (this.field1073 >= var5) {
            if (this.field1065 >= 0) {
                this.method1045();
                this.method3366();
                return;
            }
            this.field1073 = var5 - 1;
        }
        this.field1073 += this.field1065 * arg0;
        if (this.field1079 >= 0) {
            if (this.field1079 > 0) {
                if (this.field1075) {
                    label121: {
                        if (this.field1065 < 0) {
                            if (this.field1073 >= var3) {
                                return;
                            }
                            this.field1073 = var3 + var3 - 1 - this.field1073;
                            this.field1065 = -this.field1065;
                            if (--this.field1079 == 0) {
                                break label121;
                            }
                        }
                        do {
                            if (this.field1073 < var4) {
                                return;
                            }
                            this.field1073 = var4 + var4 - 1 - this.field1073;
                            this.field1065 = -this.field1065;
                            if (--this.field1079 == 0) {
                                break;
                            }
                            if (this.field1073 >= var3) {
                                return;
                            }
                            this.field1073 = var3 + var3 - 1 - this.field1073;
                            this.field1065 = -this.field1065;
                        } while (--this.field1079 != 0);
                    }
                } else {
                    label153: {
                        if (this.field1065 < 0) {
                            if (this.field1073 >= var3) {
                                return;
                            }
                            int var7 = (var4 - 1 - this.field1073) / var6;
                            if (var7 >= this.field1079) {
                                this.field1073 += this.field1079 * var6;
                                this.field1079 = 0;
                                break label153;
                            }
                            this.field1073 += var6 * var7;
                            this.field1079 -= var7;
                        } else if (this.field1073 >= var4) {
                            int var8 = (this.field1073 - var3) / var6;
                            if (var8 >= this.field1079) {
                                this.field1073 -= this.field1079 * var6;
                                this.field1079 = 0;
                                break label153;
                            }
                            this.field1073 -= var6 * var8;
                            this.field1079 -= var8;
                        } else {
                            return;
                        }
                        return;
                    }
                }
            }
            if (this.field1065 < 0) {
                if (this.field1073 < 0) {
                    this.field1073 = -1;
                    this.method1045();
                    this.method3366();
                }
            } else if (this.field1073 >= var5) {
                this.field1073 = var5;
                this.method1045();
                this.method3366();
            }
        } else if (this.field1075) {
            if (this.field1065 < 0) {
                if (this.field1073 >= var3) {
                    return;
                }
                this.field1073 = var3 + var3 - 1 - this.field1073;
                this.field1065 = -this.field1065;
            }
            while (this.field1073 >= var4) {
                this.field1073 = var4 + var4 - 1 - this.field1073;
                this.field1065 = -this.field1065;
                if (this.field1073 >= var3) {
                    return;
                }
                this.field1073 = var3 + var3 - 1 - this.field1073;
                this.field1065 = -this.field1065;
            }
        } else if (this.field1065 < 0) {
            if (this.field1073 >= var3) {
                return;
            }
            this.field1073 = var4 - 1 - (var4 - 1 - this.field1073) % var6;
        } else if (this.field1073 >= var4) {
            this.field1073 = (this.field1073 - var3) % var6 + var3;
        } else {
            return;
        }
    }

    @ObfuscatedName("ay.ao([IIIII)I")
    public int method1016(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1076 > 0) {
                int var6 = this.field1076 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1076 += arg1;
                if (this.field1065 == 256 && (this.field1073 & 0xFF) == 0) {
                    if (Statics.field1118) {
                        arg1 = method1028(0, ((class64) this.field1087).field1256, arg0, this.field1073, arg1, this.field1070, this.field1071, this.field1066, this.field1078, 0, var6, arg2, this);
                    } else {
                        arg1 = method1063(((class64) this.field1087).field1256, arg0, this.field1073, arg1, this.field1069, this.field1077, 0, var6, arg2, this);
                    }
                } else if (Statics.field1118) {
                    arg1 = method1032(0, 0, ((class64) this.field1087).field1256, arg0, this.field1073, arg1, this.field1070, this.field1071, this.field1066, this.field1078, 0, var6, arg2, this, this.field1065, arg4);
                } else {
                    arg1 = method1031(0, 0, ((class64) this.field1087).field1256, arg0, this.field1073, arg1, this.field1069, this.field1077, 0, var6, arg2, this, this.field1065, arg4);
                }
                this.field1076 -= arg1;
                if (this.field1076 != 0) {
                    return arg1;
                }
                if (!this.method1018()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1065 == 256 && (this.field1073 & 0xFF) == 0) {
                if (Statics.field1118) {
                    return method1020(0, ((class64) this.field1087).field1256, arg0, this.field1073, arg1, this.field1070, this.field1071, 0, arg3, arg2, this);
                }
                return method1059(((class64) this.field1087).field1256, arg0, this.field1073, arg1, this.field1069, 0, arg3, arg2, this);
            }
            if (Statics.field1118) {
                return method1091(0, 0, ((class64) this.field1087).field1256, arg0, this.field1073, arg1, this.field1070, this.field1071, 0, arg3, arg2, this, this.field1065, arg4);
            }
            return method1023(0, 0, ((class64) this.field1087).field1256, arg0, this.field1073, arg1, this.field1069, 0, arg3, arg2, this, this.field1065, arg4);
        }
    }

    @ObfuscatedName("ay.al([IIIII)I")
    public int method1017(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1076 > 0) {
                int var6 = this.field1076 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1076 += arg1;
                if (this.field1065 == -256 && (this.field1073 & 0xFF) == 0) {
                    if (Statics.field1118) {
                        arg1 = method1030(0, ((class64) this.field1087).field1256, arg0, this.field1073, arg1, this.field1070, this.field1071, this.field1066, this.field1078, 0, var6, arg2, this);
                    } else {
                        arg1 = method1029(((class64) this.field1087).field1256, arg0, this.field1073, arg1, this.field1069, this.field1077, 0, var6, arg2, this);
                    }
                } else if (Statics.field1118) {
                    arg1 = method1025(0, 0, ((class64) this.field1087).field1256, arg0, this.field1073, arg1, this.field1070, this.field1071, this.field1066, this.field1078, 0, var6, arg2, this, this.field1065, arg4);
                } else {
                    arg1 = method1033(0, 0, ((class64) this.field1087).field1256, arg0, this.field1073, arg1, this.field1069, this.field1077, 0, var6, arg2, this, this.field1065, arg4);
                }
                this.field1076 -= arg1;
                if (this.field1076 != 0) {
                    return arg1;
                }
                if (!this.method1018()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1065 == -256 && (this.field1073 & 0xFF) == 0) {
                if (Statics.field1118) {
                    return method1142(0, ((class64) this.field1087).field1256, arg0, this.field1073, arg1, this.field1070, this.field1071, 0, arg3, arg2, this);
                }
                return method1021(((class64) this.field1087).field1256, arg0, this.field1073, arg1, this.field1069, 0, arg3, arg2, this);
            }
            if (Statics.field1118) {
                return method1026(0, 0, ((class64) this.field1087).field1256, arg0, this.field1073, arg1, this.field1070, this.field1071, 0, arg3, arg2, this, this.field1065, arg4);
            }
            return method1027(0, 0, ((class64) this.field1087).field1256, arg0, this.field1073, arg1, this.field1069, 0, arg3, arg2, this, this.field1065, arg4);
        }
    }

    @ObfuscatedName("ay.ap()Z")
    public boolean method1018() {
        int var1 = this.field1072;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method1112(var1, this.field1068);
            var2 = method1062(var1, this.field1068);
        }
        if (this.field1069 != var1 || this.field1070 != var3 || this.field1071 != var2) {
            if (this.field1069 < var1) {
                this.field1077 = 1;
                this.field1076 = var1 - this.field1069;
            } else if (this.field1069 > var1) {
                this.field1077 = -1;
                this.field1076 = this.field1069 - var1;
            } else {
                this.field1077 = 0;
            }
            if (this.field1070 < var3) {
                this.field1066 = 1;
                if (this.field1076 == 0 || this.field1076 > var3 - this.field1070) {
                    this.field1076 = var3 - this.field1070;
                }
            } else if (this.field1070 > var3) {
                this.field1066 = -1;
                if (this.field1076 == 0 || this.field1076 > this.field1070 - var3) {
                    this.field1076 = this.field1070 - var3;
                }
            } else {
                this.field1066 = 0;
            }
            if (this.field1071 < var2) {
                this.field1078 = 1;
                if (this.field1076 == 0 || this.field1076 > var2 - this.field1071) {
                    this.field1076 = var2 - this.field1071;
                }
            } else if (this.field1071 > var2) {
                this.field1078 = -1;
                if (this.field1076 == 0 || this.field1076 > this.field1071 - var2) {
                    this.field1076 = this.field1071 - var2;
                }
            } else {
                this.field1078 = 0;
            }
            return false;
        } else if (this.field1072 == Integer.MIN_VALUE) {
            this.field1072 = 0;
            this.field1071 = 0;
            this.field1070 = 0;
            this.field1069 = 0;
            this.method3366();
            return true;
        } else {
            this.method995();
            return false;
        }
    }

    @ObfuscatedName("ay.ak([B[IIIIIIILay;)I")
    public static int method1059(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class46 arg8) {
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
        arg8.field1073 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("ay.aw(I[B[IIIIIIIILay;)I")
    public static int method1020(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class46 arg10) {
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
        arg10.field1073 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("ay.av([B[IIIIIIILay;)I")
    public static int method1021(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class46 arg8) {
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
        arg8.field1073 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("ay.ah(I[B[IIIIIIIILay;)I")
    public static int method1142(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class46 arg10) {
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
        arg10.field1073 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("ay.ae(II[B[IIIIIIILay;II)I")
    public static int method1023(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class46 arg10, int arg11, int arg12) {
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
        arg10.field1073 = arg4;
        return arg5;
    }

    @ObfuscatedName("ay.am(II[B[IIIIIIIILay;II)I")
    public static int method1091(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class46 arg11, int arg12, int arg13) {
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
        arg11.field1073 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("ay.aq(II[B[IIIIIIILay;II)I")
    public static int method1027(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class46 arg10, int arg11, int arg12) {
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
        arg10.field1073 = arg4;
        return arg5;
    }

    @ObfuscatedName("ay.ai(II[B[IIIIIIIILay;II)I")
    public static int method1026(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class46 arg11, int arg12, int arg13) {
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
        arg11.field1073 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("ay.an([B[IIIIIIIILay;)I")
    public static int method1063(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class46 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field1070 += (var14 - arg3) * arg9.field1066;
        arg9.field1071 += (var14 - arg3) * arg9.field1078;
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
        arg9.field1069 = var12 >> 2;
        arg9.field1073 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("ay.aa(I[B[IIIIIIIIIILay;)I")
    public static int method1028(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class46 arg12) {
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
        arg12.field1069 += (var19 - arg4) * arg12.field1077;
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
        arg12.field1070 = var15 >> 2;
        arg12.field1071 = var16 >> 2;
        arg12.field1073 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("ay.ad([B[IIIIIIIILay;)I")
    public static int method1029(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class46 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field1070 += (var14 - arg3) * arg9.field1066;
        arg9.field1071 += (var14 - arg3) * arg9.field1078;
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
        arg9.field1069 = var12 >> 2;
        arg9.field1073 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("ay.az(I[B[IIIIIIIIIILay;)I")
    public static int method1030(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class46 arg12) {
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
        arg12.field1069 += (var19 - arg4) * arg12.field1077;
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
        arg12.field1070 = var15 >> 2;
        arg12.field1071 = var16 >> 2;
        arg12.field1073 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("ay.ar(II[B[IIIIIIIILay;II)I")
    public static int method1031(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class46 arg11, int arg12, int arg13) {
        arg11.field1070 -= arg11.field1066 * arg5;
        arg11.field1071 -= arg11.field1078 * arg5;
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
        arg11.field1070 += arg11.field1066 * arg5;
        arg11.field1071 += arg11.field1078 * arg5;
        arg11.field1069 = arg6;
        arg11.field1073 = arg4;
        return arg5;
    }

    @ObfuscatedName("ay.at(II[B[IIIIIIIIIILay;II)I")
    public static int method1032(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class46 arg13, int arg14, int arg15) {
        arg13.field1069 -= arg13.field1077 * arg5;
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
        arg13.field1069 += arg13.field1077 * var27;
        arg13.field1070 = arg6;
        arg13.field1071 = arg7;
        arg13.field1073 = arg4;
        return var27;
    }

    @ObfuscatedName("ay.af(II[B[IIIIIIIILay;II)I")
    public static int method1033(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class46 arg11, int arg12, int arg13) {
        arg11.field1070 -= arg11.field1066 * arg5;
        arg11.field1071 -= arg11.field1078 * arg5;
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
        arg11.field1070 += arg11.field1066 * arg5;
        arg11.field1071 += arg11.field1078 * arg5;
        arg11.field1069 = arg6;
        arg11.field1073 = arg4;
        return arg5;
    }

    @ObfuscatedName("ay.ay(II[B[IIIIIIIIIILay;II)I")
    public static int method1025(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class46 arg13, int arg14, int arg15) {
        arg13.field1069 -= arg13.field1077 * arg5;
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
        arg13.field1069 += arg13.field1077 * var26;
        arg13.field1070 = arg6;
        arg13.field1071 = arg7;
        arg13.field1073 = arg4;
        return var26;
    }
}
