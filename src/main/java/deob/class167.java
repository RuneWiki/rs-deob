package deob;

import java.util.Iterator;
import java.util.LinkedList;

@ObfuscatedName("fa")
public class class167 {

    @ObfuscatedName("fa.f")
    public int field1974 = -1;

    @ObfuscatedName("fa.e")
    public String field1969;

    @ObfuscatedName("fa.v")
    public String field1970;

    @ObfuscatedName("fa.y")
    public int field1971 = -1;

    @ObfuscatedName("fa.j")
    public int field1972 = -1;

    @ObfuscatedName("fa.o")
    public class244 field1977 = null;

    @ObfuscatedName("fa.m")
    public int field1973 = Integer.MAX_VALUE;

    @ObfuscatedName("fa.r")
    public int field1980 = 0;

    @ObfuscatedName("fa.h")
    public int field1976 = Integer.MAX_VALUE;

    @ObfuscatedName("fa.d")
    public int field1968 = 0;

    @ObfuscatedName("fa.z")
    public boolean field1975 = false;

    @ObfuscatedName("fa.b")
    public LinkedList field1979;

    @ObfuscatedName("fa.f(Lnt;II)V")
    public void method3064(class384 arg0, int arg1) {
        this.field1974 = arg1;
        this.field1969 = arg0.method5906();
        this.field1970 = arg0.method5906();
        this.field1977 = new class244(arg0.method5965());
        this.field1971 = arg0.method5965();
        arg0.method5902();
        this.field1975 = arg0.method5902() == 1;
        this.field1972 = arg0.method5902();
        int var3 = arg0.method5902();
        this.field1979 = new LinkedList();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field1979.add(this.method3053(arg0));
        }
        this.method3045();
    }

    @ObfuscatedName("fa.e(Lnt;S)Lge;")
    public class187 method3053(class384 arg0) {
        int var2 = arg0.method5902();
        class175 var3 = (class175) class290.method2391(class175.method3286(), var2);
        Object var4 = null;
        Object var5;
        switch(var3.field2055) {
            case 0:
                var5 = new class166();
                break;
            case 1:
                var5 = new class184();
                break;
            case 2:
                var5 = new class174();
                break;
            case 3:
                var5 = new class171();
                break;
            default:
                throw new IllegalStateException("");
        }
        ((class187) var5).method2995(arg0);
        return (class187) var5;
    }

    @ObfuscatedName("fa.v(IIII)Z")
    public boolean method3021(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field1979.iterator();
        class187 var5;
        do {
            if (!var4.hasNext()) {
                return false;
            }
            var5 = (class187) var4.next();
        } while (!var5.method3004(arg0, arg1, arg2));
        return true;
    }

    @ObfuscatedName("fa.y(III)Z")
    public boolean method3022(int arg0, int arg1) {
        int var3 = arg0 / 64;
        int var4 = arg1 / 64;
        if (var3 < this.field1973 || var3 > this.field1980) {
            return false;
        } else if (var4 >= this.field1976 && var4 <= this.field1968) {
            Iterator var5 = this.field1979.iterator();
            class187 var6;
            do {
                if (!var5.hasNext()) {
                    return false;
                }
                var6 = (class187) var5.next();
            } while (!var6.method3017(arg0, arg1));
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("fa.j(IIIS)[I")
    public int[] method3023(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field1979.iterator();
        class187 var5;
        do {
            if (!var4.hasNext()) {
                return null;
            }
            var5 = (class187) var4.next();
        } while (!var5.method3004(arg0, arg1, arg2));
        return var5.method2993(arg0, arg1, arg2);
    }

    @ObfuscatedName("fa.o(III)Liw;")
    public class244 method3024(int arg0, int arg1) {
        Iterator var3 = this.field1979.iterator();
        class187 var4;
        do {
            if (!var3.hasNext()) {
                return null;
            }
            var4 = (class187) var3.next();
        } while (!var4.method3017(arg0, arg1));
        return var4.method2994(arg0, arg1);
    }

    @ObfuscatedName("fa.m(B)V")
    public void method3045() {
        Iterator var1 = this.field1979.iterator();
        while (var1.hasNext()) {
            class187 var2 = (class187) var1.next();
            var2.method2991(this);
        }
    }

    @ObfuscatedName("fa.r(I)I")
    public int method3026() {
        return this.field1974;
    }

    @ObfuscatedName("fa.h(B)Z")
    public boolean method3027() {
        return this.field1975;
    }

    @ObfuscatedName("fa.d(B)Ljava/lang/String;")
    public String method3042() {
        return this.field1969;
    }

    @ObfuscatedName("fa.z(B)Ljava/lang/String;")
    public String method3080() {
        return this.field1970;
    }

    @ObfuscatedName("fa.b(S)I")
    public int method3065() {
        return this.field1971;
    }

    @ObfuscatedName("fa.i(B)I")
    public int method3082() {
        return this.field1972;
    }

    @ObfuscatedName("fa.k(I)I")
    public int method3032() {
        return this.field1973;
    }

    @ObfuscatedName("fa.g(I)I")
    public int method3062() {
        return this.field1980;
    }

    @ObfuscatedName("fa.t(B)I")
    public int method3034() {
        return this.field1976;
    }

    @ObfuscatedName("fa.x(I)I")
    public int method3035() {
        return this.field1968;
    }

    @ObfuscatedName("fa.u(I)I")
    public int method3036() {
        return this.field1977.field2927;
    }

    @ObfuscatedName("fa.q(I)I")
    public int method3037() {
        return this.field1977.field2929;
    }

    @ObfuscatedName("fa.s(I)I")
    public int method3038() {
        return this.field1977.field2928;
    }

    @ObfuscatedName("fa.p(I)Liw;")
    public class244 method3076() {
        return new class244(this.field1977);
    }
}
