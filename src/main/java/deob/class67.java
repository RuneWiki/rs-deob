package deob;

@ObfuscatedName("bg")
public class class67 extends class69 {

    @ObfuscatedName("bg.f")
    public int field1142;

    @ObfuscatedName("bg.i")
    public int field1139;

    @ObfuscatedName("bg.u")
    public int field1140;

    @ObfuscatedName("bg.h")
    public int field1141;

    @ObfuscatedName("bg.r")
    public int field1148;

    @ObfuscatedName("bg.o")
    public int field1144;

    @ObfuscatedName("bg.l")
    public int field1143;

    @ObfuscatedName("bg.n")
    public int field1145;

    @ObfuscatedName("bg.m")
    public int field1138;

    @ObfuscatedName("bg.j")
    public int field1147;

    @ObfuscatedName("bg.s")
    public boolean field1146;

    @ObfuscatedName("bg.q")
    public int field1149;

    @ObfuscatedName("bg.d")
    public int field1150;

    @ObfuscatedName("bg.p")
    public int field1151;

    @ObfuscatedName("bg.y")
    public int field1152;

    @ObfuscatedName("bg.f(II)I")
    public static int method1253(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("bg.i(II)I")
    public static int method1161(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("bg.as()I")
    public int method1162() {
        int var1 = this.field1148 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field1145 == 0) {
            var2 -= this.field1142 * var2 / (((class56) this.field1165).field1045.length << 8);
        } else if (this.field1145 >= 0) {
            var2 -= this.field1138 * var2 / ((class56) this.field1165).field1045.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    public class67(class56 arg0, int arg1, int arg2) {
        this.field1165 = arg0;
        this.field1138 = arg0.field1046;
        this.field1147 = arg0.field1047;
        this.field1146 = arg0.field1049;
        this.field1139 = arg1;
        this.field1140 = arg2;
        this.field1141 = 8192;
        this.field1142 = 0;
        this.method1202();
    }

    public class67(class56 arg0, int arg1, int arg2, int arg3) {
        this.field1165 = arg0;
        this.field1138 = arg0.field1046;
        this.field1147 = arg0.field1047;
        this.field1146 = arg0.field1049;
        this.field1139 = arg1;
        this.field1140 = arg2;
        this.field1141 = arg3;
        this.field1142 = 0;
        this.method1202();
    }

    @ObfuscatedName("bg.u(Lbr;II)Lbg;")
    public static class67 method1164(class56 arg0, int arg1, int arg2) {
        return arg0.field1045 == null || arg0.field1045.length == 0 ? null : new class67(arg0, (int) ((long) arg0.field1048 * 256L * (long) arg1 / (long) (Statics.field1078 * 100)), arg2 << 6);
    }

    @ObfuscatedName("bg.r(Lbr;III)Lbg;")
    public static class67 method1206(class56 arg0, int arg1, int arg2, int arg3) {
        return arg0.field1045 == null || arg0.field1045.length == 0 ? null : new class67(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("bg.o()V")
    public void method1202() {
        this.field1148 = this.field1140;
        this.field1144 = method1253(this.field1140, this.field1141);
        this.field1143 = method1161(this.field1140, this.field1141);
    }

    @ObfuscatedName("bg.j(I)V")
    public synchronized void method1169(int arg0) {
        this.field1145 = arg0;
    }

    @ObfuscatedName("bg.q(I)V")
    public synchronized void method1160(int arg0) {
        this.method1184(arg0 << 6, this.method1171());
    }

    @ObfuscatedName("bg.d(I)V")
    public synchronized void method1168(int arg0) {
        this.method1184(arg0, this.method1171());
    }

    @ObfuscatedName("bg.p(II)V")
    public synchronized void method1184(int arg0, int arg1) {
        this.field1140 = arg0;
        this.field1141 = arg1;
        this.field1149 = 0;
        this.method1202();
    }

    @ObfuscatedName("bg.y()I")
    public synchronized int method1277() {
        return this.field1140 == Integer.MIN_VALUE ? 0 : this.field1140;
    }

    @ObfuscatedName("bg.a()I")
    public synchronized int method1171() {
        return this.field1141 < 0 ? -1 : this.field1141;
    }

    @ObfuscatedName("bg.v(I)V")
    public synchronized void method1172(int arg0) {
        int var2 = ((class56) this.field1165).field1045.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field1142 = arg0;
    }

    @ObfuscatedName("bg.z(Z)V")
    public synchronized void method1173(boolean arg0) {
        this.field1139 = (this.field1139 >>> 31) + (this.field1139 ^ this.field1139 >> 31);
        if (arg0) {
            this.field1139 = -this.field1139;
        }
    }

    @ObfuscatedName("bg.x()V")
    public void method1174() {
        if (this.field1149 == 0) {
            return;
        }
        if (this.field1140 == Integer.MIN_VALUE) {
            this.field1140 = 0;
        }
        this.field1149 = 0;
        this.method1202();
    }

    @ObfuscatedName("bg.g(II)V")
    public synchronized void method1175(int arg0, int arg1) {
        this.method1176(arg0, arg1, this.method1171());
    }

    @ObfuscatedName("bg.b(III)V")
    public synchronized void method1176(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method1184(arg1, arg2);
            return;
        }
        int var4 = method1253(arg1, arg2);
        int var5 = method1161(arg1, arg2);
        if (this.field1144 == var4 && this.field1143 == var5) {
            this.field1149 = 0;
            return;
        }
        int var6 = arg1 - this.field1148;
        if (this.field1148 - arg1 > var6) {
            var6 = this.field1148 - arg1;
        }
        if (var4 - this.field1144 > var6) {
            var6 = var4 - this.field1144;
        }
        if (this.field1144 - var4 > var6) {
            var6 = this.field1144 - var4;
        }
        if (var5 - this.field1143 > var6) {
            var6 = var5 - this.field1143;
        }
        if (this.field1143 - var5 > var6) {
            var6 = this.field1143 - var5;
        }
        if (arg0 > var6) {
            arg0 = var6;
        }
        this.field1149 = arg0;
        this.field1140 = arg1;
        this.field1141 = arg2;
        this.field1150 = (arg1 - this.field1148) / arg0;
        this.field1151 = (var4 - this.field1144) / arg0;
        this.field1152 = (var5 - this.field1143) / arg0;
    }

    @ObfuscatedName("bg.k(I)V")
    public synchronized void method1195(int arg0) {
        if (arg0 == 0) {
            this.method1168(0);
            this.method2289();
        } else if (this.field1144 == 0 && this.field1143 == 0) {
            this.field1149 = 0;
            this.field1140 = 0;
            this.field1148 = 0;
            this.method2289();
        } else {
            int var2 = -this.field1148;
            if (this.field1148 > var2) {
                var2 = this.field1148;
            }
            if (-this.field1144 > var2) {
                var2 = -this.field1144;
            }
            if (this.field1144 > var2) {
                var2 = this.field1144;
            }
            if (-this.field1143 > var2) {
                var2 = -this.field1143;
            }
            if (this.field1143 > var2) {
                var2 = this.field1143;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field1149 = arg0;
            this.field1140 = Integer.MIN_VALUE;
            this.field1150 = -this.field1148 / arg0;
            this.field1151 = -this.field1144 / arg0;
            this.field1152 = -this.field1143 / arg0;
        }
    }

    @ObfuscatedName("bg.t(I)V")
    public synchronized void method1226(int arg0) {
        if (this.field1139 < 0) {
            this.field1139 = -arg0;
        } else {
            this.field1139 = arg0;
        }
    }

    @ObfuscatedName("bg.c()I")
    public synchronized int method1178() {
        return this.field1139 < 0 ? -this.field1139 : this.field1139;
    }

    @ObfuscatedName("bg.ap()Z")
    public boolean method1258() {
        return this.field1142 < 0 || this.field1142 >= ((class56) this.field1165).field1045.length << 8;
    }

    @ObfuscatedName("bg.au()Z")
    public boolean method1179() {
        return this.field1149 != 0;
    }

    @ObfuscatedName("bg.l()Lbm;")
    public class69 method936() {
        return null;
    }

    @ObfuscatedName("bg.n()Lbm;")
    public class69 method928() {
        return null;
    }

    @ObfuscatedName("bg.m()I")
    public int method960() {
        return this.field1140 == 0 && this.field1149 == 0 ? 0 : 1;
    }

    @ObfuscatedName("bg.w([III)V")
    public synchronized void method930(int[] arg0, int arg1, int arg2) {
        if (this.field1140 == 0 && this.field1149 == 0) {
            this.method929(arg2);
            return;
        }
        class56 var4 = (class56) this.field1165;
        int var5 = this.field1138 << 8;
        int var6 = this.field1147 << 8;
        int var7 = var4.field1045.length << 8;
        int var8 = var6 - var5;
        if (var8 <= 0) {
            this.field1145 = 0;
        }
        int var9 = arg1;
        int var10 = arg1 + arg2;
        if (this.field1142 < 0) {
            if (this.field1139 <= 0) {
                this.method1174();
                this.method2289();
                return;
            }
            this.field1142 = 0;
        }
        if (this.field1142 >= var7) {
            if (this.field1139 >= 0) {
                this.method1174();
                this.method2289();
                return;
            }
            this.field1142 = var7 - 1;
        }
        if (this.field1145 >= 0) {
            if (this.field1145 > 0) {
                if (this.field1146) {
                    label131: {
                        if (this.field1139 < 0) {
                            var9 = this.method1186(arg0, arg1, var5, var10, var4.field1045[this.field1138]);
                            if (this.field1142 >= var5) {
                                return;
                            }
                            this.field1142 = var5 + var5 - 1 - this.field1142;
                            this.field1139 = -this.field1139;
                            if (--this.field1145 == 0) {
                                break label131;
                            }
                        }
                        do {
                            var9 = this.method1185(arg0, var9, var6, var10, var4.field1045[this.field1147 - 1]);
                            if (this.field1142 < var6) {
                                return;
                            }
                            this.field1142 = var6 + var6 - 1 - this.field1142;
                            this.field1139 = -this.field1139;
                            if (--this.field1145 == 0) {
                                break;
                            }
                            var9 = this.method1186(arg0, var9, var5, var10, var4.field1045[this.field1138]);
                            if (this.field1142 >= var5) {
                                return;
                            }
                            this.field1142 = var5 + var5 - 1 - this.field1142;
                            this.field1139 = -this.field1139;
                        } while (--this.field1145 != 0);
                    }
                } else if (this.field1139 < 0) {
                    while (true) {
                        var9 = this.method1186(arg0, var9, var5, var10, var4.field1045[this.field1147 - 1]);
                        if (this.field1142 >= var5) {
                            return;
                        }
                        int var12 = (var6 - 1 - this.field1142) / var8;
                        if (var12 >= this.field1145) {
                            this.field1142 += this.field1145 * var8;
                            this.field1145 = 0;
                            break;
                        }
                        this.field1142 += var8 * var12;
                        this.field1145 -= var12;
                    }
                } else {
                    while (true) {
                        var9 = this.method1185(arg0, var9, var6, var10, var4.field1045[this.field1138]);
                        if (this.field1142 < var6) {
                            return;
                        }
                        int var13 = (this.field1142 - var5) / var8;
                        if (var13 >= this.field1145) {
                            this.field1142 -= this.field1145 * var8;
                            this.field1145 = 0;
                            break;
                        }
                        this.field1142 -= var8 * var13;
                        this.field1145 -= var13;
                    }
                }
            }
            if (this.field1139 < 0) {
                this.method1186(arg0, var9, 0, var10, 0);
                if (this.field1142 < 0) {
                    this.field1142 = -1;
                    this.method1174();
                    this.method2289();
                }
            } else {
                this.method1185(arg0, var9, var7, var10, 0);
                if (this.field1142 >= var7) {
                    this.field1142 = var7;
                    this.method1174();
                    this.method2289();
                }
            }
        } else if (this.field1146) {
            if (this.field1139 < 0) {
                var9 = this.method1186(arg0, arg1, var5, var10, var4.field1045[this.field1138]);
                if (this.field1142 >= var5) {
                    return;
                }
                this.field1142 = var5 + var5 - 1 - this.field1142;
                this.field1139 = -this.field1139;
            }
            while (true) {
                int var11 = this.method1185(arg0, var9, var6, var10, var4.field1045[this.field1147 - 1]);
                if (this.field1142 < var6) {
                    return;
                }
                this.field1142 = var6 + var6 - 1 - this.field1142;
                this.field1139 = -this.field1139;
                var9 = this.method1186(arg0, var11, var5, var10, var4.field1045[this.field1138]);
                if (this.field1142 >= var5) {
                    return;
                }
                this.field1142 = var5 + var5 - 1 - this.field1142;
                this.field1139 = -this.field1139;
            }
        } else if (this.field1139 < 0) {
            while (true) {
                var9 = this.method1186(arg0, var9, var5, var10, var4.field1045[this.field1147 - 1]);
                if (this.field1142 >= var5) {
                    return;
                }
                this.field1142 = var6 - 1 - (var6 - 1 - this.field1142) % var8;
            }
        } else {
            while (true) {
                var9 = this.method1185(arg0, var9, var6, var10, var4.field1045[this.field1138]);
                if (this.field1142 < var6) {
                    return;
                }
                this.field1142 = (this.field1142 - var5) % var8 + var5;
            }
        }
    }

    @ObfuscatedName("bg.s(I)V")
    public synchronized void method929(int arg0) {
        if (this.field1149 > 0) {
            if (arg0 >= this.field1149) {
                if (this.field1140 == Integer.MIN_VALUE) {
                    this.field1140 = 0;
                    this.field1143 = 0;
                    this.field1144 = 0;
                    this.field1148 = 0;
                    this.method2289();
                    arg0 = this.field1149;
                }
                this.field1149 = 0;
                this.method1202();
            } else {
                this.field1148 += this.field1150 * arg0;
                this.field1144 += this.field1151 * arg0;
                this.field1143 += this.field1152 * arg0;
                this.field1149 -= arg0;
            }
        }
        class56 var2 = (class56) this.field1165;
        int var3 = this.field1138 << 8;
        int var4 = this.field1147 << 8;
        int var5 = var2.field1045.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field1145 = 0;
        }
        if (this.field1142 < 0) {
            if (this.field1139 <= 0) {
                this.method1174();
                this.method2289();
                return;
            }
            this.field1142 = 0;
        }
        if (this.field1142 >= var5) {
            if (this.field1139 >= 0) {
                this.method1174();
                this.method2289();
                return;
            }
            this.field1142 = var5 - 1;
        }
        this.field1142 += this.field1139 * arg0;
        if (this.field1145 >= 0) {
            if (this.field1145 > 0) {
                if (this.field1146) {
                    label121: {
                        if (this.field1139 < 0) {
                            if (this.field1142 >= var3) {
                                return;
                            }
                            this.field1142 = var3 + var3 - 1 - this.field1142;
                            this.field1139 = -this.field1139;
                            if (--this.field1145 == 0) {
                                break label121;
                            }
                        }
                        do {
                            if (this.field1142 < var4) {
                                return;
                            }
                            this.field1142 = var4 + var4 - 1 - this.field1142;
                            this.field1139 = -this.field1139;
                            if (--this.field1145 == 0) {
                                break;
                            }
                            if (this.field1142 >= var3) {
                                return;
                            }
                            this.field1142 = var3 + var3 - 1 - this.field1142;
                            this.field1139 = -this.field1139;
                        } while (--this.field1145 != 0);
                    }
                } else {
                    label153: {
                        if (this.field1139 < 0) {
                            if (this.field1142 >= var3) {
                                return;
                            }
                            int var7 = (var4 - 1 - this.field1142) / var6;
                            if (var7 >= this.field1145) {
                                this.field1142 += this.field1145 * var6;
                                this.field1145 = 0;
                                break label153;
                            }
                            this.field1142 += var6 * var7;
                            this.field1145 -= var7;
                        } else if (this.field1142 >= var4) {
                            int var8 = (this.field1142 - var3) / var6;
                            if (var8 >= this.field1145) {
                                this.field1142 -= this.field1145 * var6;
                                this.field1145 = 0;
                                break label153;
                            }
                            this.field1142 -= var6 * var8;
                            this.field1145 -= var8;
                        } else {
                            return;
                        }
                        return;
                    }
                }
            }
            if (this.field1139 < 0) {
                if (this.field1142 < 0) {
                    this.field1142 = -1;
                    this.method1174();
                    this.method2289();
                }
            } else if (this.field1142 >= var5) {
                this.field1142 = var5;
                this.method1174();
                this.method2289();
            }
        } else if (this.field1146) {
            if (this.field1139 < 0) {
                if (this.field1142 >= var3) {
                    return;
                }
                this.field1142 = var3 + var3 - 1 - this.field1142;
                this.field1139 = -this.field1139;
            }
            while (this.field1142 >= var4) {
                this.field1142 = var4 + var4 - 1 - this.field1142;
                this.field1139 = -this.field1139;
                if (this.field1142 >= var3) {
                    return;
                }
                this.field1142 = var3 + var3 - 1 - this.field1142;
                this.field1139 = -this.field1139;
            }
        } else if (this.field1139 < 0) {
            if (this.field1142 >= var3) {
                return;
            }
            this.field1142 = var4 - 1 - (var4 - 1 - this.field1142) % var6;
        } else if (this.field1142 >= var4) {
            this.field1142 = (this.field1142 - var3) % var6 + var3;
        } else {
            return;
        }
    }

    @ObfuscatedName("bg.ad([IIIII)I")
    public int method1185(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1149 > 0) {
                int var6 = this.field1149 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1149 += arg1;
                if (this.field1139 == 256 && (this.field1142 & 0xFF) == 0) {
                    if (Statics.field1079) {
                        arg1 = method1182(0, ((class56) this.field1165).field1045, arg0, this.field1142, arg1, this.field1144, this.field1143, this.field1151, this.field1152, 0, var6, arg2, this);
                    } else {
                        arg1 = method1194(((class56) this.field1165).field1045, arg0, this.field1142, arg1, this.field1148, this.field1150, 0, var6, arg2, this);
                    }
                } else if (Statics.field1079) {
                    arg1 = method1199(0, 0, ((class56) this.field1165).field1045, arg0, this.field1142, arg1, this.field1144, this.field1143, this.field1151, this.field1152, 0, var6, arg2, this, this.field1139, arg4);
                } else {
                    arg1 = method1198(0, 0, ((class56) this.field1165).field1045, arg0, this.field1142, arg1, this.field1148, this.field1150, 0, var6, arg2, this, this.field1139, arg4);
                }
                this.field1149 -= arg1;
                if (this.field1149 != 0) {
                    return arg1;
                }
                if (!this.method1187()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1139 == 256 && (this.field1142 & 0xFF) == 0) {
                if (Statics.field1079) {
                    return method1165(0, ((class56) this.field1165).field1045, arg0, this.field1142, arg1, this.field1144, this.field1143, 0, arg3, arg2, this);
                }
                return method1188(((class56) this.field1165).field1045, arg0, this.field1142, arg1, this.field1148, 0, arg3, arg2, this);
            }
            if (Statics.field1079) {
                return method1256(0, 0, ((class56) this.field1165).field1045, arg0, this.field1142, arg1, this.field1144, this.field1143, 0, arg3, arg2, this, this.field1139, arg4);
            }
            return method1191(0, 0, ((class56) this.field1165).field1045, arg0, this.field1142, arg1, this.field1148, 0, arg3, arg2, this, this.field1139, arg4);
        }
    }

    @ObfuscatedName("bg.av([IIIII)I")
    public int method1186(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1149 > 0) {
                int var6 = this.field1149 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1149 += arg1;
                if (this.field1139 == -256 && (this.field1142 & 0xFF) == 0) {
                    if (Statics.field1079) {
                        arg1 = method1261(0, ((class56) this.field1165).field1045, arg0, this.field1142, arg1, this.field1144, this.field1143, this.field1151, this.field1152, 0, var6, arg2, this);
                    } else {
                        arg1 = method1196(((class56) this.field1165).field1045, arg0, this.field1142, arg1, this.field1148, this.field1150, 0, var6, arg2, this);
                    }
                } else if (Statics.field1079) {
                    arg1 = method1201(0, 0, ((class56) this.field1165).field1045, arg0, this.field1142, arg1, this.field1144, this.field1143, this.field1151, this.field1152, 0, var6, arg2, this, this.field1139, arg4);
                } else {
                    arg1 = method1200(0, 0, ((class56) this.field1165).field1045, arg0, this.field1142, arg1, this.field1148, this.field1150, 0, var6, arg2, this, this.field1139, arg4);
                }
                this.field1149 -= arg1;
                if (this.field1149 != 0) {
                    return arg1;
                }
                if (!this.method1187()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1139 == -256 && (this.field1142 & 0xFF) == 0) {
                if (Statics.field1079) {
                    return method1190(0, ((class56) this.field1165).field1045, arg0, this.field1142, arg1, this.field1144, this.field1143, 0, arg3, arg2, this);
                }
                return method1189(((class56) this.field1165).field1045, arg0, this.field1142, arg1, this.field1148, 0, arg3, arg2, this);
            }
            if (Statics.field1079) {
                return method1235(0, 0, ((class56) this.field1165).field1045, arg0, this.field1142, arg1, this.field1144, this.field1143, 0, arg3, arg2, this, this.field1139, arg4);
            }
            return method1193(0, 0, ((class56) this.field1165).field1045, arg0, this.field1142, arg1, this.field1148, 0, arg3, arg2, this, this.field1139, arg4);
        }
    }

    @ObfuscatedName("bg.ao()Z")
    public boolean method1187() {
        int var1 = this.field1140;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method1253(var1, this.field1141);
            var2 = method1161(var1, this.field1141);
        }
        if (this.field1148 != var1 || this.field1144 != var3 || this.field1143 != var2) {
            if (this.field1148 < var1) {
                this.field1150 = 1;
                this.field1149 = var1 - this.field1148;
            } else if (this.field1148 > var1) {
                this.field1150 = -1;
                this.field1149 = this.field1148 - var1;
            } else {
                this.field1150 = 0;
            }
            if (this.field1144 < var3) {
                this.field1151 = 1;
                if (this.field1149 == 0 || this.field1149 > var3 - this.field1144) {
                    this.field1149 = var3 - this.field1144;
                }
            } else if (this.field1144 > var3) {
                this.field1151 = -1;
                if (this.field1149 == 0 || this.field1149 > this.field1144 - var3) {
                    this.field1149 = this.field1144 - var3;
                }
            } else {
                this.field1151 = 0;
            }
            if (this.field1143 < var2) {
                this.field1152 = 1;
                if (this.field1149 == 0 || this.field1149 > var2 - this.field1143) {
                    this.field1149 = var2 - this.field1143;
                }
            } else if (this.field1143 > var2) {
                this.field1152 = -1;
                if (this.field1149 == 0 || this.field1149 > this.field1143 - var2) {
                    this.field1149 = this.field1143 - var2;
                }
            } else {
                this.field1152 = 0;
            }
            return false;
        } else if (this.field1140 == Integer.MIN_VALUE) {
            this.field1140 = 0;
            this.field1143 = 0;
            this.field1144 = 0;
            this.field1148 = 0;
            this.method2289();
            return true;
        } else {
            this.method1202();
            return false;
        }
    }

    @ObfuscatedName("bg.ae([B[IIIIIIILbg;)I")
    public static int method1188(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class67 arg8) {
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
        arg8.field1142 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("bg.aa(I[B[IIIIIIIILbg;)I")
    public static int method1165(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class67 arg10) {
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
        arg10.field1142 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("bg.al([B[IIIIIIILbg;)I")
    public static int method1189(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class67 arg8) {
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
        arg8.field1142 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("bg.az(I[B[IIIIIIIILbg;)I")
    public static int method1190(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class67 arg10) {
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
        arg10.field1142 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("bg.ay(II[B[IIIIIIILbg;II)I")
    public static int method1191(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class67 arg10, int arg11, int arg12) {
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
        arg10.field1142 = arg4;
        return arg5;
    }

    @ObfuscatedName("bg.ac(II[B[IIIIIIIILbg;II)I")
    public static int method1256(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class67 arg11, int arg12, int arg13) {
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
        arg11.field1142 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("bg.af(II[B[IIIIIIILbg;II)I")
    public static int method1193(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class67 arg10, int arg11, int arg12) {
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
        arg10.field1142 = arg4;
        return arg5;
    }

    @ObfuscatedName("bg.bc(II[B[IIIIIIIILbg;II)I")
    public static int method1235(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class67 arg11, int arg12, int arg13) {
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
        arg11.field1142 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("bg.bh([B[IIIIIIIILbg;)I")
    public static int method1194(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class67 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field1144 += (var14 - arg3) * arg9.field1151;
        arg9.field1143 += (var14 - arg3) * arg9.field1152;
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
        arg9.field1148 = var12 >> 2;
        arg9.field1142 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("bg.bj(I[B[IIIIIIIIIILbg;)I")
    public static int method1182(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class67 arg12) {
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
        arg12.field1148 += (var19 - arg4) * arg12.field1150;
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
        arg12.field1144 = var15 >> 2;
        arg12.field1143 = var16 >> 2;
        arg12.field1142 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("bg.br([B[IIIIIIIILbg;)I")
    public static int method1196(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class67 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field1144 += (var14 - arg3) * arg9.field1151;
        arg9.field1143 += (var14 - arg3) * arg9.field1152;
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
        arg9.field1148 = var12 >> 2;
        arg9.field1142 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("bg.bk(I[B[IIIIIIIIIILbg;)I")
    public static int method1261(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class67 arg12) {
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
        arg12.field1148 += (var19 - arg4) * arg12.field1150;
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
        arg12.field1144 = var15 >> 2;
        arg12.field1143 = var16 >> 2;
        arg12.field1142 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("bg.bu(II[B[IIIIIIIILbg;II)I")
    public static int method1198(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class67 arg11, int arg12, int arg13) {
        arg11.field1144 -= arg11.field1151 * arg5;
        arg11.field1143 -= arg11.field1152 * arg5;
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
        arg11.field1144 += arg11.field1151 * arg5;
        arg11.field1143 += arg11.field1152 * arg5;
        arg11.field1148 = arg6;
        arg11.field1142 = arg4;
        return arg5;
    }

    @ObfuscatedName("bg.by(II[B[IIIIIIIIIILbg;II)I")
    public static int method1199(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class67 arg13, int arg14, int arg15) {
        arg13.field1148 -= arg13.field1150 * arg5;
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
        arg13.field1148 += arg13.field1150 * var27;
        arg13.field1144 = arg6;
        arg13.field1143 = arg7;
        arg13.field1142 = arg4;
        return var27;
    }

    @ObfuscatedName("bg.bl(II[B[IIIIIIIILbg;II)I")
    public static int method1200(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class67 arg11, int arg12, int arg13) {
        arg11.field1144 -= arg11.field1151 * arg5;
        arg11.field1143 -= arg11.field1152 * arg5;
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
        arg11.field1144 += arg11.field1151 * arg5;
        arg11.field1143 += arg11.field1152 * arg5;
        arg11.field1148 = arg6;
        arg11.field1142 = arg4;
        return arg5;
    }

    @ObfuscatedName("bg.bv(II[B[IIIIIIIIIILbg;II)I")
    public static int method1201(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class67 arg13, int arg14, int arg15) {
        arg13.field1148 -= arg13.field1150 * arg5;
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
        arg13.field1148 += arg13.field1150 * var26;
        arg13.field1144 = arg6;
        arg13.field1143 = arg7;
        arg13.field1142 = arg4;
        return var26;
    }
}
