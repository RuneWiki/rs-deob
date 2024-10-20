package deob;

@ObfuscatedName("em")
public class class156 extends class349 {

    @ObfuscatedName("em.s")
    public static boolean field1742 = false;

    @ObfuscatedName("em.j")
    public static class223 field1784 = new class223(4096);

    @ObfuscatedName("em.l")
    public static class223 field1738 = new class223(500);

    @ObfuscatedName("em.n")
    public static class223 field1739 = new class223(30);

    @ObfuscatedName("em.w")
    public static class223 field1740 = new class223(30);

    @ObfuscatedName("em.f")
    public static class193[] field1741 = new class193[4];

    @ObfuscatedName("em.o")
    public int field1753;

    @ObfuscatedName("em.x")
    public int[] field1743;

    @ObfuscatedName("em.r")
    public int[] field1744;

    @ObfuscatedName("em.p")
    public String field1769 = class270.field3234;

    @ObfuscatedName("em.h")
    public short[] field1746;

    @ObfuscatedName("em.k")
    public short[] field1747;

    @ObfuscatedName("em.a")
    public short[] field1774;

    @ObfuscatedName("em.q")
    public short[] field1749;

    @ObfuscatedName("em.u")
    public int field1750 = 1;

    @ObfuscatedName("em.e")
    public int field1751 = 1;

    @ObfuscatedName("em.c")
    public int field1752 = 2;

    @ObfuscatedName("em.i")
    public boolean field1779 = true;

    @ObfuscatedName("em.m")
    public int field1754 = -1;

    @ObfuscatedName("em.b")
    public int field1755 = -1;

    @ObfuscatedName("em.z")
    public boolean field1771 = false;

    @ObfuscatedName("em.d")
    public boolean field1757 = false;

    @ObfuscatedName("em.y")
    public int field1758 = -1;

    @ObfuscatedName("em.g")
    public int field1745 = 16;

    @ObfuscatedName("em.ae")
    public int field1737 = 0;

    @ObfuscatedName("em.an")
    public int field1761 = 0;

    @ObfuscatedName("em.am")
    public String[] field1783 = new String[5];

    @ObfuscatedName("em.al")
    public int field1763 = -1;

    @ObfuscatedName("em.aq")
    public int field1764 = -1;

    @ObfuscatedName("em.aa")
    public boolean field1760 = false;

    @ObfuscatedName("em.ab")
    public boolean field1765 = true;

    @ObfuscatedName("em.ax")
    public int field1767 = 128;

    @ObfuscatedName("em.au")
    public int field1768 = 128;

    @ObfuscatedName("em.av")
    public int field1776 = 128;

    @ObfuscatedName("em.as")
    public int field1736 = 0;

    @ObfuscatedName("em.ao")
    public int field1773 = 0;

    @ObfuscatedName("em.az")
    public int field1772 = 0;

    @ObfuscatedName("em.ak")
    public boolean field1759 = false;

    @ObfuscatedName("em.aj")
    public boolean field1785 = false;

    @ObfuscatedName("em.at")
    public int field1775 = -1;

    @ObfuscatedName("em.af")
    public int[] field1762;

    @ObfuscatedName("em.ar")
    public int field1777 = -1;

    @ObfuscatedName("em.ay")
    public int field1778 = -1;

    @ObfuscatedName("em.ap")
    public int field1766 = -1;

    @ObfuscatedName("em.ah")
    public int field1780 = 0;

    @ObfuscatedName("em.ag")
    public int field1756 = 0;

    @ObfuscatedName("em.ai")
    public int field1782 = 0;

    @ObfuscatedName("em.ad")
    public int[] field1781;

    @ObfuscatedName("em.ac")
    public boolean field1734 = true;

    @ObfuscatedName("em.aw")
    public class363 field1770;

    @ObfuscatedName("dx.s(Ljy;Ljy;ZB)V")
    public static void method2143(class277 arg0, class277 arg1, boolean arg2) {
        Statics.field1735 = arg0;
        Statics.field1748 = arg1;
        field1742 = arg2;
    }

