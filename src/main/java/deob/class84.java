package deob;

@ObfuscatedName("cx")
public class class84 extends class193 {

    @ObfuscatedName("cx.e")
    public class249 field1363;

    @ObfuscatedName("cx.p")
    public class192 field1364 = new class192();

    public class84(class249 arg0) {
        this.field1363 = arg0;
    }

    @ObfuscatedName("cx.d(IIIIB)V")
    public void method1599(int arg0, int arg1, int arg2, int arg3) {
        class78 var5 = null;
        int var6 = 0;
        for (class78 var7 = (class78) this.field1364.method3373(); var7 != null; var7 = (class78) this.field1364.method3374()) {
            var6++;
            if (var7.field1272 == arg0) {
                var7.method1472(arg0, arg1, arg2, arg3);
                return;
            }
            if (var7.field1272 <= arg0) {
                var5 = var7;
            }
        }
        if (var5 != null) {
            class192.method3371(new class78(arg0, arg1, arg2, arg3), var5);
            if (var6 >= 4) {
                this.field1364.method3373().method3407();
            }
        } else if (var6 < 4) {
            this.field1364.method3370(new class78(arg0, arg1, arg2, arg3));
        }
    }

    @ObfuscatedName("cx.k(II)Lbp;")
    public class78 method1600(int arg0) {
        class78 var2 = (class78) this.field1364.method3373();
        if (var2 == null || var2.field1272 > arg0) {
            return null;
        }
        for (class78 var3 = (class78) this.field1364.method3374(); var3 != null && var3.field1272 <= arg0; var3 = (class78) this.field1364.method3374()) {
            var2.method3407();
            var2 = var3;
        }
        if (this.field1363.field3372 + var2.field1275 + var2.field1272 > arg0) {
            return var2;
        } else {
            var2.method3407();
            return null;
        }
    }

    @ObfuscatedName("cx.e(I)Z")
    public boolean method1601() {
        return this.field1364.method3376();
    }
}
