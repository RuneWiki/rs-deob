package deob;

@ObfuscatedName("bd")
public class class58 extends class60 {

    @ObfuscatedName("bd.p")
    public int field1146;

    @ObfuscatedName("bd.g")
    public int field1139;

    @ObfuscatedName("bd.x")
    public int field1140;

    @ObfuscatedName("bd.c")
    public int field1143;

    @ObfuscatedName("bd.n")
    public int field1152;

    @ObfuscatedName("bd.s")
    public int field1147;

    @ObfuscatedName("bd.r")
    public int field1144;

    @ObfuscatedName("bd.u")
    public int field1145;

    @ObfuscatedName("bd.d")
    public int field1148;

    @ObfuscatedName("bd.h")
    public int field1138;

    @ObfuscatedName("bd.a")
    public boolean field1141;

    @ObfuscatedName("bd.y")
    public int field1149;

    @ObfuscatedName("bd.v")
    public int field1150;

    @ObfuscatedName("bd.e")
    public int field1151;

    @ObfuscatedName("bd.b")
    public int field1142;

    @ObfuscatedName("bd.p(II)I")
    public static int method1266(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("bd.g(II)I")
    public static int method1173(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("bd.ax()I")
    public int method1150() {
        int var1 = this.field1152 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field1145 == 0) {
            var2 -= this.field1146 * var2 / (((class56) this.field1155).field1122.length << 8);
        } else if (this.field1145 >= 0) {
            var2 -= this.field1148 * var2 / ((class56) this.field1155).field1122.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    public class58(class56 arg0, int arg1, int arg2) {
        this.field1155 = arg0;
        this.field1148 = arg0.field1123;
        this.field1138 = arg0.field1121;
        this.field1141 = arg0.field1125;
        this.field1139 = arg1;
        this.field1140 = arg2;
        this.field1143 = 8192;
        this.field1146 = 0;
        this.method1153();
    }

    public class58(class56 arg0, int arg1, int arg2, int arg3) {
        this.field1155 = arg0;
        this.field1148 = arg0.field1123;
        this.field1138 = arg0.field1121;
        this.field1141 = arg0.field1125;
        this.field1139 = arg1;
        this.field1140 = arg2;
        this.field1143 = arg3;
        this.field1146 = 0;
        this.method1153();
    }

    @ObfuscatedName("bd.x(Lbp;II)Lbd;")
    public static class58 method1176(class56 arg0, int arg1, int arg2) {
        return arg0.field1122 == null || arg0.field1122.length == 0 ? null : new class58(arg0, (int) ((long) arg0.field1124 * 256L * (long) arg1 / (long) (Statics.field2674 * 100)), arg2 << 6);
    }

    @ObfuscatedName("bd.c(Lbp;III)Lbd;")
    public static class58 method1267(class56 arg0, int arg1, int arg2, int arg3) {
        return arg0.field1122 == null || arg0.field1122.length == 0 ? null : new class58(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("bd.n()V")
    public void method1153() {
        this.field1152 = this.field1140;
        this.field1147 = method1266(this.field1140, this.field1143);
        this.field1144 = method1173(this.field1140, this.field1143);
    }

    @ObfuscatedName("bd.d(I)V")
    public synchronized void method1265(int arg0) {
        this.field1145 = arg0;
    }

    @ObfuscatedName("bd.a(I)V")
    public synchronized void method1155(int arg0) {
        this.method1157(arg0 << 6, this.method1159());
    }

    @ObfuscatedName("bd.y(I)V")
    public synchronized void method1156(int arg0) {
        this.method1157(arg0, this.method1159());
    }

    @ObfuscatedName("bd.v(II)V")
    public synchronized void method1157(int arg0, int arg1) {
        this.field1140 = arg0;
        this.field1143 = arg1;
        this.field1149 = 0;
        this.method1153();
    }

    @ObfuscatedName("bd.e()I")
    public synchronized int method1234() {
        return this.field1140 == Integer.MIN_VALUE ? 0 : this.field1140;
    }

    @ObfuscatedName("bd.b()I")
    public synchronized int method1159() {
        return this.field1143 < 0 ? -1 : this.field1143;
    }

    @ObfuscatedName("bd.z(I)V")
    public synchronized void method1160(int arg0) {
        int var2 = ((class56) this.field1155).field1122.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field1146 = arg0;
    }

    @ObfuscatedName("bd.l(Z)V")
    public synchronized void method1161(boolean arg0) {
        this.field1139 = (this.field1139 >>> 31) + (this.field1139 ^ this.field1139 >> 31);
        if (arg0) {
            this.field1139 = -this.field1139;
        }
    }

    @ObfuscatedName("bd.t()V")
    public void method1162() {
        if (this.field1149 == 0) {
            return;
        }
        if (this.field1140 == Integer.MIN_VALUE) {
            this.field1140 = 0;
        }
        this.field1149 = 0;
        this.method1153();
    }

    @ObfuscatedName("bd.q(II)V")
    public synchronized void method1163(int arg0, int arg1) {
        this.method1164(arg0, arg1, this.method1159());
    }

    @ObfuscatedName("bd.j(III)V")
    public synchronized void method1164(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method1157(arg1, arg2);
            return;
        }
        int var4 = method1266(arg1, arg2);
        int var5 = method1173(arg1, arg2);
        if (this.field1147 == var4 && this.field1144 == var5) {
            this.field1149 = 0;
            return;
        }
        int var6 = arg1 - this.field1152;
        if (this.field1152 - arg1 > var6) {
            var6 = this.field1152 - arg1;
        }
        if (var4 - this.field1147 > var6) {
            var6 = var4 - this.field1147;
        }
        if (this.field1147 - var4 > var6) {
            var6 = this.field1147 - var4;
        }
        if (var5 - this.field1144 > var6) {
            var6 = var5 - this.field1144;
        }
        if (this.field1144 - var5 > var6) {
            var6 = this.field1144 - var5;
        }
        if (arg0 > var6) {
            arg0 = var6;
        }
        this.field1149 = arg0;
        this.field1140 = arg1;
        this.field1143 = arg2;
        this.field1150 = (arg1 - this.field1152) / arg0;
        this.field1151 = (var4 - this.field1147) / arg0;
        this.field1142 = (var5 - this.field1144) / arg0;
    }

    @ObfuscatedName("bd.o(I)V")
    public synchronized void method1226(int arg0) {
        if (arg0 == 0) {
            this.method1156(0);
            this.method3378();
        } else if (this.field1147 == 0 && this.field1144 == 0) {
            this.field1149 = 0;
            this.field1140 = 0;
            this.field1152 = 0;
            this.method3378();
        } else {
            int var2 = -this.field1152;
            if (this.field1152 > var2) {
                var2 = this.field1152;
            }
            if (-this.field1147 > var2) {
                var2 = -this.field1147;
            }
            if (this.field1147 > var2) {
                var2 = this.field1147;
            }
            if (-this.field1144 > var2) {
                var2 = -this.field1144;
            }
            if (this.field1144 > var2) {
                var2 = this.field1144;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field1149 = arg0;
            this.field1140 = Integer.MIN_VALUE;
            this.field1150 = -this.field1152 / arg0;
            this.field1151 = -this.field1147 / arg0;
            this.field1142 = -this.field1144 / arg0;
        }
    }

    @ObfuscatedName("bd.i(I)V")
    public synchronized void method1166(int arg0) {
        if (this.field1139 < 0) {
            this.field1139 = -arg0;
        } else {
            this.field1139 = arg0;
        }
    }

    @ObfuscatedName("bd.aa()I")
    public synchronized int method1170() {
        return this.field1139 < 0 ? -this.field1139 : this.field1139;
    }

    @ObfuscatedName("bd.ao()Z")
    public boolean method1212() {
        return this.field1146 < 0 || this.field1146 >= ((class56) this.field1155).field1122.length << 8;
    }

    @ObfuscatedName("bd.az()Z")
    public boolean method1169() {
        return this.field1149 != 0;
    }

    @ObfuscatedName("bd.s()Lbn;")
    public class60 method1005() {
        return null;
    }

    @ObfuscatedName("bd.r()Lbn;")
    public class60 method1029() {
        return null;
    }

    @ObfuscatedName("bd.w()I")
    public int method1030() {
        return this.field1140 == 0 && this.field1149 == 0 ? 0 : 1;
    }

    @ObfuscatedName("bd.u([III)V")
    public synchronized void method1008(int[] arg0, int arg1, int arg2) {
        if (this.field1140 == 0 && this.field1149 == 0) {
            this.method1010(arg2);
            return;
        }
        class56 var4 = (class56) this.field1155;
        int var5 = this.field1148 << 8;
        int var6 = this.field1138 << 8;
        int var7 = var4.field1122.length << 8;
        int var8 = var6 - var5;
        if (var8 <= 0) {
            this.field1145 = 0;
        }
        int var9 = arg1;
        int var10 = arg1 + arg2;
        if (this.field1146 < 0) {
            if (this.field1139 <= 0) {
                this.method1162();
                this.method3378();
                return;
            }
            this.field1146 = 0;
        }
        if (this.field1146 >= var7) {
            if (this.field1139 >= 0) {
                this.method1162();
                this.method3378();
                return;
            }
            this.field1146 = var7 - 1;
        }
        if (this.field1145 >= 0) {
            if (this.field1145 > 0) {
                if (this.field1141) {
                    label131: {
                        if (this.field1139 < 0) {
                            var9 = this.method1174(arg0, arg1, var5, var10, var4.field1122[this.field1148]);
                            if (this.field1146 >= var5) {
                                return;
                            }
                            this.field1146 = var5 + var5 - 1 - this.field1146;
                            this.field1139 = -this.field1139;
                            if (--this.field1145 == 0) {
                                break label131;
                            }
                        }
                        do {
                            var9 = this.method1168(arg0, var9, var6, var10, var4.field1122[this.field1138 - 1]);
                            if (this.field1146 < var6) {
                                return;
                            }
                            this.field1146 = var6 + var6 - 1 - this.field1146;
                            this.field1139 = -this.field1139;
                            if (--this.field1145 == 0) {
                                break;
                            }
                            var9 = this.method1174(arg0, var9, var5, var10, var4.field1122[this.field1148]);
                            if (this.field1146 >= var5) {
                                return;
                            }
                            this.field1146 = var5 + var5 - 1 - this.field1146;
                            this.field1139 = -this.field1139;
                        } while (--this.field1145 != 0);
                    }
                } else if (this.field1139 < 0) {
                    while (true) {
                        var9 = this.method1174(arg0, var9, var5, var10, var4.field1122[this.field1138 - 1]);
                        if (this.field1146 >= var5) {
                            return;
                        }
                        int var12 = (var6 - 1 - this.field1146) / var8;
                        if (var12 >= this.field1145) {
                            this.field1146 += this.field1145 * var8;
                            this.field1145 = 0;
                            break;
                        }
                        this.field1146 += var8 * var12;
                        this.field1145 -= var12;
                    }
                } else {
                    while (true) {
                        var9 = this.method1168(arg0, var9, var6, var10, var4.field1122[this.field1148]);
                        if (this.field1146 < var6) {
                            return;
                        }
                        int var13 = (this.field1146 - var5) / var8;
                        if (var13 >= this.field1145) {
                            this.field1146 -= this.field1145 * var8;
                            this.field1145 = 0;
                            break;
                        }
                        this.field1146 -= var8 * var13;
                        this.field1145 -= var13;
                    }
                }
            }
            if (this.field1139 < 0) {
                this.method1174(arg0, var9, 0, var10, 0);
                if (this.field1146 < 0) {
                    this.field1146 = -1;
                    this.method1162();
                    this.method3378();
                }
            } else {
                this.method1168(arg0, var9, var7, var10, 0);
                if (this.field1146 >= var7) {
                    this.field1146 = var7;
                    this.method1162();
                    this.method3378();
                }
            }
        } else if (this.field1141) {
            if (this.field1139 < 0) {
                var9 = this.method1174(arg0, arg1, var5, var10, var4.field1122[this.field1148]);
                if (this.field1146 >= var5) {
                    return;
                }
                this.field1146 = var5 + var5 - 1 - this.field1146;
                this.field1139 = -this.field1139;
            }
            while (true) {
                int var11 = this.method1168(arg0, var9, var6, var10, var4.field1122[this.field1138 - 1]);
                if (this.field1146 < var6) {
                    return;
                }
                this.field1146 = var6 + var6 - 1 - this.field1146;
                this.field1139 = -this.field1139;
                var9 = this.method1174(arg0, var11, var5, var10, var4.field1122[this.field1148]);
                if (this.field1146 >= var5) {
                    return;
                }
                this.field1146 = var5 + var5 - 1 - this.field1146;
                this.field1139 = -this.field1139;
            }
        } else if (this.field1139 < 0) {
            while (true) {
                var9 = this.method1174(arg0, var9, var5, var10, var4.field1122[this.field1138 - 1]);
                if (this.field1146 >= var5) {
                    return;
                }
                this.field1146 = var6 - 1 - (var6 - 1 - this.field1146) % var8;
            }
        } else {
            while (true) {
                var9 = this.method1168(arg0, var9, var6, var10, var4.field1122[this.field1148]);
                if (this.field1146 < var6) {
                    return;
                }
                this.field1146 = (this.field1146 - var5) % var8 + var5;
            }
        }
    }

    @ObfuscatedName("bd.h(I)V")
    public synchronized void method1010(int arg0) {
        if (this.field1149 > 0) {
            if (arg0 >= this.field1149) {
                if (this.field1140 == Integer.MIN_VALUE) {
                    this.field1140 = 0;
                    this.field1144 = 0;
                    this.field1147 = 0;
                    this.field1152 = 0;
                    this.method3378();
                    arg0 = this.field1149;
                }
                this.field1149 = 0;
                this.method1153();
            } else {
                this.field1152 += this.field1150 * arg0;
                this.field1147 += this.field1151 * arg0;
                this.field1144 += this.field1142 * arg0;
                this.field1149 -= arg0;
            }
        }
        class56 var2 = (class56) this.field1155;
        int var3 = this.field1148 << 8;
        int var4 = this.field1138 << 8;
        int var5 = var2.field1122.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field1145 = 0;
        }
        if (this.field1146 < 0) {
            if (this.field1139 <= 0) {
                this.method1162();
                this.method3378();
                return;
            }
            this.field1146 = 0;
        }
        if (this.field1146 >= var5) {
            if (this.field1139 >= 0) {
                this.method1162();
                this.method3378();
                return;
            }
            this.field1146 = var5 - 1;
        }
        this.field1146 += this.field1139 * arg0;
        if (this.field1145 >= 0) {
            if (this.field1145 > 0) {
                if (this.field1141) {
                    label121: {
                        if (this.field1139 < 0) {
                            if (this.field1146 >= var3) {
                                return;
                            }
                            this.field1146 = var3 + var3 - 1 - this.field1146;
                            this.field1139 = -this.field1139;
                            if (--this.field1145 == 0) {
                                break label121;
                            }
                        }
                        do {
                            if (this.field1146 < var4) {
                                return;
                            }
                            this.field1146 = var4 + var4 - 1 - this.field1146;
                            this.field1139 = -this.field1139;
                            if (--this.field1145 == 0) {
                                break;
                            }
                            if (this.field1146 >= var3) {
                                return;
                            }
                            this.field1146 = var3 + var3 - 1 - this.field1146;
                            this.field1139 = -this.field1139;
                        } while (--this.field1145 != 0);
                    }
                } else {
                    label153: {
                        if (this.field1139 < 0) {
                            if (this.field1146 >= var3) {
                                return;
                            }
                            int var7 = (var4 - 1 - this.field1146) / var6;
                            if (var7 >= this.field1145) {
                                this.field1146 += this.field1145 * var6;
                                this.field1145 = 0;
                                break label153;
                            }
                            this.field1146 += var6 * var7;
                            this.field1145 -= var7;
                        } else if (this.field1146 >= var4) {
                            int var8 = (this.field1146 - var3) / var6;
                            if (var8 >= this.field1145) {
                                this.field1146 -= this.field1145 * var6;
                                this.field1145 = 0;
                                break label153;
                            }
                            this.field1146 -= var6 * var8;
                            this.field1145 -= var8;
                        } else {
                            return;
                        }
                        return;
                    }
                }
            }
            if (this.field1139 < 0) {
                if (this.field1146 < 0) {
                    this.field1146 = -1;
                    this.method1162();
                    this.method3378();
                }
            } else if (this.field1146 >= var5) {
                this.field1146 = var5;
                this.method1162();
                this.method3378();
            }
        } else if (this.field1141) {
            if (this.field1139 < 0) {
                if (this.field1146 >= var3) {
                    return;
                }
                this.field1146 = var3 + var3 - 1 - this.field1146;
                this.field1139 = -this.field1139;
            }
            while (this.field1146 >= var4) {
                this.field1146 = var4 + var4 - 1 - this.field1146;
                this.field1139 = -this.field1139;
                if (this.field1146 >= var3) {
                    return;
                }
                this.field1146 = var3 + var3 - 1 - this.field1146;
                this.field1139 = -this.field1139;
            }
        } else if (this.field1139 < 0) {
            if (this.field1146 >= var3) {
                return;
            }
            this.field1146 = var4 - 1 - (var4 - 1 - this.field1146) % var6;
        } else if (this.field1146 >= var4) {
            this.field1146 = (this.field1146 - var3) % var6 + var3;
        } else {
            return;
        }
    }

    @ObfuscatedName("bd.ae([IIIII)I")
    public int method1168(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1149 > 0) {
                int var6 = this.field1149 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1149 += arg1;
                if (this.field1139 == 256 && (this.field1146 & 0xFF) == 0) {
                    if (Statics.field1924) {
                        arg1 = method1235(0, ((class56) this.field1155).field1122, arg0, this.field1146, arg1, this.field1147, this.field1144, this.field1151, this.field1142, 0, var6, arg2, this);
                    } else {
                        arg1 = method1275(((class56) this.field1155).field1122, arg0, this.field1146, arg1, this.field1152, this.field1150, 0, var6, arg2, this);
                    }
                } else if (Statics.field1924) {
                    arg1 = method1188(0, 0, ((class56) this.field1155).field1122, arg0, this.field1146, arg1, this.field1147, this.field1144, this.field1151, this.field1142, 0, var6, arg2, this, this.field1139, arg4);
                } else {
                    arg1 = method1232(0, 0, ((class56) this.field1155).field1122, arg0, this.field1146, arg1, this.field1152, this.field1150, 0, var6, arg2, this, this.field1139, arg4);
                }
                this.field1149 -= arg1;
                if (this.field1149 != 0) {
                    return arg1;
                }
                if (!this.method1175()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1139 == 256 && (this.field1146 & 0xFF) == 0) {
                if (Statics.field1924) {
                    return method1177(0, ((class56) this.field1155).field1122, arg0, this.field1146, arg1, this.field1147, this.field1144, 0, arg3, arg2, this);
                }
                return method1191(((class56) this.field1155).field1122, arg0, this.field1146, arg1, this.field1152, 0, arg3, arg2, this);
            }
            if (Statics.field1924) {
                return method1181(0, 0, ((class56) this.field1155).field1122, arg0, this.field1146, arg1, this.field1147, this.field1144, 0, arg3, arg2, this, this.field1139, arg4);
            }
            return method1172(0, 0, ((class56) this.field1155).field1122, arg0, this.field1146, arg1, this.field1152, 0, arg3, arg2, this, this.field1139, arg4);
        }
    }

    @ObfuscatedName("bd.av([IIIII)I")
    public int method1174(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1149 > 0) {
                int var6 = this.field1149 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1149 += arg1;
                if (this.field1139 == -256 && (this.field1146 & 0xFF) == 0) {
                    if (Statics.field1924) {
                        arg1 = method1237(0, ((class56) this.field1155).field1122, arg0, this.field1146, arg1, this.field1147, this.field1144, this.field1151, this.field1142, 0, var6, arg2, this);
                    } else {
                        arg1 = method1185(((class56) this.field1155).field1122, arg0, this.field1146, arg1, this.field1152, this.field1150, 0, var6, arg2, this);
                    }
                } else if (Statics.field1924) {
                    arg1 = method1190(0, 0, ((class56) this.field1155).field1122, arg0, this.field1146, arg1, this.field1147, this.field1144, this.field1151, this.field1142, 0, var6, arg2, this, this.field1139, arg4);
                } else {
                    arg1 = method1189(0, 0, ((class56) this.field1155).field1122, arg0, this.field1146, arg1, this.field1152, this.field1150, 0, var6, arg2, this, this.field1139, arg4);
                }
                this.field1149 -= arg1;
                if (this.field1149 != 0) {
                    return arg1;
                }
                if (!this.method1175()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1139 == -256 && (this.field1146 & 0xFF) == 0) {
                if (Statics.field1924) {
                    return method1179(0, ((class56) this.field1155).field1122, arg0, this.field1146, arg1, this.field1147, this.field1144, 0, arg3, arg2, this);
                }
                return method1178(((class56) this.field1155).field1122, arg0, this.field1146, arg1, this.field1152, 0, arg3, arg2, this);
            }
            if (Statics.field1924) {
                return method1182(0, 0, ((class56) this.field1155).field1122, arg0, this.field1146, arg1, this.field1147, this.field1144, 0, arg3, arg2, this, this.field1139, arg4);
            }
            return method1227(0, 0, ((class56) this.field1155).field1122, arg0, this.field1146, arg1, this.field1152, 0, arg3, arg2, this, this.field1139, arg4);
        }
    }

    @ObfuscatedName("bd.ai()Z")
    public boolean method1175() {
        int var1 = this.field1140;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method1266(var1, this.field1143);
            var2 = method1173(var1, this.field1143);
        }
        if (this.field1152 != var1 || this.field1147 != var3 || this.field1144 != var2) {
            if (this.field1152 < var1) {
                this.field1150 = 1;
                this.field1149 = var1 - this.field1152;
            } else if (this.field1152 > var1) {
                this.field1150 = -1;
                this.field1149 = this.field1152 - var1;
            } else {
                this.field1150 = 0;
            }
            if (this.field1147 < var3) {
                this.field1151 = 1;
                if (this.field1149 == 0 || this.field1149 > var3 - this.field1147) {
                    this.field1149 = var3 - this.field1147;
                }
            } else if (this.field1147 > var3) {
                this.field1151 = -1;
                if (this.field1149 == 0 || this.field1149 > this.field1147 - var3) {
                    this.field1149 = this.field1147 - var3;
                }
            } else {
                this.field1151 = 0;
            }
            if (this.field1144 < var2) {
                this.field1142 = 1;
                if (this.field1149 == 0 || this.field1149 > var2 - this.field1144) {
                    this.field1149 = var2 - this.field1144;
                }
            } else if (this.field1144 > var2) {
                this.field1142 = -1;
                if (this.field1149 == 0 || this.field1149 > this.field1144 - var2) {
                    this.field1149 = this.field1144 - var2;
                }
            } else {
                this.field1142 = 0;
            }
            return false;
        } else if (this.field1140 == Integer.MIN_VALUE) {
            this.field1140 = 0;
            this.field1144 = 0;
            this.field1147 = 0;
            this.field1152 = 0;
            this.method3378();
            return true;
        } else {
            this.method1153();
            return false;
        }
    }

    @ObfuscatedName("bd.aq([B[IIIIIIILbd;)I")
    public static int method1191(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class58 arg8) {
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
        arg8.field1146 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("bd.ad(I[B[IIIIIIIILbd;)I")
    public static int method1177(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class58 arg10) {
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
        arg10.field1146 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("bd.au([B[IIIIIIILbd;)I")
    public static int method1178(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class58 arg8) {
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
        arg8.field1146 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("bd.ag(I[B[IIIIIIIILbd;)I")
    public static int method1179(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class58 arg10) {
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
        arg10.field1146 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("bd.ar(II[B[IIIIIIILbd;II)I")
    public static int method1172(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class58 arg10, int arg11, int arg12) {
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
        arg10.field1146 = arg4;
        return arg5;
    }

    @ObfuscatedName("bd.am(II[B[IIIIIIIILbd;II)I")
    public static int method1181(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class58 arg11, int arg12, int arg13) {
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
        arg11.field1146 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("bd.ab(II[B[IIIIIIILbd;II)I")
    public static int method1227(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class58 arg10, int arg11, int arg12) {
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
        arg10.field1146 = arg4;
        return arg5;
    }

    @ObfuscatedName("bd.ac(II[B[IIIIIIIILbd;II)I")
    public static int method1182(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class58 arg11, int arg12, int arg13) {
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
        arg11.field1146 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("bd.ah([B[IIIIIIIILbd;)I")
    public static int method1275(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class58 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field1147 += (var14 - arg3) * arg9.field1151;
        arg9.field1144 += (var14 - arg3) * arg9.field1142;
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
        arg9.field1152 = var12 >> 2;
        arg9.field1146 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("bd.ay(I[B[IIIIIIIIIILbd;)I")
    public static int method1235(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class58 arg12) {
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
        arg12.field1152 += (var19 - arg4) * arg12.field1150;
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
        arg12.field1147 = var15 >> 2;
        arg12.field1144 = var16 >> 2;
        arg12.field1146 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("bd.ap([B[IIIIIIIILbd;)I")
    public static int method1185(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class58 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field1147 += (var14 - arg3) * arg9.field1151;
        arg9.field1144 += (var14 - arg3) * arg9.field1142;
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
        arg9.field1152 = var12 >> 2;
        arg9.field1146 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("bd.bj(I[B[IIIIIIIIIILbd;)I")
    public static int method1237(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class58 arg12) {
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
        arg12.field1152 += (var19 - arg4) * arg12.field1150;
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
        arg12.field1147 = var15 >> 2;
        arg12.field1144 = var16 >> 2;
        arg12.field1146 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("bd.bm(II[B[IIIIIIIILbd;II)I")
    public static int method1232(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class58 arg11, int arg12, int arg13) {
        arg11.field1147 -= arg11.field1151 * arg5;
        arg11.field1144 -= arg11.field1142 * arg5;
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
        arg11.field1147 += arg11.field1151 * arg5;
        arg11.field1144 += arg11.field1142 * arg5;
        arg11.field1152 = arg6;
        arg11.field1146 = arg4;
        return arg5;
    }

    @ObfuscatedName("bd.by(II[B[IIIIIIIIIILbd;II)I")
    public static int method1188(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class58 arg13, int arg14, int arg15) {
        arg13.field1152 -= arg13.field1150 * arg5;
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
        arg13.field1152 += arg13.field1150 * var27;
        arg13.field1147 = arg6;
        arg13.field1144 = arg7;
        arg13.field1146 = arg4;
        return var27;
    }

    @ObfuscatedName("bd.bp(II[B[IIIIIIIILbd;II)I")
    public static int method1189(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class58 arg11, int arg12, int arg13) {
        arg11.field1147 -= arg11.field1151 * arg5;
        arg11.field1144 -= arg11.field1142 * arg5;
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
        arg11.field1147 += arg11.field1151 * arg5;
        arg11.field1144 += arg11.field1142 * arg5;
        arg11.field1152 = arg6;
        arg11.field1146 = arg4;
        return arg5;
    }

    @ObfuscatedName("bd.bc(II[B[IIIIIIIIIILbd;II)I")
    public static int method1190(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class58 arg13, int arg14, int arg15) {
        arg13.field1152 -= arg13.field1150 * arg5;
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
        arg13.field1152 += arg13.field1150 * var26;
        arg13.field1147 = arg6;
        arg13.field1144 = arg7;
        arg13.field1146 = arg4;
        return var26;
    }
}
