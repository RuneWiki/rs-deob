package deob;

@ObfuscatedName("bj")
public class class72 extends class205 {

    @ObfuscatedName("bj.q")
    public class262 field1047;

    @ObfuscatedName("bj.b")
    public class204 field1048 = new class204();

    public class72(class262 arg0) {
        this.field1047 = arg0;
    }

    @ObfuscatedName("bj.w(IIIII)V")
    public void method1694(int arg0, int arg1, int arg2, int arg3) {
        class65 var5 = null;
        int var6 = 0;
        for (class65 var7 = (class65) this.field1048.method3756(); var7 != null; var7 = (class65) this.field1048.method3758()) {
            var6++;
            if (var7.field946 == arg0) {
                var7.method1483(arg0, arg1, arg2, arg3);
                return;
            }
            if (var7.field946 <= arg0) {
                var5 = var7;
            }
        }
        if (var5 != null) {
            class204.method3773(new class65(arg0, arg1, arg2, arg3), var5);
            if (var6 >= 4) {
                this.field1048.method3756().method3782();
            }
        } else if (var6 < 4) {
            this.field1048.method3754(new class65(arg0, arg1, arg2, arg3));
        }
    }

    @ObfuscatedName("bj.m(IB)Lbi;")
    public class65 method1695(int arg0) {
        class65 var2 = (class65) this.field1048.method3756();
        if (var2 == null || var2.field946 > arg0) {
            return null;
        }
        for (class65 var3 = (class65) this.field1048.method3758(); var3 != null && var3.field946 <= arg0; var3 = (class65) this.field1048.method3758()) {
            var2.method3782();
            var2 = var3;
        }
        if (this.field1047.field3331 + var2.field948 + var2.field946 > arg0) {
            return var2;
        } else {
            var2.method3782();
            return null;
        }
    }

    @ObfuscatedName("bj.q(B)Z")
    public boolean method1696() {
        return this.field1048.method3759();
    }
}
