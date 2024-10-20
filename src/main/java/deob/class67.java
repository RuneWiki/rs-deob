package deob;

@ObfuscatedName("ba")
public class class67 extends class69 {

    @ObfuscatedName("ba.x")
    public int field1130;

    @ObfuscatedName("ba.n")
    public int field1136;

    @ObfuscatedName("ba.g")
    public int field1132;

    @ObfuscatedName("ba.v")
    public int field1133;

    @ObfuscatedName("ba.y")
    public int field1140;

    @ObfuscatedName("ba.p")
    public int field1135;

    @ObfuscatedName("ba.j")
    public int field1144;

    @ObfuscatedName("ba.m")
    public int field1137;

    @ObfuscatedName("ba.a")
    public int field1138;

    @ObfuscatedName("ba.i")
    public int field1134;

    @ObfuscatedName("ba.s")
    public boolean field1131;

    @ObfuscatedName("ba.k")
    public int field1139;

    @ObfuscatedName("ba.f")
    public int field1142;

    @ObfuscatedName("ba.o")
    public int field1143;

    @ObfuscatedName("ba.q")
    public int field1141;

    @ObfuscatedName("ba.x(II)I")
    public static int method1234(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("ba.n(II)I")
    public static int method1301(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("ba.av()I")
    public int method1233() {
        int var1 = this.field1140 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field1137 == 0) {
            var2 -= this.field1130 * var2 / (((class56) this.field1160).field1035.length << 8);
        } else if (this.field1137 >= 0) {
            var2 -= this.field1138 * var2 / ((class56) this.field1160).field1035.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    public class67(class56 arg0, int arg1, int arg2) {
        this.field1160 = arg0;
        this.field1138 = arg0.field1037;
        this.field1134 = arg0.field1034;
        this.field1131 = arg0.field1038;
        this.field1136 = arg1;
        this.field1132 = arg2;
        this.field1133 = 8192;
        this.field1130 = 0;
        this.method1217();
    }

    public class67(class56 arg0, int arg1, int arg2, int arg3) {
        this.field1160 = arg0;
        this.field1138 = arg0.field1037;
        this.field1134 = arg0.field1034;
        this.field1131 = arg0.field1038;
        this.field1136 = arg1;
        this.field1132 = arg2;
        this.field1133 = arg3;
        this.field1130 = 0;
        this.method1217();
    }

    @ObfuscatedName("ba.g(Lbi;II)Lba;")
    public static class67 method1215(class56 arg0, int arg1, int arg2) {
        return arg0.field1035 == null || arg0.field1035.length == 0 ? null : new class67(arg0, (int) ((long) arg0.field1036 * 256L * (long) arg1 / (long) (Statics.field1054 * 100)), arg2 << 6);
    }

    @ObfuscatedName("ba.v(Lbi;III)Lba;")
    public static class67 method1216(class56 arg0, int arg1, int arg2, int arg3) {
        return arg0.field1035 == null || arg0.field1035.length == 0 ? null : new class67(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("ba.y()V")
    public void method1217() {
        this.field1140 = this.field1132;
        this.field1135 = method1234(this.field1132, this.field1133);
        this.field1144 = method1301(this.field1132, this.field1133);
    }

    @ObfuscatedName("ba.f(I)V")
    public synchronized void method1218(int arg0) {
        this.field1137 = arg0;
    }

    @ObfuscatedName("ba.q(I)V")
    public synchronized void method1219(int arg0) {
        this.method1221(arg0 << 6, this.method1223());
    }

    @ObfuscatedName("ba.c(I)V")
    public synchronized void method1220(int arg0) {
        this.method1221(arg0, this.method1223());
    }

    @ObfuscatedName("ba.b(II)V")
    public synchronized void method1221(int arg0, int arg1) {
        this.field1132 = arg0;
        this.field1133 = arg1;
        this.field1139 = 0;
        this.method1217();
    }

    @ObfuscatedName("ba.w()I")
    public synchronized int method1311() {
        return this.field1132 == Integer.MIN_VALUE ? 0 : this.field1132;
    }

    @ObfuscatedName("ba.l()I")
    public synchronized int method1223() {
        return this.field1133 < 0 ? -1 : this.field1133;
    }

    @ObfuscatedName("ba.r(I)V")
    public synchronized void method1279(int arg0) {
        int var2 = ((class56) this.field1160).field1035.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field1130 = arg0;
    }

    @ObfuscatedName("ba.u(Z)V")
    public synchronized void method1224(boolean arg0) {
        this.field1136 = (this.field1136 >>> 31) + (this.field1136 ^ this.field1136 >> 31);
        if (arg0) {
            this.field1136 = -this.field1136;
        }
    }

    @ObfuscatedName("ba.e()V")
    public void method1225() {
        if (this.field1139 == 0) {
            return;
        }
        if (this.field1132 == Integer.MIN_VALUE) {
            this.field1132 = 0;
        }
        this.field1139 = 0;
        this.method1217();
    }

    @ObfuscatedName("ba.h(II)V")
    public synchronized void method1226(int arg0, int arg1) {
        this.method1227(arg0, arg1, this.method1223());
    }

    @ObfuscatedName("ba.d(III)V")
    public synchronized void method1227(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method1221(arg1, arg2);
            return;
        }
        int var4 = method1234(arg1, arg2);
        int var5 = method1301(arg1, arg2);
        if (this.field1135 == var4 && this.field1144 == var5) {
            this.field1139 = 0;
            return;
        }
        int var6 = arg1 - this.field1140;
        if (this.field1140 - arg1 > var6) {
            var6 = this.field1140 - arg1;
        }
        if (var4 - this.field1135 > var6) {
            var6 = var4 - this.field1135;
        }
        if (this.field1135 - var4 > var6) {
            var6 = this.field1135 - var4;
        }
        if (var5 - this.field1144 > var6) {
            var6 = var5 - this.field1144;
        }
        if (this.field1144 - var5 > var6) {
            var6 = this.field1144 - var5;
        }
        if (arg0 > var6) {
            arg0 = var6;
        }
        this.field1139 = arg0;
        this.field1132 = arg1;
        this.field1133 = arg2;
        this.field1142 = (arg1 - this.field1140) / arg0;
        this.field1143 = (var4 - this.field1135) / arg0;
        this.field1141 = (var5 - this.field1144) / arg0;
    }

    @ObfuscatedName("ba.as(I)V")
    public synchronized void method1228(int arg0) {
        if (arg0 == 0) {
            this.method1220(0);
            this.method2327();
        } else if (this.field1135 == 0 && this.field1144 == 0) {
            this.field1139 = 0;
            this.field1132 = 0;
            this.field1140 = 0;
            this.method2327();
        } else {
            int var2 = -this.field1140;
            if (this.field1140 > var2) {
                var2 = this.field1140;
            }
            if (-this.field1135 > var2) {
                var2 = -this.field1135;
            }
            if (this.field1135 > var2) {
                var2 = this.field1135;
            }
            if (-this.field1144 > var2) {
                var2 = -this.field1144;
            }
            if (this.field1144 > var2) {
                var2 = this.field1144;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field1139 = arg0;
            this.field1132 = Integer.MIN_VALUE;
            this.field1142 = -this.field1140 / arg0;
            this.field1143 = -this.field1135 / arg0;
            this.field1141 = -this.field1144 / arg0;
        }
    }

    @ObfuscatedName("ba.ao(I)V")
    public synchronized void method1229(int arg0) {
        if (this.field1136 < 0) {
            this.field1136 = -arg0;
        } else {
            this.field1136 = arg0;
        }
    }

    @ObfuscatedName("ba.ax()I")
    public synchronized int method1230() {
        return this.field1136 < 0 ? -this.field1136 : this.field1136;
    }

    @ObfuscatedName("ba.an()Z")
    public boolean method1231() {
        return this.field1130 < 0 || this.field1130 >= ((class56) this.field1160).field1035.length << 8;
    }

    @ObfuscatedName("ba.aj()Z")
    public boolean method1232() {
        return this.field1139 != 0;
    }

    @ObfuscatedName("ba.p()Lbs;")
    public class69 method982() {
        return null;
    }

    @ObfuscatedName("ba.j()Lbs;")
    public class69 method983() {
        return null;
    }

    @ObfuscatedName("ba.s()I")
    public int method984() {
        return this.field1132 == 0 && this.field1139 == 0 ? 0 : 1;
    }

    @ObfuscatedName("ba.k([III)V")
    public synchronized void method985(int[] arg0, int arg1, int arg2) {
        if (this.field1132 == 0 && this.field1139 == 0) {
            this.method987(arg2);
            return;
        }
        class56 var4 = (class56) this.field1160;
        int var5 = this.field1138 << 8;
        int var6 = this.field1134 << 8;
        int var7 = var4.field1035.length << 8;
        int var8 = var6 - var5;
        if (var8 <= 0) {
            this.field1137 = 0;
        }
        int var9 = arg1;
        int var10 = arg1 + arg2;
        if (this.field1130 < 0) {
            if (this.field1136 <= 0) {
                this.method1225();
                this.method2327();
                return;
            }
            this.field1130 = 0;
        }
        if (this.field1130 >= var7) {
            if (this.field1136 >= 0) {
                this.method1225();
                this.method2327();
                return;
            }
            this.field1130 = var7 - 1;
        }
        if (this.field1137 >= 0) {
            if (this.field1137 > 0) {
                if (this.field1131) {
                    label131: {
                        if (this.field1136 < 0) {
                            var9 = this.method1254(arg0, arg1, var5, var10, var4.field1035[this.field1138]);
                            if (this.field1130 >= var5) {
                                return;
                            }
                            this.field1130 = var5 + var5 - 1 - this.field1130;
                            this.field1136 = -this.field1136;
                            if (--this.field1137 == 0) {
                                break label131;
                            }
                        }
                        do {
                            var9 = this.method1248(arg0, var9, var6, var10, var4.field1035[this.field1134 - 1]);
                            if (this.field1130 < var6) {
                                return;
                            }
                            this.field1130 = var6 + var6 - 1 - this.field1130;
                            this.field1136 = -this.field1136;
                            if (--this.field1137 == 0) {
                                break;
                            }
                            var9 = this.method1254(arg0, var9, var5, var10, var4.field1035[this.field1138]);
                            if (this.field1130 >= var5) {
                                return;
                            }
                            this.field1130 = var5 + var5 - 1 - this.field1130;
                            this.field1136 = -this.field1136;
                        } while (--this.field1137 != 0);
                    }
                } else if (this.field1136 < 0) {
                    while (true) {
                        var9 = this.method1254(arg0, var9, var5, var10, var4.field1035[this.field1134 - 1]);
                        if (this.field1130 >= var5) {
                            return;
                        }
                        int var12 = (var6 - 1 - this.field1130) / var8;
                        if (var12 >= this.field1137) {
                            this.field1130 += this.field1137 * var8;
                            this.field1137 = 0;
                            break;
                        }
                        this.field1130 += var8 * var12;
                        this.field1137 -= var12;
                    }
                } else {
                    while (true) {
                        var9 = this.method1248(arg0, var9, var6, var10, var4.field1035[this.field1138]);
                        if (this.field1130 < var6) {
                            return;
                        }
                        int var13 = (this.field1130 - var5) / var8;
                        if (var13 >= this.field1137) {
                            this.field1130 -= this.field1137 * var8;
                            this.field1137 = 0;
                            break;
                        }
                        this.field1130 -= var8 * var13;
                        this.field1137 -= var13;
                    }
                }
            }
            if (this.field1136 < 0) {
                this.method1254(arg0, var9, 0, var10, 0);
                if (this.field1130 < 0) {
                    this.field1130 = -1;
                    this.method1225();
                    this.method2327();
                }
            } else {
                this.method1248(arg0, var9, var7, var10, 0);
                if (this.field1130 >= var7) {
                    this.field1130 = var7;
                    this.method1225();
                    this.method2327();
                }
            }
        } else if (this.field1131) {
            if (this.field1136 < 0) {
                var9 = this.method1254(arg0, arg1, var5, var10, var4.field1035[this.field1138]);
                if (this.field1130 >= var5) {
                    return;
                }
                this.field1130 = var5 + var5 - 1 - this.field1130;
                this.field1136 = -this.field1136;
            }
            while (true) {
                int var11 = this.method1248(arg0, var9, var6, var10, var4.field1035[this.field1134 - 1]);
                if (this.field1130 < var6) {
                    return;
                }
                this.field1130 = var6 + var6 - 1 - this.field1130;
                this.field1136 = -this.field1136;
                var9 = this.method1254(arg0, var11, var5, var10, var4.field1035[this.field1138]);
                if (this.field1130 >= var5) {
                    return;
                }
                this.field1130 = var5 + var5 - 1 - this.field1130;
                this.field1136 = -this.field1136;
            }
        } else if (this.field1136 < 0) {
            while (true) {
                var9 = this.method1254(arg0, var9, var5, var10, var4.field1035[this.field1134 - 1]);
                if (this.field1130 >= var5) {
                    return;
                }
                this.field1130 = var6 - 1 - (var6 - 1 - this.field1130) % var8;
            }
        } else {
            while (true) {
                var9 = this.method1248(arg0, var9, var6, var10, var4.field1035[this.field1138]);
                if (this.field1130 < var6) {
                    return;
                }
                this.field1130 = (this.field1130 - var5) % var8 + var5;
            }
        }
    }

    @ObfuscatedName("ba.o(I)V")
    public synchronized void method987(int arg0) {
        if (this.field1139 > 0) {
            if (arg0 >= this.field1139) {
                if (this.field1132 == Integer.MIN_VALUE) {
                    this.field1132 = 0;
                    this.field1144 = 0;
                    this.field1135 = 0;
                    this.field1140 = 0;
                    this.method2327();
                    arg0 = this.field1139;
                }
                this.field1139 = 0;
                this.method1217();
            } else {
                this.field1140 += this.field1142 * arg0;
                this.field1135 += this.field1143 * arg0;
                this.field1144 += this.field1141 * arg0;
                this.field1139 -= arg0;
            }
        }
        class56 var2 = (class56) this.field1160;
        int var3 = this.field1138 << 8;
        int var4 = this.field1134 << 8;
        int var5 = var2.field1035.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field1137 = 0;
        }
        if (this.field1130 < 0) {
            if (this.field1136 <= 0) {
                this.method1225();
                this.method2327();
                return;
            }
            this.field1130 = 0;
        }
        if (this.field1130 >= var5) {
            if (this.field1136 >= 0) {
                this.method1225();
                this.method2327();
                return;
            }
            this.field1130 = var5 - 1;
        }
        this.field1130 += this.field1136 * arg0;
        if (this.field1137 >= 0) {
            if (this.field1137 > 0) {
                if (this.field1131) {
                    label121: {
                        if (this.field1136 < 0) {
                            if (this.field1130 >= var3) {
                                return;
                            }
                            this.field1130 = var3 + var3 - 1 - this.field1130;
                            this.field1136 = -this.field1136;
                            if (--this.field1137 == 0) {
                                break label121;
                            }
                        }
                        do {
                            if (this.field1130 < var4) {
                                return;
                            }
                            this.field1130 = var4 + var4 - 1 - this.field1130;
                            this.field1136 = -this.field1136;
                            if (--this.field1137 == 0) {
                                break;
                            }
                            if (this.field1130 >= var3) {
                                return;
                            }
                            this.field1130 = var3 + var3 - 1 - this.field1130;
                            this.field1136 = -this.field1136;
                        } while (--this.field1137 != 0);
                    }
                } else {
                    label153: {
                        if (this.field1136 < 0) {
                            if (this.field1130 >= var3) {
                                return;
                            }
                            int var7 = (var4 - 1 - this.field1130) / var6;
                            if (var7 >= this.field1137) {
                                this.field1130 += this.field1137 * var6;
                                this.field1137 = 0;
                                break label153;
                            }
                            this.field1130 += var6 * var7;
                            this.field1137 -= var7;
                        } else if (this.field1130 >= var4) {
                            int var8 = (this.field1130 - var3) / var6;
                            if (var8 >= this.field1137) {
                                this.field1130 -= this.field1137 * var6;
                                this.field1137 = 0;
                                break label153;
                            }
                            this.field1130 -= var6 * var8;
                            this.field1137 -= var8;
                        } else {
                            return;
                        }
                        return;
                    }
                }
            }
            if (this.field1136 < 0) {
                if (this.field1130 < 0) {
                    this.field1130 = -1;
                    this.method1225();
                    this.method2327();
                }
            } else if (this.field1130 >= var5) {
                this.field1130 = var5;
                this.method1225();
                this.method2327();
            }
        } else if (this.field1131) {
            if (this.field1136 < 0) {
                if (this.field1130 >= var3) {
                    return;
                }
                this.field1130 = var3 + var3 - 1 - this.field1130;
                this.field1136 = -this.field1136;
            }
            while (this.field1130 >= var4) {
                this.field1130 = var4 + var4 - 1 - this.field1130;
                this.field1136 = -this.field1136;
                if (this.field1130 >= var3) {
                    return;
                }
                this.field1130 = var3 + var3 - 1 - this.field1130;
                this.field1136 = -this.field1136;
            }
        } else if (this.field1136 < 0) {
            if (this.field1130 >= var3) {
                return;
            }
            this.field1130 = var4 - 1 - (var4 - 1 - this.field1130) % var6;
        } else if (this.field1130 >= var4) {
            this.field1130 = (this.field1130 - var3) % var6 + var3;
        } else {
            return;
        }
    }

    @ObfuscatedName("ba.ar([IIIII)I")
    public int method1248(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1139 > 0) {
                int var6 = this.field1139 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1139 += arg1;
                if (this.field1136 == 256 && (this.field1130 & 0xFF) == 0) {
                    if (Statics.field1060) {
                        arg1 = method1246(0, ((class56) this.field1160).field1035, arg0, this.field1130, arg1, this.field1135, this.field1144, this.field1143, this.field1141, 0, var6, arg2, this);
                    } else {
                        arg1 = method1247(((class56) this.field1160).field1035, arg0, this.field1130, arg1, this.field1140, this.field1142, 0, var6, arg2, this);
                    }
                } else if (Statics.field1060) {
                    arg1 = method1251(0, 0, ((class56) this.field1160).field1035, arg0, this.field1130, arg1, this.field1135, this.field1144, this.field1143, this.field1141, 0, var6, arg2, this, this.field1136, arg4);
                } else {
                    arg1 = method1344(0, 0, ((class56) this.field1160).field1035, arg0, this.field1130, arg1, this.field1140, this.field1142, 0, var6, arg2, this, this.field1136, arg4);
                }
                this.field1139 -= arg1;
                if (this.field1139 != 0) {
                    return arg1;
                }
                if (!this.method1238()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1136 == 256 && (this.field1130 & 0xFF) == 0) {
                if (Statics.field1060) {
                    return method1235(0, ((class56) this.field1160).field1035, arg0, this.field1130, arg1, this.field1135, this.field1144, 0, arg3, arg2, this);
                }
                return method1318(((class56) this.field1160).field1035, arg0, this.field1130, arg1, this.field1140, 0, arg3, arg2, this);
            }
            if (Statics.field1060) {
                return method1244(0, 0, ((class56) this.field1160).field1035, arg0, this.field1130, arg1, this.field1135, this.field1144, 0, arg3, arg2, this, this.field1136, arg4);
            }
            return method1338(0, 0, ((class56) this.field1160).field1035, arg0, this.field1130, arg1, this.field1140, 0, arg3, arg2, this, this.field1136, arg4);
        }
    }

    @ObfuscatedName("ba.az([IIIII)I")
    public int method1254(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1139 > 0) {
                int var6 = this.field1139 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1139 += arg1;
                if (this.field1136 == -256 && (this.field1130 & 0xFF) == 0) {
                    if (Statics.field1060) {
                        arg1 = method1249(0, ((class56) this.field1160).field1035, arg0, this.field1130, arg1, this.field1135, this.field1144, this.field1143, this.field1141, 0, var6, arg2, this);
                    } else {
                        arg1 = method1310(((class56) this.field1160).field1035, arg0, this.field1130, arg1, this.field1140, this.field1142, 0, var6, arg2, this);
                    }
                } else if (Statics.field1060) {
                    arg1 = method1253(0, 0, ((class56) this.field1160).field1035, arg0, this.field1130, arg1, this.field1135, this.field1144, this.field1143, this.field1141, 0, var6, arg2, this, this.field1136, arg4);
                } else {
                    arg1 = method1252(0, 0, ((class56) this.field1160).field1035, arg0, this.field1130, arg1, this.field1140, this.field1142, 0, var6, arg2, this, this.field1136, arg4);
                }
                this.field1139 -= arg1;
                if (this.field1139 != 0) {
                    return arg1;
                }
                if (!this.method1238()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1136 == -256 && (this.field1130 & 0xFF) == 0) {
                if (Statics.field1060) {
                    return method1242(0, ((class56) this.field1160).field1035, arg0, this.field1130, arg1, this.field1135, this.field1144, 0, arg3, arg2, this);
                }
                return method1241(((class56) this.field1160).field1035, arg0, this.field1130, arg1, this.field1140, 0, arg3, arg2, this);
            }
            if (Statics.field1060) {
                return method1345(0, 0, ((class56) this.field1160).field1035, arg0, this.field1130, arg1, this.field1135, this.field1144, 0, arg3, arg2, this, this.field1136, arg4);
            }
            return method1343(0, 0, ((class56) this.field1160).field1035, arg0, this.field1130, arg1, this.field1140, 0, arg3, arg2, this, this.field1136, arg4);
        }
    }

    @ObfuscatedName("ba.ap()Z")
    public boolean method1238() {
        int var1 = this.field1132;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method1234(var1, this.field1133);
            var2 = method1301(var1, this.field1133);
        }
        if (this.field1140 != var1 || this.field1135 != var3 || this.field1144 != var2) {
            if (this.field1140 < var1) {
                this.field1142 = 1;
                this.field1139 = var1 - this.field1140;
            } else if (this.field1140 > var1) {
                this.field1142 = -1;
                this.field1139 = this.field1140 - var1;
            } else {
                this.field1142 = 0;
            }
            if (this.field1135 < var3) {
                this.field1143 = 1;
                if (this.field1139 == 0 || this.field1139 > var3 - this.field1135) {
                    this.field1139 = var3 - this.field1135;
                }
            } else if (this.field1135 > var3) {
                this.field1143 = -1;
                if (this.field1139 == 0 || this.field1139 > this.field1135 - var3) {
                    this.field1139 = this.field1135 - var3;
                }
            } else {
                this.field1143 = 0;
            }
            if (this.field1144 < var2) {
                this.field1141 = 1;
                if (this.field1139 == 0 || this.field1139 > var2 - this.field1144) {
                    this.field1139 = var2 - this.field1144;
                }
            } else if (this.field1144 > var2) {
                this.field1141 = -1;
                if (this.field1139 == 0 || this.field1139 > this.field1144 - var2) {
                    this.field1139 = this.field1144 - var2;
                }
            } else {
                this.field1141 = 0;
            }
            return false;
        } else if (this.field1132 == Integer.MIN_VALUE) {
            this.field1132 = 0;
            this.field1144 = 0;
            this.field1135 = 0;
            this.field1140 = 0;
            this.method2327();
            return true;
        } else {
            this.method1217();
            return false;
        }
    }

    @ObfuscatedName("ba.aw([B[IIIIIIILba;)I")
    public static int method1318(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class67 arg8) {
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
        arg8.field1130 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("ba.ay(I[B[IIIIIIIILba;)I")
    public static int method1235(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class67 arg10) {
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
        arg10.field1130 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("ba.ai([B[IIIIIIILba;)I")
    public static int method1241(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class67 arg8) {
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
        arg8.field1130 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("ba.at(I[B[IIIIIIIILba;)I")
    public static int method1242(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class67 arg10) {
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
        arg10.field1130 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("ba.ah(II[B[IIIIIIILba;II)I")
    public static int method1338(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class67 arg10, int arg11, int arg12) {
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
        arg10.field1130 = arg4;
        return arg5;
    }

    @ObfuscatedName("ba.am(II[B[IIIIIIIILba;II)I")
    public static int method1244(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class67 arg11, int arg12, int arg13) {
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
        arg11.field1130 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("ba.ak(II[B[IIIIIIILba;II)I")
    public static int method1343(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class67 arg10, int arg11, int arg12) {
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
        arg10.field1130 = arg4;
        return arg5;
    }

    @ObfuscatedName("ba.by(II[B[IIIIIIIILba;II)I")
    public static int method1345(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class67 arg11, int arg12, int arg13) {
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
        arg11.field1130 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("ba.bf([B[IIIIIIIILba;)I")
    public static int method1247(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class67 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field1135 += (var14 - arg3) * arg9.field1143;
        arg9.field1144 += (var14 - arg3) * arg9.field1141;
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
        arg9.field1140 = var12 >> 2;
        arg9.field1130 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("ba.bj(I[B[IIIIIIIIIILba;)I")
    public static int method1246(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class67 arg12) {
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
        arg12.field1140 += (var19 - arg4) * arg12.field1142;
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
        arg12.field1135 = var15 >> 2;
        arg12.field1144 = var16 >> 2;
        arg12.field1130 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("ba.bi([B[IIIIIIIILba;)I")
    public static int method1310(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class67 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field1135 += (var14 - arg3) * arg9.field1143;
        arg9.field1144 += (var14 - arg3) * arg9.field1141;
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
        arg9.field1140 = var12 >> 2;
        arg9.field1130 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("ba.br(I[B[IIIIIIIIIILba;)I")
    public static int method1249(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class67 arg12) {
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
        arg12.field1140 += (var19 - arg4) * arg12.field1142;
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
        arg12.field1135 = var15 >> 2;
        arg12.field1144 = var16 >> 2;
        arg12.field1130 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("ba.bn(II[B[IIIIIIIILba;II)I")
    public static int method1344(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class67 arg11, int arg12, int arg13) {
        arg11.field1135 -= arg11.field1143 * arg5;
        arg11.field1144 -= arg11.field1141 * arg5;
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
        arg11.field1135 += arg11.field1143 * arg5;
        arg11.field1144 += arg11.field1141 * arg5;
        arg11.field1140 = arg6;
        arg11.field1130 = arg4;
        return arg5;
    }

    @ObfuscatedName("ba.bx(II[B[IIIIIIIIIILba;II)I")
    public static int method1251(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class67 arg13, int arg14, int arg15) {
        arg13.field1140 -= arg13.field1142 * arg5;
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
        arg13.field1140 += arg13.field1142 * var27;
        arg13.field1135 = arg6;
        arg13.field1144 = arg7;
        arg13.field1130 = arg4;
        return var27;
    }

    @ObfuscatedName("ba.bl(II[B[IIIIIIIILba;II)I")
    public static int method1252(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class67 arg11, int arg12, int arg13) {
        arg11.field1135 -= arg11.field1143 * arg5;
        arg11.field1144 -= arg11.field1141 * arg5;
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
        arg11.field1135 += arg11.field1143 * arg5;
        arg11.field1144 += arg11.field1141 * arg5;
        arg11.field1140 = arg6;
        arg11.field1130 = arg4;
        return arg5;
    }

    @ObfuscatedName("ba.be(II[B[IIIIIIIIIILba;II)I")
    public static int method1253(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class67 arg13, int arg14, int arg15) {
        arg13.field1140 -= arg13.field1142 * arg5;
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
        arg13.field1140 += arg13.field1142 * var26;
        arg13.field1135 = arg6;
        arg13.field1144 = arg7;
        arg13.field1130 = arg4;
        return var26;
    }
}
