package deob;

@ObfuscatedName("br")
public class class58 extends class60 {

    @ObfuscatedName("br.k")
    public int field1128;

    @ObfuscatedName("br.y")
    public int field1135;

    @ObfuscatedName("br.s")
    public int field1140;

    @ObfuscatedName("br.g")
    public int field1127;

    @ObfuscatedName("br.h")
    public int field1130;

    @ObfuscatedName("br.l")
    public int field1131;

    @ObfuscatedName("br.e")
    public int field1132;

    @ObfuscatedName("br.u")
    public int field1133;

    @ObfuscatedName("br.j")
    public int field1134;

    @ObfuscatedName("br.c")
    public int field1126;

    @ObfuscatedName("br.d")
    public boolean field1136;

    @ObfuscatedName("br.v")
    public int field1137;

    @ObfuscatedName("br.n")
    public int field1138;

    @ObfuscatedName("br.z")
    public int field1139;

    @ObfuscatedName("br.a")
    public int field1129;

    @ObfuscatedName("br.k(II)I")
    public static int method1165(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("br.y(II)I")
    public static int method1106(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("br.az()I")
    public int method1107() {
        int var1 = this.field1130 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field1133 == 0) {
            var2 -= this.field1128 * var2 / (((class56) this.field1144).field1112.length << 8);
        } else if (this.field1133 >= 0) {
            var2 -= this.field1134 * var2 / ((class56) this.field1144).field1112.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    public class58(class56 arg0, int arg1, int arg2) {
        this.field1144 = arg0;
        this.field1134 = arg0.field1110;
        this.field1126 = arg0.field1109;
        this.field1136 = arg0.field1113;
        this.field1135 = arg1;
        this.field1140 = arg2;
        this.field1127 = 8192;
        this.field1128 = 0;
        this.method1111();
    }

    public class58(class56 arg0, int arg1, int arg2, int arg3) {
        this.field1144 = arg0;
        this.field1134 = arg0.field1110;
        this.field1126 = arg0.field1109;
        this.field1136 = arg0.field1113;
        this.field1135 = arg1;
        this.field1140 = arg2;
        this.field1127 = arg3;
        this.field1128 = 0;
        this.method1111();
    }

    @ObfuscatedName("br.s(Lbo;II)Lbr;")
    public static class58 method1109(class56 arg0, int arg1, int arg2) {
        return arg0.field1112 == null || arg0.field1112.length == 0 ? null : new class58(arg0, (int) ((long) arg0.field1111 * 256L * (long) arg1 / (long) (Statics.field1074 * 100)), arg2 << 6);
    }

    @ObfuscatedName("br.g(Lbo;III)Lbr;")
    public static class58 method1110(class56 arg0, int arg1, int arg2, int arg3) {
        return arg0.field1112 == null || arg0.field1112.length == 0 ? null : new class58(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("br.h()V")
    public void method1111() {
        this.field1130 = this.field1140;
        this.field1131 = method1165(this.field1140, this.field1127);
        this.field1132 = method1106(this.field1140, this.field1127);
    }

    @ObfuscatedName("br.c(I)V")
    public synchronized void method1112(int arg0) {
        this.field1133 = arg0;
    }

    @ObfuscatedName("br.v(I)V")
    public synchronized void method1113(int arg0) {
        this.method1115(arg0 << 6, this.method1117());
    }

    @ObfuscatedName("br.n(I)V")
    public synchronized void method1231(int arg0) {
        this.method1115(arg0, this.method1117());
    }

    @ObfuscatedName("br.z(II)V")
    public synchronized void method1115(int arg0, int arg1) {
        this.field1140 = arg0;
        this.field1127 = arg1;
        this.field1137 = 0;
        this.method1111();
    }

    @ObfuscatedName("br.a()I")
    public synchronized int method1116() {
        return this.field1140 == Integer.MIN_VALUE ? 0 : this.field1140;
    }

    @ObfuscatedName("br.t()I")
    public synchronized int method1117() {
        return this.field1127 < 0 ? -1 : this.field1127;
    }

    @ObfuscatedName("br.p(I)V")
    public synchronized void method1181(int arg0) {
        int var2 = ((class56) this.field1144).field1112.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field1128 = arg0;
    }

    @ObfuscatedName("br.i(Z)V")
    public synchronized void method1127(boolean arg0) {
        this.field1135 = (this.field1135 >>> 31) + (this.field1135 ^ this.field1135 >> 31);
        if (arg0) {
            this.field1135 = -this.field1135;
        }
    }

    @ObfuscatedName("br.r()V")
    public void method1120() {
        if (this.field1137 == 0) {
            return;
        }
        if (this.field1140 == Integer.MIN_VALUE) {
            this.field1140 = 0;
        }
        this.field1137 = 0;
        this.method1111();
    }

    @ObfuscatedName("br.w(II)V")
    public synchronized void method1121(int arg0, int arg1) {
        this.method1122(arg0, arg1, this.method1117());
    }

    @ObfuscatedName("br.b(III)V")
    public synchronized void method1122(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method1115(arg1, arg2);
            return;
        }
        int var4 = method1165(arg1, arg2);
        int var5 = method1106(arg1, arg2);
        if (this.field1131 == var4 && this.field1132 == var5) {
            this.field1137 = 0;
            return;
        }
        int var6 = arg1 - this.field1130;
        if (this.field1130 - arg1 > var6) {
            var6 = this.field1130 - arg1;
        }
        if (var4 - this.field1131 > var6) {
            var6 = var4 - this.field1131;
        }
        if (this.field1131 - var4 > var6) {
            var6 = this.field1131 - var4;
        }
        if (var5 - this.field1132 > var6) {
            var6 = var5 - this.field1132;
        }
        if (this.field1132 - var5 > var6) {
            var6 = this.field1132 - var5;
        }
        if (arg0 > var6) {
            arg0 = var6;
        }
        this.field1137 = arg0;
        this.field1140 = arg1;
        this.field1127 = arg2;
        this.field1138 = (arg1 - this.field1130) / arg0;
        this.field1139 = (var4 - this.field1131) / arg0;
        this.field1129 = (var5 - this.field1132) / arg0;
    }

    @ObfuscatedName("br.x(I)V")
    public synchronized void method1123(int arg0) {
        if (arg0 == 0) {
            this.method1231(0);
            this.method3365();
        } else if (this.field1131 == 0 && this.field1132 == 0) {
            this.field1137 = 0;
            this.field1140 = 0;
            this.field1130 = 0;
            this.method3365();
        } else {
            int var2 = -this.field1130;
            if (this.field1130 > var2) {
                var2 = this.field1130;
            }
            if (-this.field1131 > var2) {
                var2 = -this.field1131;
            }
            if (this.field1131 > var2) {
                var2 = this.field1131;
            }
            if (-this.field1132 > var2) {
                var2 = -this.field1132;
            }
            if (this.field1132 > var2) {
                var2 = this.field1132;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field1137 = arg0;
            this.field1140 = Integer.MIN_VALUE;
            this.field1138 = -this.field1130 / arg0;
            this.field1139 = -this.field1131 / arg0;
            this.field1129 = -this.field1132 / arg0;
        }
    }

    @ObfuscatedName("br.q(I)V")
    public synchronized void method1124(int arg0) {
        if (this.field1135 < 0) {
            this.field1135 = -arg0;
        } else {
            this.field1135 = arg0;
        }
    }

    @ObfuscatedName("br.o()I")
    public synchronized int method1125() {
        return this.field1135 < 0 ? -this.field1135 : this.field1135;
    }

    @ObfuscatedName("br.m()Z")
    public boolean method1126() {
        return this.field1128 < 0 || this.field1128 >= ((class56) this.field1144).field1112.length << 8;
    }

    @ObfuscatedName("br.f()Z")
    public boolean method1150() {
        return this.field1137 != 0;
    }

    @ObfuscatedName("br.l()Lbl;")
    public class60 method951() {
        return null;
    }

    @ObfuscatedName("br.e()Lbl;")
    public class60 method950() {
        return null;
    }

    @ObfuscatedName("br.u()I")
    public int method984() {
        return this.field1140 == 0 && this.field1137 == 0 ? 0 : 1;
    }

    @ObfuscatedName("br.j([III)V")
    public synchronized void method954(int[] arg0, int arg1, int arg2) {
        if (this.field1140 == 0 && this.field1137 == 0) {
            this.method956(arg2);
            return;
        }
        class56 var4 = (class56) this.field1144;
        int var5 = this.field1134 << 8;
        int var6 = this.field1126 << 8;
        int var7 = var4.field1112.length << 8;
        int var8 = var6 - var5;
        if (var8 <= 0) {
            this.field1133 = 0;
        }
        int var9 = arg1;
        int var10 = arg1 + arg2;
        if (this.field1128 < 0) {
            if (this.field1135 <= 0) {
                this.method1120();
                this.method3365();
                return;
            }
            this.field1128 = 0;
        }
        if (this.field1128 >= var7) {
            if (this.field1135 >= 0) {
                this.method1120();
                this.method3365();
                return;
            }
            this.field1128 = var7 - 1;
        }
        if (this.field1133 >= 0) {
            if (this.field1133 > 0) {
                if (this.field1136) {
                    label131: {
                        if (this.field1135 < 0) {
                            var9 = this.method1174(arg0, arg1, var5, var10, var4.field1112[this.field1134]);
                            if (this.field1128 >= var5) {
                                return;
                            }
                            this.field1128 = var5 + var5 - 1 - this.field1128;
                            this.field1135 = -this.field1135;
                            if (--this.field1133 == 0) {
                                break label131;
                            }
                        }
                        do {
                            var9 = this.method1209(arg0, var9, var6, var10, var4.field1112[this.field1126 - 1]);
                            if (this.field1128 < var6) {
                                return;
                            }
                            this.field1128 = var6 + var6 - 1 - this.field1128;
                            this.field1135 = -this.field1135;
                            if (--this.field1133 == 0) {
                                break;
                            }
                            var9 = this.method1174(arg0, var9, var5, var10, var4.field1112[this.field1134]);
                            if (this.field1128 >= var5) {
                                return;
                            }
                            this.field1128 = var5 + var5 - 1 - this.field1128;
                            this.field1135 = -this.field1135;
                        } while (--this.field1133 != 0);
                    }
                } else if (this.field1135 < 0) {
                    while (true) {
                        var9 = this.method1174(arg0, var9, var5, var10, var4.field1112[this.field1126 - 1]);
                        if (this.field1128 >= var5) {
                            return;
                        }
                        int var12 = (var6 - 1 - this.field1128) / var8;
                        if (var12 >= this.field1133) {
                            this.field1128 += this.field1133 * var8;
                            this.field1133 = 0;
                            break;
                        }
                        this.field1128 += var8 * var12;
                        this.field1133 -= var12;
                    }
                } else {
                    while (true) {
                        var9 = this.method1209(arg0, var9, var6, var10, var4.field1112[this.field1134]);
                        if (this.field1128 < var6) {
                            return;
                        }
                        int var13 = (this.field1128 - var5) / var8;
                        if (var13 >= this.field1133) {
                            this.field1128 -= this.field1133 * var8;
                            this.field1133 = 0;
                            break;
                        }
                        this.field1128 -= var8 * var13;
                        this.field1133 -= var13;
                    }
                }
            }
            if (this.field1135 < 0) {
                this.method1174(arg0, var9, 0, var10, 0);
                if (this.field1128 < 0) {
                    this.field1128 = -1;
                    this.method1120();
                    this.method3365();
                }
            } else {
                this.method1209(arg0, var9, var7, var10, 0);
                if (this.field1128 >= var7) {
                    this.field1128 = var7;
                    this.method1120();
                    this.method3365();
                }
            }
        } else if (this.field1136) {
            if (this.field1135 < 0) {
                var9 = this.method1174(arg0, arg1, var5, var10, var4.field1112[this.field1134]);
                if (this.field1128 >= var5) {
                    return;
                }
                this.field1128 = var5 + var5 - 1 - this.field1128;
                this.field1135 = -this.field1135;
            }
            while (true) {
                int var11 = this.method1209(arg0, var9, var6, var10, var4.field1112[this.field1126 - 1]);
                if (this.field1128 < var6) {
                    return;
                }
                this.field1128 = var6 + var6 - 1 - this.field1128;
                this.field1135 = -this.field1135;
                var9 = this.method1174(arg0, var11, var5, var10, var4.field1112[this.field1134]);
                if (this.field1128 >= var5) {
                    return;
                }
                this.field1128 = var5 + var5 - 1 - this.field1128;
                this.field1135 = -this.field1135;
            }
        } else if (this.field1135 < 0) {
            while (true) {
                var9 = this.method1174(arg0, var9, var5, var10, var4.field1112[this.field1126 - 1]);
                if (this.field1128 >= var5) {
                    return;
                }
                this.field1128 = var6 - 1 - (var6 - 1 - this.field1128) % var8;
            }
        } else {
            while (true) {
                var9 = this.method1209(arg0, var9, var6, var10, var4.field1112[this.field1134]);
                if (this.field1128 < var6) {
                    return;
                }
                this.field1128 = (this.field1128 - var5) % var8 + var5;
            }
        }
    }

    @ObfuscatedName("br.d(I)V")
    public synchronized void method956(int arg0) {
        if (this.field1137 > 0) {
            if (arg0 >= this.field1137) {
                if (this.field1140 == Integer.MIN_VALUE) {
                    this.field1140 = 0;
                    this.field1132 = 0;
                    this.field1131 = 0;
                    this.field1130 = 0;
                    this.method3365();
                    arg0 = this.field1137;
                }
                this.field1137 = 0;
                this.method1111();
            } else {
                this.field1130 += this.field1138 * arg0;
                this.field1131 += this.field1139 * arg0;
                this.field1132 += this.field1129 * arg0;
                this.field1137 -= arg0;
            }
        }
        class56 var2 = (class56) this.field1144;
        int var3 = this.field1134 << 8;
        int var4 = this.field1126 << 8;
        int var5 = var2.field1112.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field1133 = 0;
        }
        if (this.field1128 < 0) {
            if (this.field1135 <= 0) {
                this.method1120();
                this.method3365();
                return;
            }
            this.field1128 = 0;
        }
        if (this.field1128 >= var5) {
            if (this.field1135 >= 0) {
                this.method1120();
                this.method3365();
                return;
            }
            this.field1128 = var5 - 1;
        }
        this.field1128 += this.field1135 * arg0;
        if (this.field1133 >= 0) {
            if (this.field1133 > 0) {
                if (this.field1136) {
                    label121: {
                        if (this.field1135 < 0) {
                            if (this.field1128 >= var3) {
                                return;
                            }
                            this.field1128 = var3 + var3 - 1 - this.field1128;
                            this.field1135 = -this.field1135;
                            if (--this.field1133 == 0) {
                                break label121;
                            }
                        }
                        do {
                            if (this.field1128 < var4) {
                                return;
                            }
                            this.field1128 = var4 + var4 - 1 - this.field1128;
                            this.field1135 = -this.field1135;
                            if (--this.field1133 == 0) {
                                break;
                            }
                            if (this.field1128 >= var3) {
                                return;
                            }
                            this.field1128 = var3 + var3 - 1 - this.field1128;
                            this.field1135 = -this.field1135;
                        } while (--this.field1133 != 0);
                    }
                } else {
                    label153: {
                        if (this.field1135 < 0) {
                            if (this.field1128 >= var3) {
                                return;
                            }
                            int var7 = (var4 - 1 - this.field1128) / var6;
                            if (var7 >= this.field1133) {
                                this.field1128 += this.field1133 * var6;
                                this.field1133 = 0;
                                break label153;
                            }
                            this.field1128 += var6 * var7;
                            this.field1133 -= var7;
                        } else if (this.field1128 >= var4) {
                            int var8 = (this.field1128 - var3) / var6;
                            if (var8 >= this.field1133) {
                                this.field1128 -= this.field1133 * var6;
                                this.field1133 = 0;
                                break label153;
                            }
                            this.field1128 -= var6 * var8;
                            this.field1133 -= var8;
                        } else {
                            return;
                        }
                        return;
                    }
                }
            }
            if (this.field1135 < 0) {
                if (this.field1128 < 0) {
                    this.field1128 = -1;
                    this.method1120();
                    this.method3365();
                }
            } else if (this.field1128 >= var5) {
                this.field1128 = var5;
                this.method1120();
                this.method3365();
            }
        } else if (this.field1136) {
            if (this.field1135 < 0) {
                if (this.field1128 >= var3) {
                    return;
                }
                this.field1128 = var3 + var3 - 1 - this.field1128;
                this.field1135 = -this.field1135;
            }
            while (this.field1128 >= var4) {
                this.field1128 = var4 + var4 - 1 - this.field1128;
                this.field1135 = -this.field1135;
                if (this.field1128 >= var3) {
                    return;
                }
                this.field1128 = var3 + var3 - 1 - this.field1128;
                this.field1135 = -this.field1135;
            }
        } else if (this.field1135 < 0) {
            if (this.field1128 >= var3) {
                return;
            }
            this.field1128 = var4 - 1 - (var4 - 1 - this.field1128) % var6;
        } else if (this.field1128 >= var4) {
            this.field1128 = (this.field1128 - var3) % var6 + var3;
        } else {
            return;
        }
    }

    @ObfuscatedName("br.ab([IIIII)I")
    public int method1209(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1137 > 0) {
                int var6 = this.field1137 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1137 += arg1;
                if (this.field1135 == 256 && (this.field1128 & 0xFF) == 0) {
                    if (Statics.field1053) {
                        arg1 = method1187(0, ((class56) this.field1144).field1112, arg0, this.field1128, arg1, this.field1131, this.field1132, this.field1139, this.field1129, 0, var6, arg2, this);
                    } else {
                        arg1 = method1131(((class56) this.field1144).field1112, arg0, this.field1128, arg1, this.field1130, this.field1138, 0, var6, arg2, this);
                    }
                } else if (Statics.field1053) {
                    arg1 = method1143(0, 0, ((class56) this.field1144).field1112, arg0, this.field1128, arg1, this.field1131, this.field1132, this.field1139, this.field1129, 0, var6, arg2, this, this.field1135, arg4);
                } else {
                    arg1 = method1147(0, 0, ((class56) this.field1144).field1112, arg0, this.field1128, arg1, this.field1130, this.field1138, 0, var6, arg2, this, this.field1135, arg4);
                }
                this.field1137 -= arg1;
                if (this.field1137 != 0) {
                    return arg1;
                }
                if (!this.method1186()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1135 == 256 && (this.field1128 & 0xFF) == 0) {
                if (Statics.field1053) {
                    return method1132(0, ((class56) this.field1144).field1112, arg0, this.field1128, arg1, this.field1131, this.field1132, 0, arg3, arg2, this);
                }
                return method1211(((class56) this.field1144).field1112, arg0, this.field1128, arg1, this.field1130, 0, arg3, arg2, this);
            }
            if (Statics.field1053) {
                return method1136(0, 0, ((class56) this.field1144).field1112, arg0, this.field1128, arg1, this.field1131, this.field1132, 0, arg3, arg2, this, this.field1135, arg4);
            }
            return method1135(0, 0, ((class56) this.field1144).field1112, arg0, this.field1128, arg1, this.field1130, 0, arg3, arg2, this, this.field1135, arg4);
        }
    }

    @ObfuscatedName("br.al([IIIII)I")
    public int method1174(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1137 > 0) {
                int var6 = this.field1137 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1137 += arg1;
                if (this.field1135 == -256 && (this.field1128 & 0xFF) == 0) {
                    if (Statics.field1053) {
                        arg1 = method1140(0, ((class56) this.field1144).field1112, arg0, this.field1128, arg1, this.field1131, this.field1132, this.field1139, this.field1129, 0, var6, arg2, this);
                    } else {
                        arg1 = method1141(((class56) this.field1144).field1112, arg0, this.field1128, arg1, this.field1130, this.field1138, 0, var6, arg2, this);
                    }
                } else if (Statics.field1053) {
                    arg1 = method1226(0, 0, ((class56) this.field1144).field1112, arg0, this.field1128, arg1, this.field1131, this.field1132, this.field1139, this.field1129, 0, var6, arg2, this, this.field1135, arg4);
                } else {
                    arg1 = method1144(0, 0, ((class56) this.field1144).field1112, arg0, this.field1128, arg1, this.field1130, this.field1138, 0, var6, arg2, this, this.field1135, arg4);
                }
                this.field1137 -= arg1;
                if (this.field1137 != 0) {
                    return arg1;
                }
                if (!this.method1186()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1135 == -256 && (this.field1128 & 0xFF) == 0) {
                if (Statics.field1053) {
                    return method1149(0, ((class56) this.field1144).field1112, arg0, this.field1128, arg1, this.field1131, this.field1132, 0, arg3, arg2, this);
                }
                return method1232(((class56) this.field1144).field1112, arg0, this.field1128, arg1, this.field1130, 0, arg3, arg2, this);
            }
            if (Statics.field1053) {
                return method1138(0, 0, ((class56) this.field1144).field1112, arg0, this.field1128, arg1, this.field1131, this.field1132, 0, arg3, arg2, this, this.field1135, arg4);
            }
            return method1137(0, 0, ((class56) this.field1144).field1112, arg0, this.field1128, arg1, this.field1130, 0, arg3, arg2, this, this.field1135, arg4);
        }
    }

    @ObfuscatedName("br.as()Z")
    public boolean method1186() {
        int var1 = this.field1140;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method1165(var1, this.field1127);
            var2 = method1106(var1, this.field1127);
        }
        if (this.field1130 != var1 || this.field1131 != var3 || this.field1132 != var2) {
            if (this.field1130 < var1) {
                this.field1138 = 1;
                this.field1137 = var1 - this.field1130;
            } else if (this.field1130 > var1) {
                this.field1138 = -1;
                this.field1137 = this.field1130 - var1;
            } else {
                this.field1138 = 0;
            }
            if (this.field1131 < var3) {
                this.field1139 = 1;
                if (this.field1137 == 0 || this.field1137 > var3 - this.field1131) {
                    this.field1137 = var3 - this.field1131;
                }
            } else if (this.field1131 > var3) {
                this.field1139 = -1;
                if (this.field1137 == 0 || this.field1137 > this.field1131 - var3) {
                    this.field1137 = this.field1131 - var3;
                }
            } else {
                this.field1139 = 0;
            }
            if (this.field1132 < var2) {
                this.field1129 = 1;
                if (this.field1137 == 0 || this.field1137 > var2 - this.field1132) {
                    this.field1137 = var2 - this.field1132;
                }
            } else if (this.field1132 > var2) {
                this.field1129 = -1;
                if (this.field1137 == 0 || this.field1137 > this.field1132 - var2) {
                    this.field1137 = this.field1132 - var2;
                }
            } else {
                this.field1129 = 0;
            }
            return false;
        } else if (this.field1140 == Integer.MIN_VALUE) {
            this.field1140 = 0;
            this.field1132 = 0;
            this.field1131 = 0;
            this.field1130 = 0;
            this.method3365();
            return true;
        } else {
            this.method1111();
            return false;
        }
    }

    @ObfuscatedName("br.au([B[IIIIIIILbr;)I")
    public static int method1211(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class58 arg8) {
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
        arg8.field1128 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("br.ac(I[B[IIIIIIIILbr;)I")
    public static int method1132(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class58 arg10) {
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
        arg10.field1128 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("br.av([B[IIIIIIILbr;)I")
    public static int method1232(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class58 arg8) {
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
        arg8.field1128 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("br.ak(I[B[IIIIIIIILbr;)I")
    public static int method1149(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class58 arg10) {
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
        arg10.field1128 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("br.ae(II[B[IIIIIIILbr;II)I")
    public static int method1135(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class58 arg10, int arg11, int arg12) {
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
        arg10.field1128 = arg4;
        return arg5;
    }

    @ObfuscatedName("br.at(II[B[IIIIIIIILbr;II)I")
    public static int method1136(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class58 arg11, int arg12, int arg13) {
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
        arg11.field1128 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("br.ag(II[B[IIIIIIILbr;II)I")
    public static int method1137(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class58 arg10, int arg11, int arg12) {
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
        arg10.field1128 = arg4;
        return arg5;
    }

    @ObfuscatedName("br.af(II[B[IIIIIIIILbr;II)I")
    public static int method1138(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class58 arg11, int arg12, int arg13) {
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
        arg11.field1128 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("br.am([B[IIIIIIIILbr;)I")
    public static int method1131(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class58 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field1131 += (var14 - arg3) * arg9.field1139;
        arg9.field1132 += (var14 - arg3) * arg9.field1129;
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
        arg9.field1130 = var12 >> 2;
        arg9.field1128 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("br.ah(I[B[IIIIIIIIIILbr;)I")
    public static int method1187(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class58 arg12) {
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
        arg12.field1130 += (var19 - arg4) * arg12.field1138;
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
        arg12.field1131 = var15 >> 2;
        arg12.field1132 = var16 >> 2;
        arg12.field1128 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("br.aq([B[IIIIIIIILbr;)I")
    public static int method1141(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class58 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field1131 += (var14 - arg3) * arg9.field1139;
        arg9.field1132 += (var14 - arg3) * arg9.field1129;
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
        arg9.field1130 = var12 >> 2;
        arg9.field1128 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("br.ax(I[B[IIIIIIIIIILbr;)I")
    public static int method1140(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class58 arg12) {
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
        arg12.field1130 += (var19 - arg4) * arg12.field1138;
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
        arg12.field1131 = var15 >> 2;
        arg12.field1132 = var16 >> 2;
        arg12.field1128 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("br.ad(II[B[IIIIIIIILbr;II)I")
    public static int method1147(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class58 arg11, int arg12, int arg13) {
        arg11.field1131 -= arg11.field1139 * arg5;
        arg11.field1132 -= arg11.field1129 * arg5;
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
        arg11.field1131 += arg11.field1139 * arg5;
        arg11.field1132 += arg11.field1129 * arg5;
        arg11.field1130 = arg6;
        arg11.field1128 = arg4;
        return arg5;
    }

    @ObfuscatedName("br.aa(II[B[IIIIIIIIIILbr;II)I")
    public static int method1143(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class58 arg13, int arg14, int arg15) {
        arg13.field1130 -= arg13.field1138 * arg5;
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
        arg13.field1130 += arg13.field1138 * var27;
        arg13.field1131 = arg6;
        arg13.field1132 = arg7;
        arg13.field1128 = arg4;
        return var27;
    }

    @ObfuscatedName("br.bm(II[B[IIIIIIIILbr;II)I")
    public static int method1144(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class58 arg11, int arg12, int arg13) {
        arg11.field1131 -= arg11.field1139 * arg5;
        arg11.field1132 -= arg11.field1129 * arg5;
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
        arg11.field1131 += arg11.field1139 * arg5;
        arg11.field1132 += arg11.field1129 * arg5;
        arg11.field1130 = arg6;
        arg11.field1128 = arg4;
        return arg5;
    }

    @ObfuscatedName("br.bg(II[B[IIIIIIIIIILbr;II)I")
    public static int method1226(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class58 arg13, int arg14, int arg15) {
        arg13.field1130 -= arg13.field1138 * arg5;
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
        arg13.field1130 += arg13.field1138 * var26;
        arg13.field1131 = arg6;
        arg13.field1132 = arg7;
        arg13.field1128 = arg4;
        return var26;
    }
}
