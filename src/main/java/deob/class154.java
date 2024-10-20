package deob;

@ObfuscatedName("er")
public class class154 extends class364 {

    @ObfuscatedName("er.k")
    public static class236 field1622 = new class236(256);

    @ObfuscatedName("er.o")
    public final int field1623;

    @ObfuscatedName("er.g")
    public int field1624 = -1;

    @ObfuscatedName("er.z")
    public int field1625 = -1;

    @ObfuscatedName("er.a")
    public String field1640;

    @ObfuscatedName("er.u")
    public int field1626;

    @ObfuscatedName("er.e")
    public int field1628 = 0;

    @ObfuscatedName("er.y")
    public boolean field1629 = true;

    @ObfuscatedName("er.v")
    public boolean field1630 = false;

    @ObfuscatedName("er.f")
    public String[] field1631 = new String[5];

    @ObfuscatedName("er.s")
    public String field1620;

    @ObfuscatedName("er.h")
    public int[] field1633;

    @ObfuscatedName("er.d")
    public int field1634 = Integer.MAX_VALUE;

    @ObfuscatedName("er.q")
    public int field1639 = Integer.MAX_VALUE;

    @ObfuscatedName("er.j")
    public int field1636 = Integer.MIN_VALUE;

    @ObfuscatedName("er.x")
    public int field1637 = Integer.MIN_VALUE;

    @ObfuscatedName("er.b")
    public class160 field1635 = class160.field1699;

    @ObfuscatedName("er.t")
    public class162 field1627 = class162.field1743;

    @ObfuscatedName("er.r")
    public int[] field1641;

    @ObfuscatedName("er.p")
    public byte[] field1638;

    @ObfuscatedName("er.w")
    public int field1642 = -1;

    public class154(int arg0) {
        this.field1623 = arg0;
    }

    @ObfuscatedName("bz.n(Lkk;Lkk;B)Z")
    public static boolean method1921(class290 arg0, class290 arg1) {
        Statics.field1632 = arg1;
        if (!arg0.method4733()) {
            return false;
        }
        Statics.field4408 = arg0.method4720(35);
        Statics.field1621 = new class154[Statics.field4408];
        for (int var2 = 0; var2 < Statics.field4408; var2++) {
            byte[] var3 = arg0.method4710(35, var2);
            Statics.field1621[var2] = new class154(var2);
            if (var3 != null) {
                Statics.field1621[var2].method2608(new class400(var3));
                Statics.field1621[var2].method2612();
            }
        }
        return true;
    }

    @ObfuscatedName("bf.c(II)Ler;")
    public static class154 method1007(int arg0) {
        return arg0 < 0 || arg0 >= Statics.field1621.length || Statics.field1621[arg0] == null ? new class154(arg0) : Statics.field1621[arg0];
    }

    @ObfuscatedName("er.m(Lot;I)V")
    public void method2608(class400 arg0) {
        while (true) {
            int var2 = arg0.method6217();
            if (var2 == 0) {
                return;
            }
            this.method2595(arg0, var2);
        }
    }

    @ObfuscatedName("er.k(Lot;II)V")
    public void method2595(class400 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1624 = arg0.method6387();
        } else if (arg1 == 2) {
            this.field1625 = arg0.method6387();
        } else if (arg1 == 3) {
            this.field1640 = arg0.method6226();
        } else if (arg1 == 4) {
            this.field1626 = arg0.method6327();
        } else if (arg1 == 5) {
            arg0.method6327();
        } else if (arg1 == 6) {
            this.field1628 = arg0.method6217();
        } else if (arg1 == 7) {
            int var3 = arg0.method6217();
            if ((var3 & 0x1) == 0) {
                this.field1629 = false;
            }
            if ((var3 & 0x2) == 2) {
                this.field1630 = true;
            }
        } else if (arg1 == 8) {
            arg0.method6217();
        } else if (arg1 >= 10 && arg1 <= 14) {
            this.field1631[arg1 - 10] = arg0.method6226();
        } else if (arg1 == 15) {
            int var4 = arg0.method6217();
            this.field1633 = new int[var4 * 2];
            for (int var5 = 0; var5 < var4 * 2; var5++) {
                this.field1633[var5] = arg0.method6220();
            }
            arg0.method6222();
            int var6 = arg0.method6217();
            this.field1641 = new int[var6];
            for (int var7 = 0; var7 < this.field1641.length; var7++) {
                this.field1641[var7] = arg0.method6222();
            }
            this.field1638 = new byte[var4];
            for (int var8 = 0; var8 < var4; var8++) {
                this.field1638[var8] = arg0.method6218();
            }
        } else if (arg1 != 16) {
            if (arg1 == 17) {
                this.field1620 = arg0.method6226();
            } else if (arg1 == 18) {
                arg0.method6387();
            } else if (arg1 == 19) {
                this.field1642 = arg0.method6219();
            } else if (arg1 == 21) {
                arg0.method6222();
            } else if (arg1 == 22) {
                arg0.method6222();
            } else if (arg1 == 23) {
                arg0.method6217();
                arg0.method6217();
                arg0.method6217();
            } else if (arg1 == 24) {
                arg0.method6220();
                arg0.method6220();
            } else if (arg1 == 25) {
                arg0.method6387();
            } else if (arg1 == 28) {
                arg0.method6217();
            } else if (arg1 == 29) {
                class160[] var9 = new class160[] { class160.field1698, class160.field1699, class160.field1700 };
                this.field1635 = (class160) class304.method4518(var9, arg0.method6217());
            } else if (arg1 == 30) {
                this.field1627 = (class162) class304.method4518(class162.method2708(), arg0.method6217());
            }
        }
    }

    @ObfuscatedName("er.o(I)V")
    public void method2612() {
        if (this.field1633 == null) {
            return;
        }
        for (int var1 = 0; var1 < this.field1633.length; var1 += 2) {
            if (this.field1633[var1] < this.field1634) {
                this.field1634 = this.field1633[var1];
            } else if (this.field1633[var1] > this.field1636) {
                this.field1636 = this.field1633[var1];
            }
            if (this.field1633[var1 + 1] < this.field1639) {
                this.field1639 = this.field1633[var1 + 1];
            } else if (this.field1633[var1 + 1] > this.field1637) {
                this.field1637 = this.field1633[var1 + 1];
            }
        }
    }

    @ObfuscatedName("er.g(ZI)Loc;")
    public class413 method2602(boolean arg0) {
        int var2 = arg0 ? this.field1625 : this.field1624;
        return this.method2597(var2);
    }

    @ObfuscatedName("er.z(II)Loc;")
    public class413 method2597(int arg0) {
        if (arg0 < 0) {
            return null;
        }
        class413 var2 = (class413) field1622.method4167((long) arg0);
        if (var2 != null) {
            return var2;
        }
        class413 var3 = class414.method4473(Statics.field1632, arg0, 0);
        if (var3 != null) {
            field1622.method4169(var3, (long) arg0);
        }
        return var3;
    }

    @ObfuscatedName("er.a(I)I")
    public int method2598() {
        return this.field1623;
    }

    @ObfuscatedName("b.u(I)V")
    public static void method309() {
        field1622.method4168();
    }
}
