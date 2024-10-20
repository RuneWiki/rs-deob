package deob;

@ObfuscatedName("db")
public class class95 extends class449 {

    @ObfuscatedName("db.aw")
    public class186 field1266;

    @ObfuscatedName("db.ac")
    public class365 field1264 = new class365();

    public class95(class186 arg0) {
        this.field1266 = arg0;
    }

    @ObfuscatedName("db.af(IIIII)V")
    public void method2425(int arg0, int arg1, int arg2, int arg3) {
        class92 var5 = null;
        int var6 = 0;
        for (class92 var7 = (class92) this.field1264.method6413(); var7 != null; var7 = (class92) this.field1264.method6380()) {
            var6++;
            if (var7.field1218 == arg0) {
                var7.method2281(arg0, arg1, arg2, arg3);
                return;
            }
            if (var7.field1218 <= arg0) {
                var5 = var7;
            }
        }
        if (var5 != null) {
            class365.method6369(new class92(arg0, arg1, arg2, arg3), var5);
            if (var6 >= 4) {
                this.field1264.method6413().method7651();
            }
        } else if (var6 < 4) {
            this.field1264.method6383(new class92(arg0, arg1, arg2, arg3));
        }
    }

    @ObfuscatedName("db.an(IB)Ldh;")
    public class92 method2424(int arg0) {
        class92 var2 = (class92) this.field1264.method6413();
        if (var2 == null || var2.field1218 > arg0) {
            return null;
        }
        for (class92 var3 = (class92) this.field1264.method6380(); var3 != null && var3.field1218 <= arg0; var3 = (class92) this.field1264.method6380()) {
            var2.method7651();
            var2 = var3;
        }
        if (this.field1266.field1969 + var2.field1219 + var2.field1218 > arg0) {
            return var2;
        } else {
            var2.method7651();
            return null;
        }
    }

    @ObfuscatedName("db.aw(I)Z")
    public boolean method2427() {
        return this.field1264.method6370();
    }
}
