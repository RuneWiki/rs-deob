package deob;

@ObfuscatedName("cn")
public class class91 extends class410 {

    @ObfuscatedName("cn.q")
    public class174 field1256;

    @ObfuscatedName("cn.f")
    public class336 field1257 = new class336();

    public class91(class174 arg0) {
        this.field1256 = arg0;
    }

    @ObfuscatedName("cn.c(IIIII)V")
    public void method2238(int arg0, int arg1, int arg2, int arg3) {
        class88 var5 = null;
        int var6 = 0;
        for (class88 var7 = (class88) this.field1257.method5577(); var7 != null; var7 = (class88) this.field1257.method5579()) {
            var6++;
            if (var7.field1211 == arg0) {
                var7.method2089(arg0, arg1, arg2, arg3);
                return;
            }
            if (var7.field1211 <= arg0) {
                var5 = var7;
            }
        }
        if (var5 != null) {
            class336.method5576(new class88(arg0, arg1, arg2, arg3), var5);
            if (var6 >= 4) {
                this.field1257.method5577().method6497();
            }
        } else if (var6 < 4) {
            this.field1257.method5632(new class88(arg0, arg1, arg2, arg3));
        }
    }

    @ObfuscatedName("cn.v(IB)Lcp;")
    public class88 method2239(int arg0) {
        class88 var2 = (class88) this.field1257.method5577();
        if (var2 == null || var2.field1211 > arg0) {
            return null;
        }
        for (class88 var3 = (class88) this.field1257.method5579(); var3 != null && var3.field1211 <= arg0; var3 = (class88) this.field1257.method5579()) {
            var2.method6497();
            var2 = var3;
        }
        if (this.field1256.field1879 + var2.field1212 + var2.field1211 > arg0) {
            return var2;
        } else {
            var2.method6497();
            return null;
        }
    }

    @ObfuscatedName("cn.q(I)Z")
    public boolean method2240() {
        return this.field1257.method5581();
    }
}
