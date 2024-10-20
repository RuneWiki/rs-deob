package deob;

@ObfuscatedName("ah")
public class class27 extends class212 {

    @ObfuscatedName("ah.j")
    public class50 field635;

    @ObfuscatedName("ah.z")
    public class206 field642 = new class206();

    public class27(class50 arg0) {
        this.field635 = arg0;
    }

    @ObfuscatedName("ah.x(IIIII)V")
    public void method574(int arg0, int arg1, int arg2, int arg3) {
        class21 var5 = null;
        int var6 = 0;
        for (class21 var7 = (class21) this.field642.method3647(); var7 != null; var7 = (class21) this.field642.method3632()) {
            var6++;
            if (var7.field574 == arg0) {
                var7.method535(arg0, arg1, arg2, arg3);
                return;
            }
            if (var7.field574 <= arg0) {
                var5 = var7;
            }
        }
        if (var5 != null) {
            class206.method3635(new class21(arg0, arg1, arg2, arg3), var5);
            if (var6 >= 4) {
                this.field642.method3647().method3695();
            }
        } else if (var6 < 4) {
            this.field642.method3634(new class21(arg0, arg1, arg2, arg3));
        }
    }

    @ObfuscatedName("ah.r(II)Lc;")
    public class21 method580(int arg0) {
        class21 var2 = (class21) this.field642.method3647();
        if (var2 == null || var2.field574 > arg0) {
            return null;
        }
        for (class21 var3 = (class21) this.field642.method3632(); var3 != null && var3.field574 <= arg0; var3 = (class21) this.field642.method3632()) {
            var2.method3695();
            var2 = var3;
        }
        if (this.field635.field1081 + var2.field574 + var2.field569 > arg0) {
            return var2;
        } else {
            var2.method3695();
            return null;
        }
    }

    @ObfuscatedName("ah.j(B)Z")
    public boolean method576() {
        return this.field642.method3639();
    }
}
