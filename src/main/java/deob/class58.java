package deob;

@ObfuscatedName("bc")
public class class58 extends class60 {

    @ObfuscatedName("bc.g")
    public int field1153;

    @ObfuscatedName("bc.v")
    public int field1150;

    @ObfuscatedName("bc.z")
    public int field1152;

    @ObfuscatedName("bc.h")
    public int field1144;

    @ObfuscatedName("bc.k")
    public int field1145;

    @ObfuscatedName("bc.l")
    public int field1151;

    @ObfuscatedName("bc.e")
    public int field1147;

    @ObfuscatedName("bc.j")
    public int field1148;

    @ObfuscatedName("bc.n")
    public int field1149;

    @ObfuscatedName("bc.f")
    public int field1143;

    @ObfuscatedName("bc.a")
    public boolean field1141;

    @ObfuscatedName("bc.i")
    public int field1154;

    @ObfuscatedName("bc.y")
    public int field1142;

    @ObfuscatedName("bc.p")
    public int field1146;

    @ObfuscatedName("bc.q")
    public int field1155;

    @ObfuscatedName("bc.g(II)I")
    public static int method1229(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("bc.v(II)I")
    public static int method1169(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("bc.ax()I")
    public int method1147() {
        int var1 = this.field1145 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field1148 == 0) {
            var2 -= this.field1153 * var2 / (((class56) this.field1159).field1124.length << 8);
        } else if (this.field1148 >= 0) {
            var2 -= this.field1149 * var2 / ((class56) this.field1159).field1124.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    public class58(class56 arg0, int arg1, int arg2) {
        this.field1159 = arg0;
        this.field1149 = arg0.field1128;
        this.field1143 = arg0.field1127;
        this.field1141 = arg0.field1125;
        this.field1150 = arg1;
        this.field1152 = arg2;
        this.field1144 = 8192;
        this.field1153 = 0;
        this.method1124();
    }

    public class58(class56 arg0, int arg1, int arg2, int arg3) {
        this.field1159 = arg0;
        this.field1149 = arg0.field1128;
        this.field1143 = arg0.field1127;
        this.field1141 = arg0.field1125;
        this.field1150 = arg1;
        this.field1152 = arg2;
        this.field1144 = arg3;
        this.field1153 = 0;
        this.method1124();
    }

    @ObfuscatedName("bc.z(Lbq;II)Lbc;")
    public static class58 method1122(class56 arg0, int arg1, int arg2) {
        return arg0.field1124 == null || arg0.field1124.length == 0 ? null : new class58(arg0, (int) ((long) arg0.field1126 * 256L * (long) arg1 / (long) (Statics.field1074 * 100)), arg2 << 6);
    }

    @ObfuscatedName("bc.h(Lbq;III)Lbc;")
    public static class58 method1123(class56 arg0, int arg1, int arg2, int arg3) {
        return arg0.field1124 == null || arg0.field1124.length == 0 ? null : new class58(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("bc.k()V")
    public void method1124() {
        this.field1145 = this.field1152;
        this.field1151 = method1229(this.field1152, this.field1144);
        this.field1147 = method1169(this.field1152, this.field1144);
    }

    @ObfuscatedName("bc.f(I)V")
    public synchronized void method1154(int arg0) {
        this.field1148 = arg0;
    }

    @ObfuscatedName("bc.i(I)V")
    public synchronized void method1125(int arg0) {
        this.method1127(arg0 << 6, this.method1129());
    }

    @ObfuscatedName("bc.y(I)V")
    public synchronized void method1126(int arg0) {
        this.method1127(arg0, this.method1129());
    }

    @ObfuscatedName("bc.p(II)V")
    public synchronized void method1127(int arg0, int arg1) {
        this.field1152 = arg0;
        this.field1144 = arg1;
        this.field1154 = 0;
        this.method1124();
    }

    @ObfuscatedName("bc.q()I")
    public synchronized int method1136() {
        return this.field1152 == Integer.MIN_VALUE ? 0 : this.field1152;
    }

    @ObfuscatedName("bc.t()I")
    public synchronized int method1129() {
        return this.field1144 < 0 ? -1 : this.field1144;
    }

    @ObfuscatedName("bc.r(I)V")
    public synchronized void method1153(int arg0) {
        int var2 = ((class56) this.field1159).field1124.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field1153 = arg0;
    }

    @ObfuscatedName("bc.x(Z)V")
    public synchronized void method1131(boolean arg0) {
        this.field1150 = (this.field1150 >>> 31) + (this.field1150 ^ this.field1150 >> 31);
        if (arg0) {
            this.field1150 = -this.field1150;
        }
    }

    @ObfuscatedName("bc.s()V")
    public void method1132() {
        if (this.field1154 == 0) {
            return;
        }
        if (this.field1152 == Integer.MIN_VALUE) {
            this.field1152 = 0;
        }
        this.field1154 = 0;
        this.method1124();
    }

    @ObfuscatedName("bc.d(II)V")
    public synchronized void method1133(int arg0, int arg1) {
        this.method1134(arg0, arg1, this.method1129());
    }

    @ObfuscatedName("bc.m(III)V")
    public synchronized void method1134(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method1127(arg1, arg2);
            return;
        }
        int var4 = method1229(arg1, arg2);
        int var5 = method1169(arg1, arg2);
        if (this.field1151 == var4 && this.field1147 == var5) {
            this.field1154 = 0;
            return;
        }
        int var6 = arg1 - this.field1145;
        if (this.field1145 - arg1 > var6) {
            var6 = this.field1145 - arg1;
        }
        if (var4 - this.field1151 > var6) {
            var6 = var4 - this.field1151;
        }
        if (this.field1151 - var4 > var6) {
            var6 = this.field1151 - var4;
        }
        if (var5 - this.field1147 > var6) {
            var6 = var5 - this.field1147;
        }
        if (this.field1147 - var5 > var6) {
            var6 = this.field1147 - var5;
        }
        if (arg0 > var6) {
            arg0 = var6;
        }
        this.field1154 = arg0;
        this.field1152 = arg1;
        this.field1144 = arg2;
        this.field1142 = (arg1 - this.field1145) / arg0;
        this.field1146 = (var4 - this.field1151) / arg0;
        this.field1155 = (var5 - this.field1147) / arg0;
    }

    @ObfuscatedName("bc.o(I)V")
    public synchronized void method1191(int arg0) {
        if (arg0 == 0) {
            this.method1126(0);
            this.method3322();
        } else if (this.field1151 == 0 && this.field1147 == 0) {
            this.field1154 = 0;
            this.field1152 = 0;
            this.field1145 = 0;
            this.method3322();
        } else {
            int var2 = -this.field1145;
            if (this.field1145 > var2) {
                var2 = this.field1145;
            }
            if (-this.field1151 > var2) {
                var2 = -this.field1151;
            }
            if (this.field1151 > var2) {
                var2 = this.field1151;
            }
            if (-this.field1147 > var2) {
                var2 = -this.field1147;
            }
            if (this.field1147 > var2) {
                var2 = this.field1147;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field1154 = arg0;
            this.field1152 = Integer.MIN_VALUE;
            this.field1142 = -this.field1145 / arg0;
            this.field1146 = -this.field1151 / arg0;
            this.field1155 = -this.field1147 / arg0;
        }
    }

    @ObfuscatedName("bc.b(I)V")
    public synchronized void method1238(int arg0) {
        if (this.field1150 < 0) {
            this.field1150 = -arg0;
        } else {
            this.field1150 = arg0;
        }
    }

    @ObfuscatedName("bc.aw()I")
    public synchronized int method1137() {
        return this.field1150 < 0 ? -this.field1150 : this.field1150;
    }

    @ObfuscatedName("bc.am()Z")
    public boolean method1128() {
        return this.field1153 < 0 || this.field1153 >= ((class56) this.field1159).field1124.length << 8;
    }

    @ObfuscatedName("bc.av()Z")
    public boolean method1138() {
        return this.field1154 != 0;
    }

    @ObfuscatedName("bc.l()Lbn;")
    public class60 method1004() {
        return null;
    }

    @ObfuscatedName("bc.e()Lbn;")
    public class60 method998() {
        return null;
    }

    @ObfuscatedName("bc.j()I")
    public int method983() {
        return this.field1152 == 0 && this.field1154 == 0 ? 0 : 1;
    }

    @ObfuscatedName("bc.n([III)V")
    public synchronized void method984(int[] arg0, int arg1, int arg2) {
        if (this.field1152 == 0 && this.field1154 == 0) {
            this.method994(arg2);
            return;
        }
        class56 var4 = (class56) this.field1159;
        int var5 = this.field1149 << 8;
        int var6 = this.field1143 << 8;
        int var7 = var4.field1124.length << 8;
        int var8 = var6 - var5;
        if (var8 <= 0) {
            this.field1148 = 0;
        }
        int var9 = arg1;
        int var10 = arg1 + arg2;
        if (this.field1153 < 0) {
            if (this.field1150 <= 0) {
                this.method1132();
                this.method3322();
                return;
            }
            this.field1153 = 0;
        }
        if (this.field1153 >= var7) {
            if (this.field1150 >= 0) {
                this.method1132();
                this.method3322();
                return;
            }
            this.field1153 = var7 - 1;
        }
        if (this.field1148 >= 0) {
            if (this.field1148 > 0) {
                if (this.field1141) {
                    label131: {
                        if (this.field1150 < 0) {
                            var9 = this.method1143(arg0, arg1, var5, var10, var4.field1124[this.field1149]);
                            if (this.field1153 >= var5) {
                                return;
                            }
                            this.field1153 = var5 + var5 - 1 - this.field1153;
                            this.field1150 = -this.field1150;
                            if (--this.field1148 == 0) {
                                break label131;
                            }
                        }
                        do {
                            var9 = this.method1165(arg0, var9, var6, var10, var4.field1124[this.field1143 - 1]);
                            if (this.field1153 < var6) {
                                return;
                            }
                            this.field1153 = var6 + var6 - 1 - this.field1153;
                            this.field1150 = -this.field1150;
                            if (--this.field1148 == 0) {
                                break;
                            }
                            var9 = this.method1143(arg0, var9, var5, var10, var4.field1124[this.field1149]);
                            if (this.field1153 >= var5) {
                                return;
                            }
                            this.field1153 = var5 + var5 - 1 - this.field1153;
                            this.field1150 = -this.field1150;
                        } while (--this.field1148 != 0);
                    }
                } else if (this.field1150 < 0) {
                    while (true) {
                        var9 = this.method1143(arg0, var9, var5, var10, var4.field1124[this.field1143 - 1]);
                        if (this.field1153 >= var5) {
                            return;
                        }
                        int var12 = (var6 - 1 - this.field1153) / var8;
                        if (var12 >= this.field1148) {
                            this.field1153 += this.field1148 * var8;
                            this.field1148 = 0;
                            break;
                        }
                        this.field1153 += var8 * var12;
                        this.field1148 -= var12;
                    }
                } else {
                    while (true) {
                        var9 = this.method1165(arg0, var9, var6, var10, var4.field1124[this.field1149]);
                        if (this.field1153 < var6) {
                            return;
                        }
                        int var13 = (this.field1153 - var5) / var8;
                        if (var13 >= this.field1148) {
                            this.field1153 -= this.field1148 * var8;
                            this.field1148 = 0;
                            break;
                        }
                        this.field1153 -= var8 * var13;
                        this.field1148 -= var13;
                    }
                }
            }
            if (this.field1150 < 0) {
                this.method1143(arg0, var9, 0, var10, 0);
                if (this.field1153 < 0) {
                    this.field1153 = -1;
                    this.method1132();
                    this.method3322();
                }
            } else {
                this.method1165(arg0, var9, var7, var10, 0);
                if (this.field1153 >= var7) {
                    this.field1153 = var7;
                    this.method1132();
                    this.method3322();
                }
            }
        } else if (this.field1141) {
            if (this.field1150 < 0) {
                var9 = this.method1143(arg0, arg1, var5, var10, var4.field1124[this.field1149]);
                if (this.field1153 >= var5) {
                    return;
                }
                this.field1153 = var5 + var5 - 1 - this.field1153;
                this.field1150 = -this.field1150;
            }
            while (true) {
                int var11 = this.method1165(arg0, var9, var6, var10, var4.field1124[this.field1143 - 1]);
                if (this.field1153 < var6) {
                    return;
                }
                this.field1153 = var6 + var6 - 1 - this.field1153;
                this.field1150 = -this.field1150;
                var9 = this.method1143(arg0, var11, var5, var10, var4.field1124[this.field1149]);
                if (this.field1153 >= var5) {
                    return;
                }
                this.field1153 = var5 + var5 - 1 - this.field1153;
                this.field1150 = -this.field1150;
            }
        } else if (this.field1150 < 0) {
            while (true) {
                var9 = this.method1143(arg0, var9, var5, var10, var4.field1124[this.field1143 - 1]);
                if (this.field1153 >= var5) {
                    return;
                }
                this.field1153 = var6 - 1 - (var6 - 1 - this.field1153) % var8;
            }
        } else {
            while (true) {
                var9 = this.method1165(arg0, var9, var6, var10, var4.field1124[this.field1149]);
                if (this.field1153 < var6) {
                    return;
                }
                this.field1153 = (this.field1153 - var5) % var8 + var5;
            }
        }
    }

    @ObfuscatedName("bc.a(I)V")
    public synchronized void method994(int arg0) {
        if (this.field1154 > 0) {
            if (arg0 >= this.field1154) {
                if (this.field1152 == Integer.MIN_VALUE) {
                    this.field1152 = 0;
                    this.field1147 = 0;
                    this.field1151 = 0;
                    this.field1145 = 0;
                    this.method3322();
                    arg0 = this.field1154;
                }
                this.field1154 = 0;
                this.method1124();
            } else {
                this.field1145 += this.field1142 * arg0;
                this.field1151 += this.field1146 * arg0;
                this.field1147 += this.field1155 * arg0;
                this.field1154 -= arg0;
            }
        }
        class56 var2 = (class56) this.field1159;
        int var3 = this.field1149 << 8;
        int var4 = this.field1143 << 8;
        int var5 = var2.field1124.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field1148 = 0;
        }
        if (this.field1153 < 0) {
            if (this.field1150 <= 0) {
                this.method1132();
                this.method3322();
                return;
            }
            this.field1153 = 0;
        }
        if (this.field1153 >= var5) {
            if (this.field1150 >= 0) {
                this.method1132();
                this.method3322();
                return;
            }
            this.field1153 = var5 - 1;
        }
        this.field1153 += this.field1150 * arg0;
        if (this.field1148 >= 0) {
            if (this.field1148 > 0) {
                if (this.field1141) {
                    label121: {
                        if (this.field1150 < 0) {
                            if (this.field1153 >= var3) {
                                return;
                            }
                            this.field1153 = var3 + var3 - 1 - this.field1153;
                            this.field1150 = -this.field1150;
                            if (--this.field1148 == 0) {
                                break label121;
                            }
                        }
                        do {
                            if (this.field1153 < var4) {
                                return;
                            }
                            this.field1153 = var4 + var4 - 1 - this.field1153;
                            this.field1150 = -this.field1150;
                            if (--this.field1148 == 0) {
                                break;
                            }
                            if (this.field1153 >= var3) {
                                return;
                            }
                            this.field1153 = var3 + var3 - 1 - this.field1153;
                            this.field1150 = -this.field1150;
                        } while (--this.field1148 != 0);
                    }
                } else {
                    label153: {
                        if (this.field1150 < 0) {
                            if (this.field1153 >= var3) {
                                return;
                            }
                            int var7 = (var4 - 1 - this.field1153) / var6;
                            if (var7 >= this.field1148) {
                                this.field1153 += this.field1148 * var6;
                                this.field1148 = 0;
                                break label153;
                            }
                            this.field1153 += var6 * var7;
                            this.field1148 -= var7;
                        } else if (this.field1153 >= var4) {
                            int var8 = (this.field1153 - var3) / var6;
                            if (var8 >= this.field1148) {
                                this.field1153 -= this.field1148 * var6;
                                this.field1148 = 0;
                                break label153;
                            }
                            this.field1153 -= var6 * var8;
                            this.field1148 -= var8;
                        } else {
                            return;
                        }
                        return;
                    }
                }
            }
            if (this.field1150 < 0) {
                if (this.field1153 < 0) {
                    this.field1153 = -1;
                    this.method1132();
                    this.method3322();
                }
            } else if (this.field1153 >= var5) {
                this.field1153 = var5;
                this.method1132();
                this.method3322();
            }
        } else if (this.field1141) {
            if (this.field1150 < 0) {
                if (this.field1153 >= var3) {
                    return;
                }
                this.field1153 = var3 + var3 - 1 - this.field1153;
                this.field1150 = -this.field1150;
            }
            while (this.field1153 >= var4) {
                this.field1153 = var4 + var4 - 1 - this.field1153;
                this.field1150 = -this.field1150;
                if (this.field1153 >= var3) {
                    return;
                }
                this.field1153 = var3 + var3 - 1 - this.field1153;
                this.field1150 = -this.field1150;
            }
        } else if (this.field1150 < 0) {
            if (this.field1153 >= var3) {
                return;
            }
            this.field1153 = var4 - 1 - (var4 - 1 - this.field1153) % var6;
        } else if (this.field1153 >= var4) {
            this.field1153 = (this.field1153 - var3) % var6 + var3;
        } else {
            return;
        }
    }

    @ObfuscatedName("bc.ao([IIIII)I")
    public int method1165(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1154 > 0) {
                int var6 = this.field1154 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1154 += arg1;
                if (this.field1150 == 256 && (this.field1153 & 0xFF) == 0) {
                    if (Statics.field1079) {
                        arg1 = method1152(0, ((class56) this.field1159).field1124, arg0, this.field1153, arg1, this.field1151, this.field1147, this.field1146, this.field1155, 0, var6, arg2, this);
                    } else {
                        arg1 = method1151(((class56) this.field1159).field1124, arg0, this.field1153, arg1, this.field1145, this.field1142, 0, var6, arg2, this);
                    }
                } else if (Statics.field1079) {
                    arg1 = method1156(0, 0, ((class56) this.field1159).field1124, arg0, this.field1153, arg1, this.field1151, this.field1147, this.field1146, this.field1155, 0, var6, arg2, this, this.field1150, arg4);
                } else {
                    arg1 = method1155(0, 0, ((class56) this.field1159).field1124, arg0, this.field1153, arg1, this.field1145, this.field1142, 0, var6, arg2, this, this.field1150, arg4);
                }
                this.field1154 -= arg1;
                if (this.field1154 != 0) {
                    return arg1;
                }
                if (!this.method1159()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1150 == 256 && (this.field1153 & 0xFF) == 0) {
                if (Statics.field1079) {
                    return method1146(0, ((class56) this.field1159).field1124, arg0, this.field1153, arg1, this.field1151, this.field1147, 0, arg3, arg2, this);
                }
                return method1145(((class56) this.field1159).field1124, arg0, this.field1153, arg1, this.field1145, 0, arg3, arg2, this);
            }
            if (Statics.field1079) {
                return method1163(0, 0, ((class56) this.field1159).field1124, arg0, this.field1153, arg1, this.field1151, this.field1147, 0, arg3, arg2, this, this.field1150, arg4);
            }
            return method1160(0, 0, ((class56) this.field1159).field1124, arg0, this.field1153, arg1, this.field1145, 0, arg3, arg2, this, this.field1150, arg4);
        }
    }

    @ObfuscatedName("bc.ag([IIIII)I")
    public int method1143(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1154 > 0) {
                int var6 = this.field1154 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1154 += arg1;
                if (this.field1150 == -256 && (this.field1153 & 0xFF) == 0) {
                    if (Statics.field1079) {
                        arg1 = method1193(0, ((class56) this.field1159).field1124, arg0, this.field1153, arg1, this.field1151, this.field1147, this.field1146, this.field1155, 0, var6, arg2, this);
                    } else {
                        arg1 = method1226(((class56) this.field1159).field1124, arg0, this.field1153, arg1, this.field1145, this.field1142, 0, var6, arg2, this);
                    }
                } else if (Statics.field1079) {
                    arg1 = method1158(0, 0, ((class56) this.field1159).field1124, arg0, this.field1153, arg1, this.field1151, this.field1147, this.field1146, this.field1155, 0, var6, arg2, this, this.field1150, arg4);
                } else {
                    arg1 = method1157(0, 0, ((class56) this.field1159).field1124, arg0, this.field1153, arg1, this.field1145, this.field1142, 0, var6, arg2, this, this.field1150, arg4);
                }
                this.field1154 -= arg1;
                if (this.field1154 != 0) {
                    return arg1;
                }
                if (!this.method1159()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1150 == -256 && (this.field1153 & 0xFF) == 0) {
                if (Statics.field1079) {
                    return method1188(0, ((class56) this.field1159).field1124, arg0, this.field1153, arg1, this.field1151, this.field1147, 0, arg3, arg2, this);
                }
                return method1164(((class56) this.field1159).field1124, arg0, this.field1153, arg1, this.field1145, 0, arg3, arg2, this);
            }
            if (Statics.field1079) {
                return method1150(0, 0, ((class56) this.field1159).field1124, arg0, this.field1153, arg1, this.field1151, this.field1147, 0, arg3, arg2, this, this.field1150, arg4);
            }
            return method1149(0, 0, ((class56) this.field1159).field1124, arg0, this.field1153, arg1, this.field1145, 0, arg3, arg2, this, this.field1150, arg4);
        }
    }

    @ObfuscatedName("bc.ay()Z")
    public boolean method1159() {
        int var1 = this.field1152;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method1229(var1, this.field1144);
            var2 = method1169(var1, this.field1144);
        }
        if (this.field1145 != var1 || this.field1151 != var3 || this.field1147 != var2) {
            if (this.field1145 < var1) {
                this.field1142 = 1;
                this.field1154 = var1 - this.field1145;
            } else if (this.field1145 > var1) {
                this.field1142 = -1;
                this.field1154 = this.field1145 - var1;
            } else {
                this.field1142 = 0;
            }
            if (this.field1151 < var3) {
                this.field1146 = 1;
                if (this.field1154 == 0 || this.field1154 > var3 - this.field1151) {
                    this.field1154 = var3 - this.field1151;
                }
            } else if (this.field1151 > var3) {
                this.field1146 = -1;
                if (this.field1154 == 0 || this.field1154 > this.field1151 - var3) {
                    this.field1154 = this.field1151 - var3;
                }
            } else {
                this.field1146 = 0;
            }
            if (this.field1147 < var2) {
                this.field1155 = 1;
                if (this.field1154 == 0 || this.field1154 > var2 - this.field1147) {
                    this.field1154 = var2 - this.field1147;
                }
            } else if (this.field1147 > var2) {
                this.field1155 = -1;
                if (this.field1154 == 0 || this.field1154 > this.field1147 - var2) {
                    this.field1154 = this.field1147 - var2;
                }
            } else {
                this.field1155 = 0;
            }
            return false;
        } else if (this.field1152 == Integer.MIN_VALUE) {
            this.field1152 = 0;
            this.field1147 = 0;
            this.field1151 = 0;
            this.field1145 = 0;
            this.method3322();
            return true;
        } else {
            this.method1124();
            return false;
        }
    }

    @ObfuscatedName("bc.ab([B[IIIIIIILbc;)I")
    public static int method1145(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class58 arg8) {
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
        arg8.field1153 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("bc.al(I[B[IIIIIIIILbc;)I")
    public static int method1146(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class58 arg10) {
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
        arg10.field1153 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("bc.ae([B[IIIIIIILbc;)I")
    public static int method1164(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class58 arg8) {
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
        arg8.field1153 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("bc.af(I[B[IIIIIIIILbc;)I")
    public static int method1188(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class58 arg10) {
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
        arg10.field1153 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("bc.aj(II[B[IIIIIIILbc;II)I")
    public static int method1160(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class58 arg10, int arg11, int arg12) {
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
        arg10.field1153 = arg4;
        return arg5;
    }

    @ObfuscatedName("bc.ah(II[B[IIIIIIIILbc;II)I")
    public static int method1163(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class58 arg11, int arg12, int arg13) {
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
        arg11.field1153 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("bc.au(II[B[IIIIIIILbc;II)I")
    public static int method1149(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class58 arg10, int arg11, int arg12) {
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
        arg10.field1153 = arg4;
        return arg5;
    }

    @ObfuscatedName("bc.ad(II[B[IIIIIIIILbc;II)I")
    public static int method1150(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class58 arg11, int arg12, int arg13) {
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
        arg11.field1153 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("bc.az([B[IIIIIIIILbc;)I")
    public static int method1151(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class58 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field1151 += (var14 - arg3) * arg9.field1146;
        arg9.field1147 += (var14 - arg3) * arg9.field1155;
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
        arg9.field1145 = var12 >> 2;
        arg9.field1153 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("bc.ak(I[B[IIIIIIIIIILbc;)I")
    public static int method1152(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class58 arg12) {
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
        arg12.field1145 += (var19 - arg4) * arg12.field1142;
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
        arg12.field1151 = var15 >> 2;
        arg12.field1147 = var16 >> 2;
        arg12.field1153 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("bc.ar([B[IIIIIIIILbc;)I")
    public static int method1226(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class58 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field1151 += (var14 - arg3) * arg9.field1146;
        arg9.field1147 += (var14 - arg3) * arg9.field1155;
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
        arg9.field1145 = var12 >> 2;
        arg9.field1153 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("bc.bu(I[B[IIIIIIIIIILbc;)I")
    public static int method1193(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class58 arg12) {
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
        arg12.field1145 += (var19 - arg4) * arg12.field1142;
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
        arg12.field1151 = var15 >> 2;
        arg12.field1147 = var16 >> 2;
        arg12.field1153 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("bc.bo(II[B[IIIIIIIILbc;II)I")
    public static int method1155(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class58 arg11, int arg12, int arg13) {
        arg11.field1151 -= arg11.field1146 * arg5;
        arg11.field1147 -= arg11.field1155 * arg5;
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
        arg11.field1151 += arg11.field1146 * arg5;
        arg11.field1147 += arg11.field1155 * arg5;
        arg11.field1145 = arg6;
        arg11.field1153 = arg4;
        return arg5;
    }

    @ObfuscatedName("bc.be(II[B[IIIIIIIIIILbc;II)I")
    public static int method1156(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class58 arg13, int arg14, int arg15) {
        arg13.field1145 -= arg13.field1142 * arg5;
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
        arg13.field1145 += arg13.field1142 * var27;
        arg13.field1151 = arg6;
        arg13.field1147 = arg7;
        arg13.field1153 = arg4;
        return var27;
    }

    @ObfuscatedName("bc.bq(II[B[IIIIIIIILbc;II)I")
    public static int method1157(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class58 arg11, int arg12, int arg13) {
        arg11.field1151 -= arg11.field1146 * arg5;
        arg11.field1147 -= arg11.field1155 * arg5;
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
        arg11.field1151 += arg11.field1146 * arg5;
        arg11.field1147 += arg11.field1155 * arg5;
        arg11.field1145 = arg6;
        arg11.field1153 = arg4;
        return arg5;
    }

    @ObfuscatedName("bc.bh(II[B[IIIIIIIIIILbc;II)I")
    public static int method1158(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class58 arg13, int arg14, int arg15) {
        arg13.field1145 -= arg13.field1142 * arg5;
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
        arg13.field1145 += arg13.field1142 * var26;
        arg13.field1151 = arg6;
        arg13.field1147 = arg7;
        arg13.field1153 = arg4;
        return var26;
    }
}
