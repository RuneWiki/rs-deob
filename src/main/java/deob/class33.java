package deob;

import java.util.Iterator;
import java.util.LinkedList;

@ObfuscatedName("aq")
public class class33 {

    @ObfuscatedName("aq.s")
    public int field466 = -1;

    @ObfuscatedName("aq.c")
    public String field457;

    @ObfuscatedName("aq.f")
    public String field462;

    @ObfuscatedName("aq.m")
    public int field459 = -1;

    @ObfuscatedName("aq.h")
    public int field456 = -1;

    @ObfuscatedName("aq.t")
    public class216 field461 = null;

    @ObfuscatedName("aq.p")
    public int field467 = Integer.MAX_VALUE;

    @ObfuscatedName("aq.d")
    public int field463 = 0;

    @ObfuscatedName("aq.n")
    public int field464 = Integer.MAX_VALUE;

    @ObfuscatedName("aq.z")
    public int field465 = 0;

    @ObfuscatedName("aq.o")
    public boolean field458 = false;

    @ObfuscatedName("aq.q")
    public LinkedList field460;

    @ObfuscatedName("aq.s(Lfs;IS)V")
    public void method251(class177 arg0, int arg1) {
        this.field466 = arg1;
        this.field457 = arg0.method2973();
        this.field462 = arg0.method2973();
        this.field461 = new class216(arg0.method2970());
        this.field459 = arg0.method2970();
        arg0.method2965();
        this.field458 = arg0.method2965() == 1;
        this.field456 = arg0.method2965();
        int var3 = arg0.method2965();
        this.field460 = new LinkedList();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field460.add(this.method308(arg0));
        }
        this.method320();
    }

    @ObfuscatedName("aq.c(Lfs;I)Lac;")
    public class43 method308(class177 arg0) {
        int var2 = arg0.method2965();
        class28 var3 = (class28) class172.method1577(class28.method215(), var2);
        Object var4 = null;
        Object var5;
        switch(var3.field404) {
            case 0:
                var5 = new class49();
                break;
            case 1:
                var5 = new class39();
                break;
            case 2:
                var5 = new class27();
                break;
            case 3:
                var5 = new class31();
                break;
            default:
                throw new IllegalStateException("");
        }
        ((class43) var5).method189(arg0);
        return (class43) var5;
    }

    @ObfuscatedName("aq.f(IIIB)Z")
    public boolean method271(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field460.iterator();
        class43 var5;
        do {
            if (!var4.hasNext()) {
                return false;
            }
            var5 = (class43) var4.next();
        } while (!var5.method185(arg0, arg1, arg2));
        return true;
    }

    @ObfuscatedName("aq.m(III)Z")
    public boolean method254(int arg0, int arg1) {
        int var3 = arg0 / 64;
        int var4 = arg1 / 64;
        if (var3 < this.field467 || var3 > this.field463) {
            return false;
        } else if (var4 >= this.field464 && var4 <= this.field465) {
            Iterator var5 = this.field460.iterator();
            class43 var6;
            do {
                if (!var5.hasNext()) {
                    return false;
                }
                var6 = (class43) var5.next();
            } while (!var6.method208(arg0, arg1));
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("aq.h(IIII)[I")
    public int[] method250(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field460.iterator();
        class43 var5;
        do {
            if (!var4.hasNext()) {
                return null;
            }
            var5 = (class43) var4.next();
        } while (!var5.method185(arg0, arg1, arg2));
        return var5.method213(arg0, arg1, arg2);
    }

    @ObfuscatedName("aq.t(IIB)Lhp;")
    public class216 method256(int arg0, int arg1) {
        Iterator var3 = this.field460.iterator();
        class43 var4;
        do {
            if (!var3.hasNext()) {
                return null;
            }
            var4 = (class43) var3.next();
        } while (!var4.method208(arg0, arg1));
        return var4.method188(arg0, arg1);
    }

    @ObfuscatedName("aq.p(I)V")
    public void method320() {
        Iterator var1 = this.field460.iterator();
        while (var1.hasNext()) {
            class43 var2 = (class43) var1.next();
            var2.method184(this);
        }
    }

    @ObfuscatedName("aq.d(I)I")
    public int method258() {
        return this.field466;
    }

    @ObfuscatedName("aq.n(I)Z")
    public boolean method259() {
        return this.field458;
    }

    @ObfuscatedName("aq.z(I)Ljava/lang/String;")
    public String method260() {
        return this.field457;
    }

    @ObfuscatedName("aq.o(B)Ljava/lang/String;")
    public String method261() {
        return this.field462;
    }

    @ObfuscatedName("aq.u(I)I")
    public int method269() {
        return this.field459;
    }

    @ObfuscatedName("aq.r(I)I")
    public int method275() {
        return this.field456;
    }

    @ObfuscatedName("aq.l(I)I")
    public int method307() {
        return this.field467;
    }

    @ObfuscatedName("aq.y(I)I")
    public int method265() {
        return this.field463;
    }

    @ObfuscatedName("aq.w(B)I")
    public int method263() {
        return this.field464;
    }

    @ObfuscatedName("aq.i(I)I")
    public int method267() {
        return this.field465;
    }

    @ObfuscatedName("aq.g(B)I")
    public int method298() {
        return this.field461.field2626;
    }

    @ObfuscatedName("aq.a(I)I")
    public int method262() {
        return this.field461.field2631;
    }

    @ObfuscatedName("aq.x(I)I")
    public int method270() {
        return this.field461.field2632;
    }

    @ObfuscatedName("aq.j(I)Lhp;")
    public class216 method305() {
        return new class216(this.field461);
    }
}
