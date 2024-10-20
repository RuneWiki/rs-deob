package deob;

@ObfuscatedName("jx")
public class class278 extends class433 {

    @ObfuscatedName("jx.h")
    public class276 field3179;

    @ObfuscatedName("jx.e")
    public int field3174;

    @ObfuscatedName("jx.v")
    public class466 field3177;

    @ObfuscatedName("jx.x")
    public int field3176;

    @ObfuscatedName("jx.m")
    public static class278[] field3175 = new class278[300];

    @ObfuscatedName("jx.q")
    public static int field3178 = 0;

    @ObfuscatedName("dw.h(B)Ljx;")
    public static class278 method2638() {
        return field3178 == 0 ? new class278() : field3175[--field3178];
    }

    @ObfuscatedName("ev.e(Ljp;Lrg;B)Ljx;")
    public static class278 method2890(class276 arg0, class484 arg1) {
        class278 var2 = method2638();
        var2.field3179 = arg0;
        var2.field3174 = arg0.field3157;
        if (var2.field3174 == -1) {
            var2.field3177 = new class466(260);
        } else if (var2.field3174 == -2) {
            var2.field3177 = new class466(10000);
        } else if (var2.field3174 <= 18) {
            var2.field3177 = new class466(20);
        } else if (var2.field3174 <= 98) {
            var2.field3177 = new class466(100);
        } else {
            var2.field3177 = new class466(260);
        }
        var2.field3177.method7735(arg1);
        var2.field3177.method7740(var2.field3179.field3156);
        var2.field3176 = 0;
        return var2;
    }

    @ObfuscatedName("jx.v(I)V")
    public void method4942() {
        if (field3178 < field3175.length) {
            field3175[++field3178 - 1] = this;
        }
    }
}
