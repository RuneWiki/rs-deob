package deob;

@ObfuscatedName("lv")
public class class298 extends class474 {

    @ObfuscatedName("lv.aw")
    public class296 field3214;

    @ObfuscatedName("lv.ay")
    public int field3206;

    @ObfuscatedName("lv.ar")
    public class513 field3205;

    @ObfuscatedName("lv.am")
    public int field3207;

    @ObfuscatedName("lv.as")
    public static class298[] field3209 = new class298[300];

    @ObfuscatedName("lv.aj")
    public static int field3208 = 0;

    @ObfuscatedName("fm.aw(I)Llv;")
    public static class298 method2870() {
        return field3208 == 0 ? new class298() : field3209[--field3208];
    }

    @ObfuscatedName("tm.ay(Llw;Luy;B)Llv;")
    public static class298 method8119(class296 arg0, class531 arg1) {
        class298 var2 = method2870();
        var2.field3214 = arg0;
        var2.field3206 = arg0.field3109;
        if (var2.field3206 == -1) {
            var2.field3205 = new class513(260);
        } else if (var2.field3206 == -2) {
            var2.field3205 = new class513(10000);
        } else if (var2.field3206 <= 18) {
            var2.field3205 = new class513(20);
        } else if (var2.field3206 <= 98) {
            var2.field3205 = new class513(100);
        } else {
            var2.field3205 = new class513(260);
        }
        var2.field3205.method8187(arg1);
        var2.field3205.method8190(var2.field3214.field3158);
        var2.field3207 = 0;
        return var2;
    }

    @ObfuscatedName("lv.ar(I)V")
    public void method5168() {
        if (field3208 < field3209.length) {
            field3209[++field3208 - 1] = this;
        }
    }
}
