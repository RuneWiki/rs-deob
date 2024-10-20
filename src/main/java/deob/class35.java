package deob;

@ObfuscatedName("ao")
public class class35 extends class128 {

    @ObfuscatedName("ao.h")
    public class194 field781;

    @ObfuscatedName("ao.p")
    public class127 field782 = new class127();

    public class35(class194 arg0) {
        this.field781 = arg0;
    }

    @ObfuscatedName("ao.q(IIIII)V")
    public void method784(int arg0, int arg1, int arg2, int arg3) {
        class29 var5 = null;
        int var6 = 0;
        for (class29 var7 = (class29) this.field782.method2281(); var7 != null; var7 = (class29) this.field782.method2276()) {
            var6++;
            if (var7.field688 == arg0) {
                var7.method635(arg0, arg1, arg2, arg3);
                return;
            }
            if (var7.field688 <= arg0) {
                var5 = var7;
            }
        }
        if (var5 != null) {
            class127.method2290(new class29(arg0, arg1, arg2, arg3), var5);
            if (var6 >= 4) {
                this.field782.method2281().method2310();
            }
        } else if (var6 < 4) {
            this.field782.method2283(new class29(arg0, arg1, arg2, arg3));
        }
    }

    @ObfuscatedName("ao.d(II)Lat;")
    public class29 method785(int arg0) {
        class29 var2 = (class29) this.field782.method2281();
        if (var2 == null || var2.field688 > arg0) {
            return null;
        }
        for (class29 var3 = (class29) this.field782.method2276(); var3 != null && var3.field688 <= arg0; var3 = (class29) this.field782.method2276()) {
            var2.method2310();
            var2 = var3;
        }
        if (this.field781.field2839 + var2.field689 + var2.field688 > arg0) {
            return var2;
        } else {
            var2.method2310();
            return null;
        }
    }

    @ObfuscatedName("ao.h(B)Z")
    public boolean method786() {
        return this.field782.method2282();
    }
}
