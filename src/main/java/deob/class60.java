package deob;

@ObfuscatedName("bx")
public class class60 extends class62 {

    @ObfuscatedName("bx.p")
    public int field1201;

    @ObfuscatedName("bx.k")
    public int field1188;

    @ObfuscatedName("bx.e")
    public int field1189;

    @ObfuscatedName("bx.f")
    public int field1190;

    @ObfuscatedName("bx.t")
    public int field1191;

    @ObfuscatedName("bx.s")
    public int field1192;

    @ObfuscatedName("bx.c")
    public int field1193;

    @ObfuscatedName("bx.d")
    public int field1195;

    @ObfuscatedName("bx.v")
    public int field1194;

    @ObfuscatedName("bx.m")
    public int field1197;

    @ObfuscatedName("bx.h")
    public boolean field1187;

    @ObfuscatedName("bx.n")
    public int field1198;

    @ObfuscatedName("bx.x")
    public int field1199;

    @ObfuscatedName("bx.o")
    public int field1200;

    @ObfuscatedName("bx.r")
    public int field1196;

    @ObfuscatedName("bx.p(II)I")
    public static int method1244(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("bx.k(II)I")
    public static int method1134(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("bx.ai()I")
    public int method1135() {
        int var1 = this.field1191 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field1195 == 0) {
            var2 -= this.field1201 * var2 / (((class58) this.field1205).field1171.length << 8);
        } else if (this.field1195 >= 0) {
            var2 -= this.field1194 * var2 / ((class58) this.field1205).field1171.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    public class60(class58 arg0, int arg1, int arg2) {
        this.field1205 = arg0;
        this.field1194 = arg0.field1172;
        this.field1197 = arg0.field1173;
        this.field1187 = arg0.field1174;
        this.field1188 = arg1;
        this.field1189 = arg2;
        this.field1190 = 8192;
        this.field1201 = 0;
        this.method1139();
    }

    public class60(class58 arg0, int arg1, int arg2, int arg3) {
        this.field1205 = arg0;
        this.field1194 = arg0.field1172;
        this.field1197 = arg0.field1173;
        this.field1187 = arg0.field1174;
        this.field1188 = arg1;
        this.field1189 = arg2;
        this.field1190 = arg3;
        this.field1201 = 0;
        this.method1139();
    }

    @ObfuscatedName("bx.e(Lbp;II)Lbx;")
    public static class60 method1137(class58 arg0, int arg1, int arg2) {
        return arg0.field1171 == null || arg0.field1171.length == 0 ? null : new class60(arg0, (int) ((long) arg0.field1170 * 256L * (long) arg1 / (long) (Statics.field1494 * 100)), arg2 << 6);
    }

    @ObfuscatedName("bx.f(Lbp;III)Lbx;")
    public static class60 method1138(class58 arg0, int arg1, int arg2, int arg3) {
        return arg0.field1171 == null || arg0.field1171.length == 0 ? null : new class60(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("bx.w()V")
    public void method1139() {
        this.field1191 = this.field1189;
        this.field1192 = method1244(this.field1189, this.field1190);
        this.field1193 = method1134(this.field1189, this.field1190);
    }

    @ObfuscatedName("bx.v(I)V")
    public synchronized void method1140(int arg0) {
        this.field1195 = arg0;
    }

    @ObfuscatedName("bx.h(I)V")
    public synchronized void method1211(int arg0) {
        this.method1143(arg0 << 6, this.method1145());
    }

    @ObfuscatedName("bx.n(I)V")
    public synchronized void method1141(int arg0) {
        this.method1143(arg0, this.method1145());
    }

    @ObfuscatedName("bx.x(II)V")
    public synchronized void method1143(int arg0, int arg1) {
        this.field1189 = arg0;
        this.field1190 = arg1;
        this.field1198 = 0;
        this.method1139();
    }

    @ObfuscatedName("bx.o()I")
    public synchronized int method1144() {
        return this.field1189 == Integer.MIN_VALUE ? 0 : this.field1189;
    }

    @ObfuscatedName("bx.r()I")
    public synchronized int method1145() {
        return this.field1190 < 0 ? -1 : this.field1190;
    }

    @ObfuscatedName("bx.y(I)V")
    public synchronized void method1159(int arg0) {
        int var2 = ((class58) this.field1205).field1171.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field1201 = arg0;
    }

    @ObfuscatedName("bx.i(Z)V")
    public synchronized void method1147(boolean arg0) {
        this.field1188 = (this.field1188 >>> 31) + (this.field1188 ^ this.field1188 >> 31);
        if (arg0) {
            this.field1188 = -this.field1188;
        }
    }

    @ObfuscatedName("bx.q()V")
    public void method1251() {
        if (this.field1198 == 0) {
            return;
        }
        if (this.field1189 == Integer.MIN_VALUE) {
            this.field1189 = 0;
        }
        this.field1198 = 0;
        this.method1139();
    }

    @ObfuscatedName("bx.g(II)V")
    public synchronized void method1149(int arg0, int arg1) {
        this.method1267(arg0, arg1, this.method1145());
    }

    @ObfuscatedName("bx.l(III)V")
    public synchronized void method1267(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method1143(arg1, arg2);
            return;
        }
        int var4 = method1244(arg1, arg2);
        int var5 = method1134(arg1, arg2);
        if (this.field1192 == var4 && this.field1193 == var5) {
            this.field1198 = 0;
            return;
        }
        int var6 = arg1 - this.field1191;
        if (this.field1191 - arg1 > var6) {
            var6 = this.field1191 - arg1;
        }
        if (var4 - this.field1192 > var6) {
            var6 = var4 - this.field1192;
        }
        if (this.field1192 - var4 > var6) {
            var6 = this.field1192 - var4;
        }
        if (var5 - this.field1193 > var6) {
            var6 = var5 - this.field1193;
        }
        if (this.field1193 - var5 > var6) {
            var6 = this.field1193 - var5;
        }
        if (arg0 > var6) {
            arg0 = var6;
        }
        this.field1198 = arg0;
        this.field1189 = arg1;
        this.field1190 = arg2;
        this.field1199 = (arg1 - this.field1191) / arg0;
        this.field1200 = (var4 - this.field1192) / arg0;
        this.field1196 = (var5 - this.field1193) / arg0;
    }

    @ObfuscatedName("bx.aq(I)V")
    public synchronized void method1209(int arg0) {
        if (arg0 == 0) {
            this.method1141(0);
            this.method3533();
        } else if (this.field1192 == 0 && this.field1193 == 0) {
            this.field1198 = 0;
            this.field1189 = 0;
            this.field1191 = 0;
            this.method3533();
        } else {
            int var2 = -this.field1191;
            if (this.field1191 > var2) {
                var2 = this.field1191;
            }
            if (-this.field1192 > var2) {
                var2 = -this.field1192;
            }
            if (this.field1192 > var2) {
                var2 = this.field1192;
            }
            if (-this.field1193 > var2) {
                var2 = -this.field1193;
            }
            if (this.field1193 > var2) {
                var2 = this.field1193;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field1198 = arg0;
            this.field1189 = Integer.MIN_VALUE;
            this.field1199 = -this.field1191 / arg0;
            this.field1200 = -this.field1192 / arg0;
            this.field1196 = -this.field1193 / arg0;
        }
    }

    @ObfuscatedName("bx.ak(I)V")
    public synchronized void method1170(int arg0) {
        if (this.field1188 < 0) {
            this.field1188 = -arg0;
        } else {
            this.field1188 = arg0;
        }
    }

    @ObfuscatedName("bx.ar()I")
    public synchronized int method1195() {
        return this.field1188 < 0 ? -this.field1188 : this.field1188;
    }

    @ObfuscatedName("bx.ao()Z")
    public boolean method1153() {
        return this.field1201 < 0 || this.field1201 >= ((class58) this.field1205).field1171.length << 8;
    }

    @ObfuscatedName("bx.af()Z")
    public boolean method1154() {
        return this.field1198 != 0;
    }

    @ObfuscatedName("bx.t()Lbv;")
    public class62 method1001() {
        return null;
    }

    @ObfuscatedName("bx.s()Lbv;")
    public class62 method991() {
        return null;
    }

    @ObfuscatedName("bx.c()I")
    public int method992() {
        return this.field1189 == 0 && this.field1198 == 0 ? 0 : 1;
    }

    @ObfuscatedName("bx.d([III)V")
    public synchronized void method986(int[] arg0, int arg1, int arg2) {
        if (this.field1189 == 0 && this.field1198 == 0) {
            this.method995(arg2);
            return;
        }
        class58 var4 = (class58) this.field1205;
        int var5 = this.field1194 << 8;
        int var6 = this.field1197 << 8;
        int var7 = var4.field1171.length << 8;
        int var8 = var6 - var5;
        if (var8 <= 0) {
            this.field1195 = 0;
        }
        int var9 = arg1;
        int var10 = arg1 + arg2;
        if (this.field1201 < 0) {
            if (this.field1188 <= 0) {
                this.method1251();
                this.method3533();
                return;
            }
            this.field1201 = 0;
        }
        if (this.field1201 >= var7) {
            if (this.field1188 >= 0) {
                this.method1251();
                this.method3533();
                return;
            }
            this.field1201 = var7 - 1;
        }
        if (this.field1195 >= 0) {
            if (this.field1195 > 0) {
                if (this.field1187) {
                    label131: {
                        if (this.field1188 < 0) {
                            var9 = this.method1203(arg0, arg1, var5, var10, var4.field1171[this.field1194]);
                            if (this.field1201 >= var5) {
                                return;
                            }
                            this.field1201 = var5 + var5 - 1 - this.field1201;
                            this.field1188 = -this.field1188;
                            if (--this.field1195 == 0) {
                                break label131;
                            }
                        }
                        do {
                            var9 = this.method1151(arg0, var9, var6, var10, var4.field1171[this.field1197 - 1]);
                            if (this.field1201 < var6) {
                                return;
                            }
                            this.field1201 = var6 + var6 - 1 - this.field1201;
                            this.field1188 = -this.field1188;
                            if (--this.field1195 == 0) {
                                break;
                            }
                            var9 = this.method1203(arg0, var9, var5, var10, var4.field1171[this.field1194]);
                            if (this.field1201 >= var5) {
                                return;
                            }
                            this.field1201 = var5 + var5 - 1 - this.field1201;
                            this.field1188 = -this.field1188;
                        } while (--this.field1195 != 0);
                    }
                } else if (this.field1188 < 0) {
                    while (true) {
                        var9 = this.method1203(arg0, var9, var5, var10, var4.field1171[this.field1197 - 1]);
                        if (this.field1201 >= var5) {
                            return;
                        }
                        int var12 = (var6 - 1 - this.field1201) / var8;
                        if (var12 >= this.field1195) {
                            this.field1201 += this.field1195 * var8;
                            this.field1195 = 0;
                            break;
                        }
                        this.field1201 += var8 * var12;
                        this.field1195 -= var12;
                    }
                } else {
                    while (true) {
                        var9 = this.method1151(arg0, var9, var6, var10, var4.field1171[this.field1194]);
                        if (this.field1201 < var6) {
                            return;
                        }
                        int var13 = (this.field1201 - var5) / var8;
                        if (var13 >= this.field1195) {
                            this.field1201 -= this.field1195 * var8;
                            this.field1195 = 0;
                            break;
                        }
                        this.field1201 -= var8 * var13;
                        this.field1195 -= var13;
                    }
                }
            }
            if (this.field1188 < 0) {
                this.method1203(arg0, var9, 0, var10, 0);
                if (this.field1201 < 0) {
                    this.field1201 = -1;
                    this.method1251();
                    this.method3533();
                }
            } else {
                this.method1151(arg0, var9, var7, var10, 0);
                if (this.field1201 >= var7) {
                    this.field1201 = var7;
                    this.method1251();
                    this.method3533();
                }
            }
        } else if (this.field1187) {
            if (this.field1188 < 0) {
                var9 = this.method1203(arg0, arg1, var5, var10, var4.field1171[this.field1194]);
                if (this.field1201 >= var5) {
                    return;
                }
                this.field1201 = var5 + var5 - 1 - this.field1201;
                this.field1188 = -this.field1188;
            }
            while (true) {
                int var11 = this.method1151(arg0, var9, var6, var10, var4.field1171[this.field1197 - 1]);
                if (this.field1201 < var6) {
                    return;
                }
                this.field1201 = var6 + var6 - 1 - this.field1201;
                this.field1188 = -this.field1188;
                var9 = this.method1203(arg0, var11, var5, var10, var4.field1171[this.field1194]);
                if (this.field1201 >= var5) {
                    return;
                }
                this.field1201 = var5 + var5 - 1 - this.field1201;
                this.field1188 = -this.field1188;
            }
        } else if (this.field1188 < 0) {
            while (true) {
                var9 = this.method1203(arg0, var9, var5, var10, var4.field1171[this.field1197 - 1]);
                if (this.field1201 >= var5) {
                    return;
                }
                this.field1201 = var6 - 1 - (var6 - 1 - this.field1201) % var8;
            }
        } else {
            while (true) {
                var9 = this.method1151(arg0, var9, var6, var10, var4.field1171[this.field1194]);
                if (this.field1201 < var6) {
                    return;
                }
                this.field1201 = (this.field1201 - var5) % var8 + var5;
            }
        }
    }

    @ObfuscatedName("bx.m(I)V")
    public synchronized void method995(int arg0) {
        if (this.field1198 > 0) {
            if (arg0 >= this.field1198) {
                if (this.field1189 == Integer.MIN_VALUE) {
                    this.field1189 = 0;
                    this.field1193 = 0;
                    this.field1192 = 0;
                    this.field1191 = 0;
                    this.method3533();
                    arg0 = this.field1198;
                }
                this.field1198 = 0;
                this.method1139();
            } else {
                this.field1191 += this.field1199 * arg0;
                this.field1192 += this.field1200 * arg0;
                this.field1193 += this.field1196 * arg0;
                this.field1198 -= arg0;
            }
        }
        class58 var2 = (class58) this.field1205;
        int var3 = this.field1194 << 8;
        int var4 = this.field1197 << 8;
        int var5 = var2.field1171.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field1195 = 0;
        }
        if (this.field1201 < 0) {
            if (this.field1188 <= 0) {
                this.method1251();
                this.method3533();
                return;
            }
            this.field1201 = 0;
        }
        if (this.field1201 >= var5) {
            if (this.field1188 >= 0) {
                this.method1251();
                this.method3533();
                return;
            }
            this.field1201 = var5 - 1;
        }
        this.field1201 += this.field1188 * arg0;
        if (this.field1195 >= 0) {
            if (this.field1195 > 0) {
                if (this.field1187) {
                    label121: {
                        if (this.field1188 < 0) {
                            if (this.field1201 >= var3) {
                                return;
                            }
                            this.field1201 = var3 + var3 - 1 - this.field1201;
                            this.field1188 = -this.field1188;
                            if (--this.field1195 == 0) {
                                break label121;
                            }
                        }
                        do {
                            if (this.field1201 < var4) {
                                return;
                            }
                            this.field1201 = var4 + var4 - 1 - this.field1201;
                            this.field1188 = -this.field1188;
                            if (--this.field1195 == 0) {
                                break;
                            }
                            if (this.field1201 >= var3) {
                                return;
                            }
                            this.field1201 = var3 + var3 - 1 - this.field1201;
                            this.field1188 = -this.field1188;
                        } while (--this.field1195 != 0);
                    }
                } else {
                    label153: {
                        if (this.field1188 < 0) {
                            if (this.field1201 >= var3) {
                                return;
                            }
                            int var7 = (var4 - 1 - this.field1201) / var6;
                            if (var7 >= this.field1195) {
                                this.field1201 += this.field1195 * var6;
                                this.field1195 = 0;
                                break label153;
                            }
                            this.field1201 += var6 * var7;
                            this.field1195 -= var7;
                        } else if (this.field1201 >= var4) {
                            int var8 = (this.field1201 - var3) / var6;
                            if (var8 >= this.field1195) {
                                this.field1201 -= this.field1195 * var6;
                                this.field1195 = 0;
                                break label153;
                            }
                            this.field1201 -= var6 * var8;
                            this.field1195 -= var8;
                        } else {
                            return;
                        }
                        return;
                    }
                }
            }
            if (this.field1188 < 0) {
                if (this.field1201 < 0) {
                    this.field1201 = -1;
                    this.method1251();
                    this.method3533();
                }
            } else if (this.field1201 >= var5) {
                this.field1201 = var5;
                this.method1251();
                this.method3533();
            }
        } else if (this.field1187) {
            if (this.field1188 < 0) {
                if (this.field1201 >= var3) {
                    return;
                }
                this.field1201 = var3 + var3 - 1 - this.field1201;
                this.field1188 = -this.field1188;
            }
            while (this.field1201 >= var4) {
                this.field1201 = var4 + var4 - 1 - this.field1201;
                this.field1188 = -this.field1188;
                if (this.field1201 >= var3) {
                    return;
                }
                this.field1201 = var3 + var3 - 1 - this.field1201;
                this.field1188 = -this.field1188;
            }
        } else if (this.field1188 < 0) {
            if (this.field1201 >= var3) {
                return;
            }
            this.field1201 = var4 - 1 - (var4 - 1 - this.field1201) % var6;
        } else if (this.field1201 >= var4) {
            this.field1201 = (this.field1201 - var3) % var6 + var3;
        } else {
            return;
        }
    }

    @ObfuscatedName("bx.aj([IIIII)I")
    public int method1151(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1198 > 0) {
                int var6 = this.field1198 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1198 += arg1;
                if (this.field1188 == 256 && (this.field1201 & 0xFF) == 0) {
                    if (Statics.field1128) {
                        arg1 = method1168(0, ((class58) this.field1205).field1171, arg0, this.field1201, arg1, this.field1192, this.field1193, this.field1200, this.field1196, 0, var6, arg2, this);
                    } else {
                        arg1 = method1167(((class58) this.field1205).field1171, arg0, this.field1201, arg1, this.field1191, this.field1199, 0, var6, arg2, this);
                    }
                } else if (Statics.field1128) {
                    arg1 = method1172(0, 0, ((class58) this.field1205).field1171, arg0, this.field1201, arg1, this.field1192, this.field1193, this.field1200, this.field1196, 0, var6, arg2, this, this.field1188, arg4);
                } else {
                    arg1 = method1152(0, 0, ((class58) this.field1205).field1171, arg0, this.field1201, arg1, this.field1191, this.field1199, 0, var6, arg2, this, this.field1188, arg4);
                }
                this.field1198 -= arg1;
                if (this.field1198 != 0) {
                    return arg1;
                }
                if (!this.method1217()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1188 == 256 && (this.field1201 & 0xFF) == 0) {
                if (Statics.field1128) {
                    return method1161(0, ((class58) this.field1205).field1171, arg0, this.field1201, arg1, this.field1192, this.field1193, 0, arg3, arg2, this);
                }
                return method1160(((class58) this.field1205).field1171, arg0, this.field1201, arg1, this.field1191, 0, arg3, arg2, this);
            }
            if (Statics.field1128) {
                return method1181(0, 0, ((class58) this.field1205).field1171, arg0, this.field1201, arg1, this.field1192, this.field1193, 0, arg3, arg2, this, this.field1188, arg4);
            }
            return method1163(0, 0, ((class58) this.field1205).field1171, arg0, this.field1201, arg1, this.field1191, 0, arg3, arg2, this, this.field1188, arg4);
        }
    }

    @ObfuscatedName("bx.aw([IIIII)I")
    public int method1203(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1198 > 0) {
                int var6 = this.field1198 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1198 += arg1;
                if (this.field1188 == -256 && (this.field1201 & 0xFF) == 0) {
                    if (Statics.field1128) {
                        arg1 = method1201(0, ((class58) this.field1205).field1171, arg0, this.field1201, arg1, this.field1192, this.field1193, this.field1200, this.field1196, 0, var6, arg2, this);
                    } else {
                        arg1 = method1174(((class58) this.field1205).field1171, arg0, this.field1201, arg1, this.field1191, this.field1199, 0, var6, arg2, this);
                    }
                } else if (Statics.field1128) {
                    arg1 = method1202(0, 0, ((class58) this.field1205).field1171, arg0, this.field1201, arg1, this.field1192, this.field1193, this.field1200, this.field1196, 0, var6, arg2, this, this.field1188, arg4);
                } else {
                    arg1 = method1146(0, 0, ((class58) this.field1205).field1171, arg0, this.field1201, arg1, this.field1191, this.field1199, 0, var6, arg2, this, this.field1188, arg4);
                }
                this.field1198 -= arg1;
                if (this.field1198 != 0) {
                    return arg1;
                }
                if (!this.method1217()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1188 == -256 && (this.field1201 & 0xFF) == 0) {
                if (Statics.field1128) {
                    return method1162(0, ((class58) this.field1205).field1171, arg0, this.field1201, arg1, this.field1192, this.field1193, 0, arg3, arg2, this);
                }
                return method1212(((class58) this.field1205).field1171, arg0, this.field1201, arg1, this.field1191, 0, arg3, arg2, this);
            }
            if (Statics.field1128) {
                return method1166(0, 0, ((class58) this.field1205).field1171, arg0, this.field1201, arg1, this.field1192, this.field1193, 0, arg3, arg2, this, this.field1188, arg4);
            }
            return method1165(0, 0, ((class58) this.field1205).field1171, arg0, this.field1201, arg1, this.field1191, 0, arg3, arg2, this, this.field1188, arg4);
        }
    }

    @ObfuscatedName("bx.ab()Z")
    public boolean method1217() {
        int var1 = this.field1189;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method1244(var1, this.field1190);
            var2 = method1134(var1, this.field1190);
        }
        if (this.field1191 != var1 || this.field1192 != var3 || this.field1193 != var2) {
            if (this.field1191 < var1) {
                this.field1199 = 1;
                this.field1198 = var1 - this.field1191;
            } else if (this.field1191 > var1) {
                this.field1199 = -1;
                this.field1198 = this.field1191 - var1;
            } else {
                this.field1199 = 0;
            }
            if (this.field1192 < var3) {
                this.field1200 = 1;
                if (this.field1198 == 0 || this.field1198 > var3 - this.field1192) {
                    this.field1198 = var3 - this.field1192;
                }
            } else if (this.field1192 > var3) {
                this.field1200 = -1;
                if (this.field1198 == 0 || this.field1198 > this.field1192 - var3) {
                    this.field1198 = this.field1192 - var3;
                }
            } else {
                this.field1200 = 0;
            }
            if (this.field1193 < var2) {
                this.field1196 = 1;
                if (this.field1198 == 0 || this.field1198 > var2 - this.field1193) {
                    this.field1198 = var2 - this.field1193;
                }
            } else if (this.field1193 > var2) {
                this.field1196 = -1;
                if (this.field1198 == 0 || this.field1198 > this.field1193 - var2) {
                    this.field1198 = this.field1193 - var2;
                }
            } else {
                this.field1196 = 0;
            }
            return false;
        } else if (this.field1189 == Integer.MIN_VALUE) {
            this.field1189 = 0;
            this.field1193 = 0;
            this.field1192 = 0;
            this.field1191 = 0;
            this.method3533();
            return true;
        } else {
            this.method1139();
            return false;
        }
    }

    @ObfuscatedName("bx.ad([B[IIIIIIILbx;)I")
    public static int method1160(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class60 arg8) {
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
        arg8.field1201 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("bx.ae(I[B[IIIIIIIILbx;)I")
    public static int method1161(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class60 arg10) {
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
        arg10.field1201 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("bx.ay([B[IIIIIIILbx;)I")
    public static int method1212(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class60 arg8) {
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
        arg8.field1201 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("bx.ap(I[B[IIIIIIIILbx;)I")
    public static int method1162(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class60 arg10) {
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
        arg10.field1201 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("bx.av(II[B[IIIIIIILbx;II)I")
    public static int method1163(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class60 arg10, int arg11, int arg12) {
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
        arg10.field1201 = arg4;
        return arg5;
    }

    @ObfuscatedName("bx.ah(II[B[IIIIIIIILbx;II)I")
    public static int method1181(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class60 arg11, int arg12, int arg13) {
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
        arg11.field1201 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("bx.at(II[B[IIIIIIILbx;II)I")
    public static int method1165(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class60 arg10, int arg11, int arg12) {
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
        arg10.field1201 = arg4;
        return arg5;
    }

    @ObfuscatedName("bx.an(II[B[IIIIIIIILbx;II)I")
    public static int method1166(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class60 arg11, int arg12, int arg13) {
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
        arg11.field1201 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("bx.ac([B[IIIIIIIILbx;)I")
    public static int method1167(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class60 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field1192 += (var14 - arg3) * arg9.field1200;
        arg9.field1193 += (var14 - arg3) * arg9.field1196;
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
        arg9.field1191 = var12 >> 2;
        arg9.field1201 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("bx.as(I[B[IIIIIIIIIILbx;)I")
    public static int method1168(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class60 arg12) {
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
        arg12.field1191 += (var19 - arg4) * arg12.field1199;
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
        arg12.field1192 = var15 >> 2;
        arg12.field1193 = var16 >> 2;
        arg12.field1201 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("bx.ax([B[IIIIIIIILbx;)I")
    public static int method1174(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class60 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field1192 += (var14 - arg3) * arg9.field1200;
        arg9.field1193 += (var14 - arg3) * arg9.field1196;
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
        arg9.field1191 = var12 >> 2;
        arg9.field1201 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("bx.bg(I[B[IIIIIIIIIILbx;)I")
    public static int method1201(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class60 arg12) {
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
        arg12.field1191 += (var19 - arg4) * arg12.field1199;
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
        arg12.field1192 = var15 >> 2;
        arg12.field1193 = var16 >> 2;
        arg12.field1201 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("bx.bw(II[B[IIIIIIIILbx;II)I")
    public static int method1152(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class60 arg11, int arg12, int arg13) {
        arg11.field1192 -= arg11.field1200 * arg5;
        arg11.field1193 -= arg11.field1196 * arg5;
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
        arg11.field1192 += arg11.field1200 * arg5;
        arg11.field1193 += arg11.field1196 * arg5;
        arg11.field1191 = arg6;
        arg11.field1201 = arg4;
        return arg5;
    }

    @ObfuscatedName("bx.bn(II[B[IIIIIIIIIILbx;II)I")
    public static int method1172(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class60 arg13, int arg14, int arg15) {
        arg13.field1191 -= arg13.field1199 * arg5;
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
        arg13.field1191 += arg13.field1199 * var27;
        arg13.field1192 = arg6;
        arg13.field1193 = arg7;
        arg13.field1201 = arg4;
        return var27;
    }

    @ObfuscatedName("bx.by(II[B[IIIIIIIILbx;II)I")
    public static int method1146(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class60 arg11, int arg12, int arg13) {
        arg11.field1192 -= arg11.field1200 * arg5;
        arg11.field1193 -= arg11.field1196 * arg5;
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
        arg11.field1192 += arg11.field1200 * arg5;
        arg11.field1193 += arg11.field1196 * arg5;
        arg11.field1191 = arg6;
        arg11.field1201 = arg4;
        return arg5;
    }

    @ObfuscatedName("bx.bb(II[B[IIIIIIIIIILbx;II)I")
    public static int method1202(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class60 arg13, int arg14, int arg15) {
        arg13.field1191 -= arg13.field1199 * arg5;
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
        arg13.field1191 += arg13.field1199 * var26;
        arg13.field1192 = arg6;
        arg13.field1193 = arg7;
        arg13.field1201 = arg4;
        return var26;
    }
}
