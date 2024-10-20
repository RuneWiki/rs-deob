package deob;

@ObfuscatedName("cg")
public class class87 extends class194 {

    @ObfuscatedName("cg.g")
    public class250 field1355;

    @ObfuscatedName("cg.y")
    public class193 field1357 = new class193();

    public class87(class250 arg0) {
        this.field1355 = arg0;
    }

    @ObfuscatedName("cg.e(IIIII)V")
    public void method1572(int arg0, int arg1, int arg2, int arg3) {
        class80 var5 = null;
        int var6 = 0;
        for (class80 var7 = (class80) this.field1357.method3313(); var7 != null; var7 = (class80) this.field1357.method3315()) {
            var6++;
            if (var7.field1274 == arg0) {
                var7.method1426(arg0, arg1, arg2, arg3);
                return;
            }
            if (var7.field1274 <= arg0) {
                var5 = var7;
            }
        }
        if (var5 != null) {
            class193.method3322(new class80(arg0, arg1, arg2, arg3), var5);
            if (var6 >= 4) {
                this.field1357.method3313().method3333();
            }
        } else if (var6 < 4) {
            this.field1357.method3310(new class80(arg0, arg1, arg2, arg3));
        }
    }

    @ObfuscatedName("cg.n(IS)Lcs;")
    public class80 method1573(int arg0) {
        class80 var2 = (class80) this.field1357.method3313();
        if (var2 == null || var2.field1274 > arg0) {
            return null;
        }
        for (class80 var3 = (class80) this.field1357.method3315(); var3 != null && var3.field1274 <= arg0; var3 = (class80) this.field1357.method3315()) {
            var2.method3333();
            var2 = var3;
        }
        if (this.field1355.field3364 + var2.field1274 + var2.field1271 > arg0) {
            return var2;
        } else {
            var2.method3333();
            return null;
        }
    }

    @ObfuscatedName("cg.g(B)Z")
    public boolean method1574() {
        return this.field1357.method3316();
    }
}
