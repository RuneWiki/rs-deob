package deob;

@ObfuscatedName("ba")
public class class59 extends class61 {

    @ObfuscatedName("ba.l")
    public int field1150;

    @ObfuscatedName("ba.y")
    public int field1144;

    @ObfuscatedName("ba.g")
    public int field1145;

    @ObfuscatedName("ba.j")
    public int field1146;

    @ObfuscatedName("ba.c")
    public int field1147;

    @ObfuscatedName("ba.x")
    public int field1148;

    @ObfuscatedName("ba.f")
    public int field1149;

    @ObfuscatedName("ba.t")
    public int field1153;

    @ObfuscatedName("ba.n")
    public int field1151;

    @ObfuscatedName("ba.p")
    public int field1143;

    @ObfuscatedName("ba.a")
    public boolean field1155;

    @ObfuscatedName("ba.o")
    public int field1154;

    @ObfuscatedName("ba.b")
    public int field1156;

    @ObfuscatedName("ba.r")
    public int field1152;

    @ObfuscatedName("ba.z")
    public int field1157;

    @ObfuscatedName("ba.l(II)I")
    public static int method1095(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("ba.y(II)I")
    public static int method1116(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("ba.ag()I")
    public int method1106() {
        int var1 = this.field1147 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field1153 == 0) {
            var2 -= this.field1150 * var2 / (((class57) this.field1160).field1129.length << 8);
        } else if (this.field1153 >= 0) {
            var2 -= this.field1151 * var2 / ((class57) this.field1160).field1129.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    public class59(class57 arg0, int arg1, int arg2) {
        this.field1160 = arg0;
        this.field1151 = arg0.field1128;
        this.field1143 = arg0.field1126;
        this.field1155 = arg0.field1130;
        this.field1144 = arg1;
        this.field1145 = arg2;
        this.field1146 = 8192;
        this.field1150 = 0;
        this.method1090();
    }

    public class59(class57 arg0, int arg1, int arg2, int arg3) {
        this.field1160 = arg0;
        this.field1151 = arg0.field1128;
        this.field1143 = arg0.field1126;
        this.field1155 = arg0.field1130;
        this.field1144 = arg1;
        this.field1145 = arg2;
        this.field1146 = arg3;
        this.field1150 = 0;
        this.method1090();
    }

    @ObfuscatedName("ba.g(Lbe;II)Lba;")
    public static class59 method1108(class57 arg0, int arg1, int arg2) {
        return arg0.field1129 == null || arg0.field1129.length == 0 ? null : new class59(arg0, (int) ((long) arg0.field1127 * 256L * (long) arg1 / (long) (Statics.field1086 * 100)), arg2 << 6);
    }

    @ObfuscatedName("ba.j(Lbe;III)Lba;")
    public static class59 method1101(class57 arg0, int arg1, int arg2, int arg3) {
        return arg0.field1129 == null || arg0.field1129.length == 0 ? null : new class59(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("ba.w()V")
    public void method1090() {
        this.field1147 = this.field1145;
        this.field1148 = method1095(this.field1145, this.field1146);
        this.field1149 = method1116(this.field1145, this.field1146);
    }

    @ObfuscatedName("ba.n(I)V")
    public synchronized void method1094(int arg0) {
        this.field1153 = arg0;
    }

    @ObfuscatedName("ba.a(I)V")
    public synchronized void method1174(int arg0) {
        this.method1096(arg0 << 6, this.method1115());
    }

    @ObfuscatedName("ba.o(I)V")
    public synchronized void method1194(int arg0) {
        this.method1096(arg0, this.method1115());
    }

    @ObfuscatedName("ba.b(II)V")
    public synchronized void method1096(int arg0, int arg1) {
        this.field1145 = arg0;
        this.field1146 = arg1;
        this.field1154 = 0;
        this.method1090();
    }

    @ObfuscatedName("ba.r()I")
    public synchronized int method1097() {
        return this.field1145 == Integer.MIN_VALUE ? 0 : this.field1145;
    }

    @ObfuscatedName("ba.z()I")
    public synchronized int method1115() {
        return this.field1146 < 0 ? -1 : this.field1146;
    }

    @ObfuscatedName("ba.u(I)V")
    public synchronized void method1099(int arg0) {
        int var2 = ((class57) this.field1160).field1129.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field1150 = arg0;
    }

    @ObfuscatedName("ba.s(Z)V")
    public synchronized void method1100(boolean arg0) {
        this.field1144 = (this.field1144 >>> 31) + (this.field1144 ^ this.field1144 >> 31);
        if (arg0) {
            this.field1144 = -this.field1144;
        }
    }

    @ObfuscatedName("ba.i()V")
    public void method1091() {
        if (this.field1154 == 0) {
            return;
        }
        if (this.field1145 == Integer.MIN_VALUE) {
            this.field1145 = 0;
        }
        this.field1154 = 0;
        this.method1090();
    }

    @ObfuscatedName("ba.e(II)V")
    public synchronized void method1102(int arg0, int arg1) {
        this.method1103(arg0, arg1, this.method1115());
    }

    @ObfuscatedName("ba.q(III)V")
    public synchronized void method1103(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method1096(arg1, arg2);
            return;
        }
        int var4 = method1095(arg1, arg2);
        int var5 = method1116(arg1, arg2);
        if (this.field1148 == var4 && this.field1149 == var5) {
            this.field1154 = 0;
            return;
        }
        int var6 = arg1 - this.field1147;
        if (this.field1147 - arg1 > var6) {
            var6 = this.field1147 - arg1;
        }
        if (var4 - this.field1148 > var6) {
            var6 = var4 - this.field1148;
        }
        if (this.field1148 - var4 > var6) {
            var6 = this.field1148 - var4;
        }
        if (var5 - this.field1149 > var6) {
            var6 = var5 - this.field1149;
        }
        if (this.field1149 - var5 > var6) {
            var6 = this.field1149 - var5;
        }
        if (arg0 > var6) {
            arg0 = var6;
        }
        this.field1154 = arg0;
        this.field1145 = arg1;
        this.field1146 = arg2;
        this.field1156 = (arg1 - this.field1147) / arg0;
        this.field1152 = (var4 - this.field1148) / arg0;
        this.field1157 = (var5 - this.field1149) / arg0;
    }

    @ObfuscatedName("ba.ak(I)V")
    public synchronized void method1104(int arg0) {
        if (arg0 == 0) {
            this.method1194(0);
            this.method3375();
        } else if (this.field1148 == 0 && this.field1149 == 0) {
            this.field1154 = 0;
            this.field1145 = 0;
            this.field1147 = 0;
            this.method3375();
        } else {
            int var2 = -this.field1147;
            if (this.field1147 > var2) {
                var2 = this.field1147;
            }
            if (-this.field1148 > var2) {
                var2 = -this.field1148;
            }
            if (this.field1148 > var2) {
                var2 = this.field1148;
            }
            if (-this.field1149 > var2) {
                var2 = -this.field1149;
            }
            if (this.field1149 > var2) {
                var2 = this.field1149;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field1154 = arg0;
            this.field1145 = Integer.MIN_VALUE;
            this.field1156 = -this.field1147 / arg0;
            this.field1152 = -this.field1148 / arg0;
            this.field1157 = -this.field1149 / arg0;
        }
    }

    @ObfuscatedName("ba.ah(I)V")
    public synchronized void method1105(int arg0) {
        if (this.field1144 < 0) {
            this.field1144 = -arg0;
        } else {
            this.field1144 = arg0;
        }
    }

    @ObfuscatedName("ba.aw()I")
    public synchronized int method1135() {
        return this.field1144 < 0 ? -this.field1144 : this.field1144;
    }

    @ObfuscatedName("ba.aa()Z")
    public boolean method1215() {
        return this.field1150 < 0 || this.field1150 >= ((class57) this.field1160).field1129.length << 8;
    }

    @ObfuscatedName("ba.au()Z")
    public boolean method1168() {
        return this.field1154 != 0;
    }

    @ObfuscatedName("ba.c()Lbc;")
    public class61 method953() {
        return null;
    }

    @ObfuscatedName("ba.x()Lbc;")
    public class61 method954() {
        return null;
    }

    @ObfuscatedName("ba.f()I")
    public int method955() {
        return this.field1145 == 0 && this.field1154 == 0 ? 0 : 1;
    }

    @ObfuscatedName("ba.t([III)V")
    public synchronized void method978(int[] arg0, int arg1, int arg2) {
        if (this.field1145 == 0 && this.field1154 == 0) {
            this.method958(arg2);
            return;
        }
        class57 var4 = (class57) this.field1160;
        int var5 = this.field1151 << 8;
        int var6 = this.field1143 << 8;
        int var7 = var4.field1129.length << 8;
        int var8 = var6 - var5;
        if (var8 <= 0) {
            this.field1153 = 0;
        }
        int var9 = arg1;
        int var10 = arg1 + arg2;
        if (this.field1150 < 0) {
            if (this.field1144 <= 0) {
                this.method1091();
                this.method3375();
                return;
            }
            this.field1150 = 0;
        }
        if (this.field1150 >= var7) {
            if (this.field1144 >= 0) {
                this.method1091();
                this.method3375();
                return;
            }
            this.field1150 = var7 - 1;
        }
        if (this.field1153 >= 0) {
            if (this.field1153 > 0) {
                if (this.field1155) {
                    label131: {
                        if (this.field1144 < 0) {
                            var9 = this.method1130(arg0, arg1, var5, var10, var4.field1129[this.field1151]);
                            if (this.field1150 >= var5) {
                                return;
                            }
                            this.field1150 = var5 + var5 - 1 - this.field1150;
                            this.field1144 = -this.field1144;
                            if (--this.field1153 == 0) {
                                break label131;
                            }
                        }
                        do {
                            var9 = this.method1110(arg0, var9, var6, var10, var4.field1129[this.field1143 - 1]);
                            if (this.field1150 < var6) {
                                return;
                            }
                            this.field1150 = var6 + var6 - 1 - this.field1150;
                            this.field1144 = -this.field1144;
                            if (--this.field1153 == 0) {
                                break;
                            }
                            var9 = this.method1130(arg0, var9, var5, var10, var4.field1129[this.field1151]);
                            if (this.field1150 >= var5) {
                                return;
                            }
                            this.field1150 = var5 + var5 - 1 - this.field1150;
                            this.field1144 = -this.field1144;
                        } while (--this.field1153 != 0);
                    }
                } else if (this.field1144 < 0) {
                    while (true) {
                        var9 = this.method1130(arg0, var9, var5, var10, var4.field1129[this.field1143 - 1]);
                        if (this.field1150 >= var5) {
                            return;
                        }
                        int var12 = (var6 - 1 - this.field1150) / var8;
                        if (var12 >= this.field1153) {
                            this.field1150 += this.field1153 * var8;
                            this.field1153 = 0;
                            break;
                        }
                        this.field1150 += var8 * var12;
                        this.field1153 -= var12;
                    }
                } else {
                    while (true) {
                        var9 = this.method1110(arg0, var9, var6, var10, var4.field1129[this.field1151]);
                        if (this.field1150 < var6) {
                            return;
                        }
                        int var13 = (this.field1150 - var5) / var8;
                        if (var13 >= this.field1153) {
                            this.field1150 -= this.field1153 * var8;
                            this.field1153 = 0;
                            break;
                        }
                        this.field1150 -= var8 * var13;
                        this.field1153 -= var13;
                    }
                }
            }
            if (this.field1144 < 0) {
                this.method1130(arg0, var9, 0, var10, 0);
                if (this.field1150 < 0) {
                    this.field1150 = -1;
                    this.method1091();
                    this.method3375();
                }
            } else {
                this.method1110(arg0, var9, var7, var10, 0);
                if (this.field1150 >= var7) {
                    this.field1150 = var7;
                    this.method1091();
                    this.method3375();
                }
            }
        } else if (this.field1155) {
            if (this.field1144 < 0) {
                var9 = this.method1130(arg0, arg1, var5, var10, var4.field1129[this.field1151]);
                if (this.field1150 >= var5) {
                    return;
                }
                this.field1150 = var5 + var5 - 1 - this.field1150;
                this.field1144 = -this.field1144;
            }
            while (true) {
                int var11 = this.method1110(arg0, var9, var6, var10, var4.field1129[this.field1143 - 1]);
                if (this.field1150 < var6) {
                    return;
                }
                this.field1150 = var6 + var6 - 1 - this.field1150;
                this.field1144 = -this.field1144;
                var9 = this.method1130(arg0, var11, var5, var10, var4.field1129[this.field1151]);
                if (this.field1150 >= var5) {
                    return;
                }
                this.field1150 = var5 + var5 - 1 - this.field1150;
                this.field1144 = -this.field1144;
            }
        } else if (this.field1144 < 0) {
            while (true) {
                var9 = this.method1130(arg0, var9, var5, var10, var4.field1129[this.field1143 - 1]);
                if (this.field1150 >= var5) {
                    return;
                }
                this.field1150 = var6 - 1 - (var6 - 1 - this.field1150) % var8;
            }
        } else {
            while (true) {
                var9 = this.method1110(arg0, var9, var6, var10, var4.field1129[this.field1151]);
                if (this.field1150 < var6) {
                    return;
                }
                this.field1150 = (this.field1150 - var5) % var8 + var5;
            }
        }
    }

    @ObfuscatedName("ba.p(I)V")
    public synchronized void method958(int arg0) {
        if (this.field1154 > 0) {
            if (arg0 >= this.field1154) {
                if (this.field1145 == Integer.MIN_VALUE) {
                    this.field1145 = 0;
                    this.field1149 = 0;
                    this.field1148 = 0;
                    this.field1147 = 0;
                    this.method3375();
                    arg0 = this.field1154;
                }
                this.field1154 = 0;
                this.method1090();
            } else {
                this.field1147 += this.field1156 * arg0;
                this.field1148 += this.field1152 * arg0;
                this.field1149 += this.field1157 * arg0;
                this.field1154 -= arg0;
            }
        }
        class57 var2 = (class57) this.field1160;
        int var3 = this.field1151 << 8;
        int var4 = this.field1143 << 8;
        int var5 = var2.field1129.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field1153 = 0;
        }
        if (this.field1150 < 0) {
            if (this.field1144 <= 0) {
                this.method1091();
                this.method3375();
                return;
            }
            this.field1150 = 0;
        }
        if (this.field1150 >= var5) {
            if (this.field1144 >= 0) {
                this.method1091();
                this.method3375();
                return;
            }
            this.field1150 = var5 - 1;
        }
        this.field1150 += this.field1144 * arg0;
        if (this.field1153 >= 0) {
            if (this.field1153 > 0) {
                if (this.field1155) {
                    label121: {
                        if (this.field1144 < 0) {
                            if (this.field1150 >= var3) {
                                return;
                            }
                            this.field1150 = var3 + var3 - 1 - this.field1150;
                            this.field1144 = -this.field1144;
                            if (--this.field1153 == 0) {
                                break label121;
                            }
                        }
                        do {
                            if (this.field1150 < var4) {
                                return;
                            }
                            this.field1150 = var4 + var4 - 1 - this.field1150;
                            this.field1144 = -this.field1144;
                            if (--this.field1153 == 0) {
                                break;
                            }
                            if (this.field1150 >= var3) {
                                return;
                            }
                            this.field1150 = var3 + var3 - 1 - this.field1150;
                            this.field1144 = -this.field1144;
                        } while (--this.field1153 != 0);
                    }
                } else {
                    label153: {
                        if (this.field1144 < 0) {
                            if (this.field1150 >= var3) {
                                return;
                            }
                            int var7 = (var4 - 1 - this.field1150) / var6;
                            if (var7 >= this.field1153) {
                                this.field1150 += this.field1153 * var6;
                                this.field1153 = 0;
                                break label153;
                            }
                            this.field1150 += var6 * var7;
                            this.field1153 -= var7;
                        } else if (this.field1150 >= var4) {
                            int var8 = (this.field1150 - var3) / var6;
                            if (var8 >= this.field1153) {
                                this.field1150 -= this.field1153 * var6;
                                this.field1153 = 0;
                                break label153;
                            }
                            this.field1150 -= var6 * var8;
                            this.field1153 -= var8;
                        } else {
                            return;
                        }
                        return;
                    }
                }
            }
            if (this.field1144 < 0) {
                if (this.field1150 < 0) {
                    this.field1150 = -1;
                    this.method1091();
                    this.method3375();
                }
            } else if (this.field1150 >= var5) {
                this.field1150 = var5;
                this.method1091();
                this.method3375();
            }
        } else if (this.field1155) {
            if (this.field1144 < 0) {
                if (this.field1150 >= var3) {
                    return;
                }
                this.field1150 = var3 + var3 - 1 - this.field1150;
                this.field1144 = -this.field1144;
            }
            while (this.field1150 >= var4) {
                this.field1150 = var4 + var4 - 1 - this.field1150;
                this.field1144 = -this.field1144;
                if (this.field1150 >= var3) {
                    return;
                }
                this.field1150 = var3 + var3 - 1 - this.field1150;
                this.field1144 = -this.field1144;
            }
        } else if (this.field1144 < 0) {
            if (this.field1150 >= var3) {
                return;
            }
            this.field1150 = var4 - 1 - (var4 - 1 - this.field1150) % var6;
        } else if (this.field1150 >= var4) {
            this.field1150 = (this.field1150 - var3) % var6 + var3;
        } else {
            return;
        }
    }

    @ObfuscatedName("ba.aq([IIIII)I")
    public int method1110(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1154 > 0) {
                int var6 = this.field1154 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1154 += arg1;
                if (this.field1144 == 256 && (this.field1150 & 0xFF) == 0) {
                    if (Statics.field2900) {
                        arg1 = method1122(0, ((class57) this.field1160).field1129, arg0, this.field1150, arg1, this.field1148, this.field1149, this.field1152, this.field1157, 0, var6, arg2, this);
                    } else {
                        arg1 = method1121(((class57) this.field1160).field1129, arg0, this.field1150, arg1, this.field1147, this.field1156, 0, var6, arg2, this);
                    }
                } else if (Statics.field2900) {
                    arg1 = method1109(0, 0, ((class57) this.field1160).field1129, arg0, this.field1150, arg1, this.field1148, this.field1149, this.field1152, this.field1157, 0, var6, arg2, this, this.field1144, arg4);
                } else {
                    arg1 = method1181(0, 0, ((class57) this.field1160).field1129, arg0, this.field1150, arg1, this.field1147, this.field1156, 0, var6, arg2, this, this.field1144, arg4);
                }
                this.field1154 -= arg1;
                if (this.field1154 != 0) {
                    return arg1;
                }
                if (!this.method1112()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1144 == 256 && (this.field1150 & 0xFF) == 0) {
                if (Statics.field2900) {
                    return method1148(0, ((class57) this.field1160).field1129, arg0, this.field1150, arg1, this.field1148, this.field1149, 0, arg3, arg2, this);
                }
                return method1113(((class57) this.field1160).field1129, arg0, this.field1150, arg1, this.field1147, 0, arg3, arg2, this);
            }
            if (Statics.field2900) {
                return method1118(0, 0, ((class57) this.field1160).field1129, arg0, this.field1150, arg1, this.field1148, this.field1149, 0, arg3, arg2, this, this.field1144, arg4);
            }
            return method1117(0, 0, ((class57) this.field1160).field1129, arg0, this.field1150, arg1, this.field1147, 0, arg3, arg2, this, this.field1144, arg4);
        }
    }

    @ObfuscatedName("ba.am([IIIII)I")
    public int method1130(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1154 > 0) {
                int var6 = this.field1154 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1154 += arg1;
                if (this.field1144 == -256 && (this.field1150 & 0xFF) == 0) {
                    if (Statics.field2900) {
                        arg1 = method1098(0, ((class57) this.field1160).field1129, arg0, this.field1150, arg1, this.field1148, this.field1149, this.field1152, this.field1157, 0, var6, arg2, this);
                    } else {
                        arg1 = method1123(((class57) this.field1160).field1129, arg0, this.field1150, arg1, this.field1147, this.field1156, 0, var6, arg2, this);
                    }
                } else if (Statics.field2900) {
                    arg1 = method1185(0, 0, ((class57) this.field1160).field1129, arg0, this.field1150, arg1, this.field1148, this.field1149, this.field1152, this.field1157, 0, var6, arg2, this, this.field1144, arg4);
                } else {
                    arg1 = method1126(0, 0, ((class57) this.field1160).field1129, arg0, this.field1150, arg1, this.field1147, this.field1156, 0, var6, arg2, this, this.field1144, arg4);
                }
                this.field1154 -= arg1;
                if (this.field1154 != 0) {
                    return arg1;
                }
                if (!this.method1112()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1144 == -256 && (this.field1150 & 0xFF) == 0) {
                if (Statics.field2900) {
                    return method1205(0, ((class57) this.field1160).field1129, arg0, this.field1150, arg1, this.field1148, this.field1149, 0, arg3, arg2, this);
                }
                return method1132(((class57) this.field1160).field1129, arg0, this.field1150, arg1, this.field1147, 0, arg3, arg2, this);
            }
            if (Statics.field2900) {
                return method1138(0, 0, ((class57) this.field1160).field1129, arg0, this.field1150, arg1, this.field1148, this.field1149, 0, arg3, arg2, this, this.field1144, arg4);
            }
            return method1231(0, 0, ((class57) this.field1160).field1129, arg0, this.field1150, arg1, this.field1147, 0, arg3, arg2, this, this.field1144, arg4);
        }
    }

    @ObfuscatedName("ba.ax()Z")
    public boolean method1112() {
        int var1 = this.field1145;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method1095(var1, this.field1146);
            var2 = method1116(var1, this.field1146);
        }
        if (this.field1147 != var1 || this.field1148 != var3 || this.field1149 != var2) {
            if (this.field1147 < var1) {
                this.field1156 = 1;
                this.field1154 = var1 - this.field1147;
            } else if (this.field1147 > var1) {
                this.field1156 = -1;
                this.field1154 = this.field1147 - var1;
            } else {
                this.field1156 = 0;
            }
            if (this.field1148 < var3) {
                this.field1152 = 1;
                if (this.field1154 == 0 || this.field1154 > var3 - this.field1148) {
                    this.field1154 = var3 - this.field1148;
                }
            } else if (this.field1148 > var3) {
                this.field1152 = -1;
                if (this.field1154 == 0 || this.field1154 > this.field1148 - var3) {
                    this.field1154 = this.field1148 - var3;
                }
            } else {
                this.field1152 = 0;
            }
            if (this.field1149 < var2) {
                this.field1157 = 1;
                if (this.field1154 == 0 || this.field1154 > var2 - this.field1149) {
                    this.field1154 = var2 - this.field1149;
                }
            } else if (this.field1149 > var2) {
                this.field1157 = -1;
                if (this.field1154 == 0 || this.field1154 > this.field1149 - var2) {
                    this.field1154 = this.field1149 - var2;
                }
            } else {
                this.field1157 = 0;
            }
            return false;
        } else if (this.field1145 == Integer.MIN_VALUE) {
            this.field1145 = 0;
            this.field1149 = 0;
            this.field1148 = 0;
            this.field1147 = 0;
            this.method3375();
            return true;
        } else {
            this.method1090();
            return false;
        }
    }

    @ObfuscatedName("ba.af([B[IIIIIIILba;)I")
    public static int method1113(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class59 arg8) {
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
        arg8.field1150 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("ba.av(I[B[IIIIIIIILba;)I")
    public static int method1148(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class59 arg10) {
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
        arg10.field1150 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("ba.ao([B[IIIIIIILba;)I")
    public static int method1132(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class59 arg8) {
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
        arg8.field1150 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("ba.al(I[B[IIIIIIIILba;)I")
    public static int method1205(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class59 arg10) {
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
        arg10.field1150 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("ba.aj(II[B[IIIIIIILba;II)I")
    public static int method1117(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class59 arg10, int arg11, int arg12) {
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
        arg10.field1150 = arg4;
        return arg5;
    }

    @ObfuscatedName("ba.ae(II[B[IIIIIIIILba;II)I")
    public static int method1118(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class59 arg11, int arg12, int arg13) {
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
        arg11.field1150 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("ba.ai(II[B[IIIIIIILba;II)I")
    public static int method1231(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class59 arg10, int arg11, int arg12) {
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
        arg10.field1150 = arg4;
        return arg5;
    }

    @ObfuscatedName("ba.ay(II[B[IIIIIIIILba;II)I")
    public static int method1138(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class59 arg11, int arg12, int arg13) {
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
        arg11.field1150 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("ba.ab([B[IIIIIIIILba;)I")
    public static int method1121(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class59 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field1148 += (var14 - arg3) * arg9.field1152;
        arg9.field1149 += (var14 - arg3) * arg9.field1157;
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
        arg9.field1147 = var12 >> 2;
        arg9.field1150 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("ba.ar(I[B[IIIIIIIIIILba;)I")
    public static int method1122(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class59 arg12) {
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
        arg12.field1147 += (var19 - arg4) * arg12.field1156;
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
        arg12.field1148 = var15 >> 2;
        arg12.field1149 = var16 >> 2;
        arg12.field1150 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("ba.as([B[IIIIIIIILba;)I")
    public static int method1123(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class59 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field1148 += (var14 - arg3) * arg9.field1152;
        arg9.field1149 += (var14 - arg3) * arg9.field1157;
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
        arg9.field1147 = var12 >> 2;
        arg9.field1150 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("ba.at(I[B[IIIIIIIIIILba;)I")
    public static int method1098(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class59 arg12) {
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
        arg12.field1147 += (var19 - arg4) * arg12.field1156;
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
        arg12.field1148 = var15 >> 2;
        arg12.field1149 = var16 >> 2;
        arg12.field1150 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("ba.ac(II[B[IIIIIIIILba;II)I")
    public static int method1181(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class59 arg11, int arg12, int arg13) {
        arg11.field1148 -= arg11.field1152 * arg5;
        arg11.field1149 -= arg11.field1157 * arg5;
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
        arg11.field1148 += arg11.field1152 * arg5;
        arg11.field1149 += arg11.field1157 * arg5;
        arg11.field1147 = arg6;
        arg11.field1150 = arg4;
        return arg5;
    }

    @ObfuscatedName("ba.ap(II[B[IIIIIIIIIILba;II)I")
    public static int method1109(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class59 arg13, int arg14, int arg15) {
        arg13.field1147 -= arg13.field1156 * arg5;
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
        arg13.field1147 += arg13.field1156 * var27;
        arg13.field1148 = arg6;
        arg13.field1149 = arg7;
        arg13.field1150 = arg4;
        return var27;
    }

    @ObfuscatedName("ba.bm(II[B[IIIIIIIILba;II)I")
    public static int method1126(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class59 arg11, int arg12, int arg13) {
        arg11.field1148 -= arg11.field1152 * arg5;
        arg11.field1149 -= arg11.field1157 * arg5;
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
        arg11.field1148 += arg11.field1152 * arg5;
        arg11.field1149 += arg11.field1157 * arg5;
        arg11.field1147 = arg6;
        arg11.field1150 = arg4;
        return arg5;
    }

    @ObfuscatedName("ba.bl(II[B[IIIIIIIIIILba;II)I")
    public static int method1185(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class59 arg13, int arg14, int arg15) {
        arg13.field1147 -= arg13.field1156 * arg5;
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
        arg13.field1147 += arg13.field1156 * var26;
        arg13.field1148 = arg6;
        arg13.field1149 = arg7;
        arg13.field1150 = arg4;
        return var26;
    }
}
