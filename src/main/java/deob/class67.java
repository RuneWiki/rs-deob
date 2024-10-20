package deob;

@ObfuscatedName("bx")
public class class67 extends class69 {

    @ObfuscatedName("bx.b")
    public int field1099;

    @ObfuscatedName("bx.l")
    public int field1107;

    @ObfuscatedName("bx.i")
    public int field1100;

    @ObfuscatedName("bx.t")
    public int field1101;

    @ObfuscatedName("bx.k")
    public int field1102;

    @ObfuscatedName("bx.h")
    public int field1112;

    @ObfuscatedName("bx.n")
    public int field1103;

    @ObfuscatedName("bx.f")
    public int field1105;

    @ObfuscatedName("bx.a")
    public int field1098;

    @ObfuscatedName("bx.r")
    public int field1108;

    @ObfuscatedName("bx.x")
    public boolean field1104;

    @ObfuscatedName("bx.z")
    public int field1109;

    @ObfuscatedName("bx.p")
    public int field1106;

    @ObfuscatedName("bx.s")
    public int field1111;

    @ObfuscatedName("bx.o")
    public int field1110;

    @ObfuscatedName("bx.b(II)I")
    public static int method1227(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("bx.l(II)I")
    public static int method1190(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("bx.ad()I")
    public int method1191() {
        int var1 = this.field1102 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field1105 == 0) {
            var2 -= this.field1099 * var2 / (((class56) this.field1128).field1010.length << 8);
        } else if (this.field1105 >= 0) {
            var2 -= this.field1098 * var2 / ((class56) this.field1128).field1010.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    public class67(class56 arg0, int arg1, int arg2) {
        this.field1128 = arg0;
        this.field1098 = arg0.field1011;
        this.field1108 = arg0.field1009;
        this.field1104 = arg0.field1013;
        this.field1107 = arg1;
        this.field1100 = arg2;
        this.field1101 = 8192;
        this.field1099 = 0;
        this.method1194();
    }

    public class67(class56 arg0, int arg1, int arg2, int arg3) {
        this.field1128 = arg0;
        this.field1098 = arg0.field1011;
        this.field1108 = arg0.field1009;
        this.field1104 = arg0.field1013;
        this.field1107 = arg1;
        this.field1100 = arg2;
        this.field1101 = arg3;
        this.field1099 = 0;
        this.method1194();
    }

    @ObfuscatedName("bx.i(Lbl;II)Lbx;")
    public static class67 method1192(class56 arg0, int arg1, int arg2) {
        return arg0.field1010 == null || arg0.field1010.length == 0 ? null : new class67(arg0, (int) ((long) arg0.field1012 * 256L * (long) arg1 / (long) (Statics.field3080 * 100)), arg2 << 6);
    }

    @ObfuscatedName("bx.t(Lbl;III)Lbx;")
    public static class67 method1193(class56 arg0, int arg1, int arg2, int arg3) {
        return arg0.field1010 == null || arg0.field1010.length == 0 ? null : new class67(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("bx.k()V")
    public void method1194() {
        this.field1102 = this.field1100;
        this.field1112 = method1227(this.field1100, this.field1101);
        this.field1103 = method1190(this.field1100, this.field1101);
    }

    @ObfuscatedName("bx.o(I)V")
    public synchronized void method1195(int arg0) {
        this.field1105 = arg0;
    }

    @ObfuscatedName("bx.w(I)V")
    public synchronized void method1212(int arg0) {
        this.method1296(arg0 << 6, this.method1234());
    }

    @ObfuscatedName("bx.m(I)V")
    public synchronized void method1197(int arg0) {
        this.method1296(arg0, this.method1234());
    }

    @ObfuscatedName("bx.u(II)V")
    public synchronized void method1296(int arg0, int arg1) {
        this.field1100 = arg0;
        this.field1101 = arg1;
        this.field1109 = 0;
        this.method1194();
    }

    @ObfuscatedName("bx.q()I")
    public synchronized int method1199() {
        return this.field1100 == Integer.MIN_VALUE ? 0 : this.field1100;
    }

    @ObfuscatedName("bx.c()I")
    public synchronized int method1234() {
        return this.field1101 < 0 ? -1 : this.field1101;
    }

    @ObfuscatedName("bx.v(I)V")
    public synchronized void method1203(int arg0) {
        int var2 = ((class56) this.field1128).field1010.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field1099 = arg0;
    }

    @ObfuscatedName("bx.e(Z)V")
    public synchronized void method1202(boolean arg0) {
        this.field1107 = (this.field1107 >>> 31) + (this.field1107 ^ this.field1107 >> 31);
        if (arg0) {
            this.field1107 = -this.field1107;
        }
    }

    @ObfuscatedName("bx.j()V")
    public void method1313() {
        if (this.field1109 == 0) {
            return;
        }
        if (this.field1100 == Integer.MIN_VALUE) {
            this.field1100 = 0;
        }
        this.field1109 = 0;
        this.method1194();
    }

    @ObfuscatedName("bx.d(II)V")
    public synchronized void method1204(int arg0, int arg1) {
        this.method1312(arg0, arg1, this.method1234());
    }

    @ObfuscatedName("bx.g(III)V")
    public synchronized void method1312(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method1296(arg1, arg2);
            return;
        }
        int var4 = method1227(arg1, arg2);
        int var5 = method1190(arg1, arg2);
        if (this.field1112 == var4 && this.field1103 == var5) {
            this.field1109 = 0;
            return;
        }
        int var6 = arg1 - this.field1102;
        if (this.field1102 - arg1 > var6) {
            var6 = this.field1102 - arg1;
        }
        if (var4 - this.field1112 > var6) {
            var6 = var4 - this.field1112;
        }
        if (this.field1112 - var4 > var6) {
            var6 = this.field1112 - var4;
        }
        if (var5 - this.field1103 > var6) {
            var6 = var5 - this.field1103;
        }
        if (this.field1103 - var5 > var6) {
            var6 = this.field1103 - var5;
        }
        if (arg0 > var6) {
            arg0 = var6;
        }
        this.field1109 = arg0;
        this.field1100 = arg1;
        this.field1101 = arg2;
        this.field1106 = (arg1 - this.field1102) / arg0;
        this.field1111 = (var4 - this.field1112) / arg0;
        this.field1110 = (var5 - this.field1103) / arg0;
    }

    @ObfuscatedName("bx.ap(I)V")
    public synchronized void method1246(int arg0) {
        if (arg0 == 0) {
            this.method1197(0);
            this.method2313();
        } else if (this.field1112 == 0 && this.field1103 == 0) {
            this.field1109 = 0;
            this.field1100 = 0;
            this.field1102 = 0;
            this.method2313();
        } else {
            int var2 = -this.field1102;
            if (this.field1102 > var2) {
                var2 = this.field1102;
            }
            if (-this.field1112 > var2) {
                var2 = -this.field1112;
            }
            if (this.field1112 > var2) {
                var2 = this.field1112;
            }
            if (-this.field1103 > var2) {
                var2 = -this.field1103;
            }
            if (this.field1103 > var2) {
                var2 = this.field1103;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field1109 = arg0;
            this.field1100 = Integer.MIN_VALUE;
            this.field1106 = -this.field1102 / arg0;
            this.field1111 = -this.field1112 / arg0;
            this.field1110 = -this.field1103 / arg0;
        }
    }

    @ObfuscatedName("bx.aj(I)V")
    public synchronized void method1207(int arg0) {
        if (this.field1107 < 0) {
            this.field1107 = -arg0;
        } else {
            this.field1107 = arg0;
        }
    }

    @ObfuscatedName("bx.ab()I")
    public synchronized int method1189() {
        return this.field1107 < 0 ? -this.field1107 : this.field1107;
    }

    @ObfuscatedName("bx.ay()Z")
    public boolean method1209() {
        return this.field1099 < 0 || this.field1099 >= ((class56) this.field1128).field1010.length << 8;
    }

    @ObfuscatedName("bx.aa()Z")
    public boolean method1210() {
        return this.field1109 != 0;
    }

    @ObfuscatedName("bx.x()Lbq;")
    public class69 method996() {
        return null;
    }

    @ObfuscatedName("bx.z()Lbq;")
    public class69 method970() {
        return null;
    }

    @ObfuscatedName("bx.p()I")
    public int method971() {
        return this.field1100 == 0 && this.field1109 == 0 ? 0 : 1;
    }

    @ObfuscatedName("bx.s([III)V")
    public synchronized void method985(int[] arg0, int arg1, int arg2) {
        if (this.field1100 == 0 && this.field1109 == 0) {
            this.method974(arg2);
            return;
        }
        class56 var4 = (class56) this.field1128;
        int var5 = this.field1098 << 8;
        int var6 = this.field1108 << 8;
        int var7 = var4.field1010.length << 8;
        int var8 = var6 - var5;
        if (var8 <= 0) {
            this.field1105 = 0;
        }
        int var9 = arg1;
        int var10 = arg1 + arg2;
        if (this.field1099 < 0) {
            if (this.field1107 <= 0) {
                this.method1313();
                this.method2313();
                return;
            }
            this.field1099 = 0;
        }
        if (this.field1099 >= var7) {
            if (this.field1107 >= 0) {
                this.method1313();
                this.method2313();
                return;
            }
            this.field1099 = var7 - 1;
        }
        if (this.field1105 >= 0) {
            if (this.field1105 > 0) {
                if (this.field1104) {
                    label131: {
                        if (this.field1107 < 0) {
                            var9 = this.method1201(arg0, arg1, var5, var10, var4.field1010[this.field1098]);
                            if (this.field1099 >= var5) {
                                return;
                            }
                            this.field1099 = var5 + var5 - 1 - this.field1099;
                            this.field1107 = -this.field1107;
                            if (--this.field1105 == 0) {
                                break label131;
                            }
                        }
                        do {
                            var9 = this.method1213(arg0, var9, var6, var10, var4.field1010[this.field1108 - 1]);
                            if (this.field1099 < var6) {
                                return;
                            }
                            this.field1099 = var6 + var6 - 1 - this.field1099;
                            this.field1107 = -this.field1107;
                            if (--this.field1105 == 0) {
                                break;
                            }
                            var9 = this.method1201(arg0, var9, var5, var10, var4.field1010[this.field1098]);
                            if (this.field1099 >= var5) {
                                return;
                            }
                            this.field1099 = var5 + var5 - 1 - this.field1099;
                            this.field1107 = -this.field1107;
                        } while (--this.field1105 != 0);
                    }
                } else if (this.field1107 < 0) {
                    while (true) {
                        var9 = this.method1201(arg0, var9, var5, var10, var4.field1010[this.field1108 - 1]);
                        if (this.field1099 >= var5) {
                            return;
                        }
                        int var12 = (var6 - 1 - this.field1099) / var8;
                        if (var12 >= this.field1105) {
                            this.field1099 += this.field1105 * var8;
                            this.field1105 = 0;
                            break;
                        }
                        this.field1099 += var8 * var12;
                        this.field1105 -= var12;
                    }
                } else {
                    while (true) {
                        var9 = this.method1213(arg0, var9, var6, var10, var4.field1010[this.field1098]);
                        if (this.field1099 < var6) {
                            return;
                        }
                        int var13 = (this.field1099 - var5) / var8;
                        if (var13 >= this.field1105) {
                            this.field1099 -= this.field1105 * var8;
                            this.field1105 = 0;
                            break;
                        }
                        this.field1099 -= var8 * var13;
                        this.field1105 -= var13;
                    }
                }
            }
            if (this.field1107 < 0) {
                this.method1201(arg0, var9, 0, var10, 0);
                if (this.field1099 < 0) {
                    this.field1099 = -1;
                    this.method1313();
                    this.method2313();
                }
            } else {
                this.method1213(arg0, var9, var7, var10, 0);
                if (this.field1099 >= var7) {
                    this.field1099 = var7;
                    this.method1313();
                    this.method2313();
                }
            }
        } else if (this.field1104) {
            if (this.field1107 < 0) {
                var9 = this.method1201(arg0, arg1, var5, var10, var4.field1010[this.field1098]);
                if (this.field1099 >= var5) {
                    return;
                }
                this.field1099 = var5 + var5 - 1 - this.field1099;
                this.field1107 = -this.field1107;
            }
            while (true) {
                int var11 = this.method1213(arg0, var9, var6, var10, var4.field1010[this.field1108 - 1]);
                if (this.field1099 < var6) {
                    return;
                }
                this.field1099 = var6 + var6 - 1 - this.field1099;
                this.field1107 = -this.field1107;
                var9 = this.method1201(arg0, var11, var5, var10, var4.field1010[this.field1098]);
                if (this.field1099 >= var5) {
                    return;
                }
                this.field1099 = var5 + var5 - 1 - this.field1099;
                this.field1107 = -this.field1107;
            }
        } else if (this.field1107 < 0) {
            while (true) {
                var9 = this.method1201(arg0, var9, var5, var10, var4.field1010[this.field1108 - 1]);
                if (this.field1099 >= var5) {
                    return;
                }
                this.field1099 = var6 - 1 - (var6 - 1 - this.field1099) % var8;
            }
        } else {
            while (true) {
                var9 = this.method1213(arg0, var9, var6, var10, var4.field1010[this.field1098]);
                if (this.field1099 < var6) {
                    return;
                }
                this.field1099 = (this.field1099 - var5) % var8 + var5;
            }
        }
    }

    @ObfuscatedName("bx.y(I)V")
    public synchronized void method974(int arg0) {
        if (this.field1109 > 0) {
            if (arg0 >= this.field1109) {
                if (this.field1100 == Integer.MIN_VALUE) {
                    this.field1100 = 0;
                    this.field1103 = 0;
                    this.field1112 = 0;
                    this.field1102 = 0;
                    this.method2313();
                    arg0 = this.field1109;
                }
                this.field1109 = 0;
                this.method1194();
            } else {
                this.field1102 += this.field1106 * arg0;
                this.field1112 += this.field1111 * arg0;
                this.field1103 += this.field1110 * arg0;
                this.field1109 -= arg0;
            }
        }
        class56 var2 = (class56) this.field1128;
        int var3 = this.field1098 << 8;
        int var4 = this.field1108 << 8;
        int var5 = var2.field1010.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field1105 = 0;
        }
        if (this.field1099 < 0) {
            if (this.field1107 <= 0) {
                this.method1313();
                this.method2313();
                return;
            }
            this.field1099 = 0;
        }
        if (this.field1099 >= var5) {
            if (this.field1107 >= 0) {
                this.method1313();
                this.method2313();
                return;
            }
            this.field1099 = var5 - 1;
        }
        this.field1099 += this.field1107 * arg0;
        if (this.field1105 >= 0) {
            if (this.field1105 > 0) {
                if (this.field1104) {
                    label121: {
                        if (this.field1107 < 0) {
                            if (this.field1099 >= var3) {
                                return;
                            }
                            this.field1099 = var3 + var3 - 1 - this.field1099;
                            this.field1107 = -this.field1107;
                            if (--this.field1105 == 0) {
                                break label121;
                            }
                        }
                        do {
                            if (this.field1099 < var4) {
                                return;
                            }
                            this.field1099 = var4 + var4 - 1 - this.field1099;
                            this.field1107 = -this.field1107;
                            if (--this.field1105 == 0) {
                                break;
                            }
                            if (this.field1099 >= var3) {
                                return;
                            }
                            this.field1099 = var3 + var3 - 1 - this.field1099;
                            this.field1107 = -this.field1107;
                        } while (--this.field1105 != 0);
                    }
                } else {
                    label153: {
                        if (this.field1107 < 0) {
                            if (this.field1099 >= var3) {
                                return;
                            }
                            int var7 = (var4 - 1 - this.field1099) / var6;
                            if (var7 >= this.field1105) {
                                this.field1099 += this.field1105 * var6;
                                this.field1105 = 0;
                                break label153;
                            }
                            this.field1099 += var6 * var7;
                            this.field1105 -= var7;
                        } else if (this.field1099 >= var4) {
                            int var8 = (this.field1099 - var3) / var6;
                            if (var8 >= this.field1105) {
                                this.field1099 -= this.field1105 * var6;
                                this.field1105 = 0;
                                break label153;
                            }
                            this.field1099 -= var6 * var8;
                            this.field1105 -= var8;
                        } else {
                            return;
                        }
                        return;
                    }
                }
            }
            if (this.field1107 < 0) {
                if (this.field1099 < 0) {
                    this.field1099 = -1;
                    this.method1313();
                    this.method2313();
                }
            } else if (this.field1099 >= var5) {
                this.field1099 = var5;
                this.method1313();
                this.method2313();
            }
        } else if (this.field1104) {
            if (this.field1107 < 0) {
                if (this.field1099 >= var3) {
                    return;
                }
                this.field1099 = var3 + var3 - 1 - this.field1099;
                this.field1107 = -this.field1107;
            }
            while (this.field1099 >= var4) {
                this.field1099 = var4 + var4 - 1 - this.field1099;
                this.field1107 = -this.field1107;
                if (this.field1099 >= var3) {
                    return;
                }
                this.field1099 = var3 + var3 - 1 - this.field1099;
                this.field1107 = -this.field1107;
            }
        } else if (this.field1107 < 0) {
            if (this.field1099 >= var3) {
                return;
            }
            this.field1099 = var4 - 1 - (var4 - 1 - this.field1099) % var6;
        } else if (this.field1099 >= var4) {
            this.field1099 = (this.field1099 - var3) % var6 + var3;
        } else {
            return;
        }
    }

    @ObfuscatedName("bx.ar([IIIII)I")
    public int method1213(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1109 > 0) {
                int var6 = this.field1109 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1109 += arg1;
                if (this.field1107 == 256 && (this.field1099 & 0xFF) == 0) {
                    if (Statics.field1033) {
                        arg1 = method1225(0, ((class56) this.field1128).field1010, arg0, this.field1099, arg1, this.field1112, this.field1103, this.field1111, this.field1110, 0, var6, arg2, this);
                    } else {
                        arg1 = method1317(((class56) this.field1128).field1010, arg0, this.field1099, arg1, this.field1102, this.field1106, 0, var6, arg2, this);
                    }
                } else if (Statics.field1033) {
                    arg1 = method1222(0, 0, ((class56) this.field1128).field1010, arg0, this.field1099, arg1, this.field1112, this.field1103, this.field1111, this.field1110, 0, var6, arg2, this, this.field1107, arg4);
                } else {
                    arg1 = method1198(0, 0, ((class56) this.field1128).field1010, arg0, this.field1099, arg1, this.field1102, this.field1106, 0, var6, arg2, this, this.field1107, arg4);
                }
                this.field1109 -= arg1;
                if (this.field1109 != 0) {
                    return arg1;
                }
                if (!this.method1215()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1107 == 256 && (this.field1099 & 0xFF) == 0) {
                if (Statics.field1033) {
                    return method1217(0, ((class56) this.field1128).field1010, arg0, this.field1099, arg1, this.field1112, this.field1103, 0, arg3, arg2, this);
                }
                return method1232(((class56) this.field1128).field1010, arg0, this.field1099, arg1, this.field1102, 0, arg3, arg2, this);
            }
            if (Statics.field1033) {
                return method1221(0, 0, ((class56) this.field1128).field1010, arg0, this.field1099, arg1, this.field1112, this.field1103, 0, arg3, arg2, this, this.field1107, arg4);
            }
            return method1260(0, 0, ((class56) this.field1128).field1010, arg0, this.field1099, arg1, this.field1102, 0, arg3, arg2, this, this.field1107, arg4);
        }
    }

    @ObfuscatedName("bx.ag([IIIII)I")
    public int method1201(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1109 > 0) {
                int var6 = this.field1109 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1109 += arg1;
                if (this.field1107 == -256 && (this.field1099 & 0xFF) == 0) {
                    if (Statics.field1033) {
                        arg1 = method1211(0, ((class56) this.field1128).field1010, arg0, this.field1099, arg1, this.field1112, this.field1103, this.field1111, this.field1110, 0, var6, arg2, this);
                    } else {
                        arg1 = method1242(((class56) this.field1128).field1010, arg0, this.field1099, arg1, this.field1102, this.field1106, 0, var6, arg2, this);
                    }
                } else if (Statics.field1033) {
                    arg1 = method1230(0, 0, ((class56) this.field1128).field1010, arg0, this.field1099, arg1, this.field1112, this.field1103, this.field1111, this.field1110, 0, var6, arg2, this, this.field1107, arg4);
                } else {
                    arg1 = method1229(0, 0, ((class56) this.field1128).field1010, arg0, this.field1099, arg1, this.field1102, this.field1106, 0, var6, arg2, this, this.field1107, arg4);
                }
                this.field1109 -= arg1;
                if (this.field1109 != 0) {
                    return arg1;
                }
                if (!this.method1215()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1107 == -256 && (this.field1099 & 0xFF) == 0) {
                if (Statics.field1033) {
                    return method1219(0, ((class56) this.field1128).field1010, arg0, this.field1099, arg1, this.field1112, this.field1103, 0, arg3, arg2, this);
                }
                return method1218(((class56) this.field1128).field1010, arg0, this.field1099, arg1, this.field1102, 0, arg3, arg2, this);
            }
            if (Statics.field1033) {
                return method1293(0, 0, ((class56) this.field1128).field1010, arg0, this.field1099, arg1, this.field1112, this.field1103, 0, arg3, arg2, this, this.field1107, arg4);
            }
            return method1223(0, 0, ((class56) this.field1128).field1010, arg0, this.field1099, arg1, this.field1102, 0, arg3, arg2, this, this.field1107, arg4);
        }
    }

    @ObfuscatedName("bx.al()Z")
    public boolean method1215() {
        int var1 = this.field1100;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method1227(var1, this.field1101);
            var2 = method1190(var1, this.field1101);
        }
        if (this.field1102 != var1 || this.field1112 != var3 || this.field1103 != var2) {
            if (this.field1102 < var1) {
                this.field1106 = 1;
                this.field1109 = var1 - this.field1102;
            } else if (this.field1102 > var1) {
                this.field1106 = -1;
                this.field1109 = this.field1102 - var1;
            } else {
                this.field1106 = 0;
            }
            if (this.field1112 < var3) {
                this.field1111 = 1;
                if (this.field1109 == 0 || this.field1109 > var3 - this.field1112) {
                    this.field1109 = var3 - this.field1112;
                }
            } else if (this.field1112 > var3) {
                this.field1111 = -1;
                if (this.field1109 == 0 || this.field1109 > this.field1112 - var3) {
                    this.field1109 = this.field1112 - var3;
                }
            } else {
                this.field1111 = 0;
            }
            if (this.field1103 < var2) {
                this.field1110 = 1;
                if (this.field1109 == 0 || this.field1109 > var2 - this.field1103) {
                    this.field1109 = var2 - this.field1103;
                }
            } else if (this.field1103 > var2) {
                this.field1110 = -1;
                if (this.field1109 == 0 || this.field1109 > this.field1103 - var2) {
                    this.field1109 = this.field1103 - var2;
                }
            } else {
                this.field1110 = 0;
            }
            return false;
        } else if (this.field1100 == Integer.MIN_VALUE) {
            this.field1100 = 0;
            this.field1103 = 0;
            this.field1112 = 0;
            this.field1102 = 0;
            this.method2313();
            return true;
        } else {
            this.method1194();
            return false;
        }
    }

    @ObfuscatedName("bx.ah([B[IIIIIIILbx;)I")
    public static int method1232(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class67 arg8) {
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
        arg8.field1099 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("bx.ak(I[B[IIIIIIIILbx;)I")
    public static int method1217(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class67 arg10) {
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
        arg10.field1099 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("bx.ax([B[IIIIIIILbx;)I")
    public static int method1218(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class67 arg8) {
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
        arg8.field1099 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("bx.av(I[B[IIIIIIIILbx;)I")
    public static int method1219(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class67 arg10) {
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
        arg10.field1099 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("bx.az(II[B[IIIIIIILbx;II)I")
    public static int method1260(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class67 arg10, int arg11, int arg12) {
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
        arg10.field1099 = arg4;
        return arg5;
    }

    @ObfuscatedName("bx.ao(II[B[IIIIIIIILbx;II)I")
    public static int method1221(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class67 arg11, int arg12, int arg13) {
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
        arg11.field1099 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("bx.aq(II[B[IIIIIIILbx;II)I")
    public static int method1223(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class67 arg10, int arg11, int arg12) {
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
        arg10.field1099 = arg4;
        return arg5;
    }

    @ObfuscatedName("bx.by(II[B[IIIIIIIILbx;II)I")
    public static int method1293(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class67 arg11, int arg12, int arg13) {
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
        arg11.field1099 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("bx.bj([B[IIIIIIIILbx;)I")
    public static int method1317(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class67 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field1112 += (var14 - arg3) * arg9.field1111;
        arg9.field1103 += (var14 - arg3) * arg9.field1110;
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
        arg9.field1102 = var12 >> 2;
        arg9.field1099 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("bx.bg(I[B[IIIIIIIIIILbx;)I")
    public static int method1225(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class67 arg12) {
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
        arg12.field1102 += (var19 - arg4) * arg12.field1106;
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
        arg12.field1112 = var15 >> 2;
        arg12.field1103 = var16 >> 2;
        arg12.field1099 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("bx.bl([B[IIIIIIIILbx;)I")
    public static int method1242(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class67 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field1112 += (var14 - arg3) * arg9.field1111;
        arg9.field1103 += (var14 - arg3) * arg9.field1110;
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
        arg9.field1102 = var12 >> 2;
        arg9.field1099 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("bx.ba(I[B[IIIIIIIIIILbx;)I")
    public static int method1211(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class67 arg12) {
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
        arg12.field1102 += (var19 - arg4) * arg12.field1106;
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
        arg12.field1112 = var15 >> 2;
        arg12.field1103 = var16 >> 2;
        arg12.field1099 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("bx.bi(II[B[IIIIIIIILbx;II)I")
    public static int method1198(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class67 arg11, int arg12, int arg13) {
        arg11.field1112 -= arg11.field1111 * arg5;
        arg11.field1103 -= arg11.field1110 * arg5;
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
        arg11.field1112 += arg11.field1111 * arg5;
        arg11.field1103 += arg11.field1110 * arg5;
        arg11.field1102 = arg6;
        arg11.field1099 = arg4;
        return arg5;
    }

    @ObfuscatedName("bx.bf(II[B[IIIIIIIIIILbx;II)I")
    public static int method1222(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class67 arg13, int arg14, int arg15) {
        arg13.field1102 -= arg13.field1106 * arg5;
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
        arg13.field1102 += arg13.field1106 * var27;
        arg13.field1112 = arg6;
        arg13.field1103 = arg7;
        arg13.field1099 = arg4;
        return var27;
    }

    @ObfuscatedName("bx.bd(II[B[IIIIIIIILbx;II)I")
    public static int method1229(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class67 arg11, int arg12, int arg13) {
        arg11.field1112 -= arg11.field1111 * arg5;
        arg11.field1103 -= arg11.field1110 * arg5;
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
        arg11.field1112 += arg11.field1111 * arg5;
        arg11.field1103 += arg11.field1110 * arg5;
        arg11.field1102 = arg6;
        arg11.field1099 = arg4;
        return arg5;
    }

    @ObfuscatedName("bx.bk(II[B[IIIIIIIIIILbx;II)I")
    public static int method1230(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class67 arg13, int arg14, int arg15) {
        arg13.field1102 -= arg13.field1106 * arg5;
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
        arg13.field1102 += arg13.field1106 * var26;
        arg13.field1112 = arg6;
        arg13.field1103 = arg7;
        arg13.field1099 = arg4;
        return var26;
    }
}
