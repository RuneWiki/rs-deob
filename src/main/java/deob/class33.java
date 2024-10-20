package deob;

import java.util.Iterator;
import java.util.LinkedList;

@ObfuscatedName("at")
public class class33 {

    @ObfuscatedName("at.w")
    public int field468 = -1;

    @ObfuscatedName("at.s")
    public String field463;

    @ObfuscatedName("at.q")
    public String field471;

    @ObfuscatedName("at.o")
    public int field464 = -1;

    @ObfuscatedName("at.g")
    public int field466 = -1;

    @ObfuscatedName("at.v")
    public class213 field467 = null;

    @ObfuscatedName("at.p")
    public int field465 = Integer.MAX_VALUE;

    @ObfuscatedName("at.e")
    public int field469 = 0;

    @ObfuscatedName("at.d")
    public int field470 = Integer.MAX_VALUE;

    @ObfuscatedName("at.x")
    public int field462 = 0;

    @ObfuscatedName("at.z")
    public boolean field472 = false;

    @ObfuscatedName("at.n")
    public LinkedList field473;

    @ObfuscatedName("at.w(Lfz;II)V")
    public void method245(class174 arg0, int arg1) {
        this.field468 = arg1;
        this.field463 = arg0.method3111();
        this.field471 = arg0.method3111();
        this.field467 = new class213(arg0.method3131());
        this.field464 = arg0.method3131();
        arg0.method2971();
        this.field472 = arg0.method2971() == 1;
        this.field466 = arg0.method2971();
        int var3 = arg0.method2971();
        this.field473 = new LinkedList();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field473.add(this.method312(arg0));
        }
        this.method279();
    }

    @ObfuscatedName("at.s(Lfz;I)Lad;")
    public class43 method312(class174 arg0) {
        int var2 = arg0.method2971();
        class28[] var3 = new class28[] { class28.field412, class28.field407, class28.field410, class28.field408 };
        class28 var4 = (class28) class169.method233(var3, var2);
        Object var5 = null;
        Object var6;
        switch(var4.field411) {
            case 0:
                var6 = new class31();
                break;
            case 1:
                var6 = new class27();
                break;
            case 2:
                var6 = new class39();
                break;
            case 3:
                var6 = new class49();
                break;
            default:
                throw new IllegalStateException("");
        }
        ((class43) var6).method185(arg0);
        return (class43) var6;
    }

    @ObfuscatedName("at.q(IIIB)Z")
    public boolean method247(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field473.iterator();
        class43 var5;
        do {
            if (!var4.hasNext()) {
                return false;
            }
            var5 = (class43) var4.next();
        } while (!var5.method181(arg0, arg1, arg2));
        return true;
    }

    @ObfuscatedName("at.o(IIB)Z")
    public boolean method267(int arg0, int arg1) {
        int var3 = arg0 / 64;
        int var4 = arg1 / 64;
        if (var3 < this.field465 || var3 > this.field469) {
            return false;
        } else if (var4 >= this.field470 && var4 <= this.field462) {
            Iterator var5 = this.field473.iterator();
            class43 var6;
            do {
                if (!var5.hasNext()) {
                    return false;
                }
                var6 = (class43) var5.next();
            } while (!var6.method182(arg0, arg1));
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("at.g(IIII)[I")
    public int[] method291(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field473.iterator();
        class43 var5;
        do {
            if (!var4.hasNext()) {
                return null;
            }
            var5 = (class43) var4.next();
        } while (!var5.method181(arg0, arg1, arg2));
        return var5.method179(arg0, arg1, arg2);
    }

    @ObfuscatedName("at.v(IIB)Lhg;")
    public class213 method250(int arg0, int arg1) {
        Iterator var3 = this.field473.iterator();
        class43 var4;
        do {
            if (!var3.hasNext()) {
                return null;
            }
            var4 = (class43) var3.next();
        } while (!var4.method182(arg0, arg1));
        return var4.method190(arg0, arg1);
    }

    @ObfuscatedName("at.p(B)V")
    public void method279() {
        Iterator var1 = this.field473.iterator();
        while (var1.hasNext()) {
            class43 var2 = (class43) var1.next();
            var2.method180(this);
        }
    }

    @ObfuscatedName("at.e(B)I")
    public int method252() {
        return this.field468;
    }

    @ObfuscatedName("at.d(I)Z")
    public boolean method253() {
        return this.field472;
    }

    @ObfuscatedName("at.x(I)Ljava/lang/String;")
    public String method244() {
        return this.field463;
    }

    @ObfuscatedName("at.u(I)Ljava/lang/String;")
    public String method276() {
        return this.field471;
    }

    @ObfuscatedName("at.i(I)I")
    public int method256() {
        return this.field464;
    }

    @ObfuscatedName("at.h(I)I")
    public int method270() {
        return this.field466;
    }

    @ObfuscatedName("at.b(B)I")
    public int method258() {
        return this.field465;
    }

    @ObfuscatedName("at.j(B)I")
    public int method259() {
        return this.field469;
    }

    @ObfuscatedName("at.y(I)I")
    public int method260() {
        return this.field470;
    }

    @ObfuscatedName("at.c(I)I")
    public int method261() {
        return this.field462;
    }

    @ObfuscatedName("at.r(I)I")
    public int method262() {
        return this.field467.field2602;
    }

    @ObfuscatedName("at.m(I)I")
    public int method313() {
        return this.field467.field2601;
    }

    @ObfuscatedName("at.l(B)I")
    public int method246() {
        return this.field467.field2603;
    }

    @ObfuscatedName("at.f(I)Lhg;")
    public class213 method265() {
        return new class213(this.field467);
    }
}
