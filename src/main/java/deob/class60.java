package deob;

@ObfuscatedName("bo")
public class class60 extends class62 {

    @ObfuscatedName("bo.n")
    public int field1203;

    @ObfuscatedName("bo.o")
    public int field1202;

    @ObfuscatedName("bo.a")
    public int field1199;

    @ObfuscatedName("bo.m")
    public int field1200;

    @ObfuscatedName("bo.h")
    public int field1201;

    @ObfuscatedName("bo.i")
    public int field1209;

    @ObfuscatedName("bo.r")
    public int field1198;

    @ObfuscatedName("bo.l")
    public int field1204;

    @ObfuscatedName("bo.f")
    public int field1205;

    @ObfuscatedName("bo.e")
    public int field1206;

    @ObfuscatedName("bo.z")
    public boolean field1207;

    @ObfuscatedName("bo.v")
    public int field1208;

    @ObfuscatedName("bo.x")
    public int field1197;

    @ObfuscatedName("bo.q")
    public int field1210;

    @ObfuscatedName("bo.b")
    public int field1211;

    @ObfuscatedName("bo.n(II)I")
    public static int method1262(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("bo.o(II)I")
    public static int method1221(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("bo.ab()I")
    public int method1185() {
        int var1 = this.field1201 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field1204 == 0) {
            var2 -= this.field1203 * var2 / (((class58) this.field1214).field1181.length << 8);
        } else if (this.field1204 >= 0) {
            var2 -= this.field1205 * var2 / ((class58) this.field1214).field1181.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    public class60(class58 arg0, int arg1, int arg2) {
        this.field1214 = arg0;
        this.field1205 = arg0.field1182;
        this.field1206 = arg0.field1183;
        this.field1207 = arg0.field1180;
        this.field1202 = arg1;
        this.field1199 = arg2;
        this.field1200 = 8192;
        this.field1203 = 0;
        this.method1190();
    }

    public class60(class58 arg0, int arg1, int arg2, int arg3) {
        this.field1214 = arg0;
        this.field1205 = arg0.field1182;
        this.field1206 = arg0.field1183;
        this.field1207 = arg0.field1180;
        this.field1202 = arg1;
        this.field1199 = arg2;
        this.field1200 = arg3;
        this.field1203 = 0;
        this.method1190();
    }

    @ObfuscatedName("bo.a(Lbu;II)Lbo;")
    public static class60 method1280(class58 arg0, int arg1, int arg2) {
        return arg0.field1181 == null || arg0.field1181.length == 0 ? null : new class60(arg0, (int) ((long) arg0.field1184 * 256L * (long) arg1 / (long) (Statics.field1141 * 100)), arg2 << 6);
    }

    @ObfuscatedName("bo.w(Lbu;III)Lbo;")
    public static class60 method1189(class58 arg0, int arg1, int arg2, int arg3) {
        return arg0.field1181 == null || arg0.field1181.length == 0 ? null : new class60(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("bo.m()V")
    public void method1190() {
        this.field1201 = this.field1199;
        this.field1209 = method1262(this.field1199, this.field1200);
        this.field1198 = method1221(this.field1199, this.field1200);
    }

    @ObfuscatedName("bo.f(I)V")
    public synchronized void method1191(int arg0) {
        this.field1204 = arg0;
    }

    @ObfuscatedName("bo.z(I)V")
    public synchronized void method1192(int arg0) {
        this.method1313(arg0 << 6, this.method1220());
    }

    @ObfuscatedName("bo.v(I)V")
    public synchronized void method1193(int arg0) {
        this.method1313(arg0, this.method1220());
    }

    @ObfuscatedName("bo.x(II)V")
    public synchronized void method1313(int arg0, int arg1) {
        this.field1199 = arg0;
        this.field1200 = arg1;
        this.field1208 = 0;
        this.method1190();
    }

    @ObfuscatedName("bo.q()I")
    public synchronized int method1198() {
        return this.field1199 == Integer.MIN_VALUE ? 0 : this.field1199;
    }

    @ObfuscatedName("bo.b()I")
    public synchronized int method1220() {
        return this.field1200 < 0 ? -1 : this.field1200;
    }

    @ObfuscatedName("bo.u(I)V")
    public synchronized void method1197(int arg0) {
        int var2 = ((class58) this.field1214).field1181.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field1203 = arg0;
    }

    @ObfuscatedName("bo.t(Z)V")
    public synchronized void method1265(boolean arg0) {
        this.field1202 = (this.field1202 >>> 31) + (this.field1202 ^ this.field1202 >> 31);
        if (arg0) {
            this.field1202 = -this.field1202;
        }
    }

    @ObfuscatedName("bo.s()V")
    public void method1199() {
        if (this.field1208 == 0) {
            return;
        }
        if (this.field1199 == Integer.MIN_VALUE) {
            this.field1199 = 0;
        }
        this.field1208 = 0;
        this.method1190();
    }

    @ObfuscatedName("bo.p(II)V")
    public synchronized void method1187(int arg0, int arg1) {
        this.method1201(arg0, arg1, this.method1220());
    }

    @ObfuscatedName("bo.d(III)V")
    public synchronized void method1201(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method1313(arg1, arg2);
            return;
        }
        int var4 = method1262(arg1, arg2);
        int var5 = method1221(arg1, arg2);
        if (this.field1209 == var4 && this.field1198 == var5) {
            this.field1208 = 0;
            return;
        }
        int var6 = arg1 - this.field1201;
        if (this.field1201 - arg1 > var6) {
            var6 = this.field1201 - arg1;
        }
        if (var4 - this.field1209 > var6) {
            var6 = var4 - this.field1209;
        }
        if (this.field1209 - var4 > var6) {
            var6 = this.field1209 - var4;
        }
        if (var5 - this.field1198 > var6) {
            var6 = var5 - this.field1198;
        }
        if (this.field1198 - var5 > var6) {
            var6 = this.field1198 - var5;
        }
        if (arg0 > var6) {
            arg0 = var6;
        }
        this.field1208 = arg0;
        this.field1199 = arg1;
        this.field1200 = arg2;
        this.field1197 = (arg1 - this.field1201) / arg0;
        this.field1210 = (var4 - this.field1209) / arg0;
        this.field1211 = (var5 - this.field1198) / arg0;
    }

    @ObfuscatedName("bo.j(I)V")
    public synchronized void method1261(int arg0) {
        if (arg0 == 0) {
            this.method1193(0);
            this.method3540();
        } else if (this.field1209 == 0 && this.field1198 == 0) {
            this.field1208 = 0;
            this.field1199 = 0;
            this.field1201 = 0;
            this.method3540();
        } else {
            int var2 = -this.field1201;
            if (this.field1201 > var2) {
                var2 = this.field1201;
            }
            if (-this.field1209 > var2) {
                var2 = -this.field1209;
            }
            if (this.field1209 > var2) {
                var2 = this.field1209;
            }
            if (-this.field1198 > var2) {
                var2 = -this.field1198;
            }
            if (this.field1198 > var2) {
                var2 = this.field1198;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field1208 = arg0;
            this.field1199 = Integer.MIN_VALUE;
            this.field1197 = -this.field1201 / arg0;
            this.field1210 = -this.field1209 / arg0;
            this.field1211 = -this.field1198 / arg0;
        }
    }

    @ObfuscatedName("bo.k(I)V")
    public synchronized void method1207(int arg0) {
        if (this.field1202 < 0) {
            this.field1202 = -arg0;
        } else {
            this.field1202 = arg0;
        }
    }

    @ObfuscatedName("bo.y()I")
    public synchronized int method1204() {
        return this.field1202 < 0 ? -this.field1202 : this.field1202;
    }

    @ObfuscatedName("bo.c()Z")
    public boolean method1205() {
        return this.field1203 < 0 || this.field1203 >= ((class58) this.field1214).field1181.length << 8;
    }

    @ObfuscatedName("bo.au()Z")
    public boolean method1206() {
        return this.field1208 != 0;
    }

    @ObfuscatedName("bo.h()Lby;")
    public class62 method1045() {
        return null;
    }

    @ObfuscatedName("bo.i()Lby;")
    public class62 method1037() {
        return null;
    }

    @ObfuscatedName("bo.r()I")
    public int method1048() {
        return this.field1199 == 0 && this.field1208 == 0 ? 0 : 1;
    }

    @ObfuscatedName("bo.l([III)V")
    public synchronized void method1030(int[] arg0, int arg1, int arg2) {
        if (this.field1199 == 0 && this.field1208 == 0) {
            this.method1041(arg2);
            return;
        }
        class58 var4 = (class58) this.field1214;
        int var5 = this.field1205 << 8;
        int var6 = this.field1206 << 8;
        int var7 = var4.field1181.length << 8;
        int var8 = var6 - var5;
        if (var8 <= 0) {
            this.field1204 = 0;
        }
        int var9 = arg1;
        int var10 = arg1 + arg2;
        if (this.field1203 < 0) {
            if (this.field1202 <= 0) {
                this.method1199();
                this.method3540();
                return;
            }
            this.field1203 = 0;
        }
        if (this.field1203 >= var7) {
            if (this.field1202 >= 0) {
                this.method1199();
                this.method3540();
                return;
            }
            this.field1203 = var7 - 1;
        }
        if (this.field1204 >= 0) {
            if (this.field1204 > 0) {
                if (this.field1207) {
                    label131: {
                        if (this.field1202 < 0) {
                            var9 = this.method1209(arg0, arg1, var5, var10, var4.field1181[this.field1205]);
                            if (this.field1203 >= var5) {
                                return;
                            }
                            this.field1203 = var5 + var5 - 1 - this.field1203;
                            this.field1202 = -this.field1202;
                            if (--this.field1204 == 0) {
                                break label131;
                            }
                        }
                        do {
                            var9 = this.method1194(arg0, var9, var6, var10, var4.field1181[this.field1206 - 1]);
                            if (this.field1203 < var6) {
                                return;
                            }
                            this.field1203 = var6 + var6 - 1 - this.field1203;
                            this.field1202 = -this.field1202;
                            if (--this.field1204 == 0) {
                                break;
                            }
                            var9 = this.method1209(arg0, var9, var5, var10, var4.field1181[this.field1205]);
                            if (this.field1203 >= var5) {
                                return;
                            }
                            this.field1203 = var5 + var5 - 1 - this.field1203;
                            this.field1202 = -this.field1202;
                        } while (--this.field1204 != 0);
                    }
                } else if (this.field1202 < 0) {
                    while (true) {
                        var9 = this.method1209(arg0, var9, var5, var10, var4.field1181[this.field1206 - 1]);
                        if (this.field1203 >= var5) {
                            return;
                        }
                        int var12 = (var6 - 1 - this.field1203) / var8;
                        if (var12 >= this.field1204) {
                            this.field1203 += this.field1204 * var8;
                            this.field1204 = 0;
                            break;
                        }
                        this.field1203 += var8 * var12;
                        this.field1204 -= var12;
                    }
                } else {
                    while (true) {
                        var9 = this.method1194(arg0, var9, var6, var10, var4.field1181[this.field1205]);
                        if (this.field1203 < var6) {
                            return;
                        }
                        int var13 = (this.field1203 - var5) / var8;
                        if (var13 >= this.field1204) {
                            this.field1203 -= this.field1204 * var8;
                            this.field1204 = 0;
                            break;
                        }
                        this.field1203 -= var8 * var13;
                        this.field1204 -= var13;
                    }
                }
            }
            if (this.field1202 < 0) {
                this.method1209(arg0, var9, 0, var10, 0);
                if (this.field1203 < 0) {
                    this.field1203 = -1;
                    this.method1199();
                    this.method3540();
                }
            } else {
                this.method1194(arg0, var9, var7, var10, 0);
                if (this.field1203 >= var7) {
                    this.field1203 = var7;
                    this.method1199();
                    this.method3540();
                }
            }
        } else if (this.field1207) {
            if (this.field1202 < 0) {
                var9 = this.method1209(arg0, arg1, var5, var10, var4.field1181[this.field1205]);
                if (this.field1203 >= var5) {
                    return;
                }
                this.field1203 = var5 + var5 - 1 - this.field1203;
                this.field1202 = -this.field1202;
            }
            while (true) {
                int var11 = this.method1194(arg0, var9, var6, var10, var4.field1181[this.field1206 - 1]);
                if (this.field1203 < var6) {
                    return;
                }
                this.field1203 = var6 + var6 - 1 - this.field1203;
                this.field1202 = -this.field1202;
                var9 = this.method1209(arg0, var11, var5, var10, var4.field1181[this.field1205]);
                if (this.field1203 >= var5) {
                    return;
                }
                this.field1203 = var5 + var5 - 1 - this.field1203;
                this.field1202 = -this.field1202;
            }
        } else if (this.field1202 < 0) {
            while (true) {
                var9 = this.method1209(arg0, var9, var5, var10, var4.field1181[this.field1206 - 1]);
                if (this.field1203 >= var5) {
                    return;
                }
                this.field1203 = var6 - 1 - (var6 - 1 - this.field1203) % var8;
            }
        } else {
            while (true) {
                var9 = this.method1194(arg0, var9, var6, var10, var4.field1181[this.field1205]);
                if (this.field1203 < var6) {
                    return;
                }
                this.field1203 = (this.field1203 - var5) % var8 + var5;
            }
        }
    }

    @ObfuscatedName("bo.e(I)V")
    public synchronized void method1041(int arg0) {
        if (this.field1208 > 0) {
            if (arg0 >= this.field1208) {
                if (this.field1199 == Integer.MIN_VALUE) {
                    this.field1199 = 0;
                    this.field1198 = 0;
                    this.field1209 = 0;
                    this.field1201 = 0;
                    this.method3540();
                    arg0 = this.field1208;
                }
                this.field1208 = 0;
                this.method1190();
            } else {
                this.field1201 += this.field1197 * arg0;
                this.field1209 += this.field1210 * arg0;
                this.field1198 += this.field1211 * arg0;
                this.field1208 -= arg0;
            }
        }
        class58 var2 = (class58) this.field1214;
        int var3 = this.field1205 << 8;
        int var4 = this.field1206 << 8;
        int var5 = var2.field1181.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field1204 = 0;
        }
        if (this.field1203 < 0) {
            if (this.field1202 <= 0) {
                this.method1199();
                this.method3540();
                return;
            }
            this.field1203 = 0;
        }
        if (this.field1203 >= var5) {
            if (this.field1202 >= 0) {
                this.method1199();
                this.method3540();
                return;
            }
            this.field1203 = var5 - 1;
        }
        this.field1203 += this.field1202 * arg0;
        if (this.field1204 >= 0) {
            if (this.field1204 > 0) {
                if (this.field1207) {
                    label121: {
                        if (this.field1202 < 0) {
                            if (this.field1203 >= var3) {
                                return;
                            }
                            this.field1203 = var3 + var3 - 1 - this.field1203;
                            this.field1202 = -this.field1202;
                            if (--this.field1204 == 0) {
                                break label121;
                            }
                        }
                        do {
                            if (this.field1203 < var4) {
                                return;
                            }
                            this.field1203 = var4 + var4 - 1 - this.field1203;
                            this.field1202 = -this.field1202;
                            if (--this.field1204 == 0) {
                                break;
                            }
                            if (this.field1203 >= var3) {
                                return;
                            }
                            this.field1203 = var3 + var3 - 1 - this.field1203;
                            this.field1202 = -this.field1202;
                        } while (--this.field1204 != 0);
                    }
                } else {
                    label153: {
                        if (this.field1202 < 0) {
                            if (this.field1203 >= var3) {
                                return;
                            }
                            int var7 = (var4 - 1 - this.field1203) / var6;
                            if (var7 >= this.field1204) {
                                this.field1203 += this.field1204 * var6;
                                this.field1204 = 0;
                                break label153;
                            }
                            this.field1203 += var6 * var7;
                            this.field1204 -= var7;
                        } else if (this.field1203 >= var4) {
                            int var8 = (this.field1203 - var3) / var6;
                            if (var8 >= this.field1204) {
                                this.field1203 -= this.field1204 * var6;
                                this.field1204 = 0;
                                break label153;
                            }
                            this.field1203 -= var6 * var8;
                            this.field1204 -= var8;
                        } else {
                            return;
                        }
                        return;
                    }
                }
            }
            if (this.field1202 < 0) {
                if (this.field1203 < 0) {
                    this.field1203 = -1;
                    this.method1199();
                    this.method3540();
                }
            } else if (this.field1203 >= var5) {
                this.field1203 = var5;
                this.method1199();
                this.method3540();
            }
        } else if (this.field1207) {
            if (this.field1202 < 0) {
                if (this.field1203 >= var3) {
                    return;
                }
                this.field1203 = var3 + var3 - 1 - this.field1203;
                this.field1202 = -this.field1202;
            }
            while (this.field1203 >= var4) {
                this.field1203 = var4 + var4 - 1 - this.field1203;
                this.field1202 = -this.field1202;
                if (this.field1203 >= var3) {
                    return;
                }
                this.field1203 = var3 + var3 - 1 - this.field1203;
                this.field1202 = -this.field1202;
            }
        } else if (this.field1202 < 0) {
            if (this.field1203 >= var3) {
                return;
            }
            this.field1203 = var4 - 1 - (var4 - 1 - this.field1203) % var6;
        } else if (this.field1203 >= var4) {
            this.field1203 = (this.field1203 - var3) % var6 + var3;
        } else {
            return;
        }
    }

    @ObfuscatedName("bo.ap([IIIII)I")
    public int method1194(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1208 > 0) {
                int var6 = this.field1208 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1208 += arg1;
                if (this.field1202 == 256 && (this.field1203 & 0xFF) == 0) {
                    if (Statics.field1126) {
                        arg1 = method1271(0, ((class58) this.field1214).field1181, arg0, this.field1203, arg1, this.field1209, this.field1198, this.field1210, this.field1211, 0, var6, arg2, this);
                    } else {
                        arg1 = method1219(((class58) this.field1214).field1181, arg0, this.field1203, arg1, this.field1201, this.field1197, 0, var6, arg2, this);
                    }
                } else if (Statics.field1126) {
                    arg1 = method1224(0, 0, ((class58) this.field1214).field1181, arg0, this.field1203, arg1, this.field1209, this.field1198, this.field1210, this.field1211, 0, var6, arg2, this, this.field1202, arg4);
                } else {
                    arg1 = method1242(0, 0, ((class58) this.field1214).field1181, arg0, this.field1203, arg1, this.field1201, this.field1197, 0, var6, arg2, this, this.field1202, arg4);
                }
                this.field1208 -= arg1;
                if (this.field1208 != 0) {
                    return arg1;
                }
                if (!this.method1217()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1202 == 256 && (this.field1203 & 0xFF) == 0) {
                if (Statics.field1126) {
                    return method1212(0, ((class58) this.field1214).field1181, arg0, this.field1203, arg1, this.field1209, this.field1198, 0, arg3, arg2, this);
                }
                return method1227(((class58) this.field1214).field1181, arg0, this.field1203, arg1, this.field1201, 0, arg3, arg2, this);
            }
            if (Statics.field1126) {
                return method1216(0, 0, ((class58) this.field1214).field1181, arg0, this.field1203, arg1, this.field1209, this.field1198, 0, arg3, arg2, this, this.field1202, arg4);
            }
            return method1325(0, 0, ((class58) this.field1214).field1181, arg0, this.field1203, arg1, this.field1201, 0, arg3, arg2, this, this.field1202, arg4);
        }
    }

    @ObfuscatedName("bo.ar([IIIII)I")
    public int method1209(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1208 > 0) {
                int var6 = this.field1208 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1208 += arg1;
                if (this.field1202 == -256 && (this.field1203 & 0xFF) == 0) {
                    if (Statics.field1126) {
                        arg1 = method1222(0, ((class58) this.field1214).field1181, arg0, this.field1203, arg1, this.field1209, this.field1198, this.field1210, this.field1211, 0, var6, arg2, this);
                    } else {
                        arg1 = method1202(((class58) this.field1214).field1181, arg0, this.field1203, arg1, this.field1201, this.field1197, 0, var6, arg2, this);
                    }
                } else if (Statics.field1126) {
                    arg1 = method1210(0, 0, ((class58) this.field1214).field1181, arg0, this.field1203, arg1, this.field1209, this.field1198, this.field1210, this.field1211, 0, var6, arg2, this, this.field1202, arg4);
                } else {
                    arg1 = method1225(0, 0, ((class58) this.field1214).field1181, arg0, this.field1203, arg1, this.field1201, this.field1197, 0, var6, arg2, this, this.field1202, arg4);
                }
                this.field1208 -= arg1;
                if (this.field1208 != 0) {
                    return arg1;
                }
                if (!this.method1217()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1202 == -256 && (this.field1203 & 0xFF) == 0) {
                if (Statics.field1126) {
                    return method1277(0, ((class58) this.field1214).field1181, arg0, this.field1203, arg1, this.field1209, this.field1198, 0, arg3, arg2, this);
                }
                return method1213(((class58) this.field1214).field1181, arg0, this.field1203, arg1, this.field1201, 0, arg3, arg2, this);
            }
            if (Statics.field1126) {
                return method1218(0, 0, ((class58) this.field1214).field1181, arg0, this.field1203, arg1, this.field1209, this.field1198, 0, arg3, arg2, this, this.field1202, arg4);
            }
            return method1243(0, 0, ((class58) this.field1214).field1181, arg0, this.field1203, arg1, this.field1201, 0, arg3, arg2, this, this.field1202, arg4);
        }
    }

    @ObfuscatedName("bo.ah()Z")
    public boolean method1217() {
        int var1 = this.field1199;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method1262(var1, this.field1200);
            var2 = method1221(var1, this.field1200);
        }
        if (this.field1201 != var1 || this.field1209 != var3 || this.field1198 != var2) {
            if (this.field1201 < var1) {
                this.field1197 = 1;
                this.field1208 = var1 - this.field1201;
            } else if (this.field1201 > var1) {
                this.field1197 = -1;
                this.field1208 = this.field1201 - var1;
            } else {
                this.field1197 = 0;
            }
            if (this.field1209 < var3) {
                this.field1210 = 1;
                if (this.field1208 == 0 || this.field1208 > var3 - this.field1209) {
                    this.field1208 = var3 - this.field1209;
                }
            } else if (this.field1209 > var3) {
                this.field1210 = -1;
                if (this.field1208 == 0 || this.field1208 > this.field1209 - var3) {
                    this.field1208 = this.field1209 - var3;
                }
            } else {
                this.field1210 = 0;
            }
            if (this.field1198 < var2) {
                this.field1211 = 1;
                if (this.field1208 == 0 || this.field1208 > var2 - this.field1198) {
                    this.field1208 = var2 - this.field1198;
                }
            } else if (this.field1198 > var2) {
                this.field1211 = -1;
                if (this.field1208 == 0 || this.field1208 > this.field1198 - var2) {
                    this.field1208 = this.field1198 - var2;
                }
            } else {
                this.field1211 = 0;
            }
            return false;
        } else if (this.field1199 == Integer.MIN_VALUE) {
            this.field1199 = 0;
            this.field1198 = 0;
            this.field1209 = 0;
            this.field1201 = 0;
            this.method3540();
            return true;
        } else {
            this.method1190();
            return false;
        }
    }

    @ObfuscatedName("bo.at([B[IIIIIIILbo;)I")
    public static int method1227(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class60 arg8) {
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
        arg8.field1203 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("bo.as(I[B[IIIIIIIILbo;)I")
    public static int method1212(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class60 arg10) {
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
        arg10.field1203 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("bo.af([B[IIIIIIILbo;)I")
    public static int method1213(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class60 arg8) {
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
        arg8.field1203 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("bo.aa(I[B[IIIIIIIILbo;)I")
    public static int method1277(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class60 arg10) {
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
        arg10.field1203 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("bo.ad(II[B[IIIIIIILbo;II)I")
    public static int method1325(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class60 arg10, int arg11, int arg12) {
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
        arg10.field1203 = arg4;
        return arg5;
    }

    @ObfuscatedName("bo.ai(II[B[IIIIIIIILbo;II)I")
    public static int method1216(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class60 arg11, int arg12, int arg13) {
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
        arg11.field1203 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("bo.aw(II[B[IIIIIIILbo;II)I")
    public static int method1243(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class60 arg10, int arg11, int arg12) {
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
        arg10.field1203 = arg4;
        return arg5;
    }

    @ObfuscatedName("bo.ak(II[B[IIIIIIIILbo;II)I")
    public static int method1218(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class60 arg11, int arg12, int arg13) {
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
        arg11.field1203 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("bo.az([B[IIIIIIIILbo;)I")
    public static int method1219(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class60 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field1209 += (var14 - arg3) * arg9.field1210;
        arg9.field1198 += (var14 - arg3) * arg9.field1211;
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
        arg9.field1201 = var12 >> 2;
        arg9.field1203 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("bo.am(I[B[IIIIIIIIIILbo;)I")
    public static int method1271(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class60 arg12) {
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
        arg12.field1201 += (var19 - arg4) * arg12.field1197;
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
        arg12.field1198 = var16 >> 2;
        arg12.field1203 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("bo.bj([B[IIIIIIIILbo;)I")
    public static int method1202(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class60 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field1209 += (var14 - arg3) * arg9.field1210;
        arg9.field1198 += (var14 - arg3) * arg9.field1211;
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
        arg9.field1201 = var12 >> 2;
        arg9.field1203 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("bo.bf(I[B[IIIIIIIIIILbo;)I")
    public static int method1222(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class60 arg12) {
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
        arg12.field1201 += (var19 - arg4) * arg12.field1197;
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
        arg12.field1198 = var16 >> 2;
        arg12.field1203 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("bo.bb(II[B[IIIIIIIILbo;II)I")
    public static int method1242(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class60 arg11, int arg12, int arg13) {
        arg11.field1209 -= arg11.field1210 * arg5;
        arg11.field1198 -= arg11.field1211 * arg5;
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
        arg11.field1209 += arg11.field1210 * arg5;
        arg11.field1198 += arg11.field1211 * arg5;
        arg11.field1201 = arg6;
        arg11.field1203 = arg4;
        return arg5;
    }

    @ObfuscatedName("bo.bv(II[B[IIIIIIIIIILbo;II)I")
    public static int method1224(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class60 arg13, int arg14, int arg15) {
        arg13.field1201 -= arg13.field1197 * arg5;
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
        arg13.field1201 += arg13.field1197 * var27;
        arg13.field1209 = arg6;
        arg13.field1198 = arg7;
        arg13.field1203 = arg4;
        return var27;
    }

    @ObfuscatedName("bo.bl(II[B[IIIIIIIILbo;II)I")
    public static int method1225(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class60 arg11, int arg12, int arg13) {
        arg11.field1209 -= arg11.field1210 * arg5;
        arg11.field1198 -= arg11.field1211 * arg5;
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
        arg11.field1209 += arg11.field1210 * arg5;
        arg11.field1198 += arg11.field1211 * arg5;
        arg11.field1201 = arg6;
        arg11.field1203 = arg4;
        return arg5;
    }

    @ObfuscatedName("bo.bu(II[B[IIIIIIIIIILbo;II)I")
    public static int method1210(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class60 arg13, int arg14, int arg15) {
        arg13.field1201 -= arg13.field1197 * arg5;
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
        arg13.field1201 += arg13.field1197 * var26;
        arg13.field1209 = arg6;
        arg13.field1198 = arg7;
        arg13.field1203 = arg4;
        return var26;
    }
}
