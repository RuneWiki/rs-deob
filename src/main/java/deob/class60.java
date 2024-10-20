package deob;

@ObfuscatedName("bd")
public class class60 extends class62 {

    @ObfuscatedName("bd.n")
    public int field1196;

    @ObfuscatedName("bd.d")
    public int field1192;

    @ObfuscatedName("bd.z")
    public int field1182;

    @ObfuscatedName("bd.y")
    public int field1185;

    @ObfuscatedName("bd.e")
    public int field1186;

    @ObfuscatedName("bd.g")
    public int field1187;

    @ObfuscatedName("bd.f")
    public int field1188;

    @ObfuscatedName("bd.m")
    public int field1189;

    @ObfuscatedName("bd.a")
    public int field1184;

    @ObfuscatedName("bd.h")
    public int field1191;

    @ObfuscatedName("bd.l")
    public boolean field1195;

    @ObfuscatedName("bd.u")
    public int field1193;

    @ObfuscatedName("bd.q")
    public int field1194;

    @ObfuscatedName("bd.k")
    public int field1190;

    @ObfuscatedName("bd.x")
    public int field1183;

    @ObfuscatedName("bd.n(II)I")
    public static int method1183(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("bd.d(II)I")
    public static int method1259(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("bd.ay()I")
    public int method1159() {
        int var1 = this.field1186 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field1189 == 0) {
            var2 -= this.field1196 * var2 / (((class58) this.field1200).field1168.length << 8);
        } else if (this.field1189 >= 0) {
            var2 -= this.field1184 * var2 / ((class58) this.field1200).field1168.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    public class60(class58 arg0, int arg1, int arg2) {
        this.field1200 = arg0;
        this.field1184 = arg0.field1166;
        this.field1191 = arg0.field1165;
        this.field1195 = arg0.field1169;
        this.field1192 = arg1;
        this.field1182 = arg2;
        this.field1185 = 8192;
        this.field1196 = 0;
        this.method1161();
    }

    public class60(class58 arg0, int arg1, int arg2, int arg3) {
        this.field1200 = arg0;
        this.field1184 = arg0.field1166;
        this.field1191 = arg0.field1165;
        this.field1195 = arg0.field1169;
        this.field1192 = arg1;
        this.field1182 = arg2;
        this.field1185 = arg3;
        this.field1196 = 0;
        this.method1161();
    }

    @ObfuscatedName("bd.z(Lba;II)Lbd;")
    public static class60 method1160(class58 arg0, int arg1, int arg2) {
        return arg0.field1168 == null || arg0.field1168.length == 0 ? null : new class60(arg0, (int) ((long) arg0.field1167 * 256L * (long) arg1 / (long) (Statics.field3058 * 100)), arg2 << 6);
    }

    @ObfuscatedName("bd.y(Lba;III)Lbd;")
    public static class60 method1216(class58 arg0, int arg1, int arg2, int arg3) {
        return arg0.field1168 == null || arg0.field1168.length == 0 ? null : new class60(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("bd.e()V")
    public void method1161() {
        this.field1186 = this.field1182;
        this.field1187 = method1183(this.field1182, this.field1185);
        this.field1188 = method1259(this.field1182, this.field1185);
    }

    @ObfuscatedName("bd.h(I)V")
    public synchronized void method1162(int arg0) {
        this.field1189 = arg0;
    }

    @ObfuscatedName("bd.u(I)V")
    public synchronized void method1163(int arg0) {
        this.method1287(arg0 << 6, this.method1167());
    }

    @ObfuscatedName("bd.q(I)V")
    public synchronized void method1164(int arg0) {
        this.method1287(arg0, this.method1167());
    }

    @ObfuscatedName("bd.k(II)V")
    public synchronized void method1287(int arg0, int arg1) {
        this.field1182 = arg0;
        this.field1185 = arg1;
        this.field1193 = 0;
        this.method1161();
    }

    @ObfuscatedName("bd.x()I")
    public synchronized int method1166() {
        return this.field1182 == Integer.MIN_VALUE ? 0 : this.field1182;
    }

    @ObfuscatedName("bd.r()I")
    public synchronized int method1167() {
        return this.field1185 < 0 ? -1 : this.field1185;
    }

    @ObfuscatedName("bd.j(I)V")
    public synchronized void method1254(int arg0) {
        int var2 = ((class58) this.field1200).field1168.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field1196 = arg0;
    }

    @ObfuscatedName("bd.s(Z)V")
    public synchronized void method1248(boolean arg0) {
        this.field1192 = (this.field1192 >>> 31) + (this.field1192 ^ this.field1192 >> 31);
        if (arg0) {
            this.field1192 = -this.field1192;
        }
    }

    @ObfuscatedName("bd.v()V")
    public void method1170() {
        if (this.field1193 == 0) {
            return;
        }
        if (this.field1182 == Integer.MIN_VALUE) {
            this.field1182 = 0;
        }
        this.field1193 = 0;
        this.method1161();
    }

    @ObfuscatedName("bd.c(II)V")
    public synchronized void method1171(int arg0, int arg1) {
        this.method1172(arg0, arg1, this.method1167());
    }

    @ObfuscatedName("bd.p(III)V")
    public synchronized void method1172(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method1287(arg1, arg2);
            return;
        }
        int var4 = method1183(arg1, arg2);
        int var5 = method1259(arg1, arg2);
        if (this.field1187 == var4 && this.field1188 == var5) {
            this.field1193 = 0;
            return;
        }
        int var6 = arg1 - this.field1186;
        if (this.field1186 - arg1 > var6) {
            var6 = this.field1186 - arg1;
        }
        if (var4 - this.field1187 > var6) {
            var6 = var4 - this.field1187;
        }
        if (this.field1187 - var4 > var6) {
            var6 = this.field1187 - var4;
        }
        if (var5 - this.field1188 > var6) {
            var6 = var5 - this.field1188;
        }
        if (this.field1188 - var5 > var6) {
            var6 = this.field1188 - var5;
        }
        if (arg0 > var6) {
            arg0 = var6;
        }
        this.field1193 = arg0;
        this.field1182 = arg1;
        this.field1185 = arg2;
        this.field1194 = (arg1 - this.field1186) / arg0;
        this.field1190 = (var4 - this.field1187) / arg0;
        this.field1183 = (var5 - this.field1188) / arg0;
    }

    @ObfuscatedName("bd.o(I)V")
    public synchronized void method1173(int arg0) {
        if (arg0 == 0) {
            this.method1164(0);
            this.method3562();
        } else if (this.field1187 == 0 && this.field1188 == 0) {
            this.field1193 = 0;
            this.field1182 = 0;
            this.field1186 = 0;
            this.method3562();
        } else {
            int var2 = -this.field1186;
            if (this.field1186 > var2) {
                var2 = this.field1186;
            }
            if (-this.field1187 > var2) {
                var2 = -this.field1187;
            }
            if (this.field1187 > var2) {
                var2 = this.field1187;
            }
            if (-this.field1188 > var2) {
                var2 = -this.field1188;
            }
            if (this.field1188 > var2) {
                var2 = this.field1188;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field1193 = arg0;
            this.field1182 = Integer.MIN_VALUE;
            this.field1194 = -this.field1186 / arg0;
            this.field1190 = -this.field1187 / arg0;
            this.field1183 = -this.field1188 / arg0;
        }
    }

    @ObfuscatedName("bd.b(I)V")
    public synchronized void method1229(int arg0) {
        if (this.field1192 < 0) {
            this.field1192 = -arg0;
        } else {
            this.field1192 = arg0;
        }
    }

    @ObfuscatedName("bd.t()I")
    public synchronized int method1175() {
        return this.field1192 < 0 ? -this.field1192 : this.field1192;
    }

    @ObfuscatedName("bd.w()Z")
    public boolean method1176() {
        return this.field1196 < 0 || this.field1196 >= ((class58) this.field1200).field1168.length << 8;
    }

    @ObfuscatedName("bd.i()Z")
    public boolean method1214() {
        return this.field1193 != 0;
    }

    @ObfuscatedName("bd.g()Lbu;")
    public class62 method1020() {
        return null;
    }

    @ObfuscatedName("bd.f()Lbu;")
    public class62 method1046() {
        return null;
    }

    @ObfuscatedName("bd.m()I")
    public int method1009() {
        return this.field1182 == 0 && this.field1193 == 0 ? 0 : 1;
    }

    @ObfuscatedName("bd.a([III)V")
    public synchronized void method1012(int[] arg0, int arg1, int arg2) {
        if (this.field1182 == 0 && this.field1193 == 0) {
            this.method1014(arg2);
            return;
        }
        class58 var4 = (class58) this.field1200;
        int var5 = this.field1184 << 8;
        int var6 = this.field1191 << 8;
        int var7 = var4.field1168.length << 8;
        int var8 = var6 - var5;
        if (var8 <= 0) {
            this.field1189 = 0;
        }
        int var9 = arg1;
        int var10 = arg1 + arg2;
        if (this.field1196 < 0) {
            if (this.field1192 <= 0) {
                this.method1170();
                this.method3562();
                return;
            }
            this.field1196 = 0;
        }
        if (this.field1196 >= var7) {
            if (this.field1192 >= 0) {
                this.method1170();
                this.method3562();
                return;
            }
            this.field1196 = var7 - 1;
        }
        if (this.field1189 >= 0) {
            if (this.field1189 > 0) {
                if (this.field1195) {
                    label131: {
                        if (this.field1192 < 0) {
                            var9 = this.method1181(arg0, arg1, var5, var10, var4.field1168[this.field1184]);
                            if (this.field1196 >= var5) {
                                return;
                            }
                            this.field1196 = var5 + var5 - 1 - this.field1196;
                            this.field1192 = -this.field1192;
                            if (--this.field1189 == 0) {
                                break label131;
                            }
                        }
                        do {
                            var9 = this.method1180(arg0, var9, var6, var10, var4.field1168[this.field1191 - 1]);
                            if (this.field1196 < var6) {
                                return;
                            }
                            this.field1196 = var6 + var6 - 1 - this.field1196;
                            this.field1192 = -this.field1192;
                            if (--this.field1189 == 0) {
                                break;
                            }
                            var9 = this.method1181(arg0, var9, var5, var10, var4.field1168[this.field1184]);
                            if (this.field1196 >= var5) {
                                return;
                            }
                            this.field1196 = var5 + var5 - 1 - this.field1196;
                            this.field1192 = -this.field1192;
                        } while (--this.field1189 != 0);
                    }
                } else if (this.field1192 < 0) {
                    while (true) {
                        var9 = this.method1181(arg0, var9, var5, var10, var4.field1168[this.field1191 - 1]);
                        if (this.field1196 >= var5) {
                            return;
                        }
                        int var12 = (var6 - 1 - this.field1196) / var8;
                        if (var12 >= this.field1189) {
                            this.field1196 += this.field1189 * var8;
                            this.field1189 = 0;
                            break;
                        }
                        this.field1196 += var8 * var12;
                        this.field1189 -= var12;
                    }
                } else {
                    while (true) {
                        var9 = this.method1180(arg0, var9, var6, var10, var4.field1168[this.field1184]);
                        if (this.field1196 < var6) {
                            return;
                        }
                        int var13 = (this.field1196 - var5) / var8;
                        if (var13 >= this.field1189) {
                            this.field1196 -= this.field1189 * var8;
                            this.field1189 = 0;
                            break;
                        }
                        this.field1196 -= var8 * var13;
                        this.field1189 -= var13;
                    }
                }
            }
            if (this.field1192 < 0) {
                this.method1181(arg0, var9, 0, var10, 0);
                if (this.field1196 < 0) {
                    this.field1196 = -1;
                    this.method1170();
                    this.method3562();
                }
            } else {
                this.method1180(arg0, var9, var7, var10, 0);
                if (this.field1196 >= var7) {
                    this.field1196 = var7;
                    this.method1170();
                    this.method3562();
                }
            }
        } else if (this.field1195) {
            if (this.field1192 < 0) {
                var9 = this.method1181(arg0, arg1, var5, var10, var4.field1168[this.field1184]);
                if (this.field1196 >= var5) {
                    return;
                }
                this.field1196 = var5 + var5 - 1 - this.field1196;
                this.field1192 = -this.field1192;
            }
            while (true) {
                int var11 = this.method1180(arg0, var9, var6, var10, var4.field1168[this.field1191 - 1]);
                if (this.field1196 < var6) {
                    return;
                }
                this.field1196 = var6 + var6 - 1 - this.field1196;
                this.field1192 = -this.field1192;
                var9 = this.method1181(arg0, var11, var5, var10, var4.field1168[this.field1184]);
                if (this.field1196 >= var5) {
                    return;
                }
                this.field1196 = var5 + var5 - 1 - this.field1196;
                this.field1192 = -this.field1192;
            }
        } else if (this.field1192 < 0) {
            while (true) {
                var9 = this.method1181(arg0, var9, var5, var10, var4.field1168[this.field1191 - 1]);
                if (this.field1196 >= var5) {
                    return;
                }
                this.field1196 = var6 - 1 - (var6 - 1 - this.field1196) % var8;
            }
        } else {
            while (true) {
                var9 = this.method1180(arg0, var9, var6, var10, var4.field1168[this.field1184]);
                if (this.field1196 < var6) {
                    return;
                }
                this.field1196 = (this.field1196 - var5) % var8 + var5;
            }
        }
    }

    @ObfuscatedName("bd.l(I)V")
    public synchronized void method1014(int arg0) {
        if (this.field1193 > 0) {
            if (arg0 >= this.field1193) {
                if (this.field1182 == Integer.MIN_VALUE) {
                    this.field1182 = 0;
                    this.field1188 = 0;
                    this.field1187 = 0;
                    this.field1186 = 0;
                    this.method3562();
                    arg0 = this.field1193;
                }
                this.field1193 = 0;
                this.method1161();
            } else {
                this.field1186 += this.field1194 * arg0;
                this.field1187 += this.field1190 * arg0;
                this.field1188 += this.field1183 * arg0;
                this.field1193 -= arg0;
            }
        }
        class58 var2 = (class58) this.field1200;
        int var3 = this.field1184 << 8;
        int var4 = this.field1191 << 8;
        int var5 = var2.field1168.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field1189 = 0;
        }
        if (this.field1196 < 0) {
            if (this.field1192 <= 0) {
                this.method1170();
                this.method3562();
                return;
            }
            this.field1196 = 0;
        }
        if (this.field1196 >= var5) {
            if (this.field1192 >= 0) {
                this.method1170();
                this.method3562();
                return;
            }
            this.field1196 = var5 - 1;
        }
        this.field1196 += this.field1192 * arg0;
        if (this.field1189 >= 0) {
            if (this.field1189 > 0) {
                if (this.field1195) {
                    label121: {
                        if (this.field1192 < 0) {
                            if (this.field1196 >= var3) {
                                return;
                            }
                            this.field1196 = var3 + var3 - 1 - this.field1196;
                            this.field1192 = -this.field1192;
                            if (--this.field1189 == 0) {
                                break label121;
                            }
                        }
                        do {
                            if (this.field1196 < var4) {
                                return;
                            }
                            this.field1196 = var4 + var4 - 1 - this.field1196;
                            this.field1192 = -this.field1192;
                            if (--this.field1189 == 0) {
                                break;
                            }
                            if (this.field1196 >= var3) {
                                return;
                            }
                            this.field1196 = var3 + var3 - 1 - this.field1196;
                            this.field1192 = -this.field1192;
                        } while (--this.field1189 != 0);
                    }
                } else {
                    label153: {
                        if (this.field1192 < 0) {
                            if (this.field1196 >= var3) {
                                return;
                            }
                            int var7 = (var4 - 1 - this.field1196) / var6;
                            if (var7 >= this.field1189) {
                                this.field1196 += this.field1189 * var6;
                                this.field1189 = 0;
                                break label153;
                            }
                            this.field1196 += var6 * var7;
                            this.field1189 -= var7;
                        } else if (this.field1196 >= var4) {
                            int var8 = (this.field1196 - var3) / var6;
                            if (var8 >= this.field1189) {
                                this.field1196 -= this.field1189 * var6;
                                this.field1189 = 0;
                                break label153;
                            }
                            this.field1196 -= var6 * var8;
                            this.field1189 -= var8;
                        } else {
                            return;
                        }
                        return;
                    }
                }
            }
            if (this.field1192 < 0) {
                if (this.field1196 < 0) {
                    this.field1196 = -1;
                    this.method1170();
                    this.method3562();
                }
            } else if (this.field1196 >= var5) {
                this.field1196 = var5;
                this.method1170();
                this.method3562();
            }
        } else if (this.field1195) {
            if (this.field1192 < 0) {
                if (this.field1196 >= var3) {
                    return;
                }
                this.field1196 = var3 + var3 - 1 - this.field1196;
                this.field1192 = -this.field1192;
            }
            while (this.field1196 >= var4) {
                this.field1196 = var4 + var4 - 1 - this.field1196;
                this.field1192 = -this.field1192;
                if (this.field1196 >= var3) {
                    return;
                }
                this.field1196 = var3 + var3 - 1 - this.field1196;
                this.field1192 = -this.field1192;
            }
        } else if (this.field1192 < 0) {
            if (this.field1196 >= var3) {
                return;
            }
            this.field1196 = var4 - 1 - (var4 - 1 - this.field1196) % var6;
        } else if (this.field1196 >= var4) {
            this.field1196 = (this.field1196 - var3) % var6 + var3;
        } else {
            return;
        }
    }

    @ObfuscatedName("bd.an([IIIII)I")
    public int method1180(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1193 > 0) {
                int var6 = this.field1193 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1193 += arg1;
                if (this.field1192 == 256 && (this.field1196 & 0xFF) == 0) {
                    if (Statics.field619) {
                        arg1 = method1199(0, ((class58) this.field1200).field1168, arg0, this.field1196, arg1, this.field1187, this.field1188, this.field1190, this.field1183, 0, var6, arg2, this);
                    } else {
                        arg1 = method1198(((class58) this.field1200).field1168, arg0, this.field1196, arg1, this.field1186, this.field1194, 0, var6, arg2, this);
                    }
                } else if (Statics.field619) {
                    arg1 = method1195(0, 0, ((class58) this.field1200).field1168, arg0, this.field1196, arg1, this.field1187, this.field1188, this.field1190, this.field1183, 0, var6, arg2, this, this.field1192, arg4);
                } else {
                    arg1 = method1194(0, 0, ((class58) this.field1200).field1168, arg0, this.field1196, arg1, this.field1186, this.field1194, 0, var6, arg2, this, this.field1192, arg4);
                }
                this.field1193 -= arg1;
                if (this.field1193 != 0) {
                    return arg1;
                }
                if (!this.method1268()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1192 == 256 && (this.field1196 & 0xFF) == 0) {
                if (Statics.field619) {
                    return method1182(0, ((class58) this.field1200).field1168, arg0, this.field1196, arg1, this.field1187, this.field1188, 0, arg3, arg2, this);
                }
                return method1278(((class58) this.field1200).field1168, arg0, this.field1196, arg1, this.field1186, 0, arg3, arg2, this);
            }
            if (Statics.field619) {
                return method1288(0, 0, ((class58) this.field1200).field1168, arg0, this.field1196, arg1, this.field1187, this.field1188, 0, arg3, arg2, this, this.field1192, arg4);
            }
            return method1187(0, 0, ((class58) this.field1200).field1168, arg0, this.field1196, arg1, this.field1186, 0, arg3, arg2, this, this.field1192, arg4);
        }
    }

    @ObfuscatedName("bd.aw([IIIII)I")
    public int method1181(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1193 > 0) {
                int var6 = this.field1193 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1193 += arg1;
                if (this.field1192 == -256 && (this.field1196 & 0xFF) == 0) {
                    if (Statics.field619) {
                        arg1 = method1193(0, ((class58) this.field1200).field1168, arg0, this.field1196, arg1, this.field1187, this.field1188, this.field1190, this.field1183, 0, var6, arg2, this);
                    } else {
                        arg1 = method1255(((class58) this.field1200).field1168, arg0, this.field1196, arg1, this.field1186, this.field1194, 0, var6, arg2, this);
                    }
                } else if (Statics.field619) {
                    arg1 = method1197(0, 0, ((class58) this.field1200).field1168, arg0, this.field1196, arg1, this.field1187, this.field1188, this.field1190, this.field1183, 0, var6, arg2, this, this.field1192, arg4);
                } else {
                    arg1 = method1196(0, 0, ((class58) this.field1200).field1168, arg0, this.field1196, arg1, this.field1186, this.field1194, 0, var6, arg2, this, this.field1192, arg4);
                }
                this.field1193 -= arg1;
                if (this.field1193 != 0) {
                    return arg1;
                }
                if (!this.method1268()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1192 == -256 && (this.field1196 & 0xFF) == 0) {
                if (Statics.field619) {
                    return method1186(0, ((class58) this.field1200).field1168, arg0, this.field1196, arg1, this.field1187, this.field1188, 0, arg3, arg2, this);
                }
                return method1185(((class58) this.field1200).field1168, arg0, this.field1196, arg1, this.field1186, 0, arg3, arg2, this);
            }
            if (Statics.field619) {
                return method1190(0, 0, ((class58) this.field1200).field1168, arg0, this.field1196, arg1, this.field1187, this.field1188, 0, arg3, arg2, this, this.field1192, arg4);
            }
            return method1189(0, 0, ((class58) this.field1200).field1168, arg0, this.field1196, arg1, this.field1186, 0, arg3, arg2, this, this.field1192, arg4);
        }
    }

    @ObfuscatedName("bd.ah()Z")
    public boolean method1268() {
        int var1 = this.field1182;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method1183(var1, this.field1185);
            var2 = method1259(var1, this.field1185);
        }
        if (this.field1186 != var1 || this.field1187 != var3 || this.field1188 != var2) {
            if (this.field1186 < var1) {
                this.field1194 = 1;
                this.field1193 = var1 - this.field1186;
            } else if (this.field1186 > var1) {
                this.field1194 = -1;
                this.field1193 = this.field1186 - var1;
            } else {
                this.field1194 = 0;
            }
            if (this.field1187 < var3) {
                this.field1190 = 1;
                if (this.field1193 == 0 || this.field1193 > var3 - this.field1187) {
                    this.field1193 = var3 - this.field1187;
                }
            } else if (this.field1187 > var3) {
                this.field1190 = -1;
                if (this.field1193 == 0 || this.field1193 > this.field1187 - var3) {
                    this.field1193 = this.field1187 - var3;
                }
            } else {
                this.field1190 = 0;
            }
            if (this.field1188 < var2) {
                this.field1183 = 1;
                if (this.field1193 == 0 || this.field1193 > var2 - this.field1188) {
                    this.field1193 = var2 - this.field1188;
                }
            } else if (this.field1188 > var2) {
                this.field1183 = -1;
                if (this.field1193 == 0 || this.field1193 > this.field1188 - var2) {
                    this.field1193 = this.field1188 - var2;
                }
            } else {
                this.field1183 = 0;
            }
            return false;
        } else if (this.field1182 == Integer.MIN_VALUE) {
            this.field1182 = 0;
            this.field1188 = 0;
            this.field1187 = 0;
            this.field1186 = 0;
            this.method3562();
            return true;
        } else {
            this.method1161();
            return false;
        }
    }

    @ObfuscatedName("bd.aq([B[IIIIIIILbd;)I")
    public static int method1278(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class60 arg8) {
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
        arg8.field1196 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("bd.am(I[B[IIIIIIIILbd;)I")
    public static int method1182(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class60 arg10) {
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
        arg10.field1196 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("bd.aj([B[IIIIIIILbd;)I")
    public static int method1185(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class60 arg8) {
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
        arg8.field1196 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("bd.ag(I[B[IIIIIIIILbd;)I")
    public static int method1186(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class60 arg10) {
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
        arg10.field1196 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("bd.ap(II[B[IIIIIIILbd;II)I")
    public static int method1187(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class60 arg10, int arg11, int arg12) {
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
        arg10.field1196 = arg4;
        return arg5;
    }

    @ObfuscatedName("bd.af(II[B[IIIIIIIILbd;II)I")
    public static int method1288(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class60 arg11, int arg12, int arg13) {
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
        arg11.field1196 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("bd.au(II[B[IIIIIIILbd;II)I")
    public static int method1189(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class60 arg10, int arg11, int arg12) {
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
        arg10.field1196 = arg4;
        return arg5;
    }

    @ObfuscatedName("bd.av(II[B[IIIIIIIILbd;II)I")
    public static int method1190(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class60 arg11, int arg12, int arg13) {
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
        arg11.field1196 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("bd.bs([B[IIIIIIIILbd;)I")
    public static int method1198(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class60 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field1187 += (var14 - arg3) * arg9.field1190;
        arg9.field1188 += (var14 - arg3) * arg9.field1183;
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
        arg9.field1186 = var12 >> 2;
        arg9.field1196 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("bd.bo(I[B[IIIIIIIIIILbd;)I")
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
        arg12.field1186 += (var19 - arg4) * arg12.field1194;
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
        arg12.field1187 = var15 >> 2;
        arg12.field1188 = var16 >> 2;
        arg12.field1196 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("bd.bw([B[IIIIIIIILbd;)I")
    public static int method1255(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class60 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field1187 += (var14 - arg3) * arg9.field1190;
        arg9.field1188 += (var14 - arg3) * arg9.field1183;
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
        arg9.field1186 = var12 >> 2;
        arg9.field1196 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("bd.bm(I[B[IIIIIIIIIILbd;)I")
    public static int method1193(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class60 arg12) {
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
        arg12.field1186 += (var19 - arg4) * arg12.field1194;
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
        arg12.field1187 = var15 >> 2;
        arg12.field1188 = var16 >> 2;
        arg12.field1196 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("bd.bj(II[B[IIIIIIIILbd;II)I")
    public static int method1194(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class60 arg11, int arg12, int arg13) {
        arg11.field1187 -= arg11.field1190 * arg5;
        arg11.field1188 -= arg11.field1183 * arg5;
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
        arg11.field1187 += arg11.field1190 * arg5;
        arg11.field1188 += arg11.field1183 * arg5;
        arg11.field1186 = arg6;
        arg11.field1196 = arg4;
        return arg5;
    }

    @ObfuscatedName("bd.ba(II[B[IIIIIIIIIILbd;II)I")
    public static int method1195(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class60 arg13, int arg14, int arg15) {
        arg13.field1186 -= arg13.field1194 * arg5;
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
        arg13.field1186 += arg13.field1194 * var27;
        arg13.field1187 = arg6;
        arg13.field1188 = arg7;
        arg13.field1196 = arg4;
        return var27;
    }

    @ObfuscatedName("bd.br(II[B[IIIIIIIILbd;II)I")
    public static int method1196(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class60 arg11, int arg12, int arg13) {
        arg11.field1187 -= arg11.field1190 * arg5;
        arg11.field1188 -= arg11.field1183 * arg5;
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
        arg11.field1187 += arg11.field1190 * arg5;
        arg11.field1188 += arg11.field1183 * arg5;
        arg11.field1186 = arg6;
        arg11.field1196 = arg4;
        return arg5;
    }

    @ObfuscatedName("bd.bd(II[B[IIIIIIIIIILbd;II)I")
    public static int method1197(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class60 arg13, int arg14, int arg15) {
        arg13.field1186 -= arg13.field1194 * arg5;
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
        arg13.field1186 += arg13.field1194 * var26;
        arg13.field1187 = arg6;
        arg13.field1188 = arg7;
        arg13.field1196 = arg4;
        return var26;
    }
}
