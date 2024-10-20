package deob;

@ObfuscatedName("bi")
public class class58 extends class60 {

    @ObfuscatedName("bi.b")
    public int field1151;

    @ObfuscatedName("bi.u")
    public int field1143;

    @ObfuscatedName("bi.x")
    public int field1144;

    @ObfuscatedName("bi.j")
    public int field1142;

    @ObfuscatedName("bi.o")
    public int field1146;

    @ObfuscatedName("bi.n")
    public int field1147;

    @ObfuscatedName("bi.y")
    public int field1148;

    @ObfuscatedName("bi.f")
    public int field1149;

    @ObfuscatedName("bi.p")
    public int field1150;

    @ObfuscatedName("bi.l")
    public int field1155;

    @ObfuscatedName("bi.k")
    public boolean field1152;

    @ObfuscatedName("bi.q")
    public int field1153;

    @ObfuscatedName("bi.e")
    public int field1154;

    @ObfuscatedName("bi.t")
    public int field1156;

    @ObfuscatedName("bi.g")
    public int field1145;

    @ObfuscatedName("bi.b(II)I")
    public static int method1129(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("bi.u(II)I")
    public static int method1088(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("bi.av()I")
    public int method1089() {
        int var1 = this.field1146 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field1149 == 0) {
            var2 -= this.field1151 * var2 / (((class56) this.field1159).field1126.length << 8);
        } else if (this.field1149 >= 0) {
            var2 -= this.field1150 * var2 / ((class56) this.field1159).field1126.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    public class58(class56 arg0, int arg1, int arg2) {
        this.field1159 = arg0;
        this.field1150 = arg0.field1125;
        this.field1155 = arg0.field1128;
        this.field1152 = arg0.field1129;
        this.field1143 = arg1;
        this.field1144 = arg2;
        this.field1142 = 8192;
        this.field1151 = 0;
        this.method1092();
    }

    public class58(class56 arg0, int arg1, int arg2, int arg3) {
        this.field1159 = arg0;
        this.field1150 = arg0.field1125;
        this.field1155 = arg0.field1128;
        this.field1152 = arg0.field1129;
        this.field1143 = arg1;
        this.field1144 = arg2;
        this.field1142 = arg3;
        this.field1151 = 0;
        this.method1092();
    }

    @ObfuscatedName("bi.x(Lbq;II)Lbi;")
    public static class58 method1134(class56 arg0, int arg1, int arg2) {
        return arg0.field1126 == null || arg0.field1126.length == 0 ? null : new class58(arg0, (int) ((long) arg0.field1127 * 256L * (long) arg1 / (long) (Statics.field1087 * 100)), arg2 << 6);
    }

    @ObfuscatedName("bi.j(Lbq;III)Lbi;")
    public static class58 method1091(class56 arg0, int arg1, int arg2, int arg3) {
        return arg0.field1126 == null || arg0.field1126.length == 0 ? null : new class58(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("bi.o()V")
    public void method1092() {
        this.field1146 = this.field1144;
        this.field1147 = method1129(this.field1144, this.field1142);
        this.field1148 = method1088(this.field1144, this.field1142);
    }

    @ObfuscatedName("bi.l(I)V")
    public synchronized void method1197(int arg0) {
        this.field1149 = arg0;
    }

    @ObfuscatedName("bi.q(I)V")
    public synchronized void method1094(int arg0) {
        this.method1096(arg0 << 6, this.method1098());
    }

    @ObfuscatedName("bi.e(I)V")
    public synchronized void method1095(int arg0) {
        this.method1096(arg0, this.method1098());
    }

    @ObfuscatedName("bi.t(II)V")
    public synchronized void method1096(int arg0, int arg1) {
        this.field1144 = arg0;
        this.field1142 = arg1;
        this.field1153 = 0;
        this.method1092();
    }

    @ObfuscatedName("bi.g()I")
    public synchronized int method1097() {
        return this.field1144 == Integer.MIN_VALUE ? 0 : this.field1144;
    }

    @ObfuscatedName("bi.c()I")
    public synchronized int method1098() {
        return this.field1142 < 0 ? -1 : this.field1142;
    }

    @ObfuscatedName("bi.m(I)V")
    public synchronized void method1175(int arg0) {
        int var2 = ((class56) this.field1159).field1126.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field1151 = arg0;
    }

    @ObfuscatedName("bi.i(Z)V")
    public synchronized void method1127(boolean arg0) {
        this.field1143 = (this.field1143 >>> 31) + (this.field1143 ^ this.field1143 >> 31);
        if (arg0) {
            this.field1143 = -this.field1143;
        }
    }

    @ObfuscatedName("bi.h()V")
    public void method1101() {
        if (this.field1153 == 0) {
            return;
        }
        if (this.field1144 == Integer.MIN_VALUE) {
            this.field1144 = 0;
        }
        this.field1153 = 0;
        this.method1092();
    }

    @ObfuscatedName("bi.a(II)V")
    public synchronized void method1090(int arg0, int arg1) {
        this.method1102(arg0, arg1, this.method1098());
    }

    @ObfuscatedName("bi.w(III)V")
    public synchronized void method1102(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method1096(arg1, arg2);
            return;
        }
        int var4 = method1129(arg1, arg2);
        int var5 = method1088(arg1, arg2);
        if (this.field1147 == var4 && this.field1148 == var5) {
            this.field1153 = 0;
            return;
        }
        int var6 = arg1 - this.field1146;
        if (this.field1146 - arg1 > var6) {
            var6 = this.field1146 - arg1;
        }
        if (var4 - this.field1147 > var6) {
            var6 = var4 - this.field1147;
        }
        if (this.field1147 - var4 > var6) {
            var6 = this.field1147 - var4;
        }
        if (var5 - this.field1148 > var6) {
            var6 = var5 - this.field1148;
        }
        if (this.field1148 - var5 > var6) {
            var6 = this.field1148 - var5;
        }
        if (arg0 > var6) {
            arg0 = var6;
        }
        this.field1153 = arg0;
        this.field1144 = arg1;
        this.field1142 = arg2;
        this.field1154 = (arg1 - this.field1146) / arg0;
        this.field1156 = (var4 - this.field1147) / arg0;
        this.field1145 = (var5 - this.field1148) / arg0;
    }

    @ObfuscatedName("bi.z(I)V")
    public synchronized void method1111(int arg0) {
        if (arg0 == 0) {
            this.method1095(0);
            this.method3260();
        } else if (this.field1147 == 0 && this.field1148 == 0) {
            this.field1153 = 0;
            this.field1144 = 0;
            this.field1146 = 0;
            this.method3260();
        } else {
            int var2 = -this.field1146;
            if (this.field1146 > var2) {
                var2 = this.field1146;
            }
            if (-this.field1147 > var2) {
                var2 = -this.field1147;
            }
            if (this.field1147 > var2) {
                var2 = this.field1147;
            }
            if (-this.field1148 > var2) {
                var2 = -this.field1148;
            }
            if (this.field1148 > var2) {
                var2 = this.field1148;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field1153 = arg0;
            this.field1144 = Integer.MIN_VALUE;
            this.field1154 = -this.field1146 / arg0;
            this.field1156 = -this.field1147 / arg0;
            this.field1145 = -this.field1148 / arg0;
        }
    }

    @ObfuscatedName("bi.v(I)V")
    public synchronized void method1103(int arg0) {
        if (this.field1143 < 0) {
            this.field1143 = -arg0;
        } else {
            this.field1143 = arg0;
        }
    }

    @ObfuscatedName("bi.ac()I")
    public synchronized int method1104() {
        return this.field1143 < 0 ? -this.field1143 : this.field1143;
    }

    @ObfuscatedName("bi.aa()Z")
    public boolean method1105() {
        return this.field1151 < 0 || this.field1151 >= ((class56) this.field1159).field1126.length << 8;
    }

    @ObfuscatedName("bi.aw()Z")
    public boolean method1106() {
        return this.field1153 != 0;
    }

    @ObfuscatedName("bi.n()Lbl;")
    public class60 method952() {
        return null;
    }

    @ObfuscatedName("bi.y()Lbl;")
    public class60 method942() {
        return null;
    }

    @ObfuscatedName("bi.f()I")
    public int method943() {
        return this.field1144 == 0 && this.field1153 == 0 ? 0 : 1;
    }

    @ObfuscatedName("bi.p([III)V")
    public synchronized void method944(int[] arg0, int arg1, int arg2) {
        if (this.field1144 == 0 && this.field1153 == 0) {
            this.method969(arg2);
            return;
        }
        class56 var4 = (class56) this.field1159;
        int var5 = this.field1150 << 8;
        int var6 = this.field1155 << 8;
        int var7 = var4.field1126.length << 8;
        int var8 = var6 - var5;
        if (var8 <= 0) {
            this.field1149 = 0;
        }
        int var9 = arg1;
        int var10 = arg1 + arg2;
        if (this.field1151 < 0) {
            if (this.field1143 <= 0) {
                this.method1101();
                this.method3260();
                return;
            }
            this.field1151 = 0;
        }
        if (this.field1151 >= var7) {
            if (this.field1143 >= 0) {
                this.method1101();
                this.method3260();
                return;
            }
            this.field1151 = var7 - 1;
        }
        if (this.field1149 >= 0) {
            if (this.field1149 > 0) {
                if (this.field1152) {
                    label131: {
                        if (this.field1143 < 0) {
                            var9 = this.method1110(arg0, arg1, var5, var10, var4.field1126[this.field1150]);
                            if (this.field1151 >= var5) {
                                return;
                            }
                            this.field1151 = var5 + var5 - 1 - this.field1151;
                            this.field1143 = -this.field1143;
                            if (--this.field1149 == 0) {
                                break label131;
                            }
                        }
                        do {
                            var9 = this.method1109(arg0, var9, var6, var10, var4.field1126[this.field1155 - 1]);
                            if (this.field1151 < var6) {
                                return;
                            }
                            this.field1151 = var6 + var6 - 1 - this.field1151;
                            this.field1143 = -this.field1143;
                            if (--this.field1149 == 0) {
                                break;
                            }
                            var9 = this.method1110(arg0, var9, var5, var10, var4.field1126[this.field1150]);
                            if (this.field1151 >= var5) {
                                return;
                            }
                            this.field1151 = var5 + var5 - 1 - this.field1151;
                            this.field1143 = -this.field1143;
                        } while (--this.field1149 != 0);
                    }
                } else if (this.field1143 < 0) {
                    while (true) {
                        var9 = this.method1110(arg0, var9, var5, var10, var4.field1126[this.field1155 - 1]);
                        if (this.field1151 >= var5) {
                            return;
                        }
                        int var12 = (var6 - 1 - this.field1151) / var8;
                        if (var12 >= this.field1149) {
                            this.field1151 += this.field1149 * var8;
                            this.field1149 = 0;
                            break;
                        }
                        this.field1151 += var8 * var12;
                        this.field1149 -= var12;
                    }
                } else {
                    while (true) {
                        var9 = this.method1109(arg0, var9, var6, var10, var4.field1126[this.field1150]);
                        if (this.field1151 < var6) {
                            return;
                        }
                        int var13 = (this.field1151 - var5) / var8;
                        if (var13 >= this.field1149) {
                            this.field1151 -= this.field1149 * var8;
                            this.field1149 = 0;
                            break;
                        }
                        this.field1151 -= var8 * var13;
                        this.field1149 -= var13;
                    }
                }
            }
            if (this.field1143 < 0) {
                this.method1110(arg0, var9, 0, var10, 0);
                if (this.field1151 < 0) {
                    this.field1151 = -1;
                    this.method1101();
                    this.method3260();
                }
            } else {
                this.method1109(arg0, var9, var7, var10, 0);
                if (this.field1151 >= var7) {
                    this.field1151 = var7;
                    this.method1101();
                    this.method3260();
                }
            }
        } else if (this.field1152) {
            if (this.field1143 < 0) {
                var9 = this.method1110(arg0, arg1, var5, var10, var4.field1126[this.field1150]);
                if (this.field1151 >= var5) {
                    return;
                }
                this.field1151 = var5 + var5 - 1 - this.field1151;
                this.field1143 = -this.field1143;
            }
            while (true) {
                int var11 = this.method1109(arg0, var9, var6, var10, var4.field1126[this.field1155 - 1]);
                if (this.field1151 < var6) {
                    return;
                }
                this.field1151 = var6 + var6 - 1 - this.field1151;
                this.field1143 = -this.field1143;
                var9 = this.method1110(arg0, var11, var5, var10, var4.field1126[this.field1150]);
                if (this.field1151 >= var5) {
                    return;
                }
                this.field1151 = var5 + var5 - 1 - this.field1151;
                this.field1143 = -this.field1143;
            }
        } else if (this.field1143 < 0) {
            while (true) {
                var9 = this.method1110(arg0, var9, var5, var10, var4.field1126[this.field1155 - 1]);
                if (this.field1151 >= var5) {
                    return;
                }
                this.field1151 = var6 - 1 - (var6 - 1 - this.field1151) % var8;
            }
        } else {
            while (true) {
                var9 = this.method1109(arg0, var9, var6, var10, var4.field1126[this.field1150]);
                if (this.field1151 < var6) {
                    return;
                }
                this.field1151 = (this.field1151 - var5) % var8 + var5;
            }
        }
    }

    @ObfuscatedName("bi.k(I)V")
    public synchronized void method969(int arg0) {
        if (this.field1153 > 0) {
            if (arg0 >= this.field1153) {
                if (this.field1144 == Integer.MIN_VALUE) {
                    this.field1144 = 0;
                    this.field1148 = 0;
                    this.field1147 = 0;
                    this.field1146 = 0;
                    this.method3260();
                    arg0 = this.field1153;
                }
                this.field1153 = 0;
                this.method1092();
            } else {
                this.field1146 += this.field1154 * arg0;
                this.field1147 += this.field1156 * arg0;
                this.field1148 += this.field1145 * arg0;
                this.field1153 -= arg0;
            }
        }
        class56 var2 = (class56) this.field1159;
        int var3 = this.field1150 << 8;
        int var4 = this.field1155 << 8;
        int var5 = var2.field1126.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field1149 = 0;
        }
        if (this.field1151 < 0) {
            if (this.field1143 <= 0) {
                this.method1101();
                this.method3260();
                return;
            }
            this.field1151 = 0;
        }
        if (this.field1151 >= var5) {
            if (this.field1143 >= 0) {
                this.method1101();
                this.method3260();
                return;
            }
            this.field1151 = var5 - 1;
        }
        this.field1151 += this.field1143 * arg0;
        if (this.field1149 >= 0) {
            if (this.field1149 > 0) {
                if (this.field1152) {
                    label121: {
                        if (this.field1143 < 0) {
                            if (this.field1151 >= var3) {
                                return;
                            }
                            this.field1151 = var3 + var3 - 1 - this.field1151;
                            this.field1143 = -this.field1143;
                            if (--this.field1149 == 0) {
                                break label121;
                            }
                        }
                        do {
                            if (this.field1151 < var4) {
                                return;
                            }
                            this.field1151 = var4 + var4 - 1 - this.field1151;
                            this.field1143 = -this.field1143;
                            if (--this.field1149 == 0) {
                                break;
                            }
                            if (this.field1151 >= var3) {
                                return;
                            }
                            this.field1151 = var3 + var3 - 1 - this.field1151;
                            this.field1143 = -this.field1143;
                        } while (--this.field1149 != 0);
                    }
                } else {
                    label153: {
                        if (this.field1143 < 0) {
                            if (this.field1151 >= var3) {
                                return;
                            }
                            int var7 = (var4 - 1 - this.field1151) / var6;
                            if (var7 >= this.field1149) {
                                this.field1151 += this.field1149 * var6;
                                this.field1149 = 0;
                                break label153;
                            }
                            this.field1151 += var6 * var7;
                            this.field1149 -= var7;
                        } else if (this.field1151 >= var4) {
                            int var8 = (this.field1151 - var3) / var6;
                            if (var8 >= this.field1149) {
                                this.field1151 -= this.field1149 * var6;
                                this.field1149 = 0;
                                break label153;
                            }
                            this.field1151 -= var6 * var8;
                            this.field1149 -= var8;
                        } else {
                            return;
                        }
                        return;
                    }
                }
            }
            if (this.field1143 < 0) {
                if (this.field1151 < 0) {
                    this.field1151 = -1;
                    this.method1101();
                    this.method3260();
                }
            } else if (this.field1151 >= var5) {
                this.field1151 = var5;
                this.method1101();
                this.method3260();
            }
        } else if (this.field1152) {
            if (this.field1143 < 0) {
                if (this.field1151 >= var3) {
                    return;
                }
                this.field1151 = var3 + var3 - 1 - this.field1151;
                this.field1143 = -this.field1143;
            }
            while (this.field1151 >= var4) {
                this.field1151 = var4 + var4 - 1 - this.field1151;
                this.field1143 = -this.field1143;
                if (this.field1151 >= var3) {
                    return;
                }
                this.field1151 = var3 + var3 - 1 - this.field1151;
                this.field1143 = -this.field1143;
            }
        } else if (this.field1143 < 0) {
            if (this.field1151 >= var3) {
                return;
            }
            this.field1151 = var4 - 1 - (var4 - 1 - this.field1151) % var6;
        } else if (this.field1151 >= var4) {
            this.field1151 = (this.field1151 - var3) % var6 + var3;
        } else {
            return;
        }
    }

    @ObfuscatedName("bi.ao([IIIII)I")
    public int method1109(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1153 > 0) {
                int var6 = this.field1153 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1153 += arg1;
                if (this.field1143 == 256 && (this.field1151 & 0xFF) == 0) {
                    if (Statics.field1075) {
                        arg1 = method1192(0, ((class56) this.field1159).field1126, arg0, this.field1151, arg1, this.field1147, this.field1148, this.field1156, this.field1145, 0, var6, arg2, this);
                    } else {
                        arg1 = method1182(((class56) this.field1159).field1126, arg0, this.field1151, arg1, this.field1146, this.field1154, 0, var6, arg2, this);
                    }
                } else if (Statics.field1075) {
                    arg1 = method1146(0, 0, ((class56) this.field1159).field1126, arg0, this.field1151, arg1, this.field1147, this.field1148, this.field1156, this.field1145, 0, var6, arg2, this, this.field1143, arg4);
                } else {
                    arg1 = method1124(0, 0, ((class56) this.field1159).field1126, arg0, this.field1151, arg1, this.field1146, this.field1154, 0, var6, arg2, this, this.field1143, arg4);
                }
                this.field1153 -= arg1;
                if (this.field1153 != 0) {
                    return arg1;
                }
                if (!this.method1218()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1143 == 256 && (this.field1151 & 0xFF) == 0) {
                if (Statics.field1075) {
                    return method1113(0, ((class56) this.field1159).field1126, arg0, this.field1151, arg1, this.field1147, this.field1148, 0, arg3, arg2, this);
                }
                return method1112(((class56) this.field1159).field1126, arg0, this.field1151, arg1, this.field1146, 0, arg3, arg2, this);
            }
            if (Statics.field1075) {
                return method1117(0, 0, ((class56) this.field1159).field1126, arg0, this.field1151, arg1, this.field1147, this.field1148, 0, arg3, arg2, this, this.field1143, arg4);
            }
            return method1151(0, 0, ((class56) this.field1159).field1126, arg0, this.field1151, arg1, this.field1146, 0, arg3, arg2, this, this.field1143, arg4);
        }
    }

    @ObfuscatedName("bi.aq([IIIII)I")
    public int method1110(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1153 > 0) {
                int var6 = this.field1153 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1153 += arg1;
                if (this.field1143 == -256 && (this.field1151 & 0xFF) == 0) {
                    if (Statics.field1075) {
                        arg1 = method1123(0, ((class56) this.field1159).field1126, arg0, this.field1151, arg1, this.field1147, this.field1148, this.field1156, this.field1145, 0, var6, arg2, this);
                    } else {
                        arg1 = method1122(((class56) this.field1159).field1126, arg0, this.field1151, arg1, this.field1146, this.field1154, 0, var6, arg2, this);
                    }
                } else if (Statics.field1075) {
                    arg1 = method1184(0, 0, ((class56) this.field1159).field1126, arg0, this.field1151, arg1, this.field1147, this.field1148, this.field1156, this.field1145, 0, var6, arg2, this, this.field1143, arg4);
                } else {
                    arg1 = method1222(0, 0, ((class56) this.field1159).field1126, arg0, this.field1151, arg1, this.field1146, this.field1154, 0, var6, arg2, this, this.field1143, arg4);
                }
                this.field1153 -= arg1;
                if (this.field1153 != 0) {
                    return arg1;
                }
                if (!this.method1218()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1143 == -256 && (this.field1151 & 0xFF) == 0) {
                if (Statics.field1075) {
                    return method1115(0, ((class56) this.field1159).field1126, arg0, this.field1151, arg1, this.field1147, this.field1148, 0, arg3, arg2, this);
                }
                return method1114(((class56) this.field1159).field1126, arg0, this.field1151, arg1, this.field1146, 0, arg3, arg2, this);
            }
            if (Statics.field1075) {
                return method1119(0, 0, ((class56) this.field1159).field1126, arg0, this.field1151, arg1, this.field1147, this.field1148, 0, arg3, arg2, this, this.field1143, arg4);
            }
            return method1118(0, 0, ((class56) this.field1159).field1126, arg0, this.field1151, arg1, this.field1146, 0, arg3, arg2, this, this.field1143, arg4);
        }
    }

    @ObfuscatedName("bi.am()Z")
    public boolean method1218() {
        int var1 = this.field1144;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method1129(var1, this.field1142);
            var2 = method1088(var1, this.field1142);
        }
        if (this.field1146 != var1 || this.field1147 != var3 || this.field1148 != var2) {
            if (this.field1146 < var1) {
                this.field1154 = 1;
                this.field1153 = var1 - this.field1146;
            } else if (this.field1146 > var1) {
                this.field1154 = -1;
                this.field1153 = this.field1146 - var1;
            } else {
                this.field1154 = 0;
            }
            if (this.field1147 < var3) {
                this.field1156 = 1;
                if (this.field1153 == 0 || this.field1153 > var3 - this.field1147) {
                    this.field1153 = var3 - this.field1147;
                }
            } else if (this.field1147 > var3) {
                this.field1156 = -1;
                if (this.field1153 == 0 || this.field1153 > this.field1147 - var3) {
                    this.field1153 = this.field1147 - var3;
                }
            } else {
                this.field1156 = 0;
            }
            if (this.field1148 < var2) {
                this.field1145 = 1;
                if (this.field1153 == 0 || this.field1153 > var2 - this.field1148) {
                    this.field1153 = var2 - this.field1148;
                }
            } else if (this.field1148 > var2) {
                this.field1145 = -1;
                if (this.field1153 == 0 || this.field1153 > this.field1148 - var2) {
                    this.field1153 = this.field1148 - var2;
                }
            } else {
                this.field1145 = 0;
            }
            return false;
        } else if (this.field1144 == Integer.MIN_VALUE) {
            this.field1144 = 0;
            this.field1148 = 0;
            this.field1147 = 0;
            this.field1146 = 0;
            this.method3260();
            return true;
        } else {
            this.method1092();
            return false;
        }
    }

    @ObfuscatedName("bi.at([B[IIIIIIILbi;)I")
    public static int method1112(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class58 arg8) {
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
        arg8.field1151 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("bi.an(I[B[IIIIIIIILbi;)I")
    public static int method1113(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class58 arg10) {
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
        arg10.field1151 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("bi.ax([B[IIIIIIILbi;)I")
    public static int method1114(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class58 arg8) {
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
        arg8.field1151 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("bi.ah(I[B[IIIIIIIILbi;)I")
    public static int method1115(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class58 arg10) {
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
        arg10.field1151 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("bi.ad(II[B[IIIIIIILbi;II)I")
    public static int method1151(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class58 arg10, int arg11, int arg12) {
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
        arg10.field1151 = arg4;
        return arg5;
    }

    @ObfuscatedName("bi.bm(II[B[IIIIIIIILbi;II)I")
    public static int method1117(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class58 arg11, int arg12, int arg13) {
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
        arg11.field1151 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("bi.bs(II[B[IIIIIIILbi;II)I")
    public static int method1118(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class58 arg10, int arg11, int arg12) {
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
        arg10.field1151 = arg4;
        return arg5;
    }

    @ObfuscatedName("bi.bj(II[B[IIIIIIIILbi;II)I")
    public static int method1119(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class58 arg11, int arg12, int arg13) {
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
        arg11.field1151 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("bi.bq([B[IIIIIIIILbi;)I")
    public static int method1182(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class58 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field1147 += (var14 - arg3) * arg9.field1156;
        arg9.field1148 += (var14 - arg3) * arg9.field1145;
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
        arg9.field1146 = var12 >> 2;
        arg9.field1151 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("bi.bv(I[B[IIIIIIIIIILbi;)I")
    public static int method1192(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class58 arg12) {
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
        arg12.field1146 += (var19 - arg4) * arg12.field1154;
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
        arg12.field1148 = var16 >> 2;
        arg12.field1151 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("bi.bi([B[IIIIIIIILbi;)I")
    public static int method1122(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class58 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field1147 += (var14 - arg3) * arg9.field1156;
        arg9.field1148 += (var14 - arg3) * arg9.field1145;
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
        arg9.field1146 = var12 >> 2;
        arg9.field1151 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("bi.bp(I[B[IIIIIIIIIILbi;)I")
    public static int method1123(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class58 arg12) {
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
        arg12.field1146 += (var19 - arg4) * arg12.field1154;
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
        arg12.field1148 = var16 >> 2;
        arg12.field1151 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("bi.bl(II[B[IIIIIIIILbi;II)I")
    public static int method1124(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class58 arg11, int arg12, int arg13) {
        arg11.field1147 -= arg11.field1156 * arg5;
        arg11.field1148 -= arg11.field1145 * arg5;
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
        arg11.field1147 += arg11.field1156 * arg5;
        arg11.field1148 += arg11.field1145 * arg5;
        arg11.field1146 = arg6;
        arg11.field1151 = arg4;
        return arg5;
    }

    @ObfuscatedName("bi.bz(II[B[IIIIIIIIIILbi;II)I")
    public static int method1146(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class58 arg13, int arg14, int arg15) {
        arg13.field1146 -= arg13.field1154 * arg5;
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
        arg13.field1146 += arg13.field1154 * var27;
        arg13.field1147 = arg6;
        arg13.field1148 = arg7;
        arg13.field1151 = arg4;
        return var27;
    }

    @ObfuscatedName("bi.bx(II[B[IIIIIIIILbi;II)I")
    public static int method1222(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class58 arg11, int arg12, int arg13) {
        arg11.field1147 -= arg11.field1156 * arg5;
        arg11.field1148 -= arg11.field1145 * arg5;
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
        arg11.field1147 += arg11.field1156 * arg5;
        arg11.field1148 += arg11.field1145 * arg5;
        arg11.field1146 = arg6;
        arg11.field1151 = arg4;
        return arg5;
    }

    @ObfuscatedName("bi.bb(II[B[IIIIIIIIIILbi;II)I")
    public static int method1184(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class58 arg13, int arg14, int arg15) {
        arg13.field1146 -= arg13.field1154 * arg5;
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
        arg13.field1146 += arg13.field1154 * var26;
        arg13.field1147 = arg6;
        arg13.field1148 = arg7;
        arg13.field1151 = arg4;
        return var26;
    }
}
