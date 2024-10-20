package deob;

@ObfuscatedName("bk")
public class class59 extends class61 {

    @ObfuscatedName("bk.g")
    public int field1157;

    @ObfuscatedName("bk.j")
    public int field1155;

    @ObfuscatedName("bk.z")
    public int field1161;

    @ObfuscatedName("bk.b")
    public int field1154;

    @ObfuscatedName("bk.k")
    public int field1158;

    @ObfuscatedName("bk.c")
    public int field1159;

    @ObfuscatedName("bk.l")
    public int field1160;

    @ObfuscatedName("bk.n")
    public int field1156;

    @ObfuscatedName("bk.d")
    public int field1162;

    @ObfuscatedName("bk.h")
    public int field1163;

    @ObfuscatedName("bk.y")
    public boolean field1164;

    @ObfuscatedName("bk.p")
    public int field1165;

    @ObfuscatedName("bk.i")
    public int field1166;

    @ObfuscatedName("bk.s")
    public int field1167;

    @ObfuscatedName("bk.f")
    public int field1168;

    @ObfuscatedName("bk.g(II)I")
    public static int method1149(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("bk.j(II)I")
    public static int method1064(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("bk.af()I")
    public int method1065() {
        int var1 = this.field1158 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field1156 == 0) {
            var2 -= this.field1157 * var2 / (((class57) this.field1172).field1137.length << 8);
        } else if (this.field1156 >= 0) {
            var2 -= this.field1162 * var2 / ((class57) this.field1172).field1137.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    public class59(class57 arg0, int arg1, int arg2) {
        this.field1172 = arg0;
        this.field1162 = arg0.field1139;
        this.field1163 = arg0.field1140;
        this.field1164 = arg0.field1141;
        this.field1155 = arg1;
        this.field1161 = arg2;
        this.field1154 = 8192;
        this.field1157 = 0;
        this.method1143();
    }

    public class59(class57 arg0, int arg1, int arg2, int arg3) {
        this.field1172 = arg0;
        this.field1162 = arg0.field1139;
        this.field1163 = arg0.field1140;
        this.field1164 = arg0.field1141;
        this.field1155 = arg1;
        this.field1161 = arg2;
        this.field1154 = arg3;
        this.field1157 = 0;
        this.method1143();
    }

    @ObfuscatedName("bk.z(Lbg;II)Lbk;")
    public static class59 method1127(class57 arg0, int arg1, int arg2) {
        return arg0.field1137 == null || arg0.field1137.length == 0 ? null : new class59(arg0, (int) ((long) arg0.field1138 * 256L * (long) arg1 / (long) (Statics.field1093 * 100)), arg2 << 6);
    }

    @ObfuscatedName("bk.b(Lbg;III)Lbk;")
    public static class59 method1153(class57 arg0, int arg1, int arg2, int arg3) {
        return arg0.field1137 == null || arg0.field1137.length == 0 ? null : new class59(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("bk.k()V")
    public void method1143() {
        this.field1158 = this.field1161;
        this.field1159 = method1149(this.field1161, this.field1154);
        this.field1160 = method1064(this.field1161, this.field1154);
    }

    @ObfuscatedName("bk.d(I)V")
    public synchronized void method1068(int arg0) {
        this.field1156 = arg0;
    }

    @ObfuscatedName("bk.y(I)V")
    public synchronized void method1069(int arg0) {
        this.method1098(arg0 << 6, this.method1073());
    }

    @ObfuscatedName("bk.p(I)V")
    public synchronized void method1067(int arg0) {
        this.method1098(arg0, this.method1073());
    }

    @ObfuscatedName("bk.i(II)V")
    public synchronized void method1098(int arg0, int arg1) {
        this.field1161 = arg0;
        this.field1154 = arg1;
        this.field1165 = 0;
        this.method1143();
    }

    @ObfuscatedName("bk.s()I")
    public synchronized int method1072() {
        return this.field1161 == Integer.MIN_VALUE ? 0 : this.field1161;
    }

    @ObfuscatedName("bk.f()I")
    public synchronized int method1073() {
        return this.field1154 < 0 ? -1 : this.field1154;
    }

    @ObfuscatedName("bk.u(I)V")
    public synchronized void method1164(int arg0) {
        int var2 = ((class57) this.field1172).field1137.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field1157 = arg0;
    }

    @ObfuscatedName("bk.v(Z)V")
    public synchronized void method1075(boolean arg0) {
        this.field1155 = (this.field1155 >>> 31) + (this.field1155 ^ this.field1155 >> 31);
        if (arg0) {
            this.field1155 = -this.field1155;
        }
    }

    @ObfuscatedName("bk.r()V")
    public void method1076() {
        if (this.field1165 == 0) {
            return;
        }
        if (this.field1161 == Integer.MIN_VALUE) {
            this.field1161 = 0;
        }
        this.field1165 = 0;
        this.method1143();
    }

    @ObfuscatedName("bk.q(II)V")
    public synchronized void method1151(int arg0, int arg1) {
        this.method1078(arg0, arg1, this.method1073());
    }

    @ObfuscatedName("bk.x(III)V")
    public synchronized void method1078(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method1098(arg1, arg2);
            return;
        }
        int var4 = method1149(arg1, arg2);
        int var5 = method1064(arg1, arg2);
        if (this.field1159 == var4 && this.field1160 == var5) {
            this.field1165 = 0;
            return;
        }
        int var6 = arg1 - this.field1158;
        if (this.field1158 - arg1 > var6) {
            var6 = this.field1158 - arg1;
        }
        if (var4 - this.field1159 > var6) {
            var6 = var4 - this.field1159;
        }
        if (this.field1159 - var4 > var6) {
            var6 = this.field1159 - var4;
        }
        if (var5 - this.field1160 > var6) {
            var6 = var5 - this.field1160;
        }
        if (this.field1160 - var5 > var6) {
            var6 = this.field1160 - var5;
        }
        if (arg0 > var6) {
            arg0 = var6;
        }
        this.field1165 = arg0;
        this.field1161 = arg1;
        this.field1154 = arg2;
        this.field1166 = (arg1 - this.field1158) / arg0;
        this.field1167 = (var4 - this.field1159) / arg0;
        this.field1168 = (var5 - this.field1160) / arg0;
    }

    @ObfuscatedName("bk.t(I)V")
    public synchronized void method1079(int arg0) {
        if (arg0 == 0) {
            this.method1067(0);
            this.method3259();
        } else if (this.field1159 == 0 && this.field1160 == 0) {
            this.field1165 = 0;
            this.field1161 = 0;
            this.field1158 = 0;
            this.method3259();
        } else {
            int var2 = -this.field1158;
            if (this.field1158 > var2) {
                var2 = this.field1158;
            }
            if (-this.field1159 > var2) {
                var2 = -this.field1159;
            }
            if (this.field1159 > var2) {
                var2 = this.field1159;
            }
            if (-this.field1160 > var2) {
                var2 = -this.field1160;
            }
            if (this.field1160 > var2) {
                var2 = this.field1160;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field1165 = arg0;
            this.field1161 = Integer.MIN_VALUE;
            this.field1166 = -this.field1158 / arg0;
            this.field1167 = -this.field1159 / arg0;
            this.field1168 = -this.field1160 / arg0;
        }
    }

    @ObfuscatedName("bk.e(I)V")
    public synchronized void method1080(int arg0) {
        if (this.field1155 < 0) {
            this.field1155 = -arg0;
        } else {
            this.field1155 = arg0;
        }
    }

    @ObfuscatedName("bk.m()I")
    public synchronized int method1081() {
        return this.field1155 < 0 ? -this.field1155 : this.field1155;
    }

    @ObfuscatedName("bk.o()Z")
    public boolean method1082() {
        return this.field1157 < 0 || this.field1157 >= ((class57) this.field1172).field1137.length << 8;
    }

    @ObfuscatedName("bk.a()Z")
    public boolean method1083() {
        return this.field1165 != 0;
    }

    @ObfuscatedName("bk.c()Lbr;")
    public class61 method936() {
        return null;
    }

    @ObfuscatedName("bk.w()Lbr;")
    public class61 method919() {
        return null;
    }

    @ObfuscatedName("bk.l()I")
    public int method914() {
        return this.field1161 == 0 && this.field1165 == 0 ? 0 : 1;
    }

    @ObfuscatedName("bk.n([III)V")
    public synchronized void method912(int[] arg0, int arg1, int arg2) {
        if (this.field1161 == 0 && this.field1165 == 0) {
            this.method949(arg2);
            return;
        }
        class57 var4 = (class57) this.field1172;
        int var5 = this.field1162 << 8;
        int var6 = this.field1163 << 8;
        int var7 = var4.field1137.length << 8;
        int var8 = var6 - var5;
        if (var8 <= 0) {
            this.field1156 = 0;
        }
        int var9 = arg1;
        int var10 = arg1 + arg2;
        if (this.field1157 < 0) {
            if (this.field1155 <= 0) {
                this.method1076();
                this.method3259();
                return;
            }
            this.field1157 = 0;
        }
        if (this.field1157 >= var7) {
            if (this.field1155 >= 0) {
                this.method1076();
                this.method3259();
                return;
            }
            this.field1157 = var7 - 1;
        }
        if (this.field1156 >= 0) {
            if (this.field1156 > 0) {
                if (this.field1164) {
                    label131: {
                        if (this.field1155 < 0) {
                            var9 = this.method1088(arg0, arg1, var5, var10, var4.field1137[this.field1162]);
                            if (this.field1157 >= var5) {
                                return;
                            }
                            this.field1157 = var5 + var5 - 1 - this.field1157;
                            this.field1155 = -this.field1155;
                            if (--this.field1156 == 0) {
                                break label131;
                            }
                        }
                        do {
                            var9 = this.method1104(arg0, var9, var6, var10, var4.field1137[this.field1163 - 1]);
                            if (this.field1157 < var6) {
                                return;
                            }
                            this.field1157 = var6 + var6 - 1 - this.field1157;
                            this.field1155 = -this.field1155;
                            if (--this.field1156 == 0) {
                                break;
                            }
                            var9 = this.method1088(arg0, var9, var5, var10, var4.field1137[this.field1162]);
                            if (this.field1157 >= var5) {
                                return;
                            }
                            this.field1157 = var5 + var5 - 1 - this.field1157;
                            this.field1155 = -this.field1155;
                        } while (--this.field1156 != 0);
                    }
                } else if (this.field1155 < 0) {
                    while (true) {
                        var9 = this.method1088(arg0, var9, var5, var10, var4.field1137[this.field1163 - 1]);
                        if (this.field1157 >= var5) {
                            return;
                        }
                        int var12 = (var6 - 1 - this.field1157) / var8;
                        if (var12 >= this.field1156) {
                            this.field1157 += this.field1156 * var8;
                            this.field1156 = 0;
                            break;
                        }
                        this.field1157 += var8 * var12;
                        this.field1156 -= var12;
                    }
                } else {
                    while (true) {
                        var9 = this.method1104(arg0, var9, var6, var10, var4.field1137[this.field1162]);
                        if (this.field1157 < var6) {
                            return;
                        }
                        int var13 = (this.field1157 - var5) / var8;
                        if (var13 >= this.field1156) {
                            this.field1157 -= this.field1156 * var8;
                            this.field1156 = 0;
                            break;
                        }
                        this.field1157 -= var8 * var13;
                        this.field1156 -= var13;
                    }
                }
            }
            if (this.field1155 < 0) {
                this.method1088(arg0, var9, 0, var10, 0);
                if (this.field1157 < 0) {
                    this.field1157 = -1;
                    this.method1076();
                    this.method3259();
                }
            } else {
                this.method1104(arg0, var9, var7, var10, 0);
                if (this.field1157 >= var7) {
                    this.field1157 = var7;
                    this.method1076();
                    this.method3259();
                }
            }
        } else if (this.field1164) {
            if (this.field1155 < 0) {
                var9 = this.method1088(arg0, arg1, var5, var10, var4.field1137[this.field1162]);
                if (this.field1157 >= var5) {
                    return;
                }
                this.field1157 = var5 + var5 - 1 - this.field1157;
                this.field1155 = -this.field1155;
            }
            while (true) {
                int var11 = this.method1104(arg0, var9, var6, var10, var4.field1137[this.field1163 - 1]);
                if (this.field1157 < var6) {
                    return;
                }
                this.field1157 = var6 + var6 - 1 - this.field1157;
                this.field1155 = -this.field1155;
                var9 = this.method1088(arg0, var11, var5, var10, var4.field1137[this.field1162]);
                if (this.field1157 >= var5) {
                    return;
                }
                this.field1157 = var5 + var5 - 1 - this.field1157;
                this.field1155 = -this.field1155;
            }
        } else if (this.field1155 < 0) {
            while (true) {
                var9 = this.method1088(arg0, var9, var5, var10, var4.field1137[this.field1163 - 1]);
                if (this.field1157 >= var5) {
                    return;
                }
                this.field1157 = var6 - 1 - (var6 - 1 - this.field1157) % var8;
            }
        } else {
            while (true) {
                var9 = this.method1104(arg0, var9, var6, var10, var4.field1137[this.field1162]);
                if (this.field1157 < var6) {
                    return;
                }
                this.field1157 = (this.field1157 - var5) % var8 + var5;
            }
        }
    }

    @ObfuscatedName("bk.h(I)V")
    public synchronized void method949(int arg0) {
        if (this.field1165 > 0) {
            if (arg0 >= this.field1165) {
                if (this.field1161 == Integer.MIN_VALUE) {
                    this.field1161 = 0;
                    this.field1160 = 0;
                    this.field1159 = 0;
                    this.field1158 = 0;
                    this.method3259();
                    arg0 = this.field1165;
                }
                this.field1165 = 0;
                this.method1143();
            } else {
                this.field1158 += this.field1166 * arg0;
                this.field1159 += this.field1167 * arg0;
                this.field1160 += this.field1168 * arg0;
                this.field1165 -= arg0;
            }
        }
        class57 var2 = (class57) this.field1172;
        int var3 = this.field1162 << 8;
        int var4 = this.field1163 << 8;
        int var5 = var2.field1137.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field1156 = 0;
        }
        if (this.field1157 < 0) {
            if (this.field1155 <= 0) {
                this.method1076();
                this.method3259();
                return;
            }
            this.field1157 = 0;
        }
        if (this.field1157 >= var5) {
            if (this.field1155 >= 0) {
                this.method1076();
                this.method3259();
                return;
            }
            this.field1157 = var5 - 1;
        }
        this.field1157 += this.field1155 * arg0;
        if (this.field1156 >= 0) {
            if (this.field1156 > 0) {
                if (this.field1164) {
                    label121: {
                        if (this.field1155 < 0) {
                            if (this.field1157 >= var3) {
                                return;
                            }
                            this.field1157 = var3 + var3 - 1 - this.field1157;
                            this.field1155 = -this.field1155;
                            if (--this.field1156 == 0) {
                                break label121;
                            }
                        }
                        do {
                            if (this.field1157 < var4) {
                                return;
                            }
                            this.field1157 = var4 + var4 - 1 - this.field1157;
                            this.field1155 = -this.field1155;
                            if (--this.field1156 == 0) {
                                break;
                            }
                            if (this.field1157 >= var3) {
                                return;
                            }
                            this.field1157 = var3 + var3 - 1 - this.field1157;
                            this.field1155 = -this.field1155;
                        } while (--this.field1156 != 0);
                    }
                } else {
                    label153: {
                        if (this.field1155 < 0) {
                            if (this.field1157 >= var3) {
                                return;
                            }
                            int var7 = (var4 - 1 - this.field1157) / var6;
                            if (var7 >= this.field1156) {
                                this.field1157 += this.field1156 * var6;
                                this.field1156 = 0;
                                break label153;
                            }
                            this.field1157 += var6 * var7;
                            this.field1156 -= var7;
                        } else if (this.field1157 >= var4) {
                            int var8 = (this.field1157 - var3) / var6;
                            if (var8 >= this.field1156) {
                                this.field1157 -= this.field1156 * var6;
                                this.field1156 = 0;
                                break label153;
                            }
                            this.field1157 -= var6 * var8;
                            this.field1156 -= var8;
                        } else {
                            return;
                        }
                        return;
                    }
                }
            }
            if (this.field1155 < 0) {
                if (this.field1157 < 0) {
                    this.field1157 = -1;
                    this.method1076();
                    this.method3259();
                }
            } else if (this.field1157 >= var5) {
                this.field1157 = var5;
                this.method1076();
                this.method3259();
            }
        } else if (this.field1164) {
            if (this.field1155 < 0) {
                if (this.field1157 >= var3) {
                    return;
                }
                this.field1157 = var3 + var3 - 1 - this.field1157;
                this.field1155 = -this.field1155;
            }
            while (this.field1157 >= var4) {
                this.field1157 = var4 + var4 - 1 - this.field1157;
                this.field1155 = -this.field1155;
                if (this.field1157 >= var3) {
                    return;
                }
                this.field1157 = var3 + var3 - 1 - this.field1157;
                this.field1155 = -this.field1155;
            }
        } else if (this.field1155 < 0) {
            if (this.field1157 >= var3) {
                return;
            }
            this.field1157 = var4 - 1 - (var4 - 1 - this.field1157) % var6;
        } else if (this.field1157 >= var4) {
            this.field1157 = (this.field1157 - var3) % var6 + var3;
        } else {
            return;
        }
    }

    @ObfuscatedName("bk.am([IIIII)I")
    public int method1104(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1165 > 0) {
                int var6 = this.field1165 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1165 += arg1;
                if (this.field1155 == 256 && (this.field1157 & 0xFF) == 0) {
                    if (Statics.field1079) {
                        arg1 = method1097(0, ((class57) this.field1172).field1137, arg0, this.field1157, arg1, this.field1159, this.field1160, this.field1167, this.field1168, 0, var6, arg2, this);
                    } else {
                        arg1 = method1131(((class57) this.field1172).field1137, arg0, this.field1157, arg1, this.field1158, this.field1166, 0, var6, arg2, this);
                    }
                } else if (Statics.field1079) {
                    arg1 = method1101(0, 0, ((class57) this.field1172).field1137, arg0, this.field1157, arg1, this.field1159, this.field1160, this.field1167, this.field1168, 0, var6, arg2, this, this.field1155, arg4);
                } else {
                    arg1 = method1150(0, 0, ((class57) this.field1172).field1137, arg0, this.field1157, arg1, this.field1158, this.field1166, 0, var6, arg2, this, this.field1155, arg4);
                }
                this.field1165 -= arg1;
                if (this.field1165 != 0) {
                    return arg1;
                }
                if (!this.method1106()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1155 == 256 && (this.field1157 & 0xFF) == 0) {
                if (Statics.field1079) {
                    return method1077(0, ((class57) this.field1172).field1137, arg0, this.field1157, arg1, this.field1159, this.field1160, 0, arg3, arg2, this);
                }
                return method1070(((class57) this.field1172).field1137, arg0, this.field1157, arg1, this.field1158, 0, arg3, arg2, this);
            }
            if (Statics.field1079) {
                return method1094(0, 0, ((class57) this.field1172).field1137, arg0, this.field1157, arg1, this.field1159, this.field1160, 0, arg3, arg2, this, this.field1155, arg4);
            }
            return method1105(0, 0, ((class57) this.field1172).field1137, arg0, this.field1157, arg1, this.field1158, 0, arg3, arg2, this, this.field1155, arg4);
        }
    }

    @ObfuscatedName("bk.ac([IIIII)I")
    public int method1088(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1165 > 0) {
                int var6 = this.field1165 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1165 += arg1;
                if (this.field1155 == -256 && (this.field1157 & 0xFF) == 0) {
                    if (Statics.field1079) {
                        arg1 = method1066(0, ((class57) this.field1172).field1137, arg0, this.field1157, arg1, this.field1159, this.field1160, this.field1167, this.field1168, 0, var6, arg2, this);
                    } else {
                        arg1 = method1165(((class57) this.field1172).field1137, arg0, this.field1157, arg1, this.field1158, this.field1166, 0, var6, arg2, this);
                    }
                } else if (Statics.field1079) {
                    arg1 = method1102(0, 0, ((class57) this.field1172).field1137, arg0, this.field1157, arg1, this.field1159, this.field1160, this.field1167, this.field1168, 0, var6, arg2, this, this.field1155, arg4);
                } else {
                    arg1 = method1119(0, 0, ((class57) this.field1172).field1137, arg0, this.field1157, arg1, this.field1158, this.field1166, 0, var6, arg2, this, this.field1155, arg4);
                }
                this.field1165 -= arg1;
                if (this.field1165 != 0) {
                    return arg1;
                }
                if (!this.method1106()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1155 == -256 && (this.field1157 & 0xFF) == 0) {
                if (Statics.field1079) {
                    return method1092(0, ((class57) this.field1172).field1137, arg0, this.field1157, arg1, this.field1159, this.field1160, 0, arg3, arg2, this);
                }
                return method1091(((class57) this.field1172).field1137, arg0, this.field1157, arg1, this.field1158, 0, arg3, arg2, this);
            }
            if (Statics.field1079) {
                return method1096(0, 0, ((class57) this.field1172).field1137, arg0, this.field1157, arg1, this.field1159, this.field1160, 0, arg3, arg2, this, this.field1155, arg4);
            }
            return method1095(0, 0, ((class57) this.field1172).field1137, arg0, this.field1157, arg1, this.field1158, 0, arg3, arg2, this, this.field1155, arg4);
        }
    }

    @ObfuscatedName("bk.an()Z")
    public boolean method1106() {
        int var1 = this.field1161;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method1149(var1, this.field1154);
            var2 = method1064(var1, this.field1154);
        }
        if (this.field1158 != var1 || this.field1159 != var3 || this.field1160 != var2) {
            if (this.field1158 < var1) {
                this.field1166 = 1;
                this.field1165 = var1 - this.field1158;
            } else if (this.field1158 > var1) {
                this.field1166 = -1;
                this.field1165 = this.field1158 - var1;
            } else {
                this.field1166 = 0;
            }
            if (this.field1159 < var3) {
                this.field1167 = 1;
                if (this.field1165 == 0 || this.field1165 > var3 - this.field1159) {
                    this.field1165 = var3 - this.field1159;
                }
            } else if (this.field1159 > var3) {
                this.field1167 = -1;
                if (this.field1165 == 0 || this.field1165 > this.field1159 - var3) {
                    this.field1165 = this.field1159 - var3;
                }
            } else {
                this.field1167 = 0;
            }
            if (this.field1160 < var2) {
                this.field1168 = 1;
                if (this.field1165 == 0 || this.field1165 > var2 - this.field1160) {
                    this.field1165 = var2 - this.field1160;
                }
            } else if (this.field1160 > var2) {
                this.field1168 = -1;
                if (this.field1165 == 0 || this.field1165 > this.field1160 - var2) {
                    this.field1165 = this.field1160 - var2;
                }
            } else {
                this.field1168 = 0;
            }
            return false;
        } else if (this.field1161 == Integer.MIN_VALUE) {
            this.field1161 = 0;
            this.field1160 = 0;
            this.field1159 = 0;
            this.field1158 = 0;
            this.method3259();
            return true;
        } else {
            this.method1143();
            return false;
        }
    }

    @ObfuscatedName("bk.al([B[IIIIIIILbk;)I")
    public static int method1070(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class59 arg8) {
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
        arg8.field1157 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("bk.ag(I[B[IIIIIIIILbk;)I")
    public static int method1077(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class59 arg10) {
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
        arg10.field1157 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("bk.ah([B[IIIIIIILbk;)I")
    public static int method1091(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class59 arg8) {
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
        arg8.field1157 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("bk.aw(I[B[IIIIIIIILbk;)I")
    public static int method1092(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class59 arg10) {
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
        arg10.field1157 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("bk.ai(II[B[IIIIIIILbk;II)I")
    public static int method1105(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class59 arg10, int arg11, int arg12) {
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
        arg10.field1157 = arg4;
        return arg5;
    }

    @ObfuscatedName("bk.ak(II[B[IIIIIIIILbk;II)I")
    public static int method1094(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class59 arg11, int arg12, int arg13) {
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
        arg11.field1157 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("bk.au(II[B[IIIIIIILbk;II)I")
    public static int method1095(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class59 arg10, int arg11, int arg12) {
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
        arg10.field1157 = arg4;
        return arg5;
    }

    @ObfuscatedName("bk.av(II[B[IIIIIIIILbk;II)I")
    public static int method1096(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class59 arg11, int arg12, int arg13) {
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
        arg11.field1157 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("bk.bq([B[IIIIIIIILbk;)I")
    public static int method1131(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class59 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field1159 += (var14 - arg3) * arg9.field1167;
        arg9.field1160 += (var14 - arg3) * arg9.field1168;
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
        arg9.field1158 = var12 >> 2;
        arg9.field1157 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("bk.bs(I[B[IIIIIIIIIILbk;)I")
    public static int method1097(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class59 arg12) {
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
        arg12.field1158 += (var19 - arg4) * arg12.field1166;
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
        arg12.field1159 = var15 >> 2;
        arg12.field1160 = var16 >> 2;
        arg12.field1157 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("bk.bh([B[IIIIIIIILbk;)I")
    public static int method1165(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class59 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field1159 += (var14 - arg3) * arg9.field1167;
        arg9.field1160 += (var14 - arg3) * arg9.field1168;
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
        arg9.field1158 = var12 >> 2;
        arg9.field1157 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("bk.bt(I[B[IIIIIIIIIILbk;)I")
    public static int method1066(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class59 arg12) {
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
        arg12.field1158 += (var19 - arg4) * arg12.field1166;
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
        arg12.field1159 = var15 >> 2;
        arg12.field1160 = var16 >> 2;
        arg12.field1157 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("bk.bg(II[B[IIIIIIIILbk;II)I")
    public static int method1150(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class59 arg11, int arg12, int arg13) {
        arg11.field1159 -= arg11.field1167 * arg5;
        arg11.field1160 -= arg11.field1168 * arg5;
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
        arg11.field1159 += arg11.field1167 * arg5;
        arg11.field1160 += arg11.field1168 * arg5;
        arg11.field1158 = arg6;
        arg11.field1157 = arg4;
        return arg5;
    }

    @ObfuscatedName("bk.bx(II[B[IIIIIIIIIILbk;II)I")
    public static int method1101(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class59 arg13, int arg14, int arg15) {
        arg13.field1158 -= arg13.field1166 * arg5;
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
        arg13.field1158 += arg13.field1166 * var27;
        arg13.field1159 = arg6;
        arg13.field1160 = arg7;
        arg13.field1157 = arg4;
        return var27;
    }

    @ObfuscatedName("bk.bk(II[B[IIIIIIIILbk;II)I")
    public static int method1119(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class59 arg11, int arg12, int arg13) {
        arg11.field1159 -= arg11.field1167 * arg5;
        arg11.field1160 -= arg11.field1168 * arg5;
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
        arg11.field1159 += arg11.field1167 * arg5;
        arg11.field1160 += arg11.field1168 * arg5;
        arg11.field1158 = arg6;
        arg11.field1157 = arg4;
        return arg5;
    }

    @ObfuscatedName("bk.by(II[B[IIIIIIIIIILbk;II)I")
    public static int method1102(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class59 arg13, int arg14, int arg15) {
        arg13.field1158 -= arg13.field1166 * arg5;
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
        arg13.field1158 += arg13.field1166 * var26;
        arg13.field1159 = arg6;
        arg13.field1160 = arg7;
        arg13.field1157 = arg4;
        return var26;
    }
}