    @ObfuscatedName("dt.t(II)Lem;")
    public static class156 method2267(int arg0) {
        class156 var1 = (class156) field1784.method3927((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1735.method4459(6, arg0);
        class156 var3 = new class156();
        var3.field1753 = arg0;
        if (var2 != null) {
            var3.method2680(new class385(var2));
        }
        var3.method2671();
        if (var3.field1785) {
            var3.field1752 = 0;
            var3.field1779 = false;
        }
        field1784.method3929(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("em.v(B)V")
    public void method2671() {
        if (this.field1754 == -1) {
            this.field1754 = 0;
            if (this.field1743 != null && (this.field1744 == null || this.field1744[0] == 10)) {
                this.field1754 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field1783[var1] != null) {
                    this.field1754 = 1;
                }
            }
        }
        if (this.field1775 == -1) {
            this.field1775 = this.field1752 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("em.j(Lnv;I)V")
    public void method2680(class385 arg0) {
        while (true) {
            int var2 = arg0.method5958();
            if (var2 == 0) {
                return;
            }
            this.method2673(arg0, var2);
        }
    }

    @ObfuscatedName("em.l(Lnv;II)V")
    public void method2673(class385 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method5958();
            if (var3 > 0) {
                if (this.field1743 == null || field1742) {
                    this.field1744 = new int[var3];
                    this.field1743 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field1743[var4] = arg0.method6053();
                        this.field1744[var4] = arg0.method5958();
                    }
                } else {
                    arg0.field4182 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field1769 = arg0.method5967();
        } else if (arg1 == 5) {
            int var5 = arg0.method5958();
            if (var5 > 0) {
                if (this.field1743 == null || field1742) {
                    this.field1744 = null;
                    this.field1743 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field1743[var6] = arg0.method6053();
                    }
                } else {
                    arg0.field4182 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field1750 = arg0.method5958();
        } else if (arg1 == 15) {
            this.field1751 = arg0.method5958();
        } else if (arg1 == 17) {
            this.field1752 = 0;
            this.field1779 = false;
        } else if (arg1 == 18) {
            this.field1779 = false;
        } else if (arg1 == 19) {
            this.field1754 = arg0.method5958();
        } else if (arg1 == 21) {
            this.field1755 = 0;
        } else if (arg1 == 22) {
            this.field1771 = true;
        } else if (arg1 == 23) {
            this.field1757 = true;
        } else if (arg1 == 24) {
            this.field1758 = arg0.method6053();
            if (this.field1758 == 65535) {
                this.field1758 = -1;
            }
        } else if (arg1 == 27) {
            this.field1752 = 1;
        } else if (arg1 == 28) {
            this.field1745 = arg0.method5958();
        } else if (arg1 == 29) {
            this.field1737 = arg0.method5959();
        } else if (arg1 == 39) {
            this.field1761 = arg0.method5959() * 25;
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field1783[arg1 - 30] = arg0.method5967();
            if (this.field1783[arg1 - 30].equalsIgnoreCase(class270.field3525)) {
                this.field1783[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method5958();
            this.field1746 = new short[var7];
            this.field1747 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field1746[var8] = (short) arg0.method6053();
                this.field1747[var8] = (short) arg0.method6053();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method5958();
            this.field1774 = new short[var9];
            this.field1749 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field1774[var10] = (short) arg0.method6053();
                this.field1749[var10] = (short) arg0.method6053();
            }
        } else if (arg1 == 61) {
            arg0.method6053();
        } else if (arg1 == 62) {
            this.field1760 = true;
        } else if (arg1 == 64) {
            this.field1765 = false;
        } else if (arg1 == 65) {
            this.field1767 = arg0.method6053();
        } else if (arg1 == 66) {
            this.field1768 = arg0.method6053();
        } else if (arg1 == 67) {
            this.field1776 = arg0.method6053();
        } else if (arg1 == 68) {
            this.field1764 = arg0.method6053();
        } else if (arg1 == 69) {
            arg0.method5958();
        } else if (arg1 == 70) {
            this.field1736 = arg0.method5961();
        } else if (arg1 == 71) {
            this.field1773 = arg0.method5961();
        } else if (arg1 == 72) {
            this.field1772 = arg0.method5961();
        } else if (arg1 == 73) {
            this.field1759 = true;
        } else if (arg1 == 74) {
            this.field1785 = true;
        } else if (arg1 == 75) {
            this.field1775 = arg0.method5958();
        } else if (arg1 == 77 || arg1 == 92) {
            this.field1777 = arg0.method6053();
            if (this.field1777 == 65535) {
                this.field1777 = -1;
            }
            this.field1778 = arg0.method6053();
            if (this.field1778 == 65535) {
                this.field1778 = -1;
            }
            int var13 = -1;
            if (arg1 == 92) {
                var13 = arg0.method6053();
                if (var13 == 65535) {
                    var13 = -1;
                }
            }
            int var14 = arg0.method5958();
            this.field1762 = new int[var14 + 2];
            for (int var15 = 0; var15 <= var14; var15++) {
                this.field1762[var15] = arg0.method6053();
                if (this.field1762[var15] == 65535) {
                    this.field1762[var15] = -1;
                }
            }
            this.field1762[var14 + 1] = var13;
        } else if (arg1 == 78) {
            this.field1766 = arg0.method6053();
            this.field1780 = arg0.method5958();
        } else if (arg1 == 79) {
            this.field1756 = arg0.method6053();
            this.field1782 = arg0.method6053();
            this.field1780 = arg0.method5958();
            int var11 = arg0.method5958();
            this.field1781 = new int[var11];
            for (int var12 = 0; var12 < var11; var12++) {
                this.field1781[var12] = arg0.method6053();
            }
        } else if (arg1 == 81) {
            this.field1755 = arg0.method5958() * 256;
        } else if (arg1 == 82) {
            this.field1763 = arg0.method6053();
        } else if (arg1 == 89) {
            this.field1734 = false;
        } else if (arg1 == 249) {
            this.field1770 = class145.method1414(arg0, this.field1770);
        }
    }

    @ObfuscatedName("em.n(IB)Z")
    public final boolean method2674(int arg0) {
        if (this.field1744 != null) {
            for (int var4 = 0; var4 < this.field1744.length; var4++) {
                if (this.field1744[var4] == arg0) {
                    return Statics.field1748.method4539(this.field1743[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field1743 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field1743.length; var3++) {
                var2 &= Statics.field1748.method4539(this.field1743[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("em.w(I)Z")
    public final boolean method2675() {
        if (this.field1743 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field1743.length; var2++) {
            var1 &= Statics.field1748.method4539(this.field1743[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("em.f(II[[IIIIB)Lgy;")
    public final class201 method2676(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field1744 == null) {
            var7 = (long) ((this.field1753 << 10) + arg1);
        } else {
            var7 = (long) ((this.field1753 << 10) + (arg0 << 3) + arg1);
        }
        class201 var9 = (class201) field1739.method3927(var7);
        if (var9 == null) {
            class193 var10 = this.method2679(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field1771) {
                var10.field2175 = (short) (this.field1737 + 64);
                var10.field2178 = (short) (this.field1761 + 768);
                var10.method3373();
                var9 = var10;
            } else {
                var9 = var10.method3377(this.field1737 + 64, this.field1761 + 768, -50, -10, -50);
            }
            field1739.method3929(var9, var7);
        }
        if (this.field1771) {
            var9 = ((class193) var9).method3361();
        }
        if (this.field1755 >= 0) {
            if (var9 instanceof class207) {
                var9 = ((class207) var9).method3767(arg2, arg3, arg4, arg5, true, this.field1755);
            } else if (var9 instanceof class193) {
                var9 = ((class193) var9).method3362(arg2, arg3, arg4, arg5, true, this.field1755);
            }
        }
        return var9;
    }

    @ObfuscatedName("em.o(II[[IIIII)Lgl;")
    public final class207 method2687(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field1744 == null) {
            var7 = (long) ((this.field1753 << 10) + arg1);
        } else {
            var7 = (long) ((this.field1753 << 10) + (arg0 << 3) + arg1);
        }
        class207 var9 = (class207) field1740.method3927(var7);
        if (var9 == null) {
            class193 var10 = this.method2679(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method3377(this.field1737 + 64, this.field1761 + 768, -50, -10, -50);
            field1740.method3929(var9, var7);
        }
        if (this.field1755 >= 0) {
            var9 = var9.method3767(arg2, arg3, arg4, arg5, true, this.field1755);
        }
        return var9;
    }

    @ObfuscatedName("em.x(II[[IIIILfz;II)Lgl;")
    public final class207 method2678(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class159 arg6, int arg7) {
        long var9;
        if (this.field1744 == null) {
            var9 = (long) ((this.field1753 << 10) + arg1);
        } else {
            var9 = (long) ((this.field1753 << 10) + (arg0 << 3) + arg1);
        }
        class207 var11 = (class207) field1740.method3927(var9);
        if (var11 == null) {
            class193 var12 = this.method2679(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method3377(this.field1737 + 64, this.field1761 + 768, -50, -10, -50);
            field1740.method3929(var11, var9);
        }
        if (arg6 == null && this.field1755 == -1) {
            return var11;
        }
        class207 var13;
        if (arg6 == null) {
            var13 = var11.method3768(true);
        } else {
            var13 = arg6.method2820(var11, arg7, arg1);
        }
        if (this.field1755 >= 0) {
            var13 = var13.method3767(arg2, arg3, arg4, arg5, false, this.field1755);
        }
        return var13;
    }

    @ObfuscatedName("em.r(IIB)Lgz;")
    public final class193 method2679(int arg0, int arg1) {
        class193 var3 = null;
        if (this.field1744 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field1743 == null) {
                return null;
            }
            boolean var4 = this.field1760;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field1743.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field1743[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class193) field1738.method3927((long) var7);
                if (var3 == null) {
                    var3 = class193.method3357(Statics.field1748, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method3371();
                    }
                    field1738.method3929(var3, (long) var7);
                }
                if (var5 > 1) {
                    field1741[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class193(field1741, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field1744.length; var9++) {
                if (this.field1744[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field1743[var8];
            boolean var11 = this.field1760 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class193) field1738.method3927((long) var10);
            if (var3 == null) {
                var3 = class193.method3357(Statics.field1748, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method3371();
                }
                field1738.method3929(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field1767 == 128 && this.field1768 == 128 && this.field1776 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field1736 == 0 && this.field1773 == 0 && this.field1772 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class193 var14 = new class193(var3, arg1 == 0 && !var12 && !var13, this.field1746 == null, this.field1774 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method3420(256);
            var14.method3368(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method3356();
        } else if (var15 == 2) {
            var14.method3365();
        } else if (var15 == 3) {
            var14.method3366();
        }
        if (this.field1746 != null) {
            for (int var16 = 0; var16 < this.field1746.length; var16++) {
                var14.method3403(this.field1746[var16], this.field1747[var16]);
            }
        }
        if (this.field1774 != null) {
            for (int var17 = 0; var17 < this.field1774.length; var17++) {
                var14.method3370(this.field1774[var17], this.field1749[var17]);
            }
        }
        if (var12) {
            var14.method3409(this.field1767, this.field1768, this.field1776);
        }
        if (var13) {
            var14.method3368(this.field1736, this.field1773, this.field1772);
        }
        return var14;
    }

    @ObfuscatedName("em.p(I)Lem;")
    public final class156 method2681() {
        int var1 = -1;
        if (this.field1777 != -1) {
            var1 = class244.method3219(this.field1777);
        } else if (this.field1778 != -1) {
            var1 = class244.field2911[this.field1778];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field1762.length - 1) {
            var2 = this.field1762[var1];
        } else {
            var2 = this.field1762[this.field1762.length - 1];
        }
        return var2 == -1 ? null : method2267(var2);
    }

    @ObfuscatedName("em.h(IIS)I")
    public int method2716(int arg0, int arg1) {
        class363 var3 = this.field1770;
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

    @ObfuscatedName("em.k(ILjava/lang/String;B)Ljava/lang/String;")
    public String method2682(int arg0, String arg1) {
        class363 var3 = this.field1770;
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

    @ObfuscatedName("f.a(I)V")
    public static void method54() {
        field1784.method3930();
        field1738.method3930();
        field1739.method3930();
        field1740.method3930();
    }

    @ObfuscatedName("em.q(I)Z")
    public boolean method2683() {
        if (this.field1762 == null) {
            return this.field1766 != -1 || this.field1781 != null;
        }
        for (int var1 = 0; var1 < this.field1762.length; var1++) {
            if (this.field1762[var1] != -1) {
                class156 var2 = method2267(this.field1762[var1]);
                if (var2.field1766 != -1 || var2.field1781 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
