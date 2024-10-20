package deob;

@ObfuscatedName("ef")
public class class146 extends class347 {

    @ObfuscatedName("ef.f")
    public static class221 field1662 = new class221(64);

    @ObfuscatedName("ef.y")
    public static class221 field1654 = new class221(50);

    @ObfuscatedName("ef.p")
    public int field1635;

    @ObfuscatedName("ef.j")
    public String field1636 = class268.field3242;

    @ObfuscatedName("ef.r")
    public int field1637 = 1;

    @ObfuscatedName("ef.b")
    public int[] field1644;

    @ObfuscatedName("ef.d")
    public int[] field1639;

    @ObfuscatedName("ef.s")
    public int field1653 = -1;

    @ObfuscatedName("ef.u")
    public int field1641 = -1;

    @ObfuscatedName("ef.l")
    public int field1652 = -1;

    @ObfuscatedName("ef.o")
    public int field1643 = -1;

    @ObfuscatedName("ef.c")
    public int field1648 = -1;

    @ObfuscatedName("ef.e")
    public int field1645 = -1;

    @ObfuscatedName("ef.g")
    public int field1646 = -1;

    @ObfuscatedName("ef.a")
    public short[] field1647;

    @ObfuscatedName("ef.k")
    public short[] field1642;

    @ObfuscatedName("ef.m")
    public short[] field1638;

    @ObfuscatedName("ef.x")
    public short[] field1650;

    @ObfuscatedName("ef.z")
    public String[] field1651 = new String[5];

    @ObfuscatedName("ef.w")
    public boolean field1661 = true;

    @ObfuscatedName("ef.t")
    public int field1631 = -1;

    @ObfuscatedName("ef.h")
    public int field1633 = 128;

    @ObfuscatedName("ef.q")
    public int field1655 = 128;

    @ObfuscatedName("ef.i")
    public boolean field1649 = false;

    @ObfuscatedName("ef.ae")
    public int field1657 = 0;

    @ObfuscatedName("ef.ap")
    public int field1658 = 0;

    @ObfuscatedName("ef.ab")
    public int field1659 = -1;

    @ObfuscatedName("ef.al")
    public int field1660 = 32;

    @ObfuscatedName("ef.ad")
    public int[] field1640;

    @ObfuscatedName("ef.ai")
    public int field1632 = -1;

    @ObfuscatedName("ef.ar")
    public int field1663 = -1;

    @ObfuscatedName("ef.ag")
    public boolean field1664 = true;

    @ObfuscatedName("ef.ax")
    public boolean field1665 = true;

    @ObfuscatedName("ef.as")
    public boolean field1666 = false;

    @ObfuscatedName("ef.aj")
    public class361 field1667;

