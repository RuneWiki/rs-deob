package deob;

@ObfuscatedName("bk")
public class class58 extends class59 {

    @ObfuscatedName("bk.f")
    public int field445;

    @ObfuscatedName("bk.o")
    public int field444;

    @ObfuscatedName("bk.u")
    public int field441;

    @ObfuscatedName("bk.p")
    public int field442;

    @ObfuscatedName("bk.b")
    public int field443;

    @ObfuscatedName("bk.e")
    public int field452;

    @ObfuscatedName("bk.k")
    public int field449;

    @ObfuscatedName("bk.g")
    public int field446;

    @ObfuscatedName("bk.h")
    public int field447;

    @ObfuscatedName("bk.n")
    public int field450;

    @ObfuscatedName("bk.l")
    public boolean field440;

    @ObfuscatedName("bk.m")
    public int field448;

    @ObfuscatedName("bk.d")
    public int field451;

    @ObfuscatedName("bk.c")
    public int field439;

    @ObfuscatedName("bk.j")
    public int field453;

    @ObfuscatedName("bk.f(II)I")
    public static int method699(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("bk.o(II)I")
    public static int method697(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("bk.af()I")
    public int method698() {
        int var1 = this.field443 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field446 == 0) {
            var2 -= this.field445 * var2 / (((class51) this.field454).field370.length << 8);
        } else if (this.field446 >= 0) {
            var2 -= this.field447 * var2 / ((class51) this.field454).field370.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    public class58(class51 arg0, int arg1, int arg2) {
        this.field454 = arg0;
        this.field447 = arg0.field372;
        this.field450 = arg0.field373;
        this.field440 = arg0.field371;
        this.field444 = arg1;
        this.field441 = arg2;
        this.field442 = 8192;
        this.field445 = 0;
        this.method702();
    }

    public class58(class51 arg0, int arg1, int arg2, int arg3) {
        this.field454 = arg0;
        this.field447 = arg0.field372;
        this.field450 = arg0.field373;
        this.field440 = arg0.field371;
        this.field444 = arg1;
        this.field441 = arg2;
        this.field442 = arg3;
        this.field445 = 0;
        this.method702();
    }

    @ObfuscatedName("bk.u(Lah;II)Lbk;")
    public static class58 method700(class51 arg0, int arg1, int arg2) {
        return arg0.field370 == null || arg0.field370.length == 0 ? null : new class58(arg0, (int) ((long) arg0.field374 * 256L * (long) arg1 / (long) (Statics.field395 * 100)), arg2 << 6);
    }

    @ObfuscatedName("bk.p(Lah;III)Lbk;")
    public static class58 method701(class51 arg0, int arg1, int arg2, int arg3) {
        return arg0.field370 == null || arg0.field370.length == 0 ? null : new class58(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("bk.b()V")
    public void method702() {
        this.field443 = this.field441;
        this.field452 = method699(this.field441, this.field442);
        this.field449 = method697(this.field441, this.field442);
    }

    @ObfuscatedName("bk.n(I)V")
    public synchronized void method703(int arg0) {
        this.field446 = arg0;
    }

    @ObfuscatedName("bk.m(I)V")
    public synchronized void method704(int arg0) {
        this.method719(arg0 << 6, this.method708());
    }

    @ObfuscatedName("bk.d(I)V")
    public synchronized void method737(int arg0) {
        this.method719(arg0, this.method708());
    }

    @ObfuscatedName("bk.c(II)V")
    public synchronized void method719(int arg0, int arg1) {
        this.field441 = arg0;
        this.field442 = arg1;
        this.field448 = 0;
        this.method702();
    }

    @ObfuscatedName("bk.j()I")
    public synchronized int method707() {
        return this.field441 == Integer.MIN_VALUE ? 0 : this.field441;
    }

    @ObfuscatedName("bk.r()I")
    public synchronized int method708() {
        return this.field442 < 0 ? -1 : this.field442;
    }

    @ObfuscatedName("bk.q(I)V")
    public synchronized void method709(int arg0) {
        int var2 = ((class51) this.field454).field370.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field445 = arg0;
    }

    @ObfuscatedName("bk.t(Z)V")
    public synchronized void method710(boolean arg0) {
        this.field444 = (this.field444 >>> 31) + (this.field444 ^ this.field444 >> 31);
        if (arg0) {
            this.field444 = -this.field444;
        }
    }

    @ObfuscatedName("bk.v()V")
    public void method711() {
        if (this.field448 == 0) {
            return;
        }
        if (this.field441 == Integer.MIN_VALUE) {
            this.field441 = 0;
        }
        this.field448 = 0;
        this.method702();
    }

    @ObfuscatedName("bk.x(II)V")
    public synchronized void method712(int arg0, int arg1) {
        this.method713(arg0, arg1, this.method708());
    }

    @ObfuscatedName("bk.z(III)V")
    public synchronized void method713(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method719(arg1, arg2);
            return;
        }
        int var4 = method699(arg1, arg2);
        int var5 = method697(arg1, arg2);
        if (this.field452 == var4 && this.field449 == var5) {
            this.field448 = 0;
            return;
        }
        int var6 = arg1 - this.field443;
        if (this.field443 - arg1 > var6) {
            var6 = this.field443 - arg1;
        }
        if (var4 - this.field452 > var6) {
            var6 = var4 - this.field452;
        }
        if (this.field452 - var4 > var6) {
            var6 = this.field452 - var4;
        }
        if (var5 - this.field449 > var6) {
            var6 = var5 - this.field449;
        }
        if (this.field449 - var5 > var6) {
            var6 = this.field449 - var5;
        }
        if (arg0 > var6) {
            arg0 = var6;
        }
        this.field448 = arg0;
        this.field441 = arg1;
        this.field442 = arg2;
        this.field451 = (arg1 - this.field443) / arg0;
        this.field439 = (var4 - this.field452) / arg0;
        this.field453 = (var5 - this.field449) / arg0;
    }

    @ObfuscatedName("bk.at(I)V")
    public synchronized void method720(int arg0) {
        if (arg0 == 0) {
            this.method737(0);
            this.method5354();
        } else if (this.field452 == 0 && this.field449 == 0) {
            this.field448 = 0;
            this.field441 = 0;
            this.field443 = 0;
            this.method5354();
        } else {
            int var2 = -this.field443;
            if (this.field443 > var2) {
                var2 = this.field443;
            }
            if (-this.field452 > var2) {
                var2 = -this.field452;
            }
            if (this.field452 > var2) {
                var2 = this.field452;
            }
            if (-this.field449 > var2) {
                var2 = -this.field449;
            }
            if (this.field449 > var2) {
                var2 = this.field449;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field448 = arg0;
            this.field441 = Integer.MIN_VALUE;
            this.field451 = -this.field443 / arg0;
            this.field439 = -this.field452 / arg0;
            this.field453 = -this.field449 / arg0;
        }
    }

    @ObfuscatedName("bk.aj(I)V")
    public synchronized void method715(int arg0) {
        if (this.field444 < 0) {
            this.field444 = -arg0;
        } else {
            this.field444 = arg0;
        }
    }

    @ObfuscatedName("bk.ax()I")
    public synchronized int method772() {
        return this.field444 < 0 ? -this.field444 : this.field444;
    }

    @ObfuscatedName("bk.as()Z")
    public boolean method765() {
        return this.field445 < 0 || this.field445 >= ((class51) this.field454).field370.length << 8;
    }

    @ObfuscatedName("bk.ad()Z")
    public boolean method741() {
        return this.field448 != 0;
    }

    @ObfuscatedName("bk.e()Lbt;")
    public class59 method557() {
        return null;
    }

    @ObfuscatedName("bk.k()Lbt;")
    public class59 method558() {
        return null;
    }

    @ObfuscatedName("bk.g()I")
    public int method575() {
        return this.field441 == 0 && this.field448 == 0 ? 0 : 1;
    }

    @ObfuscatedName("bk.h([III)V")
    public synchronized void method585(int[] arg0, int arg1, int arg2) {
        if (this.field441 == 0 && this.field448 == 0) {
            this.method560(arg2);
            return;
        }
        class51 var4 = (class51) this.field454;
        int var5 = this.field447 << 8;
        int var6 = this.field450 << 8;
        int var7 = var4.field370.length << 8;
        int var8 = var6 - var5;
        if (var8 <= 0) {
            this.field446 = 0;
        }
        int var9 = arg1;
        int var10 = arg1 + arg2;
        if (this.field445 < 0) {
            if (this.field444 <= 0) {
                this.method711();
                this.method5354();
                return;
            }
            this.field445 = 0;
        }
        if (this.field445 >= var7) {
            if (this.field444 >= 0) {
                this.method711();
                this.method5354();
                return;
            }
            this.field445 = var7 - 1;
        }
        if (this.field446 >= 0) {
            if (this.field446 > 0) {
                if (this.field440) {
                    label131: {
                        if (this.field444 < 0) {
                            var9 = this.method722(arg0, arg1, var5, var10, var4.field370[this.field447]);
                            if (this.field445 >= var5) {
                                return;
                            }
                            this.field445 = var5 + var5 - 1 - this.field445;
                            this.field444 = -this.field444;
                            if (--this.field446 == 0) {
                                break label131;
                            }
                        }
                        do {
                            var9 = this.method721(arg0, var9, var6, var10, var4.field370[this.field450 - 1]);
                            if (this.field445 < var6) {
                                return;
                            }
                            this.field445 = var6 + var6 - 1 - this.field445;
                            this.field444 = -this.field444;
                            if (--this.field446 == 0) {
                                break;
                            }
                            var9 = this.method722(arg0, var9, var5, var10, var4.field370[this.field447]);
                            if (this.field445 >= var5) {
                                return;
                            }
                            this.field445 = var5 + var5 - 1 - this.field445;
                            this.field444 = -this.field444;
                        } while (--this.field446 != 0);
                    }
                } else if (this.field444 < 0) {
                    while (true) {
                        var9 = this.method722(arg0, var9, var5, var10, var4.field370[this.field450 - 1]);
                        if (this.field445 >= var5) {
                            return;
                        }
                        int var12 = (var6 - 1 - this.field445) / var8;
                        if (var12 >= this.field446) {
                            this.field445 += this.field446 * var8;
                            this.field446 = 0;
                            break;
                        }
                        this.field445 += var8 * var12;
                        this.field446 -= var12;
                    }
                } else {
                    while (true) {
                        var9 = this.method721(arg0, var9, var6, var10, var4.field370[this.field447]);
                        if (this.field445 < var6) {
                            return;
                        }
                        int var13 = (this.field445 - var5) / var8;
                        if (var13 >= this.field446) {
                            this.field445 -= this.field446 * var8;
                            this.field446 = 0;
                            break;
                        }
                        this.field445 -= var8 * var13;
                        this.field446 -= var13;
                    }
                }
            }
            if (this.field444 < 0) {
                this.method722(arg0, var9, 0, var10, 0);
                if (this.field445 < 0) {
                    this.field445 = -1;
                    this.method711();
                    this.method5354();
                }
            } else {
                this.method721(arg0, var9, var7, var10, 0);
                if (this.field445 >= var7) {
                    this.field445 = var7;
                    this.method711();
                    this.method5354();
                }
            }
        } else if (this.field440) {
            if (this.field444 < 0) {
                var9 = this.method722(arg0, arg1, var5, var10, var4.field370[this.field447]);
                if (this.field445 >= var5) {
                    return;
                }
                this.field445 = var5 + var5 - 1 - this.field445;
                this.field444 = -this.field444;
            }
            while (true) {
                int var11 = this.method721(arg0, var9, var6, var10, var4.field370[this.field450 - 1]);
                if (this.field445 < var6) {
                    return;
                }
                this.field445 = var6 + var6 - 1 - this.field445;
                this.field444 = -this.field444;
                var9 = this.method722(arg0, var11, var5, var10, var4.field370[this.field447]);
                if (this.field445 >= var5) {
                    return;
                }
                this.field445 = var5 + var5 - 1 - this.field445;
                this.field444 = -this.field444;
            }
        } else if (this.field444 < 0) {
            while (true) {
                var9 = this.method722(arg0, var9, var5, var10, var4.field370[this.field450 - 1]);
                if (this.field445 >= var5) {
                    return;
                }
                this.field445 = var6 - 1 - (var6 - 1 - this.field445) % var8;
            }
        } else {
            while (true) {
                var9 = this.method721(arg0, var9, var6, var10, var4.field370[this.field447]);
                if (this.field445 < var6) {
                    return;
                }
                this.field445 = (this.field445 - var5) % var8 + var5;
            }
        }
    }

    @ObfuscatedName("bk.l(I)V")
    public synchronized void method560(int arg0) {
        if (this.field448 > 0) {
            if (arg0 >= this.field448) {
                if (this.field441 == Integer.MIN_VALUE) {
                    this.field441 = 0;
                    this.field449 = 0;
                    this.field452 = 0;
                    this.field443 = 0;
                    this.method5354();
                    arg0 = this.field448;
                }
                this.field448 = 0;
                this.method702();
            } else {
                this.field443 += this.field451 * arg0;
                this.field452 += this.field439 * arg0;
                this.field449 += this.field453 * arg0;
                this.field448 -= arg0;
            }
        }
        class51 var2 = (class51) this.field454;
        int var3 = this.field447 << 8;
        int var4 = this.field450 << 8;
        int var5 = var2.field370.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field446 = 0;
        }
        if (this.field445 < 0) {
            if (this.field444 <= 0) {
                this.method711();
                this.method5354();
                return;
            }
            this.field445 = 0;
        }
        if (this.field445 >= var5) {
            if (this.field444 >= 0) {
                this.method711();
                this.method5354();
                return;
            }
            this.field445 = var5 - 1;
        }
        this.field445 += this.field444 * arg0;
        if (this.field446 >= 0) {
            if (this.field446 > 0) {
                if (this.field440) {
                    label121: {
                        if (this.field444 < 0) {
                            if (this.field445 >= var3) {
                                return;
                            }
                            this.field445 = var3 + var3 - 1 - this.field445;
                            this.field444 = -this.field444;
                            if (--this.field446 == 0) {
                                break label121;
                            }
                        }
                        do {
                            if (this.field445 < var4) {
                                return;
                            }
                            this.field445 = var4 + var4 - 1 - this.field445;
                            this.field444 = -this.field444;
                            if (--this.field446 == 0) {
                                break;
                            }
                            if (this.field445 >= var3) {
                                return;
                            }
                            this.field445 = var3 + var3 - 1 - this.field445;
                            this.field444 = -this.field444;
                        } while (--this.field446 != 0);
                    }
                } else {
                    label153: {
                        if (this.field444 < 0) {
                            if (this.field445 >= var3) {
                                return;
                            }
                            int var7 = (var4 - 1 - this.field445) / var6;
                            if (var7 >= this.field446) {
                                this.field445 += this.field446 * var6;
                                this.field446 = 0;
                                break label153;
                            }
                            this.field445 += var6 * var7;
                            this.field446 -= var7;
                        } else if (this.field445 >= var4) {
                            int var8 = (this.field445 - var3) / var6;
                            if (var8 >= this.field446) {
                                this.field445 -= this.field446 * var6;
                                this.field446 = 0;
                                break label153;
                            }
                            this.field445 -= var6 * var8;
                            this.field446 -= var8;
                        } else {
                            return;
                        }
                        return;
                    }
                }
            }
            if (this.field444 < 0) {
                if (this.field445 < 0) {
                    this.field445 = -1;
                    this.method711();
                    this.method5354();
                }
            } else if (this.field445 >= var5) {
                this.field445 = var5;
                this.method711();
                this.method5354();
            }
        } else if (this.field440) {
            if (this.field444 < 0) {
                if (this.field445 >= var3) {
                    return;
                }
                this.field445 = var3 + var3 - 1 - this.field445;
                this.field444 = -this.field444;
            }
            while (this.field445 >= var4) {
                this.field445 = var4 + var4 - 1 - this.field445;
                this.field444 = -this.field444;
                if (this.field445 >= var3) {
                    return;
                }
                this.field445 = var3 + var3 - 1 - this.field445;
                this.field444 = -this.field444;
            }
        } else if (this.field444 < 0) {
            if (this.field445 >= var3) {
                return;
            }
            this.field445 = var4 - 1 - (var4 - 1 - this.field445) % var6;
        } else if (this.field445 >= var4) {
            this.field445 = (this.field445 - var3) % var6 + var3;
        } else {
            return;
        }
    }

    @ObfuscatedName("bk.ao([IIIII)I")
    public int method721(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field448 > 0) {
                int var6 = this.field448 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field448 += arg1;
                if (this.field444 == 256 && (this.field445 & 0xFF) == 0) {
                    if (Statics.field388) {
                        arg1 = method733(0, ((class51) this.field454).field370, arg0, this.field445, arg1, this.field452, this.field449, this.field439, this.field453, 0, var6, arg2, this);
                    } else {
                        arg1 = method732(((class51) this.field454).field370, arg0, this.field445, arg1, this.field443, this.field451, 0, var6, arg2, this);
                    }
                } else if (Statics.field388) {
                    arg1 = method795(0, 0, ((class51) this.field454).field370, arg0, this.field445, arg1, this.field452, this.field449, this.field439, this.field453, 0, var6, arg2, this, this.field444, arg4);
                } else {
                    arg1 = method736(0, 0, ((class51) this.field454).field370, arg0, this.field445, arg1, this.field443, this.field451, 0, var6, arg2, this, this.field444, arg4);
                }
                this.field448 -= arg1;
                if (this.field448 != 0) {
                    return arg1;
                }
                if (!this.method723()) {
                    continue;
                }
                return arg3;
            }
            if (this.field444 == 256 && (this.field445 & 0xFF) == 0) {
                if (Statics.field388) {
                    return method725(0, ((class51) this.field454).field370, arg0, this.field445, arg1, this.field452, this.field449, 0, arg3, arg2, this);
                }
                return method724(((class51) this.field454).field370, arg0, this.field445, arg1, this.field443, 0, arg3, arg2, this);
            }
            if (Statics.field388) {
                return method729(0, 0, ((class51) this.field454).field370, arg0, this.field445, arg1, this.field452, this.field449, 0, arg3, arg2, this, this.field444, arg4);
            }
            return method728(0, 0, ((class51) this.field454).field370, arg0, this.field445, arg1, this.field443, 0, arg3, arg2, this, this.field444, arg4);
        }
    }

    @ObfuscatedName("bk.ai([IIIII)I")
    public int method722(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field448 > 0) {
                int var6 = this.field448 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field448 += arg1;
                if (this.field444 == -256 && (this.field445 & 0xFF) == 0) {
                    if (Statics.field388) {
                        arg1 = method735(0, ((class51) this.field454).field370, arg0, this.field445, arg1, this.field452, this.field449, this.field439, this.field453, 0, var6, arg2, this);
                    } else {
                        arg1 = method814(((class51) this.field454).field370, arg0, this.field445, arg1, this.field443, this.field451, 0, var6, arg2, this);
                    }
                } else if (Statics.field388) {
                    arg1 = method739(0, 0, ((class51) this.field454).field370, arg0, this.field445, arg1, this.field452, this.field449, this.field439, this.field453, 0, var6, arg2, this, this.field444, arg4);
                } else {
                    arg1 = method738(0, 0, ((class51) this.field454).field370, arg0, this.field445, arg1, this.field443, this.field451, 0, var6, arg2, this, this.field444, arg4);
                }
                this.field448 -= arg1;
                if (this.field448 != 0) {
                    return arg1;
                }
                if (!this.method723()) {
                    continue;
                }
                return arg3;
            }
            if (this.field444 == -256 && (this.field445 & 0xFF) == 0) {
                if (Statics.field388) {
                    return method759(0, ((class51) this.field454).field370, arg0, this.field445, arg1, this.field452, this.field449, 0, arg3, arg2, this);
                }
                return method726(((class51) this.field454).field370, arg0, this.field445, arg1, this.field443, 0, arg3, arg2, this);
            }
            if (Statics.field388) {
                return method731(0, 0, ((class51) this.field454).field370, arg0, this.field445, arg1, this.field452, this.field449, 0, arg3, arg2, this, this.field444, arg4);
            }
            return method696(0, 0, ((class51) this.field454).field370, arg0, this.field445, arg1, this.field443, 0, arg3, arg2, this, this.field444, arg4);
        }
    }

