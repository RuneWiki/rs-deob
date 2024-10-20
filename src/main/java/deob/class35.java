package deob;

@ObfuscatedName("ay")
public class class35 extends class149 {

    @ObfuscatedName("ay.n")
    public class196 field750;

    @ObfuscatedName("ay.q")
    public class148 field753 = new class148();

    public class35(class196 arg0) {
        this.field750 = arg0;
    }

    @ObfuscatedName("ay.d(IIIIB)V")
    public void method716(int arg0, int arg1, int arg2, int arg3) {
        class29 var5 = null;
        int var6 = 0;
        for (class29 var7 = (class29) this.field753.method2628(); var7 != null; var7 = (class29) this.field753.method2629()) {
            var6++;
            if (var7.field667 == arg0) {
                var7.method596(arg0, arg1, arg2, arg3);
                return;
            }
            if (var7.field667 <= arg0) {
                var5 = var7;
            }
        }
        if (var5 != null) {
            class148.method2627(new class29(arg0, arg1, arg2, arg3), var5);
            if (var6 >= 4) {
                this.field753.method2628().method2652();
            }
        } else if (var6 < 4) {
            this.field753.method2626(new class29(arg0, arg1, arg2, arg3));
        }
    }

    @ObfuscatedName("ay.c(II)Lac;")
    public class29 method717(int arg0) {
        class29 var2 = (class29) this.field753.method2628();
        if (var2 == null || var2.field667 > arg0) {
            return null;
        }
        for (class29 var3 = (class29) this.field753.method2629(); var3 != null && var3.field667 <= arg0; var3 = (class29) this.field753.method2629()) {
            var2.method2652();
            var2 = var3;
        }
        if (this.field750.field2851 + var2.field667 + var2.field666 > arg0) {
            return var2;
        } else {
            var2.method2652();
            return null;
        }
    }

    @ObfuscatedName("ay.n(I)Z")
    public boolean method715() {
        return this.field753.method2631();
    }
}
