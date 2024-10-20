package deob;

import java.io.IOException;

@ObfuscatedName("cu")
public class class90 {

    @ObfuscatedName("cu.f")
    public class160 field1272;

    @ObfuscatedName("cu.h")
    public class206 field1262 = new class206();

    @ObfuscatedName("cu.e")
    public int field1263 = 0;

    @ObfuscatedName("cu.b")
    public class185 field1271 = new class185(5000);

    @ObfuscatedName("cu.l")
    public class193 field1265;

    @ObfuscatedName("cu.w")
    public class192 field1266 = new class192(40000);

    @ObfuscatedName("cu.d")
    public class171 field1267 = null;

    @ObfuscatedName("cu.n")
    public int field1268 = 0;

    @ObfuscatedName("cu.s")
    public boolean field1269 = true;

    @ObfuscatedName("cu.g")
    public int field1270 = 0;

    @ObfuscatedName("cu.a")
    public int field1261 = 0;

    @ObfuscatedName("cu.r")
    public class171 field1264;

    @ObfuscatedName("cu.k")
    public class171 field1273;

    @ObfuscatedName("cu.m")
    public class171 field1274;

    @ObfuscatedName("cu.f(I)V")
    public final void method1882() {
        this.field1262.method3784();
        this.field1263 = 0;
    }

    @ObfuscatedName("cu.h(I)V")
    public final void method1883() throws IOException {
        if (this.field1272 == null || this.field1263 <= 0) {
            return;
        }
        this.field1271.field2397 = 0;
        while (true) {
            class175 var1 = (class175) this.field1262.method3779();
            if (var1 == null || var1.field2317 > this.field1271.field2399.length - this.field1271.field2397) {
                this.field1272.method3094(this.field1271.field2399, 0, this.field1271.field2397);
                this.field1261 = 0;
                break;
            }
            this.field1271.method3396(var1.field2323.field2399, 0, var1.field2317);
            this.field1263 -= var1.field2317;
            var1.method3812();
            var1.field2323.method3306();
            var1.method3228();
        }
    }

    @ObfuscatedName("cu.e(Lfv;I)V")
    public final void method1884(class175 arg0) {
        this.field1262.method3795(arg0);
        arg0.field2317 = arg0.field2323.field2397;
        arg0.field2323.field2397 = 0;
        this.field1263 += arg0.field2317;
    }

    @ObfuscatedName("cu.b(Lfx;I)V")
    public void method1885(class160 arg0) {
        this.field1272 = arg0;
    }

    @ObfuscatedName("cu.l(B)V")
    public void method1900() {
        if (this.field1272 != null) {
            this.field1272.method3098();
            this.field1272 = null;
        }
    }

    @ObfuscatedName("cu.w(I)V")
    public void method1887() {
        this.field1272 = null;
    }

    @ObfuscatedName("cu.d(I)Lfx;")
    public class160 method1888() {
        return this.field1272;
    }
}
