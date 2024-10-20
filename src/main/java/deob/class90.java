package deob;

import java.io.IOException;

@ObfuscatedName("cn")
public class class90 {

    @ObfuscatedName("cn.v")
    public class160 field1263;

    @ObfuscatedName("cn.s")
    public class206 field1273 = new class206();

    @ObfuscatedName("cn.o")
    public int field1269 = 0;

    @ObfuscatedName("cn.k")
    public class185 field1265 = new class185(5000);

    @ObfuscatedName("cn.u")
    public class193 field1266;

    @ObfuscatedName("cn.i")
    public class192 field1267 = new class192(40000);

    @ObfuscatedName("cn.t")
    public class171 field1268 = null;

    @ObfuscatedName("cn.p")
    public int field1277 = 0;

    @ObfuscatedName("cn.l")
    public boolean field1270 = true;

    @ObfuscatedName("cn.b")
    public int field1262 = 0;

    @ObfuscatedName("cn.c")
    public int field1272 = 0;

    @ObfuscatedName("cn.d")
    public class171 field1264;

    @ObfuscatedName("cn.w")
    public class171 field1274;

    @ObfuscatedName("cn.a")
    public class171 field1275;

    @ObfuscatedName("cn.v(I)V")
    public final void method1873() {
        this.field1273.method3753();
        this.field1269 = 0;
    }

    @ObfuscatedName("cn.s(B)V")
    public final void method1874() throws IOException {
        if (this.field1263 == null || this.field1269 <= 0) {
            return;
        }
        this.field1265.field2386 = 0;
        while (true) {
            class175 var1 = (class175) this.field1273.method3757();
            if (var1 == null || var1.field2307 > this.field1265.field2387.length - this.field1265.field2386) {
                this.field1263.method3041(this.field1265.field2387, 0, this.field1265.field2386);
                this.field1272 = 0;
                break;
            }
            this.field1265.method3303(var1.field2311.field2387, 0, var1.field2307);
            this.field1269 -= var1.field2307;
            var1.method3787();
            var1.field2311.method3474();
            var1.method3171();
        }
    }

    @ObfuscatedName("cn.o(Lfd;B)V")
    public final void method1875(class175 arg0) {
        this.field1273.method3754(arg0);
        arg0.field2307 = arg0.field2311.field2386;
        arg0.field2311.field2386 = 0;
        this.field1269 += arg0.field2307;
    }

    @ObfuscatedName("cn.k(Lfh;I)V")
    public void method1876(class160 arg0) {
        this.field1263 = arg0;
    }

    @ObfuscatedName("cn.u(I)V")
    public void method1877() {
        if (this.field1263 != null) {
            this.field1263.method3036();
            this.field1263 = null;
        }
    }

    @ObfuscatedName("cn.i(I)V")
    public void method1878() {
        this.field1263 = null;
    }

    @ObfuscatedName("cn.t(I)Lfh;")
    public class160 method1892() {
        return this.field1263;
    }
}
