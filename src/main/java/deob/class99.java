package deob;

@ObfuscatedName("dg")
public class class99 extends class461 {

    @ObfuscatedName("dg.av")
    public class190 field1275;

    @ObfuscatedName("dg.as")
    public class378 field1280 = new class378();

    public class99(class190 arg0) {
        this.field1275 = arg0;
    }

    @ObfuscatedName("dg.at(IIIII)V")
    public void method2425(int arg0, int arg1, int arg2, int arg3) {
        class96 var5 = null;
        int var6 = 0;
        for (class96 var7 = (class96) this.field1280.method6360(); var7 != null; var7 = (class96) this.field1280.method6362()) {
            var6++;
            if (var7.field1232 == arg0) {
                var7.method2280(arg0, arg1, arg2, arg3);
                return;
            }
            if (var7.field1232 <= arg0) {
                var5 = var7;
            }
        }
        if (var5 != null) {
            class378.method6359(new class96(arg0, arg1, arg2, arg3), var5);
            if (var6 >= 4) {
                this.field1280.method6360().method7560();
            }
        } else if (var6 < 4) {
            this.field1280.method6358(new class96(arg0, arg1, arg2, arg3));
        }
    }

    @ObfuscatedName("dg.an(II)Ldj;")
    public class96 method2426(int arg0) {
        class96 var2 = (class96) this.field1280.method6360();
        if (var2 == null || var2.field1232 > arg0) {
            return null;
        }
        for (class96 var3 = (class96) this.field1280.method6362(); var3 != null && var3.field1232 <= arg0; var3 = (class96) this.field1280.method6362()) {
            var2.method7560();
            var2 = var3;
        }
        if (this.field1275.field1965 + var2.field1233 + var2.field1232 > arg0) {
            return var2;
        } else {
            var2.method7560();
            return null;
        }
    }

    @ObfuscatedName("dg.av(I)Z")
    public boolean method2427() {
        return this.field1280.method6363();
    }
}
