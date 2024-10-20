package deob;

@ObfuscatedName("bv")
public class class58 extends class59 {

    @ObfuscatedName("bv.f")
    public int field470;

    @ObfuscatedName("bv.e")
    public int field458;

    @ObfuscatedName("bv.v")
    public int field459;

    @ObfuscatedName("bv.y")
    public int field460;

    @ObfuscatedName("bv.j")
    public int field461;

    @ObfuscatedName("bv.o")
    public int field462;

    @ObfuscatedName("bv.m")
    public int field457;

    @ObfuscatedName("bv.r")
    public int field464;

    @ObfuscatedName("bv.h")
    public int field465;

    @ObfuscatedName("bv.d")
    public int field466;

    @ObfuscatedName("bv.z")
    public boolean field467;

    @ObfuscatedName("bv.b")
    public int field463;

    @ObfuscatedName("bv.i")
    public int field469;

    @ObfuscatedName("bv.k")
    public int field468;

    @ObfuscatedName("bv.g")
    public int field471;

    @ObfuscatedName("bv.f(II)I")
    public static int method852(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("bv.e(II)I")
    public static int method839(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("bv.ay()I")
    public int method754() {
        int var1 = this.field461 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field464 == 0) {
            var2 -= this.field470 * var2 / (((class51) this.field472).field380.length << 8);
        } else if (this.field464 >= 0) {
            var2 -= this.field465 * var2 / ((class51) this.field472).field380.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    public class58(class51 arg0, int arg1, int arg2) {
        this.field472 = arg0;
        this.field465 = arg0.field382;
        this.field466 = arg0.field384;
        this.field467 = arg0.field381;
        this.field458 = arg1;
        this.field459 = arg2;
        this.field460 = 8192;
        this.field470 = 0;
        this.method758();
    }

    public class58(class51 arg0, int arg1, int arg2, int arg3) {
        this.field472 = arg0;
        this.field465 = arg0.field382;
        this.field466 = arg0.field384;
        this.field467 = arg0.field381;
        this.field458 = arg1;
        this.field459 = arg2;
        this.field460 = arg3;
        this.field470 = 0;
        this.method758();
    }

    @ObfuscatedName("bv.v(Lar;II)Lbv;")
    public static class58 method871(class51 arg0, int arg1, int arg2) {
        return arg0.field380 == null || arg0.field380.length == 0 ? null : new class58(arg0, (int) ((long) arg0.field383 * 256L * (long) arg1 / (long) (Statics.field3922 * 100)), arg2 << 6);
    }

    @ObfuscatedName("bv.y(Lar;III)Lbv;")
    public static class58 method753(class51 arg0, int arg1, int arg2, int arg3) {
        return arg0.field380 == null || arg0.field380.length == 0 ? null : new class58(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("bv.j()V")
    public void method758() {
        this.field461 = this.field459;
        this.field462 = method852(this.field459, this.field460);
        this.field457 = method839(this.field459, this.field460);
    }

    @ObfuscatedName("bv.d(I)V")
    public synchronized void method875(int arg0) {
        this.field464 = arg0;
    }

    @ObfuscatedName("bv.b(I)V")
    public synchronized void method752(int arg0) {
        this.method762(arg0 << 6, this.method764());
    }

    @ObfuscatedName("bv.i(I)V")
    public synchronized void method800(int arg0) {
        this.method762(arg0, this.method764());
    }

    @ObfuscatedName("bv.k(II)V")
    public synchronized void method762(int arg0, int arg1) {
        this.field459 = arg0;
        this.field460 = arg1;
        this.field463 = 0;
        this.method758();
    }

    @ObfuscatedName("bv.g()I")
    public synchronized int method763() {
        return this.field459 == Integer.MIN_VALUE ? 0 : this.field459;
    }

    @ObfuscatedName("bv.t()I")
    public synchronized int method764() {
        return this.field460 < 0 ? -1 : this.field460;
    }

    @ObfuscatedName("bv.x(I)V")
    public synchronized void method765(int arg0) {
        int var2 = ((class51) this.field472).field380.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field470 = arg0;
    }

    @ObfuscatedName("bv.u(Z)V")
    public synchronized void method756(boolean arg0) {
        this.field458 = (this.field458 >>> 31) + (this.field458 ^ this.field458 >> 31);
        if (arg0) {
            this.field458 = -this.field458;
        }
    }

    @ObfuscatedName("bv.q()V")
    public void method760() {
        if (this.field463 == 0) {
            return;
        }
        if (this.field459 == Integer.MIN_VALUE) {
            this.field459 = 0;
        }
        this.field463 = 0;
        this.method758();
    }

    @ObfuscatedName("bv.s(II)V")
    public synchronized void method768(int arg0, int arg1) {
        this.method769(arg0, arg1, this.method764());
    }

    @ObfuscatedName("bv.p(III)V")
    public synchronized void method769(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method762(arg1, arg2);
            return;
        }
        int var4 = method852(arg1, arg2);
        int var5 = method839(arg1, arg2);
        if (this.field462 == var4 && this.field457 == var5) {
            this.field463 = 0;
            return;
        }
        int var6 = arg1 - this.field461;
        if (this.field461 - arg1 > var6) {
            var6 = this.field461 - arg1;
        }
        if (var4 - this.field462 > var6) {
            var6 = var4 - this.field462;
        }
        if (this.field462 - var4 > var6) {
            var6 = this.field462 - var4;
        }
        if (var5 - this.field457 > var6) {
            var6 = var5 - this.field457;
        }
        if (this.field457 - var5 > var6) {
            var6 = this.field457 - var5;
        }
        if (arg0 > var6) {
            arg0 = var6;
        }
        this.field463 = arg0;
        this.field459 = arg1;
        this.field460 = arg2;
        this.field469 = (arg1 - this.field461) / arg0;
        this.field468 = (var4 - this.field462) / arg0;
        this.field471 = (var5 - this.field457) / arg0;
    }

    @ObfuscatedName("bv.c(I)V")
    public synchronized void method770(int arg0) {
        if (arg0 == 0) {
            this.method800(0);
            this.method5407();
        } else if (this.field462 == 0 && this.field457 == 0) {
            this.field463 = 0;
            this.field459 = 0;
            this.field461 = 0;
            this.method5407();
        } else {
            int var2 = -this.field461;
            if (this.field461 > var2) {
                var2 = this.field461;
            }
            if (-this.field462 > var2) {
                var2 = -this.field462;
            }
            if (this.field462 > var2) {
                var2 = this.field462;
            }
            if (-this.field457 > var2) {
                var2 = -this.field457;
            }
            if (this.field457 > var2) {
                var2 = this.field457;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field463 = arg0;
            this.field459 = Integer.MIN_VALUE;
            this.field469 = -this.field461 / arg0;
            this.field468 = -this.field462 / arg0;
            this.field471 = -this.field457 / arg0;
        }
    }

    @ObfuscatedName("bv.n(I)V")
    public synchronized void method848(int arg0) {
        if (this.field458 < 0) {
            this.field458 = -arg0;
        } else {
            this.field458 = arg0;
        }
    }

    @ObfuscatedName("bv.l()I")
    public synchronized int method772() {
        return this.field458 < 0 ? -this.field458 : this.field458;
    }

    @ObfuscatedName("bv.w()Z")
    public boolean method861() {
        return this.field470 < 0 || this.field470 >= ((class51) this.field472).field380.length << 8;
    }

    @ObfuscatedName("bv.ae()Z")
    public boolean method774() {
        return this.field463 != 0;
    }

    @ObfuscatedName("bv.o()Lbc;")
    public class59 method594() {
        return null;
    }

    @ObfuscatedName("bv.m()Lbc;")
    public class59 method595() {
        return null;
    }

    @ObfuscatedName("bv.r()I")
    public int method596() {
        return this.field459 == 0 && this.field463 == 0 ? 0 : 1;
    }

    @ObfuscatedName("bv.h([III)V")
    public synchronized void method616(int[] arg0, int arg1, int arg2) {
        if (this.field459 == 0 && this.field463 == 0) {
            this.method599(arg2);
            return;
        }
        class51 var4 = (class51) this.field472;
        int var5 = this.field465 << 8;
        int var6 = this.field466 << 8;
        int var7 = var4.field380.length << 8;
        int var8 = var6 - var5;
        if (var8 <= 0) {
            this.field464 = 0;
        }
        int var9 = arg1;
        int var10 = arg1 + arg2;
        if (this.field470 < 0) {
            if (this.field458 <= 0) {
                this.method760();
                this.method5407();
                return;
            }
            this.field470 = 0;
        }
        if (this.field470 >= var7) {
            if (this.field458 >= 0) {
                this.method760();
                this.method5407();
                return;
            }
            this.field470 = var7 - 1;
        }
        if (this.field464 >= 0) {
            if (this.field464 > 0) {
                if (this.field467) {
                    label131: {
                        if (this.field458 < 0) {
                            var9 = this.method776(arg0, arg1, var5, var10, var4.field380[this.field465]);
                            if (this.field470 >= var5) {
                                return;
                            }
                            this.field470 = var5 + var5 - 1 - this.field470;
                            this.field458 = -this.field458;
                            if (--this.field464 == 0) {
                                break label131;
                            }
                        }
                        do {
                            var9 = this.method876(arg0, var9, var6, var10, var4.field380[this.field466 - 1]);
                            if (this.field470 < var6) {
                                return;
                            }
                            this.field470 = var6 + var6 - 1 - this.field470;
                            this.field458 = -this.field458;
                            if (--this.field464 == 0) {
                                break;
                            }
                            var9 = this.method776(arg0, var9, var5, var10, var4.field380[this.field465]);
                            if (this.field470 >= var5) {
                                return;
                            }
                            this.field470 = var5 + var5 - 1 - this.field470;
                            this.field458 = -this.field458;
                        } while (--this.field464 != 0);
                    }
                } else if (this.field458 < 0) {
                    while (true) {
                        var9 = this.method776(arg0, var9, var5, var10, var4.field380[this.field466 - 1]);
                        if (this.field470 >= var5) {
                            return;
                        }
                        int var12 = (var6 - 1 - this.field470) / var8;
                        if (var12 >= this.field464) {
                            this.field470 += this.field464 * var8;
                            this.field464 = 0;
                            break;
                        }
                        this.field470 += var8 * var12;
                        this.field464 -= var12;
                    }
                } else {
                    while (true) {
                        var9 = this.method876(arg0, var9, var6, var10, var4.field380[this.field465]);
                        if (this.field470 < var6) {
                            return;
                        }
                        int var13 = (this.field470 - var5) / var8;
                        if (var13 >= this.field464) {
                            this.field470 -= this.field464 * var8;
                            this.field464 = 0;
                            break;
                        }
                        this.field470 -= var8 * var13;
                        this.field464 -= var13;
                    }
                }
            }
            if (this.field458 < 0) {
                this.method776(arg0, var9, 0, var10, 0);
                if (this.field470 < 0) {
                    this.field470 = -1;
                    this.method760();
                    this.method5407();
                }
            } else {
                this.method876(arg0, var9, var7, var10, 0);
                if (this.field470 >= var7) {
                    this.field470 = var7;
                    this.method760();
                    this.method5407();
                }
            }
        } else if (this.field467) {
            if (this.field458 < 0) {
                var9 = this.method776(arg0, arg1, var5, var10, var4.field380[this.field465]);
                if (this.field470 >= var5) {
                    return;
                }
                this.field470 = var5 + var5 - 1 - this.field470;
                this.field458 = -this.field458;
            }
            while (true) {
                int var11 = this.method876(arg0, var9, var6, var10, var4.field380[this.field466 - 1]);
                if (this.field470 < var6) {
                    return;
                }
                this.field470 = var6 + var6 - 1 - this.field470;
                this.field458 = -this.field458;
                var9 = this.method776(arg0, var11, var5, var10, var4.field380[this.field465]);
                if (this.field470 >= var5) {
                    return;
                }
                this.field470 = var5 + var5 - 1 - this.field470;
                this.field458 = -this.field458;
            }
        } else if (this.field458 < 0) {
            while (true) {
                var9 = this.method776(arg0, var9, var5, var10, var4.field380[this.field466 - 1]);
                if (this.field470 >= var5) {
                    return;
                }
                this.field470 = var6 - 1 - (var6 - 1 - this.field470) % var8;
            }
        } else {
            while (true) {
                var9 = this.method876(arg0, var9, var6, var10, var4.field380[this.field465]);
                if (this.field470 < var6) {
                    return;
                }
                this.field470 = (this.field470 - var5) % var8 + var5;
            }
        }
    }

    @ObfuscatedName("bv.z(I)V")
    public synchronized void method599(int arg0) {
        if (this.field463 > 0) {
            if (arg0 >= this.field463) {
                if (this.field459 == Integer.MIN_VALUE) {
                    this.field459 = 0;
                    this.field457 = 0;
                    this.field462 = 0;
                    this.field461 = 0;
                    this.method5407();
                    arg0 = this.field463;
                }
                this.field463 = 0;
                this.method758();
            } else {
                this.field461 += this.field469 * arg0;
                this.field462 += this.field468 * arg0;
                this.field457 += this.field471 * arg0;
                this.field463 -= arg0;
            }
        }
        class51 var2 = (class51) this.field472;
        int var3 = this.field465 << 8;
        int var4 = this.field466 << 8;
        int var5 = var2.field380.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field464 = 0;
        }
        if (this.field470 < 0) {
            if (this.field458 <= 0) {
                this.method760();
                this.method5407();
                return;
            }
            this.field470 = 0;
        }
        if (this.field470 >= var5) {
            if (this.field458 >= 0) {
                this.method760();
                this.method5407();
                return;
            }
            this.field470 = var5 - 1;
        }
        this.field470 += this.field458 * arg0;
        if (this.field464 >= 0) {
            if (this.field464 > 0) {
                if (this.field467) {
                    label121: {
                        if (this.field458 < 0) {
                            if (this.field470 >= var3) {
                                return;
                            }
                            this.field470 = var3 + var3 - 1 - this.field470;
                            this.field458 = -this.field458;
                            if (--this.field464 == 0) {
                                break label121;
                            }
                        }
                        do {
                            if (this.field470 < var4) {
                                return;
                            }
                            this.field470 = var4 + var4 - 1 - this.field470;
                            this.field458 = -this.field458;
                            if (--this.field464 == 0) {
                                break;
                            }
                            if (this.field470 >= var3) {
                                return;
                            }
                            this.field470 = var3 + var3 - 1 - this.field470;
                            this.field458 = -this.field458;
                        } while (--this.field464 != 0);
                    }
                } else {
                    label153: {
                        if (this.field458 < 0) {
                            if (this.field470 >= var3) {
                                return;
                            }
                            int var7 = (var4 - 1 - this.field470) / var6;
                            if (var7 >= this.field464) {
                                this.field470 += this.field464 * var6;
                                this.field464 = 0;
                                break label153;
                            }
                            this.field470 += var6 * var7;
                            this.field464 -= var7;
                        } else if (this.field470 >= var4) {
                            int var8 = (this.field470 - var3) / var6;
                            if (var8 >= this.field464) {
                                this.field470 -= this.field464 * var6;
                                this.field464 = 0;
                                break label153;
                            }
                            this.field470 -= var6 * var8;
                            this.field464 -= var8;
                        } else {
                            return;
                        }
                        return;
                    }
                }
            }
            if (this.field458 < 0) {
                if (this.field470 < 0) {
                    this.field470 = -1;
                    this.method760();
                    this.method5407();
                }
            } else if (this.field470 >= var5) {
                this.field470 = var5;
                this.method760();
                this.method5407();
            }
        } else if (this.field467) {
            if (this.field458 < 0) {
                if (this.field470 >= var3) {
                    return;
                }
                this.field470 = var3 + var3 - 1 - this.field470;
                this.field458 = -this.field458;
            }
            while (this.field470 >= var4) {
                this.field470 = var4 + var4 - 1 - this.field470;
                this.field458 = -this.field458;
                if (this.field470 >= var3) {
                    return;
                }
                this.field470 = var3 + var3 - 1 - this.field470;
                this.field458 = -this.field458;
            }
        } else if (this.field458 < 0) {
            if (this.field470 >= var3) {
                return;
            }
            this.field470 = var4 - 1 - (var4 - 1 - this.field470) % var6;
        } else if (this.field470 >= var4) {
            this.field470 = (this.field470 - var3) % var6 + var3;
        } else {
            return;
        }
    }

    @ObfuscatedName("bv.ac([IIIII)I")
    public int method876(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field463 > 0) {
                int var6 = this.field463 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field463 += arg1;
                if (this.field458 == 256 && (this.field470 & 0xFF) == 0) {
                    if (Statics.field411) {
                        arg1 = method786(0, ((class51) this.field472).field380, arg0, this.field470, arg1, this.field462, this.field457, this.field468, this.field471, 0, var6, arg2, this);
                    } else {
                        arg1 = method785(((class51) this.field472).field380, arg0, this.field470, arg1, this.field461, this.field469, 0, var6, arg2, this);
                    }
                } else if (Statics.field411) {
                    arg1 = method790(0, 0, ((class51) this.field472).field380, arg0, this.field470, arg1, this.field462, this.field457, this.field468, this.field471, 0, var6, arg2, this, this.field458, arg4);
                } else {
                    arg1 = method775(0, 0, ((class51) this.field472).field380, arg0, this.field470, arg1, this.field461, this.field469, 0, var6, arg2, this, this.field458, arg4);
                }
                this.field463 -= arg1;
                if (this.field463 != 0) {
                    return arg1;
                }
                if (!this.method853()) {
                    continue;
                }
                return arg3;
            }
            if (this.field458 == 256 && (this.field470 & 0xFF) == 0) {
                if (Statics.field411) {
                    return method793(0, ((class51) this.field472).field380, arg0, this.field470, arg1, this.field462, this.field457, 0, arg3, arg2, this);
                }
                return method778(((class51) this.field472).field380, arg0, this.field470, arg1, this.field461, 0, arg3, arg2, this);
            }
            if (Statics.field411) {
                return method805(0, 0, ((class51) this.field472).field380, arg0, this.field470, arg1, this.field462, this.field457, 0, arg3, arg2, this, this.field458, arg4);
            }
            return method782(0, 0, ((class51) this.field472).field380, arg0, this.field470, arg1, this.field461, 0, arg3, arg2, this, this.field458, arg4);
        }
    }

    @ObfuscatedName("bv.as([IIIII)I")
    public int method776(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field463 > 0) {
                int var6 = this.field463 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field463 += arg1;
                if (this.field458 == -256 && (this.field470 & 0xFF) == 0) {
                    if (Statics.field411) {
                        arg1 = method788(0, ((class51) this.field472).field380, arg0, this.field470, arg1, this.field462, this.field457, this.field468, this.field471, 0, var6, arg2, this);
                    } else {
                        arg1 = method787(((class51) this.field472).field380, arg0, this.field470, arg1, this.field461, this.field469, 0, var6, arg2, this);
                    }
                } else if (Statics.field411) {
                    arg1 = method792(0, 0, ((class51) this.field472).field380, arg0, this.field470, arg1, this.field462, this.field457, this.field468, this.field471, 0, var6, arg2, this, this.field458, arg4);
                } else {
                    arg1 = method791(0, 0, ((class51) this.field472).field380, arg0, this.field470, arg1, this.field461, this.field469, 0, var6, arg2, this, this.field458, arg4);
                }
                this.field463 -= arg1;
                if (this.field463 != 0) {
                    return arg1;
                }
                if (!this.method853()) {
                    continue;
                }
                return arg3;
            }
            if (this.field458 == -256 && (this.field470 & 0xFF) == 0) {
                if (Statics.field411) {
                    return method781(0, ((class51) this.field472).field380, arg0, this.field470, arg1, this.field462, this.field457, 0, arg3, arg2, this);
                }
                return method780(((class51) this.field472).field380, arg0, this.field470, arg1, this.field461, 0, arg3, arg2, this);
            }
            if (Statics.field411) {
                return method784(0, 0, ((class51) this.field472).field380, arg0, this.field470, arg1, this.field462, this.field457, 0, arg3, arg2, this, this.field458, arg4);
            }
            return method783(0, 0, ((class51) this.field472).field380, arg0, this.field470, arg1, this.field461, 0, arg3, arg2, this, this.field458, arg4);
        }
    }

