package deob;

@ObfuscatedName("ej")
public class class148 extends class349 {

    @ObfuscatedName("ej.v")
    public static class223 field1618 = new class223(64);

    @ObfuscatedName("ej.j")
    public static class223 field1621 = new class223(50);

    @ObfuscatedName("ej.l")
    public int field1627;

    @ObfuscatedName("ej.n")
    public String field1620 = class270.field3234;

    @ObfuscatedName("ej.w")
    public int field1622 = 1;

    @ObfuscatedName("ej.f")
    public int[] field1639;

    @ObfuscatedName("ej.o")
    public int[] field1619;

    @ObfuscatedName("ej.x")
    public int field1625 = -1;

    @ObfuscatedName("ej.r")
    public int field1626 = -1;

    @ObfuscatedName("ej.p")
    public int field1624 = -1;

    @ObfuscatedName("ej.h")
    public int field1628 = -1;

    @ObfuscatedName("ej.k")
    public int field1629 = -1;

    @ObfuscatedName("ej.a")
    public int field1630 = -1;

    @ObfuscatedName("ej.q")
    public int field1631 = -1;

    @ObfuscatedName("ej.u")
    public short[] field1632;

    @ObfuscatedName("ej.e")
    public short[] field1633;

    @ObfuscatedName("ej.c")
    public short[] field1634;

    @ObfuscatedName("ej.i")
    public short[] field1650;

    @ObfuscatedName("ej.m")
    public String[] field1636 = new String[5];

    @ObfuscatedName("ej.b")
    public boolean field1643 = true;

    @ObfuscatedName("ej.z")
    public int field1616 = -1;

    @ObfuscatedName("ej.d")
    public int field1642 = 128;

    @ObfuscatedName("ej.y")
    public int field1640 = 128;

    @ObfuscatedName("ej.g")
    public boolean field1641 = false;

    @ObfuscatedName("ej.ae")
    public int field1652 = 0;

    @ObfuscatedName("ej.an")
    public int field1638 = 0;

    @ObfuscatedName("ej.am")
    public int field1644 = -1;

    @ObfuscatedName("ej.al")
    public int field1645 = 32;

    @ObfuscatedName("ej.aq")
    public int[] field1646;

    @ObfuscatedName("ej.aa")
    public int field1635 = -1;

    @ObfuscatedName("ej.ab")
    public int field1648 = -1;

    @ObfuscatedName("ej.ax")
    public boolean field1649 = true;

    @ObfuscatedName("ej.au")
    public boolean field1623 = true;

    @ObfuscatedName("ej.av")
    public boolean field1651 = false;

    @ObfuscatedName("ej.as")
    public class363 field1647;

