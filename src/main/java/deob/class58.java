package deob;

@ObfuscatedName("be")
public class class58 extends class60 {

    @ObfuscatedName("be.j")
    public int field1155;

    @ObfuscatedName("be.z")
    public int field1156;

    @ObfuscatedName("be.y")
    public int field1157;

    @ObfuscatedName("be.h")
    public int field1162;

    @ObfuscatedName("be.r")
    public int field1165;

    @ObfuscatedName("be.e")
    public int field1158;

    @ObfuscatedName("be.k")
    public int field1159;

    @ObfuscatedName("be.b")
    public int field1153;

    @ObfuscatedName("be.n")
    public int field1161;

    @ObfuscatedName("be.a")
    public int field1167;

    @ObfuscatedName("be.q")
    public boolean field1163;

    @ObfuscatedName("be.i")
    public int field1164;

    @ObfuscatedName("be.f")
    public int field1154;

    @ObfuscatedName("be.o")
    public int field1166;

    @ObfuscatedName("be.t")
    public int field1160;

    @ObfuscatedName("be.j(II)I")
    public static int method1133(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("be.z(II)I")
    public static int method1139(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("be.ac()I")
    public int method1112() {
        int var1 = this.field1165 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field1153 == 0) {
            var2 -= this.field1155 * var2 / (((class56) this.field1171).field1136.length << 8);
        } else if (this.field1153 >= 0) {
            var2 -= this.field1161 * var2 / ((class56) this.field1171).field1136.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    public class58(class56 arg0, int arg1, int arg2) {
        this.field1171 = arg0;
        this.field1161 = arg0.field1138;
        this.field1167 = arg0.field1139;
        this.field1163 = arg0.field1140;
        this.field1156 = arg1;
        this.field1157 = arg2;
        this.field1162 = 8192;
        this.field1155 = 0;
        this.method1090();
    }

    public class58(class56 arg0, int arg1, int arg2, int arg3) {
        this.field1171 = arg0;
        this.field1161 = arg0.field1138;
        this.field1167 = arg0.field1139;
        this.field1163 = arg0.field1140;
        this.field1156 = arg1;
        this.field1157 = arg2;
        this.field1162 = arg3;
        this.field1155 = 0;
        this.method1090();
    }

    @ObfuscatedName("be.y(Lbm;II)Lbe;")
    public static class58 method1088(class56 arg0, int arg1, int arg2) {
        return arg0.field1136 == null || arg0.field1136.length == 0 ? null : new class58(arg0, (int) ((long) arg0.field1137 * 256L * (long) arg1 / (long) (Statics.field1090 * 100)), arg2 << 6);
    }

    @ObfuscatedName("be.h(Lbm;III)Lbe;")
    public static class58 method1089(class56 arg0, int arg1, int arg2, int arg3) {
        return arg0.field1136 == null || arg0.field1136.length == 0 ? null : new class58(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("be.r()V")
    public void method1090() {
        this.field1165 = this.field1157;
        this.field1158 = method1133(this.field1157, this.field1162);
        this.field1159 = method1139(this.field1157, this.field1162);
    }

    @ObfuscatedName("be.a(I)V")
    public synchronized void method1091(int arg0) {
        this.field1153 = arg0;
    }

    @ObfuscatedName("be.i(I)V")
    public synchronized void method1092(int arg0) {
        this.method1120(arg0 << 6, this.method1214());
    }

    @ObfuscatedName("be.f(I)V")
    public synchronized void method1093(int arg0) {
        this.method1120(arg0, this.method1214());
    }

    @ObfuscatedName("be.o(II)V")
    public synchronized void method1120(int arg0, int arg1) {
        this.field1157 = arg0;
        this.field1162 = arg1;
        this.field1164 = 0;
        this.method1090();
    }

    @ObfuscatedName("be.t()I")
    public synchronized int method1095() {
        return this.field1157 == Integer.MIN_VALUE ? 0 : this.field1157;
    }

    @ObfuscatedName("be.c()I")
    public synchronized int method1214() {
        return this.field1162 < 0 ? -1 : this.field1162;
    }

    @ObfuscatedName("be.d(I)V")
    public synchronized void method1097(int arg0) {
        int var2 = ((class56) this.field1171).field1136.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field1155 = arg0;
    }

    @ObfuscatedName("be.g(Z)V")
    public synchronized void method1098(boolean arg0) {
        this.field1156 = (this.field1156 >>> 31) + (this.field1156 ^ this.field1156 >> 31);
        if (arg0) {
            this.field1156 = -this.field1156;
        }
    }

    @ObfuscatedName("be.s()V")
    public void method1109() {
        if (this.field1164 == 0) {
            return;
        }
        if (this.field1157 == Integer.MIN_VALUE) {
            this.field1157 = 0;
        }
        this.field1164 = 0;
        this.method1090();
    }

    @ObfuscatedName("be.m(II)V")
    public synchronized void method1100(int arg0, int arg1) {
        this.method1101(arg0, arg1, this.method1214());
    }

    @ObfuscatedName("be.v(III)V")
    public synchronized void method1101(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method1120(arg1, arg2);
            return;
        }
        int var4 = method1133(arg1, arg2);
        int var5 = method1139(arg1, arg2);
        if (this.field1158 == var4 && this.field1159 == var5) {
            this.field1164 = 0;
            return;
        }
        int var6 = arg1 - this.field1165;
        if (this.field1165 - arg1 > var6) {
            var6 = this.field1165 - arg1;
        }
        if (var4 - this.field1158 > var6) {
            var6 = var4 - this.field1158;
        }
        if (this.field1158 - var4 > var6) {
            var6 = this.field1158 - var4;
        }
        if (var5 - this.field1159 > var6) {
            var6 = var5 - this.field1159;
        }
        if (this.field1159 - var5 > var6) {
            var6 = this.field1159 - var5;
        }
        if (arg0 > var6) {
            arg0 = var6;
        }
        this.field1164 = arg0;
        this.field1157 = arg1;
        this.field1162 = arg2;
        this.field1154 = (arg1 - this.field1165) / arg0;
        this.field1166 = (var4 - this.field1158) / arg0;
        this.field1160 = (var5 - this.field1159) / arg0;
    }

    @ObfuscatedName("be.u(I)V")
    public synchronized void method1140(int arg0) {
        if (arg0 == 0) {
            this.method1093(0);
            this.method3309();
        } else if (this.field1158 == 0 && this.field1159 == 0) {
            this.field1164 = 0;
            this.field1157 = 0;
            this.field1165 = 0;
            this.method3309();
        } else {
            int var2 = -this.field1165;
            if (this.field1165 > var2) {
                var2 = this.field1165;
            }
            if (-this.field1158 > var2) {
                var2 = -this.field1158;
            }
            if (this.field1158 > var2) {
                var2 = this.field1158;
            }
            if (-this.field1159 > var2) {
                var2 = -this.field1159;
            }
            if (this.field1159 > var2) {
                var2 = this.field1159;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field1164 = arg0;
            this.field1157 = Integer.MIN_VALUE;
            this.field1154 = -this.field1165 / arg0;
            this.field1166 = -this.field1158 / arg0;
            this.field1160 = -this.field1159 / arg0;
        }
    }

    @ObfuscatedName("be.p(I)V")
    public synchronized void method1103(int arg0) {
        if (this.field1156 < 0) {
            this.field1156 = -arg0;
        } else {
            this.field1156 = arg0;
        }
    }

    @ObfuscatedName("be.l()I")
    public synchronized int method1104() {
        return this.field1156 < 0 ? -this.field1156 : this.field1156;
    }

    @ObfuscatedName("be.w()Z")
    public boolean method1105() {
        return this.field1155 < 0 || this.field1155 >= ((class56) this.field1171).field1136.length << 8;
    }

    @ObfuscatedName("be.x()Z")
    public boolean method1127() {
        return this.field1164 != 0;
    }

    @ObfuscatedName("be.e()Lbf;")
    public class60 method935() {
        return null;
    }

    @ObfuscatedName("be.k()Lbf;")
    public class60 method954() {
        return null;
    }

    @ObfuscatedName("be.b()I")
    public int method937() {
        return this.field1157 == 0 && this.field1164 == 0 ? 0 : 1;
    }

    @ObfuscatedName("be.n([III)V")
    public synchronized void method938(int[] arg0, int arg1, int arg2) {
        if (this.field1157 == 0 && this.field1164 == 0) {
            this.method940(arg2);
            return;
        }
        class56 var4 = (class56) this.field1171;
        int var5 = this.field1161 << 8;
        int var6 = this.field1167 << 8;
        int var7 = var4.field1136.length << 8;
        int var8 = var6 - var5;
        if (var8 <= 0) {
            this.field1153 = 0;
        }
        int var9 = arg1;
        int var10 = arg1 + arg2;
        if (this.field1155 < 0) {
            if (this.field1156 <= 0) {
                this.method1109();
                this.method3309();
                return;
            }
            this.field1155 = 0;
        }
        if (this.field1155 >= var7) {
            if (this.field1156 >= 0) {
                this.method1109();
                this.method3309();
                return;
            }
            this.field1155 = var7 - 1;
        }
        if (this.field1153 >= 0) {
            if (this.field1153 > 0) {
                if (this.field1163) {
                    label131: {
                        if (this.field1156 < 0) {
                            var9 = this.method1110(arg0, arg1, var5, var10, var4.field1136[this.field1161]);
                            if (this.field1155 >= var5) {
                                return;
                            }
                            this.field1155 = var5 + var5 - 1 - this.field1155;
                            this.field1156 = -this.field1156;
                            if (--this.field1153 == 0) {
                                break label131;
                            }
                        }
                        do {
                            var9 = this.method1208(arg0, var9, var6, var10, var4.field1136[this.field1167 - 1]);
                            if (this.field1155 < var6) {
                                return;
                            }
                            this.field1155 = var6 + var6 - 1 - this.field1155;
                            this.field1156 = -this.field1156;
                            if (--this.field1153 == 0) {
                                break;
                            }
                            var9 = this.method1110(arg0, var9, var5, var10, var4.field1136[this.field1161]);
                            if (this.field1155 >= var5) {
                                return;
                            }
                            this.field1155 = var5 + var5 - 1 - this.field1155;
                            this.field1156 = -this.field1156;
                        } while (--this.field1153 != 0);
                    }
                } else if (this.field1156 < 0) {
                    while (true) {
                        var9 = this.method1110(arg0, var9, var5, var10, var4.field1136[this.field1167 - 1]);
                        if (this.field1155 >= var5) {
                            return;
                        }
                        int var12 = (var6 - 1 - this.field1155) / var8;
                        if (var12 >= this.field1153) {
                            this.field1155 += this.field1153 * var8;
                            this.field1153 = 0;
                            break;
                        }
                        this.field1155 += var8 * var12;
                        this.field1153 -= var12;
                    }
                } else {
                    while (true) {
                        var9 = this.method1208(arg0, var9, var6, var10, var4.field1136[this.field1161]);
                        if (this.field1155 < var6) {
                            return;
                        }
                        int var13 = (this.field1155 - var5) / var8;
                        if (var13 >= this.field1153) {
                            this.field1155 -= this.field1153 * var8;
                            this.field1153 = 0;
                            break;
                        }
                        this.field1155 -= var8 * var13;
                        this.field1153 -= var13;
                    }
                }
            }
            if (this.field1156 < 0) {
                this.method1110(arg0, var9, 0, var10, 0);
                if (this.field1155 < 0) {
                    this.field1155 = -1;
                    this.method1109();
                    this.method3309();
                }
            } else {
                this.method1208(arg0, var9, var7, var10, 0);
                if (this.field1155 >= var7) {
                    this.field1155 = var7;
                    this.method1109();
                    this.method3309();
                }
            }
        } else if (this.field1163) {
            if (this.field1156 < 0) {
                var9 = this.method1110(arg0, arg1, var5, var10, var4.field1136[this.field1161]);
                if (this.field1155 >= var5) {
                    return;
                }
                this.field1155 = var5 + var5 - 1 - this.field1155;
                this.field1156 = -this.field1156;
            }
            while (true) {
                int var11 = this.method1208(arg0, var9, var6, var10, var4.field1136[this.field1167 - 1]);
                if (this.field1155 < var6) {
                    return;
                }
                this.field1155 = var6 + var6 - 1 - this.field1155;
                this.field1156 = -this.field1156;
                var9 = this.method1110(arg0, var11, var5, var10, var4.field1136[this.field1161]);
                if (this.field1155 >= var5) {
                    return;
                }
                this.field1155 = var5 + var5 - 1 - this.field1155;
                this.field1156 = -this.field1156;
            }
        } else if (this.field1156 < 0) {
            while (true) {
                var9 = this.method1110(arg0, var9, var5, var10, var4.field1136[this.field1167 - 1]);
                if (this.field1155 >= var5) {
                    return;
                }
                this.field1155 = var6 - 1 - (var6 - 1 - this.field1155) % var8;
            }
        } else {
            while (true) {
                var9 = this.method1208(arg0, var9, var6, var10, var4.field1136[this.field1161]);
                if (this.field1155 < var6) {
                    return;
                }
                this.field1155 = (this.field1155 - var5) % var8 + var5;
            }
        }
    }

    @ObfuscatedName("be.q(I)V")
    public synchronized void method940(int arg0) {
        if (this.field1164 > 0) {
            if (arg0 >= this.field1164) {
                if (this.field1157 == Integer.MIN_VALUE) {
                    this.field1157 = 0;
                    this.field1159 = 0;
                    this.field1158 = 0;
                    this.field1165 = 0;
                    this.method3309();
                    arg0 = this.field1164;
                }
                this.field1164 = 0;
                this.method1090();
            } else {
                this.field1165 += this.field1154 * arg0;
                this.field1158 += this.field1166 * arg0;
                this.field1159 += this.field1160 * arg0;
                this.field1164 -= arg0;
            }
        }
        class56 var2 = (class56) this.field1171;
        int var3 = this.field1161 << 8;
        int var4 = this.field1167 << 8;
        int var5 = var2.field1136.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field1153 = 0;
        }
        if (this.field1155 < 0) {
            if (this.field1156 <= 0) {
                this.method1109();
                this.method3309();
                return;
            }
            this.field1155 = 0;
        }
        if (this.field1155 >= var5) {
            if (this.field1156 >= 0) {
                this.method1109();
                this.method3309();
                return;
            }
            this.field1155 = var5 - 1;
        }
        this.field1155 += this.field1156 * arg0;
        if (this.field1153 >= 0) {
            if (this.field1153 > 0) {
                if (this.field1163) {
                    label121: {
                        if (this.field1156 < 0) {
                            if (this.field1155 >= var3) {
                                return;
                            }
                            this.field1155 = var3 + var3 - 1 - this.field1155;
                            this.field1156 = -this.field1156;
                            if (--this.field1153 == 0) {
                                break label121;
                            }
                        }
                        do {
                            if (this.field1155 < var4) {
                                return;
                            }
                            this.field1155 = var4 + var4 - 1 - this.field1155;
                            this.field1156 = -this.field1156;
                            if (--this.field1153 == 0) {
                                break;
                            }
                            if (this.field1155 >= var3) {
                                return;
                            }
                            this.field1155 = var3 + var3 - 1 - this.field1155;
                            this.field1156 = -this.field1156;
                        } while (--this.field1153 != 0);
                    }
                } else {
                    label153: {
                        if (this.field1156 < 0) {
                            if (this.field1155 >= var3) {
                                return;
                            }
                            int var7 = (var4 - 1 - this.field1155) / var6;
                            if (var7 >= this.field1153) {
                                this.field1155 += this.field1153 * var6;
                                this.field1153 = 0;
                                break label153;
                            }
                            this.field1155 += var6 * var7;
                            this.field1153 -= var7;
                        } else if (this.field1155 >= var4) {
                            int var8 = (this.field1155 - var3) / var6;
                            if (var8 >= this.field1153) {
                                this.field1155 -= this.field1153 * var6;
                                this.field1153 = 0;
                                break label153;
                            }
                            this.field1155 -= var6 * var8;
                            this.field1153 -= var8;
                        } else {
                            return;
                        }
                        return;
                    }
                }
            }
            if (this.field1156 < 0) {
                if (this.field1155 < 0) {
                    this.field1155 = -1;
                    this.method1109();
                    this.method3309();
                }
            } else if (this.field1155 >= var5) {
                this.field1155 = var5;
                this.method1109();
                this.method3309();
            }
        } else if (this.field1163) {
            if (this.field1156 < 0) {
                if (this.field1155 >= var3) {
                    return;
                }
                this.field1155 = var3 + var3 - 1 - this.field1155;
                this.field1156 = -this.field1156;
            }
            while (this.field1155 >= var4) {
                this.field1155 = var4 + var4 - 1 - this.field1155;
                this.field1156 = -this.field1156;
                if (this.field1155 >= var3) {
                    return;
                }
                this.field1155 = var3 + var3 - 1 - this.field1155;
                this.field1156 = -this.field1156;
            }
        } else if (this.field1156 < 0) {
            if (this.field1155 >= var3) {
                return;
            }
            this.field1155 = var4 - 1 - (var4 - 1 - this.field1155) % var6;
        } else if (this.field1155 >= var4) {
            this.field1155 = (this.field1155 - var3) % var6 + var3;
        } else {
            return;
        }
    }

    @ObfuscatedName("be.aw([IIIII)I")
    public int method1208(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1164 > 0) {
                int var6 = this.field1164 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1164 += arg1;
                if (this.field1156 == 256 && (this.field1155 & 0xFF) == 0) {
                    if (Statics.field1086) {
                        arg1 = method1096(0, ((class56) this.field1171).field1136, arg0, this.field1155, arg1, this.field1158, this.field1159, this.field1166, this.field1160, 0, var6, arg2, this);
                    } else {
                        arg1 = method1119(((class56) this.field1171).field1136, arg0, this.field1155, arg1, this.field1165, this.field1154, 0, var6, arg2, this);
                    }
                } else if (Statics.field1086) {
                    arg1 = method1124(0, 0, ((class56) this.field1171).field1136, arg0, this.field1155, arg1, this.field1158, this.field1159, this.field1166, this.field1160, 0, var6, arg2, this, this.field1156, arg4);
                } else {
                    arg1 = method1123(0, 0, ((class56) this.field1171).field1136, arg0, this.field1155, arg1, this.field1165, this.field1154, 0, var6, arg2, this, this.field1156, arg4);
                }
                this.field1164 -= arg1;
                if (this.field1164 != 0) {
                    return arg1;
                }
                if (!this.method1176()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1156 == 256 && (this.field1155 & 0xFF) == 0) {
                if (Statics.field1086) {
                    return method1213(0, ((class56) this.field1171).field1136, arg0, this.field1155, arg1, this.field1158, this.field1159, 0, arg3, arg2, this);
                }
                return method1111(((class56) this.field1171).field1136, arg0, this.field1155, arg1, this.field1165, 0, arg3, arg2, this);
            }
            if (Statics.field1086) {
                return method1116(0, 0, ((class56) this.field1171).field1136, arg0, this.field1155, arg1, this.field1158, this.field1159, 0, arg3, arg2, this, this.field1156, arg4);
            }
            return method1115(0, 0, ((class56) this.field1171).field1136, arg0, this.field1155, arg1, this.field1165, 0, arg3, arg2, this, this.field1156, arg4);
        }
    }

    @ObfuscatedName("be.aq([IIIII)I")
    public int method1110(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1164 > 0) {
                int var6 = this.field1164 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1164 += arg1;
                if (this.field1156 == -256 && (this.field1155 & 0xFF) == 0) {
                    if (Statics.field1086) {
                        arg1 = method1122(0, ((class56) this.field1171).field1136, arg0, this.field1155, arg1, this.field1158, this.field1159, this.field1166, this.field1160, 0, var6, arg2, this);
                    } else {
                        arg1 = method1121(((class56) this.field1171).field1136, arg0, this.field1155, arg1, this.field1165, this.field1154, 0, var6, arg2, this);
                    }
                } else if (Statics.field1086) {
                    arg1 = method1175(0, 0, ((class56) this.field1171).field1136, arg0, this.field1155, arg1, this.field1158, this.field1159, this.field1166, this.field1160, 0, var6, arg2, this, this.field1156, arg4);
                } else {
                    arg1 = method1094(0, 0, ((class56) this.field1171).field1136, arg0, this.field1155, arg1, this.field1165, this.field1154, 0, var6, arg2, this, this.field1156, arg4);
                }
                this.field1164 -= arg1;
                if (this.field1164 != 0) {
                    return arg1;
                }
                if (!this.method1176()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1156 == -256 && (this.field1155 & 0xFF) == 0) {
                if (Statics.field1086) {
                    return method1162(0, ((class56) this.field1171).field1136, arg0, this.field1155, arg1, this.field1158, this.field1159, 0, arg3, arg2, this);
                }
                return method1183(((class56) this.field1171).field1136, arg0, this.field1155, arg1, this.field1165, 0, arg3, arg2, this);
            }
            if (Statics.field1086) {
                return method1173(0, 0, ((class56) this.field1171).field1136, arg0, this.field1155, arg1, this.field1158, this.field1159, 0, arg3, arg2, this, this.field1156, arg4);
            }
            return method1170(0, 0, ((class56) this.field1171).field1136, arg0, this.field1155, arg1, this.field1165, 0, arg3, arg2, this, this.field1156, arg4);
        }
    }

    @ObfuscatedName("be.ad()Z")
    public boolean method1176() {
        int var1 = this.field1157;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method1133(var1, this.field1162);
            var2 = method1139(var1, this.field1162);
        }
        if (this.field1165 != var1 || this.field1158 != var3 || this.field1159 != var2) {
            if (this.field1165 < var1) {
                this.field1154 = 1;
                this.field1164 = var1 - this.field1165;
            } else if (this.field1165 > var1) {
                this.field1154 = -1;
                this.field1164 = this.field1165 - var1;
            } else {
                this.field1154 = 0;
            }
            if (this.field1158 < var3) {
                this.field1166 = 1;
                if (this.field1164 == 0 || this.field1164 > var3 - this.field1158) {
                    this.field1164 = var3 - this.field1158;
                }
            } else if (this.field1158 > var3) {
                this.field1166 = -1;
                if (this.field1164 == 0 || this.field1164 > this.field1158 - var3) {
                    this.field1164 = this.field1158 - var3;
                }
            } else {
                this.field1166 = 0;
            }
            if (this.field1159 < var2) {
                this.field1160 = 1;
                if (this.field1164 == 0 || this.field1164 > var2 - this.field1159) {
                    this.field1164 = var2 - this.field1159;
                }
            } else if (this.field1159 > var2) {
                this.field1160 = -1;
                if (this.field1164 == 0 || this.field1164 > this.field1159 - var2) {
                    this.field1164 = this.field1159 - var2;
                }
            } else {
                this.field1160 = 0;
            }
            return false;
        } else if (this.field1157 == Integer.MIN_VALUE) {
            this.field1157 = 0;
            this.field1159 = 0;
            this.field1158 = 0;
            this.field1165 = 0;
            this.method3309();
            return true;
        } else {
            this.method1090();
            return false;
        }
    }

    @ObfuscatedName("be.at([B[IIIIIIILbe;)I")
    public static int method1111(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class58 arg8) {
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
        arg8.field1155 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("be.ay(I[B[IIIIIIIILbe;)I")
    public static int method1213(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class58 arg10) {
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
        arg10.field1155 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("be.am([B[IIIIIIILbe;)I")
    public static int method1183(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class58 arg8) {
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
        arg8.field1155 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("be.az(I[B[IIIIIIIILbe;)I")
    public static int method1162(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class58 arg10) {
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
        arg10.field1155 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("be.au(II[B[IIIIIIILbe;II)I")
    public static int method1115(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class58 arg10, int arg11, int arg12) {
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
        arg10.field1155 = arg4;
        return arg5;
    }

    @ObfuscatedName("be.ab(II[B[IIIIIIIILbe;II)I")
    public static int method1116(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class58 arg11, int arg12, int arg13) {
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
        arg11.field1155 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("be.ao(II[B[IIIIIIILbe;II)I")
    public static int method1170(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class58 arg10, int arg11, int arg12) {
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
        arg10.field1155 = arg4;
        return arg5;
    }

    @ObfuscatedName("be.ah(II[B[IIIIIIIILbe;II)I")
    public static int method1173(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class58 arg11, int arg12, int arg13) {
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
        arg11.field1155 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("be.ap([B[IIIIIIIILbe;)I")
    public static int method1119(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class58 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field1158 += (var14 - arg3) * arg9.field1166;
        arg9.field1159 += (var14 - arg3) * arg9.field1160;
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
        arg9.field1165 = var12 >> 2;
        arg9.field1155 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("be.as(I[B[IIIIIIIIIILbe;)I")
    public static int method1096(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class58 arg12) {
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
        arg12.field1165 += (var19 - arg4) * arg12.field1154;
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
        arg12.field1158 = var15 >> 2;
        arg12.field1159 = var16 >> 2;
        arg12.field1155 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("be.ax([B[IIIIIIIILbe;)I")
    public static int method1121(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class58 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field1158 += (var14 - arg3) * arg9.field1166;
        arg9.field1159 += (var14 - arg3) * arg9.field1160;
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
        arg9.field1165 = var12 >> 2;
        arg9.field1155 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("be.bg(I[B[IIIIIIIIIILbe;)I")
    public static int method1122(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class58 arg12) {
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
        arg12.field1165 += (var19 - arg4) * arg12.field1154;
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
        arg12.field1158 = var15 >> 2;
        arg12.field1159 = var16 >> 2;
        arg12.field1155 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("be.bd(II[B[IIIIIIIILbe;II)I")
    public static int method1123(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class58 arg11, int arg12, int arg13) {
        arg11.field1158 -= arg11.field1166 * arg5;
        arg11.field1159 -= arg11.field1160 * arg5;
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
        arg11.field1158 += arg11.field1166 * arg5;
        arg11.field1159 += arg11.field1160 * arg5;
        arg11.field1165 = arg6;
        arg11.field1155 = arg4;
        return arg5;
    }

    @ObfuscatedName("be.bp(II[B[IIIIIIIIIILbe;II)I")
    public static int method1124(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class58 arg13, int arg14, int arg15) {
        arg13.field1165 -= arg13.field1154 * arg5;
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
        arg13.field1165 += arg13.field1154 * var27;
        arg13.field1158 = arg6;
        arg13.field1159 = arg7;
        arg13.field1155 = arg4;
        return var27;
    }

    @ObfuscatedName("be.bm(II[B[IIIIIIIILbe;II)I")
    public static int method1094(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class58 arg11, int arg12, int arg13) {
        arg11.field1158 -= arg11.field1166 * arg5;
        arg11.field1159 -= arg11.field1160 * arg5;
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
        arg11.field1158 += arg11.field1166 * arg5;
        arg11.field1159 += arg11.field1160 * arg5;
        arg11.field1165 = arg6;
        arg11.field1155 = arg4;
        return arg5;
    }

    @ObfuscatedName("be.bh(II[B[IIIIIIIIIILbe;II)I")
    public static int method1175(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class58 arg13, int arg14, int arg15) {
        arg13.field1165 -= arg13.field1154 * arg5;
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
        arg13.field1165 += arg13.field1154 * var26;
        arg13.field1158 = arg6;
        arg13.field1159 = arg7;
        arg13.field1155 = arg4;
        return var26;
    }
}
