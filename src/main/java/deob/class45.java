package deob;

@ObfuscatedName("az")
public class class45 extends class48 {

    @ObfuscatedName("az.t")
    public int field1091;

    @ObfuscatedName("az.l")
    public int field1080;

    @ObfuscatedName("az.c")
    public int field1081;

    @ObfuscatedName("az.d")
    public int field1082;

    @ObfuscatedName("az.b")
    public int field1083;

    @ObfuscatedName("az.i")
    public int field1084;

    @ObfuscatedName("az.p")
    public int field1085;

    @ObfuscatedName("az.y")
    public int field1079;

    @ObfuscatedName("az.u")
    public int field1088;

    @ObfuscatedName("az.z")
    public int field1086;

    @ObfuscatedName("az.j")
    public boolean field1089;

    @ObfuscatedName("az.h")
    public int field1090;

    @ObfuscatedName("az.x")
    public int field1093;

    @ObfuscatedName("az.q")
    public int field1092;

    @ObfuscatedName("az.k")
    public int field1087;

    @ObfuscatedName("az.t(II)I")
    public static int method1050(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("az.l(II)I")
    public static int method974(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("az.c()I")
    public int method1064() {
        int var1 = this.field1083 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field1079 == 0) {
            var2 -= this.field1091 * var2 / (((class63) this.field1101).field1271.length << 8);
        } else if (this.field1079 >= 0) {
            var2 -= this.field1088 * var2 / ((class63) this.field1101).field1271.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    public class45(class63 arg0, int arg1, int arg2) {
        this.field1101 = arg0;
        this.field1088 = arg0.field1270;
        this.field1086 = arg0.field1273;
        this.field1089 = arg0.field1274;
        this.field1080 = arg1;
        this.field1081 = arg2;
        this.field1082 = 8192;
        this.field1091 = 0;
        this.method980();
    }

    public class45(class63 arg0, int arg1, int arg2, int arg3) {
        this.field1101 = arg0;
        this.field1088 = arg0.field1270;
        this.field1086 = arg0.field1273;
        this.field1089 = arg0.field1274;
        this.field1080 = arg1;
        this.field1081 = arg2;
        this.field1082 = arg3;
        this.field1091 = 0;
        this.method980();
    }

    @ObfuscatedName("az.d(Lbc;II)Laz;")
    public static class45 method978(class63 arg0, int arg1, int arg2) {
        return arg0.field1271 == null || arg0.field1271.length == 0 ? null : new class45(arg0, (int) ((long) arg0.field1272 * 256L * (long) arg1 / (long) (Statics.field2051 * 100)), arg2 << 6);
    }

    @ObfuscatedName("az.b(Lbc;III)Laz;")
    public static class45 method979(class63 arg0, int arg1, int arg2, int arg3) {
        return arg0.field1271 == null || arg0.field1271.length == 0 ? null : new class45(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("az.i()V")
    public void method980() {
        this.field1083 = this.field1081;
        this.field1084 = method1050(this.field1081, this.field1082);
        this.field1085 = method974(this.field1081, this.field1082);
    }

    @ObfuscatedName("az.p(I)V")
    public synchronized void method981(int arg0) {
        this.field1079 = arg0;
    }

    @ObfuscatedName("az.y(I)V")
    public synchronized void method1052(int arg0) {
        this.method984(arg0 << 6, this.method1013());
    }

    @ObfuscatedName("az.u(I)V")
    public synchronized void method986(int arg0) {
        this.method984(arg0, this.method1013());
    }

    @ObfuscatedName("az.z(II)V")
    public synchronized void method984(int arg0, int arg1) {
        this.field1081 = arg0;
        this.field1082 = arg1;
        this.field1090 = 0;
        this.method980();
    }

    @ObfuscatedName("az.j()I")
    public synchronized int method985() {
        return this.field1081 == Integer.MIN_VALUE ? 0 : this.field1081;
    }

    @ObfuscatedName("az.h()I")
    public synchronized int method1013() {
        return this.field1082 < 0 ? -1 : this.field1082;
    }

    @ObfuscatedName("az.x(I)V")
    public synchronized void method987(int arg0) {
        int var2 = ((class63) this.field1101).field1271.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field1091 = arg0;
    }

    @ObfuscatedName("az.q(Z)V")
    public synchronized void method1047(boolean arg0) {
        this.field1080 = (this.field1080 >>> 31) + (this.field1080 ^ this.field1080 >> 31);
        if (arg0) {
            this.field1080 = -this.field1080;
        }
    }

    @ObfuscatedName("az.w()V")
    public void method994() {
        if (this.field1090 == 0) {
            return;
        }
        if (this.field1081 == Integer.MIN_VALUE) {
            this.field1081 = 0;
        }
        this.field1090 = 0;
        this.method980();
    }

    @ObfuscatedName("az.k(II)V")
    public synchronized void method990(int arg0, int arg1) {
        this.method991(arg0, arg1, this.method1013());
    }

    @ObfuscatedName("az.o(III)V")
    public synchronized void method991(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method984(arg1, arg2);
            return;
        }
        int var4 = method1050(arg1, arg2);
        int var5 = method974(arg1, arg2);
        if (this.field1084 == var4 && this.field1085 == var5) {
            this.field1090 = 0;
            return;
        }
        int var6 = arg1 - this.field1083;
        if (this.field1083 - arg1 > var6) {
            var6 = this.field1083 - arg1;
        }
        if (var4 - this.field1084 > var6) {
            var6 = var4 - this.field1084;
        }
        if (this.field1084 - var4 > var6) {
            var6 = this.field1084 - var4;
        }
        if (var5 - this.field1085 > var6) {
            var6 = var5 - this.field1085;
        }
        if (this.field1085 - var5 > var6) {
            var6 = this.field1085 - var5;
        }
        if (arg0 > var6) {
            arg0 = var6;
        }
        this.field1090 = arg0;
        this.field1081 = arg1;
        this.field1082 = arg2;
        this.field1093 = (arg1 - this.field1083) / arg0;
        this.field1092 = (var4 - this.field1084) / arg0;
        this.field1087 = (var5 - this.field1085) / arg0;
    }

    @ObfuscatedName("az.f(I)V")
    public synchronized void method992(int arg0) {
        if (arg0 == 0) {
            this.method986(0);
            this.method3361();
        } else if (this.field1084 == 0 && this.field1085 == 0) {
            this.field1090 = 0;
            this.field1081 = 0;
            this.field1083 = 0;
            this.method3361();
        } else {
            int var2 = -this.field1083;
            if (this.field1083 > var2) {
                var2 = this.field1083;
            }
            if (-this.field1084 > var2) {
                var2 = -this.field1084;
            }
            if (this.field1084 > var2) {
                var2 = this.field1084;
            }
            if (-this.field1085 > var2) {
                var2 = -this.field1085;
            }
            if (this.field1085 > var2) {
                var2 = this.field1085;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field1090 = arg0;
            this.field1081 = Integer.MIN_VALUE;
            this.field1093 = -this.field1083 / arg0;
            this.field1092 = -this.field1084 / arg0;
            this.field1087 = -this.field1085 / arg0;
        }
    }

    @ObfuscatedName("az.r(I)V")
    public synchronized void method993(int arg0) {
        if (this.field1080 < 0) {
            this.field1080 = -arg0;
        } else {
            this.field1080 = arg0;
        }
    }

    @ObfuscatedName("az.s()I")
    public synchronized int method1002() {
        return this.field1080 < 0 ? -this.field1080 : this.field1080;
    }

    @ObfuscatedName("az.g()Z")
    public boolean method1043() {
        return this.field1091 < 0 || this.field1091 >= ((class63) this.field1101).field1271.length << 8;
    }

    @ObfuscatedName("az.m()Z")
    public boolean method1044() {
        return this.field1090 != 0;
    }

    @ObfuscatedName("az.a()Lai;")
    public class48 method1033() {
        return null;
    }

    @ObfuscatedName("az.n()Lai;")
    public class48 method1005() {
        return null;
    }

    @ObfuscatedName("az.v()I")
    public int method999() {
        return this.field1081 == 0 && this.field1090 == 0 ? 0 : 1;
    }

    @ObfuscatedName("az.e([III)V")
    public synchronized void method1000(int[] arg0, int arg1, int arg2) {
        if (this.field1081 == 0 && this.field1090 == 0) {
            this.method1031(arg2);
            return;
        }
        class63 var4 = (class63) this.field1101;
        int var5 = this.field1088 << 8;
        int var6 = this.field1086 << 8;
        int var7 = var4.field1271.length << 8;
        int var8 = var6 - var5;
        if (var8 <= 0) {
            this.field1079 = 0;
        }
        int var9 = arg1;
        int var10 = arg1 + arg2;
        if (this.field1091 < 0) {
            if (this.field1080 <= 0) {
                this.method994();
                this.method3361();
                return;
            }
            this.field1091 = 0;
        }
        if (this.field1091 >= var7) {
            if (this.field1080 >= 0) {
                this.method994();
                this.method3361();
                return;
            }
            this.field1091 = var7 - 1;
        }
        if (this.field1079 >= 0) {
            if (this.field1079 > 0) {
                if (this.field1089) {
                    label131: {
                        if (this.field1080 < 0) {
                            var9 = this.method1003(arg0, arg1, var5, var10, var4.field1271[this.field1088]);
                            if (this.field1091 >= var5) {
                                return;
                            }
                            this.field1091 = var5 + var5 - 1 - this.field1091;
                            this.field1080 = -this.field1080;
                            if (--this.field1079 == 0) {
                                break label131;
                            }
                        }
                        do {
                            var9 = this.method1020(arg0, var9, var6, var10, var4.field1271[this.field1086 - 1]);
                            if (this.field1091 < var6) {
                                return;
                            }
                            this.field1091 = var6 + var6 - 1 - this.field1091;
                            this.field1080 = -this.field1080;
                            if (--this.field1079 == 0) {
                                break;
                            }
                            var9 = this.method1003(arg0, var9, var5, var10, var4.field1271[this.field1088]);
                            if (this.field1091 >= var5) {
                                return;
                            }
                            this.field1091 = var5 + var5 - 1 - this.field1091;
                            this.field1080 = -this.field1080;
                        } while (--this.field1079 != 0);
                    }
                } else if (this.field1080 < 0) {
                    while (true) {
                        var9 = this.method1003(arg0, var9, var5, var10, var4.field1271[this.field1086 - 1]);
                        if (this.field1091 >= var5) {
                            return;
                        }
                        int var12 = (var6 - 1 - this.field1091) / var8;
                        if (var12 >= this.field1079) {
                            this.field1091 += this.field1079 * var8;
                            this.field1079 = 0;
                            break;
                        }
                        this.field1091 += var8 * var12;
                        this.field1079 -= var12;
                    }
                } else {
                    while (true) {
                        var9 = this.method1020(arg0, var9, var6, var10, var4.field1271[this.field1088]);
                        if (this.field1091 < var6) {
                            return;
                        }
                        int var13 = (this.field1091 - var5) / var8;
                        if (var13 >= this.field1079) {
                            this.field1091 -= this.field1079 * var8;
                            this.field1079 = 0;
                            break;
                        }
                        this.field1091 -= var8 * var13;
                        this.field1079 -= var13;
                    }
                }
            }
            if (this.field1080 < 0) {
                this.method1003(arg0, var9, 0, var10, 0);
                if (this.field1091 < 0) {
                    this.field1091 = -1;
                    this.method994();
                    this.method3361();
                }
            } else {
                this.method1020(arg0, var9, var7, var10, 0);
                if (this.field1091 >= var7) {
                    this.field1091 = var7;
                    this.method994();
                    this.method3361();
                }
            }
        } else if (this.field1089) {
            if (this.field1080 < 0) {
                var9 = this.method1003(arg0, arg1, var5, var10, var4.field1271[this.field1088]);
                if (this.field1091 >= var5) {
                    return;
                }
                this.field1091 = var5 + var5 - 1 - this.field1091;
                this.field1080 = -this.field1080;
            }
            while (true) {
                int var11 = this.method1020(arg0, var9, var6, var10, var4.field1271[this.field1086 - 1]);
                if (this.field1091 < var6) {
                    return;
                }
                this.field1091 = var6 + var6 - 1 - this.field1091;
                this.field1080 = -this.field1080;
                var9 = this.method1003(arg0, var11, var5, var10, var4.field1271[this.field1088]);
                if (this.field1091 >= var5) {
                    return;
                }
                this.field1091 = var5 + var5 - 1 - this.field1091;
                this.field1080 = -this.field1080;
            }
        } else if (this.field1080 < 0) {
            while (true) {
                var9 = this.method1003(arg0, var9, var5, var10, var4.field1271[this.field1086 - 1]);
                if (this.field1091 >= var5) {
                    return;
                }
                this.field1091 = var6 - 1 - (var6 - 1 - this.field1091) % var8;
            }
        } else {
            while (true) {
                var9 = this.method1020(arg0, var9, var6, var10, var4.field1271[this.field1088]);
                if (this.field1091 < var6) {
                    return;
                }
                this.field1091 = (this.field1091 - var5) % var8 + var5;
            }
        }
    }

    @ObfuscatedName("az.ar(I)V")
    public synchronized void method1031(int arg0) {
        if (this.field1090 > 0) {
            if (arg0 >= this.field1090) {
                if (this.field1081 == Integer.MIN_VALUE) {
                    this.field1081 = 0;
                    this.field1085 = 0;
                    this.field1084 = 0;
                    this.field1083 = 0;
                    this.method3361();
                    arg0 = this.field1090;
                }
                this.field1090 = 0;
                this.method980();
            } else {
                this.field1083 += this.field1093 * arg0;
                this.field1084 += this.field1092 * arg0;
                this.field1085 += this.field1087 * arg0;
                this.field1090 -= arg0;
            }
        }
        class63 var2 = (class63) this.field1101;
        int var3 = this.field1088 << 8;
        int var4 = this.field1086 << 8;
        int var5 = var2.field1271.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field1079 = 0;
        }
        if (this.field1091 < 0) {
            if (this.field1080 <= 0) {
                this.method994();
                this.method3361();
                return;
            }
            this.field1091 = 0;
        }
        if (this.field1091 >= var5) {
            if (this.field1080 >= 0) {
                this.method994();
                this.method3361();
                return;
            }
            this.field1091 = var5 - 1;
        }
        this.field1091 += this.field1080 * arg0;
        if (this.field1079 >= 0) {
            if (this.field1079 > 0) {
                if (this.field1089) {
                    label121: {
                        if (this.field1080 < 0) {
                            if (this.field1091 >= var3) {
                                return;
                            }
                            this.field1091 = var3 + var3 - 1 - this.field1091;
                            this.field1080 = -this.field1080;
                            if (--this.field1079 == 0) {
                                break label121;
                            }
                        }
                        do {
                            if (this.field1091 < var4) {
                                return;
                            }
                            this.field1091 = var4 + var4 - 1 - this.field1091;
                            this.field1080 = -this.field1080;
                            if (--this.field1079 == 0) {
                                break;
                            }
                            if (this.field1091 >= var3) {
                                return;
                            }
                            this.field1091 = var3 + var3 - 1 - this.field1091;
                            this.field1080 = -this.field1080;
                        } while (--this.field1079 != 0);
                    }
                } else {
                    label153: {
                        if (this.field1080 < 0) {
                            if (this.field1091 >= var3) {
                                return;
                            }
                            int var7 = (var4 - 1 - this.field1091) / var6;
                            if (var7 >= this.field1079) {
                                this.field1091 += this.field1079 * var6;
                                this.field1079 = 0;
                                break label153;
                            }
                            this.field1091 += var6 * var7;
                            this.field1079 -= var7;
                        } else if (this.field1091 >= var4) {
                            int var8 = (this.field1091 - var3) / var6;
                            if (var8 >= this.field1079) {
                                this.field1091 -= this.field1079 * var6;
                                this.field1079 = 0;
                                break label153;
                            }
                            this.field1091 -= var6 * var8;
                            this.field1079 -= var8;
                        } else {
                            return;
                        }
                        return;
                    }
                }
            }
            if (this.field1080 < 0) {
                if (this.field1091 < 0) {
                    this.field1091 = -1;
                    this.method994();
                    this.method3361();
                }
            } else if (this.field1091 >= var5) {
                this.field1091 = var5;
                this.method994();
                this.method3361();
            }
        } else if (this.field1089) {
            if (this.field1080 < 0) {
                if (this.field1091 >= var3) {
                    return;
                }
                this.field1091 = var3 + var3 - 1 - this.field1091;
                this.field1080 = -this.field1080;
            }
            while (this.field1091 >= var4) {
                this.field1091 = var4 + var4 - 1 - this.field1091;
                this.field1080 = -this.field1080;
                if (this.field1091 >= var3) {
                    return;
                }
                this.field1091 = var3 + var3 - 1 - this.field1091;
                this.field1080 = -this.field1080;
            }
        } else if (this.field1080 < 0) {
            if (this.field1091 >= var3) {
                return;
            }
            this.field1091 = var4 - 1 - (var4 - 1 - this.field1091) % var6;
        } else if (this.field1091 >= var4) {
            this.field1091 = (this.field1091 - var3) % var6 + var3;
        } else {
            return;
        }
    }

    @ObfuscatedName("az.ak([IIIII)I")
    public int method1020(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1090 > 0) {
                int var6 = this.field1090 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1090 += arg1;
                if (this.field1080 == 256 && (this.field1091 & 0xFF) == 0) {
                    if (Statics.field2022) {
                        arg1 = method1061(0, ((class63) this.field1101).field1271, arg0, this.field1091, arg1, this.field1084, this.field1085, this.field1092, this.field1087, 0, var6, arg2, this);
                    } else {
                        arg1 = method1039(((class63) this.field1101).field1271, arg0, this.field1091, arg1, this.field1083, this.field1093, 0, var6, arg2, this);
                    }
                } else if (Statics.field2022) {
                    arg1 = method1018(0, 0, ((class63) this.field1101).field1271, arg0, this.field1091, arg1, this.field1084, this.field1085, this.field1092, this.field1087, 0, var6, arg2, this, this.field1080, arg4);
                } else {
                    arg1 = method1017(0, 0, ((class63) this.field1101).field1271, arg0, this.field1091, arg1, this.field1083, this.field1093, 0, var6, arg2, this, this.field1080, arg4);
                }
                this.field1090 -= arg1;
                if (this.field1090 != 0) {
                    return arg1;
                }
                if (!this.method1004()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1080 == 256 && (this.field1091 & 0xFF) == 0) {
                if (Statics.field2022) {
                    return method1006(0, ((class63) this.field1101).field1271, arg0, this.field1091, arg1, this.field1084, this.field1085, 0, arg3, arg2, this);
                }
                return method982(((class63) this.field1101).field1271, arg0, this.field1091, arg1, this.field1083, 0, arg3, arg2, this);
            }
            if (Statics.field2022) {
                return method1010(0, 0, ((class63) this.field1101).field1271, arg0, this.field1091, arg1, this.field1084, this.field1085, 0, arg3, arg2, this, this.field1080, arg4);
            }
            return method1009(0, 0, ((class63) this.field1101).field1271, arg0, this.field1091, arg1, this.field1083, 0, arg3, arg2, this, this.field1080, arg4);
        }
    }

    @ObfuscatedName("az.ap([IIIII)I")
    public int method1003(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1090 > 0) {
                int var6 = this.field1090 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1090 += arg1;
                if (this.field1080 == -256 && (this.field1091 & 0xFF) == 0) {
                    if (Statics.field2022) {
                        arg1 = method1016(0, ((class63) this.field1101).field1271, arg0, this.field1091, arg1, this.field1084, this.field1085, this.field1092, this.field1087, 0, var6, arg2, this);
                    } else {
                        arg1 = method1015(((class63) this.field1101).field1271, arg0, this.field1091, arg1, this.field1083, this.field1093, 0, var6, arg2, this);
                    }
                } else if (Statics.field2022) {
                    arg1 = method1025(0, 0, ((class63) this.field1101).field1271, arg0, this.field1091, arg1, this.field1084, this.field1085, this.field1092, this.field1087, 0, var6, arg2, this, this.field1080, arg4);
                } else {
                    arg1 = method1019(0, 0, ((class63) this.field1101).field1271, arg0, this.field1091, arg1, this.field1083, this.field1093, 0, var6, arg2, this, this.field1080, arg4);
                }
                this.field1090 -= arg1;
                if (this.field1090 != 0) {
                    return arg1;
                }
                if (!this.method1004()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1080 == -256 && (this.field1091 & 0xFF) == 0) {
                if (Statics.field2022) {
                    return method1008(0, ((class63) this.field1101).field1271, arg0, this.field1091, arg1, this.field1084, this.field1085, 0, arg3, arg2, this);
                }
                return method1098(((class63) this.field1101).field1271, arg0, this.field1091, arg1, this.field1083, 0, arg3, arg2, this);
            }
            if (Statics.field2022) {
                return method1012(0, 0, ((class63) this.field1101).field1271, arg0, this.field1091, arg1, this.field1084, this.field1085, 0, arg3, arg2, this, this.field1080, arg4);
            }
            return method1011(0, 0, ((class63) this.field1101).field1271, arg0, this.field1091, arg1, this.field1083, 0, arg3, arg2, this, this.field1080, arg4);
        }
    }

    @ObfuscatedName("az.aa()Z")
    public boolean method1004() {
        int var1 = this.field1081;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method1050(var1, this.field1082);
            var2 = method974(var1, this.field1082);
        }
        if (this.field1083 != var1 || this.field1084 != var3 || this.field1085 != var2) {
            if (this.field1083 < var1) {
                this.field1093 = 1;
                this.field1090 = var1 - this.field1083;
            } else if (this.field1083 > var1) {
                this.field1093 = -1;
                this.field1090 = this.field1083 - var1;
            } else {
                this.field1093 = 0;
            }
            if (this.field1084 < var3) {
                this.field1092 = 1;
                if (this.field1090 == 0 || this.field1090 > var3 - this.field1084) {
                    this.field1090 = var3 - this.field1084;
                }
            } else if (this.field1084 > var3) {
                this.field1092 = -1;
                if (this.field1090 == 0 || this.field1090 > this.field1084 - var3) {
                    this.field1090 = this.field1084 - var3;
                }
            } else {
                this.field1092 = 0;
            }
            if (this.field1085 < var2) {
                this.field1087 = 1;
                if (this.field1090 == 0 || this.field1090 > var2 - this.field1085) {
                    this.field1090 = var2 - this.field1085;
                }
            } else if (this.field1085 > var2) {
                this.field1087 = -1;
                if (this.field1090 == 0 || this.field1090 > this.field1085 - var2) {
                    this.field1090 = this.field1085 - var2;
                }
            } else {
                this.field1087 = 0;
            }
            return false;
        } else if (this.field1081 == Integer.MIN_VALUE) {
            this.field1081 = 0;
            this.field1085 = 0;
            this.field1084 = 0;
            this.field1083 = 0;
            this.method3361();
            return true;
        } else {
            this.method980();
            return false;
        }
    }

    @ObfuscatedName("az.av([B[IIIIIIILaz;)I")
    public static int method982(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class45 arg8) {
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
        arg8.field1091 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("az.aq(I[B[IIIIIIIILaz;)I")
    public static int method1006(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class45 arg10) {
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
        arg10.field1091 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("az.an([B[IIIIIIILaz;)I")
    public static int method1098(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class45 arg8) {
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
        arg8.field1091 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("az.al(I[B[IIIIIIIILaz;)I")
    public static int method1008(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class45 arg10) {
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
        arg10.field1091 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("az.ax(II[B[IIIIIIILaz;II)I")
    public static int method1009(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class45 arg10, int arg11, int arg12) {
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
        arg10.field1091 = arg4;
        return arg5;
    }

    @ObfuscatedName("az.as(II[B[IIIIIIIILaz;II)I")
    public static int method1010(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class45 arg11, int arg12, int arg13) {
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
        arg11.field1091 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("az.ah(II[B[IIIIIIILaz;II)I")
    public static int method1011(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class45 arg10, int arg11, int arg12) {
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
        arg10.field1091 = arg4;
        return arg5;
    }

    @ObfuscatedName("az.ae(II[B[IIIIIIIILaz;II)I")
    public static int method1012(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class45 arg11, int arg12, int arg13) {
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
        arg11.field1091 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("az.ac([B[IIIIIIIILaz;)I")
    public static int method1039(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class45 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field1084 += (var14 - arg3) * arg9.field1092;
        arg9.field1085 += (var14 - arg3) * arg9.field1087;
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
        arg9.field1083 = var12 >> 2;
        arg9.field1091 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("az.af(I[B[IIIIIIIIIILaz;)I")
    public static int method1061(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class45 arg12) {
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
        arg12.field1083 += (var19 - arg4) * arg12.field1093;
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
        arg12.field1084 = var15 >> 2;
        arg12.field1085 = var16 >> 2;
        arg12.field1091 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("az.aj([B[IIIIIIIILaz;)I")
    public static int method1015(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class45 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field1084 += (var14 - arg3) * arg9.field1092;
        arg9.field1085 += (var14 - arg3) * arg9.field1087;
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
        arg9.field1083 = var12 >> 2;
        arg9.field1091 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("az.ao(I[B[IIIIIIIIIILaz;)I")
    public static int method1016(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class45 arg12) {
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
        arg12.field1083 += (var19 - arg4) * arg12.field1093;
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
        arg12.field1084 = var15 >> 2;
        arg12.field1085 = var16 >> 2;
        arg12.field1091 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("az.au(II[B[IIIIIIIILaz;II)I")
    public static int method1017(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class45 arg11, int arg12, int arg13) {
        arg11.field1084 -= arg11.field1092 * arg5;
        arg11.field1085 -= arg11.field1087 * arg5;
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
        arg11.field1084 += arg11.field1092 * arg5;
        arg11.field1085 += arg11.field1087 * arg5;
        arg11.field1083 = arg6;
        arg11.field1091 = arg4;
        return arg5;
    }

    @ObfuscatedName("az.at(II[B[IIIIIIIIIILaz;II)I")
    public static int method1018(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class45 arg13, int arg14, int arg15) {
        arg13.field1083 -= arg13.field1093 * arg5;
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
        arg13.field1083 += arg13.field1093 * var27;
        arg13.field1084 = arg6;
        arg13.field1085 = arg7;
        arg13.field1091 = arg4;
        return var27;
    }

    @ObfuscatedName("az.az(II[B[IIIIIIIILaz;II)I")
    public static int method1019(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class45 arg11, int arg12, int arg13) {
        arg11.field1084 -= arg11.field1092 * arg5;
        arg11.field1085 -= arg11.field1087 * arg5;
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
        arg11.field1084 += arg11.field1092 * arg5;
        arg11.field1085 += arg11.field1087 * arg5;
        arg11.field1083 = arg6;
        arg11.field1091 = arg4;
        return arg5;
    }

    @ObfuscatedName("az.ag(II[B[IIIIIIIIIILaz;II)I")
    public static int method1025(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class45 arg13, int arg14, int arg15) {
        arg13.field1083 -= arg13.field1093 * arg5;
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
        arg13.field1083 += arg13.field1093 * var26;
        arg13.field1084 = arg6;
        arg13.field1085 = arg7;
        arg13.field1091 = arg4;
        return var26;
    }
}
