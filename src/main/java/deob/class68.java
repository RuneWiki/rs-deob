package deob;

@ObfuscatedName("br")
public class class68 extends class70 {

    @ObfuscatedName("br.i")
    public int field1311;

    @ObfuscatedName("br.h")
    public int field1303;

    @ObfuscatedName("br.e")
    public int field1316;

    @ObfuscatedName("br.g")
    public int field1302;

    @ObfuscatedName("br.n")
    public int field1304;

    @ObfuscatedName("br.u")
    public int field1307;

    @ObfuscatedName("br.d")
    public int field1308;

    @ObfuscatedName("br.l")
    public int field1309;

    @ObfuscatedName("br.m")
    public int field1310;

    @ObfuscatedName("br.j")
    public int field1305;

    @ObfuscatedName("br.y")
    public boolean field1312;

    @ObfuscatedName("br.s")
    public int field1313;

    @ObfuscatedName("br.p")
    public int field1314;

    @ObfuscatedName("br.v")
    public int field1315;

    @ObfuscatedName("br.r")
    public int field1306;

    @ObfuscatedName("br.i(II)I")
    public static int method1333(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("br.h(II)I")
    public static int method1373(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("br.ah()I")
    public int method1425() {
        int var1 = this.field1304 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field1309 == 0) {
            var2 -= this.field1311 * var2 / (((class66) this.field1318).field1289.length << 8);
        } else if (this.field1309 >= 0) {
            var2 -= this.field1310 * var2 / ((class66) this.field1318).field1289.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    public class68(class66 arg0, int arg1, int arg2) {
        this.field1318 = arg0;
        this.field1310 = arg0.field1287;
        this.field1305 = arg0.field1288;
        this.field1312 = arg0.field1285;
        this.field1303 = arg1;
        this.field1316 = arg2;
        this.field1302 = 8192;
        this.field1311 = 0;
        this.method1361();
    }

    public class68(class66 arg0, int arg1, int arg2, int arg3) {
        this.field1318 = arg0;
        this.field1310 = arg0.field1287;
        this.field1305 = arg0.field1288;
        this.field1312 = arg0.field1285;
        this.field1303 = arg1;
        this.field1316 = arg2;
        this.field1302 = arg3;
        this.field1311 = 0;
        this.method1361();
    }

    @ObfuscatedName("br.e(Lbd;II)Lbr;")
    public static class68 method1312(class66 arg0, int arg1, int arg2) {
        return arg0.field1289 == null || arg0.field1289.length == 0 ? null : new class68(arg0, (int) ((long) arg0.field1286 * 256L * (long) arg1 / (long) (Statics.field1240 * 100)), arg2 << 6);
    }

    @ObfuscatedName("br.g(Lbd;III)Lbr;")
    public static class68 method1313(class66 arg0, int arg1, int arg2, int arg3) {
        return arg0.field1289 == null || arg0.field1289.length == 0 ? null : new class68(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("br.n()V")
    public void method1361() {
        this.field1304 = this.field1316;
        this.field1307 = method1333(this.field1316, this.field1302);
        this.field1308 = method1373(this.field1316, this.field1302);
    }

    @ObfuscatedName("br.j(I)V")
    public synchronized void method1339(int arg0) {
        this.field1309 = arg0;
    }

    @ObfuscatedName("br.s(I)V")
    public synchronized void method1316(int arg0) {
        this.method1310(arg0 << 6, this.method1441());
    }

    @ObfuscatedName("br.p(I)V")
    public synchronized void method1317(int arg0) {
        this.method1310(arg0, this.method1441());
    }

    @ObfuscatedName("br.v(II)V")
    public synchronized void method1310(int arg0, int arg1) {
        this.field1316 = arg0;
        this.field1302 = arg1;
        this.field1313 = 0;
        this.method1361();
    }

    @ObfuscatedName("br.r()I")
    public synchronized int method1319() {
        return this.field1316 == Integer.MIN_VALUE ? 0 : this.field1316;
    }

    @ObfuscatedName("br.c()I")
    public synchronized int method1441() {
        return this.field1302 < 0 ? -1 : this.field1302;
    }

    @ObfuscatedName("br.w(I)V")
    public synchronized void method1321(int arg0) {
        int var2 = ((class66) this.field1318).field1289.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field1311 = arg0;
    }

    @ObfuscatedName("br.x(Z)V")
    public synchronized void method1322(boolean arg0) {
        this.field1303 = (this.field1303 >>> 31) + (this.field1303 ^ this.field1303 >> 31);
        if (arg0) {
            this.field1303 = -this.field1303;
        }
    }

    @ObfuscatedName("br.k()V")
    public void method1376() {
        if (this.field1313 == 0) {
            return;
        }
        if (this.field1316 == Integer.MIN_VALUE) {
            this.field1316 = 0;
        }
        this.field1313 = 0;
        this.method1361();
    }

    @ObfuscatedName("br.z(II)V")
    public synchronized void method1353(int arg0, int arg1) {
        this.method1325(arg0, arg1, this.method1441());
    }

    @ObfuscatedName("br.q(III)V")
    public synchronized void method1325(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method1310(arg1, arg2);
            return;
        }
        int var4 = method1333(arg1, arg2);
        int var5 = method1373(arg1, arg2);
        if (this.field1307 == var4 && this.field1308 == var5) {
            this.field1313 = 0;
            return;
        }
        int var6 = arg1 - this.field1304;
        if (this.field1304 - arg1 > var6) {
            var6 = this.field1304 - arg1;
        }
        if (var4 - this.field1307 > var6) {
            var6 = var4 - this.field1307;
        }
        if (this.field1307 - var4 > var6) {
            var6 = this.field1307 - var4;
        }
        if (var5 - this.field1308 > var6) {
            var6 = var5 - this.field1308;
        }
        if (this.field1308 - var5 > var6) {
            var6 = this.field1308 - var5;
        }
        if (arg0 > var6) {
            arg0 = var6;
        }
        this.field1313 = arg0;
        this.field1316 = arg1;
        this.field1302 = arg2;
        this.field1314 = (arg1 - this.field1304) / arg0;
        this.field1315 = (var4 - this.field1307) / arg0;
        this.field1306 = (var5 - this.field1308) / arg0;
    }

    @ObfuscatedName("br.o(I)V")
    public synchronized void method1326(int arg0) {
        if (arg0 == 0) {
            this.method1317(0);
            this.method3706();
        } else if (this.field1307 == 0 && this.field1308 == 0) {
            this.field1313 = 0;
            this.field1316 = 0;
            this.field1304 = 0;
            this.method3706();
        } else {
            int var2 = -this.field1304;
            if (this.field1304 > var2) {
                var2 = this.field1304;
            }
            if (-this.field1307 > var2) {
                var2 = -this.field1307;
            }
            if (this.field1307 > var2) {
                var2 = this.field1307;
            }
            if (-this.field1308 > var2) {
                var2 = -this.field1308;
            }
            if (this.field1308 > var2) {
                var2 = this.field1308;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field1313 = arg0;
            this.field1316 = Integer.MIN_VALUE;
            this.field1314 = -this.field1304 / arg0;
            this.field1315 = -this.field1307 / arg0;
            this.field1306 = -this.field1308 / arg0;
        }
    }

    @ObfuscatedName("br.f(I)V")
    public synchronized void method1363(int arg0) {
        if (this.field1303 < 0) {
            this.field1303 = -arg0;
        } else {
            this.field1303 = arg0;
        }
    }

    @ObfuscatedName("br.b()I")
    public synchronized int method1328() {
        return this.field1303 < 0 ? -this.field1303 : this.field1303;
    }

    @ObfuscatedName("br.ag()Z")
    public boolean method1315() {
        return this.field1311 < 0 || this.field1311 >= ((class66) this.field1318).field1289.length << 8;
    }

    @ObfuscatedName("br.aw()Z")
    public boolean method1330() {
        return this.field1313 != 0;
    }

    @ObfuscatedName("br.u()Lbf;")
    public class70 method1148() {
        return null;
    }

    @ObfuscatedName("br.d()Lbf;")
    public class70 method1149() {
        return null;
    }

    @ObfuscatedName("br.l()I")
    public int method1150() {
        return this.field1316 == 0 && this.field1313 == 0 ? 0 : 1;
    }

    @ObfuscatedName("br.m([III)V")
    public synchronized void method1151(int[] arg0, int arg1, int arg2) {
        if (this.field1316 == 0 && this.field1313 == 0) {
            this.method1169(arg2);
            return;
        }
        class66 var4 = (class66) this.field1318;
        int var5 = this.field1310 << 8;
        int var6 = this.field1305 << 8;
        int var7 = var4.field1289.length << 8;
        int var8 = var6 - var5;
        if (var8 <= 0) {
            this.field1309 = 0;
        }
        int var9 = arg1;
        int var10 = arg1 + arg2;
        if (this.field1311 < 0) {
            if (this.field1303 <= 0) {
                this.method1376();
                this.method3706();
                return;
            }
            this.field1311 = 0;
        }
        if (this.field1311 >= var7) {
            if (this.field1303 >= 0) {
                this.method1376();
                this.method3706();
                return;
            }
            this.field1311 = var7 - 1;
        }
        if (this.field1309 >= 0) {
            if (this.field1309 > 0) {
                if (this.field1312) {
                    label131: {
                        if (this.field1303 < 0) {
                            var9 = this.method1335(arg0, arg1, var5, var10, var4.field1289[this.field1310]);
                            if (this.field1311 >= var5) {
                                return;
                            }
                            this.field1311 = var5 + var5 - 1 - this.field1311;
                            this.field1303 = -this.field1303;
                            if (--this.field1309 == 0) {
                                break label131;
                            }
                        }
                        do {
                            var9 = this.method1334(arg0, var9, var6, var10, var4.field1289[this.field1305 - 1]);
                            if (this.field1311 < var6) {
                                return;
                            }
                            this.field1311 = var6 + var6 - 1 - this.field1311;
                            this.field1303 = -this.field1303;
                            if (--this.field1309 == 0) {
                                break;
                            }
                            var9 = this.method1335(arg0, var9, var5, var10, var4.field1289[this.field1310]);
                            if (this.field1311 >= var5) {
                                return;
                            }
                            this.field1311 = var5 + var5 - 1 - this.field1311;
                            this.field1303 = -this.field1303;
                        } while (--this.field1309 != 0);
                    }
                } else if (this.field1303 < 0) {
                    while (true) {
                        var9 = this.method1335(arg0, var9, var5, var10, var4.field1289[this.field1305 - 1]);
                        if (this.field1311 >= var5) {
                            return;
                        }
                        int var12 = (var6 - 1 - this.field1311) / var8;
                        if (var12 >= this.field1309) {
                            this.field1311 += this.field1309 * var8;
                            this.field1309 = 0;
                            break;
                        }
                        this.field1311 += var8 * var12;
                        this.field1309 -= var12;
                    }
                } else {
                    while (true) {
                        var9 = this.method1334(arg0, var9, var6, var10, var4.field1289[this.field1310]);
                        if (this.field1311 < var6) {
                            return;
                        }
                        int var13 = (this.field1311 - var5) / var8;
                        if (var13 >= this.field1309) {
                            this.field1311 -= this.field1309 * var8;
                            this.field1309 = 0;
                            break;
                        }
                        this.field1311 -= var8 * var13;
                        this.field1309 -= var13;
                    }
                }
            }
            if (this.field1303 < 0) {
                this.method1335(arg0, var9, 0, var10, 0);
                if (this.field1311 < 0) {
                    this.field1311 = -1;
                    this.method1376();
                    this.method3706();
                }
            } else {
                this.method1334(arg0, var9, var7, var10, 0);
                if (this.field1311 >= var7) {
                    this.field1311 = var7;
                    this.method1376();
                    this.method3706();
                }
            }
        } else if (this.field1312) {
            if (this.field1303 < 0) {
                var9 = this.method1335(arg0, arg1, var5, var10, var4.field1289[this.field1310]);
                if (this.field1311 >= var5) {
                    return;
                }
                this.field1311 = var5 + var5 - 1 - this.field1311;
                this.field1303 = -this.field1303;
            }
            while (true) {
                int var11 = this.method1334(arg0, var9, var6, var10, var4.field1289[this.field1305 - 1]);
                if (this.field1311 < var6) {
                    return;
                }
                this.field1311 = var6 + var6 - 1 - this.field1311;
                this.field1303 = -this.field1303;
                var9 = this.method1335(arg0, var11, var5, var10, var4.field1289[this.field1310]);
                if (this.field1311 >= var5) {
                    return;
                }
                this.field1311 = var5 + var5 - 1 - this.field1311;
                this.field1303 = -this.field1303;
            }
        } else if (this.field1303 < 0) {
            while (true) {
                var9 = this.method1335(arg0, var9, var5, var10, var4.field1289[this.field1305 - 1]);
                if (this.field1311 >= var5) {
                    return;
                }
                this.field1311 = var6 - 1 - (var6 - 1 - this.field1311) % var8;
            }
        } else {
            while (true) {
                var9 = this.method1334(arg0, var9, var6, var10, var4.field1289[this.field1310]);
                if (this.field1311 < var6) {
                    return;
                }
                this.field1311 = (this.field1311 - var5) % var8 + var5;
            }
        }
    }

    @ObfuscatedName("br.y(I)V")
    public synchronized void method1169(int arg0) {
        if (this.field1313 > 0) {
            if (arg0 >= this.field1313) {
                if (this.field1316 == Integer.MIN_VALUE) {
                    this.field1316 = 0;
                    this.field1308 = 0;
                    this.field1307 = 0;
                    this.field1304 = 0;
                    this.method3706();
                    arg0 = this.field1313;
                }
                this.field1313 = 0;
                this.method1361();
            } else {
                this.field1304 += this.field1314 * arg0;
                this.field1307 += this.field1315 * arg0;
                this.field1308 += this.field1306 * arg0;
                this.field1313 -= arg0;
            }
        }
        class66 var2 = (class66) this.field1318;
        int var3 = this.field1310 << 8;
        int var4 = this.field1305 << 8;
        int var5 = var2.field1289.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field1309 = 0;
        }
        if (this.field1311 < 0) {
            if (this.field1303 <= 0) {
                this.method1376();
                this.method3706();
                return;
            }
            this.field1311 = 0;
        }
        if (this.field1311 >= var5) {
            if (this.field1303 >= 0) {
                this.method1376();
                this.method3706();
                return;
            }
            this.field1311 = var5 - 1;
        }
        this.field1311 += this.field1303 * arg0;
        if (this.field1309 >= 0) {
            if (this.field1309 > 0) {
                if (this.field1312) {
                    label121: {
                        if (this.field1303 < 0) {
                            if (this.field1311 >= var3) {
                                return;
                            }
                            this.field1311 = var3 + var3 - 1 - this.field1311;
                            this.field1303 = -this.field1303;
                            if (--this.field1309 == 0) {
                                break label121;
                            }
                        }
                        do {
                            if (this.field1311 < var4) {
                                return;
                            }
                            this.field1311 = var4 + var4 - 1 - this.field1311;
                            this.field1303 = -this.field1303;
                            if (--this.field1309 == 0) {
                                break;
                            }
                            if (this.field1311 >= var3) {
                                return;
                            }
                            this.field1311 = var3 + var3 - 1 - this.field1311;
                            this.field1303 = -this.field1303;
                        } while (--this.field1309 != 0);
                    }
                } else {
                    label153: {
                        if (this.field1303 < 0) {
                            if (this.field1311 >= var3) {
                                return;
                            }
                            int var7 = (var4 - 1 - this.field1311) / var6;
                            if (var7 >= this.field1309) {
                                this.field1311 += this.field1309 * var6;
                                this.field1309 = 0;
                                break label153;
                            }
                            this.field1311 += var6 * var7;
                            this.field1309 -= var7;
                        } else if (this.field1311 >= var4) {
                            int var8 = (this.field1311 - var3) / var6;
                            if (var8 >= this.field1309) {
                                this.field1311 -= this.field1309 * var6;
                                this.field1309 = 0;
                                break label153;
                            }
                            this.field1311 -= var6 * var8;
                            this.field1309 -= var8;
                        } else {
                            return;
                        }
                        return;
                    }
                }
            }
            if (this.field1303 < 0) {
                if (this.field1311 < 0) {
                    this.field1311 = -1;
                    this.method1376();
                    this.method3706();
                }
            } else if (this.field1311 >= var5) {
                this.field1311 = var5;
                this.method1376();
                this.method3706();
            }
        } else if (this.field1312) {
            if (this.field1303 < 0) {
                if (this.field1311 >= var3) {
                    return;
                }
                this.field1311 = var3 + var3 - 1 - this.field1311;
                this.field1303 = -this.field1303;
            }
            while (this.field1311 >= var4) {
                this.field1311 = var4 + var4 - 1 - this.field1311;
                this.field1303 = -this.field1303;
                if (this.field1311 >= var3) {
                    return;
                }
                this.field1311 = var3 + var3 - 1 - this.field1311;
                this.field1303 = -this.field1303;
            }
        } else if (this.field1303 < 0) {
            if (this.field1311 >= var3) {
                return;
            }
            this.field1311 = var4 - 1 - (var4 - 1 - this.field1311) % var6;
        } else if (this.field1311 >= var4) {
            this.field1311 = (this.field1311 - var3) % var6 + var3;
        } else {
            return;
        }
    }

    @ObfuscatedName("br.ao([IIIII)I")
    public int method1334(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1313 > 0) {
                int var6 = this.field1313 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1313 += arg1;
                if (this.field1303 == 256 && (this.field1311 & 0xFF) == 0) {
                    if (Statics.field3222) {
                        arg1 = method1336(0, ((class66) this.field1318).field1289, arg0, this.field1311, arg1, this.field1307, this.field1308, this.field1315, this.field1306, 0, var6, arg2, this);
                    } else {
                        arg1 = method1345(((class66) this.field1318).field1289, arg0, this.field1311, arg1, this.field1304, this.field1314, 0, var6, arg2, this);
                    }
                } else if (Statics.field3222) {
                    arg1 = method1382(0, 0, ((class66) this.field1318).field1289, arg0, this.field1311, arg1, this.field1307, this.field1308, this.field1315, this.field1306, 0, var6, arg2, this, this.field1303, arg4);
                } else {
                    arg1 = method1349(0, 0, ((class66) this.field1318).field1289, arg0, this.field1311, arg1, this.field1304, this.field1314, 0, var6, arg2, this, this.field1303, arg4);
                }
                this.field1313 -= arg1;
                if (this.field1313 != 0) {
                    return arg1;
                }
                if (!this.method1396()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1303 == 256 && (this.field1311 & 0xFF) == 0) {
                if (Statics.field3222) {
                    return method1314(0, ((class66) this.field1318).field1289, arg0, this.field1311, arg1, this.field1307, this.field1308, 0, arg3, arg2, this);
                }
                return method1337(((class66) this.field1318).field1289, arg0, this.field1311, arg1, this.field1304, 0, arg3, arg2, this);
            }
            if (Statics.field3222) {
                return method1342(0, 0, ((class66) this.field1318).field1289, arg0, this.field1311, arg1, this.field1307, this.field1308, 0, arg3, arg2, this, this.field1303, arg4);
            }
            return method1350(0, 0, ((class66) this.field1318).field1289, arg0, this.field1311, arg1, this.field1304, 0, arg3, arg2, this, this.field1303, arg4);
        }
    }

    @ObfuscatedName("br.ax([IIIII)I")
    public int method1335(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1313 > 0) {
                int var6 = this.field1313 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1313 += arg1;
                if (this.field1303 == -256 && (this.field1311 & 0xFF) == 0) {
                    if (Statics.field3222) {
                        arg1 = method1348(0, ((class66) this.field1318).field1289, arg0, this.field1311, arg1, this.field1307, this.field1308, this.field1315, this.field1306, 0, var6, arg2, this);
                    } else {
                        arg1 = method1324(((class66) this.field1318).field1289, arg0, this.field1311, arg1, this.field1304, this.field1314, 0, var6, arg2, this);
                    }
                } else if (Statics.field3222) {
                    arg1 = method1351(0, 0, ((class66) this.field1318).field1289, arg0, this.field1311, arg1, this.field1307, this.field1308, this.field1315, this.field1306, 0, var6, arg2, this, this.field1303, arg4);
                } else {
                    arg1 = method1379(0, 0, ((class66) this.field1318).field1289, arg0, this.field1311, arg1, this.field1304, this.field1314, 0, var6, arg2, this, this.field1303, arg4);
                }
                this.field1313 -= arg1;
                if (this.field1313 != 0) {
                    return arg1;
                }
                if (!this.method1396()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1303 == -256 && (this.field1311 & 0xFF) == 0) {
                if (Statics.field3222) {
                    return method1340(0, ((class66) this.field1318).field1289, arg0, this.field1311, arg1, this.field1307, this.field1308, 0, arg3, arg2, this);
                }
                return method1338(((class66) this.field1318).field1289, arg0, this.field1311, arg1, this.field1304, 0, arg3, arg2, this);
            }
            if (Statics.field3222) {
                return method1344(0, 0, ((class66) this.field1318).field1289, arg0, this.field1311, arg1, this.field1307, this.field1308, 0, arg3, arg2, this, this.field1303, arg4);
            }
            return method1343(0, 0, ((class66) this.field1318).field1289, arg0, this.field1311, arg1, this.field1304, 0, arg3, arg2, this, this.field1303, arg4);
        }
    }

    @ObfuscatedName("br.ac()Z")
    public boolean method1396() {
        int var1 = this.field1316;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method1333(var1, this.field1302);
            var2 = method1373(var1, this.field1302);
        }
        if (this.field1304 != var1 || this.field1307 != var3 || this.field1308 != var2) {
            if (this.field1304 < var1) {
                this.field1314 = 1;
                this.field1313 = var1 - this.field1304;
            } else if (this.field1304 > var1) {
                this.field1314 = -1;
                this.field1313 = this.field1304 - var1;
            } else {
                this.field1314 = 0;
            }
            if (this.field1307 < var3) {
                this.field1315 = 1;
                if (this.field1313 == 0 || this.field1313 > var3 - this.field1307) {
                    this.field1313 = var3 - this.field1307;
                }
            } else if (this.field1307 > var3) {
                this.field1315 = -1;
                if (this.field1313 == 0 || this.field1313 > this.field1307 - var3) {
                    this.field1313 = this.field1307 - var3;
                }
            } else {
                this.field1315 = 0;
            }
            if (this.field1308 < var2) {
                this.field1306 = 1;
                if (this.field1313 == 0 || this.field1313 > var2 - this.field1308) {
                    this.field1313 = var2 - this.field1308;
                }
            } else if (this.field1308 > var2) {
                this.field1306 = -1;
                if (this.field1313 == 0 || this.field1313 > this.field1308 - var2) {
                    this.field1313 = this.field1308 - var2;
                }
            } else {
                this.field1306 = 0;
            }
            return false;
        } else if (this.field1316 == Integer.MIN_VALUE) {
            this.field1316 = 0;
            this.field1308 = 0;
            this.field1307 = 0;
            this.field1304 = 0;
            this.method3706();
            return true;
        } else {
            this.method1361();
            return false;
        }
    }

    @ObfuscatedName("br.ai([B[IIIIIIILbr;)I")
    public static int method1337(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class68 arg8) {
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
        arg8.field1311 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("br.ap(I[B[IIIIIIIILbr;)I")
    public static int method1314(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class68 arg10) {
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
        arg10.field1311 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("br.aa([B[IIIIIIILbr;)I")
    public static int method1338(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class68 arg8) {
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
        arg8.field1311 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("br.ay(I[B[IIIIIIIILbr;)I")
    public static int method1340(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class68 arg10) {
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
        arg10.field1311 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("br.ab(II[B[IIIIIIILbr;II)I")
    public static int method1350(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class68 arg10, int arg11, int arg12) {
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
        arg10.field1311 = arg4;
        return arg5;
    }

    @ObfuscatedName("br.aj(II[B[IIIIIIIILbr;II)I")
    public static int method1342(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class68 arg11, int arg12, int arg13) {
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
        arg11.field1311 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("br.az(II[B[IIIIIIILbr;II)I")
    public static int method1343(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class68 arg10, int arg11, int arg12) {
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
        arg10.field1311 = arg4;
        return arg5;
    }

    @ObfuscatedName("br.av(II[B[IIIIIIIILbr;II)I")
    public static int method1344(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class68 arg11, int arg12, int arg13) {
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
        arg11.field1311 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("br.ae([B[IIIIIIIILbr;)I")
    public static int method1345(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class68 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field1307 += (var14 - arg3) * arg9.field1315;
        arg9.field1308 += (var14 - arg3) * arg9.field1306;
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
        arg9.field1304 = var12 >> 2;
        arg9.field1311 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("br.at(I[B[IIIIIIIIIILbr;)I")
    public static int method1336(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class68 arg12) {
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
        arg12.field1304 += (var19 - arg4) * arg12.field1314;
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
        arg12.field1307 = var15 >> 2;
        arg12.field1308 = var16 >> 2;
        arg12.field1311 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("br.bc([B[IIIIIIIILbr;)I")
    public static int method1324(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class68 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field1307 += (var14 - arg3) * arg9.field1315;
        arg9.field1308 += (var14 - arg3) * arg9.field1306;
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
        arg9.field1304 = var12 >> 2;
        arg9.field1311 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("br.bv(I[B[IIIIIIIIIILbr;)I")
    public static int method1348(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class68 arg12) {
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
        arg12.field1304 += (var19 - arg4) * arg12.field1314;
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
        arg12.field1307 = var15 >> 2;
        arg12.field1308 = var16 >> 2;
        arg12.field1311 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("br.bi(II[B[IIIIIIIILbr;II)I")
    public static int method1349(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class68 arg11, int arg12, int arg13) {
        arg11.field1307 -= arg11.field1315 * arg5;
        arg11.field1308 -= arg11.field1306 * arg5;
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
        arg11.field1307 += arg11.field1315 * arg5;
        arg11.field1308 += arg11.field1306 * arg5;
        arg11.field1304 = arg6;
        arg11.field1311 = arg4;
        return arg5;
    }

    @ObfuscatedName("br.by(II[B[IIIIIIIIIILbr;II)I")
    public static int method1382(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class68 arg13, int arg14, int arg15) {
        arg13.field1304 -= arg13.field1314 * arg5;
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
        arg13.field1304 += arg13.field1314 * var27;
        arg13.field1307 = arg6;
        arg13.field1308 = arg7;
        arg13.field1311 = arg4;
        return var27;
    }

    @ObfuscatedName("br.bu(II[B[IIIIIIIILbr;II)I")
    public static int method1379(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class68 arg11, int arg12, int arg13) {
        arg11.field1307 -= arg11.field1315 * arg5;
        arg11.field1308 -= arg11.field1306 * arg5;
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
        arg11.field1307 += arg11.field1315 * arg5;
        arg11.field1308 += arg11.field1306 * arg5;
        arg11.field1304 = arg6;
        arg11.field1311 = arg4;
        return arg5;
    }

    @ObfuscatedName("br.bb(II[B[IIIIIIIIIILbr;II)I")
    public static int method1351(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class68 arg13, int arg14, int arg15) {
        arg13.field1304 -= arg13.field1314 * arg5;
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
        arg13.field1304 += arg13.field1314 * var26;
        arg13.field1307 = arg6;
        arg13.field1308 = arg7;
        arg13.field1311 = arg4;
        return var26;
    }
}
