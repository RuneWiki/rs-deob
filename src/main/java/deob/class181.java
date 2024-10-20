package deob;

import java.util.Iterator;
import java.util.LinkedList;

@ObfuscatedName("fb")
public class class181 {

    @ObfuscatedName("fb.i")
    public int field2045 = -1;

    @ObfuscatedName("fb.w")
    public String field2041;

    @ObfuscatedName("fb.s")
    public String field2042;

    @ObfuscatedName("fb.a")
    public int field2050 = -1;

    @ObfuscatedName("fb.o")
    public int field2044 = -1;

    @ObfuscatedName("fb.g")
    public class258 field2043 = null;

    @ObfuscatedName("fb.e")
    public int field2046 = Integer.MAX_VALUE;

    @ObfuscatedName("fb.p")
    public int field2047 = 0;

    @ObfuscatedName("fb.j")
    public int field2048 = Integer.MAX_VALUE;

    @ObfuscatedName("fb.b")
    public int field2052 = 0;

    @ObfuscatedName("fb.x")
    public boolean field2054 = false;

    @ObfuscatedName("fb.y")
    public LinkedList field2051;

    @ObfuscatedName("fb.i(Lop;IB)V")
    public void method3266(class401 arg0, int arg1) {
        this.field2045 = arg1;
        this.field2041 = arg0.method6335();
        this.field2042 = arg0.method6335();
        this.field2043 = new class258(arg0.method6245());
        this.field2050 = arg0.method6245();
        arg0.method6240();
        this.field2054 = arg0.method6240() == 1;
        this.field2044 = arg0.method6240();
        int var3 = arg0.method6240();
        this.field2051 = new LinkedList();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2051.add(this.method3267(arg0));
        }
        this.method3272();
    }

    @ObfuscatedName("fb.w(Lop;I)Lgx;")
    public class201 method3267(class401 arg0) {
        int var2 = arg0.method6240();
        class189[] var3 = new class189[] { class189.field2134, class189.field2142, class189.field2143, class189.field2135 };
        class189 var4 = (class189) class304.method2319(var3, var2);
        Object var5 = null;
        Object var6;
        switch(var4.field2137) {
            case 0:
                var6 = new class185();
                break;
            case 1:
                var6 = new class198();
                break;
            case 2:
                var6 = new class180();
                break;
            case 3:
                var6 = new class188();
                break;
            default:
                throw new IllegalStateException("");
        }
        ((class201) var6).method3245(arg0);
        return (class201) var6;
    }

    @ObfuscatedName("fb.s(IIII)Z")
    public boolean method3268(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field2051.iterator();
        class201 var5;
        do {
            if (!var4.hasNext()) {
                return false;
            }
            var5 = (class201) var4.next();
        } while (!var5.method3241(arg0, arg1, arg2));
        return true;
    }

    @ObfuscatedName("fb.a(IIB)Z")
    public boolean method3320(int arg0, int arg1) {
        int var3 = arg0 / 64;
        int var4 = arg1 / 64;
        if (var3 < this.field2046 || var3 > this.field2047) {
            return false;
        } else if (var4 >= this.field2048 && var4 <= this.field2052) {
            Iterator var5 = this.field2051.iterator();
            class201 var6;
            do {
                if (!var5.hasNext()) {
                    return false;
                }
                var6 = (class201) var5.next();
            } while (!var6.method3242(arg0, arg1));
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("fb.o(IIIB)[I")
    public int[] method3270(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field2051.iterator();
        class201 var5;
        do {
            if (!var4.hasNext()) {
                return null;
            }
            var5 = (class201) var4.next();
        } while (!var5.method3241(arg0, arg1, arg2));
        return var5.method3243(arg0, arg1, arg2);
    }

    @ObfuscatedName("fb.g(IIB)Lie;")
    public class258 method3271(int arg0, int arg1) {
        Iterator var3 = this.field2051.iterator();
        class201 var4;
        do {
            if (!var3.hasNext()) {
                return null;
            }
            var4 = (class201) var3.next();
        } while (!var4.method3242(arg0, arg1));
        return var4.method3262(arg0, arg1);
    }

    @ObfuscatedName("fb.e(I)V")
    public void method3272() {
        Iterator var1 = this.field2051.iterator();
        while (var1.hasNext()) {
            class201 var2 = (class201) var1.next();
            var2.method3240(this);
        }
    }

    @ObfuscatedName("fb.p(I)I")
    public int method3277() {
        return this.field2045;
    }

    @ObfuscatedName("fb.j(B)Z")
    public boolean method3265() {
        return this.field2054;
    }

    @ObfuscatedName("fb.b(B)Ljava/lang/String;")
    public String method3303() {
        return this.field2041;
    }

    @ObfuscatedName("fb.x(I)Ljava/lang/String;")
    public String method3304() {
        return this.field2042;
    }

    @ObfuscatedName("fb.y(I)I")
    public int method3329() {
        return this.field2050;
    }

    @ObfuscatedName("fb.k(I)I")
    public int method3278() {
        return this.field2044;
    }

    @ObfuscatedName("fb.t(I)I")
    public int method3279() {
        return this.field2046;
    }

    @ObfuscatedName("fb.l(B)I")
    public int method3280() {
        return this.field2047;
    }

    @ObfuscatedName("fb.u(I)I")
    public int method3281() {
        return this.field2048;
    }

    @ObfuscatedName("fb.n(I)I")
    public int method3282() {
        return this.field2052;
    }

    @ObfuscatedName("fb.z(S)I")
    public int method3283() {
        return this.field2043.field3017;
    }

    @ObfuscatedName("fb.q(B)I")
    public int method3284() {
        return this.field2043.field3018;
    }

    @ObfuscatedName("fb.d(I)I")
    public int method3295() {
        return this.field2043.field3016;
    }

    @ObfuscatedName("fb.r(B)Lie;")
    public class258 method3319() {
        return new class258(this.field2043);
    }
}
