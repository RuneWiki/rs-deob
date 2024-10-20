package deob;

@ObfuscatedName("ew")
public class class139 extends class347 {

    @ObfuscatedName("ew.y")
    public static class221 field1551 = new class221(256);

    @ObfuscatedName("ew.p")
    public final int field1560;

    @ObfuscatedName("ew.j")
    public int field1555 = -1;

    @ObfuscatedName("ew.r")
    public int field1554 = -1;

    @ObfuscatedName("ew.b")
    public String field1557;

    @ObfuscatedName("ew.d")
    public int field1558;

    @ObfuscatedName("ew.s")
    public int field1552 = 0;

    @ObfuscatedName("ew.l")
    public boolean field1561 = true;

    @ObfuscatedName("ew.o")
    public boolean field1562 = false;

    @ObfuscatedName("ew.c")
    public String[] field1563 = new String[5];

    @ObfuscatedName("ew.e")
    public String field1564;

    @ObfuscatedName("ew.g")
    public int[] field1565;

    @ObfuscatedName("ew.a")
    public int field1566 = Integer.MAX_VALUE;

    @ObfuscatedName("ew.k")
    public int field1575 = Integer.MAX_VALUE;

    @ObfuscatedName("ew.m")
    public int field1568 = Integer.MIN_VALUE;

    @ObfuscatedName("ew.x")
    public int field1569 = Integer.MIN_VALUE;

    @ObfuscatedName("ew.z")
    public class145 field1570 = class145.field1624;

    @ObfuscatedName("ew.w")
    public class147 field1556 = class147.field1670;

    @ObfuscatedName("ew.t")
    public int[] field1572;

    @ObfuscatedName("ew.h")
    public byte[] field1573;

    @ObfuscatedName("ew.q")
    public int field1574 = -1;

    public class139(int arg0) {
        this.field1560 = arg0;
    }

    @ObfuscatedName("da.v(Ljv;Ljv;I)Z")
    public static boolean method2231(class275 arg0, class275 arg1) {
        Statics.field1571 = arg1;
        if (!arg0.method4504()) {
            return false;
        }
        Statics.field3783 = arg0.method4478(35);
        Statics.field1567 = new class139[Statics.field3783];
        for (int var2 = 0; var2 < Statics.field3783; var2++) {
            byte[] var3 = arg0.method4468(35, var2);
            Statics.field1567[var2] = new class139(var2);
            if (var3 != null) {
                Statics.field1567[var2].method2402(new class383(var3));
                Statics.field1567[var2].method2399();
            }
        }
        return true;
    }

    @ObfuscatedName("r.n(II)Lew;")
    public static class139 method52(int arg0) {
        return arg0 < 0 || arg0 >= Statics.field1567.length || Statics.field1567[arg0] == null ? new class139(arg0) : Statics.field1567[arg0];
    }

    @ObfuscatedName("ew.f(Lnd;I)V")
    public void method2402(class383 arg0) {
        while (true) {
            int var2 = arg0.method5965();
            if (var2 == 0) {
                return;
            }
            this.method2398(arg0, var2);
        }
    }

    @ObfuscatedName("ew.y(Lnd;II)V")
    public void method2398(class383 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1555 = arg0.method5982();
        } else if (arg1 == 2) {
            this.field1554 = arg0.method5982();
        } else if (arg1 == 3) {
            this.field1557 = arg0.method5974();
        } else if (arg1 == 4) {
            this.field1558 = arg0.method5969();
        } else if (arg1 == 5) {
            arg0.method5969();
        } else if (arg1 == 6) {
            this.field1552 = arg0.method5965();
        } else if (arg1 == 7) {
            int var3 = arg0.method5965();
            if ((var3 & 0x1) == 0) {
                this.field1561 = false;
            }
            if ((var3 & 0x2) == 2) {
                this.field1562 = true;
            }
        } else if (arg1 == 8) {
            arg0.method5965();
        } else if (arg1 >= 10 && arg1 <= 14) {
            this.field1563[arg1 - 10] = arg0.method5974();
        } else if (arg1 == 15) {
            int var4 = arg0.method5965();
            this.field1565 = new int[var4 * 2];
            for (int var5 = 0; var5 < var4 * 2; var5++) {
                this.field1565[var5] = arg0.method6102();
            }
            arg0.method5970();
            int var6 = arg0.method5965();
            this.field1572 = new int[var6];
            for (int var7 = 0; var7 < this.field1572.length; var7++) {
                this.field1572[var7] = arg0.method5970();
            }
            this.field1573 = new byte[var4];
            for (int var8 = 0; var8 < var4; var8++) {
                this.field1573[var8] = arg0.method5966();
            }
        } else if (arg1 != 16) {
            if (arg1 == 17) {
                this.field1564 = arg0.method5974();
            } else if (arg1 == 18) {
                arg0.method5982();
            } else if (arg1 == 19) {
                this.field1574 = arg0.method5967();
            } else if (arg1 == 21) {
                arg0.method5970();
            } else if (arg1 == 22) {
                arg0.method5970();
            } else if (arg1 == 23) {
                arg0.method5965();
                arg0.method5965();
                arg0.method5965();
            } else if (arg1 == 24) {
                arg0.method6102();
                arg0.method6102();
            } else if (arg1 == 25) {
                arg0.method5982();
            } else if (arg1 == 28) {
                arg0.method5965();
            } else if (arg1 == 29) {
                this.field1570 = (class145) class289.method2163(class145.method2862(), arg0.method5965());
            } else if (arg1 == 30) {
                this.field1556 = (class147) class289.method2163(class147.method1904(), arg0.method5965());
            }
        }
    }

    @ObfuscatedName("ew.p(I)V")
    public void method2399() {
        if (this.field1565 == null) {
            return;
        }
        for (int var1 = 0; var1 < this.field1565.length; var1 += 2) {
            if (this.field1565[var1] < this.field1566) {
                this.field1566 = this.field1565[var1];
            } else if (this.field1565[var1] > this.field1568) {
                this.field1568 = this.field1565[var1];
            }
            if (this.field1565[var1 + 1] < this.field1575) {
                this.field1575 = this.field1565[var1 + 1];
            } else if (this.field1565[var1 + 1] > this.field1569) {
                this.field1569 = this.field1565[var1 + 1];
            }
        }
    }

    @ObfuscatedName("ew.j(ZI)Loh;")
    public class396 method2400(boolean arg0) {
        int var2 = arg0 ? this.field1554 : this.field1555;
        return this.method2415(var2);
    }

    @ObfuscatedName("ew.r(II)Loh;")
    public class396 method2415(int arg0) {
        if (arg0 < 0) {
            return null;
        }
        class396 var2 = (class396) field1551.method3948((long) arg0);
        if (var2 != null) {
            return var2;
        }
        class396 var3 = class397.method3963(Statics.field1571, arg0, 0);
        if (var3 != null) {
            field1551.method3947(var3, (long) arg0);
        }
        return var3;
    }

    @ObfuscatedName("ew.b(I)I")
    public int method2401() {
        return this.field1560;
    }
}
