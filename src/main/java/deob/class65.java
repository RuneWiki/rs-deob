package deob;

@ObfuscatedName("bo")
public class class65 extends class67 {

    @ObfuscatedName("bo.m")
    public int field1207;

    @ObfuscatedName("bo.l")
    public int field1205;

    @ObfuscatedName("bo.y")
    public int field1206;

    @ObfuscatedName("bo.u")
    public int field1210;

    @ObfuscatedName("bo.k")
    public int field1208;

    @ObfuscatedName("bo.j")
    public int field1209;

    @ObfuscatedName("bo.i")
    public int field1217;

    @ObfuscatedName("bo.x")
    public int field1211;

    @ObfuscatedName("bo.g")
    public int field1212;

    @ObfuscatedName("bo.e")
    public int field1215;

    @ObfuscatedName("bo.p")
    public boolean field1204;

    @ObfuscatedName("bo.a")
    public int field1214;

    @ObfuscatedName("bo.v")
    public int field1216;

    @ObfuscatedName("bo.c")
    public int field1213;

    @ObfuscatedName("bo.s")
    public int field1218;

    @ObfuscatedName("bo.m(II)I")
    public static int method1307(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("bo.l(II)I")
    public static int method1301(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("bo.ai()I")
    public int method1302() {
        int var1 = this.field1208 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field1211 == 0) {
            var2 -= this.field1207 * var2 / (((class63) this.field1222).field1188.length << 8);
        } else if (this.field1211 >= 0) {
            var2 -= this.field1212 * var2 / ((class63) this.field1222).field1188.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    public class65(class63 arg0, int arg1, int arg2) {
        this.field1222 = arg0;
        this.field1212 = arg0.field1187;
        this.field1215 = arg0.field1190;
        this.field1204 = arg0.field1191;
        this.field1205 = arg1;
        this.field1206 = arg2;
        this.field1210 = 8192;
        this.field1207 = 0;
        this.method1388();
    }

    public class65(class63 arg0, int arg1, int arg2, int arg3) {
        this.field1222 = arg0;
        this.field1212 = arg0.field1187;
        this.field1215 = arg0.field1190;
        this.field1204 = arg0.field1191;
        this.field1205 = arg1;
        this.field1206 = arg2;
        this.field1210 = arg3;
        this.field1207 = 0;
        this.method1388();
    }

    @ObfuscatedName("bo.y(Lbt;II)Lbo;")
    public static class65 method1304(class63 arg0, int arg1, int arg2) {
        return arg0.field1188 == null || arg0.field1188.length == 0 ? null : new class65(arg0, (int) ((long) arg0.field1189 * 256L * (long) arg1 / (long) (Statics.field1139 * 100)), arg2 << 6);
    }

    @ObfuscatedName("bo.u(Lbt;III)Lbo;")
    public static class65 method1305(class63 arg0, int arg1, int arg2, int arg3) {
        return arg0.field1188 == null || arg0.field1188.length == 0 ? null : new class65(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("bo.k()V")
    public void method1388() {
        this.field1208 = this.field1206;
        this.field1209 = method1307(this.field1206, this.field1210);
        this.field1217 = method1301(this.field1206, this.field1210);
    }

    @ObfuscatedName("bo.e(I)V")
    public synchronized void method1344(int arg0) {
        this.field1211 = arg0;
    }

    @ObfuscatedName("bo.a(I)V")
    public synchronized void method1360(int arg0) {
        this.method1309(arg0 << 6, this.method1316());
    }

    @ObfuscatedName("bo.v(I)V")
    public synchronized void method1306(int arg0) {
        this.method1309(arg0, this.method1316());
    }

    @ObfuscatedName("bo.c(II)V")
    public synchronized void method1309(int arg0, int arg1) {
        this.field1206 = arg0;
        this.field1210 = arg1;
        this.field1214 = 0;
        this.method1388();
    }

    @ObfuscatedName("bo.s()I")
    public synchronized int method1326() {
        return this.field1206 == Integer.MIN_VALUE ? 0 : this.field1206;
    }

    @ObfuscatedName("bo.r()I")
    public synchronized int method1316() {
        return this.field1210 < 0 ? -1 : this.field1210;
    }

    @ObfuscatedName("bo.h(I)V")
    public synchronized void method1311(int arg0) {
        int var2 = ((class63) this.field1222).field1188.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field1207 = arg0;
    }

    @ObfuscatedName("bo.n(Z)V")
    public synchronized void method1312(boolean arg0) {
        this.field1205 = (this.field1205 >>> 31) + (this.field1205 ^ this.field1205 >> 31);
        if (arg0) {
            this.field1205 = -this.field1205;
        }
    }

    @ObfuscatedName("bo.b()V")
    public void method1320() {
        if (this.field1214 == 0) {
            return;
        }
        if (this.field1206 == Integer.MIN_VALUE) {
            this.field1206 = 0;
        }
        this.field1214 = 0;
        this.method1388();
    }

    @ObfuscatedName("bo.f(II)V")
    public synchronized void method1393(int arg0, int arg1) {
        this.method1330(arg0, arg1, this.method1316());
    }

    @ObfuscatedName("bo.ah(III)V")
    public synchronized void method1330(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method1309(arg1, arg2);
            return;
        }
        int var4 = method1307(arg1, arg2);
        int var5 = method1301(arg1, arg2);
        if (this.field1209 == var4 && this.field1217 == var5) {
            this.field1214 = 0;
            return;
        }
        int var6 = arg1 - this.field1208;
        if (this.field1208 - arg1 > var6) {
            var6 = this.field1208 - arg1;
        }
        if (var4 - this.field1209 > var6) {
            var6 = var4 - this.field1209;
        }
        if (this.field1209 - var4 > var6) {
            var6 = this.field1209 - var4;
        }
        if (var5 - this.field1217 > var6) {
            var6 = var5 - this.field1217;
        }
        if (this.field1217 - var5 > var6) {
            var6 = this.field1217 - var5;
        }
        if (arg0 > var6) {
            arg0 = var6;
        }
        this.field1214 = arg0;
        this.field1206 = arg1;
        this.field1210 = arg2;
        this.field1216 = (arg1 - this.field1208) / arg0;
        this.field1213 = (var4 - this.field1209) / arg0;
        this.field1218 = (var5 - this.field1217) / arg0;
    }

    @ObfuscatedName("bo.ab(I)V")
    public synchronized void method1315(int arg0) {
        if (arg0 == 0) {
            this.method1306(0);
            this.method3702();
        } else if (this.field1209 == 0 && this.field1217 == 0) {
            this.field1214 = 0;
            this.field1206 = 0;
            this.field1208 = 0;
            this.method3702();
        } else {
            int var2 = -this.field1208;
            if (this.field1208 > var2) {
                var2 = this.field1208;
            }
            if (-this.field1209 > var2) {
                var2 = -this.field1209;
            }
            if (this.field1209 > var2) {
                var2 = this.field1209;
            }
            if (-this.field1217 > var2) {
                var2 = -this.field1217;
            }
            if (this.field1217 > var2) {
                var2 = this.field1217;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field1214 = arg0;
            this.field1206 = Integer.MIN_VALUE;
            this.field1216 = -this.field1208 / arg0;
            this.field1213 = -this.field1209 / arg0;
            this.field1218 = -this.field1217 / arg0;
        }
    }

    @ObfuscatedName("bo.au(I)V")
    public synchronized void method1343(int arg0) {
        if (this.field1205 < 0) {
            this.field1205 = -arg0;
        } else {
            this.field1205 = arg0;
        }
    }

    @ObfuscatedName("bo.ap()I")
    public synchronized int method1332() {
        return this.field1205 < 0 ? -this.field1205 : this.field1205;
    }

    @ObfuscatedName("bo.at()Z")
    public boolean method1406() {
        return this.field1207 < 0 || this.field1207 >= ((class63) this.field1222).field1188.length << 8;
    }

    @ObfuscatedName("bo.az()Z")
    public boolean method1319() {
        return this.field1214 != 0;
    }

    @ObfuscatedName("bo.j()Lby;")
    public class67 method1155() {
        return null;
    }

    @ObfuscatedName("bo.i()Lby;")
    public class67 method1156() {
        return null;
    }

    @ObfuscatedName("bo.x()I")
    public int method1157() {
        return this.field1206 == 0 && this.field1214 == 0 ? 0 : 1;
    }

    @ObfuscatedName("bo.g([III)V")
    public synchronized void method1183(int[] arg0, int arg1, int arg2) {
        if (this.field1206 == 0 && this.field1214 == 0) {
            this.method1160(arg2);
            return;
        }
        class63 var4 = (class63) this.field1222;
        int var5 = this.field1212 << 8;
        int var6 = this.field1215 << 8;
        int var7 = var4.field1188.length << 8;
        int var8 = var6 - var5;
        if (var8 <= 0) {
            this.field1211 = 0;
        }
        int var9 = arg1;
        int var10 = arg1 + arg2;
        if (this.field1207 < 0) {
            if (this.field1205 <= 0) {
                this.method1320();
                this.method3702();
                return;
            }
            this.field1207 = 0;
        }
        if (this.field1207 >= var7) {
            if (this.field1205 >= 0) {
                this.method1320();
                this.method3702();
                return;
            }
            this.field1207 = var7 - 1;
        }
        if (this.field1211 >= 0) {
            if (this.field1211 > 0) {
                if (this.field1204) {
                    label131: {
                        if (this.field1205 < 0) {
                            var9 = this.method1317(arg0, arg1, var5, var10, var4.field1188[this.field1212]);
                            if (this.field1207 >= var5) {
                                return;
                            }
                            this.field1207 = var5 + var5 - 1 - this.field1207;
                            this.field1205 = -this.field1205;
                            if (--this.field1211 == 0) {
                                break label131;
                            }
                        }
                        do {
                            var9 = this.method1322(arg0, var9, var6, var10, var4.field1188[this.field1215 - 1]);
                            if (this.field1207 < var6) {
                                return;
                            }
                            this.field1207 = var6 + var6 - 1 - this.field1207;
                            this.field1205 = -this.field1205;
                            if (--this.field1211 == 0) {
                                break;
                            }
                            var9 = this.method1317(arg0, var9, var5, var10, var4.field1188[this.field1212]);
                            if (this.field1207 >= var5) {
                                return;
                            }
                            this.field1207 = var5 + var5 - 1 - this.field1207;
                            this.field1205 = -this.field1205;
                        } while (--this.field1211 != 0);
                    }
                } else if (this.field1205 < 0) {
                    while (true) {
                        var9 = this.method1317(arg0, var9, var5, var10, var4.field1188[this.field1215 - 1]);
                        if (this.field1207 >= var5) {
                            return;
                        }
                        int var12 = (var6 - 1 - this.field1207) / var8;
                        if (var12 >= this.field1211) {
                            this.field1207 += this.field1211 * var8;
                            this.field1211 = 0;
                            break;
                        }
                        this.field1207 += var8 * var12;
                        this.field1211 -= var12;
                    }
                } else {
                    while (true) {
                        var9 = this.method1322(arg0, var9, var6, var10, var4.field1188[this.field1212]);
                        if (this.field1207 < var6) {
                            return;
                        }
                        int var13 = (this.field1207 - var5) / var8;
                        if (var13 >= this.field1211) {
                            this.field1207 -= this.field1211 * var8;
                            this.field1211 = 0;
                            break;
                        }
                        this.field1207 -= var8 * var13;
                        this.field1211 -= var13;
                    }
                }
            }
            if (this.field1205 < 0) {
                this.method1317(arg0, var9, 0, var10, 0);
                if (this.field1207 < 0) {
                    this.field1207 = -1;
                    this.method1320();
                    this.method3702();
                }
            } else {
                this.method1322(arg0, var9, var7, var10, 0);
                if (this.field1207 >= var7) {
                    this.field1207 = var7;
                    this.method1320();
                    this.method3702();
                }
            }
        } else if (this.field1204) {
            if (this.field1205 < 0) {
                var9 = this.method1317(arg0, arg1, var5, var10, var4.field1188[this.field1212]);
                if (this.field1207 >= var5) {
                    return;
                }
                this.field1207 = var5 + var5 - 1 - this.field1207;
                this.field1205 = -this.field1205;
            }
            while (true) {
                int var11 = this.method1322(arg0, var9, var6, var10, var4.field1188[this.field1215 - 1]);
                if (this.field1207 < var6) {
                    return;
                }
                this.field1207 = var6 + var6 - 1 - this.field1207;
                this.field1205 = -this.field1205;
                var9 = this.method1317(arg0, var11, var5, var10, var4.field1188[this.field1212]);
                if (this.field1207 >= var5) {
                    return;
                }
                this.field1207 = var5 + var5 - 1 - this.field1207;
                this.field1205 = -this.field1205;
            }
        } else if (this.field1205 < 0) {
            while (true) {
                var9 = this.method1317(arg0, var9, var5, var10, var4.field1188[this.field1215 - 1]);
                if (this.field1207 >= var5) {
                    return;
                }
                this.field1207 = var6 - 1 - (var6 - 1 - this.field1207) % var8;
            }
        } else {
            while (true) {
                var9 = this.method1322(arg0, var9, var6, var10, var4.field1188[this.field1212]);
                if (this.field1207 < var6) {
                    return;
                }
                this.field1207 = (this.field1207 - var5) % var8 + var5;
            }
        }
    }

    @ObfuscatedName("bo.p(I)V")
    public synchronized void method1160(int arg0) {
        if (this.field1214 > 0) {
            if (arg0 >= this.field1214) {
                if (this.field1206 == Integer.MIN_VALUE) {
                    this.field1206 = 0;
                    this.field1217 = 0;
                    this.field1209 = 0;
                    this.field1208 = 0;
                    this.method3702();
                    arg0 = this.field1214;
                }
                this.field1214 = 0;
                this.method1388();
            } else {
                this.field1208 += this.field1216 * arg0;
                this.field1209 += this.field1213 * arg0;
                this.field1217 += this.field1218 * arg0;
                this.field1214 -= arg0;
            }
        }
        class63 var2 = (class63) this.field1222;
        int var3 = this.field1212 << 8;
        int var4 = this.field1215 << 8;
        int var5 = var2.field1188.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field1211 = 0;
        }
        if (this.field1207 < 0) {
            if (this.field1205 <= 0) {
                this.method1320();
                this.method3702();
                return;
            }
            this.field1207 = 0;
        }
        if (this.field1207 >= var5) {
            if (this.field1205 >= 0) {
                this.method1320();
                this.method3702();
                return;
            }
            this.field1207 = var5 - 1;
        }
        this.field1207 += this.field1205 * arg0;
        if (this.field1211 >= 0) {
            if (this.field1211 > 0) {
                if (this.field1204) {
                    label121: {
                        if (this.field1205 < 0) {
                            if (this.field1207 >= var3) {
                                return;
                            }
                            this.field1207 = var3 + var3 - 1 - this.field1207;
                            this.field1205 = -this.field1205;
                            if (--this.field1211 == 0) {
                                break label121;
                            }
                        }
                        do {
                            if (this.field1207 < var4) {
                                return;
                            }
                            this.field1207 = var4 + var4 - 1 - this.field1207;
                            this.field1205 = -this.field1205;
                            if (--this.field1211 == 0) {
                                break;
                            }
                            if (this.field1207 >= var3) {
                                return;
                            }
                            this.field1207 = var3 + var3 - 1 - this.field1207;
                            this.field1205 = -this.field1205;
                        } while (--this.field1211 != 0);
                    }
                } else {
                    label153: {
                        if (this.field1205 < 0) {
                            if (this.field1207 >= var3) {
                                return;
                            }
                            int var7 = (var4 - 1 - this.field1207) / var6;
                            if (var7 >= this.field1211) {
                                this.field1207 += this.field1211 * var6;
                                this.field1211 = 0;
                                break label153;
                            }
                            this.field1207 += var6 * var7;
                            this.field1211 -= var7;
                        } else if (this.field1207 >= var4) {
                            int var8 = (this.field1207 - var3) / var6;
                            if (var8 >= this.field1211) {
                                this.field1207 -= this.field1211 * var6;
                                this.field1211 = 0;
                                break label153;
                            }
                            this.field1207 -= var6 * var8;
                            this.field1211 -= var8;
                        } else {
                            return;
                        }
                        return;
                    }
                }
            }
            if (this.field1205 < 0) {
                if (this.field1207 < 0) {
                    this.field1207 = -1;
                    this.method1320();
                    this.method3702();
                }
            } else if (this.field1207 >= var5) {
                this.field1207 = var5;
                this.method1320();
                this.method3702();
            }
        } else if (this.field1204) {
            if (this.field1205 < 0) {
                if (this.field1207 >= var3) {
                    return;
                }
                this.field1207 = var3 + var3 - 1 - this.field1207;
                this.field1205 = -this.field1205;
            }
            while (this.field1207 >= var4) {
                this.field1207 = var4 + var4 - 1 - this.field1207;
                this.field1205 = -this.field1205;
                if (this.field1207 >= var3) {
                    return;
                }
                this.field1207 = var3 + var3 - 1 - this.field1207;
                this.field1205 = -this.field1205;
            }
        } else if (this.field1205 < 0) {
            if (this.field1207 >= var3) {
                return;
            }
            this.field1207 = var4 - 1 - (var4 - 1 - this.field1207) % var6;
        } else if (this.field1207 >= var4) {
            this.field1207 = (this.field1207 - var3) % var6 + var3;
        } else {
            return;
        }
    }

    @ObfuscatedName("bo.af([IIIII)I")
    public int method1322(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1214 > 0) {
                int var6 = this.field1214 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1214 += arg1;
                if (this.field1205 == 256 && (this.field1207 & 0xFF) == 0) {
                    if (Statics.field1135) {
                        arg1 = method1333(0, ((class63) this.field1222).field1188, arg0, this.field1207, arg1, this.field1209, this.field1217, this.field1213, this.field1218, 0, var6, arg2, this);
                    } else {
                        arg1 = method1390(((class63) this.field1222).field1188, arg0, this.field1207, arg1, this.field1208, this.field1216, 0, var6, arg2, this);
                    }
                } else if (Statics.field1135) {
                    arg1 = method1340(0, 0, ((class63) this.field1222).field1188, arg0, this.field1207, arg1, this.field1209, this.field1217, this.field1213, this.field1218, 0, var6, arg2, this, this.field1205, arg4);
                } else {
                    arg1 = method1336(0, 0, ((class63) this.field1222).field1188, arg0, this.field1207, arg1, this.field1208, this.field1216, 0, var6, arg2, this, this.field1205, arg4);
                }
                this.field1214 -= arg1;
                if (this.field1214 != 0) {
                    return arg1;
                }
                if (!this.method1324()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1205 == 256 && (this.field1207 & 0xFF) == 0) {
                if (Statics.field1135) {
                    return method1378(0, ((class63) this.field1222).field1188, arg0, this.field1207, arg1, this.field1209, this.field1217, 0, arg3, arg2, this);
                }
                return method1325(((class63) this.field1222).field1188, arg0, this.field1207, arg1, this.field1208, 0, arg3, arg2, this);
            }
            if (Statics.field1135) {
                return method1323(0, 0, ((class63) this.field1222).field1188, arg0, this.field1207, arg1, this.field1209, this.field1217, 0, arg3, arg2, this, this.field1205, arg4);
            }
            return method1329(0, 0, ((class63) this.field1222).field1188, arg0, this.field1207, arg1, this.field1208, 0, arg3, arg2, this, this.field1205, arg4);
        }
    }

    @ObfuscatedName("bo.aw([IIIII)I")
    public int method1317(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1214 > 0) {
                int var6 = this.field1214 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1214 += arg1;
                if (this.field1205 == -256 && (this.field1207 & 0xFF) == 0) {
                    if (Statics.field1135) {
                        arg1 = method1335(0, ((class63) this.field1222).field1188, arg0, this.field1207, arg1, this.field1209, this.field1217, this.field1213, this.field1218, 0, var6, arg2, this);
                    } else {
                        arg1 = method1412(((class63) this.field1222).field1188, arg0, this.field1207, arg1, this.field1208, this.field1216, 0, var6, arg2, this);
                    }
                } else if (Statics.field1135) {
                    arg1 = method1339(0, 0, ((class63) this.field1222).field1188, arg0, this.field1207, arg1, this.field1209, this.field1217, this.field1213, this.field1218, 0, var6, arg2, this, this.field1205, arg4);
                } else {
                    arg1 = method1338(0, 0, ((class63) this.field1222).field1188, arg0, this.field1207, arg1, this.field1208, this.field1216, 0, var6, arg2, this, this.field1205, arg4);
                }
                this.field1214 -= arg1;
                if (this.field1214 != 0) {
                    return arg1;
                }
                if (!this.method1324()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1205 == -256 && (this.field1207 & 0xFF) == 0) {
                if (Statics.field1135) {
                    return method1328(0, ((class63) this.field1222).field1188, arg0, this.field1207, arg1, this.field1209, this.field1217, 0, arg3, arg2, this);
                }
                return method1366(((class63) this.field1222).field1188, arg0, this.field1207, arg1, this.field1208, 0, arg3, arg2, this);
            }
            if (Statics.field1135) {
                return method1337(0, 0, ((class63) this.field1222).field1188, arg0, this.field1207, arg1, this.field1209, this.field1217, 0, arg3, arg2, this, this.field1205, arg4);
            }
            return method1331(0, 0, ((class63) this.field1222).field1188, arg0, this.field1207, arg1, this.field1208, 0, arg3, arg2, this, this.field1205, arg4);
        }
    }

    @ObfuscatedName("bo.al()Z")
    public boolean method1324() {
        int var1 = this.field1206;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method1307(var1, this.field1210);
            var2 = method1301(var1, this.field1210);
        }
        if (this.field1208 != var1 || this.field1209 != var3 || this.field1217 != var2) {
            if (this.field1208 < var1) {
                this.field1216 = 1;
                this.field1214 = var1 - this.field1208;
            } else if (this.field1208 > var1) {
                this.field1216 = -1;
                this.field1214 = this.field1208 - var1;
            } else {
                this.field1216 = 0;
            }
            if (this.field1209 < var3) {
                this.field1213 = 1;
                if (this.field1214 == 0 || this.field1214 > var3 - this.field1209) {
                    this.field1214 = var3 - this.field1209;
                }
            } else if (this.field1209 > var3) {
                this.field1213 = -1;
                if (this.field1214 == 0 || this.field1214 > this.field1209 - var3) {
                    this.field1214 = this.field1209 - var3;
                }
            } else {
                this.field1213 = 0;
            }
            if (this.field1217 < var2) {
                this.field1218 = 1;
                if (this.field1214 == 0 || this.field1214 > var2 - this.field1217) {
                    this.field1214 = var2 - this.field1217;
                }
            } else if (this.field1217 > var2) {
                this.field1218 = -1;
                if (this.field1214 == 0 || this.field1214 > this.field1217 - var2) {
                    this.field1214 = this.field1217 - var2;
                }
            } else {
                this.field1218 = 0;
            }
            return false;
        } else if (this.field1206 == Integer.MIN_VALUE) {
            this.field1206 = 0;
            this.field1217 = 0;
            this.field1209 = 0;
            this.field1208 = 0;
            this.method3702();
            return true;
        } else {
            this.method1388();
            return false;
        }
    }

    @ObfuscatedName("bo.ax([B[IIIIIIILbo;)I")
    public static int method1325(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class65 arg8) {
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
        arg8.field1207 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("bo.ag(I[B[IIIIIIIILbo;)I")
    public static int method1378(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class65 arg10) {
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
        arg10.field1207 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("bo.ak([B[IIIIIIILbo;)I")
    public static int method1366(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class65 arg8) {
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
        arg8.field1207 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("bo.ad(I[B[IIIIIIIILbo;)I")
    public static int method1328(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class65 arg10) {
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
        arg10.field1207 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("bo.ae(II[B[IIIIIIILbo;II)I")
    public static int method1329(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class65 arg10, int arg11, int arg12) {
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
        arg10.field1207 = arg4;
        return arg5;
    }

    @ObfuscatedName("bo.as(II[B[IIIIIIIILbo;II)I")
    public static int method1323(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class65 arg11, int arg12, int arg13) {
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
        arg11.field1207 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("bo.ay(II[B[IIIIIIILbo;II)I")
    public static int method1331(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class65 arg10, int arg11, int arg12) {
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
        arg10.field1207 = arg4;
        return arg5;
    }

    @ObfuscatedName("bo.bz(II[B[IIIIIIIILbo;II)I")
    public static int method1337(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class65 arg11, int arg12, int arg13) {
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
        arg11.field1207 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("bo.bx([B[IIIIIIIILbo;)I")
    public static int method1390(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class65 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field1209 += (var14 - arg3) * arg9.field1213;
        arg9.field1217 += (var14 - arg3) * arg9.field1218;
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
        arg9.field1208 = var12 >> 2;
        arg9.field1207 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("bo.bq(I[B[IIIIIIIIIILbo;)I")
    public static int method1333(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class65 arg12) {
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
        arg12.field1208 += (var19 - arg4) * arg12.field1216;
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
        arg12.field1209 = var15 >> 2;
        arg12.field1217 = var16 >> 2;
        arg12.field1207 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("bo.bg([B[IIIIIIIILbo;)I")
    public static int method1412(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class65 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field1209 += (var14 - arg3) * arg9.field1213;
        arg9.field1217 += (var14 - arg3) * arg9.field1218;
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
        arg9.field1208 = var12 >> 2;
        arg9.field1207 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("bo.bi(I[B[IIIIIIIIIILbo;)I")
    public static int method1335(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class65 arg12) {
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
        arg12.field1208 += (var19 - arg4) * arg12.field1216;
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
        arg12.field1209 = var15 >> 2;
        arg12.field1217 = var16 >> 2;
        arg12.field1207 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("bo.bd(II[B[IIIIIIIILbo;II)I")
    public static int method1336(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class65 arg11, int arg12, int arg13) {
        arg11.field1209 -= arg11.field1213 * arg5;
        arg11.field1217 -= arg11.field1218 * arg5;
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
        arg11.field1209 += arg11.field1213 * arg5;
        arg11.field1217 += arg11.field1218 * arg5;
        arg11.field1208 = arg6;
        arg11.field1207 = arg4;
        return arg5;
    }

    @ObfuscatedName("bo.bw(II[B[IIIIIIIIIILbo;II)I")
    public static int method1340(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class65 arg13, int arg14, int arg15) {
        arg13.field1208 -= arg13.field1216 * arg5;
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
        arg13.field1208 += arg13.field1216 * var27;
        arg13.field1209 = arg6;
        arg13.field1217 = arg7;
        arg13.field1207 = arg4;
        return var27;
    }

    @ObfuscatedName("bo.br(II[B[IIIIIIIILbo;II)I")
    public static int method1338(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class65 arg11, int arg12, int arg13) {
        arg11.field1209 -= arg11.field1213 * arg5;
        arg11.field1217 -= arg11.field1218 * arg5;
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
        arg11.field1209 += arg11.field1213 * arg5;
        arg11.field1217 += arg11.field1218 * arg5;
        arg11.field1208 = arg6;
        arg11.field1207 = arg4;
        return arg5;
    }

    @ObfuscatedName("bo.bb(II[B[IIIIIIIIIILbo;II)I")
    public static int method1339(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class65 arg13, int arg14, int arg15) {
        arg13.field1208 -= arg13.field1216 * arg5;
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
        arg13.field1208 += arg13.field1216 * var26;
        arg13.field1209 = arg6;
        arg13.field1217 = arg7;
        arg13.field1207 = arg4;
        return var26;
    }
}
