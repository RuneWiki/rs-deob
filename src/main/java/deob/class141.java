package deob;

@ObfuscatedName("ei")
public class class141 extends class349 {

    @ObfuscatedName("ei.j")
    public static class223 field1541 = new class223(256);

    @ObfuscatedName("ei.l")
    public final int field1534;

    @ObfuscatedName("ei.n")
    public int field1535 = -1;

    @ObfuscatedName("ei.w")
    public int field1536 = -1;

    @ObfuscatedName("ei.f")
    public String field1537;

    @ObfuscatedName("ei.o")
    public int field1548;

    @ObfuscatedName("ei.x")
    public int field1539 = 0;

    @ObfuscatedName("ei.p")
    public boolean field1530 = true;

    @ObfuscatedName("ei.h")
    public boolean field1542 = false;

    @ObfuscatedName("ei.k")
    public String[] field1533 = new String[5];

    @ObfuscatedName("ei.a")
    public String field1543;

    @ObfuscatedName("ei.q")
    public int[] field1531;

    @ObfuscatedName("ei.u")
    public int field1545 = Integer.MAX_VALUE;

    @ObfuscatedName("ei.e")
    public int field1546 = Integer.MAX_VALUE;

    @ObfuscatedName("ei.c")
    public int field1547 = Integer.MIN_VALUE;

    @ObfuscatedName("ei.i")
    public int field1538 = Integer.MIN_VALUE;

    @ObfuscatedName("ei.m")
    public class147 field1540 = class147.field1608;

    @ObfuscatedName("ei.b")
    public class149 field1550 = class149.field1654;

    @ObfuscatedName("ei.z")
    public int[] field1551;

    @ObfuscatedName("ei.d")
    public byte[] field1552;

    @ObfuscatedName("ei.y")
    public int field1553 = -1;

    public class141(int arg0) {
        this.field1534 = arg0;
    }

    @ObfuscatedName("nb.s(Ljy;Ljy;I)Z")
    public static boolean method5839(class277 arg0, class277 arg1) {
        Statics.field1549 = arg1;
        if (!arg0.method4464()) {
            return false;
        }
        Statics.field1532 = arg0.method4484(35);
        Statics.field1544 = new class141[Statics.field1532];
        for (int var2 = 0; var2 < Statics.field1532; var2++) {
            byte[] var3 = arg0.method4459(35, var2);
            Statics.field1544[var2] = new class141(var2);
            if (var3 != null) {
                Statics.field1544[var2].method2420(new class385(var3));
                Statics.field1544[var2].method2426();
            }
        }
        return true;
    }

    @ObfuscatedName("bz.t(II)Lei;")
    public static class141 method1794(int arg0) {
        return arg0 < 0 || arg0 >= Statics.field1544.length || Statics.field1544[arg0] == null ? new class141(arg0) : Statics.field1544[arg0];
    }

    @ObfuscatedName("ei.v(Lnv;I)V")
    public void method2420(class385 arg0) {
        while (true) {
            int var2 = arg0.method5958();
            if (var2 == 0) {
                return;
            }
            this.method2407(arg0, var2);
        }
    }

    @ObfuscatedName("ei.j(Lnv;II)V")
    public void method2407(class385 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1535 = arg0.method5975();
        } else if (arg1 == 2) {
            this.field1536 = arg0.method5975();
        } else if (arg1 == 3) {
            this.field1537 = arg0.method5967();
        } else if (arg1 == 4) {
            this.field1548 = arg0.method5962();
        } else if (arg1 == 5) {
            arg0.method5962();
        } else if (arg1 == 6) {
            this.field1539 = arg0.method5958();
        } else if (arg1 == 7) {
            int var3 = arg0.method5958();
            if ((var3 & 0x1) == 0) {
                this.field1530 = false;
            }
            if ((var3 & 0x2) == 2) {
                this.field1542 = true;
            }
        } else if (arg1 == 8) {
            arg0.method5958();
        } else if (arg1 >= 10 && arg1 <= 14) {
            this.field1533[arg1 - 10] = arg0.method5967();
        } else if (arg1 == 15) {
            int var4 = arg0.method5958();
            this.field1531 = new int[var4 * 2];
            for (int var5 = 0; var5 < var4 * 2; var5++) {
                this.field1531[var5] = arg0.method5961();
            }
            arg0.method6182();
            int var6 = arg0.method5958();
            this.field1551 = new int[var6];
            for (int var7 = 0; var7 < this.field1551.length; var7++) {
                this.field1551[var7] = arg0.method6182();
            }
            this.field1552 = new byte[var4];
            for (int var8 = 0; var8 < var4; var8++) {
                this.field1552[var8] = arg0.method5959();
            }
        } else if (arg1 != 16) {
            if (arg1 == 17) {
                this.field1543 = arg0.method5967();
            } else if (arg1 == 18) {
                arg0.method5975();
            } else if (arg1 == 19) {
                this.field1553 = arg0.method6053();
            } else if (arg1 == 21) {
                arg0.method6182();
            } else if (arg1 == 22) {
                arg0.method6182();
            } else if (arg1 == 23) {
                arg0.method5958();
                arg0.method5958();
                arg0.method5958();
            } else if (arg1 == 24) {
                arg0.method5961();
                arg0.method5961();
            } else if (arg1 == 25) {
                arg0.method5975();
            } else if (arg1 == 28) {
                arg0.method5958();
            } else if (arg1 == 29) {
                class147[] var9 = new class147[] { class147.field1608, class147.field1609, class147.field1613 };
                this.field1540 = (class147) class291.method4326(var9, arg0.method5958());
            } else if (arg1 == 30) {
                this.field1550 = (class149) class291.method4326(class149.method17(), arg0.method5958());
            }
        }
    }

    @ObfuscatedName("ei.l(I)V")
    public void method2426() {
        if (this.field1531 == null) {
            return;
        }
        for (int var1 = 0; var1 < this.field1531.length; var1 += 2) {
            if (this.field1531[var1] < this.field1545) {
                this.field1545 = this.field1531[var1];
            } else if (this.field1531[var1] > this.field1547) {
                this.field1547 = this.field1531[var1];
            }
            if (this.field1531[var1 + 1] < this.field1546) {
                this.field1546 = this.field1531[var1 + 1];
            } else if (this.field1531[var1 + 1] > this.field1538) {
                this.field1538 = this.field1531[var1 + 1];
            }
        }
    }

    @ObfuscatedName("ei.n(ZI)Lom;")
    public class398 method2411(boolean arg0) {
        int var2 = arg0 ? this.field1536 : this.field1535;
        return this.method2415(var2);
    }

    @ObfuscatedName("ei.w(IS)Lom;")
    public class398 method2415(int arg0) {
        if (arg0 < 0) {
            return null;
        }
        class398 var2 = (class398) field1541.method3927((long) arg0);
        if (var2 != null) {
            return var2;
        }
        class398 var3 = class399.method3879(Statics.field1549, arg0, 0);
        if (var3 != null) {
            field1541.method3929(var3, (long) arg0);
        }
        return var3;
    }

    @ObfuscatedName("ei.f(B)I")
    public int method2424() {
        return this.field1534;
    }

    @ObfuscatedName("ar.o(I)V")
    public static void method787() {
        field1541.method3930();
    }
}
