package deob;

@ObfuscatedName("bw")
public class class65 extends class67 {

    @ObfuscatedName("bw.d")
    public int field1253;

    @ObfuscatedName("bw.p")
    public int field1250;

    @ObfuscatedName("bw.v")
    public int field1257;

    @ObfuscatedName("bw.l")
    public int field1252;

    @ObfuscatedName("bw.y")
    public int field1256;

    @ObfuscatedName("bw.u")
    public int field1254;

    @ObfuscatedName("bw.a")
    public int field1255;

    @ObfuscatedName("bw.e")
    public int field1262;

    @ObfuscatedName("bw.b")
    public int field1258;

    @ObfuscatedName("bw.o")
    public int field1249;

    @ObfuscatedName("bw.m")
    public boolean field1251;

    @ObfuscatedName("bw.x")
    public int field1259;

    @ObfuscatedName("bw.k")
    public int field1261;

    @ObfuscatedName("bw.n")
    public int field1260;

    @ObfuscatedName("bw.j")
    public int field1263;

    @ObfuscatedName("bw.d(II)I")
    public static int method1349(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("bw.p(II)I")
    public static int method1254(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("bw.af()I")
    public int method1322() {
        int var1 = this.field1256 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field1262 == 0) {
            var2 -= this.field1253 * var2 / (((class63) this.field1265).field1236.length << 8);
        } else if (this.field1262 >= 0) {
            var2 -= this.field1258 * var2 / ((class63) this.field1265).field1236.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    public class65(class63 arg0, int arg1, int arg2) {
        this.field1265 = arg0;
        this.field1258 = arg0.field1234;
        this.field1249 = arg0.field1233;
        this.field1251 = arg0.field1232;
        this.field1250 = arg1;
        this.field1257 = arg2;
        this.field1252 = 8192;
        this.field1253 = 0;
        this.method1258();
    }

    public class65(class63 arg0, int arg1, int arg2, int arg3) {
        this.field1265 = arg0;
        this.field1258 = arg0.field1234;
        this.field1249 = arg0.field1233;
        this.field1251 = arg0.field1232;
        this.field1250 = arg1;
        this.field1257 = arg2;
        this.field1252 = arg3;
        this.field1253 = 0;
        this.method1258();
    }

    @ObfuscatedName("bw.v(Lbh;II)Lbw;")
    public static class65 method1327(class63 arg0, int arg1, int arg2) {
        return arg0.field1236 == null || arg0.field1236.length == 0 ? null : new class65(arg0, (int) ((long) arg0.field1235 * 256L * (long) arg1 / (long) (Statics.field1177 * 100)), arg2 << 6);
    }

    @ObfuscatedName("bw.l(Lbh;III)Lbw;")
    public static class65 method1255(class63 arg0, int arg1, int arg2, int arg3) {
        return arg0.field1236 == null || arg0.field1236.length == 0 ? null : new class65(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("bw.y()V")
    public void method1258() {
        this.field1256 = this.field1257;
        this.field1254 = method1349(this.field1257, this.field1252);
        this.field1255 = method1254(this.field1257, this.field1252);
    }

    @ObfuscatedName("bw.b(I)V")
    public synchronized void method1259(int arg0) {
        this.field1262 = arg0;
    }

    @ObfuscatedName("bw.m(I)V")
    public synchronized void method1260(int arg0) {
        this.method1262(arg0 << 6, this.method1264());
    }

    @ObfuscatedName("bw.x(I)V")
    public synchronized void method1261(int arg0) {
        this.method1262(arg0, this.method1264());
    }

    @ObfuscatedName("bw.k(II)V")
    public synchronized void method1262(int arg0, int arg1) {
        this.field1257 = arg0;
        this.field1252 = arg1;
        this.field1259 = 0;
        this.method1258();
    }

    @ObfuscatedName("bw.n()I")
    public synchronized int method1301() {
        return this.field1257 == Integer.MIN_VALUE ? 0 : this.field1257;
    }

    @ObfuscatedName("bw.j()I")
    public synchronized int method1264() {
        return this.field1252 < 0 ? -1 : this.field1252;
    }

    @ObfuscatedName("bw.t(I)V")
    public synchronized void method1265(int arg0) {
        int var2 = ((class63) this.field1265).field1236.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field1253 = arg0;
    }

    @ObfuscatedName("bw.z(Z)V")
    public synchronized void method1266(boolean arg0) {
        this.field1250 = (this.field1250 >>> 31) + (this.field1250 ^ this.field1250 >> 31);
        if (arg0) {
            this.field1250 = -this.field1250;
        }
    }

    @ObfuscatedName("bw.h()V")
    public void method1307() {
        if (this.field1259 == 0) {
            return;
        }
        if (this.field1257 == Integer.MIN_VALUE) {
            this.field1257 = 0;
        }
        this.field1259 = 0;
        this.method1258();
    }

    @ObfuscatedName("bw.i(II)V")
    public synchronized void method1268(int arg0, int arg1) {
        this.method1296(arg0, arg1, this.method1264());
    }

    @ObfuscatedName("bw.q(III)V")
    public synchronized void method1296(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method1262(arg1, arg2);
            return;
        }
        int var4 = method1349(arg1, arg2);
        int var5 = method1254(arg1, arg2);
        if (this.field1254 == var4 && this.field1255 == var5) {
            this.field1259 = 0;
            return;
        }
        int var6 = arg1 - this.field1256;
        if (this.field1256 - arg1 > var6) {
            var6 = this.field1256 - arg1;
        }
        if (var4 - this.field1254 > var6) {
            var6 = var4 - this.field1254;
        }
        if (this.field1254 - var4 > var6) {
            var6 = this.field1254 - var4;
        }
        if (var5 - this.field1255 > var6) {
            var6 = var5 - this.field1255;
        }
        if (this.field1255 - var5 > var6) {
            var6 = this.field1255 - var5;
        }
        if (arg0 > var6) {
            arg0 = var6;
        }
        this.field1259 = arg0;
        this.field1257 = arg1;
        this.field1252 = arg2;
        this.field1261 = (arg1 - this.field1256) / arg0;
        this.field1260 = (var4 - this.field1254) / arg0;
        this.field1263 = (var5 - this.field1255) / arg0;
    }

    @ObfuscatedName("bw.r(I)V")
    public synchronized void method1270(int arg0) {
        if (arg0 == 0) {
            this.method1261(0);
            this.method3715();
        } else if (this.field1254 == 0 && this.field1255 == 0) {
            this.field1259 = 0;
            this.field1257 = 0;
            this.field1256 = 0;
            this.method3715();
        } else {
            int var2 = -this.field1256;
            if (this.field1256 > var2) {
                var2 = this.field1256;
            }
            if (-this.field1254 > var2) {
                var2 = -this.field1254;
            }
            if (this.field1254 > var2) {
                var2 = this.field1254;
            }
            if (-this.field1255 > var2) {
                var2 = -this.field1255;
            }
            if (this.field1255 > var2) {
                var2 = this.field1255;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field1259 = arg0;
            this.field1257 = Integer.MIN_VALUE;
            this.field1261 = -this.field1256 / arg0;
            this.field1260 = -this.field1254 / arg0;
            this.field1263 = -this.field1255 / arg0;
        }
    }

    @ObfuscatedName("bw.s(I)V")
    public synchronized void method1271(int arg0) {
        if (this.field1250 < 0) {
            this.field1250 = -arg0;
        } else {
            this.field1250 = arg0;
        }
    }

    @ObfuscatedName("bw.g()I")
    public synchronized int method1276() {
        return this.field1250 < 0 ? -this.field1250 : this.field1250;
    }

    @ObfuscatedName("bw.az()Z")
    public boolean method1273() {
        return this.field1253 < 0 || this.field1253 >= ((class63) this.field1265).field1236.length << 8;
    }

    @ObfuscatedName("bw.ad()Z")
    public boolean method1274() {
        return this.field1259 != 0;
    }

    @ObfuscatedName("bw.w()Lbz;")
    public class67 method1120() {
        return null;
    }

    @ObfuscatedName("bw.u()Lbz;")
    public class67 method1121() {
        return null;
    }

    @ObfuscatedName("bw.a()I")
    public int method1122() {
        return this.field1257 == 0 && this.field1259 == 0 ? 0 : 1;
    }

    @ObfuscatedName("bw.e([III)V")
    public synchronized void method1123(int[] arg0, int arg1, int arg2) {
        if (this.field1257 == 0 && this.field1259 == 0) {
            this.method1125(arg2);
            return;
        }
        class63 var4 = (class63) this.field1265;
        int var5 = this.field1258 << 8;
        int var6 = this.field1249 << 8;
        int var7 = var4.field1236.length << 8;
        int var8 = var6 - var5;
        if (var8 <= 0) {
            this.field1262 = 0;
        }
        int var9 = arg1;
        int var10 = arg1 + arg2;
        if (this.field1253 < 0) {
            if (this.field1250 <= 0) {
                this.method1307();
                this.method3715();
                return;
            }
            this.field1253 = 0;
        }
        if (this.field1253 >= var7) {
            if (this.field1250 >= 0) {
                this.method1307();
                this.method3715();
                return;
            }
            this.field1253 = var7 - 1;
        }
        if (this.field1262 >= 0) {
            if (this.field1262 > 0) {
                if (this.field1251) {
                    label131: {
                        if (this.field1250 < 0) {
                            var9 = this.method1278(arg0, arg1, var5, var10, var4.field1236[this.field1258]);
                            if (this.field1253 >= var5) {
                                return;
                            }
                            this.field1253 = var5 + var5 - 1 - this.field1253;
                            this.field1250 = -this.field1250;
                            if (--this.field1262 == 0) {
                                break label131;
                            }
                        }
                        do {
                            var9 = this.method1277(arg0, var9, var6, var10, var4.field1236[this.field1249 - 1]);
                            if (this.field1253 < var6) {
                                return;
                            }
                            this.field1253 = var6 + var6 - 1 - this.field1253;
                            this.field1250 = -this.field1250;
                            if (--this.field1262 == 0) {
                                break;
                            }
                            var9 = this.method1278(arg0, var9, var5, var10, var4.field1236[this.field1258]);
                            if (this.field1253 >= var5) {
                                return;
                            }
                            this.field1253 = var5 + var5 - 1 - this.field1253;
                            this.field1250 = -this.field1250;
                        } while (--this.field1262 != 0);
                    }
                } else if (this.field1250 < 0) {
                    while (true) {
                        var9 = this.method1278(arg0, var9, var5, var10, var4.field1236[this.field1249 - 1]);
                        if (this.field1253 >= var5) {
                            return;
                        }
                        int var12 = (var6 - 1 - this.field1253) / var8;
                        if (var12 >= this.field1262) {
                            this.field1253 += this.field1262 * var8;
                            this.field1262 = 0;
                            break;
                        }
                        this.field1253 += var8 * var12;
                        this.field1262 -= var12;
                    }
                } else {
                    while (true) {
                        var9 = this.method1277(arg0, var9, var6, var10, var4.field1236[this.field1258]);
                        if (this.field1253 < var6) {
                            return;
                        }
                        int var13 = (this.field1253 - var5) / var8;
                        if (var13 >= this.field1262) {
                            this.field1253 -= this.field1262 * var8;
                            this.field1262 = 0;
                            break;
                        }
                        this.field1253 -= var8 * var13;
                        this.field1262 -= var13;
                    }
                }
            }
            if (this.field1250 < 0) {
                this.method1278(arg0, var9, 0, var10, 0);
                if (this.field1253 < 0) {
                    this.field1253 = -1;
                    this.method1307();
                    this.method3715();
                }
            } else {
                this.method1277(arg0, var9, var7, var10, 0);
                if (this.field1253 >= var7) {
                    this.field1253 = var7;
                    this.method1307();
                    this.method3715();
                }
            }
        } else if (this.field1251) {
            if (this.field1250 < 0) {
                var9 = this.method1278(arg0, arg1, var5, var10, var4.field1236[this.field1258]);
                if (this.field1253 >= var5) {
                    return;
                }
                this.field1253 = var5 + var5 - 1 - this.field1253;
                this.field1250 = -this.field1250;
            }
            while (true) {
                int var11 = this.method1277(arg0, var9, var6, var10, var4.field1236[this.field1249 - 1]);
                if (this.field1253 < var6) {
                    return;
                }
                this.field1253 = var6 + var6 - 1 - this.field1253;
                this.field1250 = -this.field1250;
                var9 = this.method1278(arg0, var11, var5, var10, var4.field1236[this.field1258]);
                if (this.field1253 >= var5) {
                    return;
                }
                this.field1253 = var5 + var5 - 1 - this.field1253;
                this.field1250 = -this.field1250;
            }
        } else if (this.field1250 < 0) {
            while (true) {
                var9 = this.method1278(arg0, var9, var5, var10, var4.field1236[this.field1249 - 1]);
                if (this.field1253 >= var5) {
                    return;
                }
                this.field1253 = var6 - 1 - (var6 - 1 - this.field1253) % var8;
            }
        } else {
            while (true) {
                var9 = this.method1277(arg0, var9, var6, var10, var4.field1236[this.field1258]);
                if (this.field1253 < var6) {
                    return;
                }
                this.field1253 = (this.field1253 - var5) % var8 + var5;
            }
        }
    }

    @ObfuscatedName("bw.o(I)V")
    public synchronized void method1125(int arg0) {
        if (this.field1259 > 0) {
            if (arg0 >= this.field1259) {
                if (this.field1257 == Integer.MIN_VALUE) {
                    this.field1257 = 0;
                    this.field1255 = 0;
                    this.field1254 = 0;
                    this.field1256 = 0;
                    this.method3715();
                    arg0 = this.field1259;
                }
                this.field1259 = 0;
                this.method1258();
            } else {
                this.field1256 += this.field1261 * arg0;
                this.field1254 += this.field1260 * arg0;
                this.field1255 += this.field1263 * arg0;
                this.field1259 -= arg0;
            }
        }
        class63 var2 = (class63) this.field1265;
        int var3 = this.field1258 << 8;
        int var4 = this.field1249 << 8;
        int var5 = var2.field1236.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field1262 = 0;
        }
        if (this.field1253 < 0) {
            if (this.field1250 <= 0) {
                this.method1307();
                this.method3715();
                return;
            }
            this.field1253 = 0;
        }
        if (this.field1253 >= var5) {
            if (this.field1250 >= 0) {
                this.method1307();
                this.method3715();
                return;
            }
            this.field1253 = var5 - 1;
        }
        this.field1253 += this.field1250 * arg0;
        if (this.field1262 >= 0) {
            if (this.field1262 > 0) {
                if (this.field1251) {
                    label121: {
                        if (this.field1250 < 0) {
                            if (this.field1253 >= var3) {
                                return;
                            }
                            this.field1253 = var3 + var3 - 1 - this.field1253;
                            this.field1250 = -this.field1250;
                            if (--this.field1262 == 0) {
                                break label121;
                            }
                        }
                        do {
                            if (this.field1253 < var4) {
                                return;
                            }
                            this.field1253 = var4 + var4 - 1 - this.field1253;
                            this.field1250 = -this.field1250;
                            if (--this.field1262 == 0) {
                                break;
                            }
                            if (this.field1253 >= var3) {
                                return;
                            }
                            this.field1253 = var3 + var3 - 1 - this.field1253;
                            this.field1250 = -this.field1250;
                        } while (--this.field1262 != 0);
                    }
                } else {
                    label153: {
                        if (this.field1250 < 0) {
                            if (this.field1253 >= var3) {
                                return;
                            }
                            int var7 = (var4 - 1 - this.field1253) / var6;
                            if (var7 >= this.field1262) {
                                this.field1253 += this.field1262 * var6;
                                this.field1262 = 0;
                                break label153;
                            }
                            this.field1253 += var6 * var7;
                            this.field1262 -= var7;
                        } else if (this.field1253 >= var4) {
                            int var8 = (this.field1253 - var3) / var6;
                            if (var8 >= this.field1262) {
                                this.field1253 -= this.field1262 * var6;
                                this.field1262 = 0;
                                break label153;
                            }
                            this.field1253 -= var6 * var8;
                            this.field1262 -= var8;
                        } else {
                            return;
                        }
                        return;
                    }
                }
            }
            if (this.field1250 < 0) {
                if (this.field1253 < 0) {
                    this.field1253 = -1;
                    this.method1307();
                    this.method3715();
                }
            } else if (this.field1253 >= var5) {
                this.field1253 = var5;
                this.method1307();
                this.method3715();
            }
        } else if (this.field1251) {
            if (this.field1250 < 0) {
                if (this.field1253 >= var3) {
                    return;
                }
                this.field1253 = var3 + var3 - 1 - this.field1253;
                this.field1250 = -this.field1250;
            }
            while (this.field1253 >= var4) {
                this.field1253 = var4 + var4 - 1 - this.field1253;
                this.field1250 = -this.field1250;
                if (this.field1253 >= var3) {
                    return;
                }
                this.field1253 = var3 + var3 - 1 - this.field1253;
                this.field1250 = -this.field1250;
            }
        } else if (this.field1250 < 0) {
            if (this.field1253 >= var3) {
                return;
            }
            this.field1253 = var4 - 1 - (var4 - 1 - this.field1253) % var6;
        } else if (this.field1253 >= var4) {
            this.field1253 = (this.field1253 - var3) % var6 + var3;
        } else {
            return;
        }
    }

    @ObfuscatedName("bw.aw([IIIII)I")
    public int method1277(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1259 > 0) {
                int var6 = this.field1259 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1259 += arg1;
                if (this.field1250 == 256 && (this.field1253 & 0xFF) == 0) {
                    if (Statics.field1186) {
                        arg1 = method1289(0, ((class63) this.field1265).field1236, arg0, this.field1253, arg1, this.field1254, this.field1255, this.field1260, this.field1263, 0, var6, arg2, this);
                    } else {
                        arg1 = method1288(((class63) this.field1265).field1236, arg0, this.field1253, arg1, this.field1256, this.field1261, 0, var6, arg2, this);
                    }
                } else if (Statics.field1186) {
                    arg1 = method1293(0, 0, ((class63) this.field1265).field1236, arg0, this.field1253, arg1, this.field1254, this.field1255, this.field1260, this.field1263, 0, var6, arg2, this, this.field1250, arg4);
                } else {
                    arg1 = method1292(0, 0, ((class63) this.field1265).field1236, arg0, this.field1253, arg1, this.field1256, this.field1261, 0, var6, arg2, this, this.field1250, arg4);
                }
                this.field1259 -= arg1;
                if (this.field1259 != 0) {
                    return arg1;
                }
                if (!this.method1279()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1250 == 256 && (this.field1253 & 0xFF) == 0) {
                if (Statics.field1186) {
                    return method1257(0, ((class63) this.field1265).field1236, arg0, this.field1253, arg1, this.field1254, this.field1255, 0, arg3, arg2, this);
                }
                return method1280(((class63) this.field1265).field1236, arg0, this.field1253, arg1, this.field1256, 0, arg3, arg2, this);
            }
            if (Statics.field1186) {
                return method1300(0, 0, ((class63) this.field1265).field1236, arg0, this.field1253, arg1, this.field1254, this.field1255, 0, arg3, arg2, this, this.field1250, arg4);
            }
            return method1284(0, 0, ((class63) this.field1265).field1236, arg0, this.field1253, arg1, this.field1256, 0, arg3, arg2, this, this.field1250, arg4);
        }
    }

    @ObfuscatedName("bw.as([IIIII)I")
    public int method1278(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1259 > 0) {
                int var6 = this.field1259 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1259 += arg1;
                if (this.field1250 == -256 && (this.field1253 & 0xFF) == 0) {
                    if (Statics.field1186) {
                        arg1 = method1311(0, ((class63) this.field1265).field1236, arg0, this.field1253, arg1, this.field1254, this.field1255, this.field1260, this.field1263, 0, var6, arg2, this);
                    } else {
                        arg1 = method1290(((class63) this.field1265).field1236, arg0, this.field1253, arg1, this.field1256, this.field1261, 0, var6, arg2, this);
                    }
                } else if (Statics.field1186) {
                    arg1 = method1295(0, 0, ((class63) this.field1265).field1236, arg0, this.field1253, arg1, this.field1254, this.field1255, this.field1260, this.field1263, 0, var6, arg2, this, this.field1250, arg4);
                } else {
                    arg1 = method1294(0, 0, ((class63) this.field1265).field1236, arg0, this.field1253, arg1, this.field1256, this.field1261, 0, var6, arg2, this, this.field1250, arg4);
                }
                this.field1259 -= arg1;
                if (this.field1259 != 0) {
                    return arg1;
                }
                if (!this.method1279()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1250 == -256 && (this.field1253 & 0xFF) == 0) {
                if (Statics.field1186) {
                    return method1385(0, ((class63) this.field1265).field1236, arg0, this.field1253, arg1, this.field1254, this.field1255, 0, arg3, arg2, this);
                }
                return method1354(((class63) this.field1265).field1236, arg0, this.field1253, arg1, this.field1256, 0, arg3, arg2, this);
            }
            if (Statics.field1186) {
                return method1380(0, 0, ((class63) this.field1265).field1236, arg0, this.field1253, arg1, this.field1254, this.field1255, 0, arg3, arg2, this, this.field1250, arg4);
            }
            return method1299(0, 0, ((class63) this.field1265).field1236, arg0, this.field1253, arg1, this.field1256, 0, arg3, arg2, this, this.field1250, arg4);
        }
    }

    @ObfuscatedName("bw.ar()Z")
    public boolean method1279() {
        int var1 = this.field1257;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method1349(var1, this.field1252);
            var2 = method1254(var1, this.field1252);
        }
        if (this.field1256 != var1 || this.field1254 != var3 || this.field1255 != var2) {
            if (this.field1256 < var1) {
                this.field1261 = 1;
                this.field1259 = var1 - this.field1256;
            } else if (this.field1256 > var1) {
                this.field1261 = -1;
                this.field1259 = this.field1256 - var1;
            } else {
                this.field1261 = 0;
            }
            if (this.field1254 < var3) {
                this.field1260 = 1;
                if (this.field1259 == 0 || this.field1259 > var3 - this.field1254) {
                    this.field1259 = var3 - this.field1254;
                }
            } else if (this.field1254 > var3) {
                this.field1260 = -1;
                if (this.field1259 == 0 || this.field1259 > this.field1254 - var3) {
                    this.field1259 = this.field1254 - var3;
                }
            } else {
                this.field1260 = 0;
            }
            if (this.field1255 < var2) {
                this.field1263 = 1;
                if (this.field1259 == 0 || this.field1259 > var2 - this.field1255) {
                    this.field1259 = var2 - this.field1255;
                }
            } else if (this.field1255 > var2) {
                this.field1263 = -1;
                if (this.field1259 == 0 || this.field1259 > this.field1255 - var2) {
                    this.field1259 = this.field1255 - var2;
                }
            } else {
                this.field1263 = 0;
            }
            return false;
        } else if (this.field1257 == Integer.MIN_VALUE) {
            this.field1257 = 0;
            this.field1255 = 0;
            this.field1254 = 0;
            this.field1256 = 0;
            this.method3715();
            return true;
        } else {
            this.method1258();
            return false;
        }
    }

    @ObfuscatedName("bw.ac([B[IIIIIIILbw;)I")
    public static int method1280(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class65 arg8) {
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
        arg8.field1253 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("bw.aq(I[B[IIIIIIIILbw;)I")
    public static int method1257(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class65 arg10) {
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
        arg10.field1253 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("bw.aa([B[IIIIIIILbw;)I")
    public static int method1354(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class65 arg8) {
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
        arg8.field1253 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("bw.ab(I[B[IIIIIIIILbw;)I")
    public static int method1385(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class65 arg10) {
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
        arg10.field1253 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("bw.av(II[B[IIIIIIILbw;II)I")
    public static int method1284(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class65 arg10, int arg11, int arg12) {
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
        arg10.field1253 = arg4;
        return arg5;
    }

    @ObfuscatedName("bw.au(II[B[IIIIIIIILbw;II)I")
    public static int method1300(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class65 arg11, int arg12, int arg13) {
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
        arg11.field1253 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("bw.ay(II[B[IIIIIIILbw;II)I")
    public static int method1299(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class65 arg10, int arg11, int arg12) {
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
        arg10.field1253 = arg4;
        return arg5;
    }

    @ObfuscatedName("bw.ag(II[B[IIIIIIIILbw;II)I")
    public static int method1380(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class65 arg11, int arg12, int arg13) {
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
        arg11.field1253 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("bw.an([B[IIIIIIIILbw;)I")
    public static int method1288(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class65 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field1254 += (var14 - arg3) * arg9.field1260;
        arg9.field1255 += (var14 - arg3) * arg9.field1263;
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
        arg9.field1256 = var12 >> 2;
        arg9.field1253 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("bw.am(I[B[IIIIIIIIIILbw;)I")
    public static int method1289(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class65 arg12) {
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
        arg12.field1256 += (var19 - arg4) * arg12.field1261;
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
        arg12.field1254 = var15 >> 2;
        arg12.field1255 = var16 >> 2;
        arg12.field1253 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("bw.at([B[IIIIIIIILbw;)I")
    public static int method1290(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class65 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field1254 += (var14 - arg3) * arg9.field1260;
        arg9.field1255 += (var14 - arg3) * arg9.field1263;
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
        arg9.field1256 = var12 >> 2;
        arg9.field1253 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("bw.bi(I[B[IIIIIIIIIILbw;)I")
    public static int method1311(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class65 arg12) {
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
        arg12.field1256 += (var19 - arg4) * arg12.field1261;
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
        arg12.field1254 = var15 >> 2;
        arg12.field1255 = var16 >> 2;
        arg12.field1253 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("bw.bl(II[B[IIIIIIIILbw;II)I")
    public static int method1292(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class65 arg11, int arg12, int arg13) {
        arg11.field1254 -= arg11.field1260 * arg5;
        arg11.field1255 -= arg11.field1263 * arg5;
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
        arg11.field1254 += arg11.field1260 * arg5;
        arg11.field1255 += arg11.field1263 * arg5;
        arg11.field1256 = arg6;
        arg11.field1253 = arg4;
        return arg5;
    }

    @ObfuscatedName("bw.ba(II[B[IIIIIIIIIILbw;II)I")
    public static int method1293(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class65 arg13, int arg14, int arg15) {
        arg13.field1256 -= arg13.field1261 * arg5;
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
        arg13.field1256 += arg13.field1261 * var27;
        arg13.field1254 = arg6;
        arg13.field1255 = arg7;
        arg13.field1253 = arg4;
        return var27;
    }

    @ObfuscatedName("bw.bk(II[B[IIIIIIIILbw;II)I")
    public static int method1294(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class65 arg11, int arg12, int arg13) {
        arg11.field1254 -= arg11.field1260 * arg5;
        arg11.field1255 -= arg11.field1263 * arg5;
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
        arg11.field1254 += arg11.field1260 * arg5;
        arg11.field1255 += arg11.field1263 * arg5;
        arg11.field1256 = arg6;
        arg11.field1253 = arg4;
        return arg5;
    }

    @ObfuscatedName("bw.bd(II[B[IIIIIIIIIILbw;II)I")
    public static int method1295(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class65 arg13, int arg14, int arg15) {
        arg13.field1256 -= arg13.field1261 * arg5;
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
        arg13.field1256 += arg13.field1261 * var26;
        arg13.field1254 = arg6;
        arg13.field1255 = arg7;
        arg13.field1253 = arg4;
        return var26;
    }
}