    @ObfuscatedName("bk.av()Z")
    public boolean method723() {
        int var1 = this.field441;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method699(var1, this.field442);
            var2 = method697(var1, this.field442);
        }
        if (this.field443 != var1 || this.field452 != var3 || this.field449 != var2) {
            if (this.field443 < var1) {
                this.field451 = 1;
                this.field448 = var1 - this.field443;
            } else if (this.field443 > var1) {
                this.field451 = -1;
                this.field448 = this.field443 - var1;
            } else {
                this.field451 = 0;
            }
            if (this.field452 < var3) {
                this.field439 = 1;
                if (this.field448 == 0 || this.field448 > var3 - this.field452) {
                    this.field448 = var3 - this.field452;
                }
            } else if (this.field452 > var3) {
                this.field439 = -1;
                if (this.field448 == 0 || this.field448 > this.field452 - var3) {
                    this.field448 = this.field452 - var3;
                }
            } else {
                this.field439 = 0;
            }
            if (this.field449 < var2) {
                this.field453 = 1;
                if (this.field448 == 0 || this.field448 > var2 - this.field449) {
                    this.field448 = var2 - this.field449;
                }
            } else if (this.field449 > var2) {
                this.field453 = -1;
                if (this.field448 == 0 || this.field448 > this.field449 - var2) {
                    this.field448 = this.field449 - var2;
                }
            } else {
                this.field453 = 0;
            }
            return false;
        } else if (this.field441 == Integer.MIN_VALUE) {
            this.field441 = 0;
            this.field449 = 0;
            this.field452 = 0;
            this.field443 = 0;
            this.method5354();
            return true;
        } else {
            this.method702();
            return false;
        }
    }

    @ObfuscatedName("bk.az([B[IIIIIIILbk;)I")
    public static int method724(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class58 arg8) {
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
        arg8.field445 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("bk.au(I[B[IIIIIIIILbk;)I")
    public static int method725(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class58 arg10) {
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
        arg10.field445 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("bk.ab([B[IIIIIIILbk;)I")
    public static int method726(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class58 arg8) {
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
        arg8.field445 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("bk.aa(I[B[IIIIIIIILbk;)I")
    public static int method759(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class58 arg10) {
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
        arg10.field445 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("bk.al(II[B[IIIIIIILbk;II)I")
    public static int method728(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class58 arg10, int arg11, int arg12) {
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
        arg10.field445 = arg4;
        return arg5;
    }

    @ObfuscatedName("bk.ar(II[B[IIIIIIIILbk;II)I")
    public static int method729(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class58 arg11, int arg12, int arg13) {
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
        arg11.field445 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("bk.ak(II[B[IIIIIIILbk;II)I")
    public static int method696(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class58 arg10, int arg11, int arg12) {
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
        arg10.field445 = arg4;
        return arg5;
    }

    @ObfuscatedName("bk.an(II[B[IIIIIIIILbk;II)I")
    public static int method731(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class58 arg11, int arg12, int arg13) {
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
        arg11.field445 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("bk.ah([B[IIIIIIIILbk;)I")
    public static int method732(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class58 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field452 += (var14 - arg3) * arg9.field439;
        arg9.field449 += (var14 - arg3) * arg9.field453;
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
        arg9.field443 = var12 >> 2;
        arg9.field445 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("bk.ae(I[B[IIIIIIIIIILbk;)I")
    public static int method733(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class58 arg12) {
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
        arg12.field443 += (var19 - arg4) * arg12.field451;
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
        arg12.field452 = var15 >> 2;
        arg12.field449 = var16 >> 2;
        arg12.field445 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("bk.bh([B[IIIIIIIILbk;)I")
    public static int method814(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class58 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field452 += (var14 - arg3) * arg9.field439;
        arg9.field449 += (var14 - arg3) * arg9.field453;
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
        arg9.field443 = var12 >> 2;
        arg9.field445 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("bk.br(I[B[IIIIIIIIIILbk;)I")
    public static int method735(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class58 arg12) {
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
        arg12.field443 += (var19 - arg4) * arg12.field451;
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
        arg12.field452 = var15 >> 2;
        arg12.field449 = var16 >> 2;
        arg12.field445 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("bk.bn(II[B[IIIIIIIILbk;II)I")
    public static int method736(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class58 arg11, int arg12, int arg13) {
        arg11.field452 -= arg11.field439 * arg5;
        arg11.field449 -= arg11.field453 * arg5;
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
        arg11.field452 += arg11.field439 * arg5;
        arg11.field449 += arg11.field453 * arg5;
        arg11.field443 = arg6;
        arg11.field445 = arg4;
        return arg5;
    }

    @ObfuscatedName("bk.bi(II[B[IIIIIIIIIILbk;II)I")
    public static int method795(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class58 arg13, int arg14, int arg15) {
        arg13.field443 -= arg13.field451 * arg5;
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
        arg13.field443 += arg13.field451 * var27;
        arg13.field452 = arg6;
        arg13.field449 = arg7;
        arg13.field445 = arg4;
        return var27;
    }

    @ObfuscatedName("bk.bb(II[B[IIIIIIIILbk;II)I")
    public static int method738(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class58 arg11, int arg12, int arg13) {
        arg11.field452 -= arg11.field439 * arg5;
        arg11.field449 -= arg11.field453 * arg5;
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
        arg11.field452 += arg11.field439 * arg5;
        arg11.field449 += arg11.field453 * arg5;
        arg11.field443 = arg6;
        arg11.field445 = arg4;
        return arg5;
    }

    @ObfuscatedName("bk.bk(II[B[IIIIIIIIIILbk;II)I")
    public static int method739(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class58 arg13, int arg14, int arg15) {
        arg13.field443 -= arg13.field451 * arg5;
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
        arg13.field443 += arg13.field451 * var26;
        arg13.field452 = arg6;
        arg13.field449 = arg7;
        arg13.field445 = arg4;
        return var26;
    }
}
