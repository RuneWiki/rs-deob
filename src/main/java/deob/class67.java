package deob;

@ObfuscatedName("bg")
public class class67 extends class69 {

    @ObfuscatedName("bg.q")
    public int field1144;

    @ObfuscatedName("bg.d")
    public int field1131;

    @ObfuscatedName("bg.h")
    public int field1132;

    @ObfuscatedName("bg.p")
    public int field1133;

    @ObfuscatedName("bg.j")
    public int field1139;

    @ObfuscatedName("bg.n")
    public int field1130;

    @ObfuscatedName("bg.r")
    public int field1136;

    @ObfuscatedName("bg.c")
    public int field1137;

    @ObfuscatedName("bg.i")
    public int field1138;

    @ObfuscatedName("bg.o")
    public int field1135;

    @ObfuscatedName("bg.m")
    public boolean field1140;

    @ObfuscatedName("bg.s")
    public int field1141;

    @ObfuscatedName("bg.u")
    public int field1134;

    @ObfuscatedName("bg.b")
    public int field1143;

    @ObfuscatedName("bg.v")
    public int field1142;

    @ObfuscatedName("bg.q(II)I")
    public static int method1279(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("bg.d(II)I")
    public static int method1197(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("bg.an()I")
    public int method1198() {
        int var1 = this.field1139 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field1137 == 0) {
            var2 -= this.field1144 * var2 / (((class56) this.field1157).field1045.length << 8);
        } else if (this.field1137 >= 0) {
            var2 -= this.field1138 * var2 / ((class56) this.field1157).field1045.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    public class67(class56 arg0, int arg1, int arg2) {
        this.field1157 = arg0;
        this.field1138 = arg0.field1047;
        this.field1135 = arg0.field1044;
        this.field1140 = arg0.field1048;
        this.field1131 = arg1;
        this.field1132 = arg2;
        this.field1133 = 8192;
        this.field1144 = 0;
        this.method1294();
    }

    public class67(class56 arg0, int arg1, int arg2, int arg3) {
        this.field1157 = arg0;
        this.field1138 = arg0.field1047;
        this.field1135 = arg0.field1044;
        this.field1140 = arg0.field1048;
        this.field1131 = arg1;
        this.field1132 = arg2;
        this.field1133 = arg3;
        this.field1144 = 0;
        this.method1294();
    }

    @ObfuscatedName("bg.h(Lbj;II)Lbg;")
    public static class67 method1200(class56 arg0, int arg1, int arg2) {
        return arg0.field1045 == null || arg0.field1045.length == 0 ? null : new class67(arg0, (int) ((long) arg0.field1046 * 256L * (long) arg1 / (long) (Statics.field1062 * 100)), arg2 << 6);
    }

    @ObfuscatedName("bg.p(Lbj;III)Lbg;")
    public static class67 method1201(class56 arg0, int arg1, int arg2, int arg3) {
        return arg0.field1045 == null || arg0.field1045.length == 0 ? null : new class67(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("bg.j()V")
    public void method1294() {
        this.field1139 = this.field1132;
        this.field1130 = method1279(this.field1132, this.field1133);
        this.field1136 = method1197(this.field1132, this.field1133);
    }

    @ObfuscatedName("bg.u(I)V")
    public synchronized void method1208(int arg0) {
        this.field1137 = arg0;
    }

    @ObfuscatedName("bg.v(I)V")
    public synchronized void method1202(int arg0) {
        this.method1206(arg0 << 6, this.method1236());
    }

    @ObfuscatedName("bg.f(I)V")
    public synchronized void method1205(int arg0) {
        this.method1206(arg0, this.method1236());
    }

    @ObfuscatedName("bg.z(II)V")
    public synchronized void method1206(int arg0, int arg1) {
        this.field1132 = arg0;
        this.field1133 = arg1;
        this.field1141 = 0;
        this.method1294();
    }

    @ObfuscatedName("bg.t()I")
    public synchronized int method1223() {
        return this.field1132 == Integer.MIN_VALUE ? 0 : this.field1132;
    }

    @ObfuscatedName("bg.y()I")
    public synchronized int method1236() {
        return this.field1133 < 0 ? -1 : this.field1133;
    }

    @ObfuscatedName("bg.w(I)V")
    public synchronized void method1209(int arg0) {
        int var2 = ((class56) this.field1157).field1045.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field1144 = arg0;
    }

    @ObfuscatedName("bg.a(Z)V")
    public synchronized void method1210(boolean arg0) {
        this.field1131 = (this.field1131 >>> 31) + (this.field1131 ^ this.field1131 >> 31);
        if (arg0) {
            this.field1131 = -this.field1131;
        }
    }

    @ObfuscatedName("bg.k()V")
    public void method1231() {
        if (this.field1141 == 0) {
            return;
        }
        if (this.field1132 == Integer.MIN_VALUE) {
            this.field1132 = 0;
        }
        this.field1141 = 0;
        this.method1294();
    }

    @ObfuscatedName("bg.l(II)V")
    public synchronized void method1211(int arg0, int arg1) {
        this.method1212(arg0, arg1, this.method1236());
    }

    @ObfuscatedName("bg.x(III)V")
    public synchronized void method1212(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method1206(arg1, arg2);
            return;
        }
        int var4 = method1279(arg1, arg2);
        int var5 = method1197(arg1, arg2);
        if (this.field1130 == var4 && this.field1136 == var5) {
            this.field1141 = 0;
            return;
        }
        int var6 = arg1 - this.field1139;
        if (this.field1139 - arg1 > var6) {
            var6 = this.field1139 - arg1;
        }
        if (var4 - this.field1130 > var6) {
            var6 = var4 - this.field1130;
        }
        if (this.field1130 - var4 > var6) {
            var6 = this.field1130 - var4;
        }
        if (var5 - this.field1136 > var6) {
            var6 = var5 - this.field1136;
        }
        if (this.field1136 - var5 > var6) {
            var6 = this.field1136 - var5;
        }
        if (arg0 > var6) {
            arg0 = var6;
        }
        this.field1141 = arg0;
        this.field1132 = arg1;
        this.field1133 = arg2;
        this.field1134 = (arg1 - this.field1139) / arg0;
        this.field1143 = (var4 - this.field1130) / arg0;
        this.field1142 = (var5 - this.field1136) / arg0;
    }

    @ObfuscatedName("bg.g(I)V")
    public synchronized void method1268(int arg0) {
        if (arg0 == 0) {
            this.method1205(0);
            this.method2310();
        } else if (this.field1130 == 0 && this.field1136 == 0) {
            this.field1141 = 0;
            this.field1132 = 0;
            this.field1139 = 0;
            this.method2310();
        } else {
            int var2 = -this.field1139;
            if (this.field1139 > var2) {
                var2 = this.field1139;
            }
            if (-this.field1130 > var2) {
                var2 = -this.field1130;
            }
            if (this.field1130 > var2) {
                var2 = this.field1130;
            }
            if (-this.field1136 > var2) {
                var2 = -this.field1136;
            }
            if (this.field1136 > var2) {
                var2 = this.field1136;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field1141 = arg0;
            this.field1132 = Integer.MIN_VALUE;
            this.field1134 = -this.field1139 / arg0;
            this.field1143 = -this.field1130 / arg0;
            this.field1142 = -this.field1136 / arg0;
        }
    }

    @ObfuscatedName("bg.e(I)V")
    public synchronized void method1214(int arg0) {
        if (this.field1131 < 0) {
            this.field1131 = -arg0;
        } else {
            this.field1131 = arg0;
        }
    }

    @ObfuscatedName("bg.ae()I")
    public synchronized int method1290() {
        return this.field1131 < 0 ? -this.field1131 : this.field1131;
    }

    @ObfuscatedName("bg.aq()Z")
    public boolean method1281() {
        return this.field1144 < 0 || this.field1144 >= ((class56) this.field1157).field1045.length << 8;
    }

    @ObfuscatedName("bg.as()Z")
    public boolean method1217() {
        return this.field1141 != 0;
    }

    @ObfuscatedName("bg.n()Lbs;")
    public class69 method984() {
        return null;
    }

    @ObfuscatedName("bg.c()Lbs;")
    public class69 method974() {
        return null;
    }

    @ObfuscatedName("bg.o()I")
    public int method990() {
        return this.field1132 == 0 && this.field1141 == 0 ? 0 : 1;
    }

    @ObfuscatedName("bg.s([III)V")
    public synchronized void method976(int[] arg0, int arg1, int arg2) {
        if (this.field1132 == 0 && this.field1141 == 0) {
            this.method978(arg2);
            return;
        }
        class56 var4 = (class56) this.field1157;
        int var5 = this.field1138 << 8;
        int var6 = this.field1135 << 8;
        int var7 = var4.field1045.length << 8;
        int var8 = var6 - var5;
        if (var8 <= 0) {
            this.field1137 = 0;
        }
        int var9 = arg1;
        int var10 = arg1 + arg2;
        if (this.field1144 < 0) {
            if (this.field1131 <= 0) {
                this.method1231();
                this.method2310();
                return;
            }
            this.field1144 = 0;
        }
        if (this.field1144 >= var7) {
            if (this.field1131 >= 0) {
                this.method1231();
                this.method2310();
                return;
            }
            this.field1144 = var7 - 1;
        }
        if (this.field1137 >= 0) {
            if (this.field1137 > 0) {
                if (this.field1140) {
                    label131: {
                        if (this.field1131 < 0) {
                            var9 = this.method1220(arg0, arg1, var5, var10, var4.field1045[this.field1138]);
                            if (this.field1144 >= var5) {
                                return;
                            }
                            this.field1144 = var5 + var5 - 1 - this.field1144;
                            this.field1131 = -this.field1131;
                            if (--this.field1137 == 0) {
                                break label131;
                            }
                        }
                        do {
                            var9 = this.method1218(arg0, var9, var6, var10, var4.field1045[this.field1135 - 1]);
                            if (this.field1144 < var6) {
                                return;
                            }
                            this.field1144 = var6 + var6 - 1 - this.field1144;
                            this.field1131 = -this.field1131;
                            if (--this.field1137 == 0) {
                                break;
                            }
                            var9 = this.method1220(arg0, var9, var5, var10, var4.field1045[this.field1138]);
                            if (this.field1144 >= var5) {
                                return;
                            }
                            this.field1144 = var5 + var5 - 1 - this.field1144;
                            this.field1131 = -this.field1131;
                        } while (--this.field1137 != 0);
                    }
                } else if (this.field1131 < 0) {
                    while (true) {
                        var9 = this.method1220(arg0, var9, var5, var10, var4.field1045[this.field1135 - 1]);
                        if (this.field1144 >= var5) {
                            return;
                        }
                        int var12 = (var6 - 1 - this.field1144) / var8;
                        if (var12 >= this.field1137) {
                            this.field1144 += this.field1137 * var8;
                            this.field1137 = 0;
                            break;
                        }
                        this.field1144 += var8 * var12;
                        this.field1137 -= var12;
                    }
                } else {
                    while (true) {
                        var9 = this.method1218(arg0, var9, var6, var10, var4.field1045[this.field1138]);
                        if (this.field1144 < var6) {
                            return;
                        }
                        int var13 = (this.field1144 - var5) / var8;
                        if (var13 >= this.field1137) {
                            this.field1144 -= this.field1137 * var8;
                            this.field1137 = 0;
                            break;
                        }
                        this.field1144 -= var8 * var13;
                        this.field1137 -= var13;
                    }
                }
            }
            if (this.field1131 < 0) {
                this.method1220(arg0, var9, 0, var10, 0);
                if (this.field1144 < 0) {
                    this.field1144 = -1;
                    this.method1231();
                    this.method2310();
                }
            } else {
                this.method1218(arg0, var9, var7, var10, 0);
                if (this.field1144 >= var7) {
                    this.field1144 = var7;
                    this.method1231();
                    this.method2310();
                }
            }
        } else if (this.field1140) {
            if (this.field1131 < 0) {
                var9 = this.method1220(arg0, arg1, var5, var10, var4.field1045[this.field1138]);
                if (this.field1144 >= var5) {
                    return;
                }
                this.field1144 = var5 + var5 - 1 - this.field1144;
                this.field1131 = -this.field1131;
            }
            while (true) {
                int var11 = this.method1218(arg0, var9, var6, var10, var4.field1045[this.field1135 - 1]);
                if (this.field1144 < var6) {
                    return;
                }
                this.field1144 = var6 + var6 - 1 - this.field1144;
                this.field1131 = -this.field1131;
                var9 = this.method1220(arg0, var11, var5, var10, var4.field1045[this.field1138]);
                if (this.field1144 >= var5) {
                    return;
                }
                this.field1144 = var5 + var5 - 1 - this.field1144;
                this.field1131 = -this.field1131;
            }
        } else if (this.field1131 < 0) {
            while (true) {
                var9 = this.method1220(arg0, var9, var5, var10, var4.field1045[this.field1135 - 1]);
                if (this.field1144 >= var5) {
                    return;
                }
                this.field1144 = var6 - 1 - (var6 - 1 - this.field1144) % var8;
            }
        } else {
            while (true) {
                var9 = this.method1218(arg0, var9, var6, var10, var4.field1045[this.field1138]);
                if (this.field1144 < var6) {
                    return;
                }
                this.field1144 = (this.field1144 - var5) % var8 + var5;
            }
        }
    }

    @ObfuscatedName("bg.b(I)V")
    public synchronized void method978(int arg0) {
        if (this.field1141 > 0) {
            if (arg0 >= this.field1141) {
                if (this.field1132 == Integer.MIN_VALUE) {
                    this.field1132 = 0;
                    this.field1136 = 0;
                    this.field1130 = 0;
                    this.field1139 = 0;
                    this.method2310();
                    arg0 = this.field1141;
                }
                this.field1141 = 0;
                this.method1294();
            } else {
                this.field1139 += this.field1134 * arg0;
                this.field1130 += this.field1143 * arg0;
                this.field1136 += this.field1142 * arg0;
                this.field1141 -= arg0;
            }
        }
        class56 var2 = (class56) this.field1157;
        int var3 = this.field1138 << 8;
        int var4 = this.field1135 << 8;
        int var5 = var2.field1045.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field1137 = 0;
        }
        if (this.field1144 < 0) {
            if (this.field1131 <= 0) {
                this.method1231();
                this.method2310();
                return;
            }
            this.field1144 = 0;
        }
        if (this.field1144 >= var5) {
            if (this.field1131 >= 0) {
                this.method1231();
                this.method2310();
                return;
            }
            this.field1144 = var5 - 1;
        }
        this.field1144 += this.field1131 * arg0;
        if (this.field1137 >= 0) {
            if (this.field1137 > 0) {
                if (this.field1140) {
                    label121: {
                        if (this.field1131 < 0) {
                            if (this.field1144 >= var3) {
                                return;
                            }
                            this.field1144 = var3 + var3 - 1 - this.field1144;
                            this.field1131 = -this.field1131;
                            if (--this.field1137 == 0) {
                                break label121;
                            }
                        }
                        do {
                            if (this.field1144 < var4) {
                                return;
                            }
                            this.field1144 = var4 + var4 - 1 - this.field1144;
                            this.field1131 = -this.field1131;
                            if (--this.field1137 == 0) {
                                break;
                            }
                            if (this.field1144 >= var3) {
                                return;
                            }
                            this.field1144 = var3 + var3 - 1 - this.field1144;
                            this.field1131 = -this.field1131;
                        } while (--this.field1137 != 0);
                    }
                } else {
                    label153: {
                        if (this.field1131 < 0) {
                            if (this.field1144 >= var3) {
                                return;
                            }
                            int var7 = (var4 - 1 - this.field1144) / var6;
                            if (var7 >= this.field1137) {
                                this.field1144 += this.field1137 * var6;
                                this.field1137 = 0;
                                break label153;
                            }
                            this.field1144 += var6 * var7;
                            this.field1137 -= var7;
                        } else if (this.field1144 >= var4) {
                            int var8 = (this.field1144 - var3) / var6;
                            if (var8 >= this.field1137) {
                                this.field1144 -= this.field1137 * var6;
                                this.field1137 = 0;
                                break label153;
                            }
                            this.field1144 -= var6 * var8;
                            this.field1137 -= var8;
                        } else {
                            return;
                        }
                        return;
                    }
                }
            }
            if (this.field1131 < 0) {
                if (this.field1144 < 0) {
                    this.field1144 = -1;
                    this.method1231();
                    this.method2310();
                }
            } else if (this.field1144 >= var5) {
                this.field1144 = var5;
                this.method1231();
                this.method2310();
            }
        } else if (this.field1140) {
            if (this.field1131 < 0) {
                if (this.field1144 >= var3) {
                    return;
                }
                this.field1144 = var3 + var3 - 1 - this.field1144;
                this.field1131 = -this.field1131;
            }
            while (this.field1144 >= var4) {
                this.field1144 = var4 + var4 - 1 - this.field1144;
                this.field1131 = -this.field1131;
                if (this.field1144 >= var3) {
                    return;
                }
                this.field1144 = var3 + var3 - 1 - this.field1144;
                this.field1131 = -this.field1131;
            }
        } else if (this.field1131 < 0) {
            if (this.field1144 >= var3) {
                return;
            }
            this.field1144 = var4 - 1 - (var4 - 1 - this.field1144) % var6;
        } else if (this.field1144 >= var4) {
            this.field1144 = (this.field1144 - var3) % var6 + var3;
        } else {
            return;
        }
    }

    @ObfuscatedName("bg.aa([IIIII)I")
    public int method1218(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1141 > 0) {
                int var6 = this.field1141 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1141 += arg1;
                if (this.field1131 == 256 && (this.field1144 & 0xFF) == 0) {
                    if (Statics.field1071) {
                        arg1 = method1302(0, ((class56) this.field1157).field1045, arg0, this.field1144, arg1, this.field1130, this.field1136, this.field1143, this.field1142, 0, var6, arg2, this);
                    } else {
                        arg1 = method1230(((class56) this.field1157).field1045, arg0, this.field1144, arg1, this.field1139, this.field1134, 0, var6, arg2, this);
                    }
                } else if (Statics.field1071) {
                    arg1 = method1234(0, 0, ((class56) this.field1157).field1045, arg0, this.field1144, arg1, this.field1130, this.field1136, this.field1143, this.field1142, 0, var6, arg2, this, this.field1131, arg4);
                } else {
                    arg1 = method1237(0, 0, ((class56) this.field1157).field1045, arg0, this.field1144, arg1, this.field1139, this.field1134, 0, var6, arg2, this, this.field1131, arg4);
                }
                this.field1141 -= arg1;
                if (this.field1141 != 0) {
                    return arg1;
                }
                if (!this.method1221()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1131 == 256 && (this.field1144 & 0xFF) == 0) {
                if (Statics.field1071) {
                    return method1286(0, ((class56) this.field1157).field1045, arg0, this.field1144, arg1, this.field1130, this.field1136, 0, arg3, arg2, this);
                }
                return method1222(((class56) this.field1157).field1045, arg0, this.field1144, arg1, this.field1139, 0, arg3, arg2, this);
            }
            if (Statics.field1071) {
                return method1284(0, 0, ((class56) this.field1157).field1045, arg0, this.field1144, arg1, this.field1130, this.field1136, 0, arg3, arg2, this, this.field1131, arg4);
            }
            return method1196(0, 0, ((class56) this.field1157).field1045, arg0, this.field1144, arg1, this.field1139, 0, arg3, arg2, this, this.field1131, arg4);
        }
    }

    @ObfuscatedName("bg.ah([IIIII)I")
    public int method1220(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1141 > 0) {
                int var6 = this.field1141 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1141 += arg1;
                if (this.field1131 == -256 && (this.field1144 & 0xFF) == 0) {
                    if (Statics.field1071) {
                        arg1 = method1232(0, ((class56) this.field1157).field1045, arg0, this.field1144, arg1, this.field1130, this.field1136, this.field1143, this.field1142, 0, var6, arg2, this);
                    } else {
                        arg1 = method1317(((class56) this.field1157).field1045, arg0, this.field1144, arg1, this.field1139, this.field1134, 0, var6, arg2, this);
                    }
                } else if (Statics.field1071) {
                    arg1 = method1253(0, 0, ((class56) this.field1157).field1045, arg0, this.field1144, arg1, this.field1130, this.field1136, this.field1143, this.field1142, 0, var6, arg2, this, this.field1131, arg4);
                } else {
                    arg1 = method1235(0, 0, ((class56) this.field1157).field1045, arg0, this.field1144, arg1, this.field1139, this.field1134, 0, var6, arg2, this, this.field1131, arg4);
                }
                this.field1141 -= arg1;
                if (this.field1141 != 0) {
                    return arg1;
                }
                if (!this.method1221()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1131 == -256 && (this.field1144 & 0xFF) == 0) {
                if (Statics.field1071) {
                    return method1276(0, ((class56) this.field1157).field1045, arg0, this.field1144, arg1, this.field1130, this.field1136, 0, arg3, arg2, this);
                }
                return method1292(((class56) this.field1157).field1045, arg0, this.field1144, arg1, this.field1139, 0, arg3, arg2, this);
            }
            if (Statics.field1071) {
                return method1233(0, 0, ((class56) this.field1157).field1045, arg0, this.field1144, arg1, this.field1130, this.field1136, 0, arg3, arg2, this, this.field1131, arg4);
            }
            return method1228(0, 0, ((class56) this.field1157).field1045, arg0, this.field1144, arg1, this.field1139, 0, arg3, arg2, this, this.field1131, arg4);
        }
    }

    @ObfuscatedName("bg.aj()Z")
    public boolean method1221() {
        int var1 = this.field1132;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method1279(var1, this.field1133);
            var2 = method1197(var1, this.field1133);
        }
        if (this.field1139 != var1 || this.field1130 != var3 || this.field1136 != var2) {
            if (this.field1139 < var1) {
                this.field1134 = 1;
                this.field1141 = var1 - this.field1139;
            } else if (this.field1139 > var1) {
                this.field1134 = -1;
                this.field1141 = this.field1139 - var1;
            } else {
                this.field1134 = 0;
            }
            if (this.field1130 < var3) {
                this.field1143 = 1;
                if (this.field1141 == 0 || this.field1141 > var3 - this.field1130) {
                    this.field1141 = var3 - this.field1130;
                }
            } else if (this.field1130 > var3) {
                this.field1143 = -1;
                if (this.field1141 == 0 || this.field1141 > this.field1130 - var3) {
                    this.field1141 = this.field1130 - var3;
                }
            } else {
                this.field1143 = 0;
            }
            if (this.field1136 < var2) {
                this.field1142 = 1;
                if (this.field1141 == 0 || this.field1141 > var2 - this.field1136) {
                    this.field1141 = var2 - this.field1136;
                }
            } else if (this.field1136 > var2) {
                this.field1142 = -1;
                if (this.field1141 == 0 || this.field1141 > this.field1136 - var2) {
                    this.field1141 = this.field1136 - var2;
                }
            } else {
                this.field1142 = 0;
            }
            return false;
        } else if (this.field1132 == Integer.MIN_VALUE) {
            this.field1132 = 0;
            this.field1136 = 0;
            this.field1130 = 0;
            this.field1139 = 0;
            this.method2310();
            return true;
        } else {
            this.method1294();
            return false;
        }
    }

    @ObfuscatedName("bg.ak([B[IIIIIIILbg;)I")
    public static int method1222(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class67 arg8) {
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
        arg8.field1144 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("bg.ag(I[B[IIIIIIIILbg;)I")
    public static int method1286(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class67 arg10) {
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
        arg10.field1144 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("bg.al([B[IIIIIIILbg;)I")
    public static int method1292(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class67 arg8) {
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
        arg8.field1144 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("bg.ar(I[B[IIIIIIIILbg;)I")
    public static int method1276(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class67 arg10) {
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
        arg10.field1144 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("bg.ab(II[B[IIIIIIILbg;II)I")
    public static int method1196(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class67 arg10, int arg11, int arg12) {
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
        arg10.field1144 = arg4;
        return arg5;
    }

    @ObfuscatedName("bg.az(II[B[IIIIIIIILbg;II)I")
    public static int method1284(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class67 arg11, int arg12, int arg13) {
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
        arg11.field1144 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("bg.ay(II[B[IIIIIIILbg;II)I")
    public static int method1228(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class67 arg10, int arg11, int arg12) {
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
        arg10.field1144 = arg4;
        return arg5;
    }

    @ObfuscatedName("bg.av(II[B[IIIIIIIILbg;II)I")
    public static int method1233(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class67 arg11, int arg12, int arg13) {
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
        arg11.field1144 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("bg.af([B[IIIIIIIILbg;)I")
    public static int method1230(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class67 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field1130 += (var14 - arg3) * arg9.field1143;
        arg9.field1136 += (var14 - arg3) * arg9.field1142;
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
        arg9.field1139 = var12 >> 2;
        arg9.field1144 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("bg.ax(I[B[IIIIIIIIIILbg;)I")
    public static int method1302(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class67 arg12) {
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
        arg12.field1139 += (var19 - arg4) * arg12.field1134;
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
        arg12.field1130 = var15 >> 2;
        arg12.field1136 = var16 >> 2;
        arg12.field1144 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("bg.bn([B[IIIIIIIILbg;)I")
    public static int method1317(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class67 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field1130 += (var14 - arg3) * arg9.field1143;
        arg9.field1136 += (var14 - arg3) * arg9.field1142;
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
        arg9.field1139 = var12 >> 2;
        arg9.field1144 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("bg.bp(I[B[IIIIIIIIIILbg;)I")
    public static int method1232(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class67 arg12) {
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
        arg12.field1139 += (var19 - arg4) * arg12.field1134;
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
        arg12.field1130 = var15 >> 2;
        arg12.field1136 = var16 >> 2;
        arg12.field1144 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("bg.bt(II[B[IIIIIIIILbg;II)I")
    public static int method1237(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class67 arg11, int arg12, int arg13) {
        arg11.field1130 -= arg11.field1143 * arg5;
        arg11.field1136 -= arg11.field1142 * arg5;
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
        arg11.field1130 += arg11.field1143 * arg5;
        arg11.field1136 += arg11.field1142 * arg5;
        arg11.field1139 = arg6;
        arg11.field1144 = arg4;
        return arg5;
    }

    @ObfuscatedName("bg.bj(II[B[IIIIIIIIIILbg;II)I")
    public static int method1234(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class67 arg13, int arg14, int arg15) {
        arg13.field1139 -= arg13.field1134 * arg5;
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
        arg13.field1139 += arg13.field1134 * var27;
        arg13.field1130 = arg6;
        arg13.field1136 = arg7;
        arg13.field1144 = arg4;
        return var27;
    }

    @ObfuscatedName("bg.bw(II[B[IIIIIIIILbg;II)I")
    public static int method1235(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class67 arg11, int arg12, int arg13) {
        arg11.field1130 -= arg11.field1143 * arg5;
        arg11.field1136 -= arg11.field1142 * arg5;
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
        arg11.field1130 += arg11.field1143 * arg5;
        arg11.field1136 += arg11.field1142 * arg5;
        arg11.field1139 = arg6;
        arg11.field1144 = arg4;
        return arg5;
    }

    @ObfuscatedName("bg.bd(II[B[IIIIIIIIIILbg;II)I")
    public static int method1253(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class67 arg13, int arg14, int arg15) {
        arg13.field1139 -= arg13.field1134 * arg5;
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
        arg13.field1139 += arg13.field1134 * var26;
        arg13.field1130 = arg6;
        arg13.field1136 = arg7;
        arg13.field1144 = arg4;
        return var26;
    }
}
