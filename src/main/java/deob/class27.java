package deob;

@ObfuscatedName("ac")
public class class27 extends class212 {

    @ObfuscatedName("ac.v")
    public class50 field646;

    @ObfuscatedName("ac.r")
    public class206 field652 = new class206();

    public class27(class50 arg0) {
        this.field646 = arg0;
    }

    @ObfuscatedName("ac.a(IIIIB)V")
    public void method604(int arg0, int arg1, int arg2, int arg3) {
        class21 var5 = null;
        int var6 = 0;
        for (class21 var7 = (class21) this.field652.method3664(); var7 != null; var7 = (class21) this.field652.method3666()) {
            var6++;
            if (var7.field570 == arg0) {
                var7.method554(arg0, arg1, arg2, arg3);
                return;
            }
            if (var7.field570 <= arg0) {
                var5 = var7;
            }
        }
        if (var5 != null) {
            class206.method3663(new class21(arg0, arg1, arg2, arg3), var5);
            if (var6 >= 4) {
                this.field652.method3664().method3729();
            }
        } else if (var6 < 4) {
            this.field652.method3680(new class21(arg0, arg1, arg2, arg3));
        }
    }

    @ObfuscatedName("ac.d(II)Ls;")
    public class21 method607(int arg0) {
        class21 var2 = (class21) this.field652.method3664();
        if (var2 == null || var2.field570 > arg0) {
            return null;
        }
        for (class21 var3 = (class21) this.field652.method3666(); var3 != null && var3.field570 <= arg0; var3 = (class21) this.field652.method3666()) {
            var2.method3729();
            var2 = var3;
        }
        if (this.field646.field1101 + var2.field573 + var2.field570 > arg0) {
            return var2;
        } else {
            var2.method3729();
            return null;
        }
    }

    @ObfuscatedName("ac.v(I)Z")
    public boolean method602() {
        return this.field652.method3672();
    }
}
