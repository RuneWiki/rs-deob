package deob;

@ObfuscatedName("bb")
public class class60 extends class62 {

    @ObfuscatedName("bb.b")
    public int field1189;

    @ObfuscatedName("bb.e")
    public int field1183;

    @ObfuscatedName("bb.a")
    public int field1185;

    @ObfuscatedName("bb.k")
    public int field1186;

    @ObfuscatedName("bb.p")
    public int field1187;

    @ObfuscatedName("bb.l")
    public int field1184;

    @ObfuscatedName("bb.u")
    public int field1193;

    @ObfuscatedName("bb.o")
    public int field1188;

    @ObfuscatedName("bb.m")
    public int field1190;

    @ObfuscatedName("bb.q")
    public int field1192;

    @ObfuscatedName("bb.v")
    public boolean field1194;

    @ObfuscatedName("bb.n")
    public int field1191;

    @ObfuscatedName("bb.z")
    public int field1195;

    @ObfuscatedName("bb.r")
    public int field1196;

    @ObfuscatedName("bb.i")
    public int field1197;

    @ObfuscatedName("bb.b(II)I")
    public static int method1136(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("bb.e(II)I")
    public static int method1159(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("bb.am()I")
    public int method1119() {
        int var1 = this.field1187 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field1188 == 0) {
            var2 -= this.field1189 * var2 / (((class58) this.field1201).field1168.length << 8);
        } else if (this.field1188 >= 0) {
            var2 -= this.field1190 * var2 / ((class58) this.field1201).field1168.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    public class60(class58 arg0, int arg1, int arg2) {
        this.field1201 = arg0;
        this.field1190 = arg0.field1169;
        this.field1192 = arg0.field1166;
        this.field1194 = arg0.field1170;
        this.field1183 = arg1;
        this.field1185 = arg2;
        this.field1186 = 8192;
        this.field1189 = 0;
        this.method1121();
    }

    public class60(class58 arg0, int arg1, int arg2, int arg3) {
        this.field1201 = arg0;
        this.field1190 = arg0.field1169;
        this.field1192 = arg0.field1166;
        this.field1194 = arg0.field1170;
        this.field1183 = arg1;
        this.field1185 = arg2;
        this.field1186 = arg3;
        this.field1189 = 0;
        this.method1121();
    }

    @ObfuscatedName("bb.a(Lbe;II)Lbb;")
    public static class60 method1203(class58 arg0, int arg1, int arg2) {
        return arg0.field1168 == null || arg0.field1168.length == 0 ? null : new class60(arg0, (int) ((long) arg0.field1167 * 256L * (long) arg1 / (long) (Statics.field1124 * 100)), arg2 << 6);
    }

    @ObfuscatedName("bb.k(Lbe;III)Lbb;")
    public static class60 method1169(class58 arg0, int arg1, int arg2, int arg3) {
        return arg0.field1168 == null || arg0.field1168.length == 0 ? null : new class60(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("bb.p()V")
    public void method1121() {
        this.field1187 = this.field1185;
        this.field1184 = method1136(this.field1185, this.field1186);
        this.field1193 = method1159(this.field1185, this.field1186);
    }

    @ObfuscatedName("bb.q(I)V")
    public synchronized void method1122(int arg0) {
        this.field1188 = arg0;
    }

    @ObfuscatedName("bb.n(I)V")
    public synchronized void method1151(int arg0) {
        this.method1125(arg0 << 6, this.method1137());
    }

    @ObfuscatedName("bb.z(I)V")
    public synchronized void method1124(int arg0) {
        this.method1125(arg0, this.method1137());
    }

    @ObfuscatedName("bb.r(II)V")
    public synchronized void method1125(int arg0, int arg1) {
        this.field1185 = arg0;
        this.field1186 = arg1;
        this.field1191 = 0;
        this.method1121();
    }

    @ObfuscatedName("bb.i()I")
    public synchronized int method1135() {
        return this.field1185 == Integer.MIN_VALUE ? 0 : this.field1185;
    }

    @ObfuscatedName("bb.s()I")
    public synchronized int method1137() {
        return this.field1186 < 0 ? -1 : this.field1186;
    }

    @ObfuscatedName("bb.c(I)V")
    public synchronized void method1127(int arg0) {
        int var2 = ((class58) this.field1201).field1168.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field1189 = arg0;
    }

    @ObfuscatedName("bb.t(Z)V")
    public synchronized void method1128(boolean arg0) {
        this.field1183 = (this.field1183 >>> 31) + (this.field1183 ^ this.field1183 >> 31);
        if (arg0) {
            this.field1183 = -this.field1183;
        }
    }

    @ObfuscatedName("bb.h()V")
    public void method1129() {
        if (this.field1191 == 0) {
            return;
        }
        if (this.field1185 == Integer.MIN_VALUE) {
            this.field1185 = 0;
        }
        this.field1191 = 0;
        this.method1121();
    }

    @ObfuscatedName("bb.w(II)V")
    public synchronized void method1130(int arg0, int arg1) {
        this.method1131(arg0, arg1, this.method1137());
    }

    @ObfuscatedName("bb.aw(III)V")
    public synchronized void method1131(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method1125(arg1, arg2);
            return;
        }
        int var4 = method1136(arg1, arg2);
        int var5 = method1159(arg1, arg2);
        if (this.field1184 == var4 && this.field1193 == var5) {
            this.field1191 = 0;
            return;
        }
        int var6 = arg1 - this.field1187;
        if (this.field1187 - arg1 > var6) {
            var6 = this.field1187 - arg1;
        }
        if (var4 - this.field1184 > var6) {
            var6 = var4 - this.field1184;
        }
        if (this.field1184 - var4 > var6) {
            var6 = this.field1184 - var4;
        }
        if (var5 - this.field1193 > var6) {
            var6 = var5 - this.field1193;
        }
        if (this.field1193 - var5 > var6) {
            var6 = this.field1193 - var5;
        }
        if (arg0 > var6) {
            arg0 = var6;
        }
        this.field1191 = arg0;
        this.field1185 = arg1;
        this.field1186 = arg2;
        this.field1195 = (arg1 - this.field1187) / arg0;
        this.field1196 = (var4 - this.field1184) / arg0;
        this.field1197 = (var5 - this.field1193) / arg0;
    }

    @ObfuscatedName("bb.ac(I)V")
    public synchronized void method1132(int arg0) {
        if (arg0 == 0) {
            this.method1124(0);
            this.method3414();
        } else if (this.field1184 == 0 && this.field1193 == 0) {
            this.field1191 = 0;
            this.field1185 = 0;
            this.field1187 = 0;
            this.method3414();
        } else {
            int var2 = -this.field1187;
            if (this.field1187 > var2) {
                var2 = this.field1187;
            }
            if (-this.field1184 > var2) {
                var2 = -this.field1184;
            }
            if (this.field1184 > var2) {
                var2 = this.field1184;
            }
            if (-this.field1193 > var2) {
                var2 = -this.field1193;
            }
            if (this.field1193 > var2) {
                var2 = this.field1193;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field1191 = arg0;
            this.field1185 = Integer.MIN_VALUE;
            this.field1195 = -this.field1187 / arg0;
            this.field1196 = -this.field1184 / arg0;
            this.field1197 = -this.field1193 / arg0;
        }
    }

    @ObfuscatedName("bb.ap(I)V")
    public synchronized void method1133(int arg0) {
        if (this.field1183 < 0) {
            this.field1183 = -arg0;
        } else {
            this.field1183 = arg0;
        }
    }

    @ObfuscatedName("bb.ak()I")
    public synchronized int method1134() {
        return this.field1183 < 0 ? -this.field1183 : this.field1183;
    }

    @ObfuscatedName("bb.at()Z")
    public boolean method1139() {
        return this.field1189 < 0 || this.field1189 >= ((class58) this.field1201).field1168.length << 8;
    }

    @ObfuscatedName("bb.au()Z")
    public boolean method1170() {
        return this.field1191 != 0;
    }

    @ObfuscatedName("bb.l()Lbk;")
    public class62 method976() {
        return null;
    }

    @ObfuscatedName("bb.u()Lbk;")
    public class62 method984() {
        return null;
    }

    @ObfuscatedName("bb.o()I")
    public int method978() {
        return this.field1185 == 0 && this.field1191 == 0 ? 0 : 1;
    }

    @ObfuscatedName("bb.m([III)V")
    public synchronized void method979(int[] arg0, int arg1, int arg2) {
        if (this.field1185 == 0 && this.field1191 == 0) {
            this.method981(arg2);
            return;
        }
        class58 var4 = (class58) this.field1201;
        int var5 = this.field1190 << 8;
        int var6 = this.field1192 << 8;
        int var7 = var4.field1168.length << 8;
        int var8 = var6 - var5;
        if (var8 <= 0) {
            this.field1188 = 0;
        }
        int var9 = arg1;
        int var10 = arg1 + arg2;
        if (this.field1189 < 0) {
            if (this.field1183 <= 0) {
                this.method1129();
                this.method3414();
                return;
            }
            this.field1189 = 0;
        }
        if (this.field1189 >= var7) {
            if (this.field1183 >= 0) {
                this.method1129();
                this.method3414();
                return;
            }
            this.field1189 = var7 - 1;
        }
        if (this.field1188 >= 0) {
            if (this.field1188 > 0) {
                if (this.field1194) {
                    label131: {
                        if (this.field1183 < 0) {
                            var9 = this.method1141(arg0, arg1, var5, var10, var4.field1168[this.field1190]);
                            if (this.field1189 >= var5) {
                                return;
                            }
                            this.field1189 = var5 + var5 - 1 - this.field1189;
                            this.field1183 = -this.field1183;
                            if (--this.field1188 == 0) {
                                break label131;
                            }
                        }
                        do {
                            var9 = this.method1198(arg0, var9, var6, var10, var4.field1168[this.field1192 - 1]);
                            if (this.field1189 < var6) {
                                return;
                            }
                            this.field1189 = var6 + var6 - 1 - this.field1189;
                            this.field1183 = -this.field1183;
                            if (--this.field1188 == 0) {
                                break;
                            }
                            var9 = this.method1141(arg0, var9, var5, var10, var4.field1168[this.field1190]);
                            if (this.field1189 >= var5) {
                                return;
                            }
                            this.field1189 = var5 + var5 - 1 - this.field1189;
                            this.field1183 = -this.field1183;
                        } while (--this.field1188 != 0);
                    }
                } else if (this.field1183 < 0) {
                    while (true) {
                        var9 = this.method1141(arg0, var9, var5, var10, var4.field1168[this.field1192 - 1]);
                        if (this.field1189 >= var5) {
                            return;
                        }
                        int var12 = (var6 - 1 - this.field1189) / var8;
                        if (var12 >= this.field1188) {
                            this.field1189 += this.field1188 * var8;
                            this.field1188 = 0;
                            break;
                        }
                        this.field1189 += var8 * var12;
                        this.field1188 -= var12;
                    }
                } else {
                    while (true) {
                        var9 = this.method1198(arg0, var9, var6, var10, var4.field1168[this.field1190]);
                        if (this.field1189 < var6) {
                            return;
                        }
                        int var13 = (this.field1189 - var5) / var8;
                        if (var13 >= this.field1188) {
                            this.field1189 -= this.field1188 * var8;
                            this.field1188 = 0;
                            break;
                        }
                        this.field1189 -= var8 * var13;
                        this.field1188 -= var13;
                    }
                }
            }
            if (this.field1183 < 0) {
                this.method1141(arg0, var9, 0, var10, 0);
                if (this.field1189 < 0) {
                    this.field1189 = -1;
                    this.method1129();
                    this.method3414();
                }
            } else {
                this.method1198(arg0, var9, var7, var10, 0);
                if (this.field1189 >= var7) {
                    this.field1189 = var7;
                    this.method1129();
                    this.method3414();
                }
            }
        } else if (this.field1194) {
            if (this.field1183 < 0) {
                var9 = this.method1141(arg0, arg1, var5, var10, var4.field1168[this.field1190]);
                if (this.field1189 >= var5) {
                    return;
                }
                this.field1189 = var5 + var5 - 1 - this.field1189;
                this.field1183 = -this.field1183;
            }
            while (true) {
                int var11 = this.method1198(arg0, var9, var6, var10, var4.field1168[this.field1192 - 1]);
                if (this.field1189 < var6) {
                    return;
                }
                this.field1189 = var6 + var6 - 1 - this.field1189;
                this.field1183 = -this.field1183;
                var9 = this.method1141(arg0, var11, var5, var10, var4.field1168[this.field1190]);
                if (this.field1189 >= var5) {
                    return;
                }
                this.field1189 = var5 + var5 - 1 - this.field1189;
                this.field1183 = -this.field1183;
            }
        } else if (this.field1183 < 0) {
            while (true) {
                var9 = this.method1141(arg0, var9, var5, var10, var4.field1168[this.field1192 - 1]);
                if (this.field1189 >= var5) {
                    return;
                }
                this.field1189 = var6 - 1 - (var6 - 1 - this.field1189) % var8;
            }
        } else {
            while (true) {
                var9 = this.method1198(arg0, var9, var6, var10, var4.field1168[this.field1190]);
                if (this.field1189 < var6) {
                    return;
                }
                this.field1189 = (this.field1189 - var5) % var8 + var5;
            }
        }
    }

    @ObfuscatedName("bb.v(I)V")
    public synchronized void method981(int arg0) {
        if (this.field1191 > 0) {
            if (arg0 >= this.field1191) {
                if (this.field1185 == Integer.MIN_VALUE) {
                    this.field1185 = 0;
                    this.field1193 = 0;
                    this.field1184 = 0;
                    this.field1187 = 0;
                    this.method3414();
                    arg0 = this.field1191;
                }
                this.field1191 = 0;
                this.method1121();
            } else {
                this.field1187 += this.field1195 * arg0;
                this.field1184 += this.field1196 * arg0;
                this.field1193 += this.field1197 * arg0;
                this.field1191 -= arg0;
            }
        }
        class58 var2 = (class58) this.field1201;
        int var3 = this.field1190 << 8;
        int var4 = this.field1192 << 8;
        int var5 = var2.field1168.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field1188 = 0;
        }
        if (this.field1189 < 0) {
            if (this.field1183 <= 0) {
                this.method1129();
                this.method3414();
                return;
            }
            this.field1189 = 0;
        }
        if (this.field1189 >= var5) {
            if (this.field1183 >= 0) {
                this.method1129();
                this.method3414();
                return;
            }
            this.field1189 = var5 - 1;
        }
        this.field1189 += this.field1183 * arg0;
        if (this.field1188 >= 0) {
            if (this.field1188 > 0) {
                if (this.field1194) {
                    label121: {
                        if (this.field1183 < 0) {
                            if (this.field1189 >= var3) {
                                return;
                            }
                            this.field1189 = var3 + var3 - 1 - this.field1189;
                            this.field1183 = -this.field1183;
                            if (--this.field1188 == 0) {
                                break label121;
                            }
                        }
                        do {
                            if (this.field1189 < var4) {
                                return;
                            }
                            this.field1189 = var4 + var4 - 1 - this.field1189;
                            this.field1183 = -this.field1183;
                            if (--this.field1188 == 0) {
                                break;
                            }
                            if (this.field1189 >= var3) {
                                return;
                            }
                            this.field1189 = var3 + var3 - 1 - this.field1189;
                            this.field1183 = -this.field1183;
                        } while (--this.field1188 != 0);
                    }
                } else {
                    label153: {
                        if (this.field1183 < 0) {
                            if (this.field1189 >= var3) {
                                return;
                            }
                            int var7 = (var4 - 1 - this.field1189) / var6;
                            if (var7 >= this.field1188) {
                                this.field1189 += this.field1188 * var6;
                                this.field1188 = 0;
                                break label153;
                            }
                            this.field1189 += var6 * var7;
                            this.field1188 -= var7;
                        } else if (this.field1189 >= var4) {
                            int var8 = (this.field1189 - var3) / var6;
                            if (var8 >= this.field1188) {
                                this.field1189 -= this.field1188 * var6;
                                this.field1188 = 0;
                                break label153;
                            }
                            this.field1189 -= var6 * var8;
                            this.field1188 -= var8;
                        } else {
                            return;
                        }
                        return;
                    }
                }
            }
            if (this.field1183 < 0) {
                if (this.field1189 < 0) {
                    this.field1189 = -1;
                    this.method1129();
                    this.method3414();
                }
            } else if (this.field1189 >= var5) {
                this.field1189 = var5;
                this.method1129();
                this.method3414();
            }
        } else if (this.field1194) {
            if (this.field1183 < 0) {
                if (this.field1189 >= var3) {
                    return;
                }
                this.field1189 = var3 + var3 - 1 - this.field1189;
                this.field1183 = -this.field1183;
            }
            while (this.field1189 >= var4) {
                this.field1189 = var4 + var4 - 1 - this.field1189;
                this.field1183 = -this.field1183;
                if (this.field1189 >= var3) {
                    return;
                }
                this.field1189 = var3 + var3 - 1 - this.field1189;
                this.field1183 = -this.field1183;
            }
        } else if (this.field1183 < 0) {
            if (this.field1189 >= var3) {
                return;
            }
            this.field1189 = var4 - 1 - (var4 - 1 - this.field1189) % var6;
        } else if (this.field1189 >= var4) {
            this.field1189 = (this.field1189 - var3) % var6 + var3;
        } else {
            return;
        }
    }

    @ObfuscatedName("bb.aa([IIIII)I")
    public int method1198(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1191 > 0) {
                int var6 = this.field1191 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1191 += arg1;
                if (this.field1183 == 256 && (this.field1189 & 0xFF) == 0) {
                    if (Statics.field1102) {
                        arg1 = method1243(0, ((class58) this.field1201).field1168, arg0, this.field1189, arg1, this.field1184, this.field1193, this.field1196, this.field1197, 0, var6, arg2, this);
                    } else {
                        arg1 = method1150(((class58) this.field1201).field1168, arg0, this.field1189, arg1, this.field1187, this.field1195, 0, var6, arg2, this);
                    }
                } else if (Statics.field1102) {
                    arg1 = method1155(0, 0, ((class58) this.field1201).field1168, arg0, this.field1189, arg1, this.field1184, this.field1193, this.field1196, this.field1197, 0, var6, arg2, this, this.field1183, arg4);
                } else {
                    arg1 = method1154(0, 0, ((class58) this.field1201).field1168, arg0, this.field1189, arg1, this.field1187, this.field1195, 0, var6, arg2, this, this.field1183, arg4);
                }
                this.field1191 -= arg1;
                if (this.field1191 != 0) {
                    return arg1;
                }
                if (!this.method1142()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1183 == 256 && (this.field1189 & 0xFF) == 0) {
                if (Statics.field1102) {
                    return method1117(0, ((class58) this.field1201).field1168, arg0, this.field1189, arg1, this.field1184, this.field1193, 0, arg3, arg2, this);
                }
                return method1178(((class58) this.field1201).field1168, arg0, this.field1189, arg1, this.field1187, 0, arg3, arg2, this);
            }
            if (Statics.field1102) {
                return method1148(0, 0, ((class58) this.field1201).field1168, arg0, this.field1189, arg1, this.field1184, this.field1193, 0, arg3, arg2, this, this.field1183, arg4);
            }
            return method1147(0, 0, ((class58) this.field1201).field1168, arg0, this.field1189, arg1, this.field1187, 0, arg3, arg2, this, this.field1183, arg4);
        }
    }

    @ObfuscatedName("bb.az([IIIII)I")
    public int method1141(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1191 > 0) {
                int var6 = this.field1191 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1191 += arg1;
                if (this.field1183 == -256 && (this.field1189 & 0xFF) == 0) {
                    if (Statics.field1102) {
                        arg1 = method1153(0, ((class58) this.field1201).field1168, arg0, this.field1189, arg1, this.field1184, this.field1193, this.field1196, this.field1197, 0, var6, arg2, this);
                    } else {
                        arg1 = method1152(((class58) this.field1201).field1168, arg0, this.field1189, arg1, this.field1187, this.field1195, 0, var6, arg2, this);
                    }
                } else if (Statics.field1102) {
                    arg1 = method1157(0, 0, ((class58) this.field1201).field1168, arg0, this.field1189, arg1, this.field1184, this.field1193, this.field1196, this.field1197, 0, var6, arg2, this, this.field1183, arg4);
                } else {
                    arg1 = method1228(0, 0, ((class58) this.field1201).field1168, arg0, this.field1189, arg1, this.field1187, this.field1195, 0, var6, arg2, this, this.field1183, arg4);
                }
                this.field1191 -= arg1;
                if (this.field1191 != 0) {
                    return arg1;
                }
                if (!this.method1142()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1183 == -256 && (this.field1189 & 0xFF) == 0) {
                if (Statics.field1102) {
                    return method1186(0, ((class58) this.field1201).field1168, arg0, this.field1189, arg1, this.field1184, this.field1193, 0, arg3, arg2, this);
                }
                return method1145(((class58) this.field1201).field1168, arg0, this.field1189, arg1, this.field1187, 0, arg3, arg2, this);
            }
            if (Statics.field1102) {
                return method1149(0, 0, ((class58) this.field1201).field1168, arg0, this.field1189, arg1, this.field1184, this.field1193, 0, arg3, arg2, this, this.field1183, arg4);
            }
            return method1123(0, 0, ((class58) this.field1201).field1168, arg0, this.field1189, arg1, this.field1187, 0, arg3, arg2, this, this.field1183, arg4);
        }
    }

    @ObfuscatedName("bb.ae()Z")
    public boolean method1142() {
        int var1 = this.field1185;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method1136(var1, this.field1186);
            var2 = method1159(var1, this.field1186);
        }
        if (this.field1187 != var1 || this.field1184 != var3 || this.field1193 != var2) {
            if (this.field1187 < var1) {
                this.field1195 = 1;
                this.field1191 = var1 - this.field1187;
            } else if (this.field1187 > var1) {
                this.field1195 = -1;
                this.field1191 = this.field1187 - var1;
            } else {
                this.field1195 = 0;
            }
            if (this.field1184 < var3) {
                this.field1196 = 1;
                if (this.field1191 == 0 || this.field1191 > var3 - this.field1184) {
                    this.field1191 = var3 - this.field1184;
                }
            } else if (this.field1184 > var3) {
                this.field1196 = -1;
                if (this.field1191 == 0 || this.field1191 > this.field1184 - var3) {
                    this.field1191 = this.field1184 - var3;
                }
            } else {
                this.field1196 = 0;
            }
            if (this.field1193 < var2) {
                this.field1197 = 1;
                if (this.field1191 == 0 || this.field1191 > var2 - this.field1193) {
                    this.field1191 = var2 - this.field1193;
                }
            } else if (this.field1193 > var2) {
                this.field1197 = -1;
                if (this.field1191 == 0 || this.field1191 > this.field1193 - var2) {
                    this.field1191 = this.field1193 - var2;
                }
            } else {
                this.field1197 = 0;
            }
            return false;
        } else if (this.field1185 == Integer.MIN_VALUE) {
            this.field1185 = 0;
            this.field1193 = 0;
            this.field1184 = 0;
            this.field1187 = 0;
            this.method3414();
            return true;
        } else {
            this.method1121();
            return false;
        }
    }

    @ObfuscatedName("bb.ah([B[IIIIIIILbb;)I")
    public static int method1178(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class60 arg8) {
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
        arg8.field1189 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("bb.an(I[B[IIIIIIIILbb;)I")
    public static int method1117(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class60 arg10) {
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
        arg10.field1189 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("bb.aq([B[IIIIIIILbb;)I")
    public static int method1145(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class60 arg8) {
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
        arg8.field1189 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("bb.as(I[B[IIIIIIIILbb;)I")
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
        arg10.field1189 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("bb.ay(II[B[IIIIIIILbb;II)I")
    public static int method1147(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class60 arg10, int arg11, int arg12) {
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
        arg10.field1189 = arg4;
        return arg5;
    }

    @ObfuscatedName("bb.ad(II[B[IIIIIIIILbb;II)I")
    public static int method1148(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class60 arg11, int arg12, int arg13) {
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
        arg11.field1189 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("bb.af(II[B[IIIIIIILbb;II)I")
    public static int method1123(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class60 arg10, int arg11, int arg12) {
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
        arg10.field1189 = arg4;
        return arg5;
    }

    @ObfuscatedName("bb.ab(II[B[IIIIIIIILbb;II)I")
    public static int method1149(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class60 arg11, int arg12, int arg13) {
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
        arg11.field1189 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("bb.av([B[IIIIIIIILbb;)I")
    public static int method1150(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class60 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field1184 += (var14 - arg3) * arg9.field1196;
        arg9.field1193 += (var14 - arg3) * arg9.field1197;
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
        arg9.field1187 = var12 >> 2;
        arg9.field1189 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("bb.ao(I[B[IIIIIIIIIILbb;)I")
    public static int method1243(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class60 arg12) {
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
        arg12.field1187 += (var19 - arg4) * arg12.field1195;
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
        arg12.field1184 = var15 >> 2;
        arg12.field1193 = var16 >> 2;
        arg12.field1189 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("bb.aj([B[IIIIIIIILbb;)I")
    public static int method1152(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class60 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field1184 += (var14 - arg3) * arg9.field1196;
        arg9.field1193 += (var14 - arg3) * arg9.field1197;
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
        arg9.field1187 = var12 >> 2;
        arg9.field1189 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("bb.bj(I[B[IIIIIIIIIILbb;)I")
    public static int method1153(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class60 arg12) {
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
        arg12.field1187 += (var19 - arg4) * arg12.field1195;
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
        arg12.field1184 = var15 >> 2;
        arg12.field1193 = var16 >> 2;
        arg12.field1189 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("bb.bv(II[B[IIIIIIIILbb;II)I")
    public static int method1154(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class60 arg11, int arg12, int arg13) {
        arg11.field1184 -= arg11.field1196 * arg5;
        arg11.field1193 -= arg11.field1197 * arg5;
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
        arg11.field1184 += arg11.field1196 * arg5;
        arg11.field1193 += arg11.field1197 * arg5;
        arg11.field1187 = arg6;
        arg11.field1189 = arg4;
        return arg5;
    }

    @ObfuscatedName("bb.bw(II[B[IIIIIIIIIILbb;II)I")
    public static int method1155(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class60 arg13, int arg14, int arg15) {
        arg13.field1187 -= arg13.field1195 * arg5;
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
        arg13.field1187 += arg13.field1195 * var27;
        arg13.field1184 = arg6;
        arg13.field1193 = arg7;
        arg13.field1189 = arg4;
        return var27;
    }

    @ObfuscatedName("bb.bi(II[B[IIIIIIIILbb;II)I")
    public static int method1228(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class60 arg11, int arg12, int arg13) {
        arg11.field1184 -= arg11.field1196 * arg5;
        arg11.field1193 -= arg11.field1197 * arg5;
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
        arg11.field1184 += arg11.field1196 * arg5;
        arg11.field1193 += arg11.field1197 * arg5;
        arg11.field1187 = arg6;
        arg11.field1189 = arg4;
        return arg5;
    }

    @ObfuscatedName("bb.bh(II[B[IIIIIIIIIILbb;II)I")
    public static int method1157(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class60 arg13, int arg14, int arg15) {
        arg13.field1187 -= arg13.field1195 * arg5;
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
        arg13.field1187 += arg13.field1195 * var26;
        arg13.field1184 = arg6;
        arg13.field1193 = arg7;
        arg13.field1189 = arg4;
        return var26;
    }
}
