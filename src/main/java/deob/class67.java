package deob;

@ObfuscatedName("ch")
public final class class67 extends class444 {

    @ObfuscatedName("ch.aj")
    public static class359 field817 = new class359();

    @ObfuscatedName("ch.al")
    public int field808;

    @ObfuscatedName("ch.ac")
    public int field822;

    @ObfuscatedName("ch.ab")
    public int field810;

    @ObfuscatedName("ch.an")
    public int field811;

    @ObfuscatedName("ch.ao")
    public int field812;

    @ObfuscatedName("ch.av")
    public int field813;

    @ObfuscatedName("ch.aq")
    public int field814;

    @ObfuscatedName("ch.ap")
    public class48 field815;

    @ObfuscatedName("ch.ar")
    public int field807;

    @ObfuscatedName("ch.ak")
    public int field809;

    @ObfuscatedName("ch.ax")
    public int[] field818;

    @ObfuscatedName("ch.as")
    public int field819;

    @ObfuscatedName("ch.ay")
    public class48 field816;

    @ObfuscatedName("ch.am")
    public class203 field821;

    @ObfuscatedName("oy.aj(B)V")
    public static void method6752() {
        for (class67 var0 = (class67) field817.method6089(); var0 != null; var0 = (class67) field817.method6098()) {
            if (var0.field815 != null) {
                Statics.field3749.method677(var0.field815);
                var0.field815 = null;
            }
            if (var0.field816 != null) {
                Statics.field3749.method677(var0.field816);
                var0.field816 = null;
            }
        }
        field817.method6118();
    }

    @ObfuscatedName("jf.al(I)V")
    public static void method4446() {
        for (class67 var0 = (class67) field817.method6089(); var0 != null; var0 = (class67) field817.method6098()) {
            if (var0.field821 != null) {
                var0.method1805();
            }
        }
    }

    @ObfuscatedName("ch.ac(I)V")
    public void method1805() {
        int var1 = this.field814;
        class203 var2 = this.field821.method3545();
        if (var2 == null) {
            this.field814 = -1;
            this.field813 = 0;
            this.field807 = 0;
            this.field809 = 0;
            this.field818 = null;
        } else {
            this.field814 = var2.field2169;
            this.field813 = var2.field2170 * 128;
            this.field807 = var2.field2152;
            this.field809 = var2.field2172;
            this.field818 = var2.field2173;
        }
        if (this.field814 != var1 && this.field815 != null) {
            Statics.field3749.method677(this.field815);
            this.field815 = null;
        }
    }

    @ObfuscatedName("oq.ab(IIILhu;II)V")
    public static void method6746(int arg0, int arg1, int arg2, class203 arg3, int arg4) {
        class67 var5 = new class67();
        var5.field808 = arg0;
        var5.field822 = arg1 * 128;
        var5.field810 = arg2 * 128;
        int var6 = arg3.field2174;
        int var7 = arg3.field2141;
        if (arg4 == 1 || arg4 == 3) {
            var6 = arg3.field2141;
            var7 = arg3.field2174;
        }
        var5.field811 = (arg1 + var6) * 128;
        var5.field812 = (arg2 + var7) * 128;
        var5.field814 = arg3.field2169;
        var5.field813 = arg3.field2170 * 128;
        var5.field807 = arg3.field2152;
        var5.field809 = arg3.field2172;
        var5.field818 = arg3.field2173;
        if (arg3.field2129 != null) {
            var5.field821 = arg3;
            var5.method1805();
        }
        field817.method6111(var5);
        if (var5.field818 != null) {
            var5.field819 = var5.field807 + (int) (Math.random() * (double) (var5.field809 - var5.field807));
        }
    }
}
