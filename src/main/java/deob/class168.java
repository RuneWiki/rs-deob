package deob;

import java.util.Iterator;
import java.util.LinkedList;

@ObfuscatedName("fa")
public class class168 {

    @ObfuscatedName("fa.s")
    public int field1950 = -1;

    @ObfuscatedName("fa.t")
    public String field1945;

    @ObfuscatedName("fa.v")
    public String field1946;

    @ObfuscatedName("fa.j")
    public int field1956 = -1;

    @ObfuscatedName("fa.l")
    public int field1948 = -1;

    @ObfuscatedName("fa.n")
    public class245 field1949 = null;

    @ObfuscatedName("fa.w")
    public int field1953 = Integer.MAX_VALUE;

    @ObfuscatedName("fa.f")
    public int field1951 = 0;

    @ObfuscatedName("fa.o")
    public int field1952 = Integer.MAX_VALUE;

    @ObfuscatedName("fa.x")
    public int field1957 = 0;

    @ObfuscatedName("fa.r")
    public boolean field1947 = false;

    @ObfuscatedName("fa.p")
    public LinkedList field1955;

    @ObfuscatedName("fa.s(Lnv;II)V")
    public void method2970(class385 arg0, int arg1) {
        this.field1950 = arg1;
        this.field1945 = arg0.method5967();
        this.field1946 = arg0.method5967();
        this.field1949 = new class245(arg0.method6182());
        this.field1956 = arg0.method6182();
        arg0.method5958();
        this.field1947 = arg0.method5958() == 1;
        this.field1948 = arg0.method5958();
        int var3 = arg0.method5958();
        this.field1955 = new LinkedList();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field1955.add(this.method2971(arg0));
        }
        this.method3012();
    }

    @ObfuscatedName("fa.t(Lnv;I)Lgx;")
    public class188 method2971(class385 arg0) {
        int var2 = arg0.method5958();
        class176 var3 = (class176) class291.method4326(class176.method3224(), var2);
        Object var4 = null;
        Object var5;
        switch(var3.field2038) {
            case 0:
                var5 = new class172();
                break;
            case 1:
                var5 = new class167();
                break;
            case 2:
                var5 = new class175();
                break;
            case 3:
                var5 = new class185();
                break;
            default:
                throw new IllegalStateException("");
        }
        ((class188) var5).method2949(arg0);
        return (class188) var5;
    }

    @ObfuscatedName("fa.v(IIII)Z")
    public boolean method2972(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field1955.iterator();
        class188 var5;
        do {
            if (!var4.hasNext()) {
                return false;
            }
            var5 = (class188) var4.next();
        } while (!var5.method2946(arg0, arg1, arg2));
        return true;
    }

    @ObfuscatedName("fa.j(IIB)Z")
    public boolean method2973(int arg0, int arg1) {
        int var3 = arg0 / 64;
        int var4 = arg1 / 64;
        if (var3 < this.field1953 || var3 > this.field1951) {
            return false;
        } else if (var4 >= this.field1952 && var4 <= this.field1957) {
            Iterator var5 = this.field1955.iterator();
            class188 var6;
            do {
                if (!var5.hasNext()) {
                    return false;
                }
                var6 = (class188) var5.next();
            } while (!var6.method2948(arg0, arg1));
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("fa.l(IIII)[I")
    public int[] method3008(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field1955.iterator();
        class188 var5;
        do {
            if (!var4.hasNext()) {
                return null;
            }
            var5 = (class188) var4.next();
        } while (!var5.method2946(arg0, arg1, arg2));
        return var5.method2962(arg0, arg1, arg2);
    }

    @ObfuscatedName("fa.n(III)Lij;")
    public class245 method2975(int arg0, int arg1) {
        Iterator var3 = this.field1955.iterator();
        class188 var4;
        do {
            if (!var3.hasNext()) {
                return null;
            }
            var4 = (class188) var3.next();
        } while (!var4.method2948(arg0, arg1));
        return var4.method2947(arg0, arg1);
    }

    @ObfuscatedName("fa.w(I)V")
    public void method3012() {
        Iterator var1 = this.field1955.iterator();
        while (var1.hasNext()) {
            class188 var2 = (class188) var1.next();
            var2.method2967(this);
        }
    }

    @ObfuscatedName("fa.f(B)I")
    public int method2977() {
        return this.field1950;
    }

    @ObfuscatedName("fa.o(I)Z")
    public boolean method2969() {
        return this.field1947;
    }

    @ObfuscatedName("fa.x(I)Ljava/lang/String;")
    public String method2979() {
        return this.field1945;
    }

    @ObfuscatedName("fa.r(I)Ljava/lang/String;")
    public String method2980() {
        return this.field1946;
    }

    @ObfuscatedName("fa.p(B)I")
    public int method2981() {
        return this.field1956;
    }

    @ObfuscatedName("fa.h(B)I")
    public int method3005() {
        return this.field1948;
    }

    @ObfuscatedName("fa.k(I)I")
    public int method3029() {
        return this.field1953;
    }

    @ObfuscatedName("fa.a(I)I")
    public int method2984() {
        return this.field1951;
    }

    @ObfuscatedName("fa.q(I)I")
    public int method2985() {
        return this.field1952;
    }

    @ObfuscatedName("fa.u(I)I")
    public int method2986() {
        return this.field1957;
    }

    @ObfuscatedName("fa.e(I)I")
    public int method2998() {
        return this.field1949.field2920;
    }

    @ObfuscatedName("fa.c(I)I")
    public int method2988() {
        return this.field1949.field2921;
    }

    @ObfuscatedName("fa.i(I)I")
    public int method2989() {
        return this.field1949.field2922;
    }

    @ObfuscatedName("fa.m(I)Lij;")
    public class245 method2990() {
        return new class245(this.field1949);
    }
}
