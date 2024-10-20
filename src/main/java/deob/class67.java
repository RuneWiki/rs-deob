package deob;

@ObfuscatedName("bb")
public class class67 extends class69 {

    @ObfuscatedName("bb.b")
    public int field1132;

    @ObfuscatedName("bb.e")
    public int field1137;

    @ObfuscatedName("bb.c")
    public int field1127;

    @ObfuscatedName("bb.l")
    public int field1128;

    @ObfuscatedName("bb.y")
    public int field1129;

    @ObfuscatedName("bb.j")
    public int field1130;

    @ObfuscatedName("bb.g")
    public int field1131;

    @ObfuscatedName("bb.s")
    public int field1126;

    @ObfuscatedName("bb.r")
    public int field1139;

    @ObfuscatedName("bb.t")
    public int field1134;

    @ObfuscatedName("bb.k")
    public boolean field1135;

    @ObfuscatedName("bb.f")
    public int field1125;

    @ObfuscatedName("bb.a")
    public int field1133;

    @ObfuscatedName("bb.v")
    public int field1138;

    @ObfuscatedName("bb.d")
    public int field1136;

    @ObfuscatedName("bb.b(II)I")
    public static int method1216(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("bb.e(II)I")
    public static int method1168(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("bb.ai()I")
    public int method1210() {
        int var1 = this.field1129 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field1126 == 0) {
            var2 -= this.field1132 * var2 / (((class56) this.field1153).field1030.length << 8);
        } else if (this.field1126 >= 0) {
            var2 -= this.field1139 * var2 / ((class56) this.field1153).field1030.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    public class67(class56 arg0, int arg1, int arg2) {
        this.field1153 = arg0;
        this.field1139 = arg0.field1031;
        this.field1134 = arg0.field1029;
        this.field1135 = arg0.field1033;
        this.field1137 = arg1;
        this.field1127 = arg2;
        this.field1128 = 8192;
        this.field1132 = 0;
        this.method1167();
    }

    public class67(class56 arg0, int arg1, int arg2, int arg3) {
        this.field1153 = arg0;
        this.field1139 = arg0.field1031;
        this.field1134 = arg0.field1029;
        this.field1135 = arg0.field1033;
        this.field1137 = arg1;
        this.field1127 = arg2;
        this.field1128 = arg3;
        this.field1132 = 0;
        this.method1167();
    }

    @ObfuscatedName("bb.c(Lbo;II)Lbb;")
    public static class67 method1171(class56 arg0, int arg1, int arg2) {
        return arg0.field1030 == null || arg0.field1030.length == 0 ? null : new class67(arg0, (int) ((long) arg0.field1032 * 256L * (long) arg1 / (long) (Statics.field1072 * 100)), arg2 << 6);
    }

    @ObfuscatedName("bb.l(Lbo;III)Lbb;")
    public static class67 method1172(class56 arg0, int arg1, int arg2, int arg3) {
        return arg0.field1030 == null || arg0.field1030.length == 0 ? null : new class67(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("bb.y()V")
    public void method1167() {
        this.field1129 = this.field1127;
        this.field1130 = method1216(this.field1127, this.field1128);
        this.field1131 = method1168(this.field1127, this.field1128);
    }

    @ObfuscatedName("bb.a(I)V")
    public synchronized void method1174(int arg0) {
        this.field1126 = arg0;
    }

    @ObfuscatedName("bb.d(I)V")
    public synchronized void method1175(int arg0) {
        this.method1177(arg0 << 6, this.method1179());
    }

    @ObfuscatedName("bb.o(I)V")
    public synchronized void method1201(int arg0) {
        this.method1177(arg0, this.method1179());
    }

    @ObfuscatedName("bb.q(II)V")
    public synchronized void method1177(int arg0, int arg1) {
        this.field1127 = arg0;
        this.field1128 = arg1;
        this.field1125 = 0;
        this.method1167();
    }

    @ObfuscatedName("bb.i()I")
    public synchronized int method1178() {
        return this.field1127 == Integer.MIN_VALUE ? 0 : this.field1127;
    }

    @ObfuscatedName("bb.x()I")
    public synchronized int method1179() {
        return this.field1128 < 0 ? -1 : this.field1128;
    }

    @ObfuscatedName("bb.z(I)V")
    public synchronized void method1264(int arg0) {
        int var2 = ((class56) this.field1153).field1030.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field1132 = arg0;
    }

    @ObfuscatedName("bb.n(Z)V")
    public synchronized void method1205(boolean arg0) {
        this.field1137 = (this.field1137 >>> 31) + (this.field1137 ^ this.field1137 >> 31);
        if (arg0) {
            this.field1137 = -this.field1137;
        }
    }

    @ObfuscatedName("bb.w()V")
    public void method1181() {
        if (this.field1125 == 0) {
            return;
        }
        if (this.field1127 == Integer.MIN_VALUE) {
            this.field1127 = 0;
        }
        this.field1125 = 0;
        this.method1167();
    }

    @ObfuscatedName("bb.h(II)V")
    public synchronized void method1182(int arg0, int arg1) {
        this.method1183(arg0, arg1, this.method1179());
    }

    @ObfuscatedName("bb.u(III)V")
    public synchronized void method1183(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method1177(arg1, arg2);
            return;
        }
        int var4 = method1216(arg1, arg2);
        int var5 = method1168(arg1, arg2);
        if (this.field1130 == var4 && this.field1131 == var5) {
            this.field1125 = 0;
            return;
        }
        int var6 = arg1 - this.field1129;
        if (this.field1129 - arg1 > var6) {
            var6 = this.field1129 - arg1;
        }
        if (var4 - this.field1130 > var6) {
            var6 = var4 - this.field1130;
        }
        if (this.field1130 - var4 > var6) {
            var6 = this.field1130 - var4;
        }
        if (var5 - this.field1131 > var6) {
            var6 = var5 - this.field1131;
        }
        if (this.field1131 - var5 > var6) {
            var6 = this.field1131 - var5;
        }
        if (arg0 > var6) {
            arg0 = var6;
        }
        this.field1125 = arg0;
        this.field1127 = arg1;
        this.field1128 = arg2;
        this.field1133 = (arg1 - this.field1129) / arg0;
        this.field1138 = (var4 - this.field1130) / arg0;
        this.field1136 = (var5 - this.field1131) / arg0;
    }

    @ObfuscatedName("bb.m(I)V")
    public synchronized void method1283(int arg0) {
        if (arg0 == 0) {
            this.method1201(0);
            this.method2298();
        } else if (this.field1130 == 0 && this.field1131 == 0) {
            this.field1125 = 0;
            this.field1127 = 0;
            this.field1129 = 0;
            this.method2298();
        } else {
            int var2 = -this.field1129;
            if (this.field1129 > var2) {
                var2 = this.field1129;
            }
            if (-this.field1130 > var2) {
                var2 = -this.field1130;
            }
            if (this.field1130 > var2) {
                var2 = this.field1130;
            }
            if (-this.field1131 > var2) {
                var2 = -this.field1131;
            }
            if (this.field1131 > var2) {
                var2 = this.field1131;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field1125 = arg0;
            this.field1127 = Integer.MIN_VALUE;
            this.field1133 = -this.field1129 / arg0;
            this.field1138 = -this.field1130 / arg0;
            this.field1136 = -this.field1131 / arg0;
        }
    }

    @ObfuscatedName("bb.ah(I)V")
    public synchronized void method1185(int arg0) {
        if (this.field1137 < 0) {
            this.field1137 = -arg0;
        } else {
            this.field1137 = arg0;
        }
    }

    @ObfuscatedName("bb.ao()I")
    public synchronized int method1282() {
        return this.field1137 < 0 ? -this.field1137 : this.field1137;
    }

    @ObfuscatedName("bb.ag()Z")
    public boolean method1187() {
        return this.field1132 < 0 || this.field1132 >= ((class56) this.field1153).field1030.length << 8;
    }

    @ObfuscatedName("bb.as()Z")
    public boolean method1226() {
        return this.field1125 != 0;
    }

    @ObfuscatedName("bb.j()Lbm;")
    public class69 method944() {
        return null;
    }

    @ObfuscatedName("bb.t()Lbm;")
    public class69 method926() {
        return null;
    }

    @ObfuscatedName("bb.k()I")
    public int method927() {
        return this.field1127 == 0 && this.field1125 == 0 ? 0 : 1;
    }

    @ObfuscatedName("bb.f([III)V")
    public synchronized void method942(int[] arg0, int arg1, int arg2) {
        if (this.field1127 == 0 && this.field1125 == 0) {
            this.method950(arg2);
            return;
        }
        class56 var4 = (class56) this.field1153;
        int var5 = this.field1139 << 8;
        int var6 = this.field1134 << 8;
        int var7 = var4.field1030.length << 8;
        int var8 = var6 - var5;
        if (var8 <= 0) {
            this.field1126 = 0;
        }
        int var9 = arg1;
        int var10 = arg1 + arg2;
        if (this.field1132 < 0) {
            if (this.field1137 <= 0) {
                this.method1181();
                this.method2298();
                return;
            }
            this.field1132 = 0;
        }
        if (this.field1132 >= var7) {
            if (this.field1137 >= 0) {
                this.method1181();
                this.method2298();
                return;
            }
            this.field1132 = var7 - 1;
        }
        if (this.field1126 >= 0) {
            if (this.field1126 > 0) {
                if (this.field1135) {
                    label131: {
                        if (this.field1137 < 0) {
                            var9 = this.method1170(arg0, arg1, var5, var10, var4.field1030[this.field1139]);
                            if (this.field1132 >= var5) {
                                return;
                            }
                            this.field1132 = var5 + var5 - 1 - this.field1132;
                            this.field1137 = -this.field1137;
                            if (--this.field1126 == 0) {
                                break label131;
                            }
                        }
                        do {
                            var9 = this.method1190(arg0, var9, var6, var10, var4.field1030[this.field1134 - 1]);
                            if (this.field1132 < var6) {
                                return;
                            }
                            this.field1132 = var6 + var6 - 1 - this.field1132;
                            this.field1137 = -this.field1137;
                            if (--this.field1126 == 0) {
                                break;
                            }
                            var9 = this.method1170(arg0, var9, var5, var10, var4.field1030[this.field1139]);
                            if (this.field1132 >= var5) {
                                return;
                            }
                            this.field1132 = var5 + var5 - 1 - this.field1132;
                            this.field1137 = -this.field1137;
                        } while (--this.field1126 != 0);
                    }
                } else if (this.field1137 < 0) {
                    while (true) {
                        var9 = this.method1170(arg0, var9, var5, var10, var4.field1030[this.field1134 - 1]);
                        if (this.field1132 >= var5) {
                            return;
                        }
                        int var12 = (var6 - 1 - this.field1132) / var8;
                        if (var12 >= this.field1126) {
                            this.field1132 += this.field1126 * var8;
                            this.field1126 = 0;
                            break;
                        }
                        this.field1132 += var8 * var12;
                        this.field1126 -= var12;
                    }
                } else {
                    while (true) {
                        var9 = this.method1190(arg0, var9, var6, var10, var4.field1030[this.field1139]);
                        if (this.field1132 < var6) {
                            return;
                        }
                        int var13 = (this.field1132 - var5) / var8;
                        if (var13 >= this.field1126) {
                            this.field1132 -= this.field1126 * var8;
                            this.field1126 = 0;
                            break;
                        }
                        this.field1132 -= var8 * var13;
                        this.field1126 -= var13;
                    }
                }
            }
            if (this.field1137 < 0) {
                this.method1170(arg0, var9, 0, var10, 0);
                if (this.field1132 < 0) {
                    this.field1132 = -1;
                    this.method1181();
                    this.method2298();
                }
            } else {
                this.method1190(arg0, var9, var7, var10, 0);
                if (this.field1132 >= var7) {
                    this.field1132 = var7;
                    this.method1181();
                    this.method2298();
                }
            }
        } else if (this.field1135) {
            if (this.field1137 < 0) {
                var9 = this.method1170(arg0, arg1, var5, var10, var4.field1030[this.field1139]);
                if (this.field1132 >= var5) {
                    return;
                }
                this.field1132 = var5 + var5 - 1 - this.field1132;
                this.field1137 = -this.field1137;
            }
            while (true) {
                int var11 = this.method1190(arg0, var9, var6, var10, var4.field1030[this.field1134 - 1]);
                if (this.field1132 < var6) {
                    return;
                }
                this.field1132 = var6 + var6 - 1 - this.field1132;
                this.field1137 = -this.field1137;
                var9 = this.method1170(arg0, var11, var5, var10, var4.field1030[this.field1139]);
                if (this.field1132 >= var5) {
                    return;
                }
                this.field1132 = var5 + var5 - 1 - this.field1132;
                this.field1137 = -this.field1137;
            }
        } else if (this.field1137 < 0) {
            while (true) {
                var9 = this.method1170(arg0, var9, var5, var10, var4.field1030[this.field1134 - 1]);
                if (this.field1132 >= var5) {
                    return;
                }
                this.field1132 = var6 - 1 - (var6 - 1 - this.field1132) % var8;
            }
        } else {
            while (true) {
                var9 = this.method1190(arg0, var9, var6, var10, var4.field1030[this.field1139]);
                if (this.field1132 < var6) {
                    return;
                }
                this.field1132 = (this.field1132 - var5) % var8 + var5;
            }
        }
    }

    @ObfuscatedName("bb.v(I)V")
    public synchronized void method950(int arg0) {
        if (this.field1125 > 0) {
            if (arg0 >= this.field1125) {
                if (this.field1127 == Integer.MIN_VALUE) {
                    this.field1127 = 0;
                    this.field1131 = 0;
                    this.field1130 = 0;
                    this.field1129 = 0;
                    this.method2298();
                    arg0 = this.field1125;
                }
                this.field1125 = 0;
                this.method1167();
            } else {
                this.field1129 += this.field1133 * arg0;
                this.field1130 += this.field1138 * arg0;
                this.field1131 += this.field1136 * arg0;
                this.field1125 -= arg0;
            }
        }
        class56 var2 = (class56) this.field1153;
        int var3 = this.field1139 << 8;
        int var4 = this.field1134 << 8;
        int var5 = var2.field1030.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field1126 = 0;
        }
        if (this.field1132 < 0) {
            if (this.field1137 <= 0) {
                this.method1181();
                this.method2298();
                return;
            }
            this.field1132 = 0;
        }
        if (this.field1132 >= var5) {
            if (this.field1137 >= 0) {
                this.method1181();
                this.method2298();
                return;
            }
            this.field1132 = var5 - 1;
        }
        this.field1132 += this.field1137 * arg0;
        if (this.field1126 >= 0) {
            if (this.field1126 > 0) {
                if (this.field1135) {
                    label121: {
                        if (this.field1137 < 0) {
                            if (this.field1132 >= var3) {
                                return;
                            }
                            this.field1132 = var3 + var3 - 1 - this.field1132;
                            this.field1137 = -this.field1137;
                            if (--this.field1126 == 0) {
                                break label121;
                            }
                        }
                        do {
                            if (this.field1132 < var4) {
                                return;
                            }
                            this.field1132 = var4 + var4 - 1 - this.field1132;
                            this.field1137 = -this.field1137;
                            if (--this.field1126 == 0) {
                                break;
                            }
                            if (this.field1132 >= var3) {
                                return;
                            }
                            this.field1132 = var3 + var3 - 1 - this.field1132;
                            this.field1137 = -this.field1137;
                        } while (--this.field1126 != 0);
                    }
                } else {
                    label153: {
                        if (this.field1137 < 0) {
                            if (this.field1132 >= var3) {
                                return;
                            }
                            int var7 = (var4 - 1 - this.field1132) / var6;
                            if (var7 >= this.field1126) {
                                this.field1132 += this.field1126 * var6;
                                this.field1126 = 0;
                                break label153;
                            }
                            this.field1132 += var6 * var7;
                            this.field1126 -= var7;
                        } else if (this.field1132 >= var4) {
                            int var8 = (this.field1132 - var3) / var6;
                            if (var8 >= this.field1126) {
                                this.field1132 -= this.field1126 * var6;
                                this.field1126 = 0;
                                break label153;
                            }
                            this.field1132 -= var6 * var8;
                            this.field1126 -= var8;
                        } else {
                            return;
                        }
                        return;
                    }
                }
            }
            if (this.field1137 < 0) {
                if (this.field1132 < 0) {
                    this.field1132 = -1;
                    this.method1181();
                    this.method2298();
                }
            } else if (this.field1132 >= var5) {
                this.field1132 = var5;
                this.method1181();
                this.method2298();
            }
        } else if (this.field1135) {
            if (this.field1137 < 0) {
                if (this.field1132 >= var3) {
                    return;
                }
                this.field1132 = var3 + var3 - 1 - this.field1132;
                this.field1137 = -this.field1137;
            }
            while (this.field1132 >= var4) {
                this.field1132 = var4 + var4 - 1 - this.field1132;
                this.field1137 = -this.field1137;
                if (this.field1132 >= var3) {
                    return;
                }
                this.field1132 = var3 + var3 - 1 - this.field1132;
                this.field1137 = -this.field1137;
            }
        } else if (this.field1137 < 0) {
            if (this.field1132 >= var3) {
                return;
            }
            this.field1132 = var4 - 1 - (var4 - 1 - this.field1132) % var6;
        } else if (this.field1132 >= var4) {
            this.field1132 = (this.field1132 - var3) % var6 + var3;
        } else {
            return;
        }
    }

    @ObfuscatedName("bb.ak([IIIII)I")
    public int method1190(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1125 > 0) {
                int var6 = this.field1125 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1125 += arg1;
                if (this.field1137 == 256 && (this.field1132 & 0xFF) == 0) {
                    if (Statics.field1047) {
                        arg1 = method1189(0, ((class56) this.field1153).field1030, arg0, this.field1132, arg1, this.field1130, this.field1131, this.field1138, this.field1136, 0, var6, arg2, this);
                    } else {
                        arg1 = method1200(((class56) this.field1153).field1030, arg0, this.field1132, arg1, this.field1129, this.field1133, 0, var6, arg2, this);
                    }
                } else if (Statics.field1047) {
                    arg1 = method1237(0, 0, ((class56) this.field1153).field1030, arg0, this.field1132, arg1, this.field1130, this.field1131, this.field1138, this.field1136, 0, var6, arg2, this, this.field1137, arg4);
                } else {
                    arg1 = method1223(0, 0, ((class56) this.field1153).field1030, arg0, this.field1132, arg1, this.field1129, this.field1133, 0, var6, arg2, this, this.field1137, arg4);
                }
                this.field1125 -= arg1;
                if (this.field1125 != 0) {
                    return arg1;
                }
                if (!this.method1192()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1137 == 256 && (this.field1132 & 0xFF) == 0) {
                if (Statics.field1047) {
                    return method1194(0, ((class56) this.field1153).field1030, arg0, this.field1132, arg1, this.field1130, this.field1131, 0, arg3, arg2, this);
                }
                return method1195(((class56) this.field1153).field1030, arg0, this.field1132, arg1, this.field1129, 0, arg3, arg2, this);
            }
            if (Statics.field1047) {
                return method1197(0, 0, ((class56) this.field1153).field1030, arg0, this.field1132, arg1, this.field1130, this.field1131, 0, arg3, arg2, this, this.field1137, arg4);
            }
            return method1196(0, 0, ((class56) this.field1153).field1030, arg0, this.field1132, arg1, this.field1129, 0, arg3, arg2, this, this.field1137, arg4);
        }
    }

    @ObfuscatedName("bb.an([IIIII)I")
    public int method1170(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1125 > 0) {
                int var6 = this.field1125 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1125 += arg1;
                if (this.field1137 == -256 && (this.field1132 & 0xFF) == 0) {
                    if (Statics.field1047) {
                        arg1 = method1225(0, ((class56) this.field1153).field1030, arg0, this.field1132, arg1, this.field1130, this.field1131, this.field1138, this.field1136, 0, var6, arg2, this);
                    } else {
                        arg1 = method1202(((class56) this.field1153).field1030, arg0, this.field1132, arg1, this.field1129, this.field1133, 0, var6, arg2, this);
                    }
                } else if (Statics.field1047) {
                    arg1 = method1207(0, 0, ((class56) this.field1153).field1030, arg0, this.field1132, arg1, this.field1130, this.field1131, this.field1138, this.field1136, 0, var6, arg2, this, this.field1137, arg4);
                } else {
                    arg1 = method1206(0, 0, ((class56) this.field1153).field1030, arg0, this.field1132, arg1, this.field1129, this.field1133, 0, var6, arg2, this, this.field1137, arg4);
                }
                this.field1125 -= arg1;
                if (this.field1125 != 0) {
                    return arg1;
                }
                if (!this.method1192()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1137 == -256 && (this.field1132 & 0xFF) == 0) {
                if (Statics.field1047) {
                    return method1285(0, ((class56) this.field1153).field1030, arg0, this.field1132, arg1, this.field1130, this.field1131, 0, arg3, arg2, this);
                }
                return method1211(((class56) this.field1153).field1030, arg0, this.field1132, arg1, this.field1129, 0, arg3, arg2, this);
            }
            if (Statics.field1047) {
                return method1199(0, 0, ((class56) this.field1153).field1030, arg0, this.field1132, arg1, this.field1130, this.field1131, 0, arg3, arg2, this, this.field1137, arg4);
            }
            return method1198(0, 0, ((class56) this.field1153).field1030, arg0, this.field1132, arg1, this.field1129, 0, arg3, arg2, this, this.field1137, arg4);
        }
    }

    @ObfuscatedName("bb.av()Z")
    public boolean method1192() {
        int var1 = this.field1127;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method1216(var1, this.field1128);
            var2 = method1168(var1, this.field1128);
        }
        if (this.field1129 != var1 || this.field1130 != var3 || this.field1131 != var2) {
            if (this.field1129 < var1) {
                this.field1133 = 1;
                this.field1125 = var1 - this.field1129;
            } else if (this.field1129 > var1) {
                this.field1133 = -1;
                this.field1125 = this.field1129 - var1;
            } else {
                this.field1133 = 0;
            }
            if (this.field1130 < var3) {
                this.field1138 = 1;
                if (this.field1125 == 0 || this.field1125 > var3 - this.field1130) {
                    this.field1125 = var3 - this.field1130;
                }
            } else if (this.field1130 > var3) {
                this.field1138 = -1;
                if (this.field1125 == 0 || this.field1125 > this.field1130 - var3) {
                    this.field1125 = this.field1130 - var3;
                }
            } else {
                this.field1138 = 0;
            }
            if (this.field1131 < var2) {
                this.field1136 = 1;
                if (this.field1125 == 0 || this.field1125 > var2 - this.field1131) {
                    this.field1125 = var2 - this.field1131;
                }
            } else if (this.field1131 > var2) {
                this.field1136 = -1;
                if (this.field1125 == 0 || this.field1125 > this.field1131 - var2) {
                    this.field1125 = this.field1131 - var2;
                }
            } else {
                this.field1136 = 0;
            }
            return false;
        } else if (this.field1127 == Integer.MIN_VALUE) {
            this.field1127 = 0;
            this.field1131 = 0;
            this.field1130 = 0;
            this.field1129 = 0;
            this.method2298();
            return true;
        } else {
            this.method1167();
            return false;
        }
    }

    @ObfuscatedName("bb.ab([B[IIIIIIILbb;)I")
    public static int method1195(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class67 arg8) {
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
        arg8.field1132 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("bb.ay(I[B[IIIIIIIILbb;)I")
    public static int method1194(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class67 arg10) {
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
        arg10.field1132 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("bb.am([B[IIIIIIILbb;)I")
    public static int method1211(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class67 arg8) {
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
        arg8.field1132 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("bb.ar(I[B[IIIIIIIILbb;)I")
    public static int method1285(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class67 arg10) {
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
        arg10.field1132 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("bb.ad(II[B[IIIIIIILbb;II)I")
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
        arg10.field1132 = arg4;
        return arg5;
    }

    @ObfuscatedName("bb.ax(II[B[IIIIIIIILbb;II)I")
    public static int method1197(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class67 arg11, int arg12, int arg13) {
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
        arg11.field1132 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("bb.ac(II[B[IIIIIIILbb;II)I")
    public static int method1198(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class67 arg10, int arg11, int arg12) {
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
        arg10.field1132 = arg4;
        return arg5;
    }

    @ObfuscatedName("bb.al(II[B[IIIIIIIILbb;II)I")
    public static int method1199(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class67 arg11, int arg12, int arg13) {
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
        arg11.field1132 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("bb.bu([B[IIIIIIIILbb;)I")
    public static int method1200(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class67 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field1130 += (var14 - arg3) * arg9.field1138;
        arg9.field1131 += (var14 - arg3) * arg9.field1136;
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
        arg9.field1129 = var12 >> 2;
        arg9.field1132 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("bb.bd(I[B[IIIIIIIIIILbb;)I")
    public static int method1189(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class67 arg12) {
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
        arg12.field1129 += (var19 - arg4) * arg12.field1133;
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
        arg12.field1131 = var16 >> 2;
        arg12.field1132 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("bb.bz([B[IIIIIIIILbb;)I")
    public static int method1202(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class67 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field1130 += (var14 - arg3) * arg9.field1138;
        arg9.field1131 += (var14 - arg3) * arg9.field1136;
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
        arg9.field1129 = var12 >> 2;
        arg9.field1132 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("bb.bo(I[B[IIIIIIIIIILbb;)I")
    public static int method1225(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class67 arg12) {
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
        arg12.field1129 += (var19 - arg4) * arg12.field1133;
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
        arg12.field1131 = var16 >> 2;
        arg12.field1132 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("bb.ba(II[B[IIIIIIIILbb;II)I")
    public static int method1223(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class67 arg11, int arg12, int arg13) {
        arg11.field1130 -= arg11.field1138 * arg5;
        arg11.field1131 -= arg11.field1136 * arg5;
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
        arg11.field1130 += arg11.field1138 * arg5;
        arg11.field1131 += arg11.field1136 * arg5;
        arg11.field1129 = arg6;
        arg11.field1132 = arg4;
        return arg5;
    }

    @ObfuscatedName("bb.bf(II[B[IIIIIIIIIILbb;II)I")
    public static int method1237(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class67 arg13, int arg14, int arg15) {
        arg13.field1129 -= arg13.field1133 * arg5;
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
        arg13.field1129 += arg13.field1133 * var27;
        arg13.field1130 = arg6;
        arg13.field1131 = arg7;
        arg13.field1132 = arg4;
        return var27;
    }

    @ObfuscatedName("bb.be(II[B[IIIIIIIILbb;II)I")
    public static int method1206(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class67 arg11, int arg12, int arg13) {
        arg11.field1130 -= arg11.field1138 * arg5;
        arg11.field1131 -= arg11.field1136 * arg5;
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
        arg11.field1130 += arg11.field1138 * arg5;
        arg11.field1131 += arg11.field1136 * arg5;
        arg11.field1129 = arg6;
        arg11.field1132 = arg4;
        return arg5;
    }

    @ObfuscatedName("bb.bq(II[B[IIIIIIIIIILbb;II)I")
    public static int method1207(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class67 arg13, int arg14, int arg15) {
        arg13.field1129 -= arg13.field1133 * arg5;
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
        arg13.field1129 += arg13.field1133 * var26;
        arg13.field1130 = arg6;
        arg13.field1131 = arg7;
        arg13.field1132 = arg4;
        return var26;
    }
}
