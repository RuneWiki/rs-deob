package deob;

@ObfuscatedName("bi")
public class class60 extends class62 {

    @ObfuscatedName("bi.t")
    public int field1169;

    @ObfuscatedName("bi.b")
    public int field1160;

    @ObfuscatedName("bi.p")
    public int field1161;

    @ObfuscatedName("bi.e")
    public int field1172;

    @ObfuscatedName("bi.i")
    public int field1158;

    @ObfuscatedName("bi.o")
    public int field1163;

    @ObfuscatedName("bi.f")
    public int field1164;

    @ObfuscatedName("bi.d")
    public int field1165;

    @ObfuscatedName("bi.j")
    public int field1166;

    @ObfuscatedName("bi.x")
    public int field1167;

    @ObfuscatedName("bi.v")
    public boolean field1168;

    @ObfuscatedName("bi.a")
    public int field1162;

    @ObfuscatedName("bi.l")
    public int field1170;

    @ObfuscatedName("bi.h")
    public int field1159;

    @ObfuscatedName("bi.c")
    public int field1171;

    @ObfuscatedName("bi.t(II)I")
    public static int method1232(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("bi.b(II)I")
    public static int method1280(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("bi.aa()I")
    public int method1184() {
        int var1 = this.field1158 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field1165 == 0) {
            var2 -= this.field1169 * var2 / (((class58) this.field1174).field1144.length << 8);
        } else if (this.field1165 >= 0) {
            var2 -= this.field1166 * var2 / ((class58) this.field1174).field1144.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    public class60(class58 arg0, int arg1, int arg2) {
        this.field1174 = arg0;
        this.field1166 = arg0.field1143;
        this.field1167 = arg0.field1142;
        this.field1168 = arg0.field1145;
        this.field1160 = arg1;
        this.field1161 = arg2;
        this.field1172 = 8192;
        this.field1169 = 0;
        this.method1188();
    }

    public class60(class58 arg0, int arg1, int arg2, int arg3) {
        this.field1174 = arg0;
        this.field1166 = arg0.field1143;
        this.field1167 = arg0.field1142;
        this.field1168 = arg0.field1145;
        this.field1160 = arg1;
        this.field1161 = arg2;
        this.field1172 = arg3;
        this.field1169 = 0;
        this.method1188();
    }

    @ObfuscatedName("bi.p(Lbl;II)Lbi;")
    public static class60 method1186(class58 arg0, int arg1, int arg2) {
        return arg0.field1144 == null || arg0.field1144.length == 0 ? null : new class60(arg0, (int) ((long) arg0.field1141 * 256L * (long) arg1 / (long) (Statics.field1106 * 100)), arg2 << 6);
    }

    @ObfuscatedName("bi.e(Lbl;III)Lbi;")
    public static class60 method1260(class58 arg0, int arg1, int arg2, int arg3) {
        return arg0.field1144 == null || arg0.field1144.length == 0 ? null : new class60(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("bi.i()V")
    public void method1188() {
        this.field1158 = this.field1161;
        this.field1163 = method1232(this.field1161, this.field1172);
        this.field1164 = method1280(this.field1161, this.field1172);
    }

    @ObfuscatedName("bi.x(I)V")
    public synchronized void method1189(int arg0) {
        this.field1165 = arg0;
    }

    @ObfuscatedName("bi.a(I)V")
    public synchronized void method1195(int arg0) {
        this.method1302(arg0 << 6, this.method1194());
    }

    @ObfuscatedName("bi.l(I)V")
    public synchronized void method1251(int arg0) {
        this.method1302(arg0, this.method1194());
    }

    @ObfuscatedName("bi.h(II)V")
    public synchronized void method1302(int arg0, int arg1) {
        this.field1161 = arg0;
        this.field1172 = arg1;
        this.field1162 = 0;
        this.method1188();
    }

    @ObfuscatedName("bi.c()I")
    public synchronized int method1193() {
        return this.field1161 == Integer.MIN_VALUE ? 0 : this.field1161;
    }

    @ObfuscatedName("bi.u()I")
    public synchronized int method1194() {
        return this.field1172 < 0 ? -1 : this.field1172;
    }

    @ObfuscatedName("bi.r(I)V")
    public synchronized void method1199(int arg0) {
        int var2 = ((class58) this.field1174).field1144.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field1169 = arg0;
    }

    @ObfuscatedName("bi.k(Z)V")
    public synchronized void method1227(boolean arg0) {
        this.field1160 = (this.field1160 >>> 31) + (this.field1160 ^ this.field1160 >> 31);
        if (arg0) {
            this.field1160 = -this.field1160;
        }
    }

    @ObfuscatedName("bi.w()V")
    public void method1197() {
        if (this.field1162 == 0) {
            return;
        }
        if (this.field1161 == Integer.MIN_VALUE) {
            this.field1161 = 0;
        }
        this.field1162 = 0;
        this.method1188();
    }

    @ObfuscatedName("bi.q(II)V")
    public synchronized void method1198(int arg0, int arg1) {
        this.method1310(arg0, arg1, this.method1194());
    }

    @ObfuscatedName("bi.g(III)V")
    public synchronized void method1310(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method1302(arg1, arg2);
            return;
        }
        int var4 = method1232(arg1, arg2);
        int var5 = method1280(arg1, arg2);
        if (this.field1163 == var4 && this.field1164 == var5) {
            this.field1162 = 0;
            return;
        }
        int var6 = arg1 - this.field1158;
        if (this.field1158 - arg1 > var6) {
            var6 = this.field1158 - arg1;
        }
        if (var4 - this.field1163 > var6) {
            var6 = var4 - this.field1163;
        }
        if (this.field1163 - var4 > var6) {
            var6 = this.field1163 - var4;
        }
        if (var5 - this.field1164 > var6) {
            var6 = var5 - this.field1164;
        }
        if (this.field1164 - var5 > var6) {
            var6 = this.field1164 - var5;
        }
        if (arg0 > var6) {
            arg0 = var6;
        }
        this.field1162 = arg0;
        this.field1161 = arg1;
        this.field1172 = arg2;
        this.field1170 = (arg1 - this.field1158) / arg0;
        this.field1159 = (var4 - this.field1163) / arg0;
        this.field1171 = (var5 - this.field1164) / arg0;
    }

    @ObfuscatedName("bi.z(I)V")
    public synchronized void method1205(int arg0) {
        if (arg0 == 0) {
            this.method1251(0);
            this.method3506();
        } else if (this.field1163 == 0 && this.field1164 == 0) {
            this.field1162 = 0;
            this.field1161 = 0;
            this.field1158 = 0;
            this.method3506();
        } else {
            int var2 = -this.field1158;
            if (this.field1158 > var2) {
                var2 = this.field1158;
            }
            if (-this.field1163 > var2) {
                var2 = -this.field1163;
            }
            if (this.field1163 > var2) {
                var2 = this.field1163;
            }
            if (-this.field1164 > var2) {
                var2 = -this.field1164;
            }
            if (this.field1164 > var2) {
                var2 = this.field1164;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field1162 = arg0;
            this.field1161 = Integer.MIN_VALUE;
            this.field1170 = -this.field1158 / arg0;
            this.field1159 = -this.field1163 / arg0;
            this.field1171 = -this.field1164 / arg0;
        }
    }

    @ObfuscatedName("bi.m(I)V")
    public synchronized void method1200(int arg0) {
        if (this.field1160 < 0) {
            this.field1160 = -arg0;
        } else {
            this.field1160 = arg0;
        }
    }

    @ObfuscatedName("bi.y()I")
    public synchronized int method1183() {
        return this.field1160 < 0 ? -this.field1160 : this.field1160;
    }

    @ObfuscatedName("bi.n()Z")
    public boolean method1283() {
        return this.field1169 < 0 || this.field1169 >= ((class58) this.field1174).field1144.length << 8;
    }

    @ObfuscatedName("bi.s()Z")
    public boolean method1204() {
        return this.field1162 != 0;
    }

    @ObfuscatedName("bi.o()Lbw;")
    public class62 method1038() {
        return null;
    }

    @ObfuscatedName("bi.f()Lbw;")
    public class62 method1047() {
        return null;
    }

    @ObfuscatedName("bi.d()I")
    public int method1040() {
        return this.field1161 == 0 && this.field1162 == 0 ? 0 : 1;
    }

    @ObfuscatedName("bi.j([III)V")
    public synchronized void method1041(int[] arg0, int arg1, int arg2) {
        if (this.field1161 == 0 && this.field1162 == 0) {
            this.method1043(arg2);
            return;
        }
        class58 var4 = (class58) this.field1174;
        int var5 = this.field1166 << 8;
        int var6 = this.field1167 << 8;
        int var7 = var4.field1144.length << 8;
        int var8 = var6 - var5;
        if (var8 <= 0) {
            this.field1165 = 0;
        }
        int var9 = arg1;
        int var10 = arg1 + arg2;
        if (this.field1169 < 0) {
            if (this.field1160 <= 0) {
                this.method1197();
                this.method3506();
                return;
            }
            this.field1169 = 0;
        }
        if (this.field1169 >= var7) {
            if (this.field1160 >= 0) {
                this.method1197();
                this.method3506();
                return;
            }
            this.field1169 = var7 - 1;
        }
        if (this.field1165 >= 0) {
            if (this.field1165 > 0) {
                if (this.field1168) {
                    label131: {
                        if (this.field1160 < 0) {
                            var9 = this.method1208(arg0, arg1, var5, var10, var4.field1144[this.field1166]);
                            if (this.field1169 >= var5) {
                                return;
                            }
                            this.field1169 = var5 + var5 - 1 - this.field1169;
                            this.field1160 = -this.field1160;
                            if (--this.field1165 == 0) {
                                break label131;
                            }
                        }
                        do {
                            var9 = this.method1207(arg0, var9, var6, var10, var4.field1144[this.field1167 - 1]);
                            if (this.field1169 < var6) {
                                return;
                            }
                            this.field1169 = var6 + var6 - 1 - this.field1169;
                            this.field1160 = -this.field1160;
                            if (--this.field1165 == 0) {
                                break;
                            }
                            var9 = this.method1208(arg0, var9, var5, var10, var4.field1144[this.field1166]);
                            if (this.field1169 >= var5) {
                                return;
                            }
                            this.field1169 = var5 + var5 - 1 - this.field1169;
                            this.field1160 = -this.field1160;
                        } while (--this.field1165 != 0);
                    }
                } else if (this.field1160 < 0) {
                    while (true) {
                        var9 = this.method1208(arg0, var9, var5, var10, var4.field1144[this.field1167 - 1]);
                        if (this.field1169 >= var5) {
                            return;
                        }
                        int var12 = (var6 - 1 - this.field1169) / var8;
                        if (var12 >= this.field1165) {
                            this.field1169 += this.field1165 * var8;
                            this.field1165 = 0;
                            break;
                        }
                        this.field1169 += var8 * var12;
                        this.field1165 -= var12;
                    }
                } else {
                    while (true) {
                        var9 = this.method1207(arg0, var9, var6, var10, var4.field1144[this.field1166]);
                        if (this.field1169 < var6) {
                            return;
                        }
                        int var13 = (this.field1169 - var5) / var8;
                        if (var13 >= this.field1165) {
                            this.field1169 -= this.field1165 * var8;
                            this.field1165 = 0;
                            break;
                        }
                        this.field1169 -= var8 * var13;
                        this.field1165 -= var13;
                    }
                }
            }
            if (this.field1160 < 0) {
                this.method1208(arg0, var9, 0, var10, 0);
                if (this.field1169 < 0) {
                    this.field1169 = -1;
                    this.method1197();
                    this.method3506();
                }
            } else {
                this.method1207(arg0, var9, var7, var10, 0);
                if (this.field1169 >= var7) {
                    this.field1169 = var7;
                    this.method1197();
                    this.method3506();
                }
            }
        } else if (this.field1168) {
            if (this.field1160 < 0) {
                var9 = this.method1208(arg0, arg1, var5, var10, var4.field1144[this.field1166]);
                if (this.field1169 >= var5) {
                    return;
                }
                this.field1169 = var5 + var5 - 1 - this.field1169;
                this.field1160 = -this.field1160;
            }
            while (true) {
                int var11 = this.method1207(arg0, var9, var6, var10, var4.field1144[this.field1167 - 1]);
                if (this.field1169 < var6) {
                    return;
                }
                this.field1169 = var6 + var6 - 1 - this.field1169;
                this.field1160 = -this.field1160;
                var9 = this.method1208(arg0, var11, var5, var10, var4.field1144[this.field1166]);
                if (this.field1169 >= var5) {
                    return;
                }
                this.field1169 = var5 + var5 - 1 - this.field1169;
                this.field1160 = -this.field1160;
            }
        } else if (this.field1160 < 0) {
            while (true) {
                var9 = this.method1208(arg0, var9, var5, var10, var4.field1144[this.field1167 - 1]);
                if (this.field1169 >= var5) {
                    return;
                }
                this.field1169 = var6 - 1 - (var6 - 1 - this.field1169) % var8;
            }
        } else {
            while (true) {
                var9 = this.method1207(arg0, var9, var6, var10, var4.field1144[this.field1166]);
                if (this.field1169 < var6) {
                    return;
                }
                this.field1169 = (this.field1169 - var5) % var8 + var5;
            }
        }
    }

    @ObfuscatedName("bi.v(I)V")
    public synchronized void method1043(int arg0) {
        if (this.field1162 > 0) {
            if (arg0 >= this.field1162) {
                if (this.field1161 == Integer.MIN_VALUE) {
                    this.field1161 = 0;
                    this.field1164 = 0;
                    this.field1163 = 0;
                    this.field1158 = 0;
                    this.method3506();
                    arg0 = this.field1162;
                }
                this.field1162 = 0;
                this.method1188();
            } else {
                this.field1158 += this.field1170 * arg0;
                this.field1163 += this.field1159 * arg0;
                this.field1164 += this.field1171 * arg0;
                this.field1162 -= arg0;
            }
        }
        class58 var2 = (class58) this.field1174;
        int var3 = this.field1166 << 8;
        int var4 = this.field1167 << 8;
        int var5 = var2.field1144.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field1165 = 0;
        }
        if (this.field1169 < 0) {
            if (this.field1160 <= 0) {
                this.method1197();
                this.method3506();
                return;
            }
            this.field1169 = 0;
        }
        if (this.field1169 >= var5) {
            if (this.field1160 >= 0) {
                this.method1197();
                this.method3506();
                return;
            }
            this.field1169 = var5 - 1;
        }
        this.field1169 += this.field1160 * arg0;
        if (this.field1165 >= 0) {
            if (this.field1165 > 0) {
                if (this.field1168) {
                    label121: {
                        if (this.field1160 < 0) {
                            if (this.field1169 >= var3) {
                                return;
                            }
                            this.field1169 = var3 + var3 - 1 - this.field1169;
                            this.field1160 = -this.field1160;
                            if (--this.field1165 == 0) {
                                break label121;
                            }
                        }
                        do {
                            if (this.field1169 < var4) {
                                return;
                            }
                            this.field1169 = var4 + var4 - 1 - this.field1169;
                            this.field1160 = -this.field1160;
                            if (--this.field1165 == 0) {
                                break;
                            }
                            if (this.field1169 >= var3) {
                                return;
                            }
                            this.field1169 = var3 + var3 - 1 - this.field1169;
                            this.field1160 = -this.field1160;
                        } while (--this.field1165 != 0);
                    }
                } else {
                    label153: {
                        if (this.field1160 < 0) {
                            if (this.field1169 >= var3) {
                                return;
                            }
                            int var7 = (var4 - 1 - this.field1169) / var6;
                            if (var7 >= this.field1165) {
                                this.field1169 += this.field1165 * var6;
                                this.field1165 = 0;
                                break label153;
                            }
                            this.field1169 += var6 * var7;
                            this.field1165 -= var7;
                        } else if (this.field1169 >= var4) {
                            int var8 = (this.field1169 - var3) / var6;
                            if (var8 >= this.field1165) {
                                this.field1169 -= this.field1165 * var6;
                                this.field1165 = 0;
                                break label153;
                            }
                            this.field1169 -= var6 * var8;
                            this.field1165 -= var8;
                        } else {
                            return;
                        }
                        return;
                    }
                }
            }
            if (this.field1160 < 0) {
                if (this.field1169 < 0) {
                    this.field1169 = -1;
                    this.method1197();
                    this.method3506();
                }
            } else if (this.field1169 >= var5) {
                this.field1169 = var5;
                this.method1197();
                this.method3506();
            }
        } else if (this.field1168) {
            if (this.field1160 < 0) {
                if (this.field1169 >= var3) {
                    return;
                }
                this.field1169 = var3 + var3 - 1 - this.field1169;
                this.field1160 = -this.field1160;
            }
            while (this.field1169 >= var4) {
                this.field1169 = var4 + var4 - 1 - this.field1169;
                this.field1160 = -this.field1160;
                if (this.field1169 >= var3) {
                    return;
                }
                this.field1169 = var3 + var3 - 1 - this.field1169;
                this.field1160 = -this.field1160;
            }
        } else if (this.field1160 < 0) {
            if (this.field1169 >= var3) {
                return;
            }
            this.field1169 = var4 - 1 - (var4 - 1 - this.field1169) % var6;
        } else if (this.field1169 >= var4) {
            this.field1169 = (this.field1169 - var3) % var6 + var3;
        } else {
            return;
        }
    }

    @ObfuscatedName("bi.ak([IIIII)I")
    public int method1207(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1162 > 0) {
                int var6 = this.field1162 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1162 += arg1;
                if (this.field1160 == 256 && (this.field1169 & 0xFF) == 0) {
                    if (Statics.field1089) {
                        arg1 = method1218(0, ((class58) this.field1174).field1144, arg0, this.field1169, arg1, this.field1163, this.field1164, this.field1159, this.field1171, 0, var6, arg2, this);
                    } else {
                        arg1 = method1217(((class58) this.field1174).field1144, arg0, this.field1169, arg1, this.field1158, this.field1170, 0, var6, arg2, this);
                    }
                } else if (Statics.field1089) {
                    arg1 = method1221(0, 0, ((class58) this.field1174).field1144, arg0, this.field1169, arg1, this.field1163, this.field1164, this.field1159, this.field1171, 0, var6, arg2, this, this.field1160, arg4);
                } else {
                    arg1 = method1220(0, 0, ((class58) this.field1174).field1144, arg0, this.field1169, arg1, this.field1158, this.field1170, 0, var6, arg2, this, this.field1160, arg4);
                }
                this.field1162 -= arg1;
                if (this.field1162 != 0) {
                    return arg1;
                }
                if (!this.method1190()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1160 == 256 && (this.field1169 & 0xFF) == 0) {
                if (Statics.field1089) {
                    return method1211(0, ((class58) this.field1174).field1144, arg0, this.field1169, arg1, this.field1163, this.field1164, 0, arg3, arg2, this);
                }
                return method1316(((class58) this.field1174).field1144, arg0, this.field1169, arg1, this.field1158, 0, arg3, arg2, this);
            }
            if (Statics.field1089) {
                return method1267(0, 0, ((class58) this.field1174).field1144, arg0, this.field1169, arg1, this.field1163, this.field1164, 0, arg3, arg2, this, this.field1160, arg4);
            }
            return method1213(0, 0, ((class58) this.field1174).field1144, arg0, this.field1169, arg1, this.field1158, 0, arg3, arg2, this, this.field1160, arg4);
        }
    }

    @ObfuscatedName("bi.ar([IIIII)I")
    public int method1208(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1162 > 0) {
                int var6 = this.field1162 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1162 += arg1;
                if (this.field1160 == -256 && (this.field1169 & 0xFF) == 0) {
                    if (Statics.field1089) {
                        arg1 = method1219(0, ((class58) this.field1174).field1144, arg0, this.field1169, arg1, this.field1163, this.field1164, this.field1159, this.field1171, 0, var6, arg2, this);
                    } else {
                        arg1 = method1222(((class58) this.field1174).field1144, arg0, this.field1169, arg1, this.field1158, this.field1170, 0, var6, arg2, this);
                    }
                } else if (Statics.field1089) {
                    arg1 = method1223(0, 0, ((class58) this.field1174).field1144, arg0, this.field1169, arg1, this.field1163, this.field1164, this.field1159, this.field1171, 0, var6, arg2, this, this.field1160, arg4);
                } else {
                    arg1 = method1301(0, 0, ((class58) this.field1174).field1144, arg0, this.field1169, arg1, this.field1158, this.field1170, 0, var6, arg2, this, this.field1160, arg4);
                }
                this.field1162 -= arg1;
                if (this.field1162 != 0) {
                    return arg1;
                }
                if (!this.method1190()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1160 == -256 && (this.field1169 & 0xFF) == 0) {
                if (Statics.field1089) {
                    return method1257(0, ((class58) this.field1174).field1144, arg0, this.field1169, arg1, this.field1163, this.field1164, 0, arg3, arg2, this);
                }
                return method1191(((class58) this.field1174).field1144, arg0, this.field1169, arg1, this.field1158, 0, arg3, arg2, this);
            }
            if (Statics.field1089) {
                return method1216(0, 0, ((class58) this.field1174).field1144, arg0, this.field1169, arg1, this.field1163, this.field1164, 0, arg3, arg2, this, this.field1160, arg4);
            }
            return method1215(0, 0, ((class58) this.field1174).field1144, arg0, this.field1169, arg1, this.field1158, 0, arg3, arg2, this, this.field1160, arg4);
        }
    }

    @ObfuscatedName("bi.ai()Z")
    public boolean method1190() {
        int var1 = this.field1161;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method1232(var1, this.field1172);
            var2 = method1280(var1, this.field1172);
        }
        if (this.field1158 != var1 || this.field1163 != var3 || this.field1164 != var2) {
            if (this.field1158 < var1) {
                this.field1170 = 1;
                this.field1162 = var1 - this.field1158;
            } else if (this.field1158 > var1) {
                this.field1170 = -1;
                this.field1162 = this.field1158 - var1;
            } else {
                this.field1170 = 0;
            }
            if (this.field1163 < var3) {
                this.field1159 = 1;
                if (this.field1162 == 0 || this.field1162 > var3 - this.field1163) {
                    this.field1162 = var3 - this.field1163;
                }
            } else if (this.field1163 > var3) {
                this.field1159 = -1;
                if (this.field1162 == 0 || this.field1162 > this.field1163 - var3) {
                    this.field1162 = this.field1163 - var3;
                }
            } else {
                this.field1159 = 0;
            }
            if (this.field1164 < var2) {
                this.field1171 = 1;
                if (this.field1162 == 0 || this.field1162 > var2 - this.field1164) {
                    this.field1162 = var2 - this.field1164;
                }
            } else if (this.field1164 > var2) {
                this.field1171 = -1;
                if (this.field1162 == 0 || this.field1162 > this.field1164 - var2) {
                    this.field1162 = this.field1164 - var2;
                }
            } else {
                this.field1171 = 0;
            }
            return false;
        } else if (this.field1161 == Integer.MIN_VALUE) {
            this.field1161 = 0;
            this.field1164 = 0;
            this.field1163 = 0;
            this.field1158 = 0;
            this.method3506();
            return true;
        } else {
            this.method1188();
            return false;
        }
    }

    @ObfuscatedName("bi.ax([B[IIIIIIILbi;)I")
    public static int method1316(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class60 arg8) {
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
        arg8.field1169 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("bi.aq(I[B[IIIIIIIILbi;)I")
    public static int method1211(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class60 arg10) {
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
        arg10.field1169 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("bi.ad([B[IIIIIIILbi;)I")
    public static int method1191(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class60 arg8) {
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
        arg8.field1169 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("bi.af(I[B[IIIIIIIILbi;)I")
    public static int method1257(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class60 arg10) {
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
        arg10.field1169 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("bi.av(II[B[IIIIIIILbi;II)I")
    public static int method1213(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class60 arg10, int arg11, int arg12) {
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
        arg10.field1169 = arg4;
        return arg5;
    }

    @ObfuscatedName("bi.an(II[B[IIIIIIIILbi;II)I")
    public static int method1267(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class60 arg11, int arg12, int arg13) {
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
        arg11.field1169 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("bi.am(II[B[IIIIIIILbi;II)I")
    public static int method1215(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class60 arg10, int arg11, int arg12) {
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
        arg10.field1169 = arg4;
        return arg5;
    }

    @ObfuscatedName("bi.bt(II[B[IIIIIIIILbi;II)I")
    public static int method1216(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class60 arg11, int arg12, int arg13) {
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
        arg11.field1169 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("bi.br([B[IIIIIIIILbi;)I")
    public static int method1217(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class60 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field1163 += (var14 - arg3) * arg9.field1159;
        arg9.field1164 += (var14 - arg3) * arg9.field1171;
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
        arg9.field1158 = var12 >> 2;
        arg9.field1169 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("bi.bs(I[B[IIIIIIIIIILbi;)I")
    public static int method1218(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class60 arg12) {
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
        arg12.field1158 += (var19 - arg4) * arg12.field1170;
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
        arg12.field1163 = var15 >> 2;
        arg12.field1164 = var16 >> 2;
        arg12.field1169 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("bi.bn([B[IIIIIIIILbi;)I")
    public static int method1222(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class60 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field1163 += (var14 - arg3) * arg9.field1159;
        arg9.field1164 += (var14 - arg3) * arg9.field1171;
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
        arg9.field1158 = var12 >> 2;
        arg9.field1169 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("bi.bu(I[B[IIIIIIIIIILbi;)I")
    public static int method1219(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class60 arg12) {
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
        arg12.field1158 += (var19 - arg4) * arg12.field1170;
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
        arg12.field1163 = var15 >> 2;
        arg12.field1164 = var16 >> 2;
        arg12.field1169 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("bi.bl(II[B[IIIIIIIILbi;II)I")
    public static int method1220(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class60 arg11, int arg12, int arg13) {
        arg11.field1163 -= arg11.field1159 * arg5;
        arg11.field1164 -= arg11.field1171 * arg5;
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
        arg11.field1163 += arg11.field1159 * arg5;
        arg11.field1164 += arg11.field1171 * arg5;
        arg11.field1158 = arg6;
        arg11.field1169 = arg4;
        return arg5;
    }

    @ObfuscatedName("bi.by(II[B[IIIIIIIIIILbi;II)I")
    public static int method1221(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class60 arg13, int arg14, int arg15) {
        arg13.field1158 -= arg13.field1170 * arg5;
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
        arg13.field1158 += arg13.field1170 * var27;
        arg13.field1163 = arg6;
        arg13.field1164 = arg7;
        arg13.field1169 = arg4;
        return var27;
    }

    @ObfuscatedName("bi.bi(II[B[IIIIIIIILbi;II)I")
    public static int method1301(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class60 arg11, int arg12, int arg13) {
        arg11.field1163 -= arg11.field1159 * arg5;
        arg11.field1164 -= arg11.field1171 * arg5;
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
        arg11.field1163 += arg11.field1159 * arg5;
        arg11.field1164 += arg11.field1171 * arg5;
        arg11.field1158 = arg6;
        arg11.field1169 = arg4;
        return arg5;
    }

    @ObfuscatedName("bi.bg(II[B[IIIIIIIIIILbi;II)I")
    public static int method1223(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class60 arg13, int arg14, int arg15) {
        arg13.field1158 -= arg13.field1170 * arg5;
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
        arg13.field1158 += arg13.field1170 * var26;
        arg13.field1163 = arg6;
        arg13.field1164 = arg7;
        arg13.field1169 = arg4;
        return var26;
    }
}
