package deob;

@ObfuscatedName("ev")
public class class147 extends class348 {

    @ObfuscatedName("ev.v")
    public static class222 field1639 = new class222(64);

    @ObfuscatedName("ev.y")
    public static class222 field1640 = new class222(50);

    @ObfuscatedName("ev.j")
    public int field1641;

    @ObfuscatedName("ev.o")
    public String field1642 = class269.field3238;

    @ObfuscatedName("ev.m")
    public int field1666 = 1;

    @ObfuscatedName("ev.r")
    public int[] field1670;

    @ObfuscatedName("ev.h")
    public int[] field1645;

    @ObfuscatedName("ev.d")
    public int field1637 = -1;

    @ObfuscatedName("ev.z")
    public int field1647 = -1;

    @ObfuscatedName("ev.b")
    public int field1648 = -1;

    @ObfuscatedName("ev.i")
    public int field1649 = -1;

    @ObfuscatedName("ev.k")
    public int field1650 = -1;

    @ObfuscatedName("ev.g")
    public int field1651 = -1;

    @ObfuscatedName("ev.t")
    public int field1660 = -1;

    @ObfuscatedName("ev.x")
    public short[] field1653;

    @ObfuscatedName("ev.u")
    public short[] field1656;

    @ObfuscatedName("ev.q")
    public short[] field1655;

    @ObfuscatedName("ev.s")
    public short[] field1662;

    @ObfuscatedName("ev.p")
    public String[] field1657 = new String[5];

    @ObfuscatedName("ev.c")
    public boolean field1658 = true;

    @ObfuscatedName("ev.n")
    public int field1659 = -1;

    @ObfuscatedName("ev.l")
    public int field1654 = 128;

    @ObfuscatedName("ev.w")
    public int field1661 = 128;

    @ObfuscatedName("ev.a")
    public boolean field1668 = false;

    @ObfuscatedName("ev.aw")
    public int field1663 = 0;

    @ObfuscatedName("ev.ak")
    public int field1664 = 0;

    @ObfuscatedName("ev.ad")
    public int field1665 = -1;

    @ObfuscatedName("ev.at")
    public int field1674 = 32;

    @ObfuscatedName("ev.ah")
    public int[] field1667;

    @ObfuscatedName("ev.az")
    public int field1643 = -1;

    @ObfuscatedName("ev.ap")
    public int field1669 = -1;

    @ObfuscatedName("ev.ag")
    public boolean field1644 = true;

    @ObfuscatedName("ev.ab")
    public boolean field1671 = true;

    @ObfuscatedName("ev.aq")
    public boolean field1672 = false;

    @ObfuscatedName("ev.ae")
    public class362 field1638;