    @ObfuscatedName("bv.au()Z")
    public boolean method853() {
        int var1 = this.field459;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method852(var1, this.field460);
            var2 = method839(var1, this.field460);
        }
        if (this.field461 != var1 || this.field462 != var3 || this.field457 != var2) {
            if (this.field461 < var1) {
                this.field469 = 1;
                this.field463 = var1 - this.field461;
            } else if (this.field461 > var1) {
                this.field469 = -1;
                this.field463 = this.field461 - var1;
            } else {
                this.field469 = 0;
            }
            if (this.field462 < var3) {
                this.field468 = 1;
                if (this.field463 == 0 || this.field463 > var3 - this.field462) {
                    this.field463 = var3 - this.field462;
                }
            } else if (this.field462 > var3) {
                this.field468 = -1;
                if (this.field463 == 0 || this.field463 > this.field462 - var3) {
                    this.field463 = this.field462 - var3;
                }
            } else {
                this.field468 = 0;
            }
            if (this.field457 < var2) {
                this.field471 = 1;
                if (this.field463 == 0 || this.field463 > var2 - this.field457) {
                    this.field463 = var2 - this.field457;
                }
            } else if (this.field457 > var2) {
                this.field471 = -1;
                if (this.field463 == 0 || this.field463 > this.field457 - var2) {
                    this.field463 = this.field457 - var2;
                }
            } else {
                this.field471 = 0;
            }
            return false;
        } else if (this.field459 == Integer.MIN_VALUE) {
            this.field459 = 0;
            this.field457 = 0;
            this.field462 = 0;
            this.field461 = 0;
            this.method5407();
            return true;
        } else {
            this.method758();
            return false;
        }
    }

    @ObfuscatedName("bv.am([B[IIIIIIILbv;)I")
    public static int method778(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class58 arg8) {
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
        arg8.field470 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("bv.aa(I[B[IIIIIIIILbv;)I")
    public static int method793(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class58 arg10) {
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
        arg10.field470 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("bv.ai([B[IIIIIIILbv;)I")
    public static int method780(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class58 arg8) {
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
        arg8.field470 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("bv.av(I[B[IIIIIIIILbv;)I")
    public static int method781(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class58 arg10) {
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
        arg10.field470 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("bv.ax(II[B[IIIIIIILbv;II)I")
    public static int method782(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class58 arg10, int arg11, int arg12) {
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
        arg10.field470 = arg4;
        return arg5;
    }

    @ObfuscatedName("bv.ar(II[B[IIIIIIIILbv;II)I")
    public static int method805(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class58 arg11, int arg12, int arg13) {
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
        arg11.field470 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("bv.af(II[B[IIIIIIILbv;II)I")
    public static int method783(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class58 arg10, int arg11, int arg12) {
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
        arg10.field470 = arg4;
        return arg5;
    }

    @ObfuscatedName("bv.bq(II[B[IIIIIIIILbv;II)I")
    public static int method784(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class58 arg11, int arg12, int arg13) {
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
        arg11.field470 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("bv.bx([B[IIIIIIIILbv;)I")
    public static int method785(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class58 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field462 += (var14 - arg3) * arg9.field468;
        arg9.field457 += (var14 - arg3) * arg9.field471;
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
        arg9.field461 = var12 >> 2;
        arg9.field470 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("bv.bi(I[B[IIIIIIIIIILbv;)I")
    public static int method786(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class58 arg12) {
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
        arg12.field461 += (var19 - arg4) * arg12.field469;
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
        arg12.field462 = var15 >> 2;
        arg12.field457 = var16 >> 2;
        arg12.field470 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("bv.bz([B[IIIIIIIILbv;)I")
    public static int method787(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class58 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field462 += (var14 - arg3) * arg9.field468;
        arg9.field457 += (var14 - arg3) * arg9.field471;
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
        arg9.field461 = var12 >> 2;
        arg9.field470 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("bv.bb(I[B[IIIIIIIIIILbv;)I")
    public static int method788(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class58 arg12) {
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
        arg12.field461 += (var19 - arg4) * arg12.field469;
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
        arg12.field462 = var15 >> 2;
        arg12.field457 = var16 >> 2;
        arg12.field470 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("bv.bv(II[B[IIIIIIIILbv;II)I")
    public static int method775(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class58 arg11, int arg12, int arg13) {
        arg11.field462 -= arg11.field468 * arg5;
        arg11.field457 -= arg11.field471 * arg5;
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
        arg11.field462 += arg11.field468 * arg5;
        arg11.field457 += arg11.field471 * arg5;
        arg11.field461 = arg6;
        arg11.field470 = arg4;
        return arg5;
    }

    @ObfuscatedName("bv.bc(II[B[IIIIIIIIIILbv;II)I")
    public static int method790(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class58 arg13, int arg14, int arg15) {
        arg13.field461 -= arg13.field469 * arg5;
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
        arg13.field461 += arg13.field469 * var27;
        arg13.field462 = arg6;
        arg13.field457 = arg7;
        arg13.field470 = arg4;
        return var27;
    }

    @ObfuscatedName("bv.be(II[B[IIIIIIIILbv;II)I")
    public static int method791(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class58 arg11, int arg12, int arg13) {
        arg11.field462 -= arg11.field468 * arg5;
        arg11.field457 -= arg11.field471 * arg5;
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
        arg11.field462 += arg11.field468 * arg5;
        arg11.field457 += arg11.field471 * arg5;
        arg11.field461 = arg6;
        arg11.field470 = arg4;
        return arg5;
    }

    @ObfuscatedName("bv.ba(II[B[IIIIIIIIIILbv;II)I")
    public static int method792(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class58 arg13, int arg14, int arg15) {
        arg13.field461 -= arg13.field469 * arg5;
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
        arg13.field461 += arg13.field469 * var26;
        arg13.field462 = arg6;
        arg13.field457 = arg7;
        arg13.field470 = arg4;
        return var26;
    }
}