    @ObfuscatedName("ei.v(II)Lef;")
    public static class146 method2653(int arg0) {
        class146 var1 = (class146) field1662.method3948((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1668.method4468(9, arg0);
        class146 var3 = new class146();
        var3.field1635 = arg0;
        if (var2 != null) {
            var3.method2552(new class383(var2));
        }
        var3.method2527();
        field1662.method3947(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ef.n(I)V")
    public void method2527() {
    }

    @ObfuscatedName("ef.f(Lnd;I)V")
    public void method2552(class383 arg0) {
        while (true) {
            int var2 = arg0.method5965();
            if (var2 == 0) {
                return;
            }
            this.method2529(arg0, var2);
        }
    }

    @ObfuscatedName("ef.y(Lnd;IB)V")
    public void method2529(class383 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method5965();
            this.field1644 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1644[var4] = arg0.method5967();
            }
        } else if (arg1 == 2) {
            this.field1636 = arg0.method5974();
        } else if (arg1 == 12) {
            this.field1637 = arg0.method5965();
        } else if (arg1 == 13) {
            this.field1653 = arg0.method5967();
        } else if (arg1 == 14) {
            this.field1643 = arg0.method5967();
        } else if (arg1 == 15) {
            this.field1641 = arg0.method5967();
        } else if (arg1 == 16) {
            this.field1652 = arg0.method5967();
        } else if (arg1 == 17) {
            this.field1643 = arg0.method5967();
            this.field1648 = arg0.method5967();
            this.field1645 = arg0.method5967();
            this.field1646 = arg0.method5967();
        } else if (arg1 == 18) {
            arg0.method5967();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field1651[arg1 - 30] = arg0.method5974();
            if (this.field1651[arg1 - 30].equalsIgnoreCase(class268.field3237)) {
                this.field1651[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method5965();
            this.field1647 = new short[var5];
            this.field1642 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1647[var6] = (short) arg0.method5967();
                this.field1642[var6] = (short) arg0.method5967();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method5965();
            this.field1638 = new short[var7];
            this.field1650 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field1638[var8] = (short) arg0.method5967();
                this.field1650[var8] = (short) arg0.method5967();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method5965();
            this.field1639 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field1639[var10] = arg0.method5967();
            }
        } else if (arg1 == 93) {
            this.field1661 = false;
        } else if (arg1 == 95) {
            this.field1631 = arg0.method5967();
        } else if (arg1 == 97) {
            this.field1633 = arg0.method5967();
        } else if (arg1 == 98) {
            this.field1655 = arg0.method5967();
        } else if (arg1 == 99) {
            this.field1649 = true;
        } else if (arg1 == 100) {
            this.field1657 = arg0.method5966();
        } else if (arg1 == 101) {
            this.field1658 = arg0.method5966();
        } else if (arg1 == 102) {
            this.field1659 = arg0.method5967();
        } else if (arg1 == 103) {
            this.field1660 = arg0.method5967();
        } else if (arg1 == 106 || arg1 == 118) {
            this.field1632 = arg0.method5967();
            if (this.field1632 == 65535) {
                this.field1632 = -1;
            }
            this.field1663 = arg0.method5967();
            if (this.field1663 == 65535) {
                this.field1663 = -1;
            }
            int var11 = -1;
            if (arg1 == 118) {
                var11 = arg0.method5967();
                if (var11 == 65535) {
                    var11 = -1;
                }
            }
            int var12 = arg0.method5965();
            this.field1640 = new int[var12 + 2];
            for (int var13 = 0; var13 <= var12; var13++) {
                this.field1640[var13] = arg0.method5967();
                if (this.field1640[var13] == 65535) {
                    this.field1640[var13] = -1;
                }
            }
            this.field1640[var12 + 1] = var11;
        } else if (arg1 == 107) {
            this.field1664 = false;
        } else if (arg1 == 109) {
            this.field1665 = false;
        } else if (arg1 == 111) {
            this.field1666 = true;
        } else if (arg1 == 249) {
            this.field1667 = class143.method4696(arg0, this.field1667);
        }
    }

    @ObfuscatedName("ef.p(Lfl;ILfl;II)Lgr;")
    public final class205 method2530(class157 arg0, int arg1, class157 arg2, int arg3) {
        if (this.field1640 != null) {
            class146 var5 = this.method2532();
            return var5 == null ? null : var5.method2530(arg0, arg1, arg2, arg3);
        }
        class205 var6 = (class205) field1654.method3948((long) this.field1635);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field1644.length; var8++) {
                if (!Statics.field1656.method4470(this.field1644[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class191[] var9 = new class191[this.field1644.length];
            for (int var10 = 0; var10 < this.field1644.length; var10++) {
                var9[var10] = class191.method3418(Statics.field1656, this.field1644[var10], 0);
            }
            class191 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class191(var9, var9.length);
            }
            if (this.field1647 != null) {
                for (int var12 = 0; var12 < this.field1647.length; var12++) {
                    var11.method3414(this.field1647[var12], this.field1642[var12]);
                }
            }
            if (this.field1638 != null) {
                for (int var13 = 0; var13 < this.field1638.length; var13++) {
                    var11.method3412(this.field1638[var13], this.field1650[var13]);
                }
            }
            var6 = var11.method3421(this.field1657 + 64, this.field1658 * 5 + 850, -30, -50, -30);
            field1654.method3947(var6, (long) this.field1635);
        }
        class205 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method2902(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method2869(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method3787(true);
        } else {
            var14 = arg2.method2869(var6, arg3);
        }
        if (this.field1633 != 128 || this.field1655 != 128) {
            var14.method3803(this.field1633, this.field1655, this.field1633);
        }
        return var14;
    }

    @ObfuscatedName("ef.j(S)Lgm;")
    public final class191 method2531() {
        if (this.field1640 != null) {
            class146 var1 = this.method2532();
            return var1 == null ? null : var1.method2531();
        } else if (this.field1639 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field1639.length; var3++) {
                if (!Statics.field1656.method4470(this.field1639[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class191[] var4 = new class191[this.field1639.length];
            for (int var5 = 0; var5 < this.field1639.length; var5++) {
                var4[var5] = class191.method3418(Statics.field1656, this.field1639[var5], 0);
            }
            class191 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class191(var4, var4.length);
            }
            if (this.field1647 != null) {
                for (int var7 = 0; var7 < this.field1647.length; var7++) {
                    var6.method3414(this.field1647[var7], this.field1642[var7]);
                }
            }
            if (this.field1638 != null) {
                for (int var8 = 0; var8 < this.field1638.length; var8++) {
                    var6.method3412(this.field1638[var8], this.field1650[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("ef.r(B)Lef;")
    public final class146 method2532() {
        int var1 = -1;
        if (this.field1632 != -1) {
            var1 = class242.method3569(this.field1632);
        } else if (this.field1663 != -1) {
            var1 = class242.field2918[this.field1663];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field1640.length - 1) {
            var2 = this.field1640[var1];
        } else {
            var2 = this.field1640[this.field1640.length - 1];
        }
        return var2 == -1 ? null : method2653(var2);
    }

    @ObfuscatedName("ef.b(I)Z")
    public boolean method2533() {
        if (this.field1640 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field1632 != -1) {
            var1 = class242.method3569(this.field1632);
        } else if (this.field1663 != -1) {
            var1 = class242.field2918[this.field1663];
        }
        if (var1 >= 0 && var1 < this.field1640.length) {
            return this.field1640[var1] != -1;
        } else {
            return this.field1640[this.field1640.length - 1] != -1;
        }
    }

    @ObfuscatedName("ef.d(III)I")
    public int method2534(int arg0, int arg1) {
        return class143.method1790(this.field1667, arg0, arg1);
    }

    @ObfuscatedName("ef.s(ILjava/lang/String;I)Ljava/lang/String;")
    public String method2535(int arg0, String arg1) {
        return class143.method5166(this.field1667, arg0, arg1);
    }
}
