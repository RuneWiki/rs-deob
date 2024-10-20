package deob;

@ObfuscatedName("bo")
public class class65 extends class67 {

    @ObfuscatedName("bo.k")
    public int field1227;

    @ObfuscatedName("bo.h")
    public int field1234;

    @ObfuscatedName("bo.o")
    public int field1238;

    @ObfuscatedName("bo.z")
    public int field1228;

    @ObfuscatedName("bo.c")
    public int field1229;

    @ObfuscatedName("bo.d")
    public int field1230;

    @ObfuscatedName("bo.l")
    public int field1231;

    @ObfuscatedName("bo.b")
    public int field1232;

    @ObfuscatedName("bo.j")
    public int field1233;

    @ObfuscatedName("bo.f")
    public int field1225;

    @ObfuscatedName("bo.i")
    public boolean field1237;

    @ObfuscatedName("bo.g")
    public int field1236;

    @ObfuscatedName("bo.t")
    public int field1226;

    @ObfuscatedName("bo.e")
    public int field1235;

    @ObfuscatedName("bo.q")
    public int field1239;

    @ObfuscatedName("bo.k(II)I")
    public static int method1334(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("bo.h(II)I")
    public static int method1243(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("bo.ab()I")
    public int method1244() {
        int var1 = this.field1229 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field1232 == 0) {
            var2 -= this.field1227 * var2 / (((class63) this.field1243).field1210.length << 8);
        } else if (this.field1232 >= 0) {
            var2 -= this.field1233 * var2 / ((class63) this.field1243).field1210.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    public class65(class63 arg0, int arg1, int arg2) {
        this.field1243 = arg0;
        this.field1233 = arg0.field1211;
        this.field1225 = arg0.field1208;
        this.field1237 = arg0.field1212;
        this.field1234 = arg1;
        this.field1238 = arg2;
        this.field1228 = 8192;
        this.field1227 = 0;
        this.method1248();
    }

    public class65(class63 arg0, int arg1, int arg2, int arg3) {
        this.field1243 = arg0;
        this.field1233 = arg0.field1211;
        this.field1225 = arg0.field1208;
        this.field1237 = arg0.field1212;
        this.field1234 = arg1;
        this.field1238 = arg2;
        this.field1228 = arg3;
        this.field1227 = 0;
        this.method1248();
    }

    @ObfuscatedName("bo.o(Lbx;II)Lbo;")
    public static class65 method1246(class63 arg0, int arg1, int arg2) {
        return arg0.field1210 == null || arg0.field1210.length == 0 ? null : new class65(arg0, (int) ((long) arg0.field1209 * 256L * (long) arg1 / (long) (Statics.field2148 * 100)), arg2 << 6);
    }

    @ObfuscatedName("bo.z(Lbx;III)Lbo;")
    public static class65 method1353(class63 arg0, int arg1, int arg2, int arg3) {
        return arg0.field1210 == null || arg0.field1210.length == 0 ? null : new class65(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("bo.c()V")
    public void method1248() {
        this.field1229 = this.field1238;
        this.field1230 = method1334(this.field1238, this.field1228);
        this.field1231 = method1243(this.field1238, this.field1228);
    }

    @ObfuscatedName("bo.f(I)V")
    public synchronized void method1249(int arg0) {
        this.field1232 = arg0;
    }

    @ObfuscatedName("bo.g(I)V")
    public synchronized void method1275(int arg0) {
        this.method1358(arg0 << 6, this.method1361());
    }

    @ObfuscatedName("bo.t(I)V")
    public synchronized void method1251(int arg0) {
        this.method1358(arg0, this.method1361());
    }

    @ObfuscatedName("bo.e(II)V")
    public synchronized void method1358(int arg0, int arg1) {
        this.field1238 = arg0;
        this.field1228 = arg1;
        this.field1236 = 0;
        this.method1248();
    }

    @ObfuscatedName("bo.q()I")
    public synchronized int method1252() {
        return this.field1238 == Integer.MIN_VALUE ? 0 : this.field1238;
    }

    @ObfuscatedName("bo.u()I")
    public synchronized int method1361() {
        return this.field1228 < 0 ? -1 : this.field1228;
    }

    @ObfuscatedName("bo.r(I)V")
    public synchronized void method1254(int arg0) {
        int var2 = ((class63) this.field1243).field1210.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field1227 = arg0;
    }

    @ObfuscatedName("bo.a(Z)V")
    public synchronized void method1331(boolean arg0) {
        this.field1234 = (this.field1234 >>> 31) + (this.field1234 ^ this.field1234 >> 31);
        if (arg0) {
            this.field1234 = -this.field1234;
        }
    }

    @ObfuscatedName("bo.m()V")
    public void method1247() {
        if (this.field1236 == 0) {
            return;
        }
        if (this.field1238 == Integer.MIN_VALUE) {
            this.field1238 = 0;
        }
        this.field1236 = 0;
        this.method1248();
    }

    @ObfuscatedName("bo.y(II)V")
    public synchronized void method1257(int arg0, int arg1) {
        this.method1286(arg0, arg1, this.method1361());
    }

    @ObfuscatedName("bo.x(III)V")
    public synchronized void method1286(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method1358(arg1, arg2);
            return;
        }
        int var4 = method1334(arg1, arg2);
        int var5 = method1243(arg1, arg2);
        if (this.field1230 == var4 && this.field1231 == var5) {
            this.field1236 = 0;
            return;
        }
        int var6 = arg1 - this.field1229;
        if (this.field1229 - arg1 > var6) {
            var6 = this.field1229 - arg1;
        }
        if (var4 - this.field1230 > var6) {
            var6 = var4 - this.field1230;
        }
        if (this.field1230 - var4 > var6) {
            var6 = this.field1230 - var4;
        }
        if (var5 - this.field1231 > var6) {
            var6 = var5 - this.field1231;
        }
        if (this.field1231 - var5 > var6) {
            var6 = this.field1231 - var5;
        }
        if (arg0 > var6) {
            arg0 = var6;
        }
        this.field1236 = arg0;
        this.field1238 = arg1;
        this.field1228 = arg2;
        this.field1226 = (arg1 - this.field1229) / arg0;
        this.field1235 = (var4 - this.field1230) / arg0;
        this.field1239 = (var5 - this.field1231) / arg0;
    }

    @ObfuscatedName("bo.n(I)V")
    public synchronized void method1259(int arg0) {
        if (arg0 == 0) {
            this.method1251(0);
            this.method3679();
        } else if (this.field1230 == 0 && this.field1231 == 0) {
            this.field1236 = 0;
            this.field1238 = 0;
            this.field1229 = 0;
            this.method3679();
        } else {
            int var2 = -this.field1229;
            if (this.field1229 > var2) {
                var2 = this.field1229;
            }
            if (-this.field1230 > var2) {
                var2 = -this.field1230;
            }
            if (this.field1230 > var2) {
                var2 = this.field1230;
            }
            if (-this.field1231 > var2) {
                var2 = -this.field1231;
            }
            if (this.field1231 > var2) {
                var2 = this.field1231;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field1236 = arg0;
            this.field1238 = Integer.MIN_VALUE;
            this.field1226 = -this.field1229 / arg0;
            this.field1235 = -this.field1230 / arg0;
            this.field1239 = -this.field1231 / arg0;
        }
    }

    @ObfuscatedName("bo.v(I)V")
    public synchronized void method1260(int arg0) {
        if (this.field1234 < 0) {
            this.field1234 = -arg0;
        } else {
            this.field1234 = arg0;
        }
    }

    @ObfuscatedName("bo.s()I")
    public synchronized int method1245() {
        return this.field1234 < 0 ? -this.field1234 : this.field1234;
    }

    @ObfuscatedName("bo.w()Z")
    public boolean method1262() {
        return this.field1227 < 0 || this.field1227 >= ((class63) this.field1243).field1210.length << 8;
    }

    @ObfuscatedName("bo.al()Z")
    public boolean method1263() {
        return this.field1236 != 0;
    }

    @ObfuscatedName("bo.d()Lbk;")
    public class67 method1089() {
        return null;
    }

    @ObfuscatedName("bo.l()Lbk;")
    public class67 method1090() {
        return null;
    }

    @ObfuscatedName("bo.b()I")
    public int method1108() {
        return this.field1238 == 0 && this.field1236 == 0 ? 0 : 1;
    }

    @ObfuscatedName("bo.j([III)V")
    public synchronized void method1086(int[] arg0, int arg1, int arg2) {
        if (this.field1238 == 0 && this.field1236 == 0) {
            this.method1094(arg2);
            return;
        }
        class63 var4 = (class63) this.field1243;
        int var5 = this.field1233 << 8;
        int var6 = this.field1225 << 8;
        int var7 = var4.field1210.length << 8;
        int var8 = var6 - var5;
        if (var8 <= 0) {
            this.field1232 = 0;
        }
        int var9 = arg1;
        int var10 = arg1 + arg2;
        if (this.field1227 < 0) {
            if (this.field1234 <= 0) {
                this.method1247();
                this.method3679();
                return;
            }
            this.field1227 = 0;
        }
        if (this.field1227 >= var7) {
            if (this.field1234 >= 0) {
                this.method1247();
                this.method3679();
                return;
            }
            this.field1227 = var7 - 1;
        }
        if (this.field1232 >= 0) {
            if (this.field1232 > 0) {
                if (this.field1237) {
                    label131: {
                        if (this.field1234 < 0) {
                            var9 = this.method1265(arg0, arg1, var5, var10, var4.field1210[this.field1233]);
                            if (this.field1227 >= var5) {
                                return;
                            }
                            this.field1227 = var5 + var5 - 1 - this.field1227;
                            this.field1234 = -this.field1234;
                            if (--this.field1232 == 0) {
                                break label131;
                            }
                        }
                        do {
                            var9 = this.method1306(arg0, var9, var6, var10, var4.field1210[this.field1225 - 1]);
                            if (this.field1227 < var6) {
                                return;
                            }
                            this.field1227 = var6 + var6 - 1 - this.field1227;
                            this.field1234 = -this.field1234;
                            if (--this.field1232 == 0) {
                                break;
                            }
                            var9 = this.method1265(arg0, var9, var5, var10, var4.field1210[this.field1233]);
                            if (this.field1227 >= var5) {
                                return;
                            }
                            this.field1227 = var5 + var5 - 1 - this.field1227;
                            this.field1234 = -this.field1234;
                        } while (--this.field1232 != 0);
                    }
                } else if (this.field1234 < 0) {
                    while (true) {
                        var9 = this.method1265(arg0, var9, var5, var10, var4.field1210[this.field1225 - 1]);
                        if (this.field1227 >= var5) {
                            return;
                        }
                        int var12 = (var6 - 1 - this.field1227) / var8;
                        if (var12 >= this.field1232) {
                            this.field1227 += this.field1232 * var8;
                            this.field1232 = 0;
                            break;
                        }
                        this.field1227 += var8 * var12;
                        this.field1232 -= var12;
                    }
                } else {
                    while (true) {
                        var9 = this.method1306(arg0, var9, var6, var10, var4.field1210[this.field1233]);
                        if (this.field1227 < var6) {
                            return;
                        }
                        int var13 = (this.field1227 - var5) / var8;
                        if (var13 >= this.field1232) {
                            this.field1227 -= this.field1232 * var8;
                            this.field1232 = 0;
                            break;
                        }
                        this.field1227 -= var8 * var13;
                        this.field1232 -= var13;
                    }
                }
            }
            if (this.field1234 < 0) {
                this.method1265(arg0, var9, 0, var10, 0);
                if (this.field1227 < 0) {
                    this.field1227 = -1;
                    this.method1247();
                    this.method3679();
                }
            } else {
                this.method1306(arg0, var9, var7, var10, 0);
                if (this.field1227 >= var7) {
                    this.field1227 = var7;
                    this.method1247();
                    this.method3679();
                }
            }
        } else if (this.field1237) {
            if (this.field1234 < 0) {
                var9 = this.method1265(arg0, arg1, var5, var10, var4.field1210[this.field1233]);
                if (this.field1227 >= var5) {
                    return;
                }
                this.field1227 = var5 + var5 - 1 - this.field1227;
                this.field1234 = -this.field1234;
            }
            while (true) {
                int var11 = this.method1306(arg0, var9, var6, var10, var4.field1210[this.field1225 - 1]);
                if (this.field1227 < var6) {
                    return;
                }
                this.field1227 = var6 + var6 - 1 - this.field1227;
                this.field1234 = -this.field1234;
                var9 = this.method1265(arg0, var11, var5, var10, var4.field1210[this.field1233]);
                if (this.field1227 >= var5) {
                    return;
                }
                this.field1227 = var5 + var5 - 1 - this.field1227;
                this.field1234 = -this.field1234;
            }
        } else if (this.field1234 < 0) {
            while (true) {
                var9 = this.method1265(arg0, var9, var5, var10, var4.field1210[this.field1225 - 1]);
                if (this.field1227 >= var5) {
                    return;
                }
                this.field1227 = var6 - 1 - (var6 - 1 - this.field1227) % var8;
            }
        } else {
            while (true) {
                var9 = this.method1306(arg0, var9, var6, var10, var4.field1210[this.field1233]);
                if (this.field1227 < var6) {
                    return;
                }
                this.field1227 = (this.field1227 - var5) % var8 + var5;
            }
        }
    }

    @ObfuscatedName("bo.i(I)V")
    public synchronized void method1094(int arg0) {
        if (this.field1236 > 0) {
            if (arg0 >= this.field1236) {
                if (this.field1238 == Integer.MIN_VALUE) {
                    this.field1238 = 0;
                    this.field1231 = 0;
                    this.field1230 = 0;
                    this.field1229 = 0;
                    this.method3679();
                    arg0 = this.field1236;
                }
                this.field1236 = 0;
                this.method1248();
            } else {
                this.field1229 += this.field1226 * arg0;
                this.field1230 += this.field1235 * arg0;
                this.field1231 += this.field1239 * arg0;
                this.field1236 -= arg0;
            }
        }
        class63 var2 = (class63) this.field1243;
        int var3 = this.field1233 << 8;
        int var4 = this.field1225 << 8;
        int var5 = var2.field1210.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field1232 = 0;
        }
        if (this.field1227 < 0) {
            if (this.field1234 <= 0) {
                this.method1247();
                this.method3679();
                return;
            }
            this.field1227 = 0;
        }
        if (this.field1227 >= var5) {
            if (this.field1234 >= 0) {
                this.method1247();
                this.method3679();
                return;
            }
            this.field1227 = var5 - 1;
        }
        this.field1227 += this.field1234 * arg0;
        if (this.field1232 >= 0) {
            if (this.field1232 > 0) {
                if (this.field1237) {
                    label121: {
                        if (this.field1234 < 0) {
                            if (this.field1227 >= var3) {
                                return;
                            }
                            this.field1227 = var3 + var3 - 1 - this.field1227;
                            this.field1234 = -this.field1234;
                            if (--this.field1232 == 0) {
                                break label121;
                            }
                        }
                        do {
                            if (this.field1227 < var4) {
                                return;
                            }
                            this.field1227 = var4 + var4 - 1 - this.field1227;
                            this.field1234 = -this.field1234;
                            if (--this.field1232 == 0) {
                                break;
                            }
                            if (this.field1227 >= var3) {
                                return;
                            }
                            this.field1227 = var3 + var3 - 1 - this.field1227;
                            this.field1234 = -this.field1234;
                        } while (--this.field1232 != 0);
                    }
                } else {
                    label153: {
                        if (this.field1234 < 0) {
                            if (this.field1227 >= var3) {
                                return;
                            }
                            int var7 = (var4 - 1 - this.field1227) / var6;
                            if (var7 >= this.field1232) {
                                this.field1227 += this.field1232 * var6;
                                this.field1232 = 0;
                                break label153;
                            }
                            this.field1227 += var6 * var7;
                            this.field1232 -= var7;
                        } else if (this.field1227 >= var4) {
                            int var8 = (this.field1227 - var3) / var6;
                            if (var8 >= this.field1232) {
                                this.field1227 -= this.field1232 * var6;
                                this.field1232 = 0;
                                break label153;
                            }
                            this.field1227 -= var6 * var8;
                            this.field1232 -= var8;
                        } else {
                            return;
                        }
                        return;
                    }
                }
            }
            if (this.field1234 < 0) {
                if (this.field1227 < 0) {
                    this.field1227 = -1;
                    this.method1247();
                    this.method3679();
                }
            } else if (this.field1227 >= var5) {
                this.field1227 = var5;
                this.method1247();
                this.method3679();
            }
        } else if (this.field1237) {
            if (this.field1234 < 0) {
                if (this.field1227 >= var3) {
                    return;
                }
                this.field1227 = var3 + var3 - 1 - this.field1227;
                this.field1234 = -this.field1234;
            }
            while (this.field1227 >= var4) {
                this.field1227 = var4 + var4 - 1 - this.field1227;
                this.field1234 = -this.field1234;
                if (this.field1227 >= var3) {
                    return;
                }
                this.field1227 = var3 + var3 - 1 - this.field1227;
                this.field1234 = -this.field1234;
            }
        } else if (this.field1234 < 0) {
            if (this.field1227 >= var3) {
                return;
            }
            this.field1227 = var4 - 1 - (var4 - 1 - this.field1227) % var6;
        } else if (this.field1227 >= var4) {
            this.field1227 = (this.field1227 - var3) % var6 + var3;
        } else {
            return;
        }
    }

    @ObfuscatedName("bo.aq([IIIII)I")
    public int method1306(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1236 > 0) {
                int var6 = this.field1236 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1236 += arg1;
                if (this.field1234 == 256 && (this.field1227 & 0xFF) == 0) {
                    if (Statics.field1074) {
                        arg1 = method1305(0, ((class63) this.field1243).field1210, arg0, this.field1227, arg1, this.field1230, this.field1231, this.field1235, this.field1239, 0, var6, arg2, this);
                    } else {
                        arg1 = method1293(((class63) this.field1243).field1210, arg0, this.field1227, arg1, this.field1229, this.field1226, 0, var6, arg2, this);
                    }
                } else if (Statics.field1074) {
                    arg1 = method1278(0, 0, ((class63) this.field1243).field1210, arg0, this.field1227, arg1, this.field1230, this.field1231, this.field1235, this.field1239, 0, var6, arg2, this, this.field1234, arg4);
                } else {
                    arg1 = method1369(0, 0, ((class63) this.field1243).field1210, arg0, this.field1227, arg1, this.field1229, this.field1226, 0, var6, arg2, this, this.field1234, arg4);
                }
                this.field1236 -= arg1;
                if (this.field1236 != 0) {
                    return arg1;
                }
                if (!this.method1266()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1234 == 256 && (this.field1227 & 0xFF) == 0) {
                if (Statics.field1074) {
                    return method1253(0, ((class63) this.field1243).field1210, arg0, this.field1227, arg1, this.field1230, this.field1231, 0, arg3, arg2, this);
                }
                return method1267(((class63) this.field1243).field1210, arg0, this.field1227, arg1, this.field1229, 0, arg3, arg2, this);
            }
            if (Statics.field1074) {
                return method1272(0, 0, ((class63) this.field1243).field1210, arg0, this.field1227, arg1, this.field1230, this.field1231, 0, arg3, arg2, this, this.field1234, arg4);
            }
            return method1256(0, 0, ((class63) this.field1243).field1210, arg0, this.field1227, arg1, this.field1229, 0, arg3, arg2, this, this.field1234, arg4);
        }
    }

    @ObfuscatedName("bo.aa([IIIII)I")
    public int method1265(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1236 > 0) {
                int var6 = this.field1236 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1236 += arg1;
                if (this.field1234 == -256 && (this.field1227 & 0xFF) == 0) {
                    if (Statics.field1074) {
                        arg1 = method1276(0, ((class63) this.field1243).field1210, arg0, this.field1227, arg1, this.field1230, this.field1231, this.field1235, this.field1239, 0, var6, arg2, this);
                    } else {
                        arg1 = method1335(((class63) this.field1243).field1210, arg0, this.field1227, arg1, this.field1229, this.field1226, 0, var6, arg2, this);
                    }
                } else if (Statics.field1074) {
                    arg1 = method1280(0, 0, ((class63) this.field1243).field1210, arg0, this.field1227, arg1, this.field1230, this.field1231, this.field1235, this.field1239, 0, var6, arg2, this, this.field1234, arg4);
                } else {
                    arg1 = method1279(0, 0, ((class63) this.field1243).field1210, arg0, this.field1227, arg1, this.field1229, this.field1226, 0, var6, arg2, this, this.field1234, arg4);
                }
                this.field1236 -= arg1;
                if (this.field1236 != 0) {
                    return arg1;
                }
                if (!this.method1266()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1234 == -256 && (this.field1227 & 0xFF) == 0) {
                if (Statics.field1074) {
                    return method1270(0, ((class63) this.field1243).field1210, arg0, this.field1227, arg1, this.field1230, this.field1231, 0, arg3, arg2, this);
                }
                return method1269(((class63) this.field1243).field1210, arg0, this.field1227, arg1, this.field1229, 0, arg3, arg2, this);
            }
            if (Statics.field1074) {
                return method1274(0, 0, ((class63) this.field1243).field1210, arg0, this.field1227, arg1, this.field1230, this.field1231, 0, arg3, arg2, this, this.field1234, arg4);
            }
            return method1273(0, 0, ((class63) this.field1243).field1210, arg0, this.field1227, arg1, this.field1229, 0, arg3, arg2, this, this.field1234, arg4);
        }
    }

    @ObfuscatedName("bo.af()Z")
    public boolean method1266() {
        int var1 = this.field1238;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method1334(var1, this.field1228);
            var2 = method1243(var1, this.field1228);
        }
        if (this.field1229 != var1 || this.field1230 != var3 || this.field1231 != var2) {
            if (this.field1229 < var1) {
                this.field1226 = 1;
                this.field1236 = var1 - this.field1229;
            } else if (this.field1229 > var1) {
                this.field1226 = -1;
                this.field1236 = this.field1229 - var1;
            } else {
                this.field1226 = 0;
            }
            if (this.field1230 < var3) {
                this.field1235 = 1;
                if (this.field1236 == 0 || this.field1236 > var3 - this.field1230) {
                    this.field1236 = var3 - this.field1230;
                }
            } else if (this.field1230 > var3) {
                this.field1235 = -1;
                if (this.field1236 == 0 || this.field1236 > this.field1230 - var3) {
                    this.field1236 = this.field1230 - var3;
                }
            } else {
                this.field1235 = 0;
            }
            if (this.field1231 < var2) {
                this.field1239 = 1;
                if (this.field1236 == 0 || this.field1236 > var2 - this.field1231) {
                    this.field1236 = var2 - this.field1231;
                }
            } else if (this.field1231 > var2) {
                this.field1239 = -1;
                if (this.field1236 == 0 || this.field1236 > this.field1231 - var2) {
                    this.field1236 = this.field1231 - var2;
                }
            } else {
                this.field1239 = 0;
            }
            return false;
        } else if (this.field1238 == Integer.MIN_VALUE) {
            this.field1238 = 0;
            this.field1231 = 0;
            this.field1230 = 0;
            this.field1229 = 0;
            this.method3679();
            return true;
        } else {
            this.method1248();
            return false;
        }
    }

    @ObfuscatedName("bo.ai([B[IIIIIIILbo;)I")
    public static int method1267(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class65 arg8) {
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
        arg8.field1227 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("bo.ak(I[B[IIIIIIIILbo;)I")
    public static int method1253(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class65 arg10) {
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
        arg10.field1227 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("bo.aj([B[IIIIIIILbo;)I")
    public static int method1269(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class65 arg8) {
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
        arg8.field1227 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("bo.ac(I[B[IIIIIIIILbo;)I")
    public static int method1270(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class65 arg10) {
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
        arg10.field1227 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("bo.am(II[B[IIIIIIILbo;II)I")
    public static int method1256(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class65 arg10, int arg11, int arg12) {
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
        arg10.field1227 = arg4;
        return arg5;
    }

    @ObfuscatedName("bo.an(II[B[IIIIIIIILbo;II)I")
    public static int method1272(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class65 arg11, int arg12, int arg13) {
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
        arg11.field1227 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("bo.ba(II[B[IIIIIIILbo;II)I")
    public static int method1273(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class65 arg10, int arg11, int arg12) {
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
        arg10.field1227 = arg4;
        return arg5;
    }

    @ObfuscatedName("bo.bf(II[B[IIIIIIIILbo;II)I")
    public static int method1274(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class65 arg11, int arg12, int arg13) {
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
        arg11.field1227 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("bo.bm([B[IIIIIIIILbo;)I")
    public static int method1293(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class65 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field1230 += (var14 - arg3) * arg9.field1235;
        arg9.field1231 += (var14 - arg3) * arg9.field1239;
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
        arg9.field1229 = var12 >> 2;
        arg9.field1227 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("bo.bp(I[B[IIIIIIIIIILbo;)I")
    public static int method1305(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class65 arg12) {
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
        arg12.field1229 += (var19 - arg4) * arg12.field1226;
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
        arg12.field1230 = var15 >> 2;
        arg12.field1231 = var16 >> 2;
        arg12.field1227 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("bo.by([B[IIIIIIIILbo;)I")
    public static int method1335(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class65 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field1230 += (var14 - arg3) * arg9.field1235;
        arg9.field1231 += (var14 - arg3) * arg9.field1239;
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
        arg9.field1229 = var12 >> 2;
        arg9.field1227 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("bo.bc(I[B[IIIIIIIIIILbo;)I")
    public static int method1276(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class65 arg12) {
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
        arg12.field1229 += (var19 - arg4) * arg12.field1226;
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
        arg12.field1230 = var15 >> 2;
        arg12.field1231 = var16 >> 2;
        arg12.field1227 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("bo.be(II[B[IIIIIIIILbo;II)I")
    public static int method1369(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class65 arg11, int arg12, int arg13) {
        arg11.field1230 -= arg11.field1235 * arg5;
        arg11.field1231 -= arg11.field1239 * arg5;
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
        arg11.field1230 += arg11.field1235 * arg5;
        arg11.field1231 += arg11.field1239 * arg5;
        arg11.field1229 = arg6;
        arg11.field1227 = arg4;
        return arg5;
    }

    @ObfuscatedName("bo.bw(II[B[IIIIIIIIIILbo;II)I")
    public static int method1278(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class65 arg13, int arg14, int arg15) {
        arg13.field1229 -= arg13.field1226 * arg5;
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
        arg13.field1229 += arg13.field1226 * var27;
        arg13.field1230 = arg6;
        arg13.field1231 = arg7;
        arg13.field1227 = arg4;
        return var27;
    }

    @ObfuscatedName("bo.bh(II[B[IIIIIIIILbo;II)I")
    public static int method1279(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class65 arg11, int arg12, int arg13) {
        arg11.field1230 -= arg11.field1235 * arg5;
        arg11.field1231 -= arg11.field1239 * arg5;
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
        arg11.field1230 += arg11.field1235 * arg5;
        arg11.field1231 += arg11.field1239 * arg5;
        arg11.field1229 = arg6;
        arg11.field1227 = arg4;
        return arg5;
    }

    @ObfuscatedName("bo.bn(II[B[IIIIIIIIIILbo;II)I")
    public static int method1280(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class65 arg13, int arg14, int arg15) {
        arg13.field1229 -= arg13.field1226 * arg5;
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
        arg13.field1229 += arg13.field1226 * var26;
        arg13.field1230 = arg6;
        arg13.field1231 = arg7;
        arg13.field1227 = arg4;
        return var26;
    }
}
