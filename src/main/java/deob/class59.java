package deob;

@ObfuscatedName("bc")
public class class59 extends class61 {

    @ObfuscatedName("bc.e")
    public int field1170;

    @ObfuscatedName("bc.v")
    public int field1171;

    @ObfuscatedName("bc.k")
    public int field1173;

    @ObfuscatedName("bc.g")
    public int field1172;

    @ObfuscatedName("bc.q")
    public int field1174;

    @ObfuscatedName("bc.l")
    public int field1176;

    @ObfuscatedName("bc.a")
    public int field1175;

    @ObfuscatedName("bc.b")
    public int field1177;

    @ObfuscatedName("bc.z")
    public int field1178;

    @ObfuscatedName("bc.j")
    public int field1179;

    @ObfuscatedName("bc.p")
    public boolean field1180;

    @ObfuscatedName("bc.n")
    public int field1181;

    @ObfuscatedName("bc.r")
    public int field1182;

    @ObfuscatedName("bc.s")
    public int field1183;

    @ObfuscatedName("bc.f")
    public int field1184;

    @ObfuscatedName("bc.e(II)I")
    public static int method1224(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("bc.v(II)I")
    public static int method1121(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("bc.az()I")
    public int method1108() {
        int var1 = this.field1174 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field1177 == 0) {
            var2 -= this.field1170 * var2 / (((class57) this.field1188).field1153.length << 8);
        } else if (this.field1177 >= 0) {
            var2 -= this.field1178 * var2 / ((class57) this.field1188).field1153.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    public class59(class57 arg0, int arg1, int arg2) {
        this.field1188 = arg0;
        this.field1178 = arg0.field1155;
        this.field1179 = arg0.field1156;
        this.field1180 = arg0.field1157;
        this.field1171 = arg1;
        this.field1173 = arg2;
        this.field1172 = 8192;
        this.field1170 = 0;
        this.method1112();
    }

    public class59(class57 arg0, int arg1, int arg2, int arg3) {
        this.field1188 = arg0;
        this.field1178 = arg0.field1155;
        this.field1179 = arg0.field1156;
        this.field1180 = arg0.field1157;
        this.field1171 = arg1;
        this.field1173 = arg2;
        this.field1172 = arg3;
        this.field1170 = 0;
        this.method1112();
    }

    @ObfuscatedName("bc.k(Lbr;II)Lbc;")
    public static class59 method1110(class57 arg0, int arg1, int arg2) {
        return arg0.field1153 == null || arg0.field1153.length == 0 ? null : new class59(arg0, (int) ((long) arg0.field1154 * 256L * (long) arg1 / (long) (Statics.field1108 * 100)), arg2 << 6);
    }

    @ObfuscatedName("bc.g(Lbr;III)Lbc;")
    public static class59 method1229(class57 arg0, int arg1, int arg2, int arg3) {
        return arg0.field1153 == null || arg0.field1153.length == 0 ? null : new class59(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("bc.q()V")
    public void method1112() {
        this.field1174 = this.field1173;
        this.field1176 = method1224(this.field1173, this.field1172);
        this.field1175 = method1121(this.field1173, this.field1172);
    }

    @ObfuscatedName("bc.w(I)V")
    public synchronized void method1113(int arg0) {
        this.field1177 = arg0;
    }

    @ObfuscatedName("bc.p(I)V")
    public synchronized void method1158(int arg0) {
        this.method1155(arg0 << 6, this.method1118());
    }

    @ObfuscatedName("bc.n(I)V")
    public synchronized void method1115(int arg0) {
        this.method1155(arg0, this.method1118());
    }

    @ObfuscatedName("bc.r(II)V")
    public synchronized void method1155(int arg0, int arg1) {
        this.field1173 = arg0;
        this.field1172 = arg1;
        this.field1181 = 0;
        this.method1112();
    }

    @ObfuscatedName("bc.s()I")
    public synchronized int method1117() {
        return this.field1173 == Integer.MIN_VALUE ? 0 : this.field1173;
    }

    @ObfuscatedName("bc.f()I")
    public synchronized int method1118() {
        return this.field1172 < 0 ? -1 : this.field1172;
    }

    @ObfuscatedName("bc.c(I)V")
    public synchronized void method1109(int arg0) {
        int var2 = ((class57) this.field1188).field1153.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field1170 = arg0;
    }

    @ObfuscatedName("bc.t(Z)V")
    public synchronized void method1120(boolean arg0) {
        this.field1171 = (this.field1171 >>> 31) + (this.field1171 ^ this.field1171 >> 31);
        if (arg0) {
            this.field1171 = -this.field1171;
        }
    }

    @ObfuscatedName("bc.i()V")
    public void method1111() {
        if (this.field1181 == 0) {
            return;
        }
        if (this.field1173 == Integer.MIN_VALUE) {
            this.field1173 = 0;
        }
        this.field1181 = 0;
        this.method1112();
    }

    @ObfuscatedName("bc.u(II)V")
    public synchronized void method1172(int arg0, int arg1) {
        this.method1128(arg0, arg1, this.method1118());
    }

    @ObfuscatedName("bc.y(III)V")
    public synchronized void method1128(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method1155(arg1, arg2);
            return;
        }
        int var4 = method1224(arg1, arg2);
        int var5 = method1121(arg1, arg2);
        if (this.field1176 == var4 && this.field1175 == var5) {
            this.field1181 = 0;
            return;
        }
        int var6 = arg1 - this.field1174;
        if (this.field1174 - arg1 > var6) {
            var6 = this.field1174 - arg1;
        }
        if (var4 - this.field1176 > var6) {
            var6 = var4 - this.field1176;
        }
        if (this.field1176 - var4 > var6) {
            var6 = this.field1176 - var4;
        }
        if (var5 - this.field1175 > var6) {
            var6 = var5 - this.field1175;
        }
        if (this.field1175 - var5 > var6) {
            var6 = this.field1175 - var5;
        }
        if (arg0 > var6) {
            arg0 = var6;
        }
        this.field1181 = arg0;
        this.field1173 = arg1;
        this.field1172 = arg2;
        this.field1182 = (arg1 - this.field1174) / arg0;
        this.field1183 = (var4 - this.field1176) / arg0;
        this.field1184 = (var5 - this.field1175) / arg0;
    }

    @ObfuscatedName("bc.o(I)V")
    public synchronized void method1189(int arg0) {
        if (arg0 == 0) {
            this.method1115(0);
            this.method3324();
        } else if (this.field1176 == 0 && this.field1175 == 0) {
            this.field1181 = 0;
            this.field1173 = 0;
            this.field1174 = 0;
            this.method3324();
        } else {
            int var2 = -this.field1174;
            if (this.field1174 > var2) {
                var2 = this.field1174;
            }
            if (-this.field1176 > var2) {
                var2 = -this.field1176;
            }
            if (this.field1176 > var2) {
                var2 = this.field1176;
            }
            if (-this.field1175 > var2) {
                var2 = -this.field1175;
            }
            if (this.field1175 > var2) {
                var2 = this.field1175;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field1181 = arg0;
            this.field1173 = Integer.MIN_VALUE;
            this.field1182 = -this.field1174 / arg0;
            this.field1183 = -this.field1176 / arg0;
            this.field1184 = -this.field1175 / arg0;
        }
    }

    @ObfuscatedName("bc.m(I)V")
    public synchronized void method1125(int arg0) {
        if (this.field1171 < 0) {
            this.field1171 = -arg0;
        } else {
            this.field1171 = arg0;
        }
    }

    @ObfuscatedName("bc.h()I")
    public synchronized int method1126() {
        return this.field1171 < 0 ? -this.field1171 : this.field1171;
    }

    @ObfuscatedName("bc.ao()Z")
    public boolean method1127() {
        return this.field1170 < 0 || this.field1170 >= ((class57) this.field1188).field1153.length << 8;
    }

    @ObfuscatedName("bc.ae()Z")
    public boolean method1212() {
        return this.field1181 != 0;
    }

    @ObfuscatedName("bc.l()Lbz;")
    public class61 method980() {
        return null;
    }

    @ObfuscatedName("bc.a()Lbz;")
    public class61 method946() {
        return null;
    }

    @ObfuscatedName("bc.b()I")
    public int method950() {
        return this.field1173 == 0 && this.field1181 == 0 ? 0 : 1;
    }

    @ObfuscatedName("bc.z([III)V")
    public synchronized void method952(int[] arg0, int arg1, int arg2) {
        if (this.field1173 == 0 && this.field1181 == 0) {
            this.method957(arg2);
            return;
        }
        class57 var4 = (class57) this.field1188;
        int var5 = this.field1178 << 8;
        int var6 = this.field1179 << 8;
        int var7 = var4.field1153.length << 8;
        int var8 = var6 - var5;
        if (var8 <= 0) {
            this.field1177 = 0;
        }
        int var9 = arg1;
        int var10 = arg1 + arg2;
        if (this.field1170 < 0) {
            if (this.field1171 <= 0) {
                this.method1111();
                this.method3324();
                return;
            }
            this.field1170 = 0;
        }
        if (this.field1170 >= var7) {
            if (this.field1171 >= 0) {
                this.method1111();
                this.method3324();
                return;
            }
            this.field1170 = var7 - 1;
        }
        if (this.field1177 >= 0) {
            if (this.field1177 > 0) {
                if (this.field1180) {
                    label131: {
                        if (this.field1171 < 0) {
                            var9 = this.method1131(arg0, arg1, var5, var10, var4.field1153[this.field1178]);
                            if (this.field1170 >= var5) {
                                return;
                            }
                            this.field1170 = var5 + var5 - 1 - this.field1170;
                            this.field1171 = -this.field1171;
                            if (--this.field1177 == 0) {
                                break label131;
                            }
                        }
                        do {
                            var9 = this.method1130(arg0, var9, var6, var10, var4.field1153[this.field1179 - 1]);
                            if (this.field1170 < var6) {
                                return;
                            }
                            this.field1170 = var6 + var6 - 1 - this.field1170;
                            this.field1171 = -this.field1171;
                            if (--this.field1177 == 0) {
                                break;
                            }
                            var9 = this.method1131(arg0, var9, var5, var10, var4.field1153[this.field1178]);
                            if (this.field1170 >= var5) {
                                return;
                            }
                            this.field1170 = var5 + var5 - 1 - this.field1170;
                            this.field1171 = -this.field1171;
                        } while (--this.field1177 != 0);
                    }
                } else if (this.field1171 < 0) {
                    while (true) {
                        var9 = this.method1131(arg0, var9, var5, var10, var4.field1153[this.field1179 - 1]);
                        if (this.field1170 >= var5) {
                            return;
                        }
                        int var12 = (var6 - 1 - this.field1170) / var8;
                        if (var12 >= this.field1177) {
                            this.field1170 += this.field1177 * var8;
                            this.field1177 = 0;
                            break;
                        }
                        this.field1170 += var8 * var12;
                        this.field1177 -= var12;
                    }
                } else {
                    while (true) {
                        var9 = this.method1130(arg0, var9, var6, var10, var4.field1153[this.field1178]);
                        if (this.field1170 < var6) {
                            return;
                        }
                        int var13 = (this.field1170 - var5) / var8;
                        if (var13 >= this.field1177) {
                            this.field1170 -= this.field1177 * var8;
                            this.field1177 = 0;
                            break;
                        }
                        this.field1170 -= var8 * var13;
                        this.field1177 -= var13;
                    }
                }
            }
            if (this.field1171 < 0) {
                this.method1131(arg0, var9, 0, var10, 0);
                if (this.field1170 < 0) {
                    this.field1170 = -1;
                    this.method1111();
                    this.method3324();
                }
            } else {
                this.method1130(arg0, var9, var7, var10, 0);
                if (this.field1170 >= var7) {
                    this.field1170 = var7;
                    this.method1111();
                    this.method3324();
                }
            }
        } else if (this.field1180) {
            if (this.field1171 < 0) {
                var9 = this.method1131(arg0, arg1, var5, var10, var4.field1153[this.field1178]);
                if (this.field1170 >= var5) {
                    return;
                }
                this.field1170 = var5 + var5 - 1 - this.field1170;
                this.field1171 = -this.field1171;
            }
            while (true) {
                int var11 = this.method1130(arg0, var9, var6, var10, var4.field1153[this.field1179 - 1]);
                if (this.field1170 < var6) {
                    return;
                }
                this.field1170 = var6 + var6 - 1 - this.field1170;
                this.field1171 = -this.field1171;
                var9 = this.method1131(arg0, var11, var5, var10, var4.field1153[this.field1178]);
                if (this.field1170 >= var5) {
                    return;
                }
                this.field1170 = var5 + var5 - 1 - this.field1170;
                this.field1171 = -this.field1171;
            }
        } else if (this.field1171 < 0) {
            while (true) {
                var9 = this.method1131(arg0, var9, var5, var10, var4.field1153[this.field1179 - 1]);
                if (this.field1170 >= var5) {
                    return;
                }
                this.field1170 = var6 - 1 - (var6 - 1 - this.field1170) % var8;
            }
        } else {
            while (true) {
                var9 = this.method1130(arg0, var9, var6, var10, var4.field1153[this.field1178]);
                if (this.field1170 < var6) {
                    return;
                }
                this.field1170 = (this.field1170 - var5) % var8 + var5;
            }
        }
    }

    @ObfuscatedName("bc.j(I)V")
    public synchronized void method957(int arg0) {
        if (this.field1181 > 0) {
            if (arg0 >= this.field1181) {
                if (this.field1173 == Integer.MIN_VALUE) {
                    this.field1173 = 0;
                    this.field1175 = 0;
                    this.field1176 = 0;
                    this.field1174 = 0;
                    this.method3324();
                    arg0 = this.field1181;
                }
                this.field1181 = 0;
                this.method1112();
            } else {
                this.field1174 += this.field1182 * arg0;
                this.field1176 += this.field1183 * arg0;
                this.field1175 += this.field1184 * arg0;
                this.field1181 -= arg0;
            }
        }
        class57 var2 = (class57) this.field1188;
        int var3 = this.field1178 << 8;
        int var4 = this.field1179 << 8;
        int var5 = var2.field1153.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field1177 = 0;
        }
        if (this.field1170 < 0) {
            if (this.field1171 <= 0) {
                this.method1111();
                this.method3324();
                return;
            }
            this.field1170 = 0;
        }
        if (this.field1170 >= var5) {
            if (this.field1171 >= 0) {
                this.method1111();
                this.method3324();
                return;
            }
            this.field1170 = var5 - 1;
        }
        this.field1170 += this.field1171 * arg0;
        if (this.field1177 >= 0) {
            if (this.field1177 > 0) {
                if (this.field1180) {
                    label121: {
                        if (this.field1171 < 0) {
                            if (this.field1170 >= var3) {
                                return;
                            }
                            this.field1170 = var3 + var3 - 1 - this.field1170;
                            this.field1171 = -this.field1171;
                            if (--this.field1177 == 0) {
                                break label121;
                            }
                        }
                        do {
                            if (this.field1170 < var4) {
                                return;
                            }
                            this.field1170 = var4 + var4 - 1 - this.field1170;
                            this.field1171 = -this.field1171;
                            if (--this.field1177 == 0) {
                                break;
                            }
                            if (this.field1170 >= var3) {
                                return;
                            }
                            this.field1170 = var3 + var3 - 1 - this.field1170;
                            this.field1171 = -this.field1171;
                        } while (--this.field1177 != 0);
                    }
                } else {
                    label153: {
                        if (this.field1171 < 0) {
                            if (this.field1170 >= var3) {
                                return;
                            }
                            int var7 = (var4 - 1 - this.field1170) / var6;
                            if (var7 >= this.field1177) {
                                this.field1170 += this.field1177 * var6;
                                this.field1177 = 0;
                                break label153;
                            }
                            this.field1170 += var6 * var7;
                            this.field1177 -= var7;
                        } else if (this.field1170 >= var4) {
                            int var8 = (this.field1170 - var3) / var6;
                            if (var8 >= this.field1177) {
                                this.field1170 -= this.field1177 * var6;
                                this.field1177 = 0;
                                break label153;
                            }
                            this.field1170 -= var6 * var8;
                            this.field1177 -= var8;
                        } else {
                            return;
                        }
                        return;
                    }
                }
            }
            if (this.field1171 < 0) {
                if (this.field1170 < 0) {
                    this.field1170 = -1;
                    this.method1111();
                    this.method3324();
                }
            } else if (this.field1170 >= var5) {
                this.field1170 = var5;
                this.method1111();
                this.method3324();
            }
        } else if (this.field1180) {
            if (this.field1171 < 0) {
                if (this.field1170 >= var3) {
                    return;
                }
                this.field1170 = var3 + var3 - 1 - this.field1170;
                this.field1171 = -this.field1171;
            }
            while (this.field1170 >= var4) {
                this.field1170 = var4 + var4 - 1 - this.field1170;
                this.field1171 = -this.field1171;
                if (this.field1170 >= var3) {
                    return;
                }
                this.field1170 = var3 + var3 - 1 - this.field1170;
                this.field1171 = -this.field1171;
            }
        } else if (this.field1171 < 0) {
            if (this.field1170 >= var3) {
                return;
            }
            this.field1170 = var4 - 1 - (var4 - 1 - this.field1170) % var6;
        } else if (this.field1170 >= var4) {
            this.field1170 = (this.field1170 - var3) % var6 + var3;
        } else {
            return;
        }
    }

    @ObfuscatedName("bc.at([IIIII)I")
    public int method1130(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1181 > 0) {
                int var6 = this.field1181 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1181 += arg1;
                if (this.field1171 == 256 && (this.field1170 & 0xFF) == 0) {
                    if (Statics.field1092) {
                        arg1 = method1142(0, ((class57) this.field1188).field1153, arg0, this.field1170, arg1, this.field1176, this.field1175, this.field1183, this.field1184, 0, var6, arg2, this);
                    } else {
                        arg1 = method1141(((class57) this.field1188).field1153, arg0, this.field1170, arg1, this.field1174, this.field1182, 0, var6, arg2, this);
                    }
                } else if (Statics.field1092) {
                    arg1 = method1146(0, 0, ((class57) this.field1188).field1153, arg0, this.field1170, arg1, this.field1176, this.field1175, this.field1183, this.field1184, 0, var6, arg2, this, this.field1171, arg4);
                } else {
                    arg1 = method1161(0, 0, ((class57) this.field1188).field1153, arg0, this.field1170, arg1, this.field1174, this.field1182, 0, var6, arg2, this, this.field1171, arg4);
                }
                this.field1181 -= arg1;
                if (this.field1181 != 0) {
                    return arg1;
                }
                if (!this.method1132()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1171 == 256 && (this.field1170 & 0xFF) == 0) {
                if (Statics.field1092) {
                    return method1134(0, ((class57) this.field1188).field1153, arg0, this.field1170, arg1, this.field1176, this.field1175, 0, arg3, arg2, this);
                }
                return method1202(((class57) this.field1188).field1153, arg0, this.field1170, arg1, this.field1174, 0, arg3, arg2, this);
            }
            if (Statics.field1092) {
                return method1138(0, 0, ((class57) this.field1188).field1153, arg0, this.field1170, arg1, this.field1176, this.field1175, 0, arg3, arg2, this, this.field1171, arg4);
            }
            return method1137(0, 0, ((class57) this.field1188).field1153, arg0, this.field1170, arg1, this.field1174, 0, arg3, arg2, this, this.field1171, arg4);
        }
    }

    @ObfuscatedName("bc.an([IIIII)I")
    public int method1131(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1181 > 0) {
                int var6 = this.field1181 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1181 += arg1;
                if (this.field1171 == -256 && (this.field1170 & 0xFF) == 0) {
                    if (Statics.field1092) {
                        arg1 = method1162(0, ((class57) this.field1188).field1153, arg0, this.field1170, arg1, this.field1176, this.field1175, this.field1183, this.field1184, 0, var6, arg2, this);
                    } else {
                        arg1 = method1143(((class57) this.field1188).field1153, arg0, this.field1170, arg1, this.field1174, this.field1182, 0, var6, arg2, this);
                    }
                } else if (Statics.field1092) {
                    arg1 = method1148(0, 0, ((class57) this.field1188).field1153, arg0, this.field1170, arg1, this.field1176, this.field1175, this.field1183, this.field1184, 0, var6, arg2, this, this.field1171, arg4);
                } else {
                    arg1 = method1124(0, 0, ((class57) this.field1188).field1153, arg0, this.field1170, arg1, this.field1174, this.field1182, 0, var6, arg2, this, this.field1171, arg4);
                }
                this.field1181 -= arg1;
                if (this.field1181 != 0) {
                    return arg1;
                }
                if (!this.method1132()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1171 == -256 && (this.field1170 & 0xFF) == 0) {
                if (Statics.field1092) {
                    return method1147(0, ((class57) this.field1188).field1153, arg0, this.field1170, arg1, this.field1176, this.field1175, 0, arg3, arg2, this);
                }
                return method1135(((class57) this.field1188).field1153, arg0, this.field1170, arg1, this.field1174, 0, arg3, arg2, this);
            }
            if (Statics.field1092) {
                return method1140(0, 0, ((class57) this.field1188).field1153, arg0, this.field1170, arg1, this.field1176, this.field1175, 0, arg3, arg2, this, this.field1171, arg4);
            }
            return method1139(0, 0, ((class57) this.field1188).field1153, arg0, this.field1170, arg1, this.field1174, 0, arg3, arg2, this, this.field1171, arg4);
        }
    }

    @ObfuscatedName("bc.ay()Z")
    public boolean method1132() {
        int var1 = this.field1173;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method1224(var1, this.field1172);
            var2 = method1121(var1, this.field1172);
        }
        if (this.field1174 != var1 || this.field1176 != var3 || this.field1175 != var2) {
            if (this.field1174 < var1) {
                this.field1182 = 1;
                this.field1181 = var1 - this.field1174;
            } else if (this.field1174 > var1) {
                this.field1182 = -1;
                this.field1181 = this.field1174 - var1;
            } else {
                this.field1182 = 0;
            }
            if (this.field1176 < var3) {
                this.field1183 = 1;
                if (this.field1181 == 0 || this.field1181 > var3 - this.field1176) {
                    this.field1181 = var3 - this.field1176;
                }
            } else if (this.field1176 > var3) {
                this.field1183 = -1;
                if (this.field1181 == 0 || this.field1181 > this.field1176 - var3) {
                    this.field1181 = this.field1176 - var3;
                }
            } else {
                this.field1183 = 0;
            }
            if (this.field1175 < var2) {
                this.field1184 = 1;
                if (this.field1181 == 0 || this.field1181 > var2 - this.field1175) {
                    this.field1181 = var2 - this.field1175;
                }
            } else if (this.field1175 > var2) {
                this.field1184 = -1;
                if (this.field1181 == 0 || this.field1181 > this.field1175 - var2) {
                    this.field1181 = this.field1175 - var2;
                }
            } else {
                this.field1184 = 0;
            }
            return false;
        } else if (this.field1173 == Integer.MIN_VALUE) {
            this.field1173 = 0;
            this.field1175 = 0;
            this.field1176 = 0;
            this.field1174 = 0;
            this.method3324();
            return true;
        } else {
            this.method1112();
            return false;
        }
    }

    @ObfuscatedName("bc.aw([B[IIIIIIILbc;)I")
    public static int method1202(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class59 arg8) {
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
        arg8.field1170 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("bc.ak(I[B[IIIIIIIILbc;)I")
    public static int method1134(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class59 arg10) {
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
        arg10.field1170 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("bc.aq([B[IIIIIIILbc;)I")
    public static int method1135(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class59 arg8) {
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
        arg8.field1170 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("bc.aa(I[B[IIIIIIIILbc;)I")
    public static int method1147(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class59 arg10) {
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
        arg10.field1170 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("bc.aj(II[B[IIIIIIILbc;II)I")
    public static int method1137(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class59 arg10, int arg11, int arg12) {
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
        arg10.field1170 = arg4;
        return arg5;
    }

    @ObfuscatedName("bc.au(II[B[IIIIIIIILbc;II)I")
    public static int method1138(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class59 arg11, int arg12, int arg13) {
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
        arg11.field1170 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("bc.al(II[B[IIIIIIILbc;II)I")
    public static int method1139(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class59 arg10, int arg11, int arg12) {
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
        arg10.field1170 = arg4;
        return arg5;
    }

    @ObfuscatedName("bc.as(II[B[IIIIIIIILbc;II)I")
    public static int method1140(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class59 arg11, int arg12, int arg13) {
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
        arg11.field1170 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("bc.av([B[IIIIIIIILbc;)I")
    public static int method1141(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class59 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field1176 += (var14 - arg3) * arg9.field1183;
        arg9.field1175 += (var14 - arg3) * arg9.field1184;
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
        arg9.field1174 = var12 >> 2;
        arg9.field1170 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("bc.bw(I[B[IIIIIIIIIILbc;)I")
    public static int method1142(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class59 arg12) {
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
        arg12.field1174 += (var19 - arg4) * arg12.field1182;
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
        arg12.field1176 = var15 >> 2;
        arg12.field1175 = var16 >> 2;
        arg12.field1170 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("bc.bq([B[IIIIIIIILbc;)I")
    public static int method1143(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class59 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field1176 += (var14 - arg3) * arg9.field1183;
        arg9.field1175 += (var14 - arg3) * arg9.field1184;
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
        arg9.field1174 = var12 >> 2;
        arg9.field1170 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("bc.bk(I[B[IIIIIIIIIILbc;)I")
    public static int method1162(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class59 arg12) {
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
        arg12.field1174 += (var19 - arg4) * arg12.field1182;
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
        arg12.field1176 = var15 >> 2;
        arg12.field1175 = var16 >> 2;
        arg12.field1170 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("bc.bv(II[B[IIIIIIIILbc;II)I")
    public static int method1161(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class59 arg11, int arg12, int arg13) {
        arg11.field1176 -= arg11.field1183 * arg5;
        arg11.field1175 -= arg11.field1184 * arg5;
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
        arg11.field1176 += arg11.field1183 * arg5;
        arg11.field1175 += arg11.field1184 * arg5;
        arg11.field1174 = arg6;
        arg11.field1170 = arg4;
        return arg5;
    }

    @ObfuscatedName("bc.br(II[B[IIIIIIIIIILbc;II)I")
    public static int method1146(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class59 arg13, int arg14, int arg15) {
        arg13.field1174 -= arg13.field1182 * arg5;
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
        arg13.field1174 += arg13.field1182 * var27;
        arg13.field1176 = arg6;
        arg13.field1175 = arg7;
        arg13.field1170 = arg4;
        return var27;
    }

    @ObfuscatedName("bc.bn(II[B[IIIIIIIILbc;II)I")
    public static int method1124(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class59 arg11, int arg12, int arg13) {
        arg11.field1176 -= arg11.field1183 * arg5;
        arg11.field1175 -= arg11.field1184 * arg5;
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
        arg11.field1176 += arg11.field1183 * arg5;
        arg11.field1175 += arg11.field1184 * arg5;
        arg11.field1174 = arg6;
        arg11.field1170 = arg4;
        return arg5;
    }

    @ObfuscatedName("bc.bc(II[B[IIIIIIIIIILbc;II)I")
    public static int method1148(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class59 arg13, int arg14, int arg15) {
        arg13.field1174 -= arg13.field1182 * arg5;
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
        arg13.field1174 += arg13.field1182 * var26;
        arg13.field1176 = arg6;
        arg13.field1175 = arg7;
        arg13.field1170 = arg4;
        return var26;
    }
}
