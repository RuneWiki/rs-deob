package deob;

@ObfuscatedName("bt")
public class class60 extends class62 {

    @ObfuscatedName("bt.n")
    public int field1216;

    @ObfuscatedName("bt.g")
    public int field1204;

    @ObfuscatedName("bt.a")
    public int field1205;

    @ObfuscatedName("bt.m")
    public int field1212;

    @ObfuscatedName("bt.s")
    public int field1207;

    @ObfuscatedName("bt.j")
    public int field1208;

    @ObfuscatedName("bt.f")
    public int field1209;

    @ObfuscatedName("bt.b")
    public int field1210;

    @ObfuscatedName("bt.t")
    public int field1214;

    @ObfuscatedName("bt.i")
    public int field1206;

    @ObfuscatedName("bt.c")
    public boolean field1213;

    @ObfuscatedName("bt.k")
    public int field1203;

    @ObfuscatedName("bt.x")
    public int field1215;

    @ObfuscatedName("bt.e")
    public int field1211;

    @ObfuscatedName("bt.q")
    public int field1217;

    @ObfuscatedName("bt.n(II)I")
    public static int method1297(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("bt.g(II)I")
    public static int method1253(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("bt.au()I")
    public int method1164() {
        int var1 = this.field1207 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field1210 == 0) {
            var2 -= this.field1216 * var2 / (((class58) this.field1219).field1186.length << 8);
        } else if (this.field1210 >= 0) {
            var2 -= this.field1214 * var2 / ((class58) this.field1219).field1186.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    public class60(class58 arg0, int arg1, int arg2) {
        this.field1219 = arg0;
        this.field1214 = arg0.field1188;
        this.field1206 = arg0.field1189;
        this.field1213 = arg0.field1187;
        this.field1204 = arg1;
        this.field1205 = arg2;
        this.field1212 = 8192;
        this.field1216 = 0;
        this.method1169();
    }

    public class60(class58 arg0, int arg1, int arg2, int arg3) {
        this.field1219 = arg0;
        this.field1214 = arg0.field1188;
        this.field1206 = arg0.field1189;
        this.field1213 = arg0.field1187;
        this.field1204 = arg1;
        this.field1205 = arg2;
        this.field1212 = arg3;
        this.field1216 = 0;
        this.method1169();
    }

    @ObfuscatedName("bt.a(Lbr;II)Lbt;")
    public static class60 method1182(class58 arg0, int arg1, int arg2) {
        return arg0.field1186 == null || arg0.field1186.length == 0 ? null : new class60(arg0, (int) ((long) arg0.field1190 * 256L * (long) arg1 / (long) (Statics.field1142 * 100)), arg2 << 6);
    }

    @ObfuscatedName("bt.m(Lbr;III)Lbt;")
    public static class60 method1168(class58 arg0, int arg1, int arg2, int arg3) {
        return arg0.field1186 == null || arg0.field1186.length == 0 ? null : new class60(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("bt.s()V")
    public void method1169() {
        this.field1207 = this.field1205;
        this.field1208 = method1297(this.field1205, this.field1212);
        this.field1209 = method1253(this.field1205, this.field1212);
    }

    @ObfuscatedName("bt.i(I)V")
    public synchronized void method1170(int arg0) {
        this.field1210 = arg0;
    }

    @ObfuscatedName("bt.k(I)V")
    public synchronized void method1236(int arg0) {
        this.method1173(arg0 << 6, this.method1180());
    }

    @ObfuscatedName("bt.x(I)V")
    public synchronized void method1257(int arg0) {
        this.method1173(arg0, this.method1180());
    }

    @ObfuscatedName("bt.e(II)V")
    public synchronized void method1173(int arg0, int arg1) {
        this.field1205 = arg0;
        this.field1212 = arg1;
        this.field1203 = 0;
        this.method1169();
    }

    @ObfuscatedName("bt.q()I")
    public synchronized int method1174() {
        return this.field1205 == Integer.MIN_VALUE ? 0 : this.field1205;
    }

    @ObfuscatedName("bt.o()I")
    public synchronized int method1180() {
        return this.field1212 < 0 ? -1 : this.field1212;
    }

    @ObfuscatedName("bt.r(I)V")
    public synchronized void method1176(int arg0) {
        int var2 = ((class58) this.field1219).field1186.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field1216 = arg0;
    }

    @ObfuscatedName("bt.v(Z)V")
    public synchronized void method1282(boolean arg0) {
        this.field1204 = (this.field1204 >>> 31) + (this.field1204 ^ this.field1204 >> 31);
        if (arg0) {
            this.field1204 = -this.field1204;
        }
    }

    @ObfuscatedName("bt.h()V")
    public void method1178() {
        if (this.field1203 == 0) {
            return;
        }
        if (this.field1205 == Integer.MIN_VALUE) {
            this.field1205 = 0;
        }
        this.field1203 = 0;
        this.method1169();
    }

    @ObfuscatedName("bt.p(II)V")
    public synchronized void method1299(int arg0, int arg1) {
        this.method1202(arg0, arg1, this.method1180());
    }

    @ObfuscatedName("bt.y(III)V")
    public synchronized void method1202(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method1173(arg1, arg2);
            return;
        }
        int var4 = method1297(arg1, arg2);
        int var5 = method1253(arg1, arg2);
        if (this.field1208 == var4 && this.field1209 == var5) {
            this.field1203 = 0;
            return;
        }
        int var6 = arg1 - this.field1207;
        if (this.field1207 - arg1 > var6) {
            var6 = this.field1207 - arg1;
        }
        if (var4 - this.field1208 > var6) {
            var6 = var4 - this.field1208;
        }
        if (this.field1208 - var4 > var6) {
            var6 = this.field1208 - var4;
        }
        if (var5 - this.field1209 > var6) {
            var6 = var5 - this.field1209;
        }
        if (this.field1209 - var5 > var6) {
            var6 = this.field1209 - var5;
        }
        if (arg0 > var6) {
            arg0 = var6;
        }
        this.field1203 = arg0;
        this.field1205 = arg1;
        this.field1212 = arg2;
        this.field1215 = (arg1 - this.field1207) / arg0;
        this.field1211 = (var4 - this.field1208) / arg0;
        this.field1217 = (var5 - this.field1209) / arg0;
    }

    @ObfuscatedName("bt.z(I)V")
    public synchronized void method1223(int arg0) {
        if (arg0 == 0) {
            this.method1257(0);
            this.method3554();
        } else if (this.field1208 == 0 && this.field1209 == 0) {
            this.field1203 = 0;
            this.field1205 = 0;
            this.field1207 = 0;
            this.method3554();
        } else {
            int var2 = -this.field1207;
            if (this.field1207 > var2) {
                var2 = this.field1207;
            }
            if (-this.field1208 > var2) {
                var2 = -this.field1208;
            }
            if (this.field1208 > var2) {
                var2 = this.field1208;
            }
            if (-this.field1209 > var2) {
                var2 = -this.field1209;
            }
            if (this.field1209 > var2) {
                var2 = this.field1209;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field1203 = arg0;
            this.field1205 = Integer.MIN_VALUE;
            this.field1215 = -this.field1207 / arg0;
            this.field1211 = -this.field1208 / arg0;
            this.field1217 = -this.field1209 / arg0;
        }
    }

    @ObfuscatedName("bt.u(I)V")
    public synchronized void method1243(int arg0) {
        if (this.field1204 < 0) {
            this.field1204 = -arg0;
        } else {
            this.field1204 = arg0;
        }
    }

    @ObfuscatedName("bt.w()I")
    public synchronized int method1183() {
        return this.field1204 < 0 ? -this.field1204 : this.field1204;
    }

    @ObfuscatedName("bt.d()Z")
    public boolean method1184() {
        return this.field1216 < 0 || this.field1216 >= ((class58) this.field1219).field1186.length << 8;
    }

    @ObfuscatedName("bt.ar()Z")
    public boolean method1185() {
        return this.field1203 != 0;
    }

    @ObfuscatedName("bt.j()Lbh;")
    public class62 method998() {
        return null;
    }

    @ObfuscatedName("bt.f()Lbh;")
    public class62 method999() {
        return null;
    }

    @ObfuscatedName("bt.b()I")
    public int method1000() {
        return this.field1205 == 0 && this.field1203 == 0 ? 0 : 1;
    }

    @ObfuscatedName("bt.t([III)V")
    public synchronized void method1001(int[] arg0, int arg1, int arg2) {
        if (this.field1205 == 0 && this.field1203 == 0) {
            this.method1022(arg2);
            return;
        }
        class58 var4 = (class58) this.field1219;
        int var5 = this.field1214 << 8;
        int var6 = this.field1206 << 8;
        int var7 = var4.field1186.length << 8;
        int var8 = var6 - var5;
        if (var8 <= 0) {
            this.field1210 = 0;
        }
        int var9 = arg1;
        int var10 = arg1 + arg2;
        if (this.field1216 < 0) {
            if (this.field1204 <= 0) {
                this.method1178();
                this.method3554();
                return;
            }
            this.field1216 = 0;
        }
        if (this.field1216 >= var7) {
            if (this.field1204 >= 0) {
                this.method1178();
                this.method3554();
                return;
            }
            this.field1216 = var7 - 1;
        }
        if (this.field1210 >= 0) {
            if (this.field1210 > 0) {
                if (this.field1213) {
                    label131: {
                        if (this.field1204 < 0) {
                            var9 = this.method1247(arg0, arg1, var5, var10, var4.field1186[this.field1214]);
                            if (this.field1216 >= var5) {
                                return;
                            }
                            this.field1216 = var5 + var5 - 1 - this.field1216;
                            this.field1204 = -this.field1204;
                            if (--this.field1210 == 0) {
                                break label131;
                            }
                        }
                        do {
                            var9 = this.method1187(arg0, var9, var6, var10, var4.field1186[this.field1206 - 1]);
                            if (this.field1216 < var6) {
                                return;
                            }
                            this.field1216 = var6 + var6 - 1 - this.field1216;
                            this.field1204 = -this.field1204;
                            if (--this.field1210 == 0) {
                                break;
                            }
                            var9 = this.method1247(arg0, var9, var5, var10, var4.field1186[this.field1214]);
                            if (this.field1216 >= var5) {
                                return;
                            }
                            this.field1216 = var5 + var5 - 1 - this.field1216;
                            this.field1204 = -this.field1204;
                        } while (--this.field1210 != 0);
                    }
                } else if (this.field1204 < 0) {
                    while (true) {
                        var9 = this.method1247(arg0, var9, var5, var10, var4.field1186[this.field1206 - 1]);
                        if (this.field1216 >= var5) {
                            return;
                        }
                        int var12 = (var6 - 1 - this.field1216) / var8;
                        if (var12 >= this.field1210) {
                            this.field1216 += this.field1210 * var8;
                            this.field1210 = 0;
                            break;
                        }
                        this.field1216 += var8 * var12;
                        this.field1210 -= var12;
                    }
                } else {
                    while (true) {
                        var9 = this.method1187(arg0, var9, var6, var10, var4.field1186[this.field1214]);
                        if (this.field1216 < var6) {
                            return;
                        }
                        int var13 = (this.field1216 - var5) / var8;
                        if (var13 >= this.field1210) {
                            this.field1216 -= this.field1210 * var8;
                            this.field1210 = 0;
                            break;
                        }
                        this.field1216 -= var8 * var13;
                        this.field1210 -= var13;
                    }
                }
            }
            if (this.field1204 < 0) {
                this.method1247(arg0, var9, 0, var10, 0);
                if (this.field1216 < 0) {
                    this.field1216 = -1;
                    this.method1178();
                    this.method3554();
                }
            } else {
                this.method1187(arg0, var9, var7, var10, 0);
                if (this.field1216 >= var7) {
                    this.field1216 = var7;
                    this.method1178();
                    this.method3554();
                }
            }
        } else if (this.field1213) {
            if (this.field1204 < 0) {
                var9 = this.method1247(arg0, arg1, var5, var10, var4.field1186[this.field1214]);
                if (this.field1216 >= var5) {
                    return;
                }
                this.field1216 = var5 + var5 - 1 - this.field1216;
                this.field1204 = -this.field1204;
            }
            while (true) {
                int var11 = this.method1187(arg0, var9, var6, var10, var4.field1186[this.field1206 - 1]);
                if (this.field1216 < var6) {
                    return;
                }
                this.field1216 = var6 + var6 - 1 - this.field1216;
                this.field1204 = -this.field1204;
                var9 = this.method1247(arg0, var11, var5, var10, var4.field1186[this.field1214]);
                if (this.field1216 >= var5) {
                    return;
                }
                this.field1216 = var5 + var5 - 1 - this.field1216;
                this.field1204 = -this.field1204;
            }
        } else if (this.field1204 < 0) {
            while (true) {
                var9 = this.method1247(arg0, var9, var5, var10, var4.field1186[this.field1206 - 1]);
                if (this.field1216 >= var5) {
                    return;
                }
                this.field1216 = var6 - 1 - (var6 - 1 - this.field1216) % var8;
            }
        } else {
            while (true) {
                var9 = this.method1187(arg0, var9, var6, var10, var4.field1186[this.field1214]);
                if (this.field1216 < var6) {
                    return;
                }
                this.field1216 = (this.field1216 - var5) % var8 + var5;
            }
        }
    }

    @ObfuscatedName("bt.c(I)V")
    public synchronized void method1022(int arg0) {
        if (this.field1203 > 0) {
            if (arg0 >= this.field1203) {
                if (this.field1205 == Integer.MIN_VALUE) {
                    this.field1205 = 0;
                    this.field1209 = 0;
                    this.field1208 = 0;
                    this.field1207 = 0;
                    this.method3554();
                    arg0 = this.field1203;
                }
                this.field1203 = 0;
                this.method1169();
            } else {
                this.field1207 += this.field1215 * arg0;
                this.field1208 += this.field1211 * arg0;
                this.field1209 += this.field1217 * arg0;
                this.field1203 -= arg0;
            }
        }
        class58 var2 = (class58) this.field1219;
        int var3 = this.field1214 << 8;
        int var4 = this.field1206 << 8;
        int var5 = var2.field1186.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field1210 = 0;
        }
        if (this.field1216 < 0) {
            if (this.field1204 <= 0) {
                this.method1178();
                this.method3554();
                return;
            }
            this.field1216 = 0;
        }
        if (this.field1216 >= var5) {
            if (this.field1204 >= 0) {
                this.method1178();
                this.method3554();
                return;
            }
            this.field1216 = var5 - 1;
        }
        this.field1216 += this.field1204 * arg0;
        if (this.field1210 >= 0) {
            if (this.field1210 > 0) {
                if (this.field1213) {
                    label121: {
                        if (this.field1204 < 0) {
                            if (this.field1216 >= var3) {
                                return;
                            }
                            this.field1216 = var3 + var3 - 1 - this.field1216;
                            this.field1204 = -this.field1204;
                            if (--this.field1210 == 0) {
                                break label121;
                            }
                        }
                        do {
                            if (this.field1216 < var4) {
                                return;
                            }
                            this.field1216 = var4 + var4 - 1 - this.field1216;
                            this.field1204 = -this.field1204;
                            if (--this.field1210 == 0) {
                                break;
                            }
                            if (this.field1216 >= var3) {
                                return;
                            }
                            this.field1216 = var3 + var3 - 1 - this.field1216;
                            this.field1204 = -this.field1204;
                        } while (--this.field1210 != 0);
                    }
                } else {
                    label153: {
                        if (this.field1204 < 0) {
                            if (this.field1216 >= var3) {
                                return;
                            }
                            int var7 = (var4 - 1 - this.field1216) / var6;
                            if (var7 >= this.field1210) {
                                this.field1216 += this.field1210 * var6;
                                this.field1210 = 0;
                                break label153;
                            }
                            this.field1216 += var6 * var7;
                            this.field1210 -= var7;
                        } else if (this.field1216 >= var4) {
                            int var8 = (this.field1216 - var3) / var6;
                            if (var8 >= this.field1210) {
                                this.field1216 -= this.field1210 * var6;
                                this.field1210 = 0;
                                break label153;
                            }
                            this.field1216 -= var6 * var8;
                            this.field1210 -= var8;
                        } else {
                            return;
                        }
                        return;
                    }
                }
            }
            if (this.field1204 < 0) {
                if (this.field1216 < 0) {
                    this.field1216 = -1;
                    this.method1178();
                    this.method3554();
                }
            } else if (this.field1216 >= var5) {
                this.field1216 = var5;
                this.method1178();
                this.method3554();
            }
        } else if (this.field1213) {
            if (this.field1204 < 0) {
                if (this.field1216 >= var3) {
                    return;
                }
                this.field1216 = var3 + var3 - 1 - this.field1216;
                this.field1204 = -this.field1204;
            }
            while (this.field1216 >= var4) {
                this.field1216 = var4 + var4 - 1 - this.field1216;
                this.field1204 = -this.field1204;
                if (this.field1216 >= var3) {
                    return;
                }
                this.field1216 = var3 + var3 - 1 - this.field1216;
                this.field1204 = -this.field1204;
            }
        } else if (this.field1204 < 0) {
            if (this.field1216 >= var3) {
                return;
            }
            this.field1216 = var4 - 1 - (var4 - 1 - this.field1216) % var6;
        } else if (this.field1216 >= var4) {
            this.field1216 = (this.field1216 - var3) % var6 + var3;
        } else {
            return;
        }
    }

    @ObfuscatedName("bt.ai([IIIII)I")
    public int method1187(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1203 > 0) {
                int var6 = this.field1203 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1203 += arg1;
                if (this.field1204 == 256 && (this.field1216 & 0xFF) == 0) {
                    if (Statics.field1146) {
                        arg1 = method1199(0, ((class58) this.field1219).field1186, arg0, this.field1216, arg1, this.field1208, this.field1209, this.field1211, this.field1217, 0, var6, arg2, this);
                    } else {
                        arg1 = method1198(((class58) this.field1219).field1186, arg0, this.field1216, arg1, this.field1207, this.field1215, 0, var6, arg2, this);
                    }
                } else if (Statics.field1146) {
                    arg1 = method1273(0, 0, ((class58) this.field1219).field1186, arg0, this.field1216, arg1, this.field1208, this.field1209, this.field1211, this.field1217, 0, var6, arg2, this, this.field1204, arg4);
                } else {
                    arg1 = method1300(0, 0, ((class58) this.field1219).field1186, arg0, this.field1216, arg1, this.field1207, this.field1215, 0, var6, arg2, this, this.field1204, arg4);
                }
                this.field1203 -= arg1;
                if (this.field1203 != 0) {
                    return arg1;
                }
                if (!this.method1189()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1204 == 256 && (this.field1216 & 0xFF) == 0) {
                if (Statics.field1146) {
                    return method1191(0, ((class58) this.field1219).field1186, arg0, this.field1216, arg1, this.field1208, this.field1209, 0, arg3, arg2, this);
                }
                return method1206(((class58) this.field1219).field1186, arg0, this.field1216, arg1, this.field1207, 0, arg3, arg2, this);
            }
            if (Statics.field1146) {
                return method1195(0, 0, ((class58) this.field1219).field1186, arg0, this.field1216, arg1, this.field1208, this.field1209, 0, arg3, arg2, this, this.field1204, arg4);
            }
            return method1194(0, 0, ((class58) this.field1219).field1186, arg0, this.field1216, arg1, this.field1207, 0, arg3, arg2, this, this.field1204, arg4);
        }
    }

    @ObfuscatedName("bt.aw([IIIII)I")
    public int method1247(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1203 > 0) {
                int var6 = this.field1203 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1203 += arg1;
                if (this.field1204 == -256 && (this.field1216 & 0xFF) == 0) {
                    if (Statics.field1146) {
                        arg1 = method1201(0, ((class58) this.field1219).field1186, arg0, this.field1216, arg1, this.field1208, this.field1209, this.field1211, this.field1217, 0, var6, arg2, this);
                    } else {
                        arg1 = method1200(((class58) this.field1219).field1186, arg0, this.field1216, arg1, this.field1207, this.field1215, 0, var6, arg2, this);
                    }
                } else if (Statics.field1146) {
                    arg1 = method1205(0, 0, ((class58) this.field1219).field1186, arg0, this.field1216, arg1, this.field1208, this.field1209, this.field1211, this.field1217, 0, var6, arg2, this, this.field1204, arg4);
                } else {
                    arg1 = method1204(0, 0, ((class58) this.field1219).field1186, arg0, this.field1216, arg1, this.field1207, this.field1215, 0, var6, arg2, this, this.field1204, arg4);
                }
                this.field1203 -= arg1;
                if (this.field1203 != 0) {
                    return arg1;
                }
                if (!this.method1189()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1204 == -256 && (this.field1216 & 0xFF) == 0) {
                if (Statics.field1146) {
                    return method1193(0, ((class58) this.field1219).field1186, arg0, this.field1216, arg1, this.field1208, this.field1209, 0, arg3, arg2, this);
                }
                return method1192(((class58) this.field1219).field1186, arg0, this.field1216, arg1, this.field1207, 0, arg3, arg2, this);
            }
            if (Statics.field1146) {
                return method1197(0, 0, ((class58) this.field1219).field1186, arg0, this.field1216, arg1, this.field1208, this.field1209, 0, arg3, arg2, this, this.field1204, arg4);
            }
            return method1196(0, 0, ((class58) this.field1219).field1186, arg0, this.field1216, arg1, this.field1207, 0, arg3, arg2, this, this.field1204, arg4);
        }
    }

    @ObfuscatedName("bt.av()Z")
    public boolean method1189() {
        int var1 = this.field1205;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method1297(var1, this.field1212);
            var2 = method1253(var1, this.field1212);
        }
        if (this.field1207 != var1 || this.field1208 != var3 || this.field1209 != var2) {
            if (this.field1207 < var1) {
                this.field1215 = 1;
                this.field1203 = var1 - this.field1207;
            } else if (this.field1207 > var1) {
                this.field1215 = -1;
                this.field1203 = this.field1207 - var1;
            } else {
                this.field1215 = 0;
            }
            if (this.field1208 < var3) {
                this.field1211 = 1;
                if (this.field1203 == 0 || this.field1203 > var3 - this.field1208) {
                    this.field1203 = var3 - this.field1208;
                }
            } else if (this.field1208 > var3) {
                this.field1211 = -1;
                if (this.field1203 == 0 || this.field1203 > this.field1208 - var3) {
                    this.field1203 = this.field1208 - var3;
                }
            } else {
                this.field1211 = 0;
            }
            if (this.field1209 < var2) {
                this.field1217 = 1;
                if (this.field1203 == 0 || this.field1203 > var2 - this.field1209) {
                    this.field1203 = var2 - this.field1209;
                }
            } else if (this.field1209 > var2) {
                this.field1217 = -1;
                if (this.field1203 == 0 || this.field1203 > this.field1209 - var2) {
                    this.field1203 = this.field1209 - var2;
                }
            } else {
                this.field1217 = 0;
            }
            return false;
        } else if (this.field1205 == Integer.MIN_VALUE) {
            this.field1205 = 0;
            this.field1209 = 0;
            this.field1208 = 0;
            this.field1207 = 0;
            this.method3554();
            return true;
        } else {
            this.method1169();
            return false;
        }
    }

    @ObfuscatedName("bt.af([B[IIIIIIILbt;)I")
    public static int method1206(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class60 arg8) {
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
        arg8.field1216 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("bt.ae(I[B[IIIIIIIILbt;)I")
    public static int method1191(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class60 arg10) {
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
        arg10.field1216 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("bt.aa([B[IIIIIIILbt;)I")
    public static int method1192(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class60 arg8) {
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
        arg8.field1216 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("bt.ay(I[B[IIIIIIIILbt;)I")
    public static int method1193(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class60 arg10) {
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
        arg10.field1216 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("bt.ac(II[B[IIIIIIILbt;II)I")
    public static int method1194(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class60 arg10, int arg11, int arg12) {
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
        arg10.field1216 = arg4;
        return arg5;
    }

    @ObfuscatedName("bt.ab(II[B[IIIIIIIILbt;II)I")
    public static int method1195(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class60 arg11, int arg12, int arg13) {
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
        arg11.field1216 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("bt.ap(II[B[IIIIIIILbt;II)I")
    public static int method1196(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class60 arg10, int arg11, int arg12) {
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
        arg10.field1216 = arg4;
        return arg5;
    }

    @ObfuscatedName("bt.as(II[B[IIIIIIIILbt;II)I")
    public static int method1197(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class60 arg11, int arg12, int arg13) {
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
        arg11.field1216 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("bt.bi([B[IIIIIIIILbt;)I")
    public static int method1198(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class60 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field1208 += (var14 - arg3) * arg9.field1211;
        arg9.field1209 += (var14 - arg3) * arg9.field1217;
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
        arg9.field1207 = var12 >> 2;
        arg9.field1216 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("bt.bv(I[B[IIIIIIIIIILbt;)I")
    public static int method1199(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class60 arg12) {
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
        arg12.field1207 += (var19 - arg4) * arg12.field1215;
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
        arg12.field1208 = var15 >> 2;
        arg12.field1209 = var16 >> 2;
        arg12.field1216 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("bt.bl([B[IIIIIIIILbt;)I")
    public static int method1200(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class60 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field1208 += (var14 - arg3) * arg9.field1211;
        arg9.field1209 += (var14 - arg3) * arg9.field1217;
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
        arg9.field1207 = var12 >> 2;
        arg9.field1216 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("bt.by(I[B[IIIIIIIIIILbt;)I")
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
        arg12.field1207 += (var19 - arg4) * arg12.field1215;
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
        arg12.field1208 = var15 >> 2;
        arg12.field1209 = var16 >> 2;
        arg12.field1216 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("bt.bm(II[B[IIIIIIIILbt;II)I")
    public static int method1300(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class60 arg11, int arg12, int arg13) {
        arg11.field1208 -= arg11.field1211 * arg5;
        arg11.field1209 -= arg11.field1217 * arg5;
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
        arg11.field1208 += arg11.field1211 * arg5;
        arg11.field1209 += arg11.field1217 * arg5;
        arg11.field1207 = arg6;
        arg11.field1216 = arg4;
        return arg5;
    }

    @ObfuscatedName("bt.br(II[B[IIIIIIIIIILbt;II)I")
    public static int method1273(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class60 arg13, int arg14, int arg15) {
        arg13.field1207 -= arg13.field1215 * arg5;
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
        arg13.field1207 += arg13.field1215 * var27;
        arg13.field1208 = arg6;
        arg13.field1209 = arg7;
        arg13.field1216 = arg4;
        return var27;
    }

    @ObfuscatedName("bt.bo(II[B[IIIIIIIILbt;II)I")
    public static int method1204(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class60 arg11, int arg12, int arg13) {
        arg11.field1208 -= arg11.field1211 * arg5;
        arg11.field1209 -= arg11.field1217 * arg5;
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
        arg11.field1208 += arg11.field1211 * arg5;
        arg11.field1209 += arg11.field1217 * arg5;
        arg11.field1207 = arg6;
        arg11.field1216 = arg4;
        return arg5;
    }

    @ObfuscatedName("bt.bt(II[B[IIIIIIIIIILbt;II)I")
    public static int method1205(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class60 arg13, int arg14, int arg15) {
        arg13.field1207 -= arg13.field1215 * arg5;
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
        arg13.field1207 += arg13.field1215 * var26;
        arg13.field1208 = arg6;
        arg13.field1209 = arg7;
        arg13.field1216 = arg4;
        return var26;
    }
}
