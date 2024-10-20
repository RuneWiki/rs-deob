package deob;

@ObfuscatedName("bz")
public class class78 extends class212 {

    @ObfuscatedName("bz.l")
    public class267 field1080;

    @ObfuscatedName("bz.g")
    public class211 field1081 = new class211();

    public class78(class267 arg0) {
        this.field1080 = arg0;
    }

    @ObfuscatedName("bz.n(IIIII)V")
    public void method1825(int arg0, int arg1, int arg2, int arg3) {
        class71 var5 = null;
        int var6 = 0;
        for (class71 var7 = (class71) this.field1081.method3953(); var7 != null; var7 = (class71) this.field1081.method3955()) {
            var6++;
            if (var7.field984 == arg0) {
                var7.method1593(arg0, arg1, arg2, arg3);
                return;
            }
            if (var7.field984 <= arg0) {
                var5 = var7;
            }
        }
        if (var5 != null) {
            class211.method3952(new class71(arg0, arg1, arg2, arg3), var5);
            if (var6 >= 4) {
                this.field1081.method3953().method3973();
            }
        } else if (var6 < 4) {
            this.field1081.method3965(new class71(arg0, arg1, arg2, arg3));
        }
    }

    @ObfuscatedName("bz.h(IB)Lbb;")
    public class71 method1826(int arg0) {
        class71 var2 = (class71) this.field1081.method3953();
        if (var2 == null || var2.field984 > arg0) {
            return null;
        }
        for (class71 var3 = (class71) this.field1081.method3955(); var3 != null && var3.field984 <= arg0; var3 = (class71) this.field1081.method3955()) {
            var2.method3973();
            var2 = var3;
        }
        if (this.field1080.field3384 + var2.field987 + var2.field984 > arg0) {
            return var2;
        } else {
            var2.method3973();
            return null;
        }
    }

    @ObfuscatedName("bz.l(I)Z")
    public boolean method1830() {
        return this.field1081.method3956();
    }
}
