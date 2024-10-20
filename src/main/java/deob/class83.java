package deob;

@ObfuscatedName("cv")
public class class83 extends class213 {

    @ObfuscatedName("cv.o")
    public class269 field1250;

    @ObfuscatedName("cv.p")
    public class212 field1249 = new class212();

    public class83(class269 arg0) {
        this.field1250 = arg0;
    }

    @ObfuscatedName("cv.b(IIIIB)V")
    public void method1700(int arg0, int arg1, int arg2, int arg3) {
        class76 var5 = null;
        int var6 = 0;
        for (class76 var7 = (class76) this.field1249.method3696(); var7 != null; var7 = (class76) this.field1249.method3718()) {
            var6++;
            if (var7.field1161 == arg0) {
                var7.method1516(arg0, arg1, arg2, arg3);
                return;
            }
            if (var7.field1161 <= arg0) {
                var5 = var7;
            }
        }
        if (var5 != null) {
            class212.method3694(new class76(arg0, arg1, arg2, arg3), var5);
            if (var6 >= 4) {
                this.field1249.method3696().method3726();
            }
        } else if (var6 < 4) {
            this.field1249.method3693(new class76(arg0, arg1, arg2, arg3));
        }
    }

    @ObfuscatedName("cv.q(II)Lbo;")
    public class76 method1699(int arg0) {
        class76 var2 = (class76) this.field1249.method3696();
        if (var2 == null || var2.field1161 > arg0) {
            return null;
        }
        for (class76 var3 = (class76) this.field1249.method3718(); var3 != null && var3.field1161 <= arg0; var3 = (class76) this.field1249.method3718()) {
            var2.method3726();
            var2 = var3;
        }
        if (this.field1250.field3461 + var2.field1161 + var2.field1158 > arg0) {
            return var2;
        } else {
            var2.method3726();
            return null;
        }
    }

    @ObfuscatedName("cv.o(B)Z")
    public boolean method1702() {
        return this.field1249.method3699();
    }
}