    @ObfuscatedName("cg.s(II)Lej;")
    public static class148 method2089(int arg0) {
        class148 var1 = (class148) field1618.method3927((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1637.method4459(9, arg0);
        class148 var3 = new class148();
        var3.field1627 = arg0;
        if (var2 != null) {
            var3.method2512(new class385(var2));
        }
        var3.method2509();
        field1618.method3929(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ej.t(I)V")
    public void method2509() {
    }

    @ObfuscatedName("ej.v(Lnv;B)V")
    public void method2512(class385 arg0) {
        while (true) {
            int var2 = arg0.method5958();
            if (var2 == 0) {
                return;
            }
            this.method2511(arg0, var2);
        }
    }

    @ObfuscatedName("ej.j(Lnv;IB)V")
    public void method2511(class385 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method5958();
            this.field1639 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1639[var4] = arg0.method6053();
            }
        } else if (arg1 == 2) {
            this.field1620 = arg0.method5967();
        } else if (arg1 == 12) {
            this.field1622 = arg0.method5958();
        } else if (arg1 == 13) {
            this.field1625 = arg0.method6053();
        } else if (arg1 == 14) {
            this.field1628 = arg0.method6053();
        } else if (arg1 == 15) {
            this.field1626 = arg0.method6053();
        } else if (arg1 == 16) {
            this.field1624 = arg0.method6053();
        } else if (arg1 == 17) {
            this.field1628 = arg0.method6053();
            this.field1629 = arg0.method6053();
            this.field1630 = arg0.method6053();
            this.field1631 = arg0.method6053();
        } else if (arg1 == 18) {
            arg0.method6053();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field1636[arg1 - 30] = arg0.method5967();
            if (this.field1636[arg1 - 30].equalsIgnoreCase(class270.field3525)) {
                this.field1636[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method5958();
            this.field1632 = new short[var5];
            this.field1633 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1632[var6] = (short) arg0.method6053();
                this.field1633[var6] = (short) arg0.method6053();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method5958();
            this.field1634 = new short[var7];
            this.field1650 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field1634[var8] = (short) arg0.method6053();
                this.field1650[var8] = (short) arg0.method6053();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method5958();
            this.field1619 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field1619[var10] = arg0.method6053();
            }
        } else if (arg1 == 93) {
            this.field1643 = false;
        } else if (arg1 == 95) {
            this.field1616 = arg0.method6053();
        } else if (arg1 == 97) {
            this.field1642 = arg0.method6053();
        } else if (arg1 == 98) {
            this.field1640 = arg0.method6053();
        } else if (arg1 == 99) {
            this.field1641 = true;
        } else if (arg1 == 100) {
            this.field1652 = arg0.method5959();
        } else if (arg1 == 101) {
            this.field1638 = arg0.method5959() * 5;
        } else if (arg1 == 102) {
            this.field1644 = arg0.method6053();
        } else if (arg1 == 103) {
            this.field1645 = arg0.method6053();
        } else if (arg1 == 106 || arg1 == 118) {
            this.field1635 = arg0.method6053();
            if (this.field1635 == 65535) {
                this.field1635 = -1;
            }
            this.field1648 = arg0.method6053();
            if (this.field1648 == 65535) {
                this.field1648 = -1;
            }
            int var11 = -1;
            if (arg1 == 118) {
                var11 = arg0.method6053();
                if (var11 == 65535) {
                    var11 = -1;
                }
            }
            int var12 = arg0.method5958();
            this.field1646 = new int[var12 + 2];
            for (int var13 = 0; var13 <= var12; var13++) {
                this.field1646[var13] = arg0.method6053();
                if (this.field1646[var13] == 65535) {
                    this.field1646[var13] = -1;
                }
            }
            this.field1646[var12 + 1] = var11;
        } else if (arg1 == 107) {
            this.field1649 = false;
        } else if (arg1 == 109) {
            this.field1623 = false;
        } else if (arg1 == 111) {
            this.field1651 = true;
        } else if (arg1 == 249) {
            this.field1647 = class145.method1414(arg0, this.field1647);
        }
    }

    @ObfuscatedName("ej.l(Lfz;ILfz;II)Lgl;")
    public final class207 method2534(class159 arg0, int arg1, class159 arg2, int arg3) {
        if (this.field1646 != null) {
            class148 var5 = this.method2514();
            return var5 == null ? null : var5.method2534(arg0, arg1, arg2, arg3);
        }
        class207 var6 = (class207) field1621.method3927((long) this.field1627);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field1639.length; var8++) {
                if (!Statics.field1617.method4539(this.field1639[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class193[] var9 = new class193[this.field1639.length];
            for (int var10 = 0; var10 < this.field1639.length; var10++) {
                var9[var10] = class193.method3357(Statics.field1617, this.field1639[var10], 0);
            }
            class193 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class193(var9, var9.length);
            }
            if (this.field1632 != null) {
                for (int var12 = 0; var12 < this.field1632.length; var12++) {
                    var11.method3403(this.field1632[var12], this.field1633[var12]);
                }
            }
            if (this.field1634 != null) {
                for (int var13 = 0; var13 < this.field1634.length; var13++) {
                    var11.method3370(this.field1634[var13], this.field1650[var13]);
                }
            }
            var6 = var11.method3377(this.field1652 + 64, this.field1638 + 850, -30, -50, -30);
            field1621.method3929(var6, (long) this.field1627);
        }
        class207 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method2822(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method2834(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method3768(true);
        } else {
            var14 = arg2.method2834(var6, arg3);
        }
        if (this.field1642 != 128 || this.field1640 != 128) {
            var14.method3787(this.field1642, this.field1640, this.field1642);
        }
        return var14;
    }

    @ObfuscatedName("ej.n(B)Lgz;")
    public final class193 method2513() {
        if (this.field1646 != null) {
            class148 var1 = this.method2514();
            return var1 == null ? null : var1.method2513();
        } else if (this.field1619 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field1619.length; var3++) {
                if (!Statics.field1617.method4539(this.field1619[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class193[] var4 = new class193[this.field1619.length];
            for (int var5 = 0; var5 < this.field1619.length; var5++) {
                var4[var5] = class193.method3357(Statics.field1617, this.field1619[var5], 0);
            }
            class193 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class193(var4, var4.length);
            }
            if (this.field1632 != null) {
                for (int var7 = 0; var7 < this.field1632.length; var7++) {
                    var6.method3403(this.field1632[var7], this.field1633[var7]);
                }
            }
            if (this.field1634 != null) {
                for (int var8 = 0; var8 < this.field1634.length; var8++) {
                    var6.method3370(this.field1634[var8], this.field1650[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("ej.w(I)Lej;")
    public final class148 method2514() {
        int var1 = -1;
        if (this.field1635 != -1) {
            var1 = class244.method3219(this.field1635);
        } else if (this.field1648 != -1) {
            var1 = class244.field2911[this.field1648];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field1646.length - 1) {
            var2 = this.field1646[var1];
        } else {
            var2 = this.field1646[this.field1646.length - 1];
        }
        return var2 == -1 ? null : method2089(var2);
    }

    @ObfuscatedName("ej.f(I)Z")
    public boolean method2515() {
        if (this.field1646 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field1635 != -1) {
            var1 = class244.method3219(this.field1635);
        } else if (this.field1648 != -1) {
            var1 = class244.field2911[this.field1648];
        }
        if (var1 >= 0 && var1 < this.field1646.length) {
            return this.field1646[var1] != -1;
        } else {
            return this.field1646[this.field1646.length - 1] != -1;
        }
    }

    @ObfuscatedName("ej.o(IIB)I")
    public int method2518(int arg0, int arg1) {
        class363 var3 = this.field1647;
        int var4;
        if (var3 == null) {
            var4 = arg1;
        } else {
            class353 var5 = (class353) var3.method5726((long) arg0);
            if (var5 == null) {
                var4 = arg1;
            } else {
                var4 = var5.field3964;
            }
        }
        return var4;
    }

    @ObfuscatedName("ej.x(ILjava/lang/String;I)Ljava/lang/String;")
    public String method2517(int arg0, String arg1) {
        class363 var3 = this.field1647;
        String var4;
        if (var3 == null) {
            var4 = arg1;
        } else {
            class350 var5 = (class350) var3.method5726((long) arg0);
            if (var5 == null) {
                var4 = arg1;
            } else {
                var4 = (String) var5.field3961;
            }
        }
        return var4;
    }
}
