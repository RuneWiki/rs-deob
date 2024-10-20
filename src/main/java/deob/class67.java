package deob;

@ObfuscatedName("bi")
public class class67 extends class69 {

    @ObfuscatedName("bi.s")
    public int field1124;

    @ObfuscatedName("bi.c")
    public int field1114;

    @ObfuscatedName("bi.f")
    public int field1115;

    @ObfuscatedName("bi.h")
    public int field1116;

    @ObfuscatedName("bi.a")
    public int field1117;

    @ObfuscatedName("bi.g")
    public int field1118;

    @ObfuscatedName("bi.k")
    public int field1121;

    @ObfuscatedName("bi.u")
    public int field1120;

    @ObfuscatedName("bi.b")
    public int field1127;

    @ObfuscatedName("bi.x")
    public int field1113;

    @ObfuscatedName("bi.r")
    public boolean field1119;

    @ObfuscatedName("bi.n")
    public int field1123;

    @ObfuscatedName("bi.m")
    public int field1125;

    @ObfuscatedName("bi.j")
    public int field1126;

    @ObfuscatedName("bi.p")
    public int field1122;

    @ObfuscatedName("bi.s(II)I")
    public static int method1100(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("bi.c(II)I")
    public static int method1212(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("bi.as()I")
    public int method1118() {
        int var1 = this.field1117 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field1120 == 0) {
            var2 -= this.field1124 * var2 / (((class56) this.field1142).field1021.length << 8);
        } else if (this.field1120 >= 0) {
            var2 -= this.field1127 * var2 / ((class56) this.field1142).field1021.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    public class67(class56 arg0, int arg1, int arg2) {
        this.field1142 = arg0;
        this.field1127 = arg0.field1020;
        this.field1113 = arg0.field1023;
        this.field1119 = arg0.field1024;
        this.field1114 = arg1;
        this.field1115 = arg2;
        this.field1116 = 8192;
        this.field1124 = 0;
        this.method1090();
    }

    public class67(class56 arg0, int arg1, int arg2, int arg3) {
        this.field1142 = arg0;
        this.field1127 = arg0.field1020;
        this.field1113 = arg0.field1023;
        this.field1119 = arg0.field1024;
        this.field1114 = arg1;
        this.field1115 = arg2;
        this.field1116 = arg3;
        this.field1124 = 0;
        this.method1090();
    }

    @ObfuscatedName("bi.f(Lbs;II)Lbi;")
    public static class67 method1088(class56 arg0, int arg1, int arg2) {
        return arg0.field1021 == null || arg0.field1021.length == 0 ? null : new class67(arg0, (int) ((long) arg0.field1022 * 256L * (long) arg1 / (long) (Statics.field1058 * 100)), arg2 << 6);
    }

    @ObfuscatedName("bi.g(Lbs;III)Lbi;")
    public static class67 method1089(class56 arg0, int arg1, int arg2, int arg3) {
        return arg0.field1021 == null || arg0.field1021.length == 0 ? null : new class67(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("bi.k()V")
    public void method1090() {
        this.field1117 = this.field1115;
        this.field1118 = method1100(this.field1115, this.field1116);
        this.field1121 = method1212(this.field1115, this.field1116);
    }

    @ObfuscatedName("bi.n(I)V")
    public synchronized void method1121(int arg0) {
        this.field1120 = arg0;
    }

    @ObfuscatedName("bi.j(I)V")
    public synchronized void method1092(int arg0) {
        this.method1094(arg0 << 6, this.method1174());
    }

    @ObfuscatedName("bi.w(I)V")
    public synchronized void method1196(int arg0) {
        this.method1094(arg0, this.method1174());
    }

    @ObfuscatedName("bi.p(II)V")
    public synchronized void method1094(int arg0, int arg1) {
        this.field1115 = arg0;
        this.field1116 = arg1;
        this.field1123 = 0;
        this.method1090();
    }

    @ObfuscatedName("bi.o()I")
    public synchronized int method1095() {
        return this.field1115 == Integer.MIN_VALUE ? 0 : this.field1115;
    }

    @ObfuscatedName("bi.i()I")
    public synchronized int method1174() {
        return this.field1116 < 0 ? -1 : this.field1116;
    }

    @ObfuscatedName("bi.z(I)V")
    public synchronized void method1115(int arg0) {
        int var2 = ((class56) this.field1142).field1021.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field1124 = arg0;
    }

    @ObfuscatedName("bi.e(Z)V")
    public synchronized void method1098(boolean arg0) {
        this.field1114 = (this.field1114 >>> 31) + (this.field1114 ^ this.field1114 >> 31);
        if (arg0) {
            this.field1114 = -this.field1114;
        }
    }

    @ObfuscatedName("bi.d()V")
    public void method1161() {
        if (this.field1123 == 0) {
            return;
        }
        if (this.field1115 == Integer.MIN_VALUE) {
            this.field1115 = 0;
        }
        this.field1123 = 0;
        this.method1090();
    }

    @ObfuscatedName("bi.t(II)V")
    public synchronized void method1133(int arg0, int arg1) {
        this.method1093(arg0, arg1, this.method1174());
    }

    @ObfuscatedName("bi.q(III)V")
    public synchronized void method1093(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method1094(arg1, arg2);
            return;
        }
        int var4 = method1100(arg1, arg2);
        int var5 = method1212(arg1, arg2);
        if (this.field1118 == var4 && this.field1121 == var5) {
            this.field1123 = 0;
            return;
        }
        int var6 = arg1 - this.field1117;
        if (this.field1117 - arg1 > var6) {
            var6 = this.field1117 - arg1;
        }
        if (var4 - this.field1118 > var6) {
            var6 = var4 - this.field1118;
        }
        if (this.field1118 - var4 > var6) {
            var6 = this.field1118 - var4;
        }
        if (var5 - this.field1121 > var6) {
            var6 = var5 - this.field1121;
        }
        if (this.field1121 - var5 > var6) {
            var6 = this.field1121 - var5;
        }
        if (arg0 > var6) {
            arg0 = var6;
        }
        this.field1123 = arg0;
        this.field1115 = arg1;
        this.field1116 = arg2;
        this.field1125 = (arg1 - this.field1117) / arg0;
        this.field1126 = (var4 - this.field1118) / arg0;
        this.field1122 = (var5 - this.field1121) / arg0;
    }

    @ObfuscatedName("bi.y(I)V")
    public synchronized void method1101(int arg0) {
        if (arg0 == 0) {
            this.method1196(0);
            this.method2179();
        } else if (this.field1118 == 0 && this.field1121 == 0) {
            this.field1123 = 0;
            this.field1115 = 0;
            this.field1117 = 0;
            this.method2179();
        } else {
            int var2 = -this.field1117;
            if (this.field1117 > var2) {
                var2 = this.field1117;
            }
            if (-this.field1118 > var2) {
                var2 = -this.field1118;
            }
            if (this.field1118 > var2) {
                var2 = this.field1118;
            }
            if (-this.field1121 > var2) {
                var2 = -this.field1121;
            }
            if (this.field1121 > var2) {
                var2 = this.field1121;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field1123 = arg0;
            this.field1115 = Integer.MIN_VALUE;
            this.field1125 = -this.field1117 / arg0;
            this.field1126 = -this.field1118 / arg0;
            this.field1122 = -this.field1121 / arg0;
        }
    }

    @ObfuscatedName("bi.aw(I)V")
    public synchronized void method1112(int arg0) {
        if (this.field1114 < 0) {
            this.field1114 = -arg0;
        } else {
            this.field1114 = arg0;
        }
    }

    @ObfuscatedName("bi.ar()I")
    public synchronized int method1103() {
        return this.field1114 < 0 ? -this.field1114 : this.field1114;
    }

    @ObfuscatedName("bi.ay()Z")
    public boolean method1124() {
        return this.field1124 < 0 || this.field1124 >= ((class56) this.field1142).field1021.length << 8;
    }

    @ObfuscatedName("bi.aq()Z")
    public boolean method1105() {
        return this.field1123 != 0;
    }

    @ObfuscatedName("bi.u()Lby;")
    public class69 method852() {
        return null;
    }

    @ObfuscatedName("bi.b()Lby;")
    public class69 method854() {
        return null;
    }

    @ObfuscatedName("bi.x()I")
    public int method855() {
        return this.field1115 == 0 && this.field1123 == 0 ? 0 : 1;
    }

    @ObfuscatedName("bi.r([III)V")
    public synchronized void method869(int[] arg0, int arg1, int arg2) {
        if (this.field1115 == 0 && this.field1123 == 0) {
            this.method857(arg2);
            return;
        }
        class56 var4 = (class56) this.field1142;
        int var5 = this.field1127 << 8;
        int var6 = this.field1113 << 8;
        int var7 = var4.field1021.length << 8;
        int var8 = var6 - var5;
        if (var8 <= 0) {
            this.field1120 = 0;
        }
        int var9 = arg1;
        int var10 = arg1 + arg2;
        if (this.field1124 < 0) {
            if (this.field1114 <= 0) {
                this.method1161();
                this.method2179();
                return;
            }
            this.field1124 = 0;
        }
        if (this.field1124 >= var7) {
            if (this.field1114 >= 0) {
                this.method1161();
                this.method2179();
                return;
            }
            this.field1124 = var7 - 1;
        }
        if (this.field1120 >= 0) {
            if (this.field1120 > 0) {
                if (this.field1119) {
                    label131: {
                        if (this.field1114 < 0) {
                            var9 = this.method1143(arg0, arg1, var5, var10, var4.field1021[this.field1127]);
                            if (this.field1124 >= var5) {
                                return;
                            }
                            this.field1124 = var5 + var5 - 1 - this.field1124;
                            this.field1114 = -this.field1114;
                            if (--this.field1120 == 0) {
                                break label131;
                            }
                        }
                        do {
                            var9 = this.method1106(arg0, var9, var6, var10, var4.field1021[this.field1113 - 1]);
                            if (this.field1124 < var6) {
                                return;
                            }
                            this.field1124 = var6 + var6 - 1 - this.field1124;
                            this.field1114 = -this.field1114;
                            if (--this.field1120 == 0) {
                                break;
                            }
                            var9 = this.method1143(arg0, var9, var5, var10, var4.field1021[this.field1127]);
                            if (this.field1124 >= var5) {
                                return;
                            }
                            this.field1124 = var5 + var5 - 1 - this.field1124;
                            this.field1114 = -this.field1114;
                        } while (--this.field1120 != 0);
                    }
                } else if (this.field1114 < 0) {
                    while (true) {
                        var9 = this.method1143(arg0, var9, var5, var10, var4.field1021[this.field1113 - 1]);
                        if (this.field1124 >= var5) {
                            return;
                        }
                        int var12 = (var6 - 1 - this.field1124) / var8;
                        if (var12 >= this.field1120) {
                            this.field1124 += this.field1120 * var8;
                            this.field1120 = 0;
                            break;
                        }
                        this.field1124 += var8 * var12;
                        this.field1120 -= var12;
                    }
                } else {
                    while (true) {
                        var9 = this.method1106(arg0, var9, var6, var10, var4.field1021[this.field1127]);
                        if (this.field1124 < var6) {
                            return;
                        }
                        int var13 = (this.field1124 - var5) / var8;
                        if (var13 >= this.field1120) {
                            this.field1124 -= this.field1120 * var8;
                            this.field1120 = 0;
                            break;
                        }
                        this.field1124 -= var8 * var13;
                        this.field1120 -= var13;
                    }
                }
            }
            if (this.field1114 < 0) {
                this.method1143(arg0, var9, 0, var10, 0);
                if (this.field1124 < 0) {
                    this.field1124 = -1;
                    this.method1161();
                    this.method2179();
                }
            } else {
                this.method1106(arg0, var9, var7, var10, 0);
                if (this.field1124 >= var7) {
                    this.field1124 = var7;
                    this.method1161();
                    this.method2179();
                }
            }
        } else if (this.field1119) {
            if (this.field1114 < 0) {
                var9 = this.method1143(arg0, arg1, var5, var10, var4.field1021[this.field1127]);
                if (this.field1124 >= var5) {
                    return;
                }
                this.field1124 = var5 + var5 - 1 - this.field1124;
                this.field1114 = -this.field1114;
            }
            while (true) {
                int var11 = this.method1106(arg0, var9, var6, var10, var4.field1021[this.field1113 - 1]);
                if (this.field1124 < var6) {
                    return;
                }
                this.field1124 = var6 + var6 - 1 - this.field1124;
                this.field1114 = -this.field1114;
                var9 = this.method1143(arg0, var11, var5, var10, var4.field1021[this.field1127]);
                if (this.field1124 >= var5) {
                    return;
                }
                this.field1124 = var5 + var5 - 1 - this.field1124;
                this.field1114 = -this.field1114;
            }
        } else if (this.field1114 < 0) {
            while (true) {
                var9 = this.method1143(arg0, var9, var5, var10, var4.field1021[this.field1113 - 1]);
                if (this.field1124 >= var5) {
                    return;
                }
                this.field1124 = var6 - 1 - (var6 - 1 - this.field1124) % var8;
            }
        } else {
            while (true) {
                var9 = this.method1106(arg0, var9, var6, var10, var4.field1021[this.field1127]);
                if (this.field1124 < var6) {
                    return;
                }
                this.field1124 = (this.field1124 - var5) % var8 + var5;
            }
        }
    }

    @ObfuscatedName("bi.m(I)V")
    public synchronized void method857(int arg0) {
        if (this.field1123 > 0) {
            if (arg0 >= this.field1123) {
                if (this.field1115 == Integer.MIN_VALUE) {
                    this.field1115 = 0;
                    this.field1121 = 0;
                    this.field1118 = 0;
                    this.field1117 = 0;
                    this.method2179();
                    arg0 = this.field1123;
                }
                this.field1123 = 0;
                this.method1090();
            } else {
                this.field1117 += this.field1125 * arg0;
                this.field1118 += this.field1126 * arg0;
                this.field1121 += this.field1122 * arg0;
                this.field1123 -= arg0;
            }
        }
        class56 var2 = (class56) this.field1142;
        int var3 = this.field1127 << 8;
        int var4 = this.field1113 << 8;
        int var5 = var2.field1021.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field1120 = 0;
        }
        if (this.field1124 < 0) {
            if (this.field1114 <= 0) {
                this.method1161();
                this.method2179();
                return;
            }
            this.field1124 = 0;
        }
        if (this.field1124 >= var5) {
            if (this.field1114 >= 0) {
                this.method1161();
                this.method2179();
                return;
            }
            this.field1124 = var5 - 1;
        }
        this.field1124 += this.field1114 * arg0;
        if (this.field1120 >= 0) {
            if (this.field1120 > 0) {
                if (this.field1119) {
                    label121: {
                        if (this.field1114 < 0) {
                            if (this.field1124 >= var3) {
                                return;
                            }
                            this.field1124 = var3 + var3 - 1 - this.field1124;
                            this.field1114 = -this.field1114;
                            if (--this.field1120 == 0) {
                                break label121;
                            }
                        }
                        do {
                            if (this.field1124 < var4) {
                                return;
                            }
                            this.field1124 = var4 + var4 - 1 - this.field1124;
                            this.field1114 = -this.field1114;
                            if (--this.field1120 == 0) {
                                break;
                            }
                            if (this.field1124 >= var3) {
                                return;
                            }
                            this.field1124 = var3 + var3 - 1 - this.field1124;
                            this.field1114 = -this.field1114;
                        } while (--this.field1120 != 0);
                    }
                } else {
                    label153: {
                        if (this.field1114 < 0) {
                            if (this.field1124 >= var3) {
                                return;
                            }
                            int var7 = (var4 - 1 - this.field1124) / var6;
                            if (var7 >= this.field1120) {
                                this.field1124 += this.field1120 * var6;
                                this.field1120 = 0;
                                break label153;
                            }
                            this.field1124 += var6 * var7;
                            this.field1120 -= var7;
                        } else if (this.field1124 >= var4) {
                            int var8 = (this.field1124 - var3) / var6;
                            if (var8 >= this.field1120) {
                                this.field1124 -= this.field1120 * var6;
                                this.field1120 = 0;
                                break label153;
                            }
                            this.field1124 -= var6 * var8;
                            this.field1120 -= var8;
                        } else {
                            return;
                        }
                        return;
                    }
                }
            }
            if (this.field1114 < 0) {
                if (this.field1124 < 0) {
                    this.field1124 = -1;
                    this.method1161();
                    this.method2179();
                }
            } else if (this.field1124 >= var5) {
                this.field1124 = var5;
                this.method1161();
                this.method2179();
            }
        } else if (this.field1119) {
            if (this.field1114 < 0) {
                if (this.field1124 >= var3) {
                    return;
                }
                this.field1124 = var3 + var3 - 1 - this.field1124;
                this.field1114 = -this.field1114;
            }
            while (this.field1124 >= var4) {
                this.field1124 = var4 + var4 - 1 - this.field1124;
                this.field1114 = -this.field1114;
                if (this.field1124 >= var3) {
                    return;
                }
                this.field1124 = var3 + var3 - 1 - this.field1124;
                this.field1114 = -this.field1114;
            }
        } else if (this.field1114 < 0) {
            if (this.field1124 >= var3) {
                return;
            }
            this.field1124 = var4 - 1 - (var4 - 1 - this.field1124) % var6;
        } else if (this.field1124 >= var4) {
            this.field1124 = (this.field1124 - var3) % var6 + var3;
        } else {
            return;
        }
    }

    @ObfuscatedName("bi.af([IIIII)I")
    public int method1106(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1123 > 0) {
                int var6 = this.field1123 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1123 += arg1;
                if (this.field1114 == 256 && (this.field1124 & 0xFF) == 0) {
                    if (Statics.field1053) {
                        arg1 = method1117(0, ((class56) this.field1142).field1021, arg0, this.field1124, arg1, this.field1118, this.field1121, this.field1126, this.field1122, 0, var6, arg2, this);
                    } else {
                        arg1 = method1142(((class56) this.field1142).field1021, arg0, this.field1124, arg1, this.field1117, this.field1125, 0, var6, arg2, this);
                    }
                } else if (Statics.field1053) {
                    arg1 = method1086(0, 0, ((class56) this.field1142).field1021, arg0, this.field1124, arg1, this.field1118, this.field1121, this.field1126, this.field1122, 0, var6, arg2, this, this.field1114, arg4);
                } else {
                    arg1 = method1120(0, 0, ((class56) this.field1142).field1021, arg0, this.field1124, arg1, this.field1117, this.field1125, 0, var6, arg2, this, this.field1114, arg4);
                }
                this.field1123 -= arg1;
                if (this.field1123 != 0) {
                    return arg1;
                }
                if (!this.method1108()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1114 == 256 && (this.field1124 & 0xFF) == 0) {
                if (Statics.field1053) {
                    return method1110(0, ((class56) this.field1142).field1021, arg0, this.field1124, arg1, this.field1118, this.field1121, 0, arg3, arg2, this);
                }
                return method1091(((class56) this.field1142).field1021, arg0, this.field1124, arg1, this.field1117, 0, arg3, arg2, this);
            }
            if (Statics.field1053) {
                return method1114(0, 0, ((class56) this.field1142).field1021, arg0, this.field1124, arg1, this.field1118, this.field1121, 0, arg3, arg2, this, this.field1114, arg4);
            }
            return method1113(0, 0, ((class56) this.field1142).field1021, arg0, this.field1124, arg1, this.field1117, 0, arg3, arg2, this, this.field1114, arg4);
        }
    }

    @ObfuscatedName("bi.aj([IIIII)I")
    public int method1143(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1123 > 0) {
                int var6 = this.field1123 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1123 += arg1;
                if (this.field1114 == -256 && (this.field1124 & 0xFF) == 0) {
                    if (Statics.field1053) {
                        arg1 = method1119(0, ((class56) this.field1142).field1021, arg0, this.field1124, arg1, this.field1118, this.field1121, this.field1126, this.field1122, 0, var6, arg2, this);
                    } else {
                        arg1 = method1173(((class56) this.field1142).field1021, arg0, this.field1124, arg1, this.field1117, this.field1125, 0, var6, arg2, this);
                    }
                } else if (Statics.field1053) {
                    arg1 = method1154(0, 0, ((class56) this.field1142).field1021, arg0, this.field1124, arg1, this.field1118, this.field1121, this.field1126, this.field1122, 0, var6, arg2, this, this.field1114, arg4);
                } else {
                    arg1 = method1205(0, 0, ((class56) this.field1142).field1021, arg0, this.field1124, arg1, this.field1117, this.field1125, 0, var6, arg2, this, this.field1114, arg4);
                }
                this.field1123 -= arg1;
                if (this.field1123 != 0) {
                    return arg1;
                }
                if (!this.method1108()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1114 == -256 && (this.field1124 & 0xFF) == 0) {
                if (Statics.field1053) {
                    return method1214(0, ((class56) this.field1142).field1021, arg0, this.field1124, arg1, this.field1118, this.field1121, 0, arg3, arg2, this);
                }
                return method1111(((class56) this.field1142).field1021, arg0, this.field1124, arg1, this.field1117, 0, arg3, arg2, this);
            }
            if (Statics.field1053) {
                return method1116(0, 0, ((class56) this.field1142).field1021, arg0, this.field1124, arg1, this.field1118, this.field1121, 0, arg3, arg2, this, this.field1114, arg4);
            }
            return method1150(0, 0, ((class56) this.field1142).field1021, arg0, this.field1124, arg1, this.field1117, 0, arg3, arg2, this, this.field1114, arg4);
        }
    }

    @ObfuscatedName("bi.ap()Z")
    public boolean method1108() {
        int var1 = this.field1115;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method1100(var1, this.field1116);
            var2 = method1212(var1, this.field1116);
        }
        if (this.field1117 != var1 || this.field1118 != var3 || this.field1121 != var2) {
            if (this.field1117 < var1) {
                this.field1125 = 1;
                this.field1123 = var1 - this.field1117;
            } else if (this.field1117 > var1) {
                this.field1125 = -1;
                this.field1123 = this.field1117 - var1;
            } else {
                this.field1125 = 0;
            }
            if (this.field1118 < var3) {
                this.field1126 = 1;
                if (this.field1123 == 0 || this.field1123 > var3 - this.field1118) {
                    this.field1123 = var3 - this.field1118;
                }
            } else if (this.field1118 > var3) {
                this.field1126 = -1;
                if (this.field1123 == 0 || this.field1123 > this.field1118 - var3) {
                    this.field1123 = this.field1118 - var3;
                }
            } else {
                this.field1126 = 0;
            }
            if (this.field1121 < var2) {
                this.field1122 = 1;
                if (this.field1123 == 0 || this.field1123 > var2 - this.field1121) {
                    this.field1123 = var2 - this.field1121;
                }
            } else if (this.field1121 > var2) {
                this.field1122 = -1;
                if (this.field1123 == 0 || this.field1123 > this.field1121 - var2) {
                    this.field1123 = this.field1121 - var2;
                }
            } else {
                this.field1122 = 0;
            }
            return false;
        } else if (this.field1115 == Integer.MIN_VALUE) {
            this.field1115 = 0;
            this.field1121 = 0;
            this.field1118 = 0;
            this.field1117 = 0;
            this.method2179();
            return true;
        } else {
            this.method1090();
            return false;
        }
    }

    @ObfuscatedName("bi.ac([B[IIIIIIILbi;)I")
    public static int method1091(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class67 arg8) {
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
        arg8.field1124 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("bi.at(I[B[IIIIIIIILbi;)I")
    public static int method1110(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class67 arg10) {
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
        arg10.field1124 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("bi.av([B[IIIIIIILbi;)I")
    public static int method1111(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class67 arg8) {
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
        arg8.field1124 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("bi.am(I[B[IIIIIIIILbi;)I")
    public static int method1214(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class67 arg10) {
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
        arg10.field1124 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("bi.ak(II[B[IIIIIIILbi;II)I")
    public static int method1113(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class67 arg10, int arg11, int arg12) {
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
        arg10.field1124 = arg4;
        return arg5;
    }

    @ObfuscatedName("bi.au(II[B[IIIIIIIILbi;II)I")
    public static int method1114(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class67 arg11, int arg12, int arg13) {
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
        arg11.field1124 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("bi.ag(II[B[IIIIIIILbi;II)I")
    public static int method1150(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class67 arg10, int arg11, int arg12) {
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
        arg10.field1124 = arg4;
        return arg5;
    }

    @ObfuscatedName("bi.ab(II[B[IIIIIIIILbi;II)I")
    public static int method1116(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class67 arg11, int arg12, int arg13) {
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
        arg11.field1124 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("bi.bt([B[IIIIIIIILbi;)I")
    public static int method1142(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class67 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field1118 += (var14 - arg3) * arg9.field1126;
        arg9.field1121 += (var14 - arg3) * arg9.field1122;
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
        arg9.field1117 = var12 >> 2;
        arg9.field1124 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("bi.bw(I[B[IIIIIIIIIILbi;)I")
    public static int method1117(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class67 arg12) {
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
        arg12.field1117 += (var19 - arg4) * arg12.field1125;
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
        arg12.field1118 = var15 >> 2;
        arg12.field1121 = var16 >> 2;
        arg12.field1124 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("bi.bd([B[IIIIIIIILbi;)I")
    public static int method1173(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class67 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field1118 += (var14 - arg3) * arg9.field1126;
        arg9.field1121 += (var14 - arg3) * arg9.field1122;
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
        arg9.field1117 = var12 >> 2;
        arg9.field1124 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("bi.bs(I[B[IIIIIIIIIILbi;)I")
    public static int method1119(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class67 arg12) {
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
        arg12.field1117 += (var19 - arg4) * arg12.field1125;
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
        arg12.field1118 = var15 >> 2;
        arg12.field1121 = var16 >> 2;
        arg12.field1124 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("bi.bm(II[B[IIIIIIIILbi;II)I")
    public static int method1120(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class67 arg11, int arg12, int arg13) {
        arg11.field1118 -= arg11.field1126 * arg5;
        arg11.field1121 -= arg11.field1122 * arg5;
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
        arg11.field1118 += arg11.field1126 * arg5;
        arg11.field1121 += arg11.field1122 * arg5;
        arg11.field1117 = arg6;
        arg11.field1124 = arg4;
        return arg5;
    }

    @ObfuscatedName("bi.bb(II[B[IIIIIIIIIILbi;II)I")
    public static int method1086(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class67 arg13, int arg14, int arg15) {
        arg13.field1117 -= arg13.field1125 * arg5;
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
        arg13.field1117 += arg13.field1125 * var27;
        arg13.field1118 = arg6;
        arg13.field1121 = arg7;
        arg13.field1124 = arg4;
        return var27;
    }

    @ObfuscatedName("bi.bl(II[B[IIIIIIIILbi;II)I")
    public static int method1205(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class67 arg11, int arg12, int arg13) {
        arg11.field1118 -= arg11.field1126 * arg5;
        arg11.field1121 -= arg11.field1122 * arg5;
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
        arg11.field1118 += arg11.field1126 * arg5;
        arg11.field1121 += arg11.field1122 * arg5;
        arg11.field1117 = arg6;
        arg11.field1124 = arg4;
        return arg5;
    }

    @ObfuscatedName("bi.bp(II[B[IIIIIIIIIILbi;II)I")
    public static int method1154(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class67 arg13, int arg14, int arg15) {
        arg13.field1117 -= arg13.field1125 * arg5;
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
        arg13.field1117 += arg13.field1125 * var26;
        arg13.field1118 = arg6;
        arg13.field1121 = arg7;
        arg13.field1124 = arg4;
        return var26;
    }
}
