package deob;

@ObfuscatedName("lm")
public class class296 extends class461 {

    @ObfuscatedName("lm.at")
    public class294 field3216;

    @ObfuscatedName("lm.an")
    public int field3212;

    @ObfuscatedName("lm.av")
    public class500 field3211;

    @ObfuscatedName("lm.as")
    public int field3214;

    @ObfuscatedName("lm.ax")
    public static class296[] field3215 = new class296[300];

    @ObfuscatedName("lm.ap")
    public static int field3219 = 0;

    @ObfuscatedName("hx.at(Lli;Ltq;I)Llm;")
    public static class296 method3619(class294 arg0, class518 arg1) {
        class296 var2;
        if (field3219 == 0) {
            var2 = new class296();
        } else {
            var2 = field3215[--field3219];
        }
        var2.field3216 = arg0;
        var2.field3212 = arg0.field3198;
        if (var2.field3212 == -1) {
            var2.field3211 = new class500(260);
        } else if (var2.field3212 == -2) {
            var2.field3211 = new class500(10000);
        } else if (var2.field3212 <= 18) {
            var2.field3211 = new class500(20);
        } else if (var2.field3212 <= 98) {
            var2.field3211 = new class500(100);
        } else {
            var2.field3211 = new class500(260);
        }
        var2.field3211.method8073(arg1);
        var2.field3211.method8075(var2.field3216.field3197);
        var2.field3214 = 0;
        return var2;
    }

    @ObfuscatedName("hh.an(I)Llm;")
    public static class296 method3351() {
        class296 var0;
        if (field3219 == 0) {
            var0 = new class296();
        } else {
            var0 = field3215[--field3219];
        }
        var0.field3216 = null;
        var0.field3212 = 0;
        var0.field3211 = new class500(5000);
        return var0;
    }

    @ObfuscatedName("lm.av(I)V")
    public void method5136() {
        if (field3219 < field3215.length) {
            field3215[++field3219 - 1] = this;
        }
    }
}
