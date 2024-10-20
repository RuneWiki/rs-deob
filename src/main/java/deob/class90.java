package deob;

@ObfuscatedName("cv")
public class class90 extends class369 {

    @ObfuscatedName("cv.m")
    public class157 field1203;

    @ObfuscatedName("cv.k")
    public class311 field1204 = new class311();

    public class90(class157 arg0) {
        this.field1203 = arg0;
    }

    @ObfuscatedName("cv.n(IIIII)V")
    public void method2091(int arg0, int arg1, int arg2, int arg3) {
        class86 var5 = null;
        int var6 = 0;
        for (class86 var7 = (class86) this.field1204.method5007(); var7 != null; var7 = (class86) this.field1204.method5009()) {
            var6++;
            if (var7.field1159 == arg0) {
                var7.method2032(arg0, arg1, arg2, arg3);
                return;
            }
            if (var7.field1159 <= arg0) {
                var5 = var7;
            }
        }
        if (var5 != null) {
            class311.method5031(new class86(arg0, arg1, arg2, arg3), var5);
            if (var6 >= 4) {
                this.field1204.method5007().method5732();
            }
        } else if (var6 < 4) {
            this.field1204.method5005(new class86(arg0, arg1, arg2, arg3));
        }
    }

    @ObfuscatedName("cv.c(II)Lcc;")
    public class86 method2100(int arg0) {
        class86 var2 = (class86) this.field1204.method5007();
        if (var2 == null || var2.field1159 > arg0) {
            return null;
        }
        for (class86 var3 = (class86) this.field1204.method5009(); var3 != null && var3.field1159 <= arg0; var3 = (class86) this.field1204.method5009()) {
            var2.method5732();
            var2 = var3;
        }
        if (this.field1203.field1673 + var2.field1159 + var2.field1157 > arg0) {
            return var2;
        } else {
            var2.method5732();
            return null;
        }
    }

    @ObfuscatedName("cv.m(I)Z")
    public boolean method2093() {
        return this.field1204.method5051();
    }
}
