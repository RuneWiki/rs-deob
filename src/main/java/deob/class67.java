package deob;

@ObfuscatedName("bd")
public class class67 extends class69 {

    @ObfuscatedName("bd.u")
    public int field1121;

    @ObfuscatedName("bd.x")
    public int field1108;

    @ObfuscatedName("bd.i")
    public int field1107;

    @ObfuscatedName("bd.a")
    public int field1110;

    @ObfuscatedName("bd.f")
    public int field1117;

    @ObfuscatedName("bd.c")
    public int field1112;

    @ObfuscatedName("bd.d")
    public int field1113;

    @ObfuscatedName("bd.l")
    public int field1114;

    @ObfuscatedName("bd.g")
    public int field1115;

    @ObfuscatedName("bd.z")
    public int field1109;

    @ObfuscatedName("bd.t")
    public boolean field1111;

    @ObfuscatedName("bd.m")
    public int field1118;

    @ObfuscatedName("bd.q")
    public int field1119;

    @ObfuscatedName("bd.e")
    public int field1120;

    @ObfuscatedName("bd.v")
    public int field1116;

    @ObfuscatedName("bd.u(II)I")
    public static int method1143(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("bd.x(II)I")
    public static int method1097(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("bd.ar()I")
    public int method1098() {
        int var1 = this.field1117 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field1114 == 0) {
            var2 -= this.field1121 * var2 / (((class56) this.field1137).field1016.length << 8);
        } else if (this.field1114 >= 0) {
            var2 -= this.field1115 * var2 / ((class56) this.field1137).field1016.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    public class67(class56 arg0, int arg1, int arg2) {
        this.field1137 = arg0;
        this.field1115 = arg0.field1017;
        this.field1109 = arg0.field1015;
        this.field1111 = arg0.field1019;
        this.field1108 = arg1;
        this.field1107 = arg2;
        this.field1110 = 8192;
        this.field1121 = 0;
        this.method1102();
    }

    public class67(class56 arg0, int arg1, int arg2, int arg3) {
        this.field1137 = arg0;
        this.field1115 = arg0.field1017;
        this.field1109 = arg0.field1015;
        this.field1111 = arg0.field1019;
        this.field1108 = arg1;
        this.field1107 = arg2;
        this.field1110 = arg3;
        this.field1121 = 0;
        this.method1102();
    }

    @ObfuscatedName("bd.i(Lbe;II)Lbd;")
    public static class67 method1100(class56 arg0, int arg1, int arg2) {
        return arg0.field1016 == null || arg0.field1016.length == 0 ? null : new class67(arg0, (int) ((long) arg0.field1018 * 256L * (long) arg1 / (long) (Statics.field66 * 100)), arg2 << 6);
    }

    @ObfuscatedName("bd.a(Lbe;III)Lbd;")
    public static class67 method1101(class56 arg0, int arg1, int arg2, int arg3) {
        return arg0.field1016 == null || arg0.field1016.length == 0 ? null : new class67(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("bd.c()V")
    public void method1102() {
        this.field1117 = this.field1107;
        this.field1112 = method1143(this.field1107, this.field1110);
        this.field1113 = method1097(this.field1107, this.field1110);
    }

    @ObfuscatedName("bd.q(I)V")
    public synchronized void method1103(int arg0) {
        this.field1114 = arg0;
    }

    @ObfuscatedName("bd.v(I)V")
    public synchronized void method1104(int arg0) {
        this.method1106(arg0 << 6, this.method1144());
    }

    @ObfuscatedName("bd.j(I)V")
    public synchronized void method1105(int arg0) {
        this.method1106(arg0, this.method1144());
    }

    @ObfuscatedName("bd.p(II)V")
    public synchronized void method1106(int arg0, int arg1) {
        this.field1107 = arg0;
        this.field1110 = arg1;
        this.field1118 = 0;
        this.method1102();
    }

    @ObfuscatedName("bd.k()I")
    public synchronized int method1107() {
        return this.field1107 == Integer.MIN_VALUE ? 0 : this.field1107;
    }

    @ObfuscatedName("bd.r()I")
    public synchronized int method1144() {
        return this.field1110 < 0 ? -1 : this.field1110;
    }

    @ObfuscatedName("bd.y(I)V")
    public synchronized void method1109(int arg0) {
        int var2 = ((class56) this.field1137).field1016.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field1121 = arg0;
    }

    @ObfuscatedName("bd.h(Z)V")
    public synchronized void method1110(boolean arg0) {
        this.field1108 = (this.field1108 >>> 31) + (this.field1108 ^ this.field1108 >> 31);
        if (arg0) {
            this.field1108 = -this.field1108;
        }
    }

    @ObfuscatedName("bd.s()V")
    public void method1147() {
        if (this.field1118 == 0) {
            return;
        }
        if (this.field1107 == Integer.MIN_VALUE) {
            this.field1107 = 0;
        }
        this.field1118 = 0;
        this.method1102();
    }

    @ObfuscatedName("bd.w(II)V")
    public synchronized void method1212(int arg0, int arg1) {
        this.method1175(arg0, arg1, this.method1144());
    }

    @ObfuscatedName("bd.n(III)V")
    public synchronized void method1175(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method1106(arg1, arg2);
            return;
        }
        int var4 = method1143(arg1, arg2);
        int var5 = method1097(arg1, arg2);
        if (this.field1112 == var4 && this.field1113 == var5) {
            this.field1118 = 0;
            return;
        }
        int var6 = arg1 - this.field1117;
        if (this.field1117 - arg1 > var6) {
            var6 = this.field1117 - arg1;
        }
        if (var4 - this.field1112 > var6) {
            var6 = var4 - this.field1112;
        }
        if (this.field1112 - var4 > var6) {
            var6 = this.field1112 - var4;
        }
        if (var5 - this.field1113 > var6) {
            var6 = var5 - this.field1113;
        }
        if (this.field1113 - var5 > var6) {
            var6 = this.field1113 - var5;
        }
        if (arg0 > var6) {
            arg0 = var6;
        }
        this.field1118 = arg0;
        this.field1107 = arg1;
        this.field1110 = arg2;
        this.field1119 = (arg1 - this.field1117) / arg0;
        this.field1120 = (var4 - this.field1112) / arg0;
        this.field1116 = (var5 - this.field1113) / arg0;
    }

    @ObfuscatedName("bd.o(I)V")
    public synchronized void method1114(int arg0) {
        if (arg0 == 0) {
            this.method1105(0);
            this.method2228();
        } else if (this.field1112 == 0 && this.field1113 == 0) {
            this.field1118 = 0;
            this.field1107 = 0;
            this.field1117 = 0;
            this.method2228();
        } else {
            int var2 = -this.field1117;
            if (this.field1117 > var2) {
                var2 = this.field1117;
            }
            if (-this.field1112 > var2) {
                var2 = -this.field1112;
            }
            if (this.field1112 > var2) {
                var2 = this.field1112;
            }
            if (-this.field1113 > var2) {
                var2 = -this.field1113;
            }
            if (this.field1113 > var2) {
                var2 = this.field1113;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field1118 = arg0;
            this.field1107 = Integer.MIN_VALUE;
            this.field1119 = -this.field1117 / arg0;
            this.field1120 = -this.field1112 / arg0;
            this.field1116 = -this.field1113 / arg0;
        }
    }

    @ObfuscatedName("bd.b(I)V")
    public synchronized void method1115(int arg0) {
        if (this.field1108 < 0) {
            this.field1108 = -arg0;
        } else {
            this.field1108 = arg0;
        }
    }

    @ObfuscatedName("bd.az()I")
    public synchronized int method1177() {
        return this.field1108 < 0 ? -this.field1108 : this.field1108;
    }

    @ObfuscatedName("bd.ad()Z")
    public boolean method1117() {
        return this.field1121 < 0 || this.field1121 >= ((class56) this.field1137).field1016.length << 8;
    }

    @ObfuscatedName("bd.aw()Z")
    public boolean method1118() {
        return this.field1118 != 0;
    }

    @ObfuscatedName("bd.g()Lbx;")
    public class69 method879() {
        return null;
    }

    @ObfuscatedName("bd.z()Lbx;")
    public class69 method896() {
        return null;
    }

    @ObfuscatedName("bd.t()I")
    public int method889() {
        return this.field1107 == 0 && this.field1118 == 0 ? 0 : 1;
    }

    @ObfuscatedName("bd.m([III)V")
    public synchronized void method912(int[] arg0, int arg1, int arg2) {
        if (this.field1107 == 0 && this.field1118 == 0) {
            this.method887(arg2);
            return;
        }
        class56 var4 = (class56) this.field1137;
        int var5 = this.field1115 << 8;
        int var6 = this.field1109 << 8;
        int var7 = var4.field1016.length << 8;
        int var8 = var6 - var5;
        if (var8 <= 0) {
            this.field1114 = 0;
        }
        int var9 = arg1;
        int var10 = arg1 + arg2;
        if (this.field1121 < 0) {
            if (this.field1108 <= 0) {
                this.method1147();
                this.method2228();
                return;
            }
            this.field1121 = 0;
        }
        if (this.field1121 >= var7) {
            if (this.field1108 >= 0) {
                this.method1147();
                this.method2228();
                return;
            }
            this.field1121 = var7 - 1;
        }
        if (this.field1114 >= 0) {
            if (this.field1114 > 0) {
                if (this.field1111) {
                    label131: {
                        if (this.field1108 < 0) {
                            var9 = this.method1120(arg0, arg1, var5, var10, var4.field1016[this.field1115]);
                            if (this.field1121 >= var5) {
                                return;
                            }
                            this.field1121 = var5 + var5 - 1 - this.field1121;
                            this.field1108 = -this.field1108;
                            if (--this.field1114 == 0) {
                                break label131;
                            }
                        }
                        do {
                            var9 = this.method1099(arg0, var9, var6, var10, var4.field1016[this.field1109 - 1]);
                            if (this.field1121 < var6) {
                                return;
                            }
                            this.field1121 = var6 + var6 - 1 - this.field1121;
                            this.field1108 = -this.field1108;
                            if (--this.field1114 == 0) {
                                break;
                            }
                            var9 = this.method1120(arg0, var9, var5, var10, var4.field1016[this.field1115]);
                            if (this.field1121 >= var5) {
                                return;
                            }
                            this.field1121 = var5 + var5 - 1 - this.field1121;
                            this.field1108 = -this.field1108;
                        } while (--this.field1114 != 0);
                    }
                } else if (this.field1108 < 0) {
                    while (true) {
                        var9 = this.method1120(arg0, var9, var5, var10, var4.field1016[this.field1109 - 1]);
                        if (this.field1121 >= var5) {
                            return;
                        }
                        int var12 = (var6 - 1 - this.field1121) / var8;
                        if (var12 >= this.field1114) {
                            this.field1121 += this.field1114 * var8;
                            this.field1114 = 0;
                            break;
                        }
                        this.field1121 += var8 * var12;
                        this.field1114 -= var12;
                    }
                } else {
                    while (true) {
                        var9 = this.method1099(arg0, var9, var6, var10, var4.field1016[this.field1115]);
                        if (this.field1121 < var6) {
                            return;
                        }
                        int var13 = (this.field1121 - var5) / var8;
                        if (var13 >= this.field1114) {
                            this.field1121 -= this.field1114 * var8;
                            this.field1114 = 0;
                            break;
                        }
                        this.field1121 -= var8 * var13;
                        this.field1114 -= var13;
                    }
                }
            }
            if (this.field1108 < 0) {
                this.method1120(arg0, var9, 0, var10, 0);
                if (this.field1121 < 0) {
                    this.field1121 = -1;
                    this.method1147();
                    this.method2228();
                }
            } else {
                this.method1099(arg0, var9, var7, var10, 0);
                if (this.field1121 >= var7) {
                    this.field1121 = var7;
                    this.method1147();
                    this.method2228();
                }
            }
        } else if (this.field1111) {
            if (this.field1108 < 0) {
                var9 = this.method1120(arg0, arg1, var5, var10, var4.field1016[this.field1115]);
                if (this.field1121 >= var5) {
                    return;
                }
                this.field1121 = var5 + var5 - 1 - this.field1121;
                this.field1108 = -this.field1108;
            }
            while (true) {
                int var11 = this.method1099(arg0, var9, var6, var10, var4.field1016[this.field1109 - 1]);
                if (this.field1121 < var6) {
                    return;
                }
                this.field1121 = var6 + var6 - 1 - this.field1121;
                this.field1108 = -this.field1108;
                var9 = this.method1120(arg0, var11, var5, var10, var4.field1016[this.field1115]);
                if (this.field1121 >= var5) {
                    return;
                }
                this.field1121 = var5 + var5 - 1 - this.field1121;
                this.field1108 = -this.field1108;
            }
        } else if (this.field1108 < 0) {
            while (true) {
                var9 = this.method1120(arg0, var9, var5, var10, var4.field1016[this.field1109 - 1]);
                if (this.field1121 >= var5) {
                    return;
                }
                this.field1121 = var6 - 1 - (var6 - 1 - this.field1121) % var8;
            }
        } else {
            while (true) {
                var9 = this.method1099(arg0, var9, var6, var10, var4.field1016[this.field1115]);
                if (this.field1121 < var6) {
                    return;
                }
                this.field1121 = (this.field1121 - var5) % var8 + var5;
            }
        }
    }

    @ObfuscatedName("bd.e(I)V")
    public synchronized void method887(int arg0) {
        if (this.field1118 > 0) {
            if (arg0 >= this.field1118) {
                if (this.field1107 == Integer.MIN_VALUE) {
                    this.field1107 = 0;
                    this.field1113 = 0;
                    this.field1112 = 0;
                    this.field1117 = 0;
                    this.method2228();
                    arg0 = this.field1118;
                }
                this.field1118 = 0;
                this.method1102();
            } else {
                this.field1117 += this.field1119 * arg0;
                this.field1112 += this.field1120 * arg0;
                this.field1113 += this.field1116 * arg0;
                this.field1118 -= arg0;
            }
        }
        class56 var2 = (class56) this.field1137;
        int var3 = this.field1115 << 8;
        int var4 = this.field1109 << 8;
        int var5 = var2.field1016.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field1114 = 0;
        }
        if (this.field1121 < 0) {
            if (this.field1108 <= 0) {
                this.method1147();
                this.method2228();
                return;
            }
            this.field1121 = 0;
        }
        if (this.field1121 >= var5) {
            if (this.field1108 >= 0) {
                this.method1147();
                this.method2228();
                return;
            }
            this.field1121 = var5 - 1;
        }
        this.field1121 += this.field1108 * arg0;
        if (this.field1114 >= 0) {
            if (this.field1114 > 0) {
                if (this.field1111) {
                    label121: {
                        if (this.field1108 < 0) {
                            if (this.field1121 >= var3) {
                                return;
                            }
                            this.field1121 = var3 + var3 - 1 - this.field1121;
                            this.field1108 = -this.field1108;
                            if (--this.field1114 == 0) {
                                break label121;
                            }
                        }
                        do {
                            if (this.field1121 < var4) {
                                return;
                            }
                            this.field1121 = var4 + var4 - 1 - this.field1121;
                            this.field1108 = -this.field1108;
                            if (--this.field1114 == 0) {
                                break;
                            }
                            if (this.field1121 >= var3) {
                                return;
                            }
                            this.field1121 = var3 + var3 - 1 - this.field1121;
                            this.field1108 = -this.field1108;
                        } while (--this.field1114 != 0);
                    }
                } else {
                    label153: {
                        if (this.field1108 < 0) {
                            if (this.field1121 >= var3) {
                                return;
                            }
                            int var7 = (var4 - 1 - this.field1121) / var6;
                            if (var7 >= this.field1114) {
                                this.field1121 += this.field1114 * var6;
                                this.field1114 = 0;
                                break label153;
                            }
                            this.field1121 += var6 * var7;
                            this.field1114 -= var7;
                        } else if (this.field1121 >= var4) {
                            int var8 = (this.field1121 - var3) / var6;
                            if (var8 >= this.field1114) {
                                this.field1121 -= this.field1114 * var6;
                                this.field1114 = 0;
                                break label153;
                            }
                            this.field1121 -= var6 * var8;
                            this.field1114 -= var8;
                        } else {
                            return;
                        }
                        return;
                    }
                }
            }
            if (this.field1108 < 0) {
                if (this.field1121 < 0) {
                    this.field1121 = -1;
                    this.method1147();
                    this.method2228();
                }
            } else if (this.field1121 >= var5) {
                this.field1121 = var5;
                this.method1147();
                this.method2228();
            }
        } else if (this.field1111) {
            if (this.field1108 < 0) {
                if (this.field1121 >= var3) {
                    return;
                }
                this.field1121 = var3 + var3 - 1 - this.field1121;
                this.field1108 = -this.field1108;
            }
            while (this.field1121 >= var4) {
                this.field1121 = var4 + var4 - 1 - this.field1121;
                this.field1108 = -this.field1108;
                if (this.field1121 >= var3) {
                    return;
                }
                this.field1121 = var3 + var3 - 1 - this.field1121;
                this.field1108 = -this.field1108;
            }
        } else if (this.field1108 < 0) {
            if (this.field1121 >= var3) {
                return;
            }
            this.field1121 = var4 - 1 - (var4 - 1 - this.field1121) % var6;
        } else if (this.field1121 >= var4) {
            this.field1121 = (this.field1121 - var3) % var6 + var3;
        } else {
            return;
        }
    }

    @ObfuscatedName("bd.am([IIIII)I")
    public int method1099(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1118 > 0) {
                int var6 = this.field1118 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1118 += arg1;
                if (this.field1108 == 256 && (this.field1121 & 0xFF) == 0) {
                    if (Statics.field1056) {
                        arg1 = method1131(0, ((class56) this.field1137).field1016, arg0, this.field1121, arg1, this.field1112, this.field1113, this.field1120, this.field1116, 0, var6, arg2, this);
                    } else {
                        arg1 = method1151(((class56) this.field1137).field1016, arg0, this.field1121, arg1, this.field1117, this.field1119, 0, var6, arg2, this);
                    }
                } else if (Statics.field1056) {
                    arg1 = method1136(0, 0, ((class56) this.field1137).field1016, arg0, this.field1121, arg1, this.field1112, this.field1113, this.field1120, this.field1116, 0, var6, arg2, this, this.field1108, arg4);
                } else {
                    arg1 = method1145(0, 0, ((class56) this.field1137).field1016, arg0, this.field1121, arg1, this.field1117, this.field1119, 0, var6, arg2, this, this.field1108, arg4);
                }
                this.field1118 -= arg1;
                if (this.field1118 != 0) {
                    return arg1;
                }
                if (!this.method1113()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1108 == 256 && (this.field1121 & 0xFF) == 0) {
                if (Statics.field1056) {
                    return method1123(0, ((class56) this.field1137).field1016, arg0, this.field1121, arg1, this.field1112, this.field1113, 0, arg3, arg2, this);
                }
                return method1189(((class56) this.field1137).field1016, arg0, this.field1121, arg1, this.field1117, 0, arg3, arg2, this);
            }
            if (Statics.field1056) {
                return method1127(0, 0, ((class56) this.field1137).field1016, arg0, this.field1121, arg1, this.field1112, this.field1113, 0, arg3, arg2, this, this.field1108, arg4);
            }
            return method1126(0, 0, ((class56) this.field1137).field1016, arg0, this.field1121, arg1, this.field1117, 0, arg3, arg2, this, this.field1108, arg4);
        }
    }

    @ObfuscatedName("bd.ay([IIIII)I")
    public int method1120(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1118 > 0) {
                int var6 = this.field1118 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1118 += arg1;
                if (this.field1108 == -256 && (this.field1121 & 0xFF) == 0) {
                    if (Statics.field1056) {
                        arg1 = method1133(0, ((class56) this.field1137).field1016, arg0, this.field1121, arg1, this.field1112, this.field1113, this.field1120, this.field1116, 0, var6, arg2, this);
                    } else {
                        arg1 = method1132(((class56) this.field1137).field1016, arg0, this.field1121, arg1, this.field1117, this.field1119, 0, var6, arg2, this);
                    }
                } else if (Statics.field1056) {
                    arg1 = method1137(0, 0, ((class56) this.field1137).field1016, arg0, this.field1121, arg1, this.field1112, this.field1113, this.field1120, this.field1116, 0, var6, arg2, this, this.field1108, arg4);
                } else {
                    arg1 = method1163(0, 0, ((class56) this.field1137).field1016, arg0, this.field1121, arg1, this.field1117, this.field1119, 0, var6, arg2, this, this.field1108, arg4);
                }
                this.field1118 -= arg1;
                if (this.field1118 != 0) {
                    return arg1;
                }
                if (!this.method1113()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1108 == -256 && (this.field1121 & 0xFF) == 0) {
                if (Statics.field1056) {
                    return method1125(0, ((class56) this.field1137).field1016, arg0, this.field1121, arg1, this.field1112, this.field1113, 0, arg3, arg2, this);
                }
                return method1112(((class56) this.field1137).field1016, arg0, this.field1121, arg1, this.field1117, 0, arg3, arg2, this);
            }
            if (Statics.field1056) {
                return method1129(0, 0, ((class56) this.field1137).field1016, arg0, this.field1121, arg1, this.field1112, this.field1113, 0, arg3, arg2, this, this.field1108, arg4);
            }
            return method1128(0, 0, ((class56) this.field1137).field1016, arg0, this.field1121, arg1, this.field1117, 0, arg3, arg2, this, this.field1108, arg4);
        }
    }

    @ObfuscatedName("bd.ab()Z")
    public boolean method1113() {
        int var1 = this.field1107;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method1143(var1, this.field1110);
            var2 = method1097(var1, this.field1110);
        }
        if (this.field1117 != var1 || this.field1112 != var3 || this.field1113 != var2) {
            if (this.field1117 < var1) {
                this.field1119 = 1;
                this.field1118 = var1 - this.field1117;
            } else if (this.field1117 > var1) {
                this.field1119 = -1;
                this.field1118 = this.field1117 - var1;
            } else {
                this.field1119 = 0;
            }
            if (this.field1112 < var3) {
                this.field1120 = 1;
                if (this.field1118 == 0 || this.field1118 > var3 - this.field1112) {
                    this.field1118 = var3 - this.field1112;
                }
            } else if (this.field1112 > var3) {
                this.field1120 = -1;
                if (this.field1118 == 0 || this.field1118 > this.field1112 - var3) {
                    this.field1118 = this.field1112 - var3;
                }
            } else {
                this.field1120 = 0;
            }
            if (this.field1113 < var2) {
                this.field1116 = 1;
                if (this.field1118 == 0 || this.field1118 > var2 - this.field1113) {
                    this.field1118 = var2 - this.field1113;
                }
            } else if (this.field1113 > var2) {
                this.field1116 = -1;
                if (this.field1118 == 0 || this.field1118 > this.field1113 - var2) {
                    this.field1118 = this.field1113 - var2;
                }
            } else {
                this.field1116 = 0;
            }
            return false;
        } else if (this.field1107 == Integer.MIN_VALUE) {
            this.field1107 = 0;
            this.field1113 = 0;
            this.field1112 = 0;
            this.field1117 = 0;
            this.method2228();
            return true;
        } else {
            this.method1102();
            return false;
        }
    }

    @ObfuscatedName("bd.as([B[IIIIIIILbd;)I")
    public static int method1189(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class67 arg8) {
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
        arg8.field1121 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("bd.ap(I[B[IIIIIIIILbd;)I")
    public static int method1123(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class67 arg10) {
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
        arg10.field1121 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("bd.ae([B[IIIIIIILbd;)I")
    public static int method1112(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class67 arg8) {
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
        arg8.field1121 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("bd.ao(I[B[IIIIIIIILbd;)I")
    public static int method1125(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class67 arg10) {
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
        arg10.field1121 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("bd.au(II[B[IIIIIIILbd;II)I")
    public static int method1126(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class67 arg10, int arg11, int arg12) {
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
        arg10.field1121 = arg4;
        return arg5;
    }

    @ObfuscatedName("bd.bw(II[B[IIIIIIIILbd;II)I")
    public static int method1127(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class67 arg11, int arg12, int arg13) {
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
        arg11.field1121 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("bd.bv(II[B[IIIIIIILbd;II)I")
    public static int method1128(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class67 arg10, int arg11, int arg12) {
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
        arg10.field1121 = arg4;
        return arg5;
    }

    @ObfuscatedName("bd.bz(II[B[IIIIIIIILbd;II)I")
    public static int method1129(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class67 arg11, int arg12, int arg13) {
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
        arg11.field1121 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("bd.be([B[IIIIIIIILbd;)I")
    public static int method1151(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class67 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field1112 += (var14 - arg3) * arg9.field1120;
        arg9.field1113 += (var14 - arg3) * arg9.field1116;
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
        arg9.field1121 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("bd.bt(I[B[IIIIIIIIIILbd;)I")
    public static int method1131(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class67 arg12) {
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
        arg12.field1117 += (var19 - arg4) * arg12.field1119;
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
        arg12.field1113 = var16 >> 2;
        arg12.field1121 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("bd.bm([B[IIIIIIIILbd;)I")
    public static int method1132(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class67 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field1112 += (var14 - arg3) * arg9.field1120;
        arg9.field1113 += (var14 - arg3) * arg9.field1116;
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
        arg9.field1121 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("bd.bb(I[B[IIIIIIIIIILbd;)I")
    public static int method1133(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class67 arg12) {
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
        arg12.field1117 += (var19 - arg4) * arg12.field1119;
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
        arg12.field1113 = var16 >> 2;
        arg12.field1121 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("bd.bu(II[B[IIIIIIIILbd;II)I")
    public static int method1145(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class67 arg11, int arg12, int arg13) {
        arg11.field1112 -= arg11.field1120 * arg5;
        arg11.field1113 -= arg11.field1116 * arg5;
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
        arg11.field1112 += arg11.field1120 * arg5;
        arg11.field1113 += arg11.field1116 * arg5;
        arg11.field1117 = arg6;
        arg11.field1121 = arg4;
        return arg5;
    }

    @ObfuscatedName("bd.bn(II[B[IIIIIIIIIILbd;II)I")
    public static int method1136(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class67 arg13, int arg14, int arg15) {
        arg13.field1117 -= arg13.field1119 * arg5;
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
        arg13.field1117 += arg13.field1119 * var27;
        arg13.field1112 = arg6;
        arg13.field1113 = arg7;
        arg13.field1121 = arg4;
        return var27;
    }

    @ObfuscatedName("bd.by(II[B[IIIIIIIILbd;II)I")
    public static int method1163(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class67 arg11, int arg12, int arg13) {
        arg11.field1112 -= arg11.field1120 * arg5;
        arg11.field1113 -= arg11.field1116 * arg5;
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
        arg11.field1112 += arg11.field1120 * arg5;
        arg11.field1113 += arg11.field1116 * arg5;
        arg11.field1117 = arg6;
        arg11.field1121 = arg4;
        return arg5;
    }

    @ObfuscatedName("bd.bl(II[B[IIIIIIIIIILbd;II)I")
    public static int method1137(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class67 arg13, int arg14, int arg15) {
        arg13.field1117 -= arg13.field1119 * arg5;
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
        arg13.field1117 += arg13.field1119 * var26;
        arg13.field1112 = arg6;
        arg13.field1113 = arg7;
        arg13.field1121 = arg4;
        return var26;
    }
}
