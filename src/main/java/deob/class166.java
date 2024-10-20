package deob;

import java.util.Iterator;
import java.util.LinkedList;

@ObfuscatedName("fo")
public class class166 {

    @ObfuscatedName("fo.v")
    public int field1965 = -1;

    @ObfuscatedName("fo.n")
    public String field1971;

    @ObfuscatedName("fo.f")
    public String field1961;

    @ObfuscatedName("fo.y")
    public int field1962 = -1;

    @ObfuscatedName("fo.p")
    public int field1963 = -1;

    @ObfuscatedName("fo.j")
    public class243 field1964 = null;

    @ObfuscatedName("fo.r")
    public int field1968 = Integer.MAX_VALUE;

    @ObfuscatedName("fo.b")
    public int field1959 = 0;

    @ObfuscatedName("fo.d")
    public int field1967 = Integer.MAX_VALUE;

    @ObfuscatedName("fo.s")
    public int field1966 = 0;

    @ObfuscatedName("fo.u")
    public boolean field1969 = false;

    @ObfuscatedName("fo.l")
    public LinkedList field1970;

    @ObfuscatedName("fo.v(Lnd;II)V")
    public void method3019(class383 arg0, int arg1) {
        this.field1965 = arg1;
        this.field1971 = arg0.method5974();
        this.field1961 = arg0.method5974();
        this.field1964 = new class243(arg0.method5970());
        this.field1962 = arg0.method5970();
        arg0.method5965();
        this.field1969 = arg0.method5965() == 1;
        this.field1963 = arg0.method5965();
        int var3 = arg0.method5965();
        this.field1970 = new LinkedList();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field1970.add(this.method3020(arg0));
        }
        this.method3025();
    }

    @ObfuscatedName("fo.n(Lnd;I)Lgi;")
    public class186 method3020(class383 arg0) {
        int var2 = arg0.method5965();
        class174[] var3 = new class174[] { class174.field2050, class174.field2052, class174.field2051, class174.field2049 };
        class174 var4 = (class174) class289.method2163(var3, var2);
        Object var5 = null;
        Object var6;
        switch(var4.field2053) {
            case 0:
                var6 = new class165();
                break;
            case 1:
                var6 = new class173();
                break;
            case 2:
                var6 = new class183();
                break;
            case 3:
                var6 = new class170();
                break;
            default:
                throw new IllegalStateException("");
        }
        ((class186) var6).method3001(arg0);
        return (class186) var6;
    }

    @ObfuscatedName("fo.f(IIII)Z")
    public boolean method3044(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field1970.iterator();
        class186 var5;
        do {
            if (!var4.hasNext()) {
                return false;
            }
            var5 = (class186) var4.next();
        } while (!var5.method2995(arg0, arg1, arg2));
        return true;
    }

    @ObfuscatedName("fo.y(III)Z")
    public boolean method3043(int arg0, int arg1) {
        int var3 = arg0 / 64;
        int var4 = arg1 / 64;
        if (var3 < this.field1968 || var3 > this.field1959) {
            return false;
        } else if (var4 >= this.field1967 && var4 <= this.field1966) {
            Iterator var5 = this.field1970.iterator();
            class186 var6;
            do {
                if (!var5.hasNext()) {
                    return false;
                }
                var6 = (class186) var5.next();
            } while (!var6.method2998(arg0, arg1));
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("fo.p(IIIB)[I")
    public int[] method3023(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field1970.iterator();
        class186 var5;
        do {
            if (!var4.hasNext()) {
                return null;
            }
            var5 = (class186) var4.next();
        } while (!var5.method2995(arg0, arg1, arg2));
        return var5.method3002(arg0, arg1, arg2);
    }

    @ObfuscatedName("fo.j(III)Lii;")
    public class243 method3055(int arg0, int arg1) {
        Iterator var3 = this.field1970.iterator();
        class186 var4;
        do {
            if (!var3.hasNext()) {
                return null;
            }
            var4 = (class186) var3.next();
        } while (!var4.method2998(arg0, arg1));
        return var4.method3000(arg0, arg1);
    }

    @ObfuscatedName("fo.r(I)V")
    public void method3025() {
        Iterator var1 = this.field1970.iterator();
        while (var1.hasNext()) {
            class186 var2 = (class186) var1.next();
            var2.method2996(this);
        }
    }

    @ObfuscatedName("fo.b(I)I")
    public int method3026() {
        return this.field1965;
    }

    @ObfuscatedName("fo.d(B)Z")
    public boolean method3027() {
        return this.field1969;
    }

    @ObfuscatedName("fo.s(B)Ljava/lang/String;")
    public String method3028() {
        return this.field1971;
    }

    @ObfuscatedName("fo.u(I)Ljava/lang/String;")
    public String method3075() {
        return this.field1961;
    }

    @ObfuscatedName("fo.l(I)I")
    public int method3030() {
        return this.field1962;
    }

    @ObfuscatedName("fo.o(I)I")
    public int method3031() {
        return this.field1963;
    }

    @ObfuscatedName("fo.c(I)I")
    public int method3032() {
        return this.field1968;
    }

    @ObfuscatedName("fo.e(I)I")
    public int method3079() {
        return this.field1959;
    }

    @ObfuscatedName("fo.g(B)I")
    public int method3034() {
        return this.field1967;
    }

    @ObfuscatedName("fo.a(I)I")
    public int method3058() {
        return this.field1966;
    }

    @ObfuscatedName("fo.k(I)I")
    public int method3036() {
        return this.field1964.field2926;
    }

    @ObfuscatedName("fo.m(I)I")
    public int method3037() {
        return this.field1964.field2924;
    }

    @ObfuscatedName("fo.x(I)I")
    public int method3022() {
        return this.field1964.field2925;
    }

    @ObfuscatedName("fo.z(B)Lii;")
    public class243 method3050() {
        return new class243(this.field1964);
    }
}
