package deob;

@ObfuscatedName("by")
public class class55 extends class57 {

    @ObfuscatedName("by.z")
    public int field1124;

    @ObfuscatedName("by.n")
    public int field1118;

    @ObfuscatedName("by.u")
    public int field1129;

    @ObfuscatedName("by.t")
    public int field1121;

    @ObfuscatedName("by.e")
    public int field1122;

    @ObfuscatedName("by.a")
    public int field1123;

    @ObfuscatedName("by.l")
    public int field1119;

    @ObfuscatedName("by.v")
    public int field1125;

    @ObfuscatedName("by.j")
    public int field1126;

    @ObfuscatedName("by.k")
    public int field1120;

    @ObfuscatedName("by.g")
    public boolean field1128;

    @ObfuscatedName("by.d")
    public int field1127;

    @ObfuscatedName("by.b")
    public int field1130;

    @ObfuscatedName("by.i")
    public int field1131;

    @ObfuscatedName("by.o")
    public int field1132;

    @ObfuscatedName("by.z(II)I")
    public static int method1176(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("by.n(II)I")
    public static int method1095(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("by.ae()I")
    public int method1096() {
        int var1 = this.field1122 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field1125 == 0) {
            var2 -= this.field1124 * var2 / (((class53) this.field1136).field1101.length << 8);
        } else if (this.field1125 >= 0) {
            var2 -= this.field1126 * var2 / ((class53) this.field1136).field1101.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    public class55(class53 arg0, int arg1, int arg2) {
        this.field1136 = arg0;
        this.field1126 = arg0.field1105;
        this.field1120 = arg0.field1104;
        this.field1128 = arg0.field1102;
        this.field1118 = arg1;
        this.field1129 = arg2;
        this.field1121 = 8192;
        this.field1124 = 0;
        this.method1101();
    }

    public class55(class53 arg0, int arg1, int arg2, int arg3) {
        this.field1136 = arg0;
        this.field1126 = arg0.field1105;
        this.field1120 = arg0.field1104;
        this.field1128 = arg0.field1102;
        this.field1118 = arg1;
        this.field1129 = arg2;
        this.field1121 = arg3;
        this.field1124 = 0;
        this.method1101();
    }

    @ObfuscatedName("by.u(Lbp;II)Lby;")
    public static class55 method1099(class53 arg0, int arg1, int arg2) {
        return arg0.field1101 == null || arg0.field1101.length == 0 ? null : new class55(arg0, (int) ((long) arg0.field1103 * 256L * (long) arg1 / (long) (Statics.field2844 * 100)), arg2 << 6);
    }

    @ObfuscatedName("by.t(Lbp;III)Lby;")
    public static class55 method1100(class53 arg0, int arg1, int arg2, int arg3) {
        return arg0.field1101 == null || arg0.field1101.length == 0 ? null : new class55(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("by.e()V")
    public void method1101() {
        this.field1122 = this.field1129;
        this.field1123 = method1176(this.field1129, this.field1121);
        this.field1119 = method1095(this.field1129, this.field1121);
    }

    @ObfuscatedName("by.k(I)V")
    public synchronized void method1135(int arg0) {
        this.field1125 = arg0;
    }

    @ObfuscatedName("by.d(I)V")
    public synchronized void method1103(int arg0) {
        this.method1105(arg0 << 6, this.method1106());
    }

    @ObfuscatedName("by.b(I)V")
    public synchronized void method1144(int arg0) {
        this.method1105(arg0, this.method1106());
    }

    @ObfuscatedName("by.i(II)V")
    public synchronized void method1105(int arg0, int arg1) {
        this.field1129 = arg0;
        this.field1121 = arg1;
        this.field1127 = 0;
        this.method1101();
    }

    @ObfuscatedName("by.o()I")
    public synchronized int method1107() {
        return this.field1129 == Integer.MIN_VALUE ? 0 : this.field1129;
    }

    @ObfuscatedName("by.x()I")
    public synchronized int method1106() {
        return this.field1121 < 0 ? -1 : this.field1121;
    }

    @ObfuscatedName("by.m(I)V")
    public synchronized void method1108(int arg0) {
        int var2 = ((class53) this.field1136).field1101.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field1124 = arg0;
    }

    @ObfuscatedName("by.f(Z)V")
    public synchronized void method1226(boolean arg0) {
        this.field1118 = (this.field1118 >>> 31) + (this.field1118 ^ this.field1118 >> 31);
        if (arg0) {
            this.field1118 = -this.field1118;
        }
    }

    @ObfuscatedName("by.q()V")
    public void method1209() {
        if (this.field1127 == 0) {
            return;
        }
        if (this.field1129 == Integer.MIN_VALUE) {
            this.field1129 = 0;
        }
        this.field1127 = 0;
        this.method1101();
    }

    @ObfuscatedName("by.c(II)V")
    public synchronized void method1157(int arg0, int arg1) {
        this.method1111(arg0, arg1, this.method1106());
    }

    @ObfuscatedName("by.h(III)V")
    public synchronized void method1111(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method1105(arg1, arg2);
            return;
        }
        int var4 = method1176(arg1, arg2);
        int var5 = method1095(arg1, arg2);
        if (this.field1123 == var4 && this.field1119 == var5) {
            this.field1127 = 0;
            return;
        }
        int var6 = arg1 - this.field1122;
        if (this.field1122 - arg1 > var6) {
            var6 = this.field1122 - arg1;
        }
        if (var4 - this.field1123 > var6) {
            var6 = var4 - this.field1123;
        }
        if (this.field1123 - var4 > var6) {
            var6 = this.field1123 - var4;
        }
        if (var5 - this.field1119 > var6) {
            var6 = var5 - this.field1119;
        }
        if (this.field1119 - var5 > var6) {
            var6 = this.field1119 - var5;
        }
        if (arg0 > var6) {
            arg0 = var6;
        }
        this.field1127 = arg0;
        this.field1129 = arg1;
        this.field1121 = arg2;
        this.field1130 = (arg1 - this.field1122) / arg0;
        this.field1131 = (var4 - this.field1123) / arg0;
        this.field1132 = (var5 - this.field1119) / arg0;
    }

    @ObfuscatedName("by.y(I)V")
    public synchronized void method1112(int arg0) {
        if (arg0 == 0) {
            this.method1144(0);
            this.method3288();
        } else if (this.field1123 == 0 && this.field1119 == 0) {
            this.field1127 = 0;
            this.field1129 = 0;
            this.field1122 = 0;
            this.method3288();
        } else {
            int var2 = -this.field1122;
            if (this.field1122 > var2) {
                var2 = this.field1122;
            }
            if (-this.field1123 > var2) {
                var2 = -this.field1123;
            }
            if (this.field1123 > var2) {
                var2 = this.field1123;
            }
            if (-this.field1119 > var2) {
                var2 = -this.field1119;
            }
            if (this.field1119 > var2) {
                var2 = this.field1119;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field1127 = arg0;
            this.field1129 = Integer.MIN_VALUE;
            this.field1130 = -this.field1122 / arg0;
            this.field1131 = -this.field1123 / arg0;
            this.field1132 = -this.field1119 / arg0;
        }
    }

    @ObfuscatedName("by.r(I)V")
    public synchronized void method1113(int arg0) {
        if (this.field1118 < 0) {
            this.field1118 = -arg0;
        } else {
            this.field1118 = arg0;
        }
    }

    @ObfuscatedName("by.ar()I")
    public synchronized int method1114() {
        return this.field1118 < 0 ? -this.field1118 : this.field1118;
    }

    @ObfuscatedName("by.an()Z")
    public boolean method1115() {
        return this.field1124 < 0 || this.field1124 >= ((class53) this.field1136).field1101.length << 8;
    }

    @ObfuscatedName("by.ax()Z")
    public boolean method1178() {
        return this.field1127 != 0;
    }

    @ObfuscatedName("by.a()Lbt;")
    public class57 method956() {
        return null;
    }

    @ObfuscatedName("by.l()Lbt;")
    public class57 method957() {
        return null;
    }

    @ObfuscatedName("by.v()I")
    public int method958() {
        return this.field1129 == 0 && this.field1127 == 0 ? 0 : 1;
    }

    @ObfuscatedName("by.j([III)V")
    public synchronized void method973(int[] arg0, int arg1, int arg2) {
        if (this.field1129 == 0 && this.field1127 == 0) {
            this.method961(arg2);
            return;
        }
        class53 var4 = (class53) this.field1136;
        int var5 = this.field1126 << 8;
        int var6 = this.field1120 << 8;
        int var7 = var4.field1101.length << 8;
        int var8 = var6 - var5;
        if (var8 <= 0) {
            this.field1125 = 0;
        }
        int var9 = arg1;
        int var10 = arg1 + arg2;
        if (this.field1124 < 0) {
            if (this.field1118 <= 0) {
                this.method1209();
                this.method3288();
                return;
            }
            this.field1124 = 0;
        }
        if (this.field1124 >= var7) {
            if (this.field1118 >= 0) {
                this.method1209();
                this.method3288();
                return;
            }
            this.field1124 = var7 - 1;
        }
        if (this.field1125 >= 0) {
            if (this.field1125 > 0) {
                if (this.field1128) {
                    label131: {
                        if (this.field1118 < 0) {
                            var9 = this.method1102(arg0, arg1, var5, var10, var4.field1101[this.field1126]);
                            if (this.field1124 >= var5) {
                                return;
                            }
                            this.field1124 = var5 + var5 - 1 - this.field1124;
                            this.field1118 = -this.field1118;
                            if (--this.field1125 == 0) {
                                break label131;
                            }
                        }
                        do {
                            var9 = this.method1120(arg0, var9, var6, var10, var4.field1101[this.field1120 - 1]);
                            if (this.field1124 < var6) {
                                return;
                            }
                            this.field1124 = var6 + var6 - 1 - this.field1124;
                            this.field1118 = -this.field1118;
                            if (--this.field1125 == 0) {
                                break;
                            }
                            var9 = this.method1102(arg0, var9, var5, var10, var4.field1101[this.field1126]);
                            if (this.field1124 >= var5) {
                                return;
                            }
                            this.field1124 = var5 + var5 - 1 - this.field1124;
                            this.field1118 = -this.field1118;
                        } while (--this.field1125 != 0);
                    }
                } else if (this.field1118 < 0) {
                    while (true) {
                        var9 = this.method1102(arg0, var9, var5, var10, var4.field1101[this.field1120 - 1]);
                        if (this.field1124 >= var5) {
                            return;
                        }
                        int var12 = (var6 - 1 - this.field1124) / var8;
                        if (var12 >= this.field1125) {
                            this.field1124 += this.field1125 * var8;
                            this.field1125 = 0;
                            break;
                        }
                        this.field1124 += var8 * var12;
                        this.field1125 -= var12;
                    }
                } else {
                    while (true) {
                        var9 = this.method1120(arg0, var9, var6, var10, var4.field1101[this.field1126]);
                        if (this.field1124 < var6) {
                            return;
                        }
                        int var13 = (this.field1124 - var5) / var8;
                        if (var13 >= this.field1125) {
                            this.field1124 -= this.field1125 * var8;
                            this.field1125 = 0;
                            break;
                        }
                        this.field1124 -= var8 * var13;
                        this.field1125 -= var13;
                    }
                }
            }
            if (this.field1118 < 0) {
                this.method1102(arg0, var9, 0, var10, 0);
                if (this.field1124 < 0) {
                    this.field1124 = -1;
                    this.method1209();
                    this.method3288();
                }
            } else {
                this.method1120(arg0, var9, var7, var10, 0);
                if (this.field1124 >= var7) {
                    this.field1124 = var7;
                    this.method1209();
                    this.method3288();
                }
            }
        } else if (this.field1128) {
            if (this.field1118 < 0) {
                var9 = this.method1102(arg0, arg1, var5, var10, var4.field1101[this.field1126]);
                if (this.field1124 >= var5) {
                    return;
                }
                this.field1124 = var5 + var5 - 1 - this.field1124;
                this.field1118 = -this.field1118;
            }
            while (true) {
                int var11 = this.method1120(arg0, var9, var6, var10, var4.field1101[this.field1120 - 1]);
                if (this.field1124 < var6) {
                    return;
                }
                this.field1124 = var6 + var6 - 1 - this.field1124;
                this.field1118 = -this.field1118;
                var9 = this.method1102(arg0, var11, var5, var10, var4.field1101[this.field1126]);
                if (this.field1124 >= var5) {
                    return;
                }
                this.field1124 = var5 + var5 - 1 - this.field1124;
                this.field1118 = -this.field1118;
            }
        } else if (this.field1118 < 0) {
            while (true) {
                var9 = this.method1102(arg0, var9, var5, var10, var4.field1101[this.field1120 - 1]);
                if (this.field1124 >= var5) {
                    return;
                }
                this.field1124 = var6 - 1 - (var6 - 1 - this.field1124) % var8;
            }
        } else {
            while (true) {
                var9 = this.method1120(arg0, var9, var6, var10, var4.field1101[this.field1126]);
                if (this.field1124 < var6) {
                    return;
                }
                this.field1124 = (this.field1124 - var5) % var8 + var5;
            }
        }
    }

    @ObfuscatedName("by.g(I)V")
    public synchronized void method961(int arg0) {
        if (this.field1127 > 0) {
            if (arg0 >= this.field1127) {
                if (this.field1129 == Integer.MIN_VALUE) {
                    this.field1129 = 0;
                    this.field1119 = 0;
                    this.field1123 = 0;
                    this.field1122 = 0;
                    this.method3288();
                    arg0 = this.field1127;
                }
                this.field1127 = 0;
                this.method1101();
            } else {
                this.field1122 += this.field1130 * arg0;
                this.field1123 += this.field1131 * arg0;
                this.field1119 += this.field1132 * arg0;
                this.field1127 -= arg0;
            }
        }
        class53 var2 = (class53) this.field1136;
        int var3 = this.field1126 << 8;
        int var4 = this.field1120 << 8;
        int var5 = var2.field1101.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field1125 = 0;
        }
        if (this.field1124 < 0) {
            if (this.field1118 <= 0) {
                this.method1209();
                this.method3288();
                return;
            }
            this.field1124 = 0;
        }
        if (this.field1124 >= var5) {
            if (this.field1118 >= 0) {
                this.method1209();
                this.method3288();
                return;
            }
            this.field1124 = var5 - 1;
        }
        this.field1124 += this.field1118 * arg0;
        if (this.field1125 >= 0) {
            if (this.field1125 > 0) {
                if (this.field1128) {
                    label121: {
                        if (this.field1118 < 0) {
                            if (this.field1124 >= var3) {
                                return;
                            }
                            this.field1124 = var3 + var3 - 1 - this.field1124;
                            this.field1118 = -this.field1118;
                            if (--this.field1125 == 0) {
                                break label121;
                            }
                        }
                        do {
                            if (this.field1124 < var4) {
                                return;
                            }
                            this.field1124 = var4 + var4 - 1 - this.field1124;
                            this.field1118 = -this.field1118;
                            if (--this.field1125 == 0) {
                                break;
                            }
                            if (this.field1124 >= var3) {
                                return;
                            }
                            this.field1124 = var3 + var3 - 1 - this.field1124;
                            this.field1118 = -this.field1118;
                        } while (--this.field1125 != 0);
                    }
                } else {
                    label153: {
                        if (this.field1118 < 0) {
                            if (this.field1124 >= var3) {
                                return;
                            }
                            int var7 = (var4 - 1 - this.field1124) / var6;
                            if (var7 >= this.field1125) {
                                this.field1124 += this.field1125 * var6;
                                this.field1125 = 0;
                                break label153;
                            }
                            this.field1124 += var6 * var7;
                            this.field1125 -= var7;
                        } else if (this.field1124 >= var4) {
                            int var8 = (this.field1124 - var3) / var6;
                            if (var8 >= this.field1125) {
                                this.field1124 -= this.field1125 * var6;
                                this.field1125 = 0;
                                break label153;
                            }
                            this.field1124 -= var6 * var8;
                            this.field1125 -= var8;
                        } else {
                            return;
                        }
                        return;
                    }
                }
            }
            if (this.field1118 < 0) {
                if (this.field1124 < 0) {
                    this.field1124 = -1;
                    this.method1209();
                    this.method3288();
                }
            } else if (this.field1124 >= var5) {
                this.field1124 = var5;
                this.method1209();
                this.method3288();
            }
        } else if (this.field1128) {
            if (this.field1118 < 0) {
                if (this.field1124 >= var3) {
                    return;
                }
                this.field1124 = var3 + var3 - 1 - this.field1124;
                this.field1118 = -this.field1118;
            }
            while (this.field1124 >= var4) {
                this.field1124 = var4 + var4 - 1 - this.field1124;
                this.field1118 = -this.field1118;
                if (this.field1124 >= var3) {
                    return;
                }
                this.field1124 = var3 + var3 - 1 - this.field1124;
                this.field1118 = -this.field1118;
            }
        } else if (this.field1118 < 0) {
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

    @ObfuscatedName("by.ao([IIIII)I")
    public int method1120(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1127 > 0) {
                int var6 = this.field1127 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1127 += arg1;
                if (this.field1118 == 256 && (this.field1124 & 0xFF) == 0) {
                    if (Statics.field1053) {
                        arg1 = method1130(0, ((class53) this.field1136).field1101, arg0, this.field1124, arg1, this.field1123, this.field1119, this.field1131, this.field1132, 0, var6, arg2, this);
                    } else {
                        arg1 = method1179(((class53) this.field1136).field1101, arg0, this.field1124, arg1, this.field1122, this.field1130, 0, var6, arg2, this);
                    }
                } else if (Statics.field1053) {
                    arg1 = method1133(0, 0, ((class53) this.field1136).field1101, arg0, this.field1124, arg1, this.field1123, this.field1119, this.field1131, this.field1132, 0, var6, arg2, this, this.field1118, arg4);
                } else {
                    arg1 = method1132(0, 0, ((class53) this.field1136).field1101, arg0, this.field1124, arg1, this.field1122, this.field1130, 0, var6, arg2, this, this.field1118, arg4);
                }
                this.field1127 -= arg1;
                if (this.field1127 != 0) {
                    return arg1;
                }
                if (!this.method1122()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1118 == 256 && (this.field1124 & 0xFF) == 0) {
                if (Statics.field1053) {
                    return method1123(0, ((class53) this.field1136).field1101, arg0, this.field1124, arg1, this.field1123, this.field1119, 0, arg3, arg2, this);
                }
                return method1165(((class53) this.field1136).field1101, arg0, this.field1124, arg1, this.field1122, 0, arg3, arg2, this);
            }
            if (Statics.field1053) {
                return method1127(0, 0, ((class53) this.field1136).field1101, arg0, this.field1124, arg1, this.field1123, this.field1119, 0, arg3, arg2, this, this.field1118, arg4);
            }
            return method1126(0, 0, ((class53) this.field1136).field1101, arg0, this.field1124, arg1, this.field1122, 0, arg3, arg2, this, this.field1118, arg4);
        }
    }

    @ObfuscatedName("by.aj([IIIII)I")
    public int method1102(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1127 > 0) {
                int var6 = this.field1127 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1127 += arg1;
                if (this.field1118 == -256 && (this.field1124 & 0xFF) == 0) {
                    if (Statics.field1053) {
                        arg1 = method1131(0, ((class53) this.field1136).field1101, arg0, this.field1124, arg1, this.field1123, this.field1119, this.field1131, this.field1132, 0, var6, arg2, this);
                    } else {
                        arg1 = method1167(((class53) this.field1136).field1101, arg0, this.field1124, arg1, this.field1122, this.field1130, 0, var6, arg2, this);
                    }
                } else if (Statics.field1053) {
                    arg1 = method1147(0, 0, ((class53) this.field1136).field1101, arg0, this.field1124, arg1, this.field1123, this.field1119, this.field1131, this.field1132, 0, var6, arg2, this, this.field1118, arg4);
                } else {
                    arg1 = method1134(0, 0, ((class53) this.field1136).field1101, arg0, this.field1124, arg1, this.field1122, this.field1130, 0, var6, arg2, this, this.field1118, arg4);
                }
                this.field1127 -= arg1;
                if (this.field1127 != 0) {
                    return arg1;
                }
                if (!this.method1122()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1118 == -256 && (this.field1124 & 0xFF) == 0) {
                if (Statics.field1053) {
                    return method1125(0, ((class53) this.field1136).field1101, arg0, this.field1124, arg1, this.field1123, this.field1119, 0, arg3, arg2, this);
                }
                return method1218(((class53) this.field1136).field1101, arg0, this.field1124, arg1, this.field1122, 0, arg3, arg2, this);
            }
            if (Statics.field1053) {
                return method1128(0, 0, ((class53) this.field1136).field1101, arg0, this.field1124, arg1, this.field1123, this.field1119, 0, arg3, arg2, this, this.field1118, arg4);
            }
            return method1110(0, 0, ((class53) this.field1136).field1101, arg0, this.field1124, arg1, this.field1122, 0, arg3, arg2, this, this.field1118, arg4);
        }
    }

    @ObfuscatedName("by.ap()Z")
    public boolean method1122() {
        int var1 = this.field1129;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method1176(var1, this.field1121);
            var2 = method1095(var1, this.field1121);
        }
        if (this.field1122 != var1 || this.field1123 != var3 || this.field1119 != var2) {
            if (this.field1122 < var1) {
                this.field1130 = 1;
                this.field1127 = var1 - this.field1122;
            } else if (this.field1122 > var1) {
                this.field1130 = -1;
                this.field1127 = this.field1122 - var1;
            } else {
                this.field1130 = 0;
            }
            if (this.field1123 < var3) {
                this.field1131 = 1;
                if (this.field1127 == 0 || this.field1127 > var3 - this.field1123) {
                    this.field1127 = var3 - this.field1123;
                }
            } else if (this.field1123 > var3) {
                this.field1131 = -1;
                if (this.field1127 == 0 || this.field1127 > this.field1123 - var3) {
                    this.field1127 = this.field1123 - var3;
                }
            } else {
                this.field1131 = 0;
            }
            if (this.field1119 < var2) {
                this.field1132 = 1;
                if (this.field1127 == 0 || this.field1127 > var2 - this.field1119) {
                    this.field1127 = var2 - this.field1119;
                }
            } else if (this.field1119 > var2) {
                this.field1132 = -1;
                if (this.field1127 == 0 || this.field1127 > this.field1119 - var2) {
                    this.field1127 = this.field1119 - var2;
                }
            } else {
                this.field1132 = 0;
            }
            return false;
        } else if (this.field1129 == Integer.MIN_VALUE) {
            this.field1129 = 0;
            this.field1119 = 0;
            this.field1123 = 0;
            this.field1122 = 0;
            this.method3288();
            return true;
        } else {
            this.method1101();
            return false;
        }
    }

    @ObfuscatedName("by.am([B[IIIIIIILby;)I")
    public static int method1165(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class55 arg8) {
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

    @ObfuscatedName("by.az(I[B[IIIIIIIILby;)I")
    public static int method1123(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class55 arg10) {
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

    @ObfuscatedName("by.aa([B[IIIIIIILby;)I")
    public static int method1218(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class55 arg8) {
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

    @ObfuscatedName("by.ab(I[B[IIIIIIIILby;)I")
    public static int method1125(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class55 arg10) {
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

    @ObfuscatedName("by.aw(II[B[IIIIIIILby;II)I")
    public static int method1126(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class55 arg10, int arg11, int arg12) {
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

    @ObfuscatedName("by.av(II[B[IIIIIIIILby;II)I")
    public static int method1127(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class55 arg11, int arg12, int arg13) {
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

    @ObfuscatedName("by.al(II[B[IIIIIIILby;II)I")
    public static int method1110(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class55 arg10, int arg11, int arg12) {
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

    @ObfuscatedName("by.aq(II[B[IIIIIIIILby;II)I")
    public static int method1128(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class55 arg11, int arg12, int arg13) {
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

    @ObfuscatedName("by.au([B[IIIIIIIILby;)I")
    public static int method1179(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class55 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field1123 += (var14 - arg3) * arg9.field1131;
        arg9.field1119 += (var14 - arg3) * arg9.field1132;
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
        arg9.field1122 = var12 >> 2;
        arg9.field1124 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("by.ay(I[B[IIIIIIIIIILby;)I")
    public static int method1130(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class55 arg12) {
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
        arg12.field1122 += (var19 - arg4) * arg12.field1130;
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
        arg12.field1123 = var15 >> 2;
        arg12.field1119 = var16 >> 2;
        arg12.field1124 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("by.at([B[IIIIIIIILby;)I")
    public static int method1167(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class55 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field1123 += (var14 - arg3) * arg9.field1131;
        arg9.field1119 += (var14 - arg3) * arg9.field1132;
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
        arg9.field1122 = var12 >> 2;
        arg9.field1124 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("by.af(I[B[IIIIIIIIIILby;)I")
    public static int method1131(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class55 arg12) {
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
        arg12.field1122 += (var19 - arg4) * arg12.field1130;
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
        arg12.field1123 = var15 >> 2;
        arg12.field1119 = var16 >> 2;
        arg12.field1124 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("by.bp(II[B[IIIIIIIILby;II)I")
    public static int method1132(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class55 arg11, int arg12, int arg13) {
        arg11.field1123 -= arg11.field1131 * arg5;
        arg11.field1119 -= arg11.field1132 * arg5;
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
        arg11.field1123 += arg11.field1131 * arg5;
        arg11.field1119 += arg11.field1132 * arg5;
        arg11.field1122 = arg6;
        arg11.field1124 = arg4;
        return arg5;
    }

    @ObfuscatedName("by.bx(II[B[IIIIIIIIIILby;II)I")
    public static int method1133(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class55 arg13, int arg14, int arg15) {
        arg13.field1122 -= arg13.field1130 * arg5;
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
        arg13.field1122 += arg13.field1130 * var27;
        arg13.field1123 = arg6;
        arg13.field1119 = arg7;
        arg13.field1124 = arg4;
        return var27;
    }

    @ObfuscatedName("by.by(II[B[IIIIIIIILby;II)I")
    public static int method1134(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class55 arg11, int arg12, int arg13) {
        arg11.field1123 -= arg11.field1131 * arg5;
        arg11.field1119 -= arg11.field1132 * arg5;
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
        arg11.field1123 += arg11.field1131 * arg5;
        arg11.field1119 += arg11.field1132 * arg5;
        arg11.field1122 = arg6;
        arg11.field1124 = arg4;
        return arg5;
    }

    @ObfuscatedName("by.bq(II[B[IIIIIIIIIILby;II)I")
    public static int method1147(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class55 arg13, int arg14, int arg15) {
        arg13.field1122 -= arg13.field1130 * arg5;
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
        arg13.field1122 += arg13.field1130 * var26;
        arg13.field1123 = arg6;
        arg13.field1119 = arg7;
        arg13.field1124 = arg4;
        return var26;
    }
}
