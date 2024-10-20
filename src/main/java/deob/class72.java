package deob;

@ObfuscatedName("cy")
public final class class72 extends class504 {

    @ObfuscatedName("cy.ak")
    public static class406 field876 = new class406();

    @ObfuscatedName("cy.al")
    public int field874;

    @ObfuscatedName("cy.aj")
    public int field873;

    @ObfuscatedName("cy.az")
    public int field861;

    @ObfuscatedName("cy.af")
    public int field862;

    @ObfuscatedName("cy.aa")
    public int field863;

    @ObfuscatedName("cy.at")
    public int field860;

    @ObfuscatedName("cy.ab")
    public int field859;

    @ObfuscatedName("cy.ac")
    public int field866;

    @ObfuscatedName("cy.ao")
    public class49 field858;

    @ObfuscatedName("cy.ah")
    public int field868;

    @ObfuscatedName("cy.av")
    public int field869;

    @ObfuscatedName("cy.aq")
    public int[] field864;

    @ObfuscatedName("cy.ap")
    public int field871;

    @ObfuscatedName("cy.ae")
    public class49 field872;

    @ObfuscatedName("cy.ax")
    public class224 field865;

    @ObfuscatedName("fq.ak(B)V")
    public static void method3087() {
        for (class72 var0 = (class72) field876.method6834(); var0 != null; var0 = (class72) field876.method6842()) {
            if (var0.field858 != null) {
                Statics.field3737.method711(var0.field858);
                var0.field858 = null;
            }
            if (var0.field872 != null) {
                Statics.field3737.method711(var0.field872);
                var0.field872 = null;
            }
        }
        field876.method6828();
    }

    @ObfuscatedName("hs.al(I)V")
    public static void method3629() {
        for (class72 var0 = (class72) field876.method6834(); var0 != null; var0 = (class72) field876.method6842()) {
            if (var0.field865 != null) {
                var0.method1865();
            }
        }
    }

    @ObfuscatedName("cy.aj(I)V")
    public void method1865() {
        int var1 = this.field866;
        class224 var2 = this.field865.method3882();
        if (var2 == null) {
            this.field866 = -1;
            this.field860 = 0;
            this.field859 = 0;
            this.field868 = 0;
            this.field869 = 0;
            this.field864 = null;
        } else {
            this.field866 = var2.field2284;
            this.field860 = var2.field2312 * 128;
            this.field859 = var2.field2322 * 128;
            this.field868 = var2.field2323;
            this.field869 = var2.field2320;
            this.field864 = var2.field2325;
        }
        if (this.field866 != var1 && this.field858 != null) {
            Statics.field3737.method711(this.field858);
            this.field858 = null;
        }
    }

    @ObfuscatedName("bq.az(IIILin;II)V")
    public static void method852(int arg0, int arg1, int arg2, class224 arg3, int arg4) {
        class72 var5 = new class72();
        var5.field874 = arg0;
        var5.field873 = arg1 * 128;
        var5.field861 = arg2 * 128;
        int var6 = arg3.field2291;
        int var7 = arg3.field2292;
        if (arg4 == 1 || arg4 == 3) {
            var6 = arg3.field2292;
            var7 = arg3.field2291;
        }
        var5.field862 = (arg1 + var6) * 128;
        var5.field863 = (arg2 + var7) * 128;
        var5.field866 = arg3.field2284;
        var5.field860 = arg3.field2312 * 128;
        var5.field859 = Math.max(arg3.field2322 * 128 - 128, 0);
        var5.field868 = arg3.field2323;
        var5.field869 = arg3.field2320;
        var5.field864 = arg3.field2325;
        if (arg3.field2317 != null) {
            var5.field865 = arg3;
            var5.method1865();
        }
        field876.method6829(var5);
        if (var5.field864 != null) {
            var5.field871 = var5.field868 + (int) (Math.random() * (double) (var5.field869 - var5.field868));
        }
    }
}
