package deob;

import java.util.Iterator;
import java.util.LinkedList;

@ObfuscatedName("eq")
public class class144 {

    @ObfuscatedName("eq.f")
    public int field1608 = -1;

    @ObfuscatedName("eq.o")
    public String field1595;

    @ObfuscatedName("eq.u")
    public String field1596;

    @ObfuscatedName("eq.p")
    public int field1606 = -1;

    @ObfuscatedName("eq.b")
    public int field1598 = -1;

    @ObfuscatedName("eq.e")
    public class221 field1597 = null;

    @ObfuscatedName("eq.k")
    public int field1600 = Integer.MAX_VALUE;

    @ObfuscatedName("eq.g")
    public int field1601 = 0;

    @ObfuscatedName("eq.h")
    public int field1602 = Integer.MAX_VALUE;

    @ObfuscatedName("eq.n")
    public int field1594 = 0;

    @ObfuscatedName("eq.l")
    public boolean field1604 = false;

    @ObfuscatedName("eq.m")
    public LinkedList field1605;

    @ObfuscatedName("eq.f(Lnu;II)V")
    public void method2487(class382 arg0, int arg1) {
        this.field1608 = arg1;
        this.field1595 = arg0.method5865();
        this.field1596 = arg0.method5865();
        this.field1597 = new class221(arg0.method5861());
        this.field1606 = arg0.method5861();
        arg0.method5856();
        this.field1604 = arg0.method5856() == 1;
        this.field1598 = arg0.method5856();
        int var3 = arg0.method5856();
        this.field1605 = new LinkedList();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field1605.add(this.method2415(arg0));
        }
        this.method2420();
    }

    @ObfuscatedName("eq.o(Lnu;I)Lfv;")
    public class164 method2415(class382 arg0) {
        int var2 = arg0.method5856();
        class152[] var3 = new class152[] { class152.field1689, class152.field1686, class152.field1683, class152.field1685 };
        class152 var4 = (class152) class267.method2139(var3, var2);
        Object var5 = null;
        Object var6;
        switch(var4.field1687) {
            case 0:
                var6 = new class148();
                break;
            case 1:
                var6 = new class161();
                break;
            case 2:
                var6 = new class143();
                break;
            case 3:
                var6 = new class151();
                break;
            default:
                throw new IllegalStateException("");
        }
        ((class164) var6).method2388(arg0);
        return (class164) var6;
    }

    @ObfuscatedName("eq.u(IIII)Z")
    public boolean method2416(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field1605.iterator();
        class164 var5;
        do {
            if (!var4.hasNext()) {
                return false;
            }
            var5 = (class164) var4.next();
        } while (!var5.method2392(arg0, arg1, arg2));
        return true;
    }

    @ObfuscatedName("eq.p(III)Z")
    public boolean method2417(int arg0, int arg1) {
        int var3 = arg0 / 64;
        int var4 = arg1 / 64;
        if (var3 < this.field1600 || var3 > this.field1601) {
            return false;
        } else if (var4 >= this.field1602 && var4 <= this.field1594) {
            Iterator var5 = this.field1605.iterator();
            class164 var6;
            do {
                if (!var5.hasNext()) {
                    return false;
                }
                var6 = (class164) var5.next();
            } while (!var6.method2390(arg0, arg1));
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("eq.b(IIII)[I")
    public int[] method2418(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field1605.iterator();
        class164 var5;
        do {
            if (!var4.hasNext()) {
                return null;
            }
            var5 = (class164) var4.next();
        } while (!var5.method2392(arg0, arg1, arg2));
        return var5.method2391(arg0, arg1, arg2);
    }

    @ObfuscatedName("eq.e(III)Lhk;")
    public class221 method2419(int arg0, int arg1) {
        Iterator var3 = this.field1605.iterator();
        class164 var4;
        do {
            if (!var3.hasNext()) {
                return null;
            }
            var4 = (class164) var3.next();
        } while (!var4.method2390(arg0, arg1));
        return var4.method2387(arg0, arg1);
    }

    @ObfuscatedName("eq.k(I)V")
    public void method2420() {
        Iterator var1 = this.field1605.iterator();
        while (var1.hasNext()) {
            class164 var2 = (class164) var1.next();
            var2.method2409(this);
        }
    }

    @ObfuscatedName("eq.g(I)I")
    public int method2441() {
        return this.field1608;
    }

    @ObfuscatedName("eq.h(I)Z")
    public boolean method2422() {
        return this.field1604;
    }

    @ObfuscatedName("eq.n(I)Ljava/lang/String;")
    public String method2423() {
        return this.field1595;
    }

    @ObfuscatedName("eq.l(B)Ljava/lang/String;")
    public String method2446() {
        return this.field1596;
    }

    @ObfuscatedName("eq.m(I)I")
    public int method2433() {
        return this.field1606;
    }

    @ObfuscatedName("eq.d(I)I")
    public int method2458() {
        return this.field1598;
    }

    @ObfuscatedName("eq.c(B)I")
    public int method2464() {
        return this.field1600;
    }

    @ObfuscatedName("eq.j(B)I")
    public int method2428() {
        return this.field1601;
    }

    @ObfuscatedName("eq.r(I)I")
    public int method2429() {
        return this.field1602;
    }

    @ObfuscatedName("eq.q(I)I")
    public int method2468() {
        return this.field1594;
    }

    @ObfuscatedName("eq.t(I)I")
    public int method2431() {
        return this.field1597.field2586;
    }

    @ObfuscatedName("eq.v(S)I")
    public int method2432() {
        return this.field1597.field2591;
    }

    @ObfuscatedName("eq.x(B)I")
    public int method2439() {
        return this.field1597.field2588;
    }

    @ObfuscatedName("eq.z(I)Lhk;")
    public class221 method2434() {
        return new class221(this.field1597);
    }
}