    @ObfuscatedName("ia.f(IB)Lev;")
    public static class147 method4374(int arg0) {
        class147 var1 = (class147) field1639.method3987((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1652.method4504(9, arg0);
        class147 var3 = new class147();
        var3.field1641 = arg0;
        if (var2 != null) {
            var3.method2535(new class384(var2));
        }
        var3.method2534();
        field1639.method3988(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ev.e(I)V")
    public void method2534() {
    }

    @ObfuscatedName("ev.v(Lnt;B)V")
    public void method2535(class384 arg0) {
        while (true) {
            int var2 = arg0.method5902();
            if (var2 == 0) {
                return;
            }
            this.method2552(arg0, var2);
        }
    }

    @ObfuscatedName("ev.y(Lnt;IB)V")
    public void method2552(class384 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method5902();
            this.field1670 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1670[var4] = arg0.method5899();
            }
        } else if (arg1 == 2) {
            this.field1642 = arg0.method5906();
        } else if (arg1 == 12) {
            this.field1666 = arg0.method5902();
        } else if (arg1 == 13) {
            this.field1637 = arg0.method5899();
        } else if (arg1 == 14) {
            this.field1649 = arg0.method5899();
        } else if (arg1 == 15) {
            this.field1647 = arg0.method5899();
        } else if (arg1 == 16) {
            this.field1648 = arg0.method5899();
        } else if (arg1 == 17) {
            this.field1649 = arg0.method5899();
            this.field1650 = arg0.method5899();
            this.field1651 = arg0.method5899();
            this.field1660 = arg0.method5899();
        } else if (arg1 == 18) {
            arg0.method5899();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field1657[arg1 - 30] = arg0.method5906();
            if (this.field1657[arg1 - 30].equalsIgnoreCase(class269.field3233)) {
                this.field1657[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method5902();
            this.field1653 = new short[var5];
            this.field1656 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1653[var6] = (short) arg0.method5899();
                this.field1656[var6] = (short) arg0.method5899();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method5902();
            this.field1655 = new short[var7];
            this.field1662 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field1655[var8] = (short) arg0.method5899();
                this.field1662[var8] = (short) arg0.method5899();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method5902();
            this.field1645 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field1645[var10] = arg0.method5899();
            }
        } else if (arg1 == 93) {
            this.field1658 = false;
        } else if (arg1 == 95) {
            this.field1659 = arg0.method5899();
        } else if (arg1 == 97) {
            this.field1654 = arg0.method5899();
        } else if (arg1 == 98) {
            this.field1661 = arg0.method5899();
        } else if (arg1 == 99) {
            this.field1668 = true;
        } else if (arg1 == 100) {
            this.field1663 = arg0.method5968();
        } else if (arg1 == 101) {
            this.field1664 = arg0.method5968();
        } else if (arg1 == 102) {
            this.field1665 = arg0.method5899();
        } else if (arg1 == 103) {
            this.field1674 = arg0.method5899();
        } else if (arg1 == 106 || arg1 == 118) {
            this.field1643 = arg0.method5899();
            if (this.field1643 == 65535) {
                this.field1643 = -1;
            }
            this.field1669 = arg0.method5899();
            if (this.field1669 == 65535) {
                this.field1669 = -1;
            }
            int var11 = -1;
            if (arg1 == 118) {
                var11 = arg0.method5899();
                if (var11 == 65535) {
                    var11 = -1;
                }
            }
            int var12 = arg0.method5902();
            this.field1667 = new int[var12 + 2];
            for (int var13 = 0; var13 <= var12; var13++) {
                this.field1667[var13] = arg0.method5899();
                if (this.field1667[var13] == 65535) {
                    this.field1667[var13] = -1;
                }
            }
            this.field1667[var12 + 1] = var11;
        } else if (arg1 == 107) {
            this.field1644 = false;
        } else if (arg1 == 109) {
            this.field1671 = false;
        } else if (arg1 == 111) {
            this.field1672 = true;
        } else if (arg1 == 249) {
            this.field1638 = class144.method181(arg0, this.field1638);
        }
    }

    @ObfuscatedName("ev.j(Lfm;ILfm;IB)Lgd;")
    public final class206 method2536(class158 arg0, int arg1, class158 arg2, int arg3) {
        if (this.field1667 != null) {
            class147 var5 = this.method2538();
            return var5 == null ? null : var5.method2536(arg0, arg1, arg2, arg3);
        }
        class206 var6 = (class206) field1640.method3987((long) this.field1641);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field1670.length; var8++) {
                if (!Statics.field1673.method4506(this.field1670[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class192[] var9 = new class192[this.field1670.length];
            for (int var10 = 0; var10 < this.field1670.length; var10++) {
                var9[var10] = class192.method3422(Statics.field1673, this.field1670[var10], 0);
            }
            class192 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class192(var9, var9.length);
            }
            if (this.field1653 != null) {
                for (int var12 = 0; var12 < this.field1653.length; var12++) {
                    var11.method3420(this.field1653[var12], this.field1656[var12]);
                }
            }
            if (this.field1655 != null) {
                for (int var13 = 0; var13 < this.field1655.length; var13++) {
                    var11.method3474(this.field1655[var13], this.field1662[var13]);
                }
            }
            var6 = var11.method3428(this.field1663 + 64, this.field1664 * 5 + 850, -30, -50, -30);
            field1640.method3988(var6, (long) this.field1641);
        }
        class206 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method2863(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method2858(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method3839(true);
        } else {
            var14 = arg2.method2858(var6, arg3);
        }
        if (this.field1654 != 128 || this.field1661 != 128) {
            var14.method3892(this.field1654, this.field1661, this.field1654);
        }
        return var14;
    }

    @ObfuscatedName("ev.o(I)Lga;")
    public final class192 method2537() {
        if (this.field1667 != null) {
            class147 var1 = this.method2538();
            return var1 == null ? null : var1.method2537();
        } else if (this.field1645 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field1645.length; var3++) {
                if (!Statics.field1673.method4506(this.field1645[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class192[] var4 = new class192[this.field1645.length];
            for (int var5 = 0; var5 < this.field1645.length; var5++) {
                var4[var5] = class192.method3422(Statics.field1673, this.field1645[var5], 0);
            }
            class192 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class192(var4, var4.length);
            }
            if (this.field1653 != null) {
                for (int var7 = 0; var7 < this.field1653.length; var7++) {
                    var6.method3420(this.field1653[var7], this.field1656[var7]);
                }
            }
            if (this.field1655 != null) {
                for (int var8 = 0; var8 < this.field1655.length; var8++) {
                    var6.method3474(this.field1655[var8], this.field1662[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("ev.m(I)Lev;")
    public final class147 method2538() {
        int var1 = -1;
        if (this.field1643 != -1) {
            var1 = class243.method1005(this.field1643);
        } else if (this.field1669 != -1) {
            var1 = class243.field2924[this.field1669];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field1667.length - 1) {
            var2 = this.field1667[var1];
        } else {
            var2 = this.field1667[this.field1667.length - 1];
        }
        return var2 == -1 ? null : method4374(var2);
    }

    @ObfuscatedName("ev.r(I)Z")
    public boolean method2539() {
        if (this.field1667 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field1643 != -1) {
            var1 = class243.method1005(this.field1643);
        } else if (this.field1669 != -1) {
            var1 = class243.field2924[this.field1669];
        }
        if (var1 >= 0 && var1 < this.field1667.length) {
            return this.field1667[var1] != -1;
        } else {
            return this.field1667[this.field1667.length - 1] != -1;
        }
    }

    @ObfuscatedName("ev.h(III)I")
    public int method2540(int arg0, int arg1) {
        class362 var3 = this.field1638;
        int var4;
        if (var3 == null) {
            var4 = arg1;
        } else {
            class352 var5 = (class352) var3.method5668((long) arg0);
            if (var5 == null) {
                var4 = arg1;
            } else {
                var4 = var5.field3934;
            }
        }
        return var4;
    }

    @ObfuscatedName("ev.d(ILjava/lang/String;I)Ljava/lang/String;")
    public String method2541(int arg0, String arg1) {
        return class144.method2439(this.field1638, arg0, arg1);
    }

    @ObfuscatedName("eg.z(I)V")
    public static void method2508() {
        field1639.method3989();
        field1640.method3989();
    }
}
