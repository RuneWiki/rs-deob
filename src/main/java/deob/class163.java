package deob;

@ObfuscatedName("fh")
public class class163 extends class365 {

    @ObfuscatedName("fh.s")
    public static class236 field1754 = new class236(64);

    @ObfuscatedName("fh.a")
    public static class236 field1746 = new class236(30);

    @ObfuscatedName("fh.o")
    public int field1749;

    @ObfuscatedName("fh.g")
    public int field1750;

    @ObfuscatedName("fh.e")
    public int field1751 = -1;

    @ObfuscatedName("fh.p")
    public short[] field1748;

    @ObfuscatedName("fh.j")
    public short[] field1753;

    @ObfuscatedName("fh.b")
    public short[] field1761;

    @ObfuscatedName("fh.x")
    public short[] field1755;

    @ObfuscatedName("fh.y")
    public int field1756 = 128;

    @ObfuscatedName("fh.k")
    public int field1757 = 128;

    @ObfuscatedName("fh.t")
    public int field1758 = 0;

    @ObfuscatedName("fh.l")
    public int field1759 = 0;

    @ObfuscatedName("fh.u")
    public int field1747 = 0;

    @ObfuscatedName("of.i(II)Lfh;")
    public static class163 method6452(int arg0) {
        class163 var1 = (class163) field1754.method4205((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1752.method4743(13, arg0);
        class163 var3 = new class163();
        var3.field1749 = arg0;
        if (var2 != null) {
            var3.method2852(new class401(var2));
        }
        field1754.method4206(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("fh.w(Lop;I)V")
    public void method2852(class401 arg0) {
        while (true) {
            int var2 = arg0.method6240();
            if (var2 == 0) {
                return;
            }
            this.method2856(arg0, var2);
        }
    }

    @ObfuscatedName("fh.s(Lop;II)V")
    public void method2856(class401 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1750 = arg0.method6242();
        } else if (arg1 == 2) {
            this.field1751 = arg0.method6242();
        } else if (arg1 == 4) {
            this.field1756 = arg0.method6242();
        } else if (arg1 == 5) {
            this.field1757 = arg0.method6242();
        } else if (arg1 == 6) {
            this.field1758 = arg0.method6242();
        } else if (arg1 == 7) {
            this.field1759 = arg0.method6240();
        } else if (arg1 == 8) {
            this.field1747 = arg0.method6240();
        } else if (arg1 == 40) {
            int var3 = arg0.method6240();
            this.field1748 = new short[var3];
            this.field1753 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1748[var4] = (short) arg0.method6242();
                this.field1753[var4] = (short) arg0.method6242();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method6240();
            this.field1761 = new short[var5];
            this.field1755 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1761[var6] = (short) arg0.method6242();
                this.field1755[var6] = (short) arg0.method6242();
            }
        }
    }

    @ObfuscatedName("fh.a(II)Lhl;")
    public final class220 method2844(int arg0) {
        class220 var2 = (class220) field1746.method4205((long) this.field1749);
        if (var2 == null) {
            class206 var3 = class206.method3658(Statics.field4264, this.field1750, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field1748 != null) {
                for (int var4 = 0; var4 < this.field1748.length; var4++) {
                    var3.method3687(this.field1748[var4], this.field1753[var4]);
                }
            }
            if (this.field1761 != null) {
                for (int var5 = 0; var5 < this.field1761.length; var5++) {
                    var3.method3672(this.field1761[var5], this.field1755[var5]);
                }
            }
            var2 = var3.method3679(this.field1759 + 64, this.field1747 + 850, -30, -50, -30);
            field1746.method4206(var2, (long) this.field1749);
        }
        class220 var6;
        if (this.field1751 == -1 || arg0 == -1) {
            var6 = var2.method4066(true);
        } else {
            var6 = class172.method589(this.field1751).method3116(var2, arg0);
        }
        if (this.field1756 != 128 || this.field1757 != 128) {
            var6.method4081(this.field1756, this.field1757, this.field1756);
        }
        if (this.field1758 != 0) {
            if (this.field1758 == 90) {
                var6.method4076();
            }
            if (this.field1758 == 180) {
                var6.method4076();
                var6.method4076();
            }
            if (this.field1758 == 270) {
                var6.method4076();
                var6.method4076();
                var6.method4076();
            }
        }
        return var6;
    }

    @ObfuscatedName("bt.o(I)V")
    public static void method1042() {
        field1754.method4207();
        field1746.method4207();
    }
}
