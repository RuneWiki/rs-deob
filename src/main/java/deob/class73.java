package deob;

@ObfuscatedName("bd")
public class class73 extends class207 {

    @ObfuscatedName("bd.e")
    public class264 field1098;

    @ObfuscatedName("bd.q")
    public class206 field1100 = new class206();

    public class73(class264 arg0) {
        this.field1098 = arg0;
    }

    @ObfuscatedName("bd.g(IIIII)V")
    public void method1849(int arg0, int arg1, int arg2, int arg3) {
        class66 var5 = null;
        int var6 = 0;
        for (class66 var7 = (class66) this.field1100.method3931(); var7 != null; var7 = (class66) this.field1100.method3929()) {
            var6++;
            if (var7.field1007 == arg0) {
                var7.method1574(arg0, arg1, arg2, arg3);
                return;
            }
            if (var7.field1007 <= arg0) {
                var5 = var7;
            }
        }
        if (var5 != null) {
            class206.method3926(new class66(arg0, arg1, arg2, arg3), var5);
            if (var6 >= 4) {
                this.field1100.method3931().method3952();
            }
        } else if (var6 < 4) {
            this.field1100.method3927(new class66(arg0, arg1, arg2, arg3));
        }
    }

    @ObfuscatedName("bd.r(II)Lbg;")
    public class66 method1850(int arg0) {
        class66 var2 = (class66) this.field1100.method3931();
        if (var2 == null || var2.field1007 > arg0) {
            return null;
        }
        for (class66 var3 = (class66) this.field1100.method3929(); var3 != null && var3.field1007 <= arg0; var3 = (class66) this.field1100.method3929()) {
            var2.method3952();
            var2 = var3;
        }
        if (this.field1098.field3388 + var2.field1007 + var2.field1004 > arg0) {
            return var2;
        } else {
            var2.method3952();
            return null;
        }
    }

    @ObfuscatedName("bd.e(I)Z")
    public boolean method1855() {
        return this.field1100.method3930();
    }
}
