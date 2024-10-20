package deob;

@ObfuscatedName("eu")
public class class149 extends class348 {

    @ObfuscatedName("eu.v")
    public static class222 field1684 = new class222(64);

    @ObfuscatedName("eu.y")
    public static class222 field1697 = new class222(30);

    @ObfuscatedName("eu.j")
    public int field1686;

    @ObfuscatedName("eu.o")
    public int field1687;

    @ObfuscatedName("eu.m")
    public int field1692 = -1;

    @ObfuscatedName("eu.r")
    public short[] field1689;

    @ObfuscatedName("eu.h")
    public short[] field1696;

    @ObfuscatedName("eu.d")
    public short[] field1691;

    @ObfuscatedName("eu.z")
    public short[] field1685;

    @ObfuscatedName("eu.b")
    public int field1693 = 128;

    @ObfuscatedName("eu.i")
    public int field1694 = 128;

    @ObfuscatedName("eu.k")
    public int field1695 = 0;

    @ObfuscatedName("eu.g")
    public int field1682 = 0;

    @ObfuscatedName("eu.t")
    public int field1698 = 0;

    @ObfuscatedName("ez.f(Ljp;Ljp;B)V")
    public static void method2756(class276 arg0, class276 arg1) {
        Statics.field1690 = arg0;
        Statics.field1683 = arg1;
    }

    @ObfuscatedName("ca.e(II)Leu;")
    public static class149 method1892(int arg0) {
        class149 var1 = (class149) field1684.method3987((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1690.method4504(13, arg0);
        class149 var3 = new class149();
        var3.field1686 = arg0;
        if (var2 != null) {
            var3.method2592(new class384(var2));
        }
        field1684.method3988(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("eu.v(Lnt;B)V")
    public void method2592(class384 arg0) {
        while (true) {
            int var2 = arg0.method5902();
            if (var2 == 0) {
                return;
            }
            this.method2582(arg0, var2);
        }
    }

    @ObfuscatedName("eu.y(Lnt;IB)V")
    public void method2582(class384 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1687 = arg0.method5899();
        } else if (arg1 == 2) {
            this.field1692 = arg0.method5899();
        } else if (arg1 == 4) {
            this.field1693 = arg0.method5899();
        } else if (arg1 == 5) {
            this.field1694 = arg0.method5899();
        } else if (arg1 == 6) {
            this.field1695 = arg0.method5899();
        } else if (arg1 == 7) {
            this.field1682 = arg0.method5902();
        } else if (arg1 == 8) {
            this.field1698 = arg0.method5902();
        } else if (arg1 == 40) {
            int var3 = arg0.method5902();
            this.field1689 = new short[var3];
            this.field1696 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1689[var4] = (short) arg0.method5899();
                this.field1696[var4] = (short) arg0.method5899();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method5902();
            this.field1691 = new short[var5];
            this.field1685 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1691[var6] = (short) arg0.method5899();
                this.field1685[var6] = (short) arg0.method5899();
            }
        }
    }

    @ObfuscatedName("eu.j(IB)Lgd;")
    public final class206 method2580(int arg0) {
        class206 var2 = (class206) field1697.method3987((long) this.field1686);
        if (var2 == null) {
            class192 var3 = class192.method3422(Statics.field1683, this.field1687, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field1689 != null) {
                for (int var4 = 0; var4 < this.field1689.length; var4++) {
                    var3.method3420(this.field1689[var4], this.field1696[var4]);
                }
            }
            if (this.field1691 != null) {
                for (int var5 = 0; var5 < this.field1691.length; var5++) {
                    var3.method3474(this.field1691[var5], this.field1685[var5]);
                }
            }
            var2 = var3.method3428(this.field1682 + 64, this.field1698 + 850, -30, -50, -30);
            field1697.method3988(var2, (long) this.field1686);
        }
        class206 var6;
        if (this.field1692 == -1 || arg0 == -1) {
            var6 = var2.method3859(true);
        } else {
            var6 = class158.method3363(this.field1692).method2862(var2, arg0);
        }
        if (this.field1693 != 128 || this.field1694 != 128) {
            var6.method3892(this.field1693, this.field1694, this.field1693);
        }
        if (this.field1695 != 0) {
            if (this.field1695 == 90) {
                var6.method3848();
            }
            if (this.field1695 == 180) {
                var6.method3848();
                var6.method3848();
            }
            if (this.field1695 == 270) {
                var6.method3848();
                var6.method3848();
                var6.method3848();
            }
        }
        return var6;
    }

    @ObfuscatedName("cz.o(I)V")
    public static void method1771() {
        field1684.method3989();
        field1697.method3989();
    }
}
