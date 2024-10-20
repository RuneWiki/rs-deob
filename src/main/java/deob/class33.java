package deob;

import java.util.Iterator;
import java.util.LinkedList;

@ObfuscatedName("aq")
public class class33 {

    @ObfuscatedName("aq.w")
    public int field462 = -1;

    @ObfuscatedName("aq.o")
    public String field466;

    @ObfuscatedName("aq.x")
    public String field463;

    @ObfuscatedName("aq.k")
    public int field464 = -1;

    @ObfuscatedName("aq.f")
    public int field465 = -1;

    @ObfuscatedName("aq.i")
    public class216 field475 = null;

    @ObfuscatedName("aq.j")
    public int field461 = Integer.MAX_VALUE;

    @ObfuscatedName("aq.m")
    public int field468 = 0;

    @ObfuscatedName("aq.u")
    public int field474 = Integer.MAX_VALUE;

    @ObfuscatedName("aq.r")
    public int field470 = 0;

    @ObfuscatedName("aq.v")
    public boolean field471 = false;

    @ObfuscatedName("aq.h")
    public LinkedList field472;

    @ObfuscatedName("aq.w(Lfi;IB)V")
    public void method319(class177 arg0, int arg1) {
        this.field462 = arg1;
        this.field466 = arg0.method2892();
        this.field463 = arg0.method2892();
        this.field475 = new class216(arg0.method2904());
        this.field464 = arg0.method2904();
        arg0.method2931();
        this.field471 = arg0.method2931() == 1;
        this.field465 = arg0.method2931();
        int var3 = arg0.method2931();
        this.field472 = new LinkedList();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field472.add(this.method251(arg0));
        }
        this.method256();
    }

    @ObfuscatedName("aq.o(Lfi;I)Laj;")
    public class43 method251(class177 arg0) {
        int var2 = arg0.method2931();
        class28[] var3 = new class28[] { class28.field413, class28.field407, class28.field410, class28.field405 };
        class28 var4 = (class28) class172.method1461(var3, var2);
        Object var5 = null;
        Object var6;
        switch(var4.field409) {
            case 0:
                var6 = new class39();
                break;
            case 1:
                var6 = new class49();
                break;
            case 2:
                var6 = new class31();
                break;
            case 3:
                var6 = new class27();
                break;
            default:
                throw new IllegalStateException("");
        }
        ((class43) var6).method181(arg0);
        return (class43) var6;
    }

    @ObfuscatedName("aq.x(IIII)Z")
    public boolean method252(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field472.iterator();
        class43 var5;
        do {
            if (!var4.hasNext()) {
                return false;
            }
            var5 = (class43) var4.next();
        } while (!var5.method177(arg0, arg1, arg2));
        return true;
    }

    @ObfuscatedName("aq.k(III)Z")
    public boolean method253(int arg0, int arg1) {
        int var3 = arg0 / 64;
        int var4 = arg1 / 64;
        if (var3 < this.field461 || var3 > this.field468) {
            return false;
        } else if (var4 >= this.field474 && var4 <= this.field470) {
            Iterator var5 = this.field472.iterator();
            class43 var6;
            do {
                if (!var5.hasNext()) {
                    return false;
                }
                var6 = (class43) var5.next();
            } while (!var6.method176(arg0, arg1));
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("aq.f(IIII)[I")
    public int[] method302(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field472.iterator();
        class43 var5;
        do {
            if (!var4.hasNext()) {
                return null;
            }
            var5 = (class43) var4.next();
        } while (!var5.method177(arg0, arg1, arg2));
        return var5.method179(arg0, arg1, arg2);
    }

    @ObfuscatedName("aq.i(IIB)Lhp;")
    public class216 method255(int arg0, int arg1) {
        Iterator var3 = this.field472.iterator();
        class43 var4;
        do {
            if (!var3.hasNext()) {
                return null;
            }
            var4 = (class43) var3.next();
        } while (!var4.method176(arg0, arg1));
        return var4.method180(arg0, arg1);
    }

    @ObfuscatedName("aq.j(I)V")
    public void method256() {
        Iterator var1 = this.field472.iterator();
        while (var1.hasNext()) {
            class43 var2 = (class43) var1.next();
            var2.method203(this);
        }
    }

    @ObfuscatedName("aq.m(B)I")
    public int method257() {
        return this.field462;
    }

    @ObfuscatedName("aq.u(I)Z")
    public boolean method258() {
        return this.field471;
    }

    @ObfuscatedName("aq.h(I)Ljava/lang/String;")
    public String method259() {
        return this.field466;
    }

    @ObfuscatedName("aq.a(I)Ljava/lang/String;")
    public String method260() {
        return this.field463;
    }

    @ObfuscatedName("aq.p(I)I")
    public int method268() {
        return this.field464;
    }

    @ObfuscatedName("aq.q(B)I")
    public int method262() {
        return this.field465;
    }

    @ObfuscatedName("aq.l(I)I")
    public int method294() {
        return this.field461;
    }

    @ObfuscatedName("aq.c(B)I")
    public int method261() {
        return this.field468;
    }

    @ObfuscatedName("aq.n(B)I")
    public int method264() {
        return this.field474;
    }

    @ObfuscatedName("aq.z(I)I")
    public int method308() {
        return this.field470;
    }

    @ObfuscatedName("aq.e(I)I")
    public int method266() {
        return this.field475.field2622;
    }

    @ObfuscatedName("aq.t(I)I")
    public int method267() {
        return this.field475.field2621;
    }

    @ObfuscatedName("aq.b(I)I")
    public int method249() {
        return this.field475.field2620;
    }

    @ObfuscatedName("aq.s(I)Lhp;")
    public class216 method269() {
        return new class216(this.field475);
    }
}
