package deob;

@ObfuscatedName("bz")
public class class65 extends class67 {

    @ObfuscatedName("bz.a")
    public int field1257;

    @ObfuscatedName("bz.r")
    public int field1255;

    @ObfuscatedName("bz.f")
    public int field1250;

    @ObfuscatedName("bz.s")
    public int field1260;

    @ObfuscatedName("bz.y")
    public int field1249;

    @ObfuscatedName("bz.e")
    public int field1253;

    @ObfuscatedName("bz.g")
    public int field1254;

    @ObfuscatedName("bz.m")
    public int field1248;

    @ObfuscatedName("bz.j")
    public int field1256;

    @ObfuscatedName("bz.n")
    public int field1252;

    @ObfuscatedName("bz.l")
    public boolean field1258;

    @ObfuscatedName("bz.h")
    public int field1259;

    @ObfuscatedName("bz.i")
    public int field1251;

    @ObfuscatedName("bz.v")
    public int field1261;

    @ObfuscatedName("bz.z")
    public int field1262;

    @ObfuscatedName("bz.a(II)I")
    public static int method1335(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("bz.r(II)I")
    public static int method1276(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("bz.ag()I")
    public int method1277() {
        int var1 = this.field1249 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field1248 == 0) {
            var2 -= this.field1257 * var2 / (((class63) this.field1267).field1232.length << 8);
        } else if (this.field1248 >= 0) {
            var2 -= this.field1256 * var2 / ((class63) this.field1267).field1232.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    public class65(class63 arg0, int arg1, int arg2) {
        this.field1267 = arg0;
        this.field1256 = arg0.field1231;
        this.field1252 = arg0.field1234;
        this.field1258 = arg0.field1235;
        this.field1255 = arg1;
        this.field1250 = arg2;
        this.field1260 = 8192;
        this.field1257 = 0;
        this.method1279();
    }

    public class65(class63 arg0, int arg1, int arg2, int arg3) {
        this.field1267 = arg0;
        this.field1256 = arg0.field1231;
        this.field1252 = arg0.field1234;
        this.field1258 = arg0.field1235;
        this.field1255 = arg1;
        this.field1250 = arg2;
        this.field1260 = arg3;
        this.field1257 = 0;
        this.method1279();
    }

    @ObfuscatedName("bz.f(Lbl;II)Lbz;")
    public static class65 method1366(class63 arg0, int arg1, int arg2) {
        return arg0.field1232 == null || arg0.field1232.length == 0 ? null : new class65(arg0, (int) ((long) arg0.field1233 * 256L * (long) arg1 / (long) (Statics.field1186 * 100)), arg2 << 6);
    }

    @ObfuscatedName("bz.s(Lbl;III)Lbz;")
    public static class65 method1278(class63 arg0, int arg1, int arg2, int arg3) {
        return arg0.field1232 == null || arg0.field1232.length == 0 ? null : new class65(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("bz.y()V")
    public void method1279() {
        this.field1249 = this.field1250;
        this.field1253 = method1335(this.field1250, this.field1260);
        this.field1254 = method1276(this.field1250, this.field1260);
    }

    @ObfuscatedName("bz.n(I)V")
    public synchronized void method1280(int arg0) {
        this.field1248 = arg0;
    }

    @ObfuscatedName("bz.h(I)V")
    public synchronized void method1281(int arg0) {
        this.method1283(arg0 << 6, this.method1375());
    }

    @ObfuscatedName("bz.i(I)V")
    public synchronized void method1282(int arg0) {
        this.method1283(arg0, this.method1375());
    }

    @ObfuscatedName("bz.v(II)V")
    public synchronized void method1283(int arg0, int arg1) {
        this.field1250 = arg0;
        this.field1260 = arg1;
        this.field1259 = 0;
        this.method1279();
    }

    @ObfuscatedName("bz.z()I")
    public synchronized int method1284() {
        return this.field1250 == Integer.MIN_VALUE ? 0 : this.field1250;
    }

    @ObfuscatedName("bz.u()I")
    public synchronized int method1375() {
        return this.field1260 < 0 ? -1 : this.field1260;
    }

    @ObfuscatedName("bz.t(I)V")
    public synchronized void method1307(int arg0) {
        int var2 = ((class63) this.field1267).field1232.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field1257 = arg0;
    }

    @ObfuscatedName("bz.b(Z)V")
    public synchronized void method1287(boolean arg0) {
        this.field1255 = (this.field1255 >>> 31) + (this.field1255 ^ this.field1255 >> 31);
        if (arg0) {
            this.field1255 = -this.field1255;
        }
    }

    @ObfuscatedName("bz.c()V")
    public void method1288() {
        if (this.field1259 == 0) {
            return;
        }
        if (this.field1250 == Integer.MIN_VALUE) {
            this.field1250 = 0;
        }
        this.field1259 = 0;
        this.method1279();
    }

    @ObfuscatedName("bz.x(II)V")
    public synchronized void method1415(int arg0, int arg1) {
        this.method1302(arg0, arg1, this.method1375());
    }

    @ObfuscatedName("bz.d(III)V")
    public synchronized void method1302(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method1283(arg1, arg2);
            return;
        }
        int var4 = method1335(arg1, arg2);
        int var5 = method1276(arg1, arg2);
        if (this.field1253 == var4 && this.field1254 == var5) {
            this.field1259 = 0;
            return;
        }
        int var6 = arg1 - this.field1249;
        if (this.field1249 - arg1 > var6) {
            var6 = this.field1249 - arg1;
        }
        if (var4 - this.field1253 > var6) {
            var6 = var4 - this.field1253;
        }
        if (this.field1253 - var4 > var6) {
            var6 = this.field1253 - var4;
        }
        if (var5 - this.field1254 > var6) {
            var6 = var5 - this.field1254;
        }
        if (this.field1254 - var5 > var6) {
            var6 = this.field1254 - var5;
        }
        if (arg0 > var6) {
            arg0 = var6;
        }
        this.field1259 = arg0;
        this.field1250 = arg1;
        this.field1260 = arg2;
        this.field1251 = (arg1 - this.field1249) / arg0;
        this.field1261 = (var4 - this.field1253) / arg0;
        this.field1262 = (var5 - this.field1254) / arg0;
    }

    @ObfuscatedName("bz.p(I)V")
    public synchronized void method1321(int arg0) {
        if (arg0 == 0) {
            this.method1282(0);
            this.method3661();
        } else if (this.field1253 == 0 && this.field1254 == 0) {
            this.field1259 = 0;
            this.field1250 = 0;
            this.field1249 = 0;
            this.method3661();
        } else {
            int var2 = -this.field1249;
            if (this.field1249 > var2) {
                var2 = this.field1249;
            }
            if (-this.field1253 > var2) {
                var2 = -this.field1253;
            }
            if (this.field1253 > var2) {
                var2 = this.field1253;
            }
            if (-this.field1254 > var2) {
                var2 = -this.field1254;
            }
            if (this.field1254 > var2) {
                var2 = this.field1254;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field1259 = arg0;
            this.field1250 = Integer.MIN_VALUE;
            this.field1251 = -this.field1249 / arg0;
            this.field1261 = -this.field1253 / arg0;
            this.field1262 = -this.field1254 / arg0;
        }
    }

    @ObfuscatedName("bz.q(I)V")
    public synchronized void method1394(int arg0) {
        if (this.field1255 < 0) {
            this.field1255 = -arg0;
        } else {
            this.field1255 = arg0;
        }
    }

    @ObfuscatedName("bz.ai()I")
    public synchronized int method1293() {
        return this.field1255 < 0 ? -this.field1255 : this.field1255;
    }

    @ObfuscatedName("bz.ab()Z")
    public boolean method1294() {
        return this.field1257 < 0 || this.field1257 >= ((class63) this.field1267).field1232.length << 8;
    }

    @ObfuscatedName("bz.aa()Z")
    public boolean method1376() {
        return this.field1259 != 0;
    }

    @ObfuscatedName("bz.e()Lbe;")
    public class67 method1131() {
        return null;
    }

    @ObfuscatedName("bz.g()Lbe;")
    public class67 method1165() {
        return null;
    }

    @ObfuscatedName("bz.m()I")
    public int method1132() {
        return this.field1250 == 0 && this.field1259 == 0 ? 0 : 1;
    }

    @ObfuscatedName("bz.j([III)V")
    public synchronized void method1134(int[] arg0, int arg1, int arg2) {
        if (this.field1250 == 0 && this.field1259 == 0) {
            this.method1136(arg2);
            return;
        }
        class63 var4 = (class63) this.field1267;
        int var5 = this.field1256 << 8;
        int var6 = this.field1252 << 8;
        int var7 = var4.field1232.length << 8;
        int var8 = var6 - var5;
        if (var8 <= 0) {
            this.field1248 = 0;
        }
        int var9 = arg1;
        int var10 = arg1 + arg2;
        if (this.field1257 < 0) {
            if (this.field1255 <= 0) {
                this.method1288();
                this.method3661();
                return;
            }
            this.field1257 = 0;
        }
        if (this.field1257 >= var7) {
            if (this.field1255 >= 0) {
                this.method1288();
                this.method3661();
                return;
            }
            this.field1257 = var7 - 1;
        }
        if (this.field1248 >= 0) {
            if (this.field1248 > 0) {
                if (this.field1258) {
                    label131: {
                        if (this.field1255 < 0) {
                            var9 = this.method1372(arg0, arg1, var5, var10, var4.field1232[this.field1256]);
                            if (this.field1257 >= var5) {
                                return;
                            }
                            this.field1257 = var5 + var5 - 1 - this.field1257;
                            this.field1255 = -this.field1255;
                            if (--this.field1248 == 0) {
                                break label131;
                            }
                        }
                        do {
                            var9 = this.method1298(arg0, var9, var6, var10, var4.field1232[this.field1252 - 1]);
                            if (this.field1257 < var6) {
                                return;
                            }
                            this.field1257 = var6 + var6 - 1 - this.field1257;
                            this.field1255 = -this.field1255;
                            if (--this.field1248 == 0) {
                                break;
                            }
                            var9 = this.method1372(arg0, var9, var5, var10, var4.field1232[this.field1256]);
                            if (this.field1257 >= var5) {
                                return;
                            }
                            this.field1257 = var5 + var5 - 1 - this.field1257;
                            this.field1255 = -this.field1255;
                        } while (--this.field1248 != 0);
                    }
                } else if (this.field1255 < 0) {
                    while (true) {
                        var9 = this.method1372(arg0, var9, var5, var10, var4.field1232[this.field1252 - 1]);
                        if (this.field1257 >= var5) {
                            return;
                        }
                        int var12 = (var6 - 1 - this.field1257) / var8;
                        if (var12 >= this.field1248) {
                            this.field1257 += this.field1248 * var8;
                            this.field1248 = 0;
                            break;
                        }
                        this.field1257 += var8 * var12;
                        this.field1248 -= var12;
                    }
                } else {
                    while (true) {
                        var9 = this.method1298(arg0, var9, var6, var10, var4.field1232[this.field1256]);
                        if (this.field1257 < var6) {
                            return;
                        }
                        int var13 = (this.field1257 - var5) / var8;
                        if (var13 >= this.field1248) {
                            this.field1257 -= this.field1248 * var8;
                            this.field1248 = 0;
                            break;
                        }
                        this.field1257 -= var8 * var13;
                        this.field1248 -= var13;
                    }
                }
            }
            if (this.field1255 < 0) {
                this.method1372(arg0, var9, 0, var10, 0);
                if (this.field1257 < 0) {
                    this.field1257 = -1;
                    this.method1288();
                    this.method3661();
                }
            } else {
                this.method1298(arg0, var9, var7, var10, 0);
                if (this.field1257 >= var7) {
                    this.field1257 = var7;
                    this.method1288();
                    this.method3661();
                }
            }
        } else if (this.field1258) {
            if (this.field1255 < 0) {
                var9 = this.method1372(arg0, arg1, var5, var10, var4.field1232[this.field1256]);
                if (this.field1257 >= var5) {
                    return;
                }
                this.field1257 = var5 + var5 - 1 - this.field1257;
                this.field1255 = -this.field1255;
            }
            while (true) {
                int var11 = this.method1298(arg0, var9, var6, var10, var4.field1232[this.field1252 - 1]);
                if (this.field1257 < var6) {
                    return;
                }
                this.field1257 = var6 + var6 - 1 - this.field1257;
                this.field1255 = -this.field1255;
                var9 = this.method1372(arg0, var11, var5, var10, var4.field1232[this.field1256]);
                if (this.field1257 >= var5) {
                    return;
                }
                this.field1257 = var5 + var5 - 1 - this.field1257;
                this.field1255 = -this.field1255;
            }
        } else if (this.field1255 < 0) {
            while (true) {
                var9 = this.method1372(arg0, var9, var5, var10, var4.field1232[this.field1252 - 1]);
                if (this.field1257 >= var5) {
                    return;
                }
                this.field1257 = var6 - 1 - (var6 - 1 - this.field1257) % var8;
            }
        } else {
            while (true) {
                var9 = this.method1298(arg0, var9, var6, var10, var4.field1232[this.field1256]);
                if (this.field1257 < var6) {
                    return;
                }
                this.field1257 = (this.field1257 - var5) % var8 + var5;
            }
        }
    }

    @ObfuscatedName("bz.l(I)V")
    public synchronized void method1136(int arg0) {
        if (this.field1259 > 0) {
            if (arg0 >= this.field1259) {
                if (this.field1250 == Integer.MIN_VALUE) {
                    this.field1250 = 0;
                    this.field1254 = 0;
                    this.field1253 = 0;
                    this.field1249 = 0;
                    this.method3661();
                    arg0 = this.field1259;
                }
                this.field1259 = 0;
                this.method1279();
            } else {
                this.field1249 += this.field1251 * arg0;
                this.field1253 += this.field1261 * arg0;
                this.field1254 += this.field1262 * arg0;
                this.field1259 -= arg0;
            }
        }
        class63 var2 = (class63) this.field1267;
        int var3 = this.field1256 << 8;
        int var4 = this.field1252 << 8;
        int var5 = var2.field1232.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field1248 = 0;
        }
        if (this.field1257 < 0) {
            if (this.field1255 <= 0) {
                this.method1288();
                this.method3661();
                return;
            }
            this.field1257 = 0;
        }
        if (this.field1257 >= var5) {
            if (this.field1255 >= 0) {
                this.method1288();
                this.method3661();
                return;
            }
            this.field1257 = var5 - 1;
        }
        this.field1257 += this.field1255 * arg0;
        if (this.field1248 >= 0) {
            if (this.field1248 > 0) {
                if (this.field1258) {
                    label121: {
                        if (this.field1255 < 0) {
                            if (this.field1257 >= var3) {
                                return;
                            }
                            this.field1257 = var3 + var3 - 1 - this.field1257;
                            this.field1255 = -this.field1255;
                            if (--this.field1248 == 0) {
                                break label121;
                            }
                        }
                        do {
                            if (this.field1257 < var4) {
                                return;
                            }
                            this.field1257 = var4 + var4 - 1 - this.field1257;
                            this.field1255 = -this.field1255;
                            if (--this.field1248 == 0) {
                                break;
                            }
                            if (this.field1257 >= var3) {
                                return;
                            }
                            this.field1257 = var3 + var3 - 1 - this.field1257;
                            this.field1255 = -this.field1255;
                        } while (--this.field1248 != 0);
                    }
                } else {
                    label153: {
                        if (this.field1255 < 0) {
                            if (this.field1257 >= var3) {
                                return;
                            }
                            int var7 = (var4 - 1 - this.field1257) / var6;
                            if (var7 >= this.field1248) {
                                this.field1257 += this.field1248 * var6;
                                this.field1248 = 0;
                                break label153;
                            }
                            this.field1257 += var6 * var7;
                            this.field1248 -= var7;
                        } else if (this.field1257 >= var4) {
                            int var8 = (this.field1257 - var3) / var6;
                            if (var8 >= this.field1248) {
                                this.field1257 -= this.field1248 * var6;
                                this.field1248 = 0;
                                break label153;
                            }
                            this.field1257 -= var6 * var8;
                            this.field1248 -= var8;
                        } else {
                            return;
                        }
                        return;
                    }
                }
            }
            if (this.field1255 < 0) {
                if (this.field1257 < 0) {
                    this.field1257 = -1;
                    this.method1288();
                    this.method3661();
                }
            } else if (this.field1257 >= var5) {
                this.field1257 = var5;
                this.method1288();
                this.method3661();
            }
        } else if (this.field1258) {
            if (this.field1255 < 0) {
                if (this.field1257 >= var3) {
                    return;
                }
                this.field1257 = var3 + var3 - 1 - this.field1257;
                this.field1255 = -this.field1255;
            }
            while (this.field1257 >= var4) {
                this.field1257 = var4 + var4 - 1 - this.field1257;
                this.field1255 = -this.field1255;
                if (this.field1257 >= var3) {
                    return;
                }
                this.field1257 = var3 + var3 - 1 - this.field1257;
                this.field1255 = -this.field1255;
            }
        } else if (this.field1255 < 0) {
            if (this.field1257 >= var3) {
                return;
            }
            this.field1257 = var4 - 1 - (var4 - 1 - this.field1257) % var6;
        } else if (this.field1257 >= var4) {
            this.field1257 = (this.field1257 - var3) % var6 + var3;
        } else {
            return;
        }
    }

    @ObfuscatedName("bz.an([IIIII)I")
    public int method1298(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1259 > 0) {
                int var6 = this.field1259 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1259 += arg1;
                if (this.field1255 == 256 && (this.field1257 & 0xFF) == 0) {
                    if (Statics.field1174) {
                        arg1 = method1310(0, ((class63) this.field1267).field1232, arg0, this.field1257, arg1, this.field1253, this.field1254, this.field1261, this.field1262, 0, var6, arg2, this);
                    } else {
                        arg1 = method1297(((class63) this.field1267).field1232, arg0, this.field1257, arg1, this.field1249, this.field1251, 0, var6, arg2, this);
                    }
                } else if (Statics.field1174) {
                    arg1 = method1398(0, 0, ((class63) this.field1267).field1232, arg0, this.field1257, arg1, this.field1253, this.field1254, this.field1261, this.field1262, 0, var6, arg2, this, this.field1255, arg4);
                } else {
                    arg1 = method1286(0, 0, ((class63) this.field1267).field1232, arg0, this.field1257, arg1, this.field1249, this.field1251, 0, var6, arg2, this, this.field1255, arg4);
                }
                this.field1259 -= arg1;
                if (this.field1259 != 0) {
                    return arg1;
                }
                if (!this.method1300()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1255 == 256 && (this.field1257 & 0xFF) == 0) {
                if (Statics.field1174) {
                    return method1409(0, ((class63) this.field1267).field1232, arg0, this.field1257, arg1, this.field1253, this.field1254, 0, arg3, arg2, this);
                }
                return method1301(((class63) this.field1267).field1232, arg0, this.field1257, arg1, this.field1249, 0, arg3, arg2, this);
            }
            if (Statics.field1174) {
                return method1306(0, 0, ((class63) this.field1267).field1232, arg0, this.field1257, arg1, this.field1253, this.field1254, 0, arg3, arg2, this, this.field1255, arg4);
            }
            return method1305(0, 0, ((class63) this.field1267).field1232, arg0, this.field1257, arg1, this.field1249, 0, arg3, arg2, this, this.field1255, arg4);
        }
    }

    @ObfuscatedName("bz.av([IIIII)I")
    public int method1372(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1259 > 0) {
                int var6 = this.field1259 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1259 += arg1;
                if (this.field1255 == -256 && (this.field1257 & 0xFF) == 0) {
                    if (Statics.field1174) {
                        arg1 = method1312(0, ((class63) this.field1267).field1232, arg0, this.field1257, arg1, this.field1253, this.field1254, this.field1261, this.field1262, 0, var6, arg2, this);
                    } else {
                        arg1 = method1285(((class63) this.field1267).field1232, arg0, this.field1257, arg1, this.field1249, this.field1251, 0, var6, arg2, this);
                    }
                } else if (Statics.field1174) {
                    arg1 = method1316(0, 0, ((class63) this.field1267).field1232, arg0, this.field1257, arg1, this.field1253, this.field1254, this.field1261, this.field1262, 0, var6, arg2, this, this.field1255, arg4);
                } else {
                    arg1 = method1315(0, 0, ((class63) this.field1267).field1232, arg0, this.field1257, arg1, this.field1249, this.field1251, 0, var6, arg2, this, this.field1255, arg4);
                }
                this.field1259 -= arg1;
                if (this.field1259 != 0) {
                    return arg1;
                }
                if (!this.method1300()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1255 == -256 && (this.field1257 & 0xFF) == 0) {
                if (Statics.field1174) {
                    return method1304(0, ((class63) this.field1267).field1232, arg0, this.field1257, arg1, this.field1253, this.field1254, 0, arg3, arg2, this);
                }
                return method1303(((class63) this.field1267).field1232, arg0, this.field1257, arg1, this.field1249, 0, arg3, arg2, this);
            }
            if (Statics.field1174) {
                return method1308(0, 0, ((class63) this.field1267).field1232, arg0, this.field1257, arg1, this.field1253, this.field1254, 0, arg3, arg2, this, this.field1255, arg4);
            }
            return method1411(0, 0, ((class63) this.field1267).field1232, arg0, this.field1257, arg1, this.field1249, 0, arg3, arg2, this, this.field1255, arg4);
        }
    }

    @ObfuscatedName("bz.aj()Z")
    public boolean method1300() {
        int var1 = this.field1250;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method1335(var1, this.field1260);
            var2 = method1276(var1, this.field1260);
        }
        if (this.field1249 != var1 || this.field1253 != var3 || this.field1254 != var2) {
            if (this.field1249 < var1) {
                this.field1251 = 1;
                this.field1259 = var1 - this.field1249;
            } else if (this.field1249 > var1) {
                this.field1251 = -1;
                this.field1259 = this.field1249 - var1;
            } else {
                this.field1251 = 0;
            }
            if (this.field1253 < var3) {
                this.field1261 = 1;
                if (this.field1259 == 0 || this.field1259 > var3 - this.field1253) {
                    this.field1259 = var3 - this.field1253;
                }
            } else if (this.field1253 > var3) {
                this.field1261 = -1;
                if (this.field1259 == 0 || this.field1259 > this.field1253 - var3) {
                    this.field1259 = this.field1253 - var3;
                }
            } else {
                this.field1261 = 0;
            }
            if (this.field1254 < var2) {
                this.field1262 = 1;
                if (this.field1259 == 0 || this.field1259 > var2 - this.field1254) {
                    this.field1259 = var2 - this.field1254;
                }
            } else if (this.field1254 > var2) {
                this.field1262 = -1;
                if (this.field1259 == 0 || this.field1259 > this.field1254 - var2) {
                    this.field1259 = this.field1254 - var2;
                }
            } else {
                this.field1262 = 0;
            }
            return false;
        } else if (this.field1250 == Integer.MIN_VALUE) {
            this.field1250 = 0;
            this.field1254 = 0;
            this.field1253 = 0;
            this.field1249 = 0;
            this.method3661();
            return true;
        } else {
            this.method1279();
            return false;
        }
    }

    @ObfuscatedName("bz.ap([B[IIIIIIILbz;)I")
    public static int method1301(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class65 arg8) {
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
        arg8.field1257 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("bz.aq(I[B[IIIIIIIILbz;)I")
    public static int method1409(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class65 arg10) {
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
        arg10.field1257 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("bz.af([B[IIIIIIILbz;)I")
    public static int method1303(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class65 arg8) {
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
        arg8.field1257 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("bz.ay(I[B[IIIIIIIILbz;)I")
    public static int method1304(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class65 arg10) {
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
        arg10.field1257 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("bz.au(II[B[IIIIIIILbz;II)I")
    public static int method1305(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class65 arg10, int arg11, int arg12) {
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
        arg10.field1257 = arg4;
        return arg5;
    }

    @ObfuscatedName("bz.az(II[B[IIIIIIIILbz;II)I")
    public static int method1306(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class65 arg11, int arg12, int arg13) {
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
        arg11.field1257 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("bz.ae(II[B[IIIIIIILbz;II)I")
    public static int method1411(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class65 arg10, int arg11, int arg12) {
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
        arg10.field1257 = arg4;
        return arg5;
    }

    @ObfuscatedName("bz.bd(II[B[IIIIIIIILbz;II)I")
    public static int method1308(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class65 arg11, int arg12, int arg13) {
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
        arg11.field1257 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("bz.br([B[IIIIIIIILbz;)I")
    public static int method1297(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class65 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field1253 += (var14 - arg3) * arg9.field1261;
        arg9.field1254 += (var14 - arg3) * arg9.field1262;
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
        arg9.field1249 = var12 >> 2;
        arg9.field1257 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("bz.bt(I[B[IIIIIIIIIILbz;)I")
    public static int method1310(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class65 arg12) {
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
        arg12.field1249 += (var19 - arg4) * arg12.field1251;
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
        arg12.field1253 = var15 >> 2;
        arg12.field1254 = var16 >> 2;
        arg12.field1257 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("bz.bp([B[IIIIIIIILbz;)I")
    public static int method1285(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class65 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field1253 += (var14 - arg3) * arg9.field1261;
        arg9.field1254 += (var14 - arg3) * arg9.field1262;
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
        arg9.field1249 = var12 >> 2;
        arg9.field1257 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("bz.bq(I[B[IIIIIIIIIILbz;)I")
    public static int method1312(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class65 arg12) {
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
        arg12.field1249 += (var19 - arg4) * arg12.field1251;
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
        arg12.field1253 = var15 >> 2;
        arg12.field1254 = var16 >> 2;
        arg12.field1257 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("bz.bv(II[B[IIIIIIIILbz;II)I")
    public static int method1286(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class65 arg11, int arg12, int arg13) {
        arg11.field1253 -= arg11.field1261 * arg5;
        arg11.field1254 -= arg11.field1262 * arg5;
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
        arg11.field1253 += arg11.field1261 * arg5;
        arg11.field1254 += arg11.field1262 * arg5;
        arg11.field1249 = arg6;
        arg11.field1257 = arg4;
        return arg5;
    }

    @ObfuscatedName("bz.by(II[B[IIIIIIIIIILbz;II)I")
    public static int method1398(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class65 arg13, int arg14, int arg15) {
        arg13.field1249 -= arg13.field1251 * arg5;
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
        arg13.field1249 += arg13.field1251 * var27;
        arg13.field1253 = arg6;
        arg13.field1254 = arg7;
        arg13.field1257 = arg4;
        return var27;
    }

    @ObfuscatedName("bz.bu(II[B[IIIIIIIILbz;II)I")
    public static int method1315(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class65 arg11, int arg12, int arg13) {
        arg11.field1253 -= arg11.field1261 * arg5;
        arg11.field1254 -= arg11.field1262 * arg5;
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
        arg11.field1253 += arg11.field1261 * arg5;
        arg11.field1254 += arg11.field1262 * arg5;
        arg11.field1249 = arg6;
        arg11.field1257 = arg4;
        return arg5;
    }

    @ObfuscatedName("bz.bo(II[B[IIIIIIIIIILbz;II)I")
    public static int method1316(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class65 arg13, int arg14, int arg15) {
        arg13.field1249 -= arg13.field1251 * arg5;
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
        arg13.field1249 += arg13.field1251 * var26;
        arg13.field1253 = arg6;
        arg13.field1254 = arg7;
        arg13.field1257 = arg4;
        return var26;
    }
}
