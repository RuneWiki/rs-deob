package deob;

@ObfuscatedName("ce")
public class class96 extends class433 {

    @ObfuscatedName("ce.v")
    public class182 field1306;

    @ObfuscatedName("ce.x")
    public class354 field1308 = new class354();

    public class96(class182 arg0) {
        this.field1306 = arg0;
    }

    @ObfuscatedName("ce.h(IIIIS)V")
    public void method2388(int arg0, int arg1, int arg2, int arg3) {
        class93 var5 = null;
        int var6 = 0;
        for (class93 var7 = (class93) this.field1308.method6176(); var7 != null; var7 = (class93) this.field1308.method6136()) {
            var6++;
            if (var7.field1260 == arg0) {
                var7.method2237(arg0, arg1, arg2, arg3);
                return;
            }
            if (var7.field1260 <= arg0) {
                var5 = var7;
            }
        }
        if (var5 != null) {
            class354.method6198(new class93(arg0, arg1, arg2, arg3), var5);
            if (var6 >= 4) {
                this.field1308.method6176().method7230();
            }
        } else if (var6 < 4) {
            this.field1308.method6133(new class93(arg0, arg1, arg2, arg3));
        }
    }

    @ObfuscatedName("ce.e(II)Lcu;")
    public class93 method2390(int arg0) {
        class93 var2 = (class93) this.field1308.method6176();
        if (var2 == null || var2.field1260 > arg0) {
            return null;
        }
        for (class93 var3 = (class93) this.field1308.method6136(); var3 != null && var3.field1260 <= arg0; var3 = (class93) this.field1308.method6136()) {
            var2.method7230();
            var2 = var3;
        }
        if (this.field1306.field1975 + var2.field1264 + var2.field1260 > arg0) {
            return var2;
        } else {
            var2.method7230();
            return null;
        }
    }

    @ObfuscatedName("ce.v(I)Z")
    public boolean method2391() {
        return this.field1308.method6138();
    }
}
