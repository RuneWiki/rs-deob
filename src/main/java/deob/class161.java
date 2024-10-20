package deob;

@ObfuscatedName("fq")
public class class161 extends class364 {

    @ObfuscatedName("fq.m")
    public static class236 field1707 = new class236(64);

    @ObfuscatedName("fq.k")
    public static class236 field1708 = new class236(50);

    @ObfuscatedName("fq.o")
    public int field1709;

    @ObfuscatedName("fq.g")
    public String field1710 = class283.field3339;

    @ObfuscatedName("fq.z")
    public int field1711 = 1;

    @ObfuscatedName("fq.a")
    public int[] field1740;

    @ObfuscatedName("fq.u")
    public int[] field1724;

    @ObfuscatedName("fq.e")
    public int field1714 = -1;

    @ObfuscatedName("fq.l")
    public int field1712 = -1;

    @ObfuscatedName("fq.y")
    public int field1730 = -1;

    @ObfuscatedName("fq.v")
    public int field1717 = -1;

    @ObfuscatedName("fq.f")
    public int field1718 = -1;

    @ObfuscatedName("fq.s")
    public int field1728 = -1;

    @ObfuscatedName("fq.h")
    public int field1720 = -1;

    @ObfuscatedName("fq.d")
    public short[] field1721;

    @ObfuscatedName("fq.q")
    public short[] field1734;

    @ObfuscatedName("fq.j")
    public short[] field1719;

    @ObfuscatedName("fq.x")
    public short[] field1727;

    @ObfuscatedName("fq.b")
    public String[] field1725 = new String[5];

    @ObfuscatedName("fq.t")
    public boolean field1726 = true;

    @ObfuscatedName("fq.r")
    public int field1732 = -1;

    @ObfuscatedName("fq.p")
    public int field1713 = 128;

    @ObfuscatedName("fq.w")
    public int field1729 = 128;

    @ObfuscatedName("fq.i")
    public boolean field1705 = false;

    @ObfuscatedName("fq.aq")
    public int field1731 = 0;

    @ObfuscatedName("fq.ad")
    public int field1723 = 0;

    @ObfuscatedName("fq.al")
    public int field1733 = -1;

    @ObfuscatedName("fq.aa")
    public int field1715 = 32;

    @ObfuscatedName("fq.aw")
    public int[] field1735;

    @ObfuscatedName("fq.at")
    public int field1736 = -1;

    @ObfuscatedName("fq.as")
    public int field1737 = -1;

    @ObfuscatedName("fq.ae")
    public boolean field1738 = true;

    @ObfuscatedName("fq.av")
    public boolean field1739 = true;

    @ObfuscatedName("fq.ak")
    public boolean field1722 = false;

    @ObfuscatedName("fq.an")
    public class378 field1741;

