package deob;

import java.io.IOException;

@ObfuscatedName("cf")
public class class88 {

    @ObfuscatedName("cf.z")
    public class158 field1215;

    @ObfuscatedName("cf.w")
    public class204 field1224 = new class204();

    @ObfuscatedName("cf.s")
    public int field1217 = 0;

    @ObfuscatedName("cf.l")
    public class183 field1218 = new class183(5000);

    @ObfuscatedName("cf.u")
    public class191 field1219;

    @ObfuscatedName("cf.q")
    public class190 field1220 = new class190(40000);

    @ObfuscatedName("cf.k")
    public class169 field1221 = null;

    @ObfuscatedName("cf.i")
    public int field1226 = 0;

    @ObfuscatedName("cf.x")
    public boolean field1223 = true;

    @ObfuscatedName("cf.e")
    public int field1229 = 0;

    @ObfuscatedName("cf.p")
    public int field1225 = 0;

    @ObfuscatedName("cf.b")
    public class169 field1216;

    @ObfuscatedName("cf.n")
    public class169 field1227;

    @ObfuscatedName("cf.f")
    public class169 field1228;

    @ObfuscatedName("cf.z(B)V")
    public final void method1845() {
        this.field1224.method3722();
        this.field1217 = 0;
    }

    @ObfuscatedName("cf.w(B)V")
    public final void method1846() throws IOException {
        if (this.field1215 == null || this.field1217 <= 0) {
            return;
        }
        this.field1218.field2340 = 0;
        while (true) {
            class173 var1 = (class173) this.field1224.method3740();
            if (var1 == null || var1.field2256 > this.field1218.field2339.length - this.field1218.field2340) {
                this.field1215.method3040(this.field1218.field2339, 0, this.field1218.field2340);
                this.field1225 = 0;
                break;
            }
            this.field1218.method3245(var1.field2258.field2339, 0, var1.field2256);
            this.field1217 -= var1.field2256;
            var1.method3756();
            var1.field2258.method3234();
            var1.method3163();
        }
    }

    @ObfuscatedName("cf.s(Lfn;B)V")
    public final void method1847(class173 arg0) {
        this.field1224.method3723(arg0);
        arg0.field2256 = arg0.field2258.field2340;
        arg0.field2258.field2340 = 0;
        this.field1217 += arg0.field2256;
    }

    @ObfuscatedName("cf.l(Lfd;I)V")
    public void method1864(class158 arg0) {
        this.field1215 = arg0;
    }

    @ObfuscatedName("cf.u(S)V")
    public void method1849() {
        if (this.field1215 != null) {
            this.field1215.method3041();
            this.field1215 = null;
        }
    }

    @ObfuscatedName("cf.q(B)V")
    public void method1851() {
        this.field1215 = null;
    }

    @ObfuscatedName("cf.i(I)Lfd;")
    public class158 method1850() {
        return this.field1215;
    }
}
