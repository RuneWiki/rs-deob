package deob;

@ObfuscatedName("bg")
public class class65 extends class67 {

    @ObfuscatedName("bg.j")
    public int field1250;

    @ObfuscatedName("bg.m")
    public int field1244;

    @ObfuscatedName("bg.f")
    public int field1238;

    @ObfuscatedName("bg.l")
    public int field1239;

    @ObfuscatedName("bg.u")
    public int field1240;

    @ObfuscatedName("bg.a")
    public int field1241;

    @ObfuscatedName("bg.h")
    public int field1242;

    @ObfuscatedName("bg.i")
    public int field1243;

    @ObfuscatedName("bg.t")
    public int field1236;

    @ObfuscatedName("bg.k")
    public int field1245;

    @ObfuscatedName("bg.s")
    public boolean field1246;

    @ObfuscatedName("bg.e")
    public int field1247;

    @ObfuscatedName("bg.z")
    public int field1248;

    @ObfuscatedName("bg.p")
    public int field1237;

    @ObfuscatedName("bg.r")
    public int field1249;

    @ObfuscatedName("bg.j(II)I")
    public static int method1413(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("bg.m(II)I")
    public static int method1283(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("bg.ah()I")
    public int method1284() {
        int var1 = this.field1240 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field1243 == 0) {
            var2 -= this.field1250 * var2 / (((class63) this.field1254).field1220.length << 8);
        } else if (this.field1243 >= 0) {
            var2 -= this.field1236 * var2 / ((class63) this.field1254).field1220.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    public class65(class63 arg0, int arg1, int arg2) {
        this.field1254 = arg0;
        this.field1236 = arg0.field1221;
        this.field1245 = arg0.field1219;
        this.field1246 = arg0.field1223;
        this.field1244 = arg1;
        this.field1238 = arg2;
        this.field1239 = 8192;
        this.field1250 = 0;
        this.method1289();
    }

    public class65(class63 arg0, int arg1, int arg2, int arg3) {
        this.field1254 = arg0;
        this.field1236 = arg0.field1221;
        this.field1245 = arg0.field1219;
        this.field1246 = arg0.field1223;
        this.field1244 = arg1;
        this.field1238 = arg2;
        this.field1239 = arg3;
        this.field1250 = 0;
        this.method1289();
    }

    @ObfuscatedName("bg.f(Lbe;II)Lbg;")
    public static class65 method1401(class63 arg0, int arg1, int arg2) {
        return arg0.field1220 == null || arg0.field1220.length == 0 ? null : new class65(arg0, (int) ((long) arg0.field1222 * 256L * (long) arg1 / (long) (Statics.field1184 * 100)), arg2 << 6);
    }

    @ObfuscatedName("bg.l(Lbe;III)Lbg;")
    public static class65 method1352(class63 arg0, int arg1, int arg2, int arg3) {
        return arg0.field1220 == null || arg0.field1220.length == 0 ? null : new class65(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("bg.u()V")
    public void method1289() {
        this.field1240 = this.field1238;
        this.field1241 = method1413(this.field1238, this.field1239);
        this.field1242 = method1283(this.field1238, this.field1239);
    }

    @ObfuscatedName("bg.k(I)V")
    public synchronized void method1290(int arg0) {
        this.field1243 = arg0;
    }

    @ObfuscatedName("bg.w(I)V")
    public synchronized void method1291(int arg0) {
        this.method1414(arg0 << 6, this.method1295());
    }

    @ObfuscatedName("bg.e(I)V")
    public synchronized void method1292(int arg0) {
        this.method1414(arg0, this.method1295());
    }

    @ObfuscatedName("bg.z(II)V")
    public synchronized void method1414(int arg0, int arg1) {
        this.field1238 = arg0;
        this.field1239 = arg1;
        this.field1247 = 0;
        this.method1289();
    }

    @ObfuscatedName("bg.p()I")
    public synchronized int method1294() {
        return this.field1238 == Integer.MIN_VALUE ? 0 : this.field1238;
    }

    @ObfuscatedName("bg.r()I")
    public synchronized int method1295() {
        return this.field1239 < 0 ? -1 : this.field1239;
    }

    @ObfuscatedName("bg.g(I)V")
    public synchronized void method1282(int arg0) {
        int var2 = ((class63) this.field1254).field1220.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field1250 = arg0;
    }

    @ObfuscatedName("bg.n(Z)V")
    public synchronized void method1358(boolean arg0) {
        this.field1244 = (this.field1244 >>> 31) + (this.field1244 ^ this.field1244 >> 31);
        if (arg0) {
            this.field1244 = -this.field1244;
        }
    }

    @ObfuscatedName("bg.y()V")
    public void method1379() {
        if (this.field1247 == 0) {
            return;
        }
        if (this.field1238 == Integer.MIN_VALUE) {
            this.field1238 = 0;
        }
        this.field1247 = 0;
        this.method1289();
    }

    @ObfuscatedName("bg.v(II)V")
    public synchronized void method1299(int arg0, int arg1) {
        this.method1300(arg0, arg1, this.method1295());
    }

    @ObfuscatedName("bg.q(III)V")
    public synchronized void method1300(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method1414(arg1, arg2);
            return;
        }
        int var4 = method1413(arg1, arg2);
        int var5 = method1283(arg1, arg2);
        if (this.field1241 == var4 && this.field1242 == var5) {
            this.field1247 = 0;
            return;
        }
        int var6 = arg1 - this.field1240;
        if (this.field1240 - arg1 > var6) {
            var6 = this.field1240 - arg1;
        }
        if (var4 - this.field1241 > var6) {
            var6 = var4 - this.field1241;
        }
        if (this.field1241 - var4 > var6) {
            var6 = this.field1241 - var4;
        }
        if (var5 - this.field1242 > var6) {
            var6 = var5 - this.field1242;
        }
        if (this.field1242 - var5 > var6) {
            var6 = this.field1242 - var5;
        }
        if (arg0 > var6) {
            arg0 = var6;
        }
        this.field1247 = arg0;
        this.field1238 = arg1;
        this.field1239 = arg2;
        this.field1248 = (arg1 - this.field1240) / arg0;
        this.field1237 = (var4 - this.field1241) / arg0;
        this.field1249 = (var5 - this.field1242) / arg0;
    }

    @ObfuscatedName("bg.x(I)V")
    public synchronized void method1333(int arg0) {
        if (arg0 == 0) {
            this.method1292(0);
            this.method3700();
        } else if (this.field1241 == 0 && this.field1242 == 0) {
            this.field1247 = 0;
            this.field1238 = 0;
            this.field1240 = 0;
            this.method3700();
        } else {
            int var2 = -this.field1240;
            if (this.field1240 > var2) {
                var2 = this.field1240;
            }
            if (-this.field1241 > var2) {
                var2 = -this.field1241;
            }
            if (this.field1241 > var2) {
                var2 = this.field1241;
            }
            if (-this.field1242 > var2) {
                var2 = -this.field1242;
            }
            if (this.field1242 > var2) {
                var2 = this.field1242;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field1247 = arg0;
            this.field1238 = Integer.MIN_VALUE;
            this.field1248 = -this.field1240 / arg0;
            this.field1237 = -this.field1241 / arg0;
            this.field1249 = -this.field1242 / arg0;
        }
    }

    @ObfuscatedName("bg.d(I)V")
    public synchronized void method1302(int arg0) {
        if (this.field1244 < 0) {
            this.field1244 = -arg0;
        } else {
            this.field1244 = arg0;
        }
    }

    @ObfuscatedName("bg.o()I")
    public synchronized int method1404() {
        return this.field1244 < 0 ? -this.field1244 : this.field1244;
    }

    @ObfuscatedName("bg.c()Z")
    public boolean method1287() {
        return this.field1250 < 0 || this.field1250 >= ((class63) this.field1254).field1220.length << 8;
    }

    @ObfuscatedName("bg.ay()Z")
    public boolean method1305() {
        return this.field1247 != 0;
    }

    @ObfuscatedName("bg.a()Lbp;")
    public class67 method1147() {
        return null;
    }

    @ObfuscatedName("bg.h()Lbp;")
    public class67 method1148() {
        return null;
    }

    @ObfuscatedName("bg.i()I")
    public int method1149() {
        return this.field1238 == 0 && this.field1247 == 0 ? 0 : 1;
    }

    @ObfuscatedName("bg.t([III)V")
    public synchronized void method1150(int[] arg0, int arg1, int arg2) {
        if (this.field1238 == 0 && this.field1247 == 0) {
            this.method1142(arg2);
            return;
        }
        class63 var4 = (class63) this.field1254;
        int var5 = this.field1236 << 8;
        int var6 = this.field1245 << 8;
        int var7 = var4.field1220.length << 8;
        int var8 = var6 - var5;
        if (var8 <= 0) {
            this.field1243 = 0;
        }
        int var9 = arg1;
        int var10 = arg1 + arg2;
        if (this.field1250 < 0) {
            if (this.field1244 <= 0) {
                this.method1379();
                this.method3700();
                return;
            }
            this.field1250 = 0;
        }
        if (this.field1250 >= var7) {
            if (this.field1244 >= 0) {
                this.method1379();
                this.method3700();
                return;
            }
            this.field1250 = var7 - 1;
        }
        if (this.field1243 >= 0) {
            if (this.field1243 > 0) {
                if (this.field1246) {
                    label131: {
                        if (this.field1244 < 0) {
                            var9 = this.method1308(arg0, arg1, var5, var10, var4.field1220[this.field1236]);
                            if (this.field1250 >= var5) {
                                return;
                            }
                            this.field1250 = var5 + var5 - 1 - this.field1250;
                            this.field1244 = -this.field1244;
                            if (--this.field1243 == 0) {
                                break label131;
                            }
                        }
                        do {
                            var9 = this.method1409(arg0, var9, var6, var10, var4.field1220[this.field1245 - 1]);
                            if (this.field1250 < var6) {
                                return;
                            }
                            this.field1250 = var6 + var6 - 1 - this.field1250;
                            this.field1244 = -this.field1244;
                            if (--this.field1243 == 0) {
                                break;
                            }
                            var9 = this.method1308(arg0, var9, var5, var10, var4.field1220[this.field1236]);
                            if (this.field1250 >= var5) {
                                return;
                            }
                            this.field1250 = var5 + var5 - 1 - this.field1250;
                            this.field1244 = -this.field1244;
                        } while (--this.field1243 != 0);
                    }
                } else if (this.field1244 < 0) {
                    while (true) {
                        var9 = this.method1308(arg0, var9, var5, var10, var4.field1220[this.field1245 - 1]);
                        if (this.field1250 >= var5) {
                            return;
                        }
                        int var12 = (var6 - 1 - this.field1250) / var8;
                        if (var12 >= this.field1243) {
                            this.field1250 += this.field1243 * var8;
                            this.field1243 = 0;
                            break;
                        }
                        this.field1250 += var8 * var12;
                        this.field1243 -= var12;
                    }
                } else {
                    while (true) {
                        var9 = this.method1409(arg0, var9, var6, var10, var4.field1220[this.field1236]);
                        if (this.field1250 < var6) {
                            return;
                        }
                        int var13 = (this.field1250 - var5) / var8;
                        if (var13 >= this.field1243) {
                            this.field1250 -= this.field1243 * var8;
                            this.field1243 = 0;
                            break;
                        }
                        this.field1250 -= var8 * var13;
                        this.field1243 -= var13;
                    }
                }
            }
            if (this.field1244 < 0) {
                this.method1308(arg0, var9, 0, var10, 0);
                if (this.field1250 < 0) {
                    this.field1250 = -1;
                    this.method1379();
                    this.method3700();
                }
            } else {
                this.method1409(arg0, var9, var7, var10, 0);
                if (this.field1250 >= var7) {
                    this.field1250 = var7;
                    this.method1379();
                    this.method3700();
                }
            }
        } else if (this.field1246) {
            if (this.field1244 < 0) {
                var9 = this.method1308(arg0, arg1, var5, var10, var4.field1220[this.field1236]);
                if (this.field1250 >= var5) {
                    return;
                }
                this.field1250 = var5 + var5 - 1 - this.field1250;
                this.field1244 = -this.field1244;
            }
            while (true) {
                int var11 = this.method1409(arg0, var9, var6, var10, var4.field1220[this.field1245 - 1]);
                if (this.field1250 < var6) {
                    return;
                }
                this.field1250 = var6 + var6 - 1 - this.field1250;
                this.field1244 = -this.field1244;
                var9 = this.method1308(arg0, var11, var5, var10, var4.field1220[this.field1236]);
                if (this.field1250 >= var5) {
                    return;
                }
                this.field1250 = var5 + var5 - 1 - this.field1250;
                this.field1244 = -this.field1244;
            }
        } else if (this.field1244 < 0) {
            while (true) {
                var9 = this.method1308(arg0, var9, var5, var10, var4.field1220[this.field1245 - 1]);
                if (this.field1250 >= var5) {
                    return;
                }
                this.field1250 = var6 - 1 - (var6 - 1 - this.field1250) % var8;
            }
        } else {
            while (true) {
                var9 = this.method1409(arg0, var9, var6, var10, var4.field1220[this.field1236]);
                if (this.field1250 < var6) {
                    return;
                }
                this.field1250 = (this.field1250 - var5) % var8 + var5;
            }
        }
    }

    @ObfuscatedName("bg.s(I)V")
    public synchronized void method1142(int arg0) {
        if (this.field1247 > 0) {
            if (arg0 >= this.field1247) {
                if (this.field1238 == Integer.MIN_VALUE) {
                    this.field1238 = 0;
                    this.field1242 = 0;
                    this.field1241 = 0;
                    this.field1240 = 0;
                    this.method3700();
                    arg0 = this.field1247;
                }
                this.field1247 = 0;
                this.method1289();
            } else {
                this.field1240 += this.field1248 * arg0;
                this.field1241 += this.field1237 * arg0;
                this.field1242 += this.field1249 * arg0;
                this.field1247 -= arg0;
            }
        }
        class63 var2 = (class63) this.field1254;
        int var3 = this.field1236 << 8;
        int var4 = this.field1245 << 8;
        int var5 = var2.field1220.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field1243 = 0;
        }
        if (this.field1250 < 0) {
            if (this.field1244 <= 0) {
                this.method1379();
                this.method3700();
                return;
            }
            this.field1250 = 0;
        }
        if (this.field1250 >= var5) {
            if (this.field1244 >= 0) {
                this.method1379();
                this.method3700();
                return;
            }
            this.field1250 = var5 - 1;
        }
        this.field1250 += this.field1244 * arg0;
        if (this.field1243 >= 0) {
            if (this.field1243 > 0) {
                if (this.field1246) {
                    label121: {
                        if (this.field1244 < 0) {
                            if (this.field1250 >= var3) {
                                return;
                            }
                            this.field1250 = var3 + var3 - 1 - this.field1250;
                            this.field1244 = -this.field1244;
                            if (--this.field1243 == 0) {
                                break label121;
                            }
                        }
                        do {
                            if (this.field1250 < var4) {
                                return;
                            }
                            this.field1250 = var4 + var4 - 1 - this.field1250;
                            this.field1244 = -this.field1244;
                            if (--this.field1243 == 0) {
                                break;
                            }
                            if (this.field1250 >= var3) {
                                return;
                            }
                            this.field1250 = var3 + var3 - 1 - this.field1250;
                            this.field1244 = -this.field1244;
                        } while (--this.field1243 != 0);
                    }
                } else {
                    label153: {
                        if (this.field1244 < 0) {
                            if (this.field1250 >= var3) {
                                return;
                            }
                            int var7 = (var4 - 1 - this.field1250) / var6;
                            if (var7 >= this.field1243) {
                                this.field1250 += this.field1243 * var6;
                                this.field1243 = 0;
                                break label153;
                            }
                            this.field1250 += var6 * var7;
                            this.field1243 -= var7;
                        } else if (this.field1250 >= var4) {
                            int var8 = (this.field1250 - var3) / var6;
                            if (var8 >= this.field1243) {
                                this.field1250 -= this.field1243 * var6;
                                this.field1243 = 0;
                                break label153;
                            }
                            this.field1250 -= var6 * var8;
                            this.field1243 -= var8;
                        } else {
                            return;
                        }
                        return;
                    }
                }
            }
            if (this.field1244 < 0) {
                if (this.field1250 < 0) {
                    this.field1250 = -1;
                    this.method1379();
                    this.method3700();
                }
            } else if (this.field1250 >= var5) {
                this.field1250 = var5;
                this.method1379();
                this.method3700();
            }
        } else if (this.field1246) {
            if (this.field1244 < 0) {
                if (this.field1250 >= var3) {
                    return;
                }
                this.field1250 = var3 + var3 - 1 - this.field1250;
                this.field1244 = -this.field1244;
            }
            while (this.field1250 >= var4) {
                this.field1250 = var4 + var4 - 1 - this.field1250;
                this.field1244 = -this.field1244;
                if (this.field1250 >= var3) {
                    return;
                }
                this.field1250 = var3 + var3 - 1 - this.field1250;
                this.field1244 = -this.field1244;
            }
        } else if (this.field1244 < 0) {
            if (this.field1250 >= var3) {
                return;
            }
            this.field1250 = var4 - 1 - (var4 - 1 - this.field1250) % var6;
        } else if (this.field1250 >= var4) {
            this.field1250 = (this.field1250 - var3) % var6 + var3;
        } else {
            return;
        }
    }

    @ObfuscatedName("bg.az([IIIII)I")
    public int method1409(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1247 > 0) {
                int var6 = this.field1247 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1247 += arg1;
                if (this.field1244 == 256 && (this.field1250 & 0xFF) == 0) {
                    if (Statics.field3216) {
                        arg1 = method1318(0, ((class63) this.field1254).field1220, arg0, this.field1250, arg1, this.field1241, this.field1242, this.field1237, this.field1249, 0, var6, arg2, this);
                    } else {
                        arg1 = method1317(((class63) this.field1254).field1220, arg0, this.field1250, arg1, this.field1240, this.field1248, 0, var6, arg2, this);
                    }
                } else if (Statics.field3216) {
                    arg1 = method1321(0, 0, ((class63) this.field1254).field1220, arg0, this.field1250, arg1, this.field1241, this.field1242, this.field1237, this.field1249, 0, var6, arg2, this, this.field1244, arg4);
                } else {
                    arg1 = method1320(0, 0, ((class63) this.field1254).field1220, arg0, this.field1250, arg1, this.field1240, this.field1248, 0, var6, arg2, this, this.field1244, arg4);
                }
                this.field1247 -= arg1;
                if (this.field1247 != 0) {
                    return arg1;
                }
                if (!this.method1319()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1244 == 256 && (this.field1250 & 0xFF) == 0) {
                if (Statics.field3216) {
                    return method1374(0, ((class63) this.field1254).field1220, arg0, this.field1250, arg1, this.field1241, this.field1242, 0, arg3, arg2, this);
                }
                return method1323(((class63) this.field1254).field1220, arg0, this.field1250, arg1, this.field1240, 0, arg3, arg2, this);
            }
            if (Statics.field3216) {
                return method1314(0, 0, ((class63) this.field1254).field1220, arg0, this.field1250, arg1, this.field1241, this.field1242, 0, arg3, arg2, this, this.field1244, arg4);
            }
            return method1313(0, 0, ((class63) this.field1254).field1220, arg0, this.field1250, arg1, this.field1240, 0, arg3, arg2, this, this.field1244, arg4);
        }
    }

    @ObfuscatedName("bg.av([IIIII)I")
    public int method1308(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1247 > 0) {
                int var6 = this.field1247 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1247 += arg1;
                if (this.field1244 == -256 && (this.field1250 & 0xFF) == 0) {
                    if (Statics.field3216) {
                        arg1 = method1304(0, ((class63) this.field1254).field1220, arg0, this.field1250, arg1, this.field1241, this.field1242, this.field1237, this.field1249, 0, var6, arg2, this);
                    } else {
                        arg1 = method1306(((class63) this.field1254).field1220, arg0, this.field1250, arg1, this.field1240, this.field1248, 0, var6, arg2, this);
                    }
                } else if (Statics.field3216) {
                    arg1 = method1334(0, 0, ((class63) this.field1254).field1220, arg0, this.field1250, arg1, this.field1241, this.field1242, this.field1237, this.field1249, 0, var6, arg2, this, this.field1244, arg4);
                } else {
                    arg1 = method1322(0, 0, ((class63) this.field1254).field1220, arg0, this.field1250, arg1, this.field1240, this.field1248, 0, var6, arg2, this, this.field1244, arg4);
                }
                this.field1247 -= arg1;
                if (this.field1247 != 0) {
                    return arg1;
                }
                if (!this.method1319()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1244 == -256 && (this.field1250 & 0xFF) == 0) {
                if (Statics.field3216) {
                    return method1312(0, ((class63) this.field1254).field1220, arg0, this.field1250, arg1, this.field1241, this.field1242, 0, arg3, arg2, this);
                }
                return method1311(((class63) this.field1254).field1220, arg0, this.field1250, arg1, this.field1240, 0, arg3, arg2, this);
            }
            if (Statics.field3216) {
                return method1316(0, 0, ((class63) this.field1254).field1220, arg0, this.field1250, arg1, this.field1241, this.field1242, 0, arg3, arg2, this, this.field1244, arg4);
            }
            return method1378(0, 0, ((class63) this.field1254).field1220, arg0, this.field1250, arg1, this.field1240, 0, arg3, arg2, this, this.field1244, arg4);
        }
    }

    @ObfuscatedName("bg.at()Z")
    public boolean method1319() {
        int var1 = this.field1238;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method1413(var1, this.field1239);
            var2 = method1283(var1, this.field1239);
        }
        if (this.field1240 != var1 || this.field1241 != var3 || this.field1242 != var2) {
            if (this.field1240 < var1) {
                this.field1248 = 1;
                this.field1247 = var1 - this.field1240;
            } else if (this.field1240 > var1) {
                this.field1248 = -1;
                this.field1247 = this.field1240 - var1;
            } else {
                this.field1248 = 0;
            }
            if (this.field1241 < var3) {
                this.field1237 = 1;
                if (this.field1247 == 0 || this.field1247 > var3 - this.field1241) {
                    this.field1247 = var3 - this.field1241;
                }
            } else if (this.field1241 > var3) {
                this.field1237 = -1;
                if (this.field1247 == 0 || this.field1247 > this.field1241 - var3) {
                    this.field1247 = this.field1241 - var3;
                }
            } else {
                this.field1237 = 0;
            }
            if (this.field1242 < var2) {
                this.field1249 = 1;
                if (this.field1247 == 0 || this.field1247 > var2 - this.field1242) {
                    this.field1247 = var2 - this.field1242;
                }
            } else if (this.field1242 > var2) {
                this.field1249 = -1;
                if (this.field1247 == 0 || this.field1247 > this.field1242 - var2) {
                    this.field1247 = this.field1242 - var2;
                }
            } else {
                this.field1249 = 0;
            }
            return false;
        } else if (this.field1238 == Integer.MIN_VALUE) {
            this.field1238 = 0;
            this.field1242 = 0;
            this.field1241 = 0;
            this.field1240 = 0;
            this.method3700();
            return true;
        } else {
            this.method1289();
            return false;
        }
    }

    @ObfuscatedName("bg.al([B[IIIIIIILbg;)I")
    public static int method1323(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class65 arg8) {
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
        arg8.field1250 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("bg.ac(I[B[IIIIIIIILbg;)I")
    public static int method1374(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class65 arg10) {
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
        arg10.field1250 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("bg.ar([B[IIIIIIILbg;)I")
    public static int method1311(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class65 arg8) {
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
        arg8.field1250 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("bg.ak(I[B[IIIIIIIILbg;)I")
    public static int method1312(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class65 arg10) {
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
        arg10.field1250 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("bg.ag(II[B[IIIIIIILbg;II)I")
    public static int method1313(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class65 arg10, int arg11, int arg12) {
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
        arg10.field1250 = arg4;
        return arg5;
    }

    @ObfuscatedName("bg.aq(II[B[IIIIIIIILbg;II)I")
    public static int method1314(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class65 arg11, int arg12, int arg13) {
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
        arg11.field1250 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("bg.au(II[B[IIIIIIILbg;II)I")
    public static int method1378(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class65 arg10, int arg11, int arg12) {
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
        arg10.field1250 = arg4;
        return arg5;
    }

    @ObfuscatedName("bg.aw(II[B[IIIIIIIILbg;II)I")
    public static int method1316(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class65 arg11, int arg12, int arg13) {
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
        arg11.field1250 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("bg.ad([B[IIIIIIIILbg;)I")
    public static int method1317(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class65 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field1241 += (var14 - arg3) * arg9.field1237;
        arg9.field1242 += (var14 - arg3) * arg9.field1249;
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
        arg9.field1240 = var12 >> 2;
        arg9.field1250 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("bg.af(I[B[IIIIIIIIIILbg;)I")
    public static int method1318(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class65 arg12) {
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
        arg12.field1240 += (var19 - arg4) * arg12.field1248;
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
        arg12.field1241 = var15 >> 2;
        arg12.field1242 = var16 >> 2;
        arg12.field1250 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("bg.aj([B[IIIIIIIILbg;)I")
    public static int method1306(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class65 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field1241 += (var14 - arg3) * arg9.field1237;
        arg9.field1242 += (var14 - arg3) * arg9.field1249;
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
        arg9.field1240 = var12 >> 2;
        arg9.field1250 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("bg.ab(I[B[IIIIIIIIIILbg;)I")
    public static int method1304(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class65 arg12) {
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
        arg12.field1240 += (var19 - arg4) * arg12.field1248;
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
        arg12.field1241 = var15 >> 2;
        arg12.field1242 = var16 >> 2;
        arg12.field1250 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("bg.an(II[B[IIIIIIIILbg;II)I")
    public static int method1320(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class65 arg11, int arg12, int arg13) {
        arg11.field1241 -= arg11.field1237 * arg5;
        arg11.field1242 -= arg11.field1249 * arg5;
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
        arg11.field1241 += arg11.field1237 * arg5;
        arg11.field1242 += arg11.field1249 * arg5;
        arg11.field1240 = arg6;
        arg11.field1250 = arg4;
        return arg5;
    }

    @ObfuscatedName("bg.bj(II[B[IIIIIIIIIILbg;II)I")
    public static int method1321(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class65 arg13, int arg14, int arg15) {
        arg13.field1240 -= arg13.field1248 * arg5;
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
        arg13.field1240 += arg13.field1248 * var27;
        arg13.field1241 = arg6;
        arg13.field1242 = arg7;
        arg13.field1250 = arg4;
        return var27;
    }

    @ObfuscatedName("bg.bn(II[B[IIIIIIIILbg;II)I")
    public static int method1322(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class65 arg11, int arg12, int arg13) {
        arg11.field1241 -= arg11.field1237 * arg5;
        arg11.field1242 -= arg11.field1249 * arg5;
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
        arg11.field1241 += arg11.field1237 * arg5;
        arg11.field1242 += arg11.field1249 * arg5;
        arg11.field1240 = arg6;
        arg11.field1250 = arg4;
        return arg5;
    }

    @ObfuscatedName("bg.bf(II[B[IIIIIIIIIILbg;II)I")
    public static int method1334(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class65 arg13, int arg14, int arg15) {
        arg13.field1240 -= arg13.field1248 * arg5;
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
        arg13.field1240 += arg13.field1248 * var26;
        arg13.field1241 = arg6;
        arg13.field1242 = arg7;
        arg13.field1250 = arg4;
        return var26;
    }
}