    @ObfuscatedName("cl.n(II)Lfq;")
    public static class161 method1950(int arg0) {
        class161 var1 = (class161) field1707.method4167((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1716.method4710(9, arg0);
        class161 var3 = new class161();
        var3.field1709 = arg0;
        if (var2 != null) {
            var3.method2713(new class400(var2));
        }
        var3.method2716();
        field1707.method4169(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("fq.c(B)V")
    public void method2716() {
    }

    @ObfuscatedName("fq.m(Lot;I)V")
    public void method2713(class400 arg0) {
        while (true) {
            int var2 = arg0.method6217();
            if (var2 == 0) {
                return;
            }
            this.method2727(arg0, var2);
        }
    }

    @ObfuscatedName("fq.k(Lot;II)V")
    public void method2727(class400 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method6217();
            this.field1740 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1740[var4] = arg0.method6219();
            }
        } else if (arg1 == 2) {
            this.field1710 = arg0.method6226();
        } else if (arg1 == 12) {
            this.field1711 = arg0.method6217();
        } else if (arg1 == 13) {
            this.field1714 = arg0.method6219();
        } else if (arg1 == 14) {
            this.field1717 = arg0.method6219();
        } else if (arg1 == 15) {
            this.field1712 = arg0.method6219();
        } else if (arg1 == 16) {
            this.field1730 = arg0.method6219();
        } else if (arg1 == 17) {
            this.field1717 = arg0.method6219();
            this.field1718 = arg0.method6219();
            this.field1728 = arg0.method6219();
            this.field1720 = arg0.method6219();
        } else if (arg1 == 18) {
            arg0.method6219();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field1725[arg1 - 30] = arg0.method6226();
            if (this.field1725[arg1 - 30].equalsIgnoreCase(class283.field3403)) {
                this.field1725[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method6217();
            this.field1721 = new short[var5];
            this.field1734 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1721[var6] = (short) arg0.method6219();
                this.field1734[var6] = (short) arg0.method6219();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method6217();
            this.field1719 = new short[var7];
            this.field1727 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field1719[var8] = (short) arg0.method6219();
                this.field1727[var8] = (short) arg0.method6219();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method6217();
            this.field1724 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field1724[var10] = arg0.method6219();
            }
        } else if (arg1 == 93) {
            this.field1726 = false;
        } else if (arg1 == 95) {
            this.field1732 = arg0.method6219();
        } else if (arg1 == 97) {
            this.field1713 = arg0.method6219();
        } else if (arg1 == 98) {
            this.field1729 = arg0.method6219();
        } else if (arg1 == 99) {
            this.field1705 = true;
        } else if (arg1 == 100) {
            this.field1731 = arg0.method6218();
        } else if (arg1 == 101) {
            this.field1723 = arg0.method6218() * 5;
        } else if (arg1 == 102) {
            this.field1733 = arg0.method6219();
        } else if (arg1 == 103) {
            this.field1715 = arg0.method6219();
        } else if (arg1 == 106 || arg1 == 118) {
            this.field1736 = arg0.method6219();
            if (this.field1736 == 65535) {
                this.field1736 = -1;
            }
            this.field1737 = arg0.method6219();
            if (this.field1737 == 65535) {
                this.field1737 = -1;
            }
            int var11 = -1;
            if (arg1 == 118) {
                var11 = arg0.method6219();
                if (var11 == 65535) {
                    var11 = -1;
                }
            }
            int var12 = arg0.method6217();
            this.field1735 = new int[var12 + 2];
            for (int var13 = 0; var13 <= var12; var13++) {
                this.field1735[var13] = arg0.method6219();
                if (this.field1735[var13] == 65535) {
                    this.field1735[var13] = -1;
                }
            }
            this.field1735[var12 + 1] = var11;
        } else if (arg1 == 107) {
            this.field1738 = false;
        } else if (arg1 == 109) {
            this.field1739 = false;
        } else if (arg1 == 111) {
            this.field1722 = true;
        } else if (arg1 == 249) {
            this.field1741 = class158.method2378(arg0, this.field1741);
        }
    }

    @ObfuscatedName("fq.o(Lfa;ILfa;II)Lhg;")
    public final class220 method2717(class172 arg0, int arg1, class172 arg2, int arg3) {
        if (this.field1735 != null) {
            class161 var5 = this.method2712();
            return var5 == null ? null : var5.method2717(arg0, arg1, arg2, arg3);
        }
        class220 var6 = (class220) field1708.method4167((long) this.field1709);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field1740.length; var8++) {
                if (!Statics.field1706.method4735(this.field1740[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class206[] var9 = new class206[this.field1740.length];
            for (int var10 = 0; var10 < this.field1740.length; var10++) {
                var9[var10] = class206.method3631(Statics.field1706, this.field1740[var10], 0);
            }
            class206 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class206(var9, var9.length);
            }
            if (this.field1721 != null) {
                for (int var12 = 0; var12 < this.field1721.length; var12++) {
                    var11.method3673(this.field1721[var12], this.field1734[var12]);
                }
            }
            if (this.field1719 != null) {
                for (int var13 = 0; var13 < this.field1719.length; var13++) {
                    var11.method3620(this.field1719[var13], this.field1727[var13]);
                }
            }
            var6 = var11.method3627(this.field1731 + 64, this.field1723 + 850, -30, -50, -30);
            field1708.method4169(var6, (long) this.field1709);
        }
        class220 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method3044(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method3041(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method4015(true);
        } else {
            var14 = arg2.method3041(var6, arg3);
        }
        if (this.field1713 != 128 || this.field1729 != 128) {
            var14.method4030(this.field1713, this.field1729, this.field1713);
        }
        return var14;
    }

    @ObfuscatedName("fq.g(I)Lgl;")
    public final class206 method2721() {
        if (this.field1735 != null) {
            class161 var1 = this.method2712();
            return var1 == null ? null : var1.method2721();
        } else if (this.field1724 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field1724.length; var3++) {
                if (!Statics.field1706.method4735(this.field1724[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class206[] var4 = new class206[this.field1724.length];
            for (int var5 = 0; var5 < this.field1724.length; var5++) {
                var4[var5] = class206.method3631(Statics.field1706, this.field1724[var5], 0);
            }
            class206 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class206(var4, var4.length);
            }
            if (this.field1721 != null) {
                for (int var7 = 0; var7 < this.field1721.length; var7++) {
                    var6.method3673(this.field1721[var7], this.field1734[var7]);
                }
            }
            if (this.field1719 != null) {
                for (int var8 = 0; var8 < this.field1719.length; var8++) {
                    var6.method3620(this.field1719[var8], this.field1727[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("fq.z(I)Lfq;")
    public final class161 method2712() {
        int var1 = -1;
        if (this.field1736 != -1) {
            var1 = class257.method4239(this.field1736);
        } else if (this.field1737 != -1) {
            var1 = class257.field3001[this.field1737];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field1735.length - 1) {
            var2 = this.field1735[var1];
        } else {
            var2 = this.field1735[this.field1735.length - 1];
        }
        return var2 == -1 ? null : method1950(var2);
    }

    @ObfuscatedName("fq.a(I)Z")
    public boolean method2718() {
        if (this.field1735 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field1736 != -1) {
            var1 = class257.method4239(this.field1736);
        } else if (this.field1737 != -1) {
            var1 = class257.field3001[this.field1737];
        }
        if (var1 >= 0 && var1 < this.field1735.length) {
            return this.field1735[var1] != -1;
        } else {
            return this.field1735[this.field1735.length - 1] != -1;
        }
    }

    @ObfuscatedName("fq.u(IIB)I")
    public int method2722(int arg0, int arg1) {
        class378 var3 = this.field1741;
        int var4;
        if (var3 == null) {
            var4 = arg1;
        } else {
            class368 var5 = (class368) var3.method5996((long) arg0);
            if (var5 == null) {
                var4 = arg1;
            } else {
                var4 = var5.field4054;
            }
        }
        return var4;
    }

    @ObfuscatedName("fq.e(ILjava/lang/String;B)Ljava/lang/String;")
    public String method2724(int arg0, String arg1) {
        return class158.method2382(this.field1741, arg0, arg1);
    }

    @ObfuscatedName("fg.l(I)V")
    public static void method2706() {
        field1707.method4168();
        field1708.method4168();
    }
}
