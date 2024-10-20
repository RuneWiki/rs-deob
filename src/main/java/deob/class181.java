package deob;

import java.util.Iterator;
import java.util.LinkedList;

@ObfuscatedName("fr")
public class class181 {

    @ObfuscatedName("fr.l")
    public int field2052 = -1;

    @ObfuscatedName("fr.q")
    public String field2045;

    @ObfuscatedName("fr.f")
    public String field2044;

    @ObfuscatedName("fr.j")
    public int field2043 = -1;

    @ObfuscatedName("fr.m")
    public int field2046 = -1;

    @ObfuscatedName("fr.k")
    public class258 field2047 = null;

    @ObfuscatedName("fr.t")
    public int field2042 = Integer.MAX_VALUE;

    @ObfuscatedName("fr.a")
    public int field2048 = 0;

    @ObfuscatedName("fr.e")
    public int field2050 = Integer.MAX_VALUE;

    @ObfuscatedName("fr.i")
    public int field2051 = 0;

    @ObfuscatedName("fr.y")
    public boolean field2049 = false;

    @ObfuscatedName("fr.w")
    public LinkedList field2053;

    @ObfuscatedName("fr.l(Lot;IB)V")
    public void method3234(class401 arg0, int arg1) {
        this.field2052 = arg1;
        this.field2045 = arg0.method6474();
        this.field2044 = arg0.method6474();
        this.field2047 = new class258(arg0.method6277());
        this.field2043 = arg0.method6277();
        arg0.method6272();
        this.field2049 = arg0.method6272() == 1;
        this.field2046 = arg0.method6272();
        int var3 = arg0.method6272();
        this.field2053 = new LinkedList();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2053.add(this.method3235(arg0));
        }
        this.method3240();
    }

    @ObfuscatedName("fr.q(Lot;B)Lgl;")
    public class201 method3235(class401 arg0) {
        int var2 = arg0.method6272();
        class189[] var3 = new class189[] { class189.field2136, class189.field2133, class189.field2134, class189.field2142 };
        class189 var4 = (class189) class304.method2484(var3, var2);
        Object var5 = null;
        Object var6;
        switch(var4.field2135) {
            case 0:
                var6 = new class185();
                break;
            case 1:
                var6 = new class198();
                break;
            case 2:
                var6 = new class188();
                break;
            case 3:
                var6 = new class180();
                break;
            default:
                throw new IllegalStateException("");
        }
        ((class201) var6).method3217(arg0);
        return (class201) var6;
    }

    @ObfuscatedName("fr.f(IIII)Z")
    public boolean method3236(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field2053.iterator();
        class201 var5;
        do {
            if (!var4.hasNext()) {
                return false;
            }
            var5 = (class201) var4.next();
        } while (!var5.method3214(arg0, arg1, arg2));
        return true;
    }

    @ObfuscatedName("fr.j(III)Z")
    public boolean method3253(int arg0, int arg1) {
        int var3 = arg0 / 64;
        int var4 = arg1 / 64;
        if (var3 < this.field2042 || var3 > this.field2048) {
            return false;
        } else if (var4 >= this.field2050 && var4 <= this.field2051) {
            Iterator var5 = this.field2053.iterator();
            class201 var6;
            do {
                if (!var5.hasNext()) {
                    return false;
                }
                var6 = (class201) var5.next();
            } while (!var6.method3219(arg0, arg1));
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("fr.m(IIII)[I")
    public int[] method3238(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field2053.iterator();
        class201 var5;
        do {
            if (!var4.hasNext()) {
                return null;
            }
            var5 = (class201) var4.next();
        } while (!var5.method3214(arg0, arg1, arg2));
        return var5.method3225(arg0, arg1, arg2);
    }

    @ObfuscatedName("fr.k(III)Lic;")
    public class258 method3254(int arg0, int arg1) {
        Iterator var3 = this.field2053.iterator();
        class201 var4;
        do {
            if (!var3.hasNext()) {
                return null;
            }
            var4 = (class201) var3.next();
        } while (!var4.method3219(arg0, arg1));
        return var4.method3216(arg0, arg1);
    }

    @ObfuscatedName("fr.t(I)V")
    public void method3240() {
        Iterator var1 = this.field2053.iterator();
        while (var1.hasNext()) {
            class201 var2 = (class201) var1.next();
            var2.method3212(this);
        }
    }

    @ObfuscatedName("fr.a(I)I")
    public int method3241() {
        return this.field2052;
    }

    @ObfuscatedName("fr.e(B)Z")
    public boolean method3278() {
        return this.field2049;
    }

    @ObfuscatedName("fr.i(I)Ljava/lang/String;")
    public String method3243() {
        return this.field2045;
    }

    @ObfuscatedName("fr.y(I)Ljava/lang/String;")
    public String method3244() {
        return this.field2044;
    }

    @ObfuscatedName("fr.w(B)I")
    public int method3245() {
        return this.field2043;
    }

    @ObfuscatedName("fr.g(I)I")
    public int method3246() {
        return this.field2046;
    }

    @ObfuscatedName("fr.v(I)I")
    public int method3247() {
        return this.field2042;
    }

    @ObfuscatedName("fr.s(I)I")
    public int method3248() {
        return this.field2048;
    }

    @ObfuscatedName("fr.c(I)I")
    public int method3249() {
        return this.field2050;
    }

    @ObfuscatedName("fr.b(I)I")
    public int method3250() {
        return this.field2051;
    }

    @ObfuscatedName("fr.x(I)I")
    public int method3268() {
        return this.field2047.field3012;
    }

    @ObfuscatedName("fr.p(B)I")
    public int method3252() {
        return this.field2047.field3015;
    }

    @ObfuscatedName("fr.z(I)I")
    public int method3242() {
        return this.field2047.field3013;
    }

    @ObfuscatedName("fr.h(B)Lic;")
    public class258 method3302() {
        return new class258(this.field2047);
    }
}
