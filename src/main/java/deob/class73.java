package deob;

@ObfuscatedName("be")
public class class73 extends class207 {

    @ObfuscatedName("be.n")
    public class264 field1077;

    @ObfuscatedName("be.u")
    public class206 field1083 = new class206();

    public class73(class264 arg0) {
        this.field1077 = arg0;
    }

    @ObfuscatedName("be.y(IIIII)V")
    public void method1664(int arg0, int arg1, int arg2, int arg3) {
        class66 var5 = null;
        int var6 = 0;
        for (class66 var7 = (class66) this.field1083.method3740(); var7 != null; var7 = (class66) this.field1083.method3759()) {
            var6++;
            if (var7.field982 == arg0) {
                var7.method1471(arg0, arg1, arg2, arg3);
                return;
            }
            if (var7.field982 <= arg0) {
                var5 = var7;
            }
        }
        if (var5 != null) {
            class206.method3744(new class66(arg0, arg1, arg2, arg3), var5);
            if (var6 >= 4) {
                this.field1083.method3740().method3766();
            }
        } else if (var6 < 4) {
            this.field1083.method3751(new class66(arg0, arg1, arg2, arg3));
        }
    }

    @ObfuscatedName("be.c(II)Lbj;")
    public class66 method1669(int arg0) {
        class66 var2 = (class66) this.field1083.method3740();
        if (var2 == null || var2.field982 > arg0) {
            return null;
        }
        for (class66 var3 = (class66) this.field1083.method3759(); var3 != null && var3.field982 <= arg0; var3 = (class66) this.field1083.method3759()) {
            var2.method3766();
            var2 = var3;
        }
        if (this.field1077.field3358 + var2.field983 + var2.field982 > arg0) {
            return var2;
        } else {
            var2.method3766();
            return null;
        }
    }

    @ObfuscatedName("be.n(I)Z")
    public boolean method1666() {
        return this.field1083.method3743();
    }
}
