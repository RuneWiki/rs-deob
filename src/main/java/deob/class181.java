package deob;

import java.util.Iterator;
import java.util.LinkedList;

@ObfuscatedName("fr")
public class class181 {

    @ObfuscatedName("fr.n")
    public int field2043 = -1;

    @ObfuscatedName("fr.c")
    public String field2039;

    @ObfuscatedName("fr.m")
    public String field2038;

    @ObfuscatedName("fr.k")
    public int field2037 = -1;

    @ObfuscatedName("fr.o")
    public int field2046 = -1;

    @ObfuscatedName("fr.g")
    public class258 field2034 = null;

    @ObfuscatedName("fr.z")
    public int field2040 = Integer.MAX_VALUE;

    @ObfuscatedName("fr.a")
    public int field2041 = 0;

    @ObfuscatedName("fr.u")
    public int field2035 = Integer.MAX_VALUE;

    @ObfuscatedName("fr.e")
    public int field2042 = 0;

    @ObfuscatedName("fr.l")
    public boolean field2044 = false;

    @ObfuscatedName("fr.y")
    public LinkedList field2045;

    @ObfuscatedName("fr.n(Lot;IS)V")
    public void method3183(class400 arg0, int arg1) {
        this.field2043 = arg1;
        this.field2039 = arg0.method6226();
        this.field2038 = arg0.method6226();
        this.field2034 = new class258(arg0.method6222());
        this.field2037 = arg0.method6222();
        arg0.method6217();
        this.field2044 = arg0.method6217() == 1;
        this.field2046 = arg0.method6217();
        int var3 = arg0.method6217();
        this.field2045 = new LinkedList();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2045.add(this.method3184(arg0));
        }
        this.method3248();
    }

    @ObfuscatedName("fr.c(Lot;I)Lge;")
    public class201 method3184(class400 arg0) {
        int var2 = arg0.method6217();
        class189 var3 = (class189) class304.method4518(class189.method3473(), var2);
        Object var4 = null;
        Object var5;
        switch(var3.field2127) {
            case 0:
                var5 = new class198();
                break;
            case 1:
                var5 = new class188();
                break;
            case 2:
                var5 = new class185();
                break;
            case 3:
                var5 = new class180();
                break;
            default:
                throw new IllegalStateException("");
        }
        ((class201) var5).method3179(arg0);
        return (class201) var5;
    }

    @ObfuscatedName("fr.m(IIIS)Z")
    public boolean method3185(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field2045.iterator();
        class201 var5;
        do {
            if (!var4.hasNext()) {
                return false;
            }
            var5 = (class201) var4.next();
        } while (!var5.method3174(arg0, arg1, arg2));
        return true;
    }

    @ObfuscatedName("fr.k(IIB)Z")
    public boolean method3217(int arg0, int arg1) {
        int var3 = arg0 / 64;
        int var4 = arg1 / 64;
        if (var3 < this.field2040 || var3 > this.field2041) {
            return false;
        } else if (var4 >= this.field2035 && var4 <= this.field2042) {
            Iterator var5 = this.field2045.iterator();
            class201 var6;
            do {
                if (!var5.hasNext()) {
                    return false;
                }
                var6 = (class201) var5.next();
            } while (!var6.method3180(arg0, arg1));
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("fr.o(IIII)[I")
    public int[] method3263(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field2045.iterator();
        class201 var5;
        do {
            if (!var4.hasNext()) {
                return null;
            }
            var5 = (class201) var4.next();
        } while (!var5.method3174(arg0, arg1, arg2));
        return var5.method3175(arg0, arg1, arg2);
    }

    @ObfuscatedName("fr.g(III)Liy;")
    public class258 method3188(int arg0, int arg1) {
        Iterator var3 = this.field2045.iterator();
        class201 var4;
        do {
            if (!var3.hasNext()) {
                return null;
            }
            var4 = (class201) var3.next();
        } while (!var4.method3180(arg0, arg1));
        return var4.method3166(arg0, arg1);
    }

    @ObfuscatedName("fr.z(B)V")
    public void method3248() {
        Iterator var1 = this.field2045.iterator();
        while (var1.hasNext()) {
            class201 var2 = (class201) var1.next();
            var2.method3162(this);
        }
    }

    @ObfuscatedName("fr.a(I)I")
    public int method3187() {
        return this.field2043;
    }

    @ObfuscatedName("fr.u(I)Z")
    public boolean method3191() {
        return this.field2044;
    }

    @ObfuscatedName("fr.e(S)Ljava/lang/String;")
    public String method3192() {
        return this.field2039;
    }

    @ObfuscatedName("fr.l(I)Ljava/lang/String;")
    public String method3228() {
        return this.field2038;
    }

    @ObfuscatedName("fr.y(B)I")
    public int method3190() {
        return this.field2037;
    }

    @ObfuscatedName("fr.v(I)I")
    public int method3195() {
        return this.field2046;
    }

    @ObfuscatedName("fr.f(B)I")
    public int method3196() {
        return this.field2040;
    }

    @ObfuscatedName("fr.s(I)I")
    public int method3197() {
        return this.field2041;
    }

    @ObfuscatedName("fr.h(I)I")
    public int method3198() {
        return this.field2035;
    }

    @ObfuscatedName("fr.d(I)I")
    public int method3244() {
        return this.field2042;
    }

    @ObfuscatedName("fr.q(I)I")
    public int method3200() {
        return this.field2034.field3007;
    }

    @ObfuscatedName("fr.j(I)I")
    public int method3218() {
        return this.field2034.field3006;
    }

    @ObfuscatedName("fr.x(B)I")
    public int method3202() {
        return this.field2034.field3008;
    }

    @ObfuscatedName("fr.b(I)Liy;")
    public class258 method3236() {
        return new class258(this.field2034);
    }
}
