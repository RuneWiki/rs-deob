package deob;

@ObfuscatedName("be")
public class class58 extends class60 {

    @ObfuscatedName("be.z")
    public int field1122;

    @ObfuscatedName("be.j")
    public int field1117;

    @ObfuscatedName("be.a")
    public int field1118;

    @ObfuscatedName("be.y")
    public int field1125;

    @ObfuscatedName("be.i")
    public int field1116;

    @ObfuscatedName("be.b")
    public int field1121;

    @ObfuscatedName("be.s")
    public int field1129;

    @ObfuscatedName("be.q")
    public int field1123;

    @ObfuscatedName("be.p")
    public int field1124;

    @ObfuscatedName("be.h")
    public int field1120;

    @ObfuscatedName("be.r")
    public boolean field1126;

    @ObfuscatedName("be.o")
    public int field1127;

    @ObfuscatedName("be.f")
    public int field1128;

    @ObfuscatedName("be.u")
    public int field1119;

    @ObfuscatedName("be.c")
    public int field1130;

    @ObfuscatedName("be.z(II)I")
    public static int method1123(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("be.j(II)I")
    public static int method1068(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("be.as()I")
    public int method1069() {
        int var1 = this.field1116 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field1123 == 0) {
            var2 -= this.field1122 * var2 / (((class56) this.field1132).field1100.length << 8);
        } else if (this.field1123 >= 0) {
            var2 -= this.field1124 * var2 / ((class56) this.field1132).field1100.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    public class58(class56 arg0, int arg1, int arg2) {
        this.field1132 = arg0;
        this.field1124 = arg0.field1101;
        this.field1120 = arg0.field1102;
        this.field1126 = arg0.field1099;
        this.field1117 = arg1;
        this.field1118 = arg2;
        this.field1125 = 8192;
        this.field1122 = 0;
        this.method1072();
    }

    public class58(class56 arg0, int arg1, int arg2, int arg3) {
        this.field1132 = arg0;
        this.field1124 = arg0.field1101;
        this.field1120 = arg0.field1102;
        this.field1126 = arg0.field1099;
        this.field1117 = arg1;
        this.field1118 = arg2;
        this.field1125 = arg3;
        this.field1122 = 0;
        this.method1072();
    }

    @ObfuscatedName("be.a(Lbi;II)Lbe;")
    public static class58 method1160(class56 arg0, int arg1, int arg2) {
        return arg0.field1100 == null || arg0.field1100.length == 0 ? null : new class58(arg0, (int) ((long) arg0.field1103 * 256L * (long) arg1 / (long) (Statics.field1044 * 100)), arg2 << 6);
    }

    @ObfuscatedName("be.y(Lbi;III)Lbe;")
    public static class58 method1071(class56 arg0, int arg1, int arg2, int arg3) {
        return arg0.field1100 == null || arg0.field1100.length == 0 ? null : new class58(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("be.i()V")
    public void method1072() {
        this.field1116 = this.field1118;
        this.field1121 = method1123(this.field1118, this.field1125);
        this.field1129 = method1068(this.field1118, this.field1125);
    }

    @ObfuscatedName("be.h(I)V")
    public synchronized void method1073(int arg0) {
        this.field1123 = arg0;
    }

    @ObfuscatedName("be.o(I)V")
    public synchronized void method1074(int arg0) {
        this.method1178(arg0 << 6, this.method1078());
    }

    @ObfuscatedName("be.f(I)V")
    public synchronized void method1121(int arg0) {
        this.method1178(arg0, this.method1078());
    }

    @ObfuscatedName("be.u(II)V")
    public synchronized void method1178(int arg0, int arg1) {
        this.field1118 = arg0;
        this.field1125 = arg1;
        this.field1127 = 0;
        this.method1072();
    }

    @ObfuscatedName("be.c()I")
    public synchronized int method1077() {
        return this.field1118 == Integer.MIN_VALUE ? 0 : this.field1118;
    }

    @ObfuscatedName("be.l()I")
    public synchronized int method1078() {
        return this.field1125 < 0 ? -1 : this.field1125;
    }

    @ObfuscatedName("be.w(I)V")
    public synchronized void method1070(int arg0) {
        int var2 = ((class56) this.field1132).field1100.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field1122 = arg0;
    }

    @ObfuscatedName("be.x(Z)V")
    public synchronized void method1080(boolean arg0) {
        this.field1117 = (this.field1117 >>> 31) + (this.field1117 ^ this.field1117 >> 31);
        if (arg0) {
            this.field1117 = -this.field1117;
        }
    }

    @ObfuscatedName("be.t()V")
    public void method1081() {
        if (this.field1127 == 0) {
            return;
        }
        if (this.field1118 == Integer.MIN_VALUE) {
            this.field1118 = 0;
        }
        this.field1127 = 0;
        this.method1072();
    }

    @ObfuscatedName("be.k(II)V")
    public synchronized void method1082(int arg0, int arg1) {
        this.method1083(arg0, arg1, this.method1078());
    }

    @ObfuscatedName("be.ao(III)V")
    public synchronized void method1083(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method1178(arg1, arg2);
            return;
        }
        int var4 = method1123(arg1, arg2);
        int var5 = method1068(arg1, arg2);
        if (this.field1121 == var4 && this.field1129 == var5) {
            this.field1127 = 0;
            return;
        }
        int var6 = arg1 - this.field1116;
        if (this.field1116 - arg1 > var6) {
            var6 = this.field1116 - arg1;
        }
        if (var4 - this.field1121 > var6) {
            var6 = var4 - this.field1121;
        }
        if (this.field1121 - var4 > var6) {
            var6 = this.field1121 - var4;
        }
        if (var5 - this.field1129 > var6) {
            var6 = var5 - this.field1129;
        }
        if (this.field1129 - var5 > var6) {
            var6 = this.field1129 - var5;
        }
        if (arg0 > var6) {
            arg0 = var6;
        }
        this.field1127 = arg0;
        this.field1118 = arg1;
        this.field1125 = arg2;
        this.field1128 = (arg1 - this.field1116) / arg0;
        this.field1119 = (var4 - this.field1121) / arg0;
        this.field1130 = (var5 - this.field1129) / arg0;
    }

    @ObfuscatedName("be.af(I)V")
    public synchronized void method1084(int arg0) {
        if (arg0 == 0) {
            this.method1121(0);
            this.method3311();
        } else if (this.field1121 == 0 && this.field1129 == 0) {
            this.field1127 = 0;
            this.field1118 = 0;
            this.field1116 = 0;
            this.method3311();
        } else {
            int var2 = -this.field1116;
            if (this.field1116 > var2) {
                var2 = this.field1116;
            }
            if (-this.field1121 > var2) {
                var2 = -this.field1121;
            }
            if (this.field1121 > var2) {
                var2 = this.field1121;
            }
            if (-this.field1129 > var2) {
                var2 = -this.field1129;
            }
            if (this.field1129 > var2) {
                var2 = this.field1129;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field1127 = arg0;
            this.field1118 = Integer.MIN_VALUE;
            this.field1128 = -this.field1116 / arg0;
            this.field1119 = -this.field1121 / arg0;
            this.field1130 = -this.field1129 / arg0;
        }
    }

    @ObfuscatedName("be.ag(I)V")
    public synchronized void method1085(int arg0) {
        if (this.field1117 < 0) {
            this.field1117 = -arg0;
        } else {
            this.field1117 = arg0;
        }
    }

    @ObfuscatedName("be.aj()I")
    public synchronized int method1086() {
        return this.field1117 < 0 ? -this.field1117 : this.field1117;
    }

    @ObfuscatedName("be.al()Z")
    public boolean method1087() {
        return this.field1122 < 0 || this.field1122 >= ((class56) this.field1132).field1100.length << 8;
    }

    @ObfuscatedName("be.ai()Z")
    public boolean method1088() {
        return this.field1127 != 0;
    }

    @ObfuscatedName("be.b()Lbq;")
    public class60 method943() {
        return null;
    }

    @ObfuscatedName("be.s()Lbq;")
    public class60 method941() {
        return null;
    }

    @ObfuscatedName("be.q()I")
    public int method942() {
        return this.field1118 == 0 && this.field1127 == 0 ? 0 : 1;
    }

    @ObfuscatedName("be.p([III)V")
    public synchronized void method946(int[] arg0, int arg1, int arg2) {
        if (this.field1118 == 0 && this.field1127 == 0) {
            this.method945(arg2);
            return;
        }
        class56 var4 = (class56) this.field1132;
        int var5 = this.field1124 << 8;
        int var6 = this.field1120 << 8;
        int var7 = var4.field1100.length << 8;
        int var8 = var6 - var5;
        if (var8 <= 0) {
            this.field1123 = 0;
        }
        int var9 = arg1;
        int var10 = arg1 + arg2;
        if (this.field1122 < 0) {
            if (this.field1117 <= 0) {
                this.method1081();
                this.method3311();
                return;
            }
            this.field1122 = 0;
        }
        if (this.field1122 >= var7) {
            if (this.field1117 >= 0) {
                this.method1081();
                this.method3311();
                return;
            }
            this.field1122 = var7 - 1;
        }
        if (this.field1123 >= 0) {
            if (this.field1123 > 0) {
                if (this.field1126) {
                    label131: {
                        if (this.field1117 < 0) {
                            var9 = this.method1133(arg0, arg1, var5, var10, var4.field1100[this.field1124]);
                            if (this.field1122 >= var5) {
                                return;
                            }
                            this.field1122 = var5 + var5 - 1 - this.field1122;
                            this.field1117 = -this.field1117;
                            if (--this.field1123 == 0) {
                                break label131;
                            }
                        }
                        do {
                            var9 = this.method1089(arg0, var9, var6, var10, var4.field1100[this.field1120 - 1]);
                            if (this.field1122 < var6) {
                                return;
                            }
                            this.field1122 = var6 + var6 - 1 - this.field1122;
                            this.field1117 = -this.field1117;
                            if (--this.field1123 == 0) {
                                break;
                            }
                            var9 = this.method1133(arg0, var9, var5, var10, var4.field1100[this.field1124]);
                            if (this.field1122 >= var5) {
                                return;
                            }
                            this.field1122 = var5 + var5 - 1 - this.field1122;
                            this.field1117 = -this.field1117;
                        } while (--this.field1123 != 0);
                    }
                } else if (this.field1117 < 0) {
                    while (true) {
                        var9 = this.method1133(arg0, var9, var5, var10, var4.field1100[this.field1120 - 1]);
                        if (this.field1122 >= var5) {
                            return;
                        }
                        int var12 = (var6 - 1 - this.field1122) / var8;
                        if (var12 >= this.field1123) {
                            this.field1122 += this.field1123 * var8;
                            this.field1123 = 0;
                            break;
                        }
                        this.field1122 += var8 * var12;
                        this.field1123 -= var12;
                    }
                } else {
                    while (true) {
                        var9 = this.method1089(arg0, var9, var6, var10, var4.field1100[this.field1124]);
                        if (this.field1122 < var6) {
                            return;
                        }
                        int var13 = (this.field1122 - var5) / var8;
                        if (var13 >= this.field1123) {
                            this.field1122 -= this.field1123 * var8;
                            this.field1123 = 0;
                            break;
                        }
                        this.field1122 -= var8 * var13;
                        this.field1123 -= var13;
                    }
                }
            }
            if (this.field1117 < 0) {
                this.method1133(arg0, var9, 0, var10, 0);
                if (this.field1122 < 0) {
                    this.field1122 = -1;
                    this.method1081();
                    this.method3311();
                }
            } else {
                this.method1089(arg0, var9, var7, var10, 0);
                if (this.field1122 >= var7) {
                    this.field1122 = var7;
                    this.method1081();
                    this.method3311();
                }
            }
        } else if (this.field1126) {
            if (this.field1117 < 0) {
                var9 = this.method1133(arg0, arg1, var5, var10, var4.field1100[this.field1124]);
                if (this.field1122 >= var5) {
                    return;
                }
                this.field1122 = var5 + var5 - 1 - this.field1122;
                this.field1117 = -this.field1117;
            }
            while (true) {
                int var11 = this.method1089(arg0, var9, var6, var10, var4.field1100[this.field1120 - 1]);
                if (this.field1122 < var6) {
                    return;
                }
                this.field1122 = var6 + var6 - 1 - this.field1122;
                this.field1117 = -this.field1117;
                var9 = this.method1133(arg0, var11, var5, var10, var4.field1100[this.field1124]);
                if (this.field1122 >= var5) {
                    return;
                }
                this.field1122 = var5 + var5 - 1 - this.field1122;
                this.field1117 = -this.field1117;
            }
        } else if (this.field1117 < 0) {
            while (true) {
                var9 = this.method1133(arg0, var9, var5, var10, var4.field1100[this.field1120 - 1]);
                if (this.field1122 >= var5) {
                    return;
                }
                this.field1122 = var6 - 1 - (var6 - 1 - this.field1122) % var8;
            }
        } else {
            while (true) {
                var9 = this.method1089(arg0, var9, var6, var10, var4.field1100[this.field1124]);
                if (this.field1122 < var6) {
                    return;
                }
                this.field1122 = (this.field1122 - var5) % var8 + var5;
            }
        }
    }

    @ObfuscatedName("be.r(I)V")
    public synchronized void method945(int arg0) {
        if (this.field1127 > 0) {
            if (arg0 >= this.field1127) {
                if (this.field1118 == Integer.MIN_VALUE) {
                    this.field1118 = 0;
                    this.field1129 = 0;
                    this.field1121 = 0;
                    this.field1116 = 0;
                    this.method3311();
                    arg0 = this.field1127;
                }
                this.field1127 = 0;
                this.method1072();
            } else {
                this.field1116 += this.field1128 * arg0;
                this.field1121 += this.field1119 * arg0;
                this.field1129 += this.field1130 * arg0;
                this.field1127 -= arg0;
            }
        }
        class56 var2 = (class56) this.field1132;
        int var3 = this.field1124 << 8;
        int var4 = this.field1120 << 8;
        int var5 = var2.field1100.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field1123 = 0;
        }
        if (this.field1122 < 0) {
            if (this.field1117 <= 0) {
                this.method1081();
                this.method3311();
                return;
            }
            this.field1122 = 0;
        }
        if (this.field1122 >= var5) {
            if (this.field1117 >= 0) {
                this.method1081();
                this.method3311();
                return;
            }
            this.field1122 = var5 - 1;
        }
        this.field1122 += this.field1117 * arg0;
        if (this.field1123 >= 0) {
            if (this.field1123 > 0) {
                if (this.field1126) {
                    label121: {
                        if (this.field1117 < 0) {
                            if (this.field1122 >= var3) {
                                return;
                            }
                            this.field1122 = var3 + var3 - 1 - this.field1122;
                            this.field1117 = -this.field1117;
                            if (--this.field1123 == 0) {
                                break label121;
                            }
                        }
                        do {
                            if (this.field1122 < var4) {
                                return;
                            }
                            this.field1122 = var4 + var4 - 1 - this.field1122;
                            this.field1117 = -this.field1117;
                            if (--this.field1123 == 0) {
                                break;
                            }
                            if (this.field1122 >= var3) {
                                return;
                            }
                            this.field1122 = var3 + var3 - 1 - this.field1122;
                            this.field1117 = -this.field1117;
                        } while (--this.field1123 != 0);
                    }
                } else {
                    label153: {
                        if (this.field1117 < 0) {
                            if (this.field1122 >= var3) {
                                return;
                            }
                            int var7 = (var4 - 1 - this.field1122) / var6;
                            if (var7 >= this.field1123) {
                                this.field1122 += this.field1123 * var6;
                                this.field1123 = 0;
                                break label153;
                            }
                            this.field1122 += var6 * var7;
                            this.field1123 -= var7;
                        } else if (this.field1122 >= var4) {
                            int var8 = (this.field1122 - var3) / var6;
                            if (var8 >= this.field1123) {
                                this.field1122 -= this.field1123 * var6;
                                this.field1123 = 0;
                                break label153;
                            }
                            this.field1122 -= var6 * var8;
                            this.field1123 -= var8;
                        } else {
                            return;
                        }
                        return;
                    }
                }
            }
            if (this.field1117 < 0) {
                if (this.field1122 < 0) {
                    this.field1122 = -1;
                    this.method1081();
                    this.method3311();
                }
            } else if (this.field1122 >= var5) {
                this.field1122 = var5;
                this.method1081();
                this.method3311();
            }
        } else if (this.field1126) {
            if (this.field1117 < 0) {
                if (this.field1122 >= var3) {
                    return;
                }
                this.field1122 = var3 + var3 - 1 - this.field1122;
                this.field1117 = -this.field1117;
            }
            while (this.field1122 >= var4) {
                this.field1122 = var4 + var4 - 1 - this.field1122;
                this.field1117 = -this.field1117;
                if (this.field1122 >= var3) {
                    return;
                }
                this.field1122 = var3 + var3 - 1 - this.field1122;
                this.field1117 = -this.field1117;
            }
        } else if (this.field1117 < 0) {
            if (this.field1122 >= var3) {
                return;
            }
            this.field1122 = var4 - 1 - (var4 - 1 - this.field1122) % var6;
        } else if (this.field1122 >= var4) {
            this.field1122 = (this.field1122 - var3) % var6 + var3;
        } else {
            return;
        }
    }

    @ObfuscatedName("be.az([IIIII)I")
    public int method1089(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1127 > 0) {
                int var6 = this.field1127 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1127 += arg1;
                if (this.field1117 == 256 && (this.field1122 & 0xFF) == 0) {
                    if (Statics.field1042) {
                        arg1 = method1101(0, ((class56) this.field1132).field1100, arg0, this.field1122, arg1, this.field1121, this.field1129, this.field1119, this.field1130, 0, var6, arg2, this);
                    } else {
                        arg1 = method1100(((class56) this.field1132).field1100, arg0, this.field1122, arg1, this.field1116, this.field1128, 0, var6, arg2, this);
                    }
                } else if (Statics.field1042) {
                    arg1 = method1105(0, 0, ((class56) this.field1132).field1100, arg0, this.field1122, arg1, this.field1121, this.field1129, this.field1119, this.field1130, 0, var6, arg2, this, this.field1117, arg4);
                } else {
                    arg1 = method1104(0, 0, ((class56) this.field1132).field1100, arg0, this.field1122, arg1, this.field1116, this.field1128, 0, var6, arg2, this, this.field1117, arg4);
                }
                this.field1127 -= arg1;
                if (this.field1127 != 0) {
                    return arg1;
                }
                if (!this.method1205()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1117 == 256 && (this.field1122 & 0xFF) == 0) {
                if (Statics.field1042) {
                    return method1200(0, ((class56) this.field1132).field1100, arg0, this.field1122, arg1, this.field1121, this.field1129, 0, arg3, arg2, this);
                }
                return method1201(((class56) this.field1132).field1100, arg0, this.field1122, arg1, this.field1116, 0, arg3, arg2, this);
            }
            if (Statics.field1042) {
                return method1097(0, 0, ((class56) this.field1132).field1100, arg0, this.field1122, arg1, this.field1121, this.field1129, 0, arg3, arg2, this, this.field1117, arg4);
            }
            return method1182(0, 0, ((class56) this.field1132).field1100, arg0, this.field1122, arg1, this.field1116, 0, arg3, arg2, this, this.field1117, arg4);
        }
    }

    @ObfuscatedName("be.aw([IIIII)I")
    public int method1133(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1127 > 0) {
                int var6 = this.field1127 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1127 += arg1;
                if (this.field1117 == -256 && (this.field1122 & 0xFF) == 0) {
                    if (Statics.field1042) {
                        arg1 = method1198(0, ((class56) this.field1132).field1100, arg0, this.field1122, arg1, this.field1121, this.field1129, this.field1119, this.field1130, 0, var6, arg2, this);
                    } else {
                        arg1 = method1102(((class56) this.field1132).field1100, arg0, this.field1122, arg1, this.field1116, this.field1128, 0, var6, arg2, this);
                    }
                } else if (Statics.field1042) {
                    arg1 = method1114(0, 0, ((class56) this.field1132).field1100, arg0, this.field1122, arg1, this.field1121, this.field1129, this.field1119, this.field1130, 0, var6, arg2, this, this.field1117, arg4);
                } else {
                    arg1 = method1106(0, 0, ((class56) this.field1132).field1100, arg0, this.field1122, arg1, this.field1116, this.field1128, 0, var6, arg2, this, this.field1117, arg4);
                }
                this.field1127 -= arg1;
                if (this.field1127 != 0) {
                    return arg1;
                }
                if (!this.method1205()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1117 == -256 && (this.field1122 & 0xFF) == 0) {
                if (Statics.field1042) {
                    return method1095(0, ((class56) this.field1132).field1100, arg0, this.field1122, arg1, this.field1121, this.field1129, 0, arg3, arg2, this);
                }
                return method1135(((class56) this.field1132).field1100, arg0, this.field1122, arg1, this.field1116, 0, arg3, arg2, this);
            }
            if (Statics.field1042) {
                return method1099(0, 0, ((class56) this.field1132).field1100, arg0, this.field1122, arg1, this.field1121, this.field1129, 0, arg3, arg2, this, this.field1117, arg4);
            }
            return method1103(0, 0, ((class56) this.field1132).field1100, arg0, this.field1122, arg1, this.field1116, 0, arg3, arg2, this, this.field1117, arg4);
        }
    }

    @ObfuscatedName("be.ay()Z")
    public boolean method1205() {
        int var1 = this.field1118;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method1123(var1, this.field1125);
            var2 = method1068(var1, this.field1125);
        }
        if (this.field1116 != var1 || this.field1121 != var3 || this.field1129 != var2) {
            if (this.field1116 < var1) {
                this.field1128 = 1;
                this.field1127 = var1 - this.field1116;
            } else if (this.field1116 > var1) {
                this.field1128 = -1;
                this.field1127 = this.field1116 - var1;
            } else {
                this.field1128 = 0;
            }
            if (this.field1121 < var3) {
                this.field1119 = 1;
                if (this.field1127 == 0 || this.field1127 > var3 - this.field1121) {
                    this.field1127 = var3 - this.field1121;
                }
            } else if (this.field1121 > var3) {
                this.field1119 = -1;
                if (this.field1127 == 0 || this.field1127 > this.field1121 - var3) {
                    this.field1127 = this.field1121 - var3;
                }
            } else {
                this.field1119 = 0;
            }
            if (this.field1129 < var2) {
                this.field1130 = 1;
                if (this.field1127 == 0 || this.field1127 > var2 - this.field1129) {
                    this.field1127 = var2 - this.field1129;
                }
            } else if (this.field1129 > var2) {
                this.field1130 = -1;
                if (this.field1127 == 0 || this.field1127 > this.field1129 - var2) {
                    this.field1127 = this.field1129 - var2;
                }
            } else {
                this.field1130 = 0;
            }
            return false;
        } else if (this.field1118 == Integer.MIN_VALUE) {
            this.field1118 = 0;
            this.field1129 = 0;
            this.field1121 = 0;
            this.field1116 = 0;
            this.method3311();
            return true;
        } else {
            this.method1072();
            return false;
        }
    }

    @ObfuscatedName("be.au([B[IIIIIIILbe;)I")
    public static int method1201(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class58 arg8) {
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
        arg8.field1122 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("be.ar(I[B[IIIIIIIILbe;)I")
    public static int method1200(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class58 arg10) {
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
        arg10.field1122 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("be.ap([B[IIIIIIILbe;)I")
    public static int method1135(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class58 arg8) {
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
        arg8.field1122 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("be.an(I[B[IIIIIIIILbe;)I")
    public static int method1095(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class58 arg10) {
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
        arg10.field1122 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("be.ae(II[B[IIIIIIILbe;II)I")
    public static int method1182(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class58 arg10, int arg11, int arg12) {
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
        arg10.field1122 = arg4;
        return arg5;
    }

    @ObfuscatedName("be.aa(II[B[IIIIIIIILbe;II)I")
    public static int method1097(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class58 arg11, int arg12, int arg13) {
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
        arg11.field1122 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("be.ax(II[B[IIIIIIILbe;II)I")
    public static int method1103(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class58 arg10, int arg11, int arg12) {
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
        arg10.field1122 = arg4;
        return arg5;
    }

    @ObfuscatedName("be.am(II[B[IIIIIIIILbe;II)I")
    public static int method1099(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class58 arg11, int arg12, int arg13) {
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
        arg11.field1122 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("be.ab([B[IIIIIIIILbe;)I")
    public static int method1100(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class58 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field1121 += (var14 - arg3) * arg9.field1119;
        arg9.field1129 += (var14 - arg3) * arg9.field1130;
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
        arg9.field1116 = var12 >> 2;
        arg9.field1122 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("be.at(I[B[IIIIIIIIIILbe;)I")
    public static int method1101(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class58 arg12) {
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
        arg12.field1116 += (var19 - arg4) * arg12.field1128;
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
        arg12.field1121 = var15 >> 2;
        arg12.field1129 = var16 >> 2;
        arg12.field1122 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("be.ah([B[IIIIIIIILbe;)I")
    public static int method1102(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class58 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field1121 += (var14 - arg3) * arg9.field1119;
        arg9.field1129 += (var14 - arg3) * arg9.field1130;
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
        arg9.field1116 = var12 >> 2;
        arg9.field1122 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("be.ac(I[B[IIIIIIIIIILbe;)I")
    public static int method1198(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class58 arg12) {
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
        arg12.field1116 += (var19 - arg4) * arg12.field1128;
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
        arg12.field1121 = var15 >> 2;
        arg12.field1129 = var16 >> 2;
        arg12.field1122 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("be.av(II[B[IIIIIIIILbe;II)I")
    public static int method1104(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class58 arg11, int arg12, int arg13) {
        arg11.field1121 -= arg11.field1119 * arg5;
        arg11.field1129 -= arg11.field1130 * arg5;
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
        arg11.field1121 += arg11.field1119 * arg5;
        arg11.field1129 += arg11.field1130 * arg5;
        arg11.field1116 = arg6;
        arg11.field1122 = arg4;
        return arg5;
    }

    @ObfuscatedName("be.bp(II[B[IIIIIIIIIILbe;II)I")
    public static int method1105(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class58 arg13, int arg14, int arg15) {
        arg13.field1116 -= arg13.field1128 * arg5;
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
        arg13.field1116 += arg13.field1128 * var27;
        arg13.field1121 = arg6;
        arg13.field1129 = arg7;
        arg13.field1122 = arg4;
        return var27;
    }

    @ObfuscatedName("be.bg(II[B[IIIIIIIILbe;II)I")
    public static int method1106(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class58 arg11, int arg12, int arg13) {
        arg11.field1121 -= arg11.field1119 * arg5;
        arg11.field1129 -= arg11.field1130 * arg5;
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
        arg11.field1121 += arg11.field1119 * arg5;
        arg11.field1129 += arg11.field1130 * arg5;
        arg11.field1116 = arg6;
        arg11.field1122 = arg4;
        return arg5;
    }

    @ObfuscatedName("be.by(II[B[IIIIIIIIIILbe;II)I")
    public static int method1114(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class58 arg13, int arg14, int arg15) {
        arg13.field1116 -= arg13.field1128 * arg5;
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
        arg13.field1116 += arg13.field1128 * var26;
        arg13.field1121 = arg6;
        arg13.field1129 = arg7;
        arg13.field1122 = arg4;
        return var26;
    }
}
