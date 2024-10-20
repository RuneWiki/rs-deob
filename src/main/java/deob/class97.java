package deob;

@ObfuscatedName("dm")
public class class97 extends class444 {

    @ObfuscatedName("dm.ac")
    public class188 field1269;

    @ObfuscatedName("dm.ab")
    public class361 field1270 = new class361();

    public class97(class188 arg0) {
        this.field1269 = arg0;
    }

    @ObfuscatedName("dm.aj(IIIII)V")
    public void method2425(int arg0, int arg1, int arg2, int arg3) {
        class94 var5 = null;
        int var6 = 0;
        for (class94 var7 = (class94) this.field1270.method6141(); var7 != null; var7 = (class94) this.field1270.method6147()) {
            var6++;
            if (var7.field1219 == arg0) {
                var7.method2268(arg0, arg1, arg2, arg3);
                return;
            }
            if (var7.field1219 <= arg0) {
                var5 = var7;
            }
        }
        if (var5 != null) {
            class361.method6210(new class94(arg0, arg1, arg2, arg3), var5);
            if (var6 >= 4) {
                this.field1270.method6141().method7335();
            }
        } else if (var6 < 4) {
            this.field1270.method6139(new class94(arg0, arg1, arg2, arg3));
        }
    }

    @ObfuscatedName("dm.al(II)Ldw;")
    public class94 method2426(int arg0) {
        class94 var2 = (class94) this.field1270.method6141();
        if (var2 == null || var2.field1219 > arg0) {
            return null;
        }
        for (class94 var3 = (class94) this.field1270.method6147(); var3 != null && var3.field1219 <= arg0; var3 = (class94) this.field1270.method6147()) {
            var2.method7335();
            var2 = var3;
        }
        if (this.field1269.field1956 + var2.field1223 + var2.field1219 > arg0) {
            return var2;
        } else {
            var2.method7335();
            return null;
        }
    }

    @ObfuscatedName("dm.ac(B)Z")
    public boolean method2427() {
        return this.field1270.method6145();
    }
}
