package deob;

@ObfuscatedName("ad")
public class class27 extends class212 {

    @ObfuscatedName("ad.r")
    public class50 field656;

    @ObfuscatedName("ad.e")
    public class206 field648 = new class206();

    public class27(class50 arg0) {
        this.field656 = arg0;
    }

    @ObfuscatedName("ad.l(IIIII)V")
    public void method611(int arg0, int arg1, int arg2, int arg3) {
        class21 var5 = null;
        int var6 = 0;
        for (class21 var7 = (class21) this.field648.method3759(); var7 != null; var7 = (class21) this.field648.method3761()) {
            var6++;
            if (var7.field584 == arg0) {
                var7.method564(arg0, arg1, arg2, arg3);
                return;
            }
            if (var7.field584 <= arg0) {
                var5 = var7;
            }
        }
        if (var5 != null) {
            class206.method3758(new class21(arg0, arg1, arg2, arg3), var5);
            if (var6 >= 4) {
                this.field648.method3759().method3815();
            }
        } else if (var6 < 4) {
            this.field648.method3757(new class21(arg0, arg1, arg2, arg3));
        }
    }

    @ObfuscatedName("ad.g(II)Lj;")
    public class21 method620(int arg0) {
        class21 var2 = (class21) this.field648.method3759();
        if (var2 == null || var2.field584 > arg0) {
            return null;
        }
        for (class21 var3 = (class21) this.field648.method3761(); var3 != null && var3.field584 <= arg0; var3 = (class21) this.field648.method3761()) {
            var2.method3815();
            var2 = var3;
        }
        if (this.field656.field1109 + var2.field584 + var2.field578 > arg0) {
            return var2;
        } else {
            var2.method3815();
            return null;
        }
    }

    @ObfuscatedName("ad.r(B)Z")
    public boolean method612() {
        return this.field648.method3765();
    }
}
